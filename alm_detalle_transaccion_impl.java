/*
               File: alm_detalle_transaccion_impl
        Description: Detalle transacción
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:47.48
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

public final  class alm_detalle_transaccion_impl extends GXDataArea
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
         A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A46Tran_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A49Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A49Tran_CodigoMovimiento) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A66Elem_Consecutivo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A37Cata_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A37Cata_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A34Clas_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A34Clas_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A35FAM_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A35FAM_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A70TDet_ListId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A70TDet_ListId) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_detalle_transaccion_atributos") == 0 )
      {
         nRC_GXsfl_114 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_114_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_114_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_detalle_transaccion_atributos_newrow( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_detalle_transaccion_datos_salida") == 0 )
      {
         nRC_GXsfl_127 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_127_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_127_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_detalle_transaccion_datos_salida_newrow( ) ;
         return  ;
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
            AV7Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Tran_Id", GXutil.ltrim( GXutil.str( AV7Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Tran_Id), "ZZZZZZZZZZ9")));
            AV8TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8TDet_Consecutivo", GXutil.ltrim( GXutil.str( AV8TDet_Consecutivo, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTDET_CONSECUTIVO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
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
      GXCCtl = "TDET_LISTTIPO_" + sGXsfl_114_idx ;
      cmbTDet_ListTipo.setName( GXCCtl );
      cmbTDet_ListTipo.setWebtags( "" );
      cmbTDet_ListTipo.addItem("O", "Otro", (short)(0));
      cmbTDet_ListTipo.addItem("F", "Fecha", (short)(0));
      if ( cmbTDet_ListTipo.getItemCount() > 0 )
      {
         A493TDet_ListTipo = cmbTDet_ListTipo.getValidValue(A493TDet_ListTipo) ;
         n493TDet_ListTipo = false ;
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
         Form.getMeta().addItem("description", "Detalle transacción", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTran_Id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_detalle_transaccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_detalle_transaccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_detalle_transaccion_impl.class ));
   }

   public alm_detalle_transaccion_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTDet_ListTipo = new HTMLChoice();
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Detalle transacción", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx00c0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_ID"+"'), id:'"+"TRAN_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"TDET_CONSECUTIVO"+"'), id:'"+"TDET_CONSECUTIVO"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_46_Internalname, sImgUrl, imgprompt_46_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_46_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Consecutivo_Internalname, "Item", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Consecutivo_Internalname, GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A69TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Consecutivo_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_66_Internalname, sImgUrl, imgprompt_66_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_66_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, "", "", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, "", "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Cantidad_Internalname, "Cantidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")), ((edtTDet_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A487TDet_Cantidad), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Cantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Cantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_ValorUnitario_Internalname, "Unitario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_ValorUnitario_Internalname, GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtTDet_ValorUnitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A488TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_ValorUnitario_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_ValorUnitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_ValorTotal_Internalname, "Total", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_ValorTotal_Internalname, GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")), ((edtTDet_ValorTotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A489TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_ValorTotal_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_ValorTotal_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_PlacaNumero_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_PlacaNumero_Internalname, A490TDet_PlacaNumero, GXutil.rtrim( localUtil.format( A490TDet_PlacaNumero, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_PlacaNumero_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_PlacaNumero_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTDet_Observaciones_Internalname, A504TDet_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtTDet_Observaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_PlacaPadre_Internalname, "Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_PlacaPadre_Internalname, A491TDet_PlacaPadre, GXutil.rtrim( localUtil.format( A491TDet_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_PlacaPadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_PlacaPadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_EsPadre_Internalname, "es Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_EsPadre_Internalname, A505TDet_EsPadre, GXutil.rtrim( localUtil.format( A505TDet_EsPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_EsPadre_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_EsPadre_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Atributos_Internalname, "TDet_Atributos", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Atributos_Internalname, A525TDet_Atributos, GXutil.rtrim( localUtil.format( A525TDet_Atributos, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Atributos_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Atributos_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Valor_Presente_Internalname, "Presente", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Valor_Presente_Internalname, GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Valor_Presente_Enabled!=0) ? GXutil.ltrim( localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A653TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Valor_Presente_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Valor_Presente_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Valor_Futuro_Internalname, "Futuro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Valor_Futuro_Internalname, GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Valor_Futuro_Enabled!=0) ? GXutil.ltrim( localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A654TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Valor_Futuro_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Valor_Futuro_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Taza_Internalname, "Taza", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Taza_Internalname, GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ",", "")), ((edtTDet_Taza_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A655TDet_Taza), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Taza_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Taza_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Plazo_N_Internalname, "N", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Plazo_N_Internalname, GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")), ((edtTDet_Plazo_N_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A656TDet_Plazo_N), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Plazo_N_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Plazo_N_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Otros_Costos_Internalname, "Costos", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Otros_Costos_Internalname, GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtTDet_Otros_Costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A657TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Otros_Costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Otros_Costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTDet_Agrupado_Internalname, "Grupo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTDet_Agrupado_Internalname, GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ",", "")), ((edtTDet_Agrupado_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A658TDet_Agrupado), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTDet_Agrupado_Jsonclick, 0, "Attribute", "", "", "", 1, edtTDet_Agrupado_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAtributostable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleatributos_Internalname, "ATRIBUTOS", "", "", lblTitleatributos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_detalle_transaccion_atributos( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divDatos_salidatable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitledatos_salida_Internalname, "DATOS_SALIDA", "", "", lblTitledatos_salida_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_detalle_transaccion_datos_salida( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DETALLE_TRANSACCION.htm");
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

   public void gxdraw_gridalm_detalle_transaccion_atributos( )
   {
      /*  Grid Control  */
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("GridName", "Gridalm_detalle_transaccion_atributos");
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Class", "Grid");
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("CmpContext", "");
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_detalle_transaccion_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddColumnProperties(Gridalm_detalle_transaccion_atributosColumn);
      Gridalm_detalle_transaccion_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_atributosContainer.AddColumnProperties(Gridalm_detalle_transaccion_atributosColumn);
      Gridalm_detalle_transaccion_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Value", A492TDet_ListDescripcion);
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListDescripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddColumnProperties(Gridalm_detalle_transaccion_atributosColumn);
      Gridalm_detalle_transaccion_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Value", GXutil.rtrim( A493TDet_ListTipo));
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTDet_ListTipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddColumnProperties(Gridalm_detalle_transaccion_atributosColumn);
      Gridalm_detalle_transaccion_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Value", A494TDet_ValorAtributo);
      Gridalm_detalle_transaccion_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ValorAtributo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddColumnProperties(Gridalm_detalle_transaccion_atributosColumn);
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_atributosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_atributos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_114_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount13 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_13 = (short)(1) ;
            scanStart0A13( ) ;
            while ( RcdFound13 != 0 )
            {
               init_level_properties13( ) ;
               getByPrimaryKey0A13( ) ;
               addRow0A13( ) ;
               scanNext0A13( ) ;
            }
            scanEnd0A13( ) ;
            nBlankRcdCount13 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0A13( ) ;
         standaloneModal0A13( ) ;
         sMode13 = Gx_mode ;
         while ( nGXsfl_114_idx < nRC_GXsfl_114 )
         {
            bGXsfl_114_Refreshing = true ;
            readRow0A13( ) ;
            edtTDet_ListId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTID_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListId_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
            edtTDet_ListDescripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListDescripcion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
            cmbTDet_ListTipo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTTIPO_"+sGXsfl_114_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTDet_ListTipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTDet_ListTipo.getEnabled(), 5, 0)), !bGXsfl_114_Refreshing);
            edtTDet_ValorAtributo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_VALORATRIBUTO_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTDet_ValorAtributo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ValorAtributo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
            imgprompt_46_Link = httpContext.cgiGet( "PROMPT_70_"+sGXsfl_114_idx+"Link") ;
            if ( ( nRcdExists_13 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0A13( ) ;
            }
            sendRow0A13( ) ;
            bGXsfl_114_Refreshing = false ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount13 = (short)(5) ;
         nRcdExists_13 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0A13( ) ;
            while ( RcdFound13 != 0 )
            {
               sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_11413( ) ;
               init_level_properties13( ) ;
               standaloneNotModal0A13( ) ;
               getByPrimaryKey0A13( ) ;
               standaloneModal0A13( ) ;
               addRow0A13( ) ;
               scanNext0A13( ) ;
            }
            scanEnd0A13( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode13 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11413( ) ;
         initAll0A13( ) ;
         init_level_properties13( ) ;
         standaloneNotModal0A13( ) ;
         standaloneModal0A13( ) ;
         nRcdExists_13 = (short)(0) ;
         nIsMod_13 = (short)(0) ;
         nRcdDeleted_13 = (short)(0) ;
         nBlankRcdCount13 = (short)(nBlankRcdUsr13+nBlankRcdCount13) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount13 > 0 )
         {
            addRow0A13( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTDet_ListId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount13 = (short)(nBlankRcdCount13-1) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_detalle_transaccion_atributosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_detalle_transaccion_atributos", Gridalm_detalle_transaccion_atributosContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_detalle_transaccion_atributosContainerData", Gridalm_detalle_transaccion_atributosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_detalle_transaccion_atributosContainerData"+"V", Gridalm_detalle_transaccion_atributosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_detalle_transaccion_atributosContainerData"+"V"+"\" value='"+Gridalm_detalle_transaccion_atributosContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridalm_detalle_transaccion_datos_salida( )
   {
      /*  Grid Control  */
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("GridName", "Gridalm_detalle_transaccion_datos_salida");
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Class", "Grid");
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("CmpContext", "");
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_detalle_transaccion_datos_salidaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Entrada_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddColumnProperties(Gridalm_detalle_transaccion_datos_salidaColumn);
      Gridalm_detalle_transaccion_datos_salidaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNro_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddColumnProperties(Gridalm_detalle_transaccion_datos_salidaColumn);
      Gridalm_detalle_transaccion_datos_salidaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A687Tran_Cantidad, (byte)(8), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Cantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddColumnProperties(Gridalm_detalle_transaccion_datos_salidaColumn);
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_detalle_transaccion_datos_salidaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_detalle_transaccion_datos_salida_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_127_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount14 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_14 = (short)(1) ;
            scanStart0A14( ) ;
            while ( RcdFound14 != 0 )
            {
               init_level_properties14( ) ;
               getByPrimaryKey0A14( ) ;
               addRow0A14( ) ;
               scanNext0A14( ) ;
            }
            scanEnd0A14( ) ;
            nBlankRcdCount14 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0A14( ) ;
         standaloneModal0A14( ) ;
         sMode14 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRow0A14( ) ;
            edtTran_Entrada_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_ENTRADA_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Entrada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Entrada_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            edtNro_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NRO_LINEA_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNro_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNro_Linea_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            edtTran_Cantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_CANTIDAD_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Cantidad_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            if ( ( nRcdExists_14 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0A14( ) ;
            }
            sendRow0A14( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount14 = (short)(5) ;
         nRcdExists_14 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0A14( ) ;
            while ( RcdFound14 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_12714( ) ;
               init_level_properties14( ) ;
               standaloneNotModal0A14( ) ;
               getByPrimaryKey0A14( ) ;
               standaloneModal0A14( ) ;
               addRow0A14( ) ;
               scanNext0A14( ) ;
            }
            scanEnd0A14( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode14 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12714( ) ;
         initAll0A14( ) ;
         init_level_properties14( ) ;
         standaloneNotModal0A14( ) ;
         standaloneModal0A14( ) ;
         nRcdExists_14 = (short)(0) ;
         nIsMod_14 = (short)(0) ;
         nRcdDeleted_14 = (short)(0) ;
         nBlankRcdCount14 = (short)(nBlankRcdUsr14+nBlankRcdCount14) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount14 > 0 )
         {
            addRow0A14( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTran_Entrada_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount14 = (short)(nBlankRcdCount14-1) ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_detalle_transaccion_datos_salidaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_detalle_transaccion_datos_salida", Gridalm_detalle_transaccion_datos_salidaContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_detalle_transaccion_datos_salidaContainerData", Gridalm_detalle_transaccion_datos_salidaContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_detalle_transaccion_datos_salidaContainerData"+"V", Gridalm_detalle_transaccion_datos_salidaContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_detalle_transaccion_datos_salidaContainerData"+"V"+"\" value='"+Gridalm_detalle_transaccion_datos_salidaContainer.GridValuesHidden()+"'/>") ;
      }
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
      e110A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A46Tran_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            }
            else
            {
               A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_CONSECUTIVO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A69TDet_Consecutivo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
            }
            else
            {
               A69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtTDet_Consecutivo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
            }
            A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
            A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_CANTIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Cantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A487TDet_Cantidad = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
            }
            else
            {
               A487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtTDet_Cantidad_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_VALORUNITARIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_ValorUnitario_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A488TDet_ValorUnitario = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
            }
            else
            {
               A488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorUnitario_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_VALORTOTAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_ValorTotal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A489TDet_ValorTotal = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
            }
            else
            {
               A489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtTDet_ValorTotal_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
            }
            A490TDet_PlacaNumero = httpContext.cgiGet( edtTDet_PlacaNumero_Internalname) ;
            n490TDet_PlacaNumero = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
            n490TDet_PlacaNumero = ((GXutil.strcmp("", A490TDet_PlacaNumero)==0) ? true : false) ;
            A504TDet_Observaciones = httpContext.cgiGet( edtTDet_Observaciones_Internalname) ;
            n504TDet_Observaciones = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A504TDet_Observaciones", A504TDet_Observaciones);
            n504TDet_Observaciones = ((GXutil.strcmp("", A504TDet_Observaciones)==0) ? true : false) ;
            A491TDet_PlacaPadre = httpContext.cgiGet( edtTDet_PlacaPadre_Internalname) ;
            n491TDet_PlacaPadre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
            n491TDet_PlacaPadre = ((GXutil.strcmp("", A491TDet_PlacaPadre)==0) ? true : false) ;
            A505TDet_EsPadre = httpContext.cgiGet( edtTDet_EsPadre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A505TDet_EsPadre", A505TDet_EsPadre);
            A525TDet_Atributos = httpContext.cgiGet( edtTDet_Atributos_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A525TDet_Atributos", A525TDet_Atributos);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_VALOR_PRESENTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Valor_Presente_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A653TDet_Valor_Presente = DecimalUtil.ZERO ;
               n653TDet_Valor_Presente = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
            }
            else
            {
               A653TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Presente_Internalname)) ;
               n653TDet_Valor_Presente = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
            }
            n653TDet_Valor_Presente = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A653TDet_Valor_Presente)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Futuro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Futuro_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_VALOR_FUTURO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Valor_Futuro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
               n654TDet_Valor_Futuro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
            }
            else
            {
               A654TDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( edtTDet_Valor_Futuro_Internalname)) ;
               n654TDet_Valor_Futuro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
            }
            n654TDet_Valor_Futuro = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A654TDet_Valor_Futuro)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Taza_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Taza_Internalname), ",", ".") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_TAZA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Taza_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A655TDet_Taza = (short)(0) ;
               n655TDet_Taza = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
            }
            else
            {
               A655TDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Taza_Internalname), ",", ".")) ;
               n655TDet_Taza = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
            }
            n655TDet_Taza = ((0==A655TDet_Taza) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Plazo_N_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Plazo_N_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_PLAZO_N");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Plazo_N_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A656TDet_Plazo_N = (byte)(0) ;
               n656TDet_Plazo_N = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
            }
            else
            {
               A656TDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( edtTDet_Plazo_N_Internalname), ",", ".")) ;
               n656TDet_Plazo_N = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
            }
            n656TDet_Plazo_N = ((0==A656TDet_Plazo_N) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_OTROS_COSTOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Otros_Costos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A657TDet_Otros_Costos = DecimalUtil.ZERO ;
               n657TDet_Otros_Costos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
            }
            else
            {
               A657TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtTDet_Otros_Costos_Internalname)) ;
               n657TDet_Otros_Costos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
            }
            n657TDet_Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A657TDet_Otros_Costos)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Agrupado_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_Agrupado_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TDET_AGRUPADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTDet_Agrupado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658TDet_Agrupado = (short)(0) ;
               n658TDet_Agrupado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
            }
            else
            {
               A658TDet_Agrupado = (short)(localUtil.ctol( httpContext.cgiGet( edtTDet_Agrupado_Internalname), ",", ".")) ;
               n658TDet_Agrupado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
            }
            n658TDet_Agrupado = ((0==A658TDet_Agrupado) ? true : false) ;
            /* Read saved values. */
            Z46Tran_Id = localUtil.ctol( httpContext.cgiGet( "Z46Tran_Id"), ",", ".") ;
            Z69TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( "Z69TDet_Consecutivo"), ",", ".") ;
            Z487TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( "Z487TDet_Cantidad"), ",", ".") ;
            Z488TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( "Z488TDet_ValorUnitario")) ;
            Z489TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( "Z489TDet_ValorTotal")) ;
            Z490TDet_PlacaNumero = httpContext.cgiGet( "Z490TDet_PlacaNumero") ;
            n490TDet_PlacaNumero = ((GXutil.strcmp("", A490TDet_PlacaNumero)==0) ? true : false) ;
            Z504TDet_Observaciones = httpContext.cgiGet( "Z504TDet_Observaciones") ;
            n504TDet_Observaciones = ((GXutil.strcmp("", A504TDet_Observaciones)==0) ? true : false) ;
            Z491TDet_PlacaPadre = httpContext.cgiGet( "Z491TDet_PlacaPadre") ;
            n491TDet_PlacaPadre = ((GXutil.strcmp("", A491TDet_PlacaPadre)==0) ? true : false) ;
            Z505TDet_EsPadre = httpContext.cgiGet( "Z505TDet_EsPadre") ;
            Z525TDet_Atributos = httpContext.cgiGet( "Z525TDet_Atributos") ;
            Z653TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( "Z653TDet_Valor_Presente")) ;
            n653TDet_Valor_Presente = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A653TDet_Valor_Presente)==0) ? true : false) ;
            Z654TDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( "Z654TDet_Valor_Futuro")) ;
            n654TDet_Valor_Futuro = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A654TDet_Valor_Futuro)==0) ? true : false) ;
            Z655TDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( "Z655TDet_Taza"), ",", ".")) ;
            n655TDet_Taza = ((0==A655TDet_Taza) ? true : false) ;
            Z656TDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( "Z656TDet_Plazo_N"), ",", ".")) ;
            n656TDet_Plazo_N = ((0==A656TDet_Plazo_N) ? true : false) ;
            Z657TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( "Z657TDet_Otros_Costos")) ;
            n657TDet_Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A657TDet_Otros_Costos)==0) ? true : false) ;
            Z658TDet_Agrupado = (short)(localUtil.ctol( httpContext.cgiGet( "Z658TDet_Agrupado"), ",", ".")) ;
            n658TDet_Agrupado = ((0==A658TDet_Agrupado) ? true : false) ;
            Z817TDet_PlacaRecuperada = httpContext.cgiGet( "Z817TDet_PlacaRecuperada") ;
            n817TDet_PlacaRecuperada = ((GXutil.strcmp("", A817TDet_PlacaRecuperada)==0) ? true : false) ;
            Z66Elem_Consecutivo = httpContext.cgiGet( "Z66Elem_Consecutivo") ;
            A817TDet_PlacaRecuperada = httpContext.cgiGet( "Z817TDet_PlacaRecuperada") ;
            n817TDet_PlacaRecuperada = false ;
            n817TDet_PlacaRecuperada = ((GXutil.strcmp("", A817TDet_PlacaRecuperada)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_114 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_114"), ",", ".")) ;
            nRC_GXsfl_127 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_127"), ",", ".")) ;
            N66Elem_Consecutivo = httpContext.cgiGet( "N66Elem_Consecutivo") ;
            AV7Tran_Id = localUtil.ctol( httpContext.cgiGet( "vTRAN_ID"), ",", ".") ;
            AV8TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( "vTDET_CONSECUTIVO"), ",", ".") ;
            AV15Insert_Elem_Consecutivo = httpContext.cgiGet( "vINSERT_ELEM_CONSECUTIVO") ;
            A817TDet_PlacaRecuperada = httpContext.cgiGet( "TDET_PLACARECUPERADA") ;
            n817TDet_PlacaRecuperada = ((GXutil.strcmp("", A817TDet_PlacaRecuperada)==0) ? true : false) ;
            A37Cata_Codigo = httpContext.cgiGet( "CATA_CODIGO") ;
            A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "TIPO_CODIGO"), ",", ".") ;
            A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( "UNIMED_COD"), ",", ".")) ;
            A49Tran_CodigoMovimiento = httpContext.cgiGet( "TRAN_CODIGOMOVIMIENTO") ;
            A34Clas_Codigo = httpContext.cgiGet( "CLAS_CODIGO") ;
            A35FAM_Codigo = httpContext.cgiGet( "FAM_CODIGO") ;
            A75SEG_Codigo = httpContext.cgiGet( "SEG_CODIGO") ;
            A481Tran_IndE_S = httpContext.cgiGet( "TRAN_INDE_S") ;
            n481Tran_IndE_S = false ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_DETALLE_TRANSACCION" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A46Tran_Id != Z46Tran_Id ) || ( A69TDet_Consecutivo != Z69TDet_Consecutivo ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_detalle_transaccion:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            /* Check if conditions changed and reset current page numbers */
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
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
               A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
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
                  sMode12 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode12 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound12 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0A0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TRAN_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Id_Internalname ;
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
                        e110A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120A2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         e120A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0A12( ) ;
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
         disableAttributes0A12( ) ;
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

   public void confirm_0A0( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0A12( ) ;
         }
         else
         {
            checkExtendedTable0A12( ) ;
            closeExtendedTableCursors0A12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_0A13( ) ;
         if ( AnyError == 0 )
         {
            confirm_0A14( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode12 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0A14( )
   {
      nGXsfl_127_idx = (short)(0) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow0A14( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            getKey0A14( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               if ( RcdFound14 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0A14( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0A14( ) ;
                     closeExtendedTableCursors0A14( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TRAN_ENTRADA_" + sGXsfl_127_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTran_Entrada_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( nRcdDeleted_14 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0A14( ) ;
                     load0A14( ) ;
                     beforeValidate0A14( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0A14( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_14 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0A14( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0A14( ) ;
                           closeExtendedTableCursors0A14( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "TRAN_ENTRADA_" + sGXsfl_127_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Entrada_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTran_Entrada_Internalname, GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNro_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTran_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A687Tran_Cantidad, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z71Tran_Entrada_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z71Tran_Entrada, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z72Nro_Linea_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z72Nro_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z687Tran_Cantidad_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z687Tran_Cantidad, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "TRAN_ENTRADA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Entrada_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NRO_LINEA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNro_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_CANTIDAD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Cantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_0A13( )
   {
      nGXsfl_114_idx = (short)(0) ;
      while ( nGXsfl_114_idx < nRC_GXsfl_114 )
      {
         readRow0A13( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            getKey0A13( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               if ( RcdFound13 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0A13( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0A13( ) ;
                     closeExtendedTableCursors0A13( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTDet_ListId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( nRcdDeleted_13 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0A13( ) ;
                     load0A13( ) ;
                     beforeValidate0A13( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0A13( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_13 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0A13( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0A13( ) ;
                           closeExtendedTableCursors0A13( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTDet_ListId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTDet_ListId_Internalname, GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTDet_ListDescripcion_Internalname, A492TDet_ListDescripcion) ;
         httpContext.changePostValue( cmbTDet_ListTipo.getInternalname(), GXutil.rtrim( A493TDet_ListTipo)) ;
         httpContext.changePostValue( edtTDet_ValorAtributo_Internalname, A494TDet_ValorAtributo) ;
         httpContext.changePostValue( "ZT_"+"Z70TDet_ListId_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( Z70TDet_ListId, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z494TDet_ValorAtributo_"+sGXsfl_114_idx, Z494TDet_ValorAtributo) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "TDET_LISTID_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListDescripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_LISTTIPO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTDet_ListTipo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_VALORATRIBUTO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ValorAtributo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0A0( )
   {
   }

   public void e110A2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      AV15Insert_Elem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Elem_Consecutivo", AV15Insert_Elem_Consecutivo);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV16Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV17GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         while ( AV17GXV1 <= AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV17GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Elem_Consecutivo") == 0 )
            {
               AV15Insert_Elem_Consecutivo = AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Elem_Consecutivo", AV15Insert_Elem_Consecutivo);
            }
            AV17GXV1 = (int)(AV17GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         }
      }
   }

   public void e120A2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_detalle_transaccion") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(12);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0A12( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z487TDet_Cantidad = T000A8_A487TDet_Cantidad[0] ;
            Z488TDet_ValorUnitario = T000A8_A488TDet_ValorUnitario[0] ;
            Z489TDet_ValorTotal = T000A8_A489TDet_ValorTotal[0] ;
            Z490TDet_PlacaNumero = T000A8_A490TDet_PlacaNumero[0] ;
            Z504TDet_Observaciones = T000A8_A504TDet_Observaciones[0] ;
            Z491TDet_PlacaPadre = T000A8_A491TDet_PlacaPadre[0] ;
            Z505TDet_EsPadre = T000A8_A505TDet_EsPadre[0] ;
            Z525TDet_Atributos = T000A8_A525TDet_Atributos[0] ;
            Z653TDet_Valor_Presente = T000A8_A653TDet_Valor_Presente[0] ;
            Z654TDet_Valor_Futuro = T000A8_A654TDet_Valor_Futuro[0] ;
            Z655TDet_Taza = T000A8_A655TDet_Taza[0] ;
            Z656TDet_Plazo_N = T000A8_A656TDet_Plazo_N[0] ;
            Z657TDet_Otros_Costos = T000A8_A657TDet_Otros_Costos[0] ;
            Z658TDet_Agrupado = T000A8_A658TDet_Agrupado[0] ;
            Z817TDet_PlacaRecuperada = T000A8_A817TDet_PlacaRecuperada[0] ;
            Z66Elem_Consecutivo = T000A8_A66Elem_Consecutivo[0] ;
         }
         else
         {
            Z487TDet_Cantidad = A487TDet_Cantidad ;
            Z488TDet_ValorUnitario = A488TDet_ValorUnitario ;
            Z489TDet_ValorTotal = A489TDet_ValorTotal ;
            Z490TDet_PlacaNumero = A490TDet_PlacaNumero ;
            Z504TDet_Observaciones = A504TDet_Observaciones ;
            Z491TDet_PlacaPadre = A491TDet_PlacaPadre ;
            Z505TDet_EsPadre = A505TDet_EsPadre ;
            Z525TDet_Atributos = A525TDet_Atributos ;
            Z653TDet_Valor_Presente = A653TDet_Valor_Presente ;
            Z654TDet_Valor_Futuro = A654TDet_Valor_Futuro ;
            Z655TDet_Taza = A655TDet_Taza ;
            Z656TDet_Plazo_N = A656TDet_Plazo_N ;
            Z657TDet_Otros_Costos = A657TDet_Otros_Costos ;
            Z658TDet_Agrupado = A658TDet_Agrupado ;
            Z817TDet_PlacaRecuperada = A817TDet_PlacaRecuperada ;
            Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         Z487TDet_Cantidad = A487TDet_Cantidad ;
         Z488TDet_ValorUnitario = A488TDet_ValorUnitario ;
         Z489TDet_ValorTotal = A489TDet_ValorTotal ;
         Z490TDet_PlacaNumero = A490TDet_PlacaNumero ;
         Z504TDet_Observaciones = A504TDet_Observaciones ;
         Z491TDet_PlacaPadre = A491TDet_PlacaPadre ;
         Z505TDet_EsPadre = A505TDet_EsPadre ;
         Z525TDet_Atributos = A525TDet_Atributos ;
         Z653TDet_Valor_Presente = A653TDet_Valor_Presente ;
         Z654TDet_Valor_Futuro = A654TDet_Valor_Futuro ;
         Z655TDet_Taza = A655TDet_Taza ;
         Z656TDet_Plazo_N = A656TDet_Plazo_N ;
         Z657TDet_Otros_Costos = A657TDet_Otros_Costos ;
         Z658TDet_Agrupado = A658TDet_Agrupado ;
         Z817TDet_PlacaRecuperada = A817TDet_PlacaRecuperada ;
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z46Tran_Id = A46Tran_Id ;
         Z49Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         Z481Tran_IndE_S = A481Tran_IndE_S ;
         Z37Cata_Codigo = A37Cata_Codigo ;
         Z557Elem_Descripcion = A557Elem_Descripcion ;
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         Z77UNIMED_COD = A77UNIMED_COD ;
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z298Cata_Descripcion = A298Cata_Descripcion ;
         Z35FAM_Codigo = A35FAM_Codigo ;
         Z75SEG_Codigo = A75SEG_Codigo ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_46_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0070"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_ID"+"'), id:'"+"TRAN_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_66_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00x0"+"',["+"{Ctrl:gx.dom.el('"+"ELEM_CONSECUTIVO"+"'), id:'"+"ELEM_CONSECUTIVO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Tran_Id) )
      {
         A46Tran_Id = AV7Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
      if ( ! (0==AV7Tran_Id) )
      {
         edtTran_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV7Tran_Id) )
      {
         edtTran_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV8TDet_Consecutivo) )
      {
         A69TDet_Consecutivo = AV8TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      }
      if ( ! (0==AV8TDet_Consecutivo) )
      {
         edtTDet_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Consecutivo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTDet_Consecutivo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV8TDet_Consecutivo) )
      {
         edtTDet_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      else
      {
         edtElem_Consecutivo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_Elem_Consecutivo)==0) )
      {
         A66Elem_Consecutivo = AV15Insert_Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
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
         /* Using cursor T000A10 */
         pr_default.execute(8, new Object[] {new Long(A46Tran_Id)});
         A49Tran_CodigoMovimiento = T000A10_A49Tran_CodigoMovimiento[0] ;
         pr_default.close(8);
         /* Using cursor T000A14 */
         pr_default.execute(12, new Object[] {A49Tran_CodigoMovimiento});
         A481Tran_IndE_S = T000A14_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = T000A14_n481Tran_IndE_S[0] ;
         pr_default.close(12);
         AV16Pgmname = "ALM_DETALLE_TRANSACCION" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000A9 */
         pr_default.execute(7, new Object[] {A66Elem_Consecutivo});
         A37Cata_Codigo = T000A9_A37Cata_Codigo[0] ;
         A557Elem_Descripcion = T000A9_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A33Tipo_Codigo = T000A9_A33Tipo_Codigo[0] ;
         A77UNIMED_COD = T000A9_A77UNIMED_COD[0] ;
         pr_default.close(7);
         /* Using cursor T000A11 */
         pr_default.execute(9, new Object[] {A37Cata_Codigo});
         A34Clas_Codigo = T000A11_A34Clas_Codigo[0] ;
         A298Cata_Descripcion = T000A11_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         pr_default.close(9);
         /* Using cursor T000A12 */
         pr_default.execute(10, new Object[] {A34Clas_Codigo});
         A35FAM_Codigo = T000A12_A35FAM_Codigo[0] ;
         pr_default.close(10);
         /* Using cursor T000A13 */
         pr_default.execute(11, new Object[] {A35FAM_Codigo});
         A75SEG_Codigo = T000A13_A75SEG_Codigo[0] ;
         pr_default.close(11);
      }
   }

   public void load0A12( )
   {
      /* Using cursor T000A15 */
      pr_default.execute(13, new Object[] {new Long(A69TDet_Consecutivo), new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A37Cata_Codigo = T000A15_A37Cata_Codigo[0] ;
         A34Clas_Codigo = T000A15_A34Clas_Codigo[0] ;
         A35FAM_Codigo = T000A15_A35FAM_Codigo[0] ;
         A49Tran_CodigoMovimiento = T000A15_A49Tran_CodigoMovimiento[0] ;
         A557Elem_Descripcion = T000A15_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A298Cata_Descripcion = T000A15_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A487TDet_Cantidad = T000A15_A487TDet_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
         A488TDet_ValorUnitario = T000A15_A488TDet_ValorUnitario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
         A489TDet_ValorTotal = T000A15_A489TDet_ValorTotal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
         A490TDet_PlacaNumero = T000A15_A490TDet_PlacaNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
         n490TDet_PlacaNumero = T000A15_n490TDet_PlacaNumero[0] ;
         A504TDet_Observaciones = T000A15_A504TDet_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A504TDet_Observaciones", A504TDet_Observaciones);
         n504TDet_Observaciones = T000A15_n504TDet_Observaciones[0] ;
         A491TDet_PlacaPadre = T000A15_A491TDet_PlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
         n491TDet_PlacaPadre = T000A15_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = T000A15_A505TDet_EsPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A505TDet_EsPadre", A505TDet_EsPadre);
         A525TDet_Atributos = T000A15_A525TDet_Atributos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A525TDet_Atributos", A525TDet_Atributos);
         A653TDet_Valor_Presente = T000A15_A653TDet_Valor_Presente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
         n653TDet_Valor_Presente = T000A15_n653TDet_Valor_Presente[0] ;
         A654TDet_Valor_Futuro = T000A15_A654TDet_Valor_Futuro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
         n654TDet_Valor_Futuro = T000A15_n654TDet_Valor_Futuro[0] ;
         A655TDet_Taza = T000A15_A655TDet_Taza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
         n655TDet_Taza = T000A15_n655TDet_Taza[0] ;
         A656TDet_Plazo_N = T000A15_A656TDet_Plazo_N[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
         n656TDet_Plazo_N = T000A15_n656TDet_Plazo_N[0] ;
         A657TDet_Otros_Costos = T000A15_A657TDet_Otros_Costos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
         n657TDet_Otros_Costos = T000A15_n657TDet_Otros_Costos[0] ;
         A658TDet_Agrupado = T000A15_A658TDet_Agrupado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
         n658TDet_Agrupado = T000A15_n658TDet_Agrupado[0] ;
         A817TDet_PlacaRecuperada = T000A15_A817TDet_PlacaRecuperada[0] ;
         n817TDet_PlacaRecuperada = T000A15_n817TDet_PlacaRecuperada[0] ;
         A481Tran_IndE_S = T000A15_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = T000A15_n481Tran_IndE_S[0] ;
         A66Elem_Consecutivo = T000A15_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A33Tipo_Codigo = T000A15_A33Tipo_Codigo[0] ;
         A75SEG_Codigo = T000A15_A75SEG_Codigo[0] ;
         A77UNIMED_COD = T000A15_A77UNIMED_COD[0] ;
         zm0A12( -12) ;
      }
      pr_default.close(13);
      onLoadActions0A12( ) ;
   }

   public void onLoadActions0A12( )
   {
      AV16Pgmname = "ALM_DETALLE_TRANSACCION" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable0A12( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV16Pgmname = "ALM_DETALLE_TRANSACCION" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      /* Using cursor T000A10 */
      pr_default.execute(8, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TRANSACCION'.", "ForeignKeyNotFound", 1, "TRAN_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A49Tran_CodigoMovimiento = T000A10_A49Tran_CodigoMovimiento[0] ;
      pr_default.close(8);
      /* Using cursor T000A14 */
      pr_default.execute(12, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A481Tran_IndE_S = T000A14_A481Tran_IndE_S[0] ;
      n481Tran_IndE_S = T000A14_n481Tran_IndE_S[0] ;
      pr_default.close(12);
      /* Using cursor T000A9 */
      pr_default.execute(7, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A37Cata_Codigo = T000A9_A37Cata_Codigo[0] ;
      A557Elem_Descripcion = T000A9_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A33Tipo_Codigo = T000A9_A33Tipo_Codigo[0] ;
      A77UNIMED_COD = T000A9_A77UNIMED_COD[0] ;
      pr_default.close(7);
      /* Using cursor T000A11 */
      pr_default.execute(9, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A34Clas_Codigo = T000A11_A34Clas_Codigo[0] ;
      A298Cata_Descripcion = T000A11_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      pr_default.close(9);
      /* Using cursor T000A12 */
      pr_default.execute(10, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A35FAM_Codigo = T000A12_A35FAM_Codigo[0] ;
      pr_default.close(10);
      /* Using cursor T000A13 */
      pr_default.execute(11, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A75SEG_Codigo = T000A13_A75SEG_Codigo[0] ;
      pr_default.close(11);
   }

   public void closeExtendedTableCursors0A12( )
   {
      pr_default.close(8);
      pr_default.close(12);
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( long A46Tran_Id )
   {
      /* Using cursor T000A16 */
      pr_default.execute(14, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TRANSACCION'.", "ForeignKeyNotFound", 1, "TRAN_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A49Tran_CodigoMovimiento = T000A16_A49Tran_CodigoMovimiento[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A49Tran_CodigoMovimiento)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_18( String A49Tran_CodigoMovimiento )
   {
      /* Using cursor T000A17 */
      pr_default.execute(15, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A481Tran_IndE_S = T000A17_A481Tran_IndE_S[0] ;
      n481Tran_IndE_S = T000A17_n481Tran_IndE_S[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A481Tran_IndE_S)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void gxload_13( String A66Elem_Consecutivo )
   {
      /* Using cursor T000A18 */
      pr_default.execute(16, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A37Cata_Codigo = T000A18_A37Cata_Codigo[0] ;
      A557Elem_Descripcion = T000A18_A557Elem_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A33Tipo_Codigo = T000A18_A33Tipo_Codigo[0] ;
      A77UNIMED_COD = T000A18_A77UNIMED_COD[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A37Cata_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A557Elem_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(16);
   }

   public void gxload_15( String A37Cata_Codigo )
   {
      /* Using cursor T000A19 */
      pr_default.execute(17, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A34Clas_Codigo = T000A19_A34Clas_Codigo[0] ;
      A298Cata_Descripcion = T000A19_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A34Clas_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A298Cata_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(17);
   }

   public void gxload_16( String A34Clas_Codigo )
   {
      /* Using cursor T000A20 */
      pr_default.execute(18, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A35FAM_Codigo = T000A20_A35FAM_Codigo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A35FAM_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void gxload_17( String A35FAM_Codigo )
   {
      /* Using cursor T000A21 */
      pr_default.execute(19, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A75SEG_Codigo = T000A21_A75SEG_Codigo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(19);
   }

   public void getKey0A12( )
   {
      /* Using cursor T000A22 */
      pr_default.execute(20, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000A8 */
      pr_default.execute(6, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm0A12( 12) ;
         RcdFound12 = (short)(1) ;
         A69TDet_Consecutivo = T000A8_A69TDet_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
         A487TDet_Cantidad = T000A8_A487TDet_Cantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
         A488TDet_ValorUnitario = T000A8_A488TDet_ValorUnitario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
         A489TDet_ValorTotal = T000A8_A489TDet_ValorTotal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
         A490TDet_PlacaNumero = T000A8_A490TDet_PlacaNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
         n490TDet_PlacaNumero = T000A8_n490TDet_PlacaNumero[0] ;
         A504TDet_Observaciones = T000A8_A504TDet_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A504TDet_Observaciones", A504TDet_Observaciones);
         n504TDet_Observaciones = T000A8_n504TDet_Observaciones[0] ;
         A491TDet_PlacaPadre = T000A8_A491TDet_PlacaPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
         n491TDet_PlacaPadre = T000A8_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = T000A8_A505TDet_EsPadre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A505TDet_EsPadre", A505TDet_EsPadre);
         A525TDet_Atributos = T000A8_A525TDet_Atributos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A525TDet_Atributos", A525TDet_Atributos);
         A653TDet_Valor_Presente = T000A8_A653TDet_Valor_Presente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
         n653TDet_Valor_Presente = T000A8_n653TDet_Valor_Presente[0] ;
         A654TDet_Valor_Futuro = T000A8_A654TDet_Valor_Futuro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
         n654TDet_Valor_Futuro = T000A8_n654TDet_Valor_Futuro[0] ;
         A655TDet_Taza = T000A8_A655TDet_Taza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
         n655TDet_Taza = T000A8_n655TDet_Taza[0] ;
         A656TDet_Plazo_N = T000A8_A656TDet_Plazo_N[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
         n656TDet_Plazo_N = T000A8_n656TDet_Plazo_N[0] ;
         A657TDet_Otros_Costos = T000A8_A657TDet_Otros_Costos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
         n657TDet_Otros_Costos = T000A8_n657TDet_Otros_Costos[0] ;
         A658TDet_Agrupado = T000A8_A658TDet_Agrupado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
         n658TDet_Agrupado = T000A8_n658TDet_Agrupado[0] ;
         A817TDet_PlacaRecuperada = T000A8_A817TDet_PlacaRecuperada[0] ;
         n817TDet_PlacaRecuperada = T000A8_n817TDet_PlacaRecuperada[0] ;
         A66Elem_Consecutivo = T000A8_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A46Tran_Id = T000A8_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         Z46Tran_Id = A46Tran_Id ;
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0A12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey0A12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0A12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey0A12( ) ;
      if ( RcdFound12 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000A23 */
      pr_default.execute(21, new Object[] {new Long(A69TDet_Consecutivo), new Long(A69TDet_Consecutivo), new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T000A23_A69TDet_Consecutivo[0] < A69TDet_Consecutivo ) || ( T000A23_A69TDet_Consecutivo[0] == A69TDet_Consecutivo ) && ( T000A23_A46Tran_Id[0] < A46Tran_Id ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T000A23_A69TDet_Consecutivo[0] > A69TDet_Consecutivo ) || ( T000A23_A69TDet_Consecutivo[0] == A69TDet_Consecutivo ) && ( T000A23_A46Tran_Id[0] > A46Tran_Id ) ) )
         {
            A69TDet_Consecutivo = T000A23_A69TDet_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
            A46Tran_Id = T000A23_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000A24 */
      pr_default.execute(22, new Object[] {new Long(A69TDet_Consecutivo), new Long(A69TDet_Consecutivo), new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( T000A24_A69TDet_Consecutivo[0] > A69TDet_Consecutivo ) || ( T000A24_A69TDet_Consecutivo[0] == A69TDet_Consecutivo ) && ( T000A24_A46Tran_Id[0] > A46Tran_Id ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( T000A24_A69TDet_Consecutivo[0] < A69TDet_Consecutivo ) || ( T000A24_A69TDet_Consecutivo[0] == A69TDet_Consecutivo ) && ( T000A24_A46Tran_Id[0] < A46Tran_Id ) ) )
         {
            A69TDet_Consecutivo = T000A24_A69TDet_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
            A46Tran_Id = T000A24_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0A12( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0A12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( A46Tran_Id != Z46Tran_Id ) || ( A69TDet_Consecutivo != Z69TDet_Consecutivo ) )
            {
               A46Tran_Id = Z46Tran_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
               A69TDet_Consecutivo = Z69TDet_Consecutivo ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TRAN_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0A12( ) ;
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A46Tran_Id != Z46Tran_Id ) || ( A69TDet_Consecutivo != Z69TDet_Consecutivo ) )
            {
               /* Insert record */
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0A12( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TRAN_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTran_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTran_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0A12( ) ;
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
      if ( ( A46Tran_Id != Z46Tran_Id ) || ( A69TDet_Consecutivo != Z69TDet_Consecutivo ) )
      {
         A46Tran_Id = Z46Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A69TDet_Consecutivo = Z69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TRAN_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0A12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000A7 */
         pr_default.execute(5, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DETALLE_TRANSACCION"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( Z487TDet_Cantidad != T000A7_A487TDet_Cantidad[0] ) || ( DecimalUtil.compareTo(Z488TDet_ValorUnitario, T000A7_A488TDet_ValorUnitario[0]) != 0 ) || ( DecimalUtil.compareTo(Z489TDet_ValorTotal, T000A7_A489TDet_ValorTotal[0]) != 0 ) || ( GXutil.strcmp(Z490TDet_PlacaNumero, T000A7_A490TDet_PlacaNumero[0]) != 0 ) || ( GXutil.strcmp(Z504TDet_Observaciones, T000A7_A504TDet_Observaciones[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z491TDet_PlacaPadre, T000A7_A491TDet_PlacaPadre[0]) != 0 ) || ( GXutil.strcmp(Z505TDet_EsPadre, T000A7_A505TDet_EsPadre[0]) != 0 ) || ( GXutil.strcmp(Z525TDet_Atributos, T000A7_A525TDet_Atributos[0]) != 0 ) || ( DecimalUtil.compareTo(Z653TDet_Valor_Presente, T000A7_A653TDet_Valor_Presente[0]) != 0 ) || ( DecimalUtil.compareTo(Z654TDet_Valor_Futuro, T000A7_A654TDet_Valor_Futuro[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z655TDet_Taza != T000A7_A655TDet_Taza[0] ) || ( Z656TDet_Plazo_N != T000A7_A656TDet_Plazo_N[0] ) || ( DecimalUtil.compareTo(Z657TDet_Otros_Costos, T000A7_A657TDet_Otros_Costos[0]) != 0 ) || ( Z658TDet_Agrupado != T000A7_A658TDet_Agrupado[0] ) || ( GXutil.strcmp(Z817TDet_PlacaRecuperada, T000A7_A817TDet_PlacaRecuperada[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z66Elem_Consecutivo, T000A7_A66Elem_Consecutivo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_DETALLE_TRANSACCION"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A12( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A12( 0) ;
         checkOptimisticConcurrency0A12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A25 */
                  pr_default.execute(23, new Object[] {new Long(A69TDet_Consecutivo), new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, A525TDet_Atributos, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos, new Boolean(n658TDet_Agrupado), new Short(A658TDet_Agrupado), new Boolean(n817TDet_PlacaRecuperada), A817TDet_PlacaRecuperada, A66Elem_Consecutivo, new Long(A46Tran_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
                  if ( (pr_default.getStatus(23) == 1) )
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
                        processLevel0A12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0A0( ) ;
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
         else
         {
            load0A12( ) ;
         }
         endLevel0A12( ) ;
      }
      closeExtendedTableCursors0A12( ) ;
   }

   public void update0A12( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A26 */
                  pr_default.execute(24, new Object[] {new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, A525TDet_Atributos, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos, new Boolean(n658TDet_Agrupado), new Short(A658TDet_Agrupado), new Boolean(n817TDet_PlacaRecuperada), A817TDet_PlacaRecuperada, A66Elem_Consecutivo, new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DETALLE_TRANSACCION"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A12( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0A12( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0A12( ) ;
      }
      closeExtendedTableCursors0A12( ) ;
   }

   public void deferredUpdate0A12( )
   {
   }

   public void delete( )
   {
      beforeValidate0A12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A12( ) ;
         afterConfirm0A12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A12( ) ;
            if ( AnyError == 0 )
            {
               scanStart0A14( ) ;
               while ( RcdFound14 != 0 )
               {
                  getByPrimaryKey0A14( ) ;
                  delete0A14( ) ;
                  scanNext0A14( ) ;
               }
               scanEnd0A14( ) ;
               scanStart0A13( ) ;
               while ( RcdFound13 != 0 )
               {
                  getByPrimaryKey0A13( ) ;
                  delete0A13( ) ;
                  scanNext0A13( ) ;
               }
               scanEnd0A13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A27 */
                  pr_default.execute(25, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
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
      }
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0A12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0A12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "ALM_DETALLE_TRANSACCION" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000A28 */
         pr_default.execute(26, new Object[] {new Long(A46Tran_Id)});
         A49Tran_CodigoMovimiento = T000A28_A49Tran_CodigoMovimiento[0] ;
         pr_default.close(26);
         /* Using cursor T000A29 */
         pr_default.execute(27, new Object[] {A49Tran_CodigoMovimiento});
         A481Tran_IndE_S = T000A29_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = T000A29_n481Tran_IndE_S[0] ;
         pr_default.close(27);
         /* Using cursor T000A30 */
         pr_default.execute(28, new Object[] {A66Elem_Consecutivo});
         A37Cata_Codigo = T000A30_A37Cata_Codigo[0] ;
         A557Elem_Descripcion = T000A30_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A33Tipo_Codigo = T000A30_A33Tipo_Codigo[0] ;
         A77UNIMED_COD = T000A30_A77UNIMED_COD[0] ;
         pr_default.close(28);
         /* Using cursor T000A31 */
         pr_default.execute(29, new Object[] {A37Cata_Codigo});
         A34Clas_Codigo = T000A31_A34Clas_Codigo[0] ;
         A298Cata_Descripcion = T000A31_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         pr_default.close(29);
         /* Using cursor T000A32 */
         pr_default.execute(30, new Object[] {A34Clas_Codigo});
         A35FAM_Codigo = T000A32_A35FAM_Codigo[0] ;
         pr_default.close(30);
         /* Using cursor T000A33 */
         pr_default.execute(31, new Object[] {A35FAM_Codigo});
         A75SEG_Codigo = T000A33_A75SEG_Codigo[0] ;
         pr_default.close(31);
      }
   }

   public void processNestedLevel0A13( )
   {
      nGXsfl_114_idx = (short)(0) ;
      while ( nGXsfl_114_idx < nRC_GXsfl_114 )
      {
         readRow0A13( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            standaloneNotModal0A13( ) ;
            getKey0A13( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0A13( ) ;
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( ( nRcdDeleted_13 != 0 ) && ( nRcdExists_13 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0A13( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_13 != 0 ) && ( nRcdExists_13 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0A13( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTDet_ListId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTDet_ListId_Internalname, GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTDet_ListDescripcion_Internalname, A492TDet_ListDescripcion) ;
         httpContext.changePostValue( cmbTDet_ListTipo.getInternalname(), GXutil.rtrim( A493TDet_ListTipo)) ;
         httpContext.changePostValue( edtTDet_ValorAtributo_Internalname, A494TDet_ValorAtributo) ;
         httpContext.changePostValue( "ZT_"+"Z70TDet_ListId_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( Z70TDet_ListId, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z494TDet_ValorAtributo_"+sGXsfl_114_idx, Z494TDet_ValorAtributo) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_114_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "TDET_LISTID_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListDescripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_LISTTIPO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTDet_ListTipo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TDET_VALORATRIBUTO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ValorAtributo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0A13( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_13 = (short)(0) ;
      nIsMod_13 = (short)(0) ;
      nRcdDeleted_13 = (short)(0) ;
   }

   public void processNestedLevel0A14( )
   {
      nGXsfl_127_idx = (short)(0) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow0A14( ) ;
         if ( ( nRcdExists_14 != 0 ) || ( nIsMod_14 != 0 ) )
         {
            standaloneNotModal0A14( ) ;
            getKey0A14( ) ;
            if ( ( nRcdExists_14 == 0 ) && ( nRcdDeleted_14 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0A14( ) ;
            }
            else
            {
               if ( RcdFound14 != 0 )
               {
                  if ( ( nRcdDeleted_14 != 0 ) && ( nRcdExists_14 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0A14( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_14 != 0 ) && ( nRcdExists_14 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0A14( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_14 == 0 )
                  {
                     GXCCtl = "TRAN_ENTRADA_" + sGXsfl_127_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Entrada_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTran_Entrada_Internalname, GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNro_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTran_Cantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A687Tran_Cantidad, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z71Tran_Entrada_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z71Tran_Entrada, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z72Nro_Linea_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z72Nro_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z687Tran_Cantidad_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z687Tran_Cantidad, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_14_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_14 != 0 )
         {
            httpContext.changePostValue( "TRAN_ENTRADA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Entrada_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NRO_LINEA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNro_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_CANTIDAD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Cantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0A14( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_14 = (short)(0) ;
      nIsMod_14 = (short)(0) ;
      nRcdDeleted_14 = (short)(0) ;
   }

   public void processLevel0A12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel0A13( ) ;
      processNestedLevel0A14( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0A12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_detalle_transaccion");
         if ( AnyError == 0 )
         {
            confirmValues0A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_detalle_transaccion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0A12( )
   {
      /* Scan By routine */
      /* Using cursor T000A34 */
      pr_default.execute(32);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A46Tran_Id = T000A34_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A69TDet_Consecutivo = T000A34_A69TDet_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A12( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A46Tran_Id = T000A34_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A69TDet_Consecutivo = T000A34_A69TDet_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      }
   }

   public void scanEnd0A12( )
   {
      pr_default.close(32);
   }

   public void afterConfirm0A12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0A12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0A12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A12( )
   {
      edtTran_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      edtTDet_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Consecutivo_Enabled, 5, 0)), true);
      edtElem_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      edtElem_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Descripcion_Enabled, 5, 0)), true);
      edtCata_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Descripcion_Enabled, 5, 0)), true);
      edtTDet_Cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Cantidad_Enabled, 5, 0)), true);
      edtTDet_ValorUnitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ValorUnitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ValorUnitario_Enabled, 5, 0)), true);
      edtTDet_ValorTotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ValorTotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ValorTotal_Enabled, 5, 0)), true);
      edtTDet_PlacaNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_PlacaNumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_PlacaNumero_Enabled, 5, 0)), true);
      edtTDet_Observaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Observaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Observaciones_Enabled, 5, 0)), true);
      edtTDet_PlacaPadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_PlacaPadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_PlacaPadre_Enabled, 5, 0)), true);
      edtTDet_EsPadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_EsPadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_EsPadre_Enabled, 5, 0)), true);
      edtTDet_Atributos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Atributos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Atributos_Enabled, 5, 0)), true);
      edtTDet_Valor_Presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Valor_Presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Valor_Presente_Enabled, 5, 0)), true);
      edtTDet_Valor_Futuro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Valor_Futuro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Valor_Futuro_Enabled, 5, 0)), true);
      edtTDet_Taza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Taza_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Taza_Enabled, 5, 0)), true);
      edtTDet_Plazo_N_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Plazo_N_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Plazo_N_Enabled, 5, 0)), true);
      edtTDet_Otros_Costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Otros_Costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Otros_Costos_Enabled, 5, 0)), true);
      edtTDet_Agrupado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_Agrupado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_Agrupado_Enabled, 5, 0)), true);
   }

   public void zm0A13( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z494TDet_ValorAtributo = T000A5_A494TDet_ValorAtributo[0] ;
         }
         else
         {
            Z494TDet_ValorAtributo = A494TDet_ValorAtributo ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z46Tran_Id = A46Tran_Id ;
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         Z494TDet_ValorAtributo = A494TDet_ValorAtributo ;
         Z70TDet_ListId = A70TDet_ListId ;
         Z492TDet_ListDescripcion = A492TDet_ListDescripcion ;
         Z493TDet_ListTipo = A493TDet_ListTipo ;
      }
   }

   public void standaloneNotModal0A13( )
   {
   }

   public void standaloneModal0A13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTDet_ListId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListId_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      }
      else
      {
         edtTDet_ListId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListId_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      }
   }

   public void load0A13( )
   {
      /* Using cursor T000A35 */
      pr_default.execute(33, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A492TDet_ListDescripcion = T000A35_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = T000A35_n492TDet_ListDescripcion[0] ;
         A493TDet_ListTipo = T000A35_A493TDet_ListTipo[0] ;
         n493TDet_ListTipo = T000A35_n493TDet_ListTipo[0] ;
         A494TDet_ValorAtributo = T000A35_A494TDet_ValorAtributo[0] ;
         zm0A13( -19) ;
      }
      pr_default.close(33);
      onLoadActions0A13( ) ;
   }

   public void onLoadActions0A13( )
   {
   }

   public void checkExtendedTable0A13( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0A13( ) ;
      /* Using cursor T000A6 */
      pr_default.execute(4, new Object[] {new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
         httpContext.GX_msglist.addItem("No existe 'Atributos Detalle'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTDet_ListId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A492TDet_ListDescripcion = T000A6_A492TDet_ListDescripcion[0] ;
      n492TDet_ListDescripcion = T000A6_n492TDet_ListDescripcion[0] ;
      A493TDet_ListTipo = T000A6_A493TDet_ListTipo[0] ;
      n493TDet_ListTipo = T000A6_n493TDet_ListTipo[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0A13( )
   {
      pr_default.close(4);
   }

   public void enableDisable0A13( )
   {
   }

   public void gxload_20( long A70TDet_ListId )
   {
      /* Using cursor T000A36 */
      pr_default.execute(34, new Object[] {new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
         httpContext.GX_msglist.addItem("No existe 'Atributos Detalle'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTDet_ListId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A492TDet_ListDescripcion = T000A36_A492TDet_ListDescripcion[0] ;
      n492TDet_ListDescripcion = T000A36_n492TDet_ListDescripcion[0] ;
      A493TDet_ListTipo = T000A36_A493TDet_ListTipo[0] ;
      n493TDet_ListTipo = T000A36_n493TDet_ListTipo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A492TDet_ListDescripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A493TDet_ListTipo))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(34);
   }

   public void getKey0A13( )
   {
      /* Using cursor T000A37 */
      pr_default.execute(35, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(35);
   }

   public void getByPrimaryKey0A13( )
   {
      /* Using cursor T000A5 */
      pr_default.execute(3, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm0A13( 19) ;
         RcdFound13 = (short)(1) ;
         initializeNonKey0A13( ) ;
         A494TDet_ValorAtributo = T000A5_A494TDet_ValorAtributo[0] ;
         A70TDet_ListId = T000A5_A70TDet_ListId[0] ;
         Z46Tran_Id = A46Tran_Id ;
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         Z70TDet_ListId = A70TDet_ListId ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0A13( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0A13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0A13( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0A13( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency0A13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000A4 */
         pr_default.execute(2, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DETALLE_TRANSACCIONATRIBUT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z494TDet_ValorAtributo, T000A4_A494TDet_ValorAtributo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_DETALLE_TRANSACCIONATRIBUT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A13( )
   {
      beforeValidate0A13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A13( 0) ;
         checkOptimisticConcurrency0A13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A38 */
                  pr_default.execute(36, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A494TDet_ValorAtributo, new Long(A70TDet_ListId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
                  if ( (pr_default.getStatus(36) == 1) )
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
            load0A13( ) ;
         }
         endLevel0A13( ) ;
      }
      closeExtendedTableCursors0A13( ) ;
   }

   public void update0A13( )
   {
      beforeValidate0A13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A39 */
                  pr_default.execute(37, new Object[] {A494TDet_ValorAtributo, new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
                  if ( (pr_default.getStatus(37) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DETALLE_TRANSACCIONATRIBUT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0A13( ) ;
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
         endLevel0A13( ) ;
      }
      closeExtendedTableCursors0A13( ) ;
   }

   public void deferredUpdate0A13( )
   {
   }

   public void delete0A13( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0A13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A13( ) ;
         afterConfirm0A13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000A40 */
               pr_default.execute(38, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A70TDet_ListId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCIONATRIBUT") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0A13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0A13( )
   {
      standaloneModal0A13( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000A41 */
         pr_default.execute(39, new Object[] {new Long(A70TDet_ListId)});
         A492TDet_ListDescripcion = T000A41_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = T000A41_n492TDet_ListDescripcion[0] ;
         A493TDet_ListTipo = T000A41_A493TDet_ListTipo[0] ;
         n493TDet_ListTipo = T000A41_n493TDet_ListTipo[0] ;
         pr_default.close(39);
      }
   }

   public void endLevel0A13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0A13( )
   {
      /* Scan By routine */
      /* Using cursor T000A42 */
      pr_default.execute(40, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A70TDet_ListId = T000A42_A70TDet_ListId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A13( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A70TDet_ListId = T000A42_A70TDet_ListId[0] ;
      }
   }

   public void scanEnd0A13( )
   {
      pr_default.close(40);
   }

   public void afterConfirm0A13( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0A13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0A13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A13( )
   {
      edtTDet_ListId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListId_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtTDet_ListDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListDescripcion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      cmbTDet_ListTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTDet_ListTipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTDet_ListTipo.getEnabled(), 5, 0)), !bGXsfl_114_Refreshing);
      edtTDet_ValorAtributo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ValorAtributo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ValorAtributo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
   }

   public void zm0A14( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z687Tran_Cantidad = T000A3_A687Tran_Cantidad[0] ;
         }
         else
         {
            Z687Tran_Cantidad = A687Tran_Cantidad ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z46Tran_Id = A46Tran_Id ;
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         Z71Tran_Entrada = A71Tran_Entrada ;
         Z72Nro_Linea = A72Nro_Linea ;
         Z687Tran_Cantidad = A687Tran_Cantidad ;
      }
   }

   public void standaloneNotModal0A14( )
   {
   }

   public void standaloneModal0A14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTran_Entrada_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Entrada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Entrada_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtTran_Entrada_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Entrada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Entrada_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtNro_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNro_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNro_Linea_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtNro_Linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNro_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNro_Linea_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
   }

   public void load0A14( )
   {
      /* Using cursor T000A43 */
      pr_default.execute(41, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A687Tran_Cantidad = T000A43_A687Tran_Cantidad[0] ;
         n687Tran_Cantidad = T000A43_n687Tran_Cantidad[0] ;
         zm0A14( -21) ;
      }
      pr_default.close(41);
      onLoadActions0A14( ) ;
   }

   public void onLoadActions0A14( )
   {
   }

   public void checkExtendedTable0A14( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0A14( ) ;
   }

   public void closeExtendedTableCursors0A14( )
   {
   }

   public void enableDisable0A14( )
   {
   }

   public void getKey0A14( )
   {
      /* Using cursor T000A44 */
      pr_default.execute(42, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKey0A14( )
   {
      /* Using cursor T000A3 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A14( 21) ;
         RcdFound14 = (short)(1) ;
         initializeNonKey0A14( ) ;
         A71Tran_Entrada = T000A3_A71Tran_Entrada[0] ;
         A72Nro_Linea = T000A3_A72Nro_Linea[0] ;
         A687Tran_Cantidad = T000A3_A687Tran_Cantidad[0] ;
         n687Tran_Cantidad = T000A3_n687Tran_Cantidad[0] ;
         Z46Tran_Id = A46Tran_Id ;
         Z69TDet_Consecutivo = A69TDet_Consecutivo ;
         Z71Tran_Entrada = A71Tran_Entrada ;
         Z72Nro_Linea = A72Nro_Linea ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0A14( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKey0A14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0A14( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0A14( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0A14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000A2 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DET_TRAN_DATOS_SALIDA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z687Tran_Cantidad != T000A2_A687Tran_Cantidad[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_DET_TRAN_DATOS_SALIDA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A14( )
   {
      beforeValidate0A14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A14( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A14( 0) ;
         checkOptimisticConcurrency0A14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A45 */
                  pr_default.execute(43, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea), new Boolean(n687Tran_Cantidad), new Integer(A687Tran_Cantidad)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
                  if ( (pr_default.getStatus(43) == 1) )
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
            load0A14( ) ;
         }
         endLevel0A14( ) ;
      }
      closeExtendedTableCursors0A14( ) ;
   }

   public void update0A14( )
   {
      beforeValidate0A14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A14( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A14( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A46 */
                  pr_default.execute(44, new Object[] {new Boolean(n687Tran_Cantidad), new Integer(A687Tran_Cantidad), new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
                  if ( (pr_default.getStatus(44) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DET_TRAN_DATOS_SALIDA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A14( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0A14( ) ;
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
         endLevel0A14( ) ;
      }
      closeExtendedTableCursors0A14( ) ;
   }

   public void deferredUpdate0A14( )
   {
   }

   public void delete0A14( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0A14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A14( ) ;
         afterConfirm0A14( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A14( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000A47 */
               pr_default.execute(45, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0A14( ) ;
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0A14( )
   {
      standaloneModal0A14( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0A14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0A14( )
   {
      /* Scan By routine */
      /* Using cursor T000A48 */
      pr_default.execute(46, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A71Tran_Entrada = T000A48_A71Tran_Entrada[0] ;
         A72Nro_Linea = T000A48_A72Nro_Linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A14( )
   {
      /* Scan next routine */
      pr_default.readNext(46);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A71Tran_Entrada = T000A48_A71Tran_Entrada[0] ;
         A72Nro_Linea = T000A48_A72Nro_Linea[0] ;
      }
   }

   public void scanEnd0A14( )
   {
      pr_default.close(46);
   }

   public void afterConfirm0A14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A14( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0A14( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0A14( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A14( )
   {
      edtTran_Entrada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Entrada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Entrada_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      edtNro_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNro_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNro_Linea_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      edtTran_Cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Cantidad_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
   }

   public void subsflControlProps_11413( )
   {
      edtTDet_ListId_Internalname = "TDET_LISTID_"+sGXsfl_114_idx ;
      imgprompt_70_Internalname = "PROMPT_70_"+sGXsfl_114_idx ;
      edtTDet_ListDescripcion_Internalname = "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx ;
      cmbTDet_ListTipo.setInternalname( "TDET_LISTTIPO_"+sGXsfl_114_idx );
      edtTDet_ValorAtributo_Internalname = "TDET_VALORATRIBUTO_"+sGXsfl_114_idx ;
   }

   public void subsflControlProps_fel_11413( )
   {
      edtTDet_ListId_Internalname = "TDET_LISTID_"+sGXsfl_114_fel_idx ;
      imgprompt_70_Internalname = "PROMPT_70_"+sGXsfl_114_fel_idx ;
      edtTDet_ListDescripcion_Internalname = "TDET_LISTDESCRIPCION_"+sGXsfl_114_fel_idx ;
      cmbTDet_ListTipo.setInternalname( "TDET_LISTTIPO_"+sGXsfl_114_fel_idx );
      edtTDet_ValorAtributo_Internalname = "TDET_VALORATRIBUTO_"+sGXsfl_114_fel_idx ;
   }

   public void addRow0A13( )
   {
      nGXsfl_114_idx = (short)(nGXsfl_114_idx+1) ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11413( ) ;
      sendRow0A13( ) ;
   }

   public void sendRow0A13( )
   {
      Gridalm_detalle_transaccion_atributosRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_detalle_transaccion_atributos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_detalle_transaccion_atributos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_atributos_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_atributos_Linesclass = subGridalm_detalle_transaccion_atributos_Class+"Odd" ;
         }
      }
      else if ( subGridalm_detalle_transaccion_atributos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_detalle_transaccion_atributos_Backstyle = (byte)(0) ;
         subGridalm_detalle_transaccion_atributos_Backcolor = subGridalm_detalle_transaccion_atributos_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_atributos_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_atributos_Linesclass = subGridalm_detalle_transaccion_atributos_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_detalle_transaccion_atributos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_detalle_transaccion_atributos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_atributos_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_atributos_Linesclass = subGridalm_detalle_transaccion_atributos_Class+"Odd" ;
         }
         subGridalm_detalle_transaccion_atributos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_detalle_transaccion_atributos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_detalle_transaccion_atributos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_114_idx) % (2))) == 0 )
         {
            subGridalm_detalle_transaccion_atributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_detalle_transaccion_atributos_Class, "") != 0 )
            {
               subGridalm_detalle_transaccion_atributos_Linesclass = subGridalm_detalle_transaccion_atributos_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_detalle_transaccion_atributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_detalle_transaccion_atributos_Class, "") != 0 )
            {
               subGridalm_detalle_transaccion_atributos_Linesclass = subGridalm_detalle_transaccion_atributos_Class+"Odd" ;
            }
         }
      }
      imgprompt_70_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0130"+"',["+"{Ctrl:gx.dom.el('"+"TDET_LISTID_"+sGXsfl_114_idx+"'), id:'"+"TDET_LISTID_"+sGXsfl_114_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_13_"+sGXsfl_114_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00d2"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TDET_CONSECUTIVO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TDET_CONSECUTIVO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TDET_LISTID_"',3),t(+,5),t(sGXsfl_114_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"TDET_LISTID_"',3),t(+,5),t(sGXsfl_114_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_13_"',3),t(+,5),t(sGXsfl_114_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_46_69,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_114_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_114_idx + "',114)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_atributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ListId_Internalname,GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A70TDet_ListId), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ListId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTDet_ListId_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_detalle_transaccion_atributosRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_70_Internalname,sImgUrl,imgprompt_70_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_70_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_atributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ListDescripcion_Internalname,A492TDet_ListDescripcion,GXutil.rtrim( localUtil.format( A492TDet_ListDescripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ListDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTDet_ListDescripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      GXCCtl = "TDET_LISTTIPO_" + sGXsfl_114_idx ;
      cmbTDet_ListTipo.setName( GXCCtl );
      cmbTDet_ListTipo.setWebtags( "" );
      cmbTDet_ListTipo.addItem("O", "Otro", (short)(0));
      cmbTDet_ListTipo.addItem("F", "Fecha", (short)(0));
      if ( cmbTDet_ListTipo.getItemCount() > 0 )
      {
         A493TDet_ListTipo = cmbTDet_ListTipo.getValidValue(A493TDet_ListTipo) ;
         n493TDet_ListTipo = false ;
      }
      /* ComboBox */
      Gridalm_detalle_transaccion_atributosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTDet_ListTipo,cmbTDet_ListTipo.getInternalname(),GXutil.rtrim( A493TDet_ListTipo),new Integer(1),cmbTDet_ListTipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbTDet_ListTipo.getEnabled()),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","","",new Boolean(true)});
      cmbTDet_ListTipo.setValue( GXutil.rtrim( A493TDet_ListTipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTDet_ListTipo.getInternalname(), "Values", cmbTDet_ListTipo.ToJavascriptSource(), !bGXsfl_114_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_114_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_114_idx + "',114)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_atributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTDet_ValorAtributo_Internalname,A494TDet_ValorAtributo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTDet_ValorAtributo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTDet_ValorAtributo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridalm_detalle_transaccion_atributosRow);
      GXCCtl = "Z70TDet_ListId_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z70TDet_ListId, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "Z494TDet_ValorAtributo_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z494TDet_ValorAtributo);
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_13_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_13_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_114_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV11TrnContext);
      }
      GXCCtl = "vTRAN_ID_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "vTDET_CONSECUTIVO_" + sGXsfl_114_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_LISTID_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListId_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ListDescripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_LISTTIPO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTDet_ListTipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORATRIBUTO_"+sGXsfl_114_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTDet_ValorAtributo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_70_"+sGXsfl_114_idx+"Link", GXutil.rtrim( imgprompt_70_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_detalle_transaccion_atributosContainer.AddRow(Gridalm_detalle_transaccion_atributosRow);
   }

   public void readRow0A13( )
   {
      nGXsfl_114_idx = (short)(nGXsfl_114_idx+1) ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11413( ) ;
      edtTDet_ListId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTID_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
      edtTDet_ListDescripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTDESCRIPCION_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
      cmbTDet_ListTipo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TDET_LISTTIPO_"+sGXsfl_114_idx+"Enabled"), ",", ".")) );
      edtTDet_ValorAtributo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TDET_VALORATRIBUTO_"+sGXsfl_114_idx+"Enabled"), ",", ".")) ;
      imgprompt_46_Link = httpContext.cgiGet( "PROMPT_70_"+sGXsfl_114_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_ListId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTDet_ListId_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "TDET_LISTID_" + sGXsfl_114_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTDet_ListId_Internalname ;
         wbErr = true ;
         A70TDet_ListId = 0 ;
      }
      else
      {
         A70TDet_ListId = localUtil.ctol( httpContext.cgiGet( edtTDet_ListId_Internalname), ",", ".") ;
      }
      A492TDet_ListDescripcion = GXutil.upper( httpContext.cgiGet( edtTDet_ListDescripcion_Internalname)) ;
      n492TDet_ListDescripcion = false ;
      cmbTDet_ListTipo.setName( cmbTDet_ListTipo.getInternalname() );
      cmbTDet_ListTipo.setValue( httpContext.cgiGet( cmbTDet_ListTipo.getInternalname()) );
      A493TDet_ListTipo = httpContext.cgiGet( cmbTDet_ListTipo.getInternalname()) ;
      n493TDet_ListTipo = false ;
      A494TDet_ValorAtributo = httpContext.cgiGet( edtTDet_ValorAtributo_Internalname) ;
      GXCCtl = "Z70TDet_ListId_" + sGXsfl_114_idx ;
      Z70TDet_ListId = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z494TDet_ValorAtributo_" + sGXsfl_114_idx ;
      Z494TDet_ValorAtributo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_114_idx ;
      nRcdDeleted_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_13_" + sGXsfl_114_idx ;
      nRcdExists_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_13_" + sGXsfl_114_idx ;
      nIsMod_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void subsflControlProps_12714( )
   {
      edtTran_Entrada_Internalname = "TRAN_ENTRADA_"+sGXsfl_127_idx ;
      edtNro_Linea_Internalname = "NRO_LINEA_"+sGXsfl_127_idx ;
      edtTran_Cantidad_Internalname = "TRAN_CANTIDAD_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_12714( )
   {
      edtTran_Entrada_Internalname = "TRAN_ENTRADA_"+sGXsfl_127_fel_idx ;
      edtNro_Linea_Internalname = "NRO_LINEA_"+sGXsfl_127_fel_idx ;
      edtTran_Cantidad_Internalname = "TRAN_CANTIDAD_"+sGXsfl_127_fel_idx ;
   }

   public void addRow0A14( )
   {
      nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12714( ) ;
      sendRow0A14( ) ;
   }

   public void sendRow0A14( )
   {
      Gridalm_detalle_transaccion_datos_salidaRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_detalle_transaccion_datos_salida_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_detalle_transaccion_datos_salida_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_datos_salida_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_datos_salida_Linesclass = subGridalm_detalle_transaccion_datos_salida_Class+"Odd" ;
         }
      }
      else if ( subGridalm_detalle_transaccion_datos_salida_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_detalle_transaccion_datos_salida_Backstyle = (byte)(0) ;
         subGridalm_detalle_transaccion_datos_salida_Backcolor = subGridalm_detalle_transaccion_datos_salida_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_datos_salida_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_datos_salida_Linesclass = subGridalm_detalle_transaccion_datos_salida_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_detalle_transaccion_datos_salida_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_detalle_transaccion_datos_salida_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_detalle_transaccion_datos_salida_Class, "") != 0 )
         {
            subGridalm_detalle_transaccion_datos_salida_Linesclass = subGridalm_detalle_transaccion_datos_salida_Class+"Odd" ;
         }
         subGridalm_detalle_transaccion_datos_salida_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_detalle_transaccion_datos_salida_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_detalle_transaccion_datos_salida_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
         {
            subGridalm_detalle_transaccion_datos_salida_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_detalle_transaccion_datos_salida_Class, "") != 0 )
            {
               subGridalm_detalle_transaccion_datos_salida_Linesclass = subGridalm_detalle_transaccion_datos_salida_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_detalle_transaccion_datos_salida_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_detalle_transaccion_datos_salida_Class, "") != 0 )
            {
               subGridalm_detalle_transaccion_datos_salida_Linesclass = subGridalm_detalle_transaccion_datos_salida_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00e2"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TDET_CONSECUTIVO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TDET_CONSECUTIVO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TRAN_ENTRADA_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"TRAN_ENTRADA_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"NRO_LINEA_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"NRO_LINEA_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_14_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_46_69,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_127_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_datos_salidaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Entrada_Internalname,GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A71Tran_Entrada), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Entrada_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Entrada_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_127_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_datos_salidaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNro_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A72Nro_Linea), "ZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNro_Linea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtNro_Linea_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_14_" + sGXsfl_127_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_detalle_transaccion_datos_salidaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A687Tran_Cantidad, (byte)(8), (byte)(0), ",", "")),((edtTran_Cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A687Tran_Cantidad), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A687Tran_Cantidad), "ZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Cantidad_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Cantidad_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      httpContext.ajax_sending_grid_row(Gridalm_detalle_transaccion_datos_salidaRow);
      GXCCtl = "Z71Tran_Entrada_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z71Tran_Entrada, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "Z72Nro_Linea_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z72Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "Z687Tran_Cantidad_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z687Tran_Cantidad, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_14, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_14_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_14, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_14_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_14, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_127_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV11TrnContext);
      }
      GXCCtl = "vTRAN_ID_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "vTDET_CONSECUTIVO_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ENTRADA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Entrada_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NRO_LINEA_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNro_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CANTIDAD_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Cantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_detalle_transaccion_datos_salidaContainer.AddRow(Gridalm_detalle_transaccion_datos_salidaRow);
   }

   public void readRow0A14( )
   {
      nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12714( ) ;
      edtTran_Entrada_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_ENTRADA_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      edtNro_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NRO_LINEA_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      edtTran_Cantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_CANTIDAD_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Entrada_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Entrada_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "TRAN_ENTRADA_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Entrada_Internalname ;
         wbErr = true ;
         A71Tran_Entrada = 0 ;
      }
      else
      {
         A71Tran_Entrada = localUtil.ctol( httpContext.cgiGet( edtTran_Entrada_Internalname), ",", ".") ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNro_Linea_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNro_Linea_Internalname), ",", ".") > 99999999 ) ) )
      {
         GXCCtl = "NRO_LINEA_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNro_Linea_Internalname ;
         wbErr = true ;
         A72Nro_Linea = 0 ;
      }
      else
      {
         A72Nro_Linea = (int)(localUtil.ctol( httpContext.cgiGet( edtNro_Linea_Internalname), ",", ".")) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Cantidad_Internalname), ",", ".") > 99999999 ) ) )
      {
         GXCCtl = "TRAN_CANTIDAD_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Cantidad_Internalname ;
         wbErr = true ;
         A687Tran_Cantidad = 0 ;
         n687Tran_Cantidad = false ;
      }
      else
      {
         A687Tran_Cantidad = (int)(localUtil.ctol( httpContext.cgiGet( edtTran_Cantidad_Internalname), ",", ".")) ;
         n687Tran_Cantidad = false ;
      }
      n687Tran_Cantidad = ((0==A687Tran_Cantidad) ? true : false) ;
      GXCCtl = "Z71Tran_Entrada_" + sGXsfl_127_idx ;
      Z71Tran_Entrada = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z72Nro_Linea_" + sGXsfl_127_idx ;
      Z72Nro_Linea = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z687Tran_Cantidad_" + sGXsfl_127_idx ;
      Z687Tran_Cantidad = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      n687Tran_Cantidad = ((0==A687Tran_Cantidad) ? true : false) ;
      GXCCtl = "nRcdDeleted_14_" + sGXsfl_127_idx ;
      nRcdDeleted_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_14_" + sGXsfl_127_idx ;
      nRcdExists_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_14_" + sGXsfl_127_idx ;
      nIsMod_14 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtNro_Linea_Enabled = edtNro_Linea_Enabled ;
      defedtTran_Entrada_Enabled = edtTran_Entrada_Enabled ;
      defedtTDet_ListId_Enabled = edtTDet_ListId_Enabled ;
   }

   public void confirmValues0A0( )
   {
      nGXsfl_114_idx = (short)(0) ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11413( ) ;
      while ( nGXsfl_114_idx < nRC_GXsfl_114 )
      {
         nGXsfl_114_idx = (short)(nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11413( ) ;
         httpContext.changePostValue( "Z70TDet_ListId_"+sGXsfl_114_idx, httpContext.cgiGet( "ZT_"+"Z70TDet_ListId_"+sGXsfl_114_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z70TDet_ListId_"+sGXsfl_114_idx) ;
         httpContext.changePostValue( "Z494TDet_ValorAtributo_"+sGXsfl_114_idx, httpContext.cgiGet( "ZT_"+"Z494TDet_ValorAtributo_"+sGXsfl_114_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z494TDet_ValorAtributo_"+sGXsfl_114_idx) ;
      }
      nGXsfl_127_idx = (short)(0) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12714( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12714( ) ;
         httpContext.changePostValue( "Z71Tran_Entrada_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z71Tran_Entrada_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z71Tran_Entrada_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z72Nro_Linea_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z72Nro_Linea_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z72Nro_Linea_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z687Tran_Cantidad_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z687Tran_Cantidad_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z687Tran_Cantidad_"+sGXsfl_127_idx) ;
      }
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141414536");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8TDet_Consecutivo,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z46Tran_Id", GXutil.ltrim( localUtil.ntoc( Z46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z69TDet_Consecutivo", GXutil.ltrim( localUtil.ntoc( Z69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z487TDet_Cantidad", GXutil.ltrim( localUtil.ntoc( Z487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z488TDet_ValorUnitario", GXutil.ltrim( localUtil.ntoc( Z488TDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z489TDet_ValorTotal", GXutil.ltrim( localUtil.ntoc( Z489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z490TDet_PlacaNumero", Z490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z504TDet_Observaciones", Z504TDet_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z491TDet_PlacaPadre", Z491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z505TDet_EsPadre", Z505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z525TDet_Atributos", Z525TDet_Atributos);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z653TDet_Valor_Presente", GXutil.ltrim( localUtil.ntoc( Z653TDet_Valor_Presente, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z654TDet_Valor_Futuro", GXutil.ltrim( localUtil.ntoc( Z654TDet_Valor_Futuro, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z655TDet_Taza", GXutil.ltrim( localUtil.ntoc( Z655TDet_Taza, (byte)(3), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z656TDet_Plazo_N", GXutil.ltrim( localUtil.ntoc( Z656TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z657TDet_Otros_Costos", GXutil.ltrim( localUtil.ntoc( Z657TDet_Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z658TDet_Agrupado", GXutil.ltrim( localUtil.ntoc( Z658TDet_Agrupado, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z817TDet_PlacaRecuperada", Z817TDet_PlacaRecuperada);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z66Elem_Consecutivo", Z66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_114", GXutil.ltrim( localUtil.ntoc( nGXsfl_114_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_127", GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N66Elem_Consecutivo", A66Elem_Consecutivo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV7Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV8TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ELEM_CONSECUTIVO", AV15Insert_Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACARECUPERADA", A817TDet_PlacaRecuperada);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_COD", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTO", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_CODIGO", A34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_CODIGO", A35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGO", A75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_INDE_S", A481Tran_IndE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTDET_CONSECUTIVO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_DETALLE_TRANSACCION" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A817TDet_PlacaRecuperada, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_detalle_transaccion:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_detalle_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8TDet_Consecutivo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_DETALLE_TRANSACCION" ;
   }

   public String getPgmdesc( )
   {
      return "Detalle transacción" ;
   }

   public void initializeNonKey0A12( )
   {
      A49Tran_CodigoMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      A35FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      A34Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      A37Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      A66Elem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      A557Elem_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A298Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A75SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      A77UNIMED_COD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
      A33Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      A487TDet_Cantidad = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A487TDet_Cantidad", GXutil.ltrim( GXutil.str( A487TDet_Cantidad, 10, 0)));
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A488TDet_ValorUnitario", GXutil.ltrim( GXutil.str( A488TDet_ValorUnitario, 18, 2)));
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A489TDet_ValorTotal", GXutil.ltrim( GXutil.str( A489TDet_ValorTotal, 18, 2)));
      A490TDet_PlacaNumero = "" ;
      n490TDet_PlacaNumero = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490TDet_PlacaNumero", A490TDet_PlacaNumero);
      n490TDet_PlacaNumero = ((GXutil.strcmp("", A490TDet_PlacaNumero)==0) ? true : false) ;
      A504TDet_Observaciones = "" ;
      n504TDet_Observaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A504TDet_Observaciones", A504TDet_Observaciones);
      n504TDet_Observaciones = ((GXutil.strcmp("", A504TDet_Observaciones)==0) ? true : false) ;
      A491TDet_PlacaPadre = "" ;
      n491TDet_PlacaPadre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A491TDet_PlacaPadre", A491TDet_PlacaPadre);
      n491TDet_PlacaPadre = ((GXutil.strcmp("", A491TDet_PlacaPadre)==0) ? true : false) ;
      A505TDet_EsPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A505TDet_EsPadre", A505TDet_EsPadre);
      A525TDet_Atributos = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A525TDet_Atributos", A525TDet_Atributos);
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      n653TDet_Valor_Presente = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653TDet_Valor_Presente", GXutil.ltrim( GXutil.str( A653TDet_Valor_Presente, 18, 2)));
      n653TDet_Valor_Presente = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A653TDet_Valor_Presente)==0) ? true : false) ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      n654TDet_Valor_Futuro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A654TDet_Valor_Futuro", GXutil.ltrim( GXutil.str( A654TDet_Valor_Futuro, 18, 2)));
      n654TDet_Valor_Futuro = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A654TDet_Valor_Futuro)==0) ? true : false) ;
      A655TDet_Taza = (short)(0) ;
      n655TDet_Taza = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A655TDet_Taza", GXutil.ltrim( GXutil.str( A655TDet_Taza, 3, 0)));
      n655TDet_Taza = ((0==A655TDet_Taza) ? true : false) ;
      A656TDet_Plazo_N = (byte)(0) ;
      n656TDet_Plazo_N = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A656TDet_Plazo_N", GXutil.ltrim( GXutil.str( A656TDet_Plazo_N, 2, 0)));
      n656TDet_Plazo_N = ((0==A656TDet_Plazo_N) ? true : false) ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      n657TDet_Otros_Costos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A657TDet_Otros_Costos", GXutil.ltrim( GXutil.str( A657TDet_Otros_Costos, 18, 2)));
      n657TDet_Otros_Costos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A657TDet_Otros_Costos)==0) ? true : false) ;
      A658TDet_Agrupado = (short)(0) ;
      n658TDet_Agrupado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658TDet_Agrupado", GXutil.ltrim( GXutil.str( A658TDet_Agrupado, 4, 0)));
      n658TDet_Agrupado = ((0==A658TDet_Agrupado) ? true : false) ;
      A817TDet_PlacaRecuperada = "" ;
      n817TDet_PlacaRecuperada = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A817TDet_PlacaRecuperada", A817TDet_PlacaRecuperada);
      A481Tran_IndE_S = "" ;
      n481Tran_IndE_S = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      Z487TDet_Cantidad = 0 ;
      Z488TDet_ValorUnitario = DecimalUtil.ZERO ;
      Z489TDet_ValorTotal = DecimalUtil.ZERO ;
      Z490TDet_PlacaNumero = "" ;
      Z504TDet_Observaciones = "" ;
      Z491TDet_PlacaPadre = "" ;
      Z505TDet_EsPadre = "" ;
      Z525TDet_Atributos = "" ;
      Z653TDet_Valor_Presente = DecimalUtil.ZERO ;
      Z654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      Z655TDet_Taza = (short)(0) ;
      Z656TDet_Plazo_N = (byte)(0) ;
      Z657TDet_Otros_Costos = DecimalUtil.ZERO ;
      Z658TDet_Agrupado = (short)(0) ;
      Z817TDet_PlacaRecuperada = "" ;
      Z66Elem_Consecutivo = "" ;
   }

   public void initAll0A12( )
   {
      A46Tran_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      A69TDet_Consecutivo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A69TDet_Consecutivo", GXutil.ltrim( GXutil.str( A69TDet_Consecutivo, 18, 0)));
      initializeNonKey0A12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0A13( )
   {
      A492TDet_ListDescripcion = "" ;
      n492TDet_ListDescripcion = false ;
      A493TDet_ListTipo = "" ;
      n493TDet_ListTipo = false ;
      A494TDet_ValorAtributo = "" ;
      Z494TDet_ValorAtributo = "" ;
   }

   public void initAll0A13( )
   {
      A70TDet_ListId = 0 ;
      initializeNonKey0A13( ) ;
   }

   public void standaloneModalInsert0A13( )
   {
   }

   public void initializeNonKey0A14( )
   {
      A687Tran_Cantidad = 0 ;
      n687Tran_Cantidad = false ;
      Z687Tran_Cantidad = 0 ;
   }

   public void initAll0A14( )
   {
      A71Tran_Entrada = 0 ;
      A72Nro_Linea = 0 ;
      initializeNonKey0A14( ) ;
   }

   public void standaloneModalInsert0A14( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414145328");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_detalle_transaccion.js", "?201861414145328");
      /* End function include_jscripts */
   }

   public void init_level_properties13( )
   {
      edtTDet_ListId_Enabled = defedtTDet_ListId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTDet_ListId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTDet_ListId_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
   }

   public void init_level_properties14( )
   {
      edtNro_Linea_Enabled = defedtNro_Linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtNro_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNro_Linea_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      edtTran_Entrada_Enabled = defedtTran_Entrada_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Entrada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Entrada_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
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
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTDet_Consecutivo_Internalname = "TDET_CONSECUTIVO" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtTDet_Cantidad_Internalname = "TDET_CANTIDAD" ;
      edtTDet_ValorUnitario_Internalname = "TDET_VALORUNITARIO" ;
      edtTDet_ValorTotal_Internalname = "TDET_VALORTOTAL" ;
      edtTDet_PlacaNumero_Internalname = "TDET_PLACANUMERO" ;
      edtTDet_Observaciones_Internalname = "TDET_OBSERVACIONES" ;
      edtTDet_PlacaPadre_Internalname = "TDET_PLACAPADRE" ;
      edtTDet_EsPadre_Internalname = "TDET_ESPADRE" ;
      edtTDet_Atributos_Internalname = "TDET_ATRIBUTOS" ;
      edtTDet_Valor_Presente_Internalname = "TDET_VALOR_PRESENTE" ;
      edtTDet_Valor_Futuro_Internalname = "TDET_VALOR_FUTURO" ;
      edtTDet_Taza_Internalname = "TDET_TAZA" ;
      edtTDet_Plazo_N_Internalname = "TDET_PLAZO_N" ;
      edtTDet_Otros_Costos_Internalname = "TDET_OTROS_COSTOS" ;
      edtTDet_Agrupado_Internalname = "TDET_AGRUPADO" ;
      lblTitleatributos_Internalname = "TITLEATRIBUTOS" ;
      edtTDet_ListId_Internalname = "TDET_LISTID" ;
      edtTDet_ListDescripcion_Internalname = "TDET_LISTDESCRIPCION" ;
      cmbTDet_ListTipo.setInternalname( "TDET_LISTTIPO" );
      edtTDet_ValorAtributo_Internalname = "TDET_VALORATRIBUTO" ;
      divAtributostable_Internalname = "ATRIBUTOSTABLE" ;
      lblTitledatos_salida_Internalname = "TITLEDATOS_SALIDA" ;
      edtTran_Entrada_Internalname = "TRAN_ENTRADA" ;
      edtNro_Linea_Internalname = "NRO_LINEA" ;
      edtTran_Cantidad_Internalname = "TRAN_CANTIDAD" ;
      divDatos_salidatable_Internalname = "DATOS_SALIDATABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_46_Internalname = "PROMPT_46" ;
      imgprompt_66_Internalname = "PROMPT_66" ;
      imgprompt_70_Internalname = "PROMPT_70" ;
      subGridalm_detalle_transaccion_atributos_Internalname = "GRIDALM_DETALLE_TRANSACCION_ATRIBUTOS" ;
      subGridalm_detalle_transaccion_datos_salida_Internalname = "GRIDALM_DETALLE_TRANSACCION_DATOS_SALIDA" ;
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
      Form.setCaption( "Detalle transacción" );
      edtTran_Cantidad_Jsonclick = "" ;
      edtNro_Linea_Jsonclick = "" ;
      edtTran_Entrada_Jsonclick = "" ;
      subGridalm_detalle_transaccion_datos_salida_Class = "Grid" ;
      subGridalm_detalle_transaccion_datos_salida_Backcolorstyle = (byte)(0) ;
      edtTDet_ValorAtributo_Jsonclick = "" ;
      cmbTDet_ListTipo.setJsonclick( "" );
      edtTDet_ListDescripcion_Jsonclick = "" ;
      imgprompt_70_Visible = 1 ;
      imgprompt_70_Link = "" ;
      imgprompt_46_Visible = 1 ;
      edtTDet_ListId_Jsonclick = "" ;
      subGridalm_detalle_transaccion_atributos_Class = "Grid" ;
      subGridalm_detalle_transaccion_atributos_Backcolorstyle = (byte)(0) ;
      subGridalm_detalle_transaccion_datos_salida_Allowcollapsing = (byte)(0) ;
      subGridalm_detalle_transaccion_datos_salida_Allowselection = (byte)(0) ;
      edtTran_Cantidad_Enabled = 1 ;
      edtNro_Linea_Enabled = 1 ;
      edtTran_Entrada_Enabled = 1 ;
      subGridalm_detalle_transaccion_atributos_Allowcollapsing = (byte)(0) ;
      subGridalm_detalle_transaccion_atributos_Allowselection = (byte)(0) ;
      edtTDet_ValorAtributo_Enabled = 1 ;
      cmbTDet_ListTipo.setEnabled( 0 );
      edtTDet_ListDescripcion_Enabled = 0 ;
      edtTDet_ListId_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTDet_Agrupado_Jsonclick = "" ;
      edtTDet_Agrupado_Enabled = 1 ;
      edtTDet_Otros_Costos_Jsonclick = "" ;
      edtTDet_Otros_Costos_Enabled = 1 ;
      edtTDet_Plazo_N_Jsonclick = "" ;
      edtTDet_Plazo_N_Enabled = 1 ;
      edtTDet_Taza_Jsonclick = "" ;
      edtTDet_Taza_Enabled = 1 ;
      edtTDet_Valor_Futuro_Jsonclick = "" ;
      edtTDet_Valor_Futuro_Enabled = 1 ;
      edtTDet_Valor_Presente_Jsonclick = "" ;
      edtTDet_Valor_Presente_Enabled = 1 ;
      edtTDet_Atributos_Jsonclick = "" ;
      edtTDet_Atributos_Enabled = 1 ;
      edtTDet_EsPadre_Jsonclick = "" ;
      edtTDet_EsPadre_Enabled = 1 ;
      edtTDet_PlacaPadre_Jsonclick = "" ;
      edtTDet_PlacaPadre_Enabled = 1 ;
      edtTDet_Observaciones_Enabled = 1 ;
      edtTDet_PlacaNumero_Jsonclick = "" ;
      edtTDet_PlacaNumero_Enabled = 1 ;
      edtTDet_ValorTotal_Jsonclick = "" ;
      edtTDet_ValorTotal_Enabled = 1 ;
      edtTDet_ValorUnitario_Jsonclick = "" ;
      edtTDet_ValorUnitario_Enabled = 1 ;
      edtTDet_Cantidad_Jsonclick = "" ;
      edtTDet_Cantidad_Enabled = 1 ;
      edtCata_Descripcion_Enabled = 0 ;
      edtElem_Descripcion_Enabled = 0 ;
      imgprompt_66_Visible = 1 ;
      imgprompt_66_Link = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 1 ;
      edtTDet_Consecutivo_Jsonclick = "" ;
      edtTDet_Consecutivo_Enabled = 1 ;
      imgprompt_46_Visible = 1 ;
      imgprompt_46_Link = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 1 ;
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

   public void gxnrgridalm_detalle_transaccion_atributos_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_11413( ) ;
      while ( nGXsfl_114_idx <= nRC_GXsfl_114 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0A13( ) ;
         standaloneModal0A13( ) ;
         GXCCtl = "TDET_LISTTIPO_" + sGXsfl_114_idx ;
         cmbTDet_ListTipo.setName( GXCCtl );
         cmbTDet_ListTipo.setWebtags( "" );
         cmbTDet_ListTipo.addItem("O", "Otro", (short)(0));
         cmbTDet_ListTipo.addItem("F", "Fecha", (short)(0));
         if ( cmbTDet_ListTipo.getItemCount() > 0 )
         {
            A493TDet_ListTipo = cmbTDet_ListTipo.getValidValue(A493TDet_ListTipo) ;
            n493TDet_ListTipo = false ;
         }
         dynload_actions( ) ;
         sendRow0A13( ) ;
         nGXsfl_114_idx = (short)(nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11413( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_detalle_transaccion_atributosContainer.ToJavascriptSource());
      /* End function gxnrGridalm_detalle_transaccion_atributos_newrow */
   }

   public void gxnrgridalm_detalle_transaccion_datos_salida_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_12714( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0A14( ) ;
         standaloneModal0A14( ) ;
         GXCCtl = "TDET_LISTTIPO_" + sGXsfl_114_idx ;
         cmbTDet_ListTipo.setName( GXCCtl );
         cmbTDet_ListTipo.setWebtags( "" );
         cmbTDet_ListTipo.addItem("O", "Otro", (short)(0));
         cmbTDet_ListTipo.addItem("F", "Fecha", (short)(0));
         if ( cmbTDet_ListTipo.getItemCount() > 0 )
         {
            A493TDet_ListTipo = cmbTDet_ListTipo.getValidValue(A493TDet_ListTipo) ;
            n493TDet_ListTipo = false ;
         }
         dynload_actions( ) ;
         sendRow0A14( ) ;
         nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12714( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_detalle_transaccion_datos_salidaContainer.ToJavascriptSource());
      /* End function gxnrGridalm_detalle_transaccion_datos_salida_newrow */
   }

   public void valid_Tran_id( long GX_Parm1 ,
                              String GX_Parm2 ,
                              String GX_Parm3 )
   {
      A46Tran_Id = GX_Parm1 ;
      A49Tran_CodigoMovimiento = GX_Parm2 ;
      A481Tran_IndE_S = GX_Parm3 ;
      n481Tran_IndE_S = false ;
      /* Using cursor T000A28 */
      pr_default.execute(26, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TRANSACCION'.", "ForeignKeyNotFound", 1, "TRAN_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Id_Internalname ;
      }
      A49Tran_CodigoMovimiento = T000A28_A49Tran_CodigoMovimiento[0] ;
      pr_default.close(26);
      /* Using cursor T000A29 */
      pr_default.execute(27, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A481Tran_IndE_S = T000A29_A481Tran_IndE_S[0] ;
      n481Tran_IndE_S = T000A29_n481Tran_IndE_S[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A49Tran_CodigoMovimiento = "" ;
         A481Tran_IndE_S = "" ;
         n481Tran_IndE_S = false ;
      }
      isValidOutput.add(A49Tran_CodigoMovimiento);
      isValidOutput.add(A481Tran_IndE_S);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Elem_consecutivo( String GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 ,
                                       String GX_Parm4 ,
                                       String GX_Parm5 ,
                                       long GX_Parm6 ,
                                       int GX_Parm7 ,
                                       String GX_Parm8 ,
                                       String GX_Parm9 )
   {
      A66Elem_Consecutivo = GX_Parm1 ;
      A37Cata_Codigo = GX_Parm2 ;
      A34Clas_Codigo = GX_Parm3 ;
      A35FAM_Codigo = GX_Parm4 ;
      A557Elem_Descripcion = GX_Parm5 ;
      A33Tipo_Codigo = GX_Parm6 ;
      A77UNIMED_COD = GX_Parm7 ;
      A298Cata_Descripcion = GX_Parm8 ;
      A75SEG_Codigo = GX_Parm9 ;
      /* Using cursor T000A30 */
      pr_default.execute(28, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Elemento'.", "ForeignKeyNotFound", 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
      }
      A37Cata_Codigo = T000A30_A37Cata_Codigo[0] ;
      A557Elem_Descripcion = T000A30_A557Elem_Descripcion[0] ;
      A33Tipo_Codigo = T000A30_A33Tipo_Codigo[0] ;
      A77UNIMED_COD = T000A30_A77UNIMED_COD[0] ;
      pr_default.close(28);
      /* Using cursor T000A31 */
      pr_default.execute(29, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A34Clas_Codigo = T000A31_A34Clas_Codigo[0] ;
      A298Cata_Descripcion = T000A31_A298Cata_Descripcion[0] ;
      pr_default.close(29);
      /* Using cursor T000A32 */
      pr_default.execute(30, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A35FAM_Codigo = T000A32_A35FAM_Codigo[0] ;
      pr_default.close(30);
      /* Using cursor T000A33 */
      pr_default.execute(31, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A75SEG_Codigo = T000A33_A75SEG_Codigo[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A37Cata_Codigo = "" ;
         A557Elem_Descripcion = "" ;
         A33Tipo_Codigo = 0 ;
         A77UNIMED_COD = 0 ;
         A34Clas_Codigo = "" ;
         A298Cata_Descripcion = "" ;
         A35FAM_Codigo = "" ;
         A75SEG_Codigo = "" ;
      }
      isValidOutput.add(A37Cata_Codigo);
      isValidOutput.add(A557Elem_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(A34Clas_Codigo);
      isValidOutput.add(A298Cata_Descripcion);
      isValidOutput.add(A35FAM_Codigo);
      isValidOutput.add(A75SEG_Codigo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tdet_listid( long GX_Parm1 ,
                                  String GX_Parm2 ,
                                  com.genexus.webpanels.HTMLChoice GX_Parm3 )
   {
      A70TDet_ListId = GX_Parm1 ;
      A492TDet_ListDescripcion = GX_Parm2 ;
      n492TDet_ListDescripcion = false ;
      cmbTDet_ListTipo = GX_Parm3 ;
      A493TDet_ListTipo = cmbTDet_ListTipo.getValue() ;
      n493TDet_ListTipo = false ;
      cmbTDet_ListTipo.setValue( A493TDet_ListTipo );
      /* Using cursor T000A41 */
      pr_default.execute(39, new Object[] {new Long(A70TDet_ListId)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Atributos Detalle'.", "ForeignKeyNotFound", 1, "TDET_LISTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTDet_ListId_Internalname ;
      }
      A492TDet_ListDescripcion = T000A41_A492TDet_ListDescripcion[0] ;
      n492TDet_ListDescripcion = T000A41_n492TDet_ListDescripcion[0] ;
      A493TDet_ListTipo = T000A41_A493TDet_ListTipo[0] ;
      cmbTDet_ListTipo.setValue( A493TDet_ListTipo );
      n493TDet_ListTipo = T000A41_n493TDet_ListTipo[0] ;
      pr_default.close(39);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A492TDet_ListDescripcion = "" ;
         n492TDet_ListDescripcion = false ;
         A493TDet_ListTipo = "" ;
         n493TDet_ListTipo = false ;
         cmbTDet_ListTipo.setValue( A493TDet_ListTipo );
      }
      isValidOutput.add(A492TDet_ListDescripcion);
      cmbTDet_ListTipo.setValue( A493TDet_ListTipo );
      isValidOutput.add(cmbTDet_ListTipo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120A2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(39);
      pr_default.close(28);
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z488TDet_ValorUnitario = DecimalUtil.ZERO ;
      Z489TDet_ValorTotal = DecimalUtil.ZERO ;
      Z490TDet_PlacaNumero = "" ;
      Z504TDet_Observaciones = "" ;
      Z491TDet_PlacaPadre = "" ;
      Z505TDet_EsPadre = "" ;
      Z525TDet_Atributos = "" ;
      Z653TDet_Valor_Presente = DecimalUtil.ZERO ;
      Z654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      Z657TDet_Otros_Costos = DecimalUtil.ZERO ;
      Z817TDet_PlacaRecuperada = "" ;
      Z66Elem_Consecutivo = "" ;
      N66Elem_Consecutivo = "" ;
      Z494TDet_ValorAtributo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      A493TDet_ListTipo = "" ;
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
      A557Elem_Descripcion = "" ;
      A298Cata_Descripcion = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A504TDet_Observaciones = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A525TDet_Atributos = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      lblTitleatributos_Jsonclick = "" ;
      lblTitledatos_salida_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_detalle_transaccion_atributosContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_detalle_transaccion_atributosColumn = new com.genexus.webpanels.GXWebColumn();
      A492TDet_ListDescripcion = "" ;
      A494TDet_ValorAtributo = "" ;
      sMode13 = "" ;
      sStyleString = "" ;
      Gridalm_detalle_transaccion_datos_salidaContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_detalle_transaccion_datos_salidaColumn = new com.genexus.webpanels.GXWebColumn();
      sMode14 = "" ;
      A817TDet_PlacaRecuperada = "" ;
      AV15Insert_Elem_Consecutivo = "" ;
      A75SEG_Codigo = "" ;
      A481Tran_IndE_S = "" ;
      AV16Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z49Tran_CodigoMovimiento = "" ;
      Z481Tran_IndE_S = "" ;
      Z37Cata_Codigo = "" ;
      Z557Elem_Descripcion = "" ;
      Z34Clas_Codigo = "" ;
      Z298Cata_Descripcion = "" ;
      Z35FAM_Codigo = "" ;
      Z75SEG_Codigo = "" ;
      T000A10_A49Tran_CodigoMovimiento = new String[] {""} ;
      T000A14_A481Tran_IndE_S = new String[] {""} ;
      T000A14_n481Tran_IndE_S = new boolean[] {false} ;
      T000A9_A37Cata_Codigo = new String[] {""} ;
      T000A9_A557Elem_Descripcion = new String[] {""} ;
      T000A9_A33Tipo_Codigo = new long[1] ;
      T000A9_A77UNIMED_COD = new int[1] ;
      T000A11_A34Clas_Codigo = new String[] {""} ;
      T000A11_A298Cata_Descripcion = new String[] {""} ;
      T000A12_A35FAM_Codigo = new String[] {""} ;
      T000A13_A75SEG_Codigo = new String[] {""} ;
      T000A15_A37Cata_Codigo = new String[] {""} ;
      T000A15_A34Clas_Codigo = new String[] {""} ;
      T000A15_A35FAM_Codigo = new String[] {""} ;
      T000A15_A49Tran_CodigoMovimiento = new String[] {""} ;
      T000A15_A69TDet_Consecutivo = new long[1] ;
      T000A15_A557Elem_Descripcion = new String[] {""} ;
      T000A15_A298Cata_Descripcion = new String[] {""} ;
      T000A15_A487TDet_Cantidad = new long[1] ;
      T000A15_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A15_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A15_A490TDet_PlacaNumero = new String[] {""} ;
      T000A15_n490TDet_PlacaNumero = new boolean[] {false} ;
      T000A15_A504TDet_Observaciones = new String[] {""} ;
      T000A15_n504TDet_Observaciones = new boolean[] {false} ;
      T000A15_A491TDet_PlacaPadre = new String[] {""} ;
      T000A15_n491TDet_PlacaPadre = new boolean[] {false} ;
      T000A15_A505TDet_EsPadre = new String[] {""} ;
      T000A15_A525TDet_Atributos = new String[] {""} ;
      T000A15_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A15_n653TDet_Valor_Presente = new boolean[] {false} ;
      T000A15_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A15_n654TDet_Valor_Futuro = new boolean[] {false} ;
      T000A15_A655TDet_Taza = new short[1] ;
      T000A15_n655TDet_Taza = new boolean[] {false} ;
      T000A15_A656TDet_Plazo_N = new byte[1] ;
      T000A15_n656TDet_Plazo_N = new boolean[] {false} ;
      T000A15_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A15_n657TDet_Otros_Costos = new boolean[] {false} ;
      T000A15_A658TDet_Agrupado = new short[1] ;
      T000A15_n658TDet_Agrupado = new boolean[] {false} ;
      T000A15_A817TDet_PlacaRecuperada = new String[] {""} ;
      T000A15_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      T000A15_A481Tran_IndE_S = new String[] {""} ;
      T000A15_n481Tran_IndE_S = new boolean[] {false} ;
      T000A15_A66Elem_Consecutivo = new String[] {""} ;
      T000A15_A46Tran_Id = new long[1] ;
      T000A15_A33Tipo_Codigo = new long[1] ;
      T000A15_A75SEG_Codigo = new String[] {""} ;
      T000A15_A77UNIMED_COD = new int[1] ;
      T000A16_A49Tran_CodigoMovimiento = new String[] {""} ;
      T000A17_A481Tran_IndE_S = new String[] {""} ;
      T000A17_n481Tran_IndE_S = new boolean[] {false} ;
      T000A18_A37Cata_Codigo = new String[] {""} ;
      T000A18_A557Elem_Descripcion = new String[] {""} ;
      T000A18_A33Tipo_Codigo = new long[1] ;
      T000A18_A77UNIMED_COD = new int[1] ;
      T000A19_A34Clas_Codigo = new String[] {""} ;
      T000A19_A298Cata_Descripcion = new String[] {""} ;
      T000A20_A35FAM_Codigo = new String[] {""} ;
      T000A21_A75SEG_Codigo = new String[] {""} ;
      T000A22_A46Tran_Id = new long[1] ;
      T000A22_A69TDet_Consecutivo = new long[1] ;
      T000A8_A69TDet_Consecutivo = new long[1] ;
      T000A8_A487TDet_Cantidad = new long[1] ;
      T000A8_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A8_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A8_A490TDet_PlacaNumero = new String[] {""} ;
      T000A8_n490TDet_PlacaNumero = new boolean[] {false} ;
      T000A8_A504TDet_Observaciones = new String[] {""} ;
      T000A8_n504TDet_Observaciones = new boolean[] {false} ;
      T000A8_A491TDet_PlacaPadre = new String[] {""} ;
      T000A8_n491TDet_PlacaPadre = new boolean[] {false} ;
      T000A8_A505TDet_EsPadre = new String[] {""} ;
      T000A8_A525TDet_Atributos = new String[] {""} ;
      T000A8_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A8_n653TDet_Valor_Presente = new boolean[] {false} ;
      T000A8_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A8_n654TDet_Valor_Futuro = new boolean[] {false} ;
      T000A8_A655TDet_Taza = new short[1] ;
      T000A8_n655TDet_Taza = new boolean[] {false} ;
      T000A8_A656TDet_Plazo_N = new byte[1] ;
      T000A8_n656TDet_Plazo_N = new boolean[] {false} ;
      T000A8_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A8_n657TDet_Otros_Costos = new boolean[] {false} ;
      T000A8_A658TDet_Agrupado = new short[1] ;
      T000A8_n658TDet_Agrupado = new boolean[] {false} ;
      T000A8_A817TDet_PlacaRecuperada = new String[] {""} ;
      T000A8_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      T000A8_A66Elem_Consecutivo = new String[] {""} ;
      T000A8_A46Tran_Id = new long[1] ;
      T000A23_A69TDet_Consecutivo = new long[1] ;
      T000A23_A46Tran_Id = new long[1] ;
      T000A24_A69TDet_Consecutivo = new long[1] ;
      T000A24_A46Tran_Id = new long[1] ;
      T000A7_A69TDet_Consecutivo = new long[1] ;
      T000A7_A487TDet_Cantidad = new long[1] ;
      T000A7_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A7_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A7_A490TDet_PlacaNumero = new String[] {""} ;
      T000A7_n490TDet_PlacaNumero = new boolean[] {false} ;
      T000A7_A504TDet_Observaciones = new String[] {""} ;
      T000A7_n504TDet_Observaciones = new boolean[] {false} ;
      T000A7_A491TDet_PlacaPadre = new String[] {""} ;
      T000A7_n491TDet_PlacaPadre = new boolean[] {false} ;
      T000A7_A505TDet_EsPadre = new String[] {""} ;
      T000A7_A525TDet_Atributos = new String[] {""} ;
      T000A7_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A7_n653TDet_Valor_Presente = new boolean[] {false} ;
      T000A7_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A7_n654TDet_Valor_Futuro = new boolean[] {false} ;
      T000A7_A655TDet_Taza = new short[1] ;
      T000A7_n655TDet_Taza = new boolean[] {false} ;
      T000A7_A656TDet_Plazo_N = new byte[1] ;
      T000A7_n656TDet_Plazo_N = new boolean[] {false} ;
      T000A7_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000A7_n657TDet_Otros_Costos = new boolean[] {false} ;
      T000A7_A658TDet_Agrupado = new short[1] ;
      T000A7_n658TDet_Agrupado = new boolean[] {false} ;
      T000A7_A817TDet_PlacaRecuperada = new String[] {""} ;
      T000A7_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      T000A7_A66Elem_Consecutivo = new String[] {""} ;
      T000A7_A46Tran_Id = new long[1] ;
      T000A28_A49Tran_CodigoMovimiento = new String[] {""} ;
      T000A29_A481Tran_IndE_S = new String[] {""} ;
      T000A29_n481Tran_IndE_S = new boolean[] {false} ;
      T000A30_A37Cata_Codigo = new String[] {""} ;
      T000A30_A557Elem_Descripcion = new String[] {""} ;
      T000A30_A33Tipo_Codigo = new long[1] ;
      T000A30_A77UNIMED_COD = new int[1] ;
      T000A31_A34Clas_Codigo = new String[] {""} ;
      T000A31_A298Cata_Descripcion = new String[] {""} ;
      T000A32_A35FAM_Codigo = new String[] {""} ;
      T000A33_A75SEG_Codigo = new String[] {""} ;
      T000A34_A46Tran_Id = new long[1] ;
      T000A34_A69TDet_Consecutivo = new long[1] ;
      Z492TDet_ListDescripcion = "" ;
      Z493TDet_ListTipo = "" ;
      T000A35_A46Tran_Id = new long[1] ;
      T000A35_A69TDet_Consecutivo = new long[1] ;
      T000A35_A492TDet_ListDescripcion = new String[] {""} ;
      T000A35_n492TDet_ListDescripcion = new boolean[] {false} ;
      T000A35_A493TDet_ListTipo = new String[] {""} ;
      T000A35_n493TDet_ListTipo = new boolean[] {false} ;
      T000A35_A494TDet_ValorAtributo = new String[] {""} ;
      T000A35_A70TDet_ListId = new long[1] ;
      T000A6_A492TDet_ListDescripcion = new String[] {""} ;
      T000A6_n492TDet_ListDescripcion = new boolean[] {false} ;
      T000A6_A493TDet_ListTipo = new String[] {""} ;
      T000A6_n493TDet_ListTipo = new boolean[] {false} ;
      T000A36_A492TDet_ListDescripcion = new String[] {""} ;
      T000A36_n492TDet_ListDescripcion = new boolean[] {false} ;
      T000A36_A493TDet_ListTipo = new String[] {""} ;
      T000A36_n493TDet_ListTipo = new boolean[] {false} ;
      T000A37_A46Tran_Id = new long[1] ;
      T000A37_A69TDet_Consecutivo = new long[1] ;
      T000A37_A70TDet_ListId = new long[1] ;
      T000A5_A46Tran_Id = new long[1] ;
      T000A5_A69TDet_Consecutivo = new long[1] ;
      T000A5_A494TDet_ValorAtributo = new String[] {""} ;
      T000A5_A70TDet_ListId = new long[1] ;
      T000A4_A46Tran_Id = new long[1] ;
      T000A4_A69TDet_Consecutivo = new long[1] ;
      T000A4_A494TDet_ValorAtributo = new String[] {""} ;
      T000A4_A70TDet_ListId = new long[1] ;
      T000A41_A492TDet_ListDescripcion = new String[] {""} ;
      T000A41_n492TDet_ListDescripcion = new boolean[] {false} ;
      T000A41_A493TDet_ListTipo = new String[] {""} ;
      T000A41_n493TDet_ListTipo = new boolean[] {false} ;
      T000A42_A46Tran_Id = new long[1] ;
      T000A42_A69TDet_Consecutivo = new long[1] ;
      T000A42_A70TDet_ListId = new long[1] ;
      T000A43_A46Tran_Id = new long[1] ;
      T000A43_A69TDet_Consecutivo = new long[1] ;
      T000A43_A71Tran_Entrada = new long[1] ;
      T000A43_A72Nro_Linea = new int[1] ;
      T000A43_A687Tran_Cantidad = new int[1] ;
      T000A43_n687Tran_Cantidad = new boolean[] {false} ;
      T000A44_A46Tran_Id = new long[1] ;
      T000A44_A69TDet_Consecutivo = new long[1] ;
      T000A44_A71Tran_Entrada = new long[1] ;
      T000A44_A72Nro_Linea = new int[1] ;
      T000A3_A46Tran_Id = new long[1] ;
      T000A3_A69TDet_Consecutivo = new long[1] ;
      T000A3_A71Tran_Entrada = new long[1] ;
      T000A3_A72Nro_Linea = new int[1] ;
      T000A3_A687Tran_Cantidad = new int[1] ;
      T000A3_n687Tran_Cantidad = new boolean[] {false} ;
      T000A2_A46Tran_Id = new long[1] ;
      T000A2_A69TDet_Consecutivo = new long[1] ;
      T000A2_A71Tran_Entrada = new long[1] ;
      T000A2_A72Nro_Linea = new int[1] ;
      T000A2_A687Tran_Cantidad = new int[1] ;
      T000A2_n687Tran_Cantidad = new boolean[] {false} ;
      T000A48_A46Tran_Id = new long[1] ;
      T000A48_A69TDet_Consecutivo = new long[1] ;
      T000A48_A71Tran_Entrada = new long[1] ;
      T000A48_A72Nro_Linea = new int[1] ;
      Gridalm_detalle_transaccion_atributosRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_detalle_transaccion_atributos_Linesclass = "" ;
      ROClassString = "" ;
      Gridalm_detalle_transaccion_datos_salidaRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_detalle_transaccion_datos_salida_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_detalle_transaccion__default(),
         new Object[] {
             new Object[] {
            T000A2_A46Tran_Id, T000A2_A69TDet_Consecutivo, T000A2_A71Tran_Entrada, T000A2_A72Nro_Linea, T000A2_A687Tran_Cantidad, T000A2_n687Tran_Cantidad
            }
            , new Object[] {
            T000A3_A46Tran_Id, T000A3_A69TDet_Consecutivo, T000A3_A71Tran_Entrada, T000A3_A72Nro_Linea, T000A3_A687Tran_Cantidad, T000A3_n687Tran_Cantidad
            }
            , new Object[] {
            T000A4_A46Tran_Id, T000A4_A69TDet_Consecutivo, T000A4_A494TDet_ValorAtributo, T000A4_A70TDet_ListId
            }
            , new Object[] {
            T000A5_A46Tran_Id, T000A5_A69TDet_Consecutivo, T000A5_A494TDet_ValorAtributo, T000A5_A70TDet_ListId
            }
            , new Object[] {
            T000A6_A492TDet_ListDescripcion, T000A6_n492TDet_ListDescripcion, T000A6_A493TDet_ListTipo, T000A6_n493TDet_ListTipo
            }
            , new Object[] {
            T000A7_A69TDet_Consecutivo, T000A7_A487TDet_Cantidad, T000A7_A488TDet_ValorUnitario, T000A7_A489TDet_ValorTotal, T000A7_A490TDet_PlacaNumero, T000A7_n490TDet_PlacaNumero, T000A7_A504TDet_Observaciones, T000A7_n504TDet_Observaciones, T000A7_A491TDet_PlacaPadre, T000A7_n491TDet_PlacaPadre,
            T000A7_A505TDet_EsPadre, T000A7_A525TDet_Atributos, T000A7_A653TDet_Valor_Presente, T000A7_n653TDet_Valor_Presente, T000A7_A654TDet_Valor_Futuro, T000A7_n654TDet_Valor_Futuro, T000A7_A655TDet_Taza, T000A7_n655TDet_Taza, T000A7_A656TDet_Plazo_N, T000A7_n656TDet_Plazo_N,
            T000A7_A657TDet_Otros_Costos, T000A7_n657TDet_Otros_Costos, T000A7_A658TDet_Agrupado, T000A7_n658TDet_Agrupado, T000A7_A817TDet_PlacaRecuperada, T000A7_n817TDet_PlacaRecuperada, T000A7_A66Elem_Consecutivo, T000A7_A46Tran_Id
            }
            , new Object[] {
            T000A8_A69TDet_Consecutivo, T000A8_A487TDet_Cantidad, T000A8_A488TDet_ValorUnitario, T000A8_A489TDet_ValorTotal, T000A8_A490TDet_PlacaNumero, T000A8_n490TDet_PlacaNumero, T000A8_A504TDet_Observaciones, T000A8_n504TDet_Observaciones, T000A8_A491TDet_PlacaPadre, T000A8_n491TDet_PlacaPadre,
            T000A8_A505TDet_EsPadre, T000A8_A525TDet_Atributos, T000A8_A653TDet_Valor_Presente, T000A8_n653TDet_Valor_Presente, T000A8_A654TDet_Valor_Futuro, T000A8_n654TDet_Valor_Futuro, T000A8_A655TDet_Taza, T000A8_n655TDet_Taza, T000A8_A656TDet_Plazo_N, T000A8_n656TDet_Plazo_N,
            T000A8_A657TDet_Otros_Costos, T000A8_n657TDet_Otros_Costos, T000A8_A658TDet_Agrupado, T000A8_n658TDet_Agrupado, T000A8_A817TDet_PlacaRecuperada, T000A8_n817TDet_PlacaRecuperada, T000A8_A66Elem_Consecutivo, T000A8_A46Tran_Id
            }
            , new Object[] {
            T000A9_A37Cata_Codigo, T000A9_A557Elem_Descripcion, T000A9_A33Tipo_Codigo, T000A9_A77UNIMED_COD
            }
            , new Object[] {
            T000A10_A49Tran_CodigoMovimiento
            }
            , new Object[] {
            T000A11_A34Clas_Codigo, T000A11_A298Cata_Descripcion
            }
            , new Object[] {
            T000A12_A35FAM_Codigo
            }
            , new Object[] {
            T000A13_A75SEG_Codigo
            }
            , new Object[] {
            T000A14_A481Tran_IndE_S, T000A14_n481Tran_IndE_S
            }
            , new Object[] {
            T000A15_A37Cata_Codigo, T000A15_A34Clas_Codigo, T000A15_A35FAM_Codigo, T000A15_A49Tran_CodigoMovimiento, T000A15_A69TDet_Consecutivo, T000A15_A557Elem_Descripcion, T000A15_A298Cata_Descripcion, T000A15_A487TDet_Cantidad, T000A15_A488TDet_ValorUnitario, T000A15_A489TDet_ValorTotal,
            T000A15_A490TDet_PlacaNumero, T000A15_n490TDet_PlacaNumero, T000A15_A504TDet_Observaciones, T000A15_n504TDet_Observaciones, T000A15_A491TDet_PlacaPadre, T000A15_n491TDet_PlacaPadre, T000A15_A505TDet_EsPadre, T000A15_A525TDet_Atributos, T000A15_A653TDet_Valor_Presente, T000A15_n653TDet_Valor_Presente,
            T000A15_A654TDet_Valor_Futuro, T000A15_n654TDet_Valor_Futuro, T000A15_A655TDet_Taza, T000A15_n655TDet_Taza, T000A15_A656TDet_Plazo_N, T000A15_n656TDet_Plazo_N, T000A15_A657TDet_Otros_Costos, T000A15_n657TDet_Otros_Costos, T000A15_A658TDet_Agrupado, T000A15_n658TDet_Agrupado,
            T000A15_A817TDet_PlacaRecuperada, T000A15_n817TDet_PlacaRecuperada, T000A15_A481Tran_IndE_S, T000A15_n481Tran_IndE_S, T000A15_A66Elem_Consecutivo, T000A15_A46Tran_Id, T000A15_A33Tipo_Codigo, T000A15_A75SEG_Codigo, T000A15_A77UNIMED_COD
            }
            , new Object[] {
            T000A16_A49Tran_CodigoMovimiento
            }
            , new Object[] {
            T000A17_A481Tran_IndE_S, T000A17_n481Tran_IndE_S
            }
            , new Object[] {
            T000A18_A37Cata_Codigo, T000A18_A557Elem_Descripcion, T000A18_A33Tipo_Codigo, T000A18_A77UNIMED_COD
            }
            , new Object[] {
            T000A19_A34Clas_Codigo, T000A19_A298Cata_Descripcion
            }
            , new Object[] {
            T000A20_A35FAM_Codigo
            }
            , new Object[] {
            T000A21_A75SEG_Codigo
            }
            , new Object[] {
            T000A22_A46Tran_Id, T000A22_A69TDet_Consecutivo
            }
            , new Object[] {
            T000A23_A69TDet_Consecutivo, T000A23_A46Tran_Id
            }
            , new Object[] {
            T000A24_A69TDet_Consecutivo, T000A24_A46Tran_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A28_A49Tran_CodigoMovimiento
            }
            , new Object[] {
            T000A29_A481Tran_IndE_S, T000A29_n481Tran_IndE_S
            }
            , new Object[] {
            T000A30_A37Cata_Codigo, T000A30_A557Elem_Descripcion, T000A30_A33Tipo_Codigo, T000A30_A77UNIMED_COD
            }
            , new Object[] {
            T000A31_A34Clas_Codigo, T000A31_A298Cata_Descripcion
            }
            , new Object[] {
            T000A32_A35FAM_Codigo
            }
            , new Object[] {
            T000A33_A75SEG_Codigo
            }
            , new Object[] {
            T000A34_A46Tran_Id, T000A34_A69TDet_Consecutivo
            }
            , new Object[] {
            T000A35_A46Tran_Id, T000A35_A69TDet_Consecutivo, T000A35_A492TDet_ListDescripcion, T000A35_n492TDet_ListDescripcion, T000A35_A493TDet_ListTipo, T000A35_n493TDet_ListTipo, T000A35_A494TDet_ValorAtributo, T000A35_A70TDet_ListId
            }
            , new Object[] {
            T000A36_A492TDet_ListDescripcion, T000A36_n492TDet_ListDescripcion, T000A36_A493TDet_ListTipo, T000A36_n493TDet_ListTipo
            }
            , new Object[] {
            T000A37_A46Tran_Id, T000A37_A69TDet_Consecutivo, T000A37_A70TDet_ListId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A41_A492TDet_ListDescripcion, T000A41_n492TDet_ListDescripcion, T000A41_A493TDet_ListTipo, T000A41_n493TDet_ListTipo
            }
            , new Object[] {
            T000A42_A46Tran_Id, T000A42_A69TDet_Consecutivo, T000A42_A70TDet_ListId
            }
            , new Object[] {
            T000A43_A46Tran_Id, T000A43_A69TDet_Consecutivo, T000A43_A71Tran_Entrada, T000A43_A72Nro_Linea, T000A43_A687Tran_Cantidad, T000A43_n687Tran_Cantidad
            }
            , new Object[] {
            T000A44_A46Tran_Id, T000A44_A69TDet_Consecutivo, T000A44_A71Tran_Entrada, T000A44_A72Nro_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A48_A46Tran_Id, T000A48_A69TDet_Consecutivo, T000A48_A71Tran_Entrada, T000A48_A72Nro_Linea
            }
         }
      );
      AV16Pgmname = "ALM_DETALLE_TRANSACCION" ;
   }

   private byte Z656TDet_Plazo_N ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A656TDet_Plazo_N ;
   private byte subGridalm_detalle_transaccion_atributos_Backcolorstyle ;
   private byte subGridalm_detalle_transaccion_atributos_Allowselection ;
   private byte subGridalm_detalle_transaccion_atributos_Allowhovering ;
   private byte subGridalm_detalle_transaccion_atributos_Allowcollapsing ;
   private byte subGridalm_detalle_transaccion_atributos_Collapsed ;
   private byte subGridalm_detalle_transaccion_datos_salida_Backcolorstyle ;
   private byte subGridalm_detalle_transaccion_datos_salida_Allowselection ;
   private byte subGridalm_detalle_transaccion_datos_salida_Allowhovering ;
   private byte subGridalm_detalle_transaccion_datos_salida_Allowcollapsing ;
   private byte subGridalm_detalle_transaccion_datos_salida_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_detalle_transaccion_atributos_Backstyle ;
   private byte subGridalm_detalle_transaccion_datos_salida_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_13 ;
   private short Z655TDet_Taza ;
   private short Z658TDet_Agrupado ;
   private short nRC_GXsfl_114 ;
   private short nGXsfl_114_idx=1 ;
   private short nRC_GXsfl_127 ;
   private short nGXsfl_127_idx=1 ;
   private short nRcdDeleted_13 ;
   private short nRcdExists_13 ;
   private short nRcdDeleted_14 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A655TDet_Taza ;
   private short A658TDet_Agrupado ;
   private short nBlankRcdCount13 ;
   private short RcdFound13 ;
   private short nBlankRcdUsr13 ;
   private short nBlankRcdCount14 ;
   private short RcdFound14 ;
   private short nBlankRcdUsr14 ;
   private short RcdFound12 ;
   private int Z72Nro_Linea ;
   private int Z687Tran_Cantidad ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTran_Id_Enabled ;
   private int imgprompt_46_Visible ;
   private int edtTDet_Consecutivo_Enabled ;
   private int edtElem_Consecutivo_Enabled ;
   private int imgprompt_66_Visible ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtTDet_Cantidad_Enabled ;
   private int edtTDet_ValorUnitario_Enabled ;
   private int edtTDet_ValorTotal_Enabled ;
   private int edtTDet_PlacaNumero_Enabled ;
   private int edtTDet_Observaciones_Enabled ;
   private int edtTDet_PlacaPadre_Enabled ;
   private int edtTDet_EsPadre_Enabled ;
   private int edtTDet_Atributos_Enabled ;
   private int edtTDet_Valor_Presente_Enabled ;
   private int edtTDet_Valor_Futuro_Enabled ;
   private int edtTDet_Taza_Enabled ;
   private int edtTDet_Plazo_N_Enabled ;
   private int edtTDet_Otros_Costos_Enabled ;
   private int edtTDet_Agrupado_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtTDet_ListId_Enabled ;
   private int edtTDet_ListDescripcion_Enabled ;
   private int edtTDet_ValorAtributo_Enabled ;
   private int subGridalm_detalle_transaccion_atributos_Selectioncolor ;
   private int subGridalm_detalle_transaccion_atributos_Hoveringcolor ;
   private int fRowAdded ;
   private int edtTran_Entrada_Enabled ;
   private int A72Nro_Linea ;
   private int edtNro_Linea_Enabled ;
   private int A687Tran_Cantidad ;
   private int edtTran_Cantidad_Enabled ;
   private int subGridalm_detalle_transaccion_datos_salida_Selectioncolor ;
   private int subGridalm_detalle_transaccion_datos_salida_Hoveringcolor ;
   private int A77UNIMED_COD ;
   private int AV17GXV1 ;
   private int GX_JID ;
   private int Z77UNIMED_COD ;
   private int subGridalm_detalle_transaccion_atributos_Backcolor ;
   private int subGridalm_detalle_transaccion_atributos_Allbackcolor ;
   private int imgprompt_70_Visible ;
   private int subGridalm_detalle_transaccion_datos_salida_Backcolor ;
   private int subGridalm_detalle_transaccion_datos_salida_Allbackcolor ;
   private int defedtNro_Linea_Enabled ;
   private int defedtTran_Entrada_Enabled ;
   private int defedtTDet_ListId_Enabled ;
   private int idxLst ;
   private long wcpOAV7Tran_Id ;
   private long wcpOAV8TDet_Consecutivo ;
   private long Z46Tran_Id ;
   private long Z69TDet_Consecutivo ;
   private long Z487TDet_Cantidad ;
   private long Z70TDet_ListId ;
   private long Z71Tran_Entrada ;
   private long A46Tran_Id ;
   private long A70TDet_ListId ;
   private long AV7Tran_Id ;
   private long AV8TDet_Consecutivo ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long A71Tran_Entrada ;
   private long A33Tipo_Codigo ;
   private long GRIDALM_DETALLE_TRANSACCION_ATRIBUTOS_nFirstRecordOnPage ;
   private long GRIDALM_DETALLE_TRANSACCION_DATOS_SALIDA_nFirstRecordOnPage ;
   private long Z33Tipo_Codigo ;
   private java.math.BigDecimal Z488TDet_ValorUnitario ;
   private java.math.BigDecimal Z489TDet_ValorTotal ;
   private java.math.BigDecimal Z653TDet_Valor_Presente ;
   private java.math.BigDecimal Z654TDet_Valor_Futuro ;
   private java.math.BigDecimal Z657TDet_Otros_Costos ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private String sPrefix ;
   private String sGXsfl_114_idx="0001" ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_127_idx="0001" ;
   private String Gx_mode ;
   private String GXKey ;
   private String GXCCtl ;
   private String A493TDet_ListTipo ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTran_Id_Internalname ;
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
   private String edtTran_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_46_Internalname ;
   private String imgprompt_46_Link ;
   private String edtTDet_Consecutivo_Internalname ;
   private String edtTDet_Consecutivo_Jsonclick ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String imgprompt_66_Internalname ;
   private String imgprompt_66_Link ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtTDet_Cantidad_Internalname ;
   private String edtTDet_Cantidad_Jsonclick ;
   private String edtTDet_ValorUnitario_Internalname ;
   private String edtTDet_ValorUnitario_Jsonclick ;
   private String edtTDet_ValorTotal_Internalname ;
   private String edtTDet_ValorTotal_Jsonclick ;
   private String edtTDet_PlacaNumero_Internalname ;
   private String edtTDet_PlacaNumero_Jsonclick ;
   private String edtTDet_Observaciones_Internalname ;
   private String edtTDet_PlacaPadre_Internalname ;
   private String edtTDet_PlacaPadre_Jsonclick ;
   private String edtTDet_EsPadre_Internalname ;
   private String edtTDet_EsPadre_Jsonclick ;
   private String edtTDet_Atributos_Internalname ;
   private String edtTDet_Atributos_Jsonclick ;
   private String edtTDet_Valor_Presente_Internalname ;
   private String edtTDet_Valor_Presente_Jsonclick ;
   private String edtTDet_Valor_Futuro_Internalname ;
   private String edtTDet_Valor_Futuro_Jsonclick ;
   private String edtTDet_Taza_Internalname ;
   private String edtTDet_Taza_Jsonclick ;
   private String edtTDet_Plazo_N_Internalname ;
   private String edtTDet_Plazo_N_Jsonclick ;
   private String edtTDet_Otros_Costos_Internalname ;
   private String edtTDet_Otros_Costos_Jsonclick ;
   private String edtTDet_Agrupado_Internalname ;
   private String edtTDet_Agrupado_Jsonclick ;
   private String divAtributostable_Internalname ;
   private String lblTitleatributos_Internalname ;
   private String lblTitleatributos_Jsonclick ;
   private String divDatos_salidatable_Internalname ;
   private String lblTitledatos_salida_Internalname ;
   private String lblTitledatos_salida_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode13 ;
   private String edtTDet_ListId_Internalname ;
   private String edtTDet_ListDescripcion_Internalname ;
   private String edtTDet_ValorAtributo_Internalname ;
   private String sStyleString ;
   private String sMode14 ;
   private String edtTran_Entrada_Internalname ;
   private String edtNro_Linea_Internalname ;
   private String edtTran_Cantidad_Internalname ;
   private String AV16Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String Z493TDet_ListTipo ;
   private String imgprompt_70_Internalname ;
   private String sGXsfl_114_fel_idx="0001" ;
   private String subGridalm_detalle_transaccion_atributos_Class ;
   private String subGridalm_detalle_transaccion_atributos_Linesclass ;
   private String imgprompt_70_Link ;
   private String ROClassString ;
   private String edtTDet_ListId_Jsonclick ;
   private String edtTDet_ListDescripcion_Jsonclick ;
   private String edtTDet_ValorAtributo_Jsonclick ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGridalm_detalle_transaccion_datos_salida_Class ;
   private String subGridalm_detalle_transaccion_datos_salida_Linesclass ;
   private String edtTran_Entrada_Jsonclick ;
   private String edtNro_Linea_Jsonclick ;
   private String edtTran_Cantidad_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_detalle_transaccion_atributos_Internalname ;
   private String subGridalm_detalle_transaccion_datos_salida_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n493TDet_ListTipo ;
   private boolean wbErr ;
   private boolean bGXsfl_114_Refreshing=false ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n504TDet_Observaciones ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n658TDet_Agrupado ;
   private boolean n817TDet_PlacaRecuperada ;
   private boolean n481Tran_IndE_S ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n492TDet_ListDescripcion ;
   private boolean n687Tran_Cantidad ;
   private String Z490TDet_PlacaNumero ;
   private String Z504TDet_Observaciones ;
   private String Z491TDet_PlacaPadre ;
   private String Z505TDet_EsPadre ;
   private String Z525TDet_Atributos ;
   private String Z817TDet_PlacaRecuperada ;
   private String Z66Elem_Consecutivo ;
   private String N66Elem_Consecutivo ;
   private String Z494TDet_ValorAtributo ;
   private String A49Tran_CodigoMovimiento ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A504TDet_Observaciones ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A525TDet_Atributos ;
   private String A492TDet_ListDescripcion ;
   private String A494TDet_ValorAtributo ;
   private String A817TDet_PlacaRecuperada ;
   private String AV15Insert_Elem_Consecutivo ;
   private String A75SEG_Codigo ;
   private String A481Tran_IndE_S ;
   private String Z49Tran_CodigoMovimiento ;
   private String Z481Tran_IndE_S ;
   private String Z37Cata_Codigo ;
   private String Z557Elem_Descripcion ;
   private String Z34Clas_Codigo ;
   private String Z298Cata_Descripcion ;
   private String Z35FAM_Codigo ;
   private String Z75SEG_Codigo ;
   private String Z492TDet_ListDescripcion ;
   private com.genexus.webpanels.GXWebGrid Gridalm_detalle_transaccion_atributosContainer ;
   private com.genexus.webpanels.GXWebGrid Gridalm_detalle_transaccion_datos_salidaContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_detalle_transaccion_atributosRow ;
   private com.genexus.webpanels.GXWebRow Gridalm_detalle_transaccion_datos_salidaRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_detalle_transaccion_atributosColumn ;
   private com.genexus.webpanels.GXWebColumn Gridalm_detalle_transaccion_datos_salidaColumn ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbTDet_ListTipo ;
   private IDataStoreProvider pr_default ;
   private String[] T000A10_A49Tran_CodigoMovimiento ;
   private String[] T000A14_A481Tran_IndE_S ;
   private boolean[] T000A14_n481Tran_IndE_S ;
   private String[] T000A9_A37Cata_Codigo ;
   private String[] T000A9_A557Elem_Descripcion ;
   private long[] T000A9_A33Tipo_Codigo ;
   private int[] T000A9_A77UNIMED_COD ;
   private String[] T000A11_A34Clas_Codigo ;
   private String[] T000A11_A298Cata_Descripcion ;
   private String[] T000A12_A35FAM_Codigo ;
   private String[] T000A13_A75SEG_Codigo ;
   private String[] T000A15_A37Cata_Codigo ;
   private String[] T000A15_A34Clas_Codigo ;
   private String[] T000A15_A35FAM_Codigo ;
   private String[] T000A15_A49Tran_CodigoMovimiento ;
   private long[] T000A15_A69TDet_Consecutivo ;
   private String[] T000A15_A557Elem_Descripcion ;
   private String[] T000A15_A298Cata_Descripcion ;
   private long[] T000A15_A487TDet_Cantidad ;
   private java.math.BigDecimal[] T000A15_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] T000A15_A489TDet_ValorTotal ;
   private String[] T000A15_A490TDet_PlacaNumero ;
   private boolean[] T000A15_n490TDet_PlacaNumero ;
   private String[] T000A15_A504TDet_Observaciones ;
   private boolean[] T000A15_n504TDet_Observaciones ;
   private String[] T000A15_A491TDet_PlacaPadre ;
   private boolean[] T000A15_n491TDet_PlacaPadre ;
   private String[] T000A15_A505TDet_EsPadre ;
   private String[] T000A15_A525TDet_Atributos ;
   private java.math.BigDecimal[] T000A15_A653TDet_Valor_Presente ;
   private boolean[] T000A15_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] T000A15_A654TDet_Valor_Futuro ;
   private boolean[] T000A15_n654TDet_Valor_Futuro ;
   private short[] T000A15_A655TDet_Taza ;
   private boolean[] T000A15_n655TDet_Taza ;
   private byte[] T000A15_A656TDet_Plazo_N ;
   private boolean[] T000A15_n656TDet_Plazo_N ;
   private java.math.BigDecimal[] T000A15_A657TDet_Otros_Costos ;
   private boolean[] T000A15_n657TDet_Otros_Costos ;
   private short[] T000A15_A658TDet_Agrupado ;
   private boolean[] T000A15_n658TDet_Agrupado ;
   private String[] T000A15_A817TDet_PlacaRecuperada ;
   private boolean[] T000A15_n817TDet_PlacaRecuperada ;
   private String[] T000A15_A481Tran_IndE_S ;
   private boolean[] T000A15_n481Tran_IndE_S ;
   private String[] T000A15_A66Elem_Consecutivo ;
   private long[] T000A15_A46Tran_Id ;
   private long[] T000A15_A33Tipo_Codigo ;
   private String[] T000A15_A75SEG_Codigo ;
   private int[] T000A15_A77UNIMED_COD ;
   private String[] T000A16_A49Tran_CodigoMovimiento ;
   private String[] T000A17_A481Tran_IndE_S ;
   private boolean[] T000A17_n481Tran_IndE_S ;
   private String[] T000A18_A37Cata_Codigo ;
   private String[] T000A18_A557Elem_Descripcion ;
   private long[] T000A18_A33Tipo_Codigo ;
   private int[] T000A18_A77UNIMED_COD ;
   private String[] T000A19_A34Clas_Codigo ;
   private String[] T000A19_A298Cata_Descripcion ;
   private String[] T000A20_A35FAM_Codigo ;
   private String[] T000A21_A75SEG_Codigo ;
   private long[] T000A22_A46Tran_Id ;
   private long[] T000A22_A69TDet_Consecutivo ;
   private long[] T000A8_A69TDet_Consecutivo ;
   private long[] T000A8_A487TDet_Cantidad ;
   private java.math.BigDecimal[] T000A8_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] T000A8_A489TDet_ValorTotal ;
   private String[] T000A8_A490TDet_PlacaNumero ;
   private boolean[] T000A8_n490TDet_PlacaNumero ;
   private String[] T000A8_A504TDet_Observaciones ;
   private boolean[] T000A8_n504TDet_Observaciones ;
   private String[] T000A8_A491TDet_PlacaPadre ;
   private boolean[] T000A8_n491TDet_PlacaPadre ;
   private String[] T000A8_A505TDet_EsPadre ;
   private String[] T000A8_A525TDet_Atributos ;
   private java.math.BigDecimal[] T000A8_A653TDet_Valor_Presente ;
   private boolean[] T000A8_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] T000A8_A654TDet_Valor_Futuro ;
   private boolean[] T000A8_n654TDet_Valor_Futuro ;
   private short[] T000A8_A655TDet_Taza ;
   private boolean[] T000A8_n655TDet_Taza ;
   private byte[] T000A8_A656TDet_Plazo_N ;
   private boolean[] T000A8_n656TDet_Plazo_N ;
   private java.math.BigDecimal[] T000A8_A657TDet_Otros_Costos ;
   private boolean[] T000A8_n657TDet_Otros_Costos ;
   private short[] T000A8_A658TDet_Agrupado ;
   private boolean[] T000A8_n658TDet_Agrupado ;
   private String[] T000A8_A817TDet_PlacaRecuperada ;
   private boolean[] T000A8_n817TDet_PlacaRecuperada ;
   private String[] T000A8_A66Elem_Consecutivo ;
   private long[] T000A8_A46Tran_Id ;
   private long[] T000A23_A69TDet_Consecutivo ;
   private long[] T000A23_A46Tran_Id ;
   private long[] T000A24_A69TDet_Consecutivo ;
   private long[] T000A24_A46Tran_Id ;
   private long[] T000A7_A69TDet_Consecutivo ;
   private long[] T000A7_A487TDet_Cantidad ;
   private java.math.BigDecimal[] T000A7_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] T000A7_A489TDet_ValorTotal ;
   private String[] T000A7_A490TDet_PlacaNumero ;
   private boolean[] T000A7_n490TDet_PlacaNumero ;
   private String[] T000A7_A504TDet_Observaciones ;
   private boolean[] T000A7_n504TDet_Observaciones ;
   private String[] T000A7_A491TDet_PlacaPadre ;
   private boolean[] T000A7_n491TDet_PlacaPadre ;
   private String[] T000A7_A505TDet_EsPadre ;
   private String[] T000A7_A525TDet_Atributos ;
   private java.math.BigDecimal[] T000A7_A653TDet_Valor_Presente ;
   private boolean[] T000A7_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] T000A7_A654TDet_Valor_Futuro ;
   private boolean[] T000A7_n654TDet_Valor_Futuro ;
   private short[] T000A7_A655TDet_Taza ;
   private boolean[] T000A7_n655TDet_Taza ;
   private byte[] T000A7_A656TDet_Plazo_N ;
   private boolean[] T000A7_n656TDet_Plazo_N ;
   private java.math.BigDecimal[] T000A7_A657TDet_Otros_Costos ;
   private boolean[] T000A7_n657TDet_Otros_Costos ;
   private short[] T000A7_A658TDet_Agrupado ;
   private boolean[] T000A7_n658TDet_Agrupado ;
   private String[] T000A7_A817TDet_PlacaRecuperada ;
   private boolean[] T000A7_n817TDet_PlacaRecuperada ;
   private String[] T000A7_A66Elem_Consecutivo ;
   private long[] T000A7_A46Tran_Id ;
   private String[] T000A28_A49Tran_CodigoMovimiento ;
   private String[] T000A29_A481Tran_IndE_S ;
   private boolean[] T000A29_n481Tran_IndE_S ;
   private String[] T000A30_A37Cata_Codigo ;
   private String[] T000A30_A557Elem_Descripcion ;
   private long[] T000A30_A33Tipo_Codigo ;
   private int[] T000A30_A77UNIMED_COD ;
   private String[] T000A31_A34Clas_Codigo ;
   private String[] T000A31_A298Cata_Descripcion ;
   private String[] T000A32_A35FAM_Codigo ;
   private String[] T000A33_A75SEG_Codigo ;
   private long[] T000A34_A46Tran_Id ;
   private long[] T000A34_A69TDet_Consecutivo ;
   private long[] T000A35_A46Tran_Id ;
   private long[] T000A35_A69TDet_Consecutivo ;
   private String[] T000A35_A492TDet_ListDescripcion ;
   private boolean[] T000A35_n492TDet_ListDescripcion ;
   private String[] T000A35_A493TDet_ListTipo ;
   private boolean[] T000A35_n493TDet_ListTipo ;
   private String[] T000A35_A494TDet_ValorAtributo ;
   private long[] T000A35_A70TDet_ListId ;
   private String[] T000A6_A492TDet_ListDescripcion ;
   private boolean[] T000A6_n492TDet_ListDescripcion ;
   private String[] T000A6_A493TDet_ListTipo ;
   private boolean[] T000A6_n493TDet_ListTipo ;
   private String[] T000A36_A492TDet_ListDescripcion ;
   private boolean[] T000A36_n492TDet_ListDescripcion ;
   private String[] T000A36_A493TDet_ListTipo ;
   private boolean[] T000A36_n493TDet_ListTipo ;
   private long[] T000A37_A46Tran_Id ;
   private long[] T000A37_A69TDet_Consecutivo ;
   private long[] T000A37_A70TDet_ListId ;
   private long[] T000A5_A46Tran_Id ;
   private long[] T000A5_A69TDet_Consecutivo ;
   private String[] T000A5_A494TDet_ValorAtributo ;
   private long[] T000A5_A70TDet_ListId ;
   private long[] T000A4_A46Tran_Id ;
   private long[] T000A4_A69TDet_Consecutivo ;
   private String[] T000A4_A494TDet_ValorAtributo ;
   private long[] T000A4_A70TDet_ListId ;
   private String[] T000A41_A492TDet_ListDescripcion ;
   private boolean[] T000A41_n492TDet_ListDescripcion ;
   private String[] T000A41_A493TDet_ListTipo ;
   private boolean[] T000A41_n493TDet_ListTipo ;
   private long[] T000A42_A46Tran_Id ;
   private long[] T000A42_A69TDet_Consecutivo ;
   private long[] T000A42_A70TDet_ListId ;
   private long[] T000A43_A46Tran_Id ;
   private long[] T000A43_A69TDet_Consecutivo ;
   private long[] T000A43_A71Tran_Entrada ;
   private int[] T000A43_A72Nro_Linea ;
   private int[] T000A43_A687Tran_Cantidad ;
   private boolean[] T000A43_n687Tran_Cantidad ;
   private long[] T000A44_A46Tran_Id ;
   private long[] T000A44_A69TDet_Consecutivo ;
   private long[] T000A44_A71Tran_Entrada ;
   private int[] T000A44_A72Nro_Linea ;
   private long[] T000A3_A46Tran_Id ;
   private long[] T000A3_A69TDet_Consecutivo ;
   private long[] T000A3_A71Tran_Entrada ;
   private int[] T000A3_A72Nro_Linea ;
   private int[] T000A3_A687Tran_Cantidad ;
   private boolean[] T000A3_n687Tran_Cantidad ;
   private long[] T000A2_A46Tran_Id ;
   private long[] T000A2_A69TDet_Consecutivo ;
   private long[] T000A2_A71Tran_Entrada ;
   private int[] T000A2_A72Nro_Linea ;
   private int[] T000A2_A687Tran_Cantidad ;
   private boolean[] T000A2_n687Tran_Cantidad ;
   private long[] T000A48_A46Tran_Id ;
   private long[] T000A48_A69TDet_Consecutivo ;
   private long[] T000A48_A71Tran_Entrada ;
   private int[] T000A48_A72Nro_Linea ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV11TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class alm_detalle_transaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000A2", "SELECT Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND Tran_Entrada = ? AND Nro_Linea = ?  FOR UPDATE OF Tran_Cantidad NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A3", "SELECT Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND Tran_Entrada = ? AND Nro_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A4", "SELECT Tran_Id, TDet_Consecutivo, TDet_ValorAtributo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND TDet_ListId = ?  FOR UPDATE OF TDet_ValorAtributo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A5", "SELECT Tran_Id, TDet_Consecutivo, TDet_ValorAtributo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND TDet_ListId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A6", "SELECT List_Descripcion AS TDet_ListDescripcion, List_Tipo AS TDet_ListTipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A7", "SELECT TDet_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada, Elem_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? AND TDet_Consecutivo = ?  FOR UPDATE OF TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada, Elem_Consecutivo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A8", "SELECT TDet_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada, Elem_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? AND TDet_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A9", "SELECT Cata_Codigo, Elem_Descripcion, Tipo_Codigo, UNIMED_COD FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A10", "SELECT Tran_CodigoMovimiento FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A11", "SELECT Clas_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A12", "SELECT FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A13", "SELECT SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A14", "SELECT Tpmo_TipoE_S AS Tran_IndE_S FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A15", "SELECT /*+ FIRST_ROWS(100) */ T4.Cata_Codigo, T5.Clas_Codigo, T6.FAM_Codigo, T2.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, TM1.TDet_Consecutivo, T4.Elem_Descripcion, T5.Cata_Descripcion, TM1.TDet_Cantidad, TM1.TDet_ValorUnitario, TM1.TDet_ValorTotal, TM1.TDet_PlacaNumero, TM1.TDet_Observaciones, TM1.TDet_PlacaPadre, TM1.TDet_EsPadre, TM1.TDet_Atributos, TM1.TDet_Valor_Presente, TM1.TDet_Valor_Futuro, TM1.TDet_Taza, TM1.TDet_Plazo_N, TM1.TDet_Otros_Costos, TM1.TDet_Agrupado, TM1.TDet_PlacaRecuperada, T3.Tpmo_TipoE_S AS Tran_IndE_S, TM1.Elem_Consecutivo, TM1.Tran_Id, T4.Tipo_Codigo, T7.SEG_Codigo, T4.UNIMED_COD FROM ((((((ALM_DETALLE_TRANSACCION TM1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = TM1.Tran_Id) INNER JOIN ALM_TIPO_MOVIMIENTO T3 ON T3.Tpmo_Codigo = T2.Tran_CodigoMovimiento) INNER JOIN ALM_ELEMENTO T4 ON T4.Elem_Consecutivo = TM1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T5 ON T5.Cata_Codigo = T4.Cata_Codigo) INNER JOIN ALM_CLASE T6 ON T6.Clas_Codigo = T5.Clas_Codigo) INNER JOIN ALM_CAT_FAM T7 ON T7.FAM_Codigo = T6.FAM_Codigo) WHERE TM1.TDet_Consecutivo = ? and TM1.Tran_Id = ? ORDER BY TM1.Tran_Id, TM1.TDet_Consecutivo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000A16", "SELECT Tran_CodigoMovimiento FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A17", "SELECT Tpmo_TipoE_S AS Tran_IndE_S FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A18", "SELECT Cata_Codigo, Elem_Descripcion, Tipo_Codigo, UNIMED_COD FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A19", "SELECT Clas_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A20", "SELECT FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A21", "SELECT SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A22", "SELECT /*+ FIRST_ROWS(1) */ Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? AND TDet_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TDet_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE ( TDet_Consecutivo > ? or TDet_Consecutivo = ? and Tran_Id > ?) ORDER BY Tran_Id, TDet_Consecutivo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TDet_Consecutivo, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE ( TDet_Consecutivo < ? or TDet_Consecutivo = ? and Tran_Id < ?) ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000A25", "INSERT INTO ALM_DETALLE_TRANSACCION(TDet_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada, Elem_Consecutivo, Tran_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("T000A26", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_Cantidad=?, TDet_ValorUnitario=?, TDet_ValorTotal=?, TDet_PlacaNumero=?, TDet_Observaciones=?, TDet_PlacaPadre=?, TDet_EsPadre=?, TDet_Atributos=?, TDet_Valor_Presente=?, TDet_Valor_Futuro=?, TDet_Taza=?, TDet_Plazo_N=?, TDet_Otros_Costos=?, TDet_Agrupado=?, TDet_PlacaRecuperada=?, Elem_Consecutivo=?  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("T000A27", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? AND TDet_Consecutivo = ?", GX_NOMASK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("T000A28", "SELECT Tran_CodigoMovimiento FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A29", "SELECT Tpmo_TipoE_S AS Tran_IndE_S FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A30", "SELECT Cata_Codigo, Elem_Descripcion, Tipo_Codigo, UNIMED_COD FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A31", "SELECT Clas_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A32", "SELECT FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A33", "SELECT SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A34", "SELECT /*+ FIRST_ROWS(100) */ Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION ORDER BY Tran_Id, TDet_Consecutivo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000A35", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T2.List_Descripcion AS TDet_ListDescripcion, T2.List_Tipo AS TDet_ListTipo, T1.TDet_ValorAtributo, T1.TDet_ListId AS TDet_ListId FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? and T1.TDet_ListId = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo, T1.TDet_ListId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000A36", "SELECT List_Descripcion AS TDet_ListDescripcion, List_Tipo AS TDet_ListTipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A37", "SELECT Tran_Id, TDet_Consecutivo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND TDet_ListId = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000A38", "INSERT INTO ALM_DETALLE_TRANSACCIONATRIBUT(Tran_Id, TDet_Consecutivo, TDet_ValorAtributo, TDet_ListId) VALUES(?, ?, ?, ?)", GX_NOMASK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("T000A39", "UPDATE ALM_DETALLE_TRANSACCIONATRIBUT SET TDet_ValorAtributo=?  WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND TDet_ListId = ?", GX_NOMASK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new UpdateCursor("T000A40", "DELETE FROM ALM_DETALLE_TRANSACCIONATRIBUT  WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND TDet_ListId = ?", GX_NOMASK, "ALM_DETALLE_TRANSACCIONATRIBUT")
         ,new ForEachCursor("T000A41", "SELECT List_Descripcion AS TDet_ListDescripcion, List_Tipo AS TDet_ListTipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A42", "SELECT Tran_Id, TDet_Consecutivo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000A43", "SELECT Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? and Tran_Entrada = ? and Nro_Linea = ? ORDER BY Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000A44", "SELECT Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND Tran_Entrada = ? AND Nro_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000A45", "INSERT INTO ALM_DET_TRAN_DATOS_SALIDA(Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new UpdateCursor("T000A46", "UPDATE ALM_DET_TRAN_DATOS_SALIDA SET Tran_Cantidad=?  WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND Tran_Entrada = ? AND Nro_Linea = ?", GX_NOMASK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new UpdateCursor("T000A47", "DELETE FROM ALM_DET_TRAN_DATOS_SALIDA  WHERE Tran_Id = ? AND TDet_Consecutivo = ? AND Tran_Entrada = ? AND Nro_Linea = ?", GX_NOMASK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new ForEachCursor("T000A48", "SELECT Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea ",true, GX_NOMASK, false, this,11,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[27])[0] = rslt.getLong(18) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[27])[0] = rslt.getLong(18) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(15) ;
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(18) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(19) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,2) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(21) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(24) ;
               ((long[]) buf[35])[0] = rslt.getLong(25) ;
               ((long[]) buf[36])[0] = rslt.getLong(26) ;
               ((String[]) buf[37])[0] = rslt.getVarchar(27) ;
               ((int[]) buf[38])[0] = rslt.getInt(28) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 32 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 33 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 35 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 40 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 41 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 42 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               return;
            case 46 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 13 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 21 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 22 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 23 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 200);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 30);
               }
               stmt.setVarchar(8, (String)parms[10], 2, false);
               stmt.setVarchar(9, (String)parms[11], 2, false);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[19]).byteValue());
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 30);
               }
               stmt.setVarchar(17, (String)parms[26], 9, false);
               stmt.setLong(18, ((Number) parms[27]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 200);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 30);
               }
               stmt.setVarchar(7, (String)parms[9], 2, false);
               stmt.setVarchar(8, (String)parms[10], 2, false);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[18]).byteValue());
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[24], 30);
               }
               stmt.setVarchar(16, (String)parms[25], 9, false);
               stmt.setLong(17, ((Number) parms[26]).longValue());
               stmt.setBigDecimal(18, ((Number) parms[27]).longValue(), 0);
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 33 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 34 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 36 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 37 :
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 38 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 39 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 40 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 41 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 42 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 43 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 45 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 46 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

