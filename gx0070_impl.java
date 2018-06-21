/*
               File: gx0070_impl
        Description: Selection List TRANSACCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:20.40
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

public final  class gx0070_impl extends GXDataArea
{
   public gx0070_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0070_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0070_impl.class ));
   }

   public gx0070_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtran_inde_s = new HTMLChoice();
      cmbTran_TipoElemento = new HTMLChoice();
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
            AV6cTran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cTran_FechaRegistro = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV8cTran_UsuarioId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cTran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cTran_RegionId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11cTran_CodigoMovimiento = httpContext.GetNextPar( ) ;
            AV12cTran_IndE_S = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
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
            AV13pTran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
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
      pa8E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8E2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414242048");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx0070") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTran_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV6cTran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_FECHAREGISTRO", localUtil.ttoc( AV7cTran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_USUARIOID", GXutil.ltrim( localUtil.ntoc( AV8cTran_UsuarioId, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV9cTran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_REGIONID", GXutil.ltrim( localUtil.ntoc( AV10cTran_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_CODIGOMOVIMIENTO", AV11cTran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRAN_INDE_S", AV12cTran_IndE_S);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV13pTran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDFILTERCONTAINER_Class", GXutil.rtrim( divTran_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTROFILTERCONTAINER_Class", GXutil.rtrim( divTran_fecharegistrofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_USUARIOIDFILTERCONTAINER_Class", GXutil.rtrim( divTran_usuarioidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOIDFILTERCONTAINER_Class", GXutil.rtrim( divTran_centrocostoidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONIDFILTERCONTAINER_Class", GXutil.rtrim( divTran_regionidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divTran_codigomovimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_INDE_SFILTERCONTAINER_Class", GXutil.rtrim( divTran_inde_sfiltercontainer_Class));
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
         we8E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8E2( ) ;
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
      return formatLink("com.orions2.gx0070") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx0070" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List TRANSACCION" ;
   }

   public void wb8E0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_idfilter_Internalname, "Identificador", "", "", lblLbltran_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cTran_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCtran_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cTran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cTran_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_id_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_id_Visible, edtavCtran_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_fecharegistrofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_fecharegistrofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_fecharegistrofilter_Internalname, "Fecha de Registro", "", "", lblLbltran_fecharegistrofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128e1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_fecharegistro_Internalname, "Fecha de Registro", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtran_fecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_fecharegistro_Internalname, localUtil.ttoc( AV7cTran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV7cTran_FechaRegistro, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_fecharegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCtran_fecharegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_usuarioidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_usuarioidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_usuarioidfilter_Internalname, "Transacción Id Usuario", "", "", lblLbltran_usuarioidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_usuarioid_Internalname, "Transacción Id Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_usuarioid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cTran_UsuarioId, (byte)(18), (byte)(0), ",", "")), ((edtavCtran_usuarioid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cTran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cTran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_usuarioid_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_usuarioid_Visible, edtavCtran_usuarioid_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_centrocostoidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_centrocostoidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_centrocostoidfilter_Internalname, "Transacción Id C.C", "", "", lblLbltran_centrocostoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_centrocostoid_Internalname, "Transacción Id C.C", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_centrocostoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cTran_CentroCostoId, (byte)(11), (byte)(0), ",", "")), ((edtavCtran_centrocostoid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cTran_CentroCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cTran_CentroCostoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_centrocostoid_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_centrocostoid_Visible, edtavCtran_centrocostoid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_regionidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_regionidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_regionidfilter_Internalname, "Transacción Id Región", "", "", lblLbltran_regionidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_regionid_Internalname, "Transacción Id Región", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_regionid_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cTran_RegionId, (byte)(11), (byte)(0), ",", "")), ((edtavCtran_regionid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cTran_RegionId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cTran_RegionId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_regionid_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_regionid_Visible, edtavCtran_regionid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_codigomovimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_codigomovimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_codigomovimientofilter_Internalname, "Código Movimiento", "", "", lblLbltran_codigomovimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_codigomovimiento_Internalname, "Código Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_codigomovimiento_Internalname, AV11cTran_CodigoMovimiento, GXutil.rtrim( localUtil.format( AV11cTran_CodigoMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_codigomovimiento_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_codigomovimiento_Visible, edtavCtran_codigomovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx0070.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_inde_sfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_inde_sfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_inde_sfilter_Internalname, "Indicador Entrada/Salida", "", "", lblLbltran_inde_sfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx0070.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtran_inde_s.getInternalname(), "Indicador Entrada/Salida", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtran_inde_s, cmbavCtran_inde_s.getInternalname(), GXutil.rtrim( AV12cTran_IndE_S), 1, cmbavCtran_inde_s.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtran_inde_s.getVisible(), cmbavCtran_inde_s.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx0070.htm");
         cmbavCtran_inde_s.setValue( GXutil.rtrim( AV12cTran_IndE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtran_inde_s.getInternalname(), "Values", cmbavCtran_inde_s.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188e1_client"+"'", TempTags, "", 2, "HLP_Gx0070.htm");
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
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Registro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Elemento") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A49Tran_CodigoMovimiento);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A482Tran_TipoElemento));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0070.htm");
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

   public void start8E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List TRANSACCION", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8E0( ) ;
   }

   public void ws8E2( )
   {
      start8E2( ) ;
      evt8E2( ) ;
   }

   public void evt8E2( )
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
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
                           A47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") ;
                           n47Tran_UsuarioId = false ;
                           A48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") ;
                           A57Tran_RegionId = localUtil.ctol( httpContext.cgiGet( edtTran_RegionId_Internalname), ",", ".") ;
                           n57Tran_RegionId = false ;
                           A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
                           cmbTran_TipoElemento.setName( cmbTran_TipoElemento.getInternalname() );
                           cmbTran_TipoElemento.setValue( httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) );
                           A482Tran_TipoElemento = httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctran_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_ID"), ",", ".") != AV6cTran_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_fecharegistro Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCTRAN_FECHAREGISTRO"), 0), AV7cTran_FechaRegistro) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_usuarioid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_USUARIOID"), ",", ".") != AV8cTran_UsuarioId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_centrocostoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_CENTROCOSTOID"), ",", ".") != AV9cTran_CentroCostoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_regionid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_REGIONID"), ",", ".") != AV10cTran_RegionId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_codigomovimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTRAN_CODIGOMOVIMIENTO"), AV11cTran_CodigoMovimiento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctran_inde_s Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTRAN_INDE_S"), AV12cTran_IndE_S) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218E2 ();
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

   public void we8E2( )
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

   public void pa8E2( )
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
         cmbavCtran_inde_s.setName( "vCTRAN_INDE_S" );
         cmbavCtran_inde_s.setWebtags( "" );
         cmbavCtran_inde_s.addItem("E", "ENTRADA", (short)(0));
         cmbavCtran_inde_s.addItem("S", "SALIDA", (short)(0));
         cmbavCtran_inde_s.addItem("T", "TRASPASO", (short)(0));
         cmbavCtran_inde_s.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbavCtran_inde_s.getItemCount() > 0 )
         {
            AV12cTran_IndE_S = cmbavCtran_inde_s.getValidValue(AV12cTran_IndE_S) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_IndE_S", AV12cTran_IndE_S);
         }
         GXCCtl = "TRAN_TIPOELEMENTO_" + sGXsfl_84_idx ;
         cmbTran_TipoElemento.setName( GXCCtl );
         cmbTran_TipoElemento.setWebtags( "" );
         cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
         cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTran_TipoElemento.getItemCount() > 0 )
         {
            A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
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
                                  long AV6cTran_Id ,
                                  java.util.Date AV7cTran_FechaRegistro ,
                                  long AV8cTran_UsuarioId ,
                                  long AV9cTran_CentroCostoId ,
                                  long AV10cTran_RegionId ,
                                  String AV11cTran_CodigoMovimiento ,
                                  String AV12cTran_IndE_S )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8E2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTRO", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_USUARIOID", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONID", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTO", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOELEMENTO", GXutil.rtrim( A482Tran_TipoElemento));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCtran_inde_s.getItemCount() > 0 )
      {
         AV12cTran_IndE_S = cmbavCtran_inde_s.getValidValue(AV12cTran_IndE_S) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_IndE_S", AV12cTran_IndE_S);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8E2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8E2( )
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
                                              AV7cTran_FechaRegistro ,
                                              new Long(AV8cTran_UsuarioId) ,
                                              new Long(AV9cTran_CentroCostoId) ,
                                              new Long(AV10cTran_RegionId) ,
                                              AV11cTran_CodigoMovimiento ,
                                              AV12cTran_IndE_S ,
                                              A55Tran_FechaRegistro ,
                                              new Long(A47Tran_UsuarioId) ,
                                              new Long(A48Tran_CentroCostoId) ,
                                              new Long(A57Tran_RegionId) ,
                                              A49Tran_CodigoMovimiento ,
                                              A481Tran_IndE_S ,
                                              new Long(AV6cTran_Id) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                              TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         } ) ;
         lV11cTran_CodigoMovimiento = GXutil.concat( GXutil.rtrim( AV11cTran_CodigoMovimiento), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTran_CodigoMovimiento", AV11cTran_CodigoMovimiento);
         lV12cTran_IndE_S = GXutil.concat( GXutil.rtrim( AV12cTran_IndE_S), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_IndE_S", AV12cTran_IndE_S);
         /* Using cursor H008E2 */
         pr_default.execute(0, new Object[] {new Long(AV6cTran_Id), AV7cTran_FechaRegistro, new Long(AV8cTran_UsuarioId), new Long(AV9cTran_CentroCostoId), new Long(AV10cTran_RegionId), lV11cTran_CodigoMovimiento, lV12cTran_IndE_S, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A481Tran_IndE_S = H008E2_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H008E2_n481Tran_IndE_S[0] ;
            A482Tran_TipoElemento = H008E2_A482Tran_TipoElemento[0] ;
            A49Tran_CodigoMovimiento = H008E2_A49Tran_CodigoMovimiento[0] ;
            A57Tran_RegionId = H008E2_A57Tran_RegionId[0] ;
            n57Tran_RegionId = H008E2_n57Tran_RegionId[0] ;
            A48Tran_CentroCostoId = H008E2_A48Tran_CentroCostoId[0] ;
            A47Tran_UsuarioId = H008E2_A47Tran_UsuarioId[0] ;
            n47Tran_UsuarioId = H008E2_n47Tran_UsuarioId[0] ;
            A55Tran_FechaRegistro = H008E2_A55Tran_FechaRegistro[0] ;
            A46Tran_Id = H008E2_A46Tran_Id[0] ;
            /* Execute user event: Load */
            e208E2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8E0( ) ;
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
                                           AV7cTran_FechaRegistro ,
                                           new Long(AV8cTran_UsuarioId) ,
                                           new Long(AV9cTran_CentroCostoId) ,
                                           new Long(AV10cTran_RegionId) ,
                                           AV11cTran_CodigoMovimiento ,
                                           AV12cTran_IndE_S ,
                                           A55Tran_FechaRegistro ,
                                           new Long(A47Tran_UsuarioId) ,
                                           new Long(A48Tran_CentroCostoId) ,
                                           new Long(A57Tran_RegionId) ,
                                           A49Tran_CodigoMovimiento ,
                                           A481Tran_IndE_S ,
                                           new Long(AV6cTran_Id) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      } ) ;
      lV11cTran_CodigoMovimiento = GXutil.concat( GXutil.rtrim( AV11cTran_CodigoMovimiento), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cTran_CodigoMovimiento", AV11cTran_CodigoMovimiento);
      lV12cTran_IndE_S = GXutil.concat( GXutil.rtrim( AV12cTran_IndE_S), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_IndE_S", AV12cTran_IndE_S);
      /* Using cursor H008E3 */
      pr_default.execute(1, new Object[] {new Long(AV6cTran_Id), AV7cTran_FechaRegistro, new Long(AV8cTran_UsuarioId), new Long(AV9cTran_CentroCostoId), new Long(AV10cTran_RegionId), lV11cTran_CodigoMovimiento, lV12cTran_IndE_S});
      GRID1_nRecordCount = H008E3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTran_Id, AV7cTran_FechaRegistro, AV8cTran_UsuarioId, AV9cTran_CentroCostoId, AV10cTran_RegionId, AV11cTran_CodigoMovimiento, AV12cTran_IndE_S) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8E0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_ID");
            GX_FocusControl = edtavCtran_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cTran_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTran_Id", GXutil.ltrim( GXutil.str( AV6cTran_Id, 11, 0)));
         }
         else
         {
            AV6cTran_Id = localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTran_Id", GXutil.ltrim( GXutil.str( AV6cTran_Id, 11, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtran_fecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCTRAN_FECHAREGISTRO");
            GX_FocusControl = edtavCtran_fecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cTran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTran_FechaRegistro", localUtil.ttoc( AV7cTran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV7cTran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtavCtran_fecharegistro_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTran_FechaRegistro", localUtil.ttoc( AV7cTran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_usuarioid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_usuarioid_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_USUARIOID");
            GX_FocusControl = edtavCtran_usuarioid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cTran_UsuarioId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTran_UsuarioId", GXutil.ltrim( GXutil.str( AV8cTran_UsuarioId, 18, 0)));
         }
         else
         {
            AV8cTran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtavCtran_usuarioid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTran_UsuarioId", GXutil.ltrim( GXutil.str( AV8cTran_UsuarioId, 18, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_centrocostoid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_centrocostoid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_CENTROCOSTOID");
            GX_FocusControl = edtavCtran_centrocostoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cTran_CentroCostoId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTran_CentroCostoId", GXutil.ltrim( GXutil.str( AV9cTran_CentroCostoId, 11, 0)));
         }
         else
         {
            AV9cTran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtavCtran_centrocostoid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTran_CentroCostoId", GXutil.ltrim( GXutil.str( AV9cTran_CentroCostoId, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_regionid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_regionid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_REGIONID");
            GX_FocusControl = edtavCtran_regionid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cTran_RegionId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTran_RegionId", GXutil.ltrim( GXutil.str( AV10cTran_RegionId, 11, 0)));
         }
         else
         {
            AV10cTran_RegionId = localUtil.ctol( httpContext.cgiGet( edtavCtran_regionid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTran_RegionId", GXutil.ltrim( GXutil.str( AV10cTran_RegionId, 11, 0)));
         }
         AV11cTran_CodigoMovimiento = httpContext.cgiGet( edtavCtran_codigomovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTran_CodigoMovimiento", AV11cTran_CodigoMovimiento);
         cmbavCtran_inde_s.setName( cmbavCtran_inde_s.getInternalname() );
         cmbavCtran_inde_s.setValue( httpContext.cgiGet( cmbavCtran_inde_s.getInternalname()) );
         AV12cTran_IndE_S = httpContext.cgiGet( cmbavCtran_inde_s.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTran_IndE_S", AV12cTran_IndE_S);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_ID"), ",", ".") != AV6cTran_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCTRAN_FECHAREGISTRO"), 0), AV7cTran_FechaRegistro) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_USUARIOID"), ",", ".") != AV8cTran_UsuarioId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_CENTROCOSTOID"), ",", ".") != AV9cTran_CentroCostoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRAN_REGIONID"), ",", ".") != AV10cTran_RegionId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTRAN_CODIGOMOVIMIENTO"), AV11cTran_CodigoMovimiento) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTRAN_INDE_S"), AV12cTran_IndE_S) != 0 )
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
      e198E2 ();
      if (returnInSub) return;
   }

   public void e198E2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "TRANSACCION", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208E2( )
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
      e218E2 ();
      if (returnInSub) return;
   }

   public void e218E2( )
   {
      /* Enter Routine */
      AV13pTran_Id = A46Tran_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pTran_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pTran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTran_Id", GXutil.ltrim( GXutil.str( AV13pTran_Id, 11, 0)));
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
      pa8E2( ) ;
      ws8E2( ) ;
      we8E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414242183");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx0070.js", "?201861414242183");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_84_idx ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO_"+sGXsfl_84_idx ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID_"+sGXsfl_84_idx ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID_"+sGXsfl_84_idx ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID_"+sGXsfl_84_idx ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO_"+sGXsfl_84_idx ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_84_fel_idx ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO_"+sGXsfl_84_fel_idx ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID_"+sGXsfl_84_fel_idx ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID_"+sGXsfl_84_fel_idx ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID_"+sGXsfl_84_fel_idx ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO_"+sGXsfl_84_fel_idx ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8E0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaRegistro_Internalname,localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioId_Internalname,GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodigoMovimiento_Internalname,A49Tran_CodigoMovimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodigoMovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_TIPOELEMENTO_" + sGXsfl_84_idx ;
            cmbTran_TipoElemento.setName( GXCCtl );
            cmbTran_TipoElemento.setWebtags( "" );
            cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
            cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
            if ( cmbTran_TipoElemento.getItemCount() > 0 )
            {
               A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_TipoElemento,cmbTran_TipoElemento.getInternalname(),GXutil.rtrim( A482Tran_TipoElemento),new Integer(1),cmbTran_TipoElemento.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTran_TipoElemento.setValue( GXutil.rtrim( A482Tran_TipoElemento) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoElemento.getInternalname(), "Values", cmbTran_TipoElemento.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIOID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOELEMENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbltran_idfilter_Internalname = "LBLTRAN_IDFILTER" ;
      edtavCtran_id_Internalname = "vCTRAN_ID" ;
      divTran_idfiltercontainer_Internalname = "TRAN_IDFILTERCONTAINER" ;
      lblLbltran_fecharegistrofilter_Internalname = "LBLTRAN_FECHAREGISTROFILTER" ;
      edtavCtran_fecharegistro_Internalname = "vCTRAN_FECHAREGISTRO" ;
      divTran_fecharegistrofiltercontainer_Internalname = "TRAN_FECHAREGISTROFILTERCONTAINER" ;
      lblLbltran_usuarioidfilter_Internalname = "LBLTRAN_USUARIOIDFILTER" ;
      edtavCtran_usuarioid_Internalname = "vCTRAN_USUARIOID" ;
      divTran_usuarioidfiltercontainer_Internalname = "TRAN_USUARIOIDFILTERCONTAINER" ;
      lblLbltran_centrocostoidfilter_Internalname = "LBLTRAN_CENTROCOSTOIDFILTER" ;
      edtavCtran_centrocostoid_Internalname = "vCTRAN_CENTROCOSTOID" ;
      divTran_centrocostoidfiltercontainer_Internalname = "TRAN_CENTROCOSTOIDFILTERCONTAINER" ;
      lblLbltran_regionidfilter_Internalname = "LBLTRAN_REGIONIDFILTER" ;
      edtavCtran_regionid_Internalname = "vCTRAN_REGIONID" ;
      divTran_regionidfiltercontainer_Internalname = "TRAN_REGIONIDFILTERCONTAINER" ;
      lblLbltran_codigomovimientofilter_Internalname = "LBLTRAN_CODIGOMOVIMIENTOFILTER" ;
      edtavCtran_codigomovimiento_Internalname = "vCTRAN_CODIGOMOVIMIENTO" ;
      divTran_codigomovimientofiltercontainer_Internalname = "TRAN_CODIGOMOVIMIENTOFILTERCONTAINER" ;
      lblLbltran_inde_sfilter_Internalname = "LBLTRAN_INDE_SFILTER" ;
      cmbavCtran_inde_s.setInternalname( "vCTRAN_INDE_S" );
      divTran_inde_sfiltercontainer_Internalname = "TRAN_INDE_SFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID" ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID" ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO" );
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
      cmbTran_TipoElemento.setJsonclick( "" );
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_RegionId_Jsonclick = "" ;
      edtTran_CentroCostoId_Jsonclick = "" ;
      edtTran_UsuarioId_Jsonclick = "" ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCtran_inde_s.setJsonclick( "" );
      cmbavCtran_inde_s.setEnabled( 1 );
      cmbavCtran_inde_s.setVisible( 1 );
      edtavCtran_codigomovimiento_Jsonclick = "" ;
      edtavCtran_codigomovimiento_Enabled = 1 ;
      edtavCtran_codigomovimiento_Visible = 1 ;
      edtavCtran_regionid_Jsonclick = "" ;
      edtavCtran_regionid_Enabled = 1 ;
      edtavCtran_regionid_Visible = 1 ;
      edtavCtran_centrocostoid_Jsonclick = "" ;
      edtavCtran_centrocostoid_Enabled = 1 ;
      edtavCtran_centrocostoid_Visible = 1 ;
      edtavCtran_usuarioid_Jsonclick = "" ;
      edtavCtran_usuarioid_Enabled = 1 ;
      edtavCtran_usuarioid_Visible = 1 ;
      edtavCtran_fecharegistro_Jsonclick = "" ;
      edtavCtran_fecharegistro_Enabled = 1 ;
      edtavCtran_id_Jsonclick = "" ;
      edtavCtran_id_Enabled = 1 ;
      edtavCtran_id_Visible = 1 ;
      divTran_inde_sfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_codigomovimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_regionidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_centrocostoidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_usuarioidfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_fecharegistrofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List TRANSACCION" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTran_FechaRegistro',fld:'vCTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV8cTran_UsuarioId',fld:'vCTRAN_USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTran_CentroCostoId',fld:'vCTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTran_RegionId',fld:'vCTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11cTran_CodigoMovimiento',fld:'vCTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'cmbavCtran_inde_s'},{av:'AV12cTran_IndE_S',fld:'vCTRAN_INDE_S',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188E1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLTRAN_IDFILTER.CLICK","{handler:'e118E1',iparms:[{av:'divTran_idfiltercontainer_Class',ctrl:'TRAN_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_idfiltercontainer_Class',ctrl:'TRAN_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_id_Visible',ctrl:'vCTRAN_ID',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_FECHAREGISTROFILTER.CLICK","{handler:'e128E1',iparms:[{av:'divTran_fecharegistrofiltercontainer_Class',ctrl:'TRAN_FECHAREGISTROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_fecharegistrofiltercontainer_Class',ctrl:'TRAN_FECHAREGISTROFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLTRAN_USUARIOIDFILTER.CLICK","{handler:'e138E1',iparms:[{av:'divTran_usuarioidfiltercontainer_Class',ctrl:'TRAN_USUARIOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_usuarioidfiltercontainer_Class',ctrl:'TRAN_USUARIOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_usuarioid_Visible',ctrl:'vCTRAN_USUARIOID',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_CENTROCOSTOIDFILTER.CLICK","{handler:'e148E1',iparms:[{av:'divTran_centrocostoidfiltercontainer_Class',ctrl:'TRAN_CENTROCOSTOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_centrocostoidfiltercontainer_Class',ctrl:'TRAN_CENTROCOSTOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_centrocostoid_Visible',ctrl:'vCTRAN_CENTROCOSTOID',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_REGIONIDFILTER.CLICK","{handler:'e158E1',iparms:[{av:'divTran_regionidfiltercontainer_Class',ctrl:'TRAN_REGIONIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_regionidfiltercontainer_Class',ctrl:'TRAN_REGIONIDFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_regionid_Visible',ctrl:'vCTRAN_REGIONID',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_CODIGOMOVIMIENTOFILTER.CLICK","{handler:'e168E1',iparms:[{av:'divTran_codigomovimientofiltercontainer_Class',ctrl:'TRAN_CODIGOMOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_codigomovimientofiltercontainer_Class',ctrl:'TRAN_CODIGOMOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_codigomovimiento_Visible',ctrl:'vCTRAN_CODIGOMOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_INDE_SFILTER.CLICK","{handler:'e178E1',iparms:[{av:'divTran_inde_sfiltercontainer_Class',ctrl:'TRAN_INDE_SFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_inde_sfiltercontainer_Class',ctrl:'TRAN_INDE_SFILTERCONTAINER',prop:'Class'},{av:'cmbavCtran_inde_s'}]}");
      setEventMetadata("ENTER","{handler:'e218E2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pTran_Id',fld:'vPTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTran_FechaRegistro',fld:'vCTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV8cTran_UsuarioId',fld:'vCTRAN_USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTran_CentroCostoId',fld:'vCTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTran_RegionId',fld:'vCTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11cTran_CodigoMovimiento',fld:'vCTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'cmbavCtran_inde_s'},{av:'AV12cTran_IndE_S',fld:'vCTRAN_INDE_S',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTran_FechaRegistro',fld:'vCTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV8cTran_UsuarioId',fld:'vCTRAN_USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTran_CentroCostoId',fld:'vCTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTran_RegionId',fld:'vCTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11cTran_CodigoMovimiento',fld:'vCTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'cmbavCtran_inde_s'},{av:'AV12cTran_IndE_S',fld:'vCTRAN_INDE_S',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTran_FechaRegistro',fld:'vCTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV8cTran_UsuarioId',fld:'vCTRAN_USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTran_CentroCostoId',fld:'vCTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTran_RegionId',fld:'vCTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11cTran_CodigoMovimiento',fld:'vCTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'cmbavCtran_inde_s'},{av:'AV12cTran_IndE_S',fld:'vCTRAN_INDE_S',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cTran_FechaRegistro',fld:'vCTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV8cTran_UsuarioId',fld:'vCTRAN_USUARIOID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV9cTran_CentroCostoId',fld:'vCTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV10cTran_RegionId',fld:'vCTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11cTran_CodigoMovimiento',fld:'vCTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'cmbavCtran_inde_s'},{av:'AV12cTran_IndE_S',fld:'vCTRAN_INDE_S',pic:'',nv:''}],oparms:[]}");
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
      AV7cTran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV11cTran_CodigoMovimiento = "" ;
      AV12cTran_IndE_S = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbltran_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltran_fecharegistrofilter_Jsonclick = "" ;
      lblLbltran_usuarioidfilter_Jsonclick = "" ;
      lblLbltran_centrocostoidfilter_Jsonclick = "" ;
      lblLbltran_regionidfilter_Jsonclick = "" ;
      lblLbltran_codigomovimientofilter_Jsonclick = "" ;
      lblLbltran_inde_sfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A49Tran_CodigoMovimiento = "" ;
      A482Tran_TipoElemento = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV11cTran_CodigoMovimiento = "" ;
      lV12cTran_IndE_S = "" ;
      A481Tran_IndE_S = "" ;
      H008E2_A481Tran_IndE_S = new String[] {""} ;
      H008E2_n481Tran_IndE_S = new boolean[] {false} ;
      H008E2_A482Tran_TipoElemento = new String[] {""} ;
      H008E2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H008E2_A57Tran_RegionId = new long[1] ;
      H008E2_n57Tran_RegionId = new boolean[] {false} ;
      H008E2_A48Tran_CentroCostoId = new long[1] ;
      H008E2_A47Tran_UsuarioId = new long[1] ;
      H008E2_n47Tran_UsuarioId = new boolean[] {false} ;
      H008E2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H008E2_A46Tran_Id = new long[1] ;
      H008E3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx0070__default(),
         new Object[] {
             new Object[] {
            H008E2_A481Tran_IndE_S, H008E2_n481Tran_IndE_S, H008E2_A482Tran_TipoElemento, H008E2_A49Tran_CodigoMovimiento, H008E2_A57Tran_RegionId, H008E2_n57Tran_RegionId, H008E2_A48Tran_CentroCostoId, H008E2_A47Tran_UsuarioId, H008E2_n47Tran_UsuarioId, H008E2_A55Tran_FechaRegistro,
            H008E2_A46Tran_Id
            }
            , new Object[] {
            H008E3_AGRID1_nRecordCount
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
   private int edtavCtran_id_Enabled ;
   private int edtavCtran_id_Visible ;
   private int edtavCtran_fecharegistro_Enabled ;
   private int edtavCtran_usuarioid_Enabled ;
   private int edtavCtran_usuarioid_Visible ;
   private int edtavCtran_centrocostoid_Enabled ;
   private int edtavCtran_centrocostoid_Visible ;
   private int edtavCtran_regionid_Enabled ;
   private int edtavCtran_regionid_Visible ;
   private int edtavCtran_codigomovimiento_Visible ;
   private int edtavCtran_codigomovimiento_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cTran_Id ;
   private long AV8cTran_UsuarioId ;
   private long AV9cTran_CentroCostoId ;
   private long AV10cTran_RegionId ;
   private long AV13pTran_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A46Tran_Id ;
   private long A47Tran_UsuarioId ;
   private long A48Tran_CentroCostoId ;
   private long A57Tran_RegionId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divTran_idfiltercontainer_Class ;
   private String divTran_fecharegistrofiltercontainer_Class ;
   private String divTran_usuarioidfiltercontainer_Class ;
   private String divTran_centrocostoidfiltercontainer_Class ;
   private String divTran_regionidfiltercontainer_Class ;
   private String divTran_codigomovimientofiltercontainer_Class ;
   private String divTran_inde_sfiltercontainer_Class ;
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
   private String divTran_idfiltercontainer_Internalname ;
   private String lblLbltran_idfilter_Internalname ;
   private String lblLbltran_idfilter_Jsonclick ;
   private String edtavCtran_id_Internalname ;
   private String TempTags ;
   private String edtavCtran_id_Jsonclick ;
   private String divTran_fecharegistrofiltercontainer_Internalname ;
   private String lblLbltran_fecharegistrofilter_Internalname ;
   private String lblLbltran_fecharegistrofilter_Jsonclick ;
   private String edtavCtran_fecharegistro_Internalname ;
   private String edtavCtran_fecharegistro_Jsonclick ;
   private String divTran_usuarioidfiltercontainer_Internalname ;
   private String lblLbltran_usuarioidfilter_Internalname ;
   private String lblLbltran_usuarioidfilter_Jsonclick ;
   private String edtavCtran_usuarioid_Internalname ;
   private String edtavCtran_usuarioid_Jsonclick ;
   private String divTran_centrocostoidfiltercontainer_Internalname ;
   private String lblLbltran_centrocostoidfilter_Internalname ;
   private String lblLbltran_centrocostoidfilter_Jsonclick ;
   private String edtavCtran_centrocostoid_Internalname ;
   private String edtavCtran_centrocostoid_Jsonclick ;
   private String divTran_regionidfiltercontainer_Internalname ;
   private String lblLbltran_regionidfilter_Internalname ;
   private String lblLbltran_regionidfilter_Jsonclick ;
   private String edtavCtran_regionid_Internalname ;
   private String edtavCtran_regionid_Jsonclick ;
   private String divTran_codigomovimientofiltercontainer_Internalname ;
   private String lblLbltran_codigomovimientofilter_Internalname ;
   private String lblLbltran_codigomovimientofilter_Jsonclick ;
   private String edtavCtran_codigomovimiento_Internalname ;
   private String edtavCtran_codigomovimiento_Jsonclick ;
   private String divTran_inde_sfiltercontainer_Internalname ;
   private String lblLbltran_inde_sfilter_Internalname ;
   private String lblLbltran_inde_sfilter_Jsonclick ;
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
   private String A482Tran_TipoElemento ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTran_Id_Internalname ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_UsuarioId_Internalname ;
   private String edtTran_CentroCostoId_Internalname ;
   private String edtTran_RegionId_Internalname ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioId_Jsonclick ;
   private String edtTran_CentroCostoId_Jsonclick ;
   private String edtTran_RegionId_Jsonclick ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private java.util.Date AV7cTran_FechaRegistro ;
   private java.util.Date A55Tran_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n47Tran_UsuarioId ;
   private boolean n57Tran_RegionId ;
   private boolean n481Tran_IndE_S ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV11cTran_CodigoMovimiento ;
   private String AV12cTran_IndE_S ;
   private String A49Tran_CodigoMovimiento ;
   private String AV17Linkselection_GXI ;
   private String lV11cTran_CodigoMovimiento ;
   private String lV12cTran_IndE_S ;
   private String A481Tran_IndE_S ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCtran_inde_s ;
   private HTMLChoice cmbTran_TipoElemento ;
   private IDataStoreProvider pr_default ;
   private String[] H008E2_A481Tran_IndE_S ;
   private boolean[] H008E2_n481Tran_IndE_S ;
   private String[] H008E2_A482Tran_TipoElemento ;
   private String[] H008E2_A49Tran_CodigoMovimiento ;
   private long[] H008E2_A57Tran_RegionId ;
   private boolean[] H008E2_n57Tran_RegionId ;
   private long[] H008E2_A48Tran_CentroCostoId ;
   private long[] H008E2_A47Tran_UsuarioId ;
   private boolean[] H008E2_n47Tran_UsuarioId ;
   private java.util.Date[] H008E2_A55Tran_FechaRegistro ;
   private long[] H008E2_A46Tran_Id ;
   private long[] H008E3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx0070__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV7cTran_FechaRegistro ,
                                          long AV8cTran_UsuarioId ,
                                          long AV9cTran_CentroCostoId ,
                                          long AV10cTran_RegionId ,
                                          String AV11cTran_CodigoMovimiento ,
                                          String AV12cTran_IndE_S ,
                                          java.util.Date A55Tran_FechaRegistro ,
                                          long A47Tran_UsuarioId ,
                                          long A48Tran_CentroCostoId ,
                                          long A57Tran_RegionId ,
                                          String A49Tran_CodigoMovimiento ,
                                          String A481Tran_IndE_S ,
                                          long AV6cTran_Id )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Tran_IndE_S, Tran_TipoElemento, Tran_CodigoMovimiento, Tran_RegionId," ;
      sSelectString = sSelectString + " Tran_CentroCostoId, Tran_UsuarioId, Tran_FechaRegistro, Tran_Id" ;
      sFromString = " FROM ALM_TRANSACCION" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Tran_Id >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cTran_FechaRegistro) )
      {
         sWhereString = sWhereString + " and (Tran_FechaRegistro >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTran_UsuarioId) )
      {
         sWhereString = sWhereString + " and (Tran_UsuarioId >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTran_CentroCostoId) )
      {
         sWhereString = sWhereString + " and (Tran_CentroCostoId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cTran_RegionId) )
      {
         sWhereString = sWhereString + " and (Tran_RegionId >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTran_CodigoMovimiento)==0) )
      {
         sWhereString = sWhereString + " and (Tran_CodigoMovimiento like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTran_IndE_S)==0) )
      {
         sWhereString = sWhereString + " and (Tran_IndE_S like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Tran_Id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008E3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV7cTran_FechaRegistro ,
                                          long AV8cTran_UsuarioId ,
                                          long AV9cTran_CentroCostoId ,
                                          long AV10cTran_RegionId ,
                                          String AV11cTran_CodigoMovimiento ,
                                          String AV12cTran_IndE_S ,
                                          java.util.Date A55Tran_FechaRegistro ,
                                          long A47Tran_UsuarioId ,
                                          long A48Tran_CentroCostoId ,
                                          long A57Tran_RegionId ,
                                          String A49Tran_CodigoMovimiento ,
                                          String A481Tran_IndE_S ,
                                          long AV6cTran_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_TRANSACCION" ;
      scmdbuf = scmdbuf + " WHERE (Tran_Id >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cTran_FechaRegistro) )
      {
         sWhereString = sWhereString + " and (Tran_FechaRegistro >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTran_UsuarioId) )
      {
         sWhereString = sWhereString + " and (Tran_UsuarioId >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cTran_CentroCostoId) )
      {
         sWhereString = sWhereString + " and (Tran_CentroCostoId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cTran_RegionId) )
      {
         sWhereString = sWhereString + " and (Tran_RegionId >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTran_CodigoMovimiento)==0) )
      {
         sWhereString = sWhereString + " and (Tran_CodigoMovimiento like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTran_IndE_S)==0) )
      {
         sWhereString = sWhereString + " and (Tran_IndE_S like ?)" ;
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
                  return conditional_H008E2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H008E3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008E3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 1);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

}

