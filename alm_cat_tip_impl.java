/*
               File: alm_cat_tip_impl
        Description: Tipo de catálogo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:13.65
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

public final  class alm_cat_tip_impl extends GXDataArea
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
            AV7TIP_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7TIP_Codigo", AV7TIP_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIP_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TIP_Codigo, ""))));
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
         Form.getMeta().addItem("description", "Tipo de catálogo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTIP_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_cat_tip_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cat_tip_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cat_tip_impl.class ));
   }

   public alm_cat_tip_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de catálogo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Codigo_Internalname, "Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Descripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_UsuarioCreacion_Internalname, A436TIP_UsuarioCreacion, GXutil.rtrim( localUtil.format( A436TIP_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTip_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTip_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTip_FechaCreacion_Internalname, localUtil.ttoc( A437Tip_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A437Tip_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTip_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTip_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTip_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTip_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTip_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTip_UsuarioModifica_Internalname, A438Tip_UsuarioModifica, GXutil.rtrim( localUtil.format( A438Tip_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTip_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtTip_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_TIP.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTip_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTip_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTip_FechaModifica_Internalname, localUtil.ttoc( A439Tip_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A439Tip_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTip_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtTip_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTip_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTip_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_TIP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_TIP.htm");
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
      e11152 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
            A436TIP_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtTIP_UsuarioCreacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TIP_UsuarioCreacion", A436TIP_UsuarioCreacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTip_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TIP_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTip_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A437Tip_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A437Tip_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtTip_FechaCreacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            A438Tip_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTip_UsuarioModifica_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A438Tip_UsuarioModifica", A438Tip_UsuarioModifica);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTip_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TIP_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTip_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A439Tip_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A439Tip_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTip_FechaModifica_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            /* Read saved values. */
            Z74TIP_Codigo = httpContext.cgiGet( "Z74TIP_Codigo") ;
            Z436TIP_UsuarioCreacion = httpContext.cgiGet( "Z436TIP_UsuarioCreacion") ;
            Z438Tip_UsuarioModifica = httpContext.cgiGet( "Z438Tip_UsuarioModifica") ;
            Z437Tip_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z437Tip_FechaCreacion"), 0) ;
            Z439Tip_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z439Tip_FechaModifica"), 0) ;
            Z435TIP_Descripcion = httpContext.cgiGet( "Z435TIP_Descripcion") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7TIP_Codigo = httpContext.cgiGet( "vTIP_CODIGO") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CAT_TIP" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A74TIP_Codigo, Z74TIP_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_cat_tip:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A74TIP_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
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
                  sMode42 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode42 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound42 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_150( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIP_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTIP_Codigo_Internalname ;
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
                        e11152 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12152 ();
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
         e12152 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1542( ) ;
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
         disableAttributes1542( ) ;
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

   public void confirm_150( )
   {
      beforeValidate1542( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1542( ) ;
         }
         else
         {
            checkExtendedTable1542( ) ;
            closeExtendedTableCursors1542( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption150( )
   {
   }

   public void e11152( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e12152( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_cat_tip") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1542( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z436TIP_UsuarioCreacion = T00153_A436TIP_UsuarioCreacion[0] ;
            Z438Tip_UsuarioModifica = T00153_A438Tip_UsuarioModifica[0] ;
            Z437Tip_FechaCreacion = T00153_A437Tip_FechaCreacion[0] ;
            Z439Tip_FechaModifica = T00153_A439Tip_FechaModifica[0] ;
            Z435TIP_Descripcion = T00153_A435TIP_Descripcion[0] ;
         }
         else
         {
            Z436TIP_UsuarioCreacion = A436TIP_UsuarioCreacion ;
            Z438Tip_UsuarioModifica = A438Tip_UsuarioModifica ;
            Z437Tip_FechaCreacion = A437Tip_FechaCreacion ;
            Z439Tip_FechaModifica = A439Tip_FechaModifica ;
            Z435TIP_Descripcion = A435TIP_Descripcion ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z436TIP_UsuarioCreacion = A436TIP_UsuarioCreacion ;
         Z438Tip_UsuarioModifica = A438Tip_UsuarioModifica ;
         Z437Tip_FechaCreacion = A437Tip_FechaCreacion ;
         Z439Tip_FechaModifica = A439Tip_FechaModifica ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV7TIP_Codigo)==0) )
      {
         A74TIP_Codigo = AV7TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV7TIP_Codigo)==0) )
      {
         edtTIP_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTIP_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7TIP_Codigo)==0) )
      {
         edtTIP_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
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
         AV13Pgmname = "ALM_CAT_TIP" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
   }

   public void load1542( )
   {
      /* Using cursor T00154 */
      pr_default.execute(2, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A436TIP_UsuarioCreacion = T00154_A436TIP_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TIP_UsuarioCreacion", A436TIP_UsuarioCreacion);
         A438Tip_UsuarioModifica = T00154_A438Tip_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438Tip_UsuarioModifica", A438Tip_UsuarioModifica);
         A437Tip_FechaCreacion = T00154_A437Tip_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A439Tip_FechaModifica = T00154_A439Tip_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A435TIP_Descripcion = T00154_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         zm1542( -8) ;
      }
      pr_default.close(2);
      onLoadActions1542( ) ;
   }

   public void onLoadActions1542( )
   {
      AV13Pgmname = "ALM_CAT_TIP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1542( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_CAT_TIP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1542( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1542( )
   {
      /* Using cursor T00155 */
      pr_default.execute(3, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00153 */
      pr_default.execute(1, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1542( 8) ;
         RcdFound42 = (short)(1) ;
         A74TIP_Codigo = T00153_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         A436TIP_UsuarioCreacion = T00153_A436TIP_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TIP_UsuarioCreacion", A436TIP_UsuarioCreacion);
         A438Tip_UsuarioModifica = T00153_A438Tip_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438Tip_UsuarioModifica", A438Tip_UsuarioModifica);
         A437Tip_FechaCreacion = T00153_A437Tip_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A439Tip_FechaModifica = T00153_A439Tip_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A435TIP_Descripcion = T00153_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         Z74TIP_Codigo = A74TIP_Codigo ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1542( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1542( ) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1542( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1542( ) ;
      if ( RcdFound42 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T00156 */
      pr_default.execute(4, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00156_A74TIP_Codigo[0], A74TIP_Codigo) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00156_A74TIP_Codigo[0], A74TIP_Codigo) > 0 ) ) )
         {
            A74TIP_Codigo = T00156_A74TIP_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T00157 */
      pr_default.execute(5, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00157_A74TIP_Codigo[0], A74TIP_Codigo) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00157_A74TIP_Codigo[0], A74TIP_Codigo) < 0 ) ) )
         {
            A74TIP_Codigo = T00157_A74TIP_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1542( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTIP_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1542( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound42 == 1 )
         {
            if ( GXutil.strcmp(A74TIP_Codigo, Z74TIP_Codigo) != 0 )
            {
               A74TIP_Codigo = Z74TIP_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIP_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTIP_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTIP_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1542( ) ;
               GX_FocusControl = edtTIP_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A74TIP_Codigo, Z74TIP_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtTIP_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1542( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIP_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTIP_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTIP_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1542( ) ;
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
      if ( GXutil.strcmp(A74TIP_Codigo, Z74TIP_Codigo) != 0 )
      {
         A74TIP_Codigo = Z74TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIP_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTIP_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTIP_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1542( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00152 */
         pr_default.execute(0, new Object[] {A74TIP_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_TIP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z436TIP_UsuarioCreacion, T00152_A436TIP_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z438Tip_UsuarioModifica, T00152_A438Tip_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z437Tip_FechaCreacion, T00152_A437Tip_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z439Tip_FechaModifica, T00152_A439Tip_FechaModifica[0]) ) || ( GXutil.strcmp(Z435TIP_Descripcion, T00152_A435TIP_Descripcion[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CAT_TIP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1542( )
   {
      beforeValidate1542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1542( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1542( 0) ;
         checkOptimisticConcurrency1542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1542( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00158 */
                  pr_default.execute(6, new Object[] {A74TIP_Codigo, A436TIP_UsuarioCreacion, A438Tip_UsuarioModifica, A437Tip_FechaCreacion, A439Tip_FechaModifica, A435TIP_Descripcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_TIP") ;
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
                        resetCaption150( ) ;
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
            load1542( ) ;
         }
         endLevel1542( ) ;
      }
      closeExtendedTableCursors1542( ) ;
   }

   public void update1542( )
   {
      beforeValidate1542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1542( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1542( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00159 */
                  pr_default.execute(7, new Object[] {A436TIP_UsuarioCreacion, A438Tip_UsuarioModifica, A437Tip_FechaCreacion, A439Tip_FechaModifica, A435TIP_Descripcion, A74TIP_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_TIP") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_TIP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1542( ) ;
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
         endLevel1542( ) ;
      }
      closeExtendedTableCursors1542( ) ;
   }

   public void deferredUpdate1542( )
   {
   }

   public void delete( )
   {
      beforeValidate1542( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1542( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1542( ) ;
         afterConfirm1542( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1542( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001510 */
               pr_default.execute(8, new Object[] {A74TIP_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_TIP") ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1542( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1542( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_CAT_TIP" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001511 */
         pr_default.execute(9, new Object[] {A74TIP_Codigo});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACEN CATALOGO SEGMENTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel1542( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1542( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_tip");
         if ( AnyError == 0 )
         {
            confirmValues150( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_tip");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1542( )
   {
      /* Scan By routine */
      /* Using cursor T001512 */
      pr_default.execute(10);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A74TIP_Codigo = T001512_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1542( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A74TIP_Codigo = T001512_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      }
   }

   public void scanEnd1542( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1542( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A437Tip_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A439Tip_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A436TIP_UsuarioCreacion = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TIP_UsuarioCreacion", A436TIP_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A438Tip_UsuarioModifica = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A438Tip_UsuarioModifica", A438Tip_UsuarioModifica);
      }
   }

   public void beforeInsert1542( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1542( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1542( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1542( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1542( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1542( )
   {
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtTIP_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_UsuarioCreacion_Enabled, 5, 0)), true);
      edtTip_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTip_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTip_FechaCreacion_Enabled, 5, 0)), true);
      edtTip_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTip_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTip_UsuarioModifica_Enabled, 5, 0)), true);
      edtTip_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTip_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTip_FechaModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues150( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414171453");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cat_tip") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TIP_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z74TIP_Codigo", Z74TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z436TIP_UsuarioCreacion", Z436TIP_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z438Tip_UsuarioModifica", Z438Tip_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z437Tip_FechaCreacion", localUtil.ttoc( Z437Tip_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z439Tip_FechaModifica", localUtil.ttoc( Z439Tip_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z435TIP_Descripcion", Z435TIP_Descripcion);
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIP_CODIGO", AV7TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIP_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TIP_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CAT_TIP" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cat_tip:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_cat_tip") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7TIP_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_CAT_TIP" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de catálogo" ;
   }

   public void initializeNonKey1542( )
   {
      A436TIP_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A436TIP_UsuarioCreacion", A436TIP_UsuarioCreacion);
      A438Tip_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A438Tip_UsuarioModifica", A438Tip_UsuarioModifica);
      A437Tip_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A437Tip_FechaCreacion", localUtil.ttoc( A437Tip_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A439Tip_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A439Tip_FechaModifica", localUtil.ttoc( A439Tip_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A435TIP_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      Z436TIP_UsuarioCreacion = "" ;
      Z438Tip_UsuarioModifica = "" ;
      Z437Tip_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z439Tip_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z435TIP_Descripcion = "" ;
   }

   public void initAll1542( )
   {
      A74TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      initializeNonKey1542( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414171461");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_cat_tip.js", "?201861414171461");
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
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtTIP_UsuarioCreacion_Internalname = "TIP_USUARIOCREACION" ;
      edtTip_FechaCreacion_Internalname = "TIP_FECHACREACION" ;
      edtTip_UsuarioModifica_Internalname = "TIP_USUARIOMODIFICA" ;
      edtTip_FechaModifica_Internalname = "TIP_FECHAMODIFICA" ;
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
      Form.setCaption( "Tipo de catálogo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTip_FechaModifica_Jsonclick = "" ;
      edtTip_FechaModifica_Enabled = 1 ;
      edtTip_UsuarioModifica_Jsonclick = "" ;
      edtTip_UsuarioModifica_Enabled = 1 ;
      edtTip_FechaCreacion_Jsonclick = "" ;
      edtTip_FechaCreacion_Enabled = 1 ;
      edtTIP_UsuarioCreacion_Jsonclick = "" ;
      edtTIP_UsuarioCreacion_Enabled = 1 ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Enabled = 1 ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7TIP_Codigo',fld:'vTIP_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12152',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      wcpOAV7TIP_Codigo = "" ;
      Z74TIP_Codigo = "" ;
      Z436TIP_UsuarioCreacion = "" ;
      Z438Tip_UsuarioModifica = "" ;
      Z437Tip_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z439Tip_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z435TIP_Descripcion = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7TIP_Codigo = "" ;
      GXKey = "" ;
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
      A74TIP_Codigo = "" ;
      A435TIP_Descripcion = "" ;
      A436TIP_UsuarioCreacion = "" ;
      A437Tip_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A438Tip_UsuarioModifica = "" ;
      A439Tip_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode42 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T00154_A74TIP_Codigo = new String[] {""} ;
      T00154_A436TIP_UsuarioCreacion = new String[] {""} ;
      T00154_A438Tip_UsuarioModifica = new String[] {""} ;
      T00154_A437Tip_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00154_A439Tip_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00154_A435TIP_Descripcion = new String[] {""} ;
      T00155_A74TIP_Codigo = new String[] {""} ;
      T00153_A74TIP_Codigo = new String[] {""} ;
      T00153_A436TIP_UsuarioCreacion = new String[] {""} ;
      T00153_A438Tip_UsuarioModifica = new String[] {""} ;
      T00153_A437Tip_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00153_A439Tip_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00153_A435TIP_Descripcion = new String[] {""} ;
      T00156_A74TIP_Codigo = new String[] {""} ;
      T00157_A74TIP_Codigo = new String[] {""} ;
      T00152_A74TIP_Codigo = new String[] {""} ;
      T00152_A436TIP_UsuarioCreacion = new String[] {""} ;
      T00152_A438Tip_UsuarioModifica = new String[] {""} ;
      T00152_A437Tip_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00152_A439Tip_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00152_A435TIP_Descripcion = new String[] {""} ;
      T001511_A75SEG_Codigo = new String[] {""} ;
      T001512_A74TIP_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cat_tip__default(),
         new Object[] {
             new Object[] {
            T00152_A74TIP_Codigo, T00152_A436TIP_UsuarioCreacion, T00152_A438Tip_UsuarioModifica, T00152_A437Tip_FechaCreacion, T00152_A439Tip_FechaModifica, T00152_A435TIP_Descripcion
            }
            , new Object[] {
            T00153_A74TIP_Codigo, T00153_A436TIP_UsuarioCreacion, T00153_A438Tip_UsuarioModifica, T00153_A437Tip_FechaCreacion, T00153_A439Tip_FechaModifica, T00153_A435TIP_Descripcion
            }
            , new Object[] {
            T00154_A74TIP_Codigo, T00154_A436TIP_UsuarioCreacion, T00154_A438Tip_UsuarioModifica, T00154_A437Tip_FechaCreacion, T00154_A439Tip_FechaModifica, T00154_A435TIP_Descripcion
            }
            , new Object[] {
            T00155_A74TIP_Codigo
            }
            , new Object[] {
            T00156_A74TIP_Codigo
            }
            , new Object[] {
            T00157_A74TIP_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001511_A75SEG_Codigo
            }
            , new Object[] {
            T001512_A74TIP_Codigo
            }
         }
      );
      AV13Pgmname = "ALM_CAT_TIP" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound42 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtTIP_UsuarioCreacion_Enabled ;
   private int edtTip_FechaCreacion_Enabled ;
   private int edtTip_UsuarioModifica_Enabled ;
   private int edtTip_FechaModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTIP_Codigo_Internalname ;
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
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtTIP_UsuarioCreacion_Internalname ;
   private String edtTIP_UsuarioCreacion_Jsonclick ;
   private String edtTip_FechaCreacion_Internalname ;
   private String edtTip_FechaCreacion_Jsonclick ;
   private String edtTip_UsuarioModifica_Internalname ;
   private String edtTip_UsuarioModifica_Jsonclick ;
   private String edtTip_FechaModifica_Internalname ;
   private String edtTip_FechaModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode42 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z437Tip_FechaCreacion ;
   private java.util.Date Z439Tip_FechaModifica ;
   private java.util.Date A437Tip_FechaCreacion ;
   private java.util.Date A439Tip_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String wcpOAV7TIP_Codigo ;
   private String Z74TIP_Codigo ;
   private String Z436TIP_UsuarioCreacion ;
   private String Z438Tip_UsuarioModifica ;
   private String Z435TIP_Descripcion ;
   private String AV7TIP_Codigo ;
   private String A74TIP_Codigo ;
   private String A435TIP_Descripcion ;
   private String A436TIP_UsuarioCreacion ;
   private String A438Tip_UsuarioModifica ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private IDataStoreProvider pr_default ;
   private String[] T00154_A74TIP_Codigo ;
   private String[] T00154_A436TIP_UsuarioCreacion ;
   private String[] T00154_A438Tip_UsuarioModifica ;
   private java.util.Date[] T00154_A437Tip_FechaCreacion ;
   private java.util.Date[] T00154_A439Tip_FechaModifica ;
   private String[] T00154_A435TIP_Descripcion ;
   private String[] T00155_A74TIP_Codigo ;
   private String[] T00153_A74TIP_Codigo ;
   private String[] T00153_A436TIP_UsuarioCreacion ;
   private String[] T00153_A438Tip_UsuarioModifica ;
   private java.util.Date[] T00153_A437Tip_FechaCreacion ;
   private java.util.Date[] T00153_A439Tip_FechaModifica ;
   private String[] T00153_A435TIP_Descripcion ;
   private String[] T00156_A74TIP_Codigo ;
   private String[] T00157_A74TIP_Codigo ;
   private String[] T00152_A74TIP_Codigo ;
   private String[] T00152_A436TIP_UsuarioCreacion ;
   private String[] T00152_A438Tip_UsuarioModifica ;
   private java.util.Date[] T00152_A437Tip_FechaCreacion ;
   private java.util.Date[] T00152_A439Tip_FechaModifica ;
   private String[] T00152_A435TIP_Descripcion ;
   private String[] T001511_A75SEG_Codigo ;
   private String[] T001512_A74TIP_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_cat_tip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00152", "SELECT TIP_Codigo, TIP_UsuarioCreacion, Tip_UsuarioModifica, Tip_FechaCreacion, Tip_FechaModifica, TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ?  FOR UPDATE OF TIP_UsuarioCreacion, Tip_UsuarioModifica, Tip_FechaCreacion, Tip_FechaModifica, TIP_Descripcion NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00153", "SELECT TIP_Codigo, TIP_UsuarioCreacion, Tip_UsuarioModifica, Tip_FechaCreacion, Tip_FechaModifica, TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00154", "SELECT /*+ FIRST_ROWS(100) */ TM1.TIP_Codigo, TM1.TIP_UsuarioCreacion, TM1.Tip_UsuarioModifica, TM1.Tip_FechaCreacion, TM1.Tip_FechaModifica, TM1.TIP_Descripcion FROM ALM_CAT_TIP TM1 WHERE TM1.TIP_Codigo = ? ORDER BY TM1.TIP_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00155", "SELECT /*+ FIRST_ROWS(1) */ TIP_Codigo FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00156", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TIP_Codigo FROM ALM_CAT_TIP WHERE ( TIP_Codigo > ?) ORDER BY TIP_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00157", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TIP_Codigo FROM ALM_CAT_TIP WHERE ( TIP_Codigo < ?) ORDER BY TIP_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00158", "INSERT INTO ALM_CAT_TIP(TIP_Codigo, TIP_UsuarioCreacion, Tip_UsuarioModifica, Tip_FechaCreacion, Tip_FechaModifica, TIP_Descripcion) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CAT_TIP")
         ,new UpdateCursor("T00159", "UPDATE ALM_CAT_TIP SET TIP_UsuarioCreacion=?, Tip_UsuarioModifica=?, Tip_FechaCreacion=?, Tip_FechaModifica=?, TIP_Descripcion=?  WHERE TIP_Codigo = ?", GX_NOMASK, "ALM_CAT_TIP")
         ,new UpdateCursor("T001510", "DELETE FROM ALM_CAT_TIP  WHERE TIP_Codigo = ?", GX_NOMASK, "ALM_CAT_TIP")
         ,new ForEachCursor("T001511", "SELECT * FROM (SELECT SEG_Codigo FROM ALM_CAT_SEG WHERE TIP_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001512", "SELECT /*+ FIRST_ROWS(100) */ TIP_Codigo FROM ALM_CAT_TIP ORDER BY TIP_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

