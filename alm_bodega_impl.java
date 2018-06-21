/*
               File: alm_bodega_impl
        Description: Bodega
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:21.0
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

public final  class alm_bodega_impl extends GXDataArea
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
            AV21Bode_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Bode_Codigo", AV21Bode_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Bode_Codigo, ""))));
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
      cmbBode_Estado.setName( "BODE_ESTADO" );
      cmbBode_Estado.setWebtags( "" );
      cmbBode_Estado.addItem("A", "Activo", (short)(0));
      cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbBode_Estado.getItemCount() > 0 )
      {
         A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
         n674Bode_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
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
         Form.getMeta().addItem("description", "Bodega", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtBode_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_bodega_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_bodega_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_bodega_impl.class ));
   }

   public alm_bodega_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBode_Estado = new HTMLChoice();
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
      if ( cmbBode_Estado.getItemCount() > 0 )
      {
         A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
         n674Bode_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Bodega", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_BODEGA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_BODEGA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Codigo_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Codigo_Internalname, A31Bode_Codigo, GXutil.rtrim( localUtil.format( A31Bode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtBode_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_BODEGA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Descripcion_Internalname, "Nombre Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Descripcion_Internalname, A251Bode_Descripcion, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtBode_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_BODEGA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbBode_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBode_Estado, cmbBode_Estado.getInternalname(), GXutil.rtrim( A674Bode_Estado), 1, cmbBode_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbBode_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_BODEGA.htm");
         cmbBode_Estado.setValue( GXutil.rtrim( A674Bode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBode_Estado.getInternalname(), "Values", cmbBode_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_BODEGA.htm");
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
      e110T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            A251Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtBode_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A251Bode_Descripcion", A251Bode_Descripcion);
            cmbBode_Estado.setValue( httpContext.cgiGet( cmbBode_Estado.getInternalname()) );
            A674Bode_Estado = httpContext.cgiGet( cmbBode_Estado.getInternalname()) ;
            n674Bode_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
            n674Bode_Estado = ((GXutil.strcmp("", A674Bode_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z31Bode_Codigo = httpContext.cgiGet( "Z31Bode_Codigo") ;
            Z287Bode_UsuarioCrea = httpContext.cgiGet( "Z287Bode_UsuarioCrea") ;
            n287Bode_UsuarioCrea = ((GXutil.strcmp("", A287Bode_UsuarioCrea)==0) ? true : false) ;
            Z288Bode_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z288Bode_FechaCrea"), 0) ;
            n288Bode_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A288Bode_FechaCrea) ? true : false) ;
            Z289Bode_UsuarioModifica = httpContext.cgiGet( "Z289Bode_UsuarioModifica") ;
            n289Bode_UsuarioModifica = ((GXutil.strcmp("", A289Bode_UsuarioModifica)==0) ? true : false) ;
            Z290Bode_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z290Bode_FechaModifica"), 0) ;
            n290Bode_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A290Bode_FechaModifica) ? true : false) ;
            Z251Bode_Descripcion = httpContext.cgiGet( "Z251Bode_Descripcion") ;
            Z674Bode_Estado = httpContext.cgiGet( "Z674Bode_Estado") ;
            n674Bode_Estado = ((GXutil.strcmp("", A674Bode_Estado)==0) ? true : false) ;
            A287Bode_UsuarioCrea = httpContext.cgiGet( "Z287Bode_UsuarioCrea") ;
            n287Bode_UsuarioCrea = false ;
            n287Bode_UsuarioCrea = ((GXutil.strcmp("", A287Bode_UsuarioCrea)==0) ? true : false) ;
            A288Bode_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z288Bode_FechaCrea"), 0) ;
            n288Bode_FechaCrea = false ;
            n288Bode_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A288Bode_FechaCrea) ? true : false) ;
            A289Bode_UsuarioModifica = httpContext.cgiGet( "Z289Bode_UsuarioModifica") ;
            n289Bode_UsuarioModifica = false ;
            n289Bode_UsuarioModifica = ((GXutil.strcmp("", A289Bode_UsuarioModifica)==0) ? true : false) ;
            A290Bode_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z290Bode_FechaModifica"), 0) ;
            n290Bode_FechaModifica = false ;
            n290Bode_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A290Bode_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV21Bode_Codigo = httpContext.cgiGet( "vBODE_CODIGO") ;
            AV25Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A287Bode_UsuarioCrea = httpContext.cgiGet( "BODE_USUARIOCREA") ;
            n287Bode_UsuarioCrea = ((GXutil.strcmp("", A287Bode_UsuarioCrea)==0) ? true : false) ;
            A288Bode_FechaCrea = localUtil.ctot( httpContext.cgiGet( "BODE_FECHACREA"), 0) ;
            n288Bode_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A288Bode_FechaCrea) ? true : false) ;
            A289Bode_UsuarioModifica = httpContext.cgiGet( "BODE_USUARIOMODIFICA") ;
            n289Bode_UsuarioModifica = ((GXutil.strcmp("", A289Bode_UsuarioModifica)==0) ? true : false) ;
            A290Bode_FechaModifica = localUtil.ctot( httpContext.cgiGet( "BODE_FECHAMODIFICA"), 0) ;
            n290Bode_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A290Bode_FechaModifica) ? true : false) ;
            AV29Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_BODEGA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_bodega:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A31Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
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
                  sMode29 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode29 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound29 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0T0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BODE_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBode_Codigo_Internalname ;
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
                        e110T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120T2 ();
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
         e120T2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0T29( ) ;
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
         disableAttributes0T29( ) ;
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

   public void confirm_0T0( )
   {
      beforeValidate0T29( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0T29( ) ;
         }
         else
         {
            checkExtendedTable0T29( ) ;
            closeExtendedTableCursors0T29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0T0( )
   {
   }

   public void e110T2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV29Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV29Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV25Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Usuario", AV25Usuario);
   }

   public void e120T2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_bodega") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0T29( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z287Bode_UsuarioCrea = T000T3_A287Bode_UsuarioCrea[0] ;
            Z288Bode_FechaCrea = T000T3_A288Bode_FechaCrea[0] ;
            Z289Bode_UsuarioModifica = T000T3_A289Bode_UsuarioModifica[0] ;
            Z290Bode_FechaModifica = T000T3_A290Bode_FechaModifica[0] ;
            Z251Bode_Descripcion = T000T3_A251Bode_Descripcion[0] ;
            Z674Bode_Estado = T000T3_A674Bode_Estado[0] ;
         }
         else
         {
            Z287Bode_UsuarioCrea = A287Bode_UsuarioCrea ;
            Z288Bode_FechaCrea = A288Bode_FechaCrea ;
            Z289Bode_UsuarioModifica = A289Bode_UsuarioModifica ;
            Z290Bode_FechaModifica = A290Bode_FechaModifica ;
            Z251Bode_Descripcion = A251Bode_Descripcion ;
            Z674Bode_Estado = A674Bode_Estado ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z31Bode_Codigo = A31Bode_Codigo ;
         Z287Bode_UsuarioCrea = A287Bode_UsuarioCrea ;
         Z288Bode_FechaCrea = A288Bode_FechaCrea ;
         Z289Bode_UsuarioModifica = A289Bode_UsuarioModifica ;
         Z290Bode_FechaModifica = A290Bode_FechaModifica ;
         Z251Bode_Descripcion = A251Bode_Descripcion ;
         Z674Bode_Estado = A674Bode_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV21Bode_Codigo)==0) )
      {
         A31Bode_Codigo = AV21Bode_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV21Bode_Codigo)==0) )
      {
         edtBode_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtBode_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV21Bode_Codigo)==0) )
      {
         edtBode_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
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
         AV29Pgmname = "ALM_BODEGA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      }
   }

   public void load0T29( )
   {
      /* Using cursor T000T4 */
      pr_default.execute(2, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A287Bode_UsuarioCrea = T000T4_A287Bode_UsuarioCrea[0] ;
         n287Bode_UsuarioCrea = T000T4_n287Bode_UsuarioCrea[0] ;
         A288Bode_FechaCrea = T000T4_A288Bode_FechaCrea[0] ;
         n288Bode_FechaCrea = T000T4_n288Bode_FechaCrea[0] ;
         A289Bode_UsuarioModifica = T000T4_A289Bode_UsuarioModifica[0] ;
         n289Bode_UsuarioModifica = T000T4_n289Bode_UsuarioModifica[0] ;
         A290Bode_FechaModifica = T000T4_A290Bode_FechaModifica[0] ;
         n290Bode_FechaModifica = T000T4_n290Bode_FechaModifica[0] ;
         A251Bode_Descripcion = T000T4_A251Bode_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251Bode_Descripcion", A251Bode_Descripcion);
         A674Bode_Estado = T000T4_A674Bode_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
         n674Bode_Estado = T000T4_n674Bode_Estado[0] ;
         zm0T29( -8) ;
      }
      pr_default.close(2);
      onLoadActions0T29( ) ;
   }

   public void onLoadActions0T29( )
   {
      AV29Pgmname = "ALM_BODEGA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
   }

   public void checkExtendedTable0T29( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV29Pgmname = "ALM_BODEGA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
   }

   public void closeExtendedTableCursors0T29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0T29( )
   {
      /* Using cursor T000T5 */
      pr_default.execute(3, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000T3 */
      pr_default.execute(1, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0T29( 8) ;
         RcdFound29 = (short)(1) ;
         A31Bode_Codigo = T000T3_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         A287Bode_UsuarioCrea = T000T3_A287Bode_UsuarioCrea[0] ;
         n287Bode_UsuarioCrea = T000T3_n287Bode_UsuarioCrea[0] ;
         A288Bode_FechaCrea = T000T3_A288Bode_FechaCrea[0] ;
         n288Bode_FechaCrea = T000T3_n288Bode_FechaCrea[0] ;
         A289Bode_UsuarioModifica = T000T3_A289Bode_UsuarioModifica[0] ;
         n289Bode_UsuarioModifica = T000T3_n289Bode_UsuarioModifica[0] ;
         A290Bode_FechaModifica = T000T3_A290Bode_FechaModifica[0] ;
         n290Bode_FechaModifica = T000T3_n290Bode_FechaModifica[0] ;
         A251Bode_Descripcion = T000T3_A251Bode_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251Bode_Descripcion", A251Bode_Descripcion);
         A674Bode_Estado = T000T3_A674Bode_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
         n674Bode_Estado = T000T3_n674Bode_Estado[0] ;
         Z31Bode_Codigo = A31Bode_Codigo ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0T29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey0T29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey0T29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0T29( ) ;
      if ( RcdFound29 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T000T6 */
      pr_default.execute(4, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000T6_A31Bode_Codigo[0], A31Bode_Codigo) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000T6_A31Bode_Codigo[0], A31Bode_Codigo) > 0 ) ) )
         {
            A31Bode_Codigo = T000T6_A31Bode_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T000T7 */
      pr_default.execute(5, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000T7_A31Bode_Codigo[0], A31Bode_Codigo) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000T7_A31Bode_Codigo[0], A31Bode_Codigo) < 0 ) ) )
         {
            A31Bode_Codigo = T000T7_A31Bode_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0T29( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0T29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 )
            {
               A31Bode_Codigo = Z31Bode_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BODE_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBode_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBode_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0T29( ) ;
               GX_FocusControl = edtBode_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtBode_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0T29( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BODE_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBode_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtBode_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0T29( ) ;
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
      if ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 )
      {
         A31Bode_Codigo = Z31Bode_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BODE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0T29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000T2 */
         pr_default.execute(0, new Object[] {A31Bode_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_BODEGA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z287Bode_UsuarioCrea, T000T2_A287Bode_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z288Bode_FechaCrea, T000T2_A288Bode_FechaCrea[0]) ) || ( GXutil.strcmp(Z289Bode_UsuarioModifica, T000T2_A289Bode_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z290Bode_FechaModifica, T000T2_A290Bode_FechaModifica[0]) ) || ( GXutil.strcmp(Z251Bode_Descripcion, T000T2_A251Bode_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z674Bode_Estado, T000T2_A674Bode_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_BODEGA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0T29( )
   {
      beforeValidate0T29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0T29( 0) ;
         checkOptimisticConcurrency0T29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0T29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T8 */
                  pr_default.execute(6, new Object[] {A31Bode_Codigo, new Boolean(n287Bode_UsuarioCrea), A287Bode_UsuarioCrea, new Boolean(n288Bode_FechaCrea), A288Bode_FechaCrea, new Boolean(n289Bode_UsuarioModifica), A289Bode_UsuarioModifica, new Boolean(n290Bode_FechaModifica), A290Bode_FechaModifica, A251Bode_Descripcion, new Boolean(n674Bode_Estado), A674Bode_Estado});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_BODEGA") ;
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
                        resetCaption0T0( ) ;
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
            load0T29( ) ;
         }
         endLevel0T29( ) ;
      }
      closeExtendedTableCursors0T29( ) ;
   }

   public void update0T29( )
   {
      beforeValidate0T29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0T29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T9 */
                  pr_default.execute(7, new Object[] {new Boolean(n287Bode_UsuarioCrea), A287Bode_UsuarioCrea, new Boolean(n288Bode_FechaCrea), A288Bode_FechaCrea, new Boolean(n289Bode_UsuarioModifica), A289Bode_UsuarioModifica, new Boolean(n290Bode_FechaModifica), A290Bode_FechaModifica, A251Bode_Descripcion, new Boolean(n674Bode_Estado), A674Bode_Estado, A31Bode_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_BODEGA") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_BODEGA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0T29( ) ;
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
         endLevel0T29( ) ;
      }
      closeExtendedTableCursors0T29( ) ;
   }

   public void deferredUpdate0T29( )
   {
   }

   public void delete( )
   {
      beforeValidate0T29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0T29( ) ;
         afterConfirm0T29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0T29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000T10 */
               pr_default.execute(8, new Object[] {A31Bode_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_BODEGA") ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0T29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0T29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV29Pgmname = "ALM_BODEGA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000T11 */
         pr_default.execute(9, new Object[] {A31Bode_Codigo});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALM_RESTRICCIONES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000T12 */
         pr_default.execute(10, new Object[] {A31Bode_Codigo});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALM_RESTRICCIONES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000T13 */
         pr_default.execute(11, new Object[] {A31Bode_Codigo});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACEN INVENTARIO CONSUMO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000T14 */
         pr_default.execute(12, new Object[] {A31Bode_Codigo});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"BODEGAS DEL ALMACEN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel0T29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0T29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_bodega");
         if ( AnyError == 0 )
         {
            confirmValues0T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_bodega");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0T29( )
   {
      /* Scan By routine */
      /* Using cursor T000T15 */
      pr_default.execute(13);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A31Bode_Codigo = T000T15_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0T29( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A31Bode_Codigo = T000T15_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      }
   }

   public void scanEnd0T29( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0T29( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A288Bode_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n288Bode_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A288Bode_FechaCrea", localUtil.ttoc( A288Bode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A290Bode_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n290Bode_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A290Bode_FechaModifica", localUtil.ttoc( A290Bode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A287Bode_UsuarioCrea = AV25Usuario ;
         n287Bode_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A287Bode_UsuarioCrea", A287Bode_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A289Bode_UsuarioModifica = AV25Usuario ;
         n289Bode_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A289Bode_UsuarioModifica", A289Bode_UsuarioModifica);
      }
   }

   public void beforeInsert0T29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0T29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0T29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0T29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0T29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0T29( )
   {
      edtBode_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      edtBode_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBode_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Descripcion_Enabled, 5, 0)), true);
      cmbBode_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBode_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbBode_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0T0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414162181");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_bodega") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV21Bode_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z31Bode_Codigo", Z31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z287Bode_UsuarioCrea", Z287Bode_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z288Bode_FechaCrea", localUtil.ttoc( Z288Bode_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z289Bode_UsuarioModifica", Z289Bode_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z290Bode_FechaModifica", localUtil.ttoc( Z290Bode_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z251Bode_Descripcion", Z251Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z674Bode_Estado", GXutil.rtrim( Z674Bode_Estado));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV21Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV25Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_USUARIOCREA", A287Bode_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_FECHACREA", localUtil.ttoc( A288Bode_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_USUARIOMODIFICA", A289Bode_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_FECHAMODIFICA", localUtil.ttoc( A290Bode_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV29Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Bode_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_BODEGA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_bodega:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_bodega") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV21Bode_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_BODEGA" ;
   }

   public String getPgmdesc( )
   {
      return "Bodega" ;
   }

   public void initializeNonKey0T29( )
   {
      A287Bode_UsuarioCrea = "" ;
      n287Bode_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A287Bode_UsuarioCrea", A287Bode_UsuarioCrea);
      A288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n288Bode_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A288Bode_FechaCrea", localUtil.ttoc( A288Bode_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A289Bode_UsuarioModifica = "" ;
      n289Bode_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289Bode_UsuarioModifica", A289Bode_UsuarioModifica);
      A290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n290Bode_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A290Bode_FechaModifica", localUtil.ttoc( A290Bode_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A251Bode_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A251Bode_Descripcion", A251Bode_Descripcion);
      A674Bode_Estado = "" ;
      n674Bode_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A674Bode_Estado", A674Bode_Estado);
      n674Bode_Estado = ((GXutil.strcmp("", A674Bode_Estado)==0) ? true : false) ;
      Z287Bode_UsuarioCrea = "" ;
      Z288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z289Bode_UsuarioModifica = "" ;
      Z290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z251Bode_Descripcion = "" ;
      Z674Bode_Estado = "" ;
   }

   public void initAll0T29( )
   {
      A31Bode_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      initializeNonKey0T29( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414162189");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_bodega.js", "?201861414162189");
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
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION" ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO" );
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
      Form.setCaption( "Bodega" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbBode_Estado.setJsonclick( "" );
      cmbBode_Estado.setEnabled( 1 );
      edtBode_Descripcion_Jsonclick = "" ;
      edtBode_Descripcion_Enabled = 1 ;
      edtBode_Codigo_Jsonclick = "" ;
      edtBode_Codigo_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV21Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120T2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      wcpOAV21Bode_Codigo = "" ;
      Z31Bode_Codigo = "" ;
      Z287Bode_UsuarioCrea = "" ;
      Z288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z289Bode_UsuarioModifica = "" ;
      Z290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z251Bode_Descripcion = "" ;
      Z674Bode_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV21Bode_Codigo = "" ;
      GXKey = "" ;
      A674Bode_Estado = "" ;
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
      A31Bode_Codigo = "" ;
      A251Bode_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A287Bode_UsuarioCrea = "" ;
      A288Bode_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A289Bode_UsuarioModifica = "" ;
      A290Bode_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV25Usuario = "" ;
      AV29Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode29 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T000T4_A31Bode_Codigo = new String[] {""} ;
      T000T4_A287Bode_UsuarioCrea = new String[] {""} ;
      T000T4_n287Bode_UsuarioCrea = new boolean[] {false} ;
      T000T4_A288Bode_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000T4_n288Bode_FechaCrea = new boolean[] {false} ;
      T000T4_A289Bode_UsuarioModifica = new String[] {""} ;
      T000T4_n289Bode_UsuarioModifica = new boolean[] {false} ;
      T000T4_A290Bode_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000T4_n290Bode_FechaModifica = new boolean[] {false} ;
      T000T4_A251Bode_Descripcion = new String[] {""} ;
      T000T4_A674Bode_Estado = new String[] {""} ;
      T000T4_n674Bode_Estado = new boolean[] {false} ;
      T000T5_A31Bode_Codigo = new String[] {""} ;
      T000T3_A31Bode_Codigo = new String[] {""} ;
      T000T3_A287Bode_UsuarioCrea = new String[] {""} ;
      T000T3_n287Bode_UsuarioCrea = new boolean[] {false} ;
      T000T3_A288Bode_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000T3_n288Bode_FechaCrea = new boolean[] {false} ;
      T000T3_A289Bode_UsuarioModifica = new String[] {""} ;
      T000T3_n289Bode_UsuarioModifica = new boolean[] {false} ;
      T000T3_A290Bode_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000T3_n290Bode_FechaModifica = new boolean[] {false} ;
      T000T3_A251Bode_Descripcion = new String[] {""} ;
      T000T3_A674Bode_Estado = new String[] {""} ;
      T000T3_n674Bode_Estado = new boolean[] {false} ;
      T000T6_A31Bode_Codigo = new String[] {""} ;
      T000T7_A31Bode_Codigo = new String[] {""} ;
      T000T2_A31Bode_Codigo = new String[] {""} ;
      T000T2_A287Bode_UsuarioCrea = new String[] {""} ;
      T000T2_n287Bode_UsuarioCrea = new boolean[] {false} ;
      T000T2_A288Bode_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000T2_n288Bode_FechaCrea = new boolean[] {false} ;
      T000T2_A289Bode_UsuarioModifica = new String[] {""} ;
      T000T2_n289Bode_UsuarioModifica = new boolean[] {false} ;
      T000T2_A290Bode_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000T2_n290Bode_FechaModifica = new boolean[] {false} ;
      T000T2_A251Bode_Descripcion = new String[] {""} ;
      T000T2_A674Bode_Estado = new String[] {""} ;
      T000T2_n674Bode_Estado = new boolean[] {false} ;
      T000T11_A60Mbod_Id = new long[1] ;
      T000T12_A60Mbod_Id = new long[1] ;
      T000T13_A91Regional = new long[1] ;
      T000T13_A92Centro_Id = new long[1] ;
      T000T13_A27Alma_Modulo = new String[] {""} ;
      T000T13_A28Alma_Codigo = new String[] {""} ;
      T000T13_A31Bode_Codigo = new String[] {""} ;
      T000T13_A93Trans_Id = new long[1] ;
      T000T13_A66Elem_Consecutivo = new String[] {""} ;
      T000T13_A94Num_Linea = new int[1] ;
      T000T14_A1Cent_Id = new long[1] ;
      T000T14_A27Alma_Modulo = new String[] {""} ;
      T000T14_A28Alma_Codigo = new String[] {""} ;
      T000T14_A31Bode_Codigo = new String[] {""} ;
      T000T15_A31Bode_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_bodega__default(),
         new Object[] {
             new Object[] {
            T000T2_A31Bode_Codigo, T000T2_A287Bode_UsuarioCrea, T000T2_n287Bode_UsuarioCrea, T000T2_A288Bode_FechaCrea, T000T2_n288Bode_FechaCrea, T000T2_A289Bode_UsuarioModifica, T000T2_n289Bode_UsuarioModifica, T000T2_A290Bode_FechaModifica, T000T2_n290Bode_FechaModifica, T000T2_A251Bode_Descripcion,
            T000T2_A674Bode_Estado, T000T2_n674Bode_Estado
            }
            , new Object[] {
            T000T3_A31Bode_Codigo, T000T3_A287Bode_UsuarioCrea, T000T3_n287Bode_UsuarioCrea, T000T3_A288Bode_FechaCrea, T000T3_n288Bode_FechaCrea, T000T3_A289Bode_UsuarioModifica, T000T3_n289Bode_UsuarioModifica, T000T3_A290Bode_FechaModifica, T000T3_n290Bode_FechaModifica, T000T3_A251Bode_Descripcion,
            T000T3_A674Bode_Estado, T000T3_n674Bode_Estado
            }
            , new Object[] {
            T000T4_A31Bode_Codigo, T000T4_A287Bode_UsuarioCrea, T000T4_n287Bode_UsuarioCrea, T000T4_A288Bode_FechaCrea, T000T4_n288Bode_FechaCrea, T000T4_A289Bode_UsuarioModifica, T000T4_n289Bode_UsuarioModifica, T000T4_A290Bode_FechaModifica, T000T4_n290Bode_FechaModifica, T000T4_A251Bode_Descripcion,
            T000T4_A674Bode_Estado, T000T4_n674Bode_Estado
            }
            , new Object[] {
            T000T5_A31Bode_Codigo
            }
            , new Object[] {
            T000T6_A31Bode_Codigo
            }
            , new Object[] {
            T000T7_A31Bode_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000T11_A60Mbod_Id
            }
            , new Object[] {
            T000T12_A60Mbod_Id
            }
            , new Object[] {
            T000T13_A91Regional, T000T13_A92Centro_Id, T000T13_A27Alma_Modulo, T000T13_A28Alma_Codigo, T000T13_A31Bode_Codigo, T000T13_A93Trans_Id, T000T13_A66Elem_Consecutivo, T000T13_A94Num_Linea
            }
            , new Object[] {
            T000T14_A1Cent_Id, T000T14_A27Alma_Modulo, T000T14_A28Alma_Codigo, T000T14_A31Bode_Codigo
            }
            , new Object[] {
            T000T15_A31Bode_Codigo
            }
         }
      );
      AV29Pgmname = "ALM_BODEGA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound29 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtBode_Codigo_Enabled ;
   private int edtBode_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z674Bode_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A674Bode_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBode_Codigo_Internalname ;
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
   private String edtBode_Codigo_Jsonclick ;
   private String edtBode_Descripcion_Internalname ;
   private String edtBode_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV29Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z288Bode_FechaCrea ;
   private java.util.Date Z290Bode_FechaModifica ;
   private java.util.Date A288Bode_FechaCrea ;
   private java.util.Date A290Bode_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n674Bode_Estado ;
   private boolean wbErr ;
   private boolean n287Bode_UsuarioCrea ;
   private boolean n288Bode_FechaCrea ;
   private boolean n289Bode_UsuarioModifica ;
   private boolean n290Bode_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV21Bode_Codigo ;
   private String Z31Bode_Codigo ;
   private String Z287Bode_UsuarioCrea ;
   private String Z289Bode_UsuarioModifica ;
   private String Z251Bode_Descripcion ;
   private String AV21Bode_Codigo ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String A287Bode_UsuarioCrea ;
   private String A289Bode_UsuarioModifica ;
   private String AV25Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbBode_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T000T4_A31Bode_Codigo ;
   private String[] T000T4_A287Bode_UsuarioCrea ;
   private boolean[] T000T4_n287Bode_UsuarioCrea ;
   private java.util.Date[] T000T4_A288Bode_FechaCrea ;
   private boolean[] T000T4_n288Bode_FechaCrea ;
   private String[] T000T4_A289Bode_UsuarioModifica ;
   private boolean[] T000T4_n289Bode_UsuarioModifica ;
   private java.util.Date[] T000T4_A290Bode_FechaModifica ;
   private boolean[] T000T4_n290Bode_FechaModifica ;
   private String[] T000T4_A251Bode_Descripcion ;
   private String[] T000T4_A674Bode_Estado ;
   private boolean[] T000T4_n674Bode_Estado ;
   private String[] T000T5_A31Bode_Codigo ;
   private String[] T000T3_A31Bode_Codigo ;
   private String[] T000T3_A287Bode_UsuarioCrea ;
   private boolean[] T000T3_n287Bode_UsuarioCrea ;
   private java.util.Date[] T000T3_A288Bode_FechaCrea ;
   private boolean[] T000T3_n288Bode_FechaCrea ;
   private String[] T000T3_A289Bode_UsuarioModifica ;
   private boolean[] T000T3_n289Bode_UsuarioModifica ;
   private java.util.Date[] T000T3_A290Bode_FechaModifica ;
   private boolean[] T000T3_n290Bode_FechaModifica ;
   private String[] T000T3_A251Bode_Descripcion ;
   private String[] T000T3_A674Bode_Estado ;
   private boolean[] T000T3_n674Bode_Estado ;
   private String[] T000T6_A31Bode_Codigo ;
   private String[] T000T7_A31Bode_Codigo ;
   private String[] T000T2_A31Bode_Codigo ;
   private String[] T000T2_A287Bode_UsuarioCrea ;
   private boolean[] T000T2_n287Bode_UsuarioCrea ;
   private java.util.Date[] T000T2_A288Bode_FechaCrea ;
   private boolean[] T000T2_n288Bode_FechaCrea ;
   private String[] T000T2_A289Bode_UsuarioModifica ;
   private boolean[] T000T2_n289Bode_UsuarioModifica ;
   private java.util.Date[] T000T2_A290Bode_FechaModifica ;
   private boolean[] T000T2_n290Bode_FechaModifica ;
   private String[] T000T2_A251Bode_Descripcion ;
   private String[] T000T2_A674Bode_Estado ;
   private boolean[] T000T2_n674Bode_Estado ;
   private long[] T000T11_A60Mbod_Id ;
   private long[] T000T12_A60Mbod_Id ;
   private long[] T000T13_A91Regional ;
   private long[] T000T13_A92Centro_Id ;
   private String[] T000T13_A27Alma_Modulo ;
   private String[] T000T13_A28Alma_Codigo ;
   private String[] T000T13_A31Bode_Codigo ;
   private long[] T000T13_A93Trans_Id ;
   private String[] T000T13_A66Elem_Consecutivo ;
   private int[] T000T13_A94Num_Linea ;
   private long[] T000T14_A1Cent_Id ;
   private String[] T000T14_A27Alma_Modulo ;
   private String[] T000T14_A28Alma_Codigo ;
   private String[] T000T14_A31Bode_Codigo ;
   private String[] T000T15_A31Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_bodega__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000T2", "SELECT Bode_Codigo, Bode_UsuarioCrea, Bode_FechaCrea, Bode_UsuarioModifica, Bode_FechaModifica, Bode_Descripcion, Bode_Estado FROM ALM_BODEGA WHERE Bode_Codigo = ?  FOR UPDATE OF Bode_UsuarioCrea, Bode_FechaCrea, Bode_UsuarioModifica, Bode_FechaModifica, Bode_Descripcion, Bode_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T3", "SELECT Bode_Codigo, Bode_UsuarioCrea, Bode_FechaCrea, Bode_UsuarioModifica, Bode_FechaModifica, Bode_Descripcion, Bode_Estado FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Bode_Codigo, TM1.Bode_UsuarioCrea, TM1.Bode_FechaCrea, TM1.Bode_UsuarioModifica, TM1.Bode_FechaModifica, TM1.Bode_Descripcion, TM1.Bode_Estado FROM ALM_BODEGA TM1 WHERE TM1.Bode_Codigo = ? ORDER BY TM1.Bode_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000T5", "SELECT /*+ FIRST_ROWS(1) */ Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Bode_Codigo FROM ALM_BODEGA WHERE ( Bode_Codigo > ?) ORDER BY Bode_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Bode_Codigo FROM ALM_BODEGA WHERE ( Bode_Codigo < ?) ORDER BY Bode_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000T8", "INSERT INTO ALM_BODEGA(Bode_Codigo, Bode_UsuarioCrea, Bode_FechaCrea, Bode_UsuarioModifica, Bode_FechaModifica, Bode_Descripcion, Bode_Estado) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_BODEGA")
         ,new UpdateCursor("T000T9", "UPDATE ALM_BODEGA SET Bode_UsuarioCrea=?, Bode_FechaCrea=?, Bode_UsuarioModifica=?, Bode_FechaModifica=?, Bode_Descripcion=?, Bode_Estado=?  WHERE Bode_Codigo = ?", GX_NOMASK, "ALM_BODEGA")
         ,new UpdateCursor("T000T10", "DELETE FROM ALM_BODEGA  WHERE Bode_Codigo = ?", GX_NOMASK, "ALM_BODEGA")
         ,new ForEachCursor("T000T11", "SELECT * FROM (SELECT Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_BodDestinoCodigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T12", "SELECT * FROM (SELECT Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_BodOrigenCodigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T13", "SELECT * FROM (SELECT Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE Bode_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T14", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE Bode_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T15", "SELECT /*+ FIRST_ROWS(100) */ Bode_Codigo FROM ALM_BODEGA ORDER BY Bode_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 30);
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
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 30);
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
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               stmt.setVarchar(7, (String)parms[11], 3, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

