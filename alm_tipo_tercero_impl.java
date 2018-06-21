/*
               File: alm_tipo_tercero_impl
        Description: Tipo de tercero
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:10.29
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

public final  class alm_tipo_tercero_impl extends GXDataArea
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9Tpte_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Tpte_Codigo", AV9Tpte_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTPTE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Tpte_Codigo, "@!"))));
         }
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
      cmbTpte_Estado.setName( "TPTE_ESTADO" );
      cmbTpte_Estado.setWebtags( "" );
      cmbTpte_Estado.addItem("A", "Activo", (short)(0));
      cmbTpte_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbTpte_Estado.getItemCount() > 0 )
      {
         A682Tpte_Estado = cmbTpte_Estado.getValidValue(A682Tpte_Estado) ;
         n682Tpte_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
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
         Form.getMeta().addItem("description", "Tipo de tercero", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTpte_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_tipo_tercero_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_tercero_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_tercero_impl.class ));
   }

   public alm_tipo_tercero_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTpte_Estado = new HTMLChoice();
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
      if ( cmbTpte_Estado.getItemCount() > 0 )
      {
         A682Tpte_Estado = cmbTpte_Estado.getValidValue(A682Tpte_Estado) ;
         n682Tpte_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de tercero", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_TERCERO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TIPO_TERCERO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Codigo_Internalname, GXutil.rtrim( A42Tpte_Codigo), GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpte_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_TERCERO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Descripcion_Internalname, A321Tpte_Descripcion, GXutil.rtrim( localUtil.format( A321Tpte_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpte_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TIPO_TERCERO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpte_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpte_Estado, cmbTpte_Estado.getInternalname(), GXutil.rtrim( A682Tpte_Estado), 1, cmbTpte_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTpte_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_TIPO_TERCERO.htm");
         cmbTpte_Estado.setValue( GXutil.rtrim( A682Tpte_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpte_Estado.getInternalname(), "Values", cmbTpte_Estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_TERCERO.htm");
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
      /* Execute user event: Start */
      e11112 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A42Tpte_Codigo = GXutil.upper( httpContext.cgiGet( edtTpte_Codigo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
            A321Tpte_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpte_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
            cmbTpte_Estado.setValue( httpContext.cgiGet( cmbTpte_Estado.getInternalname()) );
            A682Tpte_Estado = httpContext.cgiGet( cmbTpte_Estado.getInternalname()) ;
            n682Tpte_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
            n682Tpte_Estado = ((GXutil.strcmp("", A682Tpte_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z42Tpte_Codigo = httpContext.cgiGet( "Z42Tpte_Codigo") ;
            Z322Tpte_UsuarioCrea = httpContext.cgiGet( "Z322Tpte_UsuarioCrea") ;
            Z323Tpte_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z323Tpte_FechaCrea"), 0) ;
            Z324Tpte_UsuarioModifica = httpContext.cgiGet( "Z324Tpte_UsuarioModifica") ;
            n324Tpte_UsuarioModifica = ((GXutil.strcmp("", A324Tpte_UsuarioModifica)==0) ? true : false) ;
            Z325Tpte_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z325Tpte_FechaModifica"), 0) ;
            n325Tpte_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A325Tpte_FechaModifica) ? true : false) ;
            Z321Tpte_Descripcion = httpContext.cgiGet( "Z321Tpte_Descripcion") ;
            Z682Tpte_Estado = httpContext.cgiGet( "Z682Tpte_Estado") ;
            n682Tpte_Estado = ((GXutil.strcmp("", A682Tpte_Estado)==0) ? true : false) ;
            A322Tpte_UsuarioCrea = httpContext.cgiGet( "Z322Tpte_UsuarioCrea") ;
            A323Tpte_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z323Tpte_FechaCrea"), 0) ;
            A324Tpte_UsuarioModifica = httpContext.cgiGet( "Z324Tpte_UsuarioModifica") ;
            n324Tpte_UsuarioModifica = false ;
            n324Tpte_UsuarioModifica = ((GXutil.strcmp("", A324Tpte_UsuarioModifica)==0) ? true : false) ;
            A325Tpte_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z325Tpte_FechaModifica"), 0) ;
            n325Tpte_FechaModifica = false ;
            n325Tpte_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A325Tpte_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Tpte_Codigo = httpContext.cgiGet( "vTPTE_CODIGO") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A322Tpte_UsuarioCrea = httpContext.cgiGet( "TPTE_USUARIOCREA") ;
            A323Tpte_FechaCrea = localUtil.ctot( httpContext.cgiGet( "TPTE_FECHACREA"), 0) ;
            A324Tpte_UsuarioModifica = httpContext.cgiGet( "TPTE_USUARIOMODIFICA") ;
            n324Tpte_UsuarioModifica = ((GXutil.strcmp("", A324Tpte_UsuarioModifica)==0) ? true : false) ;
            A325Tpte_FechaModifica = localUtil.ctot( httpContext.cgiGet( "TPTE_FECHAMODIFICA"), 0) ;
            n325Tpte_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A325Tpte_FechaModifica) ? true : false) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TIPO_TERCERO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A42Tpte_Codigo, Z42Tpte_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_tipo_tercero:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               A42Tpte_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
               {
                  sMode38 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode38 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound38 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_110( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TPTE_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTpte_Codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11112 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12112 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( GXutil.strcmp(Gx_mode, "DSP") != 0 )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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
         /* Execute user event: After Trn */
         e12112 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1138( ) ;
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
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
         if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
         }
         disableAttributes1138( ) ;
      }
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

   public void confirm_110( )
   {
      beforeValidate1138( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1138( ) ;
         }
         else
         {
            checkExtendedTable1138( ) ;
            closeExtendedTableCursors1138( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption110( )
   {
   }

   public void e11112( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV14Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e12112( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_tipo_tercero") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1138( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z322Tpte_UsuarioCrea = T00113_A322Tpte_UsuarioCrea[0] ;
            Z323Tpte_FechaCrea = T00113_A323Tpte_FechaCrea[0] ;
            Z324Tpte_UsuarioModifica = T00113_A324Tpte_UsuarioModifica[0] ;
            Z325Tpte_FechaModifica = T00113_A325Tpte_FechaModifica[0] ;
            Z321Tpte_Descripcion = T00113_A321Tpte_Descripcion[0] ;
            Z682Tpte_Estado = T00113_A682Tpte_Estado[0] ;
         }
         else
         {
            Z322Tpte_UsuarioCrea = A322Tpte_UsuarioCrea ;
            Z323Tpte_FechaCrea = A323Tpte_FechaCrea ;
            Z324Tpte_UsuarioModifica = A324Tpte_UsuarioModifica ;
            Z325Tpte_FechaModifica = A325Tpte_FechaModifica ;
            Z321Tpte_Descripcion = A321Tpte_Descripcion ;
            Z682Tpte_Estado = A682Tpte_Estado ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z42Tpte_Codigo = A42Tpte_Codigo ;
         Z322Tpte_UsuarioCrea = A322Tpte_UsuarioCrea ;
         Z323Tpte_FechaCrea = A323Tpte_FechaCrea ;
         Z324Tpte_UsuarioModifica = A324Tpte_UsuarioModifica ;
         Z325Tpte_FechaModifica = A325Tpte_FechaModifica ;
         Z321Tpte_Descripcion = A321Tpte_Descripcion ;
         Z682Tpte_Estado = A682Tpte_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV9Tpte_Codigo)==0) )
      {
         A42Tpte_Codigo = AV9Tpte_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV9Tpte_Codigo)==0) )
      {
         edtTpte_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpte_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV9Tpte_Codigo)==0) )
      {
         edtTpte_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV14Pgmname = "ALM_TIPO_TERCERO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
   }

   public void load1138( )
   {
      /* Using cursor T00114 */
      pr_default.execute(2, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A322Tpte_UsuarioCrea = T00114_A322Tpte_UsuarioCrea[0] ;
         A323Tpte_FechaCrea = T00114_A323Tpte_FechaCrea[0] ;
         A324Tpte_UsuarioModifica = T00114_A324Tpte_UsuarioModifica[0] ;
         n324Tpte_UsuarioModifica = T00114_n324Tpte_UsuarioModifica[0] ;
         A325Tpte_FechaModifica = T00114_A325Tpte_FechaModifica[0] ;
         n325Tpte_FechaModifica = T00114_n325Tpte_FechaModifica[0] ;
         A321Tpte_Descripcion = T00114_A321Tpte_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         A682Tpte_Estado = T00114_A682Tpte_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
         n682Tpte_Estado = T00114_n682Tpte_Estado[0] ;
         zm1138( -8) ;
      }
      pr_default.close(2);
      onLoadActions1138( ) ;
   }

   public void onLoadActions1138( )
   {
      AV14Pgmname = "ALM_TIPO_TERCERO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable1138( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV14Pgmname = "ALM_TIPO_TERCERO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors1138( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1138( )
   {
      /* Using cursor T00115 */
      pr_default.execute(3, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00113 */
      pr_default.execute(1, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1138( 8) ;
         RcdFound38 = (short)(1) ;
         A42Tpte_Codigo = T00113_A42Tpte_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         A322Tpte_UsuarioCrea = T00113_A322Tpte_UsuarioCrea[0] ;
         A323Tpte_FechaCrea = T00113_A323Tpte_FechaCrea[0] ;
         A324Tpte_UsuarioModifica = T00113_A324Tpte_UsuarioModifica[0] ;
         n324Tpte_UsuarioModifica = T00113_n324Tpte_UsuarioModifica[0] ;
         A325Tpte_FechaModifica = T00113_A325Tpte_FechaModifica[0] ;
         n325Tpte_FechaModifica = T00113_n325Tpte_FechaModifica[0] ;
         A321Tpte_Descripcion = T00113_A321Tpte_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         A682Tpte_Estado = T00113_A682Tpte_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
         n682Tpte_Estado = T00113_n682Tpte_Estado[0] ;
         Z42Tpte_Codigo = A42Tpte_Codigo ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1138( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1138( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1138( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1138( ) ;
      if ( RcdFound38 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T00116 */
      pr_default.execute(4, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00116_A42Tpte_Codigo[0], A42Tpte_Codigo) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00116_A42Tpte_Codigo[0], A42Tpte_Codigo) > 0 ) ) )
         {
            A42Tpte_Codigo = T00116_A42Tpte_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T00117 */
      pr_default.execute(5, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00117_A42Tpte_Codigo[0], A42Tpte_Codigo) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00117_A42Tpte_Codigo[0], A42Tpte_Codigo) < 0 ) ) )
         {
            A42Tpte_Codigo = T00117_A42Tpte_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1138( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTpte_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1138( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( GXutil.strcmp(A42Tpte_Codigo, Z42Tpte_Codigo) != 0 )
            {
               A42Tpte_Codigo = Z42Tpte_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TPTE_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpte_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTpte_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1138( ) ;
               GX_FocusControl = edtTpte_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A42Tpte_Codigo, Z42Tpte_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtTpte_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1138( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TPTE_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTpte_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTpte_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1138( ) ;
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
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A42Tpte_Codigo, Z42Tpte_Codigo) != 0 )
      {
         A42Tpte_Codigo = Z42Tpte_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TPTE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpte_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTpte_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1138( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00112 */
         pr_default.execute(0, new Object[] {A42Tpte_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_TERCERO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z322Tpte_UsuarioCrea, T00112_A322Tpte_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z323Tpte_FechaCrea, T00112_A323Tpte_FechaCrea[0]) ) || ( GXutil.strcmp(Z324Tpte_UsuarioModifica, T00112_A324Tpte_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z325Tpte_FechaModifica, T00112_A325Tpte_FechaModifica[0]) ) || ( GXutil.strcmp(Z321Tpte_Descripcion, T00112_A321Tpte_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z682Tpte_Estado, T00112_A682Tpte_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_TERCERO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1138( )
   {
      beforeValidate1138( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1138( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1138( 0) ;
         checkOptimisticConcurrency1138( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1138( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1138( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00118 */
                  pr_default.execute(6, new Object[] {A42Tpte_Codigo, A322Tpte_UsuarioCrea, A323Tpte_FechaCrea, new Boolean(n324Tpte_UsuarioModifica), A324Tpte_UsuarioModifica, new Boolean(n325Tpte_FechaModifica), A325Tpte_FechaModifica, A321Tpte_Descripcion, new Boolean(n682Tpte_Estado), A682Tpte_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_TERCERO") ;
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
                        resetCaption110( ) ;
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
            load1138( ) ;
         }
         endLevel1138( ) ;
      }
      closeExtendedTableCursors1138( ) ;
   }

   public void update1138( )
   {
      beforeValidate1138( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1138( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1138( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1138( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1138( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00119 */
                  pr_default.execute(7, new Object[] {A322Tpte_UsuarioCrea, A323Tpte_FechaCrea, new Boolean(n324Tpte_UsuarioModifica), A324Tpte_UsuarioModifica, new Boolean(n325Tpte_FechaModifica), A325Tpte_FechaModifica, A321Tpte_Descripcion, new Boolean(n682Tpte_Estado), A682Tpte_Estado, A42Tpte_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_TERCERO") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_TERCERO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1138( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
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
         }
         endLevel1138( ) ;
      }
      closeExtendedTableCursors1138( ) ;
   }

   public void deferredUpdate1138( )
   {
   }

   public void delete( )
   {
      beforeValidate1138( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1138( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1138( ) ;
         afterConfirm1138( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1138( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001110 */
               pr_default.execute(8, new Object[] {A42Tpte_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_TERCERO") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
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
      }
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1138( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1138( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "ALM_TIPO_TERCERO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001111 */
         pr_default.execute(9, new Object[] {A42Tpte_Codigo});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CUENTADANTE"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel1138( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1138( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_tercero");
         if ( AnyError == 0 )
         {
            confirmValues110( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_tercero");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1138( )
   {
      /* Scan By routine */
      /* Using cursor T001112 */
      pr_default.execute(10);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A42Tpte_Codigo = T001112_A42Tpte_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1138( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A42Tpte_Codigo = T001112_A42Tpte_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      }
   }

   public void scanEnd1138( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1138( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A323Tpte_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323Tpte_FechaCrea", localUtil.ttoc( A323Tpte_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A325Tpte_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n325Tpte_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325Tpte_FechaModifica", localUtil.ttoc( A325Tpte_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A322Tpte_UsuarioCrea = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A322Tpte_UsuarioCrea", A322Tpte_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A324Tpte_UsuarioModifica = AV12Usuario ;
         n324Tpte_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A324Tpte_UsuarioModifica", A324Tpte_UsuarioModifica);
      }
   }

   public void beforeInsert1138( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1138( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1138( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1138( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1138( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1138( )
   {
      edtTpte_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      edtTpte_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpte_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Descripcion_Enabled, 5, 0)), true);
      cmbTpte_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpte_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpte_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues110( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141417115");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_tercero") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9Tpte_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z42Tpte_Codigo", GXutil.rtrim( Z42Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z322Tpte_UsuarioCrea", Z322Tpte_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z323Tpte_FechaCrea", localUtil.ttoc( Z323Tpte_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z324Tpte_UsuarioModifica", Z324Tpte_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z325Tpte_FechaModifica", localUtil.ttoc( Z325Tpte_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z321Tpte_Descripcion", Z321Tpte_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z682Tpte_Estado", GXutil.rtrim( Z682Tpte_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTPTE_CODIGO", GXutil.rtrim( AV9Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_USUARIOCREA", A322Tpte_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_FECHACREA", localUtil.ttoc( A323Tpte_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_USUARIOMODIFICA", A324Tpte_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_FECHAMODIFICA", localUtil.ttoc( A325Tpte_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTPTE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Tpte_Codigo, "@!"))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TIPO_TERCERO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_tipo_tercero:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_tipo_tercero") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9Tpte_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_TIPO_TERCERO" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de tercero" ;
   }

   public void initializeNonKey1138( )
   {
      A322Tpte_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A322Tpte_UsuarioCrea", A322Tpte_UsuarioCrea);
      A323Tpte_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A323Tpte_FechaCrea", localUtil.ttoc( A323Tpte_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A324Tpte_UsuarioModifica = "" ;
      n324Tpte_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A324Tpte_UsuarioModifica", A324Tpte_UsuarioModifica);
      A325Tpte_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n325Tpte_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325Tpte_FechaModifica", localUtil.ttoc( A325Tpte_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A321Tpte_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
      A682Tpte_Estado = "" ;
      n682Tpte_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A682Tpte_Estado", A682Tpte_Estado);
      n682Tpte_Estado = ((GXutil.strcmp("", A682Tpte_Estado)==0) ? true : false) ;
      Z322Tpte_UsuarioCrea = "" ;
      Z323Tpte_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z324Tpte_UsuarioModifica = "" ;
      Z325Tpte_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z321Tpte_Descripcion = "" ;
      Z682Tpte_Estado = "" ;
   }

   public void initAll1138( )
   {
      A42Tpte_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      initializeNonKey1138( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414171110");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_tipo_tercero.js", "?201861414171110");
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
      edtTpte_Codigo_Internalname = "TPTE_CODIGO" ;
      edtTpte_Descripcion_Internalname = "TPTE_DESCRIPCION" ;
      cmbTpte_Estado.setInternalname( "TPTE_ESTADO" );
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
      Form.setCaption( "Tipo de tercero" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTpte_Estado.setJsonclick( "" );
      cmbTpte_Estado.setEnabled( 1 );
      edtTpte_Descripcion_Jsonclick = "" ;
      edtTpte_Descripcion_Enabled = 1 ;
      edtTpte_Codigo_Jsonclick = "" ;
      edtTpte_Codigo_Enabled = 1 ;
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

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9Tpte_Codigo',fld:'vTPTE_CODIGO',pic:'@!',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12112',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      wcpOGx_mode = "" ;
      wcpOAV9Tpte_Codigo = "" ;
      Z42Tpte_Codigo = "" ;
      Z322Tpte_UsuarioCrea = "" ;
      Z323Tpte_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z324Tpte_UsuarioModifica = "" ;
      Z325Tpte_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z321Tpte_Descripcion = "" ;
      Z682Tpte_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV9Tpte_Codigo = "" ;
      GXKey = "" ;
      A682Tpte_Estado = "" ;
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
      A42Tpte_Codigo = "" ;
      A321Tpte_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A324Tpte_UsuarioModifica = "" ;
      A325Tpte_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A322Tpte_UsuarioCrea = "" ;
      A323Tpte_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV14Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode38 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T00114_A42Tpte_Codigo = new String[] {""} ;
      T00114_A322Tpte_UsuarioCrea = new String[] {""} ;
      T00114_A323Tpte_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00114_A324Tpte_UsuarioModifica = new String[] {""} ;
      T00114_n324Tpte_UsuarioModifica = new boolean[] {false} ;
      T00114_A325Tpte_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00114_n325Tpte_FechaModifica = new boolean[] {false} ;
      T00114_A321Tpte_Descripcion = new String[] {""} ;
      T00114_A682Tpte_Estado = new String[] {""} ;
      T00114_n682Tpte_Estado = new boolean[] {false} ;
      T00115_A42Tpte_Codigo = new String[] {""} ;
      T00113_A42Tpte_Codigo = new String[] {""} ;
      T00113_A322Tpte_UsuarioCrea = new String[] {""} ;
      T00113_A323Tpte_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00113_A324Tpte_UsuarioModifica = new String[] {""} ;
      T00113_n324Tpte_UsuarioModifica = new boolean[] {false} ;
      T00113_A325Tpte_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00113_n325Tpte_FechaModifica = new boolean[] {false} ;
      T00113_A321Tpte_Descripcion = new String[] {""} ;
      T00113_A682Tpte_Estado = new String[] {""} ;
      T00113_n682Tpte_Estado = new boolean[] {false} ;
      T00116_A42Tpte_Codigo = new String[] {""} ;
      T00117_A42Tpte_Codigo = new String[] {""} ;
      T00112_A42Tpte_Codigo = new String[] {""} ;
      T00112_A322Tpte_UsuarioCrea = new String[] {""} ;
      T00112_A323Tpte_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00112_A324Tpte_UsuarioModifica = new String[] {""} ;
      T00112_n324Tpte_UsuarioModifica = new boolean[] {false} ;
      T00112_A325Tpte_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00112_n325Tpte_FechaModifica = new boolean[] {false} ;
      T00112_A321Tpte_Descripcion = new String[] {""} ;
      T00112_A682Tpte_Estado = new String[] {""} ;
      T00112_n682Tpte_Estado = new boolean[] {false} ;
      T001111_A43Cuen_Identificacion = new long[1] ;
      T001112_A42Tpte_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_tercero__default(),
         new Object[] {
             new Object[] {
            T00112_A42Tpte_Codigo, T00112_A322Tpte_UsuarioCrea, T00112_A323Tpte_FechaCrea, T00112_A324Tpte_UsuarioModifica, T00112_n324Tpte_UsuarioModifica, T00112_A325Tpte_FechaModifica, T00112_n325Tpte_FechaModifica, T00112_A321Tpte_Descripcion, T00112_A682Tpte_Estado, T00112_n682Tpte_Estado
            }
            , new Object[] {
            T00113_A42Tpte_Codigo, T00113_A322Tpte_UsuarioCrea, T00113_A323Tpte_FechaCrea, T00113_A324Tpte_UsuarioModifica, T00113_n324Tpte_UsuarioModifica, T00113_A325Tpte_FechaModifica, T00113_n325Tpte_FechaModifica, T00113_A321Tpte_Descripcion, T00113_A682Tpte_Estado, T00113_n682Tpte_Estado
            }
            , new Object[] {
            T00114_A42Tpte_Codigo, T00114_A322Tpte_UsuarioCrea, T00114_A323Tpte_FechaCrea, T00114_A324Tpte_UsuarioModifica, T00114_n324Tpte_UsuarioModifica, T00114_A325Tpte_FechaModifica, T00114_n325Tpte_FechaModifica, T00114_A321Tpte_Descripcion, T00114_A682Tpte_Estado, T00114_n682Tpte_Estado
            }
            , new Object[] {
            T00115_A42Tpte_Codigo
            }
            , new Object[] {
            T00116_A42Tpte_Codigo
            }
            , new Object[] {
            T00117_A42Tpte_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001111_A43Cuen_Identificacion
            }
            , new Object[] {
            T001112_A42Tpte_Codigo
            }
         }
      );
      AV14Pgmname = "ALM_TIPO_TERCERO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound38 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTpte_Codigo_Enabled ;
   private int edtTpte_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV9Tpte_Codigo ;
   private String Z42Tpte_Codigo ;
   private String Z682Tpte_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV9Tpte_Codigo ;
   private String GXKey ;
   private String A682Tpte_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTpte_Codigo_Internalname ;
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
   private String A42Tpte_Codigo ;
   private String edtTpte_Codigo_Jsonclick ;
   private String edtTpte_Descripcion_Internalname ;
   private String edtTpte_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV14Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode38 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z323Tpte_FechaCrea ;
   private java.util.Date Z325Tpte_FechaModifica ;
   private java.util.Date A325Tpte_FechaModifica ;
   private java.util.Date A323Tpte_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n682Tpte_Estado ;
   private boolean wbErr ;
   private boolean n324Tpte_UsuarioModifica ;
   private boolean n325Tpte_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z322Tpte_UsuarioCrea ;
   private String Z324Tpte_UsuarioModifica ;
   private String Z321Tpte_Descripcion ;
   private String A321Tpte_Descripcion ;
   private String A324Tpte_UsuarioModifica ;
   private String A322Tpte_UsuarioCrea ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbTpte_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00114_A42Tpte_Codigo ;
   private String[] T00114_A322Tpte_UsuarioCrea ;
   private java.util.Date[] T00114_A323Tpte_FechaCrea ;
   private String[] T00114_A324Tpte_UsuarioModifica ;
   private boolean[] T00114_n324Tpte_UsuarioModifica ;
   private java.util.Date[] T00114_A325Tpte_FechaModifica ;
   private boolean[] T00114_n325Tpte_FechaModifica ;
   private String[] T00114_A321Tpte_Descripcion ;
   private String[] T00114_A682Tpte_Estado ;
   private boolean[] T00114_n682Tpte_Estado ;
   private String[] T00115_A42Tpte_Codigo ;
   private String[] T00113_A42Tpte_Codigo ;
   private String[] T00113_A322Tpte_UsuarioCrea ;
   private java.util.Date[] T00113_A323Tpte_FechaCrea ;
   private String[] T00113_A324Tpte_UsuarioModifica ;
   private boolean[] T00113_n324Tpte_UsuarioModifica ;
   private java.util.Date[] T00113_A325Tpte_FechaModifica ;
   private boolean[] T00113_n325Tpte_FechaModifica ;
   private String[] T00113_A321Tpte_Descripcion ;
   private String[] T00113_A682Tpte_Estado ;
   private boolean[] T00113_n682Tpte_Estado ;
   private String[] T00116_A42Tpte_Codigo ;
   private String[] T00117_A42Tpte_Codigo ;
   private String[] T00112_A42Tpte_Codigo ;
   private String[] T00112_A322Tpte_UsuarioCrea ;
   private java.util.Date[] T00112_A323Tpte_FechaCrea ;
   private String[] T00112_A324Tpte_UsuarioModifica ;
   private boolean[] T00112_n324Tpte_UsuarioModifica ;
   private java.util.Date[] T00112_A325Tpte_FechaModifica ;
   private boolean[] T00112_n325Tpte_FechaModifica ;
   private String[] T00112_A321Tpte_Descripcion ;
   private String[] T00112_A682Tpte_Estado ;
   private boolean[] T00112_n682Tpte_Estado ;
   private long[] T001111_A43Cuen_Identificacion ;
   private String[] T001112_A42Tpte_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_tipo_tercero__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00112", "SELECT Tpte_Codigo, Tpte_UsuarioCrea, Tpte_FechaCrea, Tpte_UsuarioModifica, Tpte_FechaModifica, Tpte_Descripcion, Tpte_Estado FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ?  FOR UPDATE OF Tpte_UsuarioCrea, Tpte_FechaCrea, Tpte_UsuarioModifica, Tpte_FechaModifica, Tpte_Descripcion, Tpte_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00113", "SELECT Tpte_Codigo, Tpte_UsuarioCrea, Tpte_FechaCrea, Tpte_UsuarioModifica, Tpte_FechaModifica, Tpte_Descripcion, Tpte_Estado FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00114", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tpte_Codigo, TM1.Tpte_UsuarioCrea, TM1.Tpte_FechaCrea, TM1.Tpte_UsuarioModifica, TM1.Tpte_FechaModifica, TM1.Tpte_Descripcion, TM1.Tpte_Estado FROM ALM_TIPO_TERCERO TM1 WHERE TM1.Tpte_Codigo = ? ORDER BY TM1.Tpte_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00115", "SELECT /*+ FIRST_ROWS(1) */ Tpte_Codigo FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00116", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpte_Codigo FROM ALM_TIPO_TERCERO WHERE ( Tpte_Codigo > ?) ORDER BY Tpte_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00117", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpte_Codigo FROM ALM_TIPO_TERCERO WHERE ( Tpte_Codigo < ?) ORDER BY Tpte_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00118", "INSERT INTO ALM_TIPO_TERCERO(Tpte_Codigo, Tpte_UsuarioCrea, Tpte_FechaCrea, Tpte_UsuarioModifica, Tpte_FechaModifica, Tpte_Descripcion, Tpte_Estado) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_TERCERO")
         ,new UpdateCursor("T00119", "UPDATE ALM_TIPO_TERCERO SET Tpte_UsuarioCrea=?, Tpte_FechaCrea=?, Tpte_UsuarioModifica=?, Tpte_FechaModifica=?, Tpte_Descripcion=?, Tpte_Estado=?  WHERE Tpte_Codigo = ?", GX_NOMASK, "ALM_TIPO_TERCERO")
         ,new UpdateCursor("T001110", "DELETE FROM ALM_TIPO_TERCERO  WHERE Tpte_Codigo = ?", GX_NOMASK, "ALM_TIPO_TERCERO")
         ,new ForEachCursor("T001111", "SELECT * FROM (SELECT Cuen_Identificacion FROM ALM_CUENTADANTE WHERE Tpte_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001112", "SELECT /*+ FIRST_ROWS(100) */ Tpte_Codigo FROM ALM_TIPO_TERCERO ORDER BY Tpte_Codigo ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2) ;
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
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               stmt.setVarchar(6, (String)parms[7], 100, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               stmt.setVarchar(5, (String)parms[6], 100, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 2);
               return;
      }
   }

}

