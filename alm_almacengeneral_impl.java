/*
               File: alm_almacengeneral_impl
        Description: ALM_ALMACENGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:38.15
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

public final  class alm_almacengeneral_impl extends GXWebComponent
{
   public alm_almacengeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_almacengeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_almacengeneral_impl.class ));
   }

   public alm_almacengeneral_impl( int remoteHandle ,
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
      cmbAlma_Estado = new HTMLChoice();
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
               A28Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A28Alma_Codigo,A27Alma_Modulo,new Long(A1Cent_Id)});
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
         pa0N2( ) ;
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
         httpContext.writeValue( "ALM_ALMACENGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414113822");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_almacengeneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA28Alma_Codigo", wcpOA28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA27Alma_Modulo", wcpOA27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA1Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOA1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A259Alma_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_TELEFONO1", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_TELEFONO2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_FAX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_CUENTADEBITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A263Alma_CuentaDebito, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_CUENTACREDITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A264Alma_CuentaCredito, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A255Alma_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A256Alma_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A257Alma_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A258Alma_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_IDRESPONSABLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPAL_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALMA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "ALM_ALMACENGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_almacengeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm0N2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_almacengeneral.js", "?201861414113825");
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
      return "ALM_ALMACENGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_ALMACENGeneral" ;
   }

   public void wb0N0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_almacengeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110n1_client"+"'", TempTags, "", 2, "HLP_ALM_ALMACENGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120n1_client"+"'", TempTags, "", 2, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código del Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Codigo_Internalname, "Código", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Codigo_Internalname, A28Alma_Codigo, GXutil.rtrim( localUtil.format( A28Alma_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Descripcion_Internalname, "Descripción Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Descripcion_Internalname, A252Alma_Descripcion, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Direccion_Internalname, "Dirección", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtAlma_Direccion_Internalname, A259Alma_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A259Alma_Direccion), "", (short)(0), 1, edtAlma_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Telefono1_Internalname, "Telefono1", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Telefono1_Internalname, GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Telefono1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Telefono1_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Telefono1_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Telefono2_Internalname, "Telefono2", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Telefono2_Internalname, GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Telefono2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Telefono2_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Telefono2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Fax_Internalname, "Fax", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Fax_Internalname, GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Fax_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Fax_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Fax_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_CuentaDebito_Internalname, "Cuenta Débito", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_CuentaDebito_Internalname, A263Alma_CuentaDebito, GXutil.rtrim( localUtil.format( A263Alma_CuentaDebito, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_CuentaDebito_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_CuentaDebito_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_CuentaCredito_Internalname, "Cuenta Crédito", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_CuentaCredito_Internalname, A264Alma_CuentaCredito, GXutil.rtrim( localUtil.format( A264Alma_CuentaCredito, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_CuentaCredito_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_CuentaCredito_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_NombreResponsable_Internalname, "Nombre Responsable", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_NombreResponsable_Internalname, A266Alma_NombreResponsable, GXutil.rtrim( localUtil.format( A266Alma_NombreResponsable, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_NombreResponsable_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_NombreResponsable_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_EmailResponsable_Internalname, "Email Responsable", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_EmailResponsable_Internalname, A268Alma_EmailResponsable, GXutil.rtrim( localUtil.format( A268Alma_EmailResponsable, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "mailto:"+A268Alma_EmailResponsable, "", "", "", edtAlma_EmailResponsable_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_EmailResponsable_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlma_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_FechaCrea_Internalname, localUtil.ttoc( A255Alma_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A255Alma_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMACENGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlma_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlma_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_UsuarioCrea_Internalname, A256Alma_UsuarioCrea, GXutil.rtrim( localUtil.format( A256Alma_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_FechaModifica_Internalname, "Fecha Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlma_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_FechaModifica_Internalname, localUtil.ttoc( A257Alma_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A257Alma_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMACENGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlma_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlma_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_UsuarioModifica_Internalname, "Usuario Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_UsuarioModifica_Internalname, A258Alma_UsuarioModifica, GXutil.rtrim( localUtil.format( A258Alma_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_IdResponsable_Internalname, "Responsable", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_IdResponsable_Internalname, GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")), ((edtAlma_IdResponsable_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_IdResponsable_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_IdResponsable_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Id_Internalname, "Id Tipo Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")), ((edtTpal_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpal_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Descripcion_Internalname, "Descripción Tipo Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Descripcion_Internalname, A307Tpal_Descripcion, GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtTpal_Descripcion_Link, "", "", "", edtTpal_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpal_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Identificador Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCent_Descripcion_Link, "", "", "", edtCent_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ALMACENGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Estado, cmbAlma_Estado.getInternalname(), GXutil.rtrim( A673Alma_Estado), 1, cmbAlma_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlma_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_ALMACENGeneral.htm");
         cmbAlma_Estado.setValue( GXutil.rtrim( A673Alma_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlma_Estado.getInternalname(), "Values", cmbAlma_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_CedulaResponsable_Internalname, "Cedula Responsable", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_CedulaResponsable_Internalname, GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ",", "")), ((edtAlma_CedulaResponsable_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A265Alma_CedulaResponsable), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A265Alma_CedulaResponsable), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_CedulaResponsable_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_CedulaResponsable_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACENGeneral.htm");
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

   public void start0N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_ALMACENGeneral", (short)(0)) ;
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
            strup0N0( ) ;
         }
      }
   }

   public void ws0N2( )
   {
      start0N2( ) ;
      evt0N2( ) ;
   }

   public void evt0N2( )
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
                              strup0N0( ) ;
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
                              strup0N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0N0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140N2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0N0( ) ;
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
                              strup0N0( ) ;
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

   public void we0N2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0N2( ) ;
         }
      }
   }

   public void pa0N2( )
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
         cmbAlma_Estado.setName( "ALMA_ESTADO" );
         cmbAlma_Estado.setWebtags( "" );
         cmbAlma_Estado.addItem("A", "Activo", (short)(0));
         cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlma_Estado.getItemCount() > 0 )
         {
            A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
            n673Alma_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A673Alma_Estado", A673Alma_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
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
      if ( cmbAlma_Estado.getItemCount() > 0 )
      {
         A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
         n673Alma_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A673Alma_Estado", A673Alma_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0N2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV16Pgmname = "ALM_ALMACENGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0N2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000N2 */
         pr_default.execute(0, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A265Alma_CedulaResponsable = H000N2_A265Alma_CedulaResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A265Alma_CedulaResponsable", GXutil.ltrim( GXutil.str( A265Alma_CedulaResponsable, 18, 0)));
            n265Alma_CedulaResponsable = H000N2_n265Alma_CedulaResponsable[0] ;
            A673Alma_Estado = H000N2_A673Alma_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A673Alma_Estado", A673Alma_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
            n673Alma_Estado = H000N2_n673Alma_Estado[0] ;
            A307Tpal_Descripcion = H000N2_A307Tpal_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
            A29Tpal_Id = H000N2_A29Tpal_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPAL_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
            A30Alma_IdResponsable = H000N2_A30Alma_IdResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_IDRESPONSABLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")));
            A258Alma_UsuarioModifica = H000N2_A258Alma_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A258Alma_UsuarioModifica", A258Alma_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A258Alma_UsuarioModifica, "@!"))));
            n258Alma_UsuarioModifica = H000N2_n258Alma_UsuarioModifica[0] ;
            A257Alma_FechaModifica = H000N2_A257Alma_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A257Alma_FechaModifica", localUtil.ttoc( A257Alma_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A257Alma_FechaModifica, "99/99/99 99:99")));
            n257Alma_FechaModifica = H000N2_n257Alma_FechaModifica[0] ;
            A256Alma_UsuarioCrea = H000N2_A256Alma_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A256Alma_UsuarioCrea", A256Alma_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A256Alma_UsuarioCrea, "@!"))));
            n256Alma_UsuarioCrea = H000N2_n256Alma_UsuarioCrea[0] ;
            A255Alma_FechaCrea = H000N2_A255Alma_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A255Alma_FechaCrea", localUtil.ttoc( A255Alma_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A255Alma_FechaCrea, "99/99/99 99:99")));
            n255Alma_FechaCrea = H000N2_n255Alma_FechaCrea[0] ;
            A268Alma_EmailResponsable = H000N2_A268Alma_EmailResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
            n268Alma_EmailResponsable = H000N2_n268Alma_EmailResponsable[0] ;
            A266Alma_NombreResponsable = H000N2_A266Alma_NombreResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
            n266Alma_NombreResponsable = H000N2_n266Alma_NombreResponsable[0] ;
            A264Alma_CuentaCredito = H000N2_A264Alma_CuentaCredito[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_CUENTACREDITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A264Alma_CuentaCredito, ""))));
            n264Alma_CuentaCredito = H000N2_n264Alma_CuentaCredito[0] ;
            A263Alma_CuentaDebito = H000N2_A263Alma_CuentaDebito[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_CUENTADEBITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A263Alma_CuentaDebito, ""))));
            n263Alma_CuentaDebito = H000N2_n263Alma_CuentaDebito[0] ;
            A262Alma_Fax = H000N2_A262Alma_Fax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FAX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")));
            n262Alma_Fax = H000N2_n262Alma_Fax[0] ;
            A261Alma_Telefono2 = H000N2_A261Alma_Telefono2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_TELEFONO2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")));
            n261Alma_Telefono2 = H000N2_n261Alma_Telefono2[0] ;
            A260Alma_Telefono1 = H000N2_A260Alma_Telefono1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_TELEFONO1", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
            n260Alma_Telefono1 = H000N2_n260Alma_Telefono1[0] ;
            A259Alma_Direccion = H000N2_A259Alma_Direccion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A259Alma_Direccion", A259Alma_Direccion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A259Alma_Direccion, ""))));
            n259Alma_Direccion = H000N2_n259Alma_Direccion[0] ;
            A252Alma_Descripcion = H000N2_A252Alma_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252Alma_Descripcion", A252Alma_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
            A307Tpal_Descripcion = H000N2_A307Tpal_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
            A265Alma_CedulaResponsable = H000N2_A265Alma_CedulaResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A265Alma_CedulaResponsable", GXutil.ltrim( GXutil.str( A265Alma_CedulaResponsable, 18, 0)));
            n265Alma_CedulaResponsable = H000N2_n265Alma_CedulaResponsable[0] ;
            A268Alma_EmailResponsable = H000N2_A268Alma_EmailResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
            n268Alma_EmailResponsable = H000N2_n268Alma_EmailResponsable[0] ;
            A266Alma_NombreResponsable = H000N2_A266Alma_NombreResponsable[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
            n266Alma_NombreResponsable = H000N2_n266Alma_NombreResponsable[0] ;
            /* Execute user event: Load */
            e140N2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0N0( ) ;
      }
   }

   public void strup0N0( )
   {
      /* Before Start, stand alone formulas. */
      AV16Pgmname = "ALM_ALMACENGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H000N3 */
      pr_default.execute(1, new Object[] {new Long(A1Cent_Id)});
      A4Cent_Descripcion = H000N3_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A3Cent_Codigo = H000N3_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
      pr_default.close(1);
      pr_default.close(1);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
         A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252Alma_Descripcion", A252Alma_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         A259Alma_Direccion = httpContext.cgiGet( edtAlma_Direccion_Internalname) ;
         n259Alma_Direccion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A259Alma_Direccion", A259Alma_Direccion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A259Alma_Direccion, ""))));
         A260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") ;
         n260Alma_Telefono1 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_TELEFONO1", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
         A261Alma_Telefono2 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") ;
         n261Alma_Telefono2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_TELEFONO2", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")));
         A262Alma_Fax = localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") ;
         n262Alma_Fax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FAX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")));
         A263Alma_CuentaDebito = httpContext.cgiGet( edtAlma_CuentaDebito_Internalname) ;
         n263Alma_CuentaDebito = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_CUENTADEBITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A263Alma_CuentaDebito, ""))));
         A264Alma_CuentaCredito = httpContext.cgiGet( edtAlma_CuentaCredito_Internalname) ;
         n264Alma_CuentaCredito = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_CUENTACREDITO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A264Alma_CuentaCredito, ""))));
         A266Alma_NombreResponsable = GXutil.upper( httpContext.cgiGet( edtAlma_NombreResponsable_Internalname)) ;
         n266Alma_NombreResponsable = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
         A268Alma_EmailResponsable = httpContext.cgiGet( edtAlma_EmailResponsable_Internalname) ;
         n268Alma_EmailResponsable = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
         A255Alma_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtAlma_FechaCrea_Internalname), 0) ;
         n255Alma_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A255Alma_FechaCrea", localUtil.ttoc( A255Alma_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A255Alma_FechaCrea, "99/99/99 99:99")));
         A256Alma_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtAlma_UsuarioCrea_Internalname)) ;
         n256Alma_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A256Alma_UsuarioCrea", A256Alma_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A256Alma_UsuarioCrea, "@!"))));
         A257Alma_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtAlma_FechaModifica_Internalname), 0) ;
         n257Alma_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A257Alma_FechaModifica", localUtil.ttoc( A257Alma_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A257Alma_FechaModifica, "99/99/99 99:99")));
         A258Alma_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtAlma_UsuarioModifica_Internalname)) ;
         n258Alma_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A258Alma_UsuarioModifica", A258Alma_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A258Alma_UsuarioModifica, "@!"))));
         A30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_IDRESPONSABLE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")));
         A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPAL_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
         A307Tpal_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpal_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
         cmbAlma_Estado.setValue( httpContext.cgiGet( cmbAlma_Estado.getInternalname()) );
         A673Alma_Estado = httpContext.cgiGet( cmbAlma_Estado.getInternalname()) ;
         n673Alma_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A673Alma_Estado", A673Alma_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ALMA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
         A265Alma_CedulaResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_CedulaResponsable_Internalname), ",", ".") ;
         n265Alma_CedulaResponsable = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A265Alma_CedulaResponsable", GXutil.ltrim( GXutil.str( A265Alma_CedulaResponsable, 18, 0)));
         /* Read saved values. */
         wcpOA28Alma_Codigo = httpContext.cgiGet( sPrefix+"wcpOA28Alma_Codigo") ;
         wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
         wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "ALM_ALMACENGeneral" ;
         A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPAL_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_almacengeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e130N2 ();
      if (returnInSub) return;
   }

   public void e130N2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e140N2( )
   {
      /* Load Routine */
      edtTpal_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A29Tpal_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTpal_Descripcion_Internalname, "Link", edtTpal_Descripcion_Link, true);
      edtCent_Descripcion_Link = formatLink("com.orions2.viewgen_centrocosto") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCent_Descripcion_Internalname, "Link", edtCent_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV16Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ALMACEN" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Alma_Codigo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7Alma_Codigo );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Alma_Modulo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV8Alma_Modulo );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Cent_Id" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV9Cent_Id, 11, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV12Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A28Alma_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
      A27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
      A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
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
      pa0N2( ) ;
      ws0N2( ) ;
      we0N2( ) ;
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
      sCtrlA28Alma_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA27Alma_Modulo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA1Cent_Id = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0N2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_almacengeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0N2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A28Alma_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
         A27Alma_Modulo = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A27Alma_Modulo", A27Alma_Modulo);
         A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      wcpOA28Alma_Codigo = httpContext.cgiGet( sPrefix+"wcpOA28Alma_Codigo") ;
      wcpOA27Alma_Modulo = httpContext.cgiGet( sPrefix+"wcpOA27Alma_Modulo") ;
      wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A28Alma_Codigo, wcpOA28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, wcpOA27Alma_Modulo) != 0 ) || ( A1Cent_Id != wcpOA1Cent_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA28Alma_Codigo = A28Alma_Codigo ;
      wcpOA27Alma_Modulo = A27Alma_Modulo ;
      wcpOA1Cent_Id = A1Cent_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA28Alma_Codigo = httpContext.cgiGet( sPrefix+"A28Alma_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA28Alma_Codigo) > 0 )
      {
         A28Alma_Codigo = httpContext.cgiGet( sCtrlA28Alma_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A28Alma_Codigo", A28Alma_Codigo);
      }
      else
      {
         A28Alma_Codigo = httpContext.cgiGet( sPrefix+"A28Alma_Codigo_PARM") ;
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
      sCtrlA1Cent_Id = httpContext.cgiGet( sPrefix+"A1Cent_Id_CTRL") ;
      if ( GXutil.len( sCtrlA1Cent_Id) > 0 )
      {
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA1Cent_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      else
      {
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A1Cent_Id_PARM"), ",", ".") ;
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
      pa0N2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0N2( ) ;
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
      ws0N2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A28Alma_Codigo_PARM", A28Alma_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA28Alma_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A28Alma_Codigo_CTRL", GXutil.rtrim( sCtrlA28Alma_Codigo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_PARM", A27Alma_Modulo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA27Alma_Modulo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A27Alma_Modulo_CTRL", GXutil.rtrim( sCtrlA27Alma_Modulo));
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A1Cent_Id_PARM", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA1Cent_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A1Cent_Id_CTRL", GXutil.rtrim( sCtrlA1Cent_Id));
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
      we0N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414113959");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_almacengeneral.js", "?201861414113959");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      cmbAlma_Modulo.setInternalname( sPrefix+"ALMA_MODULO" );
      edtAlma_Codigo_Internalname = sPrefix+"ALMA_CODIGO" ;
      edtAlma_Descripcion_Internalname = sPrefix+"ALMA_DESCRIPCION" ;
      edtAlma_Direccion_Internalname = sPrefix+"ALMA_DIRECCION" ;
      edtAlma_Telefono1_Internalname = sPrefix+"ALMA_TELEFONO1" ;
      edtAlma_Telefono2_Internalname = sPrefix+"ALMA_TELEFONO2" ;
      edtAlma_Fax_Internalname = sPrefix+"ALMA_FAX" ;
      edtAlma_CuentaDebito_Internalname = sPrefix+"ALMA_CUENTADEBITO" ;
      edtAlma_CuentaCredito_Internalname = sPrefix+"ALMA_CUENTACREDITO" ;
      edtAlma_NombreResponsable_Internalname = sPrefix+"ALMA_NOMBRERESPONSABLE" ;
      edtAlma_EmailResponsable_Internalname = sPrefix+"ALMA_EMAILRESPONSABLE" ;
      edtAlma_FechaCrea_Internalname = sPrefix+"ALMA_FECHACREA" ;
      edtAlma_UsuarioCrea_Internalname = sPrefix+"ALMA_USUARIOCREA" ;
      edtAlma_FechaModifica_Internalname = sPrefix+"ALMA_FECHAMODIFICA" ;
      edtAlma_UsuarioModifica_Internalname = sPrefix+"ALMA_USUARIOMODIFICA" ;
      edtAlma_IdResponsable_Internalname = sPrefix+"ALMA_IDRESPONSABLE" ;
      edtTpal_Id_Internalname = sPrefix+"TPAL_ID" ;
      edtTpal_Descripcion_Internalname = sPrefix+"TPAL_DESCRIPCION" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
      cmbAlma_Estado.setInternalname( sPrefix+"ALMA_ESTADO" );
      edtAlma_CedulaResponsable_Internalname = sPrefix+"ALMA_CEDULARESPONSABLE" ;
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
      edtAlma_CedulaResponsable_Jsonclick = "" ;
      edtAlma_CedulaResponsable_Enabled = 0 ;
      cmbAlma_Estado.setJsonclick( "" );
      cmbAlma_Estado.setEnabled( 0 );
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Link = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
      edtTpal_Descripcion_Jsonclick = "" ;
      edtTpal_Descripcion_Link = "" ;
      edtTpal_Descripcion_Enabled = 0 ;
      edtTpal_Id_Jsonclick = "" ;
      edtTpal_Id_Enabled = 0 ;
      edtAlma_IdResponsable_Jsonclick = "" ;
      edtAlma_IdResponsable_Enabled = 0 ;
      edtAlma_UsuarioModifica_Jsonclick = "" ;
      edtAlma_UsuarioModifica_Enabled = 0 ;
      edtAlma_FechaModifica_Jsonclick = "" ;
      edtAlma_FechaModifica_Enabled = 0 ;
      edtAlma_UsuarioCrea_Jsonclick = "" ;
      edtAlma_UsuarioCrea_Enabled = 0 ;
      edtAlma_FechaCrea_Jsonclick = "" ;
      edtAlma_FechaCrea_Enabled = 0 ;
      edtAlma_EmailResponsable_Jsonclick = "" ;
      edtAlma_EmailResponsable_Enabled = 0 ;
      edtAlma_NombreResponsable_Jsonclick = "" ;
      edtAlma_NombreResponsable_Enabled = 0 ;
      edtAlma_CuentaCredito_Jsonclick = "" ;
      edtAlma_CuentaCredito_Enabled = 0 ;
      edtAlma_CuentaDebito_Jsonclick = "" ;
      edtAlma_CuentaDebito_Enabled = 0 ;
      edtAlma_Fax_Jsonclick = "" ;
      edtAlma_Fax_Enabled = 0 ;
      edtAlma_Telefono2_Jsonclick = "" ;
      edtAlma_Telefono2_Enabled = 0 ;
      edtAlma_Telefono1_Jsonclick = "" ;
      edtAlma_Telefono1_Enabled = 0 ;
      edtAlma_Direccion_Enabled = 0 ;
      edtAlma_Descripcion_Jsonclick = "" ;
      edtAlma_Descripcion_Enabled = 0 ;
      edtAlma_Codigo_Jsonclick = "" ;
      edtAlma_Codigo_Enabled = 0 ;
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 0 );
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e110N1',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120N1',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''}],oparms:[]}");
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
      wcpOA28Alma_Codigo = "" ;
      wcpOA27Alma_Modulo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A252Alma_Descripcion = "" ;
      A259Alma_Direccion = "" ;
      A263Alma_CuentaDebito = "" ;
      A264Alma_CuentaCredito = "" ;
      A255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A256Alma_UsuarioCrea = "" ;
      A257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A258Alma_UsuarioModifica = "" ;
      A673Alma_Estado = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A3Cent_Codigo = "" ;
      A266Alma_NombreResponsable = "" ;
      A268Alma_EmailResponsable = "" ;
      A307Tpal_Descripcion = "" ;
      A4Cent_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Pgmname = "" ;
      scmdbuf = "" ;
      H000N2_A1Cent_Id = new long[1] ;
      H000N2_A27Alma_Modulo = new String[] {""} ;
      H000N2_A28Alma_Codigo = new String[] {""} ;
      H000N2_A265Alma_CedulaResponsable = new long[1] ;
      H000N2_n265Alma_CedulaResponsable = new boolean[] {false} ;
      H000N2_A673Alma_Estado = new String[] {""} ;
      H000N2_n673Alma_Estado = new boolean[] {false} ;
      H000N2_A4Cent_Descripcion = new String[] {""} ;
      H000N2_A307Tpal_Descripcion = new String[] {""} ;
      H000N2_A29Tpal_Id = new long[1] ;
      H000N2_A30Alma_IdResponsable = new long[1] ;
      H000N2_A258Alma_UsuarioModifica = new String[] {""} ;
      H000N2_n258Alma_UsuarioModifica = new boolean[] {false} ;
      H000N2_A257Alma_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H000N2_n257Alma_FechaModifica = new boolean[] {false} ;
      H000N2_A256Alma_UsuarioCrea = new String[] {""} ;
      H000N2_n256Alma_UsuarioCrea = new boolean[] {false} ;
      H000N2_A255Alma_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H000N2_n255Alma_FechaCrea = new boolean[] {false} ;
      H000N2_A268Alma_EmailResponsable = new String[] {""} ;
      H000N2_n268Alma_EmailResponsable = new boolean[] {false} ;
      H000N2_A266Alma_NombreResponsable = new String[] {""} ;
      H000N2_n266Alma_NombreResponsable = new boolean[] {false} ;
      H000N2_A264Alma_CuentaCredito = new String[] {""} ;
      H000N2_n264Alma_CuentaCredito = new boolean[] {false} ;
      H000N2_A263Alma_CuentaDebito = new String[] {""} ;
      H000N2_n263Alma_CuentaDebito = new boolean[] {false} ;
      H000N2_A262Alma_Fax = new long[1] ;
      H000N2_n262Alma_Fax = new boolean[] {false} ;
      H000N2_A261Alma_Telefono2 = new long[1] ;
      H000N2_n261Alma_Telefono2 = new boolean[] {false} ;
      H000N2_A260Alma_Telefono1 = new long[1] ;
      H000N2_n260Alma_Telefono1 = new boolean[] {false} ;
      H000N2_A259Alma_Direccion = new String[] {""} ;
      H000N2_n259Alma_Direccion = new boolean[] {false} ;
      H000N2_A252Alma_Descripcion = new String[] {""} ;
      H000N2_A3Cent_Codigo = new String[] {""} ;
      H000N3_A4Cent_Descripcion = new String[] {""} ;
      H000N3_A3Cent_Codigo = new String[] {""} ;
      hsh = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7Alma_Codigo = "" ;
      AV8Alma_Modulo = "" ;
      AV12Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA28Alma_Codigo = "" ;
      sCtrlA27Alma_Modulo = "" ;
      sCtrlA1Cent_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_almacengeneral__default(),
         new Object[] {
             new Object[] {
            H000N2_A1Cent_Id, H000N2_A27Alma_Modulo, H000N2_A28Alma_Codigo, H000N2_A265Alma_CedulaResponsable, H000N2_n265Alma_CedulaResponsable, H000N2_A673Alma_Estado, H000N2_n673Alma_Estado, H000N2_A4Cent_Descripcion, H000N2_A307Tpal_Descripcion, H000N2_A29Tpal_Id,
            H000N2_A30Alma_IdResponsable, H000N2_A258Alma_UsuarioModifica, H000N2_n258Alma_UsuarioModifica, H000N2_A257Alma_FechaModifica, H000N2_n257Alma_FechaModifica, H000N2_A256Alma_UsuarioCrea, H000N2_n256Alma_UsuarioCrea, H000N2_A255Alma_FechaCrea, H000N2_n255Alma_FechaCrea, H000N2_A268Alma_EmailResponsable,
            H000N2_n268Alma_EmailResponsable, H000N2_A266Alma_NombreResponsable, H000N2_n266Alma_NombreResponsable, H000N2_A264Alma_CuentaCredito, H000N2_n264Alma_CuentaCredito, H000N2_A263Alma_CuentaDebito, H000N2_n263Alma_CuentaDebito, H000N2_A262Alma_Fax, H000N2_n262Alma_Fax, H000N2_A261Alma_Telefono2,
            H000N2_n261Alma_Telefono2, H000N2_A260Alma_Telefono1, H000N2_n260Alma_Telefono1, H000N2_A259Alma_Direccion, H000N2_n259Alma_Direccion, H000N2_A252Alma_Descripcion, H000N2_A3Cent_Codigo
            }
            , new Object[] {
            H000N3_A4Cent_Descripcion, H000N3_A3Cent_Codigo
            }
         }
      );
      AV16Pgmname = "ALM_ALMACENGeneral" ;
      /* GeneXus formulas. */
      AV16Pgmname = "ALM_ALMACENGeneral" ;
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
   private int edtCent_Codigo_Enabled ;
   private int edtAlma_Codigo_Enabled ;
   private int edtAlma_Descripcion_Enabled ;
   private int edtAlma_Direccion_Enabled ;
   private int edtAlma_Telefono1_Enabled ;
   private int edtAlma_Telefono2_Enabled ;
   private int edtAlma_Fax_Enabled ;
   private int edtAlma_CuentaDebito_Enabled ;
   private int edtAlma_CuentaCredito_Enabled ;
   private int edtAlma_NombreResponsable_Enabled ;
   private int edtAlma_EmailResponsable_Enabled ;
   private int edtAlma_FechaCrea_Enabled ;
   private int edtAlma_UsuarioCrea_Enabled ;
   private int edtAlma_FechaModifica_Enabled ;
   private int edtAlma_UsuarioModifica_Enabled ;
   private int edtAlma_IdResponsable_Enabled ;
   private int edtTpal_Id_Enabled ;
   private int edtTpal_Descripcion_Enabled ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtAlma_CedulaResponsable_Enabled ;
   private int idxLst ;
   private long wcpOA1Cent_Id ;
   private long A1Cent_Id ;
   private long A260Alma_Telefono1 ;
   private long A261Alma_Telefono2 ;
   private long A262Alma_Fax ;
   private long A30Alma_IdResponsable ;
   private long A29Tpal_Id ;
   private long A265Alma_CedulaResponsable ;
   private long AV9Cent_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A673Alma_Estado ;
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
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String edtAlma_Direccion_Internalname ;
   private String edtAlma_Telefono1_Internalname ;
   private String edtAlma_Telefono1_Jsonclick ;
   private String edtAlma_Telefono2_Internalname ;
   private String edtAlma_Telefono2_Jsonclick ;
   private String edtAlma_Fax_Internalname ;
   private String edtAlma_Fax_Jsonclick ;
   private String edtAlma_CuentaDebito_Internalname ;
   private String edtAlma_CuentaDebito_Jsonclick ;
   private String edtAlma_CuentaCredito_Internalname ;
   private String edtAlma_CuentaCredito_Jsonclick ;
   private String edtAlma_NombreResponsable_Internalname ;
   private String edtAlma_NombreResponsable_Jsonclick ;
   private String edtAlma_EmailResponsable_Internalname ;
   private String edtAlma_EmailResponsable_Jsonclick ;
   private String edtAlma_FechaCrea_Internalname ;
   private String edtAlma_FechaCrea_Jsonclick ;
   private String edtAlma_UsuarioCrea_Internalname ;
   private String edtAlma_UsuarioCrea_Jsonclick ;
   private String edtAlma_FechaModifica_Internalname ;
   private String edtAlma_FechaModifica_Jsonclick ;
   private String edtAlma_UsuarioModifica_Internalname ;
   private String edtAlma_UsuarioModifica_Jsonclick ;
   private String edtAlma_IdResponsable_Internalname ;
   private String edtAlma_IdResponsable_Jsonclick ;
   private String edtTpal_Id_Internalname ;
   private String edtTpal_Id_Jsonclick ;
   private String edtTpal_Descripcion_Internalname ;
   private String edtTpal_Descripcion_Link ;
   private String edtTpal_Descripcion_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Link ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtAlma_CedulaResponsable_Internalname ;
   private String edtAlma_CedulaResponsable_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV16Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA28Alma_Codigo ;
   private String sCtrlA27Alma_Modulo ;
   private String sCtrlA1Cent_Id ;
   private java.util.Date A255Alma_FechaCrea ;
   private java.util.Date A257Alma_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n673Alma_Estado ;
   private boolean n265Alma_CedulaResponsable ;
   private boolean n258Alma_UsuarioModifica ;
   private boolean n257Alma_FechaModifica ;
   private boolean n256Alma_UsuarioCrea ;
   private boolean n255Alma_FechaCrea ;
   private boolean n268Alma_EmailResponsable ;
   private boolean n266Alma_NombreResponsable ;
   private boolean n264Alma_CuentaCredito ;
   private boolean n263Alma_CuentaDebito ;
   private boolean n262Alma_Fax ;
   private boolean n261Alma_Telefono2 ;
   private boolean n260Alma_Telefono1 ;
   private boolean n259Alma_Direccion ;
   private boolean returnInSub ;
   private String wcpOA28Alma_Codigo ;
   private String wcpOA27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A259Alma_Direccion ;
   private String A263Alma_CuentaDebito ;
   private String A264Alma_CuentaCredito ;
   private String A256Alma_UsuarioCrea ;
   private String A258Alma_UsuarioModifica ;
   private String A3Cent_Codigo ;
   private String A266Alma_NombreResponsable ;
   private String A268Alma_EmailResponsable ;
   private String A307Tpal_Descripcion ;
   private String A4Cent_Descripcion ;
   private String AV7Alma_Codigo ;
   private String AV8Alma_Modulo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private HTMLChoice cmbAlma_Modulo ;
   private HTMLChoice cmbAlma_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H000N2_A1Cent_Id ;
   private String[] H000N2_A27Alma_Modulo ;
   private String[] H000N2_A28Alma_Codigo ;
   private long[] H000N2_A265Alma_CedulaResponsable ;
   private boolean[] H000N2_n265Alma_CedulaResponsable ;
   private String[] H000N2_A673Alma_Estado ;
   private boolean[] H000N2_n673Alma_Estado ;
   private String[] H000N2_A4Cent_Descripcion ;
   private String[] H000N2_A307Tpal_Descripcion ;
   private long[] H000N2_A29Tpal_Id ;
   private long[] H000N2_A30Alma_IdResponsable ;
   private String[] H000N2_A258Alma_UsuarioModifica ;
   private boolean[] H000N2_n258Alma_UsuarioModifica ;
   private java.util.Date[] H000N2_A257Alma_FechaModifica ;
   private boolean[] H000N2_n257Alma_FechaModifica ;
   private String[] H000N2_A256Alma_UsuarioCrea ;
   private boolean[] H000N2_n256Alma_UsuarioCrea ;
   private java.util.Date[] H000N2_A255Alma_FechaCrea ;
   private boolean[] H000N2_n255Alma_FechaCrea ;
   private String[] H000N2_A268Alma_EmailResponsable ;
   private boolean[] H000N2_n268Alma_EmailResponsable ;
   private String[] H000N2_A266Alma_NombreResponsable ;
   private boolean[] H000N2_n266Alma_NombreResponsable ;
   private String[] H000N2_A264Alma_CuentaCredito ;
   private boolean[] H000N2_n264Alma_CuentaCredito ;
   private String[] H000N2_A263Alma_CuentaDebito ;
   private boolean[] H000N2_n263Alma_CuentaDebito ;
   private long[] H000N2_A262Alma_Fax ;
   private boolean[] H000N2_n262Alma_Fax ;
   private long[] H000N2_A261Alma_Telefono2 ;
   private boolean[] H000N2_n261Alma_Telefono2 ;
   private long[] H000N2_A260Alma_Telefono1 ;
   private boolean[] H000N2_n260Alma_Telefono1 ;
   private String[] H000N2_A259Alma_Direccion ;
   private boolean[] H000N2_n259Alma_Direccion ;
   private String[] H000N2_A252Alma_Descripcion ;
   private String[] H000N2_A3Cent_Codigo ;
   private String[] H000N3_A4Cent_Descripcion ;
   private String[] H000N3_A3Cent_Codigo ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class alm_almacengeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000N2", "SELECT T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo, T3.Cuen_Cedula AS Alma_CedulaResponsable, T1.Alma_Estado, T4.Cent_Descripcion, T2.Tpal_Descripcion, T1.Tpal_Id, T1.Alma_IdResponsable AS Alma_IdResponsable, T1.Alma_UsuarioModifica, T1.Alma_FechaModifica, T1.Alma_UsuarioCrea, T1.Alma_FechaCrea, T3.Cuen_Email AS Alma_EmailResponsable, T3.Cuen_Nombre AS Alma_NombreResponsable, T1.Alma_CuentaCredito, T1.Alma_CuentaDebito, T1.Alma_Fax, T1.Alma_Telefono2, T1.Alma_Telefono1, T1.Alma_Direccion, T1.Alma_Descripcion, T4.Cent_Codigo FROM (((ALM_ALMACEN T1 INNER JOIN ALM_TIPO_ALMACEN T2 ON T2.Tpal_Id = T1.Tpal_Id) INNER JOIN ALM_CUENTADANTE T3 ON T3.Cuen_Identificacion = T1.Alma_IdResponsable) INNER JOIN GEN_CENTROCOSTO T4 ON T4.Cent_Id = T1.Cent_Id) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000N3", "SELECT Cent_Descripcion, Cent_Codigo FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((long[]) buf[31])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[36])[0] = rslt.getVarchar(23) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

