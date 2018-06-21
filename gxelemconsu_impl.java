/*
               File: gxelemconsu_impl
        Description: Consulta elemento consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:43.25
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

public final  class gxelemconsu_impl extends GXDataArea
{
   public gxelemconsu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gxelemconsu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxelemconsu_impl.class ));
   }

   public gxelemconsu_impl( int remoteHandle ,
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
            nRC_GXsfl_55 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_55_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_55_idx = httpContext.GetNextPar( ) ;
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
            AV19cClas_Descripcion = httpContext.GetNextPar( ) ;
            AV18cCata_Descripcion = httpContext.GetNextPar( ) ;
            AV23cElem_Descripcion = httpContext.GetNextPar( ) ;
            AV6cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV21pTran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
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
            AV11pElem_Consecutivo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pElem_Consecutivo", AV11pElem_Consecutivo);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV20pElem_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20pElem_Descripcion", AV20pElem_Descripcion);
               AV13pCata_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pCata_Descripcion", AV13pCata_Descripcion);
               AV14pTIP_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pTIP_Codigo", AV14pTIP_Codigo);
               AV15pSEG_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15pSEG_Codigo", AV15pSEG_Codigo);
               AV16pFAM_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16pFAM_Codigo", AV16pFAM_Codigo);
               AV17pClas_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17pClas_Codigo", AV17pClas_Codigo);
               AV22pCata_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22pCata_Codigo", AV22pCata_Codigo);
               AV21pTran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21pTran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV21pTran_CodTipoElemento, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTRAN_CODTIPOELEMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21pTran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa6F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6F2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414204330");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gxelemconsu") + "?" + GXutil.URLEncode(GXutil.rtrim(AV11pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20pElem_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pCata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTIP_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pSEG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16pFAM_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17pClas_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV22pCata_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21pTran_CodTipoElemento,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCLAS_DESCRIPCION", AV19cClas_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCATA_DESCRIPCION", AV18cCata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_DESCRIPCION", AV23cElem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV6cElem_Consecutivo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( AV21pTran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIP_CODIGO", A74TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_CONSECUTIVO", AV11pElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_DESCRIPCION", AV20pElem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCATA_DESCRIPCION", AV13pCata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTIP_CODIGO", AV14pTIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPSEG_CODIGO", AV15pSEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPFAM_CODIGO", AV16pFAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCLAS_CODIGO", AV17pClas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCATA_CODIGO", AV22pCata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTRAN_CODTIPOELEMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21pTran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTRAN_CODTIPOELEMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21pTran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCata_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divClas_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divElem_descripcionfiltercontainer_Class));
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
         we6F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6F2( ) ;
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
      return formatLink("com.orions2.gxelemconsu") + "?" + GXutil.URLEncode(GXutil.rtrim(AV11pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20pElem_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pCata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTIP_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pSEG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16pFAM_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17pClas_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV22pCata_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21pTran_CodTipoElemento,18,0))) ;
   }

   public String getPgmname( )
   {
      return "GxElemConsu" ;
   }

   public String getPgmdesc( )
   {
      return "Consulta elemento consumo" ;
   }

   public void wb6F0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-2 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divClas_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divClas_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblclas_descripcionfilter_Internalname, "Clase", "", "", lblLblclas_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxElemConsu.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCclas_descripcion_Internalname, "Descripción Clase", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCclas_descripcion_Internalname, AV19cClas_Descripcion, GXutil.rtrim( localUtil.format( AV19cClas_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCclas_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCclas_descripcion_Visible, edtavCclas_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxElemConsu.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCata_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCata_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcata_descripcionfilter_Internalname, "Bien", "", "", lblLblcata_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxElemConsu.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCcata_descripcion_Internalname, AV18cCata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", (short)(0), edtavCcata_descripcion_Visible, edtavCcata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GxElemConsu.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelm_descripcionfilter_Internalname, "Descripción", "", "", lblLblelm_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e136f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxElemConsu.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCelem_descripcion_Internalname, AV23cElem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", (short)(0), edtavCelem_descripcion_Visible, edtavCelem_descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GxElemConsu.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e146f1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxElemConsu.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV6cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV6cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxElemConsu.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-md-10 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e156f1_client"+"'", TempTags, "", 2, "HLP_GxElemConsu.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"55\">") ;
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
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código del Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Familia Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
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
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A37Cata_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A291Clas_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A298Cata_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A557Elem_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A75SEG_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A35FAM_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A34Clas_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (short)(nGXsfl_55_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GxElemConsu.htm");
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

   public void start6F2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Consulta elemento consumo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6F0( ) ;
   }

   public void ws6F2( )
   {
      start6F2( ) ;
      evt6F2( ) ;
   }

   public void evt6F2( )
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
                           nGXsfl_55_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV26Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_55_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
                           A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
                           A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e166F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e176F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cclas_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLAS_DESCRIPCION"), AV19cClas_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccata_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCATA_DESCRIPCION"), AV18cCata_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_DESCRIPCION"), AV23cElem_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV6cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e186F2 ();
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

   public void we6F2( )
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

   public void pa6F2( )
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_55_idx+1)) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV19cClas_Descripcion ,
                                  String AV18cCata_Descripcion ,
                                  String AV23cElem_Descripcion ,
                                  String AV6cElem_Consecutivo ,
                                  long AV21pTran_CodTipoElemento )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf6F2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6F2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf6F2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(55) ;
      nGXsfl_55_idx = (short)(1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         lV6cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV6cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cElem_Consecutivo", AV6cElem_Consecutivo);
         /* Using cursor H006F2 */
         pr_default.execute(0, new Object[] {lV6cElem_Consecutivo, new Long(AV21pTran_CodTipoElemento)});
         nGXsfl_55_idx = (short)(1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         GRID1_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 7 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A74TIP_Codigo = H006F2_A74TIP_Codigo[0] ;
            A34Clas_Codigo = H006F2_A34Clas_Codigo[0] ;
            A35FAM_Codigo = H006F2_A35FAM_Codigo[0] ;
            A75SEG_Codigo = H006F2_A75SEG_Codigo[0] ;
            A33Tipo_Codigo = H006F2_A33Tipo_Codigo[0] ;
            A557Elem_Descripcion = H006F2_A557Elem_Descripcion[0] ;
            A298Cata_Descripcion = H006F2_A298Cata_Descripcion[0] ;
            A291Clas_Descripcion = H006F2_A291Clas_Descripcion[0] ;
            A37Cata_Codigo = H006F2_A37Cata_Codigo[0] ;
            A66Elem_Consecutivo = H006F2_A66Elem_Consecutivo[0] ;
            A34Clas_Codigo = H006F2_A34Clas_Codigo[0] ;
            A298Cata_Descripcion = H006F2_A298Cata_Descripcion[0] ;
            A35FAM_Codigo = H006F2_A35FAM_Codigo[0] ;
            A291Clas_Descripcion = H006F2_A291Clas_Descripcion[0] ;
            A75SEG_Codigo = H006F2_A75SEG_Codigo[0] ;
            A74TIP_Codigo = H006F2_A74TIP_Codigo[0] ;
            if ( (GXutil.strcmp("", AV18cCata_Descripcion)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18cCata_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV19cClas_Descripcion)==0) || ( GXutil.like( GXutil.upper( A291Clas_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cClas_Descripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV23cElem_Descripcion)==0) || ( GXutil.like( GXutil.upper( A557Elem_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cElem_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                  {
                     /* Execute user event: Load */
                     e176F2 ();
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(55) ;
         wb6F0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
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
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 7*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
      }
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
         gxgrgrid1_refresh( subGrid1_Rows, AV19cClas_Descripcion, AV18cCata_Descripcion, AV23cElem_Descripcion, AV6cElem_Consecutivo, AV21pTran_CodTipoElemento) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6F0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e166F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV19cClas_Descripcion = httpContext.cgiGet( edtavCclas_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cClas_Descripcion", AV19cClas_Descripcion);
         AV18cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18cCata_Descripcion", AV18cCata_Descripcion);
         AV23cElem_Descripcion = httpContext.cgiGet( edtavCelem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23cElem_Descripcion", AV23cElem_Descripcion);
         AV6cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cElem_Consecutivo", AV6cElem_Consecutivo);
         /* Read saved values. */
         nRC_GXsfl_55 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCLAS_DESCRIPCION"), AV19cClas_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCATA_DESCRIPCION"), AV18cCata_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_DESCRIPCION"), AV23cElem_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV6cElem_Consecutivo) != 0 )
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
      e166F2 ();
      if (returnInSub) return;
   }

   public void e166F2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Elemento", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e176F2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV26Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      if ( ( subGrid1_Islastpage == 1 ) || ( 7 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_552( ) ;
         GRID1_nEOF = (byte)(1) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
         {
            GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
         }
      }
      if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
      {
         GRID1_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e186F2 ();
      if (returnInSub) return;
   }

   public void e186F2( )
   {
      /* Enter Routine */
      AV11pElem_Consecutivo = A66Elem_Consecutivo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pElem_Consecutivo", AV11pElem_Consecutivo);
      AV20pElem_Descripcion = A557Elem_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20pElem_Descripcion", AV20pElem_Descripcion);
      AV13pCata_Descripcion = A298Cata_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCata_Descripcion", AV13pCata_Descripcion);
      AV14pTIP_Codigo = A74TIP_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTIP_Codigo", AV14pTIP_Codigo);
      AV15pSEG_Codigo = A75SEG_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pSEG_Codigo", AV15pSEG_Codigo);
      AV16pFAM_Codigo = A35FAM_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pFAM_Codigo", AV16pFAM_Codigo);
      AV17pClas_Codigo = A34Clas_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pClas_Codigo", AV17pClas_Codigo);
      AV22pCata_Codigo = A37Cata_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22pCata_Codigo", AV22pCata_Codigo);
      httpContext.setWebReturnParms(new Object[] {AV11pElem_Consecutivo,AV20pElem_Descripcion,AV13pCata_Descripcion,AV14pTIP_Codigo,AV15pSEG_Codigo,AV16pFAM_Codigo,AV17pClas_Codigo,AV22pCata_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV11pElem_Consecutivo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pElem_Consecutivo", AV11pElem_Consecutivo);
      AV20pElem_Descripcion = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20pElem_Descripcion", AV20pElem_Descripcion);
      AV13pCata_Descripcion = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pCata_Descripcion", AV13pCata_Descripcion);
      AV14pTIP_Codigo = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTIP_Codigo", AV14pTIP_Codigo);
      AV15pSEG_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pSEG_Codigo", AV15pSEG_Codigo);
      AV16pFAM_Codigo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pFAM_Codigo", AV16pFAM_Codigo);
      AV17pClas_Codigo = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pClas_Codigo", AV17pClas_Codigo);
      AV22pCata_Codigo = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22pCata_Codigo", AV22pCata_Codigo);
      AV21pTran_CodTipoElemento = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21pTran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV21pTran_CodTipoElemento, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTRAN_CODTIPOELEMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21pTran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa6F2( ) ;
      ws6F2( ) ;
      we6F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414204430");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxelemconsu.js", "?201861414204430");
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_55_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_55_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_55_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_55_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_55_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_55_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_55_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_55_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_55_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_55_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_55_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_55_fel_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_55_fel_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_55_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_55_fel_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_55_fel_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_55_fel_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_55_fel_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_55_fel_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_55_fel_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb6F0( ) ;
      if ( ( 7 * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A557Elem_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A298Cata_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A74TIP_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A35FAM_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A34Clas_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A37Cata_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_55_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV26Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV26Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Codigo_Internalname,A37Cata_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Descripcion_Internalname,A291Clas_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(150),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Descripcion_Internalname,A557Elem_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2000),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Codigo_Internalname,A35FAM_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Codigo_Internalname,A34Clas_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_55_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_55_idx+1)) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void init_default_properties( )
   {
      lblLblclas_descripcionfilter_Internalname = "LBLCLAS_DESCRIPCIONFILTER" ;
      edtavCclas_descripcion_Internalname = "vCCLAS_DESCRIPCION" ;
      divClas_descripcionfiltercontainer_Internalname = "CLAS_DESCRIPCIONFILTERCONTAINER" ;
      lblLblcata_descripcionfilter_Internalname = "LBLCATA_DESCRIPCIONFILTER" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      divCata_descripcionfiltercontainer_Internalname = "CATA_DESCRIPCIONFILTERCONTAINER" ;
      lblLblelm_descripcionfilter_Internalname = "LBLELM_DESCRIPCIONFILTER" ;
      edtavCelem_descripcion_Internalname = "vCELEM_DESCRIPCION" ;
      divElem_descripcionfiltercontainer_Internalname = "ELEM_DESCRIPCIONFILTERCONTAINER" ;
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
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
      edtClas_Codigo_Jsonclick = "" ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtElem_Descripcion_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtCata_Codigo_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      edtavCelem_descripcion_Enabled = 1 ;
      edtavCelem_descripcion_Visible = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavCcata_descripcion_Visible = 1 ;
      edtavCclas_descripcion_Jsonclick = "" ;
      edtavCclas_descripcion_Enabled = 1 ;
      edtavCclas_descripcion_Visible = 1 ;
      divElem_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divClas_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divCata_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Consulta elemento consumo" );
      subGrid1_Rows = 7 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19cClas_Descripcion',fld:'vCCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21pTran_CodTipoElemento',fld:'vPTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e156F1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e146F1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLCATA_DESCRIPCIONFILTER.CLICK","{handler:'e126F1',iparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCcata_descripcion_Visible',ctrl:'vCCATA_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLCLAS_DESCRIPCIONFILTER.CLICK","{handler:'e116F1',iparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCclas_descripcion_Visible',ctrl:'vCCLAS_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLELM_DESCRIPCIONFILTER.CLICK","{handler:'e136F1',iparms:[{av:'divElem_descripcionfiltercontainer_Class',ctrl:'ELEM_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_descripcionfiltercontainer_Class',ctrl:'ELEM_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_descripcion_Visible',ctrl:'vCELEM_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e186F2',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A557Elem_Descripcion',fld:'ELEM_DESCRIPCION',pic:'',hsh:true,nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',nv:''},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',nv:''},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',nv:''},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'AV11pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV20pElem_Descripcion',fld:'vPELEM_DESCRIPCION',pic:'',nv:''},{av:'AV13pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV14pTIP_Codigo',fld:'vPTIP_CODIGO',pic:'',nv:''},{av:'AV15pSEG_Codigo',fld:'vPSEG_CODIGO',pic:'',nv:''},{av:'AV16pFAM_Codigo',fld:'vPFAM_CODIGO',pic:'',nv:''},{av:'AV17pClas_Codigo',fld:'vPCLAS_CODIGO',pic:'',nv:''},{av:'AV22pCata_Codigo',fld:'vPCATA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19cClas_Descripcion',fld:'vCCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21pTran_CodTipoElemento',fld:'vPTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19cClas_Descripcion',fld:'vCCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21pTran_CodTipoElemento',fld:'vPTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19cClas_Descripcion',fld:'vCCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21pTran_CodTipoElemento',fld:'vPTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19cClas_Descripcion',fld:'vCCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21pTran_CodTipoElemento',fld:'vPTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
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
      AV19cClas_Descripcion = "" ;
      AV18cCata_Descripcion = "" ;
      AV23cElem_Descripcion = "" ;
      AV6cElem_Consecutivo = "" ;
      GXKey = "" ;
      AV11pElem_Consecutivo = "" ;
      AV20pElem_Descripcion = "" ;
      AV13pCata_Descripcion = "" ;
      AV14pTIP_Codigo = "" ;
      AV15pSEG_Codigo = "" ;
      AV16pFAM_Codigo = "" ;
      AV17pClas_Codigo = "" ;
      AV22pCata_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A74TIP_Codigo = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblclas_descripcionfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcata_descripcionfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblLblelm_descripcionfilter_Jsonclick = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A557Elem_Descripcion = "" ;
      A75SEG_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A34Clas_Codigo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV26Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV6cElem_Consecutivo = "" ;
      H006F2_A74TIP_Codigo = new String[] {""} ;
      H006F2_A34Clas_Codigo = new String[] {""} ;
      H006F2_A35FAM_Codigo = new String[] {""} ;
      H006F2_A75SEG_Codigo = new String[] {""} ;
      H006F2_A33Tipo_Codigo = new long[1] ;
      H006F2_A557Elem_Descripcion = new String[] {""} ;
      H006F2_A298Cata_Descripcion = new String[] {""} ;
      H006F2_A291Clas_Descripcion = new String[] {""} ;
      H006F2_A37Cata_Codigo = new String[] {""} ;
      H006F2_A66Elem_Consecutivo = new String[] {""} ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gxelemconsu__default(),
         new Object[] {
             new Object[] {
            H006F2_A74TIP_Codigo, H006F2_A34Clas_Codigo, H006F2_A35FAM_Codigo, H006F2_A75SEG_Codigo, H006F2_A33Tipo_Codigo, H006F2_A557Elem_Descripcion, H006F2_A298Cata_Descripcion, H006F2_A291Clas_Descripcion, H006F2_A37Cata_Codigo, H006F2_A66Elem_Consecutivo
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
   private short nRC_GXsfl_55 ;
   private short nGXsfl_55_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCclas_descripcion_Visible ;
   private int edtavCclas_descripcion_Enabled ;
   private int edtavCcata_descripcion_Visible ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavCelem_descripcion_Visible ;
   private int edtavCelem_descripcion_Enabled ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV21pTran_CodTipoElemento ;
   private long AV21pTran_CodTipoElemento ;
   private long GRID1_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divCata_descripcionfiltercontainer_Class ;
   private String divClas_descripcionfiltercontainer_Class ;
   private String divElem_descripcionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_55_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divClas_descripcionfiltercontainer_Internalname ;
   private String lblLblclas_descripcionfilter_Internalname ;
   private String lblLblclas_descripcionfilter_Jsonclick ;
   private String edtavCclas_descripcion_Internalname ;
   private String TempTags ;
   private String edtavCclas_descripcion_Jsonclick ;
   private String divCata_descripcionfiltercontainer_Internalname ;
   private String lblLblcata_descripcionfilter_Internalname ;
   private String lblLblcata_descripcionfilter_Jsonclick ;
   private String edtavCcata_descripcion_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divElem_descripcionfiltercontainer_Internalname ;
   private String lblLblelm_descripcionfilter_Internalname ;
   private String lblLblelm_descripcionfilter_Jsonclick ;
   private String edtavCelem_descripcion_Internalname ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divGridtable_Internalname ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtClas_Descripcion_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtSEG_Codigo_Internalname ;
   private String edtFAM_Codigo_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String scmdbuf ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtElem_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtClas_Codigo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV19cClas_Descripcion ;
   private String AV18cCata_Descripcion ;
   private String AV23cElem_Descripcion ;
   private String AV6cElem_Consecutivo ;
   private String AV11pElem_Consecutivo ;
   private String AV20pElem_Descripcion ;
   private String AV13pCata_Descripcion ;
   private String AV14pTIP_Codigo ;
   private String AV15pSEG_Codigo ;
   private String AV16pFAM_Codigo ;
   private String AV17pClas_Codigo ;
   private String AV22pCata_Codigo ;
   private String A74TIP_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A291Clas_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A557Elem_Descripcion ;
   private String A75SEG_Codigo ;
   private String A35FAM_Codigo ;
   private String A34Clas_Codigo ;
   private String AV26Linkselection_GXI ;
   private String lV6cElem_Consecutivo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H006F2_A74TIP_Codigo ;
   private String[] H006F2_A34Clas_Codigo ;
   private String[] H006F2_A35FAM_Codigo ;
   private String[] H006F2_A75SEG_Codigo ;
   private long[] H006F2_A33Tipo_Codigo ;
   private String[] H006F2_A557Elem_Descripcion ;
   private String[] H006F2_A298Cata_Descripcion ;
   private String[] H006F2_A291Clas_Descripcion ;
   private String[] H006F2_A37Cata_Codigo ;
   private String[] H006F2_A66Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gxelemconsu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006F2", "SELECT /*+ FIRST_ROWS(8) */ T5.TIP_Codigo, T2.Clas_Codigo, T3.FAM_Codigo, T4.SEG_Codigo, T1.Tipo_Codigo, T1.Elem_Descripcion, T2.Cata_Descripcion, T3.Clas_Descripcion, T1.Cata_Codigo, T1.Elem_Consecutivo FROM ((((ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) INNER JOIN ALM_CLASE T3 ON T3.Clas_Codigo = T2.Clas_Codigo) INNER JOIN ALM_CAT_FAM T4 ON T4.FAM_Codigo = T3.FAM_Codigo) INNER JOIN ALM_CAT_SEG T5 ON T5.SEG_Codigo = T4.SEG_Codigo) WHERE (T1.Elem_Consecutivo like ?) AND (T1.Tipo_Codigo = ?) ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,8,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

