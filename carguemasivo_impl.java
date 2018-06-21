/*
               File: carguemasivo_impl
        Description: Cargue Masivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:40.28
       Program type: Main program
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class carguemasivo_impl extends GXDataArea
{
   public carguemasivo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public carguemasivo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( carguemasivo_impl.class ));
   }

   public carguemasivo_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         AV18Tran_Id = (long) GXutil.val( args[0], ".");
         AV19Tran_IndE_S = (String) args[1];
         AV15Tipo_Bien = (String) args[2];
         AV20Tran_TipoEntra = (String) args[3];
         AV16Tran_CantidadPadres = (int) GXutil.val( args[4], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV18Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV19Tran_IndE_S = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_IndE_S", AV19Tran_IndE_S);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
               AV15Tipo_Bien = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
               AV20Tran_TipoEntra = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_TipoEntra", AV20Tran_TipoEntra);
               AV16Tran_CantidadPadres = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_CantidadPadres", GXutil.ltrim( GXutil.str( AV16Tran_CantidadPadres, 8, 0)));
            }
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.orions2.rwdmasterpagelogin_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa1Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1Y2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414184031");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.carguemasivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19Tran_IndE_S)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Tipo_Bien)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20Tran_TipoEntra)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16Tran_CantidadPadres,8,0)))+"\">") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_INDE_S", AV19Tran_IndE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV18Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_BIEN", AV15Tipo_Bien);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( AV17Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOENTRA", GXutil.rtrim( AV20Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFALLIDOS", GXutil.ltrim( localUtil.ntoc( AV9Fallidos, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV11Mensaje);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOMBREARCHIVO", AV13NombreArchivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMESSAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV12MessageCount, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CANTIDADPADRES", GXutil.ltrim( localUtil.ntoc( AV16Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vWINDOWSID", GXutil.ltrim( localUtil.ntoc( AV22WindowsId, (byte)(10), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vURL", GXutil.rtrim( AV21url));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
      GXCCtlgxBlob = "vARCHIVO" + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV5Archivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_Filename", GXutil.rtrim( edtavArchivo_Filename));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1Y2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.carguemasivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19Tran_IndE_S)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Tipo_Bien)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20Tran_TipoEntra)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16Tran_CantidadPadres,8,0))) ;
   }

   public String getPgmname( )
   {
      return "CargueMasivo" ;
   }

   public String getPgmdesc( )
   {
      return "Cargue Masivo" ;
   }

   public void wb1Y0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "TableLogin", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "Middle", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArchivo_Internalname, "Archivo", "col-sm-3 ImageLabel", 1, true);
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         edtavArchivo_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "Filetype", edtavArchivo_Filetype, true);
         if ( ! (GXutil.strcmp("", AV5Archivo)==0) )
         {
            gxblobfileaux.setSource( AV5Archivo );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavArchivo_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavArchivo_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV5Archivo = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV5Archivo), true);
               edtavArchivo_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "Filetype", edtavArchivo_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV5Archivo), true);
         }
         com.orions2.GxWebStd.gx_blob_field( httpContext, edtavArchivo_Internalname, GXutil.rtrim( AV5Archivo), httpContext.getResourceRelative(AV5Archivo), ((GXutil.strcmp("", edtavArchivo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavArchivo_Filetype)==0) ? AV5Archivo : edtavArchivo_Filetype)) : edtavArchivo_Contenttype), false, "", edtavArchivo_Parameters, 0, edtavArchivo_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtavArchivo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "", "", "HLP_CargueMasivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWActionsCell", "Center", "top", "", "", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divActions_inner_Internalname, 1, 0, "px", 0, "px", "collapse navbar-collapse gx-navbar-inner", "left", "top", "", "", "div");
         httpContext.writeText( "<ul class=\"nav navbar-nav\">") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "", "Confirmar", bttButton1_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttButton1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "", "Inconsistencias", bttButton2_Jsonclick, 7, "Inconsistencias", "", StyleString, ClassString, bttButton2_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111y1_client"+"'", TempTags, "", 2, "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton3_Internalname, "", "Integrar", bttButton3_Jsonclick, 5, "Integrar", "", StyleString, ClassString, bttButton3_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'INTEGRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton4_Internalname, "", "Cancelar", bttButton4_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttButton4_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton5_Internalname, "", "Finalizar", bttButton5_Jsonclick, 7, "Finalizar", "", StyleString, ClassString, bttButton5_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121y1_client"+"'", TempTags, "", 2, "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "<li>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton6_Internalname, "", "Generar Excel", bttButton6_Jsonclick, 5, "Generar Excel", "", StyleString, ClassString, bttButton6_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'GENERAR EXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargueMasivo.htm");
         httpContext.writeText( "</li>") ;
         httpContext.writeText( "</ul>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</nav>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblRedireccion_Internalname, lblRedireccion_Caption, "", "", lblRedireccion_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblRedireccion_Visible, 1, (short)(1), "HLP_CargueMasivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblUrl_Visible, 1, (short)(1), "HLP_CargueMasivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "Middle", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Cargue Masivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1Y0( ) ;
   }

   public void ws1Y2( )
   {
      start1Y2( ) ;
      evt1Y2( ) ;
   }

   public void evt1Y2( )
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
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e141Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'INTEGRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Integrar' */
                           e151Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'GENERAR EXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Generar Excel' */
                           e161Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1Y2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1Y2( )
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
            GX_FocusControl = edtavArchivo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      rf1Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf1Y2( )
   {
      initialize_formulas( ) ;
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171Y2 ();
         wb1Y0( ) ;
      }
   }

   public void strup1Y0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV5Archivo = httpContext.cgiGet( edtavArchivo_Internalname) ;
         /* Read saved values. */
         AV22WindowsId = localUtil.ctond( httpContext.cgiGet( "vWINDOWSID")) ;
         AV12MessageCount = (short)(localUtil.ctol( httpContext.cgiGet( "vMESSAGECOUNT"), ",", ".")) ;
         AV13NombreArchivo = httpContext.cgiGet( "vNOMBREARCHIVO") ;
         AV21url = httpContext.cgiGet( "vURL") ;
         edtavArchivo_Filename = httpContext.cgiGet( "vARCHIVO_Filename") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV5Archivo)==0) )
         {
            GXCCtlgxBlob = "vARCHIVO" + "_gxBlob" ;
            AV5Archivo = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
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
      e131Y2 ();
      if (returnInSub) return;
   }

   public void e131Y2( )
   {
      /* Start Routine */
      bttButton2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
      bttButton3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton3_Visible, 5, 0)), true);
      bttButton5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton5_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton5_Visible, 5, 0)), true);
      if ( ( ( GXutil.strcmp(AV15Tipo_Bien, "D") == 0 ) || ( GXutil.strcmp(AV15Tipo_Bien, "C") == 0 ) ) && ( ( GXutil.strcmp(AV19Tran_IndE_S, "E") == 0 ) || ( GXutil.strcmp(AV19Tran_IndE_S, "S") == 0 ) || ( GXutil.strcmp(AV19Tran_IndE_S, "T") == 0 ) ) )
      {
         bttButton6_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton6_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton6_Visible, 5, 0)), true);
      }
      else
      {
         bttButton6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton6_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton6_Visible, 5, 0)), true);
      }
      lblRedireccion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblRedireccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblRedireccion_Visible, 5, 0)), true);
      lblUrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblUrl_Visible, 5, 0)), true);
      /* Using cursor H001Y2 */
      pr_default.execute(0, new Object[] {new Long(AV18Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A49Tran_CodigoMovimiento = H001Y2_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = H001Y2_A46Tran_Id[0] ;
         A499Tran_CodTipoElemento = H001Y2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001Y2_n499Tran_CodTipoElemento[0] ;
         A499Tran_CodTipoElemento = H001Y2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001Y2_n499Tran_CodTipoElemento[0] ;
         AV17Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV17Tran_CodTipoElemento, 18, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void e141Y2( )
   {
      /* 'Confirmar' Routine */
      if ( (GXutil.strcmp("", AV5Archivo)==0) )
      {
         httpContext.GX_msglist.addItem("No ha seleccionado ningún archivo");
      }
      else
      {
         AV13NombreArchivo = edtavArchivo_Filename ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13NombreArchivo", AV13NombreArchivo);
         if ( GXutil.strSearch( GXutil.trim( AV13NombreArchivo), ".xls", 1) == 0 )
         {
            httpContext.GX_msglist.addItem("La extensión del archivo no es válido");
         }
         else
         {
            if ( GXutil.strcmp(AV19Tran_IndE_S, "E") == 0 )
            {
               GXv_char1[0] = AV11Mensaje ;
               GXv_int2[0] = AV9Fallidos ;
               GXv_int3[0] = AV6Cargados ;
               GXv_int4[0] = AV12MessageCount ;
               new com.orions2.validaarchivoentrada(remoteHandle, context).execute( AV5Archivo, AV18Tran_Id, AV15Tipo_Bien, AV17Tran_CodTipoElemento, AV20Tran_TipoEntra, GXv_char1, GXv_int2, GXv_int3, GXv_int4) ;
               carguemasivo_impl.this.AV11Mensaje = GXv_char1[0] ;
               carguemasivo_impl.this.AV9Fallidos = GXv_int2[0] ;
               carguemasivo_impl.this.AV6Cargados = GXv_int3[0] ;
               carguemasivo_impl.this.AV12MessageCount = GXv_int4[0] ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV5Archivo), true);
               httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV17Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV17Tran_CodTipoElemento, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_TipoEntra", AV20Tran_TipoEntra);
               httpContext.ajax_rsp_assign_attri("", false, "AV11Mensaje", AV11Mensaje);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Fallidos", GXutil.ltrim( GXutil.str( AV9Fallidos, 4, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV12MessageCount", GXutil.ltrim( GXutil.str( AV12MessageCount, 4, 0)));
            }
            if ( ( GXutil.strcmp(AV19Tran_IndE_S, "S") == 0 ) || ( GXutil.strcmp(AV19Tran_IndE_S, "T") == 0 ) )
            {
               GXv_char1[0] = AV11Mensaje ;
               GXv_int4[0] = AV9Fallidos ;
               GXv_int3[0] = AV6Cargados ;
               GXv_int2[0] = AV12MessageCount ;
               new com.orions2.validaarchivosalida(remoteHandle, context).execute( AV5Archivo, AV15Tipo_Bien, GXv_char1, GXv_int4, GXv_int3, GXv_int2, AV18Tran_Id, AV17Tran_CodTipoElemento, AV19Tran_IndE_S) ;
               carguemasivo_impl.this.AV11Mensaje = GXv_char1[0] ;
               carguemasivo_impl.this.AV9Fallidos = GXv_int4[0] ;
               carguemasivo_impl.this.AV6Cargados = GXv_int3[0] ;
               carguemasivo_impl.this.AV12MessageCount = GXv_int2[0] ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV5Archivo), true);
               httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV11Mensaje", AV11Mensaje);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Fallidos", GXutil.ltrim( GXutil.str( AV9Fallidos, 4, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV12MessageCount", GXutil.ltrim( GXutil.str( AV12MessageCount, 4, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV17Tran_CodTipoElemento, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_IndE_S", AV19Tran_IndE_S);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
            }
            if ( AV9Fallidos > 0 )
            {
               bttButton1_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
               bttButton2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
               bttButton3_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton3_Visible, 5, 0)), true);
               bttButton6_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton6_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton6_Visible, 5, 0)), true);
            }
            else
            {
               bttButton1_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
               bttButton2_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
               bttButton3_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton3_Visible, 5, 0)), true);
               bttButton4_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton4_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton4_Visible, 5, 0)), true);
               bttButton5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton5_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton5_Visible, 5, 0)), true);
               bttButton6_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttButton6_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton6_Visible, 5, 0)), true);
            }
            httpContext.GX_msglist.addItem(AV11Mensaje);
         }
      }
   }

   public void e151Y2( )
   {
      /* 'Integrar' Routine */
      GXv_char1[0] = AV20Tran_TipoEntra ;
      GXv_int5[0] = AV16Tran_CantidadPadres ;
      new com.orions2.integracion(remoteHandle, context).execute( AV18Tran_Id, AV19Tran_IndE_S, AV15Tipo_Bien, GXv_char1, GXv_int5) ;
      carguemasivo_impl.this.AV20Tran_TipoEntra = GXv_char1[0] ;
      carguemasivo_impl.this.AV16Tran_CantidadPadres = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_IndE_S", AV19Tran_IndE_S);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_TipoEntra", AV20Tran_TipoEntra);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_CantidadPadres", GXutil.ltrim( GXutil.str( AV16Tran_CantidadPadres, 8, 0)));
      if ( ( GXutil.strcmp(AV19Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(AV15Tipo_Bien, "D") == 0 ) )
      {
         new com.orions2.borrarcargue(remoteHandle, context).execute( AV18Tran_Id) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      }
      if ( ( GXutil.strcmp(AV19Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(AV15Tipo_Bien, "C") == 0 ) )
      {
         new com.orions2.borrarcargue(remoteHandle, context).execute( AV18Tran_Id) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      }
      if ( ( GXutil.strcmp(AV19Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(AV15Tipo_Bien, "C") == 0 ) )
      {
         new com.orions2.borrarcarguesalida(remoteHandle, context).execute( AV18Tran_Id) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      }
      if ( ( GXutil.strcmp(AV19Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(AV15Tipo_Bien, "D") == 0 ) )
      {
         new com.orions2.borrarcarguesalida(remoteHandle, context).execute( AV18Tran_Id) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      }
      AV21url = formatLink("com.orions2.aptrascuen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18Tran_Id,11,0))) ;
      AV22WindowsId = DecimalUtil.doubleToDec(GXutil.random( )*100000) ;
      lblUrl_Caption = "<script language=\"JavaScript\">window.open(\""+GXutil.trim( AV21url)+"\",\""+GXutil.trim( GXutil.str( AV22WindowsId, 10, 0))+"\",\"target=_top,top=10,left=10,width=600,height=500,scrollbars=yes,menubar=no,toolbar=no,resizable=yes,directories=no\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Caption", lblUrl_Caption, true);
      bttButton3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton3_Visible, 5, 0)), true);
   }

   public void e161Y2( )
   {
      /* 'Generar Excel' Routine */
      GXv_char1[0] = AV24Filename ;
      GXv_char6[0] = AV23ErrorMessage ;
      new com.orions2.export_cargue_masivo(remoteHandle, context).execute( AV19Tran_IndE_S, AV15Tipo_Bien, GXv_char1, GXv_char6) ;
      carguemasivo_impl.this.AV24Filename = GXv_char1[0] ;
      carguemasivo_impl.this.AV23ErrorMessage = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_IndE_S", AV19Tran_IndE_S);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
      if ( GXutil.strcmp(AV24Filename, "") != 0 )
      {
         AV24Filename = "../" + AV24Filename ;
         httpContext.wjLoc = formatLink(AV24Filename)  ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e171Y2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV18Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_Id", GXutil.ltrim( GXutil.str( AV18Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Tran_Id), "ZZZZZZZZZZ9")));
      AV19Tran_IndE_S = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_IndE_S", AV19Tran_IndE_S);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Tran_IndE_S, ""))));
      AV15Tipo_Bien = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Tipo_Bien", AV15Tipo_Bien);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_BIEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tipo_Bien, ""))));
      AV20Tran_TipoEntra = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_TipoEntra", AV20Tran_TipoEntra);
      AV16Tran_CantidadPadres = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_CantidadPadres", GXutil.ltrim( GXutil.str( AV16Tran_CantidadPadres, 8, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1Y2( ) ;
      ws1Y2( ) ;
      we1Y2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
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

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414184073");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("carguemasivo.js", "?201861414184073");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavArchivo_Internalname = "vARCHIVO" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      bttButton3_Internalname = "BUTTON3" ;
      bttButton4_Internalname = "BUTTON4" ;
      bttButton5_Internalname = "BUTTON5" ;
      bttButton6_Internalname = "BUTTON6" ;
      divActions_inner_Internalname = "ACTIONS_INNER" ;
      lblRedireccion_Internalname = "REDIRECCION" ;
      lblUrl_Internalname = "URL" ;
      divTable2_Internalname = "TABLE2" ;
      divTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      lblUrl_Caption = "" ;
      lblUrl_Visible = 1 ;
      lblRedireccion_Caption = "Text Block" ;
      lblRedireccion_Visible = 1 ;
      bttButton6_Visible = 1 ;
      bttButton5_Visible = 1 ;
      bttButton4_Visible = 1 ;
      bttButton3_Visible = 1 ;
      bttButton2_Visible = 1 ;
      bttButton1_Visible = 1 ;
      edtavArchivo_Jsonclick = "" ;
      edtavArchivo_Parameters = "" ;
      edtavArchivo_Contenttype = "" ;
      edtavArchivo_Filetype = "" ;
      edtavArchivo_Enabled = 1 ;
      edtavArchivo_Filename = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Cargue Masivo" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e141Y2',iparms:[{av:'AV5Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'edtavArchivo_Filename',ctrl:'vARCHIVO',prop:'Filename'},{av:'AV19Tran_IndE_S',fld:'vTRAN_INDE_S',pic:'',hsh:true,nv:''},{av:'AV18Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Tipo_Bien',fld:'vTIPO_BIEN',pic:'',hsh:true,nv:''},{av:'AV17Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV20Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV9Fallidos',fld:'vFALLIDOS',pic:'ZZZ9',nv:0},{av:'AV11Mensaje',fld:'vMENSAJE',pic:'',nv:''}],oparms:[{av:'AV13NombreArchivo',fld:'vNOMBREARCHIVO',pic:'',nv:''},{av:'AV12MessageCount',fld:'vMESSAGECOUNT',pic:'ZZZ9',nv:0},{av:'AV9Fallidos',fld:'vFALLIDOS',pic:'ZZZ9',nv:0},{av:'AV11Mensaje',fld:'vMENSAJE',pic:'',nv:''},{ctrl:'BUTTON4',prop:'Visible'},{ctrl:'BUTTON5',prop:'Visible'},{ctrl:'BUTTON1',prop:'Visible'},{ctrl:'BUTTON2',prop:'Visible'},{ctrl:'BUTTON3',prop:'Visible'},{ctrl:'BUTTON6',prop:'Visible'}]}");
      setEventMetadata("'INCONSISTENCIAS'","{handler:'e111Y1',iparms:[{av:'AV13NombreArchivo',fld:'vNOMBREARCHIVO',pic:'',nv:''},{av:'AV12MessageCount',fld:'vMESSAGECOUNT',pic:'ZZZ9',nv:0}],oparms:[{av:'lblRedireccion_Caption',ctrl:'REDIRECCION',prop:'Caption'}]}");
      setEventMetadata("'INTEGRAR'","{handler:'e151Y2',iparms:[{av:'AV18Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Tran_IndE_S',fld:'vTRAN_INDE_S',pic:'',hsh:true,nv:''},{av:'AV15Tipo_Bien',fld:'vTIPO_BIEN',pic:'',hsh:true,nv:''},{av:'AV20Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV16Tran_CantidadPadres',fld:'vTRAN_CANTIDADPADRES',pic:'ZZZZZZZ9',nv:0}],oparms:[{av:'AV16Tran_CantidadPadres',fld:'vTRAN_CANTIDADPADRES',pic:'ZZZZZZZ9',nv:0},{av:'AV20Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'},{ctrl:'BUTTON3',prop:'Visible'}]}");
      setEventMetadata("'FINALIZAR'","{handler:'e121Y1',iparms:[],oparms:[]}");
      setEventMetadata("'GENERAR EXCEL'","{handler:'e161Y2',iparms:[{av:'AV19Tran_IndE_S',fld:'vTRAN_INDE_S',pic:'',hsh:true,nv:''},{av:'AV15Tipo_Bien',fld:'vTIPO_BIEN',pic:'',hsh:true,nv:''}],oparms:[]}");
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
      wcpOAV19Tran_IndE_S = "" ;
      wcpOAV15Tipo_Bien = "" ;
      wcpOAV20Tran_TipoEntra = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV19Tran_IndE_S = "" ;
      AV15Tipo_Bien = "" ;
      AV20Tran_TipoEntra = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11Mensaje = "" ;
      AV13NombreArchivo = "" ;
      AV22WindowsId = DecimalUtil.ZERO ;
      AV21url = "" ;
      GXCCtlgxBlob = "" ;
      AV5Archivo = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      bttButton3_Jsonclick = "" ;
      bttButton4_Jsonclick = "" ;
      bttButton5_Jsonclick = "" ;
      bttButton6_Jsonclick = "" ;
      lblRedireccion_Jsonclick = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H001Y2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H001Y2_A46Tran_Id = new long[1] ;
      H001Y2_A499Tran_CodTipoElemento = new long[1] ;
      H001Y2_n499Tran_CodTipoElemento = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      GXv_int4 = new short [1] ;
      GXv_int3 = new short [1] ;
      GXv_int2 = new short [1] ;
      GXv_int5 = new int [1] ;
      AV24Filename = "" ;
      GXv_char1 = new String [1] ;
      AV23ErrorMessage = "" ;
      GXv_char6 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.carguemasivo__default(),
         new Object[] {
             new Object[] {
            H001Y2_A49Tran_CodigoMovimiento, H001Y2_A46Tran_Id, H001Y2_A499Tran_CodTipoElemento, H001Y2_n499Tran_CodTipoElemento
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short AV9Fallidos ;
   private short AV12MessageCount ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV6Cargados ;
   private short GXv_int4[] ;
   private short GXv_int3[] ;
   private short GXv_int2[] ;
   private int wcpOAV16Tran_CantidadPadres ;
   private int AV16Tran_CantidadPadres ;
   private int edtavArchivo_Enabled ;
   private int bttButton1_Visible ;
   private int bttButton2_Visible ;
   private int bttButton3_Visible ;
   private int bttButton4_Visible ;
   private int bttButton5_Visible ;
   private int bttButton6_Visible ;
   private int lblRedireccion_Visible ;
   private int lblUrl_Visible ;
   private int GXv_int5[] ;
   private int idxLst ;
   private long wcpOAV18Tran_Id ;
   private long AV18Tran_Id ;
   private long AV17Tran_CodTipoElemento ;
   private long A46Tran_Id ;
   private long A499Tran_CodTipoElemento ;
   private java.math.BigDecimal AV22WindowsId ;
   private String wcpOAV20Tran_TipoEntra ;
   private String edtavArchivo_Filename ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV20Tran_TipoEntra ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV21url ;
   private String GXCCtlgxBlob ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String divTable2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavArchivo_Internalname ;
   private String TempTags ;
   private String edtavArchivo_Filetype ;
   private String edtavArchivo_Contenttype ;
   private String edtavArchivo_Parameters ;
   private String edtavArchivo_Jsonclick ;
   private String divActions_inner_Internalname ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String bttButton3_Internalname ;
   private String bttButton3_Jsonclick ;
   private String bttButton4_Internalname ;
   private String bttButton4_Jsonclick ;
   private String bttButton5_Internalname ;
   private String bttButton5_Jsonclick ;
   private String bttButton6_Internalname ;
   private String bttButton6_Jsonclick ;
   private String lblRedireccion_Internalname ;
   private String lblRedireccion_Caption ;
   private String lblRedireccion_Jsonclick ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n499Tran_CodTipoElemento ;
   private String AV5Archivo ;
   private String wcpOAV19Tran_IndE_S ;
   private String wcpOAV15Tipo_Bien ;
   private String AV19Tran_IndE_S ;
   private String AV15Tipo_Bien ;
   private String AV11Mensaje ;
   private String AV13NombreArchivo ;
   private String A49Tran_CodigoMovimiento ;
   private String AV24Filename ;
   private String AV23ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private IDataStoreProvider pr_default ;
   private String[] H001Y2_A49Tran_CodigoMovimiento ;
   private long[] H001Y2_A46Tran_Id ;
   private long[] H001Y2_A499Tran_CodTipoElemento ;
   private boolean[] H001Y2_n499Tran_CodTipoElemento ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class carguemasivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001Y2", "SELECT T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T2.Tipo_Codigo AS Tran_CodTipoElemento FROM (ALM_TRANSACCION T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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

