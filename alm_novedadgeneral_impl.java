/*
               File: alm_novedadgeneral_impl
        Description: ALM_NOVEDADGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:11.83
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

public final  class alm_novedadgeneral_impl extends GXWebComponent
{
   public alm_novedadgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_novedadgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_novedadgeneral_impl.class ));
   }

   public alm_novedadgeneral_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbTNov_Tipo = new HTMLChoice();
      cmbNove_Masivo = new HTMLChoice();
      cmbNove_Estado = new HTMLChoice();
   }

   public void initweb( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               A106Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A106Nove_Identificador)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa292( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( "ALM_NOVEDADGeneral") ;
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
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414151188");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_novedadgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A106Nove_Identificador,11,0)))+"\">") ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA106Nove_Identificador", GXutil.ltrim( localUtil.ntoc( wcpOA106Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_USUARIOREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_TRANSID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TNOV_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_OBSERVACIONES", getSecureSignedToken( sPrefix, A802Nove_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RUTASOPORTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_NOVE_RESPUESTAPROC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "ALM_NOVEDADGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_novedadgeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm292( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_novedadgeneral.js", "?201861414151194");
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "ALM_NOVEDADGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_NOVEDADGeneral" ;
   }

   public void wb290( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_novedadgeneral");
         }
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewActionsCell", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group WWViewActions", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11291_client"+"'", TempTags, "", 2, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12291_client"+"'", TempTags, "", 2, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAttributestable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Identificador_Internalname, "Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtNove_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_Identificador_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_FechaRegistro_Internalname, "Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtNove_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_FechaRegistro_Internalname, localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_FechaRegistro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtNove_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNove_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_NOVEDADGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_UsuarioRegistro_Internalname, "Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_UsuarioRegistro_Internalname, GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ",", "")), ((edtNove_UsuarioRegistro_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_UsuarioRegistro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_UsuarioRegistro_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_TransId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_TransId_Internalname, GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ",", "")), ((edtNove_TransId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_TransId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_TransId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RegionId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ",", "")), ((edtNove_RegionId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A782Nove_RegionId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A782Nove_RegionId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_RegionId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_RegionId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RegionCodigo_Internalname, "Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtNove_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_RegionCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RegionDescripcion_Internalname, "Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_RegionDescripcion_Internalname, A784Nove_RegionDescripcion, GXutil.rtrim( localUtil.format( A784Nove_RegionDescripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_RegionDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CentroId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CentroId_Internalname, GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ",", "")), ((edtNove_CentroId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785Nove_CentroId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A785Nove_CentroId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CentroId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CentroId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CentroCodigo_Internalname, "Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CentroCodigo_Internalname, A786Nove_CentroCodigo, GXutil.rtrim( localUtil.format( A786Nove_CentroCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CentroCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CentroCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CentroDescripcion_Internalname, "Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CentroDescripcion_Internalname, A787Nove_CentroDescripcion, GXutil.rtrim( localUtil.format( A787Nove_CentroDescripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CentroDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CentroDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CodigoMovimiento_Internalname, "Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CodigoMovimiento_Internalname, A788Nove_CodigoMovimiento, GXutil.rtrim( localUtil.format( A788Nove_CodigoMovimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CodigoMovimiento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_MovimientoDescrip_Internalname, "Descrip", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_MovimientoDescrip_Internalname, A789Nove_MovimientoDescrip, GXutil.rtrim( localUtil.format( A789Nove_MovimientoDescrip, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_MovimientoDescrip_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_MovimientoDescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_ModuloOrigen_Internalname, "Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_ModuloOrigen_Internalname, A790Nove_ModuloOrigen, GXutil.rtrim( localUtil.format( A790Nove_ModuloOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_ModuloOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_ModuloOrigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_AlmaOrigen_Internalname, "Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_AlmaOrigen_Internalname, A791Nove_AlmaOrigen, GXutil.rtrim( localUtil.format( A791Nove_AlmaOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_AlmaOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_AlmaOrigen_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_BodeOrigen_Internalname, "Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_BodeOrigen_Internalname, A792Nove_BodeOrigen, GXutil.rtrim( localUtil.format( A792Nove_BodeOrigen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_BodeOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_BodeOrigen_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteIdOrigen_Internalname, "Id Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteIdOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteIdOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A793Nove_CuentadanteIdOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A793Nove_CuentadanteIdOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteIdOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteIdOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteCedOrigen_Internalname, "Ced Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteCedOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteCedOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteCedOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteCedOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteNomOrigen_Internalname, "Nom Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteNomOrigen_Internalname, A795Nove_CuentadanteNomOrigen, GXutil.rtrim( localUtil.format( A795Nove_CuentadanteNomOrigen, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteNomOrigen_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteNomOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_ModuloDestino_Internalname, "Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_ModuloDestino_Internalname, A796Nove_ModuloDestino, GXutil.rtrim( localUtil.format( A796Nove_ModuloDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_ModuloDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_ModuloDestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_AlmaDestino_Internalname, "Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_AlmaDestino_Internalname, A797Nove_AlmaDestino, GXutil.rtrim( localUtil.format( A797Nove_AlmaDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_AlmaDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_AlmaDestino_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_BodeDestino_Internalname, "Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_BodeDestino_Internalname, A798Nove_BodeDestino, GXutil.rtrim( localUtil.format( A798Nove_BodeDestino, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_BodeDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_BodeDestino_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteIdDestino_Internalname, "Id Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteIdDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteIdDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A799Nove_CuentadanteIdDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A799Nove_CuentadanteIdDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteIdDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteIdDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteCedDestino_Internalname, "Ced Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteCedDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteCedDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteCedDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteCedDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteNomDestino_Internalname, "Nom Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteNomDestino_Internalname, A801Nove_CuentadanteNomDestino, GXutil.rtrim( localUtil.format( A801Nove_CuentadanteNomDestino, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteNomDestino_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_CuentadanteNomDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Codigo_Internalname, "Código de la Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")), ((edtTNov_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Codigo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Descripcion_Internalname, "Descripción Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTNov_Descripcion_Internalname, A769TNov_Descripcion, edtTNov_Descripcion_Link, "", (short)(0), 1, edtTNov_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_Tipo.getInternalname(), "Tipo de Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_Tipo, cmbTNov_Tipo.getInternalname(), GXutil.rtrim( A770TNov_Tipo), 1, cmbTNov_Tipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_Tipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_NOVEDADGeneral.htm");
         cmbTNov_Tipo.setValue( GXutil.rtrim( A770TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTNov_Tipo.getInternalname(), "Values", cmbTNov_Tipo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Procedimiento_Internalname, "Procedimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Procedimiento_Internalname, A772TNov_Procedimiento, GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Procedimiento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Procedimiento_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Observaciones_Internalname, "Observaciones", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNove_Observaciones_Internalname, A802Nove_Observaciones, "", "", (short)(0), 1, edtNove_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbNove_Masivo.getInternalname(), "Masivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNove_Masivo, cmbNove_Masivo.getInternalname(), GXutil.rtrim( A803Nove_Masivo), 1, cmbNove_Masivo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbNove_Masivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_NOVEDADGeneral.htm");
         cmbNove_Masivo.setValue( GXutil.rtrim( A803Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNove_Masivo.getInternalname(), "Values", cmbNove_Masivo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Soporte_Internalname, "Soporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         edtNove_Soporte_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, true);
         if ( ! (GXutil.strcmp("", A804Nove_Soporte)==0) )
         {
            gxblobfileaux.setSource( A804Nove_Soporte );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtNove_Soporte_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtNove_Soporte_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A804Nove_Soporte = gxblobfileaux.getAbsoluteName() ;
               n804Nove_Soporte = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A804Nove_Soporte", A804Nove_Soporte);
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
               edtNove_Soporte_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
         }
         com.orions2.GxWebStd.gx_blob_field( httpContext, edtNove_Soporte_Internalname, GXutil.rtrim( A804Nove_Soporte), httpContext.getResourceRelative(A804Nove_Soporte), ((GXutil.strcmp("", edtNove_Soporte_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtNove_Soporte_Filetype)==0) ? A804Nove_Soporte : edtNove_Soporte_Filetype)) : edtNove_Soporte_Contenttype), false, "", edtNove_Soporte_Parameters, 0, edtNove_Soporte_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtNove_Soporte_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+"", "", "", "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RutaSoporte_Internalname, "Soporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNove_RutaSoporte_Internalname, A805Nove_RutaSoporte, "", "", (short)(0), 1, edtNove_RutaSoporte_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_TranCC_Internalname, "CC", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_TranCC_Internalname, GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ",", "")), ((edtNove_TranCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_TranCC_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtNove_TranCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbNove_Estado.getInternalname(), "la Novedad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNove_Estado, cmbNove_Estado.getInternalname(), GXutil.rtrim( A765Nove_Estado), 1, cmbNove_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNove_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_NOVEDADGeneral.htm");
         cmbNove_Estado.setValue( GXutil.rtrim( A765Nove_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbNove_Estado.getInternalname(), "Values", cmbNove_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RespuestaProc_Internalname, "Procedimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNove_RespuestaProc_Internalname, A815Nove_RespuestaProc, "", "", (short)(0), 1, edtNove_RespuestaProc_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Nombre_Campo_Internalname, "Nombre del Campo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Nombre_Campo_Internalname, A774TNov_Nombre_Campo, GXutil.rtrim( localUtil.format( A774TNov_Nombre_Campo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Nombre_Campo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Nombre_Campo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start292( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_NOVEDADGeneral", (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup290( ) ;
         }
      }
   }

   public void ws292( )
   {
      start292( ) ;
      evt292( ) ;
   }

   public void evt292( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup290( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup290( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13292 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup290( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14292 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup290( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup290( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
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

   public void we292( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm292( ) ;
         }
      }
   }

   public void pa292( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
            }
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         cmbTNov_Tipo.setName( "TNOV_TIPO" );
         cmbTNov_Tipo.setWebtags( "" );
         cmbTNov_Tipo.addItem("T", "Transacción", (short)(0));
         cmbTNov_Tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbTNov_Tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbTNov_Tipo.getItemCount() > 0 )
         {
            A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
            n770TNov_Tipo = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
         }
         cmbNove_Masivo.setName( "NOVE_MASIVO" );
         cmbNove_Masivo.setWebtags( "" );
         cmbNove_Masivo.addItem("", "", (short)(0));
         cmbNove_Masivo.addItem("SI", "SI", (short)(0));
         cmbNove_Masivo.addItem("NO", "NO", (short)(0));
         if ( cmbNove_Masivo.getItemCount() > 0 )
         {
            A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
            n803Nove_Masivo = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803Nove_Masivo", A803Nove_Masivo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
         }
         cmbNove_Estado.setName( "NOVE_ESTADO" );
         cmbNove_Estado.setWebtags( "" );
         if ( cmbNove_Estado.getItemCount() > 0 )
         {
            A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
            n765Nove_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A765Nove_Estado", A765Nove_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
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
      if ( cmbTNov_Tipo.getItemCount() > 0 )
      {
         A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
      }
      if ( cmbNove_Masivo.getItemCount() > 0 )
      {
         A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
         n803Nove_Masivo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803Nove_Masivo", A803Nove_Masivo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
      }
      if ( cmbNove_Estado.getItemCount() > 0 )
      {
         A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
         n765Nove_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A765Nove_Estado", A765Nove_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf292( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_NOVEDADGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf292( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00292 */
         pr_default.execute(0, new Object[] {new Long(A106Nove_Identificador)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A802Nove_Observaciones = H00292_A802Nove_Observaciones[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A802Nove_Observaciones", A802Nove_Observaciones);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_OBSERVACIONES", getSecureSignedToken( sPrefix, A802Nove_Observaciones));
            n802Nove_Observaciones = H00292_n802Nove_Observaciones[0] ;
            A774TNov_Nombre_Campo = H00292_A774TNov_Nombre_Campo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
            n774TNov_Nombre_Campo = H00292_n774TNov_Nombre_Campo[0] ;
            A815Nove_RespuestaProc = H00292_A815Nove_RespuestaProc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_RESPUESTAPROC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
            n815Nove_RespuestaProc = H00292_n815Nove_RespuestaProc[0] ;
            A765Nove_Estado = H00292_A765Nove_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A765Nove_Estado", A765Nove_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
            n765Nove_Estado = H00292_n765Nove_Estado[0] ;
            A814Nove_TranCC = H00292_A814Nove_TranCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
            n814Nove_TranCC = H00292_n814Nove_TranCC[0] ;
            A805Nove_RutaSoporte = H00292_A805Nove_RutaSoporte[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A805Nove_RutaSoporte", A805Nove_RutaSoporte);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_RUTASOPORTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
            n805Nove_RutaSoporte = H00292_n805Nove_RutaSoporte[0] ;
            A804Nove_Soporte = H00292_A804Nove_Soporte[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A804Nove_Soporte", A804Nove_Soporte);
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
            n804Nove_Soporte = H00292_n804Nove_Soporte[0] ;
            A803Nove_Masivo = H00292_A803Nove_Masivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803Nove_Masivo", A803Nove_Masivo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
            n803Nove_Masivo = H00292_n803Nove_Masivo[0] ;
            A772TNov_Procedimiento = H00292_A772TNov_Procedimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
            n772TNov_Procedimiento = H00292_n772TNov_Procedimiento[0] ;
            A770TNov_Tipo = H00292_A770TNov_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
            n770TNov_Tipo = H00292_n770TNov_Tipo[0] ;
            A769TNov_Descripcion = H00292_A769TNov_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769TNov_Descripcion", A769TNov_Descripcion);
            n769TNov_Descripcion = H00292_n769TNov_Descripcion[0] ;
            A104TNov_Codigo = H00292_A104TNov_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TNOV_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
            n104TNov_Codigo = H00292_n104TNov_Codigo[0] ;
            A801Nove_CuentadanteNomDestino = H00292_A801Nove_CuentadanteNomDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
            n801Nove_CuentadanteNomDestino = H00292_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H00292_A800Nove_CuentadanteCedDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
            n800Nove_CuentadanteCedDestino = H00292_n800Nove_CuentadanteCedDestino[0] ;
            A799Nove_CuentadanteIdDestino = H00292_A799Nove_CuentadanteIdDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A799Nove_CuentadanteIdDestino", GXutil.ltrim( GXutil.str( A799Nove_CuentadanteIdDestino, 18, 0)));
            n799Nove_CuentadanteIdDestino = H00292_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H00292_A798Nove_BodeDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
            n798Nove_BodeDestino = H00292_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H00292_A797Nove_AlmaDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
            n797Nove_AlmaDestino = H00292_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H00292_A796Nove_ModuloDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
            n796Nove_ModuloDestino = H00292_n796Nove_ModuloDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H00292_A795Nove_CuentadanteNomOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
            n795Nove_CuentadanteNomOrigen = H00292_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H00292_A794Nove_CuentadanteCedOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
            n794Nove_CuentadanteCedOrigen = H00292_n794Nove_CuentadanteCedOrigen[0] ;
            A793Nove_CuentadanteIdOrigen = H00292_A793Nove_CuentadanteIdOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A793Nove_CuentadanteIdOrigen", GXutil.ltrim( GXutil.str( A793Nove_CuentadanteIdOrigen, 18, 0)));
            n793Nove_CuentadanteIdOrigen = H00292_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H00292_A792Nove_BodeOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
            n792Nove_BodeOrigen = H00292_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H00292_A791Nove_AlmaOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
            n791Nove_AlmaOrigen = H00292_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H00292_A790Nove_ModuloOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
            n790Nove_ModuloOrigen = H00292_n790Nove_ModuloOrigen[0] ;
            A789Nove_MovimientoDescrip = H00292_A789Nove_MovimientoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
            n789Nove_MovimientoDescrip = H00292_n789Nove_MovimientoDescrip[0] ;
            A788Nove_CodigoMovimiento = H00292_A788Nove_CodigoMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
            n788Nove_CodigoMovimiento = H00292_n788Nove_CodigoMovimiento[0] ;
            A787Nove_CentroDescripcion = H00292_A787Nove_CentroDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
            n787Nove_CentroDescripcion = H00292_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H00292_A786Nove_CentroCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
            n786Nove_CentroCodigo = H00292_n786Nove_CentroCodigo[0] ;
            A785Nove_CentroId = H00292_A785Nove_CentroId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
            n785Nove_CentroId = H00292_n785Nove_CentroId[0] ;
            A784Nove_RegionDescripcion = H00292_A784Nove_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
            n784Nove_RegionDescripcion = H00292_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H00292_A783Nove_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
            n783Nove_RegionCodigo = H00292_n783Nove_RegionCodigo[0] ;
            A782Nove_RegionId = H00292_A782Nove_RegionId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A782Nove_RegionId", GXutil.ltrim( GXutil.str( A782Nove_RegionId, 11, 0)));
            n782Nove_RegionId = H00292_n782Nove_RegionId[0] ;
            A107Nove_TransId = H00292_A107Nove_TransId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A107Nove_TransId", GXutil.ltrim( GXutil.str( A107Nove_TransId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_TRANSID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
            n107Nove_TransId = H00292_n107Nove_TransId[0] ;
            A781Nove_UsuarioRegistro = H00292_A781Nove_UsuarioRegistro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A781Nove_UsuarioRegistro", GXutil.ltrim( GXutil.str( A781Nove_UsuarioRegistro, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_USUARIOREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
            n781Nove_UsuarioRegistro = H00292_n781Nove_UsuarioRegistro[0] ;
            A780Nove_FechaRegistro = H00292_A780Nove_FechaRegistro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
            n780Nove_FechaRegistro = H00292_n780Nove_FechaRegistro[0] ;
            A774TNov_Nombre_Campo = H00292_A774TNov_Nombre_Campo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
            n774TNov_Nombre_Campo = H00292_n774TNov_Nombre_Campo[0] ;
            A772TNov_Procedimiento = H00292_A772TNov_Procedimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
            n772TNov_Procedimiento = H00292_n772TNov_Procedimiento[0] ;
            A770TNov_Tipo = H00292_A770TNov_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
            n770TNov_Tipo = H00292_n770TNov_Tipo[0] ;
            A769TNov_Descripcion = H00292_A769TNov_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769TNov_Descripcion", A769TNov_Descripcion);
            n769TNov_Descripcion = H00292_n769TNov_Descripcion[0] ;
            A814Nove_TranCC = H00292_A814Nove_TranCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
            n814Nove_TranCC = H00292_n814Nove_TranCC[0] ;
            A799Nove_CuentadanteIdDestino = H00292_A799Nove_CuentadanteIdDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A799Nove_CuentadanteIdDestino", GXutil.ltrim( GXutil.str( A799Nove_CuentadanteIdDestino, 18, 0)));
            n799Nove_CuentadanteIdDestino = H00292_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H00292_A798Nove_BodeDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
            n798Nove_BodeDestino = H00292_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H00292_A797Nove_AlmaDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
            n797Nove_AlmaDestino = H00292_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H00292_A796Nove_ModuloDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
            n796Nove_ModuloDestino = H00292_n796Nove_ModuloDestino[0] ;
            A793Nove_CuentadanteIdOrigen = H00292_A793Nove_CuentadanteIdOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A793Nove_CuentadanteIdOrigen", GXutil.ltrim( GXutil.str( A793Nove_CuentadanteIdOrigen, 18, 0)));
            n793Nove_CuentadanteIdOrigen = H00292_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H00292_A792Nove_BodeOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
            n792Nove_BodeOrigen = H00292_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H00292_A791Nove_AlmaOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
            n791Nove_AlmaOrigen = H00292_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H00292_A790Nove_ModuloOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
            n790Nove_ModuloOrigen = H00292_n790Nove_ModuloOrigen[0] ;
            A788Nove_CodigoMovimiento = H00292_A788Nove_CodigoMovimiento[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
            n788Nove_CodigoMovimiento = H00292_n788Nove_CodigoMovimiento[0] ;
            A785Nove_CentroId = H00292_A785Nove_CentroId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
            n785Nove_CentroId = H00292_n785Nove_CentroId[0] ;
            A782Nove_RegionId = H00292_A782Nove_RegionId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A782Nove_RegionId", GXutil.ltrim( GXutil.str( A782Nove_RegionId, 11, 0)));
            n782Nove_RegionId = H00292_n782Nove_RegionId[0] ;
            A801Nove_CuentadanteNomDestino = H00292_A801Nove_CuentadanteNomDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
            n801Nove_CuentadanteNomDestino = H00292_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H00292_A800Nove_CuentadanteCedDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
            n800Nove_CuentadanteCedDestino = H00292_n800Nove_CuentadanteCedDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H00292_A795Nove_CuentadanteNomOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
            n795Nove_CuentadanteNomOrigen = H00292_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H00292_A794Nove_CuentadanteCedOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
            n794Nove_CuentadanteCedOrigen = H00292_n794Nove_CuentadanteCedOrigen[0] ;
            A789Nove_MovimientoDescrip = H00292_A789Nove_MovimientoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
            n789Nove_MovimientoDescrip = H00292_n789Nove_MovimientoDescrip[0] ;
            A787Nove_CentroDescripcion = H00292_A787Nove_CentroDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
            n787Nove_CentroDescripcion = H00292_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H00292_A786Nove_CentroCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
            n786Nove_CentroCodigo = H00292_n786Nove_CentroCodigo[0] ;
            A784Nove_RegionDescripcion = H00292_A784Nove_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
            n784Nove_RegionDescripcion = H00292_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H00292_A783Nove_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
            n783Nove_RegionCodigo = H00292_n783Nove_RegionCodigo[0] ;
            /* Execute user event: Load */
            e14292 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb290( ) ;
      }
   }

   public void strup290( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_NOVEDADGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13292 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A780Nove_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtNove_FechaRegistro_Internalname), 0) ;
         n780Nove_FechaRegistro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_FECHAREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
         A781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( edtNove_UsuarioRegistro_Internalname), ",", ".") ;
         n781Nove_UsuarioRegistro = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A781Nove_UsuarioRegistro", GXutil.ltrim( GXutil.str( A781Nove_UsuarioRegistro, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_USUARIOREGISTRO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
         A107Nove_TransId = localUtil.ctol( httpContext.cgiGet( edtNove_TransId_Internalname), ",", ".") ;
         n107Nove_TransId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A107Nove_TransId", GXutil.ltrim( GXutil.str( A107Nove_TransId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_TRANSID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
         A782Nove_RegionId = localUtil.ctol( httpContext.cgiGet( edtNove_RegionId_Internalname), ",", ".") ;
         n782Nove_RegionId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A782Nove_RegionId", GXutil.ltrim( GXutil.str( A782Nove_RegionId, 11, 0)));
         A783Nove_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtNove_RegionCodigo_Internalname), ",", ".")) ;
         n783Nove_RegionCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
         A784Nove_RegionDescripcion = httpContext.cgiGet( edtNove_RegionDescripcion_Internalname) ;
         n784Nove_RegionDescripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
         A785Nove_CentroId = localUtil.ctol( httpContext.cgiGet( edtNove_CentroId_Internalname), ",", ".") ;
         n785Nove_CentroId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         A786Nove_CentroCodigo = httpContext.cgiGet( edtNove_CentroCodigo_Internalname) ;
         n786Nove_CentroCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
         A787Nove_CentroDescripcion = httpContext.cgiGet( edtNove_CentroDescripcion_Internalname) ;
         n787Nove_CentroDescripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
         A788Nove_CodigoMovimiento = httpContext.cgiGet( edtNove_CodigoMovimiento_Internalname) ;
         n788Nove_CodigoMovimiento = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
         A789Nove_MovimientoDescrip = httpContext.cgiGet( edtNove_MovimientoDescrip_Internalname) ;
         n789Nove_MovimientoDescrip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
         A790Nove_ModuloOrigen = httpContext.cgiGet( edtNove_ModuloOrigen_Internalname) ;
         n790Nove_ModuloOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         A791Nove_AlmaOrigen = httpContext.cgiGet( edtNove_AlmaOrigen_Internalname) ;
         n791Nove_AlmaOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
         A792Nove_BodeOrigen = httpContext.cgiGet( edtNove_BodeOrigen_Internalname) ;
         n792Nove_BodeOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
         A793Nove_CuentadanteIdOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdOrigen_Internalname), ",", ".") ;
         n793Nove_CuentadanteIdOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A793Nove_CuentadanteIdOrigen", GXutil.ltrim( GXutil.str( A793Nove_CuentadanteIdOrigen, 18, 0)));
         A794Nove_CuentadanteCedOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedOrigen_Internalname), ",", ".") ;
         n794Nove_CuentadanteCedOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
         A795Nove_CuentadanteNomOrigen = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomOrigen_Internalname)) ;
         n795Nove_CuentadanteNomOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
         A796Nove_ModuloDestino = httpContext.cgiGet( edtNove_ModuloDestino_Internalname) ;
         n796Nove_ModuloDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         A797Nove_AlmaDestino = httpContext.cgiGet( edtNove_AlmaDestino_Internalname) ;
         n797Nove_AlmaDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
         A798Nove_BodeDestino = httpContext.cgiGet( edtNove_BodeDestino_Internalname) ;
         n798Nove_BodeDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
         A799Nove_CuentadanteIdDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdDestino_Internalname), ",", ".") ;
         n799Nove_CuentadanteIdDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A799Nove_CuentadanteIdDestino", GXutil.ltrim( GXutil.str( A799Nove_CuentadanteIdDestino, 18, 0)));
         A800Nove_CuentadanteCedDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedDestino_Internalname), ",", ".") ;
         n800Nove_CuentadanteCedDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
         A801Nove_CuentadanteNomDestino = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomDestino_Internalname)) ;
         n801Nove_CuentadanteNomDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
         A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TNOV_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
         A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
         n769TNov_Descripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769TNov_Descripcion", A769TNov_Descripcion);
         cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
         A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
         A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
         n772TNov_Procedimiento = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
         A802Nove_Observaciones = httpContext.cgiGet( edtNove_Observaciones_Internalname) ;
         n802Nove_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A802Nove_Observaciones", A802Nove_Observaciones);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_OBSERVACIONES", getSecureSignedToken( sPrefix, A802Nove_Observaciones));
         cmbNove_Masivo.setValue( httpContext.cgiGet( cmbNove_Masivo.getInternalname()) );
         A803Nove_Masivo = httpContext.cgiGet( cmbNove_Masivo.getInternalname()) ;
         n803Nove_Masivo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803Nove_Masivo", A803Nove_Masivo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_MASIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
         A804Nove_Soporte = httpContext.cgiGet( edtNove_Soporte_Internalname) ;
         n804Nove_Soporte = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A804Nove_Soporte", A804Nove_Soporte);
         A805Nove_RutaSoporte = httpContext.cgiGet( edtNove_RutaSoporte_Internalname) ;
         n805Nove_RutaSoporte = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A805Nove_RutaSoporte", A805Nove_RutaSoporte);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_RUTASOPORTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
         A814Nove_TranCC = localUtil.ctol( httpContext.cgiGet( edtNove_TranCC_Internalname), ",", ".") ;
         n814Nove_TranCC = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
         cmbNove_Estado.setValue( httpContext.cgiGet( cmbNove_Estado.getInternalname()) );
         A765Nove_Estado = httpContext.cgiGet( cmbNove_Estado.getInternalname()) ;
         n765Nove_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A765Nove_Estado", A765Nove_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
         A815Nove_RespuestaProc = httpContext.cgiGet( edtNove_RespuestaProc_Internalname) ;
         n815Nove_RespuestaProc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_NOVE_RESPUESTAPROC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
         A774TNov_Nombre_Campo = httpContext.cgiGet( edtTNov_Nombre_Campo_Internalname) ;
         n774TNov_Nombre_Campo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         /* Read saved values. */
         wcpOA106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA106Nove_Identificador"), ",", ".") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "ALM_NOVEDADGeneral" ;
         A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TNOV_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_novedadgeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e13292 ();
      if (returnInSub) return;
   }

   public void e13292( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV14Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e14292( )
   {
      /* Load Routine */
      edtTNov_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_novedad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A104TNov_Codigo,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTNov_Descripcion_Internalname, "Link", edtTNov_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_NOVEDAD" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Nove_Identificador" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Nove_Identificador, 11, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A106Nove_Identificador = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("Carmine");
      }
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa292( ) ;
      ws292( ) ;
      we292( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA106Nove_Identificador = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa292( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_novedadgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa292( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A106Nove_Identificador = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      }
      wcpOA106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA106Nove_Identificador"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A106Nove_Identificador != wcpOA106Nove_Identificador ) ) )
      {
         setjustcreated();
      }
      wcpOA106Nove_Identificador = A106Nove_Identificador ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA106Nove_Identificador = httpContext.cgiGet( sPrefix+"A106Nove_Identificador_CTRL") ;
      if ( GXutil.len( sCtrlA106Nove_Identificador) > 0 )
      {
         A106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( sCtrlA106Nove_Identificador), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      }
      else
      {
         A106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"A106Nove_Identificador_PARM"), ",", ".") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa292( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws292( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws292( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A106Nove_Identificador_PARM", GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA106Nove_Identificador)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A106Nove_Identificador_CTRL", GXutil.rtrim( sCtrlA106Nove_Identificador));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we292( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414151434");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_novedadgeneral.js", "?201861414151434");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtNove_Identificador_Internalname = sPrefix+"NOVE_IDENTIFICADOR" ;
      edtNove_FechaRegistro_Internalname = sPrefix+"NOVE_FECHAREGISTRO" ;
      edtNove_UsuarioRegistro_Internalname = sPrefix+"NOVE_USUARIOREGISTRO" ;
      edtNove_TransId_Internalname = sPrefix+"NOVE_TRANSID" ;
      edtNove_RegionId_Internalname = sPrefix+"NOVE_REGIONID" ;
      edtNove_RegionCodigo_Internalname = sPrefix+"NOVE_REGIONCODIGO" ;
      edtNove_RegionDescripcion_Internalname = sPrefix+"NOVE_REGIONDESCRIPCION" ;
      edtNove_CentroId_Internalname = sPrefix+"NOVE_CENTROID" ;
      edtNove_CentroCodigo_Internalname = sPrefix+"NOVE_CENTROCODIGO" ;
      edtNove_CentroDescripcion_Internalname = sPrefix+"NOVE_CENTRODESCRIPCION" ;
      edtNove_CodigoMovimiento_Internalname = sPrefix+"NOVE_CODIGOMOVIMIENTO" ;
      edtNove_MovimientoDescrip_Internalname = sPrefix+"NOVE_MOVIMIENTODESCRIP" ;
      edtNove_ModuloOrigen_Internalname = sPrefix+"NOVE_MODULOORIGEN" ;
      edtNove_AlmaOrigen_Internalname = sPrefix+"NOVE_ALMAORIGEN" ;
      edtNove_BodeOrigen_Internalname = sPrefix+"NOVE_BODEORIGEN" ;
      edtNove_CuentadanteIdOrigen_Internalname = sPrefix+"NOVE_CUENTADANTEIDORIGEN" ;
      edtNove_CuentadanteCedOrigen_Internalname = sPrefix+"NOVE_CUENTADANTECEDORIGEN" ;
      edtNove_CuentadanteNomOrigen_Internalname = sPrefix+"NOVE_CUENTADANTENOMORIGEN" ;
      edtNove_ModuloDestino_Internalname = sPrefix+"NOVE_MODULODESTINO" ;
      edtNove_AlmaDestino_Internalname = sPrefix+"NOVE_ALMADESTINO" ;
      edtNove_BodeDestino_Internalname = sPrefix+"NOVE_BODEDESTINO" ;
      edtNove_CuentadanteIdDestino_Internalname = sPrefix+"NOVE_CUENTADANTEIDDESTINO" ;
      edtNove_CuentadanteCedDestino_Internalname = sPrefix+"NOVE_CUENTADANTECEDDESTINO" ;
      edtNove_CuentadanteNomDestino_Internalname = sPrefix+"NOVE_CUENTADANTENOMDESTINO" ;
      edtTNov_Codigo_Internalname = sPrefix+"TNOV_CODIGO" ;
      edtTNov_Descripcion_Internalname = sPrefix+"TNOV_DESCRIPCION" ;
      cmbTNov_Tipo.setInternalname( sPrefix+"TNOV_TIPO" );
      edtTNov_Procedimiento_Internalname = sPrefix+"TNOV_PROCEDIMIENTO" ;
      edtNove_Observaciones_Internalname = sPrefix+"NOVE_OBSERVACIONES" ;
      cmbNove_Masivo.setInternalname( sPrefix+"NOVE_MASIVO" );
      edtNove_Soporte_Internalname = sPrefix+"NOVE_SOPORTE" ;
      edtNove_RutaSoporte_Internalname = sPrefix+"NOVE_RUTASOPORTE" ;
      edtNove_TranCC_Internalname = sPrefix+"NOVE_TRANCC" ;
      cmbNove_Estado.setInternalname( sPrefix+"NOVE_ESTADO" );
      edtNove_RespuestaProc_Internalname = sPrefix+"NOVE_RESPUESTAPROC" ;
      edtTNov_Nombre_Campo_Internalname = sPrefix+"TNOV_NOMBRE_CAMPO" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
   }

   public void initialize_properties( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      edtTNov_Nombre_Campo_Jsonclick = "" ;
      edtTNov_Nombre_Campo_Enabled = 0 ;
      edtNove_RespuestaProc_Enabled = 0 ;
      cmbNove_Estado.setJsonclick( "" );
      cmbNove_Estado.setEnabled( 0 );
      edtNove_TranCC_Jsonclick = "" ;
      edtNove_TranCC_Enabled = 0 ;
      edtNove_RutaSoporte_Enabled = 0 ;
      edtNove_Soporte_Jsonclick = "" ;
      edtNove_Soporte_Parameters = "" ;
      edtNove_Soporte_Contenttype = "" ;
      edtNove_Soporte_Filetype = "" ;
      edtNove_Soporte_Enabled = 0 ;
      cmbNove_Masivo.setJsonclick( "" );
      cmbNove_Masivo.setEnabled( 0 );
      edtNove_Observaciones_Enabled = 0 ;
      edtTNov_Procedimiento_Jsonclick = "" ;
      edtTNov_Procedimiento_Enabled = 0 ;
      cmbTNov_Tipo.setJsonclick( "" );
      cmbTNov_Tipo.setEnabled( 0 );
      edtTNov_Descripcion_Link = "" ;
      edtTNov_Descripcion_Enabled = 0 ;
      edtTNov_Codigo_Jsonclick = "" ;
      edtTNov_Codigo_Enabled = 0 ;
      edtNove_CuentadanteNomDestino_Jsonclick = "" ;
      edtNove_CuentadanteNomDestino_Enabled = 0 ;
      edtNove_CuentadanteCedDestino_Jsonclick = "" ;
      edtNove_CuentadanteCedDestino_Enabled = 0 ;
      edtNove_CuentadanteIdDestino_Jsonclick = "" ;
      edtNove_CuentadanteIdDestino_Enabled = 0 ;
      edtNove_BodeDestino_Jsonclick = "" ;
      edtNove_BodeDestino_Enabled = 0 ;
      edtNove_AlmaDestino_Jsonclick = "" ;
      edtNove_AlmaDestino_Enabled = 0 ;
      edtNove_ModuloDestino_Jsonclick = "" ;
      edtNove_ModuloDestino_Enabled = 0 ;
      edtNove_CuentadanteNomOrigen_Jsonclick = "" ;
      edtNove_CuentadanteNomOrigen_Enabled = 0 ;
      edtNove_CuentadanteCedOrigen_Jsonclick = "" ;
      edtNove_CuentadanteCedOrigen_Enabled = 0 ;
      edtNove_CuentadanteIdOrigen_Jsonclick = "" ;
      edtNove_CuentadanteIdOrigen_Enabled = 0 ;
      edtNove_BodeOrigen_Jsonclick = "" ;
      edtNove_BodeOrigen_Enabled = 0 ;
      edtNove_AlmaOrigen_Jsonclick = "" ;
      edtNove_AlmaOrigen_Enabled = 0 ;
      edtNove_ModuloOrigen_Jsonclick = "" ;
      edtNove_ModuloOrigen_Enabled = 0 ;
      edtNove_MovimientoDescrip_Jsonclick = "" ;
      edtNove_MovimientoDescrip_Enabled = 0 ;
      edtNove_CodigoMovimiento_Jsonclick = "" ;
      edtNove_CodigoMovimiento_Enabled = 0 ;
      edtNove_CentroDescripcion_Jsonclick = "" ;
      edtNove_CentroDescripcion_Enabled = 0 ;
      edtNove_CentroCodigo_Jsonclick = "" ;
      edtNove_CentroCodigo_Enabled = 0 ;
      edtNove_CentroId_Jsonclick = "" ;
      edtNove_CentroId_Enabled = 0 ;
      edtNove_RegionDescripcion_Jsonclick = "" ;
      edtNove_RegionDescripcion_Enabled = 0 ;
      edtNove_RegionCodigo_Jsonclick = "" ;
      edtNove_RegionCodigo_Enabled = 0 ;
      edtNove_RegionId_Jsonclick = "" ;
      edtNove_RegionId_Enabled = 0 ;
      edtNove_TransId_Jsonclick = "" ;
      edtNove_TransId_Enabled = 0 ;
      edtNove_UsuarioRegistro_Jsonclick = "" ;
      edtNove_UsuarioRegistro_Enabled = 0 ;
      edtNove_FechaRegistro_Jsonclick = "" ;
      edtNove_FechaRegistro_Enabled = 0 ;
      edtNove_Identificador_Jsonclick = "" ;
      edtNove_Identificador_Enabled = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11291',iparms:[{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12291',iparms:[{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      sPrefix = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A802Nove_Observaciones = "" ;
      A803Nove_Masivo = "" ;
      A805Nove_RutaSoporte = "" ;
      A765Nove_Estado = "" ;
      A815Nove_RespuestaProc = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A784Nove_RegionDescripcion = "" ;
      A786Nove_CentroCodigo = "" ;
      A787Nove_CentroDescripcion = "" ;
      A788Nove_CodigoMovimiento = "" ;
      A789Nove_MovimientoDescrip = "" ;
      A790Nove_ModuloOrigen = "" ;
      A791Nove_AlmaOrigen = "" ;
      A792Nove_BodeOrigen = "" ;
      A795Nove_CuentadanteNomOrigen = "" ;
      A796Nove_ModuloDestino = "" ;
      A797Nove_AlmaDestino = "" ;
      A798Nove_BodeDestino = "" ;
      A801Nove_CuentadanteNomDestino = "" ;
      A769TNov_Descripcion = "" ;
      A770TNov_Tipo = "" ;
      A772TNov_Procedimiento = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      A804Nove_Soporte = "" ;
      A774TNov_Nombre_Campo = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H00292_A802Nove_Observaciones = new String[] {""} ;
      H00292_n802Nove_Observaciones = new boolean[] {false} ;
      H00292_A106Nove_Identificador = new long[1] ;
      H00292_A774TNov_Nombre_Campo = new String[] {""} ;
      H00292_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H00292_A815Nove_RespuestaProc = new String[] {""} ;
      H00292_n815Nove_RespuestaProc = new boolean[] {false} ;
      H00292_A765Nove_Estado = new String[] {""} ;
      H00292_n765Nove_Estado = new boolean[] {false} ;
      H00292_A814Nove_TranCC = new long[1] ;
      H00292_n814Nove_TranCC = new boolean[] {false} ;
      H00292_A805Nove_RutaSoporte = new String[] {""} ;
      H00292_n805Nove_RutaSoporte = new boolean[] {false} ;
      H00292_A804Nove_Soporte = new String[] {""} ;
      H00292_n804Nove_Soporte = new boolean[] {false} ;
      H00292_A803Nove_Masivo = new String[] {""} ;
      H00292_n803Nove_Masivo = new boolean[] {false} ;
      H00292_A772TNov_Procedimiento = new String[] {""} ;
      H00292_n772TNov_Procedimiento = new boolean[] {false} ;
      H00292_A770TNov_Tipo = new String[] {""} ;
      H00292_n770TNov_Tipo = new boolean[] {false} ;
      H00292_A769TNov_Descripcion = new String[] {""} ;
      H00292_n769TNov_Descripcion = new boolean[] {false} ;
      H00292_A104TNov_Codigo = new int[1] ;
      H00292_n104TNov_Codigo = new boolean[] {false} ;
      H00292_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      H00292_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      H00292_A800Nove_CuentadanteCedDestino = new long[1] ;
      H00292_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      H00292_A799Nove_CuentadanteIdDestino = new long[1] ;
      H00292_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      H00292_A798Nove_BodeDestino = new String[] {""} ;
      H00292_n798Nove_BodeDestino = new boolean[] {false} ;
      H00292_A797Nove_AlmaDestino = new String[] {""} ;
      H00292_n797Nove_AlmaDestino = new boolean[] {false} ;
      H00292_A796Nove_ModuloDestino = new String[] {""} ;
      H00292_n796Nove_ModuloDestino = new boolean[] {false} ;
      H00292_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      H00292_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      H00292_A794Nove_CuentadanteCedOrigen = new long[1] ;
      H00292_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      H00292_A793Nove_CuentadanteIdOrigen = new long[1] ;
      H00292_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      H00292_A792Nove_BodeOrigen = new String[] {""} ;
      H00292_n792Nove_BodeOrigen = new boolean[] {false} ;
      H00292_A791Nove_AlmaOrigen = new String[] {""} ;
      H00292_n791Nove_AlmaOrigen = new boolean[] {false} ;
      H00292_A790Nove_ModuloOrigen = new String[] {""} ;
      H00292_n790Nove_ModuloOrigen = new boolean[] {false} ;
      H00292_A789Nove_MovimientoDescrip = new String[] {""} ;
      H00292_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      H00292_A788Nove_CodigoMovimiento = new String[] {""} ;
      H00292_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      H00292_A787Nove_CentroDescripcion = new String[] {""} ;
      H00292_n787Nove_CentroDescripcion = new boolean[] {false} ;
      H00292_A786Nove_CentroCodigo = new String[] {""} ;
      H00292_n786Nove_CentroCodigo = new boolean[] {false} ;
      H00292_A785Nove_CentroId = new long[1] ;
      H00292_n785Nove_CentroId = new boolean[] {false} ;
      H00292_A784Nove_RegionDescripcion = new String[] {""} ;
      H00292_n784Nove_RegionDescripcion = new boolean[] {false} ;
      H00292_A783Nove_RegionCodigo = new short[1] ;
      H00292_n783Nove_RegionCodigo = new boolean[] {false} ;
      H00292_A782Nove_RegionId = new long[1] ;
      H00292_n782Nove_RegionId = new boolean[] {false} ;
      H00292_A107Nove_TransId = new long[1] ;
      H00292_n107Nove_TransId = new boolean[] {false} ;
      H00292_A781Nove_UsuarioRegistro = new long[1] ;
      H00292_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      H00292_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00292_n780Nove_FechaRegistro = new boolean[] {false} ;
      hsh = "" ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA106Nove_Identificador = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_novedadgeneral__default(),
         new Object[] {
             new Object[] {
            H00292_A802Nove_Observaciones, H00292_n802Nove_Observaciones, H00292_A106Nove_Identificador, H00292_A774TNov_Nombre_Campo, H00292_n774TNov_Nombre_Campo, H00292_A815Nove_RespuestaProc, H00292_n815Nove_RespuestaProc, H00292_A765Nove_Estado, H00292_n765Nove_Estado, H00292_A814Nove_TranCC,
            H00292_n814Nove_TranCC, H00292_A805Nove_RutaSoporte, H00292_n805Nove_RutaSoporte, H00292_A804Nove_Soporte, H00292_n804Nove_Soporte, H00292_A803Nove_Masivo, H00292_n803Nove_Masivo, H00292_A772TNov_Procedimiento, H00292_n772TNov_Procedimiento, H00292_A770TNov_Tipo,
            H00292_n770TNov_Tipo, H00292_A769TNov_Descripcion, H00292_n769TNov_Descripcion, H00292_A104TNov_Codigo, H00292_n104TNov_Codigo, H00292_A801Nove_CuentadanteNomDestino, H00292_n801Nove_CuentadanteNomDestino, H00292_A800Nove_CuentadanteCedDestino, H00292_n800Nove_CuentadanteCedDestino, H00292_A799Nove_CuentadanteIdDestino,
            H00292_n799Nove_CuentadanteIdDestino, H00292_A798Nove_BodeDestino, H00292_n798Nove_BodeDestino, H00292_A797Nove_AlmaDestino, H00292_n797Nove_AlmaDestino, H00292_A796Nove_ModuloDestino, H00292_n796Nove_ModuloDestino, H00292_A795Nove_CuentadanteNomOrigen, H00292_n795Nove_CuentadanteNomOrigen, H00292_A794Nove_CuentadanteCedOrigen,
            H00292_n794Nove_CuentadanteCedOrigen, H00292_A793Nove_CuentadanteIdOrigen, H00292_n793Nove_CuentadanteIdOrigen, H00292_A792Nove_BodeOrigen, H00292_n792Nove_BodeOrigen, H00292_A791Nove_AlmaOrigen, H00292_n791Nove_AlmaOrigen, H00292_A790Nove_ModuloOrigen, H00292_n790Nove_ModuloOrigen, H00292_A789Nove_MovimientoDescrip,
            H00292_n789Nove_MovimientoDescrip, H00292_A788Nove_CodigoMovimiento, H00292_n788Nove_CodigoMovimiento, H00292_A787Nove_CentroDescripcion, H00292_n787Nove_CentroDescripcion, H00292_A786Nove_CentroCodigo, H00292_n786Nove_CentroCodigo, H00292_A785Nove_CentroId, H00292_n785Nove_CentroId, H00292_A784Nove_RegionDescripcion,
            H00292_n784Nove_RegionDescripcion, H00292_A783Nove_RegionCodigo, H00292_n783Nove_RegionCodigo, H00292_A782Nove_RegionId, H00292_n782Nove_RegionId, H00292_A107Nove_TransId, H00292_n107Nove_TransId, H00292_A781Nove_UsuarioRegistro, H00292_n781Nove_UsuarioRegistro, H00292_A780Nove_FechaRegistro,
            H00292_n780Nove_FechaRegistro
            }
         }
      );
      AV14Pgmname = "ALM_NOVEDADGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_NOVEDADGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A783Nove_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A104TNov_Codigo ;
   private int edtNove_Identificador_Enabled ;
   private int edtNove_FechaRegistro_Enabled ;
   private int edtNove_UsuarioRegistro_Enabled ;
   private int edtNove_TransId_Enabled ;
   private int edtNove_RegionId_Enabled ;
   private int edtNove_RegionCodigo_Enabled ;
   private int edtNove_RegionDescripcion_Enabled ;
   private int edtNove_CentroId_Enabled ;
   private int edtNove_CentroCodigo_Enabled ;
   private int edtNove_CentroDescripcion_Enabled ;
   private int edtNove_CodigoMovimiento_Enabled ;
   private int edtNove_MovimientoDescrip_Enabled ;
   private int edtNove_ModuloOrigen_Enabled ;
   private int edtNove_AlmaOrigen_Enabled ;
   private int edtNove_BodeOrigen_Enabled ;
   private int edtNove_CuentadanteIdOrigen_Enabled ;
   private int edtNove_CuentadanteCedOrigen_Enabled ;
   private int edtNove_CuentadanteNomOrigen_Enabled ;
   private int edtNove_ModuloDestino_Enabled ;
   private int edtNove_AlmaDestino_Enabled ;
   private int edtNove_BodeDestino_Enabled ;
   private int edtNove_CuentadanteIdDestino_Enabled ;
   private int edtNove_CuentadanteCedDestino_Enabled ;
   private int edtNove_CuentadanteNomDestino_Enabled ;
   private int edtTNov_Codigo_Enabled ;
   private int edtTNov_Descripcion_Enabled ;
   private int edtTNov_Procedimiento_Enabled ;
   private int edtNove_Observaciones_Enabled ;
   private int edtNove_Soporte_Enabled ;
   private int edtNove_RutaSoporte_Enabled ;
   private int edtNove_TranCC_Enabled ;
   private int edtNove_RespuestaProc_Enabled ;
   private int edtTNov_Nombre_Campo_Enabled ;
   private int idxLst ;
   private long wcpOA106Nove_Identificador ;
   private long A106Nove_Identificador ;
   private long A781Nove_UsuarioRegistro ;
   private long A107Nove_TransId ;
   private long A782Nove_RegionId ;
   private long A785Nove_CentroId ;
   private long A793Nove_CuentadanteIdOrigen ;
   private long A794Nove_CuentadanteCedOrigen ;
   private long A799Nove_CuentadanteIdDestino ;
   private long A800Nove_CuentadanteCedDestino ;
   private long A814Nove_TranCC ;
   private long AV7Nove_Identificador ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A765Nove_Estado ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divAttributestable_Internalname ;
   private String edtNove_Identificador_Internalname ;
   private String edtNove_Identificador_Jsonclick ;
   private String edtNove_FechaRegistro_Internalname ;
   private String edtNove_FechaRegistro_Jsonclick ;
   private String edtNove_UsuarioRegistro_Internalname ;
   private String edtNove_UsuarioRegistro_Jsonclick ;
   private String edtNove_TransId_Internalname ;
   private String edtNove_TransId_Jsonclick ;
   private String edtNove_RegionId_Internalname ;
   private String edtNove_RegionId_Jsonclick ;
   private String edtNove_RegionCodigo_Internalname ;
   private String edtNove_RegionCodigo_Jsonclick ;
   private String edtNove_RegionDescripcion_Internalname ;
   private String edtNove_RegionDescripcion_Jsonclick ;
   private String edtNove_CentroId_Internalname ;
   private String edtNove_CentroId_Jsonclick ;
   private String edtNove_CentroCodigo_Internalname ;
   private String edtNove_CentroCodigo_Jsonclick ;
   private String edtNove_CentroDescripcion_Internalname ;
   private String edtNove_CentroDescripcion_Jsonclick ;
   private String edtNove_CodigoMovimiento_Internalname ;
   private String edtNove_CodigoMovimiento_Jsonclick ;
   private String edtNove_MovimientoDescrip_Internalname ;
   private String edtNove_MovimientoDescrip_Jsonclick ;
   private String edtNove_ModuloOrigen_Internalname ;
   private String edtNove_ModuloOrigen_Jsonclick ;
   private String edtNove_AlmaOrigen_Internalname ;
   private String edtNove_AlmaOrigen_Jsonclick ;
   private String edtNove_BodeOrigen_Internalname ;
   private String edtNove_BodeOrigen_Jsonclick ;
   private String edtNove_CuentadanteIdOrigen_Internalname ;
   private String edtNove_CuentadanteIdOrigen_Jsonclick ;
   private String edtNove_CuentadanteCedOrigen_Internalname ;
   private String edtNove_CuentadanteCedOrigen_Jsonclick ;
   private String edtNove_CuentadanteNomOrigen_Internalname ;
   private String edtNove_CuentadanteNomOrigen_Jsonclick ;
   private String edtNove_ModuloDestino_Internalname ;
   private String edtNove_ModuloDestino_Jsonclick ;
   private String edtNove_AlmaDestino_Internalname ;
   private String edtNove_AlmaDestino_Jsonclick ;
   private String edtNove_BodeDestino_Internalname ;
   private String edtNove_BodeDestino_Jsonclick ;
   private String edtNove_CuentadanteIdDestino_Internalname ;
   private String edtNove_CuentadanteIdDestino_Jsonclick ;
   private String edtNove_CuentadanteCedDestino_Internalname ;
   private String edtNove_CuentadanteCedDestino_Jsonclick ;
   private String edtNove_CuentadanteNomDestino_Internalname ;
   private String edtNove_CuentadanteNomDestino_Jsonclick ;
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Descripcion_Internalname ;
   private String edtTNov_Descripcion_Link ;
   private String edtTNov_Procedimiento_Internalname ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private String edtNove_Observaciones_Internalname ;
   private String edtNove_Soporte_Internalname ;
   private String edtNove_Soporte_Filetype ;
   private String edtNove_Soporte_Contenttype ;
   private String edtNove_Soporte_Parameters ;
   private String edtNove_Soporte_Jsonclick ;
   private String edtNove_RutaSoporte_Internalname ;
   private String edtNove_TranCC_Internalname ;
   private String edtNove_TranCC_Jsonclick ;
   private String edtNove_RespuestaProc_Internalname ;
   private String edtTNov_Nombre_Campo_Internalname ;
   private String edtTNov_Nombre_Campo_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA106Nove_Identificador ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean n804Nove_Soporte ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n770TNov_Tipo ;
   private boolean n803Nove_Masivo ;
   private boolean n765Nove_Estado ;
   private boolean n802Nove_Observaciones ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n815Nove_RespuestaProc ;
   private boolean n814Nove_TranCC ;
   private boolean n805Nove_RutaSoporte ;
   private boolean n772TNov_Procedimiento ;
   private boolean n769TNov_Descripcion ;
   private boolean n104TNov_Codigo ;
   private boolean n801Nove_CuentadanteNomDestino ;
   private boolean n800Nove_CuentadanteCedDestino ;
   private boolean n799Nove_CuentadanteIdDestino ;
   private boolean n798Nove_BodeDestino ;
   private boolean n797Nove_AlmaDestino ;
   private boolean n796Nove_ModuloDestino ;
   private boolean n795Nove_CuentadanteNomOrigen ;
   private boolean n794Nove_CuentadanteCedOrigen ;
   private boolean n793Nove_CuentadanteIdOrigen ;
   private boolean n792Nove_BodeOrigen ;
   private boolean n791Nove_AlmaOrigen ;
   private boolean n790Nove_ModuloOrigen ;
   private boolean n789Nove_MovimientoDescrip ;
   private boolean n788Nove_CodigoMovimiento ;
   private boolean n787Nove_CentroDescripcion ;
   private boolean n786Nove_CentroCodigo ;
   private boolean n785Nove_CentroId ;
   private boolean n784Nove_RegionDescripcion ;
   private boolean n783Nove_RegionCodigo ;
   private boolean n782Nove_RegionId ;
   private boolean n107Nove_TransId ;
   private boolean n781Nove_UsuarioRegistro ;
   private boolean n780Nove_FechaRegistro ;
   private boolean returnInSub ;
   private String A802Nove_Observaciones ;
   private String A804Nove_Soporte ;
   private String A803Nove_Masivo ;
   private String A805Nove_RutaSoporte ;
   private String A815Nove_RespuestaProc ;
   private String A784Nove_RegionDescripcion ;
   private String A786Nove_CentroCodigo ;
   private String A787Nove_CentroDescripcion ;
   private String A788Nove_CodigoMovimiento ;
   private String A789Nove_MovimientoDescrip ;
   private String A790Nove_ModuloOrigen ;
   private String A791Nove_AlmaOrigen ;
   private String A792Nove_BodeOrigen ;
   private String A795Nove_CuentadanteNomOrigen ;
   private String A796Nove_ModuloDestino ;
   private String A797Nove_AlmaDestino ;
   private String A798Nove_BodeDestino ;
   private String A801Nove_CuentadanteNomDestino ;
   private String A769TNov_Descripcion ;
   private String A770TNov_Tipo ;
   private String A772TNov_Procedimiento ;
   private String A774TNov_Nombre_Campo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbNove_Masivo ;
   private HTMLChoice cmbNove_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00292_A802Nove_Observaciones ;
   private boolean[] H00292_n802Nove_Observaciones ;
   private long[] H00292_A106Nove_Identificador ;
   private String[] H00292_A774TNov_Nombre_Campo ;
   private boolean[] H00292_n774TNov_Nombre_Campo ;
   private String[] H00292_A815Nove_RespuestaProc ;
   private boolean[] H00292_n815Nove_RespuestaProc ;
   private String[] H00292_A765Nove_Estado ;
   private boolean[] H00292_n765Nove_Estado ;
   private long[] H00292_A814Nove_TranCC ;
   private boolean[] H00292_n814Nove_TranCC ;
   private String[] H00292_A805Nove_RutaSoporte ;
   private boolean[] H00292_n805Nove_RutaSoporte ;
   private String[] H00292_A804Nove_Soporte ;
   private boolean[] H00292_n804Nove_Soporte ;
   private String[] H00292_A803Nove_Masivo ;
   private boolean[] H00292_n803Nove_Masivo ;
   private String[] H00292_A772TNov_Procedimiento ;
   private boolean[] H00292_n772TNov_Procedimiento ;
   private String[] H00292_A770TNov_Tipo ;
   private boolean[] H00292_n770TNov_Tipo ;
   private String[] H00292_A769TNov_Descripcion ;
   private boolean[] H00292_n769TNov_Descripcion ;
   private int[] H00292_A104TNov_Codigo ;
   private boolean[] H00292_n104TNov_Codigo ;
   private String[] H00292_A801Nove_CuentadanteNomDestino ;
   private boolean[] H00292_n801Nove_CuentadanteNomDestino ;
   private long[] H00292_A800Nove_CuentadanteCedDestino ;
   private boolean[] H00292_n800Nove_CuentadanteCedDestino ;
   private long[] H00292_A799Nove_CuentadanteIdDestino ;
   private boolean[] H00292_n799Nove_CuentadanteIdDestino ;
   private String[] H00292_A798Nove_BodeDestino ;
   private boolean[] H00292_n798Nove_BodeDestino ;
   private String[] H00292_A797Nove_AlmaDestino ;
   private boolean[] H00292_n797Nove_AlmaDestino ;
   private String[] H00292_A796Nove_ModuloDestino ;
   private boolean[] H00292_n796Nove_ModuloDestino ;
   private String[] H00292_A795Nove_CuentadanteNomOrigen ;
   private boolean[] H00292_n795Nove_CuentadanteNomOrigen ;
   private long[] H00292_A794Nove_CuentadanteCedOrigen ;
   private boolean[] H00292_n794Nove_CuentadanteCedOrigen ;
   private long[] H00292_A793Nove_CuentadanteIdOrigen ;
   private boolean[] H00292_n793Nove_CuentadanteIdOrigen ;
   private String[] H00292_A792Nove_BodeOrigen ;
   private boolean[] H00292_n792Nove_BodeOrigen ;
   private String[] H00292_A791Nove_AlmaOrigen ;
   private boolean[] H00292_n791Nove_AlmaOrigen ;
   private String[] H00292_A790Nove_ModuloOrigen ;
   private boolean[] H00292_n790Nove_ModuloOrigen ;
   private String[] H00292_A789Nove_MovimientoDescrip ;
   private boolean[] H00292_n789Nove_MovimientoDescrip ;
   private String[] H00292_A788Nove_CodigoMovimiento ;
   private boolean[] H00292_n788Nove_CodigoMovimiento ;
   private String[] H00292_A787Nove_CentroDescripcion ;
   private boolean[] H00292_n787Nove_CentroDescripcion ;
   private String[] H00292_A786Nove_CentroCodigo ;
   private boolean[] H00292_n786Nove_CentroCodigo ;
   private long[] H00292_A785Nove_CentroId ;
   private boolean[] H00292_n785Nove_CentroId ;
   private String[] H00292_A784Nove_RegionDescripcion ;
   private boolean[] H00292_n784Nove_RegionDescripcion ;
   private short[] H00292_A783Nove_RegionCodigo ;
   private boolean[] H00292_n783Nove_RegionCodigo ;
   private long[] H00292_A782Nove_RegionId ;
   private boolean[] H00292_n782Nove_RegionId ;
   private long[] H00292_A107Nove_TransId ;
   private boolean[] H00292_n107Nove_TransId ;
   private long[] H00292_A781Nove_UsuarioRegistro ;
   private boolean[] H00292_n781Nove_UsuarioRegistro ;
   private java.util.Date[] H00292_A780Nove_FechaRegistro ;
   private boolean[] H00292_n780Nove_FechaRegistro ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_novedadgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00292", "SELECT T1.Nove_Observaciones, T1.Nove_Identificador, T2.TNov_Nombre_Campo, T1.Nove_RespuestaProc, T1.Nove_Estado, T3.Tran_ConsecutivoCC AS Nove_TranCC, T1.Nove_RutaSoporte, T1.Nove_Soporte, T1.Nove_Masivo, T2.TNov_Procedimiento, T2.TNov_Tipo, T2.TNov_Descripcion, T1.TNov_Codigo, T4.Cuen_Nombre AS Nove_CuentadanteNomDestino, T4.Cuen_Cedula AS Nove_CuentadanteCedDestino, T3.Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino, T3.Tran_CodBodeDestino AS Nove_BodeDestino, T3.Tran_CodAlmaDestino AS Nove_AlmaDestino, T3.Tran_ModuloDestino AS Nove_ModuloDestino, T5.Cuen_Nombre AS Nove_CuentadanteNomOrigen, T5.Cuen_Cedula AS Nove_CuentadanteCedOrigen, T3.Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, T3.Tran_CodBodeOrigen AS Nove_BodeOrigen, T3.Tran_CodAlmaOrigen AS Nove_AlmaOrigen, T3.Tran_ModuloOrigen AS Nove_ModuloOrigen, T6.Tpmo_Descripcion AS Nove_MovimientoDescrip, T3.Tran_CodigoMovimiento AS Nove_CodigoMovimiento, T7.Cent_Descripcion AS Nove_CentroDescripcion, T7.Cent_Codigo AS Nove_CentroCodigo, T3.Tran_CentroCostoId AS Nove_CentroId, T8.Regi_Descripcion AS Nove_RegionDescripcion, T8.Regi_Cod AS Nove_RegionCodigo, T3.Tran_RegionId AS Nove_RegionId, T1.Nove_TransId AS Nove_TransId, T1.Nove_UsuarioRegistro, T1.Nove_FechaRegistro FROM (((((((ALM_NOVEDAD T1 LEFT JOIN ALM_TIPO_NOVEDAD T2 ON T2.TNov_Codigo = T1.TNov_Codigo) LEFT JOIN ALM_TRANSACCION T3 ON T3.Tran_Id = T1.Nove_TransId) LEFT JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = T3.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T3.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_TIPO_MOVIMIENTO T6 ON T6.Tpmo_Codigo = T3.Tran_CodigoMovimiento) LEFT JOIN GEN_CENTROCOSTO T7 ON T7.Cent_Id = T3.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T8 ON T8.Regi_Id = T3.Tran_RegionId) WHERE T1.Nove_Identificador = ? ORDER BY T1.Nove_Identificador ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((long[]) buf[39])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((long[]) buf[63])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[69])[0] = rslt.getGXDateTime(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
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
      }
   }

}

