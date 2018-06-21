/*
               File: wpalm_ratificacion_impl
        Description: Ratificación
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:59.82
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

public final  class wpalm_ratificacion_impl extends GXDataArea
{
   public wpalm_ratificacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpalm_ratificacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpalm_ratificacion_impl.class ));
   }

   public wpalm_ratificacion_impl( int remoteHandle ,
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
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( A46Tran_Id) ;
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
            A46Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
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
      pa792( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start792( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414215986");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpalm_ratificacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV8Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we792( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt792( ) ;
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
      return formatLink("com.orions2.wpalm_ratificacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPALM_RATIFICACION" ;
   }

   public String getPgmdesc( )
   {
      return "Ratificación" ;
   }

   public void wb790( )
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Ratificación", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavToday_Internalname, "Today", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavToday_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavToday_Internalname, localUtil.format(Gx_date, "99/99/99"), localUtil.format( Gx_date, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavToday_Jsonclick, 0, "Attribute", "", "", "", edtavToday_Visible, edtavToday_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavToday_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavToday_Visible==0)||(edtavToday_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_RATIFICACION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRegistro_Internalname, "Fecha de registro", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRegistro_Internalname, localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_RATIFICACION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioCodigo_Internalname, "Usuario", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioCodigo_Internalname, A417Tran_UsuarioCodigo, GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioCodigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigo_Internalname, "Código región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionDescripcion_Internalname, "Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcion_Internalname, A422Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( A422Tran_RegionDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigo_Internalname, "Código C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigo_Internalname, A419Tran_CentroCostoCodigo, GXutil.rtrim( localUtil.format( A419Tran_CentroCostoCodigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoDescripcion_Internalname, "Centro de costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcion_Internalname, A420Tran_CentroCostoDescripcion, GXutil.rtrim( localUtil.format( A420Tran_CentroCostoDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Código del movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtTran_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_DescripcionMovimiento_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_DescripcionMovimiento_Internalname, A381Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( A381Tran_DescripcionMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_DescripcionMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_DescripcionMovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaOrigen_Internalname, "Almacén orígen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaOrigen_Internalname, A109Tran_CodAlmaOrigen, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodAlmaOrigen_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeOrigen_Internalname, "Bodega orígen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeOrigen_Internalname, A112Tran_CodBodeOrigen, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodBodeOrigen_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaDestino_Internalname, "Almacén destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaDestino_Internalname, A111Tran_CodAlmaDestino, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodAlmaDestino_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeDestino_Internalname, "Bodega destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeDestino_Internalname, A387Tran_CodBodeDestino, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodBodeDestino_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ValorTransaccion_Internalname, "Valor Transaccion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ValorTransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtTran_ValorTransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ValorTransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ValorTransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_Observaciones_Internalname, A416Tran_Observaciones, "", "", (short)(0), 1, edtTran_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Número Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Es placa padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Total") ;
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
            Grid1Container.AddObjectProperty("Class", "WorkWith");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A298Cata_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A490TDet_PlacaNumero);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A505TDet_EsPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A491TDet_PlacaPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Confirmar", bttButton1_Jsonclick, 7, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11791_client"+"'", TempTags, "", 2, "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttButton2_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_RATIFICACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start792( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Ratificación", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup790( ) ;
   }

   public void ws792( )
   {
      start792( ) ;
      evt792( ) ;
   }

   public void evt792( )
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
                        else if ( GXutil.strcmp(sEvt, "ALERTIFY1.OK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12792 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A490TDet_PlacaNumero = httpContext.cgiGet( edtTDet_PlacaNumero_Internalname) ;
                           n490TDet_PlacaNumero = false ;
                           A505TDet_EsPadre = httpContext.cgiGet( edtTDet_EsPadre_Internalname) ;
                           A491TDet_PlacaPadre = httpContext.cgiGet( edtTDet_PlacaPadre_Internalname) ;
                           n491TDet_PlacaPadre = false ;
                           A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
                           A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
                           A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13792 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14792 ();
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

   public void we792( )
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

   public void pa792( )
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

   public void gxgrgrid1_refresh( long A46Tran_Id )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf792( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CONSECUTIVO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACANUMERO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ESPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO", getSecureSignedToken( "", localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL", getSecureSignedToken( "", localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf792( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
   }

   public void rf792( )
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
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_742( ) ;
         /* Using cursor H00792 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A37Cata_Codigo = H00792_A37Cata_Codigo[0] ;
            A489TDet_ValorTotal = H00792_A489TDet_ValorTotal[0] ;
            A488TDet_ValorUnitario = H00792_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H00792_A487TDet_Cantidad[0] ;
            A491TDet_PlacaPadre = H00792_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = H00792_n491TDet_PlacaPadre[0] ;
            A505TDet_EsPadre = H00792_A505TDet_EsPadre[0] ;
            A490TDet_PlacaNumero = H00792_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H00792_n490TDet_PlacaNumero[0] ;
            A298Cata_Descripcion = H00792_A298Cata_Descripcion[0] ;
            A66Elem_Consecutivo = H00792_A66Elem_Consecutivo[0] ;
            A69TDet_Consecutivo = H00792_A69TDet_Consecutivo[0] ;
            A37Cata_Codigo = H00792_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H00792_A298Cata_Descripcion[0] ;
            /* Execute user event: Load */
            e14792 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb790( ) ;
      }
      bGXsfl_74_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup790( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      /* Using cursor H00793 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
      A416Tran_Observaciones = H00793_A416Tran_Observaciones[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
      n416Tran_Observaciones = H00793_n416Tran_Observaciones[0] ;
      A47Tran_UsuarioId = H00793_A47Tran_UsuarioId[0] ;
      n47Tran_UsuarioId = H00793_n47Tran_UsuarioId[0] ;
      A48Tran_CentroCostoId = H00793_A48Tran_CentroCostoId[0] ;
      A57Tran_RegionId = H00793_A57Tran_RegionId[0] ;
      n57Tran_RegionId = H00793_n57Tran_RegionId[0] ;
      A55Tran_FechaRegistro = H00793_A55Tran_FechaRegistro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      A49Tran_CodigoMovimiento = H00793_A49Tran_CodigoMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      A109Tran_CodAlmaOrigen = H00793_A109Tran_CodAlmaOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
      A112Tran_CodBodeOrigen = H00793_A112Tran_CodBodeOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
      A111Tran_CodAlmaDestino = H00793_A111Tran_CodAlmaDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
      A387Tran_CodBodeDestino = H00793_A387Tran_CodBodeDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
      A483Tran_ValorTransaccion = H00793_A483Tran_ValorTransaccion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
      n483Tran_ValorTransaccion = H00793_n483Tran_ValorTransaccion[0] ;
      pr_default.close(1);
      /* Using cursor H00794 */
      pr_default.execute(2, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
      A417Tran_UsuarioCodigo = H00794_A417Tran_UsuarioCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
      n417Tran_UsuarioCodigo = H00794_n417Tran_UsuarioCodigo[0] ;
      pr_default.close(2);
      /* Using cursor H00795 */
      pr_default.execute(3, new Object[] {new Long(A48Tran_CentroCostoId)});
      A419Tran_CentroCostoCodigo = H00795_A419Tran_CentroCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
      n419Tran_CentroCostoCodigo = H00795_n419Tran_CentroCostoCodigo[0] ;
      A420Tran_CentroCostoDescripcion = H00795_A420Tran_CentroCostoDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
      n420Tran_CentroCostoDescripcion = H00795_n420Tran_CentroCostoDescripcion[0] ;
      pr_default.close(3);
      /* Using cursor H00796 */
      pr_default.execute(4, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
      A421Tran_RegionCodigo = H00796_A421Tran_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
      n421Tran_RegionCodigo = H00796_n421Tran_RegionCodigo[0] ;
      A422Tran_RegionDescripcion = H00796_A422Tran_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
      n422Tran_RegionDescripcion = H00796_n422Tran_RegionDescripcion[0] ;
      pr_default.close(4);
      /* Using cursor H00797 */
      pr_default.execute(5, new Object[] {A49Tran_CodigoMovimiento});
      A381Tran_DescripcionMovimiento = H00797_A381Tran_DescripcionMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
      n381Tran_DescripcionMovimiento = H00797_n381Tran_DescripcionMovimiento[0] ;
      pr_default.close(5);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13792 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         Gx_date = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavToday_Internalname), 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
         A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
         n417Tran_UsuarioCodigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         A421Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigo_Internalname), ",", ".")) ;
         n421Tran_RegionCodigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
         A422Tran_RegionDescripcion = httpContext.cgiGet( edtTran_RegionDescripcion_Internalname) ;
         n422Tran_RegionDescripcion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
         A419Tran_CentroCostoCodigo = httpContext.cgiGet( edtTran_CentroCostoCodigo_Internalname) ;
         n419Tran_CentroCostoCodigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
         A420Tran_CentroCostoDescripcion = httpContext.cgiGet( edtTran_CentroCostoDescripcion_Internalname) ;
         n420Tran_CentroCostoDescripcion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
         A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         A381Tran_DescripcionMovimiento = httpContext.cgiGet( edtTran_DescripcionMovimiento_Internalname) ;
         n381Tran_DescripcionMovimiento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         A109Tran_CodAlmaOrigen = httpContext.cgiGet( edtTran_CodAlmaOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
         A112Tran_CodBodeOrigen = httpContext.cgiGet( edtTran_CodBodeOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
         A111Tran_CodAlmaDestino = httpContext.cgiGet( edtTran_CodAlmaDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
         A387Tran_CodBodeDestino = httpContext.cgiGet( edtTran_CodBodeDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
         A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
         n483Tran_ValorTransaccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
         A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
         n416Tran_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e13792 ();
      if (returnInSub) return;
   }

   public void e13792( )
   {
      /* Start Routine */
      Form.setCaption( "Ratificación" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      edtavToday_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavToday_Visible, 5, 0)), true);
      AV8Usuario = AV10Websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usuario", AV8Usuario);
      AV5Tran_Id = A46Tran_Id ;
   }

   public void e12792( )
   {
      /* Alertify1_Ok Routine */
      GXv_int1[0] = A46Tran_Id ;
      GXv_char2[0] = AV8Usuario ;
      new com.orions2.ratificarsalida(remoteHandle, context).execute( GXv_int1, GXv_char2) ;
      wpalm_ratificacion_impl.this.A46Tran_Id = GXv_int1[0] ;
      wpalm_ratificacion_impl.this.AV8Usuario = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usuario", AV8Usuario);
      httpContext.setWebReturnParms(new Object[] {new Long(A46Tran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e14792( )
   {
      /* Load Routine */
      sendrow_742( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
      {
         httpContext.doAjaxLoad(74, Grid1Row);
      }
   }

   public void setparameters( Object[] obj )
   {
      A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
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
      pa792( ) ;
      ws792( ) ;
      we792( ) ;
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
      httpContext.AddStyleSheetFile("Alertify/css/alertify.core.css", "?1126220");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.default.css", "?11295124");
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141422125");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpalm_ratificacion.js", "?20186141422125");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_74_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_74_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_74_idx ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO_"+sGXsfl_74_idx ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE_"+sGXsfl_74_idx ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE_"+sGXsfl_74_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_74_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_74_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_74_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_74_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_74_fel_idx ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO_"+sGXsfl_74_fel_idx ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE_"+sGXsfl_74_fel_idx ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE_"+sGXsfl_74_fel_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_74_fel_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_74_fel_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb790( ) ;
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
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaNumero_Internalname,A490TDet_PlacaNumero,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_EsPadre_Internalname,A505TDet_EsPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_EsPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaPadre_Internalname,A491TDet_PlacaPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Cantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorUnitario_Internalname,GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorUnitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorTotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CONSECUTIVO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACANUMERO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_ESPADRE"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACAPADRE"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavToday_Internalname = "vTODAY" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO" ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO" ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION" ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO" ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO" ;
      edtTran_CodAlmaOrigen_Internalname = "TRAN_CODALMAORIGEN" ;
      edtTran_CodBodeOrigen_Internalname = "TRAN_CODBODEORIGEN" ;
      edtTran_CodAlmaDestino_Internalname = "TRAN_CODALMADESTINO" ;
      edtTran_CodBodeDestino_Internalname = "TRAN_CODBODEDESTINO" ;
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION" ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES" ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO" ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE" ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE" ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO" ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL" ;
      divTable1_Internalname = "TABLE1" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtTDet_PlacaPadre_Jsonclick = "" ;
      edtTDet_EsPadre_Jsonclick = "" ;
      edtTDet_PlacaNumero_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtTran_Observaciones_Enabled = 0 ;
      edtTran_ValorTransaccion_Jsonclick = "" ;
      edtTran_ValorTransaccion_Enabled = 0 ;
      edtTran_CodBodeDestino_Jsonclick = "" ;
      edtTran_CodBodeDestino_Enabled = 0 ;
      edtTran_CodAlmaDestino_Jsonclick = "" ;
      edtTran_CodAlmaDestino_Enabled = 0 ;
      edtTran_CodBodeOrigen_Jsonclick = "" ;
      edtTran_CodBodeOrigen_Enabled = 0 ;
      edtTran_CodAlmaOrigen_Jsonclick = "" ;
      edtTran_CodAlmaOrigen_Enabled = 0 ;
      edtTran_DescripcionMovimiento_Jsonclick = "" ;
      edtTran_DescripcionMovimiento_Enabled = 0 ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Enabled = 0 ;
      edtTran_CentroCostoDescripcion_Jsonclick = "" ;
      edtTran_CentroCostoDescripcion_Enabled = 0 ;
      edtTran_CentroCostoCodigo_Jsonclick = "" ;
      edtTran_CentroCostoCodigo_Enabled = 0 ;
      edtTran_RegionDescripcion_Jsonclick = "" ;
      edtTran_RegionDescripcion_Enabled = 0 ;
      edtTran_RegionCodigo_Jsonclick = "" ;
      edtTran_RegionCodigo_Enabled = 0 ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Enabled = 0 ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_FechaRegistro_Enabled = 0 ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      edtavToday_Jsonclick = "" ;
      edtavToday_Enabled = 0 ;
      edtavToday_Visible = 1 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Ratificación" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e11791',iparms:[],oparms:[{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e12792',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Usuario',fld:'vUSUARIO',pic:'@!',nv:''}],oparms:[{av:'AV8Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
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
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8Usuario = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Gx_date = GXutil.nullDate() ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A417Tran_UsuarioCodigo = "" ;
      A422Tran_RegionDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A416Tran_Observaciones = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      A490TDet_PlacaNumero = "" ;
      A505TDet_EsPadre = "" ;
      A491TDet_PlacaPadre = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00792_A416Tran_Observaciones = new String[] {""} ;
      H00792_n416Tran_Observaciones = new boolean[] {false} ;
      H00792_A37Cata_Codigo = new String[] {""} ;
      H00792_A47Tran_UsuarioId = new long[1] ;
      H00792_n47Tran_UsuarioId = new boolean[] {false} ;
      H00792_A48Tran_CentroCostoId = new long[1] ;
      H00792_A57Tran_RegionId = new long[1] ;
      H00792_n57Tran_RegionId = new boolean[] {false} ;
      H00792_A46Tran_Id = new long[1] ;
      H00792_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00792_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00792_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00792_A421Tran_RegionCodigo = new short[1] ;
      H00792_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00792_A422Tran_RegionDescripcion = new String[] {""} ;
      H00792_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00792_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H00792_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H00792_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H00792_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H00792_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00792_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H00792_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H00792_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00792_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00792_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00792_A387Tran_CodBodeDestino = new String[] {""} ;
      H00792_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00792_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H00792_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00792_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00792_A487TDet_Cantidad = new long[1] ;
      H00792_A491TDet_PlacaPadre = new String[] {""} ;
      H00792_n491TDet_PlacaPadre = new boolean[] {false} ;
      H00792_A505TDet_EsPadre = new String[] {""} ;
      H00792_A490TDet_PlacaNumero = new String[] {""} ;
      H00792_n490TDet_PlacaNumero = new boolean[] {false} ;
      H00792_A298Cata_Descripcion = new String[] {""} ;
      H00792_A66Elem_Consecutivo = new String[] {""} ;
      H00792_A69TDet_Consecutivo = new long[1] ;
      A37Cata_Codigo = "" ;
      H00793_A416Tran_Observaciones = new String[] {""} ;
      H00793_n416Tran_Observaciones = new boolean[] {false} ;
      H00793_A47Tran_UsuarioId = new long[1] ;
      H00793_n47Tran_UsuarioId = new boolean[] {false} ;
      H00793_A48Tran_CentroCostoId = new long[1] ;
      H00793_A57Tran_RegionId = new long[1] ;
      H00793_n57Tran_RegionId = new boolean[] {false} ;
      H00793_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00793_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00793_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00793_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00793_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00793_A387Tran_CodBodeDestino = new String[] {""} ;
      H00793_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00793_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H00794_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00794_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00795_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H00795_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H00795_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H00795_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H00796_A421Tran_RegionCodigo = new short[1] ;
      H00796_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00796_A422Tran_RegionDescripcion = new String[] {""} ;
      H00796_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00797_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H00797_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      AV10Websession = httpContext.getWebSession();
      GXv_int1 = new long [1] ;
      GXv_char2 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpalm_ratificacion__default(),
         new Object[] {
             new Object[] {
            H00792_A416Tran_Observaciones, H00792_n416Tran_Observaciones, H00792_A37Cata_Codigo, H00792_A47Tran_UsuarioId, H00792_n47Tran_UsuarioId, H00792_A48Tran_CentroCostoId, H00792_A57Tran_RegionId, H00792_n57Tran_RegionId, H00792_A46Tran_Id, H00792_A55Tran_FechaRegistro,
            H00792_A417Tran_UsuarioCodigo, H00792_n417Tran_UsuarioCodigo, H00792_A421Tran_RegionCodigo, H00792_n421Tran_RegionCodigo, H00792_A422Tran_RegionDescripcion, H00792_n422Tran_RegionDescripcion, H00792_A419Tran_CentroCostoCodigo, H00792_n419Tran_CentroCostoCodigo, H00792_A420Tran_CentroCostoDescripcion, H00792_n420Tran_CentroCostoDescripcion,
            H00792_A49Tran_CodigoMovimiento, H00792_A381Tran_DescripcionMovimiento, H00792_n381Tran_DescripcionMovimiento, H00792_A109Tran_CodAlmaOrigen, H00792_A112Tran_CodBodeOrigen, H00792_A111Tran_CodAlmaDestino, H00792_A387Tran_CodBodeDestino, H00792_A483Tran_ValorTransaccion, H00792_n483Tran_ValorTransaccion, H00792_A489TDet_ValorTotal,
            H00792_A488TDet_ValorUnitario, H00792_A487TDet_Cantidad, H00792_A491TDet_PlacaPadre, H00792_n491TDet_PlacaPadre, H00792_A505TDet_EsPadre, H00792_A490TDet_PlacaNumero, H00792_n490TDet_PlacaNumero, H00792_A298Cata_Descripcion, H00792_A66Elem_Consecutivo, H00792_A69TDet_Consecutivo
            }
            , new Object[] {
            H00793_A416Tran_Observaciones, H00793_n416Tran_Observaciones, H00793_A47Tran_UsuarioId, H00793_n47Tran_UsuarioId, H00793_A48Tran_CentroCostoId, H00793_A57Tran_RegionId, H00793_n57Tran_RegionId, H00793_A55Tran_FechaRegistro, H00793_A49Tran_CodigoMovimiento, H00793_A109Tran_CodAlmaOrigen,
            H00793_A112Tran_CodBodeOrigen, H00793_A111Tran_CodAlmaDestino, H00793_A387Tran_CodBodeDestino, H00793_A483Tran_ValorTransaccion, H00793_n483Tran_ValorTransaccion
            }
            , new Object[] {
            H00794_A417Tran_UsuarioCodigo, H00794_n417Tran_UsuarioCodigo
            }
            , new Object[] {
            H00795_A419Tran_CentroCostoCodigo, H00795_n419Tran_CentroCostoCodigo, H00795_A420Tran_CentroCostoDescripcion, H00795_n420Tran_CentroCostoDescripcion
            }
            , new Object[] {
            H00796_A421Tran_RegionCodigo, H00796_n421Tran_RegionCodigo, H00796_A422Tran_RegionDescripcion, H00796_n422Tran_RegionDescripcion
            }
            , new Object[] {
            H00797_A381Tran_DescripcionMovimiento, H00797_n381Tran_DescripcionMovimiento
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte GRID1_nEOF ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A421Tran_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavToday_Visible ;
   private int edtavToday_Enabled ;
   private int edtTran_Id_Enabled ;
   private int edtTran_FechaRegistro_Enabled ;
   private int edtTran_UsuarioCodigo_Enabled ;
   private int edtTran_RegionCodigo_Enabled ;
   private int edtTran_RegionDescripcion_Enabled ;
   private int edtTran_CentroCostoCodigo_Enabled ;
   private int edtTran_CentroCostoDescripcion_Enabled ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int edtTran_DescripcionMovimiento_Enabled ;
   private int edtTran_CodAlmaOrigen_Enabled ;
   private int edtTran_CodBodeOrigen_Enabled ;
   private int edtTran_CodAlmaDestino_Enabled ;
   private int edtTran_CodBodeDestino_Enabled ;
   private int edtTran_ValorTransaccion_Enabled ;
   private int edtTran_Observaciones_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOA46Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long A47Tran_UsuarioId ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long AV5Tran_Id ;
   private long GXv_int1[] ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable1_Internalname ;
   private String edtavToday_Internalname ;
   private String edtavToday_Jsonclick ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_RegionCodigo_Internalname ;
   private String edtTran_RegionCodigo_Jsonclick ;
   private String edtTran_RegionDescripcion_Internalname ;
   private String edtTran_RegionDescripcion_Jsonclick ;
   private String edtTran_CentroCostoCodigo_Internalname ;
   private String edtTran_CentroCostoCodigo_Jsonclick ;
   private String edtTran_CentroCostoDescripcion_Internalname ;
   private String edtTran_CentroCostoDescripcion_Jsonclick ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String edtTran_DescripcionMovimiento_Internalname ;
   private String edtTran_DescripcionMovimiento_Jsonclick ;
   private String edtTran_CodAlmaOrigen_Internalname ;
   private String edtTran_CodAlmaOrigen_Jsonclick ;
   private String edtTran_CodBodeOrigen_Internalname ;
   private String edtTran_CodBodeOrigen_Jsonclick ;
   private String edtTran_CodAlmaDestino_Internalname ;
   private String edtTran_CodAlmaDestino_Jsonclick ;
   private String edtTran_CodBodeDestino_Internalname ;
   private String edtTran_CodBodeDestino_Jsonclick ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_Observaciones_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String TempTags ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtTDet_PlacaNumero_Internalname ;
   private String edtTDet_EsPadre_Internalname ;
   private String edtTDet_PlacaPadre_Internalname ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_ValorTotal_Internalname ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtTDet_PlacaNumero_Jsonclick ;
   private String edtTDet_EsPadre_Jsonclick ;
   private String edtTDet_PlacaPadre_Jsonclick ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String Alertify1_Internalname ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean n416Tran_Observaciones ;
   private boolean n47Tran_UsuarioId ;
   private boolean n57Tran_RegionId ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean returnInSub ;
   private String A416Tran_Observaciones ;
   private String AV8Usuario ;
   private String A417Tran_UsuarioCodigo ;
   private String A422Tran_RegionDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A505TDet_EsPadre ;
   private String A491TDet_PlacaPadre ;
   private String A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV10Websession ;
   private IDataStoreProvider pr_default ;
   private String[] H00792_A416Tran_Observaciones ;
   private boolean[] H00792_n416Tran_Observaciones ;
   private String[] H00792_A37Cata_Codigo ;
   private long[] H00792_A47Tran_UsuarioId ;
   private boolean[] H00792_n47Tran_UsuarioId ;
   private long[] H00792_A48Tran_CentroCostoId ;
   private long[] H00792_A57Tran_RegionId ;
   private boolean[] H00792_n57Tran_RegionId ;
   private long[] H00792_A46Tran_Id ;
   private java.util.Date[] H00792_A55Tran_FechaRegistro ;
   private String[] H00792_A417Tran_UsuarioCodigo ;
   private boolean[] H00792_n417Tran_UsuarioCodigo ;
   private short[] H00792_A421Tran_RegionCodigo ;
   private boolean[] H00792_n421Tran_RegionCodigo ;
   private String[] H00792_A422Tran_RegionDescripcion ;
   private boolean[] H00792_n422Tran_RegionDescripcion ;
   private String[] H00792_A419Tran_CentroCostoCodigo ;
   private boolean[] H00792_n419Tran_CentroCostoCodigo ;
   private String[] H00792_A420Tran_CentroCostoDescripcion ;
   private boolean[] H00792_n420Tran_CentroCostoDescripcion ;
   private String[] H00792_A49Tran_CodigoMovimiento ;
   private String[] H00792_A381Tran_DescripcionMovimiento ;
   private boolean[] H00792_n381Tran_DescripcionMovimiento ;
   private String[] H00792_A109Tran_CodAlmaOrigen ;
   private String[] H00792_A112Tran_CodBodeOrigen ;
   private String[] H00792_A111Tran_CodAlmaDestino ;
   private String[] H00792_A387Tran_CodBodeDestino ;
   private java.math.BigDecimal[] H00792_A483Tran_ValorTransaccion ;
   private boolean[] H00792_n483Tran_ValorTransaccion ;
   private java.math.BigDecimal[] H00792_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H00792_A488TDet_ValorUnitario ;
   private long[] H00792_A487TDet_Cantidad ;
   private String[] H00792_A491TDet_PlacaPadre ;
   private boolean[] H00792_n491TDet_PlacaPadre ;
   private String[] H00792_A505TDet_EsPadre ;
   private String[] H00792_A490TDet_PlacaNumero ;
   private boolean[] H00792_n490TDet_PlacaNumero ;
   private String[] H00792_A298Cata_Descripcion ;
   private String[] H00792_A66Elem_Consecutivo ;
   private long[] H00792_A69TDet_Consecutivo ;
   private String[] H00793_A416Tran_Observaciones ;
   private boolean[] H00793_n416Tran_Observaciones ;
   private long[] H00793_A47Tran_UsuarioId ;
   private boolean[] H00793_n47Tran_UsuarioId ;
   private long[] H00793_A48Tran_CentroCostoId ;
   private long[] H00793_A57Tran_RegionId ;
   private boolean[] H00793_n57Tran_RegionId ;
   private java.util.Date[] H00793_A55Tran_FechaRegistro ;
   private String[] H00793_A49Tran_CodigoMovimiento ;
   private String[] H00793_A109Tran_CodAlmaOrigen ;
   private String[] H00793_A112Tran_CodBodeOrigen ;
   private String[] H00793_A111Tran_CodAlmaDestino ;
   private String[] H00793_A387Tran_CodBodeDestino ;
   private java.math.BigDecimal[] H00793_A483Tran_ValorTransaccion ;
   private boolean[] H00793_n483Tran_ValorTransaccion ;
   private String[] H00794_A417Tran_UsuarioCodigo ;
   private boolean[] H00794_n417Tran_UsuarioCodigo ;
   private String[] H00795_A419Tran_CentroCostoCodigo ;
   private boolean[] H00795_n419Tran_CentroCostoCodigo ;
   private String[] H00795_A420Tran_CentroCostoDescripcion ;
   private boolean[] H00795_n420Tran_CentroCostoDescripcion ;
   private short[] H00796_A421Tran_RegionCodigo ;
   private boolean[] H00796_n421Tran_RegionCodigo ;
   private String[] H00796_A422Tran_RegionDescripcion ;
   private boolean[] H00796_n422Tran_RegionDescripcion ;
   private String[] H00797_A381Tran_DescripcionMovimiento ;
   private boolean[] H00797_n381Tran_DescripcionMovimiento ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpalm_ratificacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00792", "SELECT T4.Tran_Observaciones, T2.Cata_Codigo, T4.Tran_UsuarioId AS Tran_UsuarioId, T4.Tran_CentroCostoId AS Tran_CentroCostoId, T4.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T4.Tran_FechaRegistro, T5.Usua_Codigo AS Tran_UsuarioCodigo, T7.Regi_Cod AS Tran_RegionCodigo, T7.Regi_Descripcion AS Tran_RegionDescripcion, T6.Cent_Codigo AS Tran_CentroCostoCodigo, T6.Cent_Descripcion AS Tran_CentroCostoDescripcion, T4.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T8.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T4.Tran_CodAlmaOrigen, T4.Tran_CodBodeOrigen, T4.Tran_CodAlmaDestino, T4.Tran_CodBodeDestino, T4.Tran_ValorTransaccion, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T1.TDet_Cantidad, T1.TDet_PlacaPadre, T1.TDet_EsPadre, T1.TDet_PlacaNumero, T3.Cata_Descripcion, T1.Elem_Consecutivo, T1.TDet_Consecutivo FROM (((((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_TRANSACCION T4 ON T4.Tran_Id = T1.Tran_Id) LEFT JOIN SEG_USUARIO T5 ON T5.Usua_Id = T4.Tran_UsuarioId) INNER JOIN GEN_CENTROCOSTO T6 ON T6.Cent_Id = T4.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T7 ON T7.Regi_Id = T4.Tran_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T8 ON T8.Tpmo_Codigo = T4.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00793", "SELECT Tran_Observaciones, Tran_UsuarioId, Tran_CentroCostoId, Tran_RegionId, Tran_FechaRegistro, Tran_CodigoMovimiento, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_ValorTransaccion FROM ALM_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00794", "SELECT Usua_Codigo AS Tran_UsuarioCodigo FROM SEG_USUARIO WHERE Usua_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00795", "SELECT Cent_Codigo AS Tran_CentroCostoCodigo, Cent_Descripcion AS Tran_CentroCostoDescripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00796", "SELECT Regi_Cod AS Tran_RegionCodigo, Regi_Descripcion AS Tran_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00797", "SELECT Tpmo_Descripcion AS Tran_DescripcionMovimiento FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(18) ;
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(19,2) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(20,2) ;
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2) ;
               ((long[]) buf[31])[0] = rslt.getLong(22) ;
               ((String[]) buf[32])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(26) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(27) ;
               ((long[]) buf[39])[0] = rslt.getLong(28) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

