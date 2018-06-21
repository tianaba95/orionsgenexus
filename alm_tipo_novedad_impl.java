/*
               File: alm_tipo_novedad_impl
        Description: Tipo de Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:11.64
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

public final  class alm_tipo_novedad_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A105TNov_Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A105TNov_Rol_Id) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_tipo_novedad_roles") == 0 )
      {
         nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_74_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_tipo_novedad_roles_newrow( ) ;
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
            AV9TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9TNov_Codigo", GXutil.ltrim( GXutil.str( AV9TNov_Codigo, 6, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTNOV_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9TNov_Codigo), "ZZZZZ9")));
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
      cmbTNov_Tipo.setName( "TNOV_TIPO" );
      cmbTNov_Tipo.setWebtags( "" );
      cmbTNov_Tipo.addItem("T", "Transacción", (short)(0));
      cmbTNov_Tipo.addItem("P", "Consecutivo o Placa", (short)(0));
      cmbTNov_Tipo.addItem("D", "Las dos", (short)(0));
      if ( cmbTNov_Tipo.getItemCount() > 0 )
      {
         A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
      }
      cmbTNov_IngresoMasivo.setName( "TNOV_INGRESOMASIVO" );
      cmbTNov_IngresoMasivo.setWebtags( "" );
      cmbTNov_IngresoMasivo.addItem("", "", (short)(0));
      cmbTNov_IngresoMasivo.addItem("SI", "SI", (short)(0));
      cmbTNov_IngresoMasivo.addItem("NO", "NO", (short)(0));
      if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
      {
         A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
         n813TNov_IngresoMasivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
      }
      cmbTNov_ObligaSoporte.setName( "TNOV_OBLIGASOPORTE" );
      cmbTNov_ObligaSoporte.setWebtags( "" );
      cmbTNov_ObligaSoporte.addItem("", "", (short)(0));
      cmbTNov_ObligaSoporte.addItem("SI", "SI", (short)(0));
      cmbTNov_ObligaSoporte.addItem("NO", "NO", (short)(0));
      if ( cmbTNov_ObligaSoporte.getItemCount() > 0 )
      {
         A839TNov_ObligaSoporte = cmbTNov_ObligaSoporte.getValidValue(A839TNov_ObligaSoporte) ;
         n839TNov_ObligaSoporte = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
      }
      cmbTNov_Estado.setName( "TNOV_ESTADO" );
      cmbTNov_Estado.setWebtags( "" );
      cmbTNov_Estado.addItem("A", "Activo", (short)(0));
      cmbTNov_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbTNov_Estado.getItemCount() > 0 )
      {
         A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
         n773TNov_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
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
         Form.getMeta().addItem("description", "Tipo de Novedad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTNov_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_tipo_novedad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_novedad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_novedad_impl.class ));
   }

   public alm_tipo_novedad_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTNov_Tipo = new HTMLChoice();
      cmbTNov_IngresoMasivo = new HTMLChoice();
      cmbTNov_ObligaSoporte = new HTMLChoice();
      cmbTNov_Estado = new HTMLChoice();
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
      if ( cmbTNov_Tipo.getItemCount() > 0 )
      {
         A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
      }
      if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
      {
         A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
         n813TNov_IngresoMasivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
      }
      if ( cmbTNov_ObligaSoporte.getItemCount() > 0 )
      {
         A839TNov_ObligaSoporte = cmbTNov_ObligaSoporte.getValidValue(A839TNov_ObligaSoporte) ;
         n839TNov_ObligaSoporte = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
      }
      if ( cmbTNov_Estado.getItemCount() > 0 )
      {
         A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
         n773TNov_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de Novedad", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTNov_Codigo_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Descripcion_Internalname, "Descripción ", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTNov_Descripcion_Internalname, A769TNov_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtTNov_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_Tipo.getInternalname(), "Tipo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_Tipo, cmbTNov_Tipo.getInternalname(), GXutil.rtrim( A770TNov_Tipo), 1, cmbTNov_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_TIPO_NOVEDAD.htm");
         cmbTNov_Tipo.setValue( GXutil.rtrim( A770TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Tipo.getInternalname(), "Values", cmbTNov_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Nro_Cambios_Internalname, "Número de cambios", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Nro_Cambios_Internalname, GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")), ((edtTNov_Nro_Cambios_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Nro_Cambios_Jsonclick, 0, "Attribute", "", "", "", 1, edtTNov_Nro_Cambios_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_IngresoMasivo.getInternalname(), "Masivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_IngresoMasivo, cmbTNov_IngresoMasivo.getInternalname(), GXutil.rtrim( A813TNov_IngresoMasivo), 1, cmbTNov_IngresoMasivo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_IngresoMasivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", true, "HLP_ALM_TIPO_NOVEDAD.htm");
         cmbTNov_IngresoMasivo.setValue( GXutil.rtrim( A813TNov_IngresoMasivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_IngresoMasivo.getInternalname(), "Values", cmbTNov_IngresoMasivo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_ObligaSoporte.getInternalname(), "Obliga ingresar soporte", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_ObligaSoporte, cmbTNov_ObligaSoporte.getInternalname(), GXutil.rtrim( A839TNov_ObligaSoporte), 1, cmbTNov_ObligaSoporte.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTNov_ObligaSoporte.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, "HLP_ALM_TIPO_NOVEDAD.htm");
         cmbTNov_ObligaSoporte.setValue( GXutil.rtrim( A839TNov_ObligaSoporte) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_ObligaSoporte.getInternalname(), "Values", cmbTNov_ObligaSoporte.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Procedimiento_Internalname, "Procedimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Procedimiento_Internalname, A772TNov_Procedimiento, GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Procedimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTNov_Procedimiento_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Nombre_Campo_Internalname, "Nombre del Campo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTNov_Nombre_Campo_Internalname, A774TNov_Nombre_Campo, GXutil.rtrim( localUtil.format( A774TNov_Nombre_Campo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTNov_Nombre_Campo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTNov_Nombre_Campo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTNov_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTNov_Estado, cmbTNov_Estado.getInternalname(), GXutil.rtrim( A773TNov_Estado), 1, cmbTNov_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTNov_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "", true, "HLP_ALM_TIPO_NOVEDAD.htm");
         cmbTNov_Estado.setValue( GXutil.rtrim( A773TNov_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Estado.getInternalname(), "Values", cmbTNov_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divRolestable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleroles_Internalname, "ROLES", "", "", lblTitleroles_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_tipo_novedad_roles( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_NOVEDAD.htm");
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

   public void gxdraw_gridalm_tipo_novedad_roles( )
   {
      /*  Grid Control  */
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("GridName", "Gridalm_tipo_novedad_roles");
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Class", "Grid");
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("CmpContext", "");
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_tipo_novedad_rolesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_novedad_rolesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A105TNov_Rol_Id, (byte)(11), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddColumnProperties(Gridalm_tipo_novedad_rolesColumn);
      Gridalm_tipo_novedad_rolesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_novedad_rolesContainer.AddColumnProperties(Gridalm_tipo_novedad_rolesColumn);
      Gridalm_tipo_novedad_rolesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_novedad_rolesColumn.AddObjectProperty("Value", A779TNov_Rol_Descripcion);
      Gridalm_tipo_novedad_rolesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddColumnProperties(Gridalm_tipo_novedad_rolesColumn);
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_novedad_rolesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_novedad_roles_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_74_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount55 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_55 = (short)(1) ;
            scanStart0P55( ) ;
            while ( RcdFound55 != 0 )
            {
               init_level_properties55( ) ;
               getByPrimaryKey0P55( ) ;
               addRow0P55( ) ;
               scanNext0P55( ) ;
            }
            scanEnd0P55( ) ;
            nBlankRcdCount55 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0P55( ) ;
         standaloneModal0P55( ) ;
         sMode55 = Gx_mode ;
         while ( nGXsfl_74_idx < nRC_GXsfl_74 )
         {
            bGXsfl_74_Refreshing = true ;
            readRow0P55( ) ;
            edtTNov_Rol_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TNOV_ROL_ID_"+sGXsfl_74_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Id_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
            edtTNov_Rol_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
            imgprompt_105_Link = httpContext.cgiGet( "PROMPT_105_"+sGXsfl_74_idx+"Link") ;
            if ( ( nRcdExists_55 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0P55( ) ;
            }
            sendRow0P55( ) ;
            bGXsfl_74_Refreshing = false ;
         }
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount55 = (short)(5) ;
         nRcdExists_55 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0P55( ) ;
            while ( RcdFound55 != 0 )
            {
               sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_7455( ) ;
               init_level_properties55( ) ;
               standaloneNotModal0P55( ) ;
               getByPrimaryKey0P55( ) ;
               standaloneModal0P55( ) ;
               addRow0P55( ) ;
               scanNext0P55( ) ;
            }
            scanEnd0P55( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode55 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7455( ) ;
         initAll0P55( ) ;
         init_level_properties55( ) ;
         standaloneNotModal0P55( ) ;
         standaloneModal0P55( ) ;
         nRcdExists_55 = (short)(0) ;
         nIsMod_55 = (short)(0) ;
         nRcdDeleted_55 = (short)(0) ;
         nBlankRcdCount55 = (short)(nBlankRcdUsr55+nBlankRcdCount55) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount55 > 0 )
         {
            addRow0P55( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTNov_Rol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount55 = (short)(nBlankRcdCount55-1) ;
         }
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_tipo_novedad_rolesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_tipo_novedad_roles", Gridalm_tipo_novedad_rolesContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_novedad_rolesContainerData", Gridalm_tipo_novedad_rolesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_novedad_rolesContainerData"+"V", Gridalm_tipo_novedad_rolesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_tipo_novedad_rolesContainerData"+"V"+"\" value='"+Gridalm_tipo_novedad_rolesContainer.GridValuesHidden()+"'/>") ;
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
      e110P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TNOV_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTNov_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A104TNov_Codigo = 0 ;
               n104TNov_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            }
            else
            {
               A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
               n104TNov_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            }
            A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
            n769TNov_Descripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
            n769TNov_Descripcion = ((GXutil.strcmp("", A769TNov_Descripcion)==0) ? true : false) ;
            cmbTNov_Tipo.setName( cmbTNov_Tipo.getInternalname() );
            cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
            A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
            n770TNov_Tipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
            n770TNov_Tipo = ((GXutil.strcmp("", A770TNov_Tipo)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TNOV_NRO_CAMBIOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTNov_Nro_Cambios_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A771TNov_Nro_Cambios = (short)(0) ;
               n771TNov_Nro_Cambios = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
            }
            else
            {
               A771TNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".")) ;
               n771TNov_Nro_Cambios = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
            }
            n771TNov_Nro_Cambios = ((0==A771TNov_Nro_Cambios) ? true : false) ;
            cmbTNov_IngresoMasivo.setName( cmbTNov_IngresoMasivo.getInternalname() );
            cmbTNov_IngresoMasivo.setValue( httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) );
            A813TNov_IngresoMasivo = httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) ;
            n813TNov_IngresoMasivo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
            n813TNov_IngresoMasivo = ((GXutil.strcmp("", A813TNov_IngresoMasivo)==0) ? true : false) ;
            cmbTNov_ObligaSoporte.setName( cmbTNov_ObligaSoporte.getInternalname() );
            cmbTNov_ObligaSoporte.setValue( httpContext.cgiGet( cmbTNov_ObligaSoporte.getInternalname()) );
            A839TNov_ObligaSoporte = httpContext.cgiGet( cmbTNov_ObligaSoporte.getInternalname()) ;
            n839TNov_ObligaSoporte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
            n839TNov_ObligaSoporte = ((GXutil.strcmp("", A839TNov_ObligaSoporte)==0) ? true : false) ;
            A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
            n772TNov_Procedimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
            n772TNov_Procedimiento = ((GXutil.strcmp("", A772TNov_Procedimiento)==0) ? true : false) ;
            A774TNov_Nombre_Campo = httpContext.cgiGet( edtTNov_Nombre_Campo_Internalname) ;
            n774TNov_Nombre_Campo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
            n774TNov_Nombre_Campo = ((GXutil.strcmp("", A774TNov_Nombre_Campo)==0) ? true : false) ;
            cmbTNov_Estado.setName( cmbTNov_Estado.getInternalname() );
            cmbTNov_Estado.setValue( httpContext.cgiGet( cmbTNov_Estado.getInternalname()) );
            A773TNov_Estado = httpContext.cgiGet( cmbTNov_Estado.getInternalname()) ;
            n773TNov_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
            n773TNov_Estado = ((GXutil.strcmp("", A773TNov_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "Z104TNov_Codigo"), ",", ".")) ;
            Z775TNov_UsuarioCrea = httpContext.cgiGet( "Z775TNov_UsuarioCrea") ;
            n775TNov_UsuarioCrea = ((GXutil.strcmp("", A775TNov_UsuarioCrea)==0) ? true : false) ;
            Z777TNov_UsuarioModifica = httpContext.cgiGet( "Z777TNov_UsuarioModifica") ;
            n777TNov_UsuarioModifica = ((GXutil.strcmp("", A777TNov_UsuarioModifica)==0) ? true : false) ;
            Z776TNov_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z776TNov_FechaCrea"), 0) ;
            n776TNov_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A776TNov_FechaCrea) ? true : false) ;
            Z778TNov_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z778TNov_FechaModifica"), 0) ;
            n778TNov_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A778TNov_FechaModifica) ? true : false) ;
            Z769TNov_Descripcion = httpContext.cgiGet( "Z769TNov_Descripcion") ;
            n769TNov_Descripcion = ((GXutil.strcmp("", A769TNov_Descripcion)==0) ? true : false) ;
            Z770TNov_Tipo = httpContext.cgiGet( "Z770TNov_Tipo") ;
            n770TNov_Tipo = ((GXutil.strcmp("", A770TNov_Tipo)==0) ? true : false) ;
            Z771TNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( "Z771TNov_Nro_Cambios"), ",", ".")) ;
            n771TNov_Nro_Cambios = ((0==A771TNov_Nro_Cambios) ? true : false) ;
            Z772TNov_Procedimiento = httpContext.cgiGet( "Z772TNov_Procedimiento") ;
            n772TNov_Procedimiento = ((GXutil.strcmp("", A772TNov_Procedimiento)==0) ? true : false) ;
            Z774TNov_Nombre_Campo = httpContext.cgiGet( "Z774TNov_Nombre_Campo") ;
            n774TNov_Nombre_Campo = ((GXutil.strcmp("", A774TNov_Nombre_Campo)==0) ? true : false) ;
            Z813TNov_IngresoMasivo = httpContext.cgiGet( "Z813TNov_IngresoMasivo") ;
            n813TNov_IngresoMasivo = ((GXutil.strcmp("", A813TNov_IngresoMasivo)==0) ? true : false) ;
            Z773TNov_Estado = httpContext.cgiGet( "Z773TNov_Estado") ;
            n773TNov_Estado = ((GXutil.strcmp("", A773TNov_Estado)==0) ? true : false) ;
            Z839TNov_ObligaSoporte = httpContext.cgiGet( "Z839TNov_ObligaSoporte") ;
            n839TNov_ObligaSoporte = ((GXutil.strcmp("", A839TNov_ObligaSoporte)==0) ? true : false) ;
            A775TNov_UsuarioCrea = httpContext.cgiGet( "Z775TNov_UsuarioCrea") ;
            n775TNov_UsuarioCrea = false ;
            n775TNov_UsuarioCrea = ((GXutil.strcmp("", A775TNov_UsuarioCrea)==0) ? true : false) ;
            A777TNov_UsuarioModifica = httpContext.cgiGet( "Z777TNov_UsuarioModifica") ;
            n777TNov_UsuarioModifica = false ;
            n777TNov_UsuarioModifica = ((GXutil.strcmp("", A777TNov_UsuarioModifica)==0) ? true : false) ;
            A776TNov_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z776TNov_FechaCrea"), 0) ;
            n776TNov_FechaCrea = false ;
            n776TNov_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A776TNov_FechaCrea) ? true : false) ;
            A778TNov_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z778TNov_FechaModifica"), 0) ;
            n778TNov_FechaModifica = false ;
            n778TNov_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A778TNov_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
            AV9TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "vTNOV_CODIGO"), ",", ".")) ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A775TNov_UsuarioCrea = httpContext.cgiGet( "TNOV_USUARIOCREA") ;
            n775TNov_UsuarioCrea = ((GXutil.strcmp("", A775TNov_UsuarioCrea)==0) ? true : false) ;
            A777TNov_UsuarioModifica = httpContext.cgiGet( "TNOV_USUARIOMODIFICA") ;
            n777TNov_UsuarioModifica = ((GXutil.strcmp("", A777TNov_UsuarioModifica)==0) ? true : false) ;
            A776TNov_FechaCrea = localUtil.ctot( httpContext.cgiGet( "TNOV_FECHACREA"), 0) ;
            n776TNov_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A776TNov_FechaCrea) ? true : false) ;
            A778TNov_FechaModifica = localUtil.ctot( httpContext.cgiGet( "TNOV_FECHAMODIFICA"), 0) ;
            n778TNov_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A778TNov_FechaModifica) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TIPO_NOVEDAD" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A104TNov_Codigo != Z104TNov_Codigo ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_tipo_novedad:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
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
               A104TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               n104TNov_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
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
                  sMode54 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode54 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound54 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0P0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TNOV_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTNov_Codigo_Internalname ;
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
                        e110P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120P2 ();
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
         e120P2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0P54( ) ;
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
         disableAttributes0P54( ) ;
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

   public void confirm_0P0( )
   {
      beforeValidate0P54( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0P54( ) ;
         }
         else
         {
            checkExtendedTable0P54( ) ;
            closeExtendedTableCursors0P54( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode54 = Gx_mode ;
         confirm_0P55( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode54 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode54 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0P55( )
   {
      nGXsfl_74_idx = (short)(0) ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         readRow0P55( ) ;
         if ( ( nRcdExists_55 != 0 ) || ( nIsMod_55 != 0 ) )
         {
            getKey0P55( ) ;
            if ( ( nRcdExists_55 == 0 ) && ( nRcdDeleted_55 == 0 ) )
            {
               if ( RcdFound55 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0P55( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0P55( ) ;
                     closeExtendedTableCursors0P55( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTNov_Rol_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound55 != 0 )
               {
                  if ( nRcdDeleted_55 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0P55( ) ;
                     load0P55( ) ;
                     beforeValidate0P55( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0P55( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_55 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0P55( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0P55( ) ;
                           closeExtendedTableCursors0P55( ) ;
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
                  if ( nRcdDeleted_55 == 0 )
                  {
                     GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTNov_Rol_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTNov_Rol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A105TNov_Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTNov_Rol_Descripcion_Internalname, A779TNov_Rol_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z105TNov_Rol_Id_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z105TNov_Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_55, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_55, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_55, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_55 != 0 )
         {
            httpContext.changePostValue( "TNOV_ROL_ID_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0P0( )
   {
   }

   public void e110P2( )
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

   public void e120P2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_tipo_novedad") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0P54( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z775TNov_UsuarioCrea = T000P6_A775TNov_UsuarioCrea[0] ;
            Z777TNov_UsuarioModifica = T000P6_A777TNov_UsuarioModifica[0] ;
            Z776TNov_FechaCrea = T000P6_A776TNov_FechaCrea[0] ;
            Z778TNov_FechaModifica = T000P6_A778TNov_FechaModifica[0] ;
            Z769TNov_Descripcion = T000P6_A769TNov_Descripcion[0] ;
            Z770TNov_Tipo = T000P6_A770TNov_Tipo[0] ;
            Z771TNov_Nro_Cambios = T000P6_A771TNov_Nro_Cambios[0] ;
            Z772TNov_Procedimiento = T000P6_A772TNov_Procedimiento[0] ;
            Z774TNov_Nombre_Campo = T000P6_A774TNov_Nombre_Campo[0] ;
            Z813TNov_IngresoMasivo = T000P6_A813TNov_IngresoMasivo[0] ;
            Z773TNov_Estado = T000P6_A773TNov_Estado[0] ;
            Z839TNov_ObligaSoporte = T000P6_A839TNov_ObligaSoporte[0] ;
         }
         else
         {
            Z775TNov_UsuarioCrea = A775TNov_UsuarioCrea ;
            Z777TNov_UsuarioModifica = A777TNov_UsuarioModifica ;
            Z776TNov_FechaCrea = A776TNov_FechaCrea ;
            Z778TNov_FechaModifica = A778TNov_FechaModifica ;
            Z769TNov_Descripcion = A769TNov_Descripcion ;
            Z770TNov_Tipo = A770TNov_Tipo ;
            Z771TNov_Nro_Cambios = A771TNov_Nro_Cambios ;
            Z772TNov_Procedimiento = A772TNov_Procedimiento ;
            Z774TNov_Nombre_Campo = A774TNov_Nombre_Campo ;
            Z813TNov_IngresoMasivo = A813TNov_IngresoMasivo ;
            Z773TNov_Estado = A773TNov_Estado ;
            Z839TNov_ObligaSoporte = A839TNov_ObligaSoporte ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z104TNov_Codigo = A104TNov_Codigo ;
         Z775TNov_UsuarioCrea = A775TNov_UsuarioCrea ;
         Z777TNov_UsuarioModifica = A777TNov_UsuarioModifica ;
         Z776TNov_FechaCrea = A776TNov_FechaCrea ;
         Z778TNov_FechaModifica = A778TNov_FechaModifica ;
         Z769TNov_Descripcion = A769TNov_Descripcion ;
         Z770TNov_Tipo = A770TNov_Tipo ;
         Z771TNov_Nro_Cambios = A771TNov_Nro_Cambios ;
         Z772TNov_Procedimiento = A772TNov_Procedimiento ;
         Z774TNov_Nombre_Campo = A774TNov_Nombre_Campo ;
         Z813TNov_IngresoMasivo = A813TNov_IngresoMasivo ;
         Z773TNov_Estado = A773TNov_Estado ;
         Z839TNov_ObligaSoporte = A839TNov_ObligaSoporte ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV9TNov_Codigo) )
      {
         A104TNov_Codigo = AV9TNov_Codigo ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      }
      if ( ! (0==AV9TNov_Codigo) )
      {
         edtTNov_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTNov_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTNov_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTNov_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV9TNov_Codigo) )
      {
         edtTNov_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTNov_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Codigo_Enabled, 5, 0)), true);
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
         AV13Pgmname = "ALM_TIPO_NOVEDAD" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
   }

   public void load0P54( )
   {
      /* Using cursor T000P7 */
      pr_default.execute(5, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A775TNov_UsuarioCrea = T000P7_A775TNov_UsuarioCrea[0] ;
         n775TNov_UsuarioCrea = T000P7_n775TNov_UsuarioCrea[0] ;
         A777TNov_UsuarioModifica = T000P7_A777TNov_UsuarioModifica[0] ;
         n777TNov_UsuarioModifica = T000P7_n777TNov_UsuarioModifica[0] ;
         A776TNov_FechaCrea = T000P7_A776TNov_FechaCrea[0] ;
         n776TNov_FechaCrea = T000P7_n776TNov_FechaCrea[0] ;
         A778TNov_FechaModifica = T000P7_A778TNov_FechaModifica[0] ;
         n778TNov_FechaModifica = T000P7_n778TNov_FechaModifica[0] ;
         A769TNov_Descripcion = T000P7_A769TNov_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
         n769TNov_Descripcion = T000P7_n769TNov_Descripcion[0] ;
         A770TNov_Tipo = T000P7_A770TNov_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
         n770TNov_Tipo = T000P7_n770TNov_Tipo[0] ;
         A771TNov_Nro_Cambios = T000P7_A771TNov_Nro_Cambios[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
         n771TNov_Nro_Cambios = T000P7_n771TNov_Nro_Cambios[0] ;
         A772TNov_Procedimiento = T000P7_A772TNov_Procedimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
         n772TNov_Procedimiento = T000P7_n772TNov_Procedimiento[0] ;
         A774TNov_Nombre_Campo = T000P7_A774TNov_Nombre_Campo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         n774TNov_Nombre_Campo = T000P7_n774TNov_Nombre_Campo[0] ;
         A813TNov_IngresoMasivo = T000P7_A813TNov_IngresoMasivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
         n813TNov_IngresoMasivo = T000P7_n813TNov_IngresoMasivo[0] ;
         A773TNov_Estado = T000P7_A773TNov_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
         n773TNov_Estado = T000P7_n773TNov_Estado[0] ;
         A839TNov_ObligaSoporte = T000P7_A839TNov_ObligaSoporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
         n839TNov_ObligaSoporte = T000P7_n839TNov_ObligaSoporte[0] ;
         zm0P54( -8) ;
      }
      pr_default.close(5);
      onLoadActions0P54( ) ;
   }

   public void onLoadActions0P54( )
   {
      AV13Pgmname = "ALM_TIPO_NOVEDAD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0P54( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_TIPO_NOVEDAD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0P54( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0P54( )
   {
      /* Using cursor T000P8 */
      pr_default.execute(6, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound54 = (short)(1) ;
      }
      else
      {
         RcdFound54 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000P6 */
      pr_default.execute(4, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0P54( 8) ;
         RcdFound54 = (short)(1) ;
         A104TNov_Codigo = T000P6_A104TNov_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         n104TNov_Codigo = T000P6_n104TNov_Codigo[0] ;
         A775TNov_UsuarioCrea = T000P6_A775TNov_UsuarioCrea[0] ;
         n775TNov_UsuarioCrea = T000P6_n775TNov_UsuarioCrea[0] ;
         A777TNov_UsuarioModifica = T000P6_A777TNov_UsuarioModifica[0] ;
         n777TNov_UsuarioModifica = T000P6_n777TNov_UsuarioModifica[0] ;
         A776TNov_FechaCrea = T000P6_A776TNov_FechaCrea[0] ;
         n776TNov_FechaCrea = T000P6_n776TNov_FechaCrea[0] ;
         A778TNov_FechaModifica = T000P6_A778TNov_FechaModifica[0] ;
         n778TNov_FechaModifica = T000P6_n778TNov_FechaModifica[0] ;
         A769TNov_Descripcion = T000P6_A769TNov_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
         n769TNov_Descripcion = T000P6_n769TNov_Descripcion[0] ;
         A770TNov_Tipo = T000P6_A770TNov_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
         n770TNov_Tipo = T000P6_n770TNov_Tipo[0] ;
         A771TNov_Nro_Cambios = T000P6_A771TNov_Nro_Cambios[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
         n771TNov_Nro_Cambios = T000P6_n771TNov_Nro_Cambios[0] ;
         A772TNov_Procedimiento = T000P6_A772TNov_Procedimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
         n772TNov_Procedimiento = T000P6_n772TNov_Procedimiento[0] ;
         A774TNov_Nombre_Campo = T000P6_A774TNov_Nombre_Campo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         n774TNov_Nombre_Campo = T000P6_n774TNov_Nombre_Campo[0] ;
         A813TNov_IngresoMasivo = T000P6_A813TNov_IngresoMasivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
         n813TNov_IngresoMasivo = T000P6_n813TNov_IngresoMasivo[0] ;
         A773TNov_Estado = T000P6_A773TNov_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
         n773TNov_Estado = T000P6_n773TNov_Estado[0] ;
         A839TNov_ObligaSoporte = T000P6_A839TNov_ObligaSoporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
         n839TNov_ObligaSoporte = T000P6_n839TNov_ObligaSoporte[0] ;
         Z104TNov_Codigo = A104TNov_Codigo ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0P54( ) ;
         if ( AnyError == 1 )
         {
            RcdFound54 = (short)(0) ;
            initializeNonKey0P54( ) ;
         }
         Gx_mode = sMode54 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound54 = (short)(0) ;
         initializeNonKey0P54( ) ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode54 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0P54( ) ;
      if ( RcdFound54 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound54 = (short)(0) ;
      /* Using cursor T000P9 */
      pr_default.execute(7, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000P9_A104TNov_Codigo[0] < A104TNov_Codigo ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000P9_A104TNov_Codigo[0] > A104TNov_Codigo ) ) )
         {
            A104TNov_Codigo = T000P9_A104TNov_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            n104TNov_Codigo = T000P9_n104TNov_Codigo[0] ;
            RcdFound54 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound54 = (short)(0) ;
      /* Using cursor T000P10 */
      pr_default.execute(8, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000P10_A104TNov_Codigo[0] > A104TNov_Codigo ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000P10_A104TNov_Codigo[0] < A104TNov_Codigo ) ) )
         {
            A104TNov_Codigo = T000P10_A104TNov_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
            n104TNov_Codigo = T000P10_n104TNov_Codigo[0] ;
            RcdFound54 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0P54( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTNov_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0P54( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound54 == 1 )
         {
            if ( A104TNov_Codigo != Z104TNov_Codigo )
            {
               A104TNov_Codigo = Z104TNov_Codigo ;
               n104TNov_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TNOV_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTNov_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTNov_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0P54( ) ;
               GX_FocusControl = edtTNov_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A104TNov_Codigo != Z104TNov_Codigo )
            {
               /* Insert record */
               GX_FocusControl = edtTNov_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0P54( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TNOV_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTNov_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTNov_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0P54( ) ;
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
      if ( A104TNov_Codigo != Z104TNov_Codigo )
      {
         A104TNov_Codigo = Z104TNov_Codigo ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TNOV_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTNov_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTNov_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0P54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000P5 */
         pr_default.execute(3, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_NOVEDAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z775TNov_UsuarioCrea, T000P5_A775TNov_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z777TNov_UsuarioModifica, T000P5_A777TNov_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z776TNov_FechaCrea, T000P5_A776TNov_FechaCrea[0]) ) || !( GXutil.dateCompare(Z778TNov_FechaModifica, T000P5_A778TNov_FechaModifica[0]) ) || ( GXutil.strcmp(Z769TNov_Descripcion, T000P5_A769TNov_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z770TNov_Tipo, T000P5_A770TNov_Tipo[0]) != 0 ) || ( Z771TNov_Nro_Cambios != T000P5_A771TNov_Nro_Cambios[0] ) || ( GXutil.strcmp(Z772TNov_Procedimiento, T000P5_A772TNov_Procedimiento[0]) != 0 ) || ( GXutil.strcmp(Z774TNov_Nombre_Campo, T000P5_A774TNov_Nombre_Campo[0]) != 0 ) || ( GXutil.strcmp(Z813TNov_IngresoMasivo, T000P5_A813TNov_IngresoMasivo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z773TNov_Estado, T000P5_A773TNov_Estado[0]) != 0 ) || ( GXutil.strcmp(Z839TNov_ObligaSoporte, T000P5_A839TNov_ObligaSoporte[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_NOVEDAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P54( )
   {
      beforeValidate0P54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P54( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P54( 0) ;
         checkOptimisticConcurrency0P54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P54( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P11 */
                  pr_default.execute(9, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Boolean(n775TNov_UsuarioCrea), A775TNov_UsuarioCrea, new Boolean(n777TNov_UsuarioModifica), A777TNov_UsuarioModifica, new Boolean(n776TNov_FechaCrea), A776TNov_FechaCrea, new Boolean(n778TNov_FechaModifica), A778TNov_FechaModifica, new Boolean(n769TNov_Descripcion), A769TNov_Descripcion, new Boolean(n770TNov_Tipo), A770TNov_Tipo, new Boolean(n771TNov_Nro_Cambios), new Short(A771TNov_Nro_Cambios), new Boolean(n772TNov_Procedimiento), A772TNov_Procedimiento, new Boolean(n774TNov_Nombre_Campo), A774TNov_Nombre_Campo, new Boolean(n813TNov_IngresoMasivo), A813TNov_IngresoMasivo, new Boolean(n773TNov_Estado), A773TNov_Estado, new Boolean(n839TNov_ObligaSoporte), A839TNov_ObligaSoporte});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_NOVEDAD") ;
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel0P54( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0P0( ) ;
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
            load0P54( ) ;
         }
         endLevel0P54( ) ;
      }
      closeExtendedTableCursors0P54( ) ;
   }

   public void update0P54( )
   {
      beforeValidate0P54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P54( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P54( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P12 */
                  pr_default.execute(10, new Object[] {new Boolean(n775TNov_UsuarioCrea), A775TNov_UsuarioCrea, new Boolean(n777TNov_UsuarioModifica), A777TNov_UsuarioModifica, new Boolean(n776TNov_FechaCrea), A776TNov_FechaCrea, new Boolean(n778TNov_FechaModifica), A778TNov_FechaModifica, new Boolean(n769TNov_Descripcion), A769TNov_Descripcion, new Boolean(n770TNov_Tipo), A770TNov_Tipo, new Boolean(n771TNov_Nro_Cambios), new Short(A771TNov_Nro_Cambios), new Boolean(n772TNov_Procedimiento), A772TNov_Procedimiento, new Boolean(n774TNov_Nombre_Campo), A774TNov_Nombre_Campo, new Boolean(n813TNov_IngresoMasivo), A813TNov_IngresoMasivo, new Boolean(n773TNov_Estado), A773TNov_Estado, new Boolean(n839TNov_ObligaSoporte), A839TNov_ObligaSoporte, new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_NOVEDAD") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_NOVEDAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P54( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0P54( ) ;
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
         endLevel0P54( ) ;
      }
      closeExtendedTableCursors0P54( ) ;
   }

   public void deferredUpdate0P54( )
   {
   }

   public void delete( )
   {
      beforeValidate0P54( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P54( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P54( ) ;
         afterConfirm0P54( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P54( ) ;
            if ( AnyError == 0 )
            {
               scanStart0P55( ) ;
               while ( RcdFound55 != 0 )
               {
                  getByPrimaryKey0P55( ) ;
                  delete0P55( ) ;
                  scanNext0P55( ) ;
               }
               scanEnd0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P13 */
                  pr_default.execute(11, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_NOVEDAD") ;
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
      sMode54 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0P54( ) ;
      Gx_mode = sMode54 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0P54( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_TIPO_NOVEDAD" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000P14 */
         pr_default.execute(12, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Novedad"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void processNestedLevel0P55( )
   {
      nGXsfl_74_idx = (short)(0) ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         readRow0P55( ) ;
         if ( ( nRcdExists_55 != 0 ) || ( nIsMod_55 != 0 ) )
         {
            standaloneNotModal0P55( ) ;
            getKey0P55( ) ;
            if ( ( nRcdExists_55 == 0 ) && ( nRcdDeleted_55 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0P55( ) ;
            }
            else
            {
               if ( RcdFound55 != 0 )
               {
                  if ( ( nRcdDeleted_55 != 0 ) && ( nRcdExists_55 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0P55( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_55 != 0 ) && ( nRcdExists_55 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0P55( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_55 == 0 )
                  {
                     GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTNov_Rol_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTNov_Rol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A105TNov_Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTNov_Rol_Descripcion_Internalname, A779TNov_Rol_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z105TNov_Rol_Id_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z105TNov_Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_55, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_55, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_55_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_55, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_55 != 0 )
         {
            httpContext.changePostValue( "TNOV_ROL_ID_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0P55( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_55 = (short)(0) ;
      nIsMod_55 = (short)(0) ;
      nRcdDeleted_55 = (short)(0) ;
   }

   public void processLevel0P54( )
   {
      /* Save parent mode. */
      sMode54 = Gx_mode ;
      processNestedLevel0P55( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode54 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0P54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0P54( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_novedad");
         if ( AnyError == 0 )
         {
            confirmValues0P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_novedad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0P54( )
   {
      /* Scan By routine */
      /* Using cursor T000P15 */
      pr_default.execute(13);
      RcdFound54 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A104TNov_Codigo = T000P15_A104TNov_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         n104TNov_Codigo = T000P15_n104TNov_Codigo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P54( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound54 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A104TNov_Codigo = T000P15_A104TNov_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         n104TNov_Codigo = T000P15_n104TNov_Codigo[0] ;
      }
   }

   public void scanEnd0P54( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0P54( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A776TNov_FechaCrea = GXutil.now( ) ;
         n776TNov_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A776TNov_FechaCrea", localUtil.ttoc( A776TNov_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A778TNov_FechaModifica = GXutil.now( ) ;
         n778TNov_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A778TNov_FechaModifica", localUtil.ttoc( A778TNov_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A775TNov_UsuarioCrea = AV12Usuario ;
         n775TNov_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A775TNov_UsuarioCrea", A775TNov_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A777TNov_UsuarioModifica = AV12Usuario ;
         n777TNov_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A777TNov_UsuarioModifica", A777TNov_UsuarioModifica);
      }
   }

   public void beforeInsert0P54( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0P54( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0P54( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P54( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P54( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P54( )
   {
      edtTNov_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Codigo_Enabled, 5, 0)), true);
      edtTNov_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Descripcion_Enabled, 5, 0)), true);
      cmbTNov_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTNov_Tipo.getEnabled(), 5, 0)), true);
      edtTNov_Nro_Cambios_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Nro_Cambios_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Nro_Cambios_Enabled, 5, 0)), true);
      cmbTNov_IngresoMasivo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTNov_IngresoMasivo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTNov_IngresoMasivo.getEnabled(), 5, 0)), true);
      cmbTNov_ObligaSoporte.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTNov_ObligaSoporte.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTNov_ObligaSoporte.getEnabled(), 5, 0)), true);
      edtTNov_Procedimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Procedimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Procedimiento_Enabled, 5, 0)), true);
      edtTNov_Nombre_Campo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Nombre_Campo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Nombre_Campo_Enabled, 5, 0)), true);
      cmbTNov_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTNov_Estado.getEnabled(), 5, 0)), true);
   }

   public void zm0P55( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -9 )
      {
         Z104TNov_Codigo = A104TNov_Codigo ;
         Z105TNov_Rol_Id = A105TNov_Rol_Id ;
         Z779TNov_Rol_Descripcion = A779TNov_Rol_Descripcion ;
      }
   }

   public void standaloneNotModal0P55( )
   {
   }

   public void standaloneModal0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTNov_Rol_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Id_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtTNov_Rol_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Id_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      }
   }

   public void load0P55( )
   {
      /* Using cursor T000P16 */
      pr_default.execute(14, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A779TNov_Rol_Descripcion = T000P16_A779TNov_Rol_Descripcion[0] ;
         n779TNov_Rol_Descripcion = T000P16_n779TNov_Rol_Descripcion[0] ;
         zm0P55( -9) ;
      }
      pr_default.close(14);
      onLoadActions0P55( ) ;
   }

   public void onLoadActions0P55( )
   {
   }

   public void checkExtendedTable0P55( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0P55( ) ;
      /* Using cursor T000P4 */
      pr_default.execute(2, new Object[] {new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem("No existe 'Novedad_Rol'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTNov_Rol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A779TNov_Rol_Descripcion = T000P4_A779TNov_Rol_Descripcion[0] ;
      n779TNov_Rol_Descripcion = T000P4_n779TNov_Rol_Descripcion[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0P55( )
   {
      pr_default.close(2);
   }

   public void enableDisable0P55( )
   {
   }

   public void gxload_10( long A105TNov_Rol_Id )
   {
      /* Using cursor T000P17 */
      pr_default.execute(15, new Object[] {new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem("No existe 'Novedad_Rol'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTNov_Rol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A779TNov_Rol_Descripcion = T000P17_A779TNov_Rol_Descripcion[0] ;
      n779TNov_Rol_Descripcion = T000P17_n779TNov_Rol_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A779TNov_Rol_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void getKey0P55( )
   {
      /* Using cursor T000P18 */
      pr_default.execute(16, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound55 = (short)(1) ;
      }
      else
      {
         RcdFound55 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey0P55( )
   {
      /* Using cursor T000P3 */
      pr_default.execute(1, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0P55( 9) ;
         RcdFound55 = (short)(1) ;
         initializeNonKey0P55( ) ;
         A105TNov_Rol_Id = T000P3_A105TNov_Rol_Id[0] ;
         Z104TNov_Codigo = A104TNov_Codigo ;
         Z105TNov_Rol_Id = A105TNov_Rol_Id ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0P55( ) ;
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound55 = (short)(0) ;
         initializeNonKey0P55( ) ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0P55( ) ;
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0P55( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000P2 */
         pr_default.execute(0, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_NOVEDADROLES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_NOVEDADROLES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P55( 0) ;
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P19 */
                  pr_default.execute(17, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_NOVEDADROLES") ;
                  if ( (pr_default.getStatus(17) == 1) )
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
            load0P55( ) ;
         }
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void update0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table ALM_TIPO_NOVEDADROLES */
                  deferredUpdate0P55( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0P55( ) ;
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
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void deferredUpdate0P55( )
   {
   }

   public void delete0P55( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P55( ) ;
         afterConfirm0P55( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P55( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000P20 */
               pr_default.execute(18, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Long(A105TNov_Rol_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_NOVEDADROLES") ;
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
      sMode55 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0P55( ) ;
      Gx_mode = sMode55 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0P55( )
   {
      standaloneModal0P55( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000P21 */
         pr_default.execute(19, new Object[] {new Long(A105TNov_Rol_Id)});
         A779TNov_Rol_Descripcion = T000P21_A779TNov_Rol_Descripcion[0] ;
         n779TNov_Rol_Descripcion = T000P21_n779TNov_Rol_Descripcion[0] ;
         pr_default.close(19);
      }
   }

   public void endLevel0P55( )
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

   public void scanStart0P55( )
   {
      /* Scan By routine */
      /* Using cursor T000P22 */
      pr_default.execute(20, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      RcdFound55 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A105TNov_Rol_Id = T000P22_A105TNov_Rol_Id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P55( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound55 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A105TNov_Rol_Id = T000P22_A105TNov_Rol_Id[0] ;
      }
   }

   public void scanEnd0P55( )
   {
      pr_default.close(20);
   }

   public void afterConfirm0P55( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P55( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0P55( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0P55( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P55( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P55( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P55( )
   {
      edtTNov_Rol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Id_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtTNov_Rol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
   }

   public void subsflControlProps_7455( )
   {
      edtTNov_Rol_Id_Internalname = "TNOV_ROL_ID_"+sGXsfl_74_idx ;
      imgprompt_105_Internalname = "PROMPT_105_"+sGXsfl_74_idx ;
      edtTNov_Rol_Descripcion_Internalname = "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_7455( )
   {
      edtTNov_Rol_Id_Internalname = "TNOV_ROL_ID_"+sGXsfl_74_fel_idx ;
      imgprompt_105_Internalname = "PROMPT_105_"+sGXsfl_74_fel_idx ;
      edtTNov_Rol_Descripcion_Internalname = "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_fel_idx ;
   }

   public void addRow0P55( )
   {
      nGXsfl_74_idx = (short)(nGXsfl_74_idx+1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7455( ) ;
      sendRow0P55( ) ;
   }

   public void sendRow0P55( )
   {
      Gridalm_tipo_novedad_rolesRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_tipo_novedad_roles_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_tipo_novedad_roles_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_tipo_novedad_roles_Class, "") != 0 )
         {
            subGridalm_tipo_novedad_roles_Linesclass = subGridalm_tipo_novedad_roles_Class+"Odd" ;
         }
      }
      else if ( subGridalm_tipo_novedad_roles_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_tipo_novedad_roles_Backstyle = (byte)(0) ;
         subGridalm_tipo_novedad_roles_Backcolor = subGridalm_tipo_novedad_roles_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_tipo_novedad_roles_Class, "") != 0 )
         {
            subGridalm_tipo_novedad_roles_Linesclass = subGridalm_tipo_novedad_roles_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_tipo_novedad_roles_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_tipo_novedad_roles_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_tipo_novedad_roles_Class, "") != 0 )
         {
            subGridalm_tipo_novedad_roles_Linesclass = subGridalm_tipo_novedad_roles_Class+"Odd" ;
         }
         subGridalm_tipo_novedad_roles_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_tipo_novedad_roles_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_tipo_novedad_roles_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
         {
            subGridalm_tipo_novedad_roles_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_novedad_roles_Class, "") != 0 )
            {
               subGridalm_tipo_novedad_roles_Linesclass = subGridalm_tipo_novedad_roles_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_tipo_novedad_roles_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_novedad_roles_Class, "") != 0 )
            {
               subGridalm_tipo_novedad_roles_Linesclass = subGridalm_tipo_novedad_roles_Class+"Odd" ;
            }
         }
      }
      imgprompt_105_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00r0"+"',["+"{Ctrl:gx.dom.el('"+"TNOV_ROL_ID_"+sGXsfl_74_idx+"'), id:'"+"TNOV_ROL_ID_"+sGXsfl_74_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_55_"+sGXsfl_74_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx01j1"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TNOV_CODIGO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TNOV_CODIGO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TNOV_ROL_ID_"',3),t(+,5),t(sGXsfl_74_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"TNOV_ROL_ID_"',3),t(+,5),t(sGXsfl_74_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_55_"',3),t(+,5),t(sGXsfl_74_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_104,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_55_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_tipo_novedad_rolesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Rol_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A105TNov_Rol_Id, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A105TNov_Rol_Id), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Rol_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTNov_Rol_Id_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_tipo_novedad_rolesRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_105_Internalname,sImgUrl,imgprompt_105_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_105_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_tipo_novedad_rolesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Rol_Descripcion_Internalname,A779TNov_Rol_Descripcion,GXutil.rtrim( localUtil.format( A779TNov_Rol_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Rol_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTNov_Rol_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridalm_tipo_novedad_rolesRow);
      GXCCtl = "Z105TNov_Rol_Id_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z105TNov_Rol_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_55_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_55, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_55_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_55, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_55_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_55, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_74_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vTNOV_CODIGO_" + sGXsfl_74_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_ROL_ID_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTNov_Rol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_105_"+sGXsfl_74_idx+"Link", GXutil.rtrim( imgprompt_105_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_tipo_novedad_rolesContainer.AddRow(Gridalm_tipo_novedad_rolesRow);
   }

   public void readRow0P55( )
   {
      nGXsfl_74_idx = (short)(nGXsfl_74_idx+1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7455( ) ;
      edtTNov_Rol_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TNOV_ROL_ID_"+sGXsfl_74_idx+"Enabled"), ",", ".")) ;
      edtTNov_Rol_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TNOV_ROL_DESCRIPCION_"+sGXsfl_74_idx+"Enabled"), ",", ".")) ;
      imgprompt_105_Link = httpContext.cgiGet( "PROMPT_105_"+sGXsfl_74_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Rol_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTNov_Rol_Id_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "TNOV_ROL_ID_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTNov_Rol_Id_Internalname ;
         wbErr = true ;
         A105TNov_Rol_Id = 0 ;
      }
      else
      {
         A105TNov_Rol_Id = localUtil.ctol( httpContext.cgiGet( edtTNov_Rol_Id_Internalname), ",", ".") ;
      }
      A779TNov_Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtTNov_Rol_Descripcion_Internalname)) ;
      n779TNov_Rol_Descripcion = false ;
      GXCCtl = "Z105TNov_Rol_Id_" + sGXsfl_74_idx ;
      Z105TNov_Rol_Id = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "nRcdDeleted_55_" + sGXsfl_74_idx ;
      nRcdDeleted_55 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_55_" + sGXsfl_74_idx ;
      nRcdExists_55 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_55_" + sGXsfl_74_idx ;
      nIsMod_55 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtTNov_Rol_Id_Enabled = edtTNov_Rol_Id_Enabled ;
   }

   public void confirmValues0P0( )
   {
      nGXsfl_74_idx = (short)(0) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7455( ) ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         nGXsfl_74_idx = (short)(nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7455( ) ;
         httpContext.changePostValue( "Z105TNov_Rol_Id_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z105TNov_Rol_Id_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z105TNov_Rol_Id_"+sGXsfl_74_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161364");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9TNov_Codigo,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z104TNov_Codigo", GXutil.ltrim( localUtil.ntoc( Z104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z775TNov_UsuarioCrea", Z775TNov_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z777TNov_UsuarioModifica", Z777TNov_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z776TNov_FechaCrea", localUtil.ttoc( Z776TNov_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z778TNov_FechaModifica", localUtil.ttoc( Z778TNov_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z769TNov_Descripcion", Z769TNov_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z770TNov_Tipo", Z770TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z771TNov_Nro_Cambios", GXutil.ltrim( localUtil.ntoc( Z771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z772TNov_Procedimiento", Z772TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z774TNov_Nombre_Campo", Z774TNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z813TNov_IngresoMasivo", Z813TNov_IngresoMasivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z773TNov_Estado", GXutil.rtrim( Z773TNov_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z839TNov_ObligaSoporte", Z839TNov_ObligaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nGXsfl_74_idx, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV9TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_USUARIOCREA", A775TNov_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_USUARIOMODIFICA", A777TNov_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_FECHACREA", localUtil.ttoc( A776TNov_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_FECHAMODIFICA", localUtil.ttoc( A778TNov_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTNOV_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9TNov_Codigo), "ZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TIPO_NOVEDAD" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_tipo_novedad:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_tipo_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9TNov_Codigo,6,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_TIPO_NOVEDAD" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de Novedad" ;
   }

   public void initializeNonKey0P54( )
   {
      A775TNov_UsuarioCrea = "" ;
      n775TNov_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A775TNov_UsuarioCrea", A775TNov_UsuarioCrea);
      A777TNov_UsuarioModifica = "" ;
      n777TNov_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A777TNov_UsuarioModifica", A777TNov_UsuarioModifica);
      A776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n776TNov_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A776TNov_FechaCrea", localUtil.ttoc( A776TNov_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n778TNov_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A778TNov_FechaModifica", localUtil.ttoc( A778TNov_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A769TNov_Descripcion = "" ;
      n769TNov_Descripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
      n769TNov_Descripcion = ((GXutil.strcmp("", A769TNov_Descripcion)==0) ? true : false) ;
      A770TNov_Tipo = "" ;
      n770TNov_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
      n770TNov_Tipo = ((GXutil.strcmp("", A770TNov_Tipo)==0) ? true : false) ;
      A771TNov_Nro_Cambios = (short)(0) ;
      n771TNov_Nro_Cambios = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A771TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( A771TNov_Nro_Cambios, 4, 0)));
      n771TNov_Nro_Cambios = ((0==A771TNov_Nro_Cambios) ? true : false) ;
      A772TNov_Procedimiento = "" ;
      n772TNov_Procedimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
      n772TNov_Procedimiento = ((GXutil.strcmp("", A772TNov_Procedimiento)==0) ? true : false) ;
      A774TNov_Nombre_Campo = "" ;
      n774TNov_Nombre_Campo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      n774TNov_Nombre_Campo = ((GXutil.strcmp("", A774TNov_Nombre_Campo)==0) ? true : false) ;
      A813TNov_IngresoMasivo = "" ;
      n813TNov_IngresoMasivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
      n813TNov_IngresoMasivo = ((GXutil.strcmp("", A813TNov_IngresoMasivo)==0) ? true : false) ;
      A773TNov_Estado = "" ;
      n773TNov_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
      n773TNov_Estado = ((GXutil.strcmp("", A773TNov_Estado)==0) ? true : false) ;
      A839TNov_ObligaSoporte = "" ;
      n839TNov_ObligaSoporte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
      n839TNov_ObligaSoporte = ((GXutil.strcmp("", A839TNov_ObligaSoporte)==0) ? true : false) ;
      Z775TNov_UsuarioCrea = "" ;
      Z777TNov_UsuarioModifica = "" ;
      Z776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z769TNov_Descripcion = "" ;
      Z770TNov_Tipo = "" ;
      Z771TNov_Nro_Cambios = (short)(0) ;
      Z772TNov_Procedimiento = "" ;
      Z774TNov_Nombre_Campo = "" ;
      Z813TNov_IngresoMasivo = "" ;
      Z773TNov_Estado = "" ;
      Z839TNov_ObligaSoporte = "" ;
   }

   public void initAll0P54( )
   {
      A104TNov_Codigo = 0 ;
      n104TNov_Codigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      initializeNonKey0P54( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0P55( )
   {
      A779TNov_Rol_Descripcion = "" ;
      n779TNov_Rol_Descripcion = false ;
   }

   public void initAll0P55( )
   {
      A105TNov_Rol_Id = 0 ;
      initializeNonKey0P55( ) ;
   }

   public void standaloneModalInsert0P55( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161375");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_tipo_novedad.js", "?201861414161375");
      /* End function include_jscripts */
   }

   public void init_level_properties55( )
   {
      edtTNov_Rol_Id_Enabled = defedtTNov_Rol_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Rol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Rol_Id_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
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
      edtTNov_Codigo_Internalname = "TNOV_CODIGO" ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION" ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO" );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS" ;
      cmbTNov_IngresoMasivo.setInternalname( "TNOV_INGRESOMASIVO" );
      cmbTNov_ObligaSoporte.setInternalname( "TNOV_OBLIGASOPORTE" );
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO" ;
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO" ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO" );
      lblTitleroles_Internalname = "TITLEROLES" ;
      edtTNov_Rol_Id_Internalname = "TNOV_ROL_ID" ;
      edtTNov_Rol_Descripcion_Internalname = "TNOV_ROL_DESCRIPCION" ;
      divRolestable_Internalname = "ROLESTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_105_Internalname = "PROMPT_105" ;
      subGridalm_tipo_novedad_roles_Internalname = "GRIDALM_TIPO_NOVEDAD_ROLES" ;
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
      Form.setCaption( "Tipo de Novedad" );
      edtTNov_Rol_Descripcion_Jsonclick = "" ;
      imgprompt_105_Visible = 1 ;
      imgprompt_105_Link = "" ;
      imgprompt_105_Visible = 1 ;
      edtTNov_Rol_Id_Jsonclick = "" ;
      subGridalm_tipo_novedad_roles_Class = "Grid" ;
      subGridalm_tipo_novedad_roles_Backcolorstyle = (byte)(0) ;
      subGridalm_tipo_novedad_roles_Allowcollapsing = (byte)(0) ;
      subGridalm_tipo_novedad_roles_Allowselection = (byte)(0) ;
      edtTNov_Rol_Descripcion_Enabled = 0 ;
      edtTNov_Rol_Id_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTNov_Estado.setJsonclick( "" );
      cmbTNov_Estado.setEnabled( 1 );
      edtTNov_Nombre_Campo_Jsonclick = "" ;
      edtTNov_Nombre_Campo_Enabled = 1 ;
      edtTNov_Procedimiento_Jsonclick = "" ;
      edtTNov_Procedimiento_Enabled = 1 ;
      cmbTNov_ObligaSoporte.setJsonclick( "" );
      cmbTNov_ObligaSoporte.setEnabled( 1 );
      cmbTNov_IngresoMasivo.setJsonclick( "" );
      cmbTNov_IngresoMasivo.setEnabled( 1 );
      edtTNov_Nro_Cambios_Jsonclick = "" ;
      edtTNov_Nro_Cambios_Enabled = 1 ;
      cmbTNov_Tipo.setJsonclick( "" );
      cmbTNov_Tipo.setEnabled( 1 );
      edtTNov_Descripcion_Enabled = 1 ;
      edtTNov_Codigo_Jsonclick = "" ;
      edtTNov_Codigo_Enabled = 1 ;
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

   public void gxnrgridalm_tipo_novedad_roles_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_7455( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0P55( ) ;
         standaloneModal0P55( ) ;
         cmbTNov_Tipo.setName( "TNOV_TIPO" );
         cmbTNov_Tipo.setWebtags( "" );
         cmbTNov_Tipo.addItem("T", "Transacción", (short)(0));
         cmbTNov_Tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbTNov_Tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbTNov_Tipo.getItemCount() > 0 )
         {
            A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
            n770TNov_Tipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
         }
         cmbTNov_IngresoMasivo.setName( "TNOV_INGRESOMASIVO" );
         cmbTNov_IngresoMasivo.setWebtags( "" );
         cmbTNov_IngresoMasivo.addItem("", "", (short)(0));
         cmbTNov_IngresoMasivo.addItem("SI", "SI", (short)(0));
         cmbTNov_IngresoMasivo.addItem("NO", "NO", (short)(0));
         if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
         {
            A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
            n813TNov_IngresoMasivo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TNov_IngresoMasivo", A813TNov_IngresoMasivo);
         }
         cmbTNov_ObligaSoporte.setName( "TNOV_OBLIGASOPORTE" );
         cmbTNov_ObligaSoporte.setWebtags( "" );
         cmbTNov_ObligaSoporte.addItem("", "", (short)(0));
         cmbTNov_ObligaSoporte.addItem("SI", "SI", (short)(0));
         cmbTNov_ObligaSoporte.addItem("NO", "NO", (short)(0));
         if ( cmbTNov_ObligaSoporte.getItemCount() > 0 )
         {
            A839TNov_ObligaSoporte = cmbTNov_ObligaSoporte.getValidValue(A839TNov_ObligaSoporte) ;
            n839TNov_ObligaSoporte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A839TNov_ObligaSoporte", A839TNov_ObligaSoporte);
         }
         cmbTNov_Estado.setName( "TNOV_ESTADO" );
         cmbTNov_Estado.setWebtags( "" );
         cmbTNov_Estado.addItem("A", "Activo", (short)(0));
         cmbTNov_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTNov_Estado.getItemCount() > 0 )
         {
            A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
            n773TNov_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A773TNov_Estado", A773TNov_Estado);
         }
         dynload_actions( ) ;
         sendRow0P55( ) ;
         nGXsfl_74_idx = (short)(nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7455( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_tipo_novedad_rolesContainer.ToJavascriptSource());
      /* End function gxnrGridalm_tipo_novedad_roles_newrow */
   }

   public void valid_Tnov_rol_id( long GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A105TNov_Rol_Id = GX_Parm1 ;
      A779TNov_Rol_Descripcion = GX_Parm2 ;
      n779TNov_Rol_Descripcion = false ;
      /* Using cursor T000P21 */
      pr_default.execute(19, new Object[] {new Long(A105TNov_Rol_Id)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Novedad_Rol'.", "ForeignKeyNotFound", 1, "TNOV_ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTNov_Rol_Id_Internalname ;
      }
      A779TNov_Rol_Descripcion = T000P21_A779TNov_Rol_Descripcion[0] ;
      n779TNov_Rol_Descripcion = T000P21_n779TNov_Rol_Descripcion[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A779TNov_Rol_Descripcion = "" ;
         n779TNov_Rol_Descripcion = false ;
      }
      isValidOutput.add(A779TNov_Rol_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120P2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z775TNov_UsuarioCrea = "" ;
      Z777TNov_UsuarioModifica = "" ;
      Z776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z769TNov_Descripcion = "" ;
      Z770TNov_Tipo = "" ;
      Z772TNov_Procedimiento = "" ;
      Z774TNov_Nombre_Campo = "" ;
      Z813TNov_IngresoMasivo = "" ;
      Z773TNov_Estado = "" ;
      Z839TNov_ObligaSoporte = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A770TNov_Tipo = "" ;
      A813TNov_IngresoMasivo = "" ;
      A839TNov_ObligaSoporte = "" ;
      A773TNov_Estado = "" ;
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
      A769TNov_Descripcion = "" ;
      A772TNov_Procedimiento = "" ;
      A774TNov_Nombre_Campo = "" ;
      lblTitleroles_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_tipo_novedad_rolesContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_tipo_novedad_rolesColumn = new com.genexus.webpanels.GXWebColumn();
      A779TNov_Rol_Descripcion = "" ;
      sMode55 = "" ;
      sStyleString = "" ;
      A775TNov_UsuarioCrea = "" ;
      A777TNov_UsuarioModifica = "" ;
      A776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode54 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T000P7_A104TNov_Codigo = new int[1] ;
      T000P7_n104TNov_Codigo = new boolean[] {false} ;
      T000P7_A775TNov_UsuarioCrea = new String[] {""} ;
      T000P7_n775TNov_UsuarioCrea = new boolean[] {false} ;
      T000P7_A777TNov_UsuarioModifica = new String[] {""} ;
      T000P7_n777TNov_UsuarioModifica = new boolean[] {false} ;
      T000P7_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000P7_n776TNov_FechaCrea = new boolean[] {false} ;
      T000P7_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000P7_n778TNov_FechaModifica = new boolean[] {false} ;
      T000P7_A769TNov_Descripcion = new String[] {""} ;
      T000P7_n769TNov_Descripcion = new boolean[] {false} ;
      T000P7_A770TNov_Tipo = new String[] {""} ;
      T000P7_n770TNov_Tipo = new boolean[] {false} ;
      T000P7_A771TNov_Nro_Cambios = new short[1] ;
      T000P7_n771TNov_Nro_Cambios = new boolean[] {false} ;
      T000P7_A772TNov_Procedimiento = new String[] {""} ;
      T000P7_n772TNov_Procedimiento = new boolean[] {false} ;
      T000P7_A774TNov_Nombre_Campo = new String[] {""} ;
      T000P7_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000P7_A813TNov_IngresoMasivo = new String[] {""} ;
      T000P7_n813TNov_IngresoMasivo = new boolean[] {false} ;
      T000P7_A773TNov_Estado = new String[] {""} ;
      T000P7_n773TNov_Estado = new boolean[] {false} ;
      T000P7_A839TNov_ObligaSoporte = new String[] {""} ;
      T000P7_n839TNov_ObligaSoporte = new boolean[] {false} ;
      T000P8_A104TNov_Codigo = new int[1] ;
      T000P8_n104TNov_Codigo = new boolean[] {false} ;
      T000P6_A104TNov_Codigo = new int[1] ;
      T000P6_n104TNov_Codigo = new boolean[] {false} ;
      T000P6_A775TNov_UsuarioCrea = new String[] {""} ;
      T000P6_n775TNov_UsuarioCrea = new boolean[] {false} ;
      T000P6_A777TNov_UsuarioModifica = new String[] {""} ;
      T000P6_n777TNov_UsuarioModifica = new boolean[] {false} ;
      T000P6_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000P6_n776TNov_FechaCrea = new boolean[] {false} ;
      T000P6_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000P6_n778TNov_FechaModifica = new boolean[] {false} ;
      T000P6_A769TNov_Descripcion = new String[] {""} ;
      T000P6_n769TNov_Descripcion = new boolean[] {false} ;
      T000P6_A770TNov_Tipo = new String[] {""} ;
      T000P6_n770TNov_Tipo = new boolean[] {false} ;
      T000P6_A771TNov_Nro_Cambios = new short[1] ;
      T000P6_n771TNov_Nro_Cambios = new boolean[] {false} ;
      T000P6_A772TNov_Procedimiento = new String[] {""} ;
      T000P6_n772TNov_Procedimiento = new boolean[] {false} ;
      T000P6_A774TNov_Nombre_Campo = new String[] {""} ;
      T000P6_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000P6_A813TNov_IngresoMasivo = new String[] {""} ;
      T000P6_n813TNov_IngresoMasivo = new boolean[] {false} ;
      T000P6_A773TNov_Estado = new String[] {""} ;
      T000P6_n773TNov_Estado = new boolean[] {false} ;
      T000P6_A839TNov_ObligaSoporte = new String[] {""} ;
      T000P6_n839TNov_ObligaSoporte = new boolean[] {false} ;
      T000P9_A104TNov_Codigo = new int[1] ;
      T000P9_n104TNov_Codigo = new boolean[] {false} ;
      T000P10_A104TNov_Codigo = new int[1] ;
      T000P10_n104TNov_Codigo = new boolean[] {false} ;
      T000P5_A104TNov_Codigo = new int[1] ;
      T000P5_n104TNov_Codigo = new boolean[] {false} ;
      T000P5_A775TNov_UsuarioCrea = new String[] {""} ;
      T000P5_n775TNov_UsuarioCrea = new boolean[] {false} ;
      T000P5_A777TNov_UsuarioModifica = new String[] {""} ;
      T000P5_n777TNov_UsuarioModifica = new boolean[] {false} ;
      T000P5_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n776TNov_FechaCrea = new boolean[] {false} ;
      T000P5_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n778TNov_FechaModifica = new boolean[] {false} ;
      T000P5_A769TNov_Descripcion = new String[] {""} ;
      T000P5_n769TNov_Descripcion = new boolean[] {false} ;
      T000P5_A770TNov_Tipo = new String[] {""} ;
      T000P5_n770TNov_Tipo = new boolean[] {false} ;
      T000P5_A771TNov_Nro_Cambios = new short[1] ;
      T000P5_n771TNov_Nro_Cambios = new boolean[] {false} ;
      T000P5_A772TNov_Procedimiento = new String[] {""} ;
      T000P5_n772TNov_Procedimiento = new boolean[] {false} ;
      T000P5_A774TNov_Nombre_Campo = new String[] {""} ;
      T000P5_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000P5_A813TNov_IngresoMasivo = new String[] {""} ;
      T000P5_n813TNov_IngresoMasivo = new boolean[] {false} ;
      T000P5_A773TNov_Estado = new String[] {""} ;
      T000P5_n773TNov_Estado = new boolean[] {false} ;
      T000P5_A839TNov_ObligaSoporte = new String[] {""} ;
      T000P5_n839TNov_ObligaSoporte = new boolean[] {false} ;
      T000P14_A106Nove_Identificador = new long[1] ;
      T000P15_A104TNov_Codigo = new int[1] ;
      T000P15_n104TNov_Codigo = new boolean[] {false} ;
      Z779TNov_Rol_Descripcion = "" ;
      T000P16_A104TNov_Codigo = new int[1] ;
      T000P16_n104TNov_Codigo = new boolean[] {false} ;
      T000P16_A779TNov_Rol_Descripcion = new String[] {""} ;
      T000P16_n779TNov_Rol_Descripcion = new boolean[] {false} ;
      T000P16_A105TNov_Rol_Id = new long[1] ;
      T000P4_A779TNov_Rol_Descripcion = new String[] {""} ;
      T000P4_n779TNov_Rol_Descripcion = new boolean[] {false} ;
      T000P17_A779TNov_Rol_Descripcion = new String[] {""} ;
      T000P17_n779TNov_Rol_Descripcion = new boolean[] {false} ;
      T000P18_A104TNov_Codigo = new int[1] ;
      T000P18_n104TNov_Codigo = new boolean[] {false} ;
      T000P18_A105TNov_Rol_Id = new long[1] ;
      T000P3_A104TNov_Codigo = new int[1] ;
      T000P3_n104TNov_Codigo = new boolean[] {false} ;
      T000P3_A105TNov_Rol_Id = new long[1] ;
      T000P2_A104TNov_Codigo = new int[1] ;
      T000P2_n104TNov_Codigo = new boolean[] {false} ;
      T000P2_A105TNov_Rol_Id = new long[1] ;
      T000P21_A779TNov_Rol_Descripcion = new String[] {""} ;
      T000P21_n779TNov_Rol_Descripcion = new boolean[] {false} ;
      T000P22_A104TNov_Codigo = new int[1] ;
      T000P22_n104TNov_Codigo = new boolean[] {false} ;
      T000P22_A105TNov_Rol_Id = new long[1] ;
      Gridalm_tipo_novedad_rolesRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_tipo_novedad_roles_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_novedad__default(),
         new Object[] {
             new Object[] {
            T000P2_A104TNov_Codigo, T000P2_A105TNov_Rol_Id
            }
            , new Object[] {
            T000P3_A104TNov_Codigo, T000P3_A105TNov_Rol_Id
            }
            , new Object[] {
            T000P4_A779TNov_Rol_Descripcion, T000P4_n779TNov_Rol_Descripcion
            }
            , new Object[] {
            T000P5_A104TNov_Codigo, T000P5_A775TNov_UsuarioCrea, T000P5_n775TNov_UsuarioCrea, T000P5_A777TNov_UsuarioModifica, T000P5_n777TNov_UsuarioModifica, T000P5_A776TNov_FechaCrea, T000P5_n776TNov_FechaCrea, T000P5_A778TNov_FechaModifica, T000P5_n778TNov_FechaModifica, T000P5_A769TNov_Descripcion,
            T000P5_n769TNov_Descripcion, T000P5_A770TNov_Tipo, T000P5_n770TNov_Tipo, T000P5_A771TNov_Nro_Cambios, T000P5_n771TNov_Nro_Cambios, T000P5_A772TNov_Procedimiento, T000P5_n772TNov_Procedimiento, T000P5_A774TNov_Nombre_Campo, T000P5_n774TNov_Nombre_Campo, T000P5_A813TNov_IngresoMasivo,
            T000P5_n813TNov_IngresoMasivo, T000P5_A773TNov_Estado, T000P5_n773TNov_Estado, T000P5_A839TNov_ObligaSoporte, T000P5_n839TNov_ObligaSoporte
            }
            , new Object[] {
            T000P6_A104TNov_Codigo, T000P6_A775TNov_UsuarioCrea, T000P6_n775TNov_UsuarioCrea, T000P6_A777TNov_UsuarioModifica, T000P6_n777TNov_UsuarioModifica, T000P6_A776TNov_FechaCrea, T000P6_n776TNov_FechaCrea, T000P6_A778TNov_FechaModifica, T000P6_n778TNov_FechaModifica, T000P6_A769TNov_Descripcion,
            T000P6_n769TNov_Descripcion, T000P6_A770TNov_Tipo, T000P6_n770TNov_Tipo, T000P6_A771TNov_Nro_Cambios, T000P6_n771TNov_Nro_Cambios, T000P6_A772TNov_Procedimiento, T000P6_n772TNov_Procedimiento, T000P6_A774TNov_Nombre_Campo, T000P6_n774TNov_Nombre_Campo, T000P6_A813TNov_IngresoMasivo,
            T000P6_n813TNov_IngresoMasivo, T000P6_A773TNov_Estado, T000P6_n773TNov_Estado, T000P6_A839TNov_ObligaSoporte, T000P6_n839TNov_ObligaSoporte
            }
            , new Object[] {
            T000P7_A104TNov_Codigo, T000P7_A775TNov_UsuarioCrea, T000P7_n775TNov_UsuarioCrea, T000P7_A777TNov_UsuarioModifica, T000P7_n777TNov_UsuarioModifica, T000P7_A776TNov_FechaCrea, T000P7_n776TNov_FechaCrea, T000P7_A778TNov_FechaModifica, T000P7_n778TNov_FechaModifica, T000P7_A769TNov_Descripcion,
            T000P7_n769TNov_Descripcion, T000P7_A770TNov_Tipo, T000P7_n770TNov_Tipo, T000P7_A771TNov_Nro_Cambios, T000P7_n771TNov_Nro_Cambios, T000P7_A772TNov_Procedimiento, T000P7_n772TNov_Procedimiento, T000P7_A774TNov_Nombre_Campo, T000P7_n774TNov_Nombre_Campo, T000P7_A813TNov_IngresoMasivo,
            T000P7_n813TNov_IngresoMasivo, T000P7_A773TNov_Estado, T000P7_n773TNov_Estado, T000P7_A839TNov_ObligaSoporte, T000P7_n839TNov_ObligaSoporte
            }
            , new Object[] {
            T000P8_A104TNov_Codigo
            }
            , new Object[] {
            T000P9_A104TNov_Codigo
            }
            , new Object[] {
            T000P10_A104TNov_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P14_A106Nove_Identificador
            }
            , new Object[] {
            T000P15_A104TNov_Codigo
            }
            , new Object[] {
            T000P16_A104TNov_Codigo, T000P16_A779TNov_Rol_Descripcion, T000P16_n779TNov_Rol_Descripcion, T000P16_A105TNov_Rol_Id
            }
            , new Object[] {
            T000P17_A779TNov_Rol_Descripcion, T000P17_n779TNov_Rol_Descripcion
            }
            , new Object[] {
            T000P18_A104TNov_Codigo, T000P18_A105TNov_Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P21_A779TNov_Rol_Descripcion, T000P21_n779TNov_Rol_Descripcion
            }
            , new Object[] {
            T000P22_A104TNov_Codigo, T000P22_A105TNov_Rol_Id
            }
         }
      );
      AV13Pgmname = "ALM_TIPO_NOVEDAD" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_tipo_novedad_roles_Backcolorstyle ;
   private byte subGridalm_tipo_novedad_roles_Allowselection ;
   private byte subGridalm_tipo_novedad_roles_Allowhovering ;
   private byte subGridalm_tipo_novedad_roles_Allowcollapsing ;
   private byte subGridalm_tipo_novedad_roles_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_tipo_novedad_roles_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_55 ;
   private short Z771TNov_Nro_Cambios ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short nRcdDeleted_55 ;
   private short nRcdExists_55 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A771TNov_Nro_Cambios ;
   private short nBlankRcdCount55 ;
   private short RcdFound55 ;
   private short nBlankRcdUsr55 ;
   private short RcdFound54 ;
   private int wcpOAV9TNov_Codigo ;
   private int Z104TNov_Codigo ;
   private int AV9TNov_Codigo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A104TNov_Codigo ;
   private int edtTNov_Codigo_Enabled ;
   private int edtTNov_Descripcion_Enabled ;
   private int edtTNov_Nro_Cambios_Enabled ;
   private int edtTNov_Procedimiento_Enabled ;
   private int edtTNov_Nombre_Campo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtTNov_Rol_Id_Enabled ;
   private int edtTNov_Rol_Descripcion_Enabled ;
   private int subGridalm_tipo_novedad_roles_Selectioncolor ;
   private int subGridalm_tipo_novedad_roles_Hoveringcolor ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridalm_tipo_novedad_roles_Backcolor ;
   private int subGridalm_tipo_novedad_roles_Allbackcolor ;
   private int imgprompt_105_Visible ;
   private int defedtTNov_Rol_Id_Enabled ;
   private int idxLst ;
   private long Z105TNov_Rol_Id ;
   private long A105TNov_Rol_Id ;
   private long GRIDALM_TIPO_NOVEDAD_ROLES_nFirstRecordOnPage ;
   private String sPrefix ;
   private String sGXsfl_74_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z773TNov_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A773TNov_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTNov_Codigo_Internalname ;
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
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Descripcion_Internalname ;
   private String edtTNov_Nro_Cambios_Internalname ;
   private String edtTNov_Nro_Cambios_Jsonclick ;
   private String edtTNov_Procedimiento_Internalname ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private String edtTNov_Nombre_Campo_Internalname ;
   private String edtTNov_Nombre_Campo_Jsonclick ;
   private String divRolestable_Internalname ;
   private String lblTitleroles_Internalname ;
   private String lblTitleroles_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode55 ;
   private String edtTNov_Rol_Id_Internalname ;
   private String edtTNov_Rol_Descripcion_Internalname ;
   private String imgprompt_105_Link ;
   private String sStyleString ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode54 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String imgprompt_105_Internalname ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String subGridalm_tipo_novedad_roles_Class ;
   private String subGridalm_tipo_novedad_roles_Linesclass ;
   private String ROClassString ;
   private String edtTNov_Rol_Id_Jsonclick ;
   private String sImgUrl ;
   private String edtTNov_Rol_Descripcion_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_tipo_novedad_roles_Internalname ;
   private java.util.Date Z776TNov_FechaCrea ;
   private java.util.Date Z778TNov_FechaModifica ;
   private java.util.Date A776TNov_FechaCrea ;
   private java.util.Date A778TNov_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n770TNov_Tipo ;
   private boolean n813TNov_IngresoMasivo ;
   private boolean n839TNov_ObligaSoporte ;
   private boolean n773TNov_Estado ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean n104TNov_Codigo ;
   private boolean n769TNov_Descripcion ;
   private boolean n771TNov_Nro_Cambios ;
   private boolean n772TNov_Procedimiento ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n775TNov_UsuarioCrea ;
   private boolean n777TNov_UsuarioModifica ;
   private boolean n776TNov_FechaCrea ;
   private boolean n778TNov_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n779TNov_Rol_Descripcion ;
   private String Z775TNov_UsuarioCrea ;
   private String Z777TNov_UsuarioModifica ;
   private String Z769TNov_Descripcion ;
   private String Z770TNov_Tipo ;
   private String Z772TNov_Procedimiento ;
   private String Z774TNov_Nombre_Campo ;
   private String Z813TNov_IngresoMasivo ;
   private String Z839TNov_ObligaSoporte ;
   private String A770TNov_Tipo ;
   private String A813TNov_IngresoMasivo ;
   private String A839TNov_ObligaSoporte ;
   private String A769TNov_Descripcion ;
   private String A772TNov_Procedimiento ;
   private String A774TNov_Nombre_Campo ;
   private String A779TNov_Rol_Descripcion ;
   private String A775TNov_UsuarioCrea ;
   private String A777TNov_UsuarioModifica ;
   private String AV12Usuario ;
   private String Z779TNov_Rol_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Gridalm_tipo_novedad_rolesContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_tipo_novedad_rolesRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_tipo_novedad_rolesColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbTNov_IngresoMasivo ;
   private HTMLChoice cmbTNov_ObligaSoporte ;
   private HTMLChoice cmbTNov_Estado ;
   private IDataStoreProvider pr_default ;
   private int[] T000P7_A104TNov_Codigo ;
   private boolean[] T000P7_n104TNov_Codigo ;
   private String[] T000P7_A775TNov_UsuarioCrea ;
   private boolean[] T000P7_n775TNov_UsuarioCrea ;
   private String[] T000P7_A777TNov_UsuarioModifica ;
   private boolean[] T000P7_n777TNov_UsuarioModifica ;
   private java.util.Date[] T000P7_A776TNov_FechaCrea ;
   private boolean[] T000P7_n776TNov_FechaCrea ;
   private java.util.Date[] T000P7_A778TNov_FechaModifica ;
   private boolean[] T000P7_n778TNov_FechaModifica ;
   private String[] T000P7_A769TNov_Descripcion ;
   private boolean[] T000P7_n769TNov_Descripcion ;
   private String[] T000P7_A770TNov_Tipo ;
   private boolean[] T000P7_n770TNov_Tipo ;
   private short[] T000P7_A771TNov_Nro_Cambios ;
   private boolean[] T000P7_n771TNov_Nro_Cambios ;
   private String[] T000P7_A772TNov_Procedimiento ;
   private boolean[] T000P7_n772TNov_Procedimiento ;
   private String[] T000P7_A774TNov_Nombre_Campo ;
   private boolean[] T000P7_n774TNov_Nombre_Campo ;
   private String[] T000P7_A813TNov_IngresoMasivo ;
   private boolean[] T000P7_n813TNov_IngresoMasivo ;
   private String[] T000P7_A773TNov_Estado ;
   private boolean[] T000P7_n773TNov_Estado ;
   private String[] T000P7_A839TNov_ObligaSoporte ;
   private boolean[] T000P7_n839TNov_ObligaSoporte ;
   private int[] T000P8_A104TNov_Codigo ;
   private boolean[] T000P8_n104TNov_Codigo ;
   private int[] T000P6_A104TNov_Codigo ;
   private boolean[] T000P6_n104TNov_Codigo ;
   private String[] T000P6_A775TNov_UsuarioCrea ;
   private boolean[] T000P6_n775TNov_UsuarioCrea ;
   private String[] T000P6_A777TNov_UsuarioModifica ;
   private boolean[] T000P6_n777TNov_UsuarioModifica ;
   private java.util.Date[] T000P6_A776TNov_FechaCrea ;
   private boolean[] T000P6_n776TNov_FechaCrea ;
   private java.util.Date[] T000P6_A778TNov_FechaModifica ;
   private boolean[] T000P6_n778TNov_FechaModifica ;
   private String[] T000P6_A769TNov_Descripcion ;
   private boolean[] T000P6_n769TNov_Descripcion ;
   private String[] T000P6_A770TNov_Tipo ;
   private boolean[] T000P6_n770TNov_Tipo ;
   private short[] T000P6_A771TNov_Nro_Cambios ;
   private boolean[] T000P6_n771TNov_Nro_Cambios ;
   private String[] T000P6_A772TNov_Procedimiento ;
   private boolean[] T000P6_n772TNov_Procedimiento ;
   private String[] T000P6_A774TNov_Nombre_Campo ;
   private boolean[] T000P6_n774TNov_Nombre_Campo ;
   private String[] T000P6_A813TNov_IngresoMasivo ;
   private boolean[] T000P6_n813TNov_IngresoMasivo ;
   private String[] T000P6_A773TNov_Estado ;
   private boolean[] T000P6_n773TNov_Estado ;
   private String[] T000P6_A839TNov_ObligaSoporte ;
   private boolean[] T000P6_n839TNov_ObligaSoporte ;
   private int[] T000P9_A104TNov_Codigo ;
   private boolean[] T000P9_n104TNov_Codigo ;
   private int[] T000P10_A104TNov_Codigo ;
   private boolean[] T000P10_n104TNov_Codigo ;
   private int[] T000P5_A104TNov_Codigo ;
   private boolean[] T000P5_n104TNov_Codigo ;
   private String[] T000P5_A775TNov_UsuarioCrea ;
   private boolean[] T000P5_n775TNov_UsuarioCrea ;
   private String[] T000P5_A777TNov_UsuarioModifica ;
   private boolean[] T000P5_n777TNov_UsuarioModifica ;
   private java.util.Date[] T000P5_A776TNov_FechaCrea ;
   private boolean[] T000P5_n776TNov_FechaCrea ;
   private java.util.Date[] T000P5_A778TNov_FechaModifica ;
   private boolean[] T000P5_n778TNov_FechaModifica ;
   private String[] T000P5_A769TNov_Descripcion ;
   private boolean[] T000P5_n769TNov_Descripcion ;
   private String[] T000P5_A770TNov_Tipo ;
   private boolean[] T000P5_n770TNov_Tipo ;
   private short[] T000P5_A771TNov_Nro_Cambios ;
   private boolean[] T000P5_n771TNov_Nro_Cambios ;
   private String[] T000P5_A772TNov_Procedimiento ;
   private boolean[] T000P5_n772TNov_Procedimiento ;
   private String[] T000P5_A774TNov_Nombre_Campo ;
   private boolean[] T000P5_n774TNov_Nombre_Campo ;
   private String[] T000P5_A813TNov_IngresoMasivo ;
   private boolean[] T000P5_n813TNov_IngresoMasivo ;
   private String[] T000P5_A773TNov_Estado ;
   private boolean[] T000P5_n773TNov_Estado ;
   private String[] T000P5_A839TNov_ObligaSoporte ;
   private boolean[] T000P5_n839TNov_ObligaSoporte ;
   private long[] T000P14_A106Nove_Identificador ;
   private int[] T000P15_A104TNov_Codigo ;
   private boolean[] T000P15_n104TNov_Codigo ;
   private int[] T000P16_A104TNov_Codigo ;
   private boolean[] T000P16_n104TNov_Codigo ;
   private String[] T000P16_A779TNov_Rol_Descripcion ;
   private boolean[] T000P16_n779TNov_Rol_Descripcion ;
   private long[] T000P16_A105TNov_Rol_Id ;
   private String[] T000P4_A779TNov_Rol_Descripcion ;
   private boolean[] T000P4_n779TNov_Rol_Descripcion ;
   private String[] T000P17_A779TNov_Rol_Descripcion ;
   private boolean[] T000P17_n779TNov_Rol_Descripcion ;
   private int[] T000P18_A104TNov_Codigo ;
   private boolean[] T000P18_n104TNov_Codigo ;
   private long[] T000P18_A105TNov_Rol_Id ;
   private int[] T000P3_A104TNov_Codigo ;
   private boolean[] T000P3_n104TNov_Codigo ;
   private long[] T000P3_A105TNov_Rol_Id ;
   private int[] T000P2_A104TNov_Codigo ;
   private boolean[] T000P2_n104TNov_Codigo ;
   private long[] T000P2_A105TNov_Rol_Id ;
   private String[] T000P21_A779TNov_Rol_Descripcion ;
   private boolean[] T000P21_n779TNov_Rol_Descripcion ;
   private int[] T000P22_A104TNov_Codigo ;
   private boolean[] T000P22_n104TNov_Codigo ;
   private long[] T000P22_A105TNov_Rol_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_tipo_novedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000P2", "SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Codigo = ? AND TNov_Rol_Id = ?  FOR UPDATE OF TNov_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P3", "SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Codigo = ? AND TNov_Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P4", "SELECT Rol_Descripcion AS TNov_Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P5", "SELECT TNov_Codigo, TNov_UsuarioCrea, TNov_UsuarioModifica, TNov_FechaCrea, TNov_FechaModifica, TNov_Descripcion, TNov_Tipo, TNov_Nro_Cambios, TNov_Procedimiento, TNov_Nombre_Campo, TNov_IngresoMasivo, TNov_Estado, TNov_ObligaSoporte FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ?  FOR UPDATE OF TNov_UsuarioCrea, TNov_UsuarioModifica, TNov_FechaCrea, TNov_FechaModifica, TNov_Descripcion, TNov_Tipo, TNov_Nro_Cambios, TNov_Procedimiento, TNov_Nombre_Campo, TNov_IngresoMasivo, TNov_Estado, TNov_ObligaSoporte NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P6", "SELECT TNov_Codigo, TNov_UsuarioCrea, TNov_UsuarioModifica, TNov_FechaCrea, TNov_FechaModifica, TNov_Descripcion, TNov_Tipo, TNov_Nro_Cambios, TNov_Procedimiento, TNov_Nombre_Campo, TNov_IngresoMasivo, TNov_Estado, TNov_ObligaSoporte FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P7", "SELECT /*+ FIRST_ROWS(100) */ TM1.TNov_Codigo, TM1.TNov_UsuarioCrea, TM1.TNov_UsuarioModifica, TM1.TNov_FechaCrea, TM1.TNov_FechaModifica, TM1.TNov_Descripcion, TM1.TNov_Tipo, TM1.TNov_Nro_Cambios, TM1.TNov_Procedimiento, TM1.TNov_Nombre_Campo, TM1.TNov_IngresoMasivo, TM1.TNov_Estado, TM1.TNov_ObligaSoporte FROM ALM_TIPO_NOVEDAD TM1 WHERE TM1.TNov_Codigo = ? ORDER BY TM1.TNov_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000P8", "SELECT /*+ FIRST_ROWS(1) */ TNov_Codigo FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TNov_Codigo FROM ALM_TIPO_NOVEDAD WHERE ( TNov_Codigo > ?) ORDER BY TNov_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000P10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TNov_Codigo FROM ALM_TIPO_NOVEDAD WHERE ( TNov_Codigo < ?) ORDER BY TNov_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000P11", "INSERT INTO ALM_TIPO_NOVEDAD(TNov_Codigo, TNov_UsuarioCrea, TNov_UsuarioModifica, TNov_FechaCrea, TNov_FechaModifica, TNov_Descripcion, TNov_Tipo, TNov_Nro_Cambios, TNov_Procedimiento, TNov_Nombre_Campo, TNov_IngresoMasivo, TNov_Estado, TNov_ObligaSoporte) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_NOVEDAD")
         ,new UpdateCursor("T000P12", "UPDATE ALM_TIPO_NOVEDAD SET TNov_UsuarioCrea=?, TNov_UsuarioModifica=?, TNov_FechaCrea=?, TNov_FechaModifica=?, TNov_Descripcion=?, TNov_Tipo=?, TNov_Nro_Cambios=?, TNov_Procedimiento=?, TNov_Nombre_Campo=?, TNov_IngresoMasivo=?, TNov_Estado=?, TNov_ObligaSoporte=?  WHERE TNov_Codigo = ?", GX_NOMASK, "ALM_TIPO_NOVEDAD")
         ,new UpdateCursor("T000P13", "DELETE FROM ALM_TIPO_NOVEDAD  WHERE TNov_Codigo = ?", GX_NOMASK, "ALM_TIPO_NOVEDAD")
         ,new ForEachCursor("T000P14", "SELECT * FROM (SELECT Nove_Identificador FROM ALM_NOVEDAD WHERE TNov_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000P15", "SELECT /*+ FIRST_ROWS(100) */ TNov_Codigo FROM ALM_TIPO_NOVEDAD ORDER BY TNov_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000P16", "SELECT T1.TNov_Codigo, T2.Rol_Descripcion AS TNov_Rol_Descripcion, T1.TNov_Rol_Id AS TNov_Rol_Id FROM (ALM_TIPO_NOVEDADROLES T1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = T1.TNov_Rol_Id) WHERE T1.TNov_Codigo = ? and T1.TNov_Rol_Id = ? ORDER BY T1.TNov_Codigo, T1.TNov_Rol_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000P17", "SELECT Rol_Descripcion AS TNov_Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P18", "SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Codigo = ? AND TNov_Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000P19", "INSERT INTO ALM_TIPO_NOVEDADROLES(TNov_Codigo, TNov_Rol_Id) VALUES(?, ?)", GX_NOMASK, "ALM_TIPO_NOVEDADROLES")
         ,new UpdateCursor("T000P20", "DELETE FROM ALM_TIPO_NOVEDADROLES  WHERE TNov_Codigo = ? AND TNov_Rol_Id = ?", GX_NOMASK, "ALM_TIPO_NOVEDADROLES")
         ,new ForEachCursor("T000P21", "SELECT Rol_Descripcion AS TNov_Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P22", "SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Codigo = ? ORDER BY TNov_Codigo, TNov_Rol_Id ",true, GX_NOMASK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 60);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               return;
            case 10 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 60);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
      }
   }

}

