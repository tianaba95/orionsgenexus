/*
               File: alm_tipo_novedadgeneral_impl
        Description: ALM_TIPO_NOVEDADGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:10.75
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

public final  class alm_tipo_novedadgeneral_impl extends GXWebComponent
{
   public alm_tipo_novedadgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_novedadgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_novedadgeneral_impl.class ));
   }

   public alm_tipo_novedadgeneral_impl( int remoteHandle ,
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
      cmbTNov_Estado = new HTMLChoice();
      cmbTNov_IngresoMasivo = new HTMLChoice();
      cmbTNov_ObligaSoporte = new HTMLChoice();
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
               A104TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               n104TNov_Codigo = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Integer(A104TNov_Codigo)});
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
         pa3F2( ) ;
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
         httpContext.writeValue( "ALM_TIPO_NOVEDADGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161079");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_novedadgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A104TNov_Codigo,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA104TNov_Codigo", GXutil.ltrim( localUtil.ntoc( wcpOA104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm3F2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_novedadgeneral.js", "?201861414161080");
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
      return "ALM_TIPO_NOVEDADGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_NOVEDADGeneral" ;
   }

   public void wb3F0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_novedadgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e113f1_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e123f1_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Codigo_Internalname, "Código", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")), ((edtTNov_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Codigo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Descripcion_Internalname, "Descripción ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTNov_Descripcion_Internalname, A769TNov_Descripcion, edtTNov_Descripcion_Link, "", (short)(0), 1, edtTNov_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_Tipo.getInternalname(), "Tipo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_Tipo, cmbTNov_Tipo.getInternalname(), GXutil.rtrim( A770TNov_Tipo), 1, cmbTNov_Tipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_Tipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Nro_Cambios_Internalname, "Número de cambios", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Nro_Cambios_Internalname, GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")), ((edtTNov_Nro_Cambios_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Nro_Cambios_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Nro_Cambios_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Procedimiento_Internalname, A772TNov_Procedimiento, GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Procedimiento_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Procedimiento_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_Estado, cmbTNov_Estado.getInternalname(), GXutil.rtrim( A773TNov_Estado), 1, cmbTNov_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTNov_Estado.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         cmbTNov_Estado.setValue( GXutil.rtrim( A773TNov_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTNov_Estado.getInternalname(), "Values", cmbTNov_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Nombre_Campo_Internalname, A774TNov_Nombre_Campo, GXutil.rtrim( localUtil.format( A774TNov_Nombre_Campo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Nombre_Campo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_Nombre_Campo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_UsuarioCrea_Internalname, "Usuario que Crea", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_UsuarioCrea_Internalname, A775TNov_UsuarioCrea, GXutil.rtrim( localUtil.format( A775TNov_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTNov_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_FechaCrea_Internalname, localUtil.ttoc( A776TNov_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A776TNov_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTNov_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTNov_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_UsuarioModifica_Internalname, "Usuario que modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_UsuarioModifica_Internalname, A777TNov_UsuarioModifica, GXutil.rtrim( localUtil.format( A777TNov_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_FechaModifica_Internalname, "Fecha Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTNov_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_FechaModifica_Internalname, localUtil.ttoc( A778TNov_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A778TNov_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTNov_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTNov_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTNov_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_NOVEDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_IngresoMasivo.getInternalname(), "Masivo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_IngresoMasivo, cmbTNov_IngresoMasivo.getInternalname(), GXutil.rtrim( A813TNov_IngresoMasivo), 1, cmbTNov_IngresoMasivo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_IngresoMasivo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         cmbTNov_IngresoMasivo.setValue( GXutil.rtrim( A813TNov_IngresoMasivo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTNov_IngresoMasivo.getInternalname(), "Values", cmbTNov_IngresoMasivo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_ObligaSoporte.getInternalname(), "de Soporte", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_ObligaSoporte, cmbTNov_ObligaSoporte.getInternalname(), GXutil.rtrim( A839TNov_ObligaSoporte), 1, cmbTNov_ObligaSoporte.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_ObligaSoporte.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_NOVEDADGeneral.htm");
         cmbTNov_ObligaSoporte.setValue( GXutil.rtrim( A839TNov_ObligaSoporte) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTNov_ObligaSoporte.getInternalname(), "Values", cmbTNov_ObligaSoporte.ToJavascriptSource(), true);
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

   public void start3F2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_NOVEDADGeneral", (short)(0)) ;
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
            strup3F0( ) ;
         }
      }
   }

   public void ws3F2( )
   {
      start3F2( ) ;
      evt3F2( ) ;
   }

   public void evt3F2( )
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
                              strup3F0( ) ;
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
                              strup3F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e133F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3F0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e143F2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3F0( ) ;
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
                              strup3F0( ) ;
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

   public void we3F2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm3F2( ) ;
         }
      }
   }

   public void pa3F2( )
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
         cmbTNov_Estado.setName( "TNOV_ESTADO" );
         cmbTNov_Estado.setWebtags( "" );
         cmbTNov_Estado.addItem("A", "Activo", (short)(0));
         cmbTNov_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTNov_Estado.getItemCount() > 0 )
         {
            A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
            n773TNov_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A773TNov_Estado", A773TNov_Estado);
         }
         cmbTNov_IngresoMasivo.setName( "TNOV_INGRESOMASIVO" );
         cmbTNov_IngresoMasivo.setWebtags( "" );
         cmbTNov_IngresoMasivo.addItem("", "", (short)(0));
         cmbTNov_IngresoMasivo.addItem("SI", "SI", (short)(0));
         cmbTNov_IngresoMasivo.addItem("NO", "NO", (short)(0));
         if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
         {
            A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
            n813TNov_IngresoMasivo = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
         }
         cmbTNov_ObligaSoporte.setName( "TNOV_OBLIGASOPORTE" );
         cmbTNov_ObligaSoporte.setWebtags( "" );
         cmbTNov_ObligaSoporte.addItem("", "", (short)(0));
         cmbTNov_ObligaSoporte.addItem("SI", "SI", (short)(0));
         cmbTNov_ObligaSoporte.addItem("NO", "NO", (short)(0));
         if ( cmbTNov_ObligaSoporte.getItemCount() > 0 )
         {
            A839TNov_ObligaSoporte = cmbTNov_ObligaSoporte.getValidValue(A839TNov_ObligaSoporte) ;
            n839TNov_ObligaSoporte = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
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
      if ( cmbTNov_Estado.getItemCount() > 0 )
      {
         A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
         n773TNov_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A773TNov_Estado", A773TNov_Estado);
      }
      if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
      {
         A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
         n813TNov_IngresoMasivo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
      }
      if ( cmbTNov_ObligaSoporte.getItemCount() > 0 )
      {
         A839TNov_ObligaSoporte = cmbTNov_ObligaSoporte.getValidValue(A839TNov_ObligaSoporte) ;
         n839TNov_ObligaSoporte = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3F2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_NOVEDADGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf3F2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H003F2 */
         pr_default.execute(0, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A106Nove_Identificador = H003F2_A106Nove_Identificador[0] ;
            /* Execute user event: Load */
            e143F2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb3F0( ) ;
      }
   }

   public void strup3F0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_TIPO_NOVEDADGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H003F3 */
      pr_default.execute(1, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      A839TNov_ObligaSoporte = H003F3_A839TNov_ObligaSoporte[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
      n839TNov_ObligaSoporte = H003F3_n839TNov_ObligaSoporte[0] ;
      A813TNov_IngresoMasivo = H003F3_A813TNov_IngresoMasivo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
      n813TNov_IngresoMasivo = H003F3_n813TNov_IngresoMasivo[0] ;
      A778TNov_FechaModifica = H003F3_A778TNov_FechaModifica[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A778TNov_FechaModifica", localUtil.ttoc( A778TNov_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      n778TNov_FechaModifica = H003F3_n778TNov_FechaModifica[0] ;
      A777TNov_UsuarioModifica = H003F3_A777TNov_UsuarioModifica[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A777TNov_UsuarioModifica", A777TNov_UsuarioModifica);
      n777TNov_UsuarioModifica = H003F3_n777TNov_UsuarioModifica[0] ;
      A776TNov_FechaCrea = H003F3_A776TNov_FechaCrea[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A776TNov_FechaCrea", localUtil.ttoc( A776TNov_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      n776TNov_FechaCrea = H003F3_n776TNov_FechaCrea[0] ;
      A775TNov_UsuarioCrea = H003F3_A775TNov_UsuarioCrea[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A775TNov_UsuarioCrea", A775TNov_UsuarioCrea);
      n775TNov_UsuarioCrea = H003F3_n775TNov_UsuarioCrea[0] ;
      A774TNov_Nombre_Campo = H003F3_A774TNov_Nombre_Campo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      n774TNov_Nombre_Campo = H003F3_n774TNov_Nombre_Campo[0] ;
      A773TNov_Estado = H003F3_A773TNov_Estado[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A773TNov_Estado", A773TNov_Estado);
      n773TNov_Estado = H003F3_n773TNov_Estado[0] ;
      A772TNov_Procedimiento = H003F3_A772TNov_Procedimiento[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
      n772TNov_Procedimiento = H003F3_n772TNov_Procedimiento[0] ;
      A771TNov_Nro_Cambios = H003F3_A771TNov_Nro_Cambios[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
      n771TNov_Nro_Cambios = H003F3_n771TNov_Nro_Cambios[0] ;
      A770TNov_Tipo = H003F3_A770TNov_Tipo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
      n770TNov_Tipo = H003F3_n770TNov_Tipo[0] ;
      A769TNov_Descripcion = H003F3_A769TNov_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769TNov_Descripcion", A769TNov_Descripcion);
      n769TNov_Descripcion = H003F3_n769TNov_Descripcion[0] ;
      pr_default.close(1);
      pr_default.close(1);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e133F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
         n769TNov_Descripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769TNov_Descripcion", A769TNov_Descripcion);
         cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
         A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A770TNov_Tipo", A770TNov_Tipo);
         A771TNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".")) ;
         n771TNov_Nro_Cambios = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
         A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
         n772TNov_Procedimiento = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
         cmbTNov_Estado.setValue( httpContext.cgiGet( cmbTNov_Estado.getInternalname()) );
         A773TNov_Estado = httpContext.cgiGet( cmbTNov_Estado.getInternalname()) ;
         n773TNov_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A773TNov_Estado", A773TNov_Estado);
         A774TNov_Nombre_Campo = httpContext.cgiGet( edtTNov_Nombre_Campo_Internalname) ;
         n774TNov_Nombre_Campo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         A775TNov_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTNov_UsuarioCrea_Internalname)) ;
         n775TNov_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A775TNov_UsuarioCrea", A775TNov_UsuarioCrea);
         A776TNov_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTNov_FechaCrea_Internalname), 0) ;
         n776TNov_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A776TNov_FechaCrea", localUtil.ttoc( A776TNov_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         A777TNov_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTNov_UsuarioModifica_Internalname)) ;
         n777TNov_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A777TNov_UsuarioModifica", A777TNov_UsuarioModifica);
         A778TNov_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTNov_FechaModifica_Internalname), 0) ;
         n778TNov_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A778TNov_FechaModifica", localUtil.ttoc( A778TNov_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         cmbTNov_IngresoMasivo.setValue( httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) );
         A813TNov_IngresoMasivo = httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) ;
         n813TNov_IngresoMasivo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
         cmbTNov_ObligaSoporte.setValue( httpContext.cgiGet( cmbTNov_ObligaSoporte.getInternalname()) );
         A839TNov_ObligaSoporte = httpContext.cgiGet( cmbTNov_ObligaSoporte.getInternalname()) ;
         n839TNov_ObligaSoporte = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
         /* Read saved values. */
         wcpOA104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA104TNov_Codigo"), ",", ".")) ;
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
      e133F2 ();
      if (returnInSub) return;
   }

   public void e133F2( )
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

   protected void e143F2( )
   {
      /* Load Routine */
      edtTNov_Descripcion_Link = formatLink("com.orions2.viewalm_novedad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A106Nove_Identificador,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTNov_Descripcion_Internalname, "Link", edtTNov_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TIPO_NOVEDAD" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "TNov_Codigo" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7TNov_Codigo, 6, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A104TNov_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      n104TNov_Codigo = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
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
      pa3F2( ) ;
      ws3F2( ) ;
      we3F2( ) ;
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
      sCtrlA104TNov_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa3F2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_novedadgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa3F2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A104TNov_Codigo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      }
      wcpOA104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA104TNov_Codigo"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A104TNov_Codigo != wcpOA104TNov_Codigo ) ) )
      {
         setjustcreated();
      }
      wcpOA104TNov_Codigo = A104TNov_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA104TNov_Codigo = httpContext.cgiGet( sPrefix+"A104TNov_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA104TNov_Codigo) > 0 )
      {
         A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA104TNov_Codigo), ",", ".")) ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      }
      else
      {
         A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A104TNov_Codigo_PARM"), ",", ".")) ;
         n104TNov_Codigo = false ;
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
      pa3F2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws3F2( ) ;
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
      ws3F2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A104TNov_Codigo_PARM", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA104TNov_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A104TNov_Codigo_CTRL", GXutil.rtrim( sCtrlA104TNov_Codigo));
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
      we3F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161142");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_tipo_novedadgeneral.js", "?201861414161142");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtTNov_Codigo_Internalname = sPrefix+"TNOV_CODIGO" ;
      edtTNov_Descripcion_Internalname = sPrefix+"TNOV_DESCRIPCION" ;
      cmbTNov_Tipo.setInternalname( sPrefix+"TNOV_TIPO" );
      edtTNov_Nro_Cambios_Internalname = sPrefix+"TNOV_NRO_CAMBIOS" ;
      edtTNov_Procedimiento_Internalname = sPrefix+"TNOV_PROCEDIMIENTO" ;
      cmbTNov_Estado.setInternalname( sPrefix+"TNOV_ESTADO" );
      edtTNov_Nombre_Campo_Internalname = sPrefix+"TNOV_NOMBRE_CAMPO" ;
      edtTNov_UsuarioCrea_Internalname = sPrefix+"TNOV_USUARIOCREA" ;
      edtTNov_FechaCrea_Internalname = sPrefix+"TNOV_FECHACREA" ;
      edtTNov_UsuarioModifica_Internalname = sPrefix+"TNOV_USUARIOMODIFICA" ;
      edtTNov_FechaModifica_Internalname = sPrefix+"TNOV_FECHAMODIFICA" ;
      cmbTNov_IngresoMasivo.setInternalname( sPrefix+"TNOV_INGRESOMASIVO" );
      cmbTNov_ObligaSoporte.setInternalname( sPrefix+"TNOV_OBLIGASOPORTE" );
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
      cmbTNov_ObligaSoporte.setJsonclick( "" );
      cmbTNov_ObligaSoporte.setEnabled( 0 );
      cmbTNov_IngresoMasivo.setJsonclick( "" );
      cmbTNov_IngresoMasivo.setEnabled( 0 );
      edtTNov_FechaModifica_Jsonclick = "" ;
      edtTNov_FechaModifica_Enabled = 0 ;
      edtTNov_UsuarioModifica_Jsonclick = "" ;
      edtTNov_UsuarioModifica_Enabled = 0 ;
      edtTNov_FechaCrea_Jsonclick = "" ;
      edtTNov_FechaCrea_Enabled = 0 ;
      edtTNov_UsuarioCrea_Jsonclick = "" ;
      edtTNov_UsuarioCrea_Enabled = 0 ;
      edtTNov_Nombre_Campo_Jsonclick = "" ;
      edtTNov_Nombre_Campo_Enabled = 0 ;
      cmbTNov_Estado.setJsonclick( "" );
      cmbTNov_Estado.setEnabled( 0 );
      edtTNov_Procedimiento_Jsonclick = "" ;
      edtTNov_Procedimiento_Enabled = 0 ;
      edtTNov_Nro_Cambios_Jsonclick = "" ;
      edtTNov_Nro_Cambios_Enabled = 0 ;
      cmbTNov_Tipo.setJsonclick( "" );
      cmbTNov_Tipo.setEnabled( 0 );
      edtTNov_Descripcion_Link = "" ;
      edtTNov_Descripcion_Enabled = 0 ;
      edtTNov_Codigo_Jsonclick = "" ;
      edtTNov_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e113F1',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e123F1',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',nv:0}],oparms:[]}");
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
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A769TNov_Descripcion = "" ;
      A770TNov_Tipo = "" ;
      A772TNov_Procedimiento = "" ;
      A773TNov_Estado = "" ;
      A774TNov_Nombre_Campo = "" ;
      A775TNov_UsuarioCrea = "" ;
      A776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A777TNov_UsuarioModifica = "" ;
      A778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A813TNov_IngresoMasivo = "" ;
      A839TNov_ObligaSoporte = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H003F2_A104TNov_Codigo = new int[1] ;
      H003F2_n104TNov_Codigo = new boolean[] {false} ;
      H003F2_A106Nove_Identificador = new long[1] ;
      H003F2_A839TNov_ObligaSoporte = new String[] {""} ;
      H003F2_n839TNov_ObligaSoporte = new boolean[] {false} ;
      H003F2_A813TNov_IngresoMasivo = new String[] {""} ;
      H003F2_n813TNov_IngresoMasivo = new boolean[] {false} ;
      H003F2_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003F2_n778TNov_FechaModifica = new boolean[] {false} ;
      H003F2_A777TNov_UsuarioModifica = new String[] {""} ;
      H003F2_n777TNov_UsuarioModifica = new boolean[] {false} ;
      H003F2_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003F2_n776TNov_FechaCrea = new boolean[] {false} ;
      H003F2_A775TNov_UsuarioCrea = new String[] {""} ;
      H003F2_n775TNov_UsuarioCrea = new boolean[] {false} ;
      H003F2_A774TNov_Nombre_Campo = new String[] {""} ;
      H003F2_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H003F2_A773TNov_Estado = new String[] {""} ;
      H003F2_n773TNov_Estado = new boolean[] {false} ;
      H003F2_A772TNov_Procedimiento = new String[] {""} ;
      H003F2_n772TNov_Procedimiento = new boolean[] {false} ;
      H003F2_A771TNov_Nro_Cambios = new short[1] ;
      H003F2_n771TNov_Nro_Cambios = new boolean[] {false} ;
      H003F2_A770TNov_Tipo = new String[] {""} ;
      H003F2_n770TNov_Tipo = new boolean[] {false} ;
      H003F2_A769TNov_Descripcion = new String[] {""} ;
      H003F2_n769TNov_Descripcion = new boolean[] {false} ;
      H003F3_A839TNov_ObligaSoporte = new String[] {""} ;
      H003F3_n839TNov_ObligaSoporte = new boolean[] {false} ;
      H003F3_A813TNov_IngresoMasivo = new String[] {""} ;
      H003F3_n813TNov_IngresoMasivo = new boolean[] {false} ;
      H003F3_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003F3_n778TNov_FechaModifica = new boolean[] {false} ;
      H003F3_A777TNov_UsuarioModifica = new String[] {""} ;
      H003F3_n777TNov_UsuarioModifica = new boolean[] {false} ;
      H003F3_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003F3_n776TNov_FechaCrea = new boolean[] {false} ;
      H003F3_A775TNov_UsuarioCrea = new String[] {""} ;
      H003F3_n775TNov_UsuarioCrea = new boolean[] {false} ;
      H003F3_A774TNov_Nombre_Campo = new String[] {""} ;
      H003F3_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H003F3_A773TNov_Estado = new String[] {""} ;
      H003F3_n773TNov_Estado = new boolean[] {false} ;
      H003F3_A772TNov_Procedimiento = new String[] {""} ;
      H003F3_n772TNov_Procedimiento = new boolean[] {false} ;
      H003F3_A771TNov_Nro_Cambios = new short[1] ;
      H003F3_n771TNov_Nro_Cambios = new boolean[] {false} ;
      H003F3_A770TNov_Tipo = new String[] {""} ;
      H003F3_n770TNov_Tipo = new boolean[] {false} ;
      H003F3_A769TNov_Descripcion = new String[] {""} ;
      H003F3_n769TNov_Descripcion = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA104TNov_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_novedadgeneral__default(),
         new Object[] {
             new Object[] {
            H003F2_A104TNov_Codigo, H003F2_n104TNov_Codigo, H003F2_A106Nove_Identificador, H003F2_A839TNov_ObligaSoporte, H003F2_n839TNov_ObligaSoporte, H003F2_A813TNov_IngresoMasivo, H003F2_n813TNov_IngresoMasivo, H003F2_A778TNov_FechaModifica, H003F2_n778TNov_FechaModifica, H003F2_A777TNov_UsuarioModifica,
            H003F2_n777TNov_UsuarioModifica, H003F2_A776TNov_FechaCrea, H003F2_n776TNov_FechaCrea, H003F2_A775TNov_UsuarioCrea, H003F2_n775TNov_UsuarioCrea, H003F2_A774TNov_Nombre_Campo, H003F2_n774TNov_Nombre_Campo, H003F2_A773TNov_Estado, H003F2_n773TNov_Estado, H003F2_A772TNov_Procedimiento,
            H003F2_n772TNov_Procedimiento, H003F2_A771TNov_Nro_Cambios, H003F2_n771TNov_Nro_Cambios, H003F2_A770TNov_Tipo, H003F2_n770TNov_Tipo, H003F2_A769TNov_Descripcion, H003F2_n769TNov_Descripcion
            }
            , new Object[] {
            H003F3_A839TNov_ObligaSoporte, H003F3_n839TNov_ObligaSoporte, H003F3_A813TNov_IngresoMasivo, H003F3_n813TNov_IngresoMasivo, H003F3_A778TNov_FechaModifica, H003F3_n778TNov_FechaModifica, H003F3_A777TNov_UsuarioModifica, H003F3_n777TNov_UsuarioModifica, H003F3_A776TNov_FechaCrea, H003F3_n776TNov_FechaCrea,
            H003F3_A775TNov_UsuarioCrea, H003F3_n775TNov_UsuarioCrea, H003F3_A774TNov_Nombre_Campo, H003F3_n774TNov_Nombre_Campo, H003F3_A773TNov_Estado, H003F3_n773TNov_Estado, H003F3_A772TNov_Procedimiento, H003F3_n772TNov_Procedimiento, H003F3_A771TNov_Nro_Cambios, H003F3_n771TNov_Nro_Cambios,
            H003F3_A770TNov_Tipo, H003F3_n770TNov_Tipo, H003F3_A769TNov_Descripcion, H003F3_n769TNov_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_TIPO_NOVEDADGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_NOVEDADGeneral" ;
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
   private short A771TNov_Nro_Cambios ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA104TNov_Codigo ;
   private int A104TNov_Codigo ;
   private int edtTNov_Codigo_Enabled ;
   private int edtTNov_Descripcion_Enabled ;
   private int edtTNov_Nro_Cambios_Enabled ;
   private int edtTNov_Procedimiento_Enabled ;
   private int edtTNov_Nombre_Campo_Enabled ;
   private int edtTNov_UsuarioCrea_Enabled ;
   private int edtTNov_FechaCrea_Enabled ;
   private int edtTNov_UsuarioModifica_Enabled ;
   private int edtTNov_FechaModifica_Enabled ;
   private int AV7TNov_Codigo ;
   private int idxLst ;
   private long A106Nove_Identificador ;
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
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Descripcion_Internalname ;
   private String edtTNov_Descripcion_Link ;
   private String edtTNov_Nro_Cambios_Internalname ;
   private String edtTNov_Nro_Cambios_Jsonclick ;
   private String edtTNov_Procedimiento_Internalname ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private String A773TNov_Estado ;
   private String edtTNov_Nombre_Campo_Internalname ;
   private String edtTNov_Nombre_Campo_Jsonclick ;
   private String edtTNov_UsuarioCrea_Internalname ;
   private String edtTNov_UsuarioCrea_Jsonclick ;
   private String edtTNov_FechaCrea_Internalname ;
   private String edtTNov_FechaCrea_Jsonclick ;
   private String edtTNov_UsuarioModifica_Internalname ;
   private String edtTNov_UsuarioModifica_Jsonclick ;
   private String edtTNov_FechaModifica_Internalname ;
   private String edtTNov_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA104TNov_Codigo ;
   private java.util.Date A776TNov_FechaCrea ;
   private java.util.Date A778TNov_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean n104TNov_Codigo ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n770TNov_Tipo ;
   private boolean n773TNov_Estado ;
   private boolean n813TNov_IngresoMasivo ;
   private boolean n839TNov_ObligaSoporte ;
   private boolean n778TNov_FechaModifica ;
   private boolean n777TNov_UsuarioModifica ;
   private boolean n776TNov_FechaCrea ;
   private boolean n775TNov_UsuarioCrea ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n772TNov_Procedimiento ;
   private boolean n771TNov_Nro_Cambios ;
   private boolean n769TNov_Descripcion ;
   private boolean returnInSub ;
   private String A769TNov_Descripcion ;
   private String A770TNov_Tipo ;
   private String A772TNov_Procedimiento ;
   private String A774TNov_Nombre_Campo ;
   private String A775TNov_UsuarioCrea ;
   private String A777TNov_UsuarioModifica ;
   private String A813TNov_IngresoMasivo ;
   private String A839TNov_ObligaSoporte ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbTNov_Estado ;
   private HTMLChoice cmbTNov_IngresoMasivo ;
   private HTMLChoice cmbTNov_ObligaSoporte ;
   private IDataStoreProvider pr_default ;
   private int[] H003F2_A104TNov_Codigo ;
   private boolean[] H003F2_n104TNov_Codigo ;
   private long[] H003F2_A106Nove_Identificador ;
   private String[] H003F2_A839TNov_ObligaSoporte ;
   private boolean[] H003F2_n839TNov_ObligaSoporte ;
   private String[] H003F2_A813TNov_IngresoMasivo ;
   private boolean[] H003F2_n813TNov_IngresoMasivo ;
   private java.util.Date[] H003F2_A778TNov_FechaModifica ;
   private boolean[] H003F2_n778TNov_FechaModifica ;
   private String[] H003F2_A777TNov_UsuarioModifica ;
   private boolean[] H003F2_n777TNov_UsuarioModifica ;
   private java.util.Date[] H003F2_A776TNov_FechaCrea ;
   private boolean[] H003F2_n776TNov_FechaCrea ;
   private String[] H003F2_A775TNov_UsuarioCrea ;
   private boolean[] H003F2_n775TNov_UsuarioCrea ;
   private String[] H003F2_A774TNov_Nombre_Campo ;
   private boolean[] H003F2_n774TNov_Nombre_Campo ;
   private String[] H003F2_A773TNov_Estado ;
   private boolean[] H003F2_n773TNov_Estado ;
   private String[] H003F2_A772TNov_Procedimiento ;
   private boolean[] H003F2_n772TNov_Procedimiento ;
   private short[] H003F2_A771TNov_Nro_Cambios ;
   private boolean[] H003F2_n771TNov_Nro_Cambios ;
   private String[] H003F2_A770TNov_Tipo ;
   private boolean[] H003F2_n770TNov_Tipo ;
   private String[] H003F2_A769TNov_Descripcion ;
   private boolean[] H003F2_n769TNov_Descripcion ;
   private String[] H003F3_A839TNov_ObligaSoporte ;
   private boolean[] H003F3_n839TNov_ObligaSoporte ;
   private String[] H003F3_A813TNov_IngresoMasivo ;
   private boolean[] H003F3_n813TNov_IngresoMasivo ;
   private java.util.Date[] H003F3_A778TNov_FechaModifica ;
   private boolean[] H003F3_n778TNov_FechaModifica ;
   private String[] H003F3_A777TNov_UsuarioModifica ;
   private boolean[] H003F3_n777TNov_UsuarioModifica ;
   private java.util.Date[] H003F3_A776TNov_FechaCrea ;
   private boolean[] H003F3_n776TNov_FechaCrea ;
   private String[] H003F3_A775TNov_UsuarioCrea ;
   private boolean[] H003F3_n775TNov_UsuarioCrea ;
   private String[] H003F3_A774TNov_Nombre_Campo ;
   private boolean[] H003F3_n774TNov_Nombre_Campo ;
   private String[] H003F3_A773TNov_Estado ;
   private boolean[] H003F3_n773TNov_Estado ;
   private String[] H003F3_A772TNov_Procedimiento ;
   private boolean[] H003F3_n772TNov_Procedimiento ;
   private short[] H003F3_A771TNov_Nro_Cambios ;
   private boolean[] H003F3_n771TNov_Nro_Cambios ;
   private String[] H003F3_A770TNov_Tipo ;
   private boolean[] H003F3_n770TNov_Tipo ;
   private String[] H003F3_A769TNov_Descripcion ;
   private boolean[] H003F3_n769TNov_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_tipo_novedadgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003F2", "SELECT T1.TNov_Codigo, T1.Nove_Identificador, T2.TNov_ObligaSoporte, T2.TNov_IngresoMasivo, T2.TNov_FechaModifica, T2.TNov_UsuarioModifica, T2.TNov_FechaCrea, T2.TNov_UsuarioCrea, T2.TNov_Nombre_Campo, T2.TNov_Estado, T2.TNov_Procedimiento, T2.TNov_Nro_Cambios, T2.TNov_Tipo, T2.TNov_Descripcion FROM (ALM_NOVEDAD T1 LEFT JOIN ALM_TIPO_NOVEDAD T2 ON T2.TNov_Codigo = T1.TNov_Codigo) WHERE T1.TNov_Codigo = ? ORDER BY T1.TNov_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H003F3", "SELECT TNov_ObligaSoporte, TNov_IngresoMasivo, TNov_FechaModifica, TNov_UsuarioModifica, TNov_FechaCrea, TNov_UsuarioCrea, TNov_Nombre_Campo, TNov_Estado, TNov_Procedimiento, TNov_Nro_Cambios, TNov_Tipo, TNov_Descripcion FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
      }
   }

}

