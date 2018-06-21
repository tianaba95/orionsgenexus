/*
               File: gx00l0_impl
        Description: Selection List PAIS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:37.93
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

public final  class gx00l0_impl extends GXDataArea
{
   public gx00l0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00l0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00l0_impl.class ));
   }

   public gx00l0_impl( int remoteHandle ,
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
            nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_74_idx = httpContext.GetNextPar( ) ;
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
            AV6cPais_Codigo = httpContext.GetNextPar( ) ;
            AV7cPais_Descripcion = httpContext.GetNextPar( ) ;
            AV8cPais_UsuarioCrea = httpContext.GetNextPar( ) ;
            AV9cPais_FechaCrea = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV10cPais_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV11cPais_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
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
            AV12pPais_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12pPais_Codigo", AV12pPais_Codigo);
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
      pa8N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8N2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414243798");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00l0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV12pPais_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_CODIGO", AV6cPais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_DESCRIPCION", AV7cPais_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_USUARIOCREA", AV8cPais_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_FECHACREA", localUtil.ttoc( AV9cPais_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_USUARIOMODIFICA", AV10cPais_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPAIS_FECHAMODIFICA", localUtil.ttoc( AV11cPais_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPPAIS_CODIGO", AV12pPais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divPais_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divPais_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_USUARIOCREAFILTERCONTAINER_Class", GXutil.rtrim( divPais_usuariocreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_FECHACREAFILTERCONTAINER_Class", GXutil.rtrim( divPais_fechacreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divPais_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divPais_fechamodificafiltercontainer_Class));
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
         we8N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8N2( ) ;
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
      return formatLink("com.orions2.gx00l0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV12pPais_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "Gx00L0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List PAIS" ;
   }

   public void wb8N0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_codigofilter_Internalname, "Código del País", "", "", lblLblpais_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_codigo_Internalname, "Código del País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_codigo_Internalname, AV6cPais_Codigo, GXutil.rtrim( localUtil.format( AV6cPais_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCpais_codigo_Visible, edtavCpais_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00L0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_descripcionfilter_Internalname, "Descripción del País", "", "", lblLblpais_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_descripcion_Internalname, "Descripción del País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_descripcion_Internalname, AV7cPais_Descripcion, GXutil.rtrim( localUtil.format( AV7cPais_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCpais_descripcion_Visible, edtavCpais_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00L0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_usuariocreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_usuariocreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_usuariocreafilter_Internalname, "Usuario Creación País", "", "", lblLblpais_usuariocreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_usuariocrea_Internalname, "Usuario Creación País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_usuariocrea_Internalname, AV8cPais_UsuarioCrea, GXutil.rtrim( localUtil.format( AV8cPais_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_usuariocrea_Jsonclick, 0, "Attribute", "", "", "", edtavCpais_usuariocrea_Visible, edtavCpais_usuariocrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00L0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_fechacreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_fechacreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_fechacreafilter_Internalname, "Fecha Creación País", "", "", lblLblpais_fechacreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148n1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_fechacrea_Internalname, "Fecha Creación País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCpais_fechacrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_fechacrea_Internalname, localUtil.ttoc( AV9cPais_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV9cPais_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_fechacrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCpais_fechacrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00L0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_usuariomodificafilter_Internalname, "Usuario Modifica País", "", "", lblLblpais_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_usuariomodifica_Internalname, "Usuario Modifica País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_usuariomodifica_Internalname, AV10cPais_UsuarioModifica, GXutil.rtrim( localUtil.format( AV10cPais_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCpais_usuariomodifica_Visible, edtavCpais_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00L0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPais_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divPais_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblpais_fechamodificafilter_Internalname, "Fecha Modifica País", "", "", lblLblpais_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168n1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00L0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCpais_fechamodifica_Internalname, "Fecha Modifica País", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCpais_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCpais_fechamodifica_Internalname, localUtil.ttoc( AV11cPais_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV11cPais_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpais_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCpais_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00L0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e178n1_client"+"'", TempTags, "", 2, "HLP_Gx00L0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
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
            httpContext.writeValue( "Código del País") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del País") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación País") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación País") ;
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
            Grid1Column.AddObjectProperty("Value", A9Pais_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A11Pais_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtPais_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A136Pais_UsuarioCrea);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A137Pais_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (short)(nGXsfl_74_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00L0.htm");
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

   public void start8N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List PAIS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8N0( ) ;
   }

   public void ws8N2( )
   {
      start8N2( ) ;
      evt8N2( ) ;
   }

   public void evt8N2( )
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
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
                           A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
                           A136Pais_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtPais_UsuarioCrea_Internalname)) ;
                           A137Pais_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtPais_FechaCrea_Internalname), 0) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e188N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e198N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cpais_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_CODIGO"), AV6cPais_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpais_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_DESCRIPCION"), AV7cPais_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpais_usuariocrea Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_USUARIOCREA"), AV8cPais_UsuarioCrea) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpais_fechacrea Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCPAIS_FECHACREA"), 0), AV9cPais_FechaCrea) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpais_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_USUARIOMODIFICA"), AV10cPais_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpais_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCPAIS_FECHAMODIFICA"), 0), AV11cPais_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e208N2 ();
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

   public void we8N2( )
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

   public void pa8N2( )
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cPais_Codigo ,
                                  String AV7cPais_Descripcion ,
                                  String AV8cPais_UsuarioCrea ,
                                  java.util.Date AV9cPais_FechaCrea ,
                                  String AV10cPais_UsuarioModifica ,
                                  java.util.Date AV11cPais_FechaModifica )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8N2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A9Pais_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_CODIGO", A9Pais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_DESCRIPCION", A11Pais_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A136Pais_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_USUARIOCREA", A136Pais_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_FECHACREA", getSecureSignedToken( "", localUtil.format( A137Pais_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PAIS_FECHACREA", localUtil.ttoc( A137Pais_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8N2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8N2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = (short)(1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
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
         subsflControlProps_742( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cPais_Descripcion ,
                                              AV8cPais_UsuarioCrea ,
                                              AV9cPais_FechaCrea ,
                                              AV10cPais_UsuarioModifica ,
                                              AV11cPais_FechaModifica ,
                                              A11Pais_Descripcion ,
                                              A136Pais_UsuarioCrea ,
                                              A137Pais_FechaCrea ,
                                              A138Pais_UsuarioModifica ,
                                              A139Pais_FechaModifica ,
                                              A9Pais_Codigo ,
                                              AV6cPais_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cPais_Codigo = GXutil.concat( GXutil.rtrim( AV6cPais_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cPais_Codigo", AV6cPais_Codigo);
         lV7cPais_Descripcion = GXutil.concat( GXutil.rtrim( AV7cPais_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cPais_Descripcion", AV7cPais_Descripcion);
         lV8cPais_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cPais_UsuarioCrea), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cPais_UsuarioCrea", AV8cPais_UsuarioCrea);
         lV10cPais_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV10cPais_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cPais_UsuarioModifica", AV10cPais_UsuarioModifica);
         /* Using cursor H008N2 */
         pr_default.execute(0, new Object[] {lV6cPais_Codigo, lV7cPais_Descripcion, lV8cPais_UsuarioCrea, AV9cPais_FechaCrea, lV10cPais_UsuarioModifica, AV11cPais_FechaModifica, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_74_idx = (short)(1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A139Pais_FechaModifica = H008N2_A139Pais_FechaModifica[0] ;
            A138Pais_UsuarioModifica = H008N2_A138Pais_UsuarioModifica[0] ;
            A137Pais_FechaCrea = H008N2_A137Pais_FechaCrea[0] ;
            A136Pais_UsuarioCrea = H008N2_A136Pais_UsuarioCrea[0] ;
            A11Pais_Descripcion = H008N2_A11Pais_Descripcion[0] ;
            A9Pais_Codigo = H008N2_A9Pais_Codigo[0] ;
            /* Execute user event: Load */
            e198N2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb8N0( ) ;
      }
      bGXsfl_74_Refreshing = true ;
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
                                           AV7cPais_Descripcion ,
                                           AV8cPais_UsuarioCrea ,
                                           AV9cPais_FechaCrea ,
                                           AV10cPais_UsuarioModifica ,
                                           AV11cPais_FechaModifica ,
                                           A11Pais_Descripcion ,
                                           A136Pais_UsuarioCrea ,
                                           A137Pais_FechaCrea ,
                                           A138Pais_UsuarioModifica ,
                                           A139Pais_FechaModifica ,
                                           A9Pais_Codigo ,
                                           AV6cPais_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cPais_Codigo = GXutil.concat( GXutil.rtrim( AV6cPais_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cPais_Codigo", AV6cPais_Codigo);
      lV7cPais_Descripcion = GXutil.concat( GXutil.rtrim( AV7cPais_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cPais_Descripcion", AV7cPais_Descripcion);
      lV8cPais_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV8cPais_UsuarioCrea), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cPais_UsuarioCrea", AV8cPais_UsuarioCrea);
      lV10cPais_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV10cPais_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cPais_UsuarioModifica", AV10cPais_UsuarioModifica);
      /* Using cursor H008N3 */
      pr_default.execute(1, new Object[] {lV6cPais_Codigo, lV7cPais_Descripcion, lV8cPais_UsuarioCrea, AV9cPais_FechaCrea, lV10cPais_UsuarioModifica, AV11cPais_FechaModifica});
      GRID1_nRecordCount = H008N3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cPais_Codigo, AV7cPais_Descripcion, AV8cPais_UsuarioCrea, AV9cPais_FechaCrea, AV10cPais_UsuarioModifica, AV11cPais_FechaModifica) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8N0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e188N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cPais_Codigo = httpContext.cgiGet( edtavCpais_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cPais_Codigo", AV6cPais_Codigo);
         AV7cPais_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCpais_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cPais_Descripcion", AV7cPais_Descripcion);
         AV8cPais_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtavCpais_usuariocrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cPais_UsuarioCrea", AV8cPais_UsuarioCrea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCpais_fechacrea_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCPAIS_FECHACREA");
            GX_FocusControl = edtavCpais_fechacrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cPais_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9cPais_FechaCrea", localUtil.ttoc( AV9cPais_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV9cPais_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtavCpais_fechacrea_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cPais_FechaCrea", localUtil.ttoc( AV9cPais_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         AV10cPais_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCpais_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cPais_UsuarioModifica", AV10cPais_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCpais_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCPAIS_FECHAMODIFICA");
            GX_FocusControl = edtavCpais_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cPais_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV11cPais_FechaModifica", localUtil.ttoc( AV11cPais_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV11cPais_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCpais_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cPais_FechaModifica", localUtil.ttoc( AV11cPais_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_CODIGO"), AV6cPais_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_DESCRIPCION"), AV7cPais_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_USUARIOCREA"), AV8cPais_UsuarioCrea) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCPAIS_FECHACREA"), 0), AV9cPais_FechaCrea) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPAIS_USUARIOMODIFICA"), AV10cPais_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCPAIS_FECHAMODIFICA"), 0), AV11cPais_FechaModifica) ) )
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
      e188N2 ();
      if (returnInSub) return;
   }

   public void e188N2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "PAIS", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV13ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e198N2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV16Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_742( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
      {
         httpContext.doAjaxLoad(74, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e208N2 ();
      if (returnInSub) return;
   }

   public void e208N2( )
   {
      /* Enter Routine */
      AV12pPais_Codigo = A9Pais_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pPais_Codigo", AV12pPais_Codigo);
      httpContext.setWebReturnParms(new Object[] {AV12pPais_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV12pPais_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pPais_Codigo", AV12pPais_Codigo);
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
      pa8N2( ) ;
      ws8N2( ) ;
      we8N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141424396");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00l0.js", "?20186141424396");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO_"+sGXsfl_74_idx ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION_"+sGXsfl_74_idx ;
      edtPais_UsuarioCrea_Internalname = "PAIS_USUARIOCREA_"+sGXsfl_74_idx ;
      edtPais_FechaCrea_Internalname = "PAIS_FECHACREA_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO_"+sGXsfl_74_fel_idx ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION_"+sGXsfl_74_fel_idx ;
      edtPais_UsuarioCrea_Internalname = "PAIS_USUARIOCREA_"+sGXsfl_74_fel_idx ;
      edtPais_FechaCrea_Internalname = "PAIS_FECHACREA_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb8N0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A9Pais_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_74_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV16Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_Codigo_Internalname,A9Pais_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPais_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtPais_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A9Pais_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtPais_Descripcion_Internalname, "Link", edtPais_Descripcion_Link, !bGXsfl_74_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_Descripcion_Internalname,A11Pais_Descripcion,GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtPais_Descripcion_Link,"","","",edtPais_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_UsuarioCrea_Internalname,A136Pais_UsuarioCrea,GXutil.rtrim( localUtil.format( A136Pais_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPais_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_FechaCrea_Internalname,localUtil.ttoc( A137Pais_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A137Pais_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPais_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_CODIGO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A9Pais_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_DESCRIPCION"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_USUARIOCREA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A136Pais_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PAIS_FECHACREA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( A137Pais_FechaCrea, "99/99/99 99:99")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblLblpais_codigofilter_Internalname = "LBLPAIS_CODIGOFILTER" ;
      edtavCpais_codigo_Internalname = "vCPAIS_CODIGO" ;
      divPais_codigofiltercontainer_Internalname = "PAIS_CODIGOFILTERCONTAINER" ;
      lblLblpais_descripcionfilter_Internalname = "LBLPAIS_DESCRIPCIONFILTER" ;
      edtavCpais_descripcion_Internalname = "vCPAIS_DESCRIPCION" ;
      divPais_descripcionfiltercontainer_Internalname = "PAIS_DESCRIPCIONFILTERCONTAINER" ;
      lblLblpais_usuariocreafilter_Internalname = "LBLPAIS_USUARIOCREAFILTER" ;
      edtavCpais_usuariocrea_Internalname = "vCPAIS_USUARIOCREA" ;
      divPais_usuariocreafiltercontainer_Internalname = "PAIS_USUARIOCREAFILTERCONTAINER" ;
      lblLblpais_fechacreafilter_Internalname = "LBLPAIS_FECHACREAFILTER" ;
      edtavCpais_fechacrea_Internalname = "vCPAIS_FECHACREA" ;
      divPais_fechacreafiltercontainer_Internalname = "PAIS_FECHACREAFILTERCONTAINER" ;
      lblLblpais_usuariomodificafilter_Internalname = "LBLPAIS_USUARIOMODIFICAFILTER" ;
      edtavCpais_usuariomodifica_Internalname = "vCPAIS_USUARIOMODIFICA" ;
      divPais_usuariomodificafiltercontainer_Internalname = "PAIS_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblpais_fechamodificafilter_Internalname = "LBLPAIS_FECHAMODIFICAFILTER" ;
      edtavCpais_fechamodifica_Internalname = "vCPAIS_FECHAMODIFICA" ;
      divPais_fechamodificafiltercontainer_Internalname = "PAIS_FECHAMODIFICAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION" ;
      edtPais_UsuarioCrea_Internalname = "PAIS_USUARIOCREA" ;
      edtPais_FechaCrea_Internalname = "PAIS_FECHACREA" ;
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
      edtPais_FechaCrea_Jsonclick = "" ;
      edtPais_UsuarioCrea_Jsonclick = "" ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtPais_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCpais_fechamodifica_Jsonclick = "" ;
      edtavCpais_fechamodifica_Enabled = 1 ;
      edtavCpais_usuariomodifica_Jsonclick = "" ;
      edtavCpais_usuariomodifica_Enabled = 1 ;
      edtavCpais_usuariomodifica_Visible = 1 ;
      edtavCpais_fechacrea_Jsonclick = "" ;
      edtavCpais_fechacrea_Enabled = 1 ;
      edtavCpais_usuariocrea_Jsonclick = "" ;
      edtavCpais_usuariocrea_Enabled = 1 ;
      edtavCpais_usuariocrea_Visible = 1 ;
      edtavCpais_descripcion_Jsonclick = "" ;
      edtavCpais_descripcion_Enabled = 1 ;
      edtavCpais_descripcion_Visible = 1 ;
      edtavCpais_codigo_Jsonclick = "" ;
      edtavCpais_codigo_Enabled = 1 ;
      edtavCpais_codigo_Visible = 1 ;
      divPais_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divPais_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divPais_fechacreafiltercontainer_Class = "AdvancedContainerItem" ;
      divPais_usuariocreafiltercontainer_Class = "AdvancedContainerItem" ;
      divPais_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divPais_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List PAIS" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cPais_Codigo',fld:'vCPAIS_CODIGO',pic:'',nv:''},{av:'AV7cPais_Descripcion',fld:'vCPAIS_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cPais_UsuarioCrea',fld:'vCPAIS_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cPais_FechaCrea',fld:'vCPAIS_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cPais_UsuarioModifica',fld:'vCPAIS_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cPais_FechaModifica',fld:'vCPAIS_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e178N1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLPAIS_CODIGOFILTER.CLICK","{handler:'e118N1',iparms:[{av:'divPais_codigofiltercontainer_Class',ctrl:'PAIS_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_codigofiltercontainer_Class',ctrl:'PAIS_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCpais_codigo_Visible',ctrl:'vCPAIS_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLPAIS_DESCRIPCIONFILTER.CLICK","{handler:'e128N1',iparms:[{av:'divPais_descripcionfiltercontainer_Class',ctrl:'PAIS_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_descripcionfiltercontainer_Class',ctrl:'PAIS_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCpais_descripcion_Visible',ctrl:'vCPAIS_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLPAIS_USUARIOCREAFILTER.CLICK","{handler:'e138N1',iparms:[{av:'divPais_usuariocreafiltercontainer_Class',ctrl:'PAIS_USUARIOCREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_usuariocreafiltercontainer_Class',ctrl:'PAIS_USUARIOCREAFILTERCONTAINER',prop:'Class'},{av:'edtavCpais_usuariocrea_Visible',ctrl:'vCPAIS_USUARIOCREA',prop:'Visible'}]}");
      setEventMetadata("LBLPAIS_FECHACREAFILTER.CLICK","{handler:'e148N1',iparms:[{av:'divPais_fechacreafiltercontainer_Class',ctrl:'PAIS_FECHACREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_fechacreafiltercontainer_Class',ctrl:'PAIS_FECHACREAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLPAIS_USUARIOMODIFICAFILTER.CLICK","{handler:'e158N1',iparms:[{av:'divPais_usuariomodificafiltercontainer_Class',ctrl:'PAIS_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_usuariomodificafiltercontainer_Class',ctrl:'PAIS_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCpais_usuariomodifica_Visible',ctrl:'vCPAIS_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLPAIS_FECHAMODIFICAFILTER.CLICK","{handler:'e168N1',iparms:[{av:'divPais_fechamodificafiltercontainer_Class',ctrl:'PAIS_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPais_fechamodificafiltercontainer_Class',ctrl:'PAIS_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e208N2',iparms:[{av:'A9Pais_Codigo',fld:'PAIS_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV12pPais_Codigo',fld:'vPPAIS_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cPais_Codigo',fld:'vCPAIS_CODIGO',pic:'',nv:''},{av:'AV7cPais_Descripcion',fld:'vCPAIS_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cPais_UsuarioCrea',fld:'vCPAIS_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cPais_FechaCrea',fld:'vCPAIS_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cPais_UsuarioModifica',fld:'vCPAIS_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cPais_FechaModifica',fld:'vCPAIS_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cPais_Codigo',fld:'vCPAIS_CODIGO',pic:'',nv:''},{av:'AV7cPais_Descripcion',fld:'vCPAIS_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cPais_UsuarioCrea',fld:'vCPAIS_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cPais_FechaCrea',fld:'vCPAIS_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cPais_UsuarioModifica',fld:'vCPAIS_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cPais_FechaModifica',fld:'vCPAIS_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cPais_Codigo',fld:'vCPAIS_CODIGO',pic:'',nv:''},{av:'AV7cPais_Descripcion',fld:'vCPAIS_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cPais_UsuarioCrea',fld:'vCPAIS_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cPais_FechaCrea',fld:'vCPAIS_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cPais_UsuarioModifica',fld:'vCPAIS_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cPais_FechaModifica',fld:'vCPAIS_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cPais_Codigo',fld:'vCPAIS_CODIGO',pic:'',nv:''},{av:'AV7cPais_Descripcion',fld:'vCPAIS_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cPais_UsuarioCrea',fld:'vCPAIS_USUARIOCREA',pic:'@!',nv:''},{av:'AV9cPais_FechaCrea',fld:'vCPAIS_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV10cPais_UsuarioModifica',fld:'vCPAIS_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV11cPais_FechaModifica',fld:'vCPAIS_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV6cPais_Codigo = "" ;
      AV7cPais_Descripcion = "" ;
      AV8cPais_UsuarioCrea = "" ;
      AV9cPais_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV10cPais_UsuarioModifica = "" ;
      AV11cPais_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      AV12pPais_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblpais_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblpais_descripcionfilter_Jsonclick = "" ;
      lblLblpais_usuariocreafilter_Jsonclick = "" ;
      lblLblpais_fechacreafilter_Jsonclick = "" ;
      lblLblpais_usuariomodificafilter_Jsonclick = "" ;
      lblLblpais_fechamodificafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      A136Pais_UsuarioCrea = "" ;
      A137Pais_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV6cPais_Codigo = "" ;
      lV7cPais_Descripcion = "" ;
      lV8cPais_UsuarioCrea = "" ;
      lV10cPais_UsuarioModifica = "" ;
      A138Pais_UsuarioModifica = "" ;
      A139Pais_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      H008N2_A139Pais_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H008N2_A138Pais_UsuarioModifica = new String[] {""} ;
      H008N2_A137Pais_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H008N2_A136Pais_UsuarioCrea = new String[] {""} ;
      H008N2_A11Pais_Descripcion = new String[] {""} ;
      H008N2_A9Pais_Codigo = new String[] {""} ;
      H008N3_AGRID1_nRecordCount = new long[1] ;
      AV13ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00l0__default(),
         new Object[] {
             new Object[] {
            H008N2_A139Pais_FechaModifica, H008N2_A138Pais_UsuarioModifica, H008N2_A137Pais_FechaCrea, H008N2_A136Pais_UsuarioCrea, H008N2_A11Pais_Descripcion, H008N2_A9Pais_Codigo
            }
            , new Object[] {
            H008N3_AGRID1_nRecordCount
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
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCpais_codigo_Visible ;
   private int edtavCpais_codigo_Enabled ;
   private int edtavCpais_descripcion_Visible ;
   private int edtavCpais_descripcion_Enabled ;
   private int edtavCpais_usuariocrea_Visible ;
   private int edtavCpais_usuariocrea_Enabled ;
   private int edtavCpais_fechacrea_Enabled ;
   private int edtavCpais_usuariomodifica_Visible ;
   private int edtavCpais_usuariomodifica_Enabled ;
   private int edtavCpais_fechamodifica_Enabled ;
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
   private String divPais_codigofiltercontainer_Class ;
   private String divPais_descripcionfiltercontainer_Class ;
   private String divPais_usuariocreafiltercontainer_Class ;
   private String divPais_fechacreafiltercontainer_Class ;
   private String divPais_usuariomodificafiltercontainer_Class ;
   private String divPais_fechamodificafiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divPais_codigofiltercontainer_Internalname ;
   private String lblLblpais_codigofilter_Internalname ;
   private String lblLblpais_codigofilter_Jsonclick ;
   private String edtavCpais_codigo_Internalname ;
   private String TempTags ;
   private String edtavCpais_codigo_Jsonclick ;
   private String divPais_descripcionfiltercontainer_Internalname ;
   private String lblLblpais_descripcionfilter_Internalname ;
   private String lblLblpais_descripcionfilter_Jsonclick ;
   private String edtavCpais_descripcion_Internalname ;
   private String edtavCpais_descripcion_Jsonclick ;
   private String divPais_usuariocreafiltercontainer_Internalname ;
   private String lblLblpais_usuariocreafilter_Internalname ;
   private String lblLblpais_usuariocreafilter_Jsonclick ;
   private String edtavCpais_usuariocrea_Internalname ;
   private String edtavCpais_usuariocrea_Jsonclick ;
   private String divPais_fechacreafiltercontainer_Internalname ;
   private String lblLblpais_fechacreafilter_Internalname ;
   private String lblLblpais_fechacreafilter_Jsonclick ;
   private String edtavCpais_fechacrea_Internalname ;
   private String edtavCpais_fechacrea_Jsonclick ;
   private String divPais_usuariomodificafiltercontainer_Internalname ;
   private String lblLblpais_usuariomodificafilter_Internalname ;
   private String lblLblpais_usuariomodificafilter_Jsonclick ;
   private String edtavCpais_usuariomodifica_Internalname ;
   private String edtavCpais_usuariomodifica_Jsonclick ;
   private String divPais_fechamodificafiltercontainer_Internalname ;
   private String lblLblpais_fechamodificafilter_Internalname ;
   private String lblLblpais_fechamodificafilter_Jsonclick ;
   private String edtavCpais_fechamodifica_Internalname ;
   private String edtavCpais_fechamodifica_Jsonclick ;
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
   private String edtPais_Descripcion_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_UsuarioCrea_Internalname ;
   private String edtPais_FechaCrea_Internalname ;
   private String scmdbuf ;
   private String AV13ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtPais_UsuarioCrea_Jsonclick ;
   private String edtPais_FechaCrea_Jsonclick ;
   private java.util.Date AV9cPais_FechaCrea ;
   private java.util.Date AV11cPais_FechaModifica ;
   private java.util.Date A137Pais_FechaCrea ;
   private java.util.Date A139Pais_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cPais_Codigo ;
   private String AV7cPais_Descripcion ;
   private String AV8cPais_UsuarioCrea ;
   private String AV10cPais_UsuarioModifica ;
   private String AV12pPais_Codigo ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private String A136Pais_UsuarioCrea ;
   private String AV16Linkselection_GXI ;
   private String lV6cPais_Codigo ;
   private String lV7cPais_Descripcion ;
   private String lV8cPais_UsuarioCrea ;
   private String lV10cPais_UsuarioModifica ;
   private String A138Pais_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H008N2_A139Pais_FechaModifica ;
   private String[] H008N2_A138Pais_UsuarioModifica ;
   private java.util.Date[] H008N2_A137Pais_FechaCrea ;
   private String[] H008N2_A136Pais_UsuarioCrea ;
   private String[] H008N2_A11Pais_Descripcion ;
   private String[] H008N2_A9Pais_Codigo ;
   private long[] H008N3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00l0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cPais_Descripcion ,
                                          String AV8cPais_UsuarioCrea ,
                                          java.util.Date AV9cPais_FechaCrea ,
                                          String AV10cPais_UsuarioModifica ,
                                          java.util.Date AV11cPais_FechaModifica ,
                                          String A11Pais_Descripcion ,
                                          String A136Pais_UsuarioCrea ,
                                          java.util.Date A137Pais_FechaCrea ,
                                          String A138Pais_UsuarioModifica ,
                                          java.util.Date A139Pais_FechaModifica ,
                                          String A9Pais_Codigo ,
                                          String AV6cPais_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [9] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ Pais_FechaModifica, Pais_UsuarioModifica, Pais_FechaCrea," ;
      sSelectString = sSelectString + " Pais_UsuarioCrea, Pais_Descripcion, Pais_Codigo" ;
      sFromString = " FROM GEN_PAIS" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Pais_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cPais_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Pais_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cPais_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Pais_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cPais_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Pais_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cPais_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Pais_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cPais_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Pais_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Pais_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cPais_Descripcion ,
                                          String AV8cPais_UsuarioCrea ,
                                          java.util.Date AV9cPais_FechaCrea ,
                                          String AV10cPais_UsuarioModifica ,
                                          java.util.Date AV11cPais_FechaModifica ,
                                          String A11Pais_Descripcion ,
                                          String A136Pais_UsuarioCrea ,
                                          java.util.Date A137Pais_FechaCrea ,
                                          String A138Pais_UsuarioModifica ,
                                          java.util.Date A139Pais_FechaModifica ,
                                          String A9Pais_Codigo ,
                                          String AV6cPais_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM GEN_PAIS" ;
      scmdbuf = scmdbuf + " WHERE (Pais_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cPais_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Pais_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cPais_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Pais_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cPais_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Pais_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cPais_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Pais_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV11cPais_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Pais_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
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
                  return conditional_H008N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_H008N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[14], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               return;
      }
   }

}

