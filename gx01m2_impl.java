/*
               File: gx01m2_impl
        Description: Selection List Documentos del tipo de or�gen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 13, 2018 9:34:9.15
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

public final  class gx01m2_impl extends GXDataArea
{
   public gx01m2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01m2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01m2_impl.class ));
   }

   public gx01m2_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCdocu_estado = new HTMLChoice();
      cmbDocu_Estado = new HTMLChoice();
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
            AV6cDocu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cDocu_Descripcion = httpContext.GetNextPar( ) ;
            AV8cDocu_Prefijo = httpContext.GetNextPar( ) ;
            AV13cDocu_Estado = httpContext.GetNextPar( ) ;
            AV9pTpmo_Codigo = httpContext.GetNextPar( ) ;
            AV10pOrig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
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
            AV9pTpmo_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9pTpmo_Codigo", AV9pTpmo_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9pTpmo_Codigo, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10pOrig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10pOrig_Identificador", GXutil.ltrim( GXutil.str( AV10pOrig_Identificador, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pOrig_Identificador), "ZZZZZZZZZZ9")));
               AV11pDocu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pDocu_Nro", GXutil.ltrim( GXutil.str( AV11pDocu_Nro, 4, 0)));
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
      pa932( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start932( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018413934920");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01m2") + "?" + GXutil.URLEncode(GXutil.rtrim(AV9pTpmo_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pOrig_Identificador,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pDocu_Nro,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDOCU_NRO", GXutil.ltrim( localUtil.ntoc( AV6cDocu_Nro, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDOCU_DESCRIPCION", AV7cDocu_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDOCU_PREFIJO", AV8cDocu_Prefijo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDOCU_ESTADO", GXutil.rtrim( AV13cDocu_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTPMO_CODIGO", AV9pTpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV10pOrig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPDOCU_NRO", GXutil.ltrim( localUtil.ntoc( AV11pDocu_Nro, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9pTpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pOrig_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9pTpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pOrig_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_NROFILTERCONTAINER_Class", GXutil.rtrim( divDocu_nrofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divDocu_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_PREFIJOFILTERCONTAINER_Class", GXutil.rtrim( divDocu_prefijofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divDocu_estadofiltercontainer_Class));
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
         we932( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt932( ) ;
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
      return formatLink("com.orions2.gx01m2") + "?" + GXutil.URLEncode(GXutil.rtrim(AV9pTpmo_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pOrig_Identificador,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pDocu_Nro,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01M2" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Documentos del tipo de or�gen" ;
   }

   public void wb930( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocu_nrofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDocu_nrofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldocu_nrofilter_Internalname, "N�mero de documento", "", "", lblLbldocu_nrofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11931_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01M2.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdocu_nro_Internalname, "N�mero de documento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdocu_nro_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cDocu_Nro, (byte)(4), (byte)(0), ",", "")), ((edtavCdocu_nro_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cDocu_Nro), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cDocu_Nro), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdocu_nro_Jsonclick, 0, "Attribute", "", "", "", edtavCdocu_nro_Visible, edtavCdocu_nro_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01M2.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocu_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDocu_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldocu_descripcionfilter_Internalname, "Descripci�n", "", "", lblLbldocu_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12931_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01M2.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdocu_descripcion_Internalname, "Descripci�n", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdocu_descripcion_Internalname, AV7cDocu_Descripcion, GXutil.rtrim( localUtil.format( AV7cDocu_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdocu_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCdocu_descripcion_Visible, edtavCdocu_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01M2.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocu_prefijofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDocu_prefijofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldocu_prefijofilter_Internalname, "Prefijo", "", "", lblLbldocu_prefijofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13931_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01M2.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdocu_prefijo_Internalname, "Prefijo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdocu_prefijo_Internalname, AV8cDocu_Prefijo, GXutil.rtrim( localUtil.format( AV8cDocu_Prefijo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdocu_prefijo_Jsonclick, 0, "Attribute", "", "", "", edtavCdocu_prefijo_Visible, edtavCdocu_prefijo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01M2.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocu_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDocu_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldocu_estadofilter_Internalname, "Estado", "", "", lblLbldocu_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14931_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01M2.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCdocu_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCdocu_estado, cmbavCdocu_estado.getInternalname(), GXutil.rtrim( AV13cDocu_Estado), 1, cmbavCdocu_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCdocu_estado.getVisible(), cmbavCdocu_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, "HLP_Gx01M2.htm");
         cmbavCdocu_estado.setValue( GXutil.rtrim( AV13cDocu_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCdocu_estado.getInternalname(), "Values", cmbavCdocu_estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15931_client"+"'", TempTags, "", 2, "HLP_Gx01M2.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripci�n") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Prefijo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cod Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Or�gen") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A820Docu_Descripcion);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtDocu_Descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A821Docu_Prefijo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A822Docu_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A38Tpmo_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01M2.htm");
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

   public void start932( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Documentos del tipo de or�gen", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup930( ) ;
   }

   public void ws932( )
   {
      start932( ) ;
      evt932( ) ;
   }

   public void evt932( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_54_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( edtDocu_Nro_Internalname), ",", ".")) ;
                           A820Docu_Descripcion = httpContext.cgiGet( edtDocu_Descripcion_Internalname) ;
                           n820Docu_Descripcion = false ;
                           A821Docu_Prefijo = httpContext.cgiGet( edtDocu_Prefijo_Internalname) ;
                           n821Docu_Prefijo = false ;
                           cmbDocu_Estado.setName( cmbDocu_Estado.getInternalname() );
                           cmbDocu_Estado.setValue( httpContext.cgiGet( cmbDocu_Estado.getInternalname()) );
                           A822Docu_Estado = httpContext.cgiGet( cmbDocu_Estado.getInternalname()) ;
                           n822Docu_Estado = false ;
                           A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
                           A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16932 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e17932 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cdocu_nro Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDOCU_NRO"), ",", ".") != AV6cDocu_Nro )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdocu_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_DESCRIPCION"), AV7cDocu_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdocu_prefijo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_PREFIJO"), AV8cDocu_Prefijo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdocu_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_ESTADO"), AV13cDocu_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e18932 ();
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

   public void we932( )
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

   public void pa932( )
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
         cmbavCdocu_estado.setName( "vCDOCU_ESTADO" );
         cmbavCdocu_estado.setWebtags( "" );
         cmbavCdocu_estado.addItem("A", "Activo", (short)(0));
         cmbavCdocu_estado.addItem("I", "Inactivo", (short)(0));
         cmbavCdocu_estado.addItem("C", "Confirmada", (short)(0));
         cmbavCdocu_estado.addItem("E", "Error", (short)(0));
         if ( cmbavCdocu_estado.getItemCount() > 0 )
         {
            AV13cDocu_Estado = cmbavCdocu_estado.getValidValue(AV13cDocu_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13cDocu_Estado", AV13cDocu_Estado);
         }
         GXCCtl = "DOCU_ESTADO_" + sGXsfl_54_idx ;
         cmbDocu_Estado.setName( GXCCtl );
         cmbDocu_Estado.setWebtags( "" );
         cmbDocu_Estado.addItem("A", "Activo", (short)(0));
         cmbDocu_Estado.addItem("I", "Inactivo", (short)(0));
         cmbDocu_Estado.addItem("C", "Confirmada", (short)(0));
         cmbDocu_Estado.addItem("E", "Error", (short)(0));
         if ( cmbDocu_Estado.getItemCount() > 0 )
         {
            A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
            n822Docu_Estado = false ;
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
                                  short AV6cDocu_Nro ,
                                  String AV7cDocu_Descripcion ,
                                  String AV8cDocu_Prefijo ,
                                  String AV13cDocu_Estado ,
                                  String AV9pTpmo_Codigo ,
                                  long AV10pOrig_Identificador )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf932( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_NRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_NRO", GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A820Docu_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_DESCRIPCION", A820Docu_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_PREFIJO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A821Docu_Prefijo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_PREFIJO", A821Docu_Prefijo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_ESTADO", GXutil.rtrim( A822Docu_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGO", A38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCdocu_estado.getItemCount() > 0 )
      {
         AV13cDocu_Estado = cmbavCdocu_estado.getValidValue(AV13cDocu_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cDocu_Estado", AV13cDocu_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf932( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf932( )
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
                                              AV7cDocu_Descripcion ,
                                              AV8cDocu_Prefijo ,
                                              AV13cDocu_Estado ,
                                              A820Docu_Descripcion ,
                                              A821Docu_Prefijo ,
                                              A822Docu_Estado ,
                                              AV9pTpmo_Codigo ,
                                              new Long(AV10pOrig_Identificador) ,
                                              new Short(AV6cDocu_Nro) ,
                                              A38Tpmo_Codigo ,
                                              new Long(A41Orig_Identificador) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG
                                              }
         } ) ;
         lV7cDocu_Descripcion = GXutil.concat( GXutil.rtrim( AV7cDocu_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cDocu_Descripcion", AV7cDocu_Descripcion);
         lV8cDocu_Prefijo = GXutil.concat( GXutil.rtrim( AV8cDocu_Prefijo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cDocu_Prefijo", AV8cDocu_Prefijo);
         lV13cDocu_Estado = GXutil.padr( GXutil.rtrim( AV13cDocu_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cDocu_Estado", AV13cDocu_Estado);
         /* Using cursor H00932 */
         pr_default.execute(0, new Object[] {AV9pTpmo_Codigo, new Long(AV10pOrig_Identificador), new Short(AV6cDocu_Nro), lV7cDocu_Descripcion, lV8cDocu_Prefijo, lV13cDocu_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_54_idx = (short)(1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A41Orig_Identificador = H00932_A41Orig_Identificador[0] ;
            A38Tpmo_Codigo = H00932_A38Tpmo_Codigo[0] ;
            A822Docu_Estado = H00932_A822Docu_Estado[0] ;
            n822Docu_Estado = H00932_n822Docu_Estado[0] ;
            A821Docu_Prefijo = H00932_A821Docu_Prefijo[0] ;
            n821Docu_Prefijo = H00932_n821Docu_Prefijo[0] ;
            A820Docu_Descripcion = H00932_A820Docu_Descripcion[0] ;
            n820Docu_Descripcion = H00932_n820Docu_Descripcion[0] ;
            A819Docu_Nro = H00932_A819Docu_Nro[0] ;
            /* Execute user event: Load */
            e17932 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb930( ) ;
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
                                           AV7cDocu_Descripcion ,
                                           AV8cDocu_Prefijo ,
                                           AV13cDocu_Estado ,
                                           A820Docu_Descripcion ,
                                           A821Docu_Prefijo ,
                                           A822Docu_Estado ,
                                           AV9pTpmo_Codigo ,
                                           new Long(AV10pOrig_Identificador) ,
                                           new Short(AV6cDocu_Nro) ,
                                           A38Tpmo_Codigo ,
                                           new Long(A41Orig_Identificador) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG
                                           }
      } ) ;
      lV7cDocu_Descripcion = GXutil.concat( GXutil.rtrim( AV7cDocu_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cDocu_Descripcion", AV7cDocu_Descripcion);
      lV8cDocu_Prefijo = GXutil.concat( GXutil.rtrim( AV8cDocu_Prefijo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cDocu_Prefijo", AV8cDocu_Prefijo);
      lV13cDocu_Estado = GXutil.padr( GXutil.rtrim( AV13cDocu_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13cDocu_Estado", AV13cDocu_Estado);
      /* Using cursor H00933 */
      pr_default.execute(1, new Object[] {AV9pTpmo_Codigo, new Long(AV10pOrig_Identificador), new Short(AV6cDocu_Nro), lV7cDocu_Descripcion, lV8cDocu_Prefijo, lV13cDocu_Estado});
      GRID1_nRecordCount = H00933_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDocu_Nro, AV7cDocu_Descripcion, AV8cDocu_Prefijo, AV13cDocu_Estado, AV9pTpmo_Codigo, AV10pOrig_Identificador) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup930( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16932 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdocu_nro_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdocu_nro_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDOCU_NRO");
            GX_FocusControl = edtavCdocu_nro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cDocu_Nro = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cDocu_Nro", GXutil.ltrim( GXutil.str( AV6cDocu_Nro, 4, 0)));
         }
         else
         {
            AV6cDocu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( edtavCdocu_nro_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cDocu_Nro", GXutil.ltrim( GXutil.str( AV6cDocu_Nro, 4, 0)));
         }
         AV7cDocu_Descripcion = httpContext.cgiGet( edtavCdocu_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cDocu_Descripcion", AV7cDocu_Descripcion);
         AV8cDocu_Prefijo = httpContext.cgiGet( edtavCdocu_prefijo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cDocu_Prefijo", AV8cDocu_Prefijo);
         cmbavCdocu_estado.setName( cmbavCdocu_estado.getInternalname() );
         cmbavCdocu_estado.setValue( httpContext.cgiGet( cmbavCdocu_estado.getInternalname()) );
         AV13cDocu_Estado = httpContext.cgiGet( cmbavCdocu_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cDocu_Estado", AV13cDocu_Estado);
         /* Read saved values. */
         nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDOCU_NRO"), ",", ".") != AV6cDocu_Nro )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_DESCRIPCION"), AV7cDocu_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_PREFIJO"), AV8cDocu_Prefijo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDOCU_ESTADO"), AV13cDocu_Estado) != 0 )
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
      e16932 ();
      if (returnInSub) return;
   }

   public void e16932( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selecci�n %1", "Documentos del tipo de or�gen", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e17932( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV16Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e18932 ();
      if (returnInSub) return;
   }

   public void e18932( )
   {
      /* Enter Routine */
      AV11pDocu_Nro = A819Docu_Nro ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pDocu_Nro", GXutil.ltrim( GXutil.str( AV11pDocu_Nro, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Short(AV11pDocu_Nro)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV9pTpmo_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pTpmo_Codigo", AV9pTpmo_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9pTpmo_Codigo, ""))));
      AV10pOrig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pOrig_Identificador", GXutil.ltrim( GXutil.str( AV10pOrig_Identificador, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10pOrig_Identificador), "ZZZZZZZZZZ9")));
      AV11pDocu_Nro = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pDocu_Nro", GXutil.ltrim( GXutil.str( AV11pDocu_Nro, 4, 0)));
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
      pa932( ) ;
      ws932( ) ;
      we932( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17111248");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2018413934100");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01m2.js", "?2018413934100");
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_idx ;
      edtDocu_Nro_Internalname = "DOCU_NRO_"+sGXsfl_54_idx ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION_"+sGXsfl_54_idx ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO_"+sGXsfl_54_idx ;
      cmbDocu_Estado.setInternalname( "DOCU_ESTADO_"+sGXsfl_54_idx );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_54_idx ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_fel_idx ;
      edtDocu_Nro_Internalname = "DOCU_NRO_"+sGXsfl_54_fel_idx ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION_"+sGXsfl_54_fel_idx ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO_"+sGXsfl_54_fel_idx ;
      cmbDocu_Estado.setInternalname( "DOCU_ESTADO_"+sGXsfl_54_fel_idx );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_54_fel_idx ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb930( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_54_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV16Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Nro_Internalname,GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDocu_Nro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtDocu_Descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtDocu_Descripcion_Internalname, "Link", edtDocu_Descripcion_Link, !bGXsfl_54_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Descripcion_Internalname,A820Docu_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'",edtDocu_Descripcion_Link,"","","",edtDocu_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Prefijo_Internalname,A821Docu_Prefijo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDocu_Prefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DOCU_ESTADO_" + sGXsfl_54_idx ;
            cmbDocu_Estado.setName( GXCCtl );
            cmbDocu_Estado.setWebtags( "" );
            cmbDocu_Estado.addItem("A", "Activo", (short)(0));
            cmbDocu_Estado.addItem("I", "Inactivo", (short)(0));
            cmbDocu_Estado.addItem("C", "Confirmada", (short)(0));
            cmbDocu_Estado.addItem("E", "Error", (short)(0));
            if ( cmbDocu_Estado.getItemCount() > 0 )
            {
               A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
               n822Docu_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDocu_Estado,cmbDocu_Estado.getInternalname(),GXutil.rtrim( A822Docu_Estado),new Integer(1),cmbDocu_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbDocu_Estado.setValue( GXutil.rtrim( A822Docu_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDocu_Estado.getInternalname(), "Values", cmbDocu_Estado.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Codigo_Internalname,A38Tpmo_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrig_Identificador_Internalname,GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrig_Identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_NRO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_DESCRIPCION"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_PREFIJO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DOCU_ESTADO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A822Docu_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ORIG_IDENTIFICADOR"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void init_default_properties( )
   {
      lblLbldocu_nrofilter_Internalname = "LBLDOCU_NROFILTER" ;
      edtavCdocu_nro_Internalname = "vCDOCU_NRO" ;
      divDocu_nrofiltercontainer_Internalname = "DOCU_NROFILTERCONTAINER" ;
      lblLbldocu_descripcionfilter_Internalname = "LBLDOCU_DESCRIPCIONFILTER" ;
      edtavCdocu_descripcion_Internalname = "vCDOCU_DESCRIPCION" ;
      divDocu_descripcionfiltercontainer_Internalname = "DOCU_DESCRIPCIONFILTERCONTAINER" ;
      lblLbldocu_prefijofilter_Internalname = "LBLDOCU_PREFIJOFILTER" ;
      edtavCdocu_prefijo_Internalname = "vCDOCU_PREFIJO" ;
      divDocu_prefijofiltercontainer_Internalname = "DOCU_PREFIJOFILTERCONTAINER" ;
      lblLbldocu_estadofilter_Internalname = "LBLDOCU_ESTADOFILTER" ;
      cmbavCdocu_estado.setInternalname( "vCDOCU_ESTADO" );
      divDocu_estadofiltercontainer_Internalname = "DOCU_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtDocu_Nro_Internalname = "DOCU_NRO" ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION" ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO" ;
      cmbDocu_Estado.setInternalname( "DOCU_ESTADO" );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO" ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR" ;
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
      edtOrig_Identificador_Jsonclick = "" ;
      edtTpmo_Codigo_Jsonclick = "" ;
      cmbDocu_Estado.setJsonclick( "" );
      edtDocu_Prefijo_Jsonclick = "" ;
      edtDocu_Descripcion_Jsonclick = "" ;
      edtDocu_Nro_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtDocu_Descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCdocu_estado.setJsonclick( "" );
      cmbavCdocu_estado.setEnabled( 1 );
      cmbavCdocu_estado.setVisible( 1 );
      edtavCdocu_prefijo_Jsonclick = "" ;
      edtavCdocu_prefijo_Enabled = 1 ;
      edtavCdocu_prefijo_Visible = 1 ;
      edtavCdocu_descripcion_Jsonclick = "" ;
      edtavCdocu_descripcion_Enabled = 1 ;
      edtavCdocu_descripcion_Visible = 1 ;
      edtavCdocu_nro_Jsonclick = "" ;
      edtavCdocu_nro_Enabled = 1 ;
      edtavCdocu_nro_Visible = 1 ;
      divDocu_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divDocu_prefijofiltercontainer_Class = "AdvancedContainerItem" ;
      divDocu_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divDocu_nrofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Documentos del tipo de or�gen" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDocu_Nro',fld:'vCDOCU_NRO',pic:'ZZZ9',nv:0},{av:'AV7cDocu_Descripcion',fld:'vCDOCU_DESCRIPCION',pic:'',nv:''},{av:'AV8cDocu_Prefijo',fld:'vCDOCU_PREFIJO',pic:'',nv:''},{av:'cmbavCdocu_estado'},{av:'AV13cDocu_Estado',fld:'vCDOCU_ESTADO',pic:'',nv:''},{av:'AV9pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e15931',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLDOCU_NROFILTER.CLICK","{handler:'e11931',iparms:[{av:'divDocu_nrofiltercontainer_Class',ctrl:'DOCU_NROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDocu_nrofiltercontainer_Class',ctrl:'DOCU_NROFILTERCONTAINER',prop:'Class'},{av:'edtavCdocu_nro_Visible',ctrl:'vCDOCU_NRO',prop:'Visible'}]}");
      setEventMetadata("LBLDOCU_DESCRIPCIONFILTER.CLICK","{handler:'e12931',iparms:[{av:'divDocu_descripcionfiltercontainer_Class',ctrl:'DOCU_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDocu_descripcionfiltercontainer_Class',ctrl:'DOCU_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCdocu_descripcion_Visible',ctrl:'vCDOCU_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLDOCU_PREFIJOFILTER.CLICK","{handler:'e13931',iparms:[{av:'divDocu_prefijofiltercontainer_Class',ctrl:'DOCU_PREFIJOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDocu_prefijofiltercontainer_Class',ctrl:'DOCU_PREFIJOFILTERCONTAINER',prop:'Class'},{av:'edtavCdocu_prefijo_Visible',ctrl:'vCDOCU_PREFIJO',prop:'Visible'}]}");
      setEventMetadata("LBLDOCU_ESTADOFILTER.CLICK","{handler:'e14931',iparms:[{av:'divDocu_estadofiltercontainer_Class',ctrl:'DOCU_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDocu_estadofiltercontainer_Class',ctrl:'DOCU_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCdocu_estado'}]}");
      setEventMetadata("ENTER","{handler:'e18932',iparms:[{av:'A819Docu_Nro',fld:'DOCU_NRO',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV11pDocu_Nro',fld:'vPDOCU_NRO',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDocu_Nro',fld:'vCDOCU_NRO',pic:'ZZZ9',nv:0},{av:'AV7cDocu_Descripcion',fld:'vCDOCU_DESCRIPCION',pic:'',nv:''},{av:'AV8cDocu_Prefijo',fld:'vCDOCU_PREFIJO',pic:'',nv:''},{av:'cmbavCdocu_estado'},{av:'AV13cDocu_Estado',fld:'vCDOCU_ESTADO',pic:'',nv:''},{av:'AV9pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDocu_Nro',fld:'vCDOCU_NRO',pic:'ZZZ9',nv:0},{av:'AV7cDocu_Descripcion',fld:'vCDOCU_DESCRIPCION',pic:'',nv:''},{av:'AV8cDocu_Prefijo',fld:'vCDOCU_PREFIJO',pic:'',nv:''},{av:'cmbavCdocu_estado'},{av:'AV13cDocu_Estado',fld:'vCDOCU_ESTADO',pic:'',nv:''},{av:'AV9pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDocu_Nro',fld:'vCDOCU_NRO',pic:'ZZZ9',nv:0},{av:'AV7cDocu_Descripcion',fld:'vCDOCU_DESCRIPCION',pic:'',nv:''},{av:'AV8cDocu_Prefijo',fld:'vCDOCU_PREFIJO',pic:'',nv:''},{av:'cmbavCdocu_estado'},{av:'AV13cDocu_Estado',fld:'vCDOCU_ESTADO',pic:'',nv:''},{av:'AV9pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDocu_Nro',fld:'vCDOCU_NRO',pic:'ZZZ9',nv:0},{av:'AV7cDocu_Descripcion',fld:'vCDOCU_DESCRIPCION',pic:'',nv:''},{av:'AV8cDocu_Prefijo',fld:'vCDOCU_PREFIJO',pic:'',nv:''},{av:'cmbavCdocu_estado'},{av:'AV13cDocu_Estado',fld:'vCDOCU_ESTADO',pic:'',nv:''},{av:'AV9pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
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
      wcpOAV9pTpmo_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7cDocu_Descripcion = "" ;
      AV8cDocu_Prefijo = "" ;
      AV13cDocu_Estado = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbldocu_nrofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbldocu_descripcionfilter_Jsonclick = "" ;
      lblLbldocu_prefijofilter_Jsonclick = "" ;
      lblLbldocu_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A820Docu_Descripcion = "" ;
      A821Docu_Prefijo = "" ;
      A822Docu_Estado = "" ;
      A38Tpmo_Codigo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cDocu_Descripcion = "" ;
      lV8cDocu_Prefijo = "" ;
      lV13cDocu_Estado = "" ;
      H00932_A41Orig_Identificador = new long[1] ;
      H00932_A38Tpmo_Codigo = new String[] {""} ;
      H00932_A822Docu_Estado = new String[] {""} ;
      H00932_n822Docu_Estado = new boolean[] {false} ;
      H00932_A821Docu_Prefijo = new String[] {""} ;
      H00932_n821Docu_Prefijo = new boolean[] {false} ;
      H00932_A820Docu_Descripcion = new String[] {""} ;
      H00932_n820Docu_Descripcion = new boolean[] {false} ;
      H00932_A819Docu_Nro = new short[1] ;
      H00933_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01m2__default(),
         new Object[] {
             new Object[] {
            H00932_A41Orig_Identificador, H00932_A38Tpmo_Codigo, H00932_A822Docu_Estado, H00932_n822Docu_Estado, H00932_A821Docu_Prefijo, H00932_n821Docu_Prefijo, H00932_A820Docu_Descripcion, H00932_n820Docu_Descripcion, H00932_A819Docu_Nro
            }
            , new Object[] {
            H00933_AGRID1_nRecordCount
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
   private short AV6cDocu_Nro ;
   private short AV11pDocu_Nro ;
   private short wbEnd ;
   private short wbStart ;
   private short A819Docu_Nro ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCdocu_nro_Enabled ;
   private int edtavCdocu_nro_Visible ;
   private int edtavCdocu_descripcion_Visible ;
   private int edtavCdocu_descripcion_Enabled ;
   private int edtavCdocu_prefijo_Visible ;
   private int edtavCdocu_prefijo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV10pOrig_Identificador ;
   private long AV10pOrig_Identificador ;
   private long GRID1_nFirstRecordOnPage ;
   private long A41Orig_Identificador ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divDocu_nrofiltercontainer_Class ;
   private String divDocu_descripcionfiltercontainer_Class ;
   private String divDocu_prefijofiltercontainer_Class ;
   private String divDocu_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String AV13cDocu_Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divDocu_nrofiltercontainer_Internalname ;
   private String lblLbldocu_nrofilter_Internalname ;
   private String lblLbldocu_nrofilter_Jsonclick ;
   private String edtavCdocu_nro_Internalname ;
   private String TempTags ;
   private String edtavCdocu_nro_Jsonclick ;
   private String divDocu_descripcionfiltercontainer_Internalname ;
   private String lblLbldocu_descripcionfilter_Internalname ;
   private String lblLbldocu_descripcionfilter_Jsonclick ;
   private String edtavCdocu_descripcion_Internalname ;
   private String edtavCdocu_descripcion_Jsonclick ;
   private String divDocu_prefijofiltercontainer_Internalname ;
   private String lblLbldocu_prefijofilter_Internalname ;
   private String lblLbldocu_prefijofilter_Jsonclick ;
   private String edtavCdocu_prefijo_Internalname ;
   private String edtavCdocu_prefijo_Jsonclick ;
   private String divDocu_estadofiltercontainer_Internalname ;
   private String lblLbldocu_estadofilter_Internalname ;
   private String lblLbldocu_estadofilter_Jsonclick ;
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
   private String edtDocu_Descripcion_Link ;
   private String A822Docu_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtDocu_Nro_Internalname ;
   private String edtDocu_Descripcion_Internalname ;
   private String edtDocu_Prefijo_Internalname ;
   private String edtTpmo_Codigo_Internalname ;
   private String edtOrig_Identificador_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV13cDocu_Estado ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtDocu_Nro_Jsonclick ;
   private String edtDocu_Descripcion_Jsonclick ;
   private String edtDocu_Prefijo_Jsonclick ;
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtOrig_Identificador_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean n820Docu_Descripcion ;
   private boolean n821Docu_Prefijo ;
   private boolean n822Docu_Estado ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV9pTpmo_Codigo ;
   private String AV7cDocu_Descripcion ;
   private String AV8cDocu_Prefijo ;
   private String AV9pTpmo_Codigo ;
   private String A820Docu_Descripcion ;
   private String A821Docu_Prefijo ;
   private String A38Tpmo_Codigo ;
   private String AV16Linkselection_GXI ;
   private String lV7cDocu_Descripcion ;
   private String lV8cDocu_Prefijo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCdocu_estado ;
   private HTMLChoice cmbDocu_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H00932_A41Orig_Identificador ;
   private String[] H00932_A38Tpmo_Codigo ;
   private String[] H00932_A822Docu_Estado ;
   private boolean[] H00932_n822Docu_Estado ;
   private String[] H00932_A821Docu_Prefijo ;
   private boolean[] H00932_n821Docu_Prefijo ;
   private String[] H00932_A820Docu_Descripcion ;
   private boolean[] H00932_n820Docu_Descripcion ;
   private short[] H00932_A819Docu_Nro ;
   private long[] H00933_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01m2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00932( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cDocu_Descripcion ,
                                          String AV8cDocu_Prefijo ,
                                          String AV13cDocu_Estado ,
                                          String A820Docu_Descripcion ,
                                          String A821Docu_Prefijo ,
                                          String A822Docu_Estado ,
                                          String AV9pTpmo_Codigo ,
                                          long AV10pOrig_Identificador ,
                                          short AV6cDocu_Nro ,
                                          String A38Tpmo_Codigo ,
                                          long A41Orig_Identificador )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Orig_Identificador, Tpmo_Codigo, Docu_Estado, Docu_Prefijo," ;
      sSelectString = sSelectString + " Docu_Descripcion, Docu_Nro" ;
      sFromString = " FROM ALM_TIPO_MOVIMIENTO_DOCU" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Tpmo_Codigo = ? and Orig_Identificador = ? and Docu_Nro >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cDocu_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cDocu_Prefijo)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Prefijo like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13cDocu_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Estado like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Tpmo_Codigo, Orig_Identificador, Docu_Nro" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00933( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cDocu_Descripcion ,
                                          String AV8cDocu_Prefijo ,
                                          String AV13cDocu_Estado ,
                                          String A820Docu_Descripcion ,
                                          String A821Docu_Prefijo ,
                                          String A822Docu_Estado ,
                                          String AV9pTpmo_Codigo ,
                                          long AV10pOrig_Identificador ,
                                          short AV6cDocu_Nro ,
                                          String A38Tpmo_Codigo ,
                                          long A41Orig_Identificador )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [6] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_TIPO_MOVIMIENTO_DOCU" ;
      scmdbuf = scmdbuf + " WHERE (Tpmo_Codigo = ? and Orig_Identificador = ? and Docu_Nro >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cDocu_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cDocu_Prefijo)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Prefijo like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13cDocu_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Docu_Estado like ?)" ;
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
                  return conditional_H00932(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() );
            case 1 :
                  return conditional_H00933(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00932", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00933", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
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
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               return;
      }
   }

}

