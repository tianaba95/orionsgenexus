/*
               File: gen_ciudadgeneral_impl
        Description: GEN_CIUDADGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:41.69
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

public final  class gen_ciudadgeneral_impl extends GXWebComponent
{
   public gen_ciudadgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_ciudadgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_ciudadgeneral_impl.class ));
   }

   public gen_ciudadgeneral_impl( int remoteHandle ,
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
               A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Short(A5Ciud_Codigo)});
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
         pa2G2( ) ;
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
         httpContext.writeValue( "GEN_CIUDADGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414154172");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_ciudadgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A5Ciud_Codigo,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA5Ciud_Codigo", GXutil.ltrim( localUtil.ntoc( wcpOA5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEPT_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A128Ciud_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A129Ciud_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CIUD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A130Ciud_FechaModifica, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "GEN_CIUDADGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_ciudadgeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm2G2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("gen_ciudadgeneral.js", "?201861414154173");
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
      return "GEN_CIUDADGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "GEN_CIUDADGeneral" ;
   }

   public void wb2G0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.gen_ciudadgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112g1_client"+"'", TempTags, "", 2, "HLP_GEN_CIUDADGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e122g1_client"+"'", TempTags, "", 2, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDept_Descripcion_Link, "", "", "", edtDept_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Codigo_Internalname, "Código del País", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPais_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Descripcion_Internalname, "Descripción del País", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPais_Descripcion_Link, "", "", "", edtPais_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_UsuarioCrea_Internalname, "Usuario Creación Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_UsuarioCrea_Internalname, A127Ciud_UsuarioCrea, GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_FechaCrea_Internalname, "Fecha Creación Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCiud_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_FechaCrea_Internalname, localUtil.ttoc( A128Ciud_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A128Ciud_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_CIUDADGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCiud_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCiud_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_CIUDADGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_UsuarioModifica_Internalname, "Usuario Modifica Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_UsuarioModifica_Internalname, A129Ciud_UsuarioModifica, GXutil.rtrim( localUtil.format( A129Ciud_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", edtCiud_UsuarioModifica_Visible, edtCiud_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_CIUDADGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_FechaModifica_Internalname, "Fecha Modifica Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCiud_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_FechaModifica_Internalname, localUtil.ttoc( A130Ciud_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A130Ciud_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", edtCiud_FechaModifica_Visible, edtCiud_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_CIUDADGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCiud_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtCiud_FechaModifica_Visible==0)||(edtCiud_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_CIUDADGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "GEN_CIUDADGeneral", (short)(0)) ;
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
            strup2G0( ) ;
         }
      }
   }

   public void ws2G2( )
   {
      start2G2( ) ;
      evt2G2( ) ;
   }

   public void evt2G2( )
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
                              strup2G0( ) ;
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
                              strup2G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e132G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2G0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e142G2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2G0( ) ;
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
                              strup2G0( ) ;
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

   public void we2G2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2G2( ) ;
         }
      }
   }

   public void pa2G2( )
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2G2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "GEN_CIUDADGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf2G2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H002G2 */
         pr_default.execute(0, new Object[] {new Short(A5Ciud_Codigo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130Ciud_FechaModifica = H002G2_A130Ciud_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130Ciud_FechaModifica", localUtil.ttoc( A130Ciud_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A130Ciud_FechaModifica, "99/99/99 99:99")));
            A129Ciud_UsuarioModifica = H002G2_A129Ciud_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129Ciud_UsuarioModifica", A129Ciud_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A129Ciud_UsuarioModifica, "@!"))));
            A128Ciud_FechaCrea = H002G2_A128Ciud_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A128Ciud_FechaCrea", localUtil.ttoc( A128Ciud_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A128Ciud_FechaCrea, "99/99/99 99:99")));
            A127Ciud_UsuarioCrea = H002G2_A127Ciud_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A127Ciud_UsuarioCrea", A127Ciud_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!"))));
            A11Pais_Descripcion = H002G2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            A9Pais_Codigo = H002G2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A10Dept_Descripcion = H002G2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A6Dept_Codigo = H002G2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DEPT_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
            A7Ciud_Descripcion = H002G2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
            A9Pais_Codigo = H002G2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A10Dept_Descripcion = H002G2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A11Pais_Descripcion = H002G2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            /* Execute user event: Load */
            e142G2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb2G0( ) ;
      }
   }

   public void strup2G0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "GEN_CIUDADGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
         A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DEPT_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
         A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
         A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A127Ciud_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCiud_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A127Ciud_UsuarioCrea", A127Ciud_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!"))));
         A128Ciud_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCiud_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A128Ciud_FechaCrea", localUtil.ttoc( A128Ciud_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A128Ciud_FechaCrea, "99/99/99 99:99")));
         A129Ciud_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCiud_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129Ciud_UsuarioModifica", A129Ciud_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A129Ciud_UsuarioModifica, "@!"))));
         A130Ciud_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCiud_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130Ciud_FechaModifica", localUtil.ttoc( A130Ciud_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CIUD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A130Ciud_FechaModifica, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA5Ciud_Codigo"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "GEN_CIUDADGeneral" ;
         A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_DEPT_CODIGO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("gen_ciudadgeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e132G2 ();
      if (returnInSub) return;
   }

   public void e132G2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e142G2( )
   {
      /* Load Routine */
      edtDept_Descripcion_Link = formatLink("com.orions2.viewgen_departamento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A6Dept_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDept_Descripcion_Internalname, "Link", edtDept_Descripcion_Link, true);
      edtPais_Descripcion_Link = formatLink("com.orions2.viewgen_pais") + "?" + GXutil.URLEncode(GXutil.rtrim(A9Pais_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPais_Descripcion_Internalname, "Link", edtPais_Descripcion_Link, true);
      edtCiud_UsuarioModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_UsuarioModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCiud_UsuarioModifica_Visible, 5, 0)), true);
      edtCiud_FechaModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_FechaModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCiud_FechaModifica_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "GEN_CIUDAD" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Ciud_Codigo" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV5Ciud_Codigo, 4, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A5Ciud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
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
      pa2G2( ) ;
      ws2G2( ) ;
      we2G2( ) ;
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
      sCtrlA5Ciud_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2G2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gen_ciudadgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa2G2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A5Ciud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      }
      wcpOA5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA5Ciud_Codigo"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A5Ciud_Codigo != wcpOA5Ciud_Codigo ) ) )
      {
         setjustcreated();
      }
      wcpOA5Ciud_Codigo = A5Ciud_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA5Ciud_Codigo = httpContext.cgiGet( sPrefix+"A5Ciud_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA5Ciud_Codigo) > 0 )
      {
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlA5Ciud_Codigo), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      }
      else
      {
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A5Ciud_Codigo_PARM"), ",", ".")) ;
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
      pa2G2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2G2( ) ;
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
      ws2G2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A5Ciud_Codigo_PARM", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA5Ciud_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A5Ciud_Codigo_CTRL", GXutil.rtrim( sCtrlA5Ciud_Codigo));
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
      we2G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414154224");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("gen_ciudadgeneral.js", "?201861414154224");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION" ;
      edtPais_Codigo_Internalname = sPrefix+"PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = sPrefix+"PAIS_DESCRIPCION" ;
      edtCiud_UsuarioCrea_Internalname = sPrefix+"CIUD_USUARIOCREA" ;
      edtCiud_FechaCrea_Internalname = sPrefix+"CIUD_FECHACREA" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtCiud_UsuarioModifica_Internalname = sPrefix+"CIUD_USUARIOMODIFICA" ;
      edtCiud_FechaModifica_Internalname = sPrefix+"CIUD_FECHAMODIFICA" ;
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
      edtCiud_FechaModifica_Jsonclick = "" ;
      edtCiud_FechaModifica_Enabled = 0 ;
      edtCiud_FechaModifica_Visible = 1 ;
      edtCiud_UsuarioModifica_Jsonclick = "" ;
      edtCiud_UsuarioModifica_Enabled = 0 ;
      edtCiud_UsuarioModifica_Visible = 1 ;
      edtCiud_FechaCrea_Jsonclick = "" ;
      edtCiud_FechaCrea_Enabled = 0 ;
      edtCiud_UsuarioCrea_Jsonclick = "" ;
      edtCiud_UsuarioCrea_Enabled = 0 ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Descripcion_Link = "" ;
      edtPais_Descripcion_Enabled = 0 ;
      edtPais_Codigo_Jsonclick = "" ;
      edtPais_Codigo_Enabled = 0 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Link = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e112G1',iparms:[{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e122G1',iparms:[{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',nv:0}],oparms:[]}");
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
      A7Ciud_Descripcion = "" ;
      A127Ciud_UsuarioCrea = "" ;
      A128Ciud_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A129Ciud_UsuarioModifica = "" ;
      A130Ciud_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A10Dept_Descripcion = "" ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H002G2_A5Ciud_Codigo = new short[1] ;
      H002G2_A130Ciud_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H002G2_A129Ciud_UsuarioModifica = new String[] {""} ;
      H002G2_A128Ciud_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H002G2_A127Ciud_UsuarioCrea = new String[] {""} ;
      H002G2_A11Pais_Descripcion = new String[] {""} ;
      H002G2_A9Pais_Codigo = new String[] {""} ;
      H002G2_A10Dept_Descripcion = new String[] {""} ;
      H002G2_A6Dept_Codigo = new short[1] ;
      H002G2_A7Ciud_Descripcion = new String[] {""} ;
      hsh = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA5Ciud_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_ciudadgeneral__default(),
         new Object[] {
             new Object[] {
            H002G2_A5Ciud_Codigo, H002G2_A130Ciud_FechaModifica, H002G2_A129Ciud_UsuarioModifica, H002G2_A128Ciud_FechaCrea, H002G2_A127Ciud_UsuarioCrea, H002G2_A11Pais_Descripcion, H002G2_A9Pais_Codigo, H002G2_A10Dept_Descripcion, H002G2_A6Dept_Codigo, H002G2_A7Ciud_Descripcion
            }
         }
      );
      AV15Pgmname = "GEN_CIUDADGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "GEN_CIUDADGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOA5Ciud_Codigo ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV5Ciud_Codigo ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int edtPais_Descripcion_Enabled ;
   private int edtCiud_UsuarioCrea_Enabled ;
   private int edtCiud_FechaCrea_Enabled ;
   private int edtCiud_UsuarioModifica_Visible ;
   private int edtCiud_UsuarioModifica_Enabled ;
   private int edtCiud_FechaModifica_Visible ;
   private int edtCiud_FechaModifica_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Link ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Link ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtCiud_UsuarioCrea_Internalname ;
   private String edtCiud_UsuarioCrea_Jsonclick ;
   private String edtCiud_FechaCrea_Internalname ;
   private String edtCiud_FechaCrea_Jsonclick ;
   private String edtCiud_UsuarioModifica_Internalname ;
   private String edtCiud_UsuarioModifica_Jsonclick ;
   private String edtCiud_FechaModifica_Internalname ;
   private String edtCiud_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA5Ciud_Codigo ;
   private java.util.Date A128Ciud_FechaCrea ;
   private java.util.Date A130Ciud_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String A7Ciud_Descripcion ;
   private String A127Ciud_UsuarioCrea ;
   private String A129Ciud_UsuarioModifica ;
   private String A10Dept_Descripcion ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private short[] H002G2_A5Ciud_Codigo ;
   private java.util.Date[] H002G2_A130Ciud_FechaModifica ;
   private String[] H002G2_A129Ciud_UsuarioModifica ;
   private java.util.Date[] H002G2_A128Ciud_FechaCrea ;
   private String[] H002G2_A127Ciud_UsuarioCrea ;
   private String[] H002G2_A11Pais_Descripcion ;
   private String[] H002G2_A9Pais_Codigo ;
   private String[] H002G2_A10Dept_Descripcion ;
   private short[] H002G2_A6Dept_Codigo ;
   private String[] H002G2_A7Ciud_Descripcion ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class gen_ciudadgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002G2", "SELECT T1.Ciud_Codigo, T1.Ciud_FechaModifica, T1.Ciud_UsuarioModifica, T1.Ciud_FechaCrea, T1.Ciud_UsuarioCrea, T3.Pais_Descripcion, T2.Pais_Codigo, T2.Dept_Descripcion, T1.Dept_Codigo, T1.Ciud_Descripcion FROM ((GEN_CIUDAD T1 INNER JOIN GEN_DEPARTAMENTO T2 ON T2.Dept_Codigo = T1.Dept_Codigo) INNER JOIN GEN_PAIS T3 ON T3.Pais_Codigo = T2.Pais_Codigo) WHERE T1.Ciud_Codigo = ? ORDER BY T1.Ciud_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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

