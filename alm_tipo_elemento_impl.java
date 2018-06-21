/*
               File: alm_tipo_elemento_impl
        Description: Tipo de elemento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:22.16
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

public final  class alm_tipo_elemento_impl extends GXDataArea
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
            AV12Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Tipo_Codigo", GXutil.ltrim( GXutil.str( AV12Tipo_Codigo, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
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
      cmbTipo_Tipo.setName( "TIPO_TIPO" );
      cmbTipo_Tipo.setWebtags( "" );
      cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
      cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      }
      cmbTipo_Estado.setName( "TIPO_ESTADO" );
      cmbTipo_Estado.setWebtags( "" );
      cmbTipo_Estado.addItem("A", "Activo", (short)(0));
      cmbTipo_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbTipo_Estado.getItemCount() > 0 )
      {
         A678Tipo_Estado = cmbTipo_Estado.getValidValue(A678Tipo_Estado) ;
         n678Tipo_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
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
         Form.getMeta().addItem("description", "Tipo de elemento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTipo_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_tipo_elemento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_elemento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_elemento_impl.class ));
   }

   public alm_tipo_elemento_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTipo_Tipo = new HTMLChoice();
      cmbTipo_Estado = new HTMLChoice();
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
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      }
      if ( cmbTipo_Estado.getItemCount() > 0 )
      {
         A678Tipo_Estado = cmbTipo_Estado.getValidValue(A678Tipo_Estado) ;
         n678Tipo_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de elemento", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TIPO_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Codigo_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TIPO_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Tipo.getInternalname(), "Tipo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Tipo, cmbTipo_Tipo.getInternalname(), GXutil.rtrim( A480Tipo_Tipo), 1, cmbTipo_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_TIPO_ELEMENTO.htm");
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Estado, cmbTipo_Estado.getInternalname(), GXutil.rtrim( A678Tipo_Estado), 1, cmbTipo_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_ALM_TIPO_ELEMENTO.htm");
         cmbTipo_Estado.setValue( GXutil.rtrim( A678Tipo_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Estado.getInternalname(), "Values", cmbTipo_Estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ELEMENTO.htm");
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
      e110U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPO_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A33Tipo_Codigo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            else
            {
               A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
            A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
            cmbTipo_Estado.setValue( httpContext.cgiGet( cmbTipo_Estado.getInternalname()) );
            A678Tipo_Estado = httpContext.cgiGet( cmbTipo_Estado.getInternalname()) ;
            n678Tipo_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
            n678Tipo_Estado = ((GXutil.strcmp("", A678Tipo_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "Z33Tipo_Codigo"), ",", ".") ;
            Z269Tipo_UsuarioCrea = httpContext.cgiGet( "Z269Tipo_UsuarioCrea") ;
            n269Tipo_UsuarioCrea = ((GXutil.strcmp("", A269Tipo_UsuarioCrea)==0) ? true : false) ;
            Z271Tipo_UsuarioModifica = httpContext.cgiGet( "Z271Tipo_UsuarioModifica") ;
            n271Tipo_UsuarioModifica = ((GXutil.strcmp("", A271Tipo_UsuarioModifica)==0) ? true : false) ;
            Z270Tipo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z270Tipo_FechaCrea"), 0) ;
            n270Tipo_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A270Tipo_FechaCrea) ? true : false) ;
            Z272Tipo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z272Tipo_FechaModifica"), 0) ;
            n272Tipo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A272Tipo_FechaModifica) ? true : false) ;
            Z253Tipo_Descripcion = httpContext.cgiGet( "Z253Tipo_Descripcion") ;
            Z480Tipo_Tipo = httpContext.cgiGet( "Z480Tipo_Tipo") ;
            Z678Tipo_Estado = httpContext.cgiGet( "Z678Tipo_Estado") ;
            n678Tipo_Estado = ((GXutil.strcmp("", A678Tipo_Estado)==0) ? true : false) ;
            A269Tipo_UsuarioCrea = httpContext.cgiGet( "Z269Tipo_UsuarioCrea") ;
            n269Tipo_UsuarioCrea = false ;
            n269Tipo_UsuarioCrea = ((GXutil.strcmp("", A269Tipo_UsuarioCrea)==0) ? true : false) ;
            A271Tipo_UsuarioModifica = httpContext.cgiGet( "Z271Tipo_UsuarioModifica") ;
            n271Tipo_UsuarioModifica = false ;
            n271Tipo_UsuarioModifica = ((GXutil.strcmp("", A271Tipo_UsuarioModifica)==0) ? true : false) ;
            A270Tipo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z270Tipo_FechaCrea"), 0) ;
            n270Tipo_FechaCrea = false ;
            n270Tipo_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A270Tipo_FechaCrea) ? true : false) ;
            A272Tipo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z272Tipo_FechaModifica"), 0) ;
            n272Tipo_FechaModifica = false ;
            n272Tipo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A272Tipo_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV12Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "vTIPO_CODIGO"), ",", ".") ;
            AV11Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A269Tipo_UsuarioCrea = httpContext.cgiGet( "TIPO_USUARIOCREA") ;
            n269Tipo_UsuarioCrea = ((GXutil.strcmp("", A269Tipo_UsuarioCrea)==0) ? true : false) ;
            A271Tipo_UsuarioModifica = httpContext.cgiGet( "TIPO_USUARIOMODIFICA") ;
            n271Tipo_UsuarioModifica = ((GXutil.strcmp("", A271Tipo_UsuarioModifica)==0) ? true : false) ;
            A270Tipo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "TIPO_FECHACREA"), 0) ;
            n270Tipo_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A270Tipo_FechaCrea) ? true : false) ;
            A272Tipo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "TIPO_FECHAMODIFICA"), 0) ;
            n272Tipo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A272Tipo_FechaModifica) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TIPO_ELEMENTO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A33Tipo_Codigo != Z33Tipo_Codigo ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_tipo_elemento:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
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
                  sMode30 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode30 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound30 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0U0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIPO_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipo_Codigo_Internalname ;
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
                        e110U2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120U2 ();
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
         e120U2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0U30( ) ;
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
         disableAttributes0U30( ) ;
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

   public void confirm_0U0( )
   {
      beforeValidate0U30( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0U30( ) ;
         }
         else
         {
            checkExtendedTable0U30( ) ;
            closeExtendedTableCursors0U30( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0U0( )
   {
   }

   public void e110U2( )
   {
      /* Start Routine */
      AV11Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Usuario", AV11Usuario);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e120U2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_tipo_elemento") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0U30( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z269Tipo_UsuarioCrea = T000U3_A269Tipo_UsuarioCrea[0] ;
            Z271Tipo_UsuarioModifica = T000U3_A271Tipo_UsuarioModifica[0] ;
            Z270Tipo_FechaCrea = T000U3_A270Tipo_FechaCrea[0] ;
            Z272Tipo_FechaModifica = T000U3_A272Tipo_FechaModifica[0] ;
            Z253Tipo_Descripcion = T000U3_A253Tipo_Descripcion[0] ;
            Z480Tipo_Tipo = T000U3_A480Tipo_Tipo[0] ;
            Z678Tipo_Estado = T000U3_A678Tipo_Estado[0] ;
         }
         else
         {
            Z269Tipo_UsuarioCrea = A269Tipo_UsuarioCrea ;
            Z271Tipo_UsuarioModifica = A271Tipo_UsuarioModifica ;
            Z270Tipo_FechaCrea = A270Tipo_FechaCrea ;
            Z272Tipo_FechaModifica = A272Tipo_FechaModifica ;
            Z253Tipo_Descripcion = A253Tipo_Descripcion ;
            Z480Tipo_Tipo = A480Tipo_Tipo ;
            Z678Tipo_Estado = A678Tipo_Estado ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         Z269Tipo_UsuarioCrea = A269Tipo_UsuarioCrea ;
         Z271Tipo_UsuarioModifica = A271Tipo_UsuarioModifica ;
         Z270Tipo_FechaCrea = A270Tipo_FechaCrea ;
         Z272Tipo_FechaModifica = A272Tipo_FechaModifica ;
         Z253Tipo_Descripcion = A253Tipo_Descripcion ;
         Z480Tipo_Tipo = A480Tipo_Tipo ;
         Z678Tipo_Estado = A678Tipo_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV12Tipo_Codigo) )
      {
         A33Tipo_Codigo = AV12Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
      if ( ! (0==AV12Tipo_Codigo) )
      {
         edtTipo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTipo_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV12Tipo_Codigo) )
      {
         edtTipo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
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
         AV13Pgmname = "ALM_TIPO_ELEMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
   }

   public void load0U30( )
   {
      /* Using cursor T000U4 */
      pr_default.execute(2, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A269Tipo_UsuarioCrea = T000U4_A269Tipo_UsuarioCrea[0] ;
         n269Tipo_UsuarioCrea = T000U4_n269Tipo_UsuarioCrea[0] ;
         A271Tipo_UsuarioModifica = T000U4_A271Tipo_UsuarioModifica[0] ;
         n271Tipo_UsuarioModifica = T000U4_n271Tipo_UsuarioModifica[0] ;
         A270Tipo_FechaCrea = T000U4_A270Tipo_FechaCrea[0] ;
         n270Tipo_FechaCrea = T000U4_n270Tipo_FechaCrea[0] ;
         A272Tipo_FechaModifica = T000U4_A272Tipo_FechaModifica[0] ;
         n272Tipo_FechaModifica = T000U4_n272Tipo_FechaModifica[0] ;
         A253Tipo_Descripcion = T000U4_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A480Tipo_Tipo = T000U4_A480Tipo_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         A678Tipo_Estado = T000U4_A678Tipo_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
         n678Tipo_Estado = T000U4_n678Tipo_Estado[0] ;
         zm0U30( -8) ;
      }
      pr_default.close(2);
      onLoadActions0U30( ) ;
   }

   public void onLoadActions0U30( )
   {
      AV13Pgmname = "ALM_TIPO_ELEMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0U30( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_TIPO_ELEMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0U30( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0U30( )
   {
      /* Using cursor T000U5 */
      pr_default.execute(3, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound30 = (short)(1) ;
      }
      else
      {
         RcdFound30 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000U3 */
      pr_default.execute(1, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0U30( 8) ;
         RcdFound30 = (short)(1) ;
         A33Tipo_Codigo = T000U3_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A269Tipo_UsuarioCrea = T000U3_A269Tipo_UsuarioCrea[0] ;
         n269Tipo_UsuarioCrea = T000U3_n269Tipo_UsuarioCrea[0] ;
         A271Tipo_UsuarioModifica = T000U3_A271Tipo_UsuarioModifica[0] ;
         n271Tipo_UsuarioModifica = T000U3_n271Tipo_UsuarioModifica[0] ;
         A270Tipo_FechaCrea = T000U3_A270Tipo_FechaCrea[0] ;
         n270Tipo_FechaCrea = T000U3_n270Tipo_FechaCrea[0] ;
         A272Tipo_FechaModifica = T000U3_A272Tipo_FechaModifica[0] ;
         n272Tipo_FechaModifica = T000U3_n272Tipo_FechaModifica[0] ;
         A253Tipo_Descripcion = T000U3_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A480Tipo_Tipo = T000U3_A480Tipo_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         A678Tipo_Estado = T000U3_A678Tipo_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
         n678Tipo_Estado = T000U3_n678Tipo_Estado[0] ;
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0U30( ) ;
         if ( AnyError == 1 )
         {
            RcdFound30 = (short)(0) ;
            initializeNonKey0U30( ) ;
         }
         Gx_mode = sMode30 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound30 = (short)(0) ;
         initializeNonKey0U30( ) ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode30 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0U30( ) ;
      if ( RcdFound30 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound30 = (short)(0) ;
      /* Using cursor T000U6 */
      pr_default.execute(4, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000U6_A33Tipo_Codigo[0] < A33Tipo_Codigo ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000U6_A33Tipo_Codigo[0] > A33Tipo_Codigo ) ) )
         {
            A33Tipo_Codigo = T000U6_A33Tipo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            RcdFound30 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound30 = (short)(0) ;
      /* Using cursor T000U7 */
      pr_default.execute(5, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000U7_A33Tipo_Codigo[0] > A33Tipo_Codigo ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000U7_A33Tipo_Codigo[0] < A33Tipo_Codigo ) ) )
         {
            A33Tipo_Codigo = T000U7_A33Tipo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            RcdFound30 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0U30( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0U30( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound30 == 1 )
         {
            if ( A33Tipo_Codigo != Z33Tipo_Codigo )
            {
               A33Tipo_Codigo = Z33Tipo_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIPO_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0U30( ) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A33Tipo_Codigo != Z33Tipo_Codigo )
            {
               /* Insert record */
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0U30( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIPO_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipo_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTipo_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0U30( ) ;
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
      if ( A33Tipo_Codigo != Z33Tipo_Codigo )
      {
         A33Tipo_Codigo = Z33Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0U30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000U2 */
         pr_default.execute(0, new Object[] {new Long(A33Tipo_Codigo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_ELEMENTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z269Tipo_UsuarioCrea, T000U2_A269Tipo_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z271Tipo_UsuarioModifica, T000U2_A271Tipo_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z270Tipo_FechaCrea, T000U2_A270Tipo_FechaCrea[0]) ) || !( GXutil.dateCompare(Z272Tipo_FechaModifica, T000U2_A272Tipo_FechaModifica[0]) ) || ( GXutil.strcmp(Z253Tipo_Descripcion, T000U2_A253Tipo_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z480Tipo_Tipo, T000U2_A480Tipo_Tipo[0]) != 0 ) || ( GXutil.strcmp(Z678Tipo_Estado, T000U2_A678Tipo_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_ELEMENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0U30( )
   {
      beforeValidate0U30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U30( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0U30( 0) ;
         checkOptimisticConcurrency0U30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U30( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0U30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000U8 */
                  pr_default.execute(6, new Object[] {new Long(A33Tipo_Codigo), new Boolean(n269Tipo_UsuarioCrea), A269Tipo_UsuarioCrea, new Boolean(n271Tipo_UsuarioModifica), A271Tipo_UsuarioModifica, new Boolean(n270Tipo_FechaCrea), A270Tipo_FechaCrea, new Boolean(n272Tipo_FechaModifica), A272Tipo_FechaModifica, A253Tipo_Descripcion, A480Tipo_Tipo, new Boolean(n678Tipo_Estado), A678Tipo_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ELEMENTO") ;
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
                        resetCaption0U0( ) ;
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
            load0U30( ) ;
         }
         endLevel0U30( ) ;
      }
      closeExtendedTableCursors0U30( ) ;
   }

   public void update0U30( )
   {
      beforeValidate0U30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U30( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U30( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0U30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000U9 */
                  pr_default.execute(7, new Object[] {new Boolean(n269Tipo_UsuarioCrea), A269Tipo_UsuarioCrea, new Boolean(n271Tipo_UsuarioModifica), A271Tipo_UsuarioModifica, new Boolean(n270Tipo_FechaCrea), A270Tipo_FechaCrea, new Boolean(n272Tipo_FechaModifica), A272Tipo_FechaModifica, A253Tipo_Descripcion, A480Tipo_Tipo, new Boolean(n678Tipo_Estado), A678Tipo_Estado, new Long(A33Tipo_Codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ELEMENTO") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_ELEMENTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0U30( ) ;
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
         endLevel0U30( ) ;
      }
      closeExtendedTableCursors0U30( ) ;
   }

   public void deferredUpdate0U30( )
   {
   }

   public void delete( )
   {
      beforeValidate0U30( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U30( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0U30( ) ;
         afterConfirm0U30( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0U30( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000U10 */
               pr_default.execute(8, new Object[] {new Long(A33Tipo_Codigo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ELEMENTO") ;
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
      sMode30 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0U30( ) ;
      Gx_mode = sMode30 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0U30( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_TIPO_ELEMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000U11 */
         pr_default.execute(9, new Object[] {new Long(A33Tipo_Codigo)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Elemento"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000U12 */
         pr_default.execute(10, new Object[] {new Long(A33Tipo_Codigo)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TIPO DE MOVIMIENTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0U30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0U30( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_elemento");
         if ( AnyError == 0 )
         {
            confirmValues0U0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_elemento");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0U30( )
   {
      /* Scan By routine */
      /* Using cursor T000U13 */
      pr_default.execute(11);
      RcdFound30 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A33Tipo_Codigo = T000U13_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0U30( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound30 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A33Tipo_Codigo = T000U13_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
   }

   public void scanEnd0U30( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0U30( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A270Tipo_FechaCrea = GXutil.now( ) ;
         n270Tipo_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A270Tipo_FechaCrea", localUtil.ttoc( A270Tipo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A272Tipo_FechaModifica = GXutil.now( ) ;
         n272Tipo_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A272Tipo_FechaModifica", localUtil.ttoc( A272Tipo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A269Tipo_UsuarioCrea = AV11Usuario ;
         n269Tipo_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A269Tipo_UsuarioCrea", A269Tipo_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A271Tipo_UsuarioModifica = AV11Usuario ;
         n271Tipo_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271Tipo_UsuarioModifica", A271Tipo_UsuarioModifica);
      }
   }

   public void beforeInsert0U30( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0U30( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0U30( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0U30( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0U30( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0U30( )
   {
      edtTipo_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      edtTipo_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Descripcion_Enabled, 5, 0)), true);
      cmbTipo_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTipo_Tipo.getEnabled(), 5, 0)), true);
      cmbTipo_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTipo_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0U0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414162299");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12Tipo_Codigo,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( Z33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z269Tipo_UsuarioCrea", Z269Tipo_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z271Tipo_UsuarioModifica", Z271Tipo_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z270Tipo_FechaCrea", localUtil.ttoc( Z270Tipo_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z272Tipo_FechaModifica", localUtil.ttoc( Z272Tipo_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z253Tipo_Descripcion", Z253Tipo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z480Tipo_Tipo", GXutil.rtrim( Z480Tipo_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z678Tipo_Estado", GXutil.rtrim( Z678Tipo_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV12Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV11Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_USUARIOCREA", A269Tipo_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_USUARIOMODIFICA", A271Tipo_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_FECHACREA", localUtil.ttoc( A270Tipo_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_FECHAMODIFICA", localUtil.ttoc( A272Tipo_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TIPO_ELEMENTO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_tipo_elemento:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_tipo_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12Tipo_Codigo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_TIPO_ELEMENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de elemento" ;
   }

   public void initializeNonKey0U30( )
   {
      A269Tipo_UsuarioCrea = "" ;
      n269Tipo_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269Tipo_UsuarioCrea", A269Tipo_UsuarioCrea);
      A271Tipo_UsuarioModifica = "" ;
      n271Tipo_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271Tipo_UsuarioModifica", A271Tipo_UsuarioModifica);
      A270Tipo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n270Tipo_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270Tipo_FechaCrea", localUtil.ttoc( A270Tipo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A272Tipo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n272Tipo_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A272Tipo_FechaModifica", localUtil.ttoc( A272Tipo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A253Tipo_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      A480Tipo_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      A678Tipo_Estado = "" ;
      n678Tipo_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A678Tipo_Estado", A678Tipo_Estado);
      n678Tipo_Estado = ((GXutil.strcmp("", A678Tipo_Estado)==0) ? true : false) ;
      Z269Tipo_UsuarioCrea = "" ;
      Z271Tipo_UsuarioModifica = "" ;
      Z270Tipo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z272Tipo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z253Tipo_Descripcion = "" ;
      Z480Tipo_Tipo = "" ;
      Z678Tipo_Estado = "" ;
   }

   public void initAll0U30( )
   {
      A33Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      initializeNonKey0U30( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416235");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_tipo_elemento.js", "?20186141416235");
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
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION" ;
      cmbTipo_Tipo.setInternalname( "TIPO_TIPO" );
      cmbTipo_Estado.setInternalname( "TIPO_ESTADO" );
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
      Form.setCaption( "Tipo de elemento" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTipo_Estado.setJsonclick( "" );
      cmbTipo_Estado.setEnabled( 1 );
      cmbTipo_Tipo.setJsonclick( "" );
      cmbTipo_Tipo.setEnabled( 1 );
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Enabled = 1 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV12Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120U2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z269Tipo_UsuarioCrea = "" ;
      Z271Tipo_UsuarioModifica = "" ;
      Z270Tipo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z272Tipo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z253Tipo_Descripcion = "" ;
      Z480Tipo_Tipo = "" ;
      Z678Tipo_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A480Tipo_Tipo = "" ;
      A678Tipo_Estado = "" ;
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
      A253Tipo_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A269Tipo_UsuarioCrea = "" ;
      A271Tipo_UsuarioModifica = "" ;
      A270Tipo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A272Tipo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV11Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode30 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10WebSession = httpContext.getWebSession();
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      T000U4_A33Tipo_Codigo = new long[1] ;
      T000U4_A269Tipo_UsuarioCrea = new String[] {""} ;
      T000U4_n269Tipo_UsuarioCrea = new boolean[] {false} ;
      T000U4_A271Tipo_UsuarioModifica = new String[] {""} ;
      T000U4_n271Tipo_UsuarioModifica = new boolean[] {false} ;
      T000U4_A270Tipo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000U4_n270Tipo_FechaCrea = new boolean[] {false} ;
      T000U4_A272Tipo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000U4_n272Tipo_FechaModifica = new boolean[] {false} ;
      T000U4_A253Tipo_Descripcion = new String[] {""} ;
      T000U4_A480Tipo_Tipo = new String[] {""} ;
      T000U4_A678Tipo_Estado = new String[] {""} ;
      T000U4_n678Tipo_Estado = new boolean[] {false} ;
      T000U5_A33Tipo_Codigo = new long[1] ;
      T000U3_A33Tipo_Codigo = new long[1] ;
      T000U3_A269Tipo_UsuarioCrea = new String[] {""} ;
      T000U3_n269Tipo_UsuarioCrea = new boolean[] {false} ;
      T000U3_A271Tipo_UsuarioModifica = new String[] {""} ;
      T000U3_n271Tipo_UsuarioModifica = new boolean[] {false} ;
      T000U3_A270Tipo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000U3_n270Tipo_FechaCrea = new boolean[] {false} ;
      T000U3_A272Tipo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000U3_n272Tipo_FechaModifica = new boolean[] {false} ;
      T000U3_A253Tipo_Descripcion = new String[] {""} ;
      T000U3_A480Tipo_Tipo = new String[] {""} ;
      T000U3_A678Tipo_Estado = new String[] {""} ;
      T000U3_n678Tipo_Estado = new boolean[] {false} ;
      T000U6_A33Tipo_Codigo = new long[1] ;
      T000U7_A33Tipo_Codigo = new long[1] ;
      T000U2_A33Tipo_Codigo = new long[1] ;
      T000U2_A269Tipo_UsuarioCrea = new String[] {""} ;
      T000U2_n269Tipo_UsuarioCrea = new boolean[] {false} ;
      T000U2_A271Tipo_UsuarioModifica = new String[] {""} ;
      T000U2_n271Tipo_UsuarioModifica = new boolean[] {false} ;
      T000U2_A270Tipo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000U2_n270Tipo_FechaCrea = new boolean[] {false} ;
      T000U2_A272Tipo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000U2_n272Tipo_FechaModifica = new boolean[] {false} ;
      T000U2_A253Tipo_Descripcion = new String[] {""} ;
      T000U2_A480Tipo_Tipo = new String[] {""} ;
      T000U2_A678Tipo_Estado = new String[] {""} ;
      T000U2_n678Tipo_Estado = new boolean[] {false} ;
      T000U11_A66Elem_Consecutivo = new String[] {""} ;
      T000U12_A38Tpmo_Codigo = new String[] {""} ;
      T000U13_A33Tipo_Codigo = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_elemento__default(),
         new Object[] {
             new Object[] {
            T000U2_A33Tipo_Codigo, T000U2_A269Tipo_UsuarioCrea, T000U2_n269Tipo_UsuarioCrea, T000U2_A271Tipo_UsuarioModifica, T000U2_n271Tipo_UsuarioModifica, T000U2_A270Tipo_FechaCrea, T000U2_n270Tipo_FechaCrea, T000U2_A272Tipo_FechaModifica, T000U2_n272Tipo_FechaModifica, T000U2_A253Tipo_Descripcion,
            T000U2_A480Tipo_Tipo, T000U2_A678Tipo_Estado, T000U2_n678Tipo_Estado
            }
            , new Object[] {
            T000U3_A33Tipo_Codigo, T000U3_A269Tipo_UsuarioCrea, T000U3_n269Tipo_UsuarioCrea, T000U3_A271Tipo_UsuarioModifica, T000U3_n271Tipo_UsuarioModifica, T000U3_A270Tipo_FechaCrea, T000U3_n270Tipo_FechaCrea, T000U3_A272Tipo_FechaModifica, T000U3_n272Tipo_FechaModifica, T000U3_A253Tipo_Descripcion,
            T000U3_A480Tipo_Tipo, T000U3_A678Tipo_Estado, T000U3_n678Tipo_Estado
            }
            , new Object[] {
            T000U4_A33Tipo_Codigo, T000U4_A269Tipo_UsuarioCrea, T000U4_n269Tipo_UsuarioCrea, T000U4_A271Tipo_UsuarioModifica, T000U4_n271Tipo_UsuarioModifica, T000U4_A270Tipo_FechaCrea, T000U4_n270Tipo_FechaCrea, T000U4_A272Tipo_FechaModifica, T000U4_n272Tipo_FechaModifica, T000U4_A253Tipo_Descripcion,
            T000U4_A480Tipo_Tipo, T000U4_A678Tipo_Estado, T000U4_n678Tipo_Estado
            }
            , new Object[] {
            T000U5_A33Tipo_Codigo
            }
            , new Object[] {
            T000U6_A33Tipo_Codigo
            }
            , new Object[] {
            T000U7_A33Tipo_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000U11_A66Elem_Consecutivo
            }
            , new Object[] {
            T000U12_A38Tpmo_Codigo
            }
            , new Object[] {
            T000U13_A33Tipo_Codigo
            }
         }
      );
      AV13Pgmname = "ALM_TIPO_ELEMENTO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound30 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTipo_Codigo_Enabled ;
   private int edtTipo_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV12Tipo_Codigo ;
   private long Z33Tipo_Codigo ;
   private long AV12Tipo_Codigo ;
   private long A33Tipo_Codigo ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z480Tipo_Tipo ;
   private String Z678Tipo_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A480Tipo_Tipo ;
   private String A678Tipo_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipo_Codigo_Internalname ;
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
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode30 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z270Tipo_FechaCrea ;
   private java.util.Date Z272Tipo_FechaModifica ;
   private java.util.Date A270Tipo_FechaCrea ;
   private java.util.Date A272Tipo_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n678Tipo_Estado ;
   private boolean wbErr ;
   private boolean n269Tipo_UsuarioCrea ;
   private boolean n271Tipo_UsuarioModifica ;
   private boolean n270Tipo_FechaCrea ;
   private boolean n272Tipo_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z269Tipo_UsuarioCrea ;
   private String Z271Tipo_UsuarioModifica ;
   private String Z253Tipo_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A269Tipo_UsuarioCrea ;
   private String A271Tipo_UsuarioModifica ;
   private String AV11Usuario ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTipo_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] T000U4_A33Tipo_Codigo ;
   private String[] T000U4_A269Tipo_UsuarioCrea ;
   private boolean[] T000U4_n269Tipo_UsuarioCrea ;
   private String[] T000U4_A271Tipo_UsuarioModifica ;
   private boolean[] T000U4_n271Tipo_UsuarioModifica ;
   private java.util.Date[] T000U4_A270Tipo_FechaCrea ;
   private boolean[] T000U4_n270Tipo_FechaCrea ;
   private java.util.Date[] T000U4_A272Tipo_FechaModifica ;
   private boolean[] T000U4_n272Tipo_FechaModifica ;
   private String[] T000U4_A253Tipo_Descripcion ;
   private String[] T000U4_A480Tipo_Tipo ;
   private String[] T000U4_A678Tipo_Estado ;
   private boolean[] T000U4_n678Tipo_Estado ;
   private long[] T000U5_A33Tipo_Codigo ;
   private long[] T000U3_A33Tipo_Codigo ;
   private String[] T000U3_A269Tipo_UsuarioCrea ;
   private boolean[] T000U3_n269Tipo_UsuarioCrea ;
   private String[] T000U3_A271Tipo_UsuarioModifica ;
   private boolean[] T000U3_n271Tipo_UsuarioModifica ;
   private java.util.Date[] T000U3_A270Tipo_FechaCrea ;
   private boolean[] T000U3_n270Tipo_FechaCrea ;
   private java.util.Date[] T000U3_A272Tipo_FechaModifica ;
   private boolean[] T000U3_n272Tipo_FechaModifica ;
   private String[] T000U3_A253Tipo_Descripcion ;
   private String[] T000U3_A480Tipo_Tipo ;
   private String[] T000U3_A678Tipo_Estado ;
   private boolean[] T000U3_n678Tipo_Estado ;
   private long[] T000U6_A33Tipo_Codigo ;
   private long[] T000U7_A33Tipo_Codigo ;
   private long[] T000U2_A33Tipo_Codigo ;
   private String[] T000U2_A269Tipo_UsuarioCrea ;
   private boolean[] T000U2_n269Tipo_UsuarioCrea ;
   private String[] T000U2_A271Tipo_UsuarioModifica ;
   private boolean[] T000U2_n271Tipo_UsuarioModifica ;
   private java.util.Date[] T000U2_A270Tipo_FechaCrea ;
   private boolean[] T000U2_n270Tipo_FechaCrea ;
   private java.util.Date[] T000U2_A272Tipo_FechaModifica ;
   private boolean[] T000U2_n272Tipo_FechaModifica ;
   private String[] T000U2_A253Tipo_Descripcion ;
   private String[] T000U2_A480Tipo_Tipo ;
   private String[] T000U2_A678Tipo_Estado ;
   private boolean[] T000U2_n678Tipo_Estado ;
   private String[] T000U11_A66Elem_Consecutivo ;
   private String[] T000U12_A38Tpmo_Codigo ;
   private long[] T000U13_A33Tipo_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
}

final  class alm_tipo_elemento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000U2", "SELECT Tipo_Codigo, Tipo_UsuarioCrea, Tipo_UsuarioModifica, Tipo_FechaCrea, Tipo_FechaModifica, Tipo_Descripcion, Tipo_Tipo, Tipo_Estado FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ?  FOR UPDATE OF Tipo_UsuarioCrea, Tipo_UsuarioModifica, Tipo_FechaCrea, Tipo_FechaModifica, Tipo_Descripcion, Tipo_Tipo, Tipo_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U3", "SELECT Tipo_Codigo, Tipo_UsuarioCrea, Tipo_UsuarioModifica, Tipo_FechaCrea, Tipo_FechaModifica, Tipo_Descripcion, Tipo_Tipo, Tipo_Estado FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tipo_Codigo, TM1.Tipo_UsuarioCrea, TM1.Tipo_UsuarioModifica, TM1.Tipo_FechaCrea, TM1.Tipo_FechaModifica, TM1.Tipo_Descripcion, TM1.Tipo_Tipo, TM1.Tipo_Estado FROM ALM_TIPO_ELEMENTO TM1 WHERE TM1.Tipo_Codigo = ? ORDER BY TM1.Tipo_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000U5", "SELECT /*+ FIRST_ROWS(1) */ Tipo_Codigo FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tipo_Codigo FROM ALM_TIPO_ELEMENTO WHERE ( Tipo_Codigo > ?) ORDER BY Tipo_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000U7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tipo_Codigo FROM ALM_TIPO_ELEMENTO WHERE ( Tipo_Codigo < ?) ORDER BY Tipo_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000U8", "INSERT INTO ALM_TIPO_ELEMENTO(Tipo_Codigo, Tipo_UsuarioCrea, Tipo_UsuarioModifica, Tipo_FechaCrea, Tipo_FechaModifica, Tipo_Descripcion, Tipo_Tipo, Tipo_Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_ELEMENTO")
         ,new UpdateCursor("T000U9", "UPDATE ALM_TIPO_ELEMENTO SET Tipo_UsuarioCrea=?, Tipo_UsuarioModifica=?, Tipo_FechaCrea=?, Tipo_FechaModifica=?, Tipo_Descripcion=?, Tipo_Tipo=?, Tipo_Estado=?  WHERE Tipo_Codigo = ?", GX_NOMASK, "ALM_TIPO_ELEMENTO")
         ,new UpdateCursor("T000U10", "DELETE FROM ALM_TIPO_ELEMENTO  WHERE Tipo_Codigo = ?", GX_NOMASK, "ALM_TIPO_ELEMENTO")
         ,new ForEachCursor("T000U11", "SELECT * FROM (SELECT Elem_Consecutivo FROM ALM_ELEMENTO WHERE Tipo_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000U12", "SELECT * FROM (SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE Tipo_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000U13", "SELECT /*+ FIRST_ROWS(100) */ Tipo_Codigo FROM ALM_TIPO_ELEMENTO ORDER BY Tipo_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[11])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[11])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[11])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 5 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 6 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               stmt.setVarchar(6, (String)parms[9], 100, false);
               stmt.setString(7, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 1);
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
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               stmt.setVarchar(5, (String)parms[8], 100, false);
               stmt.setString(6, (String)parms[9], 1);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               stmt.setBigDecimal(8, ((Number) parms[12]).longValue(), 0);
               return;
            case 8 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 9 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 10 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
      }
   }

}

