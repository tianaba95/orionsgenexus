/*
               File: gx0170_impl
        Description: Selection List ALMACEN CATALOGO SEGMENTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:58.6
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

public final  class gx0170_impl extends GXDataArea
{
   public gx0170_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0170_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0170_impl.class ));
   }

   public gx0170_impl( int remoteHandle ,
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
            AV6cSEG_Codigo = httpContext.GetNextPar( ) ;
            AV7cSEG_Descripcion = httpContext.GetNextPar( ) ;
            AV8cTIP_Codigo = httpContext.GetNextPar( ) ;
            AV9cSEG_UsuarioCreacion = httpContext.GetNextPar( ) ;
            AV10cSEG_FechaCreacion = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cSEG_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV12cSEG_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
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
            AV13pSEG_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pSEG_Codigo", AV13pSEG_Codigo);
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
      pa8Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8Z2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414245812");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx0170") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pSEG_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_CODIGO", AV6cSEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_DESCRIPCION", AV7cSEG_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTIP_CODIGO", AV8cTIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_USUARIOCREACION", AV9cSEG_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_FECHACREACION", localUtil.ttoc( AV10cSEG_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_USUARIOMODIFICA", AV11cSEG_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSEG_FECHAMODIFICA", localUtil.ttoc( AV12cSEG_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPSEG_CODIGO", AV13pSEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divSeg_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divSeg_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIP_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTip_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_USUARIOCREACIONFILTERCONTAINER_Class", GXutil.rtrim( divSeg_usuariocreacionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_FECHACREACIONFILTERCONTAINER_Class", GXutil.rtrim( divSeg_fechacreacionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divSeg_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divSeg_fechamodificafiltercontainer_Class));
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
         we8Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8Z2( ) ;
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
      return formatLink("com.orions2.gx0170") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pSEG_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "Gx0170" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List ALMACEN CATALOGO SEGMENTO" ;
   }

   public void wb8Z0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_codigofilter_Internalname, "Segmento Codigo", "", "", lblLblseg_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_codigo_Internalname, "Segmento Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_codigo_Internalname, AV6cSEG_Codigo, GXutil.rtrim( localUtil.format( AV6cSEG_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCseg_codigo_Visible, edtavCseg_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_descripcionfilter_Internalname, "Segmento Descripcion", "", "", lblLblseg_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_descripcion_Internalname, "Segmento Descripcion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_descripcion_Internalname, AV7cSEG_Descripcion, GXutil.rtrim( localUtil.format( AV7cSEG_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCseg_descripcion_Visible, edtavCseg_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTip_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTip_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltip_codigofilter_Internalname, "Tipo Codigo", "", "", lblLbltip_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtip_codigo_Internalname, "Tipo Codigo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtip_codigo_Internalname, AV8cTIP_Codigo, GXutil.rtrim( localUtil.format( AV8cTIP_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtip_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtip_codigo_Visible, edtavCtip_codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_usuariocreacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_usuariocreacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_usuariocreacionfilter_Internalname, "Segmento Usuario Creacion", "", "", lblLblseg_usuariocreacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_usuariocreacion_Internalname, "Segmento Usuario Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_usuariocreacion_Internalname, AV9cSEG_UsuarioCreacion, GXutil.rtrim( localUtil.format( AV9cSEG_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_usuariocreacion_Jsonclick, 0, "Attribute", "", "", "", edtavCseg_usuariocreacion_Visible, edtavCseg_usuariocreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_fechacreacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_fechacreacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_fechacreacionfilter_Internalname, "Segmento Fecha Creacion", "", "", lblLblseg_fechacreacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158z1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_fechacreacion_Internalname, "Segmento Fecha Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCseg_fechacreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_fechacreacion_Internalname, localUtil.ttoc( AV10cSEG_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cSEG_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_fechacreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCseg_fechacreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_usuariomodificafilter_Internalname, "Segmento Usuario Modifica", "", "", lblLblseg_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168z1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_usuariomodifica_Internalname, "Segmento Usuario Modifica", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_usuariomodifica_Internalname, AV11cSEG_UsuarioModifica, GXutil.rtrim( localUtil.format( AV11cSEG_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCseg_usuariomodifica_Visible, edtavCseg_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0170.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_fechamodificafilter_Internalname, "Segmentio Fecha Modifica", "", "", lblLblseg_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178z1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0170.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCseg_fechamodifica_Internalname, "Segmentio Fecha Modifica", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCseg_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCseg_fechamodifica_Internalname, localUtil.ttoc( AV12cSEG_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV12cSEG_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCseg_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCseg_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0170.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188z1_client"+"'", TempTags, "", 2, "HLP_Gx0170.htm");
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
            httpContext.writeValue( "Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
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
            Grid1Column.AddObjectProperty("Value", A75SEG_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A442SEG_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtSEG_Descripcion_Link));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0170.htm");
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

   public void start8Z2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List ALMACEN CATALOGO SEGMENTO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8Z0( ) ;
   }

   public void ws8Z2( )
   {
      start8Z2( ) ;
      evt8Z2( ) ;
   }

   public void evt8Z2( )
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
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cseg_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_CODIGO"), AV6cSEG_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseg_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_DESCRIPCION"), AV7cSEG_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctip_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTIP_CODIGO"), AV8cTIP_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseg_usuariocreacion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_USUARIOCREACION"), AV9cSEG_UsuarioCreacion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseg_fechacreacion Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCSEG_FECHACREACION"), 0), AV10cSEG_FechaCreacion) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseg_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_USUARIOMODIFICA"), AV11cSEG_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cseg_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCSEG_FECHAMODIFICA"), 0), AV12cSEG_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218Z2 ();
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

   public void we8Z2( )
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

   public void pa8Z2( )
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
                                  String AV6cSEG_Codigo ,
                                  String AV7cSEG_Descripcion ,
                                  String AV8cTIP_Codigo ,
                                  String AV9cSEG_UsuarioCreacion ,
                                  java.util.Date AV10cSEG_FechaCreacion ,
                                  String AV11cSEG_UsuarioModifica ,
                                  java.util.Date AV12cSEG_FechaModifica )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8Z2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A75SEG_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGO", A75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A442SEG_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_DESCRIPCION", A442SEG_Descripcion);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8Z2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8Z2( )
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
                                              AV7cSEG_Descripcion ,
                                              AV8cTIP_Codigo ,
                                              AV9cSEG_UsuarioCreacion ,
                                              AV10cSEG_FechaCreacion ,
                                              AV11cSEG_UsuarioModifica ,
                                              AV12cSEG_FechaModifica ,
                                              A442SEG_Descripcion ,
                                              A74TIP_Codigo ,
                                              A443SEG_UsuarioCreacion ,
                                              A444SEG_FechaCreacion ,
                                              A445SEG_UsuarioModifica ,
                                              A446SEG_FechaModifica ,
                                              A75SEG_Codigo ,
                                              AV6cSEG_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cSEG_Codigo = GXutil.concat( GXutil.rtrim( AV6cSEG_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cSEG_Codigo", AV6cSEG_Codigo);
         lV7cSEG_Descripcion = GXutil.concat( GXutil.rtrim( AV7cSEG_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cSEG_Descripcion", AV7cSEG_Descripcion);
         lV8cTIP_Codigo = GXutil.concat( GXutil.rtrim( AV8cTIP_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTIP_Codigo", AV8cTIP_Codigo);
         lV9cSEG_UsuarioCreacion = GXutil.concat( GXutil.rtrim( AV9cSEG_UsuarioCreacion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cSEG_UsuarioCreacion", AV9cSEG_UsuarioCreacion);
         lV11cSEG_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cSEG_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cSEG_UsuarioModifica", AV11cSEG_UsuarioModifica);
         /* Using cursor H008Z2 */
         pr_default.execute(0, new Object[] {lV6cSEG_Codigo, lV7cSEG_Descripcion, lV8cTIP_Codigo, lV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, lV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A446SEG_FechaModifica = H008Z2_A446SEG_FechaModifica[0] ;
            A445SEG_UsuarioModifica = H008Z2_A445SEG_UsuarioModifica[0] ;
            A444SEG_FechaCreacion = H008Z2_A444SEG_FechaCreacion[0] ;
            A443SEG_UsuarioCreacion = H008Z2_A443SEG_UsuarioCreacion[0] ;
            A74TIP_Codigo = H008Z2_A74TIP_Codigo[0] ;
            A442SEG_Descripcion = H008Z2_A442SEG_Descripcion[0] ;
            A75SEG_Codigo = H008Z2_A75SEG_Codigo[0] ;
            /* Execute user event: Load */
            e208Z2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8Z0( ) ;
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
                                           AV7cSEG_Descripcion ,
                                           AV8cTIP_Codigo ,
                                           AV9cSEG_UsuarioCreacion ,
                                           AV10cSEG_FechaCreacion ,
                                           AV11cSEG_UsuarioModifica ,
                                           AV12cSEG_FechaModifica ,
                                           A442SEG_Descripcion ,
                                           A74TIP_Codigo ,
                                           A443SEG_UsuarioCreacion ,
                                           A444SEG_FechaCreacion ,
                                           A445SEG_UsuarioModifica ,
                                           A446SEG_FechaModifica ,
                                           A75SEG_Codigo ,
                                           AV6cSEG_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cSEG_Codigo = GXutil.concat( GXutil.rtrim( AV6cSEG_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cSEG_Codigo", AV6cSEG_Codigo);
      lV7cSEG_Descripcion = GXutil.concat( GXutil.rtrim( AV7cSEG_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cSEG_Descripcion", AV7cSEG_Descripcion);
      lV8cTIP_Codigo = GXutil.concat( GXutil.rtrim( AV8cTIP_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cTIP_Codigo", AV8cTIP_Codigo);
      lV9cSEG_UsuarioCreacion = GXutil.concat( GXutil.rtrim( AV9cSEG_UsuarioCreacion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cSEG_UsuarioCreacion", AV9cSEG_UsuarioCreacion);
      lV11cSEG_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cSEG_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cSEG_UsuarioModifica", AV11cSEG_UsuarioModifica);
      /* Using cursor H008Z3 */
      pr_default.execute(1, new Object[] {lV6cSEG_Codigo, lV7cSEG_Descripcion, lV8cTIP_Codigo, lV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, lV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica});
      GRID1_nRecordCount = H008Z3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cSEG_Codigo, AV7cSEG_Descripcion, AV8cTIP_Codigo, AV9cSEG_UsuarioCreacion, AV10cSEG_FechaCreacion, AV11cSEG_UsuarioModifica, AV12cSEG_FechaModifica) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8Z0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cSEG_Codigo = httpContext.cgiGet( edtavCseg_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cSEG_Codigo", AV6cSEG_Codigo);
         AV7cSEG_Descripcion = httpContext.cgiGet( edtavCseg_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cSEG_Descripcion", AV7cSEG_Descripcion);
         AV8cTIP_Codigo = httpContext.cgiGet( edtavCtip_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTIP_Codigo", AV8cTIP_Codigo);
         AV9cSEG_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtavCseg_usuariocreacion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cSEG_UsuarioCreacion", AV9cSEG_UsuarioCreacion);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCseg_fechacreacion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCSEG_FECHACREACION");
            GX_FocusControl = edtavCseg_fechacreacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cSEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cSEG_FechaCreacion", localUtil.ttoc( AV10cSEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cSEG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtavCseg_fechacreacion_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cSEG_FechaCreacion", localUtil.ttoc( AV10cSEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         }
         AV11cSEG_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCseg_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cSEG_UsuarioModifica", AV11cSEG_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCseg_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCSEG_FECHAMODIFICA");
            GX_FocusControl = edtavCseg_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cSEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV12cSEG_FechaModifica", localUtil.ttoc( AV12cSEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV12cSEG_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCseg_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cSEG_FechaModifica", localUtil.ttoc( AV12cSEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_CODIGO"), AV6cSEG_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_DESCRIPCION"), AV7cSEG_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTIP_CODIGO"), AV8cTIP_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_USUARIOCREACION"), AV9cSEG_UsuarioCreacion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCSEG_FECHACREACION"), 0), AV10cSEG_FechaCreacion) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSEG_USUARIOMODIFICA"), AV11cSEG_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCSEG_FECHAMODIFICA"), 0), AV12cSEG_FechaModifica) ) )
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
      e198Z2 ();
      if (returnInSub) return;
   }

   public void e198Z2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selecci�n %1", "ALMACEN CATALOGO SEGMENTO", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208Z2( )
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
      e218Z2 ();
      if (returnInSub) return;
   }

   public void e218Z2( )
   {
      /* Enter Routine */
      AV13pSEG_Codigo = A75SEG_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pSEG_Codigo", AV13pSEG_Codigo);
      httpContext.setWebReturnParms(new Object[] {AV13pSEG_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pSEG_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pSEG_Codigo", AV13pSEG_Codigo);
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
      pa8Z2( ) ;
      ws8Z2( ) ;
      we8Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414245931");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx0170.js", "?201861414245931");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_84_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_84_fel_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8Z0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtSEG_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Link", edtSEG_Descripcion_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Descripcion_Internalname,A442SEG_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtSEG_Descripcion_Link,"","","",edtSEG_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A75SEG_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SEG_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblseg_codigofilter_Internalname = "LBLSEG_CODIGOFILTER" ;
      edtavCseg_codigo_Internalname = "vCSEG_CODIGO" ;
      divSeg_codigofiltercontainer_Internalname = "SEG_CODIGOFILTERCONTAINER" ;
      lblLblseg_descripcionfilter_Internalname = "LBLSEG_DESCRIPCIONFILTER" ;
      edtavCseg_descripcion_Internalname = "vCSEG_DESCRIPCION" ;
      divSeg_descripcionfiltercontainer_Internalname = "SEG_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltip_codigofilter_Internalname = "LBLTIP_CODIGOFILTER" ;
      edtavCtip_codigo_Internalname = "vCTIP_CODIGO" ;
      divTip_codigofiltercontainer_Internalname = "TIP_CODIGOFILTERCONTAINER" ;
      lblLblseg_usuariocreacionfilter_Internalname = "LBLSEG_USUARIOCREACIONFILTER" ;
      edtavCseg_usuariocreacion_Internalname = "vCSEG_USUARIOCREACION" ;
      divSeg_usuariocreacionfiltercontainer_Internalname = "SEG_USUARIOCREACIONFILTERCONTAINER" ;
      lblLblseg_fechacreacionfilter_Internalname = "LBLSEG_FECHACREACIONFILTER" ;
      edtavCseg_fechacreacion_Internalname = "vCSEG_FECHACREACION" ;
      divSeg_fechacreacionfiltercontainer_Internalname = "SEG_FECHACREACIONFILTERCONTAINER" ;
      lblLblseg_usuariomodificafilter_Internalname = "LBLSEG_USUARIOMODIFICAFILTER" ;
      edtavCseg_usuariomodifica_Internalname = "vCSEG_USUARIOMODIFICA" ;
      divSeg_usuariomodificafiltercontainer_Internalname = "SEG_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblseg_fechamodificafilter_Internalname = "LBLSEG_FECHAMODIFICAFILTER" ;
      edtavCseg_fechamodifica_Internalname = "vCSEG_FECHAMODIFICA" ;
      divSeg_fechamodificafiltercontainer_Internalname = "SEG_FECHAMODIFICAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
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
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtSEG_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCseg_fechamodifica_Jsonclick = "" ;
      edtavCseg_fechamodifica_Enabled = 1 ;
      edtavCseg_usuariomodifica_Jsonclick = "" ;
      edtavCseg_usuariomodifica_Enabled = 1 ;
      edtavCseg_usuariomodifica_Visible = 1 ;
      edtavCseg_fechacreacion_Jsonclick = "" ;
      edtavCseg_fechacreacion_Enabled = 1 ;
      edtavCseg_usuariocreacion_Jsonclick = "" ;
      edtavCseg_usuariocreacion_Enabled = 1 ;
      edtavCseg_usuariocreacion_Visible = 1 ;
      edtavCtip_codigo_Jsonclick = "" ;
      edtavCtip_codigo_Enabled = 1 ;
      edtavCtip_codigo_Visible = 1 ;
      edtavCseg_descripcion_Jsonclick = "" ;
      edtavCseg_descripcion_Enabled = 1 ;
      edtavCseg_descripcion_Visible = 1 ;
      edtavCseg_codigo_Jsonclick = "" ;
      edtavCseg_codigo_Enabled = 1 ;
      edtavCseg_codigo_Visible = 1 ;
      divSeg_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_fechacreacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_usuariocreacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTip_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List ALMACEN CATALOGO SEGMENTO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cSEG_Codigo',fld:'vCSEG_CODIGO',pic:'',nv:''},{av:'AV7cSEG_Descripcion',fld:'vCSEG_DESCRIPCION',pic:'',nv:''},{av:'AV8cTIP_Codigo',fld:'vCTIP_CODIGO',pic:'',nv:''},{av:'AV9cSEG_UsuarioCreacion',fld:'vCSEG_USUARIOCREACION',pic:'@!',nv:''},{av:'AV10cSEG_FechaCreacion',fld:'vCSEG_FECHACREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cSEG_UsuarioModifica',fld:'vCSEG_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cSEG_FechaModifica',fld:'vCSEG_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188Z1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLSEG_CODIGOFILTER.CLICK","{handler:'e118Z1',iparms:[{av:'divSeg_codigofiltercontainer_Class',ctrl:'SEG_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_codigofiltercontainer_Class',ctrl:'SEG_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCseg_codigo_Visible',ctrl:'vCSEG_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_DESCRIPCIONFILTER.CLICK","{handler:'e128Z1',iparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCseg_descripcion_Visible',ctrl:'vCSEG_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTIP_CODIGOFILTER.CLICK","{handler:'e138Z1',iparms:[{av:'divTip_codigofiltercontainer_Class',ctrl:'TIP_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTip_codigofiltercontainer_Class',ctrl:'TIP_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtip_codigo_Visible',ctrl:'vCTIP_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_USUARIOCREACIONFILTER.CLICK","{handler:'e148Z1',iparms:[{av:'divSeg_usuariocreacionfiltercontainer_Class',ctrl:'SEG_USUARIOCREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_usuariocreacionfiltercontainer_Class',ctrl:'SEG_USUARIOCREACIONFILTERCONTAINER',prop:'Class'},{av:'edtavCseg_usuariocreacion_Visible',ctrl:'vCSEG_USUARIOCREACION',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_FECHACREACIONFILTER.CLICK","{handler:'e158Z1',iparms:[{av:'divSeg_fechacreacionfiltercontainer_Class',ctrl:'SEG_FECHACREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_fechacreacionfiltercontainer_Class',ctrl:'SEG_FECHACREACIONFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLSEG_USUARIOMODIFICAFILTER.CLICK","{handler:'e168Z1',iparms:[{av:'divSeg_usuariomodificafiltercontainer_Class',ctrl:'SEG_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_usuariomodificafiltercontainer_Class',ctrl:'SEG_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCseg_usuariomodifica_Visible',ctrl:'vCSEG_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_FECHAMODIFICAFILTER.CLICK","{handler:'e178Z1',iparms:[{av:'divSeg_fechamodificafiltercontainer_Class',ctrl:'SEG_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_fechamodificafiltercontainer_Class',ctrl:'SEG_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e218Z2',iparms:[{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pSEG_Codigo',fld:'vPSEG_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cSEG_Codigo',fld:'vCSEG_CODIGO',pic:'',nv:''},{av:'AV7cSEG_Descripcion',fld:'vCSEG_DESCRIPCION',pic:'',nv:''},{av:'AV8cTIP_Codigo',fld:'vCTIP_CODIGO',pic:'',nv:''},{av:'AV9cSEG_UsuarioCreacion',fld:'vCSEG_USUARIOCREACION',pic:'@!',nv:''},{av:'AV10cSEG_FechaCreacion',fld:'vCSEG_FECHACREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cSEG_UsuarioModifica',fld:'vCSEG_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cSEG_FechaModifica',fld:'vCSEG_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cSEG_Codigo',fld:'vCSEG_CODIGO',pic:'',nv:''},{av:'AV7cSEG_Descripcion',fld:'vCSEG_DESCRIPCION',pic:'',nv:''},{av:'AV8cTIP_Codigo',fld:'vCTIP_CODIGO',pic:'',nv:''},{av:'AV9cSEG_UsuarioCreacion',fld:'vCSEG_USUARIOCREACION',pic:'@!',nv:''},{av:'AV10cSEG_FechaCreacion',fld:'vCSEG_FECHACREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cSEG_UsuarioModifica',fld:'vCSEG_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cSEG_FechaModifica',fld:'vCSEG_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cSEG_Codigo',fld:'vCSEG_CODIGO',pic:'',nv:''},{av:'AV7cSEG_Descripcion',fld:'vCSEG_DESCRIPCION',pic:'',nv:''},{av:'AV8cTIP_Codigo',fld:'vCTIP_CODIGO',pic:'',nv:''},{av:'AV9cSEG_UsuarioCreacion',fld:'vCSEG_USUARIOCREACION',pic:'@!',nv:''},{av:'AV10cSEG_FechaCreacion',fld:'vCSEG_FECHACREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cSEG_UsuarioModifica',fld:'vCSEG_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cSEG_FechaModifica',fld:'vCSEG_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cSEG_Codigo',fld:'vCSEG_CODIGO',pic:'',nv:''},{av:'AV7cSEG_Descripcion',fld:'vCSEG_DESCRIPCION',pic:'',nv:''},{av:'AV8cTIP_Codigo',fld:'vCTIP_CODIGO',pic:'',nv:''},{av:'AV9cSEG_UsuarioCreacion',fld:'vCSEG_USUARIOCREACION',pic:'@!',nv:''},{av:'AV10cSEG_FechaCreacion',fld:'vCSEG_FECHACREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cSEG_UsuarioModifica',fld:'vCSEG_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cSEG_FechaModifica',fld:'vCSEG_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV6cSEG_Codigo = "" ;
      AV7cSEG_Descripcion = "" ;
      AV8cTIP_Codigo = "" ;
      AV9cSEG_UsuarioCreacion = "" ;
      AV10cSEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      AV11cSEG_UsuarioModifica = "" ;
      AV12cSEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      AV13pSEG_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblseg_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblseg_descripcionfilter_Jsonclick = "" ;
      lblLbltip_codigofilter_Jsonclick = "" ;
      lblLblseg_usuariocreacionfilter_Jsonclick = "" ;
      lblLblseg_fechacreacionfilter_Jsonclick = "" ;
      lblLblseg_usuariomodificafilter_Jsonclick = "" ;
      lblLblseg_fechamodificafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A75SEG_Codigo = "" ;
      A442SEG_Descripcion = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV6cSEG_Codigo = "" ;
      lV7cSEG_Descripcion = "" ;
      lV8cTIP_Codigo = "" ;
      lV9cSEG_UsuarioCreacion = "" ;
      lV11cSEG_UsuarioModifica = "" ;
      A74TIP_Codigo = "" ;
      A443SEG_UsuarioCreacion = "" ;
      A444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A445SEG_UsuarioModifica = "" ;
      A446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      H008Z2_A446SEG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H008Z2_A445SEG_UsuarioModifica = new String[] {""} ;
      H008Z2_A444SEG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H008Z2_A443SEG_UsuarioCreacion = new String[] {""} ;
      H008Z2_A74TIP_Codigo = new String[] {""} ;
      H008Z2_A442SEG_Descripcion = new String[] {""} ;
      H008Z2_A75SEG_Codigo = new String[] {""} ;
      H008Z3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx0170__default(),
         new Object[] {
             new Object[] {
            H008Z2_A446SEG_FechaModifica, H008Z2_A445SEG_UsuarioModifica, H008Z2_A444SEG_FechaCreacion, H008Z2_A443SEG_UsuarioCreacion, H008Z2_A74TIP_Codigo, H008Z2_A442SEG_Descripcion, H008Z2_A75SEG_Codigo
            }
            , new Object[] {
            H008Z3_AGRID1_nRecordCount
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
   private int edtavCseg_codigo_Visible ;
   private int edtavCseg_codigo_Enabled ;
   private int edtavCseg_descripcion_Visible ;
   private int edtavCseg_descripcion_Enabled ;
   private int edtavCtip_codigo_Visible ;
   private int edtavCtip_codigo_Enabled ;
   private int edtavCseg_usuariocreacion_Visible ;
   private int edtavCseg_usuariocreacion_Enabled ;
   private int edtavCseg_fechacreacion_Enabled ;
   private int edtavCseg_usuariomodifica_Visible ;
   private int edtavCseg_usuariomodifica_Enabled ;
   private int edtavCseg_fechamodifica_Enabled ;
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
   private String divSeg_codigofiltercontainer_Class ;
   private String divSeg_descripcionfiltercontainer_Class ;
   private String divTip_codigofiltercontainer_Class ;
   private String divSeg_usuariocreacionfiltercontainer_Class ;
   private String divSeg_fechacreacionfiltercontainer_Class ;
   private String divSeg_usuariomodificafiltercontainer_Class ;
   private String divSeg_fechamodificafiltercontainer_Class ;
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
   private String divSeg_codigofiltercontainer_Internalname ;
   private String lblLblseg_codigofilter_Internalname ;
   private String lblLblseg_codigofilter_Jsonclick ;
   private String edtavCseg_codigo_Internalname ;
   private String TempTags ;
   private String edtavCseg_codigo_Jsonclick ;
   private String divSeg_descripcionfiltercontainer_Internalname ;
   private String lblLblseg_descripcionfilter_Internalname ;
   private String lblLblseg_descripcionfilter_Jsonclick ;
   private String edtavCseg_descripcion_Internalname ;
   private String edtavCseg_descripcion_Jsonclick ;
   private String divTip_codigofiltercontainer_Internalname ;
   private String lblLbltip_codigofilter_Internalname ;
   private String lblLbltip_codigofilter_Jsonclick ;
   private String edtavCtip_codigo_Internalname ;
   private String edtavCtip_codigo_Jsonclick ;
   private String divSeg_usuariocreacionfiltercontainer_Internalname ;
   private String lblLblseg_usuariocreacionfilter_Internalname ;
   private String lblLblseg_usuariocreacionfilter_Jsonclick ;
   private String edtavCseg_usuariocreacion_Internalname ;
   private String edtavCseg_usuariocreacion_Jsonclick ;
   private String divSeg_fechacreacionfiltercontainer_Internalname ;
   private String lblLblseg_fechacreacionfilter_Internalname ;
   private String lblLblseg_fechacreacionfilter_Jsonclick ;
   private String edtavCseg_fechacreacion_Internalname ;
   private String edtavCseg_fechacreacion_Jsonclick ;
   private String divSeg_usuariomodificafiltercontainer_Internalname ;
   private String lblLblseg_usuariomodificafilter_Internalname ;
   private String lblLblseg_usuariomodificafilter_Jsonclick ;
   private String edtavCseg_usuariomodifica_Internalname ;
   private String edtavCseg_usuariomodifica_Jsonclick ;
   private String divSeg_fechamodificafiltercontainer_Internalname ;
   private String lblLblseg_fechamodificafilter_Internalname ;
   private String lblLblseg_fechamodificafilter_Jsonclick ;
   private String edtavCseg_fechamodifica_Internalname ;
   private String edtavCseg_fechamodifica_Jsonclick ;
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
   private String edtSEG_Descripcion_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Descripcion_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Jsonclick ;
   private java.util.Date AV10cSEG_FechaCreacion ;
   private java.util.Date AV12cSEG_FechaModifica ;
   private java.util.Date A444SEG_FechaCreacion ;
   private java.util.Date A446SEG_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cSEG_Codigo ;
   private String AV7cSEG_Descripcion ;
   private String AV8cTIP_Codigo ;
   private String AV9cSEG_UsuarioCreacion ;
   private String AV11cSEG_UsuarioModifica ;
   private String AV13pSEG_Codigo ;
   private String A75SEG_Codigo ;
   private String A442SEG_Descripcion ;
   private String AV17Linkselection_GXI ;
   private String lV6cSEG_Codigo ;
   private String lV7cSEG_Descripcion ;
   private String lV8cTIP_Codigo ;
   private String lV9cSEG_UsuarioCreacion ;
   private String lV11cSEG_UsuarioModifica ;
   private String A74TIP_Codigo ;
   private String A443SEG_UsuarioCreacion ;
   private String A445SEG_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H008Z2_A446SEG_FechaModifica ;
   private String[] H008Z2_A445SEG_UsuarioModifica ;
   private java.util.Date[] H008Z2_A444SEG_FechaCreacion ;
   private String[] H008Z2_A443SEG_UsuarioCreacion ;
   private String[] H008Z2_A74TIP_Codigo ;
   private String[] H008Z2_A442SEG_Descripcion ;
   private String[] H008Z2_A75SEG_Codigo ;
   private long[] H008Z3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0170__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cSEG_Descripcion ,
                                          String AV8cTIP_Codigo ,
                                          String AV9cSEG_UsuarioCreacion ,
                                          java.util.Date AV10cSEG_FechaCreacion ,
                                          String AV11cSEG_UsuarioModifica ,
                                          java.util.Date AV12cSEG_FechaModifica ,
                                          String A442SEG_Descripcion ,
                                          String A74TIP_Codigo ,
                                          String A443SEG_UsuarioCreacion ,
                                          java.util.Date A444SEG_FechaCreacion ,
                                          String A445SEG_UsuarioModifica ,
                                          java.util.Date A446SEG_FechaModifica ,
                                          String A75SEG_Codigo ,
                                          String AV6cSEG_Codigo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ SEG_FechaModifica, SEG_UsuarioModifica, SEG_FechaCreacion," ;
      sSelectString = sSelectString + " SEG_UsuarioCreacion, TIP_Codigo, SEG_Descripcion, SEG_Codigo" ;
      sFromString = " FROM ALM_CAT_SEG" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (SEG_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cSEG_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (SEG_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTIP_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (TIP_Codigo like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cSEG_UsuarioCreacion)==0) )
      {
         sWhereString = sWhereString + " and (SEG_UsuarioCreacion like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cSEG_FechaCreacion) )
      {
         sWhereString = sWhereString + " and (SEG_FechaCreacion >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cSEG_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (SEG_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cSEG_FechaModifica) )
      {
         sWhereString = sWhereString + " and (SEG_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY SEG_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cSEG_Descripcion ,
                                          String AV8cTIP_Codigo ,
                                          String AV9cSEG_UsuarioCreacion ,
                                          java.util.Date AV10cSEG_FechaCreacion ,
                                          String AV11cSEG_UsuarioModifica ,
                                          java.util.Date AV12cSEG_FechaModifica ,
                                          String A442SEG_Descripcion ,
                                          String A74TIP_Codigo ,
                                          String A443SEG_UsuarioCreacion ,
                                          java.util.Date A444SEG_FechaCreacion ,
                                          String A445SEG_UsuarioModifica ,
                                          java.util.Date A446SEG_FechaModifica ,
                                          String A75SEG_Codigo ,
                                          String AV6cSEG_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_CAT_SEG" ;
      scmdbuf = scmdbuf + " WHERE (SEG_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cSEG_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (SEG_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTIP_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (TIP_Codigo like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cSEG_UsuarioCreacion)==0) )
      {
         sWhereString = sWhereString + " and (SEG_UsuarioCreacion like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cSEG_FechaCreacion) )
      {
         sWhereString = sWhereString + " and (SEG_FechaCreacion >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cSEG_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (SEG_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cSEG_FechaModifica) )
      {
         sWhereString = sWhereString + " and (SEG_FechaModifica >= ?)" ;
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
                  return conditional_H008Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H008Z3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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
                  stmt.setVarchar(sIdx, (String)parms[12], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

