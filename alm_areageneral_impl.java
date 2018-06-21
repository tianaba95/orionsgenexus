/*
               File: alm_areageneral_impl
        Description: ALM_AREAGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:21.18
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

public final  class alm_areageneral_impl extends GXWebComponent
{
   public alm_areageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_areageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_areageneral_impl.class ));
   }

   public alm_areageneral_impl( int remoteHandle ,
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
      cmbBArea_Estado = new HTMLChoice();
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
               A32BArea_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A32BArea_Codigo,new Long(A1Cent_Id)});
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
         pa162( ) ;
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
         httpContext.writeValue( "ALM_AREAGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414142121");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_areageneral") + "?" + GXutil.URLEncode(GXutil.rtrim(A32BArea_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA32BArea_Codigo", wcpOA32BArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA1Cent_Id", GXutil.ltrim( localUtil.ntoc( wcpOA1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A610BArea_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A611BArea_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_USUARIO_CREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A612BArea_Usuario_Crea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_FECHA_CREA", getSecureSignedToken( sPrefix, localUtil.format( A613BArea_Fecha_Crea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A614BArea_Usuario_Modifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BAREA_FECHA", getSecureSignedToken( sPrefix, A615BArea_Fecha));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm162( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_areageneral.js", "?201861414142124");
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
      return "ALM_AREAGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_AREAGeneral" ;
   }

   public void wb160( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_areageneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11161_client"+"'", TempTags, "", 2, "HLP_ALM_AREAGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12161_client"+"'", TempTags, "", 2, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Codigo_Internalname, "BArea_Codigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Codigo_Internalname, A32BArea_Codigo, GXutil.rtrim( localUtil.format( A32BArea_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Descripcion_Internalname, "BArea_Descripcion", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Descripcion_Internalname, A610BArea_Descripcion, GXutil.rtrim( localUtil.format( A610BArea_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Descripcion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbBArea_Estado.getInternalname(), "BArea_Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBArea_Estado, cmbBArea_Estado.getInternalname(), GXutil.rtrim( A611BArea_Estado), 1, cmbBArea_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbBArea_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_AREAGeneral.htm");
         cmbBArea_Estado.setValue( GXutil.rtrim( A611BArea_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBArea_Estado.getInternalname(), "Values", cmbBArea_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Usuario_Crea_Internalname, "BArea_Usuario_Crea", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Usuario_Crea_Internalname, A612BArea_Usuario_Crea, GXutil.rtrim( localUtil.format( A612BArea_Usuario_Crea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Usuario_Crea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Usuario_Crea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Fecha_Crea_Internalname, "BArea_Fecha_Crea", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtBArea_Fecha_Crea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Fecha_Crea_Internalname, localUtil.ttoc( A613BArea_Fecha_Crea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A613BArea_Fecha_Crea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Fecha_Crea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Fecha_Crea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_AREAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBArea_Fecha_Crea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBArea_Fecha_Crea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Usuario_Modifica_Internalname, "BArea_Usuario_Modifica", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Usuario_Modifica_Internalname, A614BArea_Usuario_Modifica, GXutil.rtrim( localUtil.format( A614BArea_Usuario_Modifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Usuario_Modifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Usuario_Modifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Fecha_Internalname, "BArea_Fecha", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtBArea_Fecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Fecha_Internalname, localUtil.format(A615BArea_Fecha, "99/99/99"), localUtil.format( A615BArea_Fecha, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Fecha_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtBArea_Fecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_AREAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBArea_Fecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBArea_Fecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Identificador Centro de Costo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREAGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtCent_Descripcion_Link, "", "", "", edtCent_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_AREAGeneral.htm");
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

   public void start162( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_AREAGeneral", (short)(0)) ;
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
            strup160( ) ;
         }
      }
   }

   public void ws162( )
   {
      start162( ) ;
      evt162( ) ;
   }

   public void evt162( )
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
                              strup160( ) ;
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
                              strup160( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13162 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup160( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14162 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup160( ) ;
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
                              strup160( ) ;
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

   public void we162( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm162( ) ;
         }
      }
   }

   public void pa162( )
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
         cmbBArea_Estado.setName( "BAREA_ESTADO" );
         cmbBArea_Estado.setWebtags( "" );
         cmbBArea_Estado.addItem("A", "Activo", (short)(0));
         cmbBArea_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBArea_Estado.getItemCount() > 0 )
         {
            A611BArea_Estado = cmbBArea_Estado.getValidValue(A611BArea_Estado) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611BArea_Estado", A611BArea_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A611BArea_Estado, ""))));
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
      if ( cmbBArea_Estado.getItemCount() > 0 )
      {
         A611BArea_Estado = cmbBArea_Estado.getValidValue(A611BArea_Estado) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611BArea_Estado", A611BArea_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A611BArea_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf162( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_AREAGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf162( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00162 */
         pr_default.execute(0, new Object[] {A32BArea_Codigo, new Long(A1Cent_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A615BArea_Fecha = H00162_A615BArea_Fecha[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_FECHA", getSecureSignedToken( sPrefix, A615BArea_Fecha));
            n615BArea_Fecha = H00162_n615BArea_Fecha[0] ;
            A614BArea_Usuario_Modifica = H00162_A614BArea_Usuario_Modifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A614BArea_Usuario_Modifica, "@!"))));
            n614BArea_Usuario_Modifica = H00162_n614BArea_Usuario_Modifica[0] ;
            A613BArea_Fecha_Crea = H00162_A613BArea_Fecha_Crea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_FECHA_CREA", getSecureSignedToken( sPrefix, localUtil.format( A613BArea_Fecha_Crea, "99/99/99 99:99")));
            n613BArea_Fecha_Crea = H00162_n613BArea_Fecha_Crea[0] ;
            A612BArea_Usuario_Crea = H00162_A612BArea_Usuario_Crea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_USUARIO_CREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A612BArea_Usuario_Crea, "@!"))));
            n612BArea_Usuario_Crea = H00162_n612BArea_Usuario_Crea[0] ;
            A611BArea_Estado = H00162_A611BArea_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611BArea_Estado", A611BArea_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A611BArea_Estado, ""))));
            A610BArea_Descripcion = H00162_A610BArea_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A610BArea_Descripcion", A610BArea_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A610BArea_Descripcion, ""))));
            /* Execute user event: Load */
            e14162 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb160( ) ;
      }
   }

   public void strup160( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "ALM_AREAGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00163 */
      pr_default.execute(1, new Object[] {new Long(A1Cent_Id)});
      A4Cent_Descripcion = H00163_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A3Cent_Codigo = H00163_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
      pr_default.close(1);
      pr_default.close(1);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A610BArea_Descripcion = httpContext.cgiGet( edtBArea_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A610BArea_Descripcion", A610BArea_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A610BArea_Descripcion, ""))));
         cmbBArea_Estado.setValue( httpContext.cgiGet( cmbBArea_Estado.getInternalname()) );
         A611BArea_Estado = httpContext.cgiGet( cmbBArea_Estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A611BArea_Estado", A611BArea_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A611BArea_Estado, ""))));
         A612BArea_Usuario_Crea = GXutil.upper( httpContext.cgiGet( edtBArea_Usuario_Crea_Internalname)) ;
         n612BArea_Usuario_Crea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_USUARIO_CREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A612BArea_Usuario_Crea, "@!"))));
         A613BArea_Fecha_Crea = localUtil.ctot( httpContext.cgiGet( edtBArea_Fecha_Crea_Internalname), 0) ;
         n613BArea_Fecha_Crea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_FECHA_CREA", getSecureSignedToken( sPrefix, localUtil.format( A613BArea_Fecha_Crea, "99/99/99 99:99")));
         A614BArea_Usuario_Modifica = GXutil.upper( httpContext.cgiGet( edtBArea_Usuario_Modifica_Internalname)) ;
         n614BArea_Usuario_Modifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_USUARIO_MODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A614BArea_Usuario_Modifica, "@!"))));
         A615BArea_Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBArea_Fecha_Internalname), 0)) ;
         n615BArea_Fecha = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_BAREA_FECHA", getSecureSignedToken( sPrefix, A615BArea_Fecha));
         A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4Cent_Descripcion", A4Cent_Descripcion);
         /* Read saved values. */
         wcpOA32BArea_Codigo = httpContext.cgiGet( sPrefix+"wcpOA32BArea_Codigo") ;
         wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
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
      e13162 ();
      if (returnInSub) return;
   }

   public void e13162( )
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

   protected void e14162( )
   {
      /* Load Routine */
      edtCent_Descripcion_Link = formatLink("com.orions2.viewgen_centrocosto") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCent_Descripcion_Internalname, "Link", edtCent_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV9TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_AREA" );
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "BArea_Codigo" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( AV7BArea_Codigo );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Cent_Id" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Cent_Id, 11, 0) );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV11Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A32BArea_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
      A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
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
      pa162( ) ;
      ws162( ) ;
      we162( ) ;
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
      sCtrlA32BArea_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA1Cent_Id = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa162( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_areageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa162( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A32BArea_Codigo = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
         A1Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      wcpOA32BArea_Codigo = httpContext.cgiGet( sPrefix+"wcpOA32BArea_Codigo") ;
      wcpOA1Cent_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA1Cent_Id"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A32BArea_Codigo, wcpOA32BArea_Codigo) != 0 ) || ( A1Cent_Id != wcpOA1Cent_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA32BArea_Codigo = A32BArea_Codigo ;
      wcpOA1Cent_Id = A1Cent_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA32BArea_Codigo = httpContext.cgiGet( sPrefix+"A32BArea_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA32BArea_Codigo) > 0 )
      {
         A32BArea_Codigo = httpContext.cgiGet( sCtrlA32BArea_Codigo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A32BArea_Codigo", A32BArea_Codigo);
      }
      else
      {
         A32BArea_Codigo = httpContext.cgiGet( sPrefix+"A32BArea_Codigo_PARM") ;
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
      pa162( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws162( ) ;
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
      ws162( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A32BArea_Codigo_PARM", A32BArea_Codigo);
      if ( GXutil.len( GXutil.rtrim( sCtrlA32BArea_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A32BArea_Codigo_CTRL", GXutil.rtrim( sCtrlA32BArea_Codigo));
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
      we162( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414142173");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_areageneral.js", "?201861414142173");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtBArea_Codigo_Internalname = sPrefix+"BAREA_CODIGO" ;
      edtBArea_Descripcion_Internalname = sPrefix+"BAREA_DESCRIPCION" ;
      cmbBArea_Estado.setInternalname( sPrefix+"BAREA_ESTADO" );
      edtBArea_Usuario_Crea_Internalname = sPrefix+"BAREA_USUARIO_CREA" ;
      edtBArea_Fecha_Crea_Internalname = sPrefix+"BAREA_FECHA_CREA" ;
      edtBArea_Usuario_Modifica_Internalname = sPrefix+"BAREA_USUARIO_MODIFICA" ;
      edtBArea_Fecha_Internalname = sPrefix+"BAREA_FECHA" ;
      edtCent_Id_Internalname = sPrefix+"CENT_ID" ;
      edtCent_Codigo_Internalname = sPrefix+"CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = sPrefix+"CENT_DESCRIPCION" ;
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
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Link = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
      edtBArea_Fecha_Jsonclick = "" ;
      edtBArea_Fecha_Enabled = 0 ;
      edtBArea_Usuario_Modifica_Jsonclick = "" ;
      edtBArea_Usuario_Modifica_Enabled = 0 ;
      edtBArea_Fecha_Crea_Jsonclick = "" ;
      edtBArea_Fecha_Crea_Enabled = 0 ;
      edtBArea_Usuario_Crea_Jsonclick = "" ;
      edtBArea_Usuario_Crea_Enabled = 0 ;
      cmbBArea_Estado.setJsonclick( "" );
      cmbBArea_Estado.setEnabled( 0 );
      edtBArea_Descripcion_Jsonclick = "" ;
      edtBArea_Descripcion_Enabled = 0 ;
      edtBArea_Codigo_Jsonclick = "" ;
      edtBArea_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11161',iparms:[{av:'A32BArea_Codigo',fld:'BAREA_CODIGO',pic:'',nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12161',iparms:[{av:'A32BArea_Codigo',fld:'BAREA_CODIGO',pic:'',nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      wcpOA32BArea_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A32BArea_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A610BArea_Descripcion = "" ;
      A611BArea_Estado = "" ;
      A612BArea_Usuario_Crea = "" ;
      A613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
      A614BArea_Usuario_Modifica = "" ;
      A615BArea_Fecha = GXutil.nullDate() ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H00162_A32BArea_Codigo = new String[] {""} ;
      H00162_A1Cent_Id = new long[1] ;
      H00162_A4Cent_Descripcion = new String[] {""} ;
      H00162_A3Cent_Codigo = new String[] {""} ;
      H00162_A615BArea_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H00162_n615BArea_Fecha = new boolean[] {false} ;
      H00162_A614BArea_Usuario_Modifica = new String[] {""} ;
      H00162_n614BArea_Usuario_Modifica = new boolean[] {false} ;
      H00162_A613BArea_Fecha_Crea = new java.util.Date[] {GXutil.nullDate()} ;
      H00162_n613BArea_Fecha_Crea = new boolean[] {false} ;
      H00162_A612BArea_Usuario_Crea = new String[] {""} ;
      H00162_n612BArea_Usuario_Crea = new boolean[] {false} ;
      H00162_A611BArea_Estado = new String[] {""} ;
      H00162_A610BArea_Descripcion = new String[] {""} ;
      H00163_A4Cent_Descripcion = new String[] {""} ;
      H00163_A3Cent_Codigo = new String[] {""} ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV7BArea_Codigo = "" ;
      AV11Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA32BArea_Codigo = "" ;
      sCtrlA1Cent_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_areageneral__default(),
         new Object[] {
             new Object[] {
            H00162_A32BArea_Codigo, H00162_A1Cent_Id, H00162_A4Cent_Descripcion, H00162_A3Cent_Codigo, H00162_A615BArea_Fecha, H00162_n615BArea_Fecha, H00162_A614BArea_Usuario_Modifica, H00162_n614BArea_Usuario_Modifica, H00162_A613BArea_Fecha_Crea, H00162_n613BArea_Fecha_Crea,
            H00162_A612BArea_Usuario_Crea, H00162_n612BArea_Usuario_Crea, H00162_A611BArea_Estado, H00162_A610BArea_Descripcion
            }
            , new Object[] {
            H00163_A4Cent_Descripcion, H00163_A3Cent_Codigo
            }
         }
      );
      AV15Pgmname = "ALM_AREAGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ALM_AREAGeneral" ;
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
   private int edtBArea_Codigo_Enabled ;
   private int edtBArea_Descripcion_Enabled ;
   private int edtBArea_Usuario_Crea_Enabled ;
   private int edtBArea_Fecha_Crea_Enabled ;
   private int edtBArea_Usuario_Modifica_Enabled ;
   private int edtBArea_Fecha_Enabled ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int idxLst ;
   private long wcpOA1Cent_Id ;
   private long A1Cent_Id ;
   private long AV8Cent_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A611BArea_Estado ;
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
   private String edtBArea_Codigo_Internalname ;
   private String edtBArea_Codigo_Jsonclick ;
   private String edtBArea_Descripcion_Internalname ;
   private String edtBArea_Descripcion_Jsonclick ;
   private String edtBArea_Usuario_Crea_Internalname ;
   private String edtBArea_Usuario_Crea_Jsonclick ;
   private String edtBArea_Fecha_Crea_Internalname ;
   private String edtBArea_Fecha_Crea_Jsonclick ;
   private String edtBArea_Usuario_Modifica_Internalname ;
   private String edtBArea_Usuario_Modifica_Jsonclick ;
   private String edtBArea_Fecha_Internalname ;
   private String edtBArea_Fecha_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Link ;
   private String edtCent_Descripcion_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlA32BArea_Codigo ;
   private String sCtrlA1Cent_Id ;
   private java.util.Date A613BArea_Fecha_Crea ;
   private java.util.Date A615BArea_Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n615BArea_Fecha ;
   private boolean n614BArea_Usuario_Modifica ;
   private boolean n613BArea_Fecha_Crea ;
   private boolean n612BArea_Usuario_Crea ;
   private boolean returnInSub ;
   private String wcpOA32BArea_Codigo ;
   private String A32BArea_Codigo ;
   private String A610BArea_Descripcion ;
   private String A612BArea_Usuario_Crea ;
   private String A614BArea_Usuario_Modifica ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String AV7BArea_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private HTMLChoice cmbBArea_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00162_A32BArea_Codigo ;
   private long[] H00162_A1Cent_Id ;
   private String[] H00162_A4Cent_Descripcion ;
   private String[] H00162_A3Cent_Codigo ;
   private java.util.Date[] H00162_A615BArea_Fecha ;
   private boolean[] H00162_n615BArea_Fecha ;
   private String[] H00162_A614BArea_Usuario_Modifica ;
   private boolean[] H00162_n614BArea_Usuario_Modifica ;
   private java.util.Date[] H00162_A613BArea_Fecha_Crea ;
   private boolean[] H00162_n613BArea_Fecha_Crea ;
   private String[] H00162_A612BArea_Usuario_Crea ;
   private boolean[] H00162_n612BArea_Usuario_Crea ;
   private String[] H00162_A611BArea_Estado ;
   private String[] H00162_A610BArea_Descripcion ;
   private String[] H00163_A4Cent_Descripcion ;
   private String[] H00163_A3Cent_Codigo ;
   private com.genexus.webpanels.WebSession AV11Session ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class alm_areageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00162", "SELECT T1.BArea_Codigo, T1.Cent_Id, T2.Cent_Descripcion, T2.Cent_Codigo, T1.BArea_Fecha, T1.BArea_Usuario_Modifica, T1.BArea_Fecha_Crea, T1.BArea_Usuario_Crea, T1.BArea_Estado, T1.BArea_Descripcion FROM (ALM_AREA T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) WHERE T1.BArea_Codigo = ? and T1.Cent_Id = ? ORDER BY T1.BArea_Codigo, T1.Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00163", "SELECT Cent_Descripcion, Cent_Codigo FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
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
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

