/*
               File: alm_tipo_movimientogeneral_impl
        Description: ALM_TIPO_MOVIMIENTOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:39.68
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

public final  class alm_tipo_movimientogeneral_impl extends GXWebComponent
{
   public alm_tipo_movimientogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_movimientogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_movimientogeneral_impl.class ));
   }

   public alm_tipo_movimientogeneral_impl( int remoteHandle ,
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
      cmbTpmo_TipoE_S = new HTMLChoice();
      cmbTpmo_Modulo = new HTMLChoice();
      cmbTpmo_IngresaAredante = new HTMLChoice();
      cmbTpmo_IngresaCurso = new HTMLChoice();
      cmbTipo_Tipo = new HTMLChoice();
      cmbTpmo_Controlado = new HTMLChoice();
      cmbTpmo_VidaUtil = new HTMLChoice();
      cmbTpmo_Estado = new HTMLChoice();
      cmbTpmo_CuentaResponsabilidad = new HTMLChoice();
      cmbTpmo_SolicitaRegionDestino = new HTMLChoice();
      cmbTpmo_SolicitaCentroDestino = new HTMLChoice();
      cmbTpmo_ImprimeOrigen = new HTMLChoice();
      cmbTpmo_ImprimeDestino = new HTMLChoice();
      cmbTmpo_ImprimeResponsable = new HTMLChoice();
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
               A38Tpmo_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A38Tpmo_Codigo});
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
         pa472( ) ;
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
         httpContext.writeValue( "ALM_TIPO_MOVIMIENTOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414163972");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_movimientogeneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A38Tpmo_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA38Tpmo_Codigo", wcpOA38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_ALMACENORIGENID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_ALMACENDESTINOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_INGRESACURSO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_CONSECUTIVOTRANS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_CONTROLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_VIDAUTIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_SOLICITAREGIONDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A705Tpmo_SolicitaRegionDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_SOLICITACENTRODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A706Tpmo_SolicitaCentroDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_IMPRIMEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A716Tpmo_ImprimeOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPMO_IMPRIMEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A717Tpmo_ImprimeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TMPO_IMPRIMERESPONSABLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A718Tmpo_ImprimeResponsable, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm472( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_movimientogeneral.js", "?201861414163977");
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
      return "ALM_TIPO_MOVIMIENTOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_MOVIMIENTOGeneral" ;
   }

   public void wb470( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_movimientogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11471_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12471_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_Codigo_Internalname, "Código", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_Codigo_Internalname, A38Tpmo_Codigo, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_Descripcion_Internalname, "Tipo de movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_Descripcion_Internalname, A313Tpmo_Descripcion, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Descripcion_Internalname, "Tipo de Elemento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenOrigenId_Internalname, "Almacén orígen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenOrigenId_Internalname, GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")), ((edtTpmo_AlmacenOrigenId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenOrigenId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_AlmacenOrigenId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenOrigenDescrip_Internalname, "Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenOrigenDescrip_Internalname, A312Tpmo_AlmacenOrigenDescrip, GXutil.rtrim( localUtil.format( A312Tpmo_AlmacenOrigenDescrip, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenOrigenDescrip_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_AlmacenOrigenDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenDestinoId_Internalname, "Almacén destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenDestinoId_Internalname, GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")), ((edtTpmo_AlmacenDestinoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenDestinoId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_AlmacenDestinoId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenDestinoDescrip_Internalname, "Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenDestinoDescrip_Internalname, A314Tpmo_AlmacenDestinoDescrip, GXutil.rtrim( localUtil.format( A314Tpmo_AlmacenDestinoDescrip, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenDestinoDescrip_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_AlmacenDestinoDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_TipoE_S.getInternalname(), "Tipo E/S", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_TipoE_S, cmbTpmo_TipoE_S.getInternalname(), GXutil.rtrim( A315Tpmo_TipoE_S), 1, cmbTpmo_TipoE_S.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_TipoE_S.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_TipoE_S.setValue( GXutil.rtrim( A315Tpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_TipoE_S.getInternalname(), "Values", cmbTpmo_TipoE_S.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_UsuarioCrea_Internalname, A317Tpmo_UsuarioCrea, GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTpmo_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_FechaCrea_Internalname, localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTpmo_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTpmo_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_UsuarioModifica_Internalname, A319Tpmo_UsuarioModifica, GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTpmo_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_FechaModifica_Internalname, localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTpmo_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTpmo_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Modulo.getInternalname(), "Módulo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Modulo, cmbTpmo_Modulo.getInternalname(), GXutil.rtrim( A316Tpmo_Modulo), 1, cmbTpmo_Modulo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_Modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_Modulo.setValue( GXutil.rtrim( A316Tpmo_Modulo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Modulo.getInternalname(), "Values", cmbTpmo_Modulo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_IngresaAredante.getInternalname(), "Ingresa areadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_IngresaAredante, cmbTpmo_IngresaAredante.getInternalname(), GXutil.rtrim( A440Tpmo_IngresaAredante), 1, cmbTpmo_IngresaAredante.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_IngresaAredante.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_IngresaAredante.setValue( GXutil.rtrim( A440Tpmo_IngresaAredante) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_IngresaAredante.getInternalname(), "Values", cmbTpmo_IngresaAredante.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_IngresaCurso.getInternalname(), "Ingresa curso", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_IngresaCurso, cmbTpmo_IngresaCurso.getInternalname(), GXutil.rtrim( A441Tpmo_IngresaCurso), 1, cmbTpmo_IngresaCurso.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_IngresaCurso.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_IngresaCurso.setValue( GXutil.rtrim( A441Tpmo_IngresaCurso) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_IngresaCurso.getInternalname(), "Values", cmbTpmo_IngresaCurso.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Tipo.getInternalname(), "Tipo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Tipo, cmbTipo_Tipo.getInternalname(), GXutil.rtrim( A480Tipo_Tipo), 1, cmbTipo_Tipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Tipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_ConsecutivoTrans_Internalname, "Transaccion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_ConsecutivoTrans_Internalname, GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ",", "")), ((edtTpmo_ConsecutivoTrans_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_ConsecutivoTrans_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpmo_ConsecutivoTrans_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Controlado.getInternalname(), "Consumo controlado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Controlado, cmbTpmo_Controlado.getInternalname(), GXutil.rtrim( A633Tpmo_Controlado), 1, cmbTpmo_Controlado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_Controlado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_Controlado.setValue( GXutil.rtrim( A633Tpmo_Controlado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Controlado.getInternalname(), "Values", cmbTpmo_Controlado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_VidaUtil.getInternalname(), "Solicita vida útil", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_VidaUtil, cmbTpmo_VidaUtil.getInternalname(), GXutil.rtrim( A641Tpmo_VidaUtil), 1, cmbTpmo_VidaUtil.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_VidaUtil.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_VidaUtil.setValue( GXutil.rtrim( A641Tpmo_VidaUtil) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_VidaUtil.getInternalname(), "Values", cmbTpmo_VidaUtil.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Estado, cmbTpmo_Estado.getInternalname(), GXutil.rtrim( A679Tpmo_Estado), 1, cmbTpmo_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTpmo_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_Estado.setValue( GXutil.rtrim( A679Tpmo_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_Estado.getInternalname(), "Values", cmbTpmo_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Responsabilidad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_CuentaResponsabilidad, cmbTpmo_CuentaResponsabilidad.getInternalname(), GXutil.rtrim( A680Tpmo_CuentaResponsabilidad), 1, cmbTpmo_CuentaResponsabilidad.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_CuentaResponsabilidad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_CuentaResponsabilidad.setValue( GXutil.rtrim( A680Tpmo_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Values", cmbTpmo_CuentaResponsabilidad.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Región Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_SolicitaRegionDestino, cmbTpmo_SolicitaRegionDestino.getInternalname(), GXutil.rtrim( A705Tpmo_SolicitaRegionDestino), 1, cmbTpmo_SolicitaRegionDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_SolicitaRegionDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_SolicitaRegionDestino.setValue( GXutil.rtrim( A705Tpmo_SolicitaRegionDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Values", cmbTpmo_SolicitaRegionDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Centro Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_SolicitaCentroDestino, cmbTpmo_SolicitaCentroDestino.getInternalname(), GXutil.rtrim( A706Tpmo_SolicitaCentroDestino), 1, cmbTpmo_SolicitaCentroDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_SolicitaCentroDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_SolicitaCentroDestino.setValue( GXutil.rtrim( A706Tpmo_SolicitaCentroDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Values", cmbTpmo_SolicitaCentroDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_ImprimeOrigen.getInternalname(), "Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_ImprimeOrigen, cmbTpmo_ImprimeOrigen.getInternalname(), GXutil.rtrim( A716Tpmo_ImprimeOrigen), 1, cmbTpmo_ImprimeOrigen.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_ImprimeOrigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_ImprimeOrigen.setValue( GXutil.rtrim( A716Tpmo_ImprimeOrigen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_ImprimeOrigen.getInternalname(), "Values", cmbTpmo_ImprimeOrigen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_ImprimeDestino.getInternalname(), "Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_ImprimeDestino, cmbTpmo_ImprimeDestino.getInternalname(), GXutil.rtrim( A717Tpmo_ImprimeDestino), 1, cmbTpmo_ImprimeDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_ImprimeDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTpmo_ImprimeDestino.setValue( GXutil.rtrim( A717Tpmo_ImprimeDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTpmo_ImprimeDestino.getInternalname(), "Values", cmbTpmo_ImprimeDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTmpo_ImprimeResponsable.getInternalname(), "Responsable", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTmpo_ImprimeResponsable, cmbTmpo_ImprimeResponsable.getInternalname(), GXutil.rtrim( A718Tmpo_ImprimeResponsable), 1, cmbTmpo_ImprimeResponsable.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTmpo_ImprimeResponsable.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTOGeneral.htm");
         cmbTmpo_ImprimeResponsable.setValue( GXutil.rtrim( A718Tmpo_ImprimeResponsable) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTmpo_ImprimeResponsable.getInternalname(), "Values", cmbTmpo_ImprimeResponsable.ToJavascriptSource(), true);
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

   public void start472( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_MOVIMIENTOGeneral", (short)(0)) ;
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
            strup470( ) ;
         }
      }
   }

   public void ws472( )
   {
      start472( ) ;
      evt472( ) ;
   }

   public void evt472( )
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
                              strup470( ) ;
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
                              strup470( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13472 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup470( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14472 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup470( ) ;
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
                              strup470( ) ;
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

   public void we472( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm472( ) ;
         }
      }
   }

   public void pa472( )
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
         cmbTpmo_TipoE_S.setName( "TPMO_TIPOE_S" );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
         }
         cmbTpmo_Modulo.setName( "TPMO_MODULO" );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
         }
         cmbTpmo_IngresaAredante.setName( "TPMO_INGRESAAREDANTE" );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
         }
         cmbTpmo_IngresaCurso.setName( "TPMO_INGRESACURSO" );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESACURSO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
         }
         cmbTipo_Tipo.setName( "TIPO_TIPO" );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
         }
         cmbTpmo_Controlado.setName( "TPMO_CONTROLADO" );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONTROLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
         }
         cmbTpmo_VidaUtil.setName( "TPMO_VIDAUTIL" );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_VIDAUTIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
         }
         cmbTpmo_Estado.setName( "TPMO_ESTADO" );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A679Tpmo_Estado", A679Tpmo_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
         }
         cmbTpmo_CuentaResponsabilidad.setName( "TPMO_CUENTARESPONSABILIDAD" );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
         }
         cmbTpmo_SolicitaRegionDestino.setName( "TPMO_SOLICITAREGIONDESTINO" );
         cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
         cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
            n705Tpmo_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITAREGIONDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A705Tpmo_SolicitaRegionDestino, ""))));
         }
         cmbTpmo_SolicitaCentroDestino.setName( "TPMO_SOLICITACENTRODESTINO" );
         cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
         cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
         {
            A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
            n706Tpmo_SolicitaCentroDestino = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITACENTRODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A706Tpmo_SolicitaCentroDestino, ""))));
         }
         cmbTpmo_ImprimeOrigen.setName( "TPMO_IMPRIMEORIGEN" );
         cmbTpmo_ImprimeOrigen.setWebtags( "" );
         cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
         {
            A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
            n716Tpmo_ImprimeOrigen = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A716Tpmo_ImprimeOrigen, ""))));
         }
         cmbTpmo_ImprimeDestino.setName( "TPMO_IMPRIMEDESTINO" );
         cmbTpmo_ImprimeDestino.setWebtags( "" );
         cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
         {
            A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
            n717Tpmo_ImprimeDestino = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A717Tpmo_ImprimeDestino, ""))));
         }
         cmbTmpo_ImprimeResponsable.setName( "TMPO_IMPRIMERESPONSABLE" );
         cmbTmpo_ImprimeResponsable.setWebtags( "" );
         cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
         if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
         {
            A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
            n718Tmpo_ImprimeResponsable = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TMPO_IMPRIMERESPONSABLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A718Tmpo_ImprimeResponsable, ""))));
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
      if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
      {
         A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
      }
      if ( cmbTpmo_Modulo.getItemCount() > 0 )
      {
         A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
      }
      if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
      {
         A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
      }
      if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
      {
         A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESACURSO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
      }
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
      }
      if ( cmbTpmo_Controlado.getItemCount() > 0 )
      {
         A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
         n633Tpmo_Controlado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONTROLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
      }
      if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
      {
         A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
         n641Tpmo_VidaUtil = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_VIDAUTIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
      }
      if ( cmbTpmo_Estado.getItemCount() > 0 )
      {
         A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
         n679Tpmo_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A679Tpmo_Estado", A679Tpmo_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
      }
      if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
         n680Tpmo_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
      }
      if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
         n705Tpmo_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITAREGIONDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A705Tpmo_SolicitaRegionDestino, ""))));
      }
      if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
      {
         A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
         n706Tpmo_SolicitaCentroDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITACENTRODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A706Tpmo_SolicitaCentroDestino, ""))));
      }
      if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
      {
         A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
         n716Tpmo_ImprimeOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A716Tpmo_ImprimeOrigen, ""))));
      }
      if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
      {
         A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
         n717Tpmo_ImprimeDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A717Tpmo_ImprimeDestino, ""))));
      }
      if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
      {
         A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
         n718Tmpo_ImprimeResponsable = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TMPO_IMPRIMERESPONSABLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A718Tmpo_ImprimeResponsable, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf472( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_MOVIMIENTOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf472( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00472 */
         pr_default.execute(0, new Object[] {A38Tpmo_Codigo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A718Tmpo_ImprimeResponsable = H00472_A718Tmpo_ImprimeResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TMPO_IMPRIMERESPONSABLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A718Tmpo_ImprimeResponsable, ""))));
            n718Tmpo_ImprimeResponsable = H00472_n718Tmpo_ImprimeResponsable[0] ;
            A717Tpmo_ImprimeDestino = H00472_A717Tpmo_ImprimeDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A717Tpmo_ImprimeDestino, ""))));
            n717Tpmo_ImprimeDestino = H00472_n717Tpmo_ImprimeDestino[0] ;
            A716Tpmo_ImprimeOrigen = H00472_A716Tpmo_ImprimeOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A716Tpmo_ImprimeOrigen, ""))));
            n716Tpmo_ImprimeOrigen = H00472_n716Tpmo_ImprimeOrigen[0] ;
            A706Tpmo_SolicitaCentroDestino = H00472_A706Tpmo_SolicitaCentroDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITACENTRODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A706Tpmo_SolicitaCentroDestino, ""))));
            n706Tpmo_SolicitaCentroDestino = H00472_n706Tpmo_SolicitaCentroDestino[0] ;
            A705Tpmo_SolicitaRegionDestino = H00472_A705Tpmo_SolicitaRegionDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITAREGIONDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A705Tpmo_SolicitaRegionDestino, ""))));
            n705Tpmo_SolicitaRegionDestino = H00472_n705Tpmo_SolicitaRegionDestino[0] ;
            A680Tpmo_CuentaResponsabilidad = H00472_A680Tpmo_CuentaResponsabilidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
            n680Tpmo_CuentaResponsabilidad = H00472_n680Tpmo_CuentaResponsabilidad[0] ;
            A679Tpmo_Estado = H00472_A679Tpmo_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A679Tpmo_Estado", A679Tpmo_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
            n679Tpmo_Estado = H00472_n679Tpmo_Estado[0] ;
            A641Tpmo_VidaUtil = H00472_A641Tpmo_VidaUtil[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_VIDAUTIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
            n641Tpmo_VidaUtil = H00472_n641Tpmo_VidaUtil[0] ;
            A633Tpmo_Controlado = H00472_A633Tpmo_Controlado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONTROLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
            n633Tpmo_Controlado = H00472_n633Tpmo_Controlado[0] ;
            A595Tpmo_ConsecutivoTrans = H00472_A595Tpmo_ConsecutivoTrans[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A595Tpmo_ConsecutivoTrans", GXutil.ltrim( GXutil.str( A595Tpmo_ConsecutivoTrans, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONSECUTIVOTRANS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")));
            n595Tpmo_ConsecutivoTrans = H00472_n595Tpmo_ConsecutivoTrans[0] ;
            A480Tipo_Tipo = H00472_A480Tipo_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
            A441Tpmo_IngresaCurso = H00472_A441Tpmo_IngresaCurso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESACURSO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
            A440Tpmo_IngresaAredante = H00472_A440Tpmo_IngresaAredante[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
            A316Tpmo_Modulo = H00472_A316Tpmo_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
            A320Tpmo_FechaModifica = H00472_A320Tpmo_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A320Tpmo_FechaModifica", localUtil.ttoc( A320Tpmo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99")));
            n320Tpmo_FechaModifica = H00472_n320Tpmo_FechaModifica[0] ;
            A319Tpmo_UsuarioModifica = H00472_A319Tpmo_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A319Tpmo_UsuarioModifica", A319Tpmo_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!"))));
            n319Tpmo_UsuarioModifica = H00472_n319Tpmo_UsuarioModifica[0] ;
            A318Tpmo_FechaCrea = H00472_A318Tpmo_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A318Tpmo_FechaCrea", localUtil.ttoc( A318Tpmo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99")));
            A317Tpmo_UsuarioCrea = H00472_A317Tpmo_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A317Tpmo_UsuarioCrea", A317Tpmo_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!"))));
            A315Tpmo_TipoE_S = H00472_A315Tpmo_TipoE_S[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
            A314Tpmo_AlmacenDestinoDescrip = H00472_A314Tpmo_AlmacenDestinoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
            n314Tpmo_AlmacenDestinoDescrip = H00472_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A40Tpmo_AlmacenDestinoId = H00472_A40Tpmo_AlmacenDestinoId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ALMACENDESTINOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")));
            A312Tpmo_AlmacenOrigenDescrip = H00472_A312Tpmo_AlmacenOrigenDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
            n312Tpmo_AlmacenOrigenDescrip = H00472_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A39Tpmo_AlmacenOrigenId = H00472_A39Tpmo_AlmacenOrigenId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ALMACENORIGENID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")));
            A253Tipo_Descripcion = H00472_A253Tipo_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            A33Tipo_Codigo = H00472_A33Tipo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
            A313Tpmo_Descripcion = H00472_A313Tpmo_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
            A314Tpmo_AlmacenDestinoDescrip = H00472_A314Tpmo_AlmacenDestinoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
            n314Tpmo_AlmacenDestinoDescrip = H00472_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A312Tpmo_AlmacenOrigenDescrip = H00472_A312Tpmo_AlmacenOrigenDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
            n312Tpmo_AlmacenOrigenDescrip = H00472_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A480Tipo_Tipo = H00472_A480Tipo_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
            A253Tipo_Descripcion = H00472_A253Tipo_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            /* Execute user event: Load */
            e14472 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb470( ) ;
      }
   }

   public void strup470( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_TIPO_MOVIMIENTOGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13472 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A313Tpmo_Descripcion = httpContext.cgiGet( edtTpmo_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
         A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ALMACENORIGENID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")));
         A312Tpmo_AlmacenOrigenDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenOrigenDescrip_Internalname)) ;
         n312Tpmo_AlmacenOrigenDescrip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
         A40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ALMACENDESTINOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")));
         A314Tpmo_AlmacenDestinoDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenDestinoDescrip_Internalname)) ;
         n314Tpmo_AlmacenDestinoDescrip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
         cmbTpmo_TipoE_S.setValue( httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) );
         A315Tpmo_TipoE_S = httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
         A317Tpmo_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A317Tpmo_UsuarioCrea", A317Tpmo_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!"))));
         A318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A318Tpmo_FechaCrea", localUtil.ttoc( A318Tpmo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99")));
         A319Tpmo_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioModifica_Internalname)) ;
         n319Tpmo_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A319Tpmo_UsuarioModifica", A319Tpmo_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!"))));
         A320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaModifica_Internalname), 0) ;
         n320Tpmo_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A320Tpmo_FechaModifica", localUtil.ttoc( A320Tpmo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99")));
         cmbTpmo_Modulo.setValue( httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) );
         A316Tpmo_Modulo = httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_MODULO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
         cmbTpmo_IngresaAredante.setValue( httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) );
         A440Tpmo_IngresaAredante = httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
         cmbTpmo_IngresaCurso.setValue( httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) );
         A441Tpmo_IngresaCurso = httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_INGRESACURSO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
         cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
         A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
         A595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( edtTpmo_ConsecutivoTrans_Internalname), ",", ".") ;
         n595Tpmo_ConsecutivoTrans = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A595Tpmo_ConsecutivoTrans", GXutil.ltrim( GXutil.str( A595Tpmo_ConsecutivoTrans, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONSECUTIVOTRANS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")));
         cmbTpmo_Controlado.setValue( httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) );
         A633Tpmo_Controlado = httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) ;
         n633Tpmo_Controlado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CONTROLADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
         cmbTpmo_VidaUtil.setValue( httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) );
         A641Tpmo_VidaUtil = httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) ;
         n641Tpmo_VidaUtil = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_VIDAUTIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
         cmbTpmo_Estado.setValue( httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) );
         A679Tpmo_Estado = httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) ;
         n679Tpmo_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A679Tpmo_Estado", A679Tpmo_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
         cmbTpmo_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) );
         A680Tpmo_CuentaResponsabilidad = httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) ;
         n680Tpmo_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
         cmbTpmo_SolicitaRegionDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) );
         A705Tpmo_SolicitaRegionDestino = httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) ;
         n705Tpmo_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITAREGIONDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A705Tpmo_SolicitaRegionDestino, ""))));
         cmbTpmo_SolicitaCentroDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) );
         A706Tpmo_SolicitaCentroDestino = httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) ;
         n706Tpmo_SolicitaCentroDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_SOLICITACENTRODESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A706Tpmo_SolicitaCentroDestino, ""))));
         cmbTpmo_ImprimeOrigen.setValue( httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) );
         A716Tpmo_ImprimeOrigen = httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) ;
         n716Tpmo_ImprimeOrigen = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A716Tpmo_ImprimeOrigen, ""))));
         cmbTpmo_ImprimeDestino.setValue( httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) );
         A717Tpmo_ImprimeDestino = httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) ;
         n717Tpmo_ImprimeDestino = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPMO_IMPRIMEDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A717Tpmo_ImprimeDestino, ""))));
         cmbTmpo_ImprimeResponsable.setValue( httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) );
         A718Tmpo_ImprimeResponsable = httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) ;
         n718Tmpo_ImprimeResponsable = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TMPO_IMPRIMERESPONSABLE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A718Tmpo_ImprimeResponsable, ""))));
         /* Read saved values. */
         wcpOA38Tpmo_Codigo = httpContext.cgiGet( sPrefix+"wcpOA38Tpmo_Codigo") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
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
      e13472 ();
      if (returnInSub) return;
   }

   public void e13472( )
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

   protected void e14472( )
   {
      /* Load Routine */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TIPO_MOVIMIENTO" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tpmo_Codigo" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Tpmo_Codigo );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A38Tpmo_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
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
      pa472( ) ;
      ws472( ) ;
      we472( ) ;
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
      sCtrlA38Tpmo_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa472( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_movimientogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa472( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A38Tpmo_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      }
      wcpOA38Tpmo_Codigo = httpContext.cgiGet( sPrefix+"wcpOA38Tpmo_Codigo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A38Tpmo_Codigo, wcpOA38Tpmo_Codigo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA38Tpmo_Codigo = A38Tpmo_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA38Tpmo_Codigo = httpContext.cgiGet( sPrefix+"A38Tpmo_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA38Tpmo_Codigo) > 0 )
      {
         A38Tpmo_Codigo = httpContext.cgiGet( sCtrlA38Tpmo_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      }
      else
      {
         A38Tpmo_Codigo = httpContext.cgiGet( sPrefix+"A38Tpmo_Codigo_PARM") ;
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
      pa472( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws472( ) ;
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
      ws472( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A38Tpmo_Codigo_PARM", A38Tpmo_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA38Tpmo_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A38Tpmo_Codigo_CTRL", GXutil.rtrim( sCtrlA38Tpmo_Codigo));
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
      we472( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414164136");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_tipo_movimientogeneral.js", "?201861414164136");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtTpmo_Codigo_Internalname = sPrefix+"TPMO_CODIGO" ;
      edtTpmo_Descripcion_Internalname = sPrefix+"TPMO_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION" ;
      edtTpmo_AlmacenOrigenId_Internalname = sPrefix+"TPMO_ALMACENORIGENID" ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = sPrefix+"TPMO_ALMACENORIGENDESCRIP" ;
      edtTpmo_AlmacenDestinoId_Internalname = sPrefix+"TPMO_ALMACENDESTINOID" ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = sPrefix+"TPMO_ALMACENDESTINODESCRIP" ;
      cmbTpmo_TipoE_S.setInternalname( sPrefix+"TPMO_TIPOE_S" );
      edtTpmo_UsuarioCrea_Internalname = sPrefix+"TPMO_USUARIOCREA" ;
      edtTpmo_FechaCrea_Internalname = sPrefix+"TPMO_FECHACREA" ;
      edtTpmo_UsuarioModifica_Internalname = sPrefix+"TPMO_USUARIOMODIFICA" ;
      edtTpmo_FechaModifica_Internalname = sPrefix+"TPMO_FECHAMODIFICA" ;
      cmbTpmo_Modulo.setInternalname( sPrefix+"TPMO_MODULO" );
      cmbTpmo_IngresaAredante.setInternalname( sPrefix+"TPMO_INGRESAAREDANTE" );
      cmbTpmo_IngresaCurso.setInternalname( sPrefix+"TPMO_INGRESACURSO" );
      cmbTipo_Tipo.setInternalname( sPrefix+"TIPO_TIPO" );
      edtTpmo_ConsecutivoTrans_Internalname = sPrefix+"TPMO_CONSECUTIVOTRANS" ;
      cmbTpmo_Controlado.setInternalname( sPrefix+"TPMO_CONTROLADO" );
      cmbTpmo_VidaUtil.setInternalname( sPrefix+"TPMO_VIDAUTIL" );
      cmbTpmo_Estado.setInternalname( sPrefix+"TPMO_ESTADO" );
      cmbTpmo_CuentaResponsabilidad.setInternalname( sPrefix+"TPMO_CUENTARESPONSABILIDAD" );
      cmbTpmo_SolicitaRegionDestino.setInternalname( sPrefix+"TPMO_SOLICITAREGIONDESTINO" );
      cmbTpmo_SolicitaCentroDestino.setInternalname( sPrefix+"TPMO_SOLICITACENTRODESTINO" );
      cmbTpmo_ImprimeOrigen.setInternalname( sPrefix+"TPMO_IMPRIMEORIGEN" );
      cmbTpmo_ImprimeDestino.setInternalname( sPrefix+"TPMO_IMPRIMEDESTINO" );
      cmbTmpo_ImprimeResponsable.setInternalname( sPrefix+"TMPO_IMPRIMERESPONSABLE" );
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
      cmbTmpo_ImprimeResponsable.setJsonclick( "" );
      cmbTmpo_ImprimeResponsable.setEnabled( 0 );
      cmbTpmo_ImprimeDestino.setJsonclick( "" );
      cmbTpmo_ImprimeDestino.setEnabled( 0 );
      cmbTpmo_ImprimeOrigen.setJsonclick( "" );
      cmbTpmo_ImprimeOrigen.setEnabled( 0 );
      cmbTpmo_SolicitaCentroDestino.setJsonclick( "" );
      cmbTpmo_SolicitaCentroDestino.setEnabled( 0 );
      cmbTpmo_SolicitaRegionDestino.setJsonclick( "" );
      cmbTpmo_SolicitaRegionDestino.setEnabled( 0 );
      cmbTpmo_CuentaResponsabilidad.setJsonclick( "" );
      cmbTpmo_CuentaResponsabilidad.setEnabled( 0 );
      cmbTpmo_Estado.setJsonclick( "" );
      cmbTpmo_Estado.setEnabled( 0 );
      cmbTpmo_VidaUtil.setJsonclick( "" );
      cmbTpmo_VidaUtil.setEnabled( 0 );
      cmbTpmo_Controlado.setJsonclick( "" );
      cmbTpmo_Controlado.setEnabled( 0 );
      edtTpmo_ConsecutivoTrans_Jsonclick = "" ;
      edtTpmo_ConsecutivoTrans_Enabled = 0 ;
      cmbTipo_Tipo.setJsonclick( "" );
      cmbTipo_Tipo.setEnabled( 0 );
      cmbTpmo_IngresaCurso.setJsonclick( "" );
      cmbTpmo_IngresaCurso.setEnabled( 0 );
      cmbTpmo_IngresaAredante.setJsonclick( "" );
      cmbTpmo_IngresaAredante.setEnabled( 0 );
      cmbTpmo_Modulo.setJsonclick( "" );
      cmbTpmo_Modulo.setEnabled( 0 );
      edtTpmo_FechaModifica_Jsonclick = "" ;
      edtTpmo_FechaModifica_Enabled = 0 ;
      edtTpmo_UsuarioModifica_Jsonclick = "" ;
      edtTpmo_UsuarioModifica_Enabled = 0 ;
      edtTpmo_FechaCrea_Jsonclick = "" ;
      edtTpmo_FechaCrea_Enabled = 0 ;
      edtTpmo_UsuarioCrea_Jsonclick = "" ;
      edtTpmo_UsuarioCrea_Enabled = 0 ;
      cmbTpmo_TipoE_S.setJsonclick( "" );
      cmbTpmo_TipoE_S.setEnabled( 0 );
      edtTpmo_AlmacenDestinoDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoDescrip_Enabled = 0 ;
      edtTpmo_AlmacenDestinoId_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoId_Enabled = 0 ;
      edtTpmo_AlmacenOrigenDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenDescrip_Enabled = 0 ;
      edtTpmo_AlmacenOrigenId_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenId_Enabled = 0 ;
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Enabled = 0 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
      edtTpmo_Descripcion_Jsonclick = "" ;
      edtTpmo_Descripcion_Enabled = 0 ;
      edtTpmo_Codigo_Jsonclick = "" ;
      edtTpmo_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11471',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12471',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',nv:''}],oparms:[]}");
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
      wcpOA38Tpmo_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A38Tpmo_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A313Tpmo_Descripcion = "" ;
      A315Tpmo_TipoE_S = "" ;
      A317Tpmo_UsuarioCrea = "" ;
      A318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A319Tpmo_UsuarioModifica = "" ;
      A320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A316Tpmo_Modulo = "" ;
      A440Tpmo_IngresaAredante = "" ;
      A441Tpmo_IngresaCurso = "" ;
      A633Tpmo_Controlado = "" ;
      A641Tpmo_VidaUtil = "" ;
      A679Tpmo_Estado = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      A705Tpmo_SolicitaRegionDestino = "" ;
      A706Tpmo_SolicitaCentroDestino = "" ;
      A716Tpmo_ImprimeOrigen = "" ;
      A717Tpmo_ImprimeDestino = "" ;
      A718Tmpo_ImprimeResponsable = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A253Tipo_Descripcion = "" ;
      A312Tpmo_AlmacenOrigenDescrip = "" ;
      A314Tpmo_AlmacenDestinoDescrip = "" ;
      A480Tipo_Tipo = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H00472_A38Tpmo_Codigo = new String[] {""} ;
      H00472_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      H00472_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      H00472_A717Tpmo_ImprimeDestino = new String[] {""} ;
      H00472_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      H00472_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      H00472_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      H00472_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      H00472_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      H00472_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      H00472_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      H00472_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      H00472_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      H00472_A679Tpmo_Estado = new String[] {""} ;
      H00472_n679Tpmo_Estado = new boolean[] {false} ;
      H00472_A641Tpmo_VidaUtil = new String[] {""} ;
      H00472_n641Tpmo_VidaUtil = new boolean[] {false} ;
      H00472_A633Tpmo_Controlado = new String[] {""} ;
      H00472_n633Tpmo_Controlado = new boolean[] {false} ;
      H00472_A595Tpmo_ConsecutivoTrans = new long[1] ;
      H00472_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      H00472_A480Tipo_Tipo = new String[] {""} ;
      H00472_A441Tpmo_IngresaCurso = new String[] {""} ;
      H00472_A440Tpmo_IngresaAredante = new String[] {""} ;
      H00472_A316Tpmo_Modulo = new String[] {""} ;
      H00472_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00472_n320Tpmo_FechaModifica = new boolean[] {false} ;
      H00472_A319Tpmo_UsuarioModifica = new String[] {""} ;
      H00472_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      H00472_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00472_A317Tpmo_UsuarioCrea = new String[] {""} ;
      H00472_A315Tpmo_TipoE_S = new String[] {""} ;
      H00472_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      H00472_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      H00472_A40Tpmo_AlmacenDestinoId = new long[1] ;
      H00472_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      H00472_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      H00472_A39Tpmo_AlmacenOrigenId = new long[1] ;
      H00472_A253Tipo_Descripcion = new String[] {""} ;
      H00472_A33Tipo_Codigo = new long[1] ;
      H00472_A313Tpmo_Descripcion = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7Tpmo_Codigo = "" ;
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA38Tpmo_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_movimientogeneral__default(),
         new Object[] {
             new Object[] {
            H00472_A38Tpmo_Codigo, H00472_A718Tmpo_ImprimeResponsable, H00472_n718Tmpo_ImprimeResponsable, H00472_A717Tpmo_ImprimeDestino, H00472_n717Tpmo_ImprimeDestino, H00472_A716Tpmo_ImprimeOrigen, H00472_n716Tpmo_ImprimeOrigen, H00472_A706Tpmo_SolicitaCentroDestino, H00472_n706Tpmo_SolicitaCentroDestino, H00472_A705Tpmo_SolicitaRegionDestino,
            H00472_n705Tpmo_SolicitaRegionDestino, H00472_A680Tpmo_CuentaResponsabilidad, H00472_n680Tpmo_CuentaResponsabilidad, H00472_A679Tpmo_Estado, H00472_n679Tpmo_Estado, H00472_A641Tpmo_VidaUtil, H00472_n641Tpmo_VidaUtil, H00472_A633Tpmo_Controlado, H00472_n633Tpmo_Controlado, H00472_A595Tpmo_ConsecutivoTrans,
            H00472_n595Tpmo_ConsecutivoTrans, H00472_A480Tipo_Tipo, H00472_A441Tpmo_IngresaCurso, H00472_A440Tpmo_IngresaAredante, H00472_A316Tpmo_Modulo, H00472_A320Tpmo_FechaModifica, H00472_n320Tpmo_FechaModifica, H00472_A319Tpmo_UsuarioModifica, H00472_n319Tpmo_UsuarioModifica, H00472_A318Tpmo_FechaCrea,
            H00472_A317Tpmo_UsuarioCrea, H00472_A315Tpmo_TipoE_S, H00472_A314Tpmo_AlmacenDestinoDescrip, H00472_n314Tpmo_AlmacenDestinoDescrip, H00472_A40Tpmo_AlmacenDestinoId, H00472_A312Tpmo_AlmacenOrigenDescrip, H00472_n312Tpmo_AlmacenOrigenDescrip, H00472_A39Tpmo_AlmacenOrigenId, H00472_A253Tipo_Descripcion, H00472_A33Tipo_Codigo,
            H00472_A313Tpmo_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_TIPO_MOVIMIENTOGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_MOVIMIENTOGeneral" ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtTpmo_Codigo_Enabled ;
   private int edtTpmo_Descripcion_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int edtTipo_Descripcion_Enabled ;
   private int edtTpmo_AlmacenOrigenId_Enabled ;
   private int edtTpmo_AlmacenOrigenDescrip_Enabled ;
   private int edtTpmo_AlmacenDestinoId_Enabled ;
   private int edtTpmo_AlmacenDestinoDescrip_Enabled ;
   private int edtTpmo_UsuarioCrea_Enabled ;
   private int edtTpmo_FechaCrea_Enabled ;
   private int edtTpmo_UsuarioModifica_Enabled ;
   private int edtTpmo_FechaModifica_Enabled ;
   private int edtTpmo_ConsecutivoTrans_Enabled ;
   private int idxLst ;
   private long A33Tipo_Codigo ;
   private long A39Tpmo_AlmacenOrigenId ;
   private long A40Tpmo_AlmacenDestinoId ;
   private long A595Tpmo_ConsecutivoTrans ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A679Tpmo_Estado ;
   private String GXKey ;
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
   private String edtTpmo_Codigo_Internalname ;
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtTpmo_Descripcion_Internalname ;
   private String edtTpmo_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtTpmo_AlmacenOrigenId_Internalname ;
   private String edtTpmo_AlmacenOrigenId_Jsonclick ;
   private String edtTpmo_AlmacenOrigenDescrip_Internalname ;
   private String edtTpmo_AlmacenOrigenDescrip_Jsonclick ;
   private String edtTpmo_AlmacenDestinoId_Internalname ;
   private String edtTpmo_AlmacenDestinoId_Jsonclick ;
   private String edtTpmo_AlmacenDestinoDescrip_Internalname ;
   private String edtTpmo_AlmacenDestinoDescrip_Jsonclick ;
   private String edtTpmo_UsuarioCrea_Internalname ;
   private String edtTpmo_UsuarioCrea_Jsonclick ;
   private String edtTpmo_FechaCrea_Internalname ;
   private String edtTpmo_FechaCrea_Jsonclick ;
   private String edtTpmo_UsuarioModifica_Internalname ;
   private String edtTpmo_UsuarioModifica_Jsonclick ;
   private String edtTpmo_FechaModifica_Internalname ;
   private String edtTpmo_FechaModifica_Jsonclick ;
   private String A480Tipo_Tipo ;
   private String edtTpmo_ConsecutivoTrans_Internalname ;
   private String edtTpmo_ConsecutivoTrans_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA38Tpmo_Codigo ;
   private java.util.Date A318Tpmo_FechaCrea ;
   private java.util.Date A320Tpmo_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n633Tpmo_Controlado ;
   private boolean n641Tpmo_VidaUtil ;
   private boolean n679Tpmo_Estado ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean n705Tpmo_SolicitaRegionDestino ;
   private boolean n706Tpmo_SolicitaCentroDestino ;
   private boolean n716Tpmo_ImprimeOrigen ;
   private boolean n717Tpmo_ImprimeDestino ;
   private boolean n718Tmpo_ImprimeResponsable ;
   private boolean n595Tpmo_ConsecutivoTrans ;
   private boolean n320Tpmo_FechaModifica ;
   private boolean n319Tpmo_UsuarioModifica ;
   private boolean n314Tpmo_AlmacenDestinoDescrip ;
   private boolean n312Tpmo_AlmacenOrigenDescrip ;
   private boolean returnInSub ;
   private String wcpOA38Tpmo_Codigo ;
   private String A38Tpmo_Codigo ;
   private String A313Tpmo_Descripcion ;
   private String A315Tpmo_TipoE_S ;
   private String A317Tpmo_UsuarioCrea ;
   private String A319Tpmo_UsuarioModifica ;
   private String A316Tpmo_Modulo ;
   private String A440Tpmo_IngresaAredante ;
   private String A441Tpmo_IngresaCurso ;
   private String A633Tpmo_Controlado ;
   private String A641Tpmo_VidaUtil ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String A705Tpmo_SolicitaRegionDestino ;
   private String A706Tpmo_SolicitaCentroDestino ;
   private String A716Tpmo_ImprimeOrigen ;
   private String A717Tpmo_ImprimeDestino ;
   private String A718Tmpo_ImprimeResponsable ;
   private String A253Tipo_Descripcion ;
   private String A312Tpmo_AlmacenOrigenDescrip ;
   private String A314Tpmo_AlmacenDestinoDescrip ;
   private String AV7Tpmo_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbTpmo_TipoE_S ;
   private HTMLChoice cmbTpmo_Modulo ;
   private HTMLChoice cmbTpmo_IngresaAredante ;
   private HTMLChoice cmbTpmo_IngresaCurso ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTpmo_Controlado ;
   private HTMLChoice cmbTpmo_VidaUtil ;
   private HTMLChoice cmbTpmo_Estado ;
   private HTMLChoice cmbTpmo_CuentaResponsabilidad ;
   private HTMLChoice cmbTpmo_SolicitaRegionDestino ;
   private HTMLChoice cmbTpmo_SolicitaCentroDestino ;
   private HTMLChoice cmbTpmo_ImprimeOrigen ;
   private HTMLChoice cmbTpmo_ImprimeDestino ;
   private HTMLChoice cmbTmpo_ImprimeResponsable ;
   private IDataStoreProvider pr_default ;
   private String[] H00472_A38Tpmo_Codigo ;
   private String[] H00472_A718Tmpo_ImprimeResponsable ;
   private boolean[] H00472_n718Tmpo_ImprimeResponsable ;
   private String[] H00472_A717Tpmo_ImprimeDestino ;
   private boolean[] H00472_n717Tpmo_ImprimeDestino ;
   private String[] H00472_A716Tpmo_ImprimeOrigen ;
   private boolean[] H00472_n716Tpmo_ImprimeOrigen ;
   private String[] H00472_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] H00472_n706Tpmo_SolicitaCentroDestino ;
   private String[] H00472_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] H00472_n705Tpmo_SolicitaRegionDestino ;
   private String[] H00472_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] H00472_n680Tpmo_CuentaResponsabilidad ;
   private String[] H00472_A679Tpmo_Estado ;
   private boolean[] H00472_n679Tpmo_Estado ;
   private String[] H00472_A641Tpmo_VidaUtil ;
   private boolean[] H00472_n641Tpmo_VidaUtil ;
   private String[] H00472_A633Tpmo_Controlado ;
   private boolean[] H00472_n633Tpmo_Controlado ;
   private long[] H00472_A595Tpmo_ConsecutivoTrans ;
   private boolean[] H00472_n595Tpmo_ConsecutivoTrans ;
   private String[] H00472_A480Tipo_Tipo ;
   private String[] H00472_A441Tpmo_IngresaCurso ;
   private String[] H00472_A440Tpmo_IngresaAredante ;
   private String[] H00472_A316Tpmo_Modulo ;
   private java.util.Date[] H00472_A320Tpmo_FechaModifica ;
   private boolean[] H00472_n320Tpmo_FechaModifica ;
   private String[] H00472_A319Tpmo_UsuarioModifica ;
   private boolean[] H00472_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] H00472_A318Tpmo_FechaCrea ;
   private String[] H00472_A317Tpmo_UsuarioCrea ;
   private String[] H00472_A315Tpmo_TipoE_S ;
   private String[] H00472_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] H00472_n314Tpmo_AlmacenDestinoDescrip ;
   private long[] H00472_A40Tpmo_AlmacenDestinoId ;
   private String[] H00472_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] H00472_n312Tpmo_AlmacenOrigenDescrip ;
   private long[] H00472_A39Tpmo_AlmacenOrigenId ;
   private String[] H00472_A253Tipo_Descripcion ;
   private long[] H00472_A33Tipo_Codigo ;
   private String[] H00472_A313Tpmo_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_tipo_movimientogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00472", "SELECT T1.Tpmo_Codigo, T1.Tmpo_ImprimeResponsable, T1.Tpmo_ImprimeDestino, T1.Tpmo_ImprimeOrigen, T1.Tpmo_SolicitaCentroDestino, T1.Tpmo_SolicitaRegionDestino, T1.Tpmo_CuentaResponsabilidad, T1.Tpmo_Estado, T1.Tpmo_VidaUtil, T1.Tpmo_Controlado, T1.Tpmo_ConsecutivoTrans, T4.Tipo_Tipo, T1.Tpmo_IngresaCurso, T1.Tpmo_IngresaAredante, T1.Tpmo_Modulo, T1.Tpmo_FechaModifica, T1.Tpmo_UsuarioModifica, T1.Tpmo_FechaCrea, T1.Tpmo_UsuarioCrea, T1.Tpmo_TipoE_S, T2.Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip, T1.Tpmo_AlmacenDestinoId AS Tpmo_AlmacenDestinoId, T3.Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip, T1.Tpmo_AlmacenOrigenId AS Tpmo_AlmacenOrigenId, T4.Tipo_Descripcion, T1.Tipo_Codigo, T1.Tpmo_Descripcion FROM (((ALM_TIPO_MOVIMIENTO T1 INNER JOIN ALM_TIPO_ALMACEN T2 ON T2.Tpal_Id = T1.Tpmo_AlmacenDestinoId) INNER JOIN ALM_TIPO_ALMACEN T3 ON T3.Tpal_Id = T1.Tpmo_AlmacenOrigenId) INNER JOIN ALM_TIPO_ELEMENTO T4 ON T4.Tipo_Codigo = T1.Tipo_Codigo) WHERE T1.Tpmo_Codigo = ? ORDER BY T1.Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[32])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(22) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(24) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(25) ;
               ((long[]) buf[39])[0] = rslt.getLong(26) ;
               ((String[]) buf[40])[0] = rslt.getVarchar(27) ;
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

