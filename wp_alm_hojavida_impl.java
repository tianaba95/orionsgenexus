/*
               File: wp_alm_hojavida_impl
        Description: Hoja de vida del activo fijo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:49.10
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

public final  class wp_alm_hojavida_impl extends GXDataArea
{
   public wp_alm_hojavida_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_alm_hojavida_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_alm_hojavida_impl.class ));
   }

   public wp_alm_hojavida_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCinvd_moduloalmacen = new HTMLChoice();
      cmbavCinvd_estado = new HTMLChoice();
      cmbavCtlgtran_estado = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtraza") == 0 )
         {
            nRC_GXsfl_144 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_144_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_144_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgridtraza_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridtraza") == 0 )
         {
            subGridtraza_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgridtraza_refresh( subGridtraza_Rows) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wp_alm_hojavida:[SendSecurityCheck]"+forbiddenHiddens);
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridatributos") == 0 )
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
            gxnrgridatributos_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridatributos") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgridatributos_refresh( ) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wp_alm_hojavida:[SendSecurityCheck]"+forbiddenHiddens);
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhijos") == 0 )
         {
            nRC_GXsfl_176 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_176_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_176_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgridhijos_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhijos") == 0 )
         {
            subGridhijos_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgridhijos_refresh( subGridhijos_Rows) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wp_alm_hojavida:[SendSecurityCheck]"+forbiddenHiddens);
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_191 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_191_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_191_idx = httpContext.GetNextPar( ) ;
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
            forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wp_alm_hojavida:[SendSecurityCheck]"+forbiddenHiddens);
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
            AV18cInvd_NumeroPlaca = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18cInvd_NumeroPlaca", AV18cInvd_NumeroPlaca);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cInvd_NumeroPlaca, ""))));
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
      pa6D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6D2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414204942");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_alm_hojavida") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18cInvd_NumeroPlaca))+"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdthvatributos", AV30SDTHVAtributos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdthvatributos", AV30SDTHVAtributos);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdthvhijos", AV32SDTHVHijos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdthvhijos", AV32SDTHVHijos);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtnovedadesbien", AV53SDTNovedadesBien);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtnovedadesbien", AV53SDTNovedadesBien);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdthvtraza", AV39SDTHVTraza);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdthvtraza", AV39SDTHVTraza);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_144", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_144, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_163", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_163, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_176", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_176, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_191", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_191, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTHVTRAZA", AV39SDTHVTraza);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTHVTRAZA", AV39SDTHVTraza);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCINVD_NUMEROPLACA", AV18cInvd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cInvd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cInvd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_Rows", GXutil.ltrim( localUtil.ntoc( subGridtraza_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridhijos_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB2_Class", GXutil.rtrim( Tab2_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB2_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab2_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB2_Historymanagement", GXutil.booltostr( Tab2_Historymanagement));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wp_alm_hojavida:[SendSecurityCheck]"+forbiddenHiddens);
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
         we6D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6D2( ) ;
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
      return formatLink("com.orions2.wp_alm_hojavida") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18cInvd_NumeroPlaca)) ;
   }

   public String getPgmname( )
   {
      return "WP_ALM_HOJAVIDA" ;
   }

   public String getPgmdesc( )
   {
      return "Hoja de vida del activo fijo" ;
   }

   public void wb6D0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, lblTitle_Caption, "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-10", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"TAB2Container"+"\"></div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage1_title_Internalname, "Ubicación", "", "", lblTabpage1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage1") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage1table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCregi_cod_Internalname, "Regional", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCregi_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19cRegi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtavCregi_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19cRegi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV19cRegi_Cod), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCregi_cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCregi_cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCregi_descripcion_Internalname, "Descripción Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCregi_descripcion_Internalname, AV20cRegi_Descripcion, GXutil.rtrim( localUtil.format( AV20cRegi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCregi_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCregi_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcent_codigo_Internalname, " C. Costo", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcent_codigo_Internalname, AV7cCent_Codigo, GXutil.rtrim( localUtil.format( AV7cCent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcent_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcent_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcent_descripcion_Internalname, "Descripción Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcent_descripcion_Internalname, AV8cCent_Descripcion, GXutil.rtrim( localUtil.format( AV8cCent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcent_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcent_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCinvd_moduloalmacen.getInternalname(), "Modulo", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCinvd_moduloalmacen, cmbavCinvd_moduloalmacen.getInternalname(), GXutil.rtrim( AV17cInvd_ModuloAlmacen), 1, cmbavCinvd_moduloalmacen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavCinvd_moduloalmacen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "", true, "HLP_WP_ALM_HOJAVIDA.htm");
         cmbavCinvd_moduloalmacen.setValue( GXutil.rtrim( AV17cInvd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_moduloalmacen.getInternalname(), "Values", cmbavCinvd_moduloalmacen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_almacencodigo_Internalname, "Almacén", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_almacencodigo_Internalname, AV13cInvd_AlmacenCodigo, GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_almacencodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCinvd_almacencodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCalma_descripcion_Internalname, "Descripción Almacén", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_descripcion_Internalname, AV51cAlma_Descripcion, GXutil.rtrim( localUtil.format( AV51cAlma_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCalma_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_bodegacodigo_Internalname, "Bodega", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_bodegacodigo_Internalname, AV14cInvd_BodegaCodigo, GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_bodegacodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCinvd_bodegacodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbarea_descripcion_Internalname, "BArea_Descripcion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbarea_descripcion_Internalname, AV52cBArea_Descripcion, GXutil.rtrim( localUtil.format( AV52cBArea_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbarea_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCbarea_descripcion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedula_Internalname, "Cuentadante", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV50Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV50Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCuen_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcuen_nombre_Internalname, "Nombre Cuentadante", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcuen_nombre_Internalname, AV10cCuen_Nombre, GXutil.rtrim( localUtil.format( AV10cCuen_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcuen_nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcuen_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage2_title_Internalname, "Datos", "", "", lblTabpage2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage2") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage2table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable7_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCclas_codigo_Internalname, "Clase", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCclas_codigo_Internalname, AV48cClas_Codigo, GXutil.rtrim( localUtil.format( AV48cClas_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclas_codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCclas_codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCclas_descripcion_Internalname, "Descripción Clase", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCclas_descripcion_Internalname, AV49cClas_Descripcion, GXutil.rtrim( localUtil.format( AV49cClas_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclas_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCclas_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Elemento", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV11cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCcata_descripcion_Internalname, AV5cCata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,87);\"", (short)(0), 1, edtavCcata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtipo_descripcion_Internalname, "Tipo", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtipo_descripcion_Internalname, AV24cTipo_Descripcion, GXutil.rtrim( localUtil.format( AV24cTipo_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtipo_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtipo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-11", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_descripcion_Internalname, "Detalle", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_descripcion_Internalname, AV12cElem_Descripcion, GXutil.rtrim( localUtil.format( AV12cElem_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCelem_descripcion_Enabled, 0, "text", "", 80, "chr", 3, "ow", 2000, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_vidautil_Internalname, "Vida útil", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcata_vidautil_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cCata_VidaUtil, (byte)(3), (byte)(0), ",", "")), ((edtavCcata_vidautil_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cCata_VidaUtil), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cCata_VidaUtil), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcata_vidautil_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcata_vidautil_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_placapadre_Internalname, "Placa Padre", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_placapadre_Internalname, AV47cTDet_PlacaPadre, GXutil.rtrim( localUtil.format( AV47cTDet_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_placapadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_placapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valorunitario_Internalname, "Valor", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valorunitario_Internalname, GXutil.ltrim( localUtil.ntoc( AV22cTDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtavCtdet_valorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV22cTDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV22cTDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valorunitario_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_valorunitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_otros_costos_Internalname, "Otros Costos", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_otros_costos_Internalname, GXutil.ltrim( localUtil.ntoc( AV45cTDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtavCtdet_otros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV45cTDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV45cTDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_otros_costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_otros_costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valor_futuro_Internalname, "Valor Futuro", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valor_futuro_Internalname, GXutil.ltrim( localUtil.ntoc( AV41cTDet_Valor_Futuro, (byte)(24), (byte)(2), ",", "")), ((edtavCtdet_valor_futuro_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV41cTDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV41cTDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valor_futuro_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_valor_futuro_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-7 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_taza_Internalname, "Taza", "col-sm-3 col-lg-5 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_taza_Internalname, GXutil.ltrim( localUtil.ntoc( AV42cTDet_Taza, (byte)(3), (byte)(0), ",", "")), ((edtavCtdet_taza_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42cTDet_Taza), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV42cTDet_Taza), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_taza_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_taza_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_plazo_n_Internalname, "Plazo N", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_plazo_n_Internalname, GXutil.ltrim( localUtil.ntoc( AV43cTDet_Plazo_N, (byte)(2), (byte)(0), ",", "")), ((edtavCtdet_plazo_n_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43cTDet_Plazo_N), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(AV43cTDet_Plazo_N), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_plazo_n_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_plazo_n_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valor_presente_Internalname, "Valor Presente", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valor_presente_Internalname, GXutil.ltrim( localUtil.ntoc( AV44cTDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")), ((edtavCtdet_valor_presente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV44cTDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV44cTDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valor_presente_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_valor_presente_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtdet_valortotal_Internalname, "Valor Total", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtdet_valortotal_Internalname, GXutil.ltrim( localUtil.ntoc( AV46cTDet_ValorTotal, (byte)(22), (byte)(2), ",", "")), ((edtavCtdet_valortotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV46cTDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV46cTDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtdet_valortotal_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtdet_valortotal_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_fechaadquisicion_Internalname, "Fecha Adquisicion", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCinvd_fechaadquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_fechaadquisicion_Internalname, localUtil.format(AV16cInvd_FechaAdquisicion, "99/99/99"), localUtil.format( AV16cInvd_FechaAdquisicion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_fechaadquisicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCinvd_fechaadquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCinvd_fechaadquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCinvd_fechaadquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_ALM_HOJAVIDA.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCinvd_estado.getInternalname(), "Estado", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCinvd_estado, cmbavCinvd_estado.getInternalname(), GXutil.rtrim( AV15cInvd_Estado), 1, cmbavCinvd_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavCinvd_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "", true, "HLP_WP_ALM_HOJAVIDA.htm");
         cmbavCinvd_estado.setValue( GXutil.rtrim( AV15cInvd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_estado.getInternalname(), "Values", cmbavCinvd_estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage3_title_Internalname, "Trazabilidad", "", "", lblTabpage3_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage3") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage3table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridtrazaContainer.SetWrapped(nGXWrapped);
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridtrazaContainer"+"DivS\" data-gxgridid=\"144\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGridtraza_Internalname, subGridtraza_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGridtraza_Backcolorstyle == 0 )
            {
               subGridtraza_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGridtraza_Class) > 0 )
               {
                  subGridtraza_Linesclass = subGridtraza_Class+"Title" ;
               }
            }
            else
            {
               subGridtraza_Titlebackstyle = (byte)(1) ;
               if ( subGridtraza_Backcolorstyle == 1 )
               {
                  subGridtraza_Titlebackcolor = subGridtraza_Allbackcolor ;
                  if ( GXutil.len( subGridtraza_Class) > 0 )
                  {
                     subGridtraza_Linesclass = subGridtraza_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGridtraza_Class) > 0 )
                  {
                     subGridtraza_Linesclass = subGridtraza_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 106, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "C. Costo.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 154, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transacciòn") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 122, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tercero") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridtrazaContainer.AddObjectProperty("GridName", "Gridtraza");
         }
         else
         {
            GridtrazaContainer.AddObjectProperty("GridName", "Gridtraza");
            GridtrazaContainer.AddObjectProperty("Class", "WorkWith");
            GridtrazaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtraza_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("CmpContext", "");
            GridtrazaContainer.AddObjectProperty("InMasterPage", "false");
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_centrocostocodigo_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_codigomovimiento_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_descripcionmovimiento_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_consecutivocc_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_fecharegistro_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_cedulacuentadantedestino_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtran_nombcuentadantedestino_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridtrazaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavCtlgtran_estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            GridtrazaContainer.AddColumnProperties(GridtrazaColumn);
            GridtrazaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtraza_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtraza_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtraza_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtraza_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtraza_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridtrazaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtraza_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 144 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_144 = (short)(nGXsfl_144_idx-1) ;
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridtrazaContainer.AddObjectProperty("GRIDTRAZA_nEOF", GRIDTRAZA_nEOF);
            GridtrazaContainer.AddObjectProperty("GRIDTRAZA_nFirstRecordOnPage", GRIDTRAZA_nFirstRecordOnPage);
            AV56GXV1 = nGXsfl_144_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridtrazaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridtraza", GridtrazaContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridtrazaContainerData", GridtrazaContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridtrazaContainerData"+"V", GridtrazaContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridtrazaContainerData"+"V"+"\" value='"+GridtrazaContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage4_title_Internalname, "Atributos", "", "", lblTabpage4_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage4") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage4table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridatributosContainer.SetWrapped(nGXWrapped);
         if ( GridatributosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridatributosContainer"+"DivS\" data-gxgridid=\"163\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGridatributos_Internalname, subGridatributos_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGridatributos_Backcolorstyle == 0 )
            {
               subGridatributos_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGridatributos_Class) > 0 )
               {
                  subGridatributos_Linesclass = subGridatributos_Class+"Title" ;
               }
            }
            else
            {
               subGridatributos_Titlebackstyle = (byte)(1) ;
               if ( subGridatributos_Backcolorstyle == 1 )
               {
                  subGridatributos_Titlebackcolor = subGridatributos_Allbackcolor ;
                  if ( GXutil.len( subGridatributos_Class) > 0 )
                  {
                     subGridatributos_Linesclass = subGridatributos_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGridatributos_Class) > 0 )
                  {
                     subGridatributos_Linesclass = subGridatributos_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Atributos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridatributosContainer.AddObjectProperty("GridName", "Gridatributos");
         }
         else
         {
            GridatributosContainer.AddObjectProperty("GridName", "Gridatributos");
            GridatributosContainer.AddObjectProperty("Class", "WorkWith");
            GridatributosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridatributos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("CmpContext", "");
            GridatributosContainer.AddObjectProperty("InMasterPage", "false");
            GridatributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridatributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtdet_listdescripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridatributosContainer.AddColumnProperties(GridatributosColumn);
            GridatributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridatributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtdet_valoratributo_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridatributosContainer.AddColumnProperties(GridatributosColumn);
            GridatributosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridatributos_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridatributos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridatributos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridatributos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridatributos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridatributosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridatributos_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 163 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_163 = (short)(nGXsfl_163_idx-1) ;
         if ( GridatributosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV65GXV2 = nGXsfl_163_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridatributosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridatributos", GridatributosContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridatributosContainerData", GridatributosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridatributosContainerData"+"V", GridatributosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridatributosContainerData"+"V"+"\" value='"+GridatributosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage5_title_Internalname, "Hijos", "", "", lblTabpage5_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage5") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage5table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridhijosContainer.SetWrapped(nGXWrapped);
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridhijosContainer"+"DivS\" data-gxgridid=\"176\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGridhijos_Internalname, subGridhijos_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGridhijos_Backcolorstyle == 0 )
            {
               subGridhijos_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGridhijos_Class) > 0 )
               {
                  subGridhijos_Linesclass = subGridhijos_Class+"Title" ;
               }
            }
            else
            {
               subGridhijos_Titlebackstyle = (byte)(1) ;
               if ( subGridhijos_Backcolorstyle == 1 )
               {
                  subGridhijos_Titlebackcolor = subGridhijos_Allbackcolor ;
                  if ( GXutil.len( subGridhijos_Class) > 0 )
                  {
                     subGridhijos_Linesclass = subGridhijos_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGridhijos_Class) > 0 )
                  {
                     subGridhijos_Linesclass = subGridhijos_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Numero de Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Serial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridhijosContainer.AddObjectProperty("GridName", "Gridhijos");
         }
         else
         {
            GridhijosContainer.AddObjectProperty("GridName", "Gridhijos");
            GridhijosContainer.AddObjectProperty("Class", "WorkWith");
            GridhijosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhijos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("CmpContext", "");
            GridhijosContainer.AddObjectProperty("InMasterPage", "false");
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgelem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlginvd_numeroplaca_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgserial_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgmodelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridhijosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlgtdet_observaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            GridhijosContainer.AddColumnProperties(GridhijosColumn);
            GridhijosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhijos_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhijos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhijos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhijos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhijos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridhijosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhijos_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 176 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_176 = (short)(nGXsfl_176_idx-1) ;
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridhijosContainer.AddObjectProperty("GRIDHIJOS_nEOF", GRIDHIJOS_nEOF);
            GridhijosContainer.AddObjectProperty("GRIDHIJOS_nFirstRecordOnPage", GRIDHIJOS_nFirstRecordOnPage);
            AV68GXV3 = nGXsfl_176_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridhijosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridhijos", GridhijosContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridhijosContainerData", GridhijosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridhijosContainerData"+"V", GridhijosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhijosContainerData"+"V"+"\" value='"+GridhijosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"title6"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTabpage6_title_Internalname, "Novedades", "", "", lblTabpage6_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WP_ALM_HOJAVIDA.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabPage6") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TAB2Container"+"panel6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabpage6table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"191\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Antiguo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_fecharegistro_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_identificador_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltnov_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_placa_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 191 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_191 = (short)(nGXsfl_191_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV76GXV4 = nGXsfl_191_idx ;
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
         httpContext.writeText( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 144, 3, 0)+","+"null"+");", "Cancelar", bttButton1_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_ALM_HOJAVIDA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Hoja de vida del activo fijo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6D0( ) ;
   }

   public void ws6D2( )
   {
      start6D2( ) ;
      evt6D2( ) ;
   }

   public void evt6D2( )
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
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e116D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDTRAZAPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDTRAZAPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridtraza_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridtraza_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridtraza_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridtraza_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDHIJOSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDHIJOSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridhijos_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridhijos_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridhijos_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridhijos_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( GXutil.strcmp(GXutil.left( sEvt, 18), "GRIDATRIBUTOS.LOAD") == 0 )
                        {
                           nGXsfl_163_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_16316( ) ;
                           AV65GXV2 = nGXsfl_163_idx ;
                           if ( ( AV30SDTHVAtributos.size() >= AV65GXV2 ) && ( AV65GXV2 > 0 ) )
                           {
                              AV30SDTHVAtributos.currentItem( ((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDATRIBUTOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e126D16 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRIDHIJOS.LOAD") == 0 )
                        {
                           nGXsfl_176_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_17615( ) ;
                           AV68GXV3 = (short)(nGXsfl_176_idx+GRIDHIJOS_nFirstRecordOnPage) ;
                           if ( ( AV32SDTHVHijos.size() >= AV68GXV3 ) && ( AV68GXV3 > 0 ) )
                           {
                              AV32SDTHVHijos.currentItem( ((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDHIJOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e136D15 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 )
                        {
                           nGXsfl_191_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_191_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_19114( ) ;
                           AV76GXV4 = nGXsfl_191_idx ;
                           if ( ( AV53SDTNovedadesBien.size() >= AV76GXV4 ) && ( AV76GXV4 > 0 ) )
                           {
                              AV53SDTNovedadesBien.currentItem( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e146D14 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRIDTRAZA.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_144_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1442( ) ;
                           AV56GXV1 = (short)(nGXsfl_144_idx+GRIDTRAZA_nFirstRecordOnPage) ;
                           if ( ( AV39SDTHVTraza.size() >= AV56GXV1 ) && ( AV56GXV1 > 0 ) )
                           {
                              AV39SDTHVTraza.currentItem( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)) );
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
                                 e156D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDTRAZA.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e166D2 ();
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

   public void we6D2( )
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

   public void pa6D2( )
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
         cmbavCinvd_moduloalmacen.setName( "vCINVD_MODULOALMACEN" );
         cmbavCinvd_moduloalmacen.setWebtags( "" );
         cmbavCinvd_moduloalmacen.addItem("", "", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbavCinvd_moduloalmacen.getItemCount() > 0 )
         {
            AV17cInvd_ModuloAlmacen = cmbavCinvd_moduloalmacen.getValidValue(AV17cInvd_ModuloAlmacen) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_ModuloAlmacen", AV17cInvd_ModuloAlmacen);
         }
         cmbavCinvd_estado.setName( "vCINVD_ESTADO" );
         cmbavCinvd_estado.setWebtags( "" );
         cmbavCinvd_estado.addItem("", "(Ninguno)", (short)(0));
         cmbavCinvd_estado.addItem("R", "Ratificado", (short)(0));
         cmbavCinvd_estado.addItem("P", "Pendiente", (short)(0));
         cmbavCinvd_estado.addItem("A", "Anulado", (short)(0));
         if ( cmbavCinvd_estado.getItemCount() > 0 )
         {
            AV15cInvd_Estado = cmbavCinvd_estado.getValidValue(AV15cInvd_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_Estado", AV15cInvd_Estado);
         }
         GXCCtl = "CTLGTRAN_ESTADO_" + sGXsfl_144_idx ;
         cmbavCtlgtran_estado.setName( GXCCtl );
         cmbavCtlgtran_estado.setWebtags( "" );
         cmbavCtlgtran_estado.addItem("A", "Anulado", (short)(0));
         cmbavCtlgtran_estado.addItem("R", "Ratificado", (short)(0));
         cmbavCtlgtran_estado.addItem("P", "Pendiente", (short)(0));
         cmbavCtlgtran_estado.addItem("I", "Incompleto", (short)(0));
         if ( cmbavCtlgtran_estado.getItemCount() > 0 )
         {
            if ( ( AV56GXV1 > 0 ) && ( AV39SDTHVTraza.size() >= AV56GXV1 ) && (GXutil.strcmp("", ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado())==0) )
            {
               ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado( cmbavCtlgtran_estado.getValidValue(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado()) );
            }
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
            GX_FocusControl = edtavCregi_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridtraza_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1442( ) ;
      while ( nGXsfl_144_idx <= nRC_GXsfl_144 )
      {
         sendrow_1442( ) ;
         nGXsfl_144_idx = (short)(((subGridtraza_Islastpage==1)&&(nGXsfl_144_idx+1>subgridtraza_recordsperpage( )) ? 1 : nGXsfl_144_idx+1)) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1442( ) ;
      }
      httpContext.GX_webresponse.addString(GridtrazaContainer.ToJavascriptSource());
      /* End function gxnrGridtraza_newrow */
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_19114( ) ;
      while ( nGXsfl_191_idx <= nRC_GXsfl_191 )
      {
         sendrow_19114( ) ;
         nGXsfl_191_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_191_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_191_idx+1)) ;
         sGXsfl_191_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_19114( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgridhijos_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_17615( ) ;
      while ( nGXsfl_176_idx <= nRC_GXsfl_176 )
      {
         sendrow_17615( ) ;
         nGXsfl_176_idx = (short)(((subGridhijos_Islastpage==1)&&(nGXsfl_176_idx+1>subgridhijos_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_17615( ) ;
      }
      httpContext.GX_webresponse.addString(GridhijosContainer.ToJavascriptSource());
      /* End function gxnrGridhijos_newrow */
   }

   public void gxnrgridatributos_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_16316( ) ;
      while ( nGXsfl_163_idx <= nRC_GXsfl_163 )
      {
         sendrow_16316( ) ;
         nGXsfl_163_idx = (short)(((subGridatributos_Islastpage==1)&&(nGXsfl_163_idx+1>subgridatributos_recordsperpage( )) ? 1 : nGXsfl_163_idx+1)) ;
         sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_16316( ) ;
      }
      httpContext.GX_webresponse.addString(GridatributosContainer.ToJavascriptSource());
      /* End function gxnrGridatributos_newrow */
   }

   public void gxgrgridtraza_refresh( int subGridtraza_Rows )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGridtraza_Rows = subGridtraza_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_Rows", GXutil.ltrim( localUtil.ntoc( subGridtraza_Rows, (byte)(6), (byte)(0), ".", "")));
      GRIDTRAZA_nCurrentRecord = 0 ;
      rf6D2( ) ;
      /* End function gxgrGridtraza_refresh */
   }

   public void gxgrgridatributos_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDATRIBUTOS_nCurrentRecord = 0 ;
      rf6D16( ) ;
      /* End function gxgrGridatributos_refresh */
   }

   public void gxgrgridhijos_refresh( int subGridhijos_Rows )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGridhijos_Rows = subGridhijos_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridhijos_Rows, (byte)(6), (byte)(0), ".", "")));
      GRIDHIJOS_nCurrentRecord = 0 ;
      rf6D15( ) ;
      /* End function gxgrGridhijos_refresh */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf6D14( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCinvd_moduloalmacen.getItemCount() > 0 )
      {
         AV17cInvd_ModuloAlmacen = cmbavCinvd_moduloalmacen.getValidValue(AV17cInvd_ModuloAlmacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_ModuloAlmacen", AV17cInvd_ModuloAlmacen);
      }
      if ( cmbavCinvd_estado.getItemCount() > 0 )
      {
         AV15cInvd_Estado = cmbavCinvd_estado.getValidValue(AV15cInvd_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_Estado", AV15cInvd_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6D2( ) ;
      rf6D16( ) ;
      rf6D15( ) ;
      rf6D14( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCregi_cod_Enabled, 5, 0)), true);
      edtavCregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCregi_descripcion_Enabled, 5, 0)), true);
      edtavCcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcent_codigo_Enabled, 5, 0)), true);
      edtavCcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcent_descripcion_Enabled, 5, 0)), true);
      cmbavCinvd_moduloalmacen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_moduloalmacen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCinvd_moduloalmacen.getEnabled(), 5, 0)), true);
      edtavCinvd_almacencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_almacencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_almacencodigo_Enabled, 5, 0)), true);
      edtavCalma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCalma_descripcion_Enabled, 5, 0)), true);
      edtavCinvd_bodegacodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_bodegacodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_bodegacodigo_Enabled, 5, 0)), true);
      edtavCbarea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCbarea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCbarea_descripcion_Enabled, 5, 0)), true);
      edtavCuen_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Enabled, 5, 0)), true);
      edtavCcuen_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcuen_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcuen_nombre_Enabled, 5, 0)), true);
      edtavCclas_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCclas_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCclas_codigo_Enabled, 5, 0)), true);
      edtavCclas_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCclas_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCclas_descripcion_Enabled, 5, 0)), true);
      edtavCelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_consecutivo_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavCtipo_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtipo_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtipo_descripcion_Enabled, 5, 0)), true);
      edtavCelem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_descripcion_Enabled, 5, 0)), true);
      edtavCcata_vidautil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_vidautil_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_vidautil_Enabled, 5, 0)), true);
      edtavCtdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_placapadre_Enabled, 5, 0)), true);
      edtavCtdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valorunitario_Enabled, 5, 0)), true);
      edtavCtdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_otros_costos_Enabled, 5, 0)), true);
      edtavCtdet_valor_futuro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valor_futuro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valor_futuro_Enabled, 5, 0)), true);
      edtavCtdet_taza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_taza_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_taza_Enabled, 5, 0)), true);
      edtavCtdet_plazo_n_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_plazo_n_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_plazo_n_Enabled, 5, 0)), true);
      edtavCtdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valor_presente_Enabled, 5, 0)), true);
      edtavCtdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valortotal_Enabled, 5, 0)), true);
      edtavCinvd_fechaadquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_fechaadquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_fechaadquisicion_Enabled, 5, 0)), true);
      cmbavCinvd_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCinvd_estado.getEnabled(), 5, 0)), true);
      edtavCtlgtran_centrocostocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_centrocostocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_centrocostocodigo_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_codigomovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_codigomovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_codigomovimiento_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_descripcionmovimiento_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_consecutivocc_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_fecharegistro_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_cedulacuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_cedulacuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_cedulacuentadantedestino_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_nombcuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_nombcuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_nombcuentadantedestino_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      cmbavCtlgtran_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtlgtran_estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtlgtran_estado.getEnabled(), 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtdet_listdescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_listdescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_listdescripcion_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlgtdet_valoratributo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_valoratributo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_valoratributo_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlgelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgelem_consecutivo_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgcata_descripcion_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlginvd_numeroplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlginvd_numeroplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlginvd_numeroplaca_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgmarca_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgserial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgserial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgserial_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgmodelo_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgtdet_observaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_observaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_observaciones_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_fecharegistro_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_identificador_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtltnov_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltnov_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltnov_descripcion_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_placa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_placa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_placa_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_valornuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
   }

   public void rf6D2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridtrazaContainer.ClearRows();
      }
      wbStart = (short)(144) ;
      nGXsfl_144_idx = (short)(1) ;
      sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1442( ) ;
      bGXsfl_144_Refreshing = true ;
      GridtrazaContainer.AddObjectProperty("GridName", "Gridtraza");
      GridtrazaContainer.AddObjectProperty("CmpContext", "");
      GridtrazaContainer.AddObjectProperty("InMasterPage", "false");
      GridtrazaContainer.AddObjectProperty("Class", "WorkWith");
      GridtrazaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridtrazaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridtrazaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtraza_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridtrazaContainer.setPageSize( subgridtraza_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1442( ) ;
         e166D2 ();
         if ( ( GRIDTRAZA_nCurrentRecord > 0 ) && ( GRIDTRAZA_nGridOutOfScope == 0 ) && ( nGXsfl_144_idx == 1 ) )
         {
            GRIDTRAZA_nCurrentRecord = 0 ;
            GRIDTRAZA_nGridOutOfScope = 1 ;
            subgridtraza_firstpage( ) ;
            e166D2 ();
         }
         wbEnd = (short)(144) ;
         wb6D0( ) ;
      }
      bGXsfl_144_Refreshing = true ;
   }

   public void rf6D14( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(191) ;
      nGXsfl_191_idx = (short)(1) ;
      sGXsfl_191_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_19114( ) ;
      bGXsfl_191_Refreshing = true ;
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
         subsflControlProps_19114( ) ;
         e146D14 ();
         wbEnd = (short)(191) ;
         wb6D0( ) ;
      }
      bGXsfl_191_Refreshing = true ;
   }

   public void rf6D15( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhijosContainer.ClearRows();
      }
      wbStart = (short)(176) ;
      nGXsfl_176_idx = (short)(1) ;
      sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_17615( ) ;
      bGXsfl_176_Refreshing = true ;
      GridhijosContainer.AddObjectProperty("GridName", "Gridhijos");
      GridhijosContainer.AddObjectProperty("CmpContext", "");
      GridhijosContainer.AddObjectProperty("InMasterPage", "false");
      GridhijosContainer.AddObjectProperty("Class", "WorkWith");
      GridhijosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhijosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhijosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhijos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhijosContainer.setPageSize( subgridhijos_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_17615( ) ;
         e136D15 ();
         if ( ( GRIDHIJOS_nCurrentRecord > 0 ) && ( GRIDHIJOS_nGridOutOfScope == 0 ) && ( nGXsfl_176_idx == 1 ) )
         {
            GRIDHIJOS_nCurrentRecord = 0 ;
            GRIDHIJOS_nGridOutOfScope = 1 ;
            subgridhijos_firstpage( ) ;
            e136D15 ();
         }
         wbEnd = (short)(176) ;
         wb6D0( ) ;
      }
      bGXsfl_176_Refreshing = true ;
   }

   public void rf6D16( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridatributosContainer.ClearRows();
      }
      wbStart = (short)(163) ;
      nGXsfl_163_idx = (short)(1) ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_16316( ) ;
      bGXsfl_163_Refreshing = true ;
      GridatributosContainer.AddObjectProperty("GridName", "Gridatributos");
      GridatributosContainer.AddObjectProperty("CmpContext", "");
      GridatributosContainer.AddObjectProperty("InMasterPage", "false");
      GridatributosContainer.AddObjectProperty("Class", "WorkWith");
      GridatributosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridatributosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridatributosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridatributos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridatributosContainer.setPageSize( subgridatributos_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_16316( ) ;
         e126D16 ();
         wbEnd = (short)(163) ;
         wb6D0( ) ;
      }
      bGXsfl_163_Refreshing = true ;
   }

   public int subgridtraza_pagecount( )
   {
      GRIDTRAZA_nRecordCount = subgridtraza_recordcount( ) ;
      if ( ((int)((GRIDTRAZA_nRecordCount) % (subgridtraza_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDTRAZA_nRecordCount/ (double) (subgridtraza_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDTRAZA_nRecordCount/ (double) (subgridtraza_recordsperpage( )))+1) ;
   }

   public int subgridtraza_recordcount( )
   {
      return AV39SDTHVTraza.size() ;
   }

   public int subgridtraza_recordsperpage( )
   {
      if ( subGridtraza_Rows > 0 )
      {
         return subGridtraza_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridtraza_currentpage( )
   {
      return (int)(GXutil.Int( GRIDTRAZA_nFirstRecordOnPage/ (double) (subgridtraza_recordsperpage( )))+1) ;
   }

   public short subgridtraza_firstpage( )
   {
      GRIDTRAZA_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgridtraza_refresh( subGridtraza_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgridtraza_nextpage( )
   {
      GRIDTRAZA_nRecordCount = subgridtraza_recordcount( ) ;
      if ( ( GRIDTRAZA_nRecordCount >= subgridtraza_recordsperpage( ) ) && ( GRIDTRAZA_nEOF == 0 ) )
      {
         GRIDTRAZA_nFirstRecordOnPage = (long)(GRIDTRAZA_nFirstRecordOnPage+subgridtraza_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridtraza_refresh( subGridtraza_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridtrazaContainer.AddObjectProperty("GRIDTRAZA_nFirstRecordOnPage", GRIDTRAZA_nFirstRecordOnPage);
      return (short)(((GRIDTRAZA_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridtraza_previouspage( )
   {
      if ( GRIDTRAZA_nFirstRecordOnPage >= subgridtraza_recordsperpage( ) )
      {
         GRIDTRAZA_nFirstRecordOnPage = (long)(GRIDTRAZA_nFirstRecordOnPage-subgridtraza_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridtraza_refresh( subGridtraza_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgridtraza_lastpage( )
   {
      GRIDTRAZA_nRecordCount = subgridtraza_recordcount( ) ;
      if ( GRIDTRAZA_nRecordCount > subgridtraza_recordsperpage( ) )
      {
         if ( ((int)((GRIDTRAZA_nRecordCount) % (subgridtraza_recordsperpage( )))) == 0 )
         {
            GRIDTRAZA_nFirstRecordOnPage = (long)(GRIDTRAZA_nRecordCount-subgridtraza_recordsperpage( )) ;
         }
         else
         {
            GRIDTRAZA_nFirstRecordOnPage = (long)(GRIDTRAZA_nRecordCount-((int)((GRIDTRAZA_nRecordCount) % (subgridtraza_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDTRAZA_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridtraza_refresh( subGridtraza_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgridtraza_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDTRAZA_nFirstRecordOnPage = (long)(subgridtraza_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDTRAZA_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridtraza_refresh( subGridtraza_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
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

   public int subgridhijos_pagecount( )
   {
      GRIDHIJOS_nRecordCount = subgridhijos_recordcount( ) ;
      if ( ((int)((GRIDHIJOS_nRecordCount) % (subgridhijos_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDHIJOS_nRecordCount/ (double) (subgridhijos_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDHIJOS_nRecordCount/ (double) (subgridhijos_recordsperpage( )))+1) ;
   }

   public int subgridhijos_recordcount( )
   {
      return AV32SDTHVHijos.size() ;
   }

   public int subgridhijos_recordsperpage( )
   {
      if ( subGridhijos_Rows > 0 )
      {
         return subGridhijos_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridhijos_currentpage( )
   {
      return (int)(GXutil.Int( GRIDHIJOS_nFirstRecordOnPage/ (double) (subgridhijos_recordsperpage( )))+1) ;
   }

   public short subgridhijos_firstpage( )
   {
      GRIDHIJOS_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhijos_refresh( subGridhijos_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgridhijos_nextpage( )
   {
      GRIDHIJOS_nRecordCount = subgridhijos_recordcount( ) ;
      if ( ( GRIDHIJOS_nRecordCount >= subgridhijos_recordsperpage( ) ) && ( GRIDHIJOS_nEOF == 0 ) )
      {
         GRIDHIJOS_nFirstRecordOnPage = (long)(GRIDHIJOS_nFirstRecordOnPage+subgridhijos_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhijos_refresh( subGridhijos_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridhijosContainer.AddObjectProperty("GRIDHIJOS_nFirstRecordOnPage", GRIDHIJOS_nFirstRecordOnPage);
      return (short)(((GRIDHIJOS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridhijos_previouspage( )
   {
      if ( GRIDHIJOS_nFirstRecordOnPage >= subgridhijos_recordsperpage( ) )
      {
         GRIDHIJOS_nFirstRecordOnPage = (long)(GRIDHIJOS_nFirstRecordOnPage-subgridhijos_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhijos_refresh( subGridhijos_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgridhijos_lastpage( )
   {
      GRIDHIJOS_nRecordCount = subgridhijos_recordcount( ) ;
      if ( GRIDHIJOS_nRecordCount > subgridhijos_recordsperpage( ) )
      {
         if ( ((int)((GRIDHIJOS_nRecordCount) % (subgridhijos_recordsperpage( )))) == 0 )
         {
            GRIDHIJOS_nFirstRecordOnPage = (long)(GRIDHIJOS_nRecordCount-subgridhijos_recordsperpage( )) ;
         }
         else
         {
            GRIDHIJOS_nFirstRecordOnPage = (long)(GRIDHIJOS_nRecordCount-((int)((GRIDHIJOS_nRecordCount) % (subgridhijos_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDHIJOS_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhijos_refresh( subGridhijos_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgridhijos_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDHIJOS_nFirstRecordOnPage = (long)(subgridhijos_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDHIJOS_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhijos_refresh( subGridhijos_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public int subgridatributos_pagecount( )
   {
      return -1 ;
   }

   public int subgridatributos_recordcount( )
   {
      return -1 ;
   }

   public int subgridatributos_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridatributos_currentpage( )
   {
      return -1 ;
   }

   public void strup6D0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCregi_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCregi_cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCregi_cod_Enabled, 5, 0)), true);
      edtavCregi_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCregi_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCregi_descripcion_Enabled, 5, 0)), true);
      edtavCcent_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcent_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcent_codigo_Enabled, 5, 0)), true);
      edtavCcent_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcent_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcent_descripcion_Enabled, 5, 0)), true);
      cmbavCinvd_moduloalmacen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_moduloalmacen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCinvd_moduloalmacen.getEnabled(), 5, 0)), true);
      edtavCinvd_almacencodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_almacencodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_almacencodigo_Enabled, 5, 0)), true);
      edtavCalma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCalma_descripcion_Enabled, 5, 0)), true);
      edtavCinvd_bodegacodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_bodegacodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_bodegacodigo_Enabled, 5, 0)), true);
      edtavCbarea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCbarea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCbarea_descripcion_Enabled, 5, 0)), true);
      edtavCuen_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Enabled, 5, 0)), true);
      edtavCcuen_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcuen_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcuen_nombre_Enabled, 5, 0)), true);
      edtavCclas_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCclas_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCclas_codigo_Enabled, 5, 0)), true);
      edtavCclas_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCclas_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCclas_descripcion_Enabled, 5, 0)), true);
      edtavCelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_consecutivo_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavCtipo_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtipo_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtipo_descripcion_Enabled, 5, 0)), true);
      edtavCelem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_descripcion_Enabled, 5, 0)), true);
      edtavCcata_vidautil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_vidautil_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_vidautil_Enabled, 5, 0)), true);
      edtavCtdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_placapadre_Enabled, 5, 0)), true);
      edtavCtdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valorunitario_Enabled, 5, 0)), true);
      edtavCtdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_otros_costos_Enabled, 5, 0)), true);
      edtavCtdet_valor_futuro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valor_futuro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valor_futuro_Enabled, 5, 0)), true);
      edtavCtdet_taza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_taza_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_taza_Enabled, 5, 0)), true);
      edtavCtdet_plazo_n_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_plazo_n_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_plazo_n_Enabled, 5, 0)), true);
      edtavCtdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valor_presente_Enabled, 5, 0)), true);
      edtavCtdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtdet_valortotal_Enabled, 5, 0)), true);
      edtavCinvd_fechaadquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCinvd_fechaadquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCinvd_fechaadquisicion_Enabled, 5, 0)), true);
      cmbavCinvd_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCinvd_estado.getEnabled(), 5, 0)), true);
      edtavCtlgtran_centrocostocodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_centrocostocodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_centrocostocodigo_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_codigomovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_codigomovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_codigomovimiento_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_descripcionmovimiento_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_consecutivocc_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_fecharegistro_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_cedulacuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_cedulacuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_cedulacuentadantedestino_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtran_nombcuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtran_nombcuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtran_nombcuentadantedestino_Enabled, 5, 0)), !bGXsfl_144_Refreshing);
      cmbavCtlgtran_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCtlgtran_estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCtlgtran_estado.getEnabled(), 5, 0)), !bGXsfl_144_Refreshing);
      edtavCtlgtdet_listdescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_listdescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_listdescripcion_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlgtdet_valoratributo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_valoratributo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_valoratributo_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlgelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgelem_consecutivo_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgcata_descripcion_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlginvd_numeroplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlginvd_numeroplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlginvd_numeroplaca_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgmarca_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgserial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgserial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgserial_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgmodelo_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlgtdet_observaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlgtdet_observaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlgtdet_observaciones_Enabled, 5, 0)), !bGXsfl_176_Refreshing);
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_fecharegistro_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_identificador_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtltnov_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltnov_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltnov_descripcion_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_placa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_placa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_placa_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valorantiguo_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      edtavCtlnove_valornuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnove_valornuevo_Enabled, 5, 0)), !bGXsfl_191_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e156D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdthvatributos"), AV30SDTHVAtributos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdthvhijos"), AV32SDTHVHijos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtnovedadesbien"), AV53SDTNovedadesBien);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdthvtraza"), AV39SDTHVTraza);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTHVTRAZA"), AV39SDTHVTraza);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCregi_cod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCregi_cod_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCREGI_COD");
            GX_FocusControl = edtavCregi_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19cRegi_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19cRegi_Cod", GXutil.ltrim( GXutil.str( AV19cRegi_Cod, 4, 0)));
         }
         else
         {
            AV19cRegi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCregi_cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19cRegi_Cod", GXutil.ltrim( GXutil.str( AV19cRegi_Cod, 4, 0)));
         }
         AV20cRegi_Descripcion = httpContext.cgiGet( edtavCregi_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cRegi_Descripcion", AV20cRegi_Descripcion);
         AV7cCent_Codigo = httpContext.cgiGet( edtavCcent_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCent_Codigo", AV7cCent_Codigo);
         AV8cCent_Descripcion = httpContext.cgiGet( edtavCcent_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCent_Descripcion", AV8cCent_Descripcion);
         cmbavCinvd_moduloalmacen.setName( cmbavCinvd_moduloalmacen.getInternalname() );
         cmbavCinvd_moduloalmacen.setValue( httpContext.cgiGet( cmbavCinvd_moduloalmacen.getInternalname()) );
         AV17cInvd_ModuloAlmacen = httpContext.cgiGet( cmbavCinvd_moduloalmacen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_ModuloAlmacen", AV17cInvd_ModuloAlmacen);
         AV13cInvd_AlmacenCodigo = httpContext.cgiGet( edtavCinvd_almacencodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cInvd_AlmacenCodigo", AV13cInvd_AlmacenCodigo);
         AV51cAlma_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCalma_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51cAlma_Descripcion", AV51cAlma_Descripcion);
         AV14cInvd_BodegaCodigo = httpContext.cgiGet( edtavCinvd_bodegacodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cInvd_BodegaCodigo", AV14cInvd_BodegaCodigo);
         AV52cBArea_Descripcion = httpContext.cgiGet( edtavCbarea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52cBArea_Descripcion", AV52cBArea_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULA");
            GX_FocusControl = edtavCuen_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50Cuen_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Cuen_Cedula", GXutil.ltrim( GXutil.str( AV50Cuen_Cedula, 18, 0)));
         }
         else
         {
            AV50Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Cuen_Cedula", GXutil.ltrim( GXutil.str( AV50Cuen_Cedula, 18, 0)));
         }
         AV10cCuen_Nombre = GXutil.upper( httpContext.cgiGet( edtavCcuen_nombre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cCuen_Nombre", AV10cCuen_Nombre);
         AV48cClas_Codigo = httpContext.cgiGet( edtavCclas_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48cClas_Codigo", AV48cClas_Codigo);
         AV49cClas_Descripcion = httpContext.cgiGet( edtavCclas_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49cClas_Descripcion", AV49cClas_Descripcion);
         AV11cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cElem_Consecutivo", AV11cElem_Consecutivo);
         AV5cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5cCata_Descripcion", AV5cCata_Descripcion);
         AV24cTipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCtipo_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24cTipo_Descripcion", AV24cTipo_Descripcion);
         AV12cElem_Descripcion = httpContext.cgiGet( edtavCelem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Descripcion", AV12cElem_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcata_vidautil_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcata_vidautil_Internalname), ",", ".") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCATA_VIDAUTIL");
            GX_FocusControl = edtavCcata_vidautil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cCata_VidaUtil = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_VidaUtil", GXutil.ltrim( GXutil.str( AV6cCata_VidaUtil, 3, 0)));
         }
         else
         {
            AV6cCata_VidaUtil = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcata_vidautil_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_VidaUtil", GXutil.ltrim( GXutil.str( AV6cCata_VidaUtil, 3, 0)));
         }
         AV47cTDet_PlacaPadre = httpContext.cgiGet( edtavCtdet_placapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47cTDet_PlacaPadre", AV47cTDet_PlacaPadre);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALORUNITARIO");
            GX_FocusControl = edtavCtdet_valorunitario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22cTDet_ValorUnitario = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22cTDet_ValorUnitario", GXutil.ltrim( GXutil.str( AV22cTDet_ValorUnitario, 18, 2)));
         }
         else
         {
            AV22cTDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valorunitario_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22cTDet_ValorUnitario", GXutil.ltrim( GXutil.str( AV22cTDet_ValorUnitario, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_otros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_otros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_OTROS_COSTOS");
            GX_FocusControl = edtavCtdet_otros_costos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45cTDet_Otros_Costos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45cTDet_Otros_Costos", GXutil.ltrim( GXutil.str( AV45cTDet_Otros_Costos, 18, 2)));
         }
         else
         {
            AV45cTDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavCtdet_otros_costos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45cTDet_Otros_Costos", GXutil.ltrim( GXutil.str( AV45cTDet_Otros_Costos, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_futuro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_futuro_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALOR_FUTURO");
            GX_FocusControl = edtavCtdet_valor_futuro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41cTDet_Valor_Futuro = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41cTDet_Valor_Futuro", GXutil.ltrim( GXutil.str( AV41cTDet_Valor_Futuro, 18, 2)));
         }
         else
         {
            AV41cTDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_futuro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41cTDet_Valor_Futuro", GXutil.ltrim( GXutil.str( AV41cTDet_Valor_Futuro, 18, 2)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_taza_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_taza_Internalname), ",", ".") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_TAZA");
            GX_FocusControl = edtavCtdet_taza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42cTDet_Taza = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42cTDet_Taza", GXutil.ltrim( GXutil.str( AV42cTDet_Taza, 3, 0)));
         }
         else
         {
            AV42cTDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( edtavCtdet_taza_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42cTDet_Taza", GXutil.ltrim( GXutil.str( AV42cTDet_Taza, 3, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_plazo_n_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtdet_plazo_n_Internalname), ",", ".") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_PLAZO_N");
            GX_FocusControl = edtavCtdet_plazo_n_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43cTDet_Plazo_N = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43cTDet_Plazo_N", GXutil.ltrim( GXutil.str( AV43cTDet_Plazo_N, 2, 0)));
         }
         else
         {
            AV43cTDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtdet_plazo_n_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43cTDet_Plazo_N", GXutil.ltrim( GXutil.str( AV43cTDet_Plazo_N, 2, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_presente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_presente_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALOR_PRESENTE");
            GX_FocusControl = edtavCtdet_valor_presente_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44cTDet_Valor_Presente = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44cTDet_Valor_Presente", GXutil.ltrim( GXutil.str( AV44cTDet_Valor_Presente, 18, 2)));
         }
         else
         {
            AV44cTDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valor_presente_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44cTDet_Valor_Presente", GXutil.ltrim( GXutil.str( AV44cTDet_Valor_Presente, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTDET_VALORTOTAL");
            GX_FocusControl = edtavCtdet_valortotal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46cTDet_ValorTotal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46cTDet_ValorTotal", GXutil.ltrim( GXutil.str( AV46cTDet_ValorTotal, 18, 2)));
         }
         else
         {
            AV46cTDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavCtdet_valortotal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46cTDet_ValorTotal", GXutil.ltrim( GXutil.str( AV46cTDet_ValorTotal, 18, 2)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCINVD_FECHAADQUISICION");
            GX_FocusControl = edtavCinvd_fechaadquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16cInvd_FechaAdquisicion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16cInvd_FechaAdquisicion", localUtil.format(AV16cInvd_FechaAdquisicion, "99/99/99"));
         }
         else
         {
            AV16cInvd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16cInvd_FechaAdquisicion", localUtil.format(AV16cInvd_FechaAdquisicion, "99/99/99"));
         }
         cmbavCinvd_estado.setName( cmbavCinvd_estado.getInternalname() );
         cmbavCinvd_estado.setValue( httpContext.cgiGet( cmbavCinvd_estado.getInternalname()) );
         AV15cInvd_Estado = httpContext.cgiGet( cmbavCinvd_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_Estado", AV15cInvd_Estado);
         /* Read saved values. */
         nRC_GXsfl_144 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_144"), ",", ".")) ;
         nRC_GXsfl_163 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_163"), ",", ".")) ;
         nRC_GXsfl_176 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_176"), ",", ".")) ;
         nRC_GXsfl_191 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_191"), ",", ".")) ;
         GRIDTRAZA_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDTRAZA_nFirstRecordOnPage"), ",", ".") ;
         GRIDHIJOS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDHIJOS_nFirstRecordOnPage"), ",", ".") ;
         GRIDTRAZA_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDTRAZA_nEOF"), ",", ".")) ;
         GRIDHIJOS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDHIJOS_nEOF"), ",", ".")) ;
         subGridtraza_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDTRAZA_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_Rows", GXutil.ltrim( localUtil.ntoc( subGridtraza_Rows, (byte)(6), (byte)(0), ".", "")));
         subGridhijos_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDHIJOS_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridhijos_Rows, (byte)(6), (byte)(0), ".", "")));
         Tab2_Class = httpContext.cgiGet( "TAB2_Class") ;
         Tab2_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB2_Pagecount"), ",", ".")) ;
         Tab2_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB2_Historymanagement")) ;
         nRC_GXsfl_144 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_144"), ",", ".")) ;
         nGXsfl_144_fel_idx = (short)(0) ;
         while ( nGXsfl_144_fel_idx < nRC_GXsfl_144 )
         {
            nGXsfl_144_fel_idx = (short)(((subGridtraza_Islastpage==1)&&(nGXsfl_144_fel_idx+1>subgridtraza_recordsperpage( )) ? 1 : nGXsfl_144_fel_idx+1)) ;
            sGXsfl_144_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1442( ) ;
            AV56GXV1 = (short)(nGXsfl_144_fel_idx+GRIDTRAZA_nFirstRecordOnPage) ;
            if ( ( AV39SDTHVTraza.size() >= AV56GXV1 ) && ( AV56GXV1 > 0 ) )
            {
               AV39SDTHVTraza.currentItem( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)) );
            }
         }
         if ( nGXsfl_144_fel_idx == 0 )
         {
            nGXsfl_144_idx = (short)(1) ;
            sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1442( ) ;
         }
         nGXsfl_144_fel_idx = (short)(1) ;
         nRC_GXsfl_163 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_163"), ",", ".")) ;
         nGXsfl_163_fel_idx = (short)(0) ;
         while ( nGXsfl_163_fel_idx < nRC_GXsfl_163 )
         {
            nGXsfl_163_fel_idx = (short)(((subGridatributos_Islastpage==1)&&(nGXsfl_163_fel_idx+1>subgridatributos_recordsperpage( )) ? 1 : nGXsfl_163_fel_idx+1)) ;
            sGXsfl_163_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_16316( ) ;
            AV65GXV2 = nGXsfl_163_fel_idx ;
            if ( ( AV30SDTHVAtributos.size() >= AV65GXV2 ) && ( AV65GXV2 > 0 ) )
            {
               AV30SDTHVAtributos.currentItem( ((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)) );
            }
         }
         if ( nGXsfl_163_fel_idx == 0 )
         {
            nGXsfl_163_idx = (short)(1) ;
            sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_16316( ) ;
         }
         nGXsfl_163_fel_idx = (short)(1) ;
         nRC_GXsfl_176 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_176"), ",", ".")) ;
         nGXsfl_176_fel_idx = (short)(0) ;
         while ( nGXsfl_176_fel_idx < nRC_GXsfl_176 )
         {
            nGXsfl_176_fel_idx = (short)(((subGridhijos_Islastpage==1)&&(nGXsfl_176_fel_idx+1>subgridhijos_recordsperpage( )) ? 1 : nGXsfl_176_fel_idx+1)) ;
            sGXsfl_176_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_17615( ) ;
            AV68GXV3 = (short)(nGXsfl_176_fel_idx+GRIDHIJOS_nFirstRecordOnPage) ;
            if ( ( AV32SDTHVHijos.size() >= AV68GXV3 ) && ( AV68GXV3 > 0 ) )
            {
               AV32SDTHVHijos.currentItem( ((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)) );
            }
         }
         if ( nGXsfl_176_fel_idx == 0 )
         {
            nGXsfl_176_idx = (short)(1) ;
            sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_17615( ) ;
         }
         nGXsfl_176_fel_idx = (short)(1) ;
         nRC_GXsfl_191 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_191"), ",", ".")) ;
         nGXsfl_191_fel_idx = (short)(0) ;
         while ( nGXsfl_191_fel_idx < nRC_GXsfl_191 )
         {
            nGXsfl_191_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_191_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_191_fel_idx+1)) ;
            sGXsfl_191_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_19114( ) ;
            AV76GXV4 = nGXsfl_191_fel_idx ;
            if ( ( AV53SDTNovedadesBien.size() >= AV76GXV4 ) && ( AV76GXV4 > 0 ) )
            {
               AV53SDTNovedadesBien.currentItem( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)) );
            }
         }
         if ( nGXsfl_191_fel_idx == 0 )
         {
            nGXsfl_191_idx = (short)(1) ;
            sGXsfl_191_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_19114( ) ;
         }
         nGXsfl_191_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WP_ALM_HOJAVIDA" ;
         AV17cInvd_ModuloAlmacen = httpContext.cgiGet( cmbavCinvd_moduloalmacen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_ModuloAlmacen", AV17cInvd_ModuloAlmacen);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV17cInvd_ModuloAlmacen, "")) ;
         AV13cInvd_AlmacenCodigo = httpContext.cgiGet( edtavCinvd_almacencodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cInvd_AlmacenCodigo", AV13cInvd_AlmacenCodigo);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV13cInvd_AlmacenCodigo, "")) ;
         AV14cInvd_BodegaCodigo = httpContext.cgiGet( edtavCinvd_bodegacodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cInvd_BodegaCodigo", AV14cInvd_BodegaCodigo);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV14cInvd_BodegaCodigo, "")) ;
         AV11cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cElem_Consecutivo", AV11cElem_Consecutivo);
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV11cElem_Consecutivo, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wp_alm_hojavida:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
      e156D2 ();
      if (returnInSub) return;
   }

   public void e156D2( )
   {
      /* Start Routine */
      lblTitle_Caption = "Numero de Placa: "+AV18cInvd_NumeroPlaca ;
      httpContext.ajax_rsp_assign_prop("", false, lblTitle_Internalname, "Caption", lblTitle_Caption, true);
      Form.setCaption( "Hoja de vida del activo fijo" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      subGridtraza_Rows = 8 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_Rows", GXutil.ltrim( localUtil.ntoc( subGridtraza_Rows, (byte)(6), (byte)(0), ".", "")));
      subGridhijos_Rows = 8 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_Rows", GXutil.ltrim( localUtil.ntoc( subGridhijos_Rows, (byte)(6), (byte)(0), ".", "")));
      subGridtraza_Rows = 8 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_Rows", GXutil.ltrim( localUtil.ntoc( subGridtraza_Rows, (byte)(6), (byte)(0), ".", "")));
      AV30SDTHVAtributos.clear();
      gx_BV163 = true ;
      AV32SDTHVHijos.clear();
      gx_BV176 = true ;
      /* Execute user subroutine: 'DATOSINVENTARIO' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSREGIONAL' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSCENTROCOSTO' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSALMACEN' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSBODEGA' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSDETALLETRANSACCION' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSATRIBUTOS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSTRAZABIEN' */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Invd_EsPlacaPadre, "SI") == 0 )
      {
         /* Execute user subroutine: 'DATOSHIJOS' */
         S192 ();
         if (returnInSub) return;
      }
      GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 = AV53SDTNovedadesBien ;
      GXv_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem2[0] = GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 ;
      new com.orions2.dpnovedadesbien(remoteHandle, context).execute( AV18cInvd_NumeroPlaca, GXv_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem2) ;
      GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 = GXv_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18cInvd_NumeroPlaca", AV18cInvd_NumeroPlaca);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cInvd_NumeroPlaca, ""))));
      AV53SDTNovedadesBien = GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 ;
      gx_BV191 = true ;
   }

   public void S112( )
   {
      /* 'DATOSINVENTARIO' Routine */
      AV35SWGridAtributos = (short)(0) ;
      /* Using cursor H006D2 */
      pr_default.execute(0, new Object[] {AV18cInvd_NumeroPlaca});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H006D2_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = H006D2_A33Tipo_Codigo[0] ;
         A67Invd_NumeroPlaca = H006D2_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = H006D2_A66Elem_Consecutivo[0] ;
         A557Elem_Descripcion = H006D2_A557Elem_Descripcion[0] ;
         A298Cata_Descripcion = H006D2_A298Cata_Descripcion[0] ;
         A34Clas_Codigo = H006D2_A34Clas_Codigo[0] ;
         A291Clas_Descripcion = H006D2_A291Clas_Descripcion[0] ;
         A632Vida_Util = H006D2_A632Vida_Util[0] ;
         n632Vida_Util = H006D2_n632Vida_Util[0] ;
         A253Tipo_Descripcion = H006D2_A253Tipo_Descripcion[0] ;
         A410Invd_RegionalId = H006D2_A410Invd_RegionalId[0] ;
         A411Invd_CentroCostoId = H006D2_A411Invd_CentroCostoId[0] ;
         A412Invd_ModuloAlmacen = H006D2_A412Invd_ModuloAlmacen[0] ;
         A413Invd_AlmacenCodigo = H006D2_A413Invd_AlmacenCodigo[0] ;
         A414Invd_BodegaCodigo = H006D2_A414Invd_BodegaCodigo[0] ;
         A43Cuen_Identificacion = H006D2_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = H006D2_n43Cuen_Identificacion[0] ;
         A688Cuen_Cedula = H006D2_A688Cuen_Cedula[0] ;
         A44Cuen_Nombre = H006D2_A44Cuen_Nombre[0] ;
         n44Cuen_Nombre = H006D2_n44Cuen_Nombre[0] ;
         A501Invd_EsPlacaPadre = H006D2_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = H006D2_n501Invd_EsPlacaPadre[0] ;
         A466Invd_FechaAdquisicion = H006D2_A466Invd_FechaAdquisicion[0] ;
         n466Invd_FechaAdquisicion = H006D2_n466Invd_FechaAdquisicion[0] ;
         A463Invd_Estado = H006D2_A463Invd_Estado[0] ;
         n463Invd_Estado = H006D2_n463Invd_Estado[0] ;
         A465Invd_ValorAdquisicion = H006D2_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = H006D2_n465Invd_ValorAdquisicion[0] ;
         A624Costo_Desmante = H006D2_A624Costo_Desmante[0] ;
         n624Costo_Desmante = H006D2_n624Costo_Desmante[0] ;
         A625Variable_VF = H006D2_A625Variable_VF[0] ;
         n625Variable_VF = H006D2_n625Variable_VF[0] ;
         A626Variable_I = H006D2_A626Variable_I[0] ;
         n626Variable_I = H006D2_n626Variable_I[0] ;
         A627Variable_N = H006D2_A627Variable_N[0] ;
         n627Variable_N = H006D2_n627Variable_N[0] ;
         A628Otros_Costos_Dev = H006D2_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = H006D2_n628Otros_Costos_Dev[0] ;
         A629Costo_Total_Dev = H006D2_A629Costo_Total_Dev[0] ;
         A68Invd_PlacaPadre = H006D2_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H006D2_n68Invd_PlacaPadre[0] ;
         A37Cata_Codigo = H006D2_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = H006D2_A33Tipo_Codigo[0] ;
         A557Elem_Descripcion = H006D2_A557Elem_Descripcion[0] ;
         A632Vida_Util = H006D2_A632Vida_Util[0] ;
         n632Vida_Util = H006D2_n632Vida_Util[0] ;
         A298Cata_Descripcion = H006D2_A298Cata_Descripcion[0] ;
         A34Clas_Codigo = H006D2_A34Clas_Codigo[0] ;
         A291Clas_Descripcion = H006D2_A291Clas_Descripcion[0] ;
         A253Tipo_Descripcion = H006D2_A253Tipo_Descripcion[0] ;
         A688Cuen_Cedula = H006D2_A688Cuen_Cedula[0] ;
         A44Cuen_Nombre = H006D2_A44Cuen_Nombre[0] ;
         n44Cuen_Nombre = H006D2_n44Cuen_Nombre[0] ;
         AV11cElem_Consecutivo = A66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cElem_Consecutivo", AV11cElem_Consecutivo);
         AV12cElem_Descripcion = A557Elem_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Descripcion", AV12cElem_Descripcion);
         AV5cCata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5cCata_Descripcion", AV5cCata_Descripcion);
         AV48cClas_Codigo = A34Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48cClas_Codigo", AV48cClas_Codigo);
         AV49cClas_Descripcion = A291Clas_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49cClas_Descripcion", AV49cClas_Descripcion);
         AV6cCata_VidaUtil = A632Vida_Util ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_VidaUtil", GXutil.ltrim( GXutil.str( AV6cCata_VidaUtil, 3, 0)));
         AV24cTipo_Descripcion = A253Tipo_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24cTipo_Descripcion", AV24cTipo_Descripcion);
         AV27Invd_RegionalId = A410Invd_RegionalId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Invd_RegionalId", GXutil.ltrim( GXutil.str( AV27Invd_RegionalId, 11, 0)));
         AV25Invd_CentroCostoId = A411Invd_CentroCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Invd_CentroCostoId", GXutil.ltrim( GXutil.str( AV25Invd_CentroCostoId, 11, 0)));
         AV17cInvd_ModuloAlmacen = A412Invd_ModuloAlmacen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_ModuloAlmacen", AV17cInvd_ModuloAlmacen);
         AV13cInvd_AlmacenCodigo = A413Invd_AlmacenCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cInvd_AlmacenCodigo", AV13cInvd_AlmacenCodigo);
         AV14cInvd_BodegaCodigo = A414Invd_BodegaCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cInvd_BodegaCodigo", AV14cInvd_BodegaCodigo);
         AV9CCuen_Identificacion = A43Cuen_Identificacion ;
         AV50Cuen_Cedula = A688Cuen_Cedula ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Cuen_Cedula", GXutil.ltrim( GXutil.str( AV50Cuen_Cedula, 18, 0)));
         AV10cCuen_Nombre = A44Cuen_Nombre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cCuen_Nombre", AV10cCuen_Nombre);
         AV26Invd_EsPlacaPadre = A501Invd_EsPlacaPadre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Invd_EsPlacaPadre", AV26Invd_EsPlacaPadre);
         AV16cInvd_FechaAdquisicion = A466Invd_FechaAdquisicion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16cInvd_FechaAdquisicion", localUtil.format(AV16cInvd_FechaAdquisicion, "99/99/99"));
         AV15cInvd_Estado = A463Invd_Estado ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_Estado", AV15cInvd_Estado);
         AV22cTDet_ValorUnitario = A465Invd_ValorAdquisicion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22cTDet_ValorUnitario", GXutil.ltrim( GXutil.str( AV22cTDet_ValorUnitario, 18, 2)));
         AV44cTDet_Valor_Presente = A624Costo_Desmante ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44cTDet_Valor_Presente", GXutil.ltrim( GXutil.str( AV44cTDet_Valor_Presente, 18, 2)));
         AV41cTDet_Valor_Futuro = A625Variable_VF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41cTDet_Valor_Futuro", GXutil.ltrim( GXutil.str( AV41cTDet_Valor_Futuro, 18, 2)));
         AV42cTDet_Taza = A626Variable_I ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42cTDet_Taza", GXutil.ltrim( GXutil.str( AV42cTDet_Taza, 3, 0)));
         AV43cTDet_Plazo_N = (byte)(A627Variable_N) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43cTDet_Plazo_N", GXutil.ltrim( GXutil.str( AV43cTDet_Plazo_N, 2, 0)));
         AV45cTDet_Otros_Costos = A628Otros_Costos_Dev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45cTDet_Otros_Costos", GXutil.ltrim( GXutil.str( AV45cTDet_Otros_Costos, 18, 2)));
         AV46cTDet_ValorTotal = A629Costo_Total_Dev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46cTDet_ValorTotal", GXutil.ltrim( GXutil.str( AV46cTDet_ValorTotal, 18, 2)));
         AV47cTDet_PlacaPadre = A68Invd_PlacaPadre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47cTDet_PlacaPadre", AV47cTDet_PlacaPadre);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S122( )
   {
      /* 'DATOSREGIONAL' Routine */
      /* Using cursor H006D3 */
      pr_default.execute(1, new Object[] {new Long(AV27Invd_RegionalId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2Regi_Id = H006D3_A2Regi_Id[0] ;
         A12Regi_Cod = H006D3_A12Regi_Cod[0] ;
         A13Regi_Descripcion = H006D3_A13Regi_Descripcion[0] ;
         AV19cRegi_Cod = A12Regi_Cod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cRegi_Cod", GXutil.ltrim( GXutil.str( AV19cRegi_Cod, 4, 0)));
         AV20cRegi_Descripcion = A13Regi_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cRegi_Descripcion", AV20cRegi_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S132( )
   {
      /* 'DATOSCENTROCOSTO' Routine */
      /* Using cursor H006D4 */
      pr_default.execute(2, new Object[] {new Long(AV25Invd_CentroCostoId)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1Cent_Id = H006D4_A1Cent_Id[0] ;
         A3Cent_Codigo = H006D4_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = H006D4_A4Cent_Descripcion[0] ;
         AV7cCent_Codigo = A3Cent_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCent_Codigo", AV7cCent_Codigo);
         AV8cCent_Descripcion = A4Cent_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCent_Descripcion", AV8cCent_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S142( )
   {
      /* 'DATOSALMACEN' Routine */
      /* Using cursor H006D5 */
      pr_default.execute(3, new Object[] {new Long(AV25Invd_CentroCostoId), AV17cInvd_ModuloAlmacen, AV13cInvd_AlmacenCodigo});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A28Alma_Codigo = H006D5_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H006D5_A27Alma_Modulo[0] ;
         A1Cent_Id = H006D5_A1Cent_Id[0] ;
         A252Alma_Descripcion = H006D5_A252Alma_Descripcion[0] ;
         AV51cAlma_Descripcion = A252Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51cAlma_Descripcion", AV51cAlma_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S152( )
   {
      /* 'DATOSBODEGA' Routine */
      /* Using cursor H006D6 */
      pr_default.execute(4, new Object[] {new Long(AV25Invd_CentroCostoId), AV17cInvd_ModuloAlmacen, AV13cInvd_AlmacenCodigo, AV14cInvd_BodegaCodigo});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A32BArea_Codigo = H006D6_A32BArea_Codigo[0] ;
         n32BArea_Codigo = H006D6_n32BArea_Codigo[0] ;
         A31Bode_Codigo = H006D6_A31Bode_Codigo[0] ;
         A28Alma_Codigo = H006D6_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H006D6_A27Alma_Modulo[0] ;
         A1Cent_Id = H006D6_A1Cent_Id[0] ;
         A610BArea_Descripcion = H006D6_A610BArea_Descripcion[0] ;
         A610BArea_Descripcion = H006D6_A610BArea_Descripcion[0] ;
         AV52cBArea_Descripcion = A610BArea_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52cBArea_Descripcion", AV52cBArea_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S162( )
   {
      /* 'DATOSDETALLETRANSACCION' Routine */
      /* Using cursor H006D7 */
      pr_default.execute(5, new Object[] {AV18cInvd_NumeroPlaca, AV11cElem_Consecutivo});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A481Tran_IndE_S = H006D7_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H006D7_n481Tran_IndE_S[0] ;
         A490TDet_PlacaNumero = H006D7_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H006D7_n490TDet_PlacaNumero[0] ;
         A66Elem_Consecutivo = H006D7_A66Elem_Consecutivo[0] ;
         A69TDet_Consecutivo = H006D7_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006D7_A46Tran_Id[0] ;
         A481Tran_IndE_S = H006D7_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H006D7_n481Tran_IndE_S[0] ;
         AV37Tran_Id = A46Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Tran_Id", GXutil.ltrim( GXutil.str( AV37Tran_Id, 11, 0)));
         AV36TDet_Consecutivo = A69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV36TDet_Consecutivo, 18, 0)));
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S172( )
   {
      /* 'DATOSATRIBUTOS' Routine */
      /* Using cursor H006D8 */
      pr_default.execute(6, new Object[] {new Long(AV37Tran_Id), new Long(AV36TDet_Consecutivo)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A69TDet_Consecutivo = H006D8_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006D8_A46Tran_Id[0] ;
         A492TDet_ListDescripcion = H006D8_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = H006D8_n492TDet_ListDescripcion[0] ;
         A494TDet_ValorAtributo = H006D8_A494TDet_ValorAtributo[0] ;
         A70TDet_ListId = H006D8_A70TDet_ListId[0] ;
         A492TDet_ListDescripcion = H006D8_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = H006D8_n492TDet_ListDescripcion[0] ;
         AV31SDTHVAtributosItem = (com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)new com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem(remoteHandle, context);
         AV31SDTHVAtributosItem.setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion( A492TDet_ListDescripcion );
         AV31SDTHVAtributosItem.setgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo( A494TDet_ValorAtributo );
         AV30SDTHVAtributos.add(AV31SDTHVAtributosItem, 0);
         gx_BV163 = true ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S192( )
   {
      /* 'DATOSHIJOS' Routine */
      /* Using cursor H006D9 */
      pr_default.execute(7, new Object[] {AV18cInvd_NumeroPlaca});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A37Cata_Codigo = H006D9_A37Cata_Codigo[0] ;
         A68Invd_PlacaPadre = H006D9_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H006D9_n68Invd_PlacaPadre[0] ;
         A66Elem_Consecutivo = H006D9_A66Elem_Consecutivo[0] ;
         A298Cata_Descripcion = H006D9_A298Cata_Descripcion[0] ;
         A67Invd_NumeroPlaca = H006D9_A67Invd_NumeroPlaca[0] ;
         A37Cata_Codigo = H006D9_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H006D9_A298Cata_Descripcion[0] ;
         AV33SDTHVHijosItem = (com.orions2.SdtSDTHVHijos_SDTHVHijosItem)new com.orions2.SdtSDTHVHijos_SDTHVHijosItem(remoteHandle, context);
         AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo( A66Elem_Consecutivo );
         AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion( A298Cata_Descripcion );
         AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca( A67Invd_NumeroPlaca );
         /* Execute user subroutine: 'DATOSDETALLETRANSACCIONHIJOS' */
         S2010 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            returnInSub = true;
            if (true) return;
         }
         AV32SDTHVHijos.add(AV33SDTHVHijosItem, 0);
         gx_BV176 = true ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S2010( )
   {
      /* 'DATOSDETALLETRANSACCIONHIJOS' Routine */
      /* Using cursor H006D10 */
      pr_default.execute(8, new Object[] {AV33SDTHVHijosItem.getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo(), AV33SDTHVHijosItem.getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca()});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A481Tran_IndE_S = H006D10_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H006D10_n481Tran_IndE_S[0] ;
         A490TDet_PlacaNumero = H006D10_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H006D10_n490TDet_PlacaNumero[0] ;
         A66Elem_Consecutivo = H006D10_A66Elem_Consecutivo[0] ;
         A69TDet_Consecutivo = H006D10_A69TDet_Consecutivo[0] ;
         A504TDet_Observaciones = H006D10_A504TDet_Observaciones[0] ;
         n504TDet_Observaciones = H006D10_n504TDet_Observaciones[0] ;
         A46Tran_Id = H006D10_A46Tran_Id[0] ;
         A481Tran_IndE_S = H006D10_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H006D10_n481Tran_IndE_S[0] ;
         AV37Tran_Id = A46Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Tran_Id", GXutil.ltrim( GXutil.str( AV37Tran_Id, 11, 0)));
         AV36TDet_Consecutivo = A69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV36TDet_Consecutivo, 18, 0)));
         AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones( A504TDet_Observaciones );
         /* Execute user subroutine: 'DATOSATRIBUTOSHIJOS' */
         S2111 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S2111( )
   {
      /* 'DATOSATRIBUTOSHIJOS' Routine */
      /* Using cursor H006D11 */
      pr_default.execute(9, new Object[] {new Long(AV37Tran_Id), new Long(AV36TDet_Consecutivo)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A69TDet_Consecutivo = H006D11_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006D11_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006D11_A494TDet_ValorAtributo[0] ;
         A70TDet_ListId = H006D11_A70TDet_ListId[0] ;
         if ( A70TDet_ListId == 1 )
         {
            AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca( A494TDet_ValorAtributo );
         }
         else if ( A70TDet_ListId == 2 )
         {
            AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial( A494TDet_ValorAtributo );
         }
         else if ( A70TDet_ListId == 3 )
         {
            AV33SDTHVHijosItem.setgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo( A494TDet_ValorAtributo );
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S182( )
   {
      /* 'DATOSTRAZABIEN' Routine */
      /* Using cursor H006D12 */
      pr_default.execute(10, new Object[] {AV18cInvd_NumeroPlaca});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A46Tran_Id = H006D12_A46Tran_Id[0] ;
         A48Tran_CentroCostoId = H006D12_A48Tran_CentroCostoId[0] ;
         A490TDet_PlacaNumero = H006D12_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H006D12_n490TDet_PlacaNumero[0] ;
         A419Tran_CentroCostoCodigo = H006D12_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H006D12_n419Tran_CentroCostoCodigo[0] ;
         A49Tran_CodigoMovimiento = H006D12_A49Tran_CodigoMovimiento[0] ;
         A513Tran_ConsecutivoCC = H006D12_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H006D12_n513Tran_ConsecutivoCC[0] ;
         A381Tran_DescripcionMovimiento = H006D12_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H006D12_n381Tran_DescripcionMovimiento[0] ;
         A58Tran_Estado = H006D12_A58Tran_Estado[0] ;
         n58Tran_Estado = H006D12_n58Tran_Estado[0] ;
         A52Tran_IdCuentadanteDestino = H006D12_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = H006D12_n52Tran_IdCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = H006D12_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = H006D12_n704Tran_CedulaCuentadanteDestino[0] ;
         A389Tran_NombCuentadanteDestino = H006D12_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H006D12_n389Tran_NombCuentadanteDestino[0] ;
         A55Tran_FechaRegistro = H006D12_A55Tran_FechaRegistro[0] ;
         A48Tran_CentroCostoId = H006D12_A48Tran_CentroCostoId[0] ;
         A49Tran_CodigoMovimiento = H006D12_A49Tran_CodigoMovimiento[0] ;
         A513Tran_ConsecutivoCC = H006D12_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H006D12_n513Tran_ConsecutivoCC[0] ;
         A58Tran_Estado = H006D12_A58Tran_Estado[0] ;
         n58Tran_Estado = H006D12_n58Tran_Estado[0] ;
         A52Tran_IdCuentadanteDestino = H006D12_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = H006D12_n52Tran_IdCuentadanteDestino[0] ;
         A55Tran_FechaRegistro = H006D12_A55Tran_FechaRegistro[0] ;
         A419Tran_CentroCostoCodigo = H006D12_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H006D12_n419Tran_CentroCostoCodigo[0] ;
         A381Tran_DescripcionMovimiento = H006D12_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H006D12_n381Tran_DescripcionMovimiento[0] ;
         A704Tran_CedulaCuentadanteDestino = H006D12_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = H006D12_n704Tran_CedulaCuentadanteDestino[0] ;
         A389Tran_NombCuentadanteDestino = H006D12_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H006D12_n389Tran_NombCuentadanteDestino[0] ;
         AV40SDTHVTrazaItem = (com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)new com.orions2.SdtSDTHVTraza_SDTHVTrazaItem(remoteHandle, context);
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo( A419Tran_CentroCostoCodigo );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento( A49Tran_CodigoMovimiento );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc( A513Tran_ConsecutivoCC );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento( A381Tran_DescripcionMovimiento );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado( A58Tran_Estado );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_idcuentadantedestino( A52Tran_IdCuentadanteDestino );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino( A704Tran_CedulaCuentadanteDestino );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino( A389Tran_NombCuentadanteDestino );
         AV40SDTHVTrazaItem.setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro( A55Tran_FechaRegistro );
         AV39SDTHVTraza.add(AV40SDTHVTrazaItem, 0);
         gx_BV144 = true ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void e116D2( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e166D2( )
   {
      /* Gridtraza_Load Routine */
      AV56GXV1 = (short)(1) ;
      while ( AV56GXV1 <= AV39SDTHVTraza.size() )
      {
         AV39SDTHVTraza.currentItem( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(144) ;
         }
         if ( ( subGridtraza_Islastpage == 1 ) || ( subGridtraza_Rows == 0 ) || ( ( GRIDTRAZA_nCurrentRecord >= GRIDTRAZA_nFirstRecordOnPage ) && ( GRIDTRAZA_nCurrentRecord < GRIDTRAZA_nFirstRecordOnPage + subgridtraza_recordsperpage( ) ) ) )
         {
            sendrow_1442( ) ;
            GRIDTRAZA_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDTRAZA_nCurrentRecord + 1 >= subgridtraza_recordcount( ) )
            {
               GRIDTRAZA_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDTRAZA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDTRAZA_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDTRAZA_nCurrentRecord = (long)(GRIDTRAZA_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_144_Refreshing )
         {
            httpContext.doAjaxLoad(144, GridtrazaRow);
         }
         AV56GXV1 = (short)(AV56GXV1+1) ;
      }
   }

   private void e146D14( )
   {
      /* Grid1_Load Routine */
      AV76GXV4 = (short)(1) ;
      while ( AV76GXV4 <= AV53SDTNovedadesBien.size() )
      {
         AV53SDTNovedadesBien.currentItem( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(191) ;
         }
         sendrow_19114( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_191_Refreshing )
         {
            httpContext.doAjaxLoad(191, Grid1Row);
         }
         AV76GXV4 = (short)(AV76GXV4+1) ;
      }
   }

   private void e136D15( )
   {
      /* Gridhijos_Load Routine */
      AV68GXV3 = (short)(1) ;
      while ( AV68GXV3 <= AV32SDTHVHijos.size() )
      {
         AV32SDTHVHijos.currentItem( ((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(176) ;
         }
         if ( ( subGridhijos_Islastpage == 1 ) || ( subGridhijos_Rows == 0 ) || ( ( GRIDHIJOS_nCurrentRecord >= GRIDHIJOS_nFirstRecordOnPage ) && ( GRIDHIJOS_nCurrentRecord < GRIDHIJOS_nFirstRecordOnPage + subgridhijos_recordsperpage( ) ) ) )
         {
            sendrow_17615( ) ;
            GRIDHIJOS_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDHIJOS_nCurrentRecord + 1 >= subgridhijos_recordcount( ) )
            {
               GRIDHIJOS_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRIDHIJOS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHIJOS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDHIJOS_nCurrentRecord = (long)(GRIDHIJOS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_176_Refreshing )
         {
            httpContext.doAjaxLoad(176, GridhijosRow);
         }
         AV68GXV3 = (short)(AV68GXV3+1) ;
      }
   }

   private void e126D16( )
   {
      /* Gridatributos_Load Routine */
      AV65GXV2 = (short)(1) ;
      while ( AV65GXV2 <= AV30SDTHVAtributos.size() )
      {
         AV30SDTHVAtributos.currentItem( ((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(163) ;
         }
         sendrow_16316( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_163_Refreshing )
         {
            httpContext.doAjaxLoad(163, GridatributosRow);
         }
         AV65GXV2 = (short)(AV65GXV2+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV18cInvd_NumeroPlaca = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18cInvd_NumeroPlaca", AV18cInvd_NumeroPlaca);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cInvd_NumeroPlaca, ""))));
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
      pa6D2( ) ;
      ws6D2( ) ;
      we6D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141421023");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_alm_hojavida.js", "?20186141421023");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1442( )
   {
      edtavCtlgtran_centrocostocodigo_Internalname = "CTLGTRAN_CENTROCOSTOCODIGO_"+sGXsfl_144_idx ;
      edtavCtlgtran_codigomovimiento_Internalname = "CTLGTRAN_CODIGOMOVIMIENTO_"+sGXsfl_144_idx ;
      edtavCtlgtran_descripcionmovimiento_Internalname = "CTLGTRAN_DESCRIPCIONMOVIMIENTO_"+sGXsfl_144_idx ;
      edtavCtlgtran_consecutivocc_Internalname = "CTLGTRAN_CONSECUTIVOCC_"+sGXsfl_144_idx ;
      edtavCtlgtran_fecharegistro_Internalname = "CTLGTRAN_FECHAREGISTRO_"+sGXsfl_144_idx ;
      edtavCtlgtran_cedulacuentadantedestino_Internalname = "CTLGTRAN_CEDULACUENTADANTEDESTINO_"+sGXsfl_144_idx ;
      edtavCtlgtran_nombcuentadantedestino_Internalname = "CTLGTRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_144_idx ;
      cmbavCtlgtran_estado.setInternalname( "CTLGTRAN_ESTADO_"+sGXsfl_144_idx );
   }

   public void subsflControlProps_fel_1442( )
   {
      edtavCtlgtran_centrocostocodigo_Internalname = "CTLGTRAN_CENTROCOSTOCODIGO_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_codigomovimiento_Internalname = "CTLGTRAN_CODIGOMOVIMIENTO_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_descripcionmovimiento_Internalname = "CTLGTRAN_DESCRIPCIONMOVIMIENTO_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_consecutivocc_Internalname = "CTLGTRAN_CONSECUTIVOCC_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_fecharegistro_Internalname = "CTLGTRAN_FECHAREGISTRO_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_cedulacuentadantedestino_Internalname = "CTLGTRAN_CEDULACUENTADANTEDESTINO_"+sGXsfl_144_fel_idx ;
      edtavCtlgtran_nombcuentadantedestino_Internalname = "CTLGTRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_144_fel_idx ;
      cmbavCtlgtran_estado.setInternalname( "CTLGTRAN_ESTADO_"+sGXsfl_144_fel_idx );
   }

   public void sendrow_1442( )
   {
      subsflControlProps_1442( ) ;
      wb6D0( ) ;
      if ( ( subGridtraza_Rows * 1 == 0 ) || ( nGXsfl_144_idx <= subgridtraza_recordsperpage( ) * 1 ) )
      {
         GridtrazaRow = GXWebRow.GetNew(context,GridtrazaContainer) ;
         if ( subGridtraza_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridtraza_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridtraza_Class, "") != 0 )
            {
               subGridtraza_Linesclass = subGridtraza_Class+"Odd" ;
            }
         }
         else if ( subGridtraza_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridtraza_Backstyle = (byte)(0) ;
            subGridtraza_Backcolor = subGridtraza_Allbackcolor ;
            if ( GXutil.strcmp(subGridtraza_Class, "") != 0 )
            {
               subGridtraza_Linesclass = subGridtraza_Class+"Uniform" ;
            }
         }
         else if ( subGridtraza_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridtraza_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridtraza_Class, "") != 0 )
            {
               subGridtraza_Linesclass = subGridtraza_Class+"Odd" ;
            }
            subGridtraza_Backcolor = (int)(0x0) ;
         }
         else if ( subGridtraza_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridtraza_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_144_idx) % (2))) == 0 )
            {
               subGridtraza_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridtraza_Class, "") != 0 )
               {
                  subGridtraza_Linesclass = subGridtraza_Class+"Even" ;
               }
            }
            else
            {
               subGridtraza_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridtraza_Class, "") != 0 )
               {
                  subGridtraza_Linesclass = subGridtraza_Class+"Odd" ;
               }
            }
         }
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_144_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_centrocostocodigo_Internalname,((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_centrocostocodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlgtran_centrocostocodigo_Enabled),new Integer(0),"text","",new Integer(106),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_codigomovimiento_Internalname,((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_codigomovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlgtran_codigomovimiento_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_descripcionmovimiento_Internalname,((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_descripcionmovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlgtran_descripcionmovimiento_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_consecutivocc_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc(), (byte)(18), (byte)(0), ",", "")),((edtavCtlgtran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_consecutivocc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgtran_consecutivocc_Enabled),new Integer(0),"text","",new Integer(154),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_fecharegistro_Internalname,localUtil.ttoc( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro(), 10, 8, 0, 3, "/", ":", " "),localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro(), "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_fecharegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgtran_fecharegistro_Enabled),new Integer(0),"text","",new Integer(122),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_cedulacuentadantedestino_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino(), (byte)(18), (byte)(0), ",", "")),((edtavCtlgtran_cedulacuentadantedestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_cedulacuentadantedestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlgtran_cedulacuentadantedestino_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridtrazaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtran_nombcuentadantedestino_Internalname,((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtran_nombcuentadantedestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlgtran_nombcuentadantedestino_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridtrazaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_144_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CTLGTRAN_ESTADO_" + sGXsfl_144_idx ;
            cmbavCtlgtran_estado.setName( GXCCtl );
            cmbavCtlgtran_estado.setWebtags( "" );
            cmbavCtlgtran_estado.addItem("A", "Anulado", (short)(0));
            cmbavCtlgtran_estado.addItem("R", "Ratificado", (short)(0));
            cmbavCtlgtran_estado.addItem("P", "Pendiente", (short)(0));
            cmbavCtlgtran_estado.addItem("I", "Incompleto", (short)(0));
            if ( cmbavCtlgtran_estado.getItemCount() > 0 )
            {
               if ( ( AV56GXV1 > 0 ) && ( AV39SDTHVTraza.size() >= AV56GXV1 ) && (GXutil.strcmp("", ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado())==0) )
               {
                  ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).setgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado( cmbavCtlgtran_estado.getValidValue(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado()) );
               }
            }
         }
         /* ComboBox */
         GridtrazaRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavCtlgtran_estado,cmbavCtlgtran_estado.getInternalname(),GXutil.rtrim( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado()),new Integer(1),cmbavCtlgtran_estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbavCtlgtran_estado.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbavCtlgtran_estado.setValue( GXutil.rtrim( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtlgtran_estado.getInternalname(), "Values", cmbavCtlgtran_estado.ToJavascriptSource(), !bGXsfl_144_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_CENTROCOSTOCODIGO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_centrocostocodigo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_CODIGOMOVIMIENTO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_codigomovimiento(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_DESCRIPCIONMOVIMIENTO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_descripcionmovimiento(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_CONSECUTIVOCC"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_FECHAREGISTRO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_fecharegistro(), "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_CEDULACUENTADANTEDESTINO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_cedulacuentadantedestino()), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_NOMBCUENTADANTEDESTINO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_nombcuentadantedestino(), "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLGTRAN_ESTADO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVTraza_SDTHVTrazaItem)AV39SDTHVTraza.elementAt(-1+AV56GXV1)).getgxTv_SdtSDTHVTraza_SDTHVTrazaItem_Gtran_estado(), ""))));
         GridtrazaContainer.AddRow(GridtrazaRow);
         nGXsfl_144_idx = (short)(((subGridtraza_Islastpage==1)&&(nGXsfl_144_idx+1>subgridtraza_recordsperpage( )) ? 1 : nGXsfl_144_idx+1)) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1442( ) ;
      }
      /* End function sendrow_1442 */
   }

   public void subsflControlProps_16316( )
   {
      edtavCtlgtdet_listdescripcion_Internalname = "CTLGTDET_LISTDESCRIPCION_"+sGXsfl_163_idx ;
      edtavCtlgtdet_valoratributo_Internalname = "CTLGTDET_VALORATRIBUTO_"+sGXsfl_163_idx ;
   }

   public void subsflControlProps_fel_16316( )
   {
      edtavCtlgtdet_listdescripcion_Internalname = "CTLGTDET_LISTDESCRIPCION_"+sGXsfl_163_fel_idx ;
      edtavCtlgtdet_valoratributo_Internalname = "CTLGTDET_VALORATRIBUTO_"+sGXsfl_163_fel_idx ;
   }

   public void sendrow_16316( )
   {
      subsflControlProps_16316( ) ;
      wb6D0( ) ;
      GridatributosRow = GXWebRow.GetNew(context,GridatributosContainer) ;
      if ( subGridatributos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridatributos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridatributos_Class, "") != 0 )
         {
            subGridatributos_Linesclass = subGridatributos_Class+"Odd" ;
         }
      }
      else if ( subGridatributos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridatributos_Backstyle = (byte)(0) ;
         subGridatributos_Backcolor = subGridatributos_Allbackcolor ;
         if ( GXutil.strcmp(subGridatributos_Class, "") != 0 )
         {
            subGridatributos_Linesclass = subGridatributos_Class+"Uniform" ;
         }
      }
      else if ( subGridatributos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridatributos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridatributos_Class, "") != 0 )
         {
            subGridatributos_Linesclass = subGridatributos_Class+"Odd" ;
         }
         subGridatributos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridatributos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridatributos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_163_idx) % (2))) == 0 )
         {
            subGridatributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridatributos_Class, "") != 0 )
            {
               subGridatributos_Linesclass = subGridatributos_Class+"Even" ;
            }
         }
         else
         {
            subGridatributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridatributos_Class, "") != 0 )
            {
               subGridatributos_Linesclass = subGridatributos_Class+"Odd" ;
            }
         }
      }
      if ( GridatributosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_163_idx+"\">") ;
      }
      /* Subfile cell */
      if ( GridatributosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridatributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtdet_listdescripcion_Internalname,((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)).getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)).getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_listdescripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtdet_listdescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgtdet_listdescripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(163),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( GridatributosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridatributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtdet_valoratributo_Internalname,((com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem)AV30SDTHVAtributos.elementAt(-1+AV65GXV2)).getgxTv_SdtSDTHVAtributos_SDTHVAtributosItem_Gtdet_valoratributo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtdet_valoratributo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgtdet_valoratributo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(163),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      GridatributosContainer.AddRow(GridatributosRow);
      nGXsfl_163_idx = (short)(((subGridatributos_Islastpage==1)&&(nGXsfl_163_idx+1>subgridatributos_recordsperpage( )) ? 1 : nGXsfl_163_idx+1)) ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_16316( ) ;
      /* End function sendrow_16316 */
   }

   public void subsflControlProps_17615( )
   {
      edtavCtlgelem_consecutivo_Internalname = "CTLGELEM_CONSECUTIVO_"+sGXsfl_176_idx ;
      edtavCtlgcata_descripcion_Internalname = "CTLGCATA_DESCRIPCION_"+sGXsfl_176_idx ;
      edtavCtlginvd_numeroplaca_Internalname = "CTLGINVD_NUMEROPLACA_"+sGXsfl_176_idx ;
      edtavCtlgmarca_Internalname = "CTLGMARCA_"+sGXsfl_176_idx ;
      edtavCtlgserial_Internalname = "CTLGSERIAL_"+sGXsfl_176_idx ;
      edtavCtlgmodelo_Internalname = "CTLGMODELO_"+sGXsfl_176_idx ;
      edtavCtlgtdet_observaciones_Internalname = "CTLGTDET_OBSERVACIONES_"+sGXsfl_176_idx ;
   }

   public void subsflControlProps_fel_17615( )
   {
      edtavCtlgelem_consecutivo_Internalname = "CTLGELEM_CONSECUTIVO_"+sGXsfl_176_fel_idx ;
      edtavCtlgcata_descripcion_Internalname = "CTLGCATA_DESCRIPCION_"+sGXsfl_176_fel_idx ;
      edtavCtlginvd_numeroplaca_Internalname = "CTLGINVD_NUMEROPLACA_"+sGXsfl_176_fel_idx ;
      edtavCtlgmarca_Internalname = "CTLGMARCA_"+sGXsfl_176_fel_idx ;
      edtavCtlgserial_Internalname = "CTLGSERIAL_"+sGXsfl_176_fel_idx ;
      edtavCtlgmodelo_Internalname = "CTLGMODELO_"+sGXsfl_176_fel_idx ;
      edtavCtlgtdet_observaciones_Internalname = "CTLGTDET_OBSERVACIONES_"+sGXsfl_176_fel_idx ;
   }

   public void sendrow_17615( )
   {
      subsflControlProps_17615( ) ;
      wb6D0( ) ;
      if ( ( subGridhijos_Rows * 1 == 0 ) || ( nGXsfl_176_idx <= subgridhijos_recordsperpage( ) * 1 ) )
      {
         GridhijosRow = GXWebRow.GetNew(context,GridhijosContainer) ;
         if ( subGridhijos_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridhijos_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridhijos_Class, "") != 0 )
            {
               subGridhijos_Linesclass = subGridhijos_Class+"Odd" ;
            }
         }
         else if ( subGridhijos_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridhijos_Backstyle = (byte)(0) ;
            subGridhijos_Backcolor = subGridhijos_Allbackcolor ;
            if ( GXutil.strcmp(subGridhijos_Class, "") != 0 )
            {
               subGridhijos_Linesclass = subGridhijos_Class+"Uniform" ;
            }
         }
         else if ( subGridhijos_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridhijos_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridhijos_Class, "") != 0 )
            {
               subGridhijos_Linesclass = subGridhijos_Class+"Odd" ;
            }
            subGridhijos_Backcolor = (int)(0x0) ;
         }
         else if ( subGridhijos_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridhijos_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_176_idx) % (2))) == 0 )
            {
               subGridhijos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhijos_Class, "") != 0 )
               {
                  subGridhijos_Linesclass = subGridhijos_Class+"Even" ;
               }
            }
            else
            {
               subGridhijos_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhijos_Class, "") != 0 )
               {
                  subGridhijos_Linesclass = subGridhijos_Class+"Odd" ;
               }
            }
         }
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_176_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgelem_consecutivo_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gelem_consecutivo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgelem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgelem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgcata_descripcion_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gcata_descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgcata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlginvd_numeroplaca_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Ginvd_numeroplaca(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlginvd_numeroplaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlginvd_numeroplaca_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgmarca_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmarca(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgmarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgmarca_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgserial_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gserial(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgserial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgserial_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgmodelo_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gmodelo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgmodelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgmodelo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridhijosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhijosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlgtdet_observaciones_Internalname,((com.orions2.SdtSDTHVHijos_SDTHVHijosItem)AV32SDTHVHijos.elementAt(-1+AV68GXV3)).getgxTv_SdtSDTHVHijos_SDTHVHijosItem_Gtdet_observaciones(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlgtdet_observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlgtdet_observaciones_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
         GridhijosContainer.AddRow(GridhijosRow);
         nGXsfl_176_idx = (short)(((subGridhijos_Islastpage==1)&&(nGXsfl_176_idx+1>subgridhijos_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_17615( ) ;
      }
      /* End function sendrow_17615 */
   }

   public void subsflControlProps_19114( )
   {
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO_"+sGXsfl_191_idx ;
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR_"+sGXsfl_191_idx ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION_"+sGXsfl_191_idx ;
      edtavCtlnove_placa_Internalname = "CTLNOVE_PLACA_"+sGXsfl_191_idx ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO_"+sGXsfl_191_idx ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO_"+sGXsfl_191_idx ;
   }

   public void subsflControlProps_fel_19114( )
   {
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO_"+sGXsfl_191_fel_idx ;
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR_"+sGXsfl_191_fel_idx ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION_"+sGXsfl_191_fel_idx ;
      edtavCtlnove_placa_Internalname = "CTLNOVE_PLACA_"+sGXsfl_191_fel_idx ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO_"+sGXsfl_191_fel_idx ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO_"+sGXsfl_191_fel_idx ;
   }

   public void sendrow_19114( )
   {
      subsflControlProps_19114( ) ;
      wb6D0( ) ;
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
         if ( ((int)((nGXsfl_191_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_191_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_fecharegistro_Internalname,localUtil.ttoc( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro(), 10, 8, 0, 3, "/", ":", " "),localUtil.format( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_fecharegistro(), "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_fecharegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_fecharegistro_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_identificador_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador(), (byte)(11), (byte)(0), ",", "")),((edtavCtlnove_identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador()), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_identificador()), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_identificador_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltnov_descripcion_Internalname,((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Tnov_descripcion(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltnov_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtltnov_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_placa_Internalname,((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_placa(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_placa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlnove_placa_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_valorantiguo_Internalname,((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valorantiguo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_valorantiguo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_valorantiguo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnove_valornuevo_Internalname,((com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem)AV53SDTNovedadesBien.elementAt(-1+AV76GXV4)).getgxTv_SdtSDTNovedadesBien_SDTNovedadesBienItem_Nove_valornuevo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnove_valornuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlnove_valornuevo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(191),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_191_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_191_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_191_idx+1)) ;
      sGXsfl_191_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_191_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_19114( ) ;
      /* End function sendrow_19114 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      lblTabpage1_title_Internalname = "TABPAGE1_TITLE" ;
      edtavCregi_cod_Internalname = "vCREGI_COD" ;
      edtavCregi_descripcion_Internalname = "vCREGI_DESCRIPCION" ;
      edtavCcent_codigo_Internalname = "vCCENT_CODIGO" ;
      edtavCcent_descripcion_Internalname = "vCCENT_DESCRIPCION" ;
      cmbavCinvd_moduloalmacen.setInternalname( "vCINVD_MODULOALMACEN" );
      edtavCinvd_almacencodigo_Internalname = "vCINVD_ALMACENCODIGO" ;
      edtavCalma_descripcion_Internalname = "vCALMA_DESCRIPCION" ;
      edtavCinvd_bodegacodigo_Internalname = "vCINVD_BODEGACODIGO" ;
      edtavCbarea_descripcion_Internalname = "vCBAREA_DESCRIPCION" ;
      edtavCuen_cedula_Internalname = "vCUEN_CEDULA" ;
      edtavCcuen_nombre_Internalname = "vCCUEN_NOMBRE" ;
      divTable1_Internalname = "TABLE1" ;
      divTabpage1table_Internalname = "TABPAGE1TABLE" ;
      lblTabpage2_title_Internalname = "TABPAGE2_TITLE" ;
      edtavCclas_codigo_Internalname = "vCCLAS_CODIGO" ;
      edtavCclas_descripcion_Internalname = "vCCLAS_DESCRIPCION" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      edtavCtipo_descripcion_Internalname = "vCTIPO_DESCRIPCION" ;
      edtavCelem_descripcion_Internalname = "vCELEM_DESCRIPCION" ;
      edtavCcata_vidautil_Internalname = "vCCATA_VIDAUTIL" ;
      edtavCtdet_placapadre_Internalname = "vCTDET_PLACAPADRE" ;
      edtavCtdet_valorunitario_Internalname = "vCTDET_VALORUNITARIO" ;
      edtavCtdet_otros_costos_Internalname = "vCTDET_OTROS_COSTOS" ;
      edtavCtdet_valor_futuro_Internalname = "vCTDET_VALOR_FUTURO" ;
      edtavCtdet_taza_Internalname = "vCTDET_TAZA" ;
      edtavCtdet_plazo_n_Internalname = "vCTDET_PLAZO_N" ;
      edtavCtdet_valor_presente_Internalname = "vCTDET_VALOR_PRESENTE" ;
      edtavCtdet_valortotal_Internalname = "vCTDET_VALORTOTAL" ;
      edtavCinvd_fechaadquisicion_Internalname = "vCINVD_FECHAADQUISICION" ;
      cmbavCinvd_estado.setInternalname( "vCINVD_ESTADO" );
      divTable7_Internalname = "TABLE7" ;
      divTabpage2table_Internalname = "TABPAGE2TABLE" ;
      lblTabpage3_title_Internalname = "TABPAGE3_TITLE" ;
      edtavCtlgtran_centrocostocodigo_Internalname = "CTLGTRAN_CENTROCOSTOCODIGO" ;
      edtavCtlgtran_codigomovimiento_Internalname = "CTLGTRAN_CODIGOMOVIMIENTO" ;
      edtavCtlgtran_descripcionmovimiento_Internalname = "CTLGTRAN_DESCRIPCIONMOVIMIENTO" ;
      edtavCtlgtran_consecutivocc_Internalname = "CTLGTRAN_CONSECUTIVOCC" ;
      edtavCtlgtran_fecharegistro_Internalname = "CTLGTRAN_FECHAREGISTRO" ;
      edtavCtlgtran_cedulacuentadantedestino_Internalname = "CTLGTRAN_CEDULACUENTADANTEDESTINO" ;
      edtavCtlgtran_nombcuentadantedestino_Internalname = "CTLGTRAN_NOMBCUENTADANTEDESTINO" ;
      cmbavCtlgtran_estado.setInternalname( "CTLGTRAN_ESTADO" );
      divTable6_Internalname = "TABLE6" ;
      divTabpage3table_Internalname = "TABPAGE3TABLE" ;
      lblTabpage4_title_Internalname = "TABPAGE4_TITLE" ;
      edtavCtlgtdet_listdescripcion_Internalname = "CTLGTDET_LISTDESCRIPCION" ;
      edtavCtlgtdet_valoratributo_Internalname = "CTLGTDET_VALORATRIBUTO" ;
      divTable2_Internalname = "TABLE2" ;
      divTabpage4table_Internalname = "TABPAGE4TABLE" ;
      lblTabpage5_title_Internalname = "TABPAGE5_TITLE" ;
      edtavCtlgelem_consecutivo_Internalname = "CTLGELEM_CONSECUTIVO" ;
      edtavCtlgcata_descripcion_Internalname = "CTLGCATA_DESCRIPCION" ;
      edtavCtlginvd_numeroplaca_Internalname = "CTLGINVD_NUMEROPLACA" ;
      edtavCtlgmarca_Internalname = "CTLGMARCA" ;
      edtavCtlgserial_Internalname = "CTLGSERIAL" ;
      edtavCtlgmodelo_Internalname = "CTLGMODELO" ;
      edtavCtlgtdet_observaciones_Internalname = "CTLGTDET_OBSERVACIONES" ;
      divTable5_Internalname = "TABLE5" ;
      divTabpage5table_Internalname = "TABPAGE5TABLE" ;
      lblTabpage6_title_Internalname = "TABPAGE6_TITLE" ;
      edtavCtlnove_fecharegistro_Internalname = "CTLNOVE_FECHAREGISTRO" ;
      edtavCtlnove_identificador_Internalname = "CTLNOVE_IDENTIFICADOR" ;
      edtavCtltnov_descripcion_Internalname = "CTLTNOV_DESCRIPCION" ;
      edtavCtlnove_placa_Internalname = "CTLNOVE_PLACA" ;
      edtavCtlnove_valorantiguo_Internalname = "CTLNOVE_VALORANTIGUO" ;
      edtavCtlnove_valornuevo_Internalname = "CTLNOVE_VALORNUEVO" ;
      divTabpage6table_Internalname = "TABPAGE6TABLE" ;
      Tab2_Internalname = "TAB2" ;
      divTable3_Internalname = "TABLE3" ;
      bttButton1_Internalname = "BUTTON1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtraza_Internalname = "GRIDTRAZA" ;
      subGridatributos_Internalname = "GRIDATRIBUTOS" ;
      subGridhijos_Internalname = "GRIDHIJOS" ;
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavCtlnove_valornuevo_Jsonclick = "" ;
      edtavCtlnove_valorantiguo_Jsonclick = "" ;
      edtavCtlnove_placa_Jsonclick = "" ;
      edtavCtltnov_descripcion_Jsonclick = "" ;
      edtavCtlnove_identificador_Jsonclick = "" ;
      edtavCtlnove_fecharegistro_Jsonclick = "" ;
      edtavCtlgtdet_observaciones_Jsonclick = "" ;
      edtavCtlgmodelo_Jsonclick = "" ;
      edtavCtlgserial_Jsonclick = "" ;
      edtavCtlgmarca_Jsonclick = "" ;
      edtavCtlginvd_numeroplaca_Jsonclick = "" ;
      edtavCtlgcata_descripcion_Jsonclick = "" ;
      edtavCtlgelem_consecutivo_Jsonclick = "" ;
      edtavCtlgtdet_valoratributo_Jsonclick = "" ;
      edtavCtlgtdet_listdescripcion_Jsonclick = "" ;
      cmbavCtlgtran_estado.setJsonclick( "" );
      edtavCtlgtran_nombcuentadantedestino_Jsonclick = "" ;
      edtavCtlgtran_cedulacuentadantedestino_Jsonclick = "" ;
      edtavCtlgtran_fecharegistro_Jsonclick = "" ;
      edtavCtlgtran_consecutivocc_Jsonclick = "" ;
      edtavCtlgtran_descripcionmovimiento_Jsonclick = "" ;
      edtavCtlgtran_codigomovimiento_Jsonclick = "" ;
      edtavCtlgtran_centrocostocodigo_Jsonclick = "" ;
      edtavCtlnove_valornuevo_Enabled = -1 ;
      edtavCtlnove_valorantiguo_Enabled = -1 ;
      edtavCtlnove_placa_Enabled = -1 ;
      edtavCtltnov_descripcion_Enabled = -1 ;
      edtavCtlnove_identificador_Enabled = -1 ;
      edtavCtlnove_fecharegistro_Enabled = -1 ;
      edtavCtlgtdet_observaciones_Enabled = -1 ;
      edtavCtlgmodelo_Enabled = -1 ;
      edtavCtlgserial_Enabled = -1 ;
      edtavCtlgmarca_Enabled = -1 ;
      edtavCtlginvd_numeroplaca_Enabled = -1 ;
      edtavCtlgcata_descripcion_Enabled = -1 ;
      edtavCtlgelem_consecutivo_Enabled = -1 ;
      edtavCtlgtdet_valoratributo_Enabled = -1 ;
      edtavCtlgtdet_listdescripcion_Enabled = -1 ;
      cmbavCtlgtran_estado.setEnabled( -1 );
      edtavCtlgtran_nombcuentadantedestino_Enabled = -1 ;
      edtavCtlgtran_cedulacuentadantedestino_Enabled = -1 ;
      edtavCtlgtran_fecharegistro_Enabled = -1 ;
      edtavCtlgtran_consecutivocc_Enabled = -1 ;
      edtavCtlgtran_descripcionmovimiento_Enabled = -1 ;
      edtavCtlgtran_codigomovimiento_Enabled = -1 ;
      edtavCtlgtran_centrocostocodigo_Enabled = -1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlnove_valornuevo_Enabled = 0 ;
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      edtavCtlnove_placa_Enabled = 0 ;
      edtavCtltnov_descripcion_Enabled = 0 ;
      edtavCtlnove_identificador_Enabled = 0 ;
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGridhijos_Allowcollapsing = (byte)(0) ;
      subGridhijos_Allowselection = (byte)(0) ;
      edtavCtlgtdet_observaciones_Enabled = 0 ;
      edtavCtlgmodelo_Enabled = 0 ;
      edtavCtlgserial_Enabled = 0 ;
      edtavCtlgmarca_Enabled = 0 ;
      edtavCtlginvd_numeroplaca_Enabled = 0 ;
      edtavCtlgcata_descripcion_Enabled = 0 ;
      edtavCtlgelem_consecutivo_Enabled = 0 ;
      subGridhijos_Class = "WorkWith" ;
      subGridhijos_Backcolorstyle = (byte)(0) ;
      subGridatributos_Allowcollapsing = (byte)(0) ;
      subGridatributos_Allowselection = (byte)(0) ;
      edtavCtlgtdet_valoratributo_Enabled = 0 ;
      edtavCtlgtdet_listdescripcion_Enabled = 0 ;
      subGridatributos_Class = "WorkWith" ;
      subGridatributos_Backcolorstyle = (byte)(0) ;
      subGridtraza_Allowcollapsing = (byte)(0) ;
      subGridtraza_Allowselection = (byte)(0) ;
      cmbavCtlgtran_estado.setEnabled( 0 );
      edtavCtlgtran_nombcuentadantedestino_Enabled = 0 ;
      edtavCtlgtran_cedulacuentadantedestino_Enabled = 0 ;
      edtavCtlgtran_fecharegistro_Enabled = 0 ;
      edtavCtlgtran_consecutivocc_Enabled = 0 ;
      edtavCtlgtran_descripcionmovimiento_Enabled = 0 ;
      edtavCtlgtran_codigomovimiento_Enabled = 0 ;
      edtavCtlgtran_centrocostocodigo_Enabled = 0 ;
      subGridtraza_Class = "WorkWith" ;
      subGridtraza_Backcolorstyle = (byte)(0) ;
      cmbavCinvd_estado.setJsonclick( "" );
      cmbavCinvd_estado.setEnabled( 1 );
      edtavCinvd_fechaadquisicion_Jsonclick = "" ;
      edtavCinvd_fechaadquisicion_Enabled = 1 ;
      edtavCtdet_valortotal_Jsonclick = "" ;
      edtavCtdet_valortotal_Enabled = 1 ;
      edtavCtdet_valor_presente_Jsonclick = "" ;
      edtavCtdet_valor_presente_Enabled = 1 ;
      edtavCtdet_plazo_n_Jsonclick = "" ;
      edtavCtdet_plazo_n_Enabled = 1 ;
      edtavCtdet_taza_Jsonclick = "" ;
      edtavCtdet_taza_Enabled = 1 ;
      edtavCtdet_valor_futuro_Jsonclick = "" ;
      edtavCtdet_valor_futuro_Enabled = 1 ;
      edtavCtdet_otros_costos_Jsonclick = "" ;
      edtavCtdet_otros_costos_Enabled = 1 ;
      edtavCtdet_valorunitario_Jsonclick = "" ;
      edtavCtdet_valorunitario_Enabled = 1 ;
      edtavCtdet_placapadre_Jsonclick = "" ;
      edtavCtdet_placapadre_Enabled = 1 ;
      edtavCcata_vidautil_Jsonclick = "" ;
      edtavCcata_vidautil_Enabled = 1 ;
      edtavCelem_descripcion_Jsonclick = "" ;
      edtavCelem_descripcion_Enabled = 1 ;
      edtavCtipo_descripcion_Jsonclick = "" ;
      edtavCtipo_descripcion_Enabled = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCclas_descripcion_Jsonclick = "" ;
      edtavCclas_descripcion_Enabled = 1 ;
      edtavCclas_codigo_Jsonclick = "" ;
      edtavCclas_codigo_Enabled = 1 ;
      edtavCcuen_nombre_Jsonclick = "" ;
      edtavCcuen_nombre_Enabled = 1 ;
      edtavCuen_cedula_Jsonclick = "" ;
      edtavCuen_cedula_Enabled = 1 ;
      edtavCbarea_descripcion_Jsonclick = "" ;
      edtavCbarea_descripcion_Enabled = 1 ;
      edtavCinvd_bodegacodigo_Jsonclick = "" ;
      edtavCinvd_bodegacodigo_Enabled = 1 ;
      edtavCalma_descripcion_Jsonclick = "" ;
      edtavCalma_descripcion_Enabled = 1 ;
      edtavCinvd_almacencodigo_Jsonclick = "" ;
      edtavCinvd_almacencodigo_Enabled = 1 ;
      cmbavCinvd_moduloalmacen.setJsonclick( "" );
      cmbavCinvd_moduloalmacen.setEnabled( 1 );
      edtavCcent_descripcion_Jsonclick = "" ;
      edtavCcent_descripcion_Enabled = 1 ;
      edtavCcent_codigo_Jsonclick = "" ;
      edtavCcent_codigo_Enabled = 1 ;
      edtavCregi_descripcion_Jsonclick = "" ;
      edtavCregi_descripcion_Enabled = 1 ;
      edtavCregi_cod_Jsonclick = "" ;
      edtavCregi_cod_Enabled = 1 ;
      lblTitle_Caption = "" ;
      Tab2_Historymanagement = GXutil.toBoolean( 0) ;
      Tab2_Pagecount = 6 ;
      Tab2_Class = "Tab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Hoja de vida del activo fijo" );
      subGridhijos_Rows = 0 ;
      subGridtraza_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDTRAZA_nFirstRecordOnPage',nv:0},{av:'GRIDTRAZA_nEOF',nv:0},{av:'AV39SDTHVTraza',fld:'vSDTHVTRAZA',grid:144,pic:'',nv:null},{av:'subGridtraza_Rows',nv:0},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV53SDTNovedadesBien',fld:'vSDTNOVEDADESBIEN',grid:191,pic:'',nv:null},{av:'GRIDHIJOS_nFirstRecordOnPage',nv:0},{av:'GRIDHIJOS_nEOF',nv:0},{av:'AV32SDTHVHijos',fld:'vSDTHVHIJOS',grid:176,pic:'',nv:null},{av:'subGridhijos_Rows',nv:0},{av:'GRIDATRIBUTOS_nFirstRecordOnPage',nv:0},{av:'GRIDATRIBUTOS_nEOF',nv:0},{av:'AV30SDTHVAtributos',fld:'vSDTHVATRIBUTOS',grid:163,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("'CANCELAR'","{handler:'e116D2',iparms:[],oparms:[]}");
      setEventMetadata("GRIDTRAZA_FIRSTPAGE","{handler:'subgridtraza_firstpage',iparms:[{av:'GRIDTRAZA_nFirstRecordOnPage',nv:0},{av:'GRIDTRAZA_nEOF',nv:0},{av:'subGridtraza_Rows',nv:0},{av:'AV39SDTHVTraza',fld:'vSDTHVTRAZA',grid:144,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDTRAZA_PREVPAGE","{handler:'subgridtraza_previouspage',iparms:[{av:'GRIDTRAZA_nFirstRecordOnPage',nv:0},{av:'GRIDTRAZA_nEOF',nv:0},{av:'subGridtraza_Rows',nv:0},{av:'AV39SDTHVTraza',fld:'vSDTHVTRAZA',grid:144,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDTRAZA_NEXTPAGE","{handler:'subgridtraza_nextpage',iparms:[{av:'GRIDTRAZA_nFirstRecordOnPage',nv:0},{av:'GRIDTRAZA_nEOF',nv:0},{av:'subGridtraza_Rows',nv:0},{av:'AV39SDTHVTraza',fld:'vSDTHVTRAZA',grid:144,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDTRAZA_LASTPAGE","{handler:'subgridtraza_lastpage',iparms:[{av:'GRIDTRAZA_nFirstRecordOnPage',nv:0},{av:'GRIDTRAZA_nEOF',nv:0},{av:'subGridtraza_Rows',nv:0},{av:'AV39SDTHVTraza',fld:'vSDTHVTRAZA',grid:144,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDHIJOS_FIRSTPAGE","{handler:'subgridhijos_firstpage',iparms:[{av:'GRIDHIJOS_nFirstRecordOnPage',nv:0},{av:'GRIDHIJOS_nEOF',nv:0},{av:'subGridhijos_Rows',nv:0},{av:'AV32SDTHVHijos',fld:'vSDTHVHIJOS',grid:176,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDHIJOS_PREVPAGE","{handler:'subgridhijos_previouspage',iparms:[{av:'GRIDHIJOS_nFirstRecordOnPage',nv:0},{av:'GRIDHIJOS_nEOF',nv:0},{av:'subGridhijos_Rows',nv:0},{av:'AV32SDTHVHijos',fld:'vSDTHVHIJOS',grid:176,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDHIJOS_NEXTPAGE","{handler:'subgridhijos_nextpage',iparms:[{av:'GRIDHIJOS_nFirstRecordOnPage',nv:0},{av:'GRIDHIJOS_nEOF',nv:0},{av:'subGridhijos_Rows',nv:0},{av:'AV32SDTHVHijos',fld:'vSDTHVHIJOS',grid:176,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRIDHIJOS_LASTPAGE","{handler:'subgridhijos_lastpage',iparms:[{av:'GRIDHIJOS_nFirstRecordOnPage',nv:0},{av:'GRIDHIJOS_nEOF',nv:0},{av:'subGridhijos_Rows',nv:0},{av:'AV32SDTHVHijos',fld:'vSDTHVHIJOS',grid:176,pic:'',nv:null}],oparms:[]}");
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
      wcpOAV18cInvd_NumeroPlaca = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV17cInvd_ModuloAlmacen = "" ;
      AV13cInvd_AlmacenCodigo = "" ;
      AV14cInvd_BodegaCodigo = "" ;
      AV11cElem_Consecutivo = "" ;
      AV18cInvd_NumeroPlaca = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV30SDTHVAtributos = new GXBaseCollection<com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem>(com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem.class, "SDTHVAtributos.SDTHVAtributosItem", "ACBSENA", remoteHandle);
      AV32SDTHVHijos = new GXBaseCollection<com.orions2.SdtSDTHVHijos_SDTHVHijosItem>(com.orions2.SdtSDTHVHijos_SDTHVHijosItem.class, "SDTHVHijos.SDTHVHijosItem", "ACBSENA", remoteHandle);
      AV53SDTNovedadesBien = new GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>(com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem.class, "SDTNovedadesBien.SDTNovedadesBienItem", "ACBSENA", remoteHandle);
      AV39SDTHVTraza = new GXBaseCollection<com.orions2.SdtSDTHVTraza_SDTHVTrazaItem>(com.orions2.SdtSDTHVTraza_SDTHVTrazaItem.class, "SDTHVTraza.SDTHVTrazaItem", "ACBSENA", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTabpage1_title_Jsonclick = "" ;
      TempTags = "" ;
      AV20cRegi_Descripcion = "" ;
      AV7cCent_Codigo = "" ;
      AV8cCent_Descripcion = "" ;
      AV51cAlma_Descripcion = "" ;
      AV52cBArea_Descripcion = "" ;
      AV10cCuen_Nombre = "" ;
      lblTabpage2_title_Jsonclick = "" ;
      AV48cClas_Codigo = "" ;
      AV49cClas_Descripcion = "" ;
      AV5cCata_Descripcion = "" ;
      AV24cTipo_Descripcion = "" ;
      AV12cElem_Descripcion = "" ;
      AV47cTDet_PlacaPadre = "" ;
      AV22cTDet_ValorUnitario = DecimalUtil.ZERO ;
      AV45cTDet_Otros_Costos = DecimalUtil.ZERO ;
      AV41cTDet_Valor_Futuro = DecimalUtil.ZERO ;
      AV44cTDet_Valor_Presente = DecimalUtil.ZERO ;
      AV46cTDet_ValorTotal = DecimalUtil.ZERO ;
      AV16cInvd_FechaAdquisicion = GXutil.nullDate() ;
      AV15cInvd_Estado = "" ;
      lblTabpage3_title_Jsonclick = "" ;
      GridtrazaContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGridtraza_Linesclass = "" ;
      GridtrazaColumn = new com.genexus.webpanels.GXWebColumn();
      lblTabpage4_title_Jsonclick = "" ;
      GridatributosContainer = new com.genexus.webpanels.GXWebGrid(context);
      subGridatributos_Linesclass = "" ;
      GridatributosColumn = new com.genexus.webpanels.GXWebColumn();
      lblTabpage5_title_Jsonclick = "" ;
      GridhijosContainer = new com.genexus.webpanels.GXWebGrid(context);
      subGridhijos_Linesclass = "" ;
      GridhijosColumn = new com.genexus.webpanels.GXWebColumn();
      lblTabpage6_title_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      bttButton1_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      hsh = "" ;
      AV26Invd_EsPlacaPadre = "" ;
      GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 = new GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem>(com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem.class, "SDTNovedadesBien.SDTNovedadesBienItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem2 = new GXBaseCollection [1] ;
      scmdbuf = "" ;
      H006D2_A37Cata_Codigo = new String[] {""} ;
      H006D2_A33Tipo_Codigo = new long[1] ;
      H006D2_A67Invd_NumeroPlaca = new String[] {""} ;
      H006D2_A66Elem_Consecutivo = new String[] {""} ;
      H006D2_A557Elem_Descripcion = new String[] {""} ;
      H006D2_A298Cata_Descripcion = new String[] {""} ;
      H006D2_A34Clas_Codigo = new String[] {""} ;
      H006D2_A291Clas_Descripcion = new String[] {""} ;
      H006D2_A632Vida_Util = new short[1] ;
      H006D2_n632Vida_Util = new boolean[] {false} ;
      H006D2_A253Tipo_Descripcion = new String[] {""} ;
      H006D2_A410Invd_RegionalId = new long[1] ;
      H006D2_A411Invd_CentroCostoId = new long[1] ;
      H006D2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H006D2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H006D2_A414Invd_BodegaCodigo = new String[] {""} ;
      H006D2_A43Cuen_Identificacion = new long[1] ;
      H006D2_n43Cuen_Identificacion = new boolean[] {false} ;
      H006D2_A688Cuen_Cedula = new long[1] ;
      H006D2_A44Cuen_Nombre = new String[] {""} ;
      H006D2_n44Cuen_Nombre = new boolean[] {false} ;
      H006D2_A501Invd_EsPlacaPadre = new String[] {""} ;
      H006D2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      H006D2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H006D2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H006D2_A463Invd_Estado = new String[] {""} ;
      H006D2_n463Invd_Estado = new boolean[] {false} ;
      H006D2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006D2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H006D2_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006D2_n624Costo_Desmante = new boolean[] {false} ;
      H006D2_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006D2_n625Variable_VF = new boolean[] {false} ;
      H006D2_A626Variable_I = new short[1] ;
      H006D2_n626Variable_I = new boolean[] {false} ;
      H006D2_A627Variable_N = new short[1] ;
      H006D2_n627Variable_N = new boolean[] {false} ;
      H006D2_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006D2_n628Otros_Costos_Dev = new boolean[] {false} ;
      H006D2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006D2_A68Invd_PlacaPadre = new String[] {""} ;
      H006D2_n68Invd_PlacaPadre = new boolean[] {false} ;
      A37Cata_Codigo = "" ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      A253Tipo_Descripcion = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A44Cuen_Nombre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A463Invd_Estado = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A68Invd_PlacaPadre = "" ;
      H006D3_A2Regi_Id = new long[1] ;
      H006D3_A12Regi_Cod = new short[1] ;
      H006D3_A13Regi_Descripcion = new String[] {""} ;
      A13Regi_Descripcion = "" ;
      H006D4_A1Cent_Id = new long[1] ;
      H006D4_A3Cent_Codigo = new String[] {""} ;
      H006D4_A4Cent_Descripcion = new String[] {""} ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      H006D5_A28Alma_Codigo = new String[] {""} ;
      H006D5_A27Alma_Modulo = new String[] {""} ;
      H006D5_A1Cent_Id = new long[1] ;
      H006D5_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      H006D6_A32BArea_Codigo = new String[] {""} ;
      H006D6_n32BArea_Codigo = new boolean[] {false} ;
      H006D6_A31Bode_Codigo = new String[] {""} ;
      H006D6_A28Alma_Codigo = new String[] {""} ;
      H006D6_A27Alma_Modulo = new String[] {""} ;
      H006D6_A1Cent_Id = new long[1] ;
      H006D6_A610BArea_Descripcion = new String[] {""} ;
      A32BArea_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A610BArea_Descripcion = "" ;
      H006D7_A481Tran_IndE_S = new String[] {""} ;
      H006D7_n481Tran_IndE_S = new boolean[] {false} ;
      H006D7_A490TDet_PlacaNumero = new String[] {""} ;
      H006D7_n490TDet_PlacaNumero = new boolean[] {false} ;
      H006D7_A66Elem_Consecutivo = new String[] {""} ;
      H006D7_A69TDet_Consecutivo = new long[1] ;
      H006D7_A46Tran_Id = new long[1] ;
      A481Tran_IndE_S = "" ;
      A490TDet_PlacaNumero = "" ;
      H006D8_A69TDet_Consecutivo = new long[1] ;
      H006D8_A46Tran_Id = new long[1] ;
      H006D8_A492TDet_ListDescripcion = new String[] {""} ;
      H006D8_n492TDet_ListDescripcion = new boolean[] {false} ;
      H006D8_A494TDet_ValorAtributo = new String[] {""} ;
      H006D8_A70TDet_ListId = new long[1] ;
      A492TDet_ListDescripcion = "" ;
      A494TDet_ValorAtributo = "" ;
      AV31SDTHVAtributosItem = new com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem(remoteHandle, context);
      H006D9_A37Cata_Codigo = new String[] {""} ;
      H006D9_A68Invd_PlacaPadre = new String[] {""} ;
      H006D9_n68Invd_PlacaPadre = new boolean[] {false} ;
      H006D9_A66Elem_Consecutivo = new String[] {""} ;
      H006D9_A298Cata_Descripcion = new String[] {""} ;
      H006D9_A67Invd_NumeroPlaca = new String[] {""} ;
      AV33SDTHVHijosItem = new com.orions2.SdtSDTHVHijos_SDTHVHijosItem(remoteHandle, context);
      H006D10_A481Tran_IndE_S = new String[] {""} ;
      H006D10_n481Tran_IndE_S = new boolean[] {false} ;
      H006D10_A490TDet_PlacaNumero = new String[] {""} ;
      H006D10_n490TDet_PlacaNumero = new boolean[] {false} ;
      H006D10_A66Elem_Consecutivo = new String[] {""} ;
      H006D10_A69TDet_Consecutivo = new long[1] ;
      H006D10_A504TDet_Observaciones = new String[] {""} ;
      H006D10_n504TDet_Observaciones = new boolean[] {false} ;
      H006D10_A46Tran_Id = new long[1] ;
      A504TDet_Observaciones = "" ;
      H006D11_A69TDet_Consecutivo = new long[1] ;
      H006D11_A46Tran_Id = new long[1] ;
      H006D11_A494TDet_ValorAtributo = new String[] {""} ;
      H006D11_A70TDet_ListId = new long[1] ;
      H006D12_A69TDet_Consecutivo = new long[1] ;
      H006D12_A46Tran_Id = new long[1] ;
      H006D12_A48Tran_CentroCostoId = new long[1] ;
      H006D12_A490TDet_PlacaNumero = new String[] {""} ;
      H006D12_n490TDet_PlacaNumero = new boolean[] {false} ;
      H006D12_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H006D12_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H006D12_A49Tran_CodigoMovimiento = new String[] {""} ;
      H006D12_A513Tran_ConsecutivoCC = new long[1] ;
      H006D12_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H006D12_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H006D12_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H006D12_A58Tran_Estado = new String[] {""} ;
      H006D12_n58Tran_Estado = new boolean[] {false} ;
      H006D12_A52Tran_IdCuentadanteDestino = new long[1] ;
      H006D12_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H006D12_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H006D12_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H006D12_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H006D12_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H006D12_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      A419Tran_CentroCostoCodigo = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A58Tran_Estado = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV40SDTHVTrazaItem = new com.orions2.SdtSDTHVTraza_SDTHVTrazaItem(remoteHandle, context);
      GridtrazaRow = new com.genexus.webpanels.GXWebRow();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GridhijosRow = new com.genexus.webpanels.GXWebRow();
      GridatributosRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wp_alm_hojavida__default(),
         new Object[] {
             new Object[] {
            H006D2_A37Cata_Codigo, H006D2_A33Tipo_Codigo, H006D2_A67Invd_NumeroPlaca, H006D2_A66Elem_Consecutivo, H006D2_A557Elem_Descripcion, H006D2_A298Cata_Descripcion, H006D2_A34Clas_Codigo, H006D2_A291Clas_Descripcion, H006D2_A632Vida_Util, H006D2_n632Vida_Util,
            H006D2_A253Tipo_Descripcion, H006D2_A410Invd_RegionalId, H006D2_A411Invd_CentroCostoId, H006D2_A412Invd_ModuloAlmacen, H006D2_A413Invd_AlmacenCodigo, H006D2_A414Invd_BodegaCodigo, H006D2_A43Cuen_Identificacion, H006D2_n43Cuen_Identificacion, H006D2_A688Cuen_Cedula, H006D2_A44Cuen_Nombre,
            H006D2_n44Cuen_Nombre, H006D2_A501Invd_EsPlacaPadre, H006D2_n501Invd_EsPlacaPadre, H006D2_A466Invd_FechaAdquisicion, H006D2_n466Invd_FechaAdquisicion, H006D2_A463Invd_Estado, H006D2_n463Invd_Estado, H006D2_A465Invd_ValorAdquisicion, H006D2_n465Invd_ValorAdquisicion, H006D2_A624Costo_Desmante,
            H006D2_n624Costo_Desmante, H006D2_A625Variable_VF, H006D2_n625Variable_VF, H006D2_A626Variable_I, H006D2_n626Variable_I, H006D2_A627Variable_N, H006D2_n627Variable_N, H006D2_A628Otros_Costos_Dev, H006D2_n628Otros_Costos_Dev, H006D2_A629Costo_Total_Dev,
            H006D2_A68Invd_PlacaPadre, H006D2_n68Invd_PlacaPadre
            }
            , new Object[] {
            H006D3_A2Regi_Id, H006D3_A12Regi_Cod, H006D3_A13Regi_Descripcion
            }
            , new Object[] {
            H006D4_A1Cent_Id, H006D4_A3Cent_Codigo, H006D4_A4Cent_Descripcion
            }
            , new Object[] {
            H006D5_A28Alma_Codigo, H006D5_A27Alma_Modulo, H006D5_A1Cent_Id, H006D5_A252Alma_Descripcion
            }
            , new Object[] {
            H006D6_A32BArea_Codigo, H006D6_n32BArea_Codigo, H006D6_A31Bode_Codigo, H006D6_A28Alma_Codigo, H006D6_A27Alma_Modulo, H006D6_A1Cent_Id, H006D6_A610BArea_Descripcion
            }
            , new Object[] {
            H006D7_A481Tran_IndE_S, H006D7_n481Tran_IndE_S, H006D7_A490TDet_PlacaNumero, H006D7_n490TDet_PlacaNumero, H006D7_A66Elem_Consecutivo, H006D7_A69TDet_Consecutivo, H006D7_A46Tran_Id
            }
            , new Object[] {
            H006D8_A69TDet_Consecutivo, H006D8_A46Tran_Id, H006D8_A492TDet_ListDescripcion, H006D8_n492TDet_ListDescripcion, H006D8_A494TDet_ValorAtributo, H006D8_A70TDet_ListId
            }
            , new Object[] {
            H006D9_A37Cata_Codigo, H006D9_A68Invd_PlacaPadre, H006D9_n68Invd_PlacaPadre, H006D9_A66Elem_Consecutivo, H006D9_A298Cata_Descripcion, H006D9_A67Invd_NumeroPlaca
            }
            , new Object[] {
            H006D10_A481Tran_IndE_S, H006D10_n481Tran_IndE_S, H006D10_A490TDet_PlacaNumero, H006D10_n490TDet_PlacaNumero, H006D10_A66Elem_Consecutivo, H006D10_A69TDet_Consecutivo, H006D10_A504TDet_Observaciones, H006D10_n504TDet_Observaciones, H006D10_A46Tran_Id
            }
            , new Object[] {
            H006D11_A69TDet_Consecutivo, H006D11_A46Tran_Id, H006D11_A494TDet_ValorAtributo, H006D11_A70TDet_ListId
            }
            , new Object[] {
            H006D12_A69TDet_Consecutivo, H006D12_A46Tran_Id, H006D12_A48Tran_CentroCostoId, H006D12_A490TDet_PlacaNumero, H006D12_n490TDet_PlacaNumero, H006D12_A419Tran_CentroCostoCodigo, H006D12_n419Tran_CentroCostoCodigo, H006D12_A49Tran_CodigoMovimiento, H006D12_A513Tran_ConsecutivoCC, H006D12_n513Tran_ConsecutivoCC,
            H006D12_A381Tran_DescripcionMovimiento, H006D12_n381Tran_DescripcionMovimiento, H006D12_A58Tran_Estado, H006D12_n58Tran_Estado, H006D12_A52Tran_IdCuentadanteDestino, H006D12_n52Tran_IdCuentadanteDestino, H006D12_A704Tran_CedulaCuentadanteDestino, H006D12_n704Tran_CedulaCuentadanteDestino, H006D12_A389Tran_NombCuentadanteDestino, H006D12_n389Tran_NombCuentadanteDestino,
            H006D12_A55Tran_FechaRegistro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCregi_cod_Enabled = 0 ;
      edtavCregi_descripcion_Enabled = 0 ;
      edtavCcent_codigo_Enabled = 0 ;
      edtavCcent_descripcion_Enabled = 0 ;
      cmbavCinvd_moduloalmacen.setEnabled( 0 );
      edtavCinvd_almacencodigo_Enabled = 0 ;
      edtavCalma_descripcion_Enabled = 0 ;
      edtavCinvd_bodegacodigo_Enabled = 0 ;
      edtavCbarea_descripcion_Enabled = 0 ;
      edtavCuen_cedula_Enabled = 0 ;
      edtavCcuen_nombre_Enabled = 0 ;
      edtavCclas_codigo_Enabled = 0 ;
      edtavCclas_descripcion_Enabled = 0 ;
      edtavCelem_consecutivo_Enabled = 0 ;
      edtavCcata_descripcion_Enabled = 0 ;
      edtavCtipo_descripcion_Enabled = 0 ;
      edtavCelem_descripcion_Enabled = 0 ;
      edtavCcata_vidautil_Enabled = 0 ;
      edtavCtdet_placapadre_Enabled = 0 ;
      edtavCtdet_valorunitario_Enabled = 0 ;
      edtavCtdet_otros_costos_Enabled = 0 ;
      edtavCtdet_valor_futuro_Enabled = 0 ;
      edtavCtdet_taza_Enabled = 0 ;
      edtavCtdet_plazo_n_Enabled = 0 ;
      edtavCtdet_valor_presente_Enabled = 0 ;
      edtavCtdet_valortotal_Enabled = 0 ;
      edtavCinvd_fechaadquisicion_Enabled = 0 ;
      cmbavCinvd_estado.setEnabled( 0 );
      edtavCtlgtran_centrocostocodigo_Enabled = 0 ;
      edtavCtlgtran_codigomovimiento_Enabled = 0 ;
      edtavCtlgtran_descripcionmovimiento_Enabled = 0 ;
      edtavCtlgtran_consecutivocc_Enabled = 0 ;
      edtavCtlgtran_fecharegistro_Enabled = 0 ;
      edtavCtlgtran_cedulacuentadantedestino_Enabled = 0 ;
      edtavCtlgtran_nombcuentadantedestino_Enabled = 0 ;
      cmbavCtlgtran_estado.setEnabled( 0 );
      edtavCtlgtdet_listdescripcion_Enabled = 0 ;
      edtavCtlgtdet_valoratributo_Enabled = 0 ;
      edtavCtlgelem_consecutivo_Enabled = 0 ;
      edtavCtlgcata_descripcion_Enabled = 0 ;
      edtavCtlginvd_numeroplaca_Enabled = 0 ;
      edtavCtlgmarca_Enabled = 0 ;
      edtavCtlgserial_Enabled = 0 ;
      edtavCtlgmodelo_Enabled = 0 ;
      edtavCtlgtdet_observaciones_Enabled = 0 ;
      edtavCtlnove_fecharegistro_Enabled = 0 ;
      edtavCtlnove_identificador_Enabled = 0 ;
      edtavCtltnov_descripcion_Enabled = 0 ;
      edtavCtlnove_placa_Enabled = 0 ;
      edtavCtlnove_valorantiguo_Enabled = 0 ;
      edtavCtlnove_valornuevo_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRIDTRAZA_nEOF ;
   private byte GRIDHIJOS_nEOF ;
   private byte AV43cTDet_Plazo_N ;
   private byte subGridtraza_Backcolorstyle ;
   private byte subGridtraza_Titlebackstyle ;
   private byte subGridtraza_Allowselection ;
   private byte subGridtraza_Allowhovering ;
   private byte subGridtraza_Allowcollapsing ;
   private byte subGridtraza_Collapsed ;
   private byte subGridatributos_Backcolorstyle ;
   private byte subGridatributos_Titlebackstyle ;
   private byte subGridatributos_Allowselection ;
   private byte subGridatributos_Allowhovering ;
   private byte subGridatributos_Allowcollapsing ;
   private byte subGridatributos_Collapsed ;
   private byte subGridhijos_Backcolorstyle ;
   private byte subGridhijos_Titlebackstyle ;
   private byte subGridhijos_Allowselection ;
   private byte subGridhijos_Allowhovering ;
   private byte subGridhijos_Allowcollapsing ;
   private byte subGridhijos_Collapsed ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGridtraza_Backstyle ;
   private byte subGridatributos_Backstyle ;
   private byte subGridhijos_Backstyle ;
   private byte subGrid1_Backstyle ;
   private byte GRID1_nEOF ;
   private byte GRIDATRIBUTOS_nEOF ;
   private short nRC_GXsfl_144 ;
   private short nGXsfl_144_idx=1 ;
   private short nRC_GXsfl_163 ;
   private short nGXsfl_163_idx=1 ;
   private short nRC_GXsfl_176 ;
   private short nGXsfl_176_idx=1 ;
   private short nRC_GXsfl_191 ;
   private short nGXsfl_191_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV19cRegi_Cod ;
   private short AV6cCata_VidaUtil ;
   private short AV42cTDet_Taza ;
   private short AV56GXV1 ;
   private short AV65GXV2 ;
   private short AV68GXV3 ;
   private short AV76GXV4 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_144_fel_idx=1 ;
   private short nGXsfl_163_fel_idx=1 ;
   private short nGXsfl_176_fel_idx=1 ;
   private short nGXsfl_191_fel_idx=1 ;
   private short AV35SWGridAtributos ;
   private short A632Vida_Util ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A12Regi_Cod ;
   private int subGridtraza_Rows ;
   private int subGridhijos_Rows ;
   private int Tab2_Pagecount ;
   private int edtavCregi_cod_Enabled ;
   private int edtavCregi_descripcion_Enabled ;
   private int edtavCcent_codigo_Enabled ;
   private int edtavCcent_descripcion_Enabled ;
   private int edtavCinvd_almacencodigo_Enabled ;
   private int edtavCalma_descripcion_Enabled ;
   private int edtavCinvd_bodegacodigo_Enabled ;
   private int edtavCbarea_descripcion_Enabled ;
   private int edtavCuen_cedula_Enabled ;
   private int edtavCcuen_nombre_Enabled ;
   private int edtavCclas_codigo_Enabled ;
   private int edtavCclas_descripcion_Enabled ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavCtipo_descripcion_Enabled ;
   private int edtavCelem_descripcion_Enabled ;
   private int edtavCcata_vidautil_Enabled ;
   private int edtavCtdet_placapadre_Enabled ;
   private int edtavCtdet_valorunitario_Enabled ;
   private int edtavCtdet_otros_costos_Enabled ;
   private int edtavCtdet_valor_futuro_Enabled ;
   private int edtavCtdet_taza_Enabled ;
   private int edtavCtdet_plazo_n_Enabled ;
   private int edtavCtdet_valor_presente_Enabled ;
   private int edtavCtdet_valortotal_Enabled ;
   private int edtavCinvd_fechaadquisicion_Enabled ;
   private int subGridtraza_Titlebackcolor ;
   private int subGridtraza_Allbackcolor ;
   private int edtavCtlgtran_centrocostocodigo_Enabled ;
   private int edtavCtlgtran_codigomovimiento_Enabled ;
   private int edtavCtlgtran_descripcionmovimiento_Enabled ;
   private int edtavCtlgtran_consecutivocc_Enabled ;
   private int edtavCtlgtran_fecharegistro_Enabled ;
   private int edtavCtlgtran_cedulacuentadantedestino_Enabled ;
   private int edtavCtlgtran_nombcuentadantedestino_Enabled ;
   private int subGridtraza_Selectioncolor ;
   private int subGridtraza_Hoveringcolor ;
   private int subGridatributos_Titlebackcolor ;
   private int subGridatributos_Allbackcolor ;
   private int edtavCtlgtdet_listdescripcion_Enabled ;
   private int edtavCtlgtdet_valoratributo_Enabled ;
   private int subGridatributos_Selectioncolor ;
   private int subGridatributos_Hoveringcolor ;
   private int subGridhijos_Titlebackcolor ;
   private int subGridhijos_Allbackcolor ;
   private int edtavCtlgelem_consecutivo_Enabled ;
   private int edtavCtlgcata_descripcion_Enabled ;
   private int edtavCtlginvd_numeroplaca_Enabled ;
   private int edtavCtlgmarca_Enabled ;
   private int edtavCtlgserial_Enabled ;
   private int edtavCtlgmodelo_Enabled ;
   private int edtavCtlgtdet_observaciones_Enabled ;
   private int subGridhijos_Selectioncolor ;
   private int subGridhijos_Hoveringcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlnove_fecharegistro_Enabled ;
   private int edtavCtlnove_identificador_Enabled ;
   private int edtavCtltnov_descripcion_Enabled ;
   private int edtavCtlnove_placa_Enabled ;
   private int edtavCtlnove_valorantiguo_Enabled ;
   private int edtavCtlnove_valornuevo_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGridtraza_Islastpage ;
   private int subGrid1_Islastpage ;
   private int subGridhijos_Islastpage ;
   private int subGridatributos_Islastpage ;
   private int GRIDTRAZA_nGridOutOfScope ;
   private int GRIDHIJOS_nGridOutOfScope ;
   private int idxLst ;
   private int subGridtraza_Backcolor ;
   private int subGridatributos_Backcolor ;
   private int subGridhijos_Backcolor ;
   private int subGrid1_Backcolor ;
   private long GRIDTRAZA_nFirstRecordOnPage ;
   private long GRIDHIJOS_nFirstRecordOnPage ;
   private long AV50Cuen_Cedula ;
   private long GRIDTRAZA_nCurrentRecord ;
   private long GRIDATRIBUTOS_nCurrentRecord ;
   private long GRIDHIJOS_nCurrentRecord ;
   private long GRID1_nCurrentRecord ;
   private long GRIDTRAZA_nRecordCount ;
   private long GRIDHIJOS_nRecordCount ;
   private long A33Tipo_Codigo ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long AV27Invd_RegionalId ;
   private long AV25Invd_CentroCostoId ;
   private long AV9CCuen_Identificacion ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private long A69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long AV37Tran_Id ;
   private long AV36TDet_Consecutivo ;
   private long A70TDet_ListId ;
   private long A48Tran_CentroCostoId ;
   private long A513Tran_ConsecutivoCC ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRIDATRIBUTOS_nFirstRecordOnPage ;
   private java.math.BigDecimal AV22cTDet_ValorUnitario ;
   private java.math.BigDecimal AV45cTDet_Otros_Costos ;
   private java.math.BigDecimal AV41cTDet_Valor_Futuro ;
   private java.math.BigDecimal AV44cTDet_Valor_Presente ;
   private java.math.BigDecimal AV46cTDet_ValorTotal ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_144_idx="0001" ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sGXsfl_163_idx="0001" ;
   private String sGXsfl_176_idx="0001" ;
   private String sGXsfl_191_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Tab2_Class ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Caption ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable3_Internalname ;
   private String lblTabpage1_title_Internalname ;
   private String lblTabpage1_title_Jsonclick ;
   private String divTabpage1table_Internalname ;
   private String divTable1_Internalname ;
   private String edtavCregi_cod_Internalname ;
   private String TempTags ;
   private String edtavCregi_cod_Jsonclick ;
   private String edtavCregi_descripcion_Internalname ;
   private String edtavCregi_descripcion_Jsonclick ;
   private String edtavCcent_codigo_Internalname ;
   private String edtavCcent_codigo_Jsonclick ;
   private String edtavCcent_descripcion_Internalname ;
   private String edtavCcent_descripcion_Jsonclick ;
   private String edtavCinvd_almacencodigo_Internalname ;
   private String edtavCinvd_almacencodigo_Jsonclick ;
   private String edtavCalma_descripcion_Internalname ;
   private String edtavCalma_descripcion_Jsonclick ;
   private String edtavCinvd_bodegacodigo_Internalname ;
   private String edtavCinvd_bodegacodigo_Jsonclick ;
   private String edtavCbarea_descripcion_Internalname ;
   private String edtavCbarea_descripcion_Jsonclick ;
   private String edtavCuen_cedula_Internalname ;
   private String edtavCuen_cedula_Jsonclick ;
   private String edtavCcuen_nombre_Internalname ;
   private String edtavCcuen_nombre_Jsonclick ;
   private String lblTabpage2_title_Internalname ;
   private String lblTabpage2_title_Jsonclick ;
   private String divTabpage2table_Internalname ;
   private String divTable7_Internalname ;
   private String edtavCclas_codigo_Internalname ;
   private String edtavCclas_codigo_Jsonclick ;
   private String edtavCclas_descripcion_Internalname ;
   private String edtavCclas_descripcion_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String edtavCcata_descripcion_Internalname ;
   private String edtavCtipo_descripcion_Internalname ;
   private String edtavCtipo_descripcion_Jsonclick ;
   private String edtavCelem_descripcion_Internalname ;
   private String edtavCelem_descripcion_Jsonclick ;
   private String edtavCcata_vidautil_Internalname ;
   private String edtavCcata_vidautil_Jsonclick ;
   private String edtavCtdet_placapadre_Internalname ;
   private String edtavCtdet_placapadre_Jsonclick ;
   private String edtavCtdet_valorunitario_Internalname ;
   private String edtavCtdet_valorunitario_Jsonclick ;
   private String edtavCtdet_otros_costos_Internalname ;
   private String edtavCtdet_otros_costos_Jsonclick ;
   private String edtavCtdet_valor_futuro_Internalname ;
   private String edtavCtdet_valor_futuro_Jsonclick ;
   private String edtavCtdet_taza_Internalname ;
   private String edtavCtdet_taza_Jsonclick ;
   private String edtavCtdet_plazo_n_Internalname ;
   private String edtavCtdet_plazo_n_Jsonclick ;
   private String edtavCtdet_valor_presente_Internalname ;
   private String edtavCtdet_valor_presente_Jsonclick ;
   private String edtavCtdet_valortotal_Internalname ;
   private String edtavCtdet_valortotal_Jsonclick ;
   private String edtavCinvd_fechaadquisicion_Internalname ;
   private String edtavCinvd_fechaadquisicion_Jsonclick ;
   private String lblTabpage3_title_Internalname ;
   private String lblTabpage3_title_Jsonclick ;
   private String divTabpage3table_Internalname ;
   private String divTable6_Internalname ;
   private String sStyleString ;
   private String subGridtraza_Internalname ;
   private String subGridtraza_Class ;
   private String subGridtraza_Linesclass ;
   private String lblTabpage4_title_Internalname ;
   private String lblTabpage4_title_Jsonclick ;
   private String divTabpage4table_Internalname ;
   private String divTable2_Internalname ;
   private String subGridatributos_Internalname ;
   private String subGridatributos_Class ;
   private String subGridatributos_Linesclass ;
   private String lblTabpage5_title_Internalname ;
   private String lblTabpage5_title_Jsonclick ;
   private String divTabpage5table_Internalname ;
   private String divTable5_Internalname ;
   private String subGridhijos_Internalname ;
   private String subGridhijos_Class ;
   private String subGridhijos_Linesclass ;
   private String lblTabpage6_title_Internalname ;
   private String lblTabpage6_title_Jsonclick ;
   private String divTabpage6table_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavCtlgtran_centrocostocodigo_Internalname ;
   private String edtavCtlgtran_codigomovimiento_Internalname ;
   private String edtavCtlgtran_descripcionmovimiento_Internalname ;
   private String edtavCtlgtran_consecutivocc_Internalname ;
   private String edtavCtlgtran_fecharegistro_Internalname ;
   private String edtavCtlgtran_cedulacuentadantedestino_Internalname ;
   private String edtavCtlgtran_nombcuentadantedestino_Internalname ;
   private String edtavCtlgtdet_listdescripcion_Internalname ;
   private String edtavCtlgtdet_valoratributo_Internalname ;
   private String edtavCtlgelem_consecutivo_Internalname ;
   private String edtavCtlgcata_descripcion_Internalname ;
   private String edtavCtlginvd_numeroplaca_Internalname ;
   private String edtavCtlgmarca_Internalname ;
   private String edtavCtlgserial_Internalname ;
   private String edtavCtlgmodelo_Internalname ;
   private String edtavCtlgtdet_observaciones_Internalname ;
   private String edtavCtlnove_fecharegistro_Internalname ;
   private String edtavCtlnove_identificador_Internalname ;
   private String edtavCtltnov_descripcion_Internalname ;
   private String edtavCtlnove_placa_Internalname ;
   private String edtavCtlnove_valorantiguo_Internalname ;
   private String edtavCtlnove_valornuevo_Internalname ;
   private String sGXsfl_144_fel_idx="0001" ;
   private String sGXsfl_163_fel_idx="0001" ;
   private String sGXsfl_176_fel_idx="0001" ;
   private String sGXsfl_191_fel_idx="0001" ;
   private String hsh ;
   private String AV26Invd_EsPlacaPadre ;
   private String scmdbuf ;
   private String A501Invd_EsPlacaPadre ;
   private String A58Tran_Estado ;
   private String ROClassString ;
   private String edtavCtlgtran_centrocostocodigo_Jsonclick ;
   private String edtavCtlgtran_codigomovimiento_Jsonclick ;
   private String edtavCtlgtran_descripcionmovimiento_Jsonclick ;
   private String edtavCtlgtran_consecutivocc_Jsonclick ;
   private String edtavCtlgtran_fecharegistro_Jsonclick ;
   private String edtavCtlgtran_cedulacuentadantedestino_Jsonclick ;
   private String edtavCtlgtran_nombcuentadantedestino_Jsonclick ;
   private String edtavCtlgtdet_listdescripcion_Jsonclick ;
   private String edtavCtlgtdet_valoratributo_Jsonclick ;
   private String edtavCtlgelem_consecutivo_Jsonclick ;
   private String edtavCtlgcata_descripcion_Jsonclick ;
   private String edtavCtlginvd_numeroplaca_Jsonclick ;
   private String edtavCtlgmarca_Jsonclick ;
   private String edtavCtlgserial_Jsonclick ;
   private String edtavCtlgmodelo_Jsonclick ;
   private String edtavCtlgtdet_observaciones_Jsonclick ;
   private String edtavCtlnove_fecharegistro_Jsonclick ;
   private String edtavCtlnove_identificador_Jsonclick ;
   private String edtavCtltnov_descripcion_Jsonclick ;
   private String edtavCtlnove_placa_Jsonclick ;
   private String edtavCtlnove_valorantiguo_Jsonclick ;
   private String edtavCtlnove_valornuevo_Jsonclick ;
   private String Tab2_Internalname ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date AV16cInvd_FechaAdquisicion ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Tab2_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_144_Refreshing=false ;
   private boolean bGXsfl_163_Refreshing=false ;
   private boolean bGXsfl_176_Refreshing=false ;
   private boolean bGXsfl_191_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV163 ;
   private boolean gx_BV176 ;
   private boolean gx_BV191 ;
   private boolean n632Vida_Util ;
   private boolean n43Cuen_Identificacion ;
   private boolean n44Cuen_Nombre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n463Invd_Estado ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n624Costo_Desmante ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n32BArea_Codigo ;
   private boolean n481Tran_IndE_S ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n492TDet_ListDescripcion ;
   private boolean n504TDet_Observaciones ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n58Tran_Estado ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean gx_BV144 ;
   private String wcpOAV18cInvd_NumeroPlaca ;
   private String AV17cInvd_ModuloAlmacen ;
   private String AV13cInvd_AlmacenCodigo ;
   private String AV14cInvd_BodegaCodigo ;
   private String AV11cElem_Consecutivo ;
   private String AV18cInvd_NumeroPlaca ;
   private String AV20cRegi_Descripcion ;
   private String AV7cCent_Codigo ;
   private String AV8cCent_Descripcion ;
   private String AV51cAlma_Descripcion ;
   private String AV52cBArea_Descripcion ;
   private String AV10cCuen_Nombre ;
   private String AV48cClas_Codigo ;
   private String AV49cClas_Descripcion ;
   private String AV5cCata_Descripcion ;
   private String AV24cTipo_Descripcion ;
   private String AV12cElem_Descripcion ;
   private String AV47cTDet_PlacaPadre ;
   private String AV15cInvd_Estado ;
   private String A37Cata_Codigo ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A44Cuen_Nombre ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String A13Regi_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A32BArea_Codigo ;
   private String A31Bode_Codigo ;
   private String A610BArea_Descripcion ;
   private String A481Tran_IndE_S ;
   private String A490TDet_PlacaNumero ;
   private String A492TDet_ListDescripcion ;
   private String A494TDet_ValorAtributo ;
   private String A504TDet_Observaciones ;
   private String A419Tran_CentroCostoCodigo ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A389Tran_NombCuentadanteDestino ;
   private com.genexus.webpanels.GXWebGrid GridtrazaContainer ;
   private com.genexus.webpanels.GXWebGrid GridatributosContainer ;
   private com.genexus.webpanels.GXWebGrid GridhijosContainer ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow GridtrazaRow ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow GridhijosRow ;
   private com.genexus.webpanels.GXWebRow GridatributosRow ;
   private com.genexus.webpanels.GXWebColumn GridtrazaColumn ;
   private com.genexus.webpanels.GXWebColumn GridatributosColumn ;
   private com.genexus.webpanels.GXWebColumn GridhijosColumn ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCinvd_moduloalmacen ;
   private HTMLChoice cmbavCinvd_estado ;
   private HTMLChoice cmbavCtlgtran_estado ;
   private IDataStoreProvider pr_default ;
   private String[] H006D2_A37Cata_Codigo ;
   private long[] H006D2_A33Tipo_Codigo ;
   private String[] H006D2_A67Invd_NumeroPlaca ;
   private String[] H006D2_A66Elem_Consecutivo ;
   private String[] H006D2_A557Elem_Descripcion ;
   private String[] H006D2_A298Cata_Descripcion ;
   private String[] H006D2_A34Clas_Codigo ;
   private String[] H006D2_A291Clas_Descripcion ;
   private short[] H006D2_A632Vida_Util ;
   private boolean[] H006D2_n632Vida_Util ;
   private String[] H006D2_A253Tipo_Descripcion ;
   private long[] H006D2_A410Invd_RegionalId ;
   private long[] H006D2_A411Invd_CentroCostoId ;
   private String[] H006D2_A412Invd_ModuloAlmacen ;
   private String[] H006D2_A413Invd_AlmacenCodigo ;
   private String[] H006D2_A414Invd_BodegaCodigo ;
   private long[] H006D2_A43Cuen_Identificacion ;
   private boolean[] H006D2_n43Cuen_Identificacion ;
   private long[] H006D2_A688Cuen_Cedula ;
   private String[] H006D2_A44Cuen_Nombre ;
   private boolean[] H006D2_n44Cuen_Nombre ;
   private String[] H006D2_A501Invd_EsPlacaPadre ;
   private boolean[] H006D2_n501Invd_EsPlacaPadre ;
   private java.util.Date[] H006D2_A466Invd_FechaAdquisicion ;
   private boolean[] H006D2_n466Invd_FechaAdquisicion ;
   private String[] H006D2_A463Invd_Estado ;
   private boolean[] H006D2_n463Invd_Estado ;
   private java.math.BigDecimal[] H006D2_A465Invd_ValorAdquisicion ;
   private boolean[] H006D2_n465Invd_ValorAdquisicion ;
   private java.math.BigDecimal[] H006D2_A624Costo_Desmante ;
   private boolean[] H006D2_n624Costo_Desmante ;
   private java.math.BigDecimal[] H006D2_A625Variable_VF ;
   private boolean[] H006D2_n625Variable_VF ;
   private short[] H006D2_A626Variable_I ;
   private boolean[] H006D2_n626Variable_I ;
   private short[] H006D2_A627Variable_N ;
   private boolean[] H006D2_n627Variable_N ;
   private java.math.BigDecimal[] H006D2_A628Otros_Costos_Dev ;
   private boolean[] H006D2_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] H006D2_A629Costo_Total_Dev ;
   private String[] H006D2_A68Invd_PlacaPadre ;
   private boolean[] H006D2_n68Invd_PlacaPadre ;
   private long[] H006D3_A2Regi_Id ;
   private short[] H006D3_A12Regi_Cod ;
   private String[] H006D3_A13Regi_Descripcion ;
   private long[] H006D4_A1Cent_Id ;
   private String[] H006D4_A3Cent_Codigo ;
   private String[] H006D4_A4Cent_Descripcion ;
   private String[] H006D5_A28Alma_Codigo ;
   private String[] H006D5_A27Alma_Modulo ;
   private long[] H006D5_A1Cent_Id ;
   private String[] H006D5_A252Alma_Descripcion ;
   private String[] H006D6_A32BArea_Codigo ;
   private boolean[] H006D6_n32BArea_Codigo ;
   private String[] H006D6_A31Bode_Codigo ;
   private String[] H006D6_A28Alma_Codigo ;
   private String[] H006D6_A27Alma_Modulo ;
   private long[] H006D6_A1Cent_Id ;
   private String[] H006D6_A610BArea_Descripcion ;
   private String[] H006D7_A481Tran_IndE_S ;
   private boolean[] H006D7_n481Tran_IndE_S ;
   private String[] H006D7_A490TDet_PlacaNumero ;
   private boolean[] H006D7_n490TDet_PlacaNumero ;
   private String[] H006D7_A66Elem_Consecutivo ;
   private long[] H006D7_A69TDet_Consecutivo ;
   private long[] H006D7_A46Tran_Id ;
   private long[] H006D8_A69TDet_Consecutivo ;
   private long[] H006D8_A46Tran_Id ;
   private String[] H006D8_A492TDet_ListDescripcion ;
   private boolean[] H006D8_n492TDet_ListDescripcion ;
   private String[] H006D8_A494TDet_ValorAtributo ;
   private long[] H006D8_A70TDet_ListId ;
   private String[] H006D9_A37Cata_Codigo ;
   private String[] H006D9_A68Invd_PlacaPadre ;
   private boolean[] H006D9_n68Invd_PlacaPadre ;
   private String[] H006D9_A66Elem_Consecutivo ;
   private String[] H006D9_A298Cata_Descripcion ;
   private String[] H006D9_A67Invd_NumeroPlaca ;
   private String[] H006D10_A481Tran_IndE_S ;
   private boolean[] H006D10_n481Tran_IndE_S ;
   private String[] H006D10_A490TDet_PlacaNumero ;
   private boolean[] H006D10_n490TDet_PlacaNumero ;
   private String[] H006D10_A66Elem_Consecutivo ;
   private long[] H006D10_A69TDet_Consecutivo ;
   private String[] H006D10_A504TDet_Observaciones ;
   private boolean[] H006D10_n504TDet_Observaciones ;
   private long[] H006D10_A46Tran_Id ;
   private long[] H006D11_A69TDet_Consecutivo ;
   private long[] H006D11_A46Tran_Id ;
   private String[] H006D11_A494TDet_ValorAtributo ;
   private long[] H006D11_A70TDet_ListId ;
   private long[] H006D12_A69TDet_Consecutivo ;
   private long[] H006D12_A46Tran_Id ;
   private long[] H006D12_A48Tran_CentroCostoId ;
   private String[] H006D12_A490TDet_PlacaNumero ;
   private boolean[] H006D12_n490TDet_PlacaNumero ;
   private String[] H006D12_A419Tran_CentroCostoCodigo ;
   private boolean[] H006D12_n419Tran_CentroCostoCodigo ;
   private String[] H006D12_A49Tran_CodigoMovimiento ;
   private long[] H006D12_A513Tran_ConsecutivoCC ;
   private boolean[] H006D12_n513Tran_ConsecutivoCC ;
   private String[] H006D12_A381Tran_DescripcionMovimiento ;
   private boolean[] H006D12_n381Tran_DescripcionMovimiento ;
   private String[] H006D12_A58Tran_Estado ;
   private boolean[] H006D12_n58Tran_Estado ;
   private long[] H006D12_A52Tran_IdCuentadanteDestino ;
   private boolean[] H006D12_n52Tran_IdCuentadanteDestino ;
   private long[] H006D12_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H006D12_n704Tran_CedulaCuentadanteDestino ;
   private String[] H006D12_A389Tran_NombCuentadanteDestino ;
   private boolean[] H006D12_n389Tran_NombCuentadanteDestino ;
   private java.util.Date[] H006D12_A55Tran_FechaRegistro ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem> AV30SDTHVAtributos ;
   private GXBaseCollection<com.orions2.SdtSDTHVHijos_SDTHVHijosItem> AV32SDTHVHijos ;
   private GXBaseCollection<com.orions2.SdtSDTHVTraza_SDTHVTrazaItem> AV39SDTHVTraza ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem> AV53SDTNovedadesBien ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem> GXt_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem1 ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesBien_SDTNovedadesBienItem> GXv_objcol_SdtSDTNovedadesBien_SDTNovedadesBienItem2[] ;
   private com.orions2.SdtSDTHVAtributos_SDTHVAtributosItem AV31SDTHVAtributosItem ;
   private com.orions2.SdtSDTHVHijos_SDTHVHijosItem AV33SDTHVHijosItem ;
   private com.orions2.SdtSDTHVTraza_SDTHVTrazaItem AV40SDTHVTrazaItem ;
}

final  class wp_alm_hojavida__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006D2", "SELECT T2.Cata_Codigo, T2.Tipo_Codigo, T1.Invd_NumeroPlaca, T1.Elem_Consecutivo, T2.Elem_Descripcion, T3.Cata_Descripcion, T3.Clas_Codigo, T4.Clas_Descripcion, T2.Vida_Util, T5.Tipo_Descripcion, T1.Invd_RegionalId, T1.Invd_CentroCostoId, T1.Invd_ModuloAlmacen, T1.Invd_AlmacenCodigo, T1.Invd_BodegaCodigo, T1.Cuen_Identificacion, T6.Cuen_Cedula, T6.Cuen_Nombre, T1.Invd_EsPlacaPadre, T1.Invd_FechaAdquisicion, T1.Invd_Estado, T1.Invd_ValorAdquisicion, T1.Costo_Desmante, T1.Variable_VF, T1.Variable_I, T1.Variable_N, T1.Otros_Costos_Dev, T1.Costo_Total_Dev, T1.Invd_PlacaPadre FROM (((((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) INNER JOIN ALM_TIPO_ELEMENTO T5 ON T5.Tipo_Codigo = T2.Tipo_Codigo) LEFT JOIN ALM_CUENTADANTE T6 ON T6.Cuen_Identificacion = T1.Cuen_Identificacion) WHERE T1.Invd_NumeroPlaca = RTRIM(LTRIM(?)) ORDER BY T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D3", "SELECT Regi_Id, Regi_Cod, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ORDER BY Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006D4", "SELECT Cent_Id, Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006D5", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006D6", "SELECT T1.BArea_Codigo, T1.Bode_Codigo, T1.Alma_Codigo, T1.Alma_Modulo, T1.Cent_Id, T2.BArea_Descripcion FROM (ALM_ALMACEN_BODEGAS T1 LEFT JOIN ALM_AREA T2 ON T2.BArea_Codigo = T1.BArea_Codigo AND T2.Cent_Id = T1.Cent_Id) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006D7", "SELECT T2.Tran_IndE_S AS Tran_IndE_S, T1.TDet_PlacaNumero, T1.Elem_Consecutivo, T1.TDet_Consecutivo, T1.Tran_Id FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE (T1.TDet_PlacaNumero = RTRIM(LTRIM(?))) AND (T2.Tran_IndE_S = 'E' or T2.Tran_IndE_S = 'A') AND (T1.Elem_Consecutivo = ?) ORDER BY T1.Tran_Id, T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D8", "SELECT T1.TDet_Consecutivo, T1.Tran_Id, T2.List_Descripcion AS TDet_ListDescripcion, T1.TDet_ValorAtributo, T1.TDet_ListId AS TDet_ListId FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo, T1.TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D9", "SELECT T2.Cata_Codigo, T1.Invd_PlacaPadre, T1.Elem_Consecutivo, T3.Cata_Descripcion, T1.Invd_NumeroPlaca FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Invd_PlacaPadre = RTRIM(LTRIM(?)) ORDER BY T1.Invd_NumeroPlaca, T1.Invd_PlacaPadre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D10", "SELECT T2.Tran_IndE_S AS Tran_IndE_S, T1.TDet_PlacaNumero, T1.Elem_Consecutivo, T1.TDet_Consecutivo, T1.TDet_Observaciones, T1.Tran_Id FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) WHERE (T2.Tran_IndE_S = 'E' or T2.Tran_IndE_S = 'A') AND (T1.Elem_Consecutivo = ?) AND (T1.TDet_PlacaNumero = ?) ORDER BY T1.Tran_Id, T1.TDet_PlacaNumero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D11", "SELECT TDet_Consecutivo, Tran_Id, TDet_ValorAtributo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006D12", "SELECT T1.TDet_Consecutivo, T1.Tran_Id, T2.Tran_CentroCostoId AS Tran_CentroCostoId, T1.TDet_PlacaNumero, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T2.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T2.Tran_ConsecutivoCC, T4.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T2.Tran_Estado, T2.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T5.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T5.Cuen_Nombre AS Tran_NombCuentadanteDestino, T2.Tran_FechaRegistro FROM ((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T2.Tran_CentroCostoId) INNER JOIN ALM_TIPO_MOVIMIENTO T4 ON T4.Tpmo_Codigo = T2.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T2.Tran_IdCuentadanteDestino) WHERE T1.TDet_PlacaNumero = ? ORDER BY T2.Tran_FechaRegistro DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[11])[0] = rslt.getLong(11) ;
               ((long[]) buf[12])[0] = rslt.getLong(12) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(15) ;
               ((long[]) buf[16])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(17) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 2) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(20) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(23,2) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(24,2) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(25) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(26) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(27,2) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(28,2) ;
               ((String[]) buf[40])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

