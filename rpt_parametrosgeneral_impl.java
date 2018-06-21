/*
               File: rpt_parametrosgeneral_impl
        Description: RPT_PARAMETROSGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:37.24
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

public final  class rpt_parametrosgeneral_impl extends GXWebComponent
{
   public rpt_parametrosgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rpt_parametrosgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_parametrosgeneral_impl.class ));
   }

   public rpt_parametrosgeneral_impl( int remoteHandle ,
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
      cmbRPT_PAR_ESTADO = new HTMLChoice();
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
               A840RPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Short(A840RPT_PAR_ID)});
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
         pa9O2( ) ;
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
         httpContext.writeValue( "RPT_PARAMETROSGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173726");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.rpt_parametrosgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A840RPT_PAR_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA840RPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( wcpOA840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A841RPT_PAR_DESCRIPCION, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A842RPT_PAR_ESTADO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A854RPT_PAR_USUARIOCREA, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A855RPT_PAR_FECHACREA, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_USUARIOMODIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A856RPT_PAR_USUARIOMODIF, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_FECHAMODIF", getSecureSignedToken( sPrefix, localUtil.format( A857RPT_PAR_FECHAMODIF, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RPT_PAR_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A860RPT_PAR_NOMBREINTERNO, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm9O2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("rpt_parametrosgeneral.js", "?201861414173727");
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
      return "RPT_PARAMETROSGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "RPT_PARAMETROSGeneral" ;
   }

   public void wb9O0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.rpt_parametrosgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e119o1_client"+"'", TempTags, "", 2, "HLP_RPT_PARAMETROSGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e129o1_client"+"'", TempTags, "", 2, "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_ID_Internalname, "Parámetro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")), ((edtRPT_PAR_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_DESCRIPCION_Internalname, "Parámetro", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_DESCRIPCION_Internalname, A841RPT_PAR_DESCRIPCION, GXutil.rtrim( localUtil.format( A841RPT_PAR_DESCRIPCION, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_DESCRIPCION_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_DESCRIPCION_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_PAR_ESTADO.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_PAR_ESTADO, cmbRPT_PAR_ESTADO.getInternalname(), GXutil.rtrim( A842RPT_PAR_ESTADO), 1, cmbRPT_PAR_ESTADO.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRPT_PAR_ESTADO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_RPT_PARAMETROSGeneral.htm");
         cmbRPT_PAR_ESTADO.setValue( GXutil.rtrim( A842RPT_PAR_ESTADO) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRPT_PAR_ESTADO.getInternalname(), "Values", cmbRPT_PAR_ESTADO.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_USUARIOCREA_Internalname, "Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_USUARIOCREA_Internalname, A854RPT_PAR_USUARIOCREA, GXutil.rtrim( localUtil.format( A854RPT_PAR_USUARIOCREA, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_USUARIOCREA_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_USUARIOCREA_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_FECHACREA_Internalname, "Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRPT_PAR_FECHACREA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_FECHACREA_Internalname, localUtil.ttoc( A855RPT_PAR_FECHACREA, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A855RPT_PAR_FECHACREA, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_FECHACREA_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_FECHACREA_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_RPT_PARAMETROSGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRPT_PAR_FECHACREA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRPT_PAR_FECHACREA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_USUARIOMODIF_Internalname, "Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_USUARIOMODIF_Internalname, A856RPT_PAR_USUARIOMODIF, GXutil.rtrim( localUtil.format( A856RPT_PAR_USUARIOMODIF, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_USUARIOMODIF_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_USUARIOMODIF_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_FECHAMODIF_Internalname, "Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRPT_PAR_FECHAMODIF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_FECHAMODIF_Internalname, localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A857RPT_PAR_FECHAMODIF, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_FECHAMODIF_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_FECHAMODIF_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_RPT_PARAMETROSGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRPT_PAR_FECHAMODIF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRPT_PAR_FECHAMODIF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RPT_PARAMETROSGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_NOMBREINTERNO_Internalname, "Interno", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_NOMBREINTERNO_Internalname, A860RPT_PAR_NOMBREINTERNO, GXutil.rtrim( localUtil.format( A860RPT_PAR_NOMBREINTERNO, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_NOMBREINTERNO_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRPT_PAR_NOMBREINTERNO_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_PARAMETROSGeneral.htm");
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

   public void start9O2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "RPT_PARAMETROSGeneral", (short)(0)) ;
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
            strup9O0( ) ;
         }
      }
   }

   public void ws9O2( )
   {
      start9O2( ) ;
      evt9O2( ) ;
   }

   public void evt9O2( )
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
                              strup9O0( ) ;
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
                              strup9O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e139O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e149O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup9O0( ) ;
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
                              strup9O0( ) ;
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

   public void we9O2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm9O2( ) ;
         }
      }
   }

   public void pa9O2( )
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
         cmbRPT_PAR_ESTADO.setName( "RPT_PAR_ESTADO" );
         cmbRPT_PAR_ESTADO.setWebtags( "" );
         cmbRPT_PAR_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_PAR_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_PAR_ESTADO.getItemCount() > 0 )
         {
            A842RPT_PAR_ESTADO = cmbRPT_PAR_ESTADO.getValidValue(A842RPT_PAR_ESTADO) ;
            n842RPT_PAR_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A842RPT_PAR_ESTADO, ""))));
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
      if ( cmbRPT_PAR_ESTADO.getItemCount() > 0 )
      {
         A842RPT_PAR_ESTADO = cmbRPT_PAR_ESTADO.getValidValue(A842RPT_PAR_ESTADO) ;
         n842RPT_PAR_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A842RPT_PAR_ESTADO, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9O2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "RPT_PARAMETROSGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf9O2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H009O2 */
         pr_default.execute(0, new Object[] {new Short(A840RPT_PAR_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A860RPT_PAR_NOMBREINTERNO = H009O2_A860RPT_PAR_NOMBREINTERNO[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A860RPT_PAR_NOMBREINTERNO, ""))));
            n860RPT_PAR_NOMBREINTERNO = H009O2_n860RPT_PAR_NOMBREINTERNO[0] ;
            A857RPT_PAR_FECHAMODIF = H009O2_A857RPT_PAR_FECHAMODIF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A857RPT_PAR_FECHAMODIF", localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_FECHAMODIF", getSecureSignedToken( sPrefix, localUtil.format( A857RPT_PAR_FECHAMODIF, "99/99/99 99:99")));
            n857RPT_PAR_FECHAMODIF = H009O2_n857RPT_PAR_FECHAMODIF[0] ;
            A856RPT_PAR_USUARIOMODIF = H009O2_A856RPT_PAR_USUARIOMODIF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856RPT_PAR_USUARIOMODIF", A856RPT_PAR_USUARIOMODIF);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_USUARIOMODIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A856RPT_PAR_USUARIOMODIF, "@!"))));
            n856RPT_PAR_USUARIOMODIF = H009O2_n856RPT_PAR_USUARIOMODIF[0] ;
            A855RPT_PAR_FECHACREA = H009O2_A855RPT_PAR_FECHACREA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A855RPT_PAR_FECHACREA", localUtil.ttoc( A855RPT_PAR_FECHACREA, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A855RPT_PAR_FECHACREA, "99/99/99 99:99")));
            n855RPT_PAR_FECHACREA = H009O2_n855RPT_PAR_FECHACREA[0] ;
            A854RPT_PAR_USUARIOCREA = H009O2_A854RPT_PAR_USUARIOCREA[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A854RPT_PAR_USUARIOCREA", A854RPT_PAR_USUARIOCREA);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A854RPT_PAR_USUARIOCREA, "@!"))));
            n854RPT_PAR_USUARIOCREA = H009O2_n854RPT_PAR_USUARIOCREA[0] ;
            A842RPT_PAR_ESTADO = H009O2_A842RPT_PAR_ESTADO[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A842RPT_PAR_ESTADO, ""))));
            n842RPT_PAR_ESTADO = H009O2_n842RPT_PAR_ESTADO[0] ;
            A841RPT_PAR_DESCRIPCION = H009O2_A841RPT_PAR_DESCRIPCION[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A841RPT_PAR_DESCRIPCION, ""))));
            n841RPT_PAR_DESCRIPCION = H009O2_n841RPT_PAR_DESCRIPCION[0] ;
            /* Execute user event: Load */
            e149O2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb9O0( ) ;
      }
   }

   public void strup9O0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "RPT_PARAMETROSGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e139O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A841RPT_PAR_DESCRIPCION = httpContext.cgiGet( edtRPT_PAR_DESCRIPCION_Internalname) ;
         n841RPT_PAR_DESCRIPCION = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A841RPT_PAR_DESCRIPCION, ""))));
         cmbRPT_PAR_ESTADO.setValue( httpContext.cgiGet( cmbRPT_PAR_ESTADO.getInternalname()) );
         A842RPT_PAR_ESTADO = httpContext.cgiGet( cmbRPT_PAR_ESTADO.getInternalname()) ;
         n842RPT_PAR_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A842RPT_PAR_ESTADO, ""))));
         A854RPT_PAR_USUARIOCREA = GXutil.upper( httpContext.cgiGet( edtRPT_PAR_USUARIOCREA_Internalname)) ;
         n854RPT_PAR_USUARIOCREA = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A854RPT_PAR_USUARIOCREA", A854RPT_PAR_USUARIOCREA);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A854RPT_PAR_USUARIOCREA, "@!"))));
         A855RPT_PAR_FECHACREA = localUtil.ctot( httpContext.cgiGet( edtRPT_PAR_FECHACREA_Internalname), 0) ;
         n855RPT_PAR_FECHACREA = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A855RPT_PAR_FECHACREA", localUtil.ttoc( A855RPT_PAR_FECHACREA, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A855RPT_PAR_FECHACREA, "99/99/99 99:99")));
         A856RPT_PAR_USUARIOMODIF = GXutil.upper( httpContext.cgiGet( edtRPT_PAR_USUARIOMODIF_Internalname)) ;
         n856RPT_PAR_USUARIOMODIF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856RPT_PAR_USUARIOMODIF", A856RPT_PAR_USUARIOMODIF);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_USUARIOMODIF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A856RPT_PAR_USUARIOMODIF, "@!"))));
         A857RPT_PAR_FECHAMODIF = localUtil.ctot( httpContext.cgiGet( edtRPT_PAR_FECHAMODIF_Internalname), 0) ;
         n857RPT_PAR_FECHAMODIF = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A857RPT_PAR_FECHAMODIF", localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_FECHAMODIF", getSecureSignedToken( sPrefix, localUtil.format( A857RPT_PAR_FECHAMODIF, "99/99/99 99:99")));
         A860RPT_PAR_NOMBREINTERNO = httpContext.cgiGet( edtRPT_PAR_NOMBREINTERNO_Internalname) ;
         n860RPT_PAR_NOMBREINTERNO = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_RPT_PAR_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A860RPT_PAR_NOMBREINTERNO, ""))));
         /* Read saved values. */
         wcpOA840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA840RPT_PAR_ID"), ",", ".")) ;
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
      e139O2 ();
      if (returnInSub) return;
   }

   public void e139O2( )
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

   protected void e149O2( )
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
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "RPT_PARAMETROS" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "RPT_PAR_ID" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7RPT_PAR_ID, 4, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A840RPT_PAR_ID = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
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
      pa9O2( ) ;
      ws9O2( ) ;
      we9O2( ) ;
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
      sCtrlA840RPT_PAR_ID = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa9O2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "rpt_parametrosgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa9O2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A840RPT_PAR_ID = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
      }
      wcpOA840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA840RPT_PAR_ID"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A840RPT_PAR_ID != wcpOA840RPT_PAR_ID ) ) )
      {
         setjustcreated();
      }
      wcpOA840RPT_PAR_ID = A840RPT_PAR_ID ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA840RPT_PAR_ID = httpContext.cgiGet( sPrefix+"A840RPT_PAR_ID_CTRL") ;
      if ( GXutil.len( sCtrlA840RPT_PAR_ID) > 0 )
      {
         A840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlA840RPT_PAR_ID), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
      }
      else
      {
         A840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A840RPT_PAR_ID_PARM"), ",", ".")) ;
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
      pa9O2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws9O2( ) ;
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
      ws9O2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A840RPT_PAR_ID_PARM", GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA840RPT_PAR_ID)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A840RPT_PAR_ID_CTRL", GXutil.rtrim( sCtrlA840RPT_PAR_ID));
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
      we9O2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173767");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("rpt_parametrosgeneral.js", "?201861414173767");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtRPT_PAR_ID_Internalname = sPrefix+"RPT_PAR_ID" ;
      edtRPT_PAR_DESCRIPCION_Internalname = sPrefix+"RPT_PAR_DESCRIPCION" ;
      cmbRPT_PAR_ESTADO.setInternalname( sPrefix+"RPT_PAR_ESTADO" );
      edtRPT_PAR_USUARIOCREA_Internalname = sPrefix+"RPT_PAR_USUARIOCREA" ;
      edtRPT_PAR_FECHACREA_Internalname = sPrefix+"RPT_PAR_FECHACREA" ;
      edtRPT_PAR_USUARIOMODIF_Internalname = sPrefix+"RPT_PAR_USUARIOMODIF" ;
      edtRPT_PAR_FECHAMODIF_Internalname = sPrefix+"RPT_PAR_FECHAMODIF" ;
      edtRPT_PAR_NOMBREINTERNO_Internalname = sPrefix+"RPT_PAR_NOMBREINTERNO" ;
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
      edtRPT_PAR_NOMBREINTERNO_Jsonclick = "" ;
      edtRPT_PAR_NOMBREINTERNO_Enabled = 0 ;
      edtRPT_PAR_FECHAMODIF_Jsonclick = "" ;
      edtRPT_PAR_FECHAMODIF_Enabled = 0 ;
      edtRPT_PAR_USUARIOMODIF_Jsonclick = "" ;
      edtRPT_PAR_USUARIOMODIF_Enabled = 0 ;
      edtRPT_PAR_FECHACREA_Jsonclick = "" ;
      edtRPT_PAR_FECHACREA_Enabled = 0 ;
      edtRPT_PAR_USUARIOCREA_Jsonclick = "" ;
      edtRPT_PAR_USUARIOCREA_Enabled = 0 ;
      cmbRPT_PAR_ESTADO.setJsonclick( "" );
      cmbRPT_PAR_ESTADO.setEnabled( 0 );
      edtRPT_PAR_DESCRIPCION_Jsonclick = "" ;
      edtRPT_PAR_DESCRIPCION_Enabled = 0 ;
      edtRPT_PAR_ID_Jsonclick = "" ;
      edtRPT_PAR_ID_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e119O1',iparms:[{av:'A840RPT_PAR_ID',fld:'RPT_PAR_ID',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e129O1',iparms:[{av:'A840RPT_PAR_ID',fld:'RPT_PAR_ID',pic:'ZZZ9',nv:0}],oparms:[]}");
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
      A841RPT_PAR_DESCRIPCION = "" ;
      A842RPT_PAR_ESTADO = "" ;
      A854RPT_PAR_USUARIOCREA = "" ;
      A855RPT_PAR_FECHACREA = GXutil.resetTime( GXutil.nullDate() );
      A856RPT_PAR_USUARIOMODIF = "" ;
      A857RPT_PAR_FECHAMODIF = GXutil.resetTime( GXutil.nullDate() );
      A860RPT_PAR_NOMBREINTERNO = "" ;
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
      H009O2_A840RPT_PAR_ID = new short[1] ;
      H009O2_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      H009O2_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      H009O2_A857RPT_PAR_FECHAMODIF = new java.util.Date[] {GXutil.nullDate()} ;
      H009O2_n857RPT_PAR_FECHAMODIF = new boolean[] {false} ;
      H009O2_A856RPT_PAR_USUARIOMODIF = new String[] {""} ;
      H009O2_n856RPT_PAR_USUARIOMODIF = new boolean[] {false} ;
      H009O2_A855RPT_PAR_FECHACREA = new java.util.Date[] {GXutil.nullDate()} ;
      H009O2_n855RPT_PAR_FECHACREA = new boolean[] {false} ;
      H009O2_A854RPT_PAR_USUARIOCREA = new String[] {""} ;
      H009O2_n854RPT_PAR_USUARIOCREA = new boolean[] {false} ;
      H009O2_A842RPT_PAR_ESTADO = new String[] {""} ;
      H009O2_n842RPT_PAR_ESTADO = new boolean[] {false} ;
      H009O2_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      H009O2_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA840RPT_PAR_ID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_parametrosgeneral__default(),
         new Object[] {
             new Object[] {
            H009O2_A840RPT_PAR_ID, H009O2_A860RPT_PAR_NOMBREINTERNO, H009O2_n860RPT_PAR_NOMBREINTERNO, H009O2_A857RPT_PAR_FECHAMODIF, H009O2_n857RPT_PAR_FECHAMODIF, H009O2_A856RPT_PAR_USUARIOMODIF, H009O2_n856RPT_PAR_USUARIOMODIF, H009O2_A855RPT_PAR_FECHACREA, H009O2_n855RPT_PAR_FECHACREA, H009O2_A854RPT_PAR_USUARIOCREA,
            H009O2_n854RPT_PAR_USUARIOCREA, H009O2_A842RPT_PAR_ESTADO, H009O2_n842RPT_PAR_ESTADO, H009O2_A841RPT_PAR_DESCRIPCION, H009O2_n841RPT_PAR_DESCRIPCION
            }
         }
      );
      AV14Pgmname = "RPT_PARAMETROSGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "RPT_PARAMETROSGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOA840RPT_PAR_ID ;
   private short A840RPT_PAR_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV7RPT_PAR_ID ;
   private int edtRPT_PAR_ID_Enabled ;
   private int edtRPT_PAR_DESCRIPCION_Enabled ;
   private int edtRPT_PAR_USUARIOCREA_Enabled ;
   private int edtRPT_PAR_FECHACREA_Enabled ;
   private int edtRPT_PAR_USUARIOMODIF_Enabled ;
   private int edtRPT_PAR_FECHAMODIF_Enabled ;
   private int edtRPT_PAR_NOMBREINTERNO_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A842RPT_PAR_ESTADO ;
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
   private String edtRPT_PAR_ID_Internalname ;
   private String edtRPT_PAR_ID_Jsonclick ;
   private String edtRPT_PAR_DESCRIPCION_Internalname ;
   private String edtRPT_PAR_DESCRIPCION_Jsonclick ;
   private String edtRPT_PAR_USUARIOCREA_Internalname ;
   private String edtRPT_PAR_USUARIOCREA_Jsonclick ;
   private String edtRPT_PAR_FECHACREA_Internalname ;
   private String edtRPT_PAR_FECHACREA_Jsonclick ;
   private String edtRPT_PAR_USUARIOMODIF_Internalname ;
   private String edtRPT_PAR_USUARIOMODIF_Jsonclick ;
   private String edtRPT_PAR_FECHAMODIF_Internalname ;
   private String edtRPT_PAR_FECHAMODIF_Jsonclick ;
   private String edtRPT_PAR_NOMBREINTERNO_Internalname ;
   private String edtRPT_PAR_NOMBREINTERNO_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA840RPT_PAR_ID ;
   private java.util.Date A855RPT_PAR_FECHACREA ;
   private java.util.Date A857RPT_PAR_FECHAMODIF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n842RPT_PAR_ESTADO ;
   private boolean n860RPT_PAR_NOMBREINTERNO ;
   private boolean n857RPT_PAR_FECHAMODIF ;
   private boolean n856RPT_PAR_USUARIOMODIF ;
   private boolean n855RPT_PAR_FECHACREA ;
   private boolean n854RPT_PAR_USUARIOCREA ;
   private boolean n841RPT_PAR_DESCRIPCION ;
   private boolean returnInSub ;
   private String A841RPT_PAR_DESCRIPCION ;
   private String A854RPT_PAR_USUARIOCREA ;
   private String A856RPT_PAR_USUARIOMODIF ;
   private String A860RPT_PAR_NOMBREINTERNO ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbRPT_PAR_ESTADO ;
   private IDataStoreProvider pr_default ;
   private short[] H009O2_A840RPT_PAR_ID ;
   private String[] H009O2_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] H009O2_n860RPT_PAR_NOMBREINTERNO ;
   private java.util.Date[] H009O2_A857RPT_PAR_FECHAMODIF ;
   private boolean[] H009O2_n857RPT_PAR_FECHAMODIF ;
   private String[] H009O2_A856RPT_PAR_USUARIOMODIF ;
   private boolean[] H009O2_n856RPT_PAR_USUARIOMODIF ;
   private java.util.Date[] H009O2_A855RPT_PAR_FECHACREA ;
   private boolean[] H009O2_n855RPT_PAR_FECHACREA ;
   private String[] H009O2_A854RPT_PAR_USUARIOCREA ;
   private boolean[] H009O2_n854RPT_PAR_USUARIOCREA ;
   private String[] H009O2_A842RPT_PAR_ESTADO ;
   private boolean[] H009O2_n842RPT_PAR_ESTADO ;
   private String[] H009O2_A841RPT_PAR_DESCRIPCION ;
   private boolean[] H009O2_n841RPT_PAR_DESCRIPCION ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class rpt_parametrosgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009O2", "SELECT RPT_PAR_ID, RPT_PAR_NOMBREINTERNO, RPT_PAR_FECHAMODIF, RPT_PAR_USUARIOMODIF, RPT_PAR_FECHACREA, RPT_PAR_USUARIOCREA, RPT_PAR_ESTADO, RPT_PAR_DESCRIPCION FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ORDER BY RPT_PAR_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
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

