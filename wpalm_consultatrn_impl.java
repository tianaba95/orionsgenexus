/*
               File: wpalm_consultatrn_impl
        Description: Consulta de transacción
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:10.62
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

public final  class wpalm_consultatrn_impl extends GXDataArea
{
   public wpalm_consultatrn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpalm_consultatrn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpalm_consultatrn_impl.class ));
   }

   public wpalm_consultatrn_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTran_TipoEntra = new HTMLChoice();
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
            nRC_GXsfl_182 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_182_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_182_idx = httpContext.GetNextPar( ) ;
            AV19Atributos = httpContext.GetNextPar( ) ;
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
            AV19Atributos = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( A46Tran_Id, AV19Atributos) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
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
      pa642( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start642( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414201081");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpalm_consultatrn") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_182", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_182, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_INDE_S", AV14Tran_IndE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV13Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ENTRADA", GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NRO_LINEA", GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
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
         we642( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt642( ) ;
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
      return formatLink("com.orions2.wpalm_consultatrn") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPALM_CONSULTATRN" ;
   }

   public String getPgmdesc( )
   {
      return "Consulta de transacción" ;
   }

   public void wb640( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Consulta transacción", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavToday_Internalname, "Today", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavToday_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavToday_Internalname, localUtil.format(Gx_date, "99/99/99"), localUtil.format( Gx_date, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavToday_Jsonclick, 0, "Attribute", "", "", "", edtavToday_Visible, edtavToday_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavToday_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavToday_Visible==0)||(edtavToday_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_CONSULTATRN.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", edtTran_Id_Visible, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ConsecutivoCC_Internalname, "Número de transacción", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTran_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ConsecutivoCC_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRegistro_Internalname, localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_CONSULTATRN.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioCodigo_Internalname, "Usuario de creación", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioCodigo_Internalname, A417Tran_UsuarioCodigo, GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioCodigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRatificacion_Internalname, "Fecha Ratificacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRatificacion_Internalname, localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRatificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRatificacion_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_CONSULTATRN.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioRatifica_Internalname, "Usuario que ratifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioRatifica_Internalname, A391Tran_UsuarioRatifica, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioRatifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioRatifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigo_Internalname, "Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcion_Internalname, A422Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( A422Tran_RegionDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigo_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigo_Internalname, A419Tran_CentroCostoCodigo, GXutil.rtrim( localUtil.format( A419Tran_CentroCostoCodigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcion_Internalname, A420Tran_CentroCostoDescripcion, GXutil.rtrim( localUtil.format( A420Tran_CentroCostoDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "SELECCIONAR", edtTran_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_DescripcionMovimiento_Internalname, A381Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( A381Tran_DescripcionMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_DescripcionMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_DescripcionMovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "Datos Orígen", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         httpContext.writeText( "<hr/>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloOrigen_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloOrigen_Internalname, A110Tran_ModuloOrigen, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ModuloOrigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_descripcionorigen_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_descripcionorigen_Internalname, AV17Alma_DescripcionOrigen, GXutil.rtrim( localUtil.format( AV17Alma_DescripcionOrigen, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_descripcionorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_descripcionorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_descripcionorigen_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripcionorigen_Internalname, AV23Bode_DescripcionOrigen, GXutil.rtrim( localUtil.format( AV23Bode_DescripcionOrigen, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_descripcionorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_descripcionorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaCuentadanteOrigen_Visible, edtTran_CedulaCuentadanteOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteOrigen_Internalname, A384Tran_NombCuentadanteOrigen, GXutil.rtrim( localUtil.format( A384Tran_NombCuentadanteOrigen, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombCuentadanteOrigen_Visible, edtTran_NombCuentadanteOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaProveedor_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaProveedor_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaProveedor_Visible, edtTran_CedulaProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreProveedor_Internalname, A575Tran_NombreProveedor, GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreProveedor_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreProveedor_Visible, edtTran_NombreProveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Datos Destino", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         httpContext.writeText( "<hr/>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_regiondescripciondestino_Internalname, "Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_regiondescripciondestino_Internalname, AV30Tran_RegionDescripcionDestino, GXutil.rtrim( localUtil.format( AV30Tran_RegionDescripcionDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_regiondescripciondestino_Jsonclick, 0, "Attribute", "", "", "", edtavTran_regiondescripciondestino_Visible, edtavTran_regiondescripciondestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_centrocostodescripciondestino_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_centrocostodescripciondestino_Internalname, AV28Tran_CentroCostoDescripcionDestino, GXutil.rtrim( localUtil.format( AV28Tran_CentroCostoDescripcionDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_centrocostodescripciondestino_Jsonclick, 0, "Attribute", "", "", "", edtavTran_centrocostodescripciondestino_Visible, edtavTran_centrocostodescripciondestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloDestino_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloDestino_Internalname, A385Tran_ModuloDestino, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ModuloDestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_descripciondestino_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_descripciondestino_Internalname, AV16Alma_DescripcionDestino, GXutil.rtrim( localUtil.format( AV16Alma_DescripcionDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_descripciondestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_descripciondestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_descripciondestino_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripciondestino_Internalname, AV22Bode_DescripcionDestino, GXutil.rtrim( localUtil.format( AV22Bode_DescripcionDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_descripciondestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_descripciondestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaCuentadanteDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteDestino_Internalname, A389Tran_NombCuentadanteDestino, GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombCuentadanteDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMasivo_Internalname, "Ingreso Masivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMasivo_Internalname, GXutil.rtrim( AV35Masivo), GXutil.rtrim( localUtil.format( AV35Masivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMasivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavMasivo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoEntra.getInternalname(), "Tipo de entrada devolutivo", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoEntra, cmbTran_TipoEntra.getInternalname(), GXutil.rtrim( A527Tran_TipoEntra), 1, cmbTran_TipoEntra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbTran_TipoEntra.getVisible(), cmbTran_TipoEntra.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_WPALM_CONSULTATRN.htm");
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "min-height:10px;", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreIngreso_Internalname, "Tipo de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreIngreso_Internalname, A672Tran_NombreIngreso, GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreIngreso_Visible, edtTran_NombreIngreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroIngreso_Internalname, "Número", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroIngreso_Internalname, GXutil.rtrim( A514Tran_NumeroIngreso), GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_NumeroIngreso_Visible, edtTran_NumeroIngreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaIngreso_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaIngreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaIngreso_Internalname, localUtil.format(A515Tran_FechaIngreso, "99/99/99"), localUtil.format( A515Tran_FechaIngreso, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_FechaIngreso_Visible, edtTran_FechaIngreso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaIngreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTran_FechaIngreso_Visible==0)||(edtTran_FechaIngreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_CONSULTATRN.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAreadante_Internalname, "Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAreadante_Internalname, AV18Areadante, GXutil.rtrim( localUtil.format( AV18Areadante, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAreadante_Jsonclick, 0, "Attribute", "", "", "", edtavAreadante_Visible, edtavAreadante_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurso_Internalname, "Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurso_Internalname, AV25Curso, GXutil.rtrim( localUtil.format( AV25Curso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurso_Jsonclick, 0, "Attribute", "", "", "", edtavCurso_Visible, edtavCurso_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaResponsabilidad_Internalname, "Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_CedulaResponsabilidad_Visible, edtTran_CedulaResponsabilidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, A721Tran_NombreCuentadanteResponsa, GXutil.rtrim( localUtil.format( A721Tran_NombreCuentadanteResponsa, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreCuentadanteResponsa_Jsonclick, 0, "Attribute", "", "", "", edtTran_NombreCuentadanteResponsa_Visible, edtTran_NombreCuentadanteResponsa_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TransaccResponsabilidad_Internalname, "Transacción", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TransaccResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")), ((edtTran_TransaccResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TransaccResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_TransaccResponsabilidad_Visible, edtTran_TransaccResponsabilidad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaResponsabilidad_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaResponsabilidad_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaResponsabilidad_Internalname, localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"), localUtil.format( A720Tran_FechaResponsabilidad, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtTran_FechaResponsabilidad_Visible, edtTran_FechaResponsabilidad_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaResponsabilidad_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTran_FechaResponsabilidad_Visible==0)||(edtTran_FechaResponsabilidad_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPALM_CONSULTATRN.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ValorTransaccion_Internalname, "Valor Transaccion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ValorTransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtTran_ValorTransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ValorTransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ValorTransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_Observaciones_Internalname, A416Tran_Observaciones, "", "", (short)(0), 1, edtTran_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_CONSULTATRN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 10, "px", "col-xs-12", "left", "top", "", "", "div");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"182\">") ;
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
            httpContext.writeValue( "Placa") ;
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
            httpContext.writeValue( "Otros Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Presente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DisplayAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            Grid1Column.AddObjectProperty("Value", A491TDet_PlacaPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV19Atributos));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 182 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_182 = (short)(nGXsfl_182_idx-1) ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", "Cancelar", bttButton2_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", "Novedades", bttButton1_Jsonclick, 5, "Novedades", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'NOVEDADES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_CONSULTATRN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start642( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Consulta de transacción", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup640( ) ;
   }

   public void ws642( )
   {
      start642( ) ;
      evt642( ) ;
   }

   public void evt642( )
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
                        else if ( GXutil.strcmp(sEvt, "'NOVEDADES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Novedades' */
                           e11642 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) )
                        {
                           nGXsfl_182_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1822( ) ;
                           A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A490TDet_PlacaNumero = httpContext.cgiGet( edtTDet_PlacaNumero_Internalname) ;
                           n490TDet_PlacaNumero = false ;
                           A491TDet_PlacaPadre = httpContext.cgiGet( edtTDet_PlacaPadre_Internalname) ;
                           n491TDet_PlacaPadre = false ;
                           A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
                           A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
                           A657TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)) ;
                           n657TDet_Otros_Costos = false ;
                           A653TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)) ;
                           n653TDet_Valor_Presente = false ;
                           A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
                           AV19Atributos = httpContext.cgiGet( edtavAtributos_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Atributos)==0) ? AV53Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Atributos))), !bGXsfl_182_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Atributos), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e12642 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ATRIBUTOS'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Atributos' */
                                 e13642 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14642 ();
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

   public void we642( )
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

   public void pa642( )
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
         cmbTran_TipoEntra.setName( "TRAN_TIPOENTRA" );
         cmbTran_TipoEntra.setWebtags( "" );
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
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
            GX_FocusControl = edtavAlma_descripcionorigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_1822( ) ;
      while ( nGXsfl_182_idx <= nRC_GXsfl_182 )
      {
         sendrow_1822( ) ;
         nGXsfl_182_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_182_idx+1)) ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( long A46Tran_Id ,
                                  String AV19Atributos )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf642( ) ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO", getSecureSignedToken( "", localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_OTROS_COSTOS", getSecureSignedToken( "", localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALOR_PRESENTE", getSecureSignedToken( "", localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALOR_PRESENTE", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL", getSecureSignedToken( "", localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbTran_TipoEntra.getItemCount() > 0 )
      {
         A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf642( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavAlma_descripcionorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcionorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcionorigen_Enabled, 5, 0)), true);
      edtavBode_descripcionorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripcionorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripcionorigen_Enabled, 5, 0)), true);
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Enabled, 5, 0)), true);
      edtavAlma_descripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripciondestino_Enabled, 5, 0)), true);
      edtavBode_descripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripciondestino_Enabled, 5, 0)), true);
      edtavMasivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMasivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMasivo_Enabled, 5, 0)), true);
      edtavAreadante_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAreadante_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAreadante_Enabled, 5, 0)), true);
      edtavCurso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurso_Enabled, 5, 0)), true);
   }

   public void rf642( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(182) ;
      nGXsfl_182_idx = (short)(1) ;
      sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1822( ) ;
      bGXsfl_182_Refreshing = true ;
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
         subsflControlProps_1822( ) ;
         /* Using cursor H00642 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A37Cata_Codigo = H00642_A37Cata_Codigo[0] ;
            A489TDet_ValorTotal = H00642_A489TDet_ValorTotal[0] ;
            A653TDet_Valor_Presente = H00642_A653TDet_Valor_Presente[0] ;
            n653TDet_Valor_Presente = H00642_n653TDet_Valor_Presente[0] ;
            A657TDet_Otros_Costos = H00642_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = H00642_n657TDet_Otros_Costos[0] ;
            A488TDet_ValorUnitario = H00642_A488TDet_ValorUnitario[0] ;
            A487TDet_Cantidad = H00642_A487TDet_Cantidad[0] ;
            A491TDet_PlacaPadre = H00642_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = H00642_n491TDet_PlacaPadre[0] ;
            A490TDet_PlacaNumero = H00642_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H00642_n490TDet_PlacaNumero[0] ;
            A298Cata_Descripcion = H00642_A298Cata_Descripcion[0] ;
            A66Elem_Consecutivo = H00642_A66Elem_Consecutivo[0] ;
            A69TDet_Consecutivo = H00642_A69TDet_Consecutivo[0] ;
            A37Cata_Codigo = H00642_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H00642_A298Cata_Descripcion[0] ;
            /* Execute user event: Load */
            e14642 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbEnd = (short)(182) ;
         wb640( ) ;
      }
      bGXsfl_182_Refreshing = true ;
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

   public void strup640( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavAlma_descripcionorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcionorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcionorigen_Enabled, 5, 0)), true);
      edtavBode_descripcionorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripcionorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripcionorigen_Enabled, 5, 0)), true);
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Enabled, 5, 0)), true);
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Enabled, 5, 0)), true);
      edtavAlma_descripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripciondestino_Enabled, 5, 0)), true);
      edtavBode_descripciondestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_descripciondestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_descripciondestino_Enabled, 5, 0)), true);
      edtavMasivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMasivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMasivo_Enabled, 5, 0)), true);
      edtavAreadante_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAreadante_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAreadante_Enabled, 5, 0)), true);
      edtavCurso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurso_Enabled, 5, 0)), true);
      /* Using cursor H00643 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
      A416Tran_Observaciones = H00643_A416Tran_Observaciones[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
      n416Tran_Observaciones = H00643_n416Tran_Observaciones[0] ;
      A47Tran_UsuarioId = H00643_A47Tran_UsuarioId[0] ;
      n47Tran_UsuarioId = H00643_n47Tran_UsuarioId[0] ;
      A50Tran_CentroCostoIdDestino = H00643_A50Tran_CentroCostoIdDestino[0] ;
      n50Tran_CentroCostoIdDestino = H00643_n50Tran_CentroCostoIdDestino[0] ;
      A57Tran_RegionId = H00643_A57Tran_RegionId[0] ;
      n57Tran_RegionId = H00643_n57Tran_RegionId[0] ;
      A518Tran_RegionIdDestino = H00643_A518Tran_RegionIdDestino[0] ;
      n518Tran_RegionIdDestino = H00643_n518Tran_RegionIdDestino[0] ;
      A52Tran_IdCuentadanteDestino = H00643_A52Tran_IdCuentadanteDestino[0] ;
      n52Tran_IdCuentadanteDestino = H00643_n52Tran_IdCuentadanteDestino[0] ;
      A54Tran_TipoIngreso = H00643_A54Tran_TipoIngreso[0] ;
      n54Tran_TipoIngreso = H00643_n54Tran_TipoIngreso[0] ;
      A48Tran_CentroCostoId = H00643_A48Tran_CentroCostoId[0] ;
      A109Tran_CodAlmaOrigen = H00643_A109Tran_CodAlmaOrigen[0] ;
      A112Tran_CodBodeOrigen = H00643_A112Tran_CodBodeOrigen[0] ;
      A111Tran_CodAlmaDestino = H00643_A111Tran_CodAlmaDestino[0] ;
      A387Tran_CodBodeDestino = H00643_A387Tran_CodBodeDestino[0] ;
      A408Tran_CursoCodigo = H00643_A408Tran_CursoCodigo[0] ;
      n408Tran_CursoCodigo = H00643_n408Tran_CursoCodigo[0] ;
      A407Tran_AreadanteCodigo = H00643_A407Tran_AreadanteCodigo[0] ;
      n407Tran_AreadanteCodigo = H00643_n407Tran_AreadanteCodigo[0] ;
      A481Tran_IndE_S = H00643_A481Tran_IndE_S[0] ;
      n481Tran_IndE_S = H00643_n481Tran_IndE_S[0] ;
      A53Tran_IdProveedor = H00643_A53Tran_IdProveedor[0] ;
      n53Tran_IdProveedor = H00643_n53Tran_IdProveedor[0] ;
      A51Tran_IdCuentadanteOrigen = H00643_A51Tran_IdCuentadanteOrigen[0] ;
      n51Tran_IdCuentadanteOrigen = H00643_n51Tran_IdCuentadanteOrigen[0] ;
      A56Tran_IdCuentadanteResponsabili = H00643_A56Tran_IdCuentadanteResponsabili[0] ;
      n56Tran_IdCuentadanteResponsabili = H00643_n56Tran_IdCuentadanteResponsabili[0] ;
      A524Tran_Detalle = H00643_A524Tran_Detalle[0] ;
      n524Tran_Detalle = H00643_n524Tran_Detalle[0] ;
      A513Tran_ConsecutivoCC = H00643_A513Tran_ConsecutivoCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
      n513Tran_ConsecutivoCC = H00643_n513Tran_ConsecutivoCC[0] ;
      A55Tran_FechaRegistro = H00643_A55Tran_FechaRegistro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      A390Tran_FechaRatificacion = H00643_A390Tran_FechaRatificacion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      n390Tran_FechaRatificacion = H00643_n390Tran_FechaRatificacion[0] ;
      A391Tran_UsuarioRatifica = H00643_A391Tran_UsuarioRatifica[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
      n391Tran_UsuarioRatifica = H00643_n391Tran_UsuarioRatifica[0] ;
      A49Tran_CodigoMovimiento = H00643_A49Tran_CodigoMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      A110Tran_ModuloOrigen = H00643_A110Tran_ModuloOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
      A385Tran_ModuloDestino = H00643_A385Tran_ModuloDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
      A527Tran_TipoEntra = H00643_A527Tran_TipoEntra[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
      n527Tran_TipoEntra = H00643_n527Tran_TipoEntra[0] ;
      A514Tran_NumeroIngreso = H00643_A514Tran_NumeroIngreso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
      n514Tran_NumeroIngreso = H00643_n514Tran_NumeroIngreso[0] ;
      A515Tran_FechaIngreso = H00643_A515Tran_FechaIngreso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
      n515Tran_FechaIngreso = H00643_n515Tran_FechaIngreso[0] ;
      A719Tran_TransaccResponsabilidad = H00643_A719Tran_TransaccResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
      n719Tran_TransaccResponsabilidad = H00643_n719Tran_TransaccResponsabilidad[0] ;
      A720Tran_FechaResponsabilidad = H00643_A720Tran_FechaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
      n720Tran_FechaResponsabilidad = H00643_n720Tran_FechaResponsabilidad[0] ;
      A483Tran_ValorTransaccion = H00643_A483Tran_ValorTransaccion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
      n483Tran_ValorTransaccion = H00643_n483Tran_ValorTransaccion[0] ;
      pr_default.close(1);
      /* Using cursor H00644 */
      pr_default.execute(2, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
      A417Tran_UsuarioCodigo = H00644_A417Tran_UsuarioCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
      n417Tran_UsuarioCodigo = H00644_n417Tran_UsuarioCodigo[0] ;
      pr_default.close(2);
      /* Using cursor H00645 */
      pr_default.execute(3, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
      A517Tran_CentroCostoDescripcionDes = H00645_A517Tran_CentroCostoDescripcionDes[0] ;
      n517Tran_CentroCostoDescripcionDes = H00645_n517Tran_CentroCostoDescripcionDes[0] ;
      A516Tran_CentroCostoCodigoDestino = H00645_A516Tran_CentroCostoCodigoDestino[0] ;
      n516Tran_CentroCostoCodigoDestino = H00645_n516Tran_CentroCostoCodigoDestino[0] ;
      pr_default.close(3);
      /* Using cursor H00646 */
      pr_default.execute(4, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
      A421Tran_RegionCodigo = H00646_A421Tran_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
      n421Tran_RegionCodigo = H00646_n421Tran_RegionCodigo[0] ;
      A422Tran_RegionDescripcion = H00646_A422Tran_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
      n422Tran_RegionDescripcion = H00646_n422Tran_RegionDescripcion[0] ;
      pr_default.close(4);
      /* Using cursor H00647 */
      pr_default.execute(5, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
      A520Tran_RegionDescripcionDestino = H00647_A520Tran_RegionDescripcionDestino[0] ;
      n520Tran_RegionDescripcionDestino = H00647_n520Tran_RegionDescripcionDestino[0] ;
      A519Tran_RegionCodigoDestino = H00647_A519Tran_RegionCodigoDestino[0] ;
      n519Tran_RegionCodigoDestino = H00647_n519Tran_RegionCodigoDestino[0] ;
      pr_default.close(5);
      /* Using cursor H00648 */
      pr_default.execute(6, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
      A704Tran_CedulaCuentadanteDestino = H00648_A704Tran_CedulaCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
      n704Tran_CedulaCuentadanteDestino = H00648_n704Tran_CedulaCuentadanteDestino[0] ;
      A389Tran_NombCuentadanteDestino = H00648_A389Tran_NombCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
      n389Tran_NombCuentadanteDestino = H00648_n389Tran_NombCuentadanteDestino[0] ;
      pr_default.close(6);
      /* Using cursor H00649 */
      pr_default.execute(7, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
      A672Tran_NombreIngreso = H00649_A672Tran_NombreIngreso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
      n672Tran_NombreIngreso = H00649_n672Tran_NombreIngreso[0] ;
      pr_default.close(7);
      /* Using cursor H006410 */
      pr_default.execute(8, new Object[] {new Long(A48Tran_CentroCostoId)});
      A419Tran_CentroCostoCodigo = H006410_A419Tran_CentroCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
      n419Tran_CentroCostoCodigo = H006410_n419Tran_CentroCostoCodigo[0] ;
      A420Tran_CentroCostoDescripcion = H006410_A420Tran_CentroCostoDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
      n420Tran_CentroCostoDescripcion = H006410_n420Tran_CentroCostoDescripcion[0] ;
      pr_default.close(8);
      /* Using cursor H006411 */
      pr_default.execute(9, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
      A703Tran_CedulaProveedor = H006411_A703Tran_CedulaProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
      n703Tran_CedulaProveedor = H006411_n703Tran_CedulaProveedor[0] ;
      A575Tran_NombreProveedor = H006411_A575Tran_NombreProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
      n575Tran_NombreProveedor = H006411_n575Tran_NombreProveedor[0] ;
      pr_default.close(9);
      /* Using cursor H006412 */
      pr_default.execute(10, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
      A702Tran_CedulaCuentadanteOrigen = H006412_A702Tran_CedulaCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
      n702Tran_CedulaCuentadanteOrigen = H006412_n702Tran_CedulaCuentadanteOrigen[0] ;
      A384Tran_NombCuentadanteOrigen = H006412_A384Tran_NombCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
      n384Tran_NombCuentadanteOrigen = H006412_n384Tran_NombCuentadanteOrigen[0] ;
      pr_default.close(10);
      /* Using cursor H006413 */
      pr_default.execute(11, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
      A759Tran_CedulaResponsabilidad = H006413_A759Tran_CedulaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
      n759Tran_CedulaResponsabilidad = H006413_n759Tran_CedulaResponsabilidad[0] ;
      A721Tran_NombreCuentadanteResponsa = H006413_A721Tran_NombreCuentadanteResponsa[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
      n721Tran_NombreCuentadanteResponsa = H006413_n721Tran_NombreCuentadanteResponsa[0] ;
      pr_default.close(11);
      /* Using cursor H006414 */
      pr_default.execute(12, new Object[] {A49Tran_CodigoMovimiento});
      A708Tran_SolicitaRegionDestino = H006414_A708Tran_SolicitaRegionDestino[0] ;
      n708Tran_SolicitaRegionDestino = H006414_n708Tran_SolicitaRegionDestino[0] ;
      A707Tran_SolicitaCCDestino = H006414_A707Tran_SolicitaCCDestino[0] ;
      n707Tran_SolicitaCCDestino = H006414_n707Tran_SolicitaCCDestino[0] ;
      A381Tran_DescripcionMovimiento = H006414_A381Tran_DescripcionMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
      n381Tran_DescripcionMovimiento = H006414_n381Tran_DescripcionMovimiento[0] ;
      pr_default.close(12);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12642 ();
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
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
         n513Tran_ConsecutivoCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
         n417Tran_UsuarioCodigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname), 0) ;
         n390Tran_FechaRatificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         A391Tran_UsuarioRatifica = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioRatifica_Internalname)) ;
         n391Tran_UsuarioRatifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
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
         A110Tran_ModuloOrigen = httpContext.cgiGet( edtTran_ModuloOrigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         AV17Alma_DescripcionOrigen = GXutil.upper( httpContext.cgiGet( edtavAlma_descripcionorigen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Alma_DescripcionOrigen", AV17Alma_DescripcionOrigen);
         AV23Bode_DescripcionOrigen = GXutil.upper( httpContext.cgiGet( edtavBode_descripcionorigen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Bode_DescripcionOrigen", AV23Bode_DescripcionOrigen);
         A702Tran_CedulaCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteOrigen_Internalname), ",", ".") ;
         n702Tran_CedulaCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         A384Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteOrigen_Internalname)) ;
         n384Tran_NombCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         A703Tran_CedulaProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaProveedor_Internalname), ",", ".") ;
         n703Tran_CedulaProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
         n575Tran_NombreProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         AV30Tran_RegionDescripcionDestino = httpContext.cgiGet( edtavTran_regiondescripciondestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_RegionDescripcionDestino", AV30Tran_RegionDescripcionDestino);
         AV28Tran_CentroCostoDescripcionDestino = httpContext.cgiGet( edtavTran_centrocostodescripciondestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_CentroCostoDescripcionDestino", AV28Tran_CentroCostoDescripcionDestino);
         A385Tran_ModuloDestino = httpContext.cgiGet( edtTran_ModuloDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         AV16Alma_DescripcionDestino = GXutil.upper( httpContext.cgiGet( edtavAlma_descripciondestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DescripcionDestino", AV16Alma_DescripcionDestino);
         AV22Bode_DescripcionDestino = GXutil.upper( httpContext.cgiGet( edtavBode_descripciondestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Bode_DescripcionDestino", AV22Bode_DescripcionDestino);
         A704Tran_CedulaCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteDestino_Internalname), ",", ".") ;
         n704Tran_CedulaCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
         n389Tran_NombCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         AV35Masivo = httpContext.cgiGet( edtavMasivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Masivo", AV35Masivo);
         cmbTran_TipoEntra.setName( cmbTran_TipoEntra.getInternalname() );
         cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
         A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
         n672Tran_NombreIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
         n514Tran_NumeroIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         A515Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 0)) ;
         n515Tran_FechaIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         AV18Areadante = httpContext.cgiGet( edtavAreadante_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Areadante", AV18Areadante);
         AV25Curso = httpContext.cgiGet( edtavCurso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Curso", AV25Curso);
         A759Tran_CedulaResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaResponsabilidad_Internalname), ",", ".") ;
         n759Tran_CedulaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         A721Tran_NombreCuentadanteResponsa = GXutil.upper( httpContext.cgiGet( edtTran_NombreCuentadanteResponsa_Internalname)) ;
         n721Tran_NombreCuentadanteResponsa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         A719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") ;
         n719Tran_TransaccResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         A720Tran_FechaResponsabilidad = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), 0)) ;
         n720Tran_FechaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
         n483Tran_ValorTransaccion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
         A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
         n416Tran_Observaciones = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         /* Read saved values. */
         nRC_GXsfl_182 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_182"), ",", ".")) ;
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
      e12642 ();
      if (returnInSub) return;
   }

   public void e12642( )
   {
      /* Start Routine */
      Form.setCaption( "Consulta Transacción" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      edtavToday_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavToday_Visible, 5, 0)), true);
      AV32Usuario = AV34Websession.getValue("Usuario") ;
      AV13Tran_Id = A46Tran_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Tran_Id", GXutil.ltrim( GXutil.str( AV13Tran_Id, 11, 0)));
      edtTran_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_Id_Visible, 5, 0)), true);
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOAD' Routine */
      AV19Atributos = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Atributos)==0) ? AV53Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Atributos))), !bGXsfl_182_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Atributos), true);
      AV53Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Atributos)==0) ? AV53Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Atributos))), !bGXsfl_182_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Atributos), true);
      AV8Cent_Id = A48Tran_CentroCostoId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      AV6Alma_Modulo = A110Tran_ModuloOrigen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      AV5Alma_Codigo = A109Tran_CodAlmaOrigen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      /* Execute user subroutine: 'ALMACEN' */
      S122 ();
      if (returnInSub) return;
      AV17Alma_DescripcionOrigen = AV5Alma_Codigo + "-" + AV15Alma_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Alma_DescripcionOrigen", AV17Alma_DescripcionOrigen);
      AV20Bode_Codigo = A112Tran_CodBodeOrigen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Bode_Codigo", AV20Bode_Codigo);
      /* Execute user subroutine: 'BODEGA' */
      S132 ();
      if (returnInSub) return;
      AV23Bode_DescripcionOrigen = AV20Bode_Codigo + "-" + AV21Bode_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Bode_DescripcionOrigen", AV23Bode_DescripcionOrigen);
      AV6Alma_Modulo = A385Tran_ModuloDestino ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      AV5Alma_Codigo = A111Tran_CodAlmaDestino ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      /* Execute user subroutine: 'ALMACEN' */
      S122 ();
      if (returnInSub) return;
      AV16Alma_DescripcionDestino = AV5Alma_Codigo + "-" + AV15Alma_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DescripcionDestino", AV16Alma_DescripcionDestino);
      AV20Bode_Codigo = A387Tran_CodBodeDestino ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Bode_Codigo", AV20Bode_Codigo);
      /* Execute user subroutine: 'BODEGA' */
      S132 ();
      if (returnInSub) return;
      AV22Bode_DescripcionDestino = AV20Bode_Codigo + "-" + AV21Bode_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Bode_DescripcionDestino", AV22Bode_DescripcionDestino);
      AV12Tran_CursoCodigo = A408Tran_CursoCodigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_CursoCodigo", AV12Tran_CursoCodigo);
      AV11Tran_AreadanteCodigo = A407Tran_AreadanteCodigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Tran_AreadanteCodigo", AV11Tran_AreadanteCodigo);
      /* Execute user subroutine: 'CURSO' */
      S142 ();
      if (returnInSub) return;
      AV14Tran_IndE_S = A481Tran_IndE_S ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_IndE_S", AV14Tran_IndE_S);
      AV30Tran_RegionDescripcionDestino = GXutil.str( A519Tran_RegionCodigoDestino, 4, 0) + "-" + A520Tran_RegionDescripcionDestino ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_RegionDescripcionDestino", AV30Tran_RegionDescripcionDestino);
      AV28Tran_CentroCostoDescripcionDestino = A516Tran_CentroCostoCodigoDestino + "-" + A517Tran_CentroCostoDescripcionDes ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_CentroCostoDescripcionDestino", AV28Tran_CentroCostoDescripcionDestino);
      if ( (0==A53Tran_IdProveedor) )
      {
         edtTran_CedulaProveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaProveedor_Visible, 5, 0)), true);
         edtTran_NombreProveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreProveedor_Visible, 5, 0)), true);
      }
      if ( (0==A51Tran_IdCuentadanteOrigen) )
      {
         edtTran_CedulaCuentadanteOrigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaCuentadanteOrigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaCuentadanteOrigen_Visible, 5, 0)), true);
         edtTran_NombCuentadanteOrigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombCuentadanteOrigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombCuentadanteOrigen_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A708Tran_SolicitaRegionDestino, "SI") != 0 )
      {
         edtavTran_regiondescripciondestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_regiondescripciondestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_regiondescripciondestino_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A707Tran_SolicitaCCDestino, "SI") != 0 )
      {
         edtavTran_centrocostodescripciondestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_centrocostodescripciondestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_centrocostodescripciondestino_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A672Tran_NombreIngreso)==0) )
      {
         edtTran_NombreIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreIngreso_Visible, 5, 0)), true);
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A515Tran_FechaIngreso) )
      {
         edtTran_FechaIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_FechaIngreso_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A514Tran_NumeroIngreso)==0) )
      {
         edtTran_NumeroIngreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NumeroIngreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NumeroIngreso_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A527Tran_TipoEntra, "NA") == 0 )
      {
         cmbTran_TipoEntra.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_TipoEntra.getVisible(), 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A407Tran_AreadanteCodigo)==0) )
      {
         edtavAreadante_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAreadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAreadante_Visible, 5, 0)), true);
      }
      if ( (GXutil.strcmp("", A408Tran_CursoCodigo)==0) )
      {
         edtavCurso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurso_Visible, 5, 0)), true);
      }
      if ( (0==A56Tran_IdCuentadanteResponsabili) )
      {
         edtTran_CedulaResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CedulaResponsabilidad_Visible, 5, 0)), true);
         edtTran_NombreCuentadanteResponsa_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreCuentadanteResponsa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_NombreCuentadanteResponsa_Visible, 5, 0)), true);
         edtTran_TransaccResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_TransaccResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_TransaccResponsabilidad_Visible, 5, 0)), true);
         edtTran_FechaResponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaResponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_FechaResponsabilidad_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(A524Tran_Detalle, "S") == 0 )
      {
         AV35Masivo = "SI" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Masivo", AV35Masivo);
      }
      else
      {
         AV35Masivo = "NO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Masivo", AV35Masivo);
      }
   }

   public void e13642( )
   {
      /* 'Atributos' Routine */
      if ( GXutil.strcmp(AV14Tran_IndE_S, "E") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.wpatributos") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TDet_Consecutivo,18,0))), new Object[] {"A46Tran_Id","A69TDet_Consecutivo"});
      }
      else
      {
         AV10TDet_Consecutivo = A69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV10TDet_Consecutivo, 18, 0)));
         /* Using cursor H006415 */
         pr_default.execute(13, new Object[] {new Long(AV13Tran_Id), new Long(AV10TDet_Consecutivo)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A69TDet_Consecutivo = H006415_A69TDet_Consecutivo[0] ;
            A46Tran_Id = H006415_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
            A71Tran_Entrada = H006415_A71Tran_Entrada[0] ;
            A72Nro_Linea = H006415_A72Nro_Linea[0] ;
            AV29Tran_Entrada = A71Tran_Entrada ;
            AV26Nro_Linea = A72Nro_Linea ;
            pr_default.readNext(13);
         }
         pr_default.close(13);
         httpContext.popup(formatLink("com.orions2.wpatributos") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV29Tran_Entrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26Nro_Linea,8,0))), new Object[] {"AV29Tran_Entrada","AV26Nro_Linea"});
      }
   }

   public void S122( )
   {
      /* 'ALMACEN' Routine */
      AV15Alma_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_Descripcion", AV15Alma_Descripcion);
      /* Using cursor H006416 */
      pr_default.execute(14, new Object[] {new Long(AV8Cent_Id), AV6Alma_Modulo, AV5Alma_Codigo});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A28Alma_Codigo = H006416_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H006416_A27Alma_Modulo[0] ;
         A1Cent_Id = H006416_A1Cent_Id[0] ;
         A252Alma_Descripcion = H006416_A252Alma_Descripcion[0] ;
         AV15Alma_Descripcion = A252Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_Descripcion", AV15Alma_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S132( )
   {
      /* 'BODEGA' Routine */
      AV21Bode_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Bode_Descripcion", AV21Bode_Descripcion);
      /* Using cursor H006417 */
      pr_default.execute(15, new Object[] {new Long(AV8Cent_Id), AV6Alma_Modulo, AV5Alma_Codigo, AV20Bode_Codigo});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A31Bode_Codigo = H006417_A31Bode_Codigo[0] ;
         A28Alma_Codigo = H006417_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H006417_A27Alma_Modulo[0] ;
         A1Cent_Id = H006417_A1Cent_Id[0] ;
         A695BBode_Descripcion = H006417_A695BBode_Descripcion[0] ;
         AV21Bode_Descripcion = A695BBode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Bode_Descripcion", AV21Bode_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S142( )
   {
      /* 'CURSO' Routine */
      AV9Curs_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Curs_Descripcion", AV9Curs_Descripcion);
      /* Using cursor H006418 */
      pr_default.execute(16, new Object[] {AV12Tran_CursoCodigo});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A73Curs_Codigo = H006418_A73Curs_Codigo[0] ;
         A424Curs_Descripcion = H006418_A424Curs_Descripcion[0] ;
         AV9Curs_Descripcion = A424Curs_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Curs_Descripcion", AV9Curs_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      AV25Curso = AV12Tran_CursoCodigo + "-" + AV9Curs_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Curso", AV25Curso);
      AV7Area_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Area_Descripcion", AV7Area_Descripcion);
      /* Using cursor H006419 */
      pr_default.execute(17, new Object[] {AV11Tran_AreadanteCodigo});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A59Area_Codigo = H006419_A59Area_Codigo[0] ;
         A452Area_Descripcion = H006419_A452Area_Descripcion[0] ;
         AV7Area_Descripcion = A452Area_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Area_Descripcion", AV7Area_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
      AV18Areadante = AV11Tran_AreadanteCodigo + "-" + AV7Area_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Areadante", AV18Areadante);
   }

   public void e11642( )
   {
      /* 'Novedades' Routine */
      httpContext.popup(formatLink("com.orions2.wp_consultanovedad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Tran_Id,11,0))), new Object[] {"AV13Tran_Id"});
   }

   private void e14642( )
   {
      /* Load Routine */
      sendrow_1822( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_182_Refreshing )
      {
         httpContext.doAjaxLoad(182, Grid1Row);
      }
   }

   public void setparameters( Object[] obj )
   {
      A46Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
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
      pa642( ) ;
      ws642( ) ;
      we642( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414201599");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wpalm_consultatrn.js", "?201861414201599");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1822( )
   {
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_182_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_182_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_182_idx ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO_"+sGXsfl_182_idx ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE_"+sGXsfl_182_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_182_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_182_idx ;
      edtTDet_Otros_Costos_Internalname = "TDET_OTROS_COSTOS_"+sGXsfl_182_idx ;
      edtTDet_Valor_Presente_Internalname = "TDET_VALOR_PRESENTE_"+sGXsfl_182_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_182_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_182_idx ;
   }

   public void subsflControlProps_fel_1822( )
   {
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO_"+sGXsfl_182_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_182_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_182_fel_idx ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO_"+sGXsfl_182_fel_idx ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE_"+sGXsfl_182_fel_idx ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD_"+sGXsfl_182_fel_idx ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO_"+sGXsfl_182_fel_idx ;
      edtTDet_Otros_Costos_Internalname = "TDET_OTROS_COSTOS_"+sGXsfl_182_fel_idx ;
      edtTDet_Valor_Presente_Internalname = "TDET_VALOR_PRESENTE_"+sGXsfl_182_fel_idx ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL_"+sGXsfl_182_fel_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_182_fel_idx ;
   }

   public void sendrow_1822( )
   {
      subsflControlProps_1822( ) ;
      wb640( ) ;
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
         if ( ((int)((nGXsfl_182_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_182_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaNumero_Internalname,A490TDet_PlacaNumero,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaNumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_PlacaPadre_Internalname,A491TDet_PlacaPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Cantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorUnitario_Internalname,GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorUnitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Otros_Costos_Internalname,GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")),localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Otros_Costos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_Valor_Presente_Internalname,GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")),localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_Valor_Presente_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorTotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(182),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavAtributos_Enabled!=0)&&(edtavAtributos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 193,'',false,'',182)\"" : " ") ;
      ClassString = "DisplayAttribute" ;
      StyleString = "" ;
      AV19Atributos_IsBlob = (boolean)(((GXutil.strcmp("", AV19Atributos)==0)&&(GXutil.strcmp("", AV53Atributos_GXI)==0))||!(GXutil.strcmp("", AV19Atributos)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV19Atributos)==0) ? AV53Atributos_GXI : httpContext.getResourceRelative(AV19Atributos)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavAtributos_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","Atributos",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavAtributos_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ATRIBUTOS\\'."+sGXsfl_182_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV19Atributos_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CONSECUTIVO"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACANUMERO"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_PLACAPADRE"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_CANTIDAD"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORUNITARIO"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_OTROS_COSTOS"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALOR_PRESENTE"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TDET_VALORTOTAL"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_182_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_182_idx+1)) ;
      sGXsfl_182_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_182_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1822( ) ;
      /* End function sendrow_1822 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavToday_Internalname = "vTODAY" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO" ;
      edtTran_FechaRatificacion_Internalname = "TRAN_FECHARATIFICACION" ;
      edtTran_UsuarioRatifica_Internalname = "TRAN_USUARIORATIFICA" ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO" ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION" ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO" ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO" ;
      divTable2_Internalname = "TABLE2" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtTran_ModuloOrigen_Internalname = "TRAN_MODULOORIGEN" ;
      edtavAlma_descripcionorigen_Internalname = "vALMA_DESCRIPCIONORIGEN" ;
      edtavBode_descripcionorigen_Internalname = "vBODE_DESCRIPCIONORIGEN" ;
      edtTran_CedulaCuentadanteOrigen_Internalname = "TRAN_CEDULACUENTADANTEORIGEN" ;
      edtTran_NombCuentadanteOrigen_Internalname = "TRAN_NOMBCUENTADANTEORIGEN" ;
      edtTran_CedulaProveedor_Internalname = "TRAN_CEDULAPROVEEDOR" ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR" ;
      divTable3_Internalname = "TABLE3" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavTran_regiondescripciondestino_Internalname = "vTRAN_REGIONDESCRIPCIONDESTINO" ;
      edtavTran_centrocostodescripciondestino_Internalname = "vTRAN_CENTROCOSTODESCRIPCIONDESTINO" ;
      edtTran_ModuloDestino_Internalname = "TRAN_MODULODESTINO" ;
      edtavAlma_descripciondestino_Internalname = "vALMA_DESCRIPCIONDESTINO" ;
      edtavBode_descripciondestino_Internalname = "vBODE_DESCRIPCIONDESTINO" ;
      edtTran_CedulaCuentadanteDestino_Internalname = "TRAN_CEDULACUENTADANTEDESTINO" ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO" ;
      divTable4_Internalname = "TABLE4" ;
      edtavMasivo_Internalname = "vMASIVO" ;
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA" );
      divTable6_Internalname = "TABLE6" ;
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO" ;
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO" ;
      edtTran_FechaIngreso_Internalname = "TRAN_FECHAINGRESO" ;
      edtavAreadante_Internalname = "vAREADANTE" ;
      edtavCurso_Internalname = "vCURSO" ;
      edtTran_CedulaResponsabilidad_Internalname = "TRAN_CEDULARESPONSABILIDAD" ;
      edtTran_NombreCuentadanteResponsa_Internalname = "TRAN_NOMBRECUENTADANTERESPONSA" ;
      edtTran_TransaccResponsabilidad_Internalname = "TRAN_TRANSACCRESPONSABILIDAD" ;
      edtTran_FechaResponsabilidad_Internalname = "TRAN_FECHARESPONSABILIDAD" ;
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION" ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES" ;
      divTable5_Internalname = "TABLE5" ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO" ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE" ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO" ;
      edtTDet_Otros_Costos_Internalname = "TDET_OTROS_COSTOS" ;
      edtTDet_Valor_Presente_Internalname = "TDET_VALOR_PRESENTE" ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL" ;
      edtavAtributos_Internalname = "vATRIBUTOS" ;
      divTable1_Internalname = "TABLE1" ;
      bttButton2_Internalname = "BUTTON2" ;
      bttButton1_Internalname = "BUTTON1" ;
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
      edtavAtributos_Jsonclick = "" ;
      edtavAtributos_Visible = -1 ;
      edtavAtributos_Enabled = 1 ;
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_Valor_Presente_Jsonclick = "" ;
      edtTDet_Otros_Costos_Jsonclick = "" ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtTDet_PlacaPadre_Jsonclick = "" ;
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
      edtTran_FechaResponsabilidad_Jsonclick = "" ;
      edtTran_FechaResponsabilidad_Enabled = 0 ;
      edtTran_FechaResponsabilidad_Visible = 1 ;
      edtTran_TransaccResponsabilidad_Jsonclick = "" ;
      edtTran_TransaccResponsabilidad_Enabled = 0 ;
      edtTran_TransaccResponsabilidad_Visible = 1 ;
      edtTran_NombreCuentadanteResponsa_Jsonclick = "" ;
      edtTran_NombreCuentadanteResponsa_Enabled = 0 ;
      edtTran_NombreCuentadanteResponsa_Visible = 1 ;
      edtTran_CedulaResponsabilidad_Jsonclick = "" ;
      edtTran_CedulaResponsabilidad_Enabled = 0 ;
      edtTran_CedulaResponsabilidad_Visible = 1 ;
      edtavCurso_Jsonclick = "" ;
      edtavCurso_Enabled = 1 ;
      edtavCurso_Visible = 1 ;
      edtavAreadante_Jsonclick = "" ;
      edtavAreadante_Enabled = 1 ;
      edtavAreadante_Visible = 1 ;
      edtTran_FechaIngreso_Jsonclick = "" ;
      edtTran_FechaIngreso_Enabled = 0 ;
      edtTran_FechaIngreso_Visible = 1 ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      edtTran_NumeroIngreso_Enabled = 0 ;
      edtTran_NumeroIngreso_Visible = 1 ;
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_NombreIngreso_Enabled = 0 ;
      edtTran_NombreIngreso_Visible = 1 ;
      cmbTran_TipoEntra.setJsonclick( "" );
      cmbTran_TipoEntra.setEnabled( 0 );
      cmbTran_TipoEntra.setVisible( 1 );
      edtavMasivo_Jsonclick = "" ;
      edtavMasivo_Enabled = 1 ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Enabled = 0 ;
      edtTran_CedulaCuentadanteDestino_Jsonclick = "" ;
      edtTran_CedulaCuentadanteDestino_Enabled = 0 ;
      edtavBode_descripciondestino_Jsonclick = "" ;
      edtavBode_descripciondestino_Enabled = 1 ;
      edtavAlma_descripciondestino_Jsonclick = "" ;
      edtavAlma_descripciondestino_Enabled = 1 ;
      edtTran_ModuloDestino_Jsonclick = "" ;
      edtTran_ModuloDestino_Enabled = 0 ;
      edtavTran_centrocostodescripciondestino_Jsonclick = "" ;
      edtavTran_centrocostodescripciondestino_Enabled = 1 ;
      edtavTran_centrocostodescripciondestino_Visible = 1 ;
      edtavTran_regiondescripciondestino_Jsonclick = "" ;
      edtavTran_regiondescripciondestino_Enabled = 1 ;
      edtavTran_regiondescripciondestino_Visible = 1 ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_NombreProveedor_Enabled = 0 ;
      edtTran_NombreProveedor_Visible = 1 ;
      edtTran_CedulaProveedor_Jsonclick = "" ;
      edtTran_CedulaProveedor_Enabled = 0 ;
      edtTran_CedulaProveedor_Visible = 1 ;
      edtTran_NombCuentadanteOrigen_Jsonclick = "" ;
      edtTran_NombCuentadanteOrigen_Enabled = 0 ;
      edtTran_NombCuentadanteOrigen_Visible = 1 ;
      edtTran_CedulaCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CedulaCuentadanteOrigen_Enabled = 0 ;
      edtTran_CedulaCuentadanteOrigen_Visible = 1 ;
      edtavBode_descripcionorigen_Jsonclick = "" ;
      edtavBode_descripcionorigen_Enabled = 1 ;
      edtavAlma_descripcionorigen_Jsonclick = "" ;
      edtavAlma_descripcionorigen_Enabled = 1 ;
      edtTran_ModuloOrigen_Jsonclick = "" ;
      edtTran_ModuloOrigen_Enabled = 0 ;
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
      edtTran_UsuarioRatifica_Jsonclick = "" ;
      edtTran_UsuarioRatifica_Enabled = 0 ;
      edtTran_FechaRatificacion_Jsonclick = "" ;
      edtTran_FechaRatificacion_Enabled = 0 ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Enabled = 0 ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_FechaRegistro_Enabled = 0 ;
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtTran_ConsecutivoCC_Enabled = 0 ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      edtTran_Id_Visible = 1 ;
      edtavToday_Jsonclick = "" ;
      edtavToday_Enabled = 0 ;
      edtavToday_Visible = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Consulta de transacción" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV19Atributos',fld:'vATRIBUTOS',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'ATRIBUTOS'","{handler:'e13642',iparms:[{av:'AV14Tran_IndE_S',fld:'vTRAN_INDE_S',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV13Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A71Tran_Entrada',fld:'TRAN_ENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'A72Nro_Linea',fld:'NRO_LINEA',pic:'ZZZZZZZ9',nv:0}],oparms:[{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV10TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'NOVEDADES'","{handler:'e11642',iparms:[{av:'AV13Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV13Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
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
      AV19Atributos = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV14Tran_IndE_S = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Gx_date = GXutil.nullDate() ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A417Tran_UsuarioCodigo = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      A422Tran_RegionDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      lblTextblock3_Jsonclick = "" ;
      A110Tran_ModuloOrigen = "" ;
      TempTags = "" ;
      AV17Alma_DescripcionOrigen = "" ;
      AV23Bode_DescripcionOrigen = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      lblTextblock1_Jsonclick = "" ;
      AV30Tran_RegionDescripcionDestino = "" ;
      AV28Tran_CentroCostoDescripcionDestino = "" ;
      A385Tran_ModuloDestino = "" ;
      AV16Alma_DescripcionDestino = "" ;
      AV22Bode_DescripcionDestino = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      AV35Masivo = "" ;
      A527Tran_TipoEntra = "" ;
      A672Tran_NombreIngreso = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      AV18Areadante = "" ;
      AV25Curso = "" ;
      A721Tran_NombreCuentadanteResponsa = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A416Tran_Observaciones = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      bttButton2_Jsonclick = "" ;
      bttButton1_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV53Atributos_GXI = "" ;
      scmdbuf = "" ;
      H00642_A416Tran_Observaciones = new String[] {""} ;
      H00642_n416Tran_Observaciones = new boolean[] {false} ;
      H00642_A37Cata_Codigo = new String[] {""} ;
      H00642_A47Tran_UsuarioId = new long[1] ;
      H00642_n47Tran_UsuarioId = new boolean[] {false} ;
      H00642_A50Tran_CentroCostoIdDestino = new long[1] ;
      H00642_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H00642_A57Tran_RegionId = new long[1] ;
      H00642_n57Tran_RegionId = new boolean[] {false} ;
      H00642_A518Tran_RegionIdDestino = new long[1] ;
      H00642_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H00642_A52Tran_IdCuentadanteDestino = new long[1] ;
      H00642_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H00642_A54Tran_TipoIngreso = new long[1] ;
      H00642_n54Tran_TipoIngreso = new boolean[] {false} ;
      H00642_A46Tran_Id = new long[1] ;
      H00642_A48Tran_CentroCostoId = new long[1] ;
      H00642_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00642_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00642_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00642_A387Tran_CodBodeDestino = new String[] {""} ;
      H00642_A408Tran_CursoCodigo = new String[] {""} ;
      H00642_n408Tran_CursoCodigo = new boolean[] {false} ;
      H00642_A407Tran_AreadanteCodigo = new String[] {""} ;
      H00642_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H00642_A481Tran_IndE_S = new String[] {""} ;
      H00642_n481Tran_IndE_S = new boolean[] {false} ;
      H00642_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H00642_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H00642_A519Tran_RegionCodigoDestino = new short[1] ;
      H00642_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      H00642_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H00642_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H00642_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H00642_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      H00642_A53Tran_IdProveedor = new long[1] ;
      H00642_n53Tran_IdProveedor = new boolean[] {false} ;
      H00642_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H00642_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H00642_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      H00642_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      H00642_A707Tran_SolicitaCCDestino = new String[] {""} ;
      H00642_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      H00642_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H00642_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H00642_A524Tran_Detalle = new String[] {""} ;
      H00642_n524Tran_Detalle = new boolean[] {false} ;
      H00642_A513Tran_ConsecutivoCC = new long[1] ;
      H00642_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H00642_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00642_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00642_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00642_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00642_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H00642_A391Tran_UsuarioRatifica = new String[] {""} ;
      H00642_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      H00642_A421Tran_RegionCodigo = new short[1] ;
      H00642_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00642_A422Tran_RegionDescripcion = new String[] {""} ;
      H00642_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00642_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H00642_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H00642_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H00642_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H00642_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00642_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H00642_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H00642_A110Tran_ModuloOrigen = new String[] {""} ;
      H00642_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H00642_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H00642_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H00642_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H00642_A703Tran_CedulaProveedor = new long[1] ;
      H00642_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H00642_A575Tran_NombreProveedor = new String[] {""} ;
      H00642_n575Tran_NombreProveedor = new boolean[] {false} ;
      H00642_A385Tran_ModuloDestino = new String[] {""} ;
      H00642_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H00642_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H00642_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H00642_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H00642_A527Tran_TipoEntra = new String[] {""} ;
      H00642_n527Tran_TipoEntra = new boolean[] {false} ;
      H00642_A672Tran_NombreIngreso = new String[] {""} ;
      H00642_n672Tran_NombreIngreso = new boolean[] {false} ;
      H00642_A514Tran_NumeroIngreso = new String[] {""} ;
      H00642_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H00642_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H00642_n515Tran_FechaIngreso = new boolean[] {false} ;
      H00642_A759Tran_CedulaResponsabilidad = new long[1] ;
      H00642_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      H00642_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      H00642_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      H00642_A719Tran_TransaccResponsabilidad = new long[1] ;
      H00642_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H00642_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H00642_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H00642_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00642_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H00642_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00642_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00642_n653TDet_Valor_Presente = new boolean[] {false} ;
      H00642_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00642_n657TDet_Otros_Costos = new boolean[] {false} ;
      H00642_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00642_A487TDet_Cantidad = new long[1] ;
      H00642_A491TDet_PlacaPadre = new String[] {""} ;
      H00642_n491TDet_PlacaPadre = new boolean[] {false} ;
      H00642_A490TDet_PlacaNumero = new String[] {""} ;
      H00642_n490TDet_PlacaNumero = new boolean[] {false} ;
      H00642_A298Cata_Descripcion = new String[] {""} ;
      H00642_A66Elem_Consecutivo = new String[] {""} ;
      H00642_A69TDet_Consecutivo = new long[1] ;
      A37Cata_Codigo = "" ;
      H00643_A416Tran_Observaciones = new String[] {""} ;
      H00643_n416Tran_Observaciones = new boolean[] {false} ;
      H00643_A47Tran_UsuarioId = new long[1] ;
      H00643_n47Tran_UsuarioId = new boolean[] {false} ;
      H00643_A50Tran_CentroCostoIdDestino = new long[1] ;
      H00643_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H00643_A57Tran_RegionId = new long[1] ;
      H00643_n57Tran_RegionId = new boolean[] {false} ;
      H00643_A518Tran_RegionIdDestino = new long[1] ;
      H00643_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H00643_A52Tran_IdCuentadanteDestino = new long[1] ;
      H00643_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H00643_A54Tran_TipoIngreso = new long[1] ;
      H00643_n54Tran_TipoIngreso = new boolean[] {false} ;
      H00643_A48Tran_CentroCostoId = new long[1] ;
      H00643_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H00643_A112Tran_CodBodeOrigen = new String[] {""} ;
      H00643_A111Tran_CodAlmaDestino = new String[] {""} ;
      H00643_A387Tran_CodBodeDestino = new String[] {""} ;
      H00643_A408Tran_CursoCodigo = new String[] {""} ;
      H00643_n408Tran_CursoCodigo = new boolean[] {false} ;
      H00643_A407Tran_AreadanteCodigo = new String[] {""} ;
      H00643_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H00643_A481Tran_IndE_S = new String[] {""} ;
      H00643_n481Tran_IndE_S = new boolean[] {false} ;
      H00643_A53Tran_IdProveedor = new long[1] ;
      H00643_n53Tran_IdProveedor = new boolean[] {false} ;
      H00643_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H00643_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H00643_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H00643_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H00643_A524Tran_Detalle = new String[] {""} ;
      H00643_n524Tran_Detalle = new boolean[] {false} ;
      H00643_A513Tran_ConsecutivoCC = new long[1] ;
      H00643_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H00643_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00643_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H00643_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H00643_A391Tran_UsuarioRatifica = new String[] {""} ;
      H00643_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      H00643_A49Tran_CodigoMovimiento = new String[] {""} ;
      H00643_A110Tran_ModuloOrigen = new String[] {""} ;
      H00643_A385Tran_ModuloDestino = new String[] {""} ;
      H00643_A527Tran_TipoEntra = new String[] {""} ;
      H00643_n527Tran_TipoEntra = new boolean[] {false} ;
      H00643_A514Tran_NumeroIngreso = new String[] {""} ;
      H00643_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H00643_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H00643_n515Tran_FechaIngreso = new boolean[] {false} ;
      H00643_A719Tran_TransaccResponsabilidad = new long[1] ;
      H00643_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H00643_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H00643_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H00643_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00643_n483Tran_ValorTransaccion = new boolean[] {false} ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A408Tran_CursoCodigo = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A481Tran_IndE_S = "" ;
      A524Tran_Detalle = "" ;
      H00644_A417Tran_UsuarioCodigo = new String[] {""} ;
      H00644_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H00645_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H00645_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H00645_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H00645_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      H00646_A421Tran_RegionCodigo = new short[1] ;
      H00646_n421Tran_RegionCodigo = new boolean[] {false} ;
      H00646_A422Tran_RegionDescripcion = new String[] {""} ;
      H00646_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H00647_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H00647_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H00647_A519Tran_RegionCodigoDestino = new short[1] ;
      H00647_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      A520Tran_RegionDescripcionDestino = "" ;
      H00648_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H00648_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H00648_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H00648_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H00649_A672Tran_NombreIngreso = new String[] {""} ;
      H00649_n672Tran_NombreIngreso = new boolean[] {false} ;
      H006410_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H006410_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H006410_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H006410_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H006411_A703Tran_CedulaProveedor = new long[1] ;
      H006411_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H006411_A575Tran_NombreProveedor = new String[] {""} ;
      H006411_n575Tran_NombreProveedor = new boolean[] {false} ;
      H006412_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H006412_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H006412_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H006412_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H006413_A759Tran_CedulaResponsabilidad = new long[1] ;
      H006413_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      H006413_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      H006413_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      H006414_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      H006414_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      H006414_A707Tran_SolicitaCCDestino = new String[] {""} ;
      H006414_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      H006414_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H006414_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      A708Tran_SolicitaRegionDestino = "" ;
      A707Tran_SolicitaCCDestino = "" ;
      AV32Usuario = "" ;
      AV34Websession = httpContext.getWebSession();
      AV6Alma_Modulo = "" ;
      AV5Alma_Codigo = "" ;
      AV15Alma_Descripcion = "" ;
      AV20Bode_Codigo = "" ;
      AV21Bode_Descripcion = "" ;
      AV12Tran_CursoCodigo = "" ;
      AV11Tran_AreadanteCodigo = "" ;
      H006415_A69TDet_Consecutivo = new long[1] ;
      H006415_A46Tran_Id = new long[1] ;
      H006415_A71Tran_Entrada = new long[1] ;
      H006415_A72Nro_Linea = new int[1] ;
      H006416_A28Alma_Codigo = new String[] {""} ;
      H006416_A27Alma_Modulo = new String[] {""} ;
      H006416_A1Cent_Id = new long[1] ;
      H006416_A252Alma_Descripcion = new String[] {""} ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A252Alma_Descripcion = "" ;
      H006417_A31Bode_Codigo = new String[] {""} ;
      H006417_A28Alma_Codigo = new String[] {""} ;
      H006417_A27Alma_Modulo = new String[] {""} ;
      H006417_A1Cent_Id = new long[1] ;
      H006417_A695BBode_Descripcion = new String[] {""} ;
      A31Bode_Codigo = "" ;
      A695BBode_Descripcion = "" ;
      AV9Curs_Descripcion = "" ;
      H006418_A73Curs_Codigo = new String[] {""} ;
      H006418_A424Curs_Descripcion = new String[] {""} ;
      A73Curs_Codigo = "" ;
      A424Curs_Descripcion = "" ;
      AV7Area_Descripcion = "" ;
      H006419_A59Area_Codigo = new String[] {""} ;
      H006419_A452Area_Descripcion = new String[] {""} ;
      A59Area_Codigo = "" ;
      A452Area_Descripcion = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpalm_consultatrn__default(),
         new Object[] {
             new Object[] {
            H00642_A416Tran_Observaciones, H00642_n416Tran_Observaciones, H00642_A37Cata_Codigo, H00642_A47Tran_UsuarioId, H00642_n47Tran_UsuarioId, H00642_A50Tran_CentroCostoIdDestino, H00642_n50Tran_CentroCostoIdDestino, H00642_A57Tran_RegionId, H00642_n57Tran_RegionId, H00642_A518Tran_RegionIdDestino,
            H00642_n518Tran_RegionIdDestino, H00642_A52Tran_IdCuentadanteDestino, H00642_n52Tran_IdCuentadanteDestino, H00642_A54Tran_TipoIngreso, H00642_n54Tran_TipoIngreso, H00642_A46Tran_Id, H00642_A48Tran_CentroCostoId, H00642_A109Tran_CodAlmaOrigen, H00642_A112Tran_CodBodeOrigen, H00642_A111Tran_CodAlmaDestino,
            H00642_A387Tran_CodBodeDestino, H00642_A408Tran_CursoCodigo, H00642_n408Tran_CursoCodigo, H00642_A407Tran_AreadanteCodigo, H00642_n407Tran_AreadanteCodigo, H00642_A481Tran_IndE_S, H00642_n481Tran_IndE_S, H00642_A520Tran_RegionDescripcionDestino, H00642_n520Tran_RegionDescripcionDestino, H00642_A519Tran_RegionCodigoDestino,
            H00642_n519Tran_RegionCodigoDestino, H00642_A517Tran_CentroCostoDescripcionDes, H00642_n517Tran_CentroCostoDescripcionDes, H00642_A516Tran_CentroCostoCodigoDestino, H00642_n516Tran_CentroCostoCodigoDestino, H00642_A53Tran_IdProveedor, H00642_n53Tran_IdProveedor, H00642_A51Tran_IdCuentadanteOrigen, H00642_n51Tran_IdCuentadanteOrigen, H00642_A708Tran_SolicitaRegionDestino,
            H00642_n708Tran_SolicitaRegionDestino, H00642_A707Tran_SolicitaCCDestino, H00642_n707Tran_SolicitaCCDestino, H00642_A56Tran_IdCuentadanteResponsabili, H00642_n56Tran_IdCuentadanteResponsabili, H00642_A524Tran_Detalle, H00642_n524Tran_Detalle, H00642_A513Tran_ConsecutivoCC, H00642_n513Tran_ConsecutivoCC, H00642_A55Tran_FechaRegistro,
            H00642_A417Tran_UsuarioCodigo, H00642_n417Tran_UsuarioCodigo, H00642_A390Tran_FechaRatificacion, H00642_n390Tran_FechaRatificacion, H00642_A391Tran_UsuarioRatifica, H00642_n391Tran_UsuarioRatifica, H00642_A421Tran_RegionCodigo, H00642_n421Tran_RegionCodigo, H00642_A422Tran_RegionDescripcion, H00642_n422Tran_RegionDescripcion,
            H00642_A419Tran_CentroCostoCodigo, H00642_n419Tran_CentroCostoCodigo, H00642_A420Tran_CentroCostoDescripcion, H00642_n420Tran_CentroCostoDescripcion, H00642_A49Tran_CodigoMovimiento, H00642_A381Tran_DescripcionMovimiento, H00642_n381Tran_DescripcionMovimiento, H00642_A110Tran_ModuloOrigen, H00642_A702Tran_CedulaCuentadanteOrigen, H00642_n702Tran_CedulaCuentadanteOrigen,
            H00642_A384Tran_NombCuentadanteOrigen, H00642_n384Tran_NombCuentadanteOrigen, H00642_A703Tran_CedulaProveedor, H00642_n703Tran_CedulaProveedor, H00642_A575Tran_NombreProveedor, H00642_n575Tran_NombreProveedor, H00642_A385Tran_ModuloDestino, H00642_A704Tran_CedulaCuentadanteDestino, H00642_n704Tran_CedulaCuentadanteDestino, H00642_A389Tran_NombCuentadanteDestino,
            H00642_n389Tran_NombCuentadanteDestino, H00642_A527Tran_TipoEntra, H00642_n527Tran_TipoEntra, H00642_A672Tran_NombreIngreso, H00642_n672Tran_NombreIngreso, H00642_A514Tran_NumeroIngreso, H00642_n514Tran_NumeroIngreso, H00642_A515Tran_FechaIngreso, H00642_n515Tran_FechaIngreso, H00642_A759Tran_CedulaResponsabilidad,
            H00642_n759Tran_CedulaResponsabilidad, H00642_A721Tran_NombreCuentadanteResponsa, H00642_n721Tran_NombreCuentadanteResponsa, H00642_A719Tran_TransaccResponsabilidad, H00642_n719Tran_TransaccResponsabilidad, H00642_A720Tran_FechaResponsabilidad, H00642_n720Tran_FechaResponsabilidad, H00642_A483Tran_ValorTransaccion, H00642_n483Tran_ValorTransaccion, H00642_A489TDet_ValorTotal,
            H00642_A653TDet_Valor_Presente, H00642_n653TDet_Valor_Presente, H00642_A657TDet_Otros_Costos, H00642_n657TDet_Otros_Costos, H00642_A488TDet_ValorUnitario, H00642_A487TDet_Cantidad, H00642_A491TDet_PlacaPadre, H00642_n491TDet_PlacaPadre, H00642_A490TDet_PlacaNumero, H00642_n490TDet_PlacaNumero,
            H00642_A298Cata_Descripcion, H00642_A66Elem_Consecutivo, H00642_A69TDet_Consecutivo
            }
            , new Object[] {
            H00643_A416Tran_Observaciones, H00643_n416Tran_Observaciones, H00643_A47Tran_UsuarioId, H00643_n47Tran_UsuarioId, H00643_A50Tran_CentroCostoIdDestino, H00643_n50Tran_CentroCostoIdDestino, H00643_A57Tran_RegionId, H00643_n57Tran_RegionId, H00643_A518Tran_RegionIdDestino, H00643_n518Tran_RegionIdDestino,
            H00643_A52Tran_IdCuentadanteDestino, H00643_n52Tran_IdCuentadanteDestino, H00643_A54Tran_TipoIngreso, H00643_n54Tran_TipoIngreso, H00643_A48Tran_CentroCostoId, H00643_A109Tran_CodAlmaOrigen, H00643_A112Tran_CodBodeOrigen, H00643_A111Tran_CodAlmaDestino, H00643_A387Tran_CodBodeDestino, H00643_A408Tran_CursoCodigo,
            H00643_n408Tran_CursoCodigo, H00643_A407Tran_AreadanteCodigo, H00643_n407Tran_AreadanteCodigo, H00643_A481Tran_IndE_S, H00643_n481Tran_IndE_S, H00643_A53Tran_IdProveedor, H00643_n53Tran_IdProveedor, H00643_A51Tran_IdCuentadanteOrigen, H00643_n51Tran_IdCuentadanteOrigen, H00643_A56Tran_IdCuentadanteResponsabili,
            H00643_n56Tran_IdCuentadanteResponsabili, H00643_A524Tran_Detalle, H00643_n524Tran_Detalle, H00643_A513Tran_ConsecutivoCC, H00643_n513Tran_ConsecutivoCC, H00643_A55Tran_FechaRegistro, H00643_A390Tran_FechaRatificacion, H00643_n390Tran_FechaRatificacion, H00643_A391Tran_UsuarioRatifica, H00643_n391Tran_UsuarioRatifica,
            H00643_A49Tran_CodigoMovimiento, H00643_A110Tran_ModuloOrigen, H00643_A385Tran_ModuloDestino, H00643_A527Tran_TipoEntra, H00643_n527Tran_TipoEntra, H00643_A514Tran_NumeroIngreso, H00643_n514Tran_NumeroIngreso, H00643_A515Tran_FechaIngreso, H00643_n515Tran_FechaIngreso, H00643_A719Tran_TransaccResponsabilidad,
            H00643_n719Tran_TransaccResponsabilidad, H00643_A720Tran_FechaResponsabilidad, H00643_n720Tran_FechaResponsabilidad, H00643_A483Tran_ValorTransaccion, H00643_n483Tran_ValorTransaccion
            }
            , new Object[] {
            H00644_A417Tran_UsuarioCodigo, H00644_n417Tran_UsuarioCodigo
            }
            , new Object[] {
            H00645_A517Tran_CentroCostoDescripcionDes, H00645_n517Tran_CentroCostoDescripcionDes, H00645_A516Tran_CentroCostoCodigoDestino, H00645_n516Tran_CentroCostoCodigoDestino
            }
            , new Object[] {
            H00646_A421Tran_RegionCodigo, H00646_n421Tran_RegionCodigo, H00646_A422Tran_RegionDescripcion, H00646_n422Tran_RegionDescripcion
            }
            , new Object[] {
            H00647_A520Tran_RegionDescripcionDestino, H00647_n520Tran_RegionDescripcionDestino, H00647_A519Tran_RegionCodigoDestino, H00647_n519Tran_RegionCodigoDestino
            }
            , new Object[] {
            H00648_A704Tran_CedulaCuentadanteDestino, H00648_n704Tran_CedulaCuentadanteDestino, H00648_A389Tran_NombCuentadanteDestino, H00648_n389Tran_NombCuentadanteDestino
            }
            , new Object[] {
            H00649_A672Tran_NombreIngreso, H00649_n672Tran_NombreIngreso
            }
            , new Object[] {
            H006410_A419Tran_CentroCostoCodigo, H006410_n419Tran_CentroCostoCodigo, H006410_A420Tran_CentroCostoDescripcion, H006410_n420Tran_CentroCostoDescripcion
            }
            , new Object[] {
            H006411_A703Tran_CedulaProveedor, H006411_n703Tran_CedulaProveedor, H006411_A575Tran_NombreProveedor, H006411_n575Tran_NombreProveedor
            }
            , new Object[] {
            H006412_A702Tran_CedulaCuentadanteOrigen, H006412_n702Tran_CedulaCuentadanteOrigen, H006412_A384Tran_NombCuentadanteOrigen, H006412_n384Tran_NombCuentadanteOrigen
            }
            , new Object[] {
            H006413_A759Tran_CedulaResponsabilidad, H006413_n759Tran_CedulaResponsabilidad, H006413_A721Tran_NombreCuentadanteResponsa, H006413_n721Tran_NombreCuentadanteResponsa
            }
            , new Object[] {
            H006414_A708Tran_SolicitaRegionDestino, H006414_n708Tran_SolicitaRegionDestino, H006414_A707Tran_SolicitaCCDestino, H006414_n707Tran_SolicitaCCDestino, H006414_A381Tran_DescripcionMovimiento, H006414_n381Tran_DescripcionMovimiento
            }
            , new Object[] {
            H006415_A69TDet_Consecutivo, H006415_A46Tran_Id, H006415_A71Tran_Entrada, H006415_A72Nro_Linea
            }
            , new Object[] {
            H006416_A28Alma_Codigo, H006416_A27Alma_Modulo, H006416_A1Cent_Id, H006416_A252Alma_Descripcion
            }
            , new Object[] {
            H006417_A31Bode_Codigo, H006417_A28Alma_Codigo, H006417_A27Alma_Modulo, H006417_A1Cent_Id, H006417_A695BBode_Descripcion
            }
            , new Object[] {
            H006418_A73Curs_Codigo, H006418_A424Curs_Descripcion
            }
            , new Object[] {
            H006419_A59Area_Codigo, H006419_A452Area_Descripcion
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavAlma_descripcionorigen_Enabled = 0 ;
      edtavBode_descripcionorigen_Enabled = 0 ;
      edtavTran_regiondescripciondestino_Enabled = 0 ;
      edtavTran_centrocostodescripciondestino_Enabled = 0 ;
      edtavAlma_descripciondestino_Enabled = 0 ;
      edtavBode_descripciondestino_Enabled = 0 ;
      edtavMasivo_Enabled = 0 ;
      edtavAreadante_Enabled = 0 ;
      edtavCurso_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_182 ;
   private short nGXsfl_182_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A421Tran_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A519Tran_RegionCodigoDestino ;
   private int A72Nro_Linea ;
   private int edtavToday_Visible ;
   private int edtavToday_Enabled ;
   private int edtTran_Id_Enabled ;
   private int edtTran_Id_Visible ;
   private int edtTran_ConsecutivoCC_Enabled ;
   private int edtTran_FechaRegistro_Enabled ;
   private int edtTran_UsuarioCodigo_Enabled ;
   private int edtTran_FechaRatificacion_Enabled ;
   private int edtTran_UsuarioRatifica_Enabled ;
   private int edtTran_RegionCodigo_Enabled ;
   private int edtTran_RegionDescripcion_Enabled ;
   private int edtTran_CentroCostoCodigo_Enabled ;
   private int edtTran_CentroCostoDescripcion_Enabled ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int edtTran_DescripcionMovimiento_Enabled ;
   private int edtTran_ModuloOrigen_Enabled ;
   private int edtavAlma_descripcionorigen_Enabled ;
   private int edtavBode_descripcionorigen_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Visible ;
   private int edtTran_NombCuentadanteOrigen_Visible ;
   private int edtTran_NombCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaProveedor_Enabled ;
   private int edtTran_CedulaProveedor_Visible ;
   private int edtTran_NombreProveedor_Visible ;
   private int edtTran_NombreProveedor_Enabled ;
   private int edtavTran_regiondescripciondestino_Visible ;
   private int edtavTran_regiondescripciondestino_Enabled ;
   private int edtavTran_centrocostodescripciondestino_Visible ;
   private int edtavTran_centrocostodescripciondestino_Enabled ;
   private int edtTran_ModuloDestino_Enabled ;
   private int edtavAlma_descripciondestino_Enabled ;
   private int edtavBode_descripciondestino_Enabled ;
   private int edtTran_CedulaCuentadanteDestino_Enabled ;
   private int edtTran_NombCuentadanteDestino_Enabled ;
   private int edtavMasivo_Enabled ;
   private int edtTran_NombreIngreso_Visible ;
   private int edtTran_NombreIngreso_Enabled ;
   private int edtTran_NumeroIngreso_Visible ;
   private int edtTran_NumeroIngreso_Enabled ;
   private int edtTran_FechaIngreso_Visible ;
   private int edtTran_FechaIngreso_Enabled ;
   private int edtavAreadante_Visible ;
   private int edtavAreadante_Enabled ;
   private int edtavCurso_Visible ;
   private int edtavCurso_Enabled ;
   private int edtTran_CedulaResponsabilidad_Enabled ;
   private int edtTran_CedulaResponsabilidad_Visible ;
   private int edtTran_NombreCuentadanteResponsa_Visible ;
   private int edtTran_NombreCuentadanteResponsa_Enabled ;
   private int edtTran_TransaccResponsabilidad_Enabled ;
   private int edtTran_TransaccResponsabilidad_Visible ;
   private int edtTran_FechaResponsabilidad_Visible ;
   private int edtTran_FechaResponsabilidad_Enabled ;
   private int edtTran_ValorTransaccion_Enabled ;
   private int edtTran_Observaciones_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int AV26Nro_Linea ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavAtributos_Enabled ;
   private int edtavAtributos_Visible ;
   private long wcpOA46Tran_Id ;
   private long A46Tran_Id ;
   private long AV13Tran_Id ;
   private long A71Tran_Entrada ;
   private long A513Tran_ConsecutivoCC ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A759Tran_CedulaResponsabilidad ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long A47Tran_UsuarioId ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A57Tran_RegionId ;
   private long A518Tran_RegionIdDestino ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A54Tran_TipoIngreso ;
   private long A48Tran_CentroCostoId ;
   private long A53Tran_IdProveedor ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long AV8Cent_Id ;
   private long AV10TDet_Consecutivo ;
   private long AV29Tran_Entrada ;
   private long A1Cent_Id ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_182_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable2_Internalname ;
   private String edtavToday_Internalname ;
   private String edtavToday_Jsonclick ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_FechaRatificacion_Internalname ;
   private String edtTran_FechaRatificacion_Jsonclick ;
   private String edtTran_UsuarioRatifica_Internalname ;
   private String edtTran_UsuarioRatifica_Jsonclick ;
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
   private String divTable3_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTran_ModuloOrigen_Internalname ;
   private String edtTran_ModuloOrigen_Jsonclick ;
   private String edtavAlma_descripcionorigen_Internalname ;
   private String TempTags ;
   private String edtavAlma_descripcionorigen_Jsonclick ;
   private String edtavBode_descripcionorigen_Internalname ;
   private String edtavBode_descripcionorigen_Jsonclick ;
   private String edtTran_CedulaCuentadanteOrigen_Internalname ;
   private String edtTran_CedulaCuentadanteOrigen_Jsonclick ;
   private String edtTran_NombCuentadanteOrigen_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Jsonclick ;
   private String edtTran_CedulaProveedor_Internalname ;
   private String edtTran_CedulaProveedor_Jsonclick ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String divTable4_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavTran_regiondescripciondestino_Internalname ;
   private String edtavTran_regiondescripciondestino_Jsonclick ;
   private String edtavTran_centrocostodescripciondestino_Internalname ;
   private String edtavTran_centrocostodescripciondestino_Jsonclick ;
   private String edtTran_ModuloDestino_Internalname ;
   private String edtTran_ModuloDestino_Jsonclick ;
   private String edtavAlma_descripciondestino_Internalname ;
   private String edtavAlma_descripciondestino_Jsonclick ;
   private String edtavBode_descripciondestino_Internalname ;
   private String edtavBode_descripciondestino_Jsonclick ;
   private String edtTran_CedulaCuentadanteDestino_Internalname ;
   private String edtTran_CedulaCuentadanteDestino_Jsonclick ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String divTable6_Internalname ;
   private String edtavMasivo_Internalname ;
   private String AV35Masivo ;
   private String edtavMasivo_Jsonclick ;
   private String A527Tran_TipoEntra ;
   private String divTable5_Internalname ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String A514Tran_NumeroIngreso ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_FechaIngreso_Internalname ;
   private String edtTran_FechaIngreso_Jsonclick ;
   private String edtavAreadante_Internalname ;
   private String edtavAreadante_Jsonclick ;
   private String edtavCurso_Internalname ;
   private String edtavCurso_Jsonclick ;
   private String edtTran_CedulaResponsabilidad_Internalname ;
   private String edtTran_CedulaResponsabilidad_Jsonclick ;
   private String edtTran_NombreCuentadanteResponsa_Internalname ;
   private String edtTran_NombreCuentadanteResponsa_Jsonclick ;
   private String edtTran_TransaccResponsabilidad_Internalname ;
   private String edtTran_TransaccResponsabilidad_Jsonclick ;
   private String edtTran_FechaResponsabilidad_Internalname ;
   private String edtTran_FechaResponsabilidad_Jsonclick ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_Observaciones_Internalname ;
   private String divTable1_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtTDet_PlacaNumero_Internalname ;
   private String edtTDet_PlacaPadre_Internalname ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_Otros_Costos_Internalname ;
   private String edtTDet_Valor_Presente_Internalname ;
   private String edtTDet_ValorTotal_Internalname ;
   private String edtavAtributos_Internalname ;
   private String scmdbuf ;
   private String A524Tran_Detalle ;
   private String sGXsfl_182_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtTDet_PlacaNumero_Jsonclick ;
   private String edtTDet_PlacaPadre_Jsonclick ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_Otros_Costos_Jsonclick ;
   private String edtTDet_Valor_Presente_Jsonclick ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String sImgUrl ;
   private String edtavAtributos_Jsonclick ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date Gx_date ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n653TDet_Valor_Presente ;
   private boolean bGXsfl_182_Refreshing=false ;
   private boolean n527Tran_TipoEntra ;
   private boolean n416Tran_Observaciones ;
   private boolean n47Tran_UsuarioId ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n57Tran_RegionId ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n481Tran_IndE_S ;
   private boolean n53Tran_IdProveedor ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n524Tran_Detalle ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n759Tran_CedulaResponsabilidad ;
   private boolean n721Tran_NombreCuentadanteResponsa ;
   private boolean n708Tran_SolicitaRegionDestino ;
   private boolean n707Tran_SolicitaCCDestino ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean returnInSub ;
   private boolean AV19Atributos_IsBlob ;
   private String A416Tran_Observaciones ;
   private String AV14Tran_IndE_S ;
   private String A417Tran_UsuarioCodigo ;
   private String A391Tran_UsuarioRatifica ;
   private String A422Tran_RegionDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String AV17Alma_DescripcionOrigen ;
   private String AV23Bode_DescripcionOrigen ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String AV30Tran_RegionDescripcionDestino ;
   private String AV28Tran_CentroCostoDescripcionDestino ;
   private String A385Tran_ModuloDestino ;
   private String AV16Alma_DescripcionDestino ;
   private String AV22Bode_DescripcionDestino ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A672Tran_NombreIngreso ;
   private String AV18Areadante ;
   private String AV25Curso ;
   private String A721Tran_NombreCuentadanteResponsa ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String AV53Atributos_GXI ;
   private String A37Cata_Codigo ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A408Tran_CursoCodigo ;
   private String A407Tran_AreadanteCodigo ;
   private String A481Tran_IndE_S ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A708Tran_SolicitaRegionDestino ;
   private String A707Tran_SolicitaCCDestino ;
   private String AV32Usuario ;
   private String AV6Alma_Modulo ;
   private String AV5Alma_Codigo ;
   private String AV15Alma_Descripcion ;
   private String AV20Bode_Codigo ;
   private String AV21Bode_Descripcion ;
   private String AV12Tran_CursoCodigo ;
   private String AV11Tran_AreadanteCodigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String A695BBode_Descripcion ;
   private String AV9Curs_Descripcion ;
   private String A73Curs_Codigo ;
   private String A424Curs_Descripcion ;
   private String AV7Area_Descripcion ;
   private String A59Area_Codigo ;
   private String A452Area_Descripcion ;
   private String AV19Atributos ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV34Websession ;
   private HTMLChoice cmbTran_TipoEntra ;
   private IDataStoreProvider pr_default ;
   private String[] H00642_A416Tran_Observaciones ;
   private boolean[] H00642_n416Tran_Observaciones ;
   private String[] H00642_A37Cata_Codigo ;
   private long[] H00642_A47Tran_UsuarioId ;
   private boolean[] H00642_n47Tran_UsuarioId ;
   private long[] H00642_A50Tran_CentroCostoIdDestino ;
   private boolean[] H00642_n50Tran_CentroCostoIdDestino ;
   private long[] H00642_A57Tran_RegionId ;
   private boolean[] H00642_n57Tran_RegionId ;
   private long[] H00642_A518Tran_RegionIdDestino ;
   private boolean[] H00642_n518Tran_RegionIdDestino ;
   private long[] H00642_A52Tran_IdCuentadanteDestino ;
   private boolean[] H00642_n52Tran_IdCuentadanteDestino ;
   private long[] H00642_A54Tran_TipoIngreso ;
   private boolean[] H00642_n54Tran_TipoIngreso ;
   private long[] H00642_A46Tran_Id ;
   private long[] H00642_A48Tran_CentroCostoId ;
   private String[] H00642_A109Tran_CodAlmaOrigen ;
   private String[] H00642_A112Tran_CodBodeOrigen ;
   private String[] H00642_A111Tran_CodAlmaDestino ;
   private String[] H00642_A387Tran_CodBodeDestino ;
   private String[] H00642_A408Tran_CursoCodigo ;
   private boolean[] H00642_n408Tran_CursoCodigo ;
   private String[] H00642_A407Tran_AreadanteCodigo ;
   private boolean[] H00642_n407Tran_AreadanteCodigo ;
   private String[] H00642_A481Tran_IndE_S ;
   private boolean[] H00642_n481Tran_IndE_S ;
   private String[] H00642_A520Tran_RegionDescripcionDestino ;
   private boolean[] H00642_n520Tran_RegionDescripcionDestino ;
   private short[] H00642_A519Tran_RegionCodigoDestino ;
   private boolean[] H00642_n519Tran_RegionCodigoDestino ;
   private String[] H00642_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H00642_n517Tran_CentroCostoDescripcionDes ;
   private String[] H00642_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H00642_n516Tran_CentroCostoCodigoDestino ;
   private long[] H00642_A53Tran_IdProveedor ;
   private boolean[] H00642_n53Tran_IdProveedor ;
   private long[] H00642_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H00642_n51Tran_IdCuentadanteOrigen ;
   private String[] H00642_A708Tran_SolicitaRegionDestino ;
   private boolean[] H00642_n708Tran_SolicitaRegionDestino ;
   private String[] H00642_A707Tran_SolicitaCCDestino ;
   private boolean[] H00642_n707Tran_SolicitaCCDestino ;
   private long[] H00642_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H00642_n56Tran_IdCuentadanteResponsabili ;
   private String[] H00642_A524Tran_Detalle ;
   private boolean[] H00642_n524Tran_Detalle ;
   private long[] H00642_A513Tran_ConsecutivoCC ;
   private boolean[] H00642_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H00642_A55Tran_FechaRegistro ;
   private String[] H00642_A417Tran_UsuarioCodigo ;
   private boolean[] H00642_n417Tran_UsuarioCodigo ;
   private java.util.Date[] H00642_A390Tran_FechaRatificacion ;
   private boolean[] H00642_n390Tran_FechaRatificacion ;
   private String[] H00642_A391Tran_UsuarioRatifica ;
   private boolean[] H00642_n391Tran_UsuarioRatifica ;
   private short[] H00642_A421Tran_RegionCodigo ;
   private boolean[] H00642_n421Tran_RegionCodigo ;
   private String[] H00642_A422Tran_RegionDescripcion ;
   private boolean[] H00642_n422Tran_RegionDescripcion ;
   private String[] H00642_A419Tran_CentroCostoCodigo ;
   private boolean[] H00642_n419Tran_CentroCostoCodigo ;
   private String[] H00642_A420Tran_CentroCostoDescripcion ;
   private boolean[] H00642_n420Tran_CentroCostoDescripcion ;
   private String[] H00642_A49Tran_CodigoMovimiento ;
   private String[] H00642_A381Tran_DescripcionMovimiento ;
   private boolean[] H00642_n381Tran_DescripcionMovimiento ;
   private String[] H00642_A110Tran_ModuloOrigen ;
   private long[] H00642_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H00642_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H00642_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H00642_n384Tran_NombCuentadanteOrigen ;
   private long[] H00642_A703Tran_CedulaProveedor ;
   private boolean[] H00642_n703Tran_CedulaProveedor ;
   private String[] H00642_A575Tran_NombreProveedor ;
   private boolean[] H00642_n575Tran_NombreProveedor ;
   private String[] H00642_A385Tran_ModuloDestino ;
   private long[] H00642_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H00642_n704Tran_CedulaCuentadanteDestino ;
   private String[] H00642_A389Tran_NombCuentadanteDestino ;
   private boolean[] H00642_n389Tran_NombCuentadanteDestino ;
   private String[] H00642_A527Tran_TipoEntra ;
   private boolean[] H00642_n527Tran_TipoEntra ;
   private String[] H00642_A672Tran_NombreIngreso ;
   private boolean[] H00642_n672Tran_NombreIngreso ;
   private String[] H00642_A514Tran_NumeroIngreso ;
   private boolean[] H00642_n514Tran_NumeroIngreso ;
   private java.util.Date[] H00642_A515Tran_FechaIngreso ;
   private boolean[] H00642_n515Tran_FechaIngreso ;
   private long[] H00642_A759Tran_CedulaResponsabilidad ;
   private boolean[] H00642_n759Tran_CedulaResponsabilidad ;
   private String[] H00642_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] H00642_n721Tran_NombreCuentadanteResponsa ;
   private long[] H00642_A719Tran_TransaccResponsabilidad ;
   private boolean[] H00642_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] H00642_A720Tran_FechaResponsabilidad ;
   private boolean[] H00642_n720Tran_FechaResponsabilidad ;
   private java.math.BigDecimal[] H00642_A483Tran_ValorTransaccion ;
   private boolean[] H00642_n483Tran_ValorTransaccion ;
   private java.math.BigDecimal[] H00642_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H00642_A653TDet_Valor_Presente ;
   private boolean[] H00642_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] H00642_A657TDet_Otros_Costos ;
   private boolean[] H00642_n657TDet_Otros_Costos ;
   private java.math.BigDecimal[] H00642_A488TDet_ValorUnitario ;
   private long[] H00642_A487TDet_Cantidad ;
   private String[] H00642_A491TDet_PlacaPadre ;
   private boolean[] H00642_n491TDet_PlacaPadre ;
   private String[] H00642_A490TDet_PlacaNumero ;
   private boolean[] H00642_n490TDet_PlacaNumero ;
   private String[] H00642_A298Cata_Descripcion ;
   private String[] H00642_A66Elem_Consecutivo ;
   private long[] H00642_A69TDet_Consecutivo ;
   private String[] H00643_A416Tran_Observaciones ;
   private boolean[] H00643_n416Tran_Observaciones ;
   private long[] H00643_A47Tran_UsuarioId ;
   private boolean[] H00643_n47Tran_UsuarioId ;
   private long[] H00643_A50Tran_CentroCostoIdDestino ;
   private boolean[] H00643_n50Tran_CentroCostoIdDestino ;
   private long[] H00643_A57Tran_RegionId ;
   private boolean[] H00643_n57Tran_RegionId ;
   private long[] H00643_A518Tran_RegionIdDestino ;
   private boolean[] H00643_n518Tran_RegionIdDestino ;
   private long[] H00643_A52Tran_IdCuentadanteDestino ;
   private boolean[] H00643_n52Tran_IdCuentadanteDestino ;
   private long[] H00643_A54Tran_TipoIngreso ;
   private boolean[] H00643_n54Tran_TipoIngreso ;
   private long[] H00643_A48Tran_CentroCostoId ;
   private String[] H00643_A109Tran_CodAlmaOrigen ;
   private String[] H00643_A112Tran_CodBodeOrigen ;
   private String[] H00643_A111Tran_CodAlmaDestino ;
   private String[] H00643_A387Tran_CodBodeDestino ;
   private String[] H00643_A408Tran_CursoCodigo ;
   private boolean[] H00643_n408Tran_CursoCodigo ;
   private String[] H00643_A407Tran_AreadanteCodigo ;
   private boolean[] H00643_n407Tran_AreadanteCodigo ;
   private String[] H00643_A481Tran_IndE_S ;
   private boolean[] H00643_n481Tran_IndE_S ;
   private long[] H00643_A53Tran_IdProveedor ;
   private boolean[] H00643_n53Tran_IdProveedor ;
   private long[] H00643_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H00643_n51Tran_IdCuentadanteOrigen ;
   private long[] H00643_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H00643_n56Tran_IdCuentadanteResponsabili ;
   private String[] H00643_A524Tran_Detalle ;
   private boolean[] H00643_n524Tran_Detalle ;
   private long[] H00643_A513Tran_ConsecutivoCC ;
   private boolean[] H00643_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H00643_A55Tran_FechaRegistro ;
   private java.util.Date[] H00643_A390Tran_FechaRatificacion ;
   private boolean[] H00643_n390Tran_FechaRatificacion ;
   private String[] H00643_A391Tran_UsuarioRatifica ;
   private boolean[] H00643_n391Tran_UsuarioRatifica ;
   private String[] H00643_A49Tran_CodigoMovimiento ;
   private String[] H00643_A110Tran_ModuloOrigen ;
   private String[] H00643_A385Tran_ModuloDestino ;
   private String[] H00643_A527Tran_TipoEntra ;
   private boolean[] H00643_n527Tran_TipoEntra ;
   private String[] H00643_A514Tran_NumeroIngreso ;
   private boolean[] H00643_n514Tran_NumeroIngreso ;
   private java.util.Date[] H00643_A515Tran_FechaIngreso ;
   private boolean[] H00643_n515Tran_FechaIngreso ;
   private long[] H00643_A719Tran_TransaccResponsabilidad ;
   private boolean[] H00643_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] H00643_A720Tran_FechaResponsabilidad ;
   private boolean[] H00643_n720Tran_FechaResponsabilidad ;
   private java.math.BigDecimal[] H00643_A483Tran_ValorTransaccion ;
   private boolean[] H00643_n483Tran_ValorTransaccion ;
   private String[] H00644_A417Tran_UsuarioCodigo ;
   private boolean[] H00644_n417Tran_UsuarioCodigo ;
   private String[] H00645_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H00645_n517Tran_CentroCostoDescripcionDes ;
   private String[] H00645_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H00645_n516Tran_CentroCostoCodigoDestino ;
   private short[] H00646_A421Tran_RegionCodigo ;
   private boolean[] H00646_n421Tran_RegionCodigo ;
   private String[] H00646_A422Tran_RegionDescripcion ;
   private boolean[] H00646_n422Tran_RegionDescripcion ;
   private String[] H00647_A520Tran_RegionDescripcionDestino ;
   private boolean[] H00647_n520Tran_RegionDescripcionDestino ;
   private short[] H00647_A519Tran_RegionCodigoDestino ;
   private boolean[] H00647_n519Tran_RegionCodigoDestino ;
   private long[] H00648_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H00648_n704Tran_CedulaCuentadanteDestino ;
   private String[] H00648_A389Tran_NombCuentadanteDestino ;
   private boolean[] H00648_n389Tran_NombCuentadanteDestino ;
   private String[] H00649_A672Tran_NombreIngreso ;
   private boolean[] H00649_n672Tran_NombreIngreso ;
   private String[] H006410_A419Tran_CentroCostoCodigo ;
   private boolean[] H006410_n419Tran_CentroCostoCodigo ;
   private String[] H006410_A420Tran_CentroCostoDescripcion ;
   private boolean[] H006410_n420Tran_CentroCostoDescripcion ;
   private long[] H006411_A703Tran_CedulaProveedor ;
   private boolean[] H006411_n703Tran_CedulaProveedor ;
   private String[] H006411_A575Tran_NombreProveedor ;
   private boolean[] H006411_n575Tran_NombreProveedor ;
   private long[] H006412_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H006412_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H006412_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H006412_n384Tran_NombCuentadanteOrigen ;
   private long[] H006413_A759Tran_CedulaResponsabilidad ;
   private boolean[] H006413_n759Tran_CedulaResponsabilidad ;
   private String[] H006413_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] H006413_n721Tran_NombreCuentadanteResponsa ;
   private String[] H006414_A708Tran_SolicitaRegionDestino ;
   private boolean[] H006414_n708Tran_SolicitaRegionDestino ;
   private String[] H006414_A707Tran_SolicitaCCDestino ;
   private boolean[] H006414_n707Tran_SolicitaCCDestino ;
   private String[] H006414_A381Tran_DescripcionMovimiento ;
   private boolean[] H006414_n381Tran_DescripcionMovimiento ;
   private long[] H006415_A69TDet_Consecutivo ;
   private long[] H006415_A46Tran_Id ;
   private long[] H006415_A71Tran_Entrada ;
   private int[] H006415_A72Nro_Linea ;
   private String[] H006416_A28Alma_Codigo ;
   private String[] H006416_A27Alma_Modulo ;
   private long[] H006416_A1Cent_Id ;
   private String[] H006416_A252Alma_Descripcion ;
   private String[] H006417_A31Bode_Codigo ;
   private String[] H006417_A28Alma_Codigo ;
   private String[] H006417_A27Alma_Modulo ;
   private long[] H006417_A1Cent_Id ;
   private String[] H006417_A695BBode_Descripcion ;
   private String[] H006418_A73Curs_Codigo ;
   private String[] H006418_A424Curs_Descripcion ;
   private String[] H006419_A59Area_Codigo ;
   private String[] H006419_A452Area_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpalm_consultatrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00642", "SELECT T4.Tran_Observaciones, T2.Cata_Codigo, T4.Tran_UsuarioId AS Tran_UsuarioId, T4.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T4.Tran_RegionId AS Tran_RegionId, T4.Tran_RegionIdDestino AS Tran_RegionIdDestino, T4.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, T4.Tran_TipoIngreso AS Tran_TipoIngreso, T1.Tran_Id, T4.Tran_CentroCostoId AS Tran_CentroCostoId, T4.Tran_CodAlmaOrigen, T4.Tran_CodBodeOrigen, T4.Tran_CodAlmaDestino, T4.Tran_CodBodeDestino, T4.Tran_CursoCodigo, T4.Tran_AreadanteCodigo, T4.Tran_IndE_S AS Tran_IndE_S, T8.Regi_Descripcion AS Tran_RegionDescripcionDestino, T8.Regi_Cod AS Tran_RegionCodigoDestino, T6.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, T6.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T4.Tran_IdProveedor AS Tran_IdProveedor, T4.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T15.Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, T15.Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, T4.Tran_IdCuentadanteResponsabili AS Tran_IdCuentadanteResponsabili, T4.Tran_Detalle, T4.Tran_ConsecutivoCC, T4.Tran_FechaRegistro, T5.Usua_Codigo AS Tran_UsuarioCodigo, T4.Tran_FechaRatificacion, T4.Tran_UsuarioRatifica, T7.Regi_Cod AS Tran_RegionCodigo, T7.Regi_Descripcion AS Tran_RegionDescripcion, T11.Cent_Codigo AS Tran_CentroCostoCodigo, T11.Cent_Descripcion AS Tran_CentroCostoDescripcion, T4.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T15.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T4.Tran_ModuloOrigen, T13.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T13.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T12.Cuen_Cedula AS Tran_CedulaProveedor, T12.Cuen_Nombre AS Tran_NombreProveedor, T4.Tran_ModuloDestino, T9.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T9.Cuen_Nombre AS Tran_NombCuentadanteDestino, T4.Tran_TipoEntra, T10.Orig_Descripcion AS Tran_NombreIngreso, T4.Tran_NumeroIngreso, T4.Tran_FechaIngreso, T14.Cuen_Cedula AS Tran_CedulaResponsabilidad, T14.Cuen_Nombre AS Tran_NombreCuentadanteResponsa, T4.Tran_TransaccResponsabilidad, T4.Tran_FechaResponsabilidad, T4.Tran_ValorTransaccion, T1.TDet_ValorTotal, T1.TDet_Valor_Presente, T1.TDet_Otros_Costos, T1.TDet_ValorUnitario, T1.TDet_Cantidad, T1.TDet_PlacaPadre, T1.TDet_PlacaNumero, T3.Cata_Descripcion, T1.Elem_Consecutivo, T1.TDet_Consecutivo FROM ((((((((((((((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_TRANSACCION T4 ON T4.Tran_Id = T1.Tran_Id) LEFT JOIN SEG_USUARIO T5 ON T5.Usua_Id = T4.Tran_UsuarioId) LEFT JOIN GEN_CENTROCOSTO T6 ON T6.Cent_Id = T4.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T7 ON T7.Regi_Id = T4.Tran_RegionId) LEFT JOIN GEN_REGIONAL T8 ON T8.Regi_Id = T4.Tran_RegionIdDestino) LEFT JOIN ALM_CUENTADANTE T9 ON T9.Cuen_Identificacion = T4.Tran_IdCuentadanteDestino) LEFT JOIN ALM_ORIGEN_BIENES T10 ON T10.Orig_Identificador = T4.Tran_TipoIngreso) INNER JOIN GEN_CENTROCOSTO T11 ON T11.Cent_Id = T4.Tran_CentroCostoId) LEFT JOIN ALM_CUENTADANTE T12 ON T12.Cuen_Identificacion = T4.Tran_IdProveedor) LEFT JOIN ALM_CUENTADANTE T13 ON T13.Cuen_Identificacion = T4.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T14 ON T14.Cuen_Identificacion = T4.Tran_IdCuentadanteResponsabili) INNER JOIN ALM_TIPO_MOVIMIENTO T15 ON T15.Tpmo_Codigo = T4.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00643", "SELECT Tran_Observaciones, Tran_UsuarioId, Tran_CentroCostoIdDestino, Tran_RegionId, Tran_RegionIdDestino, Tran_IdCuentadanteDestino, Tran_TipoIngreso, Tran_CentroCostoId, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_CursoCodigo, Tran_AreadanteCodigo, Tran_IndE_S, Tran_IdProveedor, Tran_IdCuentadanteOrigen, Tran_IdCuentadanteResponsabili, Tran_Detalle, Tran_ConsecutivoCC, Tran_FechaRegistro, Tran_FechaRatificacion, Tran_UsuarioRatifica, Tran_CodigoMovimiento, Tran_ModuloOrigen, Tran_ModuloDestino, Tran_TipoEntra, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_ValorTransaccion FROM ALM_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00644", "SELECT Usua_Codigo AS Tran_UsuarioCodigo FROM SEG_USUARIO WHERE Usua_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00645", "SELECT Cent_Descripcion AS Tran_CentroCostoDescripcionDes, Cent_Codigo AS Tran_CentroCostoCodigoDestino FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00646", "SELECT Regi_Cod AS Tran_RegionCodigo, Regi_Descripcion AS Tran_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00647", "SELECT Regi_Descripcion AS Tran_RegionDescripcionDestino, Regi_Cod AS Tran_RegionCodigoDestino FROM GEN_REGIONAL WHERE Regi_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00648", "SELECT Cuen_Cedula AS Tran_CedulaCuentadanteDestino, Cuen_Nombre AS Tran_NombCuentadanteDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00649", "SELECT Orig_Descripcion AS Tran_NombreIngreso FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006410", "SELECT Cent_Codigo AS Tran_CentroCostoCodigo, Cent_Descripcion AS Tran_CentroCostoDescripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006411", "SELECT Cuen_Cedula AS Tran_CedulaProveedor, Cuen_Nombre AS Tran_NombreProveedor FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006412", "SELECT Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, Cuen_Nombre AS Tran_NombCuentadanteOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006413", "SELECT Cuen_Cedula AS Tran_CedulaResponsabilidad, Cuen_Nombre AS Tran_NombreCuentadanteResponsa FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006414", "SELECT Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, Tpmo_Descripcion AS Tran_DescripcionMovimiento FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006415", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006416", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006417", "SELECT Bode_Codigo, Alma_Codigo, Alma_Modulo, Cent_Id, BBode_Descripcion FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006418", "SELECT Curs_Codigo, Curs_Descripcion FROM ALM_CURSOS WHERE Curs_Codigo = ? ORDER BY Curs_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006419", "SELECT Area_Codigo, Area_Descripcion FROM ALM_AREADANTE WHERE Area_Codigo = ? ORDER BY Area_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((long[]) buf[43])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(27, 1) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(29) ;
               ((String[]) buf[50])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(33) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(37) ;
               ((String[]) buf[65])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(39) ;
               ((long[]) buf[68])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((long[]) buf[72])[0] = rslt.getLong(42) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(44) ;
               ((long[]) buf[77])[0] = rslt.getLong(45) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(47, 4) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(48) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(49, 30) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[87])[0] = rslt.getGXDate(50) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((long[]) buf[89])[0] = rslt.getLong(51) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(52) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((long[]) buf[93])[0] = rslt.getLong(53) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[95])[0] = rslt.getGXDate(54) ;
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(55,2) ;
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(56,2) ;
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(57,2) ;
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(58,2) ;
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(59,2) ;
               ((long[]) buf[105])[0] = rslt.getLong(60) ;
               ((String[]) buf[106])[0] = rslt.getVarchar(61) ;
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getVarchar(62) ;
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getVarchar(63) ;
               ((String[]) buf[111])[0] = rslt.getVarchar(64) ;
               ((long[]) buf[112])[0] = rslt.getLong(65) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(21) ;
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((String[]) buf[41])[0] = rslt.getVarchar(25) ;
               ((String[]) buf[42])[0] = rslt.getVarchar(26) ;
               ((String[]) buf[43])[0] = rslt.getString(27, 4) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(28, 30) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(29) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(31) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(32,2) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 41);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
      }
   }

}

