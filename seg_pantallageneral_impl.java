/*
               File: seg_pantallageneral_impl
        Description: PANTALLA General
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:0.66
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

public final  class seg_pantallageneral_impl extends GXWebComponent
{
   public seg_pantallageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_pantallageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_pantallageneral_impl.class ));
   }

   public seg_pantallageneral_impl( int remoteHandle ,
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
               A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Integer(A18Pant_Id)});
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
         pa312( ) ;
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
         httpContext.writeValue( "PANTALLA General") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416069");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_pantallageneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A18Pant_Id,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA18Pant_Id", GXutil.ltrim( localUtil.ntoc( wcpOA18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MODU_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A199Pant_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A200Pant_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A203Pant_NombreInterno, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_ORDEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A201Pant_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PANT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A202Pant_FechaModifica, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "SEG_PANTALLAGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_pantallageneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm312( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("seg_pantallageneral.js", "?20186141416070");
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
      return "SEG_PANTALLAGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "PANTALLA General" ;
   }

   public void wb310( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.seg_pantallageneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11311_client"+"'", TempTags, "", 2, "HLP_SEG_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12311_client"+"'", TempTags, "", 2, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Id_Internalname, "Identificador Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")), ((edtPant_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_Id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Descripcion_Internalname, "Descripción Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Descripcion_Internalname, A19Pant_Descripcion, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Id_Internalname, "Identificador Módulo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")), ((edtModu_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtModu_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Descripcion_Internalname, "Descripción Módulo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Descripcion_Internalname, A17Modu_Descripcion, GXutil.rtrim( localUtil.format( A17Modu_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtModu_Descripcion_Link, "", "", "", edtModu_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtModu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_UsuarioCrea_Internalname, "Usuario Creación Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_UsuarioCrea_Internalname, A199Pant_UsuarioCrea, GXutil.rtrim( localUtil.format( A199Pant_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_FechaCrea_Internalname, "Fecha Creación Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPant_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_FechaCrea_Internalname, localUtil.ttoc( A200Pant_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A200Pant_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtPant_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPant_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_NombreInterno_Internalname, "Nombre Interno", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_NombreInterno_Internalname, GXutil.rtrim( A203Pant_NombreInterno), GXutil.rtrim( localUtil.format( A203Pant_NombreInterno, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_NombreInterno_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_NombreInterno_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Orden_Internalname, "pantalla menu", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Orden_Internalname, GXutil.ltrim( localUtil.ntoc( A697Pant_Orden, (byte)(4), (byte)(0), ",", "")), ((edtPant_Orden_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Orden_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_Orden_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_UsuarioModifica_Internalname, "Usuario Modifica Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_UsuarioModifica_Internalname, A201Pant_UsuarioModifica, GXutil.rtrim( localUtil.format( A201Pant_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", edtPant_UsuarioModifica_Visible, edtPant_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_FechaModifica_Internalname, "Fecha Modifica Pantalla", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPant_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_FechaModifica_Internalname, localUtil.ttoc( A202Pant_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A202Pant_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", edtPant_FechaModifica_Visible, edtPant_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtPant_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtPant_FechaModifica_Visible==0)||(edtPant_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_PANTALLAGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start312( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "PANTALLA General", (short)(0)) ;
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
            strup310( ) ;
         }
      }
   }

   public void ws312( )
   {
      start312( ) ;
      evt312( ) ;
   }

   public void evt312( )
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
                              strup310( ) ;
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
                              strup310( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13312 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup310( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14312 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup310( ) ;
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
                              strup310( ) ;
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

   public void we312( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm312( ) ;
         }
      }
   }

   public void pa312( )
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
      rf312( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "SEG_PANTALLAGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf312( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00312 */
         pr_default.execute(0, new Object[] {new Integer(A18Pant_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A202Pant_FechaModifica = H00312_A202Pant_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A202Pant_FechaModifica", localUtil.ttoc( A202Pant_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A202Pant_FechaModifica, "99/99/99 99:99")));
            n202Pant_FechaModifica = H00312_n202Pant_FechaModifica[0] ;
            A201Pant_UsuarioModifica = H00312_A201Pant_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A201Pant_UsuarioModifica", A201Pant_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A201Pant_UsuarioModifica, "@!"))));
            n201Pant_UsuarioModifica = H00312_n201Pant_UsuarioModifica[0] ;
            A697Pant_Orden = H00312_A697Pant_Orden[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_ORDEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")));
            A203Pant_NombreInterno = H00312_A203Pant_NombreInterno[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A203Pant_NombreInterno, ""))));
            A200Pant_FechaCrea = H00312_A200Pant_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A200Pant_FechaCrea", localUtil.ttoc( A200Pant_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A200Pant_FechaCrea, "99/99/99 99:99")));
            A199Pant_UsuarioCrea = H00312_A199Pant_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A199Pant_UsuarioCrea", A199Pant_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A199Pant_UsuarioCrea, "@!"))));
            A17Modu_Descripcion = H00312_A17Modu_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17Modu_Descripcion", A17Modu_Descripcion);
            A16Modu_Id = H00312_A16Modu_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MODU_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")));
            A19Pant_Descripcion = H00312_A19Pant_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19Pant_Descripcion", A19Pant_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, ""))));
            A17Modu_Descripcion = H00312_A17Modu_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17Modu_Descripcion", A17Modu_Descripcion);
            /* Execute user event: Load */
            e14312 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb310( ) ;
      }
   }

   public void strup310( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "SEG_PANTALLAGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13312 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A19Pant_Descripcion = httpContext.cgiGet( edtPant_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19Pant_Descripcion", A19Pant_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, ""))));
         A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MODU_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")));
         A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17Modu_Descripcion", A17Modu_Descripcion);
         A199Pant_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtPant_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A199Pant_UsuarioCrea", A199Pant_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A199Pant_UsuarioCrea, "@!"))));
         A200Pant_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtPant_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A200Pant_FechaCrea", localUtil.ttoc( A200Pant_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A200Pant_FechaCrea, "99/99/99 99:99")));
         A203Pant_NombreInterno = httpContext.cgiGet( edtPant_NombreInterno_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_NOMBREINTERNO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A203Pant_NombreInterno, ""))));
         A697Pant_Orden = (short)(localUtil.ctol( httpContext.cgiGet( edtPant_Orden_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_ORDEN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")));
         A201Pant_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtPant_UsuarioModifica_Internalname)) ;
         n201Pant_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A201Pant_UsuarioModifica", A201Pant_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A201Pant_UsuarioModifica, "@!"))));
         A202Pant_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtPant_FechaModifica_Internalname), 0) ;
         n202Pant_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A202Pant_FechaModifica", localUtil.ttoc( A202Pant_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_PANT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A202Pant_FechaModifica, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA18Pant_Id"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "SEG_PANTALLAGeneral" ;
         A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MODU_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9") ;
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("seg_pantallageneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e13312 ();
      if (returnInSub) return;
   }

   public void e13312( )
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

   protected void e14312( )
   {
      /* Load Routine */
      edtModu_Descripcion_Link = formatLink("com.orions2.viewseg_modulo_menu") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A16Modu_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtModu_Descripcion_Internalname, "Link", edtModu_Descripcion_Link, true);
      edtPant_UsuarioModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPant_UsuarioModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtPant_UsuarioModifica_Visible, 5, 0)), true);
      edtPant_FechaModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPant_FechaModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtPant_FechaModifica_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV10TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV10TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV6HTTPRequest.getScriptName()+"?"+AV6HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtTransactionContext_Transactionname( "SEG_PANTALLA" );
      AV11TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Pant_Id" );
      AV11TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Pant_Id, 6, 0) );
      AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV11TrnContextAtt, 0);
      AV9Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A18Pant_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
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
      pa312( ) ;
      ws312( ) ;
      we312( ) ;
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
      sCtrlA18Pant_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa312( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "seg_pantallageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa312( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A18Pant_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      wcpOA18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA18Pant_Id"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A18Pant_Id != wcpOA18Pant_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA18Pant_Id = A18Pant_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA18Pant_Id = httpContext.cgiGet( sPrefix+"A18Pant_Id_CTRL") ;
      if ( GXutil.len( sCtrlA18Pant_Id) > 0 )
      {
         A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA18Pant_Id), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      else
      {
         A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A18Pant_Id_PARM"), ",", ".")) ;
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
      pa312( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws312( ) ;
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
      ws312( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A18Pant_Id_PARM", GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA18Pant_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A18Pant_Id_CTRL", GXutil.rtrim( sCtrlA18Pant_Id));
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
      we312( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416120");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("seg_pantallageneral.js", "?20186141416120");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtPant_Id_Internalname = sPrefix+"PANT_ID" ;
      edtPant_Descripcion_Internalname = sPrefix+"PANT_DESCRIPCION" ;
      edtModu_Id_Internalname = sPrefix+"MODU_ID" ;
      edtModu_Descripcion_Internalname = sPrefix+"MODU_DESCRIPCION" ;
      edtPant_UsuarioCrea_Internalname = sPrefix+"PANT_USUARIOCREA" ;
      edtPant_FechaCrea_Internalname = sPrefix+"PANT_FECHACREA" ;
      edtPant_NombreInterno_Internalname = sPrefix+"PANT_NOMBREINTERNO" ;
      edtPant_Orden_Internalname = sPrefix+"PANT_ORDEN" ;
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtPant_UsuarioModifica_Internalname = sPrefix+"PANT_USUARIOMODIFICA" ;
      edtPant_FechaModifica_Internalname = sPrefix+"PANT_FECHAMODIFICA" ;
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
      edtPant_FechaModifica_Jsonclick = "" ;
      edtPant_FechaModifica_Enabled = 0 ;
      edtPant_FechaModifica_Visible = 1 ;
      edtPant_UsuarioModifica_Jsonclick = "" ;
      edtPant_UsuarioModifica_Enabled = 0 ;
      edtPant_UsuarioModifica_Visible = 1 ;
      edtPant_Orden_Jsonclick = "" ;
      edtPant_Orden_Enabled = 0 ;
      edtPant_NombreInterno_Jsonclick = "" ;
      edtPant_NombreInterno_Enabled = 0 ;
      edtPant_FechaCrea_Jsonclick = "" ;
      edtPant_FechaCrea_Enabled = 0 ;
      edtPant_UsuarioCrea_Jsonclick = "" ;
      edtPant_UsuarioCrea_Enabled = 0 ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Descripcion_Link = "" ;
      edtModu_Descripcion_Enabled = 0 ;
      edtModu_Id_Jsonclick = "" ;
      edtModu_Id_Enabled = 0 ;
      edtPant_Descripcion_Jsonclick = "" ;
      edtPant_Descripcion_Enabled = 0 ;
      edtPant_Id_Jsonclick = "" ;
      edtPant_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11311',iparms:[{av:'A18Pant_Id',fld:'PANT_ID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12311',iparms:[{av:'A18Pant_Id',fld:'PANT_ID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
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
      A19Pant_Descripcion = "" ;
      A199Pant_UsuarioCrea = "" ;
      A200Pant_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A203Pant_NombreInterno = "" ;
      A201Pant_UsuarioModifica = "" ;
      A202Pant_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A17Modu_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H00312_A18Pant_Id = new int[1] ;
      H00312_A202Pant_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00312_n202Pant_FechaModifica = new boolean[] {false} ;
      H00312_A201Pant_UsuarioModifica = new String[] {""} ;
      H00312_n201Pant_UsuarioModifica = new boolean[] {false} ;
      H00312_A697Pant_Orden = new short[1] ;
      H00312_A203Pant_NombreInterno = new String[] {""} ;
      H00312_A200Pant_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00312_A199Pant_UsuarioCrea = new String[] {""} ;
      H00312_A17Modu_Descripcion = new String[] {""} ;
      H00312_A16Modu_Id = new long[1] ;
      H00312_A19Pant_Descripcion = new String[] {""} ;
      hsh = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV6HTTPRequest = httpContext.getHttpRequest();
      AV11TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA18Pant_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_pantallageneral__default(),
         new Object[] {
             new Object[] {
            H00312_A18Pant_Id, H00312_A202Pant_FechaModifica, H00312_n202Pant_FechaModifica, H00312_A201Pant_UsuarioModifica, H00312_n201Pant_UsuarioModifica, H00312_A697Pant_Orden, H00312_A203Pant_NombreInterno, H00312_A200Pant_FechaCrea, H00312_A199Pant_UsuarioCrea, H00312_A17Modu_Descripcion,
            H00312_A16Modu_Id, H00312_A19Pant_Descripcion
            }
         }
      );
      AV15Pgmname = "SEG_PANTALLAGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "SEG_PANTALLAGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A697Pant_Orden ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA18Pant_Id ;
   private int A18Pant_Id ;
   private int edtPant_Id_Enabled ;
   private int edtPant_Descripcion_Enabled ;
   private int edtModu_Id_Enabled ;
   private int edtModu_Descripcion_Enabled ;
   private int edtPant_UsuarioCrea_Enabled ;
   private int edtPant_FechaCrea_Enabled ;
   private int edtPant_NombreInterno_Enabled ;
   private int edtPant_Orden_Enabled ;
   private int edtPant_UsuarioModifica_Visible ;
   private int edtPant_UsuarioModifica_Enabled ;
   private int edtPant_FechaModifica_Visible ;
   private int edtPant_FechaModifica_Enabled ;
   private int AV8Pant_Id ;
   private int idxLst ;
   private long A16Modu_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A203Pant_NombreInterno ;
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
   private String edtPant_Id_Internalname ;
   private String edtPant_Id_Jsonclick ;
   private String edtPant_Descripcion_Internalname ;
   private String edtPant_Descripcion_Jsonclick ;
   private String edtModu_Id_Internalname ;
   private String edtModu_Id_Jsonclick ;
   private String edtModu_Descripcion_Internalname ;
   private String edtModu_Descripcion_Link ;
   private String edtModu_Descripcion_Jsonclick ;
   private String edtPant_UsuarioCrea_Internalname ;
   private String edtPant_UsuarioCrea_Jsonclick ;
   private String edtPant_FechaCrea_Internalname ;
   private String edtPant_FechaCrea_Jsonclick ;
   private String edtPant_NombreInterno_Internalname ;
   private String edtPant_NombreInterno_Jsonclick ;
   private String edtPant_Orden_Internalname ;
   private String edtPant_Orden_Jsonclick ;
   private String edtPant_UsuarioModifica_Internalname ;
   private String edtPant_UsuarioModifica_Jsonclick ;
   private String edtPant_FechaModifica_Internalname ;
   private String edtPant_FechaModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA18Pant_Id ;
   private java.util.Date A200Pant_FechaCrea ;
   private java.util.Date A202Pant_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n202Pant_FechaModifica ;
   private boolean n201Pant_UsuarioModifica ;
   private boolean returnInSub ;
   private String A19Pant_Descripcion ;
   private String A199Pant_UsuarioCrea ;
   private String A201Pant_UsuarioModifica ;
   private String A17Modu_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV6HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private int[] H00312_A18Pant_Id ;
   private java.util.Date[] H00312_A202Pant_FechaModifica ;
   private boolean[] H00312_n202Pant_FechaModifica ;
   private String[] H00312_A201Pant_UsuarioModifica ;
   private boolean[] H00312_n201Pant_UsuarioModifica ;
   private short[] H00312_A697Pant_Orden ;
   private String[] H00312_A203Pant_NombreInterno ;
   private java.util.Date[] H00312_A200Pant_FechaCrea ;
   private String[] H00312_A199Pant_UsuarioCrea ;
   private String[] H00312_A17Modu_Descripcion ;
   private long[] H00312_A16Modu_Id ;
   private String[] H00312_A19Pant_Descripcion ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV11TrnContextAtt ;
}

final  class seg_pantallageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00312", "SELECT T1.Pant_Id, T1.Pant_FechaModifica, T1.Pant_UsuarioModifica, T1.Pant_Orden, T1.Pant_NombreInterno, T1.Pant_FechaCrea, T1.Pant_UsuarioCrea, T2.Modu_Descripcion, T1.Modu_Id, T1.Pant_Descripcion FROM (SEG_PANTALLA T1 INNER JOIN SEG_MODULO_MENU T2 ON T2.Modu_Id = T1.Modu_Id) WHERE T1.Pant_Id = ? ORDER BY T1.Pant_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 50) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

