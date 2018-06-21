/*
               File: selcuentaresponsabilidad_impl
        Description: Selecciona Cuenta Responsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:42.57
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

public final  class selcuentaresponsabilidad_impl extends GXDataArea
{
   public selcuentaresponsabilidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selcuentaresponsabilidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selcuentaresponsabilidad_impl.class ));
   }

   public selcuentaresponsabilidad_impl( int remoteHandle ,
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
            nRC_GXsfl_34 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_34_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_34_idx = httpContext.GetNextPar( ) ;
            AV17LinkSelection = httpContext.GetNextPar( ) ;
            AV8Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV23Tabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV16Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
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
            AV17LinkSelection = httpContext.GetNextPar( ) ;
            AV8Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV23Tabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV16Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
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
            AV5Regi_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Regi_Id", GXutil.ltrim( GXutil.str( AV5Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Regi_Id), "ZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10cCent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10cCent_Id", GXutil.ltrim( GXutil.str( AV10cCent_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10cCent_Id), "ZZZZZZZZZZ9")));
               AV13Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV13Cuen_Identificacion, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
               AV19pTran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19pTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV19pTran_ConsecutivoCC, 18, 0)));
               AV18pFecha_Movimiento = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18pFecha_Movimiento", localUtil.format(AV18pFecha_Movimiento, "99/99/99"));
               AV24PTabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24PTabla", GXutil.ltrim( GXutil.str( AV24PTabla, 4, 0)));
               AV25pTran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25pTran_Id", GXutil.ltrim( GXutil.str( AV25pTran_Id, 11, 0)));
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
      pa6U2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6U2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414214263");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selcuentaresponsabilidad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10cCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19pTran_ConsecutivoCC,18,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV18pFecha_Movimiento)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24PTabla,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25pTran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV5Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCCENT_ID", GXutil.ltrim( localUtil.ntoc( AV10cCent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV13Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( AV19pTran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPFECHA_MOVIMIENTO", localUtil.dtoc( AV18pFecha_Movimiento, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTABLA", GXutil.ltrim( localUtil.ntoc( AV24PTabla, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV25pTran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10cCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10cCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FECHACONTAINER_Class", GXutil.rtrim( divFechacontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANSACCIONFILTERCONTAINER_Class", GXutil.rtrim( divTransaccionfiltercontainer_Class));
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
         we6U2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6U2( ) ;
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
      return formatLink("com.orions2.selcuentaresponsabilidad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10cCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19pTran_ConsecutivoCC,18,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV18pFecha_Movimiento)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24PTabla,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25pTran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "SelCuentaResponsabilidad" ;
   }

   public String getPgmdesc( )
   {
      return "Selecciona Cuenta Responsabilidad" ;
   }

   public void wb6U0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divFechacontainer_Internalname, 1, 0, "px", 0, "px", divFechacontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblFechafilter_Internalname, "Fecha", "", "", lblFechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116u1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelCuentaResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtran_fecharatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_fecharatificacion_Internalname, localUtil.format(AV12cTran_Fecharatificacion, "99/99/99"), localUtil.format( AV12cTran_Fecharatificacion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_fecharatificacion_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_fecharatificacion_Visible, edtavCtran_fecharatificacion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_SelCuentaResponsabilidad.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCtran_fecharatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtran_fecharatificacion_Visible==0)||(edtavCtran_fecharatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SelCuentaResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltransaccionfilter_Internalname, "Transacción", "", "", lblLbltransaccionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126u1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelCuentaResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cTran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavCtran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cTran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cTran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_consecutivocc_Visible, edtavCtran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SelCuentaResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e136u1_client"+"'", TempTags, "", 2, "HLP_SelCuentaResponsabilidad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"34\">") ;
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transacción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tabla") ;
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
            Grid2Column.AddObjectProperty("Value", httpContext.convertURL( AV17LinkSelection));
            Grid2Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", localUtil.format(AV16Fecha, "99/99/99"));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFecha_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV7Tran_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTran_consecutivocc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8Tran_Id, (byte)(11), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTran_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23Tabla, (byte)(4), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTabla_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (short)(nGXsfl_34_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid2Container.AddObjectProperty("GRID2_nEOF", GRID2_nEOF);
            Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelCuentaResponsabilidad.htm");
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

   public void start6U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selecciona Cuenta Responsabilidad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6U0( ) ;
   }

   public void ws6U2( )
   {
      start6U2( ) ;
      evt6U2( ) ;
   }

   public void evt6U2( )
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
                        else if ( GXutil.strcmp(sEvt, "VCTRAN_FECHARATIFICACION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e146U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCTRAN_CONSECUTIVOCC.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e156U2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) )
                        {
                           nGXsfl_34_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           AV17LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV17LinkSelection)==0) ? AV29Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17LinkSelection))), !bGXsfl_34_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17LinkSelection), true);
                           AV16Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha_Internalname), 0)) ;
                           AV7Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
                           AV8Tran_Id = localUtil.ctol( httpContext.cgiGet( edtavTran_id_Internalname), ",", ".") ;
                           AV23Tabla = (short)(localUtil.ctol( httpContext.cgiGet( edtavTabla_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e166U2 ();
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
                                       e176U2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e186U2 ();
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

   public void we6U2( )
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

   public void pa6U2( )
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid2_refresh( int subGrid2_Rows ,
                                  String AV17LinkSelection ,
                                  long AV8Tran_Id ,
                                  short AV23Tabla ,
                                  long AV7Tran_ConsecutivoCC ,
                                  java.util.Date AV16Fecha )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid2_Rows = subGrid2_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID2_nCurrentRecord = 0 ;
      rf6U2( ) ;
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
      rf6U2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFecha_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTran_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_id_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTabla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTabla_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
   }

   public void rf6U2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(34) ;
      nGXsfl_34_idx = (short)(1) ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
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
         subsflControlProps_342( ) ;
         /* Execute user event: Load */
         e186U2 ();
         if ( ( GRID2_nCurrentRecord > 0 ) && ( GRID2_nGridOutOfScope == 0 ) && ( nGXsfl_34_idx == 1 ) )
         {
            GRID2_nCurrentRecord = 0 ;
            GRID2_nGridOutOfScope = 1 ;
            subgrid2_firstpage( ) ;
            /* Execute user event: Load */
            e186U2 ();
         }
         wbEnd = (short)(34) ;
         wb6U0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
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
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return 8*1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      if ( GRID2_nEOF == 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
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
         gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      subGrid2_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
      }
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
         gxgrgrid2_refresh( subGrid2_Rows, AV17LinkSelection, AV8Tran_Id, AV23Tabla, AV7Tran_ConsecutivoCC, AV16Fecha) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6U0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFecha_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTran_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_id_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavTabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTabla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTabla_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e166U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtran_fecharatificacion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCTRAN_FECHARATIFICACION");
            GX_FocusControl = edtavCtran_fecharatificacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cTran_Fecharatificacion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_Fecharatificacion", localUtil.format(AV12cTran_Fecharatificacion, "99/99/99"));
         }
         else
         {
            AV12cTran_Fecharatificacion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCtran_fecharatificacion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_Fecharatificacion", localUtil.format(AV12cTran_Fecharatificacion, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavCtran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cTran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV11cTran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV11cTran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV11cTran_ConsecutivoCC, 18, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_34 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_34"), ",", ".")) ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID2_nFirstRecordOnPage"), ",", ".") ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID2_nEOF"), ",", ".")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
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
      e166U2 ();
      if (returnInSub) return;
   }

   public void e166U2( )
   {
      /* Start Routine */
      AV9ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      AV14DescAtri = context.getHttpContext().getImagePath( "850ff938-3238-4401-bbf0-b6d9fa315c1b", "", context.getHttpContext().getTheme( )) ;
      AV28Descatri_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "850ff938-3238-4401-bbf0-b6d9fa315c1b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOAD' Routine */
      AV17LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV17LinkSelection)==0) ? AV29Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17LinkSelection))), !bGXsfl_34_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17LinkSelection), true);
      AV29Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV17LinkSelection)==0) ? AV29Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17LinkSelection))), !bGXsfl_34_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17LinkSelection), true);
      AV21SDTCuentaResponsabilidad.clear();
      /* Using cursor H006U2 */
      pr_default.execute(0, new Object[] {new Long(AV5Regi_Id), new Long(AV10cCent_Id), new Long(AV13Cuen_Identificacion)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk6U3 = false ;
         A100DEVOC_CODIGO_MOVIMIENTO = H006U2_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
         n100DEVOC_CODIGO_MOVIMIENTO = H006U2_n100DEVOC_CODIGO_MOVIMIENTO[0] ;
         A99DEVOC_ESTADO = H006U2_A99DEVOC_ESTADO[0] ;
         n99DEVOC_ESTADO = H006U2_n99DEVOC_ESTADO[0] ;
         A98DEVOC_NIT_ORIGEN = H006U2_A98DEVOC_NIT_ORIGEN[0] ;
         n98DEVOC_NIT_ORIGEN = H006U2_n98DEVOC_NIT_ORIGEN[0] ;
         A97DEVOC_CENTRO_COSTO_ORIGEN = H006U2_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         n97DEVOC_CENTRO_COSTO_ORIGEN = H006U2_n97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         A96DEVOC_REGIONAL = H006U2_A96DEVOC_REGIONAL[0] ;
         n96DEVOC_REGIONAL = H006U2_n96DEVOC_REGIONAL[0] ;
         A101DEVOC_TRAN_ID = H006U2_A101DEVOC_TRAN_ID[0] ;
         n101DEVOC_TRAN_ID = H006U2_n101DEVOC_TRAN_ID[0] ;
         A723DEVOC_TRAN_CC = H006U2_A723DEVOC_TRAN_CC[0] ;
         n723DEVOC_TRAN_CC = H006U2_n723DEVOC_TRAN_CC[0] ;
         A103DEVOC_FECHA_MOVIMIENTO = H006U2_A103DEVOC_FECHA_MOVIMIENTO[0] ;
         n103DEVOC_FECHA_MOVIMIENTO = H006U2_n103DEVOC_FECHA_MOVIMIENTO[0] ;
         AV6Tpmo_Codigo = A100DEVOC_CODIGO_MOVIMIENTO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Tpmo_Codigo", AV6Tpmo_Codigo);
         /* Execute user subroutine: 'VALIDA MOVIMIENTO' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV20Responsabilidad, "SI") == 0 )
         {
            AV8Tran_Id = A101DEVOC_TRAN_ID ;
            AV23Tabla = (short)(1) ;
            while ( (pr_default.getStatus(0) != 101) && ( H006U2_A96DEVOC_REGIONAL[0] == A96DEVOC_REGIONAL ) && ( H006U2_A97DEVOC_CENTRO_COSTO_ORIGEN[0] == A97DEVOC_CENTRO_COSTO_ORIGEN ) && ( H006U2_A98DEVOC_NIT_ORIGEN[0] == A98DEVOC_NIT_ORIGEN ) && ( GXutil.strcmp(H006U2_A99DEVOC_ESTADO[0], A99DEVOC_ESTADO) == 0 ) )
            {
               if ( ! ( ( GXutil.strcmp(H006U2_A100DEVOC_CODIGO_MOVIMIENTO[0], A100DEVOC_CODIGO_MOVIMIENTO) == 0 ) && ( H006U2_A101DEVOC_TRAN_ID[0] == AV8Tran_Id ) ) )
               {
                  if (true) break;
               }
               brk6U3 = false ;
               A101DEVOC_TRAN_ID = H006U2_A101DEVOC_TRAN_ID[0] ;
               n101DEVOC_TRAN_ID = H006U2_n101DEVOC_TRAN_ID[0] ;
               A723DEVOC_TRAN_CC = H006U2_A723DEVOC_TRAN_CC[0] ;
               n723DEVOC_TRAN_CC = H006U2_n723DEVOC_TRAN_CC[0] ;
               A103DEVOC_FECHA_MOVIMIENTO = H006U2_A103DEVOC_FECHA_MOVIMIENTO[0] ;
               n103DEVOC_FECHA_MOVIMIENTO = H006U2_n103DEVOC_FECHA_MOVIMIENTO[0] ;
               AV7Tran_ConsecutivoCC = A723DEVOC_TRAN_CC ;
               AV16Fecha = A103DEVOC_FECHA_MOVIMIENTO ;
               brk6U3 = true ;
               pr_default.readNext(0);
            }
            if ( GXutil.dateCompare(GXutil.nullDate(), AV12cTran_Fecharatificacion) && (0==AV11cTran_ConsecutivoCC) )
            {
               if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
               {
                  sendrow_342( ) ;
                  GRID2_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                  {
                     GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                  }
               }
               if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
               {
                  GRID2_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
               {
                  httpContext.doAjaxLoad(34, Grid2Row);
               }
            }
            else if ( !( GXutil.dateCompare(AV12cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV11cTran_ConsecutivoCC) )
            {
               if ( GXutil.dateCompare(AV16Fecha, AV12cTran_Fecharatificacion) )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
            else if ( !( GXutil.dateCompare(AV12cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV11cTran_ConsecutivoCC != 0 ) )
            {
               if ( GXutil.dateCompare(AV16Fecha, AV12cTran_Fecharatificacion) && ( AV7Tran_ConsecutivoCC == AV11cTran_ConsecutivoCC ) )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
            else if ( GXutil.dateCompare(GXutil.nullDate(), AV12cTran_Fecharatificacion) && ( AV11cTran_ConsecutivoCC != 0 ) )
            {
               if ( AV7Tran_ConsecutivoCC == AV11cTran_ConsecutivoCC )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
         }
         if ( ! brk6U3 )
         {
            brk6U3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor H006U3 */
      pr_default.execute(1, new Object[] {new Long(AV5Regi_Id), new Long(AV10cCent_Id), new Long(AV13Cuen_Identificacion)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A58Tran_Estado = H006U3_A58Tran_Estado[0] ;
         n58Tran_Estado = H006U3_n58Tran_Estado[0] ;
         A51Tran_IdCuentadanteOrigen = H006U3_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = H006U3_n51Tran_IdCuentadanteOrigen[0] ;
         A48Tran_CentroCostoId = H006U3_A48Tran_CentroCostoId[0] ;
         A57Tran_RegionId = H006U3_A57Tran_RegionId[0] ;
         n57Tran_RegionId = H006U3_n57Tran_RegionId[0] ;
         A46Tran_Id = H006U3_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = H006U3_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H006U3_n513Tran_ConsecutivoCC[0] ;
         A390Tran_FechaRatificacion = H006U3_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = H006U3_n390Tran_FechaRatificacion[0] ;
         A49Tran_CodigoMovimiento = H006U3_A49Tran_CodigoMovimiento[0] ;
         AV6Tpmo_Codigo = A49Tran_CodigoMovimiento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Tpmo_Codigo", AV6Tpmo_Codigo);
         /* Execute user subroutine: 'VALIDA MOVIMIENTO' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV20Responsabilidad, "SI") == 0 )
         {
            AV8Tran_Id = A46Tran_Id ;
            AV23Tabla = (short)(2) ;
            AV7Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
            AV16Fecha = GXutil.resetTime( A390Tran_FechaRatificacion) ;
            if ( GXutil.dateCompare(GXutil.nullDate(), AV12cTran_Fecharatificacion) && (0==AV11cTran_ConsecutivoCC) )
            {
               if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
               {
                  sendrow_342( ) ;
                  GRID2_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                  {
                     GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                  }
               }
               if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
               {
                  GRID2_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
               {
                  httpContext.doAjaxLoad(34, Grid2Row);
               }
            }
            else if ( !( GXutil.dateCompare(AV12cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV11cTran_ConsecutivoCC) )
            {
               if ( GXutil.dateCompare(AV16Fecha, AV12cTran_Fecharatificacion) )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
            else if ( !( GXutil.dateCompare(AV12cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV11cTran_ConsecutivoCC != 0 ) )
            {
               if ( GXutil.dateCompare(AV16Fecha, AV12cTran_Fecharatificacion) && ( AV7Tran_ConsecutivoCC == AV11cTran_ConsecutivoCC ) )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
            else if ( GXutil.dateCompare(GXutil.nullDate(), AV12cTran_Fecharatificacion) && ( AV11cTran_ConsecutivoCC != 0 ) )
            {
               if ( AV7Tran_ConsecutivoCC == AV11cTran_ConsecutivoCC )
               {
                  if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
                  {
                     sendrow_342( ) ;
                     GRID2_nEOF = (byte)(1) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_recordsperpage( )))) == 0 ) )
                     {
                        GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
                     }
                  }
                  if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) )
                  {
                     GRID2_nEOF = (byte)(0) ;
                     com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
                  {
                     httpContext.doAjaxLoad(34, Grid2Row);
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S123( )
   {
      /* 'VALIDA MOVIMIENTO' Routine */
      AV20Responsabilidad = "NO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Responsabilidad", AV20Responsabilidad);
      /* Using cursor H006U4 */
      pr_default.execute(2, new Object[] {AV6Tpmo_Codigo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A38Tpmo_Codigo = H006U4_A38Tpmo_Codigo[0] ;
         A680Tpmo_CuentaResponsabilidad = H006U4_A680Tpmo_CuentaResponsabilidad[0] ;
         n680Tpmo_CuentaResponsabilidad = H006U4_n680Tpmo_CuentaResponsabilidad[0] ;
         A315Tpmo_TipoE_S = H006U4_A315Tpmo_TipoE_S[0] ;
         if ( ( GXutil.strcmp(A315Tpmo_TipoE_S, "S") == 0 ) && ( GXutil.strcmp(A680Tpmo_CuentaResponsabilidad, "SI") == 0 ) )
         {
            AV20Responsabilidad = "SI" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Responsabilidad", AV20Responsabilidad);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void e146U2( )
   {
      /* Ctran_fecharatificacion_Isvalid Routine */
      httpContext.doAjaxRefresh();
   }

   public void e156U2( )
   {
      /* Ctran_consecutivocc_Isvalid Routine */
      httpContext.doAjaxRefresh();
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e176U2 ();
      if (returnInSub) return;
   }

   public void e176U2( )
   {
      /* Enter Routine */
      AV19pTran_ConsecutivoCC = AV7Tran_ConsecutivoCC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19pTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV19pTran_ConsecutivoCC, 18, 0)));
      AV18pFecha_Movimiento = AV16Fecha ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18pFecha_Movimiento", localUtil.format(AV18pFecha_Movimiento, "99/99/99"));
      AV24PTabla = AV23Tabla ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24PTabla", GXutil.ltrim( GXutil.str( AV24PTabla, 4, 0)));
      AV25pTran_Id = AV8Tran_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25pTran_Id", GXutil.ltrim( GXutil.str( AV25pTran_Id, 11, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV19pTran_ConsecutivoCC),localUtil.format( AV18pFecha_Movimiento, "99/99/99"),new Short(AV24PTabla),new Long(AV25pTran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e186U2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV5Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Regi_Id", GXutil.ltrim( GXutil.str( AV5Regi_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Regi_Id), "ZZZZZZZZZZ9")));
      AV10cCent_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cCent_Id", GXutil.ltrim( GXutil.str( AV10cCent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10cCent_Id), "ZZZZZZZZZZ9")));
      AV13Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV13Cuen_Identificacion, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      AV19pTran_ConsecutivoCC = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19pTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV19pTran_ConsecutivoCC, 18, 0)));
      AV18pFecha_Movimiento = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18pFecha_Movimiento", localUtil.format(AV18pFecha_Movimiento, "99/99/99"));
      AV24PTabla = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24PTabla", GXutil.ltrim( GXutil.str( AV24PTabla, 4, 0)));
      AV25pTran_Id = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25pTran_Id", GXutil.ltrim( GXutil.str( AV25pTran_Id, 11, 0)));
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
      pa6U2( ) ;
      ws6U2( ) ;
      we6U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414214341");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selcuentaresponsabilidad.js", "?201861414214341");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_idx ;
      edtavFecha_Internalname = "vFECHA_"+sGXsfl_34_idx ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC_"+sGXsfl_34_idx ;
      edtavTran_id_Internalname = "vTRAN_ID_"+sGXsfl_34_idx ;
      edtavTabla_Internalname = "vTABLA_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_fel_idx ;
      edtavFecha_Internalname = "vFECHA_"+sGXsfl_34_fel_idx ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC_"+sGXsfl_34_fel_idx ;
      edtavTran_id_Internalname = "vTRAN_ID_"+sGXsfl_34_fel_idx ;
      edtavTabla_Internalname = "vTABLA_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb6U0( ) ;
      if ( ( 8 * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid2_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV7Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( localUtil.format(AV16Fecha, "99/99/99"))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV23Tabla, (byte)(4), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV8Tran_Id, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_34_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV17LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV17LinkSelection)==0)&&(GXutil.strcmp("", AV29Linkselection_GXI)==0))||!(GXutil.strcmp("", AV17LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV17LinkSelection)==0) ? AV29Linkselection_GXI : httpContext.getResourceRelative(AV17LinkSelection)) ;
         Grid2Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV17LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFecha_Internalname,localUtil.format(AV16Fecha, "99/99/99"),localUtil.format( AV16Fecha, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFecha_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavFecha_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTran_consecutivocc_Internalname,GXutil.ltrim( localUtil.ntoc( AV7Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")),((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTran_consecutivocc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTran_consecutivocc_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTran_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV8Tran_Id, (byte)(11), (byte)(0), ",", "")),((edtavTran_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8Tran_Id), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTran_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTran_id_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTabla_Internalname,GXutil.ltrim( localUtil.ntoc( AV23Tabla, (byte)(4), (byte)(0), ",", "")),((edtavTabla_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23Tabla), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV23Tabla), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTabla_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTabla_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_34_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void init_default_properties( )
   {
      lblFechafilter_Internalname = "FECHAFILTER" ;
      edtavCtran_fecharatificacion_Internalname = "vCTRAN_FECHARATIFICACION" ;
      divFechacontainer_Internalname = "FECHACONTAINER" ;
      lblLbltransaccionfilter_Internalname = "LBLTRANSACCIONFILTER" ;
      edtavCtran_consecutivocc_Internalname = "vCTRAN_CONSECUTIVOCC" ;
      divTransaccionfiltercontainer_Internalname = "TRANSACCIONFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtavFecha_Internalname = "vFECHA" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      edtavTran_id_Internalname = "vTRAN_ID" ;
      edtavTabla_Internalname = "vTABLA" ;
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
      edtavTabla_Jsonclick = "" ;
      edtavTran_id_Jsonclick = "" ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavFecha_Jsonclick = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      edtavTabla_Enabled = 0 ;
      edtavTran_id_Enabled = 0 ;
      edtavTran_consecutivocc_Enabled = 0 ;
      edtavFecha_Enabled = 0 ;
      subGrid2_Class = "WorkWith" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavCtran_consecutivocc_Jsonclick = "" ;
      edtavCtran_consecutivocc_Enabled = 1 ;
      edtavCtran_consecutivocc_Visible = 1 ;
      edtavCtran_fecharatificacion_Jsonclick = "" ;
      edtavCtran_fecharatificacion_Enabled = 1 ;
      edtavCtran_fecharatificacion_Visible = 1 ;
      divTransaccionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFechacontainer_Class = "AdvancedContainerItem" ;
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
      Form.setCaption( "Selecciona Cuenta Responsabilidad" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e136U1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("FECHAFILTER.CLICK","{handler:'e116U1',iparms:[{av:'divFechacontainer_Class',ctrl:'FECHACONTAINER',prop:'Class'}],oparms:[{av:'divFechacontainer_Class',ctrl:'FECHACONTAINER',prop:'Class'},{av:'edtavCtran_fecharatificacion_Visible',ctrl:'vCTRAN_FECHARATIFICACION',prop:'Visible'}]}");
      setEventMetadata("LBLTRANSACCIONFILTER.CLICK","{handler:'e126U1',iparms:[{av:'divTransaccionfiltercontainer_Class',ctrl:'TRANSACCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTransaccionfiltercontainer_Class',ctrl:'TRANSACCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_consecutivocc_Visible',ctrl:'vCTRAN_CONSECUTIVOCC',prop:'Visible'}]}");
      setEventMetadata("VCTRAN_FECHARATIFICACION.ISVALID","{handler:'e146U2',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("VCTRAN_CONSECUTIVOCC.ISVALID","{handler:'e156U2',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("ENTER","{handler:'e176U2',iparms:[{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV19pTran_ConsecutivoCC',fld:'vPTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV18pFecha_Movimiento',fld:'vPFECHA_MOVIMIENTO',pic:'',nv:''},{av:'AV24PTabla',fld:'vPTABLA',pic:'ZZZ9',nv:0},{av:'AV25pTran_Id',fld:'vPTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID2_FIRSTPAGE","{handler:'subgrid2_firstpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID2_PREVPAGE","{handler:'subgrid2_previouspage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID2_NEXTPAGE","{handler:'subgrid2_nextpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID2_LASTPAGE","{handler:'subgrid2_lastpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV17LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV8Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV7Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV16Fecha',fld:'vFECHA',pic:'',nv:''}],oparms:[]}");
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
      AV17LinkSelection = "" ;
      AV16Fecha = GXutil.nullDate() ;
      GXKey = "" ;
      AV18pFecha_Movimiento = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblFechafilter_Jsonclick = "" ;
      TempTags = "" ;
      AV12cTran_Fecharatificacion = GXutil.nullDate() ;
      lblLbltransaccionfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid2_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV29Linkselection_GXI = "" ;
      AV9ADVANCED_LABEL_TEMPLATE = "" ;
      AV14DescAtri = "" ;
      AV28Descatri_GXI = "" ;
      AV21SDTCuentaResponsabilidad = new GXBaseCollection<com.orions2.SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem>(com.orions2.SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem.class, "SDTCuentaResponsabilidad.SDTCuentaResponsabilidadItem", "ACBSENA", remoteHandle);
      scmdbuf = "" ;
      H006U2_A95DEVOC_ID = new long[1] ;
      H006U2_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      H006U2_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      H006U2_A99DEVOC_ESTADO = new String[] {""} ;
      H006U2_n99DEVOC_ESTADO = new boolean[] {false} ;
      H006U2_A98DEVOC_NIT_ORIGEN = new long[1] ;
      H006U2_n98DEVOC_NIT_ORIGEN = new boolean[] {false} ;
      H006U2_A97DEVOC_CENTRO_COSTO_ORIGEN = new long[1] ;
      H006U2_n97DEVOC_CENTRO_COSTO_ORIGEN = new boolean[] {false} ;
      H006U2_A96DEVOC_REGIONAL = new long[1] ;
      H006U2_n96DEVOC_REGIONAL = new boolean[] {false} ;
      H006U2_A101DEVOC_TRAN_ID = new long[1] ;
      H006U2_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      H006U2_A723DEVOC_TRAN_CC = new long[1] ;
      H006U2_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      H006U2_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      H006U2_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      A100DEVOC_CODIGO_MOVIMIENTO = "" ;
      A99DEVOC_ESTADO = "" ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      AV6Tpmo_Codigo = "" ;
      AV20Responsabilidad = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      H006U3_A58Tran_Estado = new String[] {""} ;
      H006U3_n58Tran_Estado = new boolean[] {false} ;
      H006U3_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H006U3_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H006U3_A48Tran_CentroCostoId = new long[1] ;
      H006U3_A57Tran_RegionId = new long[1] ;
      H006U3_n57Tran_RegionId = new boolean[] {false} ;
      H006U3_A46Tran_Id = new long[1] ;
      H006U3_A513Tran_ConsecutivoCC = new long[1] ;
      H006U3_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H006U3_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H006U3_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H006U3_A49Tran_CodigoMovimiento = new String[] {""} ;
      A58Tran_Estado = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A49Tran_CodigoMovimiento = "" ;
      H006U4_A38Tpmo_Codigo = new String[] {""} ;
      H006U4_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      H006U4_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      H006U4_A315Tpmo_TipoE_S = new String[] {""} ;
      A38Tpmo_Codigo = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      A315Tpmo_TipoE_S = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selcuentaresponsabilidad__default(),
         new Object[] {
             new Object[] {
            H006U2_A95DEVOC_ID, H006U2_A100DEVOC_CODIGO_MOVIMIENTO, H006U2_n100DEVOC_CODIGO_MOVIMIENTO, H006U2_A99DEVOC_ESTADO, H006U2_n99DEVOC_ESTADO, H006U2_A98DEVOC_NIT_ORIGEN, H006U2_n98DEVOC_NIT_ORIGEN, H006U2_A97DEVOC_CENTRO_COSTO_ORIGEN, H006U2_n97DEVOC_CENTRO_COSTO_ORIGEN, H006U2_A96DEVOC_REGIONAL,
            H006U2_n96DEVOC_REGIONAL, H006U2_A101DEVOC_TRAN_ID, H006U2_n101DEVOC_TRAN_ID, H006U2_A723DEVOC_TRAN_CC, H006U2_n723DEVOC_TRAN_CC, H006U2_A103DEVOC_FECHA_MOVIMIENTO, H006U2_n103DEVOC_FECHA_MOVIMIENTO
            }
            , new Object[] {
            H006U3_A58Tran_Estado, H006U3_n58Tran_Estado, H006U3_A51Tran_IdCuentadanteOrigen, H006U3_n51Tran_IdCuentadanteOrigen, H006U3_A48Tran_CentroCostoId, H006U3_A57Tran_RegionId, H006U3_n57Tran_RegionId, H006U3_A46Tran_Id, H006U3_A513Tran_ConsecutivoCC, H006U3_n513Tran_ConsecutivoCC,
            H006U3_A390Tran_FechaRatificacion, H006U3_n390Tran_FechaRatificacion, H006U3_A49Tran_CodigoMovimiento
            }
            , new Object[] {
            H006U4_A38Tpmo_Codigo, H006U4_A680Tpmo_CuentaResponsabilidad, H006U4_n680Tpmo_CuentaResponsabilidad, H006U4_A315Tpmo_TipoE_S
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavFecha_Enabled = 0 ;
      edtavTran_consecutivocc_Enabled = 0 ;
      edtavTran_id_Enabled = 0 ;
      edtavTabla_Enabled = 0 ;
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
   private short nRC_GXsfl_34 ;
   private short nGXsfl_34_idx=1 ;
   private short AV23Tabla ;
   private short AV24PTabla ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid2_Rows ;
   private int edtavCtran_fecharatificacion_Visible ;
   private int edtavCtran_fecharatificacion_Enabled ;
   private int edtavCtran_consecutivocc_Enabled ;
   private int edtavCtran_consecutivocc_Visible ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavFecha_Enabled ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavTran_id_Enabled ;
   private int edtavTabla_Enabled ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid2_Islastpage ;
   private int GRID2_nGridOutOfScope ;
   private int idxLst ;
   private int subGrid2_Backcolor ;
   private long wcpOAV5Regi_Id ;
   private long wcpOAV10cCent_Id ;
   private long wcpOAV13Cuen_Identificacion ;
   private long AV8Tran_Id ;
   private long AV7Tran_ConsecutivoCC ;
   private long AV5Regi_Id ;
   private long AV10cCent_Id ;
   private long AV13Cuen_Identificacion ;
   private long AV19pTran_ConsecutivoCC ;
   private long AV25pTran_Id ;
   private long GRID2_nFirstRecordOnPage ;
   private long AV11cTran_ConsecutivoCC ;
   private long GRID2_nCurrentRecord ;
   private long GRID2_nRecordCount ;
   private long A98DEVOC_NIT_ORIGEN ;
   private long A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private long A96DEVOC_REGIONAL ;
   private long A101DEVOC_TRAN_ID ;
   private long A723DEVOC_TRAN_CC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divFechacontainer_Class ;
   private String divTransaccionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_34_idx="0001" ;
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
   private String divFechacontainer_Internalname ;
   private String lblFechafilter_Internalname ;
   private String lblFechafilter_Jsonclick ;
   private String edtavCtran_fecharatificacion_Internalname ;
   private String TempTags ;
   private String edtavCtran_fecharatificacion_Jsonclick ;
   private String divTransaccionfiltercontainer_Internalname ;
   private String lblLbltransaccionfilter_Internalname ;
   private String lblLbltransaccionfilter_Jsonclick ;
   private String edtavCtran_consecutivocc_Internalname ;
   private String edtavCtran_consecutivocc_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavLinkselection_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtavFecha_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_id_Internalname ;
   private String edtavTabla_Internalname ;
   private String AV9ADVANCED_LABEL_TEMPLATE ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtavFecha_Jsonclick ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String edtavTran_id_Jsonclick ;
   private String edtavTabla_Jsonclick ;
   private String Alertify1_Internalname ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date AV16Fecha ;
   private java.util.Date AV18pFecha_Movimiento ;
   private java.util.Date AV12cTran_Fecharatificacion ;
   private java.util.Date A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean returnInSub ;
   private boolean brk6U3 ;
   private boolean n100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean n99DEVOC_ESTADO ;
   private boolean n98DEVOC_NIT_ORIGEN ;
   private boolean n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean n96DEVOC_REGIONAL ;
   private boolean n101DEVOC_TRAN_ID ;
   private boolean n723DEVOC_TRAN_CC ;
   private boolean n103DEVOC_FECHA_MOVIMIENTO ;
   private boolean n58Tran_Estado ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n57Tran_RegionId ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean AV17LinkSelection_IsBlob ;
   private String AV29Linkselection_GXI ;
   private String AV28Descatri_GXI ;
   private String A100DEVOC_CODIGO_MOVIMIENTO ;
   private String A99DEVOC_ESTADO ;
   private String AV6Tpmo_Codigo ;
   private String AV20Responsabilidad ;
   private String A49Tran_CodigoMovimiento ;
   private String A38Tpmo_Codigo ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String A315Tpmo_TipoE_S ;
   private String AV17LinkSelection ;
   private String AV14DescAtri ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private long[] H006U2_A95DEVOC_ID ;
   private String[] H006U2_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] H006U2_n100DEVOC_CODIGO_MOVIMIENTO ;
   private String[] H006U2_A99DEVOC_ESTADO ;
   private boolean[] H006U2_n99DEVOC_ESTADO ;
   private long[] H006U2_A98DEVOC_NIT_ORIGEN ;
   private boolean[] H006U2_n98DEVOC_NIT_ORIGEN ;
   private long[] H006U2_A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean[] H006U2_n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private long[] H006U2_A96DEVOC_REGIONAL ;
   private boolean[] H006U2_n96DEVOC_REGIONAL ;
   private long[] H006U2_A101DEVOC_TRAN_ID ;
   private boolean[] H006U2_n101DEVOC_TRAN_ID ;
   private long[] H006U2_A723DEVOC_TRAN_CC ;
   private boolean[] H006U2_n723DEVOC_TRAN_CC ;
   private java.util.Date[] H006U2_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] H006U2_n103DEVOC_FECHA_MOVIMIENTO ;
   private String[] H006U3_A58Tran_Estado ;
   private boolean[] H006U3_n58Tran_Estado ;
   private long[] H006U3_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H006U3_n51Tran_IdCuentadanteOrigen ;
   private long[] H006U3_A48Tran_CentroCostoId ;
   private long[] H006U3_A57Tran_RegionId ;
   private boolean[] H006U3_n57Tran_RegionId ;
   private long[] H006U3_A46Tran_Id ;
   private long[] H006U3_A513Tran_ConsecutivoCC ;
   private boolean[] H006U3_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H006U3_A390Tran_FechaRatificacion ;
   private boolean[] H006U3_n390Tran_FechaRatificacion ;
   private String[] H006U3_A49Tran_CodigoMovimiento ;
   private String[] H006U4_A38Tpmo_Codigo ;
   private String[] H006U4_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] H006U4_n680Tpmo_CuentaResponsabilidad ;
   private String[] H006U4_A315Tpmo_TipoE_S ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem> AV21SDTCuentaResponsabilidad ;
}

final  class selcuentaresponsabilidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006U2", "SELECT DEVOC_ID, DEVOC_CODIGO_MOVIMIENTO, DEVOC_ESTADO, DEVOC_NIT_ORIGEN, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_REGIONAL, DEVOC_TRAN_ID, DEVOC_TRAN_CC, DEVOC_FECHA_MOVIMIENTO FROM ALM_DEVO_HIST WHERE DEVOC_REGIONAL = ? and DEVOC_CENTRO_COSTO_ORIGEN = ? and DEVOC_NIT_ORIGEN = ? and DEVOC_ESTADO = 'R' ORDER BY DEVOC_REGIONAL, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_NIT_ORIGEN, DEVOC_ESTADO, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TRAN_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006U3", "SELECT Tran_Estado, Tran_IdCuentadanteOrigen, Tran_CentroCostoId, Tran_RegionId, Tran_Id, Tran_ConsecutivoCC, Tran_FechaRatificacion, Tran_CodigoMovimiento FROM ALM_TRANSACCION WHERE Tran_RegionId = ? and Tran_CentroCostoId = ? and Tran_IdCuentadanteOrigen = ? and Tran_Estado = 'R' ORDER BY Tran_RegionId, Tran_CentroCostoId, Tran_IdCuentadanteOrigen, Tran_Estado, Tran_CodigoMovimiento ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006U4", "SELECT Tpmo_Codigo, Tpmo_CuentaResponsabilidad, Tpmo_TipoE_S FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

