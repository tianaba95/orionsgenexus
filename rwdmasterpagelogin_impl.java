/*
               File: rwdmasterpagelogin_impl
        Description: Rwd Master Page Login
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:39.32
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

public final  class rwdmasterpagelogin_impl extends GXMasterPage
{
   public rwdmasterpagelogin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rwdmasterpagelogin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rwdmasterpagelogin_impl.class ));
   }

   public rwdmasterpagelogin_impl( int remoteHandle ,
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
         pa1Z2( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1Z2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1Z2( ) ;
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
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm1Z2( )
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
      httpContext.AddJavascriptSource("rwdmasterpagelogin.js", "?201861414183934");
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "RwdMasterPageLogin" ;
   }

   public String getPgmdesc( )
   {
      return "Rwd Master Page Login" ;
   }

   public void wb1Z0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-3 col-sm-offset-1 col-md-4 col-md-offset-0 col-lg-2 col-lg-offset-1", "Center", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "01338977-f141-41b3-b12c-fb059b1f1189", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 130, "px", 130, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-10 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "BigTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, lblTextblock13_Caption, "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, lblTextblock14_Caption, "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, lblTextblock2_Caption, "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
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
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 135, "px", 77, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "544b4add-2373-42d5-9133-380eacffd15d", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 135, "px", 77, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "Middle", "", "", "div");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "FooterContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-7 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, lblTextblock3_Caption, "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, lblTextblock4_Caption, "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, lblTextblock5_Caption, "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, lblTextblock6_Caption, "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, lblTextblock7_Caption, "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, lblTextblock8_Caption, "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, lblTextblock9_Caption, "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, lblTextblock10_Caption, "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, lblTextblock11_Caption, "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, lblTextblock12_Caption, "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockFooter", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 hidden-sm col-md-5 col-lg-4", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "2dfd3a41-510d-466f-baa2-c7c69c5a1dbf", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 90, "px", 90, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "301a91ab-830a-4573-aadb-bea21cf0355e", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 90, "px", 90, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "333edda6-dc8b-468b-ba16-1adaea328533", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 90, "px", 90, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "9f4e4327-83f4-41e3-b577-749ca8da56d9", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RwdMasterPageLogin.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1Z2( )
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
      strup1Z0( ) ;
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

   public void ws1Z2( )
   {
      start1Z2( ) ;
      evt1Z2( ) ;
   }

   public void evt1Z2( )
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
                        e111Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Refresh */
                        e121Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e131Z2 ();
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

   public void we1Z2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1Z2( ) ;
         }
      }
   }

   public void pa1Z2( )
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
      rf1Z2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   public void rf1Z2( )
   {
      initialize_formulas( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         /* Execute user event: Refresh */
         e121Z2 ();
         fix_multi_value_controls( ) ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131Z2 ();
         wb1Z0( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
   }

   public void strup1Z0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
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
      e111Z2 ();
      if (returnInSub) return;
   }

   public void e111Z2( )
   {
      /* Start Routine */
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("viewport", "width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no", (short)(0)) ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("apple-mobile-web-app-capable", "yes", (short)(0)) ;
      AV8dia = (short)(GXutil.day( Gx_date)) ;
      AV9mes = GXutil.concat( localUtil.cmonth( Gx_date, "spa"), " ", " ") ;
      AV10ano = (short)(GXutil.year( Gx_date)) ;
      lblTextblock2_Caption = GXutil.str( AV8dia, 4, 0)+" DE "+GXutil.upper( AV9mes)+" "+GXutil.str( AV10ano, 4, 0) ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock2_Internalname, "Caption", lblTextblock2_Caption, true);
      lblTextblock3_Caption = "Servicio Nacional de Aprendizaje SENA - Dirección General" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock3_Internalname, "Caption", lblTextblock3_Caption, true);
      lblTextblock4_Caption = "Calle 57 No. 8 - 69 Bogotá D.C. (Cundinamarca), Colombia" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock4_Internalname, "Caption", lblTextblock4_Caption, true);
      lblTextblock5_Caption = "Conmutador Nacional (57 1) 5461500 - Extensiones" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock5_Internalname, "Caption", lblTextblock5_Caption, true);
      lblTextblock6_Caption = "Atención presencial: lunes a viernes 8:00 a.m. a 5:30 p.m. - Resto del país sedes y horarios" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock6_Internalname, "Caption", lblTextblock6_Caption, true);
      lblTextblock7_Caption = "Atención telefónica: lunes a viernes 7:00 a.m. a 7:00 p.m. - sábados 8:00 a.m. a 1:00 p.m." ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock7_Internalname, "Caption", lblTextblock7_Caption, true);
      lblTextblock8_Caption = "Líneas gratuitas atención al ciudadano: Bogotá (57 1) 5925555 - Resto del país 018000 910270" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock8_Internalname, "Caption", lblTextblock8_Caption, true);
      lblTextblock9_Caption = "Líneas gratuitas atención al empresario: Bogotá (57 1) 4049494 - Resto del país 018000 910682" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock9_Internalname, "Caption", lblTextblock9_Caption, true);
      lblTextblock10_Caption = "Correo servicio al cliente: gpservicioalcliente@sena.edu.co" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock10_Internalname, "Caption", lblTextblock10_Caption, true);
      lblTextblock11_Caption = "Correo notificaciones judiciales: servicioalciudadano@sena.edu.co" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock11_Internalname, "Caption", lblTextblock11_Caption, true);
      lblTextblock12_Caption = "Todos los derechos 2017 SENA - Políticas de privacidad y condiciones uso Portal Web SENA Política de Tratamiento para Protección de Datos Personales - Política de seguridad y privacidad de la información" ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblock12_Internalname, "Caption", lblTextblock12_Caption, true);
      /* Execute user subroutine: 'BUSCARPARAMETROS' */
      S112 ();
      if (returnInSub) return;
   }

   public void e121Z2( )
   {
      /* Refresh Routine */
   }

   public void S112( )
   {
      /* 'BUSCARPARAMETROS' Routine */
      /* Using cursor H001Z2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = H001Z2_A208Para_Nombre[0] ;
         A209Para_Valor = H001Z2_A209Para_Valor[0] ;
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

   protected void e131Z2( )
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
      pa1Z2( ) ;
      ws1Z2( ) ;
      we1Z2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?20186141418406");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("rwdmasterpagelogin.js", "?20186141418406");
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgImage2_Internalname = "IMAGE2_MPAGE" ;
      lblTextblock1_Internalname = "TEXTBLOCK1_MPAGE" ;
      lblTextblock13_Internalname = "TEXTBLOCK13_MPAGE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14_MPAGE" ;
      divTable6_Internalname = "TABLE6_MPAGE" ;
      lblTextblock2_Internalname = "TEXTBLOCK2_MPAGE" ;
      imgImage1_Internalname = "IMAGE1_MPAGE" ;
      imgImage3_Internalname = "IMAGE3_MPAGE" ;
      divTable2_Internalname = "TABLE2_MPAGE" ;
      divTable1_Internalname = "TABLE1_MPAGE" ;
      divContent_Internalname = "CONTENT_MPAGE" ;
      lblTextblock3_Internalname = "TEXTBLOCK3_MPAGE" ;
      lblTextblock4_Internalname = "TEXTBLOCK4_MPAGE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5_MPAGE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6_MPAGE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7_MPAGE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8_MPAGE" ;
      lblTextblock9_Internalname = "TEXTBLOCK9_MPAGE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10_MPAGE" ;
      lblTextblock11_Internalname = "TEXTBLOCK11_MPAGE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12_MPAGE" ;
      divTable3_Internalname = "TABLE3_MPAGE" ;
      imgImage4_Internalname = "IMAGE4_MPAGE" ;
      imgImage5_Internalname = "IMAGE5_MPAGE" ;
      imgImage6_Internalname = "IMAGE6_MPAGE" ;
      imgImage7_Internalname = "IMAGE7_MPAGE" ;
      divTable4_Internalname = "TABLE4_MPAGE" ;
      divTable5_Internalname = "TABLE5_MPAGE" ;
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
      lblTextblock12_Caption = "Text Block" ;
      lblTextblock11_Caption = "Text Block" ;
      lblTextblock10_Caption = "Text Block" ;
      lblTextblock9_Caption = "Text Block" ;
      lblTextblock8_Caption = "Text Block" ;
      lblTextblock7_Caption = "Text Block" ;
      lblTextblock6_Caption = "Text Block" ;
      lblTextblock5_Caption = "Text Block" ;
      lblTextblock4_Caption = "Text Block" ;
      lblTextblock3_Caption = "Text Block" ;
      lblTextblock2_Caption = "" ;
      lblTextblock14_Caption = "" ;
      lblTextblock13_Caption = "" ;
      lblTextblock1_Caption = "" ;
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
      GXKey = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV9mes = "" ;
      scmdbuf = "" ;
      H001Z2_A20Para_Id = new long[1] ;
      H001Z2_A208Para_Nombre = new String[] {""} ;
      H001Z2_A209Para_Valor = new String[] {""} ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rwdmasterpagelogin__default(),
         new Object[] {
             new Object[] {
            H001Z2_A20Para_Id, H001Z2_A208Para_Nombre, H001Z2_A209Para_Valor
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
   private short AV8dia ;
   private short AV10ano ;
   private int idxLst ;
   private String GXKey ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgImage2_Internalname ;
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
   private String divContent_Internalname ;
   private String divTable5_Internalname ;
   private String divTable3_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Caption ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Caption ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Caption ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Caption ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Caption ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Caption ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Caption ;
   private String lblTextblock9_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Caption ;
   private String lblTextblock10_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Caption ;
   private String lblTextblock11_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Caption ;
   private String lblTextblock12_Jsonclick ;
   private String divTable4_Internalname ;
   private String imgImage4_Internalname ;
   private String imgImage5_Internalname ;
   private String imgImage6_Internalname ;
   private String imgImage7_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV9mes ;
   private String scmdbuf ;
   private String sDynURL ;
   private java.util.Date Gx_date ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXDataAreaControl Contentholder ;
   private IDataStoreProvider pr_default ;
   private long[] H001Z2_A20Para_Id ;
   private String[] H001Z2_A208Para_Nombre ;
   private String[] H001Z2_A209Para_Valor ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class rwdmasterpagelogin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001Z2", "SELECT Para_Id, Para_Nombre, Para_Valor FROM SEG_PARAMETROS ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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

