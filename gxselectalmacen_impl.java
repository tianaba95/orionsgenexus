/*
               File: gxselectalmacen_impl
        Description: Gx Select Almacen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:22:11.51
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

public final  class gxselectalmacen_impl extends GXDataArea
{
   public gxselectalmacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gxselectalmacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxselectalmacen_impl.class ));
   }

   public gxselectalmacen_impl( int remoteHandle ,
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
            AV11cCent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8cAlma_Modulo = httpContext.GetNextPar( ) ;
            AV6cAlma_Codigo = httpContext.GetNextPar( ) ;
            AV7cAlma_Descripcion = httpContext.GetNextPar( ) ;
            AV12cTpal_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cAlma_Telefono1 = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cAlma_Telefono2 = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
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
            AV16pCent_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16pCent_Id", GXutil.ltrim( GXutil.str( AV16pCent_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15pAlma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
               AV14pAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pAlma_Codigo", AV14pAlma_Codigo);
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
      pa7N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7N2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414221159");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gxselectalmacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16pCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pAlma_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCENT_ID", GXutil.ltrim( localUtil.ntoc( AV11cCent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_MODULO", AV8cAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_CODIGO", AV6cAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_DESCRIPCION", AV7cAlma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPAL_ID", GXutil.ltrim( localUtil.ntoc( AV12cTpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_TELEFONO1", GXutil.ltrim( localUtil.ntoc( AV9cAlma_Telefono1, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCALMA_TELEFONO2", GXutil.ltrim( localUtil.ntoc( AV10cAlma_Telefono2, (byte)(18), (byte)(0), ",", "")));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCENT_ID", GXutil.ltrim( localUtil.ntoc( AV16pCent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_MODULO", AV15pAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_CODIGO", AV14pAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_IDFILTERCONTAINER_Class", GXutil.rtrim( divCent_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULOFILTERCONTAINER_Class", GXutil.rtrim( divAlma_modulofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divAlma_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divAlma_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_IDFILTERCONTAINER_Class", GXutil.rtrim( divTpal_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_TELEFONO1FILTERCONTAINER_Class", GXutil.rtrim( divAlma_telefono1filtercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_TELEFONO2FILTERCONTAINER_Class", GXutil.rtrim( divAlma_telefono2filtercontainer_Class));
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
         we7N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7N2( ) ;
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
      return formatLink("com.orions2.gxselectalmacen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16pCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pAlma_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "GxSelectAlmacen" ;
   }

   public String getPgmdesc( )
   {
      return "Gx Select Almacen" ;
   }

   public void wb7N0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_idfilter_Internalname, "Identificador Centro de Costo", "", "", lblLblcent_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e117n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcent_id_Internalname, "Identificador Centro de Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcent_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cCent_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCcent_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cCent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cCent_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcent_id_Jsonclick, 0, "Attribute", "", "", "", edtavCcent_id_Visible, edtavCcent_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_modulofilter_Internalname, "Modulo", "", "", lblLblalma_modulofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e127n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCalma_modulo, cmbavCalma_modulo.getInternalname(), GXutil.rtrim( AV8cAlma_Modulo), 1, cmbavCalma_modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCalma_modulo.getVisible(), cmbavCalma_modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_codigofilter_Internalname, "Código Almacén", "", "", lblLblalma_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e137n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_codigo_Internalname, AV6cAlma_Codigo, GXutil.rtrim( localUtil.format( AV6cAlma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCalma_codigo_Visible, edtavCalma_codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_descripcionfilter_Internalname, "Descripción Almacén", "", "", lblLblalma_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e147n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCalma_descripcion_Internalname, "Descripción Almacén", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_descripcion_Internalname, AV7cAlma_Descripcion, GXutil.rtrim( localUtil.format( AV7cAlma_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCalma_descripcion_Visible, edtavCalma_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpal_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpal_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpal_idfilter_Internalname, "Id Tipo Almacén", "", "", lblLbltpal_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e157n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpal_id_Internalname, "Identificador Tipo Almacén", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpal_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cTpal_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCtpal_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12cTpal_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12cTpal_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpal_id_Jsonclick, 0, "Attribute", "", "", "", edtavCtpal_id_Visible, edtavCtpal_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_telefono1filtercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_telefono1filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_telefono1filter_Internalname, "Telefono1", "", "", lblLblalma_telefono1filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e167n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCalma_telefono1_Internalname, "Telefono1", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_telefono1_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cAlma_Telefono1, (byte)(18), (byte)(0), ",", "")), ((edtavCalma_telefono1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cAlma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cAlma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_telefono1_Jsonclick, 0, "Attribute", "", "", "", edtavCalma_telefono1_Visible, edtavCalma_telefono1_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_telefono2filtercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_telefono2filtercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_telefono2filter_Internalname, "Telefono2", "", "", lblLblalma_telefono2filter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e177n1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxSelectAlmacen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCalma_telefono2_Internalname, "Telefono2", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCalma_telefono2_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cAlma_Telefono2, (byte)(18), (byte)(0), ",", "")), ((edtavCalma_telefono2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cAlma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cAlma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalma_telefono2_Jsonclick, 0, "Attribute", "", "", "", edtavCalma_telefono2_Visible, edtavCalma_telefono2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GxSelectAlmacen.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e187n1_client"+"'", TempTags, "", 2, "HLP_GxSelectAlmacen.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Tipo Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Telefono1") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Telefono2") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fax") ;
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
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV13LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A27Alma_Modulo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A28Alma_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A252Alma_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GxSelectAlmacen.htm");
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

   public void start7N2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Gx Select Almacen", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7N0( ) ;
   }

   public void ws7N2( )
   {
      start7N2( ) ;
      evt7N2( ) ;
   }

   public void evt7N2( )
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
                           AV13LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV13LinkSelection)==0) ? AV20Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13LinkSelection), true);
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
                           A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
                           A260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") ;
                           n260Alma_Telefono1 = false ;
                           A261Alma_Telefono2 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") ;
                           n261Alma_Telefono2 = false ;
                           A262Alma_Fax = localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") ;
                           n262Alma_Fax = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e197N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e207N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ccent_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCENT_ID"), ",", ".") != AV11cCent_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_modulo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_MODULO"), AV8cAlma_Modulo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_CODIGO"), AV6cAlma_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_DESCRIPCION"), AV7cAlma_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpal_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPAL_ID"), ",", ".") != AV12cTpal_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_telefono1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALMA_TELEFONO1"), ",", ".") != AV9cAlma_Telefono1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Calma_telefono2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALMA_TELEFONO2"), ",", ".") != AV10cAlma_Telefono2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e217N2 ();
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

   public void we7N2( )
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

   public void pa7N2( )
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
                                  long AV11cCent_Id ,
                                  String AV8cAlma_Modulo ,
                                  String AV6cAlma_Codigo ,
                                  String AV7cAlma_Descripcion ,
                                  long AV12cTpal_Id ,
                                  long AV9cAlma_Telefono1 ,
                                  long AV10cAlma_Telefono2 )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf7N2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_ID", GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DESCRIPCION", A252Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_TELEFONO1", GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_TELEFONO2", GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_FAX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_FAX", GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ".", "")));
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
      rf7N2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf7N2( )
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
                                              AV7cAlma_Descripcion ,
                                              new Long(AV12cTpal_Id) ,
                                              new Long(AV9cAlma_Telefono1) ,
                                              new Long(AV10cAlma_Telefono2) ,
                                              A252Alma_Descripcion ,
                                              new Long(A29Tpal_Id) ,
                                              new Long(A260Alma_Telefono1) ,
                                              new Long(A261Alma_Telefono2) ,
                                              A27Alma_Modulo ,
                                              AV8cAlma_Modulo ,
                                              A28Alma_Codigo ,
                                              AV6cAlma_Codigo ,
                                              new Long(AV11cCent_Id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG
                                              }
         } ) ;
         lV8cAlma_Modulo = GXutil.concat( GXutil.rtrim( AV8cAlma_Modulo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
         lV6cAlma_Codigo = GXutil.concat( GXutil.rtrim( AV6cAlma_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cAlma_Codigo", AV6cAlma_Codigo);
         lV7cAlma_Descripcion = GXutil.concat( GXutil.rtrim( AV7cAlma_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cAlma_Descripcion", AV7cAlma_Descripcion);
         /* Using cursor H007N2 */
         pr_default.execute(0, new Object[] {new Long(AV11cCent_Id), lV8cAlma_Modulo, lV6cAlma_Codigo, lV7cAlma_Descripcion, new Long(AV12cTpal_Id), new Long(AV9cAlma_Telefono1), new Long(AV10cAlma_Telefono2), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A262Alma_Fax = H007N2_A262Alma_Fax[0] ;
            n262Alma_Fax = H007N2_n262Alma_Fax[0] ;
            A261Alma_Telefono2 = H007N2_A261Alma_Telefono2[0] ;
            n261Alma_Telefono2 = H007N2_n261Alma_Telefono2[0] ;
            A260Alma_Telefono1 = H007N2_A260Alma_Telefono1[0] ;
            n260Alma_Telefono1 = H007N2_n260Alma_Telefono1[0] ;
            A252Alma_Descripcion = H007N2_A252Alma_Descripcion[0] ;
            A29Tpal_Id = H007N2_A29Tpal_Id[0] ;
            A28Alma_Codigo = H007N2_A28Alma_Codigo[0] ;
            A27Alma_Modulo = H007N2_A27Alma_Modulo[0] ;
            A1Cent_Id = H007N2_A1Cent_Id[0] ;
            /* Execute user event: Load */
            e207N2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb7N0( ) ;
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
                                           AV7cAlma_Descripcion ,
                                           new Long(AV12cTpal_Id) ,
                                           new Long(AV9cAlma_Telefono1) ,
                                           new Long(AV10cAlma_Telefono2) ,
                                           A252Alma_Descripcion ,
                                           new Long(A29Tpal_Id) ,
                                           new Long(A260Alma_Telefono1) ,
                                           new Long(A261Alma_Telefono2) ,
                                           A27Alma_Modulo ,
                                           AV8cAlma_Modulo ,
                                           A28Alma_Codigo ,
                                           AV6cAlma_Codigo ,
                                           new Long(AV11cCent_Id) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG
                                           }
      } ) ;
      lV8cAlma_Modulo = GXutil.concat( GXutil.rtrim( AV8cAlma_Modulo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
      lV6cAlma_Codigo = GXutil.concat( GXutil.rtrim( AV6cAlma_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cAlma_Codigo", AV6cAlma_Codigo);
      lV7cAlma_Descripcion = GXutil.concat( GXutil.rtrim( AV7cAlma_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cAlma_Descripcion", AV7cAlma_Descripcion);
      /* Using cursor H007N3 */
      pr_default.execute(1, new Object[] {new Long(AV11cCent_Id), lV8cAlma_Modulo, lV6cAlma_Codigo, lV7cAlma_Descripcion, new Long(AV12cTpal_Id), new Long(AV9cAlma_Telefono1), new Long(AV10cAlma_Telefono2)});
      GRID1_nRecordCount = H007N3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV11cCent_Id, AV8cAlma_Modulo, AV6cAlma_Codigo, AV7cAlma_Descripcion, AV12cTpal_Id, AV9cAlma_Telefono1, AV10cAlma_Telefono2) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup7N0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e197N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcent_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcent_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCENT_ID");
            GX_FocusControl = edtavCcent_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cCent_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cCent_Id", GXutil.ltrim( GXutil.str( AV11cCent_Id, 11, 0)));
         }
         else
         {
            AV11cCent_Id = localUtil.ctol( httpContext.cgiGet( edtavCcent_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cCent_Id", GXutil.ltrim( GXutil.str( AV11cCent_Id, 11, 0)));
         }
         cmbavCalma_modulo.setName( cmbavCalma_modulo.getInternalname() );
         cmbavCalma_modulo.setValue( httpContext.cgiGet( cmbavCalma_modulo.getInternalname()) );
         AV8cAlma_Modulo = httpContext.cgiGet( cmbavCalma_modulo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cAlma_Modulo", AV8cAlma_Modulo);
         AV6cAlma_Codigo = httpContext.cgiGet( edtavCalma_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cAlma_Codigo", AV6cAlma_Codigo);
         AV7cAlma_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCalma_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cAlma_Descripcion", AV7cAlma_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpal_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtpal_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTPAL_ID");
            GX_FocusControl = edtavCtpal_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cTpal_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTpal_Id", GXutil.ltrim( GXutil.str( AV12cTpal_Id, 11, 0)));
         }
         else
         {
            AV12cTpal_Id = localUtil.ctol( httpContext.cgiGet( edtavCtpal_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTpal_Id", GXutil.ltrim( GXutil.str( AV12cTpal_Id, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono1_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono1_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCALMA_TELEFONO1");
            GX_FocusControl = edtavCalma_telefono1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cAlma_Telefono1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cAlma_Telefono1", GXutil.ltrim( GXutil.str( AV9cAlma_Telefono1, 18, 0)));
         }
         else
         {
            AV9cAlma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono1_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cAlma_Telefono1", GXutil.ltrim( GXutil.str( AV9cAlma_Telefono1, 18, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono2_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCALMA_TELEFONO2");
            GX_FocusControl = edtavCalma_telefono2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cAlma_Telefono2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cAlma_Telefono2", GXutil.ltrim( GXutil.str( AV10cAlma_Telefono2, 18, 0)));
         }
         else
         {
            AV10cAlma_Telefono2 = localUtil.ctol( httpContext.cgiGet( edtavCalma_telefono2_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cAlma_Telefono2", GXutil.ltrim( GXutil.str( AV10cAlma_Telefono2, 18, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCENT_ID"), ",", ".") != AV11cCent_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_MODULO"), AV8cAlma_Modulo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_CODIGO"), AV6cAlma_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCALMA_DESCRIPCION"), AV7cAlma_Descripcion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTPAL_ID"), ",", ".") != AV12cTpal_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALMA_TELEFONO1"), ",", ".") != AV9cAlma_Telefono1 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCALMA_TELEFONO2"), ",", ".") != AV10cAlma_Telefono2 )
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
      e197N2 ();
      if (returnInSub) return;
   }

   public void e197N2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "ALMACÉN", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV5ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e207N2( )
   {
      /* Load Routine */
      AV13LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV20Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e217N2 ();
      if (returnInSub) return;
   }

   public void e217N2( )
   {
      /* Enter Routine */
      AV16pCent_Id = A1Cent_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pCent_Id", GXutil.ltrim( GXutil.str( AV16pCent_Id, 11, 0)));
      AV15pAlma_Modulo = A27Alma_Modulo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
      AV14pAlma_Codigo = A28Alma_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pAlma_Codigo", AV14pAlma_Codigo);
      AV17pAlma_Descripcion = A252Alma_Descripcion ;
      httpContext.setWebReturnParms(new Object[] {new Long(AV16pCent_Id),AV15pAlma_Modulo,AV14pAlma_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV16pCent_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16pCent_Id", GXutil.ltrim( GXutil.str( AV16pCent_Id, 11, 0)));
      AV15pAlma_Modulo = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pAlma_Modulo", AV15pAlma_Modulo);
      AV14pAlma_Codigo = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pAlma_Codigo", AV14pAlma_Codigo);
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
      pa7N2( ) ;
      ws7N2( ) ;
      we7N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141422133");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxselectalmacen.js", "?20186141422133");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_84_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_84_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_84_idx ;
      edtTpal_Id_Internalname = "TPAL_ID_"+sGXsfl_84_idx ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION_"+sGXsfl_84_idx ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1_"+sGXsfl_84_idx ;
      edtAlma_Telefono2_Internalname = "ALMA_TELEFONO2_"+sGXsfl_84_idx ;
      edtAlma_Fax_Internalname = "ALMA_FAX_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_84_fel_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_84_fel_idx );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_84_fel_idx ;
      edtTpal_Id_Internalname = "TPAL_ID_"+sGXsfl_84_fel_idx ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1_"+sGXsfl_84_fel_idx ;
      edtAlma_Telefono2_Internalname = "ALMA_TELEFONO2_"+sGXsfl_84_fel_idx ;
      edtAlma_Fax_Internalname = "ALMA_FAX_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb7N0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A27Alma_Modulo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A28Alma_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV13LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV13LinkSelection)==0)&&(GXutil.strcmp("", AV20Linkselection_GXI)==0))||!(GXutil.strcmp("", AV13LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV13LinkSelection)==0) ? AV20Linkselection_GXI : httpContext.getResourceRelative(AV13LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpal_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpal_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Descripcion_Internalname,A252Alma_Descripcion,GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Telefono1_Internalname,GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Telefono1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Telefono2_Internalname,GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Telefono2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Fax_Internalname,GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Fax_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPAL_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO1"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO2"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_FAX"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblcent_idfilter_Internalname = "LBLCENT_IDFILTER" ;
      edtavCcent_id_Internalname = "vCCENT_ID" ;
      divCent_idfiltercontainer_Internalname = "CENT_IDFILTERCONTAINER" ;
      lblLblalma_modulofilter_Internalname = "LBLALMA_MODULOFILTER" ;
      cmbavCalma_modulo.setInternalname( "vCALMA_MODULO" );
      divAlma_modulofiltercontainer_Internalname = "ALMA_MODULOFILTERCONTAINER" ;
      lblLblalma_codigofilter_Internalname = "LBLALMA_CODIGOFILTER" ;
      edtavCalma_codigo_Internalname = "vCALMA_CODIGO" ;
      divAlma_codigofiltercontainer_Internalname = "ALMA_CODIGOFILTERCONTAINER" ;
      lblLblalma_descripcionfilter_Internalname = "LBLALMA_DESCRIPCIONFILTER" ;
      edtavCalma_descripcion_Internalname = "vCALMA_DESCRIPCION" ;
      divAlma_descripcionfiltercontainer_Internalname = "ALMA_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltpal_idfilter_Internalname = "LBLTPAL_IDFILTER" ;
      edtavCtpal_id_Internalname = "vCTPAL_ID" ;
      divTpal_idfiltercontainer_Internalname = "TPAL_IDFILTERCONTAINER" ;
      lblLblalma_telefono1filter_Internalname = "LBLALMA_TELEFONO1FILTER" ;
      edtavCalma_telefono1_Internalname = "vCALMA_TELEFONO1" ;
      divAlma_telefono1filtercontainer_Internalname = "ALMA_TELEFONO1FILTERCONTAINER" ;
      lblLblalma_telefono2filter_Internalname = "LBLALMA_TELEFONO2FILTER" ;
      edtavCalma_telefono2_Internalname = "vCALMA_TELEFONO2" ;
      divAlma_telefono2filtercontainer_Internalname = "ALMA_TELEFONO2FILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtTpal_Id_Internalname = "TPAL_ID" ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION" ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1" ;
      edtAlma_Telefono2_Internalname = "ALMA_TELEFONO2" ;
      edtAlma_Fax_Internalname = "ALMA_FAX" ;
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
      edtAlma_Fax_Jsonclick = "" ;
      edtAlma_Telefono2_Jsonclick = "" ;
      edtAlma_Telefono1_Jsonclick = "" ;
      edtAlma_Descripcion_Jsonclick = "" ;
      edtTpal_Id_Jsonclick = "" ;
      edtAlma_Codigo_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      edtCent_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCalma_telefono2_Jsonclick = "" ;
      edtavCalma_telefono2_Enabled = 1 ;
      edtavCalma_telefono2_Visible = 1 ;
      edtavCalma_telefono1_Jsonclick = "" ;
      edtavCalma_telefono1_Enabled = 1 ;
      edtavCalma_telefono1_Visible = 1 ;
      edtavCtpal_id_Jsonclick = "" ;
      edtavCtpal_id_Enabled = 1 ;
      edtavCtpal_id_Visible = 1 ;
      edtavCalma_descripcion_Jsonclick = "" ;
      edtavCalma_descripcion_Enabled = 1 ;
      edtavCalma_descripcion_Visible = 1 ;
      edtavCalma_codigo_Jsonclick = "" ;
      edtavCalma_codigo_Enabled = 1 ;
      edtavCalma_codigo_Visible = 1 ;
      cmbavCalma_modulo.setJsonclick( "" );
      cmbavCalma_modulo.setEnabled( 1 );
      cmbavCalma_modulo.setVisible( 1 );
      edtavCcent_id_Jsonclick = "" ;
      edtavCcent_id_Enabled = 1 ;
      edtavCcent_id_Visible = 1 ;
      divAlma_telefono2filtercontainer_Class = "AdvancedContainerItem" ;
      divAlma_telefono1filtercontainer_Class = "AdvancedContainerItem" ;
      divTpal_idfiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_modulofiltercontainer_Class = "AdvancedContainerItem" ;
      divCent_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Gx Select Almacen" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV11cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV6cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV7cAlma_Descripcion',fld:'vCALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV12cTpal_Id',fld:'vCTPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cAlma_Telefono1',fld:'vCALMA_TELEFONO1',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cAlma_Telefono2',fld:'vCALMA_TELEFONO2',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e187N1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLCENT_IDFILTER.CLICK","{handler:'e117N1',iparms:[{av:'divCent_idfiltercontainer_Class',ctrl:'CENT_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_idfiltercontainer_Class',ctrl:'CENT_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCcent_id_Visible',ctrl:'vCCENT_ID',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_MODULOFILTER.CLICK","{handler:'e127N1',iparms:[{av:'divAlma_modulofiltercontainer_Class',ctrl:'ALMA_MODULOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_modulofiltercontainer_Class',ctrl:'ALMA_MODULOFILTERCONTAINER',prop:'Class'},{av:'cmbavCalma_modulo'}]}");
      setEventMetadata("LBLALMA_CODIGOFILTER.CLICK","{handler:'e137N1',iparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCalma_codigo_Visible',ctrl:'vCALMA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_DESCRIPCIONFILTER.CLICK","{handler:'e147N1',iparms:[{av:'divAlma_descripcionfiltercontainer_Class',ctrl:'ALMA_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_descripcionfiltercontainer_Class',ctrl:'ALMA_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCalma_descripcion_Visible',ctrl:'vCALMA_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTPAL_IDFILTER.CLICK","{handler:'e157N1',iparms:[{av:'divTpal_idfiltercontainer_Class',ctrl:'TPAL_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpal_idfiltercontainer_Class',ctrl:'TPAL_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCtpal_id_Visible',ctrl:'vCTPAL_ID',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_TELEFONO1FILTER.CLICK","{handler:'e167N1',iparms:[{av:'divAlma_telefono1filtercontainer_Class',ctrl:'ALMA_TELEFONO1FILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_telefono1filtercontainer_Class',ctrl:'ALMA_TELEFONO1FILTERCONTAINER',prop:'Class'},{av:'edtavCalma_telefono1_Visible',ctrl:'vCALMA_TELEFONO1',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_TELEFONO2FILTER.CLICK","{handler:'e177N1',iparms:[{av:'divAlma_telefono2filtercontainer_Class',ctrl:'ALMA_TELEFONO2FILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_telefono2filtercontainer_Class',ctrl:'ALMA_TELEFONO2FILTERCONTAINER',prop:'Class'},{av:'edtavCalma_telefono2_Visible',ctrl:'vCALMA_TELEFONO2',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e217N2',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'A252Alma_Descripcion',fld:'ALMA_DESCRIPCION',pic:'@!',hsh:true,nv:''}],oparms:[{av:'AV16pCent_Id',fld:'vPCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV15pAlma_Modulo',fld:'vPALMA_MODULO',pic:'',nv:''},{av:'AV14pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV11cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV6cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV7cAlma_Descripcion',fld:'vCALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV12cTpal_Id',fld:'vCTPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cAlma_Telefono1',fld:'vCALMA_TELEFONO1',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cAlma_Telefono2',fld:'vCALMA_TELEFONO2',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV11cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV6cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV7cAlma_Descripcion',fld:'vCALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV12cTpal_Id',fld:'vCTPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cAlma_Telefono1',fld:'vCALMA_TELEFONO1',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cAlma_Telefono2',fld:'vCALMA_TELEFONO2',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV11cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV6cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV7cAlma_Descripcion',fld:'vCALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV12cTpal_Id',fld:'vCTPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cAlma_Telefono1',fld:'vCALMA_TELEFONO1',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cAlma_Telefono2',fld:'vCALMA_TELEFONO2',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV11cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCalma_modulo'},{av:'AV8cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',nv:''},{av:'AV6cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',nv:''},{av:'AV7cAlma_Descripcion',fld:'vCALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV12cTpal_Id',fld:'vCTPAL_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cAlma_Telefono1',fld:'vCALMA_TELEFONO1',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cAlma_Telefono2',fld:'vCALMA_TELEFONO2',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[]}");
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
      AV6cAlma_Codigo = "" ;
      AV7cAlma_Descripcion = "" ;
      GXKey = "" ;
      AV15pAlma_Modulo = "" ;
      AV14pAlma_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblcent_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblalma_modulofilter_Jsonclick = "" ;
      lblLblalma_codigofilter_Jsonclick = "" ;
      lblLblalma_descripcionfilter_Jsonclick = "" ;
      lblLbltpal_idfilter_Jsonclick = "" ;
      lblLblalma_telefono1filter_Jsonclick = "" ;
      lblLblalma_telefono2filter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV13LinkSelection = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A252Alma_Descripcion = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV8cAlma_Modulo = "" ;
      lV6cAlma_Codigo = "" ;
      lV7cAlma_Descripcion = "" ;
      H007N2_A262Alma_Fax = new long[1] ;
      H007N2_n262Alma_Fax = new boolean[] {false} ;
      H007N2_A261Alma_Telefono2 = new long[1] ;
      H007N2_n261Alma_Telefono2 = new boolean[] {false} ;
      H007N2_A260Alma_Telefono1 = new long[1] ;
      H007N2_n260Alma_Telefono1 = new boolean[] {false} ;
      H007N2_A252Alma_Descripcion = new String[] {""} ;
      H007N2_A29Tpal_Id = new long[1] ;
      H007N2_A28Alma_Codigo = new String[] {""} ;
      H007N2_A27Alma_Modulo = new String[] {""} ;
      H007N2_A1Cent_Id = new long[1] ;
      H007N3_AGRID1_nRecordCount = new long[1] ;
      AV5ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV17pAlma_Descripcion = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gxselectalmacen__default(),
         new Object[] {
             new Object[] {
            H007N2_A262Alma_Fax, H007N2_n262Alma_Fax, H007N2_A261Alma_Telefono2, H007N2_n261Alma_Telefono2, H007N2_A260Alma_Telefono1, H007N2_n260Alma_Telefono1, H007N2_A252Alma_Descripcion, H007N2_A29Tpal_Id, H007N2_A28Alma_Codigo, H007N2_A27Alma_Modulo,
            H007N2_A1Cent_Id
            }
            , new Object[] {
            H007N3_AGRID1_nRecordCount
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
   private int edtavCcent_id_Enabled ;
   private int edtavCcent_id_Visible ;
   private int edtavCalma_codigo_Visible ;
   private int edtavCalma_codigo_Enabled ;
   private int edtavCalma_descripcion_Visible ;
   private int edtavCalma_descripcion_Enabled ;
   private int edtavCtpal_id_Enabled ;
   private int edtavCtpal_id_Visible ;
   private int edtavCalma_telefono1_Enabled ;
   private int edtavCalma_telefono1_Visible ;
   private int edtavCalma_telefono2_Enabled ;
   private int edtavCalma_telefono2_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV11cCent_Id ;
   private long AV12cTpal_Id ;
   private long AV9cAlma_Telefono1 ;
   private long AV10cAlma_Telefono2 ;
   private long AV16pCent_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A1Cent_Id ;
   private long A29Tpal_Id ;
   private long A260Alma_Telefono1 ;
   private long A261Alma_Telefono2 ;
   private long A262Alma_Fax ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divCent_idfiltercontainer_Class ;
   private String divAlma_modulofiltercontainer_Class ;
   private String divAlma_codigofiltercontainer_Class ;
   private String divAlma_descripcionfiltercontainer_Class ;
   private String divTpal_idfiltercontainer_Class ;
   private String divAlma_telefono1filtercontainer_Class ;
   private String divAlma_telefono2filtercontainer_Class ;
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
   private String divCent_idfiltercontainer_Internalname ;
   private String lblLblcent_idfilter_Internalname ;
   private String lblLblcent_idfilter_Jsonclick ;
   private String edtavCcent_id_Internalname ;
   private String TempTags ;
   private String edtavCcent_id_Jsonclick ;
   private String divAlma_modulofiltercontainer_Internalname ;
   private String lblLblalma_modulofilter_Internalname ;
   private String lblLblalma_modulofilter_Jsonclick ;
   private String divAlma_codigofiltercontainer_Internalname ;
   private String lblLblalma_codigofilter_Internalname ;
   private String lblLblalma_codigofilter_Jsonclick ;
   private String edtavCalma_codigo_Internalname ;
   private String edtavCalma_codigo_Jsonclick ;
   private String divAlma_descripcionfiltercontainer_Internalname ;
   private String lblLblalma_descripcionfilter_Internalname ;
   private String lblLblalma_descripcionfilter_Jsonclick ;
   private String edtavCalma_descripcion_Internalname ;
   private String edtavCalma_descripcion_Jsonclick ;
   private String divTpal_idfiltercontainer_Internalname ;
   private String lblLbltpal_idfilter_Internalname ;
   private String lblLbltpal_idfilter_Jsonclick ;
   private String edtavCtpal_id_Internalname ;
   private String edtavCtpal_id_Jsonclick ;
   private String divAlma_telefono1filtercontainer_Internalname ;
   private String lblLblalma_telefono1filter_Internalname ;
   private String lblLblalma_telefono1filter_Jsonclick ;
   private String edtavCalma_telefono1_Internalname ;
   private String edtavCalma_telefono1_Jsonclick ;
   private String divAlma_telefono2filtercontainer_Internalname ;
   private String lblLblalma_telefono2filter_Internalname ;
   private String lblLblalma_telefono2filter_Jsonclick ;
   private String edtavCalma_telefono2_Internalname ;
   private String edtavCalma_telefono2_Jsonclick ;
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
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtCent_Id_Internalname ;
   private String edtAlma_Codigo_Internalname ;
   private String edtTpal_Id_Internalname ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtAlma_Telefono1_Internalname ;
   private String edtAlma_Telefono2_Internalname ;
   private String edtAlma_Fax_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV5ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtCent_Id_Jsonclick ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtTpal_Id_Jsonclick ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String edtAlma_Telefono1_Jsonclick ;
   private String edtAlma_Telefono2_Jsonclick ;
   private String edtAlma_Fax_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n260Alma_Telefono1 ;
   private boolean n261Alma_Telefono2 ;
   private boolean n262Alma_Fax ;
   private boolean returnInSub ;
   private boolean AV13LinkSelection_IsBlob ;
   private String AV8cAlma_Modulo ;
   private String AV6cAlma_Codigo ;
   private String AV7cAlma_Descripcion ;
   private String AV15pAlma_Modulo ;
   private String AV14pAlma_Codigo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private String AV20Linkselection_GXI ;
   private String lV8cAlma_Modulo ;
   private String lV6cAlma_Codigo ;
   private String lV7cAlma_Descripcion ;
   private String AV17pAlma_Descripcion ;
   private String AV13LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCalma_modulo ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private long[] H007N2_A262Alma_Fax ;
   private boolean[] H007N2_n262Alma_Fax ;
   private long[] H007N2_A261Alma_Telefono2 ;
   private boolean[] H007N2_n261Alma_Telefono2 ;
   private long[] H007N2_A260Alma_Telefono1 ;
   private boolean[] H007N2_n260Alma_Telefono1 ;
   private String[] H007N2_A252Alma_Descripcion ;
   private long[] H007N2_A29Tpal_Id ;
   private String[] H007N2_A28Alma_Codigo ;
   private String[] H007N2_A27Alma_Modulo ;
   private long[] H007N2_A1Cent_Id ;
   private long[] H007N3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gxselectalmacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H007N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cAlma_Descripcion ,
                                          long AV12cTpal_Id ,
                                          long AV9cAlma_Telefono1 ,
                                          long AV10cAlma_Telefono2 ,
                                          String A252Alma_Descripcion ,
                                          long A29Tpal_Id ,
                                          long A260Alma_Telefono1 ,
                                          long A261Alma_Telefono2 ,
                                          String A27Alma_Modulo ,
                                          String AV8cAlma_Modulo ,
                                          String A28Alma_Codigo ,
                                          String AV6cAlma_Codigo ,
                                          long AV11cCent_Id )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Alma_Fax, Alma_Telefono2, Alma_Telefono1, Alma_Descripcion," ;
      sSelectString = sSelectString + " Tpal_Id, Alma_Codigo, Alma_Modulo, Cent_Id" ;
      sFromString = " FROM ALM_ALMACEN" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Cent_Id >= ?)" ;
      sWhereString = sWhereString + " and (Alma_Modulo like ?)" ;
      sWhereString = sWhereString + " and (Alma_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cAlma_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Alma_Descripcion like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV12cTpal_Id) )
      {
         sWhereString = sWhereString + " and (Tpal_Id >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV9cAlma_Telefono1) )
      {
         sWhereString = sWhereString + " and (Alma_Telefono1 >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV10cAlma_Telefono2) )
      {
         sWhereString = sWhereString + " and (Alma_Telefono2 >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H007N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cAlma_Descripcion ,
                                          long AV12cTpal_Id ,
                                          long AV9cAlma_Telefono1 ,
                                          long AV10cAlma_Telefono2 ,
                                          String A252Alma_Descripcion ,
                                          long A29Tpal_Id ,
                                          long A260Alma_Telefono1 ,
                                          long A261Alma_Telefono2 ,
                                          String A27Alma_Modulo ,
                                          String AV8cAlma_Modulo ,
                                          String A28Alma_Codigo ,
                                          String AV6cAlma_Codigo ,
                                          long AV11cCent_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_ALMACEN" ;
      scmdbuf = scmdbuf + " WHERE (Cent_Id >= ?)" ;
      scmdbuf = scmdbuf + " and (Alma_Modulo like ?)" ;
      scmdbuf = scmdbuf + " and (Alma_Codigo like ?)" ;
      if ( ! (GXutil.strcmp("", AV7cAlma_Descripcion)==0) )
      {
         sWhereString = sWhereString + " and (Alma_Descripcion like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV12cTpal_Id) )
      {
         sWhereString = sWhereString + " and (Tpal_Id >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV9cAlma_Telefono1) )
      {
         sWhereString = sWhereString + " and (Alma_Telefono1 >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV10cAlma_Telefono2) )
      {
         sWhereString = sWhereString + " and (Alma_Telefono2 >= ?)" ;
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
                  return conditional_H007N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H007N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H007N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
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
                  stmt.setVarchar(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[15]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[16]).longValue(), 0);
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
                  stmt.setVarchar(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[13]).longValue(), 0);
               }
               return;
      }
   }

}

