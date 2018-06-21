/*
               File: rpt_reportegeneral_impl
        Description: RPT_REPORTEGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:45.10
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

public final  class rpt_reportegeneral_impl extends GXWebComponent
{
   public rpt_reportegeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rpt_reportegeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_reportegeneral_impl.class ));
   }

   public rpt_reportegeneral_impl( int remoteHandle ,
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
      cmbRPT_REP_FORMATO = new HTMLChoice();
      cmbRPT_REP_ESTADO = new HTMLChoice();
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
               A843RPT_REP_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Short(A843RPT_REP_ID)});
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
         pa9S2( ) ;
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
         httpContext.writeValue( "RPT_REPORTEGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414174513");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.rpt_reportegeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A843RPT_REP_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA843RPT_REP_ID", GXutil.ltrim( localUtil.ntoc( wcpOA843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_FORMATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_FECHA_CREACION", getSecureSignedToken( sPrefix, localUtil.format( A847RPT_REP_FECHA_CREACION, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_USUARIO_CREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A848RPT_REP_USUARIO_CREACION, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_FECHA_MODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A849RPT_REP_FECHA_MODIFICA, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A850RPT_REP_USUARIO_MODIFICA, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_REP_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A851RPT_REP_ESTADO, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm9S2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("rpt_reportegeneral.js", "?201861414174516");
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
      return "RPT_REPORTEGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "RPT_REPORTEGeneral" ;
   }

   public void wb9S0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.rpt_reportegeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e119s1_client"+"'", TempTags, "", 2, "HLP_RPT_REPORTEGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e129s1_client"+"'", TempTags, "", 2, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_ID_Internalname, "Reporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")), ((edtRPT_REP_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_NOMBRE_Internalname, "del reporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_NOMBRE_Internalname, A844RPT_REP_NOMBRE, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_NOMBRE_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_NOMBRE_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_DESCRIPCION_Internalname, "del reporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_DESCRIPCION_Internalname, A845RPT_REP_DESCRIPCION, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_DESCRIPCION_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_DESCRIPCION_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_REP_FORMATO.getInternalname(), "Formato", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_REP_FORMATO, cmbRPT_REP_FORMATO.getInternalname(), GXutil.rtrim( A846RPT_REP_FORMATO), 1, cmbRPT_REP_FORMATO.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbRPT_REP_FORMATO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_RPT_REPORTEGeneral.htm");
         cmbRPT_REP_FORMATO.setValue( GXutil.rtrim( A846RPT_REP_FORMATO) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRPT_REP_FORMATO.getInternalname(), "Values", cmbRPT_REP_FORMATO.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_FECHA_CREACION_Internalname, "de Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRPT_REP_FECHA_CREACION_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_FECHA_CREACION_Internalname, localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A847RPT_REP_FECHA_CREACION, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_FECHA_CREACION_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_FECHA_CREACION_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_REPORTEGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRPT_REP_FECHA_CREACION_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRPT_REP_FECHA_CREACION_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_USUARIO_CREACION_Internalname, "de Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_USUARIO_CREACION_Internalname, A848RPT_REP_USUARIO_CREACION, GXutil.rtrim( localUtil.format( A848RPT_REP_USUARIO_CREACION, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_USUARIO_CREACION_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_USUARIO_CREACION_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_FECHA_MODIFICA_Internalname, "de Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRPT_REP_FECHA_MODIFICA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_FECHA_MODIFICA_Internalname, localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A849RPT_REP_FECHA_MODIFICA, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_FECHA_MODIFICA_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_FECHA_MODIFICA_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_REPORTEGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRPT_REP_FECHA_MODIFICA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRPT_REP_FECHA_MODIFICA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_USUARIO_MODIFICA_Internalname, "Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_USUARIO_MODIFICA_Internalname, A850RPT_REP_USUARIO_MODIFICA, GXutil.rtrim( localUtil.format( A850RPT_REP_USUARIO_MODIFICA, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_USUARIO_MODIFICA_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_REP_USUARIO_MODIFICA_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_RPT_REPORTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_REP_ESTADO.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_REP_ESTADO, cmbRPT_REP_ESTADO.getInternalname(), GXutil.rtrim( A851RPT_REP_ESTADO), 1, cmbRPT_REP_ESTADO.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRPT_REP_ESTADO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_RPT_REPORTEGeneral.htm");
         cmbRPT_REP_ESTADO.setValue( GXutil.rtrim( A851RPT_REP_ESTADO) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRPT_REP_ESTADO.getInternalname(), "Values", cmbRPT_REP_ESTADO.ToJavascriptSource(), true);
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

   public void start9S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "RPT_REPORTEGeneral", (short)(0)) ;
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
            strup9S0( ) ;
         }
      }
   }

   public void ws9S2( )
   {
      start9S2( ) ;
      evt9S2( ) ;
   }

   public void evt9S2( )
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
                              strup9S0( ) ;
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
                              strup9S0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e139S2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9S0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e149S2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9S0( ) ;
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
                              strup9S0( ) ;
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

   public void we9S2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm9S2( ) ;
         }
      }
   }

   public void pa9S2( )
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
         cmbRPT_REP_FORMATO.setName( "RPT_REP_FORMATO" );
         cmbRPT_REP_FORMATO.setWebtags( "" );
         cmbRPT_REP_FORMATO.addItem("EXC", "EXCEL", (short)(0));
         cmbRPT_REP_FORMATO.addItem("PDF", "PDF", (short)(0));
         if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
         {
            A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
            n846RPT_REP_FORMATO = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FORMATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
         }
         cmbRPT_REP_ESTADO.setName( "RPT_REP_ESTADO" );
         cmbRPT_REP_ESTADO.setWebtags( "" );
         cmbRPT_REP_ESTADO.addItem("", "SELECCIONAR", (short)(0));
         cmbRPT_REP_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_REP_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_REP_ESTADO.getItemCount() > 0 )
         {
            A851RPT_REP_ESTADO = cmbRPT_REP_ESTADO.getValidValue(A851RPT_REP_ESTADO) ;
            n851RPT_REP_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A851RPT_REP_ESTADO, ""))));
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
      if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
      {
         A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
         n846RPT_REP_FORMATO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FORMATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
      }
      if ( cmbRPT_REP_ESTADO.getItemCount() > 0 )
      {
         A851RPT_REP_ESTADO = cmbRPT_REP_ESTADO.getValidValue(A851RPT_REP_ESTADO) ;
         n851RPT_REP_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A851RPT_REP_ESTADO, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "RPT_REPORTEGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf9S2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H009S2 */
         pr_default.execute(0, new Object[] {new Short(A843RPT_REP_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A851RPT_REP_ESTADO = H009S2_A851RPT_REP_ESTADO[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A851RPT_REP_ESTADO, ""))));
            n851RPT_REP_ESTADO = H009S2_n851RPT_REP_ESTADO[0] ;
            A850RPT_REP_USUARIO_MODIFICA = H009S2_A850RPT_REP_USUARIO_MODIFICA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A850RPT_REP_USUARIO_MODIFICA", A850RPT_REP_USUARIO_MODIFICA);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A850RPT_REP_USUARIO_MODIFICA, "@!"))));
            n850RPT_REP_USUARIO_MODIFICA = H009S2_n850RPT_REP_USUARIO_MODIFICA[0] ;
            A849RPT_REP_FECHA_MODIFICA = H009S2_A849RPT_REP_FECHA_MODIFICA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A849RPT_REP_FECHA_MODIFICA", localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FECHA_MODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A849RPT_REP_FECHA_MODIFICA, "99/99/99 99:99")));
            n849RPT_REP_FECHA_MODIFICA = H009S2_n849RPT_REP_FECHA_MODIFICA[0] ;
            A848RPT_REP_USUARIO_CREACION = H009S2_A848RPT_REP_USUARIO_CREACION[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A848RPT_REP_USUARIO_CREACION", A848RPT_REP_USUARIO_CREACION);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_USUARIO_CREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A848RPT_REP_USUARIO_CREACION, "@!"))));
            n848RPT_REP_USUARIO_CREACION = H009S2_n848RPT_REP_USUARIO_CREACION[0] ;
            A847RPT_REP_FECHA_CREACION = H009S2_A847RPT_REP_FECHA_CREACION[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A847RPT_REP_FECHA_CREACION", localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FECHA_CREACION", getSecureSignedToken( sPrefix, localUtil.format( A847RPT_REP_FECHA_CREACION, "99/99/99 99:99")));
            n847RPT_REP_FECHA_CREACION = H009S2_n847RPT_REP_FECHA_CREACION[0] ;
            A846RPT_REP_FORMATO = H009S2_A846RPT_REP_FORMATO[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FORMATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
            n846RPT_REP_FORMATO = H009S2_n846RPT_REP_FORMATO[0] ;
            A845RPT_REP_DESCRIPCION = H009S2_A845RPT_REP_DESCRIPCION[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, ""))));
            n845RPT_REP_DESCRIPCION = H009S2_n845RPT_REP_DESCRIPCION[0] ;
            A844RPT_REP_NOMBRE = H009S2_A844RPT_REP_NOMBRE[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, ""))));
            n844RPT_REP_NOMBRE = H009S2_n844RPT_REP_NOMBRE[0] ;
            /* Execute user event: Load */
            e149S2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb9S0( ) ;
      }
   }

   public void strup9S0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "RPT_REPORTEGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e139S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A844RPT_REP_NOMBRE = httpContext.cgiGet( edtRPT_REP_NOMBRE_Internalname) ;
         n844RPT_REP_NOMBRE = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, ""))));
         A845RPT_REP_DESCRIPCION = httpContext.cgiGet( edtRPT_REP_DESCRIPCION_Internalname) ;
         n845RPT_REP_DESCRIPCION = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, ""))));
         cmbRPT_REP_FORMATO.setValue( httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) );
         A846RPT_REP_FORMATO = httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) ;
         n846RPT_REP_FORMATO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FORMATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
         A847RPT_REP_FECHA_CREACION = localUtil.ctot( httpContext.cgiGet( edtRPT_REP_FECHA_CREACION_Internalname), 0) ;
         n847RPT_REP_FECHA_CREACION = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A847RPT_REP_FECHA_CREACION", localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FECHA_CREACION", getSecureSignedToken( sPrefix, localUtil.format( A847RPT_REP_FECHA_CREACION, "99/99/99 99:99")));
         A848RPT_REP_USUARIO_CREACION = GXutil.upper( httpContext.cgiGet( edtRPT_REP_USUARIO_CREACION_Internalname)) ;
         n848RPT_REP_USUARIO_CREACION = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A848RPT_REP_USUARIO_CREACION", A848RPT_REP_USUARIO_CREACION);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_USUARIO_CREACION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A848RPT_REP_USUARIO_CREACION, "@!"))));
         A849RPT_REP_FECHA_MODIFICA = localUtil.ctot( httpContext.cgiGet( edtRPT_REP_FECHA_MODIFICA_Internalname), 0) ;
         n849RPT_REP_FECHA_MODIFICA = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A849RPT_REP_FECHA_MODIFICA", localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_FECHA_MODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A849RPT_REP_FECHA_MODIFICA, "99/99/99 99:99")));
         A850RPT_REP_USUARIO_MODIFICA = GXutil.upper( httpContext.cgiGet( edtRPT_REP_USUARIO_MODIFICA_Internalname)) ;
         n850RPT_REP_USUARIO_MODIFICA = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A850RPT_REP_USUARIO_MODIFICA", A850RPT_REP_USUARIO_MODIFICA);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A850RPT_REP_USUARIO_MODIFICA, "@!"))));
         cmbRPT_REP_ESTADO.setValue( httpContext.cgiGet( cmbRPT_REP_ESTADO.getInternalname()) );
         A851RPT_REP_ESTADO = httpContext.cgiGet( cmbRPT_REP_ESTADO.getInternalname()) ;
         n851RPT_REP_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_REP_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A851RPT_REP_ESTADO, ""))));
         /* Read saved values. */
         wcpOA843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA843RPT_REP_ID"), ",", ".")) ;
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
      e139S2 ();
      if (returnInSub) return;
   }

   public void e139S2( )
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

   protected void e149S2( )
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
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "RPT_REPORTE" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "RPT_REP_ID" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7RPT_REP_ID, 4, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A843RPT_REP_ID = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
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
      pa9S2( ) ;
      ws9S2( ) ;
      we9S2( ) ;
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
      sCtrlA843RPT_REP_ID = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa9S2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "rpt_reportegeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa9S2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A843RPT_REP_ID = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
      }
      wcpOA843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA843RPT_REP_ID"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A843RPT_REP_ID != wcpOA843RPT_REP_ID ) ) )
      {
         setjustcreated();
      }
      wcpOA843RPT_REP_ID = A843RPT_REP_ID ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA843RPT_REP_ID = httpContext.cgiGet( sPrefix+"A843RPT_REP_ID_CTRL") ;
      if ( GXutil.len( sCtrlA843RPT_REP_ID) > 0 )
      {
         A843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlA843RPT_REP_ID), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
      }
      else
      {
         A843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A843RPT_REP_ID_PARM"), ",", ".")) ;
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
      pa9S2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws9S2( ) ;
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
      ws9S2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A843RPT_REP_ID_PARM", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA843RPT_REP_ID)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A843RPT_REP_ID_CTRL", GXutil.rtrim( sCtrlA843RPT_REP_ID));
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
      we9S2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414174560");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("rpt_reportegeneral.js", "?201861414174560");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtRPT_REP_ID_Internalname = sPrefix+"RPT_REP_ID" ;
      edtRPT_REP_NOMBRE_Internalname = sPrefix+"RPT_REP_NOMBRE" ;
      edtRPT_REP_DESCRIPCION_Internalname = sPrefix+"RPT_REP_DESCRIPCION" ;
      cmbRPT_REP_FORMATO.setInternalname( sPrefix+"RPT_REP_FORMATO" );
      edtRPT_REP_FECHA_CREACION_Internalname = sPrefix+"RPT_REP_FECHA_CREACION" ;
      edtRPT_REP_USUARIO_CREACION_Internalname = sPrefix+"RPT_REP_USUARIO_CREACION" ;
      edtRPT_REP_FECHA_MODIFICA_Internalname = sPrefix+"RPT_REP_FECHA_MODIFICA" ;
      edtRPT_REP_USUARIO_MODIFICA_Internalname = sPrefix+"RPT_REP_USUARIO_MODIFICA" ;
      cmbRPT_REP_ESTADO.setInternalname( sPrefix+"RPT_REP_ESTADO" );
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
      cmbRPT_REP_ESTADO.setJsonclick( "" );
      cmbRPT_REP_ESTADO.setEnabled( 0 );
      edtRPT_REP_USUARIO_MODIFICA_Jsonclick = "" ;
      edtRPT_REP_USUARIO_MODIFICA_Enabled = 0 ;
      edtRPT_REP_FECHA_MODIFICA_Jsonclick = "" ;
      edtRPT_REP_FECHA_MODIFICA_Enabled = 0 ;
      edtRPT_REP_USUARIO_CREACION_Jsonclick = "" ;
      edtRPT_REP_USUARIO_CREACION_Enabled = 0 ;
      edtRPT_REP_FECHA_CREACION_Jsonclick = "" ;
      edtRPT_REP_FECHA_CREACION_Enabled = 0 ;
      cmbRPT_REP_FORMATO.setJsonclick( "" );
      cmbRPT_REP_FORMATO.setEnabled( 0 );
      edtRPT_REP_DESCRIPCION_Jsonclick = "" ;
      edtRPT_REP_DESCRIPCION_Enabled = 0 ;
      edtRPT_REP_NOMBRE_Jsonclick = "" ;
      edtRPT_REP_NOMBRE_Enabled = 0 ;
      edtRPT_REP_ID_Jsonclick = "" ;
      edtRPT_REP_ID_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e119S1',iparms:[{av:'A843RPT_REP_ID',fld:'RPT_REP_ID',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e129S1',iparms:[{av:'A843RPT_REP_ID',fld:'RPT_REP_ID',pic:'ZZZ9',nv:0}],oparms:[]}");
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
      A844RPT_REP_NOMBRE = "" ;
      A845RPT_REP_DESCRIPCION = "" ;
      A846RPT_REP_FORMATO = "" ;
      A847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      A848RPT_REP_USUARIO_CREACION = "" ;
      A849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      A850RPT_REP_USUARIO_MODIFICA = "" ;
      A851RPT_REP_ESTADO = "" ;
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
      H009S2_A843RPT_REP_ID = new short[1] ;
      H009S2_A851RPT_REP_ESTADO = new String[] {""} ;
      H009S2_n851RPT_REP_ESTADO = new boolean[] {false} ;
      H009S2_A850RPT_REP_USUARIO_MODIFICA = new String[] {""} ;
      H009S2_n850RPT_REP_USUARIO_MODIFICA = new boolean[] {false} ;
      H009S2_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      H009S2_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      H009S2_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      H009S2_n848RPT_REP_USUARIO_CREACION = new boolean[] {false} ;
      H009S2_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      H009S2_n847RPT_REP_FECHA_CREACION = new boolean[] {false} ;
      H009S2_A846RPT_REP_FORMATO = new String[] {""} ;
      H009S2_n846RPT_REP_FORMATO = new boolean[] {false} ;
      H009S2_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      H009S2_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      H009S2_A844RPT_REP_NOMBRE = new String[] {""} ;
      H009S2_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA843RPT_REP_ID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_reportegeneral__default(),
         new Object[] {
             new Object[] {
            H009S2_A843RPT_REP_ID, H009S2_A851RPT_REP_ESTADO, H009S2_n851RPT_REP_ESTADO, H009S2_A850RPT_REP_USUARIO_MODIFICA, H009S2_n850RPT_REP_USUARIO_MODIFICA, H009S2_A849RPT_REP_FECHA_MODIFICA, H009S2_n849RPT_REP_FECHA_MODIFICA, H009S2_A848RPT_REP_USUARIO_CREACION, H009S2_n848RPT_REP_USUARIO_CREACION, H009S2_A847RPT_REP_FECHA_CREACION,
            H009S2_n847RPT_REP_FECHA_CREACION, H009S2_A846RPT_REP_FORMATO, H009S2_n846RPT_REP_FORMATO, H009S2_A845RPT_REP_DESCRIPCION, H009S2_n845RPT_REP_DESCRIPCION, H009S2_A844RPT_REP_NOMBRE, H009S2_n844RPT_REP_NOMBRE
            }
         }
      );
      AV14Pgmname = "RPT_REPORTEGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "RPT_REPORTEGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOA843RPT_REP_ID ;
   private short A843RPT_REP_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7RPT_REP_ID ;
   private int edtRPT_REP_ID_Enabled ;
   private int edtRPT_REP_NOMBRE_Enabled ;
   private int edtRPT_REP_DESCRIPCION_Enabled ;
   private int edtRPT_REP_FECHA_CREACION_Enabled ;
   private int edtRPT_REP_USUARIO_CREACION_Enabled ;
   private int edtRPT_REP_FECHA_MODIFICA_Enabled ;
   private int edtRPT_REP_USUARIO_MODIFICA_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A851RPT_REP_ESTADO ;
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
   private String edtRPT_REP_ID_Internalname ;
   private String edtRPT_REP_ID_Jsonclick ;
   private String edtRPT_REP_NOMBRE_Internalname ;
   private String edtRPT_REP_NOMBRE_Jsonclick ;
   private String edtRPT_REP_DESCRIPCION_Internalname ;
   private String edtRPT_REP_DESCRIPCION_Jsonclick ;
   private String edtRPT_REP_FECHA_CREACION_Internalname ;
   private String edtRPT_REP_FECHA_CREACION_Jsonclick ;
   private String edtRPT_REP_USUARIO_CREACION_Internalname ;
   private String edtRPT_REP_USUARIO_CREACION_Jsonclick ;
   private String edtRPT_REP_FECHA_MODIFICA_Internalname ;
   private String edtRPT_REP_FECHA_MODIFICA_Jsonclick ;
   private String edtRPT_REP_USUARIO_MODIFICA_Internalname ;
   private String edtRPT_REP_USUARIO_MODIFICA_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA843RPT_REP_ID ;
   private java.util.Date A847RPT_REP_FECHA_CREACION ;
   private java.util.Date A849RPT_REP_FECHA_MODIFICA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n846RPT_REP_FORMATO ;
   private boolean n851RPT_REP_ESTADO ;
   private boolean n850RPT_REP_USUARIO_MODIFICA ;
   private boolean n849RPT_REP_FECHA_MODIFICA ;
   private boolean n848RPT_REP_USUARIO_CREACION ;
   private boolean n847RPT_REP_FECHA_CREACION ;
   private boolean n845RPT_REP_DESCRIPCION ;
   private boolean n844RPT_REP_NOMBRE ;
   private boolean returnInSub ;
   private String A844RPT_REP_NOMBRE ;
   private String A845RPT_REP_DESCRIPCION ;
   private String A846RPT_REP_FORMATO ;
   private String A848RPT_REP_USUARIO_CREACION ;
   private String A850RPT_REP_USUARIO_MODIFICA ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbRPT_REP_FORMATO ;
   private HTMLChoice cmbRPT_REP_ESTADO ;
   private IDataStoreProvider pr_default ;
   private short[] H009S2_A843RPT_REP_ID ;
   private String[] H009S2_A851RPT_REP_ESTADO ;
   private boolean[] H009S2_n851RPT_REP_ESTADO ;
   private String[] H009S2_A850RPT_REP_USUARIO_MODIFICA ;
   private boolean[] H009S2_n850RPT_REP_USUARIO_MODIFICA ;
   private java.util.Date[] H009S2_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] H009S2_n849RPT_REP_FECHA_MODIFICA ;
   private String[] H009S2_A848RPT_REP_USUARIO_CREACION ;
   private boolean[] H009S2_n848RPT_REP_USUARIO_CREACION ;
   private java.util.Date[] H009S2_A847RPT_REP_FECHA_CREACION ;
   private boolean[] H009S2_n847RPT_REP_FECHA_CREACION ;
   private String[] H009S2_A846RPT_REP_FORMATO ;
   private boolean[] H009S2_n846RPT_REP_FORMATO ;
   private String[] H009S2_A845RPT_REP_DESCRIPCION ;
   private boolean[] H009S2_n845RPT_REP_DESCRIPCION ;
   private String[] H009S2_A844RPT_REP_NOMBRE ;
   private boolean[] H009S2_n844RPT_REP_NOMBRE ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class rpt_reportegeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009S2", "SELECT RPT_REP_ID, RPT_REP_ESTADO, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_MODIFICA, RPT_REP_USUARIO_CREACION, RPT_REP_FECHA_CREACION, RPT_REP_FORMATO, RPT_REP_DESCRIPCION, RPT_REP_NOMBRE FROM RPT_REPORTE WHERE RPT_REP_ID = ? ORDER BY RPT_REP_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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

