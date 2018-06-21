/*
               File: seg_usuariogeneral_impl
        Description: SEG_USUARIOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:17.19
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

public final  class seg_usuariogeneral_impl extends GXWebComponent
{
   public seg_usuariogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_usuariogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_usuariogeneral_impl.class ));
   }

   public seg_usuariogeneral_impl( int remoteHandle ,
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
      cmbUsua_Estado = new HTMLChoice();
      cmbUsua_TipoContrato = new HTMLChoice();
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
               A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A23Usua_Id)});
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
         pa3O2( ) ;
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
         httpContext.writeValue( "SEG_USUARIOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161723");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_usuariogeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A23Usua_Id,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA23Usua_Id", GXutil.ltrim( localUtil.ntoc( wcpOA23Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_USUAPRUEBA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A227usua_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_INDCAMBIOCLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_ADMINISTRADOR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A229Usua_Administrador, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_USUA_CLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm3O2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("seg_usuariogeneral.js", "?201861414161725");
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
      return "SEG_USUARIOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "SEG_USUARIOGeneral" ;
   }

   public void wb3O0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.seg_usuariogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e113o1_client"+"'", TempTags, "", 2, "HLP_SEG_USUARIOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e123o1_client"+"'", TempTags, "", 2, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Id_Internalname, "Id Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Id_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Codigo_Internalname, "Cod Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Codigo_Internalname, A24Usua_Codigo, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Codigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Nombre_Internalname, "Nombre del Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Nombre_Internalname, A25Usua_Nombre, GXutil.rtrim( localUtil.format( A25Usua_Nombre, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtUsua_Nombre_Link, "", "", "", edtUsua_Nombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Email_Internalname, "Email", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Email_Internalname, A219Usua_Email, GXutil.rtrim( localUtil.format( A219Usua_Email, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "mailto:"+A219Usua_Email, "", "", "", edtUsua_Email_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Cedula_Internalname, "Cedula", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Cedula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbUsua_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbUsua_Estado, cmbUsua_Estado.getInternalname(), GXutil.rtrim( A221Usua_Estado), 1, cmbUsua_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbUsua_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_SEG_USUARIOGeneral.htm");
         cmbUsua_Estado.setValue( GXutil.rtrim( A221Usua_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbUsua_Estado.getInternalname(), "Values", cmbUsua_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_UsuAprueba_Internalname, "Usuario que Aprueba", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_UsuAprueba_Internalname, A222Usua_UsuAprueba, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_UsuAprueba_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_UsuAprueba_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbUsua_TipoContrato.getInternalname(), "Tipo Contrato", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbUsua_TipoContrato, cmbUsua_TipoContrato.getInternalname(), GXutil.rtrim( A226Usua_TipoContrato), 1, cmbUsua_TipoContrato.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbUsua_TipoContrato.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_SEG_USUARIOGeneral.htm");
         cmbUsua_TipoContrato.setValue( GXutil.rtrim( A226Usua_TipoContrato) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbUsua_TipoContrato.getInternalname(), "Values", cmbUsua_TipoContrato.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_UsuarioCrea_Internalname, "Usuario Creación ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_UsuarioCrea_Internalname, A223Usua_UsuarioCrea, GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtUsua_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_FechaCrea_Internalname, localUtil.ttoc( A224Usua_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_USUARIOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtUsua_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUsua_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_UsuarioModifica_Internalname, A225Usua_UsuarioModifica, GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtusua_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtusua_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtusua_FechaModifica_Internalname, localUtil.ttoc( A227usua_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A227usua_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtusua_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtusua_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_USUARIOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtusua_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtusua_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_IndCambioClave_Internalname, "Cambio Clave", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_IndCambioClave_Internalname, GXutil.rtrim( A228Usua_IndCambioClave), GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_IndCambioClave_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_IndCambioClave_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Indicador", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Administrador_Internalname, "Administrador", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Administrador_Internalname, GXutil.rtrim( A229Usua_Administrador), GXutil.rtrim( localUtil.format( A229Usua_Administrador, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Administrador_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtUsua_Administrador_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Indicador", "left", true, "HLP_SEG_USUARIOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Clave_Internalname, "Clave del Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Clave_Internalname, A220Usua_Clave, GXutil.rtrim( localUtil.format( A220Usua_Clave, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Clave_Jsonclick, 0, "Attribute", "", "", "", edtUsua_Clave_Visible, edtUsua_Clave_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "Clave", "left", true, "HLP_SEG_USUARIOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start3O2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "SEG_USUARIOGeneral", (short)(0)) ;
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
            strup3O0( ) ;
         }
      }
   }

   public void ws3O2( )
   {
      start3O2( ) ;
      evt3O2( ) ;
   }

   public void evt3O2( )
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
                              strup3O0( ) ;
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
                              strup3O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e133O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e143O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup3O0( ) ;
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
                              strup3O0( ) ;
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

   public void we3O2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm3O2( ) ;
         }
      }
   }

   public void pa3O2( )
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
         cmbUsua_Estado.setName( "USUA_ESTADO" );
         cmbUsua_Estado.setWebtags( "" );
         cmbUsua_Estado.addItem("A", "Activo", (short)(0));
         cmbUsua_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbUsua_Estado.getItemCount() > 0 )
         {
            A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A221Usua_Estado", A221Usua_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
         }
         cmbUsua_TipoContrato.setName( "USUA_TIPOCONTRATO" );
         cmbUsua_TipoContrato.setWebtags( "" );
         cmbUsua_TipoContrato.addItem("P", "Planta", (short)(0));
         cmbUsua_TipoContrato.addItem("C", "Contratista", (short)(0));
         if ( cmbUsua_TipoContrato.getItemCount() > 0 )
         {
            A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
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
      if ( cmbUsua_Estado.getItemCount() > 0 )
      {
         A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A221Usua_Estado", A221Usua_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
      }
      if ( cmbUsua_TipoContrato.getItemCount() > 0 )
      {
         A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3O2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "SEG_USUARIOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf3O2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H003O2 */
         pr_default.execute(0, new Object[] {new Long(A23Usua_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A220Usua_Clave = H003O2_A220Usua_Clave[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A220Usua_Clave", A220Usua_Clave);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
            A229Usua_Administrador = H003O2_A229Usua_Administrador[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A229Usua_Administrador", A229Usua_Administrador);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ADMINISTRADOR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A229Usua_Administrador, ""))));
            A228Usua_IndCambioClave = H003O2_A228Usua_IndCambioClave[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A228Usua_IndCambioClave", A228Usua_IndCambioClave);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_INDCAMBIOCLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, ""))));
            A227usua_FechaModifica = H003O2_A227usua_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A227usua_FechaModifica", localUtil.ttoc( A227usua_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A227usua_FechaModifica, "99/99/99 99:99")));
            A225Usua_UsuarioModifica = H003O2_A225Usua_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A225Usua_UsuarioModifica", A225Usua_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!"))));
            A224Usua_FechaCrea = H003O2_A224Usua_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A224Usua_FechaCrea", localUtil.ttoc( A224Usua_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99")));
            A223Usua_UsuarioCrea = H003O2_A223Usua_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A223Usua_UsuarioCrea", A223Usua_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!"))));
            A226Usua_TipoContrato = H003O2_A226Usua_TipoContrato[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
            A222Usua_UsuAprueba = H003O2_A222Usua_UsuAprueba[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUAPRUEBA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, ""))));
            A221Usua_Estado = H003O2_A221Usua_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A221Usua_Estado", A221Usua_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
            A26Usua_Cedula = H003O2_A26Usua_Cedula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
            A219Usua_Email = H003O2_A219Usua_Email[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A219Usua_Email", A219Usua_Email);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
            A25Usua_Nombre = H003O2_A25Usua_Nombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A25Usua_Nombre", A25Usua_Nombre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
            A24Usua_Codigo = H003O2_A24Usua_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24Usua_Codigo", A24Usua_Codigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
            /* Execute user event: Load */
            e143O2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb3O0( ) ;
      }
   }

   public void strup3O0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "SEG_USUARIOGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e133O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A24Usua_Codigo = GXutil.upper( httpContext.cgiGet( edtUsua_Codigo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A24Usua_Codigo", A24Usua_Codigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         A25Usua_Nombre = httpContext.cgiGet( edtUsua_Nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A25Usua_Nombre", A25Usua_Nombre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
         A219Usua_Email = httpContext.cgiGet( edtUsua_Email_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A219Usua_Email", A219Usua_Email);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
         A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         cmbUsua_Estado.setValue( httpContext.cgiGet( cmbUsua_Estado.getInternalname()) );
         A221Usua_Estado = httpContext.cgiGet( cmbUsua_Estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A221Usua_Estado", A221Usua_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A221Usua_Estado, ""))));
         A222Usua_UsuAprueba = httpContext.cgiGet( edtUsua_UsuAprueba_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUAPRUEBA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, ""))));
         cmbUsua_TipoContrato.setValue( httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) );
         A226Usua_TipoContrato = httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_TIPOCONTRATO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A226Usua_TipoContrato, ""))));
         A223Usua_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtUsua_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A223Usua_UsuarioCrea", A223Usua_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A223Usua_UsuarioCrea, "@!"))));
         A224Usua_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtUsua_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A224Usua_FechaCrea", localUtil.ttoc( A224Usua_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A224Usua_FechaCrea, "99/99/99 99:99")));
         A225Usua_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtUsua_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A225Usua_UsuarioModifica", A225Usua_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A225Usua_UsuarioModifica, "@!"))));
         A227usua_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtusua_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A227usua_FechaModifica", localUtil.ttoc( A227usua_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A227usua_FechaModifica, "99/99/99 99:99")));
         A228Usua_IndCambioClave = httpContext.cgiGet( edtUsua_IndCambioClave_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A228Usua_IndCambioClave", A228Usua_IndCambioClave);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_INDCAMBIOCLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A228Usua_IndCambioClave, ""))));
         A229Usua_Administrador = httpContext.cgiGet( edtUsua_Administrador_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A229Usua_Administrador", A229Usua_Administrador);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_ADMINISTRADOR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A229Usua_Administrador, ""))));
         A220Usua_Clave = httpContext.cgiGet( edtUsua_Clave_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A220Usua_Clave", A220Usua_Clave);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_USUA_CLAVE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         /* Read saved values. */
         wcpOA23Usua_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA23Usua_Id"), ",", ".") ;
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
      e133O2 ();
      if (returnInSub) return;
   }

   public void e133O2( )
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

   protected void e143O2( )
   {
      /* Load Routine */
      edtUsua_Nombre_Link = formatLink("com.orions2.viewseg_usuariorol") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A23Usua_Id,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtUsua_Nombre_Internalname, "Link", edtUsua_Nombre_Link, true);
      edtUsua_Clave_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtUsua_Clave_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtUsua_Clave_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "SEG_USUARIO" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Usua_Id" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Usua_Id, 18, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A23Usua_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
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
      pa3O2( ) ;
      ws3O2( ) ;
      we3O2( ) ;
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
      sCtrlA23Usua_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa3O2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "seg_usuariogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa3O2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A23Usua_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      wcpOA23Usua_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA23Usua_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A23Usua_Id != wcpOA23Usua_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA23Usua_Id = A23Usua_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA23Usua_Id = httpContext.cgiGet( sPrefix+"A23Usua_Id_CTRL") ;
      if ( GXutil.len( sCtrlA23Usua_Id) > 0 )
      {
         A23Usua_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA23Usua_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      else
      {
         A23Usua_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A23Usua_Id_PARM"), ",", ".") ;
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
      pa3O2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws3O2( ) ;
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
      ws3O2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A23Usua_Id_PARM", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA23Usua_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A23Usua_Id_CTRL", GXutil.rtrim( sCtrlA23Usua_Id));
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
      we3O2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161799");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("seg_usuariogeneral.js", "?201861414161799");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtUsua_Id_Internalname = sPrefix+"USUA_ID" ;
      edtUsua_Codigo_Internalname = sPrefix+"USUA_CODIGO" ;
      edtUsua_Nombre_Internalname = sPrefix+"USUA_NOMBRE" ;
      edtUsua_Email_Internalname = sPrefix+"USUA_EMAIL" ;
      edtUsua_Cedula_Internalname = sPrefix+"USUA_CEDULA" ;
      cmbUsua_Estado.setInternalname( sPrefix+"USUA_ESTADO" );
      edtUsua_UsuAprueba_Internalname = sPrefix+"USUA_USUAPRUEBA" ;
      cmbUsua_TipoContrato.setInternalname( sPrefix+"USUA_TIPOCONTRATO" );
      edtUsua_UsuarioCrea_Internalname = sPrefix+"USUA_USUARIOCREA" ;
      edtUsua_FechaCrea_Internalname = sPrefix+"USUA_FECHACREA" ;
      edtUsua_UsuarioModifica_Internalname = sPrefix+"USUA_USUARIOMODIFICA" ;
      edtusua_FechaModifica_Internalname = sPrefix+"USUA_FECHAMODIFICA" ;
      edtUsua_IndCambioClave_Internalname = sPrefix+"USUA_INDCAMBIOCLAVE" ;
      edtUsua_Administrador_Internalname = sPrefix+"USUA_ADMINISTRADOR" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtUsua_Clave_Internalname = sPrefix+"USUA_CLAVE" ;
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
      edtUsua_Clave_Jsonclick = "" ;
      edtUsua_Clave_Enabled = 0 ;
      edtUsua_Clave_Visible = 1 ;
      edtUsua_Administrador_Jsonclick = "" ;
      edtUsua_Administrador_Enabled = 0 ;
      edtUsua_IndCambioClave_Jsonclick = "" ;
      edtUsua_IndCambioClave_Enabled = 0 ;
      edtusua_FechaModifica_Jsonclick = "" ;
      edtusua_FechaModifica_Enabled = 0 ;
      edtUsua_UsuarioModifica_Jsonclick = "" ;
      edtUsua_UsuarioModifica_Enabled = 0 ;
      edtUsua_FechaCrea_Jsonclick = "" ;
      edtUsua_FechaCrea_Enabled = 0 ;
      edtUsua_UsuarioCrea_Jsonclick = "" ;
      edtUsua_UsuarioCrea_Enabled = 0 ;
      cmbUsua_TipoContrato.setJsonclick( "" );
      cmbUsua_TipoContrato.setEnabled( 0 );
      edtUsua_UsuAprueba_Jsonclick = "" ;
      edtUsua_UsuAprueba_Enabled = 0 ;
      cmbUsua_Estado.setJsonclick( "" );
      cmbUsua_Estado.setEnabled( 0 );
      edtUsua_Cedula_Jsonclick = "" ;
      edtUsua_Cedula_Enabled = 0 ;
      edtUsua_Email_Jsonclick = "" ;
      edtUsua_Email_Enabled = 0 ;
      edtUsua_Nombre_Jsonclick = "" ;
      edtUsua_Nombre_Link = "" ;
      edtUsua_Nombre_Enabled = 0 ;
      edtUsua_Codigo_Jsonclick = "" ;
      edtUsua_Codigo_Enabled = 0 ;
      edtUsua_Id_Jsonclick = "" ;
      edtUsua_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e113O1',iparms:[{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e123O1',iparms:[{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      A221Usua_Estado = "" ;
      A222Usua_UsuAprueba = "" ;
      A226Usua_TipoContrato = "" ;
      A223Usua_UsuarioCrea = "" ;
      A224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A225Usua_UsuarioModifica = "" ;
      A227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A228Usua_IndCambioClave = "" ;
      A229Usua_Administrador = "" ;
      A220Usua_Clave = "" ;
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
      H003O2_A23Usua_Id = new long[1] ;
      H003O2_A220Usua_Clave = new String[] {""} ;
      H003O2_A229Usua_Administrador = new String[] {""} ;
      H003O2_A228Usua_IndCambioClave = new String[] {""} ;
      H003O2_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003O2_A225Usua_UsuarioModifica = new String[] {""} ;
      H003O2_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003O2_A223Usua_UsuarioCrea = new String[] {""} ;
      H003O2_A226Usua_TipoContrato = new String[] {""} ;
      H003O2_A222Usua_UsuAprueba = new String[] {""} ;
      H003O2_A221Usua_Estado = new String[] {""} ;
      H003O2_A26Usua_Cedula = new long[1] ;
      H003O2_A219Usua_Email = new String[] {""} ;
      H003O2_A25Usua_Nombre = new String[] {""} ;
      H003O2_A24Usua_Codigo = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA23Usua_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_usuariogeneral__default(),
         new Object[] {
             new Object[] {
            H003O2_A23Usua_Id, H003O2_A220Usua_Clave, H003O2_A229Usua_Administrador, H003O2_A228Usua_IndCambioClave, H003O2_A227usua_FechaModifica, H003O2_A225Usua_UsuarioModifica, H003O2_A224Usua_FechaCrea, H003O2_A223Usua_UsuarioCrea, H003O2_A226Usua_TipoContrato, H003O2_A222Usua_UsuAprueba,
            H003O2_A221Usua_Estado, H003O2_A26Usua_Cedula, H003O2_A219Usua_Email, H003O2_A25Usua_Nombre, H003O2_A24Usua_Codigo
            }
         }
      );
      AV14Pgmname = "SEG_USUARIOGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "SEG_USUARIOGeneral" ;
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
   private int edtUsua_Id_Enabled ;
   private int edtUsua_Codigo_Enabled ;
   private int edtUsua_Nombre_Enabled ;
   private int edtUsua_Email_Enabled ;
   private int edtUsua_Cedula_Enabled ;
   private int edtUsua_UsuAprueba_Enabled ;
   private int edtUsua_UsuarioCrea_Enabled ;
   private int edtUsua_FechaCrea_Enabled ;
   private int edtUsua_UsuarioModifica_Enabled ;
   private int edtusua_FechaModifica_Enabled ;
   private int edtUsua_IndCambioClave_Enabled ;
   private int edtUsua_Administrador_Enabled ;
   private int edtUsua_Clave_Visible ;
   private int edtUsua_Clave_Enabled ;
   private int idxLst ;
   private long wcpOA23Usua_Id ;
   private long A23Usua_Id ;
   private long A26Usua_Cedula ;
   private long AV7Usua_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A221Usua_Estado ;
   private String A226Usua_TipoContrato ;
   private String A228Usua_IndCambioClave ;
   private String A229Usua_Administrador ;
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
   private String edtUsua_Id_Internalname ;
   private String edtUsua_Id_Jsonclick ;
   private String edtUsua_Codigo_Internalname ;
   private String edtUsua_Codigo_Jsonclick ;
   private String edtUsua_Nombre_Internalname ;
   private String edtUsua_Nombre_Link ;
   private String edtUsua_Nombre_Jsonclick ;
   private String edtUsua_Email_Internalname ;
   private String edtUsua_Email_Jsonclick ;
   private String edtUsua_Cedula_Internalname ;
   private String edtUsua_Cedula_Jsonclick ;
   private String edtUsua_UsuAprueba_Internalname ;
   private String edtUsua_UsuAprueba_Jsonclick ;
   private String edtUsua_UsuarioCrea_Internalname ;
   private String edtUsua_UsuarioCrea_Jsonclick ;
   private String edtUsua_FechaCrea_Internalname ;
   private String edtUsua_FechaCrea_Jsonclick ;
   private String edtUsua_UsuarioModifica_Internalname ;
   private String edtUsua_UsuarioModifica_Jsonclick ;
   private String edtusua_FechaModifica_Internalname ;
   private String edtusua_FechaModifica_Jsonclick ;
   private String edtUsua_IndCambioClave_Internalname ;
   private String edtUsua_IndCambioClave_Jsonclick ;
   private String edtUsua_Administrador_Internalname ;
   private String edtUsua_Administrador_Jsonclick ;
   private String edtUsua_Clave_Internalname ;
   private String edtUsua_Clave_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA23Usua_Id ;
   private java.util.Date A224Usua_FechaCrea ;
   private java.util.Date A227usua_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A222Usua_UsuAprueba ;
   private String A223Usua_UsuarioCrea ;
   private String A225Usua_UsuarioModifica ;
   private String A220Usua_Clave ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbUsua_Estado ;
   private HTMLChoice cmbUsua_TipoContrato ;
   private IDataStoreProvider pr_default ;
   private long[] H003O2_A23Usua_Id ;
   private String[] H003O2_A220Usua_Clave ;
   private String[] H003O2_A229Usua_Administrador ;
   private String[] H003O2_A228Usua_IndCambioClave ;
   private java.util.Date[] H003O2_A227usua_FechaModifica ;
   private String[] H003O2_A225Usua_UsuarioModifica ;
   private java.util.Date[] H003O2_A224Usua_FechaCrea ;
   private String[] H003O2_A223Usua_UsuarioCrea ;
   private String[] H003O2_A226Usua_TipoContrato ;
   private String[] H003O2_A222Usua_UsuAprueba ;
   private String[] H003O2_A221Usua_Estado ;
   private long[] H003O2_A26Usua_Cedula ;
   private String[] H003O2_A219Usua_Email ;
   private String[] H003O2_A25Usua_Nombre ;
   private String[] H003O2_A24Usua_Codigo ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class seg_usuariogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003O2", "SELECT Usua_Id, Usua_Clave, Usua_Administrador, Usua_IndCambioClave, usua_FechaModifica, Usua_UsuarioModifica, Usua_FechaCrea, Usua_UsuarioCrea, Usua_TipoContrato, Usua_UsuAprueba, Usua_Estado, Usua_Cedula, Usua_Email, Usua_Nombre, Usua_Codigo FROM SEG_USUARIO WHERE Usua_Id = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getString(11, 1) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

