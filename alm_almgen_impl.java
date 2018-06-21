/*
               File: alm_almgen_impl
        Description: Almacén general
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:21.17
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

public final  class alm_almgen_impl extends GXDataArea
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
            AV7AlmaG_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlmaG_Codigo", AV7AlmaG_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMAG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7AlmaG_Codigo, ""))));
            AV12Alma_Modulo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Alma_Modulo", AV12Alma_Modulo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Alma_Modulo, ""))));
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
      cmbAlma_Modulo.setName( "ALMA_MODULO" );
      cmbAlma_Modulo.setWebtags( "" );
      cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
      cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
      cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
      if ( cmbAlma_Modulo.getItemCount() > 0 )
      {
         A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
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
         Form.getMeta().addItem("description", "Almacén general", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtAlmaG_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_almgen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_almgen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_almgen_impl.class ));
   }

   public alm_almgen_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlma_Modulo = new HTMLChoice();
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
      if ( cmbAlma_Modulo.getItemCount() > 0 )
      {
         A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Almacén general", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_Codigo_Internalname, "General Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_Codigo_Internalname, A76AlmaG_Codigo, GXutil.rtrim( localUtil.format( A76AlmaG_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_Codigo_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_Descripcion_Internalname, "General Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_Descripcion_Internalname, A470AlmaG_Descripcion, GXutil.rtrim( localUtil.format( A470AlmaG_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Modulo.getInternalname(), "Modulo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_ALMGEN.htm");
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_UsuarioCreacion_Internalname, A471AlmaG_UsuarioCreacion, GXutil.rtrim( localUtil.format( A471AlmaG_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtAlmaG_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_FechaCreacion_Internalname, localUtil.ttoc( A472AlmaG_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A472AlmaG_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlmaG_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlmaG_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_UsuarioModifica_Internalname, A473AlmaG_UsuarioModifica, GXutil.rtrim( localUtil.format( A473AlmaG_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlmaG_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtAlmaG_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlmaG_FechaModifica_Internalname, localUtil.ttoc( A474AlmaG_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A474AlmaG_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmaG_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlmaG_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtAlmaG_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlmaG_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ALMGEN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMGEN.htm");
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
      e11182 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A76AlmaG_Codigo = httpContext.cgiGet( edtAlmaG_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
            A470AlmaG_Descripcion = httpContext.cgiGet( edtAlmaG_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
            cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
            A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A471AlmaG_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtAlmaG_UsuarioCreacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlmaG_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALMAG_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlmaG_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A472AlmaG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtAlmaG_FechaCreacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            A473AlmaG_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtAlmaG_UsuarioModifica_Internalname)) ;
            n473AlmaG_UsuarioModifica = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
            n473AlmaG_UsuarioModifica = ((GXutil.strcmp("", A473AlmaG_UsuarioModifica)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlmaG_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALMAG_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlmaG_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               n474AlmaG_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A474AlmaG_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtAlmaG_FechaModifica_Internalname)) ;
               n474AlmaG_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            n474AlmaG_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A474AlmaG_FechaModifica) ? true : false) ;
            /* Read saved values. */
            Z76AlmaG_Codigo = httpContext.cgiGet( "Z76AlmaG_Codigo") ;
            Z27Alma_Modulo = httpContext.cgiGet( "Z27Alma_Modulo") ;
            Z470AlmaG_Descripcion = httpContext.cgiGet( "Z470AlmaG_Descripcion") ;
            Z471AlmaG_UsuarioCreacion = httpContext.cgiGet( "Z471AlmaG_UsuarioCreacion") ;
            Z472AlmaG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z472AlmaG_FechaCreacion"), 0) ;
            Z473AlmaG_UsuarioModifica = httpContext.cgiGet( "Z473AlmaG_UsuarioModifica") ;
            n473AlmaG_UsuarioModifica = ((GXutil.strcmp("", A473AlmaG_UsuarioModifica)==0) ? true : false) ;
            Z474AlmaG_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z474AlmaG_FechaModifica"), 0) ;
            n474AlmaG_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A474AlmaG_FechaModifica) ? true : false) ;
            Z684AlmaG_Estado = httpContext.cgiGet( "Z684AlmaG_Estado") ;
            n684AlmaG_Estado = ((GXutil.strcmp("", A684AlmaG_Estado)==0) ? true : false) ;
            A684AlmaG_Estado = httpContext.cgiGet( "Z684AlmaG_Estado") ;
            n684AlmaG_Estado = false ;
            n684AlmaG_Estado = ((GXutil.strcmp("", A684AlmaG_Estado)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7AlmaG_Codigo = httpContext.cgiGet( "vALMAG_CODIGO") ;
            AV12Alma_Modulo = httpContext.cgiGet( "vALMA_MODULO") ;
            A684AlmaG_Estado = httpContext.cgiGet( "ALMAG_ESTADO") ;
            n684AlmaG_Estado = ((GXutil.strcmp("", A684AlmaG_Estado)==0) ? true : false) ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_ALMGEN" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A684AlmaG_Estado, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A76AlmaG_Codigo, Z76AlmaG_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_almgen:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A76AlmaG_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
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
                  sMode45 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode45 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound45 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_180( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALMAG_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlmaG_Codigo_Internalname ;
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
                        e11182 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12182 ();
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
         e12182 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1845( ) ;
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
         disableAttributes1845( ) ;
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

   public void confirm_180( )
   {
      beforeValidate1845( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1845( ) ;
         }
         else
         {
            checkExtendedTable1845( ) ;
            closeExtendedTableCursors1845( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption180( )
   {
   }

   public void e11182( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
   }

   public void e12182( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_almgen") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1845( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z470AlmaG_Descripcion = T00183_A470AlmaG_Descripcion[0] ;
            Z471AlmaG_UsuarioCreacion = T00183_A471AlmaG_UsuarioCreacion[0] ;
            Z472AlmaG_FechaCreacion = T00183_A472AlmaG_FechaCreacion[0] ;
            Z473AlmaG_UsuarioModifica = T00183_A473AlmaG_UsuarioModifica[0] ;
            Z474AlmaG_FechaModifica = T00183_A474AlmaG_FechaModifica[0] ;
            Z684AlmaG_Estado = T00183_A684AlmaG_Estado[0] ;
         }
         else
         {
            Z470AlmaG_Descripcion = A470AlmaG_Descripcion ;
            Z471AlmaG_UsuarioCreacion = A471AlmaG_UsuarioCreacion ;
            Z472AlmaG_FechaCreacion = A472AlmaG_FechaCreacion ;
            Z473AlmaG_UsuarioModifica = A473AlmaG_UsuarioModifica ;
            Z474AlmaG_FechaModifica = A474AlmaG_FechaModifica ;
            Z684AlmaG_Estado = A684AlmaG_Estado ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z76AlmaG_Codigo = A76AlmaG_Codigo ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z470AlmaG_Descripcion = A470AlmaG_Descripcion ;
         Z471AlmaG_UsuarioCreacion = A471AlmaG_UsuarioCreacion ;
         Z472AlmaG_FechaCreacion = A472AlmaG_FechaCreacion ;
         Z473AlmaG_UsuarioModifica = A473AlmaG_UsuarioModifica ;
         Z474AlmaG_FechaModifica = A474AlmaG_FechaModifica ;
         Z684AlmaG_Estado = A684AlmaG_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV7AlmaG_Codigo)==0) )
      {
         A76AlmaG_Codigo = AV7AlmaG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV7AlmaG_Codigo)==0) )
      {
         edtAlmaG_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtAlmaG_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7AlmaG_Codigo)==0) )
      {
         edtAlmaG_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV12Alma_Modulo)==0) )
      {
         A27Alma_Modulo = AV12Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      if ( ! (GXutil.strcmp("", AV12Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      else
      {
         cmbAlma_Modulo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV12Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
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
         AV15Pgmname = "ALM_ALMGEN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      }
   }

   public void load1845( )
   {
      /* Using cursor T00184 */
      pr_default.execute(2, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A470AlmaG_Descripcion = T00184_A470AlmaG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
         A471AlmaG_UsuarioCreacion = T00184_A471AlmaG_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
         A472AlmaG_FechaCreacion = T00184_A472AlmaG_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A473AlmaG_UsuarioModifica = T00184_A473AlmaG_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
         n473AlmaG_UsuarioModifica = T00184_n473AlmaG_UsuarioModifica[0] ;
         A474AlmaG_FechaModifica = T00184_A474AlmaG_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n474AlmaG_FechaModifica = T00184_n474AlmaG_FechaModifica[0] ;
         A684AlmaG_Estado = T00184_A684AlmaG_Estado[0] ;
         n684AlmaG_Estado = T00184_n684AlmaG_Estado[0] ;
         zm1845( -7) ;
      }
      pr_default.close(2);
      onLoadActions1845( ) ;
   }

   public void onLoadActions1845( )
   {
      AV15Pgmname = "ALM_ALMGEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void checkExtendedTable1845( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV15Pgmname = "ALM_ALMGEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void closeExtendedTableCursors1845( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1845( )
   {
      /* Using cursor T00185 */
      pr_default.execute(3, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00183 */
      pr_default.execute(1, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1845( 7) ;
         RcdFound45 = (short)(1) ;
         A76AlmaG_Codigo = T00183_A76AlmaG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
         A27Alma_Modulo = T00183_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A470AlmaG_Descripcion = T00183_A470AlmaG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
         A471AlmaG_UsuarioCreacion = T00183_A471AlmaG_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
         A472AlmaG_FechaCreacion = T00183_A472AlmaG_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A473AlmaG_UsuarioModifica = T00183_A473AlmaG_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
         n473AlmaG_UsuarioModifica = T00183_n473AlmaG_UsuarioModifica[0] ;
         A474AlmaG_FechaModifica = T00183_A474AlmaG_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n474AlmaG_FechaModifica = T00183_n474AlmaG_FechaModifica[0] ;
         A684AlmaG_Estado = T00183_A684AlmaG_Estado[0] ;
         n684AlmaG_Estado = T00183_n684AlmaG_Estado[0] ;
         Z76AlmaG_Codigo = A76AlmaG_Codigo ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1845( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey1845( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey1845( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1845( ) ;
      if ( RcdFound45 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T00186 */
      pr_default.execute(4, new Object[] {A76AlmaG_Codigo, A76AlmaG_Codigo, A27Alma_Modulo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00186_A76AlmaG_Codigo[0], A76AlmaG_Codigo) < 0 ) || ( GXutil.strcmp(T00186_A76AlmaG_Codigo[0], A76AlmaG_Codigo) == 0 ) && ( GXutil.strcmp(T00186_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00186_A76AlmaG_Codigo[0], A76AlmaG_Codigo) > 0 ) || ( GXutil.strcmp(T00186_A76AlmaG_Codigo[0], A76AlmaG_Codigo) == 0 ) && ( GXutil.strcmp(T00186_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) ) )
         {
            A76AlmaG_Codigo = T00186_A76AlmaG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
            A27Alma_Modulo = T00186_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T00187 */
      pr_default.execute(5, new Object[] {A76AlmaG_Codigo, A76AlmaG_Codigo, A27Alma_Modulo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00187_A76AlmaG_Codigo[0], A76AlmaG_Codigo) > 0 ) || ( GXutil.strcmp(T00187_A76AlmaG_Codigo[0], A76AlmaG_Codigo) == 0 ) && ( GXutil.strcmp(T00187_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00187_A76AlmaG_Codigo[0], A76AlmaG_Codigo) < 0 ) || ( GXutil.strcmp(T00187_A76AlmaG_Codigo[0], A76AlmaG_Codigo) == 0 ) && ( GXutil.strcmp(T00187_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) ) )
         {
            A76AlmaG_Codigo = T00187_A76AlmaG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
            A27Alma_Modulo = T00187_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1845( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtAlmaG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1845( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A76AlmaG_Codigo, Z76AlmaG_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) )
            {
               A76AlmaG_Codigo = Z76AlmaG_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
               A27Alma_Modulo = Z27Alma_Modulo ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALMAG_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlmaG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlmaG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1845( ) ;
               GX_FocusControl = edtAlmaG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A76AlmaG_Codigo, Z76AlmaG_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlmaG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1845( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALMAG_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlmaG_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlmaG_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1845( ) ;
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
      if ( ( GXutil.strcmp(A76AlmaG_Codigo, Z76AlmaG_Codigo) != 0 ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) )
      {
         A76AlmaG_Codigo = Z76AlmaG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
         A27Alma_Modulo = Z27Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALMAG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmaG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlmaG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1845( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00182 */
         pr_default.execute(0, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z470AlmaG_Descripcion, T00182_A470AlmaG_Descripcion[0]) != 0 ) || ( GXutil.strcmp(Z471AlmaG_UsuarioCreacion, T00182_A471AlmaG_UsuarioCreacion[0]) != 0 ) || !( GXutil.dateCompare(Z472AlmaG_FechaCreacion, T00182_A472AlmaG_FechaCreacion[0]) ) || ( GXutil.strcmp(Z473AlmaG_UsuarioModifica, T00182_A473AlmaG_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z474AlmaG_FechaModifica, T00182_A474AlmaG_FechaModifica[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z684AlmaG_Estado, T00182_A684AlmaG_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_ALMGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1845( )
   {
      beforeValidate1845( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1845( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1845( 0) ;
         checkOptimisticConcurrency1845( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1845( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1845( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00188 */
                  pr_default.execute(6, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo, A470AlmaG_Descripcion, A471AlmaG_UsuarioCreacion, A472AlmaG_FechaCreacion, new Boolean(n473AlmaG_UsuarioModifica), A473AlmaG_UsuarioModifica, new Boolean(n474AlmaG_FechaModifica), A474AlmaG_FechaModifica, new Boolean(n684AlmaG_Estado), A684AlmaG_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMGEN") ;
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
                        resetCaption180( ) ;
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
            load1845( ) ;
         }
         endLevel1845( ) ;
      }
      closeExtendedTableCursors1845( ) ;
   }

   public void update1845( )
   {
      beforeValidate1845( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1845( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1845( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1845( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1845( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00189 */
                  pr_default.execute(7, new Object[] {A470AlmaG_Descripcion, A471AlmaG_UsuarioCreacion, A472AlmaG_FechaCreacion, new Boolean(n473AlmaG_UsuarioModifica), A473AlmaG_UsuarioModifica, new Boolean(n474AlmaG_FechaModifica), A474AlmaG_FechaModifica, new Boolean(n684AlmaG_Estado), A684AlmaG_Estado, A76AlmaG_Codigo, A27Alma_Modulo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMGEN") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1845( ) ;
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
         endLevel1845( ) ;
      }
      closeExtendedTableCursors1845( ) ;
   }

   public void deferredUpdate1845( )
   {
   }

   public void delete( )
   {
      beforeValidate1845( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1845( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1845( ) ;
         afterConfirm1845( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1845( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001810 */
               pr_default.execute(8, new Object[] {A76AlmaG_Codigo, A27Alma_Modulo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMGEN") ;
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1845( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1845( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "ALM_ALMGEN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      }
   }

   public void endLevel1845( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1845( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_almgen");
         if ( AnyError == 0 )
         {
            confirmValues180( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_almgen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1845( )
   {
      /* Scan By routine */
      /* Using cursor T001811 */
      pr_default.execute(9);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A76AlmaG_Codigo = T001811_A76AlmaG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
         A27Alma_Modulo = T001811_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1845( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A76AlmaG_Codigo = T001811_A76AlmaG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
         A27Alma_Modulo = T001811_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      }
   }

   public void scanEnd1845( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1845( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1845( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1845( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1845( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1845( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1845( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1845( )
   {
      edtAlmaG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_Codigo_Enabled, 5, 0)), true);
      edtAlmaG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_Descripcion_Enabled, 5, 0)), true);
      cmbAlma_Modulo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      edtAlmaG_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_UsuarioCreacion_Enabled, 5, 0)), true);
      edtAlmaG_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_FechaCreacion_Enabled, 5, 0)), true);
      edtAlmaG_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_UsuarioModifica_Enabled, 5, 0)), true);
      edtAlmaG_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmaG_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlmaG_FechaModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues180( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414172217");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_almgen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7AlmaG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Alma_Modulo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z76AlmaG_Codigo", Z76AlmaG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z27Alma_Modulo", Z27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z470AlmaG_Descripcion", Z470AlmaG_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z471AlmaG_UsuarioCreacion", Z471AlmaG_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z472AlmaG_FechaCreacion", localUtil.ttoc( Z472AlmaG_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z473AlmaG_UsuarioModifica", Z473AlmaG_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z474AlmaG_FechaModifica", localUtil.ttoc( Z474AlmaG_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z684AlmaG_Estado", GXutil.rtrim( Z684AlmaG_Estado));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMAG_CODIGO", AV7AlmaG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV12Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMAG_ESTADO", GXutil.rtrim( A684AlmaG_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMAG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7AlmaG_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Alma_Modulo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_ALMGEN" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A684AlmaG_Estado, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_almgen:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_almgen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7AlmaG_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Alma_Modulo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_ALMGEN" ;
   }

   public String getPgmdesc( )
   {
      return "Almacén general" ;
   }

   public void initializeNonKey1845( )
   {
      A470AlmaG_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A470AlmaG_Descripcion", A470AlmaG_Descripcion);
      A471AlmaG_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A471AlmaG_UsuarioCreacion", A471AlmaG_UsuarioCreacion);
      A472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A472AlmaG_FechaCreacion", localUtil.ttoc( A472AlmaG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A473AlmaG_UsuarioModifica = "" ;
      n473AlmaG_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A473AlmaG_UsuarioModifica", A473AlmaG_UsuarioModifica);
      n473AlmaG_UsuarioModifica = ((GXutil.strcmp("", A473AlmaG_UsuarioModifica)==0) ? true : false) ;
      A474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n474AlmaG_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A474AlmaG_FechaModifica", localUtil.ttoc( A474AlmaG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      n474AlmaG_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A474AlmaG_FechaModifica) ? true : false) ;
      A684AlmaG_Estado = "" ;
      n684AlmaG_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A684AlmaG_Estado", A684AlmaG_Estado);
      Z470AlmaG_Descripcion = "" ;
      Z471AlmaG_UsuarioCreacion = "" ;
      Z472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z473AlmaG_UsuarioModifica = "" ;
      Z474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z684AlmaG_Estado = "" ;
   }

   public void initAll1845( )
   {
      A76AlmaG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A76AlmaG_Codigo", A76AlmaG_Codigo);
      A27Alma_Modulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      initializeNonKey1845( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414172225");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_almgen.js", "?201861414172225");
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
      edtAlmaG_Codigo_Internalname = "ALMAG_CODIGO" ;
      edtAlmaG_Descripcion_Internalname = "ALMAG_DESCRIPCION" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlmaG_UsuarioCreacion_Internalname = "ALMAG_USUARIOCREACION" ;
      edtAlmaG_FechaCreacion_Internalname = "ALMAG_FECHACREACION" ;
      edtAlmaG_UsuarioModifica_Internalname = "ALMAG_USUARIOMODIFICA" ;
      edtAlmaG_FechaModifica_Internalname = "ALMAG_FECHAMODIFICA" ;
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
      Form.setCaption( "Almacén general" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAlmaG_FechaModifica_Jsonclick = "" ;
      edtAlmaG_FechaModifica_Enabled = 1 ;
      edtAlmaG_UsuarioModifica_Jsonclick = "" ;
      edtAlmaG_UsuarioModifica_Enabled = 1 ;
      edtAlmaG_FechaCreacion_Jsonclick = "" ;
      edtAlmaG_FechaCreacion_Enabled = 1 ;
      edtAlmaG_UsuarioCreacion_Jsonclick = "" ;
      edtAlmaG_UsuarioCreacion_Enabled = 1 ;
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 1 );
      edtAlmaG_Descripcion_Jsonclick = "" ;
      edtAlmaG_Descripcion_Enabled = 1 ;
      edtAlmaG_Codigo_Jsonclick = "" ;
      edtAlmaG_Codigo_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7AlmaG_Codigo',fld:'vALMAG_CODIGO',pic:'',hsh:true,nv:''},{av:'AV12Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12182',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      wcpOAV7AlmaG_Codigo = "" ;
      wcpOAV12Alma_Modulo = "" ;
      Z76AlmaG_Codigo = "" ;
      Z27Alma_Modulo = "" ;
      Z470AlmaG_Descripcion = "" ;
      Z471AlmaG_UsuarioCreacion = "" ;
      Z472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z473AlmaG_UsuarioModifica = "" ;
      Z474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z684AlmaG_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7AlmaG_Codigo = "" ;
      AV12Alma_Modulo = "" ;
      GXKey = "" ;
      A27Alma_Modulo = "" ;
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
      A76AlmaG_Codigo = "" ;
      A470AlmaG_Descripcion = "" ;
      A471AlmaG_UsuarioCreacion = "" ;
      A472AlmaG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A473AlmaG_UsuarioModifica = "" ;
      A474AlmaG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A684AlmaG_Estado = "" ;
      AV15Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode45 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T00184_A76AlmaG_Codigo = new String[] {""} ;
      T00184_A27Alma_Modulo = new String[] {""} ;
      T00184_A470AlmaG_Descripcion = new String[] {""} ;
      T00184_A471AlmaG_UsuarioCreacion = new String[] {""} ;
      T00184_A472AlmaG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00184_A473AlmaG_UsuarioModifica = new String[] {""} ;
      T00184_n473AlmaG_UsuarioModifica = new boolean[] {false} ;
      T00184_A474AlmaG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00184_n474AlmaG_FechaModifica = new boolean[] {false} ;
      T00184_A684AlmaG_Estado = new String[] {""} ;
      T00184_n684AlmaG_Estado = new boolean[] {false} ;
      T00185_A76AlmaG_Codigo = new String[] {""} ;
      T00185_A27Alma_Modulo = new String[] {""} ;
      T00183_A76AlmaG_Codigo = new String[] {""} ;
      T00183_A27Alma_Modulo = new String[] {""} ;
      T00183_A470AlmaG_Descripcion = new String[] {""} ;
      T00183_A471AlmaG_UsuarioCreacion = new String[] {""} ;
      T00183_A472AlmaG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00183_A473AlmaG_UsuarioModifica = new String[] {""} ;
      T00183_n473AlmaG_UsuarioModifica = new boolean[] {false} ;
      T00183_A474AlmaG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00183_n474AlmaG_FechaModifica = new boolean[] {false} ;
      T00183_A684AlmaG_Estado = new String[] {""} ;
      T00183_n684AlmaG_Estado = new boolean[] {false} ;
      T00186_A76AlmaG_Codigo = new String[] {""} ;
      T00186_A27Alma_Modulo = new String[] {""} ;
      T00187_A76AlmaG_Codigo = new String[] {""} ;
      T00187_A27Alma_Modulo = new String[] {""} ;
      T00182_A76AlmaG_Codigo = new String[] {""} ;
      T00182_A27Alma_Modulo = new String[] {""} ;
      T00182_A470AlmaG_Descripcion = new String[] {""} ;
      T00182_A471AlmaG_UsuarioCreacion = new String[] {""} ;
      T00182_A472AlmaG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00182_A473AlmaG_UsuarioModifica = new String[] {""} ;
      T00182_n473AlmaG_UsuarioModifica = new boolean[] {false} ;
      T00182_A474AlmaG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00182_n474AlmaG_FechaModifica = new boolean[] {false} ;
      T00182_A684AlmaG_Estado = new String[] {""} ;
      T00182_n684AlmaG_Estado = new boolean[] {false} ;
      T001811_A76AlmaG_Codigo = new String[] {""} ;
      T001811_A27Alma_Modulo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_almgen__default(),
         new Object[] {
             new Object[] {
            T00182_A76AlmaG_Codigo, T00182_A27Alma_Modulo, T00182_A470AlmaG_Descripcion, T00182_A471AlmaG_UsuarioCreacion, T00182_A472AlmaG_FechaCreacion, T00182_A473AlmaG_UsuarioModifica, T00182_n473AlmaG_UsuarioModifica, T00182_A474AlmaG_FechaModifica, T00182_n474AlmaG_FechaModifica, T00182_A684AlmaG_Estado,
            T00182_n684AlmaG_Estado
            }
            , new Object[] {
            T00183_A76AlmaG_Codigo, T00183_A27Alma_Modulo, T00183_A470AlmaG_Descripcion, T00183_A471AlmaG_UsuarioCreacion, T00183_A472AlmaG_FechaCreacion, T00183_A473AlmaG_UsuarioModifica, T00183_n473AlmaG_UsuarioModifica, T00183_A474AlmaG_FechaModifica, T00183_n474AlmaG_FechaModifica, T00183_A684AlmaG_Estado,
            T00183_n684AlmaG_Estado
            }
            , new Object[] {
            T00184_A76AlmaG_Codigo, T00184_A27Alma_Modulo, T00184_A470AlmaG_Descripcion, T00184_A471AlmaG_UsuarioCreacion, T00184_A472AlmaG_FechaCreacion, T00184_A473AlmaG_UsuarioModifica, T00184_n473AlmaG_UsuarioModifica, T00184_A474AlmaG_FechaModifica, T00184_n474AlmaG_FechaModifica, T00184_A684AlmaG_Estado,
            T00184_n684AlmaG_Estado
            }
            , new Object[] {
            T00185_A76AlmaG_Codigo, T00185_A27Alma_Modulo
            }
            , new Object[] {
            T00186_A76AlmaG_Codigo, T00186_A27Alma_Modulo
            }
            , new Object[] {
            T00187_A76AlmaG_Codigo, T00187_A27Alma_Modulo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001811_A76AlmaG_Codigo, T001811_A27Alma_Modulo
            }
         }
      );
      AV15Pgmname = "ALM_ALMGEN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound45 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtAlmaG_Codigo_Enabled ;
   private int edtAlmaG_Descripcion_Enabled ;
   private int edtAlmaG_UsuarioCreacion_Enabled ;
   private int edtAlmaG_FechaCreacion_Enabled ;
   private int edtAlmaG_UsuarioModifica_Enabled ;
   private int edtAlmaG_FechaModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z684AlmaG_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlmaG_Codigo_Internalname ;
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
   private String edtAlmaG_Codigo_Jsonclick ;
   private String edtAlmaG_Descripcion_Internalname ;
   private String edtAlmaG_Descripcion_Jsonclick ;
   private String edtAlmaG_UsuarioCreacion_Internalname ;
   private String edtAlmaG_UsuarioCreacion_Jsonclick ;
   private String edtAlmaG_FechaCreacion_Internalname ;
   private String edtAlmaG_FechaCreacion_Jsonclick ;
   private String edtAlmaG_UsuarioModifica_Internalname ;
   private String edtAlmaG_UsuarioModifica_Jsonclick ;
   private String edtAlmaG_FechaModifica_Internalname ;
   private String edtAlmaG_FechaModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A684AlmaG_Estado ;
   private String AV15Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode45 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z472AlmaG_FechaCreacion ;
   private java.util.Date Z474AlmaG_FechaModifica ;
   private java.util.Date A472AlmaG_FechaCreacion ;
   private java.util.Date A474AlmaG_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n473AlmaG_UsuarioModifica ;
   private boolean n474AlmaG_FechaModifica ;
   private boolean n684AlmaG_Estado ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV7AlmaG_Codigo ;
   private String wcpOAV12Alma_Modulo ;
   private String Z76AlmaG_Codigo ;
   private String Z27Alma_Modulo ;
   private String Z470AlmaG_Descripcion ;
   private String Z471AlmaG_UsuarioCreacion ;
   private String Z473AlmaG_UsuarioModifica ;
   private String AV7AlmaG_Codigo ;
   private String AV12Alma_Modulo ;
   private String A27Alma_Modulo ;
   private String A76AlmaG_Codigo ;
   private String A470AlmaG_Descripcion ;
   private String A471AlmaG_UsuarioCreacion ;
   private String A473AlmaG_UsuarioModifica ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private String[] T00184_A76AlmaG_Codigo ;
   private String[] T00184_A27Alma_Modulo ;
   private String[] T00184_A470AlmaG_Descripcion ;
   private String[] T00184_A471AlmaG_UsuarioCreacion ;
   private java.util.Date[] T00184_A472AlmaG_FechaCreacion ;
   private String[] T00184_A473AlmaG_UsuarioModifica ;
   private boolean[] T00184_n473AlmaG_UsuarioModifica ;
   private java.util.Date[] T00184_A474AlmaG_FechaModifica ;
   private boolean[] T00184_n474AlmaG_FechaModifica ;
   private String[] T00184_A684AlmaG_Estado ;
   private boolean[] T00184_n684AlmaG_Estado ;
   private String[] T00185_A76AlmaG_Codigo ;
   private String[] T00185_A27Alma_Modulo ;
   private String[] T00183_A76AlmaG_Codigo ;
   private String[] T00183_A27Alma_Modulo ;
   private String[] T00183_A470AlmaG_Descripcion ;
   private String[] T00183_A471AlmaG_UsuarioCreacion ;
   private java.util.Date[] T00183_A472AlmaG_FechaCreacion ;
   private String[] T00183_A473AlmaG_UsuarioModifica ;
   private boolean[] T00183_n473AlmaG_UsuarioModifica ;
   private java.util.Date[] T00183_A474AlmaG_FechaModifica ;
   private boolean[] T00183_n474AlmaG_FechaModifica ;
   private String[] T00183_A684AlmaG_Estado ;
   private boolean[] T00183_n684AlmaG_Estado ;
   private String[] T00186_A76AlmaG_Codigo ;
   private String[] T00186_A27Alma_Modulo ;
   private String[] T00187_A76AlmaG_Codigo ;
   private String[] T00187_A27Alma_Modulo ;
   private String[] T00182_A76AlmaG_Codigo ;
   private String[] T00182_A27Alma_Modulo ;
   private String[] T00182_A470AlmaG_Descripcion ;
   private String[] T00182_A471AlmaG_UsuarioCreacion ;
   private java.util.Date[] T00182_A472AlmaG_FechaCreacion ;
   private String[] T00182_A473AlmaG_UsuarioModifica ;
   private boolean[] T00182_n473AlmaG_UsuarioModifica ;
   private java.util.Date[] T00182_A474AlmaG_FechaModifica ;
   private boolean[] T00182_n474AlmaG_FechaModifica ;
   private String[] T00182_A684AlmaG_Estado ;
   private boolean[] T00182_n684AlmaG_Estado ;
   private String[] T001811_A76AlmaG_Codigo ;
   private String[] T001811_A27Alma_Modulo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_almgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00182", "SELECT AlmaG_Codigo, Alma_Modulo, AlmaG_Descripcion, AlmaG_UsuarioCreacion, AlmaG_FechaCreacion, AlmaG_UsuarioModifica, AlmaG_FechaModifica, AlmaG_Estado FROM ALM_ALMGEN WHERE AlmaG_Codigo = ? AND Alma_Modulo = ?  FOR UPDATE OF AlmaG_Descripcion, AlmaG_UsuarioCreacion, AlmaG_FechaCreacion, AlmaG_UsuarioModifica, AlmaG_FechaModifica, AlmaG_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00183", "SELECT AlmaG_Codigo, Alma_Modulo, AlmaG_Descripcion, AlmaG_UsuarioCreacion, AlmaG_FechaCreacion, AlmaG_UsuarioModifica, AlmaG_FechaModifica, AlmaG_Estado FROM ALM_ALMGEN WHERE AlmaG_Codigo = ? AND Alma_Modulo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00184", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlmaG_Codigo, TM1.Alma_Modulo, TM1.AlmaG_Descripcion, TM1.AlmaG_UsuarioCreacion, TM1.AlmaG_FechaCreacion, TM1.AlmaG_UsuarioModifica, TM1.AlmaG_FechaModifica, TM1.AlmaG_Estado FROM ALM_ALMGEN TM1 WHERE TM1.AlmaG_Codigo = ? and TM1.Alma_Modulo = ? ORDER BY TM1.AlmaG_Codigo, TM1.Alma_Modulo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00185", "SELECT /*+ FIRST_ROWS(1) */ AlmaG_Codigo, Alma_Modulo FROM ALM_ALMGEN WHERE AlmaG_Codigo = ? AND Alma_Modulo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00186", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlmaG_Codigo, Alma_Modulo FROM ALM_ALMGEN WHERE ( AlmaG_Codigo > ? or AlmaG_Codigo = ? and Alma_Modulo > ?) ORDER BY AlmaG_Codigo, Alma_Modulo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00187", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlmaG_Codigo, Alma_Modulo FROM ALM_ALMGEN WHERE ( AlmaG_Codigo < ? or AlmaG_Codigo = ? and Alma_Modulo < ?) ORDER BY AlmaG_Codigo DESC, Alma_Modulo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00188", "INSERT INTO ALM_ALMGEN(AlmaG_Codigo, Alma_Modulo, AlmaG_Descripcion, AlmaG_UsuarioCreacion, AlmaG_FechaCreacion, AlmaG_UsuarioModifica, AlmaG_FechaModifica, AlmaG_Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_ALMGEN")
         ,new UpdateCursor("T00189", "UPDATE ALM_ALMGEN SET AlmaG_Descripcion=?, AlmaG_UsuarioCreacion=?, AlmaG_FechaCreacion=?, AlmaG_UsuarioModifica=?, AlmaG_FechaModifica=?, AlmaG_Estado=?  WHERE AlmaG_Codigo = ? AND Alma_Modulo = ?", GX_NOMASK, "ALM_ALMGEN")
         ,new UpdateCursor("T001810", "DELETE FROM ALM_ALMGEN  WHERE AlmaG_Codigo = ? AND Alma_Modulo = ?", GX_NOMASK, "ALM_ALMGEN")
         ,new ForEachCursor("T001811", "SELECT /*+ FIRST_ROWS(100) */ AlmaG_Codigo, Alma_Modulo FROM ALM_ALMGEN ORDER BY AlmaG_Codigo, Alma_Modulo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
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
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               stmt.setVarchar(3, (String)parms[2], 8, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 4, false);
               stmt.setVarchar(3, (String)parms[2], 8, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setVarchar(7, (String)parms[9], 4, false);
               stmt.setVarchar(8, (String)parms[10], 8, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setVarchar(2, (String)parms[1], 8, false);
               return;
      }
   }

}

