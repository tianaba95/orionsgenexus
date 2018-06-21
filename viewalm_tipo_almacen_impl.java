/*
               File: viewalm_tipo_almacen_impl
        Description: View ALM_TIPO_ALMACEN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:49.28
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

public final  class viewalm_tipo_almacen_impl extends GXDataArea
{
   public viewalm_tipo_almacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public viewalm_tipo_almacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( viewalm_tipo_almacen_impl.class ));
   }

   public viewalm_tipo_almacen_impl( int remoteHandle ,
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
            AV13Tpal_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Tpal_Id", GXutil.ltrim( GXutil.str( AV13Tpal_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Tpal_Id), "ZZZZZZZZZZ9")));
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
      pa4Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start4Y2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414194932");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.viewalm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Tpal_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTPAL_ID", GXutil.ltrim( localUtil.ntoc( AV13Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABCODE", GXutil.rtrim( AV7TabCode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPAL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Tpal_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Tpal_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Class", GXutil.rtrim( Tab_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Historymanagement", GXutil.booltostr( Tab_Historymanagement));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Activepagecontrolname", GXutil.rtrim( Tab_Activepagecontrolname));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ViewALM_TIPO_ALMACEN" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("viewalm_tipo_almacen:[SendSecurityCheck]"+forbiddenHiddens);
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
      if ( ! ( WebComp_Alm_tipo_movimientowc == null ) )
      {
         WebComp_Alm_tipo_movimientowc.componentjscripts();
      }
      if ( ! ( WebComp_Alm_tipo_movimiento1wc == null ) )
      {
         WebComp_Alm_tipo_movimiento1wc.componentjscripts();
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
         we4Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt4Y2( ) ;
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
      return formatLink("com.orions2.viewalm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Tpal_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TabCode)) ;
   }

   public String getPgmname( )
   {
      return "ViewALM_TIPO_ALMACEN" ;
   }

   public String getPgmdesc( )
   {
      return "View ALM_TIPO_ALMACEN" ;
   }

   public void wb4Y0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewtitle_Internalname, "Tipo de almac�n Information", "", "", lblViewtitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 ViewActionsBackCell", "Right", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewall_Internalname, "Work With Tipo de almac�ns", lblViewall_Link, "", lblViewall_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "BtnTextBlockBack", 0, "", lblViewall_Visible, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Descripcion_Internalname, "Tipo Almac�n", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Descripcion_Internalname, A307Tpal_Descripcion, GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTpal_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ViewALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblGeneral_title_Internalname, "General", "", "", lblGeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_tipo_movimiento_title_Internalname, "Tipo_Alma_Origen", "", "", lblAlm_tipo_movimiento_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TIPO_MOVIMIENTO") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_tipo_movimiento_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0037"+"", GXutil.rtrim( WebComp_Alm_tipo_movimientowc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0037"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_tipo_movimientowc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_tipo_movimientowc), GXutil.lower( WebComp_Alm_tipo_movimientowc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
               }
               WebComp_Alm_tipo_movimientowc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_tipo_movimientowc), GXutil.lower( WebComp_Alm_tipo_movimientowc_Component)) != 0 )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_tipo_movimiento1_title_Internalname, "Tipo_Alma_Destino", "", "", lblAlm_tipo_movimiento1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_TIPO_MOVIMIENTO1") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_tipo_movimiento1_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0045"+"", GXutil.rtrim( WebComp_Alm_tipo_movimiento1wc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0045"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_tipo_movimiento1wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_tipo_movimiento1wc), GXutil.lower( WebComp_Alm_tipo_movimiento1wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
               }
               WebComp_Alm_tipo_movimiento1wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldAlm_tipo_movimiento1wc), GXutil.lower( WebComp_Alm_tipo_movimiento1wc_Component)) != 0 )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblAlm_almacen_title_Internalname, "Almac�n", "", "", lblAlm_almacen_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewALM_TIPO_ALMACEN.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ALM_ALMACEN") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablealm_almacen_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0053"+"", GXutil.rtrim( WebComp_Alm_almacenwc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0053"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldAlm_almacenwc), GXutil.lower( WebComp_Alm_almacenwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0053"+"");
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

   public void start4Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "View ALM_TIPO_ALMACEN", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup4Y0( ) ;
   }

   public void ws4Y2( )
   {
      start4Y2( ) ;
      evt4Y2( ) ;
   }

   public void evt4Y2( )
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
                           e114Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e124Y2 ();
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
                        OldAlm_tipo_movimientowc = httpContext.cgiGet( "W0037") ;
                        if ( ( GXutil.len( OldAlm_tipo_movimientowc) == 0 ) || ( GXutil.strcmp(OldAlm_tipo_movimientowc, WebComp_Alm_tipo_movimientowc_Component) != 0 ) )
                        {
                           WebComp_Alm_tipo_movimientowc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_tipo_movimientowc + "_impl", remoteHandle, context);
                           WebComp_Alm_tipo_movimientowc_Component = OldAlm_tipo_movimientowc ;
                        }
                        if ( GXutil.len( WebComp_Alm_tipo_movimientowc_Component) != 0 )
                        {
                           WebComp_Alm_tipo_movimientowc.componentprocess("W0037", "", sEvt);
                        }
                        WebComp_Alm_tipo_movimientowc_Component = OldAlm_tipo_movimientowc ;
                     }
                     else if ( nCmpId == 45 )
                     {
                        OldAlm_tipo_movimiento1wc = httpContext.cgiGet( "W0045") ;
                        if ( ( GXutil.len( OldAlm_tipo_movimiento1wc) == 0 ) || ( GXutil.strcmp(OldAlm_tipo_movimiento1wc, WebComp_Alm_tipo_movimiento1wc_Component) != 0 ) )
                        {
                           WebComp_Alm_tipo_movimiento1wc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_tipo_movimiento1wc + "_impl", remoteHandle, context);
                           WebComp_Alm_tipo_movimiento1wc_Component = OldAlm_tipo_movimiento1wc ;
                        }
                        if ( GXutil.len( WebComp_Alm_tipo_movimiento1wc_Component) != 0 )
                        {
                           WebComp_Alm_tipo_movimiento1wc.componentprocess("W0045", "", sEvt);
                        }
                        WebComp_Alm_tipo_movimiento1wc_Component = OldAlm_tipo_movimiento1wc ;
                     }
                     else if ( nCmpId == 53 )
                     {
                        OldAlm_almacenwc = httpContext.cgiGet( "W0053") ;
                        if ( ( GXutil.len( OldAlm_almacenwc) == 0 ) || ( GXutil.strcmp(OldAlm_almacenwc, WebComp_Alm_almacenwc_Component) != 0 ) )
                        {
                           WebComp_Alm_almacenwc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldAlm_almacenwc + "_impl", remoteHandle, context);
                           WebComp_Alm_almacenwc_Component = OldAlm_almacenwc ;
                        }
                        if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
                        {
                           WebComp_Alm_almacenwc.componentprocess("W0053", "", sEvt);
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

   public void we4Y2( )
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

   public void pa4Y2( )
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
      rf4Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV16Pgmname = "ViewALM_TIPO_ALMACEN" ;
      Gx_err = (short)(0) ;
   }

   public void rf4Y2( )
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
            if ( GXutil.len( WebComp_Alm_tipo_movimientowc_Component) != 0 )
            {
               WebComp_Alm_tipo_movimientowc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Alm_tipo_movimiento1wc_Component) != 0 )
            {
               WebComp_Alm_tipo_movimiento1wc.componentstart();
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
         /* Using cursor H004Y2 */
         pr_default.execute(0, new Object[] {new Long(AV13Tpal_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A29Tpal_Id = H004Y2_A29Tpal_Id[0] ;
            A307Tpal_Descripcion = H004Y2_A307Tpal_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TPAL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!"))));
            /* Execute user event: Load */
            e124Y2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb4Y0( ) ;
      }
   }

   public void strup4Y0( )
   {
      /* Before Start, stand alone formulas. */
      AV16Pgmname = "ViewALM_TIPO_ALMACEN" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e114Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A307Tpal_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpal_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TPAL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!"))));
         /* Read saved values. */
         AV13Tpal_Id = localUtil.ctol( httpContext.cgiGet( "vTPAL_ID"), ",", ".") ;
         AV12LoadAllTabs = GXutil.strtobool( httpContext.cgiGet( "vLOADALLTABS")) ;
         AV8SelectedTabCode = httpContext.cgiGet( "vSELECTEDTABCODE") ;
         Tab_Class = httpContext.cgiGet( "TAB_Class") ;
         Tab_Activepagecontrolname = httpContext.cgiGet( "TAB_Activepagecontrolname") ;
         Tab_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB_Pagecount"), ",", ".")) ;
         Tab_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB_Historymanagement")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "ViewALM_TIPO_ALMACEN" ;
         A307Tpal_Descripcion = httpContext.cgiGet( edtTpal_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TPAL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!"))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("viewalm_tipo_almacen:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e114Y2 ();
      if (returnInSub) return;
   }

   public void e114Y2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV17GXLvl6 = (byte)(0) ;
      /* Using cursor H004Y3 */
      pr_default.execute(1, new Object[] {new Long(AV13Tpal_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A29Tpal_Id = H004Y3_A29Tpal_Id[0] ;
         A307Tpal_Descripcion = H004Y3_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TPAL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!"))));
         AV17GXLvl6 = (byte)(1) ;
         Form.setCaption( A307Tpal_Descripcion );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Link = formatLink("com.orions2.wwalm_tipo_almacen")  ;
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
         if ( GXutil.strcmp(GXutil.lower( WebComp_Generalwc_Component), GXutil.lower( "ALM_TIPO_ALMACENGeneral")) != 0 )
         {
            WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_tipo_almacengeneral_impl", remoteHandle, context);
            WebComp_Generalwc_Component = "ALM_TIPO_ALMACENGeneral" ;
         }
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.setjustcreated();
            WebComp_Generalwc.componentprepare(new Object[] {"W0029","",new Long(AV13Tpal_Id)});
            WebComp_Generalwc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0029"+"");
            WebComp_Generalwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TIPO_MOVIMIENTO") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_tipo_movimientowc_Component), GXutil.lower( "ALM_TIPO_ALMACENALM_TIPO_MOVIMIENTOWC")) != 0 )
         {
            WebComp_Alm_tipo_movimientowc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_tipo_almacenalm_tipo_movimientowc_impl", remoteHandle, context);
            WebComp_Alm_tipo_movimientowc_Component = "ALM_TIPO_ALMACENALM_TIPO_MOVIMIENTOWC" ;
         }
         if ( GXutil.len( WebComp_Alm_tipo_movimientowc_Component) != 0 )
         {
            WebComp_Alm_tipo_movimientowc.setjustcreated();
            WebComp_Alm_tipo_movimientowc.componentprepare(new Object[] {"W0037","",new Long(AV13Tpal_Id)});
            WebComp_Alm_tipo_movimientowc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
            WebComp_Alm_tipo_movimientowc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_TIPO_MOVIMIENTO1") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_tipo_movimiento1wc_Component), GXutil.lower( "ALM_TIPO_ALMACENALM_TIPO_MOVIMIENTO1WC")) != 0 )
         {
            WebComp_Alm_tipo_movimiento1wc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_tipo_almacenalm_tipo_movimiento1wc_impl", remoteHandle, context);
            WebComp_Alm_tipo_movimiento1wc_Component = "ALM_TIPO_ALMACENALM_TIPO_MOVIMIENTO1WC" ;
         }
         if ( GXutil.len( WebComp_Alm_tipo_movimiento1wc_Component) != 0 )
         {
            WebComp_Alm_tipo_movimiento1wc.setjustcreated();
            WebComp_Alm_tipo_movimiento1wc.componentprepare(new Object[] {"W0045","",new Long(AV13Tpal_Id)});
            WebComp_Alm_tipo_movimiento1wc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0045"+"");
            WebComp_Alm_tipo_movimiento1wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV12LoadAllTabs || ( GXutil.strcmp(AV8SelectedTabCode, "ALM_ALMACEN") == 0 ) )
      {
         /* Object Property */
         if ( GXutil.strcmp(GXutil.lower( WebComp_Alm_almacenwc_Component), GXutil.lower( "ALM_TIPO_ALMACENALM_ALMACENWC")) != 0 )
         {
            WebComp_Alm_almacenwc = WebUtils.getWebComponent(getClass(), "com.orions2.alm_tipo_almacenalm_almacenwc_impl", remoteHandle, context);
            WebComp_Alm_almacenwc_Component = "ALM_TIPO_ALMACENALM_ALMACENWC" ;
         }
         if ( GXutil.len( WebComp_Alm_almacenwc_Component) != 0 )
         {
            WebComp_Alm_almacenwc.setjustcreated();
            WebComp_Alm_almacenwc.componentprepare(new Object[] {"W0053","",new Long(AV13Tpal_Id)});
            WebComp_Alm_almacenwc.componentbind(new Object[] {""});
         }
         if ( isFullAjaxMode( ) )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0053"+"");
            WebComp_Alm_almacenwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e124Y2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV13Tpal_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Tpal_Id", GXutil.ltrim( GXutil.str( AV13Tpal_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Tpal_Id), "ZZZZZZZZZZ9")));
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
      pa4Y2( ) ;
      ws4Y2( ) ;
      we4Y2( ) ;
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
      if ( ! ( WebComp_Alm_tipo_movimientowc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_tipo_movimientowc_Component) != 0 )
         {
            WebComp_Alm_tipo_movimientowc.componentthemes();
         }
      }
      if ( ! ( WebComp_Alm_tipo_movimiento1wc == null ) )
      {
         if ( GXutil.len( WebComp_Alm_tipo_movimiento1wc_Component) != 0 )
         {
            WebComp_Alm_tipo_movimiento1wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414194975");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("viewalm_tipo_almacen.js", "?201861414194977");
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
      edtTpal_Descripcion_Internalname = "TPAL_DESCRIPCION" ;
      divTabtable_1_Internalname = "TABTABLE_1" ;
      lblGeneral_title_Internalname = "GENERAL_TITLE" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblAlm_tipo_movimiento_title_Internalname = "ALM_TIPO_MOVIMIENTO_TITLE" ;
      divTablealm_tipo_movimiento_Internalname = "TABLEALM_TIPO_MOVIMIENTO" ;
      lblAlm_tipo_movimiento1_title_Internalname = "ALM_TIPO_MOVIMIENTO1_TITLE" ;
      divTablealm_tipo_movimiento1_Internalname = "TABLEALM_TIPO_MOVIMIENTO1" ;
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
      edtTpal_Descripcion_Jsonclick = "" ;
      edtTpal_Descripcion_Enabled = 0 ;
      lblViewall_Link = "" ;
      lblViewall_Visible = 1 ;
      Tab_Historymanagement = GXutil.toBoolean( -1) ;
      Tab_Pagecount = 4 ;
      Tab_Class = "WWTab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "View ALM_TIPO_ALMACEN" );
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
      A307Tpal_Descripcion = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblViewtitle_Jsonclick = "" ;
      lblViewall_Jsonclick = "" ;
      lblGeneral_title_Jsonclick = "" ;
      WebComp_Generalwc_Component = "" ;
      OldGeneralwc = "" ;
      lblAlm_tipo_movimiento_title_Jsonclick = "" ;
      WebComp_Alm_tipo_movimientowc_Component = "" ;
      OldAlm_tipo_movimientowc = "" ;
      lblAlm_tipo_movimiento1_title_Jsonclick = "" ;
      WebComp_Alm_tipo_movimiento1wc_Component = "" ;
      OldAlm_tipo_movimiento1wc = "" ;
      lblAlm_almacen_title_Jsonclick = "" ;
      WebComp_Alm_almacenwc_Component = "" ;
      OldAlm_almacenwc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Pgmname = "" ;
      scmdbuf = "" ;
      H004Y2_A29Tpal_Id = new long[1] ;
      H004Y2_A307Tpal_Descripcion = new String[] {""} ;
      hsh = "" ;
      H004Y3_A29Tpal_Id = new long[1] ;
      H004Y3_A307Tpal_Descripcion = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.viewalm_tipo_almacen__default(),
         new Object[] {
             new Object[] {
            H004Y2_A29Tpal_Id, H004Y2_A307Tpal_Descripcion
            }
            , new Object[] {
            H004Y3_A29Tpal_Id, H004Y3_A307Tpal_Descripcion
            }
         }
      );
      AV16Pgmname = "ViewALM_TIPO_ALMACEN" ;
      /* GeneXus formulas. */
      AV16Pgmname = "ViewALM_TIPO_ALMACEN" ;
      Gx_err = (short)(0) ;
      WebComp_Generalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_tipo_movimientowc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Alm_tipo_movimiento1wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
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
   private int edtTpal_Descripcion_Enabled ;
   private int idxLst ;
   private long wcpOAV13Tpal_Id ;
   private long AV13Tpal_Id ;
   private long A29Tpal_Id ;
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
   private String edtTpal_Descripcion_Internalname ;
   private String edtTpal_Descripcion_Jsonclick ;
   private String lblGeneral_title_Internalname ;
   private String lblGeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String WebComp_Generalwc_Component ;
   private String OldGeneralwc ;
   private String lblAlm_tipo_movimiento_title_Internalname ;
   private String lblAlm_tipo_movimiento_title_Jsonclick ;
   private String divTablealm_tipo_movimiento_Internalname ;
   private String WebComp_Alm_tipo_movimientowc_Component ;
   private String OldAlm_tipo_movimientowc ;
   private String lblAlm_tipo_movimiento1_title_Internalname ;
   private String lblAlm_tipo_movimiento1_title_Jsonclick ;
   private String divTablealm_tipo_movimiento1_Internalname ;
   private String WebComp_Alm_tipo_movimiento1wc_Component ;
   private String OldAlm_tipo_movimiento1wc ;
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
   private boolean returnInSub ;
   private boolean AV11Exists ;
   private String A307Tpal_Descripcion ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Generalwc ;
   private GXWebComponent WebComp_Alm_tipo_movimientowc ;
   private GXWebComponent WebComp_Alm_tipo_movimiento1wc ;
   private GXWebComponent WebComp_Alm_almacenwc ;
   private IDataStoreProvider pr_default ;
   private long[] H004Y2_A29Tpal_Id ;
   private String[] H004Y2_A307Tpal_Descripcion ;
   private long[] H004Y3_A29Tpal_Id ;
   private String[] H004Y3_A307Tpal_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class viewalm_tipo_almacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004Y2", "SELECT Tpal_Id, Tpal_Descripcion FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ORDER BY Tpal_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H004Y3", "SELECT Tpal_Id, Tpal_Descripcion FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ORDER BY Tpal_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

