/*
               File: rwdmasterpage_impl
        Description: Responsive Master Page
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:43.1
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

public final  class rwdmasterpage_impl extends GXMasterPage
{
   public rwdmasterpage_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rwdmasterpage_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rwdmasterpage_impl.class ));
   }

   public rwdmasterpage_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa042( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws042( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we042( ) ;
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         GXWebForm.addResponsiveMetaHeaders((getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta());
         getDataAreaObject().renderHtmlHeaders();
      }
   }

   public void renderHtmlOpenForm( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlOpenForm();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vGPXMENUITEMS_MPAGE", AV7gpxMenuItems);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGPXMENUITEMS_MPAGE", AV7gpxMenuItems);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GPXMENU1_MPAGE_Collapsedtitle", GXutil.rtrim( Gpxmenu1_Collapsedtitle));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GPXMENU1_MPAGE_Collapsedbackcolor", GXutil.rtrim( Gpxmenu1_Collapsedbackcolor));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GPXMENU1_MPAGE_Mainbackcolor", GXutil.rtrim( Gpxmenu1_Mainbackcolor));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GPXMENU1_MPAGE_Secondarybackcolor", GXutil.rtrim( Gpxmenu1_Secondarybackcolor));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GPXMENU1_MPAGE_Fontcolor", GXutil.rtrim( Gpxmenu1_Fontcolor));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm042( )
   {
      sendCloseFormHiddens( ) ;
      sendSecurityToken(sPrefix);
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlCloseForm();
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.AddJavascriptSource("gpxMenu/gpxMenuRender.js", "");
      httpContext.AddJavascriptSource("rwdmasterpage.js", "?20186141417435");
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "RwdMasterPage" ;
   }

   public String getPgmdesc( )
   {
      return "Responsive Master Page" ;
   }

   public void wb040( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         if ( ! ShowMPWhenPopUp( ) && httpContext.isPopUpObject( ) )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            /* Content placeholder */
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
            httpContext.writeText( ">") ;
            if ( ! isFullAjaxMode( ) )
            {
               getDataAreaObject().renderHtmlContent();
            }
            httpContext.writeText( "</div>") ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
            wbLoad = true ;
            return  ;
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "MainContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "HeaderContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-3 col-sm-offset-1 col-md-4 col-md-offset-0 col-lg-2 col-lg-offset-1", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "01338977-f141-41b3-b12c-fb059b1f1189", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 130, "px", 130, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-10 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "BigTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, lblTextblock13_Caption, "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, lblTextblock14_Caption, "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-md-offset-1 col-lg-3", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, lblTextblock2_Caption, "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "3dbcb179-14e0-4bba-8702-70a0d564f3ec", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 112, "px", 65, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "544b4add-2373-42d5-9133-380eacffd15d", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 112, "px", 65, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPage.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWActionsCell", "Right", "Bottom", "", "", "div");
         httpContext.writeText( "<nav class=\"navbar navbar-default gx-navbar  ActionGroup\" data-gx-actiongroup-type=\"menu\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "container-fluid", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "navbar-header", "left", "top", "", "", "div");
         httpContext.writeText( "<button type=\"button\" class=\"navbar-toggle collapsed gx-navbar-toggle\" data-toggle=\"collapse\" aria-expanded=\"false\">") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "<span class=\"icon-bar\"></span>") ;
         httpContext.writeText( "</button>") ;
         httpContext.writeText( "<span class=\"navbar-brand\"></span>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divActiongroup1_inner_Internalname, 1, 0, "px", 0, "px", "collapse navbar-collapse gx-navbar-inner", "left", "top", "", "", "div");
         httpContext.writeText( "<ul class=\"nav navbar-nav\">") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',true,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "", "Cerrar Sesión", bttButton1_Jsonclick, 5, "Cerrar Sesión", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",true,"+"'"+"ECERRAR SESION_MPAGE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RwdMasterPage.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "</ul>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</nav>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "Bottom", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divHeader_Internalname, 1, 0, "px", 0, "px", "TableTopMenu", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-7 col-md-offset-2", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"GPXMENU1_MPAGEContainer"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, "", "", "", lblUrl_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblUrl_Visible, 1, (short)(1), "HLP_RwdMasterPage.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divContent_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         /* Content placeholder */
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
         httpContext.writeText( ">") ;
         if ( ! isFullAjaxMode( ) )
         {
            getDataAreaObject().renderHtmlContent();
         }
         httpContext.writeText( "</div>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
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

   public void start042( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup040( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( getDataAreaObject().executeStartEvent() != 0 )
         {
            httpContext.setAjaxCallMode();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void ws042( )
   {
      start042( ) ;
      evt042( ) ;
   }

   public void evt042( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
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
                     if ( GXutil.strcmp(sEvt, "RFR_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "START_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "CERRAR SESION_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Cerrar Sesion' */
                        e12042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e13042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               if ( httpContext.wbHandled == 0 )
               {
                  getDataAreaObject().dispatchEvents();
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we042( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm042( ) ;
         }
      }
   }

   public void pa042( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
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
      rf042( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   public void rf042( )
   {
      initialize_formulas( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         fix_multi_value_controls( ) ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13042 ();
         wb040( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
   }

   public void strup040( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11042 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGPXMENUITEMS_MPAGE"), AV7gpxMenuItems);
         /* Read variables values. */
         /* Read saved values. */
         Gpxmenu1_Collapsedtitle = httpContext.cgiGet( "GPXMENU1_MPAGE_Collapsedtitle") ;
         Gpxmenu1_Collapsedbackcolor = httpContext.cgiGet( "GPXMENU1_MPAGE_Collapsedbackcolor") ;
         Gpxmenu1_Mainbackcolor = httpContext.cgiGet( "GPXMENU1_MPAGE_Mainbackcolor") ;
         Gpxmenu1_Secondarybackcolor = httpContext.cgiGet( "GPXMENU1_MPAGE_Secondarybackcolor") ;
         Gpxmenu1_Fontcolor = httpContext.cgiGet( "GPXMENU1_MPAGE_Fontcolor") ;
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
      e11042 ();
      if (returnInSub) return;
   }

   public void e11042( )
   {
      /* Start Routine */
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("viewport", "width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no", (short)(0)) ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("apple-mobile-web-app-capable", "yes", (short)(0)) ;
      AV11Usua_Id = GXutil.lval( AV13websession.getValue("UsuarioId")) ;
      AV12Usuario = AV13websession.getValue("Usuario") ;
      AV9Nombre = AV13websession.getValue("UsuarioNombre") ;
      GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 = AV7gpxMenuItems ;
      GXv_objcol_SdtgpxMenuItems_gpxMenuItem2[0] = GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 ;
      new com.orions2.pcargarmenu(remoteHandle, context).execute( AV11Usua_Id, GXv_objcol_SdtgpxMenuItems_gpxMenuItem2) ;
      GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 = GXv_objcol_SdtgpxMenuItems_gpxMenuItem2[0] ;
      AV7gpxMenuItems = GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 ;
      if ( GXutil.strcmp(AV12Usuario, "") == 0 )
      {
         callWebObject(formatLink("com.orions2.loginsena") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV6dia = (short)(GXutil.day( Gx_date)) ;
      AV8mes = GXutil.concat( localUtil.cmonth( Gx_date, "spa"), " ", " ") ;
      AV5ano = (short)(GXutil.year( Gx_date)) ;
      lblTextblock2_Caption = GXutil.upper( AV9Nombre)+"    -   "+GXutil.str( AV6dia, 4, 0)+" DE "+GXutil.upper( AV8mes)+" "+GXutil.str( AV5ano, 4, 0) ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock2_Internalname, "Caption", lblTextblock2_Caption, true);
      lblUrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblUrl_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblUrl_Visible, 5, 0)), true);
      /* Execute user subroutine: 'BUSCARPARAMETROS' */
      S112 ();
      if (returnInSub) return;
   }

   public void e12042( )
   {
      /* 'Cerrar Sesion' Routine */
      AV13websession.destroy();
      callWebObject(formatLink("com.orions2.loginsena") );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'BUSCARPARAMETROS' Routine */
      /* Using cursor H00042 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = H00042_A208Para_Nombre[0] ;
         A209Para_Valor = H00042_A209Para_Valor[0] ;
         if ( GXutil.strcmp(A208Para_Nombre, "NOMBRE CORTO") == 0 )
         {
            lblTextblock1_Caption = GXutil.upper( A209Para_Valor) ;
            httpContext.ajax_rsp_assign_prop("", true, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
         }
         if ( GXutil.strcmp(A208Para_Nombre, "NOMBRE LARGO") == 0 )
         {
            lblTextblock13_Caption = GXutil.upper( A209Para_Valor) ;
            httpContext.ajax_rsp_assign_prop("", true, lblTextblock13_Internalname, "Caption", lblTextblock13_Caption, true);
         }
         if ( GXutil.strcmp(A208Para_Nombre, "NOMBRE GRUPO") == 0 )
         {
            lblTextblock14_Caption = GXutil.upper( A209Para_Valor) ;
            httpContext.ajax_rsp_assign_prop("", true, lblTextblock14_Internalname, "Caption", lblTextblock14_Caption, true);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void nextLoad( )
   {
   }

   protected void e13042( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa042( ) ;
      ws042( ) ;
      we042( ) ;
      httpContext.setWrapped(false);
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

   public void master_styles( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("gpxMenu/resources/reset.css", "?128300");
      httpContext.AddStyleSheetFile("gpxMenu/resources/slimmenu.min.css", "?102640");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?201861414174345");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("rwdmasterpage.js", "?201861414174345");
      httpContext.AddJavascriptSource("gpxMenu/gpxMenuRender.js", "");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgImage4_Internalname = "IMAGE4_MPAGE" ;
      lblTextblock1_Internalname = "TEXTBLOCK1_MPAGE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13_MPAGE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14_MPAGE" ;
      divTable6_Internalname = "TABLE6_MPAGE" ;
      lblTextblock2_Internalname = "TEXTBLOCK2_MPAGE" ;
      imgImage1_Internalname = "IMAGE1_MPAGE" ;
      imgImage3_Internalname = "IMAGE3_MPAGE" ;
      bttButton1_Internalname = "BUTTON1_MPAGE" ;
      divActiongroup1_inner_Internalname = "ACTIONGROUP1_INNER_MPAGE" ;
      divTable2_Internalname = "TABLE2_MPAGE" ;
      divTable1_Internalname = "TABLE1_MPAGE" ;
      Gpxmenu1_Internalname = "GPXMENU1_MPAGE" ;
      lblUrl_Internalname = "URL_MPAGE" ;
      divHeader_Internalname = "HEADER_MPAGE" ;
      divContent_Internalname = "CONTENT_MPAGE" ;
      divMaintable_Internalname = "MAINTABLE_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      lblUrl_Visible = 1 ;
      lblTextblock2_Caption = "" ;
      lblTextblock14_Caption = "" ;
      lblTextblock13_Caption = "" ;
      lblTextblock1_Caption = "" ;
      Gpxmenu1_Fontcolor = "white" ;
      Gpxmenu1_Secondarybackcolor = "#fc7323" ;
      Gpxmenu1_Mainbackcolor = "#fc7323" ;
      Gpxmenu1_Collapsedbackcolor = "#fc7323" ;
      Gpxmenu1_Collapsedtitle = "Menu" ;
      Contentholder.setDataArea(getDataAreaObject());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH_MPAGE","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("CERRAR SESION_MPAGE","{handler:'e12042',iparms:[],oparms:[]}");
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
      Contentholder = new com.genexus.webpanels.GXDataAreaControl();
      Form = new com.genexus.webpanels.GXWebForm();
      AV7gpxMenuItems = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
      GXKey = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      TempTags = "" ;
      bttButton1_Jsonclick = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV13websession = httpContext.getWebSession();
      AV12Usuario = "" ;
      AV9Nombre = "" ;
      GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtgpxMenuItems_gpxMenuItem2 = new GXBaseCollection [1] ;
      AV8mes = "" ;
      scmdbuf = "" ;
      H00042_A20Para_Id = new long[1] ;
      H00042_A208Para_Nombre = new String[] {""} ;
      H00042_A209Para_Valor = new String[] {""} ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rwdmasterpage__default(),
         new Object[] {
             new Object[] {
            H00042_A20Para_Id, H00042_A208Para_Nombre, H00042_A209Para_Valor
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGotPars ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV6dia ;
   private short AV5ano ;
   private int lblUrl_Visible ;
   private int idxLst ;
   private long AV11Usua_Id ;
   private String Gpxmenu1_Collapsedtitle ;
   private String Gpxmenu1_Collapsedbackcolor ;
   private String Gpxmenu1_Mainbackcolor ;
   private String Gpxmenu1_Secondarybackcolor ;
   private String Gpxmenu1_Fontcolor ;
   private String GXKey ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgImage4_Internalname ;
   private String divTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Caption ;
   private String lblTextblock1_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Caption ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Caption ;
   private String lblTextblock14_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Caption ;
   private String lblTextblock2_Jsonclick ;
   private String imgImage1_Internalname ;
   private String imgImage3_Internalname ;
   private String divActiongroup1_inner_Internalname ;
   private String TempTags ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String divHeader_Internalname ;
   private String lblUrl_Internalname ;
   private String lblUrl_Jsonclick ;
   private String divContent_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String sDynURL ;
   private String Gpxmenu1_Internalname ;
   private java.util.Date Gx_date ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV12Usuario ;
   private String AV9Nombre ;
   private String AV8mes ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13websession ;
   private com.genexus.webpanels.GXDataAreaControl Contentholder ;
   private IDataStoreProvider pr_default ;
   private long[] H00042_A20Para_Id ;
   private String[] H00042_A208Para_Nombre ;
   private String[] H00042_A209Para_Valor ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> AV7gpxMenuItems ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> GXt_objcol_SdtgpxMenuItems_gpxMenuItem1 ;
   private GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> GXv_objcol_SdtgpxMenuItems_gpxMenuItem2[] ;
}

final  class rwdmasterpage__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00042", "SELECT Para_Id, Para_Nombre, Para_Valor FROM SEG_PARAMETROS ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

