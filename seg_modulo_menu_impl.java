/*
               File: seg_modulo_menu_impl
        Description: Módulo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:57.27
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

public final  class seg_modulo_menu_impl extends GXDataArea
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
            AV7Modu_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Modu_Id", GXutil.ltrim( GXutil.str( AV7Modu_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODU_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Modu_Id), "ZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Módulo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtModu_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_modulo_menu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_modulo_menu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_modulo_menu_impl.class ));
   }

   public seg_modulo_menu_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Módulo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_MODULO_MENU.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_MODULO_MENU.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Id_Internalname, "Identificador Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")), ((edtModu_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Id_Jsonclick, 0, "Attribute", "", "", "", edtModu_Id_Visible, edtModu_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_MODULO_MENU.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Descripcion_Internalname, "Descripción Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Descripcion_Internalname, A17Modu_Descripcion, GXutil.rtrim( localUtil.format( A17Modu_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtModu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_MODULO_MENU.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_MODULO_MENU.htm");
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
      e110L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
            /* Read saved values. */
            Z16Modu_Id = localUtil.ctol( httpContext.cgiGet( "Z16Modu_Id"), ",", ".") ;
            Z195Modu_UsuarioCrea = httpContext.cgiGet( "Z195Modu_UsuarioCrea") ;
            Z197Modu_UsuarioModifica = httpContext.cgiGet( "Z197Modu_UsuarioModifica") ;
            Z196Modu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z196Modu_FechaCrea"), 0) ;
            Z198Modu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z198Modu_FechaModifica"), 0) ;
            Z17Modu_Descripcion = httpContext.cgiGet( "Z17Modu_Descripcion") ;
            A195Modu_UsuarioCrea = httpContext.cgiGet( "Z195Modu_UsuarioCrea") ;
            A197Modu_UsuarioModifica = httpContext.cgiGet( "Z197Modu_UsuarioModifica") ;
            A196Modu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z196Modu_FechaCrea"), 0) ;
            A198Modu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z198Modu_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7Modu_Id = localUtil.ctol( httpContext.cgiGet( "vMODU_ID"), ",", ".") ;
            AV10Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A195Modu_UsuarioCrea = httpContext.cgiGet( "MODU_USUARIOCREA") ;
            A197Modu_UsuarioModifica = httpContext.cgiGet( "MODU_USUARIOMODIFICA") ;
            A196Modu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "MODU_FECHACREA"), 0) ;
            A198Modu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "MODU_FECHAMODIFICA"), 0) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_MODULO_MENU" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A16Modu_Id != Z16Modu_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_modulo_menu:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A16Modu_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
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
                  sMode24 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode24 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound24 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0L0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MODU_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtModu_Id_Internalname ;
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
                        e110L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120L2 ();
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
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0L24( ) ;
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
         disableAttributes0L24( ) ;
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

   public void confirm_0L0( )
   {
      beforeValidate0L24( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0L24( ) ;
         }
         else
         {
            checkExtendedTable0L24( ) ;
            closeExtendedTableCursors0L24( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0L0( )
   {
   }

   public void e110L2( )
   {
      /* Start Routine */
      AV10Usuario = AV9WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Usuario", AV10Usuario);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV8TrnContext.fromxml(AV9WebSession.getValue("TrnContext"), null, null);
      edtModu_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtModu_Id_Visible, 5, 0)), true);
   }

   public void e120L2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV8TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_modulo_menu") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0L24( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z195Modu_UsuarioCrea = T000L3_A195Modu_UsuarioCrea[0] ;
            Z197Modu_UsuarioModifica = T000L3_A197Modu_UsuarioModifica[0] ;
            Z196Modu_FechaCrea = T000L3_A196Modu_FechaCrea[0] ;
            Z198Modu_FechaModifica = T000L3_A198Modu_FechaModifica[0] ;
            Z17Modu_Descripcion = T000L3_A17Modu_Descripcion[0] ;
         }
         else
         {
            Z195Modu_UsuarioCrea = A195Modu_UsuarioCrea ;
            Z197Modu_UsuarioModifica = A197Modu_UsuarioModifica ;
            Z196Modu_FechaCrea = A196Modu_FechaCrea ;
            Z198Modu_FechaModifica = A198Modu_FechaModifica ;
            Z17Modu_Descripcion = A17Modu_Descripcion ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z16Modu_Id = A16Modu_Id ;
         Z195Modu_UsuarioCrea = A195Modu_UsuarioCrea ;
         Z197Modu_UsuarioModifica = A197Modu_UsuarioModifica ;
         Z196Modu_FechaCrea = A196Modu_FechaCrea ;
         Z198Modu_FechaModifica = A198Modu_FechaModifica ;
         Z17Modu_Descripcion = A17Modu_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Modu_Id) )
      {
         A16Modu_Id = AV7Modu_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
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

   public void load0L24( )
   {
      /* Using cursor T000L4 */
      pr_default.execute(2, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A195Modu_UsuarioCrea = T000L4_A195Modu_UsuarioCrea[0] ;
         A197Modu_UsuarioModifica = T000L4_A197Modu_UsuarioModifica[0] ;
         A196Modu_FechaCrea = T000L4_A196Modu_FechaCrea[0] ;
         A198Modu_FechaModifica = T000L4_A198Modu_FechaModifica[0] ;
         A17Modu_Descripcion = T000L4_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         zm0L24( -8) ;
      }
      pr_default.close(2);
      onLoadActions0L24( ) ;
   }

   public void onLoadActions0L24( )
   {
      AV13Pgmname = "SEG_MODULO_MENU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0L24( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "SEG_MODULO_MENU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0L24( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0L24( )
   {
      /* Using cursor T000L5 */
      pr_default.execute(3, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound24 = (short)(1) ;
      }
      else
      {
         RcdFound24 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000L3 */
      pr_default.execute(1, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0L24( 8) ;
         RcdFound24 = (short)(1) ;
         A16Modu_Id = T000L3_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         A195Modu_UsuarioCrea = T000L3_A195Modu_UsuarioCrea[0] ;
         A197Modu_UsuarioModifica = T000L3_A197Modu_UsuarioModifica[0] ;
         A196Modu_FechaCrea = T000L3_A196Modu_FechaCrea[0] ;
         A198Modu_FechaModifica = T000L3_A198Modu_FechaModifica[0] ;
         A17Modu_Descripcion = T000L3_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         Z16Modu_Id = A16Modu_Id ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0L24( ) ;
         if ( AnyError == 1 )
         {
            RcdFound24 = (short)(0) ;
            initializeNonKey0L24( ) ;
         }
         Gx_mode = sMode24 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound24 = (short)(0) ;
         initializeNonKey0L24( ) ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode24 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0L24( ) ;
      if ( RcdFound24 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound24 = (short)(0) ;
      /* Using cursor T000L6 */
      pr_default.execute(4, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000L6_A16Modu_Id[0] < A16Modu_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000L6_A16Modu_Id[0] > A16Modu_Id ) ) )
         {
            A16Modu_Id = T000L6_A16Modu_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            RcdFound24 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound24 = (short)(0) ;
      /* Using cursor T000L7 */
      pr_default.execute(5, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000L7_A16Modu_Id[0] > A16Modu_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000L7_A16Modu_Id[0] < A16Modu_Id ) ) )
         {
            A16Modu_Id = T000L7_A16Modu_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            RcdFound24 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0L24( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtModu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0L24( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound24 == 1 )
         {
            if ( A16Modu_Id != Z16Modu_Id )
            {
               A16Modu_Id = Z16Modu_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MODU_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtModu_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtModu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0L24( ) ;
               GX_FocusControl = edtModu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A16Modu_Id != Z16Modu_Id )
            {
               /* Insert record */
               GX_FocusControl = edtModu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0L24( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MODU_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtModu_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtModu_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0L24( ) ;
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
      if ( A16Modu_Id != Z16Modu_Id )
      {
         A16Modu_Id = Z16Modu_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MODU_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtModu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0L24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000L2 */
         pr_default.execute(0, new Object[] {new Long(A16Modu_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_MODULO_MENU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z195Modu_UsuarioCrea, T000L2_A195Modu_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z197Modu_UsuarioModifica, T000L2_A197Modu_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z196Modu_FechaCrea, T000L2_A196Modu_FechaCrea[0]) ) || !( GXutil.dateCompare(Z198Modu_FechaModifica, T000L2_A198Modu_FechaModifica[0]) ) || ( GXutil.strcmp(Z17Modu_Descripcion, T000L2_A17Modu_Descripcion[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_MODULO_MENU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L24( )
   {
      beforeValidate0L24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L24( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L24( 0) ;
         checkOptimisticConcurrency0L24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L24( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L8 */
                  pr_default.execute(6, new Object[] {A195Modu_UsuarioCrea, A197Modu_UsuarioModifica, A196Modu_FechaCrea, A198Modu_FechaModifica, A17Modu_Descripcion});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000L9 */
                  pr_default.execute(7);
                  A16Modu_Id = T000L9_A16Modu_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_MODULO_MENU") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0L0( ) ;
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
            load0L24( ) ;
         }
         endLevel0L24( ) ;
      }
      closeExtendedTableCursors0L24( ) ;
   }

   public void update0L24( )
   {
      beforeValidate0L24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L24( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L24( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0L24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L10 */
                  pr_default.execute(8, new Object[] {A195Modu_UsuarioCrea, A197Modu_UsuarioModifica, A196Modu_FechaCrea, A198Modu_FechaModifica, A17Modu_Descripcion, new Long(A16Modu_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_MODULO_MENU") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_MODULO_MENU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0L24( ) ;
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
         endLevel0L24( ) ;
      }
      closeExtendedTableCursors0L24( ) ;
   }

   public void deferredUpdate0L24( )
   {
   }

   public void delete( )
   {
      beforeValidate0L24( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L24( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L24( ) ;
         afterConfirm0L24( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L24( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000L11 */
               pr_default.execute(9, new Object[] {new Long(A16Modu_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_MODULO_MENU") ;
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
      sMode24 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0L24( ) ;
      Gx_mode = sMode24 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0L24( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "SEG_MODULO_MENU" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000L12 */
         pr_default.execute(10, new Object[] {new Long(A16Modu_Id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"PANTALLA"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0L24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0L24( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_modulo_menu");
         if ( AnyError == 0 )
         {
            confirmValues0L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_modulo_menu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0L24( )
   {
      /* Scan By routine */
      /* Using cursor T000L13 */
      pr_default.execute(11);
      RcdFound24 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A16Modu_Id = T000L13_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0L24( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound24 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A16Modu_Id = T000L13_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      }
   }

   public void scanEnd0L24( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0L24( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A196Modu_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A196Modu_FechaCrea", localUtil.ttoc( A196Modu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A198Modu_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A198Modu_FechaModifica", localUtil.ttoc( A198Modu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A195Modu_UsuarioCrea = AV10Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A195Modu_UsuarioCrea", A195Modu_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A197Modu_UsuarioModifica = AV10Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A197Modu_UsuarioModifica", A197Modu_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(A17Modu_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del Módulo", 1, "MODU_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert0L24( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0L24( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0L24( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L24( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L24( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L24( )
   {
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      edtModu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Descripcion_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0L0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414155796");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_modulo_menu") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Modu_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z16Modu_Id", GXutil.ltrim( localUtil.ntoc( Z16Modu_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z195Modu_UsuarioCrea", Z195Modu_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z197Modu_UsuarioModifica", Z197Modu_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z196Modu_FechaCrea", localUtil.ttoc( Z196Modu_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z198Modu_FechaModifica", localUtil.ttoc( Z198Modu_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z17Modu_Descripcion", Z17Modu_Descripcion);
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODU_ID", GXutil.ltrim( localUtil.ntoc( AV7Modu_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV10Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_USUARIOCREA", A195Modu_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_USUARIOMODIFICA", A197Modu_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_FECHACREA", localUtil.ttoc( A196Modu_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_FECHAMODIFICA", localUtil.ttoc( A198Modu_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODU_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Modu_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_MODULO_MENU" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_modulo_menu:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_modulo_menu") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Modu_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_MODULO_MENU" ;
   }

   public String getPgmdesc( )
   {
      return "Módulo" ;
   }

   public void initializeNonKey0L24( )
   {
      A195Modu_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A195Modu_UsuarioCrea", A195Modu_UsuarioCrea);
      A197Modu_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A197Modu_UsuarioModifica", A197Modu_UsuarioModifica);
      A196Modu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A196Modu_FechaCrea", localUtil.ttoc( A196Modu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A198Modu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A198Modu_FechaModifica", localUtil.ttoc( A198Modu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A17Modu_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      Z195Modu_UsuarioCrea = "" ;
      Z197Modu_UsuarioModifica = "" ;
      Z196Modu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z198Modu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z17Modu_Descripcion = "" ;
   }

   public void initAll0L24( )
   {
      A16Modu_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      initializeNonKey0L24( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141415580");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_modulo_menu.js", "?20186141415580");
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
      edtModu_Id_Internalname = "MODU_ID" ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION" ;
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
      Form.setCaption( "Módulo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Descripcion_Enabled = 1 ;
      edtModu_Id_Jsonclick = "" ;
      edtModu_Id_Enabled = 0 ;
      edtModu_Id_Visible = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Modu_Id',fld:'vMODU_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120L2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV8TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z195Modu_UsuarioCrea = "" ;
      Z197Modu_UsuarioModifica = "" ;
      Z196Modu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z198Modu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z17Modu_Descripcion = "" ;
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
      A17Modu_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A195Modu_UsuarioCrea = "" ;
      A197Modu_UsuarioModifica = "" ;
      A196Modu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A198Modu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV10Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode24 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9WebSession = httpContext.getWebSession();
      AV8TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      T000L4_A16Modu_Id = new long[1] ;
      T000L4_A195Modu_UsuarioCrea = new String[] {""} ;
      T000L4_A197Modu_UsuarioModifica = new String[] {""} ;
      T000L4_A196Modu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000L4_A198Modu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000L4_A17Modu_Descripcion = new String[] {""} ;
      T000L5_A16Modu_Id = new long[1] ;
      T000L3_A16Modu_Id = new long[1] ;
      T000L3_A195Modu_UsuarioCrea = new String[] {""} ;
      T000L3_A197Modu_UsuarioModifica = new String[] {""} ;
      T000L3_A196Modu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000L3_A198Modu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000L3_A17Modu_Descripcion = new String[] {""} ;
      T000L6_A16Modu_Id = new long[1] ;
      T000L7_A16Modu_Id = new long[1] ;
      T000L2_A16Modu_Id = new long[1] ;
      T000L2_A195Modu_UsuarioCrea = new String[] {""} ;
      T000L2_A197Modu_UsuarioModifica = new String[] {""} ;
      T000L2_A196Modu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000L2_A198Modu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000L2_A17Modu_Descripcion = new String[] {""} ;
      T000L9_A16Modu_Id = new long[1] ;
      T000L12_A18Pant_Id = new int[1] ;
      T000L13_A16Modu_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_modulo_menu__default(),
         new Object[] {
             new Object[] {
            T000L2_A16Modu_Id, T000L2_A195Modu_UsuarioCrea, T000L2_A197Modu_UsuarioModifica, T000L2_A196Modu_FechaCrea, T000L2_A198Modu_FechaModifica, T000L2_A17Modu_Descripcion
            }
            , new Object[] {
            T000L3_A16Modu_Id, T000L3_A195Modu_UsuarioCrea, T000L3_A197Modu_UsuarioModifica, T000L3_A196Modu_FechaCrea, T000L3_A198Modu_FechaModifica, T000L3_A17Modu_Descripcion
            }
            , new Object[] {
            T000L4_A16Modu_Id, T000L4_A195Modu_UsuarioCrea, T000L4_A197Modu_UsuarioModifica, T000L4_A196Modu_FechaCrea, T000L4_A198Modu_FechaModifica, T000L4_A17Modu_Descripcion
            }
            , new Object[] {
            T000L5_A16Modu_Id
            }
            , new Object[] {
            T000L6_A16Modu_Id
            }
            , new Object[] {
            T000L7_A16Modu_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000L9_A16Modu_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000L12_A18Pant_Id
            }
            , new Object[] {
            T000L13_A16Modu_Id
            }
         }
      );
      AV13Pgmname = "SEG_MODULO_MENU" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound24 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtModu_Id_Enabled ;
   private int edtModu_Id_Visible ;
   private int edtModu_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7Modu_Id ;
   private long Z16Modu_Id ;
   private long AV7Modu_Id ;
   private long A16Modu_Id ;
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
   private String edtModu_Descripcion_Internalname ;
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
   private String edtModu_Id_Internalname ;
   private String edtModu_Id_Jsonclick ;
   private String edtModu_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode24 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z196Modu_FechaCrea ;
   private java.util.Date Z198Modu_FechaModifica ;
   private java.util.Date A196Modu_FechaCrea ;
   private java.util.Date A198Modu_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private String Z195Modu_UsuarioCrea ;
   private String Z197Modu_UsuarioModifica ;
   private String Z17Modu_Descripcion ;
   private String A17Modu_Descripcion ;
   private String A195Modu_UsuarioCrea ;
   private String A197Modu_UsuarioModifica ;
   private String AV10Usuario ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private IDataStoreProvider pr_default ;
   private long[] T000L4_A16Modu_Id ;
   private String[] T000L4_A195Modu_UsuarioCrea ;
   private String[] T000L4_A197Modu_UsuarioModifica ;
   private java.util.Date[] T000L4_A196Modu_FechaCrea ;
   private java.util.Date[] T000L4_A198Modu_FechaModifica ;
   private String[] T000L4_A17Modu_Descripcion ;
   private long[] T000L5_A16Modu_Id ;
   private long[] T000L3_A16Modu_Id ;
   private String[] T000L3_A195Modu_UsuarioCrea ;
   private String[] T000L3_A197Modu_UsuarioModifica ;
   private java.util.Date[] T000L3_A196Modu_FechaCrea ;
   private java.util.Date[] T000L3_A198Modu_FechaModifica ;
   private String[] T000L3_A17Modu_Descripcion ;
   private long[] T000L6_A16Modu_Id ;
   private long[] T000L7_A16Modu_Id ;
   private long[] T000L2_A16Modu_Id ;
   private String[] T000L2_A195Modu_UsuarioCrea ;
   private String[] T000L2_A197Modu_UsuarioModifica ;
   private java.util.Date[] T000L2_A196Modu_FechaCrea ;
   private java.util.Date[] T000L2_A198Modu_FechaModifica ;
   private String[] T000L2_A17Modu_Descripcion ;
   private long[] T000L9_A16Modu_Id ;
   private int[] T000L12_A18Pant_Id ;
   private long[] T000L13_A16Modu_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV8TrnContext ;
}

final  class seg_modulo_menu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000L2", "SELECT Modu_Id, Modu_UsuarioCrea, Modu_UsuarioModifica, Modu_FechaCrea, Modu_FechaModifica, Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ?  FOR UPDATE OF Modu_UsuarioCrea, Modu_UsuarioModifica, Modu_FechaCrea, Modu_FechaModifica, Modu_Descripcion NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L3", "SELECT Modu_Id, Modu_UsuarioCrea, Modu_UsuarioModifica, Modu_FechaCrea, Modu_FechaModifica, Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Modu_Id, TM1.Modu_UsuarioCrea, TM1.Modu_UsuarioModifica, TM1.Modu_FechaCrea, TM1.Modu_FechaModifica, TM1.Modu_Descripcion FROM SEG_MODULO_MENU TM1 WHERE TM1.Modu_Id = ? ORDER BY TM1.Modu_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000L5", "SELECT /*+ FIRST_ROWS(1) */ Modu_Id FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Modu_Id FROM SEG_MODULO_MENU WHERE ( Modu_Id > ?) ORDER BY Modu_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000L7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Modu_Id FROM SEG_MODULO_MENU WHERE ( Modu_Id < ?) ORDER BY Modu_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000L8", "INSERT INTO SEG_MODULO_MENU(Modu_UsuarioCrea, Modu_UsuarioModifica, Modu_FechaCrea, Modu_FechaModifica, Modu_Descripcion) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "SEG_MODULO_MENU")
         ,new ForEachCursor("T000L9", "SELECT Modu_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000L10", "UPDATE SEG_MODULO_MENU SET Modu_UsuarioCrea=?, Modu_UsuarioModifica=?, Modu_FechaCrea=?, Modu_FechaModifica=?, Modu_Descripcion=?  WHERE Modu_Id = ?", GX_NOMASK, "SEG_MODULO_MENU")
         ,new UpdateCursor("T000L11", "DELETE FROM SEG_MODULO_MENU  WHERE Modu_Id = ?", GX_NOMASK, "SEG_MODULO_MENU")
         ,new ForEachCursor("T000L12", "SELECT * FROM (SELECT Pant_Id FROM SEG_PANTALLA WHERE Modu_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000L13", "SELECT /*+ FIRST_ROWS(100) */ Modu_Id FROM SEG_MODULO_MENU ORDER BY Modu_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

