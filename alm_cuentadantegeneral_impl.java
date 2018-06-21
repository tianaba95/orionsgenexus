/*
               File: alm_cuentadantegeneral_impl
        Description: ALM_CUENTADANTEGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:24.58
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

public final  class alm_cuentadantegeneral_impl extends GXWebComponent
{
   public alm_cuentadantegeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cuentadantegeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cuentadantegeneral_impl.class ));
   }

   public alm_cuentadantegeneral_impl( int remoteHandle ,
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
      cmbCuen_Estado = new HTMLChoice();
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
               A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A43Cuen_Identificacion)});
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
         pa1A2( ) ;
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
         httpContext.writeValue( "ALM_CUENTADANTEGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414142465");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cuentadantegeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA43Cuen_Identificacion", GXutil.ltrim( localUtil.ntoc( wcpOA43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIGITOVERIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERNOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDONOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_PRIMERAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_SEGUNDOAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TPTE_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_CLASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_TELEFONO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CUEN_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "ALM_CUENTADANTEGeneral" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9") ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cuentadantegeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm1A2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_cuentadantegeneral.js", "?201861414142470");
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
      return "ALM_CUENTADANTEGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_CUENTADANTEGeneral" ;
   }

   public void wb1A0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_cuentadantegeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111a1_client"+"'", TempTags, "", 2, "HLP_ALM_CUENTADANTEGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121a1_client"+"'", TempTags, "", 2, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Identificacion_Internalname, "Identificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Identificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Identificacion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Identificacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Identificacion_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Cedula_Internalname, "Cedula", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Cedula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_DigitoVerificacion_Internalname, "Dígito Verificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_DigitoVerificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")), ((edtCuen_DigitoVerificacion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")) : localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_DigitoVerificacion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_DigitoVerificacion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerNombre_Internalname, "Nombre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerNombre_Internalname, A331Cuen_PrimerNombre, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerNombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_PrimerNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoNombre_Internalname, "Nombre", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoNombre_Internalname, A332Cuen_SegundoNombre, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoNombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_SegundoNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerApellido_Internalname, "Apellido", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerApellido_Internalname, A329Cuen_PrimerApellido, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerApellido_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_PrimerApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoApellido_Internalname, "Apellido", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoApellido_Internalname, A330Cuen_SegundoApellido, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoApellido_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_SegundoApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Cuentadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCuen_Nombre_Link, "", "", "", edtCuen_Nombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Codigo_Internalname, "Código", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Codigo_Internalname, GXutil.rtrim( A42Tpte_Codigo), GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpte_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Descripcion_Internalname, A321Tpte_Descripcion, GXutil.rtrim( localUtil.format( A321Tpte_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtTpte_Descripcion_Link, "", "", "", edtTpte_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpte_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Clase_Internalname, "Clase", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Clase_Internalname, A328Cuen_Clase, GXutil.rtrim( localUtil.format( A328Cuen_Clase, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Clase_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Clase_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbCuen_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCuen_Estado, cmbCuen_Estado.getInternalname(), GXutil.rtrim( A333Cuen_Estado), 1, cmbCuen_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCuen_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_CUENTADANTEGeneral.htm");
         cmbCuen_Estado.setValue( GXutil.rtrim( A333Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCuen_Estado.getInternalname(), "Values", cmbCuen_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Direccion_Internalname, "Dirección", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCuen_Direccion_Internalname, A334Cuen_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A334Cuen_Direccion), "", (short)(0), 1, edtCuen_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Telefono_Internalname, "Teléfono", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Telefono_Internalname, A335Cuen_Telefono, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Telefono_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Telefono_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Email_Internalname, "Email", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Email_Internalname, A336Cuen_Email, GXutil.rtrim( localUtil.format( A336Cuen_Email, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "mailto:"+A336Cuen_Email, "", "", "", edtCuen_Email_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Descripcion_Internalname, "Descripción Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCiud_Descripcion_Link, "", "", "", edtCiud_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Codigo_Internalname, "Código Departamento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Descripcion_Internalname, "Descripción Departamento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDept_Descripcion_Link, "", "", "", edtDept_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código del Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCent_Descripcion_Link, "", "", "", edtCent_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Id_Internalname, "Identificador Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Código de la Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Descripcion_Internalname, "Descripción Regional", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtRegi_Descripcion_Link, "", "", "", edtRegi_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_UsuarioCrea_Internalname, A337Cuen_UsuarioCrea, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCuen_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_FechaCrea_Internalname, localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCuen_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCuen_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_UsuarioModifica_Internalname, "Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_UsuarioModifica_Internalname, A339Cuen_UsuarioModifica, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CUENTADANTEGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_FechaModifica_Internalname, "Fecha ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCuen_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_FechaModifica_Internalname, localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CUENTADANTEGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCuen_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCuen_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CUENTADANTEGeneral.htm");
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

   public void start1A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_CUENTADANTEGeneral", (short)(0)) ;
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
            strup1A0( ) ;
         }
      }
   }

   public void ws1A2( )
   {
      start1A2( ) ;
      evt1A2( ) ;
   }

   public void evt1A2( )
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
                              strup1A0( ) ;
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
                              strup1A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A0( ) ;
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
                              strup1A0( ) ;
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

   public void we1A2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1A2( ) ;
         }
      }
   }

   public void pa1A2( )
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
         cmbCuen_Estado.setName( "CUEN_ESTADO" );
         cmbCuen_Estado.setWebtags( "" );
         cmbCuen_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Estado.getItemCount() > 0 )
         {
            A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
            n333Cuen_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333Cuen_Estado", A333Cuen_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
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
      if ( cmbCuen_Estado.getItemCount() > 0 )
      {
         A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
         n333Cuen_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333Cuen_Estado", A333Cuen_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1A2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_CUENTADANTEGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf1A2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H001A2 */
         pr_default.execute(0, new Object[] {new Long(A43Cuen_Identificacion)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A340Cuen_FechaModifica = H001A2_A340Cuen_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
            n340Cuen_FechaModifica = H001A2_n340Cuen_FechaModifica[0] ;
            A339Cuen_UsuarioModifica = H001A2_A339Cuen_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
            n339Cuen_UsuarioModifica = H001A2_n339Cuen_UsuarioModifica[0] ;
            A338Cuen_FechaCrea = H001A2_A338Cuen_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
            A337Cuen_UsuarioCrea = H001A2_A337Cuen_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
            A13Regi_Descripcion = H001A2_A13Regi_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A12Regi_Cod = H001A2_A12Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A2Regi_Id = H001A2_A2Regi_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
            A4Cent_Descripcion = H001A2_A4Cent_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
            A3Cent_Codigo = H001A2_A3Cent_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
            A1Cent_Id = H001A2_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
            A10Dept_Descripcion = H001A2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A6Dept_Codigo = H001A2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A7Ciud_Descripcion = H001A2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A5Ciud_Codigo = H001A2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A336Cuen_Email = H001A2_A336Cuen_Email[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336Cuen_Email", A336Cuen_Email);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
            n336Cuen_Email = H001A2_n336Cuen_Email[0] ;
            A335Cuen_Telefono = H001A2_A335Cuen_Telefono[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335Cuen_Telefono", A335Cuen_Telefono);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_TELEFONO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
            n335Cuen_Telefono = H001A2_n335Cuen_Telefono[0] ;
            A334Cuen_Direccion = H001A2_A334Cuen_Direccion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334Cuen_Direccion", A334Cuen_Direccion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
            n334Cuen_Direccion = H001A2_n334Cuen_Direccion[0] ;
            A333Cuen_Estado = H001A2_A333Cuen_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333Cuen_Estado", A333Cuen_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
            n333Cuen_Estado = H001A2_n333Cuen_Estado[0] ;
            A328Cuen_Clase = H001A2_A328Cuen_Clase[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A328Cuen_Clase", A328Cuen_Clase);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_CLASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
            n328Cuen_Clase = H001A2_n328Cuen_Clase[0] ;
            A321Tpte_Descripcion = H001A2_A321Tpte_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
            A42Tpte_Codigo = H001A2_A42Tpte_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A42Tpte_Codigo", A42Tpte_Codigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPTE_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
            A44Cuen_Nombre = H001A2_A44Cuen_Nombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44Cuen_Nombre", A44Cuen_Nombre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
            n44Cuen_Nombre = H001A2_n44Cuen_Nombre[0] ;
            A330Cuen_SegundoApellido = H001A2_A330Cuen_SegundoApellido[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_SEGUNDOAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
            n330Cuen_SegundoApellido = H001A2_n330Cuen_SegundoApellido[0] ;
            A329Cuen_PrimerApellido = H001A2_A329Cuen_PrimerApellido[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_PRIMERAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
            n329Cuen_PrimerApellido = H001A2_n329Cuen_PrimerApellido[0] ;
            A332Cuen_SegundoNombre = H001A2_A332Cuen_SegundoNombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_SEGUNDONOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
            n332Cuen_SegundoNombre = H001A2_n332Cuen_SegundoNombre[0] ;
            A331Cuen_PrimerNombre = H001A2_A331Cuen_PrimerNombre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_PRIMERNOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
            n331Cuen_PrimerNombre = H001A2_n331Cuen_PrimerNombre[0] ;
            A326Cuen_DigitoVerificacion = H001A2_A326Cuen_DigitoVerificacion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_DIGITOVERIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
            n326Cuen_DigitoVerificacion = H001A2_n326Cuen_DigitoVerificacion[0] ;
            A688Cuen_Cedula = H001A2_A688Cuen_Cedula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
            A13Regi_Descripcion = H001A2_A13Regi_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A12Regi_Cod = H001A2_A12Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A5Ciud_Codigo = H001A2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A6Dept_Codigo = H001A2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A7Ciud_Descripcion = H001A2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A10Dept_Descripcion = H001A2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A4Cent_Descripcion = H001A2_A4Cent_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
            A3Cent_Codigo = H001A2_A3Cent_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
            A321Tpte_Descripcion = H001A2_A321Tpte_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
            /* Execute user event: Load */
            e141A2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1A0( ) ;
      }
   }

   public void strup1A0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_CUENTADANTEGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_CEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".")) ;
         n326Cuen_DigitoVerificacion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_DIGITOVERIFICACION", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
         A331Cuen_PrimerNombre = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerNombre_Internalname)) ;
         n331Cuen_PrimerNombre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_PRIMERNOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
         A332Cuen_SegundoNombre = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoNombre_Internalname)) ;
         n332Cuen_SegundoNombre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_SEGUNDONOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
         A329Cuen_PrimerApellido = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerApellido_Internalname)) ;
         n329Cuen_PrimerApellido = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_PRIMERAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
         A330Cuen_SegundoApellido = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoApellido_Internalname)) ;
         n330Cuen_SegundoApellido = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_SEGUNDOAPELLIDO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
         A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
         n44Cuen_Nombre = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44Cuen_Nombre", A44Cuen_Nombre);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
         A42Tpte_Codigo = GXutil.upper( httpContext.cgiGet( edtTpte_Codigo_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A42Tpte_Codigo", A42Tpte_Codigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPTE_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
         A321Tpte_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpte_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         A328Cuen_Clase = httpContext.cgiGet( edtCuen_Clase_Internalname) ;
         n328Cuen_Clase = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A328Cuen_Clase", A328Cuen_Clase);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_CLASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
         cmbCuen_Estado.setValue( httpContext.cgiGet( cmbCuen_Estado.getInternalname()) );
         A333Cuen_Estado = httpContext.cgiGet( cmbCuen_Estado.getInternalname()) ;
         n333Cuen_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A333Cuen_Estado", A333Cuen_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
         A334Cuen_Direccion = httpContext.cgiGet( edtCuen_Direccion_Internalname) ;
         n334Cuen_Direccion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A334Cuen_Direccion", A334Cuen_Direccion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
         A335Cuen_Telefono = httpContext.cgiGet( edtCuen_Telefono_Internalname) ;
         n335Cuen_Telefono = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335Cuen_Telefono", A335Cuen_Telefono);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_TELEFONO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
         A336Cuen_Email = httpContext.cgiGet( edtCuen_Email_Internalname) ;
         n336Cuen_Email = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A336Cuen_Email", A336Cuen_Email);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_EMAIL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A337Cuen_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
         A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
         A339Cuen_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioModifica_Internalname)) ;
         n339Cuen_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
         A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaModifica_Internalname), 0) ;
         n340Cuen_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CUEN_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA43Cuen_Identificacion"), ",", ".") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "ALM_CUENTADANTEGeneral" ;
         A42Tpte_Codigo = httpContext.cgiGet( edtTpte_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A42Tpte_Codigo", A42Tpte_Codigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TPTE_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")) ;
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9") ;
         A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("alm_cuentadantegeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e131A2 ();
      if (returnInSub) return;
   }

   public void e131A2( )
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

   protected void e141A2( )
   {
      /* Load Routine */
      edtCuen_Nombre_Link = formatLink("com.orions2.viewalm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCuen_Nombre_Internalname, "Link", edtCuen_Nombre_Link, true);
      edtTpte_Descripcion_Link = formatLink("com.orions2.viewalm_tipo_tercero") + "?" + GXutil.URLEncode(GXutil.rtrim(A42Tpte_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTpte_Descripcion_Internalname, "Link", edtTpte_Descripcion_Link, true);
      edtCiud_Descripcion_Link = formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_Descripcion_Internalname, "Link", edtCiud_Descripcion_Link, true);
      edtDept_Descripcion_Link = formatLink("com.orions2.viewgen_departamento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A6Dept_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDept_Descripcion_Internalname, "Link", edtDept_Descripcion_Link, true);
      edtCent_Descripcion_Link = formatLink("com.orions2.viewgen_centrocosto") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCent_Descripcion_Internalname, "Link", edtCent_Descripcion_Link, true);
      edtRegi_Descripcion_Link = formatLink("com.orions2.viewgen_regional") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRegi_Descripcion_Internalname, "Link", edtRegi_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_CUENTADANTE" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Cuen_Identificacion" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Cuen_Identificacion, 18, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A43Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
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
      pa1A2( ) ;
      ws1A2( ) ;
      we1A2( ) ;
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
      sCtrlA43Cuen_Identificacion = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1A2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_cuentadantegeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa1A2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A43Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      }
      wcpOA43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA43Cuen_Identificacion"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A43Cuen_Identificacion != wcpOA43Cuen_Identificacion ) ) )
      {
         setjustcreated();
      }
      wcpOA43Cuen_Identificacion = A43Cuen_Identificacion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA43Cuen_Identificacion = httpContext.cgiGet( sPrefix+"A43Cuen_Identificacion_CTRL") ;
      if ( GXutil.len( sCtrlA43Cuen_Identificacion) > 0 )
      {
         A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( sCtrlA43Cuen_Identificacion), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      }
      else
      {
         A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( sPrefix+"A43Cuen_Identificacion_PARM"), ",", ".") ;
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
      pa1A2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1A2( ) ;
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
      ws1A2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A43Cuen_Identificacion_PARM", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA43Cuen_Identificacion)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A43Cuen_Identificacion_CTRL", GXutil.rtrim( sCtrlA43Cuen_Identificacion));
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
      we1A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414142652");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_cuentadantegeneral.js", "?201861414142652");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCuen_Identificacion_Internalname = sPrefix+"CUEN_IDENTIFICACION" ;
      edtCuen_Cedula_Internalname = sPrefix+"CUEN_CEDULA" ;
      edtCuen_DigitoVerificacion_Internalname = sPrefix+"CUEN_DIGITOVERIFICACION" ;
      edtCuen_PrimerNombre_Internalname = sPrefix+"CUEN_PRIMERNOMBRE" ;
      edtCuen_SegundoNombre_Internalname = sPrefix+"CUEN_SEGUNDONOMBRE" ;
      edtCuen_PrimerApellido_Internalname = sPrefix+"CUEN_PRIMERAPELLIDO" ;
      edtCuen_SegundoApellido_Internalname = sPrefix+"CUEN_SEGUNDOAPELLIDO" ;
      edtCuen_Nombre_Internalname = sPrefix+"CUEN_NOMBRE" ;
      edtTpte_Codigo_Internalname = sPrefix+"TPTE_CODIGO" ;
      edtTpte_Descripcion_Internalname = sPrefix+"TPTE_DESCRIPCION" ;
      edtCuen_Clase_Internalname = sPrefix+"CUEN_CLASE" ;
      cmbCuen_Estado.setInternalname( sPrefix+"CUEN_ESTADO" );
      edtCuen_Direccion_Internalname = sPrefix+"CUEN_DIRECCION" ;
      edtCuen_Telefono_Internalname = sPrefix+"CUEN_TELEFONO" ;
      edtCuen_Email_Internalname = sPrefix+"CUEN_EMAIL" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID" ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD" ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION" ;
      edtCuen_UsuarioCrea_Internalname = sPrefix+"CUEN_USUARIOCREA" ;
      edtCuen_FechaCrea_Internalname = sPrefix+"CUEN_FECHACREA" ;
      edtCuen_UsuarioModifica_Internalname = sPrefix+"CUEN_USUARIOMODIFICA" ;
      edtCuen_FechaModifica_Internalname = sPrefix+"CUEN_FECHAMODIFICA" ;
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
      edtCuen_FechaModifica_Jsonclick = "" ;
      edtCuen_FechaModifica_Enabled = 0 ;
      edtCuen_UsuarioModifica_Jsonclick = "" ;
      edtCuen_UsuarioModifica_Enabled = 0 ;
      edtCuen_FechaCrea_Jsonclick = "" ;
      edtCuen_FechaCrea_Enabled = 0 ;
      edtCuen_UsuarioCrea_Jsonclick = "" ;
      edtCuen_UsuarioCrea_Enabled = 0 ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Link = "" ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Link = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Link = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Link = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtCuen_Email_Jsonclick = "" ;
      edtCuen_Email_Enabled = 0 ;
      edtCuen_Telefono_Jsonclick = "" ;
      edtCuen_Telefono_Enabled = 0 ;
      edtCuen_Direccion_Enabled = 0 ;
      cmbCuen_Estado.setJsonclick( "" );
      cmbCuen_Estado.setEnabled( 0 );
      edtCuen_Clase_Jsonclick = "" ;
      edtCuen_Clase_Enabled = 0 ;
      edtTpte_Descripcion_Jsonclick = "" ;
      edtTpte_Descripcion_Link = "" ;
      edtTpte_Descripcion_Enabled = 0 ;
      edtTpte_Codigo_Jsonclick = "" ;
      edtTpte_Codigo_Enabled = 0 ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Link = "" ;
      edtCuen_Nombre_Enabled = 0 ;
      edtCuen_SegundoApellido_Jsonclick = "" ;
      edtCuen_SegundoApellido_Enabled = 0 ;
      edtCuen_PrimerApellido_Jsonclick = "" ;
      edtCuen_PrimerApellido_Enabled = 0 ;
      edtCuen_SegundoNombre_Jsonclick = "" ;
      edtCuen_SegundoNombre_Enabled = 0 ;
      edtCuen_PrimerNombre_Jsonclick = "" ;
      edtCuen_PrimerNombre_Enabled = 0 ;
      edtCuen_DigitoVerificacion_Jsonclick = "" ;
      edtCuen_DigitoVerificacion_Enabled = 0 ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Cedula_Enabled = 0 ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtCuen_Identificacion_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e111A1',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121A1',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A331Cuen_PrimerNombre = "" ;
      A332Cuen_SegundoNombre = "" ;
      A329Cuen_PrimerApellido = "" ;
      A330Cuen_SegundoApellido = "" ;
      A44Cuen_Nombre = "" ;
      A42Tpte_Codigo = "" ;
      A328Cuen_Clase = "" ;
      A333Cuen_Estado = "" ;
      A334Cuen_Direccion = "" ;
      A335Cuen_Telefono = "" ;
      A336Cuen_Email = "" ;
      A337Cuen_UsuarioCrea = "" ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A339Cuen_UsuarioModifica = "" ;
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A321Tpte_Descripcion = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H001A2_A43Cuen_Identificacion = new long[1] ;
      H001A2_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H001A2_n340Cuen_FechaModifica = new boolean[] {false} ;
      H001A2_A339Cuen_UsuarioModifica = new String[] {""} ;
      H001A2_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      H001A2_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H001A2_A337Cuen_UsuarioCrea = new String[] {""} ;
      H001A2_A13Regi_Descripcion = new String[] {""} ;
      H001A2_A12Regi_Cod = new short[1] ;
      H001A2_A2Regi_Id = new long[1] ;
      H001A2_A4Cent_Descripcion = new String[] {""} ;
      H001A2_A3Cent_Codigo = new String[] {""} ;
      H001A2_A1Cent_Id = new long[1] ;
      H001A2_A10Dept_Descripcion = new String[] {""} ;
      H001A2_A6Dept_Codigo = new short[1] ;
      H001A2_A7Ciud_Descripcion = new String[] {""} ;
      H001A2_A5Ciud_Codigo = new short[1] ;
      H001A2_A336Cuen_Email = new String[] {""} ;
      H001A2_n336Cuen_Email = new boolean[] {false} ;
      H001A2_A335Cuen_Telefono = new String[] {""} ;
      H001A2_n335Cuen_Telefono = new boolean[] {false} ;
      H001A2_A334Cuen_Direccion = new String[] {""} ;
      H001A2_n334Cuen_Direccion = new boolean[] {false} ;
      H001A2_A333Cuen_Estado = new String[] {""} ;
      H001A2_n333Cuen_Estado = new boolean[] {false} ;
      H001A2_A328Cuen_Clase = new String[] {""} ;
      H001A2_n328Cuen_Clase = new boolean[] {false} ;
      H001A2_A321Tpte_Descripcion = new String[] {""} ;
      H001A2_A42Tpte_Codigo = new String[] {""} ;
      H001A2_A44Cuen_Nombre = new String[] {""} ;
      H001A2_n44Cuen_Nombre = new boolean[] {false} ;
      H001A2_A330Cuen_SegundoApellido = new String[] {""} ;
      H001A2_n330Cuen_SegundoApellido = new boolean[] {false} ;
      H001A2_A329Cuen_PrimerApellido = new String[] {""} ;
      H001A2_n329Cuen_PrimerApellido = new boolean[] {false} ;
      H001A2_A332Cuen_SegundoNombre = new String[] {""} ;
      H001A2_n332Cuen_SegundoNombre = new boolean[] {false} ;
      H001A2_A331Cuen_PrimerNombre = new String[] {""} ;
      H001A2_n331Cuen_PrimerNombre = new boolean[] {false} ;
      H001A2_A326Cuen_DigitoVerificacion = new byte[1] ;
      H001A2_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      H001A2_A688Cuen_Cedula = new long[1] ;
      hsh = "" ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA43Cuen_Identificacion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cuentadantegeneral__default(),
         new Object[] {
             new Object[] {
            H001A2_A43Cuen_Identificacion, H001A2_A340Cuen_FechaModifica, H001A2_n340Cuen_FechaModifica, H001A2_A339Cuen_UsuarioModifica, H001A2_n339Cuen_UsuarioModifica, H001A2_A338Cuen_FechaCrea, H001A2_A337Cuen_UsuarioCrea, H001A2_A13Regi_Descripcion, H001A2_A12Regi_Cod, H001A2_A2Regi_Id,
            H001A2_A4Cent_Descripcion, H001A2_A3Cent_Codigo, H001A2_A1Cent_Id, H001A2_A10Dept_Descripcion, H001A2_A6Dept_Codigo, H001A2_A7Ciud_Descripcion, H001A2_A5Ciud_Codigo, H001A2_A336Cuen_Email, H001A2_n336Cuen_Email, H001A2_A335Cuen_Telefono,
            H001A2_n335Cuen_Telefono, H001A2_A334Cuen_Direccion, H001A2_n334Cuen_Direccion, H001A2_A333Cuen_Estado, H001A2_n333Cuen_Estado, H001A2_A328Cuen_Clase, H001A2_n328Cuen_Clase, H001A2_A321Tpte_Descripcion, H001A2_A42Tpte_Codigo, H001A2_A44Cuen_Nombre,
            H001A2_n44Cuen_Nombre, H001A2_A330Cuen_SegundoApellido, H001A2_n330Cuen_SegundoApellido, H001A2_A329Cuen_PrimerApellido, H001A2_n329Cuen_PrimerApellido, H001A2_A332Cuen_SegundoNombre, H001A2_n332Cuen_SegundoNombre, H001A2_A331Cuen_PrimerNombre, H001A2_n331Cuen_PrimerNombre, H001A2_A326Cuen_DigitoVerificacion,
            H001A2_n326Cuen_DigitoVerificacion, H001A2_A688Cuen_Cedula
            }
         }
      );
      AV14Pgmname = "ALM_CUENTADANTEGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_CUENTADANTEGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A326Cuen_DigitoVerificacion ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short A12Regi_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtCuen_Identificacion_Enabled ;
   private int edtCuen_Cedula_Enabled ;
   private int edtCuen_DigitoVerificacion_Enabled ;
   private int edtCuen_PrimerNombre_Enabled ;
   private int edtCuen_SegundoNombre_Enabled ;
   private int edtCuen_PrimerApellido_Enabled ;
   private int edtCuen_SegundoApellido_Enabled ;
   private int edtCuen_Nombre_Enabled ;
   private int edtTpte_Codigo_Enabled ;
   private int edtTpte_Descripcion_Enabled ;
   private int edtCuen_Clase_Enabled ;
   private int edtCuen_Direccion_Enabled ;
   private int edtCuen_Telefono_Enabled ;
   private int edtCuen_Email_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtCuen_UsuarioCrea_Enabled ;
   private int edtCuen_FechaCrea_Enabled ;
   private int edtCuen_UsuarioModifica_Enabled ;
   private int edtCuen_FechaModifica_Enabled ;
   private int idxLst ;
   private long wcpOA43Cuen_Identificacion ;
   private long A43Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long AV7Cuen_Identificacion ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A42Tpte_Codigo ;
   private String A333Cuen_Estado ;
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
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_DigitoVerificacion_Internalname ;
   private String edtCuen_DigitoVerificacion_Jsonclick ;
   private String edtCuen_PrimerNombre_Internalname ;
   private String edtCuen_PrimerNombre_Jsonclick ;
   private String edtCuen_SegundoNombre_Internalname ;
   private String edtCuen_SegundoNombre_Jsonclick ;
   private String edtCuen_PrimerApellido_Internalname ;
   private String edtCuen_PrimerApellido_Jsonclick ;
   private String edtCuen_SegundoApellido_Internalname ;
   private String edtCuen_SegundoApellido_Jsonclick ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Link ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtTpte_Codigo_Internalname ;
   private String edtTpte_Codigo_Jsonclick ;
   private String edtTpte_Descripcion_Internalname ;
   private String edtTpte_Descripcion_Link ;
   private String edtTpte_Descripcion_Jsonclick ;
   private String edtCuen_Clase_Internalname ;
   private String edtCuen_Clase_Jsonclick ;
   private String edtCuen_Direccion_Internalname ;
   private String edtCuen_Telefono_Internalname ;
   private String edtCuen_Telefono_Jsonclick ;
   private String edtCuen_Email_Internalname ;
   private String edtCuen_Email_Jsonclick ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Link ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Link ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Link ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Link ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtCuen_UsuarioCrea_Internalname ;
   private String edtCuen_UsuarioCrea_Jsonclick ;
   private String edtCuen_FechaCrea_Internalname ;
   private String edtCuen_FechaCrea_Jsonclick ;
   private String edtCuen_UsuarioModifica_Internalname ;
   private String edtCuen_UsuarioModifica_Jsonclick ;
   private String edtCuen_FechaModifica_Internalname ;
   private String edtCuen_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA43Cuen_Identificacion ;
   private java.util.Date A338Cuen_FechaCrea ;
   private java.util.Date A340Cuen_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n333Cuen_Estado ;
   private boolean n340Cuen_FechaModifica ;
   private boolean n339Cuen_UsuarioModifica ;
   private boolean n336Cuen_Email ;
   private boolean n335Cuen_Telefono ;
   private boolean n334Cuen_Direccion ;
   private boolean n328Cuen_Clase ;
   private boolean n44Cuen_Nombre ;
   private boolean n330Cuen_SegundoApellido ;
   private boolean n329Cuen_PrimerApellido ;
   private boolean n332Cuen_SegundoNombre ;
   private boolean n331Cuen_PrimerNombre ;
   private boolean n326Cuen_DigitoVerificacion ;
   private boolean returnInSub ;
   private String A331Cuen_PrimerNombre ;
   private String A332Cuen_SegundoNombre ;
   private String A329Cuen_PrimerApellido ;
   private String A330Cuen_SegundoApellido ;
   private String A44Cuen_Nombre ;
   private String A328Cuen_Clase ;
   private String A334Cuen_Direccion ;
   private String A335Cuen_Telefono ;
   private String A336Cuen_Email ;
   private String A337Cuen_UsuarioCrea ;
   private String A339Cuen_UsuarioModifica ;
   private String A321Tpte_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbCuen_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H001A2_A43Cuen_Identificacion ;
   private java.util.Date[] H001A2_A340Cuen_FechaModifica ;
   private boolean[] H001A2_n340Cuen_FechaModifica ;
   private String[] H001A2_A339Cuen_UsuarioModifica ;
   private boolean[] H001A2_n339Cuen_UsuarioModifica ;
   private java.util.Date[] H001A2_A338Cuen_FechaCrea ;
   private String[] H001A2_A337Cuen_UsuarioCrea ;
   private String[] H001A2_A13Regi_Descripcion ;
   private short[] H001A2_A12Regi_Cod ;
   private long[] H001A2_A2Regi_Id ;
   private String[] H001A2_A4Cent_Descripcion ;
   private String[] H001A2_A3Cent_Codigo ;
   private long[] H001A2_A1Cent_Id ;
   private String[] H001A2_A10Dept_Descripcion ;
   private short[] H001A2_A6Dept_Codigo ;
   private String[] H001A2_A7Ciud_Descripcion ;
   private short[] H001A2_A5Ciud_Codigo ;
   private String[] H001A2_A336Cuen_Email ;
   private boolean[] H001A2_n336Cuen_Email ;
   private String[] H001A2_A335Cuen_Telefono ;
   private boolean[] H001A2_n335Cuen_Telefono ;
   private String[] H001A2_A334Cuen_Direccion ;
   private boolean[] H001A2_n334Cuen_Direccion ;
   private String[] H001A2_A333Cuen_Estado ;
   private boolean[] H001A2_n333Cuen_Estado ;
   private String[] H001A2_A328Cuen_Clase ;
   private boolean[] H001A2_n328Cuen_Clase ;
   private String[] H001A2_A321Tpte_Descripcion ;
   private String[] H001A2_A42Tpte_Codigo ;
   private String[] H001A2_A44Cuen_Nombre ;
   private boolean[] H001A2_n44Cuen_Nombre ;
   private String[] H001A2_A330Cuen_SegundoApellido ;
   private boolean[] H001A2_n330Cuen_SegundoApellido ;
   private String[] H001A2_A329Cuen_PrimerApellido ;
   private boolean[] H001A2_n329Cuen_PrimerApellido ;
   private String[] H001A2_A332Cuen_SegundoNombre ;
   private boolean[] H001A2_n332Cuen_SegundoNombre ;
   private String[] H001A2_A331Cuen_PrimerNombre ;
   private boolean[] H001A2_n331Cuen_PrimerNombre ;
   private byte[] H001A2_A326Cuen_DigitoVerificacion ;
   private boolean[] H001A2_n326Cuen_DigitoVerificacion ;
   private long[] H001A2_A688Cuen_Cedula ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_cuentadantegeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001A2", "SELECT T1.Cuen_Identificacion, T1.Cuen_FechaModifica, T1.Cuen_UsuarioModifica, T1.Cuen_FechaCrea, T1.Cuen_UsuarioCrea, T2.Regi_Descripcion, T2.Regi_Cod, T1.Regi_Id, T5.Cent_Descripcion, T5.Cent_Codigo, T1.Cent_Id, T4.Dept_Descripcion, T3.Dept_Codigo, T3.Ciud_Descripcion, T2.Ciud_Codigo, T1.Cuen_Email, T1.Cuen_Telefono, T1.Cuen_Direccion, T1.Cuen_Estado, T1.Cuen_Clase, T6.Tpte_Descripcion, T1.Tpte_Codigo, T1.Cuen_Nombre, T1.Cuen_SegundoApellido, T1.Cuen_PrimerApellido, T1.Cuen_SegundoNombre, T1.Cuen_PrimerNombre, T1.Cuen_DigitoVerificacion, T1.Cuen_Cedula FROM (((((ALM_CUENTADANTE T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Cent_Id) INNER JOIN ALM_TIPO_TERCERO T6 ON T6.Tpte_Codigo = T1.Tpte_Codigo) WHERE T1.Cuen_Identificacion = ? ORDER BY T1.Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[8])[0] = rslt.getShort(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(12) ;
               ((short[]) buf[14])[0] = rslt.getShort(13) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(14) ;
               ((short[]) buf[16])[0] = rslt.getShort(15) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[28])[0] = rslt.getString(22, 2) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(28) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(29) ;
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

