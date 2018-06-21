/*
               File: viewalm_cuentadante_multi_impl
        Description: View ALM_CUENTADANTE_MULTI
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:23.68
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

public final  class viewalm_cuentadante_multi_impl extends GXDataArea
{
   public viewalm_cuentadante_multi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public viewalm_cuentadante_multi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( viewalm_cuentadante_multi_impl.class ));
   }

   public viewalm_cuentadante_multi_impl( int remoteHandle ,
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
            AV13Cuen_Identificacion = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV13Cuen_Identificacion, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
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
      pa1S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1S2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414182371");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.viewalm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV13Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABCODE", GXutil.rtrim( AV7TabCode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Class", GXutil.rtrim( Tab_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Historymanagement", GXutil.booltostr( Tab_Historymanagement));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ViewALM_CUENTADANTE_MULTI" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("viewalm_cuentadante_multi:[SendSecurityCheck]"+forbiddenHiddens);
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
      if ( ! ( WebComp_Multiplewc == null ) )
      {
         WebComp_Multiplewc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_inventario_devolutivowc == null ) )
      {
         WebComp_Alm_inventario_devolutivowc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_transaccionwc == null ) )
      {
         WebComp_Alm_transaccionwc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_transaccion1wc == null ) )
      {
         WebComp_Alm_transaccion1wc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_transaccion2wc == null ) )
      {
         WebComp_Alm_transaccion2wc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_transaccion3wc == null ) )
      {
         WebComp_Alm_transaccion3wc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_almacenwc == null ) )
      {
         WebComp_Alm_almacenwc.componentjscripts();
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
         we1S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1S2( ) ;
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
      return formatLink("com.orions2.viewalm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode)) ;
   }

   public String getPgmname( )
   {
      return "ViewALM_CUENTADANTE_MULTI" ;
   }

   public String getPgmdesc( )
   {
      return "View ALM_CUENTADANTE_MULTI" ;
   }

   public void wb1S0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewtitle_Internalname, "ALM_CUENTADANTE_MULTI Information", "", "", lblViewtitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 ViewActionsBackCell", "Right", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewall_Internalname, "Cuentadante Multiple", lblViewall_Link, "", lblViewall_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "BtnTextBlockBack", 0, "", lblViewall_Visible, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Cuentadante", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Nombre_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ViewALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblGeneral_title_Internalname, "General", "", "", lblGeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblMultiple_title_Internalname, "MULTIPLE", "", "", lblMultiple_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "MULTIPLE") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablemultiple_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0037"+"", GXutil.rtrim( WebComp_Multiplewc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0037"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Multiplewc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldMultiplewc), GXutil.lower( WebComp_Multiplewc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
               }
               WebComp_Multiplewc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldMultiplewc), GXutil.lower( WebComp_Multiplewc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_inventario_devolutivo_title_Internalname, "Inventario devolutivo", "", "", lblAlm_inventario_devolutivo_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_INVENTARIO_DEVOLUTIVO") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_inventario_devolutivo_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0045"+"", GXutil.rtrim( WebComp_Alm_inventario_devolutivowc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0045"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_inventario_devolutivowc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_inventario_devolutivowc), GXutil.lower( WebComp_Alm_inventario_devolutivowc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
               }
               WebComp_Alm_inventario_devolutivowc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_inventario_devolutivowc), GXutil.lower( WebComp_Alm_inventario_devolutivowc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_transaccion_title_Internalname, "Cuentadante Origen", "", "", lblAlm_transaccion_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TRANSACCION") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_transaccion_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0053"+"", GXutil.rtrim( WebComp_Alm_transaccionwc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0053"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_transaccionwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccionwc), GXutil.lower( WebComp_Alm_transaccionwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0053"+"");
               }
               WebComp_Alm_transaccionwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccionwc), GXutil.lower( WebComp_Alm_transaccionwc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_transaccion1_title_Internalname, "Proveedor", "", "", lblAlm_transaccion1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TRANSACCION1") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_transaccion1_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0061"+"", GXutil.rtrim( WebComp_Alm_transaccion1wc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0061"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_transaccion1wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion1wc), GXutil.lower( WebComp_Alm_transaccion1wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0061"+"");
               }
               WebComp_Alm_transaccion1wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion1wc), GXutil.lower( WebComp_Alm_transaccion1wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title6"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_transaccion2_title_Internalname, "Cuentadante Destino", "", "", lblAlm_transaccion2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TRANSACCION2") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_transaccion2_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0069"+"", GXutil.rtrim( WebComp_Alm_transaccion2wc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0069"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_transaccion2wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion2wc), GXutil.lower( WebComp_Alm_transaccion2wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0069"+"");
               }
               WebComp_Alm_transaccion2wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion2wc), GXutil.lower( WebComp_Alm_transaccion2wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title7"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_transaccion3_title_Internalname, "Cuentadante Responsabilidad", "", "", lblAlm_transaccion3_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TRANSACCION3") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_transaccion3_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0077"+"", GXutil.rtrim( WebComp_Alm_transaccion3wc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0077"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_transaccion3wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion3wc), GXutil.lower( WebComp_Alm_transaccion3wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0077"+"");
               }
               WebComp_Alm_transaccion3wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_transaccion3wc), GXutil.lower( WebComp_Alm_transaccion3wc_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title8"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_almacen_title_Internalname, "Responsable Almacen", "", "", lblAlm_almacen_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_CUENTADANTE_MULTI.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_ALMACEN") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel8"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_almacen_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0085"+"", GXutil.rtrim( WebComp_Alm_almacenwc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0085"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_almacenwc), GXutil.lower( WebComp_Alm_almacenwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0085"+"");
               }
               WebComp_Alm_almacenwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_almacenwc), GXutil.lower( WebComp_Alm_almacenwc_Component)) != 0 )
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

   public void start1S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "View ALM_CUENTADANTE_MULTI", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1S0( ) ;
   }

   public void ws1S2( )
   {
      start1S2( ) ;
      evt1S2( ) ;
   }

   public void evt1S2( )
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
                           e111S2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e121S2 ();
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
                        OldMultiplewc = httpContext.cgiGet( "W0037") ;
                        if ( ( GXutil.len( OldMultiplewc) == 0 ) || ( GXutil.strcmp(OldMultiplewc, WebComp_Multiplewc_Component) != 0 ) )
                        {
                           WebComp_Multiplewc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldMultiplewc + "_impl", remoteHandle, context);
                           WebComp_Multiplewc_Component = OldMultiplewc ;
                        }
                        if ( GXutil.len( WebComp_Multiplewc_Component) != 0 )
                        {
                           WebComp_Multiplewc.componentprocess("W0037", "", sEvt);
                        }
                        WebComp_Multiplewc_Component = OldMultiplewc ;
                     }
                     else if ( nCmpId == 45 )
                     {
                        OldAlm_inventario_devolutivowc = httpContext.cgiGet( "W0045") ;
                        if ( ( GXutil.len( OldAlm_inventario_devolutivowc) == 0 ) || ( GXutil.strcmp(OldAlm_inventario_devolutivowc, WebComp_Alm_inventario_devolutivowc_Component) != 0 ) )
                        {
                           WebComp_Alm_inventario_devolutivowc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_inventario_devolutivowc + "_impl", remoteHandle, context);
                           WebComp_Alm_inventario_devolutivowc_Component = OldAlm_inventario_devolutivowc ;
                        }
                        if ( GXutil.len( WebComp_Alm_inventario_devolutivowc_Component) != 0 )
                        {
                           WebComp_Alm_inventario_devolutivowc.componentprocess("W0045", "", sEvt);
                        }
                        WebComp_Alm_inventario_devolutivowc_Component = OldAlm_inventario_devolutivowc ;
                     }
                     else if ( nCmpId == 53 )
                     {
                        OldAlm_transaccionwc = httpContext.cgiGet( "W0053") ;
                        if ( ( GXutil.len( OldAlm_transaccionwc) == 0 ) || ( GXutil.strcmp(OldAlm_transaccionwc, WebComp_Alm_transaccionwc_Component) != 0 ) )
                        {
                           WebComp_Alm_transaccionwc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_transaccionwc + "_impl", remoteHandle, context);
                           WebComp_Alm_transaccionwc_Component = OldAlm_transaccionwc ;
                        }
                        if ( GXutil.len( WebComp_Alm_transaccionwc_Component) != 0 )
                        {
                           WebComp_Alm_transaccionwc.componentprocess("W0053", "", sEvt);
                        }
                        WebComp_Alm_transaccionwc_Component = OldAlm_transaccionwc ;
                     }
                     else if ( nCmpId == 61 )
                     {
                        OldAlm_transaccion1wc = httpContext.cgiGet( "W0061") ;
                        if ( ( GXutil.len( OldAlm_transaccion1wc) == 0 ) || ( GXutil.strcmp(OldAlm_transaccion1wc, WebComp_Alm_transaccion1wc_Component) != 0 ) )
                        {
                           WebComp_Alm_transaccion1wc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_transaccion1wc + "_impl", remoteHandle, context);
                           WebComp_Alm_transaccion1wc_Component = OldAlm_transaccion1wc ;
                        }
                        if ( GXutil.len( WebComp_Alm_transaccion1wc_Component) != 0 )
                        {
                           WebComp_Alm_transaccion1wc.componentprocess("W0061", "", sEvt);
                        }
                        WebComp_Alm_transaccion1wc_Component = OldAlm_transaccion1wc ;
                     }
                     else if ( nCmpId == 69 )
                     {
                        OldAlm_transaccion2wc = httpContext.cgiGet( "W0069") ;
                        if ( ( GXutil.len( OldAlm_transaccion2wc) == 0 ) || ( GXutil.strcmp(OldAlm_transaccion2wc, WebComp_Alm_transaccion2wc_Component) != 0 ) )
                        {
                           WebComp_Alm_transaccion2wc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_transaccion2wc + "_impl", remoteHandle, context);
                           WebComp_Alm_transaccion2wc_Component = OldAlm_transaccion2wc ;
                        }
                        if ( GXutil.len( WebComp_Alm_transaccion2wc_Component) != 0 )
                        {
                           WebComp_Alm_transaccion2wc.componentprocess("W0069", "", sEvt);
                        }
                        WebComp_Alm_transaccion2wc_Component = OldAlm_transaccion2wc ;
                     }
                     else if ( nCmpId == 77 )
                     {
                        OldAlm_transaccion3wc = httpContext.cgiGet( "W0077") ;
                        if ( ( GXutil.len( OldAlm_transaccion3wc) == 0 ) || ( GXutil.strcmp(OldAlm_transaccion3wc, WebComp_Alm_transaccion3wc_Component) != 0 ) )
                        {
                           WebComp_Alm_transaccion3wc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_transaccion3wc + "_impl", remoteHandle, context);
                           WebComp_Alm_transaccion3wc_Component = OldAlm_transaccion3wc ;
                        }
                        if ( GXutil.len( WebComp_Alm_transaccion3wc_Component) != 0 )
                        {
                           WebComp_Alm_transaccion3wc.componentprocess("W0077", "", sEvt);
                        }
                        WebComp_Alm_transaccion3wc_Component = OldAlm_transaccion3wc ;
                     }
                     else if ( nCmpId == 85 )
                     {
                        OldAlm_almacenwc = httpContext.cgiGet( "W0085") ;
                        if ( ( GXutil.len( OldAlm_almacenwc) == 0 ) || ( GXutil.strcmp(OldAlm_almacenwc, WebComp_Alm_almacenwc_Component) != 0 ) )
                        {
                           WebComp_Alm_almacenwc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_almacenwc + "_impl", remoteHandle, context);
                           WebComp_Alm_almacenwc_Component = OldAlm_almacenwc ;
                        }
                        if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
                        {
                           WebComp_Alm_almacenwc.componentprocess("W0085", "", sEvt);
                        }
                        WebComp_Alm_almacenwc_Component = OldAlm_almacenwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1S2( )
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

   public void pa1S2( )
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
      rf1S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV16Pgmname = "ViewALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
   }

   public void rf1S2( )
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
            if ( GXutil.len( WebComp_Multiplewc_Component) != 0 )
            {
               WebComp_Multiplewc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_inventario_devolutivowc_Component) != 0 )
            {
               WebComp_Alm_inventario_devolutivowc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_transaccionwc_Component) != 0 )
            {
               WebComp_Alm_transaccionwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_transaccion1wc_Component) != 0 )
            {
               WebComp_Alm_transaccion1wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_transaccion2wc_Component) != 0 )
            {
               WebComp_Alm_transaccion2wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_transaccion3wc_Component) != 0 )
            {
               WebComp_Alm_transaccion3wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
            {
               WebComp_Alm_almacenwc.componentstart();
            }
         }
      }
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H001S2 */
         pr_default.execute(0, new Object[] {new Long(AV13Cuen_Identificacion)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A43Cuen_Identificacion = H001S2_A43Cuen_Identificacion[0] ;
            A44Cuen_Nombre = H001S2_A44Cuen_Nombre[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
            n44Cuen_Nombre = H001S2_n44Cuen_Nombre[0] ;
            /* Execute user event: Load */
            e121S2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1S0( ) ;
      }
   }

   public void strup1S0( )
   {
      /* Before Start, stand alone formulas. */
      AV16Pgmname = "ViewALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
         n44Cuen_Nombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
         /* Read saved values. */
         AV13Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "vCUEN_IDENTIFICACION"), ",", ".") ;
         AV12LoadAllTabs = GXutil.strtobool( httpContext.cgiGet( "vLOADALLTABS")) ;
         AV8SelectedTabCode = httpContext.cgiGet( "vSELECTEDTABCODE") ;
         Tab_Class = httpContext.cgiGet( "TAB_Class") ;
         Tab_Activepagecontrolname = httpContext.cgiGet( "TAB_Activepagecontrolname") ;
         Tab_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB_Pagecount"), ",", ".")) ;
         Tab_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB_Historymanagement")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "ViewALM_CUENTADANTE_MULTI" ;
         A44Cuen_Nombre = httpContext.cgiGet( edtCuen_Nombre_Internalname) ;
         n44Cuen_Nombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("viewalm_cuentadante_multi:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e111S2 ();
      if (returnInSub) return;
   }

   public void e111S2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV17GXLvl6 = (byte)(0) ;
      /* Using cursor H001S3 */
      pr_default.execute(1, new Object[] {new Long(AV13Cuen_Identificacion)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A43Cuen_Identificacion = H001S3_A43Cuen_Identificacion[0] ;
         A44Cuen_Nombre = H001S3_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
         n44Cuen_Nombre = H001S3_n44Cuen_Nombre[0] ;
         AV17GXLvl6 = (byte)(1) ;
         Form.setCaption( A44Cuen_Nombre );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Link = formatLink("com.orions2.wwalm_cuentadante_multi")  ;
         httpContext.ajax_rsp_assign_prop("", false, lblViewall_Internalname, "Link", lblViewall_Link, true);
         AV11Exists = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV17GXLvl6 == 0 )
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
         if ( GXutil.strcmp(GXutil.lower( WebComp_Generalwc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIGeneral")) != 0 )
         {
            WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multigeneral_impl", remoteHandle, context);
            WebComp_Generalwc_Component = "ALM_CUENTADANTE_MULTIGeneral" ;
         }
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.setjustcreated();
            WebComp_Generalwc.componentprepare(new Object[] {"W0029","",new Long(AV13Cuen_Identificacion)});
            WebComp_Generalwc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0029"+"");
            WebComp_Generalwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "MULTIPLE") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Multiplewc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIMULTIPLEWC")) != 0 )
         {
            WebComp_Multiplewc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multimultiplewc_impl", remoteHandle, context);
            WebComp_Multiplewc_Component = "ALM_CUENTADANTE_MULTIMULTIPLEWC" ;
         }
         if ( GXutil.len( WebComp_Multiplewc_Component) != 0 )
         {
            WebComp_Multiplewc.setjustcreated();
            WebComp_Multiplewc.componentprepare(new Object[] {"W0037","",new Long(AV13Cuen_Identificacion)});
            WebComp_Multiplewc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
            WebComp_Multiplewc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_INVENTARIO_DEVOLUTIVO") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_inventario_devolutivowc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_INVENTARIO_DEVOLUTIVOWC")) != 0 )
         {
            WebComp_Alm_inventario_devolutivowc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_inventario_devolutivowc_impl", remoteHandle, context);
            WebComp_Alm_inventario_devolutivowc_Component = "ALM_CUENTADANTE_MULTIALM_INVENTARIO_DEVOLUTIVOWC" ;
         }
         if ( GXutil.len( WebComp_Alm_inventario_devolutivowc_Component) != 0 )
         {
            WebComp_Alm_inventario_devolutivowc.setjustcreated();
            WebComp_Alm_inventario_devolutivowc.componentprepare(new Object[] {"W0045","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_inventario_devolutivowc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
            WebComp_Alm_inventario_devolutivowc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TRANSACCION") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_transaccionwc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_TRANSACCIONWC")) != 0 )
         {
            WebComp_Alm_transaccionwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_transaccionwc_impl", remoteHandle, context);
            WebComp_Alm_transaccionwc_Component = "ALM_CUENTADANTE_MULTIALM_TRANSACCIONWC" ;
         }
         if ( GXutil.len( WebComp_Alm_transaccionwc_Component) != 0 )
         {
            WebComp_Alm_transaccionwc.setjustcreated();
            WebComp_Alm_transaccionwc.componentprepare(new Object[] {"W0053","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_transaccionwc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0053"+"");
            WebComp_Alm_transaccionwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TRANSACCION1") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_transaccion1wc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_TRANSACCION1WC")) != 0 )
         {
            WebComp_Alm_transaccion1wc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_transaccion1wc_impl", remoteHandle, context);
            WebComp_Alm_transaccion1wc_Component = "ALM_CUENTADANTE_MULTIALM_TRANSACCION1WC" ;
         }
         if ( GXutil.len( WebComp_Alm_transaccion1wc_Component) != 0 )
         {
            WebComp_Alm_transaccion1wc.setjustcreated();
            WebComp_Alm_transaccion1wc.componentprepare(new Object[] {"W0061","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_transaccion1wc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0061"+"");
            WebComp_Alm_transaccion1wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TRANSACCION2") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_transaccion2wc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_TRANSACCION2WC")) != 0 )
         {
            WebComp_Alm_transaccion2wc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_transaccion2wc_impl", remoteHandle, context);
            WebComp_Alm_transaccion2wc_Component = "ALM_CUENTADANTE_MULTIALM_TRANSACCION2WC" ;
         }
         if ( GXutil.len( WebComp_Alm_transaccion2wc_Component) != 0 )
         {
            WebComp_Alm_transaccion2wc.setjustcreated();
            WebComp_Alm_transaccion2wc.componentprepare(new Object[] {"W0069","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_transaccion2wc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0069"+"");
            WebComp_Alm_transaccion2wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TRANSACCION3") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_transaccion3wc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_TRANSACCION3WC")) != 0 )
         {
            WebComp_Alm_transaccion3wc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_transaccion3wc_impl", remoteHandle, context);
            WebComp_Alm_transaccion3wc_Component = "ALM_CUENTADANTE_MULTIALM_TRANSACCION3WC" ;
         }
         if ( GXutil.len( WebComp_Alm_transaccion3wc_Component) != 0 )
         {
            WebComp_Alm_transaccion3wc.setjustcreated();
            WebComp_Alm_transaccion3wc.componentprepare(new Object[] {"W0077","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_transaccion3wc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0077"+"");
            WebComp_Alm_transaccion3wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_ALMACEN") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_almacenwc_Component), GXutil.lower( "ALM_CUENTADANTE_MULTIALM_ALMACENWC")) != 0 )
         {
            WebComp_Alm_almacenwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_cuentadante_multialm_almacenwc_impl", remoteHandle, context);
            WebComp_Alm_almacenwc_Component = "ALM_CUENTADANTE_MULTIALM_ALMACENWC" ;
         }
         if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
         {
            WebComp_Alm_almacenwc.setjustcreated();
            WebComp_Alm_almacenwc.componentprepare(new Object[] {"W0085","",new Long(AV13Cuen_Identificacion)});
            WebComp_Alm_almacenwc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0085"+"");
            WebComp_Alm_almacenwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e121S2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV13Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV13Cuen_Identificacion, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      AV7TabCode = (String)getParm(obj,1) ;
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
      pa1S2( ) ;
      ws1S2( ) ;
      we1S2( ) ;
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
      if ( ! ( WebComp_Multiplewc == null ) )
      {
         if ( GXutil.len( WebComp_Multiplewc_Component) != 0 )
         {
            WebComp_Multiplewc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_inventario_devolutivowc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_inventario_devolutivowc_Component) != 0 )
         {
            WebComp_Alm_inventario_devolutivowc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_transaccionwc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_transaccionwc_Component) != 0 )
         {
            WebComp_Alm_transaccionwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_transaccion1wc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_transaccion1wc_Component) != 0 )
         {
            WebComp_Alm_transaccion1wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_transaccion2wc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_transaccion2wc_Component) != 0 )
         {
            WebComp_Alm_transaccion2wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_transaccion3wc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_transaccion3wc_Component) != 0 )
         {
            WebComp_Alm_transaccion3wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_almacenwc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
         {
            WebComp_Alm_almacenwc.componentthemes();
         }
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414182448");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("viewalm_cuentadante_multi.js", "?201861414182448");
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
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      divTabtable_1_Internalname = "TABTABLE_1" ;
      lblGeneral_title_Internalname = "GENERAL_TITLE" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblMultiple_title_Internalname = "MULTIPLE_TITLE" ;
      divTablemultiple_Internalname = "TABLEMULTIPLE" ;
      lblAlm_inventario_devolutivo_title_Internalname = "ALM_INVENTARIO_DEVOLUTIVO_TITLE" ;
      divTablealm_inventario_devolutivo_Internalname = "TABLEALM_INVENTARIO_DEVOLUTIVO" ;
      lblAlm_transaccion_title_Internalname = "ALM_TRANSACCION_TITLE" ;
      divTablealm_transaccion_Internalname = "TABLEALM_TRANSACCION" ;
      lblAlm_transaccion1_title_Internalname = "ALM_TRANSACCION1_TITLE" ;
      divTablealm_transaccion1_Internalname = "TABLEALM_TRANSACCION1" ;
      lblAlm_transaccion2_title_Internalname = "ALM_TRANSACCION2_TITLE" ;
      divTablealm_transaccion2_Internalname = "TABLEALM_TRANSACCION2" ;
      lblAlm_transaccion3_title_Internalname = "ALM_TRANSACCION3_TITLE" ;
      divTablealm_transaccion3_Internalname = "TABLEALM_TRANSACCION3" ;
      lblAlm_almacen_title_Internalname = "ALM_ALMACEN_TITLE" ;
      divTablealm_almacen_Internalname = "TABLEALM_ALMACEN" ;
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
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Enabled = 0 ;
      lblViewall_Link = "" ;
      lblViewall_Visible = 1 ;
      Tab_Historymanagement = GXutil.toBoolean( -1) ;
      Tab_Pagecount = 8 ;
      Tab_Class = "WWTab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "View ALM_CUENTADANTE_MULTI" );
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
      wcpOAV7TabCode = "" ;
      Tab_Activepagecontrolname = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7TabCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8SelectedTabCode = "" ;
      A44Cuen_Nombre = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblViewtitle_Jsonclick = "" ;
      lblViewall_Jsonclick = "" ;
      lblGeneral_title_Jsonclick = "" ;
      WebComp_Generalwc_Component = "" ;
      OldGeneralwc = "" ;
      lblMultiple_title_Jsonclick = "" ;
      WebComp_Multiplewc_Component = "" ;
      OldMultiplewc = "" ;
      lblAlm_inventario_devolutivo_title_Jsonclick = "" ;
      WebComp_Alm_inventario_devolutivowc_Component = "" ;
      OldAlm_inventario_devolutivowc = "" ;
      lblAlm_transaccion_title_Jsonclick = "" ;
      WebComp_Alm_transaccionwc_Component = "" ;
      OldAlm_transaccionwc = "" ;
      lblAlm_transaccion1_title_Jsonclick = "" ;
      WebComp_Alm_transaccion1wc_Component = "" ;
      OldAlm_transaccion1wc = "" ;
      lblAlm_transaccion2_title_Jsonclick = "" ;
      WebComp_Alm_transaccion2wc_Component = "" ;
      OldAlm_transaccion2wc = "" ;
      lblAlm_transaccion3_title_Jsonclick = "" ;
      WebComp_Alm_transaccion3wc_Component = "" ;
      OldAlm_transaccion3wc = "" ;
      lblAlm_almacen_title_Jsonclick = "" ;
      WebComp_Alm_almacenwc_Component = "" ;
      OldAlm_almacenwc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Pgmname = "" ;
      scmdbuf = "" ;
      H001S2_A43Cuen_Identificacion = new long[1] ;
      H001S2_A44Cuen_Nombre = new String[] {""} ;
      H001S2_n44Cuen_Nombre = new boolean[] {false} ;
      hsh = "" ;
      H001S3_A43Cuen_Identificacion = new long[1] ;
      H001S3_A44Cuen_Nombre = new String[] {""} ;
      H001S3_n44Cuen_Nombre = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.viewalm_cuentadante_multi__default(),
         new Object[] {
             new Object[] {
            H001S2_A43Cuen_Identificacion, H001S2_A44Cuen_Nombre, H001S2_n44Cuen_Nombre
            }
            , new Object[] {
            H001S3_A43Cuen_Identificacion, H001S3_A44Cuen_Nombre, H001S3_n44Cuen_Nombre
            }
         }
      );
      AV16Pgmname = "ViewALM_CUENTADANTE_MULTI" ;
      /* GeneXus formulas. */
      AV16Pgmname = "ViewALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
      WebComp_Generalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Multiplewc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_inventario_devolutivowc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_transaccionwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_transaccion1wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_transaccion2wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_transaccion3wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_almacenwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV17GXLvl6 ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Tab_Pagecount ;
   private int lblViewall_Visible ;
   private int edtCuen_Nombre_Enabled ;
   private int idxLst ;
   private long wcpOAV13Cuen_Identificacion ;
   private long AV13Cuen_Identificacion ;
   private long A43Cuen_Identificacion ;
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
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Jsonclick ;
   private String lblGeneral_title_Internalname ;
   private String lblGeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String WebComp_Generalwc_Component ;
   private String OldGeneralwc ;
   private String lblMultiple_title_Internalname ;
   private String lblMultiple_title_Jsonclick ;
   private String divTablemultiple_Internalname ;
   private String WebComp_Multiplewc_Component ;
   private String OldMultiplewc ;
   private String lblAlm_inventario_devolutivo_title_Internalname ;
   private String lblAlm_inventario_devolutivo_title_Jsonclick ;
   private String divTablealm_inventario_devolutivo_Internalname ;
   private String WebComp_Alm_inventario_devolutivowc_Component ;
   private String OldAlm_inventario_devolutivowc ;
   private String lblAlm_transaccion_title_Internalname ;
   private String lblAlm_transaccion_title_Jsonclick ;
   private String divTablealm_transaccion_Internalname ;
   private String WebComp_Alm_transaccionwc_Component ;
   private String OldAlm_transaccionwc ;
   private String lblAlm_transaccion1_title_Internalname ;
   private String lblAlm_transaccion1_title_Jsonclick ;
   private String divTablealm_transaccion1_Internalname ;
   private String WebComp_Alm_transaccion1wc_Component ;
   private String OldAlm_transaccion1wc ;
   private String lblAlm_transaccion2_title_Internalname ;
   private String lblAlm_transaccion2_title_Jsonclick ;
   private String divTablealm_transaccion2_Internalname ;
   private String WebComp_Alm_transaccion2wc_Component ;
   private String OldAlm_transaccion2wc ;
   private String lblAlm_transaccion3_title_Internalname ;
   private String lblAlm_transaccion3_title_Jsonclick ;
   private String divTablealm_transaccion3_Internalname ;
   private String WebComp_Alm_transaccion3wc_Component ;
   private String OldAlm_transaccion3wc ;
   private String lblAlm_almacen_title_Internalname ;
   private String lblAlm_almacen_title_Jsonclick ;
   private String divTablealm_almacen_Internalname ;
   private String WebComp_Alm_almacenwc_Component ;
   private String OldAlm_almacenwc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV16Pgmname ;
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
   private boolean n44Cuen_Nombre ;
   private boolean returnInSub ;
   private boolean AV11Exists ;
   private String A44Cuen_Nombre ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Generalwc ;
   private GXWebComponent WebComp_Multiplewc ;
   private GXWebComponent WebComp_Alm_inventario_devolutivowc ;
   private GXWebComponent WebComp_Alm_transaccionwc ;
   private GXWebComponent WebComp_Alm_transaccion1wc ;
   private GXWebComponent WebComp_Alm_transaccion2wc ;
   private GXWebComponent WebComp_Alm_transaccion3wc ;
   private GXWebComponent WebComp_Alm_almacenwc ;
   private IDataStoreProvider pr_default ;
   private long[] H001S2_A43Cuen_Identificacion ;
   private String[] H001S2_A44Cuen_Nombre ;
   private boolean[] H001S2_n44Cuen_Nombre ;
   private long[] H001S3_A43Cuen_Identificacion ;
   private String[] H001S3_A44Cuen_Nombre ;
   private boolean[] H001S3_n44Cuen_Nombre ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class viewalm_cuentadante_multi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001S2", "SELECT Cuen_Identificacion, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001S3", "SELECT Cuen_Identificacion, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

