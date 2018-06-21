/*
               File: wp_completatransaccion_impl
        Description: WP_Completa Transaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:20.99
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

public final  class wp_completatransaccion_impl extends GXDataArea
{
   public wp_completatransaccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_completatransaccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_completatransaccion_impl.class ));
   }

   public wp_completatransaccion_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTran_ModuloOrigen = new HTMLChoice();
      cmbTran_ModuloDestino = new HTMLChoice();
      cmbTran_Detalle = new HTMLChoice();
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
            A46Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
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
      pa652( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start652( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414202115");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_completatransaccion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_DETALLE", GXutil.rtrim( AV24Tran_detalle));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV25Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND_E_S", AV18Ind_E_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND_TIPO", GXutil.rtrim( AV19Ind_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOENTRA", GXutil.rtrim( AV29Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TABLARESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTERESPONSABILI", GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONDESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Tran_RegionDescripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTODESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Tran_CentroCostoDescripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9AlmaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODEGAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BodegaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONDESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Tran_RegionDescripcionDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTODESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Tran_CentroCostoDescripcionDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMADESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8AlmaDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODEDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BodeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Area_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Curs_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( "", A720Tran_FechaResponsabilidad));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONDESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Tran_RegionDescripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTODESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Tran_CentroCostoDescripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9AlmaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODEGAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BodegaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONDESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Tran_RegionDescripcionDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTODESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Tran_CentroCostoDescripcionDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMADESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8AlmaDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODEDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BodeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Area_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Curs_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( "", A720Tran_FechaResponsabilidad));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WP_CompletaTransaccion" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format(A515Tran_FechaIngreso, "99/99/99") ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV10Area_Codigo, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11Area_Descripcion, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV16Curs_Codigo, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17Curs_Descripcion, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A524Tran_Detalle, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wp_completatransaccion:[SendSecurityCheck]"+forbiddenHiddens);
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
         we652( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt652( ) ;
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
      return formatLink("com.orions2.wp_completatransaccion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WP_CompletaTransaccion" ;
   }

   public String getPgmdesc( )
   {
      return "WP_Completa Transaccion" ;
   }

   public void wb650( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Transacción", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WP_CompletaTransaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ConsecutivoCC_Internalname, "Número de Transacción", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTran_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ConsecutivoCC_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRegistro_Internalname, "Fecha de Registro", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRegistro_Internalname, localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_CompletaTransaccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioCodigo_Internalname, "Usuario de creación", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioCodigo_Internalname, A417Tran_UsuarioCodigo, GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioCodigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_regiondescripcion_Internalname, "Región", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_regiondescripcion_Internalname, AV27Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( AV27Tran_RegionDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_regiondescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_regiondescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_centrocostodescripcion_Internalname, "Centro de costo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_centrocostodescripcion_Internalname, AV21Tran_CentroCostoDescripcion, GXutil.rtrim( localUtil.format( AV21Tran_CentroCostoDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_centrocostodescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_centrocostodescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Movimiento", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_DescripcionMovimiento_Internalname, A381Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( A381Tran_DescripcionMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_DescripcionMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_DescripcionMovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 col-lg-12 col-lg-offset-0", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Datos orígen", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_CompletaTransaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_ModuloOrigen.getInternalname(), "Módulo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_ModuloOrigen, cmbTran_ModuloOrigen.getInternalname(), GXutil.rtrim( A110Tran_ModuloOrigen), 1, cmbTran_ModuloOrigen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_ModuloOrigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_WP_CompletaTransaccion.htm");
         cmbTran_ModuloOrigen.setValue( GXutil.rtrim( A110Tran_ModuloOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_ModuloOrigen.getInternalname(), "Values", cmbTran_ModuloOrigen.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlmaorigen_Internalname, "Almacén", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlmaorigen_Internalname, AV9AlmaOrigen, GXutil.rtrim( localUtil.format( AV9AlmaOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlmaorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlmaorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBodegaorigen_Internalname, "Bodega", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBodegaorigen_Internalname, AV15BodegaOrigen, GXutil.rtrim( localUtil.format( AV15BodegaOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBodegaorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBodegaorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, "Cuentadante", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaCuentadanteOrigen_Visible, edtTran_CedulaCuentadanteOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 col-lg-5 col-lg-offset-0", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteOrigen_Internalname, A384Tran_NombCuentadanteOrigen, GXutil.rtrim( localUtil.format( A384Tran_NombCuentadanteOrigen, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombCuentadanteOrigen_Visible, edtTran_NombCuentadanteOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaProveedor_Internalname, "Nit proveedor", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaProveedor_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaProveedor_Visible, edtTran_CedulaProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreProveedor_Internalname, "Nombre", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreProveedor_Internalname, A575Tran_NombreProveedor, GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreProveedor_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreProveedor_Visible, edtTran_NombreProveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Datos destino", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_CompletaTransaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_regiondescripciondestino_Internalname, "Región", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_regiondescripciondestino_Internalname, AV28Tran_RegionDescripcionDestino, GXutil.rtrim( localUtil.format( AV28Tran_RegionDescripcionDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_regiondescripciondestino_Jsonclick, 0, "Attribute", "", "", "", edtavTran_regiondescripciondestino_Visible, edtavTran_regiondescripciondestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_centrocostodescripciondestino_Internalname, "Centro de Costo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_centrocostodescripciondestino_Internalname, AV22Tran_CentroCostoDescripcionDestino, GXutil.rtrim( localUtil.format( AV22Tran_CentroCostoDescripcionDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_centrocostodescripciondestino_Jsonclick, 0, "Attribute", "", "", "", edtavTran_centrocostodescripciondestino_Visible, edtavTran_centrocostodescripciondestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_ModuloDestino.getInternalname(), "Módulo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_ModuloDestino, cmbTran_ModuloDestino.getInternalname(), GXutil.rtrim( A385Tran_ModuloDestino), 1, cmbTran_ModuloDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_ModuloDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_WP_CompletaTransaccion.htm");
         cmbTran_ModuloDestino.setValue( GXutil.rtrim( A385Tran_ModuloDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_ModuloDestino.getInternalname(), "Values", cmbTran_ModuloDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlmadestino_Internalname, "Almacén", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlmadestino_Internalname, AV8AlmaDestino, GXutil.rtrim( localUtil.format( AV8AlmaDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlmadestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlmadestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBodedestino_Internalname, "Bodega", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBodedestino_Internalname, AV14BodeDestino, GXutil.rtrim( localUtil.format( AV14BodeDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBodedestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBodedestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 col-lg-4 col-lg-offset-0", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaCuentadanteDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteDestino_Internalname, A389Tran_NombCuentadanteDestino, GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombCuentadanteDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreIngreso_Internalname, "Tipo de Ingreso", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreIngreso_Internalname, A672Tran_NombreIngreso, GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreIngreso_Visible, edtTran_NombreIngreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroIngreso_Internalname, "Número", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroIngreso_Internalname, GXutil.rtrim( A514Tran_NumeroIngreso), GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_NumeroIngreso_Visible, edtTran_NumeroIngreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaIngreso_Internalname, "Fecha", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaIngreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaIngreso_Internalname, localUtil.format(A515Tran_FechaIngreso, "99/99/99"), localUtil.format( A515Tran_FechaIngreso, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_FechaIngreso_Visible, edtTran_FechaIngreso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaIngreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTran_FechaIngreso_Visible==0)||(edtTran_FechaIngreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_CompletaTransaccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_codigo_Internalname, "Areadante", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_codigo_Internalname, AV10Area_Codigo, GXutil.rtrim( localUtil.format( AV10Area_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavArea_codigo_Visible, edtavArea_codigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_descripcion_Internalname, AV11Area_Descripcion, GXutil.rtrim( localUtil.format( AV11Area_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavArea_descripcion_Visible, edtavArea_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_codigo_Internalname, "Curso", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_codigo_Internalname, AV16Curs_Codigo, GXutil.rtrim( localUtil.format( AV16Curs_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_codigo_Visible, edtavCurs_codigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_descripcion_Internalname, AV17Curs_Descripcion, GXutil.rtrim( localUtil.format( AV17Curs_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_descripcion_Visible, edtavCurs_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_Detalle.getInternalname(), "Ingresar el detalle masivo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_Detalle, cmbTran_Detalle.getInternalname(), GXutil.rtrim( A524Tran_Detalle), 1, cmbTran_Detalle.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTran_Detalle.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_WP_CompletaTransaccion.htm");
         cmbTran_Detalle.setValue( GXutil.rtrim( A524Tran_Detalle) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_Detalle.getInternalname(), "Values", cmbTran_Detalle.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoEntra.getInternalname(), "Tipo de entrada devolutivo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoEntra, cmbTran_TipoEntra.getInternalname(), GXutil.rtrim( A527Tran_TipoEntra), 1, cmbTran_TipoEntra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbTran_TipoEntra.getVisible(), cmbTran_TipoEntra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_WP_CompletaTransaccion.htm");
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaResponsabilidad_Internalname, "Cuenta de Responsabilidad", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaResponsabilidad_Visible, edtTran_CedulaResponsabilidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, A721Tran_NombreCuentadanteResponsa, GXutil.rtrim( localUtil.format( A721Tran_NombreCuentadanteResponsa, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreCuentadanteResponsa_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreCuentadanteResponsa_Visible, edtTran_NombreCuentadanteResponsa_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TransaccResponsabilidad_Internalname, "Transaccion", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TransaccResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")), ((edtTran_TransaccResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TransaccResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_TransaccResponsabilidad_Visible, edtTran_TransaccResponsabilidad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaResponsabilidad_Internalname, "Fecha", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaResponsabilidad_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaResponsabilidad_Internalname, localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"), localUtil.format( A720Tran_FechaResponsabilidad, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_FechaResponsabilidad_Visible, edtTran_FechaResponsabilidad_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaResponsabilidad_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTran_FechaResponsabilidad_Visible==0)||(edtTran_FechaResponsabilidad_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_CompletaTransaccion.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Observaciones_Internalname, "Observaciones", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_Observaciones_Internalname, A416Tran_Observaciones, "", "", (short)(0), 1, edtTran_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_CompletaTransaccion.htm");
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
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCompletar_Internalname, "", "Completar", bttCompletar_Jsonclick, 5, "Completar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'COMPLETAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_CompletaTransaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCancelar_Internalname, "", "Cancelar", bttCancelar_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_CompletaTransaccion.htm");
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

   public void start652( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "WP_Completa Transaccion", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup650( ) ;
   }

   public void ws652( )
   {
      start652( ) ;
      evt652( ) ;
   }

   public void evt652( )
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
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e11652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'COMPLETAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Completar' */
                           e12652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e13652 ();
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we652( )
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

   public void pa652( )
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
         cmbTran_ModuloOrigen.setName( "TRAN_MODULOORIGEN" );
         cmbTran_ModuloOrigen.setWebtags( "" );
         cmbTran_ModuloOrigen.addItem("", "", (short)(0));
         cmbTran_ModuloOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTran_ModuloOrigen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTran_ModuloOrigen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTran_ModuloOrigen.getItemCount() > 0 )
         {
            A110Tran_ModuloOrigen = cmbTran_ModuloOrigen.getValidValue(A110Tran_ModuloOrigen) ;
            httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         }
         cmbTran_ModuloDestino.setName( "TRAN_MODULODESTINO" );
         cmbTran_ModuloDestino.setWebtags( "" );
         cmbTran_ModuloDestino.addItem("", "", (short)(0));
         cmbTran_ModuloDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTran_ModuloDestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTran_ModuloDestino.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTran_ModuloDestino.getItemCount() > 0 )
         {
            A385Tran_ModuloDestino = cmbTran_ModuloDestino.getValidValue(A385Tran_ModuloDestino) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         }
         cmbTran_Detalle.setName( "TRAN_DETALLE" );
         cmbTran_Detalle.setWebtags( "" );
         cmbTran_Detalle.addItem("N", "NO", (short)(0));
         cmbTran_Detalle.addItem("S", "SI", (short)(0));
         if ( cmbTran_Detalle.getItemCount() > 0 )
         {
            A524Tran_Detalle = cmbTran_Detalle.getValidValue(A524Tran_Detalle) ;
            n524Tran_Detalle = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         }
         cmbTran_TipoEntra.setName( "TRAN_TIPOENTRA" );
         cmbTran_TipoEntra.setWebtags( "" );
         cmbTran_TipoEntra.addItem("NA", "Seleccionar...", (short)(0));
         cmbTran_TipoEntra.addItem("UEUP", "Un elemento Un Padre", (short)(0));
         cmbTran_TipoEntra.addItem("NEUP", "N elementos Un Padre", (short)(0));
         cmbTran_TipoEntra.addItem("ELSP", "Elementos sin Padre", (short)(0));
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
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
            GX_FocusControl = edtavTran_regiondescripcion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbTran_ModuloOrigen.getItemCount() > 0 )
      {
         A110Tran_ModuloOrigen = cmbTran_ModuloOrigen.getValidValue(A110Tran_ModuloOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      }
      if ( cmbTran_ModuloDestino.getItemCount() > 0 )
      {
         A385Tran_ModuloDestino = cmbTran_ModuloDestino.getValidValue(A385Tran_ModuloDestino) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      }
      if ( cmbTran_Detalle.getItemCount() > 0 )
      {
         A524Tran_Detalle = cmbTran_Detalle.getValidValue(A524Tran_Detalle) ;
         n524Tran_Detalle = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      }
      if ( cmbTran_TipoEntra.getItemCount() > 0 )
      {
         A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf652( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_regiondescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripcion_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripcion_Enabled, 5, 0)), true);
      edtavAlmaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmaorigen_Enabled, 5, 0)), true);
      edtavBodegaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBodegaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBodegaorigen_Enabled, 5, 0)), true);
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Enabled, 5, 0)), true);
      edtavAlmadestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmadestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmadestino_Enabled, 5, 0)), true);
      edtavBodedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBodedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBodedestino_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
   }

   public void rf652( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00652 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A416Tran_Observaciones = H00652_A416Tran_Observaciones[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
            n416Tran_Observaciones = H00652_n416Tran_Observaciones[0] ;
            A47Tran_UsuarioId = H00652_A47Tran_UsuarioId[0] ;
            n47Tran_UsuarioId = H00652_n47Tran_UsuarioId[0] ;
            A50Tran_CentroCostoIdDestino = H00652_A50Tran_CentroCostoIdDestino[0] ;
            n50Tran_CentroCostoIdDestino = H00652_n50Tran_CentroCostoIdDestino[0] ;
            A57Tran_RegionId = H00652_A57Tran_RegionId[0] ;
            n57Tran_RegionId = H00652_n57Tran_RegionId[0] ;
            A518Tran_RegionIdDestino = H00652_A518Tran_RegionIdDestino[0] ;
            n518Tran_RegionIdDestino = H00652_n518Tran_RegionIdDestino[0] ;
            A51Tran_IdCuentadanteOrigen = H00652_A51Tran_IdCuentadanteOrigen[0] ;
            n51Tran_IdCuentadanteOrigen = H00652_n51Tran_IdCuentadanteOrigen[0] ;
            A53Tran_IdProveedor = H00652_A53Tran_IdProveedor[0] ;
            n53Tran_IdProveedor = H00652_n53Tran_IdProveedor[0] ;
            A52Tran_IdCuentadanteDestino = H00652_A52Tran_IdCuentadanteDestino[0] ;
            n52Tran_IdCuentadanteDestino = H00652_n52Tran_IdCuentadanteDestino[0] ;
            A54Tran_TipoIngreso = H00652_A54Tran_TipoIngreso[0] ;
            n54Tran_TipoIngreso = H00652_n54Tran_TipoIngreso[0] ;
            A422Tran_RegionDescripcion = H00652_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H00652_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H00652_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H00652_n421Tran_RegionCodigo[0] ;
            A48Tran_CentroCostoId = H00652_A48Tran_CentroCostoId[0] ;
            A420Tran_CentroCostoDescripcion = H00652_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H00652_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H00652_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H00652_n419Tran_CentroCostoCodigo[0] ;
            A110Tran_ModuloOrigen = H00652_A110Tran_ModuloOrigen[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
            A109Tran_CodAlmaOrigen = H00652_A109Tran_CodAlmaOrigen[0] ;
            A112Tran_CodBodeOrigen = H00652_A112Tran_CodBodeOrigen[0] ;
            A481Tran_IndE_S = H00652_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H00652_n481Tran_IndE_S[0] ;
            A482Tran_TipoElemento = H00652_A482Tran_TipoElemento[0] ;
            A385Tran_ModuloDestino = H00652_A385Tran_ModuloDestino[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
            A111Tran_CodAlmaDestino = H00652_A111Tran_CodAlmaDestino[0] ;
            A387Tran_CodBodeDestino = H00652_A387Tran_CodBodeDestino[0] ;
            A407Tran_AreadanteCodigo = H00652_A407Tran_AreadanteCodigo[0] ;
            n407Tran_AreadanteCodigo = H00652_n407Tran_AreadanteCodigo[0] ;
            A408Tran_CursoCodigo = H00652_A408Tran_CursoCodigo[0] ;
            n408Tran_CursoCodigo = H00652_n408Tran_CursoCodigo[0] ;
            A524Tran_Detalle = H00652_A524Tran_Detalle[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
            n524Tran_Detalle = H00652_n524Tran_Detalle[0] ;
            A527Tran_TipoEntra = H00652_A527Tran_TipoEntra[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
            n527Tran_TipoEntra = H00652_n527Tran_TipoEntra[0] ;
            A520Tran_RegionDescripcionDestino = H00652_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H00652_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H00652_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H00652_n519Tran_RegionCodigoDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H00652_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H00652_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H00652_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H00652_n516Tran_CentroCostoCodigoDestino[0] ;
            A708Tran_SolicitaRegionDestino = H00652_A708Tran_SolicitaRegionDestino[0] ;
            n708Tran_SolicitaRegionDestino = H00652_n708Tran_SolicitaRegionDestino[0] ;
            A707Tran_SolicitaCCDestino = H00652_A707Tran_SolicitaCCDestino[0] ;
            n707Tran_SolicitaCCDestino = H00652_n707Tran_SolicitaCCDestino[0] ;
            A56Tran_IdCuentadanteResponsabili = H00652_A56Tran_IdCuentadanteResponsabili[0] ;
            n56Tran_IdCuentadanteResponsabili = H00652_n56Tran_IdCuentadanteResponsabili[0] ;
            A758Tran_TablaResponsabilidad = H00652_A758Tran_TablaResponsabilidad[0] ;
            n758Tran_TablaResponsabilidad = H00652_n758Tran_TablaResponsabilidad[0] ;
            A720Tran_FechaResponsabilidad = H00652_A720Tran_FechaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( "", A720Tran_FechaResponsabilidad));
            n720Tran_FechaResponsabilidad = H00652_n720Tran_FechaResponsabilidad[0] ;
            A719Tran_TransaccResponsabilidad = H00652_A719Tran_TransaccResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
            n719Tran_TransaccResponsabilidad = H00652_n719Tran_TransaccResponsabilidad[0] ;
            A721Tran_NombreCuentadanteResponsa = H00652_A721Tran_NombreCuentadanteResponsa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
            n721Tran_NombreCuentadanteResponsa = H00652_n721Tran_NombreCuentadanteResponsa[0] ;
            A759Tran_CedulaResponsabilidad = H00652_A759Tran_CedulaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
            n759Tran_CedulaResponsabilidad = H00652_n759Tran_CedulaResponsabilidad[0] ;
            A515Tran_FechaIngreso = H00652_A515Tran_FechaIngreso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
            n515Tran_FechaIngreso = H00652_n515Tran_FechaIngreso[0] ;
            A514Tran_NumeroIngreso = H00652_A514Tran_NumeroIngreso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
            n514Tran_NumeroIngreso = H00652_n514Tran_NumeroIngreso[0] ;
            A672Tran_NombreIngreso = H00652_A672Tran_NombreIngreso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
            n672Tran_NombreIngreso = H00652_n672Tran_NombreIngreso[0] ;
            A389Tran_NombCuentadanteDestino = H00652_A389Tran_NombCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
            n389Tran_NombCuentadanteDestino = H00652_n389Tran_NombCuentadanteDestino[0] ;
            A704Tran_CedulaCuentadanteDestino = H00652_A704Tran_CedulaCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
            n704Tran_CedulaCuentadanteDestino = H00652_n704Tran_CedulaCuentadanteDestino[0] ;
            A575Tran_NombreProveedor = H00652_A575Tran_NombreProveedor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
            n575Tran_NombreProveedor = H00652_n575Tran_NombreProveedor[0] ;
            A703Tran_CedulaProveedor = H00652_A703Tran_CedulaProveedor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
            n703Tran_CedulaProveedor = H00652_n703Tran_CedulaProveedor[0] ;
            A384Tran_NombCuentadanteOrigen = H00652_A384Tran_NombCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
            n384Tran_NombCuentadanteOrigen = H00652_n384Tran_NombCuentadanteOrigen[0] ;
            A702Tran_CedulaCuentadanteOrigen = H00652_A702Tran_CedulaCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
            n702Tran_CedulaCuentadanteOrigen = H00652_n702Tran_CedulaCuentadanteOrigen[0] ;
            A381Tran_DescripcionMovimiento = H00652_A381Tran_DescripcionMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
            n381Tran_DescripcionMovimiento = H00652_n381Tran_DescripcionMovimiento[0] ;
            A49Tran_CodigoMovimiento = H00652_A49Tran_CodigoMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
            A417Tran_UsuarioCodigo = H00652_A417Tran_UsuarioCodigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
            n417Tran_UsuarioCodigo = H00652_n417Tran_UsuarioCodigo[0] ;
            A55Tran_FechaRegistro = H00652_A55Tran_FechaRegistro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
            A513Tran_ConsecutivoCC = H00652_A513Tran_ConsecutivoCC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
            n513Tran_ConsecutivoCC = H00652_n513Tran_ConsecutivoCC[0] ;
            A417Tran_UsuarioCodigo = H00652_A417Tran_UsuarioCodigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
            n417Tran_UsuarioCodigo = H00652_n417Tran_UsuarioCodigo[0] ;
            A517Tran_CentroCostoDescripcionDes = H00652_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H00652_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H00652_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H00652_n516Tran_CentroCostoCodigoDestino[0] ;
            A422Tran_RegionDescripcion = H00652_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H00652_n422Tran_RegionDescripcion[0] ;
            A421Tran_RegionCodigo = H00652_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H00652_n421Tran_RegionCodigo[0] ;
            A520Tran_RegionDescripcionDestino = H00652_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H00652_n520Tran_RegionDescripcionDestino[0] ;
            A519Tran_RegionCodigoDestino = H00652_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H00652_n519Tran_RegionCodigoDestino[0] ;
            A384Tran_NombCuentadanteOrigen = H00652_A384Tran_NombCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
            n384Tran_NombCuentadanteOrigen = H00652_n384Tran_NombCuentadanteOrigen[0] ;
            A702Tran_CedulaCuentadanteOrigen = H00652_A702Tran_CedulaCuentadanteOrigen[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
            n702Tran_CedulaCuentadanteOrigen = H00652_n702Tran_CedulaCuentadanteOrigen[0] ;
            A575Tran_NombreProveedor = H00652_A575Tran_NombreProveedor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
            n575Tran_NombreProveedor = H00652_n575Tran_NombreProveedor[0] ;
            A703Tran_CedulaProveedor = H00652_A703Tran_CedulaProveedor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
            n703Tran_CedulaProveedor = H00652_n703Tran_CedulaProveedor[0] ;
            A389Tran_NombCuentadanteDestino = H00652_A389Tran_NombCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
            n389Tran_NombCuentadanteDestino = H00652_n389Tran_NombCuentadanteDestino[0] ;
            A704Tran_CedulaCuentadanteDestino = H00652_A704Tran_CedulaCuentadanteDestino[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
            n704Tran_CedulaCuentadanteDestino = H00652_n704Tran_CedulaCuentadanteDestino[0] ;
            A672Tran_NombreIngreso = H00652_A672Tran_NombreIngreso[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
            n672Tran_NombreIngreso = H00652_n672Tran_NombreIngreso[0] ;
            A420Tran_CentroCostoDescripcion = H00652_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H00652_n420Tran_CentroCostoDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H00652_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H00652_n419Tran_CentroCostoCodigo[0] ;
            A721Tran_NombreCuentadanteResponsa = H00652_A721Tran_NombreCuentadanteResponsa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
            n721Tran_NombreCuentadanteResponsa = H00652_n721Tran_NombreCuentadanteResponsa[0] ;
            A759Tran_CedulaResponsabilidad = H00652_A759Tran_CedulaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
            n759Tran_CedulaResponsabilidad = H00652_n759Tran_CedulaResponsabilidad[0] ;
            A708Tran_SolicitaRegionDestino = H00652_A708Tran_SolicitaRegionDestino[0] ;
            n708Tran_SolicitaRegionDestino = H00652_n708Tran_SolicitaRegionDestino[0] ;
            A707Tran_SolicitaCCDestino = H00652_A707Tran_SolicitaCCDestino[0] ;
            n707Tran_SolicitaCCDestino = H00652_n707Tran_SolicitaCCDestino[0] ;
            A381Tran_DescripcionMovimiento = H00652_A381Tran_DescripcionMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
            n381Tran_DescripcionMovimiento = H00652_n381Tran_DescripcionMovimiento[0] ;
            /* Execute user event: Load */
            e11652 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         wb650( ) ;
      }
   }

   public void strup650( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTran_regiondescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripcion_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripcion_Enabled, 5, 0)), true);
      edtavAlmaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmaorigen_Enabled, 5, 0)), true);
      edtavBodegaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBodegaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBodegaorigen_Enabled, 5, 0)), true);
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Enabled, 5, 0)), true);
      edtavAlmadestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmadestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlmadestino_Enabled, 5, 0)), true);
      edtavBodedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBodedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBodedestino_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
         n513Tran_ConsecutivoCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
         A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
         n417Tran_UsuarioCodigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         AV27Tran_RegionDescripcion = httpContext.cgiGet( edtavTran_regiondescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_RegionDescripcion", AV27Tran_RegionDescripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONDESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Tran_RegionDescripcion, ""))));
         AV21Tran_CentroCostoDescripcion = httpContext.cgiGet( edtavTran_centrocostodescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Tran_CentroCostoDescripcion", AV21Tran_CentroCostoDescripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTODESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Tran_CentroCostoDescripcion, ""))));
         A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
         A381Tran_DescripcionMovimiento = httpContext.cgiGet( edtTran_DescripcionMovimiento_Internalname) ;
         n381Tran_DescripcionMovimiento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         cmbTran_ModuloOrigen.setValue( httpContext.cgiGet( cmbTran_ModuloOrigen.getInternalname()) );
         A110Tran_ModuloOrigen = httpContext.cgiGet( cmbTran_ModuloOrigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         AV9AlmaOrigen = httpContext.cgiGet( edtavAlmaorigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaOrigen", AV9AlmaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9AlmaOrigen, ""))));
         AV15BodegaOrigen = httpContext.cgiGet( edtavBodegaorigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BodegaOrigen", AV15BodegaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODEGAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BodegaOrigen, ""))));
         A702Tran_CedulaCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteOrigen_Internalname), ",", ".") ;
         n702Tran_CedulaCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         A384Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteOrigen_Internalname)) ;
         n384Tran_NombCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         A703Tran_CedulaProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaProveedor_Internalname), ",", ".") ;
         n703Tran_CedulaProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
         n575Tran_NombreProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         AV28Tran_RegionDescripcionDestino = httpContext.cgiGet( edtavTran_regiondescripciondestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_RegionDescripcionDestino", AV28Tran_RegionDescripcionDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONDESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Tran_RegionDescripcionDestino, ""))));
         AV22Tran_CentroCostoDescripcionDestino = httpContext.cgiGet( edtavTran_centrocostodescripciondestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Tran_CentroCostoDescripcionDestino", AV22Tran_CentroCostoDescripcionDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTODESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Tran_CentroCostoDescripcionDestino, ""))));
         cmbTran_ModuloDestino.setValue( httpContext.cgiGet( cmbTran_ModuloDestino.getInternalname()) );
         A385Tran_ModuloDestino = httpContext.cgiGet( cmbTran_ModuloDestino.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         AV8AlmaDestino = httpContext.cgiGet( edtavAlmadestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaDestino", AV8AlmaDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMADESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8AlmaDestino, ""))));
         AV14BodeDestino = httpContext.cgiGet( edtavBodedestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BodeDestino", AV14BodeDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODEDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BodeDestino, ""))));
         A704Tran_CedulaCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteDestino_Internalname), ",", ".") ;
         n704Tran_CedulaCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
         n389Tran_NombCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
         n672Tran_NombreIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
         n514Tran_NumeroIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         A515Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 0)) ;
         n515Tran_FechaIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
         AV10Area_Codigo = httpContext.cgiGet( edtavArea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Area_Codigo", AV10Area_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Area_Codigo, ""))));
         AV11Area_Descripcion = httpContext.cgiGet( edtavArea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Area_Descripcion", AV11Area_Descripcion);
         AV16Curs_Codigo = httpContext.cgiGet( edtavCurs_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Curs_Codigo", AV16Curs_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCURS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Curs_Codigo, ""))));
         AV17Curs_Descripcion = httpContext.cgiGet( edtavCurs_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Descripcion", AV17Curs_Descripcion);
         cmbTran_Detalle.setValue( httpContext.cgiGet( cmbTran_Detalle.getInternalname()) );
         A524Tran_Detalle = httpContext.cgiGet( cmbTran_Detalle.getInternalname()) ;
         n524Tran_Detalle = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
         A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         A759Tran_CedulaResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaResponsabilidad_Internalname), ",", ".") ;
         n759Tran_CedulaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         A721Tran_NombreCuentadanteResponsa = GXutil.upper( httpContext.cgiGet( edtTran_NombreCuentadanteResponsa_Internalname)) ;
         n721Tran_NombreCuentadanteResponsa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         A719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") ;
         n719Tran_TransaccResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
         A720Tran_FechaResponsabilidad = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), 0)) ;
         n720Tran_FechaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( "", A720Tran_FechaResponsabilidad));
         A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
         n416Tran_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
         /* Read saved values. */
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WP_CompletaTransaccion" ;
         A110Tran_ModuloOrigen = httpContext.cgiGet( cmbTran_ModuloOrigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, "")) ;
         A385Tran_ModuloDestino = httpContext.cgiGet( cmbTran_ModuloDestino.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, "")) ;
         A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
         n514Tran_NumeroIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")) ;
         A515Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 0)) ;
         n515Tran_FechaIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
         forbiddenHiddens = forbiddenHiddens + localUtil.format(A515Tran_FechaIngreso, "99/99/99") ;
         AV10Area_Codigo = httpContext.cgiGet( edtavArea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Area_Codigo", AV10Area_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Area_Codigo, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV10Area_Codigo, "")) ;
         AV11Area_Descripcion = httpContext.cgiGet( edtavArea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Area_Descripcion", AV11Area_Descripcion);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11Area_Descripcion, "")) ;
         AV16Curs_Codigo = httpContext.cgiGet( edtavCurs_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Curs_Codigo", AV16Curs_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCURS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Curs_Codigo, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV16Curs_Codigo, "")) ;
         AV17Curs_Descripcion = httpContext.cgiGet( edtavCurs_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Descripcion", AV17Curs_Descripcion);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17Curs_Descripcion, "")) ;
         A524Tran_Detalle = httpContext.cgiGet( cmbTran_Detalle.getInternalname()) ;
         n524Tran_Detalle = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A524Tran_Detalle, "")) ;
         A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wp_completatransaccion:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e11652( )
   {
      /* Load Routine */
      while ( (pr_default.getStatus(0) != 101) && ( H00652_A46Tran_Id[0] == A46Tran_Id ) )
      {
         A416Tran_Observaciones = H00652_A416Tran_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
         n416Tran_Observaciones = H00652_n416Tran_Observaciones[0] ;
         A47Tran_UsuarioId = H00652_A47Tran_UsuarioId[0] ;
         n47Tran_UsuarioId = H00652_n47Tran_UsuarioId[0] ;
         A50Tran_CentroCostoIdDestino = H00652_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = H00652_n50Tran_CentroCostoIdDestino[0] ;
         A57Tran_RegionId = H00652_A57Tran_RegionId[0] ;
         n57Tran_RegionId = H00652_n57Tran_RegionId[0] ;
         A518Tran_RegionIdDestino = H00652_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = H00652_n518Tran_RegionIdDestino[0] ;
         A51Tran_IdCuentadanteOrigen = H00652_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = H00652_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = H00652_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = H00652_n53Tran_IdProveedor[0] ;
         A52Tran_IdCuentadanteDestino = H00652_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = H00652_n52Tran_IdCuentadanteDestino[0] ;
         A54Tran_TipoIngreso = H00652_A54Tran_TipoIngreso[0] ;
         n54Tran_TipoIngreso = H00652_n54Tran_TipoIngreso[0] ;
         A422Tran_RegionDescripcion = H00652_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = H00652_n422Tran_RegionDescripcion[0] ;
         A421Tran_RegionCodigo = H00652_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = H00652_n421Tran_RegionCodigo[0] ;
         A48Tran_CentroCostoId = H00652_A48Tran_CentroCostoId[0] ;
         A420Tran_CentroCostoDescripcion = H00652_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = H00652_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = H00652_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H00652_n419Tran_CentroCostoCodigo[0] ;
         A110Tran_ModuloOrigen = H00652_A110Tran_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         A109Tran_CodAlmaOrigen = H00652_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = H00652_A112Tran_CodBodeOrigen[0] ;
         A481Tran_IndE_S = H00652_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H00652_n481Tran_IndE_S[0] ;
         A482Tran_TipoElemento = H00652_A482Tran_TipoElemento[0] ;
         A385Tran_ModuloDestino = H00652_A385Tran_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         A111Tran_CodAlmaDestino = H00652_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = H00652_A387Tran_CodBodeDestino[0] ;
         A407Tran_AreadanteCodigo = H00652_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = H00652_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = H00652_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = H00652_n408Tran_CursoCodigo[0] ;
         A524Tran_Detalle = H00652_A524Tran_Detalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         n524Tran_Detalle = H00652_n524Tran_Detalle[0] ;
         A527Tran_TipoEntra = H00652_A527Tran_TipoEntra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         n527Tran_TipoEntra = H00652_n527Tran_TipoEntra[0] ;
         A520Tran_RegionDescripcionDestino = H00652_A520Tran_RegionDescripcionDestino[0] ;
         n520Tran_RegionDescripcionDestino = H00652_n520Tran_RegionDescripcionDestino[0] ;
         A519Tran_RegionCodigoDestino = H00652_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = H00652_n519Tran_RegionCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = H00652_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = H00652_n517Tran_CentroCostoDescripcionDes[0] ;
         A516Tran_CentroCostoCodigoDestino = H00652_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = H00652_n516Tran_CentroCostoCodigoDestino[0] ;
         A56Tran_IdCuentadanteResponsabili = H00652_A56Tran_IdCuentadanteResponsabili[0] ;
         n56Tran_IdCuentadanteResponsabili = H00652_n56Tran_IdCuentadanteResponsabili[0] ;
         A758Tran_TablaResponsabilidad = H00652_A758Tran_TablaResponsabilidad[0] ;
         n758Tran_TablaResponsabilidad = H00652_n758Tran_TablaResponsabilidad[0] ;
         A720Tran_FechaResponsabilidad = H00652_A720Tran_FechaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARESPONSABILIDAD", getSecureSignedToken( "", A720Tran_FechaResponsabilidad));
         n720Tran_FechaResponsabilidad = H00652_n720Tran_FechaResponsabilidad[0] ;
         A719Tran_TransaccResponsabilidad = H00652_A719Tran_TransaccResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_TRANSACCRESPONSABILIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")));
         n719Tran_TransaccResponsabilidad = H00652_n719Tran_TransaccResponsabilidad[0] ;
         A515Tran_FechaIngreso = H00652_A515Tran_FechaIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAINGRESO", getSecureSignedToken( "", A515Tran_FechaIngreso));
         n515Tran_FechaIngreso = H00652_n515Tran_FechaIngreso[0] ;
         A514Tran_NumeroIngreso = H00652_A514Tran_NumeroIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         n514Tran_NumeroIngreso = H00652_n514Tran_NumeroIngreso[0] ;
         A49Tran_CodigoMovimiento = H00652_A49Tran_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
         A55Tran_FechaRegistro = H00652_A55Tran_FechaRegistro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         A513Tran_ConsecutivoCC = H00652_A513Tran_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
         n513Tran_ConsecutivoCC = H00652_n513Tran_ConsecutivoCC[0] ;
         A517Tran_CentroCostoDescripcionDes = H00652_A517Tran_CentroCostoDescripcionDes[0] ;
         n517Tran_CentroCostoDescripcionDes = H00652_n517Tran_CentroCostoDescripcionDes[0] ;
         A516Tran_CentroCostoCodigoDestino = H00652_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = H00652_n516Tran_CentroCostoCodigoDestino[0] ;
         A422Tran_RegionDescripcion = H00652_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = H00652_n422Tran_RegionDescripcion[0] ;
         A421Tran_RegionCodigo = H00652_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = H00652_n421Tran_RegionCodigo[0] ;
         A520Tran_RegionDescripcionDestino = H00652_A520Tran_RegionDescripcionDestino[0] ;
         n520Tran_RegionDescripcionDestino = H00652_n520Tran_RegionDescripcionDestino[0] ;
         A519Tran_RegionCodigoDestino = H00652_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = H00652_n519Tran_RegionCodigoDestino[0] ;
         A420Tran_CentroCostoDescripcion = H00652_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = H00652_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = H00652_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H00652_n419Tran_CentroCostoCodigo[0] ;
         AV25Tran_Id = A46Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Tran_Id", GXutil.ltrim( GXutil.str( AV25Tran_Id, 11, 0)));
         AV27Tran_RegionDescripcion = GXutil.str( A421Tran_RegionCodigo, 4, 0) + "-" + A422Tran_RegionDescripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_RegionDescripcion", AV27Tran_RegionDescripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONDESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Tran_RegionDescripcion, ""))));
         AV23Tran_CentroCostoId = A48Tran_CentroCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV23Tran_CentroCostoId, 11, 0)));
         AV21Tran_CentroCostoDescripcion = A419Tran_CentroCostoCodigo + "-" + A420Tran_CentroCostoDescripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Tran_CentroCostoDescripcion", AV21Tran_CentroCostoDescripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTODESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Tran_CentroCostoDescripcion, ""))));
         AV26Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
         AV5Alma_Modulo = A110Tran_ModuloOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Modulo", AV5Alma_Modulo);
         AV6Alma_Codigo = A109Tran_CodAlmaOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Codigo", AV6Alma_Codigo);
         /* Execute user subroutine: 'ALMACEN' */
         S113 ();
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV9AlmaOrigen = AV6Alma_Codigo + "-" + AV7Alma_descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlmaOrigen", AV9AlmaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9AlmaOrigen, ""))));
         AV12Bode_Codigo = A112Tran_CodBodeOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Bode_Codigo", AV12Bode_Codigo);
         /* Execute user subroutine: 'BODEGA' */
         S123 ();
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV15BodegaOrigen = AV12Bode_Codigo + "-" + AV13Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BodegaOrigen", AV15BodegaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODEGAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BodegaOrigen, ""))));
         AV18Ind_E_S = A481Tran_IndE_S ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Ind_E_S", AV18Ind_E_S);
         AV19Ind_Tipo = A482Tran_TipoElemento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Ind_Tipo", AV19Ind_Tipo);
         AV5Alma_Modulo = A385Tran_ModuloDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Modulo", AV5Alma_Modulo);
         AV6Alma_Codigo = A111Tran_CodAlmaDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Codigo", AV6Alma_Codigo);
         /* Execute user subroutine: 'ALMACEN' */
         S113 ();
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV8AlmaDestino = AV6Alma_Codigo + "-" + AV7Alma_descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlmaDestino", AV8AlmaDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMADESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8AlmaDestino, ""))));
         AV12Bode_Codigo = A387Tran_CodBodeDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Bode_Codigo", AV12Bode_Codigo);
         /* Execute user subroutine: 'BODEGA' */
         S123 ();
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV14BodeDestino = AV12Bode_Codigo + "-" + AV13Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BodeDestino", AV14BodeDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODEDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BodeDestino, ""))));
         AV10Area_Codigo = A407Tran_AreadanteCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Area_Codigo", AV10Area_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Area_Codigo, ""))));
         /* Execute user subroutine: 'AREADANTE' */
         S133 ();
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV16Curs_Codigo = A408Tran_CursoCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Curs_Codigo", AV16Curs_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCURS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Curs_Codigo, ""))));
         /* Execute user subroutine: 'CURSO' */
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV24Tran_detalle = A524Tran_Detalle ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_detalle", AV24Tran_detalle);
         AV29Tran_TipoEntra = A527Tran_TipoEntra ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tran_TipoEntra", AV29Tran_TipoEntra);
         AV28Tran_RegionDescripcionDestino = GXutil.str( A519Tran_RegionCodigoDestino, 4, 0) + "-" + A520Tran_RegionDescripcionDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_RegionDescripcionDestino", AV28Tran_RegionDescripcionDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONDESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28Tran_RegionDescripcionDestino, ""))));
         AV22Tran_CentroCostoDescripcionDestino = A516Tran_CentroCostoCodigoDestino + "-" + A517Tran_CentroCostoDescripcionDes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Tran_CentroCostoDescripcionDestino", AV22Tran_CentroCostoDescripcionDestino);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTODESCRIPCIONDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Tran_CentroCostoDescripcionDestino, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      if ( (0==A703Tran_CedulaProveedor) )
      {
         edtTran_CedulaProveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaProveedor_Visible, 5, 0)), true);
         edtTran_NombreProveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreProveedor_Visible, 5, 0)), true);
      }
      if ( (0==A702Tran_CedulaCuentadanteOrigen) )
      {
         edtTran_CedulaCuentadanteOrigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaCuentadanteOrigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaCuentadanteOrigen_Visible, 5, 0)), true);
         edtTran_NombCuentadanteOrigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombCuentadanteOrigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombCuentadanteOrigen_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A708Tran_SolicitaRegionDestino, "SI") != 0 )
      {
         edtavTran_regiondescripciondestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A707Tran_SolicitaCCDestino, "SI") != 0 )
      {
         edtavTran_centrocostodescripciondestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A672Tran_NombreIngreso)==0) )
      {
         edtTran_NombreIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreIngreso_Visible, 5, 0)), true);
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A515Tran_FechaIngreso) )
      {
         edtTran_FechaIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_FechaIngreso_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A514Tran_NumeroIngreso)==0) )
      {
         edtTran_NumeroIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NumeroIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NumeroIngreso_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A527Tran_TipoEntra, "NA") == 0 )
      {
         cmbTran_TipoEntra.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_TipoEntra.getVisible(), 5, 0)), true);
      }
      if ( (GXutil.strcmp("", AV10Area_Codigo)==0) )
      {
         edtavArea_codigo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
         edtavArea_descripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", AV16Curs_Codigo)==0) )
      {
         edtavCurs_codigo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
         edtavCurs_descripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
      }
      if ( (0==A56Tran_IdCuentadanteResponsabili) )
      {
         edtTran_CedulaResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaResponsabilidad_Visible, 5, 0)), true);
         edtTran_NombreCuentadanteResponsa_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreCuentadanteResponsa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreCuentadanteResponsa_Visible, 5, 0)), true);
         edtTran_TransaccResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_TransaccResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_TransaccResponsabilidad_Visible, 5, 0)), true);
         edtTran_FechaResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_FechaResponsabilidad_Visible, 5, 0)), true);
      }
   }

   public void S113( )
   {
      /* 'ALMACEN' Routine */
      AV7Alma_descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_descripcion", AV7Alma_descripcion);
      /* Using cursor H00653 */
      pr_default.execute(1, new Object[] {new Long(AV23Tran_CentroCostoId), AV5Alma_Modulo, AV6Alma_Codigo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A28Alma_Codigo = H00653_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H00653_A27Alma_Modulo[0] ;
         A1Cent_Id = H00653_A1Cent_Id[0] ;
         A252Alma_Descripcion = H00653_A252Alma_Descripcion[0] ;
         AV7Alma_descripcion = A252Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_descripcion", AV7Alma_descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S123( )
   {
      /* 'BODEGA' Routine */
      AV13Bode_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Bode_Descripcion", AV13Bode_Descripcion);
      /* Using cursor H00654 */
      pr_default.execute(2, new Object[] {new Long(AV23Tran_CentroCostoId), AV5Alma_Modulo, AV6Alma_Codigo, AV12Bode_Codigo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A31Bode_Codigo = H00654_A31Bode_Codigo[0] ;
         A28Alma_Codigo = H00654_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H00654_A27Alma_Modulo[0] ;
         A1Cent_Id = H00654_A1Cent_Id[0] ;
         A695BBode_Descripcion = H00654_A695BBode_Descripcion[0] ;
         AV13Bode_Descripcion = A695BBode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Bode_Descripcion", AV13Bode_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S133( )
   {
      /* 'AREADANTE' Routine */
      AV11Area_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Area_Descripcion", AV11Area_Descripcion);
      /* Using cursor H00655 */
      pr_default.execute(3, new Object[] {AV10Area_Codigo});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A59Area_Codigo = H00655_A59Area_Codigo[0] ;
         A452Area_Descripcion = H00655_A452Area_Descripcion[0] ;
         AV11Area_Descripcion = A452Area_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Area_Descripcion", AV11Area_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S143( )
   {
      /* 'CURSO' Routine */
      AV17Curs_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Descripcion", AV17Curs_Descripcion);
      /* Using cursor H00656 */
      pr_default.execute(4, new Object[] {AV16Curs_Codigo});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A73Curs_Codigo = H00656_A73Curs_Codigo[0] ;
         A424Curs_Descripcion = H00656_A424Curs_Descripcion[0] ;
         AV17Curs_Descripcion = A424Curs_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Descripcion", AV17Curs_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void e12652( )
   {
      /* 'Completar' Routine */
      if ( GXutil.strcmp(AV24Tran_detalle, "S") == 0 )
      {
         AV20Respuesta = "0" ;
         if ( GXutil.strcmp(AV20Respuesta, "1") == 0 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error no se puede cargar el archivo excel debe realizar el cierre de la bodega orígen en orions1" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else if ( GXutil.strcmp(AV20Respuesta, "2") == 0 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error no se puede cargar el archivo excel debe realizar el cierre de la bodega destino en orions1" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else if ( GXutil.strcmp(AV20Respuesta, "3") == 0 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error no se puede cargar el archivo excel debe realizar el cierre de la bodega orígen y destino en orions1" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else if ( GXutil.strcmp(AV20Respuesta, "0") == 0 )
         {
            callWebObject(formatLink("com.orions2.carguemasivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18Ind_E_S)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19Ind_Tipo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV29Tran_TipoEntra)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         if ( ( GXutil.strcmp(AV18Ind_E_S, "E") == 0 ) && ( GXutil.strcmp(AV19Ind_Tipo, "C") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( GXutil.strcmp(AV18Ind_E_S, "E") == 0 ) && ( GXutil.strcmp(AV19Ind_Tipo, "D") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( ( GXutil.strcmp(AV18Ind_E_S, "S") == 0 ) || ( GXutil.strcmp(AV18Ind_E_S, "L") == 0 ) ) && ( GXutil.strcmp(AV19Ind_Tipo, "C") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_consumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( ( GXutil.strcmp(AV18Ind_E_S, "S") == 0 ) || ( GXutil.strcmp(AV18Ind_E_S, "L") == 0 ) ) && ( GXutil.strcmp(AV19Ind_Tipo, "D") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( GXutil.strcmp(AV18Ind_E_S, "T") == 0 )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( GXutil.strcmp(AV18Ind_E_S, "R") == 0 )
         {
            callWebObject(formatLink("com.orions2.wpalm_recuperacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A56Tran_IdCuentadanteResponsabili,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A719Tran_TransaccResponsabilidad,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(A720Tran_FechaResponsabilidad)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A758Tran_TablaResponsabilidad,4,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void e13652( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {new Long(A46Tran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
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
      pr_default.close(0);
      pr_default.close(0);
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
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
      pa652( ) ;
      ws652( ) ;
      we652( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414202513");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_completatransaccion.js", "?201861414202513");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO" ;
      edtavTran_regiondescripcion_Internalname = "vTRAN_REGIONDESCRIPCION" ;
      edtavTran_centrocostodescripcion_Internalname = "vTRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO" ;
      divTable5_Internalname = "TABLE5" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      cmbTran_ModuloOrigen.setInternalname( "TRAN_MODULOORIGEN" );
      edtavAlmaorigen_Internalname = "vALMAORIGEN" ;
      edtavBodegaorigen_Internalname = "vBODEGAORIGEN" ;
      edtTran_CedulaCuentadanteOrigen_Internalname = "TRAN_CEDULACUENTADANTEORIGEN" ;
      edtTran_NombCuentadanteOrigen_Internalname = "TRAN_NOMBCUENTADANTEORIGEN" ;
      edtTran_CedulaProveedor_Internalname = "TRAN_CEDULAPROVEEDOR" ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR" ;
      divTable3_Internalname = "TABLE3" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavTran_regiondescripciondestino_Internalname = "vTRAN_REGIONDESCRIPCIONDESTINO" ;
      edtavTran_centrocostodescripciondestino_Internalname = "vTRAN_CENTROCOSTODESCRIPCIONDESTINO" ;
      cmbTran_ModuloDestino.setInternalname( "TRAN_MODULODESTINO" );
      edtavAlmadestino_Internalname = "vALMADESTINO" ;
      edtavBodedestino_Internalname = "vBODEDESTINO" ;
      edtTran_CedulaCuentadanteDestino_Internalname = "TRAN_CEDULACUENTADANTEDESTINO" ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO" ;
      divTable2_Internalname = "TABLE2" ;
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO" ;
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO" ;
      edtTran_FechaIngreso_Internalname = "TRAN_FECHAINGRESO" ;
      edtavArea_codigo_Internalname = "vAREA_CODIGO" ;
      edtavArea_descripcion_Internalname = "vAREA_DESCRIPCION" ;
      edtavCurs_codigo_Internalname = "vCURS_CODIGO" ;
      edtavCurs_descripcion_Internalname = "vCURS_DESCRIPCION" ;
      cmbTran_Detalle.setInternalname( "TRAN_DETALLE" );
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA" );
      edtTran_CedulaResponsabilidad_Internalname = "TRAN_CEDULARESPONSABILIDAD" ;
      edtTran_NombreCuentadanteResponsa_Internalname = "TRAN_NOMBRECUENTADANTERESPONSA" ;
      edtTran_TransaccResponsabilidad_Internalname = "TRAN_TRANSACCRESPONSABILIDAD" ;
      edtTran_FechaResponsabilidad_Internalname = "TRAN_FECHARESPONSABILIDAD" ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES" ;
      divTable4_Internalname = "TABLE4" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      bttCompletar_Internalname = "COMPLETAR" ;
      bttCancelar_Internalname = "CANCELAR" ;
      divTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtTran_Observaciones_Enabled = 0 ;
      edtTran_FechaResponsabilidad_Jsonclick = "" ;
      edtTran_FechaResponsabilidad_Enabled = 0 ;
      edtTran_FechaResponsabilidad_Visible = 1 ;
      edtTran_TransaccResponsabilidad_Jsonclick = "" ;
      edtTran_TransaccResponsabilidad_Enabled = 0 ;
      edtTran_TransaccResponsabilidad_Visible = 1 ;
      edtTran_NombreCuentadanteResponsa_Jsonclick = "" ;
      edtTran_NombreCuentadanteResponsa_Enabled = 0 ;
      edtTran_NombreCuentadanteResponsa_Visible = 1 ;
      edtTran_CedulaResponsabilidad_Jsonclick = "" ;
      edtTran_CedulaResponsabilidad_Enabled = 0 ;
      edtTran_CedulaResponsabilidad_Visible = 1 ;
      cmbTran_TipoEntra.setJsonclick( "" );
      cmbTran_TipoEntra.setEnabled( 0 );
      cmbTran_TipoEntra.setVisible( 1 );
      cmbTran_Detalle.setJsonclick( "" );
      cmbTran_Detalle.setEnabled( 0 );
      edtavCurs_descripcion_Jsonclick = "" ;
      edtavCurs_descripcion_Enabled = 1 ;
      edtavCurs_descripcion_Visible = 1 ;
      edtavCurs_codigo_Jsonclick = "" ;
      edtavCurs_codigo_Enabled = 1 ;
      edtavCurs_codigo_Visible = 1 ;
      edtavArea_descripcion_Jsonclick = "" ;
      edtavArea_descripcion_Enabled = 1 ;
      edtavArea_descripcion_Visible = 1 ;
      edtavArea_codigo_Jsonclick = "" ;
      edtavArea_codigo_Enabled = 1 ;
      edtavArea_codigo_Visible = 1 ;
      edtTran_FechaIngreso_Jsonclick = "" ;
      edtTran_FechaIngreso_Enabled = 0 ;
      edtTran_FechaIngreso_Visible = 1 ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      edtTran_NumeroIngreso_Enabled = 0 ;
      edtTran_NumeroIngreso_Visible = 1 ;
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_NombreIngreso_Enabled = 0 ;
      edtTran_NombreIngreso_Visible = 1 ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Enabled = 0 ;
      edtTran_CedulaCuentadanteDestino_Jsonclick = "" ;
      edtTran_CedulaCuentadanteDestino_Enabled = 0 ;
      edtavBodedestino_Jsonclick = "" ;
      edtavBodedestino_Enabled = 1 ;
      edtavAlmadestino_Jsonclick = "" ;
      edtavAlmadestino_Enabled = 1 ;
      cmbTran_ModuloDestino.setJsonclick( "" );
      cmbTran_ModuloDestino.setEnabled( 0 );
      edtavTran_centrocostodescripciondestino_Jsonclick = "" ;
      edtavTran_centrocostodescripciondestino_Enabled = 1 ;
      edtavTran_centrocostodescripciondestino_Visible = 1 ;
      edtavTran_regiondescripciondestino_Jsonclick = "" ;
      edtavTran_regiondescripciondestino_Enabled = 1 ;
      edtavTran_regiondescripciondestino_Visible = 1 ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_NombreProveedor_Enabled = 0 ;
      edtTran_NombreProveedor_Visible = 1 ;
      edtTran_CedulaProveedor_Jsonclick = "" ;
      edtTran_CedulaProveedor_Enabled = 0 ;
      edtTran_CedulaProveedor_Visible = 1 ;
      edtTran_NombCuentadanteOrigen_Jsonclick = "" ;
      edtTran_NombCuentadanteOrigen_Enabled = 0 ;
      edtTran_NombCuentadanteOrigen_Visible = 1 ;
      edtTran_CedulaCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CedulaCuentadanteOrigen_Enabled = 0 ;
      edtTran_CedulaCuentadanteOrigen_Visible = 1 ;
      edtavBodegaorigen_Jsonclick = "" ;
      edtavBodegaorigen_Enabled = 1 ;
      edtavAlmaorigen_Jsonclick = "" ;
      edtavAlmaorigen_Enabled = 1 ;
      cmbTran_ModuloOrigen.setJsonclick( "" );
      cmbTran_ModuloOrigen.setEnabled( 0 );
      edtTran_DescripcionMovimiento_Jsonclick = "" ;
      edtTran_DescripcionMovimiento_Enabled = 0 ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Enabled = 0 ;
      edtavTran_centrocostodescripcion_Jsonclick = "" ;
      edtavTran_centrocostodescripcion_Enabled = 1 ;
      edtavTran_regiondescripcion_Jsonclick = "" ;
      edtavTran_regiondescripcion_Enabled = 1 ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Enabled = 0 ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_FechaRegistro_Enabled = 0 ;
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtTran_ConsecutivoCC_Enabled = 0 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "WP_Completa Transaccion" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'COMPLETAR'","{handler:'e12652',iparms:[{av:'AV24Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'AV25Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'AV19Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'AV29Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',hsh:true,nv:''},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',hsh:true,nv:''},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'CANCELAR'","{handler:'e13652',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV24Tran_detalle = "" ;
      AV18Ind_E_S = "" ;
      AV19Ind_Tipo = "" ;
      AV29Tran_TipoEntra = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV27Tran_RegionDescripcion = "" ;
      AV21Tran_CentroCostoDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      AV9AlmaOrigen = "" ;
      AV15BodegaOrigen = "" ;
      AV28Tran_RegionDescripcionDestino = "" ;
      AV22Tran_CentroCostoDescripcionDestino = "" ;
      A385Tran_ModuloDestino = "" ;
      AV8AlmaDestino = "" ;
      AV14BodeDestino = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      AV10Area_Codigo = "" ;
      AV16Curs_Codigo = "" ;
      A524Tran_Detalle = "" ;
      A527Tran_TipoEntra = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      A416Tran_Observaciones = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV11Area_Descripcion = "" ;
      AV17Curs_Descripcion = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A417Tran_UsuarioCodigo = "" ;
      TempTags = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      lblTextblock1_Jsonclick = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      lblTextblock2_Jsonclick = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A672Tran_NombreIngreso = "" ;
      A721Tran_NombreCuentadanteResponsa = "" ;
      bttCompletar_Jsonclick = "" ;
      bttCancelar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00652_A416Tran_Observaciones = new String[] {""} ;
      H00652_n416Tran_Observaciones = new boolean[] {false} ;
      H00652_A47Tran_UsuarioId = new long[1] ;
      H00652_n47Tran_UsuarioId = new boolean[] {false} ;
      H00652_A50Tran_CentroCostoIdDestino = new long[1] ;
      H00652_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H00652_A57Tran_RegionId = new long[1] ;
      H00652_n57Tran_RegionId = new boolean[] {false} ;
      H00652_A518Tran_RegionIdDestino = new long[1] ;
      H00652_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H00652_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H00652_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H00652_A53Tran_IdProveedor = new long[1] ;
      H00652_n53Tran_IdProveedor = new boolean[] {false} ;
      H00652_A52Tran_IdCuentadanteDestino = new long[1] ;
      H00652_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H00652_A54Tran_TipoIngreso = new long[1] ;
      H00652_n54Tran_TipoIngreso = new boolean[] {false} ;
      H00652_A46Tran_Id = new long[1] ;
      H00652_A422Tran_RegionDescripcion = new String[] {""} ;
      H00652_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00652_A421Tran_RegionCodigo = new short[1] ;
      H00652_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00652_A48Tran_CentroCostoId = new long[1] ;
      H00652_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H00652_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H00652_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H00652_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H00652_A110Tran_ModuloOrigen = new String[] {""} ;
      H00652_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00652_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00652_A481Tran_IndE_S = new String[] {""} ;
      H00652_n481Tran_IndE_S = new boolean[] {false} ;
      H00652_A482Tran_TipoElemento = new String[] {""} ;
      H00652_A385Tran_ModuloDestino = new String[] {""} ;
      H00652_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00652_A387Tran_CodBodeDestino = new String[] {""} ;
      H00652_A407Tran_AreadanteCodigo = new String[] {""} ;
      H00652_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H00652_A408Tran_CursoCodigo = new String[] {""} ;
      H00652_n408Tran_CursoCodigo = new boolean[] {false} ;
      H00652_A524Tran_Detalle = new String[] {""} ;
      H00652_n524Tran_Detalle = new boolean[] {false} ;
      H00652_A527Tran_TipoEntra = new String[] {""} ;
      H00652_n527Tran_TipoEntra = new boolean[] {false} ;
      H00652_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H00652_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H00652_A519Tran_RegionCodigoDestino = new short[1] ;
      H00652_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      H00652_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H00652_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H00652_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H00652_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      H00652_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      H00652_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      H00652_A707Tran_SolicitaCCDestino = new String[] {""} ;
      H00652_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      H00652_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H00652_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H00652_A758Tran_TablaResponsabilidad = new short[1] ;
      H00652_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      H00652_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H00652_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H00652_A719Tran_TransaccResponsabilidad = new long[1] ;
      H00652_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H00652_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      H00652_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      H00652_A759Tran_CedulaResponsabilidad = new long[1] ;
      H00652_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      H00652_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H00652_n515Tran_FechaIngreso = new boolean[] {false} ;
      H00652_A514Tran_NumeroIngreso = new String[] {""} ;
      H00652_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H00652_A672Tran_NombreIngreso = new String[] {""} ;
      H00652_n672Tran_NombreIngreso = new boolean[] {false} ;
      H00652_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H00652_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H00652_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H00652_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H00652_A575Tran_NombreProveedor = new String[] {""} ;
      H00652_n575Tran_NombreProveedor = new boolean[] {false} ;
      H00652_A703Tran_CedulaProveedor = new long[1] ;
      H00652_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H00652_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H00652_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H00652_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H00652_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H00652_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H00652_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H00652_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00652_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00652_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00652_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00652_A513Tran_ConsecutivoCC = new long[1] ;
      H00652_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      A422Tran_RegionDescripcion = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A481Tran_IndE_S = "" ;
      A482Tran_TipoElemento = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A708Tran_SolicitaRegionDestino = "" ;
      A707Tran_SolicitaCCDestino = "" ;
      hsh = "" ;
      AV26Tran_ModuloOrigen = "" ;
      AV5Alma_Modulo = "" ;
      AV6Alma_Codigo = "" ;
      AV7Alma_descripcion = "" ;
      AV12Bode_Codigo = "" ;
      AV13Bode_Descripcion = "" ;
      H00653_A28Alma_Codigo = new String[] {""} ;
      H00653_A27Alma_Modulo = new String[] {""} ;
      H00653_A1Cent_Id = new long[1] ;
      H00653_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      H00654_A31Bode_Codigo = new String[] {""} ;
      H00654_A28Alma_Codigo = new String[] {""} ;
      H00654_A27Alma_Modulo = new String[] {""} ;
      H00654_A1Cent_Id = new long[1] ;
      H00654_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A695BBode_Descripcion = "" ;
      H00655_A59Area_Codigo = new String[] {""} ;
      H00655_A452Area_Descripcion = new String[] {""} ;
      A59Area_Codigo = "" ;
      A452Area_Descripcion = "" ;
      H00656_A73Curs_Codigo = new String[] {""} ;
      H00656_A424Curs_Descripcion = new String[] {""} ;
      A73Curs_Codigo = "" ;
      A424Curs_Descripcion = "" ;
      AV20Respuesta = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wp_completatransaccion__default(),
         new Object[] {
             new Object[] {
            H00652_A416Tran_Observaciones, H00652_n416Tran_Observaciones, H00652_A47Tran_UsuarioId, H00652_n47Tran_UsuarioId, H00652_A50Tran_CentroCostoIdDestino, H00652_n50Tran_CentroCostoIdDestino, H00652_A57Tran_RegionId, H00652_n57Tran_RegionId, H00652_A518Tran_RegionIdDestino, H00652_n518Tran_RegionIdDestino,
            H00652_A51Tran_IdCuentadanteOrigen, H00652_n51Tran_IdCuentadanteOrigen, H00652_A53Tran_IdProveedor, H00652_n53Tran_IdProveedor, H00652_A52Tran_IdCuentadanteDestino, H00652_n52Tran_IdCuentadanteDestino, H00652_A54Tran_TipoIngreso, H00652_n54Tran_TipoIngreso, H00652_A46Tran_Id, H00652_A422Tran_RegionDescripcion,
            H00652_n422Tran_RegionDescripcion, H00652_A421Tran_RegionCodigo, H00652_n421Tran_RegionCodigo, H00652_A48Tran_CentroCostoId, H00652_A420Tran_CentroCostoDescripcion, H00652_n420Tran_CentroCostoDescripcion, H00652_A419Tran_CentroCostoCodigo, H00652_n419Tran_CentroCostoCodigo, H00652_A110Tran_ModuloOrigen, H00652_A109Tran_CodAlmaOrigen,
            H00652_A112Tran_CodBodeOrigen, H00652_A481Tran_IndE_S, H00652_n481Tran_IndE_S, H00652_A482Tran_TipoElemento, H00652_A385Tran_ModuloDestino, H00652_A111Tran_CodAlmaDestino, H00652_A387Tran_CodBodeDestino, H00652_A407Tran_AreadanteCodigo, H00652_n407Tran_AreadanteCodigo, H00652_A408Tran_CursoCodigo,
            H00652_n408Tran_CursoCodigo, H00652_A524Tran_Detalle, H00652_n524Tran_Detalle, H00652_A527Tran_TipoEntra, H00652_n527Tran_TipoEntra, H00652_A520Tran_RegionDescripcionDestino, H00652_n520Tran_RegionDescripcionDestino, H00652_A519Tran_RegionCodigoDestino, H00652_n519Tran_RegionCodigoDestino, H00652_A517Tran_CentroCostoDescripcionDes,
            H00652_n517Tran_CentroCostoDescripcionDes, H00652_A516Tran_CentroCostoCodigoDestino, H00652_n516Tran_CentroCostoCodigoDestino, H00652_A708Tran_SolicitaRegionDestino, H00652_n708Tran_SolicitaRegionDestino, H00652_A707Tran_SolicitaCCDestino, H00652_n707Tran_SolicitaCCDestino, H00652_A56Tran_IdCuentadanteResponsabili, H00652_n56Tran_IdCuentadanteResponsabili, H00652_A758Tran_TablaResponsabilidad,
            H00652_n758Tran_TablaResponsabilidad, H00652_A720Tran_FechaResponsabilidad, H00652_n720Tran_FechaResponsabilidad, H00652_A719Tran_TransaccResponsabilidad, H00652_n719Tran_TransaccResponsabilidad, H00652_A721Tran_NombreCuentadanteResponsa, H00652_n721Tran_NombreCuentadanteResponsa, H00652_A759Tran_CedulaResponsabilidad, H00652_n759Tran_CedulaResponsabilidad, H00652_A515Tran_FechaIngreso,
            H00652_n515Tran_FechaIngreso, H00652_A514Tran_NumeroIngreso, H00652_n514Tran_NumeroIngreso, H00652_A672Tran_NombreIngreso, H00652_n672Tran_NombreIngreso, H00652_A389Tran_NombCuentadanteDestino, H00652_n389Tran_NombCuentadanteDestino, H00652_A704Tran_CedulaCuentadanteDestino, H00652_n704Tran_CedulaCuentadanteDestino, H00652_A575Tran_NombreProveedor,
            H00652_n575Tran_NombreProveedor, H00652_A703Tran_CedulaProveedor, H00652_n703Tran_CedulaProveedor, H00652_A384Tran_NombCuentadanteOrigen, H00652_n384Tran_NombCuentadanteOrigen, H00652_A702Tran_CedulaCuentadanteOrigen, H00652_n702Tran_CedulaCuentadanteOrigen, H00652_A381Tran_DescripcionMovimiento, H00652_n381Tran_DescripcionMovimiento, H00652_A49Tran_CodigoMovimiento,
            H00652_A417Tran_UsuarioCodigo, H00652_n417Tran_UsuarioCodigo, H00652_A55Tran_FechaRegistro, H00652_A513Tran_ConsecutivoCC, H00652_n513Tran_ConsecutivoCC
            }
            , new Object[] {
            H00653_A28Alma_Codigo, H00653_A27Alma_Modulo, H00653_A1Cent_Id, H00653_A252Alma_Descripcion
            }
            , new Object[] {
            H00654_A31Bode_Codigo, H00654_A28Alma_Codigo, H00654_A27Alma_Modulo, H00654_A1Cent_Id, H00654_A695BBode_Descripcion
            }
            , new Object[] {
            H00655_A59Area_Codigo, H00655_A452Area_Descripcion
            }
            , new Object[] {
            H00656_A73Curs_Codigo, H00656_A424Curs_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_regiondescripcion_Enabled = 0 ;
      edtavTran_centrocostodescripcion_Enabled = 0 ;
      edtavAlmaorigen_Enabled = 0 ;
      edtavBodegaorigen_Enabled = 0 ;
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      edtavAlmadestino_Enabled = 0 ;
      edtavBodedestino_Enabled = 0 ;
      edtavArea_codigo_Enabled = 0 ;
      edtavArea_descripcion_Enabled = 0 ;
      edtavCurs_codigo_Enabled = 0 ;
      edtavCurs_descripcion_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A758Tran_TablaResponsabilidad ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private int edtTran_ConsecutivoCC_Enabled ;
   private int edtTran_FechaRegistro_Enabled ;
   private int edtTran_UsuarioCodigo_Enabled ;
   private int edtavTran_regiondescripcion_Enabled ;
   private int edtavTran_centrocostodescripcion_Enabled ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int edtTran_DescripcionMovimiento_Enabled ;
   private int edtavAlmaorigen_Enabled ;
   private int edtavBodegaorigen_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Visible ;
   private int edtTran_NombCuentadanteOrigen_Visible ;
   private int edtTran_NombCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaProveedor_Enabled ;
   private int edtTran_CedulaProveedor_Visible ;
   private int edtTran_NombreProveedor_Visible ;
   private int edtTran_NombreProveedor_Enabled ;
   private int edtavTran_regiondescripciondestino_Visible ;
   private int edtavTran_regiondescripciondestino_Enabled ;
   private int edtavTran_centrocostodescripciondestino_Visible ;
   private int edtavTran_centrocostodescripciondestino_Enabled ;
   private int edtavAlmadestino_Enabled ;
   private int edtavBodedestino_Enabled ;
   private int edtTran_CedulaCuentadanteDestino_Enabled ;
   private int edtTran_NombCuentadanteDestino_Enabled ;
   private int edtTran_NombreIngreso_Visible ;
   private int edtTran_NombreIngreso_Enabled ;
   private int edtTran_NumeroIngreso_Visible ;
   private int edtTran_NumeroIngreso_Enabled ;
   private int edtTran_FechaIngreso_Visible ;
   private int edtTran_FechaIngreso_Enabled ;
   private int edtavArea_codigo_Visible ;
   private int edtavArea_codigo_Enabled ;
   private int edtavArea_descripcion_Visible ;
   private int edtavArea_descripcion_Enabled ;
   private int edtavCurs_codigo_Visible ;
   private int edtavCurs_codigo_Enabled ;
   private int edtavCurs_descripcion_Visible ;
   private int edtavCurs_descripcion_Enabled ;
   private int edtTran_CedulaResponsabilidad_Enabled ;
   private int edtTran_CedulaResponsabilidad_Visible ;
   private int edtTran_NombreCuentadanteResponsa_Visible ;
   private int edtTran_NombreCuentadanteResponsa_Enabled ;
   private int edtTran_TransaccResponsabilidad_Enabled ;
   private int edtTran_TransaccResponsabilidad_Visible ;
   private int edtTran_FechaResponsabilidad_Visible ;
   private int edtTran_FechaResponsabilidad_Enabled ;
   private int edtTran_Observaciones_Enabled ;
   private int idxLst ;
   private long wcpOA46Tran_Id ;
   private long A46Tran_Id ;
   private long AV25Tran_Id ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long A513Tran_ConsecutivoCC ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A759Tran_CedulaResponsabilidad ;
   private long A47Tran_UsuarioId ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A57Tran_RegionId ;
   private long A518Tran_RegionIdDestino ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A54Tran_TipoIngreso ;
   private long A48Tran_CentroCostoId ;
   private long AV23Tran_CentroCostoId ;
   private long A1Cent_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV24Tran_detalle ;
   private String AV19Ind_Tipo ;
   private String AV29Tran_TipoEntra ;
   private String A514Tran_NumeroIngreso ;
   private String A524Tran_Detalle ;
   private String A527Tran_TipoEntra ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GXKey ;
   private String forbiddenHiddens ;
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
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtavTran_regiondescripcion_Internalname ;
   private String TempTags ;
   private String edtavTran_regiondescripcion_Jsonclick ;
   private String edtavTran_centrocostodescripcion_Internalname ;
   private String edtavTran_centrocostodescripcion_Jsonclick ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String edtTran_DescripcionMovimiento_Internalname ;
   private String edtTran_DescripcionMovimiento_Jsonclick ;
   private String divTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavAlmaorigen_Internalname ;
   private String edtavAlmaorigen_Jsonclick ;
   private String edtavBodegaorigen_Internalname ;
   private String edtavBodegaorigen_Jsonclick ;
   private String edtTran_CedulaCuentadanteOrigen_Internalname ;
   private String edtTran_CedulaCuentadanteOrigen_Jsonclick ;
   private String edtTran_NombCuentadanteOrigen_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Jsonclick ;
   private String edtTran_CedulaProveedor_Internalname ;
   private String edtTran_CedulaProveedor_Jsonclick ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavTran_regiondescripciondestino_Internalname ;
   private String edtavTran_regiondescripciondestino_Jsonclick ;
   private String edtavTran_centrocostodescripciondestino_Internalname ;
   private String edtavTran_centrocostodescripciondestino_Jsonclick ;
   private String edtavAlmadestino_Internalname ;
   private String edtavAlmadestino_Jsonclick ;
   private String edtavBodedestino_Internalname ;
   private String edtavBodedestino_Jsonclick ;
   private String edtTran_CedulaCuentadanteDestino_Internalname ;
   private String edtTran_CedulaCuentadanteDestino_Jsonclick ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String divTable4_Internalname ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_FechaIngreso_Internalname ;
   private String edtTran_FechaIngreso_Jsonclick ;
   private String edtavArea_codigo_Internalname ;
   private String edtavArea_codigo_Jsonclick ;
   private String edtavArea_descripcion_Internalname ;
   private String edtavArea_descripcion_Jsonclick ;
   private String edtavCurs_codigo_Internalname ;
   private String edtavCurs_codigo_Jsonclick ;
   private String edtavCurs_descripcion_Internalname ;
   private String edtavCurs_descripcion_Jsonclick ;
   private String edtTran_CedulaResponsabilidad_Internalname ;
   private String edtTran_CedulaResponsabilidad_Jsonclick ;
   private String edtTran_NombreCuentadanteResponsa_Internalname ;
   private String edtTran_NombreCuentadanteResponsa_Jsonclick ;
   private String edtTran_TransaccResponsabilidad_Internalname ;
   private String edtTran_TransaccResponsabilidad_Jsonclick ;
   private String edtTran_FechaResponsabilidad_Internalname ;
   private String edtTran_FechaResponsabilidad_Jsonclick ;
   private String edtTran_Observaciones_Internalname ;
   private String bttCompletar_Internalname ;
   private String bttCompletar_Jsonclick ;
   private String bttCancelar_Internalname ;
   private String bttCancelar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String A482Tran_TipoElemento ;
   private String hsh ;
   private String AV20Respuesta ;
   private String Alertify1_Internalname ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n524Tran_Detalle ;
   private boolean n527Tran_TipoEntra ;
   private boolean n416Tran_Observaciones ;
   private boolean n47Tran_UsuarioId ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n57Tran_RegionId ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n481Tran_IndE_S ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n708Tran_SolicitaRegionDestino ;
   private boolean n707Tran_SolicitaCCDestino ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n721Tran_NombreCuentadanteResponsa ;
   private boolean n759Tran_CedulaResponsabilidad ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean returnInSub ;
   private String A416Tran_Observaciones ;
   private String AV18Ind_E_S ;
   private String AV27Tran_RegionDescripcion ;
   private String AV21Tran_CentroCostoDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String AV9AlmaOrigen ;
   private String AV15BodegaOrigen ;
   private String AV28Tran_RegionDescripcionDestino ;
   private String AV22Tran_CentroCostoDescripcionDestino ;
   private String A385Tran_ModuloDestino ;
   private String AV8AlmaDestino ;
   private String AV14BodeDestino ;
   private String AV10Area_Codigo ;
   private String AV16Curs_Codigo ;
   private String AV11Area_Descripcion ;
   private String AV17Curs_Descripcion ;
   private String A417Tran_UsuarioCodigo ;
   private String A381Tran_DescripcionMovimiento ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A672Tran_NombreIngreso ;
   private String A721Tran_NombreCuentadanteResponsa ;
   private String A422Tran_RegionDescripcion ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A481Tran_IndE_S ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A708Tran_SolicitaRegionDestino ;
   private String A707Tran_SolicitaCCDestino ;
   private String AV26Tran_ModuloOrigen ;
   private String AV5Alma_Modulo ;
   private String AV6Alma_Codigo ;
   private String AV7Alma_descripcion ;
   private String AV12Bode_Codigo ;
   private String AV13Bode_Descripcion ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String A695BBode_Descripcion ;
   private String A59Area_Codigo ;
   private String A452Area_Descripcion ;
   private String A73Curs_Codigo ;
   private String A424Curs_Descripcion ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbTran_ModuloOrigen ;
   private HTMLChoice cmbTran_ModuloDestino ;
   private HTMLChoice cmbTran_Detalle ;
   private HTMLChoice cmbTran_TipoEntra ;
   private IDataStoreProvider pr_default ;
   private String[] H00652_A416Tran_Observaciones ;
   private boolean[] H00652_n416Tran_Observaciones ;
   private long[] H00652_A47Tran_UsuarioId ;
   private boolean[] H00652_n47Tran_UsuarioId ;
   private long[] H00652_A50Tran_CentroCostoIdDestino ;
   private boolean[] H00652_n50Tran_CentroCostoIdDestino ;
   private long[] H00652_A57Tran_RegionId ;
   private boolean[] H00652_n57Tran_RegionId ;
   private long[] H00652_A518Tran_RegionIdDestino ;
   private boolean[] H00652_n518Tran_RegionIdDestino ;
   private long[] H00652_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H00652_n51Tran_IdCuentadanteOrigen ;
   private long[] H00652_A53Tran_IdProveedor ;
   private boolean[] H00652_n53Tran_IdProveedor ;
   private long[] H00652_A52Tran_IdCuentadanteDestino ;
   private boolean[] H00652_n52Tran_IdCuentadanteDestino ;
   private long[] H00652_A54Tran_TipoIngreso ;
   private boolean[] H00652_n54Tran_TipoIngreso ;
   private long[] H00652_A46Tran_Id ;
   private String[] H00652_A422Tran_RegionDescripcion ;
   private boolean[] H00652_n422Tran_RegionDescripcion ;
   private short[] H00652_A421Tran_RegionCodigo ;
   private boolean[] H00652_n421Tran_RegionCodigo ;
   private long[] H00652_A48Tran_CentroCostoId ;
   private String[] H00652_A420Tran_CentroCostoDescripcion ;
   private boolean[] H00652_n420Tran_CentroCostoDescripcion ;
   private String[] H00652_A419Tran_CentroCostoCodigo ;
   private boolean[] H00652_n419Tran_CentroCostoCodigo ;
   private String[] H00652_A110Tran_ModuloOrigen ;
   private String[] H00652_A109Tran_CodAlmaOrigen ;
   private String[] H00652_A112Tran_CodBodeOrigen ;
   private String[] H00652_A481Tran_IndE_S ;
   private boolean[] H00652_n481Tran_IndE_S ;
   private String[] H00652_A482Tran_TipoElemento ;
   private String[] H00652_A385Tran_ModuloDestino ;
   private String[] H00652_A111Tran_CodAlmaDestino ;
   private String[] H00652_A387Tran_CodBodeDestino ;
   private String[] H00652_A407Tran_AreadanteCodigo ;
   private boolean[] H00652_n407Tran_AreadanteCodigo ;
   private String[] H00652_A408Tran_CursoCodigo ;
   private boolean[] H00652_n408Tran_CursoCodigo ;
   private String[] H00652_A524Tran_Detalle ;
   private boolean[] H00652_n524Tran_Detalle ;
   private String[] H00652_A527Tran_TipoEntra ;
   private boolean[] H00652_n527Tran_TipoEntra ;
   private String[] H00652_A520Tran_RegionDescripcionDestino ;
   private boolean[] H00652_n520Tran_RegionDescripcionDestino ;
   private short[] H00652_A519Tran_RegionCodigoDestino ;
   private boolean[] H00652_n519Tran_RegionCodigoDestino ;
   private String[] H00652_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H00652_n517Tran_CentroCostoDescripcionDes ;
   private String[] H00652_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H00652_n516Tran_CentroCostoCodigoDestino ;
   private String[] H00652_A708Tran_SolicitaRegionDestino ;
   private boolean[] H00652_n708Tran_SolicitaRegionDestino ;
   private String[] H00652_A707Tran_SolicitaCCDestino ;
   private boolean[] H00652_n707Tran_SolicitaCCDestino ;
   private long[] H00652_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H00652_n56Tran_IdCuentadanteResponsabili ;
   private short[] H00652_A758Tran_TablaResponsabilidad ;
   private boolean[] H00652_n758Tran_TablaResponsabilidad ;
   private java.util.Date[] H00652_A720Tran_FechaResponsabilidad ;
   private boolean[] H00652_n720Tran_FechaResponsabilidad ;
   private long[] H00652_A719Tran_TransaccResponsabilidad ;
   private boolean[] H00652_n719Tran_TransaccResponsabilidad ;
   private String[] H00652_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] H00652_n721Tran_NombreCuentadanteResponsa ;
   private long[] H00652_A759Tran_CedulaResponsabilidad ;
   private boolean[] H00652_n759Tran_CedulaResponsabilidad ;
   private java.util.Date[] H00652_A515Tran_FechaIngreso ;
   private boolean[] H00652_n515Tran_FechaIngreso ;
   private String[] H00652_A514Tran_NumeroIngreso ;
   private boolean[] H00652_n514Tran_NumeroIngreso ;
   private String[] H00652_A672Tran_NombreIngreso ;
   private boolean[] H00652_n672Tran_NombreIngreso ;
   private String[] H00652_A389Tran_NombCuentadanteDestino ;
   private boolean[] H00652_n389Tran_NombCuentadanteDestino ;
   private long[] H00652_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H00652_n704Tran_CedulaCuentadanteDestino ;
   private String[] H00652_A575Tran_NombreProveedor ;
   private boolean[] H00652_n575Tran_NombreProveedor ;
   private long[] H00652_A703Tran_CedulaProveedor ;
   private boolean[] H00652_n703Tran_CedulaProveedor ;
   private String[] H00652_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H00652_n384Tran_NombCuentadanteOrigen ;
   private long[] H00652_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H00652_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H00652_A381Tran_DescripcionMovimiento ;
   private boolean[] H00652_n381Tran_DescripcionMovimiento ;
   private String[] H00652_A49Tran_CodigoMovimiento ;
   private String[] H00652_A417Tran_UsuarioCodigo ;
   private boolean[] H00652_n417Tran_UsuarioCodigo ;
   private java.util.Date[] H00652_A55Tran_FechaRegistro ;
   private long[] H00652_A513Tran_ConsecutivoCC ;
   private boolean[] H00652_n513Tran_ConsecutivoCC ;
   private String[] H00653_A28Alma_Codigo ;
   private String[] H00653_A27Alma_Modulo ;
   private long[] H00653_A1Cent_Id ;
   private String[] H00653_A252Alma_Descripcion ;
   private String[] H00654_A31Bode_Codigo ;
   private String[] H00654_A28Alma_Codigo ;
   private String[] H00654_A27Alma_Modulo ;
   private long[] H00654_A1Cent_Id ;
   private String[] H00654_A695BBode_Descripcion ;
   private String[] H00655_A59Area_Codigo ;
   private String[] H00655_A452Area_Descripcion ;
   private String[] H00656_A73Curs_Codigo ;
   private String[] H00656_A424Curs_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wp_completatransaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00652", "SELECT T1.Tran_Observaciones, T1.Tran_UsuarioId AS Tran_UsuarioId, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T1.Tran_TipoIngreso AS Tran_TipoIngreso, T1.Tran_Id, T4.Regi_Descripcion AS Tran_RegionDescripcion, T4.Regi_Cod AS Tran_RegionCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T10.Cent_Descripcion AS Tran_CentroCostoDescripcion, T10.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T1.Tran_IndE_S AS Tran_IndE_S, T1.Tran_TipoElemento, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_AreadanteCodigo, T1.Tran_CursoCodigo, T1.Tran_Detalle, T1.Tran_TipoEntra, T5.Regi_Descripcion AS Tran_RegionDescripcionDestino, T5.Regi_Cod AS Tran_RegionCodigoDestino, T3.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, T3.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T12.Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, T12.Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, T1.Tran_IdCuentadanteResponsabili AS Tran_IdCuentadanteResponsabili, T1.Tran_TablaResponsabilidad, T1.Tran_FechaResponsabilidad, T1.Tran_TransaccResponsabilidad, T11.Cuen_Nombre AS Tran_NombreCuentadanteResponsa, T11.Cuen_Cedula AS Tran_CedulaResponsabilidad, T1.Tran_FechaIngreso, T1.Tran_NumeroIngreso, T9.Orig_Descripcion AS Tran_NombreIngreso, T8.Cuen_Nombre AS Tran_NombCuentadanteDestino, T8.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T7.Cuen_Nombre AS Tran_NombreProveedor, T7.Cuen_Cedula AS Tran_CedulaProveedor, T6.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T6.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T12.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T2.Usua_Codigo AS Tran_UsuarioCodigo, T1.Tran_FechaRegistro, T1.Tran_ConsecutivoCC FROM (((((((((((ALM_TRANSACCION T1 LEFT JOIN SEG_USUARIO T2 ON T2.Usua_Id = T1.Tran_UsuarioId) LEFT JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionId) LEFT JOIN GEN_REGIONAL T5 ON T5.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN ALM_CUENTADANTE T6 ON T6.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT JOIN ALM_ORIGEN_BIENES T9 ON T9.Orig_Identificador = T1.Tran_TipoIngreso) INNER JOIN GEN_CENTROCOSTO T10 ON T10.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN ALM_CUENTADANTE T11 ON T11.Cuen_Identificacion = T1.Tran_IdCuentadanteResponsabili) INNER JOIN ALM_TIPO_MOVIMIENTO T12 ON T12.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00653", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00654", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00655", "SELECT Area_Codigo, Area_Descripcion FROM ALM_AREADANTE WHERE Area_Codigo = ? ORDER BY Area_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00656", "SELECT Curs_Codigo, Curs_Descripcion FROM ALM_CURSOS WHERE Curs_Codigo = ? ORDER BY Curs_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(10) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 1) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[36])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[37])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(26, 1) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(27, 4) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(35) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(36) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((long[]) buf[63])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(39) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[69])[0] = rslt.getGXDate(40) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(41, 30) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((long[]) buf[77])[0] = rslt.getLong(44) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((long[]) buf[81])[0] = rslt.getLong(46) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((long[]) buf[85])[0] = rslt.getLong(48) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(49) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(50) ;
               ((String[]) buf[90])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[92])[0] = rslt.getGXDateTime(52) ;
               ((long[]) buf[93])[0] = rslt.getLong(53) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
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
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 41);
               return;
      }
   }

}

