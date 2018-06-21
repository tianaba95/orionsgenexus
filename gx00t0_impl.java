/*
               File: gx00t0_impl
        Description: Selection List Bodega
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:7.87
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

public final  class gx00t0_impl extends GXDataArea
{
   public gx00t0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00t0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00t0_impl.class ));
   }

   public gx00t0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCbode_estado = new HTMLChoice();
      cmbBode_Estado = new HTMLChoice();
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
            AV6cBode_Codigo = httpContext.GetNextPar( ) ;
            AV7cBode_Descripcion = httpContext.GetNextPar( ) ;
            AV8cBode_UsuarioCrea = httpContext.GetNextPar( ) ;
            AV9cBode_FechaCrea = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV10cBode_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV11cBode_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV12cBode_Estado = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
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
            AV13pBode_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pBode_Codigo", AV13pBode_Codigo);
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
      pa852( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start852( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141424792");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00t0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pBode_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_DESCRIPCION", AV7cBode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_USUARIOCREA", AV8cBode_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_FECHACREA", localUtil.ttoc( AV9cBode_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_USUARIOMODIFICA", AV10cBode_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_FECHAMODIFICA", localUtil.ttoc( AV11cBode_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_ESTADO", GXutil.rtrim( AV12cBode_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPBODE_CODIGO", AV13pBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divBode_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divBode_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_USUARIOCREAFILTERCONTAINER_Class", GXutil.rtrim( divBode_usuariocreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_FECHACREAFILTERCONTAINER_Class", GXutil.rtrim( divBode_fechacreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divBode_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divBode_fechamodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divBode_estadofiltercontainer_Class));
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
         we852( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt852( ) ;
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
      return formatLink("com.orions2.gx00t0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pBode_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "Gx00T0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Bodega" ;
   }

   public void wb850( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_codigofilter_Internalname, "Código Bodega", "", "", lblLblbode_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11851_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_codigo_Internalname, AV6cBode_Codigo, GXutil.rtrim( localUtil.format( AV6cBode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_codigo_Visible, edtavCbode_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_descripcionfilter_Internalname, "Nombre Bodega", "", "", lblLblbode_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12851_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_descripcion_Internalname, "Nombre Bodega", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_descripcion_Internalname, AV7cBode_Descripcion, GXutil.rtrim( localUtil.format( AV7cBode_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_descripcion_Visible, edtavCbode_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_usuariocreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_usuariocreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_usuariocreafilter_Internalname, "Usuario Creación", "", "", lblLblbode_usuariocreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13851_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_usuariocrea_Internalname, "Usuario Creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_usuariocrea_Internalname, AV8cBode_UsuarioCrea, GXutil.rtrim( localUtil.format( AV8cBode_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_usuariocrea_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_usuariocrea_Visible, edtavCbode_usuariocrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_fechacreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_fechacreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_fechacreafilter_Internalname, "Fecha Creación", "", "", lblLblbode_fechacreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14851_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_fechacrea_Internalname, "Fecha Creación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCbode_fechacrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_fechacrea_Internalname, localUtil.ttoc( AV9cBode_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV9cBode_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_fechacrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCbode_fechacrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00T0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_usuariomodificafilter_Internalname, "Usuario Modificación", "", "", lblLblbode_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15851_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_usuariomodifica_Internalname, "Usuario Modificación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_usuariomodifica_Internalname, AV10cBode_UsuarioModifica, GXutil.rtrim( localUtil.format( AV10cBode_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_usuariomodifica_Visible, edtavCbode_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_fechamodificafilter_Internalname, "Fecha Modificación", "", "", lblLblbode_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16851_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCbode_fechamodifica_Internalname, "Fecha Modificación", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCbode_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_fechamodifica_Internalname, localUtil.ttoc( AV11cBode_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV11cBode_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCbode_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00T0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_estadofilter_Internalname, "Estado", "", "", lblLblbode_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17851_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCbode_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCbode_estado, cmbavCbode_estado.getInternalname(), GXutil.rtrim( AV12cBode_Estado), 1, cmbavCbode_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCbode_estado.getVisible(), cmbavCbode_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx00T0.htm");
         cmbavCbode_estado.setValue( GXutil.rtrim( AV12cBode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCbode_estado.getInternalname(), "Values", cmbavCbode_estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18851_client"+"'", TempTags, "", 2, "HLP_Gx00T0.htm");
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
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Bodega") ;
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
            Grid1Column.AddObjectProperty("Value", A31Bode_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A251Bode_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtBode_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A674Bode_Estado));
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00T0.htm");
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

   public void start852( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Bodega", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup850( ) ;
   }

   public void ws852( )
   {
      start852( ) ;
      evt852( ) ;
   }

   public void evt852( )
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
                           A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
                           A251Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtBode_Descripcion_Internalname)) ;
                           cmbBode_Estado.setName( cmbBode_Estado.getInternalname() );
                           cmbBode_Estado.setValue( httpContext.cgiGet( cmbBode_Estado.getInternalname()) );
                           A674Bode_Estado = httpContext.cgiGet( cmbBode_Estado.getInternalname()) ;
                           n674Bode_Estado = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19852 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20852 ();
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
                                    /* Set Refresh If Cbode_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_DESCRIPCION"), AV7cBode_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_usuariocrea Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_USUARIOCREA"), AV8cBode_UsuarioCrea) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_fechacrea Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCBODE_FECHACREA"), 0), AV9cBode_FechaCrea) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_USUARIOMODIFICA"), AV10cBode_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCBODE_FECHAMODIFICA"), 0), AV11cBode_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_ESTADO"), AV12cBode_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21852 ();
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

   public void we852( )
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

   public void pa852( )
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
         cmbavCbode_estado.setName( "vCBODE_ESTADO" );
         cmbavCbode_estado.setWebtags( "" );
         cmbavCbode_estado.addItem("A", "Activo", (short)(0));
         cmbavCbode_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCbode_estado.getItemCount() > 0 )
         {
            AV12cBode_Estado = cmbavCbode_estado.getValidValue(AV12cBode_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cBode_Estado", AV12cBode_Estado);
         }
         GXCCtl = "BODE_ESTADO_" + sGXsfl_84_idx ;
         cmbBode_Estado.setName( GXCCtl );
         cmbBode_Estado.setWebtags( "" );
         cmbBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBode_Estado.getItemCount() > 0 )
         {
            A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
            n674Bode_Estado = false ;
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
                                  String AV6cBode_Codigo ,
                                  String AV7cBode_Descripcion ,
                                  String AV8cBode_UsuarioCrea ,
                                  java.util.Date AV9cBode_FechaCrea ,
                                  String AV10cBode_UsuarioModifica ,
                                  java.util.Date AV11cBode_FechaModifica ,
                                  String AV12cBode_Estado )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf852( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_DESCRIPCION", A251Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_ESTADO", GXutil.rtrim( A674Bode_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCbode_estado.getItemCount() > 0 )
      {
         AV12cBode_Estado = cmbavCbode_estado.getValidValue(AV12cBode_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cBode_Estado", AV12cBode_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf852( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf852( )
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
                                              AV7cBode_Descripcion ,
                                              AV8cBode_UsuarioCrea ,
                                              AV9cBode_FechaCrea ,
                                              AV10cBode_UsuarioModifica ,
                                              AV11cBode_FechaModifica ,
                                              AV12cBode_Estado ,
                                              A251Bode_Descripcion ,
                                              A287Bode_UsuarioCrea ,
                                              A288Bode_FechaCrea ,
                                              A289Bode_UsuarioModifica ,
                                              A290Bode_FechaModifica ,
                                              A674Bode_Estado ,
                                              A31Bode_Codigo ,
                                              AV6cBode_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cBode_Codigo = GXutil.concat( GXutil.rtrim( AV6cBode_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
         lV7cBode_Descripcion = GXutil.concat( GXutil.rtrim( AV7cBode_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cBode_Descripcion", AV7cBode_Descripcion);
         lV8cBode_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cBode_UsuarioCrea), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cBode_UsuarioCrea", AV8cBode_UsuarioCrea);
         lV10cBode_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV10cBode_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_UsuarioModifica", AV10cBode_UsuarioModifica);
         lV12cBode_Estado = GXutil.padr( GXutil.rtrim( AV12cBode_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cBode_Estado", AV12cBode_Estado);
         /* Using cursor H00852 */
         pr_default.execute(0, new Object[] {lV6cBode_Codigo, lV7cBode_Descripcion, lV8cBode_UsuarioCrea, AV9cBode_FechaCrea, lV10cBode_UsuarioModifica, AV11cBode_FechaModifica, lV12cBode_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A290Bode_FechaModifica = H00852_A290Bode_FechaModifica[0] ;
            n290Bode_FechaModifica = H00852_n290Bode_FechaModifica[0] ;
            A289Bode_UsuarioModifica = H00852_A289Bode_UsuarioModifica[0] ;
            n289Bode_UsuarioModifica = H00852_n289Bode_UsuarioModifica[0] ;
            A288Bode_FechaCrea = H00852_A288Bode_FechaCrea[0] ;
            n288Bode_FechaCrea = H00852_n288Bode_FechaCrea[0] ;
            A287Bode_UsuarioCrea = H00852_A287Bode_UsuarioCrea[0] ;
            n287Bode_UsuarioCrea = H00852_n287Bode_UsuarioCrea[0] ;
            A674Bode_Estado = H00852_A674Bode_Estado[0] ;
            n674Bode_Estado = H00852_n674Bode_Estado[0] ;
            A251Bode_Descripcion = H00852_A251Bode_Descripcion[0] ;
            A31Bode_Codigo = H00852_A31Bode_Codigo[0] ;
            /* Execute user event: Load */
            e20852 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb850( ) ;
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
                                           AV7cBode_Descripcion ,
                                           AV8cBode_UsuarioCrea ,
                                           AV9cBode_FechaCrea ,
                                           AV10cBode_UsuarioModifica ,
                                           AV11cBode_FechaModifica ,
                                           AV12cBode_Estado ,
                                           A251Bode_Descripcion ,
                                           A287Bode_UsuarioCrea ,
                                           A288Bode_FechaCrea ,
                                           A289Bode_UsuarioModifica ,
                                           A290Bode_FechaModifica ,
                                           A674Bode_Estado ,
                                           A31Bode_Codigo ,
                                           AV6cBode_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cBode_Codigo = GXutil.concat( GXutil.rtrim( AV6cBode_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
      lV7cBode_Descripcion = GXutil.concat( GXutil.rtrim( AV7cBode_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cBode_Descripcion", AV7cBode_Descripcion);
      lV8cBode_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cBode_UsuarioCrea), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cBode_UsuarioCrea", AV8cBode_UsuarioCrea);
      lV10cBode_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV10cBode_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_UsuarioModifica", AV10cBode_UsuarioModifica);
      lV12cBode_Estado = GXutil.padr( GXutil.rtrim( AV12cBode_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cBode_Estado", AV12cBode_Estado);
      /* Using cursor H00853 */
      pr_default.execute(1, new Object[] {lV6cBode_Codigo, lV7cBode_Descripcion, lV8cBode_UsuarioCrea, AV9cBode_FechaCrea, lV10cBode_UsuarioModifica, AV11cBode_FechaModifica, lV12cBode_Estado});
      GRID1_nRecordCount = H00853_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cBode_Codigo, AV7cBode_Descripcion, AV8cBode_UsuarioCrea, AV9cBode_FechaCrea, AV10cBode_UsuarioModifica, AV11cBode_FechaModifica, AV12cBode_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup850( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19852 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cBode_Codigo = httpContext.cgiGet( edtavCbode_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cBode_Codigo", AV6cBode_Codigo);
         AV7cBode_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCbode_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cBode_Descripcion", AV7cBode_Descripcion);
         AV8cBode_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtavCbode_usuariocrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cBode_UsuarioCrea", AV8cBode_UsuarioCrea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCbode_fechacrea_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCBODE_FECHACREA");
            GX_FocusControl = edtavCbode_fechacrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cBode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9cBode_FechaCrea", localUtil.ttoc( AV9cBode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV9cBode_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtavCbode_fechacrea_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cBode_FechaCrea", localUtil.ttoc( AV9cBode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         AV10cBode_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCbode_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_UsuarioModifica", AV10cBode_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCbode_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCBODE_FECHAMODIFICA");
            GX_FocusControl = edtavCbode_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cBode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV11cBode_FechaModifica", localUtil.ttoc( AV11cBode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV11cBode_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCbode_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cBode_FechaModifica", localUtil.ttoc( AV11cBode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         cmbavCbode_estado.setName( cmbavCbode_estado.getInternalname() );
         cmbavCbode_estado.setValue( httpContext.cgiGet( cmbavCbode_estado.getInternalname()) );
         AV12cBode_Estado = httpContext.cgiGet( cmbavCbode_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cBode_Estado", AV12cBode_Estado);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_DESCRIPCION"), AV7cBode_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_USUARIOCREA"), AV8cBode_UsuarioCrea) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCBODE_FECHACREA"), 0), AV9cBode_FechaCrea) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_USUARIOMODIFICA"), AV10cBode_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCBODE_FECHAMODIFICA"), 0), AV11cBode_FechaModifica) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_ESTADO"), AV12cBode_Estado) != 0 )
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
      e19852 ();
      if (returnInSub) return;
   }

   public void e19852( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Bodega", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20852( )
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
      e21852 ();
      if (returnInSub) return;
   }

   public void e21852( )
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
      AV13pBode_Codigo = (String)getParm(obj,0) ;
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
      pa852( ) ;
      ws852( ) ;
      we852( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141424915");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00t0.js", "?20186141424915");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_84_idx ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION_"+sGXsfl_84_idx ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_84_fel_idx ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb850( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtBode_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Descripcion_Internalname, "Link", edtBode_Descripcion_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Descripcion_Internalname,A251Bode_Descripcion,GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtBode_Descripcion_Link,"","","",edtBode_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BODE_ESTADO_" + sGXsfl_84_idx ;
            cmbBode_Estado.setName( GXCCtl );
            cmbBode_Estado.setWebtags( "" );
            cmbBode_Estado.addItem("A", "Activo", (short)(0));
            cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbBode_Estado.getItemCount() > 0 )
            {
               A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
               n674Bode_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBode_Estado,cmbBode_Estado.getInternalname(),GXutil.rtrim( A674Bode_Estado),new Integer(1),cmbBode_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbBode_Estado.setValue( GXutil.rtrim( A674Bode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBode_Estado.getInternalname(), "Values", cmbBode_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblbode_codigofilter_Internalname = "LBLBODE_CODIGOFILTER" ;
      edtavCbode_codigo_Internalname = "vCBODE_CODIGO" ;
      divBode_codigofiltercontainer_Internalname = "BODE_CODIGOFILTERCONTAINER" ;
      lblLblbode_descripcionfilter_Internalname = "LBLBODE_DESCRIPCIONFILTER" ;
      edtavCbode_descripcion_Internalname = "vCBODE_DESCRIPCION" ;
      divBode_descripcionfiltercontainer_Internalname = "BODE_DESCRIPCIONFILTERCONTAINER" ;
      lblLblbode_usuariocreafilter_Internalname = "LBLBODE_USUARIOCREAFILTER" ;
      edtavCbode_usuariocrea_Internalname = "vCBODE_USUARIOCREA" ;
      divBode_usuariocreafiltercontainer_Internalname = "BODE_USUARIOCREAFILTERCONTAINER" ;
      lblLblbode_fechacreafilter_Internalname = "LBLBODE_FECHACREAFILTER" ;
      edtavCbode_fechacrea_Internalname = "vCBODE_FECHACREA" ;
      divBode_fechacreafiltercontainer_Internalname = "BODE_FECHACREAFILTERCONTAINER" ;
      lblLblbode_usuariomodificafilter_Internalname = "LBLBODE_USUARIOMODIFICAFILTER" ;
      edtavCbode_usuariomodifica_Internalname = "vCBODE_USUARIOMODIFICA" ;
      divBode_usuariomodificafiltercontainer_Internalname = "BODE_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblbode_fechamodificafilter_Internalname = "LBLBODE_FECHAMODIFICAFILTER" ;
      edtavCbode_fechamodifica_Internalname = "vCBODE_FECHAMODIFICA" ;
      divBode_fechamodificafiltercontainer_Internalname = "BODE_FECHAMODIFICAFILTERCONTAINER" ;
      lblLblbode_estadofilter_Internalname = "LBLBODE_ESTADOFILTER" ;
      cmbavCbode_estado.setInternalname( "vCBODE_ESTADO" );
      divBode_estadofiltercontainer_Internalname = "BODE_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION" ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO" );
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
      cmbBode_Estado.setJsonclick( "" );
      edtBode_Descripcion_Jsonclick = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtBode_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCbode_estado.setJsonclick( "" );
      cmbavCbode_estado.setEnabled( 1 );
      cmbavCbode_estado.setVisible( 1 );
      edtavCbode_fechamodifica_Jsonclick = "" ;
      edtavCbode_fechamodifica_Enabled = 1 ;
      edtavCbode_usuariomodifica_Jsonclick = "" ;
      edtavCbode_usuariomodifica_Enabled = 1 ;
      edtavCbode_usuariomodifica_Visible = 1 ;
      edtavCbode_fechacrea_Jsonclick = "" ;
      edtavCbode_fechacrea_Enabled = 1 ;
      edtavCbode_usuariocrea_Jsonclick = "" ;
      edtavCbode_usuariocrea_Enabled = 1 ;
      edtavCbode_usuariocrea_Visible = 1 ;
      edtavCbode_descripcion_Jsonclick = "" ;
      edtavCbode_descripcion_Enabled = 1 ;
      edtavCbode_descripcion_Visible = 1 ;
      edtavCbode_codigo_Jsonclick = "" ;
      edtavCbode_codigo_Enabled = 1 ;
      edtavCbode_codigo_Visible = 1 ;
      divBode_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_fechacreafiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_usuariocreafiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Bodega" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBode_Descripcion',fld:'vCBODE_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cBode_UsuarioCrea',fld:'vCBODE_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cBode_FechaCrea',fld:'vCBODE_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cBode_UsuarioModifica',fld:'vCBODE_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cBode_FechaModifica',fld:'vCBODE_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'cmbavCbode_estado'},{av:'AV12cBode_Estado',fld:'vCBODE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18851',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLBODE_CODIGOFILTER.CLICK","{handler:'e11851',iparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_codigo_Visible',ctrl:'vCBODE_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_DESCRIPCIONFILTER.CLICK","{handler:'e12851',iparms:[{av:'divBode_descripcionfiltercontainer_Class',ctrl:'BODE_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_descripcionfiltercontainer_Class',ctrl:'BODE_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_descripcion_Visible',ctrl:'vCBODE_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_USUARIOCREAFILTER.CLICK","{handler:'e13851',iparms:[{av:'divBode_usuariocreafiltercontainer_Class',ctrl:'BODE_USUARIOCREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_usuariocreafiltercontainer_Class',ctrl:'BODE_USUARIOCREAFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_usuariocrea_Visible',ctrl:'vCBODE_USUARIOCREA',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_FECHACREAFILTER.CLICK","{handler:'e14851',iparms:[{av:'divBode_fechacreafiltercontainer_Class',ctrl:'BODE_FECHACREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_fechacreafiltercontainer_Class',ctrl:'BODE_FECHACREAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLBODE_USUARIOMODIFICAFILTER.CLICK","{handler:'e15851',iparms:[{av:'divBode_usuariomodificafiltercontainer_Class',ctrl:'BODE_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_usuariomodificafiltercontainer_Class',ctrl:'BODE_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_usuariomodifica_Visible',ctrl:'vCBODE_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_FECHAMODIFICAFILTER.CLICK","{handler:'e16851',iparms:[{av:'divBode_fechamodificafiltercontainer_Class',ctrl:'BODE_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_fechamodificafiltercontainer_Class',ctrl:'BODE_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLBODE_ESTADOFILTER.CLICK","{handler:'e17851',iparms:[{av:'divBode_estadofiltercontainer_Class',ctrl:'BODE_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_estadofiltercontainer_Class',ctrl:'BODE_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCbode_estado'}]}");
      setEventMetadata("ENTER","{handler:'e21852',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pBode_Codigo',fld:'vPBODE_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBode_Descripcion',fld:'vCBODE_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cBode_UsuarioCrea',fld:'vCBODE_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cBode_FechaCrea',fld:'vCBODE_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cBode_UsuarioModifica',fld:'vCBODE_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cBode_FechaModifica',fld:'vCBODE_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'cmbavCbode_estado'},{av:'AV12cBode_Estado',fld:'vCBODE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBode_Descripcion',fld:'vCBODE_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cBode_UsuarioCrea',fld:'vCBODE_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cBode_FechaCrea',fld:'vCBODE_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cBode_UsuarioModifica',fld:'vCBODE_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cBode_FechaModifica',fld:'vCBODE_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'cmbavCbode_estado'},{av:'AV12cBode_Estado',fld:'vCBODE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBode_Descripcion',fld:'vCBODE_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cBode_UsuarioCrea',fld:'vCBODE_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cBode_FechaCrea',fld:'vCBODE_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cBode_UsuarioModifica',fld:'vCBODE_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cBode_FechaModifica',fld:'vCBODE_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'cmbavCbode_estado'},{av:'AV12cBode_Estado',fld:'vCBODE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV7cBode_Descripcion',fld:'vCBODE_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cBode_UsuarioCrea',fld:'vCBODE_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cBode_FechaCrea',fld:'vCBODE_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cBode_UsuarioModifica',fld:'vCBODE_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cBode_FechaModifica',fld:'vCBODE_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''},{av:'cmbavCbode_estado'},{av:'AV12cBode_Estado',fld:'vCBODE_ESTADO',pic:'',nv:''}],oparms:[]}");
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
      AV6cBode_Codigo = "" ;
      AV7cBode_Descripcion = "" ;
      AV8cBode_UsuarioCrea = "" ;
      AV9cBode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV10cBode_UsuarioModifica = "" ;
      AV11cBode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV12cBode_Estado = "" ;
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
      lblLblbode_descripcionfilter_Jsonclick = "" ;
      lblLblbode_usuariocreafilter_Jsonclick = "" ;
      lblLblbode_fechacreafilter_Jsonclick = "" ;
      lblLblbode_usuariomodificafilter_Jsonclick = "" ;
      lblLblbode_fechamodificafilter_Jsonclick = "" ;
      lblLblbode_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A31Bode_Codigo = "" ;
      A251Bode_Descripcion = "" ;
      A674Bode_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV6cBode_Codigo = "" ;
      lV7cBode_Descripcion = "" ;
      lV8cBode_UsuarioCrea = "" ;
      lV10cBode_UsuarioModifica = "" ;
      lV12cBode_Estado = "" ;
      A287Bode_UsuarioCrea = "" ;
      A288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A289Bode_UsuarioModifica = "" ;
      A290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      H00852_A290Bode_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00852_n290Bode_FechaModifica = new boolean[] {false} ;
      H00852_A289Bode_UsuarioModifica = new String[] {""} ;
      H00852_n289Bode_UsuarioModifica = new boolean[] {false} ;
      H00852_A288Bode_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00852_n288Bode_FechaCrea = new boolean[] {false} ;
      H00852_A287Bode_UsuarioCrea = new String[] {""} ;
      H00852_n287Bode_UsuarioCrea = new boolean[] {false} ;
      H00852_A674Bode_Estado = new String[] {""} ;
      H00852_n674Bode_Estado = new boolean[] {false} ;
      H00852_A251Bode_Descripcion = new String[] {""} ;
      H00852_A31Bode_Codigo = new String[] {""} ;
      H00853_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00t0__default(),
         new Object[] {
             new Object[] {
            H00852_A290Bode_FechaModifica, H00852_n290Bode_FechaModifica, H00852_A289Bode_UsuarioModifica, H00852_n289Bode_UsuarioModifica, H00852_A288Bode_FechaCrea, H00852_n288Bode_FechaCrea, H00852_A287Bode_UsuarioCrea, H00852_n287Bode_UsuarioCrea, H00852_A674Bode_Estado, H00852_n674Bode_Estado,
            H00852_A251Bode_Descripcion, H00852_A31Bode_Codigo
            }
            , new Object[] {
            H00853_AGRID1_nRecordCount
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
   private int edtavCbode_codigo_Visible ;
   private int edtavCbode_codigo_Enabled ;
   private int edtavCbode_descripcion_Visible ;
   private int edtavCbode_descripcion_Enabled ;
   private int edtavCbode_usuariocrea_Visible ;
   private int edtavCbode_usuariocrea_Enabled ;
   private int edtavCbode_fechacrea_Enabled ;
   private int edtavCbode_usuariomodifica_Visible ;
   private int edtavCbode_usuariomodifica_Enabled ;
   private int edtavCbode_fechamodifica_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divBode_codigofiltercontainer_Class ;
   private String divBode_descripcionfiltercontainer_Class ;
   private String divBode_usuariocreafiltercontainer_Class ;
   private String divBode_fechacreafiltercontainer_Class ;
   private String divBode_usuariomodificafiltercontainer_Class ;
   private String divBode_fechamodificafiltercontainer_Class ;
   private String divBode_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV12cBode_Estado ;
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
   private String divBode_descripcionfiltercontainer_Internalname ;
   private String lblLblbode_descripcionfilter_Internalname ;
   private String lblLblbode_descripcionfilter_Jsonclick ;
   private String edtavCbode_descripcion_Internalname ;
   private String edtavCbode_descripcion_Jsonclick ;
   private String divBode_usuariocreafiltercontainer_Internalname ;
   private String lblLblbode_usuariocreafilter_Internalname ;
   private String lblLblbode_usuariocreafilter_Jsonclick ;
   private String edtavCbode_usuariocrea_Internalname ;
   private String edtavCbode_usuariocrea_Jsonclick ;
   private String divBode_fechacreafiltercontainer_Internalname ;
   private String lblLblbode_fechacreafilter_Internalname ;
   private String lblLblbode_fechacreafilter_Jsonclick ;
   private String edtavCbode_fechacrea_Internalname ;
   private String edtavCbode_fechacrea_Jsonclick ;
   private String divBode_usuariomodificafiltercontainer_Internalname ;
   private String lblLblbode_usuariomodificafilter_Internalname ;
   private String lblLblbode_usuariomodificafilter_Jsonclick ;
   private String edtavCbode_usuariomodifica_Internalname ;
   private String edtavCbode_usuariomodifica_Jsonclick ;
   private String divBode_fechamodificafiltercontainer_Internalname ;
   private String lblLblbode_fechamodificafilter_Internalname ;
   private String lblLblbode_fechamodificafilter_Jsonclick ;
   private String edtavCbode_fechamodifica_Internalname ;
   private String edtavCbode_fechamodifica_Jsonclick ;
   private String divBode_estadofiltercontainer_Internalname ;
   private String lblLblbode_estadofilter_Internalname ;
   private String lblLblbode_estadofilter_Jsonclick ;
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
   private String edtBode_Descripcion_Link ;
   private String A674Bode_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtBode_Codigo_Internalname ;
   private String edtBode_Descripcion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV12cBode_Estado ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtBode_Descripcion_Jsonclick ;
   private java.util.Date AV9cBode_FechaCrea ;
   private java.util.Date AV11cBode_FechaModifica ;
   private java.util.Date A288Bode_FechaCrea ;
   private java.util.Date A290Bode_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n674Bode_Estado ;
   private boolean n290Bode_FechaModifica ;
   private boolean n289Bode_UsuarioModifica ;
   private boolean n288Bode_FechaCrea ;
   private boolean n287Bode_UsuarioCrea ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cBode_Codigo ;
   private String AV7cBode_Descripcion ;
   private String AV8cBode_UsuarioCrea ;
   private String AV10cBode_UsuarioModifica ;
   private String AV13pBode_Codigo ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String AV17Linkselection_GXI ;
   private String lV6cBode_Codigo ;
   private String lV7cBode_Descripcion ;
   private String lV8cBode_UsuarioCrea ;
   private String lV10cBode_UsuarioModifica ;
   private String A287Bode_UsuarioCrea ;
   private String A289Bode_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCbode_estado ;
   private HTMLChoice cmbBode_Estado ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00852_A290Bode_FechaModifica ;
   private boolean[] H00852_n290Bode_FechaModifica ;
   private String[] H00852_A289Bode_UsuarioModifica ;
   private boolean[] H00852_n289Bode_UsuarioModifica ;
   private java.util.Date[] H00852_A288Bode_FechaCrea ;
   private boolean[] H00852_n288Bode_FechaCrea ;
   private String[] H00852_A287Bode_UsuarioCrea ;
   private boolean[] H00852_n287Bode_UsuarioCrea ;
   private String[] H00852_A674Bode_Estado ;
   private boolean[] H00852_n674Bode_Estado ;
   private String[] H00852_A251Bode_Descripcion ;
   private String[] H00852_A31Bode_Codigo ;
   private long[] H00853_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00t0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00852( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cBode_Descripcion ,
                                          String AV8cBode_UsuarioCrea ,
                                          java.util.Date AV9cBode_FechaCrea ,
                                          String AV10cBode_UsuarioModifica ,
                                          java.util.Date AV11cBode_FechaModifica ,
                                          String AV12cBode_Estado ,
                                          String A251Bode_Descripcion ,
                                          String A287Bode_UsuarioCrea ,
                                          java.util.Date A288Bode_FechaCrea ,
                                          String A289Bode_UsuarioModifica ,
                                          java.util.Date A290Bode_FechaModifica ,
                                          String A674Bode_Estado ,
                                          String A31Bode_Codigo ,
                                          String AV6cBode_Codigo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Bode_FechaModifica, Bode_UsuarioModifica, Bode_FechaCrea," ;
      sSelectString = sSelectString + " Bode_UsuarioCrea, Bode_Estado, Bode_Descripcion, Bode_Codigo" ;
      sFromString = " FROM ALM_BODEGA" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Bode_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cBode_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Bode_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cBode_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Bode_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cBode_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Bode_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cBode_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Bode_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cBode_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Bode_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cBode_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Bode_Estado like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Bode_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00853( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cBode_Descripcion ,
                                          String AV8cBode_UsuarioCrea ,
                                          java.util.Date AV9cBode_FechaCrea ,
                                          String AV10cBode_UsuarioModifica ,
                                          java.util.Date AV11cBode_FechaModifica ,
                                          String AV12cBode_Estado ,
                                          String A251Bode_Descripcion ,
                                          String A287Bode_UsuarioCrea ,
                                          java.util.Date A288Bode_FechaCrea ,
                                          String A289Bode_UsuarioModifica ,
                                          java.util.Date A290Bode_FechaModifica ,
                                          String A674Bode_Estado ,
                                          String A31Bode_Codigo ,
                                          String AV6cBode_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_BODEGA" ;
      scmdbuf = scmdbuf + " WHERE (Bode_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cBode_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Bode_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cBode_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Bode_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cBode_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Bode_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cBode_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Bode_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cBode_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Bode_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cBode_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Bode_Estado like ?)" ;
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
                  return conditional_H00852(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H00853(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00852", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00853", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
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
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[15], false);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
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

