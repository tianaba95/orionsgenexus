/*
               File: alm_tipo_almacen_impl
        Description: Tipo de almacén
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:8.71
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

public final  class alm_tipo_almacen_impl extends GXDataArea
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
            AV11Tpal_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Tpal_Id", GXutil.ltrim( GXutil.str( AV11Tpal_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Tpal_Id), "ZZZZZZZZZZ9")));
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
      cmbTpal_Estado.setName( "TPAL_ESTADO" );
      cmbTpal_Estado.setWebtags( "" );
      cmbTpal_Estado.addItem("", "", (short)(0));
      cmbTpal_Estado.addItem("A", "Activo", (short)(0));
      cmbTpal_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbTpal_Estado.getItemCount() > 0 )
      {
         A677Tpal_Estado = cmbTpal_Estado.getValidValue(A677Tpal_Estado) ;
         n677Tpal_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
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
         Form.getMeta().addItem("description", "Tipo de almacén", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTpal_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_tipo_almacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_almacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_almacen_impl.class ));
   }

   public alm_tipo_almacen_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTpal_Estado = new HTMLChoice();
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
      if ( cmbTpal_Estado.getItemCount() > 0 )
      {
         A677Tpal_Estado = cmbTpal_Estado.getValidValue(A677Tpal_Estado) ;
         n677Tpal_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de almacén", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "Center", "top", "", "", "div");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")), ((edtTpal_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpal_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TIPO_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Descripcion_Internalname, "Tipo de almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Descripcion_Internalname, A307Tpal_Descripcion, GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpal_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpal_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpal_Estado, cmbTpal_Estado.getInternalname(), GXutil.rtrim( A677Tpal_Estado), 1, cmbTpal_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTpal_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_TIPO_ALMACEN.htm");
         cmbTpal_Estado.setValue( GXutil.rtrim( A677Tpal_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpal_Estado.getInternalname(), "Values", cmbTpal_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_ALMACEN.htm");
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
      e11102 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            A307Tpal_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpal_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
            cmbTpal_Estado.setValue( httpContext.cgiGet( cmbTpal_Estado.getInternalname()) );
            A677Tpal_Estado = httpContext.cgiGet( cmbTpal_Estado.getInternalname()) ;
            n677Tpal_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
            n677Tpal_Estado = ((GXutil.strcmp("", A677Tpal_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z29Tpal_Id = localUtil.ctol( httpContext.cgiGet( "Z29Tpal_Id"), ",", ".") ;
            Z308Tpal_UsuarioCreacion = httpContext.cgiGet( "Z308Tpal_UsuarioCreacion") ;
            Z309Tpal_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z309Tpal_FechaCreacion"), 0) ;
            Z310Tpal_UsuarioModifica = httpContext.cgiGet( "Z310Tpal_UsuarioModifica") ;
            Z311Tpal_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z311Tpal_FechaModifica"), 0) ;
            Z307Tpal_Descripcion = httpContext.cgiGet( "Z307Tpal_Descripcion") ;
            Z677Tpal_Estado = httpContext.cgiGet( "Z677Tpal_Estado") ;
            n677Tpal_Estado = ((GXutil.strcmp("", A677Tpal_Estado)==0) ? true : false) ;
            A308Tpal_UsuarioCreacion = httpContext.cgiGet( "Z308Tpal_UsuarioCreacion") ;
            A309Tpal_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z309Tpal_FechaCreacion"), 0) ;
            A310Tpal_UsuarioModifica = httpContext.cgiGet( "Z310Tpal_UsuarioModifica") ;
            A311Tpal_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z311Tpal_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11Tpal_Id = localUtil.ctol( httpContext.cgiGet( "vTPAL_ID"), ",", ".") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A308Tpal_UsuarioCreacion = httpContext.cgiGet( "TPAL_USUARIOCREACION") ;
            A309Tpal_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "TPAL_FECHACREACION"), 0) ;
            A310Tpal_UsuarioModifica = httpContext.cgiGet( "TPAL_USUARIOMODIFICA") ;
            A311Tpal_FechaModifica = localUtil.ctot( httpContext.cgiGet( "TPAL_FECHAMODIFICA"), 0) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TIPO_ALMACEN" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A29Tpal_Id != Z29Tpal_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_tipo_almacen:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A29Tpal_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
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
                  sMode37 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode37 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound37 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_100( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TPAL_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTpal_Id_Internalname ;
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
                        e11102 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12102 ();
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
         e12102 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1037( ) ;
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
         disableAttributes1037( ) ;
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

   public void confirm_100( )
   {
      beforeValidate1037( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1037( ) ;
         }
         else
         {
            checkExtendedTable1037( ) ;
            closeExtendedTableCursors1037( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption100( )
   {
   }

   public void e11102( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      AV12Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e12102( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_tipo_almacen") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1037( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z308Tpal_UsuarioCreacion = T00103_A308Tpal_UsuarioCreacion[0] ;
            Z309Tpal_FechaCreacion = T00103_A309Tpal_FechaCreacion[0] ;
            Z310Tpal_UsuarioModifica = T00103_A310Tpal_UsuarioModifica[0] ;
            Z311Tpal_FechaModifica = T00103_A311Tpal_FechaModifica[0] ;
            Z307Tpal_Descripcion = T00103_A307Tpal_Descripcion[0] ;
            Z677Tpal_Estado = T00103_A677Tpal_Estado[0] ;
         }
         else
         {
            Z308Tpal_UsuarioCreacion = A308Tpal_UsuarioCreacion ;
            Z309Tpal_FechaCreacion = A309Tpal_FechaCreacion ;
            Z310Tpal_UsuarioModifica = A310Tpal_UsuarioModifica ;
            Z311Tpal_FechaModifica = A311Tpal_FechaModifica ;
            Z307Tpal_Descripcion = A307Tpal_Descripcion ;
            Z677Tpal_Estado = A677Tpal_Estado ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z29Tpal_Id = A29Tpal_Id ;
         Z308Tpal_UsuarioCreacion = A308Tpal_UsuarioCreacion ;
         Z309Tpal_FechaCreacion = A309Tpal_FechaCreacion ;
         Z310Tpal_UsuarioModifica = A310Tpal_UsuarioModifica ;
         Z311Tpal_FechaModifica = A311Tpal_FechaModifica ;
         Z307Tpal_Descripcion = A307Tpal_Descripcion ;
         Z677Tpal_Estado = A677Tpal_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTpal_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      edtTpal_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV11Tpal_Id) )
      {
         A29Tpal_Id = AV11Tpal_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
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
   }

   public void load1037( )
   {
      /* Using cursor T00104 */
      pr_default.execute(2, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A308Tpal_UsuarioCreacion = T00104_A308Tpal_UsuarioCreacion[0] ;
         A309Tpal_FechaCreacion = T00104_A309Tpal_FechaCreacion[0] ;
         A310Tpal_UsuarioModifica = T00104_A310Tpal_UsuarioModifica[0] ;
         A311Tpal_FechaModifica = T00104_A311Tpal_FechaModifica[0] ;
         A307Tpal_Descripcion = T00104_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         A677Tpal_Estado = T00104_A677Tpal_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
         n677Tpal_Estado = T00104_n677Tpal_Estado[0] ;
         zm1037( -7) ;
      }
      pr_default.close(2);
      onLoadActions1037( ) ;
   }

   public void onLoadActions1037( )
   {
      AV13Pgmname = "ALM_TIPO_ALMACEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1037( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_TIPO_ALMACEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1037( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1037( )
   {
      /* Using cursor T00105 */
      pr_default.execute(3, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00103 */
      pr_default.execute(1, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1037( 7) ;
         RcdFound37 = (short)(1) ;
         A29Tpal_Id = T00103_A29Tpal_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         A308Tpal_UsuarioCreacion = T00103_A308Tpal_UsuarioCreacion[0] ;
         A309Tpal_FechaCreacion = T00103_A309Tpal_FechaCreacion[0] ;
         A310Tpal_UsuarioModifica = T00103_A310Tpal_UsuarioModifica[0] ;
         A311Tpal_FechaModifica = T00103_A311Tpal_FechaModifica[0] ;
         A307Tpal_Descripcion = T00103_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         A677Tpal_Estado = T00103_A677Tpal_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
         n677Tpal_Estado = T00103_n677Tpal_Estado[0] ;
         Z29Tpal_Id = A29Tpal_Id ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1037( ) ;
         if ( AnyError == 1 )
         {
            RcdFound37 = (short)(0) ;
            initializeNonKey1037( ) ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey1037( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1037( ) ;
      if ( RcdFound37 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound37 = (short)(0) ;
      /* Using cursor T00106 */
      pr_default.execute(4, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00106_A29Tpal_Id[0] < A29Tpal_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00106_A29Tpal_Id[0] > A29Tpal_Id ) ) )
         {
            A29Tpal_Id = T00106_A29Tpal_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            RcdFound37 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound37 = (short)(0) ;
      /* Using cursor T00107 */
      pr_default.execute(5, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00107_A29Tpal_Id[0] > A29Tpal_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00107_A29Tpal_Id[0] < A29Tpal_Id ) ) )
         {
            A29Tpal_Id = T00107_A29Tpal_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            RcdFound37 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1037( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTpal_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1037( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound37 == 1 )
         {
            if ( A29Tpal_Id != Z29Tpal_Id )
            {
               A29Tpal_Id = Z29Tpal_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TPAL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpal_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTpal_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1037( ) ;
               GX_FocusControl = edtTpal_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A29Tpal_Id != Z29Tpal_Id )
            {
               /* Insert record */
               GX_FocusControl = edtTpal_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1037( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TPAL_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTpal_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTpal_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1037( ) ;
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
      if ( A29Tpal_Id != Z29Tpal_Id )
      {
         A29Tpal_Id = Z29Tpal_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TPAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpal_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTpal_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1037( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00102 */
         pr_default.execute(0, new Object[] {new Long(A29Tpal_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_ALMACEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z308Tpal_UsuarioCreacion, T00102_A308Tpal_UsuarioCreacion[0]) != 0 ) || !( GXutil.dateCompare(Z309Tpal_FechaCreacion, T00102_A309Tpal_FechaCreacion[0]) ) || ( GXutil.strcmp(Z310Tpal_UsuarioModifica, T00102_A310Tpal_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z311Tpal_FechaModifica, T00102_A311Tpal_FechaModifica[0]) ) || ( GXutil.strcmp(Z307Tpal_Descripcion, T00102_A307Tpal_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z677Tpal_Estado, T00102_A677Tpal_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_ALMACEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1037( )
   {
      beforeValidate1037( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1037( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1037( 0) ;
         checkOptimisticConcurrency1037( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1037( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1037( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00108 */
                  pr_default.execute(6, new Object[] {A308Tpal_UsuarioCreacion, A309Tpal_FechaCreacion, A310Tpal_UsuarioModifica, A311Tpal_FechaModifica, A307Tpal_Descripcion, new Boolean(n677Tpal_Estado), A677Tpal_Estado});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00109 */
                  pr_default.execute(7);
                  A29Tpal_Id = T00109_A29Tpal_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ALMACEN") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption100( ) ;
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
            load1037( ) ;
         }
         endLevel1037( ) ;
      }
      closeExtendedTableCursors1037( ) ;
   }

   public void update1037( )
   {
      beforeValidate1037( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1037( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1037( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1037( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1037( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001010 */
                  pr_default.execute(8, new Object[] {A308Tpal_UsuarioCreacion, A309Tpal_FechaCreacion, A310Tpal_UsuarioModifica, A311Tpal_FechaModifica, A307Tpal_Descripcion, new Boolean(n677Tpal_Estado), A677Tpal_Estado, new Long(A29Tpal_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ALMACEN") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_ALMACEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1037( ) ;
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
         endLevel1037( ) ;
      }
      closeExtendedTableCursors1037( ) ;
   }

   public void deferredUpdate1037( )
   {
   }

   public void delete( )
   {
      beforeValidate1037( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1037( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1037( ) ;
         afterConfirm1037( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1037( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001011 */
               pr_default.execute(9, new Object[] {new Long(A29Tpal_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_ALMACEN") ;
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
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1037( ) ;
      Gx_mode = sMode37 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1037( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_TIPO_ALMACEN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001012 */
         pr_default.execute(10, new Object[] {new Long(A29Tpal_Id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TIPO DE MOVIMIENTO"+" ("+"Tipo_Alma_Destino"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001013 */
         pr_default.execute(11, new Object[] {new Long(A29Tpal_Id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TIPO DE MOVIMIENTO"+" ("+"Tipo_Alma_Origen"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T001014 */
         pr_default.execute(12, new Object[] {new Long(A29Tpal_Id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACÉN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1037( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1037( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_almacen");
         if ( AnyError == 0 )
         {
            confirmValues100( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_almacen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1037( )
   {
      /* Scan By routine */
      /* Using cursor T001015 */
      pr_default.execute(13);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A29Tpal_Id = T001015_A29Tpal_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1037( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A29Tpal_Id = T001015_A29Tpal_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
      }
   }

   public void scanEnd1037( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1037( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A309Tpal_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A309Tpal_FechaCreacion", localUtil.ttoc( A309Tpal_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A311Tpal_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A311Tpal_FechaModifica", localUtil.ttoc( A311Tpal_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A308Tpal_UsuarioCreacion = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A308Tpal_UsuarioCreacion", A308Tpal_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A310Tpal_UsuarioModifica = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A310Tpal_UsuarioModifica", A310Tpal_UsuarioModifica);
      }
   }

   public void beforeInsert1037( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1037( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1037( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1037( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1037( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1037( )
   {
      edtTpal_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      edtTpal_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Descripcion_Enabled, 5, 0)), true);
      cmbTpal_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpal_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpal_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues100( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141417949");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11Tpal_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z29Tpal_Id", GXutil.ltrim( localUtil.ntoc( Z29Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z308Tpal_UsuarioCreacion", Z308Tpal_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z309Tpal_FechaCreacion", localUtil.ttoc( Z309Tpal_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z310Tpal_UsuarioModifica", Z310Tpal_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z311Tpal_FechaModifica", localUtil.ttoc( Z311Tpal_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z307Tpal_Descripcion", Z307Tpal_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z677Tpal_Estado", GXutil.rtrim( Z677Tpal_Estado));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTPAL_ID", GXutil.ltrim( localUtil.ntoc( AV11Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_USUARIOCREACION", A308Tpal_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_FECHACREACION", localUtil.ttoc( A309Tpal_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_USUARIOMODIFICA", A310Tpal_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPAL_FECHAMODIFICA", localUtil.ttoc( A311Tpal_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTPAL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Tpal_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TIPO_ALMACEN" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_tipo_almacen:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_tipo_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11Tpal_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_TIPO_ALMACEN" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de almacén" ;
   }

   public void initializeNonKey1037( )
   {
      A308Tpal_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A308Tpal_UsuarioCreacion", A308Tpal_UsuarioCreacion);
      A309Tpal_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A309Tpal_FechaCreacion", localUtil.ttoc( A309Tpal_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A310Tpal_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A310Tpal_UsuarioModifica", A310Tpal_UsuarioModifica);
      A311Tpal_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A311Tpal_FechaModifica", localUtil.ttoc( A311Tpal_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A307Tpal_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
      A677Tpal_Estado = "" ;
      n677Tpal_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A677Tpal_Estado", A677Tpal_Estado);
      n677Tpal_Estado = ((GXutil.strcmp("", A677Tpal_Estado)==0) ? true : false) ;
      Z308Tpal_UsuarioCreacion = "" ;
      Z309Tpal_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z310Tpal_UsuarioModifica = "" ;
      Z311Tpal_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z307Tpal_Descripcion = "" ;
      Z677Tpal_Estado = "" ;
   }

   public void initAll1037( )
   {
      A29Tpal_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
      initializeNonKey1037( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141417955");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_tipo_almacen.js", "?20186141417955");
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
      edtTpal_Id_Internalname = "TPAL_ID" ;
      edtTpal_Descripcion_Internalname = "TPAL_DESCRIPCION" ;
      cmbTpal_Estado.setInternalname( "TPAL_ESTADO" );
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
      Form.setCaption( "Tipo de almacén" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTpal_Estado.setJsonclick( "" );
      cmbTpal_Estado.setEnabled( 1 );
      edtTpal_Descripcion_Jsonclick = "" ;
      edtTpal_Descripcion_Enabled = 1 ;
      edtTpal_Id_Jsonclick = "" ;
      edtTpal_Id_Enabled = 0 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV11Tpal_Id',fld:'vTPAL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12102',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z308Tpal_UsuarioCreacion = "" ;
      Z309Tpal_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z310Tpal_UsuarioModifica = "" ;
      Z311Tpal_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z307Tpal_Descripcion = "" ;
      Z677Tpal_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A677Tpal_Estado = "" ;
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
      A307Tpal_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A308Tpal_UsuarioCreacion = "" ;
      A309Tpal_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A310Tpal_UsuarioModifica = "" ;
      A311Tpal_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode37 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T00104_A29Tpal_Id = new long[1] ;
      T00104_A308Tpal_UsuarioCreacion = new String[] {""} ;
      T00104_A309Tpal_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00104_A310Tpal_UsuarioModifica = new String[] {""} ;
      T00104_A311Tpal_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00104_A307Tpal_Descripcion = new String[] {""} ;
      T00104_A677Tpal_Estado = new String[] {""} ;
      T00104_n677Tpal_Estado = new boolean[] {false} ;
      T00105_A29Tpal_Id = new long[1] ;
      T00103_A29Tpal_Id = new long[1] ;
      T00103_A308Tpal_UsuarioCreacion = new String[] {""} ;
      T00103_A309Tpal_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00103_A310Tpal_UsuarioModifica = new String[] {""} ;
      T00103_A311Tpal_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00103_A307Tpal_Descripcion = new String[] {""} ;
      T00103_A677Tpal_Estado = new String[] {""} ;
      T00103_n677Tpal_Estado = new boolean[] {false} ;
      T00106_A29Tpal_Id = new long[1] ;
      T00107_A29Tpal_Id = new long[1] ;
      T00102_A29Tpal_Id = new long[1] ;
      T00102_A308Tpal_UsuarioCreacion = new String[] {""} ;
      T00102_A309Tpal_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00102_A310Tpal_UsuarioModifica = new String[] {""} ;
      T00102_A311Tpal_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00102_A307Tpal_Descripcion = new String[] {""} ;
      T00102_A677Tpal_Estado = new String[] {""} ;
      T00102_n677Tpal_Estado = new boolean[] {false} ;
      T00109_A29Tpal_Id = new long[1] ;
      T001012_A38Tpmo_Codigo = new String[] {""} ;
      T001013_A38Tpmo_Codigo = new String[] {""} ;
      T001014_A1Cent_Id = new long[1] ;
      T001014_A27Alma_Modulo = new String[] {""} ;
      T001014_A28Alma_Codigo = new String[] {""} ;
      T001015_A29Tpal_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_almacen__default(),
         new Object[] {
             new Object[] {
            T00102_A29Tpal_Id, T00102_A308Tpal_UsuarioCreacion, T00102_A309Tpal_FechaCreacion, T00102_A310Tpal_UsuarioModifica, T00102_A311Tpal_FechaModifica, T00102_A307Tpal_Descripcion, T00102_A677Tpal_Estado, T00102_n677Tpal_Estado
            }
            , new Object[] {
            T00103_A29Tpal_Id, T00103_A308Tpal_UsuarioCreacion, T00103_A309Tpal_FechaCreacion, T00103_A310Tpal_UsuarioModifica, T00103_A311Tpal_FechaModifica, T00103_A307Tpal_Descripcion, T00103_A677Tpal_Estado, T00103_n677Tpal_Estado
            }
            , new Object[] {
            T00104_A29Tpal_Id, T00104_A308Tpal_UsuarioCreacion, T00104_A309Tpal_FechaCreacion, T00104_A310Tpal_UsuarioModifica, T00104_A311Tpal_FechaModifica, T00104_A307Tpal_Descripcion, T00104_A677Tpal_Estado, T00104_n677Tpal_Estado
            }
            , new Object[] {
            T00105_A29Tpal_Id
            }
            , new Object[] {
            T00106_A29Tpal_Id
            }
            , new Object[] {
            T00107_A29Tpal_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T00109_A29Tpal_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001012_A38Tpmo_Codigo
            }
            , new Object[] {
            T001013_A38Tpmo_Codigo
            }
            , new Object[] {
            T001014_A1Cent_Id, T001014_A27Alma_Modulo, T001014_A28Alma_Codigo
            }
            , new Object[] {
            T001015_A29Tpal_Id
            }
         }
      );
      AV13Pgmname = "ALM_TIPO_ALMACEN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound37 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTpal_Id_Enabled ;
   private int edtTpal_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV11Tpal_Id ;
   private long Z29Tpal_Id ;
   private long AV11Tpal_Id ;
   private long A29Tpal_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z677Tpal_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A677Tpal_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTpal_Descripcion_Internalname ;
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
   private String edtTpal_Id_Internalname ;
   private String edtTpal_Id_Jsonclick ;
   private String edtTpal_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode37 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z309Tpal_FechaCreacion ;
   private java.util.Date Z311Tpal_FechaModifica ;
   private java.util.Date A309Tpal_FechaCreacion ;
   private java.util.Date A311Tpal_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n677Tpal_Estado ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z308Tpal_UsuarioCreacion ;
   private String Z310Tpal_UsuarioModifica ;
   private String Z307Tpal_Descripcion ;
   private String A307Tpal_Descripcion ;
   private String A308Tpal_UsuarioCreacion ;
   private String A310Tpal_UsuarioModifica ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private HTMLChoice cmbTpal_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] T00104_A29Tpal_Id ;
   private String[] T00104_A308Tpal_UsuarioCreacion ;
   private java.util.Date[] T00104_A309Tpal_FechaCreacion ;
   private String[] T00104_A310Tpal_UsuarioModifica ;
   private java.util.Date[] T00104_A311Tpal_FechaModifica ;
   private String[] T00104_A307Tpal_Descripcion ;
   private String[] T00104_A677Tpal_Estado ;
   private boolean[] T00104_n677Tpal_Estado ;
   private long[] T00105_A29Tpal_Id ;
   private long[] T00103_A29Tpal_Id ;
   private String[] T00103_A308Tpal_UsuarioCreacion ;
   private java.util.Date[] T00103_A309Tpal_FechaCreacion ;
   private String[] T00103_A310Tpal_UsuarioModifica ;
   private java.util.Date[] T00103_A311Tpal_FechaModifica ;
   private String[] T00103_A307Tpal_Descripcion ;
   private String[] T00103_A677Tpal_Estado ;
   private boolean[] T00103_n677Tpal_Estado ;
   private long[] T00106_A29Tpal_Id ;
   private long[] T00107_A29Tpal_Id ;
   private long[] T00102_A29Tpal_Id ;
   private String[] T00102_A308Tpal_UsuarioCreacion ;
   private java.util.Date[] T00102_A309Tpal_FechaCreacion ;
   private String[] T00102_A310Tpal_UsuarioModifica ;
   private java.util.Date[] T00102_A311Tpal_FechaModifica ;
   private String[] T00102_A307Tpal_Descripcion ;
   private String[] T00102_A677Tpal_Estado ;
   private boolean[] T00102_n677Tpal_Estado ;
   private long[] T00109_A29Tpal_Id ;
   private String[] T001012_A38Tpmo_Codigo ;
   private String[] T001013_A38Tpmo_Codigo ;
   private long[] T001014_A1Cent_Id ;
   private String[] T001014_A27Alma_Modulo ;
   private String[] T001014_A28Alma_Codigo ;
   private long[] T001015_A29Tpal_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
}

final  class alm_tipo_almacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00102", "SELECT Tpal_Id, Tpal_UsuarioCreacion, Tpal_FechaCreacion, Tpal_UsuarioModifica, Tpal_FechaModifica, Tpal_Descripcion, Tpal_Estado FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ?  FOR UPDATE OF Tpal_UsuarioCreacion, Tpal_FechaCreacion, Tpal_UsuarioModifica, Tpal_FechaModifica, Tpal_Descripcion, Tpal_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00103", "SELECT Tpal_Id, Tpal_UsuarioCreacion, Tpal_FechaCreacion, Tpal_UsuarioModifica, Tpal_FechaModifica, Tpal_Descripcion, Tpal_Estado FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00104", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tpal_Id, TM1.Tpal_UsuarioCreacion, TM1.Tpal_FechaCreacion, TM1.Tpal_UsuarioModifica, TM1.Tpal_FechaModifica, TM1.Tpal_Descripcion, TM1.Tpal_Estado FROM ALM_TIPO_ALMACEN TM1 WHERE TM1.Tpal_Id = ? ORDER BY TM1.Tpal_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00105", "SELECT /*+ FIRST_ROWS(1) */ Tpal_Id FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00106", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpal_Id FROM ALM_TIPO_ALMACEN WHERE ( Tpal_Id > ?) ORDER BY Tpal_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00107", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpal_Id FROM ALM_TIPO_ALMACEN WHERE ( Tpal_Id < ?) ORDER BY Tpal_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00108", "INSERT INTO ALM_TIPO_ALMACEN(Tpal_UsuarioCreacion, Tpal_FechaCreacion, Tpal_UsuarioModifica, Tpal_FechaModifica, Tpal_Descripcion, Tpal_Estado) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_ALMACEN")
         ,new ForEachCursor("T00109", "SELECT Tpal_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001010", "UPDATE ALM_TIPO_ALMACEN SET Tpal_UsuarioCreacion=?, Tpal_FechaCreacion=?, Tpal_UsuarioModifica=?, Tpal_FechaModifica=?, Tpal_Descripcion=?, Tpal_Estado=?  WHERE Tpal_Id = ?", GX_NOMASK, "ALM_TIPO_ALMACEN")
         ,new UpdateCursor("T001011", "DELETE FROM ALM_TIPO_ALMACEN  WHERE Tpal_Id = ?", GX_NOMASK, "ALM_TIPO_ALMACEN")
         ,new ForEachCursor("T001012", "SELECT * FROM (SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_AlmacenDestinoId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001013", "SELECT * FROM (SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_AlmacenOrigenId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001014", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE Tpal_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001015", "SELECT /*+ FIRST_ROWS(100) */ Tpal_Id FROM ALM_TIPO_ALMACEN ORDER BY Tpal_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 13 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               stmt.setLong(7, ((Number) parms[7]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

