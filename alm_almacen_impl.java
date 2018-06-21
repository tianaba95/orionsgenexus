/*
               File: alm_almacen_impl
        Description: Almacén
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:28.95
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

public final  class alm_almacen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A27Alma_Modulo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         AV21Alma_IdResponsableOld = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
         AV23Tran = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran", GXutil.ltrim( GXutil.str( AV23Tran, 6, 0)));
         A30Alma_IdResponsable = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_022( A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo, AV21Alma_IdResponsableOld, AV23Tran, A30Alma_IdResponsable) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A27Alma_Modulo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         A30Alma_IdResponsable = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         AV23Tran = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran", GXutil.ltrim( GXutil.str( AV23Tran, 6, 0)));
         AV21Alma_IdResponsableOld = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_022( A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo, A30Alma_IdResponsable, AV23Tran, AV21Alma_IdResponsableOld) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A29Tpal_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A29Tpal_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A30Alma_IdResponsable = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A30Alma_IdResponsable) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A32BArea_Codigo = httpContext.GetNextPar( ) ;
         n32BArea_Codigo = false ;
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A32BArea_Codigo, A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A31Bode_Codigo = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A31Bode_Codigo) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_almacen_bodegas") == 0 )
      {
         nRC_GXsfl_100 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_100_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_100_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_almacen_bodegas_newrow( ) ;
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
            AV17Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Cent_Id", GXutil.ltrim( GXutil.str( AV17Cent_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cent_Id), "ZZZZZZZZZZ9")));
            AV18Alma_Modulo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Alma_Modulo", AV18Alma_Modulo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Alma_Modulo, ""))));
            AV16Alma_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_Codigo", AV16Alma_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Alma_Codigo, ""))));
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
      cmbAlma_Estado.setName( "ALMA_ESTADO" );
      cmbAlma_Estado.setWebtags( "" );
      cmbAlma_Estado.addItem("A", "Activo", (short)(0));
      cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbAlma_Estado.getItemCount() > 0 )
      {
         A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
         n673Alma_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
      }
      GXCCtl = "BBODE_ESTADO_" + sGXsfl_100_idx ;
      cmbBBode_Estado.setName( GXCCtl );
      cmbBBode_Estado.setWebtags( "" );
      cmbBBode_Estado.addItem("A", "Activo", (short)(0));
      cmbBBode_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbBBode_Estado.getItemCount() > 0 )
      {
         A696BBode_Estado = cmbBBode_Estado.getValidValue(A696BBode_Estado) ;
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
         Form.getMeta().addItem("description", "Almacén", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCent_Id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_almacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_almacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_almacen_impl.class ));
   }

   public alm_almacen_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlma_Modulo = new HTMLChoice();
      cmbAlma_Estado = new HTMLChoice();
      cmbBBode_Estado = new HTMLChoice();
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
      if ( cmbAlma_Estado.getItemCount() > 0 )
      {
         A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
         n673Alma_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Almacén", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx0020"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ALMA_MODULO"+"'), id:'"+"ALMA_MODULO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ALMA_CODIGO"+"'), id:'"+"ALMA_CODIGO"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-3 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Centro de costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ALMACEN.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-5 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Modulo.getInternalname(), "Modulo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Modulo, cmbAlma_Modulo.getInternalname(), GXutil.rtrim( A27Alma_Modulo), 1, cmbAlma_Modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbAlma_Modulo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "", true, "HLP_ALM_ALMACEN.htm");
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Codigo_Internalname, "Código Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Codigo_Internalname, A28Alma_Codigo, GXutil.rtrim( localUtil.format( A28Alma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Descripcion_Internalname, A252Alma_Descripcion, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpal_Id_Internalname, "Tipo de Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A29Tpal_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpal_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ALMACEN.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_29_Internalname, sImgUrl, imgprompt_29_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_29_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpal_Descripcion_Internalname, A307Tpal_Descripcion, GXutil.rtrim( localUtil.format( A307Tpal_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpal_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpal_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Direccion_Internalname, "Dirección", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtAlma_Direccion_Internalname, A259Alma_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A259Alma_Direccion), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", (short)(0), 1, edtAlma_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Telefono1_Internalname, "Telefono1", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Telefono1_Internalname, GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Telefono1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Telefono1_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Telefono1_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Telefono2_Internalname, "Telefono2", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Telefono2_Internalname, GXutil.ltrim( localUtil.ntoc( A261Alma_Telefono2, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Telefono2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A261Alma_Telefono2), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Telefono2_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Telefono2_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_Fax_Internalname, "Fax", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_Fax_Internalname, GXutil.ltrim( localUtil.ntoc( A262Alma_Fax, (byte)(18), (byte)(0), ",", "")), ((edtAlma_Fax_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A262Alma_Fax), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_Fax_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_Fax_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_IdResponsable_Internalname, "Responsable", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_IdResponsable_Internalname, GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_IdResponsable_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_IdResponsable_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ALMACEN.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_30_Internalname, sImgUrl, imgprompt_30_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_30_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_NombreResponsable_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_NombreResponsable_Internalname, A266Alma_NombreResponsable, GXutil.rtrim( localUtil.format( A266Alma_NombreResponsable, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_NombreResponsable_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_NombreResponsable_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_EmailResponsable_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_EmailResponsable_Internalname, A268Alma_EmailResponsable, GXutil.rtrim( localUtil.format( A268Alma_EmailResponsable, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A268Alma_EmailResponsable, "", "", "", edtAlma_EmailResponsable_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_EmailResponsable_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_CuentaDebito_Internalname, "Cuenta Débito", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_CuentaDebito_Internalname, A263Alma_CuentaDebito, GXutil.rtrim( localUtil.format( A263Alma_CuentaDebito, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_CuentaDebito_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_CuentaDebito_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtAlma_CuentaCredito_Internalname, "Cuenta Crédito", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtAlma_CuentaCredito_Internalname, A264Alma_CuentaCredito, GXutil.rtrim( localUtil.format( A264Alma_CuentaCredito, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlma_CuentaCredito_Jsonclick, 0, "Attribute", "", "", "", 1, edtAlma_CuentaCredito_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbAlma_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlma_Estado, cmbAlma_Estado.getInternalname(), GXutil.rtrim( A673Alma_Estado), 1, cmbAlma_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlma_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, "HLP_ALM_ALMACEN.htm");
         cmbAlma_Estado.setValue( GXutil.rtrim( A673Alma_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Estado.getInternalname(), "Values", cmbAlma_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divBodegastable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitlebodegas_Internalname, "BODEGAS DEL ALMACÉN", "", "", lblTitlebodegas_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_almacen_bodegas( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ALMACEN.htm");
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

   public void gxdraw_gridalm_almacen_bodegas( )
   {
      /*  Grid Control  */
      Gridalm_almacen_bodegasContainer.AddObjectProperty("GridName", "Gridalm_almacen_bodegas");
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Class", "Grid");
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("CmpContext", "");
      Gridalm_almacen_bodegasContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Value", A31Bode_Codigo);
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBode_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Value", A695BBode_Descripcion);
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBBode_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Value", A32BArea_Codigo);
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Value", A610BArea_Descripcion);
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Value", GXutil.rtrim( A696BBode_Estado));
      Gridalm_almacen_bodegasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbBBode_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddColumnProperties(Gridalm_almacen_bodegasColumn);
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_almacen_bodegasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_almacen_bodegas_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_100_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount3 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_3 = (short)(1) ;
            scanStart023( ) ;
            while ( RcdFound3 != 0 )
            {
               init_level_properties3( ) ;
               getByPrimaryKey023( ) ;
               addRow023( ) ;
               scanNext023( ) ;
            }
            scanEnd023( ) ;
            nBlankRcdCount3 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B30Alma_IdResponsable = A30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         standaloneNotModal023( ) ;
         standaloneModal023( ) ;
         sMode3 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow023( ) ;
            edtBode_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BODE_CODIGO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
            edtBBode_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BBODE_DESCRIPCION_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBBode_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBBode_Descripcion_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
            edtBArea_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREA_CODIGO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
            edtBArea_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREA_DESCRIPCION_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBArea_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Descripcion_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
            cmbBBode_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BBODE_ESTADO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbBBode_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbBBode_Estado.getEnabled(), 5, 0)), !bGXsfl_100_Refreshing);
            imgprompt_1_Link = httpContext.cgiGet( "PROMPT_31_"+sGXsfl_100_idx+"Link") ;
            imgprompt_1_Link = httpContext.cgiGet( "PROMPT_32_"+sGXsfl_100_idx+"Link") ;
            if ( ( nRcdExists_3 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal023( ) ;
            }
            sendRow023( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A30Alma_IdResponsable = B30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount3 = (short)(5) ;
         nRcdExists_3 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart023( ) ;
            while ( RcdFound3 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_1003( ) ;
               init_level_properties3( ) ;
               standaloneNotModal023( ) ;
               getByPrimaryKey023( ) ;
               standaloneModal023( ) ;
               addRow023( ) ;
               scanNext023( ) ;
            }
            scanEnd023( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode3 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1003( ) ;
         initAll023( ) ;
         init_level_properties3( ) ;
         B30Alma_IdResponsable = A30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         standaloneNotModal023( ) ;
         standaloneModal023( ) ;
         nRcdExists_3 = (short)(0) ;
         nIsMod_3 = (short)(0) ;
         nRcdDeleted_3 = (short)(0) ;
         nBlankRcdCount3 = (short)(nBlankRcdUsr3+nBlankRcdCount3) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount3 > 0 )
         {
            addRow023( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBode_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount3 = (short)(nBlankRcdCount3-1) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A30Alma_IdResponsable = B30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_almacen_bodegasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_almacen_bodegas", Gridalm_almacen_bodegasContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_almacen_bodegasContainerData", Gridalm_almacen_bodegasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_almacen_bodegasContainerData"+"V", Gridalm_almacen_bodegasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_almacen_bodegasContainerData"+"V"+"\" value='"+Gridalm_almacen_bodegasContainer.GridValuesHidden()+"'/>") ;
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
      e11022 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1Cent_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            }
            else
            {
               A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            }
            A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
            A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
            cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
            cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
            A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TPAL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpal_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A29Tpal_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            }
            else
            {
               A29Tpal_Id = localUtil.ctol( httpContext.cgiGet( edtTpal_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
            }
            A307Tpal_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpal_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
            A259Alma_Direccion = httpContext.cgiGet( edtAlma_Direccion_Internalname) ;
            n259Alma_Direccion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A259Alma_Direccion", A259Alma_Direccion);
            n259Alma_Direccion = ((GXutil.strcmp("", A259Alma_Direccion)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMA_TELEFONO1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlma_Telefono1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A260Alma_Telefono1 = 0 ;
               n260Alma_Telefono1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
            }
            else
            {
               A260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") ;
               n260Alma_Telefono1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
            }
            n260Alma_Telefono1 = ((0==A260Alma_Telefono1) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMA_TELEFONO2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlma_Telefono2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A261Alma_Telefono2 = 0 ;
               n261Alma_Telefono2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
            }
            else
            {
               A261Alma_Telefono2 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono2_Internalname), ",", ".") ;
               n261Alma_Telefono2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
            }
            n261Alma_Telefono2 = ((0==A261Alma_Telefono2) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMA_FAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlma_Fax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A262Alma_Fax = 0 ;
               n262Alma_Fax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
            }
            else
            {
               A262Alma_Fax = localUtil.ctol( httpContext.cgiGet( edtAlma_Fax_Internalname), ",", ".") ;
               n262Alma_Fax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
            }
            n262Alma_Fax = ((0==A262Alma_Fax) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMA_IDRESPONSABLE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlma_IdResponsable_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30Alma_IdResponsable = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
            }
            else
            {
               A30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
            }
            A266Alma_NombreResponsable = GXutil.upper( httpContext.cgiGet( edtAlma_NombreResponsable_Internalname)) ;
            n266Alma_NombreResponsable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
            A268Alma_EmailResponsable = httpContext.cgiGet( edtAlma_EmailResponsable_Internalname) ;
            n268Alma_EmailResponsable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
            A263Alma_CuentaDebito = httpContext.cgiGet( edtAlma_CuentaDebito_Internalname) ;
            n263Alma_CuentaDebito = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
            n263Alma_CuentaDebito = ((GXutil.strcmp("", A263Alma_CuentaDebito)==0) ? true : false) ;
            A264Alma_CuentaCredito = httpContext.cgiGet( edtAlma_CuentaCredito_Internalname) ;
            n264Alma_CuentaCredito = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
            n264Alma_CuentaCredito = ((GXutil.strcmp("", A264Alma_CuentaCredito)==0) ? true : false) ;
            cmbAlma_Estado.setName( cmbAlma_Estado.getInternalname() );
            cmbAlma_Estado.setValue( httpContext.cgiGet( cmbAlma_Estado.getInternalname()) );
            A673Alma_Estado = httpContext.cgiGet( cmbAlma_Estado.getInternalname()) ;
            n673Alma_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
            n673Alma_Estado = ((GXutil.strcmp("", A673Alma_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z1Cent_Id = localUtil.ctol( httpContext.cgiGet( "Z1Cent_Id"), ",", ".") ;
            Z27Alma_Modulo = httpContext.cgiGet( "Z27Alma_Modulo") ;
            Z28Alma_Codigo = httpContext.cgiGet( "Z28Alma_Codigo") ;
            Z256Alma_UsuarioCrea = httpContext.cgiGet( "Z256Alma_UsuarioCrea") ;
            n256Alma_UsuarioCrea = ((GXutil.strcmp("", A256Alma_UsuarioCrea)==0) ? true : false) ;
            Z255Alma_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z255Alma_FechaCrea"), 0) ;
            n255Alma_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A255Alma_FechaCrea) ? true : false) ;
            Z258Alma_UsuarioModifica = httpContext.cgiGet( "Z258Alma_UsuarioModifica") ;
            n258Alma_UsuarioModifica = ((GXutil.strcmp("", A258Alma_UsuarioModifica)==0) ? true : false) ;
            Z257Alma_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z257Alma_FechaModifica"), 0) ;
            n257Alma_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A257Alma_FechaModifica) ? true : false) ;
            Z252Alma_Descripcion = httpContext.cgiGet( "Z252Alma_Descripcion") ;
            Z259Alma_Direccion = httpContext.cgiGet( "Z259Alma_Direccion") ;
            n259Alma_Direccion = ((GXutil.strcmp("", A259Alma_Direccion)==0) ? true : false) ;
            Z260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( "Z260Alma_Telefono1"), ",", ".") ;
            n260Alma_Telefono1 = ((0==A260Alma_Telefono1) ? true : false) ;
            Z261Alma_Telefono2 = localUtil.ctol( httpContext.cgiGet( "Z261Alma_Telefono2"), ",", ".") ;
            n261Alma_Telefono2 = ((0==A261Alma_Telefono2) ? true : false) ;
            Z262Alma_Fax = localUtil.ctol( httpContext.cgiGet( "Z262Alma_Fax"), ",", ".") ;
            n262Alma_Fax = ((0==A262Alma_Fax) ? true : false) ;
            Z263Alma_CuentaDebito = httpContext.cgiGet( "Z263Alma_CuentaDebito") ;
            n263Alma_CuentaDebito = ((GXutil.strcmp("", A263Alma_CuentaDebito)==0) ? true : false) ;
            Z264Alma_CuentaCredito = httpContext.cgiGet( "Z264Alma_CuentaCredito") ;
            n264Alma_CuentaCredito = ((GXutil.strcmp("", A264Alma_CuentaCredito)==0) ? true : false) ;
            Z673Alma_Estado = httpContext.cgiGet( "Z673Alma_Estado") ;
            n673Alma_Estado = ((GXutil.strcmp("", A673Alma_Estado)==0) ? true : false) ;
            Z29Tpal_Id = localUtil.ctol( httpContext.cgiGet( "Z29Tpal_Id"), ",", ".") ;
            Z30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( "Z30Alma_IdResponsable"), ",", ".") ;
            A256Alma_UsuarioCrea = httpContext.cgiGet( "Z256Alma_UsuarioCrea") ;
            n256Alma_UsuarioCrea = false ;
            n256Alma_UsuarioCrea = ((GXutil.strcmp("", A256Alma_UsuarioCrea)==0) ? true : false) ;
            A255Alma_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z255Alma_FechaCrea"), 0) ;
            n255Alma_FechaCrea = false ;
            n255Alma_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A255Alma_FechaCrea) ? true : false) ;
            A258Alma_UsuarioModifica = httpContext.cgiGet( "Z258Alma_UsuarioModifica") ;
            n258Alma_UsuarioModifica = false ;
            n258Alma_UsuarioModifica = ((GXutil.strcmp("", A258Alma_UsuarioModifica)==0) ? true : false) ;
            A257Alma_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z257Alma_FechaModifica"), 0) ;
            n257Alma_FechaModifica = false ;
            n257Alma_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A257Alma_FechaModifica) ? true : false) ;
            O30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( "O30Alma_IdResponsable"), ",", ".") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), ",", ".")) ;
            N29Tpal_Id = localUtil.ctol( httpContext.cgiGet( "N29Tpal_Id"), ",", ".") ;
            N30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( "N30Alma_IdResponsable"), ",", ".") ;
            AV17Cent_Id = localUtil.ctol( httpContext.cgiGet( "vCENT_ID"), ",", ".") ;
            AV18Alma_Modulo = httpContext.cgiGet( "vALMA_MODULO") ;
            AV16Alma_Codigo = httpContext.cgiGet( "vALMA_CODIGO") ;
            AV15Insert_Tpal_Id = localUtil.ctol( httpContext.cgiGet( "vINSERT_TPAL_ID"), ",", ".") ;
            AV13Insert_Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( "vINSERT_ALMA_IDRESPONSABLE"), ",", ".") ;
            AV20Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A256Alma_UsuarioCrea = httpContext.cgiGet( "ALMA_USUARIOCREA") ;
            n256Alma_UsuarioCrea = ((GXutil.strcmp("", A256Alma_UsuarioCrea)==0) ? true : false) ;
            A255Alma_FechaCrea = localUtil.ctot( httpContext.cgiGet( "ALMA_FECHACREA"), 0) ;
            n255Alma_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A255Alma_FechaCrea) ? true : false) ;
            A258Alma_UsuarioModifica = httpContext.cgiGet( "ALMA_USUARIOMODIFICA") ;
            n258Alma_UsuarioModifica = ((GXutil.strcmp("", A258Alma_UsuarioModifica)==0) ? true : false) ;
            A257Alma_FechaModifica = localUtil.ctot( httpContext.cgiGet( "ALMA_FECHAMODIFICA"), 0) ;
            n257Alma_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A257Alma_FechaModifica) ? true : false) ;
            AV21Alma_IdResponsableOld = localUtil.ctol( httpContext.cgiGet( "vALMA_IDRESPONSABLEOLD"), ",", ".") ;
            AV23Tran = (int)(localUtil.ctol( httpContext.cgiGet( "vTRAN"), ",", ".")) ;
            A265Alma_CedulaResponsable = localUtil.ctol( httpContext.cgiGet( "ALMA_CEDULARESPONSABLE"), ",", ".") ;
            n265Alma_CedulaResponsable = false ;
            AV24Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_ALMACEN" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1Cent_Id != Z1Cent_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_almacen:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               A27Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
               A28Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
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
                  sMode2 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound2 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_020( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CENT_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCent_Id_Internalname ;
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
                        e11022 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12022 ();
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
         e12022 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll022( ) ;
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
         disableAttributes022( ) ;
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

   public void confirm_020( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls022( ) ;
         }
         else
         {
            checkExtendedTable022( ) ;
            closeExtendedTableCursors022( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode2 = Gx_mode ;
         confirm_023( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode2 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_023( )
   {
      nGXsfl_100_idx = (short)(0) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow023( ) ;
         if ( ( nRcdExists_3 != 0 ) || ( nIsMod_3 != 0 ) )
         {
            getKey023( ) ;
            if ( ( nRcdExists_3 == 0 ) && ( nRcdDeleted_3 == 0 ) )
            {
               if ( RcdFound3 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate023( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable023( ) ;
                     closeExtendedTableCursors023( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BODE_CODIGO_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBode_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound3 != 0 )
               {
                  if ( nRcdDeleted_3 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey023( ) ;
                     load023( ) ;
                     beforeValidate023( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls023( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_3 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate023( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable023( ) ;
                           closeExtendedTableCursors023( ) ;
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
                  if ( nRcdDeleted_3 == 0 )
                  {
                     GXCCtl = "BODE_CODIGO_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBode_Codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBode_Codigo_Internalname, A31Bode_Codigo) ;
         httpContext.changePostValue( edtBBode_Descripcion_Internalname, A695BBode_Descripcion) ;
         httpContext.changePostValue( edtBArea_Codigo_Internalname, A32BArea_Codigo) ;
         httpContext.changePostValue( edtBArea_Descripcion_Internalname, A610BArea_Descripcion) ;
         httpContext.changePostValue( cmbBBode_Estado.getInternalname(), GXutil.rtrim( A696BBode_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z31Bode_Codigo_"+sGXsfl_100_idx, Z31Bode_Codigo) ;
         httpContext.changePostValue( "ZT_"+"Z695BBode_Descripcion_"+sGXsfl_100_idx, Z695BBode_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z696BBode_Estado_"+sGXsfl_100_idx, GXutil.rtrim( Z696BBode_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z32BArea_Codigo_"+sGXsfl_100_idx, Z32BArea_Codigo) ;
         httpContext.changePostValue( "nRcdDeleted_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_3, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_3, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_3, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_3 != 0 )
         {
            httpContext.changePostValue( "BODE_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBode_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BBODE_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBBode_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREA_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREA_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BBODE_ESTADO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBBode_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption020( )
   {
   }

   public void e11022( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV24Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      AV15Insert_Tpal_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Tpal_Id", GXutil.ltrim( GXutil.str( AV15Insert_Tpal_Id, 11, 0)));
      AV13Insert_Alma_IdResponsable = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Alma_IdResponsable", GXutil.ltrim( GXutil.str( AV13Insert_Alma_IdResponsable, 18, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV24Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV25GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25GXV1", GXutil.ltrim( GXutil.str( AV25GXV1, 8, 0)));
         while ( AV25GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV12TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV25GXV1));
            if ( GXutil.strcmp(AV12TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tpal_Id") == 0 )
            {
               AV15Insert_Tpal_Id = GXutil.lval( AV12TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Tpal_Id", GXutil.ltrim( GXutil.str( AV15Insert_Tpal_Id, 11, 0)));
            }
            else if ( GXutil.strcmp(AV12TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Alma_IdResponsable") == 0 )
            {
               AV13Insert_Alma_IdResponsable = GXutil.lval( AV12TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Alma_IdResponsable", GXutil.ltrim( GXutil.str( AV13Insert_Alma_IdResponsable, 18, 0)));
            }
            AV25GXV1 = (int)(AV25GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25GXV1", GXutil.ltrim( GXutil.str( AV25GXV1, 8, 0)));
         }
      }
      AV20Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Usuario", AV20Usuario);
   }

   public void e12022( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_almacen") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z256Alma_UsuarioCrea = T00027_A256Alma_UsuarioCrea[0] ;
            Z255Alma_FechaCrea = T00027_A255Alma_FechaCrea[0] ;
            Z258Alma_UsuarioModifica = T00027_A258Alma_UsuarioModifica[0] ;
            Z257Alma_FechaModifica = T00027_A257Alma_FechaModifica[0] ;
            Z252Alma_Descripcion = T00027_A252Alma_Descripcion[0] ;
            Z259Alma_Direccion = T00027_A259Alma_Direccion[0] ;
            Z260Alma_Telefono1 = T00027_A260Alma_Telefono1[0] ;
            Z261Alma_Telefono2 = T00027_A261Alma_Telefono2[0] ;
            Z262Alma_Fax = T00027_A262Alma_Fax[0] ;
            Z263Alma_CuentaDebito = T00027_A263Alma_CuentaDebito[0] ;
            Z264Alma_CuentaCredito = T00027_A264Alma_CuentaCredito[0] ;
            Z673Alma_Estado = T00027_A673Alma_Estado[0] ;
            Z29Tpal_Id = T00027_A29Tpal_Id[0] ;
            Z30Alma_IdResponsable = T00027_A30Alma_IdResponsable[0] ;
         }
         else
         {
            Z256Alma_UsuarioCrea = A256Alma_UsuarioCrea ;
            Z255Alma_FechaCrea = A255Alma_FechaCrea ;
            Z258Alma_UsuarioModifica = A258Alma_UsuarioModifica ;
            Z257Alma_FechaModifica = A257Alma_FechaModifica ;
            Z252Alma_Descripcion = A252Alma_Descripcion ;
            Z259Alma_Direccion = A259Alma_Direccion ;
            Z260Alma_Telefono1 = A260Alma_Telefono1 ;
            Z261Alma_Telefono2 = A261Alma_Telefono2 ;
            Z262Alma_Fax = A262Alma_Fax ;
            Z263Alma_CuentaDebito = A263Alma_CuentaDebito ;
            Z264Alma_CuentaCredito = A264Alma_CuentaCredito ;
            Z673Alma_Estado = A673Alma_Estado ;
            Z29Tpal_Id = A29Tpal_Id ;
            Z30Alma_IdResponsable = A30Alma_IdResponsable ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         Z256Alma_UsuarioCrea = A256Alma_UsuarioCrea ;
         Z255Alma_FechaCrea = A255Alma_FechaCrea ;
         Z258Alma_UsuarioModifica = A258Alma_UsuarioModifica ;
         Z257Alma_FechaModifica = A257Alma_FechaModifica ;
         Z252Alma_Descripcion = A252Alma_Descripcion ;
         Z259Alma_Direccion = A259Alma_Direccion ;
         Z260Alma_Telefono1 = A260Alma_Telefono1 ;
         Z261Alma_Telefono2 = A261Alma_Telefono2 ;
         Z262Alma_Fax = A262Alma_Fax ;
         Z263Alma_CuentaDebito = A263Alma_CuentaDebito ;
         Z264Alma_CuentaCredito = A264Alma_CuentaCredito ;
         Z673Alma_Estado = A673Alma_Estado ;
         Z1Cent_Id = A1Cent_Id ;
         Z29Tpal_Id = A29Tpal_Id ;
         Z30Alma_IdResponsable = A30Alma_IdResponsable ;
         Z3Cent_Codigo = A3Cent_Codigo ;
         Z4Cent_Descripcion = A4Cent_Descripcion ;
         Z307Tpal_Descripcion = A307Tpal_Descripcion ;
         Z266Alma_NombreResponsable = A266Alma_NombreResponsable ;
         Z268Alma_EmailResponsable = A268Alma_EmailResponsable ;
         Z265Alma_CedulaResponsable = A265Alma_CedulaResponsable ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      imgprompt_29_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0110"+"',["+"{Ctrl:gx.dom.el('"+"TPAL_ID"+"'), id:'"+"TPAL_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_30_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"ALMA_IDRESPONSABLE"+"'), id:'"+"ALMA_IDRESPONSABLE"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV17Cent_Id) )
      {
         A1Cent_Id = AV17Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      if ( ! (0==AV17Cent_Id) )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtCent_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV17Cent_Id) )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV18Alma_Modulo)==0) )
      {
         A27Alma_Modulo = AV18Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      }
      if ( ! (GXutil.strcmp("", AV18Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      else
      {
         cmbAlma_Modulo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV18Alma_Modulo)==0) )
      {
         cmbAlma_Modulo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV16Alma_Codigo)==0) )
      {
         A28Alma_Codigo = AV16Alma_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV16Alma_Codigo)==0) )
      {
         edtAlma_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtAlma_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV16Alma_Codigo)==0) )
      {
         edtAlma_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_Tpal_Id) )
      {
         edtTpal_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpal_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Alma_IdResponsable) )
      {
         edtAlma_IdResponsable_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_IdResponsable_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_IdResponsable_Enabled, 5, 0)), true);
      }
      else
      {
         edtAlma_IdResponsable_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlma_IdResponsable_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_IdResponsable_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Alma_IdResponsable) )
      {
         A30Alma_IdResponsable = AV13Insert_Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_Tpal_Id) )
      {
         A29Tpal_Id = AV15Insert_Tpal_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
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
         /* Using cursor T00028 */
         pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T00028_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T00028_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         pr_default.close(6);
         AV24Pgmname = "ALM_ALMACEN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
         /* Using cursor T000210 */
         pr_default.execute(8, new Object[] {new Long(A30Alma_IdResponsable)});
         A266Alma_NombreResponsable = T000210_A266Alma_NombreResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
         n266Alma_NombreResponsable = T000210_n266Alma_NombreResponsable[0] ;
         A268Alma_EmailResponsable = T000210_A268Alma_EmailResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
         n268Alma_EmailResponsable = T000210_n268Alma_EmailResponsable[0] ;
         A265Alma_CedulaResponsable = T000210_A265Alma_CedulaResponsable[0] ;
         n265Alma_CedulaResponsable = T000210_n265Alma_CedulaResponsable[0] ;
         pr_default.close(8);
         AV21Alma_IdResponsableOld = O30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
         /* Using cursor T00029 */
         pr_default.execute(7, new Object[] {new Long(A29Tpal_Id)});
         A307Tpal_Descripcion = T00029_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         pr_default.close(7);
      }
   }

   public void load022( )
   {
      /* Using cursor T000211 */
      pr_default.execute(9, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A256Alma_UsuarioCrea = T000211_A256Alma_UsuarioCrea[0] ;
         n256Alma_UsuarioCrea = T000211_n256Alma_UsuarioCrea[0] ;
         A255Alma_FechaCrea = T000211_A255Alma_FechaCrea[0] ;
         n255Alma_FechaCrea = T000211_n255Alma_FechaCrea[0] ;
         A258Alma_UsuarioModifica = T000211_A258Alma_UsuarioModifica[0] ;
         n258Alma_UsuarioModifica = T000211_n258Alma_UsuarioModifica[0] ;
         A257Alma_FechaModifica = T000211_A257Alma_FechaModifica[0] ;
         n257Alma_FechaModifica = T000211_n257Alma_FechaModifica[0] ;
         A3Cent_Codigo = T000211_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000211_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A252Alma_Descripcion = T000211_A252Alma_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
         A307Tpal_Descripcion = T000211_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         A259Alma_Direccion = T000211_A259Alma_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A259Alma_Direccion", A259Alma_Direccion);
         n259Alma_Direccion = T000211_n259Alma_Direccion[0] ;
         A260Alma_Telefono1 = T000211_A260Alma_Telefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
         n260Alma_Telefono1 = T000211_n260Alma_Telefono1[0] ;
         A261Alma_Telefono2 = T000211_A261Alma_Telefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
         n261Alma_Telefono2 = T000211_n261Alma_Telefono2[0] ;
         A262Alma_Fax = T000211_A262Alma_Fax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
         n262Alma_Fax = T000211_n262Alma_Fax[0] ;
         A266Alma_NombreResponsable = T000211_A266Alma_NombreResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
         n266Alma_NombreResponsable = T000211_n266Alma_NombreResponsable[0] ;
         A268Alma_EmailResponsable = T000211_A268Alma_EmailResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
         n268Alma_EmailResponsable = T000211_n268Alma_EmailResponsable[0] ;
         A265Alma_CedulaResponsable = T000211_A265Alma_CedulaResponsable[0] ;
         n265Alma_CedulaResponsable = T000211_n265Alma_CedulaResponsable[0] ;
         A263Alma_CuentaDebito = T000211_A263Alma_CuentaDebito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
         n263Alma_CuentaDebito = T000211_n263Alma_CuentaDebito[0] ;
         A264Alma_CuentaCredito = T000211_A264Alma_CuentaCredito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
         n264Alma_CuentaCredito = T000211_n264Alma_CuentaCredito[0] ;
         A673Alma_Estado = T000211_A673Alma_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
         n673Alma_Estado = T000211_n673Alma_Estado[0] ;
         A29Tpal_Id = T000211_A29Tpal_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         A30Alma_IdResponsable = T000211_A30Alma_IdResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         zm022( -26) ;
      }
      pr_default.close(9);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
      AV24Pgmname = "ALM_ALMACEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      AV21Alma_IdResponsableOld = O30Alma_IdResponsable ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
   }

   public void checkExtendedTable022( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV24Pgmname = "ALM_ALMACEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      /* Using cursor T00028 */
      pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T00028_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T00028_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      pr_default.close(6);
      /* Using cursor T00029 */
      pr_default.execute(7, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ALMACÉN'.", "ForeignKeyNotFound", 1, "TPAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpal_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A307Tpal_Descripcion = T00029_A307Tpal_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
      pr_default.close(7);
      /* Using cursor T000210 */
      pr_default.execute(8, new Object[] {new Long(A30Alma_IdResponsable)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Responsable Almacen'.", "ForeignKeyNotFound", 1, "ALMA_IDRESPONSABLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlma_IdResponsable_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A266Alma_NombreResponsable = T000210_A266Alma_NombreResponsable[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
      n266Alma_NombreResponsable = T000210_n266Alma_NombreResponsable[0] ;
      A268Alma_EmailResponsable = T000210_A268Alma_EmailResponsable[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
      n268Alma_EmailResponsable = T000210_n268Alma_EmailResponsable[0] ;
      A265Alma_CedulaResponsable = T000210_A265Alma_CedulaResponsable[0] ;
      n265Alma_CedulaResponsable = T000210_n265Alma_CedulaResponsable[0] ;
      pr_default.close(8);
      AV21Alma_IdResponsableOld = O30Alma_IdResponsable ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
      if ( true /* After */ && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) )
      {
         GXv_int1[0] = A1Cent_Id ;
         GXv_char2[0] = A27Alma_Modulo ;
         GXv_char3[0] = A28Alma_Codigo ;
         GXv_int4[0] = AV21Alma_IdResponsableOld ;
         GXv_int5[0] = AV23Tran ;
         new com.orions2.pvalidaalmacenista(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_int4, GXv_int5) ;
         alm_almacen_impl.this.A1Cent_Id = GXv_int1[0] ;
         alm_almacen_impl.this.A27Alma_Modulo = GXv_char2[0] ;
         alm_almacen_impl.this.A28Alma_Codigo = GXv_char3[0] ;
         alm_almacen_impl.this.AV21Alma_IdResponsableOld = GXv_int4[0] ;
         alm_almacen_impl.this.AV23Tran = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran", GXutil.ltrim( GXutil.str( AV23Tran, 6, 0)));
      }
      if ( ( AV23Tran > 0 ) && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) )
      {
         httpContext.GX_msglist.addItem("No es posible cambiar el almacenista ya que tiene "+GXutil.str( AV23Tran, 6, 0)+" transacciones pendientes o incompletas", 1, "ALMA_IDRESPONSABLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlma_IdResponsable_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors022( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( long A1Cent_Id )
   {
      /* Using cursor T000212 */
      pr_default.execute(10, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T000212_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T000212_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A3Cent_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A4Cent_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_28( long A29Tpal_Id )
   {
      /* Using cursor T000213 */
      pr_default.execute(11, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ALMACÉN'.", "ForeignKeyNotFound", 1, "TPAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpal_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A307Tpal_Descripcion = T000213_A307Tpal_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A307Tpal_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_29( long A30Alma_IdResponsable )
   {
      /* Using cursor T000214 */
      pr_default.execute(12, new Object[] {new Long(A30Alma_IdResponsable)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Responsable Almacen'.", "ForeignKeyNotFound", 1, "ALMA_IDRESPONSABLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlma_IdResponsable_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A266Alma_NombreResponsable = T000214_A266Alma_NombreResponsable[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
      n266Alma_NombreResponsable = T000214_n266Alma_NombreResponsable[0] ;
      A268Alma_EmailResponsable = T000214_A268Alma_EmailResponsable[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
      n268Alma_EmailResponsable = T000214_n268Alma_EmailResponsable[0] ;
      A265Alma_CedulaResponsable = T000214_A265Alma_CedulaResponsable[0] ;
      n265Alma_CedulaResponsable = T000214_n265Alma_CedulaResponsable[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A266Alma_NombreResponsable)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A268Alma_EmailResponsable)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void getKey022( )
   {
      /* Using cursor T000215 */
      pr_default.execute(13, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00027 */
      pr_default.execute(5, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm022( 26) ;
         RcdFound2 = (short)(1) ;
         A27Alma_Modulo = T00027_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T00027_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         A256Alma_UsuarioCrea = T00027_A256Alma_UsuarioCrea[0] ;
         n256Alma_UsuarioCrea = T00027_n256Alma_UsuarioCrea[0] ;
         A255Alma_FechaCrea = T00027_A255Alma_FechaCrea[0] ;
         n255Alma_FechaCrea = T00027_n255Alma_FechaCrea[0] ;
         A258Alma_UsuarioModifica = T00027_A258Alma_UsuarioModifica[0] ;
         n258Alma_UsuarioModifica = T00027_n258Alma_UsuarioModifica[0] ;
         A257Alma_FechaModifica = T00027_A257Alma_FechaModifica[0] ;
         n257Alma_FechaModifica = T00027_n257Alma_FechaModifica[0] ;
         A252Alma_Descripcion = T00027_A252Alma_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
         A259Alma_Direccion = T00027_A259Alma_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A259Alma_Direccion", A259Alma_Direccion);
         n259Alma_Direccion = T00027_n259Alma_Direccion[0] ;
         A260Alma_Telefono1 = T00027_A260Alma_Telefono1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
         n260Alma_Telefono1 = T00027_n260Alma_Telefono1[0] ;
         A261Alma_Telefono2 = T00027_A261Alma_Telefono2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
         n261Alma_Telefono2 = T00027_n261Alma_Telefono2[0] ;
         A262Alma_Fax = T00027_A262Alma_Fax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
         n262Alma_Fax = T00027_n262Alma_Fax[0] ;
         A263Alma_CuentaDebito = T00027_A263Alma_CuentaDebito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
         n263Alma_CuentaDebito = T00027_n263Alma_CuentaDebito[0] ;
         A264Alma_CuentaCredito = T00027_A264Alma_CuentaCredito[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
         n264Alma_CuentaCredito = T00027_n264Alma_CuentaCredito[0] ;
         A673Alma_Estado = T00027_A673Alma_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
         n673Alma_Estado = T00027_n673Alma_Estado[0] ;
         A1Cent_Id = T00027_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A29Tpal_Id = T00027_A29Tpal_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
         A30Alma_IdResponsable = T00027_A30Alma_IdResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         O30Alma_IdResponsable = A30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
         Z1Cent_Id = A1Cent_Id ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T000216 */
      pr_default.execute(14, new Object[] {new Long(A1Cent_Id), new Long(A1Cent_Id), A27Alma_Modulo, A27Alma_Modulo, new Long(A1Cent_Id), A28Alma_Codigo});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T000216_A1Cent_Id[0] < A1Cent_Id ) || ( T000216_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000216_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) || ( GXutil.strcmp(T000216_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000216_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000216_A28Alma_Codigo[0], A28Alma_Codigo) < 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T000216_A1Cent_Id[0] > A1Cent_Id ) || ( T000216_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000216_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) || ( GXutil.strcmp(T000216_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000216_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000216_A28Alma_Codigo[0], A28Alma_Codigo) > 0 ) ) )
         {
            A1Cent_Id = T000216_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            A27Alma_Modulo = T000216_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = T000216_A28Alma_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T000217 */
      pr_default.execute(15, new Object[] {new Long(A1Cent_Id), new Long(A1Cent_Id), A27Alma_Modulo, A27Alma_Modulo, new Long(A1Cent_Id), A28Alma_Codigo});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T000217_A1Cent_Id[0] > A1Cent_Id ) || ( T000217_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000217_A27Alma_Modulo[0], A27Alma_Modulo) > 0 ) || ( GXutil.strcmp(T000217_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000217_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000217_A28Alma_Codigo[0], A28Alma_Codigo) > 0 ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T000217_A1Cent_Id[0] < A1Cent_Id ) || ( T000217_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000217_A27Alma_Modulo[0], A27Alma_Modulo) < 0 ) || ( GXutil.strcmp(T000217_A27Alma_Modulo[0], A27Alma_Modulo) == 0 ) && ( T000217_A1Cent_Id[0] == A1Cent_Id ) && ( GXutil.strcmp(T000217_A28Alma_Codigo[0], A28Alma_Codigo) < 0 ) ) )
         {
            A1Cent_Id = T000217_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            A27Alma_Modulo = T000217_A27Alma_Modulo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
            A28Alma_Codigo = T000217_A28Alma_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert022( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( ( A1Cent_Id != Z1Cent_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) )
            {
               A1Cent_Id = Z1Cent_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               A27Alma_Modulo = Z27Alma_Modulo ;
               httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
               A28Alma_Codigo = Z28Alma_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CENT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update022( ) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A1Cent_Id != Z1Cent_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert022( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CENT_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCent_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCent_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert022( ) ;
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
      if ( ( A1Cent_Id != Z1Cent_Id ) || ( GXutil.strcmp(A27Alma_Modulo, Z27Alma_Modulo) != 0 ) || ( GXutil.strcmp(A28Alma_Codigo, Z28Alma_Codigo) != 0 ) )
      {
         A1Cent_Id = Z1Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A27Alma_Modulo = Z27Alma_Modulo ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = Z28Alma_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency022( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00026 */
         pr_default.execute(4, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMACEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z256Alma_UsuarioCrea, T00026_A256Alma_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z255Alma_FechaCrea, T00026_A255Alma_FechaCrea[0]) ) || ( GXutil.strcmp(Z258Alma_UsuarioModifica, T00026_A258Alma_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z257Alma_FechaModifica, T00026_A257Alma_FechaModifica[0]) ) || ( GXutil.strcmp(Z252Alma_Descripcion, T00026_A252Alma_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z259Alma_Direccion, T00026_A259Alma_Direccion[0]) != 0 ) || ( Z260Alma_Telefono1 != T00026_A260Alma_Telefono1[0] ) || ( Z261Alma_Telefono2 != T00026_A261Alma_Telefono2[0] ) || ( Z262Alma_Fax != T00026_A262Alma_Fax[0] ) || ( GXutil.strcmp(Z263Alma_CuentaDebito, T00026_A263Alma_CuentaDebito[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z264Alma_CuentaCredito, T00026_A264Alma_CuentaCredito[0]) != 0 ) || ( GXutil.strcmp(Z673Alma_Estado, T00026_A673Alma_Estado[0]) != 0 ) || ( Z29Tpal_Id != T00026_A29Tpal_Id[0] ) || ( Z30Alma_IdResponsable != T00026_A30Alma_IdResponsable[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_ALMACEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         zm022( 0) ;
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000218 */
                  pr_default.execute(16, new Object[] {A27Alma_Modulo, A28Alma_Codigo, new Boolean(n256Alma_UsuarioCrea), A256Alma_UsuarioCrea, new Boolean(n255Alma_FechaCrea), A255Alma_FechaCrea, new Boolean(n258Alma_UsuarioModifica), A258Alma_UsuarioModifica, new Boolean(n257Alma_FechaModifica), A257Alma_FechaModifica, A252Alma_Descripcion, new Boolean(n259Alma_Direccion), A259Alma_Direccion, new Boolean(n260Alma_Telefono1), new Long(A260Alma_Telefono1), new Boolean(n261Alma_Telefono2), new Long(A261Alma_Telefono2), new Boolean(n262Alma_Fax), new Long(A262Alma_Fax), new Boolean(n263Alma_CuentaDebito), A263Alma_CuentaDebito, new Boolean(n264Alma_CuentaCredito), A264Alma_CuentaCredito, new Boolean(n673Alma_Estado), A673Alma_Estado, new Long(A1Cent_Id), new Long(A29Tpal_Id), new Long(A30Alma_IdResponsable)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN") ;
                  if ( (pr_default.getStatus(16) == 1) )
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
                        processLevel022( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption020( ) ;
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
            load022( ) ;
         }
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void update022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000219 */
                  pr_default.execute(17, new Object[] {new Boolean(n256Alma_UsuarioCrea), A256Alma_UsuarioCrea, new Boolean(n255Alma_FechaCrea), A255Alma_FechaCrea, new Boolean(n258Alma_UsuarioModifica), A258Alma_UsuarioModifica, new Boolean(n257Alma_FechaModifica), A257Alma_FechaModifica, A252Alma_Descripcion, new Boolean(n259Alma_Direccion), A259Alma_Direccion, new Boolean(n260Alma_Telefono1), new Long(A260Alma_Telefono1), new Boolean(n261Alma_Telefono2), new Long(A261Alma_Telefono2), new Boolean(n262Alma_Fax), new Long(A262Alma_Fax), new Boolean(n263Alma_CuentaDebito), A263Alma_CuentaDebito, new Boolean(n264Alma_CuentaCredito), A264Alma_CuentaCredito, new Boolean(n673Alma_Estado), A673Alma_Estado, new Long(A29Tpal_Id), new Long(A30Alma_IdResponsable), new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN") ;
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMACEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate022( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel022( ) ;
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
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void deferredUpdate022( )
   {
   }

   public void delete( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls022( ) ;
         afterConfirm022( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete022( ) ;
            if ( AnyError == 0 )
            {
               scanStart023( ) ;
               while ( RcdFound3 != 0 )
               {
                  getByPrimaryKey023( ) ;
                  delete023( ) ;
                  scanNext023( ) ;
               }
               scanEnd023( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000220 */
                  pr_default.execute(18, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN") ;
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel022( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls022( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV24Pgmname = "ALM_ALMACEN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
         /* Using cursor T000221 */
         pr_default.execute(19, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T000221_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000221_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         pr_default.close(19);
         /* Using cursor T000222 */
         pr_default.execute(20, new Object[] {new Long(A29Tpal_Id)});
         A307Tpal_Descripcion = T000222_A307Tpal_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
         pr_default.close(20);
         /* Using cursor T000223 */
         pr_default.execute(21, new Object[] {new Long(A30Alma_IdResponsable)});
         A266Alma_NombreResponsable = T000223_A266Alma_NombreResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
         n266Alma_NombreResponsable = T000223_n266Alma_NombreResponsable[0] ;
         A268Alma_EmailResponsable = T000223_A268Alma_EmailResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
         n268Alma_EmailResponsable = T000223_n268Alma_EmailResponsable[0] ;
         A265Alma_CedulaResponsable = T000223_A265Alma_CedulaResponsable[0] ;
         n265Alma_CedulaResponsable = T000223_n265Alma_CedulaResponsable[0] ;
         pr_default.close(21);
         AV21Alma_IdResponsableOld = O30Alma_IdResponsable ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
      }
   }

   public void processNestedLevel023( )
   {
      nGXsfl_100_idx = (short)(0) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow023( ) ;
         if ( ( nRcdExists_3 != 0 ) || ( nIsMod_3 != 0 ) )
         {
            standaloneNotModal023( ) ;
            getKey023( ) ;
            if ( ( nRcdExists_3 == 0 ) && ( nRcdDeleted_3 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert023( ) ;
            }
            else
            {
               if ( RcdFound3 != 0 )
               {
                  if ( ( nRcdDeleted_3 != 0 ) && ( nRcdExists_3 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete023( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_3 != 0 ) && ( nRcdExists_3 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update023( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_3 == 0 )
                  {
                     GXCCtl = "BODE_CODIGO_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBode_Codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBode_Codigo_Internalname, A31Bode_Codigo) ;
         httpContext.changePostValue( edtBBode_Descripcion_Internalname, A695BBode_Descripcion) ;
         httpContext.changePostValue( edtBArea_Codigo_Internalname, A32BArea_Codigo) ;
         httpContext.changePostValue( edtBArea_Descripcion_Internalname, A610BArea_Descripcion) ;
         httpContext.changePostValue( cmbBBode_Estado.getInternalname(), GXutil.rtrim( A696BBode_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z31Bode_Codigo_"+sGXsfl_100_idx, Z31Bode_Codigo) ;
         httpContext.changePostValue( "ZT_"+"Z695BBode_Descripcion_"+sGXsfl_100_idx, Z695BBode_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z696BBode_Estado_"+sGXsfl_100_idx, GXutil.rtrim( Z696BBode_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z32BArea_Codigo_"+sGXsfl_100_idx, Z32BArea_Codigo) ;
         httpContext.changePostValue( "nRcdDeleted_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_3, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_3, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_3_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_3, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_3 != 0 )
         {
            httpContext.changePostValue( "BODE_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBode_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BBODE_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBBode_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREA_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREA_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BBODE_ESTADO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBBode_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll023( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_3 = (short)(0) ;
      nIsMod_3 = (short)(0) ;
      nRcdDeleted_3 = (short)(0) ;
   }

   public void processLevel022( )
   {
      /* Save parent mode. */
      sMode2 = Gx_mode ;
      processNestedLevel023( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel022( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_almacen");
         if ( AnyError == 0 )
         {
            confirmValues020( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_almacen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart022( )
   {
      /* Scan By routine */
      /* Using cursor T000224 */
      pr_default.execute(22);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A1Cent_Id = T000224_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A27Alma_Modulo = T000224_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T000224_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A1Cent_Id = T000224_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A27Alma_Modulo = T000224_A27Alma_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         A28Alma_Codigo = T000224_A28Alma_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      }
   }

   public void scanEnd022( )
   {
      pr_default.close(22);
   }

   public void afterConfirm022( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A255Alma_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n255Alma_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A255Alma_FechaCrea", localUtil.ttoc( A255Alma_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A257Alma_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n257Alma_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A257Alma_FechaModifica", localUtil.ttoc( A257Alma_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A256Alma_UsuarioCrea = AV20Usuario ;
         n256Alma_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A256Alma_UsuarioCrea", A256Alma_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A258Alma_UsuarioModifica = AV20Usuario ;
         n258Alma_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A258Alma_UsuarioModifica", A258Alma_UsuarioModifica);
      }
      if ( ( AV23Tran == 0 ) && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) && true /* After */ )
      {
         GXv_int4[0] = A1Cent_Id ;
         GXv_char3[0] = A27Alma_Modulo ;
         GXv_char2[0] = A28Alma_Codigo ;
         GXv_int1[0] = A30Alma_IdResponsable ;
         new com.orions2.pcambiaalmacenista(remoteHandle, context).execute( GXv_int4, GXv_char3, GXv_char2, GXv_int1) ;
         alm_almacen_impl.this.A1Cent_Id = GXv_int4[0] ;
         alm_almacen_impl.this.A27Alma_Modulo = GXv_char3[0] ;
         alm_almacen_impl.this.A28Alma_Codigo = GXv_char2[0] ;
         alm_almacen_impl.this.A30Alma_IdResponsable = GXv_int1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      }
   }

   public void beforeInsert022( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate022( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete022( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete022( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate022( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes022( )
   {
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), true);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), true);
      cmbAlma_Modulo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Modulo.getEnabled(), 5, 0)), true);
      edtAlma_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Codigo_Enabled, 5, 0)), true);
      edtAlma_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Descripcion_Enabled, 5, 0)), true);
      edtTpal_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Id_Enabled, 5, 0)), true);
      edtTpal_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpal_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpal_Descripcion_Enabled, 5, 0)), true);
      edtAlma_Direccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Direccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Direccion_Enabled, 5, 0)), true);
      edtAlma_Telefono1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Telefono1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Telefono1_Enabled, 5, 0)), true);
      edtAlma_Telefono2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Telefono2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Telefono2_Enabled, 5, 0)), true);
      edtAlma_Fax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_Fax_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_Fax_Enabled, 5, 0)), true);
      edtAlma_IdResponsable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_IdResponsable_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_IdResponsable_Enabled, 5, 0)), true);
      edtAlma_NombreResponsable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_NombreResponsable_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_NombreResponsable_Enabled, 5, 0)), true);
      edtAlma_EmailResponsable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_EmailResponsable_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_EmailResponsable_Enabled, 5, 0)), true);
      edtAlma_CuentaDebito_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_CuentaDebito_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_CuentaDebito_Enabled, 5, 0)), true);
      edtAlma_CuentaCredito_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlma_CuentaCredito_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtAlma_CuentaCredito_Enabled, 5, 0)), true);
      cmbAlma_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbAlma_Estado.getEnabled(), 5, 0)), true);
   }

   public void zm023( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z695BBode_Descripcion = T00023_A695BBode_Descripcion[0] ;
            Z696BBode_Estado = T00023_A696BBode_Estado[0] ;
            Z32BArea_Codigo = T00023_A32BArea_Codigo[0] ;
         }
         else
         {
            Z695BBode_Descripcion = A695BBode_Descripcion ;
            Z696BBode_Estado = A696BBode_Estado ;
            Z32BArea_Codigo = A32BArea_Codigo ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         Z695BBode_Descripcion = A695BBode_Descripcion ;
         Z696BBode_Estado = A696BBode_Estado ;
         Z32BArea_Codigo = A32BArea_Codigo ;
         Z1Cent_Id = A1Cent_Id ;
         Z31Bode_Codigo = A31Bode_Codigo ;
         Z610BArea_Descripcion = A610BArea_Descripcion ;
      }
   }

   public void standaloneNotModal023( )
   {
   }

   public void standaloneModal023( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBode_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtBode_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      }
   }

   public void load023( )
   {
      /* Using cursor T000225 */
      pr_default.execute(23, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A695BBode_Descripcion = T000225_A695BBode_Descripcion[0] ;
         A610BArea_Descripcion = T000225_A610BArea_Descripcion[0] ;
         A696BBode_Estado = T000225_A696BBode_Estado[0] ;
         A32BArea_Codigo = T000225_A32BArea_Codigo[0] ;
         n32BArea_Codigo = T000225_n32BArea_Codigo[0] ;
         zm023( -30) ;
      }
      pr_default.close(23);
      onLoadActions023( ) ;
   }

   public void onLoadActions023( )
   {
   }

   public void checkExtendedTable023( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal023( ) ;
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A32BArea_Codigo)==0) || (0==A1Cent_Id) ) )
         {
            GXCCtl = "BAREA_CODIGO_" + sGXsfl_100_idx ;
            httpContext.GX_msglist.addItem("No existe 'ALAMCEN AREA'.", "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtBArea_Codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A610BArea_Descripcion = T00024_A610BArea_Descripcion[0] ;
      pr_default.close(2);
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "BODE_CODIGO_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors023( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable023( )
   {
   }

   public void gxload_31( String A32BArea_Codigo ,
                          long A1Cent_Id )
   {
      /* Using cursor T000226 */
      pr_default.execute(24, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A32BArea_Codigo)==0) || (0==A1Cent_Id) ) )
         {
            GXCCtl = "BAREA_CODIGO_" + sGXsfl_100_idx ;
            httpContext.GX_msglist.addItem("No existe 'ALAMCEN AREA'.", "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtBArea_Codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A610BArea_Descripcion = T000226_A610BArea_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A610BArea_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(24);
   }

   public void gxload_32( String A31Bode_Codigo )
   {
      /* Using cursor T000227 */
      pr_default.execute(25, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "BODE_CODIGO_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(25);
   }

   public void getKey023( )
   {
      /* Using cursor T000228 */
      pr_default.execute(26, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey023( )
   {
      /* Using cursor T00023 */
      pr_default.execute(1, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm023( 30) ;
         RcdFound3 = (short)(1) ;
         initializeNonKey023( ) ;
         A695BBode_Descripcion = T00023_A695BBode_Descripcion[0] ;
         A696BBode_Estado = T00023_A696BBode_Estado[0] ;
         A32BArea_Codigo = T00023_A32BArea_Codigo[0] ;
         n32BArea_Codigo = T00023_n32BArea_Codigo[0] ;
         A31Bode_Codigo = T00023_A31Bode_Codigo[0] ;
         Z1Cent_Id = A1Cent_Id ;
         Z27Alma_Modulo = A27Alma_Modulo ;
         Z28Alma_Codigo = A28Alma_Codigo ;
         Z31Bode_Codigo = A31Bode_Codigo ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load023( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey023( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal023( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes023( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency023( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00022 */
         pr_default.execute(0, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMACEN_BODEGAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z695BBode_Descripcion, T00022_A695BBode_Descripcion[0]) != 0 ) || ( GXutil.strcmp(Z696BBode_Estado, T00022_A696BBode_Estado[0]) != 0 ) || ( GXutil.strcmp(Z32BArea_Codigo, T00022_A32BArea_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_ALMACEN_BODEGAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert023( )
   {
      beforeValidate023( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable023( ) ;
      }
      if ( AnyError == 0 )
      {
         zm023( 0) ;
         checkOptimisticConcurrency023( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm023( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert023( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000229 */
                  pr_default.execute(27, new Object[] {A27Alma_Modulo, A28Alma_Codigo, A695BBode_Descripcion, A696BBode_Estado, new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id), A31Bode_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN_BODEGAS") ;
                  if ( (pr_default.getStatus(27) == 1) )
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
            load023( ) ;
         }
         endLevel023( ) ;
      }
      closeExtendedTableCursors023( ) ;
   }

   public void update023( )
   {
      beforeValidate023( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable023( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency023( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm023( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate023( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000230 */
                  pr_default.execute(28, new Object[] {A695BBode_Descripcion, A696BBode_Estado, new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN_BODEGAS") ;
                  if ( (pr_default.getStatus(28) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ALMACEN_BODEGAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate023( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey023( ) ;
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
         endLevel023( ) ;
      }
      closeExtendedTableCursors023( ) ;
   }

   public void deferredUpdate023( )
   {
   }

   public void delete023( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate023( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency023( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls023( ) ;
         afterConfirm023( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete023( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000231 */
               pr_default.execute(29, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ALMACEN_BODEGAS") ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel023( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls023( )
   {
      standaloneModal023( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000232 */
         pr_default.execute(30, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
         A610BArea_Descripcion = T000232_A610BArea_Descripcion[0] ;
         pr_default.close(30);
      }
   }

   public void endLevel023( )
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

   public void scanStart023( )
   {
      /* Scan By routine */
      /* Using cursor T000233 */
      pr_default.execute(31, new Object[] {new Long(A1Cent_Id), A27Alma_Modulo, A28Alma_Codigo});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A31Bode_Codigo = T000233_A31Bode_Codigo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext023( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A31Bode_Codigo = T000233_A31Bode_Codigo[0] ;
      }
   }

   public void scanEnd023( )
   {
      pr_default.close(31);
   }

   public void afterConfirm023( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert023( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate023( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete023( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete023( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate023( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes023( )
   {
      edtBode_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      edtBBode_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBBode_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBBode_Descripcion_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      edtBArea_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      edtBArea_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Descripcion_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
      cmbBBode_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBBode_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbBBode_Estado.getEnabled(), 5, 0)), !bGXsfl_100_Refreshing);
   }

   public void subsflControlProps_1003( )
   {
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_100_idx ;
      imgprompt_31_Internalname = "PROMPT_31_"+sGXsfl_100_idx ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION_"+sGXsfl_100_idx ;
      edtBArea_Codigo_Internalname = "BAREA_CODIGO_"+sGXsfl_100_idx ;
      imgprompt_32_Internalname = "PROMPT_32_"+sGXsfl_100_idx ;
      edtBArea_Descripcion_Internalname = "BAREA_DESCRIPCION_"+sGXsfl_100_idx ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO_"+sGXsfl_100_idx );
   }

   public void subsflControlProps_fel_1003( )
   {
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_100_fel_idx ;
      imgprompt_31_Internalname = "PROMPT_31_"+sGXsfl_100_fel_idx ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION_"+sGXsfl_100_fel_idx ;
      edtBArea_Codigo_Internalname = "BAREA_CODIGO_"+sGXsfl_100_fel_idx ;
      imgprompt_32_Internalname = "PROMPT_32_"+sGXsfl_100_fel_idx ;
      edtBArea_Descripcion_Internalname = "BAREA_DESCRIPCION_"+sGXsfl_100_fel_idx ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO_"+sGXsfl_100_fel_idx );
   }

   public void addRow023( )
   {
      nGXsfl_100_idx = (short)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1003( ) ;
      sendRow023( ) ;
   }

   public void sendRow023( )
   {
      Gridalm_almacen_bodegasRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_almacen_bodegas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_almacen_bodegas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_almacen_bodegas_Class, "") != 0 )
         {
            subGridalm_almacen_bodegas_Linesclass = subGridalm_almacen_bodegas_Class+"Odd" ;
         }
      }
      else if ( subGridalm_almacen_bodegas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_almacen_bodegas_Backstyle = (byte)(0) ;
         subGridalm_almacen_bodegas_Backcolor = subGridalm_almacen_bodegas_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_almacen_bodegas_Class, "") != 0 )
         {
            subGridalm_almacen_bodegas_Linesclass = subGridalm_almacen_bodegas_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_almacen_bodegas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_almacen_bodegas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_almacen_bodegas_Class, "") != 0 )
         {
            subGridalm_almacen_bodegas_Linesclass = subGridalm_almacen_bodegas_Class+"Odd" ;
         }
         subGridalm_almacen_bodegas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_almacen_bodegas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_almacen_bodegas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
         {
            subGridalm_almacen_bodegas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_almacen_bodegas_Class, "") != 0 )
            {
               subGridalm_almacen_bodegas_Linesclass = subGridalm_almacen_bodegas_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_almacen_bodegas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_almacen_bodegas_Class, "") != 0 )
            {
               subGridalm_almacen_bodegas_Linesclass = subGridalm_almacen_bodegas_Class+"Odd" ;
            }
         }
      }
      imgprompt_31_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00t0"+"',["+"{Ctrl:gx.dom.el('"+"BODE_CODIGO_"+sGXsfl_100_idx+"'), id:'"+"BODE_CODIGO_"+sGXsfl_100_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_3_"+sGXsfl_100_idx+","+"'', false"+","+"false"+");") ;
      imgprompt_32_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0091_1"+"',["+"{Ctrl:gx.dom.el('"+"BAREA_CODIGO_"+sGXsfl_100_idx+"'), id:'"+"BAREA_CODIGO_"+sGXsfl_100_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'in'}"+"],"+"gx.dom.form()."+"nIsMod_3_"+sGXsfl_100_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx0033"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CENT_ID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CENT_ID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ALMA_MODULO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"ALMA_MODULO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in''}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ALMA_CODIGO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"ALMA_CODIGO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"BODE_CODIGO_"',3),t(+,5),t(sGXsfl_100_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"BODE_CODIGO_"',3),t(+,5),t(sGXsfl_100_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_3_"',3),t(+,5),t(sGXsfl_100_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_1_27_28,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_3_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtBode_Codigo_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(100),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_31_Internalname,sImgUrl,imgprompt_31_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_31_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_3_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBBode_Descripcion_Internalname,A695BBode_Descripcion,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBBode_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtBBode_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(100),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_3_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBArea_Codigo_Internalname,A32BArea_Codigo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBArea_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtBArea_Codigo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(100),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_32_Internalname,sImgUrl,imgprompt_32_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_32_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_almacen_bodegasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBArea_Descripcion_Internalname,A610BArea_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBArea_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtBArea_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(100),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_3_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      if ( ( nGXsfl_100_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "BBODE_ESTADO_" + sGXsfl_100_idx ;
         cmbBBode_Estado.setName( GXCCtl );
         cmbBBode_Estado.setWebtags( "" );
         cmbBBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBBode_Estado.getItemCount() > 0 )
         {
            A696BBode_Estado = cmbBBode_Estado.getValidValue(A696BBode_Estado) ;
         }
      }
      /* ComboBox */
      Gridalm_almacen_bodegasRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBBode_Estado,cmbBBode_Estado.getInternalname(),GXutil.rtrim( A696BBode_Estado),new Integer(1),cmbBBode_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbBBode_Estado.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","",new Boolean(true)});
      cmbBBode_Estado.setValue( GXutil.rtrim( A696BBode_Estado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBBode_Estado.getInternalname(), "Values", cmbBBode_Estado.ToJavascriptSource(), !bGXsfl_100_Refreshing);
      httpContext.ajax_sending_grid_row(Gridalm_almacen_bodegasRow);
      GXCCtl = "Z31Bode_Codigo_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z31Bode_Codigo);
      GXCCtl = "Z695BBode_Descripcion_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z695BBode_Descripcion);
      GXCCtl = "Z696BBode_Estado_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z696BBode_Estado));
      GXCCtl = "Z32BArea_Codigo_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z32BArea_Codigo);
      GXCCtl = "nRcdDeleted_3_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_3, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_3_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_3, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_3_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_3, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_100_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV9TrnContext);
      }
      GXCCtl = "vCENT_ID_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV17Cent_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "vALMA_MODULO_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV18Alma_Modulo);
      GXCCtl = "vALMA_CODIGO_" + sGXsfl_100_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV16Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBode_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBBode_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BAREA_CODIGO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BAREA_DESCRIPCION_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBArea_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BBODE_ESTADO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBBode_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_31_"+sGXsfl_100_idx+"Link", GXutil.rtrim( imgprompt_31_Link));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_32_"+sGXsfl_100_idx+"Link", GXutil.rtrim( imgprompt_32_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_almacen_bodegasContainer.AddRow(Gridalm_almacen_bodegasRow);
   }

   public void readRow023( )
   {
      nGXsfl_100_idx = (short)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1003( ) ;
      edtBode_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BODE_CODIGO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
      edtBBode_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BBODE_DESCRIPCION_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
      edtBArea_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREA_CODIGO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
      edtBArea_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREA_DESCRIPCION_"+sGXsfl_100_idx+"Enabled"), ",", ".")) ;
      cmbBBode_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BBODE_ESTADO_"+sGXsfl_100_idx+"Enabled"), ",", ".")) );
      imgprompt_1_Link = httpContext.cgiGet( "PROMPT_31_"+sGXsfl_100_idx+"Link") ;
      imgprompt_1_Link = httpContext.cgiGet( "PROMPT_32_"+sGXsfl_100_idx+"Link") ;
      A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
      A695BBode_Descripcion = httpContext.cgiGet( edtBBode_Descripcion_Internalname) ;
      A32BArea_Codigo = httpContext.cgiGet( edtBArea_Codigo_Internalname) ;
      n32BArea_Codigo = false ;
      n32BArea_Codigo = ((GXutil.strcmp("", A32BArea_Codigo)==0) ? true : false) ;
      A610BArea_Descripcion = httpContext.cgiGet( edtBArea_Descripcion_Internalname) ;
      cmbBBode_Estado.setName( cmbBBode_Estado.getInternalname() );
      cmbBBode_Estado.setValue( httpContext.cgiGet( cmbBBode_Estado.getInternalname()) );
      A696BBode_Estado = httpContext.cgiGet( cmbBBode_Estado.getInternalname()) ;
      GXCCtl = "Z31Bode_Codigo_" + sGXsfl_100_idx ;
      Z31Bode_Codigo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z695BBode_Descripcion_" + sGXsfl_100_idx ;
      Z695BBode_Descripcion = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z696BBode_Estado_" + sGXsfl_100_idx ;
      Z696BBode_Estado = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z32BArea_Codigo_" + sGXsfl_100_idx ;
      Z32BArea_Codigo = httpContext.cgiGet( GXCCtl) ;
      n32BArea_Codigo = ((GXutil.strcmp("", A32BArea_Codigo)==0) ? true : false) ;
      GXCCtl = "nRcdDeleted_3_" + sGXsfl_100_idx ;
      nRcdDeleted_3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_3_" + sGXsfl_100_idx ;
      nRcdExists_3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_3_" + sGXsfl_100_idx ;
      nIsMod_3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtBode_Codigo_Enabled = edtBode_Codigo_Enabled ;
   }

   public void confirmValues020( )
   {
      nGXsfl_100_idx = (short)(0) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1003( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (short)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1003( ) ;
         httpContext.changePostValue( "Z31Bode_Codigo_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z31Bode_Codigo_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z31Bode_Codigo_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z695BBode_Descripcion_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z695BBode_Descripcion_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z695BBode_Descripcion_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z696BBode_Estado_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z696BBode_Estado_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z696BBode_Estado_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z32BArea_Codigo_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z32BArea_Codigo_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z32BArea_Codigo_"+sGXsfl_100_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414113316");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16Alma_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z1Cent_Id", GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z27Alma_Modulo", Z27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z28Alma_Codigo", Z28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z256Alma_UsuarioCrea", Z256Alma_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z255Alma_FechaCrea", localUtil.ttoc( Z255Alma_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z258Alma_UsuarioModifica", Z258Alma_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z257Alma_FechaModifica", localUtil.ttoc( Z257Alma_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z252Alma_Descripcion", Z252Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z259Alma_Direccion", Z259Alma_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z260Alma_Telefono1", GXutil.ltrim( localUtil.ntoc( Z260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z261Alma_Telefono2", GXutil.ltrim( localUtil.ntoc( Z261Alma_Telefono2, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z262Alma_Fax", GXutil.ltrim( localUtil.ntoc( Z262Alma_Fax, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z263Alma_CuentaDebito", Z263Alma_CuentaDebito);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z264Alma_CuentaCredito", Z264Alma_CuentaCredito);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z673Alma_Estado", GXutil.rtrim( Z673Alma_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z29Tpal_Id", GXutil.ltrim( localUtil.ntoc( Z29Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z30Alma_IdResponsable", GXutil.ltrim( localUtil.ntoc( Z30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O30Alma_IdResponsable", GXutil.ltrim( localUtil.ntoc( O30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N29Tpal_Id", GXutil.ltrim( localUtil.ntoc( A29Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N30Alma_IdResponsable", GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV17Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV18Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV16Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TPAL_ID", GXutil.ltrim( localUtil.ntoc( AV15Insert_Tpal_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALMA_IDRESPONSABLE", GXutil.ltrim( localUtil.ntoc( AV13Insert_Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV20Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_USUARIOCREA", A256Alma_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_FECHACREA", localUtil.ttoc( A255Alma_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_USUARIOMODIFICA", A258Alma_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_FECHAMODIFICA", localUtil.ttoc( A257Alma_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_IDRESPONSABLEOLD", GXutil.ltrim( localUtil.ntoc( AV21Alma_IdResponsableOld, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN", GXutil.ltrim( localUtil.ntoc( AV23Tran, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CEDULARESPONSABLE", GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV24Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Alma_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_ALMACEN" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_almacen:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16Alma_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_ALMACEN" ;
   }

   public String getPgmdesc( )
   {
      return "Almacén" ;
   }

   public void initializeNonKey022( )
   {
      A29Tpal_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A29Tpal_Id", GXutil.ltrim( GXutil.str( A29Tpal_Id, 11, 0)));
      A30Alma_IdResponsable = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      A256Alma_UsuarioCrea = "" ;
      n256Alma_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A256Alma_UsuarioCrea", A256Alma_UsuarioCrea);
      A255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n255Alma_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A255Alma_FechaCrea", localUtil.ttoc( A255Alma_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A258Alma_UsuarioModifica = "" ;
      n258Alma_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A258Alma_UsuarioModifica", A258Alma_UsuarioModifica);
      A257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n257Alma_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A257Alma_FechaModifica", localUtil.ttoc( A257Alma_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      AV21Alma_IdResponsableOld = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
      A3Cent_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A252Alma_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A252Alma_Descripcion", A252Alma_Descripcion);
      A307Tpal_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A307Tpal_Descripcion", A307Tpal_Descripcion);
      A259Alma_Direccion = "" ;
      n259Alma_Direccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A259Alma_Direccion", A259Alma_Direccion);
      n259Alma_Direccion = ((GXutil.strcmp("", A259Alma_Direccion)==0) ? true : false) ;
      A260Alma_Telefono1 = 0 ;
      n260Alma_Telefono1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A260Alma_Telefono1", GXutil.ltrim( GXutil.str( A260Alma_Telefono1, 18, 0)));
      n260Alma_Telefono1 = ((0==A260Alma_Telefono1) ? true : false) ;
      A261Alma_Telefono2 = 0 ;
      n261Alma_Telefono2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A261Alma_Telefono2", GXutil.ltrim( GXutil.str( A261Alma_Telefono2, 18, 0)));
      n261Alma_Telefono2 = ((0==A261Alma_Telefono2) ? true : false) ;
      A262Alma_Fax = 0 ;
      n262Alma_Fax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A262Alma_Fax", GXutil.ltrim( GXutil.str( A262Alma_Fax, 18, 0)));
      n262Alma_Fax = ((0==A262Alma_Fax) ? true : false) ;
      A266Alma_NombreResponsable = "" ;
      n266Alma_NombreResponsable = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266Alma_NombreResponsable", A266Alma_NombreResponsable);
      A268Alma_EmailResponsable = "" ;
      n268Alma_EmailResponsable = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A268Alma_EmailResponsable", A268Alma_EmailResponsable);
      A265Alma_CedulaResponsable = 0 ;
      n265Alma_CedulaResponsable = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265Alma_CedulaResponsable", GXutil.ltrim( GXutil.str( A265Alma_CedulaResponsable, 18, 0)));
      A263Alma_CuentaDebito = "" ;
      n263Alma_CuentaDebito = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263Alma_CuentaDebito", A263Alma_CuentaDebito);
      n263Alma_CuentaDebito = ((GXutil.strcmp("", A263Alma_CuentaDebito)==0) ? true : false) ;
      A264Alma_CuentaCredito = "" ;
      n264Alma_CuentaCredito = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264Alma_CuentaCredito", A264Alma_CuentaCredito);
      n264Alma_CuentaCredito = ((GXutil.strcmp("", A264Alma_CuentaCredito)==0) ? true : false) ;
      A673Alma_Estado = "" ;
      n673Alma_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
      n673Alma_Estado = ((GXutil.strcmp("", A673Alma_Estado)==0) ? true : false) ;
      AV23Tran = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Tran", GXutil.ltrim( GXutil.str( AV23Tran, 6, 0)));
      O30Alma_IdResponsable = A30Alma_IdResponsable ;
      httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      Z256Alma_UsuarioCrea = "" ;
      Z255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z258Alma_UsuarioModifica = "" ;
      Z257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z252Alma_Descripcion = "" ;
      Z259Alma_Direccion = "" ;
      Z260Alma_Telefono1 = 0 ;
      Z261Alma_Telefono2 = 0 ;
      Z262Alma_Fax = 0 ;
      Z263Alma_CuentaDebito = "" ;
      Z264Alma_CuentaCredito = "" ;
      Z673Alma_Estado = "" ;
      Z29Tpal_Id = 0 ;
      Z30Alma_IdResponsable = 0 ;
   }

   public void initAll022( )
   {
      A1Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      A27Alma_Modulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
      A28Alma_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
      initializeNonKey022( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey023( )
   {
      A695BBode_Descripcion = "" ;
      A32BArea_Codigo = "" ;
      n32BArea_Codigo = false ;
      A610BArea_Descripcion = "" ;
      A696BBode_Estado = "" ;
      Z695BBode_Descripcion = "" ;
      Z696BBode_Estado = "" ;
      Z32BArea_Codigo = "" ;
   }

   public void initAll023( )
   {
      A31Bode_Codigo = "" ;
      initializeNonKey023( ) ;
   }

   public void standaloneModalInsert023( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414113337");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_almacen.js", "?201861414113339");
      /* End function include_jscripts */
   }

   public void init_level_properties3( )
   {
      edtBode_Codigo_Enabled = defedtBode_Codigo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBode_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBode_Codigo_Enabled, 5, 0)), !bGXsfl_100_Refreshing);
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
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION" ;
      edtTpal_Id_Internalname = "TPAL_ID" ;
      edtTpal_Descripcion_Internalname = "TPAL_DESCRIPCION" ;
      edtAlma_Direccion_Internalname = "ALMA_DIRECCION" ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1" ;
      edtAlma_Telefono2_Internalname = "ALMA_TELEFONO2" ;
      edtAlma_Fax_Internalname = "ALMA_FAX" ;
      edtAlma_IdResponsable_Internalname = "ALMA_IDRESPONSABLE" ;
      edtAlma_NombreResponsable_Internalname = "ALMA_NOMBRERESPONSABLE" ;
      edtAlma_EmailResponsable_Internalname = "ALMA_EMAILRESPONSABLE" ;
      edtAlma_CuentaDebito_Internalname = "ALMA_CUENTADEBITO" ;
      edtAlma_CuentaCredito_Internalname = "ALMA_CUENTACREDITO" ;
      cmbAlma_Estado.setInternalname( "ALMA_ESTADO" );
      lblTitlebodegas_Internalname = "TITLEBODEGAS" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtBBode_Descripcion_Internalname = "BBODE_DESCRIPCION" ;
      edtBArea_Codigo_Internalname = "BAREA_CODIGO" ;
      edtBArea_Descripcion_Internalname = "BAREA_DESCRIPCION" ;
      cmbBBode_Estado.setInternalname( "BBODE_ESTADO" );
      divBodegastable_Internalname = "BODEGASTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1_Internalname = "PROMPT_1" ;
      imgprompt_29_Internalname = "PROMPT_29" ;
      imgprompt_30_Internalname = "PROMPT_30" ;
      imgprompt_31_Internalname = "PROMPT_31" ;
      imgprompt_32_Internalname = "PROMPT_32" ;
      subGridalm_almacen_bodegas_Internalname = "GRIDALM_ALMACEN_BODEGAS" ;
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
      Form.setCaption( "Almacén" );
      cmbBBode_Estado.setJsonclick( "" );
      edtBArea_Descripcion_Jsonclick = "" ;
      imgprompt_32_Visible = 1 ;
      imgprompt_32_Link = "" ;
      edtBArea_Codigo_Jsonclick = "" ;
      edtBBode_Descripcion_Jsonclick = "" ;
      imgprompt_31_Visible = 1 ;
      imgprompt_31_Link = "" ;
      imgprompt_1_Visible = 1 ;
      edtBode_Codigo_Jsonclick = "" ;
      subGridalm_almacen_bodegas_Class = "Grid" ;
      subGridalm_almacen_bodegas_Backcolorstyle = (byte)(0) ;
      subGridalm_almacen_bodegas_Allowcollapsing = (byte)(0) ;
      subGridalm_almacen_bodegas_Allowselection = (byte)(0) ;
      cmbBBode_Estado.setEnabled( 1 );
      edtBArea_Descripcion_Enabled = 0 ;
      edtBArea_Codigo_Enabled = 1 ;
      edtBBode_Descripcion_Enabled = 1 ;
      edtBode_Codigo_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbAlma_Estado.setJsonclick( "" );
      cmbAlma_Estado.setEnabled( 1 );
      edtAlma_CuentaCredito_Jsonclick = "" ;
      edtAlma_CuentaCredito_Enabled = 1 ;
      edtAlma_CuentaDebito_Jsonclick = "" ;
      edtAlma_CuentaDebito_Enabled = 1 ;
      edtAlma_EmailResponsable_Jsonclick = "" ;
      edtAlma_EmailResponsable_Enabled = 0 ;
      edtAlma_NombreResponsable_Jsonclick = "" ;
      edtAlma_NombreResponsable_Enabled = 0 ;
      imgprompt_30_Visible = 1 ;
      imgprompt_30_Link = "" ;
      edtAlma_IdResponsable_Jsonclick = "" ;
      edtAlma_IdResponsable_Enabled = 1 ;
      edtAlma_Fax_Jsonclick = "" ;
      edtAlma_Fax_Enabled = 1 ;
      edtAlma_Telefono2_Jsonclick = "" ;
      edtAlma_Telefono2_Enabled = 1 ;
      edtAlma_Telefono1_Jsonclick = "" ;
      edtAlma_Telefono1_Enabled = 1 ;
      edtAlma_Direccion_Enabled = 1 ;
      edtTpal_Descripcion_Jsonclick = "" ;
      edtTpal_Descripcion_Enabled = 0 ;
      imgprompt_29_Visible = 1 ;
      imgprompt_29_Link = "" ;
      edtTpal_Id_Jsonclick = "" ;
      edtTpal_Id_Enabled = 1 ;
      edtAlma_Descripcion_Jsonclick = "" ;
      edtAlma_Descripcion_Enabled = 1 ;
      edtAlma_Codigo_Jsonclick = "" ;
      edtAlma_Codigo_Enabled = 1 ;
      cmbAlma_Modulo.setJsonclick( "" );
      cmbAlma_Modulo.setEnabled( 1 );
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 1 ;
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

   public void xc_23_022( long A1Cent_Id ,
                          String A27Alma_Modulo ,
                          String A28Alma_Codigo ,
                          long AV21Alma_IdResponsableOld ,
                          int AV23Tran ,
                          long A30Alma_IdResponsable )
   {
      if ( true /* After */ && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) )
      {
         GXv_int4[0] = A1Cent_Id ;
         GXv_char3[0] = A27Alma_Modulo ;
         GXv_char2[0] = A28Alma_Codigo ;
         GXv_int1[0] = AV21Alma_IdResponsableOld ;
         GXv_int5[0] = AV23Tran ;
         new com.orions2.pvalidaalmacenista(remoteHandle, context).execute( GXv_int4, GXv_char3, GXv_char2, GXv_int1, GXv_int5) ;
         A1Cent_Id = GXv_int4[0] ;
         A27Alma_Modulo = GXv_char3[0] ;
         A28Alma_Codigo = GXv_char2[0] ;
         AV21Alma_IdResponsableOld = GXv_int1[0] ;
         AV23Tran = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "AV21Alma_IdResponsableOld", GXutil.ltrim( GXutil.str( AV21Alma_IdResponsableOld, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran", GXutil.ltrim( GXutil.str( AV23Tran, 6, 0)));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A27Alma_Modulo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A28Alma_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Alma_IdResponsableOld, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV23Tran, (byte)(6), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_25_022( long A1Cent_Id ,
                          String A27Alma_Modulo ,
                          String A28Alma_Codigo ,
                          long A30Alma_IdResponsable ,
                          int AV23Tran ,
                          long AV21Alma_IdResponsableOld )
   {
      if ( ( AV23Tran == 0 ) && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) && true /* After */ )
      {
         GXv_int4[0] = A1Cent_Id ;
         GXv_char3[0] = A27Alma_Modulo ;
         GXv_char2[0] = A28Alma_Codigo ;
         GXv_int1[0] = A30Alma_IdResponsable ;
         new com.orions2.pcambiaalmacenista(remoteHandle, context).execute( GXv_int4, GXv_char3, GXv_char2, GXv_int1) ;
         A1Cent_Id = GXv_int4[0] ;
         A27Alma_Modulo = GXv_char3[0] ;
         A28Alma_Codigo = GXv_char2[0] ;
         A30Alma_IdResponsable = GXv_int1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A27Alma_Modulo", A27Alma_Modulo);
         httpContext.ajax_rsp_assign_attri("", false, "A28Alma_Codigo", A28Alma_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "A30Alma_IdResponsable", GXutil.ltrim( GXutil.str( A30Alma_IdResponsable, 18, 0)));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A27Alma_Modulo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A28Alma_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridalm_almacen_bodegas_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_1003( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal023( ) ;
         standaloneModal023( ) ;
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
         cmbAlma_Estado.setName( "ALMA_ESTADO" );
         cmbAlma_Estado.setWebtags( "" );
         cmbAlma_Estado.addItem("A", "Activo", (short)(0));
         cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlma_Estado.getItemCount() > 0 )
         {
            A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
            n673Alma_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A673Alma_Estado", A673Alma_Estado);
         }
         GXCCtl = "BBODE_ESTADO_" + sGXsfl_100_idx ;
         cmbBBode_Estado.setName( GXCCtl );
         cmbBBode_Estado.setWebtags( "" );
         cmbBBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBBode_Estado.getItemCount() > 0 )
         {
            A696BBode_Estado = cmbBBode_Estado.getValidValue(A696BBode_Estado) ;
         }
         dynload_actions( ) ;
         sendRow023( ) ;
         nGXsfl_100_idx = (short)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1003( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_almacen_bodegasContainer.ToJavascriptSource());
      /* End function gxnrGridalm_almacen_bodegas_newrow */
   }

   public void valid_Cent_id( long GX_Parm1 ,
                              String GX_Parm2 ,
                              String GX_Parm3 )
   {
      A1Cent_Id = GX_Parm1 ;
      A3Cent_Codigo = GX_Parm2 ;
      A4Cent_Descripcion = GX_Parm3 ;
      /* Using cursor T000221 */
      pr_default.execute(19, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
      }
      A3Cent_Codigo = T000221_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000221_A4Cent_Descripcion[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A3Cent_Codigo = "" ;
         A4Cent_Descripcion = "" ;
      }
      isValidOutput.add(A3Cent_Codigo);
      isValidOutput.add(A4Cent_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tpal_id( long GX_Parm1 ,
                              String GX_Parm2 )
   {
      A29Tpal_Id = GX_Parm1 ;
      A307Tpal_Descripcion = GX_Parm2 ;
      /* Using cursor T000222 */
      pr_default.execute(20, new Object[] {new Long(A29Tpal_Id)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ALMACÉN'.", "ForeignKeyNotFound", 1, "TPAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpal_Id_Internalname ;
      }
      A307Tpal_Descripcion = T000222_A307Tpal_Descripcion[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A307Tpal_Descripcion = "" ;
      }
      isValidOutput.add(A307Tpal_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Alma_idresponsable( String GX_Parm1 ,
                                         com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                         long GX_Parm3 ,
                                         long GX_Parm4 ,
                                         long GX_Parm5 ,
                                         int GX_Parm6 ,
                                         long GX_Parm7 ,
                                         String GX_Parm8 ,
                                         String GX_Parm9 ,
                                         long GX_Parm10 )
   {
      A28Alma_Codigo = GX_Parm1 ;
      cmbAlma_Modulo = GX_Parm2 ;
      A27Alma_Modulo = cmbAlma_Modulo.getValue() ;
      cmbAlma_Modulo.setValue( A27Alma_Modulo );
      A1Cent_Id = GX_Parm3 ;
      O30Alma_IdResponsable = GX_Parm4 ;
      A30Alma_IdResponsable = GX_Parm5 ;
      AV23Tran = GX_Parm6 ;
      AV21Alma_IdResponsableOld = GX_Parm7 ;
      A266Alma_NombreResponsable = GX_Parm8 ;
      n266Alma_NombreResponsable = false ;
      A268Alma_EmailResponsable = GX_Parm9 ;
      n268Alma_EmailResponsable = false ;
      A265Alma_CedulaResponsable = GX_Parm10 ;
      n265Alma_CedulaResponsable = false ;
      /* Using cursor T000223 */
      pr_default.execute(21, new Object[] {new Long(A30Alma_IdResponsable)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Responsable Almacen'.", "ForeignKeyNotFound", 1, "ALMA_IDRESPONSABLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlma_IdResponsable_Internalname ;
      }
      A266Alma_NombreResponsable = T000223_A266Alma_NombreResponsable[0] ;
      n266Alma_NombreResponsable = T000223_n266Alma_NombreResponsable[0] ;
      A268Alma_EmailResponsable = T000223_A268Alma_EmailResponsable[0] ;
      n268Alma_EmailResponsable = T000223_n268Alma_EmailResponsable[0] ;
      A265Alma_CedulaResponsable = T000223_A265Alma_CedulaResponsable[0] ;
      n265Alma_CedulaResponsable = T000223_n265Alma_CedulaResponsable[0] ;
      pr_default.close(21);
      AV21Alma_IdResponsableOld = O30Alma_IdResponsable ;
      if ( true /* After */ && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) )
      {
         GXv_int4[0] = A1Cent_Id ;
         GXv_char3[0] = A27Alma_Modulo ;
         GXv_char2[0] = A28Alma_Codigo ;
         GXv_int1[0] = AV21Alma_IdResponsableOld ;
         GXv_int5[0] = AV23Tran ;
         new com.orions2.pvalidaalmacenista(remoteHandle, context).execute( GXv_int4, GXv_char3, GXv_char2, GXv_int1, GXv_int5) ;
         alm_almacen_impl.this.A1Cent_Id = GXv_int4[0] ;
         A1Cent_Id = this.A1Cent_Id ;
         alm_almacen_impl.this.A27Alma_Modulo = GXv_char3[0] ;
         A27Alma_Modulo = this.A27Alma_Modulo ;
         alm_almacen_impl.this.A28Alma_Codigo = GXv_char2[0] ;
         A28Alma_Codigo = this.A28Alma_Codigo ;
         alm_almacen_impl.this.AV21Alma_IdResponsableOld = GXv_int1[0] ;
         AV21Alma_IdResponsableOld = this.AV21Alma_IdResponsableOld ;
         alm_almacen_impl.this.AV23Tran = GXv_int5[0] ;
         AV23Tran = this.AV23Tran ;
         cmbAlma_Modulo.setValue( A27Alma_Modulo );
      }
      if ( ( AV23Tran > 0 ) && ( A30Alma_IdResponsable != AV21Alma_IdResponsableOld ) )
      {
         httpContext.GX_msglist.addItem("No es posible cambiar el almacenista ya que tiene "+GXutil.str( AV23Tran, 6, 0)+" transacciones pendientes o incompletas", 1, "ALMA_IDRESPONSABLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlma_IdResponsable_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A266Alma_NombreResponsable = "" ;
         n266Alma_NombreResponsable = false ;
         A268Alma_EmailResponsable = "" ;
         n268Alma_EmailResponsable = false ;
         A265Alma_CedulaResponsable = 0 ;
         n265Alma_CedulaResponsable = false ;
      }
      isValidOutput.add(A266Alma_NombreResponsable);
      isValidOutput.add(A268Alma_EmailResponsable);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      cmbAlma_Modulo.setValue( A27Alma_Modulo );
      isValidOutput.add(cmbAlma_Modulo);
      isValidOutput.add(A28Alma_Codigo);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( AV21Alma_IdResponsableOld, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( AV23Tran, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Bode_codigo( String GX_Parm1 )
   {
      A31Bode_Codigo = GX_Parm1 ;
      /* Using cursor T000234 */
      pr_default.execute(32, new Object[] {A31Bode_Codigo});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Bodega'.", "ForeignKeyNotFound", 1, "BODE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBode_Codigo_Internalname ;
      }
      pr_default.close(32);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Barea_codigo( String GX_Parm1 ,
                                   long GX_Parm2 ,
                                   String GX_Parm3 )
   {
      A32BArea_Codigo = GX_Parm1 ;
      n32BArea_Codigo = false ;
      A1Cent_Id = GX_Parm2 ;
      A610BArea_Descripcion = GX_Parm3 ;
      /* Using cursor T000232 */
      pr_default.execute(30, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A32BArea_Codigo)==0) || (0==A1Cent_Id) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'ALAMCEN AREA'.", "ForeignKeyNotFound", 1, "BAREA_CODIGO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBArea_Codigo_Internalname ;
         }
      }
      A610BArea_Descripcion = T000232_A610BArea_Descripcion[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A610BArea_Descripcion = "" ;
      }
      isValidOutput.add(A610BArea_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV17Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV18Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12022',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(30);
      pr_default.close(32);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV18Alma_Modulo = "" ;
      wcpOAV16Alma_Codigo = "" ;
      Z27Alma_Modulo = "" ;
      Z28Alma_Codigo = "" ;
      Z256Alma_UsuarioCrea = "" ;
      Z255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z258Alma_UsuarioModifica = "" ;
      Z257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z252Alma_Descripcion = "" ;
      Z259Alma_Direccion = "" ;
      Z263Alma_CuentaDebito = "" ;
      Z264Alma_CuentaCredito = "" ;
      Z673Alma_Estado = "" ;
      Z31Bode_Codigo = "" ;
      Z695BBode_Descripcion = "" ;
      Z696BBode_Estado = "" ;
      Z32BArea_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A32BArea_Codigo = "" ;
      A31Bode_Codigo = "" ;
      Gx_mode = "" ;
      AV18Alma_Modulo = "" ;
      AV16Alma_Codigo = "" ;
      GXKey = "" ;
      A673Alma_Estado = "" ;
      GXCCtl = "" ;
      A696BBode_Estado = "" ;
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
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A252Alma_Descripcion = "" ;
      A307Tpal_Descripcion = "" ;
      A259Alma_Direccion = "" ;
      A266Alma_NombreResponsable = "" ;
      A268Alma_EmailResponsable = "" ;
      A263Alma_CuentaDebito = "" ;
      A264Alma_CuentaCredito = "" ;
      lblTitlebodegas_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_almacen_bodegasContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_almacen_bodegasColumn = new com.genexus.webpanels.GXWebColumn();
      A695BBode_Descripcion = "" ;
      A610BArea_Descripcion = "" ;
      sMode3 = "" ;
      sStyleString = "" ;
      A256Alma_UsuarioCrea = "" ;
      A255Alma_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A258Alma_UsuarioModifica = "" ;
      A257Alma_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV20Usuario = "" ;
      AV24Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      AV12TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z3Cent_Codigo = "" ;
      Z4Cent_Descripcion = "" ;
      Z307Tpal_Descripcion = "" ;
      Z266Alma_NombreResponsable = "" ;
      Z268Alma_EmailResponsable = "" ;
      T00028_A3Cent_Codigo = new String[] {""} ;
      T00028_A4Cent_Descripcion = new String[] {""} ;
      T000210_A266Alma_NombreResponsable = new String[] {""} ;
      T000210_n266Alma_NombreResponsable = new boolean[] {false} ;
      T000210_A268Alma_EmailResponsable = new String[] {""} ;
      T000210_n268Alma_EmailResponsable = new boolean[] {false} ;
      T000210_A265Alma_CedulaResponsable = new long[1] ;
      T000210_n265Alma_CedulaResponsable = new boolean[] {false} ;
      T00029_A307Tpal_Descripcion = new String[] {""} ;
      T000211_A27Alma_Modulo = new String[] {""} ;
      T000211_A28Alma_Codigo = new String[] {""} ;
      T000211_A256Alma_UsuarioCrea = new String[] {""} ;
      T000211_n256Alma_UsuarioCrea = new boolean[] {false} ;
      T000211_A255Alma_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000211_n255Alma_FechaCrea = new boolean[] {false} ;
      T000211_A258Alma_UsuarioModifica = new String[] {""} ;
      T000211_n258Alma_UsuarioModifica = new boolean[] {false} ;
      T000211_A257Alma_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000211_n257Alma_FechaModifica = new boolean[] {false} ;
      T000211_A3Cent_Codigo = new String[] {""} ;
      T000211_A4Cent_Descripcion = new String[] {""} ;
      T000211_A252Alma_Descripcion = new String[] {""} ;
      T000211_A307Tpal_Descripcion = new String[] {""} ;
      T000211_A259Alma_Direccion = new String[] {""} ;
      T000211_n259Alma_Direccion = new boolean[] {false} ;
      T000211_A260Alma_Telefono1 = new long[1] ;
      T000211_n260Alma_Telefono1 = new boolean[] {false} ;
      T000211_A261Alma_Telefono2 = new long[1] ;
      T000211_n261Alma_Telefono2 = new boolean[] {false} ;
      T000211_A262Alma_Fax = new long[1] ;
      T000211_n262Alma_Fax = new boolean[] {false} ;
      T000211_A266Alma_NombreResponsable = new String[] {""} ;
      T000211_n266Alma_NombreResponsable = new boolean[] {false} ;
      T000211_A268Alma_EmailResponsable = new String[] {""} ;
      T000211_n268Alma_EmailResponsable = new boolean[] {false} ;
      T000211_A265Alma_CedulaResponsable = new long[1] ;
      T000211_n265Alma_CedulaResponsable = new boolean[] {false} ;
      T000211_A263Alma_CuentaDebito = new String[] {""} ;
      T000211_n263Alma_CuentaDebito = new boolean[] {false} ;
      T000211_A264Alma_CuentaCredito = new String[] {""} ;
      T000211_n264Alma_CuentaCredito = new boolean[] {false} ;
      T000211_A673Alma_Estado = new String[] {""} ;
      T000211_n673Alma_Estado = new boolean[] {false} ;
      T000211_A1Cent_Id = new long[1] ;
      T000211_A29Tpal_Id = new long[1] ;
      T000211_A30Alma_IdResponsable = new long[1] ;
      T000212_A3Cent_Codigo = new String[] {""} ;
      T000212_A4Cent_Descripcion = new String[] {""} ;
      T000213_A307Tpal_Descripcion = new String[] {""} ;
      T000214_A266Alma_NombreResponsable = new String[] {""} ;
      T000214_n266Alma_NombreResponsable = new boolean[] {false} ;
      T000214_A268Alma_EmailResponsable = new String[] {""} ;
      T000214_n268Alma_EmailResponsable = new boolean[] {false} ;
      T000214_A265Alma_CedulaResponsable = new long[1] ;
      T000214_n265Alma_CedulaResponsable = new boolean[] {false} ;
      T000215_A1Cent_Id = new long[1] ;
      T000215_A27Alma_Modulo = new String[] {""} ;
      T000215_A28Alma_Codigo = new String[] {""} ;
      T00027_A27Alma_Modulo = new String[] {""} ;
      T00027_A28Alma_Codigo = new String[] {""} ;
      T00027_A256Alma_UsuarioCrea = new String[] {""} ;
      T00027_n256Alma_UsuarioCrea = new boolean[] {false} ;
      T00027_A255Alma_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00027_n255Alma_FechaCrea = new boolean[] {false} ;
      T00027_A258Alma_UsuarioModifica = new String[] {""} ;
      T00027_n258Alma_UsuarioModifica = new boolean[] {false} ;
      T00027_A257Alma_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00027_n257Alma_FechaModifica = new boolean[] {false} ;
      T00027_A252Alma_Descripcion = new String[] {""} ;
      T00027_A259Alma_Direccion = new String[] {""} ;
      T00027_n259Alma_Direccion = new boolean[] {false} ;
      T00027_A260Alma_Telefono1 = new long[1] ;
      T00027_n260Alma_Telefono1 = new boolean[] {false} ;
      T00027_A261Alma_Telefono2 = new long[1] ;
      T00027_n261Alma_Telefono2 = new boolean[] {false} ;
      T00027_A262Alma_Fax = new long[1] ;
      T00027_n262Alma_Fax = new boolean[] {false} ;
      T00027_A263Alma_CuentaDebito = new String[] {""} ;
      T00027_n263Alma_CuentaDebito = new boolean[] {false} ;
      T00027_A264Alma_CuentaCredito = new String[] {""} ;
      T00027_n264Alma_CuentaCredito = new boolean[] {false} ;
      T00027_A673Alma_Estado = new String[] {""} ;
      T00027_n673Alma_Estado = new boolean[] {false} ;
      T00027_A1Cent_Id = new long[1] ;
      T00027_A29Tpal_Id = new long[1] ;
      T00027_A30Alma_IdResponsable = new long[1] ;
      T000216_A1Cent_Id = new long[1] ;
      T000216_A27Alma_Modulo = new String[] {""} ;
      T000216_A28Alma_Codigo = new String[] {""} ;
      T000217_A1Cent_Id = new long[1] ;
      T000217_A27Alma_Modulo = new String[] {""} ;
      T000217_A28Alma_Codigo = new String[] {""} ;
      T00026_A27Alma_Modulo = new String[] {""} ;
      T00026_A28Alma_Codigo = new String[] {""} ;
      T00026_A256Alma_UsuarioCrea = new String[] {""} ;
      T00026_n256Alma_UsuarioCrea = new boolean[] {false} ;
      T00026_A255Alma_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00026_n255Alma_FechaCrea = new boolean[] {false} ;
      T00026_A258Alma_UsuarioModifica = new String[] {""} ;
      T00026_n258Alma_UsuarioModifica = new boolean[] {false} ;
      T00026_A257Alma_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00026_n257Alma_FechaModifica = new boolean[] {false} ;
      T00026_A252Alma_Descripcion = new String[] {""} ;
      T00026_A259Alma_Direccion = new String[] {""} ;
      T00026_n259Alma_Direccion = new boolean[] {false} ;
      T00026_A260Alma_Telefono1 = new long[1] ;
      T00026_n260Alma_Telefono1 = new boolean[] {false} ;
      T00026_A261Alma_Telefono2 = new long[1] ;
      T00026_n261Alma_Telefono2 = new boolean[] {false} ;
      T00026_A262Alma_Fax = new long[1] ;
      T00026_n262Alma_Fax = new boolean[] {false} ;
      T00026_A263Alma_CuentaDebito = new String[] {""} ;
      T00026_n263Alma_CuentaDebito = new boolean[] {false} ;
      T00026_A264Alma_CuentaCredito = new String[] {""} ;
      T00026_n264Alma_CuentaCredito = new boolean[] {false} ;
      T00026_A673Alma_Estado = new String[] {""} ;
      T00026_n673Alma_Estado = new boolean[] {false} ;
      T00026_A1Cent_Id = new long[1] ;
      T00026_A29Tpal_Id = new long[1] ;
      T00026_A30Alma_IdResponsable = new long[1] ;
      T000221_A3Cent_Codigo = new String[] {""} ;
      T000221_A4Cent_Descripcion = new String[] {""} ;
      T000222_A307Tpal_Descripcion = new String[] {""} ;
      T000223_A266Alma_NombreResponsable = new String[] {""} ;
      T000223_n266Alma_NombreResponsable = new boolean[] {false} ;
      T000223_A268Alma_EmailResponsable = new String[] {""} ;
      T000223_n268Alma_EmailResponsable = new boolean[] {false} ;
      T000223_A265Alma_CedulaResponsable = new long[1] ;
      T000223_n265Alma_CedulaResponsable = new boolean[] {false} ;
      T000224_A1Cent_Id = new long[1] ;
      T000224_A27Alma_Modulo = new String[] {""} ;
      T000224_A28Alma_Codigo = new String[] {""} ;
      Z610BArea_Descripcion = "" ;
      T000225_A27Alma_Modulo = new String[] {""} ;
      T000225_A28Alma_Codigo = new String[] {""} ;
      T000225_A695BBode_Descripcion = new String[] {""} ;
      T000225_A610BArea_Descripcion = new String[] {""} ;
      T000225_A696BBode_Estado = new String[] {""} ;
      T000225_A32BArea_Codigo = new String[] {""} ;
      T000225_n32BArea_Codigo = new boolean[] {false} ;
      T000225_A1Cent_Id = new long[1] ;
      T000225_A31Bode_Codigo = new String[] {""} ;
      T00024_A610BArea_Descripcion = new String[] {""} ;
      T00025_A31Bode_Codigo = new String[] {""} ;
      T000226_A610BArea_Descripcion = new String[] {""} ;
      T000227_A31Bode_Codigo = new String[] {""} ;
      T000228_A1Cent_Id = new long[1] ;
      T000228_A27Alma_Modulo = new String[] {""} ;
      T000228_A28Alma_Codigo = new String[] {""} ;
      T000228_A31Bode_Codigo = new String[] {""} ;
      T00023_A27Alma_Modulo = new String[] {""} ;
      T00023_A28Alma_Codigo = new String[] {""} ;
      T00023_A695BBode_Descripcion = new String[] {""} ;
      T00023_A696BBode_Estado = new String[] {""} ;
      T00023_A32BArea_Codigo = new String[] {""} ;
      T00023_n32BArea_Codigo = new boolean[] {false} ;
      T00023_A1Cent_Id = new long[1] ;
      T00023_A31Bode_Codigo = new String[] {""} ;
      T00022_A27Alma_Modulo = new String[] {""} ;
      T00022_A28Alma_Codigo = new String[] {""} ;
      T00022_A695BBode_Descripcion = new String[] {""} ;
      T00022_A696BBode_Estado = new String[] {""} ;
      T00022_A32BArea_Codigo = new String[] {""} ;
      T00022_n32BArea_Codigo = new boolean[] {false} ;
      T00022_A1Cent_Id = new long[1] ;
      T00022_A31Bode_Codigo = new String[] {""} ;
      T000232_A610BArea_Descripcion = new String[] {""} ;
      T000233_A1Cent_Id = new long[1] ;
      T000233_A27Alma_Modulo = new String[] {""} ;
      T000233_A28Alma_Codigo = new String[] {""} ;
      T000233_A31Bode_Codigo = new String[] {""} ;
      Gridalm_almacen_bodegasRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_almacen_bodegas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      GXv_int4 = new long [1] ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_int1 = new long [1] ;
      GXv_int5 = new int [1] ;
      T000234_A31Bode_Codigo = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_almacen__default(),
         new Object[] {
             new Object[] {
            T00022_A27Alma_Modulo, T00022_A28Alma_Codigo, T00022_A695BBode_Descripcion, T00022_A696BBode_Estado, T00022_A32BArea_Codigo, T00022_n32BArea_Codigo, T00022_A1Cent_Id, T00022_A31Bode_Codigo
            }
            , new Object[] {
            T00023_A27Alma_Modulo, T00023_A28Alma_Codigo, T00023_A695BBode_Descripcion, T00023_A696BBode_Estado, T00023_A32BArea_Codigo, T00023_n32BArea_Codigo, T00023_A1Cent_Id, T00023_A31Bode_Codigo
            }
            , new Object[] {
            T00024_A610BArea_Descripcion
            }
            , new Object[] {
            T00025_A31Bode_Codigo
            }
            , new Object[] {
            T00026_A27Alma_Modulo, T00026_A28Alma_Codigo, T00026_A256Alma_UsuarioCrea, T00026_n256Alma_UsuarioCrea, T00026_A255Alma_FechaCrea, T00026_n255Alma_FechaCrea, T00026_A258Alma_UsuarioModifica, T00026_n258Alma_UsuarioModifica, T00026_A257Alma_FechaModifica, T00026_n257Alma_FechaModifica,
            T00026_A252Alma_Descripcion, T00026_A259Alma_Direccion, T00026_n259Alma_Direccion, T00026_A260Alma_Telefono1, T00026_n260Alma_Telefono1, T00026_A261Alma_Telefono2, T00026_n261Alma_Telefono2, T00026_A262Alma_Fax, T00026_n262Alma_Fax, T00026_A263Alma_CuentaDebito,
            T00026_n263Alma_CuentaDebito, T00026_A264Alma_CuentaCredito, T00026_n264Alma_CuentaCredito, T00026_A673Alma_Estado, T00026_n673Alma_Estado, T00026_A1Cent_Id, T00026_A29Tpal_Id, T00026_A30Alma_IdResponsable
            }
            , new Object[] {
            T00027_A27Alma_Modulo, T00027_A28Alma_Codigo, T00027_A256Alma_UsuarioCrea, T00027_n256Alma_UsuarioCrea, T00027_A255Alma_FechaCrea, T00027_n255Alma_FechaCrea, T00027_A258Alma_UsuarioModifica, T00027_n258Alma_UsuarioModifica, T00027_A257Alma_FechaModifica, T00027_n257Alma_FechaModifica,
            T00027_A252Alma_Descripcion, T00027_A259Alma_Direccion, T00027_n259Alma_Direccion, T00027_A260Alma_Telefono1, T00027_n260Alma_Telefono1, T00027_A261Alma_Telefono2, T00027_n261Alma_Telefono2, T00027_A262Alma_Fax, T00027_n262Alma_Fax, T00027_A263Alma_CuentaDebito,
            T00027_n263Alma_CuentaDebito, T00027_A264Alma_CuentaCredito, T00027_n264Alma_CuentaCredito, T00027_A673Alma_Estado, T00027_n673Alma_Estado, T00027_A1Cent_Id, T00027_A29Tpal_Id, T00027_A30Alma_IdResponsable
            }
            , new Object[] {
            T00028_A3Cent_Codigo, T00028_A4Cent_Descripcion
            }
            , new Object[] {
            T00029_A307Tpal_Descripcion
            }
            , new Object[] {
            T000210_A266Alma_NombreResponsable, T000210_n266Alma_NombreResponsable, T000210_A268Alma_EmailResponsable, T000210_n268Alma_EmailResponsable, T000210_A265Alma_CedulaResponsable, T000210_n265Alma_CedulaResponsable
            }
            , new Object[] {
            T000211_A27Alma_Modulo, T000211_A28Alma_Codigo, T000211_A256Alma_UsuarioCrea, T000211_n256Alma_UsuarioCrea, T000211_A255Alma_FechaCrea, T000211_n255Alma_FechaCrea, T000211_A258Alma_UsuarioModifica, T000211_n258Alma_UsuarioModifica, T000211_A257Alma_FechaModifica, T000211_n257Alma_FechaModifica,
            T000211_A3Cent_Codigo, T000211_A4Cent_Descripcion, T000211_A252Alma_Descripcion, T000211_A307Tpal_Descripcion, T000211_A259Alma_Direccion, T000211_n259Alma_Direccion, T000211_A260Alma_Telefono1, T000211_n260Alma_Telefono1, T000211_A261Alma_Telefono2, T000211_n261Alma_Telefono2,
            T000211_A262Alma_Fax, T000211_n262Alma_Fax, T000211_A266Alma_NombreResponsable, T000211_n266Alma_NombreResponsable, T000211_A268Alma_EmailResponsable, T000211_n268Alma_EmailResponsable, T000211_A265Alma_CedulaResponsable, T000211_n265Alma_CedulaResponsable, T000211_A263Alma_CuentaDebito, T000211_n263Alma_CuentaDebito,
            T000211_A264Alma_CuentaCredito, T000211_n264Alma_CuentaCredito, T000211_A673Alma_Estado, T000211_n673Alma_Estado, T000211_A1Cent_Id, T000211_A29Tpal_Id, T000211_A30Alma_IdResponsable
            }
            , new Object[] {
            T000212_A3Cent_Codigo, T000212_A4Cent_Descripcion
            }
            , new Object[] {
            T000213_A307Tpal_Descripcion
            }
            , new Object[] {
            T000214_A266Alma_NombreResponsable, T000214_n266Alma_NombreResponsable, T000214_A268Alma_EmailResponsable, T000214_n268Alma_EmailResponsable, T000214_A265Alma_CedulaResponsable, T000214_n265Alma_CedulaResponsable
            }
            , new Object[] {
            T000215_A1Cent_Id, T000215_A27Alma_Modulo, T000215_A28Alma_Codigo
            }
            , new Object[] {
            T000216_A1Cent_Id, T000216_A27Alma_Modulo, T000216_A28Alma_Codigo
            }
            , new Object[] {
            T000217_A1Cent_Id, T000217_A27Alma_Modulo, T000217_A28Alma_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000221_A3Cent_Codigo, T000221_A4Cent_Descripcion
            }
            , new Object[] {
            T000222_A307Tpal_Descripcion
            }
            , new Object[] {
            T000223_A266Alma_NombreResponsable, T000223_n266Alma_NombreResponsable, T000223_A268Alma_EmailResponsable, T000223_n268Alma_EmailResponsable, T000223_A265Alma_CedulaResponsable, T000223_n265Alma_CedulaResponsable
            }
            , new Object[] {
            T000224_A1Cent_Id, T000224_A27Alma_Modulo, T000224_A28Alma_Codigo
            }
            , new Object[] {
            T000225_A27Alma_Modulo, T000225_A28Alma_Codigo, T000225_A695BBode_Descripcion, T000225_A610BArea_Descripcion, T000225_A696BBode_Estado, T000225_A32BArea_Codigo, T000225_n32BArea_Codigo, T000225_A1Cent_Id, T000225_A31Bode_Codigo
            }
            , new Object[] {
            T000226_A610BArea_Descripcion
            }
            , new Object[] {
            T000227_A31Bode_Codigo
            }
            , new Object[] {
            T000228_A1Cent_Id, T000228_A27Alma_Modulo, T000228_A28Alma_Codigo, T000228_A31Bode_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000232_A610BArea_Descripcion
            }
            , new Object[] {
            T000233_A1Cent_Id, T000233_A27Alma_Modulo, T000233_A28Alma_Codigo, T000233_A31Bode_Codigo
            }
            , new Object[] {
            T000234_A31Bode_Codigo
            }
         }
      );
      AV24Pgmname = "ALM_ALMACEN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_almacen_bodegas_Backcolorstyle ;
   private byte subGridalm_almacen_bodegas_Allowselection ;
   private byte subGridalm_almacen_bodegas_Allowhovering ;
   private byte subGridalm_almacen_bodegas_Allowcollapsing ;
   private byte subGridalm_almacen_bodegas_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_almacen_bodegas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_100 ;
   private short nGXsfl_100_idx=1 ;
   private short nRcdDeleted_3 ;
   private short nRcdExists_3 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount3 ;
   private short RcdFound3 ;
   private short nBlankRcdUsr3 ;
   private short RcdFound2 ;
   private int AV23Tran ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtCent_Id_Enabled ;
   private int imgprompt_1_Visible ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtAlma_Codigo_Enabled ;
   private int edtAlma_Descripcion_Enabled ;
   private int edtTpal_Id_Enabled ;
   private int imgprompt_29_Visible ;
   private int edtTpal_Descripcion_Enabled ;
   private int edtAlma_Direccion_Enabled ;
   private int edtAlma_Telefono1_Enabled ;
   private int edtAlma_Telefono2_Enabled ;
   private int edtAlma_Fax_Enabled ;
   private int edtAlma_IdResponsable_Enabled ;
   private int imgprompt_30_Visible ;
   private int edtAlma_NombreResponsable_Enabled ;
   private int edtAlma_EmailResponsable_Enabled ;
   private int edtAlma_CuentaDebito_Enabled ;
   private int edtAlma_CuentaCredito_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtBode_Codigo_Enabled ;
   private int edtBBode_Descripcion_Enabled ;
   private int edtBArea_Codigo_Enabled ;
   private int edtBArea_Descripcion_Enabled ;
   private int subGridalm_almacen_bodegas_Selectioncolor ;
   private int subGridalm_almacen_bodegas_Hoveringcolor ;
   private int fRowAdded ;
   private int AV25GXV1 ;
   private int GX_JID ;
   private int subGridalm_almacen_bodegas_Backcolor ;
   private int subGridalm_almacen_bodegas_Allbackcolor ;
   private int imgprompt_31_Visible ;
   private int imgprompt_32_Visible ;
   private int defedtBode_Codigo_Enabled ;
   private int idxLst ;
   private int GXv_int5[] ;
   private long wcpOAV17Cent_Id ;
   private long Z1Cent_Id ;
   private long Z260Alma_Telefono1 ;
   private long Z261Alma_Telefono2 ;
   private long Z262Alma_Fax ;
   private long Z29Tpal_Id ;
   private long Z30Alma_IdResponsable ;
   private long O30Alma_IdResponsable ;
   private long N29Tpal_Id ;
   private long N30Alma_IdResponsable ;
   private long A1Cent_Id ;
   private long AV21Alma_IdResponsableOld ;
   private long A30Alma_IdResponsable ;
   private long A29Tpal_Id ;
   private long AV17Cent_Id ;
   private long A260Alma_Telefono1 ;
   private long A261Alma_Telefono2 ;
   private long A262Alma_Fax ;
   private long B30Alma_IdResponsable ;
   private long AV15Insert_Tpal_Id ;
   private long AV13Insert_Alma_IdResponsable ;
   private long A265Alma_CedulaResponsable ;
   private long GRIDALM_ALMACEN_BODEGAS_nFirstRecordOnPage ;
   private long Z265Alma_CedulaResponsable ;
   private long GXv_int4[] ;
   private long GXv_int1[] ;
   private String sPrefix ;
   private String sGXsfl_100_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z673Alma_Estado ;
   private String Z696BBode_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A673Alma_Estado ;
   private String GXCCtl ;
   private String A696BBode_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCent_Id_Internalname ;
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
   private String edtCent_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String edtTpal_Id_Internalname ;
   private String edtTpal_Id_Jsonclick ;
   private String imgprompt_29_Internalname ;
   private String imgprompt_29_Link ;
   private String edtTpal_Descripcion_Internalname ;
   private String edtTpal_Descripcion_Jsonclick ;
   private String edtAlma_Direccion_Internalname ;
   private String edtAlma_Telefono1_Internalname ;
   private String edtAlma_Telefono1_Jsonclick ;
   private String edtAlma_Telefono2_Internalname ;
   private String edtAlma_Telefono2_Jsonclick ;
   private String edtAlma_Fax_Internalname ;
   private String edtAlma_Fax_Jsonclick ;
   private String edtAlma_IdResponsable_Internalname ;
   private String edtAlma_IdResponsable_Jsonclick ;
   private String imgprompt_30_Internalname ;
   private String imgprompt_30_Link ;
   private String edtAlma_NombreResponsable_Internalname ;
   private String edtAlma_NombreResponsable_Jsonclick ;
   private String edtAlma_EmailResponsable_Internalname ;
   private String edtAlma_EmailResponsable_Jsonclick ;
   private String edtAlma_CuentaDebito_Internalname ;
   private String edtAlma_CuentaDebito_Jsonclick ;
   private String edtAlma_CuentaCredito_Internalname ;
   private String edtAlma_CuentaCredito_Jsonclick ;
   private String divBodegastable_Internalname ;
   private String lblTitlebodegas_Internalname ;
   private String lblTitlebodegas_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode3 ;
   private String edtBode_Codigo_Internalname ;
   private String edtBBode_Descripcion_Internalname ;
   private String edtBArea_Codigo_Internalname ;
   private String edtBArea_Descripcion_Internalname ;
   private String sStyleString ;
   private String AV24Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgprompt_31_Internalname ;
   private String imgprompt_32_Internalname ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGridalm_almacen_bodegas_Class ;
   private String subGridalm_almacen_bodegas_Linesclass ;
   private String imgprompt_31_Link ;
   private String imgprompt_32_Link ;
   private String ROClassString ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtBBode_Descripcion_Jsonclick ;
   private String edtBArea_Codigo_Jsonclick ;
   private String edtBArea_Descripcion_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_almacen_bodegas_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z255Alma_FechaCrea ;
   private java.util.Date Z257Alma_FechaModifica ;
   private java.util.Date A255Alma_FechaCrea ;
   private java.util.Date A257Alma_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean n32BArea_Codigo ;
   private boolean toggleJsOutput ;
   private boolean n673Alma_Estado ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n259Alma_Direccion ;
   private boolean n260Alma_Telefono1 ;
   private boolean n261Alma_Telefono2 ;
   private boolean n262Alma_Fax ;
   private boolean n266Alma_NombreResponsable ;
   private boolean n268Alma_EmailResponsable ;
   private boolean n263Alma_CuentaDebito ;
   private boolean n264Alma_CuentaCredito ;
   private boolean n256Alma_UsuarioCrea ;
   private boolean n255Alma_FechaCrea ;
   private boolean n258Alma_UsuarioModifica ;
   private boolean n257Alma_FechaModifica ;
   private boolean n265Alma_CedulaResponsable ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV18Alma_Modulo ;
   private String wcpOAV16Alma_Codigo ;
   private String Z27Alma_Modulo ;
   private String Z28Alma_Codigo ;
   private String Z256Alma_UsuarioCrea ;
   private String Z258Alma_UsuarioModifica ;
   private String Z252Alma_Descripcion ;
   private String Z259Alma_Direccion ;
   private String Z263Alma_CuentaDebito ;
   private String Z264Alma_CuentaCredito ;
   private String Z31Bode_Codigo ;
   private String Z695BBode_Descripcion ;
   private String Z32BArea_Codigo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A32BArea_Codigo ;
   private String A31Bode_Codigo ;
   private String AV18Alma_Modulo ;
   private String AV16Alma_Codigo ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A252Alma_Descripcion ;
   private String A307Tpal_Descripcion ;
   private String A259Alma_Direccion ;
   private String A266Alma_NombreResponsable ;
   private String A268Alma_EmailResponsable ;
   private String A263Alma_CuentaDebito ;
   private String A264Alma_CuentaCredito ;
   private String A695BBode_Descripcion ;
   private String A610BArea_Descripcion ;
   private String A256Alma_UsuarioCrea ;
   private String A258Alma_UsuarioModifica ;
   private String AV20Usuario ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private String Z307Tpal_Descripcion ;
   private String Z266Alma_NombreResponsable ;
   private String Z268Alma_EmailResponsable ;
   private String Z610BArea_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Gridalm_almacen_bodegasContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_almacen_bodegasRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_almacen_bodegasColumn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbAlma_Modulo ;
   private HTMLChoice cmbAlma_Estado ;
   private HTMLChoice cmbBBode_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00028_A3Cent_Codigo ;
   private String[] T00028_A4Cent_Descripcion ;
   private String[] T000210_A266Alma_NombreResponsable ;
   private boolean[] T000210_n266Alma_NombreResponsable ;
   private String[] T000210_A268Alma_EmailResponsable ;
   private boolean[] T000210_n268Alma_EmailResponsable ;
   private long[] T000210_A265Alma_CedulaResponsable ;
   private boolean[] T000210_n265Alma_CedulaResponsable ;
   private String[] T00029_A307Tpal_Descripcion ;
   private String[] T000211_A27Alma_Modulo ;
   private String[] T000211_A28Alma_Codigo ;
   private String[] T000211_A256Alma_UsuarioCrea ;
   private boolean[] T000211_n256Alma_UsuarioCrea ;
   private java.util.Date[] T000211_A255Alma_FechaCrea ;
   private boolean[] T000211_n255Alma_FechaCrea ;
   private String[] T000211_A258Alma_UsuarioModifica ;
   private boolean[] T000211_n258Alma_UsuarioModifica ;
   private java.util.Date[] T000211_A257Alma_FechaModifica ;
   private boolean[] T000211_n257Alma_FechaModifica ;
   private String[] T000211_A3Cent_Codigo ;
   private String[] T000211_A4Cent_Descripcion ;
   private String[] T000211_A252Alma_Descripcion ;
   private String[] T000211_A307Tpal_Descripcion ;
   private String[] T000211_A259Alma_Direccion ;
   private boolean[] T000211_n259Alma_Direccion ;
   private long[] T000211_A260Alma_Telefono1 ;
   private boolean[] T000211_n260Alma_Telefono1 ;
   private long[] T000211_A261Alma_Telefono2 ;
   private boolean[] T000211_n261Alma_Telefono2 ;
   private long[] T000211_A262Alma_Fax ;
   private boolean[] T000211_n262Alma_Fax ;
   private String[] T000211_A266Alma_NombreResponsable ;
   private boolean[] T000211_n266Alma_NombreResponsable ;
   private String[] T000211_A268Alma_EmailResponsable ;
   private boolean[] T000211_n268Alma_EmailResponsable ;
   private long[] T000211_A265Alma_CedulaResponsable ;
   private boolean[] T000211_n265Alma_CedulaResponsable ;
   private String[] T000211_A263Alma_CuentaDebito ;
   private boolean[] T000211_n263Alma_CuentaDebito ;
   private String[] T000211_A264Alma_CuentaCredito ;
   private boolean[] T000211_n264Alma_CuentaCredito ;
   private String[] T000211_A673Alma_Estado ;
   private boolean[] T000211_n673Alma_Estado ;
   private long[] T000211_A1Cent_Id ;
   private long[] T000211_A29Tpal_Id ;
   private long[] T000211_A30Alma_IdResponsable ;
   private String[] T000212_A3Cent_Codigo ;
   private String[] T000212_A4Cent_Descripcion ;
   private String[] T000213_A307Tpal_Descripcion ;
   private String[] T000214_A266Alma_NombreResponsable ;
   private boolean[] T000214_n266Alma_NombreResponsable ;
   private String[] T000214_A268Alma_EmailResponsable ;
   private boolean[] T000214_n268Alma_EmailResponsable ;
   private long[] T000214_A265Alma_CedulaResponsable ;
   private boolean[] T000214_n265Alma_CedulaResponsable ;
   private long[] T000215_A1Cent_Id ;
   private String[] T000215_A27Alma_Modulo ;
   private String[] T000215_A28Alma_Codigo ;
   private String[] T00027_A27Alma_Modulo ;
   private String[] T00027_A28Alma_Codigo ;
   private String[] T00027_A256Alma_UsuarioCrea ;
   private boolean[] T00027_n256Alma_UsuarioCrea ;
   private java.util.Date[] T00027_A255Alma_FechaCrea ;
   private boolean[] T00027_n255Alma_FechaCrea ;
   private String[] T00027_A258Alma_UsuarioModifica ;
   private boolean[] T00027_n258Alma_UsuarioModifica ;
   private java.util.Date[] T00027_A257Alma_FechaModifica ;
   private boolean[] T00027_n257Alma_FechaModifica ;
   private String[] T00027_A252Alma_Descripcion ;
   private String[] T00027_A259Alma_Direccion ;
   private boolean[] T00027_n259Alma_Direccion ;
   private long[] T00027_A260Alma_Telefono1 ;
   private boolean[] T00027_n260Alma_Telefono1 ;
   private long[] T00027_A261Alma_Telefono2 ;
   private boolean[] T00027_n261Alma_Telefono2 ;
   private long[] T00027_A262Alma_Fax ;
   private boolean[] T00027_n262Alma_Fax ;
   private String[] T00027_A263Alma_CuentaDebito ;
   private boolean[] T00027_n263Alma_CuentaDebito ;
   private String[] T00027_A264Alma_CuentaCredito ;
   private boolean[] T00027_n264Alma_CuentaCredito ;
   private String[] T00027_A673Alma_Estado ;
   private boolean[] T00027_n673Alma_Estado ;
   private long[] T00027_A1Cent_Id ;
   private long[] T00027_A29Tpal_Id ;
   private long[] T00027_A30Alma_IdResponsable ;
   private long[] T000216_A1Cent_Id ;
   private String[] T000216_A27Alma_Modulo ;
   private String[] T000216_A28Alma_Codigo ;
   private long[] T000217_A1Cent_Id ;
   private String[] T000217_A27Alma_Modulo ;
   private String[] T000217_A28Alma_Codigo ;
   private String[] T00026_A27Alma_Modulo ;
   private String[] T00026_A28Alma_Codigo ;
   private String[] T00026_A256Alma_UsuarioCrea ;
   private boolean[] T00026_n256Alma_UsuarioCrea ;
   private java.util.Date[] T00026_A255Alma_FechaCrea ;
   private boolean[] T00026_n255Alma_FechaCrea ;
   private String[] T00026_A258Alma_UsuarioModifica ;
   private boolean[] T00026_n258Alma_UsuarioModifica ;
   private java.util.Date[] T00026_A257Alma_FechaModifica ;
   private boolean[] T00026_n257Alma_FechaModifica ;
   private String[] T00026_A252Alma_Descripcion ;
   private String[] T00026_A259Alma_Direccion ;
   private boolean[] T00026_n259Alma_Direccion ;
   private long[] T00026_A260Alma_Telefono1 ;
   private boolean[] T00026_n260Alma_Telefono1 ;
   private long[] T00026_A261Alma_Telefono2 ;
   private boolean[] T00026_n261Alma_Telefono2 ;
   private long[] T00026_A262Alma_Fax ;
   private boolean[] T00026_n262Alma_Fax ;
   private String[] T00026_A263Alma_CuentaDebito ;
   private boolean[] T00026_n263Alma_CuentaDebito ;
   private String[] T00026_A264Alma_CuentaCredito ;
   private boolean[] T00026_n264Alma_CuentaCredito ;
   private String[] T00026_A673Alma_Estado ;
   private boolean[] T00026_n673Alma_Estado ;
   private long[] T00026_A1Cent_Id ;
   private long[] T00026_A29Tpal_Id ;
   private long[] T00026_A30Alma_IdResponsable ;
   private String[] T000221_A3Cent_Codigo ;
   private String[] T000221_A4Cent_Descripcion ;
   private String[] T000222_A307Tpal_Descripcion ;
   private String[] T000223_A266Alma_NombreResponsable ;
   private boolean[] T000223_n266Alma_NombreResponsable ;
   private String[] T000223_A268Alma_EmailResponsable ;
   private boolean[] T000223_n268Alma_EmailResponsable ;
   private long[] T000223_A265Alma_CedulaResponsable ;
   private boolean[] T000223_n265Alma_CedulaResponsable ;
   private long[] T000224_A1Cent_Id ;
   private String[] T000224_A27Alma_Modulo ;
   private String[] T000224_A28Alma_Codigo ;
   private String[] T000225_A27Alma_Modulo ;
   private String[] T000225_A28Alma_Codigo ;
   private String[] T000225_A695BBode_Descripcion ;
   private String[] T000225_A610BArea_Descripcion ;
   private String[] T000225_A696BBode_Estado ;
   private String[] T000225_A32BArea_Codigo ;
   private boolean[] T000225_n32BArea_Codigo ;
   private long[] T000225_A1Cent_Id ;
   private String[] T000225_A31Bode_Codigo ;
   private String[] T00024_A610BArea_Descripcion ;
   private String[] T00025_A31Bode_Codigo ;
   private String[] T000226_A610BArea_Descripcion ;
   private String[] T000227_A31Bode_Codigo ;
   private long[] T000228_A1Cent_Id ;
   private String[] T000228_A27Alma_Modulo ;
   private String[] T000228_A28Alma_Codigo ;
   private String[] T000228_A31Bode_Codigo ;
   private String[] T00023_A27Alma_Modulo ;
   private String[] T00023_A28Alma_Codigo ;
   private String[] T00023_A695BBode_Descripcion ;
   private String[] T00023_A696BBode_Estado ;
   private String[] T00023_A32BArea_Codigo ;
   private boolean[] T00023_n32BArea_Codigo ;
   private long[] T00023_A1Cent_Id ;
   private String[] T00023_A31Bode_Codigo ;
   private String[] T00022_A27Alma_Modulo ;
   private String[] T00022_A28Alma_Codigo ;
   private String[] T00022_A695BBode_Descripcion ;
   private String[] T00022_A696BBode_Estado ;
   private String[] T00022_A32BArea_Codigo ;
   private boolean[] T00022_n32BArea_Codigo ;
   private long[] T00022_A1Cent_Id ;
   private String[] T00022_A31Bode_Codigo ;
   private String[] T000232_A610BArea_Descripcion ;
   private long[] T000233_A1Cent_Id ;
   private String[] T000233_A27Alma_Modulo ;
   private String[] T000233_A28Alma_Codigo ;
   private String[] T000233_A31Bode_Codigo ;
   private String[] T000234_A31Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV12TrnContextAtt ;
}

final  class alm_almacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00022", "SELECT Alma_Modulo, Alma_Codigo, BBode_Descripcion, BBode_Estado, BArea_Codigo, Cent_Id, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ?  FOR UPDATE OF BBode_Descripcion, BBode_Estado, BArea_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00023", "SELECT Alma_Modulo, Alma_Codigo, BBode_Descripcion, BBode_Estado, BArea_Codigo, Cent_Id, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00024", "SELECT BArea_Descripcion FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00025", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00026", "SELECT Alma_Modulo, Alma_Codigo, Alma_UsuarioCrea, Alma_FechaCrea, Alma_UsuarioModifica, Alma_FechaModifica, Alma_Descripcion, Alma_Direccion, Alma_Telefono1, Alma_Telefono2, Alma_Fax, Alma_CuentaDebito, Alma_CuentaCredito, Alma_Estado, Cent_Id, Tpal_Id, Alma_IdResponsable FROM ALM_ALMACEN WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ?  FOR UPDATE OF Alma_UsuarioCrea, Alma_FechaCrea, Alma_UsuarioModifica, Alma_FechaModifica, Alma_Descripcion, Alma_Direccion, Alma_Telefono1, Alma_Telefono2, Alma_Fax, Alma_CuentaDebito, Alma_CuentaCredito, Alma_Estado, Tpal_Id, Alma_IdResponsable NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00027", "SELECT Alma_Modulo, Alma_Codigo, Alma_UsuarioCrea, Alma_FechaCrea, Alma_UsuarioModifica, Alma_FechaModifica, Alma_Descripcion, Alma_Direccion, Alma_Telefono1, Alma_Telefono2, Alma_Fax, Alma_CuentaDebito, Alma_CuentaCredito, Alma_Estado, Cent_Id, Tpal_Id, Alma_IdResponsable FROM ALM_ALMACEN WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00028", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00029", "SELECT Tpal_Descripcion FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000210", "SELECT Cuen_Nombre AS Alma_NombreResponsable, Cuen_Email AS Alma_EmailResponsable, Cuen_Cedula AS Alma_CedulaResponsable FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000211", "SELECT /*+ FIRST_ROWS(100) */ TM1.Alma_Modulo, TM1.Alma_Codigo, TM1.Alma_UsuarioCrea, TM1.Alma_FechaCrea, TM1.Alma_UsuarioModifica, TM1.Alma_FechaModifica, T2.Cent_Codigo, T2.Cent_Descripcion, TM1.Alma_Descripcion, T3.Tpal_Descripcion, TM1.Alma_Direccion, TM1.Alma_Telefono1, TM1.Alma_Telefono2, TM1.Alma_Fax, T4.Cuen_Nombre AS Alma_NombreResponsable, T4.Cuen_Email AS Alma_EmailResponsable, T4.Cuen_Cedula AS Alma_CedulaResponsable, TM1.Alma_CuentaDebito, TM1.Alma_CuentaCredito, TM1.Alma_Estado, TM1.Cent_Id, TM1.Tpal_Id, TM1.Alma_IdResponsable AS Alma_IdResponsable FROM (((ALM_ALMACEN TM1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = TM1.Cent_Id) INNER JOIN ALM_TIPO_ALMACEN T3 ON T3.Tpal_Id = TM1.Tpal_Id) INNER JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = TM1.Alma_IdResponsable) WHERE TM1.Cent_Id = ? and TM1.Alma_Modulo = ? and TM1.Alma_Codigo = ? ORDER BY TM1.Cent_Id, TM1.Alma_Modulo, TM1.Alma_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000212", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000213", "SELECT Tpal_Descripcion FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000214", "SELECT Cuen_Nombre AS Alma_NombreResponsable, Cuen_Email AS Alma_EmailResponsable, Cuen_Cedula AS Alma_CedulaResponsable FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000215", "SELECT /*+ FIRST_ROWS(1) */ Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000216", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE ( Cent_Id > ? or Cent_Id = ? and Alma_Modulo > ? or Alma_Modulo = ? and Cent_Id = ? and Alma_Codigo > ?) ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000217", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE ( Cent_Id < ? or Cent_Id = ? and Alma_Modulo < ? or Alma_Modulo = ? and Cent_Id = ? and Alma_Codigo < ?) ORDER BY Cent_Id DESC, Alma_Modulo DESC, Alma_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000218", "INSERT INTO ALM_ALMACEN(Alma_Modulo, Alma_Codigo, Alma_UsuarioCrea, Alma_FechaCrea, Alma_UsuarioModifica, Alma_FechaModifica, Alma_Descripcion, Alma_Direccion, Alma_Telefono1, Alma_Telefono2, Alma_Fax, Alma_CuentaDebito, Alma_CuentaCredito, Alma_Estado, Cent_Id, Tpal_Id, Alma_IdResponsable) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_ALMACEN")
         ,new UpdateCursor("T000219", "UPDATE ALM_ALMACEN SET Alma_UsuarioCrea=?, Alma_FechaCrea=?, Alma_UsuarioModifica=?, Alma_FechaModifica=?, Alma_Descripcion=?, Alma_Direccion=?, Alma_Telefono1=?, Alma_Telefono2=?, Alma_Fax=?, Alma_CuentaDebito=?, Alma_CuentaCredito=?, Alma_Estado=?, Tpal_Id=?, Alma_IdResponsable=?  WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ?", GX_NOMASK, "ALM_ALMACEN")
         ,new UpdateCursor("T000220", "DELETE FROM ALM_ALMACEN  WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ?", GX_NOMASK, "ALM_ALMACEN")
         ,new ForEachCursor("T000221", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000222", "SELECT Tpal_Descripcion FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000223", "SELECT Cuen_Nombre AS Alma_NombreResponsable, Cuen_Email AS Alma_EmailResponsable, Cuen_Cedula AS Alma_CedulaResponsable FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000224", "SELECT /*+ FIRST_ROWS(100) */ Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000225", "SELECT T1.Alma_Modulo, T1.Alma_Codigo, T1.BBode_Descripcion, T2.BArea_Descripcion, T1.BBode_Estado, T1.BArea_Codigo, T1.Cent_Id, T1.Bode_Codigo FROM (ALM_ALMACEN_BODEGAS T1 LEFT JOIN ALM_AREA T2 ON T2.BArea_Codigo = T1.BArea_Codigo AND T2.Cent_Id = T1.Cent_Id) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000226", "SELECT BArea_Descripcion FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000227", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000228", "SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000229", "INSERT INTO ALM_ALMACEN_BODEGAS(Alma_Modulo, Alma_Codigo, BBode_Descripcion, BBode_Estado, BArea_Codigo, Cent_Id, Bode_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_ALMACEN_BODEGAS")
         ,new UpdateCursor("T000230", "UPDATE ALM_ALMACEN_BODEGAS SET BBode_Descripcion=?, BBode_Estado=?, BArea_Codigo=?  WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ?", GX_NOMASK, "ALM_ALMACEN_BODEGAS")
         ,new UpdateCursor("T000231", "DELETE FROM ALM_ALMACEN_BODEGAS  WHERE Cent_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ?", GX_NOMASK, "ALM_ALMACEN_BODEGAS")
         ,new ForEachCursor("T000232", "SELECT BArea_Descripcion FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000233", "SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000234", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((long[]) buf[26])[0] = rslt.getLong(16) ;
               ((long[]) buf[27])[0] = rslt.getLong(17) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((long[]) buf[26])[0] = rslt.getLong(16) ;
               ((long[]) buf[27])[0] = rslt.getLong(17) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(21) ;
               ((long[]) buf[35])[0] = rslt.getLong(22) ;
               ((long[]) buf[36])[0] = rslt.getLong(23) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 26 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 32 :
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
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 8, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               stmt.setVarchar(7, (String)parms[10], 100, false);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 1024);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(9, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(10, ((Number) parms[16]).longValue(), 0);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(11, ((Number) parms[18]).longValue(), 0);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 16);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 16);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 1);
               }
               stmt.setLong(15, ((Number) parms[25]).longValue());
               stmt.setLong(16, ((Number) parms[26]).longValue());
               stmt.setBigDecimal(17, ((Number) parms[27]).longValue(), 0);
               return;
            case 17 :
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
                  stmt.setVarchar(6, (String)parms[10], 1024);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(7, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(8, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(9, ((Number) parms[16]).longValue(), 0);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 16);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 16);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               stmt.setLong(13, ((Number) parms[23]).longValue());
               stmt.setBigDecimal(14, ((Number) parms[24]).longValue(), 0);
               stmt.setLong(15, ((Number) parms[25]).longValue());
               stmt.setVarchar(16, (String)parms[26], 8, false);
               stmt.setVarchar(17, (String)parms[27], 2, false);
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 21 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 8, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 16);
               }
               stmt.setLong(6, ((Number) parms[6]).longValue());
               stmt.setVarchar(7, (String)parms[7], 3, false);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 16);
               }
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setVarchar(5, (String)parms[5], 8, false);
               stmt.setVarchar(6, (String)parms[6], 2, false);
               stmt.setVarchar(7, (String)parms[7], 3, false);
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 31 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

