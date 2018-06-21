/*
               File: viewalm_almacen_impl
        Description: View ALM_ALMACEN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:52.46
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

public final  class viewalm_almacen_impl extends GXDataArea
{
   public viewalm_almacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public viewalm_almacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( viewalm_almacen_impl.class ));
   }

   public viewalm_almacen_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
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
            AV13Alma_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Alma_Codigo", AV13Alma_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Alma_Codigo, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Alma_Modulo", AV14Alma_Modulo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Alma_Modulo, ""))));
               AV15Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Id", GXutil.ltrim( GXutil.str( AV15Cent_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
               AV7TabCode = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7TabCode", AV7TabCode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
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
         MasterPageObj = new com.orions2.rwdmasterpage_impl (remoteHandle, context.copy());
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
      pa0P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0P2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414175249");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.viewalm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode))+"\">") ;
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
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADALLTABS", AV12LoadAllTabs);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSELECTEDTABCODE", GXutil.rtrim( AV8SelectedTabCode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV13Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV14Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV15Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABCODE", GXutil.rtrim( AV7TabCode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Class", GXutil.rtrim( Tab_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Historymanagement", GXutil.booltostr( Tab_Historymanagement));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ViewALM_ALMACEN" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("viewalm_almacen:[SendSecurityCheck]"+forbiddenHiddens);
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
      if ( ! ( WebComp_Generalwc == null ) )
      {
         WebComp_Generalwc.componentjscripts();
      }
      if ( ! ( WebComp_Bodegaswc == null ) )
      {
         WebComp_Bodegaswc.componentjscripts();
      }
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we0P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0P2( ) ;
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
      return formatLink("com.orions2.viewalm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode)) ;
   }

   public String getPgmname( )
   {
      return "ViewALM_ALMACEN" ;
   }

   public String getPgmdesc( )
   {
      return "View ALM_ALMACEN" ;
   }

   public void wb0P0( )
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
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-sm-offset-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewtitle_Internalname, "Almacén Information", "", "", lblViewtitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ViewALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 ViewActionsBackCell", "Right", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewall_Internalname, "Work With Almacéns", lblViewall_Link, "", lblViewall_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "BtnTextBlockBack", 0, "", lblViewall_Visible, 1, (short)(0), "HLP_ViewALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabtable_1_Internalname, 1, 0, "px", 0, "px", "ViewTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Descripcion_Internalname, "Descripción Almacén", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Descripcion_Internalname, A252Alma_Descripcion, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtAlma_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ViewALM_ALMACEN.htm");
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
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"TABContainer"+"\"></div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblGeneral_title_Internalname, "General", "", "", lblGeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_ALMACEN.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "General") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablegeneral_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0029"+"", GXutil.rtrim( WebComp_Generalwc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0029"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0029"+"");
               }
               WebComp_Generalwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblBodegas_title_Internalname, "BODEGAS DEL ALMACEN", "", "", lblBodegas_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_ALMACEN.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "BODEGAS") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablebodegas_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0037"+"", GXutil.rtrim( WebComp_Bodegaswc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0037"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Bodegaswc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldBodegaswc), GXutil.lower( WebComp_Bodegaswc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
               }
               WebComp_Bodegaswc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldBodegaswc), GXutil.lower( WebComp_Bodegaswc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "View ALM_ALMACEN", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0P0( ) ;
   }

   public void ws0P2( )
   {
      start0P2( ) ;
      evt0P2( ) ;
   }

   public void evt0P2( )
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
                           e110P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e120P2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 29 )
                     {
                        OldGeneralwc = httpContext.cgiGet( "W0029") ;
                        if ( ( GXutil.len( OldGeneralwc) == 0 ) || ( GXutil.strcmp(OldGeneralwc, WebComp_Generalwc_Component) != 0 ) )
                        {
                           WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldGeneralwc + "_impl", remoteHandle, context);
                           WebComp_Generalwc_Component = OldGeneralwc ;
                        }
                        if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
                        {
                           WebComp_Generalwc.componentprocess("W0029", "", sEvt);
                        }
                        WebComp_Generalwc_Component = OldGeneralwc ;
                     }
                     else if ( nCmpId == 37 )
                     {
                        OldBodegaswc = httpContext.cgiGet( "W0037") ;
                        if ( ( GXutil.len( OldBodegaswc) == 0 ) || ( GXutil.strcmp(OldBodegaswc, WebComp_Bodegaswc_Component) != 0 ) )
                        {
                           WebComp_Bodegaswc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldBodegaswc + "_impl", remoteHandle, context);
                           WebComp_Bodegaswc_Component = OldBodegaswc ;
                        }
                        if ( GXutil.len( WebComp_Bodegaswc_Component) != 0 )
                        {
                           WebComp_Bodegaswc.componentprocess("W0037", "", sEvt);
                        }
                        WebComp_Bodegaswc_Component = OldBodegaswc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we0P2( )
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

   public void pa0P2( )
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
      rf0P2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "ViewALM_ALMACEN" ;
      Gx_err = (short)(0) ;
   }

   public void rf0P2( )
   {
      initialize_formulas( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
            {
               WebComp_Generalwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Bodegaswc_Component) != 0 )
            {
               WebComp_Bodegaswc.componentstart();
            }
         }
      }
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H000P2 */
         pr_default.execute(0, new Object[] {new Long(AV15Cent_Id), AV14Alma_Modulo, AV13Alma_Codigo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1Cent_Id = H000P2_A1Cent_Id[0] ;
            A27Alma_Modulo = H000P2_A27Alma_Modulo[0] ;
            A28Alma_Codigo = H000P2_A28Alma_Codigo[0] ;
            A252Alma_Descripcion = H000P2_A252Alma_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
            /* Execute user event: Load */
            e120P2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb0P0( ) ;
      }
   }

   public void strup0P0( )
   {
      /* Before Start, stand alone formulas. */
      AV18Pgmname = "ViewALM_ALMACEN" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e110P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         /* Read saved values. */
         AV13Alma_Codigo = httpContext.cgiGet( "vALMA_CODIGO") ;
         AV14Alma_Modulo = httpContext.cgiGet( "vALMA_MODULO") ;
         AV15Cent_Id = localUtil.ctol( httpContext.cgiGet( "vCENT_ID"), ",", ".") ;
         AV12LoadAllTabs = GXutil.strtobool( httpContext.cgiGet( "vLOADALLTABS")) ;
         AV8SelectedTabCode = httpContext.cgiGet( "vSELECTEDTABCODE") ;
         Tab_Class = httpContext.cgiGet( "TAB_Class") ;
         Tab_Activepagecontrolname = httpContext.cgiGet( "TAB_Activepagecontrolname") ;
         Tab_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB_Pagecount"), ",", ".")) ;
         Tab_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB_Historymanagement")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "ViewALM_ALMACEN" ;
         A252Alma_Descripcion = httpContext.cgiGet( edtAlma_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("viewalm_almacen:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e110P2 ();
      if (returnInSub) return;
   }

   public void e110P2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV18Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV19GXLvl6 = (byte)(0) ;
      /* Using cursor H000P3 */
      pr_default.execute(1, new Object[] {new Long(AV15Cent_Id), AV14Alma_Modulo, AV13Alma_Codigo, AV13Alma_Codigo, AV14Alma_Modulo, new Long(AV15Cent_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1Cent_Id = H000P3_A1Cent_Id[0] ;
         A27Alma_Modulo = H000P3_A27Alma_Modulo[0] ;
         A28Alma_Codigo = H000P3_A28Alma_Codigo[0] ;
         A252Alma_Descripcion = H000P3_A252Alma_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         AV19GXLvl6 = (byte)(1) ;
         Form.setCaption( A252Alma_Descripcion );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Link = formatLink("com.orions2.wwalm_almacen")  ;
         httpContext.ajax_rsp_assign_prop("", false, lblViewall_Internalname, "Link", lblViewall_Link, true);
         AV11Exists = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV19GXLvl6 == 0 )
      {
         Form.setCaption( "Record not found" );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblViewall_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblViewall_Visible, 5, 0)), true);
         AV11Exists = false ;
      }
      AV12LoadAllTabs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12LoadAllTabs", AV12LoadAllTabs);
      if ( AV11Exists )
      {
         AV8SelectedTabCode = AV7TabCode ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8SelectedTabCode", AV8SelectedTabCode);
         Tab_Activepagecontrolname = AV8SelectedTabCode ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Tab_Internalname, "ActivePageControlName", Tab_Activepagecontrolname);
         /* Execute user subroutine: 'LOAD TAB' */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void S112( )
   {
      /* 'LOAD TAB' Routine */
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "") == 0 ) || ( GXutil.strcmp(AV8SelectedTabCode, "General") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Generalwc_Component), GXutil.lower( "ALM_ALMACENGeneral")) != 0 )
         {
            WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_almacengeneral_impl", remoteHandle, context);
            WebComp_Generalwc_Component = "ALM_ALMACENGeneral" ;
         }
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.setjustcreated();
            WebComp_Generalwc.componentprepare(new Object[] {"W0029","",AV13Alma_Codigo,AV14Alma_Modulo,new Long(AV15Cent_Id)});
            WebComp_Generalwc.componentbind(new Object[] {"","",""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0029"+"");
            WebComp_Generalwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "BODEGAS") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Bodegaswc_Component), GXutil.lower( "ALM_ALMACENBODEGASWC")) != 0 )
         {
            WebComp_Bodegaswc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_almacenbodegaswc_impl", remoteHandle, context);
            WebComp_Bodegaswc_Component = "ALM_ALMACENBODEGASWC" ;
         }
         if ( GXutil.len( WebComp_Bodegaswc_Component) != 0 )
         {
            WebComp_Bodegaswc.setjustcreated();
            WebComp_Bodegaswc.componentprepare(new Object[] {"W0037","",AV13Alma_Codigo,AV14Alma_Modulo,new Long(AV15Cent_Id)});
            WebComp_Bodegaswc.componentbind(new Object[] {"","",""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
            WebComp_Bodegaswc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e120P2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV13Alma_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Alma_Codigo", AV13Alma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Alma_Codigo, ""))));
      AV14Alma_Modulo = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Alma_Modulo", AV14Alma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Alma_Modulo, ""))));
      AV15Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Id", GXutil.ltrim( GXutil.str( AV15Cent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
      AV7TabCode = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7TabCode", AV7TabCode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
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
      pa0P2( ) ;
      ws0P2( ) ;
      we0P2( ) ;
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
      if ( ! ( WebComp_Generalwc == null ) )
      {
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Bodegaswc == null ) )
      {
         if ( GXutil.len( WebComp_Bodegaswc_Component) != 0 )
         {
            WebComp_Bodegaswc.componentthemes();
         }
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414175285");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("viewalm_almacen.js", "?201861414175285");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "");
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "");
      httpContext.AddJavascriptSource("Tab/TabRender.js", "");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblViewtitle_Internalname = "VIEWTITLE" ;
      lblViewall_Internalname = "VIEWALL" ;
      divTabletop_Internalname = "TABLETOP" ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION" ;
      divTabtable_1_Internalname = "TABTABLE_1" ;
      lblGeneral_title_Internalname = "GENERAL_TITLE" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblBodegas_title_Internalname = "BODEGAS_TITLE" ;
      divTablebodegas_Internalname = "TABLEBODEGAS" ;
      Tab_Internalname = "TAB" ;
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
      edtAlma_Descripcion_Jsonclick = "" ;
      edtAlma_Descripcion_Enabled = 0 ;
      lblViewall_Link = "" ;
      lblViewall_Visible = 1 ;
      Tab_Historymanagement = GXutil.toBoolean( -1) ;
      Tab_Pagecount = 2 ;
      Tab_Class = "WWTab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "View ALM_ALMACEN" );
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
      wcpOAV13Alma_Codigo = "" ;
      wcpOAV14Alma_Modulo = "" ;
      wcpOAV7TabCode = "" ;
      Tab_Activepagecontrolname = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13Alma_Codigo = "" ;
      AV14Alma_Modulo = "" ;
      AV7TabCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8SelectedTabCode = "" ;
      A252Alma_Descripcion = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblViewtitle_Jsonclick = "" ;
      lblViewall_Jsonclick = "" ;
      lblGeneral_title_Jsonclick = "" ;
      WebComp_Generalwc_Component = "" ;
      OldGeneralwc = "" ;
      lblBodegas_title_Jsonclick = "" ;
      WebComp_Bodegaswc_Component = "" ;
      OldBodegaswc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      H000P2_A1Cent_Id = new long[1] ;
      H000P2_A27Alma_Modulo = new String[] {""} ;
      H000P2_A28Alma_Codigo = new String[] {""} ;
      H000P2_A252Alma_Descripcion = new String[] {""} ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      hsh = "" ;
      H000P3_A1Cent_Id = new long[1] ;
      H000P3_A27Alma_Modulo = new String[] {""} ;
      H000P3_A28Alma_Codigo = new String[] {""} ;
      H000P3_A252Alma_Descripcion = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.viewalm_almacen__default(),
         new Object[] {
             new Object[] {
            H000P2_A1Cent_Id, H000P2_A27Alma_Modulo, H000P2_A28Alma_Codigo, H000P2_A252Alma_Descripcion
            }
            , new Object[] {
            H000P3_A1Cent_Id, H000P3_A27Alma_Modulo, H000P3_A28Alma_Codigo, H000P3_A252Alma_Descripcion
            }
         }
      );
      AV18Pgmname = "ViewALM_ALMACEN" ;
      /* GeneXus formulas. */
      AV18Pgmname = "ViewALM_ALMACEN" ;
      Gx_err = (short)(0) ;
      WebComp_Generalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Bodegaswc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV19GXLvl6 ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Tab_Pagecount ;
   private int lblViewall_Visible ;
   private int edtAlma_Descripcion_Enabled ;
   private int idxLst ;
   private long wcpOAV15Cent_Id ;
   private long AV15Cent_Id ;
   private long A1Cent_Id ;
   private String wcpOAV7TabCode ;
   private String Tab_Activepagecontrolname ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7TabCode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV8SelectedTabCode ;
   private String Tab_Class ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String lblViewtitle_Internalname ;
   private String lblViewtitle_Jsonclick ;
   private String lblViewall_Internalname ;
   private String lblViewall_Link ;
   private String lblViewall_Jsonclick ;
   private String divTabtable_1_Internalname ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String lblGeneral_title_Internalname ;
   private String lblGeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String WebComp_Generalwc_Component ;
   private String OldGeneralwc ;
   private String lblBodegas_title_Internalname ;
   private String lblBodegas_title_Jsonclick ;
   private String divTablebodegas_Internalname ;
   private String WebComp_Bodegaswc_Component ;
   private String OldBodegaswc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String Tab_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12LoadAllTabs ;
   private boolean Tab_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV11Exists ;
   private String wcpOAV13Alma_Codigo ;
   private String wcpOAV14Alma_Modulo ;
   private String AV13Alma_Codigo ;
   private String AV14Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Generalwc ;
   private GXWebComponent WebComp_Bodegaswc ;
   private IDataStoreProvider pr_default ;
   private long[] H000P2_A1Cent_Id ;
   private String[] H000P2_A27Alma_Modulo ;
   private String[] H000P2_A28Alma_Codigo ;
   private String[] H000P2_A252Alma_Descripcion ;
   private long[] H000P3_A1Cent_Id ;
   private String[] H000P3_A27Alma_Modulo ;
   private String[] H000P3_A28Alma_Codigo ;
   private String[] H000P3_A252Alma_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class viewalm_almacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000P2", "SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000P3", "SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Alma_Descripcion FROM ALM_ALMACEN WHERE (Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ?) AND (Alma_Codigo = ? and Alma_Modulo = ? and Cent_Id = ?) ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 8);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
      }
   }

}

