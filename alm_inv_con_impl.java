/*
               File: alm_inv_con_impl
        Description: ALMACEN INVENTARIO CONSUMO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:1.11
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

public final  class alm_inv_con_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A31Bode_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A31Bode_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A93Trans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A93Trans_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A66Elem_Consecutivo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A37Cata_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A37Cata_Codigo) ;
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
            AV21Regional = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Regional", GXutil.ltrim( GXutil.str( AV21Regional, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGIONAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Regional), "ZZZZZZZZZZ9")));
            AV26Centro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Centro_Id", GXutil.ltrim( GXutil.str( AV26Centro_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENTRO_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Centro_Id), "ZZZZZZZZZZ9")));
            AV8Alma_Modulo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Alma_Modulo", AV8Alma_Modulo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Alma_Modulo, ""))));
            AV7Alma_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Alma_Codigo", AV7Alma_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Alma_Codigo, ""))));
            AV9Bode_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Bode_Codigo", AV9Bode_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Bode_Codigo, ""))));
            AV22Trans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Trans_Id", GXutil.ltrim( GXutil.str( AV22Trans_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRANS_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Trans_Id), "ZZZZZZZZZZ9")));
            AV12Elem_Consecutivo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Elem_Consecutivo", AV12Elem_Consecutivo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Elem_Consecutivo, ""))));
            AV19Num_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Num_Linea", GXutil.ltrim( GXutil.str( AV19Num_Linea, 8, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vNUM_LINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Num_Linea), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "ALMACEN INVENTARIO CONSUMO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRegional_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_inv_con_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_inv_con_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_inv_con_impl.class ));
   }

   public alm_inv_con_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "ALMACEN INVENTARIO CONSUMO", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx00f0"+"',["+"{Ctrl:gx.dom.el('"+"REGIONAL"+"'), id:'"+"REGIONAL"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CENTRO_ID"+"'), id:'"+"CENTRO_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ALMA_MODULO"+"'), id:'"+"ALMA_MODULO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ALMA_CODIGO"+"'), id:'"+"ALMA_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"BODE_CODIGO"+"'), id:'"+"BODE_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"TRANS_ID"+"'), id:'"+"TRANS_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ELEM_CONSECUTIVO"+"'), id:'"+"ELEM_CONSECUTIVO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"NUM_LINEA"+"'), id:'"+"NUM_LINEA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegional_Internalname, "Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegional_Internalname, GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A91Regional), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegional_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegional_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCentro_Id_Internalname, "de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCentro_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A92Centro_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCentro_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtCentro_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Codigo_Internalname, A28Alma_Codigo, GXutil.rtrim( localUtil.format( A28Alma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBode_Codigo_Internalname, "Código Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBode_Codigo_Internalname, A31Bode_Codigo, GXutil.rtrim( localUtil.format( A31Bode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBode_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtBode_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CON.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_31_Internalname, sImgUrl, imgprompt_31_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_31_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_Id_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A93Trans_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtTrans_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_INV_CON.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_93_Internalname, sImgUrl, imgprompt_93_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_93_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CON.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_66_Internalname, sImgUrl, imgprompt_66_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_66_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNum_Linea_Internalname, "por transaccion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNum_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A94Num_Linea), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNum_Linea_Jsonclick, 0, "Attribute", "", "", "", 1, edtNum_Linea_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, "", "", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Codigo_Internalname, "Código del Bien", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_Codigo_Internalname, A37Cata_Codigo, GXutil.rtrim( localUtil.format( A37Cata_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_Codigo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, "", "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCantidad_Diponible_Internalname, "Diponible", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCantidad_Diponible_Internalname, GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")), ((edtCantidad_Diponible_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A618Cantidad_Diponible), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantidad_Diponible_Jsonclick, 0, "Attribute", "", "", "", 1, edtCantidad_Diponible_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCantidad_Transito_Internalname, "Transito", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCantidad_Transito_Internalname, GXutil.ltrim( localUtil.ntoc( A619Cantidad_Transito, (byte)(8), (byte)(0), ",", "")), ((edtCantidad_Transito_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A619Cantidad_Transito), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantidad_Transito_Jsonclick, 0, "Attribute", "", "", "", 1, edtCantidad_Transito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtValor_Unitario_Internalname, "Unitario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtValor_Unitario_Internalname, GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(24), (byte)(2), ",", "")), ((edtValor_Unitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A620Valor_Unitario, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValor_Unitario_Jsonclick, 0, "Attribute", "", "", "", 1, edtValor_Unitario_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOtros_Costos_Internalname, "Costos", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOtros_Costos_Internalname, GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtOtros_Costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A621Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOtros_Costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtOtros_Costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCosto_Total_Internalname, "Total", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCosto_Total_Internalname, GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(24), (byte)(2), ",", "")), ((edtCosto_Total_Enabled!=0) ? GXutil.ltrim( localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A622Costo_Total, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosto_Total_Jsonclick, 0, "Attribute", "", "", "", 1, edtCosto_Total_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDescrip_Atributos_Internalname, "Atributos", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDescrip_Atributos_Internalname, A623Descrip_Atributos, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", (short)(0), 1, edtDescrip_Atributos_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_ConsecutivoCC_Internalname, "CC", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTrans_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A710Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A710Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_ConsecutivoCC_Jsonclick, 0, "Attribute", "", "", "", 1, edtTrans_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTrans_FechaRatificacion_Internalname, "Ratificacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTrans_FechaRatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTrans_FechaRatificacion_Internalname, localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A709Trans_FechaRatificacion, "99/99/9999 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrans_FechaRatificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTrans_FechaRatificacion_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTrans_FechaRatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTrans_FechaRatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_INV_CON.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_INV_CON.htm");
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
      e110B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegional_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegional_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGIONAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegional_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A91Regional = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
            }
            else
            {
               A91Regional = localUtil.ctol( httpContext.cgiGet( edtRegional_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCentro_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCentro_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENTRO_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCentro_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A92Centro_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
            }
            else
            {
               A92Centro_Id = localUtil.ctol( httpContext.cgiGet( edtCentro_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
            }
            cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
            A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrans_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrans_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRANS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrans_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A93Trans_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
            }
            else
            {
               A93Trans_Id = localUtil.ctol( httpContext.cgiGet( edtTrans_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
            }
            A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNum_Linea_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNum_Linea_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NUM_LINEA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNum_Linea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A94Num_Linea = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
            }
            else
            {
               A94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( edtNum_Linea_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
            }
            A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
            A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
            A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCantidad_Diponible_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCantidad_Diponible_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CANTIDAD_DIPONIBLE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCantidad_Diponible_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A618Cantidad_Diponible = 0 ;
               n618Cantidad_Diponible = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
            }
            else
            {
               A618Cantidad_Diponible = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Diponible_Internalname), ",", ".")) ;
               n618Cantidad_Diponible = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
            }
            n618Cantidad_Diponible = ((0==A618Cantidad_Diponible) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCantidad_Transito_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCantidad_Transito_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CANTIDAD_TRANSITO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCantidad_Transito_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A619Cantidad_Transito = 0 ;
               n619Cantidad_Transito = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
            }
            else
            {
               A619Cantidad_Transito = (int)(localUtil.ctol( httpContext.cgiGet( edtCantidad_Transito_Internalname), ",", ".")) ;
               n619Cantidad_Transito = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
            }
            n619Cantidad_Transito = ((0==A619Cantidad_Transito) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtValor_Unitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtValor_Unitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALOR_UNITARIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtValor_Unitario_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A620Valor_Unitario = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
            }
            else
            {
               A620Valor_Unitario = localUtil.ctond( httpContext.cgiGet( edtValor_Unitario_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OTROS_COSTOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOtros_Costos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A621Otros_Costos = DecimalUtil.ZERO ;
               n621Otros_Costos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
            }
            else
            {
               A621Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Internalname)) ;
               n621Otros_Costos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
            }
            n621Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A621Otros_Costos)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTO_TOTAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCosto_Total_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A622Costo_Total = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
            }
            else
            {
               A622Costo_Total = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
            }
            A623Descrip_Atributos = httpContext.cgiGet( edtDescrip_Atributos_Internalname) ;
            n623Descrip_Atributos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A623Descrip_Atributos", A623Descrip_Atributos);
            n623Descrip_Atributos = ((GXutil.strcmp("", A623Descrip_Atributos)==0) ? true : false) ;
            A710Trans_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTrans_ConsecutivoCC_Internalname), ",", ".") ;
            n710Trans_ConsecutivoCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
            A709Trans_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTrans_FechaRatificacion_Internalname)) ;
            n709Trans_FechaRatificacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
            /* Read saved values. */
            Z91Regional = localUtil.ctol( httpContext.cgiGet( "Z91Regional"), ",", ".") ;
            Z92Centro_Id = localUtil.ctol( httpContext.cgiGet( "Z92Centro_Id"), ",", ".") ;
            Z27Alma_Modulo = httpContext.cgiGet( "Z27Alma_Modulo") ;
            Z28Alma_Codigo = httpContext.cgiGet( "Z28Alma_Codigo") ;
            Z31Bode_Codigo = httpContext.cgiGet( "Z31Bode_Codigo") ;
            Z93Trans_Id = localUtil.ctol( httpContext.cgiGet( "Z93Trans_Id"), ",", ".") ;
            Z66Elem_Consecutivo = httpContext.cgiGet( "Z66Elem_Consecutivo") ;
            Z94Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( "Z94Num_Linea"), ",", ".")) ;
            Z618Cantidad_Diponible = (int)(localUtil.ctol( httpContext.cgiGet( "Z618Cantidad_Diponible"), ",", ".")) ;
            n618Cantidad_Diponible = ((0==A618Cantidad_Diponible) ? true : false) ;
            Z619Cantidad_Transito = (int)(localUtil.ctol( httpContext.cgiGet( "Z619Cantidad_Transito"), ",", ".")) ;
            n619Cantidad_Transito = ((0==A619Cantidad_Transito) ? true : false) ;
            Z620Valor_Unitario = localUtil.ctond( httpContext.cgiGet( "Z620Valor_Unitario")) ;
            Z621Otros_Costos = localUtil.ctond( httpContext.cgiGet( "Z621Otros_Costos")) ;
            n621Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A621Otros_Costos)==0) ? true : false) ;
            Z622Costo_Total = localUtil.ctond( httpContext.cgiGet( "Z622Costo_Total")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV21Regional = localUtil.ctol( httpContext.cgiGet( "vREGIONAL"), ",", ".") ;
            AV26Centro_Id = localUtil.ctol( httpContext.cgiGet( "vCENTRO_ID"), ",", ".") ;
            AV8Alma_Modulo = httpContext.cgiGet( "vALMA_MODULO") ;
            AV7Alma_Codigo = httpContext.cgiGet( "vALMA_CODIGO") ;
            AV9Bode_Codigo = httpContext.cgiGet( "vBODE_CODIGO") ;
            AV22Trans_Id = localUtil.ctol( httpContext.cgiGet( "vTRANS_ID"), ",", ".") ;
            AV12Elem_Consecutivo = httpContext.cgiGet( "vELEM_CONSECUTIVO") ;
            AV19Num_Linea = (int)(localUtil.ctol( httpContext.cgiGet( "vNUM_LINEA"), ",", ".")) ;
            AV27Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_INV_CON" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A91Regional != Z91Regional ) || ( A92Centro_Id != Z92Centro_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 ) || ( A93Trans_Id != Z93Trans_Id ) || ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( A94Num_Linea != Z94Num_Linea ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_inv_con:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A91Regional = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
               A92Centro_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
               A28Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
               A31Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
               A93Trans_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               A94Num_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
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
                  sMode15 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode15 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound15 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0B0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "REGIONAL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRegional_Internalname ;
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
                        e110B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120B2 ();
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
         e120B2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0B15( ) ;
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
         disableAttributes0B15( ) ;
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

   public void confirm_0B0( )
   {
      beforeValidate0B15( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0B15( ) ;
         }
         else
         {
            checkExtendedTable0B15( ) ;
            closeExtendedTableCursors0B15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0B0( )
   {
   }

   public void e110B2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV27Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV27Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV23TrnContext.fromxml(AV25WebSession.getValue("TrnContext"), null, null);
   }

   public void e120B2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV23TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_inv_con") );
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

   public void zm0B15( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z618Cantidad_Diponible = T000B3_A618Cantidad_Diponible[0] ;
            Z619Cantidad_Transito = T000B3_A619Cantidad_Transito[0] ;
            Z620Valor_Unitario = T000B3_A620Valor_Unitario[0] ;
            Z621Otros_Costos = T000B3_A621Otros_Costos[0] ;
            Z622Costo_Total = T000B3_A622Costo_Total[0] ;
         }
         else
         {
            Z618Cantidad_Diponible = A618Cantidad_Diponible ;
            Z619Cantidad_Transito = A619Cantidad_Transito ;
            Z620Valor_Unitario = A620Valor_Unitario ;
            Z621Otros_Costos = A621Otros_Costos ;
            Z622Costo_Total = A622Costo_Total ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z91Regional = A91Regional ;
         Z92Centro_Id = A92Centro_Id ;
         Z94Num_Linea = A94Num_Linea ;
         Z618Cantidad_Diponible = A618Cantidad_Diponible ;
         Z619Cantidad_Transito = A619Cantidad_Transito ;
         Z620Valor_Unitario = A620Valor_Unitario ;
         Z621Otros_Costos = A621Otros_Costos ;
         Z622Costo_Total = A622Costo_Total ;
         Z623Descrip_Atributos = A623Descrip_Atributos ;
         Z31Bode_Codigo = A31Bode_Codigo ;
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z93Trans_Id = A93Trans_Id ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         Z710Trans_ConsecutivoCC = A710Trans_ConsecutivoCC ;
         Z709Trans_FechaRatificacion = A709Trans_FechaRatificacion ;
         Z557Elem_Descripcion = A557Elem_Descripcion ;
         Z37Cata_Codigo = A37Cata_Codigo ;
         Z298Cata_Descripcion = A298Cata_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_31_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00t0"+"',["+"{Ctrl:gx.dom.el('"+"BODE_CODIGO"+"'), id:'"+"BODE_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_93_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0070"+"',["+"{Ctrl:gx.dom.el('"+"TRANS_ID"+"'), id:'"+"TRANS_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_66_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00x0"+"',["+"{Ctrl:gx.dom.el('"+"ELEM_CONSECUTIVO"+"'), id:'"+"ELEM_CONSECUTIVO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV21Regional) )
      {
         A91Regional = AV21Regional ;
         httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
      }
      if ( ! (0==AV21Regional) )
      {
         edtRegional_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRegional_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegional_Enabled, 5, 0)), true);
      }
      else
      {
         edtRegional_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRegional_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegional_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV21Regional) )
      {
         edtRegional_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRegional_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegional_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV26Centro_Id) )
      {
         A92Centro_Id = AV26Centro_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
      }
      if ( ! (0==AV26Centro_Id) )
      {
         edtCentro_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCentro_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCentro_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtCentro_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCentro_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCentro_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV26Centro_Id) )
      {
         edtCentro_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCentro_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCentro_Id_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV8Alma_Modulo)==0) )
      {
         A27Alma_Modulo = AV8Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      if ( ! (GXutil.strcmp("", AV8Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      else
      {
         cmbAlma_Modulo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV8Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7Alma_Codigo)==0) )
      {
         A28Alma_Codigo = AV7Alma_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV7Alma_Codigo)==0) )
      {
         edtAlma_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtAlma_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7Alma_Codigo)==0) )
      {
         edtAlma_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV9Bode_Codigo)==0) )
      {
         A31Bode_Codigo = AV9Bode_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV9Bode_Codigo)==0) )
      {
         edtBode_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtBode_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV9Bode_Codigo)==0) )
      {
         edtBode_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV22Trans_Id) )
      {
         A93Trans_Id = AV22Trans_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
      }
      if ( ! (0==AV22Trans_Id) )
      {
         edtTrans_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrans_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtTrans_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrans_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV22Trans_Id) )
      {
         edtTrans_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrans_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_Id_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV12Elem_Consecutivo)==0) )
      {
         A66Elem_Consecutivo = AV12Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      if ( ! (GXutil.strcmp("", AV12Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      else
      {
         edtElem_Consecutivo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV12Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV19Num_Linea) )
      {
         A94Num_Linea = AV19Num_Linea ;
         httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      }
      if ( ! (0==AV19Num_Linea) )
      {
         edtNum_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNum_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNum_Linea_Enabled, 5, 0)), true);
      }
      else
      {
         edtNum_Linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNum_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNum_Linea_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV19Num_Linea) )
      {
         edtNum_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNum_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNum_Linea_Enabled, 5, 0)), true);
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
         AV27Pgmname = "ALM_INV_CON" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         /* Using cursor T000B6 */
         pr_default.execute(4, new Object[] {new Long(A93Trans_Id)});
         A710Trans_ConsecutivoCC = T000B6_A710Trans_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
         n710Trans_ConsecutivoCC = T000B6_n710Trans_ConsecutivoCC[0] ;
         A709Trans_FechaRatificacion = T000B6_A709Trans_FechaRatificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         n709Trans_FechaRatificacion = T000B6_n709Trans_FechaRatificacion[0] ;
         pr_default.close(4);
         /* Using cursor T000B5 */
         pr_default.execute(3, new Object[] {A66Elem_Consecutivo});
         A557Elem_Descripcion = T000B5_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A37Cata_Codigo = T000B5_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         pr_default.close(3);
         /* Using cursor T000B7 */
         pr_default.execute(5, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000B7_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         pr_default.close(5);
      }
   }

   public void load0B15( )
   {
      /* Using cursor T000B8 */
      pr_default.execute(6, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A623Descrip_Atributos = T000B8_A623Descrip_Atributos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623Descrip_Atributos", A623Descrip_Atributos);
         n623Descrip_Atributos = T000B8_n623Descrip_Atributos[0] ;
         A557Elem_Descripcion = T000B8_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A298Cata_Descripcion = T000B8_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A618Cantidad_Diponible = T000B8_A618Cantidad_Diponible[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
         n618Cantidad_Diponible = T000B8_n618Cantidad_Diponible[0] ;
         A619Cantidad_Transito = T000B8_A619Cantidad_Transito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
         n619Cantidad_Transito = T000B8_n619Cantidad_Transito[0] ;
         A620Valor_Unitario = T000B8_A620Valor_Unitario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
         A621Otros_Costos = T000B8_A621Otros_Costos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
         n621Otros_Costos = T000B8_n621Otros_Costos[0] ;
         A622Costo_Total = T000B8_A622Costo_Total[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
         A710Trans_ConsecutivoCC = T000B8_A710Trans_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
         n710Trans_ConsecutivoCC = T000B8_n710Trans_ConsecutivoCC[0] ;
         A709Trans_FechaRatificacion = T000B8_A709Trans_FechaRatificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         n709Trans_FechaRatificacion = T000B8_n709Trans_FechaRatificacion[0] ;
         A37Cata_Codigo = T000B8_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         zm0B15( -25) ;
      }
      pr_default.close(6);
      onLoadActions0B15( ) ;
   }

   public void onLoadActions0B15( )
   {
      AV27Pgmname = "ALM_INV_CON" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
   }

   public void checkExtendedTable0B15( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV27Pgmname = "ALM_INV_CON" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      /* Using cursor T000B4 */
      pr_default.execute(2, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "BODE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T000B6 */
      pr_default.execute(4, new Object[] {new Long(A93Trans_Id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Trans_Inv_Consumo'.", "ForeignKeyNotFound", 1, "TRANS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrans_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A710Trans_ConsecutivoCC = T000B6_A710Trans_ConsecutivoCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
      n710Trans_ConsecutivoCC = T000B6_n710Trans_ConsecutivoCC[0] ;
      A709Trans_FechaRatificacion = T000B6_A709Trans_FechaRatificacion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      n709Trans_FechaRatificacion = T000B6_n709Trans_FechaRatificacion[0] ;
      pr_default.close(4);
      /* Using cursor T000B5 */
      pr_default.execute(3, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A557Elem_Descripcion = T000B5_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A37Cata_Codigo = T000B5_A37Cata_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      pr_default.close(3);
      /* Using cursor T000B7 */
      pr_default.execute(5, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000B7_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0B15( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_26( String A31Bode_Codigo )
   {
      /* Using cursor T000B9 */
      pr_default.execute(7, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "BODE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_28( long A93Trans_Id )
   {
      /* Using cursor T000B10 */
      pr_default.execute(8, new Object[] {new Long(A93Trans_Id)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Trans_Inv_Consumo'.", "ForeignKeyNotFound", 1, "TRANS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrans_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A710Trans_ConsecutivoCC = T000B10_A710Trans_ConsecutivoCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
      n710Trans_ConsecutivoCC = T000B10_n710Trans_ConsecutivoCC[0] ;
      A709Trans_FechaRatificacion = T000B10_A709Trans_FechaRatificacion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      n709Trans_FechaRatificacion = T000B10_n709Trans_FechaRatificacion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_27( String A66Elem_Consecutivo )
   {
      /* Using cursor T000B11 */
      pr_default.execute(9, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A557Elem_Descripcion = T000B11_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A37Cata_Codigo = T000B11_A37Cata_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A557Elem_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A37Cata_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_29( String A37Cata_Codigo )
   {
      /* Using cursor T000B12 */
      pr_default.execute(10, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000B12_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A298Cata_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void getKey0B15( )
   {
      /* Using cursor T000B13 */
      pr_default.execute(11, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000B3 */
      pr_default.execute(1, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0B15( 25) ;
         RcdFound15 = (short)(1) ;
         A623Descrip_Atributos = T000B3_A623Descrip_Atributos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623Descrip_Atributos", A623Descrip_Atributos);
         n623Descrip_Atributos = T000B3_n623Descrip_Atributos[0] ;
         A91Regional = T000B3_A91Regional[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
         A92Centro_Id = T000B3_A92Centro_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
         A94Num_Linea = T000B3_A94Num_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
         A618Cantidad_Diponible = T000B3_A618Cantidad_Diponible[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
         n618Cantidad_Diponible = T000B3_n618Cantidad_Diponible[0] ;
         A619Cantidad_Transito = T000B3_A619Cantidad_Transito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
         n619Cantidad_Transito = T000B3_n619Cantidad_Transito[0] ;
         A620Valor_Unitario = T000B3_A620Valor_Unitario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
         A621Otros_Costos = T000B3_A621Otros_Costos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
         n621Otros_Costos = T000B3_n621Otros_Costos[0] ;
         A622Costo_Total = T000B3_A622Costo_Total[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
         A31Bode_Codigo = T000B3_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         A66Elem_Consecutivo = T000B3_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A93Trans_Id = T000B3_A93Trans_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         A27Alma_Modulo = T000B3_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T000B3_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         Z91Regional = A91Regional ;
         Z92Centro_Id = A92Centro_Id ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         Z31Bode_Codigo = A31Bode_Codigo ;
         Z93Trans_Id = A93Trans_Id ;
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z94Num_Linea = A94Num_Linea ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0B15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey0B15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey0B15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0B15( ) ;
      if ( RcdFound15 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T000B14 */
      pr_default.execute(12, new Object[] {new Long(A91Regional), new Long(A91Regional), new Long(A92Centro_Id), new Long(A92Centro_Id), new Long(A91Regional), A27Alma_Modulo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A28Alma_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A31Bode_Codigo, A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), new Long(A93Trans_Id), new Long(A93Trans_Id), A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A66Elem_Consecutivo, A66Elem_Consecutivo, new Long(A93Trans_Id), A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), new Integer(A94Num_Linea)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T000B14_A91Regional[0] < A91Regional ) || ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A92Centro_Id[0] < A92Centro_Id ) || ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) || ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) < 0 ) || ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) < 0 ) || ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A93Trans_Id[0] < A93Trans_Id ) || ( T000B14_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) || ( GXutil.strcmp(T000B14_A66Elem_Consecutivo[0], A66Elem_Consecutivo) == 0 ) && ( T000B14_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A94Num_Linea[0] < A94Num_Linea ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T000B14_A91Regional[0] > A91Regional ) || ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A92Centro_Id[0] > A92Centro_Id ) || ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) || ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) > 0 ) || ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) > 0 ) || ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A93Trans_Id[0] > A93Trans_Id ) || ( T000B14_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B14_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) || ( GXutil.strcmp(T000B14_A66Elem_Consecutivo[0], A66Elem_Consecutivo) == 0 ) && ( T000B14_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B14_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B14_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B14_A92Centro_Id[0] == A92Centro_Id ) && ( T000B14_A91Regional[0] == A91Regional ) && ( T000B14_A94Num_Linea[0] > A94Num_Linea ) ) )
         {
            A91Regional = T000B14_A91Regional[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
            A92Centro_Id = T000B14_A92Centro_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
            A27Alma_Modulo = T000B14_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = T000B14_A28Alma_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            A31Bode_Codigo = T000B14_A31Bode_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            A93Trans_Id = T000B14_A93Trans_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
            A66Elem_Consecutivo = T000B14_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A94Num_Linea = T000B14_A94Num_Linea[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T000B15 */
      pr_default.execute(13, new Object[] {new Long(A91Regional), new Long(A91Regional), new Long(A92Centro_Id), new Long(A92Centro_Id), new Long(A91Regional), A27Alma_Modulo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A28Alma_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A31Bode_Codigo, A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), new Long(A93Trans_Id), new Long(A93Trans_Id), A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), A66Elem_Consecutivo, A66Elem_Consecutivo, new Long(A93Trans_Id), A31Bode_Codigo, A28Alma_Codigo, A27Alma_Modulo, new Long(A92Centro_Id), new Long(A91Regional), new Integer(A94Num_Linea)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T000B15_A91Regional[0] > A91Regional ) || ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A92Centro_Id[0] > A92Centro_Id ) || ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) || ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) > 0 ) || ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) > 0 ) || ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A93Trans_Id[0] > A93Trans_Id ) || ( T000B15_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) || ( GXutil.strcmp(T000B15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) == 0 ) && ( T000B15_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A94Num_Linea[0] > A94Num_Linea ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T000B15_A91Regional[0] < A91Regional ) || ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A92Centro_Id[0] < A92Centro_Id ) || ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) || ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) < 0 ) || ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) < 0 ) || ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A93Trans_Id[0] < A93Trans_Id ) || ( T000B15_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( GXutil.strcmp(T000B15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) || ( GXutil.strcmp(T000B15_A66Elem_Consecutivo[0], A66Elem_Consecutivo) == 0 ) && ( T000B15_A93Trans_Id[0] == A93Trans_Id ) && ( GXutil.strcmp(T000B15_A31Bode_Codigo[0], A31Bode_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A28Alma_Codigo[0], A28Alma_Codigo) == 0 ) && ( GXutil.strcmp(T000B15_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000B15_A92Centro_Id[0] == A92Centro_Id ) && ( T000B15_A91Regional[0] == A91Regional ) && ( T000B15_A94Num_Linea[0] < A94Num_Linea ) ) )
         {
            A91Regional = T000B15_A91Regional[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
            A92Centro_Id = T000B15_A92Centro_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
            A27Alma_Modulo = T000B15_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = T000B15_A28Alma_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            A31Bode_Codigo = T000B15_A31Bode_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
            A93Trans_Id = T000B15_A93Trans_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
            A66Elem_Consecutivo = T000B15_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A94Num_Linea = T000B15_A94Num_Linea[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0B15( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRegional_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0B15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( A91Regional != Z91Regional ) || ( A92Centro_Id != Z92Centro_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 ) || ( A93Trans_Id != Z93Trans_Id ) || ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( A94Num_Linea != Z94Num_Linea ) )
            {
               A91Regional = Z91Regional ;
               httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
               A92Centro_Id = Z92Centro_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
               A27Alma_Modulo = Z27Alma_Modulo ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
               A28Alma_Codigo = Z28Alma_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
               A31Bode_Codigo = Z31Bode_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
               A93Trans_Id = Z93Trans_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
               A66Elem_Consecutivo = Z66Elem_Consecutivo ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               A94Num_Linea = Z94Num_Linea ;
               httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "REGIONAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegional_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRegional_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0B15( ) ;
               GX_FocusControl = edtRegional_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A91Regional != Z91Regional ) || ( A92Centro_Id != Z92Centro_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 ) || ( A93Trans_Id != Z93Trans_Id ) || ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( A94Num_Linea != Z94Num_Linea ) )
            {
               /* Insert record */
               GX_FocusControl = edtRegional_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0B15( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "REGIONAL");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRegional_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRegional_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0B15( ) ;
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
      if ( ( A91Regional != Z91Regional ) || ( A92Centro_Id != Z92Centro_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) || ( GXutil.strcmp(A31Bode_Codigo, Z31Bode_Codigo) != 0 ) || ( A93Trans_Id != Z93Trans_Id ) || ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) || ( A94Num_Linea != Z94Num_Linea ) )
      {
         A91Regional = Z91Regional ;
         httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
         A92Centro_Id = Z92Centro_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
         A27Alma_Modulo = Z27Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = Z28Alma_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         A31Bode_Codigo = Z31Bode_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         A93Trans_Id = Z93Trans_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         A66Elem_Consecutivo = Z66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A94Num_Linea = Z94Num_Linea ;
         httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "REGIONAL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegional_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRegional_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0B15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000B2 */
         pr_default.execute(0, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_INV_CON"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z618Cantidad_Diponible != T000B2_A618Cantidad_Diponible[0] ) || ( Z619Cantidad_Transito != T000B2_A619Cantidad_Transito[0] ) || ( DecimalUtil.compareTo(Z620Valor_Unitario, T000B2_A620Valor_Unitario[0]) != 0 ) || ( DecimalUtil.compareTo(Z621Otros_Costos, T000B2_A621Otros_Costos[0]) != 0 ) || ( DecimalUtil.compareTo(Z622Costo_Total, T000B2_A622Costo_Total[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_INV_CON"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B15( )
   {
      beforeValidate0B15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B15( 0) ;
         checkOptimisticConcurrency0B15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B16 */
                  pr_default.execute(14, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), new Integer(A94Num_Linea), new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), A620Valor_Unitario, new Boolean(n621Otros_Costos), A621Otros_Costos, A622Costo_Total, new Boolean(n623Descrip_Atributos), A623Descrip_Atributos, A31Bode_Codigo, A66Elem_Consecutivo, new Long(A93Trans_Id), A27Alma_Modulo, A28Alma_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
                  if ( (pr_default.getStatus(14) == 1) )
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
                        resetCaption0B0( ) ;
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
            load0B15( ) ;
         }
         endLevel0B15( ) ;
      }
      closeExtendedTableCursors0B15( ) ;
   }

   public void update0B15( )
   {
      beforeValidate0B15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B17 */
                  pr_default.execute(15, new Object[] {new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), A620Valor_Unitario, new Boolean(n621Otros_Costos), A621Otros_Costos, A622Costo_Total, new Boolean(n623Descrip_Atributos), A623Descrip_Atributos, new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_INV_CON"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B15( ) ;
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
         endLevel0B15( ) ;
      }
      closeExtendedTableCursors0B15( ) ;
   }

   public void deferredUpdate0B15( )
   {
   }

   public void delete( )
   {
      beforeValidate0B15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B15( ) ;
         afterConfirm0B15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000B18 */
               pr_default.execute(16, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0B15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0B15( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV27Pgmname = "ALM_INV_CON" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         /* Using cursor T000B19 */
         pr_default.execute(17, new Object[] {new Long(A93Trans_Id)});
         A710Trans_ConsecutivoCC = T000B19_A710Trans_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
         n710Trans_ConsecutivoCC = T000B19_n710Trans_ConsecutivoCC[0] ;
         A709Trans_FechaRatificacion = T000B19_A709Trans_FechaRatificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         n709Trans_FechaRatificacion = T000B19_n709Trans_FechaRatificacion[0] ;
         pr_default.close(17);
         /* Using cursor T000B20 */
         pr_default.execute(18, new Object[] {A66Elem_Consecutivo});
         A557Elem_Descripcion = T000B20_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A37Cata_Codigo = T000B20_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         pr_default.close(18);
         /* Using cursor T000B21 */
         pr_default.execute(19, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000B21_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         pr_default.close(19);
      }
   }

   public void endLevel0B15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_inv_con");
         if ( AnyError == 0 )
         {
            confirmValues0B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_inv_con");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B15( )
   {
      /* Scan By routine */
      /* Using cursor T000B22 */
      pr_default.execute(20);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A91Regional = T000B22_A91Regional[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
         A92Centro_Id = T000B22_A92Centro_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
         A27Alma_Modulo = T000B22_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T000B22_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         A31Bode_Codigo = T000B22_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         A93Trans_Id = T000B22_A93Trans_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         A66Elem_Consecutivo = T000B22_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A94Num_Linea = T000B22_A94Num_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B15( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A91Regional = T000B22_A91Regional[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
         A92Centro_Id = T000B22_A92Centro_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
         A27Alma_Modulo = T000B22_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T000B22_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         A31Bode_Codigo = T000B22_A31Bode_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
         A93Trans_Id = T000B22_A93Trans_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
         A66Elem_Consecutivo = T000B22_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A94Num_Linea = T000B22_A94Num_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      }
   }

   public void scanEnd0B15( )
   {
      pr_default.close(20);
   }

   public void afterConfirm0B15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B15( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B15( )
   {
      edtRegional_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegional_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegional_Enabled, 5, 0)), true);
      edtCentro_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCentro_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCentro_Id_Enabled, 5, 0)), true);
      cmbAlma_Modulo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      edtAlma_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      edtBode_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), true);
      edtTrans_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrans_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_Id_Enabled, 5, 0)), true);
      edtElem_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      edtNum_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNum_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNum_Linea_Enabled, 5, 0)), true);
      edtElem_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Descripcion_Enabled, 5, 0)), true);
      edtCata_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      edtCata_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Descripcion_Enabled, 5, 0)), true);
      edtCantidad_Diponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantidad_Diponible_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCantidad_Diponible_Enabled, 5, 0)), true);
      edtCantidad_Transito_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantidad_Transito_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCantidad_Transito_Enabled, 5, 0)), true);
      edtValor_Unitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValor_Unitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtValor_Unitario_Enabled, 5, 0)), true);
      edtOtros_Costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOtros_Costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOtros_Costos_Enabled, 5, 0)), true);
      edtCosto_Total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosto_Total_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCosto_Total_Enabled, 5, 0)), true);
      edtDescrip_Atributos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDescrip_Atributos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDescrip_Atributos_Enabled, 5, 0)), true);
      edtTrans_ConsecutivoCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrans_ConsecutivoCC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_ConsecutivoCC_Enabled, 5, 0)), true);
      edtTrans_FechaRatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrans_FechaRatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTrans_FechaRatificacion_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0B0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018614141543");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_inv_con") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21Regional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV8Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19Num_Linea,8,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z91Regional", GXutil.ltrim( localUtil.ntoc( Z91Regional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z92Centro_Id", GXutil.ltrim( localUtil.ntoc( Z92Centro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z27Alma_Modulo", Z27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z28Alma_Codigo", Z28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z31Bode_Codigo", Z31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z93Trans_Id", GXutil.ltrim( localUtil.ntoc( Z93Trans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z66Elem_Consecutivo", Z66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z94Num_Linea", GXutil.ltrim( localUtil.ntoc( Z94Num_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z618Cantidad_Diponible", GXutil.ltrim( localUtil.ntoc( Z618Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z619Cantidad_Transito", GXutil.ltrim( localUtil.ntoc( Z619Cantidad_Transito, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z620Valor_Unitario", GXutil.ltrim( localUtil.ntoc( Z620Valor_Unitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z621Otros_Costos", GXutil.ltrim( localUtil.ntoc( Z621Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z622Costo_Total", GXutil.ltrim( localUtil.ntoc( Z622Costo_Total, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV23TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV23TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGIONAL", GXutil.ltrim( localUtil.ntoc( AV21Regional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENTRO_ID", GXutil.ltrim( localUtil.ntoc( AV26Centro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV8Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV7Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV9Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRANS_ID", GXutil.ltrim( localUtil.ntoc( AV22Trans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV12Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUM_LINEA", GXutil.ltrim( localUtil.ntoc( AV19Num_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV27Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGIONAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Regional), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENTRO_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV26Centro_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANS_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Trans_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_LINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Num_Linea), "ZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_INV_CON" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_inv_con:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_inv_con") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV21Regional,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26Centro_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV8Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22Trans_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19Num_Linea,8,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_INV_CON" ;
   }

   public String getPgmdesc( )
   {
      return "ALMACEN INVENTARIO CONSUMO" ;
   }

   public void initializeNonKey0B15( )
   {
      A557Elem_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A37Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      A298Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A618Cantidad_Diponible = 0 ;
      n618Cantidad_Diponible = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A618Cantidad_Diponible", GXutil.ltrim( GXutil.str( A618Cantidad_Diponible, 8, 0)));
      n618Cantidad_Diponible = ((0==A618Cantidad_Diponible) ? true : false) ;
      A619Cantidad_Transito = 0 ;
      n619Cantidad_Transito = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619Cantidad_Transito", GXutil.ltrim( GXutil.str( A619Cantidad_Transito, 8, 0)));
      n619Cantidad_Transito = ((0==A619Cantidad_Transito) ? true : false) ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A620Valor_Unitario", GXutil.ltrim( GXutil.str( A620Valor_Unitario, 18, 2)));
      A621Otros_Costos = DecimalUtil.ZERO ;
      n621Otros_Costos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A621Otros_Costos", GXutil.ltrim( GXutil.str( A621Otros_Costos, 18, 2)));
      n621Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A621Otros_Costos)==0) ? true : false) ;
      A622Costo_Total = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A622Costo_Total", GXutil.ltrim( GXutil.str( A622Costo_Total, 18, 2)));
      A623Descrip_Atributos = "" ;
      n623Descrip_Atributos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A623Descrip_Atributos", A623Descrip_Atributos);
      n623Descrip_Atributos = ((GXutil.strcmp("", A623Descrip_Atributos)==0) ? true : false) ;
      A710Trans_ConsecutivoCC = 0 ;
      n710Trans_ConsecutivoCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( A710Trans_ConsecutivoCC, 18, 0)));
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      n709Trans_FechaRatificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A709Trans_FechaRatificacion", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      Z618Cantidad_Diponible = 0 ;
      Z619Cantidad_Transito = 0 ;
      Z620Valor_Unitario = DecimalUtil.ZERO ;
      Z621Otros_Costos = DecimalUtil.ZERO ;
      Z622Costo_Total = DecimalUtil.ZERO ;
   }

   public void initAll0B15( )
   {
      A91Regional = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A91Regional", GXutil.ltrim( GXutil.str( A91Regional, 11, 0)));
      A92Centro_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A92Centro_Id", GXutil.ltrim( GXutil.str( A92Centro_Id, 11, 0)));
      A27Alma_Modulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      A28Alma_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      A31Bode_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      A93Trans_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A93Trans_Id", GXutil.ltrim( GXutil.str( A93Trans_Id, 11, 0)));
      A66Elem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      A94Num_Linea = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A94Num_Linea", GXutil.ltrim( GXutil.str( A94Num_Linea, 8, 0)));
      initializeNonKey0B15( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141415418");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_inv_con.js", "?20186141415418");
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
      edtRegional_Internalname = "REGIONAL" ;
      edtCentro_Id_Internalname = "CENTRO_ID" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtTrans_Id_Internalname = "TRANS_ID" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtNum_Linea_Internalname = "NUM_LINEA" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtCantidad_Diponible_Internalname = "CANTIDAD_DIPONIBLE" ;
      edtCantidad_Transito_Internalname = "CANTIDAD_TRANSITO" ;
      edtValor_Unitario_Internalname = "VALOR_UNITARIO" ;
      edtOtros_Costos_Internalname = "OTROS_COSTOS" ;
      edtCosto_Total_Internalname = "COSTO_TOTAL" ;
      edtDescrip_Atributos_Internalname = "DESCRIP_ATRIBUTOS" ;
      edtTrans_ConsecutivoCC_Internalname = "TRANS_CONSECUTIVOCC" ;
      edtTrans_FechaRatificacion_Internalname = "TRANS_FECHARATIFICACION" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_31_Internalname = "PROMPT_31" ;
      imgprompt_93_Internalname = "PROMPT_93" ;
      imgprompt_66_Internalname = "PROMPT_66" ;
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
      Form.setCaption( "ALMACEN INVENTARIO CONSUMO" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTrans_FechaRatificacion_Jsonclick = "" ;
      edtTrans_FechaRatificacion_Enabled = 0 ;
      edtTrans_ConsecutivoCC_Jsonclick = "" ;
      edtTrans_ConsecutivoCC_Enabled = 0 ;
      edtDescrip_Atributos_Enabled = 1 ;
      edtCosto_Total_Jsonclick = "" ;
      edtCosto_Total_Enabled = 1 ;
      edtOtros_Costos_Jsonclick = "" ;
      edtOtros_Costos_Enabled = 1 ;
      edtValor_Unitario_Jsonclick = "" ;
      edtValor_Unitario_Enabled = 1 ;
      edtCantidad_Transito_Jsonclick = "" ;
      edtCantidad_Transito_Enabled = 1 ;
      edtCantidad_Diponible_Jsonclick = "" ;
      edtCantidad_Diponible_Enabled = 1 ;
      edtCata_Descripcion_Enabled = 0 ;
      edtCata_Codigo_Jsonclick = "" ;
      edtCata_Codigo_Enabled = 0 ;
      edtElem_Descripcion_Enabled = 0 ;
      edtNum_Linea_Jsonclick = "" ;
      edtNum_Linea_Enabled = 1 ;
      imgprompt_66_Visible = 1 ;
      imgprompt_66_Link = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 1 ;
      imgprompt_93_Visible = 1 ;
      imgprompt_93_Link = "" ;
      edtTrans_Id_Jsonclick = "" ;
      edtTrans_Id_Enabled = 1 ;
      imgprompt_31_Visible = 1 ;
      imgprompt_31_Link = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      edtBode_Codigo_Enabled = 1 ;
      edtAlma_Codigo_Jsonclick = "" ;
      edtAlma_Codigo_Enabled = 1 ;
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 1 );
      edtCentro_Id_Jsonclick = "" ;
      edtCentro_Id_Enabled = 1 ;
      edtRegional_Jsonclick = "" ;
      edtRegional_Enabled = 1 ;
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

   public void valid_Bode_codigo( String GX_Parm1 )
   {
      A31Bode_Codigo = GX_Parm1 ;
      /* Using cursor T000B23 */
      pr_default.execute(21, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "BODE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Trans_id( long GX_Parm1 ,
                               long GX_Parm2 ,
                               java.util.Date GX_Parm3 )
   {
      A93Trans_Id = GX_Parm1 ;
      A710Trans_ConsecutivoCC = GX_Parm2 ;
      n710Trans_ConsecutivoCC = false ;
      A709Trans_FechaRatificacion = GX_Parm3 ;
      n709Trans_FechaRatificacion = false ;
      /* Using cursor T000B19 */
      pr_default.execute(17, new Object[] {new Long(A93Trans_Id)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Trans_Inv_Consumo'.", "ForeignKeyNotFound", 1, "TRANS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrans_Id_Internalname ;
      }
      A710Trans_ConsecutivoCC = T000B19_A710Trans_ConsecutivoCC[0] ;
      n710Trans_ConsecutivoCC = T000B19_n710Trans_ConsecutivoCC[0] ;
      A709Trans_FechaRatificacion = T000B19_A709Trans_FechaRatificacion[0] ;
      n709Trans_FechaRatificacion = T000B19_n709Trans_FechaRatificacion[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A710Trans_ConsecutivoCC = 0 ;
         n710Trans_ConsecutivoCC = false ;
         A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
         n709Trans_FechaRatificacion = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A710Trans_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Elem_consecutivo( String GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 ,
                                       String GX_Parm4 )
   {
      A66Elem_Consecutivo = GX_Parm1 ;
      A37Cata_Codigo = GX_Parm2 ;
      A557Elem_Descripcion = GX_Parm3 ;
      A298Cata_Descripcion = GX_Parm4 ;
      /* Using cursor T000B20 */
      pr_default.execute(18, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
      }
      A557Elem_Descripcion = T000B20_A557Elem_Descripcion[0] ;
      A37Cata_Codigo = T000B20_A37Cata_Codigo[0] ;
      pr_default.close(18);
      /* Using cursor T000B21 */
      pr_default.execute(19, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A298Cata_Descripcion = T000B21_A298Cata_Descripcion[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A557Elem_Descripcion = "" ;
         A37Cata_Codigo = "" ;
         A298Cata_Descripcion = "" ;
      }
      isValidOutput.add(A557Elem_Descripcion);
      isValidOutput.add(A37Cata_Codigo);
      isValidOutput.add(A298Cata_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV21Regional',fld:'vREGIONAL',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV26Centro_Id',fld:'vCENTRO_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV7Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV9Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV22Trans_Id',fld:'vTRANS_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV12Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV19Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120B2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV23TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(21);
      pr_default.close(18);
      pr_default.close(17);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV8Alma_Modulo = "" ;
      wcpOAV7Alma_Codigo = "" ;
      wcpOAV9Bode_Codigo = "" ;
      wcpOAV12Elem_Consecutivo = "" ;
      Z27Alma_Modulo = "" ;
      Z28Alma_Codigo = "" ;
      Z31Bode_Codigo = "" ;
      Z66Elem_Consecutivo = "" ;
      Z620Valor_Unitario = DecimalUtil.ZERO ;
      Z621Otros_Costos = DecimalUtil.ZERO ;
      Z622Costo_Total = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A31Bode_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      Gx_mode = "" ;
      AV8Alma_Modulo = "" ;
      AV7Alma_Codigo = "" ;
      AV9Bode_Codigo = "" ;
      AV12Elem_Consecutivo = "" ;
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
      A28Alma_Codigo = "" ;
      sImgUrl = "" ;
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      A623Descrip_Atributos = "" ;
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode15 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV25WebSession = httpContext.getWebSession();
      Z623Descrip_Atributos = "" ;
      Z709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      Z557Elem_Descripcion = "" ;
      Z37Cata_Codigo = "" ;
      Z298Cata_Descripcion = "" ;
      T000B6_A710Trans_ConsecutivoCC = new long[1] ;
      T000B6_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      T000B6_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000B6_n709Trans_FechaRatificacion = new boolean[] {false} ;
      T000B5_A557Elem_Descripcion = new String[] {""} ;
      T000B5_A37Cata_Codigo = new String[] {""} ;
      T000B7_A298Cata_Descripcion = new String[] {""} ;
      T000B8_A623Descrip_Atributos = new String[] {""} ;
      T000B8_n623Descrip_Atributos = new boolean[] {false} ;
      T000B8_A91Regional = new long[1] ;
      T000B8_A92Centro_Id = new long[1] ;
      T000B8_A94Num_Linea = new int[1] ;
      T000B8_A557Elem_Descripcion = new String[] {""} ;
      T000B8_A298Cata_Descripcion = new String[] {""} ;
      T000B8_A618Cantidad_Diponible = new int[1] ;
      T000B8_n618Cantidad_Diponible = new boolean[] {false} ;
      T000B8_A619Cantidad_Transito = new int[1] ;
      T000B8_n619Cantidad_Transito = new boolean[] {false} ;
      T000B8_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B8_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B8_n621Otros_Costos = new boolean[] {false} ;
      T000B8_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B8_A710Trans_ConsecutivoCC = new long[1] ;
      T000B8_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      T000B8_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000B8_n709Trans_FechaRatificacion = new boolean[] {false} ;
      T000B8_A31Bode_Codigo = new String[] {""} ;
      T000B8_A66Elem_Consecutivo = new String[] {""} ;
      T000B8_A93Trans_Id = new long[1] ;
      T000B8_A37Cata_Codigo = new String[] {""} ;
      T000B8_A27Alma_Modulo = new String[] {""} ;
      T000B8_A28Alma_Codigo = new String[] {""} ;
      T000B4_A31Bode_Codigo = new String[] {""} ;
      T000B9_A31Bode_Codigo = new String[] {""} ;
      T000B10_A710Trans_ConsecutivoCC = new long[1] ;
      T000B10_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      T000B10_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000B10_n709Trans_FechaRatificacion = new boolean[] {false} ;
      T000B11_A557Elem_Descripcion = new String[] {""} ;
      T000B11_A37Cata_Codigo = new String[] {""} ;
      T000B12_A298Cata_Descripcion = new String[] {""} ;
      T000B13_A91Regional = new long[1] ;
      T000B13_A92Centro_Id = new long[1] ;
      T000B13_A27Alma_Modulo = new String[] {""} ;
      T000B13_A28Alma_Codigo = new String[] {""} ;
      T000B13_A31Bode_Codigo = new String[] {""} ;
      T000B13_A93Trans_Id = new long[1] ;
      T000B13_A66Elem_Consecutivo = new String[] {""} ;
      T000B13_A94Num_Linea = new int[1] ;
      T000B3_A623Descrip_Atributos = new String[] {""} ;
      T000B3_n623Descrip_Atributos = new boolean[] {false} ;
      T000B3_A91Regional = new long[1] ;
      T000B3_A92Centro_Id = new long[1] ;
      T000B3_A94Num_Linea = new int[1] ;
      T000B3_A618Cantidad_Diponible = new int[1] ;
      T000B3_n618Cantidad_Diponible = new boolean[] {false} ;
      T000B3_A619Cantidad_Transito = new int[1] ;
      T000B3_n619Cantidad_Transito = new boolean[] {false} ;
      T000B3_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B3_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B3_n621Otros_Costos = new boolean[] {false} ;
      T000B3_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B3_A31Bode_Codigo = new String[] {""} ;
      T000B3_A66Elem_Consecutivo = new String[] {""} ;
      T000B3_A93Trans_Id = new long[1] ;
      T000B3_A27Alma_Modulo = new String[] {""} ;
      T000B3_A28Alma_Codigo = new String[] {""} ;
      T000B14_A91Regional = new long[1] ;
      T000B14_A92Centro_Id = new long[1] ;
      T000B14_A27Alma_Modulo = new String[] {""} ;
      T000B14_A28Alma_Codigo = new String[] {""} ;
      T000B14_A31Bode_Codigo = new String[] {""} ;
      T000B14_A93Trans_Id = new long[1] ;
      T000B14_A66Elem_Consecutivo = new String[] {""} ;
      T000B14_A94Num_Linea = new int[1] ;
      T000B15_A91Regional = new long[1] ;
      T000B15_A92Centro_Id = new long[1] ;
      T000B15_A27Alma_Modulo = new String[] {""} ;
      T000B15_A28Alma_Codigo = new String[] {""} ;
      T000B15_A31Bode_Codigo = new String[] {""} ;
      T000B15_A93Trans_Id = new long[1] ;
      T000B15_A66Elem_Consecutivo = new String[] {""} ;
      T000B15_A94Num_Linea = new int[1] ;
      T000B2_A623Descrip_Atributos = new String[] {""} ;
      T000B2_n623Descrip_Atributos = new boolean[] {false} ;
      T000B2_A91Regional = new long[1] ;
      T000B2_A92Centro_Id = new long[1] ;
      T000B2_A94Num_Linea = new int[1] ;
      T000B2_A618Cantidad_Diponible = new int[1] ;
      T000B2_n618Cantidad_Diponible = new boolean[] {false} ;
      T000B2_A619Cantidad_Transito = new int[1] ;
      T000B2_n619Cantidad_Transito = new boolean[] {false} ;
      T000B2_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B2_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B2_n621Otros_Costos = new boolean[] {false} ;
      T000B2_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000B2_A31Bode_Codigo = new String[] {""} ;
      T000B2_A66Elem_Consecutivo = new String[] {""} ;
      T000B2_A93Trans_Id = new long[1] ;
      T000B2_A27Alma_Modulo = new String[] {""} ;
      T000B2_A28Alma_Codigo = new String[] {""} ;
      T000B19_A710Trans_ConsecutivoCC = new long[1] ;
      T000B19_n710Trans_ConsecutivoCC = new boolean[] {false} ;
      T000B19_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000B19_n709Trans_FechaRatificacion = new boolean[] {false} ;
      T000B20_A557Elem_Descripcion = new String[] {""} ;
      T000B20_A37Cata_Codigo = new String[] {""} ;
      T000B21_A298Cata_Descripcion = new String[] {""} ;
      T000B22_A91Regional = new long[1] ;
      T000B22_A92Centro_Id = new long[1] ;
      T000B22_A27Alma_Modulo = new String[] {""} ;
      T000B22_A28Alma_Codigo = new String[] {""} ;
      T000B22_A31Bode_Codigo = new String[] {""} ;
      T000B22_A93Trans_Id = new long[1] ;
      T000B22_A66Elem_Consecutivo = new String[] {""} ;
      T000B22_A94Num_Linea = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000B23_A31Bode_Codigo = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_inv_con__default(),
         new Object[] {
             new Object[] {
            T000B2_A623Descrip_Atributos, T000B2_n623Descrip_Atributos, T000B2_A91Regional, T000B2_A92Centro_Id, T000B2_A94Num_Linea, T000B2_A618Cantidad_Diponible, T000B2_n618Cantidad_Diponible, T000B2_A619Cantidad_Transito, T000B2_n619Cantidad_Transito, T000B2_A620Valor_Unitario,
            T000B2_A621Otros_Costos, T000B2_n621Otros_Costos, T000B2_A622Costo_Total, T000B2_A31Bode_Codigo, T000B2_A66Elem_Consecutivo, T000B2_A93Trans_Id, T000B2_A27Alma_Modulo, T000B2_A28Alma_Codigo
            }
            , new Object[] {
            T000B3_A623Descrip_Atributos, T000B3_n623Descrip_Atributos, T000B3_A91Regional, T000B3_A92Centro_Id, T000B3_A94Num_Linea, T000B3_A618Cantidad_Diponible, T000B3_n618Cantidad_Diponible, T000B3_A619Cantidad_Transito, T000B3_n619Cantidad_Transito, T000B3_A620Valor_Unitario,
            T000B3_A621Otros_Costos, T000B3_n621Otros_Costos, T000B3_A622Costo_Total, T000B3_A31Bode_Codigo, T000B3_A66Elem_Consecutivo, T000B3_A93Trans_Id, T000B3_A27Alma_Modulo, T000B3_A28Alma_Codigo
            }
            , new Object[] {
            T000B4_A31Bode_Codigo
            }
            , new Object[] {
            T000B5_A557Elem_Descripcion, T000B5_A37Cata_Codigo
            }
            , new Object[] {
            T000B6_A710Trans_ConsecutivoCC, T000B6_n710Trans_ConsecutivoCC, T000B6_A709Trans_FechaRatificacion, T000B6_n709Trans_FechaRatificacion
            }
            , new Object[] {
            T000B7_A298Cata_Descripcion
            }
            , new Object[] {
            T000B8_A623Descrip_Atributos, T000B8_n623Descrip_Atributos, T000B8_A91Regional, T000B8_A92Centro_Id, T000B8_A94Num_Linea, T000B8_A557Elem_Descripcion, T000B8_A298Cata_Descripcion, T000B8_A618Cantidad_Diponible, T000B8_n618Cantidad_Diponible, T000B8_A619Cantidad_Transito,
            T000B8_n619Cantidad_Transito, T000B8_A620Valor_Unitario, T000B8_A621Otros_Costos, T000B8_n621Otros_Costos, T000B8_A622Costo_Total, T000B8_A710Trans_ConsecutivoCC, T000B8_n710Trans_ConsecutivoCC, T000B8_A709Trans_FechaRatificacion, T000B8_n709Trans_FechaRatificacion, T000B8_A31Bode_Codigo,
            T000B8_A66Elem_Consecutivo, T000B8_A93Trans_Id, T000B8_A37Cata_Codigo, T000B8_A27Alma_Modulo, T000B8_A28Alma_Codigo
            }
            , new Object[] {
            T000B9_A31Bode_Codigo
            }
            , new Object[] {
            T000B10_A710Trans_ConsecutivoCC, T000B10_n710Trans_ConsecutivoCC, T000B10_A709Trans_FechaRatificacion, T000B10_n709Trans_FechaRatificacion
            }
            , new Object[] {
            T000B11_A557Elem_Descripcion, T000B11_A37Cata_Codigo
            }
            , new Object[] {
            T000B12_A298Cata_Descripcion
            }
            , new Object[] {
            T000B13_A91Regional, T000B13_A92Centro_Id, T000B13_A27Alma_Modulo, T000B13_A28Alma_Codigo, T000B13_A31Bode_Codigo, T000B13_A93Trans_Id, T000B13_A66Elem_Consecutivo, T000B13_A94Num_Linea
            }
            , new Object[] {
            T000B14_A91Regional, T000B14_A92Centro_Id, T000B14_A27Alma_Modulo, T000B14_A28Alma_Codigo, T000B14_A31Bode_Codigo, T000B14_A93Trans_Id, T000B14_A66Elem_Consecutivo, T000B14_A94Num_Linea
            }
            , new Object[] {
            T000B15_A91Regional, T000B15_A92Centro_Id, T000B15_A27Alma_Modulo, T000B15_A28Alma_Codigo, T000B15_A31Bode_Codigo, T000B15_A93Trans_Id, T000B15_A66Elem_Consecutivo, T000B15_A94Num_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B19_A710Trans_ConsecutivoCC, T000B19_n710Trans_ConsecutivoCC, T000B19_A709Trans_FechaRatificacion, T000B19_n709Trans_FechaRatificacion
            }
            , new Object[] {
            T000B20_A557Elem_Descripcion, T000B20_A37Cata_Codigo
            }
            , new Object[] {
            T000B21_A298Cata_Descripcion
            }
            , new Object[] {
            T000B22_A91Regional, T000B22_A92Centro_Id, T000B22_A27Alma_Modulo, T000B22_A28Alma_Codigo, T000B22_A31Bode_Codigo, T000B22_A93Trans_Id, T000B22_A66Elem_Consecutivo, T000B22_A94Num_Linea
            }
            , new Object[] {
            T000B23_A31Bode_Codigo
            }
         }
      );
      AV27Pgmname = "ALM_INV_CON" ;
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
   private short RcdFound15 ;
   private int wcpOAV19Num_Linea ;
   private int Z94Num_Linea ;
   private int Z618Cantidad_Diponible ;
   private int Z619Cantidad_Transito ;
   private int AV19Num_Linea ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRegional_Enabled ;
   private int edtCentro_Id_Enabled ;
   private int edtAlma_Codigo_Enabled ;
   private int edtBode_Codigo_Enabled ;
   private int imgprompt_31_Visible ;
   private int edtTrans_Id_Enabled ;
   private int imgprompt_93_Visible ;
   private int edtElem_Consecutivo_Enabled ;
   private int imgprompt_66_Visible ;
   private int A94Num_Linea ;
   private int edtNum_Linea_Enabled ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Codigo_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int A618Cantidad_Diponible ;
   private int edtCantidad_Diponible_Enabled ;
   private int A619Cantidad_Transito ;
   private int edtCantidad_Transito_Enabled ;
   private int edtValor_Unitario_Enabled ;
   private int edtOtros_Costos_Enabled ;
   private int edtCosto_Total_Enabled ;
   private int edtDescrip_Atributos_Enabled ;
   private int edtTrans_ConsecutivoCC_Enabled ;
   private int edtTrans_FechaRatificacion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV21Regional ;
   private long wcpOAV26Centro_Id ;
   private long wcpOAV22Trans_Id ;
   private long Z91Regional ;
   private long Z92Centro_Id ;
   private long Z93Trans_Id ;
   private long A93Trans_Id ;
   private long AV21Regional ;
   private long AV26Centro_Id ;
   private long AV22Trans_Id ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A710Trans_ConsecutivoCC ;
   private long Z710Trans_ConsecutivoCC ;
   private java.math.BigDecimal Z620Valor_Unitario ;
   private java.math.BigDecimal Z621Otros_Costos ;
   private java.math.BigDecimal Z622Costo_Total ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal A622Costo_Total ;
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
   private String edtRegional_Internalname ;
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
   private String edtRegional_Jsonclick ;
   private String edtCentro_Id_Internalname ;
   private String edtCentro_Id_Jsonclick ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtBode_Codigo_Internalname ;
   private String edtBode_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_31_Internalname ;
   private String imgprompt_31_Link ;
   private String edtTrans_Id_Internalname ;
   private String edtTrans_Id_Jsonclick ;
   private String imgprompt_93_Internalname ;
   private String imgprompt_93_Link ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String imgprompt_66_Internalname ;
   private String imgprompt_66_Link ;
   private String edtNum_Linea_Internalname ;
   private String edtNum_Linea_Jsonclick ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Internalname ;
   private String edtCantidad_Diponible_Internalname ;
   private String edtCantidad_Diponible_Jsonclick ;
   private String edtCantidad_Transito_Internalname ;
   private String edtCantidad_Transito_Jsonclick ;
   private String edtValor_Unitario_Internalname ;
   private String edtValor_Unitario_Jsonclick ;
   private String edtOtros_Costos_Internalname ;
   private String edtOtros_Costos_Jsonclick ;
   private String edtCosto_Total_Internalname ;
   private String edtCosto_Total_Jsonclick ;
   private String edtDescrip_Atributos_Internalname ;
   private String edtTrans_ConsecutivoCC_Internalname ;
   private String edtTrans_ConsecutivoCC_Jsonclick ;
   private String edtTrans_FechaRatificacion_Internalname ;
   private String edtTrans_FechaRatificacion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV27Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode15 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date A709Trans_FechaRatificacion ;
   private java.util.Date Z709Trans_FechaRatificacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n618Cantidad_Diponible ;
   private boolean n619Cantidad_Transito ;
   private boolean n621Otros_Costos ;
   private boolean n623Descrip_Atributos ;
   private boolean n710Trans_ConsecutivoCC ;
   private boolean n709Trans_FechaRatificacion ;
   private boolean returnInSub ;
   private String A623Descrip_Atributos ;
   private String Z623Descrip_Atributos ;
   private String wcpOAV8Alma_Modulo ;
   private String wcpOAV7Alma_Codigo ;
   private String wcpOAV9Bode_Codigo ;
   private String wcpOAV12Elem_Consecutivo ;
   private String Z27Alma_Modulo ;
   private String Z28Alma_Codigo ;
   private String Z31Bode_Codigo ;
   private String Z66Elem_Consecutivo ;
   private String A31Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String AV8Alma_Modulo ;
   private String AV7Alma_Codigo ;
   private String AV9Bode_Codigo ;
   private String AV12Elem_Consecutivo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String Z557Elem_Descripcion ;
   private String Z37Cata_Codigo ;
   private String Z298Cata_Descripcion ;
   private com.genexus.webpanels.WebSession AV25WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbAlma_Modulo ;
   private IDataStoreProvider pr_default ;
   private long[] T000B6_A710Trans_ConsecutivoCC ;
   private boolean[] T000B6_n710Trans_ConsecutivoCC ;
   private java.util.Date[] T000B6_A709Trans_FechaRatificacion ;
   private boolean[] T000B6_n709Trans_FechaRatificacion ;
   private String[] T000B5_A557Elem_Descripcion ;
   private String[] T000B5_A37Cata_Codigo ;
   private String[] T000B7_A298Cata_Descripcion ;
   private String[] T000B8_A623Descrip_Atributos ;
   private boolean[] T000B8_n623Descrip_Atributos ;
   private long[] T000B8_A91Regional ;
   private long[] T000B8_A92Centro_Id ;
   private int[] T000B8_A94Num_Linea ;
   private String[] T000B8_A557Elem_Descripcion ;
   private String[] T000B8_A298Cata_Descripcion ;
   private int[] T000B8_A618Cantidad_Diponible ;
   private boolean[] T000B8_n618Cantidad_Diponible ;
   private int[] T000B8_A619Cantidad_Transito ;
   private boolean[] T000B8_n619Cantidad_Transito ;
   private java.math.BigDecimal[] T000B8_A620Valor_Unitario ;
   private java.math.BigDecimal[] T000B8_A621Otros_Costos ;
   private boolean[] T000B8_n621Otros_Costos ;
   private java.math.BigDecimal[] T000B8_A622Costo_Total ;
   private long[] T000B8_A710Trans_ConsecutivoCC ;
   private boolean[] T000B8_n710Trans_ConsecutivoCC ;
   private java.util.Date[] T000B8_A709Trans_FechaRatificacion ;
   private boolean[] T000B8_n709Trans_FechaRatificacion ;
   private String[] T000B8_A31Bode_Codigo ;
   private String[] T000B8_A66Elem_Consecutivo ;
   private long[] T000B8_A93Trans_Id ;
   private String[] T000B8_A37Cata_Codigo ;
   private String[] T000B8_A27Alma_Modulo ;
   private String[] T000B8_A28Alma_Codigo ;
   private String[] T000B4_A31Bode_Codigo ;
   private String[] T000B9_A31Bode_Codigo ;
   private long[] T000B10_A710Trans_ConsecutivoCC ;
   private boolean[] T000B10_n710Trans_ConsecutivoCC ;
   private java.util.Date[] T000B10_A709Trans_FechaRatificacion ;
   private boolean[] T000B10_n709Trans_FechaRatificacion ;
   private String[] T000B11_A557Elem_Descripcion ;
   private String[] T000B11_A37Cata_Codigo ;
   private String[] T000B12_A298Cata_Descripcion ;
   private long[] T000B13_A91Regional ;
   private long[] T000B13_A92Centro_Id ;
   private String[] T000B13_A27Alma_Modulo ;
   private String[] T000B13_A28Alma_Codigo ;
   private String[] T000B13_A31Bode_Codigo ;
   private long[] T000B13_A93Trans_Id ;
   private String[] T000B13_A66Elem_Consecutivo ;
   private int[] T000B13_A94Num_Linea ;
   private String[] T000B3_A623Descrip_Atributos ;
   private boolean[] T000B3_n623Descrip_Atributos ;
   private long[] T000B3_A91Regional ;
   private long[] T000B3_A92Centro_Id ;
   private int[] T000B3_A94Num_Linea ;
   private int[] T000B3_A618Cantidad_Diponible ;
   private boolean[] T000B3_n618Cantidad_Diponible ;
   private int[] T000B3_A619Cantidad_Transito ;
   private boolean[] T000B3_n619Cantidad_Transito ;
   private java.math.BigDecimal[] T000B3_A620Valor_Unitario ;
   private java.math.BigDecimal[] T000B3_A621Otros_Costos ;
   private boolean[] T000B3_n621Otros_Costos ;
   private java.math.BigDecimal[] T000B3_A622Costo_Total ;
   private String[] T000B3_A31Bode_Codigo ;
   private String[] T000B3_A66Elem_Consecutivo ;
   private long[] T000B3_A93Trans_Id ;
   private String[] T000B3_A27Alma_Modulo ;
   private String[] T000B3_A28Alma_Codigo ;
   private long[] T000B14_A91Regional ;
   private long[] T000B14_A92Centro_Id ;
   private String[] T000B14_A27Alma_Modulo ;
   private String[] T000B14_A28Alma_Codigo ;
   private String[] T000B14_A31Bode_Codigo ;
   private long[] T000B14_A93Trans_Id ;
   private String[] T000B14_A66Elem_Consecutivo ;
   private int[] T000B14_A94Num_Linea ;
   private long[] T000B15_A91Regional ;
   private long[] T000B15_A92Centro_Id ;
   private String[] T000B15_A27Alma_Modulo ;
   private String[] T000B15_A28Alma_Codigo ;
   private String[] T000B15_A31Bode_Codigo ;
   private long[] T000B15_A93Trans_Id ;
   private String[] T000B15_A66Elem_Consecutivo ;
   private int[] T000B15_A94Num_Linea ;
   private String[] T000B2_A623Descrip_Atributos ;
   private boolean[] T000B2_n623Descrip_Atributos ;
   private long[] T000B2_A91Regional ;
   private long[] T000B2_A92Centro_Id ;
   private int[] T000B2_A94Num_Linea ;
   private int[] T000B2_A618Cantidad_Diponible ;
   private boolean[] T000B2_n618Cantidad_Diponible ;
   private int[] T000B2_A619Cantidad_Transito ;
   private boolean[] T000B2_n619Cantidad_Transito ;
   private java.math.BigDecimal[] T000B2_A620Valor_Unitario ;
   private java.math.BigDecimal[] T000B2_A621Otros_Costos ;
   private boolean[] T000B2_n621Otros_Costos ;
   private java.math.BigDecimal[] T000B2_A622Costo_Total ;
   private String[] T000B2_A31Bode_Codigo ;
   private String[] T000B2_A66Elem_Consecutivo ;
   private long[] T000B2_A93Trans_Id ;
   private String[] T000B2_A27Alma_Modulo ;
   private String[] T000B2_A28Alma_Codigo ;
   private long[] T000B19_A710Trans_ConsecutivoCC ;
   private boolean[] T000B19_n710Trans_ConsecutivoCC ;
   private java.util.Date[] T000B19_A709Trans_FechaRatificacion ;
   private boolean[] T000B19_n709Trans_FechaRatificacion ;
   private String[] T000B20_A557Elem_Descripcion ;
   private String[] T000B20_A37Cata_Codigo ;
   private String[] T000B21_A298Cata_Descripcion ;
   private long[] T000B22_A91Regional ;
   private long[] T000B22_A92Centro_Id ;
   private String[] T000B22_A27Alma_Modulo ;
   private String[] T000B22_A28Alma_Codigo ;
   private String[] T000B22_A31Bode_Codigo ;
   private long[] T000B22_A93Trans_Id ;
   private String[] T000B22_A66Elem_Consecutivo ;
   private int[] T000B22_A94Num_Linea ;
   private String[] T000B23_A31Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV23TrnContext ;
}

final  class alm_inv_con__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000B2", "SELECT Descrip_Atributos, Regional, Centro_Id, Num_Linea, Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos, Costo_Total, Bode_Codigo, Elem_Consecutivo, Trans_Id, Alma_Modulo, Alma_Codigo FROM ALM_INV_CON WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?  FOR UPDATE OF Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos, Costo_Total, Descrip_Atributos NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B3", "SELECT Descrip_Atributos, Regional, Centro_Id, Num_Linea, Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos, Costo_Total, Bode_Codigo, Elem_Consecutivo, Trans_Id, Alma_Modulo, Alma_Codigo FROM ALM_INV_CON WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B4", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B5", "SELECT Elem_Descripcion, Cata_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B6", "SELECT Tran_ConsecutivoCC AS Trans_ConsecutivoCC, Tran_FechaRatificacion AS Trans_FechaRatificacion FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B7", "SELECT Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Descrip_Atributos, TM1.Regional, TM1.Centro_Id, TM1.Num_Linea, T3.Elem_Descripcion, T4.Cata_Descripcion, TM1.Cantidad_Diponible, TM1.Cantidad_Transito, TM1.Valor_Unitario, TM1.Otros_Costos, TM1.Costo_Total, T2.Tran_ConsecutivoCC AS Trans_ConsecutivoCC, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion, TM1.Bode_Codigo, TM1.Elem_Consecutivo, TM1.Trans_Id AS Trans_Id, T3.Cata_Codigo, TM1.Alma_Modulo, TM1.Alma_Codigo FROM (((ALM_INV_CON TM1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = TM1.Trans_Id) INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = TM1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo) WHERE TM1.Regional = ? and TM1.Centro_Id = ? and TM1.Alma_Modulo = ? and TM1.Alma_Codigo = ? and TM1.Bode_Codigo = ? and TM1.Trans_Id = ? and TM1.Elem_Consecutivo = ? and TM1.Num_Linea = ? ORDER BY TM1.Regional, TM1.Centro_Id, TM1.Alma_Modulo, TM1.Alma_Codigo, TM1.Bode_Codigo, TM1.Trans_Id, TM1.Elem_Consecutivo, TM1.Num_Linea ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000B9", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B10", "SELECT Tran_ConsecutivoCC AS Trans_ConsecutivoCC, Tran_FechaRatificacion AS Trans_FechaRatificacion FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B11", "SELECT Elem_Descripcion, Cata_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B12", "SELECT Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B13", "SELECT /*+ FIRST_ROWS(1) */ Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE ( Regional > ? or Regional = ? and Centro_Id > ? or Centro_Id = ? and Regional = ? and Alma_Modulo > ? or Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Alma_Codigo > ? or Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Bode_Codigo > ? or Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Trans_Id > ? or Trans_Id = ? and Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Elem_Consecutivo > ? or Elem_Consecutivo = ? and Trans_Id = ? and Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Num_Linea > ?) ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE ( Regional < ? or Regional = ? and Centro_Id < ? or Centro_Id = ? and Regional = ? and Alma_Modulo < ? or Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Alma_Codigo < ? or Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Bode_Codigo < ? or Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Trans_Id < ? or Trans_Id = ? and Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Elem_Consecutivo < ? or Elem_Consecutivo = ? and Trans_Id = ? and Bode_Codigo = ? and Alma_Codigo = ? and Alma_Modulo = ? and Centro_Id = ? and Regional = ? and Num_Linea < ?) ORDER BY Regional DESC, Centro_Id DESC, Alma_Modulo DESC, Alma_Codigo DESC, Bode_Codigo DESC, Trans_Id DESC, Elem_Consecutivo DESC, Num_Linea DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000B16", "INSERT INTO ALM_INV_CON(Regional, Centro_Id, Num_Linea, Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos, Costo_Total, Descrip_Atributos, Bode_Codigo, Elem_Consecutivo, Trans_Id, Alma_Modulo, Alma_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_INV_CON")
         ,new UpdateCursor("T000B17", "UPDATE ALM_INV_CON SET Cantidad_Diponible=?, Cantidad_Transito=?, Valor_Unitario=?, Otros_Costos=?, Costo_Total=?, Descrip_Atributos=?  WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?", GX_NOMASK, "ALM_INV_CON")
         ,new UpdateCursor("T000B18", "DELETE FROM ALM_INV_CON  WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?", GX_NOMASK, "ALM_INV_CON")
         ,new ForEachCursor("T000B19", "SELECT Tran_ConsecutivoCC AS Trans_ConsecutivoCC, Tran_FechaRatificacion AS Trans_FechaRatificacion FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B20", "SELECT Elem_Descripcion, Cata_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B21", "SELECT Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B22", "SELECT /*+ FIRST_ROWS(100) */ Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000B23", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[7])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2) ;
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(15) ;
               ((long[]) buf[21])[0] = rslt.getLong(16) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(19) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 21 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 8, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 2, false);
               stmt.setVarchar(11, (String)parms[10], 2, false);
               stmt.setVarchar(12, (String)parms[11], 8, false);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setVarchar(15, (String)parms[14], 3, false);
               stmt.setVarchar(16, (String)parms[15], 3, false);
               stmt.setVarchar(17, (String)parms[16], 2, false);
               stmt.setVarchar(18, (String)parms[17], 8, false);
               stmt.setLong(19, ((Number) parms[18]).longValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setVarchar(23, (String)parms[22], 3, false);
               stmt.setVarchar(24, (String)parms[23], 2, false);
               stmt.setVarchar(25, (String)parms[24], 8, false);
               stmt.setLong(26, ((Number) parms[25]).longValue());
               stmt.setLong(27, ((Number) parms[26]).longValue());
               stmt.setVarchar(28, (String)parms[27], 9, false);
               stmt.setVarchar(29, (String)parms[28], 9, false);
               stmt.setLong(30, ((Number) parms[29]).longValue());
               stmt.setVarchar(31, (String)parms[30], 3, false);
               stmt.setVarchar(32, (String)parms[31], 2, false);
               stmt.setVarchar(33, (String)parms[32], 8, false);
               stmt.setLong(34, ((Number) parms[33]).longValue());
               stmt.setLong(35, ((Number) parms[34]).longValue());
               stmt.setInt(36, ((Number) parms[35]).intValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 8, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 2, false);
               stmt.setVarchar(11, (String)parms[10], 2, false);
               stmt.setVarchar(12, (String)parms[11], 8, false);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setVarchar(15, (String)parms[14], 3, false);
               stmt.setVarchar(16, (String)parms[15], 3, false);
               stmt.setVarchar(17, (String)parms[16], 2, false);
               stmt.setVarchar(18, (String)parms[17], 8, false);
               stmt.setLong(19, ((Number) parms[18]).longValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               stmt.setLong(22, ((Number) parms[21]).longValue());
               stmt.setVarchar(23, (String)parms[22], 3, false);
               stmt.setVarchar(24, (String)parms[23], 2, false);
               stmt.setVarchar(25, (String)parms[24], 8, false);
               stmt.setLong(26, ((Number) parms[25]).longValue());
               stmt.setLong(27, ((Number) parms[26]).longValue());
               stmt.setVarchar(28, (String)parms[27], 9, false);
               stmt.setVarchar(29, (String)parms[28], 9, false);
               stmt.setLong(30, ((Number) parms[29]).longValue());
               stmt.setVarchar(31, (String)parms[30], 3, false);
               stmt.setVarchar(32, (String)parms[31], 2, false);
               stmt.setVarchar(33, (String)parms[32], 8, false);
               stmt.setLong(34, ((Number) parms[33]).longValue());
               stmt.setLong(35, ((Number) parms[34]).longValue());
               stmt.setInt(36, ((Number) parms[35]).intValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[12]);
               }
               stmt.setVarchar(10, (String)parms[13], 3, false);
               stmt.setVarchar(11, (String)parms[14], 9, false);
               stmt.setLong(12, ((Number) parms[15]).longValue());
               stmt.setVarchar(13, (String)parms[16], 8, false);
               stmt.setVarchar(14, (String)parms[17], 2, false);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[9]);
               }
               stmt.setLong(7, ((Number) parms[10]).longValue());
               stmt.setLong(8, ((Number) parms[11]).longValue());
               stmt.setVarchar(9, (String)parms[12], 8, false);
               stmt.setVarchar(10, (String)parms[13], 2, false);
               stmt.setVarchar(11, (String)parms[14], 3, false);
               stmt.setLong(12, ((Number) parms[15]).longValue());
               stmt.setVarchar(13, (String)parms[16], 9, false);
               stmt.setInt(14, ((Number) parms[17]).intValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

