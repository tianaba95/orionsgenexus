/*
               File: alm_restricciones_impl
        Description: Restricciones
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:9.96
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

public final  class alm_restricciones_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A61Mbod_TipoMovCodigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A61Mbod_TipoMovCodigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A431Mbod_TipoElementoCod = GXutil.lval( httpContext.GetNextPar( )) ;
         n431Mbod_TipoElementoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A431Mbod_TipoElementoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A62Mbod_RegionId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A62Mbod_RegionId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A63Mbod_CentCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A63Mbod_CentCostoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A64Mbod_BodOrigenCodigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A64Mbod_BodOrigenCodigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A65Mbod_BodDestinoCodigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A65Mbod_BodDestinoCodigo) ;
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
            AV17Mbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_Id", GXutil.ltrim( GXutil.str( AV17Mbod_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMBOD_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Mbod_Id), "ZZZZZZZZZZ9")));
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
      cmbMbod_AlmModOrigen.setName( "MBOD_ALMMODORIGEN" );
      cmbMbod_AlmModOrigen.setWebtags( "" );
      cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
      cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
      cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
      if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
      {
         A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
      }
      cmbMbod_AlmModDestino.setName( "MBOD_ALMMODDESTINO" );
      cmbMbod_AlmModDestino.setWebtags( "" );
      cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
      cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
      cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
      if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
      {
         A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
      }
      cmbMbod_Estado.setName( "MBOD_ESTADO" );
      cmbMbod_Estado.setWebtags( "" );
      cmbMbod_Estado.addItem("A", "Activo", (short)(0));
      cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbMbod_Estado.getItemCount() > 0 )
      {
         A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
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
         Form.getMeta().addItem("description", "Restricciones", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_restricciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_restricciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_restricciones_impl.class ));
   }

   public alm_restricciones_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMbod_AlmModOrigen = new HTMLChoice();
      cmbMbod_AlmModDestino = new HTMLChoice();
      cmbMbod_Estado = new HTMLChoice();
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
      if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
      {
         A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
      }
      if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
      {
         A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
         httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
      }
      if ( cmbMbod_Estado.getItemCount() > 0 )
      {
         A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Restricciones", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ",", "")), ((edtMbod_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoMovCodigo_Internalname, "Tipo Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoMovCodigo_Internalname, A61Mbod_TipoMovCodigo, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoMovCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_TipoMovCodigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_61_Internalname, sImgUrl, imgprompt_61_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_61_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoMovDescrip_Internalname, "Tipo Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoMovDescrip_Internalname, A428Mbod_TipoMovDescrip, GXutil.rtrim( localUtil.format( A428Mbod_TipoMovDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoMovDescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_TipoMovDescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoElementoCod_Internalname, "Elemento Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoElementoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ",", "")), ((edtMbod_TipoElementoCod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoElementoCod_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_TipoElementoCod_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_TipoElementoDesc_Internalname, "Elemento Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_TipoElementoDesc_Internalname, A432Mbod_TipoElementoDesc, GXutil.rtrim( localUtil.format( A432Mbod_TipoElementoDesc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_TipoElementoDesc_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_TipoElementoDesc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionId_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_RegionId_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONES.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_62_Internalname, sImgUrl, imgprompt_62_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_62_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionCodigo_Internalname, "Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtMbod_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_RegionDescripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_RegionDescripcion_Internalname, A427Mbod_RegionDescripcion, GXutil.rtrim( localUtil.format( A427Mbod_RegionDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_RegionDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentCostoId_Internalname, "Costo Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentCostoId_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_CentCostoId_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_RESTRICCIONES.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_63_Internalname, sImgUrl, imgprompt_63_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_63_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentCostoCodigo_Internalname, "Costo Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentCostoCodigo_Internalname, A429Mbod_CentCostoCodigo, GXutil.rtrim( localUtil.format( A429Mbod_CentCostoCodigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentCostoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_CentCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_CentroCostoDescrip_Internalname, "Costo Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_CentroCostoDescrip_Internalname, A430Mbod_CentroCostoDescrip, GXutil.rtrim( localUtil.format( A430Mbod_CentroCostoDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_CentroCostoDescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_CentroCostoDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_AlmModOrigen.getInternalname(), "Origen", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_AlmModOrigen, cmbMbod_AlmModOrigen.getInternalname(), GXutil.rtrim( A364Mbod_AlmModOrigen), 1, cmbMbod_AlmModOrigen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbMbod_AlmModOrigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "", true, "HLP_ALM_RESTRICCIONES.htm");
         cmbMbod_AlmModOrigen.setValue( GXutil.rtrim( A364Mbod_AlmModOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModOrigen.getInternalname(), "Values", cmbMbod_AlmModOrigen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_AlmOrigenCodigo_Internalname, "Almacen Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_AlmOrigenCodigo_Internalname, A342Mbod_AlmOrigenCodigo, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_AlmOrigenCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_AlmOrigenCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodOrigenCodigo_Internalname, "Bodega Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodOrigenCodigo_Internalname, A64Mbod_BodOrigenCodigo, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodOrigenCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_BodOrigenCodigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_64_Internalname, sImgUrl, imgprompt_64_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_64_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodOrigenDescripcion_Internalname, "Bodega Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodOrigenDescripcion_Internalname, A341Mbod_BodOrigenDescripcion, GXutil.rtrim( localUtil.format( A341Mbod_BodOrigenDescripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodOrigenDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_BodOrigenDescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_AlmModDestino.getInternalname(), "Destino", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_AlmModDestino, cmbMbod_AlmModDestino.getInternalname(), GXutil.rtrim( A368Mbod_AlmModDestino), 1, cmbMbod_AlmModDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbMbod_AlmModDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "", true, "HLP_ALM_RESTRICCIONES.htm");
         cmbMbod_AlmModDestino.setValue( GXutil.rtrim( A368Mbod_AlmModDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModDestino.getInternalname(), "Values", cmbMbod_AlmModDestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_AlmDestinoCodigo_Internalname, "Almacen Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_AlmDestinoCodigo_Internalname, A345Mbod_AlmDestinoCodigo, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_AlmDestinoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_AlmDestinoCodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodDestinoCodigo_Internalname, "Bodega Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodDestinoCodigo_Internalname, A65Mbod_BodDestinoCodigo, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodDestinoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_BodDestinoCodigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_RESTRICCIONES.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_65_Internalname, sImgUrl, imgprompt_65_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_65_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_BodDestinoDescripcion_Internalname, "Bodega Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_BodDestinoDescripcion_Internalname, A347Mbod_BodDestinoDescripcion, GXutil.rtrim( localUtil.format( A347Mbod_BodDestinoDescripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_BodDestinoDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_BodDestinoDescripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbMbod_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMbod_Estado, cmbMbod_Estado.getInternalname(), GXutil.rtrim( A434Mbod_Estado), 1, cmbMbod_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMbod_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "", true, "HLP_ALM_RESTRICCIONES.htm");
         cmbMbod_Estado.setValue( GXutil.rtrim( A434Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_Estado.getInternalname(), "Values", cmbMbod_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_FechaCrea_Internalname, "Creación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtMbod_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_FechaCrea_Internalname, localUtil.ttoc( A433Mbod_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A433Mbod_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_FechaCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtMbod_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMbod_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_UsuarioCrea_Internalname, "Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_UsuarioCrea_Internalname, A359Mbod_UsuarioCrea, GXutil.rtrim( localUtil.format( A359Mbod_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_UsuarioCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_FechaModifica_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtMbod_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_FechaModifica_Internalname, localUtil.ttoc( A362Mbod_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A362Mbod_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtMbod_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMbod_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMbod_UsuarioModifica_Internalname, "Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMbod_UsuarioModifica_Internalname, A361Mbod_UsuarioModifica, GXutil.rtrim( localUtil.format( A361Mbod_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMbod_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtMbod_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_RESTRICCIONES.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_RESTRICCIONES.htm");
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
      e11062 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A60Mbod_Id = localUtil.ctol( httpContext.cgiGet( edtMbod_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
            A61Mbod_TipoMovCodigo = httpContext.cgiGet( edtMbod_TipoMovCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
            A428Mbod_TipoMovDescrip = httpContext.cgiGet( edtMbod_TipoMovDescrip_Internalname) ;
            n428Mbod_TipoMovDescrip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
            A431Mbod_TipoElementoCod = localUtil.ctol( httpContext.cgiGet( edtMbod_TipoElementoCod_Internalname), ",", ".") ;
            n431Mbod_TipoElementoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
            A432Mbod_TipoElementoDesc = GXutil.upper( httpContext.cgiGet( edtMbod_TipoElementoDesc_Internalname)) ;
            n432Mbod_TipoElementoDesc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MBOD_REGIONID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMbod_RegionId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A62Mbod_RegionId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
            }
            else
            {
               A62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
            }
            A426Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtMbod_RegionCodigo_Internalname), ",", ".")) ;
            n426Mbod_RegionCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
            A427Mbod_RegionDescripcion = httpContext.cgiGet( edtMbod_RegionDescripcion_Internalname) ;
            n427Mbod_RegionDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MBOD_CENTCOSTOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMbod_CentCostoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A63Mbod_CentCostoId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
            }
            else
            {
               A63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
            }
            A429Mbod_CentCostoCodigo = httpContext.cgiGet( edtMbod_CentCostoCodigo_Internalname) ;
            n429Mbod_CentCostoCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
            A430Mbod_CentroCostoDescrip = httpContext.cgiGet( edtMbod_CentroCostoDescrip_Internalname) ;
            n430Mbod_CentroCostoDescrip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
            cmbMbod_AlmModOrigen.setValue( httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) );
            A364Mbod_AlmModOrigen = httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
            A342Mbod_AlmOrigenCodigo = httpContext.cgiGet( edtMbod_AlmOrigenCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
            A64Mbod_BodOrigenCodigo = httpContext.cgiGet( edtMbod_BodOrigenCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
            A341Mbod_BodOrigenDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodOrigenDescripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A341Mbod_BodOrigenDescripcion", A341Mbod_BodOrigenDescripcion);
            cmbMbod_AlmModDestino.setValue( httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) );
            A368Mbod_AlmModDestino = httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
            A345Mbod_AlmDestinoCodigo = httpContext.cgiGet( edtMbod_AlmDestinoCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
            A65Mbod_BodDestinoCodigo = httpContext.cgiGet( edtMbod_BodDestinoCodigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
            A347Mbod_BodDestinoDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodDestinoDescripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A347Mbod_BodDestinoDescripcion", A347Mbod_BodDestinoDescripcion);
            cmbMbod_Estado.setValue( httpContext.cgiGet( cmbMbod_Estado.getInternalname()) );
            A434Mbod_Estado = httpContext.cgiGet( cmbMbod_Estado.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMbod_FechaCrea_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MBOD_FECHACREA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMbod_FechaCrea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A433Mbod_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaCrea_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            }
            A359Mbod_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioCrea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMbod_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MBOD_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMbod_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A362Mbod_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtMbod_FechaModifica_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            A361Mbod_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtMbod_UsuarioModifica_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
            /* Read saved values. */
            Z60Mbod_Id = localUtil.ctol( httpContext.cgiGet( "Z60Mbod_Id"), ",", ".") ;
            Z433Mbod_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z433Mbod_FechaCrea"), 0) ;
            Z359Mbod_UsuarioCrea = httpContext.cgiGet( "Z359Mbod_UsuarioCrea") ;
            Z362Mbod_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z362Mbod_FechaModifica"), 0) ;
            Z361Mbod_UsuarioModifica = httpContext.cgiGet( "Z361Mbod_UsuarioModifica") ;
            Z364Mbod_AlmModOrigen = httpContext.cgiGet( "Z364Mbod_AlmModOrigen") ;
            Z342Mbod_AlmOrigenCodigo = httpContext.cgiGet( "Z342Mbod_AlmOrigenCodigo") ;
            Z368Mbod_AlmModDestino = httpContext.cgiGet( "Z368Mbod_AlmModDestino") ;
            Z345Mbod_AlmDestinoCodigo = httpContext.cgiGet( "Z345Mbod_AlmDestinoCodigo") ;
            Z434Mbod_Estado = httpContext.cgiGet( "Z434Mbod_Estado") ;
            Z61Mbod_TipoMovCodigo = httpContext.cgiGet( "Z61Mbod_TipoMovCodigo") ;
            Z62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( "Z62Mbod_RegionId"), ",", ".") ;
            Z63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( "Z63Mbod_CentCostoId"), ",", ".") ;
            Z64Mbod_BodOrigenCodigo = httpContext.cgiGet( "Z64Mbod_BodOrigenCodigo") ;
            Z65Mbod_BodDestinoCodigo = httpContext.cgiGet( "Z65Mbod_BodDestinoCodigo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N61Mbod_TipoMovCodigo = httpContext.cgiGet( "N61Mbod_TipoMovCodigo") ;
            N62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( "N62Mbod_RegionId"), ",", ".") ;
            N63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( "N63Mbod_CentCostoId"), ",", ".") ;
            N64Mbod_BodOrigenCodigo = httpContext.cgiGet( "N64Mbod_BodOrigenCodigo") ;
            N65Mbod_BodDestinoCodigo = httpContext.cgiGet( "N65Mbod_BodDestinoCodigo") ;
            AV17Mbod_Id = localUtil.ctol( httpContext.cgiGet( "vMBOD_ID"), ",", ".") ;
            AV18Insert_Mbod_TipoMovCodigo = httpContext.cgiGet( "vINSERT_MBOD_TIPOMOVCODIGO") ;
            AV19Insert_Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( "vINSERT_MBOD_REGIONID"), ",", ".") ;
            AV20Insert_Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( "vINSERT_MBOD_CENTCOSTOID"), ",", ".") ;
            AV14Insert_Mbod_BodOrigenCodigo = httpContext.cgiGet( "vINSERT_MBOD_BODORIGENCODIGO") ;
            AV15Insert_Mbod_BodDestinoCodigo = httpContext.cgiGet( "vINSERT_MBOD_BODDESTINOCODIGO") ;
            AV21Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV22Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_RESTRICCIONES" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A60Mbod_Id != Z60Mbod_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_restricciones:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A60Mbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
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
                  sMode8 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode8 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound8 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_060( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MBOD_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMbod_Id_Internalname ;
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
                        e11062 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12062 ();
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
         e12062 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll068( ) ;
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
         disableAttributes068( ) ;
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

   public void confirm_060( )
   {
      beforeValidate068( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls068( ) ;
         }
         else
         {
            checkExtendedTable068( ) ;
            closeExtendedTableCursors068( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption060( )
   {
   }

   public void e11062( )
   {
      /* Start Routine */
      AV21Usuario = AV13WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usuario", AV21Usuario);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV22Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV22Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      AV18Insert_Mbod_TipoMovCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_Mbod_TipoMovCodigo", AV18Insert_Mbod_TipoMovCodigo);
      AV19Insert_Mbod_RegionId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_Mbod_RegionId", GXutil.ltrim( GXutil.str( AV19Insert_Mbod_RegionId, 11, 0)));
      AV20Insert_Mbod_CentCostoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Insert_Mbod_CentCostoId", GXutil.ltrim( GXutil.str( AV20Insert_Mbod_CentCostoId, 11, 0)));
      AV14Insert_Mbod_BodOrigenCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_Mbod_BodOrigenCodigo", AV14Insert_Mbod_BodOrigenCodigo);
      AV15Insert_Mbod_BodDestinoCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Mbod_BodDestinoCodigo", AV15Insert_Mbod_BodDestinoCodigo);
      if ( ( GXutil.strcmp(AV12TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV22Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV23GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrim( GXutil.str( AV23GXV1, 8, 0)));
         while ( AV23GXV1 <= AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV23GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Mbod_TipoMovCodigo") == 0 )
            {
               AV18Insert_Mbod_TipoMovCodigo = AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_Mbod_TipoMovCodigo", AV18Insert_Mbod_TipoMovCodigo);
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Mbod_RegionId") == 0 )
            {
               AV19Insert_Mbod_RegionId = GXutil.lval( AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_Mbod_RegionId", GXutil.ltrim( GXutil.str( AV19Insert_Mbod_RegionId, 11, 0)));
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Mbod_CentCostoId") == 0 )
            {
               AV20Insert_Mbod_CentCostoId = GXutil.lval( AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Insert_Mbod_CentCostoId", GXutil.ltrim( GXutil.str( AV20Insert_Mbod_CentCostoId, 11, 0)));
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Mbod_BodOrigenCodigo") == 0 )
            {
               AV14Insert_Mbod_BodOrigenCodigo = AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_Mbod_BodOrigenCodigo", AV14Insert_Mbod_BodOrigenCodigo);
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Mbod_BodDestinoCodigo") == 0 )
            {
               AV15Insert_Mbod_BodDestinoCodigo = AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Mbod_BodDestinoCodigo", AV15Insert_Mbod_BodDestinoCodigo);
            }
            AV23GXV1 = (int)(AV23GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrim( GXutil.str( AV23GXV1, 8, 0)));
         }
      }
   }

   public void e12062( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV12TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_restricciones") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm068( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z433Mbod_FechaCrea = T00063_A433Mbod_FechaCrea[0] ;
            Z359Mbod_UsuarioCrea = T00063_A359Mbod_UsuarioCrea[0] ;
            Z362Mbod_FechaModifica = T00063_A362Mbod_FechaModifica[0] ;
            Z361Mbod_UsuarioModifica = T00063_A361Mbod_UsuarioModifica[0] ;
            Z364Mbod_AlmModOrigen = T00063_A364Mbod_AlmModOrigen[0] ;
            Z342Mbod_AlmOrigenCodigo = T00063_A342Mbod_AlmOrigenCodigo[0] ;
            Z368Mbod_AlmModDestino = T00063_A368Mbod_AlmModDestino[0] ;
            Z345Mbod_AlmDestinoCodigo = T00063_A345Mbod_AlmDestinoCodigo[0] ;
            Z434Mbod_Estado = T00063_A434Mbod_Estado[0] ;
            Z61Mbod_TipoMovCodigo = T00063_A61Mbod_TipoMovCodigo[0] ;
            Z62Mbod_RegionId = T00063_A62Mbod_RegionId[0] ;
            Z63Mbod_CentCostoId = T00063_A63Mbod_CentCostoId[0] ;
            Z64Mbod_BodOrigenCodigo = T00063_A64Mbod_BodOrigenCodigo[0] ;
            Z65Mbod_BodDestinoCodigo = T00063_A65Mbod_BodDestinoCodigo[0] ;
         }
         else
         {
            Z433Mbod_FechaCrea = A433Mbod_FechaCrea ;
            Z359Mbod_UsuarioCrea = A359Mbod_UsuarioCrea ;
            Z362Mbod_FechaModifica = A362Mbod_FechaModifica ;
            Z361Mbod_UsuarioModifica = A361Mbod_UsuarioModifica ;
            Z364Mbod_AlmModOrigen = A364Mbod_AlmModOrigen ;
            Z342Mbod_AlmOrigenCodigo = A342Mbod_AlmOrigenCodigo ;
            Z368Mbod_AlmModDestino = A368Mbod_AlmModDestino ;
            Z345Mbod_AlmDestinoCodigo = A345Mbod_AlmDestinoCodigo ;
            Z434Mbod_Estado = A434Mbod_Estado ;
            Z61Mbod_TipoMovCodigo = A61Mbod_TipoMovCodigo ;
            Z62Mbod_RegionId = A62Mbod_RegionId ;
            Z63Mbod_CentCostoId = A63Mbod_CentCostoId ;
            Z64Mbod_BodOrigenCodigo = A64Mbod_BodOrigenCodigo ;
            Z65Mbod_BodDestinoCodigo = A65Mbod_BodDestinoCodigo ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z60Mbod_Id = A60Mbod_Id ;
         Z433Mbod_FechaCrea = A433Mbod_FechaCrea ;
         Z359Mbod_UsuarioCrea = A359Mbod_UsuarioCrea ;
         Z362Mbod_FechaModifica = A362Mbod_FechaModifica ;
         Z361Mbod_UsuarioModifica = A361Mbod_UsuarioModifica ;
         Z364Mbod_AlmModOrigen = A364Mbod_AlmModOrigen ;
         Z342Mbod_AlmOrigenCodigo = A342Mbod_AlmOrigenCodigo ;
         Z368Mbod_AlmModDestino = A368Mbod_AlmModDestino ;
         Z345Mbod_AlmDestinoCodigo = A345Mbod_AlmDestinoCodigo ;
         Z434Mbod_Estado = A434Mbod_Estado ;
         Z61Mbod_TipoMovCodigo = A61Mbod_TipoMovCodigo ;
         Z62Mbod_RegionId = A62Mbod_RegionId ;
         Z63Mbod_CentCostoId = A63Mbod_CentCostoId ;
         Z64Mbod_BodOrigenCodigo = A64Mbod_BodOrigenCodigo ;
         Z65Mbod_BodDestinoCodigo = A65Mbod_BodDestinoCodigo ;
         Z428Mbod_TipoMovDescrip = A428Mbod_TipoMovDescrip ;
         Z431Mbod_TipoElementoCod = A431Mbod_TipoElementoCod ;
         Z432Mbod_TipoElementoDesc = A432Mbod_TipoElementoDesc ;
         Z426Mbod_RegionCodigo = A426Mbod_RegionCodigo ;
         Z427Mbod_RegionDescripcion = A427Mbod_RegionDescripcion ;
         Z429Mbod_CentCostoCodigo = A429Mbod_CentCostoCodigo ;
         Z430Mbod_CentroCostoDescrip = A430Mbod_CentroCostoDescrip ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMbod_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_Id_Enabled, 5, 0)), true);
      imgprompt_61_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00v0"+"',["+"{Ctrl:gx.dom.el('"+"MBOD_TIPOMOVCODIGO"+"'), id:'"+"MBOD_TIPOMOVCODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_62_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00i0"+"',["+"{Ctrl:gx.dom.el('"+"MBOD_REGIONID"+"'), id:'"+"MBOD_REGIONID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_63_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"MBOD_CENTCOSTOID"+"'), id:'"+"MBOD_CENTCOSTOID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_64_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00t0"+"',["+"{Ctrl:gx.dom.el('"+"MBOD_BODORIGENCODIGO"+"'), id:'"+"MBOD_BODORIGENCODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_65_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00t0"+"',["+"{Ctrl:gx.dom.el('"+"MBOD_BODDESTINOCODIGO"+"'), id:'"+"MBOD_BODDESTINOCODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtMbod_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV17Mbod_Id) )
      {
         A60Mbod_Id = AV17Mbod_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_Mbod_TipoMovCodigo)==0) )
      {
         edtMbod_TipoMovCodigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoMovCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoMovCodigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtMbod_TipoMovCodigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoMovCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoMovCodigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_Mbod_RegionId) )
      {
         edtMbod_RegionId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_RegionId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_RegionId_Enabled, 5, 0)), true);
      }
      else
      {
         edtMbod_RegionId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_RegionId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_RegionId_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV20Insert_Mbod_CentCostoId) )
      {
         edtMbod_CentCostoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_CentCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_CentCostoId_Enabled, 5, 0)), true);
      }
      else
      {
         edtMbod_CentCostoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_CentCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_CentCostoId_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_Mbod_BodOrigenCodigo)==0) )
      {
         edtMbod_BodOrigenCodigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodOrigenCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodOrigenCodigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtMbod_BodOrigenCodigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodOrigenCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodOrigenCodigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_Mbod_BodDestinoCodigo)==0) )
      {
         edtMbod_BodDestinoCodigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodDestinoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodDestinoCodigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtMbod_BodDestinoCodigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodDestinoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodDestinoCodigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_Mbod_BodDestinoCodigo)==0) )
      {
         A65Mbod_BodDestinoCodigo = AV15Insert_Mbod_BodDestinoCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_Mbod_BodOrigenCodigo)==0) )
      {
         A64Mbod_BodOrigenCodigo = AV14Insert_Mbod_BodOrigenCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV20Insert_Mbod_CentCostoId) )
      {
         A63Mbod_CentCostoId = AV20Insert_Mbod_CentCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_Mbod_RegionId) )
      {
         A62Mbod_RegionId = AV19Insert_Mbod_RegionId ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_Mbod_TipoMovCodigo)==0) )
      {
         A61Mbod_TipoMovCodigo = AV18Insert_Mbod_TipoMovCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
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
         AV22Pgmname = "ALM_RESTRICCIONES" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
         /* Using cursor T00068 */
         pr_default.execute(6, new Object[] {A65Mbod_BodDestinoCodigo});
         pr_default.close(6);
         /* Using cursor T00067 */
         pr_default.execute(5, new Object[] {A64Mbod_BodOrigenCodigo});
         pr_default.close(5);
         /* Using cursor T00066 */
         pr_default.execute(4, new Object[] {new Long(A63Mbod_CentCostoId)});
         A429Mbod_CentCostoCodigo = T00066_A429Mbod_CentCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
         n429Mbod_CentCostoCodigo = T00066_n429Mbod_CentCostoCodigo[0] ;
         A430Mbod_CentroCostoDescrip = T00066_A430Mbod_CentroCostoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
         n430Mbod_CentroCostoDescrip = T00066_n430Mbod_CentroCostoDescrip[0] ;
         pr_default.close(4);
         /* Using cursor T00065 */
         pr_default.execute(3, new Object[] {new Long(A62Mbod_RegionId)});
         A426Mbod_RegionCodigo = T00065_A426Mbod_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
         n426Mbod_RegionCodigo = T00065_n426Mbod_RegionCodigo[0] ;
         A427Mbod_RegionDescripcion = T00065_A427Mbod_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
         n427Mbod_RegionDescripcion = T00065_n427Mbod_RegionDescripcion[0] ;
         pr_default.close(3);
         /* Using cursor T00064 */
         pr_default.execute(2, new Object[] {A61Mbod_TipoMovCodigo});
         A428Mbod_TipoMovDescrip = T00064_A428Mbod_TipoMovDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
         n428Mbod_TipoMovDescrip = T00064_n428Mbod_TipoMovDescrip[0] ;
         A431Mbod_TipoElementoCod = T00064_A431Mbod_TipoElementoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
         n431Mbod_TipoElementoCod = T00064_n431Mbod_TipoElementoCod[0] ;
         pr_default.close(2);
         /* Using cursor T00069 */
         pr_default.execute(7, new Object[] {new Boolean(n431Mbod_TipoElementoCod), new Long(A431Mbod_TipoElementoCod)});
         A432Mbod_TipoElementoDesc = T00069_A432Mbod_TipoElementoDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
         n432Mbod_TipoElementoDesc = T00069_n432Mbod_TipoElementoDesc[0] ;
         pr_default.close(7);
      }
   }

   public void load068( )
   {
      /* Using cursor T000610 */
      pr_default.execute(8, new Object[] {new Long(A60Mbod_Id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A433Mbod_FechaCrea = T000610_A433Mbod_FechaCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         A359Mbod_UsuarioCrea = T000610_A359Mbod_UsuarioCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
         A362Mbod_FechaModifica = T000610_A362Mbod_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A361Mbod_UsuarioModifica = T000610_A361Mbod_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
         A428Mbod_TipoMovDescrip = T000610_A428Mbod_TipoMovDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
         n428Mbod_TipoMovDescrip = T000610_n428Mbod_TipoMovDescrip[0] ;
         A432Mbod_TipoElementoDesc = T000610_A432Mbod_TipoElementoDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
         n432Mbod_TipoElementoDesc = T000610_n432Mbod_TipoElementoDesc[0] ;
         A426Mbod_RegionCodigo = T000610_A426Mbod_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
         n426Mbod_RegionCodigo = T000610_n426Mbod_RegionCodigo[0] ;
         A427Mbod_RegionDescripcion = T000610_A427Mbod_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
         n427Mbod_RegionDescripcion = T000610_n427Mbod_RegionDescripcion[0] ;
         A429Mbod_CentCostoCodigo = T000610_A429Mbod_CentCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
         n429Mbod_CentCostoCodigo = T000610_n429Mbod_CentCostoCodigo[0] ;
         A430Mbod_CentroCostoDescrip = T000610_A430Mbod_CentroCostoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
         n430Mbod_CentroCostoDescrip = T000610_n430Mbod_CentroCostoDescrip[0] ;
         A364Mbod_AlmModOrigen = T000610_A364Mbod_AlmModOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
         A342Mbod_AlmOrigenCodigo = T000610_A342Mbod_AlmOrigenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
         A368Mbod_AlmModDestino = T000610_A368Mbod_AlmModDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
         A345Mbod_AlmDestinoCodigo = T000610_A345Mbod_AlmDestinoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
         A434Mbod_Estado = T000610_A434Mbod_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
         A61Mbod_TipoMovCodigo = T000610_A61Mbod_TipoMovCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
         A62Mbod_RegionId = T000610_A62Mbod_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
         A63Mbod_CentCostoId = T000610_A63Mbod_CentCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
         A64Mbod_BodOrigenCodigo = T000610_A64Mbod_BodOrigenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
         A65Mbod_BodDestinoCodigo = T000610_A65Mbod_BodDestinoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
         A431Mbod_TipoElementoCod = T000610_A431Mbod_TipoElementoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
         n431Mbod_TipoElementoCod = T000610_n431Mbod_TipoElementoCod[0] ;
         zm068( -24) ;
      }
      pr_default.close(8);
      onLoadActions068( ) ;
   }

   public void onLoadActions068( )
   {
      AV22Pgmname = "ALM_RESTRICCIONES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      /* Using cursor T00067 */
      pr_default.execute(5, new Object[] {A64Mbod_BodOrigenCodigo});
      pr_default.close(5);
      /* Using cursor T00068 */
      pr_default.execute(6, new Object[] {A65Mbod_BodDestinoCodigo});
      pr_default.close(6);
   }

   public void checkExtendedTable068( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV22Pgmname = "ALM_RESTRICCIONES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      /* Using cursor T00064 */
      pr_default.execute(2, new Object[] {A61Mbod_TipoMovCodigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "MBOD_TIPOMOVCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A428Mbod_TipoMovDescrip = T00064_A428Mbod_TipoMovDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
      n428Mbod_TipoMovDescrip = T00064_n428Mbod_TipoMovDescrip[0] ;
      A431Mbod_TipoElementoCod = T00064_A431Mbod_TipoElementoCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
      n431Mbod_TipoElementoCod = T00064_n431Mbod_TipoElementoCod[0] ;
      pr_default.close(2);
      /* Using cursor T00069 */
      pr_default.execute(7, new Object[] {new Boolean(n431Mbod_TipoElementoCod), new Long(A431Mbod_TipoElementoCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A432Mbod_TipoElementoDesc = T00069_A432Mbod_TipoElementoDesc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
      n432Mbod_TipoElementoDesc = T00069_n432Mbod_TipoElementoDesc[0] ;
      pr_default.close(7);
      /* Using cursor T00065 */
      pr_default.execute(3, new Object[] {new Long(A62Mbod_RegionId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Region Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_REGIONID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_RegionId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A426Mbod_RegionCodigo = T00065_A426Mbod_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
      n426Mbod_RegionCodigo = T00065_n426Mbod_RegionCodigo[0] ;
      A427Mbod_RegionDescripcion = T00065_A427Mbod_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
      n427Mbod_RegionDescripcion = T00065_n427Mbod_RegionDescripcion[0] ;
      pr_default.close(3);
      /* Using cursor T00066 */
      pr_default.execute(4, new Object[] {new Long(A63Mbod_CentCostoId)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_CENTCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_CentCostoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A429Mbod_CentCostoCodigo = T00066_A429Mbod_CentCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
      n429Mbod_CentCostoCodigo = T00066_n429Mbod_CentCostoCodigo[0] ;
      A430Mbod_CentroCostoDescrip = T00066_A430Mbod_CentroCostoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
      n430Mbod_CentroCostoDescrip = T00066_n430Mbod_CentroCostoDescrip[0] ;
      pr_default.close(4);
      /* Using cursor T00067 */
      pr_default.execute(5, new Object[] {A64Mbod_BodOrigenCodigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODORIGENCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodOrigenCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T00068 */
      pr_default.execute(6, new Object[] {A65Mbod_BodDestinoCodigo});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODDESTINOCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodDestinoCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors068( )
   {
      pr_default.close(2);
      pr_default.close(7);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_25( String A61Mbod_TipoMovCodigo )
   {
      /* Using cursor T000611 */
      pr_default.execute(9, new Object[] {A61Mbod_TipoMovCodigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "MBOD_TIPOMOVCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A428Mbod_TipoMovDescrip = T000611_A428Mbod_TipoMovDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
      n428Mbod_TipoMovDescrip = T000611_n428Mbod_TipoMovDescrip[0] ;
      A431Mbod_TipoElementoCod = T000611_A431Mbod_TipoElementoCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
      n431Mbod_TipoElementoCod = T000611_n431Mbod_TipoElementoCod[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A428Mbod_TipoMovDescrip)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_30( long A431Mbod_TipoElementoCod )
   {
      /* Using cursor T000612 */
      pr_default.execute(10, new Object[] {new Boolean(n431Mbod_TipoElementoCod), new Long(A431Mbod_TipoElementoCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A432Mbod_TipoElementoDesc = T000612_A432Mbod_TipoElementoDesc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
      n432Mbod_TipoElementoDesc = T000612_n432Mbod_TipoElementoDesc[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A432Mbod_TipoElementoDesc)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_26( long A62Mbod_RegionId )
   {
      /* Using cursor T000613 */
      pr_default.execute(11, new Object[] {new Long(A62Mbod_RegionId)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Region Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_REGIONID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_RegionId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A426Mbod_RegionCodigo = T000613_A426Mbod_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
      n426Mbod_RegionCodigo = T000613_n426Mbod_RegionCodigo[0] ;
      A427Mbod_RegionDescripcion = T000613_A427Mbod_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
      n427Mbod_RegionDescripcion = T000613_n427Mbod_RegionDescripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A427Mbod_RegionDescripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_27( long A63Mbod_CentCostoId )
   {
      /* Using cursor T000614 */
      pr_default.execute(12, new Object[] {new Long(A63Mbod_CentCostoId)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_CENTCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_CentCostoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A429Mbod_CentCostoCodigo = T000614_A429Mbod_CentCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
      n429Mbod_CentCostoCodigo = T000614_n429Mbod_CentCostoCodigo[0] ;
      A430Mbod_CentroCostoDescrip = T000614_A430Mbod_CentroCostoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
      n430Mbod_CentroCostoDescrip = T000614_n430Mbod_CentroCostoDescrip[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A429Mbod_CentCostoCodigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A430Mbod_CentroCostoDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_28( String A64Mbod_BodOrigenCodigo )
   {
      /* Using cursor T000615 */
      pr_default.execute(13, new Object[] {A64Mbod_BodOrigenCodigo});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODORIGENCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodOrigenCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A341Mbod_BodOrigenDescripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_29( String A65Mbod_BodDestinoCodigo )
   {
      /* Using cursor T000616 */
      pr_default.execute(14, new Object[] {A65Mbod_BodDestinoCodigo});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODDESTINOCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodDestinoCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A347Mbod_BodDestinoDescripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void getKey068( )
   {
      /* Using cursor T000617 */
      pr_default.execute(15, new Object[] {new Long(A60Mbod_Id)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00063 */
      pr_default.execute(1, new Object[] {new Long(A60Mbod_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm068( 24) ;
         RcdFound8 = (short)(1) ;
         A60Mbod_Id = T00063_A60Mbod_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
         A433Mbod_FechaCrea = T00063_A433Mbod_FechaCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         A359Mbod_UsuarioCrea = T00063_A359Mbod_UsuarioCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
         A362Mbod_FechaModifica = T00063_A362Mbod_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A361Mbod_UsuarioModifica = T00063_A361Mbod_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
         A364Mbod_AlmModOrigen = T00063_A364Mbod_AlmModOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
         A342Mbod_AlmOrigenCodigo = T00063_A342Mbod_AlmOrigenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
         A368Mbod_AlmModDestino = T00063_A368Mbod_AlmModDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
         A345Mbod_AlmDestinoCodigo = T00063_A345Mbod_AlmDestinoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
         A434Mbod_Estado = T00063_A434Mbod_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
         A61Mbod_TipoMovCodigo = T00063_A61Mbod_TipoMovCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
         A62Mbod_RegionId = T00063_A62Mbod_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
         A63Mbod_CentCostoId = T00063_A63Mbod_CentCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
         A64Mbod_BodOrigenCodigo = T00063_A64Mbod_BodOrigenCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
         A65Mbod_BodDestinoCodigo = T00063_A65Mbod_BodDestinoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
         Z60Mbod_Id = A60Mbod_Id ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load068( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey068( ) ;
         }
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey068( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey068( ) ;
      if ( RcdFound8 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T000618 */
      pr_default.execute(16, new Object[] {new Long(A60Mbod_Id)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T000618_A60Mbod_Id[0] < A60Mbod_Id ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T000618_A60Mbod_Id[0] > A60Mbod_Id ) ) )
         {
            A60Mbod_Id = T000618_A60Mbod_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T000619 */
      pr_default.execute(17, new Object[] {new Long(A60Mbod_Id)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T000619_A60Mbod_Id[0] > A60Mbod_Id ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T000619_A60Mbod_Id[0] < A60Mbod_Id ) ) )
         {
            A60Mbod_Id = T000619_A60Mbod_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey068( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert068( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( A60Mbod_Id != Z60Mbod_Id )
            {
               A60Mbod_Id = Z60Mbod_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MBOD_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMbod_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update068( ) ;
               GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A60Mbod_Id != Z60Mbod_Id )
            {
               /* Insert record */
               GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert068( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MBOD_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMbod_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert068( ) ;
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
      if ( A60Mbod_Id != Z60Mbod_Id )
      {
         A60Mbod_Id = Z60Mbod_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MBOD_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency068( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00062 */
         pr_default.execute(0, new Object[] {new Long(A60Mbod_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_RESTRICCIONES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z433Mbod_FechaCrea, T00062_A433Mbod_FechaCrea[0]) ) || ( GXutil.strcmp(Z359Mbod_UsuarioCrea, T00062_A359Mbod_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z362Mbod_FechaModifica, T00062_A362Mbod_FechaModifica[0]) ) || ( GXutil.strcmp(Z361Mbod_UsuarioModifica, T00062_A361Mbod_UsuarioModifica[0]) != 0 ) || ( GXutil.strcmp(Z364Mbod_AlmModOrigen, T00062_A364Mbod_AlmModOrigen[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z342Mbod_AlmOrigenCodigo, T00062_A342Mbod_AlmOrigenCodigo[0]) != 0 ) || ( GXutil.strcmp(Z368Mbod_AlmModDestino, T00062_A368Mbod_AlmModDestino[0]) != 0 ) || ( GXutil.strcmp(Z345Mbod_AlmDestinoCodigo, T00062_A345Mbod_AlmDestinoCodigo[0]) != 0 ) || ( GXutil.strcmp(Z434Mbod_Estado, T00062_A434Mbod_Estado[0]) != 0 ) || ( GXutil.strcmp(Z61Mbod_TipoMovCodigo, T00062_A61Mbod_TipoMovCodigo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z62Mbod_RegionId != T00062_A62Mbod_RegionId[0] ) || ( Z63Mbod_CentCostoId != T00062_A63Mbod_CentCostoId[0] ) || ( GXutil.strcmp(Z64Mbod_BodOrigenCodigo, T00062_A64Mbod_BodOrigenCodigo[0]) != 0 ) || ( GXutil.strcmp(Z65Mbod_BodDestinoCodigo, T00062_A65Mbod_BodDestinoCodigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_RESTRICCIONES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert068( )
   {
      beforeValidate068( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable068( ) ;
      }
      if ( AnyError == 0 )
      {
         zm068( 0) ;
         checkOptimisticConcurrency068( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm068( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert068( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000620 */
                  pr_default.execute(18, new Object[] {A433Mbod_FechaCrea, A359Mbod_UsuarioCrea, A362Mbod_FechaModifica, A361Mbod_UsuarioModifica, A364Mbod_AlmModOrigen, A342Mbod_AlmOrigenCodigo, A368Mbod_AlmModDestino, A345Mbod_AlmDestinoCodigo, A434Mbod_Estado, A61Mbod_TipoMovCodigo, new Long(A62Mbod_RegionId), new Long(A63Mbod_CentCostoId), A64Mbod_BodOrigenCodigo, A65Mbod_BodDestinoCodigo});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000621 */
                  pr_default.execute(19);
                  A60Mbod_Id = T000621_A60Mbod_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
                  pr_default.close(19);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption060( ) ;
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
            load068( ) ;
         }
         endLevel068( ) ;
      }
      closeExtendedTableCursors068( ) ;
   }

   public void update068( )
   {
      beforeValidate068( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable068( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency068( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm068( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate068( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000622 */
                  pr_default.execute(20, new Object[] {A433Mbod_FechaCrea, A359Mbod_UsuarioCrea, A362Mbod_FechaModifica, A361Mbod_UsuarioModifica, A364Mbod_AlmModOrigen, A342Mbod_AlmOrigenCodigo, A368Mbod_AlmModDestino, A345Mbod_AlmDestinoCodigo, A434Mbod_Estado, A61Mbod_TipoMovCodigo, new Long(A62Mbod_RegionId), new Long(A63Mbod_CentCostoId), A64Mbod_BodOrigenCodigo, A65Mbod_BodDestinoCodigo, new Long(A60Mbod_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_RESTRICCIONES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate068( ) ;
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
         endLevel068( ) ;
      }
      closeExtendedTableCursors068( ) ;
   }

   public void deferredUpdate068( )
   {
   }

   public void delete( )
   {
      beforeValidate068( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency068( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls068( ) ;
         afterConfirm068( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete068( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000623 */
               pr_default.execute(21, new Object[] {new Long(A60Mbod_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_RESTRICCIONES") ;
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel068( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls068( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV22Pgmname = "ALM_RESTRICCIONES" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
         /* Using cursor T000624 */
         pr_default.execute(22, new Object[] {A61Mbod_TipoMovCodigo});
         A428Mbod_TipoMovDescrip = T000624_A428Mbod_TipoMovDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
         n428Mbod_TipoMovDescrip = T000624_n428Mbod_TipoMovDescrip[0] ;
         A431Mbod_TipoElementoCod = T000624_A431Mbod_TipoElementoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
         n431Mbod_TipoElementoCod = T000624_n431Mbod_TipoElementoCod[0] ;
         pr_default.close(22);
         /* Using cursor T000625 */
         pr_default.execute(23, new Object[] {new Boolean(n431Mbod_TipoElementoCod), new Long(A431Mbod_TipoElementoCod)});
         A432Mbod_TipoElementoDesc = T000625_A432Mbod_TipoElementoDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
         n432Mbod_TipoElementoDesc = T000625_n432Mbod_TipoElementoDesc[0] ;
         pr_default.close(23);
         /* Using cursor T000626 */
         pr_default.execute(24, new Object[] {new Long(A62Mbod_RegionId)});
         A426Mbod_RegionCodigo = T000626_A426Mbod_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
         n426Mbod_RegionCodigo = T000626_n426Mbod_RegionCodigo[0] ;
         A427Mbod_RegionDescripcion = T000626_A427Mbod_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
         n427Mbod_RegionDescripcion = T000626_n427Mbod_RegionDescripcion[0] ;
         pr_default.close(24);
         /* Using cursor T000627 */
         pr_default.execute(25, new Object[] {new Long(A63Mbod_CentCostoId)});
         A429Mbod_CentCostoCodigo = T000627_A429Mbod_CentCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
         n429Mbod_CentCostoCodigo = T000627_n429Mbod_CentCostoCodigo[0] ;
         A430Mbod_CentroCostoDescrip = T000627_A430Mbod_CentroCostoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
         n430Mbod_CentroCostoDescrip = T000627_n430Mbod_CentroCostoDescrip[0] ;
         pr_default.close(25);
         /* Using cursor T000628 */
         pr_default.execute(26, new Object[] {A64Mbod_BodOrigenCodigo});
         pr_default.close(26);
         /* Using cursor T000629 */
         pr_default.execute(27, new Object[] {A65Mbod_BodDestinoCodigo});
         pr_default.close(27);
      }
   }

   public void endLevel068( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete068( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_restricciones");
         if ( AnyError == 0 )
         {
            confirmValues060( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_restricciones");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart068( )
   {
      /* Scan By routine */
      /* Using cursor T000630 */
      pr_default.execute(28);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A60Mbod_Id = T000630_A60Mbod_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext068( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A60Mbod_Id = T000630_A60Mbod_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      }
   }

   public void scanEnd068( )
   {
      pr_default.close(28);
   }

   public void afterConfirm068( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A433Mbod_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
      {
         A362Mbod_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A359Mbod_UsuarioCrea = AV21Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
      {
         A361Mbod_UsuarioModifica = AV21Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
      }
   }

   public void beforeInsert068( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate068( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete068( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete068( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate068( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes068( )
   {
      edtMbod_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_Id_Enabled, 5, 0)), true);
      edtMbod_TipoMovCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoMovCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoMovCodigo_Enabled, 5, 0)), true);
      edtMbod_TipoMovDescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoMovDescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoMovDescrip_Enabled, 5, 0)), true);
      edtMbod_TipoElementoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoElementoCod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoElementoCod_Enabled, 5, 0)), true);
      edtMbod_TipoElementoDesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_TipoElementoDesc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_TipoElementoDesc_Enabled, 5, 0)), true);
      edtMbod_RegionId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_RegionId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_RegionId_Enabled, 5, 0)), true);
      edtMbod_RegionCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_RegionCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_RegionCodigo_Enabled, 5, 0)), true);
      edtMbod_RegionDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_RegionDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_RegionDescripcion_Enabled, 5, 0)), true);
      edtMbod_CentCostoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_CentCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_CentCostoId_Enabled, 5, 0)), true);
      edtMbod_CentCostoCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_CentCostoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_CentCostoCodigo_Enabled, 5, 0)), true);
      edtMbod_CentroCostoDescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_CentroCostoDescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_CentroCostoDescrip_Enabled, 5, 0)), true);
      cmbMbod_AlmModOrigen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModOrigen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbMbod_AlmModOrigen.getEnabled(), 5, 0)), true);
      edtMbod_AlmOrigenCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_AlmOrigenCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_AlmOrigenCodigo_Enabled, 5, 0)), true);
      edtMbod_BodOrigenCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodOrigenCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodOrigenCodigo_Enabled, 5, 0)), true);
      edtMbod_BodOrigenDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodOrigenDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodOrigenDescripcion_Enabled, 5, 0)), true);
      cmbMbod_AlmModDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbMbod_AlmModDestino.getEnabled(), 5, 0)), true);
      edtMbod_AlmDestinoCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_AlmDestinoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_AlmDestinoCodigo_Enabled, 5, 0)), true);
      edtMbod_BodDestinoCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodDestinoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodDestinoCodigo_Enabled, 5, 0)), true);
      edtMbod_BodDestinoDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_BodDestinoDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_BodDestinoDescripcion_Enabled, 5, 0)), true);
      cmbMbod_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMbod_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbMbod_Estado.getEnabled(), 5, 0)), true);
      edtMbod_FechaCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_FechaCrea_Enabled, 5, 0)), true);
      edtMbod_UsuarioCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_UsuarioCrea_Enabled, 5, 0)), true);
      edtMbod_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_FechaModifica_Enabled, 5, 0)), true);
      edtMbod_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMbod_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMbod_UsuarioModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues060( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414141329");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17Mbod_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z60Mbod_Id", GXutil.ltrim( localUtil.ntoc( Z60Mbod_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z433Mbod_FechaCrea", localUtil.ttoc( Z433Mbod_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z359Mbod_UsuarioCrea", Z359Mbod_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z362Mbod_FechaModifica", localUtil.ttoc( Z362Mbod_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z361Mbod_UsuarioModifica", Z361Mbod_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z364Mbod_AlmModOrigen", Z364Mbod_AlmModOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z342Mbod_AlmOrigenCodigo", Z342Mbod_AlmOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z368Mbod_AlmModDestino", Z368Mbod_AlmModDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z345Mbod_AlmDestinoCodigo", Z345Mbod_AlmDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z434Mbod_Estado", GXutil.rtrim( Z434Mbod_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z61Mbod_TipoMovCodigo", Z61Mbod_TipoMovCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z62Mbod_RegionId", GXutil.ltrim( localUtil.ntoc( Z62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z63Mbod_CentCostoId", GXutil.ltrim( localUtil.ntoc( Z63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z64Mbod_BodOrigenCodigo", Z64Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z65Mbod_BodDestinoCodigo", Z65Mbod_BodDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N62Mbod_RegionId", GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N63Mbod_CentCostoId", GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV12TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV12TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMBOD_ID", GXutil.ltrim( localUtil.ntoc( AV17Mbod_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MBOD_TIPOMOVCODIGO", AV18Insert_Mbod_TipoMovCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MBOD_REGIONID", GXutil.ltrim( localUtil.ntoc( AV19Insert_Mbod_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MBOD_CENTCOSTOID", GXutil.ltrim( localUtil.ntoc( AV20Insert_Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MBOD_BODORIGENCODIGO", AV14Insert_Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MBOD_BODDESTINOCODIGO", AV15Insert_Mbod_BodDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV21Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMBOD_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Mbod_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_RESTRICCIONES" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_restricciones:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17Mbod_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_RESTRICCIONES" ;
   }

   public String getPgmdesc( )
   {
      return "Restricciones" ;
   }

   public void initializeNonKey068( )
   {
      A31Bode_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A31Bode_Codigo", A31Bode_Codigo);
      A61Mbod_TipoMovCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A61Mbod_TipoMovCodigo", A61Mbod_TipoMovCodigo);
      A62Mbod_RegionId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A62Mbod_RegionId", GXutil.ltrim( GXutil.str( A62Mbod_RegionId, 11, 0)));
      A63Mbod_CentCostoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A63Mbod_CentCostoId", GXutil.ltrim( GXutil.str( A63Mbod_CentCostoId, 11, 0)));
      A64Mbod_BodOrigenCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A64Mbod_BodOrigenCodigo", A64Mbod_BodOrigenCodigo);
      A65Mbod_BodDestinoCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65Mbod_BodDestinoCodigo", A65Mbod_BodDestinoCodigo);
      A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A433Mbod_FechaCrea", localUtil.ttoc( A433Mbod_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A359Mbod_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A359Mbod_UsuarioCrea", A359Mbod_UsuarioCrea);
      A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A362Mbod_FechaModifica", localUtil.ttoc( A362Mbod_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A361Mbod_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A361Mbod_UsuarioModifica", A361Mbod_UsuarioModifica);
      A428Mbod_TipoMovDescrip = "" ;
      n428Mbod_TipoMovDescrip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A428Mbod_TipoMovDescrip", A428Mbod_TipoMovDescrip);
      A431Mbod_TipoElementoCod = 0 ;
      n431Mbod_TipoElementoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A431Mbod_TipoElementoCod", GXutil.ltrim( GXutil.str( A431Mbod_TipoElementoCod, 18, 0)));
      A432Mbod_TipoElementoDesc = "" ;
      n432Mbod_TipoElementoDesc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A432Mbod_TipoElementoDesc", A432Mbod_TipoElementoDesc);
      A426Mbod_RegionCodigo = (short)(0) ;
      n426Mbod_RegionCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A426Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( A426Mbod_RegionCodigo, 4, 0)));
      A427Mbod_RegionDescripcion = "" ;
      n427Mbod_RegionDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A427Mbod_RegionDescripcion", A427Mbod_RegionDescripcion);
      A429Mbod_CentCostoCodigo = "" ;
      n429Mbod_CentCostoCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A429Mbod_CentCostoCodigo", A429Mbod_CentCostoCodigo);
      A430Mbod_CentroCostoDescrip = "" ;
      n430Mbod_CentroCostoDescrip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A430Mbod_CentroCostoDescrip", A430Mbod_CentroCostoDescrip);
      A364Mbod_AlmModOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A364Mbod_AlmModOrigen", A364Mbod_AlmModOrigen);
      A342Mbod_AlmOrigenCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A342Mbod_AlmOrigenCodigo", A342Mbod_AlmOrigenCodigo);
      A341Mbod_BodOrigenDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A341Mbod_BodOrigenDescripcion", A341Mbod_BodOrigenDescripcion);
      A368Mbod_AlmModDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A368Mbod_AlmModDestino", A368Mbod_AlmModDestino);
      A345Mbod_AlmDestinoCodigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A345Mbod_AlmDestinoCodigo", A345Mbod_AlmDestinoCodigo);
      A347Mbod_BodDestinoDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A347Mbod_BodDestinoDescripcion", A347Mbod_BodDestinoDescripcion);
      A434Mbod_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A434Mbod_Estado", A434Mbod_Estado);
      Z433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z359Mbod_UsuarioCrea = "" ;
      Z362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z361Mbod_UsuarioModifica = "" ;
      Z364Mbod_AlmModOrigen = "" ;
      Z342Mbod_AlmOrigenCodigo = "" ;
      Z368Mbod_AlmModDestino = "" ;
      Z345Mbod_AlmDestinoCodigo = "" ;
      Z434Mbod_Estado = "" ;
      Z61Mbod_TipoMovCodigo = "" ;
      Z62Mbod_RegionId = 0 ;
      Z63Mbod_CentCostoId = 0 ;
      Z64Mbod_BodOrigenCodigo = "" ;
      Z65Mbod_BodDestinoCodigo = "" ;
   }

   public void initAll068( )
   {
      A60Mbod_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A60Mbod_Id", GXutil.ltrim( GXutil.str( A60Mbod_Id, 11, 0)));
      initializeNonKey068( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414141346");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_restricciones.js", "?201861414141346");
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
      edtMbod_Id_Internalname = "MBOD_ID" ;
      edtMbod_TipoMovCodigo_Internalname = "MBOD_TIPOMOVCODIGO" ;
      edtMbod_TipoMovDescrip_Internalname = "MBOD_TIPOMOVDESCRIP" ;
      edtMbod_TipoElementoCod_Internalname = "MBOD_TIPOELEMENTOCOD" ;
      edtMbod_TipoElementoDesc_Internalname = "MBOD_TIPOELEMENTODESC" ;
      edtMbod_RegionId_Internalname = "MBOD_REGIONID" ;
      edtMbod_RegionCodigo_Internalname = "MBOD_REGIONCODIGO" ;
      edtMbod_RegionDescripcion_Internalname = "MBOD_REGIONDESCRIPCION" ;
      edtMbod_CentCostoId_Internalname = "MBOD_CENTCOSTOID" ;
      edtMbod_CentCostoCodigo_Internalname = "MBOD_CENTCOSTOCODIGO" ;
      edtMbod_CentroCostoDescrip_Internalname = "MBOD_CENTROCOSTODESCRIP" ;
      cmbMbod_AlmModOrigen.setInternalname( "MBOD_ALMMODORIGEN" );
      edtMbod_AlmOrigenCodigo_Internalname = "MBOD_ALMORIGENCODIGO" ;
      edtMbod_BodOrigenCodigo_Internalname = "MBOD_BODORIGENCODIGO" ;
      edtMbod_BodOrigenDescripcion_Internalname = "MBOD_BODORIGENDESCRIPCION" ;
      cmbMbod_AlmModDestino.setInternalname( "MBOD_ALMMODDESTINO" );
      edtMbod_AlmDestinoCodigo_Internalname = "MBOD_ALMDESTINOCODIGO" ;
      edtMbod_BodDestinoCodigo_Internalname = "MBOD_BODDESTINOCODIGO" ;
      edtMbod_BodDestinoDescripcion_Internalname = "MBOD_BODDESTINODESCRIPCION" ;
      cmbMbod_Estado.setInternalname( "MBOD_ESTADO" );
      edtMbod_FechaCrea_Internalname = "MBOD_FECHACREA" ;
      edtMbod_UsuarioCrea_Internalname = "MBOD_USUARIOCREA" ;
      edtMbod_FechaModifica_Internalname = "MBOD_FECHAMODIFICA" ;
      edtMbod_UsuarioModifica_Internalname = "MBOD_USUARIOMODIFICA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_61_Internalname = "PROMPT_61" ;
      imgprompt_62_Internalname = "PROMPT_62" ;
      imgprompt_63_Internalname = "PROMPT_63" ;
      imgprompt_64_Internalname = "PROMPT_64" ;
      imgprompt_65_Internalname = "PROMPT_65" ;
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
      Form.setCaption( "Restricciones" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMbod_UsuarioModifica_Jsonclick = "" ;
      edtMbod_UsuarioModifica_Enabled = 1 ;
      edtMbod_FechaModifica_Jsonclick = "" ;
      edtMbod_FechaModifica_Enabled = 1 ;
      edtMbod_UsuarioCrea_Jsonclick = "" ;
      edtMbod_UsuarioCrea_Enabled = 1 ;
      edtMbod_FechaCrea_Jsonclick = "" ;
      edtMbod_FechaCrea_Enabled = 1 ;
      cmbMbod_Estado.setJsonclick( "" );
      cmbMbod_Estado.setEnabled( 1 );
      edtMbod_BodDestinoDescripcion_Jsonclick = "" ;
      edtMbod_BodDestinoDescripcion_Enabled = 0 ;
      imgprompt_65_Visible = 1 ;
      imgprompt_65_Link = "" ;
      edtMbod_BodDestinoCodigo_Jsonclick = "" ;
      edtMbod_BodDestinoCodigo_Enabled = 1 ;
      edtMbod_AlmDestinoCodigo_Jsonclick = "" ;
      edtMbod_AlmDestinoCodigo_Enabled = 1 ;
      cmbMbod_AlmModDestino.setJsonclick( "" );
      cmbMbod_AlmModDestino.setEnabled( 1 );
      edtMbod_BodOrigenDescripcion_Jsonclick = "" ;
      edtMbod_BodOrigenDescripcion_Enabled = 0 ;
      imgprompt_64_Visible = 1 ;
      imgprompt_64_Link = "" ;
      edtMbod_BodOrigenCodigo_Jsonclick = "" ;
      edtMbod_BodOrigenCodigo_Enabled = 1 ;
      edtMbod_AlmOrigenCodigo_Jsonclick = "" ;
      edtMbod_AlmOrigenCodigo_Enabled = 1 ;
      cmbMbod_AlmModOrigen.setJsonclick( "" );
      cmbMbod_AlmModOrigen.setEnabled( 1 );
      edtMbod_CentroCostoDescrip_Jsonclick = "" ;
      edtMbod_CentroCostoDescrip_Enabled = 0 ;
      edtMbod_CentCostoCodigo_Jsonclick = "" ;
      edtMbod_CentCostoCodigo_Enabled = 0 ;
      imgprompt_63_Visible = 1 ;
      imgprompt_63_Link = "" ;
      edtMbod_CentCostoId_Jsonclick = "" ;
      edtMbod_CentCostoId_Enabled = 1 ;
      edtMbod_RegionDescripcion_Jsonclick = "" ;
      edtMbod_RegionDescripcion_Enabled = 0 ;
      edtMbod_RegionCodigo_Jsonclick = "" ;
      edtMbod_RegionCodigo_Enabled = 0 ;
      imgprompt_62_Visible = 1 ;
      imgprompt_62_Link = "" ;
      edtMbod_RegionId_Jsonclick = "" ;
      edtMbod_RegionId_Enabled = 1 ;
      edtMbod_TipoElementoDesc_Jsonclick = "" ;
      edtMbod_TipoElementoDesc_Enabled = 0 ;
      edtMbod_TipoElementoCod_Jsonclick = "" ;
      edtMbod_TipoElementoCod_Enabled = 0 ;
      edtMbod_TipoMovDescrip_Jsonclick = "" ;
      edtMbod_TipoMovDescrip_Enabled = 0 ;
      imgprompt_61_Visible = 1 ;
      imgprompt_61_Link = "" ;
      edtMbod_TipoMovCodigo_Jsonclick = "" ;
      edtMbod_TipoMovCodigo_Enabled = 1 ;
      edtMbod_Id_Jsonclick = "" ;
      edtMbod_Id_Enabled = 0 ;
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

   public void valid_Mbod_tipomovcodigo( String GX_Parm1 ,
                                         long GX_Parm2 ,
                                         String GX_Parm3 ,
                                         String GX_Parm4 )
   {
      A61Mbod_TipoMovCodigo = GX_Parm1 ;
      A431Mbod_TipoElementoCod = GX_Parm2 ;
      n431Mbod_TipoElementoCod = false ;
      A428Mbod_TipoMovDescrip = GX_Parm3 ;
      n428Mbod_TipoMovDescrip = false ;
      A432Mbod_TipoElementoDesc = GX_Parm4 ;
      n432Mbod_TipoElementoDesc = false ;
      /* Using cursor T000624 */
      pr_default.execute(22, new Object[] {A61Mbod_TipoMovCodigo});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "MBOD_TIPOMOVCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_TipoMovCodigo_Internalname ;
      }
      A428Mbod_TipoMovDescrip = T000624_A428Mbod_TipoMovDescrip[0] ;
      n428Mbod_TipoMovDescrip = T000624_n428Mbod_TipoMovDescrip[0] ;
      A431Mbod_TipoElementoCod = T000624_A431Mbod_TipoElementoCod[0] ;
      n431Mbod_TipoElementoCod = T000624_n431Mbod_TipoElementoCod[0] ;
      pr_default.close(22);
      /* Using cursor T000625 */
      pr_default.execute(23, new Object[] {new Boolean(n431Mbod_TipoElementoCod), new Long(A431Mbod_TipoElementoCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo MovimientoRestriccion'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A432Mbod_TipoElementoDesc = T000625_A432Mbod_TipoElementoDesc[0] ;
      n432Mbod_TipoElementoDesc = T000625_n432Mbod_TipoElementoDesc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A428Mbod_TipoMovDescrip = "" ;
         n428Mbod_TipoMovDescrip = false ;
         A431Mbod_TipoElementoCod = 0 ;
         n431Mbod_TipoElementoCod = false ;
         A432Mbod_TipoElementoDesc = "" ;
         n432Mbod_TipoElementoDesc = false ;
      }
      isValidOutput.add(A428Mbod_TipoMovDescrip);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A432Mbod_TipoElementoDesc);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Mbod_regionid( long GX_Parm1 ,
                                    short GX_Parm2 ,
                                    String GX_Parm3 )
   {
      A62Mbod_RegionId = GX_Parm1 ;
      A426Mbod_RegionCodigo = GX_Parm2 ;
      n426Mbod_RegionCodigo = false ;
      A427Mbod_RegionDescripcion = GX_Parm3 ;
      n427Mbod_RegionDescripcion = false ;
      /* Using cursor T000626 */
      pr_default.execute(24, new Object[] {new Long(A62Mbod_RegionId)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Region Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_REGIONID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_RegionId_Internalname ;
      }
      A426Mbod_RegionCodigo = T000626_A426Mbod_RegionCodigo[0] ;
      n426Mbod_RegionCodigo = T000626_n426Mbod_RegionCodigo[0] ;
      A427Mbod_RegionDescripcion = T000626_A427Mbod_RegionDescripcion[0] ;
      n427Mbod_RegionDescripcion = T000626_n427Mbod_RegionDescripcion[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A426Mbod_RegionCodigo = (short)(0) ;
         n426Mbod_RegionCodigo = false ;
         A427Mbod_RegionDescripcion = "" ;
         n427Mbod_RegionDescripcion = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A427Mbod_RegionDescripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Mbod_centcostoid( long GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 )
   {
      A63Mbod_CentCostoId = GX_Parm1 ;
      A429Mbod_CentCostoCodigo = GX_Parm2 ;
      n429Mbod_CentCostoCodigo = false ;
      A430Mbod_CentroCostoDescrip = GX_Parm3 ;
      n430Mbod_CentroCostoDescrip = false ;
      /* Using cursor T000627 */
      pr_default.execute(25, new Object[] {new Long(A63Mbod_CentCostoId)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Restriccion'.", "ForeignKeyNotFound", 1, "MBOD_CENTCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_CentCostoId_Internalname ;
      }
      A429Mbod_CentCostoCodigo = T000627_A429Mbod_CentCostoCodigo[0] ;
      n429Mbod_CentCostoCodigo = T000627_n429Mbod_CentCostoCodigo[0] ;
      A430Mbod_CentroCostoDescrip = T000627_A430Mbod_CentroCostoDescrip[0] ;
      n430Mbod_CentroCostoDescrip = T000627_n430Mbod_CentroCostoDescrip[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A429Mbod_CentCostoCodigo = "" ;
         n429Mbod_CentCostoCodigo = false ;
         A430Mbod_CentroCostoDescrip = "" ;
         n430Mbod_CentroCostoDescrip = false ;
      }
      isValidOutput.add(A429Mbod_CentCostoCodigo);
      isValidOutput.add(A430Mbod_CentroCostoDescrip);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Mbod_bodorigencodigo( String GX_Parm1 ,
                                           String GX_Parm2 )
   {
      A64Mbod_BodOrigenCodigo = GX_Parm1 ;
      A341Mbod_BodOrigenDescripcion = GX_Parm2 ;
      /* Using cursor T000628 */
      pr_default.execute(26, new Object[] {A64Mbod_BodOrigenCodigo});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODORIGENCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodOrigenCodigo_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A341Mbod_BodOrigenDescripcion = "" ;
      }
      isValidOutput.add(A341Mbod_BodOrigenDescripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Mbod_boddestinocodigo( String GX_Parm1 ,
                                            String GX_Parm2 )
   {
      A65Mbod_BodDestinoCodigo = GX_Parm1 ;
      A347Mbod_BodDestinoDescripcion = GX_Parm2 ;
      /* Using cursor T000629 */
      pr_default.execute(27, new Object[] {A65Mbod_BodDestinoCodigo});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "MBOD_BODDESTINOCODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMbod_BodDestinoCodigo_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A347Mbod_BodDestinoDescripcion = "" ;
      }
      isValidOutput.add(A347Mbod_BodDestinoDescripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV17Mbod_Id',fld:'vMBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12062',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV12TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(27);
      pr_default.close(26);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z359Mbod_UsuarioCrea = "" ;
      Z362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z361Mbod_UsuarioModifica = "" ;
      Z364Mbod_AlmModOrigen = "" ;
      Z342Mbod_AlmOrigenCodigo = "" ;
      Z368Mbod_AlmModDestino = "" ;
      Z345Mbod_AlmDestinoCodigo = "" ;
      Z434Mbod_Estado = "" ;
      Z61Mbod_TipoMovCodigo = "" ;
      Z64Mbod_BodOrigenCodigo = "" ;
      Z65Mbod_BodDestinoCodigo = "" ;
      N61Mbod_TipoMovCodigo = "" ;
      N64Mbod_BodOrigenCodigo = "" ;
      N65Mbod_BodDestinoCodigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A61Mbod_TipoMovCodigo = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A368Mbod_AlmModDestino = "" ;
      A434Mbod_Estado = "" ;
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
      A428Mbod_TipoMovDescrip = "" ;
      A432Mbod_TipoElementoDesc = "" ;
      A427Mbod_RegionDescripcion = "" ;
      A429Mbod_CentCostoCodigo = "" ;
      A430Mbod_CentroCostoDescrip = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A341Mbod_BodOrigenDescripcion = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A347Mbod_BodDestinoDescripcion = "" ;
      A433Mbod_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A359Mbod_UsuarioCrea = "" ;
      A362Mbod_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A361Mbod_UsuarioModifica = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV18Insert_Mbod_TipoMovCodigo = "" ;
      AV14Insert_Mbod_BodOrigenCodigo = "" ;
      AV15Insert_Mbod_BodDestinoCodigo = "" ;
      AV21Usuario = "" ;
      AV22Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode8 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13WebSession = httpContext.getWebSession();
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV16TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z428Mbod_TipoMovDescrip = "" ;
      Z432Mbod_TipoElementoDesc = "" ;
      Z427Mbod_RegionDescripcion = "" ;
      Z429Mbod_CentCostoCodigo = "" ;
      Z430Mbod_CentroCostoDescrip = "" ;
      T00068_A31Bode_Codigo = new String[] {""} ;
      T00067_A31Bode_Codigo = new String[] {""} ;
      T00066_A429Mbod_CentCostoCodigo = new String[] {""} ;
      T00066_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      T00066_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      T00066_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      T00065_A426Mbod_RegionCodigo = new short[1] ;
      T00065_n426Mbod_RegionCodigo = new boolean[] {false} ;
      T00065_A427Mbod_RegionDescripcion = new String[] {""} ;
      T00065_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      T00064_A428Mbod_TipoMovDescrip = new String[] {""} ;
      T00064_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      T00064_A431Mbod_TipoElementoCod = new long[1] ;
      T00064_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      T00069_A432Mbod_TipoElementoDesc = new String[] {""} ;
      T00069_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      T000610_A60Mbod_Id = new long[1] ;
      T000610_A433Mbod_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000610_A359Mbod_UsuarioCrea = new String[] {""} ;
      T000610_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000610_A361Mbod_UsuarioModifica = new String[] {""} ;
      T000610_A428Mbod_TipoMovDescrip = new String[] {""} ;
      T000610_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      T000610_A432Mbod_TipoElementoDesc = new String[] {""} ;
      T000610_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      T000610_A426Mbod_RegionCodigo = new short[1] ;
      T000610_n426Mbod_RegionCodigo = new boolean[] {false} ;
      T000610_A427Mbod_RegionDescripcion = new String[] {""} ;
      T000610_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      T000610_A429Mbod_CentCostoCodigo = new String[] {""} ;
      T000610_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      T000610_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      T000610_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      T000610_A364Mbod_AlmModOrigen = new String[] {""} ;
      T000610_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      T000610_A368Mbod_AlmModDestino = new String[] {""} ;
      T000610_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      T000610_A434Mbod_Estado = new String[] {""} ;
      T000610_A61Mbod_TipoMovCodigo = new String[] {""} ;
      T000610_A62Mbod_RegionId = new long[1] ;
      T000610_A63Mbod_CentCostoId = new long[1] ;
      T000610_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      T000610_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      T000610_A431Mbod_TipoElementoCod = new long[1] ;
      T000610_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      T000611_A428Mbod_TipoMovDescrip = new String[] {""} ;
      T000611_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      T000611_A431Mbod_TipoElementoCod = new long[1] ;
      T000611_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      T000612_A432Mbod_TipoElementoDesc = new String[] {""} ;
      T000612_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      T000613_A426Mbod_RegionCodigo = new short[1] ;
      T000613_n426Mbod_RegionCodigo = new boolean[] {false} ;
      T000613_A427Mbod_RegionDescripcion = new String[] {""} ;
      T000613_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      T000614_A429Mbod_CentCostoCodigo = new String[] {""} ;
      T000614_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      T000614_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      T000614_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      T000615_A31Bode_Codigo = new String[] {""} ;
      T000616_A31Bode_Codigo = new String[] {""} ;
      T000617_A60Mbod_Id = new long[1] ;
      T00063_A60Mbod_Id = new long[1] ;
      T00063_A433Mbod_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_A359Mbod_UsuarioCrea = new String[] {""} ;
      T00063_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00063_A361Mbod_UsuarioModifica = new String[] {""} ;
      T00063_A364Mbod_AlmModOrigen = new String[] {""} ;
      T00063_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      T00063_A368Mbod_AlmModDestino = new String[] {""} ;
      T00063_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      T00063_A434Mbod_Estado = new String[] {""} ;
      T00063_A61Mbod_TipoMovCodigo = new String[] {""} ;
      T00063_A62Mbod_RegionId = new long[1] ;
      T00063_A63Mbod_CentCostoId = new long[1] ;
      T00063_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      T00063_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      T000618_A60Mbod_Id = new long[1] ;
      T000619_A60Mbod_Id = new long[1] ;
      T00062_A60Mbod_Id = new long[1] ;
      T00062_A433Mbod_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_A359Mbod_UsuarioCrea = new String[] {""} ;
      T00062_A362Mbod_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00062_A361Mbod_UsuarioModifica = new String[] {""} ;
      T00062_A364Mbod_AlmModOrigen = new String[] {""} ;
      T00062_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      T00062_A368Mbod_AlmModDestino = new String[] {""} ;
      T00062_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      T00062_A434Mbod_Estado = new String[] {""} ;
      T00062_A61Mbod_TipoMovCodigo = new String[] {""} ;
      T00062_A62Mbod_RegionId = new long[1] ;
      T00062_A63Mbod_CentCostoId = new long[1] ;
      T00062_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      T00062_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      T000621_A60Mbod_Id = new long[1] ;
      T000624_A428Mbod_TipoMovDescrip = new String[] {""} ;
      T000624_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      T000624_A431Mbod_TipoElementoCod = new long[1] ;
      T000624_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      T000625_A432Mbod_TipoElementoDesc = new String[] {""} ;
      T000625_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      T000626_A426Mbod_RegionCodigo = new short[1] ;
      T000626_n426Mbod_RegionCodigo = new boolean[] {false} ;
      T000626_A427Mbod_RegionDescripcion = new String[] {""} ;
      T000626_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      T000627_A429Mbod_CentCostoCodigo = new String[] {""} ;
      T000627_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      T000627_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      T000627_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      T000628_A31Bode_Codigo = new String[] {""} ;
      T000629_A31Bode_Codigo = new String[] {""} ;
      T000630_A60Mbod_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A31Bode_Codigo = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_restricciones__default(),
         new Object[] {
             new Object[] {
            T00062_A60Mbod_Id, T00062_A433Mbod_FechaCrea, T00062_A359Mbod_UsuarioCrea, T00062_A362Mbod_FechaModifica, T00062_A361Mbod_UsuarioModifica, T00062_A364Mbod_AlmModOrigen, T00062_A342Mbod_AlmOrigenCodigo, T00062_A368Mbod_AlmModDestino, T00062_A345Mbod_AlmDestinoCodigo, T00062_A434Mbod_Estado,
            T00062_A61Mbod_TipoMovCodigo, T00062_A62Mbod_RegionId, T00062_A63Mbod_CentCostoId, T00062_A64Mbod_BodOrigenCodigo, T00062_A65Mbod_BodDestinoCodigo
            }
            , new Object[] {
            T00063_A60Mbod_Id, T00063_A433Mbod_FechaCrea, T00063_A359Mbod_UsuarioCrea, T00063_A362Mbod_FechaModifica, T00063_A361Mbod_UsuarioModifica, T00063_A364Mbod_AlmModOrigen, T00063_A342Mbod_AlmOrigenCodigo, T00063_A368Mbod_AlmModDestino, T00063_A345Mbod_AlmDestinoCodigo, T00063_A434Mbod_Estado,
            T00063_A61Mbod_TipoMovCodigo, T00063_A62Mbod_RegionId, T00063_A63Mbod_CentCostoId, T00063_A64Mbod_BodOrigenCodigo, T00063_A65Mbod_BodDestinoCodigo
            }
            , new Object[] {
            T00064_A428Mbod_TipoMovDescrip, T00064_n428Mbod_TipoMovDescrip, T00064_A431Mbod_TipoElementoCod, T00064_n431Mbod_TipoElementoCod
            }
            , new Object[] {
            T00065_A426Mbod_RegionCodigo, T00065_n426Mbod_RegionCodigo, T00065_A427Mbod_RegionDescripcion, T00065_n427Mbod_RegionDescripcion
            }
            , new Object[] {
            T00066_A429Mbod_CentCostoCodigo, T00066_n429Mbod_CentCostoCodigo, T00066_A430Mbod_CentroCostoDescrip, T00066_n430Mbod_CentroCostoDescrip
            }
            , new Object[] {
            T00067_A31Bode_Codigo
            }
            , new Object[] {
            T00068_A31Bode_Codigo
            }
            , new Object[] {
            T00069_A432Mbod_TipoElementoDesc, T00069_n432Mbod_TipoElementoDesc
            }
            , new Object[] {
            T000610_A60Mbod_Id, T000610_A433Mbod_FechaCrea, T000610_A359Mbod_UsuarioCrea, T000610_A362Mbod_FechaModifica, T000610_A361Mbod_UsuarioModifica, T000610_A428Mbod_TipoMovDescrip, T000610_n428Mbod_TipoMovDescrip, T000610_A432Mbod_TipoElementoDesc, T000610_n432Mbod_TipoElementoDesc, T000610_A426Mbod_RegionCodigo,
            T000610_n426Mbod_RegionCodigo, T000610_A427Mbod_RegionDescripcion, T000610_n427Mbod_RegionDescripcion, T000610_A429Mbod_CentCostoCodigo, T000610_n429Mbod_CentCostoCodigo, T000610_A430Mbod_CentroCostoDescrip, T000610_n430Mbod_CentroCostoDescrip, T000610_A364Mbod_AlmModOrigen, T000610_A342Mbod_AlmOrigenCodigo, T000610_A368Mbod_AlmModDestino,
            T000610_A345Mbod_AlmDestinoCodigo, T000610_A434Mbod_Estado, T000610_A61Mbod_TipoMovCodigo, T000610_A62Mbod_RegionId, T000610_A63Mbod_CentCostoId, T000610_A64Mbod_BodOrigenCodigo, T000610_A65Mbod_BodDestinoCodigo, T000610_A431Mbod_TipoElementoCod, T000610_n431Mbod_TipoElementoCod
            }
            , new Object[] {
            T000611_A428Mbod_TipoMovDescrip, T000611_n428Mbod_TipoMovDescrip, T000611_A431Mbod_TipoElementoCod, T000611_n431Mbod_TipoElementoCod
            }
            , new Object[] {
            T000612_A432Mbod_TipoElementoDesc, T000612_n432Mbod_TipoElementoDesc
            }
            , new Object[] {
            T000613_A426Mbod_RegionCodigo, T000613_n426Mbod_RegionCodigo, T000613_A427Mbod_RegionDescripcion, T000613_n427Mbod_RegionDescripcion
            }
            , new Object[] {
            T000614_A429Mbod_CentCostoCodigo, T000614_n429Mbod_CentCostoCodigo, T000614_A430Mbod_CentroCostoDescrip, T000614_n430Mbod_CentroCostoDescrip
            }
            , new Object[] {
            T000615_A31Bode_Codigo
            }
            , new Object[] {
            T000616_A31Bode_Codigo
            }
            , new Object[] {
            T000617_A60Mbod_Id
            }
            , new Object[] {
            T000618_A60Mbod_Id
            }
            , new Object[] {
            T000619_A60Mbod_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000621_A60Mbod_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000624_A428Mbod_TipoMovDescrip, T000624_n428Mbod_TipoMovDescrip, T000624_A431Mbod_TipoElementoCod, T000624_n431Mbod_TipoElementoCod
            }
            , new Object[] {
            T000625_A432Mbod_TipoElementoDesc, T000625_n432Mbod_TipoElementoDesc
            }
            , new Object[] {
            T000626_A426Mbod_RegionCodigo, T000626_n426Mbod_RegionCodigo, T000626_A427Mbod_RegionDescripcion, T000626_n427Mbod_RegionDescripcion
            }
            , new Object[] {
            T000627_A429Mbod_CentCostoCodigo, T000627_n429Mbod_CentCostoCodigo, T000627_A430Mbod_CentroCostoDescrip, T000627_n430Mbod_CentroCostoDescrip
            }
            , new Object[] {
            T000628_A31Bode_Codigo
            }
            , new Object[] {
            T000629_A31Bode_Codigo
            }
            , new Object[] {
            T000630_A60Mbod_Id
            }
         }
      );
      AV22Pgmname = "ALM_RESTRICCIONES" ;
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
   private short A426Mbod_RegionCodigo ;
   private short RcdFound8 ;
   private short Z426Mbod_RegionCodigo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMbod_Id_Enabled ;
   private int edtMbod_TipoMovCodigo_Enabled ;
   private int imgprompt_61_Visible ;
   private int edtMbod_TipoMovDescrip_Enabled ;
   private int edtMbod_TipoElementoCod_Enabled ;
   private int edtMbod_TipoElementoDesc_Enabled ;
   private int edtMbod_RegionId_Enabled ;
   private int imgprompt_62_Visible ;
   private int edtMbod_RegionCodigo_Enabled ;
   private int edtMbod_RegionDescripcion_Enabled ;
   private int edtMbod_CentCostoId_Enabled ;
   private int imgprompt_63_Visible ;
   private int edtMbod_CentCostoCodigo_Enabled ;
   private int edtMbod_CentroCostoDescrip_Enabled ;
   private int edtMbod_AlmOrigenCodigo_Enabled ;
   private int edtMbod_BodOrigenCodigo_Enabled ;
   private int imgprompt_64_Visible ;
   private int edtMbod_BodOrigenDescripcion_Enabled ;
   private int edtMbod_AlmDestinoCodigo_Enabled ;
   private int edtMbod_BodDestinoCodigo_Enabled ;
   private int imgprompt_65_Visible ;
   private int edtMbod_BodDestinoDescripcion_Enabled ;
   private int edtMbod_FechaCrea_Enabled ;
   private int edtMbod_UsuarioCrea_Enabled ;
   private int edtMbod_FechaModifica_Enabled ;
   private int edtMbod_UsuarioModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV23GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV17Mbod_Id ;
   private long Z60Mbod_Id ;
   private long Z62Mbod_RegionId ;
   private long Z63Mbod_CentCostoId ;
   private long N62Mbod_RegionId ;
   private long N63Mbod_CentCostoId ;
   private long A431Mbod_TipoElementoCod ;
   private long A62Mbod_RegionId ;
   private long A63Mbod_CentCostoId ;
   private long AV17Mbod_Id ;
   private long A60Mbod_Id ;
   private long AV19Insert_Mbod_RegionId ;
   private long AV20Insert_Mbod_CentCostoId ;
   private long Z431Mbod_TipoElementoCod ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z434Mbod_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A434Mbod_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMbod_TipoMovCodigo_Internalname ;
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
   private String edtMbod_Id_Internalname ;
   private String edtMbod_Id_Jsonclick ;
   private String edtMbod_TipoMovCodigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_61_Internalname ;
   private String imgprompt_61_Link ;
   private String edtMbod_TipoMovDescrip_Internalname ;
   private String edtMbod_TipoMovDescrip_Jsonclick ;
   private String edtMbod_TipoElementoCod_Internalname ;
   private String edtMbod_TipoElementoCod_Jsonclick ;
   private String edtMbod_TipoElementoDesc_Internalname ;
   private String edtMbod_TipoElementoDesc_Jsonclick ;
   private String edtMbod_RegionId_Internalname ;
   private String edtMbod_RegionId_Jsonclick ;
   private String imgprompt_62_Internalname ;
   private String imgprompt_62_Link ;
   private String edtMbod_RegionCodigo_Internalname ;
   private String edtMbod_RegionCodigo_Jsonclick ;
   private String edtMbod_RegionDescripcion_Internalname ;
   private String edtMbod_RegionDescripcion_Jsonclick ;
   private String edtMbod_CentCostoId_Internalname ;
   private String edtMbod_CentCostoId_Jsonclick ;
   private String imgprompt_63_Internalname ;
   private String imgprompt_63_Link ;
   private String edtMbod_CentCostoCodigo_Internalname ;
   private String edtMbod_CentCostoCodigo_Jsonclick ;
   private String edtMbod_CentroCostoDescrip_Internalname ;
   private String edtMbod_CentroCostoDescrip_Jsonclick ;
   private String edtMbod_AlmOrigenCodigo_Internalname ;
   private String edtMbod_AlmOrigenCodigo_Jsonclick ;
   private String edtMbod_BodOrigenCodigo_Internalname ;
   private String edtMbod_BodOrigenCodigo_Jsonclick ;
   private String imgprompt_64_Internalname ;
   private String imgprompt_64_Link ;
   private String edtMbod_BodOrigenDescripcion_Internalname ;
   private String edtMbod_BodOrigenDescripcion_Jsonclick ;
   private String edtMbod_AlmDestinoCodigo_Internalname ;
   private String edtMbod_AlmDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoCodigo_Jsonclick ;
   private String imgprompt_65_Internalname ;
   private String imgprompt_65_Link ;
   private String edtMbod_BodDestinoDescripcion_Internalname ;
   private String edtMbod_BodDestinoDescripcion_Jsonclick ;
   private String edtMbod_FechaCrea_Internalname ;
   private String edtMbod_FechaCrea_Jsonclick ;
   private String edtMbod_UsuarioCrea_Internalname ;
   private String edtMbod_UsuarioCrea_Jsonclick ;
   private String edtMbod_FechaModifica_Internalname ;
   private String edtMbod_FechaModifica_Jsonclick ;
   private String edtMbod_UsuarioModifica_Internalname ;
   private String edtMbod_UsuarioModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV22Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode8 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z433Mbod_FechaCrea ;
   private java.util.Date Z362Mbod_FechaModifica ;
   private java.util.Date A433Mbod_FechaCrea ;
   private java.util.Date A362Mbod_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean n431Mbod_TipoElementoCod ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n428Mbod_TipoMovDescrip ;
   private boolean n432Mbod_TipoElementoDesc ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n427Mbod_RegionDescripcion ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n430Mbod_CentroCostoDescrip ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z359Mbod_UsuarioCrea ;
   private String Z361Mbod_UsuarioModifica ;
   private String Z364Mbod_AlmModOrigen ;
   private String Z342Mbod_AlmOrigenCodigo ;
   private String Z368Mbod_AlmModDestino ;
   private String Z345Mbod_AlmDestinoCodigo ;
   private String Z61Mbod_TipoMovCodigo ;
   private String Z64Mbod_BodOrigenCodigo ;
   private String Z65Mbod_BodDestinoCodigo ;
   private String N61Mbod_TipoMovCodigo ;
   private String N64Mbod_BodOrigenCodigo ;
   private String N65Mbod_BodDestinoCodigo ;
   private String A61Mbod_TipoMovCodigo ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String A364Mbod_AlmModOrigen ;
   private String A368Mbod_AlmModDestino ;
   private String A428Mbod_TipoMovDescrip ;
   private String A432Mbod_TipoElementoDesc ;
   private String A427Mbod_RegionDescripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private String A430Mbod_CentroCostoDescrip ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A341Mbod_BodOrigenDescripcion ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A347Mbod_BodDestinoDescripcion ;
   private String A359Mbod_UsuarioCrea ;
   private String A361Mbod_UsuarioModifica ;
   private String AV18Insert_Mbod_TipoMovCodigo ;
   private String AV14Insert_Mbod_BodOrigenCodigo ;
   private String AV15Insert_Mbod_BodDestinoCodigo ;
   private String AV21Usuario ;
   private String Z428Mbod_TipoMovDescrip ;
   private String Z432Mbod_TipoElementoDesc ;
   private String Z427Mbod_RegionDescripcion ;
   private String Z429Mbod_CentCostoCodigo ;
   private String Z430Mbod_CentroCostoDescrip ;
   private String A31Bode_Codigo ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbMbod_AlmModOrigen ;
   private HTMLChoice cmbMbod_AlmModDestino ;
   private HTMLChoice cmbMbod_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00068_A31Bode_Codigo ;
   private String[] T00067_A31Bode_Codigo ;
   private String[] T00066_A429Mbod_CentCostoCodigo ;
   private boolean[] T00066_n429Mbod_CentCostoCodigo ;
   private String[] T00066_A430Mbod_CentroCostoDescrip ;
   private boolean[] T00066_n430Mbod_CentroCostoDescrip ;
   private short[] T00065_A426Mbod_RegionCodigo ;
   private boolean[] T00065_n426Mbod_RegionCodigo ;
   private String[] T00065_A427Mbod_RegionDescripcion ;
   private boolean[] T00065_n427Mbod_RegionDescripcion ;
   private String[] T00064_A428Mbod_TipoMovDescrip ;
   private boolean[] T00064_n428Mbod_TipoMovDescrip ;
   private long[] T00064_A431Mbod_TipoElementoCod ;
   private boolean[] T00064_n431Mbod_TipoElementoCod ;
   private String[] T00069_A432Mbod_TipoElementoDesc ;
   private boolean[] T00069_n432Mbod_TipoElementoDesc ;
   private long[] T000610_A60Mbod_Id ;
   private java.util.Date[] T000610_A433Mbod_FechaCrea ;
   private String[] T000610_A359Mbod_UsuarioCrea ;
   private java.util.Date[] T000610_A362Mbod_FechaModifica ;
   private String[] T000610_A361Mbod_UsuarioModifica ;
   private String[] T000610_A428Mbod_TipoMovDescrip ;
   private boolean[] T000610_n428Mbod_TipoMovDescrip ;
   private String[] T000610_A432Mbod_TipoElementoDesc ;
   private boolean[] T000610_n432Mbod_TipoElementoDesc ;
   private short[] T000610_A426Mbod_RegionCodigo ;
   private boolean[] T000610_n426Mbod_RegionCodigo ;
   private String[] T000610_A427Mbod_RegionDescripcion ;
   private boolean[] T000610_n427Mbod_RegionDescripcion ;
   private String[] T000610_A429Mbod_CentCostoCodigo ;
   private boolean[] T000610_n429Mbod_CentCostoCodigo ;
   private String[] T000610_A430Mbod_CentroCostoDescrip ;
   private boolean[] T000610_n430Mbod_CentroCostoDescrip ;
   private String[] T000610_A364Mbod_AlmModOrigen ;
   private String[] T000610_A342Mbod_AlmOrigenCodigo ;
   private String[] T000610_A368Mbod_AlmModDestino ;
   private String[] T000610_A345Mbod_AlmDestinoCodigo ;
   private String[] T000610_A434Mbod_Estado ;
   private String[] T000610_A61Mbod_TipoMovCodigo ;
   private long[] T000610_A62Mbod_RegionId ;
   private long[] T000610_A63Mbod_CentCostoId ;
   private String[] T000610_A64Mbod_BodOrigenCodigo ;
   private String[] T000610_A65Mbod_BodDestinoCodigo ;
   private long[] T000610_A431Mbod_TipoElementoCod ;
   private boolean[] T000610_n431Mbod_TipoElementoCod ;
   private String[] T000611_A428Mbod_TipoMovDescrip ;
   private boolean[] T000611_n428Mbod_TipoMovDescrip ;
   private long[] T000611_A431Mbod_TipoElementoCod ;
   private boolean[] T000611_n431Mbod_TipoElementoCod ;
   private String[] T000612_A432Mbod_TipoElementoDesc ;
   private boolean[] T000612_n432Mbod_TipoElementoDesc ;
   private short[] T000613_A426Mbod_RegionCodigo ;
   private boolean[] T000613_n426Mbod_RegionCodigo ;
   private String[] T000613_A427Mbod_RegionDescripcion ;
   private boolean[] T000613_n427Mbod_RegionDescripcion ;
   private String[] T000614_A429Mbod_CentCostoCodigo ;
   private boolean[] T000614_n429Mbod_CentCostoCodigo ;
   private String[] T000614_A430Mbod_CentroCostoDescrip ;
   private boolean[] T000614_n430Mbod_CentroCostoDescrip ;
   private String[] T000615_A31Bode_Codigo ;
   private String[] T000616_A31Bode_Codigo ;
   private long[] T000617_A60Mbod_Id ;
   private long[] T00063_A60Mbod_Id ;
   private java.util.Date[] T00063_A433Mbod_FechaCrea ;
   private String[] T00063_A359Mbod_UsuarioCrea ;
   private java.util.Date[] T00063_A362Mbod_FechaModifica ;
   private String[] T00063_A361Mbod_UsuarioModifica ;
   private String[] T00063_A364Mbod_AlmModOrigen ;
   private String[] T00063_A342Mbod_AlmOrigenCodigo ;
   private String[] T00063_A368Mbod_AlmModDestino ;
   private String[] T00063_A345Mbod_AlmDestinoCodigo ;
   private String[] T00063_A434Mbod_Estado ;
   private String[] T00063_A61Mbod_TipoMovCodigo ;
   private long[] T00063_A62Mbod_RegionId ;
   private long[] T00063_A63Mbod_CentCostoId ;
   private String[] T00063_A64Mbod_BodOrigenCodigo ;
   private String[] T00063_A65Mbod_BodDestinoCodigo ;
   private long[] T000618_A60Mbod_Id ;
   private long[] T000619_A60Mbod_Id ;
   private long[] T00062_A60Mbod_Id ;
   private java.util.Date[] T00062_A433Mbod_FechaCrea ;
   private String[] T00062_A359Mbod_UsuarioCrea ;
   private java.util.Date[] T00062_A362Mbod_FechaModifica ;
   private String[] T00062_A361Mbod_UsuarioModifica ;
   private String[] T00062_A364Mbod_AlmModOrigen ;
   private String[] T00062_A342Mbod_AlmOrigenCodigo ;
   private String[] T00062_A368Mbod_AlmModDestino ;
   private String[] T00062_A345Mbod_AlmDestinoCodigo ;
   private String[] T00062_A434Mbod_Estado ;
   private String[] T00062_A61Mbod_TipoMovCodigo ;
   private long[] T00062_A62Mbod_RegionId ;
   private long[] T00062_A63Mbod_CentCostoId ;
   private String[] T00062_A64Mbod_BodOrigenCodigo ;
   private String[] T00062_A65Mbod_BodDestinoCodigo ;
   private long[] T000621_A60Mbod_Id ;
   private String[] T000624_A428Mbod_TipoMovDescrip ;
   private boolean[] T000624_n428Mbod_TipoMovDescrip ;
   private long[] T000624_A431Mbod_TipoElementoCod ;
   private boolean[] T000624_n431Mbod_TipoElementoCod ;
   private String[] T000625_A432Mbod_TipoElementoDesc ;
   private boolean[] T000625_n432Mbod_TipoElementoDesc ;
   private short[] T000626_A426Mbod_RegionCodigo ;
   private boolean[] T000626_n426Mbod_RegionCodigo ;
   private String[] T000626_A427Mbod_RegionDescripcion ;
   private boolean[] T000626_n427Mbod_RegionDescripcion ;
   private String[] T000627_A429Mbod_CentCostoCodigo ;
   private boolean[] T000627_n429Mbod_CentCostoCodigo ;
   private String[] T000627_A430Mbod_CentroCostoDescrip ;
   private boolean[] T000627_n430Mbod_CentroCostoDescrip ;
   private String[] T000628_A31Bode_Codigo ;
   private String[] T000629_A31Bode_Codigo ;
   private long[] T000630_A60Mbod_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class alm_restricciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00062", "SELECT Mbod_Id, Mbod_FechaCrea, Mbod_UsuarioCrea, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_Estado, Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_BodOrigenCodigo, Mbod_BodDestinoCodigo FROM ALM_RESTRICCIONES WHERE Mbod_Id = ?  FOR UPDATE OF Mbod_FechaCrea, Mbod_UsuarioCrea, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_Estado, Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_BodOrigenCodigo, Mbod_BodDestinoCodigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00063", "SELECT Mbod_Id, Mbod_FechaCrea, Mbod_UsuarioCrea, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_Estado, Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_BodOrigenCodigo, Mbod_BodDestinoCodigo FROM ALM_RESTRICCIONES WHERE Mbod_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00064", "SELECT Tpmo_Descripcion AS Mbod_TipoMovDescrip, Tipo_Codigo AS Mbod_TipoElementoCod FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00065", "SELECT Regi_Cod AS Mbod_RegionCodigo, Regi_Descripcion AS Mbod_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00066", "SELECT Cent_Codigo AS Mbod_CentCostoCodigo, Cent_Descripcion AS Mbod_CentroCostoDescrip FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00067", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00068", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00069", "SELECT Tipo_Descripcion AS Mbod_TipoElementoDesc FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000610", "SELECT /*+ FIRST_ROWS(100) */ TM1.Mbod_Id, TM1.Mbod_FechaCrea, TM1.Mbod_UsuarioCrea, TM1.Mbod_FechaModifica, TM1.Mbod_UsuarioModifica, T2.Tpmo_Descripcion AS Mbod_TipoMovDescrip, T3.Tipo_Descripcion AS Mbod_TipoElementoDesc, T4.Regi_Cod AS Mbod_RegionCodigo, T4.Regi_Descripcion AS Mbod_RegionDescripcion, T5.Cent_Codigo AS Mbod_CentCostoCodigo, T5.Cent_Descripcion AS Mbod_CentroCostoDescrip, TM1.Mbod_AlmModOrigen, TM1.Mbod_AlmOrigenCodigo, TM1.Mbod_AlmModDestino, TM1.Mbod_AlmDestinoCodigo, TM1.Mbod_Estado, TM1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo, TM1.Mbod_RegionId AS Mbod_RegionId, TM1.Mbod_CentCostoId AS Mbod_CentCostoId, TM1.Mbod_BodOrigenCodigo, TM1.Mbod_BodDestinoCodigo, T2.Tipo_Codigo AS Mbod_TipoElementoCod FROM ((((ALM_RESTRICCIONES TM1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = TM1.Mbod_TipoMovCodigo) LEFT JOIN ALM_TIPO_ELEMENTO T3 ON T3.Tipo_Codigo = T2.Tipo_Codigo) INNER JOIN GEN_REGIONAL T4 ON T4.Regi_Id = TM1.Mbod_RegionId) INNER JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = TM1.Mbod_CentCostoId) WHERE TM1.Mbod_Id = ? ORDER BY TM1.Mbod_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000611", "SELECT Tpmo_Descripcion AS Mbod_TipoMovDescrip, Tipo_Codigo AS Mbod_TipoElementoCod FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000612", "SELECT Tipo_Descripcion AS Mbod_TipoElementoDesc FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000613", "SELECT Regi_Cod AS Mbod_RegionCodigo, Regi_Descripcion AS Mbod_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000614", "SELECT Cent_Codigo AS Mbod_CentCostoCodigo, Cent_Descripcion AS Mbod_CentroCostoDescrip FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000615", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000616", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000617", "SELECT /*+ FIRST_ROWS(1) */ Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000618", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Mbod_Id FROM ALM_RESTRICCIONES WHERE ( Mbod_Id > ?) ORDER BY Mbod_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000619", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Mbod_Id FROM ALM_RESTRICCIONES WHERE ( Mbod_Id < ?) ORDER BY Mbod_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000620", "INSERT INTO ALM_RESTRICCIONES(Mbod_FechaCrea, Mbod_UsuarioCrea, Mbod_FechaModifica, Mbod_UsuarioModifica, Mbod_AlmModOrigen, Mbod_AlmOrigenCodigo, Mbod_AlmModDestino, Mbod_AlmDestinoCodigo, Mbod_Estado, Mbod_TipoMovCodigo, Mbod_RegionId, Mbod_CentCostoId, Mbod_BodOrigenCodigo, Mbod_BodDestinoCodigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_RESTRICCIONES")
         ,new ForEachCursor("T000621", "SELECT Mbod_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000622", "UPDATE ALM_RESTRICCIONES SET Mbod_FechaCrea=?, Mbod_UsuarioCrea=?, Mbod_FechaModifica=?, Mbod_UsuarioModifica=?, Mbod_AlmModOrigen=?, Mbod_AlmOrigenCodigo=?, Mbod_AlmModDestino=?, Mbod_AlmDestinoCodigo=?, Mbod_Estado=?, Mbod_TipoMovCodigo=?, Mbod_RegionId=?, Mbod_CentCostoId=?, Mbod_BodOrigenCodigo=?, Mbod_BodDestinoCodigo=?  WHERE Mbod_Id = ?", GX_NOMASK, "ALM_RESTRICCIONES")
         ,new UpdateCursor("T000623", "DELETE FROM ALM_RESTRICCIONES  WHERE Mbod_Id = ?", GX_NOMASK, "ALM_RESTRICCIONES")
         ,new ForEachCursor("T000624", "SELECT Tpmo_Descripcion AS Mbod_TipoMovDescrip, Tipo_Codigo AS Mbod_TipoElementoCod FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000625", "SELECT Tipo_Descripcion AS Mbod_TipoElementoDesc FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000626", "SELECT Regi_Cod AS Mbod_RegionCodigo, Regi_Descripcion AS Mbod_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000627", "SELECT Cent_Codigo AS Mbod_CentCostoCodigo, Cent_Descripcion AS Mbod_CentroCostoDescrip FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000628", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000629", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000630", "SELECT /*+ FIRST_ROWS(100) */ Mbod_Id FROM ALM_RESTRICCIONES ORDER BY Mbod_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 1) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((long[]) buf[12])[0] = rslt.getLong(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getString(10, 1) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((long[]) buf[12])[0] = rslt.getLong(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[21])[0] = rslt.getString(16, 1) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[23])[0] = rslt.getLong(18) ;
               ((long[]) buf[24])[0] = rslt.getLong(19) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(21) ;
               ((long[]) buf[27])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 28 :
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setVarchar(5, (String)parms[4], 8, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setVarchar(10, (String)parms[9], 3, false);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setVarchar(13, (String)parms[12], 3, false);
               stmt.setVarchar(14, (String)parms[13], 3, false);
               return;
            case 20 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setVarchar(5, (String)parms[4], 8, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 8, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setVarchar(10, (String)parms[9], 3, false);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setVarchar(13, (String)parms[12], 3, false);
               stmt.setVarchar(14, (String)parms[13], 3, false);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

