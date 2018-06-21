/*
               File: alm_devo_hist_impl
        Description: HISTORIAL DEVOLUTIVOS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:53.10
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

public final  class alm_devo_hist_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A102DEVOC_CONSECUTIVO = httpContext.GetNextPar( ) ;
         n102DEVOC_CONSECUTIVO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A102DEVOC_CONSECUTIVO) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A757DEVOC_CATACODIGO = httpContext.GetNextPar( ) ;
         n757DEVOC_CATACODIGO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A757DEVOC_CATACODIGO) ;
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
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
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
      cmbDEVOC_ESTADO.setName( "DEVOC_ESTADO" );
      cmbDEVOC_ESTADO.setWebtags( "" );
      if ( cmbDEVOC_ESTADO.getItemCount() > 0 )
      {
         A99DEVOC_ESTADO = cmbDEVOC_ESTADO.getValidValue(A99DEVOC_ESTADO) ;
         n99DEVOC_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "HISTORIAL DEVOLUTIVOS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtDEVOC_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_devo_hist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_devo_hist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_devo_hist_impl.class ));
   }

   public alm_devo_hist_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbDEVOC_ESTADO = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
      if ( cmbDEVOC_ESTADO.getItemCount() > 0 )
      {
         A99DEVOC_ESTADO = cmbDEVOC_ESTADO.getValidValue(A99DEVOC_ESTADO) ;
         n99DEVOC_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
      }
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "HISTORIAL DEVOLUTIVOS", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_DEVO_HIST.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "BtnFirst" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx01h0"+"',["+"{Ctrl:gx.dom.el('"+"DEVOC_ID"+"'), id:'"+"DEVOC_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_ID_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_ID_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_REGIONAL_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_REGIONAL_Internalname, GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_REGIONAL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_REGIONAL_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_REGIONAL_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_TRAN_ID_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_TRAN_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_TRAN_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_TRAN_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_TRAN_ID_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_TIPO_MOVIMIENTO_Internalname, "MOVIMIENTO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_TIPO_MOVIMIENTO_Internalname, A722DEVOC_TIPO_MOVIMIENTO, GXutil.rtrim( localUtil.format( A722DEVOC_TIPO_MOVIMIENTO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_TIPO_MOVIMIENTO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_TIPO_MOVIMIENTO_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CODIGO_MOVIMIENTO_Internalname, "MOVIMIENTO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CODIGO_MOVIMIENTO_Internalname, A100DEVOC_CODIGO_MOVIMIENTO, GXutil.rtrim( localUtil.format( A100DEVOC_CODIGO_MOVIMIENTO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CODIGO_MOVIMIENTO_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_TRAN_CC_Internalname, "CONSECUTIVO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_TRAN_CC_Internalname, GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")), ((edtDEVOC_TRAN_CC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_TRAN_CC_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_TRAN_CC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_FECHA_MOVIMIENTO_Internalname, "MOVIMIENTO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtDEVOC_FECHA_MOVIMIENTO_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_FECHA_MOVIMIENTO_Internalname, localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"), localUtil.format( A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_FECHA_MOVIMIENTO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_FECHA_MOVIMIENTO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtDEVOC_FECHA_MOVIMIENTO_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDEVOC_FECHA_MOVIMIENTO_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_DEVO_HIST.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_RENGLON_Internalname, "RENGLON", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_RENGLON_Internalname, GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ",", "")), ((edtDEVOC_RENGLON_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_RENGLON_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_RENGLON_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CONSECUTIVO_Internalname, "CONSECUTIVO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CONSECUTIVO_Internalname, A102DEVOC_CONSECUTIVO, GXutil.rtrim( localUtil.format( A102DEVOC_CONSECUTIVO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CONSECUTIVO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CONSECUTIVO_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_102_Internalname, sImgUrl, imgprompt_102_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_102_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CATACODIGO_Internalname, "DEVOC_CATACODIGO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CATACODIGO_Internalname, A757DEVOC_CATACODIGO, GXutil.rtrim( localUtil.format( A757DEVOC_CATACODIGO, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CATACODIGO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CATACODIGO_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_DESCRIPCION_Internalname, "DESCRIPCION", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDEVOC_DESCRIPCION_Internalname, A746DEVOC_DESCRIPCION, "", "", (short)(0), 1, edtDEVOC_DESCRIPCION_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_PLACA_Internalname, "DEVOC_PLACA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_PLACA_Internalname, A725DEVOC_PLACA, GXutil.rtrim( localUtil.format( A725DEVOC_PLACA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_PLACA_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_PLACA_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_PLACA_PADRE_Internalname, "PADRE", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_PLACA_PADRE_Internalname, A726DEVOC_PLACA_PADRE, GXutil.rtrim( localUtil.format( A726DEVOC_PLACA_PADRE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_PLACA_PADRE_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_PLACA_PADRE_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_SERIAL_Internalname, "SERIAL", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDEVOC_SERIAL_Internalname, A727DEVOC_SERIAL, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", (short)(0), 1, edtDEVOC_SERIAL_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_MARCA_Internalname, "MARCA", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDEVOC_MARCA_Internalname, A728DEVOC_MARCA, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtDEVOC_MARCA_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_MARCA2_Internalname, "MARCA2", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDEVOC_MARCA2_Internalname, A729DEVOC_MARCA2, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", (short)(0), 1, edtDEVOC_MARCA2_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_MODELO_Internalname, "MODELO", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDEVOC_MODELO_Internalname, A730DEVOC_MODELO, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", (short)(0), 1, edtDEVOC_MODELO_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_VIDA_UTIL_Internalname, "UTIL", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_VIDA_UTIL_Internalname, GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ",", "")), ((edtDEVOC_VIDA_UTIL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_VIDA_UTIL_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_VIDA_UTIL_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_VALOR_ADQUISICION_Internalname, "ADQUISICION", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_VALOR_ADQUISICION_Internalname, GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ",", "")), ((edtDEVOC_VALOR_ADQUISICION_Enabled!=0) ? GXutil.ltrim( localUtil.format( A732DEVOC_VALOR_ADQUISICION, "ZZZZZZZZZZZZZZ9.99")) : localUtil.format( A732DEVOC_VALOR_ADQUISICION, "ZZZZZZZZZZZZZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_VALOR_ADQUISICION_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_VALOR_ADQUISICION_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_FECHA_ADQUISICION_Internalname, "ADQUISICION", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtDEVOC_FECHA_ADQUISICION_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_FECHA_ADQUISICION_Internalname, localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"), localUtil.format( A733DEVOC_FECHA_ADQUISICION, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_FECHA_ADQUISICION_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_FECHA_ADQUISICION_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtDEVOC_FECHA_ADQUISICION_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDEVOC_FECHA_ADQUISICION_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_DEVO_HIST.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbDEVOC_ESTADO.getInternalname(), "ESTADO", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDEVOC_ESTADO, cmbDEVOC_ESTADO.getInternalname(), GXutil.rtrim( A99DEVOC_ESTADO), 1, cmbDEVOC_ESTADO.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbDEVOC_ESTADO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "", true, "HLP_ALM_DEVO_HIST.htm");
         cmbDEVOC_ESTADO.setValue( GXutil.rtrim( A99DEVOC_ESTADO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDEVOC_ESTADO.getInternalname(), "Values", cmbDEVOC_ESTADO.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname, "ID ORIGEN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname, GXutil.ltrim( localUtil.ntoc( A97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A97DEVOC_CENTRO_COSTO_ORIGEN), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A97DEVOC_CENTRO_COSTO_ORIGEN), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_MODULO_ORIGEN_Internalname, "ORIGEN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_MODULO_ORIGEN_Internalname, A734DEVOC_MODULO_ORIGEN, GXutil.rtrim( localUtil.format( A734DEVOC_MODULO_ORIGEN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_MODULO_ORIGEN_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_MODULO_ORIGEN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_ALMA_ORIGEN_Internalname, "ORIGEN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_ALMA_ORIGEN_Internalname, A735DEVOC_ALMA_ORIGEN, GXutil.rtrim( localUtil.format( A735DEVOC_ALMA_ORIGEN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_ALMA_ORIGEN_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_ALMA_ORIGEN_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_BODEGA_ORIGEN_Internalname, "ORIGEN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_BODEGA_ORIGEN_Internalname, A736DEVOC_BODEGA_ORIGEN, GXutil.rtrim( localUtil.format( A736DEVOC_BODEGA_ORIGEN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_BODEGA_ORIGEN_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_BODEGA_ORIGEN_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_NIT_ORIGEN_Internalname, "ID ORIGEN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_NIT_ORIGEN_Internalname, GXutil.ltrim( localUtil.ntoc( A98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ",", "")), ((edtDEVOC_NIT_ORIGEN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A98DEVOC_NIT_ORIGEN), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A98DEVOC_NIT_ORIGEN), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_NIT_ORIGEN_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_NIT_ORIGEN_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_REGIONAL_DESTINO_Internalname, "ID DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_REGIONAL_DESTINO_Internalname, GXutil.ltrim( localUtil.ntoc( A737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_REGIONAL_DESTINO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A737DEVOC_REGIONAL_DESTINO), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A737DEVOC_REGIONAL_DESTINO), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_REGIONAL_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_REGIONAL_DESTINO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CENTRO_COSTO_DESTINO_Internalname, "ID DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CENTRO_COSTO_DESTINO_Internalname, GXutil.ltrim( localUtil.ntoc( A738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_CENTRO_COSTO_DESTINO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A738DEVOC_CENTRO_COSTO_DESTINO), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A738DEVOC_CENTRO_COSTO_DESTINO), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CENTRO_COSTO_DESTINO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_MODULO_DESTINO_Internalname, "DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_MODULO_DESTINO_Internalname, A739DEVOC_MODULO_DESTINO, GXutil.rtrim( localUtil.format( A739DEVOC_MODULO_DESTINO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_MODULO_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_MODULO_DESTINO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_ALMA_DESTINO_Internalname, "DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_ALMA_DESTINO_Internalname, A740DEVOC_ALMA_DESTINO, GXutil.rtrim( localUtil.format( A740DEVOC_ALMA_DESTINO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_ALMA_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_ALMA_DESTINO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_BODEGA_DESTINO_Internalname, "DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_BODEGA_DESTINO_Internalname, A741DEVOC_BODEGA_DESTINO, GXutil.rtrim( localUtil.format( A741DEVOC_BODEGA_DESTINO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_BODEGA_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_BODEGA_DESTINO_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_NIT_DESTINO_Internalname, "ID DESTINO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_NIT_DESTINO_Internalname, GXutil.ltrim( localUtil.ntoc( A742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ",", "")), ((edtDEVOC_NIT_DESTINO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A742DEVOC_NIT_DESTINO), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A742DEVOC_NIT_DESTINO), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_NIT_DESTINO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_NIT_DESTINO_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_PROVEEDOR_ID_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_PROVEEDOR_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ",", "")), ((edtDEVOC_PROVEEDOR_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A743DEVOC_PROVEEDOR_ID), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A743DEVOC_PROVEEDOR_ID), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_PROVEEDOR_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_PROVEEDOR_ID_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_FECHA_SERVICIO_Internalname, "DEVOC_FECHA_SERVICIO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtDEVOC_FECHA_SERVICIO_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_FECHA_SERVICIO_Internalname, localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"), localUtil.format( A744DEVOC_FECHA_SERVICIO, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_FECHA_SERVICIO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_FECHA_SERVICIO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtDEVOC_FECHA_SERVICIO_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDEVOC_FECHA_SERVICIO_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_DEVO_HIST.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_ACTA_ENTREGA_Internalname, "ENTREGA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_ACTA_ENTREGA_Internalname, GXutil.ltrim( localUtil.ntoc( A745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ",", "")), ((edtDEVOC_ACTA_ENTREGA_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A745DEVOC_ACTA_ENTREGA), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A745DEVOC_ACTA_ENTREGA), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_ACTA_ENTREGA_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_ACTA_ENTREGA_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_TRAN_OBSERVACIONES_Internalname, "OBSERVACIONES", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_TRAN_OBSERVACIONES_Internalname, A748DEVOC_TRAN_OBSERVACIONES, GXutil.rtrim( localUtil.format( A748DEVOC_TRAN_OBSERVACIONES, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_TRAN_OBSERVACIONES_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_TRAN_OBSERVACIONES_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_CURSO_ID_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_CURSO_ID_Internalname, A749DEVOC_CURSO_ID, GXutil.rtrim( localUtil.format( A749DEVOC_CURSO_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_CURSO_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_CURSO_ID_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_AREADANTE_ID_Internalname, "ID", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_AREADANTE_ID_Internalname, A750DEVOC_AREADANTE_ID, GXutil.rtrim( localUtil.format( A750DEVOC_AREADANTE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_AREADANTE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_AREADANTE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_TIPO_INGRESO_Internalname, "INGRESO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_TIPO_INGRESO_Internalname, GXutil.ltrim( localUtil.ntoc( A751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ",", "")), ((edtDEVOC_TIPO_INGRESO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A751DEVOC_TIPO_INGRESO), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A751DEVOC_TIPO_INGRESO), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_TIPO_INGRESO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_TIPO_INGRESO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_NUMERO_INGRESO_Internalname, "INGRESO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_NUMERO_INGRESO_Internalname, A752DEVOC_NUMERO_INGRESO, GXutil.rtrim( localUtil.format( A752DEVOC_NUMERO_INGRESO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_NUMERO_INGRESO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_NUMERO_INGRESO_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDEVOC_FECHA_INGRESO_Internalname, "DEVOC_FECHA_INGRESO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDEVOC_FECHA_INGRESO_Internalname, GXutil.ltrim( localUtil.ntoc( A753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ",", "")), ((edtDEVOC_FECHA_INGRESO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A753DEVOC_FECHA_INGRESO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A753DEVOC_FECHA_INGRESO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDEVOC_FECHA_INGRESO_Jsonclick, 0, "Attribute", "", "", "", 1, edtDEVOC_FECHA_INGRESO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DEVO_HIST.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_ID_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_ID_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A95DEVOC_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
            }
            else
            {
               A95DEVOC_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_ID_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_REGIONAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A96DEVOC_REGIONAL = 0 ;
               n96DEVOC_REGIONAL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A96DEVOC_REGIONAL", GXutil.ltrim( GXutil.str( A96DEVOC_REGIONAL, 11, 0)));
            }
            else
            {
               A96DEVOC_REGIONAL = localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_Internalname), ",", ".") ;
               n96DEVOC_REGIONAL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A96DEVOC_REGIONAL", GXutil.ltrim( GXutil.str( A96DEVOC_REGIONAL, 11, 0)));
            }
            n96DEVOC_REGIONAL = ((0==A96DEVOC_REGIONAL) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_ID_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_ID_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_TRAN_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_TRAN_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A101DEVOC_TRAN_ID = 0 ;
               n101DEVOC_TRAN_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A101DEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( A101DEVOC_TRAN_ID, 11, 0)));
            }
            else
            {
               A101DEVOC_TRAN_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_ID_Internalname), ",", ".") ;
               n101DEVOC_TRAN_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A101DEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( A101DEVOC_TRAN_ID, 11, 0)));
            }
            n101DEVOC_TRAN_ID = ((0==A101DEVOC_TRAN_ID) ? true : false) ;
            A722DEVOC_TIPO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_TIPO_MOVIMIENTO_Internalname) ;
            n722DEVOC_TIPO_MOVIMIENTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A722DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
            n722DEVOC_TIPO_MOVIMIENTO = ((GXutil.strcmp("", A722DEVOC_TIPO_MOVIMIENTO)==0) ? true : false) ;
            A100DEVOC_CODIGO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_CODIGO_MOVIMIENTO_Internalname) ;
            n100DEVOC_CODIGO_MOVIMIENTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A100DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
            n100DEVOC_CODIGO_MOVIMIENTO = ((GXutil.strcmp("", A100DEVOC_CODIGO_MOVIMIENTO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_CC_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_CC_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_TRAN_CC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_TRAN_CC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A723DEVOC_TRAN_CC = 0 ;
               n723DEVOC_TRAN_CC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A723DEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( A723DEVOC_TRAN_CC, 18, 0)));
            }
            else
            {
               A723DEVOC_TRAN_CC = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_CC_Internalname), ",", ".") ;
               n723DEVOC_TRAN_CC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A723DEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( A723DEVOC_TRAN_CC, 18, 0)));
            }
            n723DEVOC_TRAN_CC = ((0==A723DEVOC_TRAN_CC) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtDEVOC_FECHA_MOVIMIENTO_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVOC_FECHA_MOVIMIENTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_FECHA_MOVIMIENTO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
               n103DEVOC_FECHA_MOVIMIENTO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A103DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
            }
            else
            {
               A103DEVOC_FECHA_MOVIMIENTO = localUtil.ctod( httpContext.cgiGet( edtDEVOC_FECHA_MOVIMIENTO_Internalname), 3) ;
               n103DEVOC_FECHA_MOVIMIENTO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A103DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
            }
            n103DEVOC_FECHA_MOVIMIENTO = (GXutil.dateCompare(GXutil.nullDate(), A103DEVOC_FECHA_MOVIMIENTO) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_RENGLON_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_RENGLON_Internalname), ",", ".") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_RENGLON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_RENGLON_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A724DEVOC_RENGLON = 0 ;
               n724DEVOC_RENGLON = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A724DEVOC_RENGLON", GXutil.ltrim( GXutil.str( A724DEVOC_RENGLON, 5, 0)));
            }
            else
            {
               A724DEVOC_RENGLON = (int)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_RENGLON_Internalname), ",", ".")) ;
               n724DEVOC_RENGLON = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A724DEVOC_RENGLON", GXutil.ltrim( GXutil.str( A724DEVOC_RENGLON, 5, 0)));
            }
            n724DEVOC_RENGLON = ((0==A724DEVOC_RENGLON) ? true : false) ;
            A102DEVOC_CONSECUTIVO = httpContext.cgiGet( edtDEVOC_CONSECUTIVO_Internalname) ;
            n102DEVOC_CONSECUTIVO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
            n102DEVOC_CONSECUTIVO = ((GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ? true : false) ;
            A757DEVOC_CATACODIGO = httpContext.cgiGet( edtDEVOC_CATACODIGO_Internalname) ;
            n757DEVOC_CATACODIGO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
            A746DEVOC_DESCRIPCION = GXutil.upper( httpContext.cgiGet( edtDEVOC_DESCRIPCION_Internalname)) ;
            n746DEVOC_DESCRIPCION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
            A725DEVOC_PLACA = httpContext.cgiGet( edtDEVOC_PLACA_Internalname) ;
            n725DEVOC_PLACA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A725DEVOC_PLACA", A725DEVOC_PLACA);
            n725DEVOC_PLACA = ((GXutil.strcmp("", A725DEVOC_PLACA)==0) ? true : false) ;
            A726DEVOC_PLACA_PADRE = httpContext.cgiGet( edtDEVOC_PLACA_PADRE_Internalname) ;
            n726DEVOC_PLACA_PADRE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A726DEVOC_PLACA_PADRE", A726DEVOC_PLACA_PADRE);
            n726DEVOC_PLACA_PADRE = ((GXutil.strcmp("", A726DEVOC_PLACA_PADRE)==0) ? true : false) ;
            A727DEVOC_SERIAL = httpContext.cgiGet( edtDEVOC_SERIAL_Internalname) ;
            n727DEVOC_SERIAL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A727DEVOC_SERIAL", A727DEVOC_SERIAL);
            n727DEVOC_SERIAL = ((GXutil.strcmp("", A727DEVOC_SERIAL)==0) ? true : false) ;
            A728DEVOC_MARCA = httpContext.cgiGet( edtDEVOC_MARCA_Internalname) ;
            n728DEVOC_MARCA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A728DEVOC_MARCA", A728DEVOC_MARCA);
            n728DEVOC_MARCA = ((GXutil.strcmp("", A728DEVOC_MARCA)==0) ? true : false) ;
            A729DEVOC_MARCA2 = httpContext.cgiGet( edtDEVOC_MARCA2_Internalname) ;
            n729DEVOC_MARCA2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A729DEVOC_MARCA2", A729DEVOC_MARCA2);
            n729DEVOC_MARCA2 = ((GXutil.strcmp("", A729DEVOC_MARCA2)==0) ? true : false) ;
            A730DEVOC_MODELO = httpContext.cgiGet( edtDEVOC_MODELO_Internalname) ;
            n730DEVOC_MODELO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A730DEVOC_MODELO", A730DEVOC_MODELO);
            n730DEVOC_MODELO = ((GXutil.strcmp("", A730DEVOC_MODELO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_VIDA_UTIL_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_VIDA_UTIL_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_VIDA_UTIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_VIDA_UTIL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A731DEVOC_VIDA_UTIL = (short)(0) ;
               n731DEVOC_VIDA_UTIL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A731DEVOC_VIDA_UTIL", GXutil.ltrim( GXutil.str( A731DEVOC_VIDA_UTIL, 4, 0)));
            }
            else
            {
               A731DEVOC_VIDA_UTIL = (short)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_VIDA_UTIL_Internalname), ",", ".")) ;
               n731DEVOC_VIDA_UTIL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A731DEVOC_VIDA_UTIL", GXutil.ltrim( GXutil.str( A731DEVOC_VIDA_UTIL, 4, 0)));
            }
            n731DEVOC_VIDA_UTIL = ((0==A731DEVOC_VIDA_UTIL) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDEVOC_VALOR_ADQUISICION_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDEVOC_VALOR_ADQUISICION_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_VALOR_ADQUISICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_VALOR_ADQUISICION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
               n732DEVOC_VALOR_ADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( GXutil.str( A732DEVOC_VALOR_ADQUISICION, 18, 2)));
            }
            else
            {
               A732DEVOC_VALOR_ADQUISICION = localUtil.ctond( httpContext.cgiGet( edtDEVOC_VALOR_ADQUISICION_Internalname)) ;
               n732DEVOC_VALOR_ADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( GXutil.str( A732DEVOC_VALOR_ADQUISICION, 18, 2)));
            }
            n732DEVOC_VALOR_ADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A732DEVOC_VALOR_ADQUISICION)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtDEVOC_FECHA_ADQUISICION_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVOC_FECHA_ADQUISICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_FECHA_ADQUISICION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
               n733DEVOC_FECHA_ADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A733DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
            }
            else
            {
               A733DEVOC_FECHA_ADQUISICION = localUtil.ctod( httpContext.cgiGet( edtDEVOC_FECHA_ADQUISICION_Internalname), 3) ;
               n733DEVOC_FECHA_ADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A733DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
            }
            n733DEVOC_FECHA_ADQUISICION = (GXutil.dateCompare(GXutil.nullDate(), A733DEVOC_FECHA_ADQUISICION) ? true : false) ;
            cmbDEVOC_ESTADO.setValue( httpContext.cgiGet( cmbDEVOC_ESTADO.getInternalname()) );
            A99DEVOC_ESTADO = httpContext.cgiGet( cmbDEVOC_ESTADO.getInternalname()) ;
            n99DEVOC_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
            n99DEVOC_ESTADO = ((GXutil.strcmp("", A99DEVOC_ESTADO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_CENTRO_COSTO_ORIGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A97DEVOC_CENTRO_COSTO_ORIGEN = 0 ;
               n97DEVOC_CENTRO_COSTO_ORIGEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( GXutil.str( A97DEVOC_CENTRO_COSTO_ORIGEN, 11, 0)));
            }
            else
            {
               A97DEVOC_CENTRO_COSTO_ORIGEN = localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname), ",", ".") ;
               n97DEVOC_CENTRO_COSTO_ORIGEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( GXutil.str( A97DEVOC_CENTRO_COSTO_ORIGEN, 11, 0)));
            }
            n97DEVOC_CENTRO_COSTO_ORIGEN = ((0==A97DEVOC_CENTRO_COSTO_ORIGEN) ? true : false) ;
            A734DEVOC_MODULO_ORIGEN = httpContext.cgiGet( edtDEVOC_MODULO_ORIGEN_Internalname) ;
            n734DEVOC_MODULO_ORIGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A734DEVOC_MODULO_ORIGEN", A734DEVOC_MODULO_ORIGEN);
            n734DEVOC_MODULO_ORIGEN = ((GXutil.strcmp("", A734DEVOC_MODULO_ORIGEN)==0) ? true : false) ;
            A735DEVOC_ALMA_ORIGEN = httpContext.cgiGet( edtDEVOC_ALMA_ORIGEN_Internalname) ;
            n735DEVOC_ALMA_ORIGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A735DEVOC_ALMA_ORIGEN", A735DEVOC_ALMA_ORIGEN);
            n735DEVOC_ALMA_ORIGEN = ((GXutil.strcmp("", A735DEVOC_ALMA_ORIGEN)==0) ? true : false) ;
            A736DEVOC_BODEGA_ORIGEN = httpContext.cgiGet( edtDEVOC_BODEGA_ORIGEN_Internalname) ;
            n736DEVOC_BODEGA_ORIGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A736DEVOC_BODEGA_ORIGEN", A736DEVOC_BODEGA_ORIGEN);
            n736DEVOC_BODEGA_ORIGEN = ((GXutil.strcmp("", A736DEVOC_BODEGA_ORIGEN)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_ORIGEN_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_ORIGEN_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_NIT_ORIGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_NIT_ORIGEN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A98DEVOC_NIT_ORIGEN = 0 ;
               n98DEVOC_NIT_ORIGEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A98DEVOC_NIT_ORIGEN", GXutil.ltrim( GXutil.str( A98DEVOC_NIT_ORIGEN, 18, 0)));
            }
            else
            {
               A98DEVOC_NIT_ORIGEN = localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_ORIGEN_Internalname), ",", ".") ;
               n98DEVOC_NIT_ORIGEN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A98DEVOC_NIT_ORIGEN", GXutil.ltrim( GXutil.str( A98DEVOC_NIT_ORIGEN, 18, 0)));
            }
            n98DEVOC_NIT_ORIGEN = ((0==A98DEVOC_NIT_ORIGEN) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_DESTINO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_DESTINO_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_REGIONAL_DESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_REGIONAL_DESTINO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A737DEVOC_REGIONAL_DESTINO = 0 ;
               n737DEVOC_REGIONAL_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( GXutil.str( A737DEVOC_REGIONAL_DESTINO, 11, 0)));
            }
            else
            {
               A737DEVOC_REGIONAL_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_DESTINO_Internalname), ",", ".") ;
               n737DEVOC_REGIONAL_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( GXutil.str( A737DEVOC_REGIONAL_DESTINO, 11, 0)));
            }
            n737DEVOC_REGIONAL_DESTINO = ((0==A737DEVOC_REGIONAL_DESTINO) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_DESTINO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_DESTINO_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_CENTRO_COSTO_DESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_CENTRO_COSTO_DESTINO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A738DEVOC_CENTRO_COSTO_DESTINO = 0 ;
               n738DEVOC_CENTRO_COSTO_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( GXutil.str( A738DEVOC_CENTRO_COSTO_DESTINO, 11, 0)));
            }
            else
            {
               A738DEVOC_CENTRO_COSTO_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_CENTRO_COSTO_DESTINO_Internalname), ",", ".") ;
               n738DEVOC_CENTRO_COSTO_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( GXutil.str( A738DEVOC_CENTRO_COSTO_DESTINO, 11, 0)));
            }
            n738DEVOC_CENTRO_COSTO_DESTINO = ((0==A738DEVOC_CENTRO_COSTO_DESTINO) ? true : false) ;
            A739DEVOC_MODULO_DESTINO = httpContext.cgiGet( edtDEVOC_MODULO_DESTINO_Internalname) ;
            n739DEVOC_MODULO_DESTINO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A739DEVOC_MODULO_DESTINO", A739DEVOC_MODULO_DESTINO);
            n739DEVOC_MODULO_DESTINO = ((GXutil.strcmp("", A739DEVOC_MODULO_DESTINO)==0) ? true : false) ;
            A740DEVOC_ALMA_DESTINO = httpContext.cgiGet( edtDEVOC_ALMA_DESTINO_Internalname) ;
            n740DEVOC_ALMA_DESTINO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A740DEVOC_ALMA_DESTINO", A740DEVOC_ALMA_DESTINO);
            n740DEVOC_ALMA_DESTINO = ((GXutil.strcmp("", A740DEVOC_ALMA_DESTINO)==0) ? true : false) ;
            A741DEVOC_BODEGA_DESTINO = httpContext.cgiGet( edtDEVOC_BODEGA_DESTINO_Internalname) ;
            n741DEVOC_BODEGA_DESTINO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A741DEVOC_BODEGA_DESTINO", A741DEVOC_BODEGA_DESTINO);
            n741DEVOC_BODEGA_DESTINO = ((GXutil.strcmp("", A741DEVOC_BODEGA_DESTINO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_DESTINO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_DESTINO_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_NIT_DESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_NIT_DESTINO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A742DEVOC_NIT_DESTINO = 0 ;
               n742DEVOC_NIT_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A742DEVOC_NIT_DESTINO", GXutil.ltrim( GXutil.str( A742DEVOC_NIT_DESTINO, 18, 0)));
            }
            else
            {
               A742DEVOC_NIT_DESTINO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_NIT_DESTINO_Internalname), ",", ".") ;
               n742DEVOC_NIT_DESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A742DEVOC_NIT_DESTINO", GXutil.ltrim( GXutil.str( A742DEVOC_NIT_DESTINO, 18, 0)));
            }
            n742DEVOC_NIT_DESTINO = ((0==A742DEVOC_NIT_DESTINO) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_PROVEEDOR_ID_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_PROVEEDOR_ID_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_PROVEEDOR_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_PROVEEDOR_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A743DEVOC_PROVEEDOR_ID = 0 ;
               n743DEVOC_PROVEEDOR_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A743DEVOC_PROVEEDOR_ID", GXutil.ltrim( GXutil.str( A743DEVOC_PROVEEDOR_ID, 18, 0)));
            }
            else
            {
               A743DEVOC_PROVEEDOR_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_PROVEEDOR_ID_Internalname), ",", ".") ;
               n743DEVOC_PROVEEDOR_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A743DEVOC_PROVEEDOR_ID", GXutil.ltrim( GXutil.str( A743DEVOC_PROVEEDOR_ID, 18, 0)));
            }
            n743DEVOC_PROVEEDOR_ID = ((0==A743DEVOC_PROVEEDOR_ID) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtDEVOC_FECHA_SERVICIO_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVOC_FECHA_SERVICIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_FECHA_SERVICIO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
               n744DEVOC_FECHA_SERVICIO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A744DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
            }
            else
            {
               A744DEVOC_FECHA_SERVICIO = localUtil.ctod( httpContext.cgiGet( edtDEVOC_FECHA_SERVICIO_Internalname), 3) ;
               n744DEVOC_FECHA_SERVICIO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A744DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
            }
            n744DEVOC_FECHA_SERVICIO = (GXutil.dateCompare(GXutil.nullDate(), A744DEVOC_FECHA_SERVICIO) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_ACTA_ENTREGA_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_ACTA_ENTREGA_Internalname), ",", ".") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_ACTA_ENTREGA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_ACTA_ENTREGA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A745DEVOC_ACTA_ENTREGA = 0 ;
               n745DEVOC_ACTA_ENTREGA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A745DEVOC_ACTA_ENTREGA", GXutil.ltrim( GXutil.str( A745DEVOC_ACTA_ENTREGA, 5, 0)));
            }
            else
            {
               A745DEVOC_ACTA_ENTREGA = (int)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_ACTA_ENTREGA_Internalname), ",", ".")) ;
               n745DEVOC_ACTA_ENTREGA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A745DEVOC_ACTA_ENTREGA", GXutil.ltrim( GXutil.str( A745DEVOC_ACTA_ENTREGA, 5, 0)));
            }
            n745DEVOC_ACTA_ENTREGA = ((0==A745DEVOC_ACTA_ENTREGA) ? true : false) ;
            A748DEVOC_TRAN_OBSERVACIONES = httpContext.cgiGet( edtDEVOC_TRAN_OBSERVACIONES_Internalname) ;
            n748DEVOC_TRAN_OBSERVACIONES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A748DEVOC_TRAN_OBSERVACIONES", A748DEVOC_TRAN_OBSERVACIONES);
            n748DEVOC_TRAN_OBSERVACIONES = ((GXutil.strcmp("", A748DEVOC_TRAN_OBSERVACIONES)==0) ? true : false) ;
            A749DEVOC_CURSO_ID = httpContext.cgiGet( edtDEVOC_CURSO_ID_Internalname) ;
            n749DEVOC_CURSO_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A749DEVOC_CURSO_ID", A749DEVOC_CURSO_ID);
            n749DEVOC_CURSO_ID = ((GXutil.strcmp("", A749DEVOC_CURSO_ID)==0) ? true : false) ;
            A750DEVOC_AREADANTE_ID = httpContext.cgiGet( edtDEVOC_AREADANTE_ID_Internalname) ;
            n750DEVOC_AREADANTE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A750DEVOC_AREADANTE_ID", A750DEVOC_AREADANTE_ID);
            n750DEVOC_AREADANTE_ID = ((GXutil.strcmp("", A750DEVOC_AREADANTE_ID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TIPO_INGRESO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_TIPO_INGRESO_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_TIPO_INGRESO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_TIPO_INGRESO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A751DEVOC_TIPO_INGRESO = 0 ;
               n751DEVOC_TIPO_INGRESO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A751DEVOC_TIPO_INGRESO", GXutil.ltrim( GXutil.str( A751DEVOC_TIPO_INGRESO, 11, 0)));
            }
            else
            {
               A751DEVOC_TIPO_INGRESO = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TIPO_INGRESO_Internalname), ",", ".") ;
               n751DEVOC_TIPO_INGRESO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A751DEVOC_TIPO_INGRESO", GXutil.ltrim( GXutil.str( A751DEVOC_TIPO_INGRESO, 11, 0)));
            }
            n751DEVOC_TIPO_INGRESO = ((0==A751DEVOC_TIPO_INGRESO) ? true : false) ;
            A752DEVOC_NUMERO_INGRESO = httpContext.cgiGet( edtDEVOC_NUMERO_INGRESO_Internalname) ;
            n752DEVOC_NUMERO_INGRESO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A752DEVOC_NUMERO_INGRESO", A752DEVOC_NUMERO_INGRESO);
            n752DEVOC_NUMERO_INGRESO = ((GXutil.strcmp("", A752DEVOC_NUMERO_INGRESO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_FECHA_INGRESO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDEVOC_FECHA_INGRESO_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVOC_FECHA_INGRESO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_FECHA_INGRESO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A753DEVOC_FECHA_INGRESO = (short)(0) ;
               n753DEVOC_FECHA_INGRESO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A753DEVOC_FECHA_INGRESO", GXutil.ltrim( GXutil.str( A753DEVOC_FECHA_INGRESO, 4, 0)));
            }
            else
            {
               A753DEVOC_FECHA_INGRESO = (short)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_FECHA_INGRESO_Internalname), ",", ".")) ;
               n753DEVOC_FECHA_INGRESO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A753DEVOC_FECHA_INGRESO", GXutil.ltrim( GXutil.str( A753DEVOC_FECHA_INGRESO, 4, 0)));
            }
            n753DEVOC_FECHA_INGRESO = ((0==A753DEVOC_FECHA_INGRESO) ? true : false) ;
            /* Read saved values. */
            Z95DEVOC_ID = localUtil.ctol( httpContext.cgiGet( "Z95DEVOC_ID"), ",", ".") ;
            Z96DEVOC_REGIONAL = localUtil.ctol( httpContext.cgiGet( "Z96DEVOC_REGIONAL"), ",", ".") ;
            n96DEVOC_REGIONAL = ((0==A96DEVOC_REGIONAL) ? true : false) ;
            Z101DEVOC_TRAN_ID = localUtil.ctol( httpContext.cgiGet( "Z101DEVOC_TRAN_ID"), ",", ".") ;
            n101DEVOC_TRAN_ID = ((0==A101DEVOC_TRAN_ID) ? true : false) ;
            Z722DEVOC_TIPO_MOVIMIENTO = httpContext.cgiGet( "Z722DEVOC_TIPO_MOVIMIENTO") ;
            n722DEVOC_TIPO_MOVIMIENTO = ((GXutil.strcmp("", A722DEVOC_TIPO_MOVIMIENTO)==0) ? true : false) ;
            Z100DEVOC_CODIGO_MOVIMIENTO = httpContext.cgiGet( "Z100DEVOC_CODIGO_MOVIMIENTO") ;
            n100DEVOC_CODIGO_MOVIMIENTO = ((GXutil.strcmp("", A100DEVOC_CODIGO_MOVIMIENTO)==0) ? true : false) ;
            Z723DEVOC_TRAN_CC = localUtil.ctol( httpContext.cgiGet( "Z723DEVOC_TRAN_CC"), ",", ".") ;
            n723DEVOC_TRAN_CC = ((0==A723DEVOC_TRAN_CC) ? true : false) ;
            Z103DEVOC_FECHA_MOVIMIENTO = localUtil.ctod( httpContext.cgiGet( "Z103DEVOC_FECHA_MOVIMIENTO"), 0) ;
            n103DEVOC_FECHA_MOVIMIENTO = (GXutil.dateCompare(GXutil.nullDate(), A103DEVOC_FECHA_MOVIMIENTO) ? true : false) ;
            Z724DEVOC_RENGLON = (int)(localUtil.ctol( httpContext.cgiGet( "Z724DEVOC_RENGLON"), ",", ".")) ;
            n724DEVOC_RENGLON = ((0==A724DEVOC_RENGLON) ? true : false) ;
            Z725DEVOC_PLACA = httpContext.cgiGet( "Z725DEVOC_PLACA") ;
            n725DEVOC_PLACA = ((GXutil.strcmp("", A725DEVOC_PLACA)==0) ? true : false) ;
            Z726DEVOC_PLACA_PADRE = httpContext.cgiGet( "Z726DEVOC_PLACA_PADRE") ;
            n726DEVOC_PLACA_PADRE = ((GXutil.strcmp("", A726DEVOC_PLACA_PADRE)==0) ? true : false) ;
            Z727DEVOC_SERIAL = httpContext.cgiGet( "Z727DEVOC_SERIAL") ;
            n727DEVOC_SERIAL = ((GXutil.strcmp("", A727DEVOC_SERIAL)==0) ? true : false) ;
            Z728DEVOC_MARCA = httpContext.cgiGet( "Z728DEVOC_MARCA") ;
            n728DEVOC_MARCA = ((GXutil.strcmp("", A728DEVOC_MARCA)==0) ? true : false) ;
            Z729DEVOC_MARCA2 = httpContext.cgiGet( "Z729DEVOC_MARCA2") ;
            n729DEVOC_MARCA2 = ((GXutil.strcmp("", A729DEVOC_MARCA2)==0) ? true : false) ;
            Z730DEVOC_MODELO = httpContext.cgiGet( "Z730DEVOC_MODELO") ;
            n730DEVOC_MODELO = ((GXutil.strcmp("", A730DEVOC_MODELO)==0) ? true : false) ;
            Z731DEVOC_VIDA_UTIL = (short)(localUtil.ctol( httpContext.cgiGet( "Z731DEVOC_VIDA_UTIL"), ",", ".")) ;
            n731DEVOC_VIDA_UTIL = ((0==A731DEVOC_VIDA_UTIL) ? true : false) ;
            Z732DEVOC_VALOR_ADQUISICION = localUtil.ctond( httpContext.cgiGet( "Z732DEVOC_VALOR_ADQUISICION")) ;
            n732DEVOC_VALOR_ADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A732DEVOC_VALOR_ADQUISICION)==0) ? true : false) ;
            Z733DEVOC_FECHA_ADQUISICION = localUtil.ctod( httpContext.cgiGet( "Z733DEVOC_FECHA_ADQUISICION"), 0) ;
            n733DEVOC_FECHA_ADQUISICION = (GXutil.dateCompare(GXutil.nullDate(), A733DEVOC_FECHA_ADQUISICION) ? true : false) ;
            Z99DEVOC_ESTADO = httpContext.cgiGet( "Z99DEVOC_ESTADO") ;
            n99DEVOC_ESTADO = ((GXutil.strcmp("", A99DEVOC_ESTADO)==0) ? true : false) ;
            Z97DEVOC_CENTRO_COSTO_ORIGEN = localUtil.ctol( httpContext.cgiGet( "Z97DEVOC_CENTRO_COSTO_ORIGEN"), ",", ".") ;
            n97DEVOC_CENTRO_COSTO_ORIGEN = ((0==A97DEVOC_CENTRO_COSTO_ORIGEN) ? true : false) ;
            Z734DEVOC_MODULO_ORIGEN = httpContext.cgiGet( "Z734DEVOC_MODULO_ORIGEN") ;
            n734DEVOC_MODULO_ORIGEN = ((GXutil.strcmp("", A734DEVOC_MODULO_ORIGEN)==0) ? true : false) ;
            Z735DEVOC_ALMA_ORIGEN = httpContext.cgiGet( "Z735DEVOC_ALMA_ORIGEN") ;
            n735DEVOC_ALMA_ORIGEN = ((GXutil.strcmp("", A735DEVOC_ALMA_ORIGEN)==0) ? true : false) ;
            Z736DEVOC_BODEGA_ORIGEN = httpContext.cgiGet( "Z736DEVOC_BODEGA_ORIGEN") ;
            n736DEVOC_BODEGA_ORIGEN = ((GXutil.strcmp("", A736DEVOC_BODEGA_ORIGEN)==0) ? true : false) ;
            Z98DEVOC_NIT_ORIGEN = localUtil.ctol( httpContext.cgiGet( "Z98DEVOC_NIT_ORIGEN"), ",", ".") ;
            n98DEVOC_NIT_ORIGEN = ((0==A98DEVOC_NIT_ORIGEN) ? true : false) ;
            Z737DEVOC_REGIONAL_DESTINO = localUtil.ctol( httpContext.cgiGet( "Z737DEVOC_REGIONAL_DESTINO"), ",", ".") ;
            n737DEVOC_REGIONAL_DESTINO = ((0==A737DEVOC_REGIONAL_DESTINO) ? true : false) ;
            Z738DEVOC_CENTRO_COSTO_DESTINO = localUtil.ctol( httpContext.cgiGet( "Z738DEVOC_CENTRO_COSTO_DESTINO"), ",", ".") ;
            n738DEVOC_CENTRO_COSTO_DESTINO = ((0==A738DEVOC_CENTRO_COSTO_DESTINO) ? true : false) ;
            Z739DEVOC_MODULO_DESTINO = httpContext.cgiGet( "Z739DEVOC_MODULO_DESTINO") ;
            n739DEVOC_MODULO_DESTINO = ((GXutil.strcmp("", A739DEVOC_MODULO_DESTINO)==0) ? true : false) ;
            Z740DEVOC_ALMA_DESTINO = httpContext.cgiGet( "Z740DEVOC_ALMA_DESTINO") ;
            n740DEVOC_ALMA_DESTINO = ((GXutil.strcmp("", A740DEVOC_ALMA_DESTINO)==0) ? true : false) ;
            Z741DEVOC_BODEGA_DESTINO = httpContext.cgiGet( "Z741DEVOC_BODEGA_DESTINO") ;
            n741DEVOC_BODEGA_DESTINO = ((GXutil.strcmp("", A741DEVOC_BODEGA_DESTINO)==0) ? true : false) ;
            Z742DEVOC_NIT_DESTINO = localUtil.ctol( httpContext.cgiGet( "Z742DEVOC_NIT_DESTINO"), ",", ".") ;
            n742DEVOC_NIT_DESTINO = ((0==A742DEVOC_NIT_DESTINO) ? true : false) ;
            Z743DEVOC_PROVEEDOR_ID = localUtil.ctol( httpContext.cgiGet( "Z743DEVOC_PROVEEDOR_ID"), ",", ".") ;
            n743DEVOC_PROVEEDOR_ID = ((0==A743DEVOC_PROVEEDOR_ID) ? true : false) ;
            Z744DEVOC_FECHA_SERVICIO = localUtil.ctod( httpContext.cgiGet( "Z744DEVOC_FECHA_SERVICIO"), 0) ;
            n744DEVOC_FECHA_SERVICIO = (GXutil.dateCompare(GXutil.nullDate(), A744DEVOC_FECHA_SERVICIO) ? true : false) ;
            Z745DEVOC_ACTA_ENTREGA = (int)(localUtil.ctol( httpContext.cgiGet( "Z745DEVOC_ACTA_ENTREGA"), ",", ".")) ;
            n745DEVOC_ACTA_ENTREGA = ((0==A745DEVOC_ACTA_ENTREGA) ? true : false) ;
            Z748DEVOC_TRAN_OBSERVACIONES = httpContext.cgiGet( "Z748DEVOC_TRAN_OBSERVACIONES") ;
            n748DEVOC_TRAN_OBSERVACIONES = ((GXutil.strcmp("", A748DEVOC_TRAN_OBSERVACIONES)==0) ? true : false) ;
            Z749DEVOC_CURSO_ID = httpContext.cgiGet( "Z749DEVOC_CURSO_ID") ;
            n749DEVOC_CURSO_ID = ((GXutil.strcmp("", A749DEVOC_CURSO_ID)==0) ? true : false) ;
            Z750DEVOC_AREADANTE_ID = httpContext.cgiGet( "Z750DEVOC_AREADANTE_ID") ;
            n750DEVOC_AREADANTE_ID = ((GXutil.strcmp("", A750DEVOC_AREADANTE_ID)==0) ? true : false) ;
            Z751DEVOC_TIPO_INGRESO = localUtil.ctol( httpContext.cgiGet( "Z751DEVOC_TIPO_INGRESO"), ",", ".") ;
            n751DEVOC_TIPO_INGRESO = ((0==A751DEVOC_TIPO_INGRESO) ? true : false) ;
            Z752DEVOC_NUMERO_INGRESO = httpContext.cgiGet( "Z752DEVOC_NUMERO_INGRESO") ;
            n752DEVOC_NUMERO_INGRESO = ((GXutil.strcmp("", A752DEVOC_NUMERO_INGRESO)==0) ? true : false) ;
            Z753DEVOC_FECHA_INGRESO = (short)(localUtil.ctol( httpContext.cgiGet( "Z753DEVOC_FECHA_INGRESO"), ",", ".")) ;
            n753DEVOC_FECHA_INGRESO = ((0==A753DEVOC_FECHA_INGRESO) ? true : false) ;
            Z102DEVOC_CONSECUTIVO = httpContext.cgiGet( "Z102DEVOC_CONSECUTIVO") ;
            n102DEVOC_CONSECUTIVO = ((GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A95DEVOC_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0X53( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_first_Visible, 5, 0)), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_previous_Visible, 5, 0)), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_next_Visible, 5, 0)), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_last_Visible, 5, 0)), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_select_Visible, 5, 0)), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
      }
      disableAttributes0X53( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption0X0( )
   {
   }

   public void zm0X53( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z96DEVOC_REGIONAL = T000X3_A96DEVOC_REGIONAL[0] ;
            Z101DEVOC_TRAN_ID = T000X3_A101DEVOC_TRAN_ID[0] ;
            Z722DEVOC_TIPO_MOVIMIENTO = T000X3_A722DEVOC_TIPO_MOVIMIENTO[0] ;
            Z100DEVOC_CODIGO_MOVIMIENTO = T000X3_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
            Z723DEVOC_TRAN_CC = T000X3_A723DEVOC_TRAN_CC[0] ;
            Z103DEVOC_FECHA_MOVIMIENTO = T000X3_A103DEVOC_FECHA_MOVIMIENTO[0] ;
            Z724DEVOC_RENGLON = T000X3_A724DEVOC_RENGLON[0] ;
            Z725DEVOC_PLACA = T000X3_A725DEVOC_PLACA[0] ;
            Z726DEVOC_PLACA_PADRE = T000X3_A726DEVOC_PLACA_PADRE[0] ;
            Z727DEVOC_SERIAL = T000X3_A727DEVOC_SERIAL[0] ;
            Z728DEVOC_MARCA = T000X3_A728DEVOC_MARCA[0] ;
            Z729DEVOC_MARCA2 = T000X3_A729DEVOC_MARCA2[0] ;
            Z730DEVOC_MODELO = T000X3_A730DEVOC_MODELO[0] ;
            Z731DEVOC_VIDA_UTIL = T000X3_A731DEVOC_VIDA_UTIL[0] ;
            Z732DEVOC_VALOR_ADQUISICION = T000X3_A732DEVOC_VALOR_ADQUISICION[0] ;
            Z733DEVOC_FECHA_ADQUISICION = T000X3_A733DEVOC_FECHA_ADQUISICION[0] ;
            Z99DEVOC_ESTADO = T000X3_A99DEVOC_ESTADO[0] ;
            Z97DEVOC_CENTRO_COSTO_ORIGEN = T000X3_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
            Z734DEVOC_MODULO_ORIGEN = T000X3_A734DEVOC_MODULO_ORIGEN[0] ;
            Z735DEVOC_ALMA_ORIGEN = T000X3_A735DEVOC_ALMA_ORIGEN[0] ;
            Z736DEVOC_BODEGA_ORIGEN = T000X3_A736DEVOC_BODEGA_ORIGEN[0] ;
            Z98DEVOC_NIT_ORIGEN = T000X3_A98DEVOC_NIT_ORIGEN[0] ;
            Z737DEVOC_REGIONAL_DESTINO = T000X3_A737DEVOC_REGIONAL_DESTINO[0] ;
            Z738DEVOC_CENTRO_COSTO_DESTINO = T000X3_A738DEVOC_CENTRO_COSTO_DESTINO[0] ;
            Z739DEVOC_MODULO_DESTINO = T000X3_A739DEVOC_MODULO_DESTINO[0] ;
            Z740DEVOC_ALMA_DESTINO = T000X3_A740DEVOC_ALMA_DESTINO[0] ;
            Z741DEVOC_BODEGA_DESTINO = T000X3_A741DEVOC_BODEGA_DESTINO[0] ;
            Z742DEVOC_NIT_DESTINO = T000X3_A742DEVOC_NIT_DESTINO[0] ;
            Z743DEVOC_PROVEEDOR_ID = T000X3_A743DEVOC_PROVEEDOR_ID[0] ;
            Z744DEVOC_FECHA_SERVICIO = T000X3_A744DEVOC_FECHA_SERVICIO[0] ;
            Z745DEVOC_ACTA_ENTREGA = T000X3_A745DEVOC_ACTA_ENTREGA[0] ;
            Z748DEVOC_TRAN_OBSERVACIONES = T000X3_A748DEVOC_TRAN_OBSERVACIONES[0] ;
            Z749DEVOC_CURSO_ID = T000X3_A749DEVOC_CURSO_ID[0] ;
            Z750DEVOC_AREADANTE_ID = T000X3_A750DEVOC_AREADANTE_ID[0] ;
            Z751DEVOC_TIPO_INGRESO = T000X3_A751DEVOC_TIPO_INGRESO[0] ;
            Z752DEVOC_NUMERO_INGRESO = T000X3_A752DEVOC_NUMERO_INGRESO[0] ;
            Z753DEVOC_FECHA_INGRESO = T000X3_A753DEVOC_FECHA_INGRESO[0] ;
            Z102DEVOC_CONSECUTIVO = T000X3_A102DEVOC_CONSECUTIVO[0] ;
         }
         else
         {
            Z96DEVOC_REGIONAL = A96DEVOC_REGIONAL ;
            Z101DEVOC_TRAN_ID = A101DEVOC_TRAN_ID ;
            Z722DEVOC_TIPO_MOVIMIENTO = A722DEVOC_TIPO_MOVIMIENTO ;
            Z100DEVOC_CODIGO_MOVIMIENTO = A100DEVOC_CODIGO_MOVIMIENTO ;
            Z723DEVOC_TRAN_CC = A723DEVOC_TRAN_CC ;
            Z103DEVOC_FECHA_MOVIMIENTO = A103DEVOC_FECHA_MOVIMIENTO ;
            Z724DEVOC_RENGLON = A724DEVOC_RENGLON ;
            Z725DEVOC_PLACA = A725DEVOC_PLACA ;
            Z726DEVOC_PLACA_PADRE = A726DEVOC_PLACA_PADRE ;
            Z727DEVOC_SERIAL = A727DEVOC_SERIAL ;
            Z728DEVOC_MARCA = A728DEVOC_MARCA ;
            Z729DEVOC_MARCA2 = A729DEVOC_MARCA2 ;
            Z730DEVOC_MODELO = A730DEVOC_MODELO ;
            Z731DEVOC_VIDA_UTIL = A731DEVOC_VIDA_UTIL ;
            Z732DEVOC_VALOR_ADQUISICION = A732DEVOC_VALOR_ADQUISICION ;
            Z733DEVOC_FECHA_ADQUISICION = A733DEVOC_FECHA_ADQUISICION ;
            Z99DEVOC_ESTADO = A99DEVOC_ESTADO ;
            Z97DEVOC_CENTRO_COSTO_ORIGEN = A97DEVOC_CENTRO_COSTO_ORIGEN ;
            Z734DEVOC_MODULO_ORIGEN = A734DEVOC_MODULO_ORIGEN ;
            Z735DEVOC_ALMA_ORIGEN = A735DEVOC_ALMA_ORIGEN ;
            Z736DEVOC_BODEGA_ORIGEN = A736DEVOC_BODEGA_ORIGEN ;
            Z98DEVOC_NIT_ORIGEN = A98DEVOC_NIT_ORIGEN ;
            Z737DEVOC_REGIONAL_DESTINO = A737DEVOC_REGIONAL_DESTINO ;
            Z738DEVOC_CENTRO_COSTO_DESTINO = A738DEVOC_CENTRO_COSTO_DESTINO ;
            Z739DEVOC_MODULO_DESTINO = A739DEVOC_MODULO_DESTINO ;
            Z740DEVOC_ALMA_DESTINO = A740DEVOC_ALMA_DESTINO ;
            Z741DEVOC_BODEGA_DESTINO = A741DEVOC_BODEGA_DESTINO ;
            Z742DEVOC_NIT_DESTINO = A742DEVOC_NIT_DESTINO ;
            Z743DEVOC_PROVEEDOR_ID = A743DEVOC_PROVEEDOR_ID ;
            Z744DEVOC_FECHA_SERVICIO = A744DEVOC_FECHA_SERVICIO ;
            Z745DEVOC_ACTA_ENTREGA = A745DEVOC_ACTA_ENTREGA ;
            Z748DEVOC_TRAN_OBSERVACIONES = A748DEVOC_TRAN_OBSERVACIONES ;
            Z749DEVOC_CURSO_ID = A749DEVOC_CURSO_ID ;
            Z750DEVOC_AREADANTE_ID = A750DEVOC_AREADANTE_ID ;
            Z751DEVOC_TIPO_INGRESO = A751DEVOC_TIPO_INGRESO ;
            Z752DEVOC_NUMERO_INGRESO = A752DEVOC_NUMERO_INGRESO ;
            Z753DEVOC_FECHA_INGRESO = A753DEVOC_FECHA_INGRESO ;
            Z102DEVOC_CONSECUTIVO = A102DEVOC_CONSECUTIVO ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z95DEVOC_ID = A95DEVOC_ID ;
         Z96DEVOC_REGIONAL = A96DEVOC_REGIONAL ;
         Z101DEVOC_TRAN_ID = A101DEVOC_TRAN_ID ;
         Z722DEVOC_TIPO_MOVIMIENTO = A722DEVOC_TIPO_MOVIMIENTO ;
         Z100DEVOC_CODIGO_MOVIMIENTO = A100DEVOC_CODIGO_MOVIMIENTO ;
         Z723DEVOC_TRAN_CC = A723DEVOC_TRAN_CC ;
         Z103DEVOC_FECHA_MOVIMIENTO = A103DEVOC_FECHA_MOVIMIENTO ;
         Z724DEVOC_RENGLON = A724DEVOC_RENGLON ;
         Z725DEVOC_PLACA = A725DEVOC_PLACA ;
         Z726DEVOC_PLACA_PADRE = A726DEVOC_PLACA_PADRE ;
         Z727DEVOC_SERIAL = A727DEVOC_SERIAL ;
         Z728DEVOC_MARCA = A728DEVOC_MARCA ;
         Z729DEVOC_MARCA2 = A729DEVOC_MARCA2 ;
         Z730DEVOC_MODELO = A730DEVOC_MODELO ;
         Z731DEVOC_VIDA_UTIL = A731DEVOC_VIDA_UTIL ;
         Z732DEVOC_VALOR_ADQUISICION = A732DEVOC_VALOR_ADQUISICION ;
         Z733DEVOC_FECHA_ADQUISICION = A733DEVOC_FECHA_ADQUISICION ;
         Z99DEVOC_ESTADO = A99DEVOC_ESTADO ;
         Z97DEVOC_CENTRO_COSTO_ORIGEN = A97DEVOC_CENTRO_COSTO_ORIGEN ;
         Z734DEVOC_MODULO_ORIGEN = A734DEVOC_MODULO_ORIGEN ;
         Z735DEVOC_ALMA_ORIGEN = A735DEVOC_ALMA_ORIGEN ;
         Z736DEVOC_BODEGA_ORIGEN = A736DEVOC_BODEGA_ORIGEN ;
         Z98DEVOC_NIT_ORIGEN = A98DEVOC_NIT_ORIGEN ;
         Z737DEVOC_REGIONAL_DESTINO = A737DEVOC_REGIONAL_DESTINO ;
         Z738DEVOC_CENTRO_COSTO_DESTINO = A738DEVOC_CENTRO_COSTO_DESTINO ;
         Z739DEVOC_MODULO_DESTINO = A739DEVOC_MODULO_DESTINO ;
         Z740DEVOC_ALMA_DESTINO = A740DEVOC_ALMA_DESTINO ;
         Z741DEVOC_BODEGA_DESTINO = A741DEVOC_BODEGA_DESTINO ;
         Z742DEVOC_NIT_DESTINO = A742DEVOC_NIT_DESTINO ;
         Z743DEVOC_PROVEEDOR_ID = A743DEVOC_PROVEEDOR_ID ;
         Z744DEVOC_FECHA_SERVICIO = A744DEVOC_FECHA_SERVICIO ;
         Z745DEVOC_ACTA_ENTREGA = A745DEVOC_ACTA_ENTREGA ;
         Z748DEVOC_TRAN_OBSERVACIONES = A748DEVOC_TRAN_OBSERVACIONES ;
         Z749DEVOC_CURSO_ID = A749DEVOC_CURSO_ID ;
         Z750DEVOC_AREADANTE_ID = A750DEVOC_AREADANTE_ID ;
         Z751DEVOC_TIPO_INGRESO = A751DEVOC_TIPO_INGRESO ;
         Z752DEVOC_NUMERO_INGRESO = A752DEVOC_NUMERO_INGRESO ;
         Z753DEVOC_FECHA_INGRESO = A753DEVOC_FECHA_INGRESO ;
         Z102DEVOC_CONSECUTIVO = A102DEVOC_CONSECUTIVO ;
         Z757DEVOC_CATACODIGO = A757DEVOC_CATACODIGO ;
         Z746DEVOC_DESCRIPCION = A746DEVOC_DESCRIPCION ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_102_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00x0"+"',["+"{Ctrl:gx.dom.el('"+"DEVOC_CONSECUTIVO"+"'), id:'"+"DEVOC_CONSECUTIVO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
   }

   public void load0X53( )
   {
      /* Using cursor T000X6 */
      pr_default.execute(4, new Object[] {new Long(A95DEVOC_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A96DEVOC_REGIONAL = T000X6_A96DEVOC_REGIONAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96DEVOC_REGIONAL", GXutil.ltrim( GXutil.str( A96DEVOC_REGIONAL, 11, 0)));
         n96DEVOC_REGIONAL = T000X6_n96DEVOC_REGIONAL[0] ;
         A101DEVOC_TRAN_ID = T000X6_A101DEVOC_TRAN_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101DEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( A101DEVOC_TRAN_ID, 11, 0)));
         n101DEVOC_TRAN_ID = T000X6_n101DEVOC_TRAN_ID[0] ;
         A722DEVOC_TIPO_MOVIMIENTO = T000X6_A722DEVOC_TIPO_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
         n722DEVOC_TIPO_MOVIMIENTO = T000X6_n722DEVOC_TIPO_MOVIMIENTO[0] ;
         A100DEVOC_CODIGO_MOVIMIENTO = T000X6_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
         n100DEVOC_CODIGO_MOVIMIENTO = T000X6_n100DEVOC_CODIGO_MOVIMIENTO[0] ;
         A723DEVOC_TRAN_CC = T000X6_A723DEVOC_TRAN_CC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723DEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( A723DEVOC_TRAN_CC, 18, 0)));
         n723DEVOC_TRAN_CC = T000X6_n723DEVOC_TRAN_CC[0] ;
         A103DEVOC_FECHA_MOVIMIENTO = T000X6_A103DEVOC_FECHA_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
         n103DEVOC_FECHA_MOVIMIENTO = T000X6_n103DEVOC_FECHA_MOVIMIENTO[0] ;
         A724DEVOC_RENGLON = T000X6_A724DEVOC_RENGLON[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724DEVOC_RENGLON", GXutil.ltrim( GXutil.str( A724DEVOC_RENGLON, 5, 0)));
         n724DEVOC_RENGLON = T000X6_n724DEVOC_RENGLON[0] ;
         A746DEVOC_DESCRIPCION = T000X6_A746DEVOC_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
         n746DEVOC_DESCRIPCION = T000X6_n746DEVOC_DESCRIPCION[0] ;
         A725DEVOC_PLACA = T000X6_A725DEVOC_PLACA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725DEVOC_PLACA", A725DEVOC_PLACA);
         n725DEVOC_PLACA = T000X6_n725DEVOC_PLACA[0] ;
         A726DEVOC_PLACA_PADRE = T000X6_A726DEVOC_PLACA_PADRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726DEVOC_PLACA_PADRE", A726DEVOC_PLACA_PADRE);
         n726DEVOC_PLACA_PADRE = T000X6_n726DEVOC_PLACA_PADRE[0] ;
         A727DEVOC_SERIAL = T000X6_A727DEVOC_SERIAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727DEVOC_SERIAL", A727DEVOC_SERIAL);
         n727DEVOC_SERIAL = T000X6_n727DEVOC_SERIAL[0] ;
         A728DEVOC_MARCA = T000X6_A728DEVOC_MARCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728DEVOC_MARCA", A728DEVOC_MARCA);
         n728DEVOC_MARCA = T000X6_n728DEVOC_MARCA[0] ;
         A729DEVOC_MARCA2 = T000X6_A729DEVOC_MARCA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729DEVOC_MARCA2", A729DEVOC_MARCA2);
         n729DEVOC_MARCA2 = T000X6_n729DEVOC_MARCA2[0] ;
         A730DEVOC_MODELO = T000X6_A730DEVOC_MODELO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730DEVOC_MODELO", A730DEVOC_MODELO);
         n730DEVOC_MODELO = T000X6_n730DEVOC_MODELO[0] ;
         A731DEVOC_VIDA_UTIL = T000X6_A731DEVOC_VIDA_UTIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731DEVOC_VIDA_UTIL", GXutil.ltrim( GXutil.str( A731DEVOC_VIDA_UTIL, 4, 0)));
         n731DEVOC_VIDA_UTIL = T000X6_n731DEVOC_VIDA_UTIL[0] ;
         A732DEVOC_VALOR_ADQUISICION = T000X6_A732DEVOC_VALOR_ADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( GXutil.str( A732DEVOC_VALOR_ADQUISICION, 18, 2)));
         n732DEVOC_VALOR_ADQUISICION = T000X6_n732DEVOC_VALOR_ADQUISICION[0] ;
         A733DEVOC_FECHA_ADQUISICION = T000X6_A733DEVOC_FECHA_ADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
         n733DEVOC_FECHA_ADQUISICION = T000X6_n733DEVOC_FECHA_ADQUISICION[0] ;
         A99DEVOC_ESTADO = T000X6_A99DEVOC_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
         n99DEVOC_ESTADO = T000X6_n99DEVOC_ESTADO[0] ;
         A97DEVOC_CENTRO_COSTO_ORIGEN = T000X6_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( GXutil.str( A97DEVOC_CENTRO_COSTO_ORIGEN, 11, 0)));
         n97DEVOC_CENTRO_COSTO_ORIGEN = T000X6_n97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         A734DEVOC_MODULO_ORIGEN = T000X6_A734DEVOC_MODULO_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734DEVOC_MODULO_ORIGEN", A734DEVOC_MODULO_ORIGEN);
         n734DEVOC_MODULO_ORIGEN = T000X6_n734DEVOC_MODULO_ORIGEN[0] ;
         A735DEVOC_ALMA_ORIGEN = T000X6_A735DEVOC_ALMA_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A735DEVOC_ALMA_ORIGEN", A735DEVOC_ALMA_ORIGEN);
         n735DEVOC_ALMA_ORIGEN = T000X6_n735DEVOC_ALMA_ORIGEN[0] ;
         A736DEVOC_BODEGA_ORIGEN = T000X6_A736DEVOC_BODEGA_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736DEVOC_BODEGA_ORIGEN", A736DEVOC_BODEGA_ORIGEN);
         n736DEVOC_BODEGA_ORIGEN = T000X6_n736DEVOC_BODEGA_ORIGEN[0] ;
         A98DEVOC_NIT_ORIGEN = T000X6_A98DEVOC_NIT_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98DEVOC_NIT_ORIGEN", GXutil.ltrim( GXutil.str( A98DEVOC_NIT_ORIGEN, 18, 0)));
         n98DEVOC_NIT_ORIGEN = T000X6_n98DEVOC_NIT_ORIGEN[0] ;
         A737DEVOC_REGIONAL_DESTINO = T000X6_A737DEVOC_REGIONAL_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( GXutil.str( A737DEVOC_REGIONAL_DESTINO, 11, 0)));
         n737DEVOC_REGIONAL_DESTINO = T000X6_n737DEVOC_REGIONAL_DESTINO[0] ;
         A738DEVOC_CENTRO_COSTO_DESTINO = T000X6_A738DEVOC_CENTRO_COSTO_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( GXutil.str( A738DEVOC_CENTRO_COSTO_DESTINO, 11, 0)));
         n738DEVOC_CENTRO_COSTO_DESTINO = T000X6_n738DEVOC_CENTRO_COSTO_DESTINO[0] ;
         A739DEVOC_MODULO_DESTINO = T000X6_A739DEVOC_MODULO_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739DEVOC_MODULO_DESTINO", A739DEVOC_MODULO_DESTINO);
         n739DEVOC_MODULO_DESTINO = T000X6_n739DEVOC_MODULO_DESTINO[0] ;
         A740DEVOC_ALMA_DESTINO = T000X6_A740DEVOC_ALMA_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740DEVOC_ALMA_DESTINO", A740DEVOC_ALMA_DESTINO);
         n740DEVOC_ALMA_DESTINO = T000X6_n740DEVOC_ALMA_DESTINO[0] ;
         A741DEVOC_BODEGA_DESTINO = T000X6_A741DEVOC_BODEGA_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A741DEVOC_BODEGA_DESTINO", A741DEVOC_BODEGA_DESTINO);
         n741DEVOC_BODEGA_DESTINO = T000X6_n741DEVOC_BODEGA_DESTINO[0] ;
         A742DEVOC_NIT_DESTINO = T000X6_A742DEVOC_NIT_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742DEVOC_NIT_DESTINO", GXutil.ltrim( GXutil.str( A742DEVOC_NIT_DESTINO, 18, 0)));
         n742DEVOC_NIT_DESTINO = T000X6_n742DEVOC_NIT_DESTINO[0] ;
         A743DEVOC_PROVEEDOR_ID = T000X6_A743DEVOC_PROVEEDOR_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743DEVOC_PROVEEDOR_ID", GXutil.ltrim( GXutil.str( A743DEVOC_PROVEEDOR_ID, 18, 0)));
         n743DEVOC_PROVEEDOR_ID = T000X6_n743DEVOC_PROVEEDOR_ID[0] ;
         A744DEVOC_FECHA_SERVICIO = T000X6_A744DEVOC_FECHA_SERVICIO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
         n744DEVOC_FECHA_SERVICIO = T000X6_n744DEVOC_FECHA_SERVICIO[0] ;
         A745DEVOC_ACTA_ENTREGA = T000X6_A745DEVOC_ACTA_ENTREGA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745DEVOC_ACTA_ENTREGA", GXutil.ltrim( GXutil.str( A745DEVOC_ACTA_ENTREGA, 5, 0)));
         n745DEVOC_ACTA_ENTREGA = T000X6_n745DEVOC_ACTA_ENTREGA[0] ;
         A748DEVOC_TRAN_OBSERVACIONES = T000X6_A748DEVOC_TRAN_OBSERVACIONES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A748DEVOC_TRAN_OBSERVACIONES", A748DEVOC_TRAN_OBSERVACIONES);
         n748DEVOC_TRAN_OBSERVACIONES = T000X6_n748DEVOC_TRAN_OBSERVACIONES[0] ;
         A749DEVOC_CURSO_ID = T000X6_A749DEVOC_CURSO_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A749DEVOC_CURSO_ID", A749DEVOC_CURSO_ID);
         n749DEVOC_CURSO_ID = T000X6_n749DEVOC_CURSO_ID[0] ;
         A750DEVOC_AREADANTE_ID = T000X6_A750DEVOC_AREADANTE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750DEVOC_AREADANTE_ID", A750DEVOC_AREADANTE_ID);
         n750DEVOC_AREADANTE_ID = T000X6_n750DEVOC_AREADANTE_ID[0] ;
         A751DEVOC_TIPO_INGRESO = T000X6_A751DEVOC_TIPO_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A751DEVOC_TIPO_INGRESO", GXutil.ltrim( GXutil.str( A751DEVOC_TIPO_INGRESO, 11, 0)));
         n751DEVOC_TIPO_INGRESO = T000X6_n751DEVOC_TIPO_INGRESO[0] ;
         A752DEVOC_NUMERO_INGRESO = T000X6_A752DEVOC_NUMERO_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A752DEVOC_NUMERO_INGRESO", A752DEVOC_NUMERO_INGRESO);
         n752DEVOC_NUMERO_INGRESO = T000X6_n752DEVOC_NUMERO_INGRESO[0] ;
         A753DEVOC_FECHA_INGRESO = T000X6_A753DEVOC_FECHA_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A753DEVOC_FECHA_INGRESO", GXutil.ltrim( GXutil.str( A753DEVOC_FECHA_INGRESO, 4, 0)));
         n753DEVOC_FECHA_INGRESO = T000X6_n753DEVOC_FECHA_INGRESO[0] ;
         A102DEVOC_CONSECUTIVO = T000X6_A102DEVOC_CONSECUTIVO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
         n102DEVOC_CONSECUTIVO = T000X6_n102DEVOC_CONSECUTIVO[0] ;
         A757DEVOC_CATACODIGO = T000X6_A757DEVOC_CATACODIGO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
         n757DEVOC_CATACODIGO = T000X6_n757DEVOC_CATACODIGO[0] ;
         zm0X53( -1) ;
      }
      pr_default.close(4);
      onLoadActions0X53( ) ;
   }

   public void onLoadActions0X53( )
   {
   }

   public void checkExtendedTable0X53( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000X4 */
      pr_default.execute(2, new Object[] {new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "DEVOC_CONSECUTIVO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDEVOC_CONSECUTIVO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A757DEVOC_CATACODIGO = T000X4_A757DEVOC_CATACODIGO[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
      n757DEVOC_CATACODIGO = T000X4_n757DEVOC_CATACODIGO[0] ;
      pr_default.close(2);
      /* Using cursor T000X5 */
      pr_default.execute(3, new Object[] {new Boolean(n757DEVOC_CATACODIGO), A757DEVOC_CATACODIGO});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757DEVOC_CATACODIGO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A746DEVOC_DESCRIPCION = T000X5_A746DEVOC_DESCRIPCION[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
      n746DEVOC_DESCRIPCION = T000X5_n746DEVOC_DESCRIPCION[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors0X53( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A102DEVOC_CONSECUTIVO )
   {
      /* Using cursor T000X7 */
      pr_default.execute(5, new Object[] {new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "DEVOC_CONSECUTIVO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDEVOC_CONSECUTIVO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A757DEVOC_CATACODIGO = T000X7_A757DEVOC_CATACODIGO[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
      n757DEVOC_CATACODIGO = T000X7_n757DEVOC_CATACODIGO[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A757DEVOC_CATACODIGO)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(5);
   }

   public void gxload_3( String A757DEVOC_CATACODIGO )
   {
      /* Using cursor T000X8 */
      pr_default.execute(6, new Object[] {new Boolean(n757DEVOC_CATACODIGO), A757DEVOC_CATACODIGO});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757DEVOC_CATACODIGO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A746DEVOC_DESCRIPCION = T000X8_A746DEVOC_DESCRIPCION[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
      n746DEVOC_DESCRIPCION = T000X8_n746DEVOC_DESCRIPCION[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A746DEVOC_DESCRIPCION)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void getKey0X53( )
   {
      /* Using cursor T000X9 */
      pr_default.execute(7, new Object[] {new Long(A95DEVOC_ID)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound53 = (short)(1) ;
      }
      else
      {
         RcdFound53 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000X3 */
      pr_default.execute(1, new Object[] {new Long(A95DEVOC_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0X53( 1) ;
         RcdFound53 = (short)(1) ;
         A95DEVOC_ID = T000X3_A95DEVOC_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
         A96DEVOC_REGIONAL = T000X3_A96DEVOC_REGIONAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96DEVOC_REGIONAL", GXutil.ltrim( GXutil.str( A96DEVOC_REGIONAL, 11, 0)));
         n96DEVOC_REGIONAL = T000X3_n96DEVOC_REGIONAL[0] ;
         A101DEVOC_TRAN_ID = T000X3_A101DEVOC_TRAN_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101DEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( A101DEVOC_TRAN_ID, 11, 0)));
         n101DEVOC_TRAN_ID = T000X3_n101DEVOC_TRAN_ID[0] ;
         A722DEVOC_TIPO_MOVIMIENTO = T000X3_A722DEVOC_TIPO_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
         n722DEVOC_TIPO_MOVIMIENTO = T000X3_n722DEVOC_TIPO_MOVIMIENTO[0] ;
         A100DEVOC_CODIGO_MOVIMIENTO = T000X3_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
         n100DEVOC_CODIGO_MOVIMIENTO = T000X3_n100DEVOC_CODIGO_MOVIMIENTO[0] ;
         A723DEVOC_TRAN_CC = T000X3_A723DEVOC_TRAN_CC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A723DEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( A723DEVOC_TRAN_CC, 18, 0)));
         n723DEVOC_TRAN_CC = T000X3_n723DEVOC_TRAN_CC[0] ;
         A103DEVOC_FECHA_MOVIMIENTO = T000X3_A103DEVOC_FECHA_MOVIMIENTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
         n103DEVOC_FECHA_MOVIMIENTO = T000X3_n103DEVOC_FECHA_MOVIMIENTO[0] ;
         A724DEVOC_RENGLON = T000X3_A724DEVOC_RENGLON[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724DEVOC_RENGLON", GXutil.ltrim( GXutil.str( A724DEVOC_RENGLON, 5, 0)));
         n724DEVOC_RENGLON = T000X3_n724DEVOC_RENGLON[0] ;
         A725DEVOC_PLACA = T000X3_A725DEVOC_PLACA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725DEVOC_PLACA", A725DEVOC_PLACA);
         n725DEVOC_PLACA = T000X3_n725DEVOC_PLACA[0] ;
         A726DEVOC_PLACA_PADRE = T000X3_A726DEVOC_PLACA_PADRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726DEVOC_PLACA_PADRE", A726DEVOC_PLACA_PADRE);
         n726DEVOC_PLACA_PADRE = T000X3_n726DEVOC_PLACA_PADRE[0] ;
         A727DEVOC_SERIAL = T000X3_A727DEVOC_SERIAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727DEVOC_SERIAL", A727DEVOC_SERIAL);
         n727DEVOC_SERIAL = T000X3_n727DEVOC_SERIAL[0] ;
         A728DEVOC_MARCA = T000X3_A728DEVOC_MARCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728DEVOC_MARCA", A728DEVOC_MARCA);
         n728DEVOC_MARCA = T000X3_n728DEVOC_MARCA[0] ;
         A729DEVOC_MARCA2 = T000X3_A729DEVOC_MARCA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729DEVOC_MARCA2", A729DEVOC_MARCA2);
         n729DEVOC_MARCA2 = T000X3_n729DEVOC_MARCA2[0] ;
         A730DEVOC_MODELO = T000X3_A730DEVOC_MODELO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730DEVOC_MODELO", A730DEVOC_MODELO);
         n730DEVOC_MODELO = T000X3_n730DEVOC_MODELO[0] ;
         A731DEVOC_VIDA_UTIL = T000X3_A731DEVOC_VIDA_UTIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731DEVOC_VIDA_UTIL", GXutil.ltrim( GXutil.str( A731DEVOC_VIDA_UTIL, 4, 0)));
         n731DEVOC_VIDA_UTIL = T000X3_n731DEVOC_VIDA_UTIL[0] ;
         A732DEVOC_VALOR_ADQUISICION = T000X3_A732DEVOC_VALOR_ADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( GXutil.str( A732DEVOC_VALOR_ADQUISICION, 18, 2)));
         n732DEVOC_VALOR_ADQUISICION = T000X3_n732DEVOC_VALOR_ADQUISICION[0] ;
         A733DEVOC_FECHA_ADQUISICION = T000X3_A733DEVOC_FECHA_ADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
         n733DEVOC_FECHA_ADQUISICION = T000X3_n733DEVOC_FECHA_ADQUISICION[0] ;
         A99DEVOC_ESTADO = T000X3_A99DEVOC_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
         n99DEVOC_ESTADO = T000X3_n99DEVOC_ESTADO[0] ;
         A97DEVOC_CENTRO_COSTO_ORIGEN = T000X3_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( GXutil.str( A97DEVOC_CENTRO_COSTO_ORIGEN, 11, 0)));
         n97DEVOC_CENTRO_COSTO_ORIGEN = T000X3_n97DEVOC_CENTRO_COSTO_ORIGEN[0] ;
         A734DEVOC_MODULO_ORIGEN = T000X3_A734DEVOC_MODULO_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734DEVOC_MODULO_ORIGEN", A734DEVOC_MODULO_ORIGEN);
         n734DEVOC_MODULO_ORIGEN = T000X3_n734DEVOC_MODULO_ORIGEN[0] ;
         A735DEVOC_ALMA_ORIGEN = T000X3_A735DEVOC_ALMA_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A735DEVOC_ALMA_ORIGEN", A735DEVOC_ALMA_ORIGEN);
         n735DEVOC_ALMA_ORIGEN = T000X3_n735DEVOC_ALMA_ORIGEN[0] ;
         A736DEVOC_BODEGA_ORIGEN = T000X3_A736DEVOC_BODEGA_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736DEVOC_BODEGA_ORIGEN", A736DEVOC_BODEGA_ORIGEN);
         n736DEVOC_BODEGA_ORIGEN = T000X3_n736DEVOC_BODEGA_ORIGEN[0] ;
         A98DEVOC_NIT_ORIGEN = T000X3_A98DEVOC_NIT_ORIGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98DEVOC_NIT_ORIGEN", GXutil.ltrim( GXutil.str( A98DEVOC_NIT_ORIGEN, 18, 0)));
         n98DEVOC_NIT_ORIGEN = T000X3_n98DEVOC_NIT_ORIGEN[0] ;
         A737DEVOC_REGIONAL_DESTINO = T000X3_A737DEVOC_REGIONAL_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( GXutil.str( A737DEVOC_REGIONAL_DESTINO, 11, 0)));
         n737DEVOC_REGIONAL_DESTINO = T000X3_n737DEVOC_REGIONAL_DESTINO[0] ;
         A738DEVOC_CENTRO_COSTO_DESTINO = T000X3_A738DEVOC_CENTRO_COSTO_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( GXutil.str( A738DEVOC_CENTRO_COSTO_DESTINO, 11, 0)));
         n738DEVOC_CENTRO_COSTO_DESTINO = T000X3_n738DEVOC_CENTRO_COSTO_DESTINO[0] ;
         A739DEVOC_MODULO_DESTINO = T000X3_A739DEVOC_MODULO_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739DEVOC_MODULO_DESTINO", A739DEVOC_MODULO_DESTINO);
         n739DEVOC_MODULO_DESTINO = T000X3_n739DEVOC_MODULO_DESTINO[0] ;
         A740DEVOC_ALMA_DESTINO = T000X3_A740DEVOC_ALMA_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740DEVOC_ALMA_DESTINO", A740DEVOC_ALMA_DESTINO);
         n740DEVOC_ALMA_DESTINO = T000X3_n740DEVOC_ALMA_DESTINO[0] ;
         A741DEVOC_BODEGA_DESTINO = T000X3_A741DEVOC_BODEGA_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A741DEVOC_BODEGA_DESTINO", A741DEVOC_BODEGA_DESTINO);
         n741DEVOC_BODEGA_DESTINO = T000X3_n741DEVOC_BODEGA_DESTINO[0] ;
         A742DEVOC_NIT_DESTINO = T000X3_A742DEVOC_NIT_DESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742DEVOC_NIT_DESTINO", GXutil.ltrim( GXutil.str( A742DEVOC_NIT_DESTINO, 18, 0)));
         n742DEVOC_NIT_DESTINO = T000X3_n742DEVOC_NIT_DESTINO[0] ;
         A743DEVOC_PROVEEDOR_ID = T000X3_A743DEVOC_PROVEEDOR_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743DEVOC_PROVEEDOR_ID", GXutil.ltrim( GXutil.str( A743DEVOC_PROVEEDOR_ID, 18, 0)));
         n743DEVOC_PROVEEDOR_ID = T000X3_n743DEVOC_PROVEEDOR_ID[0] ;
         A744DEVOC_FECHA_SERVICIO = T000X3_A744DEVOC_FECHA_SERVICIO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
         n744DEVOC_FECHA_SERVICIO = T000X3_n744DEVOC_FECHA_SERVICIO[0] ;
         A745DEVOC_ACTA_ENTREGA = T000X3_A745DEVOC_ACTA_ENTREGA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745DEVOC_ACTA_ENTREGA", GXutil.ltrim( GXutil.str( A745DEVOC_ACTA_ENTREGA, 5, 0)));
         n745DEVOC_ACTA_ENTREGA = T000X3_n745DEVOC_ACTA_ENTREGA[0] ;
         A748DEVOC_TRAN_OBSERVACIONES = T000X3_A748DEVOC_TRAN_OBSERVACIONES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A748DEVOC_TRAN_OBSERVACIONES", A748DEVOC_TRAN_OBSERVACIONES);
         n748DEVOC_TRAN_OBSERVACIONES = T000X3_n748DEVOC_TRAN_OBSERVACIONES[0] ;
         A749DEVOC_CURSO_ID = T000X3_A749DEVOC_CURSO_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A749DEVOC_CURSO_ID", A749DEVOC_CURSO_ID);
         n749DEVOC_CURSO_ID = T000X3_n749DEVOC_CURSO_ID[0] ;
         A750DEVOC_AREADANTE_ID = T000X3_A750DEVOC_AREADANTE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750DEVOC_AREADANTE_ID", A750DEVOC_AREADANTE_ID);
         n750DEVOC_AREADANTE_ID = T000X3_n750DEVOC_AREADANTE_ID[0] ;
         A751DEVOC_TIPO_INGRESO = T000X3_A751DEVOC_TIPO_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A751DEVOC_TIPO_INGRESO", GXutil.ltrim( GXutil.str( A751DEVOC_TIPO_INGRESO, 11, 0)));
         n751DEVOC_TIPO_INGRESO = T000X3_n751DEVOC_TIPO_INGRESO[0] ;
         A752DEVOC_NUMERO_INGRESO = T000X3_A752DEVOC_NUMERO_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A752DEVOC_NUMERO_INGRESO", A752DEVOC_NUMERO_INGRESO);
         n752DEVOC_NUMERO_INGRESO = T000X3_n752DEVOC_NUMERO_INGRESO[0] ;
         A753DEVOC_FECHA_INGRESO = T000X3_A753DEVOC_FECHA_INGRESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A753DEVOC_FECHA_INGRESO", GXutil.ltrim( GXutil.str( A753DEVOC_FECHA_INGRESO, 4, 0)));
         n753DEVOC_FECHA_INGRESO = T000X3_n753DEVOC_FECHA_INGRESO[0] ;
         A102DEVOC_CONSECUTIVO = T000X3_A102DEVOC_CONSECUTIVO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
         n102DEVOC_CONSECUTIVO = T000X3_n102DEVOC_CONSECUTIVO[0] ;
         Z95DEVOC_ID = A95DEVOC_ID ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0X53( ) ;
         if ( AnyError == 1 )
         {
            RcdFound53 = (short)(0) ;
            initializeNonKey0X53( ) ;
         }
         Gx_mode = sMode53 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound53 = (short)(0) ;
         initializeNonKey0X53( ) ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode53 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0X53( ) ;
      if ( RcdFound53 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound53 = (short)(0) ;
      /* Using cursor T000X10 */
      pr_default.execute(8, new Object[] {new Long(A95DEVOC_ID)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000X10_A95DEVOC_ID[0] < A95DEVOC_ID ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000X10_A95DEVOC_ID[0] > A95DEVOC_ID ) ) )
         {
            A95DEVOC_ID = T000X10_A95DEVOC_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
            RcdFound53 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound53 = (short)(0) ;
      /* Using cursor T000X11 */
      pr_default.execute(9, new Object[] {new Long(A95DEVOC_ID)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000X11_A95DEVOC_ID[0] > A95DEVOC_ID ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000X11_A95DEVOC_ID[0] < A95DEVOC_ID ) ) )
         {
            A95DEVOC_ID = T000X11_A95DEVOC_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
            RcdFound53 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0X53( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtDEVOC_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0X53( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound53 == 1 )
         {
            if ( A95DEVOC_ID != Z95DEVOC_ID )
            {
               A95DEVOC_ID = Z95DEVOC_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVOC_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDEVOC_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDEVOC_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0X53( ) ;
               GX_FocusControl = edtDEVOC_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A95DEVOC_ID != Z95DEVOC_ID )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDEVOC_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0X53( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVOC_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDEVOC_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtDEVOC_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0X53( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A95DEVOC_ID != Z95DEVOC_ID )
      {
         A95DEVOC_ID = Z95DEVOC_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVOC_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDEVOC_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDEVOC_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DEVOC_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDEVOC_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0X53( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0X53( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0X53( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound53 != 0 )
         {
            scanNext0X53( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0X53( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0X53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000X2 */
         pr_default.execute(0, new Object[] {new Long(A95DEVOC_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DEVO_HIST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z96DEVOC_REGIONAL != T000X2_A96DEVOC_REGIONAL[0] ) || ( Z101DEVOC_TRAN_ID != T000X2_A101DEVOC_TRAN_ID[0] ) || ( GXutil.strcmp(Z722DEVOC_TIPO_MOVIMIENTO, T000X2_A722DEVOC_TIPO_MOVIMIENTO[0]) != 0 ) || ( GXutil.strcmp(Z100DEVOC_CODIGO_MOVIMIENTO, T000X2_A100DEVOC_CODIGO_MOVIMIENTO[0]) != 0 ) || ( Z723DEVOC_TRAN_CC != T000X2_A723DEVOC_TRAN_CC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z103DEVOC_FECHA_MOVIMIENTO, T000X2_A103DEVOC_FECHA_MOVIMIENTO[0]) ) || ( Z724DEVOC_RENGLON != T000X2_A724DEVOC_RENGLON[0] ) || ( GXutil.strcmp(Z725DEVOC_PLACA, T000X2_A725DEVOC_PLACA[0]) != 0 ) || ( GXutil.strcmp(Z726DEVOC_PLACA_PADRE, T000X2_A726DEVOC_PLACA_PADRE[0]) != 0 ) || ( GXutil.strcmp(Z727DEVOC_SERIAL, T000X2_A727DEVOC_SERIAL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z728DEVOC_MARCA, T000X2_A728DEVOC_MARCA[0]) != 0 ) || ( GXutil.strcmp(Z729DEVOC_MARCA2, T000X2_A729DEVOC_MARCA2[0]) != 0 ) || ( GXutil.strcmp(Z730DEVOC_MODELO, T000X2_A730DEVOC_MODELO[0]) != 0 ) || ( Z731DEVOC_VIDA_UTIL != T000X2_A731DEVOC_VIDA_UTIL[0] ) || ( DecimalUtil.compareTo(Z732DEVOC_VALOR_ADQUISICION, T000X2_A732DEVOC_VALOR_ADQUISICION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z733DEVOC_FECHA_ADQUISICION, T000X2_A733DEVOC_FECHA_ADQUISICION[0]) ) || ( GXutil.strcmp(Z99DEVOC_ESTADO, T000X2_A99DEVOC_ESTADO[0]) != 0 ) || ( Z97DEVOC_CENTRO_COSTO_ORIGEN != T000X2_A97DEVOC_CENTRO_COSTO_ORIGEN[0] ) || ( GXutil.strcmp(Z734DEVOC_MODULO_ORIGEN, T000X2_A734DEVOC_MODULO_ORIGEN[0]) != 0 ) || ( GXutil.strcmp(Z735DEVOC_ALMA_ORIGEN, T000X2_A735DEVOC_ALMA_ORIGEN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z736DEVOC_BODEGA_ORIGEN, T000X2_A736DEVOC_BODEGA_ORIGEN[0]) != 0 ) || ( Z98DEVOC_NIT_ORIGEN != T000X2_A98DEVOC_NIT_ORIGEN[0] ) || ( Z737DEVOC_REGIONAL_DESTINO != T000X2_A737DEVOC_REGIONAL_DESTINO[0] ) || ( Z738DEVOC_CENTRO_COSTO_DESTINO != T000X2_A738DEVOC_CENTRO_COSTO_DESTINO[0] ) || ( GXutil.strcmp(Z739DEVOC_MODULO_DESTINO, T000X2_A739DEVOC_MODULO_DESTINO[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z740DEVOC_ALMA_DESTINO, T000X2_A740DEVOC_ALMA_DESTINO[0]) != 0 ) || ( GXutil.strcmp(Z741DEVOC_BODEGA_DESTINO, T000X2_A741DEVOC_BODEGA_DESTINO[0]) != 0 ) || ( Z742DEVOC_NIT_DESTINO != T000X2_A742DEVOC_NIT_DESTINO[0] ) || ( Z743DEVOC_PROVEEDOR_ID != T000X2_A743DEVOC_PROVEEDOR_ID[0] ) || !( GXutil.dateCompare(Z744DEVOC_FECHA_SERVICIO, T000X2_A744DEVOC_FECHA_SERVICIO[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z745DEVOC_ACTA_ENTREGA != T000X2_A745DEVOC_ACTA_ENTREGA[0] ) || ( GXutil.strcmp(Z748DEVOC_TRAN_OBSERVACIONES, T000X2_A748DEVOC_TRAN_OBSERVACIONES[0]) != 0 ) || ( GXutil.strcmp(Z749DEVOC_CURSO_ID, T000X2_A749DEVOC_CURSO_ID[0]) != 0 ) || ( GXutil.strcmp(Z750DEVOC_AREADANTE_ID, T000X2_A750DEVOC_AREADANTE_ID[0]) != 0 ) || ( Z751DEVOC_TIPO_INGRESO != T000X2_A751DEVOC_TIPO_INGRESO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z752DEVOC_NUMERO_INGRESO, T000X2_A752DEVOC_NUMERO_INGRESO[0]) != 0 ) || ( Z753DEVOC_FECHA_INGRESO != T000X2_A753DEVOC_FECHA_INGRESO[0] ) || ( GXutil.strcmp(Z102DEVOC_CONSECUTIVO, T000X2_A102DEVOC_CONSECUTIVO[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_DEVO_HIST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0X53( )
   {
      beforeValidate0X53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X53( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0X53( 0) ;
         checkOptimisticConcurrency0X53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X53( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0X53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000X12 */
                  pr_default.execute(10, new Object[] {new Boolean(n96DEVOC_REGIONAL), new Long(A96DEVOC_REGIONAL), new Boolean(n101DEVOC_TRAN_ID), new Long(A101DEVOC_TRAN_ID), new Boolean(n722DEVOC_TIPO_MOVIMIENTO), A722DEVOC_TIPO_MOVIMIENTO, new Boolean(n100DEVOC_CODIGO_MOVIMIENTO), A100DEVOC_CODIGO_MOVIMIENTO, new Boolean(n723DEVOC_TRAN_CC), new Long(A723DEVOC_TRAN_CC), new Boolean(n103DEVOC_FECHA_MOVIMIENTO), A103DEVOC_FECHA_MOVIMIENTO, new Boolean(n724DEVOC_RENGLON), new Integer(A724DEVOC_RENGLON), new Boolean(n725DEVOC_PLACA), A725DEVOC_PLACA, new Boolean(n726DEVOC_PLACA_PADRE), A726DEVOC_PLACA_PADRE, new Boolean(n727DEVOC_SERIAL), A727DEVOC_SERIAL, new Boolean(n728DEVOC_MARCA), A728DEVOC_MARCA, new Boolean(n729DEVOC_MARCA2), A729DEVOC_MARCA2, new Boolean(n730DEVOC_MODELO), A730DEVOC_MODELO, new Boolean(n731DEVOC_VIDA_UTIL), new Short(A731DEVOC_VIDA_UTIL), new Boolean(n732DEVOC_VALOR_ADQUISICION), A732DEVOC_VALOR_ADQUISICION, new Boolean(n733DEVOC_FECHA_ADQUISICION), A733DEVOC_FECHA_ADQUISICION, new Boolean(n99DEVOC_ESTADO), A99DEVOC_ESTADO, new Boolean(n97DEVOC_CENTRO_COSTO_ORIGEN), new Long(A97DEVOC_CENTRO_COSTO_ORIGEN), new Boolean(n734DEVOC_MODULO_ORIGEN), A734DEVOC_MODULO_ORIGEN, new Boolean(n735DEVOC_ALMA_ORIGEN), A735DEVOC_ALMA_ORIGEN, new Boolean(n736DEVOC_BODEGA_ORIGEN), A736DEVOC_BODEGA_ORIGEN, new Boolean(n98DEVOC_NIT_ORIGEN), new Long(A98DEVOC_NIT_ORIGEN), new Boolean(n737DEVOC_REGIONAL_DESTINO), new Long(A737DEVOC_REGIONAL_DESTINO), new Boolean(n738DEVOC_CENTRO_COSTO_DESTINO), new Long(A738DEVOC_CENTRO_COSTO_DESTINO), new Boolean(n739DEVOC_MODULO_DESTINO), A739DEVOC_MODULO_DESTINO, new Boolean(n740DEVOC_ALMA_DESTINO), A740DEVOC_ALMA_DESTINO, new Boolean(n741DEVOC_BODEGA_DESTINO), A741DEVOC_BODEGA_DESTINO, new Boolean(n742DEVOC_NIT_DESTINO), new Long(A742DEVOC_NIT_DESTINO), new Boolean(n743DEVOC_PROVEEDOR_ID), new Long(A743DEVOC_PROVEEDOR_ID), new Boolean(n744DEVOC_FECHA_SERVICIO), A744DEVOC_FECHA_SERVICIO, new Boolean(n745DEVOC_ACTA_ENTREGA), new Integer(A745DEVOC_ACTA_ENTREGA), new Boolean(n748DEVOC_TRAN_OBSERVACIONES), A748DEVOC_TRAN_OBSERVACIONES, new Boolean(n749DEVOC_CURSO_ID), A749DEVOC_CURSO_ID, new Boolean(n750DEVOC_AREADANTE_ID), A750DEVOC_AREADANTE_ID, new Boolean(n751DEVOC_TIPO_INGRESO), new Long(A751DEVOC_TIPO_INGRESO), new Boolean(n752DEVOC_NUMERO_INGRESO), A752DEVOC_NUMERO_INGRESO, new Boolean(n753DEVOC_FECHA_INGRESO), new Short(A753DEVOC_FECHA_INGRESO), new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000X13 */
                  pr_default.execute(11);
                  A95DEVOC_ID = T000X13_A95DEVOC_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
                  pr_default.close(11);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DEVO_HIST") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0X0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0X53( ) ;
         }
         endLevel0X53( ) ;
      }
      closeExtendedTableCursors0X53( ) ;
   }

   public void update0X53( )
   {
      beforeValidate0X53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X53( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X53( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0X53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000X14 */
                  pr_default.execute(12, new Object[] {new Boolean(n96DEVOC_REGIONAL), new Long(A96DEVOC_REGIONAL), new Boolean(n101DEVOC_TRAN_ID), new Long(A101DEVOC_TRAN_ID), new Boolean(n722DEVOC_TIPO_MOVIMIENTO), A722DEVOC_TIPO_MOVIMIENTO, new Boolean(n100DEVOC_CODIGO_MOVIMIENTO), A100DEVOC_CODIGO_MOVIMIENTO, new Boolean(n723DEVOC_TRAN_CC), new Long(A723DEVOC_TRAN_CC), new Boolean(n103DEVOC_FECHA_MOVIMIENTO), A103DEVOC_FECHA_MOVIMIENTO, new Boolean(n724DEVOC_RENGLON), new Integer(A724DEVOC_RENGLON), new Boolean(n725DEVOC_PLACA), A725DEVOC_PLACA, new Boolean(n726DEVOC_PLACA_PADRE), A726DEVOC_PLACA_PADRE, new Boolean(n727DEVOC_SERIAL), A727DEVOC_SERIAL, new Boolean(n728DEVOC_MARCA), A728DEVOC_MARCA, new Boolean(n729DEVOC_MARCA2), A729DEVOC_MARCA2, new Boolean(n730DEVOC_MODELO), A730DEVOC_MODELO, new Boolean(n731DEVOC_VIDA_UTIL), new Short(A731DEVOC_VIDA_UTIL), new Boolean(n732DEVOC_VALOR_ADQUISICION), A732DEVOC_VALOR_ADQUISICION, new Boolean(n733DEVOC_FECHA_ADQUISICION), A733DEVOC_FECHA_ADQUISICION, new Boolean(n99DEVOC_ESTADO), A99DEVOC_ESTADO, new Boolean(n97DEVOC_CENTRO_COSTO_ORIGEN), new Long(A97DEVOC_CENTRO_COSTO_ORIGEN), new Boolean(n734DEVOC_MODULO_ORIGEN), A734DEVOC_MODULO_ORIGEN, new Boolean(n735DEVOC_ALMA_ORIGEN), A735DEVOC_ALMA_ORIGEN, new Boolean(n736DEVOC_BODEGA_ORIGEN), A736DEVOC_BODEGA_ORIGEN, new Boolean(n98DEVOC_NIT_ORIGEN), new Long(A98DEVOC_NIT_ORIGEN), new Boolean(n737DEVOC_REGIONAL_DESTINO), new Long(A737DEVOC_REGIONAL_DESTINO), new Boolean(n738DEVOC_CENTRO_COSTO_DESTINO), new Long(A738DEVOC_CENTRO_COSTO_DESTINO), new Boolean(n739DEVOC_MODULO_DESTINO), A739DEVOC_MODULO_DESTINO, new Boolean(n740DEVOC_ALMA_DESTINO), A740DEVOC_ALMA_DESTINO, new Boolean(n741DEVOC_BODEGA_DESTINO), A741DEVOC_BODEGA_DESTINO, new Boolean(n742DEVOC_NIT_DESTINO), new Long(A742DEVOC_NIT_DESTINO), new Boolean(n743DEVOC_PROVEEDOR_ID), new Long(A743DEVOC_PROVEEDOR_ID), new Boolean(n744DEVOC_FECHA_SERVICIO), A744DEVOC_FECHA_SERVICIO, new Boolean(n745DEVOC_ACTA_ENTREGA), new Integer(A745DEVOC_ACTA_ENTREGA), new Boolean(n748DEVOC_TRAN_OBSERVACIONES), A748DEVOC_TRAN_OBSERVACIONES, new Boolean(n749DEVOC_CURSO_ID), A749DEVOC_CURSO_ID, new Boolean(n750DEVOC_AREADANTE_ID), A750DEVOC_AREADANTE_ID, new Boolean(n751DEVOC_TIPO_INGRESO), new Long(A751DEVOC_TIPO_INGRESO), new Boolean(n752DEVOC_NUMERO_INGRESO), A752DEVOC_NUMERO_INGRESO, new Boolean(n753DEVOC_FECHA_INGRESO), new Short(A753DEVOC_FECHA_INGRESO), new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO, new Long(A95DEVOC_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DEVO_HIST") ;
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DEVO_HIST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0X53( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption0X0( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0X53( ) ;
      }
      closeExtendedTableCursors0X53( ) ;
   }

   public void deferredUpdate0X53( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0X53( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X53( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0X53( ) ;
         afterConfirm0X53( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0X53( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000X15 */
               pr_default.execute(13, new Object[] {new Long(A95DEVOC_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DEVO_HIST") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound53 == 0 )
                     {
                        initAll0X53( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                     resetCaption0X0( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode53 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0X53( ) ;
      Gx_mode = sMode53 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0X53( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000X16 */
         pr_default.execute(14, new Object[] {new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO});
         A757DEVOC_CATACODIGO = T000X16_A757DEVOC_CATACODIGO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
         n757DEVOC_CATACODIGO = T000X16_n757DEVOC_CATACODIGO[0] ;
         pr_default.close(14);
         /* Using cursor T000X17 */
         pr_default.execute(15, new Object[] {new Boolean(n757DEVOC_CATACODIGO), A757DEVOC_CATACODIGO});
         A746DEVOC_DESCRIPCION = T000X17_A746DEVOC_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
         n746DEVOC_DESCRIPCION = T000X17_n746DEVOC_DESCRIPCION[0] ;
         pr_default.close(15);
      }
   }

   public void endLevel0X53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0X53( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_devo_hist");
         if ( AnyError == 0 )
         {
            confirmValues0X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_devo_hist");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0X53( )
   {
      /* Using cursor T000X18 */
      pr_default.execute(16);
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A95DEVOC_ID = T000X18_A95DEVOC_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0X53( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A95DEVOC_ID = T000X18_A95DEVOC_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
      }
   }

   public void scanEnd0X53( )
   {
      pr_default.close(16);
   }

   public void afterConfirm0X53( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0X53( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0X53( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0X53( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0X53( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0X53( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0X53( )
   {
      edtDEVOC_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_ID_Enabled, 5, 0)), true);
      edtDEVOC_REGIONAL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_REGIONAL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_REGIONAL_Enabled, 5, 0)), true);
      edtDEVOC_TRAN_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_TRAN_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_TRAN_ID_Enabled, 5, 0)), true);
      edtDEVOC_TIPO_MOVIMIENTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_TIPO_MOVIMIENTO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_TIPO_MOVIMIENTO_Enabled, 5, 0)), true);
      edtDEVOC_CODIGO_MOVIMIENTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CODIGO_MOVIMIENTO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CODIGO_MOVIMIENTO_Enabled, 5, 0)), true);
      edtDEVOC_TRAN_CC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_TRAN_CC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_TRAN_CC_Enabled, 5, 0)), true);
      edtDEVOC_FECHA_MOVIMIENTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_FECHA_MOVIMIENTO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_FECHA_MOVIMIENTO_Enabled, 5, 0)), true);
      edtDEVOC_RENGLON_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_RENGLON_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_RENGLON_Enabled, 5, 0)), true);
      edtDEVOC_CONSECUTIVO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CONSECUTIVO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CONSECUTIVO_Enabled, 5, 0)), true);
      edtDEVOC_CATACODIGO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CATACODIGO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CATACODIGO_Enabled, 5, 0)), true);
      edtDEVOC_DESCRIPCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_DESCRIPCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_DESCRIPCION_Enabled, 5, 0)), true);
      edtDEVOC_PLACA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_PLACA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_PLACA_Enabled, 5, 0)), true);
      edtDEVOC_PLACA_PADRE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_PLACA_PADRE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_PLACA_PADRE_Enabled, 5, 0)), true);
      edtDEVOC_SERIAL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_SERIAL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_SERIAL_Enabled, 5, 0)), true);
      edtDEVOC_MARCA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_MARCA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_MARCA_Enabled, 5, 0)), true);
      edtDEVOC_MARCA2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_MARCA2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_MARCA2_Enabled, 5, 0)), true);
      edtDEVOC_MODELO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_MODELO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_MODELO_Enabled, 5, 0)), true);
      edtDEVOC_VIDA_UTIL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_VIDA_UTIL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_VIDA_UTIL_Enabled, 5, 0)), true);
      edtDEVOC_VALOR_ADQUISICION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_VALOR_ADQUISICION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_VALOR_ADQUISICION_Enabled, 5, 0)), true);
      edtDEVOC_FECHA_ADQUISICION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_FECHA_ADQUISICION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_FECHA_ADQUISICION_Enabled, 5, 0)), true);
      cmbDEVOC_ESTADO.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDEVOC_ESTADO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbDEVOC_ESTADO.getEnabled(), 5, 0)), true);
      edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled, 5, 0)), true);
      edtDEVOC_MODULO_ORIGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_MODULO_ORIGEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_MODULO_ORIGEN_Enabled, 5, 0)), true);
      edtDEVOC_ALMA_ORIGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_ALMA_ORIGEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_ALMA_ORIGEN_Enabled, 5, 0)), true);
      edtDEVOC_BODEGA_ORIGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_BODEGA_ORIGEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_BODEGA_ORIGEN_Enabled, 5, 0)), true);
      edtDEVOC_NIT_ORIGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_NIT_ORIGEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_NIT_ORIGEN_Enabled, 5, 0)), true);
      edtDEVOC_REGIONAL_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_REGIONAL_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_REGIONAL_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_CENTRO_COSTO_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CENTRO_COSTO_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CENTRO_COSTO_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_MODULO_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_MODULO_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_MODULO_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_ALMA_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_ALMA_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_ALMA_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_BODEGA_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_BODEGA_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_BODEGA_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_NIT_DESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_NIT_DESTINO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_NIT_DESTINO_Enabled, 5, 0)), true);
      edtDEVOC_PROVEEDOR_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_PROVEEDOR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_PROVEEDOR_ID_Enabled, 5, 0)), true);
      edtDEVOC_FECHA_SERVICIO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_FECHA_SERVICIO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_FECHA_SERVICIO_Enabled, 5, 0)), true);
      edtDEVOC_ACTA_ENTREGA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_ACTA_ENTREGA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_ACTA_ENTREGA_Enabled, 5, 0)), true);
      edtDEVOC_TRAN_OBSERVACIONES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_TRAN_OBSERVACIONES_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_TRAN_OBSERVACIONES_Enabled, 5, 0)), true);
      edtDEVOC_CURSO_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_CURSO_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_CURSO_ID_Enabled, 5, 0)), true);
      edtDEVOC_AREADANTE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_AREADANTE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_AREADANTE_ID_Enabled, 5, 0)), true);
      edtDEVOC_TIPO_INGRESO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_TIPO_INGRESO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_TIPO_INGRESO_Enabled, 5, 0)), true);
      edtDEVOC_NUMERO_INGRESO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_NUMERO_INGRESO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_NUMERO_INGRESO_Enabled, 5, 0)), true);
      edtDEVOC_FECHA_INGRESO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_FECHA_INGRESO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDEVOC_FECHA_INGRESO_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0X0( )
   {
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
      MasterPageObj.master_styles();
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416581");
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
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_devo_hist") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z95DEVOC_ID", GXutil.ltrim( localUtil.ntoc( Z95DEVOC_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z96DEVOC_REGIONAL", GXutil.ltrim( localUtil.ntoc( Z96DEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z101DEVOC_TRAN_ID", GXutil.ltrim( localUtil.ntoc( Z101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z722DEVOC_TIPO_MOVIMIENTO", Z722DEVOC_TIPO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z100DEVOC_CODIGO_MOVIMIENTO", Z100DEVOC_CODIGO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z723DEVOC_TRAN_CC", GXutil.ltrim( localUtil.ntoc( Z723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z103DEVOC_FECHA_MOVIMIENTO", localUtil.dtoc( Z103DEVOC_FECHA_MOVIMIENTO, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z724DEVOC_RENGLON", GXutil.ltrim( localUtil.ntoc( Z724DEVOC_RENGLON, (byte)(5), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z725DEVOC_PLACA", Z725DEVOC_PLACA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z726DEVOC_PLACA_PADRE", Z726DEVOC_PLACA_PADRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z727DEVOC_SERIAL", Z727DEVOC_SERIAL);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z728DEVOC_MARCA", Z728DEVOC_MARCA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z729DEVOC_MARCA2", Z729DEVOC_MARCA2);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z730DEVOC_MODELO", Z730DEVOC_MODELO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z731DEVOC_VIDA_UTIL", GXutil.ltrim( localUtil.ntoc( Z731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( localUtil.ntoc( Z732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z733DEVOC_FECHA_ADQUISICION", localUtil.dtoc( Z733DEVOC_FECHA_ADQUISICION, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z99DEVOC_ESTADO", Z99DEVOC_ESTADO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( localUtil.ntoc( Z97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z734DEVOC_MODULO_ORIGEN", Z734DEVOC_MODULO_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z735DEVOC_ALMA_ORIGEN", Z735DEVOC_ALMA_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z736DEVOC_BODEGA_ORIGEN", Z736DEVOC_BODEGA_ORIGEN);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z98DEVOC_NIT_ORIGEN", GXutil.ltrim( localUtil.ntoc( Z98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( localUtil.ntoc( Z737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( localUtil.ntoc( Z738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z739DEVOC_MODULO_DESTINO", Z739DEVOC_MODULO_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z740DEVOC_ALMA_DESTINO", Z740DEVOC_ALMA_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z741DEVOC_BODEGA_DESTINO", Z741DEVOC_BODEGA_DESTINO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z742DEVOC_NIT_DESTINO", GXutil.ltrim( localUtil.ntoc( Z742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z743DEVOC_PROVEEDOR_ID", GXutil.ltrim( localUtil.ntoc( Z743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z744DEVOC_FECHA_SERVICIO", localUtil.dtoc( Z744DEVOC_FECHA_SERVICIO, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z745DEVOC_ACTA_ENTREGA", GXutil.ltrim( localUtil.ntoc( Z745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z748DEVOC_TRAN_OBSERVACIONES", Z748DEVOC_TRAN_OBSERVACIONES);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z749DEVOC_CURSO_ID", Z749DEVOC_CURSO_ID);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z750DEVOC_AREADANTE_ID", Z750DEVOC_AREADANTE_ID);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z751DEVOC_TIPO_INGRESO", GXutil.ltrim( localUtil.ntoc( Z751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z752DEVOC_NUMERO_INGRESO", Z752DEVOC_NUMERO_INGRESO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z753DEVOC_FECHA_INGRESO", GXutil.ltrim( localUtil.ntoc( Z753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z102DEVOC_CONSECUTIVO", Z102DEVOC_CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("com.orions2.alm_devo_hist")  ;
   }

   public String getPgmname( )
   {
      return "ALM_DEVO_HIST" ;
   }

   public String getPgmdesc( )
   {
      return "HISTORIAL DEVOLUTIVOS" ;
   }

   public void initializeNonKey0X53( )
   {
      A96DEVOC_REGIONAL = 0 ;
      n96DEVOC_REGIONAL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96DEVOC_REGIONAL", GXutil.ltrim( GXutil.str( A96DEVOC_REGIONAL, 11, 0)));
      n96DEVOC_REGIONAL = ((0==A96DEVOC_REGIONAL) ? true : false) ;
      A101DEVOC_TRAN_ID = 0 ;
      n101DEVOC_TRAN_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A101DEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( A101DEVOC_TRAN_ID, 11, 0)));
      n101DEVOC_TRAN_ID = ((0==A101DEVOC_TRAN_ID) ? true : false) ;
      A722DEVOC_TIPO_MOVIMIENTO = "" ;
      n722DEVOC_TIPO_MOVIMIENTO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A722DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
      n722DEVOC_TIPO_MOVIMIENTO = ((GXutil.strcmp("", A722DEVOC_TIPO_MOVIMIENTO)==0) ? true : false) ;
      A100DEVOC_CODIGO_MOVIMIENTO = "" ;
      n100DEVOC_CODIGO_MOVIMIENTO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A100DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
      n100DEVOC_CODIGO_MOVIMIENTO = ((GXutil.strcmp("", A100DEVOC_CODIGO_MOVIMIENTO)==0) ? true : false) ;
      A723DEVOC_TRAN_CC = 0 ;
      n723DEVOC_TRAN_CC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A723DEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( A723DEVOC_TRAN_CC, 18, 0)));
      n723DEVOC_TRAN_CC = ((0==A723DEVOC_TRAN_CC) ? true : false) ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      n103DEVOC_FECHA_MOVIMIENTO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A103DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
      n103DEVOC_FECHA_MOVIMIENTO = (GXutil.dateCompare(GXutil.nullDate(), A103DEVOC_FECHA_MOVIMIENTO) ? true : false) ;
      A724DEVOC_RENGLON = 0 ;
      n724DEVOC_RENGLON = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A724DEVOC_RENGLON", GXutil.ltrim( GXutil.str( A724DEVOC_RENGLON, 5, 0)));
      n724DEVOC_RENGLON = ((0==A724DEVOC_RENGLON) ? true : false) ;
      A102DEVOC_CONSECUTIVO = "" ;
      n102DEVOC_CONSECUTIVO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A102DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
      n102DEVOC_CONSECUTIVO = ((GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ? true : false) ;
      A757DEVOC_CATACODIGO = "" ;
      n757DEVOC_CATACODIGO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A757DEVOC_CATACODIGO", A757DEVOC_CATACODIGO);
      A746DEVOC_DESCRIPCION = "" ;
      n746DEVOC_DESCRIPCION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A746DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
      A725DEVOC_PLACA = "" ;
      n725DEVOC_PLACA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A725DEVOC_PLACA", A725DEVOC_PLACA);
      n725DEVOC_PLACA = ((GXutil.strcmp("", A725DEVOC_PLACA)==0) ? true : false) ;
      A726DEVOC_PLACA_PADRE = "" ;
      n726DEVOC_PLACA_PADRE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A726DEVOC_PLACA_PADRE", A726DEVOC_PLACA_PADRE);
      n726DEVOC_PLACA_PADRE = ((GXutil.strcmp("", A726DEVOC_PLACA_PADRE)==0) ? true : false) ;
      A727DEVOC_SERIAL = "" ;
      n727DEVOC_SERIAL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A727DEVOC_SERIAL", A727DEVOC_SERIAL);
      n727DEVOC_SERIAL = ((GXutil.strcmp("", A727DEVOC_SERIAL)==0) ? true : false) ;
      A728DEVOC_MARCA = "" ;
      n728DEVOC_MARCA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A728DEVOC_MARCA", A728DEVOC_MARCA);
      n728DEVOC_MARCA = ((GXutil.strcmp("", A728DEVOC_MARCA)==0) ? true : false) ;
      A729DEVOC_MARCA2 = "" ;
      n729DEVOC_MARCA2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A729DEVOC_MARCA2", A729DEVOC_MARCA2);
      n729DEVOC_MARCA2 = ((GXutil.strcmp("", A729DEVOC_MARCA2)==0) ? true : false) ;
      A730DEVOC_MODELO = "" ;
      n730DEVOC_MODELO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A730DEVOC_MODELO", A730DEVOC_MODELO);
      n730DEVOC_MODELO = ((GXutil.strcmp("", A730DEVOC_MODELO)==0) ? true : false) ;
      A731DEVOC_VIDA_UTIL = (short)(0) ;
      n731DEVOC_VIDA_UTIL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A731DEVOC_VIDA_UTIL", GXutil.ltrim( GXutil.str( A731DEVOC_VIDA_UTIL, 4, 0)));
      n731DEVOC_VIDA_UTIL = ((0==A731DEVOC_VIDA_UTIL) ? true : false) ;
      A732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      n732DEVOC_VALOR_ADQUISICION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A732DEVOC_VALOR_ADQUISICION", GXutil.ltrim( GXutil.str( A732DEVOC_VALOR_ADQUISICION, 18, 2)));
      n732DEVOC_VALOR_ADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A732DEVOC_VALOR_ADQUISICION)==0) ? true : false) ;
      A733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
      n733DEVOC_FECHA_ADQUISICION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A733DEVOC_FECHA_ADQUISICION", localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
      n733DEVOC_FECHA_ADQUISICION = (GXutil.dateCompare(GXutil.nullDate(), A733DEVOC_FECHA_ADQUISICION) ? true : false) ;
      A99DEVOC_ESTADO = "" ;
      n99DEVOC_ESTADO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A99DEVOC_ESTADO", A99DEVOC_ESTADO);
      n99DEVOC_ESTADO = ((GXutil.strcmp("", A99DEVOC_ESTADO)==0) ? true : false) ;
      A97DEVOC_CENTRO_COSTO_ORIGEN = 0 ;
      n97DEVOC_CENTRO_COSTO_ORIGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97DEVOC_CENTRO_COSTO_ORIGEN", GXutil.ltrim( GXutil.str( A97DEVOC_CENTRO_COSTO_ORIGEN, 11, 0)));
      n97DEVOC_CENTRO_COSTO_ORIGEN = ((0==A97DEVOC_CENTRO_COSTO_ORIGEN) ? true : false) ;
      A734DEVOC_MODULO_ORIGEN = "" ;
      n734DEVOC_MODULO_ORIGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A734DEVOC_MODULO_ORIGEN", A734DEVOC_MODULO_ORIGEN);
      n734DEVOC_MODULO_ORIGEN = ((GXutil.strcmp("", A734DEVOC_MODULO_ORIGEN)==0) ? true : false) ;
      A735DEVOC_ALMA_ORIGEN = "" ;
      n735DEVOC_ALMA_ORIGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A735DEVOC_ALMA_ORIGEN", A735DEVOC_ALMA_ORIGEN);
      n735DEVOC_ALMA_ORIGEN = ((GXutil.strcmp("", A735DEVOC_ALMA_ORIGEN)==0) ? true : false) ;
      A736DEVOC_BODEGA_ORIGEN = "" ;
      n736DEVOC_BODEGA_ORIGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A736DEVOC_BODEGA_ORIGEN", A736DEVOC_BODEGA_ORIGEN);
      n736DEVOC_BODEGA_ORIGEN = ((GXutil.strcmp("", A736DEVOC_BODEGA_ORIGEN)==0) ? true : false) ;
      A98DEVOC_NIT_ORIGEN = 0 ;
      n98DEVOC_NIT_ORIGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A98DEVOC_NIT_ORIGEN", GXutil.ltrim( GXutil.str( A98DEVOC_NIT_ORIGEN, 18, 0)));
      n98DEVOC_NIT_ORIGEN = ((0==A98DEVOC_NIT_ORIGEN) ? true : false) ;
      A737DEVOC_REGIONAL_DESTINO = 0 ;
      n737DEVOC_REGIONAL_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A737DEVOC_REGIONAL_DESTINO", GXutil.ltrim( GXutil.str( A737DEVOC_REGIONAL_DESTINO, 11, 0)));
      n737DEVOC_REGIONAL_DESTINO = ((0==A737DEVOC_REGIONAL_DESTINO) ? true : false) ;
      A738DEVOC_CENTRO_COSTO_DESTINO = 0 ;
      n738DEVOC_CENTRO_COSTO_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A738DEVOC_CENTRO_COSTO_DESTINO", GXutil.ltrim( GXutil.str( A738DEVOC_CENTRO_COSTO_DESTINO, 11, 0)));
      n738DEVOC_CENTRO_COSTO_DESTINO = ((0==A738DEVOC_CENTRO_COSTO_DESTINO) ? true : false) ;
      A739DEVOC_MODULO_DESTINO = "" ;
      n739DEVOC_MODULO_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A739DEVOC_MODULO_DESTINO", A739DEVOC_MODULO_DESTINO);
      n739DEVOC_MODULO_DESTINO = ((GXutil.strcmp("", A739DEVOC_MODULO_DESTINO)==0) ? true : false) ;
      A740DEVOC_ALMA_DESTINO = "" ;
      n740DEVOC_ALMA_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A740DEVOC_ALMA_DESTINO", A740DEVOC_ALMA_DESTINO);
      n740DEVOC_ALMA_DESTINO = ((GXutil.strcmp("", A740DEVOC_ALMA_DESTINO)==0) ? true : false) ;
      A741DEVOC_BODEGA_DESTINO = "" ;
      n741DEVOC_BODEGA_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A741DEVOC_BODEGA_DESTINO", A741DEVOC_BODEGA_DESTINO);
      n741DEVOC_BODEGA_DESTINO = ((GXutil.strcmp("", A741DEVOC_BODEGA_DESTINO)==0) ? true : false) ;
      A742DEVOC_NIT_DESTINO = 0 ;
      n742DEVOC_NIT_DESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A742DEVOC_NIT_DESTINO", GXutil.ltrim( GXutil.str( A742DEVOC_NIT_DESTINO, 18, 0)));
      n742DEVOC_NIT_DESTINO = ((0==A742DEVOC_NIT_DESTINO) ? true : false) ;
      A743DEVOC_PROVEEDOR_ID = 0 ;
      n743DEVOC_PROVEEDOR_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A743DEVOC_PROVEEDOR_ID", GXutil.ltrim( GXutil.str( A743DEVOC_PROVEEDOR_ID, 18, 0)));
      n743DEVOC_PROVEEDOR_ID = ((0==A743DEVOC_PROVEEDOR_ID) ? true : false) ;
      A744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
      n744DEVOC_FECHA_SERVICIO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A744DEVOC_FECHA_SERVICIO", localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
      n744DEVOC_FECHA_SERVICIO = (GXutil.dateCompare(GXutil.nullDate(), A744DEVOC_FECHA_SERVICIO) ? true : false) ;
      A745DEVOC_ACTA_ENTREGA = 0 ;
      n745DEVOC_ACTA_ENTREGA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A745DEVOC_ACTA_ENTREGA", GXutil.ltrim( GXutil.str( A745DEVOC_ACTA_ENTREGA, 5, 0)));
      n745DEVOC_ACTA_ENTREGA = ((0==A745DEVOC_ACTA_ENTREGA) ? true : false) ;
      A748DEVOC_TRAN_OBSERVACIONES = "" ;
      n748DEVOC_TRAN_OBSERVACIONES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A748DEVOC_TRAN_OBSERVACIONES", A748DEVOC_TRAN_OBSERVACIONES);
      n748DEVOC_TRAN_OBSERVACIONES = ((GXutil.strcmp("", A748DEVOC_TRAN_OBSERVACIONES)==0) ? true : false) ;
      A749DEVOC_CURSO_ID = "" ;
      n749DEVOC_CURSO_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A749DEVOC_CURSO_ID", A749DEVOC_CURSO_ID);
      n749DEVOC_CURSO_ID = ((GXutil.strcmp("", A749DEVOC_CURSO_ID)==0) ? true : false) ;
      A750DEVOC_AREADANTE_ID = "" ;
      n750DEVOC_AREADANTE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A750DEVOC_AREADANTE_ID", A750DEVOC_AREADANTE_ID);
      n750DEVOC_AREADANTE_ID = ((GXutil.strcmp("", A750DEVOC_AREADANTE_ID)==0) ? true : false) ;
      A751DEVOC_TIPO_INGRESO = 0 ;
      n751DEVOC_TIPO_INGRESO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A751DEVOC_TIPO_INGRESO", GXutil.ltrim( GXutil.str( A751DEVOC_TIPO_INGRESO, 11, 0)));
      n751DEVOC_TIPO_INGRESO = ((0==A751DEVOC_TIPO_INGRESO) ? true : false) ;
      A752DEVOC_NUMERO_INGRESO = "" ;
      n752DEVOC_NUMERO_INGRESO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A752DEVOC_NUMERO_INGRESO", A752DEVOC_NUMERO_INGRESO);
      n752DEVOC_NUMERO_INGRESO = ((GXutil.strcmp("", A752DEVOC_NUMERO_INGRESO)==0) ? true : false) ;
      A753DEVOC_FECHA_INGRESO = (short)(0) ;
      n753DEVOC_FECHA_INGRESO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A753DEVOC_FECHA_INGRESO", GXutil.ltrim( GXutil.str( A753DEVOC_FECHA_INGRESO, 4, 0)));
      n753DEVOC_FECHA_INGRESO = ((0==A753DEVOC_FECHA_INGRESO) ? true : false) ;
      Z96DEVOC_REGIONAL = 0 ;
      Z101DEVOC_TRAN_ID = 0 ;
      Z722DEVOC_TIPO_MOVIMIENTO = "" ;
      Z100DEVOC_CODIGO_MOVIMIENTO = "" ;
      Z723DEVOC_TRAN_CC = 0 ;
      Z103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      Z724DEVOC_RENGLON = 0 ;
      Z725DEVOC_PLACA = "" ;
      Z726DEVOC_PLACA_PADRE = "" ;
      Z727DEVOC_SERIAL = "" ;
      Z728DEVOC_MARCA = "" ;
      Z729DEVOC_MARCA2 = "" ;
      Z730DEVOC_MODELO = "" ;
      Z731DEVOC_VIDA_UTIL = (short)(0) ;
      Z732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      Z733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
      Z99DEVOC_ESTADO = "" ;
      Z97DEVOC_CENTRO_COSTO_ORIGEN = 0 ;
      Z734DEVOC_MODULO_ORIGEN = "" ;
      Z735DEVOC_ALMA_ORIGEN = "" ;
      Z736DEVOC_BODEGA_ORIGEN = "" ;
      Z98DEVOC_NIT_ORIGEN = 0 ;
      Z737DEVOC_REGIONAL_DESTINO = 0 ;
      Z738DEVOC_CENTRO_COSTO_DESTINO = 0 ;
      Z739DEVOC_MODULO_DESTINO = "" ;
      Z740DEVOC_ALMA_DESTINO = "" ;
      Z741DEVOC_BODEGA_DESTINO = "" ;
      Z742DEVOC_NIT_DESTINO = 0 ;
      Z743DEVOC_PROVEEDOR_ID = 0 ;
      Z744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
      Z745DEVOC_ACTA_ENTREGA = 0 ;
      Z748DEVOC_TRAN_OBSERVACIONES = "" ;
      Z749DEVOC_CURSO_ID = "" ;
      Z750DEVOC_AREADANTE_ID = "" ;
      Z751DEVOC_TIPO_INGRESO = 0 ;
      Z752DEVOC_NUMERO_INGRESO = "" ;
      Z753DEVOC_FECHA_INGRESO = (short)(0) ;
      Z102DEVOC_CONSECUTIVO = "" ;
   }

   public void initAll0X53( )
   {
      A95DEVOC_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A95DEVOC_ID", GXutil.ltrim( GXutil.str( A95DEVOC_ID, 11, 0)));
      initializeNonKey0X53( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414165825");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_devo_hist.js", "?201861414165825");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtDEVOC_ID_Internalname = "DEVOC_ID" ;
      edtDEVOC_REGIONAL_Internalname = "DEVOC_REGIONAL" ;
      edtDEVOC_TRAN_ID_Internalname = "DEVOC_TRAN_ID" ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = "DEVOC_TIPO_MOVIMIENTO" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = "DEVOC_CODIGO_MOVIMIENTO" ;
      edtDEVOC_TRAN_CC_Internalname = "DEVOC_TRAN_CC" ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = "DEVOC_FECHA_MOVIMIENTO" ;
      edtDEVOC_RENGLON_Internalname = "DEVOC_RENGLON" ;
      edtDEVOC_CONSECUTIVO_Internalname = "DEVOC_CONSECUTIVO" ;
      edtDEVOC_CATACODIGO_Internalname = "DEVOC_CATACODIGO" ;
      edtDEVOC_DESCRIPCION_Internalname = "DEVOC_DESCRIPCION" ;
      edtDEVOC_PLACA_Internalname = "DEVOC_PLACA" ;
      edtDEVOC_PLACA_PADRE_Internalname = "DEVOC_PLACA_PADRE" ;
      edtDEVOC_SERIAL_Internalname = "DEVOC_SERIAL" ;
      edtDEVOC_MARCA_Internalname = "DEVOC_MARCA" ;
      edtDEVOC_MARCA2_Internalname = "DEVOC_MARCA2" ;
      edtDEVOC_MODELO_Internalname = "DEVOC_MODELO" ;
      edtDEVOC_VIDA_UTIL_Internalname = "DEVOC_VIDA_UTIL" ;
      edtDEVOC_VALOR_ADQUISICION_Internalname = "DEVOC_VALOR_ADQUISICION" ;
      edtDEVOC_FECHA_ADQUISICION_Internalname = "DEVOC_FECHA_ADQUISICION" ;
      cmbDEVOC_ESTADO.setInternalname( "DEVOC_ESTADO" );
      edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname = "DEVOC_CENTRO_COSTO_ORIGEN" ;
      edtDEVOC_MODULO_ORIGEN_Internalname = "DEVOC_MODULO_ORIGEN" ;
      edtDEVOC_ALMA_ORIGEN_Internalname = "DEVOC_ALMA_ORIGEN" ;
      edtDEVOC_BODEGA_ORIGEN_Internalname = "DEVOC_BODEGA_ORIGEN" ;
      edtDEVOC_NIT_ORIGEN_Internalname = "DEVOC_NIT_ORIGEN" ;
      edtDEVOC_REGIONAL_DESTINO_Internalname = "DEVOC_REGIONAL_DESTINO" ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Internalname = "DEVOC_CENTRO_COSTO_DESTINO" ;
      edtDEVOC_MODULO_DESTINO_Internalname = "DEVOC_MODULO_DESTINO" ;
      edtDEVOC_ALMA_DESTINO_Internalname = "DEVOC_ALMA_DESTINO" ;
      edtDEVOC_BODEGA_DESTINO_Internalname = "DEVOC_BODEGA_DESTINO" ;
      edtDEVOC_NIT_DESTINO_Internalname = "DEVOC_NIT_DESTINO" ;
      edtDEVOC_PROVEEDOR_ID_Internalname = "DEVOC_PROVEEDOR_ID" ;
      edtDEVOC_FECHA_SERVICIO_Internalname = "DEVOC_FECHA_SERVICIO" ;
      edtDEVOC_ACTA_ENTREGA_Internalname = "DEVOC_ACTA_ENTREGA" ;
      edtDEVOC_TRAN_OBSERVACIONES_Internalname = "DEVOC_TRAN_OBSERVACIONES" ;
      edtDEVOC_CURSO_ID_Internalname = "DEVOC_CURSO_ID" ;
      edtDEVOC_AREADANTE_ID_Internalname = "DEVOC_AREADANTE_ID" ;
      edtDEVOC_TIPO_INGRESO_Internalname = "DEVOC_TIPO_INGRESO" ;
      edtDEVOC_NUMERO_INGRESO_Internalname = "DEVOC_NUMERO_INGRESO" ;
      edtDEVOC_FECHA_INGRESO_Internalname = "DEVOC_FECHA_INGRESO" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_102_Internalname = "PROMPT_102" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "HISTORIAL DEVOLUTIVOS" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDEVOC_FECHA_INGRESO_Jsonclick = "" ;
      edtDEVOC_FECHA_INGRESO_Enabled = 1 ;
      edtDEVOC_NUMERO_INGRESO_Jsonclick = "" ;
      edtDEVOC_NUMERO_INGRESO_Enabled = 1 ;
      edtDEVOC_TIPO_INGRESO_Jsonclick = "" ;
      edtDEVOC_TIPO_INGRESO_Enabled = 1 ;
      edtDEVOC_AREADANTE_ID_Jsonclick = "" ;
      edtDEVOC_AREADANTE_ID_Enabled = 1 ;
      edtDEVOC_CURSO_ID_Jsonclick = "" ;
      edtDEVOC_CURSO_ID_Enabled = 1 ;
      edtDEVOC_TRAN_OBSERVACIONES_Jsonclick = "" ;
      edtDEVOC_TRAN_OBSERVACIONES_Enabled = 1 ;
      edtDEVOC_ACTA_ENTREGA_Jsonclick = "" ;
      edtDEVOC_ACTA_ENTREGA_Enabled = 1 ;
      edtDEVOC_FECHA_SERVICIO_Jsonclick = "" ;
      edtDEVOC_FECHA_SERVICIO_Enabled = 1 ;
      edtDEVOC_PROVEEDOR_ID_Jsonclick = "" ;
      edtDEVOC_PROVEEDOR_ID_Enabled = 1 ;
      edtDEVOC_NIT_DESTINO_Jsonclick = "" ;
      edtDEVOC_NIT_DESTINO_Enabled = 1 ;
      edtDEVOC_BODEGA_DESTINO_Jsonclick = "" ;
      edtDEVOC_BODEGA_DESTINO_Enabled = 1 ;
      edtDEVOC_ALMA_DESTINO_Jsonclick = "" ;
      edtDEVOC_ALMA_DESTINO_Enabled = 1 ;
      edtDEVOC_MODULO_DESTINO_Jsonclick = "" ;
      edtDEVOC_MODULO_DESTINO_Enabled = 1 ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick = "" ;
      edtDEVOC_CENTRO_COSTO_DESTINO_Enabled = 1 ;
      edtDEVOC_REGIONAL_DESTINO_Jsonclick = "" ;
      edtDEVOC_REGIONAL_DESTINO_Enabled = 1 ;
      edtDEVOC_NIT_ORIGEN_Jsonclick = "" ;
      edtDEVOC_NIT_ORIGEN_Enabled = 1 ;
      edtDEVOC_BODEGA_ORIGEN_Jsonclick = "" ;
      edtDEVOC_BODEGA_ORIGEN_Enabled = 1 ;
      edtDEVOC_ALMA_ORIGEN_Jsonclick = "" ;
      edtDEVOC_ALMA_ORIGEN_Enabled = 1 ;
      edtDEVOC_MODULO_ORIGEN_Jsonclick = "" ;
      edtDEVOC_MODULO_ORIGEN_Enabled = 1 ;
      edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick = "" ;
      edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled = 1 ;
      cmbDEVOC_ESTADO.setJsonclick( "" );
      cmbDEVOC_ESTADO.setEnabled( 1 );
      edtDEVOC_FECHA_ADQUISICION_Jsonclick = "" ;
      edtDEVOC_FECHA_ADQUISICION_Enabled = 1 ;
      edtDEVOC_VALOR_ADQUISICION_Jsonclick = "" ;
      edtDEVOC_VALOR_ADQUISICION_Enabled = 1 ;
      edtDEVOC_VIDA_UTIL_Jsonclick = "" ;
      edtDEVOC_VIDA_UTIL_Enabled = 1 ;
      edtDEVOC_MODELO_Enabled = 1 ;
      edtDEVOC_MARCA2_Enabled = 1 ;
      edtDEVOC_MARCA_Enabled = 1 ;
      edtDEVOC_SERIAL_Enabled = 1 ;
      edtDEVOC_PLACA_PADRE_Jsonclick = "" ;
      edtDEVOC_PLACA_PADRE_Enabled = 1 ;
      edtDEVOC_PLACA_Jsonclick = "" ;
      edtDEVOC_PLACA_Enabled = 1 ;
      edtDEVOC_DESCRIPCION_Enabled = 0 ;
      edtDEVOC_CATACODIGO_Jsonclick = "" ;
      edtDEVOC_CATACODIGO_Enabled = 0 ;
      imgprompt_102_Visible = 1 ;
      imgprompt_102_Link = "" ;
      edtDEVOC_CONSECUTIVO_Jsonclick = "" ;
      edtDEVOC_CONSECUTIVO_Enabled = 1 ;
      edtDEVOC_RENGLON_Jsonclick = "" ;
      edtDEVOC_RENGLON_Enabled = 1 ;
      edtDEVOC_FECHA_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_FECHA_MOVIMIENTO_Enabled = 1 ;
      edtDEVOC_TRAN_CC_Jsonclick = "" ;
      edtDEVOC_TRAN_CC_Enabled = 1 ;
      edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Enabled = 1 ;
      edtDEVOC_TIPO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TIPO_MOVIMIENTO_Enabled = 1 ;
      edtDEVOC_TRAN_ID_Jsonclick = "" ;
      edtDEVOC_TRAN_ID_Enabled = 1 ;
      edtDEVOC_REGIONAL_Jsonclick = "" ;
      edtDEVOC_REGIONAL_Enabled = 1 ;
      edtDEVOC_ID_Jsonclick = "" ;
      edtDEVOC_ID_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtDEVOC_REGIONAL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Devoc_id( long GX_Parm1 ,
                               long GX_Parm2 ,
                               long GX_Parm3 ,
                               String GX_Parm4 ,
                               String GX_Parm5 ,
                               long GX_Parm6 ,
                               java.util.Date GX_Parm7 ,
                               int GX_Parm8 ,
                               String GX_Parm9 ,
                               String GX_Parm10 ,
                               String GX_Parm11 ,
                               String GX_Parm12 ,
                               String GX_Parm13 ,
                               String GX_Parm14 ,
                               short GX_Parm15 ,
                               java.math.BigDecimal GX_Parm16 ,
                               java.util.Date GX_Parm17 ,
                               com.genexus.webpanels.HTMLChoice GX_Parm18 ,
                               long GX_Parm19 ,
                               String GX_Parm20 ,
                               String GX_Parm21 ,
                               String GX_Parm22 ,
                               long GX_Parm23 ,
                               long GX_Parm24 ,
                               long GX_Parm25 ,
                               String GX_Parm26 ,
                               String GX_Parm27 ,
                               String GX_Parm28 ,
                               long GX_Parm29 ,
                               long GX_Parm30 ,
                               java.util.Date GX_Parm31 ,
                               int GX_Parm32 ,
                               String GX_Parm33 ,
                               String GX_Parm34 ,
                               String GX_Parm35 ,
                               long GX_Parm36 ,
                               String GX_Parm37 ,
                               short GX_Parm38 ,
                               String GX_Parm39 )
   {
      A95DEVOC_ID = GX_Parm1 ;
      A96DEVOC_REGIONAL = GX_Parm2 ;
      n96DEVOC_REGIONAL = false ;
      A101DEVOC_TRAN_ID = GX_Parm3 ;
      n101DEVOC_TRAN_ID = false ;
      A722DEVOC_TIPO_MOVIMIENTO = GX_Parm4 ;
      n722DEVOC_TIPO_MOVIMIENTO = false ;
      A100DEVOC_CODIGO_MOVIMIENTO = GX_Parm5 ;
      n100DEVOC_CODIGO_MOVIMIENTO = false ;
      A723DEVOC_TRAN_CC = GX_Parm6 ;
      n723DEVOC_TRAN_CC = false ;
      A103DEVOC_FECHA_MOVIMIENTO = GX_Parm7 ;
      n103DEVOC_FECHA_MOVIMIENTO = false ;
      A724DEVOC_RENGLON = GX_Parm8 ;
      n724DEVOC_RENGLON = false ;
      A725DEVOC_PLACA = GX_Parm9 ;
      n725DEVOC_PLACA = false ;
      A726DEVOC_PLACA_PADRE = GX_Parm10 ;
      n726DEVOC_PLACA_PADRE = false ;
      A727DEVOC_SERIAL = GX_Parm11 ;
      n727DEVOC_SERIAL = false ;
      A728DEVOC_MARCA = GX_Parm12 ;
      n728DEVOC_MARCA = false ;
      A729DEVOC_MARCA2 = GX_Parm13 ;
      n729DEVOC_MARCA2 = false ;
      A730DEVOC_MODELO = GX_Parm14 ;
      n730DEVOC_MODELO = false ;
      A731DEVOC_VIDA_UTIL = GX_Parm15 ;
      n731DEVOC_VIDA_UTIL = false ;
      A732DEVOC_VALOR_ADQUISICION = GX_Parm16 ;
      n732DEVOC_VALOR_ADQUISICION = false ;
      A733DEVOC_FECHA_ADQUISICION = GX_Parm17 ;
      n733DEVOC_FECHA_ADQUISICION = false ;
      cmbDEVOC_ESTADO = GX_Parm18 ;
      A99DEVOC_ESTADO = cmbDEVOC_ESTADO.getValue() ;
      n99DEVOC_ESTADO = false ;
      cmbDEVOC_ESTADO.setValue( A99DEVOC_ESTADO );
      A97DEVOC_CENTRO_COSTO_ORIGEN = GX_Parm19 ;
      n97DEVOC_CENTRO_COSTO_ORIGEN = false ;
      A734DEVOC_MODULO_ORIGEN = GX_Parm20 ;
      n734DEVOC_MODULO_ORIGEN = false ;
      A735DEVOC_ALMA_ORIGEN = GX_Parm21 ;
      n735DEVOC_ALMA_ORIGEN = false ;
      A736DEVOC_BODEGA_ORIGEN = GX_Parm22 ;
      n736DEVOC_BODEGA_ORIGEN = false ;
      A98DEVOC_NIT_ORIGEN = GX_Parm23 ;
      n98DEVOC_NIT_ORIGEN = false ;
      A737DEVOC_REGIONAL_DESTINO = GX_Parm24 ;
      n737DEVOC_REGIONAL_DESTINO = false ;
      A738DEVOC_CENTRO_COSTO_DESTINO = GX_Parm25 ;
      n738DEVOC_CENTRO_COSTO_DESTINO = false ;
      A739DEVOC_MODULO_DESTINO = GX_Parm26 ;
      n739DEVOC_MODULO_DESTINO = false ;
      A740DEVOC_ALMA_DESTINO = GX_Parm27 ;
      n740DEVOC_ALMA_DESTINO = false ;
      A741DEVOC_BODEGA_DESTINO = GX_Parm28 ;
      n741DEVOC_BODEGA_DESTINO = false ;
      A742DEVOC_NIT_DESTINO = GX_Parm29 ;
      n742DEVOC_NIT_DESTINO = false ;
      A743DEVOC_PROVEEDOR_ID = GX_Parm30 ;
      n743DEVOC_PROVEEDOR_ID = false ;
      A744DEVOC_FECHA_SERVICIO = GX_Parm31 ;
      n744DEVOC_FECHA_SERVICIO = false ;
      A745DEVOC_ACTA_ENTREGA = GX_Parm32 ;
      n745DEVOC_ACTA_ENTREGA = false ;
      A748DEVOC_TRAN_OBSERVACIONES = GX_Parm33 ;
      n748DEVOC_TRAN_OBSERVACIONES = false ;
      A749DEVOC_CURSO_ID = GX_Parm34 ;
      n749DEVOC_CURSO_ID = false ;
      A750DEVOC_AREADANTE_ID = GX_Parm35 ;
      n750DEVOC_AREADANTE_ID = false ;
      A751DEVOC_TIPO_INGRESO = GX_Parm36 ;
      n751DEVOC_TIPO_INGRESO = false ;
      A752DEVOC_NUMERO_INGRESO = GX_Parm37 ;
      n752DEVOC_NUMERO_INGRESO = false ;
      A753DEVOC_FECHA_INGRESO = GX_Parm38 ;
      n753DEVOC_FECHA_INGRESO = false ;
      A102DEVOC_CONSECUTIVO = GX_Parm39 ;
      n102DEVOC_CONSECUTIVO = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A757DEVOC_CATACODIGO = "" ;
         n757DEVOC_CATACODIGO = false ;
         A746DEVOC_DESCRIPCION = "" ;
         n746DEVOC_DESCRIPCION = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A722DEVOC_TIPO_MOVIMIENTO);
      isValidOutput.add(A100DEVOC_CODIGO_MOVIMIENTO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(A102DEVOC_CONSECUTIVO);
      isValidOutput.add(A725DEVOC_PLACA);
      isValidOutput.add(A726DEVOC_PLACA_PADRE);
      isValidOutput.add(A727DEVOC_SERIAL);
      isValidOutput.add(A728DEVOC_MARCA);
      isValidOutput.add(A729DEVOC_MARCA2);
      isValidOutput.add(A730DEVOC_MODELO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ".", "")));
      isValidOutput.add(localUtil.format(A733DEVOC_FECHA_ADQUISICION, "99/99/99"));
      cmbDEVOC_ESTADO.setValue( A99DEVOC_ESTADO );
      isValidOutput.add(cmbDEVOC_ESTADO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A734DEVOC_MODULO_ORIGEN);
      isValidOutput.add(A735DEVOC_ALMA_ORIGEN);
      isValidOutput.add(A736DEVOC_BODEGA_ORIGEN);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A739DEVOC_MODULO_DESTINO);
      isValidOutput.add(A740DEVOC_ALMA_DESTINO);
      isValidOutput.add(A741DEVOC_BODEGA_DESTINO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.format(A744DEVOC_FECHA_SERVICIO, "99/99/99"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(A748DEVOC_TRAN_OBSERVACIONES);
      isValidOutput.add(A749DEVOC_CURSO_ID);
      isValidOutput.add(A750DEVOC_AREADANTE_ID);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A752DEVOC_NUMERO_INGRESO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A757DEVOC_CATACODIGO);
      isValidOutput.add(A746DEVOC_DESCRIPCION);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z95DEVOC_ID, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z96DEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(Z722DEVOC_TIPO_MOVIMIENTO);
      isValidOutput.add(Z100DEVOC_CODIGO_MOVIMIENTO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.dtoc( Z103DEVOC_FECHA_MOVIMIENTO, 0, "/"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z724DEVOC_RENGLON, (byte)(5), (byte)(0), ",", "")));
      isValidOutput.add(Z102DEVOC_CONSECUTIVO);
      isValidOutput.add(Z725DEVOC_PLACA);
      isValidOutput.add(Z726DEVOC_PLACA_PADRE);
      isValidOutput.add(Z727DEVOC_SERIAL);
      isValidOutput.add(Z728DEVOC_MARCA);
      isValidOutput.add(Z729DEVOC_MARCA2);
      isValidOutput.add(Z730DEVOC_MODELO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ",", "")));
      isValidOutput.add(localUtil.dtoc( Z733DEVOC_FECHA_ADQUISICION, 0, "/"));
      isValidOutput.add(Z99DEVOC_ESTADO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z97DEVOC_CENTRO_COSTO_ORIGEN, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(Z734DEVOC_MODULO_ORIGEN);
      isValidOutput.add(Z735DEVOC_ALMA_ORIGEN);
      isValidOutput.add(Z736DEVOC_BODEGA_ORIGEN);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z98DEVOC_NIT_ORIGEN, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z737DEVOC_REGIONAL_DESTINO, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z738DEVOC_CENTRO_COSTO_DESTINO, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(Z739DEVOC_MODULO_DESTINO);
      isValidOutput.add(Z740DEVOC_ALMA_DESTINO);
      isValidOutput.add(Z741DEVOC_BODEGA_DESTINO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z742DEVOC_NIT_DESTINO, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z743DEVOC_PROVEEDOR_ID, (byte)(18), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.dtoc( Z744DEVOC_FECHA_SERVICIO, 0, "/"));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z745DEVOC_ACTA_ENTREGA, (byte)(5), (byte)(0), ",", "")));
      isValidOutput.add(Z748DEVOC_TRAN_OBSERVACIONES);
      isValidOutput.add(Z749DEVOC_CURSO_ID);
      isValidOutput.add(Z750DEVOC_AREADANTE_ID);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z751DEVOC_TIPO_INGRESO, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(Z752DEVOC_NUMERO_INGRESO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z753DEVOC_FECHA_INGRESO, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Z757DEVOC_CATACODIGO);
      isValidOutput.add(Z746DEVOC_DESCRIPCION);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Devoc_consecutivo( String GX_Parm1 ,
                                        String GX_Parm2 ,
                                        String GX_Parm3 )
   {
      A102DEVOC_CONSECUTIVO = GX_Parm1 ;
      n102DEVOC_CONSECUTIVO = false ;
      A757DEVOC_CATACODIGO = GX_Parm2 ;
      n757DEVOC_CATACODIGO = false ;
      A746DEVOC_DESCRIPCION = GX_Parm3 ;
      n746DEVOC_DESCRIPCION = false ;
      /* Using cursor T000X16 */
      pr_default.execute(14, new Object[] {new Boolean(n102DEVOC_CONSECUTIVO), A102DEVOC_CONSECUTIVO});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A102DEVOC_CONSECUTIVO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "DEVOC_CONSECUTIVO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDEVOC_CONSECUTIVO_Internalname ;
         }
      }
      A757DEVOC_CATACODIGO = T000X16_A757DEVOC_CATACODIGO[0] ;
      n757DEVOC_CATACODIGO = T000X16_n757DEVOC_CATACODIGO[0] ;
      pr_default.close(14);
      /* Using cursor T000X17 */
      pr_default.execute(15, new Object[] {new Boolean(n757DEVOC_CATACODIGO), A757DEVOC_CATACODIGO});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757DEVOC_CATACODIGO)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Devoc Descripcion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A746DEVOC_DESCRIPCION = T000X17_A746DEVOC_DESCRIPCION[0] ;
      n746DEVOC_DESCRIPCION = T000X17_n746DEVOC_DESCRIPCION[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A757DEVOC_CATACODIGO = "" ;
         n757DEVOC_CATACODIGO = false ;
         A746DEVOC_DESCRIPCION = "" ;
         n746DEVOC_DESCRIPCION = false ;
      }
      isValidOutput.add(A757DEVOC_CATACODIGO);
      isValidOutput.add(A746DEVOC_DESCRIPCION);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
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
      pr_default.close(14);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z722DEVOC_TIPO_MOVIMIENTO = "" ;
      Z100DEVOC_CODIGO_MOVIMIENTO = "" ;
      Z103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      Z725DEVOC_PLACA = "" ;
      Z726DEVOC_PLACA_PADRE = "" ;
      Z727DEVOC_SERIAL = "" ;
      Z728DEVOC_MARCA = "" ;
      Z729DEVOC_MARCA2 = "" ;
      Z730DEVOC_MODELO = "" ;
      Z732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      Z733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
      Z99DEVOC_ESTADO = "" ;
      Z734DEVOC_MODULO_ORIGEN = "" ;
      Z735DEVOC_ALMA_ORIGEN = "" ;
      Z736DEVOC_BODEGA_ORIGEN = "" ;
      Z739DEVOC_MODULO_DESTINO = "" ;
      Z740DEVOC_ALMA_DESTINO = "" ;
      Z741DEVOC_BODEGA_DESTINO = "" ;
      Z744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
      Z748DEVOC_TRAN_OBSERVACIONES = "" ;
      Z749DEVOC_CURSO_ID = "" ;
      Z750DEVOC_AREADANTE_ID = "" ;
      Z752DEVOC_NUMERO_INGRESO = "" ;
      Z102DEVOC_CONSECUTIVO = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A102DEVOC_CONSECUTIVO = "" ;
      A757DEVOC_CATACODIGO = "" ;
      GXKey = "" ;
      A99DEVOC_ESTADO = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A722DEVOC_TIPO_MOVIMIENTO = "" ;
      A100DEVOC_CODIGO_MOVIMIENTO = "" ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      sImgUrl = "" ;
      A746DEVOC_DESCRIPCION = "" ;
      A725DEVOC_PLACA = "" ;
      A726DEVOC_PLACA_PADRE = "" ;
      A727DEVOC_SERIAL = "" ;
      A728DEVOC_MARCA = "" ;
      A729DEVOC_MARCA2 = "" ;
      A730DEVOC_MODELO = "" ;
      A732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      A733DEVOC_FECHA_ADQUISICION = GXutil.nullDate() ;
      A734DEVOC_MODULO_ORIGEN = "" ;
      A735DEVOC_ALMA_ORIGEN = "" ;
      A736DEVOC_BODEGA_ORIGEN = "" ;
      A739DEVOC_MODULO_DESTINO = "" ;
      A740DEVOC_ALMA_DESTINO = "" ;
      A741DEVOC_BODEGA_DESTINO = "" ;
      A744DEVOC_FECHA_SERVICIO = GXutil.nullDate() ;
      A748DEVOC_TRAN_OBSERVACIONES = "" ;
      A749DEVOC_CURSO_ID = "" ;
      A750DEVOC_AREADANTE_ID = "" ;
      A752DEVOC_NUMERO_INGRESO = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z757DEVOC_CATACODIGO = "" ;
      Z746DEVOC_DESCRIPCION = "" ;
      T000X6_A95DEVOC_ID = new long[1] ;
      T000X6_A96DEVOC_REGIONAL = new long[1] ;
      T000X6_n96DEVOC_REGIONAL = new boolean[] {false} ;
      T000X6_A101DEVOC_TRAN_ID = new long[1] ;
      T000X6_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      T000X6_A722DEVOC_TIPO_MOVIMIENTO = new String[] {""} ;
      T000X6_n722DEVOC_TIPO_MOVIMIENTO = new boolean[] {false} ;
      T000X6_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      T000X6_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      T000X6_A723DEVOC_TRAN_CC = new long[1] ;
      T000X6_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      T000X6_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X6_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      T000X6_A724DEVOC_RENGLON = new int[1] ;
      T000X6_n724DEVOC_RENGLON = new boolean[] {false} ;
      T000X6_A746DEVOC_DESCRIPCION = new String[] {""} ;
      T000X6_n746DEVOC_DESCRIPCION = new boolean[] {false} ;
      T000X6_A725DEVOC_PLACA = new String[] {""} ;
      T000X6_n725DEVOC_PLACA = new boolean[] {false} ;
      T000X6_A726DEVOC_PLACA_PADRE = new String[] {""} ;
      T000X6_n726DEVOC_PLACA_PADRE = new boolean[] {false} ;
      T000X6_A727DEVOC_SERIAL = new String[] {""} ;
      T000X6_n727DEVOC_SERIAL = new boolean[] {false} ;
      T000X6_A728DEVOC_MARCA = new String[] {""} ;
      T000X6_n728DEVOC_MARCA = new boolean[] {false} ;
      T000X6_A729DEVOC_MARCA2 = new String[] {""} ;
      T000X6_n729DEVOC_MARCA2 = new boolean[] {false} ;
      T000X6_A730DEVOC_MODELO = new String[] {""} ;
      T000X6_n730DEVOC_MODELO = new boolean[] {false} ;
      T000X6_A731DEVOC_VIDA_UTIL = new short[1] ;
      T000X6_n731DEVOC_VIDA_UTIL = new boolean[] {false} ;
      T000X6_A732DEVOC_VALOR_ADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000X6_n732DEVOC_VALOR_ADQUISICION = new boolean[] {false} ;
      T000X6_A733DEVOC_FECHA_ADQUISICION = new java.util.Date[] {GXutil.nullDate()} ;
      T000X6_n733DEVOC_FECHA_ADQUISICION = new boolean[] {false} ;
      T000X6_A99DEVOC_ESTADO = new String[] {""} ;
      T000X6_n99DEVOC_ESTADO = new boolean[] {false} ;
      T000X6_A97DEVOC_CENTRO_COSTO_ORIGEN = new long[1] ;
      T000X6_n97DEVOC_CENTRO_COSTO_ORIGEN = new boolean[] {false} ;
      T000X6_A734DEVOC_MODULO_ORIGEN = new String[] {""} ;
      T000X6_n734DEVOC_MODULO_ORIGEN = new boolean[] {false} ;
      T000X6_A735DEVOC_ALMA_ORIGEN = new String[] {""} ;
      T000X6_n735DEVOC_ALMA_ORIGEN = new boolean[] {false} ;
      T000X6_A736DEVOC_BODEGA_ORIGEN = new String[] {""} ;
      T000X6_n736DEVOC_BODEGA_ORIGEN = new boolean[] {false} ;
      T000X6_A98DEVOC_NIT_ORIGEN = new long[1] ;
      T000X6_n98DEVOC_NIT_ORIGEN = new boolean[] {false} ;
      T000X6_A737DEVOC_REGIONAL_DESTINO = new long[1] ;
      T000X6_n737DEVOC_REGIONAL_DESTINO = new boolean[] {false} ;
      T000X6_A738DEVOC_CENTRO_COSTO_DESTINO = new long[1] ;
      T000X6_n738DEVOC_CENTRO_COSTO_DESTINO = new boolean[] {false} ;
      T000X6_A739DEVOC_MODULO_DESTINO = new String[] {""} ;
      T000X6_n739DEVOC_MODULO_DESTINO = new boolean[] {false} ;
      T000X6_A740DEVOC_ALMA_DESTINO = new String[] {""} ;
      T000X6_n740DEVOC_ALMA_DESTINO = new boolean[] {false} ;
      T000X6_A741DEVOC_BODEGA_DESTINO = new String[] {""} ;
      T000X6_n741DEVOC_BODEGA_DESTINO = new boolean[] {false} ;
      T000X6_A742DEVOC_NIT_DESTINO = new long[1] ;
      T000X6_n742DEVOC_NIT_DESTINO = new boolean[] {false} ;
      T000X6_A743DEVOC_PROVEEDOR_ID = new long[1] ;
      T000X6_n743DEVOC_PROVEEDOR_ID = new boolean[] {false} ;
      T000X6_A744DEVOC_FECHA_SERVICIO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X6_n744DEVOC_FECHA_SERVICIO = new boolean[] {false} ;
      T000X6_A745DEVOC_ACTA_ENTREGA = new int[1] ;
      T000X6_n745DEVOC_ACTA_ENTREGA = new boolean[] {false} ;
      T000X6_A748DEVOC_TRAN_OBSERVACIONES = new String[] {""} ;
      T000X6_n748DEVOC_TRAN_OBSERVACIONES = new boolean[] {false} ;
      T000X6_A749DEVOC_CURSO_ID = new String[] {""} ;
      T000X6_n749DEVOC_CURSO_ID = new boolean[] {false} ;
      T000X6_A750DEVOC_AREADANTE_ID = new String[] {""} ;
      T000X6_n750DEVOC_AREADANTE_ID = new boolean[] {false} ;
      T000X6_A751DEVOC_TIPO_INGRESO = new long[1] ;
      T000X6_n751DEVOC_TIPO_INGRESO = new boolean[] {false} ;
      T000X6_A752DEVOC_NUMERO_INGRESO = new String[] {""} ;
      T000X6_n752DEVOC_NUMERO_INGRESO = new boolean[] {false} ;
      T000X6_A753DEVOC_FECHA_INGRESO = new short[1] ;
      T000X6_n753DEVOC_FECHA_INGRESO = new boolean[] {false} ;
      T000X6_A102DEVOC_CONSECUTIVO = new String[] {""} ;
      T000X6_n102DEVOC_CONSECUTIVO = new boolean[] {false} ;
      T000X6_A757DEVOC_CATACODIGO = new String[] {""} ;
      T000X6_n757DEVOC_CATACODIGO = new boolean[] {false} ;
      T000X4_A757DEVOC_CATACODIGO = new String[] {""} ;
      T000X4_n757DEVOC_CATACODIGO = new boolean[] {false} ;
      T000X5_A746DEVOC_DESCRIPCION = new String[] {""} ;
      T000X5_n746DEVOC_DESCRIPCION = new boolean[] {false} ;
      T000X7_A757DEVOC_CATACODIGO = new String[] {""} ;
      T000X7_n757DEVOC_CATACODIGO = new boolean[] {false} ;
      T000X8_A746DEVOC_DESCRIPCION = new String[] {""} ;
      T000X8_n746DEVOC_DESCRIPCION = new boolean[] {false} ;
      T000X9_A95DEVOC_ID = new long[1] ;
      T000X3_A95DEVOC_ID = new long[1] ;
      T000X3_A96DEVOC_REGIONAL = new long[1] ;
      T000X3_n96DEVOC_REGIONAL = new boolean[] {false} ;
      T000X3_A101DEVOC_TRAN_ID = new long[1] ;
      T000X3_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      T000X3_A722DEVOC_TIPO_MOVIMIENTO = new String[] {""} ;
      T000X3_n722DEVOC_TIPO_MOVIMIENTO = new boolean[] {false} ;
      T000X3_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      T000X3_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      T000X3_A723DEVOC_TRAN_CC = new long[1] ;
      T000X3_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      T000X3_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X3_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      T000X3_A724DEVOC_RENGLON = new int[1] ;
      T000X3_n724DEVOC_RENGLON = new boolean[] {false} ;
      T000X3_A725DEVOC_PLACA = new String[] {""} ;
      T000X3_n725DEVOC_PLACA = new boolean[] {false} ;
      T000X3_A726DEVOC_PLACA_PADRE = new String[] {""} ;
      T000X3_n726DEVOC_PLACA_PADRE = new boolean[] {false} ;
      T000X3_A727DEVOC_SERIAL = new String[] {""} ;
      T000X3_n727DEVOC_SERIAL = new boolean[] {false} ;
      T000X3_A728DEVOC_MARCA = new String[] {""} ;
      T000X3_n728DEVOC_MARCA = new boolean[] {false} ;
      T000X3_A729DEVOC_MARCA2 = new String[] {""} ;
      T000X3_n729DEVOC_MARCA2 = new boolean[] {false} ;
      T000X3_A730DEVOC_MODELO = new String[] {""} ;
      T000X3_n730DEVOC_MODELO = new boolean[] {false} ;
      T000X3_A731DEVOC_VIDA_UTIL = new short[1] ;
      T000X3_n731DEVOC_VIDA_UTIL = new boolean[] {false} ;
      T000X3_A732DEVOC_VALOR_ADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000X3_n732DEVOC_VALOR_ADQUISICION = new boolean[] {false} ;
      T000X3_A733DEVOC_FECHA_ADQUISICION = new java.util.Date[] {GXutil.nullDate()} ;
      T000X3_n733DEVOC_FECHA_ADQUISICION = new boolean[] {false} ;
      T000X3_A99DEVOC_ESTADO = new String[] {""} ;
      T000X3_n99DEVOC_ESTADO = new boolean[] {false} ;
      T000X3_A97DEVOC_CENTRO_COSTO_ORIGEN = new long[1] ;
      T000X3_n97DEVOC_CENTRO_COSTO_ORIGEN = new boolean[] {false} ;
      T000X3_A734DEVOC_MODULO_ORIGEN = new String[] {""} ;
      T000X3_n734DEVOC_MODULO_ORIGEN = new boolean[] {false} ;
      T000X3_A735DEVOC_ALMA_ORIGEN = new String[] {""} ;
      T000X3_n735DEVOC_ALMA_ORIGEN = new boolean[] {false} ;
      T000X3_A736DEVOC_BODEGA_ORIGEN = new String[] {""} ;
      T000X3_n736DEVOC_BODEGA_ORIGEN = new boolean[] {false} ;
      T000X3_A98DEVOC_NIT_ORIGEN = new long[1] ;
      T000X3_n98DEVOC_NIT_ORIGEN = new boolean[] {false} ;
      T000X3_A737DEVOC_REGIONAL_DESTINO = new long[1] ;
      T000X3_n737DEVOC_REGIONAL_DESTINO = new boolean[] {false} ;
      T000X3_A738DEVOC_CENTRO_COSTO_DESTINO = new long[1] ;
      T000X3_n738DEVOC_CENTRO_COSTO_DESTINO = new boolean[] {false} ;
      T000X3_A739DEVOC_MODULO_DESTINO = new String[] {""} ;
      T000X3_n739DEVOC_MODULO_DESTINO = new boolean[] {false} ;
      T000X3_A740DEVOC_ALMA_DESTINO = new String[] {""} ;
      T000X3_n740DEVOC_ALMA_DESTINO = new boolean[] {false} ;
      T000X3_A741DEVOC_BODEGA_DESTINO = new String[] {""} ;
      T000X3_n741DEVOC_BODEGA_DESTINO = new boolean[] {false} ;
      T000X3_A742DEVOC_NIT_DESTINO = new long[1] ;
      T000X3_n742DEVOC_NIT_DESTINO = new boolean[] {false} ;
      T000X3_A743DEVOC_PROVEEDOR_ID = new long[1] ;
      T000X3_n743DEVOC_PROVEEDOR_ID = new boolean[] {false} ;
      T000X3_A744DEVOC_FECHA_SERVICIO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X3_n744DEVOC_FECHA_SERVICIO = new boolean[] {false} ;
      T000X3_A745DEVOC_ACTA_ENTREGA = new int[1] ;
      T000X3_n745DEVOC_ACTA_ENTREGA = new boolean[] {false} ;
      T000X3_A748DEVOC_TRAN_OBSERVACIONES = new String[] {""} ;
      T000X3_n748DEVOC_TRAN_OBSERVACIONES = new boolean[] {false} ;
      T000X3_A749DEVOC_CURSO_ID = new String[] {""} ;
      T000X3_n749DEVOC_CURSO_ID = new boolean[] {false} ;
      T000X3_A750DEVOC_AREADANTE_ID = new String[] {""} ;
      T000X3_n750DEVOC_AREADANTE_ID = new boolean[] {false} ;
      T000X3_A751DEVOC_TIPO_INGRESO = new long[1] ;
      T000X3_n751DEVOC_TIPO_INGRESO = new boolean[] {false} ;
      T000X3_A752DEVOC_NUMERO_INGRESO = new String[] {""} ;
      T000X3_n752DEVOC_NUMERO_INGRESO = new boolean[] {false} ;
      T000X3_A753DEVOC_FECHA_INGRESO = new short[1] ;
      T000X3_n753DEVOC_FECHA_INGRESO = new boolean[] {false} ;
      T000X3_A102DEVOC_CONSECUTIVO = new String[] {""} ;
      T000X3_n102DEVOC_CONSECUTIVO = new boolean[] {false} ;
      sMode53 = "" ;
      T000X10_A95DEVOC_ID = new long[1] ;
      T000X11_A95DEVOC_ID = new long[1] ;
      T000X2_A95DEVOC_ID = new long[1] ;
      T000X2_A96DEVOC_REGIONAL = new long[1] ;
      T000X2_n96DEVOC_REGIONAL = new boolean[] {false} ;
      T000X2_A101DEVOC_TRAN_ID = new long[1] ;
      T000X2_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      T000X2_A722DEVOC_TIPO_MOVIMIENTO = new String[] {""} ;
      T000X2_n722DEVOC_TIPO_MOVIMIENTO = new boolean[] {false} ;
      T000X2_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      T000X2_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      T000X2_A723DEVOC_TRAN_CC = new long[1] ;
      T000X2_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      T000X2_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X2_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      T000X2_A724DEVOC_RENGLON = new int[1] ;
      T000X2_n724DEVOC_RENGLON = new boolean[] {false} ;
      T000X2_A725DEVOC_PLACA = new String[] {""} ;
      T000X2_n725DEVOC_PLACA = new boolean[] {false} ;
      T000X2_A726DEVOC_PLACA_PADRE = new String[] {""} ;
      T000X2_n726DEVOC_PLACA_PADRE = new boolean[] {false} ;
      T000X2_A727DEVOC_SERIAL = new String[] {""} ;
      T000X2_n727DEVOC_SERIAL = new boolean[] {false} ;
      T000X2_A728DEVOC_MARCA = new String[] {""} ;
      T000X2_n728DEVOC_MARCA = new boolean[] {false} ;
      T000X2_A729DEVOC_MARCA2 = new String[] {""} ;
      T000X2_n729DEVOC_MARCA2 = new boolean[] {false} ;
      T000X2_A730DEVOC_MODELO = new String[] {""} ;
      T000X2_n730DEVOC_MODELO = new boolean[] {false} ;
      T000X2_A731DEVOC_VIDA_UTIL = new short[1] ;
      T000X2_n731DEVOC_VIDA_UTIL = new boolean[] {false} ;
      T000X2_A732DEVOC_VALOR_ADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000X2_n732DEVOC_VALOR_ADQUISICION = new boolean[] {false} ;
      T000X2_A733DEVOC_FECHA_ADQUISICION = new java.util.Date[] {GXutil.nullDate()} ;
      T000X2_n733DEVOC_FECHA_ADQUISICION = new boolean[] {false} ;
      T000X2_A99DEVOC_ESTADO = new String[] {""} ;
      T000X2_n99DEVOC_ESTADO = new boolean[] {false} ;
      T000X2_A97DEVOC_CENTRO_COSTO_ORIGEN = new long[1] ;
      T000X2_n97DEVOC_CENTRO_COSTO_ORIGEN = new boolean[] {false} ;
      T000X2_A734DEVOC_MODULO_ORIGEN = new String[] {""} ;
      T000X2_n734DEVOC_MODULO_ORIGEN = new boolean[] {false} ;
      T000X2_A735DEVOC_ALMA_ORIGEN = new String[] {""} ;
      T000X2_n735DEVOC_ALMA_ORIGEN = new boolean[] {false} ;
      T000X2_A736DEVOC_BODEGA_ORIGEN = new String[] {""} ;
      T000X2_n736DEVOC_BODEGA_ORIGEN = new boolean[] {false} ;
      T000X2_A98DEVOC_NIT_ORIGEN = new long[1] ;
      T000X2_n98DEVOC_NIT_ORIGEN = new boolean[] {false} ;
      T000X2_A737DEVOC_REGIONAL_DESTINO = new long[1] ;
      T000X2_n737DEVOC_REGIONAL_DESTINO = new boolean[] {false} ;
      T000X2_A738DEVOC_CENTRO_COSTO_DESTINO = new long[1] ;
      T000X2_n738DEVOC_CENTRO_COSTO_DESTINO = new boolean[] {false} ;
      T000X2_A739DEVOC_MODULO_DESTINO = new String[] {""} ;
      T000X2_n739DEVOC_MODULO_DESTINO = new boolean[] {false} ;
      T000X2_A740DEVOC_ALMA_DESTINO = new String[] {""} ;
      T000X2_n740DEVOC_ALMA_DESTINO = new boolean[] {false} ;
      T000X2_A741DEVOC_BODEGA_DESTINO = new String[] {""} ;
      T000X2_n741DEVOC_BODEGA_DESTINO = new boolean[] {false} ;
      T000X2_A742DEVOC_NIT_DESTINO = new long[1] ;
      T000X2_n742DEVOC_NIT_DESTINO = new boolean[] {false} ;
      T000X2_A743DEVOC_PROVEEDOR_ID = new long[1] ;
      T000X2_n743DEVOC_PROVEEDOR_ID = new boolean[] {false} ;
      T000X2_A744DEVOC_FECHA_SERVICIO = new java.util.Date[] {GXutil.nullDate()} ;
      T000X2_n744DEVOC_FECHA_SERVICIO = new boolean[] {false} ;
      T000X2_A745DEVOC_ACTA_ENTREGA = new int[1] ;
      T000X2_n745DEVOC_ACTA_ENTREGA = new boolean[] {false} ;
      T000X2_A748DEVOC_TRAN_OBSERVACIONES = new String[] {""} ;
      T000X2_n748DEVOC_TRAN_OBSERVACIONES = new boolean[] {false} ;
      T000X2_A749DEVOC_CURSO_ID = new String[] {""} ;
      T000X2_n749DEVOC_CURSO_ID = new boolean[] {false} ;
      T000X2_A750DEVOC_AREADANTE_ID = new String[] {""} ;
      T000X2_n750DEVOC_AREADANTE_ID = new boolean[] {false} ;
      T000X2_A751DEVOC_TIPO_INGRESO = new long[1] ;
      T000X2_n751DEVOC_TIPO_INGRESO = new boolean[] {false} ;
      T000X2_A752DEVOC_NUMERO_INGRESO = new String[] {""} ;
      T000X2_n752DEVOC_NUMERO_INGRESO = new boolean[] {false} ;
      T000X2_A753DEVOC_FECHA_INGRESO = new short[1] ;
      T000X2_n753DEVOC_FECHA_INGRESO = new boolean[] {false} ;
      T000X2_A102DEVOC_CONSECUTIVO = new String[] {""} ;
      T000X2_n102DEVOC_CONSECUTIVO = new boolean[] {false} ;
      T000X13_A95DEVOC_ID = new long[1] ;
      T000X16_A757DEVOC_CATACODIGO = new String[] {""} ;
      T000X16_n757DEVOC_CATACODIGO = new boolean[] {false} ;
      T000X17_A746DEVOC_DESCRIPCION = new String[] {""} ;
      T000X17_n746DEVOC_DESCRIPCION = new boolean[] {false} ;
      T000X18_A95DEVOC_ID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_devo_hist__default(),
         new Object[] {
             new Object[] {
            T000X2_A95DEVOC_ID, T000X2_A96DEVOC_REGIONAL, T000X2_n96DEVOC_REGIONAL, T000X2_A101DEVOC_TRAN_ID, T000X2_n101DEVOC_TRAN_ID, T000X2_A722DEVOC_TIPO_MOVIMIENTO, T000X2_n722DEVOC_TIPO_MOVIMIENTO, T000X2_A100DEVOC_CODIGO_MOVIMIENTO, T000X2_n100DEVOC_CODIGO_MOVIMIENTO, T000X2_A723DEVOC_TRAN_CC,
            T000X2_n723DEVOC_TRAN_CC, T000X2_A103DEVOC_FECHA_MOVIMIENTO, T000X2_n103DEVOC_FECHA_MOVIMIENTO, T000X2_A724DEVOC_RENGLON, T000X2_n724DEVOC_RENGLON, T000X2_A725DEVOC_PLACA, T000X2_n725DEVOC_PLACA, T000X2_A726DEVOC_PLACA_PADRE, T000X2_n726DEVOC_PLACA_PADRE, T000X2_A727DEVOC_SERIAL,
            T000X2_n727DEVOC_SERIAL, T000X2_A728DEVOC_MARCA, T000X2_n728DEVOC_MARCA, T000X2_A729DEVOC_MARCA2, T000X2_n729DEVOC_MARCA2, T000X2_A730DEVOC_MODELO, T000X2_n730DEVOC_MODELO, T000X2_A731DEVOC_VIDA_UTIL, T000X2_n731DEVOC_VIDA_UTIL, T000X2_A732DEVOC_VALOR_ADQUISICION,
            T000X2_n732DEVOC_VALOR_ADQUISICION, T000X2_A733DEVOC_FECHA_ADQUISICION, T000X2_n733DEVOC_FECHA_ADQUISICION, T000X2_A99DEVOC_ESTADO, T000X2_n99DEVOC_ESTADO, T000X2_A97DEVOC_CENTRO_COSTO_ORIGEN, T000X2_n97DEVOC_CENTRO_COSTO_ORIGEN, T000X2_A734DEVOC_MODULO_ORIGEN, T000X2_n734DEVOC_MODULO_ORIGEN, T000X2_A735DEVOC_ALMA_ORIGEN,
            T000X2_n735DEVOC_ALMA_ORIGEN, T000X2_A736DEVOC_BODEGA_ORIGEN, T000X2_n736DEVOC_BODEGA_ORIGEN, T000X2_A98DEVOC_NIT_ORIGEN, T000X2_n98DEVOC_NIT_ORIGEN, T000X2_A737DEVOC_REGIONAL_DESTINO, T000X2_n737DEVOC_REGIONAL_DESTINO, T000X2_A738DEVOC_CENTRO_COSTO_DESTINO, T000X2_n738DEVOC_CENTRO_COSTO_DESTINO, T000X2_A739DEVOC_MODULO_DESTINO,
            T000X2_n739DEVOC_MODULO_DESTINO, T000X2_A740DEVOC_ALMA_DESTINO, T000X2_n740DEVOC_ALMA_DESTINO, T000X2_A741DEVOC_BODEGA_DESTINO, T000X2_n741DEVOC_BODEGA_DESTINO, T000X2_A742DEVOC_NIT_DESTINO, T000X2_n742DEVOC_NIT_DESTINO, T000X2_A743DEVOC_PROVEEDOR_ID, T000X2_n743DEVOC_PROVEEDOR_ID, T000X2_A744DEVOC_FECHA_SERVICIO,
            T000X2_n744DEVOC_FECHA_SERVICIO, T000X2_A745DEVOC_ACTA_ENTREGA, T000X2_n745DEVOC_ACTA_ENTREGA, T000X2_A748DEVOC_TRAN_OBSERVACIONES, T000X2_n748DEVOC_TRAN_OBSERVACIONES, T000X2_A749DEVOC_CURSO_ID, T000X2_n749DEVOC_CURSO_ID, T000X2_A750DEVOC_AREADANTE_ID, T000X2_n750DEVOC_AREADANTE_ID, T000X2_A751DEVOC_TIPO_INGRESO,
            T000X2_n751DEVOC_TIPO_INGRESO, T000X2_A752DEVOC_NUMERO_INGRESO, T000X2_n752DEVOC_NUMERO_INGRESO, T000X2_A753DEVOC_FECHA_INGRESO, T000X2_n753DEVOC_FECHA_INGRESO, T000X2_A102DEVOC_CONSECUTIVO, T000X2_n102DEVOC_CONSECUTIVO
            }
            , new Object[] {
            T000X3_A95DEVOC_ID, T000X3_A96DEVOC_REGIONAL, T000X3_n96DEVOC_REGIONAL, T000X3_A101DEVOC_TRAN_ID, T000X3_n101DEVOC_TRAN_ID, T000X3_A722DEVOC_TIPO_MOVIMIENTO, T000X3_n722DEVOC_TIPO_MOVIMIENTO, T000X3_A100DEVOC_CODIGO_MOVIMIENTO, T000X3_n100DEVOC_CODIGO_MOVIMIENTO, T000X3_A723DEVOC_TRAN_CC,
            T000X3_n723DEVOC_TRAN_CC, T000X3_A103DEVOC_FECHA_MOVIMIENTO, T000X3_n103DEVOC_FECHA_MOVIMIENTO, T000X3_A724DEVOC_RENGLON, T000X3_n724DEVOC_RENGLON, T000X3_A725DEVOC_PLACA, T000X3_n725DEVOC_PLACA, T000X3_A726DEVOC_PLACA_PADRE, T000X3_n726DEVOC_PLACA_PADRE, T000X3_A727DEVOC_SERIAL,
            T000X3_n727DEVOC_SERIAL, T000X3_A728DEVOC_MARCA, T000X3_n728DEVOC_MARCA, T000X3_A729DEVOC_MARCA2, T000X3_n729DEVOC_MARCA2, T000X3_A730DEVOC_MODELO, T000X3_n730DEVOC_MODELO, T000X3_A731DEVOC_VIDA_UTIL, T000X3_n731DEVOC_VIDA_UTIL, T000X3_A732DEVOC_VALOR_ADQUISICION,
            T000X3_n732DEVOC_VALOR_ADQUISICION, T000X3_A733DEVOC_FECHA_ADQUISICION, T000X3_n733DEVOC_FECHA_ADQUISICION, T000X3_A99DEVOC_ESTADO, T000X3_n99DEVOC_ESTADO, T000X3_A97DEVOC_CENTRO_COSTO_ORIGEN, T000X3_n97DEVOC_CENTRO_COSTO_ORIGEN, T000X3_A734DEVOC_MODULO_ORIGEN, T000X3_n734DEVOC_MODULO_ORIGEN, T000X3_A735DEVOC_ALMA_ORIGEN,
            T000X3_n735DEVOC_ALMA_ORIGEN, T000X3_A736DEVOC_BODEGA_ORIGEN, T000X3_n736DEVOC_BODEGA_ORIGEN, T000X3_A98DEVOC_NIT_ORIGEN, T000X3_n98DEVOC_NIT_ORIGEN, T000X3_A737DEVOC_REGIONAL_DESTINO, T000X3_n737DEVOC_REGIONAL_DESTINO, T000X3_A738DEVOC_CENTRO_COSTO_DESTINO, T000X3_n738DEVOC_CENTRO_COSTO_DESTINO, T000X3_A739DEVOC_MODULO_DESTINO,
            T000X3_n739DEVOC_MODULO_DESTINO, T000X3_A740DEVOC_ALMA_DESTINO, T000X3_n740DEVOC_ALMA_DESTINO, T000X3_A741DEVOC_BODEGA_DESTINO, T000X3_n741DEVOC_BODEGA_DESTINO, T000X3_A742DEVOC_NIT_DESTINO, T000X3_n742DEVOC_NIT_DESTINO, T000X3_A743DEVOC_PROVEEDOR_ID, T000X3_n743DEVOC_PROVEEDOR_ID, T000X3_A744DEVOC_FECHA_SERVICIO,
            T000X3_n744DEVOC_FECHA_SERVICIO, T000X3_A745DEVOC_ACTA_ENTREGA, T000X3_n745DEVOC_ACTA_ENTREGA, T000X3_A748DEVOC_TRAN_OBSERVACIONES, T000X3_n748DEVOC_TRAN_OBSERVACIONES, T000X3_A749DEVOC_CURSO_ID, T000X3_n749DEVOC_CURSO_ID, T000X3_A750DEVOC_AREADANTE_ID, T000X3_n750DEVOC_AREADANTE_ID, T000X3_A751DEVOC_TIPO_INGRESO,
            T000X3_n751DEVOC_TIPO_INGRESO, T000X3_A752DEVOC_NUMERO_INGRESO, T000X3_n752DEVOC_NUMERO_INGRESO, T000X3_A753DEVOC_FECHA_INGRESO, T000X3_n753DEVOC_FECHA_INGRESO, T000X3_A102DEVOC_CONSECUTIVO, T000X3_n102DEVOC_CONSECUTIVO
            }
            , new Object[] {
            T000X4_A757DEVOC_CATACODIGO, T000X4_n757DEVOC_CATACODIGO
            }
            , new Object[] {
            T000X5_A746DEVOC_DESCRIPCION, T000X5_n746DEVOC_DESCRIPCION
            }
            , new Object[] {
            T000X6_A95DEVOC_ID, T000X6_A96DEVOC_REGIONAL, T000X6_n96DEVOC_REGIONAL, T000X6_A101DEVOC_TRAN_ID, T000X6_n101DEVOC_TRAN_ID, T000X6_A722DEVOC_TIPO_MOVIMIENTO, T000X6_n722DEVOC_TIPO_MOVIMIENTO, T000X6_A100DEVOC_CODIGO_MOVIMIENTO, T000X6_n100DEVOC_CODIGO_MOVIMIENTO, T000X6_A723DEVOC_TRAN_CC,
            T000X6_n723DEVOC_TRAN_CC, T000X6_A103DEVOC_FECHA_MOVIMIENTO, T000X6_n103DEVOC_FECHA_MOVIMIENTO, T000X6_A724DEVOC_RENGLON, T000X6_n724DEVOC_RENGLON, T000X6_A746DEVOC_DESCRIPCION, T000X6_n746DEVOC_DESCRIPCION, T000X6_A725DEVOC_PLACA, T000X6_n725DEVOC_PLACA, T000X6_A726DEVOC_PLACA_PADRE,
            T000X6_n726DEVOC_PLACA_PADRE, T000X6_A727DEVOC_SERIAL, T000X6_n727DEVOC_SERIAL, T000X6_A728DEVOC_MARCA, T000X6_n728DEVOC_MARCA, T000X6_A729DEVOC_MARCA2, T000X6_n729DEVOC_MARCA2, T000X6_A730DEVOC_MODELO, T000X6_n730DEVOC_MODELO, T000X6_A731DEVOC_VIDA_UTIL,
            T000X6_n731DEVOC_VIDA_UTIL, T000X6_A732DEVOC_VALOR_ADQUISICION, T000X6_n732DEVOC_VALOR_ADQUISICION, T000X6_A733DEVOC_FECHA_ADQUISICION, T000X6_n733DEVOC_FECHA_ADQUISICION, T000X6_A99DEVOC_ESTADO, T000X6_n99DEVOC_ESTADO, T000X6_A97DEVOC_CENTRO_COSTO_ORIGEN, T000X6_n97DEVOC_CENTRO_COSTO_ORIGEN, T000X6_A734DEVOC_MODULO_ORIGEN,
            T000X6_n734DEVOC_MODULO_ORIGEN, T000X6_A735DEVOC_ALMA_ORIGEN, T000X6_n735DEVOC_ALMA_ORIGEN, T000X6_A736DEVOC_BODEGA_ORIGEN, T000X6_n736DEVOC_BODEGA_ORIGEN, T000X6_A98DEVOC_NIT_ORIGEN, T000X6_n98DEVOC_NIT_ORIGEN, T000X6_A737DEVOC_REGIONAL_DESTINO, T000X6_n737DEVOC_REGIONAL_DESTINO, T000X6_A738DEVOC_CENTRO_COSTO_DESTINO,
            T000X6_n738DEVOC_CENTRO_COSTO_DESTINO, T000X6_A739DEVOC_MODULO_DESTINO, T000X6_n739DEVOC_MODULO_DESTINO, T000X6_A740DEVOC_ALMA_DESTINO, T000X6_n740DEVOC_ALMA_DESTINO, T000X6_A741DEVOC_BODEGA_DESTINO, T000X6_n741DEVOC_BODEGA_DESTINO, T000X6_A742DEVOC_NIT_DESTINO, T000X6_n742DEVOC_NIT_DESTINO, T000X6_A743DEVOC_PROVEEDOR_ID,
            T000X6_n743DEVOC_PROVEEDOR_ID, T000X6_A744DEVOC_FECHA_SERVICIO, T000X6_n744DEVOC_FECHA_SERVICIO, T000X6_A745DEVOC_ACTA_ENTREGA, T000X6_n745DEVOC_ACTA_ENTREGA, T000X6_A748DEVOC_TRAN_OBSERVACIONES, T000X6_n748DEVOC_TRAN_OBSERVACIONES, T000X6_A749DEVOC_CURSO_ID, T000X6_n749DEVOC_CURSO_ID, T000X6_A750DEVOC_AREADANTE_ID,
            T000X6_n750DEVOC_AREADANTE_ID, T000X6_A751DEVOC_TIPO_INGRESO, T000X6_n751DEVOC_TIPO_INGRESO, T000X6_A752DEVOC_NUMERO_INGRESO, T000X6_n752DEVOC_NUMERO_INGRESO, T000X6_A753DEVOC_FECHA_INGRESO, T000X6_n753DEVOC_FECHA_INGRESO, T000X6_A102DEVOC_CONSECUTIVO, T000X6_n102DEVOC_CONSECUTIVO, T000X6_A757DEVOC_CATACODIGO,
            T000X6_n757DEVOC_CATACODIGO
            }
            , new Object[] {
            T000X7_A757DEVOC_CATACODIGO, T000X7_n757DEVOC_CATACODIGO
            }
            , new Object[] {
            T000X8_A746DEVOC_DESCRIPCION, T000X8_n746DEVOC_DESCRIPCION
            }
            , new Object[] {
            T000X9_A95DEVOC_ID
            }
            , new Object[] {
            T000X10_A95DEVOC_ID
            }
            , new Object[] {
            T000X11_A95DEVOC_ID
            }
            , new Object[] {
            }
            , new Object[] {
            T000X13_A95DEVOC_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000X16_A757DEVOC_CATACODIGO, T000X16_n757DEVOC_CATACODIGO
            }
            , new Object[] {
            T000X17_A746DEVOC_DESCRIPCION, T000X17_n746DEVOC_DESCRIPCION
            }
            , new Object[] {
            T000X18_A95DEVOC_ID
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z731DEVOC_VIDA_UTIL ;
   private short Z753DEVOC_FECHA_INGRESO ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A731DEVOC_VIDA_UTIL ;
   private short A753DEVOC_FECHA_INGRESO ;
   private short RcdFound53 ;
   private int Z724DEVOC_RENGLON ;
   private int Z745DEVOC_ACTA_ENTREGA ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDEVOC_ID_Enabled ;
   private int edtDEVOC_REGIONAL_Enabled ;
   private int edtDEVOC_TRAN_ID_Enabled ;
   private int edtDEVOC_TIPO_MOVIMIENTO_Enabled ;
   private int edtDEVOC_CODIGO_MOVIMIENTO_Enabled ;
   private int edtDEVOC_TRAN_CC_Enabled ;
   private int edtDEVOC_FECHA_MOVIMIENTO_Enabled ;
   private int A724DEVOC_RENGLON ;
   private int edtDEVOC_RENGLON_Enabled ;
   private int edtDEVOC_CONSECUTIVO_Enabled ;
   private int imgprompt_102_Visible ;
   private int edtDEVOC_CATACODIGO_Enabled ;
   private int edtDEVOC_DESCRIPCION_Enabled ;
   private int edtDEVOC_PLACA_Enabled ;
   private int edtDEVOC_PLACA_PADRE_Enabled ;
   private int edtDEVOC_SERIAL_Enabled ;
   private int edtDEVOC_MARCA_Enabled ;
   private int edtDEVOC_MARCA2_Enabled ;
   private int edtDEVOC_MODELO_Enabled ;
   private int edtDEVOC_VIDA_UTIL_Enabled ;
   private int edtDEVOC_VALOR_ADQUISICION_Enabled ;
   private int edtDEVOC_FECHA_ADQUISICION_Enabled ;
   private int edtDEVOC_CENTRO_COSTO_ORIGEN_Enabled ;
   private int edtDEVOC_MODULO_ORIGEN_Enabled ;
   private int edtDEVOC_ALMA_ORIGEN_Enabled ;
   private int edtDEVOC_BODEGA_ORIGEN_Enabled ;
   private int edtDEVOC_NIT_ORIGEN_Enabled ;
   private int edtDEVOC_REGIONAL_DESTINO_Enabled ;
   private int edtDEVOC_CENTRO_COSTO_DESTINO_Enabled ;
   private int edtDEVOC_MODULO_DESTINO_Enabled ;
   private int edtDEVOC_ALMA_DESTINO_Enabled ;
   private int edtDEVOC_BODEGA_DESTINO_Enabled ;
   private int edtDEVOC_NIT_DESTINO_Enabled ;
   private int edtDEVOC_PROVEEDOR_ID_Enabled ;
   private int edtDEVOC_FECHA_SERVICIO_Enabled ;
   private int A745DEVOC_ACTA_ENTREGA ;
   private int edtDEVOC_ACTA_ENTREGA_Enabled ;
   private int edtDEVOC_TRAN_OBSERVACIONES_Enabled ;
   private int edtDEVOC_CURSO_ID_Enabled ;
   private int edtDEVOC_AREADANTE_ID_Enabled ;
   private int edtDEVOC_TIPO_INGRESO_Enabled ;
   private int edtDEVOC_NUMERO_INGRESO_Enabled ;
   private int edtDEVOC_FECHA_INGRESO_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z95DEVOC_ID ;
   private long Z96DEVOC_REGIONAL ;
   private long Z101DEVOC_TRAN_ID ;
   private long Z723DEVOC_TRAN_CC ;
   private long Z97DEVOC_CENTRO_COSTO_ORIGEN ;
   private long Z98DEVOC_NIT_ORIGEN ;
   private long Z737DEVOC_REGIONAL_DESTINO ;
   private long Z738DEVOC_CENTRO_COSTO_DESTINO ;
   private long Z742DEVOC_NIT_DESTINO ;
   private long Z743DEVOC_PROVEEDOR_ID ;
   private long Z751DEVOC_TIPO_INGRESO ;
   private long A95DEVOC_ID ;
   private long A96DEVOC_REGIONAL ;
   private long A101DEVOC_TRAN_ID ;
   private long A723DEVOC_TRAN_CC ;
   private long A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private long A98DEVOC_NIT_ORIGEN ;
   private long A737DEVOC_REGIONAL_DESTINO ;
   private long A738DEVOC_CENTRO_COSTO_DESTINO ;
   private long A742DEVOC_NIT_DESTINO ;
   private long A743DEVOC_PROVEEDOR_ID ;
   private long A751DEVOC_TIPO_INGRESO ;
   private java.math.BigDecimal Z732DEVOC_VALOR_ADQUISICION ;
   private java.math.BigDecimal A732DEVOC_VALOR_ADQUISICION ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDEVOC_ID_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtDEVOC_ID_Jsonclick ;
   private String edtDEVOC_REGIONAL_Internalname ;
   private String edtDEVOC_REGIONAL_Jsonclick ;
   private String edtDEVOC_TRAN_ID_Internalname ;
   private String edtDEVOC_TRAN_ID_Jsonclick ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_TRAN_CC_Internalname ;
   private String edtDEVOC_TRAN_CC_Jsonclick ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Internalname ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_RENGLON_Internalname ;
   private String edtDEVOC_RENGLON_Jsonclick ;
   private String edtDEVOC_CONSECUTIVO_Internalname ;
   private String edtDEVOC_CONSECUTIVO_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_102_Internalname ;
   private String imgprompt_102_Link ;
   private String edtDEVOC_CATACODIGO_Internalname ;
   private String edtDEVOC_CATACODIGO_Jsonclick ;
   private String edtDEVOC_DESCRIPCION_Internalname ;
   private String edtDEVOC_PLACA_Internalname ;
   private String edtDEVOC_PLACA_Jsonclick ;
   private String edtDEVOC_PLACA_PADRE_Internalname ;
   private String edtDEVOC_PLACA_PADRE_Jsonclick ;
   private String edtDEVOC_SERIAL_Internalname ;
   private String edtDEVOC_MARCA_Internalname ;
   private String edtDEVOC_MARCA2_Internalname ;
   private String edtDEVOC_MODELO_Internalname ;
   private String edtDEVOC_VIDA_UTIL_Internalname ;
   private String edtDEVOC_VIDA_UTIL_Jsonclick ;
   private String edtDEVOC_VALOR_ADQUISICION_Internalname ;
   private String edtDEVOC_VALOR_ADQUISICION_Jsonclick ;
   private String edtDEVOC_FECHA_ADQUISICION_Internalname ;
   private String edtDEVOC_FECHA_ADQUISICION_Jsonclick ;
   private String edtDEVOC_CENTRO_COSTO_ORIGEN_Internalname ;
   private String edtDEVOC_CENTRO_COSTO_ORIGEN_Jsonclick ;
   private String edtDEVOC_MODULO_ORIGEN_Internalname ;
   private String edtDEVOC_MODULO_ORIGEN_Jsonclick ;
   private String edtDEVOC_ALMA_ORIGEN_Internalname ;
   private String edtDEVOC_ALMA_ORIGEN_Jsonclick ;
   private String edtDEVOC_BODEGA_ORIGEN_Internalname ;
   private String edtDEVOC_BODEGA_ORIGEN_Jsonclick ;
   private String edtDEVOC_NIT_ORIGEN_Internalname ;
   private String edtDEVOC_NIT_ORIGEN_Jsonclick ;
   private String edtDEVOC_REGIONAL_DESTINO_Internalname ;
   private String edtDEVOC_REGIONAL_DESTINO_Jsonclick ;
   private String edtDEVOC_CENTRO_COSTO_DESTINO_Internalname ;
   private String edtDEVOC_CENTRO_COSTO_DESTINO_Jsonclick ;
   private String edtDEVOC_MODULO_DESTINO_Internalname ;
   private String edtDEVOC_MODULO_DESTINO_Jsonclick ;
   private String edtDEVOC_ALMA_DESTINO_Internalname ;
   private String edtDEVOC_ALMA_DESTINO_Jsonclick ;
   private String edtDEVOC_BODEGA_DESTINO_Internalname ;
   private String edtDEVOC_BODEGA_DESTINO_Jsonclick ;
   private String edtDEVOC_NIT_DESTINO_Internalname ;
   private String edtDEVOC_NIT_DESTINO_Jsonclick ;
   private String edtDEVOC_PROVEEDOR_ID_Internalname ;
   private String edtDEVOC_PROVEEDOR_ID_Jsonclick ;
   private String edtDEVOC_FECHA_SERVICIO_Internalname ;
   private String edtDEVOC_FECHA_SERVICIO_Jsonclick ;
   private String edtDEVOC_ACTA_ENTREGA_Internalname ;
   private String edtDEVOC_ACTA_ENTREGA_Jsonclick ;
   private String edtDEVOC_TRAN_OBSERVACIONES_Internalname ;
   private String edtDEVOC_TRAN_OBSERVACIONES_Jsonclick ;
   private String edtDEVOC_CURSO_ID_Internalname ;
   private String edtDEVOC_CURSO_ID_Jsonclick ;
   private String edtDEVOC_AREADANTE_ID_Internalname ;
   private String edtDEVOC_AREADANTE_ID_Jsonclick ;
   private String edtDEVOC_TIPO_INGRESO_Internalname ;
   private String edtDEVOC_TIPO_INGRESO_Jsonclick ;
   private String edtDEVOC_NUMERO_INGRESO_Internalname ;
   private String edtDEVOC_NUMERO_INGRESO_Jsonclick ;
   private String edtDEVOC_FECHA_INGRESO_Internalname ;
   private String edtDEVOC_FECHA_INGRESO_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode53 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z103DEVOC_FECHA_MOVIMIENTO ;
   private java.util.Date Z733DEVOC_FECHA_ADQUISICION ;
   private java.util.Date Z744DEVOC_FECHA_SERVICIO ;
   private java.util.Date A103DEVOC_FECHA_MOVIMIENTO ;
   private java.util.Date A733DEVOC_FECHA_ADQUISICION ;
   private java.util.Date A744DEVOC_FECHA_SERVICIO ;
   private boolean entryPointCalled ;
   private boolean n102DEVOC_CONSECUTIVO ;
   private boolean n757DEVOC_CATACODIGO ;
   private boolean toggleJsOutput ;
   private boolean n99DEVOC_ESTADO ;
   private boolean wbErr ;
   private boolean n96DEVOC_REGIONAL ;
   private boolean n101DEVOC_TRAN_ID ;
   private boolean n722DEVOC_TIPO_MOVIMIENTO ;
   private boolean n100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean n723DEVOC_TRAN_CC ;
   private boolean n103DEVOC_FECHA_MOVIMIENTO ;
   private boolean n724DEVOC_RENGLON ;
   private boolean n746DEVOC_DESCRIPCION ;
   private boolean n725DEVOC_PLACA ;
   private boolean n726DEVOC_PLACA_PADRE ;
   private boolean n727DEVOC_SERIAL ;
   private boolean n728DEVOC_MARCA ;
   private boolean n729DEVOC_MARCA2 ;
   private boolean n730DEVOC_MODELO ;
   private boolean n731DEVOC_VIDA_UTIL ;
   private boolean n732DEVOC_VALOR_ADQUISICION ;
   private boolean n733DEVOC_FECHA_ADQUISICION ;
   private boolean n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean n734DEVOC_MODULO_ORIGEN ;
   private boolean n735DEVOC_ALMA_ORIGEN ;
   private boolean n736DEVOC_BODEGA_ORIGEN ;
   private boolean n98DEVOC_NIT_ORIGEN ;
   private boolean n737DEVOC_REGIONAL_DESTINO ;
   private boolean n738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean n739DEVOC_MODULO_DESTINO ;
   private boolean n740DEVOC_ALMA_DESTINO ;
   private boolean n741DEVOC_BODEGA_DESTINO ;
   private boolean n742DEVOC_NIT_DESTINO ;
   private boolean n743DEVOC_PROVEEDOR_ID ;
   private boolean n744DEVOC_FECHA_SERVICIO ;
   private boolean n745DEVOC_ACTA_ENTREGA ;
   private boolean n748DEVOC_TRAN_OBSERVACIONES ;
   private boolean n749DEVOC_CURSO_ID ;
   private boolean n750DEVOC_AREADANTE_ID ;
   private boolean n751DEVOC_TIPO_INGRESO ;
   private boolean n752DEVOC_NUMERO_INGRESO ;
   private boolean n753DEVOC_FECHA_INGRESO ;
   private boolean Gx_longc ;
   private String Z722DEVOC_TIPO_MOVIMIENTO ;
   private String Z100DEVOC_CODIGO_MOVIMIENTO ;
   private String Z725DEVOC_PLACA ;
   private String Z726DEVOC_PLACA_PADRE ;
   private String Z727DEVOC_SERIAL ;
   private String Z728DEVOC_MARCA ;
   private String Z729DEVOC_MARCA2 ;
   private String Z730DEVOC_MODELO ;
   private String Z99DEVOC_ESTADO ;
   private String Z734DEVOC_MODULO_ORIGEN ;
   private String Z735DEVOC_ALMA_ORIGEN ;
   private String Z736DEVOC_BODEGA_ORIGEN ;
   private String Z739DEVOC_MODULO_DESTINO ;
   private String Z740DEVOC_ALMA_DESTINO ;
   private String Z741DEVOC_BODEGA_DESTINO ;
   private String Z748DEVOC_TRAN_OBSERVACIONES ;
   private String Z749DEVOC_CURSO_ID ;
   private String Z750DEVOC_AREADANTE_ID ;
   private String Z752DEVOC_NUMERO_INGRESO ;
   private String Z102DEVOC_CONSECUTIVO ;
   private String A102DEVOC_CONSECUTIVO ;
   private String A757DEVOC_CATACODIGO ;
   private String A99DEVOC_ESTADO ;
   private String A722DEVOC_TIPO_MOVIMIENTO ;
   private String A100DEVOC_CODIGO_MOVIMIENTO ;
   private String A746DEVOC_DESCRIPCION ;
   private String A725DEVOC_PLACA ;
   private String A726DEVOC_PLACA_PADRE ;
   private String A727DEVOC_SERIAL ;
   private String A728DEVOC_MARCA ;
   private String A729DEVOC_MARCA2 ;
   private String A730DEVOC_MODELO ;
   private String A734DEVOC_MODULO_ORIGEN ;
   private String A735DEVOC_ALMA_ORIGEN ;
   private String A736DEVOC_BODEGA_ORIGEN ;
   private String A739DEVOC_MODULO_DESTINO ;
   private String A740DEVOC_ALMA_DESTINO ;
   private String A741DEVOC_BODEGA_DESTINO ;
   private String A748DEVOC_TRAN_OBSERVACIONES ;
   private String A749DEVOC_CURSO_ID ;
   private String A750DEVOC_AREADANTE_ID ;
   private String A752DEVOC_NUMERO_INGRESO ;
   private String Z757DEVOC_CATACODIGO ;
   private String Z746DEVOC_DESCRIPCION ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbDEVOC_ESTADO ;
   private IDataStoreProvider pr_default ;
   private long[] T000X6_A95DEVOC_ID ;
   private long[] T000X6_A96DEVOC_REGIONAL ;
   private boolean[] T000X6_n96DEVOC_REGIONAL ;
   private long[] T000X6_A101DEVOC_TRAN_ID ;
   private boolean[] T000X6_n101DEVOC_TRAN_ID ;
   private String[] T000X6_A722DEVOC_TIPO_MOVIMIENTO ;
   private boolean[] T000X6_n722DEVOC_TIPO_MOVIMIENTO ;
   private String[] T000X6_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] T000X6_n100DEVOC_CODIGO_MOVIMIENTO ;
   private long[] T000X6_A723DEVOC_TRAN_CC ;
   private boolean[] T000X6_n723DEVOC_TRAN_CC ;
   private java.util.Date[] T000X6_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] T000X6_n103DEVOC_FECHA_MOVIMIENTO ;
   private int[] T000X6_A724DEVOC_RENGLON ;
   private boolean[] T000X6_n724DEVOC_RENGLON ;
   private String[] T000X6_A746DEVOC_DESCRIPCION ;
   private boolean[] T000X6_n746DEVOC_DESCRIPCION ;
   private String[] T000X6_A725DEVOC_PLACA ;
   private boolean[] T000X6_n725DEVOC_PLACA ;
   private String[] T000X6_A726DEVOC_PLACA_PADRE ;
   private boolean[] T000X6_n726DEVOC_PLACA_PADRE ;
   private String[] T000X6_A727DEVOC_SERIAL ;
   private boolean[] T000X6_n727DEVOC_SERIAL ;
   private String[] T000X6_A728DEVOC_MARCA ;
   private boolean[] T000X6_n728DEVOC_MARCA ;
   private String[] T000X6_A729DEVOC_MARCA2 ;
   private boolean[] T000X6_n729DEVOC_MARCA2 ;
   private String[] T000X6_A730DEVOC_MODELO ;
   private boolean[] T000X6_n730DEVOC_MODELO ;
   private short[] T000X6_A731DEVOC_VIDA_UTIL ;
   private boolean[] T000X6_n731DEVOC_VIDA_UTIL ;
   private java.math.BigDecimal[] T000X6_A732DEVOC_VALOR_ADQUISICION ;
   private boolean[] T000X6_n732DEVOC_VALOR_ADQUISICION ;
   private java.util.Date[] T000X6_A733DEVOC_FECHA_ADQUISICION ;
   private boolean[] T000X6_n733DEVOC_FECHA_ADQUISICION ;
   private String[] T000X6_A99DEVOC_ESTADO ;
   private boolean[] T000X6_n99DEVOC_ESTADO ;
   private long[] T000X6_A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean[] T000X6_n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private String[] T000X6_A734DEVOC_MODULO_ORIGEN ;
   private boolean[] T000X6_n734DEVOC_MODULO_ORIGEN ;
   private String[] T000X6_A735DEVOC_ALMA_ORIGEN ;
   private boolean[] T000X6_n735DEVOC_ALMA_ORIGEN ;
   private String[] T000X6_A736DEVOC_BODEGA_ORIGEN ;
   private boolean[] T000X6_n736DEVOC_BODEGA_ORIGEN ;
   private long[] T000X6_A98DEVOC_NIT_ORIGEN ;
   private boolean[] T000X6_n98DEVOC_NIT_ORIGEN ;
   private long[] T000X6_A737DEVOC_REGIONAL_DESTINO ;
   private boolean[] T000X6_n737DEVOC_REGIONAL_DESTINO ;
   private long[] T000X6_A738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean[] T000X6_n738DEVOC_CENTRO_COSTO_DESTINO ;
   private String[] T000X6_A739DEVOC_MODULO_DESTINO ;
   private boolean[] T000X6_n739DEVOC_MODULO_DESTINO ;
   private String[] T000X6_A740DEVOC_ALMA_DESTINO ;
   private boolean[] T000X6_n740DEVOC_ALMA_DESTINO ;
   private String[] T000X6_A741DEVOC_BODEGA_DESTINO ;
   private boolean[] T000X6_n741DEVOC_BODEGA_DESTINO ;
   private long[] T000X6_A742DEVOC_NIT_DESTINO ;
   private boolean[] T000X6_n742DEVOC_NIT_DESTINO ;
   private long[] T000X6_A743DEVOC_PROVEEDOR_ID ;
   private boolean[] T000X6_n743DEVOC_PROVEEDOR_ID ;
   private java.util.Date[] T000X6_A744DEVOC_FECHA_SERVICIO ;
   private boolean[] T000X6_n744DEVOC_FECHA_SERVICIO ;
   private int[] T000X6_A745DEVOC_ACTA_ENTREGA ;
   private boolean[] T000X6_n745DEVOC_ACTA_ENTREGA ;
   private String[] T000X6_A748DEVOC_TRAN_OBSERVACIONES ;
   private boolean[] T000X6_n748DEVOC_TRAN_OBSERVACIONES ;
   private String[] T000X6_A749DEVOC_CURSO_ID ;
   private boolean[] T000X6_n749DEVOC_CURSO_ID ;
   private String[] T000X6_A750DEVOC_AREADANTE_ID ;
   private boolean[] T000X6_n750DEVOC_AREADANTE_ID ;
   private long[] T000X6_A751DEVOC_TIPO_INGRESO ;
   private boolean[] T000X6_n751DEVOC_TIPO_INGRESO ;
   private String[] T000X6_A752DEVOC_NUMERO_INGRESO ;
   private boolean[] T000X6_n752DEVOC_NUMERO_INGRESO ;
   private short[] T000X6_A753DEVOC_FECHA_INGRESO ;
   private boolean[] T000X6_n753DEVOC_FECHA_INGRESO ;
   private String[] T000X6_A102DEVOC_CONSECUTIVO ;
   private boolean[] T000X6_n102DEVOC_CONSECUTIVO ;
   private String[] T000X6_A757DEVOC_CATACODIGO ;
   private boolean[] T000X6_n757DEVOC_CATACODIGO ;
   private String[] T000X4_A757DEVOC_CATACODIGO ;
   private boolean[] T000X4_n757DEVOC_CATACODIGO ;
   private String[] T000X5_A746DEVOC_DESCRIPCION ;
   private boolean[] T000X5_n746DEVOC_DESCRIPCION ;
   private String[] T000X7_A757DEVOC_CATACODIGO ;
   private boolean[] T000X7_n757DEVOC_CATACODIGO ;
   private String[] T000X8_A746DEVOC_DESCRIPCION ;
   private boolean[] T000X8_n746DEVOC_DESCRIPCION ;
   private long[] T000X9_A95DEVOC_ID ;
   private long[] T000X3_A95DEVOC_ID ;
   private long[] T000X3_A96DEVOC_REGIONAL ;
   private boolean[] T000X3_n96DEVOC_REGIONAL ;
   private long[] T000X3_A101DEVOC_TRAN_ID ;
   private boolean[] T000X3_n101DEVOC_TRAN_ID ;
   private String[] T000X3_A722DEVOC_TIPO_MOVIMIENTO ;
   private boolean[] T000X3_n722DEVOC_TIPO_MOVIMIENTO ;
   private String[] T000X3_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] T000X3_n100DEVOC_CODIGO_MOVIMIENTO ;
   private long[] T000X3_A723DEVOC_TRAN_CC ;
   private boolean[] T000X3_n723DEVOC_TRAN_CC ;
   private java.util.Date[] T000X3_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] T000X3_n103DEVOC_FECHA_MOVIMIENTO ;
   private int[] T000X3_A724DEVOC_RENGLON ;
   private boolean[] T000X3_n724DEVOC_RENGLON ;
   private String[] T000X3_A725DEVOC_PLACA ;
   private boolean[] T000X3_n725DEVOC_PLACA ;
   private String[] T000X3_A726DEVOC_PLACA_PADRE ;
   private boolean[] T000X3_n726DEVOC_PLACA_PADRE ;
   private String[] T000X3_A727DEVOC_SERIAL ;
   private boolean[] T000X3_n727DEVOC_SERIAL ;
   private String[] T000X3_A728DEVOC_MARCA ;
   private boolean[] T000X3_n728DEVOC_MARCA ;
   private String[] T000X3_A729DEVOC_MARCA2 ;
   private boolean[] T000X3_n729DEVOC_MARCA2 ;
   private String[] T000X3_A730DEVOC_MODELO ;
   private boolean[] T000X3_n730DEVOC_MODELO ;
   private short[] T000X3_A731DEVOC_VIDA_UTIL ;
   private boolean[] T000X3_n731DEVOC_VIDA_UTIL ;
   private java.math.BigDecimal[] T000X3_A732DEVOC_VALOR_ADQUISICION ;
   private boolean[] T000X3_n732DEVOC_VALOR_ADQUISICION ;
   private java.util.Date[] T000X3_A733DEVOC_FECHA_ADQUISICION ;
   private boolean[] T000X3_n733DEVOC_FECHA_ADQUISICION ;
   private String[] T000X3_A99DEVOC_ESTADO ;
   private boolean[] T000X3_n99DEVOC_ESTADO ;
   private long[] T000X3_A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean[] T000X3_n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private String[] T000X3_A734DEVOC_MODULO_ORIGEN ;
   private boolean[] T000X3_n734DEVOC_MODULO_ORIGEN ;
   private String[] T000X3_A735DEVOC_ALMA_ORIGEN ;
   private boolean[] T000X3_n735DEVOC_ALMA_ORIGEN ;
   private String[] T000X3_A736DEVOC_BODEGA_ORIGEN ;
   private boolean[] T000X3_n736DEVOC_BODEGA_ORIGEN ;
   private long[] T000X3_A98DEVOC_NIT_ORIGEN ;
   private boolean[] T000X3_n98DEVOC_NIT_ORIGEN ;
   private long[] T000X3_A737DEVOC_REGIONAL_DESTINO ;
   private boolean[] T000X3_n737DEVOC_REGIONAL_DESTINO ;
   private long[] T000X3_A738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean[] T000X3_n738DEVOC_CENTRO_COSTO_DESTINO ;
   private String[] T000X3_A739DEVOC_MODULO_DESTINO ;
   private boolean[] T000X3_n739DEVOC_MODULO_DESTINO ;
   private String[] T000X3_A740DEVOC_ALMA_DESTINO ;
   private boolean[] T000X3_n740DEVOC_ALMA_DESTINO ;
   private String[] T000X3_A741DEVOC_BODEGA_DESTINO ;
   private boolean[] T000X3_n741DEVOC_BODEGA_DESTINO ;
   private long[] T000X3_A742DEVOC_NIT_DESTINO ;
   private boolean[] T000X3_n742DEVOC_NIT_DESTINO ;
   private long[] T000X3_A743DEVOC_PROVEEDOR_ID ;
   private boolean[] T000X3_n743DEVOC_PROVEEDOR_ID ;
   private java.util.Date[] T000X3_A744DEVOC_FECHA_SERVICIO ;
   private boolean[] T000X3_n744DEVOC_FECHA_SERVICIO ;
   private int[] T000X3_A745DEVOC_ACTA_ENTREGA ;
   private boolean[] T000X3_n745DEVOC_ACTA_ENTREGA ;
   private String[] T000X3_A748DEVOC_TRAN_OBSERVACIONES ;
   private boolean[] T000X3_n748DEVOC_TRAN_OBSERVACIONES ;
   private String[] T000X3_A749DEVOC_CURSO_ID ;
   private boolean[] T000X3_n749DEVOC_CURSO_ID ;
   private String[] T000X3_A750DEVOC_AREADANTE_ID ;
   private boolean[] T000X3_n750DEVOC_AREADANTE_ID ;
   private long[] T000X3_A751DEVOC_TIPO_INGRESO ;
   private boolean[] T000X3_n751DEVOC_TIPO_INGRESO ;
   private String[] T000X3_A752DEVOC_NUMERO_INGRESO ;
   private boolean[] T000X3_n752DEVOC_NUMERO_INGRESO ;
   private short[] T000X3_A753DEVOC_FECHA_INGRESO ;
   private boolean[] T000X3_n753DEVOC_FECHA_INGRESO ;
   private String[] T000X3_A102DEVOC_CONSECUTIVO ;
   private boolean[] T000X3_n102DEVOC_CONSECUTIVO ;
   private long[] T000X10_A95DEVOC_ID ;
   private long[] T000X11_A95DEVOC_ID ;
   private long[] T000X2_A95DEVOC_ID ;
   private long[] T000X2_A96DEVOC_REGIONAL ;
   private boolean[] T000X2_n96DEVOC_REGIONAL ;
   private long[] T000X2_A101DEVOC_TRAN_ID ;
   private boolean[] T000X2_n101DEVOC_TRAN_ID ;
   private String[] T000X2_A722DEVOC_TIPO_MOVIMIENTO ;
   private boolean[] T000X2_n722DEVOC_TIPO_MOVIMIENTO ;
   private String[] T000X2_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] T000X2_n100DEVOC_CODIGO_MOVIMIENTO ;
   private long[] T000X2_A723DEVOC_TRAN_CC ;
   private boolean[] T000X2_n723DEVOC_TRAN_CC ;
   private java.util.Date[] T000X2_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] T000X2_n103DEVOC_FECHA_MOVIMIENTO ;
   private int[] T000X2_A724DEVOC_RENGLON ;
   private boolean[] T000X2_n724DEVOC_RENGLON ;
   private String[] T000X2_A725DEVOC_PLACA ;
   private boolean[] T000X2_n725DEVOC_PLACA ;
   private String[] T000X2_A726DEVOC_PLACA_PADRE ;
   private boolean[] T000X2_n726DEVOC_PLACA_PADRE ;
   private String[] T000X2_A727DEVOC_SERIAL ;
   private boolean[] T000X2_n727DEVOC_SERIAL ;
   private String[] T000X2_A728DEVOC_MARCA ;
   private boolean[] T000X2_n728DEVOC_MARCA ;
   private String[] T000X2_A729DEVOC_MARCA2 ;
   private boolean[] T000X2_n729DEVOC_MARCA2 ;
   private String[] T000X2_A730DEVOC_MODELO ;
   private boolean[] T000X2_n730DEVOC_MODELO ;
   private short[] T000X2_A731DEVOC_VIDA_UTIL ;
   private boolean[] T000X2_n731DEVOC_VIDA_UTIL ;
   private java.math.BigDecimal[] T000X2_A732DEVOC_VALOR_ADQUISICION ;
   private boolean[] T000X2_n732DEVOC_VALOR_ADQUISICION ;
   private java.util.Date[] T000X2_A733DEVOC_FECHA_ADQUISICION ;
   private boolean[] T000X2_n733DEVOC_FECHA_ADQUISICION ;
   private String[] T000X2_A99DEVOC_ESTADO ;
   private boolean[] T000X2_n99DEVOC_ESTADO ;
   private long[] T000X2_A97DEVOC_CENTRO_COSTO_ORIGEN ;
   private boolean[] T000X2_n97DEVOC_CENTRO_COSTO_ORIGEN ;
   private String[] T000X2_A734DEVOC_MODULO_ORIGEN ;
   private boolean[] T000X2_n734DEVOC_MODULO_ORIGEN ;
   private String[] T000X2_A735DEVOC_ALMA_ORIGEN ;
   private boolean[] T000X2_n735DEVOC_ALMA_ORIGEN ;
   private String[] T000X2_A736DEVOC_BODEGA_ORIGEN ;
   private boolean[] T000X2_n736DEVOC_BODEGA_ORIGEN ;
   private long[] T000X2_A98DEVOC_NIT_ORIGEN ;
   private boolean[] T000X2_n98DEVOC_NIT_ORIGEN ;
   private long[] T000X2_A737DEVOC_REGIONAL_DESTINO ;
   private boolean[] T000X2_n737DEVOC_REGIONAL_DESTINO ;
   private long[] T000X2_A738DEVOC_CENTRO_COSTO_DESTINO ;
   private boolean[] T000X2_n738DEVOC_CENTRO_COSTO_DESTINO ;
   private String[] T000X2_A739DEVOC_MODULO_DESTINO ;
   private boolean[] T000X2_n739DEVOC_MODULO_DESTINO ;
   private String[] T000X2_A740DEVOC_ALMA_DESTINO ;
   private boolean[] T000X2_n740DEVOC_ALMA_DESTINO ;
   private String[] T000X2_A741DEVOC_BODEGA_DESTINO ;
   private boolean[] T000X2_n741DEVOC_BODEGA_DESTINO ;
   private long[] T000X2_A742DEVOC_NIT_DESTINO ;
   private boolean[] T000X2_n742DEVOC_NIT_DESTINO ;
   private long[] T000X2_A743DEVOC_PROVEEDOR_ID ;
   private boolean[] T000X2_n743DEVOC_PROVEEDOR_ID ;
   private java.util.Date[] T000X2_A744DEVOC_FECHA_SERVICIO ;
   private boolean[] T000X2_n744DEVOC_FECHA_SERVICIO ;
   private int[] T000X2_A745DEVOC_ACTA_ENTREGA ;
   private boolean[] T000X2_n745DEVOC_ACTA_ENTREGA ;
   private String[] T000X2_A748DEVOC_TRAN_OBSERVACIONES ;
   private boolean[] T000X2_n748DEVOC_TRAN_OBSERVACIONES ;
   private String[] T000X2_A749DEVOC_CURSO_ID ;
   private boolean[] T000X2_n749DEVOC_CURSO_ID ;
   private String[] T000X2_A750DEVOC_AREADANTE_ID ;
   private boolean[] T000X2_n750DEVOC_AREADANTE_ID ;
   private long[] T000X2_A751DEVOC_TIPO_INGRESO ;
   private boolean[] T000X2_n751DEVOC_TIPO_INGRESO ;
   private String[] T000X2_A752DEVOC_NUMERO_INGRESO ;
   private boolean[] T000X2_n752DEVOC_NUMERO_INGRESO ;
   private short[] T000X2_A753DEVOC_FECHA_INGRESO ;
   private boolean[] T000X2_n753DEVOC_FECHA_INGRESO ;
   private String[] T000X2_A102DEVOC_CONSECUTIVO ;
   private boolean[] T000X2_n102DEVOC_CONSECUTIVO ;
   private long[] T000X13_A95DEVOC_ID ;
   private String[] T000X16_A757DEVOC_CATACODIGO ;
   private boolean[] T000X16_n757DEVOC_CATACODIGO ;
   private String[] T000X17_A746DEVOC_DESCRIPCION ;
   private boolean[] T000X17_n746DEVOC_DESCRIPCION ;
   private long[] T000X18_A95DEVOC_ID ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class alm_devo_hist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000X2", "SELECT DEVOC_ID, DEVOC_REGIONAL, DEVOC_TRAN_ID, DEVOC_TIPO_MOVIMIENTO, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TRAN_CC, DEVOC_FECHA_MOVIMIENTO, DEVOC_RENGLON, DEVOC_PLACA, DEVOC_PLACA_PADRE, DEVOC_SERIAL, DEVOC_MARCA, DEVOC_MARCA2, DEVOC_MODELO, DEVOC_VIDA_UTIL, DEVOC_VALOR_ADQUISICION, DEVOC_FECHA_ADQUISICION, DEVOC_ESTADO, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_MODULO_ORIGEN, DEVOC_ALMA_ORIGEN, DEVOC_BODEGA_ORIGEN, DEVOC_NIT_ORIGEN, DEVOC_REGIONAL_DESTINO, DEVOC_CENTRO_COSTO_DESTINO, DEVOC_MODULO_DESTINO, DEVOC_ALMA_DESTINO, DEVOC_BODEGA_DESTINO, DEVOC_NIT_DESTINO, DEVOC_PROVEEDOR_ID, DEVOC_FECHA_SERVICIO, DEVOC_ACTA_ENTREGA, DEVOC_TRAN_OBSERVACIONES, DEVOC_CURSO_ID, DEVOC_AREADANTE_ID, DEVOC_TIPO_INGRESO, DEVOC_NUMERO_INGRESO, DEVOC_FECHA_INGRESO, DEVOC_CONSECUTIVO FROM ALM_DEVO_HIST WHERE DEVOC_ID = ?  FOR UPDATE OF DEVOC_REGIONAL, DEVOC_TRAN_ID, DEVOC_TIPO_MOVIMIENTO, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TRAN_CC, DEVOC_FECHA_MOVIMIENTO, DEVOC_RENGLON, DEVOC_PLACA, DEVOC_PLACA_PADRE, DEVOC_SERIAL, DEVOC_MARCA, DEVOC_MARCA2, DEVOC_MODELO, DEVOC_VIDA_UTIL, DEVOC_VALOR_ADQUISICION, DEVOC_FECHA_ADQUISICION, DEVOC_ESTADO, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_MODULO_ORIGEN, DEVOC_ALMA_ORIGEN, DEVOC_BODEGA_ORIGEN, DEVOC_NIT_ORIGEN, DEVOC_REGIONAL_DESTINO, DEVOC_CENTRO_COSTO_DESTINO, DEVOC_MODULO_DESTINO, DEVOC_ALMA_DESTINO, DEVOC_BODEGA_DESTINO, DEVOC_NIT_DESTINO, DEVOC_PROVEEDOR_ID, DEVOC_FECHA_SERVICIO, DEVOC_ACTA_ENTREGA, DEVOC_TRAN_OBSERVACIONES, DEVOC_CURSO_ID, DEVOC_AREADANTE_ID, DEVOC_TIPO_INGRESO, DEVOC_NUMERO_INGRESO, DEVOC_FECHA_INGRESO, DEVOC_CONSECUTIVO NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X3", "SELECT DEVOC_ID, DEVOC_REGIONAL, DEVOC_TRAN_ID, DEVOC_TIPO_MOVIMIENTO, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TRAN_CC, DEVOC_FECHA_MOVIMIENTO, DEVOC_RENGLON, DEVOC_PLACA, DEVOC_PLACA_PADRE, DEVOC_SERIAL, DEVOC_MARCA, DEVOC_MARCA2, DEVOC_MODELO, DEVOC_VIDA_UTIL, DEVOC_VALOR_ADQUISICION, DEVOC_FECHA_ADQUISICION, DEVOC_ESTADO, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_MODULO_ORIGEN, DEVOC_ALMA_ORIGEN, DEVOC_BODEGA_ORIGEN, DEVOC_NIT_ORIGEN, DEVOC_REGIONAL_DESTINO, DEVOC_CENTRO_COSTO_DESTINO, DEVOC_MODULO_DESTINO, DEVOC_ALMA_DESTINO, DEVOC_BODEGA_DESTINO, DEVOC_NIT_DESTINO, DEVOC_PROVEEDOR_ID, DEVOC_FECHA_SERVICIO, DEVOC_ACTA_ENTREGA, DEVOC_TRAN_OBSERVACIONES, DEVOC_CURSO_ID, DEVOC_AREADANTE_ID, DEVOC_TIPO_INGRESO, DEVOC_NUMERO_INGRESO, DEVOC_FECHA_INGRESO, DEVOC_CONSECUTIVO FROM ALM_DEVO_HIST WHERE DEVOC_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X4", "SELECT Cata_Codigo AS DEVOC_CATACODIGO FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X5", "SELECT Cata_Descripcion AS DEVOC_DESCRIPCION FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X6", "SELECT /*+ FIRST_ROWS(100) */ TM1.DEVOC_ID, TM1.DEVOC_REGIONAL, TM1.DEVOC_TRAN_ID, TM1.DEVOC_TIPO_MOVIMIENTO, TM1.DEVOC_CODIGO_MOVIMIENTO, TM1.DEVOC_TRAN_CC, TM1.DEVOC_FECHA_MOVIMIENTO, TM1.DEVOC_RENGLON, T3.Cata_Descripcion AS DEVOC_DESCRIPCION, TM1.DEVOC_PLACA, TM1.DEVOC_PLACA_PADRE, TM1.DEVOC_SERIAL, TM1.DEVOC_MARCA, TM1.DEVOC_MARCA2, TM1.DEVOC_MODELO, TM1.DEVOC_VIDA_UTIL, TM1.DEVOC_VALOR_ADQUISICION, TM1.DEVOC_FECHA_ADQUISICION, TM1.DEVOC_ESTADO, TM1.DEVOC_CENTRO_COSTO_ORIGEN, TM1.DEVOC_MODULO_ORIGEN, TM1.DEVOC_ALMA_ORIGEN, TM1.DEVOC_BODEGA_ORIGEN, TM1.DEVOC_NIT_ORIGEN, TM1.DEVOC_REGIONAL_DESTINO, TM1.DEVOC_CENTRO_COSTO_DESTINO, TM1.DEVOC_MODULO_DESTINO, TM1.DEVOC_ALMA_DESTINO, TM1.DEVOC_BODEGA_DESTINO, TM1.DEVOC_NIT_DESTINO, TM1.DEVOC_PROVEEDOR_ID, TM1.DEVOC_FECHA_SERVICIO, TM1.DEVOC_ACTA_ENTREGA, TM1.DEVOC_TRAN_OBSERVACIONES, TM1.DEVOC_CURSO_ID, TM1.DEVOC_AREADANTE_ID, TM1.DEVOC_TIPO_INGRESO, TM1.DEVOC_NUMERO_INGRESO, TM1.DEVOC_FECHA_INGRESO, TM1.DEVOC_CONSECUTIVO AS DEVOC_CONSECUTIVO, T2.Cata_Codigo AS DEVOC_CATACODIGO FROM ((ALM_DEVO_HIST TM1 LEFT JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = TM1.DEVOC_CONSECUTIVO) LEFT JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE TM1.DEVOC_ID = ? ORDER BY TM1.DEVOC_ID ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000X7", "SELECT Cata_Codigo AS DEVOC_CATACODIGO FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X8", "SELECT Cata_Descripcion AS DEVOC_DESCRIPCION FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X9", "SELECT /*+ FIRST_ROWS(1) */ DEVOC_ID FROM ALM_DEVO_HIST WHERE DEVOC_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DEVOC_ID FROM ALM_DEVO_HIST WHERE ( DEVOC_ID > ?) ORDER BY DEVOC_ID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000X11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DEVOC_ID FROM ALM_DEVO_HIST WHERE ( DEVOC_ID < ?) ORDER BY DEVOC_ID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000X12", "INSERT INTO ALM_DEVO_HIST(DEVOC_REGIONAL, DEVOC_TRAN_ID, DEVOC_TIPO_MOVIMIENTO, DEVOC_CODIGO_MOVIMIENTO, DEVOC_TRAN_CC, DEVOC_FECHA_MOVIMIENTO, DEVOC_RENGLON, DEVOC_PLACA, DEVOC_PLACA_PADRE, DEVOC_SERIAL, DEVOC_MARCA, DEVOC_MARCA2, DEVOC_MODELO, DEVOC_VIDA_UTIL, DEVOC_VALOR_ADQUISICION, DEVOC_FECHA_ADQUISICION, DEVOC_ESTADO, DEVOC_CENTRO_COSTO_ORIGEN, DEVOC_MODULO_ORIGEN, DEVOC_ALMA_ORIGEN, DEVOC_BODEGA_ORIGEN, DEVOC_NIT_ORIGEN, DEVOC_REGIONAL_DESTINO, DEVOC_CENTRO_COSTO_DESTINO, DEVOC_MODULO_DESTINO, DEVOC_ALMA_DESTINO, DEVOC_BODEGA_DESTINO, DEVOC_NIT_DESTINO, DEVOC_PROVEEDOR_ID, DEVOC_FECHA_SERVICIO, DEVOC_ACTA_ENTREGA, DEVOC_TRAN_OBSERVACIONES, DEVOC_CURSO_ID, DEVOC_AREADANTE_ID, DEVOC_TIPO_INGRESO, DEVOC_NUMERO_INGRESO, DEVOC_FECHA_INGRESO, DEVOC_CONSECUTIVO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_DEVO_HIST")
         ,new ForEachCursor("T000X13", "SELECT DEVOC_ID.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000X14", "UPDATE ALM_DEVO_HIST SET DEVOC_REGIONAL=?, DEVOC_TRAN_ID=?, DEVOC_TIPO_MOVIMIENTO=?, DEVOC_CODIGO_MOVIMIENTO=?, DEVOC_TRAN_CC=?, DEVOC_FECHA_MOVIMIENTO=?, DEVOC_RENGLON=?, DEVOC_PLACA=?, DEVOC_PLACA_PADRE=?, DEVOC_SERIAL=?, DEVOC_MARCA=?, DEVOC_MARCA2=?, DEVOC_MODELO=?, DEVOC_VIDA_UTIL=?, DEVOC_VALOR_ADQUISICION=?, DEVOC_FECHA_ADQUISICION=?, DEVOC_ESTADO=?, DEVOC_CENTRO_COSTO_ORIGEN=?, DEVOC_MODULO_ORIGEN=?, DEVOC_ALMA_ORIGEN=?, DEVOC_BODEGA_ORIGEN=?, DEVOC_NIT_ORIGEN=?, DEVOC_REGIONAL_DESTINO=?, DEVOC_CENTRO_COSTO_DESTINO=?, DEVOC_MODULO_DESTINO=?, DEVOC_ALMA_DESTINO=?, DEVOC_BODEGA_DESTINO=?, DEVOC_NIT_DESTINO=?, DEVOC_PROVEEDOR_ID=?, DEVOC_FECHA_SERVICIO=?, DEVOC_ACTA_ENTREGA=?, DEVOC_TRAN_OBSERVACIONES=?, DEVOC_CURSO_ID=?, DEVOC_AREADANTE_ID=?, DEVOC_TIPO_INGRESO=?, DEVOC_NUMERO_INGRESO=?, DEVOC_FECHA_INGRESO=?, DEVOC_CONSECUTIVO=?  WHERE DEVOC_ID = ?", GX_NOMASK, "ALM_DEVO_HIST")
         ,new UpdateCursor("T000X15", "DELETE FROM ALM_DEVO_HIST  WHERE DEVOC_ID = ?", GX_NOMASK, "ALM_DEVO_HIST")
         ,new ForEachCursor("T000X16", "SELECT Cata_Codigo AS DEVOC_CATACODIGO FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X17", "SELECT Cata_Descripcion AS DEVOC_DESCRIPCION FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X18", "SELECT /*+ FIRST_ROWS(100) */ DEVOC_ID FROM ALM_DEVO_HIST ORDER BY DEVOC_ID ",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((long[]) buf[43])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((long[]) buf[69])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((long[]) buf[43])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((int[]) buf[61])[0] = rslt.getInt(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((long[]) buf[69])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((long[]) buf[45])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((long[]) buf[71])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(39) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(5, ((Number) parms[9]).longValue(), 0);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 30);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 200);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[35]).longValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 3);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(22, ((Number) parms[43]).longValue(), 0);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[45]).longValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[47]).longValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 8);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 3);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(28, ((Number) parms[55]).longValue(), 0);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(29, ((Number) parms[57]).longValue(), 0);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[59]);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 100);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[65], 41);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 20);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(35, ((Number) parms[69]).longValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 30);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[73]).shortValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 9);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(5, ((Number) parms[9]).longValue(), 0);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 30);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 200);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[35]).longValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 3);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(22, ((Number) parms[43]).longValue(), 0);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(23, ((Number) parms[45]).longValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[47]).longValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 8);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 3);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(28, ((Number) parms[55]).longValue(), 0);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(29, ((Number) parms[57]).longValue(), 0);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[59]);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[63], 100);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[65], 41);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 20);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(35, ((Number) parms[69]).longValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 30);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[73]).shortValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 9);
               }
               stmt.setLong(39, ((Number) parms[76]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9, false);
               }
               return;
      }
   }

}

