/*
               File: alm_nove_masivo_impl
        Description: Novedades Masivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 8, 2018 8:58:23.38
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

public final  class alm_nove_masivo_impl extends GXDataArea
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
      cmbNovM_Estado.setName( "NOVM_ESTADO" );
      cmbNovM_Estado.setWebtags( "" );
      if ( cmbNovM_Estado.getItemCount() > 0 )
      {
         A837NovM_Estado = cmbNovM_Estado.getValidValue(A837NovM_Estado) ;
         n837NovM_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
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
         Form.getMeta().addItem("description", "Novedades Masivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtNovM_Identificador_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_nove_masivo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_nove_masivo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_nove_masivo_impl.class ));
   }

   public alm_nove_masivo_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbNovM_Estado = new HTMLChoice();
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
      if ( cmbNovM_Estado.getItemCount() > 0 )
      {
         A837NovM_Estado = cmbNovM_Estado.getValidValue(A837NovM_Estado) ;
         n837NovM_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Novedades Masivo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx01r0"+"',["+"{Ctrl:gx.dom.el('"+"NOVM_IDENTIFICADOR"+"'), id:'"+"NOVM_IDENTIFICADOR"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"NOVM_SECUENCIA"+"'), id:'"+"NOVM_SECUENCIA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_Identificador_Internalname, "Masivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNovM_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A832NovM_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtNovM_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A832NovM_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A832NovM_Identificador), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNovM_Identificador_Jsonclick, 0, "Attribute", "", "", "", 1, edtNovM_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_Secuencia_Internalname, "Secuencia", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNovM_Secuencia_Internalname, GXutil.ltrim( localUtil.ntoc( A833NovM_Secuencia, (byte)(5), (byte)(0), ",", "")), ((edtNovM_Secuencia_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833NovM_Secuencia), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A833NovM_Secuencia), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNovM_Secuencia_Jsonclick, 0, "Attribute", "", "", "", 1, edtNovM_Secuencia_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_Placa_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNovM_Placa_Internalname, A834NovM_Placa, GXutil.rtrim( localUtil.format( A834NovM_Placa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNovM_Placa_Jsonclick, 0, "Attribute", "", "", "", 1, edtNovM_Placa_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_ValorNuevo_Internalname, "Nuevo", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNovM_ValorNuevo_Internalname, A835NovM_ValorNuevo, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", (short)(0), 1, edtNovM_ValorNuevo_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_RegionId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNovM_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A836NovM_RegionId, (byte)(4), (byte)(0), ",", "")), ((edtNovM_RegionId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A836NovM_RegionId), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A836NovM_RegionId), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNovM_RegionId_Jsonclick, 0, "Attribute", "", "", "", 1, edtNovM_RegionId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVE_MASIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbNovM_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNovM_Estado, cmbNovM_Estado.getInternalname(), GXutil.rtrim( A837NovM_Estado), 1, cmbNovM_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNovM_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, "HLP_ALM_NOVE_MASIVO.htm");
         cmbNovM_Estado.setValue( GXutil.rtrim( A837NovM_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNovM_Estado.getInternalname(), "Values", cmbNovM_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNovM_Error_Internalname, "Error", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNovM_Error_Internalname, A838NovM_Error, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", (short)(0), 1, edtNovM_Error_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVE_MASIVO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVE_MASIVO.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_Identificador_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_Identificador_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOVM_IDENTIFICADOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNovM_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A832NovM_Identificador = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
            }
            else
            {
               A832NovM_Identificador = localUtil.ctol( httpContext.cgiGet( edtNovM_Identificador_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_Secuencia_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_Secuencia_Internalname), ",", ".") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOVM_SECUENCIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNovM_Secuencia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A833NovM_Secuencia = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
            }
            else
            {
               A833NovM_Secuencia = (int)(localUtil.ctol( httpContext.cgiGet( edtNovM_Secuencia_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
            }
            A834NovM_Placa = httpContext.cgiGet( edtNovM_Placa_Internalname) ;
            n834NovM_Placa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A834NovM_Placa", A834NovM_Placa);
            n834NovM_Placa = ((GXutil.strcmp("", A834NovM_Placa)==0) ? true : false) ;
            A835NovM_ValorNuevo = httpContext.cgiGet( edtNovM_ValorNuevo_Internalname) ;
            n835NovM_ValorNuevo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A835NovM_ValorNuevo", A835NovM_ValorNuevo);
            n835NovM_ValorNuevo = ((GXutil.strcmp("", A835NovM_ValorNuevo)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_RegionId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNovM_RegionId_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NOVM_REGIONID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNovM_RegionId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A836NovM_RegionId = (short)(0) ;
               n836NovM_RegionId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A836NovM_RegionId", GXutil.ltrim( GXutil.str( A836NovM_RegionId, 4, 0)));
            }
            else
            {
               A836NovM_RegionId = (short)(localUtil.ctol( httpContext.cgiGet( edtNovM_RegionId_Internalname), ",", ".")) ;
               n836NovM_RegionId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A836NovM_RegionId", GXutil.ltrim( GXutil.str( A836NovM_RegionId, 4, 0)));
            }
            n836NovM_RegionId = ((0==A836NovM_RegionId) ? true : false) ;
            cmbNovM_Estado.setValue( httpContext.cgiGet( cmbNovM_Estado.getInternalname()) );
            A837NovM_Estado = httpContext.cgiGet( cmbNovM_Estado.getInternalname()) ;
            n837NovM_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
            n837NovM_Estado = ((GXutil.strcmp("", A837NovM_Estado)==0) ? true : false) ;
            A838NovM_Error = httpContext.cgiGet( edtNovM_Error_Internalname) ;
            n838NovM_Error = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A838NovM_Error", A838NovM_Error);
            n838NovM_Error = ((GXutil.strcmp("", A838NovM_Error)==0) ? true : false) ;
            /* Read saved values. */
            Z832NovM_Identificador = localUtil.ctol( httpContext.cgiGet( "Z832NovM_Identificador"), ",", ".") ;
            Z833NovM_Secuencia = (int)(localUtil.ctol( httpContext.cgiGet( "Z833NovM_Secuencia"), ",", ".")) ;
            Z834NovM_Placa = httpContext.cgiGet( "Z834NovM_Placa") ;
            n834NovM_Placa = ((GXutil.strcmp("", A834NovM_Placa)==0) ? true : false) ;
            Z835NovM_ValorNuevo = httpContext.cgiGet( "Z835NovM_ValorNuevo") ;
            n835NovM_ValorNuevo = ((GXutil.strcmp("", A835NovM_ValorNuevo)==0) ? true : false) ;
            Z836NovM_RegionId = (short)(localUtil.ctol( httpContext.cgiGet( "Z836NovM_RegionId"), ",", ".")) ;
            n836NovM_RegionId = ((0==A836NovM_RegionId) ? true : false) ;
            Z837NovM_Estado = httpContext.cgiGet( "Z837NovM_Estado") ;
            n837NovM_Estado = ((GXutil.strcmp("", A837NovM_Estado)==0) ? true : false) ;
            Z838NovM_Error = httpContext.cgiGet( "Z838NovM_Error") ;
            n838NovM_Error = ((GXutil.strcmp("", A838NovM_Error)==0) ? true : false) ;
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
               A832NovM_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
               A833NovM_Secuencia = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
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
            initAll1G63( ) ;
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
      disableAttributes1G63( ) ;
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

   public void resetCaption1G0( )
   {
   }

   public void zm1G63( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z834NovM_Placa = T001G3_A834NovM_Placa[0] ;
            Z835NovM_ValorNuevo = T001G3_A835NovM_ValorNuevo[0] ;
            Z836NovM_RegionId = T001G3_A836NovM_RegionId[0] ;
            Z837NovM_Estado = T001G3_A837NovM_Estado[0] ;
            Z838NovM_Error = T001G3_A838NovM_Error[0] ;
         }
         else
         {
            Z834NovM_Placa = A834NovM_Placa ;
            Z835NovM_ValorNuevo = A835NovM_ValorNuevo ;
            Z836NovM_RegionId = A836NovM_RegionId ;
            Z837NovM_Estado = A837NovM_Estado ;
            Z838NovM_Error = A838NovM_Error ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z832NovM_Identificador = A832NovM_Identificador ;
         Z833NovM_Secuencia = A833NovM_Secuencia ;
         Z834NovM_Placa = A834NovM_Placa ;
         Z835NovM_ValorNuevo = A835NovM_ValorNuevo ;
         Z836NovM_RegionId = A836NovM_RegionId ;
         Z837NovM_Estado = A837NovM_Estado ;
         Z838NovM_Error = A838NovM_Error ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1G63( )
   {
      /* Using cursor T001G4 */
      pr_default.execute(2, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound63 = (short)(1) ;
         A834NovM_Placa = T001G4_A834NovM_Placa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834NovM_Placa", A834NovM_Placa);
         n834NovM_Placa = T001G4_n834NovM_Placa[0] ;
         A835NovM_ValorNuevo = T001G4_A835NovM_ValorNuevo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835NovM_ValorNuevo", A835NovM_ValorNuevo);
         n835NovM_ValorNuevo = T001G4_n835NovM_ValorNuevo[0] ;
         A836NovM_RegionId = T001G4_A836NovM_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A836NovM_RegionId", GXutil.ltrim( GXutil.str( A836NovM_RegionId, 4, 0)));
         n836NovM_RegionId = T001G4_n836NovM_RegionId[0] ;
         A837NovM_Estado = T001G4_A837NovM_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
         n837NovM_Estado = T001G4_n837NovM_Estado[0] ;
         A838NovM_Error = T001G4_A838NovM_Error[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A838NovM_Error", A838NovM_Error);
         n838NovM_Error = T001G4_n838NovM_Error[0] ;
         zm1G63( -1) ;
      }
      pr_default.close(2);
      onLoadActions1G63( ) ;
   }

   public void onLoadActions1G63( )
   {
   }

   public void checkExtendedTable1G63( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1G63( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1G63( )
   {
      /* Using cursor T001G5 */
      pr_default.execute(3, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound63 = (short)(1) ;
      }
      else
      {
         RcdFound63 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001G3 */
      pr_default.execute(1, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1G63( 1) ;
         RcdFound63 = (short)(1) ;
         A832NovM_Identificador = T001G3_A832NovM_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
         A833NovM_Secuencia = T001G3_A833NovM_Secuencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
         A834NovM_Placa = T001G3_A834NovM_Placa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834NovM_Placa", A834NovM_Placa);
         n834NovM_Placa = T001G3_n834NovM_Placa[0] ;
         A835NovM_ValorNuevo = T001G3_A835NovM_ValorNuevo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835NovM_ValorNuevo", A835NovM_ValorNuevo);
         n835NovM_ValorNuevo = T001G3_n835NovM_ValorNuevo[0] ;
         A836NovM_RegionId = T001G3_A836NovM_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A836NovM_RegionId", GXutil.ltrim( GXutil.str( A836NovM_RegionId, 4, 0)));
         n836NovM_RegionId = T001G3_n836NovM_RegionId[0] ;
         A837NovM_Estado = T001G3_A837NovM_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
         n837NovM_Estado = T001G3_n837NovM_Estado[0] ;
         A838NovM_Error = T001G3_A838NovM_Error[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A838NovM_Error", A838NovM_Error);
         n838NovM_Error = T001G3_n838NovM_Error[0] ;
         Z832NovM_Identificador = A832NovM_Identificador ;
         Z833NovM_Secuencia = A833NovM_Secuencia ;
         sMode63 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G63( ) ;
         if ( AnyError == 1 )
         {
            RcdFound63 = (short)(0) ;
            initializeNonKey1G63( ) ;
         }
         Gx_mode = sMode63 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound63 = (short)(0) ;
         initializeNonKey1G63( ) ;
         sMode63 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode63 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1G63( ) ;
      if ( RcdFound63 == 0 )
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
      RcdFound63 = (short)(0) ;
      /* Using cursor T001G6 */
      pr_default.execute(4, new Object[] {new Long(A832NovM_Identificador), new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001G6_A832NovM_Identificador[0] < A832NovM_Identificador ) || ( T001G6_A832NovM_Identificador[0] == A832NovM_Identificador ) && ( T001G6_A833NovM_Secuencia[0] < A833NovM_Secuencia ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001G6_A832NovM_Identificador[0] > A832NovM_Identificador ) || ( T001G6_A832NovM_Identificador[0] == A832NovM_Identificador ) && ( T001G6_A833NovM_Secuencia[0] > A833NovM_Secuencia ) ) )
         {
            A832NovM_Identificador = T001G6_A832NovM_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
            A833NovM_Secuencia = T001G6_A833NovM_Secuencia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
            RcdFound63 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound63 = (short)(0) ;
      /* Using cursor T001G7 */
      pr_default.execute(5, new Object[] {new Long(A832NovM_Identificador), new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001G7_A832NovM_Identificador[0] > A832NovM_Identificador ) || ( T001G7_A832NovM_Identificador[0] == A832NovM_Identificador ) && ( T001G7_A833NovM_Secuencia[0] > A833NovM_Secuencia ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001G7_A832NovM_Identificador[0] < A832NovM_Identificador ) || ( T001G7_A832NovM_Identificador[0] == A832NovM_Identificador ) && ( T001G7_A833NovM_Secuencia[0] < A833NovM_Secuencia ) ) )
         {
            A832NovM_Identificador = T001G7_A832NovM_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
            A833NovM_Secuencia = T001G7_A833NovM_Secuencia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
            RcdFound63 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G63( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtNovM_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G63( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound63 == 1 )
         {
            if ( ( A832NovM_Identificador != Z832NovM_Identificador ) || ( A833NovM_Secuencia != Z833NovM_Secuencia ) )
            {
               A832NovM_Identificador = Z832NovM_Identificador ;
               httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
               A833NovM_Secuencia = Z833NovM_Secuencia ;
               httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NOVM_IDENTIFICADOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNovM_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNovM_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1G63( ) ;
               GX_FocusControl = edtNovM_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A832NovM_Identificador != Z832NovM_Identificador ) || ( A833NovM_Secuencia != Z833NovM_Secuencia ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtNovM_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G63( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NOVM_IDENTIFICADOR");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNovM_Identificador_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtNovM_Identificador_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1G63( ) ;
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
      if ( ( A832NovM_Identificador != Z832NovM_Identificador ) || ( A833NovM_Secuencia != Z833NovM_Secuencia ) )
      {
         A832NovM_Identificador = Z832NovM_Identificador ;
         httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
         A833NovM_Secuencia = Z833NovM_Secuencia ;
         httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NOVM_IDENTIFICADOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNovM_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNovM_Identificador_Internalname ;
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
      if ( RcdFound63 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "NOVM_IDENTIFICADOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNovM_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtNovM_Placa_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1G63( ) ;
      if ( RcdFound63 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtNovM_Placa_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G63( ) ;
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
      if ( RcdFound63 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtNovM_Placa_Internalname ;
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
      if ( RcdFound63 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtNovM_Placa_Internalname ;
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
      scanStart1G63( ) ;
      if ( RcdFound63 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound63 != 0 )
         {
            scanNext1G63( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtNovM_Placa_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G63( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G63( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001G2 */
         pr_default.execute(0, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVE_MASIVO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z834NovM_Placa, T001G2_A834NovM_Placa[0]) != 0 ) || ( GXutil.strcmp(Z835NovM_ValorNuevo, T001G2_A835NovM_ValorNuevo[0]) != 0 ) || ( Z836NovM_RegionId != T001G2_A836NovM_RegionId[0] ) || ( GXutil.strcmp(Z837NovM_Estado, T001G2_A837NovM_Estado[0]) != 0 ) || ( GXutil.strcmp(Z838NovM_Error, T001G2_A838NovM_Error[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_NOVE_MASIVO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G63( )
   {
      beforeValidate1G63( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G63( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G63( 0) ;
         checkOptimisticConcurrency1G63( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G63( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G63( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G8 */
                  pr_default.execute(6, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia), new Boolean(n834NovM_Placa), A834NovM_Placa, new Boolean(n835NovM_ValorNuevo), A835NovM_ValorNuevo, new Boolean(n836NovM_RegionId), new Short(A836NovM_RegionId), new Boolean(n837NovM_Estado), A837NovM_Estado, new Boolean(n838NovM_Error), A838NovM_Error});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVE_MASIVO") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption1G0( ) ;
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
            load1G63( ) ;
         }
         endLevel1G63( ) ;
      }
      closeExtendedTableCursors1G63( ) ;
   }

   public void update1G63( )
   {
      beforeValidate1G63( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G63( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G63( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G63( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G63( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G9 */
                  pr_default.execute(7, new Object[] {new Boolean(n834NovM_Placa), A834NovM_Placa, new Boolean(n835NovM_ValorNuevo), A835NovM_ValorNuevo, new Boolean(n836NovM_RegionId), new Short(A836NovM_RegionId), new Boolean(n837NovM_Estado), A837NovM_Estado, new Boolean(n838NovM_Error), A838NovM_Error, new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVE_MASIVO") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVE_MASIVO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G63( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption1G0( ) ;
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
         endLevel1G63( ) ;
      }
      closeExtendedTableCursors1G63( ) ;
   }

   public void deferredUpdate1G63( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G63( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G63( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G63( ) ;
         afterConfirm1G63( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G63( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001G10 */
               pr_default.execute(8, new Object[] {new Long(A832NovM_Identificador), new Integer(A833NovM_Secuencia)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVE_MASIVO") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound63 == 0 )
                     {
                        initAll1G63( ) ;
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
                     resetCaption1G0( ) ;
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
      sMode63 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G63( ) ;
      Gx_mode = sMode63 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G63( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G63( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G63( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_nove_masivo");
         if ( AnyError == 0 )
         {
            confirmValues1G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_nove_masivo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G63( )
   {
      /* Using cursor T001G11 */
      pr_default.execute(9);
      RcdFound63 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound63 = (short)(1) ;
         A832NovM_Identificador = T001G11_A832NovM_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
         A833NovM_Secuencia = T001G11_A833NovM_Secuencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G63( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound63 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound63 = (short)(1) ;
         A832NovM_Identificador = T001G11_A832NovM_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
         A833NovM_Secuencia = T001G11_A833NovM_Secuencia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
      }
   }

   public void scanEnd1G63( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1G63( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G63( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G63( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G63( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G63( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G63( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G63( )
   {
      edtNovM_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_Identificador_Enabled, 5, 0)), true);
      edtNovM_Secuencia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_Secuencia_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_Secuencia_Enabled, 5, 0)), true);
      edtNovM_Placa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_Placa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_Placa_Enabled, 5, 0)), true);
      edtNovM_ValorNuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_ValorNuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_ValorNuevo_Enabled, 5, 0)), true);
      edtNovM_RegionId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_RegionId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_RegionId_Enabled, 5, 0)), true);
      cmbNovM_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNovM_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbNovM_Estado.getEnabled(), 5, 0)), true);
      edtNovM_Error_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNovM_Error_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNovM_Error_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1G0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018588582432");
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
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_nove_masivo") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z832NovM_Identificador", GXutil.ltrim( localUtil.ntoc( Z832NovM_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z833NovM_Secuencia", GXutil.ltrim( localUtil.ntoc( Z833NovM_Secuencia, (byte)(5), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z834NovM_Placa", Z834NovM_Placa);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z835NovM_ValorNuevo", Z835NovM_ValorNuevo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z836NovM_RegionId", GXutil.ltrim( localUtil.ntoc( Z836NovM_RegionId, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z837NovM_Estado", GXutil.rtrim( Z837NovM_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z838NovM_Error", Z838NovM_Error);
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
      return formatLink("com.orions2.alm_nove_masivo")  ;
   }

   public String getPgmname( )
   {
      return "ALM_NOVE_MASIVO" ;
   }

   public String getPgmdesc( )
   {
      return "Novedades Masivo" ;
   }

   public void initializeNonKey1G63( )
   {
      A834NovM_Placa = "" ;
      n834NovM_Placa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834NovM_Placa", A834NovM_Placa);
      n834NovM_Placa = ((GXutil.strcmp("", A834NovM_Placa)==0) ? true : false) ;
      A835NovM_ValorNuevo = "" ;
      n835NovM_ValorNuevo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A835NovM_ValorNuevo", A835NovM_ValorNuevo);
      n835NovM_ValorNuevo = ((GXutil.strcmp("", A835NovM_ValorNuevo)==0) ? true : false) ;
      A836NovM_RegionId = (short)(0) ;
      n836NovM_RegionId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A836NovM_RegionId", GXutil.ltrim( GXutil.str( A836NovM_RegionId, 4, 0)));
      n836NovM_RegionId = ((0==A836NovM_RegionId) ? true : false) ;
      A837NovM_Estado = "" ;
      n837NovM_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A837NovM_Estado", A837NovM_Estado);
      n837NovM_Estado = ((GXutil.strcmp("", A837NovM_Estado)==0) ? true : false) ;
      A838NovM_Error = "" ;
      n838NovM_Error = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A838NovM_Error", A838NovM_Error);
      n838NovM_Error = ((GXutil.strcmp("", A838NovM_Error)==0) ? true : false) ;
      Z834NovM_Placa = "" ;
      Z835NovM_ValorNuevo = "" ;
      Z836NovM_RegionId = (short)(0) ;
      Z837NovM_Estado = "" ;
      Z838NovM_Error = "" ;
   }

   public void initAll1G63( )
   {
      A832NovM_Identificador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A832NovM_Identificador", GXutil.ltrim( GXutil.str( A832NovM_Identificador, 11, 0)));
      A833NovM_Secuencia = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A833NovM_Secuencia", GXutil.ltrim( GXutil.str( A833NovM_Secuencia, 5, 0)));
      initializeNonKey1G63( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?107947");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2018588582436");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_nove_masivo.js", "?2018588582436");
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
      edtNovM_Identificador_Internalname = "NOVM_IDENTIFICADOR" ;
      edtNovM_Secuencia_Internalname = "NOVM_SECUENCIA" ;
      edtNovM_Placa_Internalname = "NOVM_PLACA" ;
      edtNovM_ValorNuevo_Internalname = "NOVM_VALORNUEVO" ;
      edtNovM_RegionId_Internalname = "NOVM_REGIONID" ;
      cmbNovM_Estado.setInternalname( "NOVM_ESTADO" );
      edtNovM_Error_Internalname = "NOVM_ERROR" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( "Novedades Masivo" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtNovM_Error_Enabled = 1 ;
      cmbNovM_Estado.setJsonclick( "" );
      cmbNovM_Estado.setEnabled( 1 );
      edtNovM_RegionId_Jsonclick = "" ;
      edtNovM_RegionId_Enabled = 1 ;
      edtNovM_ValorNuevo_Enabled = 1 ;
      edtNovM_Placa_Jsonclick = "" ;
      edtNovM_Placa_Enabled = 1 ;
      edtNovM_Secuencia_Jsonclick = "" ;
      edtNovM_Secuencia_Enabled = 1 ;
      edtNovM_Identificador_Jsonclick = "" ;
      edtNovM_Identificador_Enabled = 1 ;
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
      GX_FocusControl = edtNovM_Placa_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Novm_secuencia( long GX_Parm1 ,
                                     int GX_Parm2 ,
                                     String GX_Parm3 ,
                                     String GX_Parm4 ,
                                     short GX_Parm5 ,
                                     com.genexus.webpanels.HTMLChoice GX_Parm6 ,
                                     String GX_Parm7 )
   {
      A832NovM_Identificador = GX_Parm1 ;
      A833NovM_Secuencia = GX_Parm2 ;
      A834NovM_Placa = GX_Parm3 ;
      n834NovM_Placa = false ;
      A835NovM_ValorNuevo = GX_Parm4 ;
      n835NovM_ValorNuevo = false ;
      A836NovM_RegionId = GX_Parm5 ;
      n836NovM_RegionId = false ;
      cmbNovM_Estado = GX_Parm6 ;
      A837NovM_Estado = cmbNovM_Estado.getValue() ;
      n837NovM_Estado = false ;
      cmbNovM_Estado.setValue( A837NovM_Estado );
      A838NovM_Error = GX_Parm7 ;
      n838NovM_Error = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A834NovM_Placa);
      isValidOutput.add(A835NovM_ValorNuevo);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A836NovM_RegionId, (byte)(4), (byte)(0), ".", "")));
      cmbNovM_Estado.setValue( A837NovM_Estado );
      isValidOutput.add(cmbNovM_Estado);
      isValidOutput.add(A838NovM_Error);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z832NovM_Identificador, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z833NovM_Secuencia, (byte)(5), (byte)(0), ",", "")));
      isValidOutput.add(Z834NovM_Placa);
      isValidOutput.add(Z835NovM_ValorNuevo);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z836NovM_RegionId, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.rtrim( Z837NovM_Estado));
      isValidOutput.add(Z838NovM_Error);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z834NovM_Placa = "" ;
      Z835NovM_ValorNuevo = "" ;
      Z837NovM_Estado = "" ;
      Z838NovM_Error = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      A837NovM_Estado = "" ;
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
      A834NovM_Placa = "" ;
      A835NovM_ValorNuevo = "" ;
      A838NovM_Error = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001G4_A832NovM_Identificador = new long[1] ;
      T001G4_A833NovM_Secuencia = new int[1] ;
      T001G4_A834NovM_Placa = new String[] {""} ;
      T001G4_n834NovM_Placa = new boolean[] {false} ;
      T001G4_A835NovM_ValorNuevo = new String[] {""} ;
      T001G4_n835NovM_ValorNuevo = new boolean[] {false} ;
      T001G4_A836NovM_RegionId = new short[1] ;
      T001G4_n836NovM_RegionId = new boolean[] {false} ;
      T001G4_A837NovM_Estado = new String[] {""} ;
      T001G4_n837NovM_Estado = new boolean[] {false} ;
      T001G4_A838NovM_Error = new String[] {""} ;
      T001G4_n838NovM_Error = new boolean[] {false} ;
      T001G5_A832NovM_Identificador = new long[1] ;
      T001G5_A833NovM_Secuencia = new int[1] ;
      T001G3_A832NovM_Identificador = new long[1] ;
      T001G3_A833NovM_Secuencia = new int[1] ;
      T001G3_A834NovM_Placa = new String[] {""} ;
      T001G3_n834NovM_Placa = new boolean[] {false} ;
      T001G3_A835NovM_ValorNuevo = new String[] {""} ;
      T001G3_n835NovM_ValorNuevo = new boolean[] {false} ;
      T001G3_A836NovM_RegionId = new short[1] ;
      T001G3_n836NovM_RegionId = new boolean[] {false} ;
      T001G3_A837NovM_Estado = new String[] {""} ;
      T001G3_n837NovM_Estado = new boolean[] {false} ;
      T001G3_A838NovM_Error = new String[] {""} ;
      T001G3_n838NovM_Error = new boolean[] {false} ;
      sMode63 = "" ;
      T001G6_A832NovM_Identificador = new long[1] ;
      T001G6_A833NovM_Secuencia = new int[1] ;
      T001G7_A832NovM_Identificador = new long[1] ;
      T001G7_A833NovM_Secuencia = new int[1] ;
      T001G2_A832NovM_Identificador = new long[1] ;
      T001G2_A833NovM_Secuencia = new int[1] ;
      T001G2_A834NovM_Placa = new String[] {""} ;
      T001G2_n834NovM_Placa = new boolean[] {false} ;
      T001G2_A835NovM_ValorNuevo = new String[] {""} ;
      T001G2_n835NovM_ValorNuevo = new boolean[] {false} ;
      T001G2_A836NovM_RegionId = new short[1] ;
      T001G2_n836NovM_RegionId = new boolean[] {false} ;
      T001G2_A837NovM_Estado = new String[] {""} ;
      T001G2_n837NovM_Estado = new boolean[] {false} ;
      T001G2_A838NovM_Error = new String[] {""} ;
      T001G2_n838NovM_Error = new boolean[] {false} ;
      T001G11_A832NovM_Identificador = new long[1] ;
      T001G11_A833NovM_Secuencia = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_nove_masivo__default(),
         new Object[] {
             new Object[] {
            T001G2_A832NovM_Identificador, T001G2_A833NovM_Secuencia, T001G2_A834NovM_Placa, T001G2_n834NovM_Placa, T001G2_A835NovM_ValorNuevo, T001G2_n835NovM_ValorNuevo, T001G2_A836NovM_RegionId, T001G2_n836NovM_RegionId, T001G2_A837NovM_Estado, T001G2_n837NovM_Estado,
            T001G2_A838NovM_Error, T001G2_n838NovM_Error
            }
            , new Object[] {
            T001G3_A832NovM_Identificador, T001G3_A833NovM_Secuencia, T001G3_A834NovM_Placa, T001G3_n834NovM_Placa, T001G3_A835NovM_ValorNuevo, T001G3_n835NovM_ValorNuevo, T001G3_A836NovM_RegionId, T001G3_n836NovM_RegionId, T001G3_A837NovM_Estado, T001G3_n837NovM_Estado,
            T001G3_A838NovM_Error, T001G3_n838NovM_Error
            }
            , new Object[] {
            T001G4_A832NovM_Identificador, T001G4_A833NovM_Secuencia, T001G4_A834NovM_Placa, T001G4_n834NovM_Placa, T001G4_A835NovM_ValorNuevo, T001G4_n835NovM_ValorNuevo, T001G4_A836NovM_RegionId, T001G4_n836NovM_RegionId, T001G4_A837NovM_Estado, T001G4_n837NovM_Estado,
            T001G4_A838NovM_Error, T001G4_n838NovM_Error
            }
            , new Object[] {
            T001G5_A832NovM_Identificador, T001G5_A833NovM_Secuencia
            }
            , new Object[] {
            T001G6_A832NovM_Identificador, T001G6_A833NovM_Secuencia
            }
            , new Object[] {
            T001G7_A832NovM_Identificador, T001G7_A833NovM_Secuencia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001G11_A832NovM_Identificador, T001G11_A833NovM_Secuencia
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z836NovM_RegionId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A836NovM_RegionId ;
   private short RcdFound63 ;
   private int Z833NovM_Secuencia ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtNovM_Identificador_Enabled ;
   private int A833NovM_Secuencia ;
   private int edtNovM_Secuencia_Enabled ;
   private int edtNovM_Placa_Enabled ;
   private int edtNovM_ValorNuevo_Enabled ;
   private int edtNovM_RegionId_Enabled ;
   private int edtNovM_Error_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z832NovM_Identificador ;
   private long A832NovM_Identificador ;
   private String sPrefix ;
   private String Z837NovM_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String A837NovM_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtNovM_Identificador_Internalname ;
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
   private String edtNovM_Identificador_Jsonclick ;
   private String edtNovM_Secuencia_Internalname ;
   private String edtNovM_Secuencia_Jsonclick ;
   private String edtNovM_Placa_Internalname ;
   private String edtNovM_Placa_Jsonclick ;
   private String edtNovM_ValorNuevo_Internalname ;
   private String edtNovM_RegionId_Internalname ;
   private String edtNovM_RegionId_Jsonclick ;
   private String edtNovM_Error_Internalname ;
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
   private String sMode63 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n837NovM_Estado ;
   private boolean wbErr ;
   private boolean n834NovM_Placa ;
   private boolean n835NovM_ValorNuevo ;
   private boolean n836NovM_RegionId ;
   private boolean n838NovM_Error ;
   private String Z834NovM_Placa ;
   private String Z835NovM_ValorNuevo ;
   private String Z838NovM_Error ;
   private String A834NovM_Placa ;
   private String A835NovM_ValorNuevo ;
   private String A838NovM_Error ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbNovM_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] T001G4_A832NovM_Identificador ;
   private int[] T001G4_A833NovM_Secuencia ;
   private String[] T001G4_A834NovM_Placa ;
   private boolean[] T001G4_n834NovM_Placa ;
   private String[] T001G4_A835NovM_ValorNuevo ;
   private boolean[] T001G4_n835NovM_ValorNuevo ;
   private short[] T001G4_A836NovM_RegionId ;
   private boolean[] T001G4_n836NovM_RegionId ;
   private String[] T001G4_A837NovM_Estado ;
   private boolean[] T001G4_n837NovM_Estado ;
   private String[] T001G4_A838NovM_Error ;
   private boolean[] T001G4_n838NovM_Error ;
   private long[] T001G5_A832NovM_Identificador ;
   private int[] T001G5_A833NovM_Secuencia ;
   private long[] T001G3_A832NovM_Identificador ;
   private int[] T001G3_A833NovM_Secuencia ;
   private String[] T001G3_A834NovM_Placa ;
   private boolean[] T001G3_n834NovM_Placa ;
   private String[] T001G3_A835NovM_ValorNuevo ;
   private boolean[] T001G3_n835NovM_ValorNuevo ;
   private short[] T001G3_A836NovM_RegionId ;
   private boolean[] T001G3_n836NovM_RegionId ;
   private String[] T001G3_A837NovM_Estado ;
   private boolean[] T001G3_n837NovM_Estado ;
   private String[] T001G3_A838NovM_Error ;
   private boolean[] T001G3_n838NovM_Error ;
   private long[] T001G6_A832NovM_Identificador ;
   private int[] T001G6_A833NovM_Secuencia ;
   private long[] T001G7_A832NovM_Identificador ;
   private int[] T001G7_A833NovM_Secuencia ;
   private long[] T001G2_A832NovM_Identificador ;
   private int[] T001G2_A833NovM_Secuencia ;
   private String[] T001G2_A834NovM_Placa ;
   private boolean[] T001G2_n834NovM_Placa ;
   private String[] T001G2_A835NovM_ValorNuevo ;
   private boolean[] T001G2_n835NovM_ValorNuevo ;
   private short[] T001G2_A836NovM_RegionId ;
   private boolean[] T001G2_n836NovM_RegionId ;
   private String[] T001G2_A837NovM_Estado ;
   private boolean[] T001G2_n837NovM_Estado ;
   private String[] T001G2_A838NovM_Error ;
   private boolean[] T001G2_n838NovM_Error ;
   private long[] T001G11_A832NovM_Identificador ;
   private int[] T001G11_A833NovM_Secuencia ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class alm_nove_masivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001G2", "SELECT NovM_Identificador, NovM_Secuencia, NovM_Placa, NovM_ValorNuevo, NovM_RegionId, NovM_Estado, NovM_Error FROM ALM_NOVE_MASIVO WHERE NovM_Identificador = ? AND NovM_Secuencia = ?  FOR UPDATE OF NovM_Placa, NovM_ValorNuevo, NovM_RegionId, NovM_Estado, NovM_Error NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G3", "SELECT NovM_Identificador, NovM_Secuencia, NovM_Placa, NovM_ValorNuevo, NovM_RegionId, NovM_Estado, NovM_Error FROM ALM_NOVE_MASIVO WHERE NovM_Identificador = ? AND NovM_Secuencia = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G4", "SELECT /*+ FIRST_ROWS(100) */ TM1.NovM_Identificador, TM1.NovM_Secuencia, TM1.NovM_Placa, TM1.NovM_ValorNuevo, TM1.NovM_RegionId, TM1.NovM_Estado, TM1.NovM_Error FROM ALM_NOVE_MASIVO TM1 WHERE TM1.NovM_Identificador = ? and TM1.NovM_Secuencia = ? ORDER BY TM1.NovM_Identificador, TM1.NovM_Secuencia ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001G5", "SELECT /*+ FIRST_ROWS(1) */ NovM_Identificador, NovM_Secuencia FROM ALM_NOVE_MASIVO WHERE NovM_Identificador = ? AND NovM_Secuencia = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NovM_Identificador, NovM_Secuencia FROM ALM_NOVE_MASIVO WHERE ( NovM_Identificador > ? or NovM_Identificador = ? and NovM_Secuencia > ?) ORDER BY NovM_Identificador, NovM_Secuencia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001G7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NovM_Identificador, NovM_Secuencia FROM ALM_NOVE_MASIVO WHERE ( NovM_Identificador < ? or NovM_Identificador = ? and NovM_Secuencia < ?) ORDER BY NovM_Identificador DESC, NovM_Secuencia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001G8", "INSERT INTO ALM_NOVE_MASIVO(NovM_Identificador, NovM_Secuencia, NovM_Placa, NovM_ValorNuevo, NovM_RegionId, NovM_Estado, NovM_Error) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_NOVE_MASIVO")
         ,new UpdateCursor("T001G9", "UPDATE ALM_NOVE_MASIVO SET NovM_Placa=?, NovM_ValorNuevo=?, NovM_RegionId=?, NovM_Estado=?, NovM_Error=?  WHERE NovM_Identificador = ? AND NovM_Secuencia = ?", GX_NOMASK, "ALM_NOVE_MASIVO")
         ,new UpdateCursor("T001G10", "DELETE FROM ALM_NOVE_MASIVO  WHERE NovM_Identificador = ? AND NovM_Secuencia = ?", GX_NOMASK, "ALM_NOVE_MASIVO")
         ,new ForEachCursor("T001G11", "SELECT /*+ FIRST_ROWS(100) */ NovM_Identificador, NovM_Secuencia FROM ALM_NOVE_MASIVO ORDER BY NovM_Identificador, NovM_Secuencia ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 200);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 200);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 200);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

