/*
               File: alm_inventario_devolutivogeneral_impl
        Description: ALM_INVENTARIO_DEVOLUTIVOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:27.19
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

public final  class alm_inventario_devolutivogeneral_impl extends GXWebComponent
{
   public alm_inventario_devolutivogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inventario_devolutivogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inventario_devolutivogeneral_impl.class ));
   }

   public alm_inventario_devolutivogeneral_impl( int remoteHandle ,
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
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
      cmbInvd_EntidadGobierno = new HTMLChoice();
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
               A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A67Invd_NumeroPlaca,A66Elem_Consecutivo});
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
         pa2D2( ) ;
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
         httpContext.writeValue( "ALM_INVENTARIO_DEVOLUTIVOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414152725");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inventario_devolutivogeneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A67Invd_NumeroPlaca)) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA67Invd_NumeroPlaca", wcpOA67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA66Elem_Consecutivo", wcpOA66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_REGIONALID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_BODEGACODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_VALORADQUISICION", getSecureSignedToken( sPrefix, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( sPrefix, A466Invd_FechaAdquisicion));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_FECHASERVICIO", getSecureSignedToken( sPrefix, A467Invd_FechaServicio));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ESPLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_DESMANTE", getSecureSignedToken( sPrefix, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_VF", getSecureSignedToken( sPrefix, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_I", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VARIABLE_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( sPrefix, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( sPrefix, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_INICIAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A818Invd_PlacaRecuperada, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_inventario_devolutivogeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm2D2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_inventario_devolutivogeneral.js", "?201861414152731");
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
      return "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
   }

   public void wb2D0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_inventario_devolutivogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112d1_client"+"'", TempTags, "", 2, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e122d1_client"+"'", TempTags, "", 2, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_NumeroPlaca_Internalname, "de Placa", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_NumeroPlaca_Internalname, A67Invd_NumeroPlaca, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_NumeroPlaca_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_NumeroPlaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_RegionalId_Internalname, "Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_RegionalId_Internalname, GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")), ((edtInvd_RegionalId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_RegionalId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_RegionalId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_CentroCostoId_Internalname, "Centro Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_CentroCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")), ((edtInvd_CentroCostoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_CentroCostoId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_CentroCostoId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_ModuloAlmacen.getInternalname(), "Almacen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_ModuloAlmacen, cmbInvd_ModuloAlmacen.getInternalname(), GXutil.rtrim( A412Invd_ModuloAlmacen), 1, cmbInvd_ModuloAlmacen.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_ModuloAlmacen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_AlmacenCodigo_Internalname, "Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_AlmacenCodigo_Internalname, A413Invd_AlmacenCodigo, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_AlmacenCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_AlmacenCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_BodegaCodigo_Internalname, "Bodega", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_BodegaCodigo_Internalname, A414Invd_BodegaCodigo, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_BodegaCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_BodegaCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_Estado, cmbInvd_Estado.getInternalname(), GXutil.rtrim( A463Invd_Estado), 1, cmbInvd_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_ValorAdquisicion_Internalname, "Adquisicion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_ValorAdquisicion_Internalname, GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ",", "")), ((edtInvd_ValorAdquisicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_ValorAdquisicion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_ValorAdquisicion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_FechaAdquisicion_Internalname, "Adquisicion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtInvd_FechaAdquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_FechaAdquisicion_Internalname, localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"), localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_FechaAdquisicion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_FechaAdquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtInvd_FechaAdquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInvd_FechaAdquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_PlacaPadre_Internalname, "Padre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_PlacaPadre_Internalname, A68Invd_PlacaPadre, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_PlacaPadre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_PlacaPadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_FechaServicio_Internalname, "Servicio", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtInvd_FechaServicio_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_FechaServicio_Internalname, localUtil.format(A467Invd_FechaServicio, "99/99/99"), localUtil.format( A467Invd_FechaServicio, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_FechaServicio_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_FechaServicio_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtInvd_FechaServicio_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInvd_FechaServicio_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_EsPlacaPadre_Internalname, "Placa Padre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_EsPlacaPadre_Internalname, GXutil.rtrim( A501Invd_EsPlacaPadre), GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_EsPlacaPadre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_EsPlacaPadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Descripcion_Internalname, "Descripción del bien", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, edtCata_Descripcion_Link, "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Identificacion_Internalname, "Identificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Identificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Identificacion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Identificacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Identificacion_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Desmante_Internalname, "Desmantelamiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Desmante_Internalname, GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Desmante_Enabled!=0) ? GXutil.ltrim( localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Desmante_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCosto_Desmante_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_VF_Internalname, "futuro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_VF_Internalname, GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ",", "")), ((edtVariable_VF_Enabled!=0) ? GXutil.ltrim( localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_VF_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVariable_VF_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_I_Internalname, "Interes", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_I_Internalname, GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")), ((edtVariable_I_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_I_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVariable_I_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_N_Internalname, "Tiempo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_N_Internalname, GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")), ((edtVariable_N_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_N_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVariable_N_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOtros_Costos_Dev_Internalname, "Costos Devolutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOtros_Costos_Dev_Internalname, GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ",", "")), ((edtOtros_Costos_Dev_Enabled!=0) ? GXutil.ltrim( localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOtros_Costos_Dev_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOtros_Costos_Dev_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Total_Dev_Internalname, "Total Devolutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Total_Dev_Internalname, GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Total_Dev_Enabled!=0) ? GXutil.ltrim( localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Total_Dev_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCosto_Total_Dev_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Inicial_Internalname, "Util Inicial", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Inicial_Internalname, GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Inicial_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Inicial_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVida_Util_Inicial_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Actual_Internalname, "Util Actual", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Actual_Internalname, GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Actual_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Actual_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVida_Util_Actual_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Codigo_Internalname, "Código Clase", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtClas_Codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Descripcion_Internalname, "Descripción Clase", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtClas_Descripcion_Link, "", "", "", edtClas_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Nombre Cuentadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCuen_Nombre_Link, "", "", "", edtCuen_Nombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Cedula_Internalname, "Cuentadante Cedula", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Cedula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_AreadanteCodigo_Internalname, "Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_AreadanteCodigo_Internalname, A711Invd_AreadanteCodigo, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_AreadanteCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_AreadanteCodigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_PlacaRecuperada_Internalname, "Recuperada", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_PlacaRecuperada_Internalname, A818Invd_PlacaRecuperada, GXutil.rtrim( localUtil.format( A818Invd_PlacaRecuperada, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_PlacaRecuperada_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtInvd_PlacaRecuperada_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_EntidadGobierno.getInternalname(), "de Gobierno", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_EntidadGobierno, cmbInvd_EntidadGobierno.getInternalname(), GXutil.rtrim( A858Invd_EntidadGobierno), 1, cmbInvd_EntidadGobierno.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_EntidadGobierno.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVOGeneral.htm");
         cmbInvd_EntidadGobierno.setValue( GXutil.rtrim( A858Invd_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbInvd_EntidadGobierno.getInternalname(), "Values", cmbInvd_EntidadGobierno.ToJavascriptSource(), true);
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

   public void start2D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_INVENTARIO_DEVOLUTIVOGeneral", (short)(0)) ;
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
            strup2D0( ) ;
         }
      }
   }

   public void ws2D2( )
   {
      start2D2( ) ;
      evt2D2( ) ;
   }

   public void evt2D2( )
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
                              strup2D0( ) ;
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
                              strup2D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e132D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e142D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D0( ) ;
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
                              strup2D0( ) ;
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

   public void we2D2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2D2( ) ;
         }
      }
   }

   public void pa2D2( )
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
         cmbInvd_ModuloAlmacen.setName( "INVD_MODULOALMACEN" );
         cmbInvd_ModuloAlmacen.setWebtags( "" );
         cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
         {
            A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         }
         cmbInvd_Estado.setName( "INVD_ESTADO" );
         cmbInvd_Estado.setWebtags( "" );
         cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
         cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
         if ( cmbInvd_Estado.getItemCount() > 0 )
         {
            A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
            n463Invd_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A463Invd_Estado", A463Invd_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         }
         cmbInvd_EntidadGobierno.setName( "INVD_ENTIDADGOBIERNO" );
         cmbInvd_EntidadGobierno.setWebtags( "" );
         cmbInvd_EntidadGobierno.addItem("", "", (short)(0));
         cmbInvd_EntidadGobierno.addItem("SI", "SI", (short)(0));
         cmbInvd_EntidadGobierno.addItem("NO", "NO", (short)(0));
         if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
         {
            A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
            n858Invd_EntidadGobierno = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
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
      if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
      {
         A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      }
      if ( cmbInvd_Estado.getItemCount() > 0 )
      {
         A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
         n463Invd_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A463Invd_Estado", A463Invd_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      }
      if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
      {
         A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
         n858Invd_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2D2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf2D2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H002D2 */
         pr_default.execute(0, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A858Invd_EntidadGobierno = H002D2_A858Invd_EntidadGobierno[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
            n858Invd_EntidadGobierno = H002D2_n858Invd_EntidadGobierno[0] ;
            A818Invd_PlacaRecuperada = H002D2_A818Invd_PlacaRecuperada[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A818Invd_PlacaRecuperada, ""))));
            n818Invd_PlacaRecuperada = H002D2_n818Invd_PlacaRecuperada[0] ;
            A711Invd_AreadanteCodigo = H002D2_A711Invd_AreadanteCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, ""))));
            n711Invd_AreadanteCodigo = H002D2_n711Invd_AreadanteCodigo[0] ;
            A688Cuen_Cedula = H002D2_A688Cuen_Cedula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            A44Cuen_Nombre = H002D2_A44Cuen_Nombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44Cuen_Nombre", A44Cuen_Nombre);
            n44Cuen_Nombre = H002D2_n44Cuen_Nombre[0] ;
            A631Vida_Util_Actual = H002D2_A631Vida_Util_Actual[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
            n631Vida_Util_Actual = H002D2_n631Vida_Util_Actual[0] ;
            A630Vida_Util_Inicial = H002D2_A630Vida_Util_Inicial[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VIDA_UTIL_INICIAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
            n630Vida_Util_Inicial = H002D2_n630Vida_Util_Inicial[0] ;
            A629Costo_Total_Dev = H002D2_A629Costo_Total_Dev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( sPrefix, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            A628Otros_Costos_Dev = H002D2_A628Otros_Costos_Dev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( sPrefix, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n628Otros_Costos_Dev = H002D2_n628Otros_Costos_Dev[0] ;
            A627Variable_N = H002D2_A627Variable_N[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
            n627Variable_N = H002D2_n627Variable_N[0] ;
            A626Variable_I = H002D2_A626Variable_I[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_I", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
            n626Variable_I = H002D2_n626Variable_I[0] ;
            A625Variable_VF = H002D2_A625Variable_VF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_VF", getSecureSignedToken( sPrefix, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n625Variable_VF = H002D2_n625Variable_VF[0] ;
            A624Costo_Desmante = H002D2_A624Costo_Desmante[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_DESMANTE", getSecureSignedToken( sPrefix, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n624Costo_Desmante = H002D2_n624Costo_Desmante[0] ;
            A43Cuen_Identificacion = H002D2_A43Cuen_Identificacion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
            n43Cuen_Identificacion = H002D2_n43Cuen_Identificacion[0] ;
            A501Invd_EsPlacaPadre = H002D2_A501Invd_EsPlacaPadre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESPLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
            n501Invd_EsPlacaPadre = H002D2_n501Invd_EsPlacaPadre[0] ;
            A467Invd_FechaServicio = H002D2_A467Invd_FechaServicio[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_FECHASERVICIO", getSecureSignedToken( sPrefix, A467Invd_FechaServicio));
            n467Invd_FechaServicio = H002D2_n467Invd_FechaServicio[0] ;
            A68Invd_PlacaPadre = H002D2_A68Invd_PlacaPadre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
            n68Invd_PlacaPadre = H002D2_n68Invd_PlacaPadre[0] ;
            A466Invd_FechaAdquisicion = H002D2_A466Invd_FechaAdquisicion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( sPrefix, A466Invd_FechaAdquisicion));
            n466Invd_FechaAdquisicion = H002D2_n466Invd_FechaAdquisicion[0] ;
            A465Invd_ValorAdquisicion = H002D2_A465Invd_ValorAdquisicion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_VALORADQUISICION", getSecureSignedToken( sPrefix, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
            n465Invd_ValorAdquisicion = H002D2_n465Invd_ValorAdquisicion[0] ;
            A463Invd_Estado = H002D2_A463Invd_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A463Invd_Estado", A463Invd_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
            n463Invd_Estado = H002D2_n463Invd_Estado[0] ;
            A414Invd_BodegaCodigo = H002D2_A414Invd_BodegaCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_BODEGACODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
            A413Invd_AlmacenCodigo = H002D2_A413Invd_AlmacenCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
            A412Invd_ModuloAlmacen = H002D2_A412Invd_ModuloAlmacen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
            A411Invd_CentroCostoId = H002D2_A411Invd_CentroCostoId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
            A410Invd_RegionalId = H002D2_A410Invd_RegionalId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_REGIONALID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
            A688Cuen_Cedula = H002D2_A688Cuen_Cedula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            A44Cuen_Nombre = H002D2_A44Cuen_Nombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44Cuen_Nombre", A44Cuen_Nombre);
            n44Cuen_Nombre = H002D2_n44Cuen_Nombre[0] ;
            /* Execute user event: Load */
            e142D2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb2D0( ) ;
      }
   }

   public void strup2D0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H002D3 */
      pr_default.execute(1, new Object[] {A66Elem_Consecutivo});
      A37Cata_Codigo = H002D3_A37Cata_Codigo[0] ;
      A33Tipo_Codigo = H002D3_A33Tipo_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      pr_default.close(1);
      /* Using cursor H002D4 */
      pr_default.execute(2, new Object[] {A37Cata_Codigo});
      A34Clas_Codigo = H002D4_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34Clas_Codigo", A34Clas_Codigo);
      A298Cata_Descripcion = H002D4_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
      pr_default.close(2);
      /* Using cursor H002D5 */
      pr_default.execute(3, new Object[] {A34Clas_Codigo});
      A291Clas_Descripcion = H002D5_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A291Clas_Descripcion", A291Clas_Descripcion);
      pr_default.close(3);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_REGIONALID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
         A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_BODEGACODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
         A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
         n463Invd_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A463Invd_Estado", A463Invd_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         A465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)) ;
         n465Invd_ValorAdquisicion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_VALORADQUISICION", getSecureSignedToken( sPrefix, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A466Invd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 0)) ;
         n466Invd_FechaAdquisicion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( sPrefix, A466Invd_FechaAdquisicion));
         A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
         n68Invd_PlacaPadre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_PLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
         A467Invd_FechaServicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaServicio_Internalname), 0)) ;
         n467Invd_FechaServicio = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_FECHASERVICIO", getSecureSignedToken( sPrefix, A467Invd_FechaServicio));
         A501Invd_EsPlacaPadre = httpContext.cgiGet( edtInvd_EsPlacaPadre_Internalname) ;
         n501Invd_EsPlacaPadre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ESPLACAPADRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
         A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         A624Costo_Desmante = localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)) ;
         n624Costo_Desmante = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_DESMANTE", getSecureSignedToken( sPrefix, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A625Variable_VF = localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)) ;
         n625Variable_VF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_VF", getSecureSignedToken( sPrefix, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
         n626Variable_I = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_I", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
         A627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".")) ;
         n627Variable_N = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VARIABLE_N", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
         A628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)) ;
         n628Otros_Costos_Dev = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( sPrefix, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( sPrefix, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         A630Vida_Util_Inicial = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".")) ;
         n630Vida_Util_Inicial = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VIDA_UTIL_INICIAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
         A631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".")) ;
         n631Vida_Util_Actual = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
         A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34Clas_Codigo", A34Clas_Codigo);
         A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
         n44Cuen_Nombre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44Cuen_Nombre", A44Cuen_Nombre);
         A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A711Invd_AreadanteCodigo = httpContext.cgiGet( edtInvd_AreadanteCodigo_Internalname) ;
         n711Invd_AreadanteCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_AREADANTECODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, ""))));
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A818Invd_PlacaRecuperada = httpContext.cgiGet( edtInvd_PlacaRecuperada_Internalname) ;
         n818Invd_PlacaRecuperada = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_PLACARECUPERADA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A818Invd_PlacaRecuperada, ""))));
         cmbInvd_EntidadGobierno.setValue( httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) );
         A858Invd_EntidadGobierno = httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) ;
         n858Invd_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_INVD_ENTIDADGOBIERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A858Invd_EntidadGobierno, ""))));
         /* Read saved values. */
         wcpOA67Invd_NumeroPlaca = httpContext.cgiGet( sPrefix+"wcpOA67Invd_NumeroPlaca") ;
         wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
         A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_inventario_devolutivogeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e132D2 ();
      if (returnInSub) return;
   }

   public void e132D2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e142D2( )
   {
      /* Load Routine */
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCata_Descripcion_Internalname, "Link", edtCata_Descripcion_Link, true);
      edtClas_Descripcion_Link = formatLink("com.orions2.viewalm_clase") + "?" + GXutil.URLEncode(GXutil.rtrim(A34Clas_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtClas_Descripcion_Internalname, "Link", edtClas_Descripcion_Link, true);
      edtCuen_Nombre_Link = formatLink("com.orions2.viewalm_cuentadante") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCuen_Nombre_Internalname, "Link", edtCuen_Nombre_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV9TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_INVENTARIO_DEVOLUTIVO" );
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Invd_NumeroPlaca" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Invd_NumeroPlaca );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Elem_Consecutivo" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV8Elem_Consecutivo );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV11Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A67Invd_NumeroPlaca = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      A66Elem_Consecutivo = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
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
      pa2D2( ) ;
      ws2D2( ) ;
      we2D2( ) ;
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
      sCtrlA67Invd_NumeroPlaca = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA66Elem_Consecutivo = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2D2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_inventario_devolutivogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa2D2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A67Invd_NumeroPlaca = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
         A66Elem_Consecutivo = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      wcpOA67Invd_NumeroPlaca = httpContext.cgiGet( sPrefix+"wcpOA67Invd_NumeroPlaca") ;
      wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A67Invd_NumeroPlaca, wcpOA67Invd_NumeroPlaca) != 0 ) || ( GXutil.strcmp(A66Elem_Consecutivo, wcpOA66Elem_Consecutivo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA67Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
      wcpOA66Elem_Consecutivo = A66Elem_Consecutivo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA67Invd_NumeroPlaca = httpContext.cgiGet( sPrefix+"A67Invd_NumeroPlaca_CTRL") ;
      if ( GXutil.len( sCtrlA67Invd_NumeroPlaca) > 0 )
      {
         A67Invd_NumeroPlaca = httpContext.cgiGet( sCtrlA67Invd_NumeroPlaca) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      }
      else
      {
         A67Invd_NumeroPlaca = httpContext.cgiGet( sPrefix+"A67Invd_NumeroPlaca_PARM") ;
      }
      sCtrlA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"A66Elem_Consecutivo_CTRL") ;
      if ( GXutil.len( sCtrlA66Elem_Consecutivo) > 0 )
      {
         A66Elem_Consecutivo = httpContext.cgiGet( sCtrlA66Elem_Consecutivo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      else
      {
         A66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"A66Elem_Consecutivo_PARM") ;
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
      pa2D2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2D2( ) ;
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
      ws2D2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A67Invd_NumeroPlaca_PARM", A67Invd_NumeroPlaca);
      if ( GXutil.len( GXutil.rtrim( sCtrlA67Invd_NumeroPlaca)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A67Invd_NumeroPlaca_CTRL", GXutil.rtrim( sCtrlA67Invd_NumeroPlaca));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A66Elem_Consecutivo_PARM", A66Elem_Consecutivo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA66Elem_Consecutivo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A66Elem_Consecutivo_CTRL", GXutil.rtrim( sCtrlA66Elem_Consecutivo));
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
      we2D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414152928");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_inventario_devolutivogeneral.js", "?201861414152928");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtInvd_NumeroPlaca_Internalname = sPrefix+"INVD_NUMEROPLACA" ;
      edtInvd_RegionalId_Internalname = sPrefix+"INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = sPrefix+"INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( sPrefix+"INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = sPrefix+"INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = sPrefix+"INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( sPrefix+"INVD_ESTADO" );
      edtInvd_ValorAdquisicion_Internalname = sPrefix+"INVD_VALORADQUISICION" ;
      edtInvd_FechaAdquisicion_Internalname = sPrefix+"INVD_FECHAADQUISICION" ;
      edtInvd_PlacaPadre_Internalname = sPrefix+"INVD_PLACAPADRE" ;
      edtInvd_FechaServicio_Internalname = sPrefix+"INVD_FECHASERVICIO" ;
      edtInvd_EsPlacaPadre_Internalname = sPrefix+"INVD_ESPLACAPADRE" ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION" ;
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION" ;
      edtCosto_Desmante_Internalname = sPrefix+"COSTO_DESMANTE" ;
      edtVariable_VF_Internalname = sPrefix+"VARIABLE_VF" ;
      edtVariable_I_Internalname = sPrefix+"VARIABLE_I" ;
      edtVariable_N_Internalname = sPrefix+"VARIABLE_N" ;
      edtOtros_Costos_Dev_Internalname = sPrefix+"OTROS_COSTOS_DEV" ;
      edtCosto_Total_Dev_Internalname = sPrefix+"COSTO_TOTAL_DEV" ;
      edtVida_Util_Inicial_Internalname = sPrefix+"VIDA_UTIL_INICIAL" ;
      edtVida_Util_Actual_Internalname = sPrefix+"VIDA_UTIL_ACTUAL" ;
      edtClas_Codigo_Internalname = sPrefix+"CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = sPrefix+"CLAS_DESCRIPCION" ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE" ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA" ;
      edtInvd_AreadanteCodigo_Internalname = sPrefix+"INVD_AREADANTECODIGO" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtInvd_PlacaRecuperada_Internalname = sPrefix+"INVD_PLACARECUPERADA" ;
      cmbInvd_EntidadGobierno.setInternalname( sPrefix+"INVD_ENTIDADGOBIERNO" );
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
      cmbInvd_EntidadGobierno.setJsonclick( "" );
      cmbInvd_EntidadGobierno.setEnabled( 0 );
      edtInvd_PlacaRecuperada_Jsonclick = "" ;
      edtInvd_PlacaRecuperada_Enabled = 0 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
      edtInvd_AreadanteCodigo_Jsonclick = "" ;
      edtInvd_AreadanteCodigo_Enabled = 0 ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Cedula_Enabled = 0 ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Link = "" ;
      edtCuen_Nombre_Enabled = 0 ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Link = "" ;
      edtClas_Descripcion_Enabled = 0 ;
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 0 ;
      edtVida_Util_Actual_Jsonclick = "" ;
      edtVida_Util_Actual_Enabled = 0 ;
      edtVida_Util_Inicial_Jsonclick = "" ;
      edtVida_Util_Inicial_Enabled = 0 ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtCosto_Total_Dev_Enabled = 0 ;
      edtOtros_Costos_Dev_Jsonclick = "" ;
      edtOtros_Costos_Dev_Enabled = 0 ;
      edtVariable_N_Jsonclick = "" ;
      edtVariable_N_Enabled = 0 ;
      edtVariable_I_Jsonclick = "" ;
      edtVariable_I_Enabled = 0 ;
      edtVariable_VF_Jsonclick = "" ;
      edtVariable_VF_Enabled = 0 ;
      edtCosto_Desmante_Jsonclick = "" ;
      edtCosto_Desmante_Enabled = 0 ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtCuen_Identificacion_Enabled = 0 ;
      edtCata_Descripcion_Link = "" ;
      edtCata_Descripcion_Enabled = 0 ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
      edtInvd_EsPlacaPadre_Jsonclick = "" ;
      edtInvd_EsPlacaPadre_Enabled = 0 ;
      edtInvd_FechaServicio_Jsonclick = "" ;
      edtInvd_FechaServicio_Enabled = 0 ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtInvd_PlacaPadre_Enabled = 0 ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtInvd_FechaAdquisicion_Enabled = 0 ;
      edtInvd_ValorAdquisicion_Jsonclick = "" ;
      edtInvd_ValorAdquisicion_Enabled = 0 ;
      cmbInvd_Estado.setJsonclick( "" );
      cmbInvd_Estado.setEnabled( 0 );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_BodegaCodigo_Enabled = 0 ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Enabled = 0 ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      cmbInvd_ModuloAlmacen.setEnabled( 0 );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_CentroCostoId_Enabled = 0 ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtInvd_RegionalId_Enabled = 0 ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e112D1',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e122D1',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''}],oparms:[]}");
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
      wcpOA67Invd_NumeroPlaca = "" ;
      wcpOA66Elem_Consecutivo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A68Invd_PlacaPadre = "" ;
      A467Invd_FechaServicio = GXutil.nullDate() ;
      A501Invd_EsPlacaPadre = "" ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A711Invd_AreadanteCodigo = "" ;
      A818Invd_PlacaRecuperada = "" ;
      A858Invd_EntidadGobierno = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A298Cata_Descripcion = "" ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      A44Cuen_Nombre = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H002D2_A66Elem_Consecutivo = new String[] {""} ;
      H002D2_A67Invd_NumeroPlaca = new String[] {""} ;
      H002D2_A37Cata_Codigo = new String[] {""} ;
      H002D2_A858Invd_EntidadGobierno = new String[] {""} ;
      H002D2_n858Invd_EntidadGobierno = new boolean[] {false} ;
      H002D2_A818Invd_PlacaRecuperada = new String[] {""} ;
      H002D2_n818Invd_PlacaRecuperada = new boolean[] {false} ;
      H002D2_A33Tipo_Codigo = new long[1] ;
      H002D2_A711Invd_AreadanteCodigo = new String[] {""} ;
      H002D2_n711Invd_AreadanteCodigo = new boolean[] {false} ;
      H002D2_A688Cuen_Cedula = new long[1] ;
      H002D2_A44Cuen_Nombre = new String[] {""} ;
      H002D2_n44Cuen_Nombre = new boolean[] {false} ;
      H002D2_A291Clas_Descripcion = new String[] {""} ;
      H002D2_A34Clas_Codigo = new String[] {""} ;
      H002D2_A631Vida_Util_Actual = new short[1] ;
      H002D2_n631Vida_Util_Actual = new boolean[] {false} ;
      H002D2_A630Vida_Util_Inicial = new short[1] ;
      H002D2_n630Vida_Util_Inicial = new boolean[] {false} ;
      H002D2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002D2_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002D2_n628Otros_Costos_Dev = new boolean[] {false} ;
      H002D2_A627Variable_N = new short[1] ;
      H002D2_n627Variable_N = new boolean[] {false} ;
      H002D2_A626Variable_I = new short[1] ;
      H002D2_n626Variable_I = new boolean[] {false} ;
      H002D2_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002D2_n625Variable_VF = new boolean[] {false} ;
      H002D2_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002D2_n624Costo_Desmante = new boolean[] {false} ;
      H002D2_A43Cuen_Identificacion = new long[1] ;
      H002D2_n43Cuen_Identificacion = new boolean[] {false} ;
      H002D2_A298Cata_Descripcion = new String[] {""} ;
      H002D2_A501Invd_EsPlacaPadre = new String[] {""} ;
      H002D2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      H002D2_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      H002D2_n467Invd_FechaServicio = new boolean[] {false} ;
      H002D2_A68Invd_PlacaPadre = new String[] {""} ;
      H002D2_n68Invd_PlacaPadre = new boolean[] {false} ;
      H002D2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H002D2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H002D2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002D2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H002D2_A463Invd_Estado = new String[] {""} ;
      H002D2_n463Invd_Estado = new boolean[] {false} ;
      H002D2_A414Invd_BodegaCodigo = new String[] {""} ;
      H002D2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H002D2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H002D2_A411Invd_CentroCostoId = new long[1] ;
      H002D2_A410Invd_RegionalId = new long[1] ;
      H002D3_A37Cata_Codigo = new String[] {""} ;
      H002D3_A33Tipo_Codigo = new long[1] ;
      A37Cata_Codigo = "" ;
      H002D4_A34Clas_Codigo = new String[] {""} ;
      H002D4_A298Cata_Descripcion = new String[] {""} ;
      H002D5_A291Clas_Descripcion = new String[] {""} ;
      hsh = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7Invd_NumeroPlaca = "" ;
      AV8Elem_Consecutivo = "" ;
      AV11Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA67Invd_NumeroPlaca = "" ;
      sCtrlA66Elem_Consecutivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inventario_devolutivogeneral__default(),
         new Object[] {
             new Object[] {
            H002D2_A66Elem_Consecutivo, H002D2_A67Invd_NumeroPlaca, H002D2_A37Cata_Codigo, H002D2_A858Invd_EntidadGobierno, H002D2_n858Invd_EntidadGobierno, H002D2_A818Invd_PlacaRecuperada, H002D2_n818Invd_PlacaRecuperada, H002D2_A33Tipo_Codigo, H002D2_A711Invd_AreadanteCodigo, H002D2_n711Invd_AreadanteCodigo,
            H002D2_A688Cuen_Cedula, H002D2_A44Cuen_Nombre, H002D2_n44Cuen_Nombre, H002D2_A291Clas_Descripcion, H002D2_A34Clas_Codigo, H002D2_A631Vida_Util_Actual, H002D2_n631Vida_Util_Actual, H002D2_A630Vida_Util_Inicial, H002D2_n630Vida_Util_Inicial, H002D2_A629Costo_Total_Dev,
            H002D2_A628Otros_Costos_Dev, H002D2_n628Otros_Costos_Dev, H002D2_A627Variable_N, H002D2_n627Variable_N, H002D2_A626Variable_I, H002D2_n626Variable_I, H002D2_A625Variable_VF, H002D2_n625Variable_VF, H002D2_A624Costo_Desmante, H002D2_n624Costo_Desmante,
            H002D2_A43Cuen_Identificacion, H002D2_n43Cuen_Identificacion, H002D2_A298Cata_Descripcion, H002D2_A501Invd_EsPlacaPadre, H002D2_n501Invd_EsPlacaPadre, H002D2_A467Invd_FechaServicio, H002D2_n467Invd_FechaServicio, H002D2_A68Invd_PlacaPadre, H002D2_n68Invd_PlacaPadre, H002D2_A466Invd_FechaAdquisicion,
            H002D2_n466Invd_FechaAdquisicion, H002D2_A465Invd_ValorAdquisicion, H002D2_n465Invd_ValorAdquisicion, H002D2_A463Invd_Estado, H002D2_n463Invd_Estado, H002D2_A414Invd_BodegaCodigo, H002D2_A413Invd_AlmacenCodigo, H002D2_A412Invd_ModuloAlmacen, H002D2_A411Invd_CentroCostoId, H002D2_A410Invd_RegionalId
            }
            , new Object[] {
            H002D3_A37Cata_Codigo, H002D3_A33Tipo_Codigo
            }
            , new Object[] {
            H002D4_A34Clas_Codigo, H002D4_A298Cata_Descripcion
            }
            , new Object[] {
            H002D5_A291Clas_Descripcion
            }
         }
      );
      AV15Pgmname = "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_INVENTARIO_DEVOLUTIVOGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A630Vida_Util_Inicial ;
   private short A631Vida_Util_Actual ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtInvd_NumeroPlaca_Enabled ;
   private int edtInvd_RegionalId_Enabled ;
   private int edtInvd_CentroCostoId_Enabled ;
   private int edtInvd_AlmacenCodigo_Enabled ;
   private int edtInvd_BodegaCodigo_Enabled ;
   private int edtInvd_ValorAdquisicion_Enabled ;
   private int edtInvd_FechaAdquisicion_Enabled ;
   private int edtInvd_PlacaPadre_Enabled ;
   private int edtInvd_FechaServicio_Enabled ;
   private int edtInvd_EsPlacaPadre_Enabled ;
   private int edtElem_Consecutivo_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtCuen_Identificacion_Enabled ;
   private int edtCosto_Desmante_Enabled ;
   private int edtVariable_VF_Enabled ;
   private int edtVariable_I_Enabled ;
   private int edtVariable_N_Enabled ;
   private int edtOtros_Costos_Dev_Enabled ;
   private int edtCosto_Total_Dev_Enabled ;
   private int edtVida_Util_Inicial_Enabled ;
   private int edtVida_Util_Actual_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int edtClas_Descripcion_Enabled ;
   private int edtCuen_Nombre_Enabled ;
   private int edtCuen_Cedula_Enabled ;
   private int edtInvd_AreadanteCodigo_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int edtInvd_PlacaRecuperada_Enabled ;
   private int idxLst ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long A33Tipo_Codigo ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A501Invd_EsPlacaPadre ;
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
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtInvd_ValorAdquisicion_Internalname ;
   private String edtInvd_ValorAdquisicion_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtInvd_FechaServicio_Internalname ;
   private String edtInvd_FechaServicio_Jsonclick ;
   private String edtInvd_EsPlacaPadre_Internalname ;
   private String edtInvd_EsPlacaPadre_Jsonclick ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Internalname ;
   private String edtCata_Descripcion_Link ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCosto_Desmante_Internalname ;
   private String edtCosto_Desmante_Jsonclick ;
   private String edtVariable_VF_Internalname ;
   private String edtVariable_VF_Jsonclick ;
   private String edtVariable_I_Internalname ;
   private String edtVariable_I_Jsonclick ;
   private String edtVariable_N_Internalname ;
   private String edtVariable_N_Jsonclick ;
   private String edtOtros_Costos_Dev_Internalname ;
   private String edtOtros_Costos_Dev_Jsonclick ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtVida_Util_Inicial_Internalname ;
   private String edtVida_Util_Inicial_Jsonclick ;
   private String edtVida_Util_Actual_Internalname ;
   private String edtVida_Util_Actual_Jsonclick ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Internalname ;
   private String edtClas_Descripcion_Link ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Link ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtInvd_AreadanteCodigo_Internalname ;
   private String edtInvd_AreadanteCodigo_Jsonclick ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtInvd_PlacaRecuperada_Internalname ;
   private String edtInvd_PlacaRecuperada_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA67Invd_NumeroPlaca ;
   private String sCtrlA66Elem_Consecutivo ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date A467Invd_FechaServicio ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n463Invd_Estado ;
   private boolean n858Invd_EntidadGobierno ;
   private boolean n818Invd_PlacaRecuperada ;
   private boolean n711Invd_AreadanteCodigo ;
   private boolean n44Cuen_Nombre ;
   private boolean n631Vida_Util_Actual ;
   private boolean n630Vida_Util_Inicial ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n627Variable_N ;
   private boolean n626Variable_I ;
   private boolean n625Variable_VF ;
   private boolean n624Costo_Desmante ;
   private boolean n43Cuen_Identificacion ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n467Invd_FechaServicio ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean returnInSub ;
   private String wcpOA67Invd_NumeroPlaca ;
   private String wcpOA66Elem_Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String A711Invd_AreadanteCodigo ;
   private String A818Invd_PlacaRecuperada ;
   private String A858Invd_EntidadGobierno ;
   private String A298Cata_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A44Cuen_Nombre ;
   private String A37Cata_Codigo ;
   private String AV7Invd_NumeroPlaca ;
   private String AV8Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private HTMLChoice cmbInvd_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private String[] H002D2_A66Elem_Consecutivo ;
   private String[] H002D2_A67Invd_NumeroPlaca ;
   private String[] H002D2_A37Cata_Codigo ;
   private String[] H002D2_A858Invd_EntidadGobierno ;
   private boolean[] H002D2_n858Invd_EntidadGobierno ;
   private String[] H002D2_A818Invd_PlacaRecuperada ;
   private boolean[] H002D2_n818Invd_PlacaRecuperada ;
   private long[] H002D2_A33Tipo_Codigo ;
   private String[] H002D2_A711Invd_AreadanteCodigo ;
   private boolean[] H002D2_n711Invd_AreadanteCodigo ;
   private long[] H002D2_A688Cuen_Cedula ;
   private String[] H002D2_A44Cuen_Nombre ;
   private boolean[] H002D2_n44Cuen_Nombre ;
   private String[] H002D2_A291Clas_Descripcion ;
   private String[] H002D2_A34Clas_Codigo ;
   private short[] H002D2_A631Vida_Util_Actual ;
   private boolean[] H002D2_n631Vida_Util_Actual ;
   private short[] H002D2_A630Vida_Util_Inicial ;
   private boolean[] H002D2_n630Vida_Util_Inicial ;
   private java.math.BigDecimal[] H002D2_A629Costo_Total_Dev ;
   private java.math.BigDecimal[] H002D2_A628Otros_Costos_Dev ;
   private boolean[] H002D2_n628Otros_Costos_Dev ;
   private short[] H002D2_A627Variable_N ;
   private boolean[] H002D2_n627Variable_N ;
   private short[] H002D2_A626Variable_I ;
   private boolean[] H002D2_n626Variable_I ;
   private java.math.BigDecimal[] H002D2_A625Variable_VF ;
   private boolean[] H002D2_n625Variable_VF ;
   private java.math.BigDecimal[] H002D2_A624Costo_Desmante ;
   private boolean[] H002D2_n624Costo_Desmante ;
   private long[] H002D2_A43Cuen_Identificacion ;
   private boolean[] H002D2_n43Cuen_Identificacion ;
   private String[] H002D2_A298Cata_Descripcion ;
   private String[] H002D2_A501Invd_EsPlacaPadre ;
   private boolean[] H002D2_n501Invd_EsPlacaPadre ;
   private java.util.Date[] H002D2_A467Invd_FechaServicio ;
   private boolean[] H002D2_n467Invd_FechaServicio ;
   private String[] H002D2_A68Invd_PlacaPadre ;
   private boolean[] H002D2_n68Invd_PlacaPadre ;
   private java.util.Date[] H002D2_A466Invd_FechaAdquisicion ;
   private boolean[] H002D2_n466Invd_FechaAdquisicion ;
   private java.math.BigDecimal[] H002D2_A465Invd_ValorAdquisicion ;
   private boolean[] H002D2_n465Invd_ValorAdquisicion ;
   private String[] H002D2_A463Invd_Estado ;
   private boolean[] H002D2_n463Invd_Estado ;
   private String[] H002D2_A414Invd_BodegaCodigo ;
   private String[] H002D2_A413Invd_AlmacenCodigo ;
   private String[] H002D2_A412Invd_ModuloAlmacen ;
   private long[] H002D2_A411Invd_CentroCostoId ;
   private long[] H002D2_A410Invd_RegionalId ;
   private String[] H002D3_A37Cata_Codigo ;
   private long[] H002D3_A33Tipo_Codigo ;
   private String[] H002D4_A34Clas_Codigo ;
   private String[] H002D4_A298Cata_Descripcion ;
   private String[] H002D5_A291Clas_Descripcion ;
   private com.genexus.webpanels.WebSession AV11Session ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class alm_inventario_devolutivogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002D2", "SELECT T1.Elem_Consecutivo, T1.Invd_NumeroPlaca, T3.Cata_Codigo, T1.Invd_EntidadGobierno, T1.Invd_PlacaRecuperada, T3.Tipo_Codigo, T1.Invd_AreadanteCodigo, T2.Cuen_Cedula, T2.Cuen_Nombre, T5.Clas_Descripcion, T4.Clas_Codigo, T1.Vida_Util_Actual, T1.Vida_Util_Inicial, T1.Costo_Total_Dev, T1.Otros_Costos_Dev, T1.Variable_N, T1.Variable_I, T1.Variable_VF, T1.Costo_Desmante, T1.Cuen_Identificacion, T4.Cata_Descripcion, T1.Invd_EsPlacaPadre, T1.Invd_FechaServicio, T1.Invd_PlacaPadre, T1.Invd_FechaAdquisicion, T1.Invd_ValorAdquisicion, T1.Invd_Estado, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Invd_RegionalId FROM ((((ALM_INVENTARIO_DEVOLUTIVO T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Cuen_Identificacion) INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo) INNER JOIN ALM_CLASE T5 ON T5.Clas_Codigo = T4.Clas_Codigo) WHERE T1.Elem_Consecutivo = ? and T1.Invd_NumeroPlaca = ? ORDER BY T1.Elem_Consecutivo, T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002D3", "SELECT Cata_Codigo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002D4", "SELECT Clas_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002D5", "SELECT Clas_Descripcion FROM ALM_CLASE WHERE Clas_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[15])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2) ;
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,2) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(19,2) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[33])[0] = rslt.getString(22, 2) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(23) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(25) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(26,2) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[46])[0] = rslt.getVarchar(29) ;
               ((String[]) buf[47])[0] = rslt.getVarchar(30) ;
               ((long[]) buf[48])[0] = rslt.getLong(31) ;
               ((long[]) buf[49])[0] = rslt.getLong(32) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
      }
   }

}

