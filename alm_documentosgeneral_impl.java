/*
               File: alm_documentosgeneral_impl
        Description: ALM_DOCUMENTOSGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:34.33
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

public final  class alm_documentosgeneral_impl extends GXWebComponent
{
   public alm_documentosgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_documentosgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_documentosgeneral_impl.class ));
   }

   public alm_documentosgeneral_impl( int remoteHandle ,
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
      cmbDocu_Estado = new HTMLChoice();
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
               A819Docu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Short(A819Docu_Nro)});
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
         pa9A2( ) ;
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
         httpContext.writeValue( "ALM_DOCUMENTOSGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173437");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_documentosgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A819Docu_Nro,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA819Docu_Nro", GXutil.ltrim( localUtil.ntoc( wcpOA819Docu_Nro, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_PREFIJO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A823Docu_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A824Docu_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A825Docu_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCU_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A826Docu_FechaModifica, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm9A2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_documentosgeneral.js", "?201861414173439");
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
      return "ALM_DOCUMENTOSGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_DOCUMENTOSGeneral" ;
   }

   public void wb9A0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_documentosgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e119a1_client"+"'", TempTags, "", 2, "HLP_ALM_DOCUMENTOSGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e129a1_client"+"'", TempTags, "", 2, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Nro_Internalname, "Nro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Nro_Internalname, GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")), ((edtDocu_Nro_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Nro_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_Nro_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Descripcion_Internalname, A820Docu_Descripcion, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Prefijo_Internalname, "Prefijo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Prefijo_Internalname, A821Docu_Prefijo, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Prefijo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_Prefijo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbDocu_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDocu_Estado, cmbDocu_Estado.getInternalname(), GXutil.rtrim( A822Docu_Estado), 1, cmbDocu_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDocu_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_DOCUMENTOSGeneral.htm");
         cmbDocu_Estado.setValue( GXutil.rtrim( A822Docu_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbDocu_Estado.getInternalname(), "Values", cmbDocu_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_UsuarioCrea_Internalname, "de Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_UsuarioCrea_Internalname, A823Docu_UsuarioCrea, GXutil.rtrim( localUtil.format( A823Docu_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_FechaCrea_Internalname, "Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDocu_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_FechaCrea_Internalname, localUtil.ttoc( A824Docu_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A824Docu_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_DOCUMENTOSGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtDocu_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDocu_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_UsuarioModifica_Internalname, "de Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_UsuarioModifica_Internalname, A825Docu_UsuarioModifica, GXutil.rtrim( localUtil.format( A825Docu_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_DOCUMENTOSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_FechaModifica_Internalname, "de Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtDocu_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_FechaModifica_Internalname, localUtil.ttoc( A826Docu_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A826Docu_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDocu_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_DOCUMENTOSGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtDocu_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDocu_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_DOCUMENTOSGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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

   public void start9A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_DOCUMENTOSGeneral", (short)(0)) ;
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
            strup9A0( ) ;
         }
      }
   }

   public void ws9A2( )
   {
      start9A2( ) ;
      evt9A2( ) ;
   }

   public void evt9A2( )
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
                              strup9A0( ) ;
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
                              strup9A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e139A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e149A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9A0( ) ;
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
                              strup9A0( ) ;
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

   public void we9A2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm9A2( ) ;
         }
      }
   }

   public void pa9A2( )
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
         cmbDocu_Estado.setName( "DOCU_ESTADO" );
         cmbDocu_Estado.setWebtags( "" );
         cmbDocu_Estado.addItem("A", "Activo", (short)(0));
         cmbDocu_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbDocu_Estado.getItemCount() > 0 )
         {
            A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
            n822Docu_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A822Docu_Estado", A822Docu_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
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
      if ( cmbDocu_Estado.getItemCount() > 0 )
      {
         A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
         n822Docu_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A822Docu_Estado", A822Docu_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9A2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_DOCUMENTOSGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf9A2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H009A2 */
         pr_default.execute(0, new Object[] {new Short(A819Docu_Nro)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A826Docu_FechaModifica = H009A2_A826Docu_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A826Docu_FechaModifica", localUtil.ttoc( A826Docu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A826Docu_FechaModifica, "99/99/99 99:99")));
            n826Docu_FechaModifica = H009A2_n826Docu_FechaModifica[0] ;
            A825Docu_UsuarioModifica = H009A2_A825Docu_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A825Docu_UsuarioModifica", A825Docu_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A825Docu_UsuarioModifica, "@!"))));
            n825Docu_UsuarioModifica = H009A2_n825Docu_UsuarioModifica[0] ;
            A824Docu_FechaCrea = H009A2_A824Docu_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A824Docu_FechaCrea", localUtil.ttoc( A824Docu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A824Docu_FechaCrea, "99/99/99 99:99")));
            n824Docu_FechaCrea = H009A2_n824Docu_FechaCrea[0] ;
            A823Docu_UsuarioCrea = H009A2_A823Docu_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A823Docu_UsuarioCrea", A823Docu_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A823Docu_UsuarioCrea, "@!"))));
            n823Docu_UsuarioCrea = H009A2_n823Docu_UsuarioCrea[0] ;
            A822Docu_Estado = H009A2_A822Docu_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A822Docu_Estado", A822Docu_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
            n822Docu_Estado = H009A2_n822Docu_Estado[0] ;
            A821Docu_Prefijo = H009A2_A821Docu_Prefijo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A821Docu_Prefijo", A821Docu_Prefijo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_PREFIJO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, ""))));
            n821Docu_Prefijo = H009A2_n821Docu_Prefijo[0] ;
            A820Docu_Descripcion = H009A2_A820Docu_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A820Docu_Descripcion", A820Docu_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, ""))));
            n820Docu_Descripcion = H009A2_n820Docu_Descripcion[0] ;
            /* Execute user event: Load */
            e149A2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb9A0( ) ;
      }
   }

   public void strup9A0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_DOCUMENTOSGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e139A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A820Docu_Descripcion = httpContext.cgiGet( edtDocu_Descripcion_Internalname) ;
         n820Docu_Descripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A820Docu_Descripcion", A820Docu_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, ""))));
         A821Docu_Prefijo = httpContext.cgiGet( edtDocu_Prefijo_Internalname) ;
         n821Docu_Prefijo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A821Docu_Prefijo", A821Docu_Prefijo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_PREFIJO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, ""))));
         cmbDocu_Estado.setValue( httpContext.cgiGet( cmbDocu_Estado.getInternalname()) );
         A822Docu_Estado = httpContext.cgiGet( cmbDocu_Estado.getInternalname()) ;
         n822Docu_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A822Docu_Estado", A822Docu_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
         A823Docu_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtDocu_UsuarioCrea_Internalname)) ;
         n823Docu_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A823Docu_UsuarioCrea", A823Docu_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A823Docu_UsuarioCrea, "@!"))));
         A824Docu_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtDocu_FechaCrea_Internalname), 0) ;
         n824Docu_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A824Docu_FechaCrea", localUtil.ttoc( A824Docu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A824Docu_FechaCrea, "99/99/99 99:99")));
         A825Docu_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtDocu_UsuarioModifica_Internalname)) ;
         n825Docu_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A825Docu_UsuarioModifica", A825Docu_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A825Docu_UsuarioModifica, "@!"))));
         A826Docu_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtDocu_FechaModifica_Internalname), 0) ;
         n826Docu_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A826Docu_FechaModifica", localUtil.ttoc( A826Docu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DOCU_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A826Docu_FechaModifica, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA819Docu_Nro"), ",", ".")) ;
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
      e139A2 ();
      if (returnInSub) return;
   }

   public void e139A2( )
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

   protected void e149A2( )
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
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_DOCUMENTOS" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Docu_Nro" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Docu_Nro, 4, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A819Docu_Nro = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
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
      pa9A2( ) ;
      ws9A2( ) ;
      we9A2( ) ;
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
      sCtrlA819Docu_Nro = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa9A2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_documentosgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa9A2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A819Docu_Nro = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
      }
      wcpOA819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA819Docu_Nro"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A819Docu_Nro != wcpOA819Docu_Nro ) ) )
      {
         setjustcreated();
      }
      wcpOA819Docu_Nro = A819Docu_Nro ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA819Docu_Nro = httpContext.cgiGet( sPrefix+"A819Docu_Nro_CTRL") ;
      if ( GXutil.len( sCtrlA819Docu_Nro) > 0 )
      {
         A819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlA819Docu_Nro), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
      }
      else
      {
         A819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A819Docu_Nro_PARM"), ",", ".")) ;
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
      pa9A2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws9A2( ) ;
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
      ws9A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A819Docu_Nro_PARM", GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA819Docu_Nro)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A819Docu_Nro_CTRL", GXutil.rtrim( sCtrlA819Docu_Nro));
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
      we9A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173477");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_documentosgeneral.js", "?201861414173477");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtDocu_Nro_Internalname = sPrefix+"DOCU_NRO" ;
      edtDocu_Descripcion_Internalname = sPrefix+"DOCU_DESCRIPCION" ;
      edtDocu_Prefijo_Internalname = sPrefix+"DOCU_PREFIJO" ;
      cmbDocu_Estado.setInternalname( sPrefix+"DOCU_ESTADO" );
      edtDocu_UsuarioCrea_Internalname = sPrefix+"DOCU_USUARIOCREA" ;
      edtDocu_FechaCrea_Internalname = sPrefix+"DOCU_FECHACREA" ;
      edtDocu_UsuarioModifica_Internalname = sPrefix+"DOCU_USUARIOMODIFICA" ;
      edtDocu_FechaModifica_Internalname = sPrefix+"DOCU_FECHAMODIFICA" ;
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
      edtDocu_FechaModifica_Jsonclick = "" ;
      edtDocu_FechaModifica_Enabled = 0 ;
      edtDocu_UsuarioModifica_Jsonclick = "" ;
      edtDocu_UsuarioModifica_Enabled = 0 ;
      edtDocu_FechaCrea_Jsonclick = "" ;
      edtDocu_FechaCrea_Enabled = 0 ;
      edtDocu_UsuarioCrea_Jsonclick = "" ;
      edtDocu_UsuarioCrea_Enabled = 0 ;
      cmbDocu_Estado.setJsonclick( "" );
      cmbDocu_Estado.setEnabled( 0 );
      edtDocu_Prefijo_Jsonclick = "" ;
      edtDocu_Prefijo_Enabled = 0 ;
      edtDocu_Descripcion_Jsonclick = "" ;
      edtDocu_Descripcion_Enabled = 0 ;
      edtDocu_Nro_Jsonclick = "" ;
      edtDocu_Nro_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e119A1',iparms:[{av:'A819Docu_Nro',fld:'DOCU_NRO',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e129A1',iparms:[{av:'A819Docu_Nro',fld:'DOCU_NRO',pic:'ZZZ9',nv:0}],oparms:[]}");
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
      A820Docu_Descripcion = "" ;
      A821Docu_Prefijo = "" ;
      A822Docu_Estado = "" ;
      A823Docu_UsuarioCrea = "" ;
      A824Docu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A825Docu_UsuarioModifica = "" ;
      A826Docu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
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
      H009A2_A819Docu_Nro = new short[1] ;
      H009A2_A826Docu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H009A2_n826Docu_FechaModifica = new boolean[] {false} ;
      H009A2_A825Docu_UsuarioModifica = new String[] {""} ;
      H009A2_n825Docu_UsuarioModifica = new boolean[] {false} ;
      H009A2_A824Docu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H009A2_n824Docu_FechaCrea = new boolean[] {false} ;
      H009A2_A823Docu_UsuarioCrea = new String[] {""} ;
      H009A2_n823Docu_UsuarioCrea = new boolean[] {false} ;
      H009A2_A822Docu_Estado = new String[] {""} ;
      H009A2_n822Docu_Estado = new boolean[] {false} ;
      H009A2_A821Docu_Prefijo = new String[] {""} ;
      H009A2_n821Docu_Prefijo = new boolean[] {false} ;
      H009A2_A820Docu_Descripcion = new String[] {""} ;
      H009A2_n820Docu_Descripcion = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA819Docu_Nro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_documentosgeneral__default(),
         new Object[] {
             new Object[] {
            H009A2_A819Docu_Nro, H009A2_A826Docu_FechaModifica, H009A2_n826Docu_FechaModifica, H009A2_A825Docu_UsuarioModifica, H009A2_n825Docu_UsuarioModifica, H009A2_A824Docu_FechaCrea, H009A2_n824Docu_FechaCrea, H009A2_A823Docu_UsuarioCrea, H009A2_n823Docu_UsuarioCrea, H009A2_A822Docu_Estado,
            H009A2_n822Docu_Estado, H009A2_A821Docu_Prefijo, H009A2_n821Docu_Prefijo, H009A2_A820Docu_Descripcion, H009A2_n820Docu_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_DOCUMENTOSGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_DOCUMENTOSGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOA819Docu_Nro ;
   private short A819Docu_Nro ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7Docu_Nro ;
   private int edtDocu_Nro_Enabled ;
   private int edtDocu_Descripcion_Enabled ;
   private int edtDocu_Prefijo_Enabled ;
   private int edtDocu_UsuarioCrea_Enabled ;
   private int edtDocu_FechaCrea_Enabled ;
   private int edtDocu_UsuarioModifica_Enabled ;
   private int edtDocu_FechaModifica_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A822Docu_Estado ;
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
   private String edtDocu_Nro_Internalname ;
   private String edtDocu_Nro_Jsonclick ;
   private String edtDocu_Descripcion_Internalname ;
   private String edtDocu_Descripcion_Jsonclick ;
   private String edtDocu_Prefijo_Internalname ;
   private String edtDocu_Prefijo_Jsonclick ;
   private String edtDocu_UsuarioCrea_Internalname ;
   private String edtDocu_UsuarioCrea_Jsonclick ;
   private String edtDocu_FechaCrea_Internalname ;
   private String edtDocu_FechaCrea_Jsonclick ;
   private String edtDocu_UsuarioModifica_Internalname ;
   private String edtDocu_UsuarioModifica_Jsonclick ;
   private String edtDocu_FechaModifica_Internalname ;
   private String edtDocu_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA819Docu_Nro ;
   private java.util.Date A824Docu_FechaCrea ;
   private java.util.Date A826Docu_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n822Docu_Estado ;
   private boolean n826Docu_FechaModifica ;
   private boolean n825Docu_UsuarioModifica ;
   private boolean n824Docu_FechaCrea ;
   private boolean n823Docu_UsuarioCrea ;
   private boolean n821Docu_Prefijo ;
   private boolean n820Docu_Descripcion ;
   private boolean returnInSub ;
   private String A820Docu_Descripcion ;
   private String A821Docu_Prefijo ;
   private String A823Docu_UsuarioCrea ;
   private String A825Docu_UsuarioModifica ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbDocu_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] H009A2_A819Docu_Nro ;
   private java.util.Date[] H009A2_A826Docu_FechaModifica ;
   private boolean[] H009A2_n826Docu_FechaModifica ;
   private String[] H009A2_A825Docu_UsuarioModifica ;
   private boolean[] H009A2_n825Docu_UsuarioModifica ;
   private java.util.Date[] H009A2_A824Docu_FechaCrea ;
   private boolean[] H009A2_n824Docu_FechaCrea ;
   private String[] H009A2_A823Docu_UsuarioCrea ;
   private boolean[] H009A2_n823Docu_UsuarioCrea ;
   private String[] H009A2_A822Docu_Estado ;
   private boolean[] H009A2_n822Docu_Estado ;
   private String[] H009A2_A821Docu_Prefijo ;
   private boolean[] H009A2_n821Docu_Prefijo ;
   private String[] H009A2_A820Docu_Descripcion ;
   private boolean[] H009A2_n820Docu_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_documentosgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009A2", "SELECT Docu_Nro, Docu_FechaModifica, Docu_UsuarioModifica, Docu_FechaCrea, Docu_UsuarioCrea, Docu_Estado, Docu_Prefijo, Docu_Descripcion FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ORDER BY Docu_Nro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

