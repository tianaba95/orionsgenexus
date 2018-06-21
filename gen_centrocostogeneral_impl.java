/*
               File: gen_centrocostogeneral_impl
        Description: GEN_CENTROCOSTOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:17.42
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

public final  class gen_centrocostogeneral_impl extends GXWebComponent
{
   public gen_centrocostogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_centrocostogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_centrocostogeneral_impl.class ));
   }

   public gen_centrocostogeneral_impl( int remoteHandle ,
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
      cmbCent_Estado = new HTMLChoice();
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
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A1Cent_Id)});
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
         pa0B2( ) ;
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
         httpContext.writeValue( "GEN_CENTROCOSTOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414111749");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_centrocostogeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA1Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOA1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3Cent_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_NIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_TPOMAY", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_DESCRIPCION2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A123Cent_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_RESOLUCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_DESCRIPCIONLARGA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_NRODEPENDENCIASIIF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_AUXILIAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_CONSEPLACA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_CENT_CONSMULTICEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = sPrefix + "hsh" + "GEN_CENTROCOSTOGeneral" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_centrocostogeneral:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm0B2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("gen_centrocostogeneral.js", "?201861414111754");
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
      return "GEN_CENTROCOSTOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "GEN_CENTROCOSTOGeneral" ;
   }

   public void wb0B0( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.gen_centrocostogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e110b1_client"+"'", TempTags, "", 2, "HLP_GEN_CENTROCOSTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e120b1_client"+"'", TempTags, "", 2, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Id C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Cód C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Nit_Internalname, "Nit C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Nit_Internalname, GXutil.ltrim( localUtil.ntoc( A120Cent_Nit, (byte)(12), (byte)(0), ",", "")), ((edtCent_Nit_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Nit_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Nit_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción C.C", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_EtCt_Internalname, "Et Ct", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_EtCt_Internalname, GXutil.ltrim( localUtil.ntoc( A117Cent_EtCt, (byte)(2), (byte)(0), ",", "")), ((edtCent_EtCt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_EtCt_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_EtCt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_TpoMay_Internalname, "Entidad ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_TpoMay_Internalname, A118Cent_TpoMay, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_TpoMay_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_TpoMay_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion2_Internalname, "Descripcion 2", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion2_Internalname, A121Cent_Descripcion2, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion2_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Descripcion2_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtRegi_Descripcion_Link, "", "", "", edtRegi_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCiud_Descripcion_Link, "", "", "", edtCiud_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtDept_Descripcion_Link, "", "", "", edtDept_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPais_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPais_Descripcion_Link, "", "", "", edtPais_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Consecutivo_Internalname, "Consecutivo ", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Consecutivo_Internalname, A122Cent_Consecutivo, GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Consecutivo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Consecutivo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Direccion_Internalname, "Dir.Centro de formación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCent_Direccion_Internalname, A123Cent_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A123Cent_Direccion), "", (short)(0), 1, edtCent_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Resolucion_Internalname, "Resolucion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Resolucion_Internalname, A124Cent_Resolucion, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Resolucion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Resolucion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_DescripcionLarga_Internalname, "Descripcion Larga", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_DescripcionLarga_Internalname, A125Cent_DescripcionLarga, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_DescripcionLarga_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_DescripcionLarga_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_NroDependenciaSIIF_Internalname, "Dependencia SIIF", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_NroDependenciaSIIF_Internalname, GXutil.ltrim( localUtil.ntoc( A126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ",", "")), ((edtCent_NroDependenciaSIIF_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_NroDependenciaSIIF_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_NroDependenciaSIIF_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_UsuarioCrea_Internalname, "Usuario Creación Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_UsuarioCrea_Internalname, A113Cent_UsuarioCrea, GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_FechaCrea_Internalname, "Fecha Creación Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCent_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_FechaCrea_Internalname, localUtil.ttoc( A114Cent_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCent_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCent_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_UsuarioModifica_Internalname, "Usuario Modifica Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_UsuarioModifica_Internalname, A115Cent_UsuarioModifica, GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_FechaModifica_Internalname, "Fecha Modifica Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCent_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_FechaModifica_Internalname, localUtil.ttoc( A116Cent_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCent_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCent_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Auxiliar_Internalname, "Auxiliar", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Auxiliar_Internalname, GXutil.ltrim( localUtil.ntoc( A119Cent_Auxiliar, (byte)(8), (byte)(0), ",", "")), ((edtCent_Auxiliar_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Auxiliar_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Auxiliar_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_ConsePlaca_Internalname, "Placa", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_ConsePlaca_Internalname, GXutil.ltrim( localUtil.ntoc( A526Cent_ConsePlaca, (byte)(18), (byte)(0), ",", "")), ((edtCent_ConsePlaca_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_ConsePlaca_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_ConsePlaca_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbCent_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCent_Estado, cmbCent_Estado.getInternalname(), GXutil.rtrim( A683Cent_Estado), 1, cmbCent_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCent_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_GEN_CENTROCOSTOGeneral.htm");
         cmbCent_Estado.setValue( GXutil.rtrim( A683Cent_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbCent_Estado.getInternalname(), "Values", cmbCent_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_ConsMultiCedula_Internalname, "Cuentadante Multiple", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_ConsMultiCedula_Internalname, GXutil.ltrim( localUtil.ntoc( A694Cent_ConsMultiCedula, (byte)(18), (byte)(0), ",", "")), ((edtCent_ConsMultiCedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_ConsMultiCedula_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_ConsMultiCedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTOGeneral.htm");
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

   public void start0B2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "GEN_CENTROCOSTOGeneral", (short)(0)) ;
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
            strup0B0( ) ;
         }
      }
   }

   public void ws0B2( )
   {
      start0B2( ) ;
      evt0B2( ) ;
   }

   public void evt0B2( )
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
                              strup0B0( ) ;
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
                              strup0B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e130B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e140B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup0B0( ) ;
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
                              strup0B0( ) ;
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

   public void we0B2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0B2( ) ;
         }
      }
   }

   public void pa0B2( )
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
         cmbCent_Estado.setName( "CENT_ESTADO" );
         cmbCent_Estado.setWebtags( "" );
         cmbCent_Estado.addItem("A", "Activo", (short)(0));
         cmbCent_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCent_Estado.getItemCount() > 0 )
         {
            A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
            n683Cent_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A683Cent_Estado", A683Cent_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
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
      if ( cmbCent_Estado.getItemCount() > 0 )
      {
         A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
         n683Cent_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A683Cent_Estado", A683Cent_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0B2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "GEN_CENTROCOSTOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf0B2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000B2 */
         pr_default.execute(0, new Object[] {new Long(A1Cent_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A694Cent_ConsMultiCedula = H000B2_A694Cent_ConsMultiCedula[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A694Cent_ConsMultiCedula", GXutil.ltrim( GXutil.str( A694Cent_ConsMultiCedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSMULTICEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9")));
            A683Cent_Estado = H000B2_A683Cent_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A683Cent_Estado", A683Cent_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
            n683Cent_Estado = H000B2_n683Cent_Estado[0] ;
            A526Cent_ConsePlaca = H000B2_A526Cent_ConsePlaca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A526Cent_ConsePlaca", GXutil.ltrim( GXutil.str( A526Cent_ConsePlaca, 18, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSEPLACA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")));
            A119Cent_Auxiliar = H000B2_A119Cent_Auxiliar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A119Cent_Auxiliar", GXutil.ltrim( GXutil.str( A119Cent_Auxiliar, 8, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_AUXILIAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")));
            A116Cent_FechaModifica = H000B2_A116Cent_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A116Cent_FechaModifica", localUtil.ttoc( A116Cent_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99")));
            A115Cent_UsuarioModifica = H000B2_A115Cent_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A115Cent_UsuarioModifica", A115Cent_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!"))));
            A114Cent_FechaCrea = H000B2_A114Cent_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A114Cent_FechaCrea", localUtil.ttoc( A114Cent_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99")));
            A113Cent_UsuarioCrea = H000B2_A113Cent_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A113Cent_UsuarioCrea", A113Cent_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!"))));
            A126Cent_NroDependenciaSIIF = H000B2_A126Cent_NroDependenciaSIIF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_NRODEPENDENCIASIIF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")));
            A125Cent_DescripcionLarga = H000B2_A125Cent_DescripcionLarga[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCIONLARGA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, ""))));
            A124Cent_Resolucion = H000B2_A124Cent_Resolucion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A124Cent_Resolucion", A124Cent_Resolucion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_RESOLUCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, ""))));
            A123Cent_Direccion = H000B2_A123Cent_Direccion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A123Cent_Direccion", A123Cent_Direccion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A123Cent_Direccion, ""))));
            A122Cent_Consecutivo = H000B2_A122Cent_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A122Cent_Consecutivo", A122Cent_Consecutivo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, ""))));
            A11Pais_Descripcion = H000B2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            A9Pais_Codigo = H000B2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A10Dept_Descripcion = H000B2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A6Dept_Codigo = H000B2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A7Ciud_Descripcion = H000B2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A5Ciud_Codigo = H000B2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A13Regi_Descripcion = H000B2_A13Regi_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A12Regi_Cod = H000B2_A12Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A2Regi_Id = H000B2_A2Regi_Id[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
            A121Cent_Descripcion2 = H000B2_A121Cent_Descripcion2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCION2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, ""))));
            A118Cent_TpoMay = H000B2_A118Cent_TpoMay[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A118Cent_TpoMay", A118Cent_TpoMay);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_TPOMAY", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, ""))));
            A117Cent_EtCt = H000B2_A117Cent_EtCt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")));
            A4Cent_Descripcion = H000B2_A4Cent_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, ""))));
            A120Cent_Nit = H000B2_A120Cent_Nit[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_NIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")));
            A3Cent_Codigo = H000B2_A3Cent_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3Cent_Codigo, ""))));
            A5Ciud_Codigo = H000B2_A5Ciud_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A13Regi_Descripcion = H000B2_A13Regi_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A12Regi_Cod = H000B2_A12Regi_Cod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A6Dept_Codigo = H000B2_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A7Ciud_Descripcion = H000B2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A9Pais_Codigo = H000B2_A9Pais_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
            A10Dept_Descripcion = H000B2_A10Dept_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A11Pais_Descripcion = H000B2_A11Pais_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
            /* Execute user event: Load */
            e140B2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0B0( ) ;
      }
   }

   public void strup0B0( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "GEN_CENTROCOSTOGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130B2 ();
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
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A3Cent_Codigo, ""))));
         A120Cent_Nit = localUtil.ctol( httpContext.cgiGet( edtCent_Nit_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_NIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")));
         A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, ""))));
         A117Cent_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtCent_EtCt_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ETCT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")));
         A118Cent_TpoMay = httpContext.cgiGet( edtCent_TpoMay_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A118Cent_TpoMay", A118Cent_TpoMay);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_TPOMAY", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, ""))));
         A121Cent_Descripcion2 = httpContext.cgiGet( edtCent_Descripcion2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCION2", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, ""))));
         A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_REGI_ID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9Pais_Codigo", A9Pais_Codigo);
         A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A122Cent_Consecutivo = httpContext.cgiGet( edtCent_Consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A122Cent_Consecutivo", A122Cent_Consecutivo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSECUTIVO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, ""))));
         A123Cent_Direccion = httpContext.cgiGet( edtCent_Direccion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A123Cent_Direccion", A123Cent_Direccion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DIRECCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A123Cent_Direccion, ""))));
         A124Cent_Resolucion = httpContext.cgiGet( edtCent_Resolucion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A124Cent_Resolucion", A124Cent_Resolucion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_RESOLUCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, ""))));
         A125Cent_DescripcionLarga = httpContext.cgiGet( edtCent_DescripcionLarga_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_DESCRIPCIONLARGA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, ""))));
         A126Cent_NroDependenciaSIIF = localUtil.ctol( httpContext.cgiGet( edtCent_NroDependenciaSIIF_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_NRODEPENDENCIASIIF", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")));
         A113Cent_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCent_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A113Cent_UsuarioCrea", A113Cent_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!"))));
         A114Cent_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCent_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A114Cent_FechaCrea", localUtil.ttoc( A114Cent_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99")));
         A115Cent_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCent_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A115Cent_UsuarioModifica", A115Cent_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!"))));
         A116Cent_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCent_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A116Cent_FechaModifica", localUtil.ttoc( A116Cent_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99")));
         A119Cent_Auxiliar = (int)(localUtil.ctol( httpContext.cgiGet( edtCent_Auxiliar_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A119Cent_Auxiliar", GXutil.ltrim( GXutil.str( A119Cent_Auxiliar, 8, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_AUXILIAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")));
         A526Cent_ConsePlaca = localUtil.ctol( httpContext.cgiGet( edtCent_ConsePlaca_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A526Cent_ConsePlaca", GXutil.ltrim( GXutil.str( A526Cent_ConsePlaca, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSEPLACA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")));
         cmbCent_Estado.setValue( httpContext.cgiGet( cmbCent_Estado.getInternalname()) );
         A683Cent_Estado = httpContext.cgiGet( cmbCent_Estado.getInternalname()) ;
         n683Cent_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A683Cent_Estado", A683Cent_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
         A694Cent_ConsMultiCedula = localUtil.ctol( httpContext.cgiGet( edtCent_ConsMultiCedula_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A694Cent_ConsMultiCedula", GXutil.ltrim( GXutil.str( A694Cent_ConsMultiCedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_CENT_CONSMULTICEDULA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9")));
         /* Read saved values. */
         wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = sPrefix + "hsh" + "GEN_CENTROCOSTOGeneral" ;
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
            GXutil.writeLog("gen_centrocostogeneral:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e130B2 ();
      if (returnInSub) return;
   }

   public void e130B2( )
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

   protected void e140B2( )
   {
      /* Load Routine */
      edtRegi_Descripcion_Link = formatLink("com.orions2.viewgen_regional") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A2Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRegi_Descripcion_Internalname, "Link", edtRegi_Descripcion_Link, true);
      edtCiud_Descripcion_Link = formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCiud_Descripcion_Internalname, "Link", edtCiud_Descripcion_Link, true);
      edtDept_Descripcion_Link = formatLink("com.orions2.viewgen_departamento") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A6Dept_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDept_Descripcion_Internalname, "Link", edtDept_Descripcion_Link, true);
      edtPais_Descripcion_Link = formatLink("com.orions2.viewgen_pais") + "?" + GXutil.URLEncode(GXutil.rtrim(A9Pais_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPais_Descripcion_Internalname, "Link", edtPais_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "GEN_CENTROCOSTO" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Cent_Id" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Cent_Id, 11, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
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
      pa0B2( ) ;
      ws0B2( ) ;
      we0B2( ) ;
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
      sCtrlA1Cent_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa0B2( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gen_centrocostogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa0B2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A1Cent_Id != wcpOA1Cent_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA1Cent_Id = A1Cent_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      pa0B2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws0B2( ) ;
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
      ws0B2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      we0B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414111937");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("gen_centrocostogeneral.js", "?201861414111937");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      edtCent_Nit_Internalname = sPrefix+"CENT_NIT" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
      edtCent_EtCt_Internalname = sPrefix+"CENT_ETCT" ;
      edtCent_TpoMay_Internalname = sPrefix+"CENT_TPOMAY" ;
      edtCent_Descripcion2_Internalname = sPrefix+"CENT_DESCRIPCION2" ;
      edtRegi_Id_Internalname = sPrefix+"REGI_ID" ;
      edtRegi_Cod_Internalname = sPrefix+"REGI_COD" ;
      edtRegi_Descripcion_Internalname = sPrefix+"REGI_DESCRIPCION" ;
      edtCiud_Codigo_Internalname = sPrefix+"CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = sPrefix+"CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = sPrefix+"DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = sPrefix+"DEPT_DESCRIPCION" ;
      edtPais_Codigo_Internalname = sPrefix+"PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = sPrefix+"PAIS_DESCRIPCION" ;
      edtCent_Consecutivo_Internalname = sPrefix+"CENT_CONSECUTIVO" ;
      edtCent_Direccion_Internalname = sPrefix+"CENT_DIRECCION" ;
      edtCent_Resolucion_Internalname = sPrefix+"CENT_RESOLUCION" ;
      edtCent_DescripcionLarga_Internalname = sPrefix+"CENT_DESCRIPCIONLARGA" ;
      edtCent_NroDependenciaSIIF_Internalname = sPrefix+"CENT_NRODEPENDENCIASIIF" ;
      edtCent_UsuarioCrea_Internalname = sPrefix+"CENT_USUARIOCREA" ;
      edtCent_FechaCrea_Internalname = sPrefix+"CENT_FECHACREA" ;
      edtCent_UsuarioModifica_Internalname = sPrefix+"CENT_USUARIOMODIFICA" ;
      edtCent_FechaModifica_Internalname = sPrefix+"CENT_FECHAMODIFICA" ;
      edtCent_Auxiliar_Internalname = sPrefix+"CENT_AUXILIAR" ;
      edtCent_ConsePlaca_Internalname = sPrefix+"CENT_CONSEPLACA" ;
      cmbCent_Estado.setInternalname( sPrefix+"CENT_ESTADO" );
      edtCent_ConsMultiCedula_Internalname = sPrefix+"CENT_CONSMULTICEDULA" ;
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
      edtCent_ConsMultiCedula_Jsonclick = "" ;
      edtCent_ConsMultiCedula_Enabled = 0 ;
      cmbCent_Estado.setJsonclick( "" );
      cmbCent_Estado.setEnabled( 0 );
      edtCent_ConsePlaca_Jsonclick = "" ;
      edtCent_ConsePlaca_Enabled = 0 ;
      edtCent_Auxiliar_Jsonclick = "" ;
      edtCent_Auxiliar_Enabled = 0 ;
      edtCent_FechaModifica_Jsonclick = "" ;
      edtCent_FechaModifica_Enabled = 0 ;
      edtCent_UsuarioModifica_Jsonclick = "" ;
      edtCent_UsuarioModifica_Enabled = 0 ;
      edtCent_FechaCrea_Jsonclick = "" ;
      edtCent_FechaCrea_Enabled = 0 ;
      edtCent_UsuarioCrea_Jsonclick = "" ;
      edtCent_UsuarioCrea_Enabled = 0 ;
      edtCent_NroDependenciaSIIF_Jsonclick = "" ;
      edtCent_NroDependenciaSIIF_Enabled = 0 ;
      edtCent_DescripcionLarga_Jsonclick = "" ;
      edtCent_DescripcionLarga_Enabled = 0 ;
      edtCent_Resolucion_Jsonclick = "" ;
      edtCent_Resolucion_Enabled = 0 ;
      edtCent_Direccion_Enabled = 0 ;
      edtCent_Consecutivo_Jsonclick = "" ;
      edtCent_Consecutivo_Enabled = 0 ;
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
      edtCiud_Descripcion_Link = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Link = "" ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
      edtCent_Descripcion2_Jsonclick = "" ;
      edtCent_Descripcion2_Enabled = 0 ;
      edtCent_TpoMay_Jsonclick = "" ;
      edtCent_TpoMay_Enabled = 0 ;
      edtCent_EtCt_Jsonclick = "" ;
      edtCent_EtCt_Enabled = 0 ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Nit_Jsonclick = "" ;
      edtCent_Nit_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e110B1',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e120B1',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A118Cent_TpoMay = "" ;
      A121Cent_Descripcion2 = "" ;
      A122Cent_Consecutivo = "" ;
      A123Cent_Direccion = "" ;
      A124Cent_Resolucion = "" ;
      A125Cent_DescripcionLarga = "" ;
      A113Cent_UsuarioCrea = "" ;
      A114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A115Cent_UsuarioModifica = "" ;
      A116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A683Cent_Estado = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A13Regi_Descripcion = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H000B2_A1Cent_Id = new long[1] ;
      H000B2_A694Cent_ConsMultiCedula = new long[1] ;
      H000B2_A683Cent_Estado = new String[] {""} ;
      H000B2_n683Cent_Estado = new boolean[] {false} ;
      H000B2_A526Cent_ConsePlaca = new long[1] ;
      H000B2_A119Cent_Auxiliar = new int[1] ;
      H000B2_A116Cent_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H000B2_A115Cent_UsuarioModifica = new String[] {""} ;
      H000B2_A114Cent_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H000B2_A113Cent_UsuarioCrea = new String[] {""} ;
      H000B2_A126Cent_NroDependenciaSIIF = new long[1] ;
      H000B2_A125Cent_DescripcionLarga = new String[] {""} ;
      H000B2_A124Cent_Resolucion = new String[] {""} ;
      H000B2_A123Cent_Direccion = new String[] {""} ;
      H000B2_A122Cent_Consecutivo = new String[] {""} ;
      H000B2_A11Pais_Descripcion = new String[] {""} ;
      H000B2_A9Pais_Codigo = new String[] {""} ;
      H000B2_A10Dept_Descripcion = new String[] {""} ;
      H000B2_A6Dept_Codigo = new short[1] ;
      H000B2_A7Ciud_Descripcion = new String[] {""} ;
      H000B2_A5Ciud_Codigo = new short[1] ;
      H000B2_A13Regi_Descripcion = new String[] {""} ;
      H000B2_A12Regi_Cod = new short[1] ;
      H000B2_A2Regi_Id = new long[1] ;
      H000B2_A121Cent_Descripcion2 = new String[] {""} ;
      H000B2_A118Cent_TpoMay = new String[] {""} ;
      H000B2_A117Cent_EtCt = new byte[1] ;
      H000B2_A4Cent_Descripcion = new String[] {""} ;
      H000B2_A120Cent_Nit = new long[1] ;
      H000B2_A3Cent_Codigo = new String[] {""} ;
      hsh = "" ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA1Cent_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_centrocostogeneral__default(),
         new Object[] {
             new Object[] {
            H000B2_A1Cent_Id, H000B2_A694Cent_ConsMultiCedula, H000B2_A683Cent_Estado, H000B2_n683Cent_Estado, H000B2_A526Cent_ConsePlaca, H000B2_A119Cent_Auxiliar, H000B2_A116Cent_FechaModifica, H000B2_A115Cent_UsuarioModifica, H000B2_A114Cent_FechaCrea, H000B2_A113Cent_UsuarioCrea,
            H000B2_A126Cent_NroDependenciaSIIF, H000B2_A125Cent_DescripcionLarga, H000B2_A124Cent_Resolucion, H000B2_A123Cent_Direccion, H000B2_A122Cent_Consecutivo, H000B2_A11Pais_Descripcion, H000B2_A9Pais_Codigo, H000B2_A10Dept_Descripcion, H000B2_A6Dept_Codigo, H000B2_A7Ciud_Descripcion,
            H000B2_A5Ciud_Codigo, H000B2_A13Regi_Descripcion, H000B2_A12Regi_Cod, H000B2_A2Regi_Id, H000B2_A121Cent_Descripcion2, H000B2_A118Cent_TpoMay, H000B2_A117Cent_EtCt, H000B2_A4Cent_Descripcion, H000B2_A120Cent_Nit, H000B2_A3Cent_Codigo
            }
         }
      );
      AV14Pgmname = "GEN_CENTROCOSTOGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "GEN_CENTROCOSTOGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A117Cent_EtCt ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A12Regi_Cod ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A119Cent_Auxiliar ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Nit_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtCent_EtCt_Enabled ;
   private int edtCent_TpoMay_Enabled ;
   private int edtCent_Descripcion2_Enabled ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int edtPais_Descripcion_Enabled ;
   private int edtCent_Consecutivo_Enabled ;
   private int edtCent_Direccion_Enabled ;
   private int edtCent_Resolucion_Enabled ;
   private int edtCent_DescripcionLarga_Enabled ;
   private int edtCent_NroDependenciaSIIF_Enabled ;
   private int edtCent_UsuarioCrea_Enabled ;
   private int edtCent_FechaCrea_Enabled ;
   private int edtCent_UsuarioModifica_Enabled ;
   private int edtCent_FechaModifica_Enabled ;
   private int edtCent_Auxiliar_Enabled ;
   private int edtCent_ConsePlaca_Enabled ;
   private int edtCent_ConsMultiCedula_Enabled ;
   private int idxLst ;
   private long wcpOA1Cent_Id ;
   private long A1Cent_Id ;
   private long A120Cent_Nit ;
   private long A2Regi_Id ;
   private long A126Cent_NroDependenciaSIIF ;
   private long A526Cent_ConsePlaca ;
   private long A694Cent_ConsMultiCedula ;
   private long AV7Cent_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A683Cent_Estado ;
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
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Nit_Internalname ;
   private String edtCent_Nit_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtCent_EtCt_Internalname ;
   private String edtCent_EtCt_Jsonclick ;
   private String edtCent_TpoMay_Internalname ;
   private String edtCent_TpoMay_Jsonclick ;
   private String edtCent_Descripcion2_Internalname ;
   private String edtCent_Descripcion2_Jsonclick ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Link ;
   private String edtRegi_Descripcion_Jsonclick ;
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
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Link ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtCent_Consecutivo_Internalname ;
   private String edtCent_Consecutivo_Jsonclick ;
   private String edtCent_Direccion_Internalname ;
   private String edtCent_Resolucion_Internalname ;
   private String edtCent_Resolucion_Jsonclick ;
   private String edtCent_DescripcionLarga_Internalname ;
   private String edtCent_DescripcionLarga_Jsonclick ;
   private String edtCent_NroDependenciaSIIF_Internalname ;
   private String edtCent_NroDependenciaSIIF_Jsonclick ;
   private String edtCent_UsuarioCrea_Internalname ;
   private String edtCent_UsuarioCrea_Jsonclick ;
   private String edtCent_FechaCrea_Internalname ;
   private String edtCent_FechaCrea_Jsonclick ;
   private String edtCent_UsuarioModifica_Internalname ;
   private String edtCent_UsuarioModifica_Jsonclick ;
   private String edtCent_FechaModifica_Internalname ;
   private String edtCent_FechaModifica_Jsonclick ;
   private String edtCent_Auxiliar_Internalname ;
   private String edtCent_Auxiliar_Jsonclick ;
   private String edtCent_ConsePlaca_Internalname ;
   private String edtCent_ConsePlaca_Jsonclick ;
   private String edtCent_ConsMultiCedula_Internalname ;
   private String edtCent_ConsMultiCedula_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String sCtrlA1Cent_Id ;
   private java.util.Date A114Cent_FechaCrea ;
   private java.util.Date A116Cent_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n683Cent_Estado ;
   private boolean returnInSub ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A118Cent_TpoMay ;
   private String A121Cent_Descripcion2 ;
   private String A122Cent_Consecutivo ;
   private String A123Cent_Direccion ;
   private String A124Cent_Resolucion ;
   private String A125Cent_DescripcionLarga ;
   private String A113Cent_UsuarioCrea ;
   private String A115Cent_UsuarioModifica ;
   private String A13Regi_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbCent_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H000B2_A1Cent_Id ;
   private long[] H000B2_A694Cent_ConsMultiCedula ;
   private String[] H000B2_A683Cent_Estado ;
   private boolean[] H000B2_n683Cent_Estado ;
   private long[] H000B2_A526Cent_ConsePlaca ;
   private int[] H000B2_A119Cent_Auxiliar ;
   private java.util.Date[] H000B2_A116Cent_FechaModifica ;
   private String[] H000B2_A115Cent_UsuarioModifica ;
   private java.util.Date[] H000B2_A114Cent_FechaCrea ;
   private String[] H000B2_A113Cent_UsuarioCrea ;
   private long[] H000B2_A126Cent_NroDependenciaSIIF ;
   private String[] H000B2_A125Cent_DescripcionLarga ;
   private String[] H000B2_A124Cent_Resolucion ;
   private String[] H000B2_A123Cent_Direccion ;
   private String[] H000B2_A122Cent_Consecutivo ;
   private String[] H000B2_A11Pais_Descripcion ;
   private String[] H000B2_A9Pais_Codigo ;
   private String[] H000B2_A10Dept_Descripcion ;
   private short[] H000B2_A6Dept_Codigo ;
   private String[] H000B2_A7Ciud_Descripcion ;
   private short[] H000B2_A5Ciud_Codigo ;
   private String[] H000B2_A13Regi_Descripcion ;
   private short[] H000B2_A12Regi_Cod ;
   private long[] H000B2_A2Regi_Id ;
   private String[] H000B2_A121Cent_Descripcion2 ;
   private String[] H000B2_A118Cent_TpoMay ;
   private byte[] H000B2_A117Cent_EtCt ;
   private String[] H000B2_A4Cent_Descripcion ;
   private long[] H000B2_A120Cent_Nit ;
   private String[] H000B2_A3Cent_Codigo ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class gen_centrocostogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000B2", "SELECT T1.Cent_Id, T1.Cent_ConsMultiCedula, T1.Cent_Estado, T1.Cent_ConsePlaca, T1.Cent_Auxiliar, T1.Cent_FechaModifica, T1.Cent_UsuarioModifica, T1.Cent_FechaCrea, T1.Cent_UsuarioCrea, T1.Cent_NroDependenciaSIIF, T1.Cent_DescripcionLarga, T1.Cent_Resolucion, T1.Cent_Direccion, T1.Cent_Consecutivo, T5.Pais_Descripcion, T4.Pais_Codigo, T4.Dept_Descripcion, T3.Dept_Codigo, T3.Ciud_Descripcion, T2.Ciud_Codigo, T2.Regi_Descripcion, T2.Regi_Cod, T1.Regi_Id, T1.Cent_Descripcion2, T1.Cent_TpoMay, T1.Cent_EtCt, T1.Cent_Descripcion, T1.Cent_Nit, T1.Cent_Codigo FROM ((((GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_PAIS T5 ON T5.Pais_Codigo = T4.Pais_Codigo) WHERE T1.Cent_Id = ? ORDER BY T1.Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[10])[0] = rslt.getLong(10) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(17) ;
               ((short[]) buf[18])[0] = rslt.getShort(18) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(19) ;
               ((short[]) buf[20])[0] = rslt.getShort(20) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(21) ;
               ((short[]) buf[22])[0] = rslt.getShort(22) ;
               ((long[]) buf[23])[0] = rslt.getLong(23) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(25) ;
               ((byte[]) buf[26])[0] = rslt.getByte(26) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(27) ;
               ((long[]) buf[28])[0] = rslt.getLong(28) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(29) ;
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

