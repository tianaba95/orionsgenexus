/*
               File: gx01t0_impl
        Description: Selection List REPORTES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:10.4
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

public final  class gx01t0_impl extends GXDataArea
{
   public gx01t0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01t0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01t0_impl.class ));
   }

   public gx01t0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCrpt_rep_formato = new HTMLChoice();
      cmbRPT_REP_FORMATO = new HTMLChoice();
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
            AV6cRPT_REP_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cRPT_REP_NOMBRE = httpContext.GetNextPar( ) ;
            AV8cRPT_REP_DESCRIPCION = httpContext.GetNextPar( ) ;
            AV9cRPT_REP_FORMATO = httpContext.GetNextPar( ) ;
            AV10cRPT_REP_FECHA_CREACION = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV11cRPT_REP_USUARIO_CREACION = httpContext.GetNextPar( ) ;
            AV12cRPT_REP_FECHA_MODIFICA = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
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
            AV13pRPT_REP_ID = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pRPT_REP_ID", GXutil.ltrim( GXutil.str( AV13pRPT_REP_ID, 4, 0)));
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
      pa9J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start9J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414251011");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01t0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRPT_REP_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_ID", GXutil.ltrim( localUtil.ntoc( AV6cRPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_NOMBRE", AV7cRPT_REP_NOMBRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_DESCRIPCION", AV8cRPT_REP_DESCRIPCION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_FECHA_CREACION", localUtil.ttoc( AV10cRPT_REP_FECHA_CREACION, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_USUARIO_CREACION", AV11cRPT_REP_USUARIO_CREACION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_FECHA_MODIFICA", localUtil.ttoc( AV12cRPT_REP_FECHA_MODIFICA, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPRPT_REP_ID", GXutil.ltrim( localUtil.ntoc( AV13pRPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_IDFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_NOMBREFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_nombrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FORMATOFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_formatofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FECHA_CREACIONFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_fecha_creacionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_USUARIO_CREACIONFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_usuario_creacionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FECHA_MODIFICAFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_fecha_modificafiltercontainer_Class));
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
         we9J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt9J2( ) ;
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
      return formatLink("com.orions2.gx01t0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRPT_REP_ID,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01T0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List REPORTES" ;
   }

   public void wb9J0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_idfilter_Internalname, "Id Reporte", "", "", lblLblrpt_rep_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e119j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_id_Internalname, "REPORTE ID", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRPT_REP_ID, (byte)(4), (byte)(0), ",", "")), ((edtavCrpt_rep_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRPT_REP_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRPT_REP_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_id_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_rep_id_Visible, edtavCrpt_rep_id_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_nombrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_nombrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_nombrefilter_Internalname, "Nombre del reporte", "", "", lblLblrpt_rep_nombrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e129j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_nombre_Internalname, "REPORTE NOMBRE", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_nombre_Internalname, AV7cRPT_REP_NOMBRE, GXutil.rtrim( localUtil.format( AV7cRPT_REP_NOMBRE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_nombre_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_rep_nombre_Visible, edtavCrpt_rep_nombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_descripcionfilter_Internalname, "Descripci�n del reporte", "", "", lblLblrpt_rep_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e139j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_descripcion_Internalname, "REPORTE DESCRIPCION", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_descripcion_Internalname, AV8cRPT_REP_DESCRIPCION, GXutil.rtrim( localUtil.format( AV8cRPT_REP_DESCRIPCION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_rep_descripcion_Visible, edtavCrpt_rep_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_formatofiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_formatofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_formatofilter_Internalname, "Formato", "", "", lblLblrpt_rep_formatofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e149j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCrpt_rep_formato.getInternalname(), "REPORTE FORMATO", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCrpt_rep_formato, cmbavCrpt_rep_formato.getInternalname(), GXutil.rtrim( AV9cRPT_REP_FORMATO), 1, cmbavCrpt_rep_formato.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCrpt_rep_formato.getVisible(), cmbavCrpt_rep_formato.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, "HLP_Gx01T0.htm");
         cmbavCrpt_rep_formato.setValue( GXutil.rtrim( AV9cRPT_REP_FORMATO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCrpt_rep_formato.getInternalname(), "Values", cmbavCrpt_rep_formato.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_fecha_creacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_fecha_creacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_fecha_creacionfilter_Internalname, "Fecha de Creaci�n", "", "", lblLblrpt_rep_fecha_creacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e159j1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_fecha_creacion_Internalname, "REPORTE FECHA CREACION", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrpt_rep_fecha_creacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_fecha_creacion_Internalname, localUtil.ttoc( AV10cRPT_REP_FECHA_CREACION, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV10cRPT_REP_FECHA_CREACION, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_fecha_creacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrpt_rep_fecha_creacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_usuario_creacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_usuario_creacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_usuario_creacionfilter_Internalname, "Usuario de Creaci�n", "", "", lblLblrpt_rep_usuario_creacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e169j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_usuario_creacion_Internalname, "REPROTE USAURIO CREACION", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_usuario_creacion_Internalname, AV11cRPT_REP_USUARIO_CREACION, GXutil.rtrim( localUtil.format( AV11cRPT_REP_USUARIO_CREACION, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_usuario_creacion_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_rep_usuario_creacion_Visible, edtavCrpt_rep_usuario_creacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_fecha_modificafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_fecha_modificafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_fecha_modificafilter_Internalname, "Fecha de Modificaci�n", "", "", lblLblrpt_rep_fecha_modificafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e179j1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01T0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_fecha_modifica_Internalname, "REPROTE FECHA MODIFICA", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrpt_rep_fecha_modifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_fecha_modifica_Internalname, localUtil.ttoc( AV12cRPT_REP_FECHA_MODIFICA, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV12cRPT_REP_FECHA_MODIFICA, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_fecha_modifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrpt_rep_fecha_modifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01T0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e189j1_client"+"'", TempTags, "", 2, "HLP_Gx01T0.htm");
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
            httpContext.writeValue( "Reporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "del reporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "del reporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Formato") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A844RPT_REP_NOMBRE);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtRPT_REP_NOMBRE_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A845RPT_REP_DESCRIPCION);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A846RPT_REP_FORMATO);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01T0.htm");
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

   public void start9J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List REPORTES", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup9J0( ) ;
   }

   public void ws9J2( )
   {
      start9J2( ) ;
      evt9J2( ) ;
   }

   public void evt9J2( )
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
                           A843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_REP_ID_Internalname), ",", ".")) ;
                           A844RPT_REP_NOMBRE = httpContext.cgiGet( edtRPT_REP_NOMBRE_Internalname) ;
                           n844RPT_REP_NOMBRE = false ;
                           A845RPT_REP_DESCRIPCION = httpContext.cgiGet( edtRPT_REP_DESCRIPCION_Internalname) ;
                           n845RPT_REP_DESCRIPCION = false ;
                           cmbRPT_REP_FORMATO.setName( cmbRPT_REP_FORMATO.getInternalname() );
                           cmbRPT_REP_FORMATO.setValue( httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) );
                           A846RPT_REP_FORMATO = httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) ;
                           n846RPT_REP_FORMATO = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e199J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e209J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Crpt_rep_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_REP_ID"), ",", ".") != AV6cRPT_REP_ID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_nombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_NOMBRE"), AV7cRPT_REP_NOMBRE) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_DESCRIPCION"), AV8cRPT_REP_DESCRIPCION) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_formato Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_FORMATO"), AV9cRPT_REP_FORMATO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_fecha_creacion Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_REP_FECHA_CREACION"), 0), AV10cRPT_REP_FECHA_CREACION) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_usuario_creacion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_USUARIO_CREACION"), AV11cRPT_REP_USUARIO_CREACION) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_fecha_modifica Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_REP_FECHA_MODIFICA"), 0), AV12cRPT_REP_FECHA_MODIFICA) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e219J2 ();
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

   public void we9J2( )
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

   public void pa9J2( )
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
         cmbavCrpt_rep_formato.setName( "vCRPT_REP_FORMATO" );
         cmbavCrpt_rep_formato.setWebtags( "" );
         cmbavCrpt_rep_formato.addItem("EXC", "EXCEL", (short)(0));
         cmbavCrpt_rep_formato.addItem("PDF", "PDF", (short)(0));
         if ( cmbavCrpt_rep_formato.getItemCount() > 0 )
         {
            AV9cRPT_REP_FORMATO = cmbavCrpt_rep_formato.getValidValue(AV9cRPT_REP_FORMATO) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
         }
         GXCCtl = "RPT_REP_FORMATO_" + sGXsfl_84_idx ;
         cmbRPT_REP_FORMATO.setName( GXCCtl );
         cmbRPT_REP_FORMATO.setWebtags( "" );
         cmbRPT_REP_FORMATO.addItem("EXC", "EXCEL", (short)(0));
         cmbRPT_REP_FORMATO.addItem("PDF", "PDF", (short)(0));
         if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
         {
            A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
            n846RPT_REP_FORMATO = false ;
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
                                  short AV6cRPT_REP_ID ,
                                  String AV7cRPT_REP_NOMBRE ,
                                  String AV8cRPT_REP_DESCRIPCION ,
                                  String AV9cRPT_REP_FORMATO ,
                                  java.util.Date AV10cRPT_REP_FECHA_CREACION ,
                                  String AV11cRPT_REP_USUARIO_CREACION ,
                                  java.util.Date AV12cRPT_REP_FECHA_MODIFICA )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf9J2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_ID", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_FORMATO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FORMATO", A846RPT_REP_FORMATO);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCrpt_rep_formato.getItemCount() > 0 )
      {
         AV9cRPT_REP_FORMATO = cmbavCrpt_rep_formato.getValidValue(AV9cRPT_REP_FORMATO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf9J2( )
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
                                              AV7cRPT_REP_NOMBRE ,
                                              AV8cRPT_REP_DESCRIPCION ,
                                              AV9cRPT_REP_FORMATO ,
                                              AV10cRPT_REP_FECHA_CREACION ,
                                              AV11cRPT_REP_USUARIO_CREACION ,
                                              AV12cRPT_REP_FECHA_MODIFICA ,
                                              A844RPT_REP_NOMBRE ,
                                              A845RPT_REP_DESCRIPCION ,
                                              A846RPT_REP_FORMATO ,
                                              A847RPT_REP_FECHA_CREACION ,
                                              A848RPT_REP_USUARIO_CREACION ,
                                              A849RPT_REP_FECHA_MODIFICA ,
                                              new Short(AV6cRPT_REP_ID) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                              }
         } ) ;
         lV7cRPT_REP_NOMBRE = GXutil.concat( GXutil.rtrim( AV7cRPT_REP_NOMBRE), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cRPT_REP_NOMBRE", AV7cRPT_REP_NOMBRE);
         lV8cRPT_REP_DESCRIPCION = GXutil.concat( GXutil.rtrim( AV8cRPT_REP_DESCRIPCION), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_DESCRIPCION", AV8cRPT_REP_DESCRIPCION);
         lV9cRPT_REP_FORMATO = GXutil.concat( GXutil.rtrim( AV9cRPT_REP_FORMATO), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
         lV11cRPT_REP_USUARIO_CREACION = GXutil.concat( GXutil.rtrim( AV11cRPT_REP_USUARIO_CREACION), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRPT_REP_USUARIO_CREACION", AV11cRPT_REP_USUARIO_CREACION);
         /* Using cursor H009J2 */
         pr_default.execute(0, new Object[] {new Short(AV6cRPT_REP_ID), lV7cRPT_REP_NOMBRE, lV8cRPT_REP_DESCRIPCION, lV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, lV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A849RPT_REP_FECHA_MODIFICA = H009J2_A849RPT_REP_FECHA_MODIFICA[0] ;
            n849RPT_REP_FECHA_MODIFICA = H009J2_n849RPT_REP_FECHA_MODIFICA[0] ;
            A848RPT_REP_USUARIO_CREACION = H009J2_A848RPT_REP_USUARIO_CREACION[0] ;
            n848RPT_REP_USUARIO_CREACION = H009J2_n848RPT_REP_USUARIO_CREACION[0] ;
            A847RPT_REP_FECHA_CREACION = H009J2_A847RPT_REP_FECHA_CREACION[0] ;
            n847RPT_REP_FECHA_CREACION = H009J2_n847RPT_REP_FECHA_CREACION[0] ;
            A846RPT_REP_FORMATO = H009J2_A846RPT_REP_FORMATO[0] ;
            n846RPT_REP_FORMATO = H009J2_n846RPT_REP_FORMATO[0] ;
            A845RPT_REP_DESCRIPCION = H009J2_A845RPT_REP_DESCRIPCION[0] ;
            n845RPT_REP_DESCRIPCION = H009J2_n845RPT_REP_DESCRIPCION[0] ;
            A844RPT_REP_NOMBRE = H009J2_A844RPT_REP_NOMBRE[0] ;
            n844RPT_REP_NOMBRE = H009J2_n844RPT_REP_NOMBRE[0] ;
            A843RPT_REP_ID = H009J2_A843RPT_REP_ID[0] ;
            /* Execute user event: Load */
            e209J2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb9J0( ) ;
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
                                           AV7cRPT_REP_NOMBRE ,
                                           AV8cRPT_REP_DESCRIPCION ,
                                           AV9cRPT_REP_FORMATO ,
                                           AV10cRPT_REP_FECHA_CREACION ,
                                           AV11cRPT_REP_USUARIO_CREACION ,
                                           AV12cRPT_REP_FECHA_MODIFICA ,
                                           A844RPT_REP_NOMBRE ,
                                           A845RPT_REP_DESCRIPCION ,
                                           A846RPT_REP_FORMATO ,
                                           A847RPT_REP_FECHA_CREACION ,
                                           A848RPT_REP_USUARIO_CREACION ,
                                           A849RPT_REP_FECHA_MODIFICA ,
                                           new Short(AV6cRPT_REP_ID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      } ) ;
      lV7cRPT_REP_NOMBRE = GXutil.concat( GXutil.rtrim( AV7cRPT_REP_NOMBRE), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cRPT_REP_NOMBRE", AV7cRPT_REP_NOMBRE);
      lV8cRPT_REP_DESCRIPCION = GXutil.concat( GXutil.rtrim( AV8cRPT_REP_DESCRIPCION), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_DESCRIPCION", AV8cRPT_REP_DESCRIPCION);
      lV9cRPT_REP_FORMATO = GXutil.concat( GXutil.rtrim( AV9cRPT_REP_FORMATO), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
      lV11cRPT_REP_USUARIO_CREACION = GXutil.concat( GXutil.rtrim( AV11cRPT_REP_USUARIO_CREACION), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cRPT_REP_USUARIO_CREACION", AV11cRPT_REP_USUARIO_CREACION);
      /* Using cursor H009J3 */
      pr_default.execute(1, new Object[] {new Short(AV6cRPT_REP_ID), lV7cRPT_REP_NOMBRE, lV8cRPT_REP_DESCRIPCION, lV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, lV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA});
      GRID1_nRecordCount = H009J3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_REP_ID, AV7cRPT_REP_NOMBRE, AV8cRPT_REP_DESCRIPCION, AV9cRPT_REP_FORMATO, AV10cRPT_REP_FECHA_CREACION, AV11cRPT_REP_USUARIO_CREACION, AV12cRPT_REP_FECHA_MODIFICA) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup9J0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e199J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRPT_REP_ID");
            GX_FocusControl = edtavCrpt_rep_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cRPT_REP_ID = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRPT_REP_ID", GXutil.ltrim( GXutil.str( AV6cRPT_REP_ID, 4, 0)));
         }
         else
         {
            AV6cRPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRPT_REP_ID", GXutil.ltrim( GXutil.str( AV6cRPT_REP_ID, 4, 0)));
         }
         AV7cRPT_REP_NOMBRE = httpContext.cgiGet( edtavCrpt_rep_nombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cRPT_REP_NOMBRE", AV7cRPT_REP_NOMBRE);
         AV8cRPT_REP_DESCRIPCION = httpContext.cgiGet( edtavCrpt_rep_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_DESCRIPCION", AV8cRPT_REP_DESCRIPCION);
         cmbavCrpt_rep_formato.setName( cmbavCrpt_rep_formato.getInternalname() );
         cmbavCrpt_rep_formato.setValue( httpContext.cgiGet( cmbavCrpt_rep_formato.getInternalname()) );
         AV9cRPT_REP_FORMATO = httpContext.cgiGet( cmbavCrpt_rep_formato.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRPT_REP_FORMATO", AV9cRPT_REP_FORMATO);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrpt_rep_fecha_creacion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCRPT_REP_FECHA_CREACION");
            GX_FocusControl = edtavCrpt_rep_fecha_creacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cRPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRPT_REP_FECHA_CREACION", localUtil.ttoc( AV10cRPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV10cRPT_REP_FECHA_CREACION = localUtil.ctot( httpContext.cgiGet( edtavCrpt_rep_fecha_creacion_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cRPT_REP_FECHA_CREACION", localUtil.ttoc( AV10cRPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
         }
         AV11cRPT_REP_USUARIO_CREACION = GXutil.upper( httpContext.cgiGet( edtavCrpt_rep_usuario_creacion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRPT_REP_USUARIO_CREACION", AV11cRPT_REP_USUARIO_CREACION);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrpt_rep_fecha_modifica_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCRPT_REP_FECHA_MODIFICA");
            GX_FocusControl = edtavCrpt_rep_fecha_modifica_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cRPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV12cRPT_REP_FECHA_MODIFICA", localUtil.ttoc( AV12cRPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV12cRPT_REP_FECHA_MODIFICA = localUtil.ctot( httpContext.cgiGet( edtavCrpt_rep_fecha_modifica_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cRPT_REP_FECHA_MODIFICA", localUtil.ttoc( AV12cRPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_REP_ID"), ",", ".") != AV6cRPT_REP_ID )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_NOMBRE"), AV7cRPT_REP_NOMBRE) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_DESCRIPCION"), AV8cRPT_REP_DESCRIPCION) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_FORMATO"), AV9cRPT_REP_FORMATO) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_REP_FECHA_CREACION"), 0), AV10cRPT_REP_FECHA_CREACION) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_USUARIO_CREACION"), AV11cRPT_REP_USUARIO_CREACION) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_REP_FECHA_MODIFICA"), 0), AV12cRPT_REP_FECHA_MODIFICA) ) )
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
      e199J2 ();
      if (returnInSub) return;
   }

   public void e199J2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selecci�n %1", "REPORTES", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e209J2( )
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
      e219J2 ();
      if (returnInSub) return;
   }

   public void e219J2( )
   {
      /* Enter Routine */
      AV13pRPT_REP_ID = A843RPT_REP_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRPT_REP_ID", GXutil.ltrim( GXutil.str( AV13pRPT_REP_ID, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Short(AV13pRPT_REP_ID)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pRPT_REP_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRPT_REP_ID", GXutil.ltrim( GXutil.str( AV13pRPT_REP_ID, 4, 0)));
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
      pa9J2( ) ;
      ws9J2( ) ;
      we9J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414251136");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01t0.js", "?201861414251136");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtRPT_REP_ID_Internalname = "RPT_REP_ID_"+sGXsfl_84_idx ;
      edtRPT_REP_NOMBRE_Internalname = "RPT_REP_NOMBRE_"+sGXsfl_84_idx ;
      edtRPT_REP_DESCRIPCION_Internalname = "RPT_REP_DESCRIPCION_"+sGXsfl_84_idx ;
      cmbRPT_REP_FORMATO.setInternalname( "RPT_REP_FORMATO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtRPT_REP_ID_Internalname = "RPT_REP_ID_"+sGXsfl_84_fel_idx ;
      edtRPT_REP_NOMBRE_Internalname = "RPT_REP_NOMBRE_"+sGXsfl_84_fel_idx ;
      edtRPT_REP_DESCRIPCION_Internalname = "RPT_REP_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      cmbRPT_REP_FORMATO.setInternalname( "RPT_REP_FORMATO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb9J0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_REP_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtRPT_REP_NOMBRE_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_NOMBRE_Internalname, "Link", edtRPT_REP_NOMBRE_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_NOMBRE_Internalname,A844RPT_REP_NOMBRE,"","","'"+""+"'"+",false,"+"'"+""+"'",edtRPT_REP_NOMBRE_Link,"","","",edtRPT_REP_NOMBRE_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_DESCRIPCION_Internalname,A845RPT_REP_DESCRIPCION,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_REP_DESCRIPCION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RPT_REP_FORMATO_" + sGXsfl_84_idx ;
            cmbRPT_REP_FORMATO.setName( GXCCtl );
            cmbRPT_REP_FORMATO.setWebtags( "" );
            cmbRPT_REP_FORMATO.addItem("EXC", "EXCEL", (short)(0));
            cmbRPT_REP_FORMATO.addItem("PDF", "PDF", (short)(0));
            if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
            {
               A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
               n846RPT_REP_FORMATO = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRPT_REP_FORMATO,cmbRPT_REP_FORMATO.getInternalname(),GXutil.rtrim( A846RPT_REP_FORMATO),new Integer(1),cmbRPT_REP_FORMATO.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbRPT_REP_FORMATO.setValue( GXutil.rtrim( A846RPT_REP_FORMATO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_FORMATO.getInternalname(), "Values", cmbRPT_REP_FORMATO.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_NOMBRE"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_FORMATO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A846RPT_REP_FORMATO, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblrpt_rep_idfilter_Internalname = "LBLRPT_REP_IDFILTER" ;
      edtavCrpt_rep_id_Internalname = "vCRPT_REP_ID" ;
      divRpt_rep_idfiltercontainer_Internalname = "RPT_REP_IDFILTERCONTAINER" ;
      lblLblrpt_rep_nombrefilter_Internalname = "LBLRPT_REP_NOMBREFILTER" ;
      edtavCrpt_rep_nombre_Internalname = "vCRPT_REP_NOMBRE" ;
      divRpt_rep_nombrefiltercontainer_Internalname = "RPT_REP_NOMBREFILTERCONTAINER" ;
      lblLblrpt_rep_descripcionfilter_Internalname = "LBLRPT_REP_DESCRIPCIONFILTER" ;
      edtavCrpt_rep_descripcion_Internalname = "vCRPT_REP_DESCRIPCION" ;
      divRpt_rep_descripcionfiltercontainer_Internalname = "RPT_REP_DESCRIPCIONFILTERCONTAINER" ;
      lblLblrpt_rep_formatofilter_Internalname = "LBLRPT_REP_FORMATOFILTER" ;
      cmbavCrpt_rep_formato.setInternalname( "vCRPT_REP_FORMATO" );
      divRpt_rep_formatofiltercontainer_Internalname = "RPT_REP_FORMATOFILTERCONTAINER" ;
      lblLblrpt_rep_fecha_creacionfilter_Internalname = "LBLRPT_REP_FECHA_CREACIONFILTER" ;
      edtavCrpt_rep_fecha_creacion_Internalname = "vCRPT_REP_FECHA_CREACION" ;
      divRpt_rep_fecha_creacionfiltercontainer_Internalname = "RPT_REP_FECHA_CREACIONFILTERCONTAINER" ;
      lblLblrpt_rep_usuario_creacionfilter_Internalname = "LBLRPT_REP_USUARIO_CREACIONFILTER" ;
      edtavCrpt_rep_usuario_creacion_Internalname = "vCRPT_REP_USUARIO_CREACION" ;
      divRpt_rep_usuario_creacionfiltercontainer_Internalname = "RPT_REP_USUARIO_CREACIONFILTERCONTAINER" ;
      lblLblrpt_rep_fecha_modificafilter_Internalname = "LBLRPT_REP_FECHA_MODIFICAFILTER" ;
      edtavCrpt_rep_fecha_modifica_Internalname = "vCRPT_REP_FECHA_MODIFICA" ;
      divRpt_rep_fecha_modificafiltercontainer_Internalname = "RPT_REP_FECHA_MODIFICAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRPT_REP_ID_Internalname = "RPT_REP_ID" ;
      edtRPT_REP_NOMBRE_Internalname = "RPT_REP_NOMBRE" ;
      edtRPT_REP_DESCRIPCION_Internalname = "RPT_REP_DESCRIPCION" ;
      cmbRPT_REP_FORMATO.setInternalname( "RPT_REP_FORMATO" );
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
      cmbRPT_REP_FORMATO.setJsonclick( "" );
      edtRPT_REP_DESCRIPCION_Jsonclick = "" ;
      edtRPT_REP_NOMBRE_Jsonclick = "" ;
      edtRPT_REP_ID_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtRPT_REP_NOMBRE_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCrpt_rep_fecha_modifica_Jsonclick = "" ;
      edtavCrpt_rep_fecha_modifica_Enabled = 1 ;
      edtavCrpt_rep_usuario_creacion_Jsonclick = "" ;
      edtavCrpt_rep_usuario_creacion_Enabled = 1 ;
      edtavCrpt_rep_usuario_creacion_Visible = 1 ;
      edtavCrpt_rep_fecha_creacion_Jsonclick = "" ;
      edtavCrpt_rep_fecha_creacion_Enabled = 1 ;
      cmbavCrpt_rep_formato.setJsonclick( "" );
      cmbavCrpt_rep_formato.setEnabled( 1 );
      cmbavCrpt_rep_formato.setVisible( 1 );
      edtavCrpt_rep_descripcion_Jsonclick = "" ;
      edtavCrpt_rep_descripcion_Enabled = 1 ;
      edtavCrpt_rep_descripcion_Visible = 1 ;
      edtavCrpt_rep_nombre_Jsonclick = "" ;
      edtavCrpt_rep_nombre_Enabled = 1 ;
      edtavCrpt_rep_nombre_Visible = 1 ;
      edtavCrpt_rep_id_Jsonclick = "" ;
      edtavCrpt_rep_id_Enabled = 1 ;
      edtavCrpt_rep_id_Visible = 1 ;
      divRpt_rep_fecha_modificafiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_usuario_creacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_fecha_creacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_formatofiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_nombrefiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List REPORTES" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_REP_ID',fld:'vCRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_NOMBRE',fld:'vCRPT_REP_NOMBRE',pic:'',nv:''},{av:'AV8cRPT_REP_DESCRIPCION',fld:'vCRPT_REP_DESCRIPCION',pic:'',nv:''},{av:'cmbavCrpt_rep_formato'},{av:'AV9cRPT_REP_FORMATO',fld:'vCRPT_REP_FORMATO',pic:'',nv:''},{av:'AV10cRPT_REP_FECHA_CREACION',fld:'vCRPT_REP_FECHA_CREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cRPT_REP_USUARIO_CREACION',fld:'vCRPT_REP_USUARIO_CREACION',pic:'@!',nv:''},{av:'AV12cRPT_REP_FECHA_MODIFICA',fld:'vCRPT_REP_FECHA_MODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e189J1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLRPT_REP_IDFILTER.CLICK","{handler:'e119J1',iparms:[{av:'divRpt_rep_idfiltercontainer_Class',ctrl:'RPT_REP_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_idfiltercontainer_Class',ctrl:'RPT_REP_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_rep_id_Visible',ctrl:'vCRPT_REP_ID',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_NOMBREFILTER.CLICK","{handler:'e129J1',iparms:[{av:'divRpt_rep_nombrefiltercontainer_Class',ctrl:'RPT_REP_NOMBREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_nombrefiltercontainer_Class',ctrl:'RPT_REP_NOMBREFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_rep_nombre_Visible',ctrl:'vCRPT_REP_NOMBRE',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_DESCRIPCIONFILTER.CLICK","{handler:'e139J1',iparms:[{av:'divRpt_rep_descripcionfiltercontainer_Class',ctrl:'RPT_REP_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_descripcionfiltercontainer_Class',ctrl:'RPT_REP_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_rep_descripcion_Visible',ctrl:'vCRPT_REP_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_FORMATOFILTER.CLICK","{handler:'e149J1',iparms:[{av:'divRpt_rep_formatofiltercontainer_Class',ctrl:'RPT_REP_FORMATOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_formatofiltercontainer_Class',ctrl:'RPT_REP_FORMATOFILTERCONTAINER',prop:'Class'},{av:'cmbavCrpt_rep_formato'}]}");
      setEventMetadata("LBLRPT_REP_FECHA_CREACIONFILTER.CLICK","{handler:'e159J1',iparms:[{av:'divRpt_rep_fecha_creacionfiltercontainer_Class',ctrl:'RPT_REP_FECHA_CREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_fecha_creacionfiltercontainer_Class',ctrl:'RPT_REP_FECHA_CREACIONFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLRPT_REP_USUARIO_CREACIONFILTER.CLICK","{handler:'e169J1',iparms:[{av:'divRpt_rep_usuario_creacionfiltercontainer_Class',ctrl:'RPT_REP_USUARIO_CREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_usuario_creacionfiltercontainer_Class',ctrl:'RPT_REP_USUARIO_CREACIONFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_rep_usuario_creacion_Visible',ctrl:'vCRPT_REP_USUARIO_CREACION',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_FECHA_MODIFICAFILTER.CLICK","{handler:'e179J1',iparms:[{av:'divRpt_rep_fecha_modificafiltercontainer_Class',ctrl:'RPT_REP_FECHA_MODIFICAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_fecha_modificafiltercontainer_Class',ctrl:'RPT_REP_FECHA_MODIFICAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e219J2',iparms:[{av:'A843RPT_REP_ID',fld:'RPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_REP_ID',fld:'vCRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_NOMBRE',fld:'vCRPT_REP_NOMBRE',pic:'',nv:''},{av:'AV8cRPT_REP_DESCRIPCION',fld:'vCRPT_REP_DESCRIPCION',pic:'',nv:''},{av:'cmbavCrpt_rep_formato'},{av:'AV9cRPT_REP_FORMATO',fld:'vCRPT_REP_FORMATO',pic:'',nv:''},{av:'AV10cRPT_REP_FECHA_CREACION',fld:'vCRPT_REP_FECHA_CREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cRPT_REP_USUARIO_CREACION',fld:'vCRPT_REP_USUARIO_CREACION',pic:'@!',nv:''},{av:'AV12cRPT_REP_FECHA_MODIFICA',fld:'vCRPT_REP_FECHA_MODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_REP_ID',fld:'vCRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_NOMBRE',fld:'vCRPT_REP_NOMBRE',pic:'',nv:''},{av:'AV8cRPT_REP_DESCRIPCION',fld:'vCRPT_REP_DESCRIPCION',pic:'',nv:''},{av:'cmbavCrpt_rep_formato'},{av:'AV9cRPT_REP_FORMATO',fld:'vCRPT_REP_FORMATO',pic:'',nv:''},{av:'AV10cRPT_REP_FECHA_CREACION',fld:'vCRPT_REP_FECHA_CREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cRPT_REP_USUARIO_CREACION',fld:'vCRPT_REP_USUARIO_CREACION',pic:'@!',nv:''},{av:'AV12cRPT_REP_FECHA_MODIFICA',fld:'vCRPT_REP_FECHA_MODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_REP_ID',fld:'vCRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_NOMBRE',fld:'vCRPT_REP_NOMBRE',pic:'',nv:''},{av:'AV8cRPT_REP_DESCRIPCION',fld:'vCRPT_REP_DESCRIPCION',pic:'',nv:''},{av:'cmbavCrpt_rep_formato'},{av:'AV9cRPT_REP_FORMATO',fld:'vCRPT_REP_FORMATO',pic:'',nv:''},{av:'AV10cRPT_REP_FECHA_CREACION',fld:'vCRPT_REP_FECHA_CREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cRPT_REP_USUARIO_CREACION',fld:'vCRPT_REP_USUARIO_CREACION',pic:'@!',nv:''},{av:'AV12cRPT_REP_FECHA_MODIFICA',fld:'vCRPT_REP_FECHA_MODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_REP_ID',fld:'vCRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_NOMBRE',fld:'vCRPT_REP_NOMBRE',pic:'',nv:''},{av:'AV8cRPT_REP_DESCRIPCION',fld:'vCRPT_REP_DESCRIPCION',pic:'',nv:''},{av:'cmbavCrpt_rep_formato'},{av:'AV9cRPT_REP_FORMATO',fld:'vCRPT_REP_FORMATO',pic:'',nv:''},{av:'AV10cRPT_REP_FECHA_CREACION',fld:'vCRPT_REP_FECHA_CREACION',pic:'99/99/99 99:99',nv:''},{av:'AV11cRPT_REP_USUARIO_CREACION',fld:'vCRPT_REP_USUARIO_CREACION',pic:'@!',nv:''},{av:'AV12cRPT_REP_FECHA_MODIFICA',fld:'vCRPT_REP_FECHA_MODIFICA',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV7cRPT_REP_NOMBRE = "" ;
      AV8cRPT_REP_DESCRIPCION = "" ;
      AV9cRPT_REP_FORMATO = "" ;
      AV10cRPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      AV11cRPT_REP_USUARIO_CREACION = "" ;
      AV12cRPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblrpt_rep_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblrpt_rep_nombrefilter_Jsonclick = "" ;
      lblLblrpt_rep_descripcionfilter_Jsonclick = "" ;
      lblLblrpt_rep_formatofilter_Jsonclick = "" ;
      lblLblrpt_rep_fecha_creacionfilter_Jsonclick = "" ;
      lblLblrpt_rep_usuario_creacionfilter_Jsonclick = "" ;
      lblLblrpt_rep_fecha_modificafilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A844RPT_REP_NOMBRE = "" ;
      A845RPT_REP_DESCRIPCION = "" ;
      A846RPT_REP_FORMATO = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cRPT_REP_NOMBRE = "" ;
      lV8cRPT_REP_DESCRIPCION = "" ;
      lV9cRPT_REP_FORMATO = "" ;
      lV11cRPT_REP_USUARIO_CREACION = "" ;
      A847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      A848RPT_REP_USUARIO_CREACION = "" ;
      A849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      H009J2_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      H009J2_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      H009J2_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      H009J2_n848RPT_REP_USUARIO_CREACION = new boolean[] {false} ;
      H009J2_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      H009J2_n847RPT_REP_FECHA_CREACION = new boolean[] {false} ;
      H009J2_A846RPT_REP_FORMATO = new String[] {""} ;
      H009J2_n846RPT_REP_FORMATO = new boolean[] {false} ;
      H009J2_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      H009J2_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      H009J2_A844RPT_REP_NOMBRE = new String[] {""} ;
      H009J2_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      H009J2_A843RPT_REP_ID = new short[1] ;
      H009J3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01t0__default(),
         new Object[] {
             new Object[] {
            H009J2_A849RPT_REP_FECHA_MODIFICA, H009J2_n849RPT_REP_FECHA_MODIFICA, H009J2_A848RPT_REP_USUARIO_CREACION, H009J2_n848RPT_REP_USUARIO_CREACION, H009J2_A847RPT_REP_FECHA_CREACION, H009J2_n847RPT_REP_FECHA_CREACION, H009J2_A846RPT_REP_FORMATO, H009J2_n846RPT_REP_FORMATO, H009J2_A845RPT_REP_DESCRIPCION, H009J2_n845RPT_REP_DESCRIPCION,
            H009J2_A844RPT_REP_NOMBRE, H009J2_n844RPT_REP_NOMBRE, H009J2_A843RPT_REP_ID
            }
            , new Object[] {
            H009J3_AGRID1_nRecordCount
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
   private short AV6cRPT_REP_ID ;
   private short AV13pRPT_REP_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short A843RPT_REP_ID ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCrpt_rep_id_Enabled ;
   private int edtavCrpt_rep_id_Visible ;
   private int edtavCrpt_rep_nombre_Visible ;
   private int edtavCrpt_rep_nombre_Enabled ;
   private int edtavCrpt_rep_descripcion_Visible ;
   private int edtavCrpt_rep_descripcion_Enabled ;
   private int edtavCrpt_rep_fecha_creacion_Enabled ;
   private int edtavCrpt_rep_usuario_creacion_Visible ;
   private int edtavCrpt_rep_usuario_creacion_Enabled ;
   private int edtavCrpt_rep_fecha_modifica_Enabled ;
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
   private String divRpt_rep_idfiltercontainer_Class ;
   private String divRpt_rep_nombrefiltercontainer_Class ;
   private String divRpt_rep_descripcionfiltercontainer_Class ;
   private String divRpt_rep_formatofiltercontainer_Class ;
   private String divRpt_rep_fecha_creacionfiltercontainer_Class ;
   private String divRpt_rep_usuario_creacionfiltercontainer_Class ;
   private String divRpt_rep_fecha_modificafiltercontainer_Class ;
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
   private String divRpt_rep_idfiltercontainer_Internalname ;
   private String lblLblrpt_rep_idfilter_Internalname ;
   private String lblLblrpt_rep_idfilter_Jsonclick ;
   private String edtavCrpt_rep_id_Internalname ;
   private String TempTags ;
   private String edtavCrpt_rep_id_Jsonclick ;
   private String divRpt_rep_nombrefiltercontainer_Internalname ;
   private String lblLblrpt_rep_nombrefilter_Internalname ;
   private String lblLblrpt_rep_nombrefilter_Jsonclick ;
   private String edtavCrpt_rep_nombre_Internalname ;
   private String edtavCrpt_rep_nombre_Jsonclick ;
   private String divRpt_rep_descripcionfiltercontainer_Internalname ;
   private String lblLblrpt_rep_descripcionfilter_Internalname ;
   private String lblLblrpt_rep_descripcionfilter_Jsonclick ;
   private String edtavCrpt_rep_descripcion_Internalname ;
   private String edtavCrpt_rep_descripcion_Jsonclick ;
   private String divRpt_rep_formatofiltercontainer_Internalname ;
   private String lblLblrpt_rep_formatofilter_Internalname ;
   private String lblLblrpt_rep_formatofilter_Jsonclick ;
   private String divRpt_rep_fecha_creacionfiltercontainer_Internalname ;
   private String lblLblrpt_rep_fecha_creacionfilter_Internalname ;
   private String lblLblrpt_rep_fecha_creacionfilter_Jsonclick ;
   private String edtavCrpt_rep_fecha_creacion_Internalname ;
   private String edtavCrpt_rep_fecha_creacion_Jsonclick ;
   private String divRpt_rep_usuario_creacionfiltercontainer_Internalname ;
   private String lblLblrpt_rep_usuario_creacionfilter_Internalname ;
   private String lblLblrpt_rep_usuario_creacionfilter_Jsonclick ;
   private String edtavCrpt_rep_usuario_creacion_Internalname ;
   private String edtavCrpt_rep_usuario_creacion_Jsonclick ;
   private String divRpt_rep_fecha_modificafiltercontainer_Internalname ;
   private String lblLblrpt_rep_fecha_modificafilter_Internalname ;
   private String lblLblrpt_rep_fecha_modificafilter_Jsonclick ;
   private String edtavCrpt_rep_fecha_modifica_Internalname ;
   private String edtavCrpt_rep_fecha_modifica_Jsonclick ;
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
   private String edtRPT_REP_NOMBRE_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRPT_REP_ID_Internalname ;
   private String edtRPT_REP_NOMBRE_Internalname ;
   private String edtRPT_REP_DESCRIPCION_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRPT_REP_ID_Jsonclick ;
   private String edtRPT_REP_NOMBRE_Jsonclick ;
   private String edtRPT_REP_DESCRIPCION_Jsonclick ;
   private java.util.Date AV10cRPT_REP_FECHA_CREACION ;
   private java.util.Date AV12cRPT_REP_FECHA_MODIFICA ;
   private java.util.Date A847RPT_REP_FECHA_CREACION ;
   private java.util.Date A849RPT_REP_FECHA_MODIFICA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n844RPT_REP_NOMBRE ;
   private boolean n845RPT_REP_DESCRIPCION ;
   private boolean n846RPT_REP_FORMATO ;
   private boolean n849RPT_REP_FECHA_MODIFICA ;
   private boolean n848RPT_REP_USUARIO_CREACION ;
   private boolean n847RPT_REP_FECHA_CREACION ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cRPT_REP_NOMBRE ;
   private String AV8cRPT_REP_DESCRIPCION ;
   private String AV9cRPT_REP_FORMATO ;
   private String AV11cRPT_REP_USUARIO_CREACION ;
   private String A844RPT_REP_NOMBRE ;
   private String A845RPT_REP_DESCRIPCION ;
   private String A846RPT_REP_FORMATO ;
   private String AV17Linkselection_GXI ;
   private String lV7cRPT_REP_NOMBRE ;
   private String lV8cRPT_REP_DESCRIPCION ;
   private String lV9cRPT_REP_FORMATO ;
   private String lV11cRPT_REP_USUARIO_CREACION ;
   private String A848RPT_REP_USUARIO_CREACION ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCrpt_rep_formato ;
   private HTMLChoice cmbRPT_REP_FORMATO ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H009J2_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] H009J2_n849RPT_REP_FECHA_MODIFICA ;
   private String[] H009J2_A848RPT_REP_USUARIO_CREACION ;
   private boolean[] H009J2_n848RPT_REP_USUARIO_CREACION ;
   private java.util.Date[] H009J2_A847RPT_REP_FECHA_CREACION ;
   private boolean[] H009J2_n847RPT_REP_FECHA_CREACION ;
   private String[] H009J2_A846RPT_REP_FORMATO ;
   private boolean[] H009J2_n846RPT_REP_FORMATO ;
   private String[] H009J2_A845RPT_REP_DESCRIPCION ;
   private boolean[] H009J2_n845RPT_REP_DESCRIPCION ;
   private String[] H009J2_A844RPT_REP_NOMBRE ;
   private boolean[] H009J2_n844RPT_REP_NOMBRE ;
   private short[] H009J2_A843RPT_REP_ID ;
   private long[] H009J3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01t0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H009J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cRPT_REP_NOMBRE ,
                                          String AV8cRPT_REP_DESCRIPCION ,
                                          String AV9cRPT_REP_FORMATO ,
                                          java.util.Date AV10cRPT_REP_FECHA_CREACION ,
                                          String AV11cRPT_REP_USUARIO_CREACION ,
                                          java.util.Date AV12cRPT_REP_FECHA_MODIFICA ,
                                          String A844RPT_REP_NOMBRE ,
                                          String A845RPT_REP_DESCRIPCION ,
                                          String A846RPT_REP_FORMATO ,
                                          java.util.Date A847RPT_REP_FECHA_CREACION ,
                                          String A848RPT_REP_USUARIO_CREACION ,
                                          java.util.Date A849RPT_REP_FECHA_MODIFICA ,
                                          short AV6cRPT_REP_ID )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ RPT_REP_FECHA_MODIFICA, RPT_REP_USUARIO_CREACION, RPT_REP_FECHA_CREACION," ;
      sSelectString = sSelectString + " RPT_REP_FORMATO, RPT_REP_DESCRIPCION, RPT_REP_NOMBRE, RPT_REP_ID" ;
      sFromString = " FROM RPT_REPORTE" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (RPT_REP_ID >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cRPT_REP_NOMBRE)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_NOMBRE like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRPT_REP_DESCRIPCION)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_DESCRIPCION like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRPT_REP_FORMATO)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FORMATO like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRPT_REP_FECHA_CREACION) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FECHA_CREACION >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRPT_REP_USUARIO_CREACION)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_USUARIO_CREACION like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cRPT_REP_FECHA_MODIFICA) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FECHA_MODIFICA >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY RPT_REP_ID" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H009J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cRPT_REP_NOMBRE ,
                                          String AV8cRPT_REP_DESCRIPCION ,
                                          String AV9cRPT_REP_FORMATO ,
                                          java.util.Date AV10cRPT_REP_FECHA_CREACION ,
                                          String AV11cRPT_REP_USUARIO_CREACION ,
                                          java.util.Date AV12cRPT_REP_FECHA_MODIFICA ,
                                          String A844RPT_REP_NOMBRE ,
                                          String A845RPT_REP_DESCRIPCION ,
                                          String A846RPT_REP_FORMATO ,
                                          java.util.Date A847RPT_REP_FECHA_CREACION ,
                                          String A848RPT_REP_USUARIO_CREACION ,
                                          java.util.Date A849RPT_REP_FECHA_MODIFICA ,
                                          short AV6cRPT_REP_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM RPT_REPORTE" ;
      scmdbuf = scmdbuf + " WHERE (RPT_REP_ID >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cRPT_REP_NOMBRE)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_NOMBRE like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRPT_REP_DESCRIPCION)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_DESCRIPCION like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRPT_REP_FORMATO)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FORMATO like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV10cRPT_REP_FECHA_CREACION) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FECHA_CREACION >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRPT_REP_USUARIO_CREACION)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_USUARIO_CREACION like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cRPT_REP_FECHA_MODIFICA) )
      {
         sWhereString = sWhereString + " and (RPT_REP_FECHA_MODIFICA >= ?)" ;
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
                  return conditional_H009J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() );
            case 1 :
                  return conditional_H009J3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H009J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
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
                  stmt.setVarchar(sIdx, (String)parms[12], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 3);
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

