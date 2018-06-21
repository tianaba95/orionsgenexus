/*
               File: alm_restriccionesgeneral_impl
        Description: ALM_RESTRICCIONESGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:17.73
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

public final  class alm_restriccionesgeneral_impl extends GXWebComponent
{
   public alm_restriccionesgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_restriccionesgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_restriccionesgeneral_impl.class ));
   }

   public alm_restriccionesgeneral_impl( int remoteHandle ,
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
      cmbMbod_AlmModOrigen = new HTMLChoice();
      cmbMbod_AlmModDestino = new HTMLChoice();
      cmbMbod_Estado = new HTMLChoice();
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
               A60Mbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A60Mbod_Id)});
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
         pa132( ) ;
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
         httpContext.writeValue( "ALM_RESTRICCIONESGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414141778");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_restriccionesgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A60Mbod_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA60Mbod_Id", GXutil.ltrim( localUtil.ntoc( wcpOA60Mbod_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_TIPOMOVCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_CENTCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_BODORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ALMDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_BODDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MBOD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!"))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm132( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_restriccionesgeneral.js", "?201861414141780");
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
      return "ALM_RESTRICCIONESGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_RESTRICCIONESGeneral" ;
   }

   public void wb130( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_restriccionesgeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11131_client"+"'", TempTags, "", 2, "HLP_ALM_RESTRICCIONESGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12131_client"+"'", TempTags, "", 2, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_Id_Internalname, "Identificador", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ",", "")), ((edtMbod_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoMovCodigo_Internalname, "Tipo Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoMovCodigo_Internalname, A61Mbod_TipoMovCodigo, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoMovCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_TipoMovCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoMovDescrip_Internalname, "Tipo Movimiento", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoMovDescrip_Internalname, A428Mbod_TipoMovDescrip, GXutil.rtrim( localUtil.format( A428Mbod_TipoMovDescrip, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoMovDescrip_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_TipoMovDescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoElementoCod_Internalname, "Elemento Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoElementoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ",", "")), ((edtMbod_TipoElementoCod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoElementoCod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_TipoElementoCod_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoElementoDesc_Internalname, "Elemento Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoElementoDesc_Internalname, A432Mbod_TipoElementoDesc, GXutil.rtrim( localUtil.format( A432Mbod_TipoElementoDesc, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoElementoDesc_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_TipoElementoDesc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionId_Internalname, "Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")), ((edtMbod_RegionId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_RegionId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionCodigo_Internalname, "Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtMbod_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionDescripcion_Internalname, "Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionDescripcion_Internalname, A427Mbod_RegionDescripcion, GXutil.rtrim( localUtil.format( A427Mbod_RegionDescripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentCostoId_Internalname, "Costo Id", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")), ((edtMbod_CentCostoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentCostoId_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_CentCostoId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentCostoCodigo_Internalname, "Costo Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentCostoCodigo_Internalname, A429Mbod_CentCostoCodigo, GXutil.rtrim( localUtil.format( A429Mbod_CentCostoCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentCostoCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_CentCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentroCostoDescrip_Internalname, "Costo Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentroCostoDescrip_Internalname, A430Mbod_CentroCostoDescrip, GXutil.rtrim( localUtil.format( A430Mbod_CentroCostoDescrip, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentroCostoDescrip_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_CentroCostoDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_AlmModOrigen.getInternalname(), "Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_AlmModOrigen, cmbMbod_AlmModOrigen.getInternalname(), GXutil.rtrim( A364Mbod_AlmModOrigen), 1, cmbMbod_AlmModOrigen.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbMbod_AlmModOrigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
         cmbMbod_AlmModOrigen.setValue( GXutil.rtrim( A364Mbod_AlmModOrigen) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_AlmModOrigen.getInternalname(), "Values", cmbMbod_AlmModOrigen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_AlmOrigenCodigo_Internalname, "Almacen Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_AlmOrigenCodigo_Internalname, A342Mbod_AlmOrigenCodigo, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_AlmOrigenCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_AlmOrigenCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodOrigenCodigo_Internalname, "Bodega Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodOrigenCodigo_Internalname, A64Mbod_BodOrigenCodigo, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodOrigenCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_BodOrigenCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodOrigenDescripcion_Internalname, "Bodega Origen", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodOrigenDescripcion_Internalname, A341Mbod_BodOrigenDescripcion, GXutil.rtrim( localUtil.format( A341Mbod_BodOrigenDescripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodOrigenDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_BodOrigenDescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_AlmModDestino.getInternalname(), "Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_AlmModDestino, cmbMbod_AlmModDestino.getInternalname(), GXutil.rtrim( A368Mbod_AlmModDestino), 1, cmbMbod_AlmModDestino.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbMbod_AlmModDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
         cmbMbod_AlmModDestino.setValue( GXutil.rtrim( A368Mbod_AlmModDestino) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_AlmModDestino.getInternalname(), "Values", cmbMbod_AlmModDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_AlmDestinoCodigo_Internalname, "Almacen Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_AlmDestinoCodigo_Internalname, A345Mbod_AlmDestinoCodigo, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_AlmDestinoCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_AlmDestinoCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodDestinoCodigo_Internalname, "Bodega Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodDestinoCodigo_Internalname, A65Mbod_BodDestinoCodigo, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodDestinoCodigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_BodDestinoCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodDestinoDescripcion_Internalname, "Bodega Destino", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodDestinoDescripcion_Internalname, A347Mbod_BodDestinoDescripcion, GXutil.rtrim( localUtil.format( A347Mbod_BodDestinoDescripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodDestinoDescripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_BodDestinoDescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_Estado, cmbMbod_Estado.getInternalname(), GXutil.rtrim( A434Mbod_Estado), 1, cmbMbod_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMbod_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
         cmbMbod_Estado.setValue( GXutil.rtrim( A434Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbMbod_Estado.getInternalname(), "Values", cmbMbod_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_FechaCrea_Internalname, "Creación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMbod_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_FechaCrea_Internalname, localUtil.ttoc( A433Mbod_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtMbod_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMbod_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_UsuarioCrea_Internalname, "Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_UsuarioCrea_Internalname, A359Mbod_UsuarioCrea, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_FechaModifica_Internalname, "Fecha", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtMbod_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_FechaModifica_Internalname, localUtil.ttoc( A362Mbod_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_RESTRICCIONESGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtMbod_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMbod_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_RESTRICCIONESGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_UsuarioModifica_Internalname, "Usuario", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_UsuarioModifica_Internalname, A361Mbod_UsuarioModifica, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtMbod_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_RESTRICCIONESGeneral.htm");
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

   public void start132( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_RESTRICCIONESGeneral", (short)(0)) ;
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
            strup130( ) ;
         }
      }
   }

   public void ws132( )
   {
      start132( ) ;
      evt132( ) ;
   }

   public void evt132( )
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
                              strup130( ) ;
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
                              strup130( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13132 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup130( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14132 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup130( ) ;
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
                              strup130( ) ;
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

   public void we132( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm132( ) ;
         }
      }
   }

   public void pa132( )
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
         cmbMbod_AlmModOrigen.setName( "MBOD_ALMMODORIGEN" );
         cmbMbod_AlmModOrigen.setWebtags( "" );
         cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
         {
            A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
         }
         cmbMbod_AlmModDestino.setName( "MBOD_ALMMODDESTINO" );
         cmbMbod_AlmModDestino.setWebtags( "" );
         cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
         {
            A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
         }
         cmbMbod_Estado.setName( "MBOD_ESTADO" );
         cmbMbod_Estado.setWebtags( "" );
         cmbMbod_Estado.addItem("A", "Activo", (short)(0));
         cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbMbod_Estado.getItemCount() > 0 )
         {
            A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A434Mbod_Estado", A434Mbod_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
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
      if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
      {
         A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
      }
      if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
      {
         A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
      }
      if ( cmbMbod_Estado.getItemCount() > 0 )
      {
         A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A434Mbod_Estado", A434Mbod_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf132( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_RESTRICCIONESGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf132( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00132 */
         pr_default.execute(0, new Object[] {new Long(A60Mbod_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361Mbod_UsuarioModifica = H00132_A361Mbod_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!"))));
            A362Mbod_FechaModifica = H00132_A362Mbod_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99")));
            A359Mbod_UsuarioCrea = H00132_A359Mbod_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!"))));
            A433Mbod_FechaCrea = H00132_A433Mbod_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99")));
            A434Mbod_Estado = H00132_A434Mbod_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A434Mbod_Estado", A434Mbod_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
            A65Mbod_BodDestinoCodigo = H00132_A65Mbod_BodDestinoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_BODDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
            A345Mbod_AlmDestinoCodigo = H00132_A345Mbod_AlmDestinoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
            A368Mbod_AlmModDestino = H00132_A368Mbod_AlmModDestino[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
            A64Mbod_BodOrigenCodigo = H00132_A64Mbod_BodOrigenCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_BODORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, ""))));
            A342Mbod_AlmOrigenCodigo = H00132_A342Mbod_AlmOrigenCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
            A364Mbod_AlmModOrigen = H00132_A364Mbod_AlmModOrigen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
            A430Mbod_CentroCostoDescrip = H00132_A430Mbod_CentroCostoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
            n430Mbod_CentroCostoDescrip = H00132_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H00132_A429Mbod_CentCostoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
            n429Mbod_CentCostoCodigo = H00132_n429Mbod_CentCostoCodigo[0] ;
            A63Mbod_CentCostoId = H00132_A63Mbod_CentCostoId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_CENTCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
            A427Mbod_RegionDescripcion = H00132_A427Mbod_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
            n427Mbod_RegionDescripcion = H00132_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H00132_A426Mbod_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
            n426Mbod_RegionCodigo = H00132_n426Mbod_RegionCodigo[0] ;
            A62Mbod_RegionId = H00132_A62Mbod_RegionId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
            A432Mbod_TipoElementoDesc = H00132_A432Mbod_TipoElementoDesc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
            n432Mbod_TipoElementoDesc = H00132_n432Mbod_TipoElementoDesc[0] ;
            A431Mbod_TipoElementoCod = H00132_A431Mbod_TipoElementoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
            n431Mbod_TipoElementoCod = H00132_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H00132_A428Mbod_TipoMovDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
            n428Mbod_TipoMovDescrip = H00132_n428Mbod_TipoMovDescrip[0] ;
            A61Mbod_TipoMovCodigo = H00132_A61Mbod_TipoMovCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_TIPOMOVCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, ""))));
            A430Mbod_CentroCostoDescrip = H00132_A430Mbod_CentroCostoDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
            n430Mbod_CentroCostoDescrip = H00132_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H00132_A429Mbod_CentCostoCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
            n429Mbod_CentCostoCodigo = H00132_n429Mbod_CentCostoCodigo[0] ;
            A427Mbod_RegionDescripcion = H00132_A427Mbod_RegionDescripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
            n427Mbod_RegionDescripcion = H00132_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H00132_A426Mbod_RegionCodigo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
            n426Mbod_RegionCodigo = H00132_n426Mbod_RegionCodigo[0] ;
            A431Mbod_TipoElementoCod = H00132_A431Mbod_TipoElementoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
            n431Mbod_TipoElementoCod = H00132_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H00132_A428Mbod_TipoMovDescrip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
            n428Mbod_TipoMovDescrip = H00132_n428Mbod_TipoMovDescrip[0] ;
            A432Mbod_TipoElementoDesc = H00132_A432Mbod_TipoElementoDesc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
            n432Mbod_TipoElementoDesc = H00132_n432Mbod_TipoElementoDesc[0] ;
            /* Using cursor H00133 */
            pr_default.execute(1, new Object[] {A64Mbod_BodOrigenCodigo});
            pr_default.close(1);
            /* Using cursor H00134 */
            pr_default.execute(2, new Object[] {A65Mbod_BodDestinoCodigo});
            pr_default.close(2);
            /* Execute user event: Load */
            e14132 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(2);
         wb130( ) ;
      }
   }

   public void strup130( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_RESTRICCIONESGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13132 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A61Mbod_TipoMovCodigo = httpContext.cgiGet( edtMbod_TipoMovCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_TIPOMOVCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, ""))));
         A428Mbod_TipoMovDescrip = httpContext.cgiGet( edtMbod_TipoMovDescrip_Internalname) ;
         n428Mbod_TipoMovDescrip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
         A431Mbod_TipoElementoCod = localUtil.ctol( httpContext.cgiGet( edtMbod_TipoElementoCod_Internalname), ",", ".") ;
         n431Mbod_TipoElementoCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
         A432Mbod_TipoElementoDesc = GXutil.upper( httpContext.cgiGet( edtMbod_TipoElementoDesc_Internalname)) ;
         n432Mbod_TipoElementoDesc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
         A62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_REGIONID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
         A426Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtMbod_RegionCodigo_Internalname), ",", ".")) ;
         n426Mbod_RegionCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
         A427Mbod_RegionDescripcion = httpContext.cgiGet( edtMbod_RegionDescripcion_Internalname) ;
         n427Mbod_RegionDescripcion = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
         A63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_CENTCOSTOID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
         A429Mbod_CentCostoCodigo = httpContext.cgiGet( edtMbod_CentCostoCodigo_Internalname) ;
         n429Mbod_CentCostoCodigo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
         A430Mbod_CentroCostoDescrip = httpContext.cgiGet( edtMbod_CentroCostoDescrip_Internalname) ;
         n430Mbod_CentroCostoDescrip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
         cmbMbod_AlmModOrigen.setValue( httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) );
         A364Mbod_AlmModOrigen = httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
         A342Mbod_AlmOrigenCodigo = httpContext.cgiGet( edtMbod_AlmOrigenCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
         A64Mbod_BodOrigenCodigo = httpContext.cgiGet( edtMbod_BodOrigenCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_BODORIGENCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, ""))));
         A341Mbod_BodOrigenDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodOrigenDescripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A341Mbod_BodOrigenDescripcion", A341Mbod_BodOrigenDescripcion);
         cmbMbod_AlmModDestino.setValue( httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) );
         A368Mbod_AlmModDestino = httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
         A345Mbod_AlmDestinoCodigo = httpContext.cgiGet( edtMbod_AlmDestinoCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ALMDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
         A65Mbod_BodDestinoCodigo = httpContext.cgiGet( edtMbod_BodDestinoCodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_BODDESTINOCODIGO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
         A347Mbod_BodDestinoDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodDestinoDescripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A347Mbod_BodDestinoDescripcion", A347Mbod_BodDestinoDescripcion);
         cmbMbod_Estado.setValue( httpContext.cgiGet( cmbMbod_Estado.getInternalname()) );
         A434Mbod_Estado = httpContext.cgiGet( cmbMbod_Estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A434Mbod_Estado", A434Mbod_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
         A433Mbod_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99")));
         A359Mbod_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!"))));
         A362Mbod_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99")));
         A361Mbod_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_MBOD_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!"))));
         /* Read saved values. */
         wcpOA60Mbod_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA60Mbod_Id"), ",", ".") ;
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
      e13132 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e13132( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV14Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e14132( )
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
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_RESTRICCIONES" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Mbod_Id" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Mbod_Id, 11, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A60Mbod_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
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
      pa132( ) ;
      ws132( ) ;
      we132( ) ;
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
      sCtrlA60Mbod_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa132( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_restriccionesgeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa132( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A60Mbod_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      }
      wcpOA60Mbod_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA60Mbod_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A60Mbod_Id != wcpOA60Mbod_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA60Mbod_Id = A60Mbod_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA60Mbod_Id = httpContext.cgiGet( sPrefix+"A60Mbod_Id_CTRL") ;
      if ( GXutil.len( sCtrlA60Mbod_Id) > 0 )
      {
         A60Mbod_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA60Mbod_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      }
      else
      {
         A60Mbod_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A60Mbod_Id_PARM"), ",", ".") ;
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
      pa132( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws132( ) ;
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
      ws132( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A60Mbod_Id_PARM", GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA60Mbod_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A60Mbod_Id_CTRL", GXutil.rtrim( sCtrlA60Mbod_Id));
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
      we132( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414141918");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_restriccionesgeneral.js", "?201861414141918");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtMbod_Id_Internalname = sPrefix+"MBOD_ID" ;
      edtMbod_TipoMovCodigo_Internalname = sPrefix+"MBOD_TIPOMOVCODIGO" ;
      edtMbod_TipoMovDescrip_Internalname = sPrefix+"MBOD_TIPOMOVDESCRIP" ;
      edtMbod_TipoElementoCod_Internalname = sPrefix+"MBOD_TIPOELEMENTOCOD" ;
      edtMbod_TipoElementoDesc_Internalname = sPrefix+"MBOD_TIPOELEMENTODESC" ;
      edtMbod_RegionId_Internalname = sPrefix+"MBOD_REGIONID" ;
      edtMbod_RegionCodigo_Internalname = sPrefix+"MBOD_REGIONCODIGO" ;
      edtMbod_RegionDescripcion_Internalname = sPrefix+"MBOD_REGIONDESCRIPCION" ;
      edtMbod_CentCostoId_Internalname = sPrefix+"MBOD_CENTCOSTOID" ;
      edtMbod_CentCostoCodigo_Internalname = sPrefix+"MBOD_CENTCOSTOCODIGO" ;
      edtMbod_CentroCostoDescrip_Internalname = sPrefix+"MBOD_CENTROCOSTODESCRIP" ;
      cmbMbod_AlmModOrigen.setInternalname( sPrefix+"MBOD_ALMMODORIGEN" );
      edtMbod_AlmOrigenCodigo_Internalname = sPrefix+"MBOD_ALMORIGENCODIGO" ;
      edtMbod_BodOrigenCodigo_Internalname = sPrefix+"MBOD_BODORIGENCODIGO" ;
      edtMbod_BodOrigenDescripcion_Internalname = sPrefix+"MBOD_BODORIGENDESCRIPCION" ;
      cmbMbod_AlmModDestino.setInternalname( sPrefix+"MBOD_ALMMODDESTINO" );
      edtMbod_AlmDestinoCodigo_Internalname = sPrefix+"MBOD_ALMDESTINOCODIGO" ;
      edtMbod_BodDestinoCodigo_Internalname = sPrefix+"MBOD_BODDESTINOCODIGO" ;
      edtMbod_BodDestinoDescripcion_Internalname = sPrefix+"MBOD_BODDESTINODESCRIPCION" ;
      cmbMbod_Estado.setInternalname( sPrefix+"MBOD_ESTADO" );
      edtMbod_FechaCrea_Internalname = sPrefix+"MBOD_FECHACREA" ;
      edtMbod_UsuarioCrea_Internalname = sPrefix+"MBOD_USUARIOCREA" ;
      edtMbod_FechaModifica_Internalname = sPrefix+"MBOD_FECHAMODIFICA" ;
      edtMbod_UsuarioModifica_Internalname = sPrefix+"MBOD_USUARIOMODIFICA" ;
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
      edtMbod_UsuarioModifica_Jsonclick = "" ;
      edtMbod_UsuarioModifica_Enabled = 0 ;
      edtMbod_FechaModifica_Jsonclick = "" ;
      edtMbod_FechaModifica_Enabled = 0 ;
      edtMbod_UsuarioCrea_Jsonclick = "" ;
      edtMbod_UsuarioCrea_Enabled = 0 ;
      edtMbod_FechaCrea_Jsonclick = "" ;
      edtMbod_FechaCrea_Enabled = 0 ;
      cmbMbod_Estado.setJsonclick( "" );
      cmbMbod_Estado.setEnabled( 0 );
      edtMbod_BodDestinoDescripcion_Jsonclick = "" ;
      edtMbod_BodDestinoDescripcion_Enabled = 0 ;
      edtMbod_BodDestinoCodigo_Jsonclick = "" ;
      edtMbod_BodDestinoCodigo_Enabled = 0 ;
      edtMbod_AlmDestinoCodigo_Jsonclick = "" ;
      edtMbod_AlmDestinoCodigo_Enabled = 0 ;
      cmbMbod_AlmModDestino.setJsonclick( "" );
      cmbMbod_AlmModDestino.setEnabled( 0 );
      edtMbod_BodOrigenDescripcion_Jsonclick = "" ;
      edtMbod_BodOrigenDescripcion_Enabled = 0 ;
      edtMbod_BodOrigenCodigo_Jsonclick = "" ;
      edtMbod_BodOrigenCodigo_Enabled = 0 ;
      edtMbod_AlmOrigenCodigo_Jsonclick = "" ;
      edtMbod_AlmOrigenCodigo_Enabled = 0 ;
      cmbMbod_AlmModOrigen.setJsonclick( "" );
      cmbMbod_AlmModOrigen.setEnabled( 0 );
      edtMbod_CentroCostoDescrip_Jsonclick = "" ;
      edtMbod_CentroCostoDescrip_Enabled = 0 ;
      edtMbod_CentCostoCodigo_Jsonclick = "" ;
      edtMbod_CentCostoCodigo_Enabled = 0 ;
      edtMbod_CentCostoId_Jsonclick = "" ;
      edtMbod_CentCostoId_Enabled = 0 ;
      edtMbod_RegionDescripcion_Jsonclick = "" ;
      edtMbod_RegionDescripcion_Enabled = 0 ;
      edtMbod_RegionCodigo_Jsonclick = "" ;
      edtMbod_RegionCodigo_Enabled = 0 ;
      edtMbod_RegionId_Jsonclick = "" ;
      edtMbod_RegionId_Enabled = 0 ;
      edtMbod_TipoElementoDesc_Jsonclick = "" ;
      edtMbod_TipoElementoDesc_Enabled = 0 ;
      edtMbod_TipoElementoCod_Jsonclick = "" ;
      edtMbod_TipoElementoCod_Enabled = 0 ;
      edtMbod_TipoMovDescrip_Jsonclick = "" ;
      edtMbod_TipoMovDescrip_Enabled = 0 ;
      edtMbod_TipoMovCodigo_Jsonclick = "" ;
      edtMbod_TipoMovCodigo_Enabled = 0 ;
      edtMbod_Id_Jsonclick = "" ;
      edtMbod_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11131',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12131',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      pr_default.close(1);
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
      A61Mbod_TipoMovCodigo = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A368Mbod_AlmModDestino = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      A434Mbod_Estado = "" ;
      A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A359Mbod_UsuarioCrea = "" ;
      A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A361Mbod_UsuarioModifica = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A428Mbod_TipoMovDescrip = "" ;
      A432Mbod_TipoElementoDesc = "" ;
      A427Mbod_RegionDescripcion = "" ;
      A429Mbod_CentCostoCodigo = "" ;
      A430Mbod_CentroCostoDescrip = "" ;
      A341Mbod_BodOrigenDescripcion = "" ;
      A347Mbod_BodDestinoDescripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Pgmname = "" ;
      scmdbuf = "" ;
      H00132_A60Mbod_Id = new long[1] ;
      H00132_A361Mbod_UsuarioModifica = new String[] {""} ;
      H00132_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00132_A359Mbod_UsuarioCrea = new String[] {""} ;
      H00132_A433Mbod_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00132_A434Mbod_Estado = new String[] {""} ;
      H00132_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      H00132_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      H00132_A368Mbod_AlmModDestino = new String[] {""} ;
      H00132_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      H00132_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      H00132_A364Mbod_AlmModOrigen = new String[] {""} ;
      H00132_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      H00132_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      H00132_A429Mbod_CentCostoCodigo = new String[] {""} ;
      H00132_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      H00132_A63Mbod_CentCostoId = new long[1] ;
      H00132_A427Mbod_RegionDescripcion = new String[] {""} ;
      H00132_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      H00132_A426Mbod_RegionCodigo = new short[1] ;
      H00132_n426Mbod_RegionCodigo = new boolean[] {false} ;
      H00132_A62Mbod_RegionId = new long[1] ;
      H00132_A432Mbod_TipoElementoDesc = new String[] {""} ;
      H00132_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      H00132_A431Mbod_TipoElementoCod = new long[1] ;
      H00132_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      H00132_A428Mbod_TipoMovDescrip = new String[] {""} ;
      H00132_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      H00132_A61Mbod_TipoMovCodigo = new String[] {""} ;
      H00133_A31Bode_Codigo = new String[] {""} ;
      H00134_A31Bode_Codigo = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA60Mbod_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_restriccionesgeneral__default(),
         new Object[] {
             new Object[] {
            H00132_A60Mbod_Id, H00132_A361Mbod_UsuarioModifica, H00132_A362Mbod_FechaModifica, H00132_A359Mbod_UsuarioCrea, H00132_A433Mbod_FechaCrea, H00132_A434Mbod_Estado, H00132_A65Mbod_BodDestinoCodigo, H00132_A345Mbod_AlmDestinoCodigo, H00132_A368Mbod_AlmModDestino, H00132_A64Mbod_BodOrigenCodigo,
            H00132_A342Mbod_AlmOrigenCodigo, H00132_A364Mbod_AlmModOrigen, H00132_A430Mbod_CentroCostoDescrip, H00132_n430Mbod_CentroCostoDescrip, H00132_A429Mbod_CentCostoCodigo, H00132_n429Mbod_CentCostoCodigo, H00132_A63Mbod_CentCostoId, H00132_A427Mbod_RegionDescripcion, H00132_n427Mbod_RegionDescripcion, H00132_A426Mbod_RegionCodigo,
            H00132_n426Mbod_RegionCodigo, H00132_A62Mbod_RegionId, H00132_A432Mbod_TipoElementoDesc, H00132_n432Mbod_TipoElementoDesc, H00132_A431Mbod_TipoElementoCod, H00132_n431Mbod_TipoElementoCod, H00132_A428Mbod_TipoMovDescrip, H00132_n428Mbod_TipoMovDescrip, H00132_A61Mbod_TipoMovCodigo
            }
            , new Object[] {
            H00133_A31Bode_Codigo
            }
            , new Object[] {
            H00134_A31Bode_Codigo
            }
         }
      );
      AV14Pgmname = "ALM_RESTRICCIONESGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_RESTRICCIONESGeneral" ;
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
   private short A426Mbod_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtMbod_Id_Enabled ;
   private int edtMbod_TipoMovCodigo_Enabled ;
   private int edtMbod_TipoMovDescrip_Enabled ;
   private int edtMbod_TipoElementoCod_Enabled ;
   private int edtMbod_TipoElementoDesc_Enabled ;
   private int edtMbod_RegionId_Enabled ;
   private int edtMbod_RegionCodigo_Enabled ;
   private int edtMbod_RegionDescripcion_Enabled ;
   private int edtMbod_CentCostoId_Enabled ;
   private int edtMbod_CentCostoCodigo_Enabled ;
   private int edtMbod_CentroCostoDescrip_Enabled ;
   private int edtMbod_AlmOrigenCodigo_Enabled ;
   private int edtMbod_BodOrigenCodigo_Enabled ;
   private int edtMbod_BodOrigenDescripcion_Enabled ;
   private int edtMbod_AlmDestinoCodigo_Enabled ;
   private int edtMbod_BodDestinoCodigo_Enabled ;
   private int edtMbod_BodDestinoDescripcion_Enabled ;
   private int edtMbod_FechaCrea_Enabled ;
   private int edtMbod_UsuarioCrea_Enabled ;
   private int edtMbod_FechaModifica_Enabled ;
   private int edtMbod_UsuarioModifica_Enabled ;
   private int idxLst ;
   private long wcpOA60Mbod_Id ;
   private long A60Mbod_Id ;
   private long A62Mbod_RegionId ;
   private long A63Mbod_CentCostoId ;
   private long A431Mbod_TipoElementoCod ;
   private long AV7Mbod_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A434Mbod_Estado ;
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
   private String edtMbod_Id_Internalname ;
   private String edtMbod_Id_Jsonclick ;
   private String edtMbod_TipoMovCodigo_Internalname ;
   private String edtMbod_TipoMovCodigo_Jsonclick ;
   private String edtMbod_TipoMovDescrip_Internalname ;
   private String edtMbod_TipoMovDescrip_Jsonclick ;
   private String edtMbod_TipoElementoCod_Internalname ;
   private String edtMbod_TipoElementoCod_Jsonclick ;
   private String edtMbod_TipoElementoDesc_Internalname ;
   private String edtMbod_TipoElementoDesc_Jsonclick ;
   private String edtMbod_RegionId_Internalname ;
   private String edtMbod_RegionId_Jsonclick ;
   private String edtMbod_RegionCodigo_Internalname ;
   private String edtMbod_RegionCodigo_Jsonclick ;
   private String edtMbod_RegionDescripcion_Internalname ;
   private String edtMbod_RegionDescripcion_Jsonclick ;
   private String edtMbod_CentCostoId_Internalname ;
   private String edtMbod_CentCostoId_Jsonclick ;
   private String edtMbod_CentCostoCodigo_Internalname ;
   private String edtMbod_CentCostoCodigo_Jsonclick ;
   private String edtMbod_CentroCostoDescrip_Internalname ;
   private String edtMbod_CentroCostoDescrip_Jsonclick ;
   private String edtMbod_AlmOrigenCodigo_Internalname ;
   private String edtMbod_AlmOrigenCodigo_Jsonclick ;
   private String edtMbod_BodOrigenCodigo_Internalname ;
   private String edtMbod_BodOrigenCodigo_Jsonclick ;
   private String edtMbod_BodOrigenDescripcion_Internalname ;
   private String edtMbod_BodOrigenDescripcion_Jsonclick ;
   private String edtMbod_AlmDestinoCodigo_Internalname ;
   private String edtMbod_AlmDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoDescripcion_Internalname ;
   private String edtMbod_BodDestinoDescripcion_Jsonclick ;
   private String edtMbod_FechaCrea_Internalname ;
   private String edtMbod_FechaCrea_Jsonclick ;
   private String edtMbod_UsuarioCrea_Internalname ;
   private String edtMbod_UsuarioCrea_Jsonclick ;
   private String edtMbod_FechaModifica_Internalname ;
   private String edtMbod_FechaModifica_Jsonclick ;
   private String edtMbod_UsuarioModifica_Internalname ;
   private String edtMbod_UsuarioModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA60Mbod_Id ;
   private java.util.Date A433Mbod_FechaCrea ;
   private java.util.Date A362Mbod_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n430Mbod_CentroCostoDescrip ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n427Mbod_RegionDescripcion ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n432Mbod_TipoElementoDesc ;
   private boolean n431Mbod_TipoElementoCod ;
   private boolean n428Mbod_TipoMovDescrip ;
   private boolean returnInSub ;
   private String A61Mbod_TipoMovCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A368Mbod_AlmModDestino ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String A359Mbod_UsuarioCrea ;
   private String A361Mbod_UsuarioModifica ;
   private String A428Mbod_TipoMovDescrip ;
   private String A432Mbod_TipoElementoDesc ;
   private String A427Mbod_RegionDescripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private String A430Mbod_CentroCostoDescrip ;
   private String A341Mbod_BodOrigenDescripcion ;
   private String A347Mbod_BodDestinoDescripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbMbod_AlmModOrigen ;
   private HTMLChoice cmbMbod_AlmModDestino ;
   private HTMLChoice cmbMbod_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H00132_A60Mbod_Id ;
   private String[] H00132_A361Mbod_UsuarioModifica ;
   private java.util.Date[] H00132_A362Mbod_FechaModifica ;
   private String[] H00132_A359Mbod_UsuarioCrea ;
   private java.util.Date[] H00132_A433Mbod_FechaCrea ;
   private String[] H00132_A434Mbod_Estado ;
   private String[] H00132_A65Mbod_BodDestinoCodigo ;
   private String[] H00132_A345Mbod_AlmDestinoCodigo ;
   private String[] H00132_A368Mbod_AlmModDestino ;
   private String[] H00132_A64Mbod_BodOrigenCodigo ;
   private String[] H00132_A342Mbod_AlmOrigenCodigo ;
   private String[] H00132_A364Mbod_AlmModOrigen ;
   private String[] H00132_A430Mbod_CentroCostoDescrip ;
   private boolean[] H00132_n430Mbod_CentroCostoDescrip ;
   private String[] H00132_A429Mbod_CentCostoCodigo ;
   private boolean[] H00132_n429Mbod_CentCostoCodigo ;
   private long[] H00132_A63Mbod_CentCostoId ;
   private String[] H00132_A427Mbod_RegionDescripcion ;
   private boolean[] H00132_n427Mbod_RegionDescripcion ;
   private short[] H00132_A426Mbod_RegionCodigo ;
   private boolean[] H00132_n426Mbod_RegionCodigo ;
   private long[] H00132_A62Mbod_RegionId ;
   private String[] H00132_A432Mbod_TipoElementoDesc ;
   private boolean[] H00132_n432Mbod_TipoElementoDesc ;
   private long[] H00132_A431Mbod_TipoElementoCod ;
   private boolean[] H00132_n431Mbod_TipoElementoCod ;
   private String[] H00132_A428Mbod_TipoMovDescrip ;
   private boolean[] H00132_n428Mbod_TipoMovDescrip ;
   private String[] H00132_A61Mbod_TipoMovCodigo ;
   private String[] H00133_A31Bode_Codigo ;
   private String[] H00134_A31Bode_Codigo ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_restriccionesgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00132", "SELECT T1.Mbod_Id, T1.Mbod_UsuarioModifica, T1.Mbod_FechaModifica, T1.Mbod_UsuarioCrea, T1.Mbod_FechaCrea, T1.Mbod_Estado, T1.Mbod_BodDestinoCodigo, T1.Mbod_AlmDestinoCodigo, T1.Mbod_AlmModDestino, T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T2.Cent_Descripcion AS Mbod_CentroCostoDescrip, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_CentCostoId AS Mbod_CentCostoId, T3.Regi_Descripcion AS Mbod_RegionDescripcion, T3.Regi_Cod AS Mbod_RegionCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T5.Tipo_Descripcion AS Mbod_TipoElementoDesc, T4.Tipo_Codigo AS Mbod_TipoElementoCod, T4.Tpmo_Descripcion AS Mbod_TipoMovDescrip, T1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo FROM ((((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T4 ON T4.Tpmo_Codigo = T1.Mbod_TipoMovCodigo) LEFT JOIN ALM_TIPO_ELEMENTO T5 ON T5.Tipo_Codigo = T4.Tipo_Codigo) WHERE T1.Mbod_Id = ? ORDER BY T1.Mbod_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00133", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00134", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(15) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(18) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(22) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

