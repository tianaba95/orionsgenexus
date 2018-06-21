/*
               File: alm_elementogeneral_impl
        Description: ALM_ELEMENTOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:47.66
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

public final  class alm_elementogeneral_impl extends GXWebComponent
{
   public alm_elementogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_elementogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_elementogeneral_impl.class ));
   }

   public alm_elementogeneral_impl( int remoteHandle ,
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
      cmbElem_Estado = new HTMLChoice();
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
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A66Elem_Consecutivo});
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
         pa4D2( ) ;
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
         httpContext.writeValue( "ALM_ELEMENTOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414164771");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_elementogeneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA66Elem_Consecutivo", wcpOA66Elem_Consecutivo);
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm4D2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_elementogeneral.js", "?201861414164772");
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
      return "ALM_ELEMENTOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ELEMENTOGeneral" ;
   }

   public void wb4D0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_elementogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e114d1_client"+"'", TempTags, "", 2, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e124d1_client"+"'", TempTags, "", 2, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, edtElem_Descripcion_Link, "", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Codigo_Internalname, "Código del Bien", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_Codigo_Internalname, A37Cata_Codigo, GXutil.rtrim( localUtil.format( A37Cata_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCata_Codigo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, edtCata_Descripcion_Link, "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtClas_Codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtClas_Descripcion_Link, "", "", "", edtClas_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Codigo_Internalname, "Familia Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Codigo_Internalname, A35FAM_Codigo, GXutil.rtrim( localUtil.format( A35FAM_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtFAM_Codigo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Descripcion_Internalname, "Familia Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Descripcion_Internalname, A447FAM_Descripcion, GXutil.rtrim( localUtil.format( A447FAM_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtFAM_Descripcion_Link, "", "", "", edtFAM_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtFAM_Descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Codigo_Internalname, "Segmento Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtSEG_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Descripcion_Internalname, "Segmento Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtSEG_Descripcion_Link, "", "", "", edtSEG_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Codigo_Internalname, "Tipo Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTIP_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Descripcion_Internalname, "Tipo Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtTIP_Descripcion_Link, "", "", "", edtTIP_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbElem_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbElem_Estado, cmbElem_Estado.getInternalname(), GXutil.rtrim( A558Elem_Estado), 1, cmbElem_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbElem_Estado.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ELEMENTOGeneral.htm");
         cmbElem_Estado.setValue( GXutil.rtrim( A558Elem_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbElem_Estado.getInternalname(), "Values", cmbElem_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtTipo_Descripcion_Link, "", "", "", edtTipo_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Internalname, "Vida_Util", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Internalname, GXutil.ltrim( localUtil.ntoc( A632Vida_Util, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtVida_Util_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUNIMED_COD_Internalname, "UNIDAD MEDIDA CODIGO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUNIMED_COD_Internalname, GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")), ((edtUNIMED_COD_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUNIMED_COD_Jsonclick, 0, "Attribute", "", "", "", edtUNIMED_COD_Visible, edtUNIMED_COD_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUNIMED_DES_Internalname, "UNIDAD MEDIDA DESCRIPCION", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtUNIMED_DES_Internalname, A496UNIMED_DES, "", "", (short)(0), edtUNIMED_DES_Visible, edtUNIMED_DES_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "Attribute", "", "", "", edtTipo_Codigo_Visible, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_UsuarioCreacion_Internalname, A570Elem_UsuarioCreacion, GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", edtElem_UsuarioCreacion_Visible, edtElem_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtElem_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_FechaCreacion_Internalname, localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", edtElem_FechaCreacion_Visible, edtElem_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtElem_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtElem_FechaCreacion_Visible==0)||(edtElem_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ELEMENTOGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_UsuarioModifica_Internalname, A572Elem_UsuarioModifica, GXutil.rtrim( localUtil.format( A572Elem_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", edtElem_UsuarioModifica_Visible, edtElem_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtElem_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_FechaModifica_Internalname, localUtil.ttoc( A573Elem_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A573Elem_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", edtElem_FechaModifica_Visible, edtElem_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtElem_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtElem_FechaModifica_Visible==0)||(edtElem_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ELEMENTOGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start4D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ELEMENTOGeneral", (short)(0)) ;
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
            strup4D0( ) ;
         }
      }
   }

   public void ws4D2( )
   {
      start4D2( ) ;
      evt4D2( ) ;
   }

   public void evt4D2( )
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
                              strup4D0( ) ;
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
                              strup4D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e134D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup4D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e144D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup4D0( ) ;
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
                              strup4D0( ) ;
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

   public void we4D2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm4D2( ) ;
         }
      }
   }

   public void pa4D2( )
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
         cmbElem_Estado.setName( "ELEM_ESTADO" );
         cmbElem_Estado.setWebtags( "" );
         cmbElem_Estado.addItem("A", "Activo", (short)(0));
         cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbElem_Estado.getItemCount() > 0 )
         {
            A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A558Elem_Estado", A558Elem_Estado);
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
      if ( cmbElem_Estado.getItemCount() > 0 )
      {
         A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A558Elem_Estado", A558Elem_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4D2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_ELEMENTOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf4D2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H004D2 */
         pr_default.execute(0, new Object[] {A66Elem_Consecutivo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A92Centro_Id = H004D2_A92Centro_Id[0] ;
            A94Num_Linea = H004D2_A94Num_Linea[0] ;
            A93Trans_Id = H004D2_A93Trans_Id[0] ;
            A31Bode_Codigo = H004D2_A31Bode_Codigo[0] ;
            A28Alma_Codigo = H004D2_A28Alma_Codigo[0] ;
            A27Alma_Modulo = H004D2_A27Alma_Modulo[0] ;
            A91Regional = H004D2_A91Regional[0] ;
            /* Execute user event: Load */
            e144D2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb4D0( ) ;
      }
   }

   public void strup4D0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_ELEMENTOGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H004D3 */
      pr_default.execute(1, new Object[] {A66Elem_Consecutivo});
      A573Elem_FechaModifica = H004D3_A573Elem_FechaModifica[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      n573Elem_FechaModifica = H004D3_n573Elem_FechaModifica[0] ;
      A572Elem_UsuarioModifica = H004D3_A572Elem_UsuarioModifica[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
      n572Elem_UsuarioModifica = H004D3_n572Elem_UsuarioModifica[0] ;
      A571Elem_FechaCreacion = H004D3_A571Elem_FechaCreacion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      n571Elem_FechaCreacion = H004D3_n571Elem_FechaCreacion[0] ;
      A570Elem_UsuarioCreacion = H004D3_A570Elem_UsuarioCreacion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
      n570Elem_UsuarioCreacion = H004D3_n570Elem_UsuarioCreacion[0] ;
      A33Tipo_Codigo = H004D3_A33Tipo_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      A77UNIMED_COD = H004D3_A77UNIMED_COD[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
      A632Vida_Util = H004D3_A632Vida_Util[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
      n632Vida_Util = H004D3_n632Vida_Util[0] ;
      A558Elem_Estado = H004D3_A558Elem_Estado[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A558Elem_Estado", A558Elem_Estado);
      A37Cata_Codigo = H004D3_A37Cata_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A37Cata_Codigo", A37Cata_Codigo);
      A557Elem_Descripcion = H004D3_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
      pr_default.close(1);
      /* Using cursor H004D4 */
      pr_default.execute(2, new Object[] {new Long(A33Tipo_Codigo)});
      A253Tipo_Descripcion = H004D4_A253Tipo_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      pr_default.close(2);
      /* Using cursor H004D5 */
      pr_default.execute(3, new Object[] {new Integer(A77UNIMED_COD)});
      A496UNIMED_DES = H004D5_A496UNIMED_DES[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A496UNIMED_DES", A496UNIMED_DES);
      pr_default.close(3);
      /* Using cursor H004D6 */
      pr_default.execute(4, new Object[] {A37Cata_Codigo});
      A34Clas_Codigo = H004D6_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34Clas_Codigo", A34Clas_Codigo);
      A298Cata_Descripcion = H004D6_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
      pr_default.close(4);
      /* Using cursor H004D7 */
      pr_default.execute(5, new Object[] {A34Clas_Codigo});
      A35FAM_Codigo = H004D7_A35FAM_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A35FAM_Codigo", A35FAM_Codigo);
      A291Clas_Descripcion = H004D7_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A291Clas_Descripcion", A291Clas_Descripcion);
      pr_default.close(5);
      /* Using cursor H004D8 */
      pr_default.execute(6, new Object[] {A35FAM_Codigo});
      A75SEG_Codigo = H004D8_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75SEG_Codigo", A75SEG_Codigo);
      A447FAM_Descripcion = H004D8_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A447FAM_Descripcion", A447FAM_Descripcion);
      pr_default.close(6);
      /* Using cursor H004D9 */
      pr_default.execute(7, new Object[] {A75SEG_Codigo});
      A74TIP_Codigo = H004D9_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A74TIP_Codigo", A74TIP_Codigo);
      A442SEG_Descripcion = H004D9_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442SEG_Descripcion", A442SEG_Descripcion);
      pr_default.close(7);
      /* Using cursor H004D10 */
      pr_default.execute(8, new Object[] {A74TIP_Codigo});
      A435TIP_Descripcion = H004D10_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(8);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e134D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A37Cata_Codigo", A37Cata_Codigo);
         A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34Clas_Codigo", A34Clas_Codigo);
         A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A35FAM_Codigo", A35FAM_Codigo);
         A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A75SEG_Codigo", A75SEG_Codigo);
         A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A74TIP_Codigo", A74TIP_Codigo);
         A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A435TIP_Descripcion", A435TIP_Descripcion);
         cmbElem_Estado.setValue( httpContext.cgiGet( cmbElem_Estado.getInternalname()) );
         A558Elem_Estado = httpContext.cgiGet( cmbElem_Estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A558Elem_Estado", A558Elem_Estado);
         A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A632Vida_Util = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Internalname), ",", ".")) ;
         n632Vida_Util = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
         A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
         A496UNIMED_DES = httpContext.cgiGet( edtUNIMED_DES_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A496UNIMED_DES", A496UNIMED_DES);
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A570Elem_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioCreacion_Internalname)) ;
         n570Elem_UsuarioCreacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
         A571Elem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtElem_FechaCreacion_Internalname), 0) ;
         n571Elem_FechaCreacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A572Elem_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioModifica_Internalname)) ;
         n572Elem_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
         A573Elem_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtElem_FechaModifica_Internalname), 0) ;
         n573Elem_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         /* Read saved values. */
         wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
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
      e134D2 ();
      if (returnInSub) return;
   }

   public void e134D2( )
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

   protected void e144D2( )
   {
      /* Load Routine */
      edtElem_Descripcion_Link = formatLink("com.orions2.viewalm_inv_con") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A91Regional,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A93Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A94Num_Linea,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A92Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_Descripcion_Internalname, "Link", edtElem_Descripcion_Link, true);
      edtCata_Descripcion_Link = formatLink("com.orions2.viewalm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(A37Cata_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCata_Descripcion_Internalname, "Link", edtCata_Descripcion_Link, true);
      edtClas_Descripcion_Link = formatLink("com.orions2.viewalm_clase") + "?" + GXutil.URLEncode(GXutil.rtrim(A34Clas_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtClas_Descripcion_Internalname, "Link", edtClas_Descripcion_Link, true);
      edtFAM_Descripcion_Link = formatLink("com.orions2.viewalm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim(A35FAM_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFAM_Descripcion_Internalname, "Link", edtFAM_Descripcion_Link, true);
      edtSEG_Descripcion_Link = formatLink("com.orions2.viewalm_cat_seg") + "?" + GXutil.URLEncode(GXutil.rtrim(A75SEG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSEG_Descripcion_Internalname, "Link", edtSEG_Descripcion_Link, true);
      edtTIP_Descripcion_Link = formatLink("com.orions2.viewalm_cat_tip") + "?" + GXutil.URLEncode(GXutil.rtrim(A74TIP_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTIP_Descripcion_Internalname, "Link", edtTIP_Descripcion_Link, true);
      edtTipo_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_elemento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A33Tipo_Codigo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipo_Descripcion_Internalname, "Link", edtTipo_Descripcion_Link, true);
      edtUNIMED_COD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtUNIMED_COD_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtUNIMED_COD_Visible, 5, 0)), true);
      edtUNIMED_DES_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtUNIMED_DES_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtUNIMED_DES_Visible, 5, 0)), true);
      edtTipo_Codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipo_Codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Visible, 5, 0)), true);
      edtElem_UsuarioCreacion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_UsuarioCreacion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtElem_UsuarioCreacion_Visible, 5, 0)), true);
      edtElem_FechaCreacion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_FechaCreacion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtElem_FechaCreacion_Visible, 5, 0)), true);
      edtElem_UsuarioModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_UsuarioModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtElem_UsuarioModifica_Visible, 5, 0)), true);
      edtElem_FechaModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtElem_FechaModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtElem_FechaModifica_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ELEMENTO" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Elem_Consecutivo" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Elem_Consecutivo );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A66Elem_Consecutivo = (String)getParm(obj,0,TypeConstants.STRING) ;
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
      pa4D2( ) ;
      ws4D2( ) ;
      we4D2( ) ;
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
      sCtrlA66Elem_Consecutivo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa4D2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_elementogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa4D2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A66Elem_Consecutivo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      wcpOA66Elem_Consecutivo = httpContext.cgiGet( sPrefix+"wcpOA66Elem_Consecutivo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A66Elem_Consecutivo, wcpOA66Elem_Consecutivo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA66Elem_Consecutivo = A66Elem_Consecutivo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      pa4D2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws4D2( ) ;
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
      ws4D2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      we4D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414164936");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_elementogeneral.js", "?201861414164936");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtElem_Consecutivo_Internalname = sPrefix+"ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = sPrefix+"ELEM_DESCRIPCION" ;
      edtCata_Codigo_Internalname = sPrefix+"CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = sPrefix+"CATA_DESCRIPCION" ;
      edtClas_Codigo_Internalname = sPrefix+"CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = sPrefix+"CLAS_DESCRIPCION" ;
      edtFAM_Codigo_Internalname = sPrefix+"FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = sPrefix+"FAM_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = sPrefix+"SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = sPrefix+"SEG_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = sPrefix+"TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = sPrefix+"TIP_DESCRIPCION" ;
      cmbElem_Estado.setInternalname( sPrefix+"ELEM_ESTADO" );
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION" ;
      edtVida_Util_Internalname = sPrefix+"VIDA_UTIL" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtUNIMED_COD_Internalname = sPrefix+"UNIMED_COD" ;
      edtUNIMED_DES_Internalname = sPrefix+"UNIMED_DES" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtElem_UsuarioCreacion_Internalname = sPrefix+"ELEM_USUARIOCREACION" ;
      edtElem_FechaCreacion_Internalname = sPrefix+"ELEM_FECHACREACION" ;
      edtElem_UsuarioModifica_Internalname = sPrefix+"ELEM_USUARIOMODIFICA" ;
      edtElem_FechaModifica_Internalname = sPrefix+"ELEM_FECHAMODIFICA" ;
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
      edtElem_FechaModifica_Jsonclick = "" ;
      edtElem_FechaModifica_Enabled = 0 ;
      edtElem_FechaModifica_Visible = 1 ;
      edtElem_UsuarioModifica_Jsonclick = "" ;
      edtElem_UsuarioModifica_Enabled = 0 ;
      edtElem_UsuarioModifica_Visible = 1 ;
      edtElem_FechaCreacion_Jsonclick = "" ;
      edtElem_FechaCreacion_Enabled = 0 ;
      edtElem_FechaCreacion_Visible = 1 ;
      edtElem_UsuarioCreacion_Jsonclick = "" ;
      edtElem_UsuarioCreacion_Enabled = 0 ;
      edtElem_UsuarioCreacion_Visible = 1 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
      edtTipo_Codigo_Visible = 1 ;
      edtUNIMED_DES_Enabled = 0 ;
      edtUNIMED_DES_Visible = 1 ;
      edtUNIMED_COD_Jsonclick = "" ;
      edtUNIMED_COD_Enabled = 0 ;
      edtUNIMED_COD_Visible = 1 ;
      edtVida_Util_Jsonclick = "" ;
      edtVida_Util_Enabled = 0 ;
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Link = "" ;
      edtTipo_Descripcion_Enabled = 0 ;
      cmbElem_Estado.setJsonclick( "" );
      cmbElem_Estado.setEnabled( 0 );
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Link = "" ;
      edtTIP_Descripcion_Enabled = 0 ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 0 ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Descripcion_Link = "" ;
      edtSEG_Descripcion_Enabled = 0 ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 0 ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Descripcion_Link = "" ;
      edtFAM_Descripcion_Enabled = 0 ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtFAM_Codigo_Enabled = 0 ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Link = "" ;
      edtClas_Descripcion_Enabled = 0 ;
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 0 ;
      edtCata_Descripcion_Link = "" ;
      edtCata_Descripcion_Enabled = 0 ;
      edtCata_Codigo_Jsonclick = "" ;
      edtCata_Codigo_Enabled = 0 ;
      edtElem_Descripcion_Link = "" ;
      edtElem_Descripcion_Enabled = 0 ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e114D1',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e124D1',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
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
      wcpOA66Elem_Consecutivo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A66Elem_Consecutivo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A557Elem_Descripcion = "" ;
      A37Cata_Codigo = "" ;
      A298Cata_Descripcion = "" ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      A35FAM_Codigo = "" ;
      A447FAM_Descripcion = "" ;
      A75SEG_Codigo = "" ;
      A442SEG_Descripcion = "" ;
      A74TIP_Codigo = "" ;
      A435TIP_Descripcion = "" ;
      A558Elem_Estado = "" ;
      A253Tipo_Descripcion = "" ;
      A496UNIMED_DES = "" ;
      A570Elem_UsuarioCreacion = "" ;
      A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A572Elem_UsuarioModifica = "" ;
      A573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H004D2_A66Elem_Consecutivo = new String[] {""} ;
      H004D2_A92Centro_Id = new long[1] ;
      H004D2_A94Num_Linea = new int[1] ;
      H004D2_A93Trans_Id = new long[1] ;
      H004D2_A31Bode_Codigo = new String[] {""} ;
      H004D2_A28Alma_Codigo = new String[] {""} ;
      H004D2_A27Alma_Modulo = new String[] {""} ;
      H004D2_A91Regional = new long[1] ;
      H004D2_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H004D2_n573Elem_FechaModifica = new boolean[] {false} ;
      H004D2_A572Elem_UsuarioModifica = new String[] {""} ;
      H004D2_n572Elem_UsuarioModifica = new boolean[] {false} ;
      H004D2_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H004D2_n571Elem_FechaCreacion = new boolean[] {false} ;
      H004D2_A570Elem_UsuarioCreacion = new String[] {""} ;
      H004D2_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      H004D2_A33Tipo_Codigo = new long[1] ;
      H004D2_A496UNIMED_DES = new String[] {""} ;
      H004D2_A77UNIMED_COD = new int[1] ;
      H004D2_A632Vida_Util = new short[1] ;
      H004D2_n632Vida_Util = new boolean[] {false} ;
      H004D2_A253Tipo_Descripcion = new String[] {""} ;
      H004D2_A558Elem_Estado = new String[] {""} ;
      H004D2_A435TIP_Descripcion = new String[] {""} ;
      H004D2_A74TIP_Codigo = new String[] {""} ;
      H004D2_A442SEG_Descripcion = new String[] {""} ;
      H004D2_A75SEG_Codigo = new String[] {""} ;
      H004D2_A447FAM_Descripcion = new String[] {""} ;
      H004D2_A35FAM_Codigo = new String[] {""} ;
      H004D2_A291Clas_Descripcion = new String[] {""} ;
      H004D2_A34Clas_Codigo = new String[] {""} ;
      H004D2_A298Cata_Descripcion = new String[] {""} ;
      H004D2_A37Cata_Codigo = new String[] {""} ;
      H004D2_A557Elem_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      H004D3_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H004D3_n573Elem_FechaModifica = new boolean[] {false} ;
      H004D3_A572Elem_UsuarioModifica = new String[] {""} ;
      H004D3_n572Elem_UsuarioModifica = new boolean[] {false} ;
      H004D3_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H004D3_n571Elem_FechaCreacion = new boolean[] {false} ;
      H004D3_A570Elem_UsuarioCreacion = new String[] {""} ;
      H004D3_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      H004D3_A33Tipo_Codigo = new long[1] ;
      H004D3_A77UNIMED_COD = new int[1] ;
      H004D3_A632Vida_Util = new short[1] ;
      H004D3_n632Vida_Util = new boolean[] {false} ;
      H004D3_A558Elem_Estado = new String[] {""} ;
      H004D3_A37Cata_Codigo = new String[] {""} ;
      H004D3_A557Elem_Descripcion = new String[] {""} ;
      H004D4_A253Tipo_Descripcion = new String[] {""} ;
      H004D5_A496UNIMED_DES = new String[] {""} ;
      H004D6_A34Clas_Codigo = new String[] {""} ;
      H004D6_A298Cata_Descripcion = new String[] {""} ;
      H004D7_A35FAM_Codigo = new String[] {""} ;
      H004D7_A291Clas_Descripcion = new String[] {""} ;
      H004D8_A75SEG_Codigo = new String[] {""} ;
      H004D8_A447FAM_Descripcion = new String[] {""} ;
      H004D9_A74TIP_Codigo = new String[] {""} ;
      H004D9_A442SEG_Descripcion = new String[] {""} ;
      H004D10_A435TIP_Descripcion = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7Elem_Consecutivo = "" ;
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA66Elem_Consecutivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_elementogeneral__default(),
         new Object[] {
             new Object[] {
            H004D2_A66Elem_Consecutivo, H004D2_A92Centro_Id, H004D2_A94Num_Linea, H004D2_A93Trans_Id, H004D2_A31Bode_Codigo, H004D2_A28Alma_Codigo, H004D2_A27Alma_Modulo, H004D2_A91Regional, H004D2_A573Elem_FechaModifica, H004D2_n573Elem_FechaModifica,
            H004D2_A572Elem_UsuarioModifica, H004D2_n572Elem_UsuarioModifica, H004D2_A571Elem_FechaCreacion, H004D2_n571Elem_FechaCreacion, H004D2_A570Elem_UsuarioCreacion, H004D2_n570Elem_UsuarioCreacion, H004D2_A33Tipo_Codigo, H004D2_A496UNIMED_DES, H004D2_A77UNIMED_COD, H004D2_A632Vida_Util,
            H004D2_n632Vida_Util, H004D2_A253Tipo_Descripcion, H004D2_A558Elem_Estado, H004D2_A435TIP_Descripcion, H004D2_A74TIP_Codigo, H004D2_A442SEG_Descripcion, H004D2_A75SEG_Codigo, H004D2_A447FAM_Descripcion, H004D2_A35FAM_Codigo, H004D2_A291Clas_Descripcion,
            H004D2_A34Clas_Codigo, H004D2_A298Cata_Descripcion, H004D2_A37Cata_Codigo, H004D2_A557Elem_Descripcion
            }
            , new Object[] {
            H004D3_A573Elem_FechaModifica, H004D3_n573Elem_FechaModifica, H004D3_A572Elem_UsuarioModifica, H004D3_n572Elem_UsuarioModifica, H004D3_A571Elem_FechaCreacion, H004D3_n571Elem_FechaCreacion, H004D3_A570Elem_UsuarioCreacion, H004D3_n570Elem_UsuarioCreacion, H004D3_A33Tipo_Codigo, H004D3_A77UNIMED_COD,
            H004D3_A632Vida_Util, H004D3_n632Vida_Util, H004D3_A558Elem_Estado, H004D3_A37Cata_Codigo, H004D3_A557Elem_Descripcion
            }
            , new Object[] {
            H004D4_A253Tipo_Descripcion
            }
            , new Object[] {
            H004D5_A496UNIMED_DES
            }
            , new Object[] {
            H004D6_A34Clas_Codigo, H004D6_A298Cata_Descripcion
            }
            , new Object[] {
            H004D7_A35FAM_Codigo, H004D7_A291Clas_Descripcion
            }
            , new Object[] {
            H004D8_A75SEG_Codigo, H004D8_A447FAM_Descripcion
            }
            , new Object[] {
            H004D9_A74TIP_Codigo, H004D9_A442SEG_Descripcion
            }
            , new Object[] {
            H004D10_A435TIP_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_ELEMENTOGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_ELEMENTOGeneral" ;
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
   private short A632Vida_Util ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtElem_Consecutivo_Enabled ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Codigo_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int edtClas_Descripcion_Enabled ;
   private int edtFAM_Codigo_Enabled ;
   private int edtFAM_Descripcion_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtTipo_Descripcion_Enabled ;
   private int edtVida_Util_Enabled ;
   private int A77UNIMED_COD ;
   private int edtUNIMED_COD_Enabled ;
   private int edtUNIMED_COD_Visible ;
   private int edtUNIMED_DES_Visible ;
   private int edtUNIMED_DES_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int edtTipo_Codigo_Visible ;
   private int edtElem_UsuarioCreacion_Visible ;
   private int edtElem_UsuarioCreacion_Enabled ;
   private int edtElem_FechaCreacion_Visible ;
   private int edtElem_FechaCreacion_Enabled ;
   private int edtElem_UsuarioModifica_Visible ;
   private int edtElem_UsuarioModifica_Enabled ;
   private int edtElem_FechaModifica_Visible ;
   private int edtElem_FechaModifica_Enabled ;
   private int A94Num_Linea ;
   private int idxLst ;
   private long A33Tipo_Codigo ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long A91Regional ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtElem_Descripcion_Internalname ;
   private String edtElem_Descripcion_Link ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Internalname ;
   private String edtCata_Descripcion_Link ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Internalname ;
   private String edtClas_Descripcion_Link ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtFAM_Descripcion_Link ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtSEG_Descripcion_Link ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Link ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String A558Elem_Estado ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Link ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtVida_Util_Internalname ;
   private String edtVida_Util_Jsonclick ;
   private String edtUNIMED_COD_Internalname ;
   private String edtUNIMED_COD_Jsonclick ;
   private String edtUNIMED_DES_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtElem_UsuarioCreacion_Internalname ;
   private String edtElem_UsuarioCreacion_Jsonclick ;
   private String edtElem_FechaCreacion_Internalname ;
   private String edtElem_FechaCreacion_Jsonclick ;
   private String edtElem_UsuarioModifica_Internalname ;
   private String edtElem_UsuarioModifica_Jsonclick ;
   private String edtElem_FechaModifica_Internalname ;
   private String edtElem_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA66Elem_Consecutivo ;
   private java.util.Date A571Elem_FechaCreacion ;
   private java.util.Date A573Elem_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n573Elem_FechaModifica ;
   private boolean n572Elem_UsuarioModifica ;
   private boolean n571Elem_FechaCreacion ;
   private boolean n570Elem_UsuarioCreacion ;
   private boolean n632Vida_Util ;
   private boolean returnInSub ;
   private String wcpOA66Elem_Consecutivo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A37Cata_Codigo ;
   private String A298Cata_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A35FAM_Codigo ;
   private String A447FAM_Descripcion ;
   private String A75SEG_Codigo ;
   private String A442SEG_Descripcion ;
   private String A74TIP_Codigo ;
   private String A435TIP_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A496UNIMED_DES ;
   private String A570Elem_UsuarioCreacion ;
   private String A572Elem_UsuarioModifica ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String AV7Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbElem_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H004D2_A66Elem_Consecutivo ;
   private long[] H004D2_A92Centro_Id ;
   private int[] H004D2_A94Num_Linea ;
   private long[] H004D2_A93Trans_Id ;
   private String[] H004D2_A31Bode_Codigo ;
   private String[] H004D2_A28Alma_Codigo ;
   private String[] H004D2_A27Alma_Modulo ;
   private long[] H004D2_A91Regional ;
   private java.util.Date[] H004D2_A573Elem_FechaModifica ;
   private boolean[] H004D2_n573Elem_FechaModifica ;
   private String[] H004D2_A572Elem_UsuarioModifica ;
   private boolean[] H004D2_n572Elem_UsuarioModifica ;
   private java.util.Date[] H004D2_A571Elem_FechaCreacion ;
   private boolean[] H004D2_n571Elem_FechaCreacion ;
   private String[] H004D2_A570Elem_UsuarioCreacion ;
   private boolean[] H004D2_n570Elem_UsuarioCreacion ;
   private long[] H004D2_A33Tipo_Codigo ;
   private String[] H004D2_A496UNIMED_DES ;
   private int[] H004D2_A77UNIMED_COD ;
   private short[] H004D2_A632Vida_Util ;
   private boolean[] H004D2_n632Vida_Util ;
   private String[] H004D2_A253Tipo_Descripcion ;
   private String[] H004D2_A558Elem_Estado ;
   private String[] H004D2_A435TIP_Descripcion ;
   private String[] H004D2_A74TIP_Codigo ;
   private String[] H004D2_A442SEG_Descripcion ;
   private String[] H004D2_A75SEG_Codigo ;
   private String[] H004D2_A447FAM_Descripcion ;
   private String[] H004D2_A35FAM_Codigo ;
   private String[] H004D2_A291Clas_Descripcion ;
   private String[] H004D2_A34Clas_Codigo ;
   private String[] H004D2_A298Cata_Descripcion ;
   private String[] H004D2_A37Cata_Codigo ;
   private String[] H004D2_A557Elem_Descripcion ;
   private java.util.Date[] H004D3_A573Elem_FechaModifica ;
   private boolean[] H004D3_n573Elem_FechaModifica ;
   private String[] H004D3_A572Elem_UsuarioModifica ;
   private boolean[] H004D3_n572Elem_UsuarioModifica ;
   private java.util.Date[] H004D3_A571Elem_FechaCreacion ;
   private boolean[] H004D3_n571Elem_FechaCreacion ;
   private String[] H004D3_A570Elem_UsuarioCreacion ;
   private boolean[] H004D3_n570Elem_UsuarioCreacion ;
   private long[] H004D3_A33Tipo_Codigo ;
   private int[] H004D3_A77UNIMED_COD ;
   private short[] H004D3_A632Vida_Util ;
   private boolean[] H004D3_n632Vida_Util ;
   private String[] H004D3_A558Elem_Estado ;
   private String[] H004D3_A37Cata_Codigo ;
   private String[] H004D3_A557Elem_Descripcion ;
   private String[] H004D4_A253Tipo_Descripcion ;
   private String[] H004D5_A496UNIMED_DES ;
   private String[] H004D6_A34Clas_Codigo ;
   private String[] H004D6_A298Cata_Descripcion ;
   private String[] H004D7_A35FAM_Codigo ;
   private String[] H004D7_A291Clas_Descripcion ;
   private String[] H004D8_A75SEG_Codigo ;
   private String[] H004D8_A447FAM_Descripcion ;
   private String[] H004D9_A74TIP_Codigo ;
   private String[] H004D9_A442SEG_Descripcion ;
   private String[] H004D10_A435TIP_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_elementogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004D2", "SELECT T1.Elem_Consecutivo, T1.Centro_Id, T1.Num_Linea, T1.Trans_Id, T1.Bode_Codigo, T1.Alma_Codigo, T1.Alma_Modulo, T1.Regional, T2.Elem_FechaModifica, T2.Elem_UsuarioModifica, T2.Elem_FechaCreacion, T2.Elem_UsuarioCreacion, T2.Tipo_Codigo, T4.UNIMED_DES, T2.UNIMED_COD, T2.Vida_Util, T3.Tipo_Descripcion, T2.Elem_Estado, T9.TIP_Descripcion, T8.TIP_Codigo, T8.SEG_Descripcion, T7.SEG_Codigo, T7.FAM_Descripcion, T6.FAM_Codigo, T6.Clas_Descripcion, T5.Clas_Codigo, T5.Cata_Descripcion, T2.Cata_Codigo, T2.Elem_Descripcion FROM ((((((((ALM_INV_CON T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_TIPO_ELEMENTO T3 ON T3.Tipo_Codigo = T2.Tipo_Codigo) INNER JOIN ALM_UNIDAD_MEDIDA T4 ON T4.UNIMED_COD = T2.UNIMED_COD) INNER JOIN ALM_CATALOGO T5 ON T5.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T6 ON T6.Clas_Codigo = T5.Clas_Codigo) INNER JOIN ALM_CAT_FAM T7 ON T7.FAM_Codigo = T6.FAM_Codigo) INNER JOIN ALM_CAT_SEG T8 ON T8.SEG_Codigo = T7.SEG_Codigo) INNER JOIN ALM_CAT_TIP T9 ON T9.TIP_Codigo = T8.TIP_Codigo) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H004D3", "SELECT Elem_FechaModifica, Elem_UsuarioModifica, Elem_FechaCreacion, Elem_UsuarioCreacion, Tipo_Codigo, UNIMED_COD, Vida_Util, Elem_Estado, Cata_Codigo, Elem_Descripcion FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D4", "SELECT Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D5", "SELECT UNIMED_DES FROM ALM_UNIDAD_MEDIDA WHERE UNIMED_COD = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D6", "SELECT Clas_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D7", "SELECT FAM_Codigo, Clas_Descripcion FROM ALM_CLASE WHERE Clas_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D8", "SELECT SEG_Codigo, FAM_Descripcion FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D9", "SELECT TIP_Codigo, SEG_Descripcion FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H004D10", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((int[]) buf[18])[0] = rslt.getInt(15) ;
               ((short[]) buf[19])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[22])[0] = rslt.getString(18, 1) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(25) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(26) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(27) ;
               ((String[]) buf[32])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[33])[0] = rslt.getVarchar(29) ;
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((int[]) buf[9])[0] = rslt.getInt(6) ;
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 8 :
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

