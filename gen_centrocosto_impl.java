/*
               File: gen_centrocosto_impl
        Description: Centro de costo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:19.79
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

public final  class gen_centrocosto_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"REGI_ID") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaregi_id011( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A2Regi_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A5Ciud_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A6Dept_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A9Pais_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A9Pais_Codigo) ;
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
            AV14Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cent_Id", GXutil.ltrim( GXutil.str( AV14Cent_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Cent_Id), "ZZZZZZZZZZ9")));
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
      dynRegi_Id.setName( "REGI_ID" );
      dynRegi_Id.setWebtags( "" );
      cmbCent_Estado.setName( "CENT_ESTADO" );
      cmbCent_Estado.setWebtags( "" );
      cmbCent_Estado.addItem("A", "Activo", (short)(0));
      cmbCent_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbCent_Estado.getItemCount() > 0 )
      {
         A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
         n683Cent_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
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
         Form.getMeta().addItem("description", "Centro de costo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCent_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public gen_centrocosto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_centrocosto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_centrocosto_impl.class ));
   }

   public gen_centrocosto_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynRegi_Id = new HTMLChoice();
      cmbCent_Estado = new HTMLChoice();
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
      if ( dynRegi_Id.getItemCount() > 0 )
      {
         A2Regi_Id = GXutil.lval( dynRegi_Id.getValidValue(GXutil.trim( GXutil.str( A2Regi_Id, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
      if ( cmbCent_Estado.getItemCount() > 0 )
      {
         A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
         n683Cent_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Centro de costo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Id C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), ((edtCent_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", edtCent_Id_Visible, edtCent_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Cód C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Nit_Internalname, "Nit C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Nit_Internalname, GXutil.ltrim( localUtil.ntoc( A120Cent_Nit, (byte)(12), (byte)(0), ",", "")), ((edtCent_Nit_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Nit_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Nit_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion2_Internalname, "Descripcion 2", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion2_Internalname, A121Cent_Descripcion2, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion2_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion2_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_DescripcionLarga_Internalname, "Descripcion Larga", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_DescripcionLarga_Internalname, A125Cent_DescripcionLarga, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_DescripcionLarga_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_DescripcionLarga_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_EtCt_Internalname, "Et Ct", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_EtCt_Internalname, GXutil.ltrim( localUtil.ntoc( A117Cent_EtCt, (byte)(2), (byte)(0), ",", "")), ((edtCent_EtCt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_EtCt_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_EtCt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_TpoMay_Internalname, "Entidad ", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_TpoMay_Internalname, A118Cent_TpoMay, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_TpoMay_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_TpoMay_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynRegi_Id.getInternalname(), "Regional", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynRegi_Id, dynRegi_Id.getInternalname(), GXutil.trim( GXutil.str( A2Regi_Id, 11, 0)), 1, dynRegi_Id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynRegi_Id.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, "HLP_GEN_CENTROCOSTO.htm");
         dynRegi_Id.setValue( GXutil.trim( GXutil.str( A2Regi_Id, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynRegi_Id.getInternalname(), "Values", dynRegi_Id.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Codigo_Internalname, "Código Ciudad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtCiud_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCiud_Descripcion_Internalname, "Descripción Ciudad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Codigo_Internalname, "Código Departamento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Descripcion_Internalname, "Descripción Departamento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Codigo_Internalname, "Código del País", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Descripcion_Internalname, "Descripción del País", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Direccion_Internalname, "Dir.Centro de formación", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCent_Direccion_Internalname, A123Cent_Direccion, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A123Cent_Direccion), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtCent_Direccion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Resolucion_Internalname, "Resolución", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Resolucion_Internalname, A124Cent_Resolucion, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Resolucion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Resolucion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_NroDependenciaSIIF_Internalname, "Dependencia SIIF", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_NroDependenciaSIIF_Internalname, GXutil.ltrim( localUtil.ntoc( A126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ",", "")), ((edtCent_NroDependenciaSIIF_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_NroDependenciaSIIF_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_NroDependenciaSIIF_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbCent_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCent_Estado, cmbCent_Estado.getInternalname(), GXutil.rtrim( A683Cent_Estado), 1, cmbCent_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCent_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "", true, "HLP_GEN_CENTROCOSTO.htm");
         cmbCent_Estado.setValue( GXutil.rtrim( A683Cent_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCent_Estado.getInternalname(), "Values", cmbCent_Estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_CENTROCOSTO.htm");
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
      e11012 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Nit_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Nit_Internalname), ",", ".") > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENT_NIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_Nit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A120Cent_Nit = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
            }
            else
            {
               A120Cent_Nit = localUtil.ctol( httpContext.cgiGet( edtCent_Nit_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
            }
            A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
            A121Cent_Descripcion2 = httpContext.cgiGet( edtCent_Descripcion2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
            A125Cent_DescripcionLarga = httpContext.cgiGet( edtCent_DescripcionLarga_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_EtCt_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_EtCt_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENT_ETCT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_EtCt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A117Cent_EtCt = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
            }
            else
            {
               A117Cent_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtCent_EtCt_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
            }
            A118Cent_TpoMay = httpContext.cgiGet( edtCent_TpoMay_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A118Cent_TpoMay", A118Cent_TpoMay);
            dynRegi_Id.setValue( httpContext.cgiGet( dynRegi_Id.getInternalname()) );
            A2Regi_Id = GXutil.lval( httpContext.cgiGet( dynRegi_Id.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
            A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
            A123Cent_Direccion = httpContext.cgiGet( edtCent_Direccion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A123Cent_Direccion", A123Cent_Direccion);
            A124Cent_Resolucion = httpContext.cgiGet( edtCent_Resolucion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A124Cent_Resolucion", A124Cent_Resolucion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_NroDependenciaSIIF_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_NroDependenciaSIIF_Internalname), ",", ".") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENT_NRODEPENDENCIASIIF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_NroDependenciaSIIF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A126Cent_NroDependenciaSIIF = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
            }
            else
            {
               A126Cent_NroDependenciaSIIF = localUtil.ctol( httpContext.cgiGet( edtCent_NroDependenciaSIIF_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
            }
            cmbCent_Estado.setValue( httpContext.cgiGet( cmbCent_Estado.getInternalname()) );
            A683Cent_Estado = httpContext.cgiGet( cmbCent_Estado.getInternalname()) ;
            n683Cent_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
            n683Cent_Estado = ((GXutil.strcmp("", A683Cent_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z1Cent_Id = localUtil.ctol( httpContext.cgiGet( "Z1Cent_Id"), ",", ".") ;
            Z113Cent_UsuarioCrea = httpContext.cgiGet( "Z113Cent_UsuarioCrea") ;
            Z115Cent_UsuarioModifica = httpContext.cgiGet( "Z115Cent_UsuarioModifica") ;
            Z114Cent_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z114Cent_FechaCrea"), 0) ;
            Z116Cent_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z116Cent_FechaModifica"), 0) ;
            Z3Cent_Codigo = httpContext.cgiGet( "Z3Cent_Codigo") ;
            Z120Cent_Nit = localUtil.ctol( httpContext.cgiGet( "Z120Cent_Nit"), ",", ".") ;
            Z4Cent_Descripcion = httpContext.cgiGet( "Z4Cent_Descripcion") ;
            Z117Cent_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z117Cent_EtCt"), ",", ".")) ;
            Z118Cent_TpoMay = httpContext.cgiGet( "Z118Cent_TpoMay") ;
            Z121Cent_Descripcion2 = httpContext.cgiGet( "Z121Cent_Descripcion2") ;
            Z122Cent_Consecutivo = httpContext.cgiGet( "Z122Cent_Consecutivo") ;
            Z123Cent_Direccion = httpContext.cgiGet( "Z123Cent_Direccion") ;
            Z124Cent_Resolucion = httpContext.cgiGet( "Z124Cent_Resolucion") ;
            Z125Cent_DescripcionLarga = httpContext.cgiGet( "Z125Cent_DescripcionLarga") ;
            Z126Cent_NroDependenciaSIIF = localUtil.ctol( httpContext.cgiGet( "Z126Cent_NroDependenciaSIIF"), ",", ".") ;
            Z119Cent_Auxiliar = (int)(localUtil.ctol( httpContext.cgiGet( "Z119Cent_Auxiliar"), ",", ".")) ;
            Z526Cent_ConsePlaca = localUtil.ctol( httpContext.cgiGet( "Z526Cent_ConsePlaca"), ",", ".") ;
            Z694Cent_ConsMultiCedula = localUtil.ctol( httpContext.cgiGet( "Z694Cent_ConsMultiCedula"), ",", ".") ;
            Z683Cent_Estado = httpContext.cgiGet( "Z683Cent_Estado") ;
            n683Cent_Estado = ((GXutil.strcmp("", A683Cent_Estado)==0) ? true : false) ;
            Z2Regi_Id = localUtil.ctol( httpContext.cgiGet( "Z2Regi_Id"), ",", ".") ;
            Z10Dept_Descripcion = httpContext.cgiGet( "Z10Dept_Descripcion") ;
            Z9Pais_Codigo = httpContext.cgiGet( "Z9Pais_Codigo") ;
            A113Cent_UsuarioCrea = httpContext.cgiGet( "Z113Cent_UsuarioCrea") ;
            A115Cent_UsuarioModifica = httpContext.cgiGet( "Z115Cent_UsuarioModifica") ;
            A114Cent_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z114Cent_FechaCrea"), 0) ;
            A116Cent_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z116Cent_FechaModifica"), 0) ;
            A122Cent_Consecutivo = httpContext.cgiGet( "Z122Cent_Consecutivo") ;
            A119Cent_Auxiliar = (int)(localUtil.ctol( httpContext.cgiGet( "Z119Cent_Auxiliar"), ",", ".")) ;
            A526Cent_ConsePlaca = localUtil.ctol( httpContext.cgiGet( "Z526Cent_ConsePlaca"), ",", ".") ;
            A694Cent_ConsMultiCedula = localUtil.ctol( httpContext.cgiGet( "Z694Cent_ConsMultiCedula"), ",", ".") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N2Regi_Id = localUtil.ctol( httpContext.cgiGet( "N2Regi_Id"), ",", ".") ;
            AV14Cent_Id = localUtil.ctol( httpContext.cgiGet( "vCENT_ID"), ",", ".") ;
            AV12Insert_Regi_Id = localUtil.ctol( httpContext.cgiGet( "vINSERT_REGI_ID"), ",", ".") ;
            AV7Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A113Cent_UsuarioCrea = httpContext.cgiGet( "CENT_USUARIOCREA") ;
            A115Cent_UsuarioModifica = httpContext.cgiGet( "CENT_USUARIOMODIFICA") ;
            A114Cent_FechaCrea = localUtil.ctot( httpContext.cgiGet( "CENT_FECHACREA"), 0) ;
            A116Cent_FechaModifica = localUtil.ctot( httpContext.cgiGet( "CENT_FECHAMODIFICA"), 0) ;
            A122Cent_Consecutivo = httpContext.cgiGet( "CENT_CONSECUTIVO") ;
            A119Cent_Auxiliar = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_AUXILIAR"), ",", ".")) ;
            A526Cent_ConsePlaca = localUtil.ctol( httpContext.cgiGet( "CENT_CONSEPLACA"), ",", ".") ;
            A694Cent_ConsMultiCedula = localUtil.ctol( httpContext.cgiGet( "CENT_CONSMULTICEDULA"), ",", ".") ;
            A13Regi_Descripcion = httpContext.cgiGet( "REGI_DESCRIPCION") ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "GEN_CENTROCOSTO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, "")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9") ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9") ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9") ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1Cent_Id != Z1Cent_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("gen_centrocosto:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
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
                  sMode1 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_010( ) ;
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
                        e11012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12012 ();
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
         e12012 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll011( ) ;
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
         disableAttributes011( ) ;
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

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption010( )
   {
   }

   public void e11012( )
   {
      /* Start Routine */
      AV7Usuario = AV8WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Usuario", AV7Usuario);
      AV7Usuario = AV8WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Usuario", AV7Usuario);
      edtCent_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtCent_Id_Visible, 5, 0)), true);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV11TrnContext.fromxml(AV8WebSession.getValue("TrnContext"), null, null);
      AV12Insert_Regi_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Regi_Id", GXutil.ltrim( GXutil.str( AV12Insert_Regi_Id, 11, 0)));
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV15Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV16GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         while ( AV16GXV1 <= AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV16GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Regi_Id") == 0 )
            {
               AV12Insert_Regi_Id = GXutil.lval( AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Regi_Id", GXutil.ltrim( GXutil.str( AV12Insert_Regi_Id, 11, 0)));
            }
            AV16GXV1 = (int)(AV16GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         }
      }
   }

   public void e12012( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwgen_centrocosto") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z113Cent_UsuarioCrea = T00013_A113Cent_UsuarioCrea[0] ;
            Z115Cent_UsuarioModifica = T00013_A115Cent_UsuarioModifica[0] ;
            Z114Cent_FechaCrea = T00013_A114Cent_FechaCrea[0] ;
            Z116Cent_FechaModifica = T00013_A116Cent_FechaModifica[0] ;
            Z3Cent_Codigo = T00013_A3Cent_Codigo[0] ;
            Z120Cent_Nit = T00013_A120Cent_Nit[0] ;
            Z4Cent_Descripcion = T00013_A4Cent_Descripcion[0] ;
            Z117Cent_EtCt = T00013_A117Cent_EtCt[0] ;
            Z118Cent_TpoMay = T00013_A118Cent_TpoMay[0] ;
            Z121Cent_Descripcion2 = T00013_A121Cent_Descripcion2[0] ;
            Z122Cent_Consecutivo = T00013_A122Cent_Consecutivo[0] ;
            Z123Cent_Direccion = T00013_A123Cent_Direccion[0] ;
            Z124Cent_Resolucion = T00013_A124Cent_Resolucion[0] ;
            Z125Cent_DescripcionLarga = T00013_A125Cent_DescripcionLarga[0] ;
            Z126Cent_NroDependenciaSIIF = T00013_A126Cent_NroDependenciaSIIF[0] ;
            Z119Cent_Auxiliar = T00013_A119Cent_Auxiliar[0] ;
            Z526Cent_ConsePlaca = T00013_A526Cent_ConsePlaca[0] ;
            Z694Cent_ConsMultiCedula = T00013_A694Cent_ConsMultiCedula[0] ;
            Z683Cent_Estado = T00013_A683Cent_Estado[0] ;
            Z2Regi_Id = T00013_A2Regi_Id[0] ;
         }
         else
         {
            Z113Cent_UsuarioCrea = A113Cent_UsuarioCrea ;
            Z115Cent_UsuarioModifica = A115Cent_UsuarioModifica ;
            Z114Cent_FechaCrea = A114Cent_FechaCrea ;
            Z116Cent_FechaModifica = A116Cent_FechaModifica ;
            Z3Cent_Codigo = A3Cent_Codigo ;
            Z120Cent_Nit = A120Cent_Nit ;
            Z4Cent_Descripcion = A4Cent_Descripcion ;
            Z117Cent_EtCt = A117Cent_EtCt ;
            Z118Cent_TpoMay = A118Cent_TpoMay ;
            Z121Cent_Descripcion2 = A121Cent_Descripcion2 ;
            Z122Cent_Consecutivo = A122Cent_Consecutivo ;
            Z123Cent_Direccion = A123Cent_Direccion ;
            Z124Cent_Resolucion = A124Cent_Resolucion ;
            Z125Cent_DescripcionLarga = A125Cent_DescripcionLarga ;
            Z126Cent_NroDependenciaSIIF = A126Cent_NroDependenciaSIIF ;
            Z119Cent_Auxiliar = A119Cent_Auxiliar ;
            Z526Cent_ConsePlaca = A526Cent_ConsePlaca ;
            Z694Cent_ConsMultiCedula = A694Cent_ConsMultiCedula ;
            Z683Cent_Estado = A683Cent_Estado ;
            Z2Regi_Id = A2Regi_Id ;
         }
      }
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         Z10Dept_Descripcion = T00017_A10Dept_Descripcion[0] ;
         Z9Pais_Codigo = T00017_A9Pais_Codigo[0] ;
      }
      if ( GX_JID == -18 )
      {
         Z1Cent_Id = A1Cent_Id ;
         Z113Cent_UsuarioCrea = A113Cent_UsuarioCrea ;
         Z115Cent_UsuarioModifica = A115Cent_UsuarioModifica ;
         Z114Cent_FechaCrea = A114Cent_FechaCrea ;
         Z116Cent_FechaModifica = A116Cent_FechaModifica ;
         Z3Cent_Codigo = A3Cent_Codigo ;
         Z120Cent_Nit = A120Cent_Nit ;
         Z4Cent_Descripcion = A4Cent_Descripcion ;
         Z117Cent_EtCt = A117Cent_EtCt ;
         Z118Cent_TpoMay = A118Cent_TpoMay ;
         Z121Cent_Descripcion2 = A121Cent_Descripcion2 ;
         Z122Cent_Consecutivo = A122Cent_Consecutivo ;
         Z123Cent_Direccion = A123Cent_Direccion ;
         Z124Cent_Resolucion = A124Cent_Resolucion ;
         Z125Cent_DescripcionLarga = A125Cent_DescripcionLarga ;
         Z126Cent_NroDependenciaSIIF = A126Cent_NroDependenciaSIIF ;
         Z119Cent_Auxiliar = A119Cent_Auxiliar ;
         Z526Cent_ConsePlaca = A526Cent_ConsePlaca ;
         Z694Cent_ConsMultiCedula = A694Cent_ConsMultiCedula ;
         Z683Cent_Estado = A683Cent_Estado ;
         Z2Regi_Id = A2Regi_Id ;
         Z12Regi_Cod = A12Regi_Cod ;
         Z13Regi_Descripcion = A13Regi_Descripcion ;
         Z5Ciud_Codigo = A5Ciud_Codigo ;
         Z7Ciud_Descripcion = A7Ciud_Descripcion ;
         Z6Dept_Codigo = A6Dept_Codigo ;
         Z10Dept_Descripcion = A10Dept_Descripcion ;
         Z9Pais_Codigo = A9Pais_Codigo ;
         Z11Pais_Descripcion = A11Pais_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      gxaregi_id_html011( ) ;
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV14Cent_Id) )
      {
         A1Cent_Id = AV14Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Regi_Id) )
      {
         dynRegi_Id.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynRegi_Id.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynRegi_Id.getEnabled(), 5, 0)), true);
      }
      else
      {
         dynRegi_Id.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynRegi_Id.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynRegi_Id.getEnabled(), 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Regi_Id) )
      {
         A2Regi_Id = AV12Insert_Regi_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
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
         /* Using cursor T00014 */
         pr_default.execute(2, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T00014_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T00014_A13Regi_Descripcion[0] ;
         A5Ciud_Codigo = T00014_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         pr_default.close(2);
         /* Using cursor T00015 */
         pr_default.execute(3, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T00015_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T00015_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(3);
         /* Using cursor T00017 */
         pr_default.execute(5, new Object[] {new Short(A6Dept_Codigo)});
         zm011( 22) ;
         A10Dept_Descripcion = T00017_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = T00017_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         pr_default.close(5);
         /* Using cursor T00018 */
         pr_default.execute(6, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T00018_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(6);
         if ( A6Dept_Codigo == 0 )
         {
            A10Dept_Descripcion = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         }
         AV15Pgmname = "GEN_CENTROCOSTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      }
   }

   public void load011( )
   {
      /* Using cursor T00019 */
      pr_default.execute(7, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A113Cent_UsuarioCrea = T00019_A113Cent_UsuarioCrea[0] ;
         A115Cent_UsuarioModifica = T00019_A115Cent_UsuarioModifica[0] ;
         A114Cent_FechaCrea = T00019_A114Cent_FechaCrea[0] ;
         A116Cent_FechaModifica = T00019_A116Cent_FechaModifica[0] ;
         A10Dept_Descripcion = T00019_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A3Cent_Codigo = T00019_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A120Cent_Nit = T00019_A120Cent_Nit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
         A4Cent_Descripcion = T00019_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A117Cent_EtCt = T00019_A117Cent_EtCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
         A118Cent_TpoMay = T00019_A118Cent_TpoMay[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118Cent_TpoMay", A118Cent_TpoMay);
         A121Cent_Descripcion2 = T00019_A121Cent_Descripcion2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
         A12Regi_Cod = T00019_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T00019_A13Regi_Descripcion[0] ;
         A7Ciud_Descripcion = T00019_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A11Pais_Descripcion = T00019_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A122Cent_Consecutivo = T00019_A122Cent_Consecutivo[0] ;
         A123Cent_Direccion = T00019_A123Cent_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123Cent_Direccion", A123Cent_Direccion);
         A124Cent_Resolucion = T00019_A124Cent_Resolucion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124Cent_Resolucion", A124Cent_Resolucion);
         A125Cent_DescripcionLarga = T00019_A125Cent_DescripcionLarga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
         A126Cent_NroDependenciaSIIF = T00019_A126Cent_NroDependenciaSIIF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
         A119Cent_Auxiliar = T00019_A119Cent_Auxiliar[0] ;
         A526Cent_ConsePlaca = T00019_A526Cent_ConsePlaca[0] ;
         A694Cent_ConsMultiCedula = T00019_A694Cent_ConsMultiCedula[0] ;
         A683Cent_Estado = T00019_A683Cent_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
         n683Cent_Estado = T00019_n683Cent_Estado[0] ;
         A2Regi_Id = T00019_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         A5Ciud_Codigo = T00019_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         A6Dept_Codigo = T00019_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A9Pais_Codigo = T00019_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         zm011( -18) ;
      }
      pr_default.close(7);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
      AV15Pgmname = "GEN_CENTROCOSTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      if ( A6Dept_Codigo == 0 )
      {
         A10Dept_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      }
   }

   public void checkExtendedTable011( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV15Pgmname = "GEN_CENTROCOSTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      /* Using cursor T000110 */
      pr_default.execute(8, new Object[] {A3Cent_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Centro de Costo"}), 1, "CENT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
      if ( ( GXutil.strcmp(A3Cent_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el código del Centro de Costo", 1, "CENT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A4Cent_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del Centro de Costo", 1, "CENT_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00014 */
      pr_default.execute(2, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynRegi_Id.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12Regi_Cod = T00014_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T00014_A13Regi_Descripcion[0] ;
      A5Ciud_Codigo = T00014_A5Ciud_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      pr_default.close(2);
      /* Using cursor T00015 */
      pr_default.execute(3, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T00015_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T00015_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      pr_default.close(3);
      /* Using cursor T00017 */
      pr_default.execute(5, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T00017_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A9Pais_Codigo = T00017_A9Pais_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      pr_default.close(5);
      /* Using cursor T00018 */
      pr_default.execute(6, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T00018_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      pr_default.close(6);
      if ( A6Dept_Codigo == 0 )
      {
         A10Dept_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      }
      if ( ( A2Regi_Id == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la regional a la que pertenece el centro de costo", 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynRegi_Id.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors011( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( long A2Regi_Id )
   {
      /* Using cursor T000111 */
      pr_default.execute(9, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynRegi_Id.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12Regi_Cod = T000111_A12Regi_Cod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = T000111_A13Regi_Descripcion[0] ;
      A5Ciud_Codigo = T000111_A5Ciud_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A13Regi_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_21( short A5Ciud_Codigo )
   {
      /* Using cursor T000112 */
      pr_default.execute(10, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000112_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T000112_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A7Ciud_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_22( short A6Dept_Codigo )
   {
      /* Using cursor T000113 */
      pr_default.execute(11, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000113_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A9Pais_Codigo = T000113_A9Pais_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A10Dept_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A9Pais_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_23( String A9Pais_Codigo )
   {
      /* Using cursor T000114 */
      pr_default.execute(12, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T000114_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A11Pais_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void getKey011( )
   {
      /* Using cursor T000115 */
      pr_default.execute(13, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00013 */
      pr_default.execute(1, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm011( 18) ;
         RcdFound1 = (short)(1) ;
         A1Cent_Id = T00013_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         A113Cent_UsuarioCrea = T00013_A113Cent_UsuarioCrea[0] ;
         A115Cent_UsuarioModifica = T00013_A115Cent_UsuarioModifica[0] ;
         A114Cent_FechaCrea = T00013_A114Cent_FechaCrea[0] ;
         A116Cent_FechaModifica = T00013_A116Cent_FechaModifica[0] ;
         A3Cent_Codigo = T00013_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A120Cent_Nit = T00013_A120Cent_Nit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
         A4Cent_Descripcion = T00013_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A117Cent_EtCt = T00013_A117Cent_EtCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
         A118Cent_TpoMay = T00013_A118Cent_TpoMay[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118Cent_TpoMay", A118Cent_TpoMay);
         A121Cent_Descripcion2 = T00013_A121Cent_Descripcion2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
         A122Cent_Consecutivo = T00013_A122Cent_Consecutivo[0] ;
         A123Cent_Direccion = T00013_A123Cent_Direccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A123Cent_Direccion", A123Cent_Direccion);
         A124Cent_Resolucion = T00013_A124Cent_Resolucion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124Cent_Resolucion", A124Cent_Resolucion);
         A125Cent_DescripcionLarga = T00013_A125Cent_DescripcionLarga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
         A126Cent_NroDependenciaSIIF = T00013_A126Cent_NroDependenciaSIIF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
         A119Cent_Auxiliar = T00013_A119Cent_Auxiliar[0] ;
         A526Cent_ConsePlaca = T00013_A526Cent_ConsePlaca[0] ;
         A694Cent_ConsMultiCedula = T00013_A694Cent_ConsMultiCedula[0] ;
         A683Cent_Estado = T00013_A683Cent_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
         n683Cent_Estado = T00013_n683Cent_Estado[0] ;
         A2Regi_Id = T00013_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         Z1Cent_Id = A1Cent_Id ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T000116 */
      pr_default.execute(14, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T000116_A1Cent_Id[0] < A1Cent_Id ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T000116_A1Cent_Id[0] > A1Cent_Id ) ) )
         {
            A1Cent_Id = T000116_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T000117 */
      pr_default.execute(15, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T000117_A1Cent_Id[0] > A1Cent_Id ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T000117_A1Cent_Id[0] < A1Cent_Id ) ) )
         {
            A1Cent_Id = T000117_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCent_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert011( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1Cent_Id != Z1Cent_Id )
            {
               A1Cent_Id = Z1Cent_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CENT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCent_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update011( ) ;
               GX_FocusControl = edtCent_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A1Cent_Id != Z1Cent_Id )
            {
               /* Insert record */
               GX_FocusControl = edtCent_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert011( ) ;
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
                  GX_FocusControl = edtCent_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert011( ) ;
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
      if ( A1Cent_Id != Z1Cent_Id )
      {
         A1Cent_Id = Z1Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCent_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00012 */
         pr_default.execute(0, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_CENTROCOSTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z113Cent_UsuarioCrea, T00012_A113Cent_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z115Cent_UsuarioModifica, T00012_A115Cent_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z114Cent_FechaCrea, T00012_A114Cent_FechaCrea[0]) ) || !( GXutil.dateCompare(Z116Cent_FechaModifica, T00012_A116Cent_FechaModifica[0]) ) || ( GXutil.strcmp(Z3Cent_Codigo, T00012_A3Cent_Codigo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z120Cent_Nit != T00012_A120Cent_Nit[0] ) || ( GXutil.strcmp(Z4Cent_Descripcion, T00012_A4Cent_Descripcion[0]) != 0 ) || ( Z117Cent_EtCt != T00012_A117Cent_EtCt[0] ) || ( GXutil.strcmp(Z118Cent_TpoMay, T00012_A118Cent_TpoMay[0]) != 0 ) || ( GXutil.strcmp(Z121Cent_Descripcion2, T00012_A121Cent_Descripcion2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z122Cent_Consecutivo, T00012_A122Cent_Consecutivo[0]) != 0 ) || ( GXutil.strcmp(Z123Cent_Direccion, T00012_A123Cent_Direccion[0]) != 0 ) || ( GXutil.strcmp(Z124Cent_Resolucion, T00012_A124Cent_Resolucion[0]) != 0 ) || ( GXutil.strcmp(Z125Cent_DescripcionLarga, T00012_A125Cent_DescripcionLarga[0]) != 0 ) || ( Z126Cent_NroDependenciaSIIF != T00012_A126Cent_NroDependenciaSIIF[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z119Cent_Auxiliar != T00012_A119Cent_Auxiliar[0] ) || ( Z526Cent_ConsePlaca != T00012_A526Cent_ConsePlaca[0] ) || ( Z694Cent_ConsMultiCedula != T00012_A694Cent_ConsMultiCedula[0] ) || ( GXutil.strcmp(Z683Cent_Estado, T00012_A683Cent_Estado[0]) != 0 ) || ( Z2Regi_Id != T00012_A2Regi_Id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"GEN_CENTROCOSTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T00016 */
      pr_default.execute(4, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(4) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_DEPARTAMENTO"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         if ( false || ( GXutil.strcmp(Z10Dept_Descripcion, T00016_A10Dept_Descripcion[0]) != 0 ) || ( GXutil.strcmp(Z9Pais_Codigo, T00016_A9Pais_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"GEN_DEPARTAMENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000118 */
                  pr_default.execute(16, new Object[] {A113Cent_UsuarioCrea, A115Cent_UsuarioModifica, A114Cent_FechaCrea, A116Cent_FechaModifica, A3Cent_Codigo, new Long(A120Cent_Nit), A4Cent_Descripcion, new Byte(A117Cent_EtCt), A118Cent_TpoMay, A121Cent_Descripcion2, A122Cent_Consecutivo, A123Cent_Direccion, A124Cent_Resolucion, A125Cent_DescripcionLarga, new Long(A126Cent_NroDependenciaSIIF), new Integer(A119Cent_Auxiliar), new Long(A526Cent_ConsePlaca), new Long(A694Cent_ConsMultiCedula), new Boolean(n683Cent_Estado), A683Cent_Estado, new Long(A2Regi_Id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000119 */
                  pr_default.execute(17);
                  A1Cent_Id = T000119_A1Cent_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
                  pr_default.close(17);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CENTROCOSTO") ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN1011( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption010( ) ;
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
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000120 */
                  pr_default.execute(18, new Object[] {A113Cent_UsuarioCrea, A115Cent_UsuarioModifica, A114Cent_FechaCrea, A116Cent_FechaModifica, A3Cent_Codigo, new Long(A120Cent_Nit), A4Cent_Descripcion, new Byte(A117Cent_EtCt), A118Cent_TpoMay, A121Cent_Descripcion2, A122Cent_Consecutivo, A123Cent_Direccion, A124Cent_Resolucion, A125Cent_DescripcionLarga, new Long(A126Cent_NroDependenciaSIIF), new Integer(A119Cent_Auxiliar), new Long(A526Cent_ConsePlaca), new Long(A694Cent_ConsMultiCedula), new Boolean(n683Cent_Estado), A683Cent_Estado, new Long(A2Regi_Id), new Long(A1Cent_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CENTROCOSTO") ;
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_CENTROCOSTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_int1[0] = A1Cent_Id ;
                     new com.orions2.gen_centrocostoupdateredundancy(remoteHandle, context).execute( GXv_int1) ;
                     gen_centrocosto_impl.this.A1Cent_Id = GXv_int1[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
                     updateTablesN1011( ) ;
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000121 */
               pr_default.execute(19, new Object[] {new Long(A1Cent_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CENTROCOSTO") ;
               if ( AnyError == 0 )
               {
                  updateTablesN1011( ) ;
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel011( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "GEN_CENTROCOSTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000122 */
         pr_default.execute(20, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T000122_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A13Regi_Descripcion = T000122_A13Regi_Descripcion[0] ;
         A5Ciud_Codigo = T000122_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         pr_default.close(20);
         /* Using cursor T000123 */
         pr_default.execute(21, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000123_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T000123_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(21);
         /* Using cursor T000124 */
         pr_default.execute(22, new Object[] {new Short(A6Dept_Codigo)});
         Z10Dept_Descripcion = T000124_A10Dept_Descripcion[0] ;
         Z9Pais_Codigo = T000124_A9Pais_Codigo[0] ;
         A10Dept_Descripcion = T000124_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = T000124_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         pr_default.close(22);
         /* Using cursor T000125 */
         pr_default.execute(23, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T000125_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(23);
         if ( A6Dept_Codigo == 0 )
         {
            A10Dept_Descripcion = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000126 */
         pr_default.execute(24, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALM_RESTRICCIONES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T000127 */
         pr_default.execute(25, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Centro Costo Destino Trn"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T000128 */
         pr_default.execute(26, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"+" ("+"Centro Costo Transaccion"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T000129 */
         pr_default.execute(27, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CUENTADANTE"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T000130 */
         pr_default.execute(28, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALAMCEN AREA"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000131 */
         pr_default.execute(29, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"USUARIO Y CENTROS DE COSTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000132 */
         pr_default.execute(30, new Object[] {new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACÉN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void updateTablesN1011( )
   {
      /* Using cursor T000133 */
      pr_default.execute(31, new Object[] {A10Dept_Descripcion, new Short(A6Dept_Codigo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_DEPARTAMENTO") ;
   }

   public void endLevel011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "gen_centrocosto");
         if ( AnyError == 0 )
         {
            confirmValues010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "gen_centrocosto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart011( )
   {
      /* Scan By routine */
      /* Using cursor T000134 */
      pr_default.execute(32);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1Cent_Id = T000134_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1Cent_Id = T000134_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
   }

   public void scanEnd011( )
   {
      pr_default.close(32);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A114Cent_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A114Cent_FechaCrea", localUtil.ttoc( A114Cent_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
         {
            A114Cent_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "A114Cent_FechaCrea", localUtil.ttoc( A114Cent_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A116Cent_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A116Cent_FechaModifica", localUtil.ttoc( A116Cent_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
         {
            A116Cent_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "A116Cent_FechaModifica", localUtil.ttoc( A116Cent_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A113Cent_UsuarioCrea = AV7Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A113Cent_UsuarioCrea", A113Cent_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A115Cent_UsuarioModifica = AV7Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A115Cent_UsuarioModifica", A115Cent_UsuarioModifica);
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
         {
            A115Cent_UsuarioModifica = AV7Usuario ;
            httpContext.ajax_rsp_assign_attri("", false, "A115Cent_UsuarioModifica", A115Cent_UsuarioModifica);
         }
      }
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), true);
      edtCent_Nit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Nit_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Nit_Enabled, 5, 0)), true);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), true);
      edtCent_Descripcion2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion2_Enabled, 5, 0)), true);
      edtCent_DescripcionLarga_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_DescripcionLarga_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_DescripcionLarga_Enabled, 5, 0)), true);
      edtCent_EtCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_EtCt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_EtCt_Enabled, 5, 0)), true);
      edtCent_TpoMay_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_TpoMay_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_TpoMay_Enabled, 5, 0)), true);
      dynRegi_Id.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynRegi_Id.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynRegi_Id.getEnabled(), 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      edtCiud_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Enabled, 5, 0)), true);
      edtCiud_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Descripcion_Enabled, 5, 0)), true);
      edtDept_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      edtDept_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Descripcion_Enabled, 5, 0)), true);
      edtPais_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Codigo_Enabled, 5, 0)), true);
      edtPais_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Descripcion_Enabled, 5, 0)), true);
      edtCent_Direccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Direccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Direccion_Enabled, 5, 0)), true);
      edtCent_Resolucion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Resolucion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Resolucion_Enabled, 5, 0)), true);
      edtCent_NroDependenciaSIIF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_NroDependenciaSIIF_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_NroDependenciaSIIF_Enabled, 5, 0)), true);
      cmbCent_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCent_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbCent_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues010( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414112254");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_centrocosto") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z113Cent_UsuarioCrea", Z113Cent_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z115Cent_UsuarioModifica", Z115Cent_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z114Cent_FechaCrea", localUtil.ttoc( Z114Cent_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z116Cent_FechaModifica", localUtil.ttoc( Z116Cent_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z3Cent_Codigo", Z3Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z120Cent_Nit", GXutil.ltrim( localUtil.ntoc( Z120Cent_Nit, (byte)(12), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z4Cent_Descripcion", Z4Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z117Cent_EtCt", GXutil.ltrim( localUtil.ntoc( Z117Cent_EtCt, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z118Cent_TpoMay", Z118Cent_TpoMay);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z121Cent_Descripcion2", Z121Cent_Descripcion2);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z122Cent_Consecutivo", Z122Cent_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z123Cent_Direccion", Z123Cent_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z124Cent_Resolucion", Z124Cent_Resolucion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z125Cent_DescripcionLarga", Z125Cent_DescripcionLarga);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z126Cent_NroDependenciaSIIF", GXutil.ltrim( localUtil.ntoc( Z126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z119Cent_Auxiliar", GXutil.ltrim( localUtil.ntoc( Z119Cent_Auxiliar, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z526Cent_ConsePlaca", GXutil.ltrim( localUtil.ntoc( Z526Cent_ConsePlaca, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z694Cent_ConsMultiCedula", GXutil.ltrim( localUtil.ntoc( Z694Cent_ConsMultiCedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z683Cent_Estado", GXutil.rtrim( Z683Cent_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z2Regi_Id", GXutil.ltrim( localUtil.ntoc( Z2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z10Dept_Descripcion", Z10Dept_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z9Pais_Codigo", Z9Pais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N2Regi_Id", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV14Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_REGI_ID", GXutil.ltrim( localUtil.ntoc( AV12Insert_Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV7Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_USUARIOCREA", A113Cent_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_USUARIOMODIFICA", A115Cent_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_FECHACREA", localUtil.ttoc( A114Cent_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_FECHAMODIFICA", localUtil.ttoc( A116Cent_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CONSECUTIVO", A122Cent_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_AUXILIAR", GXutil.ltrim( localUtil.ntoc( A119Cent_Auxiliar, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CONSEPLACA", GXutil.ltrim( localUtil.ntoc( A526Cent_ConsePlaca, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CONSMULTICEDULA", GXutil.ltrim( localUtil.ntoc( A694Cent_ConsMultiCedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCION", A13Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Cent_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "GEN_CENTROCOSTO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, "")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9") ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9") ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A694Cent_ConsMultiCedula), "ZZZZZZZZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_centrocosto:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.gen_centrocosto") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Cent_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "GEN_CENTROCOSTO" ;
   }

   public String getPgmdesc( )
   {
      return "Centro de costo" ;
   }

   public void initializeNonKey011( )
   {
      A2Regi_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      A113Cent_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A113Cent_UsuarioCrea", A113Cent_UsuarioCrea);
      A115Cent_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A115Cent_UsuarioModifica", A115Cent_UsuarioModifica);
      A114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A114Cent_FechaCrea", localUtil.ttoc( A114Cent_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A116Cent_FechaModifica", localUtil.ttoc( A116Cent_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A10Dept_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A3Cent_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A120Cent_Nit = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A120Cent_Nit", GXutil.ltrim( GXutil.str( A120Cent_Nit, 12, 0)));
      A4Cent_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A117Cent_EtCt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A117Cent_EtCt", GXutil.ltrim( GXutil.str( A117Cent_EtCt, 2, 0)));
      A118Cent_TpoMay = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A118Cent_TpoMay", A118Cent_TpoMay);
      A121Cent_Descripcion2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A121Cent_Descripcion2", A121Cent_Descripcion2);
      A12Regi_Cod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A13Regi_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A5Ciud_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      A7Ciud_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      A9Pais_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      A11Pais_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      A122Cent_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A122Cent_Consecutivo", A122Cent_Consecutivo);
      A123Cent_Direccion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A123Cent_Direccion", A123Cent_Direccion);
      A124Cent_Resolucion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A124Cent_Resolucion", A124Cent_Resolucion);
      A125Cent_DescripcionLarga = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A125Cent_DescripcionLarga", A125Cent_DescripcionLarga);
      A126Cent_NroDependenciaSIIF = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A126Cent_NroDependenciaSIIF", GXutil.ltrim( GXutil.str( A126Cent_NroDependenciaSIIF, 10, 0)));
      A119Cent_Auxiliar = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A119Cent_Auxiliar", GXutil.ltrim( GXutil.str( A119Cent_Auxiliar, 8, 0)));
      A526Cent_ConsePlaca = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A526Cent_ConsePlaca", GXutil.ltrim( GXutil.str( A526Cent_ConsePlaca, 18, 0)));
      A694Cent_ConsMultiCedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A694Cent_ConsMultiCedula", GXutil.ltrim( GXutil.str( A694Cent_ConsMultiCedula, 18, 0)));
      A683Cent_Estado = "" ;
      n683Cent_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A683Cent_Estado", A683Cent_Estado);
      n683Cent_Estado = ((GXutil.strcmp("", A683Cent_Estado)==0) ? true : false) ;
      Z113Cent_UsuarioCrea = "" ;
      Z115Cent_UsuarioModifica = "" ;
      Z114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z3Cent_Codigo = "" ;
      Z120Cent_Nit = 0 ;
      Z4Cent_Descripcion = "" ;
      Z117Cent_EtCt = (byte)(0) ;
      Z118Cent_TpoMay = "" ;
      Z121Cent_Descripcion2 = "" ;
      Z122Cent_Consecutivo = "" ;
      Z123Cent_Direccion = "" ;
      Z124Cent_Resolucion = "" ;
      Z125Cent_DescripcionLarga = "" ;
      Z126Cent_NroDependenciaSIIF = 0 ;
      Z119Cent_Auxiliar = 0 ;
      Z526Cent_ConsePlaca = 0 ;
      Z694Cent_ConsMultiCedula = 0 ;
      Z683Cent_Estado = "" ;
      Z2Regi_Id = 0 ;
      Z10Dept_Descripcion = "" ;
      Z9Pais_Codigo = "" ;
   }

   public void initAll011( )
   {
      A1Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      initializeNonKey011( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414112273");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gen_centrocosto.js", "?201861414112273");
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
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Nit_Internalname = "CENT_NIT" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtCent_Descripcion2_Internalname = "CENT_DESCRIPCION2" ;
      edtCent_DescripcionLarga_Internalname = "CENT_DESCRIPCIONLARGA" ;
      edtCent_EtCt_Internalname = "CENT_ETCT" ;
      edtCent_TpoMay_Internalname = "CENT_TPOMAY" ;
      dynRegi_Id.setInternalname( "REGI_ID" );
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION" ;
      edtCent_Direccion_Internalname = "CENT_DIRECCION" ;
      edtCent_Resolucion_Internalname = "CENT_RESOLUCION" ;
      edtCent_NroDependenciaSIIF_Internalname = "CENT_NRODEPENDENCIASIIF" ;
      cmbCent_Estado.setInternalname( "CENT_ESTADO" );
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
      Form.setCaption( "Centro de costo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbCent_Estado.setJsonclick( "" );
      cmbCent_Estado.setEnabled( 1 );
      edtCent_NroDependenciaSIIF_Jsonclick = "" ;
      edtCent_NroDependenciaSIIF_Enabled = 1 ;
      edtCent_Resolucion_Jsonclick = "" ;
      edtCent_Resolucion_Enabled = 1 ;
      edtCent_Direccion_Enabled = 1 ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Descripcion_Enabled = 0 ;
      edtPais_Codigo_Jsonclick = "" ;
      edtPais_Codigo_Enabled = 0 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 0 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 0 ;
      dynRegi_Id.setJsonclick( "" );
      dynRegi_Id.setEnabled( 1 );
      edtCent_TpoMay_Jsonclick = "" ;
      edtCent_TpoMay_Enabled = 1 ;
      edtCent_EtCt_Jsonclick = "" ;
      edtCent_EtCt_Enabled = 1 ;
      edtCent_DescripcionLarga_Jsonclick = "" ;
      edtCent_DescripcionLarga_Enabled = 1 ;
      edtCent_Descripcion2_Jsonclick = "" ;
      edtCent_Descripcion2_Enabled = 1 ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 1 ;
      edtCent_Nit_Jsonclick = "" ;
      edtCent_Nit_Enabled = 1 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 1 ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 0 ;
      edtCent_Id_Visible = 1 ;
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

   public void gxdlaregi_id011( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlaregi_id_data011( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxaregi_id_html011( )
   {
      long gxdynajaxvalue ;
      gxdlaregi_id_data011( ) ;
      gxdynajaxindex = 1 ;
      dynRegi_Id.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynRegi_Id.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaregi_id_data011( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( 0, 9, 0)));
      gxdynajaxctrldescr.add("SELECCIONAR");
      /* Using cursor T000135 */
      pr_default.execute(33);
      while ( (pr_default.getStatus(33) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T000135_A2Regi_Id[0], (byte)(11), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(T000135_A13Regi_Descripcion[0]);
         pr_default.readNext(33);
      }
      pr_default.close(33);
   }

   public void valid_Cent_codigo( String GX_Parm1 ,
                                  long GX_Parm2 )
   {
      A3Cent_Codigo = GX_Parm1 ;
      A1Cent_Id = GX_Parm2 ;
      /* Using cursor T000136 */
      pr_default.execute(34, new Object[] {A3Cent_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Centro de Costo"}), 1, "CENT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Codigo_Internalname ;
      }
      pr_default.close(34);
      if ( ( GXutil.strcmp(A3Cent_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el código del Centro de Costo", 1, "CENT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Codigo_Internalname ;
      }
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Regi_id( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                              short GX_Parm2 ,
                              short GX_Parm3 ,
                              String GX_Parm4 ,
                              String GX_Parm5 ,
                              short GX_Parm6 ,
                              String GX_Parm7 ,
                              String GX_Parm8 ,
                              String GX_Parm9 )
   {
      dynRegi_Id = GX_Parm1 ;
      A2Regi_Id = GXutil.lval( dynRegi_Id.getValue()) ;
      A5Ciud_Codigo = GX_Parm2 ;
      A6Dept_Codigo = GX_Parm3 ;
      A9Pais_Codigo = GX_Parm4 ;
      A10Dept_Descripcion = GX_Parm5 ;
      A12Regi_Cod = GX_Parm6 ;
      A13Regi_Descripcion = GX_Parm7 ;
      A7Ciud_Descripcion = GX_Parm8 ;
      A11Pais_Descripcion = GX_Parm9 ;
      /* Using cursor T000137 */
      pr_default.execute(35, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynRegi_Id.getInternalname() ;
      }
      A12Regi_Cod = T000137_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T000137_A13Regi_Descripcion[0] ;
      A5Ciud_Codigo = T000137_A5Ciud_Codigo[0] ;
      pr_default.close(35);
      /* Using cursor T000138 */
      pr_default.execute(36, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A7Ciud_Descripcion = T000138_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000138_A6Dept_Codigo[0] ;
      pr_default.close(36);
      /* Using cursor T000139 */
      pr_default.execute(37, new Object[] {new Short(A6Dept_Codigo)});
      Z10Dept_Descripcion = T000139_A10Dept_Descripcion[0] ;
      Z9Pais_Codigo = T000139_A9Pais_Codigo[0] ;
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000139_A10Dept_Descripcion[0] ;
      A9Pais_Codigo = T000139_A9Pais_Codigo[0] ;
      pr_default.close(37);
      /* Using cursor T000140 */
      pr_default.execute(38, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T000140_A11Pais_Descripcion[0] ;
      pr_default.close(38);
      if ( A6Dept_Codigo == 0 )
      {
         A10Dept_Descripcion = "" ;
      }
      if ( ( A2Regi_Id == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la regional a la que pertenece el centro de costo", 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = dynRegi_Id.getInternalname() ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A12Regi_Cod = (short)(0) ;
         A13Regi_Descripcion = "" ;
         A5Ciud_Codigo = (short)(0) ;
         A7Ciud_Descripcion = "" ;
         A6Dept_Codigo = (short)(0) ;
         A10Dept_Descripcion = "" ;
         A9Pais_Codigo = "" ;
         A11Pais_Descripcion = "" ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A13Regi_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A7Ciud_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A10Dept_Descripcion);
      isValidOutput.add(A9Pais_Codigo);
      isValidOutput.add(A11Pais_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV14Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12012',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(20);
      pr_default.close(36);
      pr_default.close(21);
      pr_default.close(37);
      pr_default.close(22);
      pr_default.close(38);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z113Cent_UsuarioCrea = "" ;
      Z115Cent_UsuarioModifica = "" ;
      Z114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z3Cent_Codigo = "" ;
      Z4Cent_Descripcion = "" ;
      Z118Cent_TpoMay = "" ;
      Z121Cent_Descripcion2 = "" ;
      Z122Cent_Consecutivo = "" ;
      Z123Cent_Direccion = "" ;
      Z124Cent_Resolucion = "" ;
      Z125Cent_DescripcionLarga = "" ;
      Z683Cent_Estado = "" ;
      Z10Dept_Descripcion = "" ;
      Z9Pais_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A9Pais_Codigo = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A683Cent_Estado = "" ;
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
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A121Cent_Descripcion2 = "" ;
      A125Cent_DescripcionLarga = "" ;
      A118Cent_TpoMay = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A11Pais_Descripcion = "" ;
      A123Cent_Direccion = "" ;
      A124Cent_Resolucion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A113Cent_UsuarioCrea = "" ;
      A115Cent_UsuarioModifica = "" ;
      A114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A122Cent_Consecutivo = "" ;
      AV7Usuario = "" ;
      A13Regi_Descripcion = "" ;
      AV15Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8WebSession = httpContext.getWebSession();
      AV11TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV13TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z13Regi_Descripcion = "" ;
      Z7Ciud_Descripcion = "" ;
      Z11Pais_Descripcion = "" ;
      T00014_A12Regi_Cod = new short[1] ;
      T00014_A13Regi_Descripcion = new String[] {""} ;
      T00014_A5Ciud_Codigo = new short[1] ;
      T00015_A7Ciud_Descripcion = new String[] {""} ;
      T00015_A6Dept_Codigo = new short[1] ;
      T00017_A10Dept_Descripcion = new String[] {""} ;
      T00017_A9Pais_Codigo = new String[] {""} ;
      T00018_A11Pais_Descripcion = new String[] {""} ;
      T00019_A1Cent_Id = new long[1] ;
      T00019_A113Cent_UsuarioCrea = new String[] {""} ;
      T00019_A115Cent_UsuarioModifica = new String[] {""} ;
      T00019_A114Cent_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00019_A116Cent_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00019_A10Dept_Descripcion = new String[] {""} ;
      T00019_A3Cent_Codigo = new String[] {""} ;
      T00019_A120Cent_Nit = new long[1] ;
      T00019_A4Cent_Descripcion = new String[] {""} ;
      T00019_A117Cent_EtCt = new byte[1] ;
      T00019_A118Cent_TpoMay = new String[] {""} ;
      T00019_A121Cent_Descripcion2 = new String[] {""} ;
      T00019_A12Regi_Cod = new short[1] ;
      T00019_A13Regi_Descripcion = new String[] {""} ;
      T00019_A7Ciud_Descripcion = new String[] {""} ;
      T00019_A11Pais_Descripcion = new String[] {""} ;
      T00019_A122Cent_Consecutivo = new String[] {""} ;
      T00019_A123Cent_Direccion = new String[] {""} ;
      T00019_A124Cent_Resolucion = new String[] {""} ;
      T00019_A125Cent_DescripcionLarga = new String[] {""} ;
      T00019_A126Cent_NroDependenciaSIIF = new long[1] ;
      T00019_A119Cent_Auxiliar = new int[1] ;
      T00019_A526Cent_ConsePlaca = new long[1] ;
      T00019_A694Cent_ConsMultiCedula = new long[1] ;
      T00019_A683Cent_Estado = new String[] {""} ;
      T00019_n683Cent_Estado = new boolean[] {false} ;
      T00019_A2Regi_Id = new long[1] ;
      T00019_A5Ciud_Codigo = new short[1] ;
      T00019_A6Dept_Codigo = new short[1] ;
      T00019_A9Pais_Codigo = new String[] {""} ;
      T000110_A3Cent_Codigo = new String[] {""} ;
      T000111_A12Regi_Cod = new short[1] ;
      T000111_A13Regi_Descripcion = new String[] {""} ;
      T000111_A5Ciud_Codigo = new short[1] ;
      T000112_A7Ciud_Descripcion = new String[] {""} ;
      T000112_A6Dept_Codigo = new short[1] ;
      T000113_A10Dept_Descripcion = new String[] {""} ;
      T000113_A9Pais_Codigo = new String[] {""} ;
      T000114_A11Pais_Descripcion = new String[] {""} ;
      T000115_A1Cent_Id = new long[1] ;
      T00013_A1Cent_Id = new long[1] ;
      T00013_A113Cent_UsuarioCrea = new String[] {""} ;
      T00013_A115Cent_UsuarioModifica = new String[] {""} ;
      T00013_A114Cent_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_A116Cent_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_A3Cent_Codigo = new String[] {""} ;
      T00013_A120Cent_Nit = new long[1] ;
      T00013_A4Cent_Descripcion = new String[] {""} ;
      T00013_A117Cent_EtCt = new byte[1] ;
      T00013_A118Cent_TpoMay = new String[] {""} ;
      T00013_A121Cent_Descripcion2 = new String[] {""} ;
      T00013_A122Cent_Consecutivo = new String[] {""} ;
      T00013_A123Cent_Direccion = new String[] {""} ;
      T00013_A124Cent_Resolucion = new String[] {""} ;
      T00013_A125Cent_DescripcionLarga = new String[] {""} ;
      T00013_A126Cent_NroDependenciaSIIF = new long[1] ;
      T00013_A119Cent_Auxiliar = new int[1] ;
      T00013_A526Cent_ConsePlaca = new long[1] ;
      T00013_A694Cent_ConsMultiCedula = new long[1] ;
      T00013_A683Cent_Estado = new String[] {""} ;
      T00013_n683Cent_Estado = new boolean[] {false} ;
      T00013_A2Regi_Id = new long[1] ;
      T000116_A1Cent_Id = new long[1] ;
      T000117_A1Cent_Id = new long[1] ;
      T00012_A1Cent_Id = new long[1] ;
      T00012_A113Cent_UsuarioCrea = new String[] {""} ;
      T00012_A115Cent_UsuarioModifica = new String[] {""} ;
      T00012_A114Cent_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_A116Cent_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_A3Cent_Codigo = new String[] {""} ;
      T00012_A120Cent_Nit = new long[1] ;
      T00012_A4Cent_Descripcion = new String[] {""} ;
      T00012_A117Cent_EtCt = new byte[1] ;
      T00012_A118Cent_TpoMay = new String[] {""} ;
      T00012_A121Cent_Descripcion2 = new String[] {""} ;
      T00012_A122Cent_Consecutivo = new String[] {""} ;
      T00012_A123Cent_Direccion = new String[] {""} ;
      T00012_A124Cent_Resolucion = new String[] {""} ;
      T00012_A125Cent_DescripcionLarga = new String[] {""} ;
      T00012_A126Cent_NroDependenciaSIIF = new long[1] ;
      T00012_A119Cent_Auxiliar = new int[1] ;
      T00012_A526Cent_ConsePlaca = new long[1] ;
      T00012_A694Cent_ConsMultiCedula = new long[1] ;
      T00012_A683Cent_Estado = new String[] {""} ;
      T00012_n683Cent_Estado = new boolean[] {false} ;
      T00012_A2Regi_Id = new long[1] ;
      T00016_A10Dept_Descripcion = new String[] {""} ;
      T00016_A9Pais_Codigo = new String[] {""} ;
      T000119_A1Cent_Id = new long[1] ;
      GXv_int1 = new long [1] ;
      T000122_A12Regi_Cod = new short[1] ;
      T000122_A13Regi_Descripcion = new String[] {""} ;
      T000122_A5Ciud_Codigo = new short[1] ;
      T000123_A7Ciud_Descripcion = new String[] {""} ;
      T000123_A6Dept_Codigo = new short[1] ;
      T000124_A10Dept_Descripcion = new String[] {""} ;
      T000124_A9Pais_Codigo = new String[] {""} ;
      T000125_A11Pais_Descripcion = new String[] {""} ;
      T000126_A60Mbod_Id = new long[1] ;
      T000127_A46Tran_Id = new long[1] ;
      T000128_A46Tran_Id = new long[1] ;
      T000129_A43Cuen_Identificacion = new long[1] ;
      T000130_A32BArea_Codigo = new String[] {""} ;
      T000130_A1Cent_Id = new long[1] ;
      T000131_A23Usua_Id = new long[1] ;
      T000131_A1Cent_Id = new long[1] ;
      T000132_A1Cent_Id = new long[1] ;
      T000132_A27Alma_Modulo = new String[] {""} ;
      T000132_A28Alma_Codigo = new String[] {""} ;
      T000134_A1Cent_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T000135_A2Regi_Id = new long[1] ;
      T000135_A13Regi_Descripcion = new String[] {""} ;
      T000136_A3Cent_Codigo = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000137_A12Regi_Cod = new short[1] ;
      T000137_A13Regi_Descripcion = new String[] {""} ;
      T000137_A5Ciud_Codigo = new short[1] ;
      T000138_A7Ciud_Descripcion = new String[] {""} ;
      T000138_A6Dept_Codigo = new short[1] ;
      T000139_A10Dept_Descripcion = new String[] {""} ;
      T000139_A9Pais_Codigo = new String[] {""} ;
      T000140_A11Pais_Descripcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_centrocosto__default(),
         new Object[] {
             new Object[] {
            T00012_A1Cent_Id, T00012_A113Cent_UsuarioCrea, T00012_A115Cent_UsuarioModifica, T00012_A114Cent_FechaCrea, T00012_A116Cent_FechaModifica, T00012_A3Cent_Codigo, T00012_A120Cent_Nit, T00012_A4Cent_Descripcion, T00012_A117Cent_EtCt, T00012_A118Cent_TpoMay,
            T00012_A121Cent_Descripcion2, T00012_A122Cent_Consecutivo, T00012_A123Cent_Direccion, T00012_A124Cent_Resolucion, T00012_A125Cent_DescripcionLarga, T00012_A126Cent_NroDependenciaSIIF, T00012_A119Cent_Auxiliar, T00012_A526Cent_ConsePlaca, T00012_A694Cent_ConsMultiCedula, T00012_A683Cent_Estado,
            T00012_n683Cent_Estado, T00012_A2Regi_Id
            }
            , new Object[] {
            T00013_A1Cent_Id, T00013_A113Cent_UsuarioCrea, T00013_A115Cent_UsuarioModifica, T00013_A114Cent_FechaCrea, T00013_A116Cent_FechaModifica, T00013_A3Cent_Codigo, T00013_A120Cent_Nit, T00013_A4Cent_Descripcion, T00013_A117Cent_EtCt, T00013_A118Cent_TpoMay,
            T00013_A121Cent_Descripcion2, T00013_A122Cent_Consecutivo, T00013_A123Cent_Direccion, T00013_A124Cent_Resolucion, T00013_A125Cent_DescripcionLarga, T00013_A126Cent_NroDependenciaSIIF, T00013_A119Cent_Auxiliar, T00013_A526Cent_ConsePlaca, T00013_A694Cent_ConsMultiCedula, T00013_A683Cent_Estado,
            T00013_n683Cent_Estado, T00013_A2Regi_Id
            }
            , new Object[] {
            T00014_A12Regi_Cod, T00014_A13Regi_Descripcion, T00014_A5Ciud_Codigo
            }
            , new Object[] {
            T00015_A7Ciud_Descripcion, T00015_A6Dept_Codigo
            }
            , new Object[] {
            T00016_A10Dept_Descripcion, T00016_A9Pais_Codigo
            }
            , new Object[] {
            T00017_A10Dept_Descripcion, T00017_A9Pais_Codigo
            }
            , new Object[] {
            T00018_A11Pais_Descripcion
            }
            , new Object[] {
            T00019_A1Cent_Id, T00019_A113Cent_UsuarioCrea, T00019_A115Cent_UsuarioModifica, T00019_A114Cent_FechaCrea, T00019_A116Cent_FechaModifica, T00019_A10Dept_Descripcion, T00019_A3Cent_Codigo, T00019_A120Cent_Nit, T00019_A4Cent_Descripcion, T00019_A117Cent_EtCt,
            T00019_A118Cent_TpoMay, T00019_A121Cent_Descripcion2, T00019_A12Regi_Cod, T00019_A13Regi_Descripcion, T00019_A7Ciud_Descripcion, T00019_A11Pais_Descripcion, T00019_A122Cent_Consecutivo, T00019_A123Cent_Direccion, T00019_A124Cent_Resolucion, T00019_A125Cent_DescripcionLarga,
            T00019_A126Cent_NroDependenciaSIIF, T00019_A119Cent_Auxiliar, T00019_A526Cent_ConsePlaca, T00019_A694Cent_ConsMultiCedula, T00019_A683Cent_Estado, T00019_n683Cent_Estado, T00019_A2Regi_Id, T00019_A5Ciud_Codigo, T00019_A6Dept_Codigo, T00019_A9Pais_Codigo
            }
            , new Object[] {
            T000110_A3Cent_Codigo
            }
            , new Object[] {
            T000111_A12Regi_Cod, T000111_A13Regi_Descripcion, T000111_A5Ciud_Codigo
            }
            , new Object[] {
            T000112_A7Ciud_Descripcion, T000112_A6Dept_Codigo
            }
            , new Object[] {
            T000113_A10Dept_Descripcion, T000113_A9Pais_Codigo
            }
            , new Object[] {
            T000114_A11Pais_Descripcion
            }
            , new Object[] {
            T000115_A1Cent_Id
            }
            , new Object[] {
            T000116_A1Cent_Id
            }
            , new Object[] {
            T000117_A1Cent_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000119_A1Cent_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000122_A12Regi_Cod, T000122_A13Regi_Descripcion, T000122_A5Ciud_Codigo
            }
            , new Object[] {
            T000123_A7Ciud_Descripcion, T000123_A6Dept_Codigo
            }
            , new Object[] {
            T000124_A10Dept_Descripcion, T000124_A9Pais_Codigo
            }
            , new Object[] {
            T000125_A11Pais_Descripcion
            }
            , new Object[] {
            T000126_A60Mbod_Id
            }
            , new Object[] {
            T000127_A46Tran_Id
            }
            , new Object[] {
            T000128_A46Tran_Id
            }
            , new Object[] {
            T000129_A43Cuen_Identificacion
            }
            , new Object[] {
            T000130_A32BArea_Codigo, T000130_A1Cent_Id
            }
            , new Object[] {
            T000131_A23Usua_Id, T000131_A1Cent_Id
            }
            , new Object[] {
            T000132_A1Cent_Id, T000132_A27Alma_Modulo, T000132_A28Alma_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            T000134_A1Cent_Id
            }
            , new Object[] {
            T000135_A2Regi_Id, T000135_A13Regi_Descripcion
            }
            , new Object[] {
            T000136_A3Cent_Codigo
            }
            , new Object[] {
            T000137_A12Regi_Cod, T000137_A13Regi_Descripcion, T000137_A5Ciud_Codigo
            }
            , new Object[] {
            T000138_A7Ciud_Descripcion, T000138_A6Dept_Codigo
            }
            , new Object[] {
            T000139_A10Dept_Descripcion, T000139_A9Pais_Codigo
            }
            , new Object[] {
            T000140_A11Pais_Descripcion
            }
         }
      );
      AV15Pgmname = "GEN_CENTROCOSTO" ;
   }

   private byte Z117Cent_EtCt ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A117Cent_EtCt ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12Regi_Cod ;
   private short RcdFound1 ;
   private short Z12Regi_Cod ;
   private short Z5Ciud_Codigo ;
   private short Z6Dept_Codigo ;
   private int Z119Cent_Auxiliar ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Id_Visible ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Nit_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtCent_Descripcion2_Enabled ;
   private int edtCent_DescripcionLarga_Enabled ;
   private int edtCent_EtCt_Enabled ;
   private int edtCent_TpoMay_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int edtPais_Descripcion_Enabled ;
   private int edtCent_Direccion_Enabled ;
   private int edtCent_Resolucion_Enabled ;
   private int edtCent_NroDependenciaSIIF_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A119Cent_Auxiliar ;
   private int AV16GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private long wcpOAV14Cent_Id ;
   private long Z1Cent_Id ;
   private long Z120Cent_Nit ;
   private long Z126Cent_NroDependenciaSIIF ;
   private long Z526Cent_ConsePlaca ;
   private long Z694Cent_ConsMultiCedula ;
   private long Z2Regi_Id ;
   private long N2Regi_Id ;
   private long A2Regi_Id ;
   private long AV14Cent_Id ;
   private long A1Cent_Id ;
   private long A120Cent_Nit ;
   private long A126Cent_NroDependenciaSIIF ;
   private long A526Cent_ConsePlaca ;
   private long A694Cent_ConsMultiCedula ;
   private long AV12Insert_Regi_Id ;
   private long GXv_int1[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z683Cent_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A683Cent_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCent_Codigo_Internalname ;
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
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Nit_Internalname ;
   private String edtCent_Nit_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtCent_Descripcion2_Internalname ;
   private String edtCent_Descripcion2_Jsonclick ;
   private String edtCent_DescripcionLarga_Internalname ;
   private String edtCent_DescripcionLarga_Jsonclick ;
   private String edtCent_EtCt_Internalname ;
   private String edtCent_EtCt_Jsonclick ;
   private String edtCent_TpoMay_Internalname ;
   private String edtCent_TpoMay_Jsonclick ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtCent_Direccion_Internalname ;
   private String edtCent_Resolucion_Internalname ;
   private String edtCent_Resolucion_Jsonclick ;
   private String edtCent_NroDependenciaSIIF_Internalname ;
   private String edtCent_NroDependenciaSIIF_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV15Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private java.util.Date Z114Cent_FechaCrea ;
   private java.util.Date Z116Cent_FechaModifica ;
   private java.util.Date A114Cent_FechaCrea ;
   private java.util.Date A116Cent_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n683Cent_Estado ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z113Cent_UsuarioCrea ;
   private String Z115Cent_UsuarioModifica ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private String Z118Cent_TpoMay ;
   private String Z121Cent_Descripcion2 ;
   private String Z122Cent_Consecutivo ;
   private String Z123Cent_Direccion ;
   private String Z124Cent_Resolucion ;
   private String Z125Cent_DescripcionLarga ;
   private String Z10Dept_Descripcion ;
   private String Z9Pais_Codigo ;
   private String A9Pais_Codigo ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A121Cent_Descripcion2 ;
   private String A125Cent_DescripcionLarga ;
   private String A118Cent_TpoMay ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A11Pais_Descripcion ;
   private String A123Cent_Direccion ;
   private String A124Cent_Resolucion ;
   private String A113Cent_UsuarioCrea ;
   private String A115Cent_UsuarioModifica ;
   private String A122Cent_Consecutivo ;
   private String AV7Usuario ;
   private String A13Regi_Descripcion ;
   private String Z13Regi_Descripcion ;
   private String Z7Ciud_Descripcion ;
   private String Z11Pais_Descripcion ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV8WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice dynRegi_Id ;
   private HTMLChoice cmbCent_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] T00014_A12Regi_Cod ;
   private String[] T00014_A13Regi_Descripcion ;
   private short[] T00014_A5Ciud_Codigo ;
   private String[] T00015_A7Ciud_Descripcion ;
   private short[] T00015_A6Dept_Codigo ;
   private String[] T00017_A10Dept_Descripcion ;
   private String[] T00017_A9Pais_Codigo ;
   private String[] T00018_A11Pais_Descripcion ;
   private long[] T00019_A1Cent_Id ;
   private String[] T00019_A113Cent_UsuarioCrea ;
   private String[] T00019_A115Cent_UsuarioModifica ;
   private java.util.Date[] T00019_A114Cent_FechaCrea ;
   private java.util.Date[] T00019_A116Cent_FechaModifica ;
   private String[] T00019_A10Dept_Descripcion ;
   private String[] T00019_A3Cent_Codigo ;
   private long[] T00019_A120Cent_Nit ;
   private String[] T00019_A4Cent_Descripcion ;
   private byte[] T00019_A117Cent_EtCt ;
   private String[] T00019_A118Cent_TpoMay ;
   private String[] T00019_A121Cent_Descripcion2 ;
   private short[] T00019_A12Regi_Cod ;
   private String[] T00019_A13Regi_Descripcion ;
   private String[] T00019_A7Ciud_Descripcion ;
   private String[] T00019_A11Pais_Descripcion ;
   private String[] T00019_A122Cent_Consecutivo ;
   private String[] T00019_A123Cent_Direccion ;
   private String[] T00019_A124Cent_Resolucion ;
   private String[] T00019_A125Cent_DescripcionLarga ;
   private long[] T00019_A126Cent_NroDependenciaSIIF ;
   private int[] T00019_A119Cent_Auxiliar ;
   private long[] T00019_A526Cent_ConsePlaca ;
   private long[] T00019_A694Cent_ConsMultiCedula ;
   private String[] T00019_A683Cent_Estado ;
   private boolean[] T00019_n683Cent_Estado ;
   private long[] T00019_A2Regi_Id ;
   private short[] T00019_A5Ciud_Codigo ;
   private short[] T00019_A6Dept_Codigo ;
   private String[] T00019_A9Pais_Codigo ;
   private String[] T000110_A3Cent_Codigo ;
   private short[] T000111_A12Regi_Cod ;
   private String[] T000111_A13Regi_Descripcion ;
   private short[] T000111_A5Ciud_Codigo ;
   private String[] T000112_A7Ciud_Descripcion ;
   private short[] T000112_A6Dept_Codigo ;
   private String[] T000113_A10Dept_Descripcion ;
   private String[] T000113_A9Pais_Codigo ;
   private String[] T000114_A11Pais_Descripcion ;
   private long[] T000115_A1Cent_Id ;
   private long[] T00013_A1Cent_Id ;
   private String[] T00013_A113Cent_UsuarioCrea ;
   private String[] T00013_A115Cent_UsuarioModifica ;
   private java.util.Date[] T00013_A114Cent_FechaCrea ;
   private java.util.Date[] T00013_A116Cent_FechaModifica ;
   private String[] T00013_A3Cent_Codigo ;
   private long[] T00013_A120Cent_Nit ;
   private String[] T00013_A4Cent_Descripcion ;
   private byte[] T00013_A117Cent_EtCt ;
   private String[] T00013_A118Cent_TpoMay ;
   private String[] T00013_A121Cent_Descripcion2 ;
   private String[] T00013_A122Cent_Consecutivo ;
   private String[] T00013_A123Cent_Direccion ;
   private String[] T00013_A124Cent_Resolucion ;
   private String[] T00013_A125Cent_DescripcionLarga ;
   private long[] T00013_A126Cent_NroDependenciaSIIF ;
   private int[] T00013_A119Cent_Auxiliar ;
   private long[] T00013_A526Cent_ConsePlaca ;
   private long[] T00013_A694Cent_ConsMultiCedula ;
   private String[] T00013_A683Cent_Estado ;
   private boolean[] T00013_n683Cent_Estado ;
   private long[] T00013_A2Regi_Id ;
   private long[] T000116_A1Cent_Id ;
   private long[] T000117_A1Cent_Id ;
   private long[] T00012_A1Cent_Id ;
   private String[] T00012_A113Cent_UsuarioCrea ;
   private String[] T00012_A115Cent_UsuarioModifica ;
   private java.util.Date[] T00012_A114Cent_FechaCrea ;
   private java.util.Date[] T00012_A116Cent_FechaModifica ;
   private String[] T00012_A3Cent_Codigo ;
   private long[] T00012_A120Cent_Nit ;
   private String[] T00012_A4Cent_Descripcion ;
   private byte[] T00012_A117Cent_EtCt ;
   private String[] T00012_A118Cent_TpoMay ;
   private String[] T00012_A121Cent_Descripcion2 ;
   private String[] T00012_A122Cent_Consecutivo ;
   private String[] T00012_A123Cent_Direccion ;
   private String[] T00012_A124Cent_Resolucion ;
   private String[] T00012_A125Cent_DescripcionLarga ;
   private long[] T00012_A126Cent_NroDependenciaSIIF ;
   private int[] T00012_A119Cent_Auxiliar ;
   private long[] T00012_A526Cent_ConsePlaca ;
   private long[] T00012_A694Cent_ConsMultiCedula ;
   private String[] T00012_A683Cent_Estado ;
   private boolean[] T00012_n683Cent_Estado ;
   private long[] T00012_A2Regi_Id ;
   private String[] T00016_A10Dept_Descripcion ;
   private String[] T00016_A9Pais_Codigo ;
   private long[] T000119_A1Cent_Id ;
   private short[] T000122_A12Regi_Cod ;
   private String[] T000122_A13Regi_Descripcion ;
   private short[] T000122_A5Ciud_Codigo ;
   private String[] T000123_A7Ciud_Descripcion ;
   private short[] T000123_A6Dept_Codigo ;
   private String[] T000124_A10Dept_Descripcion ;
   private String[] T000124_A9Pais_Codigo ;
   private String[] T000125_A11Pais_Descripcion ;
   private long[] T000126_A60Mbod_Id ;
   private long[] T000127_A46Tran_Id ;
   private long[] T000128_A46Tran_Id ;
   private long[] T000129_A43Cuen_Identificacion ;
   private String[] T000130_A32BArea_Codigo ;
   private long[] T000130_A1Cent_Id ;
   private long[] T000131_A23Usua_Id ;
   private long[] T000131_A1Cent_Id ;
   private long[] T000132_A1Cent_Id ;
   private String[] T000132_A27Alma_Modulo ;
   private String[] T000132_A28Alma_Codigo ;
   private long[] T000134_A1Cent_Id ;
   private long[] T000135_A2Regi_Id ;
   private String[] T000135_A13Regi_Descripcion ;
   private String[] T000136_A3Cent_Codigo ;
   private short[] T000137_A12Regi_Cod ;
   private String[] T000137_A13Regi_Descripcion ;
   private short[] T000137_A5Ciud_Codigo ;
   private String[] T000138_A7Ciud_Descripcion ;
   private short[] T000138_A6Dept_Codigo ;
   private String[] T000139_A10Dept_Descripcion ;
   private String[] T000139_A9Pais_Codigo ;
   private String[] T000140_A11Pais_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV11TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class gen_centrocosto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00012", "SELECT Cent_Id, Cent_UsuarioCrea, Cent_UsuarioModifica, Cent_FechaCrea, Cent_FechaModifica, Cent_Codigo, Cent_Nit, Cent_Descripcion, Cent_EtCt, Cent_TpoMay, Cent_Descripcion2, Cent_Consecutivo, Cent_Direccion, Cent_Resolucion, Cent_DescripcionLarga, Cent_NroDependenciaSIIF, Cent_Auxiliar, Cent_ConsePlaca, Cent_ConsMultiCedula, Cent_Estado, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ?  FOR UPDATE OF Cent_UsuarioCrea, Cent_UsuarioModifica, Cent_FechaCrea, Cent_FechaModifica, Cent_Codigo, Cent_Nit, Cent_Descripcion, Cent_EtCt, Cent_TpoMay, Cent_Descripcion2, Cent_Consecutivo, Cent_Direccion, Cent_Resolucion, Cent_DescripcionLarga, Cent_NroDependenciaSIIF, Cent_Auxiliar, Cent_ConsePlaca, Cent_ConsMultiCedula, Cent_Estado, Regi_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00013", "SELECT Cent_Id, Cent_UsuarioCrea, Cent_UsuarioModifica, Cent_FechaCrea, Cent_FechaModifica, Cent_Codigo, Cent_Nit, Cent_Descripcion, Cent_EtCt, Cent_TpoMay, Cent_Descripcion2, Cent_Consecutivo, Cent_Direccion, Cent_Resolucion, Cent_DescripcionLarga, Cent_NroDependenciaSIIF, Cent_Auxiliar, Cent_ConsePlaca, Cent_ConsMultiCedula, Cent_Estado, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00014", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00015", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00016", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ?  FOR UPDATE OF Dept_Descripcion NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00017", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00018", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00019", "SELECT /*+ FIRST_ROWS(100) */ TM1.Cent_Id, TM1.Cent_UsuarioCrea, TM1.Cent_UsuarioModifica, TM1.Cent_FechaCrea, TM1.Cent_FechaModifica, T4.Dept_Descripcion, TM1.Cent_Codigo, TM1.Cent_Nit, TM1.Cent_Descripcion, TM1.Cent_EtCt, TM1.Cent_TpoMay, TM1.Cent_Descripcion2, T2.Regi_Cod, T2.Regi_Descripcion, T3.Ciud_Descripcion, T5.Pais_Descripcion, TM1.Cent_Consecutivo, TM1.Cent_Direccion, TM1.Cent_Resolucion, TM1.Cent_DescripcionLarga, TM1.Cent_NroDependenciaSIIF, TM1.Cent_Auxiliar, TM1.Cent_ConsePlaca, TM1.Cent_ConsMultiCedula, TM1.Cent_Estado, TM1.Regi_Id, T2.Ciud_Codigo, T3.Dept_Codigo, T4.Pais_Codigo FROM ((((GEN_CENTROCOSTO TM1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id = TM1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_PAIS T5 ON T5.Pais_Codigo = T4.Pais_Codigo) WHERE TM1.Cent_Id = ? ORDER BY TM1.Cent_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000110", "SELECT Cent_Codigo FROM GEN_CENTROCOSTO WHERE (Cent_Codigo = ?) AND (Not ( Cent_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000111", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000112", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000113", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000114", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000115", "SELECT /*+ FIRST_ROWS(1) */ Cent_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000116", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cent_Id FROM GEN_CENTROCOSTO WHERE ( Cent_Id > ?) ORDER BY Cent_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000117", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cent_Id FROM GEN_CENTROCOSTO WHERE ( Cent_Id < ?) ORDER BY Cent_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000118", "INSERT INTO GEN_CENTROCOSTO(Cent_UsuarioCrea, Cent_UsuarioModifica, Cent_FechaCrea, Cent_FechaModifica, Cent_Codigo, Cent_Nit, Cent_Descripcion, Cent_EtCt, Cent_TpoMay, Cent_Descripcion2, Cent_Consecutivo, Cent_Direccion, Cent_Resolucion, Cent_DescripcionLarga, Cent_NroDependenciaSIIF, Cent_Auxiliar, Cent_ConsePlaca, Cent_ConsMultiCedula, Cent_Estado, Regi_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "GEN_CENTROCOSTO")
         ,new ForEachCursor("T000119", "SELECT Cent_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000120", "UPDATE GEN_CENTROCOSTO SET Cent_UsuarioCrea=?, Cent_UsuarioModifica=?, Cent_FechaCrea=?, Cent_FechaModifica=?, Cent_Codigo=?, Cent_Nit=?, Cent_Descripcion=?, Cent_EtCt=?, Cent_TpoMay=?, Cent_Descripcion2=?, Cent_Consecutivo=?, Cent_Direccion=?, Cent_Resolucion=?, Cent_DescripcionLarga=?, Cent_NroDependenciaSIIF=?, Cent_Auxiliar=?, Cent_ConsePlaca=?, Cent_ConsMultiCedula=?, Cent_Estado=?, Regi_Id=?  WHERE Cent_Id = ?", GX_NOMASK, "GEN_CENTROCOSTO")
         ,new UpdateCursor("T000121", "DELETE FROM GEN_CENTROCOSTO  WHERE Cent_Id = ?", GX_NOMASK, "GEN_CENTROCOSTO")
         ,new ForEachCursor("T000122", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000123", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000124", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000125", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000126", "SELECT * FROM (SELECT Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_CentCostoId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000127", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_CentroCostoIdDestino = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000128", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_CentroCostoId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000129", "SELECT * FROM (SELECT Cuen_Identificacion FROM ALM_CUENTADANTE WHERE Cent_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000130", "SELECT * FROM (SELECT BArea_Codigo, Cent_Id FROM ALM_AREA WHERE Cent_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000131", "SELECT * FROM (SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Cent_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000132", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo FROM ALM_ALMACEN WHERE Cent_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000133", "UPDATE GEN_DEPARTAMENTO SET Dept_Descripcion=?  WHERE Dept_Codigo = ?", GX_NOMASK, "GEN_DEPARTAMENTO")
         ,new ForEachCursor("T000134", "SELECT /*+ FIRST_ROWS(100) */ Cent_Id FROM GEN_CENTROCOSTO ORDER BY Cent_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000135", "SELECT Regi_Id, Regi_Descripcion FROM GEN_REGIONAL ORDER BY Regi_Descripcion ",true, GX_NOMASK, false, this,0,0,false )
         ,new ForEachCursor("T000136", "SELECT Cent_Codigo FROM GEN_CENTROCOSTO WHERE (Cent_Codigo = ?) AND (Not ( Cent_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000137", "SELECT Regi_Cod, Regi_Descripcion, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000138", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000139", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000140", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((byte[]) buf[8])[0] = rslt.getByte(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((int[]) buf[16])[0] = rslt.getInt(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((long[]) buf[18])[0] = rslt.getLong(19) ;
               ((String[]) buf[19])[0] = rslt.getString(20, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(21) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((byte[]) buf[8])[0] = rslt.getByte(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               ((long[]) buf[15])[0] = rslt.getLong(16) ;
               ((int[]) buf[16])[0] = rslt.getInt(17) ;
               ((long[]) buf[17])[0] = rslt.getLong(18) ;
               ((long[]) buf[18])[0] = rslt.getLong(19) ;
               ((String[]) buf[19])[0] = rslt.getString(20, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(21) ;
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(20) ;
               ((long[]) buf[20])[0] = rslt.getLong(21) ;
               ((int[]) buf[21])[0] = rslt.getInt(22) ;
               ((long[]) buf[22])[0] = rslt.getLong(23) ;
               ((long[]) buf[23])[0] = rslt.getLong(24) ;
               ((String[]) buf[24])[0] = rslt.getString(25, 1) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(26) ;
               ((short[]) buf[27])[0] = rslt.getShort(27) ;
               ((short[]) buf[28])[0] = rslt.getShort(28) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(29) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 24 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 25 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 26 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 27 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 32 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 33 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 35 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 38 :
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 16, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setVarchar(9, (String)parms[8], 1, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 5, false);
               stmt.setVarchar(12, (String)parms[11], 1024, false);
               stmt.setVarchar(13, (String)parms[12], 30, false);
               stmt.setVarchar(14, (String)parms[13], 100, false);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setBigDecimal(17, ((Number) parms[16]).longValue(), 0);
               stmt.setBigDecimal(18, ((Number) parms[17]).longValue(), 0);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[19], 1);
               }
               stmt.setLong(20, ((Number) parms[20]).longValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 16, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setVarchar(9, (String)parms[8], 1, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 5, false);
               stmt.setVarchar(12, (String)parms[11], 1024, false);
               stmt.setVarchar(13, (String)parms[12], 30, false);
               stmt.setVarchar(14, (String)parms[13], 100, false);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setBigDecimal(17, ((Number) parms[16]).longValue(), 0);
               stmt.setBigDecimal(18, ((Number) parms[17]).longValue(), 0);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[19], 1);
               }
               stmt.setLong(20, ((Number) parms[20]).longValue());
               stmt.setLong(21, ((Number) parms[21]).longValue());
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 28 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 34 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 36 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 37 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 38 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

