/*
               File: viewgen_ciudad_impl
        Description: View GEN_CIUDAD
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:7.6
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

public final  class viewgen_ciudad_impl extends GXDataArea
{
   public viewgen_ciudad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public viewgen_ciudad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( viewgen_ciudad_impl.class ));
   }

   public viewgen_ciudad_impl( int remoteHandle ,
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
            AV5Ciud_Codigo = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCIUD_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Ciud_Codigo), "ZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12TabCode = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12TabCode", AV12TabCode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12TabCode, ""))));
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
      pa2I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2I2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018614141979");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV12TabCode))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( AV5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABCODE", GXutil.rtrim( AV12TabCode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCIUD_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Ciud_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCIUD_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Ciud_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12TabCode, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Class", GXutil.rtrim( Tab_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Pagecount", GXutil.ltrim( localUtil.ntoc( Tab_Pagecount, (byte)(9), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TAB_Historymanagement", GXutil.booltostr( Tab_Historymanagement));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ViewGEN_CIUDAD" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("viewgen_ciudad:[SendSecurityCheck]"+forbiddenHiddens);
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
      if ( ! ( WebComp_Gen_regionalwc == null ) )
      {
         WebComp_Gen_regionalwc.componentjscripts();
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
         we2I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2I2( ) ;
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
      return formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV12TabCode)) ;
   }

   public String getPgmname( )
   {
      return "ViewGEN_CIUDAD" ;
   }

   public String getPgmdesc( )
   {
      return "View GEN_CIUDAD" ;
   }

   public void wb2I0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewtitle_Internalname, "Ciudad Information", "", "", lblViewtitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ViewGEN_CIUDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 ViewActionsBackCell", "Right", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblViewall_Internalname, "Work With Ciudads", lblViewall_Link, "", lblViewall_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "BtnTextBlockBack", 0, "", lblViewall_Visible, 1, (short)(0), "HLP_ViewGEN_CIUDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Descripcion_Internalname, "Descripción Ciudad", "col-sm-3 ReadonlyAttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Descripcion_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ViewGEN_CIUDAD.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblGeneral_title_Internalname, "General", "", "", lblGeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewGEN_CIUDAD.htm");
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
            if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0029"+"");
            }
            WebComp_Generalwc.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
            httpContext.writeText( "</div>") ;
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblGen_regional_title_Internalname, "Regional", "", "", lblGen_regional_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_ViewGEN_CIUDAD.htm");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "GEN_REGIONAL") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTablegen_regional_Internalname, 1, 0, "px", 0, "px", "TabsFormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "W0037"+"", GXutil.rtrim( WebComp_Gen_regionalwc_Component));
            httpContext.writeText( "<div") ;
            com.orions2.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0037"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.strcmp(GXutil.lower( OldGen_regionalwc), GXutil.lower( WebComp_Gen_regionalwc_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
            }
            WebComp_Gen_regionalwc.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldGen_regionalwc), GXutil.lower( WebComp_Gen_regionalwc_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
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

   public void start2I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "View GEN_CIUDAD", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2I0( ) ;
   }

   public void ws2I2( )
   {
      start2I2( ) ;
      evt2I2( ) ;
   }

   public void evt2I2( )
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
                           e112I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e122I2 ();
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
                        WebComp_Generalwc.componentprocess("W0029", "", sEvt);
                        WebComp_Generalwc_Component = OldGeneralwc ;
                     }
                     else if ( nCmpId == 37 )
                     {
                        OldGen_regionalwc = httpContext.cgiGet( "W0037") ;
                        if ( ( GXutil.len( OldGen_regionalwc) == 0 ) || ( GXutil.strcmp(OldGen_regionalwc, WebComp_Gen_regionalwc_Component) != 0 ) )
                        {
                           WebComp_Gen_regionalwc = WebUtils.getWebComponent(getClass(), "com.orions2." + OldGen_regionalwc + "_impl", remoteHandle, context);
                           WebComp_Gen_regionalwc_Component = OldGen_regionalwc ;
                        }
                        WebComp_Gen_regionalwc.componentprocess("W0037", "", sEvt);
                        WebComp_Gen_regionalwc_Component = OldGen_regionalwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2I2( )
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

   public void pa2I2( )
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
      rf2I2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "ViewGEN_CIUDAD" ;
      Gx_err = (short)(0) ;
   }

   public void rf2I2( )
   {
      initialize_formulas( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Generalwc.componentstart();
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Gen_regionalwc.componentstart();
         }
      }
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H002I2 */
         pr_default.execute(0, new Object[] {new Short(AV5Ciud_Codigo)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5Ciud_Codigo = H002I2_A5Ciud_Codigo[0] ;
            A7Ciud_Descripcion = H002I2_A7Ciud_Descripcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
            /* Execute user event: Load */
            e122I2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb2I0( ) ;
      }
   }

   public void strup2I0( )
   {
      /* Before Start, stand alone formulas. */
      AV17Pgmname = "ViewGEN_CIUDAD" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
         /* Read saved values. */
         Tab_Class = httpContext.cgiGet( "TAB_Class") ;
         Tab_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TAB_Pagecount"), ",", ".")) ;
         Tab_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TAB_Historymanagement")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "ViewGEN_CIUDAD" ;
         A7Ciud_Descripcion = httpContext.cgiGet( edtCiud_Descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("viewgen_ciudad:[SecurityCheckFailed]"+forbiddenHiddens);
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
      e112I2 ();
      if (returnInSub) return;
   }

   public void e112I2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV17Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV18GXLvl6 = (byte)(0) ;
      /* Using cursor H002I3 */
      pr_default.execute(1, new Object[] {new Short(AV5Ciud_Codigo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5Ciud_Codigo = H002I3_A5Ciud_Codigo[0] ;
         A7Ciud_Descripcion = H002I3_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
         AV18GXLvl6 = (byte)(1) ;
         Form.setCaption( A7Ciud_Descripcion );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Link = formatLink("com.orions2.wwgen_ciudad")  ;
         httpContext.ajax_rsp_assign_prop("", false, lblViewall_Internalname, "Link", lblViewall_Link, true);
         AV7Exists = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV18GXLvl6 == 0 )
      {
         Form.setCaption( "Record not found" );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         lblViewall_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblViewall_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblViewall_Visible, 5, 0)), true);
         AV7Exists = false ;
      }
      if ( AV7Exists )
      {
         /* Execute user subroutine: 'LOADTABS' */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void S112( )
   {
      /* 'LOADTABS' Routine */
      AV13Tabs = new GXBaseCollection<com.orions2.SdtTabOptions_TabOptionsItem>(com.orions2.SdtTabOptions_TabOptionsItem.class, "TabOptions.TabOptionsItem", "ACBSENA", remoteHandle) ;
      AV11Tab = (com.orions2.SdtTabOptions_TabOptionsItem)new com.orions2.SdtTabOptions_TabOptionsItem(remoteHandle, context);
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Code( "General" );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Description( "General" );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Webcomponent( formatLink("com.orions2.gen_ciudadgeneral") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Link( formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Tab.getgxTv_SdtTabOptions_TabOptionsItem_Code())) );
      AV13Tabs.add(AV11Tab, 0);
      AV11Tab = (com.orions2.SdtTabOptions_TabOptionsItem)new com.orions2.SdtTabOptions_TabOptionsItem(remoteHandle, context);
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Code( "GEN_REGIONAL" );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Description( "Regional" );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Webcomponent( formatLink("com.orions2.gen_ciudadgen_regionalwc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) );
      AV11Tab.setgxTv_SdtTabOptions_TabOptionsItem_Link( formatLink("com.orions2.viewgen_ciudad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Ciud_Codigo,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV11Tab.getgxTv_SdtTabOptions_TabOptionsItem_Code())) );
      AV13Tabs.add(AV11Tab, 0);
   }

   protected void nextLoad( )
   {
   }

   protected void e122I2( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
      AV5Ciud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Ciud_Codigo", GXutil.ltrim( GXutil.str( AV5Ciud_Codigo, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCIUD_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Ciud_Codigo), "ZZZ9")));
      AV12TabCode = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12TabCode", AV12TabCode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12TabCode, ""))));
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
      pa2I2( ) ;
      ws2I2( ) ;
      we2I2( ) ;
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
         WebComp_Generalwc.componentthemes();
      }
      if ( ! ( WebComp_Gen_regionalwc == null ) )
      {
         WebComp_Gen_regionalwc.componentthemes();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141419742");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("viewgen_ciudad.js", "?20186141419742");
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
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      divTabtable_1_Internalname = "TABTABLE_1" ;
      lblGeneral_title_Internalname = "GENERAL_TITLE" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblGen_regional_title_Internalname = "GEN_REGIONAL_TITLE" ;
      divTablegen_regional_Internalname = "TABLEGEN_REGIONAL" ;
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
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      lblViewall_Link = "" ;
      lblViewall_Visible = 1 ;
      Tab_Historymanagement = GXutil.toBoolean( -1) ;
      Tab_Pagecount = 2 ;
      Tab_Class = "WWTab" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "View GEN_CIUDAD" );
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
      wcpOAV12TabCode = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV12TabCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A7Ciud_Descripcion = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblViewtitle_Jsonclick = "" ;
      lblViewall_Jsonclick = "" ;
      lblGeneral_title_Jsonclick = "" ;
      WebComp_Generalwc_Component = "" ;
      OldGeneralwc = "" ;
      lblGen_regional_title_Jsonclick = "" ;
      WebComp_Gen_regionalwc_Component = "" ;
      OldGen_regionalwc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Pgmname = "" ;
      scmdbuf = "" ;
      H002I2_A5Ciud_Codigo = new short[1] ;
      H002I2_A7Ciud_Descripcion = new String[] {""} ;
      hsh = "" ;
      H002I3_A5Ciud_Codigo = new short[1] ;
      H002I3_A7Ciud_Descripcion = new String[] {""} ;
      AV13Tabs = new GXBaseCollection<com.orions2.SdtTabOptions_TabOptionsItem>(com.orions2.SdtTabOptions_TabOptionsItem.class, "TabOptions.TabOptionsItem", "ACBSENA", remoteHandle);
      AV11Tab = new com.orions2.SdtTabOptions_TabOptionsItem(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.viewgen_ciudad__default(),
         new Object[] {
             new Object[] {
            H002I2_A5Ciud_Codigo, H002I2_A7Ciud_Descripcion
            }
            , new Object[] {
            H002I3_A5Ciud_Codigo, H002I3_A7Ciud_Descripcion
            }
         }
      );
      AV17Pgmname = "ViewGEN_CIUDAD" ;
      /* GeneXus formulas. */
      AV17Pgmname = "ViewGEN_CIUDAD" ;
      Gx_err = (short)(0) ;
      WebComp_Generalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Gen_regionalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV18GXLvl6 ;
   private byte nGXWrapped ;
   private short wcpOAV5Ciud_Codigo ;
   private short AV5Ciud_Codigo ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A5Ciud_Codigo ;
   private int Tab_Pagecount ;
   private int lblViewall_Visible ;
   private int edtCiud_Descripcion_Enabled ;
   private int idxLst ;
   private String wcpOAV12TabCode ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV12TabCode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String lblGeneral_title_Internalname ;
   private String lblGeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String WebComp_Generalwc_Component ;
   private String OldGeneralwc ;
   private String lblGen_regional_title_Internalname ;
   private String lblGen_regional_title_Jsonclick ;
   private String divTablegen_regional_Internalname ;
   private String WebComp_Gen_regionalwc_Component ;
   private String OldGen_regionalwc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Pgmname ;
   private String scmdbuf ;
   private String hsh ;
   private String Tab_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Tab_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV7Exists ;
   private String A7Ciud_Descripcion ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Generalwc ;
   private GXWebComponent WebComp_Gen_regionalwc ;
   private IDataStoreProvider pr_default ;
   private short[] H002I2_A5Ciud_Codigo ;
   private String[] H002I2_A7Ciud_Descripcion ;
   private short[] H002I3_A5Ciud_Codigo ;
   private String[] H002I3_A7Ciud_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtTabOptions_TabOptionsItem> AV13Tabs ;
   private com.orions2.SdtTabOptions_TabOptionsItem AV11Tab ;
}

final  class viewgen_ciudad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002I2", "SELECT Ciud_Codigo, Ciud_Descripcion FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ORDER BY Ciud_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I3", "SELECT Ciud_Codigo, Ciud_Descripcion FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ORDER BY Ciud_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

