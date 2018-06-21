/*
               File: gx00v0_impl
        Description: Selection List TIPO DE MOVIMIENTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:15.37
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

public final  class gx00v0_impl extends GXDataArea
{
   public gx00v0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00v0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00v0_impl.class ));
   }

   public gx00v0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtpmo_tipoe_s = new HTMLChoice();
      cmbavCtpmo_modulo = new HTMLChoice();
      cmbTpmo_Estado = new HTMLChoice();
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
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
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
            AV6cTpmo_Codigo = httpContext.GetNextPar( ) ;
            AV7cTpmo_Descripcion = httpContext.GetNextPar( ) ;
            AV8cTipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cTpmo_AlmacenOrigenId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cTpmo_AlmacenDestinoId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11cTpmo_TipoE_S = httpContext.GetNextPar( ) ;
            AV12cTpmo_Modulo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
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
            AV13pTpmo_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTpmo_Codigo", AV13pTpmo_Codigo);
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
      pa8B2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8B2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414241543");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00v0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pTpmo_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_CODIGO", AV6cTpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_DESCRIPCION", AV7cTpmo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV8cTipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_ALMACENORIGENID", GXutil.ltrim( localUtil.ntoc( AV9cTpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_ALMACENDESTINOID", GXutil.ltrim( localUtil.ntoc( AV10cTpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_TIPOE_S", AV11cTpmo_TipoE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_MODULO", AV12cTpmo_Modulo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTPMO_CODIGO", AV13pTpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTipo_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ALMACENORIGENIDFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_almacenorigenidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ALMACENDESTINOIDFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_almacendestinoidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_TIPOE_SFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_tipoe_sfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_MODULOFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_modulofiltercontainer_Class));
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
         we8B2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8B2( ) ;
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
      return formatLink("com.orions2.gx00v0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pTpmo_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "Gx00V0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List TIPO DE MOVIMIENTO" ;
   }

   public void wb8B0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_codigofilter_Internalname, "Cod Tipo Movimiento", "", "", lblLbltpmo_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_codigo_Internalname, "Código Tipo Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_codigo_Internalname, AV6cTpmo_Codigo, GXutil.rtrim( localUtil.format( AV6cTpmo_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_codigo_Visible, edtavCtpmo_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_descripcionfilter_Internalname, "Tipo Movimiento", "", "", lblLbltpmo_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_descripcion_Internalname, "Tipo Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_descripcion_Internalname, AV7cTpmo_Descripcion, GXutil.rtrim( localUtil.format( AV7cTpmo_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_descripcion_Visible, edtavCtpmo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTipo_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTipo_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltipo_codigofilter_Internalname, "Codigo Tipo de Elemento", "", "", lblLbltipo_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtipo_codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtipo_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cTipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtavCtipo_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cTipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cTipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtipo_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtipo_codigo_Visible, edtavCtipo_codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_almacenorigenidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_almacenorigenidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_almacenorigenidfilter_Internalname, "Almacen Origen Id", "", "", lblLbltpmo_almacenorigenidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_almacenorigenid_Internalname, "Almacen Origen Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_almacenorigenid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cTpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")), ((edtavCtpmo_almacenorigenid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cTpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cTpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_almacenorigenid_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_almacenorigenid_Visible, edtavCtpmo_almacenorigenid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_almacendestinoidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_almacendestinoidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_almacendestinoidfilter_Internalname, "Almacen Destino Id", "", "", lblLbltpmo_almacendestinoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_almacendestinoid_Internalname, "Almacen Destino Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_almacendestinoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cTpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")), ((edtavCtpmo_almacendestinoid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cTpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cTpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_almacendestinoid_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_almacendestinoid_Visible, edtavCtpmo_almacendestinoid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_tipoe_sfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_tipoe_sfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_tipoe_sfilter_Internalname, "Tipo E/S", "", "", lblLbltpmo_tipoe_sfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtpmo_tipoe_s.getInternalname(), "Tipo E/S", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtpmo_tipoe_s, cmbavCtpmo_tipoe_s.getInternalname(), GXutil.rtrim( AV11cTpmo_TipoE_S), 1, cmbavCtpmo_tipoe_s.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtpmo_tipoe_s.getVisible(), cmbavCtpmo_tipoe_s.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, "HLP_Gx00V0.htm");
         cmbavCtpmo_tipoe_s.setValue( GXutil.rtrim( AV11cTpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtpmo_tipoe_s.getInternalname(), "Values", cmbavCtpmo_tipoe_s.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_modulofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_modulofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_modulofilter_Internalname, "Modulo", "", "", lblLbltpmo_modulofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178b1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtpmo_modulo.getInternalname(), "Modulo", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtpmo_modulo, cmbavCtpmo_modulo.getInternalname(), GXutil.rtrim( AV12cTpmo_Modulo), 1, cmbavCtpmo_modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtpmo_modulo.getVisible(), cmbavCtpmo_modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx00V0.htm");
         cmbavCtpmo_modulo.setValue( GXutil.rtrim( AV12cTpmo_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtpmo_modulo.getInternalname(), "Values", cmbavCtpmo_modulo.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188b1_client"+"'", TempTags, "", 2, "HLP_Gx00V0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
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
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
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
            Grid1Column.AddObjectProperty("Value", A38Tpmo_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A313Tpmo_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTpmo_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A679Tpmo_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00V0.htm");
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

   public void start8B2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List TIPO DE MOVIMIENTO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8B0( ) ;
   }

   public void ws8B2( )
   {
      start8B2( ) ;
      evt8B2( ) ;
   }

   public void evt8B2( )
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
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
                           A313Tpmo_Descripcion = httpContext.cgiGet( edtTpmo_Descripcion_Internalname) ;
                           cmbTpmo_Estado.setName( cmbTpmo_Estado.getInternalname() );
                           cmbTpmo_Estado.setValue( httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) );
                           A679Tpmo_Estado = httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) ;
                           n679Tpmo_Estado = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctpmo_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_CODIGO"), AV6cTpmo_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_DESCRIPCION"), AV7cTpmo_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctipo_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPO_CODIGO"), ",", ".") != AV8cTipo_Codigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_almacenorigenid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPMO_ALMACENORIGENID"), ",", ".") != AV9cTpmo_AlmacenOrigenId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_almacendestinoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPMO_ALMACENDESTINOID"), ",", ".") != AV10cTpmo_AlmacenDestinoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_tipoe_s Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_TIPOE_S"), AV11cTpmo_TipoE_S) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_modulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_MODULO"), AV12cTpmo_Modulo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218B2 ();
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

   public void we8B2( )
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

   public void pa8B2( )
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
         cmbavCtpmo_tipoe_s.setName( "vCTPMO_TIPOE_S" );
         cmbavCtpmo_tipoe_s.setWebtags( "" );
         cmbavCtpmo_tipoe_s.addItem("E", "ENTRADA", (short)(0));
         cmbavCtpmo_tipoe_s.addItem("S", "SALIDA", (short)(0));
         cmbavCtpmo_tipoe_s.addItem("T", "TRASPASO", (short)(0));
         cmbavCtpmo_tipoe_s.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbavCtpmo_tipoe_s.getItemCount() > 0 )
         {
            AV11cTpmo_TipoE_S = cmbavCtpmo_tipoe_s.getValidValue(AV11cTpmo_TipoE_S) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTpmo_TipoE_S", AV11cTpmo_TipoE_S);
         }
         cmbavCtpmo_modulo.setName( "vCTPMO_MODULO" );
         cmbavCtpmo_modulo.setWebtags( "" );
         cmbavCtpmo_modulo.addItem("", "", (short)(0));
         cmbavCtpmo_modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbavCtpmo_modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavCtpmo_modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbavCtpmo_modulo.getItemCount() > 0 )
         {
            AV12cTpmo_Modulo = cmbavCtpmo_modulo.getValidValue(AV12cTpmo_Modulo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTpmo_Modulo", AV12cTpmo_Modulo);
         }
         GXCCtl = "TPMO_ESTADO_" + sGXsfl_84_idx ;
         cmbTpmo_Estado.setName( GXCCtl );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cTpmo_Codigo ,
                                  String AV7cTpmo_Descripcion ,
                                  long AV8cTipo_Codigo ,
                                  long AV9cTpmo_AlmacenOrigenId ,
                                  long AV10cTpmo_AlmacenDestinoId ,
                                  String AV11cTpmo_TipoE_S ,
                                  String AV12cTpmo_Modulo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8B2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGO", A38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_DESCRIPCION", A313Tpmo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ESTADO", GXutil.rtrim( A679Tpmo_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCtpmo_tipoe_s.getItemCount() > 0 )
      {
         AV11cTpmo_TipoE_S = cmbavCtpmo_tipoe_s.getValidValue(AV11cTpmo_TipoE_S) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTpmo_TipoE_S", AV11cTpmo_TipoE_S);
      }
      if ( cmbavCtpmo_modulo.getItemCount() > 0 )
      {
         AV12cTpmo_Modulo = cmbavCtpmo_modulo.getValidValue(AV12cTpmo_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTpmo_Modulo", AV12cTpmo_Modulo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8B2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8B2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cTpmo_Descripcion ,
                                              new Long(AV8cTipo_Codigo) ,
                                              new Long(AV9cTpmo_AlmacenOrigenId) ,
                                              new Long(AV10cTpmo_AlmacenDestinoId) ,
                                              AV11cTpmo_TipoE_S ,
                                              AV12cTpmo_Modulo ,
                                              A313Tpmo_Descripcion ,
                                              new Long(A33Tipo_Codigo) ,
                                              new Long(A39Tpmo_AlmacenOrigenId) ,
                                              new Long(A40Tpmo_AlmacenDestinoId) ,
                                              A315Tpmo_TipoE_S ,
                                              A316Tpmo_Modulo ,
                                              A38Tpmo_Codigo ,
                                              AV6cTpmo_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cTpmo_Codigo = GXutil.concat( GXutil.rtrim( AV6cTpmo_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTpmo_Codigo", AV6cTpmo_Codigo);
         lV7cTpmo_Descripcion = GXutil.concat( GXutil.rtrim( AV7cTpmo_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_Descripcion", AV7cTpmo_Descripcion);
         lV11cTpmo_TipoE_S = GXutil.concat( GXutil.rtrim( AV11cTpmo_TipoE_S), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTpmo_TipoE_S", AV11cTpmo_TipoE_S);
         lV12cTpmo_Modulo = GXutil.concat( GXutil.rtrim( AV12cTpmo_Modulo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTpmo_Modulo", AV12cTpmo_Modulo);
         /* Using cursor H008B2 */
         pr_default.execute(0, new Object[] {lV6cTpmo_Codigo, lV7cTpmo_Descripcion, new Long(AV8cTipo_Codigo), new Long(AV9cTpmo_AlmacenOrigenId), new Long(AV10cTpmo_AlmacenDestinoId), lV11cTpmo_TipoE_S, lV12cTpmo_Modulo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A316Tpmo_Modulo = H008B2_A316Tpmo_Modulo[0] ;
            A315Tpmo_TipoE_S = H008B2_A315Tpmo_TipoE_S[0] ;
            A40Tpmo_AlmacenDestinoId = H008B2_A40Tpmo_AlmacenDestinoId[0] ;
            A39Tpmo_AlmacenOrigenId = H008B2_A39Tpmo_AlmacenOrigenId[0] ;
            A33Tipo_Codigo = H008B2_A33Tipo_Codigo[0] ;
            A679Tpmo_Estado = H008B2_A679Tpmo_Estado[0] ;
            n679Tpmo_Estado = H008B2_n679Tpmo_Estado[0] ;
            A313Tpmo_Descripcion = H008B2_A313Tpmo_Descripcion[0] ;
            A38Tpmo_Codigo = H008B2_A38Tpmo_Codigo[0] ;
            /* Execute user event: Load */
            e208B2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8B0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
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
                                           AV7cTpmo_Descripcion ,
                                           new Long(AV8cTipo_Codigo) ,
                                           new Long(AV9cTpmo_AlmacenOrigenId) ,
                                           new Long(AV10cTpmo_AlmacenDestinoId) ,
                                           AV11cTpmo_TipoE_S ,
                                           AV12cTpmo_Modulo ,
                                           A313Tpmo_Descripcion ,
                                           new Long(A33Tipo_Codigo) ,
                                           new Long(A39Tpmo_AlmacenOrigenId) ,
                                           new Long(A40Tpmo_AlmacenDestinoId) ,
                                           A315Tpmo_TipoE_S ,
                                           A316Tpmo_Modulo ,
                                           A38Tpmo_Codigo ,
                                           AV6cTpmo_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cTpmo_Codigo = GXutil.concat( GXutil.rtrim( AV6cTpmo_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cTpmo_Codigo", AV6cTpmo_Codigo);
      lV7cTpmo_Descripcion = GXutil.concat( GXutil.rtrim( AV7cTpmo_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_Descripcion", AV7cTpmo_Descripcion);
      lV11cTpmo_TipoE_S = GXutil.concat( GXutil.rtrim( AV11cTpmo_TipoE_S), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cTpmo_TipoE_S", AV11cTpmo_TipoE_S);
      lV12cTpmo_Modulo = GXutil.concat( GXutil.rtrim( AV12cTpmo_Modulo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTpmo_Modulo", AV12cTpmo_Modulo);
      /* Using cursor H008B3 */
      pr_default.execute(1, new Object[] {lV6cTpmo_Codigo, lV7cTpmo_Descripcion, new Long(AV8cTipo_Codigo), new Long(AV9cTpmo_AlmacenOrigenId), new Long(AV10cTpmo_AlmacenDestinoId), lV11cTpmo_TipoE_S, lV12cTpmo_Modulo});
      GRID1_nRecordCount = H008B3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV8cTipo_Codigo, AV9cTpmo_AlmacenOrigenId, AV10cTpmo_AlmacenDestinoId, AV11cTpmo_TipoE_S, AV12cTpmo_Modulo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8B0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cTpmo_Codigo = httpContext.cgiGet( edtavCtpmo_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTpmo_Codigo", AV6cTpmo_Codigo);
         AV7cTpmo_Descripcion = httpContext.cgiGet( edtavCtpmo_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_Descripcion", AV7cTpmo_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTIPO_CODIGO");
            GX_FocusControl = edtavCtipo_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cTipo_Codigo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTipo_Codigo", GXutil.ltrim( GXutil.str( AV8cTipo_Codigo, 18, 0)));
         }
         else
         {
            AV8cTipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTipo_Codigo", GXutil.ltrim( GXutil.str( AV8cTipo_Codigo, 18, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacenorigenid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacenorigenid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTPMO_ALMACENORIGENID");
            GX_FocusControl = edtavCtpmo_almacenorigenid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cTpmo_AlmacenOrigenId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( AV9cTpmo_AlmacenOrigenId, 11, 0)));
         }
         else
         {
            AV9cTpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacenorigenid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( AV9cTpmo_AlmacenOrigenId, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacendestinoid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacendestinoid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTPMO_ALMACENDESTINOID");
            GX_FocusControl = edtavCtpmo_almacendestinoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cTpmo_AlmacenDestinoId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( AV10cTpmo_AlmacenDestinoId, 11, 0)));
         }
         else
         {
            AV10cTpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( edtavCtpmo_almacendestinoid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( AV10cTpmo_AlmacenDestinoId, 11, 0)));
         }
         cmbavCtpmo_tipoe_s.setName( cmbavCtpmo_tipoe_s.getInternalname() );
         cmbavCtpmo_tipoe_s.setValue( httpContext.cgiGet( cmbavCtpmo_tipoe_s.getInternalname()) );
         AV11cTpmo_TipoE_S = httpContext.cgiGet( cmbavCtpmo_tipoe_s.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTpmo_TipoE_S", AV11cTpmo_TipoE_S);
         cmbavCtpmo_modulo.setName( cmbavCtpmo_modulo.getInternalname() );
         cmbavCtpmo_modulo.setValue( httpContext.cgiGet( cmbavCtpmo_modulo.getInternalname()) );
         AV12cTpmo_Modulo = httpContext.cgiGet( cmbavCtpmo_modulo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTpmo_Modulo", AV12cTpmo_Modulo);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_CODIGO"), AV6cTpmo_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_DESCRIPCION"), AV7cTpmo_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPO_CODIGO"), ",", ".") != AV8cTipo_Codigo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPMO_ALMACENORIGENID"), ",", ".") != AV9cTpmo_AlmacenOrigenId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPMO_ALMACENDESTINOID"), ",", ".") != AV10cTpmo_AlmacenDestinoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_TIPOE_S"), AV11cTpmo_TipoE_S) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_MODULO"), AV12cTpmo_Modulo) != 0 )
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
      e198B2 ();
      if (returnInSub) return;
   }

   public void e198B2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "TIPO DE MOVIMIENTO", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208B2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e218B2 ();
      if (returnInSub) return;
   }

   public void e218B2( )
   {
      /* Enter Routine */
      AV13pTpmo_Codigo = A38Tpmo_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTpmo_Codigo", AV13pTpmo_Codigo);
      httpContext.setWebReturnParms(new Object[] {AV13pTpmo_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pTpmo_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTpmo_Codigo", AV13pTpmo_Codigo);
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
      pa8B2( ) ;
      ws8B2( ) ;
      we8B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414241665");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00v0.js", "?201861414241665");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_84_idx ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION_"+sGXsfl_84_idx ;
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_84_fel_idx ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8B0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A38Tpmo_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Codigo_Internalname,A38Tpmo_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtTpmo_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A38Tpmo_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Descripcion_Internalname, "Link", edtTpmo_Descripcion_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Descripcion_Internalname,A313Tpmo_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtTpmo_Descripcion_Link,"","","",edtTpmo_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_ESTADO_" + sGXsfl_84_idx ;
            cmbTpmo_Estado.setName( GXCCtl );
            cmbTpmo_Estado.setWebtags( "" );
            cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
            cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbTpmo_Estado.getItemCount() > 0 )
            {
               A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
               n679Tpmo_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Estado,cmbTpmo_Estado.getInternalname(),GXutil.rtrim( A679Tpmo_Estado),new Integer(1),cmbTpmo_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTpmo_Estado.setValue( GXutil.rtrim( A679Tpmo_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Estado.getInternalname(), "Values", cmbTpmo_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbltpmo_codigofilter_Internalname = "LBLTPMO_CODIGOFILTER" ;
      edtavCtpmo_codigo_Internalname = "vCTPMO_CODIGO" ;
      divTpmo_codigofiltercontainer_Internalname = "TPMO_CODIGOFILTERCONTAINER" ;
      lblLbltpmo_descripcionfilter_Internalname = "LBLTPMO_DESCRIPCIONFILTER" ;
      edtavCtpmo_descripcion_Internalname = "vCTPMO_DESCRIPCION" ;
      divTpmo_descripcionfiltercontainer_Internalname = "TPMO_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltipo_codigofilter_Internalname = "LBLTIPO_CODIGOFILTER" ;
      edtavCtipo_codigo_Internalname = "vCTIPO_CODIGO" ;
      divTipo_codigofiltercontainer_Internalname = "TIPO_CODIGOFILTERCONTAINER" ;
      lblLbltpmo_almacenorigenidfilter_Internalname = "LBLTPMO_ALMACENORIGENIDFILTER" ;
      edtavCtpmo_almacenorigenid_Internalname = "vCTPMO_ALMACENORIGENID" ;
      divTpmo_almacenorigenidfiltercontainer_Internalname = "TPMO_ALMACENORIGENIDFILTERCONTAINER" ;
      lblLbltpmo_almacendestinoidfilter_Internalname = "LBLTPMO_ALMACENDESTINOIDFILTER" ;
      edtavCtpmo_almacendestinoid_Internalname = "vCTPMO_ALMACENDESTINOID" ;
      divTpmo_almacendestinoidfiltercontainer_Internalname = "TPMO_ALMACENDESTINOIDFILTERCONTAINER" ;
      lblLbltpmo_tipoe_sfilter_Internalname = "LBLTPMO_TIPOE_SFILTER" ;
      cmbavCtpmo_tipoe_s.setInternalname( "vCTPMO_TIPOE_S" );
      divTpmo_tipoe_sfiltercontainer_Internalname = "TPMO_TIPOE_SFILTERCONTAINER" ;
      lblLbltpmo_modulofilter_Internalname = "LBLTPMO_MODULOFILTER" ;
      cmbavCtpmo_modulo.setInternalname( "vCTPMO_MODULO" );
      divTpmo_modulofiltercontainer_Internalname = "TPMO_MODULOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO" ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION" ;
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO" );
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
      cmbTpmo_Estado.setJsonclick( "" );
      edtTpmo_Descripcion_Jsonclick = "" ;
      edtTpmo_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTpmo_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCtpmo_modulo.setJsonclick( "" );
      cmbavCtpmo_modulo.setEnabled( 1 );
      cmbavCtpmo_modulo.setVisible( 1 );
      cmbavCtpmo_tipoe_s.setJsonclick( "" );
      cmbavCtpmo_tipoe_s.setEnabled( 1 );
      cmbavCtpmo_tipoe_s.setVisible( 1 );
      edtavCtpmo_almacendestinoid_Jsonclick = "" ;
      edtavCtpmo_almacendestinoid_Enabled = 1 ;
      edtavCtpmo_almacendestinoid_Visible = 1 ;
      edtavCtpmo_almacenorigenid_Jsonclick = "" ;
      edtavCtpmo_almacenorigenid_Enabled = 1 ;
      edtavCtpmo_almacenorigenid_Visible = 1 ;
      edtavCtipo_codigo_Jsonclick = "" ;
      edtavCtipo_codigo_Enabled = 1 ;
      edtavCtipo_codigo_Visible = 1 ;
      edtavCtpmo_descripcion_Jsonclick = "" ;
      edtavCtpmo_descripcion_Enabled = 1 ;
      edtavCtpmo_descripcion_Visible = 1 ;
      edtavCtpmo_codigo_Jsonclick = "" ;
      edtavCtpmo_codigo_Enabled = 1 ;
      edtavCtpmo_codigo_Visible = 1 ;
      divTpmo_modulofiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_tipoe_sfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_almacendestinoidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_almacenorigenidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTipo_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List TIPO DE MOVIMIENTO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV8cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTpmo_AlmacenOrigenId',fld:'vCTPMO_ALMACENORIGENID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTpmo_AlmacenDestinoId',fld:'vCTPMO_ALMACENDESTINOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_tipoe_s'},{av:'AV11cTpmo_TipoE_S',fld:'vCTPMO_TIPOE_S',pic:'',nv:''},{av:'cmbavCtpmo_modulo'},{av:'AV12cTpmo_Modulo',fld:'vCTPMO_MODULO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188B1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLTPMO_CODIGOFILTER.CLICK","{handler:'e118B1',iparms:[{av:'divTpmo_codigofiltercontainer_Class',ctrl:'TPMO_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_codigofiltercontainer_Class',ctrl:'TPMO_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_codigo_Visible',ctrl:'vCTPMO_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_DESCRIPCIONFILTER.CLICK","{handler:'e128B1',iparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_descripcion_Visible',ctrl:'vCTPMO_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTIPO_CODIGOFILTER.CLICK","{handler:'e138B1',iparms:[{av:'divTipo_codigofiltercontainer_Class',ctrl:'TIPO_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipo_codigofiltercontainer_Class',ctrl:'TIPO_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtipo_codigo_Visible',ctrl:'vCTIPO_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_ALMACENORIGENIDFILTER.CLICK","{handler:'e148B1',iparms:[{av:'divTpmo_almacenorigenidfiltercontainer_Class',ctrl:'TPMO_ALMACENORIGENIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_almacenorigenidfiltercontainer_Class',ctrl:'TPMO_ALMACENORIGENIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_almacenorigenid_Visible',ctrl:'vCTPMO_ALMACENORIGENID',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_ALMACENDESTINOIDFILTER.CLICK","{handler:'e158B1',iparms:[{av:'divTpmo_almacendestinoidfiltercontainer_Class',ctrl:'TPMO_ALMACENDESTINOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_almacendestinoidfiltercontainer_Class',ctrl:'TPMO_ALMACENDESTINOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_almacendestinoid_Visible',ctrl:'vCTPMO_ALMACENDESTINOID',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_TIPOE_SFILTER.CLICK","{handler:'e168B1',iparms:[{av:'divTpmo_tipoe_sfiltercontainer_Class',ctrl:'TPMO_TIPOE_SFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_tipoe_sfiltercontainer_Class',ctrl:'TPMO_TIPOE_SFILTERCONTAINER',prop:'Class'},{av:'cmbavCtpmo_tipoe_s'}]}");
      setEventMetadata("LBLTPMO_MODULOFILTER.CLICK","{handler:'e178B1',iparms:[{av:'divTpmo_modulofiltercontainer_Class',ctrl:'TPMO_MODULOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_modulofiltercontainer_Class',ctrl:'TPMO_MODULOFILTERCONTAINER',prop:'Class'},{av:'cmbavCtpmo_modulo'}]}");
      setEventMetadata("ENTER","{handler:'e218B2',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV8cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTpmo_AlmacenOrigenId',fld:'vCTPMO_ALMACENORIGENID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTpmo_AlmacenDestinoId',fld:'vCTPMO_ALMACENDESTINOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_tipoe_s'},{av:'AV11cTpmo_TipoE_S',fld:'vCTPMO_TIPOE_S',pic:'',nv:''},{av:'cmbavCtpmo_modulo'},{av:'AV12cTpmo_Modulo',fld:'vCTPMO_MODULO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV8cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTpmo_AlmacenOrigenId',fld:'vCTPMO_ALMACENORIGENID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTpmo_AlmacenDestinoId',fld:'vCTPMO_ALMACENDESTINOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_tipoe_s'},{av:'AV11cTpmo_TipoE_S',fld:'vCTPMO_TIPOE_S',pic:'',nv:''},{av:'cmbavCtpmo_modulo'},{av:'AV12cTpmo_Modulo',fld:'vCTPMO_MODULO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV8cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTpmo_AlmacenOrigenId',fld:'vCTPMO_ALMACENORIGENID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTpmo_AlmacenDestinoId',fld:'vCTPMO_ALMACENDESTINOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_tipoe_s'},{av:'AV11cTpmo_TipoE_S',fld:'vCTPMO_TIPOE_S',pic:'',nv:''},{av:'cmbavCtpmo_modulo'},{av:'AV12cTpmo_Modulo',fld:'vCTPMO_MODULO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV8cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTpmo_AlmacenOrigenId',fld:'vCTPMO_ALMACENORIGENID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTpmo_AlmacenDestinoId',fld:'vCTPMO_ALMACENDESTINOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_tipoe_s'},{av:'AV11cTpmo_TipoE_S',fld:'vCTPMO_TIPOE_S',pic:'',nv:''},{av:'cmbavCtpmo_modulo'},{av:'AV12cTpmo_Modulo',fld:'vCTPMO_MODULO',pic:'',nv:''}],oparms:[]}");
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
      AV6cTpmo_Codigo = "" ;
      AV7cTpmo_Descripcion = "" ;
      AV11cTpmo_TipoE_S = "" ;
      AV12cTpmo_Modulo = "" ;
      GXKey = "" ;
      AV13pTpmo_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbltpmo_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltpmo_descripcionfilter_Jsonclick = "" ;
      lblLbltipo_codigofilter_Jsonclick = "" ;
      lblLbltpmo_almacenorigenidfilter_Jsonclick = "" ;
      lblLbltpmo_almacendestinoidfilter_Jsonclick = "" ;
      lblLbltpmo_tipoe_sfilter_Jsonclick = "" ;
      lblLbltpmo_modulofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A38Tpmo_Codigo = "" ;
      A313Tpmo_Descripcion = "" ;
      A679Tpmo_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV6cTpmo_Codigo = "" ;
      lV7cTpmo_Descripcion = "" ;
      lV11cTpmo_TipoE_S = "" ;
      lV12cTpmo_Modulo = "" ;
      A315Tpmo_TipoE_S = "" ;
      A316Tpmo_Modulo = "" ;
      H008B2_A316Tpmo_Modulo = new String[] {""} ;
      H008B2_A315Tpmo_TipoE_S = new String[] {""} ;
      H008B2_A40Tpmo_AlmacenDestinoId = new long[1] ;
      H008B2_A39Tpmo_AlmacenOrigenId = new long[1] ;
      H008B2_A33Tipo_Codigo = new long[1] ;
      H008B2_A679Tpmo_Estado = new String[] {""} ;
      H008B2_n679Tpmo_Estado = new boolean[] {false} ;
      H008B2_A313Tpmo_Descripcion = new String[] {""} ;
      H008B2_A38Tpmo_Codigo = new String[] {""} ;
      H008B3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00v0__default(),
         new Object[] {
             new Object[] {
            H008B2_A316Tpmo_Modulo, H008B2_A315Tpmo_TipoE_S, H008B2_A40Tpmo_AlmacenDestinoId, H008B2_A39Tpmo_AlmacenOrigenId, H008B2_A33Tipo_Codigo, H008B2_A679Tpmo_Estado, H008B2_n679Tpmo_Estado, H008B2_A313Tpmo_Descripcion, H008B2_A38Tpmo_Codigo
            }
            , new Object[] {
            H008B3_AGRID1_nRecordCount
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
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCtpmo_codigo_Visible ;
   private int edtavCtpmo_codigo_Enabled ;
   private int edtavCtpmo_descripcion_Visible ;
   private int edtavCtpmo_descripcion_Enabled ;
   private int edtavCtipo_codigo_Enabled ;
   private int edtavCtipo_codigo_Visible ;
   private int edtavCtpmo_almacenorigenid_Enabled ;
   private int edtavCtpmo_almacenorigenid_Visible ;
   private int edtavCtpmo_almacendestinoid_Enabled ;
   private int edtavCtpmo_almacendestinoid_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV8cTipo_Codigo ;
   private long AV9cTpmo_AlmacenOrigenId ;
   private long AV10cTpmo_AlmacenDestinoId ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long A33Tipo_Codigo ;
   private long A39Tpmo_AlmacenOrigenId ;
   private long A40Tpmo_AlmacenDestinoId ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divTpmo_codigofiltercontainer_Class ;
   private String divTpmo_descripcionfiltercontainer_Class ;
   private String divTipo_codigofiltercontainer_Class ;
   private String divTpmo_almacenorigenidfiltercontainer_Class ;
   private String divTpmo_almacendestinoidfiltercontainer_Class ;
   private String divTpmo_tipoe_sfiltercontainer_Class ;
   private String divTpmo_modulofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divTpmo_codigofiltercontainer_Internalname ;
   private String lblLbltpmo_codigofilter_Internalname ;
   private String lblLbltpmo_codigofilter_Jsonclick ;
   private String edtavCtpmo_codigo_Internalname ;
   private String TempTags ;
   private String edtavCtpmo_codigo_Jsonclick ;
   private String divTpmo_descripcionfiltercontainer_Internalname ;
   private String lblLbltpmo_descripcionfilter_Internalname ;
   private String lblLbltpmo_descripcionfilter_Jsonclick ;
   private String edtavCtpmo_descripcion_Internalname ;
   private String edtavCtpmo_descripcion_Jsonclick ;
   private String divTipo_codigofiltercontainer_Internalname ;
   private String lblLbltipo_codigofilter_Internalname ;
   private String lblLbltipo_codigofilter_Jsonclick ;
   private String edtavCtipo_codigo_Internalname ;
   private String edtavCtipo_codigo_Jsonclick ;
   private String divTpmo_almacenorigenidfiltercontainer_Internalname ;
   private String lblLbltpmo_almacenorigenidfilter_Internalname ;
   private String lblLbltpmo_almacenorigenidfilter_Jsonclick ;
   private String edtavCtpmo_almacenorigenid_Internalname ;
   private String edtavCtpmo_almacenorigenid_Jsonclick ;
   private String divTpmo_almacendestinoidfiltercontainer_Internalname ;
   private String lblLbltpmo_almacendestinoidfilter_Internalname ;
   private String lblLbltpmo_almacendestinoidfilter_Jsonclick ;
   private String edtavCtpmo_almacendestinoid_Internalname ;
   private String edtavCtpmo_almacendestinoid_Jsonclick ;
   private String divTpmo_tipoe_sfiltercontainer_Internalname ;
   private String lblLbltpmo_tipoe_sfilter_Internalname ;
   private String lblLbltpmo_tipoe_sfilter_Jsonclick ;
   private String divTpmo_modulofiltercontainer_Internalname ;
   private String lblLbltpmo_modulofilter_Internalname ;
   private String lblLbltpmo_modulofilter_Jsonclick ;
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
   private String edtTpmo_Descripcion_Link ;
   private String A679Tpmo_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTpmo_Codigo_Internalname ;
   private String edtTpmo_Descripcion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtTpmo_Descripcion_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n679Tpmo_Estado ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cTpmo_Codigo ;
   private String AV7cTpmo_Descripcion ;
   private String AV11cTpmo_TipoE_S ;
   private String AV12cTpmo_Modulo ;
   private String AV13pTpmo_Codigo ;
   private String A38Tpmo_Codigo ;
   private String A313Tpmo_Descripcion ;
   private String AV17Linkselection_GXI ;
   private String lV6cTpmo_Codigo ;
   private String lV7cTpmo_Descripcion ;
   private String lV11cTpmo_TipoE_S ;
   private String lV12cTpmo_Modulo ;
   private String A315Tpmo_TipoE_S ;
   private String A316Tpmo_Modulo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCtpmo_tipoe_s ;
   private HTMLChoice cmbavCtpmo_modulo ;
   private HTMLChoice cmbTpmo_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H008B2_A316Tpmo_Modulo ;
   private String[] H008B2_A315Tpmo_TipoE_S ;
   private long[] H008B2_A40Tpmo_AlmacenDestinoId ;
   private long[] H008B2_A39Tpmo_AlmacenOrigenId ;
   private long[] H008B2_A33Tipo_Codigo ;
   private String[] H008B2_A679Tpmo_Estado ;
   private boolean[] H008B2_n679Tpmo_Estado ;
   private String[] H008B2_A313Tpmo_Descripcion ;
   private String[] H008B2_A38Tpmo_Codigo ;
   private long[] H008B3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00v0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTpmo_Descripcion ,
                                          long AV8cTipo_Codigo ,
                                          long AV9cTpmo_AlmacenOrigenId ,
                                          long AV10cTpmo_AlmacenDestinoId ,
                                          String AV11cTpmo_TipoE_S ,
                                          String AV12cTpmo_Modulo ,
                                          String A313Tpmo_Descripcion ,
                                          long A33Tipo_Codigo ,
                                          long A39Tpmo_AlmacenOrigenId ,
                                          long A40Tpmo_AlmacenDestinoId ,
                                          String A315Tpmo_TipoE_S ,
                                          String A316Tpmo_Modulo ,
                                          String A38Tpmo_Codigo ,
                                          String AV6cTpmo_Codigo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Tpmo_Modulo, Tpmo_TipoE_S, Tpmo_AlmacenDestinoId, Tpmo_AlmacenOrigenId," ;
      sSelectString = sSelectString + " Tipo_Codigo, Tpmo_Estado, Tpmo_Descripcion, Tpmo_Codigo" ;
      sFromString = " FROM ALM_TIPO_MOVIMIENTO" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Tpmo_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTpmo_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTipo_Codigo) )
      {
         sWhereString = sWhereString + " and (Tipo_Codigo >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTpmo_AlmacenOrigenId) )
      {
         sWhereString = sWhereString + " and (Tpmo_AlmacenOrigenId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cTpmo_AlmacenDestinoId) )
      {
         sWhereString = sWhereString + " and (Tpmo_AlmacenDestinoId >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTpmo_TipoE_S)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_TipoE_S like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTpmo_Modulo)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_Modulo like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Tpmo_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTpmo_Descripcion ,
                                          long AV8cTipo_Codigo ,
                                          long AV9cTpmo_AlmacenOrigenId ,
                                          long AV10cTpmo_AlmacenDestinoId ,
                                          String AV11cTpmo_TipoE_S ,
                                          String AV12cTpmo_Modulo ,
                                          String A313Tpmo_Descripcion ,
                                          long A33Tipo_Codigo ,
                                          long A39Tpmo_AlmacenOrigenId ,
                                          long A40Tpmo_AlmacenDestinoId ,
                                          String A315Tpmo_TipoE_S ,
                                          String A316Tpmo_Modulo ,
                                          String A38Tpmo_Codigo ,
                                          String AV6cTpmo_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_TIPO_MOVIMIENTO" ;
      scmdbuf = scmdbuf + " WHERE (Tpmo_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTpmo_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTipo_Codigo) )
      {
         sWhereString = sWhereString + " and (Tipo_Codigo >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTpmo_AlmacenOrigenId) )
      {
         sWhereString = sWhereString + " and (Tpmo_AlmacenOrigenId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cTpmo_AlmacenDestinoId) )
      {
         sWhereString = sWhereString + " and (Tpmo_AlmacenDestinoId >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTpmo_TipoE_S)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_TipoE_S like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTpmo_Modulo)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_Modulo like ?)" ;
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
                  return conditional_H008B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H008B3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
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
                  stmt.setVarchar(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 8);
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
                  stmt.setVarchar(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[9]).longValue(), 0);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 8);
               }
               return;
      }
   }

}

