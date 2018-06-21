/*
               File: alm_inventario_devolutivo_impl
        Description: Inventario devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:29.76
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

public final  class alm_inventario_devolutivo_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A66Elem_Consecutivo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A37Cata_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A37Cata_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A34Clas_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A34Clas_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A43Cuen_Identificacion) ;
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
            AV14Elem_Consecutivo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Consecutivo", AV14Elem_Consecutivo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Elem_Consecutivo, ""))));
            AV7Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Invd_NumeroPlaca", AV7Invd_NumeroPlaca);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Invd_NumeroPlaca, ""))));
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
      cmbInvd_ModuloAlmacen.setName( "INVD_MODULOALMACEN" );
      cmbInvd_ModuloAlmacen.setWebtags( "" );
      cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
      cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
      cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
      cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
      if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
      {
         A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
      }
      cmbInvd_Estado.setName( "INVD_ESTADO" );
      cmbInvd_Estado.setWebtags( "" );
      cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
      cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
      if ( cmbInvd_Estado.getItemCount() > 0 )
      {
         A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
         n463Invd_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
      }
      cmbInvd_EntidadGobierno.setName( "INVD_ENTIDADGOBIERNO" );
      cmbInvd_EntidadGobierno.setWebtags( "" );
      cmbInvd_EntidadGobierno.addItem("", "", (short)(0));
      cmbInvd_EntidadGobierno.addItem("SI", "SI", (short)(0));
      cmbInvd_EntidadGobierno.addItem("NO", "NO", (short)(0));
      if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
      {
         A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
         n858Invd_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
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
         Form.getMeta().addItem("description", "Inventario devolutivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtElem_Consecutivo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_inventario_devolutivo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inventario_devolutivo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inventario_devolutivo_impl.class ));
   }

   public alm_inventario_devolutivo_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
      cmbInvd_EntidadGobierno = new HTMLChoice();
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
      if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
      {
         A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
      }
      if ( cmbInvd_Estado.getItemCount() > 0 )
      {
         A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
         n463Invd_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
      }
      if ( cmbInvd_EntidadGobierno.getItemCount() > 0 )
      {
         A858Invd_EntidadGobierno = cmbInvd_EntidadGobierno.getValidValue(A858Invd_EntidadGobierno) ;
         n858Invd_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Inventario devolutivo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx00g0"+"',["+"{Ctrl:gx.dom.el('"+"ELEM_CONSECUTIVO"+"'), id:'"+"ELEM_CONSECUTIVO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"INVD_NUMEROPLACA"+"'), id:'"+"INVD_NUMEROPLACA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_66_Internalname, sImgUrl, imgprompt_66_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_66_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, "", "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Codigo_Internalname, "Código Clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Descripcion_Internalname, "Descripción Clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtTipo_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_NumeroPlaca_Internalname, "de Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_NumeroPlaca_Internalname, A67Invd_NumeroPlaca, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_NumeroPlaca_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_NumeroPlaca_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_RegionalId_Internalname, "Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_RegionalId_Internalname, GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")), ((edtInvd_RegionalId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_RegionalId_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_RegionalId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_CentroCostoId_Internalname, "Centro Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_CentroCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")), ((edtInvd_CentroCostoId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_CentroCostoId_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_CentroCostoId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_ModuloAlmacen.getInternalname(), "Almacen", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_ModuloAlmacen, cmbInvd_ModuloAlmacen.getInternalname(), GXutil.rtrim( A412Invd_ModuloAlmacen), 1, cmbInvd_ModuloAlmacen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_ModuloAlmacen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_AlmacenCodigo_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_AlmacenCodigo_Internalname, A413Invd_AlmacenCodigo, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_AlmacenCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_AlmacenCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_BodegaCodigo_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_BodegaCodigo_Internalname, A414Invd_BodegaCodigo, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_BodegaCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_BodegaCodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_Estado, cmbInvd_Estado.getInternalname(), GXutil.rtrim( A463Invd_Estado), 1, cmbInvd_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_ValorAdquisicion_Internalname, "Adquisicion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_ValorAdquisicion_Internalname, GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ",", "")), ((edtInvd_ValorAdquisicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_ValorAdquisicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_ValorAdquisicion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_FechaAdquisicion_Internalname, "Adquisicion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtInvd_FechaAdquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_FechaAdquisicion_Internalname, localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"), localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_FechaAdquisicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_FechaAdquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtInvd_FechaAdquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInvd_FechaAdquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_PlacaPadre_Internalname, "Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_PlacaPadre_Internalname, A68Invd_PlacaPadre, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_PlacaPadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_PlacaPadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_EsPlacaPadre_Internalname, "Placa Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_EsPlacaPadre_Internalname, GXutil.rtrim( A501Invd_EsPlacaPadre), GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_EsPlacaPadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_EsPlacaPadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_FechaServicio_Internalname, "Servicio", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtInvd_FechaServicio_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_FechaServicio_Internalname, localUtil.format(A467Invd_FechaServicio, "99/99/99"), localUtil.format( A467Invd_FechaServicio, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_FechaServicio_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_FechaServicio_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtInvd_FechaServicio_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInvd_FechaServicio_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Identificacion_Internalname, "Identificación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Identificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Identificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Identificacion_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_43_Internalname, sImgUrl, imgprompt_43_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_43_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Cedula_Internalname, "Cuentadante Cedula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Nombre Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOtros_Costos_Dev_Internalname, "Costos Devolutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOtros_Costos_Dev_Internalname, GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ",", "")), ((edtOtros_Costos_Dev_Enabled!=0) ? GXutil.ltrim( localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOtros_Costos_Dev_Jsonclick, 0, "Attribute", "", "", "", 1, edtOtros_Costos_Dev_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Desmante_Internalname, "Desmantelamiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Desmante_Internalname, GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Desmante_Enabled!=0) ? GXutil.ltrim( localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Desmante_Jsonclick, 0, "Attribute", "", "", "", 1, edtCosto_Desmante_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_VF_Internalname, "futuro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_VF_Internalname, GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ",", "")), ((edtVariable_VF_Enabled!=0) ? GXutil.ltrim( localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_VF_Jsonclick, 0, "Attribute", "", "", "", 1, edtVariable_VF_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_I_Internalname, "Interes", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_I_Internalname, GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")), ((edtVariable_I_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_I_Jsonclick, 0, "Attribute", "", "", "", 1, edtVariable_I_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVariable_N_Internalname, "Tiempo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVariable_N_Internalname, GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")), ((edtVariable_N_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVariable_N_Jsonclick, 0, "Attribute", "", "", "", 1, edtVariable_N_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Total_Dev_Internalname, "Total Devolutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Total_Dev_Internalname, GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Total_Dev_Enabled!=0) ? GXutil.ltrim( localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Total_Dev_Jsonclick, 0, "Attribute", "", "", "", 1, edtCosto_Total_Dev_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Inicial_Internalname, "Util Inicial", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Inicial_Internalname, GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Inicial_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Inicial_Jsonclick, 0, "Attribute", "", "", "", 1, edtVida_Util_Inicial_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Actual_Internalname, "Util Actual", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Actual_Internalname, GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Actual_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Actual_Jsonclick, 0, "Attribute", "", "", "", 1, edtVida_Util_Actual_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_AreadanteCodigo_Internalname, "Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_AreadanteCodigo_Internalname, A711Invd_AreadanteCodigo, GXutil.rtrim( localUtil.format( A711Invd_AreadanteCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_AreadanteCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_AreadanteCodigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtInvd_PlacaRecuperada_Internalname, "Recuperada", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtInvd_PlacaRecuperada_Internalname, A818Invd_PlacaRecuperada, GXutil.rtrim( localUtil.format( A818Invd_PlacaRecuperada, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInvd_PlacaRecuperada_Jsonclick, 0, "Attribute", "", "", "", 1, edtInvd_PlacaRecuperada_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbInvd_EntidadGobierno.getInternalname(), "de Gobierno", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbInvd_EntidadGobierno, cmbInvd_EntidadGobierno.getInternalname(), GXutil.rtrim( A858Invd_EntidadGobierno), 1, cmbInvd_EntidadGobierno.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbInvd_EntidadGobierno.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "", true, "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         cmbInvd_EntidadGobierno.setValue( GXutil.rtrim( A858Invd_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_EntidadGobierno.getInternalname(), "Values", cmbInvd_EntidadGobierno.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INVENTARIO_DEVOLUTIVO.htm");
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
      e110D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
            A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
            A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
            A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INVD_REGIONALID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInvd_RegionalId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A410Invd_RegionalId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
            }
            else
            {
               A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INVD_CENTROCOSTOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInvd_CentroCostoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A411Invd_CentroCostoId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
            }
            else
            {
               A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
            }
            cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
            A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
            A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
            A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
            cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
            A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
            n463Invd_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
            n463Invd_Estado = ((GXutil.strcmp("", A463Invd_Estado)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INVD_VALORADQUISICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInvd_ValorAdquisicion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
               n465Invd_ValorAdquisicion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
            }
            else
            {
               A465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)) ;
               n465Invd_ValorAdquisicion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
            }
            n465Invd_ValorAdquisicion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A465Invd_ValorAdquisicion)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "INVD_FECHAADQUISICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInvd_FechaAdquisicion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A466Invd_FechaAdquisicion = GXutil.nullDate() ;
               n466Invd_FechaAdquisicion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            }
            else
            {
               A466Invd_FechaAdquisicion = localUtil.ctod( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 3) ;
               n466Invd_FechaAdquisicion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            }
            n466Invd_FechaAdquisicion = (GXutil.dateCompare(GXutil.nullDate(), A466Invd_FechaAdquisicion) ? true : false) ;
            A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
            n68Invd_PlacaPadre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
            n68Invd_PlacaPadre = ((GXutil.strcmp("", A68Invd_PlacaPadre)==0) ? true : false) ;
            A501Invd_EsPlacaPadre = httpContext.cgiGet( edtInvd_EsPlacaPadre_Internalname) ;
            n501Invd_EsPlacaPadre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
            n501Invd_EsPlacaPadre = ((GXutil.strcmp("", A501Invd_EsPlacaPadre)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtInvd_FechaServicio_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "INVD_FECHASERVICIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInvd_FechaServicio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A467Invd_FechaServicio = GXutil.nullDate() ;
               n467Invd_FechaServicio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
            }
            else
            {
               A467Invd_FechaServicio = localUtil.ctod( httpContext.cgiGet( edtInvd_FechaServicio_Internalname), 3) ;
               n467Invd_FechaServicio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
            }
            n467Invd_FechaServicio = (GXutil.dateCompare(GXutil.nullDate(), A467Invd_FechaServicio) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUEN_IDENTIFICACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_Identificacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A43Cuen_Identificacion = 0 ;
               n43Cuen_Identificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            }
            else
            {
               A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
               n43Cuen_Identificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            }
            n43Cuen_Identificacion = ((0==A43Cuen_Identificacion) ? true : false) ;
            A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
            n44Cuen_Nombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OTROS_COSTOS_DEV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOtros_Costos_Dev_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A628Otros_Costos_Dev = DecimalUtil.ZERO ;
               n628Otros_Costos_Dev = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
            }
            else
            {
               A628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)) ;
               n628Otros_Costos_Dev = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
            }
            n628Otros_Costos_Dev = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A628Otros_Costos_Dev)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTO_DESMANTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCosto_Desmante_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A624Costo_Desmante = DecimalUtil.ZERO ;
               n624Costo_Desmante = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
            }
            else
            {
               A624Costo_Desmante = localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)) ;
               n624Costo_Desmante = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
            }
            n624Costo_Desmante = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A624Costo_Desmante)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VARIABLE_VF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVariable_VF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A625Variable_VF = DecimalUtil.ZERO ;
               n625Variable_VF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
            }
            else
            {
               A625Variable_VF = localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)) ;
               n625Variable_VF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
            }
            n625Variable_VF = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A625Variable_VF)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VARIABLE_I");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVariable_I_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A626Variable_I = (short)(0) ;
               n626Variable_I = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
            }
            else
            {
               A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
               n626Variable_I = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
            }
            n626Variable_I = ((0==A626Variable_I) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VARIABLE_N");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVariable_N_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A627Variable_N = (short)(0) ;
               n627Variable_N = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
            }
            else
            {
               A627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".")) ;
               n627Variable_N = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
            }
            n627Variable_N = ((0==A627Variable_N) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTO_TOTAL_DEV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCosto_Total_Dev_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A629Costo_Total_Dev = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
            }
            else
            {
               A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VIDA_UTIL_INICIAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVida_Util_Inicial_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A630Vida_Util_Inicial = (short)(0) ;
               n630Vida_Util_Inicial = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
            }
            else
            {
               A630Vida_Util_Inicial = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".")) ;
               n630Vida_Util_Inicial = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
            }
            n630Vida_Util_Inicial = ((0==A630Vida_Util_Inicial) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VIDA_UTIL_ACTUAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVida_Util_Actual_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A631Vida_Util_Actual = (short)(0) ;
               n631Vida_Util_Actual = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
            }
            else
            {
               A631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".")) ;
               n631Vida_Util_Actual = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
            }
            n631Vida_Util_Actual = ((0==A631Vida_Util_Actual) ? true : false) ;
            A711Invd_AreadanteCodigo = httpContext.cgiGet( edtInvd_AreadanteCodigo_Internalname) ;
            n711Invd_AreadanteCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
            n711Invd_AreadanteCodigo = ((GXutil.strcmp("", A711Invd_AreadanteCodigo)==0) ? true : false) ;
            A818Invd_PlacaRecuperada = httpContext.cgiGet( edtInvd_PlacaRecuperada_Internalname) ;
            n818Invd_PlacaRecuperada = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
            n818Invd_PlacaRecuperada = ((GXutil.strcmp("", A818Invd_PlacaRecuperada)==0) ? true : false) ;
            cmbInvd_EntidadGobierno.setValue( httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) );
            A858Invd_EntidadGobierno = httpContext.cgiGet( cmbInvd_EntidadGobierno.getInternalname()) ;
            n858Invd_EntidadGobierno = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
            n858Invd_EntidadGobierno = ((GXutil.strcmp("", A858Invd_EntidadGobierno)==0) ? true : false) ;
            /* Read saved values. */
            Z66Elem_Consecutivo = httpContext.cgiGet( "Z66Elem_Consecutivo") ;
            Z67Invd_NumeroPlaca = httpContext.cgiGet( "Z67Invd_NumeroPlaca") ;
            Z410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( "Z410Invd_RegionalId"), ",", ".") ;
            Z411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( "Z411Invd_CentroCostoId"), ",", ".") ;
            Z412Invd_ModuloAlmacen = httpContext.cgiGet( "Z412Invd_ModuloAlmacen") ;
            Z413Invd_AlmacenCodigo = httpContext.cgiGet( "Z413Invd_AlmacenCodigo") ;
            Z414Invd_BodegaCodigo = httpContext.cgiGet( "Z414Invd_BodegaCodigo") ;
            Z463Invd_Estado = httpContext.cgiGet( "Z463Invd_Estado") ;
            n463Invd_Estado = ((GXutil.strcmp("", A463Invd_Estado)==0) ? true : false) ;
            Z465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( "Z465Invd_ValorAdquisicion")) ;
            n465Invd_ValorAdquisicion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A465Invd_ValorAdquisicion)==0) ? true : false) ;
            Z466Invd_FechaAdquisicion = localUtil.ctod( httpContext.cgiGet( "Z466Invd_FechaAdquisicion"), 0) ;
            n466Invd_FechaAdquisicion = (GXutil.dateCompare(GXutil.nullDate(), A466Invd_FechaAdquisicion) ? true : false) ;
            Z68Invd_PlacaPadre = httpContext.cgiGet( "Z68Invd_PlacaPadre") ;
            n68Invd_PlacaPadre = ((GXutil.strcmp("", A68Invd_PlacaPadre)==0) ? true : false) ;
            Z501Invd_EsPlacaPadre = httpContext.cgiGet( "Z501Invd_EsPlacaPadre") ;
            n501Invd_EsPlacaPadre = ((GXutil.strcmp("", A501Invd_EsPlacaPadre)==0) ? true : false) ;
            Z467Invd_FechaServicio = localUtil.ctod( httpContext.cgiGet( "Z467Invd_FechaServicio"), 0) ;
            n467Invd_FechaServicio = (GXutil.dateCompare(GXutil.nullDate(), A467Invd_FechaServicio) ? true : false) ;
            Z628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( "Z628Otros_Costos_Dev")) ;
            n628Otros_Costos_Dev = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A628Otros_Costos_Dev)==0) ? true : false) ;
            Z624Costo_Desmante = localUtil.ctond( httpContext.cgiGet( "Z624Costo_Desmante")) ;
            n624Costo_Desmante = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A624Costo_Desmante)==0) ? true : false) ;
            Z625Variable_VF = localUtil.ctond( httpContext.cgiGet( "Z625Variable_VF")) ;
            n625Variable_VF = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A625Variable_VF)==0) ? true : false) ;
            Z626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( "Z626Variable_I"), ",", ".")) ;
            n626Variable_I = ((0==A626Variable_I) ? true : false) ;
            Z627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( "Z627Variable_N"), ",", ".")) ;
            n627Variable_N = ((0==A627Variable_N) ? true : false) ;
            Z629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( "Z629Costo_Total_Dev")) ;
            Z630Vida_Util_Inicial = (short)(localUtil.ctol( httpContext.cgiGet( "Z630Vida_Util_Inicial"), ",", ".")) ;
            n630Vida_Util_Inicial = ((0==A630Vida_Util_Inicial) ? true : false) ;
            Z631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( "Z631Vida_Util_Actual"), ",", ".")) ;
            n631Vida_Util_Actual = ((0==A631Vida_Util_Actual) ? true : false) ;
            Z711Invd_AreadanteCodigo = httpContext.cgiGet( "Z711Invd_AreadanteCodigo") ;
            n711Invd_AreadanteCodigo = ((GXutil.strcmp("", A711Invd_AreadanteCodigo)==0) ? true : false) ;
            Z818Invd_PlacaRecuperada = httpContext.cgiGet( "Z818Invd_PlacaRecuperada") ;
            n818Invd_PlacaRecuperada = ((GXutil.strcmp("", A818Invd_PlacaRecuperada)==0) ? true : false) ;
            Z858Invd_EntidadGobierno = httpContext.cgiGet( "Z858Invd_EntidadGobierno") ;
            n858Invd_EntidadGobierno = ((GXutil.strcmp("", A858Invd_EntidadGobierno)==0) ? true : false) ;
            Z43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "Z43Cuen_Identificacion"), ",", ".") ;
            n43Cuen_Identificacion = ((0==A43Cuen_Identificacion) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "N43Cuen_Identificacion"), ",", ".") ;
            n43Cuen_Identificacion = ((0==A43Cuen_Identificacion) ? true : false) ;
            AV14Elem_Consecutivo = httpContext.cgiGet( "vELEM_CONSECUTIVO") ;
            AV7Invd_NumeroPlaca = httpContext.cgiGet( "vINVD_NUMEROPLACA") ;
            AV12Insert_Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "vINSERT_CUEN_IDENTIFICACION"), ",", ".") ;
            A37Cata_Codigo = httpContext.cgiGet( "CATA_CODIGO") ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_INVENTARIO_DEVOLUTIVO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( GXutil.strcmp(A67Invd_NumeroPlaca, Z67Invd_NumeroPlaca) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_inventario_devolutivo:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
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
                  sMode16 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode16 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound16 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0D0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ELEM_CONSECUTIVO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtElem_Consecutivo_Internalname ;
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
                        e110D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120D2 ();
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
         e120D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0D16( ) ;
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
         disableAttributes0D16( ) ;
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

   public void confirm_0D0( )
   {
      beforeValidate0D16( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0D16( ) ;
         }
         else
         {
            checkExtendedTable0D16( ) ;
            closeExtendedTableCursors0D16( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0D0( )
   {
   }

   public void e110D2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Insert_Cuen_Identificacion = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV12Insert_Cuen_Identificacion, 18, 0)));
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV16Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV17GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         while ( AV17GXV1 <= AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV17GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Cuen_Identificacion") == 0 )
            {
               AV12Insert_Cuen_Identificacion = GXutil.lval( AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV12Insert_Cuen_Identificacion, 18, 0)));
            }
            AV17GXV1 = (int)(AV17GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         }
      }
   }

   public void e120D2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_inventario_devolutivo") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0D16( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z410Invd_RegionalId = T000D3_A410Invd_RegionalId[0] ;
            Z411Invd_CentroCostoId = T000D3_A411Invd_CentroCostoId[0] ;
            Z412Invd_ModuloAlmacen = T000D3_A412Invd_ModuloAlmacen[0] ;
            Z413Invd_AlmacenCodigo = T000D3_A413Invd_AlmacenCodigo[0] ;
            Z414Invd_BodegaCodigo = T000D3_A414Invd_BodegaCodigo[0] ;
            Z463Invd_Estado = T000D3_A463Invd_Estado[0] ;
            Z465Invd_ValorAdquisicion = T000D3_A465Invd_ValorAdquisicion[0] ;
            Z466Invd_FechaAdquisicion = T000D3_A466Invd_FechaAdquisicion[0] ;
            Z68Invd_PlacaPadre = T000D3_A68Invd_PlacaPadre[0] ;
            Z501Invd_EsPlacaPadre = T000D3_A501Invd_EsPlacaPadre[0] ;
            Z467Invd_FechaServicio = T000D3_A467Invd_FechaServicio[0] ;
            Z628Otros_Costos_Dev = T000D3_A628Otros_Costos_Dev[0] ;
            Z624Costo_Desmante = T000D3_A624Costo_Desmante[0] ;
            Z625Variable_VF = T000D3_A625Variable_VF[0] ;
            Z626Variable_I = T000D3_A626Variable_I[0] ;
            Z627Variable_N = T000D3_A627Variable_N[0] ;
            Z629Costo_Total_Dev = T000D3_A629Costo_Total_Dev[0] ;
            Z630Vida_Util_Inicial = T000D3_A630Vida_Util_Inicial[0] ;
            Z631Vida_Util_Actual = T000D3_A631Vida_Util_Actual[0] ;
            Z711Invd_AreadanteCodigo = T000D3_A711Invd_AreadanteCodigo[0] ;
            Z818Invd_PlacaRecuperada = T000D3_A818Invd_PlacaRecuperada[0] ;
            Z858Invd_EntidadGobierno = T000D3_A858Invd_EntidadGobierno[0] ;
            Z43Cuen_Identificacion = T000D3_A43Cuen_Identificacion[0] ;
         }
         else
         {
            Z410Invd_RegionalId = A410Invd_RegionalId ;
            Z411Invd_CentroCostoId = A411Invd_CentroCostoId ;
            Z412Invd_ModuloAlmacen = A412Invd_ModuloAlmacen ;
            Z413Invd_AlmacenCodigo = A413Invd_AlmacenCodigo ;
            Z414Invd_BodegaCodigo = A414Invd_BodegaCodigo ;
            Z463Invd_Estado = A463Invd_Estado ;
            Z465Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
            Z466Invd_FechaAdquisicion = A466Invd_FechaAdquisicion ;
            Z68Invd_PlacaPadre = A68Invd_PlacaPadre ;
            Z501Invd_EsPlacaPadre = A501Invd_EsPlacaPadre ;
            Z467Invd_FechaServicio = A467Invd_FechaServicio ;
            Z628Otros_Costos_Dev = A628Otros_Costos_Dev ;
            Z624Costo_Desmante = A624Costo_Desmante ;
            Z625Variable_VF = A625Variable_VF ;
            Z626Variable_I = A626Variable_I ;
            Z627Variable_N = A627Variable_N ;
            Z629Costo_Total_Dev = A629Costo_Total_Dev ;
            Z630Vida_Util_Inicial = A630Vida_Util_Inicial ;
            Z631Vida_Util_Actual = A631Vida_Util_Actual ;
            Z711Invd_AreadanteCodigo = A711Invd_AreadanteCodigo ;
            Z818Invd_PlacaRecuperada = A818Invd_PlacaRecuperada ;
            Z858Invd_EntidadGobierno = A858Invd_EntidadGobierno ;
            Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z67Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
         Z410Invd_RegionalId = A410Invd_RegionalId ;
         Z411Invd_CentroCostoId = A411Invd_CentroCostoId ;
         Z412Invd_ModuloAlmacen = A412Invd_ModuloAlmacen ;
         Z413Invd_AlmacenCodigo = A413Invd_AlmacenCodigo ;
         Z414Invd_BodegaCodigo = A414Invd_BodegaCodigo ;
         Z463Invd_Estado = A463Invd_Estado ;
         Z465Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
         Z466Invd_FechaAdquisicion = A466Invd_FechaAdquisicion ;
         Z68Invd_PlacaPadre = A68Invd_PlacaPadre ;
         Z501Invd_EsPlacaPadre = A501Invd_EsPlacaPadre ;
         Z467Invd_FechaServicio = A467Invd_FechaServicio ;
         Z628Otros_Costos_Dev = A628Otros_Costos_Dev ;
         Z624Costo_Desmante = A624Costo_Desmante ;
         Z625Variable_VF = A625Variable_VF ;
         Z626Variable_I = A626Variable_I ;
         Z627Variable_N = A627Variable_N ;
         Z629Costo_Total_Dev = A629Costo_Total_Dev ;
         Z630Vida_Util_Inicial = A630Vida_Util_Inicial ;
         Z631Vida_Util_Actual = A631Vida_Util_Actual ;
         Z711Invd_AreadanteCodigo = A711Invd_AreadanteCodigo ;
         Z818Invd_PlacaRecuperada = A818Invd_PlacaRecuperada ;
         Z858Invd_EntidadGobierno = A858Invd_EntidadGobierno ;
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z37Cata_Codigo = A37Cata_Codigo ;
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         Z298Cata_Descripcion = A298Cata_Descripcion ;
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z291Clas_Descripcion = A291Clas_Descripcion ;
         Z688Cuen_Cedula = A688Cuen_Cedula ;
         Z44Cuen_Nombre = A44Cuen_Nombre ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_66_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00x0"+"',["+"{Ctrl:gx.dom.el('"+"ELEM_CONSECUTIVO"+"'), id:'"+"ELEM_CONSECUTIVO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_43_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"CUEN_IDENTIFICACION"+"'), id:'"+"CUEN_IDENTIFICACION"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV14Elem_Consecutivo)==0) )
      {
         A66Elem_Consecutivo = AV14Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      if ( ! (GXutil.strcmp("", AV14Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      else
      {
         edtElem_Consecutivo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV14Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7Invd_NumeroPlaca)==0) )
      {
         A67Invd_NumeroPlaca = AV7Invd_NumeroPlaca ;
         httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      }
      if ( ! (GXutil.strcmp("", AV7Invd_NumeroPlaca)==0) )
      {
         edtInvd_NumeroPlaca_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_NumeroPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_NumeroPlaca_Enabled, 5, 0)), true);
      }
      else
      {
         edtInvd_NumeroPlaca_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_NumeroPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_NumeroPlaca_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7Invd_NumeroPlaca)==0) )
      {
         edtInvd_NumeroPlaca_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_NumeroPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_NumeroPlaca_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Cuen_Identificacion) )
      {
         edtCuen_Identificacion_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      }
      else
      {
         edtCuen_Identificacion_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Cuen_Identificacion) )
      {
         A43Cuen_Identificacion = AV12Insert_Cuen_Identificacion ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T000D4 */
         pr_default.execute(2, new Object[] {A66Elem_Consecutivo});
         A37Cata_Codigo = T000D4_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = T000D4_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         pr_default.close(2);
         /* Using cursor T000D6 */
         pr_default.execute(4, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000D6_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = T000D6_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         pr_default.close(4);
         /* Using cursor T000D7 */
         pr_default.execute(5, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000D7_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         pr_default.close(5);
         AV16Pgmname = "ALM_INVENTARIO_DEVOLUTIVO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000D5 */
         pr_default.execute(3, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         A688Cuen_Cedula = T000D5_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A44Cuen_Nombre = T000D5_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T000D5_n44Cuen_Nombre[0] ;
         pr_default.close(3);
      }
   }

   public void load0D16( )
   {
      /* Using cursor T000D8 */
      pr_default.execute(6, new Object[] {A67Invd_NumeroPlaca, A66Elem_Consecutivo});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A37Cata_Codigo = T000D8_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = T000D8_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A291Clas_Descripcion = T000D8_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A410Invd_RegionalId = T000D8_A410Invd_RegionalId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
         A411Invd_CentroCostoId = T000D8_A411Invd_CentroCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
         A412Invd_ModuloAlmacen = T000D8_A412Invd_ModuloAlmacen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
         A413Invd_AlmacenCodigo = T000D8_A413Invd_AlmacenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
         A414Invd_BodegaCodigo = T000D8_A414Invd_BodegaCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
         A463Invd_Estado = T000D8_A463Invd_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
         n463Invd_Estado = T000D8_n463Invd_Estado[0] ;
         A465Invd_ValorAdquisicion = T000D8_A465Invd_ValorAdquisicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
         n465Invd_ValorAdquisicion = T000D8_n465Invd_ValorAdquisicion[0] ;
         A466Invd_FechaAdquisicion = T000D8_A466Invd_FechaAdquisicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
         n466Invd_FechaAdquisicion = T000D8_n466Invd_FechaAdquisicion[0] ;
         A68Invd_PlacaPadre = T000D8_A68Invd_PlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
         n68Invd_PlacaPadre = T000D8_n68Invd_PlacaPadre[0] ;
         A501Invd_EsPlacaPadre = T000D8_A501Invd_EsPlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
         n501Invd_EsPlacaPadre = T000D8_n501Invd_EsPlacaPadre[0] ;
         A467Invd_FechaServicio = T000D8_A467Invd_FechaServicio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
         n467Invd_FechaServicio = T000D8_n467Invd_FechaServicio[0] ;
         A688Cuen_Cedula = T000D8_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A44Cuen_Nombre = T000D8_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T000D8_n44Cuen_Nombre[0] ;
         A628Otros_Costos_Dev = T000D8_A628Otros_Costos_Dev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
         n628Otros_Costos_Dev = T000D8_n628Otros_Costos_Dev[0] ;
         A624Costo_Desmante = T000D8_A624Costo_Desmante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
         n624Costo_Desmante = T000D8_n624Costo_Desmante[0] ;
         A625Variable_VF = T000D8_A625Variable_VF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
         n625Variable_VF = T000D8_n625Variable_VF[0] ;
         A626Variable_I = T000D8_A626Variable_I[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
         n626Variable_I = T000D8_n626Variable_I[0] ;
         A627Variable_N = T000D8_A627Variable_N[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
         n627Variable_N = T000D8_n627Variable_N[0] ;
         A629Costo_Total_Dev = T000D8_A629Costo_Total_Dev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
         A630Vida_Util_Inicial = T000D8_A630Vida_Util_Inicial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
         n630Vida_Util_Inicial = T000D8_n630Vida_Util_Inicial[0] ;
         A631Vida_Util_Actual = T000D8_A631Vida_Util_Actual[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
         n631Vida_Util_Actual = T000D8_n631Vida_Util_Actual[0] ;
         A711Invd_AreadanteCodigo = T000D8_A711Invd_AreadanteCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
         n711Invd_AreadanteCodigo = T000D8_n711Invd_AreadanteCodigo[0] ;
         A818Invd_PlacaRecuperada = T000D8_A818Invd_PlacaRecuperada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
         n818Invd_PlacaRecuperada = T000D8_n818Invd_PlacaRecuperada[0] ;
         A858Invd_EntidadGobierno = T000D8_A858Invd_EntidadGobierno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
         n858Invd_EntidadGobierno = T000D8_n858Invd_EntidadGobierno[0] ;
         A43Cuen_Identificacion = T000D8_A43Cuen_Identificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         n43Cuen_Identificacion = T000D8_n43Cuen_Identificacion[0] ;
         A34Clas_Codigo = T000D8_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         A33Tipo_Codigo = T000D8_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         zm0D16( -12) ;
      }
      pr_default.close(6);
      onLoadActions0D16( ) ;
   }

   public void onLoadActions0D16( )
   {
      AV16Pgmname = "ALM_INVENTARIO_DEVOLUTIVO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable0D16( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV16Pgmname = "ALM_INVENTARIO_DEVOLUTIVO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      /* Using cursor T000D4 */
      pr_default.execute(2, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A37Cata_Codigo = T000D4_A37Cata_Codigo[0] ;
      A33Tipo_Codigo = T000D4_A33Tipo_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      pr_default.close(2);
      /* Using cursor T000D6 */
      pr_default.execute(4, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000D6_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = T000D6_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      pr_default.close(4);
      /* Using cursor T000D7 */
      pr_default.execute(5, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000D7_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      pr_default.close(5);
      /* Using cursor T000D9 */
      pr_default.execute(7, new Object[] {A67Invd_NumeroPlaca, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
      if ( (pr_default.getStatus(7) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Numero de Placa"}), 1, "INVD_NUMEROPLACA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInvd_NumeroPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T000D5 */
      pr_default.execute(3, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (0==A43Cuen_Identificacion) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "CUEN_IDENTIFICACION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCuen_Identificacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A688Cuen_Cedula = T000D5_A688Cuen_Cedula[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
      A44Cuen_Nombre = T000D5_A44Cuen_Nombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      n44Cuen_Nombre = T000D5_n44Cuen_Nombre[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors0D16( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A66Elem_Consecutivo )
   {
      /* Using cursor T000D10 */
      pr_default.execute(8, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A37Cata_Codigo = T000D10_A37Cata_Codigo[0] ;
      A33Tipo_Codigo = T000D10_A33Tipo_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A37Cata_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_16( String A37Cata_Codigo )
   {
      /* Using cursor T000D11 */
      pr_default.execute(9, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000D11_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = T000D11_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A298Cata_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A34Clas_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_17( String A34Clas_Codigo )
   {
      /* Using cursor T000D12 */
      pr_default.execute(10, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000D12_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A291Clas_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_15( long A43Cuen_Identificacion )
   {
      /* Using cursor T000D13 */
      pr_default.execute(11, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (0==A43Cuen_Identificacion) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "CUEN_IDENTIFICACION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCuen_Identificacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A688Cuen_Cedula = T000D13_A688Cuen_Cedula[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
      A44Cuen_Nombre = T000D13_A44Cuen_Nombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      n44Cuen_Nombre = T000D13_n44Cuen_Nombre[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A44Cuen_Nombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void getKey0D16( )
   {
      /* Using cursor T000D14 */
      pr_default.execute(12, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound16 = (short)(1) ;
      }
      else
      {
         RcdFound16 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000D3 */
      pr_default.execute(1, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0D16( 12) ;
         RcdFound16 = (short)(1) ;
         A67Invd_NumeroPlaca = T000D3_A67Invd_NumeroPlaca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
         A410Invd_RegionalId = T000D3_A410Invd_RegionalId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
         A411Invd_CentroCostoId = T000D3_A411Invd_CentroCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
         A412Invd_ModuloAlmacen = T000D3_A412Invd_ModuloAlmacen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
         A413Invd_AlmacenCodigo = T000D3_A413Invd_AlmacenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
         A414Invd_BodegaCodigo = T000D3_A414Invd_BodegaCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
         A463Invd_Estado = T000D3_A463Invd_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
         n463Invd_Estado = T000D3_n463Invd_Estado[0] ;
         A465Invd_ValorAdquisicion = T000D3_A465Invd_ValorAdquisicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
         n465Invd_ValorAdquisicion = T000D3_n465Invd_ValorAdquisicion[0] ;
         A466Invd_FechaAdquisicion = T000D3_A466Invd_FechaAdquisicion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
         n466Invd_FechaAdquisicion = T000D3_n466Invd_FechaAdquisicion[0] ;
         A68Invd_PlacaPadre = T000D3_A68Invd_PlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
         n68Invd_PlacaPadre = T000D3_n68Invd_PlacaPadre[0] ;
         A501Invd_EsPlacaPadre = T000D3_A501Invd_EsPlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
         n501Invd_EsPlacaPadre = T000D3_n501Invd_EsPlacaPadre[0] ;
         A467Invd_FechaServicio = T000D3_A467Invd_FechaServicio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
         n467Invd_FechaServicio = T000D3_n467Invd_FechaServicio[0] ;
         A628Otros_Costos_Dev = T000D3_A628Otros_Costos_Dev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
         n628Otros_Costos_Dev = T000D3_n628Otros_Costos_Dev[0] ;
         A624Costo_Desmante = T000D3_A624Costo_Desmante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
         n624Costo_Desmante = T000D3_n624Costo_Desmante[0] ;
         A625Variable_VF = T000D3_A625Variable_VF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
         n625Variable_VF = T000D3_n625Variable_VF[0] ;
         A626Variable_I = T000D3_A626Variable_I[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
         n626Variable_I = T000D3_n626Variable_I[0] ;
         A627Variable_N = T000D3_A627Variable_N[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
         n627Variable_N = T000D3_n627Variable_N[0] ;
         A629Costo_Total_Dev = T000D3_A629Costo_Total_Dev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
         A630Vida_Util_Inicial = T000D3_A630Vida_Util_Inicial[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
         n630Vida_Util_Inicial = T000D3_n630Vida_Util_Inicial[0] ;
         A631Vida_Util_Actual = T000D3_A631Vida_Util_Actual[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
         n631Vida_Util_Actual = T000D3_n631Vida_Util_Actual[0] ;
         A711Invd_AreadanteCodigo = T000D3_A711Invd_AreadanteCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
         n711Invd_AreadanteCodigo = T000D3_n711Invd_AreadanteCodigo[0] ;
         A818Invd_PlacaRecuperada = T000D3_A818Invd_PlacaRecuperada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
         n818Invd_PlacaRecuperada = T000D3_n818Invd_PlacaRecuperada[0] ;
         A858Invd_EntidadGobierno = T000D3_A858Invd_EntidadGobierno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
         n858Invd_EntidadGobierno = T000D3_n858Invd_EntidadGobierno[0] ;
         A66Elem_Consecutivo = T000D3_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A43Cuen_Identificacion = T000D3_A43Cuen_Identificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         n43Cuen_Identificacion = T000D3_n43Cuen_Identificacion[0] ;
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z67Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0D16( ) ;
         if ( AnyError == 1 )
         {
            RcdFound16 = (short)(0) ;
            initializeNonKey0D16( ) ;
         }
         Gx_mode = sMode16 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound16 = (short)(0) ;
         initializeNonKey0D16( ) ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode16 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0D16( ) ;
      if ( RcdFound16 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound16 = (short)(0) ;
      /* Using cursor T000D15 */
      pr_default.execute(13, new Object[] {A67Invd_NumeroPlaca, A67Invd_NumeroPlaca, A66Elem_Consecutivo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000D15_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) < 0 ) || ( GXutil.strcmp(T000D15_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(T000D15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000D15_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) > 0 ) || ( GXutil.strcmp(T000D15_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(T000D15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) ) )
         {
            A67Invd_NumeroPlaca = T000D15_A67Invd_NumeroPlaca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
            A66Elem_Consecutivo = T000D15_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            RcdFound16 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound16 = (short)(0) ;
      /* Using cursor T000D16 */
      pr_default.execute(14, new Object[] {A67Invd_NumeroPlaca, A67Invd_NumeroPlaca, A66Elem_Consecutivo});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T000D16_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) > 0 ) || ( GXutil.strcmp(T000D16_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(T000D16_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T000D16_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) < 0 ) || ( GXutil.strcmp(T000D16_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(T000D16_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) ) )
         {
            A67Invd_NumeroPlaca = T000D16_A67Invd_NumeroPlaca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
            A66Elem_Consecutivo = T000D16_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            RcdFound16 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0D16( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0D16( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound16 == 1 )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( GXutil.strcmp(A67Invd_NumeroPlaca, Z67Invd_NumeroPlaca) != 0 ) )
            {
               A66Elem_Consecutivo = Z66Elem_Consecutivo ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               A67Invd_NumeroPlaca = Z67Invd_NumeroPlaca ;
               httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ELEM_CONSECUTIVO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0D16( ) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( GXutil.strcmp(A67Invd_NumeroPlaca, Z67Invd_NumeroPlaca) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0D16( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ELEM_CONSECUTIVO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtElem_Consecutivo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtElem_Consecutivo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0D16( ) ;
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
      if ( ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( GXutil.strcmp(A67Invd_NumeroPlaca, Z67Invd_NumeroPlaca) != 0 ) )
      {
         A66Elem_Consecutivo = Z66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A67Invd_NumeroPlaca = Z67Invd_NumeroPlaca ;
         httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0D16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000D2 */
         pr_default.execute(0, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_INVENTARIO_DEVOLUTIVO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z410Invd_RegionalId != T000D2_A410Invd_RegionalId[0] ) || ( Z411Invd_CentroCostoId != T000D2_A411Invd_CentroCostoId[0] ) || ( GXutil.strcmp(Z412Invd_ModuloAlmacen, T000D2_A412Invd_ModuloAlmacen[0]) != 0 ) || ( GXutil.strcmp(Z413Invd_AlmacenCodigo, T000D2_A413Invd_AlmacenCodigo[0]) != 0 ) || ( GXutil.strcmp(Z414Invd_BodegaCodigo, T000D2_A414Invd_BodegaCodigo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z463Invd_Estado, T000D2_A463Invd_Estado[0]) != 0 ) || ( DecimalUtil.compareTo(Z465Invd_ValorAdquisicion, T000D2_A465Invd_ValorAdquisicion[0]) != 0 ) || !( GXutil.dateCompare(Z466Invd_FechaAdquisicion, T000D2_A466Invd_FechaAdquisicion[0]) ) || ( GXutil.strcmp(Z68Invd_PlacaPadre, T000D2_A68Invd_PlacaPadre[0]) != 0 ) || ( GXutil.strcmp(Z501Invd_EsPlacaPadre, T000D2_A501Invd_EsPlacaPadre[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z467Invd_FechaServicio, T000D2_A467Invd_FechaServicio[0]) ) || ( DecimalUtil.compareTo(Z628Otros_Costos_Dev, T000D2_A628Otros_Costos_Dev[0]) != 0 ) || ( DecimalUtil.compareTo(Z624Costo_Desmante, T000D2_A624Costo_Desmante[0]) != 0 ) || ( DecimalUtil.compareTo(Z625Variable_VF, T000D2_A625Variable_VF[0]) != 0 ) || ( Z626Variable_I != T000D2_A626Variable_I[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z627Variable_N != T000D2_A627Variable_N[0] ) || ( DecimalUtil.compareTo(Z629Costo_Total_Dev, T000D2_A629Costo_Total_Dev[0]) != 0 ) || ( Z630Vida_Util_Inicial != T000D2_A630Vida_Util_Inicial[0] ) || ( Z631Vida_Util_Actual != T000D2_A631Vida_Util_Actual[0] ) || ( GXutil.strcmp(Z711Invd_AreadanteCodigo, T000D2_A711Invd_AreadanteCodigo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z818Invd_PlacaRecuperada, T000D2_A818Invd_PlacaRecuperada[0]) != 0 ) || ( GXutil.strcmp(Z858Invd_EntidadGobierno, T000D2_A858Invd_EntidadGobierno[0]) != 0 ) || ( Z43Cuen_Identificacion != T000D2_A43Cuen_Identificacion[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_INVENTARIO_DEVOLUTIVO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0D16( )
   {
      beforeValidate0D16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D16( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0D16( 0) ;
         checkOptimisticConcurrency0D16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D16( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0D16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D17 */
                  pr_default.execute(15, new Object[] {A67Invd_NumeroPlaca, new Long(A410Invd_RegionalId), new Long(A411Invd_CentroCostoId), A412Invd_ModuloAlmacen, A413Invd_AlmacenCodigo, A414Invd_BodegaCodigo, new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n465Invd_ValorAdquisicion), A465Invd_ValorAdquisicion, new Boolean(n466Invd_FechaAdquisicion), A466Invd_FechaAdquisicion, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, new Boolean(n467Invd_FechaServicio), A467Invd_FechaServicio, new Boolean(n628Otros_Costos_Dev), A628Otros_Costos_Dev, new Boolean(n624Costo_Desmante), A624Costo_Desmante, new Boolean(n625Variable_VF), A625Variable_VF, new Boolean(n626Variable_I), new Short(A626Variable_I), new Boolean(n627Variable_N), new Short(A627Variable_N), A629Costo_Total_Dev, new Boolean(n630Vida_Util_Inicial), new Short(A630Vida_Util_Inicial), new Boolean(n631Vida_Util_Actual), new Short(A631Vida_Util_Actual), new Boolean(n711Invd_AreadanteCodigo), A711Invd_AreadanteCodigo, new Boolean(n818Invd_PlacaRecuperada), A818Invd_PlacaRecuperada, new Boolean(n858Invd_EntidadGobierno), A858Invd_EntidadGobierno, A66Elem_Consecutivo, new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
                  if ( (pr_default.getStatus(15) == 1) )
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
                        resetCaption0D0( ) ;
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
            load0D16( ) ;
         }
         endLevel0D16( ) ;
      }
      closeExtendedTableCursors0D16( ) ;
   }

   public void update0D16( )
   {
      beforeValidate0D16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D16( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D16( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0D16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D18 */
                  pr_default.execute(16, new Object[] {new Long(A410Invd_RegionalId), new Long(A411Invd_CentroCostoId), A412Invd_ModuloAlmacen, A413Invd_AlmacenCodigo, A414Invd_BodegaCodigo, new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n465Invd_ValorAdquisicion), A465Invd_ValorAdquisicion, new Boolean(n466Invd_FechaAdquisicion), A466Invd_FechaAdquisicion, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, new Boolean(n467Invd_FechaServicio), A467Invd_FechaServicio, new Boolean(n628Otros_Costos_Dev), A628Otros_Costos_Dev, new Boolean(n624Costo_Desmante), A624Costo_Desmante, new Boolean(n625Variable_VF), A625Variable_VF, new Boolean(n626Variable_I), new Short(A626Variable_I), new Boolean(n627Variable_N), new Short(A627Variable_N), A629Costo_Total_Dev, new Boolean(n630Vida_Util_Inicial), new Short(A630Vida_Util_Inicial), new Boolean(n631Vida_Util_Actual), new Short(A631Vida_Util_Actual), new Boolean(n711Invd_AreadanteCodigo), A711Invd_AreadanteCodigo, new Boolean(n818Invd_PlacaRecuperada), A818Invd_PlacaRecuperada, new Boolean(n858Invd_EntidadGobierno), A858Invd_EntidadGobierno, new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), A66Elem_Consecutivo, A67Invd_NumeroPlaca});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_INVENTARIO_DEVOLUTIVO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0D16( ) ;
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
         endLevel0D16( ) ;
      }
      closeExtendedTableCursors0D16( ) ;
   }

   public void deferredUpdate0D16( )
   {
   }

   public void delete( )
   {
      beforeValidate0D16( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D16( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0D16( ) ;
         afterConfirm0D16( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0D16( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000D19 */
               pr_default.execute(17, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
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
      sMode16 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0D16( ) ;
      Gx_mode = sMode16 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0D16( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "ALM_INVENTARIO_DEVOLUTIVO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000D20 */
         pr_default.execute(18, new Object[] {A66Elem_Consecutivo});
         A37Cata_Codigo = T000D20_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = T000D20_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         pr_default.close(18);
         /* Using cursor T000D21 */
         pr_default.execute(19, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000D21_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = T000D21_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         pr_default.close(19);
         /* Using cursor T000D22 */
         pr_default.execute(20, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000D22_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         pr_default.close(20);
         /* Using cursor T000D23 */
         pr_default.execute(21, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         A688Cuen_Cedula = T000D23_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A44Cuen_Nombre = T000D23_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T000D23_n44Cuen_Nombre[0] ;
         pr_default.close(21);
      }
   }

   public void endLevel0D16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0D16( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_inventario_devolutivo");
         if ( AnyError == 0 )
         {
            confirmValues0D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_inventario_devolutivo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0D16( )
   {
      /* Scan By routine */
      /* Using cursor T000D24 */
      pr_default.execute(22);
      RcdFound16 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A66Elem_Consecutivo = T000D24_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A67Invd_NumeroPlaca = T000D24_A67Invd_NumeroPlaca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0D16( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound16 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A66Elem_Consecutivo = T000D24_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A67Invd_NumeroPlaca = T000D24_A67Invd_NumeroPlaca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      }
   }

   public void scanEnd0D16( )
   {
      pr_default.close(22);
   }

   public void afterConfirm0D16( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0D16( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0D16( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0D16( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0D16( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0D16( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0D16( )
   {
      edtElem_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      edtCata_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Descripcion_Enabled, 5, 0)), true);
      edtClas_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      edtClas_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Descripcion_Enabled, 5, 0)), true);
      edtTipo_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      edtInvd_NumeroPlaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_NumeroPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_NumeroPlaca_Enabled, 5, 0)), true);
      edtInvd_RegionalId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_RegionalId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_RegionalId_Enabled, 5, 0)), true);
      edtInvd_CentroCostoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_CentroCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_CentroCostoId_Enabled, 5, 0)), true);
      cmbInvd_ModuloAlmacen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbInvd_ModuloAlmacen.getEnabled(), 5, 0)), true);
      edtInvd_AlmacenCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_AlmacenCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_AlmacenCodigo_Enabled, 5, 0)), true);
      edtInvd_BodegaCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_BodegaCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_BodegaCodigo_Enabled, 5, 0)), true);
      cmbInvd_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbInvd_Estado.getEnabled(), 5, 0)), true);
      edtInvd_ValorAdquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_ValorAdquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_ValorAdquisicion_Enabled, 5, 0)), true);
      edtInvd_FechaAdquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_FechaAdquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_FechaAdquisicion_Enabled, 5, 0)), true);
      edtInvd_PlacaPadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_PlacaPadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_PlacaPadre_Enabled, 5, 0)), true);
      edtInvd_EsPlacaPadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_EsPlacaPadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_EsPlacaPadre_Enabled, 5, 0)), true);
      edtInvd_FechaServicio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_FechaServicio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_FechaServicio_Enabled, 5, 0)), true);
      edtCuen_Identificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      edtCuen_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Enabled, 5, 0)), true);
      edtCuen_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Enabled, 5, 0)), true);
      edtOtros_Costos_Dev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOtros_Costos_Dev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOtros_Costos_Dev_Enabled, 5, 0)), true);
      edtCosto_Desmante_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosto_Desmante_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCosto_Desmante_Enabled, 5, 0)), true);
      edtVariable_VF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVariable_VF_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVariable_VF_Enabled, 5, 0)), true);
      edtVariable_I_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVariable_I_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVariable_I_Enabled, 5, 0)), true);
      edtVariable_N_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVariable_N_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVariable_N_Enabled, 5, 0)), true);
      edtCosto_Total_Dev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosto_Total_Dev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCosto_Total_Dev_Enabled, 5, 0)), true);
      edtVida_Util_Inicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVida_Util_Inicial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVida_Util_Inicial_Enabled, 5, 0)), true);
      edtVida_Util_Actual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVida_Util_Actual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVida_Util_Actual_Enabled, 5, 0)), true);
      edtInvd_AreadanteCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_AreadanteCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_AreadanteCodigo_Enabled, 5, 0)), true);
      edtInvd_PlacaRecuperada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInvd_PlacaRecuperada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtInvd_PlacaRecuperada_Enabled, 5, 0)), true);
      cmbInvd_EntidadGobierno.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbInvd_EntidadGobierno.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbInvd_EntidadGobierno.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0D0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414153366");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Invd_NumeroPlaca))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z66Elem_Consecutivo", Z66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z67Invd_NumeroPlaca", Z67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z410Invd_RegionalId", GXutil.ltrim( localUtil.ntoc( Z410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z411Invd_CentroCostoId", GXutil.ltrim( localUtil.ntoc( Z411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z412Invd_ModuloAlmacen", Z412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z413Invd_AlmacenCodigo", Z413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z414Invd_BodegaCodigo", Z414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z463Invd_Estado", Z463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z465Invd_ValorAdquisicion", GXutil.ltrim( localUtil.ntoc( Z465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z466Invd_FechaAdquisicion", localUtil.dtoc( Z466Invd_FechaAdquisicion, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z68Invd_PlacaPadre", Z68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z501Invd_EsPlacaPadre", GXutil.rtrim( Z501Invd_EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z467Invd_FechaServicio", localUtil.dtoc( Z467Invd_FechaServicio, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z628Otros_Costos_Dev", GXutil.ltrim( localUtil.ntoc( Z628Otros_Costos_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z624Costo_Desmante", GXutil.ltrim( localUtil.ntoc( Z624Costo_Desmante, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z625Variable_VF", GXutil.ltrim( localUtil.ntoc( Z625Variable_VF, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z626Variable_I", GXutil.ltrim( localUtil.ntoc( Z626Variable_I, (byte)(3), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z627Variable_N", GXutil.ltrim( localUtil.ntoc( Z627Variable_N, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z629Costo_Total_Dev", GXutil.ltrim( localUtil.ntoc( Z629Costo_Total_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z630Vida_Util_Inicial", GXutil.ltrim( localUtil.ntoc( Z630Vida_Util_Inicial, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z631Vida_Util_Actual", GXutil.ltrim( localUtil.ntoc( Z631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z711Invd_AreadanteCodigo", Z711Invd_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z818Invd_PlacaRecuperada", Z818Invd_PlacaRecuperada);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z858Invd_EntidadGobierno", Z858Invd_EntidadGobierno);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z43Cuen_Identificacion", GXutil.ltrim( localUtil.ntoc( Z43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N43Cuen_Identificacion", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV14Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_NUMEROPLACA", AV7Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV12Insert_Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Invd_NumeroPlaca, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_INVENTARIO_DEVOLUTIVO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_inventario_devolutivo:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_inventario_devolutivo") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Invd_NumeroPlaca)) ;
   }

   public String getPgmname( )
   {
      return "ALM_INVENTARIO_DEVOLUTIVO" ;
   }

   public String getPgmdesc( )
   {
      return "Inventario devolutivo" ;
   }

   public void initializeNonKey0D16( )
   {
      A37Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      A43Cuen_Identificacion = 0 ;
      n43Cuen_Identificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      n43Cuen_Identificacion = ((0==A43Cuen_Identificacion) ? true : false) ;
      A298Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      A291Clas_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A33Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      A410Invd_RegionalId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A410Invd_RegionalId", GXutil.ltrim( GXutil.str( A410Invd_RegionalId, 11, 0)));
      A411Invd_CentroCostoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A411Invd_CentroCostoId", GXutil.ltrim( GXutil.str( A411Invd_CentroCostoId, 11, 0)));
      A412Invd_ModuloAlmacen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A412Invd_ModuloAlmacen", A412Invd_ModuloAlmacen);
      A413Invd_AlmacenCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A413Invd_AlmacenCodigo", A413Invd_AlmacenCodigo);
      A414Invd_BodegaCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A414Invd_BodegaCodigo", A414Invd_BodegaCodigo);
      A463Invd_Estado = "" ;
      n463Invd_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A463Invd_Estado", A463Invd_Estado);
      n463Invd_Estado = ((GXutil.strcmp("", A463Invd_Estado)==0) ? true : false) ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      n465Invd_ValorAdquisicion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A465Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( A465Invd_ValorAdquisicion, 18, 2)));
      n465Invd_ValorAdquisicion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A465Invd_ValorAdquisicion)==0) ? true : false) ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      n466Invd_FechaAdquisicion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466Invd_FechaAdquisicion", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
      n466Invd_FechaAdquisicion = (GXutil.dateCompare(GXutil.nullDate(), A466Invd_FechaAdquisicion) ? true : false) ;
      A68Invd_PlacaPadre = "" ;
      n68Invd_PlacaPadre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A68Invd_PlacaPadre", A68Invd_PlacaPadre);
      n68Invd_PlacaPadre = ((GXutil.strcmp("", A68Invd_PlacaPadre)==0) ? true : false) ;
      A501Invd_EsPlacaPadre = "" ;
      n501Invd_EsPlacaPadre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A501Invd_EsPlacaPadre", A501Invd_EsPlacaPadre);
      n501Invd_EsPlacaPadre = ((GXutil.strcmp("", A501Invd_EsPlacaPadre)==0) ? true : false) ;
      A467Invd_FechaServicio = GXutil.nullDate() ;
      n467Invd_FechaServicio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467Invd_FechaServicio", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
      n467Invd_FechaServicio = (GXutil.dateCompare(GXutil.nullDate(), A467Invd_FechaServicio) ? true : false) ;
      A688Cuen_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
      A44Cuen_Nombre = "" ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      n628Otros_Costos_Dev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A628Otros_Costos_Dev", GXutil.ltrim( GXutil.str( A628Otros_Costos_Dev, 18, 2)));
      n628Otros_Costos_Dev = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A628Otros_Costos_Dev)==0) ? true : false) ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      n624Costo_Desmante = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A624Costo_Desmante", GXutil.ltrim( GXutil.str( A624Costo_Desmante, 18, 2)));
      n624Costo_Desmante = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A624Costo_Desmante)==0) ? true : false) ;
      A625Variable_VF = DecimalUtil.ZERO ;
      n625Variable_VF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A625Variable_VF", GXutil.ltrim( GXutil.str( A625Variable_VF, 18, 2)));
      n625Variable_VF = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A625Variable_VF)==0) ? true : false) ;
      A626Variable_I = (short)(0) ;
      n626Variable_I = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A626Variable_I", GXutil.ltrim( GXutil.str( A626Variable_I, 3, 0)));
      n626Variable_I = ((0==A626Variable_I) ? true : false) ;
      A627Variable_N = (short)(0) ;
      n627Variable_N = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A627Variable_N", GXutil.ltrim( GXutil.str( A627Variable_N, 4, 0)));
      n627Variable_N = ((0==A627Variable_N) ? true : false) ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A629Costo_Total_Dev", GXutil.ltrim( GXutil.str( A629Costo_Total_Dev, 18, 2)));
      A630Vida_Util_Inicial = (short)(0) ;
      n630Vida_Util_Inicial = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630Vida_Util_Inicial", GXutil.ltrim( GXutil.str( A630Vida_Util_Inicial, 4, 0)));
      n630Vida_Util_Inicial = ((0==A630Vida_Util_Inicial) ? true : false) ;
      A631Vida_Util_Actual = (short)(0) ;
      n631Vida_Util_Actual = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Vida_Util_Actual", GXutil.ltrim( GXutil.str( A631Vida_Util_Actual, 4, 0)));
      n631Vida_Util_Actual = ((0==A631Vida_Util_Actual) ? true : false) ;
      A711Invd_AreadanteCodigo = "" ;
      n711Invd_AreadanteCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A711Invd_AreadanteCodigo", A711Invd_AreadanteCodigo);
      n711Invd_AreadanteCodigo = ((GXutil.strcmp("", A711Invd_AreadanteCodigo)==0) ? true : false) ;
      A818Invd_PlacaRecuperada = "" ;
      n818Invd_PlacaRecuperada = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A818Invd_PlacaRecuperada", A818Invd_PlacaRecuperada);
      n818Invd_PlacaRecuperada = ((GXutil.strcmp("", A818Invd_PlacaRecuperada)==0) ? true : false) ;
      A858Invd_EntidadGobierno = "" ;
      n858Invd_EntidadGobierno = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A858Invd_EntidadGobierno", A858Invd_EntidadGobierno);
      n858Invd_EntidadGobierno = ((GXutil.strcmp("", A858Invd_EntidadGobierno)==0) ? true : false) ;
      Z410Invd_RegionalId = 0 ;
      Z411Invd_CentroCostoId = 0 ;
      Z412Invd_ModuloAlmacen = "" ;
      Z413Invd_AlmacenCodigo = "" ;
      Z414Invd_BodegaCodigo = "" ;
      Z463Invd_Estado = "" ;
      Z465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      Z466Invd_FechaAdquisicion = GXutil.nullDate() ;
      Z68Invd_PlacaPadre = "" ;
      Z501Invd_EsPlacaPadre = "" ;
      Z467Invd_FechaServicio = GXutil.nullDate() ;
      Z628Otros_Costos_Dev = DecimalUtil.ZERO ;
      Z624Costo_Desmante = DecimalUtil.ZERO ;
      Z625Variable_VF = DecimalUtil.ZERO ;
      Z626Variable_I = (short)(0) ;
      Z627Variable_N = (short)(0) ;
      Z629Costo_Total_Dev = DecimalUtil.ZERO ;
      Z630Vida_Util_Inicial = (short)(0) ;
      Z631Vida_Util_Actual = (short)(0) ;
      Z711Invd_AreadanteCodigo = "" ;
      Z818Invd_PlacaRecuperada = "" ;
      Z858Invd_EntidadGobierno = "" ;
      Z43Cuen_Identificacion = 0 ;
   }

   public void initAll0D16( )
   {
      A66Elem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      A67Invd_NumeroPlaca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A67Invd_NumeroPlaca", A67Invd_NumeroPlaca);
      initializeNonKey0D16( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414153384");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_inventario_devolutivo.js", "?201861414153384");
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
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA" ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO" );
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION" ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION" ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE" ;
      edtInvd_EsPlacaPadre_Internalname = "INVD_ESPLACAPADRE" ;
      edtInvd_FechaServicio_Internalname = "INVD_FECHASERVICIO" ;
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION" ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA" ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV" ;
      edtCosto_Desmante_Internalname = "COSTO_DESMANTE" ;
      edtVariable_VF_Internalname = "VARIABLE_VF" ;
      edtVariable_I_Internalname = "VARIABLE_I" ;
      edtVariable_N_Internalname = "VARIABLE_N" ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV" ;
      edtVida_Util_Inicial_Internalname = "VIDA_UTIL_INICIAL" ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL" ;
      edtInvd_AreadanteCodigo_Internalname = "INVD_AREADANTECODIGO" ;
      edtInvd_PlacaRecuperada_Internalname = "INVD_PLACARECUPERADA" ;
      cmbInvd_EntidadGobierno.setInternalname( "INVD_ENTIDADGOBIERNO" );
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_66_Internalname = "PROMPT_66" ;
      imgprompt_43_Internalname = "PROMPT_43" ;
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
      Form.setCaption( "Inventario devolutivo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbInvd_EntidadGobierno.setJsonclick( "" );
      cmbInvd_EntidadGobierno.setEnabled( 1 );
      edtInvd_PlacaRecuperada_Jsonclick = "" ;
      edtInvd_PlacaRecuperada_Enabled = 1 ;
      edtInvd_AreadanteCodigo_Jsonclick = "" ;
      edtInvd_AreadanteCodigo_Enabled = 1 ;
      edtVida_Util_Actual_Jsonclick = "" ;
      edtVida_Util_Actual_Enabled = 1 ;
      edtVida_Util_Inicial_Jsonclick = "" ;
      edtVida_Util_Inicial_Enabled = 1 ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtCosto_Total_Dev_Enabled = 1 ;
      edtVariable_N_Jsonclick = "" ;
      edtVariable_N_Enabled = 1 ;
      edtVariable_I_Jsonclick = "" ;
      edtVariable_I_Enabled = 1 ;
      edtVariable_VF_Jsonclick = "" ;
      edtVariable_VF_Enabled = 1 ;
      edtCosto_Desmante_Jsonclick = "" ;
      edtCosto_Desmante_Enabled = 1 ;
      edtOtros_Costos_Dev_Jsonclick = "" ;
      edtOtros_Costos_Dev_Enabled = 1 ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Enabled = 0 ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Cedula_Enabled = 0 ;
      imgprompt_43_Visible = 1 ;
      imgprompt_43_Link = "" ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtCuen_Identificacion_Enabled = 1 ;
      edtInvd_FechaServicio_Jsonclick = "" ;
      edtInvd_FechaServicio_Enabled = 1 ;
      edtInvd_EsPlacaPadre_Jsonclick = "" ;
      edtInvd_EsPlacaPadre_Enabled = 1 ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtInvd_PlacaPadre_Enabled = 1 ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtInvd_FechaAdquisicion_Enabled = 1 ;
      edtInvd_ValorAdquisicion_Jsonclick = "" ;
      edtInvd_ValorAdquisicion_Enabled = 1 ;
      cmbInvd_Estado.setJsonclick( "" );
      cmbInvd_Estado.setEnabled( 1 );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_BodegaCodigo_Enabled = 1 ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Enabled = 1 ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      cmbInvd_ModuloAlmacen.setEnabled( 1 );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_CentroCostoId_Enabled = 1 ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtInvd_RegionalId_Enabled = 1 ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Enabled = 1 ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 0 ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Enabled = 0 ;
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 0 ;
      edtCata_Descripcion_Enabled = 0 ;
      imgprompt_66_Visible = 1 ;
      imgprompt_66_Link = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 1 ;
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

   public void valid_Elem_consecutivo( String GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 ,
                                       long GX_Parm4 ,
                                       String GX_Parm5 ,
                                       String GX_Parm6 )
   {
      A66Elem_Consecutivo = GX_Parm1 ;
      A37Cata_Codigo = GX_Parm2 ;
      A34Clas_Codigo = GX_Parm3 ;
      A33Tipo_Codigo = GX_Parm4 ;
      A298Cata_Descripcion = GX_Parm5 ;
      A291Clas_Descripcion = GX_Parm6 ;
      /* Using cursor T000D20 */
      pr_default.execute(18, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
      }
      A37Cata_Codigo = T000D20_A37Cata_Codigo[0] ;
      A33Tipo_Codigo = T000D20_A33Tipo_Codigo[0] ;
      pr_default.close(18);
      /* Using cursor T000D21 */
      pr_default.execute(19, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000D21_A298Cata_Descripcion[0] ;
      A34Clas_Codigo = T000D21_A34Clas_Codigo[0] ;
      pr_default.close(19);
      /* Using cursor T000D22 */
      pr_default.execute(20, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000D22_A291Clas_Descripcion[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A37Cata_Codigo = "" ;
         A33Tipo_Codigo = 0 ;
         A298Cata_Descripcion = "" ;
         A34Clas_Codigo = "" ;
         A291Clas_Descripcion = "" ;
      }
      isValidOutput.add(A37Cata_Codigo);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A298Cata_Descripcion);
      isValidOutput.add(A34Clas_Codigo);
      isValidOutput.add(A291Clas_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Invd_numeroplaca( String GX_Parm1 ,
                                       String GX_Parm2 )
   {
      A67Invd_NumeroPlaca = GX_Parm1 ;
      A66Elem_Consecutivo = GX_Parm2 ;
      /* Using cursor T000D25 */
      pr_default.execute(23, new Object[] {A67Invd_NumeroPlaca, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
      if ( (pr_default.getStatus(23) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Numero de Placa"}), 1, "INVD_NUMEROPLACA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtInvd_NumeroPlaca_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Cuen_identificacion( long GX_Parm1 ,
                                          long GX_Parm2 ,
                                          String GX_Parm3 )
   {
      A43Cuen_Identificacion = GX_Parm1 ;
      n43Cuen_Identificacion = false ;
      A688Cuen_Cedula = GX_Parm2 ;
      A44Cuen_Nombre = GX_Parm3 ;
      n44Cuen_Nombre = false ;
      /* Using cursor T000D23 */
      pr_default.execute(21, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A43Cuen_Identificacion) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "CUEN_IDENTIFICACION");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCuen_Identificacion_Internalname ;
         }
      }
      A688Cuen_Cedula = T000D23_A688Cuen_Cedula[0] ;
      A44Cuen_Nombre = T000D23_A44Cuen_Nombre[0] ;
      n44Cuen_Nombre = T000D23_n44Cuen_Nombre[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A688Cuen_Cedula = 0 ;
         A44Cuen_Nombre = "" ;
         n44Cuen_Nombre = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A44Cuen_Nombre);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV14Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV7Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120D2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(21);
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV14Elem_Consecutivo = "" ;
      wcpOAV7Invd_NumeroPlaca = "" ;
      Z66Elem_Consecutivo = "" ;
      Z67Invd_NumeroPlaca = "" ;
      Z412Invd_ModuloAlmacen = "" ;
      Z413Invd_AlmacenCodigo = "" ;
      Z414Invd_BodegaCodigo = "" ;
      Z463Invd_Estado = "" ;
      Z465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      Z466Invd_FechaAdquisicion = GXutil.nullDate() ;
      Z68Invd_PlacaPadre = "" ;
      Z501Invd_EsPlacaPadre = "" ;
      Z467Invd_FechaServicio = GXutil.nullDate() ;
      Z628Otros_Costos_Dev = DecimalUtil.ZERO ;
      Z624Costo_Desmante = DecimalUtil.ZERO ;
      Z625Variable_VF = DecimalUtil.ZERO ;
      Z629Costo_Total_Dev = DecimalUtil.ZERO ;
      Z711Invd_AreadanteCodigo = "" ;
      Z818Invd_PlacaRecuperada = "" ;
      Z858Invd_EntidadGobierno = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A34Clas_Codigo = "" ;
      Gx_mode = "" ;
      AV14Elem_Consecutivo = "" ;
      AV7Invd_NumeroPlaca = "" ;
      GXKey = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A463Invd_Estado = "" ;
      A858Invd_EntidadGobierno = "" ;
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
      A298Cata_Descripcion = "" ;
      A291Clas_Descripcion = "" ;
      A67Invd_NumeroPlaca = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A68Invd_PlacaPadre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A467Invd_FechaServicio = GXutil.nullDate() ;
      A44Cuen_Nombre = "" ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A711Invd_AreadanteCodigo = "" ;
      A818Invd_PlacaRecuperada = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV16Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode16 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z37Cata_Codigo = "" ;
      Z298Cata_Descripcion = "" ;
      Z34Clas_Codigo = "" ;
      Z291Clas_Descripcion = "" ;
      Z44Cuen_Nombre = "" ;
      T000D4_A37Cata_Codigo = new String[] {""} ;
      T000D4_A33Tipo_Codigo = new long[1] ;
      T000D6_A298Cata_Descripcion = new String[] {""} ;
      T000D6_A34Clas_Codigo = new String[] {""} ;
      T000D7_A291Clas_Descripcion = new String[] {""} ;
      T000D5_A688Cuen_Cedula = new long[1] ;
      T000D5_A44Cuen_Nombre = new String[] {""} ;
      T000D5_n44Cuen_Nombre = new boolean[] {false} ;
      T000D8_A37Cata_Codigo = new String[] {""} ;
      T000D8_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D8_A298Cata_Descripcion = new String[] {""} ;
      T000D8_A291Clas_Descripcion = new String[] {""} ;
      T000D8_A410Invd_RegionalId = new long[1] ;
      T000D8_A411Invd_CentroCostoId = new long[1] ;
      T000D8_A412Invd_ModuloAlmacen = new String[] {""} ;
      T000D8_A413Invd_AlmacenCodigo = new String[] {""} ;
      T000D8_A414Invd_BodegaCodigo = new String[] {""} ;
      T000D8_A463Invd_Estado = new String[] {""} ;
      T000D8_n463Invd_Estado = new boolean[] {false} ;
      T000D8_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D8_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      T000D8_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      T000D8_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      T000D8_A68Invd_PlacaPadre = new String[] {""} ;
      T000D8_n68Invd_PlacaPadre = new boolean[] {false} ;
      T000D8_A501Invd_EsPlacaPadre = new String[] {""} ;
      T000D8_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      T000D8_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      T000D8_n467Invd_FechaServicio = new boolean[] {false} ;
      T000D8_A688Cuen_Cedula = new long[1] ;
      T000D8_A44Cuen_Nombre = new String[] {""} ;
      T000D8_n44Cuen_Nombre = new boolean[] {false} ;
      T000D8_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D8_n628Otros_Costos_Dev = new boolean[] {false} ;
      T000D8_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D8_n624Costo_Desmante = new boolean[] {false} ;
      T000D8_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D8_n625Variable_VF = new boolean[] {false} ;
      T000D8_A626Variable_I = new short[1] ;
      T000D8_n626Variable_I = new boolean[] {false} ;
      T000D8_A627Variable_N = new short[1] ;
      T000D8_n627Variable_N = new boolean[] {false} ;
      T000D8_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D8_A630Vida_Util_Inicial = new short[1] ;
      T000D8_n630Vida_Util_Inicial = new boolean[] {false} ;
      T000D8_A631Vida_Util_Actual = new short[1] ;
      T000D8_n631Vida_Util_Actual = new boolean[] {false} ;
      T000D8_A711Invd_AreadanteCodigo = new String[] {""} ;
      T000D8_n711Invd_AreadanteCodigo = new boolean[] {false} ;
      T000D8_A818Invd_PlacaRecuperada = new String[] {""} ;
      T000D8_n818Invd_PlacaRecuperada = new boolean[] {false} ;
      T000D8_A858Invd_EntidadGobierno = new String[] {""} ;
      T000D8_n858Invd_EntidadGobierno = new boolean[] {false} ;
      T000D8_A66Elem_Consecutivo = new String[] {""} ;
      T000D8_A43Cuen_Identificacion = new long[1] ;
      T000D8_n43Cuen_Identificacion = new boolean[] {false} ;
      T000D8_A34Clas_Codigo = new String[] {""} ;
      T000D8_A33Tipo_Codigo = new long[1] ;
      T000D9_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D10_A37Cata_Codigo = new String[] {""} ;
      T000D10_A33Tipo_Codigo = new long[1] ;
      T000D11_A298Cata_Descripcion = new String[] {""} ;
      T000D11_A34Clas_Codigo = new String[] {""} ;
      T000D12_A291Clas_Descripcion = new String[] {""} ;
      T000D13_A688Cuen_Cedula = new long[1] ;
      T000D13_A44Cuen_Nombre = new String[] {""} ;
      T000D13_n44Cuen_Nombre = new boolean[] {false} ;
      T000D14_A66Elem_Consecutivo = new String[] {""} ;
      T000D14_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D3_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D3_A410Invd_RegionalId = new long[1] ;
      T000D3_A411Invd_CentroCostoId = new long[1] ;
      T000D3_A412Invd_ModuloAlmacen = new String[] {""} ;
      T000D3_A413Invd_AlmacenCodigo = new String[] {""} ;
      T000D3_A414Invd_BodegaCodigo = new String[] {""} ;
      T000D3_A463Invd_Estado = new String[] {""} ;
      T000D3_n463Invd_Estado = new boolean[] {false} ;
      T000D3_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D3_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      T000D3_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      T000D3_A68Invd_PlacaPadre = new String[] {""} ;
      T000D3_n68Invd_PlacaPadre = new boolean[] {false} ;
      T000D3_A501Invd_EsPlacaPadre = new String[] {""} ;
      T000D3_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      T000D3_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n467Invd_FechaServicio = new boolean[] {false} ;
      T000D3_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D3_n628Otros_Costos_Dev = new boolean[] {false} ;
      T000D3_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D3_n624Costo_Desmante = new boolean[] {false} ;
      T000D3_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D3_n625Variable_VF = new boolean[] {false} ;
      T000D3_A626Variable_I = new short[1] ;
      T000D3_n626Variable_I = new boolean[] {false} ;
      T000D3_A627Variable_N = new short[1] ;
      T000D3_n627Variable_N = new boolean[] {false} ;
      T000D3_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D3_A630Vida_Util_Inicial = new short[1] ;
      T000D3_n630Vida_Util_Inicial = new boolean[] {false} ;
      T000D3_A631Vida_Util_Actual = new short[1] ;
      T000D3_n631Vida_Util_Actual = new boolean[] {false} ;
      T000D3_A711Invd_AreadanteCodigo = new String[] {""} ;
      T000D3_n711Invd_AreadanteCodigo = new boolean[] {false} ;
      T000D3_A818Invd_PlacaRecuperada = new String[] {""} ;
      T000D3_n818Invd_PlacaRecuperada = new boolean[] {false} ;
      T000D3_A858Invd_EntidadGobierno = new String[] {""} ;
      T000D3_n858Invd_EntidadGobierno = new boolean[] {false} ;
      T000D3_A66Elem_Consecutivo = new String[] {""} ;
      T000D3_A43Cuen_Identificacion = new long[1] ;
      T000D3_n43Cuen_Identificacion = new boolean[] {false} ;
      T000D15_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D15_A66Elem_Consecutivo = new String[] {""} ;
      T000D16_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D16_A66Elem_Consecutivo = new String[] {""} ;
      T000D2_A67Invd_NumeroPlaca = new String[] {""} ;
      T000D2_A410Invd_RegionalId = new long[1] ;
      T000D2_A411Invd_CentroCostoId = new long[1] ;
      T000D2_A412Invd_ModuloAlmacen = new String[] {""} ;
      T000D2_A413Invd_AlmacenCodigo = new String[] {""} ;
      T000D2_A414Invd_BodegaCodigo = new String[] {""} ;
      T000D2_A463Invd_Estado = new String[] {""} ;
      T000D2_n463Invd_Estado = new boolean[] {false} ;
      T000D2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      T000D2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      T000D2_A68Invd_PlacaPadre = new String[] {""} ;
      T000D2_n68Invd_PlacaPadre = new boolean[] {false} ;
      T000D2_A501Invd_EsPlacaPadre = new String[] {""} ;
      T000D2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      T000D2_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n467Invd_FechaServicio = new boolean[] {false} ;
      T000D2_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D2_n628Otros_Costos_Dev = new boolean[] {false} ;
      T000D2_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D2_n624Costo_Desmante = new boolean[] {false} ;
      T000D2_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D2_n625Variable_VF = new boolean[] {false} ;
      T000D2_A626Variable_I = new short[1] ;
      T000D2_n626Variable_I = new boolean[] {false} ;
      T000D2_A627Variable_N = new short[1] ;
      T000D2_n627Variable_N = new boolean[] {false} ;
      T000D2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000D2_A630Vida_Util_Inicial = new short[1] ;
      T000D2_n630Vida_Util_Inicial = new boolean[] {false} ;
      T000D2_A631Vida_Util_Actual = new short[1] ;
      T000D2_n631Vida_Util_Actual = new boolean[] {false} ;
      T000D2_A711Invd_AreadanteCodigo = new String[] {""} ;
      T000D2_n711Invd_AreadanteCodigo = new boolean[] {false} ;
      T000D2_A818Invd_PlacaRecuperada = new String[] {""} ;
      T000D2_n818Invd_PlacaRecuperada = new boolean[] {false} ;
      T000D2_A858Invd_EntidadGobierno = new String[] {""} ;
      T000D2_n858Invd_EntidadGobierno = new boolean[] {false} ;
      T000D2_A66Elem_Consecutivo = new String[] {""} ;
      T000D2_A43Cuen_Identificacion = new long[1] ;
      T000D2_n43Cuen_Identificacion = new boolean[] {false} ;
      T000D20_A37Cata_Codigo = new String[] {""} ;
      T000D20_A33Tipo_Codigo = new long[1] ;
      T000D21_A298Cata_Descripcion = new String[] {""} ;
      T000D21_A34Clas_Codigo = new String[] {""} ;
      T000D22_A291Clas_Descripcion = new String[] {""} ;
      T000D23_A688Cuen_Cedula = new long[1] ;
      T000D23_A44Cuen_Nombre = new String[] {""} ;
      T000D23_n44Cuen_Nombre = new boolean[] {false} ;
      T000D24_A66Elem_Consecutivo = new String[] {""} ;
      T000D24_A67Invd_NumeroPlaca = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000D25_A67Invd_NumeroPlaca = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inventario_devolutivo__default(),
         new Object[] {
             new Object[] {
            T000D2_A67Invd_NumeroPlaca, T000D2_A410Invd_RegionalId, T000D2_A411Invd_CentroCostoId, T000D2_A412Invd_ModuloAlmacen, T000D2_A413Invd_AlmacenCodigo, T000D2_A414Invd_BodegaCodigo, T000D2_A463Invd_Estado, T000D2_n463Invd_Estado, T000D2_A465Invd_ValorAdquisicion, T000D2_n465Invd_ValorAdquisicion,
            T000D2_A466Invd_FechaAdquisicion, T000D2_n466Invd_FechaAdquisicion, T000D2_A68Invd_PlacaPadre, T000D2_n68Invd_PlacaPadre, T000D2_A501Invd_EsPlacaPadre, T000D2_n501Invd_EsPlacaPadre, T000D2_A467Invd_FechaServicio, T000D2_n467Invd_FechaServicio, T000D2_A628Otros_Costos_Dev, T000D2_n628Otros_Costos_Dev,
            T000D2_A624Costo_Desmante, T000D2_n624Costo_Desmante, T000D2_A625Variable_VF, T000D2_n625Variable_VF, T000D2_A626Variable_I, T000D2_n626Variable_I, T000D2_A627Variable_N, T000D2_n627Variable_N, T000D2_A629Costo_Total_Dev, T000D2_A630Vida_Util_Inicial,
            T000D2_n630Vida_Util_Inicial, T000D2_A631Vida_Util_Actual, T000D2_n631Vida_Util_Actual, T000D2_A711Invd_AreadanteCodigo, T000D2_n711Invd_AreadanteCodigo, T000D2_A818Invd_PlacaRecuperada, T000D2_n818Invd_PlacaRecuperada, T000D2_A858Invd_EntidadGobierno, T000D2_n858Invd_EntidadGobierno, T000D2_A66Elem_Consecutivo,
            T000D2_A43Cuen_Identificacion, T000D2_n43Cuen_Identificacion
            }
            , new Object[] {
            T000D3_A67Invd_NumeroPlaca, T000D3_A410Invd_RegionalId, T000D3_A411Invd_CentroCostoId, T000D3_A412Invd_ModuloAlmacen, T000D3_A413Invd_AlmacenCodigo, T000D3_A414Invd_BodegaCodigo, T000D3_A463Invd_Estado, T000D3_n463Invd_Estado, T000D3_A465Invd_ValorAdquisicion, T000D3_n465Invd_ValorAdquisicion,
            T000D3_A466Invd_FechaAdquisicion, T000D3_n466Invd_FechaAdquisicion, T000D3_A68Invd_PlacaPadre, T000D3_n68Invd_PlacaPadre, T000D3_A501Invd_EsPlacaPadre, T000D3_n501Invd_EsPlacaPadre, T000D3_A467Invd_FechaServicio, T000D3_n467Invd_FechaServicio, T000D3_A628Otros_Costos_Dev, T000D3_n628Otros_Costos_Dev,
            T000D3_A624Costo_Desmante, T000D3_n624Costo_Desmante, T000D3_A625Variable_VF, T000D3_n625Variable_VF, T000D3_A626Variable_I, T000D3_n626Variable_I, T000D3_A627Variable_N, T000D3_n627Variable_N, T000D3_A629Costo_Total_Dev, T000D3_A630Vida_Util_Inicial,
            T000D3_n630Vida_Util_Inicial, T000D3_A631Vida_Util_Actual, T000D3_n631Vida_Util_Actual, T000D3_A711Invd_AreadanteCodigo, T000D3_n711Invd_AreadanteCodigo, T000D3_A818Invd_PlacaRecuperada, T000D3_n818Invd_PlacaRecuperada, T000D3_A858Invd_EntidadGobierno, T000D3_n858Invd_EntidadGobierno, T000D3_A66Elem_Consecutivo,
            T000D3_A43Cuen_Identificacion, T000D3_n43Cuen_Identificacion
            }
            , new Object[] {
            T000D4_A37Cata_Codigo, T000D4_A33Tipo_Codigo
            }
            , new Object[] {
            T000D5_A688Cuen_Cedula, T000D5_A44Cuen_Nombre, T000D5_n44Cuen_Nombre
            }
            , new Object[] {
            T000D6_A298Cata_Descripcion, T000D6_A34Clas_Codigo
            }
            , new Object[] {
            T000D7_A291Clas_Descripcion
            }
            , new Object[] {
            T000D8_A37Cata_Codigo, T000D8_A67Invd_NumeroPlaca, T000D8_A298Cata_Descripcion, T000D8_A291Clas_Descripcion, T000D8_A410Invd_RegionalId, T000D8_A411Invd_CentroCostoId, T000D8_A412Invd_ModuloAlmacen, T000D8_A413Invd_AlmacenCodigo, T000D8_A414Invd_BodegaCodigo, T000D8_A463Invd_Estado,
            T000D8_n463Invd_Estado, T000D8_A465Invd_ValorAdquisicion, T000D8_n465Invd_ValorAdquisicion, T000D8_A466Invd_FechaAdquisicion, T000D8_n466Invd_FechaAdquisicion, T000D8_A68Invd_PlacaPadre, T000D8_n68Invd_PlacaPadre, T000D8_A501Invd_EsPlacaPadre, T000D8_n501Invd_EsPlacaPadre, T000D8_A467Invd_FechaServicio,
            T000D8_n467Invd_FechaServicio, T000D8_A688Cuen_Cedula, T000D8_A44Cuen_Nombre, T000D8_n44Cuen_Nombre, T000D8_A628Otros_Costos_Dev, T000D8_n628Otros_Costos_Dev, T000D8_A624Costo_Desmante, T000D8_n624Costo_Desmante, T000D8_A625Variable_VF, T000D8_n625Variable_VF,
            T000D8_A626Variable_I, T000D8_n626Variable_I, T000D8_A627Variable_N, T000D8_n627Variable_N, T000D8_A629Costo_Total_Dev, T000D8_A630Vida_Util_Inicial, T000D8_n630Vida_Util_Inicial, T000D8_A631Vida_Util_Actual, T000D8_n631Vida_Util_Actual, T000D8_A711Invd_AreadanteCodigo,
            T000D8_n711Invd_AreadanteCodigo, T000D8_A818Invd_PlacaRecuperada, T000D8_n818Invd_PlacaRecuperada, T000D8_A858Invd_EntidadGobierno, T000D8_n858Invd_EntidadGobierno, T000D8_A66Elem_Consecutivo, T000D8_A43Cuen_Identificacion, T000D8_n43Cuen_Identificacion, T000D8_A34Clas_Codigo, T000D8_A33Tipo_Codigo
            }
            , new Object[] {
            T000D9_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000D10_A37Cata_Codigo, T000D10_A33Tipo_Codigo
            }
            , new Object[] {
            T000D11_A298Cata_Descripcion, T000D11_A34Clas_Codigo
            }
            , new Object[] {
            T000D12_A291Clas_Descripcion
            }
            , new Object[] {
            T000D13_A688Cuen_Cedula, T000D13_A44Cuen_Nombre, T000D13_n44Cuen_Nombre
            }
            , new Object[] {
            T000D14_A66Elem_Consecutivo, T000D14_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000D15_A67Invd_NumeroPlaca, T000D15_A66Elem_Consecutivo
            }
            , new Object[] {
            T000D16_A67Invd_NumeroPlaca, T000D16_A66Elem_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000D20_A37Cata_Codigo, T000D20_A33Tipo_Codigo
            }
            , new Object[] {
            T000D21_A298Cata_Descripcion, T000D21_A34Clas_Codigo
            }
            , new Object[] {
            T000D22_A291Clas_Descripcion
            }
            , new Object[] {
            T000D23_A688Cuen_Cedula, T000D23_A44Cuen_Nombre, T000D23_n44Cuen_Nombre
            }
            , new Object[] {
            T000D24_A66Elem_Consecutivo, T000D24_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000D25_A67Invd_NumeroPlaca
            }
         }
      );
      AV16Pgmname = "ALM_INVENTARIO_DEVOLUTIVO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z626Variable_I ;
   private short Z627Variable_N ;
   private short Z630Vida_Util_Inicial ;
   private short Z631Vida_Util_Actual ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A630Vida_Util_Inicial ;
   private short A631Vida_Util_Actual ;
   private short RcdFound16 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtElem_Consecutivo_Enabled ;
   private int imgprompt_66_Visible ;
   private int edtCata_Descripcion_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int edtClas_Descripcion_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int edtInvd_NumeroPlaca_Enabled ;
   private int edtInvd_RegionalId_Enabled ;
   private int edtInvd_CentroCostoId_Enabled ;
   private int edtInvd_AlmacenCodigo_Enabled ;
   private int edtInvd_BodegaCodigo_Enabled ;
   private int edtInvd_ValorAdquisicion_Enabled ;
   private int edtInvd_FechaAdquisicion_Enabled ;
   private int edtInvd_PlacaPadre_Enabled ;
   private int edtInvd_EsPlacaPadre_Enabled ;
   private int edtInvd_FechaServicio_Enabled ;
   private int edtCuen_Identificacion_Enabled ;
   private int imgprompt_43_Visible ;
   private int edtCuen_Cedula_Enabled ;
   private int edtCuen_Nombre_Enabled ;
   private int edtOtros_Costos_Dev_Enabled ;
   private int edtCosto_Desmante_Enabled ;
   private int edtVariable_VF_Enabled ;
   private int edtVariable_I_Enabled ;
   private int edtVariable_N_Enabled ;
   private int edtCosto_Total_Dev_Enabled ;
   private int edtVida_Util_Inicial_Enabled ;
   private int edtVida_Util_Actual_Enabled ;
   private int edtInvd_AreadanteCodigo_Enabled ;
   private int edtInvd_PlacaRecuperada_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV17GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private long Z410Invd_RegionalId ;
   private long Z411Invd_CentroCostoId ;
   private long Z43Cuen_Identificacion ;
   private long N43Cuen_Identificacion ;
   private long A43Cuen_Identificacion ;
   private long A33Tipo_Codigo ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A688Cuen_Cedula ;
   private long AV12Insert_Cuen_Identificacion ;
   private long Z33Tipo_Codigo ;
   private long Z688Cuen_Cedula ;
   private java.math.BigDecimal Z465Invd_ValorAdquisicion ;
   private java.math.BigDecimal Z628Otros_Costos_Dev ;
   private java.math.BigDecimal Z624Costo_Desmante ;
   private java.math.BigDecimal Z625Variable_VF ;
   private java.math.BigDecimal Z629Costo_Total_Dev ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z501Invd_EsPlacaPadre ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtElem_Consecutivo_Internalname ;
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
   private String edtElem_Consecutivo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_66_Internalname ;
   private String imgprompt_66_Link ;
   private String edtCata_Descripcion_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Internalname ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtInvd_ValorAdquisicion_Internalname ;
   private String edtInvd_ValorAdquisicion_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtInvd_EsPlacaPadre_Internalname ;
   private String A501Invd_EsPlacaPadre ;
   private String edtInvd_EsPlacaPadre_Jsonclick ;
   private String edtInvd_FechaServicio_Internalname ;
   private String edtInvd_FechaServicio_Jsonclick ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String imgprompt_43_Internalname ;
   private String imgprompt_43_Link ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtOtros_Costos_Dev_Internalname ;
   private String edtOtros_Costos_Dev_Jsonclick ;
   private String edtCosto_Desmante_Internalname ;
   private String edtCosto_Desmante_Jsonclick ;
   private String edtVariable_VF_Internalname ;
   private String edtVariable_VF_Jsonclick ;
   private String edtVariable_I_Internalname ;
   private String edtVariable_I_Jsonclick ;
   private String edtVariable_N_Internalname ;
   private String edtVariable_N_Jsonclick ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtVida_Util_Inicial_Internalname ;
   private String edtVida_Util_Inicial_Jsonclick ;
   private String edtVida_Util_Actual_Internalname ;
   private String edtVida_Util_Actual_Jsonclick ;
   private String edtInvd_AreadanteCodigo_Internalname ;
   private String edtInvd_AreadanteCodigo_Jsonclick ;
   private String edtInvd_PlacaRecuperada_Internalname ;
   private String edtInvd_PlacaRecuperada_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV16Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode16 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z466Invd_FechaAdquisicion ;
   private java.util.Date Z467Invd_FechaServicio ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date A467Invd_FechaServicio ;
   private boolean entryPointCalled ;
   private boolean n43Cuen_Identificacion ;
   private boolean toggleJsOutput ;
   private boolean n463Invd_Estado ;
   private boolean n858Invd_EntidadGobierno ;
   private boolean wbErr ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n467Invd_FechaServicio ;
   private boolean n44Cuen_Nombre ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n624Costo_Desmante ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n630Vida_Util_Inicial ;
   private boolean n631Vida_Util_Actual ;
   private boolean n711Invd_AreadanteCodigo ;
   private boolean n818Invd_PlacaRecuperada ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV14Elem_Consecutivo ;
   private String wcpOAV7Invd_NumeroPlaca ;
   private String Z66Elem_Consecutivo ;
   private String Z67Invd_NumeroPlaca ;
   private String Z412Invd_ModuloAlmacen ;
   private String Z413Invd_AlmacenCodigo ;
   private String Z414Invd_BodegaCodigo ;
   private String Z463Invd_Estado ;
   private String Z68Invd_PlacaPadre ;
   private String Z711Invd_AreadanteCodigo ;
   private String Z818Invd_PlacaRecuperada ;
   private String Z858Invd_EntidadGobierno ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A34Clas_Codigo ;
   private String AV14Elem_Consecutivo ;
   private String AV7Invd_NumeroPlaca ;
   private String A412Invd_ModuloAlmacen ;
   private String A463Invd_Estado ;
   private String A858Invd_EntidadGobierno ;
   private String A298Cata_Descripcion ;
   private String A291Clas_Descripcion ;
   private String A67Invd_NumeroPlaca ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A68Invd_PlacaPadre ;
   private String A44Cuen_Nombre ;
   private String A711Invd_AreadanteCodigo ;
   private String A818Invd_PlacaRecuperada ;
   private String Z37Cata_Codigo ;
   private String Z298Cata_Descripcion ;
   private String Z34Clas_Codigo ;
   private String Z291Clas_Descripcion ;
   private String Z44Cuen_Nombre ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private HTMLChoice cmbInvd_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private String[] T000D4_A37Cata_Codigo ;
   private long[] T000D4_A33Tipo_Codigo ;
   private String[] T000D6_A298Cata_Descripcion ;
   private String[] T000D6_A34Clas_Codigo ;
   private String[] T000D7_A291Clas_Descripcion ;
   private long[] T000D5_A688Cuen_Cedula ;
   private String[] T000D5_A44Cuen_Nombre ;
   private boolean[] T000D5_n44Cuen_Nombre ;
   private String[] T000D8_A37Cata_Codigo ;
   private String[] T000D8_A67Invd_NumeroPlaca ;
   private String[] T000D8_A298Cata_Descripcion ;
   private String[] T000D8_A291Clas_Descripcion ;
   private long[] T000D8_A410Invd_RegionalId ;
   private long[] T000D8_A411Invd_CentroCostoId ;
   private String[] T000D8_A412Invd_ModuloAlmacen ;
   private String[] T000D8_A413Invd_AlmacenCodigo ;
   private String[] T000D8_A414Invd_BodegaCodigo ;
   private String[] T000D8_A463Invd_Estado ;
   private boolean[] T000D8_n463Invd_Estado ;
   private java.math.BigDecimal[] T000D8_A465Invd_ValorAdquisicion ;
   private boolean[] T000D8_n465Invd_ValorAdquisicion ;
   private java.util.Date[] T000D8_A466Invd_FechaAdquisicion ;
   private boolean[] T000D8_n466Invd_FechaAdquisicion ;
   private String[] T000D8_A68Invd_PlacaPadre ;
   private boolean[] T000D8_n68Invd_PlacaPadre ;
   private String[] T000D8_A501Invd_EsPlacaPadre ;
   private boolean[] T000D8_n501Invd_EsPlacaPadre ;
   private java.util.Date[] T000D8_A467Invd_FechaServicio ;
   private boolean[] T000D8_n467Invd_FechaServicio ;
   private long[] T000D8_A688Cuen_Cedula ;
   private String[] T000D8_A44Cuen_Nombre ;
   private boolean[] T000D8_n44Cuen_Nombre ;
   private java.math.BigDecimal[] T000D8_A628Otros_Costos_Dev ;
   private boolean[] T000D8_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] T000D8_A624Costo_Desmante ;
   private boolean[] T000D8_n624Costo_Desmante ;
   private java.math.BigDecimal[] T000D8_A625Variable_VF ;
   private boolean[] T000D8_n625Variable_VF ;
   private short[] T000D8_A626Variable_I ;
   private boolean[] T000D8_n626Variable_I ;
   private short[] T000D8_A627Variable_N ;
   private boolean[] T000D8_n627Variable_N ;
   private java.math.BigDecimal[] T000D8_A629Costo_Total_Dev ;
   private short[] T000D8_A630Vida_Util_Inicial ;
   private boolean[] T000D8_n630Vida_Util_Inicial ;
   private short[] T000D8_A631Vida_Util_Actual ;
   private boolean[] T000D8_n631Vida_Util_Actual ;
   private String[] T000D8_A711Invd_AreadanteCodigo ;
   private boolean[] T000D8_n711Invd_AreadanteCodigo ;
   private String[] T000D8_A818Invd_PlacaRecuperada ;
   private boolean[] T000D8_n818Invd_PlacaRecuperada ;
   private String[] T000D8_A858Invd_EntidadGobierno ;
   private boolean[] T000D8_n858Invd_EntidadGobierno ;
   private String[] T000D8_A66Elem_Consecutivo ;
   private long[] T000D8_A43Cuen_Identificacion ;
   private boolean[] T000D8_n43Cuen_Identificacion ;
   private String[] T000D8_A34Clas_Codigo ;
   private long[] T000D8_A33Tipo_Codigo ;
   private String[] T000D9_A67Invd_NumeroPlaca ;
   private String[] T000D10_A37Cata_Codigo ;
   private long[] T000D10_A33Tipo_Codigo ;
   private String[] T000D11_A298Cata_Descripcion ;
   private String[] T000D11_A34Clas_Codigo ;
   private String[] T000D12_A291Clas_Descripcion ;
   private long[] T000D13_A688Cuen_Cedula ;
   private String[] T000D13_A44Cuen_Nombre ;
   private boolean[] T000D13_n44Cuen_Nombre ;
   private String[] T000D14_A66Elem_Consecutivo ;
   private String[] T000D14_A67Invd_NumeroPlaca ;
   private String[] T000D3_A67Invd_NumeroPlaca ;
   private long[] T000D3_A410Invd_RegionalId ;
   private long[] T000D3_A411Invd_CentroCostoId ;
   private String[] T000D3_A412Invd_ModuloAlmacen ;
   private String[] T000D3_A413Invd_AlmacenCodigo ;
   private String[] T000D3_A414Invd_BodegaCodigo ;
   private String[] T000D3_A463Invd_Estado ;
   private boolean[] T000D3_n463Invd_Estado ;
   private java.math.BigDecimal[] T000D3_A465Invd_ValorAdquisicion ;
   private boolean[] T000D3_n465Invd_ValorAdquisicion ;
   private java.util.Date[] T000D3_A466Invd_FechaAdquisicion ;
   private boolean[] T000D3_n466Invd_FechaAdquisicion ;
   private String[] T000D3_A68Invd_PlacaPadre ;
   private boolean[] T000D3_n68Invd_PlacaPadre ;
   private String[] T000D3_A501Invd_EsPlacaPadre ;
   private boolean[] T000D3_n501Invd_EsPlacaPadre ;
   private java.util.Date[] T000D3_A467Invd_FechaServicio ;
   private boolean[] T000D3_n467Invd_FechaServicio ;
   private java.math.BigDecimal[] T000D3_A628Otros_Costos_Dev ;
   private boolean[] T000D3_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] T000D3_A624Costo_Desmante ;
   private boolean[] T000D3_n624Costo_Desmante ;
   private java.math.BigDecimal[] T000D3_A625Variable_VF ;
   private boolean[] T000D3_n625Variable_VF ;
   private short[] T000D3_A626Variable_I ;
   private boolean[] T000D3_n626Variable_I ;
   private short[] T000D3_A627Variable_N ;
   private boolean[] T000D3_n627Variable_N ;
   private java.math.BigDecimal[] T000D3_A629Costo_Total_Dev ;
   private short[] T000D3_A630Vida_Util_Inicial ;
   private boolean[] T000D3_n630Vida_Util_Inicial ;
   private short[] T000D3_A631Vida_Util_Actual ;
   private boolean[] T000D3_n631Vida_Util_Actual ;
   private String[] T000D3_A711Invd_AreadanteCodigo ;
   private boolean[] T000D3_n711Invd_AreadanteCodigo ;
   private String[] T000D3_A818Invd_PlacaRecuperada ;
   private boolean[] T000D3_n818Invd_PlacaRecuperada ;
   private String[] T000D3_A858Invd_EntidadGobierno ;
   private boolean[] T000D3_n858Invd_EntidadGobierno ;
   private String[] T000D3_A66Elem_Consecutivo ;
   private long[] T000D3_A43Cuen_Identificacion ;
   private boolean[] T000D3_n43Cuen_Identificacion ;
   private String[] T000D15_A67Invd_NumeroPlaca ;
   private String[] T000D15_A66Elem_Consecutivo ;
   private String[] T000D16_A67Invd_NumeroPlaca ;
   private String[] T000D16_A66Elem_Consecutivo ;
   private String[] T000D2_A67Invd_NumeroPlaca ;
   private long[] T000D2_A410Invd_RegionalId ;
   private long[] T000D2_A411Invd_CentroCostoId ;
   private String[] T000D2_A412Invd_ModuloAlmacen ;
   private String[] T000D2_A413Invd_AlmacenCodigo ;
   private String[] T000D2_A414Invd_BodegaCodigo ;
   private String[] T000D2_A463Invd_Estado ;
   private boolean[] T000D2_n463Invd_Estado ;
   private java.math.BigDecimal[] T000D2_A465Invd_ValorAdquisicion ;
   private boolean[] T000D2_n465Invd_ValorAdquisicion ;
   private java.util.Date[] T000D2_A466Invd_FechaAdquisicion ;
   private boolean[] T000D2_n466Invd_FechaAdquisicion ;
   private String[] T000D2_A68Invd_PlacaPadre ;
   private boolean[] T000D2_n68Invd_PlacaPadre ;
   private String[] T000D2_A501Invd_EsPlacaPadre ;
   private boolean[] T000D2_n501Invd_EsPlacaPadre ;
   private java.util.Date[] T000D2_A467Invd_FechaServicio ;
   private boolean[] T000D2_n467Invd_FechaServicio ;
   private java.math.BigDecimal[] T000D2_A628Otros_Costos_Dev ;
   private boolean[] T000D2_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] T000D2_A624Costo_Desmante ;
   private boolean[] T000D2_n624Costo_Desmante ;
   private java.math.BigDecimal[] T000D2_A625Variable_VF ;
   private boolean[] T000D2_n625Variable_VF ;
   private short[] T000D2_A626Variable_I ;
   private boolean[] T000D2_n626Variable_I ;
   private short[] T000D2_A627Variable_N ;
   private boolean[] T000D2_n627Variable_N ;
   private java.math.BigDecimal[] T000D2_A629Costo_Total_Dev ;
   private short[] T000D2_A630Vida_Util_Inicial ;
   private boolean[] T000D2_n630Vida_Util_Inicial ;
   private short[] T000D2_A631Vida_Util_Actual ;
   private boolean[] T000D2_n631Vida_Util_Actual ;
   private String[] T000D2_A711Invd_AreadanteCodigo ;
   private boolean[] T000D2_n711Invd_AreadanteCodigo ;
   private String[] T000D2_A818Invd_PlacaRecuperada ;
   private boolean[] T000D2_n818Invd_PlacaRecuperada ;
   private String[] T000D2_A858Invd_EntidadGobierno ;
   private boolean[] T000D2_n858Invd_EntidadGobierno ;
   private String[] T000D2_A66Elem_Consecutivo ;
   private long[] T000D2_A43Cuen_Identificacion ;
   private boolean[] T000D2_n43Cuen_Identificacion ;
   private String[] T000D20_A37Cata_Codigo ;
   private long[] T000D20_A33Tipo_Codigo ;
   private String[] T000D21_A298Cata_Descripcion ;
   private String[] T000D21_A34Clas_Codigo ;
   private String[] T000D22_A291Clas_Descripcion ;
   private long[] T000D23_A688Cuen_Cedula ;
   private String[] T000D23_A44Cuen_Nombre ;
   private boolean[] T000D23_n44Cuen_Nombre ;
   private String[] T000D24_A66Elem_Consecutivo ;
   private String[] T000D24_A67Invd_NumeroPlaca ;
   private String[] T000D25_A67Invd_NumeroPlaca ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class alm_inventario_devolutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000D2", "SELECT Invd_NumeroPlaca, Invd_RegionalId, Invd_CentroCostoId, Invd_ModuloAlmacen, Invd_AlmacenCodigo, Invd_BodegaCodigo, Invd_Estado, Invd_ValorAdquisicion, Invd_FechaAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Invd_FechaServicio, Otros_Costos_Dev, Costo_Desmante, Variable_VF, Variable_I, Variable_N, Costo_Total_Dev, Vida_Util_Inicial, Vida_Util_Actual, Invd_AreadanteCodigo, Invd_PlacaRecuperada, Invd_EntidadGobierno, Elem_Consecutivo, Cuen_Identificacion FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?  FOR UPDATE OF Invd_RegionalId, Invd_CentroCostoId, Invd_ModuloAlmacen, Invd_AlmacenCodigo, Invd_BodegaCodigo, Invd_Estado, Invd_ValorAdquisicion, Invd_FechaAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Invd_FechaServicio, Otros_Costos_Dev, Costo_Desmante, Variable_VF, Variable_I, Variable_N, Costo_Total_Dev, Vida_Util_Inicial, Vida_Util_Actual, Invd_AreadanteCodigo, Invd_PlacaRecuperada, Invd_EntidadGobierno, Cuen_Identificacion NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D3", "SELECT Invd_NumeroPlaca, Invd_RegionalId, Invd_CentroCostoId, Invd_ModuloAlmacen, Invd_AlmacenCodigo, Invd_BodegaCodigo, Invd_Estado, Invd_ValorAdquisicion, Invd_FechaAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Invd_FechaServicio, Otros_Costos_Dev, Costo_Desmante, Variable_VF, Variable_I, Variable_N, Costo_Total_Dev, Vida_Util_Inicial, Vida_Util_Actual, Invd_AreadanteCodigo, Invd_PlacaRecuperada, Invd_EntidadGobierno, Elem_Consecutivo, Cuen_Identificacion FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D4", "SELECT Cata_Codigo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D5", "SELECT Cuen_Cedula, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D6", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D7", "SELECT Clas_Descripcion FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D8", "SELECT /*+ FIRST_ROWS(100) */ T2.Cata_Codigo, TM1.Invd_NumeroPlaca, T3.Cata_Descripcion, T4.Clas_Descripcion, TM1.Invd_RegionalId, TM1.Invd_CentroCostoId, TM1.Invd_ModuloAlmacen, TM1.Invd_AlmacenCodigo, TM1.Invd_BodegaCodigo, TM1.Invd_Estado, TM1.Invd_ValorAdquisicion, TM1.Invd_FechaAdquisicion, TM1.Invd_PlacaPadre, TM1.Invd_EsPlacaPadre, TM1.Invd_FechaServicio, T5.Cuen_Cedula, T5.Cuen_Nombre, TM1.Otros_Costos_Dev, TM1.Costo_Desmante, TM1.Variable_VF, TM1.Variable_I, TM1.Variable_N, TM1.Costo_Total_Dev, TM1.Vida_Util_Inicial, TM1.Vida_Util_Actual, TM1.Invd_AreadanteCodigo, TM1.Invd_PlacaRecuperada, TM1.Invd_EntidadGobierno, TM1.Elem_Consecutivo, TM1.Cuen_Identificacion, T3.Clas_Codigo, T2.Tipo_Codigo FROM ((((ALM_INVENTARIO_DEVOLUTIVO TM1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = TM1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = TM1.Cuen_Identificacion) WHERE TM1.Invd_NumeroPlaca = ? and TM1.Elem_Consecutivo = ? ORDER BY TM1.Elem_Consecutivo, TM1.Invd_NumeroPlaca ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000D9", "SELECT Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE (Invd_NumeroPlaca = ?) AND (Not ( Elem_Consecutivo = ? and Invd_NumeroPlaca = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D10", "SELECT Cata_Codigo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D11", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D12", "SELECT Clas_Descripcion FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D13", "SELECT Cuen_Cedula, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D14", "SELECT /*+ FIRST_ROWS(1) */ Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Invd_NumeroPlaca, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE ( Invd_NumeroPlaca > ? or Invd_NumeroPlaca = ? and Elem_Consecutivo > ?) ORDER BY Elem_Consecutivo, Invd_NumeroPlaca) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Invd_NumeroPlaca, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE ( Invd_NumeroPlaca < ? or Invd_NumeroPlaca = ? and Elem_Consecutivo < ?) ORDER BY Elem_Consecutivo DESC, Invd_NumeroPlaca DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000D17", "INSERT INTO ALM_INVENTARIO_DEVOLUTIVO(Invd_NumeroPlaca, Invd_RegionalId, Invd_CentroCostoId, Invd_ModuloAlmacen, Invd_AlmacenCodigo, Invd_BodegaCodigo, Invd_Estado, Invd_ValorAdquisicion, Invd_FechaAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Invd_FechaServicio, Otros_Costos_Dev, Costo_Desmante, Variable_VF, Variable_I, Variable_N, Costo_Total_Dev, Vida_Util_Inicial, Vida_Util_Actual, Invd_AreadanteCodigo, Invd_PlacaRecuperada, Invd_EntidadGobierno, Elem_Consecutivo, Cuen_Identificacion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("T000D18", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_RegionalId=?, Invd_CentroCostoId=?, Invd_ModuloAlmacen=?, Invd_AlmacenCodigo=?, Invd_BodegaCodigo=?, Invd_Estado=?, Invd_ValorAdquisicion=?, Invd_FechaAdquisicion=?, Invd_PlacaPadre=?, Invd_EsPlacaPadre=?, Invd_FechaServicio=?, Otros_Costos_Dev=?, Costo_Desmante=?, Variable_VF=?, Variable_I=?, Variable_N=?, Costo_Total_Dev=?, Vida_Util_Inicial=?, Vida_Util_Actual=?, Invd_AreadanteCodigo=?, Invd_PlacaRecuperada=?, Invd_EntidadGobierno=?, Cuen_Identificacion=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("T000D19", "DELETE FROM ALM_INVENTARIO_DEVOLUTIVO  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("T000D20", "SELECT Cata_Codigo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D21", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D22", "SELECT Clas_Descripcion FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D23", "SELECT Cuen_Cedula, Cuen_Nombre FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D24", "SELECT /*+ FIRST_ROWS(100) */ Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000D25", "SELECT Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE (Invd_NumeroPlaca = ?) AND (Not ( Elem_Consecutivo = ? and Invd_NumeroPlaca = ?)) ",true, GX_NOMASK, false, this,1,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2) ;
               ((short[]) buf[29])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(24) ;
               ((long[]) buf[40])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2) ;
               ((short[]) buf[29])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(24) ;
               ((long[]) buf[40])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 2) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(15) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(16) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(20,2) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(23,2) ;
               ((short[]) buf[35])[0] = rslt.getShort(24) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(25) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(29) ;
               ((long[]) buf[46])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(31) ;
               ((long[]) buf[49])[0] = rslt.getLong(32) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 23 :
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
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 9, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 9, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 30);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[27]).shortValue());
               }
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[28], 2);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[34], 20);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[38], 2);
               }
               stmt.setVarchar(24, (String)parms[39], 9, false);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(25, ((Number) parms[41]).longValue(), 0);
               }
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 30);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[26]).shortValue());
               }
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[27], 2);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 20);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(23, ((Number) parms[39]).longValue(), 0);
               }
               stmt.setVarchar(24, (String)parms[40], 9, false);
               stmt.setVarchar(25, (String)parms[41], 30, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 9, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               return;
      }
   }

}

