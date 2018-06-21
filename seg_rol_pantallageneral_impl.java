/*
               File: seg_rol_pantallageneral_impl
        Description: SEG_ROL_PANTALLAGeneral
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:3.92
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

public final  class seg_rol_pantallageneral_impl extends GXWebComponent
{
   public seg_rol_pantallageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_rol_pantallageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_rol_pantallageneral_impl.class ));
   }

   public seg_rol_pantallageneral_impl( int remoteHandle ,
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
               A21Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
               A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,new Long(A21Rol_Id),new Integer(A18Pant_Id)});
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
         pa362( ) ;
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
         httpContext.writeValue( "SEG_ROL_PANTALLAGeneral") ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416397");
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_rol_pantallageneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A21Rol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A18Pant_Id,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA21Rol_Id", GXutil.ltrim( localUtil.ntoc( wcpOA21Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA18Pant_Id", GXutil.ltrim( localUtil.ntoc( wcpOA18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ROLP_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ROLP_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ROLP_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ROLP_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm362( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("seg_rol_pantallageneral.js", "?20186141416399");
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
      return "SEG_ROL_PANTALLAGeneral" ;
   }

   public String getPgmdesc( )
   {
      return "SEG_ROL_PANTALLAGeneral" ;
   }

   public void wb360( )
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
            com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "com.orions2.seg_rol_pantallageneral");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", "Modificar", bttBtnupdate_Jsonclick, 7, "Modificar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11361_client"+"'", TempTags, "", 2, "HLP_SEG_ROL_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", "Eliminar", bttBtndelete_Jsonclick, 7, "Eliminar", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12361_client"+"'", TempTags, "", 2, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Id_Internalname, "Identificador del Rol", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")), ((edtRol_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRol_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Descripcion_Internalname, "Descripcion del Rol", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Descripcion_Internalname, A22Rol_Descripcion, GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtRol_Descripcion_Link, "", "", "", edtRol_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRol_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Id_Internalname, "Identificador Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")), ((edtPant_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_Id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Descripcion_Internalname, A19Pant_Descripcion, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPant_Descripcion_Link, "", "", "", edtPant_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtPant_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")), ((edtModu_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtModu_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Descripcion_Internalname, A17Modu_Descripcion, GXutil.rtrim( localUtil.format( A17Modu_Descripcion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtModu_Descripcion_Link, "", "", "", edtModu_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtModu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRolP_UsuarioCrea_Internalname, "Rol Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRolP_UsuarioCrea_Internalname, A215RolP_UsuarioCrea, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRolP_UsuarioCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRolP_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRolP_UsuarioModifica_Internalname, "Rol Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRolP_UsuarioModifica_Internalname, A217RolP_UsuarioModifica, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRolP_UsuarioModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRolP_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRolP_FechaModifica_Internalname, "Rol Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRolP_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRolP_FechaModifica_Internalname, localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRolP_FechaModifica_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRolP_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_ROL_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRolP_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRolP_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_ROL_PANTALLAGeneral.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRolP_FechaCrea_Internalname, "Rol Pantalla", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtRolP_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRolP_FechaCrea_Internalname, localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRolP_FechaCrea_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtRolP_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_SEG_ROL_PANTALLAGeneral.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRolP_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRolP_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SEG_ROL_PANTALLAGeneral.htm");
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

   public void start362( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
            Form.getMeta().addItem("description", "SEG_ROL_PANTALLAGeneral", (short)(0)) ;
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
            strup360( ) ;
         }
      }
   }

   public void ws362( )
   {
      start362( ) ;
      evt362( ) ;
   }

   public void evt362( )
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
                              strup360( ) ;
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
                              strup360( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13362 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup360( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14362 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup360( ) ;
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
                              strup360( ) ;
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

   public void we362( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm362( ) ;
         }
      }
   }

   public void pa362( )
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
      rf362( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV15Pgmname = "SEG_ROL_PANTALLAGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf362( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00362 */
         pr_default.execute(0, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A216RolP_FechaCrea = H00362_A216RolP_FechaCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A216RolP_FechaCrea", localUtil.ttoc( A216RolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99")));
            A218RolP_FechaModifica = H00362_A218RolP_FechaModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218RolP_FechaModifica", localUtil.ttoc( A218RolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99")));
            A217RolP_UsuarioModifica = H00362_A217RolP_UsuarioModifica[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A217RolP_UsuarioModifica", A217RolP_UsuarioModifica);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
            A215RolP_UsuarioCrea = H00362_A215RolP_UsuarioCrea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A215RolP_UsuarioCrea", A215RolP_UsuarioCrea);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
            /* Execute user event: Load */
            e14362 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb360( ) ;
      }
   }

   public void strup360( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "SEG_ROL_PANTALLAGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00363 */
      pr_default.execute(1, new Object[] {new Long(A21Rol_Id)});
      A22Rol_Descripcion = H00363_A22Rol_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22Rol_Descripcion", A22Rol_Descripcion);
      pr_default.close(1);
      /* Using cursor H00364 */
      pr_default.execute(2, new Object[] {new Integer(A18Pant_Id)});
      A16Modu_Id = H00364_A16Modu_Id[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      A19Pant_Descripcion = H00364_A19Pant_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19Pant_Descripcion", A19Pant_Descripcion);
      pr_default.close(2);
      /* Using cursor H00365 */
      pr_default.execute(3, new Object[] {new Long(A16Modu_Id)});
      A17Modu_Descripcion = H00365_A17Modu_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17Modu_Descripcion", A17Modu_Descripcion);
      pr_default.close(3);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13362 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22Rol_Descripcion", A22Rol_Descripcion);
         A19Pant_Descripcion = httpContext.cgiGet( edtPant_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17Modu_Descripcion", A17Modu_Descripcion);
         A215RolP_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioCrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A215RolP_UsuarioCrea", A215RolP_UsuarioCrea);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_USUARIOCREA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
         A217RolP_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioModifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A217RolP_UsuarioModifica", A217RolP_UsuarioModifica);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_USUARIOMODIFICA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
         A218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtRolP_FechaModifica_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218RolP_FechaModifica", localUtil.ttoc( A218RolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_FECHAMODIFICA", getSecureSignedToken( sPrefix, localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99")));
         A216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtRolP_FechaCrea_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A216RolP_FechaCrea", localUtil.ttoc( A216RolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "gxhash_ROLP_FECHACREA", getSecureSignedToken( sPrefix, localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99")));
         /* Read saved values. */
         wcpOA21Rol_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA21Rol_Id"), ",", ".") ;
         wcpOA18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA18Pant_Id"), ",", ".")) ;
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
      e13362 ();
      if (returnInSub) return;
   }

   public void e13362( )
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

   protected void e14362( )
   {
      /* Load Routine */
      edtRol_Descripcion_Link = formatLink("com.orions2.viewseg_rolypantalla") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A21Rol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRol_Descripcion_Internalname, "Link", edtRol_Descripcion_Link, true);
      edtPant_Descripcion_Link = formatLink("com.orions2.viewseg_pantalla") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A18Pant_Id,6,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPant_Descripcion_Internalname, "Link", edtPant_Descripcion_Link, true);
      edtModu_Descripcion_Link = formatLink("com.orions2.viewseg_modulo_menu") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A16Modu_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtModu_Descripcion_Internalname, "Link", edtModu_Descripcion_Link, true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV9TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV15Pgmname );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerondelete( false );
      AV9TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtTransactionContext_Transactionname( "SEG_ROL_PANTALLA" );
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Rol_Id" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV7Rol_Id, 11, 0) );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributename( "Pant_Id" );
      AV10TrnContextAtt.setgxTv_SdtTransactionContext_Attribute_Attributevalue( GXutil.str( AV8Pant_Id, 6, 0) );
      AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV11Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
      A21Rol_Id = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      A18Pant_Id = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
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
      pa362( ) ;
      ws362( ) ;
      we362( ) ;
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
      sCtrlA21Rol_Id = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA18Pant_Id = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa362( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "seg_rol_pantallageneral");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa362( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A21Rol_Id = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A18Pant_Id = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      wcpOA21Rol_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA21Rol_Id"), ",", ".") ;
      wcpOA18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA18Pant_Id"), ",", ".")) ;
      if ( ! GetJustCreated( ) && ( ( A21Rol_Id != wcpOA21Rol_Id ) || ( A18Pant_Id != wcpOA18Pant_Id ) ) )
      {
         setjustcreated();
      }
      wcpOA21Rol_Id = A21Rol_Id ;
      wcpOA18Pant_Id = A18Pant_Id ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA21Rol_Id = httpContext.cgiGet( sPrefix+"A21Rol_Id_CTRL") ;
      if ( GXutil.len( sCtrlA21Rol_Id) > 0 )
      {
         A21Rol_Id = localUtil.ctol( httpContext.cgiGet( sCtrlA21Rol_Id), ",", ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
      else
      {
         A21Rol_Id = localUtil.ctol( httpContext.cgiGet( sPrefix+"A21Rol_Id_PARM"), ",", ".") ;
      }
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
      pa362( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws362( ) ;
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
      ws362( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A21Rol_Id_PARM", GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA21Rol_Id)) > 0 )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A21Rol_Id_CTRL", GXutil.rtrim( sCtrlA21Rol_Id));
      }
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
      we362( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416451");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("seg_rol_pantallageneral.js", "?20186141416451");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtRol_Id_Internalname = sPrefix+"ROL_ID" ;
      edtRol_Descripcion_Internalname = sPrefix+"ROL_DESCRIPCION" ;
      edtPant_Id_Internalname = sPrefix+"PANT_ID" ;
      edtPant_Descripcion_Internalname = sPrefix+"PANT_DESCRIPCION" ;
      edtModu_Id_Internalname = sPrefix+"MODU_ID" ;
      edtModu_Descripcion_Internalname = sPrefix+"MODU_DESCRIPCION" ;
      edtRolP_UsuarioCrea_Internalname = sPrefix+"ROLP_USUARIOCREA" ;
      edtRolP_UsuarioModifica_Internalname = sPrefix+"ROLP_USUARIOMODIFICA" ;
      edtRolP_FechaModifica_Internalname = sPrefix+"ROLP_FECHAMODIFICA" ;
      edtRolP_FechaCrea_Internalname = sPrefix+"ROLP_FECHACREA" ;
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
      edtRolP_FechaCrea_Jsonclick = "" ;
      edtRolP_FechaCrea_Enabled = 0 ;
      edtRolP_FechaModifica_Jsonclick = "" ;
      edtRolP_FechaModifica_Enabled = 0 ;
      edtRolP_UsuarioModifica_Jsonclick = "" ;
      edtRolP_UsuarioModifica_Enabled = 0 ;
      edtRolP_UsuarioCrea_Jsonclick = "" ;
      edtRolP_UsuarioCrea_Enabled = 0 ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Descripcion_Link = "" ;
      edtModu_Descripcion_Enabled = 0 ;
      edtModu_Id_Jsonclick = "" ;
      edtModu_Id_Enabled = 0 ;
      edtPant_Descripcion_Jsonclick = "" ;
      edtPant_Descripcion_Link = "" ;
      edtPant_Descripcion_Enabled = 0 ;
      edtPant_Id_Jsonclick = "" ;
      edtPant_Id_Enabled = 0 ;
      edtRol_Descripcion_Jsonclick = "" ;
      edtRol_Descripcion_Link = "" ;
      edtRol_Descripcion_Enabled = 0 ;
      edtRol_Id_Jsonclick = "" ;
      edtRol_Id_Enabled = 0 ;
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
      setEventMetadata("'DOUPDATE'","{handler:'e11361',iparms:[{av:'A21Rol_Id',fld:'ROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A18Pant_Id',fld:'PANT_ID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12361',iparms:[{av:'A21Rol_Id',fld:'ROL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A18Pant_Id',fld:'PANT_ID',pic:'ZZZZZ9',nv:0}],oparms:[]}");
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
      A215RolP_UsuarioCrea = "" ;
      A217RolP_UsuarioModifica = "" ;
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A22Rol_Descripcion = "" ;
      A19Pant_Descripcion = "" ;
      A17Modu_Descripcion = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Pgmname = "" ;
      scmdbuf = "" ;
      H00362_A21Rol_Id = new long[1] ;
      H00362_A18Pant_Id = new int[1] ;
      H00362_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00362_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00362_A217RolP_UsuarioModifica = new String[] {""} ;
      H00362_A215RolP_UsuarioCrea = new String[] {""} ;
      H00362_A17Modu_Descripcion = new String[] {""} ;
      H00362_A16Modu_Id = new long[1] ;
      H00362_A19Pant_Descripcion = new String[] {""} ;
      H00362_A22Rol_Descripcion = new String[] {""} ;
      H00363_A22Rol_Descripcion = new String[] {""} ;
      H00364_A16Modu_Id = new long[1] ;
      H00364_A19Pant_Descripcion = new String[] {""} ;
      H00365_A17Modu_Descripcion = new String[] {""} ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV11Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA21Rol_Id = "" ;
      sCtrlA18Pant_Id = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_rol_pantallageneral__default(),
         new Object[] {
             new Object[] {
            H00362_A21Rol_Id, H00362_A18Pant_Id, H00362_A216RolP_FechaCrea, H00362_A218RolP_FechaModifica, H00362_A217RolP_UsuarioModifica, H00362_A215RolP_UsuarioCrea, H00362_A17Modu_Descripcion, H00362_A16Modu_Id, H00362_A19Pant_Descripcion, H00362_A22Rol_Descripcion
            }
            , new Object[] {
            H00363_A22Rol_Descripcion
            }
            , new Object[] {
            H00364_A16Modu_Id, H00364_A19Pant_Descripcion
            }
            , new Object[] {
            H00365_A17Modu_Descripcion
            }
         }
      );
      AV15Pgmname = "SEG_ROL_PANTALLAGeneral" ;
      /* GeneXus formulas. */
      AV15Pgmname = "SEG_ROL_PANTALLAGeneral" ;
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
   private int wcpOA18Pant_Id ;
   private int A18Pant_Id ;
   private int edtRol_Id_Enabled ;
   private int edtRol_Descripcion_Enabled ;
   private int edtPant_Id_Enabled ;
   private int edtPant_Descripcion_Enabled ;
   private int edtModu_Id_Enabled ;
   private int edtModu_Descripcion_Enabled ;
   private int edtRolP_UsuarioCrea_Enabled ;
   private int edtRolP_UsuarioModifica_Enabled ;
   private int edtRolP_FechaModifica_Enabled ;
   private int edtRolP_FechaCrea_Enabled ;
   private int AV8Pant_Id ;
   private int idxLst ;
   private long wcpOA21Rol_Id ;
   private long A21Rol_Id ;
   private long A16Modu_Id ;
   private long AV7Rol_Id ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String edtRol_Id_Internalname ;
   private String edtRol_Id_Jsonclick ;
   private String edtRol_Descripcion_Internalname ;
   private String edtRol_Descripcion_Link ;
   private String edtRol_Descripcion_Jsonclick ;
   private String edtPant_Id_Internalname ;
   private String edtPant_Id_Jsonclick ;
   private String edtPant_Descripcion_Internalname ;
   private String edtPant_Descripcion_Link ;
   private String edtPant_Descripcion_Jsonclick ;
   private String edtModu_Id_Internalname ;
   private String edtModu_Id_Jsonclick ;
   private String edtModu_Descripcion_Internalname ;
   private String edtModu_Descripcion_Link ;
   private String edtModu_Descripcion_Jsonclick ;
   private String edtRolP_UsuarioCrea_Internalname ;
   private String edtRolP_UsuarioCrea_Jsonclick ;
   private String edtRolP_UsuarioModifica_Internalname ;
   private String edtRolP_UsuarioModifica_Jsonclick ;
   private String edtRolP_FechaModifica_Internalname ;
   private String edtRolP_FechaModifica_Jsonclick ;
   private String edtRolP_FechaCrea_Internalname ;
   private String edtRolP_FechaCrea_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Pgmname ;
   private String scmdbuf ;
   private String sCtrlA21Rol_Id ;
   private String sCtrlA18Pant_Id ;
   private java.util.Date A218RolP_FechaModifica ;
   private java.util.Date A216RolP_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String A215RolP_UsuarioCrea ;
   private String A217RolP_UsuarioModifica ;
   private String A22Rol_Descripcion ;
   private String A19Pant_Descripcion ;
   private String A17Modu_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private IDataStoreProvider pr_default ;
   private long[] H00362_A21Rol_Id ;
   private int[] H00362_A18Pant_Id ;
   private java.util.Date[] H00362_A216RolP_FechaCrea ;
   private java.util.Date[] H00362_A218RolP_FechaModifica ;
   private String[] H00362_A217RolP_UsuarioModifica ;
   private String[] H00362_A215RolP_UsuarioCrea ;
   private String[] H00362_A17Modu_Descripcion ;
   private long[] H00362_A16Modu_Id ;
   private String[] H00362_A19Pant_Descripcion ;
   private String[] H00362_A22Rol_Descripcion ;
   private String[] H00363_A22Rol_Descripcion ;
   private long[] H00364_A16Modu_Id ;
   private String[] H00364_A19Pant_Descripcion ;
   private String[] H00365_A17Modu_Descripcion ;
   private com.genexus.webpanels.WebSession AV11Session ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class seg_rol_pantallageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00362", "SELECT T1.Rol_Id, T1.Pant_Id, T1.RolP_FechaCrea, T1.RolP_FechaModifica, T1.RolP_UsuarioModifica, T1.RolP_UsuarioCrea, T4.Modu_Descripcion, T3.Modu_Id, T3.Pant_Descripcion, T2.Rol_Descripcion FROM (((SEG_ROL_PANTALLA T1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = T1.Rol_Id) INNER JOIN SEG_PANTALLA T3 ON T3.Pant_Id = T1.Pant_Id) INNER JOIN SEG_MODULO_MENU T4 ON T4.Modu_Id = T3.Modu_Id) WHERE T1.Rol_Id = ? and T1.Pant_Id = ? ORDER BY T1.Rol_Id, T1.Pant_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00363", "SELECT Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00364", "SELECT Modu_Id, Pant_Descripcion FROM SEG_PANTALLA WHERE Pant_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00365", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

