/*
               File: seg_rol_impl
        Description: Rol
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:14.85
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

public final  class seg_rol_impl extends GXDataArea
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
            AV7Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Rol_Id", GXutil.ltrim( GXutil.str( AV7Rol_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Rol_Id), "ZZZZZZZZZZ9")));
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
      cmbRol_Tipo.setName( "ROL_TIPO" );
      cmbRol_Tipo.setWebtags( "" );
      cmbRol_Tipo.addItem("U", "Usuario", (short)(0));
      cmbRol_Tipo.addItem("S", "Admin Sistema", (short)(0));
      cmbRol_Tipo.addItem("F", "Admin Funcional", (short)(0));
      if ( cmbRol_Tipo.getItemCount() > 0 )
      {
         A402Rol_Tipo = cmbRol_Tipo.getValidValue(A402Rol_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
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
         Form.getMeta().addItem("description", "Rol", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRol_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_rol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_rol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_rol_impl.class ));
   }

   public seg_rol_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbRol_Tipo = new HTMLChoice();
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
      if ( cmbRol_Tipo.getItemCount() > 0 )
      {
         A402Rol_Tipo = cmbRol_Tipo.getValidValue(A402Rol_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Rol", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_ROL.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_ROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Id_Internalname, "Identificador del Rol", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")), ((edtRol_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Id_Jsonclick, 0, "Attribute", "", "", "", edtRol_Id_Visible, edtRol_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Descripcion_Internalname, A22Rol_Descripcion, GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRol_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRol_Tipo.getInternalname(), "Tipo de Rol", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRol_Tipo, cmbRol_Tipo.getInternalname(), GXutil.rtrim( A402Rol_Tipo), 1, cmbRol_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRol_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_SEG_ROL.htm");
         cmbRol_Tipo.setValue( GXutil.rtrim( A402Rol_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRol_Tipo.getInternalname(), "Values", cmbRol_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL.htm");
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
      e110R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
            cmbRol_Tipo.setValue( httpContext.cgiGet( cmbRol_Tipo.getInternalname()) );
            A402Rol_Tipo = httpContext.cgiGet( cmbRol_Tipo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
            /* Read saved values. */
            Z21Rol_Id = localUtil.ctol( httpContext.cgiGet( "Z21Rol_Id"), ",", ".") ;
            Z211Rol_UsuarioCrea = httpContext.cgiGet( "Z211Rol_UsuarioCrea") ;
            Z213Rol_UsuarioModifica = httpContext.cgiGet( "Z213Rol_UsuarioModifica") ;
            Z212Rol_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z212Rol_FechaCrea"), 0) ;
            Z214Rol_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z214Rol_FechaModifica"), 0) ;
            Z22Rol_Descripcion = httpContext.cgiGet( "Z22Rol_Descripcion") ;
            Z402Rol_Tipo = httpContext.cgiGet( "Z402Rol_Tipo") ;
            A211Rol_UsuarioCrea = httpContext.cgiGet( "Z211Rol_UsuarioCrea") ;
            A213Rol_UsuarioModifica = httpContext.cgiGet( "Z213Rol_UsuarioModifica") ;
            A212Rol_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z212Rol_FechaCrea"), 0) ;
            A214Rol_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z214Rol_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7Rol_Id = localUtil.ctol( httpContext.cgiGet( "vROL_ID"), ",", ".") ;
            A211Rol_UsuarioCrea = httpContext.cgiGet( "ROL_USUARIOCREA") ;
            A213Rol_UsuarioModifica = httpContext.cgiGet( "ROL_USUARIOMODIFICA") ;
            A212Rol_FechaCrea = localUtil.ctot( httpContext.cgiGet( "ROL_FECHACREA"), 0) ;
            A214Rol_FechaModifica = localUtil.ctot( httpContext.cgiGet( "ROL_FECHAMODIFICA"), 0) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_ROL" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A21Rol_Id != Z21Rol_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_rol:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A21Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
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
                  sMode27 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode27 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound27 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0R0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ROL_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRol_Id_Internalname ;
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
                        e110R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120R2 ();
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
         e120R2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0R27( ) ;
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
         disableAttributes0R27( ) ;
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

   public void confirm_0R0( )
   {
      beforeValidate0R27( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0R27( ) ;
         }
         else
         {
            checkExtendedTable0R27( ) ;
            closeExtendedTableCursors0R27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0R0( )
   {
   }

   public void e110R2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV8TrnContext.fromxml(AV9WebSession.getValue("TrnContext"), null, null);
      AV10Usuario = AV9WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Usuario", AV10Usuario);
      edtRol_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtRol_Id_Visible, 5, 0)), true);
   }

   public void e120R2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV8TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_rol") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0R27( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z211Rol_UsuarioCrea = T000R3_A211Rol_UsuarioCrea[0] ;
            Z213Rol_UsuarioModifica = T000R3_A213Rol_UsuarioModifica[0] ;
            Z212Rol_FechaCrea = T000R3_A212Rol_FechaCrea[0] ;
            Z214Rol_FechaModifica = T000R3_A214Rol_FechaModifica[0] ;
            Z22Rol_Descripcion = T000R3_A22Rol_Descripcion[0] ;
            Z402Rol_Tipo = T000R3_A402Rol_Tipo[0] ;
         }
         else
         {
            Z211Rol_UsuarioCrea = A211Rol_UsuarioCrea ;
            Z213Rol_UsuarioModifica = A213Rol_UsuarioModifica ;
            Z212Rol_FechaCrea = A212Rol_FechaCrea ;
            Z214Rol_FechaModifica = A214Rol_FechaModifica ;
            Z22Rol_Descripcion = A22Rol_Descripcion ;
            Z402Rol_Tipo = A402Rol_Tipo ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z21Rol_Id = A21Rol_Id ;
         Z211Rol_UsuarioCrea = A211Rol_UsuarioCrea ;
         Z213Rol_UsuarioModifica = A213Rol_UsuarioModifica ;
         Z212Rol_FechaCrea = A212Rol_FechaCrea ;
         Z214Rol_FechaModifica = A214Rol_FechaModifica ;
         Z22Rol_Descripcion = A22Rol_Descripcion ;
         Z402Rol_Tipo = A402Rol_Tipo ;
      }
   }

   public void standaloneNotModal( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Rol_Id) )
      {
         A21Rol_Id = AV7Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
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

   public void load0R27( )
   {
      /* Using cursor T000R4 */
      pr_default.execute(2, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A211Rol_UsuarioCrea = T000R4_A211Rol_UsuarioCrea[0] ;
         A213Rol_UsuarioModifica = T000R4_A213Rol_UsuarioModifica[0] ;
         A212Rol_FechaCrea = T000R4_A212Rol_FechaCrea[0] ;
         A214Rol_FechaModifica = T000R4_A214Rol_FechaModifica[0] ;
         A22Rol_Descripcion = T000R4_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         A402Rol_Tipo = T000R4_A402Rol_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
         zm0R27( -8) ;
      }
      pr_default.close(2);
      onLoadActions0R27( ) ;
   }

   public void onLoadActions0R27( )
   {
      AV13Pgmname = "SEG_ROL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0R27( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "SEG_ROL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0R27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0R27( )
   {
      /* Using cursor T000R5 */
      pr_default.execute(3, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000R3 */
      pr_default.execute(1, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0R27( 8) ;
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000R3_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A211Rol_UsuarioCrea = T000R3_A211Rol_UsuarioCrea[0] ;
         A213Rol_UsuarioModifica = T000R3_A213Rol_UsuarioModifica[0] ;
         A212Rol_FechaCrea = T000R3_A212Rol_FechaCrea[0] ;
         A214Rol_FechaModifica = T000R3_A214Rol_FechaModifica[0] ;
         A22Rol_Descripcion = T000R3_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         A402Rol_Tipo = T000R3_A402Rol_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
         Z21Rol_Id = A21Rol_Id ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0R27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey0R27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey0R27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0R27( ) ;
      if ( RcdFound27 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000R6 */
      pr_default.execute(4, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000R6_A21Rol_Id[0] < A21Rol_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000R6_A21Rol_Id[0] > A21Rol_Id ) ) )
         {
            A21Rol_Id = T000R6_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000R7 */
      pr_default.execute(5, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000R7_A21Rol_Id[0] > A21Rol_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000R7_A21Rol_Id[0] < A21Rol_Id ) ) )
         {
            A21Rol_Id = T000R7_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0R27( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRol_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0R27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( A21Rol_Id != Z21Rol_Id )
            {
               A21Rol_Id = Z21Rol_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ROL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRol_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0R27( ) ;
               GX_FocusControl = edtRol_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A21Rol_Id != Z21Rol_Id )
            {
               /* Insert record */
               GX_FocusControl = edtRol_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0R27( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ROL_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRol_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRol_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0R27( ) ;
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
      if ( A21Rol_Id != Z21Rol_Id )
      {
         A21Rol_Id = Z21Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRol_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0R27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000R2 */
         pr_default.execute(0, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z211Rol_UsuarioCrea, T000R2_A211Rol_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z213Rol_UsuarioModifica, T000R2_A213Rol_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z212Rol_FechaCrea, T000R2_A212Rol_FechaCrea[0]) ) || !( GXutil.dateCompare(Z214Rol_FechaModifica, T000R2_A214Rol_FechaModifica[0]) ) || ( GXutil.strcmp(Z22Rol_Descripcion, T000R2_A22Rol_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z402Rol_Tipo, T000R2_A402Rol_Tipo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_ROL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0R27( )
   {
      beforeValidate0R27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0R27( 0) ;
         checkOptimisticConcurrency0R27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0R27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000R8 */
                  pr_default.execute(6, new Object[] {A211Rol_UsuarioCrea, A213Rol_UsuarioModifica, A212Rol_FechaCrea, A214Rol_FechaModifica, A22Rol_Descripcion, A402Rol_Tipo});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000R9 */
                  pr_default.execute(7);
                  A21Rol_Id = T000R9_A21Rol_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0R0( ) ;
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
            load0R27( ) ;
         }
         endLevel0R27( ) ;
      }
      closeExtendedTableCursors0R27( ) ;
   }

   public void update0R27( )
   {
      beforeValidate0R27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0R27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000R10 */
                  pr_default.execute(8, new Object[] {A211Rol_UsuarioCrea, A213Rol_UsuarioModifica, A212Rol_FechaCrea, A214Rol_FechaModifica, A22Rol_Descripcion, A402Rol_Tipo, new Long(A21Rol_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0R27( ) ;
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
         endLevel0R27( ) ;
      }
      closeExtendedTableCursors0R27( ) ;
   }

   public void deferredUpdate0R27( )
   {
   }

   public void delete( )
   {
      beforeValidate0R27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0R27( ) ;
         afterConfirm0R27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0R27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000R11 */
               pr_default.execute(9, new Object[] {new Long(A21Rol_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0R27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0R27( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "SEG_ROL" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000R12 */
         pr_default.execute(10, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ROLES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000R13 */
         pr_default.execute(11, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ROL Y PANTALLAS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000R14 */
         pr_default.execute(12, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"USUARIO Y ROLES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel0R27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0R27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_rol");
         if ( AnyError == 0 )
         {
            confirmValues0R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_rol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0R27( )
   {
      /* Scan By routine */
      /* Using cursor T000R15 */
      pr_default.execute(13);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000R15_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0R27( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000R15_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
   }

   public void scanEnd0R27( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0R27( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A211Rol_UsuarioCrea = AV10Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A211Rol_UsuarioCrea", A211Rol_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A213Rol_UsuarioModifica = AV10Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A213Rol_UsuarioModifica", A213Rol_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A212Rol_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212Rol_FechaCrea", localUtil.ttoc( A212Rol_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A214Rol_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A214Rol_FechaModifica", localUtil.ttoc( A214Rol_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(A22Rol_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del Rol", 1, "ROL_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert0R27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0R27( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0R27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0R27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0R27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0R27( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), true);
      cmbRol_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRol_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRol_Tipo.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0R0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161561");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_rol") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Rol_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z21Rol_Id", GXutil.ltrim( localUtil.ntoc( Z21Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z211Rol_UsuarioCrea", Z211Rol_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z213Rol_UsuarioModifica", Z213Rol_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z212Rol_FechaCrea", localUtil.ttoc( Z212Rol_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z214Rol_FechaModifica", localUtil.ttoc( Z214Rol_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z22Rol_Descripcion", Z22Rol_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z402Rol_Tipo", GXutil.rtrim( Z402Rol_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV8TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV8TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vROL_ID", GXutil.ltrim( localUtil.ntoc( AV7Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_USUARIOCREA", A211Rol_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_USUARIOMODIFICA", A213Rol_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_FECHACREA", localUtil.ttoc( A212Rol_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_FECHAMODIFICA", localUtil.ttoc( A214Rol_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Rol_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_ROL" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_rol:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_rol") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Rol_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_ROL" ;
   }

   public String getPgmdesc( )
   {
      return "Rol" ;
   }

   public void initializeNonKey0R27( )
   {
      A211Rol_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A211Rol_UsuarioCrea", A211Rol_UsuarioCrea);
      A213Rol_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A213Rol_UsuarioModifica", A213Rol_UsuarioModifica);
      A212Rol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A212Rol_FechaCrea", localUtil.ttoc( A212Rol_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A214Rol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A214Rol_FechaModifica", localUtil.ttoc( A214Rol_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A22Rol_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
      A402Rol_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
      Z211Rol_UsuarioCrea = "" ;
      Z213Rol_UsuarioModifica = "" ;
      Z212Rol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z214Rol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z22Rol_Descripcion = "" ;
      Z402Rol_Tipo = "" ;
   }

   public void initAll0R27( )
   {
      A21Rol_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      initializeNonKey0R27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161569");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_rol.js", "?201861414161569");
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
      edtRol_Id_Internalname = "ROL_ID" ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION" ;
      cmbRol_Tipo.setInternalname( "ROL_TIPO" );
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
      Form.setCaption( "Rol" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbRol_Tipo.setJsonclick( "" );
      cmbRol_Tipo.setEnabled( 1 );
      edtRol_Descripcion_Jsonclick = "" ;
      edtRol_Descripcion_Enabled = 1 ;
      edtRol_Id_Jsonclick = "" ;
      edtRol_Id_Enabled = 0 ;
      edtRol_Id_Visible = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Rol_Id',fld:'vROL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120R2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV8TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z211Rol_UsuarioCrea = "" ;
      Z213Rol_UsuarioModifica = "" ;
      Z212Rol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z214Rol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z22Rol_Descripcion = "" ;
      Z402Rol_Tipo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A402Rol_Tipo = "" ;
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
      A22Rol_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A211Rol_UsuarioCrea = "" ;
      A213Rol_UsuarioModifica = "" ;
      A212Rol_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A214Rol_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode27 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9WebSession = httpContext.getWebSession();
      AV10Usuario = "" ;
      T000R4_A21Rol_Id = new long[1] ;
      T000R4_A211Rol_UsuarioCrea = new String[] {""} ;
      T000R4_A213Rol_UsuarioModifica = new String[] {""} ;
      T000R4_A212Rol_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000R4_A214Rol_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000R4_A22Rol_Descripcion = new String[] {""} ;
      T000R4_A402Rol_Tipo = new String[] {""} ;
      T000R5_A21Rol_Id = new long[1] ;
      T000R3_A21Rol_Id = new long[1] ;
      T000R3_A211Rol_UsuarioCrea = new String[] {""} ;
      T000R3_A213Rol_UsuarioModifica = new String[] {""} ;
      T000R3_A212Rol_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000R3_A214Rol_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000R3_A22Rol_Descripcion = new String[] {""} ;
      T000R3_A402Rol_Tipo = new String[] {""} ;
      T000R6_A21Rol_Id = new long[1] ;
      T000R7_A21Rol_Id = new long[1] ;
      T000R2_A21Rol_Id = new long[1] ;
      T000R2_A211Rol_UsuarioCrea = new String[] {""} ;
      T000R2_A213Rol_UsuarioModifica = new String[] {""} ;
      T000R2_A212Rol_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000R2_A214Rol_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000R2_A22Rol_Descripcion = new String[] {""} ;
      T000R2_A402Rol_Tipo = new String[] {""} ;
      T000R9_A21Rol_Id = new long[1] ;
      T000R12_A104TNov_Codigo = new int[1] ;
      T000R12_A105TNov_Rol_Id = new long[1] ;
      T000R13_A21Rol_Id = new long[1] ;
      T000R13_A18Pant_Id = new int[1] ;
      T000R14_A23Usua_Id = new long[1] ;
      T000R14_A21Rol_Id = new long[1] ;
      T000R15_A21Rol_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_rol__default(),
         new Object[] {
             new Object[] {
            T000R2_A21Rol_Id, T000R2_A211Rol_UsuarioCrea, T000R2_A213Rol_UsuarioModifica, T000R2_A212Rol_FechaCrea, T000R2_A214Rol_FechaModifica, T000R2_A22Rol_Descripcion, T000R2_A402Rol_Tipo
            }
            , new Object[] {
            T000R3_A21Rol_Id, T000R3_A211Rol_UsuarioCrea, T000R3_A213Rol_UsuarioModifica, T000R3_A212Rol_FechaCrea, T000R3_A214Rol_FechaModifica, T000R3_A22Rol_Descripcion, T000R3_A402Rol_Tipo
            }
            , new Object[] {
            T000R4_A21Rol_Id, T000R4_A211Rol_UsuarioCrea, T000R4_A213Rol_UsuarioModifica, T000R4_A212Rol_FechaCrea, T000R4_A214Rol_FechaModifica, T000R4_A22Rol_Descripcion, T000R4_A402Rol_Tipo
            }
            , new Object[] {
            T000R5_A21Rol_Id
            }
            , new Object[] {
            T000R6_A21Rol_Id
            }
            , new Object[] {
            T000R7_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000R9_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000R12_A104TNov_Codigo, T000R12_A105TNov_Rol_Id
            }
            , new Object[] {
            T000R13_A21Rol_Id, T000R13_A18Pant_Id
            }
            , new Object[] {
            T000R14_A23Usua_Id, T000R14_A21Rol_Id
            }
            , new Object[] {
            T000R15_A21Rol_Id
            }
         }
      );
      AV13Pgmname = "SEG_ROL" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound27 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRol_Id_Enabled ;
   private int edtRol_Id_Visible ;
   private int edtRol_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7Rol_Id ;
   private long Z21Rol_Id ;
   private long AV7Rol_Id ;
   private long A21Rol_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z402Rol_Tipo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A402Rol_Tipo ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRol_Descripcion_Internalname ;
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
   private String edtRol_Id_Internalname ;
   private String edtRol_Id_Jsonclick ;
   private String edtRol_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode27 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z212Rol_FechaCrea ;
   private java.util.Date Z214Rol_FechaModifica ;
   private java.util.Date A212Rol_FechaCrea ;
   private java.util.Date A214Rol_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z211Rol_UsuarioCrea ;
   private String Z213Rol_UsuarioModifica ;
   private String Z22Rol_Descripcion ;
   private String A22Rol_Descripcion ;
   private String A211Rol_UsuarioCrea ;
   private String A213Rol_UsuarioModifica ;
   private String AV10Usuario ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private HTMLChoice cmbRol_Tipo ;
   private IDataStoreProvider pr_default ;
   private long[] T000R4_A21Rol_Id ;
   private String[] T000R4_A211Rol_UsuarioCrea ;
   private String[] T000R4_A213Rol_UsuarioModifica ;
   private java.util.Date[] T000R4_A212Rol_FechaCrea ;
   private java.util.Date[] T000R4_A214Rol_FechaModifica ;
   private String[] T000R4_A22Rol_Descripcion ;
   private String[] T000R4_A402Rol_Tipo ;
   private long[] T000R5_A21Rol_Id ;
   private long[] T000R3_A21Rol_Id ;
   private String[] T000R3_A211Rol_UsuarioCrea ;
   private String[] T000R3_A213Rol_UsuarioModifica ;
   private java.util.Date[] T000R3_A212Rol_FechaCrea ;
   private java.util.Date[] T000R3_A214Rol_FechaModifica ;
   private String[] T000R3_A22Rol_Descripcion ;
   private String[] T000R3_A402Rol_Tipo ;
   private long[] T000R6_A21Rol_Id ;
   private long[] T000R7_A21Rol_Id ;
   private long[] T000R2_A21Rol_Id ;
   private String[] T000R2_A211Rol_UsuarioCrea ;
   private String[] T000R2_A213Rol_UsuarioModifica ;
   private java.util.Date[] T000R2_A212Rol_FechaCrea ;
   private java.util.Date[] T000R2_A214Rol_FechaModifica ;
   private String[] T000R2_A22Rol_Descripcion ;
   private String[] T000R2_A402Rol_Tipo ;
   private long[] T000R9_A21Rol_Id ;
   private int[] T000R12_A104TNov_Codigo ;
   private long[] T000R12_A105TNov_Rol_Id ;
   private long[] T000R13_A21Rol_Id ;
   private int[] T000R13_A18Pant_Id ;
   private long[] T000R14_A23Usua_Id ;
   private long[] T000R14_A21Rol_Id ;
   private long[] T000R15_A21Rol_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
}

final  class seg_rol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000R2", "SELECT Rol_Id, Rol_UsuarioCrea, Rol_UsuarioModifica, Rol_FechaCrea, Rol_FechaModifica, Rol_Descripcion, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ?  FOR UPDATE OF Rol_UsuarioCrea, Rol_UsuarioModifica, Rol_FechaCrea, Rol_FechaModifica, Rol_Descripcion, Rol_Tipo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R3", "SELECT Rol_Id, Rol_UsuarioCrea, Rol_UsuarioModifica, Rol_FechaCrea, Rol_FechaModifica, Rol_Descripcion, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Rol_Id, TM1.Rol_UsuarioCrea, TM1.Rol_UsuarioModifica, TM1.Rol_FechaCrea, TM1.Rol_FechaModifica, TM1.Rol_Descripcion, TM1.Rol_Tipo FROM SEG_ROL TM1 WHERE TM1.Rol_Id = ? ORDER BY TM1.Rol_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000R5", "SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE ( Rol_Id > ?) ORDER BY Rol_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000R7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE ( Rol_Id < ?) ORDER BY Rol_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000R8", "INSERT INTO SEG_ROL(Rol_UsuarioCrea, Rol_UsuarioModifica, Rol_FechaCrea, Rol_FechaModifica, Rol_Descripcion, Rol_Tipo) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_ROL")
         ,new ForEachCursor("T000R9", "SELECT Rol_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000R10", "UPDATE SEG_ROL SET Rol_UsuarioCrea=?, Rol_UsuarioModifica=?, Rol_FechaCrea=?, Rol_FechaModifica=?, Rol_Descripcion=?, Rol_Tipo=?  WHERE Rol_Id = ?", GX_NOMASK, "SEG_ROL")
         ,new UpdateCursor("T000R11", "DELETE FROM SEG_ROL  WHERE Rol_Id = ?", GX_NOMASK, "SEG_ROL")
         ,new ForEachCursor("T000R12", "SELECT * FROM (SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Rol_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000R13", "SELECT * FROM (SELECT Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000R14", "SELECT * FROM (SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Rol_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000R15", "SELECT /*+ FIRST_ROWS(100) */ Rol_Id FROM SEG_ROL ORDER BY Rol_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
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
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setLong(7, ((Number) parms[6]).longValue());
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

