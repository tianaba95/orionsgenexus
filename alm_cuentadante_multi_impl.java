/*
               File: alm_cuentadante_multi_impl
        Description: ALM_CUENTADANTE_MULTI
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:36.35
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

public final  class alm_cuentadante_multi_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"CUEN_CEDULA") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asacuen_cedula0910( Gx_mode, A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A2Regi_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A5Ciud_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A6Dept_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A42Tpte_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A42Tpte_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A45Cuen_Identificacion_Multi = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A45Cuen_Identificacion_Multi) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_cuentadante_multi_multiple") == 0 )
      {
         nRC_GXsfl_98 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_98_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_98_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_cuentadante_multi_multiple_newrow( ) ;
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
            AV14Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV14Cuen_Identificacion, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
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
      GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_98_idx ;
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
         Form.getMeta().addItem("description", "ALM_CUENTADANTE_MULTI", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_cuentadante_multi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cuentadante_multi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cuentadante_multi_impl.class ));
   }

   public alm_cuentadante_multi_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "CUENTADANTE MULTIPLE", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerApellido_Internalname, "Apellido 1", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerApellido_Internalname, A329Cuen_PrimerApellido, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerApellido_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_PrimerApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoApellido_Internalname, "Apellido 2", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoApellido_Internalname, A330Cuen_SegundoApellido, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoApellido_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_SegundoApellido_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_PrimerNombre_Internalname, "Nombre 1", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_PrimerNombre_Internalname, A331Cuen_PrimerNombre, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_PrimerNombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_PrimerNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_SegundoNombre_Internalname, "Nombre 2", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_SegundoNombre_Internalname, A332Cuen_SegundoNombre, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_SegundoNombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_SegundoNombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Nombre_Internalname, "Nombre Completo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Nombre_Internalname, A44Cuen_Nombre, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCuen_Cedula_Internalname, "Numero Identificación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtCuen_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Cedula_Jsonclick, 0, "Attribute", "", "", "", edtCuen_Cedula_Visible, edtCuen_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCuen_Direccion_Internalname, A334Cuen_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A334Cuen_Direccion), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", (short)(0), 1, edtCuen_Direccion_Enabled, 0, 80, "chr", 2, "row", StyleString, ClassString, "", "1024", 1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Telefono_Internalname, A335Cuen_Telefono, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCuen_Telefono_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Telefono_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCuen_Email_Internalname, A336Cuen_Email, GXutil.rtrim( localUtil.format( A336Cuen_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A336Cuen_Email, "", "", "", edtCuen_Email_Jsonclick, 0, "Attribute", "", "", "", 1, edtCuen_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTE_MULTI.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Codigo Regional", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-8 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCuen_Estado, cmbCuen_Estado.getInternalname(), GXutil.rtrim( A333Cuen_Estado), 1, cmbCuen_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCuen_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "", true, "HLP_ALM_CUENTADANTE_MULTI.htm");
         cmbCuen_Estado.setValue( GXutil.rtrim( A333Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Estado.getInternalname(), "Values", cmbCuen_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Id_Internalname, "Identificador Regional", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "Attribute", "", "", "", edtRegi_Id_Visible, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMultipletable_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitlemultiple_Internalname, "INTEGRANTES", "", "", lblTitlemultiple_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_cuentadante_multi_multiple( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CUENTADANTE_MULTI.htm");
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

   public void gxdraw_gridalm_cuentadante_multi_multiple( )
   {
      /*  Grid Control  */
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("GridName", "Gridalm_cuentadante_multi_multiple");
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Class", "WorkWith");
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("CmpContext", "");
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_cuentadante_multi_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multi_multipleColumn);
      Gridalm_cuentadante_multi_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multi_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multi_multipleColumn);
      Gridalm_cuentadante_multi_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multi_multipleColumn);
      Gridalm_cuentadante_multi_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Value", A690Cuen_Nombre_Multi);
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multi_multipleColumn);
      Gridalm_cuentadante_multi_multipleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Value", GXutil.rtrim( A692Cuen_Multi_Estado));
      Gridalm_cuentadante_multi_multipleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddColumnProperties(Gridalm_cuentadante_multi_multipleColumn);
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_cuentadante_multi_multipleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_cuentadante_multi_multiple_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_98_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount11 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_11 = (short)(1) ;
            scanStart0911( ) ;
            while ( RcdFound11 != 0 )
            {
               init_level_properties11( ) ;
               getByPrimaryKey0911( ) ;
               addRow0911( ) ;
               scanNext0911( ) ;
            }
            scanEnd0911( ) ;
            nBlankRcdCount11 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0911( ) ;
         standaloneModal0911( ) ;
         sMode11 = Gx_mode ;
         while ( nGXsfl_98_idx < nRC_GXsfl_98 )
         {
            bGXsfl_98_Refreshing = true ;
            readRow0911( ) ;
            edtCuen_Identificacion_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
            edtCuen_Cedula_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
            edtCuen_Nombre_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
            cmbCuen_Multi_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Multi_Estado.getEnabled(), 5, 0)), !bGXsfl_98_Refreshing);
            imgprompt_1_Link = httpContext.cgiGet( "PROMPT_45_"+sGXsfl_98_idx+"Link") ;
            if ( ( nRcdExists_11 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0911( ) ;
            }
            sendRow0911( ) ;
            bGXsfl_98_Refreshing = false ;
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
            scanStart0911( ) ;
            while ( RcdFound11 != 0 )
            {
               sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_9811( ) ;
               init_level_properties11( ) ;
               standaloneNotModal0911( ) ;
               getByPrimaryKey0911( ) ;
               standaloneModal0911( ) ;
               addRow0911( ) ;
               scanNext0911( ) ;
            }
            scanEnd0911( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode11 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_9811( ) ;
         initAll0911( ) ;
         init_level_properties11( ) ;
         standaloneNotModal0911( ) ;
         standaloneModal0911( ) ;
         nRcdExists_11 = (short)(0) ;
         nIsMod_11 = (short)(0) ;
         nRcdDeleted_11 = (short)(0) ;
         nBlankRcdCount11 = (short)(nBlankRcdUsr11+nBlankRcdCount11) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount11 > 0 )
         {
            addRow0911( ) ;
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
      httpContext.writeText( "<div id=\""+"Gridalm_cuentadante_multi_multipleContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_cuentadante_multi_multiple", Gridalm_cuentadante_multi_multipleContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_cuentadante_multi_multipleContainerData", Gridalm_cuentadante_multi_multipleContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_cuentadante_multi_multipleContainerData"+"V", Gridalm_cuentadante_multi_multipleContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_cuentadante_multi_multipleContainerData"+"V"+"\" value='"+Gridalm_cuentadante_multi_multipleContainer.GridValuesHidden()+"'/>") ;
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
      e11092 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A329Cuen_PrimerApellido = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerApellido_Internalname)) ;
            n329Cuen_PrimerApellido = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
            n329Cuen_PrimerApellido = ((GXutil.strcmp("", A329Cuen_PrimerApellido)==0) ? true : false) ;
            A330Cuen_SegundoApellido = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoApellido_Internalname)) ;
            n330Cuen_SegundoApellido = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
            n330Cuen_SegundoApellido = ((GXutil.strcmp("", A330Cuen_SegundoApellido)==0) ? true : false) ;
            A331Cuen_PrimerNombre = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerNombre_Internalname)) ;
            n331Cuen_PrimerNombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
            n331Cuen_PrimerNombre = ((GXutil.strcmp("", A331Cuen_PrimerNombre)==0) ? true : false) ;
            A332Cuen_SegundoNombre = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoNombre_Internalname)) ;
            n332Cuen_SegundoNombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
            n332Cuen_SegundoNombre = ((GXutil.strcmp("", A332Cuen_SegundoNombre)==0) ? true : false) ;
            A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
            n44Cuen_Nombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
            A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
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
            A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
            cmbCuen_Estado.setName( cmbCuen_Estado.getInternalname() );
            cmbCuen_Estado.setValue( httpContext.cgiGet( cmbCuen_Estado.getInternalname()) );
            A333Cuen_Estado = httpContext.cgiGet( cmbCuen_Estado.getInternalname()) ;
            n333Cuen_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
            n333Cuen_Estado = ((GXutil.strcmp("", A333Cuen_Estado)==0) ? true : false) ;
            A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            /* Read saved values. */
            Z43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "Z43Cuen_Identificacion"), ",", ".") ;
            Z44Cuen_Nombre = httpContext.cgiGet( "Z44Cuen_Nombre") ;
            n44Cuen_Nombre = ((GXutil.strcmp("", A44Cuen_Nombre)==0) ? true : false) ;
            Z688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( "Z688Cuen_Cedula"), ",", ".") ;
            Z337Cuen_UsuarioCrea = httpContext.cgiGet( "Z337Cuen_UsuarioCrea") ;
            Z338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z338Cuen_FechaCrea"), 0) ;
            Z339Cuen_UsuarioModifica = httpContext.cgiGet( "Z339Cuen_UsuarioModifica") ;
            n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
            Z340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z340Cuen_FechaModifica"), 0) ;
            n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
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
            A337Cuen_UsuarioCrea = httpContext.cgiGet( "Z337Cuen_UsuarioCrea") ;
            A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z338Cuen_FechaCrea"), 0) ;
            A339Cuen_UsuarioModifica = httpContext.cgiGet( "Z339Cuen_UsuarioModifica") ;
            n339Cuen_UsuarioModifica = false ;
            n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
            A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z340Cuen_FechaModifica"), 0) ;
            n340Cuen_FechaModifica = false ;
            n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
            A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( "Z326Cuen_DigitoVerificacion"), ",", ".")) ;
            n326Cuen_DigitoVerificacion = false ;
            n326Cuen_DigitoVerificacion = ((0==A326Cuen_DigitoVerificacion) ? true : false) ;
            A328Cuen_Clase = httpContext.cgiGet( "Z328Cuen_Clase") ;
            n328Cuen_Clase = false ;
            n328Cuen_Clase = ((GXutil.strcmp("", A328Cuen_Clase)==0) ? true : false) ;
            A42Tpte_Codigo = httpContext.cgiGet( "Z42Tpte_Codigo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_98 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_98"), ",", ".")) ;
            N42Tpte_Codigo = httpContext.cgiGet( "N42Tpte_Codigo") ;
            N1Cent_Id = localUtil.ctol( httpContext.cgiGet( "N1Cent_Id"), ",", ".") ;
            AV14Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "vCUEN_IDENTIFICACION"), ",", ".") ;
            A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "CUEN_IDENTIFICACION"), ",", ".") ;
            n43Cuen_Identificacion = false ;
            AV11Insert_Tpte_Codigo = httpContext.cgiGet( "vINSERT_TPTE_CODIGO") ;
            A42Tpte_Codigo = httpContext.cgiGet( "TPTE_CODIGO") ;
            AV15Insert_Cent_Id = localUtil.ctol( httpContext.cgiGet( "vINSERT_CENT_ID"), ",", ".") ;
            AV16Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A337Cuen_UsuarioCrea = httpContext.cgiGet( "CUEN_USUARIOCREA") ;
            A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( "CUEN_FECHACREA"), 0) ;
            A339Cuen_UsuarioModifica = httpContext.cgiGet( "CUEN_USUARIOMODIFICA") ;
            n339Cuen_UsuarioModifica = ((GXutil.strcmp("", A339Cuen_UsuarioModifica)==0) ? true : false) ;
            A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( "CUEN_FECHAMODIFICA"), 0) ;
            n340Cuen_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A340Cuen_FechaModifica) ? true : false) ;
            A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( "CUEN_DIGITOVERIFICACION"), ",", ".")) ;
            n326Cuen_DigitoVerificacion = ((0==A326Cuen_DigitoVerificacion) ? true : false) ;
            A328Cuen_Clase = httpContext.cgiGet( "CUEN_CLASE") ;
            n328Cuen_Clase = ((GXutil.strcmp("", A328Cuen_Clase)==0) ? true : false) ;
            A321Tpte_Descripcion = httpContext.cgiGet( "TPTE_DESCRIPCION") ;
            A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "CIUD_CODIGO"), ",", ".")) ;
            A7Ciud_Descripcion = httpContext.cgiGet( "CIUD_DESCRIPCION") ;
            A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "DEPT_CODIGO"), ",", ".")) ;
            A10Dept_Descripcion = httpContext.cgiGet( "DEPT_DESCRIPCION") ;
            AV17Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CUENTADANTE_MULTI" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9") ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A328Cuen_Clase, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_cuentadante_multi:[SecurityCheckFailed]"+forbiddenHiddens);
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
                        confirm_090( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                        e11092 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12092 ();
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
         e12092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0910( ) ;
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
         disableAttributes0910( ) ;
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

   public void confirm_090( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0910( ) ;
         }
         else
         {
            checkExtendedTable0910( ) ;
            closeExtendedTableCursors0910( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_0911( ) ;
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

   public void confirm_0911( )
   {
      nGXsfl_98_idx = (short)(0) ;
      while ( nGXsfl_98_idx < nRC_GXsfl_98 )
      {
         readRow0911( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            getKey0911( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               if ( RcdFound11 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0911( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0911( ) ;
                     closeExtendedTableCursors0911( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
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
                     getByPrimaryKey0911( ) ;
                     load0911( ) ;
                     beforeValidate0911( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0911( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0911( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0911( ) ;
                           closeExtendedTableCursors0911( ) ;
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
                     GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCuen_Identificacion_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Cedula_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Nombre_Multi_Internalname, A690Cuen_Nombre_Multi) ;
         httpContext.changePostValue( cmbCuen_Multi_Estado.getInternalname(), GXutil.rtrim( A692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_98_idx, GXutil.rtrim( Z692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption090( )
   {
   }

   public void e11092( )
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
      AV15Insert_Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Cent_Id", GXutil.ltrim( GXutil.str( AV15Insert_Cent_Id, 11, 0)));
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
               AV15Insert_Cent_Id = GXutil.lval( AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_Cent_Id", GXutil.ltrim( GXutil.str( AV15Insert_Cent_Id, 11, 0)));
            }
            AV18GXV1 = (int)(AV18GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18GXV1", GXutil.ltrim( GXutil.str( AV18GXV1, 8, 0)));
         }
      }
      AV16Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usuario", AV16Usuario);
   }

   public void e12092( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_cuentadante_multi") );
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

   public void zm0910( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z44Cuen_Nombre = T00096_A44Cuen_Nombre[0] ;
            Z688Cuen_Cedula = T00096_A688Cuen_Cedula[0] ;
            Z337Cuen_UsuarioCrea = T00096_A337Cuen_UsuarioCrea[0] ;
            Z338Cuen_FechaCrea = T00096_A338Cuen_FechaCrea[0] ;
            Z339Cuen_UsuarioModifica = T00096_A339Cuen_UsuarioModifica[0] ;
            Z340Cuen_FechaModifica = T00096_A340Cuen_FechaModifica[0] ;
            Z326Cuen_DigitoVerificacion = T00096_A326Cuen_DigitoVerificacion[0] ;
            Z331Cuen_PrimerNombre = T00096_A331Cuen_PrimerNombre[0] ;
            Z332Cuen_SegundoNombre = T00096_A332Cuen_SegundoNombre[0] ;
            Z329Cuen_PrimerApellido = T00096_A329Cuen_PrimerApellido[0] ;
            Z330Cuen_SegundoApellido = T00096_A330Cuen_SegundoApellido[0] ;
            Z328Cuen_Clase = T00096_A328Cuen_Clase[0] ;
            Z333Cuen_Estado = T00096_A333Cuen_Estado[0] ;
            Z334Cuen_Direccion = T00096_A334Cuen_Direccion[0] ;
            Z335Cuen_Telefono = T00096_A335Cuen_Telefono[0] ;
            Z336Cuen_Email = T00096_A336Cuen_Email[0] ;
            Z42Tpte_Codigo = T00096_A42Tpte_Codigo[0] ;
            Z1Cent_Id = T00096_A1Cent_Id[0] ;
         }
         else
         {
            Z44Cuen_Nombre = A44Cuen_Nombre ;
            Z688Cuen_Cedula = A688Cuen_Cedula ;
            Z337Cuen_UsuarioCrea = A337Cuen_UsuarioCrea ;
            Z338Cuen_FechaCrea = A338Cuen_FechaCrea ;
            Z339Cuen_UsuarioModifica = A339Cuen_UsuarioModifica ;
            Z340Cuen_FechaModifica = A340Cuen_FechaModifica ;
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
      if ( GX_JID == -20 )
      {
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z44Cuen_Nombre = A44Cuen_Nombre ;
         Z688Cuen_Cedula = A688Cuen_Cedula ;
         Z337Cuen_UsuarioCrea = A337Cuen_UsuarioCrea ;
         Z338Cuen_FechaCrea = A338Cuen_FechaCrea ;
         Z339Cuen_UsuarioModifica = A339Cuen_UsuarioModifica ;
         Z340Cuen_FechaModifica = A340Cuen_FechaModifica ;
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
      edtRegi_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtRegi_Id_Visible, 5, 0)), true);
      edtCuen_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Enabled, 5, 0)), true);
      edtCuen_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Enabled, 5, 0)), true);
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtCuen_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Enabled, 5, 0)), true);
      edtCuen_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV14Cuen_Identificacion) )
      {
         A43Cuen_Identificacion = AV14Cuen_Identificacion ;
         n43Cuen_Identificacion = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_Cent_Id) )
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
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtCuen_Cedula_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Visible, 5, 0)), true);
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            edtCuen_Cedula_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Visible, 5, 0)), true);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_Cent_Id) )
      {
         A1Cent_Id = AV15Insert_Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_Tpte_Codigo)==0) )
      {
         A42Tpte_Codigo = AV11Insert_Tpte_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      }
      else
      {
         A42Tpte_Codigo = "MU" ;
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
         AV17Pgmname = "ALM_CUENTADANTE_MULTI" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T00098 */
         pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T00098_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T00098_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T00098_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         pr_default.close(6);
         /* Using cursor T00099 */
         pr_default.execute(7, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T00099_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T00099_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A5Ciud_Codigo = T00099_A5Ciud_Codigo[0] ;
         pr_default.close(7);
         /* Using cursor T000910 */
         pr_default.execute(8, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000910_A7Ciud_Descripcion[0] ;
         A6Dept_Codigo = T000910_A6Dept_Codigo[0] ;
         pr_default.close(8);
         /* Using cursor T000911 */
         pr_default.execute(9, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000911_A10Dept_Descripcion[0] ;
         pr_default.close(9);
         /* Using cursor T00097 */
         pr_default.execute(5, new Object[] {A42Tpte_Codigo});
         A321Tpte_Descripcion = T00097_A321Tpte_Descripcion[0] ;
         pr_default.close(5);
      }
   }

   public void load0910( )
   {
      /* Using cursor T000912 */
      pr_default.execute(10, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A44Cuen_Nombre = T000912_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T000912_n44Cuen_Nombre[0] ;
         A688Cuen_Cedula = T000912_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         A337Cuen_UsuarioCrea = T000912_A337Cuen_UsuarioCrea[0] ;
         A338Cuen_FechaCrea = T000912_A338Cuen_FechaCrea[0] ;
         A339Cuen_UsuarioModifica = T000912_A339Cuen_UsuarioModifica[0] ;
         n339Cuen_UsuarioModifica = T000912_n339Cuen_UsuarioModifica[0] ;
         A340Cuen_FechaModifica = T000912_A340Cuen_FechaModifica[0] ;
         n340Cuen_FechaModifica = T000912_n340Cuen_FechaModifica[0] ;
         A326Cuen_DigitoVerificacion = T000912_A326Cuen_DigitoVerificacion[0] ;
         n326Cuen_DigitoVerificacion = T000912_n326Cuen_DigitoVerificacion[0] ;
         A331Cuen_PrimerNombre = T000912_A331Cuen_PrimerNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
         n331Cuen_PrimerNombre = T000912_n331Cuen_PrimerNombre[0] ;
         A332Cuen_SegundoNombre = T000912_A332Cuen_SegundoNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
         n332Cuen_SegundoNombre = T000912_n332Cuen_SegundoNombre[0] ;
         A329Cuen_PrimerApellido = T000912_A329Cuen_PrimerApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
         n329Cuen_PrimerApellido = T000912_n329Cuen_PrimerApellido[0] ;
         A330Cuen_SegundoApellido = T000912_A330Cuen_SegundoApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
         n330Cuen_SegundoApellido = T000912_n330Cuen_SegundoApellido[0] ;
         A321Tpte_Descripcion = T000912_A321Tpte_Descripcion[0] ;
         A328Cuen_Clase = T000912_A328Cuen_Clase[0] ;
         n328Cuen_Clase = T000912_n328Cuen_Clase[0] ;
         A333Cuen_Estado = T000912_A333Cuen_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
         n333Cuen_Estado = T000912_n333Cuen_Estado[0] ;
         A334Cuen_Direccion = T000912_A334Cuen_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
         n334Cuen_Direccion = T000912_n334Cuen_Direccion[0] ;
         A335Cuen_Telefono = T000912_A335Cuen_Telefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
         n335Cuen_Telefono = T000912_n335Cuen_Telefono[0] ;
         A336Cuen_Email = T000912_A336Cuen_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
         n336Cuen_Email = T000912_n336Cuen_Email[0] ;
         A7Ciud_Descripcion = T000912_A7Ciud_Descripcion[0] ;
         A10Dept_Descripcion = T000912_A10Dept_Descripcion[0] ;
         A3Cent_Codigo = T000912_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000912_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T000912_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         A12Regi_Cod = T000912_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T000912_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A42Tpte_Codigo = T000912_A42Tpte_Codigo[0] ;
         A1Cent_Id = T000912_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A5Ciud_Codigo = T000912_A5Ciud_Codigo[0] ;
         A6Dept_Codigo = T000912_A6Dept_Codigo[0] ;
         zm0910( -20) ;
      }
      pr_default.close(10);
      onLoadActions0910( ) ;
   }

   public void onLoadActions0910( )
   {
      AV17Pgmname = "ALM_CUENTADANTE_MULTI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      A44Cuen_Nombre = GXutil.concat( GXutil.concat( A331Cuen_PrimerNombre, A332Cuen_SegundoNombre, " "), GXutil.concat( A329Cuen_PrimerApellido, A330Cuen_SegundoApellido, " "), " ") ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
   }

   public void checkExtendedTable0910( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV17Pgmname = "ALM_CUENTADANTE_MULTI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      A44Cuen_Nombre = GXutil.concat( GXutil.concat( A331Cuen_PrimerNombre, A332Cuen_SegundoNombre, " "), GXutil.concat( A329Cuen_PrimerApellido, A330Cuen_SegundoApellido, " "), " ") ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      if ( ! ( GxRegex.IsMatch(A336Cuen_Email,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") || (GXutil.strcmp("", A336Cuen_Email)==0) ) )
      {
         httpContext.GX_msglist.addItem("El valor de Email no coincide con el patrón especificado", "OutOfRange", 1, "CUEN_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Email_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00098 */
      pr_default.execute(6, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T00098_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T00098_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A2Regi_Id = T00098_A2Regi_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      pr_default.close(6);
      /* Using cursor T00099 */
      pr_default.execute(7, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T00099_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T00099_A13Regi_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A5Ciud_Codigo = T00099_A5Ciud_Codigo[0] ;
      pr_default.close(7);
      /* Using cursor T000910 */
      pr_default.execute(8, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000910_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000910_A6Dept_Codigo[0] ;
      pr_default.close(8);
      /* Using cursor T000911 */
      pr_default.execute(9, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000911_A10Dept_Descripcion[0] ;
      pr_default.close(9);
      /* Using cursor T00097 */
      pr_default.execute(5, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE TERCERO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A321Tpte_Descripcion = T00097_A321Tpte_Descripcion[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0910( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( long A1Cent_Id )
   {
      /* Using cursor T000913 */
      pr_default.execute(11, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T000913_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T000913_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A2Regi_Id = T000913_A2Regi_Id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A3Cent_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A4Cent_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_23( long A2Regi_Id )
   {
      /* Using cursor T000914 */
      pr_default.execute(12, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000914_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T000914_A13Regi_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A5Ciud_Codigo = T000914_A5Ciud_Codigo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A13Regi_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_24( short A5Ciud_Codigo )
   {
      /* Using cursor T000915 */
      pr_default.execute(13, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000915_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000915_A6Dept_Codigo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A7Ciud_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_25( short A6Dept_Codigo )
   {
      /* Using cursor T000916 */
      pr_default.execute(14, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000916_A10Dept_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A10Dept_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_21( String A42Tpte_Codigo )
   {
      /* Using cursor T000917 */
      pr_default.execute(15, new Object[] {A42Tpte_Codigo});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE TERCERO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A321Tpte_Descripcion = T000917_A321Tpte_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A321Tpte_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void getKey0910( )
   {
      /* Using cursor T000918 */
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
      /* Using cursor T00096 */
      pr_default.execute(4, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0910( 20) ;
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T00096_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = T00096_n43Cuen_Identificacion[0] ;
         A44Cuen_Nombre = T00096_A44Cuen_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
         n44Cuen_Nombre = T00096_n44Cuen_Nombre[0] ;
         A688Cuen_Cedula = T00096_A688Cuen_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         A337Cuen_UsuarioCrea = T00096_A337Cuen_UsuarioCrea[0] ;
         A338Cuen_FechaCrea = T00096_A338Cuen_FechaCrea[0] ;
         A339Cuen_UsuarioModifica = T00096_A339Cuen_UsuarioModifica[0] ;
         n339Cuen_UsuarioModifica = T00096_n339Cuen_UsuarioModifica[0] ;
         A340Cuen_FechaModifica = T00096_A340Cuen_FechaModifica[0] ;
         n340Cuen_FechaModifica = T00096_n340Cuen_FechaModifica[0] ;
         A326Cuen_DigitoVerificacion = T00096_A326Cuen_DigitoVerificacion[0] ;
         n326Cuen_DigitoVerificacion = T00096_n326Cuen_DigitoVerificacion[0] ;
         A331Cuen_PrimerNombre = T00096_A331Cuen_PrimerNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331Cuen_PrimerNombre", A331Cuen_PrimerNombre);
         n331Cuen_PrimerNombre = T00096_n331Cuen_PrimerNombre[0] ;
         A332Cuen_SegundoNombre = T00096_A332Cuen_SegundoNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332Cuen_SegundoNombre", A332Cuen_SegundoNombre);
         n332Cuen_SegundoNombre = T00096_n332Cuen_SegundoNombre[0] ;
         A329Cuen_PrimerApellido = T00096_A329Cuen_PrimerApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329Cuen_PrimerApellido", A329Cuen_PrimerApellido);
         n329Cuen_PrimerApellido = T00096_n329Cuen_PrimerApellido[0] ;
         A330Cuen_SegundoApellido = T00096_A330Cuen_SegundoApellido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330Cuen_SegundoApellido", A330Cuen_SegundoApellido);
         n330Cuen_SegundoApellido = T00096_n330Cuen_SegundoApellido[0] ;
         A328Cuen_Clase = T00096_A328Cuen_Clase[0] ;
         n328Cuen_Clase = T00096_n328Cuen_Clase[0] ;
         A333Cuen_Estado = T00096_A333Cuen_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333Cuen_Estado", A333Cuen_Estado);
         n333Cuen_Estado = T00096_n333Cuen_Estado[0] ;
         A334Cuen_Direccion = T00096_A334Cuen_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334Cuen_Direccion", A334Cuen_Direccion);
         n334Cuen_Direccion = T00096_n334Cuen_Direccion[0] ;
         A335Cuen_Telefono = T00096_A335Cuen_Telefono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335Cuen_Telefono", A335Cuen_Telefono);
         n335Cuen_Telefono = T00096_n335Cuen_Telefono[0] ;
         A336Cuen_Email = T00096_A336Cuen_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336Cuen_Email", A336Cuen_Email);
         n336Cuen_Email = T00096_n336Cuen_Email[0] ;
         A42Tpte_Codigo = T00096_A42Tpte_Codigo[0] ;
         A1Cent_Id = T00096_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0910( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0910( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0910( ) ;
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
      getKey0910( ) ;
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
      /* Using cursor T000919 */
      pr_default.execute(17, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T000919_A43Cuen_Identificacion[0] < A43Cuen_Identificacion ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T000919_A43Cuen_Identificacion[0] > A43Cuen_Identificacion ) ) )
         {
            A43Cuen_Identificacion = T000919_A43Cuen_Identificacion[0] ;
            n43Cuen_Identificacion = T000919_n43Cuen_Identificacion[0] ;
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000920 */
      pr_default.execute(18, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T000920_A43Cuen_Identificacion[0] > A43Cuen_Identificacion ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T000920_A43Cuen_Identificacion[0] < A43Cuen_Identificacion ) ) )
         {
            A43Cuen_Identificacion = T000920_A43Cuen_Identificacion[0] ;
            n43Cuen_Identificacion = T000920_n43Cuen_Identificacion[0] ;
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0910( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0910( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0910( ) ;
               GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A43Cuen_Identificacion != Z43Cuen_Identificacion )
            {
               /* Insert record */
               GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0910( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0910( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCuen_PrimerApellido_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0910( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00095 */
         pr_default.execute(3, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z44Cuen_Nombre, T00095_A44Cuen_Nombre[0]) != 0 ) || ( Z688Cuen_Cedula != T00095_A688Cuen_Cedula[0] ) || ( GXutil.strcmp(Z337Cuen_UsuarioCrea, T00095_A337Cuen_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z338Cuen_FechaCrea, T00095_A338Cuen_FechaCrea[0]) ) || ( GXutil.strcmp(Z339Cuen_UsuarioModifica, T00095_A339Cuen_UsuarioModifica[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z340Cuen_FechaModifica, T00095_A340Cuen_FechaModifica[0]) ) || ( Z326Cuen_DigitoVerificacion != T00095_A326Cuen_DigitoVerificacion[0] ) || ( GXutil.strcmp(Z331Cuen_PrimerNombre, T00095_A331Cuen_PrimerNombre[0]) != 0 ) || ( GXutil.strcmp(Z332Cuen_SegundoNombre, T00095_A332Cuen_SegundoNombre[0]) != 0 ) || ( GXutil.strcmp(Z329Cuen_PrimerApellido, T00095_A329Cuen_PrimerApellido[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z330Cuen_SegundoApellido, T00095_A330Cuen_SegundoApellido[0]) != 0 ) || ( GXutil.strcmp(Z328Cuen_Clase, T00095_A328Cuen_Clase[0]) != 0 ) || ( GXutil.strcmp(Z333Cuen_Estado, T00095_A333Cuen_Estado[0]) != 0 ) || ( GXutil.strcmp(Z334Cuen_Direccion, T00095_A334Cuen_Direccion[0]) != 0 ) || ( GXutil.strcmp(Z335Cuen_Telefono, T00095_A335Cuen_Telefono[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z336Cuen_Email, T00095_A336Cuen_Email[0]) != 0 ) || ( GXutil.strcmp(Z42Tpte_Codigo, T00095_A42Tpte_Codigo[0]) != 0 ) || ( Z1Cent_Id != T00095_A1Cent_Id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CUENTADANTE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0910( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0910( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0910( 0) ;
         checkOptimisticConcurrency0910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000921 */
                  pr_default.execute(19, new Object[] {new Long(A2Regi_Id), new Boolean(n44Cuen_Nombre), A44Cuen_Nombre, new Long(A688Cuen_Cedula), A337Cuen_UsuarioCrea, A338Cuen_FechaCrea, new Boolean(n339Cuen_UsuarioModifica), A339Cuen_UsuarioModifica, new Boolean(n340Cuen_FechaModifica), A340Cuen_FechaModifica, new Boolean(n326Cuen_DigitoVerificacion), new Byte(A326Cuen_DigitoVerificacion), new Boolean(n331Cuen_PrimerNombre), A331Cuen_PrimerNombre, new Boolean(n332Cuen_SegundoNombre), A332Cuen_SegundoNombre, new Boolean(n329Cuen_PrimerApellido), A329Cuen_PrimerApellido, new Boolean(n330Cuen_SegundoApellido), A330Cuen_SegundoApellido, new Boolean(n328Cuen_Clase), A328Cuen_Clase, new Boolean(n333Cuen_Estado), A333Cuen_Estado, new Boolean(n334Cuen_Direccion), A334Cuen_Direccion, new Boolean(n335Cuen_Telefono), A335Cuen_Telefono, new Boolean(n336Cuen_Email), A336Cuen_Email, A42Tpte_Codigo, new Long(A1Cent_Id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000922 */
                  pr_default.execute(20);
                  A43Cuen_Identificacion = T000922_A43Cuen_Identificacion[0] ;
                  n43Cuen_Identificacion = T000922_n43Cuen_Identificacion[0] ;
                  pr_default.close(20);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0910( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption090( ) ;
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
            load0910( ) ;
         }
         endLevel0910( ) ;
      }
      closeExtendedTableCursors0910( ) ;
   }

   public void update0910( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0910( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0910( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000923 */
                  pr_default.execute(21, new Object[] {new Long(A2Regi_Id), new Boolean(n44Cuen_Nombre), A44Cuen_Nombre, new Long(A688Cuen_Cedula), A337Cuen_UsuarioCrea, A338Cuen_FechaCrea, new Boolean(n339Cuen_UsuarioModifica), A339Cuen_UsuarioModifica, new Boolean(n340Cuen_FechaModifica), A340Cuen_FechaModifica, new Boolean(n326Cuen_DigitoVerificacion), new Byte(A326Cuen_DigitoVerificacion), new Boolean(n331Cuen_PrimerNombre), A331Cuen_PrimerNombre, new Boolean(n332Cuen_SegundoNombre), A332Cuen_SegundoNombre, new Boolean(n329Cuen_PrimerApellido), A329Cuen_PrimerApellido, new Boolean(n330Cuen_SegundoApellido), A330Cuen_SegundoApellido, new Boolean(n328Cuen_Clase), A328Cuen_Clase, new Boolean(n333Cuen_Estado), A333Cuen_Estado, new Boolean(n334Cuen_Direccion), A334Cuen_Direccion, new Boolean(n335Cuen_Telefono), A335Cuen_Telefono, new Boolean(n336Cuen_Email), A336Cuen_Email, A42Tpte_Codigo, new Long(A1Cent_Id), new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTE") ;
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0910( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0910( ) ;
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
         endLevel0910( ) ;
      }
      closeExtendedTableCursors0910( ) ;
   }

   public void deferredUpdate0910( )
   {
   }

   public void delete( )
   {
      beforeValidate0910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0910( ) ;
         afterConfirm0910( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0910( ) ;
            if ( AnyError == 0 )
            {
               scanStart0911( ) ;
               while ( RcdFound11 != 0 )
               {
                  getByPrimaryKey0911( ) ;
                  delete0911( ) ;
                  scanNext0911( ) ;
               }
               scanEnd0911( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000924 */
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
      endLevel0910( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0910( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV17Pgmname = "ALM_CUENTADANTE_MULTI" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T000925 */
         pr_default.execute(23, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T000925_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000925_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A2Regi_Id = T000925_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         pr_default.close(23);
         /* Using cursor T000926 */
         pr_default.execute(24, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T000926_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T000926_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A5Ciud_Codigo = T000926_A5Ciud_Codigo[0] ;
         pr_default.close(24);
         /* Using cursor T000927 */
         pr_default.execute(25, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000927_A7Ciud_Descripcion[0] ;
         A6Dept_Codigo = T000927_A6Dept_Codigo[0] ;
         pr_default.close(25);
         /* Using cursor T000928 */
         pr_default.execute(26, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000928_A10Dept_Descripcion[0] ;
         pr_default.close(26);
         /* Using cursor T000929 */
         pr_default.execute(27, new Object[] {A42Tpte_Codigo});
         A321Tpte_Descripcion = T000929_A321Tpte_Descripcion[0] ;
         pr_default.close(27);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000930 */
         pr_default.execute(28, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Responsabilidad"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000931 */
         pr_default.execute(29, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Destino"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000932 */
         pr_default.execute(30, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Proveedor"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000933 */
         pr_default.execute(31, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Cuentadante Origen"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000934 */
         pr_default.execute(32, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"INVENTARIO DEVOLUTIVO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000935 */
         pr_default.execute(33, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"MULTIPLE"+" ("+"Cuentadante Multiple"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000936 */
         pr_default.execute(34, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACÉN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void processNestedLevel0911( )
   {
      nGXsfl_98_idx = (short)(0) ;
      while ( nGXsfl_98_idx < nRC_GXsfl_98 )
      {
         readRow0911( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            standaloneNotModal0911( ) ;
            getKey0911( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0911( ) ;
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
                     delete0911( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_11 != 0 ) && ( nRcdExists_11 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0911( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCuen_Identificacion_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Cedula_Multi_Internalname, GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCuen_Nombre_Multi_Internalname, A690Cuen_Nombre_Multi) ;
         httpContext.changePostValue( cmbCuen_Multi_Estado.getInternalname(), GXutil.rtrim( A692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_98_idx, GXutil.rtrim( Z692Cuen_Multi_Estado)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_98_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0911( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_11 = (short)(0) ;
      nIsMod_11 = (short)(0) ;
      nRcdDeleted_11 = (short)(0) ;
   }

   public void processLevel0910( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel0911( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0910( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0910( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_cuentadante_multi");
         if ( AnyError == 0 )
         {
            confirmValues090( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_cuentadante_multi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0910( )
   {
      /* Scan By routine */
      /* Using cursor T000937 */
      pr_default.execute(35);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T000937_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = T000937_n43Cuen_Identificacion[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0910( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A43Cuen_Identificacion = T000937_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = T000937_n43Cuen_Identificacion[0] ;
      }
   }

   public void scanEnd0910( )
   {
      pr_default.close(35);
   }

   public void afterConfirm0910( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && true /* After */ )
      {
         A338Cuen_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  && true /* After */ )
      {
         A340Cuen_FechaModifica = GXutil.now( ) ;
         n340Cuen_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && true /* After */ )
      {
         A337Cuen_UsuarioCrea = AV16Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  && true /* After */ )
      {
         A339Cuen_UsuarioModifica = AV16Usuario ;
         n339Cuen_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         GXt_int1 = A688Cuen_Cedula ;
         GXv_int2[0] = GXt_int1 ;
         new com.orions2.pcedulacuentamultiple(remoteHandle, context).execute( A1Cent_Id, GXv_int2) ;
         alm_cuentadante_multi_impl.this.GXt_int1 = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A688Cuen_Cedula = GXt_int1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      }
   }

   public void beforeInsert0910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0910( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0910( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0910( )
   {
      edtCuen_PrimerApellido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_PrimerApellido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_PrimerApellido_Enabled, 5, 0)), true);
      edtCuen_SegundoApellido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_SegundoApellido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_SegundoApellido_Enabled, 5, 0)), true);
      edtCuen_PrimerNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_PrimerNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_PrimerNombre_Enabled, 5, 0)), true);
      edtCuen_SegundoNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_SegundoNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_SegundoNombre_Enabled, 5, 0)), true);
      edtCuen_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Enabled, 5, 0)), true);
      edtCuen_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Enabled, 5, 0)), true);
      edtCuen_Direccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Direccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Direccion_Enabled, 5, 0)), true);
      edtCuen_Telefono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Telefono_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Telefono_Enabled, 5, 0)), true);
      edtCuen_Email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Email_Enabled, 5, 0)), true);
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), true);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      edtRegi_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Descripcion_Enabled, 5, 0)), true);
      cmbCuen_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Estado.getEnabled(), 5, 0)), true);
      edtRegi_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Id_Enabled, 5, 0)), true);
   }

   public void zm0911( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z692Cuen_Multi_Estado = T00093_A692Cuen_Multi_Estado[0] ;
         }
         else
         {
            Z692Cuen_Multi_Estado = A692Cuen_Multi_Estado ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z692Cuen_Multi_Estado = A692Cuen_Multi_Estado ;
         Z45Cuen_Identificacion_Multi = A45Cuen_Identificacion_Multi ;
         Z690Cuen_Nombre_Multi = A690Cuen_Nombre_Multi ;
         Z691Cuen_Cedula_Multi = A691Cuen_Cedula_Multi ;
      }
   }

   public void standaloneNotModal0911( )
   {
   }

   public void standaloneModal0911( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCuen_Identificacion_Multi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
      }
      else
      {
         edtCuen_Identificacion_Multi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
      }
   }

   public void load0911( )
   {
      /* Using cursor T000938 */
      pr_default.execute(36, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A690Cuen_Nombre_Multi = T000938_A690Cuen_Nombre_Multi[0] ;
         n690Cuen_Nombre_Multi = T000938_n690Cuen_Nombre_Multi[0] ;
         A691Cuen_Cedula_Multi = T000938_A691Cuen_Cedula_Multi[0] ;
         n691Cuen_Cedula_Multi = T000938_n691Cuen_Cedula_Multi[0] ;
         A692Cuen_Multi_Estado = T000938_A692Cuen_Multi_Estado[0] ;
         zm0911( -26) ;
      }
      pr_default.close(36);
      onLoadActions0911( ) ;
   }

   public void onLoadActions0911( )
   {
   }

   public void checkExtendedTable0911( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0911( ) ;
      /* Using cursor T00094 */
      pr_default.execute(2, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A690Cuen_Nombre_Multi = T00094_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T00094_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T00094_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T00094_n691Cuen_Cedula_Multi[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0911( )
   {
      pr_default.close(2);
   }

   public void enableDisable0911( )
   {
   }

   public void gxload_27( long A45Cuen_Identificacion_Multi )
   {
      /* Using cursor T000939 */
      pr_default.execute(37, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A690Cuen_Nombre_Multi = T000939_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T000939_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T000939_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T000939_n691Cuen_Cedula_Multi[0] ;
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

   public void getKey0911( )
   {
      /* Using cursor T000940 */
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

   public void getByPrimaryKey0911( )
   {
      /* Using cursor T00093 */
      pr_default.execute(1, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0911( 26) ;
         RcdFound11 = (short)(1) ;
         initializeNonKey0911( ) ;
         A692Cuen_Multi_Estado = T00093_A692Cuen_Multi_Estado[0] ;
         A45Cuen_Identificacion_Multi = T00093_A45Cuen_Identificacion_Multi[0] ;
         Z43Cuen_Identificacion = A43Cuen_Identificacion ;
         Z45Cuen_Identificacion_Multi = A45Cuen_Identificacion_Multi ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0911( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0911( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0911( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0911( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0911( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00092 */
         pr_default.execute(0, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z692Cuen_Multi_Estado, T00092_A692Cuen_Multi_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0911( )
   {
      beforeValidate0911( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0911( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0911( 0) ;
         checkOptimisticConcurrency0911( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0911( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0911( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000941 */
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
            load0911( ) ;
         }
         endLevel0911( ) ;
      }
      closeExtendedTableCursors0911( ) ;
   }

   public void update0911( )
   {
      beforeValidate0911( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0911( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0911( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0911( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0911( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000942 */
                  pr_default.execute(40, new Object[] {A692Cuen_Multi_Estado, new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Long(A45Cuen_Identificacion_Multi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CUENTADANTEMULTIPLE") ;
                  if ( (pr_default.getStatus(40) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CUENTADANTEMULTIPLE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0911( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0911( ) ;
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
         endLevel0911( ) ;
      }
      closeExtendedTableCursors0911( ) ;
   }

   public void deferredUpdate0911( )
   {
   }

   public void delete0911( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0911( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0911( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0911( ) ;
         afterConfirm0911( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0911( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000943 */
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
      endLevel0911( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0911( )
   {
      standaloneModal0911( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000944 */
         pr_default.execute(42, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
         A690Cuen_Nombre_Multi = T000944_A690Cuen_Nombre_Multi[0] ;
         n690Cuen_Nombre_Multi = T000944_n690Cuen_Nombre_Multi[0] ;
         A691Cuen_Cedula_Multi = T000944_A691Cuen_Cedula_Multi[0] ;
         n691Cuen_Cedula_Multi = T000944_n691Cuen_Cedula_Multi[0] ;
         pr_default.close(42);
      }
   }

   public void endLevel0911( )
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

   public void scanStart0911( )
   {
      /* Scan By routine */
      /* Using cursor T000945 */
      pr_default.execute(43, new Object[] {new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion)});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A45Cuen_Identificacion_Multi = T000945_A45Cuen_Identificacion_Multi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0911( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A45Cuen_Identificacion_Multi = T000945_A45Cuen_Identificacion_Multi[0] ;
      }
   }

   public void scanEnd0911( )
   {
      pr_default.close(43);
   }

   public void afterConfirm0911( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0911( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0911( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0911( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0911( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0911( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0911( )
   {
      edtCuen_Identificacion_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
      edtCuen_Cedula_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Cedula_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Cedula_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
      edtCuen_Nombre_Multi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Nombre_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Nombre_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
      cmbCuen_Multi_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCuen_Multi_Estado.getEnabled(), 5, 0)), !bGXsfl_98_Refreshing);
   }

   public void subsflControlProps_9811( )
   {
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx ;
      imgprompt_45_Internalname = "PROMPT_45_"+sGXsfl_98_idx ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx );
   }

   public void subsflControlProps_fel_9811( )
   {
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_fel_idx ;
      imgprompt_45_Internalname = "PROMPT_45_"+sGXsfl_98_fel_idx ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI_"+sGXsfl_98_fel_idx ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI_"+sGXsfl_98_fel_idx ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO_"+sGXsfl_98_fel_idx );
   }

   public void addRow0911( )
   {
      nGXsfl_98_idx = (short)(nGXsfl_98_idx+1) ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_9811( ) ;
      sendRow0911( ) ;
   }

   public void sendRow0911( )
   {
      Gridalm_cuentadante_multi_multipleRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_cuentadante_multi_multiple_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_cuentadante_multi_multiple_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multi_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multi_multiple_Linesclass = subGridalm_cuentadante_multi_multiple_Class+"Odd" ;
         }
      }
      else if ( subGridalm_cuentadante_multi_multiple_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_cuentadante_multi_multiple_Backstyle = (byte)(0) ;
         subGridalm_cuentadante_multi_multiple_Backcolor = subGridalm_cuentadante_multi_multiple_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multi_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multi_multiple_Linesclass = subGridalm_cuentadante_multi_multiple_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_cuentadante_multi_multiple_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_cuentadante_multi_multiple_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_cuentadante_multi_multiple_Class, "") != 0 )
         {
            subGridalm_cuentadante_multi_multiple_Linesclass = subGridalm_cuentadante_multi_multiple_Class+"Odd" ;
         }
         subGridalm_cuentadante_multi_multiple_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_cuentadante_multi_multiple_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_cuentadante_multi_multiple_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_98_idx) % (2))) == 0 )
         {
            subGridalm_cuentadante_multi_multiple_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_cuentadante_multi_multiple_Class, "") != 0 )
            {
               subGridalm_cuentadante_multi_multiple_Linesclass = subGridalm_cuentadante_multi_multiple_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_cuentadante_multi_multiple_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_cuentadante_multi_multiple_Class, "") != 0 )
            {
               subGridalm_cuentadante_multi_multiple_Linesclass = subGridalm_cuentadante_multi_multiple_Class+"Odd" ;
            }
         }
      }
      imgprompt_45_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"'), id:'"+"CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_11_"+sGXsfl_98_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00b1"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(43,2),t(',',7),t(18,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CUEN_IDENTIFICACION_MULTI_"',3),t(+,5),t(sGXsfl_98_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"CUEN_IDENTIFICACION_MULTI_"',3),t(+,5),t(sGXsfl_98_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_11_"',3),t(+,5),t(sGXsfl_98_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_43,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_98_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_98_idx + "',98)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multi_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Multi_Internalname,GXutil.ltrim( localUtil.ntoc( A45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A45Cuen_Identificacion_Multi), "ZZZZZZZZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtCuen_Identificacion_Multi_Enabled),new Integer(1),"text","",new Integer(90),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(98),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_cuentadante_multi_multipleRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_45_Internalname,sImgUrl,imgprompt_45_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_45_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multi_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Cedula_Multi_Internalname,GXutil.ltrim( localUtil.ntoc( A691Cuen_Cedula_Multi, (byte)(18), (byte)(0), ",", "")),((edtCuen_Cedula_Multi_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A691Cuen_Cedula_Multi), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A691Cuen_Cedula_Multi), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Cedula_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtCuen_Cedula_Multi_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(98),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_cuentadante_multi_multipleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Multi_Internalname,A690Cuen_Nombre_Multi,GXutil.rtrim( localUtil.format( A690Cuen_Nombre_Multi, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Nombre_Multi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtCuen_Nombre_Multi_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(98),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_98_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_98_idx + "',98)\"" ;
      if ( ( nGXsfl_98_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_98_idx ;
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
      Gridalm_cuentadante_multi_multipleRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCuen_Multi_Estado,cmbCuen_Multi_Estado.getInternalname(),GXutil.rtrim( A692Cuen_Multi_Estado),new Integer(1),cmbCuen_Multi_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbCuen_Multi_Estado.getEnabled()),new Integer(0),new Integer(0),new Integer(150),"px",new Integer(0),"px","","Attribute","WWColumn",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"","",new Boolean(true)});
      cmbCuen_Multi_Estado.setValue( GXutil.rtrim( A692Cuen_Multi_Estado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Multi_Estado.getInternalname(), "Values", cmbCuen_Multi_Estado.ToJavascriptSource(), !bGXsfl_98_Refreshing);
      httpContext.ajax_sending_grid_row(Gridalm_cuentadante_multi_multipleRow);
      GXCCtl = "Z45Cuen_Identificacion_Multi_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z45Cuen_Identificacion_Multi, (byte)(18), (byte)(0), ",", "")));
      GXCCtl = "Z692Cuen_Multi_Estado_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z692Cuen_Multi_Estado));
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_11_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_11_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_98_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV9TrnContext);
      }
      GXCCtl = "vCUEN_IDENTIFICACION_" + sGXsfl_98_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Identificacion_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Cedula_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCuen_Nombre_Multi_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCuen_Multi_Estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_45_"+sGXsfl_98_idx+"Link", GXutil.rtrim( imgprompt_45_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_cuentadante_multi_multipleContainer.AddRow(Gridalm_cuentadante_multi_multipleRow);
   }

   public void readRow0911( )
   {
      nGXsfl_98_idx = (short)(nGXsfl_98_idx+1) ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_9811( ) ;
      edtCuen_Identificacion_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_IDENTIFICACION_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
      edtCuen_Cedula_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_CEDULA_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
      edtCuen_Nombre_Multi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_NOMBRE_MULTI_"+sGXsfl_98_idx+"Enabled"), ",", ".")) ;
      cmbCuen_Multi_Estado.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CUEN_MULTI_ESTADO_"+sGXsfl_98_idx+"Enabled"), ",", ".")) );
      imgprompt_1_Link = httpContext.cgiGet( "PROMPT_45_"+sGXsfl_98_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Multi_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Multi_Internalname), ",", ".") > 999999999999999999L ) ) )
      {
         GXCCtl = "CUEN_IDENTIFICACION_MULTI_" + sGXsfl_98_idx ;
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
      A691Cuen_Cedula_Multi = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Multi_Internalname), ",", ".") ;
      n691Cuen_Cedula_Multi = false ;
      A690Cuen_Nombre_Multi = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Multi_Internalname)) ;
      n690Cuen_Nombre_Multi = false ;
      cmbCuen_Multi_Estado.setName( cmbCuen_Multi_Estado.getInternalname() );
      cmbCuen_Multi_Estado.setValue( httpContext.cgiGet( cmbCuen_Multi_Estado.getInternalname()) );
      A692Cuen_Multi_Estado = httpContext.cgiGet( cmbCuen_Multi_Estado.getInternalname()) ;
      GXCCtl = "Z45Cuen_Identificacion_Multi_" + sGXsfl_98_idx ;
      Z45Cuen_Identificacion_Multi = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z692Cuen_Multi_Estado_" + sGXsfl_98_idx ;
      Z692Cuen_Multi_Estado = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_98_idx ;
      nRcdDeleted_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_11_" + sGXsfl_98_idx ;
      nRcdExists_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_11_" + sGXsfl_98_idx ;
      nIsMod_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtCuen_Identificacion_Multi_Enabled = edtCuen_Identificacion_Multi_Enabled ;
   }

   public void confirmValues090( )
   {
      nGXsfl_98_idx = (short)(0) ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_9811( ) ;
      while ( nGXsfl_98_idx < nRC_GXsfl_98 )
      {
         nGXsfl_98_idx = (short)(nGXsfl_98_idx+1) ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_9811( ) ;
         httpContext.changePostValue( "Z45Cuen_Identificacion_Multi_"+sGXsfl_98_idx, httpContext.cgiGet( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_98_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45Cuen_Identificacion_Multi_"+sGXsfl_98_idx) ;
         httpContext.changePostValue( "Z692Cuen_Multi_Estado_"+sGXsfl_98_idx, httpContext.cgiGet( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_98_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z692Cuen_Multi_Estado_"+sGXsfl_98_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414144010");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Cuen_Identificacion,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z688Cuen_Cedula", GXutil.ltrim( localUtil.ntoc( Z688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z337Cuen_UsuarioCrea", Z337Cuen_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z338Cuen_FechaCrea", localUtil.ttoc( Z338Cuen_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z339Cuen_UsuarioModifica", Z339Cuen_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z340Cuen_FechaModifica", localUtil.ttoc( Z340Cuen_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_98", GXutil.ltrim( localUtil.ntoc( nGXsfl_98_idx, (byte)(4), (byte)(0), ",", "")));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV14Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TPTE_CODIGO", GXutil.rtrim( AV11Insert_Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_CODIGO", GXutil.rtrim( A42Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CENT_ID", GXutil.ltrim( localUtil.ntoc( AV15Insert_Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV16Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_USUARIOCREA", A337Cuen_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_FECHACREA", localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_USUARIOMODIFICA", A339Cuen_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_FECHAMODIFICA", localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_DIGITOVERIFICACION", GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CLASE", A328Cuen_Clase);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_DESCRIPCION", A321Tpte_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CIUD_DESCRIPCION", A7Ciud_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_CODIGO", GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_DESCRIPCION", A10Dept_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV17Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CUENTADANTE_MULTI" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9") ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A328Cuen_Clase, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cuentadante_multi:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Cuen_Identificacion,18,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_CUENTADANTE_MULTI" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_CUENTADANTE_MULTI" ;
   }

   public void initializeNonKey0910( )
   {
      A42Tpte_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A42Tpte_Codigo", A42Tpte_Codigo);
      A1Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      A44Cuen_Nombre = "" ;
      n44Cuen_Nombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44Cuen_Nombre", A44Cuen_Nombre);
      n44Cuen_Nombre = ((GXutil.strcmp("", A44Cuen_Nombre)==0) ? true : false) ;
      A688Cuen_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      A337Cuen_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337Cuen_UsuarioCrea", A337Cuen_UsuarioCrea);
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A338Cuen_FechaCrea", localUtil.ttoc( A338Cuen_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A339Cuen_UsuarioModifica = "" ;
      n339Cuen_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339Cuen_UsuarioModifica", A339Cuen_UsuarioModifica);
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n340Cuen_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A340Cuen_FechaModifica", localUtil.ttoc( A340Cuen_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A326Cuen_DigitoVerificacion = (byte)(0) ;
      n326Cuen_DigitoVerificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326Cuen_DigitoVerificacion", GXutil.str( A326Cuen_DigitoVerificacion, 1, 0));
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
      Z688Cuen_Cedula = 0 ;
      Z337Cuen_UsuarioCrea = "" ;
      Z338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z339Cuen_UsuarioModifica = "" ;
      Z340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
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

   public void initAll0910( )
   {
      A43Cuen_Identificacion = 0 ;
      n43Cuen_Identificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A43Cuen_Identificacion", GXutil.ltrim( GXutil.str( A43Cuen_Identificacion, 18, 0)));
      initializeNonKey0910( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0911( )
   {
      A690Cuen_Nombre_Multi = "" ;
      n690Cuen_Nombre_Multi = false ;
      A691Cuen_Cedula_Multi = 0 ;
      n691Cuen_Cedula_Multi = false ;
      A692Cuen_Multi_Estado = "" ;
      Z692Cuen_Multi_Estado = "" ;
   }

   public void initAll0911( )
   {
      A45Cuen_Identificacion_Multi = 0 ;
      initializeNonKey0911( ) ;
   }

   public void standaloneModalInsert0911( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414144032");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_cuentadante_multi.js", "?201861414144032");
      /* End function include_jscripts */
   }

   public void init_level_properties11( )
   {
      edtCuen_Identificacion_Multi_Enabled = defedtCuen_Identificacion_Multi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCuen_Identificacion_Multi_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCuen_Identificacion_Multi_Enabled, 5, 0)), !bGXsfl_98_Refreshing);
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
      edtCuen_PrimerApellido_Internalname = "CUEN_PRIMERAPELLIDO" ;
      edtCuen_SegundoApellido_Internalname = "CUEN_SEGUNDOAPELLIDO" ;
      edtCuen_PrimerNombre_Internalname = "CUEN_PRIMERNOMBRE" ;
      edtCuen_SegundoNombre_Internalname = "CUEN_SEGUNDONOMBRE" ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA" ;
      edtCuen_Direccion_Internalname = "CUEN_DIRECCION" ;
      edtCuen_Telefono_Internalname = "CUEN_TELEFONO" ;
      edtCuen_Email_Internalname = "CUEN_EMAIL" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      cmbCuen_Estado.setInternalname( "CUEN_ESTADO" );
      edtRegi_Id_Internalname = "REGI_ID" ;
      lblTitlemultiple_Internalname = "TITLEMULTIPLE" ;
      edtCuen_Identificacion_Multi_Internalname = "CUEN_IDENTIFICACION_MULTI" ;
      edtCuen_Cedula_Multi_Internalname = "CUEN_CEDULA_MULTI" ;
      edtCuen_Nombre_Multi_Internalname = "CUEN_NOMBRE_MULTI" ;
      cmbCuen_Multi_Estado.setInternalname( "CUEN_MULTI_ESTADO" );
      divMultipletable_Internalname = "MULTIPLETABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1_Internalname = "PROMPT_1" ;
      imgprompt_45_Internalname = "PROMPT_45" ;
      subGridalm_cuentadante_multi_multiple_Internalname = "GRIDALM_CUENTADANTE_MULTI_MULTIPLE" ;
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
      Form.setCaption( "ALM_CUENTADANTE_MULTI" );
      cmbCuen_Multi_Estado.setJsonclick( "" );
      edtCuen_Nombre_Multi_Jsonclick = "" ;
      edtCuen_Cedula_Multi_Jsonclick = "" ;
      imgprompt_45_Visible = 1 ;
      imgprompt_45_Link = "" ;
      imgprompt_1_Visible = 1 ;
      edtCuen_Identificacion_Multi_Jsonclick = "" ;
      subGridalm_cuentadante_multi_multiple_Class = "WorkWith" ;
      subGridalm_cuentadante_multi_multiple_Backcolorstyle = (byte)(0) ;
      subGridalm_cuentadante_multi_multiple_Allowcollapsing = (byte)(0) ;
      subGridalm_cuentadante_multi_multiple_Allowselection = (byte)(0) ;
      cmbCuen_Multi_Estado.setEnabled( 1 );
      edtCuen_Nombre_Multi_Enabled = 0 ;
      edtCuen_Cedula_Multi_Enabled = 0 ;
      edtCuen_Identificacion_Multi_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
      edtRegi_Id_Visible = 1 ;
      cmbCuen_Estado.setJsonclick( "" );
      cmbCuen_Estado.setEnabled( 1 );
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 1 ;
      edtCuen_Email_Jsonclick = "" ;
      edtCuen_Email_Enabled = 1 ;
      edtCuen_Telefono_Jsonclick = "" ;
      edtCuen_Telefono_Enabled = 1 ;
      edtCuen_Direccion_Enabled = 1 ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Cedula_Enabled = 0 ;
      edtCuen_Cedula_Visible = 1 ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Nombre_Enabled = 0 ;
      edtCuen_SegundoNombre_Jsonclick = "" ;
      edtCuen_SegundoNombre_Enabled = 1 ;
      edtCuen_PrimerNombre_Jsonclick = "" ;
      edtCuen_PrimerNombre_Enabled = 1 ;
      edtCuen_SegundoApellido_Jsonclick = "" ;
      edtCuen_SegundoApellido_Enabled = 1 ;
      edtCuen_PrimerApellido_Jsonclick = "" ;
      edtCuen_PrimerApellido_Enabled = 1 ;
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

   public void gx10asacuen_cedula0910( String Gx_mode ,
                                       long A1Cent_Id )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         GXt_int1 = A688Cuen_Cedula ;
         GXv_int2[0] = GXt_int1 ;
         new com.orions2.pcedulacuentamultiple(remoteHandle, context).execute( A1Cent_Id, GXv_int2) ;
         alm_cuentadante_multi_impl.this.GXt_int1 = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A688Cuen_Cedula = GXt_int1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A688Cuen_Cedula", GXutil.ltrim( GXutil.str( A688Cuen_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridalm_cuentadante_multi_multiple_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_9811( ) ;
      while ( nGXsfl_98_idx <= nRC_GXsfl_98 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0911( ) ;
         standaloneModal0911( ) ;
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
         GXCCtl = "CUEN_MULTI_ESTADO_" + sGXsfl_98_idx ;
         cmbCuen_Multi_Estado.setName( GXCCtl );
         cmbCuen_Multi_Estado.setWebtags( "" );
         cmbCuen_Multi_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Multi_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Multi_Estado.getItemCount() > 0 )
         {
            A692Cuen_Multi_Estado = cmbCuen_Multi_Estado.getValidValue(A692Cuen_Multi_Estado) ;
         }
         dynload_actions( ) ;
         sendRow0911( ) ;
         nGXsfl_98_idx = (short)(nGXsfl_98_idx+1) ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_98_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_9811( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_cuentadante_multi_multipleContainer.ToJavascriptSource());
      /* End function gxnrGridalm_cuentadante_multi_multiple_newrow */
   }

   public void valid_Cent_id( long GX_Parm1 ,
                              long GX_Parm2 ,
                              short GX_Parm3 ,
                              short GX_Parm4 ,
                              String GX_Parm5 ,
                              String GX_Parm6 ,
                              short GX_Parm7 ,
                              String GX_Parm8 ,
                              String GX_Parm9 ,
                              String GX_Parm10 )
   {
      A1Cent_Id = GX_Parm1 ;
      A2Regi_Id = GX_Parm2 ;
      A5Ciud_Codigo = GX_Parm3 ;
      A6Dept_Codigo = GX_Parm4 ;
      A3Cent_Codigo = GX_Parm5 ;
      A4Cent_Descripcion = GX_Parm6 ;
      A12Regi_Cod = GX_Parm7 ;
      A13Regi_Descripcion = GX_Parm8 ;
      A7Ciud_Descripcion = GX_Parm9 ;
      A10Dept_Descripcion = GX_Parm10 ;
      /* Using cursor T000925 */
      pr_default.execute(23, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
      }
      A3Cent_Codigo = T000925_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000925_A4Cent_Descripcion[0] ;
      A2Regi_Id = T000925_A2Regi_Id[0] ;
      pr_default.close(23);
      /* Using cursor T000926 */
      pr_default.execute(24, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000926_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T000926_A13Regi_Descripcion[0] ;
      A5Ciud_Codigo = T000926_A5Ciud_Codigo[0] ;
      pr_default.close(24);
      /* Using cursor T000927 */
      pr_default.execute(25, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000927_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000927_A6Dept_Codigo[0] ;
      pr_default.close(25);
      /* Using cursor T000928 */
      pr_default.execute(26, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000928_A10Dept_Descripcion[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A3Cent_Codigo = "" ;
         A4Cent_Descripcion = "" ;
         A2Regi_Id = 0 ;
         A12Regi_Cod = (short)(0) ;
         A13Regi_Descripcion = "" ;
         A5Ciud_Codigo = (short)(0) ;
         A7Ciud_Descripcion = "" ;
         A6Dept_Codigo = (short)(0) ;
         A10Dept_Descripcion = "" ;
      }
      isValidOutput.add(A3Cent_Codigo);
      isValidOutput.add(A4Cent_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A13Regi_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A7Ciud_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A10Dept_Descripcion);
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
      /* Using cursor T000944 */
      pr_default.execute(42, new Object[] {new Long(A45Cuen_Identificacion_Multi)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Cuentadante Multiple'.", "ForeignKeyNotFound", 1, "CUEN_IDENTIFICACION_MULTI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCuen_Identificacion_Multi_Internalname ;
      }
      A690Cuen_Nombre_Multi = T000944_A690Cuen_Nombre_Multi[0] ;
      n690Cuen_Nombre_Multi = T000944_n690Cuen_Nombre_Multi[0] ;
      A691Cuen_Cedula_Multi = T000944_A691Cuen_Cedula_Multi[0] ;
      n691Cuen_Cedula_Multi = T000944_n691Cuen_Cedula_Multi[0] ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV14Cuen_Identificacion',fld:'vCUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12092',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z44Cuen_Nombre = "" ;
      Z337Cuen_UsuarioCrea = "" ;
      Z338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z339Cuen_UsuarioModifica = "" ;
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
      Gx_mode = "" ;
      A42Tpte_Codigo = "" ;
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
      A329Cuen_PrimerApellido = "" ;
      A330Cuen_SegundoApellido = "" ;
      A331Cuen_PrimerNombre = "" ;
      A332Cuen_SegundoNombre = "" ;
      A44Cuen_Nombre = "" ;
      A334Cuen_Direccion = "" ;
      A335Cuen_Telefono = "" ;
      A336Cuen_Email = "" ;
      sImgUrl = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      lblTitlemultiple_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_cuentadante_multi_multipleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_cuentadante_multi_multipleColumn = new com.genexus.webpanels.GXWebColumn();
      A690Cuen_Nombre_Multi = "" ;
      sMode11 = "" ;
      sStyleString = "" ;
      A339Cuen_UsuarioModifica = "" ;
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A328Cuen_Clase = "" ;
      A337Cuen_UsuarioCrea = "" ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV11Insert_Tpte_Codigo = "" ;
      AV16Usuario = "" ;
      A321Tpte_Descripcion = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
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
      T00098_A3Cent_Codigo = new String[] {""} ;
      T00098_A4Cent_Descripcion = new String[] {""} ;
      T00098_A2Regi_Id = new long[1] ;
      T00099_A12Regi_Cod = new short[1] ;
      T00099_A13Regi_Descripcion = new String[] {""} ;
      T00099_A5Ciud_Codigo = new short[1] ;
      T000910_A7Ciud_Descripcion = new String[] {""} ;
      T000910_A6Dept_Codigo = new short[1] ;
      T000911_A10Dept_Descripcion = new String[] {""} ;
      T00097_A321Tpte_Descripcion = new String[] {""} ;
      T000912_A43Cuen_Identificacion = new long[1] ;
      T000912_n43Cuen_Identificacion = new boolean[] {false} ;
      T000912_A44Cuen_Nombre = new String[] {""} ;
      T000912_n44Cuen_Nombre = new boolean[] {false} ;
      T000912_A688Cuen_Cedula = new long[1] ;
      T000912_A337Cuen_UsuarioCrea = new String[] {""} ;
      T000912_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000912_A339Cuen_UsuarioModifica = new String[] {""} ;
      T000912_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T000912_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000912_n340Cuen_FechaModifica = new boolean[] {false} ;
      T000912_A326Cuen_DigitoVerificacion = new byte[1] ;
      T000912_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T000912_A331Cuen_PrimerNombre = new String[] {""} ;
      T000912_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T000912_A332Cuen_SegundoNombre = new String[] {""} ;
      T000912_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T000912_A329Cuen_PrimerApellido = new String[] {""} ;
      T000912_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T000912_A330Cuen_SegundoApellido = new String[] {""} ;
      T000912_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T000912_A321Tpte_Descripcion = new String[] {""} ;
      T000912_A328Cuen_Clase = new String[] {""} ;
      T000912_n328Cuen_Clase = new boolean[] {false} ;
      T000912_A333Cuen_Estado = new String[] {""} ;
      T000912_n333Cuen_Estado = new boolean[] {false} ;
      T000912_A334Cuen_Direccion = new String[] {""} ;
      T000912_n334Cuen_Direccion = new boolean[] {false} ;
      T000912_A335Cuen_Telefono = new String[] {""} ;
      T000912_n335Cuen_Telefono = new boolean[] {false} ;
      T000912_A336Cuen_Email = new String[] {""} ;
      T000912_n336Cuen_Email = new boolean[] {false} ;
      T000912_A7Ciud_Descripcion = new String[] {""} ;
      T000912_A10Dept_Descripcion = new String[] {""} ;
      T000912_A3Cent_Codigo = new String[] {""} ;
      T000912_A4Cent_Descripcion = new String[] {""} ;
      T000912_A2Regi_Id = new long[1] ;
      T000912_A12Regi_Cod = new short[1] ;
      T000912_A13Regi_Descripcion = new String[] {""} ;
      T000912_A42Tpte_Codigo = new String[] {""} ;
      T000912_A1Cent_Id = new long[1] ;
      T000912_A5Ciud_Codigo = new short[1] ;
      T000912_A6Dept_Codigo = new short[1] ;
      T000913_A3Cent_Codigo = new String[] {""} ;
      T000913_A4Cent_Descripcion = new String[] {""} ;
      T000913_A2Regi_Id = new long[1] ;
      T000914_A12Regi_Cod = new short[1] ;
      T000914_A13Regi_Descripcion = new String[] {""} ;
      T000914_A5Ciud_Codigo = new short[1] ;
      T000915_A7Ciud_Descripcion = new String[] {""} ;
      T000915_A6Dept_Codigo = new short[1] ;
      T000916_A10Dept_Descripcion = new String[] {""} ;
      T000917_A321Tpte_Descripcion = new String[] {""} ;
      T000918_A43Cuen_Identificacion = new long[1] ;
      T000918_n43Cuen_Identificacion = new boolean[] {false} ;
      T00096_A43Cuen_Identificacion = new long[1] ;
      T00096_n43Cuen_Identificacion = new boolean[] {false} ;
      T00096_A44Cuen_Nombre = new String[] {""} ;
      T00096_n44Cuen_Nombre = new boolean[] {false} ;
      T00096_A688Cuen_Cedula = new long[1] ;
      T00096_A337Cuen_UsuarioCrea = new String[] {""} ;
      T00096_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00096_A339Cuen_UsuarioModifica = new String[] {""} ;
      T00096_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T00096_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00096_n340Cuen_FechaModifica = new boolean[] {false} ;
      T00096_A326Cuen_DigitoVerificacion = new byte[1] ;
      T00096_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T00096_A331Cuen_PrimerNombre = new String[] {""} ;
      T00096_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T00096_A332Cuen_SegundoNombre = new String[] {""} ;
      T00096_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T00096_A329Cuen_PrimerApellido = new String[] {""} ;
      T00096_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T00096_A330Cuen_SegundoApellido = new String[] {""} ;
      T00096_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T00096_A328Cuen_Clase = new String[] {""} ;
      T00096_n328Cuen_Clase = new boolean[] {false} ;
      T00096_A333Cuen_Estado = new String[] {""} ;
      T00096_n333Cuen_Estado = new boolean[] {false} ;
      T00096_A334Cuen_Direccion = new String[] {""} ;
      T00096_n334Cuen_Direccion = new boolean[] {false} ;
      T00096_A335Cuen_Telefono = new String[] {""} ;
      T00096_n335Cuen_Telefono = new boolean[] {false} ;
      T00096_A336Cuen_Email = new String[] {""} ;
      T00096_n336Cuen_Email = new boolean[] {false} ;
      T00096_A42Tpte_Codigo = new String[] {""} ;
      T00096_A1Cent_Id = new long[1] ;
      T00096_A2Regi_Id = new long[1] ;
      T000919_A43Cuen_Identificacion = new long[1] ;
      T000919_n43Cuen_Identificacion = new boolean[] {false} ;
      T000920_A43Cuen_Identificacion = new long[1] ;
      T000920_n43Cuen_Identificacion = new boolean[] {false} ;
      T00095_A43Cuen_Identificacion = new long[1] ;
      T00095_n43Cuen_Identificacion = new boolean[] {false} ;
      T00095_A44Cuen_Nombre = new String[] {""} ;
      T00095_n44Cuen_Nombre = new boolean[] {false} ;
      T00095_A688Cuen_Cedula = new long[1] ;
      T00095_A337Cuen_UsuarioCrea = new String[] {""} ;
      T00095_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00095_A339Cuen_UsuarioModifica = new String[] {""} ;
      T00095_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      T00095_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00095_n340Cuen_FechaModifica = new boolean[] {false} ;
      T00095_A326Cuen_DigitoVerificacion = new byte[1] ;
      T00095_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      T00095_A331Cuen_PrimerNombre = new String[] {""} ;
      T00095_n331Cuen_PrimerNombre = new boolean[] {false} ;
      T00095_A332Cuen_SegundoNombre = new String[] {""} ;
      T00095_n332Cuen_SegundoNombre = new boolean[] {false} ;
      T00095_A329Cuen_PrimerApellido = new String[] {""} ;
      T00095_n329Cuen_PrimerApellido = new boolean[] {false} ;
      T00095_A330Cuen_SegundoApellido = new String[] {""} ;
      T00095_n330Cuen_SegundoApellido = new boolean[] {false} ;
      T00095_A328Cuen_Clase = new String[] {""} ;
      T00095_n328Cuen_Clase = new boolean[] {false} ;
      T00095_A333Cuen_Estado = new String[] {""} ;
      T00095_n333Cuen_Estado = new boolean[] {false} ;
      T00095_A334Cuen_Direccion = new String[] {""} ;
      T00095_n334Cuen_Direccion = new boolean[] {false} ;
      T00095_A335Cuen_Telefono = new String[] {""} ;
      T00095_n335Cuen_Telefono = new boolean[] {false} ;
      T00095_A336Cuen_Email = new String[] {""} ;
      T00095_n336Cuen_Email = new boolean[] {false} ;
      T00095_A42Tpte_Codigo = new String[] {""} ;
      T00095_A1Cent_Id = new long[1] ;
      T00095_A2Regi_Id = new long[1] ;
      T000922_A43Cuen_Identificacion = new long[1] ;
      T000922_n43Cuen_Identificacion = new boolean[] {false} ;
      T000925_A3Cent_Codigo = new String[] {""} ;
      T000925_A4Cent_Descripcion = new String[] {""} ;
      T000925_A2Regi_Id = new long[1] ;
      T000926_A12Regi_Cod = new short[1] ;
      T000926_A13Regi_Descripcion = new String[] {""} ;
      T000926_A5Ciud_Codigo = new short[1] ;
      T000927_A7Ciud_Descripcion = new String[] {""} ;
      T000927_A6Dept_Codigo = new short[1] ;
      T000928_A10Dept_Descripcion = new String[] {""} ;
      T000929_A321Tpte_Descripcion = new String[] {""} ;
      T000930_A46Tran_Id = new long[1] ;
      T000931_A46Tran_Id = new long[1] ;
      T000932_A46Tran_Id = new long[1] ;
      T000933_A46Tran_Id = new long[1] ;
      T000934_A66Elem_Consecutivo = new String[] {""} ;
      T000934_A67Invd_NumeroPlaca = new String[] {""} ;
      T000935_A43Cuen_Identificacion = new long[1] ;
      T000935_n43Cuen_Identificacion = new boolean[] {false} ;
      T000935_A45Cuen_Identificacion_Multi = new long[1] ;
      T000936_A1Cent_Id = new long[1] ;
      T000936_A27Alma_Modulo = new String[] {""} ;
      T000936_A28Alma_Codigo = new String[] {""} ;
      T000937_A43Cuen_Identificacion = new long[1] ;
      T000937_n43Cuen_Identificacion = new boolean[] {false} ;
      Z690Cuen_Nombre_Multi = "" ;
      T000938_A43Cuen_Identificacion = new long[1] ;
      T000938_n43Cuen_Identificacion = new boolean[] {false} ;
      T000938_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000938_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000938_A691Cuen_Cedula_Multi = new long[1] ;
      T000938_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000938_A692Cuen_Multi_Estado = new String[] {""} ;
      T000938_A45Cuen_Identificacion_Multi = new long[1] ;
      T00094_A690Cuen_Nombre_Multi = new String[] {""} ;
      T00094_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T00094_A691Cuen_Cedula_Multi = new long[1] ;
      T00094_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000939_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000939_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000939_A691Cuen_Cedula_Multi = new long[1] ;
      T000939_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000940_A43Cuen_Identificacion = new long[1] ;
      T000940_n43Cuen_Identificacion = new boolean[] {false} ;
      T000940_A45Cuen_Identificacion_Multi = new long[1] ;
      T00093_A43Cuen_Identificacion = new long[1] ;
      T00093_n43Cuen_Identificacion = new boolean[] {false} ;
      T00093_A692Cuen_Multi_Estado = new String[] {""} ;
      T00093_A45Cuen_Identificacion_Multi = new long[1] ;
      T00092_A43Cuen_Identificacion = new long[1] ;
      T00092_n43Cuen_Identificacion = new boolean[] {false} ;
      T00092_A692Cuen_Multi_Estado = new String[] {""} ;
      T00092_A45Cuen_Identificacion_Multi = new long[1] ;
      T000944_A690Cuen_Nombre_Multi = new String[] {""} ;
      T000944_n690Cuen_Nombre_Multi = new boolean[] {false} ;
      T000944_A691Cuen_Cedula_Multi = new long[1] ;
      T000944_n691Cuen_Cedula_Multi = new boolean[] {false} ;
      T000945_A43Cuen_Identificacion = new long[1] ;
      T000945_n43Cuen_Identificacion = new boolean[] {false} ;
      T000945_A45Cuen_Identificacion_Multi = new long[1] ;
      Gridalm_cuentadante_multi_multipleRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_cuentadante_multi_multiple_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int2 = new long [1] ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cuentadante_multi__default(),
         new Object[] {
             new Object[] {
            T00092_A43Cuen_Identificacion, T00092_A692Cuen_Multi_Estado, T00092_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T00093_A43Cuen_Identificacion, T00093_A692Cuen_Multi_Estado, T00093_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T00094_A690Cuen_Nombre_Multi, T00094_n690Cuen_Nombre_Multi, T00094_A691Cuen_Cedula_Multi, T00094_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T00095_A43Cuen_Identificacion, T00095_A44Cuen_Nombre, T00095_n44Cuen_Nombre, T00095_A688Cuen_Cedula, T00095_A337Cuen_UsuarioCrea, T00095_A338Cuen_FechaCrea, T00095_A339Cuen_UsuarioModifica, T00095_n339Cuen_UsuarioModifica, T00095_A340Cuen_FechaModifica, T00095_n340Cuen_FechaModifica,
            T00095_A326Cuen_DigitoVerificacion, T00095_n326Cuen_DigitoVerificacion, T00095_A331Cuen_PrimerNombre, T00095_n331Cuen_PrimerNombre, T00095_A332Cuen_SegundoNombre, T00095_n332Cuen_SegundoNombre, T00095_A329Cuen_PrimerApellido, T00095_n329Cuen_PrimerApellido, T00095_A330Cuen_SegundoApellido, T00095_n330Cuen_SegundoApellido,
            T00095_A328Cuen_Clase, T00095_n328Cuen_Clase, T00095_A333Cuen_Estado, T00095_n333Cuen_Estado, T00095_A334Cuen_Direccion, T00095_n334Cuen_Direccion, T00095_A335Cuen_Telefono, T00095_n335Cuen_Telefono, T00095_A336Cuen_Email, T00095_n336Cuen_Email,
            T00095_A42Tpte_Codigo, T00095_A1Cent_Id, T00095_A2Regi_Id
            }
            , new Object[] {
            T00096_A43Cuen_Identificacion, T00096_A44Cuen_Nombre, T00096_n44Cuen_Nombre, T00096_A688Cuen_Cedula, T00096_A337Cuen_UsuarioCrea, T00096_A338Cuen_FechaCrea, T00096_A339Cuen_UsuarioModifica, T00096_n339Cuen_UsuarioModifica, T00096_A340Cuen_FechaModifica, T00096_n340Cuen_FechaModifica,
            T00096_A326Cuen_DigitoVerificacion, T00096_n326Cuen_DigitoVerificacion, T00096_A331Cuen_PrimerNombre, T00096_n331Cuen_PrimerNombre, T00096_A332Cuen_SegundoNombre, T00096_n332Cuen_SegundoNombre, T00096_A329Cuen_PrimerApellido, T00096_n329Cuen_PrimerApellido, T00096_A330Cuen_SegundoApellido, T00096_n330Cuen_SegundoApellido,
            T00096_A328Cuen_Clase, T00096_n328Cuen_Clase, T00096_A333Cuen_Estado, T00096_n333Cuen_Estado, T00096_A334Cuen_Direccion, T00096_n334Cuen_Direccion, T00096_A335Cuen_Telefono, T00096_n335Cuen_Telefono, T00096_A336Cuen_Email, T00096_n336Cuen_Email,
            T00096_A42Tpte_Codigo, T00096_A1Cent_Id, T00096_A2Regi_Id
            }
            , new Object[] {
            T00097_A321Tpte_Descripcion
            }
            , new Object[] {
            T00098_A3Cent_Codigo, T00098_A4Cent_Descripcion, T00098_A2Regi_Id
            }
            , new Object[] {
            T00099_A12Regi_Cod, T00099_A13Regi_Descripcion, T00099_A5Ciud_Codigo
            }
            , new Object[] {
            T000910_A7Ciud_Descripcion, T000910_A6Dept_Codigo
            }
            , new Object[] {
            T000911_A10Dept_Descripcion
            }
            , new Object[] {
            T000912_A43Cuen_Identificacion, T000912_A44Cuen_Nombre, T000912_n44Cuen_Nombre, T000912_A688Cuen_Cedula, T000912_A337Cuen_UsuarioCrea, T000912_A338Cuen_FechaCrea, T000912_A339Cuen_UsuarioModifica, T000912_n339Cuen_UsuarioModifica, T000912_A340Cuen_FechaModifica, T000912_n340Cuen_FechaModifica,
            T000912_A326Cuen_DigitoVerificacion, T000912_n326Cuen_DigitoVerificacion, T000912_A331Cuen_PrimerNombre, T000912_n331Cuen_PrimerNombre, T000912_A332Cuen_SegundoNombre, T000912_n332Cuen_SegundoNombre, T000912_A329Cuen_PrimerApellido, T000912_n329Cuen_PrimerApellido, T000912_A330Cuen_SegundoApellido, T000912_n330Cuen_SegundoApellido,
            T000912_A321Tpte_Descripcion, T000912_A328Cuen_Clase, T000912_n328Cuen_Clase, T000912_A333Cuen_Estado, T000912_n333Cuen_Estado, T000912_A334Cuen_Direccion, T000912_n334Cuen_Direccion, T000912_A335Cuen_Telefono, T000912_n335Cuen_Telefono, T000912_A336Cuen_Email,
            T000912_n336Cuen_Email, T000912_A7Ciud_Descripcion, T000912_A10Dept_Descripcion, T000912_A3Cent_Codigo, T000912_A4Cent_Descripcion, T000912_A2Regi_Id, T000912_A12Regi_Cod, T000912_A13Regi_Descripcion, T000912_A42Tpte_Codigo, T000912_A1Cent_Id,
            T000912_A5Ciud_Codigo, T000912_A6Dept_Codigo
            }
            , new Object[] {
            T000913_A3Cent_Codigo, T000913_A4Cent_Descripcion, T000913_A2Regi_Id
            }
            , new Object[] {
            T000914_A12Regi_Cod, T000914_A13Regi_Descripcion, T000914_A5Ciud_Codigo
            }
            , new Object[] {
            T000915_A7Ciud_Descripcion, T000915_A6Dept_Codigo
            }
            , new Object[] {
            T000916_A10Dept_Descripcion
            }
            , new Object[] {
            T000917_A321Tpte_Descripcion
            }
            , new Object[] {
            T000918_A43Cuen_Identificacion
            }
            , new Object[] {
            T000919_A43Cuen_Identificacion
            }
            , new Object[] {
            T000920_A43Cuen_Identificacion
            }
            , new Object[] {
            }
            , new Object[] {
            T000922_A43Cuen_Identificacion
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000925_A3Cent_Codigo, T000925_A4Cent_Descripcion, T000925_A2Regi_Id
            }
            , new Object[] {
            T000926_A12Regi_Cod, T000926_A13Regi_Descripcion, T000926_A5Ciud_Codigo
            }
            , new Object[] {
            T000927_A7Ciud_Descripcion, T000927_A6Dept_Codigo
            }
            , new Object[] {
            T000928_A10Dept_Descripcion
            }
            , new Object[] {
            T000929_A321Tpte_Descripcion
            }
            , new Object[] {
            T000930_A46Tran_Id
            }
            , new Object[] {
            T000931_A46Tran_Id
            }
            , new Object[] {
            T000932_A46Tran_Id
            }
            , new Object[] {
            T000933_A46Tran_Id
            }
            , new Object[] {
            T000934_A66Elem_Consecutivo, T000934_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000935_A43Cuen_Identificacion, T000935_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T000936_A1Cent_Id, T000936_A27Alma_Modulo, T000936_A28Alma_Codigo
            }
            , new Object[] {
            T000937_A43Cuen_Identificacion
            }
            , new Object[] {
            T000938_A43Cuen_Identificacion, T000938_A690Cuen_Nombre_Multi, T000938_n690Cuen_Nombre_Multi, T000938_A691Cuen_Cedula_Multi, T000938_n691Cuen_Cedula_Multi, T000938_A692Cuen_Multi_Estado, T000938_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            T000939_A690Cuen_Nombre_Multi, T000939_n690Cuen_Nombre_Multi, T000939_A691Cuen_Cedula_Multi, T000939_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T000940_A43Cuen_Identificacion, T000940_A45Cuen_Identificacion_Multi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000944_A690Cuen_Nombre_Multi, T000944_n690Cuen_Nombre_Multi, T000944_A691Cuen_Cedula_Multi, T000944_n691Cuen_Cedula_Multi
            }
            , new Object[] {
            T000945_A43Cuen_Identificacion, T000945_A45Cuen_Identificacion_Multi
            }
         }
      );
      AV17Pgmname = "ALM_CUENTADANTE_MULTI" ;
   }

   private byte Z326Cuen_DigitoVerificacion ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_cuentadante_multi_multiple_Backcolorstyle ;
   private byte subGridalm_cuentadante_multi_multiple_Allowselection ;
   private byte subGridalm_cuentadante_multi_multiple_Allowhovering ;
   private byte subGridalm_cuentadante_multi_multiple_Allowcollapsing ;
   private byte subGridalm_cuentadante_multi_multiple_Collapsed ;
   private byte A326Cuen_DigitoVerificacion ;
   private byte Gx_BScreen ;
   private byte subGridalm_cuentadante_multi_multiple_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_11 ;
   private short nRC_GXsfl_98 ;
   private short nGXsfl_98_idx=1 ;
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
   private int edtCuen_PrimerApellido_Enabled ;
   private int edtCuen_SegundoApellido_Enabled ;
   private int edtCuen_PrimerNombre_Enabled ;
   private int edtCuen_SegundoNombre_Enabled ;
   private int edtCuen_Nombre_Enabled ;
   private int edtCuen_Cedula_Enabled ;
   private int edtCuen_Cedula_Visible ;
   private int edtCuen_Direccion_Enabled ;
   private int edtCuen_Telefono_Enabled ;
   private int edtCuen_Email_Enabled ;
   private int edtCent_Id_Enabled ;
   private int imgprompt_1_Visible ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Id_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtCuen_Identificacion_Multi_Enabled ;
   private int edtCuen_Cedula_Multi_Enabled ;
   private int edtCuen_Nombre_Multi_Enabled ;
   private int subGridalm_cuentadante_multi_multiple_Selectioncolor ;
   private int subGridalm_cuentadante_multi_multiple_Hoveringcolor ;
   private int fRowAdded ;
   private int AV18GXV1 ;
   private int GX_JID ;
   private int subGridalm_cuentadante_multi_multiple_Backcolor ;
   private int subGridalm_cuentadante_multi_multiple_Allbackcolor ;
   private int imgprompt_45_Visible ;
   private int defedtCuen_Identificacion_Multi_Enabled ;
   private int idxLst ;
   private long wcpOAV14Cuen_Identificacion ;
   private long Z43Cuen_Identificacion ;
   private long Z688Cuen_Cedula ;
   private long Z1Cent_Id ;
   private long N1Cent_Id ;
   private long Z45Cuen_Identificacion_Multi ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long A45Cuen_Identificacion_Multi ;
   private long AV14Cuen_Identificacion ;
   private long A688Cuen_Cedula ;
   private long A691Cuen_Cedula_Multi ;
   private long A43Cuen_Identificacion ;
   private long AV15Insert_Cent_Id ;
   private long GRIDALM_CUENTADANTE_MULTI_MULTIPLE_nFirstRecordOnPage ;
   private long Z2Regi_Id ;
   private long Z691Cuen_Cedula_Multi ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private String sPrefix ;
   private String sGXsfl_98_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z333Cuen_Estado ;
   private String Z42Tpte_Codigo ;
   private String N42Tpte_Codigo ;
   private String Z692Cuen_Multi_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A42Tpte_Codigo ;
   private String GXKey ;
   private String A333Cuen_Estado ;
   private String GXCCtl ;
   private String A692Cuen_Multi_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCuen_PrimerApellido_Internalname ;
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
   private String edtCuen_PrimerApellido_Jsonclick ;
   private String edtCuen_SegundoApellido_Internalname ;
   private String edtCuen_SegundoApellido_Jsonclick ;
   private String edtCuen_PrimerNombre_Internalname ;
   private String edtCuen_PrimerNombre_Jsonclick ;
   private String edtCuen_SegundoNombre_Internalname ;
   private String edtCuen_SegundoNombre_Jsonclick ;
   private String edtCuen_Nombre_Internalname ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_Direccion_Internalname ;
   private String edtCuen_Telefono_Internalname ;
   private String edtCuen_Telefono_Jsonclick ;
   private String edtCuen_Email_Internalname ;
   private String edtCuen_Email_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
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
   private String edtCuen_Cedula_Multi_Internalname ;
   private String edtCuen_Nombre_Multi_Internalname ;
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
   private String sGXsfl_98_fel_idx="0001" ;
   private String subGridalm_cuentadante_multi_multiple_Class ;
   private String subGridalm_cuentadante_multi_multiple_Linesclass ;
   private String imgprompt_45_Link ;
   private String ROClassString ;
   private String edtCuen_Identificacion_Multi_Jsonclick ;
   private String edtCuen_Cedula_Multi_Jsonclick ;
   private String edtCuen_Nombre_Multi_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_cuentadante_multi_multiple_Internalname ;
   private java.util.Date Z338Cuen_FechaCrea ;
   private java.util.Date Z340Cuen_FechaModifica ;
   private java.util.Date A340Cuen_FechaModifica ;
   private java.util.Date A338Cuen_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n333Cuen_Estado ;
   private boolean wbErr ;
   private boolean bGXsfl_98_Refreshing=false ;
   private boolean n329Cuen_PrimerApellido ;
   private boolean n330Cuen_SegundoApellido ;
   private boolean n331Cuen_PrimerNombre ;
   private boolean n332Cuen_SegundoNombre ;
   private boolean n44Cuen_Nombre ;
   private boolean n334Cuen_Direccion ;
   private boolean n335Cuen_Telefono ;
   private boolean n336Cuen_Email ;
   private boolean n339Cuen_UsuarioModifica ;
   private boolean n340Cuen_FechaModifica ;
   private boolean n326Cuen_DigitoVerificacion ;
   private boolean n328Cuen_Clase ;
   private boolean n43Cuen_Identificacion ;
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
   private String A329Cuen_PrimerApellido ;
   private String A330Cuen_SegundoApellido ;
   private String A331Cuen_PrimerNombre ;
   private String A332Cuen_SegundoNombre ;
   private String A44Cuen_Nombre ;
   private String A334Cuen_Direccion ;
   private String A335Cuen_Telefono ;
   private String A336Cuen_Email ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A690Cuen_Nombre_Multi ;
   private String A339Cuen_UsuarioModifica ;
   private String A328Cuen_Clase ;
   private String A337Cuen_UsuarioCrea ;
   private String AV16Usuario ;
   private String A321Tpte_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String Z321Tpte_Descripcion ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private String Z13Regi_Descripcion ;
   private String Z7Ciud_Descripcion ;
   private String Z10Dept_Descripcion ;
   private String Z690Cuen_Nombre_Multi ;
   private com.genexus.webpanels.GXWebGrid Gridalm_cuentadante_multi_multipleContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_cuentadante_multi_multipleRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_cuentadante_multi_multipleColumn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbCuen_Estado ;
   private HTMLChoice cmbCuen_Multi_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00098_A3Cent_Codigo ;
   private String[] T00098_A4Cent_Descripcion ;
   private long[] T00098_A2Regi_Id ;
   private short[] T00099_A12Regi_Cod ;
   private String[] T00099_A13Regi_Descripcion ;
   private short[] T00099_A5Ciud_Codigo ;
   private String[] T000910_A7Ciud_Descripcion ;
   private short[] T000910_A6Dept_Codigo ;
   private String[] T000911_A10Dept_Descripcion ;
   private String[] T00097_A321Tpte_Descripcion ;
   private long[] T000912_A43Cuen_Identificacion ;
   private boolean[] T000912_n43Cuen_Identificacion ;
   private String[] T000912_A44Cuen_Nombre ;
   private boolean[] T000912_n44Cuen_Nombre ;
   private long[] T000912_A688Cuen_Cedula ;
   private String[] T000912_A337Cuen_UsuarioCrea ;
   private java.util.Date[] T000912_A338Cuen_FechaCrea ;
   private String[] T000912_A339Cuen_UsuarioModifica ;
   private boolean[] T000912_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T000912_A340Cuen_FechaModifica ;
   private boolean[] T000912_n340Cuen_FechaModifica ;
   private byte[] T000912_A326Cuen_DigitoVerificacion ;
   private boolean[] T000912_n326Cuen_DigitoVerificacion ;
   private String[] T000912_A331Cuen_PrimerNombre ;
   private boolean[] T000912_n331Cuen_PrimerNombre ;
   private String[] T000912_A332Cuen_SegundoNombre ;
   private boolean[] T000912_n332Cuen_SegundoNombre ;
   private String[] T000912_A329Cuen_PrimerApellido ;
   private boolean[] T000912_n329Cuen_PrimerApellido ;
   private String[] T000912_A330Cuen_SegundoApellido ;
   private boolean[] T000912_n330Cuen_SegundoApellido ;
   private String[] T000912_A321Tpte_Descripcion ;
   private String[] T000912_A328Cuen_Clase ;
   private boolean[] T000912_n328Cuen_Clase ;
   private String[] T000912_A333Cuen_Estado ;
   private boolean[] T000912_n333Cuen_Estado ;
   private String[] T000912_A334Cuen_Direccion ;
   private boolean[] T000912_n334Cuen_Direccion ;
   private String[] T000912_A335Cuen_Telefono ;
   private boolean[] T000912_n335Cuen_Telefono ;
   private String[] T000912_A336Cuen_Email ;
   private boolean[] T000912_n336Cuen_Email ;
   private String[] T000912_A7Ciud_Descripcion ;
   private String[] T000912_A10Dept_Descripcion ;
   private String[] T000912_A3Cent_Codigo ;
   private String[] T000912_A4Cent_Descripcion ;
   private long[] T000912_A2Regi_Id ;
   private short[] T000912_A12Regi_Cod ;
   private String[] T000912_A13Regi_Descripcion ;
   private String[] T000912_A42Tpte_Codigo ;
   private long[] T000912_A1Cent_Id ;
   private short[] T000912_A5Ciud_Codigo ;
   private short[] T000912_A6Dept_Codigo ;
   private String[] T000913_A3Cent_Codigo ;
   private String[] T000913_A4Cent_Descripcion ;
   private long[] T000913_A2Regi_Id ;
   private short[] T000914_A12Regi_Cod ;
   private String[] T000914_A13Regi_Descripcion ;
   private short[] T000914_A5Ciud_Codigo ;
   private String[] T000915_A7Ciud_Descripcion ;
   private short[] T000915_A6Dept_Codigo ;
   private String[] T000916_A10Dept_Descripcion ;
   private String[] T000917_A321Tpte_Descripcion ;
   private long[] T000918_A43Cuen_Identificacion ;
   private boolean[] T000918_n43Cuen_Identificacion ;
   private long[] T00096_A43Cuen_Identificacion ;
   private boolean[] T00096_n43Cuen_Identificacion ;
   private String[] T00096_A44Cuen_Nombre ;
   private boolean[] T00096_n44Cuen_Nombre ;
   private long[] T00096_A688Cuen_Cedula ;
   private String[] T00096_A337Cuen_UsuarioCrea ;
   private java.util.Date[] T00096_A338Cuen_FechaCrea ;
   private String[] T00096_A339Cuen_UsuarioModifica ;
   private boolean[] T00096_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T00096_A340Cuen_FechaModifica ;
   private boolean[] T00096_n340Cuen_FechaModifica ;
   private byte[] T00096_A326Cuen_DigitoVerificacion ;
   private boolean[] T00096_n326Cuen_DigitoVerificacion ;
   private String[] T00096_A331Cuen_PrimerNombre ;
   private boolean[] T00096_n331Cuen_PrimerNombre ;
   private String[] T00096_A332Cuen_SegundoNombre ;
   private boolean[] T00096_n332Cuen_SegundoNombre ;
   private String[] T00096_A329Cuen_PrimerApellido ;
   private boolean[] T00096_n329Cuen_PrimerApellido ;
   private String[] T00096_A330Cuen_SegundoApellido ;
   private boolean[] T00096_n330Cuen_SegundoApellido ;
   private String[] T00096_A328Cuen_Clase ;
   private boolean[] T00096_n328Cuen_Clase ;
   private String[] T00096_A333Cuen_Estado ;
   private boolean[] T00096_n333Cuen_Estado ;
   private String[] T00096_A334Cuen_Direccion ;
   private boolean[] T00096_n334Cuen_Direccion ;
   private String[] T00096_A335Cuen_Telefono ;
   private boolean[] T00096_n335Cuen_Telefono ;
   private String[] T00096_A336Cuen_Email ;
   private boolean[] T00096_n336Cuen_Email ;
   private String[] T00096_A42Tpte_Codigo ;
   private long[] T00096_A1Cent_Id ;
   private long[] T00096_A2Regi_Id ;
   private long[] T000919_A43Cuen_Identificacion ;
   private boolean[] T000919_n43Cuen_Identificacion ;
   private long[] T000920_A43Cuen_Identificacion ;
   private boolean[] T000920_n43Cuen_Identificacion ;
   private long[] T00095_A43Cuen_Identificacion ;
   private boolean[] T00095_n43Cuen_Identificacion ;
   private String[] T00095_A44Cuen_Nombre ;
   private boolean[] T00095_n44Cuen_Nombre ;
   private long[] T00095_A688Cuen_Cedula ;
   private String[] T00095_A337Cuen_UsuarioCrea ;
   private java.util.Date[] T00095_A338Cuen_FechaCrea ;
   private String[] T00095_A339Cuen_UsuarioModifica ;
   private boolean[] T00095_n339Cuen_UsuarioModifica ;
   private java.util.Date[] T00095_A340Cuen_FechaModifica ;
   private boolean[] T00095_n340Cuen_FechaModifica ;
   private byte[] T00095_A326Cuen_DigitoVerificacion ;
   private boolean[] T00095_n326Cuen_DigitoVerificacion ;
   private String[] T00095_A331Cuen_PrimerNombre ;
   private boolean[] T00095_n331Cuen_PrimerNombre ;
   private String[] T00095_A332Cuen_SegundoNombre ;
   private boolean[] T00095_n332Cuen_SegundoNombre ;
   private String[] T00095_A329Cuen_PrimerApellido ;
   private boolean[] T00095_n329Cuen_PrimerApellido ;
   private String[] T00095_A330Cuen_SegundoApellido ;
   private boolean[] T00095_n330Cuen_SegundoApellido ;
   private String[] T00095_A328Cuen_Clase ;
   private boolean[] T00095_n328Cuen_Clase ;
   private String[] T00095_A333Cuen_Estado ;
   private boolean[] T00095_n333Cuen_Estado ;
   private String[] T00095_A334Cuen_Direccion ;
   private boolean[] T00095_n334Cuen_Direccion ;
   private String[] T00095_A335Cuen_Telefono ;
   private boolean[] T00095_n335Cuen_Telefono ;
   private String[] T00095_A336Cuen_Email ;
   private boolean[] T00095_n336Cuen_Email ;
   private String[] T00095_A42Tpte_Codigo ;
   private long[] T00095_A1Cent_Id ;
   private long[] T00095_A2Regi_Id ;
   private long[] T000922_A43Cuen_Identificacion ;
   private boolean[] T000922_n43Cuen_Identificacion ;
   private String[] T000925_A3Cent_Codigo ;
   private String[] T000925_A4Cent_Descripcion ;
   private long[] T000925_A2Regi_Id ;
   private short[] T000926_A12Regi_Cod ;
   private String[] T000926_A13Regi_Descripcion ;
   private short[] T000926_A5Ciud_Codigo ;
   private String[] T000927_A7Ciud_Descripcion ;
   private short[] T000927_A6Dept_Codigo ;
   private String[] T000928_A10Dept_Descripcion ;
   private String[] T000929_A321Tpte_Descripcion ;
   private long[] T000930_A46Tran_Id ;
   private long[] T000931_A46Tran_Id ;
   private long[] T000932_A46Tran_Id ;
   private long[] T000933_A46Tran_Id ;
   private String[] T000934_A66Elem_Consecutivo ;
   private String[] T000934_A67Invd_NumeroPlaca ;
   private long[] T000935_A43Cuen_Identificacion ;
   private boolean[] T000935_n43Cuen_Identificacion ;
   private long[] T000935_A45Cuen_Identificacion_Multi ;
   private long[] T000936_A1Cent_Id ;
   private String[] T000936_A27Alma_Modulo ;
   private String[] T000936_A28Alma_Codigo ;
   private long[] T000937_A43Cuen_Identificacion ;
   private boolean[] T000937_n43Cuen_Identificacion ;
   private long[] T000938_A43Cuen_Identificacion ;
   private boolean[] T000938_n43Cuen_Identificacion ;
   private String[] T000938_A690Cuen_Nombre_Multi ;
   private boolean[] T000938_n690Cuen_Nombre_Multi ;
   private long[] T000938_A691Cuen_Cedula_Multi ;
   private boolean[] T000938_n691Cuen_Cedula_Multi ;
   private String[] T000938_A692Cuen_Multi_Estado ;
   private long[] T000938_A45Cuen_Identificacion_Multi ;
   private String[] T00094_A690Cuen_Nombre_Multi ;
   private boolean[] T00094_n690Cuen_Nombre_Multi ;
   private long[] T00094_A691Cuen_Cedula_Multi ;
   private boolean[] T00094_n691Cuen_Cedula_Multi ;
   private String[] T000939_A690Cuen_Nombre_Multi ;
   private boolean[] T000939_n690Cuen_Nombre_Multi ;
   private long[] T000939_A691Cuen_Cedula_Multi ;
   private boolean[] T000939_n691Cuen_Cedula_Multi ;
   private long[] T000940_A43Cuen_Identificacion ;
   private boolean[] T000940_n43Cuen_Identificacion ;
   private long[] T000940_A45Cuen_Identificacion_Multi ;
   private long[] T00093_A43Cuen_Identificacion ;
   private boolean[] T00093_n43Cuen_Identificacion ;
   private String[] T00093_A692Cuen_Multi_Estado ;
   private long[] T00093_A45Cuen_Identificacion_Multi ;
   private long[] T00092_A43Cuen_Identificacion ;
   private boolean[] T00092_n43Cuen_Identificacion ;
   private String[] T00092_A692Cuen_Multi_Estado ;
   private long[] T00092_A45Cuen_Identificacion_Multi ;
   private String[] T000944_A690Cuen_Nombre_Multi ;
   private boolean[] T000944_n690Cuen_Nombre_Multi ;
   private long[] T000944_A691Cuen_Cedula_Multi ;
   private boolean[] T000944_n691Cuen_Cedula_Multi ;
   private long[] T000945_A43Cuen_Identificacion ;
   private boolean[] T000945_n43Cuen_Identificacion ;
   private long[] T000945_A45Cuen_Identificacion_Multi ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class alm_cuentadante_multi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00092", "SELECT Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?  FOR UPDATE OF Cuen_Multi_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00093", "SELECT Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00094", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00095", "SELECT Cuen_Identificacion, Cuen_Nombre, Cuen_Cedula, Cuen_UsuarioCrea, Cuen_FechaCrea, Cuen_UsuarioModifica, Cuen_FechaModifica, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ?  FOR UPDATE OF Cuen_Nombre, Cuen_Cedula, Cuen_UsuarioCrea, Cuen_FechaCrea, Cuen_UsuarioModifica, Cuen_FechaModifica, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00096", "SELECT Cuen_Identificacion, Cuen_Nombre, Cuen_Cedula, Cuen_UsuarioCrea, Cuen_FechaCrea, Cuen_UsuarioModifica, Cuen_FechaModifica, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id, Regi_Id FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00097", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00098", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00099", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000910", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000911", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000912", "SELECT /*+ FIRST_ROWS(100) */ TM1.Cuen_Identificacion, TM1.Cuen_Nombre, TM1.Cuen_Cedula, TM1.Cuen_UsuarioCrea, TM1.Cuen_FechaCrea, TM1.Cuen_UsuarioModifica, TM1.Cuen_FechaModifica, TM1.Cuen_DigitoVerificacion, TM1.Cuen_PrimerNombre, TM1.Cuen_SegundoNombre, TM1.Cuen_PrimerApellido, TM1.Cuen_SegundoApellido, T2.Tpte_Descripcion, TM1.Cuen_Clase, TM1.Cuen_Estado, TM1.Cuen_Direccion, TM1.Cuen_Telefono, TM1.Cuen_Email, T5.Ciud_Descripcion, T6.Dept_Descripcion, T3.Cent_Codigo, T3.Cent_Descripcion, TM1.Regi_Id, T4.Regi_Cod, T4.Regi_Descripcion, TM1.Tpte_Codigo, TM1.Cent_Id, T4.Ciud_Codigo, T5.Dept_Codigo FROM (((((ALM_CUENTADANTE TM1 INNER JOIN ALM_TIPO_TERCERO T2 ON T2.Tpte_Codigo = TM1.Tpte_Codigo) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = TM1.Cent_Id) INNER JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T3.Regi_Id) INNER JOIN GEN_CIUDAD T5 ON T5.Ciud_Codigo = T4.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T6 ON T6.Dept_Codigo = T5.Dept_Codigo) WHERE TM1.Cuen_Identificacion = ? ORDER BY TM1.Cuen_Identificacion ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000913", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000914", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000915", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000916", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000917", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000918", "SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000919", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE ( Cuen_Identificacion > ?) ORDER BY Cuen_Identificacion) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000920", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cuen_Identificacion FROM ALM_CUENTADANTE WHERE ( Cuen_Identificacion < ?) ORDER BY Cuen_Identificacion DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000921", "INSERT INTO ALM_CUENTADANTE(Regi_Id, Cuen_Nombre, Cuen_Cedula, Cuen_UsuarioCrea, Cuen_FechaCrea, Cuen_UsuarioModifica, Cuen_FechaModifica, Cuen_DigitoVerificacion, Cuen_PrimerNombre, Cuen_SegundoNombre, Cuen_PrimerApellido, Cuen_SegundoApellido, Cuen_Clase, Cuen_Estado, Cuen_Direccion, Cuen_Telefono, Cuen_Email, Tpte_Codigo, Cent_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CUENTADANTE")
         ,new ForEachCursor("T000922", "SELECT Cuen_Identificacion.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000923", "UPDATE ALM_CUENTADANTE SET Regi_Id=?, Cuen_Nombre=?, Cuen_Cedula=?, Cuen_UsuarioCrea=?, Cuen_FechaCrea=?, Cuen_UsuarioModifica=?, Cuen_FechaModifica=?, Cuen_DigitoVerificacion=?, Cuen_PrimerNombre=?, Cuen_SegundoNombre=?, Cuen_PrimerApellido=?, Cuen_SegundoApellido=?, Cuen_Clase=?, Cuen_Estado=?, Cuen_Direccion=?, Cuen_Telefono=?, Cuen_Email=?, Tpte_Codigo=?, Cent_Id=?  WHERE Cuen_Identificacion = ?", GX_NOMASK, "ALM_CUENTADANTE")
         ,new UpdateCursor("T000924", "DELETE FROM ALM_CUENTADANTE  WHERE Cuen_Identificacion = ?", GX_NOMASK, "ALM_CUENTADANTE")
         ,new ForEachCursor("T000925", "SELECT Cent_Codigo, Cent_Descripcion, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000926", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000927", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000928", "SELECT Dept_Descripcion FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000929", "SELECT Tpte_Descripcion FROM ALM_TIPO_TERCERO WHERE Tpte_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000930", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteResponsabili = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000931", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteDestino = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000932", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdProveedor = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000933", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_IdCuentadanteOrigen = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000934", "SELECT * FROM (SELECT Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Cuen_Identificacion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000935", "SELECT * FROM (SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion_Multi = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000936", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE Alma_IdResponsable = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000937", "SELECT /*+ FIRST_ROWS(100) */ Cuen_Identificacion FROM ALM_CUENTADANTE ORDER BY Cuen_Identificacion ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000938", "SELECT T1.Cuen_Identificacion, T2.Cuen_Nombre AS Cuen_Nombre_Multi, T2.Cuen_Cedula AS Cuen_Cedula_Multi, T1.Cuen_Multi_Estado, T1.Cuen_Identificacion_Multi AS Cuen_Identificacion_Multi FROM (ALM_CUENTADANTEMULTIPLE T1 INNER JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Cuen_Identificacion_Multi) WHERE T1.Cuen_Identificacion = ? and T1.Cuen_Identificacion_Multi = ? ORDER BY T1.Cuen_Identificacion, T1.Cuen_Identificacion_Multi ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000939", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000940", "SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000941", "INSERT INTO ALM_CUENTADANTEMULTIPLE(Cuen_Identificacion, Cuen_Multi_Estado, Cuen_Identificacion_Multi) VALUES(?, ?, ?)", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new UpdateCursor("T000942", "UPDATE ALM_CUENTADANTEMULTIPLE SET Cuen_Multi_Estado=?  WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new UpdateCursor("T000943", "DELETE FROM ALM_CUENTADANTEMULTIPLE  WHERE Cuen_Identificacion = ? AND Cuen_Identificacion_Multi = ?", GX_NOMASK, "ALM_CUENTADANTEMULTIPLE")
         ,new ForEachCursor("T000944", "SELECT Cuen_Nombre AS Cuen_Nombre_Multi, Cuen_Cedula AS Cuen_Cedula_Multi FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000945", "SELECT Cuen_Identificacion, Cuen_Identificacion_Multi FROM ALM_CUENTADANTEMULTIPLE WHERE Cuen_Identificacion = ? ORDER BY Cuen_Identificacion, Cuen_Identificacion_Multi ",true, GX_NOMASK, false, this,11,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 2);
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
               stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[4], 30, false);
               stmt.setDateTime(5, (java.util.Date)parms[5], false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
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
               stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[4], 30, false);
               stmt.setDateTime(5, (java.util.Date)parms[5], false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 26 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 2);
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

