/*
               File: alm_almgengeneral_impl
        Description: ALM_ALMGENGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:22.49
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

public final  class alm_almgengeneral_impl extends GXWebComponent
{
   public alm_almgengeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_almgengeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_almgengeneral_impl.class ));
   }

   public alm_almgengeneral_impl( int remoteHandle ,
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
      cmbAlma_Modulo = new HTMLChoice();
      cmbAlmaG_Estado = new HTMLChoice();
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
               A76AlmaG_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A76AlmaG_Codigo,A27Alma_Modulo});
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
         pa5M2( ) ;
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
         httpContext.writeValue( "ALM_ALMGENGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414172253");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_almgengeneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A76AlmaG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA76AlmaG_Codigo", wcpOA76AlmaG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA27Alma_Modulo", wcpOA27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A470AlmaG_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_USUARIOCREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A471AlmaG_UsuarioCreacion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_FECHACREACION", getSecureSignedToken( sPrefix, localUtil.format( A472AlmaG_FechaCreacion, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A473AlmaG_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A474AlmaG_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMAG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A684AlmaG_Estado, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm5M2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_almgengeneral.js", "?201861414172253");
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
      return "ALM_ALMGENGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ALMGENGeneral" ;
   }

   public void wb5M0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_almgengeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e115m1_client"+"'", TempTags, "", 2, "HLP_ALM_ALMGENGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e125m1_client"+"'", TempTags, "", 2, "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_Codigo_Internalname, "General Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_Codigo_Internalname, A76AlmaG_Codigo, GXutil.rtrim( localUtil.format( A76AlmaG_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_Descripcion_Internalname, "General Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_Descripcion_Internalname, A470AlmaG_Descripcion, GXutil.rtrim( localUtil.format( A470AlmaG_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_UsuarioCreacion_Internalname, A471AlmaG_UsuarioCreacion, GXutil.rtrim( localUtil.format( A471AlmaG_UsuarioCreacion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_UsuarioCreacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlmaG_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_FechaCreacion_Internalname, localUtil.ttoc( A472AlmaG_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A472AlmaG_FechaCreacion, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_FechaCreacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMGENGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlmaG_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlmaG_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_UsuarioModifica_Internalname, A473AlmaG_UsuarioModifica, GXutil.rtrim( localUtil.format( A473AlmaG_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlmaG_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_FechaModifica_Internalname, localUtil.ttoc( A474AlmaG_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A474AlmaG_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlmaG_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMGENGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlmaG_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlmaG_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMGENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Modulo.getInternalname(), "Modulo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ALMGENGeneral.htm");
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlmaG_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlmaG_Estado, cmbAlmaG_Estado.getInternalname(), GXutil.rtrim( A684AlmaG_Estado), 1, cmbAlmaG_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlmaG_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ALMGENGeneral.htm");
         cmbAlmaG_Estado.setValue( GXutil.rtrim( A684AlmaG_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlmaG_Estado.getInternalname(), "Values", cmbAlmaG_Estado.ToJavascriptSource(), true);
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

   public void start5M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ALMGENGeneral", (short)(0)) ;
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
            strup5M0( ) ;
         }
      }
   }

   public void ws5M2( )
   {
      start5M2( ) ;
      evt5M2( ) ;
   }

   public void evt5M2( )
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
                              strup5M0( ) ;
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
                              strup5M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e135M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e145M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5M0( ) ;
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
                              strup5M0( ) ;
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

   public void we5M2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm5M2( ) ;
         }
      }
   }

   public void pa5M2( )
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
         cmbAlma_Modulo.setName( "ALMA_MODULO" );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
         }
         cmbAlmaG_Estado.setName( "ALMAG_ESTADO" );
         cmbAlmaG_Estado.setWebtags( "" );
         cmbAlmaG_Estado.addItem("A", "Activo", (short)(0));
         cmbAlmaG_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlmaG_Estado.getItemCount() > 0 )
         {
            A684AlmaG_Estado = cmbAlmaG_Estado.getValidValue(A684AlmaG_Estado) ;
            n684AlmaG_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684AlmaG_Estado", A684AlmaG_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A684AlmaG_Estado, ""))));
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
      if ( cmbAlma_Modulo.getItemCount() > 0 )
      {
         A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      if ( cmbAlmaG_Estado.getItemCount() > 0 )
      {
         A684AlmaG_Estado = cmbAlmaG_Estado.getValidValue(A684AlmaG_Estado) ;
         n684AlmaG_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684AlmaG_Estado", A684AlmaG_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A684AlmaG_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5M2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_ALMGENGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf5M2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H005M2 */
         pr_default.execute(0, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A684AlmaG_Estado = H005M2_A684AlmaG_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684AlmaG_Estado", A684AlmaG_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A684AlmaG_Estado, ""))));
            n684AlmaG_Estado = H005M2_n684AlmaG_Estado[0] ;
            A474AlmaG_FechaModifica = H005M2_A474AlmaG_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A474AlmaG_FechaModifica, "99/99/99 99:99")));
            n474AlmaG_FechaModifica = H005M2_n474AlmaG_FechaModifica[0] ;
            A473AlmaG_UsuarioModifica = H005M2_A473AlmaG_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A473AlmaG_UsuarioModifica, "@!"))));
            n473AlmaG_UsuarioModifica = H005M2_n473AlmaG_UsuarioModifica[0] ;
            A472AlmaG_FechaCreacion = H005M2_A472AlmaG_FechaCreacion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_FECHACREACION", getSecureSignedToken( sPrefix, localUtil.format( A472AlmaG_FechaCreacion, "99/99/99 99:99")));
            A471AlmaG_UsuarioCreacion = H005M2_A471AlmaG_UsuarioCreacion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_USUARIOCREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A471AlmaG_UsuarioCreacion, "@!"))));
            A470AlmaG_Descripcion = H005M2_A470AlmaG_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A470AlmaG_Descripcion, ""))));
            /* Execute user event: Load */
            e145M2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb5M0( ) ;
      }
   }

   public void strup5M0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_ALMGENGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e135M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A470AlmaG_Descripcion = httpContext.cgiGet( edtAlmaG_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A470AlmaG_Descripcion, ""))));
         A471AlmaG_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtAlmaG_UsuarioCreacion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_USUARIOCREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A471AlmaG_UsuarioCreacion, "@!"))));
         A472AlmaG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtAlmaG_FechaCreacion_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_FECHACREACION", getSecureSignedToken( sPrefix, localUtil.format( A472AlmaG_FechaCreacion, "99/99/99 99:99")));
         A473AlmaG_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtAlmaG_UsuarioModifica_Internalname)) ;
         n473AlmaG_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A473AlmaG_UsuarioModifica, "@!"))));
         A474AlmaG_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtAlmaG_FechaModifica_Internalname), 0) ;
         n474AlmaG_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A474AlmaG_FechaModifica, "99/99/99 99:99")));
         cmbAlmaG_Estado.setValue( httpContext.cgiGet( cmbAlmaG_Estado.getInternalname()) );
         A684AlmaG_Estado = httpContext.cgiGet( cmbAlmaG_Estado.getInternalname()) ;
         n684AlmaG_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684AlmaG_Estado", A684AlmaG_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMAG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A684AlmaG_Estado, ""))));
         /* Read saved values. */
         wcpOA76AlmaG_Codigo = httpContext.cgiGet( sPrefix+"wcpOA76AlmaG_Codigo") ;
         wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
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
      e135M2 ();
      if (returnInSub) return;
   }

   public void e135M2( )
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

   protected void e145M2( )
   {
      /* Load Routine */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV9TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ALMGEN" );
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "AlmaG_Codigo" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7AlmaG_Codigo );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Alma_Modulo" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV8Alma_Modulo );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV11Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A76AlmaG_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
      A27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
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
      pa5M2( ) ;
      ws5M2( ) ;
      we5M2( ) ;
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
      sCtrlA76AlmaG_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa5M2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_almgengeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa5M2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A76AlmaG_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
         A27Alma_Modulo = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      wcpOA76AlmaG_Codigo = httpContext.cgiGet( sPrefix+"wcpOA76AlmaG_Codigo") ;
      wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A76AlmaG_Codigo, wcpOA76AlmaG_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, wcpOA27Alma_Modulo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA76AlmaG_Codigo = A76AlmaG_Codigo ;
      wcpOA27Alma_Modulo = A27Alma_Modulo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA76AlmaG_Codigo = httpContext.cgiGet( sPrefix+"A76AlmaG_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA76AlmaG_Codigo) > 0 )
      {
         A76AlmaG_Codigo = httpContext.cgiGet( sCtrlA76AlmaG_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
      }
      else
      {
         A76AlmaG_Codigo = httpContext.cgiGet( sPrefix+"A76AlmaG_Codigo_PARM") ;
      }
      sCtrlA27Alma_Modulo = httpContext.cgiGet( sPrefix+"A27Alma_Modulo_CTRL") ;
      if ( GXutil.len( sCtrlA27Alma_Modulo) > 0 )
      {
         A27Alma_Modulo = httpContext.cgiGet( sCtrlA27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      else
      {
         A27Alma_Modulo = httpContext.cgiGet( sPrefix+"A27Alma_Modulo_PARM") ;
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
      pa5M2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws5M2( ) ;
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
      ws5M2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A76AlmaG_Codigo_PARM", A76AlmaG_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA76AlmaG_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A76AlmaG_Codigo_CTRL", GXutil.rtrim( sCtrlA76AlmaG_Codigo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_PARM", A27Alma_Modulo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA27Alma_Modulo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_CTRL", GXutil.rtrim( sCtrlA27Alma_Modulo));
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
      we5M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414172295");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_almgengeneral.js", "?201861414172295");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtAlmaG_Codigo_Internalname = sPrefix+"ALMAG_CODIGO" ;
      edtAlmaG_Descripcion_Internalname = sPrefix+"ALMAG_DESCRIPCION" ;
      edtAlmaG_UsuarioCreacion_Internalname = sPrefix+"ALMAG_USUARIOCREACION" ;
      edtAlmaG_FechaCreacion_Internalname = sPrefix+"ALMAG_FECHACREACION" ;
      edtAlmaG_UsuarioModifica_Internalname = sPrefix+"ALMAG_USUARIOMODIFICA" ;
      edtAlmaG_FechaModifica_Internalname = sPrefix+"ALMAG_FECHAMODIFICA" ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO" );
      cmbAlmaG_Estado.setInternalname( sPrefix+"ALMAG_ESTADO" );
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
      cmbAlmaG_Estado.setJsonclick( "" );
      cmbAlmaG_Estado.setEnabled( 0 );
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 0 );
      edtAlmaG_FechaModifica_Jsonclick = "" ;
      edtAlmaG_FechaModifica_Enabled = 0 ;
      edtAlmaG_UsuarioModifica_Jsonclick = "" ;
      edtAlmaG_UsuarioModifica_Enabled = 0 ;
      edtAlmaG_FechaCreacion_Jsonclick = "" ;
      edtAlmaG_FechaCreacion_Enabled = 0 ;
      edtAlmaG_UsuarioCreacion_Jsonclick = "" ;
      edtAlmaG_UsuarioCreacion_Enabled = 0 ;
      edtAlmaG_Descripcion_Jsonclick = "" ;
      edtAlmaG_Descripcion_Enabled = 0 ;
      edtAlmaG_Codigo_Jsonclick = "" ;
      edtAlmaG_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e115M1',iparms:[{av:'A76AlmaG_Codigo',fld:'ALMAG_CODIGO',pic:'',nv:''},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e125M1',iparms:[{av:'A76AlmaG_Codigo',fld:'ALMAG_CODIGO',pic:'',nv:''},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''}],oparms:[]}");
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
      wcpOA76AlmaG_Codigo = "" ;
      wcpOA27Alma_Modulo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A76AlmaG_Codigo = "" ;
      A27Alma_Modulo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A470AlmaG_Descripcion = "" ;
      A471AlmaG_UsuarioCreacion = "" ;
      A472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A473AlmaG_UsuarioModifica = "" ;
      A474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A684AlmaG_Estado = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H005M2_A76AlmaG_Codigo = new String[] {""} ;
      H005M2_A27Alma_Modulo = new String[] {""} ;
      H005M2_A684AlmaG_Estado = new String[] {""} ;
      H005M2_n684AlmaG_Estado = new boolean[] {false} ;
      H005M2_A474AlmaG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H005M2_n474AlmaG_FechaModifica = new boolean[] {false} ;
      H005M2_A473AlmaG_UsuarioModifica = new String[] {""} ;
      H005M2_n473AlmaG_UsuarioModifica = new boolean[] {false} ;
      H005M2_A472AlmaG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H005M2_A471AlmaG_UsuarioCreacion = new String[] {""} ;
      H005M2_A470AlmaG_Descripcion = new String[] {""} ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7AlmaG_Codigo = "" ;
      AV8Alma_Modulo = "" ;
      AV11Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA76AlmaG_Codigo = "" ;
      sCtrlA27Alma_Modulo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_almgengeneral__default(),
         new Object[] {
             new Object[] {
            H005M2_A76AlmaG_Codigo, H005M2_A27Alma_Modulo, H005M2_A684AlmaG_Estado, H005M2_n684AlmaG_Estado, H005M2_A474AlmaG_FechaModifica, H005M2_n474AlmaG_FechaModifica, H005M2_A473AlmaG_UsuarioModifica, H005M2_n473AlmaG_UsuarioModifica, H005M2_A472AlmaG_FechaCreacion, H005M2_A471AlmaG_UsuarioCreacion,
            H005M2_A470AlmaG_Descripcion
            }
         }
      );
      AV15Pgmname = "ALM_ALMGENGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_ALMGENGeneral" ;
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
   private int edtAlmaG_Codigo_Enabled ;
   private int edtAlmaG_Descripcion_Enabled ;
   private int edtAlmaG_UsuarioCreacion_Enabled ;
   private int edtAlmaG_FechaCreacion_Enabled ;
   private int edtAlmaG_UsuarioModifica_Enabled ;
   private int edtAlmaG_FechaModifica_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A684AlmaG_Estado ;
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
   private String edtAlmaG_Codigo_Internalname ;
   private String edtAlmaG_Codigo_Jsonclick ;
   private String edtAlmaG_Descripcion_Internalname ;
   private String edtAlmaG_Descripcion_Jsonclick ;
   private String edtAlmaG_UsuarioCreacion_Internalname ;
   private String edtAlmaG_UsuarioCreacion_Jsonclick ;
   private String edtAlmaG_FechaCreacion_Internalname ;
   private String edtAlmaG_FechaCreacion_Jsonclick ;
   private String edtAlmaG_UsuarioModifica_Internalname ;
   private String edtAlmaG_UsuarioModifica_Jsonclick ;
   private String edtAlmaG_FechaModifica_Internalname ;
   private String edtAlmaG_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlA76AlmaG_Codigo ;
   private String sCtrlA27Alma_Modulo ;
   private java.util.Date A472AlmaG_FechaCreacion ;
   private java.util.Date A474AlmaG_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n684AlmaG_Estado ;
   private boolean n474AlmaG_FechaModifica ;
   private boolean n473AlmaG_UsuarioModifica ;
   private boolean returnInSub ;
   private String wcpOA76AlmaG_Codigo ;
   private String wcpOA27Alma_Modulo ;
   private String A76AlmaG_Codigo ;
   private String A27Alma_Modulo ;
   private String A470AlmaG_Descripcion ;
   private String A471AlmaG_UsuarioCreacion ;
   private String A473AlmaG_UsuarioModifica ;
   private String AV7AlmaG_Codigo ;
   private String AV8Alma_Modulo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private HTMLChoice cmbAlma_Modulo ;
   private HTMLChoice cmbAlmaG_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H005M2_A76AlmaG_Codigo ;
   private String[] H005M2_A27Alma_Modulo ;
   private String[] H005M2_A684AlmaG_Estado ;
   private boolean[] H005M2_n684AlmaG_Estado ;
   private java.util.Date[] H005M2_A474AlmaG_FechaModifica ;
   private boolean[] H005M2_n474AlmaG_FechaModifica ;
   private String[] H005M2_A473AlmaG_UsuarioModifica ;
   private boolean[] H005M2_n473AlmaG_UsuarioModifica ;
   private java.util.Date[] H005M2_A472AlmaG_FechaCreacion ;
   private String[] H005M2_A471AlmaG_UsuarioCreacion ;
   private String[] H005M2_A470AlmaG_Descripcion ;
   private com.genexus.webpanels.WebSession AV11Session ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class alm_almgengeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005M2", "SELECT AlmaG_Codigo, Alma_Modulo, AlmaG_Estado, AlmaG_FechaModifica, AlmaG_UsuarioModifica, AlmaG_FechaCreacion, AlmaG_UsuarioCreacion, AlmaG_Descripcion FROM ALM_ALMGEN WHERE AlmaG_Codigo = ? and Alma_Modulo = ? ORDER BY AlmaG_Codigo, Alma_Modulo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
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
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
      }
   }

}

