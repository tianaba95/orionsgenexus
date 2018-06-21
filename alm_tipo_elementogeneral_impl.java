/*
               File: alm_tipo_elementogeneral_impl
        Description: ALM_TIPO_ELEMENTOGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:23.33
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

public final  class alm_tipo_elementogeneral_impl extends GXWebComponent
{
   public alm_tipo_elementogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_elementogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_elementogeneral_impl.class ));
   }

   public alm_tipo_elementogeneral_impl( int remoteHandle ,
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
      cmbTipo_Tipo = new HTMLChoice();
      cmbTipo_Estado = new HTMLChoice();
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
               A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A33Tipo_Codigo)});
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
         pa422( ) ;
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
         httpContext.writeValue( "ALM_TIPO_ELEMENTOGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414162335");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_elementogeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A33Tipo_Codigo,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( wcpOA33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A272Tipo_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A480Tipo_Tipo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A678Tipo_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A269Tipo_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A270Tipo_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_TIPO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A271Tipo_UsuarioModifica, "@!"))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm422( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("alm_tipo_elementogeneral.js", "?201861414162336");
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
      return "ALM_TIPO_ELEMENTOGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_TIPO_ELEMENTOGeneral" ;
   }

   public void wb420( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.alm_tipo_elementogeneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11421_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12421_client"+"'", TempTags, "", 2, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Cóndigo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Descripcion_Internalname, "Descripción", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_FechaModifica_Internalname, "Fecha Modificación", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTipo_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_FechaModifica_Internalname, localUtil.ttoc( A272Tipo_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A272Tipo_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTipo_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTipo_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTipo_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Tipo.getInternalname(), "Tipo", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Tipo, cmbTipo_Tipo.getInternalname(), GXutil.rtrim( A480Tipo_Tipo), 1, cmbTipo_Tipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Estado.getInternalname(), "Estado", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Estado, cmbTipo_Estado.getInternalname(), GXutil.rtrim( A678Tipo_Estado), 1, cmbTipo_Estado.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "ReadonlyAttribute", "", "", "", true, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         cmbTipo_Estado.setValue( GXutil.rtrim( A678Tipo_Estado) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbTipo_Estado.getInternalname(), "Values", cmbTipo_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_UsuarioCrea_Internalname, A269Tipo_UsuarioCrea, GXutil.rtrim( localUtil.format( A269Tipo_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_UsuarioCrea_Jsonclick, 0, "Attribute", "", "", "", edtTipo_UsuarioCrea_Visible, edtTipo_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTipo_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_FechaCrea_Internalname, localUtil.ttoc( A270Tipo_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A270Tipo_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_FechaCrea_Jsonclick, 0, "Attribute", "", "", "", edtTipo_FechaCrea_Visible, edtTipo_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTipo_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTipo_FechaCrea_Visible==0)||(edtTipo_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_UsuarioModifica_Internalname, "Usuario Modificación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_UsuarioModifica_Internalname, A271Tipo_UsuarioModifica, GXutil.rtrim( localUtil.format( A271Tipo_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", edtTipo_UsuarioModifica_Visible, edtTipo_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TIPO_ELEMENTOGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start422( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "ALM_TIPO_ELEMENTOGeneral", (short)(0)) ;
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
            strup420( ) ;
         }
      }
   }

   public void ws422( )
   {
      start422( ) ;
      evt422( ) ;
   }

   public void evt422( )
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
                              strup420( ) ;
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
                              strup420( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13422 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup420( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14422 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup420( ) ;
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
                              strup420( ) ;
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

   public void we422( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm422( ) ;
         }
      }
   }

   public void pa422( )
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
         cmbTipo_Tipo.setName( "TIPO_TIPO" );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A480Tipo_Tipo, ""))));
         }
         cmbTipo_Estado.setName( "TIPO_ESTADO" );
         cmbTipo_Estado.setWebtags( "" );
         cmbTipo_Estado.addItem("A", "Activo", (short)(0));
         cmbTipo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTipo_Estado.getItemCount() > 0 )
         {
            A678Tipo_Estado = cmbTipo_Estado.getValidValue(A678Tipo_Estado) ;
            n678Tipo_Estado = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A678Tipo_Estado", A678Tipo_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A678Tipo_Estado, ""))));
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
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A480Tipo_Tipo, ""))));
      }
      if ( cmbTipo_Estado.getItemCount() > 0 )
      {
         A678Tipo_Estado = cmbTipo_Estado.getValidValue(A678Tipo_Estado) ;
         n678Tipo_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A678Tipo_Estado", A678Tipo_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A678Tipo_Estado, ""))));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf422( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_ELEMENTOGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf422( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00422 */
         pr_default.execute(0, new Object[] {new Long(A33Tipo_Codigo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A271Tipo_UsuarioModifica = H00422_A271Tipo_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A271Tipo_UsuarioModifica", A271Tipo_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A271Tipo_UsuarioModifica, "@!"))));
            n271Tipo_UsuarioModifica = H00422_n271Tipo_UsuarioModifica[0] ;
            A270Tipo_FechaCrea = H00422_A270Tipo_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A270Tipo_FechaCrea", localUtil.ttoc( A270Tipo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A270Tipo_FechaCrea, "99/99/99 99:99")));
            n270Tipo_FechaCrea = H00422_n270Tipo_FechaCrea[0] ;
            A269Tipo_UsuarioCrea = H00422_A269Tipo_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A269Tipo_UsuarioCrea", A269Tipo_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A269Tipo_UsuarioCrea, "@!"))));
            n269Tipo_UsuarioCrea = H00422_n269Tipo_UsuarioCrea[0] ;
            A678Tipo_Estado = H00422_A678Tipo_Estado[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A678Tipo_Estado", A678Tipo_Estado);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A678Tipo_Estado, ""))));
            n678Tipo_Estado = H00422_n678Tipo_Estado[0] ;
            A480Tipo_Tipo = H00422_A480Tipo_Tipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A480Tipo_Tipo, ""))));
            A272Tipo_FechaModifica = H00422_A272Tipo_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272Tipo_FechaModifica", localUtil.ttoc( A272Tipo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A272Tipo_FechaModifica, "99/99/99 99:99")));
            n272Tipo_FechaModifica = H00422_n272Tipo_FechaModifica[0] ;
            A253Tipo_Descripcion = H00422_A253Tipo_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!"))));
            /* Execute user event: Load */
            e14422 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb420( ) ;
      }
   }

   public void strup420( )
   {
      /* Before Start, stand alone formulas. */
      AV14Pgmname = "ALM_TIPO_ELEMENTOGeneral" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13422 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_DESCRIPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!"))));
         A272Tipo_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTipo_FechaModifica_Internalname), 0) ;
         n272Tipo_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A272Tipo_FechaModifica", localUtil.ttoc( A272Tipo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A272Tipo_FechaModifica, "99/99/99 99:99")));
         cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
         A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A480Tipo_Tipo", A480Tipo_Tipo);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_TIPO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A480Tipo_Tipo, ""))));
         cmbTipo_Estado.setValue( httpContext.cgiGet( cmbTipo_Estado.getInternalname()) );
         A678Tipo_Estado = httpContext.cgiGet( cmbTipo_Estado.getInternalname()) ;
         n678Tipo_Estado = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A678Tipo_Estado", A678Tipo_Estado);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_ESTADO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A678Tipo_Estado, ""))));
         A269Tipo_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTipo_UsuarioCrea_Internalname)) ;
         n269Tipo_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A269Tipo_UsuarioCrea", A269Tipo_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A269Tipo_UsuarioCrea, "@!"))));
         A270Tipo_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTipo_FechaCrea_Internalname), 0) ;
         n270Tipo_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A270Tipo_FechaCrea", localUtil.ttoc( A270Tipo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A270Tipo_FechaCrea, "99/99/99 99:99")));
         A271Tipo_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTipo_UsuarioModifica_Internalname)) ;
         n271Tipo_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A271Tipo_UsuarioModifica", A271Tipo_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_TIPO_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A271Tipo_UsuarioModifica, "@!"))));
         /* Read saved values. */
         wcpOA33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA33Tipo_Codigo"), ",", ".") ;
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
      e13422 ();
      if (returnInSub) return;
   }

   public void e13422( )
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

   protected void e14422( )
   {
      /* Load Routine */
      edtTipo_UsuarioCrea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipo_UsuarioCrea_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTipo_UsuarioCrea_Visible, 5, 0)), true);
      edtTipo_FechaCrea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipo_FechaCrea_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTipo_FechaCrea_Visible, 5, 0)), true);
      edtTipo_UsuarioModifica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipo_UsuarioModifica_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTipo_UsuarioModifica_Visible, 5, 0)), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV8TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV14Pgmname );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV8TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TIPO_ELEMENTO" );
      AV9TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Tipo_Codigo" );
      AV9TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Tipo_Codigo, 18, 0) );
      AV8TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV10Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A33Tipo_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
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
      pa422( ) ;
      ws422( ) ;
      we422( ) ;
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
      sCtrlA33Tipo_Codigo = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa422( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "alm_tipo_elementogeneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa422( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A33Tipo_Codigo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
      wcpOA33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA33Tipo_Codigo"), ",", ".") ;
      if ( ! GetJustCreated( ) && ( ( A33Tipo_Codigo != wcpOA33Tipo_Codigo ) ) )
      {
         setjustcreated();
      }
      wcpOA33Tipo_Codigo = A33Tipo_Codigo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA33Tipo_Codigo = httpContext.cgiGet( sPrefix+"A33Tipo_Codigo_CTRL") ;
      if ( GXutil.len( sCtrlA33Tipo_Codigo) > 0 )
      {
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( sCtrlA33Tipo_Codigo), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
      else
      {
         A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( sPrefix+"A33Tipo_Codigo_PARM"), ",", ".") ;
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
      pa422( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws422( ) ;
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
      ws422( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A33Tipo_Codigo_PARM", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA33Tipo_Codigo)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A33Tipo_Codigo_CTRL", GXutil.rtrim( sCtrlA33Tipo_Codigo));
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
      we422( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414162377");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("alm_tipo_elementogeneral.js", "?201861414162377");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtTipo_Codigo_Internalname = sPrefix+"TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = sPrefix+"TIPO_DESCRIPCION" ;
      edtTipo_FechaModifica_Internalname = sPrefix+"TIPO_FECHAMODIFICA" ;
      cmbTipo_Tipo.setInternalname( sPrefix+"TIPO_TIPO" );
      cmbTipo_Estado.setInternalname( sPrefix+"TIPO_ESTADO" );
      divAttributestable_Internalname = sPrefix+"ATTRIBUTESTABLE" ;
      edtTipo_UsuarioCrea_Internalname = sPrefix+"TIPO_USUARIOCREA" ;
      edtTipo_FechaCrea_Internalname = sPrefix+"TIPO_FECHACREA" ;
      edtTipo_UsuarioModifica_Internalname = sPrefix+"TIPO_USUARIOMODIFICA" ;
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
      edtTipo_UsuarioModifica_Jsonclick = "" ;
      edtTipo_UsuarioModifica_Enabled = 0 ;
      edtTipo_UsuarioModifica_Visible = 1 ;
      edtTipo_FechaCrea_Jsonclick = "" ;
      edtTipo_FechaCrea_Enabled = 0 ;
      edtTipo_FechaCrea_Visible = 1 ;
      edtTipo_UsuarioCrea_Jsonclick = "" ;
      edtTipo_UsuarioCrea_Enabled = 0 ;
      edtTipo_UsuarioCrea_Visible = 1 ;
      cmbTipo_Estado.setJsonclick( "" );
      cmbTipo_Estado.setEnabled( 0 );
      cmbTipo_Tipo.setJsonclick( "" );
      cmbTipo_Tipo.setEnabled( 0 );
      edtTipo_FechaModifica_Jsonclick = "" ;
      edtTipo_FechaModifica_Enabled = 0 ;
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Enabled = 0 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11421',iparms:[{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12421',iparms:[{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      A253Tipo_Descripcion = "" ;
      A272Tipo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A480Tipo_Tipo = "" ;
      A678Tipo_Estado = "" ;
      A269Tipo_UsuarioCrea = "" ;
      A270Tipo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A271Tipo_UsuarioModifica = "" ;
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
      H00422_A33Tipo_Codigo = new long[1] ;
      H00422_A271Tipo_UsuarioModifica = new String[] {""} ;
      H00422_n271Tipo_UsuarioModifica = new boolean[] {false} ;
      H00422_A270Tipo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00422_n270Tipo_FechaCrea = new boolean[] {false} ;
      H00422_A269Tipo_UsuarioCrea = new String[] {""} ;
      H00422_n269Tipo_UsuarioCrea = new boolean[] {false} ;
      H00422_A678Tipo_Estado = new String[] {""} ;
      H00422_n678Tipo_Estado = new boolean[] {false} ;
      H00422_A480Tipo_Tipo = new String[] {""} ;
      H00422_A272Tipo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00422_n272Tipo_FechaModifica = new boolean[] {false} ;
      H00422_A253Tipo_Descripcion = new String[] {""} ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA33Tipo_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_elementogeneral__default(),
         new Object[] {
             new Object[] {
            H00422_A33Tipo_Codigo, H00422_A271Tipo_UsuarioModifica, H00422_n271Tipo_UsuarioModifica, H00422_A270Tipo_FechaCrea, H00422_n270Tipo_FechaCrea, H00422_A269Tipo_UsuarioCrea, H00422_n269Tipo_UsuarioCrea, H00422_A678Tipo_Estado, H00422_n678Tipo_Estado, H00422_A480Tipo_Tipo,
            H00422_A272Tipo_FechaModifica, H00422_n272Tipo_FechaModifica, H00422_A253Tipo_Descripcion
            }
         }
      );
      AV14Pgmname = "ALM_TIPO_ELEMENTOGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ALM_TIPO_ELEMENTOGeneral" ;
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
   private int edtTipo_Codigo_Enabled ;
   private int edtTipo_Descripcion_Enabled ;
   private int edtTipo_FechaModifica_Enabled ;
   private int edtTipo_UsuarioCrea_Visible ;
   private int edtTipo_UsuarioCrea_Enabled ;
   private int edtTipo_FechaCrea_Visible ;
   private int edtTipo_FechaCrea_Enabled ;
   private int edtTipo_UsuarioModifica_Visible ;
   private int edtTipo_UsuarioModifica_Enabled ;
   private int idxLst ;
   private long wcpOA33Tipo_Codigo ;
   private long A33Tipo_Codigo ;
   private long AV7Tipo_Codigo ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A480Tipo_Tipo ;
   private String A678Tipo_Estado ;
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
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtTipo_FechaModifica_Internalname ;
   private String edtTipo_FechaModifica_Jsonclick ;
   private String edtTipo_UsuarioCrea_Internalname ;
   private String edtTipo_UsuarioCrea_Jsonclick ;
   private String edtTipo_FechaCrea_Internalname ;
   private String edtTipo_FechaCrea_Jsonclick ;
   private String edtTipo_UsuarioModifica_Internalname ;
   private String edtTipo_UsuarioModifica_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV14Pgmname ;
   private String scmdbuf ;
   private String sCtrlA33Tipo_Codigo ;
   private java.util.Date A272Tipo_FechaModifica ;
   private java.util.Date A270Tipo_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n678Tipo_Estado ;
   private boolean n271Tipo_UsuarioModifica ;
   private boolean n270Tipo_FechaCrea ;
   private boolean n269Tipo_UsuarioCrea ;
   private boolean n272Tipo_FechaModifica ;
   private boolean returnInSub ;
   private String A253Tipo_Descripcion ;
   private String A269Tipo_UsuarioCrea ;
   private String A271Tipo_UsuarioModifica ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTipo_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H00422_A33Tipo_Codigo ;
   private String[] H00422_A271Tipo_UsuarioModifica ;
   private boolean[] H00422_n271Tipo_UsuarioModifica ;
   private java.util.Date[] H00422_A270Tipo_FechaCrea ;
   private boolean[] H00422_n270Tipo_FechaCrea ;
   private String[] H00422_A269Tipo_UsuarioCrea ;
   private boolean[] H00422_n269Tipo_UsuarioCrea ;
   private String[] H00422_A678Tipo_Estado ;
   private boolean[] H00422_n678Tipo_Estado ;
   private String[] H00422_A480Tipo_Tipo ;
   private java.util.Date[] H00422_A272Tipo_FechaModifica ;
   private boolean[] H00422_n272Tipo_FechaModifica ;
   private String[] H00422_A253Tipo_Descripcion ;
   private com.genexus.webpanels.WebSession AV10Session ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV9TrnContextAtt ;
}

final  class alm_tipo_elementogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00422", "SELECT Tipo_Codigo, Tipo_UsuarioModifica, Tipo_FechaCrea, Tipo_UsuarioCrea, Tipo_Estado, Tipo_Tipo, Tipo_FechaModifica, Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ORDER BY Tipo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1) ;
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
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

