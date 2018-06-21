/*
               File: seg_rol_pantalla_impl
        Description: Roles y pantallas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:1.36
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

public final  class seg_rol_pantalla_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A21Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A21Rol_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A18Pant_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A16Modu_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A16Modu_Id) ;
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
            AV10Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Rol_Id", GXutil.ltrim( GXutil.str( AV10Rol_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Rol_Id), "ZZZZZZZZZZ9")));
            AV11Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Pant_Id", GXutil.ltrim( GXutil.str( AV11Pant_Id, 6, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPANT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Pant_Id), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", "Roles y pantallas", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRol_Id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_rol_pantalla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_rol_pantalla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_rol_pantalla_impl.class ));
   }

   public seg_rol_pantalla_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Roles y pantallas", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx00q0"+"',["+"{Ctrl:gx.dom.el('"+"ROL_ID"+"'), id:'"+"ROL_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"PANT_ID"+"'), id:'"+"PANT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_SEG_ROL_PANTALLA.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtRol_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROL_PANTALLA.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_21_Internalname, sImgUrl, imgprompt_21_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_21_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Descripcion_Internalname, "Descripción del rol", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Descripcion_Internalname, A22Rol_Descripcion, GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRol_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Id_Internalname, "Identificador Pantalla", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_Id_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_SEG_ROL_PANTALLA.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_18_Internalname, sImgUrl, imgprompt_18_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_18_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Descripcion_Internalname, "Descripción Pantalla", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Descripcion_Internalname, A19Pant_Descripcion, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Id_Internalname, "Identificador Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")), ((edtModu_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtModu_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Descripcion_Internalname, "Descripción Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Descripcion_Internalname, A17Modu_Descripcion, GXutil.rtrim( localUtil.format( A17Modu_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtModu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROL_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROL_PANTALLA.htm");
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
      e110N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ROL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A21Rol_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            }
            else
            {
               A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            }
            A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PANT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPant_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A18Pant_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            }
            else
            {
               A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            }
            A19Pant_Descripcion = httpContext.cgiGet( edtPant_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
            A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
            /* Read saved values. */
            Z21Rol_Id = localUtil.ctol( httpContext.cgiGet( "Z21Rol_Id"), ",", ".") ;
            Z18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( "Z18Pant_Id"), ",", ".")) ;
            Z215RolP_UsuarioCrea = httpContext.cgiGet( "Z215RolP_UsuarioCrea") ;
            Z217RolP_UsuarioModifica = httpContext.cgiGet( "Z217RolP_UsuarioModifica") ;
            Z216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z216RolP_FechaCrea"), 0) ;
            Z218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z218RolP_FechaModifica"), 0) ;
            A215RolP_UsuarioCrea = httpContext.cgiGet( "Z215RolP_UsuarioCrea") ;
            A217RolP_UsuarioModifica = httpContext.cgiGet( "Z217RolP_UsuarioModifica") ;
            A216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z216RolP_FechaCrea"), 0) ;
            A218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z218RolP_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV10Rol_Id = localUtil.ctol( httpContext.cgiGet( "vROL_ID"), ",", ".") ;
            AV11Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( "vPANT_ID"), ",", ".")) ;
            A215RolP_UsuarioCrea = httpContext.cgiGet( "ROLP_USUARIOCREA") ;
            A217RolP_UsuarioModifica = httpContext.cgiGet( "ROLP_USUARIOMODIFICA") ;
            A216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( "ROLP_FECHACREA"), 0) ;
            A218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( "ROLP_FECHAMODIFICA"), 0) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_ROL_PANTALLA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A21Rol_Id != Z21Rol_Id ) || ( A18Pant_Id != Z18Pant_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_rol_pantalla:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
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
                  sMode26 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode26 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound26 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0N0( ) ;
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
                        e110N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120N2 ();
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
         e120N2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0N26( ) ;
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
         disableAttributes0N26( ) ;
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

   public void confirm_0N0( )
   {
      beforeValidate0N26( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0N26( ) ;
         }
         else
         {
            checkExtendedTable0N26( ) ;
            closeExtendedTableCursors0N26( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0N0( )
   {
   }

   public void e110N2( )
   {
      /* Start Routine */
      AV9Usuario = AV8WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Usuario", AV9Usuario);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV14Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV7TrnContext.fromxml(AV8WebSession.getValue("TrnContext"), null, null);
   }

   public void e120N2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV7TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_rol_pantalla") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0N26( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z215RolP_UsuarioCrea = T000N3_A215RolP_UsuarioCrea[0] ;
            Z217RolP_UsuarioModifica = T000N3_A217RolP_UsuarioModifica[0] ;
            Z216RolP_FechaCrea = T000N3_A216RolP_FechaCrea[0] ;
            Z218RolP_FechaModifica = T000N3_A218RolP_FechaModifica[0] ;
         }
         else
         {
            Z215RolP_UsuarioCrea = A215RolP_UsuarioCrea ;
            Z217RolP_UsuarioModifica = A217RolP_UsuarioModifica ;
            Z216RolP_FechaCrea = A216RolP_FechaCrea ;
            Z218RolP_FechaModifica = A218RolP_FechaModifica ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z215RolP_UsuarioCrea = A215RolP_UsuarioCrea ;
         Z217RolP_UsuarioModifica = A217RolP_UsuarioModifica ;
         Z216RolP_FechaCrea = A216RolP_FechaCrea ;
         Z218RolP_FechaModifica = A218RolP_FechaModifica ;
         Z21Rol_Id = A21Rol_Id ;
         Z18Pant_Id = A18Pant_Id ;
         Z22Rol_Descripcion = A22Rol_Descripcion ;
         Z19Pant_Descripcion = A19Pant_Descripcion ;
         Z16Modu_Id = A16Modu_Id ;
         Z17Modu_Descripcion = A17Modu_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_21_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00r0"+"',["+"{Ctrl:gx.dom.el('"+"ROL_ID"+"'), id:'"+"ROL_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_18_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00p0"+"',["+"{Ctrl:gx.dom.el('"+"PANT_ID"+"'), id:'"+"PANT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV10Rol_Id) )
      {
         A21Rol_Id = AV10Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
      if ( ! (0==AV10Rol_Id) )
      {
         edtRol_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtRol_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV10Rol_Id) )
      {
         edtRol_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV11Pant_Id) )
      {
         A18Pant_Id = AV11Pant_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      if ( ! (0==AV11Pant_Id) )
      {
         edtPant_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtPant_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV11Pant_Id) )
      {
         edtPant_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
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
         /* Using cursor T000N4 */
         pr_default.execute(2, new Object[] {new Long(A21Rol_Id)});
         A22Rol_Descripcion = T000N4_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         pr_default.close(2);
         AV14Pgmname = "SEG_ROL_PANTALLA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         /* Using cursor T000N5 */
         pr_default.execute(3, new Object[] {new Integer(A18Pant_Id)});
         A19Pant_Descripcion = T000N5_A19Pant_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A16Modu_Id = T000N5_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         pr_default.close(3);
         /* Using cursor T000N6 */
         pr_default.execute(4, new Object[] {new Long(A16Modu_Id)});
         A17Modu_Descripcion = T000N6_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         pr_default.close(4);
      }
   }

   public void load0N26( )
   {
      /* Using cursor T000N7 */
      pr_default.execute(5, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A215RolP_UsuarioCrea = T000N7_A215RolP_UsuarioCrea[0] ;
         A217RolP_UsuarioModifica = T000N7_A217RolP_UsuarioModifica[0] ;
         A216RolP_FechaCrea = T000N7_A216RolP_FechaCrea[0] ;
         A218RolP_FechaModifica = T000N7_A218RolP_FechaModifica[0] ;
         A22Rol_Descripcion = T000N7_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         A19Pant_Descripcion = T000N7_A19Pant_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A17Modu_Descripcion = T000N7_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         A16Modu_Id = T000N7_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         zm0N26( -12) ;
      }
      pr_default.close(5);
      onLoadActions0N26( ) ;
   }

   public void onLoadActions0N26( )
   {
      AV14Pgmname = "SEG_ROL_PANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable0N26( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV14Pgmname = "SEG_ROL_PANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      /* Using cursor T000N4 */
      pr_default.execute(2, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A22Rol_Descripcion = T000N4_A22Rol_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
      pr_default.close(2);
      /* Using cursor T000N5 */
      pr_default.execute(3, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A19Pant_Descripcion = T000N5_A19Pant_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
      A16Modu_Id = T000N5_A16Modu_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      pr_default.close(3);
      /* Using cursor T000N6 */
      pr_default.execute(4, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000N6_A17Modu_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      pr_default.close(4);
      if ( ( A18Pant_Id == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar las pantallas a las que tiene acceso el Rol", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0N26( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( long A21Rol_Id )
   {
      /* Using cursor T000N8 */
      pr_default.execute(6, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A22Rol_Descripcion = T000N8_A22Rol_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A22Rol_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void gxload_14( int A18Pant_Id )
   {
      /* Using cursor T000N9 */
      pr_default.execute(7, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A19Pant_Descripcion = T000N9_A19Pant_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
      A16Modu_Id = T000N9_A16Modu_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A19Pant_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_15( long A16Modu_Id )
   {
      /* Using cursor T000N10 */
      pr_default.execute(8, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000N10_A17Modu_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A17Modu_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void getKey0N26( )
   {
      /* Using cursor T000N11 */
      pr_default.execute(9, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound26 = (short)(1) ;
      }
      else
      {
         RcdFound26 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000N3 */
      pr_default.execute(1, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0N26( 12) ;
         RcdFound26 = (short)(1) ;
         A215RolP_UsuarioCrea = T000N3_A215RolP_UsuarioCrea[0] ;
         A217RolP_UsuarioModifica = T000N3_A217RolP_UsuarioModifica[0] ;
         A216RolP_FechaCrea = T000N3_A216RolP_FechaCrea[0] ;
         A218RolP_FechaModifica = T000N3_A218RolP_FechaModifica[0] ;
         A21Rol_Id = T000N3_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A18Pant_Id = T000N3_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
         Z21Rol_Id = A21Rol_Id ;
         Z18Pant_Id = A18Pant_Id ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0N26( ) ;
         if ( AnyError == 1 )
         {
            RcdFound26 = (short)(0) ;
            initializeNonKey0N26( ) ;
         }
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound26 = (short)(0) ;
         initializeNonKey0N26( ) ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0N26( ) ;
      if ( RcdFound26 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound26 = (short)(0) ;
      /* Using cursor T000N12 */
      pr_default.execute(10, new Object[] {new Long(A21Rol_Id), new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T000N12_A21Rol_Id[0] < A21Rol_Id ) || ( T000N12_A21Rol_Id[0] == A21Rol_Id ) && ( T000N12_A18Pant_Id[0] < A18Pant_Id ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T000N12_A21Rol_Id[0] > A21Rol_Id ) || ( T000N12_A21Rol_Id[0] == A21Rol_Id ) && ( T000N12_A18Pant_Id[0] > A18Pant_Id ) ) )
         {
            A21Rol_Id = T000N12_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            A18Pant_Id = T000N12_A18Pant_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            RcdFound26 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound26 = (short)(0) ;
      /* Using cursor T000N13 */
      pr_default.execute(11, new Object[] {new Long(A21Rol_Id), new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T000N13_A21Rol_Id[0] > A21Rol_Id ) || ( T000N13_A21Rol_Id[0] == A21Rol_Id ) && ( T000N13_A18Pant_Id[0] > A18Pant_Id ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T000N13_A21Rol_Id[0] < A21Rol_Id ) || ( T000N13_A21Rol_Id[0] == A21Rol_Id ) && ( T000N13_A18Pant_Id[0] < A18Pant_Id ) ) )
         {
            A21Rol_Id = T000N13_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            A18Pant_Id = T000N13_A18Pant_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            RcdFound26 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0N26( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0N26( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound26 == 1 )
         {
            if ( ( A21Rol_Id != Z21Rol_Id ) || ( A18Pant_Id != Z18Pant_Id ) )
            {
               A21Rol_Id = Z21Rol_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
               A18Pant_Id = Z18Pant_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ROL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0N26( ) ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A21Rol_Id != Z21Rol_Id ) || ( A18Pant_Id != Z18Pant_Id ) )
            {
               /* Insert record */
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0N26( ) ;
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
                  GX_FocusControl = edtRol_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0N26( ) ;
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
      if ( ( A21Rol_Id != Z21Rol_Id ) || ( A18Pant_Id != Z18Pant_Id ) )
      {
         A21Rol_Id = Z21Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A18Pant_Id = Z18Pant_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0N26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000N2 */
         pr_default.execute(0, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL_PANTALLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z215RolP_UsuarioCrea, T000N2_A215RolP_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z217RolP_UsuarioModifica, T000N2_A217RolP_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z216RolP_FechaCrea, T000N2_A216RolP_FechaCrea[0]) ) || !( GXutil.dateCompare(Z218RolP_FechaModifica, T000N2_A218RolP_FechaModifica[0]) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_ROL_PANTALLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0N26( )
   {
      beforeValidate0N26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N26( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0N26( 0) ;
         checkOptimisticConcurrency0N26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N26( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0N26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000N14 */
                  pr_default.execute(12, new Object[] {A215RolP_UsuarioCrea, A217RolP_UsuarioModifica, A216RolP_FechaCrea, A218RolP_FechaModifica, new Long(A21Rol_Id), new Integer(A18Pant_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption0N0( ) ;
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
            load0N26( ) ;
         }
         endLevel0N26( ) ;
      }
      closeExtendedTableCursors0N26( ) ;
   }

   public void update0N26( )
   {
      beforeValidate0N26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N26( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N26( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0N26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000N15 */
                  pr_default.execute(13, new Object[] {A215RolP_UsuarioCrea, A217RolP_UsuarioModifica, A216RolP_FechaCrea, A218RolP_FechaModifica, new Long(A21Rol_Id), new Integer(A18Pant_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL_PANTALLA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0N26( ) ;
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
         endLevel0N26( ) ;
      }
      closeExtendedTableCursors0N26( ) ;
   }

   public void deferredUpdate0N26( )
   {
   }

   public void delete( )
   {
      beforeValidate0N26( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N26( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0N26( ) ;
         afterConfirm0N26( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0N26( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000N16 */
               pr_default.execute(14, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
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
      sMode26 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0N26( ) ;
      Gx_mode = sMode26 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0N26( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "SEG_ROL_PANTALLA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         /* Using cursor T000N17 */
         pr_default.execute(15, new Object[] {new Long(A21Rol_Id)});
         A22Rol_Descripcion = T000N17_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         pr_default.close(15);
         /* Using cursor T000N18 */
         pr_default.execute(16, new Object[] {new Integer(A18Pant_Id)});
         A19Pant_Descripcion = T000N18_A19Pant_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A16Modu_Id = T000N18_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         pr_default.close(16);
         /* Using cursor T000N19 */
         pr_default.execute(17, new Object[] {new Long(A16Modu_Id)});
         A17Modu_Descripcion = T000N19_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         pr_default.close(17);
      }
   }

   public void endLevel0N26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0N26( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_rol_pantalla");
         if ( AnyError == 0 )
         {
            confirmValues0N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_rol_pantalla");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0N26( )
   {
      /* Scan By routine */
      /* Using cursor T000N20 */
      pr_default.execute(18);
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A21Rol_Id = T000N20_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A18Pant_Id = T000N20_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0N26( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A21Rol_Id = T000N20_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A18Pant_Id = T000N20_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
   }

   public void scanEnd0N26( )
   {
      pr_default.close(18);
   }

   public void afterConfirm0N26( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A215RolP_UsuarioCrea = AV9Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A215RolP_UsuarioCrea", A215RolP_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A217RolP_UsuarioModifica = AV9Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A217RolP_UsuarioModifica", A217RolP_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A216RolP_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A216RolP_FechaCrea", localUtil.ttoc( A216RolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A218RolP_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A218RolP_FechaModifica", localUtil.ttoc( A218RolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
   }

   public void beforeInsert0N26( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0N26( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0N26( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0N26( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0N26( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0N26( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), true);
      edtPant_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      edtPant_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Descripcion_Enabled, 5, 0)), true);
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      edtModu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Descripcion_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0N0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416253");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_rol_pantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Rol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11Pant_Id,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z18Pant_Id", GXutil.ltrim( localUtil.ntoc( Z18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z215RolP_UsuarioCrea", Z215RolP_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z217RolP_UsuarioModifica", Z217RolP_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z216RolP_FechaCrea", localUtil.ttoc( Z216RolP_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z218RolP_FechaModifica", localUtil.ttoc( Z218RolP_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV7TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV7TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vROL_ID", GXutil.ltrim( localUtil.ntoc( AV10Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPANT_ID", GXutil.ltrim( localUtil.ntoc( AV11Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOCREA", A215RolP_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOMODIFICA", A217RolP_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHACREA", localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHAMODIFICA", localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Rol_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPANT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Pant_Id), "ZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_ROL_PANTALLA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_rol_pantalla:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_rol_pantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Rol_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11Pant_Id,6,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_ROL_PANTALLA" ;
   }

   public String getPgmdesc( )
   {
      return "Roles y pantallas" ;
   }

   public void initializeNonKey0N26( )
   {
      A215RolP_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A215RolP_UsuarioCrea", A215RolP_UsuarioCrea);
      A217RolP_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A217RolP_UsuarioModifica", A217RolP_UsuarioModifica);
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A216RolP_FechaCrea", localUtil.ttoc( A216RolP_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A218RolP_FechaModifica", localUtil.ttoc( A218RolP_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A22Rol_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
      A19Pant_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
      A16Modu_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      A17Modu_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      Z215RolP_UsuarioCrea = "" ;
      Z217RolP_UsuarioModifica = "" ;
      Z216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll0N26( )
   {
      A21Rol_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      A18Pant_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      initializeNonKey0N26( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416261");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_rol_pantalla.js", "?20186141416261");
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
      edtPant_Id_Internalname = "PANT_ID" ;
      edtPant_Descripcion_Internalname = "PANT_DESCRIPCION" ;
      edtModu_Id_Internalname = "MODU_ID" ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_21_Internalname = "PROMPT_21" ;
      imgprompt_18_Internalname = "PROMPT_18" ;
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
      Form.setCaption( "Roles y pantallas" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Descripcion_Enabled = 0 ;
      edtModu_Id_Jsonclick = "" ;
      edtModu_Id_Enabled = 0 ;
      edtPant_Descripcion_Jsonclick = "" ;
      edtPant_Descripcion_Enabled = 0 ;
      imgprompt_18_Visible = 1 ;
      imgprompt_18_Link = "" ;
      edtPant_Id_Jsonclick = "" ;
      edtPant_Id_Enabled = 1 ;
      edtRol_Descripcion_Jsonclick = "" ;
      edtRol_Descripcion_Enabled = 0 ;
      imgprompt_21_Visible = 1 ;
      imgprompt_21_Link = "" ;
      edtRol_Id_Jsonclick = "" ;
      edtRol_Id_Enabled = 1 ;
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

   public void valid_Rol_id( long GX_Parm1 ,
                             String GX_Parm2 )
   {
      A21Rol_Id = GX_Parm1 ;
      A22Rol_Descripcion = GX_Parm2 ;
      /* Using cursor T000N17 */
      pr_default.execute(15, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
      }
      A22Rol_Descripcion = T000N17_A22Rol_Descripcion[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A22Rol_Descripcion = "" ;
      }
      isValidOutput.add(A22Rol_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Pant_id( int GX_Parm1 ,
                              long GX_Parm2 ,
                              String GX_Parm3 ,
                              String GX_Parm4 )
   {
      A18Pant_Id = GX_Parm1 ;
      A16Modu_Id = GX_Parm2 ;
      A19Pant_Descripcion = GX_Parm3 ;
      A17Modu_Descripcion = GX_Parm4 ;
      /* Using cursor T000N18 */
      pr_default.execute(16, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
      }
      A19Pant_Descripcion = T000N18_A19Pant_Descripcion[0] ;
      A16Modu_Id = T000N18_A16Modu_Id[0] ;
      pr_default.close(16);
      /* Using cursor T000N19 */
      pr_default.execute(17, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000N19_A17Modu_Descripcion[0] ;
      pr_default.close(17);
      if ( ( A18Pant_Id == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar las pantallas a las que tiene acceso el Rol", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A19Pant_Descripcion = "" ;
         A16Modu_Id = 0 ;
         A17Modu_Descripcion = "" ;
      }
      isValidOutput.add(A19Pant_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A17Modu_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10Rol_Id',fld:'vROL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV11Pant_Id',fld:'vPANT_ID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120N2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z215RolP_UsuarioCrea = "" ;
      Z217RolP_UsuarioModifica = "" ;
      Z216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
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
      sImgUrl = "" ;
      A22Rol_Descripcion = "" ;
      A19Pant_Descripcion = "" ;
      A17Modu_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A215RolP_UsuarioCrea = "" ;
      A217RolP_UsuarioModifica = "" ;
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV14Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode26 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9Usuario = "" ;
      AV8WebSession = httpContext.getWebSession();
      AV7TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      Z22Rol_Descripcion = "" ;
      Z19Pant_Descripcion = "" ;
      Z17Modu_Descripcion = "" ;
      T000N4_A22Rol_Descripcion = new String[] {""} ;
      T000N5_A19Pant_Descripcion = new String[] {""} ;
      T000N5_A16Modu_Id = new long[1] ;
      T000N6_A17Modu_Descripcion = new String[] {""} ;
      T000N7_A215RolP_UsuarioCrea = new String[] {""} ;
      T000N7_A217RolP_UsuarioModifica = new String[] {""} ;
      T000N7_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000N7_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000N7_A22Rol_Descripcion = new String[] {""} ;
      T000N7_A19Pant_Descripcion = new String[] {""} ;
      T000N7_A17Modu_Descripcion = new String[] {""} ;
      T000N7_A21Rol_Id = new long[1] ;
      T000N7_A18Pant_Id = new int[1] ;
      T000N7_A16Modu_Id = new long[1] ;
      T000N8_A22Rol_Descripcion = new String[] {""} ;
      T000N9_A19Pant_Descripcion = new String[] {""} ;
      T000N9_A16Modu_Id = new long[1] ;
      T000N10_A17Modu_Descripcion = new String[] {""} ;
      T000N11_A21Rol_Id = new long[1] ;
      T000N11_A18Pant_Id = new int[1] ;
      T000N3_A215RolP_UsuarioCrea = new String[] {""} ;
      T000N3_A217RolP_UsuarioModifica = new String[] {""} ;
      T000N3_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_A21Rol_Id = new long[1] ;
      T000N3_A18Pant_Id = new int[1] ;
      T000N12_A21Rol_Id = new long[1] ;
      T000N12_A18Pant_Id = new int[1] ;
      T000N13_A21Rol_Id = new long[1] ;
      T000N13_A18Pant_Id = new int[1] ;
      T000N2_A215RolP_UsuarioCrea = new String[] {""} ;
      T000N2_A217RolP_UsuarioModifica = new String[] {""} ;
      T000N2_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_A21Rol_Id = new long[1] ;
      T000N2_A18Pant_Id = new int[1] ;
      T000N17_A22Rol_Descripcion = new String[] {""} ;
      T000N18_A19Pant_Descripcion = new String[] {""} ;
      T000N18_A16Modu_Id = new long[1] ;
      T000N19_A17Modu_Descripcion = new String[] {""} ;
      T000N20_A21Rol_Id = new long[1] ;
      T000N20_A18Pant_Id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_rol_pantalla__default(),
         new Object[] {
             new Object[] {
            T000N2_A215RolP_UsuarioCrea, T000N2_A217RolP_UsuarioModifica, T000N2_A216RolP_FechaCrea, T000N2_A218RolP_FechaModifica, T000N2_A21Rol_Id, T000N2_A18Pant_Id
            }
            , new Object[] {
            T000N3_A215RolP_UsuarioCrea, T000N3_A217RolP_UsuarioModifica, T000N3_A216RolP_FechaCrea, T000N3_A218RolP_FechaModifica, T000N3_A21Rol_Id, T000N3_A18Pant_Id
            }
            , new Object[] {
            T000N4_A22Rol_Descripcion
            }
            , new Object[] {
            T000N5_A19Pant_Descripcion, T000N5_A16Modu_Id
            }
            , new Object[] {
            T000N6_A17Modu_Descripcion
            }
            , new Object[] {
            T000N7_A215RolP_UsuarioCrea, T000N7_A217RolP_UsuarioModifica, T000N7_A216RolP_FechaCrea, T000N7_A218RolP_FechaModifica, T000N7_A22Rol_Descripcion, T000N7_A19Pant_Descripcion, T000N7_A17Modu_Descripcion, T000N7_A21Rol_Id, T000N7_A18Pant_Id, T000N7_A16Modu_Id
            }
            , new Object[] {
            T000N8_A22Rol_Descripcion
            }
            , new Object[] {
            T000N9_A19Pant_Descripcion, T000N9_A16Modu_Id
            }
            , new Object[] {
            T000N10_A17Modu_Descripcion
            }
            , new Object[] {
            T000N11_A21Rol_Id, T000N11_A18Pant_Id
            }
            , new Object[] {
            T000N12_A21Rol_Id, T000N12_A18Pant_Id
            }
            , new Object[] {
            T000N13_A21Rol_Id, T000N13_A18Pant_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000N17_A22Rol_Descripcion
            }
            , new Object[] {
            T000N18_A19Pant_Descripcion, T000N18_A16Modu_Id
            }
            , new Object[] {
            T000N19_A17Modu_Descripcion
            }
            , new Object[] {
            T000N20_A21Rol_Id, T000N20_A18Pant_Id
            }
         }
      );
      AV14Pgmname = "SEG_ROL_PANTALLA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound26 ;
   private int wcpOAV11Pant_Id ;
   private int Z18Pant_Id ;
   private int A18Pant_Id ;
   private int AV11Pant_Id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRol_Id_Enabled ;
   private int imgprompt_21_Visible ;
   private int edtRol_Descripcion_Enabled ;
   private int edtPant_Id_Enabled ;
   private int imgprompt_18_Visible ;
   private int edtPant_Descripcion_Enabled ;
   private int edtModu_Id_Enabled ;
   private int edtModu_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV10Rol_Id ;
   private long Z21Rol_Id ;
   private long A21Rol_Id ;
   private long A16Modu_Id ;
   private long AV10Rol_Id ;
   private long Z16Modu_Id ;
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
   private String edtRol_Id_Internalname ;
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
   private String edtRol_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_21_Internalname ;
   private String imgprompt_21_Link ;
   private String edtRol_Descripcion_Internalname ;
   private String edtRol_Descripcion_Jsonclick ;
   private String edtPant_Id_Internalname ;
   private String edtPant_Id_Jsonclick ;
   private String imgprompt_18_Internalname ;
   private String imgprompt_18_Link ;
   private String edtPant_Descripcion_Internalname ;
   private String edtPant_Descripcion_Jsonclick ;
   private String edtModu_Id_Internalname ;
   private String edtModu_Id_Jsonclick ;
   private String edtModu_Descripcion_Internalname ;
   private String edtModu_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV14Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode26 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z216RolP_FechaCrea ;
   private java.util.Date Z218RolP_FechaModifica ;
   private java.util.Date A216RolP_FechaCrea ;
   private java.util.Date A218RolP_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String Z215RolP_UsuarioCrea ;
   private String Z217RolP_UsuarioModifica ;
   private String A22Rol_Descripcion ;
   private String A19Pant_Descripcion ;
   private String A17Modu_Descripcion ;
   private String A215RolP_UsuarioCrea ;
   private String A217RolP_UsuarioModifica ;
   private String AV9Usuario ;
   private String Z22Rol_Descripcion ;
   private String Z19Pant_Descripcion ;
   private String Z17Modu_Descripcion ;
   private com.genexus.webpanels.WebSession AV8WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000N4_A22Rol_Descripcion ;
   private String[] T000N5_A19Pant_Descripcion ;
   private long[] T000N5_A16Modu_Id ;
   private String[] T000N6_A17Modu_Descripcion ;
   private String[] T000N7_A215RolP_UsuarioCrea ;
   private String[] T000N7_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000N7_A216RolP_FechaCrea ;
   private java.util.Date[] T000N7_A218RolP_FechaModifica ;
   private String[] T000N7_A22Rol_Descripcion ;
   private String[] T000N7_A19Pant_Descripcion ;
   private String[] T000N7_A17Modu_Descripcion ;
   private long[] T000N7_A21Rol_Id ;
   private int[] T000N7_A18Pant_Id ;
   private long[] T000N7_A16Modu_Id ;
   private String[] T000N8_A22Rol_Descripcion ;
   private String[] T000N9_A19Pant_Descripcion ;
   private long[] T000N9_A16Modu_Id ;
   private String[] T000N10_A17Modu_Descripcion ;
   private long[] T000N11_A21Rol_Id ;
   private int[] T000N11_A18Pant_Id ;
   private String[] T000N3_A215RolP_UsuarioCrea ;
   private String[] T000N3_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000N3_A216RolP_FechaCrea ;
   private java.util.Date[] T000N3_A218RolP_FechaModifica ;
   private long[] T000N3_A21Rol_Id ;
   private int[] T000N3_A18Pant_Id ;
   private long[] T000N12_A21Rol_Id ;
   private int[] T000N12_A18Pant_Id ;
   private long[] T000N13_A21Rol_Id ;
   private int[] T000N13_A18Pant_Id ;
   private String[] T000N2_A215RolP_UsuarioCrea ;
   private String[] T000N2_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000N2_A216RolP_FechaCrea ;
   private java.util.Date[] T000N2_A218RolP_FechaModifica ;
   private long[] T000N2_A21Rol_Id ;
   private int[] T000N2_A18Pant_Id ;
   private String[] T000N17_A22Rol_Descripcion ;
   private String[] T000N18_A19Pant_Descripcion ;
   private long[] T000N18_A16Modu_Id ;
   private String[] T000N19_A17Modu_Descripcion ;
   private long[] T000N20_A21Rol_Id ;
   private int[] T000N20_A18Pant_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV7TrnContext ;
}

final  class seg_rol_pantalla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000N2", "SELECT RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ?  FOR UPDATE OF RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N3", "SELECT RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N4", "SELECT Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N5", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N6", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N7", "SELECT /*+ FIRST_ROWS(100) */ TM1.RolP_UsuarioCrea, TM1.RolP_UsuarioModifica, TM1.RolP_FechaCrea, TM1.RolP_FechaModifica, T2.Rol_Descripcion, T3.Pant_Descripcion, T4.Modu_Descripcion, TM1.Rol_Id, TM1.Pant_Id, T3.Modu_Id FROM (((SEG_ROL_PANTALLA TM1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = TM1.Rol_Id) INNER JOIN SEG_PANTALLA T3 ON T3.Pant_Id = TM1.Pant_Id) INNER JOIN SEG_MODULO_MENU T4 ON T4.Modu_Id = T3.Modu_Id) WHERE TM1.Rol_Id = ? and TM1.Pant_Id = ? ORDER BY TM1.Rol_Id, TM1.Pant_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000N8", "SELECT Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N9", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N10", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N11", "SELECT /*+ FIRST_ROWS(1) */ Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE ( Rol_Id > ? or Rol_Id = ? and Pant_Id > ?) ORDER BY Rol_Id, Pant_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000N13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE ( Rol_Id < ? or Rol_Id = ? and Pant_Id < ?) ORDER BY Rol_Id DESC, Pant_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000N14", "INSERT INTO SEG_ROL_PANTALLA(RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Rol_Id, Pant_Id) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new UpdateCursor("T000N15", "UPDATE SEG_ROL_PANTALLA SET RolP_UsuarioCrea=?, RolP_UsuarioModifica=?, RolP_FechaCrea=?, RolP_FechaModifica=?  WHERE Rol_Id = ? AND Pant_Id = ?", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new UpdateCursor("T000N16", "DELETE FROM SEG_ROL_PANTALLA  WHERE Rol_Id = ? AND Pant_Id = ?", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new ForEachCursor("T000N17", "SELECT Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N18", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N19", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N20", "SELECT /*+ FIRST_ROWS(100) */ Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA ORDER BY Rol_Id, Pant_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((long[]) buf[9])[0] = rslt.getLong(10) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 18 :
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
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

