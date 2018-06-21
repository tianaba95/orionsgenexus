/*
               File: alm_bodegageneral_impl
        Description: ALM_BODEGAGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:20.49
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

public final  class alm_bodegageneral_impl extends GXWebComponent
{
   public alm_bodegageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_bodegageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_bodegageneral_impl.class ));
   }

   public alm_bodegageneral_impl( int remoteHandle ,
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
      cmbBode_Estado = new HTMLChoice();
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
               A31Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A31Bode_Codigo});
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
         pa3V2( ) ;
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
         httpContext.writeValue( "ALM_BODEGAGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414162052");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_bodegageneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA31Bode_Codigo", wcpOA31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A287Bode_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A288Bode_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A289Bode_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A290Bode_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BODE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm3V2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_bodegageneral.js", "?201861414162053");
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
      return "ALM_BODEGAGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_BODEGAGeneral" ;
   }

   public void wb3V0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_bodegageneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e113v1_client"+"'", TempTags, "", 2, "HLP_ALM_BODEGAGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e123v1_client"+"'", TempTags, "", 2, "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Codigo_Internalname, "Bodega", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Codigo_Internalname, A31Bode_Codigo, GXutil.rtrim( localUtil.format( A31Bode_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Descripcion_Internalname, "Nombre Bodega", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Descripcion_Internalname, A251Bode_Descripcion, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_UsuarioCrea_Internalname, A287Bode_UsuarioCrea, GXutil.rtrim( localUtil.format( A287Bode_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtBode_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_FechaCrea_Internalname, localUtil.ttoc( A288Bode_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A288Bode_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_BODEGAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBode_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBode_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_UsuarioModifica_Internalname, "Usuario Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_UsuarioModifica_Internalname, A289Bode_UsuarioModifica, GXutil.rtrim( localUtil.format( A289Bode_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_FechaModifica_Internalname, "Fecha Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtBode_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_FechaModifica_Internalname, localUtil.ttoc( A290Bode_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A290Bode_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBode_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_BODEGAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBode_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBode_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_BODEGAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbBode_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBode_Estado, cmbBode_Estado.getInternalname(), GXutil.rtrim( A674Bode_Estado), 1, cmbBode_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbBode_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_BODEGAGeneral.htm");
         cmbBode_Estado.setValue( GXutil.rtrim( A674Bode_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBode_Estado.getInternalname(), "Values", cmbBode_Estado.ToJavascriptSource(), true);
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

   public void start3V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_BODEGAGeneral", (short)(0)) ;
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
            strup3V0( ) ;
         }
      }
   }

   public void ws3V2( )
   {
      start3V2( ) ;
      evt3V2( ) ;
   }

   public void evt3V2( )
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
                              strup3V0( ) ;
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
                              strup3V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e133V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e143V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3V0( ) ;
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
                              strup3V0( ) ;
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

   public void we3V2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm3V2( ) ;
         }
      }
   }

   public void pa3V2( )
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
         cmbBode_Estado.setName( "BODE_ESTADO" );
         cmbBode_Estado.setWebtags( "" );
         cmbBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBode_Estado.getItemCount() > 0 )
         {
            A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
            n674Bode_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674Bode_Estado", A674Bode_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
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
      if ( cmbBode_Estado.getItemCount() > 0 )
      {
         A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
         n674Bode_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674Bode_Estado", A674Bode_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3V2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_BODEGAGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf3V2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H003V2 */
         pr_default.execute(0, new Object[] {A31Bode_Codigo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A674Bode_Estado = H003V2_A674Bode_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674Bode_Estado", A674Bode_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
            n674Bode_Estado = H003V2_n674Bode_Estado[0] ;
            A290Bode_FechaModifica = H003V2_A290Bode_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A290Bode_FechaModifica", localUtil.ttoc( A290Bode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A290Bode_FechaModifica, "99/99/99 99:99")));
            n290Bode_FechaModifica = H003V2_n290Bode_FechaModifica[0] ;
            A289Bode_UsuarioModifica = H003V2_A289Bode_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A289Bode_UsuarioModifica", A289Bode_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A289Bode_UsuarioModifica, "@!"))));
            n289Bode_UsuarioModifica = H003V2_n289Bode_UsuarioModifica[0] ;
            A288Bode_FechaCrea = H003V2_A288Bode_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A288Bode_FechaCrea", localUtil.ttoc( A288Bode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A288Bode_FechaCrea, "99/99/99 99:99")));
            n288Bode_FechaCrea = H003V2_n288Bode_FechaCrea[0] ;
            A287Bode_UsuarioCrea = H003V2_A287Bode_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A287Bode_UsuarioCrea", A287Bode_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A287Bode_UsuarioCrea, "@!"))));
            n287Bode_UsuarioCrea = H003V2_n287Bode_UsuarioCrea[0] ;
            A251Bode_Descripcion = H003V2_A251Bode_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A251Bode_Descripcion", A251Bode_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
            /* Execute user event: Load */
            e143V2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb3V0( ) ;
      }
   }

   public void strup3V0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_BODEGAGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e133V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A251Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtBode_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A251Bode_Descripcion", A251Bode_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
         A287Bode_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtBode_UsuarioCrea_Internalname)) ;
         n287Bode_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A287Bode_UsuarioCrea", A287Bode_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A287Bode_UsuarioCrea, "@!"))));
         A288Bode_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtBode_FechaCrea_Internalname), 0) ;
         n288Bode_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A288Bode_FechaCrea", localUtil.ttoc( A288Bode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A288Bode_FechaCrea, "99/99/99 99:99")));
         A289Bode_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtBode_UsuarioModifica_Internalname)) ;
         n289Bode_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A289Bode_UsuarioModifica", A289Bode_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A289Bode_UsuarioModifica, "@!"))));
         A290Bode_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtBode_FechaModifica_Internalname), 0) ;
         n290Bode_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A290Bode_FechaModifica", localUtil.ttoc( A290Bode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A290Bode_FechaModifica, "99/99/99 99:99")));
         cmbBode_Estado.setValue( httpContext.cgiGet( cmbBode_Estado.getInternalname()) );
         A674Bode_Estado = httpContext.cgiGet( cmbBode_Estado.getInternalname()) ;
         n674Bode_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674Bode_Estado", A674Bode_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BODE_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
         /* Read saved values. */
         wcpOA31Bode_Codigo = httpContext.cgiGet( sPrefix+"wcpOA31Bode_Codigo") ;
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
      e133V2 ();
      if (returnInSub) return;
   }

   public void e133V2( )
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

   protected void e143V2( )
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
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_BODEGA" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Bode_Codigo" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Bode_Codigo );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A31Bode_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
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
      pa3V2( ) ;
      ws3V2( ) ;
      we3V2( ) ;
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
      sCtrlA31Bode_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa3V2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_bodegageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa3V2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A31Bode_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      wcpOA31Bode_Codigo = httpContext.cgiGet( sPrefix+"wcpOA31Bode_Codigo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A31Bode_Codigo, wcpOA31Bode_Codigo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA31Bode_Codigo = A31Bode_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA31Bode_Codigo = httpContext.cgiGet( sPrefix+"A31Bode_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA31Bode_Codigo) > 0 )
      {
         A31Bode_Codigo = httpContext.cgiGet( sCtrlA31Bode_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      else
      {
         A31Bode_Codigo = httpContext.cgiGet( sPrefix+"A31Bode_Codigo_PARM") ;
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
      pa3V2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws3V2( ) ;
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
      ws3V2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A31Bode_Codigo_PARM", A31Bode_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA31Bode_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A31Bode_Codigo_CTRL", GXutil.rtrim( sCtrlA31Bode_Codigo));
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
      we3V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414162089");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_bodegageneral.js", "?201861414162089");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtBode_Codigo_Internalname = sPrefix+"BODE_CODIGO" ;
      edtBode_Descripcion_Internalname = sPrefix+"BODE_DESCRIPCION" ;
      edtBode_UsuarioCrea_Internalname = sPrefix+"BODE_USUARIOCREA" ;
      edtBode_FechaCrea_Internalname = sPrefix+"BODE_FECHACREA" ;
      edtBode_UsuarioModifica_Internalname = sPrefix+"BODE_USUARIOMODIFICA" ;
      edtBode_FechaModifica_Internalname = sPrefix+"BODE_FECHAMODIFICA" ;
      cmbBode_Estado.setInternalname( sPrefix+"BODE_ESTADO" );
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
      cmbBode_Estado.setJsonclick( "" );
      cmbBode_Estado.setEnabled( 0 );
      edtBode_FechaModifica_Jsonclick = "" ;
      edtBode_FechaModifica_Enabled = 0 ;
      edtBode_UsuarioModifica_Jsonclick = "" ;
      edtBode_UsuarioModifica_Enabled = 0 ;
      edtBode_FechaCrea_Jsonclick = "" ;
      edtBode_FechaCrea_Enabled = 0 ;
      edtBode_UsuarioCrea_Jsonclick = "" ;
      edtBode_UsuarioCrea_Enabled = 0 ;
      edtBode_Descripcion_Jsonclick = "" ;
      edtBode_Descripcion_Enabled = 0 ;
      edtBode_Codigo_Jsonclick = "" ;
      edtBode_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e113V1',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e123V1',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''}],oparms:[]}");
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
      wcpOA31Bode_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A31Bode_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A251Bode_Descripcion = "" ;
      A287Bode_UsuarioCrea = "" ;
      A288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A289Bode_UsuarioModifica = "" ;
      A290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A674Bode_Estado = "" ;
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
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H003V2_A31Bode_Codigo = new String[] {""} ;
      H003V2_A674Bode_Estado = new String[] {""} ;
      H003V2_n674Bode_Estado = new boolean[] {false} ;
      H003V2_A290Bode_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003V2_n290Bode_FechaModifica = new boolean[] {false} ;
      H003V2_A289Bode_UsuarioModifica = new String[] {""} ;
      H003V2_n289Bode_UsuarioModifica = new boolean[] {false} ;
      H003V2_A288Bode_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003V2_n288Bode_FechaCrea = new boolean[] {false} ;
      H003V2_A287Bode_UsuarioCrea = new String[] {""} ;
      H003V2_n287Bode_UsuarioCrea = new boolean[] {false} ;
      H003V2_A251Bode_Descripcion = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7Bode_Codigo = "" ;
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA31Bode_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_bodegageneral__default(),
         new Object[] {
             new Object[] {
            H003V2_A31Bode_Codigo, H003V2_A674Bode_Estado, H003V2_n674Bode_Estado, H003V2_A290Bode_FechaModifica, H003V2_n290Bode_FechaModifica, H003V2_A289Bode_UsuarioModifica, H003V2_n289Bode_UsuarioModifica, H003V2_A288Bode_FechaCrea, H003V2_n288Bode_FechaCrea, H003V2_A287Bode_UsuarioCrea,
            H003V2_n287Bode_UsuarioCrea, H003V2_A251Bode_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_BODEGAGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_BODEGAGeneral" ;
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
   private int edtBode_Codigo_Enabled ;
   private int edtBode_Descripcion_Enabled ;
   private int edtBode_UsuarioCrea_Enabled ;
   private int edtBode_FechaCrea_Enabled ;
   private int edtBode_UsuarioModifica_Enabled ;
   private int edtBode_FechaModifica_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A674Bode_Estado ;
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
   private String edtBode_Codigo_Internalname ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtBode_Descripcion_Internalname ;
   private String edtBode_Descripcion_Jsonclick ;
   private String edtBode_UsuarioCrea_Internalname ;
   private String edtBode_UsuarioCrea_Jsonclick ;
   private String edtBode_FechaCrea_Internalname ;
   private String edtBode_FechaCrea_Jsonclick ;
   private String edtBode_UsuarioModifica_Internalname ;
   private String edtBode_UsuarioModifica_Jsonclick ;
   private String edtBode_FechaModifica_Internalname ;
   private String edtBode_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA31Bode_Codigo ;
   private java.util.Date A288Bode_FechaCrea ;
   private java.util.Date A290Bode_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n674Bode_Estado ;
   private boolean n290Bode_FechaModifica ;
   private boolean n289Bode_UsuarioModifica ;
   private boolean n288Bode_FechaCrea ;
   private boolean n287Bode_UsuarioCrea ;
   private boolean returnInSub ;
   private String wcpOA31Bode_Codigo ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String A287Bode_UsuarioCrea ;
   private String A289Bode_UsuarioModifica ;
   private String AV7Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbBode_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H003V2_A31Bode_Codigo ;
   private String[] H003V2_A674Bode_Estado ;
   private boolean[] H003V2_n674Bode_Estado ;
   private java.util.Date[] H003V2_A290Bode_FechaModifica ;
   private boolean[] H003V2_n290Bode_FechaModifica ;
   private String[] H003V2_A289Bode_UsuarioModifica ;
   private boolean[] H003V2_n289Bode_UsuarioModifica ;
   private java.util.Date[] H003V2_A288Bode_FechaCrea ;
   private boolean[] H003V2_n288Bode_FechaCrea ;
   private String[] H003V2_A287Bode_UsuarioCrea ;
   private boolean[] H003V2_n287Bode_UsuarioCrea ;
   private String[] H003V2_A251Bode_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_bodegageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003V2", "SELECT Bode_Codigo, Bode_Estado, Bode_FechaModifica, Bode_UsuarioModifica, Bode_FechaCrea, Bode_UsuarioCrea, Bode_Descripcion FROM ALM_BODEGA WHERE Bode_Codigo = ? ORDER BY Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
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

