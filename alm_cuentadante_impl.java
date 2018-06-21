/*
               File: alm_cuentadante_impl
        Description: Cuentadante
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:26.98
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

public final  class alm_cuentadante_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A42Tpte_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A42Tpte_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A2Regi_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A5Ciud_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A6Dept_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A45Cuen_Identificacion_Multi = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A45Cuen_Identificacion_Multi) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_cuentadante_multiple") == 0 )
      {
         nRC_GXsfl_154 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_154_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_154_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_cuentadante_multiple_newrow( ) ;
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
            AV15Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV15Cuen_Identificacion, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
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
      cmbCuen_Estado.setName( "CUEN_ESTADO" );
      cmbCuen_Estado.setWebtags( "" );
      cmbCuen_Estado.addItem("A", "Activo", (short)(0));
      cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbCuen_Estado.getItemCount() > 0 )
      {
         A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
         n333Cuen_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
      }
      GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_154_idx ;
      cmbCuen_Multi_Estado.setName( GXCCtl );
      cmbCuen_Multi_Estado.setWebtags( "" );
      cmbCuen_Multi_Estado.addItem("A", "Activo", (short)(0));
      cmbCuen_Multi_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbCuen_Multi_Estado.getItemCount() > 0 )
      {
         A692Cuen_Multi_Estado = cmbCuen_Multi_Estado.getValidValue(A692Cuen_Multi_Estado) ;
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
         Form.getMeta().addItem("description", "Cuentadante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCuen_Cedula_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_cuentadante_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cuentadante_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cuentadante_impl.class ));
   }

   public alm_cuentadante_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCuen_Estado = new HTMLChoice();
      cmbCuen_Multi_Estado = new HTMLChoice();
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
      if ( cmbCuen_Estado.getItemCount() > 0 )
      {
         A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
         n333Cuen_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Cuentadante", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Identificacion_Internalname, "Identificación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Identificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Identificacion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Identificacion_Jsonclick, 0, "Attribute", "", "", "", edtCuen_Identificacion_Visible, edtCuen_Identificacion_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Cedula_Internalname, "Cedula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_DigitoVerificacion_Internalname, "Dígito Verificación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_DigitoVerificacion_Internalname, GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")), ((edtCuen_DigitoVerificacion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")) : localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_DigitoVerificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_DigitoVerificacion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerNombre_Internalname, A331Cuen_PrimerNombre, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerNombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_PrimerNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoNombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoNombre_Internalname, A332Cuen_SegundoNombre, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoNombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_SegundoNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerApellido_Internalname, "Apellido", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerApellido_Internalname, A329Cuen_PrimerApellido, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerApellido_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_PrimerApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoApellido_Internalname, "Apellido", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoApellido_Internalname, A330Cuen_SegundoApellido, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoApellido_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_SegundoApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Codigo_Internalname, GXutil.rtrim( A42Tpte_Codigo), GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpte_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_42_Internalname, sImgUrl, imgprompt_42_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_42_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpte_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpte_Descripcion_Internalname, A321Tpte_Descripcion, GXutil.rtrim( localUtil.format( A321Tpte_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpte_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpte_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Clase_Internalname, "Clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Clase_Internalname, A328Cuen_Clase, GXutil.rtrim( localUtil.format( A328Cuen_Clase, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Clase_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Clase_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbCuen_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCuen_Estado, cmbCuen_Estado.getInternalname(), GXutil.rtrim( A333Cuen_Estado), 1, cmbCuen_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCuen_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "", true, "HLP_ALM_CUENTADANTE.htm");
         cmbCuen_Estado.setValue( GXutil.rtrim( A333Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Estado.getInternalname(), "Values", cmbCuen_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Direccion_Internalname, "Dirección", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCuen_Direccion_Internalname, A334Cuen_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A334Cuen_Direccion), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), 1, edtCuen_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Telefono_Internalname, "Teléfono", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Telefono_Internalname, A335Cuen_Telefono, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Telefono_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Telefono_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Email_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Email_Internalname, A336Cuen_Email, GXutil.rtrim( localUtil.format( A336Cuen_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A336Cuen_Email, "", "", "", edtCuen_Email_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Descripcion_Internalname, "Descripción Ciudad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Codigo_Internalname, "Código Departamento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Descripcion_Internalname, "Descripción Departamento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Identificador Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTE.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código del Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Id_Internalname, "Identificador Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Código de la Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Descripcion_Internalname, "Descripción Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_UsuarioCrea_Internalname, "Usuario Creación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_UsuarioCrea_Internalname, A337Cuen_UsuarioCrea, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_UsuarioCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_UsuarioCrea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_FechaCrea_Internalname, "Fecha Creación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtCuen_FechaCrea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_FechaCrea_Internalname, localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_FechaCrea_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_FechaCrea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCuen_FechaCrea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCuen_FechaCrea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_UsuarioModifica_Internalname, "Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_UsuarioModifica_Internalname, A339Cuen_UsuarioModifica, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CUENTADANTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_FechaModifica_Internalname, "Fecha ", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtCuen_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_FechaModifica_Internalname, localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCuen_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCuen_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CUENTADANTE.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMultipletable_Internalname, divMultipletable_Visible, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitlemultiple_Internalname, "MULTIPLE", "", "", lblTitlemultiple_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_cuentadante_multiple( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE.htm");
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

   public void gxdraw_gridalm_cuentadante_multiple( )
   {
      /*  Grid Control  */
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("GridName", "Gridalm_cuentadante_multiple");
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Class", "Grid");
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("CmpContext", "");
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_cuentadante_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multipleColumn);
      Gridalm_cuentadante_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multipleColumn);
      Gridalm_cuentadante_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Value", A690Cuen_Nombre_Multi);
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multipleColumn);
      Gridalm_cuentadante_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multipleColumn);
      Gridalm_cuentadante_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Value", GXutil.rtrim( A692Cuen_Multi_Estado));
      Gridalm_cuentadante_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multipleColumn);
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multipleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multiple_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_154_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount11 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_11 = (short)(1) ;
            scanStart0811( ) ;
            while ( RcdFound11 != 0 )
            {
               init_level_properties11( ) ;
               getByPrimaryKey0811( ) ;
               addRow0811( ) ;
               scanNext0811( ) ;
            }
            scanEnd0811( ) ;
            nBlankRcdCount11 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0811( ) ;
         standaloneModal0811( ) ;
         sMode11 = Gx_mode ;
         while ( nGXsfl_154_idx < nRC_GXsfl_154 )
         {
            bGXsfl_154_Refreshing = true ;
            readRow0811( ) ;
            edtCuen_Identificacion_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
            edtCuen_Nombre_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
            edtCuen_Cedula_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
            cmbCuen_Multi_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Multi_Estado.getEnabled(), 5, 0)), !bGXsfl_154_Refreshing);
            imgprompt_42_Link = httpContext.cgiGet( "PROMPT_45_"+sGXsfl_154_idx+"Link") ;
            if ( ( nRcdExists_11 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0811( ) ;
            }
            sendRow0811( ) ;
            bGXsfl_154_Refreshing = false ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount11 = (short)(5) ;
         nRcdExists_11 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0811( ) ;
            while ( RcdFound11 != 0 )
            {
               sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_15411( ) ;
               init_level_properties11( ) ;
               standaloneNotModal0811( ) ;
               getByPrimaryKey0811( ) ;
               standaloneModal0811( ) ;
               addRow0811( ) ;
               scanNext0811( ) ;
            }
            scanEnd0811( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode11 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_15411( ) ;
         initAll0811( ) ;
         init_level_properties11( ) ;
         standaloneNotModal0811( ) ;
         standaloneModal0811( ) ;
         nRcdExists_11 = (short)(0) ;
         nIsMod_11 = (short)(0) ;
         nRcdDeleted_11 = (short)(0) ;
         nBlankRcdCount11 = (short)(nBlankRcdUsr11+nBlankRcdCount11) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount11 > 0 )
         {
            addRow0811( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount11 = (short)(nBlankRcdCount11-1) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_cuentadante_multipleContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_cuentadante_multiple", Gridalm_cuentadante_multipleContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_cuentadante_multipleContainerData", Gridalm_cuentadante_multipleContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_cuentadante_multipleContainerData"+"V", Gridalm_cuentadante_multipleContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_cuentadante_multipleContainerData"+"V"+"\" value='"+Gridalm_cuentadante_multipleContainer.GridValuesHidden()+"'/>") ;
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
      e11082 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
            n43Cuen_Identificacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUEN_CEDULA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_Cedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A688Cuen_Cedula = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            }
            else
            {
               A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUEN_DIGITOVERIFICACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_DigitoVerificacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A326Cuen_DigitoVerificacion = (byte)(0) ;
               n326Cuen_DigitoVerificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
            }
            else
            {
               A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".")) ;
               n326Cuen_DigitoVerificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
            }
            n326Cuen_DigitoVerificacion = ((0==A326Cuen_DigitoVerificacion) ? true : false) ;
            A331Cuen_PrimerNombre = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerNombre_Internalname)) ;
            n331Cuen_PrimerNombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
            n331Cuen_PrimerNombre = ((GXutil.strcmp("", A331Cuen_PrimerNombre)==0) ? true : false) ;
            A332Cuen_SegundoNombre = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoNombre_Internalname)) ;
            n332Cuen_SegundoNombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
            n332Cuen_SegundoNombre = ((GXutil.strcmp("", A332Cuen_SegundoNombre)==0) ? true : false) ;
            A329Cuen_PrimerApellido = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerApellido_Internalname)) ;
            n329Cuen_PrimerApellido = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
            n329Cuen_PrimerApellido = ((GXutil.strcmp("", A329Cuen_PrimerApellido)==0) ? true : false) ;
            A330Cuen_SegundoApellido = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoApellido_Internalname)) ;
            n330Cuen_SegundoApellido = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
            n330Cuen_SegundoApellido = ((GXutil.strcmp("", A330Cuen_SegundoApellido)==0) ? true : false) ;
            A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
            n44Cuen_Nombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
            n44Cuen_Nombre = ((GXutil.strcmp("", A44Cuen_Nombre)==0) ? true : false) ;
            A42Tpte_Codigo = GXutil.upper( httpContext.cgiGet( edtTpte_Codigo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
            A321Tpte_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpte_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
            A328Cuen_Clase = httpContext.cgiGet( edtCuen_Clase_Internalname) ;
            n328Cuen_Clase = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328Cuen_Clase", A328Cuen_Clase);
            n328Cuen_Clase = ((GXutil.strcmp("", A328Cuen_Clase)==0) ? true : false) ;
            cmbCuen_Estado.setName( cmbCuen_Estado.getInternalname() );
            cmbCuen_Estado.setValue( httpContext.cgiGet( cmbCuen_Estado.getInternalname()) );
            A333Cuen_Estado = httpContext.cgiGet( cmbCuen_Estado.getInternalname()) ;
            n333Cuen_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
            n333Cuen_Estado = ((GXutil.strcmp("", A333Cuen_Estado)==0) ? true : false) ;
            A334Cuen_Direccion = httpContext.cgiGet( edtCuen_Direccion_Internalname) ;
            n334Cuen_Direccion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
            n334Cuen_Direccion = ((GXutil.strcmp("", A334Cuen_Direccion)==0) ? true : false) ;
            A335Cuen_Telefono = httpContext.cgiGet( edtCuen_Telefono_Internalname) ;
            n335Cuen_Telefono = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
            n335Cuen_Telefono = ((GXutil.strcmp("", A335Cuen_Telefono)==0) ? true : false) ;
            A336Cuen_Email = httpContext.cgiGet( edtCuen_Email_Internalname) ;
            n336Cuen_Email = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
            n336Cuen_Email = ((GXutil.strcmp("", A336Cuen_Email)==0) ? true : false) ;
            A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
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
            A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A337Cuen_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioCrea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCuen_FechaCrea_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CUEN_FECHACREA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_FechaCrea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaCrea_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
            }
            A339Cuen_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioModifica_Internalname)) ;
            n339Cuen_UsuarioModifica = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
            n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCuen_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CUEN_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               n340Cuen_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaModifica_Internalname)) ;
               n340Cuen_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
            /* Read saved values. */
            Z43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "Z43Cuen_Identificacion"), ",", ".") ;
            Z44Cuen_Nombre = httpContext.cgiGet( "Z44Cuen_Nombre") ;
            n44Cuen_Nombre = ((GXutil.strcmp("", A44Cuen_Nombre)==0) ? true : false) ;
            Z337Cuen_UsuarioCrea = httpContext.cgiGet( "Z337Cuen_UsuarioCrea") ;
            Z339Cuen_UsuarioModifica = httpContext.cgiGet( "Z339Cuen_UsuarioModifica") ;
            n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
            Z338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z338Cuen_FechaCrea"), 0) ;
            Z340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z340Cuen_FechaModifica"), 0) ;
            n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
            Z688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( "Z688Cuen_Cedula"), ",", ".") ;
            Z326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( "Z326Cuen_DigitoVerificacion"), ",", ".")) ;
            n326Cuen_DigitoVerificacion = ((0==A326Cuen_DigitoVerificacion) ? true : false) ;
            Z331Cuen_PrimerNombre = httpContext.cgiGet( "Z331Cuen_PrimerNombre") ;
            n331Cuen_PrimerNombre = ((GXutil.strcmp("", A331Cuen_PrimerNombre)==0) ? true : false) ;
            Z332Cuen_SegundoNombre = httpContext.cgiGet( "Z332Cuen_SegundoNombre") ;
            n332Cuen_SegundoNombre = ((GXutil.strcmp("", A332Cuen_SegundoNombre)==0) ? true : false) ;
            Z329Cuen_PrimerApellido = httpContext.cgiGet( "Z329Cuen_PrimerApellido") ;
            n329Cuen_PrimerApellido = ((GXutil.strcmp("", A329Cuen_PrimerApellido)==0) ? true : false) ;
            Z330Cuen_SegundoApellido = httpContext.cgiGet( "Z330Cuen_SegundoApellido") ;
            n330Cuen_SegundoApellido = ((GXutil.strcmp("", A330Cuen_SegundoApellido)==0) ? true : false) ;
            Z328Cuen_Clase = httpContext.cgiGet( "Z328Cuen_Clase") ;
            n328Cuen_Clase = ((GXutil.strcmp("", A328Cuen_Clase)==0) ? true : false) ;
            Z333Cuen_Estado = httpContext.cgiGet( "Z333Cuen_Estado") ;
            n333Cuen_Estado = ((GXutil.strcmp("", A333Cuen_Estado)==0) ? true : false) ;
            Z334Cuen_Direccion = httpContext.cgiGet( "Z334Cuen_Direccion") ;
            n334Cuen_Direccion = ((GXutil.strcmp("", A334Cuen_Direccion)==0) ? true : false) ;
            Z335Cuen_Telefono = httpContext.cgiGet( "Z335Cuen_Telefono") ;
            n335Cuen_Telefono = ((GXutil.strcmp("", A335Cuen_Telefono)==0) ? true : false) ;
            Z336Cuen_Email = httpContext.cgiGet( "Z336Cuen_Email") ;
            n336Cuen_Email = ((GXutil.strcmp("", A336Cuen_Email)==0) ? true : false) ;
            Z42Tpte_Codigo = httpContext.cgiGet( "Z42Tpte_Codigo") ;
            Z1Cent_Id = localUtil.ctol( httpContext.cgiGet( "Z1Cent_Id"), ",", ".") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_154 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_154"), ",", ".")) ;
            N42Tpte_Codigo = httpContext.cgiGet( "N42Tpte_Codigo") ;
            N1Cent_Id = localUtil.ctol( httpContext.cgiGet( "N1Cent_Id"), ",", ".") ;
            AV15Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "vCUEN_IDENTIFICACION"), ",", ".") ;
            AV11Insert_Tpte_Codigo = httpContext.cgiGet( "vINSERT_TPTE_CODIGO") ;
            AV14Insert_Cent_Id = localUtil.ctol( httpContext.cgiGet( "vINSERT_CENT_ID"), ",", ".") ;
            AV16Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV17Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CUENTADANTE" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A43Cuen_Identificacion != Z43Cuen_Identificacion ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_cuentadante:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               n43Cuen_Identificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
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
                  sMode10 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode10 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound10 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_080( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CUEN_IDENTIFICACION");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCuen_Identificacion_Internalname ;
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
                        e11082 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12082 ();
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
         e12082 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0810( ) ;
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
         disableAttributes0810( ) ;
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

   public void confirm_080( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0810( ) ;
         }
         else
         {
            checkExtendedTable0810( ) ;
            closeExtendedTableCursors0810( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_0811( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0811( )
   {
      nGXsfl_154_idx = (short)(0) ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         readRow0811( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            getKey0811( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               if ( RcdFound11 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0811( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0811( ) ;
                     closeExtendedTableCursors0811( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( nRcdDeleted_11 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0811( ) ;
                     load0811( ) ;
                     beforeValidate0811( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0811( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0811( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0811( ) ;
                           closeExtendedTableCursors0811( ) ;
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
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCuen_Identificacion_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Nombre_Multi_Internalname, A690Cuen_Nombre_Multi) ;
         httpContext.changePostValue( edtCuen_Cedula_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( cmbCuen_Multi_Estado.getInternalname(), GXutil.rtrim( A692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_154_idx, GXutil.rtrim( Z692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption080( )
   {
   }

   public void e11082( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV17Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      AV11Insert_Tpte_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Tpte_Codigo", AV11Insert_Tpte_Codigo);
      AV14Insert_Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_Cent_Id", GXutil.ltrim( GXutil.str( AV14Insert_Cent_Id, 11, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV17Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV18GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18GXV1", GXutil.ltrim( GXutil.str( AV18GXV1, 8, 0)));
         while ( AV18GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV18GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tpte_Codigo") == 0 )
            {
               AV11Insert_Tpte_Codigo = AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Tpte_Codigo", AV11Insert_Tpte_Codigo);
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Cent_Id") == 0 )
            {
               AV14Insert_Cent_Id = GXutil.lval( AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_Cent_Id", GXutil.ltrim( GXutil.str( AV14Insert_Cent_Id, 11, 0)));
            }
            AV18GXV1 = (int)(AV18GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18GXV1", GXutil.ltrim( GXutil.str( AV18GXV1, 8, 0)));
         }
      }
      AV16Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usuario", AV16Usuario);
   }

   public void e12082( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_cuentadante") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0810( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z44Cuen_Nombre = T00086_A44Cuen_Nombre[0] ;
            Z337Cuen_UsuarioCrea = T00086_A337Cuen_UsuarioCrea[0] ;
            Z339Cuen_UsuarioModifica = T00086_A339Cuen_UsuarioModifica[0] ;
            Z338Cuen_FechaCrea = T00086_A338Cuen_FechaCrea[0] ;
            Z340Cuen_FechaModifica = T00086_A340Cuen_FechaModifica[0] ;
            Z688Cuen_Cedula = T00086_A688Cuen_Cedula[0] ;
            Z326Cuen_DigitoVerificacion = T00086_A326Cuen_DigitoVerificacion[0] ;
            Z331Cuen_PrimerNombre = T00086_A331Cuen_PrimerNombre[0] ;
            Z332Cuen_SegundoNombre = T00086_A332Cuen_SegundoNombre[0] ;
            Z329Cuen_PrimerApellido = T00086_A329Cuen_PrimerApellido[0] ;
            Z330Cuen_SegundoApellido = T00086_A330Cuen_SegundoApellido[0] ;
            Z328Cuen_Clase = T00086_A328Cuen_Clase[0] ;
            Z333Cuen_Estado = T00086_A333Cuen_Estado[0] ;
            Z334Cuen_Direccion = T00086_A334Cuen_Direccion[0] ;
            Z335Cuen_Telefono = T00086_A335Cuen_Telefono[0] ;
            Z336Cuen_Email = T00086_A336Cuen_Email[0] ;
            Z42Tpte_Codigo = T00086_A42Tpte_Codigo[0] ;
            Z1Cent_Id = T00086_A1Cent_Id[0] ;
         }
         else
         {
            Z44Cuen_Nombre = A44Cuen_Nombre ;
            Z337Cuen_UsuarioCrea = A337Cuen_UsuarioCrea ;
            Z339Cuen_UsuarioModifica = A339Cuen_UsuarioModifica ;
            Z338Cuen_FechaCrea = A338Cuen_FechaCrea ;
            Z340Cuen_FechaModifica = A340Cuen_FechaModifica ;
            Z688Cuen_Cedula = A688Cuen_Cedula ;
            Z326Cuen_DigitoVerificacion = A326Cuen_DigitoVerificacion ;
            Z331Cuen_PrimerNombre = A331Cuen_PrimerNombre ;
            Z332Cuen_SegundoNombre = A332Cuen_SegundoNombre ;
            Z329Cuen_PrimerApellido = A329Cuen_PrimerApellido ;
            Z330Cuen_SegundoApellido = A330Cuen_SegundoApellido ;
            Z328Cuen_Clase = A328Cuen_Clase ;
            Z333Cuen_Estado = A333Cuen_Estado ;
            Z334Cuen_Direccion = A334Cuen_Direccion ;
            Z335Cuen_Telefono = A335Cuen_Telefono ;
            Z336Cuen_Email = A336Cuen_Email ;
            Z42Tpte_Codigo = A42Tpte_Codigo ;
            Z1Cent_Id = A1Cent_Id ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z44Cuen_Nombre = A44Cuen_Nombre ;
         Z337Cuen_UsuarioCrea = A337Cuen_UsuarioCrea ;
         Z339Cuen_UsuarioModifica = A339Cuen_UsuarioModifica ;
         Z338Cuen_FechaCrea = A338Cuen_FechaCrea ;
         Z340Cuen_FechaModifica = A340Cuen_FechaModifica ;
         Z688Cuen_Cedula = A688Cuen_Cedula ;
         Z326Cuen_DigitoVerificacion = A326Cuen_DigitoVerificacion ;
         Z331Cuen_PrimerNombre = A331Cuen_PrimerNombre ;
         Z332Cuen_SegundoNombre = A332Cuen_SegundoNombre ;
         Z329Cuen_PrimerApellido = A329Cuen_PrimerApellido ;
         Z330Cuen_SegundoApellido = A330Cuen_SegundoApellido ;
         Z328Cuen_Clase = A328Cuen_Clase ;
         Z333Cuen_Estado = A333Cuen_Estado ;
         Z334Cuen_Direccion = A334Cuen_Direccion ;
         Z335Cuen_Telefono = A335Cuen_Telefono ;
         Z336Cuen_Email = A336Cuen_Email ;
         Z2Regi_Id = A2Regi_Id ;
         Z42Tpte_Codigo = A42Tpte_Codigo ;
         Z1Cent_Id = A1Cent_Id ;
         Z321Tpte_Descripcion = A321Tpte_Descripcion ;
         Z3Cent_Codigo = A3Cent_Codigo ;
         Z4Cent_Descripcion = A4Cent_Descripcion ;
         Z12Regi_Cod = A12Regi_Cod ;
         Z13Regi_Descripcion = A13Regi_Descripcion ;
         Z5Ciud_Codigo = A5Ciud_Codigo ;
         Z7Ciud_Descripcion = A7Ciud_Descripcion ;
         Z6Dept_Codigo = A6Dept_Codigo ;
         Z10Dept_Descripcion = A10Dept_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCuen_Identificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      divMultipletable_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divMultipletable_Internalname, "Visible", GXutil.ltrim( GXutil.str( divMultipletable_Visible, 5, 0)), true);
      edtCuen_Identificacion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Visible, 5, 0)), true);
      imgprompt_42_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0120"+"',["+"{Ctrl:gx.dom.el('"+"TPTE_CODIGO"+"'), id:'"+"TPTE_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtCuen_Identificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV15Cuen_Identificacion) )
      {
         A43Cuen_Identificacion = AV15Cuen_Identificacion ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_Tpte_Codigo)==0) )
      {
         edtTpte_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpte_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_Cent_Id) )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtCent_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_Cent_Id) )
      {
         A1Cent_Id = AV14Insert_Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_Tpte_Codigo)==0) )
      {
         A42Tpte_Codigo = AV11Insert_Tpte_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
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
         AV17Pgmname = "ALM_CUENTADANTE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T00088 */
         pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T00088_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T00088_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T00088_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         pr_default.close(6);
         /* Using cursor T00089 */
         pr_default.execute(7, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T00089_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T00089_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A5Ciud_Codigo = T00089_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         pr_default.close(7);
         /* Using cursor T000810 */
         pr_default.execute(8, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000810_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T000810_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(8);
         /* Using cursor T000811 */
         pr_default.execute(9, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000811_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         pr_default.close(9);
         /* Using cursor T00087 */
         pr_default.execute(5, new Object[] {A42Tpte_Codigo});
         A321Tpte_Descripcion = T00087_A321Tpte_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         pr_default.close(5);
      }
   }

   public void load0810( )
   {
      /* Using cursor T000812 */
      pr_default.execute(10, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A44Cuen_Nombre = T000812_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T000812_n44Cuen_Nombre[0] ;
         A337Cuen_UsuarioCrea = T000812_A337Cuen_UsuarioCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
         A339Cuen_UsuarioModifica = T000812_A339Cuen_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
         n339Cuen_UsuarioModifica = T000812_n339Cuen_UsuarioModifica[0] ;
         A338Cuen_FechaCrea = T000812_A338Cuen_FechaCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         A340Cuen_FechaModifica = T000812_A340Cuen_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n340Cuen_FechaModifica = T000812_n340Cuen_FechaModifica[0] ;
         A688Cuen_Cedula = T000812_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A326Cuen_DigitoVerificacion = T000812_A326Cuen_DigitoVerificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
         n326Cuen_DigitoVerificacion = T000812_n326Cuen_DigitoVerificacion[0] ;
         A331Cuen_PrimerNombre = T000812_A331Cuen_PrimerNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
         n331Cuen_PrimerNombre = T000812_n331Cuen_PrimerNombre[0] ;
         A332Cuen_SegundoNombre = T000812_A332Cuen_SegundoNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
         n332Cuen_SegundoNombre = T000812_n332Cuen_SegundoNombre[0] ;
         A329Cuen_PrimerApellido = T000812_A329Cuen_PrimerApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
         n329Cuen_PrimerApellido = T000812_n329Cuen_PrimerApellido[0] ;
         A330Cuen_SegundoApellido = T000812_A330Cuen_SegundoApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
         n330Cuen_SegundoApellido = T000812_n330Cuen_SegundoApellido[0] ;
         A321Tpte_Descripcion = T000812_A321Tpte_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         A328Cuen_Clase = T000812_A328Cuen_Clase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328Cuen_Clase", A328Cuen_Clase);
         n328Cuen_Clase = T000812_n328Cuen_Clase[0] ;
         A333Cuen_Estado = T000812_A333Cuen_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
         n333Cuen_Estado = T000812_n333Cuen_Estado[0] ;
         A334Cuen_Direccion = T000812_A334Cuen_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
         n334Cuen_Direccion = T000812_n334Cuen_Direccion[0] ;
         A335Cuen_Telefono = T000812_A335Cuen_Telefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
         n335Cuen_Telefono = T000812_n335Cuen_Telefono[0] ;
         A336Cuen_Email = T000812_A336Cuen_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
         n336Cuen_Email = T000812_n336Cuen_Email[0] ;
         A7Ciud_Descripcion = T000812_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A10Dept_Descripcion = T000812_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A3Cent_Codigo = T000812_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000812_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T000812_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         A12Regi_Cod = T000812_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T000812_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A42Tpte_Codigo = T000812_A42Tpte_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         A1Cent_Id = T000812_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A5Ciud_Codigo = T000812_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         A6Dept_Codigo = T000812_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         zm0810( -19) ;
      }
      pr_default.close(10);
      onLoadActions0810( ) ;
   }

   public void onLoadActions0810( )
   {
      AV17Pgmname = "ALM_CUENTADANTE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      A44Cuen_Nombre = GXutil.concat( GXutil.concat( A331Cuen_PrimerNombre, A332Cuen_SegundoNombre, " "), GXutil.concat( A329Cuen_PrimerApellido, A330Cuen_SegundoApellido, " "), " ") ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
   }

   public void checkExtendedTable0810( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV17Pgmname = "ALM_CUENTADANTE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      A44Cuen_Nombre = GXutil.concat( GXutil.concat( A331Cuen_PrimerNombre, A332Cuen_SegundoNombre, " "), GXutil.concat( A329Cuen_PrimerApellido, A330Cuen_SegundoApellido, " "), " ") ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      /* Using cursor T00087 */
      pr_default.execute(5, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE TERCERO'.", "ForeignKeyNotFound", 1, "TPTE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpte_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A321Tpte_Descripcion = T00087_A321Tpte_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
      pr_default.close(5);
      if ( ! ( GxRegex.IsMatch(A336Cuen_Email,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") || (GXutil.strcmp("", A336Cuen_Email)==0) ) )
      {
         httpContext.GX_msglist.addItem("El valor de Email no coincide con el patrón especificado", "OutOfRange", 1, "CUEN_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Email_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00088 */
      pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T00088_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T00088_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A2Regi_Id = T00088_A2Regi_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      pr_default.close(6);
      /* Using cursor T00089 */
      pr_default.execute(7, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T00089_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T00089_A13Regi_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A5Ciud_Codigo = T00089_A5Ciud_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      pr_default.close(7);
      /* Using cursor T000810 */
      pr_default.execute(8, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000810_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T000810_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      pr_default.close(8);
      /* Using cursor T000811 */
      pr_default.execute(9, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000811_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      pr_default.close(9);
   }

   public void closeExtendedTableCursors0810( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( String A42Tpte_Codigo )
   {
      /* Using cursor T000813 */
      pr_default.execute(11, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE TERCERO'.", "ForeignKeyNotFound", 1, "TPTE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpte_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A321Tpte_Descripcion = T000813_A321Tpte_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A321Tpte_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_21( long A1Cent_Id )
   {
      /* Using cursor T000814 */
      pr_default.execute(12, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T000814_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T000814_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A2Regi_Id = T000814_A2Regi_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A3Cent_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A4Cent_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_22( long A2Regi_Id )
   {
      /* Using cursor T000815 */
      pr_default.execute(13, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000815_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T000815_A13Regi_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A5Ciud_Codigo = T000815_A5Ciud_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A13Regi_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_23( short A5Ciud_Codigo )
   {
      /* Using cursor T000816 */
      pr_default.execute(14, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000816_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T000816_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A7Ciud_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_24( short A6Dept_Codigo )
   {
      /* Using cursor T000817 */
      pr_default.execute(15, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000817_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A10Dept_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void getKey0810( )
   {
      /* Using cursor T000818 */
      pr_default.execute(16, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00086 */
      pr_default.execute(4, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0810( 19) ;
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T00086_A43Cuen_Identificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         n43Cuen_Identificacion = T00086_n43Cuen_Identificacion[0] ;
         A44Cuen_Nombre = T00086_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T00086_n44Cuen_Nombre[0] ;
         A337Cuen_UsuarioCrea = T00086_A337Cuen_UsuarioCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
         A339Cuen_UsuarioModifica = T00086_A339Cuen_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
         n339Cuen_UsuarioModifica = T00086_n339Cuen_UsuarioModifica[0] ;
         A338Cuen_FechaCrea = T00086_A338Cuen_FechaCrea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         A340Cuen_FechaModifica = T00086_A340Cuen_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n340Cuen_FechaModifica = T00086_n340Cuen_FechaModifica[0] ;
         A688Cuen_Cedula = T00086_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         A326Cuen_DigitoVerificacion = T00086_A326Cuen_DigitoVerificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
         n326Cuen_DigitoVerificacion = T00086_n326Cuen_DigitoVerificacion[0] ;
         A331Cuen_PrimerNombre = T00086_A331Cuen_PrimerNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
         n331Cuen_PrimerNombre = T00086_n331Cuen_PrimerNombre[0] ;
         A332Cuen_SegundoNombre = T00086_A332Cuen_SegundoNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
         n332Cuen_SegundoNombre = T00086_n332Cuen_SegundoNombre[0] ;
         A329Cuen_PrimerApellido = T00086_A329Cuen_PrimerApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
         n329Cuen_PrimerApellido = T00086_n329Cuen_PrimerApellido[0] ;
         A330Cuen_SegundoApellido = T00086_A330Cuen_SegundoApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
         n330Cuen_SegundoApellido = T00086_n330Cuen_SegundoApellido[0] ;
         A328Cuen_Clase = T00086_A328Cuen_Clase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328Cuen_Clase", A328Cuen_Clase);
         n328Cuen_Clase = T00086_n328Cuen_Clase[0] ;
         A333Cuen_Estado = T00086_A333Cuen_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
         n333Cuen_Estado = T00086_n333Cuen_Estado[0] ;
         A334Cuen_Direccion = T00086_A334Cuen_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
         n334Cuen_Direccion = T00086_n334Cuen_Direccion[0] ;
         A335Cuen_Telefono = T00086_A335Cuen_Telefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
         n335Cuen_Telefono = T00086_n335Cuen_Telefono[0] ;
         A336Cuen_Email = T00086_A336Cuen_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
         n336Cuen_Email = T00086_n336Cuen_Email[0] ;
         A42Tpte_Codigo = T00086_A42Tpte_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         A1Cent_Id = T00086_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0810( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0810( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0810( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0810( ) ;
      if ( RcdFound10 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000819 */
      pr_default.execute(17, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T000819_A43Cuen_Identificacion[0] < A43Cuen_Identificacion ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T000819_A43Cuen_Identificacion[0] > A43Cuen_Identificacion ) ) )
         {
            A43Cuen_Identificacion = T000819_A43Cuen_Identificacion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            n43Cuen_Identificacion = T000819_n43Cuen_Identificacion[0] ;
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000820 */
      pr_default.execute(18, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T000820_A43Cuen_Identificacion[0] > A43Cuen_Identificacion ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T000820_A43Cuen_Identificacion[0] < A43Cuen_Identificacion ) ) )
         {
            A43Cuen_Identificacion = T000820_A43Cuen_Identificacion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
            n43Cuen_Identificacion = T000820_n43Cuen_Identificacion[0] ;
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0810( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCuen_Cedula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0810( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( A43Cuen_Identificacion != Z43Cuen_Identificacion )
            {
               A43Cuen_Identificacion = Z43Cuen_Identificacion ;
               n43Cuen_Identificacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CUEN_IDENTIFICACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCuen_Identificacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCuen_Cedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0810( ) ;
               GX_FocusControl = edtCuen_Cedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A43Cuen_Identificacion != Z43Cuen_Identificacion )
            {
               /* Insert record */
               GX_FocusControl = edtCuen_Cedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0810( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CUEN_IDENTIFICACION");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCuen_Identificacion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCuen_Cedula_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0810( ) ;
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
      if ( A43Cuen_Identificacion != Z43Cuen_Identificacion )
      {
         A43Cuen_Identificacion = Z43Cuen_Identificacion ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CUEN_IDENTIFICACION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCuen_Cedula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0810( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00085 */
         pr_default.execute(3, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z44Cuen_Nombre, T00085_A44Cuen_Nombre[0]) != 0 ) || ( GXutil.strcmp(Z337Cuen_UsuarioCrea, T00085_A337Cuen_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z339Cuen_UsuarioModifica, T00085_A339Cuen_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z338Cuen_FechaCrea, T00085_A338Cuen_FechaCrea[0]) ) || !( GXutil.dateCompare(Z340Cuen_FechaModifica, T00085_A340Cuen_FechaModifica[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z688Cuen_Cedula != T00085_A688Cuen_Cedula[0] ) || ( Z326Cuen_DigitoVerificacion != T00085_A326Cuen_DigitoVerificacion[0] ) || ( GXutil.strcmp(Z331Cuen_PrimerNombre, T00085_A331Cuen_PrimerNombre[0]) != 0 ) || ( GXutil.strcmp(Z332Cuen_SegundoNombre, T00085_A332Cuen_SegundoNombre[0]) != 0 ) || ( GXutil.strcmp(Z329Cuen_PrimerApellido, T00085_A329Cuen_PrimerApellido[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z330Cuen_SegundoApellido, T00085_A330Cuen_SegundoApellido[0]) != 0 ) || ( GXutil.strcmp(Z328Cuen_Clase, T00085_A328Cuen_Clase[0]) != 0 ) || ( GXutil.strcmp(Z333Cuen_Estado, T00085_A333Cuen_Estado[0]) != 0 ) || ( GXutil.strcmp(Z334Cuen_Direccion, T00085_A334Cuen_Direccion[0]) != 0 ) || ( GXutil.strcmp(Z335Cuen_Telefono, T00085_A335Cuen_Telefono[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z336Cuen_Email, T00085_A336Cuen_Email[0]) != 0 ) || ( GXutil.strcmp(Z42Tpte_Codigo, T00085_A42Tpte_Codigo[0]) != 0 ) || ( Z1Cent_Id != T00085_A1Cent_Id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CUENTADANTE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0810( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0810( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0810( 0) ;
         checkOptimisticConcurrency0810( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0810( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0810( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000821 */
                  pr_default.execute(19, new Object[] {new Long(A2Regi_Id), new Boolean(n44Cuen_Nombre), A44Cuen_Nombre, A337Cuen_UsuarioCrea, new Boolean(n339Cuen_UsuarioModifica), A339Cuen_UsuarioModifica, A338Cuen_FechaCrea, new Boolean(n340Cuen_FechaModifica), A340Cuen_FechaModifica, new Long(A688Cuen_Cedula), new Boolean(n326Cuen_DigitoVerificacion), new Byte(A326Cuen_DigitoVerificacion), new Boolean(n331Cuen_PrimerNombre), A331Cuen_PrimerNombre, new Boolean(n332Cuen_SegundoNombre), A332Cuen_SegundoNombre, new Boolean(n329Cuen_PrimerApellido), A329Cuen_PrimerApellido, new Boolean(n330Cuen_SegundoApellido), A330Cuen_SegundoApellido, new Boolean(n328Cuen_Clase), A328Cuen_Clase, new Boolean(n333Cuen_Estado), A333Cuen_Estado, new Boolean(n334Cuen_Direccion), A334Cuen_Direccion, new Boolean(n335Cuen_Telefono), A335Cuen_Telefono, new Boolean(n336Cuen_Email), A336Cuen_Email, A42Tpte_Codigo, new Long(A1Cent_Id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000822 */
                  pr_default.execute(20);
                  A43Cuen_Identificacion = T000822_A43Cuen_Identificacion[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
                  n43Cuen_Identificacion = T000822_n43Cuen_Identificacion[0] ;
                  pr_default.close(20);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0810( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption080( ) ;
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
            load0810( ) ;
         }
         endLevel0810( ) ;
      }
      closeExtendedTableCursors0810( ) ;
   }

   public void update0810( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0810( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0810( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0810( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0810( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000823 */
                  pr_default.execute(21, new Object[] {new Long(A2Regi_Id), new Boolean(n44Cuen_Nombre), A44Cuen_Nombre, A337Cuen_UsuarioCrea, new Boolean(n339Cuen_UsuarioModifica), A339Cuen_UsuarioModifica, A338Cuen_FechaCrea, new Boolean(n340Cuen_FechaModifica), A340Cuen_FechaModifica, new Long(A688Cuen_Cedula), new Boolean(n326Cuen_DigitoVerificacion), new Byte(A326Cuen_DigitoVerificacion), new Boolean(n331Cuen_PrimerNombre), A331Cuen_PrimerNombre, new Boolean(n332Cuen_SegundoNombre), A332Cuen_SegundoNombre, new Boolean(n329Cuen_PrimerApellido), A329Cuen_PrimerApellido, new Boolean(n330Cuen_SegundoApellido), A330Cuen_SegundoApellido, new Boolean(n328Cuen_Clase), A328Cuen_Clase, new Boolean(n333Cuen_Estado), A333Cuen_Estado, new Boolean(n334Cuen_Direccion), A334Cuen_Direccion, new Boolean(n335Cuen_Telefono), A335Cuen_Telefono, new Boolean(n336Cuen_Email), A336Cuen_Email, A42Tpte_Codigo, new Long(A1Cent_Id), new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0810( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0810( ) ;
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
         endLevel0810( ) ;
      }
      closeExtendedTableCursors0810( ) ;
   }

   public void deferredUpdate0810( )
   {
   }

   public void delete( )
   {
      beforeValidate0810( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0810( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0810( ) ;
         afterConfirm0810( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0810( ) ;
            if ( AnyError == 0 )
            {
               scanStart0811( ) ;
               while ( RcdFound11 != 0 )
               {
                  getByPrimaryKey0811( ) ;
                  delete0811( ) ;
                  scanNext0811( ) ;
               }
               scanEnd0811( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000824 */
                  pr_default.execute(22, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0810( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0810( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV17Pgmname = "ALM_CUENTADANTE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T000825 */
         pr_default.execute(23, new Object[] {A42Tpte_Codigo});
         A321Tpte_Descripcion = T000825_A321Tpte_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
         pr_default.close(23);
         /* Using cursor T000826 */
         pr_default.execute(24, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T000826_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000826_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T000826_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         pr_default.close(24);
         /* Using cursor T000827 */
         pr_default.execute(25, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T000827_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T000827_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A5Ciud_Codigo = T000827_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         pr_default.close(25);
         /* Using cursor T000828 */
         pr_default.execute(26, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000828_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T000828_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(26);
         /* Using cursor T000829 */
         pr_default.execute(27, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000829_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         pr_default.close(27);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000830 */
         pr_default.execute(28, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Responsabilidad"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000831 */
         pr_default.execute(29, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Destino"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000832 */
         pr_default.execute(30, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Proveedor"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000833 */
         pr_default.execute(31, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Origen"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000834 */
         pr_default.execute(32, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"INVENTARIO DEVOLUTIVO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000835 */
         pr_default.execute(33, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"MULTIPLE"+" ("+"Cuentadante Multiple"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000836 */
         pr_default.execute(34, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACÉN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void processNestedLevel0811( )
   {
      nGXsfl_154_idx = (short)(0) ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         readRow0811( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            standaloneNotModal0811( ) ;
            getKey0811( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0811( ) ;
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( ( nRcdDeleted_11 != 0 ) && ( nRcdExists_11 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0811( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_11 != 0 ) && ( nRcdExists_11 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0811( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCuen_Identificacion_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Nombre_Multi_Internalname, A690Cuen_Nombre_Multi) ;
         httpContext.changePostValue( edtCuen_Cedula_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( cmbCuen_Multi_Estado.getInternalname(), GXutil.rtrim( A692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_154_idx, GXutil.rtrim( Z692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_154_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0811( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_11 = (short)(0) ;
      nIsMod_11 = (short)(0) ;
      nRcdDeleted_11 = (short)(0) ;
   }

   public void processLevel0810( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel0811( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0810( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0810( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_cuentadante");
         if ( AnyError == 0 )
         {
            confirmValues080( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_cuentadante");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0810( )
   {
      /* Scan By routine */
      /* Using cursor T000837 */
      pr_default.execute(35);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T000837_A43Cuen_Identificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         n43Cuen_Identificacion = T000837_n43Cuen_Identificacion[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0810( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T000837_A43Cuen_Identificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
         n43Cuen_Identificacion = T000837_n43Cuen_Identificacion[0] ;
      }
   }

   public void scanEnd0810( )
   {
      pr_default.close(35);
   }

   public void afterConfirm0810( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A338Cuen_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A340Cuen_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n340Cuen_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A337Cuen_UsuarioCrea = AV16Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A339Cuen_UsuarioModifica = AV16Usuario ;
         n339Cuen_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
      }
   }

   public void beforeInsert0810( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0810( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0810( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0810( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0810( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0810( )
   {
      edtCuen_Identificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Enabled, 5, 0)), true);
      edtCuen_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Enabled, 5, 0)), true);
      edtCuen_DigitoVerificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_DigitoVerificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_DigitoVerificacion_Enabled, 5, 0)), true);
      edtCuen_PrimerNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_PrimerNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_PrimerNombre_Enabled, 5, 0)), true);
      edtCuen_SegundoNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_SegundoNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_SegundoNombre_Enabled, 5, 0)), true);
      edtCuen_PrimerApellido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_PrimerApellido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_PrimerApellido_Enabled, 5, 0)), true);
      edtCuen_SegundoApellido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_SegundoApellido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_SegundoApellido_Enabled, 5, 0)), true);
      edtCuen_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Enabled, 5, 0)), true);
      edtTpte_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpte_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Codigo_Enabled, 5, 0)), true);
      edtTpte_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpte_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpte_Descripcion_Enabled, 5, 0)), true);
      edtCuen_Clase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Clase_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Clase_Enabled, 5, 0)), true);
      cmbCuen_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Estado.getEnabled(), 5, 0)), true);
      edtCuen_Direccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Direccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Direccion_Enabled, 5, 0)), true);
      edtCuen_Telefono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Telefono_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Telefono_Enabled, 5, 0)), true);
      edtCuen_Email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Email_Enabled, 5, 0)), true);
      edtCiud_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Enabled, 5, 0)), true);
      edtCiud_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Descripcion_Enabled, 5, 0)), true);
      edtDept_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      edtDept_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Descripcion_Enabled, 5, 0)), true);
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), true);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), true);
      edtRegi_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Id_Enabled, 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      edtRegi_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Descripcion_Enabled, 5, 0)), true);
      edtCuen_UsuarioCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_UsuarioCrea_Enabled, 5, 0)), true);
      edtCuen_FechaCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_FechaCrea_Enabled, 5, 0)), true);
      edtCuen_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_UsuarioModifica_Enabled, 5, 0)), true);
      edtCuen_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_FechaModifica_Enabled, 5, 0)), true);
   }

   public void zm0811( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z692Cuen_Multi_Estado = T00083_A692Cuen_Multi_Estado[0] ;
         }
         else
         {
            Z692Cuen_Multi_Estado = A692Cuen_Multi_Estado ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z692Cuen_Multi_Estado = A692Cuen_Multi_Estado ;
         Z45Cuen_Identificacion_Multi = A45Cuen_Identificacion_Multi ;
         Z690Cuen_Nombre_Multi = A690Cuen_Nombre_Multi ;
         Z691Cuen_Cedula_Multi = A691Cuen_Cedula_Multi ;
      }
   }

   public void standaloneNotModal0811( )
   {
   }

   public void standaloneModal0811( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCuen_Identificacion_Multi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
      }
      else
      {
         edtCuen_Identificacion_Multi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
      }
   }

   public void load0811( )
   {
      /* Using cursor T000838 */
      pr_default.execute(36, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A690Cuen_Nombre_Multi = T000838_A690Cuen_Nombre_Multi[0] ;
         n690Cuen_Nombre_Multi = T000838_n690Cuen_Nombre_Multi[0] ;
         A691Cuen_Cedula_Multi = T000838_A691Cuen_Cedula_Multi[0] ;
         n691Cuen_Cedula_Multi = T000838_n691Cuen_Cedula_Multi[0] ;
         A692Cuen_Multi_Estado = T000838_A692Cuen_Multi_Estado[0] ;
         zm0811( -25) ;
      }
      pr_default.close(36);
      onLoadActions0811( ) ;
   }

   public void onLoadActions0811( )
   {
   }

   public void checkExtendedTable0811( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0811( ) ;
      /* Using cursor T00084 */
      pr_default.execute(2, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A690Cuen_Nombre_Multi = T00084_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T00084_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T00084_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T00084_n691Cuen_Cedula_Multi[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0811( )
   {
      pr_default.close(2);
   }

   public void enableDisable0811( )
   {
   }

   public void gxload_26( long A45Cuen_Identificacion_Multi )
   {
      /* Using cursor T000839 */
      pr_default.execute(37, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A690Cuen_Nombre_Multi = T000839_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T000839_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T000839_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T000839_n691Cuen_Cedula_Multi[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A690Cuen_Nombre_Multi)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(37);
   }

   public void getKey0811( )
   {
      /* Using cursor T000840 */
      pr_default.execute(38, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(38);
   }

   public void getByPrimaryKey0811( )
   {
      /* Using cursor T00083 */
      pr_default.execute(1, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0811( 25) ;
         RcdFound11 = (short)(1) ;
         initializeNonKey0811( ) ;
         A692Cuen_Multi_Estado = T00083_A692Cuen_Multi_Estado[0] ;
         A45Cuen_Identificacion_Multi = T00083_A45Cuen_Identificacion_Multi[0] ;
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z45Cuen_Identificacion_Multi = A45Cuen_Identificacion_Multi ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0811( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0811( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0811( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0811( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0811( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00082 */
         pr_default.execute(0, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z692Cuen_Multi_Estado, T00082_A692Cuen_Multi_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0811( )
   {
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0811( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0811( 0) ;
         checkOptimisticConcurrency0811( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0811( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0811( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000841 */
                  pr_default.execute(39, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), A692Cuen_Multi_Estado, new Long(A45Cuen_Identificacion_Multi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTEMULTIPLE") ;
                  if ( (pr_default.getStatus(39) == 1) )
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
            load0811( ) ;
         }
         endLevel0811( ) ;
      }
      closeExtendedTableCursors0811( ) ;
   }

   public void update0811( )
   {
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0811( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0811( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0811( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0811( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000842 */
                  pr_default.execute(40, new Object[] {A692Cuen_Multi_Estado, new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTEMULTIPLE") ;
                  if ( (pr_default.getStatus(40) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0811( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0811( ) ;
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
         endLevel0811( ) ;
      }
      closeExtendedTableCursors0811( ) ;
   }

   public void deferredUpdate0811( )
   {
   }

   public void delete0811( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0811( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0811( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0811( ) ;
         afterConfirm0811( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0811( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000843 */
               pr_default.execute(41, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTEMULTIPLE") ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0811( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0811( )
   {
      standaloneModal0811( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000844 */
         pr_default.execute(42, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
         A690Cuen_Nombre_Multi = T000844_A690Cuen_Nombre_Multi[0] ;
         n690Cuen_Nombre_Multi = T000844_n690Cuen_Nombre_Multi[0] ;
         A691Cuen_Cedula_Multi = T000844_A691Cuen_Cedula_Multi[0] ;
         n691Cuen_Cedula_Multi = T000844_n691Cuen_Cedula_Multi[0] ;
         pr_default.close(42);
      }
   }

   public void endLevel0811( )
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

   public void scanStart0811( )
   {
      /* Scan By routine */
      /* Using cursor T000845 */
      pr_default.execute(43, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A45Cuen_Identificacion_Multi = T000845_A45Cuen_Identificacion_Multi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0811( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A45Cuen_Identificacion_Multi = T000845_A45Cuen_Identificacion_Multi[0] ;
      }
   }

   public void scanEnd0811( )
   {
      pr_default.close(43);
   }

   public void afterConfirm0811( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0811( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0811( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0811( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0811( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0811( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0811( )
   {
      edtCuen_Identificacion_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
      edtCuen_Nombre_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
      edtCuen_Cedula_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
      cmbCuen_Multi_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Multi_Estado.getEnabled(), 5, 0)), !bGXsfl_154_Refreshing);
   }

   public void subsflControlProps_15411( )
   {
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx ;
      imgprompt_45_Internalname = "PROMPT_45_"+sGXsfl_154_idx ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx );
   }

   public void subsflControlProps_fel_15411( )
   {
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_fel_idx ;
      imgprompt_45_Internalname = "PROMPT_45_"+sGXsfl_154_fel_idx ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI_"+sGXsfl_154_fel_idx ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI_"+sGXsfl_154_fel_idx ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO_"+sGXsfl_154_fel_idx );
   }

   public void addRow0811( )
   {
      nGXsfl_154_idx = (short)(nGXsfl_154_idx+1) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_15411( ) ;
      sendRow0811( ) ;
   }

   public void sendRow0811( )
   {
      Gridalm_cuentadante_multipleRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_cuentadante_multiple_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_cuentadante_multiple_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multiple_Linesclass = subGridalm_cuentadante_multiple_Class+"Odd" ;
         }
      }
      else if ( subGridalm_cuentadante_multiple_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_cuentadante_multiple_Backstyle = (byte)(0) ;
         subGridalm_cuentadante_multiple_Backcolor = subGridalm_cuentadante_multiple_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multiple_Linesclass = subGridalm_cuentadante_multiple_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_cuentadante_multiple_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_cuentadante_multiple_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multiple_Linesclass = subGridalm_cuentadante_multiple_Class+"Odd" ;
         }
         subGridalm_cuentadante_multiple_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_cuentadante_multiple_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_cuentadante_multiple_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_154_idx) % (2))) == 0 )
         {
            subGridalm_cuentadante_multiple_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_cuentadante_multiple_Class, "") != 0 )
            {
               subGridalm_cuentadante_multiple_Linesclass = subGridalm_cuentadante_multiple_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_cuentadante_multiple_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_cuentadante_multiple_Class, "") != 0 )
            {
               subGridalm_cuentadante_multiple_Linesclass = subGridalm_cuentadante_multiple_Class+"Odd" ;
            }
         }
      }
      imgprompt_45_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"'), id:'"+"CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_11_"+sGXsfl_154_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00b1"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CUEN_IDENTIFICACION"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"CUEN_IDENTIFICACION"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CUEN_IDENTIFICACION_MULTI_"',3),t(+,5),t(sGXsfl_154_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"CUEN_IDENTIFICACION_MULTI_"',3),t(+,5),t(sGXsfl_154_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_11_"',3),t(+,5),t(sGXsfl_154_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_43,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_154_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_154_idx + "',154)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Multi_Internalname,GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A45Cuen_Identificacion_Multi), "ZZZZZZZZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,155);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCuen_Identificacion_Multi_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(154),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_cuentadante_multipleRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_45_Internalname,sImgUrl,imgprompt_45_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_45_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Multi_Internalname,A690Cuen_Nombre_Multi,GXutil.rtrim( localUtil.format( A690Cuen_Nombre_Multi, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Nombre_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCuen_Nombre_Multi_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(154),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Cedula_Multi_Internalname,GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", "")),((edtCuen_Cedula_Multi_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A691Cuen_Cedula_Multi), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A691Cuen_Cedula_Multi), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Cedula_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCuen_Cedula_Multi_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(154),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_154_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_154_idx + "',154)\"" ;
      if ( ( nGXsfl_154_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_154_idx ;
         cmbCuen_Multi_Estado.setName( GXCCtl );
         cmbCuen_Multi_Estado.setWebtags( "" );
         cmbCuen_Multi_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Multi_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Multi_Estado.getItemCount() > 0 )
         {
            A692Cuen_Multi_Estado = cmbCuen_Multi_Estado.getValidValue(A692Cuen_Multi_Estado) ;
         }
      }
      /* ComboBox */
      Gridalm_cuentadante_multipleRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCuen_Multi_Estado,cmbCuen_Multi_Estado.getInternalname(),GXutil.rtrim( A692Cuen_Multi_Estado),new Integer(1),cmbCuen_Multi_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbCuen_Multi_Estado.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,158);\"","",new Boolean(true)});
      cmbCuen_Multi_Estado.setValue( GXutil.rtrim( A692Cuen_Multi_Estado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Values", cmbCuen_Multi_Estado.ToJavascriptSource(), !bGXsfl_154_Refreshing);
      httpContext.ajax_sending_grid_row(Gridalm_cuentadante_multipleRow);
      GXCCtl = "Z45Cuen_Identificacion_Multi_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", "")));
      GXCCtl = "Z692Cuen_Multi_Estado_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z692Cuen_Multi_Estado));
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_11_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_11_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_154_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV9TrnContext);
      }
      GXCCtl = "vCUEN_IDENTIFICACION_" + sGXsfl_154_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV15Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_45_"+sGXsfl_154_idx+"Link", GXutil.rtrim( imgprompt_45_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_cuentadante_multipleContainer.AddRow(Gridalm_cuentadante_multipleRow);
   }

   public void readRow0811( )
   {
      nGXsfl_154_idx = (short)(nGXsfl_154_idx+1) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_15411( ) ;
      edtCuen_Identificacion_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
      edtCuen_Nombre_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_NOMBRE_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
      edtCuen_Cedula_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_CEDULA_MULTI_"+sGXsfl_154_idx+"Enabled"), ",", ".")) ;
      cmbCuen_Multi_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_MULTI_ESTADO_"+sGXsfl_154_idx+"Enabled"), ",", ".")) );
      imgprompt_42_Link = httpContext.cgiGet( "PROMPT_45_"+sGXsfl_154_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Multi_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Multi_Internalname), ",", ".") > 999999999999999999L ) ) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_154_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
         wbErr = true ;
         A45Cuen_Identificacion_Multi = 0 ;
      }
      else
      {
         A45Cuen_Identificacion_Multi = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Multi_Internalname), ",", ".") ;
      }
      A690Cuen_Nombre_Multi = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Multi_Internalname)) ;
      n690Cuen_Nombre_Multi = false ;
      A691Cuen_Cedula_Multi = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Multi_Internalname), ",", ".") ;
      n691Cuen_Cedula_Multi = false ;
      cmbCuen_Multi_Estado.setName( cmbCuen_Multi_Estado.getInternalname() );
      cmbCuen_Multi_Estado.setValue( httpContext.cgiGet( cmbCuen_Multi_Estado.getInternalname()) );
      A692Cuen_Multi_Estado = httpContext.cgiGet( cmbCuen_Multi_Estado.getInternalname()) ;
      GXCCtl = "Z45Cuen_Identificacion_Multi_" + sGXsfl_154_idx ;
      Z45Cuen_Identificacion_Multi = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z692Cuen_Multi_Estado_" + sGXsfl_154_idx ;
      Z692Cuen_Multi_Estado = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_154_idx ;
      nRcdDeleted_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_11_" + sGXsfl_154_idx ;
      nRcdExists_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_11_" + sGXsfl_154_idx ;
      nIsMod_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtCuen_Identificacion_Multi_Enabled = edtCuen_Identificacion_Multi_Enabled ;
   }

   public void confirmValues080( )
   {
      nGXsfl_154_idx = (short)(0) ;
      sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_15411( ) ;
      while ( nGXsfl_154_idx < nRC_GXsfl_154 )
      {
         nGXsfl_154_idx = (short)(nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_15411( ) ;
         httpContext.changePostValue( "Z45Cuen_Identificacion_Multi_"+sGXsfl_154_idx, httpContext.cgiGet( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_154_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_154_idx) ;
         httpContext.changePostValue( "Z692Cuen_Multi_Estado_"+sGXsfl_154_idx, httpContext.cgiGet( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_154_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_154_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414143252");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cuentadante") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cuen_Identificacion,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z43Cuen_Identificacion", GXutil.ltrim( localUtil.ntoc( Z43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z44Cuen_Nombre", Z44Cuen_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z337Cuen_UsuarioCrea", Z337Cuen_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z339Cuen_UsuarioModifica", Z339Cuen_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z338Cuen_FechaCrea", localUtil.ttoc( Z338Cuen_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z340Cuen_FechaModifica", localUtil.ttoc( Z340Cuen_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z688Cuen_Cedula", GXutil.ltrim( localUtil.ntoc( Z688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z326Cuen_DigitoVerificacion", GXutil.ltrim( localUtil.ntoc( Z326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z331Cuen_PrimerNombre", Z331Cuen_PrimerNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z332Cuen_SegundoNombre", Z332Cuen_SegundoNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z329Cuen_PrimerApellido", Z329Cuen_PrimerApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z330Cuen_SegundoApellido", Z330Cuen_SegundoApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z328Cuen_Clase", Z328Cuen_Clase);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z333Cuen_Estado", GXutil.rtrim( Z333Cuen_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z334Cuen_Direccion", Z334Cuen_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z335Cuen_Telefono", Z335Cuen_Telefono);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z336Cuen_Email", Z336Cuen_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z42Tpte_Codigo", GXutil.rtrim( Z42Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z1Cent_Id", GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_154", GXutil.ltrim( localUtil.ntoc( nGXsfl_154_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N42Tpte_Codigo", GXutil.rtrim( A42Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N1Cent_Id", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV15Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TPTE_CODIGO", GXutil.rtrim( AV11Insert_Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CENT_ID", GXutil.ltrim( localUtil.ntoc( AV14Insert_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV16Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV17Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CUENTADANTE" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cuentadante:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_cuentadante") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cuen_Identificacion,18,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_CUENTADANTE" ;
   }

   public String getPgmdesc( )
   {
      return "Cuentadante" ;
   }

   public void initializeNonKey0810( )
   {
      A42Tpte_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      A1Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      A44Cuen_Nombre = "" ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      n44Cuen_Nombre = ((GXutil.strcmp("", A44Cuen_Nombre)==0) ? true : false) ;
      A337Cuen_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
      A339Cuen_UsuarioModifica = "" ;
      n339Cuen_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
      n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n340Cuen_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
      A688Cuen_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
      A326Cuen_DigitoVerificacion = (byte)(0) ;
      n326Cuen_DigitoVerificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
      n326Cuen_DigitoVerificacion = ((0==A326Cuen_DigitoVerificacion) ? true : false) ;
      A331Cuen_PrimerNombre = "" ;
      n331Cuen_PrimerNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
      n331Cuen_PrimerNombre = ((GXutil.strcmp("", A331Cuen_PrimerNombre)==0) ? true : false) ;
      A332Cuen_SegundoNombre = "" ;
      n332Cuen_SegundoNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
      n332Cuen_SegundoNombre = ((GXutil.strcmp("", A332Cuen_SegundoNombre)==0) ? true : false) ;
      A329Cuen_PrimerApellido = "" ;
      n329Cuen_PrimerApellido = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
      n329Cuen_PrimerApellido = ((GXutil.strcmp("", A329Cuen_PrimerApellido)==0) ? true : false) ;
      A330Cuen_SegundoApellido = "" ;
      n330Cuen_SegundoApellido = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
      n330Cuen_SegundoApellido = ((GXutil.strcmp("", A330Cuen_SegundoApellido)==0) ? true : false) ;
      A321Tpte_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A321Tpte_Descripcion", A321Tpte_Descripcion);
      A328Cuen_Clase = "" ;
      n328Cuen_Clase = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328Cuen_Clase", A328Cuen_Clase);
      n328Cuen_Clase = ((GXutil.strcmp("", A328Cuen_Clase)==0) ? true : false) ;
      A333Cuen_Estado = "" ;
      n333Cuen_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
      n333Cuen_Estado = ((GXutil.strcmp("", A333Cuen_Estado)==0) ? true : false) ;
      A334Cuen_Direccion = "" ;
      n334Cuen_Direccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
      n334Cuen_Direccion = ((GXutil.strcmp("", A334Cuen_Direccion)==0) ? true : false) ;
      A335Cuen_Telefono = "" ;
      n335Cuen_Telefono = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
      n335Cuen_Telefono = ((GXutil.strcmp("", A335Cuen_Telefono)==0) ? true : false) ;
      A336Cuen_Email = "" ;
      n336Cuen_Email = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
      n336Cuen_Email = ((GXutil.strcmp("", A336Cuen_Email)==0) ? true : false) ;
      A5Ciud_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      A7Ciud_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      A10Dept_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A3Cent_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A2Regi_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      A12Regi_Cod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      Z44Cuen_Nombre = "" ;
      Z337Cuen_UsuarioCrea = "" ;
      Z339Cuen_UsuarioModifica = "" ;
      Z338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z688Cuen_Cedula = 0 ;
      Z326Cuen_DigitoVerificacion = (byte)(0) ;
      Z331Cuen_PrimerNombre = "" ;
      Z332Cuen_SegundoNombre = "" ;
      Z329Cuen_PrimerApellido = "" ;
      Z330Cuen_SegundoApellido = "" ;
      Z328Cuen_Clase = "" ;
      Z333Cuen_Estado = "" ;
      Z334Cuen_Direccion = "" ;
      Z335Cuen_Telefono = "" ;
      Z336Cuen_Email = "" ;
      Z42Tpte_Codigo = "" ;
      Z1Cent_Id = 0 ;
   }

   public void initAll0810( )
   {
      A43Cuen_Identificacion = 0 ;
      n43Cuen_Identificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      initializeNonKey0810( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0811( )
   {
      A690Cuen_Nombre_Multi = "" ;
      n690Cuen_Nombre_Multi = false ;
      A691Cuen_Cedula_Multi = 0 ;
      n691Cuen_Cedula_Multi = false ;
      A692Cuen_Multi_Estado = "" ;
      Z692Cuen_Multi_Estado = "" ;
   }

   public void initAll0811( )
   {
      A45Cuen_Identificacion_Multi = 0 ;
      initializeNonKey0811( ) ;
   }

   public void standaloneModalInsert0811( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414143274");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_cuentadante.js", "?201861414143274");
      /* End function include_jscripts */
   }

   public void init_level_properties11( )
   {
      edtCuen_Identificacion_Multi_Enabled = defedtCuen_Identificacion_Multi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_154_Refreshing);
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
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION" ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA" ;
      edtCuen_DigitoVerificacion_Internalname = "CUEN_DIGITOVERIFICACION" ;
      edtCuen_PrimerNombre_Internalname = "CUEN_PRIMERNOMBRE" ;
      edtCuen_SegundoNombre_Internalname = "CUEN_SEGUNDONOMBRE" ;
      edtCuen_PrimerApellido_Internalname = "CUEN_PRIMERAPELLIDO" ;
      edtCuen_SegundoApellido_Internalname = "CUEN_SEGUNDOAPELLIDO" ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      edtTpte_Codigo_Internalname = "TPTE_CODIGO" ;
      edtTpte_Descripcion_Internalname = "TPTE_DESCRIPCION" ;
      edtCuen_Clase_Internalname = "CUEN_CLASE" ;
      cmbCuen_Estado.setInternalname( "CUEN_ESTADO" );
      edtCuen_Direccion_Internalname = "CUEN_DIRECCION" ;
      edtCuen_Telefono_Internalname = "CUEN_TELEFONO" ;
      edtCuen_Email_Internalname = "CUEN_EMAIL" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtRegi_Id_Internalname = "REGI_ID" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      edtCuen_UsuarioCrea_Internalname = "CUEN_USUARIOCREA" ;
      edtCuen_FechaCrea_Internalname = "CUEN_FECHACREA" ;
      edtCuen_UsuarioModifica_Internalname = "CUEN_USUARIOMODIFICA" ;
      edtCuen_FechaModifica_Internalname = "CUEN_FECHAMODIFICA" ;
      lblTitlemultiple_Internalname = "TITLEMULTIPLE" ;
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI" ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI" ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI" ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO" );
      divMultipletable_Internalname = "MULTIPLETABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_42_Internalname = "PROMPT_42" ;
      imgprompt_1_Internalname = "PROMPT_1" ;
      imgprompt_45_Internalname = "PROMPT_45" ;
      subGridalm_cuentadante_multiple_Internalname = "GRIDALM_CUENTADANTE_MULTIPLE" ;
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
      Form.setCaption( "Cuentadante" );
      cmbCuen_Multi_Estado.setJsonclick( "" );
      edtCuen_Cedula_Multi_Jsonclick = "" ;
      edtCuen_Nombre_Multi_Jsonclick = "" ;
      imgprompt_45_Visible = 1 ;
      imgprompt_45_Link = "" ;
      imgprompt_42_Visible = 1 ;
      edtCuen_Identificacion_Multi_Jsonclick = "" ;
      subGridalm_cuentadante_multiple_Class = "Grid" ;
      subGridalm_cuentadante_multiple_Backcolorstyle = (byte)(0) ;
      subGridalm_cuentadante_multiple_Allowcollapsing = (byte)(0) ;
      subGridalm_cuentadante_multiple_Allowselection = (byte)(0) ;
      cmbCuen_Multi_Estado.setEnabled( 1 );
      edtCuen_Cedula_Multi_Enabled = 0 ;
      edtCuen_Nombre_Multi_Enabled = 0 ;
      edtCuen_Identificacion_Multi_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      divMultipletable_Visible = 1 ;
      edtCuen_FechaModifica_Jsonclick = "" ;
      edtCuen_FechaModifica_Enabled = 1 ;
      edtCuen_UsuarioModifica_Jsonclick = "" ;
      edtCuen_UsuarioModifica_Enabled = 1 ;
      edtCuen_FechaCrea_Jsonclick = "" ;
      edtCuen_FechaCrea_Enabled = 1 ;
      edtCuen_UsuarioCrea_Jsonclick = "" ;
      edtCuen_UsuarioCrea_Enabled = 1 ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 1 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtCuen_Email_Jsonclick = "" ;
      edtCuen_Email_Enabled = 1 ;
      edtCuen_Telefono_Jsonclick = "" ;
      edtCuen_Telefono_Enabled = 1 ;
      edtCuen_Direccion_Enabled = 1 ;
      cmbCuen_Estado.setJsonclick( "" );
      cmbCuen_Estado.setEnabled( 1 );
      edtCuen_Clase_Jsonclick = "" ;
      edtCuen_Clase_Enabled = 1 ;
      edtTpte_Descripcion_Jsonclick = "" ;
      edtTpte_Descripcion_Enabled = 0 ;
      imgprompt_42_Visible = 1 ;
      imgprompt_42_Link = "" ;
      edtTpte_Codigo_Jsonclick = "" ;
      edtTpte_Codigo_Enabled = 1 ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Enabled = 1 ;
      edtCuen_SegundoApellido_Jsonclick = "" ;
      edtCuen_SegundoApellido_Enabled = 1 ;
      edtCuen_PrimerApellido_Jsonclick = "" ;
      edtCuen_PrimerApellido_Enabled = 1 ;
      edtCuen_SegundoNombre_Jsonclick = "" ;
      edtCuen_SegundoNombre_Enabled = 1 ;
      edtCuen_PrimerNombre_Jsonclick = "" ;
      edtCuen_PrimerNombre_Enabled = 1 ;
      edtCuen_DigitoVerificacion_Jsonclick = "" ;
      edtCuen_DigitoVerificacion_Enabled = 1 ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Cedula_Enabled = 1 ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtCuen_Identificacion_Enabled = 0 ;
      edtCuen_Identificacion_Visible = 1 ;
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

   public void gxnrgridalm_cuentadante_multiple_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_15411( ) ;
      while ( nGXsfl_154_idx <= nRC_GXsfl_154 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0811( ) ;
         standaloneModal0811( ) ;
         cmbCuen_Estado.setName( "CUEN_ESTADO" );
         cmbCuen_Estado.setWebtags( "" );
         cmbCuen_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Estado.getItemCount() > 0 )
         {
            A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
            n333Cuen_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
         }
         GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_154_idx ;
         cmbCuen_Multi_Estado.setName( GXCCtl );
         cmbCuen_Multi_Estado.setWebtags( "" );
         cmbCuen_Multi_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Multi_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Multi_Estado.getItemCount() > 0 )
         {
            A692Cuen_Multi_Estado = cmbCuen_Multi_Estado.getValidValue(A692Cuen_Multi_Estado) ;
         }
         dynload_actions( ) ;
         sendRow0811( ) ;
         nGXsfl_154_idx = (short)(nGXsfl_154_idx+1) ;
         sGXsfl_154_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_154_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_15411( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_cuentadante_multipleContainer.ToJavascriptSource());
      /* End function gxnrGridalm_cuentadante_multiple_newrow */
   }

   public void valid_Tpte_codigo( String GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A42Tpte_Codigo = GX_Parm1 ;
      A321Tpte_Descripcion = GX_Parm2 ;
      /* Using cursor T000825 */
      pr_default.execute(23, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE TERCERO'.", "ForeignKeyNotFound", 1, "TPTE_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpte_Codigo_Internalname ;
      }
      A321Tpte_Descripcion = T000825_A321Tpte_Descripcion[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A321Tpte_Descripcion = "" ;
      }
      isValidOutput.add(A321Tpte_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Ciud_codigo( short GX_Parm1 ,
                                  short GX_Parm2 ,
                                  String GX_Parm3 ,
                                  String GX_Parm4 )
   {
      A5Ciud_Codigo = GX_Parm1 ;
      A6Dept_Codigo = GX_Parm2 ;
      A7Ciud_Descripcion = GX_Parm3 ;
      A10Dept_Descripcion = GX_Parm4 ;
      /* Using cursor T000828 */
      pr_default.execute(26, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000828_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000828_A6Dept_Codigo[0] ;
      pr_default.close(26);
      /* Using cursor T000829 */
      pr_default.execute(27, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000829_A10Dept_Descripcion[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A7Ciud_Descripcion = "" ;
         A6Dept_Codigo = (short)(0) ;
         A10Dept_Descripcion = "" ;
      }
      isValidOutput.add(A7Ciud_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A10Dept_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Cent_id( long GX_Parm1 ,
                              long GX_Parm2 ,
                              String GX_Parm3 ,
                              String GX_Parm4 ,
                              short GX_Parm5 ,
                              String GX_Parm6 ,
                              short GX_Parm7 )
   {
      A1Cent_Id = GX_Parm1 ;
      A2Regi_Id = GX_Parm2 ;
      A3Cent_Codigo = GX_Parm3 ;
      A4Cent_Descripcion = GX_Parm4 ;
      A12Regi_Cod = GX_Parm5 ;
      A13Regi_Descripcion = GX_Parm6 ;
      A5Ciud_Codigo = GX_Parm7 ;
      /* Using cursor T000826 */
      pr_default.execute(24, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
      }
      A3Cent_Codigo = T000826_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000826_A4Cent_Descripcion[0] ;
      A2Regi_Id = T000826_A2Regi_Id[0] ;
      pr_default.close(24);
      /* Using cursor T000827 */
      pr_default.execute(25, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000827_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T000827_A13Regi_Descripcion[0] ;
      A5Ciud_Codigo = T000827_A5Ciud_Codigo[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A3Cent_Codigo = "" ;
         A4Cent_Descripcion = "" ;
         A2Regi_Id = 0 ;
         A12Regi_Cod = (short)(0) ;
         A13Regi_Descripcion = "" ;
         A5Ciud_Codigo = (short)(0) ;
      }
      isValidOutput.add(A3Cent_Codigo);
      isValidOutput.add(A4Cent_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A13Regi_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Cuen_identificacion_multi( long GX_Parm1 ,
                                                String GX_Parm2 ,
                                                long GX_Parm3 )
   {
      A45Cuen_Identificacion_Multi = GX_Parm1 ;
      A690Cuen_Nombre_Multi = GX_Parm2 ;
      n690Cuen_Nombre_Multi = false ;
      A691Cuen_Cedula_Multi = GX_Parm3 ;
      n691Cuen_Cedula_Multi = false ;
      /* Using cursor T000844 */
      pr_default.execute(42, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, "CUEN_IDENTIFICACION_MULTI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
      }
      A690Cuen_Nombre_Multi = T000844_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T000844_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T000844_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T000844_n691Cuen_Cedula_Multi[0] ;
      pr_default.close(42);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A690Cuen_Nombre_Multi = "" ;
         n690Cuen_Nombre_Multi = false ;
         A691Cuen_Cedula_Multi = 0 ;
         n691Cuen_Cedula_Multi = false ;
      }
      isValidOutput.add(A690Cuen_Nombre_Multi);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV15Cuen_Identificacion',fld:'vCUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12082',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(42);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z44Cuen_Nombre = "" ;
      Z337Cuen_UsuarioCrea = "" ;
      Z339Cuen_UsuarioModifica = "" ;
      Z338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z331Cuen_PrimerNombre = "" ;
      Z332Cuen_SegundoNombre = "" ;
      Z329Cuen_PrimerApellido = "" ;
      Z330Cuen_SegundoApellido = "" ;
      Z328Cuen_Clase = "" ;
      Z333Cuen_Estado = "" ;
      Z334Cuen_Direccion = "" ;
      Z335Cuen_Telefono = "" ;
      Z336Cuen_Email = "" ;
      Z42Tpte_Codigo = "" ;
      N42Tpte_Codigo = "" ;
      Z692Cuen_Multi_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A42Tpte_Codigo = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A333Cuen_Estado = "" ;
      GXCCtl = "" ;
      A692Cuen_Multi_Estado = "" ;
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
      A331Cuen_PrimerNombre = "" ;
      A332Cuen_SegundoNombre = "" ;
      A329Cuen_PrimerApellido = "" ;
      A330Cuen_SegundoApellido = "" ;
      A44Cuen_Nombre = "" ;
      sImgUrl = "" ;
      A321Tpte_Descripcion = "" ;
      A328Cuen_Clase = "" ;
      A334Cuen_Direccion = "" ;
      A335Cuen_Telefono = "" ;
      A336Cuen_Email = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A337Cuen_UsuarioCrea = "" ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A339Cuen_UsuarioModifica = "" ;
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      lblTitlemultiple_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_cuentadante_multipleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_cuentadante_multipleColumn = new com.genexus.webpanels.GXWebColumn();
      A690Cuen_Nombre_Multi = "" ;
      sMode11 = "" ;
      sStyleString = "" ;
      AV11Insert_Tpte_Codigo = "" ;
      AV16Usuario = "" ;
      AV17Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode10 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z321Tpte_Descripcion = "" ;
      Z3Cent_Codigo = "" ;
      Z4Cent_Descripcion = "" ;
      Z13Regi_Descripcion = "" ;
      Z7Ciud_Descripcion = "" ;
      Z10Dept_Descripcion = "" ;
      T00088_A3Cent_Codigo = new String[] {""} ;
      T00088_A4Cent_Descripcion = new String[] {""} ;
      T00088_A2Regi_Id = new long[1] ;
      T00089_A12Regi_Cod = new short[1] ;
      T00089_A13Regi_Descripcion = new String[] {""} ;
      T00089_A5Ciud_Codigo = new short[1] ;
      T000810_A7Ciud_Descripcion = new String[] {""} ;
      T000810_A6Dept_Codigo = new short[1] ;
      T000811_A10Dept_Descripcion = new String[] {""} ;
      T00087_A321Tpte_Descripcion = new String[] {""} ;
      T000812_A43Cuen_Identificacion = new long[1] ;
      T000812_n43Cuen_Identificacion = new boolean[] {false} ;
      T000812_A44Cuen_Nombre = new String[] {""} ;
      T000812_n44Cuen_Nombre = new boolean[] {false} ;
      T000812_A337Cuen_UsuarioCrea = new String[] {""} ;
      T000812_A339Cuen_UsuarioModifica = new String[] {""} ;
      T000812_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T000812_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000812_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000812_n340Cuen_FechaModifica = new boolean[] {false} ;
      T000812_A688Cuen_Cedula = new long[1] ;
      T000812_A326Cuen_DigitoVerificacion = new byte[1] ;
      T000812_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T000812_A331Cuen_PrimerNombre = new String[] {""} ;
      T000812_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T000812_A332Cuen_SegundoNombre = new String[] {""} ;
      T000812_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T000812_A329Cuen_PrimerApellido = new String[] {""} ;
      T000812_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T000812_A330Cuen_SegundoApellido = new String[] {""} ;
      T000812_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T000812_A321Tpte_Descripcion = new String[] {""} ;
      T000812_A328Cuen_Clase = new String[] {""} ;
      T000812_n328Cuen_Clase = new boolean[] {false} ;
      T000812_A333Cuen_Estado = new String[] {""} ;
      T000812_n333Cuen_Estado = new boolean[] {false} ;
      T000812_A334Cuen_Direccion = new String[] {""} ;
      T000812_n334Cuen_Direccion = new boolean[] {false} ;
      T000812_A335Cuen_Telefono = new String[] {""} ;
      T000812_n335Cuen_Telefono = new boolean[] {false} ;
      T000812_A336Cuen_Email = new String[] {""} ;
      T000812_n336Cuen_Email = new boolean[] {false} ;
      T000812_A7Ciud_Descripcion = new String[] {""} ;
      T000812_A10Dept_Descripcion = new String[] {""} ;
      T000812_A3Cent_Codigo = new String[] {""} ;
      T000812_A4Cent_Descripcion = new String[] {""} ;
      T000812_A2Regi_Id = new long[1] ;
      T000812_A12Regi_Cod = new short[1] ;
      T000812_A13Regi_Descripcion = new String[] {""} ;
      T000812_A42Tpte_Codigo = new String[] {""} ;
      T000812_A1Cent_Id = new long[1] ;
      T000812_A5Ciud_Codigo = new short[1] ;
      T000812_A6Dept_Codigo = new short[1] ;
      T000813_A321Tpte_Descripcion = new String[] {""} ;
      T000814_A3Cent_Codigo = new String[] {""} ;
      T000814_A4Cent_Descripcion = new String[] {""} ;
      T000814_A2Regi_Id = new long[1] ;
      T000815_A12Regi_Cod = new short[1] ;
      T000815_A13Regi_Descripcion = new String[] {""} ;
      T000815_A5Ciud_Codigo = new short[1] ;
      T000816_A7Ciud_Descripcion = new String[] {""} ;
      T000816_A6Dept_Codigo = new short[1] ;
      T000817_A10Dept_Descripcion = new String[] {""} ;
      T000818_A43Cuen_Identificacion = new long[1] ;
      T000818_n43Cuen_Identificacion = new boolean[] {false} ;
      T00086_A43Cuen_Identificacion = new long[1] ;
      T00086_n43Cuen_Identificacion = new boolean[] {false} ;
      T00086_A44Cuen_Nombre = new String[] {""} ;
      T00086_n44Cuen_Nombre = new boolean[] {false} ;
      T00086_A337Cuen_UsuarioCrea = new String[] {""} ;
      T00086_A339Cuen_UsuarioModifica = new String[] {""} ;
      T00086_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T00086_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00086_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00086_n340Cuen_FechaModifica = new boolean[] {false} ;
      T00086_A688Cuen_Cedula = new long[1] ;
      T00086_A326Cuen_DigitoVerificacion = new byte[1] ;
      T00086_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T00086_A331Cuen_PrimerNombre = new String[] {""} ;
      T00086_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T00086_A332Cuen_SegundoNombre = new String[] {""} ;
      T00086_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T00086_A329Cuen_PrimerApellido = new String[] {""} ;
      T00086_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T00086_A330Cuen_SegundoApellido = new String[] {""} ;
      T00086_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T00086_A328Cuen_Clase = new String[] {""} ;
      T00086_n328Cuen_Clase = new boolean[] {false} ;
      T00086_A333Cuen_Estado = new String[] {""} ;
      T00086_n333Cuen_Estado = new boolean[] {false} ;
      T00086_A334Cuen_Direccion = new String[] {""} ;
      T00086_n334Cuen_Direccion = new boolean[] {false} ;
      T00086_A335Cuen_Telefono = new String[] {""} ;
      T00086_n335Cuen_Telefono = new boolean[] {false} ;
      T00086_A336Cuen_Email = new String[] {""} ;
      T00086_n336Cuen_Email = new boolean[] {false} ;
      T00086_A42Tpte_Codigo = new String[] {""} ;
      T00086_A1Cent_Id = new long[1] ;
      T00086_A2Regi_Id = new long[1] ;
      T000819_A43Cuen_Identificacion = new long[1] ;
      T000819_n43Cuen_Identificacion = new boolean[] {false} ;
      T000820_A43Cuen_Identificacion = new long[1] ;
      T000820_n43Cuen_Identificacion = new boolean[] {false} ;
      T00085_A43Cuen_Identificacion = new long[1] ;
      T00085_n43Cuen_Identificacion = new boolean[] {false} ;
      T00085_A44Cuen_Nombre = new String[] {""} ;
      T00085_n44Cuen_Nombre = new boolean[] {false} ;
      T00085_A337Cuen_UsuarioCrea = new String[] {""} ;
      T00085_A339Cuen_UsuarioModifica = new String[] {""} ;
      T00085_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T00085_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00085_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00085_n340Cuen_FechaModifica = new boolean[] {false} ;
      T00085_A688Cuen_Cedula = new long[1] ;
      T00085_A326Cuen_DigitoVerificacion = new byte[1] ;
      T00085_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T00085_A331Cuen_PrimerNombre = new String[] {""} ;
      T00085_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T00085_A332Cuen_SegundoNombre = new String[] {""} ;
      T00085_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T00085_A329Cuen_PrimerApellido = new String[] {""} ;
      T00085_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T00085_A330Cuen_SegundoApellido = new String[] {""} ;
      T00085_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T00085_A328Cuen_Clase = new String[] {""} ;
      T00085_n328Cuen_Clase = new boolean[] {false} ;
      T00085_A333Cuen_Estado = new String[] {""} ;
      T00085_n333Cuen_Estado = new boolean[] {false} ;
      T00085_A334Cuen_Direccion = new String[] {""} ;
      T00085_n334Cuen_Direccion = new boolean[] {false} ;
      T00085_A335Cuen_Telefono = new String[] {""} ;
      T00085_n335Cuen_Telefono = new boolean[] {false} ;
      T00085_A336Cuen_Email = new String[] {""} ;
      T00085_n336Cuen_Email = new boolean[] {false} ;
      T00085_A42Tpte_Codigo = new String[] {""} ;
      T00085_A1Cent_Id = new long[1] ;
      T00085_A2Regi_Id = new long[1] ;
      T000822_A43Cuen_Identificacion = new long[1] ;
      T000822_n43Cuen_Identificacion = new boolean[] {false} ;
      T000825_A321Tpte_Descripcion = new String[] {""} ;
      T000826_A3Cent_Codigo = new String[] {""} ;
      T000826_A4Cent_Descripcion = new String[] {""} ;
      T000826_A2Regi_Id = new long[1] ;
      T000827_A12Regi_Cod = new short[1] ;
      T000827_A13Regi_Descripcion = new String[] {""} ;
      T000827_A5Ciud_Codigo = new short[1] ;
      T000828_A7Ciud_Descripcion = new String[] {""} ;
      T000828_A6Dept_Codigo = new short[1] ;
      T000829_A10Dept_Descripcion = new String[] {""} ;
      T000830_A46Tran_Id = new long[1] ;
      T000831_A46Tran_Id = new long[1] ;
      T000832_A46Tran_Id = new long[1] ;
      T000833_A46Tran_Id = new long[1] ;
      T000834_A66Elem_Consecutivo = new String[] {""} ;
      T000834_A67Invd_NumeroPlaca = new String[] {""} ;
      T000835_A43Cuen_Identificacion = new long[1] ;
      T000835_n43Cuen_Identificacion = new boolean[] {false} ;
      T000835_A45Cuen_Identificacion_Multi = new long[1] ;
      T000836_A1Cent_Id = new long[1] ;
      T000836_A27Alma_Modulo = new String[] {""} ;
      T000836_A28Alma_Codigo = new String[] {""} ;
      T000837_A43Cuen_Identificacion = new long[1] ;
      T000837_n43Cuen_Identificacion = new boolean[] {false} ;
      Z690Cuen_Nombre_Multi = "" ;
      T000838_A43Cuen_Identificacion = new long[1] ;
      T000838_n43Cuen_Identificacion = new boolean[] {false} ;
      T000838_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000838_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000838_A691Cuen_Cedula_Multi = new long[1] ;
      T000838_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000838_A692Cuen_Multi_Estado = new String[] {""} ;
      T000838_A45Cuen_Identificacion_Multi = new long[1] ;
      T00084_A690Cuen_Nombre_Multi = new String[] {""} ;
      T00084_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T00084_A691Cuen_Cedula_Multi = new long[1] ;
      T00084_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000839_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000839_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000839_A691Cuen_Cedula_Multi = new long[1] ;
      T000839_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000840_A43Cuen_Identificacion = new long[1] ;
      T000840_n43Cuen_Identificacion = new boolean[] {false} ;
      T000840_A45Cuen_Identificacion_Multi = new long[1] ;
      T00083_A43Cuen_Identificacion = new long[1] ;
      T00083_n43Cuen_Identificacion = new boolean[] {false} ;
      T00083_A692Cuen_Multi_Estado = new String[] {""} ;
      T00083_A45Cuen_Identificacion_Multi = new long[1] ;
      T00082_A43Cuen_Identificacion = new long[1] ;
      T00082_n43Cuen_Identificacion = new boolean[] {false} ;
      T00082_A692Cuen_Multi_Estado = new String[] {""} ;
      T00082_A45Cuen_Identificacion_Multi = new long[1] ;
      T000844_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000844_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000844_A691Cuen_Cedula_Multi = new long[1] ;
      T000844_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000845_A43Cuen_Identificacion = new long[1] ;
      T000845_n43Cuen_Identificacion = new boolean[] {false} ;
      T000845_A45Cuen_Identificacion_Multi = new long[1] ;
      Gridalm_cuentadante_multipleRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_cuentadante_multiple_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cuentadante__default(),
         new Object[] {
             new Object[] {
            T00082_A43Cuen_Identificacion, T00082_A692Cuen_Multi_Estado, T00082_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T00083_A43Cuen_Identificacion, T00083_A692Cuen_Multi_Estado, T00083_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T00084_A690Cuen_Nombre_Multi, T00084_n690Cuen_Nombre_Multi, T00084_A691Cuen_Cedula_Multi, T00084_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T00085_A43Cuen_Identificacion, T00085_A44Cuen_Nombre, T00085_n44Cuen_Nombre, T00085_A337Cuen_UsuarioCrea, T00085_A339Cuen_UsuarioModifica, T00085_n339Cuen_UsuarioModifica, T00085_A338Cuen_FechaCrea, T00085_A340Cuen_FechaModifica, T00085_n340Cuen_FechaModifica, T00085_A688Cuen_Cedula,
            T00085_A326Cuen_DigitoVerificacion, T00085_n326Cuen_DigitoVerificacion, T00085_A331Cuen_PrimerNombre, T00085_n331Cuen_PrimerNombre, T00085_A332Cuen_SegundoNombre, T00085_n332Cuen_SegundoNombre, T00085_A329Cuen_PrimerApellido, T00085_n329Cuen_PrimerApellido, T00085_A330Cuen_SegundoApellido, T00085_n330Cuen_SegundoApellido,
            T00085_A328Cuen_Clase, T00085_n328Cuen_Clase, T00085_A333Cuen_Estado, T00085_n333Cuen_Estado, T00085_A334Cuen_Direccion, T00085_n334Cuen_Direccion, T00085_A335Cuen_Telefono, T00085_n335Cuen_Telefono, T00085_A336Cuen_Email, T00085_n336Cuen_Email,
            T00085_A42Tpte_Codigo, T00085_A1Cent_Id, T00085_A2Regi_Id
            }
            , new Object[] {
            T00086_A43Cuen_Identificacion, T00086_A44Cuen_Nombre, T00086_n44Cuen_Nombre, T00086_A337Cuen_UsuarioCrea, T00086_A339Cuen_UsuarioModifica, T00086_n339Cuen_UsuarioModifica, T00086_A338Cuen_FechaCrea, T00086_A340Cuen_FechaModifica, T00086_n340Cuen_FechaModifica, T00086_A688Cuen_Cedula,
            T00086_A326Cuen_DigitoVerificacion, T00086_n326Cuen_DigitoVerificacion, T00086_A331Cuen_PrimerNombre, T00086_n331Cuen_PrimerNombre, T00086_A332Cuen_SegundoNombre, T00086_n332Cuen_SegundoNombre, T00086_A329Cuen_PrimerApellido, T00086_n329Cuen_PrimerApellido, T00086_A330Cuen_SegundoApellido, T00086_n330Cuen_SegundoApellido,
            T00086_A328Cuen_Clase, T00086_n328Cuen_Clase, T00086_A333Cuen_Estado, T00086_n333Cuen_Estado, T00086_A334Cuen_Direccion, T00086_n334Cuen_Direccion, T00086_A335Cuen_Telefono, T00086_n335Cuen_Telefono, T00086_A336Cuen_Email, T00086_n336Cuen_Email,
            T00086_A42Tpte_Codigo, T00086_A1Cent_Id, T00086_A2Regi_Id
            }
            , new Object[] {
            T00087_A321Tpte_Descripcion
            }
            , new Object[] {
            T00088_A3Cent_Codigo, T00088_A4Cent_Descripcion, T00088_A2Regi_Id
            }
            , new Object[] {
            T00089_A12Regi_Cod, T00089_A13Regi_Descripcion, T00089_A5Ciud_Codigo
            }
            , new Object[] {
            T000810_A7Ciud_Descripcion, T000810_A6Dept_Codigo
            }
            , new Object[] {
            T000811_A10Dept_Descripcion
            }
            , new Object[] {
            T000812_A43Cuen_Identificacion, T000812_A44Cuen_Nombre, T000812_n44Cuen_Nombre, T000812_A337Cuen_UsuarioCrea, T000812_A339Cuen_UsuarioModifica, T000812_n339Cuen_UsuarioModifica, T000812_A338Cuen_FechaCrea, T000812_A340Cuen_FechaModifica, T000812_n340Cuen_FechaModifica, T000812_A688Cuen_Cedula,
            T000812_A326Cuen_DigitoVerificacion, T000812_n326Cuen_DigitoVerificacion, T000812_A331Cuen_PrimerNombre, T000812_n331Cuen_PrimerNombre, T000812_A332Cuen_SegundoNombre, T000812_n332Cuen_SegundoNombre, T000812_A329Cuen_PrimerApellido, T000812_n329Cuen_PrimerApellido, T000812_A330Cuen_SegundoApellido, T000812_n330Cuen_SegundoApellido,
            T000812_A321Tpte_Descripcion, T000812_A328Cuen_Clase, T000812_n328Cuen_Clase, T000812_A333Cuen_Estado, T000812_n333Cuen_Estado, T000812_A334Cuen_Direccion, T000812_n334Cuen_Direccion, T000812_A335Cuen_Telefono, T000812_n335Cuen_Telefono, T000812_A336Cuen_Email,
            T000812_n336Cuen_Email, T000812_A7Ciud_Descripcion, T000812_A10Dept_Descripcion, T000812_A3Cent_Codigo, T000812_A4Cent_Descripcion, T000812_A2Regi_Id, T000812_A12Regi_Cod, T000812_A13Regi_Descripcion, T000812_A42Tpte_Codigo, T000812_A1Cent_Id,
            T000812_A5Ciud_Codigo, T000812_A6Dept_Codigo
            }
            , new Object[] {
            T000813_A321Tpte_Descripcion
            }
            , new Object[] {
            T000814_A3Cent_Codigo, T000814_A4Cent_Descripcion, T000814_A2Regi_Id
            }
            , new Object[] {
            T000815_A12Regi_Cod, T000815_A13Regi_Descripcion, T000815_A5Ciud_Codigo
            }
            , new Object[] {
            T000816_A7Ciud_Descripcion, T000816_A6Dept_Codigo
            }
            , new Object[] {
            T000817_A10Dept_Descripcion
            }
            , new Object[] {
            T000818_A43Cuen_Identificacion
            }
            , new Object[] {
            T000819_A43Cuen_Identificacion
            }
            , new Object[] {
            T000820_A43Cuen_Identificacion
            }
            , new Object[] {
            }
            , new Object[] {
            T000822_A43Cuen_Identificacion
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000825_A321Tpte_Descripcion
            }
            , new Object[] {
            T000826_A3Cent_Codigo, T000826_A4Cent_Descripcion, T000826_A2Regi_Id
            }
            , new Object[] {
            T000827_A12Regi_Cod, T000827_A13Regi_Descripcion, T000827_A5Ciud_Codigo
            }
            , new Object[] {
            T000828_A7Ciud_Descripcion, T000828_A6Dept_Codigo
            }
            , new Object[] {
            T000829_A10Dept_Descripcion
            }
            , new Object[] {
            T000830_A46Tran_Id
            }
            , new Object[] {
            T000831_A46Tran_Id
            }
            , new Object[] {
            T000832_A46Tran_Id
            }
            , new Object[] {
            T000833_A46Tran_Id
            }
            , new Object[] {
            T000834_A66Elem_Consecutivo, T000834_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000835_A43Cuen_Identificacion, T000835_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T000836_A1Cent_Id, T000836_A27Alma_Modulo, T000836_A28Alma_Codigo
            }
            , new Object[] {
            T000837_A43Cuen_Identificacion
            }
            , new Object[] {
            T000838_A43Cuen_Identificacion, T000838_A690Cuen_Nombre_Multi, T000838_n690Cuen_Nombre_Multi, T000838_A691Cuen_Cedula_Multi, T000838_n691Cuen_Cedula_Multi, T000838_A692Cuen_Multi_Estado, T000838_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T000839_A690Cuen_Nombre_Multi, T000839_n690Cuen_Nombre_Multi, T000839_A691Cuen_Cedula_Multi, T000839_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T000840_A43Cuen_Identificacion, T000840_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000844_A690Cuen_Nombre_Multi, T000844_n690Cuen_Nombre_Multi, T000844_A691Cuen_Cedula_Multi, T000844_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T000845_A43Cuen_Identificacion, T000845_A45Cuen_Identificacion_Multi
            }
         }
      );
      AV17Pgmname = "ALM_CUENTADANTE" ;
   }

   private byte Z326Cuen_DigitoVerificacion ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A326Cuen_DigitoVerificacion ;
   private byte subGridalm_cuentadante_multiple_Backcolorstyle ;
   private byte subGridalm_cuentadante_multiple_Allowselection ;
   private byte subGridalm_cuentadante_multiple_Allowhovering ;
   private byte subGridalm_cuentadante_multiple_Allowcollapsing ;
   private byte subGridalm_cuentadante_multiple_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_cuentadante_multiple_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_11 ;
   private short nRC_GXsfl_154 ;
   private short nGXsfl_154_idx=1 ;
   private short nRcdDeleted_11 ;
   private short nRcdExists_11 ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12Regi_Cod ;
   private short nBlankRcdCount11 ;
   private short RcdFound11 ;
   private short nBlankRcdUsr11 ;
   private short RcdFound10 ;
   private short Z12Regi_Cod ;
   private short Z5Ciud_Codigo ;
   private short Z6Dept_Codigo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtCuen_Identificacion_Enabled ;
   private int edtCuen_Identificacion_Visible ;
   private int edtCuen_Cedula_Enabled ;
   private int edtCuen_DigitoVerificacion_Enabled ;
   private int edtCuen_PrimerNombre_Enabled ;
   private int edtCuen_SegundoNombre_Enabled ;
   private int edtCuen_PrimerApellido_Enabled ;
   private int edtCuen_SegundoApellido_Enabled ;
   private int edtCuen_Nombre_Enabled ;
   private int edtTpte_Codigo_Enabled ;
   private int imgprompt_42_Visible ;
   private int edtTpte_Descripcion_Enabled ;
   private int edtCuen_Clase_Enabled ;
   private int edtCuen_Direccion_Enabled ;
   private int edtCuen_Telefono_Enabled ;
   private int edtCuen_Email_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtCent_Id_Enabled ;
   private int imgprompt_1_Visible ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtCuen_UsuarioCrea_Enabled ;
   private int edtCuen_FechaCrea_Enabled ;
   private int edtCuen_UsuarioModifica_Enabled ;
   private int edtCuen_FechaModifica_Enabled ;
   private int divMultipletable_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtCuen_Identificacion_Multi_Enabled ;
   private int edtCuen_Nombre_Multi_Enabled ;
   private int edtCuen_Cedula_Multi_Enabled ;
   private int subGridalm_cuentadante_multiple_Selectioncolor ;
   private int subGridalm_cuentadante_multiple_Hoveringcolor ;
   private int fRowAdded ;
   private int AV18GXV1 ;
   private int GX_JID ;
   private int subGridalm_cuentadante_multiple_Backcolor ;
   private int subGridalm_cuentadante_multiple_Allbackcolor ;
   private int imgprompt_45_Visible ;
   private int defedtCuen_Identificacion_Multi_Enabled ;
   private int idxLst ;
   private long wcpOAV15Cuen_Identificacion ;
   private long Z43Cuen_Identificacion ;
   private long Z688Cuen_Cedula ;
   private long Z1Cent_Id ;
   private long N1Cent_Id ;
   private long Z45Cuen_Identificacion_Multi ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long A45Cuen_Identificacion_Multi ;
   private long AV15Cuen_Identificacion ;
   private long A43Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long A691Cuen_Cedula_Multi ;
   private long AV14Insert_Cent_Id ;
   private long GRIDALM_CUENTADANTE_MULTIPLE_nFirstRecordOnPage ;
   private long Z2Regi_Id ;
   private long Z691Cuen_Cedula_Multi ;
   private String sPrefix ;
   private String sGXsfl_154_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z333Cuen_Estado ;
   private String Z42Tpte_Codigo ;
   private String N42Tpte_Codigo ;
   private String Z692Cuen_Multi_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A42Tpte_Codigo ;
   private String Gx_mode ;
   private String GXKey ;
   private String A333Cuen_Estado ;
   private String GXCCtl ;
   private String A692Cuen_Multi_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCuen_Cedula_Internalname ;
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
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_DigitoVerificacion_Internalname ;
   private String edtCuen_DigitoVerificacion_Jsonclick ;
   private String edtCuen_PrimerNombre_Internalname ;
   private String edtCuen_PrimerNombre_Jsonclick ;
   private String edtCuen_SegundoNombre_Internalname ;
   private String edtCuen_SegundoNombre_Jsonclick ;
   private String edtCuen_PrimerApellido_Internalname ;
   private String edtCuen_PrimerApellido_Jsonclick ;
   private String edtCuen_SegundoApellido_Internalname ;
   private String edtCuen_SegundoApellido_Jsonclick ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtTpte_Codigo_Internalname ;
   private String edtTpte_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_42_Internalname ;
   private String imgprompt_42_Link ;
   private String edtTpte_Descripcion_Internalname ;
   private String edtTpte_Descripcion_Jsonclick ;
   private String edtCuen_Clase_Internalname ;
   private String edtCuen_Clase_Jsonclick ;
   private String edtCuen_Direccion_Internalname ;
   private String edtCuen_Telefono_Internalname ;
   private String edtCuen_Telefono_Jsonclick ;
   private String edtCuen_Email_Internalname ;
   private String edtCuen_Email_Jsonclick ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtCuen_UsuarioCrea_Internalname ;
   private String edtCuen_UsuarioCrea_Jsonclick ;
   private String edtCuen_FechaCrea_Internalname ;
   private String edtCuen_FechaCrea_Jsonclick ;
   private String edtCuen_UsuarioModifica_Internalname ;
   private String edtCuen_UsuarioModifica_Jsonclick ;
   private String edtCuen_FechaModifica_Internalname ;
   private String edtCuen_FechaModifica_Jsonclick ;
   private String divMultipletable_Internalname ;
   private String lblTitlemultiple_Internalname ;
   private String lblTitlemultiple_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode11 ;
   private String edtCuen_Identificacion_Multi_Internalname ;
   private String edtCuen_Nombre_Multi_Internalname ;
   private String edtCuen_Cedula_Multi_Internalname ;
   private String sStyleString ;
   private String AV11Insert_Tpte_Codigo ;
   private String AV17Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode10 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgprompt_45_Internalname ;
   private String sGXsfl_154_fel_idx="0001" ;
   private String subGridalm_cuentadante_multiple_Class ;
   private String subGridalm_cuentadante_multiple_Linesclass ;
   private String imgprompt_45_Link ;
   private String ROClassString ;
   private String edtCuen_Identificacion_Multi_Jsonclick ;
   private String edtCuen_Nombre_Multi_Jsonclick ;
   private String edtCuen_Cedula_Multi_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_cuentadante_multiple_Internalname ;
   private java.util.Date Z338Cuen_FechaCrea ;
   private java.util.Date Z340Cuen_FechaModifica ;
   private java.util.Date A338Cuen_FechaCrea ;
   private java.util.Date A340Cuen_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n333Cuen_Estado ;
   private boolean wbErr ;
   private boolean bGXsfl_154_Refreshing=false ;
   private boolean n43Cuen_Identificacion ;
   private boolean n326Cuen_DigitoVerificacion ;
   private boolean n331Cuen_PrimerNombre ;
   private boolean n332Cuen_SegundoNombre ;
   private boolean n329Cuen_PrimerApellido ;
   private boolean n330Cuen_SegundoApellido ;
   private boolean n44Cuen_Nombre ;
   private boolean n328Cuen_Clase ;
   private boolean n334Cuen_Direccion ;
   private boolean n335Cuen_Telefono ;
   private boolean n336Cuen_Email ;
   private boolean n339Cuen_UsuarioModifica ;
   private boolean n340Cuen_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n690Cuen_Nombre_Multi ;
   private boolean n691Cuen_Cedula_Multi ;
   private String Z44Cuen_Nombre ;
   private String Z337Cuen_UsuarioCrea ;
   private String Z339Cuen_UsuarioModifica ;
   private String Z331Cuen_PrimerNombre ;
   private String Z332Cuen_SegundoNombre ;
   private String Z329Cuen_PrimerApellido ;
   private String Z330Cuen_SegundoApellido ;
   private String Z328Cuen_Clase ;
   private String Z334Cuen_Direccion ;
   private String Z335Cuen_Telefono ;
   private String Z336Cuen_Email ;
   private String A331Cuen_PrimerNombre ;
   private String A332Cuen_SegundoNombre ;
   private String A329Cuen_PrimerApellido ;
   private String A330Cuen_SegundoApellido ;
   private String A44Cuen_Nombre ;
   private String A321Tpte_Descripcion ;
   private String A328Cuen_Clase ;
   private String A334Cuen_Direccion ;
   private String A335Cuen_Telefono ;
   private String A336Cuen_Email ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A337Cuen_UsuarioCrea ;
   private String A339Cuen_UsuarioModifica ;
   private String A690Cuen_Nombre_Multi ;
   private String AV16Usuario ;
   private String Z321Tpte_Descripcion ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private String Z13Regi_Descripcion ;
   private String Z7Ciud_Descripcion ;
   private String Z10Dept_Descripcion ;
   private String Z690Cuen_Nombre_Multi ;
   private com.genexus.webpanels.GXWebGrid Gridalm_cuentadante_multipleContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_cuentadante_multipleRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_cuentadante_multipleColumn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbCuen_Estado ;
   private HTMLChoice cmbCuen_Multi_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00088_A3Cent_Codigo ;
   private String[] T00088_A4Cent_Descripcion ;
   private long[] T00088_A2Regi_Id ;
   private short[] T00089_A12Regi_Cod ;
   private String[] T00089_A13Regi_Descripcion ;
   private short[] T00089_A5Ciud_Codigo ;
   private String[] T000810_A7Ciud_Descripcion ;
   private short[] T000810_A6Dept_Codigo ;
   private String[] T000811_A10Dept_Descripcion ;
   private String[] T00087_A321Tpte_Descripcion ;
   private long[] T000812_A43Cuen_Identificacion ;
   private boolean[] T000812_n43Cuen_Identificacion ;
   private String[] T000812_A44Cuen_Nombre ;
   private boolean[] T000812_n44Cuen_Nombre ;
   private String[] T000812_A337Cuen_UsuarioCrea ;
   private String[] T000812_A339Cuen_UsuarioModifica ;
   private boolean[] T000812_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T000812_A338Cuen_FechaCrea ;
   private java.util.Date[] T000812_A340Cuen_FechaModifica ;
   private boolean[] T000812_n340Cuen_FechaModifica ;
   private long[] T000812_A688Cuen_Cedula ;
   private byte[] T000812_A326Cuen_DigitoVerificacion ;
   private boolean[] T000812_n326Cuen_DigitoVerificacion ;
   private String[] T000812_A331Cuen_PrimerNombre ;
   private boolean[] T000812_n331Cuen_PrimerNombre ;
   private String[] T000812_A332Cuen_SegundoNombre ;
   private boolean[] T000812_n332Cuen_SegundoNombre ;
   private String[] T000812_A329Cuen_PrimerApellido ;
   private boolean[] T000812_n329Cuen_PrimerApellido ;
   private String[] T000812_A330Cuen_SegundoApellido ;
   private boolean[] T000812_n330Cuen_SegundoApellido ;
   private String[] T000812_A321Tpte_Descripcion ;
   private String[] T000812_A328Cuen_Clase ;
   private boolean[] T000812_n328Cuen_Clase ;
   private String[] T000812_A333Cuen_Estado ;
   private boolean[] T000812_n333Cuen_Estado ;
   private String[] T000812_A334Cuen_Direccion ;
   private boolean[] T000812_n334Cuen_Direccion ;
   private String[] T000812_A335Cuen_Telefono ;
   private boolean[] T000812_n335Cuen_Telefono ;
   private String[] T000812_A336Cuen_Email ;
   private boolean[] T000812_n336Cuen_Email ;
   private String[] T000812_A7Ciud_Descripcion ;
   private String[] T000812_A10Dept_Descripcion ;
   private String[] T000812_A3Cent_Codigo ;
   private String[] T000812_A4Cent_Descripcion ;
   private long[] T000812_A2Regi_Id ;
   private short[] T000812_A12Regi_Cod ;
   private String[] T000812_A13Regi_Descripcion ;
   private String[] T000812_A42Tpte_Codigo ;
   private long[] T000812_A1Cent_Id ;
   private short[] T000812_A5Ciud_Codigo ;
   private short[] T000812_A6Dept_Codigo ;
   private String[] T000813_A321Tpte_Descripcion ;
   private String[] T000814_A3Cent_Codigo ;
   private String[] T000814_A4Cent_Descripcion ;
   private long[] T000814_A2Regi_Id ;
   private short[] T000815_A12Regi_Cod ;
   private String[] T000815_A13Regi_Descripcion ;
   private short[] T000815_A5Ciud_Codigo ;
   private String[] T000816_A7Ciud_Descripcion ;
   private short[] T000816_A6Dept_Codigo ;
   private String[] T000817_A10Dept_Descripcion ;
   private long[] T000818_A43Cuen_Identificacion ;
   private boolean[] T000818_n43Cuen_Identificacion ;
   private long[] T00086_A43Cuen_Identificacion ;
   private boolean[] T00086_n43Cuen_Identificacion ;
   private String[] T00086_A44Cuen_Nombre ;
   private boolean[] T00086_n44Cuen_Nombre ;
   private String[] T00086_A337Cuen_UsuarioCrea ;
   private String[] T00086_A339Cuen_UsuarioModifica ;
   private boolean[] T00086_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T00086_A338Cuen_FechaCrea ;
   private java.util.Date[] T00086_A340Cuen_FechaModifica ;
   private boolean[] T00086_n340Cuen_FechaModifica ;
   private long[] T00086_A688Cuen_Cedula ;
   private byte[] T00086_A326Cuen_DigitoVerificacion ;
   private boolean[] T00086_n326Cuen_DigitoVerificacion ;
   private String[] T00086_A331Cuen_PrimerNombre ;
   private boolean[] T00086_n331Cuen_PrimerNombre ;
   private String[] T00086_A332Cuen_SegundoNombre ;
   private boolean[] T00086_n332Cuen_SegundoNombre ;
   private String[] T00086_A329Cuen_PrimerApellido ;
   private boolean[] T00086_n329Cuen_PrimerApellido ;
   private String[] T00086_A330Cuen_SegundoApellido ;
   private boolean[] T00086_n330Cuen_SegundoApellido ;
   private String[] T00086_A328Cuen_Clase ;
   private boolean[] T00086_n328Cuen_Clase ;
   private String[] T00086_A333Cuen_Estado ;
   private boolean[] T00086_n333Cuen_Estado ;
   private String[] T00086_A334Cuen_Direccion ;
   private boolean[] T00086_n334Cuen_Direccion ;
   private String[] T00086_A335Cuen_Telefono ;
   private boolean[] T00086_n335Cuen_Telefono ;
   private String[] T00086_A336Cuen_Email ;
   private boolean[] T00086_n336Cuen_Email ;
   private String[] T00086_A42Tpte_Codigo ;
   private long[] T00086_A1Cent_Id ;
   private long[] T00086_A2Regi_Id ;
   private long[] T000819_A43Cuen_Identificacion ;
   private boolean[] T000819_n43Cuen_Identificacion ;
   private long[] T000820_A43Cuen_Identificacion ;
   private boolean[] T000820_n43Cuen_Identificacion ;
   private long[] T00085_A43Cuen_Identificacion ;
   private boolean[] T00085_n43Cuen_Identificacion ;
   private String[] T00085_A44Cuen_Nombre ;
   private boolean[] T00085_n44Cuen_Nombre ;
   private String[] T00085_A337Cuen_UsuarioCrea ;
   private String[] T00085_A339Cuen_UsuarioModifica ;
   private boolean[] T00085_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T00085_A338Cuen_FechaCrea ;
   private java.util.Date[] T00085_A340Cuen_FechaModifica ;
   private boolean[] T00085_n340Cuen_FechaModifica ;
   private long[] T00085_A688Cuen_Cedula ;
   private byte[] T00085_A326Cuen_DigitoVerificacion ;
   private boolean[] T00085_n326Cuen_DigitoVerificacion ;
   private String[] T00085_A331Cuen_PrimerNombre ;
   private boolean[] T00085_n331Cuen_PrimerNombre ;
   private String[] T00085_A332Cuen_SegundoNombre ;
   private boolean[] T00085_n332Cuen_SegundoNombre ;
   private String[] T00085_A329Cuen_PrimerApellido ;
   private boolean[] T00085_n329Cuen_PrimerApellido ;
   private String[] T00085_A330Cuen_SegundoApellido ;
   private boolean[] T00085_n330Cuen_SegundoApellido ;
   private String[] T00085_A328Cuen_Clase ;
   private boolean[] T00085_n328Cuen_Clase ;
   private String[] T00085_A333Cuen_Estado ;
   private boolean[] T00085_n333Cuen_Estado ;
   private String[] T00085_A334Cuen_Direccion ;
   private boolean[] T00085_n334Cuen_Direccion ;
   private String[] T00085_A335Cuen_Telefono ;
   private boolean[] T00085_n335Cuen_Telefono ;
   private String[] T00085_A336Cuen_Email ;
   private boolean[] T00085_n336Cuen_Email ;
   private String[] T00085_A42Tpte_Codigo ;
   private long[] T00085_A1Cent_Id ;
   private long[] T00085_A2Regi_Id ;
   private long[] T000822_A43Cuen_Identificacion ;
   private boolean[] T000822_n43Cuen_Identificacion ;
   private String[] T000825_A321Tpte_Descripcion ;
   private String[] T000826_A3Cent_Codigo ;
   private String[] T000826_A4Cent_Descripcion ;
   private long[] T000826_A2Regi_Id ;
   private short[] T000827_A12Regi_Cod ;
   private String[] T000827_A13Regi_Descripcion ;
   private short[] T000827_A5Ciud_Codigo ;
   private String[] T000828_A7Ciud_Descripcion ;
   private short[] T000828_A6Dept_Codigo ;
   private String[] T000829_A10Dept_Descripcion ;
   private long[] T000830_A46Tran_Id ;
   private long[] T000831_A46Tran_Id ;
   private long[] T000832_A46Tran_Id ;
   private long[] T000833_A46Tran_Id ;
   private String[] T000834_A66Elem_Consecutivo ;
   private String[] T000834_A67Invd_NumeroPlaca ;
   private long[] T000835_A43Cuen_Identificacion ;
   private boolean[] T000835_n43Cuen_Identificacion ;
   private long[] T000835_A45Cuen_Identificacion_Multi ;
   private long[] T000836_A1Cent_Id ;
   private String[] T000836_A27Alma_Modulo ;
   private String[] T000836_A28Alma_Codigo ;
   private long[] T000837_A43Cuen_Identificacion ;
   private boolean[] T000837_n43Cuen_Identificacion ;
   private long[] T000838_A43Cuen_Identificacion ;
   private boolean[] T000838_n43Cuen_Identificacion ;
   private String[] T000838_A690Cuen_Nombre_Multi ;
   private boolean[] T000838_n690Cuen_Nombre_Multi ;
   private long[] T000838_A691Cuen_Cedula_Multi ;
   private boolean[] T000838_n691Cuen_Cedula_Multi ;
   private String[] T000838_A692Cuen_Multi_Estado ;
   private long[] T000838_A45Cuen_Identificacion_Multi ;
   private String[] T00084_A690Cuen_Nombre_Multi ;
   private boolean[] T00084_n690Cuen_Nombre_Multi ;
   private long[] T00084_A691Cuen_Cedula_Multi ;
   private boolean[] T00084_n691Cuen_Cedula_Multi ;
   private String[] T000839_A690Cuen_Nombre_Multi ;
   private boolean[] T000839_n690Cuen_Nombre_Multi ;
   private long[] T000839_A691Cuen_Cedula_Multi ;
   private boolean[] T000839_n691Cuen_Cedula_Multi ;
   private long[] T000840_A43Cuen_Identificacion ;
   private boolean[] T000840_n43Cuen_Identificacion ;
   private long[] T000840_A45Cuen_Identificacion_Multi ;
   private long[] T00083_A43Cuen_Identificacion ;
   private boolean[] T00083_n43Cuen_Identificacion ;
   private String[] T00083_A692Cuen_Multi_Estado ;
   private long[] T00083_A45Cuen_Identificacion_Multi ;
   private long[] T00082_A43Cuen_Identificacion ;
   private boolean[] T00082_n43Cuen_Identificacion ;
   private String[] T00082_A692Cuen_Multi_Estado ;
   private long[] T00082_A45Cuen_Identificacion_Multi ;
   private String[] T000844_A690Cuen_Nombre_Multi ;
   private boolean[] T000844_n690Cuen_Nombre_Multi ;
   private long[] T000844_A691Cuen_Cedula_Multi ;
   private boolean[] T000844_n691Cuen_Cedula_Multi ;
   private long[] T000845_A43Cuen_Identificacion ;
   private boolean[] T000845_n43Cuen_Identificacion ;
   private long[] T000845_A45Cuen_Identificacion_Multi ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class alm_cuentadante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00082", "SELECT Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?  FOR UPDATE OF Cuen_Multi_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00083", "SELECT Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00084", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00085", "SELECT Cuen_Identificacion, Cuen_Nombre, Cuen_UsuarioCrea, Cuen_UsuarioModifica, Cuen_FechaCrea, Cuen_FechaModifica, Cuen_Cedula, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ?  FOR UPDATE OF Cuen_Nombre, Cuen_UsuarioCrea, Cuen_UsuarioModifica, Cuen_FechaCrea, Cuen_FechaModifica, Cuen_Cedula, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00086", "SELECT Cuen_Identificacion, Cuen_Nombre, Cuen_UsuarioCrea, Cuen_UsuarioModifica, Cuen_FechaCrea, Cuen_FechaModifica, Cuen_Cedula, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00087", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00088", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00089", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000810", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000811", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000812", "SELECT /*+ FIRST_ROWS(100) */ TM1.Cuen_Identificacion, TM1.Cuen_Nombre, TM1.Cuen_UsuarioCrea, TM1.Cuen_UsuarioModifica, TM1.Cuen_FechaCrea, TM1.Cuen_FechaModifica, TM1.Cuen_Cedula, TM1.Cuen_DigitoVerificacion, TM1.Cuen_PrimerNombre, TM1.Cuen_SegundoNombre, TM1.Cuen_PrimerApellido, TM1.Cuen_SegundoApellido, T2.Tpte_Descripcion, TM1.Cuen_Clase, TM1.Cuen_Estado, TM1.Cuen_Direccion, TM1.Cuen_Telefono, TM1.Cuen_Email, T5.Ciud_Descripcion, T6.Dept_Descripcion, T3.Cent_Codigo, T3.Cent_Descripcion, TM1.Regi_Id, T4.Regi_Cod, T4.Regi_Descripcion, TM1.Tpte_Codigo, TM1.Cent_Id, T4.Ciud_Codigo, T5.Dept_Codigo FROM (((((ALM_CUENTADANTE TM1 INNER JOIN ALM_TIPO_TERCERO T2 ON T2.Tpte_Codigo = TM1.Tpte_Codigo) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = TM1.Cent_Id) INNER JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T3.Regi_Id) INNER JOIN GEN_CIUDAD T5 ON T5.Ciud_Codigo = T4.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T6 ON T6.Dept_Codigo = T5.Dept_Codigo) WHERE TM1.Cuen_Identificacion = ? ORDER BY TM1.Cuen_Identificacion ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000813", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000814", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000815", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000816", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000817", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000818", "SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000819", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE ( Cuen_Identificacion > ?) ORDER BY Cuen_Identificacion) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000820", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE ( Cuen_Identificacion < ?) ORDER BY Cuen_Identificacion DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000821", "INSERT INTO ALM_CUENTADANTE(Regi_Id, Cuen_Nombre, Cuen_UsuarioCrea, Cuen_UsuarioModifica, Cuen_FechaCrea, Cuen_FechaModifica, Cuen_Cedula, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CUENTADANTE")
         ,new ForEachCursor("T000822", "SELECT Cuen_Identificacion.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000823", "UPDATE ALM_CUENTADANTE SET Regi_Id=?, Cuen_Nombre=?, Cuen_UsuarioCrea=?, Cuen_UsuarioModifica=?, Cuen_FechaCrea=?, Cuen_FechaModifica=?, Cuen_Cedula=?, Cuen_DigitoVerificacion=?, Cuen_PrimerNombre=?, Cuen_SegundoNombre=?, Cuen_PrimerApellido=?, Cuen_SegundoApellido=?, Cuen_Clase=?, Cuen_Estado=?, Cuen_Direccion=?, Cuen_Telefono=?, Cuen_Email=?, Tpte_Codigo=?, Cent_Id=?  WHERE Cuen_Identificacion = ?", GX_NOMASK, "ALM_CUENTADANTE")
         ,new UpdateCursor("T000824", "DELETE FROM ALM_CUENTADANTE  WHERE Cuen_Identificacion = ?", GX_NOMASK, "ALM_CUENTADANTE")
         ,new ForEachCursor("T000825", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000826", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000827", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000828", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000829", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000830", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteResponsabili = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000831", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteDestino = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000832", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdProveedor = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000833", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteOrigen = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000834", "SELECT * FROM (SELECT Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Cuen_Identificacion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000835", "SELECT * FROM (SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion_Multi = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000836", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE Alma_IdResponsable = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000837", "SELECT /*+ FIRST_ROWS(100) */ Cuen_Identificacion FROM ALM_CUENTADANTE ORDER BY Cuen_Identificacion ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000838", "SELECT T1.Cuen_Identificacion, T2.Cuen_Nombre AS Cuen_Nombre_Multi, T2.Cuen_Cedula AS Cuen_Cedula_Multi, T1.Cuen_Multi_Estado, T1.Cuen_Identificacion_Multi AS Cuen_Identificacion_Multi FROM (ALM_CUENTADANTEMULTIPLE T1 INNER JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Cuen_Identificacion_Multi) WHERE T1.Cuen_Identificacion = ? and T1.Cuen_Identificacion_Multi = ? ORDER BY T1.Cuen_Identificacion, T1.Cuen_Identificacion_Multi ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000839", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000840", "SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000841", "INSERT INTO ALM_CUENTADANTEMULTIPLE(Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi) VALUES(?, ?, ?)", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new UpdateCursor("T000842", "UPDATE ALM_CUENTADANTEMULTIPLE SET Cuen_Multi_Estado=?  WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new UpdateCursor("T000843", "DELETE FROM ALM_CUENTADANTEMULTIPLE  WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new ForEachCursor("T000844", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000845", "SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? ORDER BY Cuen_Identificacion, Cuen_Identificacion_Multi ",true, GX_NOMASK, false, this,11,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((byte[]) buf[10])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 2) ;
               ((long[]) buf[31])[0] = rslt.getLong(19) ;
               ((long[]) buf[32])[0] = rslt.getLong(20) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((byte[]) buf[10])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 2) ;
               ((long[]) buf[31])[0] = rslt.getLong(19) ;
               ((long[]) buf[32])[0] = rslt.getLong(20) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((byte[]) buf[10])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 1) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[33])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[34])[0] = rslt.getVarchar(22) ;
               ((long[]) buf[35])[0] = rslt.getLong(23) ;
               ((short[]) buf[36])[0] = rslt.getShort(24) ;
               ((String[]) buf[37])[0] = rslt.getVarchar(25) ;
               ((String[]) buf[38])[0] = rslt.getString(26, 2) ;
               ((long[]) buf[39])[0] = rslt.getLong(27) ;
               ((short[]) buf[40])[0] = rslt.getShort(28) ;
               ((short[]) buf[41])[0] = rslt.getShort(29) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 25 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 28 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 31 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 33 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 34 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 35 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 36 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 38 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 43 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               stmt.setVarchar(3, (String)parms[3], 30, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 30);
               }
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               stmt.setBigDecimal(7, ((Number) parms[9]).longValue(), 0);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 1024);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 15);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 100);
               }
               stmt.setString(18, (String)parms[30], 2);
               stmt.setLong(19, ((Number) parms[31]).longValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               stmt.setVarchar(3, (String)parms[3], 30, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 30);
               }
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               stmt.setBigDecimal(7, ((Number) parms[9]).longValue(), 0);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 1024);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 15);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 100);
               }
               stmt.setString(18, (String)parms[30], 2);
               stmt.setLong(19, ((Number) parms[31]).longValue());
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(20, ((Number) parms[33]).longValue(), 0);
               }
               return;
            case 22 :
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
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 26 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 27 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               return;
            case 37 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 1);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               }
               stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setBigDecimal(2, ((Number) parms[2]).longValue(), 0);
               return;
            case 42 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
      }
   }

}

