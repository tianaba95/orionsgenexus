/*
               File: gx00f0_impl
        Description: Selection List ALMACEN INVENTARIO CONSUMO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:4.93
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

public final  class gx00f0_impl extends GXDataArea
{
   public gx00f0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00f0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00f0_impl.class ));
   }

   public gx00f0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCalma_modulo = new HTMLChoice();
      cmbAlma_Modulo = new HTMLChoice();
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
            AV6cRegional = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cCentro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8cAlma_Modulo = httpContext.GetNextPar( ) ;
            AV9cAlma_Codigo = httpContext.GetNextPar( ) ;
            AV10cBode_Codigo = httpContext.GetNextPar( ) ;
            AV11cTrans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV12cElem_Consecutivo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
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
            AV13pRegional = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pRegional", GXutil.ltrim( GXutil.str( AV13pRegional, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pCentro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pCentro_Id", GXutil.ltrim( GXutil.str( AV14pCentro_Id, 11, 0)));
               AV15pAlma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
               AV16pAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16pAlma_Codigo", AV16pAlma_Codigo);
               AV17pBode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17pBode_Codigo", AV17pBode_Codigo);
               AV18pTrans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18pTrans_Id", GXutil.ltrim( GXutil.str( AV18pTrans_Id, 11, 0)));
               AV19pElem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19pElem_Consecutivo", AV19pElem_Consecutivo);
               AV20pNum_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20pNum_Linea", GXutil.ltrim( GXutil.str( AV20pNum_Linea, 8, 0)));
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
      pa922( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start922( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018614142551");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00f0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRegional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pCentro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17pBode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18pTrans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20pNum_Linea,8,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCREGIONAL", GXutil.ltrim( localUtil.ntoc( AV6cRegional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCENTRO_ID", GXutil.ltrim( localUtil.ntoc( AV7cCentro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_MODULO", AV8cAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_CODIGO", AV9cAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCBODE_CODIGO", AV10cBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTRANS_ID", GXutil.ltrim( localUtil.ntoc( AV11cTrans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV12cElem_Consecutivo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPREGIONAL", GXutil.ltrim( localUtil.ntoc( AV13pRegional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCENTRO_ID", GXutil.ltrim( localUtil.ntoc( AV14pCentro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_MODULO", AV15pAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_CODIGO", AV16pAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPBODE_CODIGO", AV17pBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTRANS_ID", GXutil.ltrim( localUtil.ntoc( AV18pTrans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_CONSECUTIVO", AV19pElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPNUM_LINEA", GXutil.ltrim( localUtil.ntoc( AV20pNum_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGIONALFILTERCONTAINER_Class", GXutil.rtrim( divRegionalfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENTRO_IDFILTERCONTAINER_Class", GXutil.rtrim( divCentro_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULOFILTERCONTAINER_Class", GXutil.rtrim( divAlma_modulofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divAlma_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divBode_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANS_IDFILTERCONTAINER_Class", GXutil.rtrim( divTrans_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
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
         we922( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt922( ) ;
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
      return formatLink("com.orions2.gx00f0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRegional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pCentro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17pBode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18pTrans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20pNum_Linea,8,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00F0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List ALMACEN INVENTARIO CONSUMO" ;
   }

   public void wb920( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRegionalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRegionalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblregionalfilter_Internalname, "Regional", "", "", lblLblregionalfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCregional_Internalname, "Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCregional_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRegional, (byte)(11), (byte)(0), ",", "")), ((edtavCregional_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRegional), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRegional), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCregional_Jsonclick, 0, "Attribute", "", "", "", edtavCregional_Visible, edtavCregional_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCentro_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCentro_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcentro_idfilter_Internalname, "Centro de Costo", "", "", lblLblcentro_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcentro_id_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcentro_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cCentro_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCcentro_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cCentro_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cCentro_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcentro_id_Jsonclick, 0, "Attribute", "", "", "", edtavCcentro_id_Visible, edtavCcentro_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_modulofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_modulofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_modulofilter_Internalname, "Modulo", "", "", lblLblalma_modulofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCalma_modulo.getInternalname(), "Modulo", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCalma_modulo, cmbavCalma_modulo.getInternalname(), GXutil.rtrim( AV8cAlma_Modulo), 1, cmbavCalma_modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCalma_modulo.getVisible(), cmbavCalma_modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx00F0.htm");
         cmbavCalma_modulo.setValue( GXutil.rtrim( AV8cAlma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalma_modulo.getInternalname(), "Values", cmbavCalma_modulo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_codigofilter_Internalname, "Código Almacén", "", "", lblLblalma_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCalma_codigo_Internalname, "Código Almacén", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_codigo_Internalname, AV9cAlma_Codigo, GXutil.rtrim( localUtil.format( AV9cAlma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCalma_codigo_Visible, edtavCalma_codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_codigofilter_Internalname, "Código Bodega", "", "", lblLblbode_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCbode_codigo_Internalname, AV10cBode_Codigo, GXutil.rtrim( localUtil.format( AV10cBode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCbode_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCbode_codigo_Visible, edtavCbode_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTrans_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTrans_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltrans_idfilter_Internalname, "Transaccion Id", "", "", lblLbltrans_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtrans_id_Internalname, "Transaccion Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtrans_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cTrans_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCtrans_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cTrans_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cTrans_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtrans_id_Jsonclick, 0, "Attribute", "", "", "", edtavCtrans_id_Visible, edtavCtrans_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17921_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00F0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV12cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV12cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00F0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18921_client"+"'", TempTags, "", 2, "HLP_Gx00F0.htm");
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
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cod. Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "por transaccion") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A27Alma_Modulo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A28Alma_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A31Bode_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtNum_Linea_Link));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00F0.htm");
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

   public void start922( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List ALMACEN INVENTARIO CONSUMO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup920( ) ;
   }

   public void ws922( )
   {
      start922( ) ;
      evt922( ) ;
   }

   public void evt922( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV24Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A91Regional = localUtil.ctol( httpContext.cgiGet( edtRegional_Internalname), ",", ".") ;
                           A92Centro_Id = localUtil.ctol( httpContext.cgiGet( edtCentro_Id_Internalname), ",", ".") ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
                           A93Trans_Id = localUtil.ctol( httpContext.cgiGet( edtTrans_Id_Internalname), ",", ".") ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( edtNum_Linea_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20922 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cregional Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCREGIONAL"), ",", ".") != AV6cRegional )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccentro_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCENTRO_ID"), ",", ".") != AV7cCentro_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_modulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_MODULO"), AV8cAlma_Modulo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_CODIGO"), AV9cAlma_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cbode_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_CODIGO"), AV10cBode_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctrans_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRANS_ID"), ",", ".") != AV11cTrans_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV12cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21922 ();
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

   public void we922( )
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

   public void pa922( )
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
         cmbavCalma_modulo.setName( "vCALMA_MODULO" );
         cmbavCalma_modulo.setWebtags( "" );
         cmbavCalma_modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbavCalma_modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavCalma_modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbavCalma_modulo.getItemCount() > 0 )
         {
            AV8cAlma_Modulo = cmbavCalma_modulo.getValidValue(AV8cAlma_Modulo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
         }
         GXCCtl = "ALMA_MODULO_" + sGXsfl_84_idx ;
         cmbAlma_Modulo.setName( GXCCtl );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
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
                                  long AV6cRegional ,
                                  long AV7cCentro_Id ,
                                  String AV8cAlma_Modulo ,
                                  String AV9cAlma_Codigo ,
                                  String AV10cBode_Codigo ,
                                  long AV11cTrans_Id ,
                                  String AV12cElem_Consecutivo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf922( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGIONAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGIONAL", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENTRO_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENTRO_ID", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRANS_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANS_ID", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUM_LINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NUM_LINEA", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCalma_modulo.getItemCount() > 0 )
      {
         AV8cAlma_Modulo = cmbavCalma_modulo.getValidValue(AV8cAlma_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf922( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf922( )
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
         lV8cAlma_Modulo = GXutil.concat( GXutil.rtrim( AV8cAlma_Modulo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
         lV9cAlma_Codigo = GXutil.concat( GXutil.rtrim( AV9cAlma_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cAlma_Codigo", AV9cAlma_Codigo);
         lV10cBode_Codigo = GXutil.concat( GXutil.rtrim( AV10cBode_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_Codigo", AV10cBode_Codigo);
         lV12cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV12cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Consecutivo", AV12cElem_Consecutivo);
         /* Using cursor H00922 */
         pr_default.execute(0, new Object[] {new Long(AV6cRegional), new Long(AV7cCentro_Id), lV8cAlma_Modulo, lV9cAlma_Codigo, lV10cBode_Codigo, new Long(AV11cTrans_Id), lV12cElem_Consecutivo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A94Num_Linea = H00922_A94Num_Linea[0] ;
            A66Elem_Consecutivo = H00922_A66Elem_Consecutivo[0] ;
            A93Trans_Id = H00922_A93Trans_Id[0] ;
            A31Bode_Codigo = H00922_A31Bode_Codigo[0] ;
            A28Alma_Codigo = H00922_A28Alma_Codigo[0] ;
            A27Alma_Modulo = H00922_A27Alma_Modulo[0] ;
            A92Centro_Id = H00922_A92Centro_Id[0] ;
            A91Regional = H00922_A91Regional[0] ;
            /* Execute user event: Load */
            e20922 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb920( ) ;
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
      lV8cAlma_Modulo = GXutil.concat( GXutil.rtrim( AV8cAlma_Modulo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
      lV9cAlma_Codigo = GXutil.concat( GXutil.rtrim( AV9cAlma_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cAlma_Codigo", AV9cAlma_Codigo);
      lV10cBode_Codigo = GXutil.concat( GXutil.rtrim( AV10cBode_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_Codigo", AV10cBode_Codigo);
      lV12cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV12cElem_Consecutivo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Consecutivo", AV12cElem_Consecutivo);
      /* Using cursor H00923 */
      pr_default.execute(1, new Object[] {new Long(AV6cRegional), new Long(AV7cCentro_Id), lV8cAlma_Modulo, lV9cAlma_Codigo, lV10cBode_Codigo, new Long(AV11cTrans_Id), lV12cElem_Consecutivo});
      GRID1_nRecordCount = H00923_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRegional, AV7cCentro_Id, AV8cAlma_Modulo, AV9cAlma_Codigo, AV10cBode_Codigo, AV11cTrans_Id, AV12cElem_Consecutivo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup920( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19922 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCregional_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCregional_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCREGIONAL");
            GX_FocusControl = edtavCregional_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cRegional = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRegional", GXutil.ltrim( GXutil.str( AV6cRegional, 11, 0)));
         }
         else
         {
            AV6cRegional = localUtil.ctol( httpContext.cgiGet( edtavCregional_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRegional", GXutil.ltrim( GXutil.str( AV6cRegional, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcentro_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcentro_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCENTRO_ID");
            GX_FocusControl = edtavCcentro_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cCentro_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCentro_Id", GXutil.ltrim( GXutil.str( AV7cCentro_Id, 11, 0)));
         }
         else
         {
            AV7cCentro_Id = localUtil.ctol( httpContext.cgiGet( edtavCcentro_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cCentro_Id", GXutil.ltrim( GXutil.str( AV7cCentro_Id, 11, 0)));
         }
         cmbavCalma_modulo.setName( cmbavCalma_modulo.getInternalname() );
         cmbavCalma_modulo.setValue( httpContext.cgiGet( cmbavCalma_modulo.getInternalname()) );
         AV8cAlma_Modulo = httpContext.cgiGet( cmbavCalma_modulo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
         AV9cAlma_Codigo = httpContext.cgiGet( edtavCalma_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cAlma_Codigo", AV9cAlma_Codigo);
         AV10cBode_Codigo = httpContext.cgiGet( edtavCbode_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cBode_Codigo", AV10cBode_Codigo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtrans_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtrans_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRANS_ID");
            GX_FocusControl = edtavCtrans_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cTrans_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTrans_Id", GXutil.ltrim( GXutil.str( AV11cTrans_Id, 11, 0)));
         }
         else
         {
            AV11cTrans_Id = localUtil.ctol( httpContext.cgiGet( edtavCtrans_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTrans_Id", GXutil.ltrim( GXutil.str( AV11cTrans_Id, 11, 0)));
         }
         AV12cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Consecutivo", AV12cElem_Consecutivo);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCREGIONAL"), ",", ".") != AV6cRegional )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCENTRO_ID"), ",", ".") != AV7cCentro_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_MODULO"), AV8cAlma_Modulo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_CODIGO"), AV9cAlma_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCBODE_CODIGO"), AV10cBode_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTRANS_ID"), ",", ".") != AV11cTrans_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV12cElem_Consecutivo) != 0 )
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
      e19922 ();
      if (returnInSub) return;
   }

   public void e19922( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "ALMACEN INVENTARIO CONSUMO", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV21ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20922( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV24Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e21922 ();
      if (returnInSub) return;
   }

   public void e21922( )
   {
      /* Enter Routine */
      AV13pRegional = A91Regional ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRegional", GXutil.ltrim( GXutil.str( AV13pRegional, 11, 0)));
      AV14pCentro_Id = A92Centro_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCentro_Id", GXutil.ltrim( GXutil.str( AV14pCentro_Id, 11, 0)));
      AV15pAlma_Modulo = A27Alma_Modulo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
      AV16pAlma_Codigo = A28Alma_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pAlma_Codigo", AV16pAlma_Codigo);
      AV17pBode_Codigo = A31Bode_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pBode_Codigo", AV17pBode_Codigo);
      AV18pTrans_Id = A93Trans_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18pTrans_Id", GXutil.ltrim( GXutil.str( AV18pTrans_Id, 11, 0)));
      AV19pElem_Consecutivo = A66Elem_Consecutivo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19pElem_Consecutivo", AV19pElem_Consecutivo);
      AV20pNum_Linea = A94Num_Linea ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20pNum_Linea", GXutil.ltrim( GXutil.str( AV20pNum_Linea, 8, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pRegional),new Long(AV14pCentro_Id),AV15pAlma_Modulo,AV16pAlma_Codigo,AV17pBode_Codigo,new Long(AV18pTrans_Id),AV19pElem_Consecutivo,new Integer(AV20pNum_Linea)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pRegional = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRegional", GXutil.ltrim( GXutil.str( AV13pRegional, 11, 0)));
      AV14pCentro_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pCentro_Id", GXutil.ltrim( GXutil.str( AV14pCentro_Id, 11, 0)));
      AV15pAlma_Modulo = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
      AV16pAlma_Codigo = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pAlma_Codigo", AV16pAlma_Codigo);
      AV17pBode_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17pBode_Codigo", AV17pBode_Codigo);
      AV18pTrans_Id = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18pTrans_Id", GXutil.ltrim( GXutil.str( AV18pTrans_Id, 11, 0)));
      AV19pElem_Consecutivo = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19pElem_Consecutivo", AV19pElem_Consecutivo);
      AV20pNum_Linea = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20pNum_Linea", GXutil.ltrim( GXutil.str( AV20pNum_Linea, 8, 0)));
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
      pa922( ) ;
      ws922( ) ;
      we922( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141425643");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00f0.js", "?20186141425643");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtRegional_Internalname = "REGIONAL_"+sGXsfl_84_idx ;
      edtCentro_Id_Internalname = "CENTRO_ID_"+sGXsfl_84_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_84_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_84_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_84_idx ;
      edtTrans_Id_Internalname = "TRANS_ID_"+sGXsfl_84_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_idx ;
      edtNum_Linea_Internalname = "NUM_LINEA_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtRegional_Internalname = "REGIONAL_"+sGXsfl_84_fel_idx ;
      edtCentro_Id_Internalname = "CENTRO_ID_"+sGXsfl_84_fel_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_84_fel_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_84_fel_idx ;
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_84_fel_idx ;
      edtTrans_Id_Internalname = "TRANS_ID_"+sGXsfl_84_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_fel_idx ;
      edtNum_Linea_Internalname = "NUM_LINEA_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb920( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A27Alma_Modulo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A28Alma_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV24Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV24Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegional_Internalname,GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegional_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCentro_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCentro_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_MODULO_" + sGXsfl_84_idx ;
            cmbAlma_Modulo.setName( GXCCtl );
            cmbAlma_Modulo.setWebtags( "" );
            cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbAlma_Modulo.getItemCount() > 0 )
            {
               A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Codigo_Internalname,A28Alma_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrans_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrans_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtNum_Linea_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A27Alma_Modulo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A28Alma_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A31Bode_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtNum_Linea_Internalname, "Link", edtNum_Linea_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNum_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtNum_Linea_Link,"","","",edtNum_Linea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGIONAL"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENTRO_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRANS_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUM_LINEA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblregionalfilter_Internalname = "LBLREGIONALFILTER" ;
      edtavCregional_Internalname = "vCREGIONAL" ;
      divRegionalfiltercontainer_Internalname = "REGIONALFILTERCONTAINER" ;
      lblLblcentro_idfilter_Internalname = "LBLCENTRO_IDFILTER" ;
      edtavCcentro_id_Internalname = "vCCENTRO_ID" ;
      divCentro_idfiltercontainer_Internalname = "CENTRO_IDFILTERCONTAINER" ;
      lblLblalma_modulofilter_Internalname = "LBLALMA_MODULOFILTER" ;
      cmbavCalma_modulo.setInternalname( "vCALMA_MODULO" );
      divAlma_modulofiltercontainer_Internalname = "ALMA_MODULOFILTERCONTAINER" ;
      lblLblalma_codigofilter_Internalname = "LBLALMA_CODIGOFILTER" ;
      edtavCalma_codigo_Internalname = "vCALMA_CODIGO" ;
      divAlma_codigofiltercontainer_Internalname = "ALMA_CODIGOFILTERCONTAINER" ;
      lblLblbode_codigofilter_Internalname = "LBLBODE_CODIGOFILTER" ;
      edtavCbode_codigo_Internalname = "vCBODE_CODIGO" ;
      divBode_codigofiltercontainer_Internalname = "BODE_CODIGOFILTERCONTAINER" ;
      lblLbltrans_idfilter_Internalname = "LBLTRANS_IDFILTER" ;
      edtavCtrans_id_Internalname = "vCTRANS_ID" ;
      divTrans_idfiltercontainer_Internalname = "TRANS_IDFILTERCONTAINER" ;
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRegional_Internalname = "REGIONAL" ;
      edtCentro_Id_Internalname = "CENTRO_ID" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtTrans_Id_Internalname = "TRANS_ID" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtNum_Linea_Internalname = "NUM_LINEA" ;
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
      edtNum_Linea_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtTrans_Id_Jsonclick = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      edtAlma_Codigo_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      edtCentro_Id_Jsonclick = "" ;
      edtRegional_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtNum_Linea_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      edtavCtrans_id_Jsonclick = "" ;
      edtavCtrans_id_Enabled = 1 ;
      edtavCtrans_id_Visible = 1 ;
      edtavCbode_codigo_Jsonclick = "" ;
      edtavCbode_codigo_Enabled = 1 ;
      edtavCbode_codigo_Visible = 1 ;
      edtavCalma_codigo_Jsonclick = "" ;
      edtavCalma_codigo_Enabled = 1 ;
      edtavCalma_codigo_Visible = 1 ;
      cmbavCalma_modulo.setJsonclick( "" );
      cmbavCalma_modulo.setEnabled( 1 );
      cmbavCalma_modulo.setVisible( 1 );
      edtavCcentro_id_Jsonclick = "" ;
      edtavCcentro_id_Enabled = 1 ;
      edtavCcentro_id_Visible = 1 ;
      edtavCregional_Jsonclick = "" ;
      edtavCregional_Enabled = 1 ;
      edtavCregional_Visible = 1 ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divTrans_idfiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_modulofiltercontainer_Class = "AdvancedContainerItem" ;
      divCentro_idfiltercontainer_Class = "AdvancedContainerItem" ;
      divRegionalfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List ALMACEN INVENTARIO CONSUMO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRegional',fld:'vCREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cCentro_Id',fld:'vCCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV9cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV10cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV11cTrans_Id',fld:'vCTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18921',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLREGIONALFILTER.CLICK","{handler:'e11921',iparms:[{av:'divRegionalfiltercontainer_Class',ctrl:'REGIONALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRegionalfiltercontainer_Class',ctrl:'REGIONALFILTERCONTAINER',prop:'Class'},{av:'edtavCregional_Visible',ctrl:'vCREGIONAL',prop:'Visible'}]}");
      setEventMetadata("LBLCENTRO_IDFILTER.CLICK","{handler:'e12921',iparms:[{av:'divCentro_idfiltercontainer_Class',ctrl:'CENTRO_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCentro_idfiltercontainer_Class',ctrl:'CENTRO_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCcentro_id_Visible',ctrl:'vCCENTRO_ID',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_MODULOFILTER.CLICK","{handler:'e13921',iparms:[{av:'divAlma_modulofiltercontainer_Class',ctrl:'ALMA_MODULOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_modulofiltercontainer_Class',ctrl:'ALMA_MODULOFILTERCONTAINER',prop:'Class'},{av:'cmbavCalma_modulo'}]}");
      setEventMetadata("LBLALMA_CODIGOFILTER.CLICK","{handler:'e14921',iparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCalma_codigo_Visible',ctrl:'vCALMA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_CODIGOFILTER.CLICK","{handler:'e15921',iparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCbode_codigo_Visible',ctrl:'vCBODE_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTRANS_IDFILTER.CLICK","{handler:'e16921',iparms:[{av:'divTrans_idfiltercontainer_Class',ctrl:'TRANS_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTrans_idfiltercontainer_Class',ctrl:'TRANS_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCtrans_id_Visible',ctrl:'vCTRANS_ID',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e17921',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e21922',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pRegional',fld:'vPREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14pCentro_Id',fld:'vPCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV15pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',nv:''},{av:'AV16pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',nv:''},{av:'AV17pBode_Codigo',fld:'vPBODE_CODIGO',pic:'',nv:''},{av:'AV18pTrans_Id',fld:'vPTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV20pNum_Linea',fld:'vPNUM_LINEA',pic:'ZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRegional',fld:'vCREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cCentro_Id',fld:'vCCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV9cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV10cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV11cTrans_Id',fld:'vCTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRegional',fld:'vCREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cCentro_Id',fld:'vCCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV9cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV10cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV11cTrans_Id',fld:'vCTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRegional',fld:'vCREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cCentro_Id',fld:'vCCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV9cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV10cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV11cTrans_Id',fld:'vCTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRegional',fld:'vCREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cCentro_Id',fld:'vCCENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV9cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV10cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',nv:''},{av:'AV11cTrans_Id',fld:'vCTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[]}");
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
      AV8cAlma_Modulo = "" ;
      AV9cAlma_Codigo = "" ;
      AV10cBode_Codigo = "" ;
      AV12cElem_Consecutivo = "" ;
      GXKey = "" ;
      AV15pAlma_Modulo = "" ;
      AV16pAlma_Codigo = "" ;
      AV17pBode_Codigo = "" ;
      AV19pElem_Consecutivo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblregionalfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcentro_idfilter_Jsonclick = "" ;
      lblLblalma_modulofilter_Jsonclick = "" ;
      lblLblalma_codigofilter_Jsonclick = "" ;
      lblLblbode_codigofilter_Jsonclick = "" ;
      lblLbltrans_idfilter_Jsonclick = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV8cAlma_Modulo = "" ;
      lV9cAlma_Codigo = "" ;
      lV10cBode_Codigo = "" ;
      lV12cElem_Consecutivo = "" ;
      H00922_A94Num_Linea = new int[1] ;
      H00922_A66Elem_Consecutivo = new String[] {""} ;
      H00922_A93Trans_Id = new long[1] ;
      H00922_A31Bode_Codigo = new String[] {""} ;
      H00922_A28Alma_Codigo = new String[] {""} ;
      H00922_A27Alma_Modulo = new String[] {""} ;
      H00922_A92Centro_Id = new long[1] ;
      H00922_A91Regional = new long[1] ;
      H00923_AGRID1_nRecordCount = new long[1] ;
      AV21ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00f0__default(),
         new Object[] {
             new Object[] {
            H00922_A94Num_Linea, H00922_A66Elem_Consecutivo, H00922_A93Trans_Id, H00922_A31Bode_Codigo, H00922_A28Alma_Codigo, H00922_A27Alma_Modulo, H00922_A92Centro_Id, H00922_A91Regional
            }
            , new Object[] {
            H00923_AGRID1_nRecordCount
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
   private int AV20pNum_Linea ;
   private int edtavCregional_Enabled ;
   private int edtavCregional_Visible ;
   private int edtavCcentro_id_Enabled ;
   private int edtavCcentro_id_Visible ;
   private int edtavCalma_codigo_Visible ;
   private int edtavCalma_codigo_Enabled ;
   private int edtavCbode_codigo_Visible ;
   private int edtavCbode_codigo_Enabled ;
   private int edtavCtrans_id_Enabled ;
   private int edtavCtrans_id_Visible ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A94Num_Linea ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cRegional ;
   private long AV7cCentro_Id ;
   private long AV11cTrans_Id ;
   private long AV13pRegional ;
   private long AV14pCentro_Id ;
   private long AV18pTrans_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divRegionalfiltercontainer_Class ;
   private String divCentro_idfiltercontainer_Class ;
   private String divAlma_modulofiltercontainer_Class ;
   private String divAlma_codigofiltercontainer_Class ;
   private String divBode_codigofiltercontainer_Class ;
   private String divTrans_idfiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
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
   private String divRegionalfiltercontainer_Internalname ;
   private String lblLblregionalfilter_Internalname ;
   private String lblLblregionalfilter_Jsonclick ;
   private String edtavCregional_Internalname ;
   private String TempTags ;
   private String edtavCregional_Jsonclick ;
   private String divCentro_idfiltercontainer_Internalname ;
   private String lblLblcentro_idfilter_Internalname ;
   private String lblLblcentro_idfilter_Jsonclick ;
   private String edtavCcentro_id_Internalname ;
   private String edtavCcentro_id_Jsonclick ;
   private String divAlma_modulofiltercontainer_Internalname ;
   private String lblLblalma_modulofilter_Internalname ;
   private String lblLblalma_modulofilter_Jsonclick ;
   private String divAlma_codigofiltercontainer_Internalname ;
   private String lblLblalma_codigofilter_Internalname ;
   private String lblLblalma_codigofilter_Jsonclick ;
   private String edtavCalma_codigo_Internalname ;
   private String edtavCalma_codigo_Jsonclick ;
   private String divBode_codigofiltercontainer_Internalname ;
   private String lblLblbode_codigofilter_Internalname ;
   private String lblLblbode_codigofilter_Jsonclick ;
   private String edtavCbode_codigo_Internalname ;
   private String edtavCbode_codigo_Jsonclick ;
   private String divTrans_idfiltercontainer_Internalname ;
   private String lblLbltrans_idfilter_Internalname ;
   private String lblLbltrans_idfilter_Jsonclick ;
   private String edtavCtrans_id_Internalname ;
   private String edtavCtrans_id_Jsonclick ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
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
   private String edtNum_Linea_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRegional_Internalname ;
   private String edtCentro_Id_Internalname ;
   private String edtAlma_Codigo_Internalname ;
   private String edtBode_Codigo_Internalname ;
   private String edtTrans_Id_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtNum_Linea_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV21ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRegional_Jsonclick ;
   private String edtCentro_Id_Jsonclick ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtTrans_Id_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtNum_Linea_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cAlma_Modulo ;
   private String AV9cAlma_Codigo ;
   private String AV10cBode_Codigo ;
   private String AV12cElem_Consecutivo ;
   private String AV15pAlma_Modulo ;
   private String AV16pAlma_Codigo ;
   private String AV17pBode_Codigo ;
   private String AV19pElem_Consecutivo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String AV24Linkselection_GXI ;
   private String lV8cAlma_Modulo ;
   private String lV9cAlma_Codigo ;
   private String lV10cBode_Codigo ;
   private String lV12cElem_Consecutivo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCalma_modulo ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private int[] H00922_A94Num_Linea ;
   private String[] H00922_A66Elem_Consecutivo ;
   private long[] H00922_A93Trans_Id ;
   private String[] H00922_A31Bode_Codigo ;
   private String[] H00922_A28Alma_Codigo ;
   private String[] H00922_A27Alma_Modulo ;
   private long[] H00922_A92Centro_Id ;
   private long[] H00922_A91Regional ;
   private long[] H00923_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00f0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00922", "SELECT /*+ FIRST_ROWS(11) */ Num_Linea, Elem_Consecutivo, Trans_Id, Bode_Codigo, Alma_Codigo, Alma_Modulo, Centro_Id, Regional FROM ALM_INV_CON WHERE (Regional >= ? and Centro_Id >= ?) AND (Alma_Modulo like ?) AND (Alma_Codigo like ?) AND (Bode_Codigo like ?) AND (Trans_Id >= ?) AND (Elem_Consecutivo like ?) ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00923", "SELECT COUNT(*) FROM ALM_INV_CON WHERE (Regional >= ? and Centro_Id >= ?) AND (Alma_Modulo like ?) AND (Alma_Codigo like ?) AND (Bode_Codigo like ?) AND (Trans_Id >= ?) AND (Elem_Consecutivo like ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
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
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               return;
      }
   }

}

