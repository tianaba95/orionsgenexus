/*
               File: gx0033_impl
        Description: Selection List BODEGAS DEL ALMACEN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:5.72
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

public final  class gx0033_impl extends GXDataArea
{
   public gx0033_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0033_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0033_impl.class ));
   }

   public gx0033_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCbbode_estado = new HTMLChoice();
      cmbBBode_Estado = new HTMLChoice();
      cmbAlma_Modulo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_54 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_54_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_54_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cBode_Codigo = httpContext.GetNextPar( ) ;
            AV7cBBode_Descripcion = httpContext.GetNextPar( ) ;
            AV8cBArea_Codigo = httpContext.GetNextPar( ) ;
            AV9cBBode_Estado = httpContext.GetNextPar( ) ;
            AV10pCent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11pAlma_Modulo = httpContext.GetNextPar( ) ;
            AV12pAlma_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
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
            AV10pCent_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10pCent_Id", GXutil.ltrim( GXutil.str( AV10pCent_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pCent_Id), "ZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11pAlma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pAlma_Modulo", AV11pAlma_Modulo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11pAlma_Modulo, ""))));
               AV12pAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pAlma_Codigo", AV12pAlma_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12pAlma_Codigo, ""))));
               AV13pBode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pBode_Codigo", AV13pBode_Codigo);
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
         MasterPageObj = new com.orions2.rwdpromptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
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
      pa842( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start842( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141424576");
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx0033") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV11pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pBode_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_CODIGO", AV6cBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBBODE_DESCRIPCION", AV7cBBode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBAREA_CODIGO", AV8cBArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBBODE_ESTADO", GXutil.rtrim( AV9cBBode_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCENT_ID", GXutil.ltrim( localUtil.ntoc( AV10pCent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_MODULO", AV11pAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_CODIGO", AV12pAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPBODE_CODIGO", AV13pBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11pAlma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12pAlma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11pAlma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12pAlma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divBode_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divBbode_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BAREA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divBarea_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divBbode_estadofiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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
         we842( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt842( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.gx0033") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV11pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pBode_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "Gx0033" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List BODEGAS DEL ALMACEN" ;
   }

   public void wb840( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_codigofilter_Internalname, "Código Bodega", "", "", lblLblbode_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11841_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0033.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_codigo_Internalname, "Código Bodega", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_codigo_Internalname, AV6cBode_Codigo, GXutil.rtrim( localUtil.format( AV6cBode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_codigo_Visible, edtavCbode_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0033.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBbode_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divBbode_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbbode_descripcionfilter_Internalname, "BBode_Descripcion", "", "", lblLblbbode_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12841_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0033.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbbode_descripcion_Internalname, "BBode_Descripcion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbbode_descripcion_Internalname, AV7cBBode_Descripcion, GXutil.rtrim( localUtil.format( AV7cBBode_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbbode_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCbbode_descripcion_Visible, edtavCbbode_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0033.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBarea_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBarea_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbarea_codigofilter_Internalname, "BArea_Codigo", "", "", lblLblbarea_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13841_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0033.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbarea_codigo_Internalname, "BArea_Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbarea_codigo_Internalname, AV8cBArea_Codigo, GXutil.rtrim( localUtil.format( AV8cBArea_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbarea_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCbarea_codigo_Visible, edtavCbarea_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0033.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBbode_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBbode_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbbode_estadofilter_Internalname, "BBode_Estado", "", "", lblLblbbode_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14841_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0033.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCbbode_estado.getInternalname(), "BBode_Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCbbode_estado, cmbavCbbode_estado.getInternalname(), GXutil.rtrim( AV9cBBode_Estado), 1, cmbavCbbode_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCbbode_estado.getVisible(), cmbavCbbode_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, "HLP_Gx0033.htm");
         cmbavCbbode_estado.setValue( GXutil.rtrim( AV9cBBode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCbbode_estado.getInternalname(), "Values", cmbavCbbode_estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15841_client"+"'", TempTags, "", 2, "HLP_Gx0033.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"54\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod. Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "BBode_Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "BBode_Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A31Bode_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A695BBode_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtBBode_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A696BBode_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A27Alma_Modulo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A28Alma_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (short)(nGXsfl_54_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0033.htm");
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

   public void start842( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List BODEGAS DEL ALMACEN", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup840( ) ;
   }

   public void ws842( )
   {
      start842( ) ;
      evt842( ) ;
   }

   public void evt842( )
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
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_54_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_54_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
                           A695BBode_Descripcion = httpContext.cgiGet( edtBBode_Descripcion_Internalname) ;
                           cmbBBode_Estado.setName( cmbBBode_Estado.getInternalname() );
                           cmbBBode_Estado.setValue( httpContext.cgiGet( cmbBBode_Estado.getInternalname()) );
                           A696BBode_Estado = httpContext.cgiGet( cmbBBode_Estado.getInternalname()) ;
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16842 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e17842 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cbode_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_CODIGO"), AV6cBode_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbbode_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBBODE_DESCRIPCION"), AV7cBBode_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbarea_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBAREA_CODIGO"), AV8cBArea_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbbode_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBBODE_ESTADO"), AV9cBBode_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e18842 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we842( )
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

   public void pa842( )
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
         cmbavCbbode_estado.setName( "vCBBODE_ESTADO" );
         cmbavCbbode_estado.setWebtags( "" );
         cmbavCbbode_estado.addItem("A", "Activo", (short)(0));
         cmbavCbbode_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCbbode_estado.getItemCount() > 0 )
         {
            AV9cBBode_Estado = cmbavCbbode_estado.getValidValue(AV9cBBode_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cBBode_Estado", AV9cBBode_Estado);
         }
         GXCCtl = "BBODE_ESTADO_" + sGXsfl_54_idx ;
         cmbBBode_Estado.setName( GXCCtl );
         cmbBBode_Estado.setWebtags( "" );
         cmbBBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBBode_Estado.getItemCount() > 0 )
         {
            A696BBode_Estado = cmbBBode_Estado.getValidValue(A696BBode_Estado) ;
         }
         GXCCtl = "ALMA_MODULO_" + sGXsfl_54_idx ;
         cmbAlma_Modulo.setName( GXCCtl );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cBode_Codigo ,
                                  String AV7cBBode_Descripcion ,
                                  String AV8cBArea_Codigo ,
                                  String AV9cBBode_Estado ,
                                  long AV10pCent_Id ,
                                  String AV11pAlma_Modulo ,
                                  String AV12pAlma_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf842( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BBODE_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A695BBode_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_DESCRIPCION", A695BBode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BBODE_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A696BBode_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_ESTADO", GXutil.rtrim( A696BBode_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCbbode_estado.getItemCount() > 0 )
      {
         AV9cBBode_Estado = cmbavCbbode_estado.getValidValue(AV9cBBode_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cBBode_Estado", AV9cBBode_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf842( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf842( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(54) ;
      nGXsfl_54_idx = (short)(1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cBBode_Descripcion ,
                                              AV8cBArea_Codigo ,
                                              AV9cBBode_Estado ,
                                              A695BBode_Descripcion ,
                                              A32BArea_Codigo ,
                                              A696BBode_Estado ,
                                              A31Bode_Codigo ,
                                              AV6cBode_Codigo ,
                                              new Long(AV10pCent_Id) ,
                                              AV11pAlma_Modulo ,
                                              AV12pAlma_Codigo ,
                                              new Long(A1Cent_Id) ,
                                              A27Alma_Modulo ,
                                              A28Alma_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cBode_Codigo = GXutil.concat( GXutil.rtrim( AV6cBode_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
         lV7cBBode_Descripcion = GXutil.concat( GXutil.rtrim( AV7cBBode_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cBBode_Descripcion", AV7cBBode_Descripcion);
         lV8cBArea_Codigo = GXutil.concat( GXutil.rtrim( AV8cBArea_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cBArea_Codigo", AV8cBArea_Codigo);
         lV9cBBode_Estado = GXutil.padr( GXutil.rtrim( AV9cBBode_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cBBode_Estado", AV9cBBode_Estado);
         /* Using cursor H00842 */
         pr_default.execute(0, new Object[] {new Long(AV10pCent_Id), AV11pAlma_Modulo, AV12pAlma_Codigo, lV6cBode_Codigo, lV7cBBode_Descripcion, lV8cBArea_Codigo, lV9cBBode_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_54_idx = (short)(1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A32BArea_Codigo = H00842_A32BArea_Codigo[0] ;
            n32BArea_Codigo = H00842_n32BArea_Codigo[0] ;
            A28Alma_Codigo = H00842_A28Alma_Codigo[0] ;
            A27Alma_Modulo = H00842_A27Alma_Modulo[0] ;
            A1Cent_Id = H00842_A1Cent_Id[0] ;
            A696BBode_Estado = H00842_A696BBode_Estado[0] ;
            A695BBode_Descripcion = H00842_A695BBode_Descripcion[0] ;
            A31Bode_Codigo = H00842_A31Bode_Codigo[0] ;
            /* Execute user event: Load */
            e17842 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb840( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7cBBode_Descripcion ,
                                           AV8cBArea_Codigo ,
                                           AV9cBBode_Estado ,
                                           A695BBode_Descripcion ,
                                           A32BArea_Codigo ,
                                           A696BBode_Estado ,
                                           A31Bode_Codigo ,
                                           AV6cBode_Codigo ,
                                           new Long(AV10pCent_Id) ,
                                           AV11pAlma_Modulo ,
                                           AV12pAlma_Codigo ,
                                           new Long(A1Cent_Id) ,
                                           A27Alma_Modulo ,
                                           A28Alma_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cBode_Codigo = GXutil.concat( GXutil.rtrim( AV6cBode_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
      lV7cBBode_Descripcion = GXutil.concat( GXutil.rtrim( AV7cBBode_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cBBode_Descripcion", AV7cBBode_Descripcion);
      lV8cBArea_Codigo = GXutil.concat( GXutil.rtrim( AV8cBArea_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cBArea_Codigo", AV8cBArea_Codigo);
      lV9cBBode_Estado = GXutil.padr( GXutil.rtrim( AV9cBBode_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cBBode_Estado", AV9cBBode_Estado);
      /* Using cursor H00843 */
      pr_default.execute(1, new Object[] {new Long(AV10pCent_Id), AV11pAlma_Modulo, AV12pAlma_Codigo, lV6cBode_Codigo, lV7cBBode_Descripcion, lV8cBArea_Codigo, lV9cBBode_Estado});
      GRID1_nRecordCount = H00843_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBBode_Descripcion, AV8cBArea_Codigo, AV9cBBode_Estado, AV10pCent_Id, AV11pAlma_Modulo, AV12pAlma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup840( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16842 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cBode_Codigo = httpContext.cgiGet( edtavCbode_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
         AV7cBBode_Descripcion = httpContext.cgiGet( edtavCbbode_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cBBode_Descripcion", AV7cBBode_Descripcion);
         AV8cBArea_Codigo = httpContext.cgiGet( edtavCbarea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cBArea_Codigo", AV8cBArea_Codigo);
         cmbavCbbode_estado.setName( cmbavCbbode_estado.getInternalname() );
         cmbavCbbode_estado.setValue( httpContext.cgiGet( cmbavCbbode_estado.getInternalname()) );
         AV9cBBode_Estado = httpContext.cgiGet( cmbavCbbode_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cBBode_Estado", AV9cBBode_Estado);
         /* Read saved values. */
         nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_CODIGO"), AV6cBode_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBBODE_DESCRIPCION"), AV7cBBode_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBAREA_CODIGO"), AV8cBArea_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBBODE_ESTADO"), AV9cBBode_Estado) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
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
      e16842 ();
      if (returnInSub) return;
   }

   public void e16842( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "BODEGAS DEL ALMACEN", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e17842( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_542( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e18842 ();
      if (returnInSub) return;
   }

   public void e18842( )
   {
      /* Enter Routine */
      AV13pBode_Codigo = A31Bode_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pBode_Codigo", AV13pBode_Codigo);
      httpContext.setWebReturnParms(new Object[] {AV13pBode_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV10pCent_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pCent_Id", GXutil.ltrim( GXutil.str( AV10pCent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pCent_Id), "ZZZZZZZZZZ9")));
      AV11pAlma_Modulo = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pAlma_Modulo", AV11pAlma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11pAlma_Modulo, ""))));
      AV12pAlma_Codigo = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pAlma_Codigo", AV12pAlma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12pAlma_Codigo, ""))));
      AV13pBode_Codigo = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pBode_Codigo", AV13pBode_Codigo);
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
      pa842( ) ;
      ws842( ) ;
      we842( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141424656");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx0033.js", "?20186141424656");
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_54_idx ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION_"+sGXsfl_54_idx ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO_"+sGXsfl_54_idx );
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_54_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_54_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_fel_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_54_fel_idx ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION_"+sGXsfl_54_fel_idx ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO_"+sGXsfl_54_fel_idx );
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_54_fel_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_54_fel_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb840( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_54_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtBBode_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtBBode_Descripcion_Internalname, "Link", edtBBode_Descripcion_Link, !bGXsfl_54_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBBode_Descripcion_Internalname,A695BBode_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtBBode_Descripcion_Link,"","","",edtBBode_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BBODE_ESTADO_" + sGXsfl_54_idx ;
            cmbBBode_Estado.setName( GXCCtl );
            cmbBBode_Estado.setWebtags( "" );
            cmbBBode_Estado.addItem("A", "Activo", (short)(0));
            cmbBBode_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbBBode_Estado.getItemCount() > 0 )
            {
               A696BBode_Estado = cmbBBode_Estado.getValidValue(A696BBode_Estado) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBBode_Estado,cmbBBode_Estado.getInternalname(),GXutil.rtrim( A696BBode_Estado),new Integer(1),cmbBBode_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbBBode_Estado.setValue( GXutil.rtrim( A696BBode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBBode_Estado.getInternalname(), "Values", cmbBBode_Estado.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_MODULO_" + sGXsfl_54_idx ;
            cmbAlma_Modulo.setName( GXCCtl );
            cmbAlma_Modulo.setWebtags( "" );
            cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbAlma_Modulo.getItemCount() > 0 )
            {
               A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","","",new Boolean(true)});
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Codigo_Internalname,A28Alma_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BBODE_DESCRIPCION"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A695BBode_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BBODE_ESTADO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A696BBode_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void init_default_properties( )
   {
      lblLblbode_codigofilter_Internalname = "LBLBODE_CODIGOFILTER" ;
      edtavCbode_codigo_Internalname = "vCBODE_CODIGO" ;
      divBode_codigofiltercontainer_Internalname = "BODE_CODIGOFILTERCONTAINER" ;
      lblLblbbode_descripcionfilter_Internalname = "LBLBBODE_DESCRIPCIONFILTER" ;
      edtavCbbode_descripcion_Internalname = "vCBBODE_DESCRIPCION" ;
      divBbode_descripcionfiltercontainer_Internalname = "BBODE_DESCRIPCIONFILTERCONTAINER" ;
      lblLblbarea_codigofilter_Internalname = "LBLBAREA_CODIGOFILTER" ;
      edtavCbarea_codigo_Internalname = "vCBAREA_CODIGO" ;
      divBarea_codigofiltercontainer_Internalname = "BAREA_CODIGOFILTERCONTAINER" ;
      lblLblbbode_estadofilter_Internalname = "LBLBBODE_ESTADOFILTER" ;
      cmbavCbbode_estado.setInternalname( "vCBBODE_ESTADO" );
      divBbode_estadofiltercontainer_Internalname = "BBODE_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION" ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO" );
      edtCent_Id_Internalname = "CENT_ID" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtAlma_Codigo_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      edtCent_Id_Jsonclick = "" ;
      cmbBBode_Estado.setJsonclick( "" );
      edtBBode_Descripcion_Jsonclick = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtBBode_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCbbode_estado.setJsonclick( "" );
      cmbavCbbode_estado.setEnabled( 1 );
      cmbavCbbode_estado.setVisible( 1 );
      edtavCbarea_codigo_Jsonclick = "" ;
      edtavCbarea_codigo_Enabled = 1 ;
      edtavCbarea_codigo_Visible = 1 ;
      edtavCbbode_descripcion_Jsonclick = "" ;
      edtavCbbode_descripcion_Enabled = 1 ;
      edtavCbbode_descripcion_Visible = 1 ;
      edtavCbode_codigo_Jsonclick = "" ;
      edtavCbode_codigo_Enabled = 1 ;
      edtavCbode_codigo_Visible = 1 ;
      divBbode_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divBarea_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divBbode_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List BODEGAS DEL ALMACEN" );
      subGrid1_Rows = 10 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBBode_Descripcion',fld:'vCBBODE_DESCRIPCION',pic:'',nv:''},{av:'AV8cBArea_Codigo',fld:'vCBAREA_CODIGO',pic:'',nv:''},{av:'cmbavCbbode_estado'},{av:'AV9cBBode_Estado',fld:'vCBBODE_ESTADO',pic:'',nv:''},{av:'AV10pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV12pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e15841',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLBODE_CODIGOFILTER.CLICK","{handler:'e11841',iparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_codigo_Visible',ctrl:'vCBODE_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLBBODE_DESCRIPCIONFILTER.CLICK","{handler:'e12841',iparms:[{av:'divBbode_descripcionfiltercontainer_Class',ctrl:'BBODE_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBbode_descripcionfiltercontainer_Class',ctrl:'BBODE_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCbbode_descripcion_Visible',ctrl:'vCBBODE_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLBAREA_CODIGOFILTER.CLICK","{handler:'e13841',iparms:[{av:'divBarea_codigofiltercontainer_Class',ctrl:'BAREA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBarea_codigofiltercontainer_Class',ctrl:'BAREA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCbarea_codigo_Visible',ctrl:'vCBAREA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLBBODE_ESTADOFILTER.CLICK","{handler:'e14841',iparms:[{av:'divBbode_estadofiltercontainer_Class',ctrl:'BBODE_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBbode_estadofiltercontainer_Class',ctrl:'BBODE_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCbbode_estado'}]}");
      setEventMetadata("ENTER","{handler:'e18842',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pBode_Codigo',fld:'vPBODE_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBBode_Descripcion',fld:'vCBBODE_DESCRIPCION',pic:'',nv:''},{av:'AV8cBArea_Codigo',fld:'vCBAREA_CODIGO',pic:'',nv:''},{av:'cmbavCbbode_estado'},{av:'AV9cBBode_Estado',fld:'vCBBODE_ESTADO',pic:'',nv:''},{av:'AV10pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV12pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBBode_Descripcion',fld:'vCBBODE_DESCRIPCION',pic:'',nv:''},{av:'AV8cBArea_Codigo',fld:'vCBAREA_CODIGO',pic:'',nv:''},{av:'cmbavCbbode_estado'},{av:'AV9cBBode_Estado',fld:'vCBBODE_ESTADO',pic:'',nv:''},{av:'AV10pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV12pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBBode_Descripcion',fld:'vCBBODE_DESCRIPCION',pic:'',nv:''},{av:'AV8cBArea_Codigo',fld:'vCBAREA_CODIGO',pic:'',nv:''},{av:'cmbavCbbode_estado'},{av:'AV9cBBode_Estado',fld:'vCBBODE_ESTADO',pic:'',nv:''},{av:'AV10pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV12pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBBode_Descripcion',fld:'vCBBODE_DESCRIPCION',pic:'',nv:''},{av:'AV8cBArea_Codigo',fld:'vCBAREA_CODIGO',pic:'',nv:''},{av:'cmbavCbbode_estado'},{av:'AV9cBBode_Estado',fld:'vCBBODE_ESTADO',pic:'',nv:''},{av:'AV10pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV12pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
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
      wcpOAV11pAlma_Modulo = "" ;
      wcpOAV12pAlma_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cBode_Codigo = "" ;
      AV7cBBode_Descripcion = "" ;
      AV8cBArea_Codigo = "" ;
      AV9cBBode_Estado = "" ;
      GXKey = "" ;
      AV13pBode_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblbode_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblbbode_descripcionfilter_Jsonclick = "" ;
      lblLblbarea_codigofilter_Jsonclick = "" ;
      lblLblbbode_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A31Bode_Codigo = "" ;
      A695BBode_Descripcion = "" ;
      A696BBode_Estado = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV6cBode_Codigo = "" ;
      lV7cBBode_Descripcion = "" ;
      lV8cBArea_Codigo = "" ;
      lV9cBBode_Estado = "" ;
      A32BArea_Codigo = "" ;
      H00842_A32BArea_Codigo = new String[] {""} ;
      H00842_n32BArea_Codigo = new boolean[] {false} ;
      H00842_A28Alma_Codigo = new String[] {""} ;
      H00842_A27Alma_Modulo = new String[] {""} ;
      H00842_A1Cent_Id = new long[1] ;
      H00842_A696BBode_Estado = new String[] {""} ;
      H00842_A695BBode_Descripcion = new String[] {""} ;
      H00842_A31Bode_Codigo = new String[] {""} ;
      H00843_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx0033__default(),
         new Object[] {
             new Object[] {
            H00842_A32BArea_Codigo, H00842_n32BArea_Codigo, H00842_A28Alma_Codigo, H00842_A27Alma_Modulo, H00842_A1Cent_Id, H00842_A696BBode_Estado, H00842_A695BBode_Descripcion, H00842_A31Bode_Codigo
            }
            , new Object[] {
            H00843_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_54 ;
   private short nGXsfl_54_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCbode_codigo_Visible ;
   private int edtavCbode_codigo_Enabled ;
   private int edtavCbbode_descripcion_Visible ;
   private int edtavCbbode_descripcion_Enabled ;
   private int edtavCbarea_codigo_Visible ;
   private int edtavCbarea_codigo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV10pCent_Id ;
   private long AV10pCent_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A1Cent_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divBode_codigofiltercontainer_Class ;
   private String divBbode_descripcionfiltercontainer_Class ;
   private String divBarea_codigofiltercontainer_Class ;
   private String divBbode_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String AV9cBBode_Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divBode_codigofiltercontainer_Internalname ;
   private String lblLblbode_codigofilter_Internalname ;
   private String lblLblbode_codigofilter_Jsonclick ;
   private String edtavCbode_codigo_Internalname ;
   private String TempTags ;
   private String edtavCbode_codigo_Jsonclick ;
   private String divBbode_descripcionfiltercontainer_Internalname ;
   private String lblLblbbode_descripcionfilter_Internalname ;
   private String lblLblbbode_descripcionfilter_Jsonclick ;
   private String edtavCbbode_descripcion_Internalname ;
   private String edtavCbbode_descripcion_Jsonclick ;
   private String divBarea_codigofiltercontainer_Internalname ;
   private String lblLblbarea_codigofilter_Internalname ;
   private String lblLblbarea_codigofilter_Jsonclick ;
   private String edtavCbarea_codigo_Internalname ;
   private String edtavCbarea_codigo_Jsonclick ;
   private String divBbode_estadofiltercontainer_Internalname ;
   private String lblLblbbode_estadofilter_Internalname ;
   private String lblLblbbode_estadofilter_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String edtBBode_Descripcion_Link ;
   private String A696BBode_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtBode_Codigo_Internalname ;
   private String edtBBode_Descripcion_Internalname ;
   private String edtCent_Id_Internalname ;
   private String edtAlma_Codigo_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV9cBBode_Estado ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtBBode_Descripcion_Jsonclick ;
   private String edtCent_Id_Jsonclick ;
   private String edtAlma_Codigo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean n32BArea_Codigo ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV11pAlma_Modulo ;
   private String wcpOAV12pAlma_Codigo ;
   private String AV6cBode_Codigo ;
   private String AV7cBBode_Descripcion ;
   private String AV8cBArea_Codigo ;
   private String AV11pAlma_Modulo ;
   private String AV12pAlma_Codigo ;
   private String AV13pBode_Codigo ;
   private String A31Bode_Codigo ;
   private String A695BBode_Descripcion ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String AV17Linkselection_GXI ;
   private String lV6cBode_Codigo ;
   private String lV7cBBode_Descripcion ;
   private String lV8cBArea_Codigo ;
   private String A32BArea_Codigo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCbbode_estado ;
   private HTMLChoice cmbBBode_Estado ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private String[] H00842_A32BArea_Codigo ;
   private boolean[] H00842_n32BArea_Codigo ;
   private String[] H00842_A28Alma_Codigo ;
   private String[] H00842_A27Alma_Modulo ;
   private long[] H00842_A1Cent_Id ;
   private String[] H00842_A696BBode_Estado ;
   private String[] H00842_A695BBode_Descripcion ;
   private String[] H00842_A31Bode_Codigo ;
   private long[] H00843_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0033__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00842( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cBBode_Descripcion ,
                                          String AV8cBArea_Codigo ,
                                          String AV9cBBode_Estado ,
                                          String A695BBode_Descripcion ,
                                          String A32BArea_Codigo ,
                                          String A696BBode_Estado ,
                                          String A31Bode_Codigo ,
                                          String AV6cBode_Codigo ,
                                          long AV10pCent_Id ,
                                          String AV11pAlma_Modulo ,
                                          String AV12pAlma_Codigo ,
                                          long A1Cent_Id ,
                                          String A27Alma_Modulo ,
                                          String A28Alma_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ BArea_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Estado," ;
      sSelectString = sSelectString + " BBode_Descripcion, Bode_Codigo" ;
      sFromString = " FROM ALM_ALMACEN_BODEGAS" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ?)" ;
      sWhereString = sWhereString + " and (Bode_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cBBode_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (BBode_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cBArea_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (BArea_Codigo like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cBBode_Estado)==0) )
      {
         sWhereString = sWhereString + " and (BBode_Estado like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00843( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cBBode_Descripcion ,
                                          String AV8cBArea_Codigo ,
                                          String AV9cBBode_Estado ,
                                          String A695BBode_Descripcion ,
                                          String A32BArea_Codigo ,
                                          String A696BBode_Estado ,
                                          String A31Bode_Codigo ,
                                          String AV6cBode_Codigo ,
                                          long AV10pCent_Id ,
                                          String AV11pAlma_Modulo ,
                                          String AV12pAlma_Codigo ,
                                          long A1Cent_Id ,
                                          String A27Alma_Modulo ,
                                          String A28Alma_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_ALMACEN_BODEGAS" ;
      scmdbuf = scmdbuf + " WHERE (Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ?)" ;
      scmdbuf = scmdbuf + " and (Bode_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cBBode_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (BBode_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cBArea_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (BArea_Codigo like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cBBode_Estado)==0) )
      {
         sWhereString = sWhereString + " and (BBode_Estado like ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00842(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H00843(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00842", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00843", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

}

