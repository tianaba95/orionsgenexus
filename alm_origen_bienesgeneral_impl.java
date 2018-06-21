/*
               File: alm_origen_bienesgeneral_impl
        Description: ALM_ORIGEN_BIENESGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:33.61
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

public final  class alm_origen_bienesgeneral_impl extends GXWebComponent
{
   public alm_origen_bienesgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_origen_bienesgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_origen_bienesgeneral_impl.class ));
   }

   public alm_origen_bienesgeneral_impl( int remoteHandle ,
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
      cmbOrig_Tipo = new HTMLChoice();
      cmbOrig_Estado = new HTMLChoice();
      cmbOrig_TipoE_S = new HTMLChoice();
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
               A41Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A41Orig_Identificador)});
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
         pa5X2( ) ;
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
         httpContext.writeValue( "ALM_ORIGEN_BIENESGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173365");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_origen_bienesgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A41Orig_Identificador,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA41Orig_Identificador", GXutil.ltrim( localUtil.ntoc( wcpOA41Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A640Orig_Tipo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A676Orig_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A700Orig_TipoE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_DESCRIPCION_ABREVIADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A636Orig_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A637Orig_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A638Orig_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ORIG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A639Orig_FechaModifica, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm5X2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_origen_bienesgeneral.js", "?201861414173367");
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
      return "ALM_ORIGEN_BIENESGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ORIGEN_BIENESGeneral" ;
   }

   public void wb5X0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_origen_bienesgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e115x1_client"+"'", TempTags, "", 2, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e125x1_client"+"'", TempTags, "", 2, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Identificador_Internalname, "Identificador", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtOrig_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Identificador_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOrig_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Descripcion_Internalname, A635Orig_Descripcion, GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOrig_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_Tipo.getInternalname(), "Tipo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_Tipo, cmbOrig_Tipo.getInternalname(), GXutil.rtrim( A640Orig_Tipo), 1, cmbOrig_Tipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOrig_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         cmbOrig_Tipo.setValue( GXutil.rtrim( A640Orig_Tipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbOrig_Tipo.getInternalname(), "Values", cmbOrig_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_Estado, cmbOrig_Estado.getInternalname(), GXutil.rtrim( A676Orig_Estado), 1, cmbOrig_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOrig_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         cmbOrig_Estado.setValue( GXutil.rtrim( A676Orig_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbOrig_Estado.getInternalname(), "Values", cmbOrig_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_TipoE_S.getInternalname(), "o Salida", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_TipoE_S, cmbOrig_TipoE_S.getInternalname(), GXutil.rtrim( A700Orig_TipoE_S), 1, cmbOrig_TipoE_S.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbOrig_TipoE_S.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         cmbOrig_TipoE_S.setValue( GXutil.rtrim( A700Orig_TipoE_S) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbOrig_TipoE_S.getInternalname(), "Values", cmbOrig_TipoE_S.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Descripcion_Abreviado_Internalname, "Abreviado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Descripcion_Abreviado_Internalname, A755Orig_Descripcion_Abreviado, GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Descripcion_Abreviado_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtOrig_Descripcion_Abreviado_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_UsuarioCrea_Internalname, A636Orig_UsuarioCrea, GXutil.rtrim( localUtil.format( A636Orig_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_UsuarioCrea_Jsonclick, 0, "Attribute", "", "", "", edtOrig_UsuarioCrea_Visible, edtOrig_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_FechaCrea_Internalname, "Fecha creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOrig_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_FechaCrea_Internalname, localUtil.ttoc( A637Orig_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A637Orig_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_FechaCrea_Jsonclick, 0, "Attribute", "", "", "", edtOrig_FechaCrea_Visible, edtOrig_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtOrig_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtOrig_FechaCrea_Visible==0)||(edtOrig_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_UsuarioModifica_Internalname, "Usuario Modificación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_UsuarioModifica_Internalname, A638Orig_UsuarioModifica, GXutil.rtrim( localUtil.format( A638Orig_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", edtOrig_UsuarioModifica_Visible, edtOrig_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_FechaModifica_Internalname, "Fecha de Modificacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtOrig_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_FechaModifica_Internalname, localUtil.ttoc( A639Orig_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A639Orig_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", edtOrig_FechaModifica_Visible, edtOrig_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtOrig_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtOrig_FechaModifica_Visible==0)||(edtOrig_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ORIGEN_BIENESGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start5X2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ORIGEN_BIENESGeneral", (short)(0)) ;
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
            strup5X0( ) ;
         }
      }
   }

   public void ws5X2( )
   {
      start5X2( ) ;
      evt5X2( ) ;
   }

   public void evt5X2( )
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
                              strup5X0( ) ;
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
                              strup5X0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e135X2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5X0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e145X2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup5X0( ) ;
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
                              strup5X0( ) ;
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

   public void we5X2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm5X2( ) ;
         }
      }
   }

   public void pa5X2( )
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
         cmbOrig_Tipo.setName( "ORIG_TIPO" );
         cmbOrig_Tipo.setWebtags( "" );
         cmbOrig_Tipo.addItem("ORIGE", "Orígen de los bienes", (short)(0));
         cmbOrig_Tipo.addItem("BAJAS", "Destinaciones de las bajas", (short)(0));
         if ( cmbOrig_Tipo.getItemCount() > 0 )
         {
            A640Orig_Tipo = cmbOrig_Tipo.getValidValue(A640Orig_Tipo) ;
            n640Orig_Tipo = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A640Orig_Tipo", A640Orig_Tipo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A640Orig_Tipo, ""))));
         }
         cmbOrig_Estado.setName( "ORIG_ESTADO" );
         cmbOrig_Estado.setWebtags( "" );
         cmbOrig_Estado.addItem("", "", (short)(0));
         cmbOrig_Estado.addItem("A", "Activo", (short)(0));
         cmbOrig_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbOrig_Estado.getItemCount() > 0 )
         {
            A676Orig_Estado = cmbOrig_Estado.getValidValue(A676Orig_Estado) ;
            n676Orig_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A676Orig_Estado", A676Orig_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A676Orig_Estado, ""))));
         }
         cmbOrig_TipoE_S.setName( "ORIG_TIPOE_S" );
         cmbOrig_TipoE_S.setWebtags( "" );
         cmbOrig_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbOrig_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbOrig_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbOrig_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbOrig_TipoE_S.getItemCount() > 0 )
         {
            A700Orig_TipoE_S = cmbOrig_TipoE_S.getValidValue(A700Orig_TipoE_S) ;
            n700Orig_TipoE_S = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A700Orig_TipoE_S, ""))));
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
      if ( cmbOrig_Tipo.getItemCount() > 0 )
      {
         A640Orig_Tipo = cmbOrig_Tipo.getValidValue(A640Orig_Tipo) ;
         n640Orig_Tipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A640Orig_Tipo", A640Orig_Tipo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A640Orig_Tipo, ""))));
      }
      if ( cmbOrig_Estado.getItemCount() > 0 )
      {
         A676Orig_Estado = cmbOrig_Estado.getValidValue(A676Orig_Estado) ;
         n676Orig_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A676Orig_Estado", A676Orig_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A676Orig_Estado, ""))));
      }
      if ( cmbOrig_TipoE_S.getItemCount() > 0 )
      {
         A700Orig_TipoE_S = cmbOrig_TipoE_S.getValidValue(A700Orig_TipoE_S) ;
         n700Orig_TipoE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A700Orig_TipoE_S, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf5X2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_ORIGEN_BIENESGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf5X2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H005X2 */
         pr_default.execute(0, new Object[] {new Long(A41Orig_Identificador)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A639Orig_FechaModifica = H005X2_A639Orig_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A639Orig_FechaModifica", localUtil.ttoc( A639Orig_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A639Orig_FechaModifica, "99/99/99 99:99")));
            n639Orig_FechaModifica = H005X2_n639Orig_FechaModifica[0] ;
            A638Orig_UsuarioModifica = H005X2_A638Orig_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A638Orig_UsuarioModifica", A638Orig_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A638Orig_UsuarioModifica, "@!"))));
            n638Orig_UsuarioModifica = H005X2_n638Orig_UsuarioModifica[0] ;
            A637Orig_FechaCrea = H005X2_A637Orig_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A637Orig_FechaCrea", localUtil.ttoc( A637Orig_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A637Orig_FechaCrea, "99/99/99 99:99")));
            n637Orig_FechaCrea = H005X2_n637Orig_FechaCrea[0] ;
            A636Orig_UsuarioCrea = H005X2_A636Orig_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A636Orig_UsuarioCrea", A636Orig_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A636Orig_UsuarioCrea, "@!"))));
            n636Orig_UsuarioCrea = H005X2_n636Orig_UsuarioCrea[0] ;
            A755Orig_Descripcion_Abreviado = H005X2_A755Orig_Descripcion_Abreviado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A755Orig_Descripcion_Abreviado", A755Orig_Descripcion_Abreviado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_DESCRIPCION_ABREVIADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, ""))));
            n755Orig_Descripcion_Abreviado = H005X2_n755Orig_Descripcion_Abreviado[0] ;
            A700Orig_TipoE_S = H005X2_A700Orig_TipoE_S[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A700Orig_TipoE_S, ""))));
            n700Orig_TipoE_S = H005X2_n700Orig_TipoE_S[0] ;
            A676Orig_Estado = H005X2_A676Orig_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A676Orig_Estado", A676Orig_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A676Orig_Estado, ""))));
            n676Orig_Estado = H005X2_n676Orig_Estado[0] ;
            A640Orig_Tipo = H005X2_A640Orig_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A640Orig_Tipo", A640Orig_Tipo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A640Orig_Tipo, ""))));
            n640Orig_Tipo = H005X2_n640Orig_Tipo[0] ;
            A635Orig_Descripcion = H005X2_A635Orig_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A635Orig_Descripcion", A635Orig_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!"))));
            n635Orig_Descripcion = H005X2_n635Orig_Descripcion[0] ;
            /* Execute user event: Load */
            e145X2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb5X0( ) ;
      }
   }

   public void strup5X0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_ORIGEN_BIENESGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e135X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A635Orig_Descripcion = GXutil.upper( httpContext.cgiGet( edtOrig_Descripcion_Internalname)) ;
         n635Orig_Descripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A635Orig_Descripcion", A635Orig_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!"))));
         cmbOrig_Tipo.setValue( httpContext.cgiGet( cmbOrig_Tipo.getInternalname()) );
         A640Orig_Tipo = httpContext.cgiGet( cmbOrig_Tipo.getInternalname()) ;
         n640Orig_Tipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A640Orig_Tipo", A640Orig_Tipo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A640Orig_Tipo, ""))));
         cmbOrig_Estado.setValue( httpContext.cgiGet( cmbOrig_Estado.getInternalname()) );
         A676Orig_Estado = httpContext.cgiGet( cmbOrig_Estado.getInternalname()) ;
         n676Orig_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A676Orig_Estado", A676Orig_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A676Orig_Estado, ""))));
         cmbOrig_TipoE_S.setValue( httpContext.cgiGet( cmbOrig_TipoE_S.getInternalname()) );
         A700Orig_TipoE_S = httpContext.cgiGet( cmbOrig_TipoE_S.getInternalname()) ;
         n700Orig_TipoE_S = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_TIPOE_S", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A700Orig_TipoE_S, ""))));
         A755Orig_Descripcion_Abreviado = httpContext.cgiGet( edtOrig_Descripcion_Abreviado_Internalname) ;
         n755Orig_Descripcion_Abreviado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A755Orig_Descripcion_Abreviado", A755Orig_Descripcion_Abreviado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_DESCRIPCION_ABREVIADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, ""))));
         A636Orig_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtOrig_UsuarioCrea_Internalname)) ;
         n636Orig_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A636Orig_UsuarioCrea", A636Orig_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A636Orig_UsuarioCrea, "@!"))));
         A637Orig_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtOrig_FechaCrea_Internalname), 0) ;
         n637Orig_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A637Orig_FechaCrea", localUtil.ttoc( A637Orig_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A637Orig_FechaCrea, "99/99/99 99:99")));
         A638Orig_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtOrig_UsuarioModifica_Internalname)) ;
         n638Orig_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A638Orig_UsuarioModifica", A638Orig_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A638Orig_UsuarioModifica, "@!"))));
         A639Orig_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtOrig_FechaModifica_Internalname), 0) ;
         n639Orig_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A639Orig_FechaModifica", localUtil.ttoc( A639Orig_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ORIG_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A639Orig_FechaModifica, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA41Orig_Identificador"), ",", ".") ;
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
      e135X2 ();
      if (returnInSub) return;
   }

   public void e135X2( )
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

   protected void e145X2( )
   {
      /* Load Routine */
      edtOrig_UsuarioCrea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOrig_UsuarioCrea_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_UsuarioCrea_Visible, 5, 0)), true);
      edtOrig_FechaCrea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOrig_FechaCrea_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_FechaCrea_Visible, 5, 0)), true);
      edtOrig_UsuarioModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOrig_UsuarioModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_UsuarioModifica_Visible, 5, 0)), true);
      edtOrig_FechaModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtOrig_FechaModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_FechaModifica_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ORIGEN_BIENES" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Orig_Identificador" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Orig_Identificador, 11, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A41Orig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
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
      pa5X2( ) ;
      ws5X2( ) ;
      we5X2( ) ;
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
      sCtrlA41Orig_Identificador = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa5X2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_origen_bienesgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa5X2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A41Orig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
      }
      wcpOA41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA41Orig_Identificador"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A41Orig_Identificador != wcpOA41Orig_Identificador ) ) )
      {
         setjustcreated();
      }
      wcpOA41Orig_Identificador = A41Orig_Identificador ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA41Orig_Identificador = httpContext.cgiGet( sPrefix+"A41Orig_Identificador_CTRL") ;
      if ( GXutil.len( sCtrlA41Orig_Identificador) > 0 )
      {
         A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sCtrlA41Orig_Identificador), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
      }
      else
      {
         A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( sPrefix+"A41Orig_Identificador_PARM"), ",", ".") ;
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
      pa5X2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws5X2( ) ;
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
      ws5X2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A41Orig_Identificador_PARM", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA41Orig_Identificador)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A41Orig_Identificador_CTRL", GXutil.rtrim( sCtrlA41Orig_Identificador));
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
      we5X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173417");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_origen_bienesgeneral.js", "?201861414173417");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtOrig_Identificador_Internalname = sPrefix+"ORIG_IDENTIFICADOR" ;
      edtOrig_Descripcion_Internalname = sPrefix+"ORIG_DESCRIPCION" ;
      cmbOrig_Tipo.setInternalname( sPrefix+"ORIG_TIPO" );
      cmbOrig_Estado.setInternalname( sPrefix+"ORIG_ESTADO" );
      cmbOrig_TipoE_S.setInternalname( sPrefix+"ORIG_TIPOE_S" );
      edtOrig_Descripcion_Abreviado_Internalname = sPrefix+"ORIG_DESCRIPCION_ABREVIADO" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtOrig_UsuarioCrea_Internalname = sPrefix+"ORIG_USUARIOCREA" ;
      edtOrig_FechaCrea_Internalname = sPrefix+"ORIG_FECHACREA" ;
      edtOrig_UsuarioModifica_Internalname = sPrefix+"ORIG_USUARIOMODIFICA" ;
      edtOrig_FechaModifica_Internalname = sPrefix+"ORIG_FECHAMODIFICA" ;
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
      edtOrig_FechaModifica_Jsonclick = "" ;
      edtOrig_FechaModifica_Enabled = 0 ;
      edtOrig_FechaModifica_Visible = 1 ;
      edtOrig_UsuarioModifica_Jsonclick = "" ;
      edtOrig_UsuarioModifica_Enabled = 0 ;
      edtOrig_UsuarioModifica_Visible = 1 ;
      edtOrig_FechaCrea_Jsonclick = "" ;
      edtOrig_FechaCrea_Enabled = 0 ;
      edtOrig_FechaCrea_Visible = 1 ;
      edtOrig_UsuarioCrea_Jsonclick = "" ;
      edtOrig_UsuarioCrea_Enabled = 0 ;
      edtOrig_UsuarioCrea_Visible = 1 ;
      edtOrig_Descripcion_Abreviado_Jsonclick = "" ;
      edtOrig_Descripcion_Abreviado_Enabled = 0 ;
      cmbOrig_TipoE_S.setJsonclick( "" );
      cmbOrig_TipoE_S.setEnabled( 0 );
      cmbOrig_Estado.setJsonclick( "" );
      cmbOrig_Estado.setEnabled( 0 );
      cmbOrig_Tipo.setJsonclick( "" );
      cmbOrig_Tipo.setEnabled( 0 );
      edtOrig_Descripcion_Jsonclick = "" ;
      edtOrig_Descripcion_Enabled = 0 ;
      edtOrig_Identificador_Jsonclick = "" ;
      edtOrig_Identificador_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e115X1',iparms:[{av:'A41Orig_Identificador',fld:'ORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e125X1',iparms:[{av:'A41Orig_Identificador',fld:'ORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A635Orig_Descripcion = "" ;
      A640Orig_Tipo = "" ;
      A676Orig_Estado = "" ;
      A700Orig_TipoE_S = "" ;
      A755Orig_Descripcion_Abreviado = "" ;
      A636Orig_UsuarioCrea = "" ;
      A637Orig_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A638Orig_UsuarioModifica = "" ;
      A639Orig_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
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
      H005X2_A41Orig_Identificador = new long[1] ;
      H005X2_A639Orig_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H005X2_n639Orig_FechaModifica = new boolean[] {false} ;
      H005X2_A638Orig_UsuarioModifica = new String[] {""} ;
      H005X2_n638Orig_UsuarioModifica = new boolean[] {false} ;
      H005X2_A637Orig_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H005X2_n637Orig_FechaCrea = new boolean[] {false} ;
      H005X2_A636Orig_UsuarioCrea = new String[] {""} ;
      H005X2_n636Orig_UsuarioCrea = new boolean[] {false} ;
      H005X2_A755Orig_Descripcion_Abreviado = new String[] {""} ;
      H005X2_n755Orig_Descripcion_Abreviado = new boolean[] {false} ;
      H005X2_A700Orig_TipoE_S = new String[] {""} ;
      H005X2_n700Orig_TipoE_S = new boolean[] {false} ;
      H005X2_A676Orig_Estado = new String[] {""} ;
      H005X2_n676Orig_Estado = new boolean[] {false} ;
      H005X2_A640Orig_Tipo = new String[] {""} ;
      H005X2_n640Orig_Tipo = new boolean[] {false} ;
      H005X2_A635Orig_Descripcion = new String[] {""} ;
      H005X2_n635Orig_Descripcion = new boolean[] {false} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA41Orig_Identificador = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_origen_bienesgeneral__default(),
         new Object[] {
             new Object[] {
            H005X2_A41Orig_Identificador, H005X2_A639Orig_FechaModifica, H005X2_n639Orig_FechaModifica, H005X2_A638Orig_UsuarioModifica, H005X2_n638Orig_UsuarioModifica, H005X2_A637Orig_FechaCrea, H005X2_n637Orig_FechaCrea, H005X2_A636Orig_UsuarioCrea, H005X2_n636Orig_UsuarioCrea, H005X2_A755Orig_Descripcion_Abreviado,
            H005X2_n755Orig_Descripcion_Abreviado, H005X2_A700Orig_TipoE_S, H005X2_n700Orig_TipoE_S, H005X2_A676Orig_Estado, H005X2_n676Orig_Estado, H005X2_A640Orig_Tipo, H005X2_n640Orig_Tipo, H005X2_A635Orig_Descripcion, H005X2_n635Orig_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_ORIGEN_BIENESGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_ORIGEN_BIENESGeneral" ;
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
   private int edtOrig_Identificador_Enabled ;
   private int edtOrig_Descripcion_Enabled ;
   private int edtOrig_Descripcion_Abreviado_Enabled ;
   private int edtOrig_UsuarioCrea_Visible ;
   private int edtOrig_UsuarioCrea_Enabled ;
   private int edtOrig_FechaCrea_Visible ;
   private int edtOrig_FechaCrea_Enabled ;
   private int edtOrig_UsuarioModifica_Visible ;
   private int edtOrig_UsuarioModifica_Enabled ;
   private int edtOrig_FechaModifica_Visible ;
   private int edtOrig_FechaModifica_Enabled ;
   private int idxLst ;
   private long wcpOA41Orig_Identificador ;
   private long A41Orig_Identificador ;
   private long AV7Orig_Identificador ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A640Orig_Tipo ;
   private String A676Orig_Estado ;
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
   private String edtOrig_Identificador_Internalname ;
   private String edtOrig_Identificador_Jsonclick ;
   private String edtOrig_Descripcion_Internalname ;
   private String edtOrig_Descripcion_Jsonclick ;
   private String edtOrig_Descripcion_Abreviado_Internalname ;
   private String edtOrig_Descripcion_Abreviado_Jsonclick ;
   private String edtOrig_UsuarioCrea_Internalname ;
   private String edtOrig_UsuarioCrea_Jsonclick ;
   private String edtOrig_FechaCrea_Internalname ;
   private String edtOrig_FechaCrea_Jsonclick ;
   private String edtOrig_UsuarioModifica_Internalname ;
   private String edtOrig_UsuarioModifica_Jsonclick ;
   private String edtOrig_FechaModifica_Internalname ;
   private String edtOrig_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA41Orig_Identificador ;
   private java.util.Date A637Orig_FechaCrea ;
   private java.util.Date A639Orig_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n640Orig_Tipo ;
   private boolean n676Orig_Estado ;
   private boolean n700Orig_TipoE_S ;
   private boolean n639Orig_FechaModifica ;
   private boolean n638Orig_UsuarioModifica ;
   private boolean n637Orig_FechaCrea ;
   private boolean n636Orig_UsuarioCrea ;
   private boolean n755Orig_Descripcion_Abreviado ;
   private boolean n635Orig_Descripcion ;
   private boolean returnInSub ;
   private String A635Orig_Descripcion ;
   private String A700Orig_TipoE_S ;
   private String A755Orig_Descripcion_Abreviado ;
   private String A636Orig_UsuarioCrea ;
   private String A638Orig_UsuarioModifica ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbOrig_Tipo ;
   private HTMLChoice cmbOrig_Estado ;
   private HTMLChoice cmbOrig_TipoE_S ;
   private IDataStoreProvider pr_default ;
   private long[] H005X2_A41Orig_Identificador ;
   private java.util.Date[] H005X2_A639Orig_FechaModifica ;
   private boolean[] H005X2_n639Orig_FechaModifica ;
   private String[] H005X2_A638Orig_UsuarioModifica ;
   private boolean[] H005X2_n638Orig_UsuarioModifica ;
   private java.util.Date[] H005X2_A637Orig_FechaCrea ;
   private boolean[] H005X2_n637Orig_FechaCrea ;
   private String[] H005X2_A636Orig_UsuarioCrea ;
   private boolean[] H005X2_n636Orig_UsuarioCrea ;
   private String[] H005X2_A755Orig_Descripcion_Abreviado ;
   private boolean[] H005X2_n755Orig_Descripcion_Abreviado ;
   private String[] H005X2_A700Orig_TipoE_S ;
   private boolean[] H005X2_n700Orig_TipoE_S ;
   private String[] H005X2_A676Orig_Estado ;
   private boolean[] H005X2_n676Orig_Estado ;
   private String[] H005X2_A640Orig_Tipo ;
   private boolean[] H005X2_n640Orig_Tipo ;
   private String[] H005X2_A635Orig_Descripcion ;
   private boolean[] H005X2_n635Orig_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_origen_bienesgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H005X2", "SELECT Orig_Identificador, Orig_FechaModifica, Orig_UsuarioModifica, Orig_FechaCrea, Orig_UsuarioCrea, Orig_Descripcion_Abreviado, Orig_TipoE_S, Orig_Estado, Orig_Tipo, Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ORDER BY Orig_Identificador ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 5) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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

