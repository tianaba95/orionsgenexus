/*
               File: gx00h0_impl
        Description: Selection List CIUDAD
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:35.91
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

public final  class gx00h0_impl extends GXDataArea
{
   public gx00h0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00h0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00h0_impl.class ));
   }

   public gx00h0_impl( int remoteHandle ,
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
            AV6cCiud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cCiud_Descripcion = httpContext.GetNextPar( ) ;
            AV8cDept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cCiud_UsuarioCrea = httpContext.GetNextPar( ) ;
            AV10cCiud_FechaCrea = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cCiud_UsuarioModifica = httpContext.GetNextPar( ) ;
            AV12cCiud_FechaModifica = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
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
            AV13pCiud_Codigo = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pCiud_Codigo", GXutil.ltrim( GXutil.str( AV13pCiud_Codigo, 4, 0)));
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
      pa8M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8M2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414243598");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00h0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCiud_Codigo,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( AV6cCiud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_DESCRIPCION", AV7cCiud_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEPT_CODIGO", GXutil.ltrim( localUtil.ntoc( AV8cDept_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_USUARIOCREA", AV9cCiud_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_FECHACREA", localUtil.ttoc( AV10cCiud_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_USUARIOMODIFICA", AV11cCiud_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCIUD_FECHAMODIFICA", localUtil.ttoc( AV12cCiud_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( AV13pCiud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divCiud_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCiud_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divDept_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_USUARIOCREAFILTERCONTAINER_Class", GXutil.rtrim( divCiud_usuariocreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_FECHACREAFILTERCONTAINER_Class", GXutil.rtrim( divCiud_fechacreafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_USUARIOMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divCiud_usuariomodificafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_FECHAMODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divCiud_fechamodificafiltercontainer_Class));
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
         we8M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8M2( ) ;
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
      return formatLink("com.orions2.gx00h0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pCiud_Codigo,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00H0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List CIUDAD" ;
   }

   public void wb8M0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_codigofilter_Internalname, "Código Ciudad", "", "", lblLblciud_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_codigo_Internalname, "Código Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cCiud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtavCciud_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cCiud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cCiud_Codigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCciud_codigo_Visible, edtavCciud_codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_descripcionfilter_Internalname, "Descripción Ciudad", "", "", lblLblciud_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_descripcion_Internalname, "Descripción Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_descripcion_Internalname, AV7cCiud_Descripcion, GXutil.rtrim( localUtil.format( AV7cCiud_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCciud_descripcion_Visible, edtavCciud_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDept_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDept_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldept_codigofilter_Internalname, "Código Departamento", "", "", lblLbldept_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdept_codigo_Internalname, "Código Departamento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdept_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cDept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtavCdept_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cDept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cDept_Codigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdept_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCdept_codigo_Visible, edtavCdept_codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_usuariocreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_usuariocreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_usuariocreafilter_Internalname, "Usuario Creación Ciudad", "", "", lblLblciud_usuariocreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_usuariocrea_Internalname, "Usuario Creación Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_usuariocrea_Internalname, AV9cCiud_UsuarioCrea, GXutil.rtrim( localUtil.format( AV9cCiud_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_usuariocrea_Jsonclick, 0, "Attribute", "", "", "", edtavCciud_usuariocrea_Visible, edtavCciud_usuariocrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_fechacreafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_fechacreafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_fechacreafilter_Internalname, "Fecha Creación Ciudad", "", "", lblLblciud_fechacreafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158m1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_fechacrea_Internalname, "Fecha Creación Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCciud_fechacrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_fechacrea_Internalname, localUtil.ttoc( AV10cCiud_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cCiud_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_fechacrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCciud_fechacrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_usuariomodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_usuariomodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_usuariomodificafilter_Internalname, "Usuario Modifica Ciudad", "", "", lblLblciud_usuariomodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_usuariomodifica_Internalname, "Usuario Modifica Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_usuariomodifica_Internalname, AV11cCiud_UsuarioModifica, GXutil.rtrim( localUtil.format( AV11cCiud_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_usuariomodifica_Jsonclick, 0, "Attribute", "", "", "", edtavCciud_usuariomodifica_Visible, edtavCciud_usuariomodifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCiud_fechamodificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCiud_fechamodificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblciud_fechamodificafilter_Internalname, "Fecha Modifica Ciudad", "", "", lblLblciud_fechamodificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178m1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCciud_fechamodifica_Internalname, "Fecha Modifica Ciudad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCciud_fechamodifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCciud_fechamodifica_Internalname, localUtil.ttoc( AV12cCiud_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV12cCiud_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCciud_fechamodifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCciud_fechamodifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00H0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188m1_client"+"'", TempTags, "", 2, "HLP_Gx00H0.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación Ciudad") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A7Ciud_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtCiud_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A127Ciud_UsuarioCrea);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00H0.htm");
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

   public void start8M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List CIUDAD", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8M0( ) ;
   }

   public void ws8M2( )
   {
      start8M2( ) ;
      evt8M2( ) ;
   }

   public void evt8M2( )
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
                           A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
                           A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
                           A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
                           A127Ciud_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCiud_UsuarioCrea_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198M2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208M2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cciud_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCIUD_CODIGO"), ",", ".") != AV6cCiud_Codigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cciud_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_DESCRIPCION"), AV7cCiud_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdept_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEPT_CODIGO"), ",", ".") != AV8cDept_Codigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cciud_usuariocrea Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_USUARIOCREA"), AV9cCiud_UsuarioCrea) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cciud_fechacrea Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCIUD_FECHACREA"), 0), AV10cCiud_FechaCrea) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cciud_usuariomodifica Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_USUARIOMODIFICA"), AV11cCiud_UsuarioModifica) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cciud_fechamodifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCIUD_FECHAMODIFICA"), 0), AV12cCiud_FechaModifica) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218M2 ();
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

   public void we8M2( )
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

   public void pa8M2( )
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
                                  short AV6cCiud_Codigo ,
                                  String AV7cCiud_Descripcion ,
                                  short AV8cDept_Codigo ,
                                  String AV9cCiud_UsuarioCrea ,
                                  java.util.Date AV10cCiud_FechaCrea ,
                                  String AV11cCiud_UsuarioModifica ,
                                  java.util.Date AV12cCiud_FechaModifica )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8M2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_DESCRIPCION", A7Ciud_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEPT_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_CODIGO", GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_USUARIOCREA", A127Ciud_UsuarioCrea);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8M2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8M2( )
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
                                              AV7cCiud_Descripcion ,
                                              new Short(AV8cDept_Codigo) ,
                                              AV9cCiud_UsuarioCrea ,
                                              AV10cCiud_FechaCrea ,
                                              AV11cCiud_UsuarioModifica ,
                                              AV12cCiud_FechaModifica ,
                                              A7Ciud_Descripcion ,
                                              new Short(A6Dept_Codigo) ,
                                              A127Ciud_UsuarioCrea ,
                                              A128Ciud_FechaCrea ,
                                              A129Ciud_UsuarioModifica ,
                                              A130Ciud_FechaModifica ,
                                              new Short(AV6cCiud_Codigo) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT
                                              }
         } ) ;
         lV7cCiud_Descripcion = GXutil.concat( GXutil.rtrim( AV7cCiud_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCiud_Descripcion", AV7cCiud_Descripcion);
         lV9cCiud_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV9cCiud_UsuarioCrea), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCiud_UsuarioCrea", AV9cCiud_UsuarioCrea);
         lV11cCiud_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cCiud_UsuarioModifica), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cCiud_UsuarioModifica", AV11cCiud_UsuarioModifica);
         /* Using cursor H008M2 */
         pr_default.execute(0, new Object[] {new Short(AV6cCiud_Codigo), lV7cCiud_Descripcion, new Short(AV8cDept_Codigo), lV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, lV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A130Ciud_FechaModifica = H008M2_A130Ciud_FechaModifica[0] ;
            A129Ciud_UsuarioModifica = H008M2_A129Ciud_UsuarioModifica[0] ;
            A128Ciud_FechaCrea = H008M2_A128Ciud_FechaCrea[0] ;
            A127Ciud_UsuarioCrea = H008M2_A127Ciud_UsuarioCrea[0] ;
            A6Dept_Codigo = H008M2_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H008M2_A7Ciud_Descripcion[0] ;
            A5Ciud_Codigo = H008M2_A5Ciud_Codigo[0] ;
            /* Execute user event: Load */
            e208M2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8M0( ) ;
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
                                           AV7cCiud_Descripcion ,
                                           new Short(AV8cDept_Codigo) ,
                                           AV9cCiud_UsuarioCrea ,
                                           AV10cCiud_FechaCrea ,
                                           AV11cCiud_UsuarioModifica ,
                                           AV12cCiud_FechaModifica ,
                                           A7Ciud_Descripcion ,
                                           new Short(A6Dept_Codigo) ,
                                           A127Ciud_UsuarioCrea ,
                                           A128Ciud_FechaCrea ,
                                           A129Ciud_UsuarioModifica ,
                                           A130Ciud_FechaModifica ,
                                           new Short(AV6cCiud_Codigo) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT
                                           }
      } ) ;
      lV7cCiud_Descripcion = GXutil.concat( GXutil.rtrim( AV7cCiud_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cCiud_Descripcion", AV7cCiud_Descripcion);
      lV9cCiud_UsuarioCrea = GXutil.concat( GXutil.rtrim( AV9cCiud_UsuarioCrea), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cCiud_UsuarioCrea", AV9cCiud_UsuarioCrea);
      lV11cCiud_UsuarioModifica = GXutil.concat( GXutil.rtrim( AV11cCiud_UsuarioModifica), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cCiud_UsuarioModifica", AV11cCiud_UsuarioModifica);
      /* Using cursor H008M3 */
      pr_default.execute(1, new Object[] {new Short(AV6cCiud_Codigo), lV7cCiud_Descripcion, new Short(AV8cDept_Codigo), lV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, lV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica});
      GRID1_nRecordCount = H008M3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cCiud_Codigo, AV7cCiud_Descripcion, AV8cDept_Codigo, AV9cCiud_UsuarioCrea, AV10cCiud_FechaCrea, AV11cCiud_UsuarioModifica, AV12cCiud_FechaModifica) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8M0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCciud_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCciud_codigo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCIUD_CODIGO");
            GX_FocusControl = edtavCciud_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cCiud_Codigo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCiud_Codigo", GXutil.ltrim( GXutil.str( AV6cCiud_Codigo, 4, 0)));
         }
         else
         {
            AV6cCiud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtavCciud_codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cCiud_Codigo", GXutil.ltrim( GXutil.str( AV6cCiud_Codigo, 4, 0)));
         }
         AV7cCiud_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCciud_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cCiud_Descripcion", AV7cCiud_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdept_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdept_codigo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDEPT_CODIGO");
            GX_FocusControl = edtavCdept_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cDept_Codigo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cDept_Codigo", GXutil.ltrim( GXutil.str( AV8cDept_Codigo, 4, 0)));
         }
         else
         {
            AV8cDept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtavCdept_codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cDept_Codigo", GXutil.ltrim( GXutil.str( AV8cDept_Codigo, 4, 0)));
         }
         AV9cCiud_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtavCciud_usuariocrea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCiud_UsuarioCrea", AV9cCiud_UsuarioCrea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCciud_fechacrea_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCCIUD_FECHACREA");
            GX_FocusControl = edtavCciud_fechacrea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCiud_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCiud_FechaCrea", localUtil.ttoc( AV10cCiud_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cCiud_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtavCciud_fechacrea_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCiud_FechaCrea", localUtil.ttoc( AV10cCiud_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
         AV11cCiud_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtavCciud_usuariomodifica_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cCiud_UsuarioModifica", AV11cCiud_UsuarioModifica);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCciud_fechamodifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCCIUD_FECHAMODIFICA");
            GX_FocusControl = edtavCciud_fechamodifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cCiud_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV12cCiud_FechaModifica", localUtil.ttoc( AV12cCiud_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV12cCiud_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtavCciud_fechamodifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cCiud_FechaModifica", localUtil.ttoc( AV12cCiud_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCIUD_CODIGO"), ",", ".") != AV6cCiud_Codigo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_DESCRIPCION"), AV7cCiud_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEPT_CODIGO"), ",", ".") != AV8cDept_Codigo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_USUARIOCREA"), AV9cCiud_UsuarioCrea) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCIUD_FECHACREA"), 0), AV10cCiud_FechaCrea) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCIUD_USUARIOMODIFICA"), AV11cCiud_UsuarioModifica) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCCIUD_FECHAMODIFICA"), 0), AV12cCiud_FechaModifica) ) )
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
      e198M2 ();
      if (returnInSub) return;
   }

   public void e198M2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "CIUDAD", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208M2( )
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
      e218M2 ();
      if (returnInSub) return;
   }

   public void e218M2( )
   {
      /* Enter Routine */
      AV13pCiud_Codigo = A5Ciud_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCiud_Codigo", GXutil.ltrim( GXutil.str( AV13pCiud_Codigo, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Short(AV13pCiud_Codigo)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pCiud_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCiud_Codigo", GXutil.ltrim( GXutil.str( AV13pCiud_Codigo, 4, 0)));
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
      pa8M2( ) ;
      ws8M2( ) ;
      we8M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414243721");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00h0.js", "?201861414243721");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_84_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_84_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_84_idx ;
      edtCiud_UsuarioCrea_Internalname = "CIUD_USUARIOCREA_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_84_fel_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_84_fel_idx ;
      edtCiud_UsuarioCrea_Internalname = "CIUD_USUARIOCREA_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8M0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtCiud_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtCiud_Descripcion_Internalname, "Link", edtCiud_Descripcion_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Descripcion_Internalname,A7Ciud_Descripcion,GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'",edtCiud_Descripcion_Link,"","","",edtCiud_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDept_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_UsuarioCrea_Internalname,A127Ciud_UsuarioCrea,GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEPT_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CIUD_USUARIOCREA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A127Ciud_UsuarioCrea, "@!"))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblciud_codigofilter_Internalname = "LBLCIUD_CODIGOFILTER" ;
      edtavCciud_codigo_Internalname = "vCCIUD_CODIGO" ;
      divCiud_codigofiltercontainer_Internalname = "CIUD_CODIGOFILTERCONTAINER" ;
      lblLblciud_descripcionfilter_Internalname = "LBLCIUD_DESCRIPCIONFILTER" ;
      edtavCciud_descripcion_Internalname = "vCCIUD_DESCRIPCION" ;
      divCiud_descripcionfiltercontainer_Internalname = "CIUD_DESCRIPCIONFILTERCONTAINER" ;
      lblLbldept_codigofilter_Internalname = "LBLDEPT_CODIGOFILTER" ;
      edtavCdept_codigo_Internalname = "vCDEPT_CODIGO" ;
      divDept_codigofiltercontainer_Internalname = "DEPT_CODIGOFILTERCONTAINER" ;
      lblLblciud_usuariocreafilter_Internalname = "LBLCIUD_USUARIOCREAFILTER" ;
      edtavCciud_usuariocrea_Internalname = "vCCIUD_USUARIOCREA" ;
      divCiud_usuariocreafiltercontainer_Internalname = "CIUD_USUARIOCREAFILTERCONTAINER" ;
      lblLblciud_fechacreafilter_Internalname = "LBLCIUD_FECHACREAFILTER" ;
      edtavCciud_fechacrea_Internalname = "vCCIUD_FECHACREA" ;
      divCiud_fechacreafiltercontainer_Internalname = "CIUD_FECHACREAFILTERCONTAINER" ;
      lblLblciud_usuariomodificafilter_Internalname = "LBLCIUD_USUARIOMODIFICAFILTER" ;
      edtavCciud_usuariomodifica_Internalname = "vCCIUD_USUARIOMODIFICA" ;
      divCiud_usuariomodificafiltercontainer_Internalname = "CIUD_USUARIOMODIFICAFILTERCONTAINER" ;
      lblLblciud_fechamodificafilter_Internalname = "LBLCIUD_FECHAMODIFICAFILTER" ;
      edtavCciud_fechamodifica_Internalname = "vCCIUD_FECHAMODIFICA" ;
      divCiud_fechamodificafiltercontainer_Internalname = "CIUD_FECHAMODIFICAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtCiud_UsuarioCrea_Internalname = "CIUD_USUARIOCREA" ;
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
      edtCiud_UsuarioCrea_Jsonclick = "" ;
      edtDept_Codigo_Jsonclick = "" ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtCiud_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCciud_fechamodifica_Jsonclick = "" ;
      edtavCciud_fechamodifica_Enabled = 1 ;
      edtavCciud_usuariomodifica_Jsonclick = "" ;
      edtavCciud_usuariomodifica_Enabled = 1 ;
      edtavCciud_usuariomodifica_Visible = 1 ;
      edtavCciud_fechacrea_Jsonclick = "" ;
      edtavCciud_fechacrea_Enabled = 1 ;
      edtavCciud_usuariocrea_Jsonclick = "" ;
      edtavCciud_usuariocrea_Enabled = 1 ;
      edtavCciud_usuariocrea_Visible = 1 ;
      edtavCdept_codigo_Jsonclick = "" ;
      edtavCdept_codigo_Enabled = 1 ;
      edtavCdept_codigo_Visible = 1 ;
      edtavCciud_descripcion_Jsonclick = "" ;
      edtavCciud_descripcion_Enabled = 1 ;
      edtavCciud_descripcion_Visible = 1 ;
      edtavCciud_codigo_Jsonclick = "" ;
      edtavCciud_codigo_Enabled = 1 ;
      edtavCciud_codigo_Visible = 1 ;
      divCiud_fechamodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divCiud_usuariomodificafiltercontainer_Class = "AdvancedContainerItem" ;
      divCiud_fechacreafiltercontainer_Class = "AdvancedContainerItem" ;
      divCiud_usuariocreafiltercontainer_Class = "AdvancedContainerItem" ;
      divDept_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divCiud_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divCiud_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List CIUDAD" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCiud_Codigo',fld:'vCCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV7cCiud_Descripcion',fld:'vCCIUD_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cDept_Codigo',fld:'vCDEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'AV9cCiud_UsuarioCrea',fld:'vCCIUD_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cCiud_FechaCrea',fld:'vCCIUD_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cCiud_UsuarioModifica',fld:'vCCIUD_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cCiud_FechaModifica',fld:'vCCIUD_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188M1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCIUD_CODIGOFILTER.CLICK","{handler:'e118M1',iparms:[{av:'divCiud_codigofiltercontainer_Class',ctrl:'CIUD_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_codigofiltercontainer_Class',ctrl:'CIUD_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCciud_codigo_Visible',ctrl:'vCCIUD_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLCIUD_DESCRIPCIONFILTER.CLICK","{handler:'e128M1',iparms:[{av:'divCiud_descripcionfiltercontainer_Class',ctrl:'CIUD_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_descripcionfiltercontainer_Class',ctrl:'CIUD_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCciud_descripcion_Visible',ctrl:'vCCIUD_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLDEPT_CODIGOFILTER.CLICK","{handler:'e138M1',iparms:[{av:'divDept_codigofiltercontainer_Class',ctrl:'DEPT_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDept_codigofiltercontainer_Class',ctrl:'DEPT_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCdept_codigo_Visible',ctrl:'vCDEPT_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLCIUD_USUARIOCREAFILTER.CLICK","{handler:'e148M1',iparms:[{av:'divCiud_usuariocreafiltercontainer_Class',ctrl:'CIUD_USUARIOCREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_usuariocreafiltercontainer_Class',ctrl:'CIUD_USUARIOCREAFILTERCONTAINER',prop:'Class'},{av:'edtavCciud_usuariocrea_Visible',ctrl:'vCCIUD_USUARIOCREA',prop:'Visible'}]}");
      setEventMetadata("LBLCIUD_FECHACREAFILTER.CLICK","{handler:'e158M1',iparms:[{av:'divCiud_fechacreafiltercontainer_Class',ctrl:'CIUD_FECHACREAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_fechacreafiltercontainer_Class',ctrl:'CIUD_FECHACREAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLCIUD_USUARIOMODIFICAFILTER.CLICK","{handler:'e168M1',iparms:[{av:'divCiud_usuariomodificafiltercontainer_Class',ctrl:'CIUD_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_usuariomodificafiltercontainer_Class',ctrl:'CIUD_USUARIOMODIFICAFILTERCONTAINER',prop:'Class'},{av:'edtavCciud_usuariomodifica_Visible',ctrl:'vCCIUD_USUARIOMODIFICA',prop:'Visible'}]}");
      setEventMetadata("LBLCIUD_FECHAMODIFICAFILTER.CLICK","{handler:'e178M1',iparms:[{av:'divCiud_fechamodificafiltercontainer_Class',ctrl:'CIUD_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCiud_fechamodificafiltercontainer_Class',ctrl:'CIUD_FECHAMODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e218M2',iparms:[{av:'A5Ciud_Codigo',fld:'CIUD_CODIGO',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pCiud_Codigo',fld:'vPCIUD_CODIGO',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCiud_Codigo',fld:'vCCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV7cCiud_Descripcion',fld:'vCCIUD_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cDept_Codigo',fld:'vCDEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'AV9cCiud_UsuarioCrea',fld:'vCCIUD_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cCiud_FechaCrea',fld:'vCCIUD_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cCiud_UsuarioModifica',fld:'vCCIUD_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cCiud_FechaModifica',fld:'vCCIUD_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCiud_Codigo',fld:'vCCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV7cCiud_Descripcion',fld:'vCCIUD_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cDept_Codigo',fld:'vCDEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'AV9cCiud_UsuarioCrea',fld:'vCCIUD_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cCiud_FechaCrea',fld:'vCCIUD_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cCiud_UsuarioModifica',fld:'vCCIUD_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cCiud_FechaModifica',fld:'vCCIUD_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCiud_Codigo',fld:'vCCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV7cCiud_Descripcion',fld:'vCCIUD_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cDept_Codigo',fld:'vCDEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'AV9cCiud_UsuarioCrea',fld:'vCCIUD_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cCiud_FechaCrea',fld:'vCCIUD_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cCiud_UsuarioModifica',fld:'vCCIUD_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cCiud_FechaModifica',fld:'vCCIUD_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cCiud_Codigo',fld:'vCCIUD_CODIGO',pic:'ZZZ9',nv:0},{av:'AV7cCiud_Descripcion',fld:'vCCIUD_DESCRIPCION',pic:'@!',nv:''},{av:'AV8cDept_Codigo',fld:'vCDEPT_CODIGO',pic:'ZZZ9',nv:0},{av:'AV9cCiud_UsuarioCrea',fld:'vCCIUD_USUARIOCREA',pic:'@!',nv:''},{av:'AV10cCiud_FechaCrea',fld:'vCCIUD_FECHACREA',pic:'99/99/99 99:99',nv:''},{av:'AV11cCiud_UsuarioModifica',fld:'vCCIUD_USUARIOMODIFICA',pic:'@!',nv:''},{av:'AV12cCiud_FechaModifica',fld:'vCCIUD_FECHAMODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV7cCiud_Descripcion = "" ;
      AV9cCiud_UsuarioCrea = "" ;
      AV10cCiud_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV11cCiud_UsuarioModifica = "" ;
      AV12cCiud_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblciud_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblciud_descripcionfilter_Jsonclick = "" ;
      lblLbldept_codigofilter_Jsonclick = "" ;
      lblLblciud_usuariocreafilter_Jsonclick = "" ;
      lblLblciud_fechacreafilter_Jsonclick = "" ;
      lblLblciud_usuariomodificafilter_Jsonclick = "" ;
      lblLblciud_fechamodificafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A7Ciud_Descripcion = "" ;
      A127Ciud_UsuarioCrea = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV7cCiud_Descripcion = "" ;
      lV9cCiud_UsuarioCrea = "" ;
      lV11cCiud_UsuarioModifica = "" ;
      A128Ciud_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A129Ciud_UsuarioModifica = "" ;
      A130Ciud_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      H008M2_A130Ciud_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H008M2_A129Ciud_UsuarioModifica = new String[] {""} ;
      H008M2_A128Ciud_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H008M2_A127Ciud_UsuarioCrea = new String[] {""} ;
      H008M2_A6Dept_Codigo = new short[1] ;
      H008M2_A7Ciud_Descripcion = new String[] {""} ;
      H008M2_A5Ciud_Codigo = new short[1] ;
      H008M3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00h0__default(),
         new Object[] {
             new Object[] {
            H008M2_A130Ciud_FechaModifica, H008M2_A129Ciud_UsuarioModifica, H008M2_A128Ciud_FechaCrea, H008M2_A127Ciud_UsuarioCrea, H008M2_A6Dept_Codigo, H008M2_A7Ciud_Descripcion, H008M2_A5Ciud_Codigo
            }
            , new Object[] {
            H008M3_AGRID1_nRecordCount
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
   private short AV6cCiud_Codigo ;
   private short AV8cDept_Codigo ;
   private short AV13pCiud_Codigo ;
   private short wbEnd ;
   private short wbStart ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCciud_codigo_Enabled ;
   private int edtavCciud_codigo_Visible ;
   private int edtavCciud_descripcion_Visible ;
   private int edtavCciud_descripcion_Enabled ;
   private int edtavCdept_codigo_Enabled ;
   private int edtavCdept_codigo_Visible ;
   private int edtavCciud_usuariocrea_Visible ;
   private int edtavCciud_usuariocrea_Enabled ;
   private int edtavCciud_fechacrea_Enabled ;
   private int edtavCciud_usuariomodifica_Visible ;
   private int edtavCciud_usuariomodifica_Enabled ;
   private int edtavCciud_fechamodifica_Enabled ;
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
   private String divCiud_codigofiltercontainer_Class ;
   private String divCiud_descripcionfiltercontainer_Class ;
   private String divDept_codigofiltercontainer_Class ;
   private String divCiud_usuariocreafiltercontainer_Class ;
   private String divCiud_fechacreafiltercontainer_Class ;
   private String divCiud_usuariomodificafiltercontainer_Class ;
   private String divCiud_fechamodificafiltercontainer_Class ;
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
   private String divCiud_codigofiltercontainer_Internalname ;
   private String lblLblciud_codigofilter_Internalname ;
   private String lblLblciud_codigofilter_Jsonclick ;
   private String edtavCciud_codigo_Internalname ;
   private String TempTags ;
   private String edtavCciud_codigo_Jsonclick ;
   private String divCiud_descripcionfiltercontainer_Internalname ;
   private String lblLblciud_descripcionfilter_Internalname ;
   private String lblLblciud_descripcionfilter_Jsonclick ;
   private String edtavCciud_descripcion_Internalname ;
   private String edtavCciud_descripcion_Jsonclick ;
   private String divDept_codigofiltercontainer_Internalname ;
   private String lblLbldept_codigofilter_Internalname ;
   private String lblLbldept_codigofilter_Jsonclick ;
   private String edtavCdept_codigo_Internalname ;
   private String edtavCdept_codigo_Jsonclick ;
   private String divCiud_usuariocreafiltercontainer_Internalname ;
   private String lblLblciud_usuariocreafilter_Internalname ;
   private String lblLblciud_usuariocreafilter_Jsonclick ;
   private String edtavCciud_usuariocrea_Internalname ;
   private String edtavCciud_usuariocrea_Jsonclick ;
   private String divCiud_fechacreafiltercontainer_Internalname ;
   private String lblLblciud_fechacreafilter_Internalname ;
   private String lblLblciud_fechacreafilter_Jsonclick ;
   private String edtavCciud_fechacrea_Internalname ;
   private String edtavCciud_fechacrea_Jsonclick ;
   private String divCiud_usuariomodificafiltercontainer_Internalname ;
   private String lblLblciud_usuariomodificafilter_Internalname ;
   private String lblLblciud_usuariomodificafilter_Jsonclick ;
   private String edtavCciud_usuariomodifica_Internalname ;
   private String edtavCciud_usuariomodifica_Jsonclick ;
   private String divCiud_fechamodificafiltercontainer_Internalname ;
   private String lblLblciud_fechamodificafilter_Internalname ;
   private String lblLblciud_fechamodificafilter_Jsonclick ;
   private String edtavCciud_fechamodifica_Internalname ;
   private String edtavCciud_fechamodifica_Jsonclick ;
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
   private String edtCiud_Descripcion_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtDept_Codigo_Internalname ;
   private String edtCiud_UsuarioCrea_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtCiud_UsuarioCrea_Jsonclick ;
   private java.util.Date AV10cCiud_FechaCrea ;
   private java.util.Date AV12cCiud_FechaModifica ;
   private java.util.Date A128Ciud_FechaCrea ;
   private java.util.Date A130Ciud_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cCiud_Descripcion ;
   private String AV9cCiud_UsuarioCrea ;
   private String AV11cCiud_UsuarioModifica ;
   private String A7Ciud_Descripcion ;
   private String A127Ciud_UsuarioCrea ;
   private String AV17Linkselection_GXI ;
   private String lV7cCiud_Descripcion ;
   private String lV9cCiud_UsuarioCrea ;
   private String lV11cCiud_UsuarioModifica ;
   private String A129Ciud_UsuarioModifica ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H008M2_A130Ciud_FechaModifica ;
   private String[] H008M2_A129Ciud_UsuarioModifica ;
   private java.util.Date[] H008M2_A128Ciud_FechaCrea ;
   private String[] H008M2_A127Ciud_UsuarioCrea ;
   private short[] H008M2_A6Dept_Codigo ;
   private String[] H008M2_A7Ciud_Descripcion ;
   private short[] H008M2_A5Ciud_Codigo ;
   private long[] H008M3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00h0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cCiud_Descripcion ,
                                          short AV8cDept_Codigo ,
                                          String AV9cCiud_UsuarioCrea ,
                                          java.util.Date AV10cCiud_FechaCrea ,
                                          String AV11cCiud_UsuarioModifica ,
                                          java.util.Date AV12cCiud_FechaModifica ,
                                          String A7Ciud_Descripcion ,
                                          short A6Dept_Codigo ,
                                          String A127Ciud_UsuarioCrea ,
                                          java.util.Date A128Ciud_FechaCrea ,
                                          String A129Ciud_UsuarioModifica ,
                                          java.util.Date A130Ciud_FechaModifica ,
                                          short AV6cCiud_Codigo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Ciud_FechaModifica, Ciud_UsuarioModifica, Ciud_FechaCrea," ;
      sSelectString = sSelectString + " Ciud_UsuarioCrea, Dept_Codigo, Ciud_Descripcion, Ciud_Codigo" ;
      sFromString = " FROM GEN_CIUDAD" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Ciud_Codigo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cCiud_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cDept_Codigo) )
      {
         sWhereString = sWhereString + " and (Dept_Codigo >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCiud_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cCiud_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Ciud_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cCiud_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cCiud_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Ciud_FechaModifica >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Ciud_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008M3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cCiud_Descripcion ,
                                          short AV8cDept_Codigo ,
                                          String AV9cCiud_UsuarioCrea ,
                                          java.util.Date AV10cCiud_FechaCrea ,
                                          String AV11cCiud_UsuarioModifica ,
                                          java.util.Date AV12cCiud_FechaModifica ,
                                          String A7Ciud_Descripcion ,
                                          short A6Dept_Codigo ,
                                          String A127Ciud_UsuarioCrea ,
                                          java.util.Date A128Ciud_FechaCrea ,
                                          String A129Ciud_UsuarioModifica ,
                                          java.util.Date A130Ciud_FechaModifica ,
                                          short AV6cCiud_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM GEN_CIUDAD" ;
      scmdbuf = scmdbuf + " WHERE (Ciud_Codigo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cCiud_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cDept_Codigo) )
      {
         sWhereString = sWhereString + " and (Dept_Codigo >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCiud_UsuarioCrea)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_UsuarioCrea like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cCiud_FechaCrea) )
      {
         sWhereString = sWhereString + " and (Ciud_FechaCrea >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cCiud_UsuarioModifica)==0) )
      {
         sWhereString = sWhereString + " and (Ciud_UsuarioModifica like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cCiud_FechaModifica) )
      {
         sWhereString = sWhereString + " and (Ciud_FechaModifica >= ?)" ;
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
                  return conditional_H008M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() );
            case 1 :
                  return conditional_H008M3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008M3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
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
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
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

