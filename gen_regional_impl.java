/*
               File: gen_regional_impl
        Description: Regional
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:47.66
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

public final  class gen_regional_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A5Ciud_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A5Ciud_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A6Dept_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A9Pais_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A9Pais_Codigo) ;
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
            AV8Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Regi_Id", GXutil.ltrim( GXutil.str( AV8Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Regi_Id), "ZZZZZZZZZZ9")));
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
      cmbRegi_Estado.setName( "REGI_ESTADO" );
      cmbRegi_Estado.setWebtags( "" );
      cmbRegi_Estado.addItem("A", "Activo", (short)(0));
      cmbRegi_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbRegi_Estado.getItemCount() > 0 )
      {
         A164Regi_Estado = cmbRegi_Estado.getValidValue(A164Regi_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
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
         Form.getMeta().addItem("description", "Regional", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRegi_Cod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public gen_regional_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_regional_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_regional_impl.class ));
   }

   public gen_regional_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbRegi_Estado = new HTMLChoice();
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
      if ( cmbRegi_Estado.getItemCount() > 0 )
      {
         A164Regi_Estado = cmbRegi_Estado.getValidValue(A164Regi_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "REGIONAL", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Id_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")), ((edtRegi_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Cod_Internalname, "Cod", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Cod_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCt_Internalname, "Et Ct", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCt_Internalname, GXutil.ltrim( localUtil.ntoc( A144Regi_EtCt, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A144Regi_EtCt), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCo_Internalname, "Et Co", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCo_Internalname, GXutil.ltrim( localUtil.ntoc( A145Regi_EtCo, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A145Regi_EtCo), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCo_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_EtCf_Internalname, "Et Cf", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_EtCf_Internalname, GXutil.ltrim( localUtil.ntoc( A146Regi_EtCf, (byte)(2), (byte)(0), ",", "")), ((edtRegi_EtCf_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A146Regi_EtCf), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_EtCf_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_EtCf_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_MesArr_Internalname, "Mes Inicio", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_MesArr_Internalname, GXutil.ltrim( localUtil.ntoc( A147Regi_MesArr, (byte)(2), (byte)(0), ",", "")), ((edtRegi_MesArr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A147Regi_MesArr), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_MesArr_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_MesArr_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoArr_Internalname, "Año Inicio", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoArr_Internalname, GXutil.ltrim( localUtil.ntoc( A148Regi_AnoArr, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoArr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A148Regi_AnoArr), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoArr_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoArr_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_PerAct_Internalname, "Parámetro de vigencia", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_PerAct_Internalname, GXutil.ltrim( localUtil.ntoc( A149Regi_PerAct, (byte)(2), (byte)(0), ",", "")), ((edtRegi_PerAct_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A149Regi_PerAct), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_PerAct_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_PerAct_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoAct_Internalname, "Año Activo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoAct_Internalname, GXutil.ltrim( localUtil.ntoc( A150Regi_AnoAct, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoAct_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A150Regi_AnoAct), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoAct_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoAct_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoCal_Internalname, "Año Calculado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoCal_Internalname, GXutil.ltrim( localUtil.ntoc( A151Regi_AnoCal, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoCal_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A151Regi_AnoCal), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoCal_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoCal_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_NroPer_Internalname, "Periodo Contable", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_NroPer_Internalname, GXutil.ltrim( localUtil.ntoc( A152Regi_NroPer, (byte)(2), (byte)(0), ",", "")), ((edtRegi_NroPer_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A152Regi_NroPer), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_NroPer_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_NroPer_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Descripcion_Internalname, A13Regi_Descripcion, GXutil.rtrim( localUtil.format( A13Regi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_DirCia_Internalname, "Dirección ", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtRegi_DirCia_Internalname, A153Regi_DirCia, "http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A153Regi_DirCia), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), 1, edtRegi_DirCia_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1024", -1, 0, "_blank", "", (byte)(0), true, "GeneXus\\Address", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_NroRif_Internalname, "Nit", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_NroRif_Internalname, A165Regi_NroRif, GXutil.rtrim( localUtil.format( A165Regi_NroRif, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_NroRif_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_NroRif_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Abrev_Internalname, "Abreviatura", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Abrev_Internalname, A154Regi_Abrev, GXutil.rtrim( localUtil.format( A154Regi_Abrev, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Abrev_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Abrev_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_TpMvo_Internalname, "Tipo Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_TpMvo_Internalname, GXutil.ltrim( localUtil.ntoc( A155Regi_TpMvo, (byte)(2), (byte)(0), ",", "")), ((edtRegi_TpMvo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A155Regi_TpMvo), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_TpMvo_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_TpMvo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndPre_Internalname, "Cnd Pre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndPre_Internalname, A156Regi_CndPre, GXutil.rtrim( localUtil.format( A156Regi_CndPre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndPre_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndPre_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndPTes_Internalname, "Cnd PTes", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndPTes_Internalname, A157Regi_CndPTes, GXutil.rtrim( localUtil.format( A157Regi_CndPTes, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndPTes_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndPTes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_CndMon_Internalname, "Cnd Mon", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_CndMon_Internalname, A158Regi_CndMon, GXutil.rtrim( localUtil.format( A158Regi_CndMon, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_CndMon_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_CndMon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Graba_Internalname, "Graba", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Graba_Internalname, A159Regi_Graba, GXutil.rtrim( localUtil.format( A159Regi_Graba, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Graba_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Graba_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_MesUlt_Internalname, "Ultimo Mes", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_MesUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A160Regi_MesUlt, (byte)(2), (byte)(0), ",", "")), ((edtRegi_MesUlt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A160Regi_MesUlt), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_MesUlt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_MesUlt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_AnoUlt_Internalname, "Ultimo Año", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_AnoUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A161Regi_AnoUlt, (byte)(4), (byte)(0), ",", "")), ((edtRegi_AnoUlt_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A161Regi_AnoUlt), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_AnoUlt_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_AnoUlt_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Codigo_Internalname, "Código del País", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPais_Descripcion_Internalname, "Descripción del País", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), ((edtDept_Codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Codigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONAL.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Codigo_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_5_Internalname, sImgUrl, imgprompt_5_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_5_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCiud_Descripcion_Internalname, A7Ciud_Descripcion, GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCiud_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCiud_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Padre_Internalname, "Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Padre_Internalname, GXutil.ltrim( localUtil.ntoc( A162Regi_Padre, (byte)(4), (byte)(0), ",", "")), ((edtRegi_Padre_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A162Regi_Padre), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Padre_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Padre_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRegi_Importar_Internalname, "Importar", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRegi_Importar_Internalname, A163Regi_Importar, GXutil.rtrim( localUtil.format( A163Regi_Importar, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegi_Importar_Jsonclick, 0, "Attribute", "", "", "", 1, edtRegi_Importar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_REGIONAL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRegi_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRegi_Estado, cmbRegi_Estado.getInternalname(), GXutil.rtrim( A164Regi_Estado), 1, cmbRegi_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRegi_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "", true, "HLP_GEN_REGIONAL.htm");
         cmbRegi_Estado.setValue( GXutil.rtrim( A164Regi_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRegi_Estado.getInternalname(), "Values", cmbRegi_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_REGIONAL.htm");
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
      e110F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_COD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12Regi_Cod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            }
            else
            {
               A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCt_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCt_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ETCT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_EtCt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A144Regi_EtCt = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
            }
            else
            {
               A144Regi_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCt_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCo_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ETCO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_EtCo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A145Regi_EtCo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
            }
            else
            {
               A145Regi_EtCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCo_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCf_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_EtCf_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ETCF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_EtCf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A146Regi_EtCf = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
            }
            else
            {
               A146Regi_EtCf = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_EtCf_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_MesArr_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_MesArr_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_MESARR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_MesArr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A147Regi_MesArr = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
            }
            else
            {
               A147Regi_MesArr = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesArr_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoArr_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoArr_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ANOARR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_AnoArr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A148Regi_AnoArr = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
            }
            else
            {
               A148Regi_AnoArr = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoArr_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_PerAct_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_PerAct_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_PERACT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_PerAct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A149Regi_PerAct = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
            }
            else
            {
               A149Regi_PerAct = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_PerAct_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoAct_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoAct_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ANOACT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_AnoAct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A150Regi_AnoAct = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
            }
            else
            {
               A150Regi_AnoAct = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoAct_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoCal_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoCal_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ANOCAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_AnoCal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A151Regi_AnoCal = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
            }
            else
            {
               A151Regi_AnoCal = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoCal_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_NroPer_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_NroPer_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_NROPER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_NroPer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A152Regi_NroPer = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
            }
            else
            {
               A152Regi_NroPer = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_NroPer_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
            }
            A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
            A153Regi_DirCia = httpContext.cgiGet( edtRegi_DirCia_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A153Regi_DirCia", A153Regi_DirCia);
            A165Regi_NroRif = httpContext.cgiGet( edtRegi_NroRif_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A165Regi_NroRif", A165Regi_NroRif);
            A154Regi_Abrev = httpContext.cgiGet( edtRegi_Abrev_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A154Regi_Abrev", A154Regi_Abrev);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_TpMvo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_TpMvo_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_TPMVO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_TpMvo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A155Regi_TpMvo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
            }
            else
            {
               A155Regi_TpMvo = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_TpMvo_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
            }
            A156Regi_CndPre = httpContext.cgiGet( edtRegi_CndPre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A156Regi_CndPre", A156Regi_CndPre);
            A157Regi_CndPTes = httpContext.cgiGet( edtRegi_CndPTes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A157Regi_CndPTes", A157Regi_CndPTes);
            A158Regi_CndMon = httpContext.cgiGet( edtRegi_CndMon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A158Regi_CndMon", A158Regi_CndMon);
            A159Regi_Graba = httpContext.cgiGet( edtRegi_Graba_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A159Regi_Graba", A159Regi_Graba);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_MesUlt_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_MesUlt_Internalname), ",", ".") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_MESULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_MesUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A160Regi_MesUlt = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
            }
            else
            {
               A160Regi_MesUlt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRegi_MesUlt_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoUlt_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_AnoUlt_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_ANOULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_AnoUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A161Regi_AnoUlt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
            }
            else
            {
               A161Regi_AnoUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_AnoUlt_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
            }
            A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
            A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
            A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CIUD_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCiud_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5Ciud_Codigo = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            }
            else
            {
               A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
            }
            A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_Padre_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegi_Padre_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REGI_PADRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_Padre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A162Regi_Padre = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
            }
            else
            {
               A162Regi_Padre = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Padre_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
            }
            A163Regi_Importar = httpContext.cgiGet( edtRegi_Importar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A163Regi_Importar", A163Regi_Importar);
            cmbRegi_Estado.setValue( httpContext.cgiGet( cmbRegi_Estado.getInternalname()) );
            A164Regi_Estado = httpContext.cgiGet( cmbRegi_Estado.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
            /* Read saved values. */
            Z2Regi_Id = localUtil.ctol( httpContext.cgiGet( "Z2Regi_Id"), ",", ".") ;
            Z140Regi_UsuarioCrea = httpContext.cgiGet( "Z140Regi_UsuarioCrea") ;
            Z142Regi_UsuarioModifica = httpContext.cgiGet( "Z142Regi_UsuarioModifica") ;
            Z141Regi_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z141Regi_FechaCrea"), 0) ;
            Z143Regi_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z143Regi_FechaModifica"), 0) ;
            Z12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "Z12Regi_Cod"), ",", ".")) ;
            Z144Regi_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z144Regi_EtCt"), ",", ".")) ;
            Z145Regi_EtCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z145Regi_EtCo"), ",", ".")) ;
            Z146Regi_EtCf = (byte)(localUtil.ctol( httpContext.cgiGet( "Z146Regi_EtCf"), ",", ".")) ;
            Z147Regi_MesArr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z147Regi_MesArr"), ",", ".")) ;
            Z148Regi_AnoArr = (short)(localUtil.ctol( httpContext.cgiGet( "Z148Regi_AnoArr"), ",", ".")) ;
            Z149Regi_PerAct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z149Regi_PerAct"), ",", ".")) ;
            Z150Regi_AnoAct = (short)(localUtil.ctol( httpContext.cgiGet( "Z150Regi_AnoAct"), ",", ".")) ;
            Z151Regi_AnoCal = (short)(localUtil.ctol( httpContext.cgiGet( "Z151Regi_AnoCal"), ",", ".")) ;
            Z152Regi_NroPer = (byte)(localUtil.ctol( httpContext.cgiGet( "Z152Regi_NroPer"), ",", ".")) ;
            Z13Regi_Descripcion = httpContext.cgiGet( "Z13Regi_Descripcion") ;
            Z153Regi_DirCia = httpContext.cgiGet( "Z153Regi_DirCia") ;
            Z165Regi_NroRif = httpContext.cgiGet( "Z165Regi_NroRif") ;
            Z154Regi_Abrev = httpContext.cgiGet( "Z154Regi_Abrev") ;
            Z155Regi_TpMvo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z155Regi_TpMvo"), ",", ".")) ;
            Z156Regi_CndPre = httpContext.cgiGet( "Z156Regi_CndPre") ;
            Z157Regi_CndPTes = httpContext.cgiGet( "Z157Regi_CndPTes") ;
            Z158Regi_CndMon = httpContext.cgiGet( "Z158Regi_CndMon") ;
            Z159Regi_Graba = httpContext.cgiGet( "Z159Regi_Graba") ;
            Z160Regi_MesUlt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z160Regi_MesUlt"), ",", ".")) ;
            Z161Regi_AnoUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z161Regi_AnoUlt"), ",", ".")) ;
            Z162Regi_Padre = (short)(localUtil.ctol( httpContext.cgiGet( "Z162Regi_Padre"), ",", ".")) ;
            Z163Regi_Importar = httpContext.cgiGet( "Z163Regi_Importar") ;
            Z164Regi_Estado = httpContext.cgiGet( "Z164Regi_Estado") ;
            Z698Regi_Conse_Tran = (int)(localUtil.ctol( httpContext.cgiGet( "Z698Regi_Conse_Tran"), ",", ".")) ;
            Z5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "Z5Ciud_Codigo"), ",", ".")) ;
            A140Regi_UsuarioCrea = httpContext.cgiGet( "Z140Regi_UsuarioCrea") ;
            A142Regi_UsuarioModifica = httpContext.cgiGet( "Z142Regi_UsuarioModifica") ;
            A141Regi_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z141Regi_FechaCrea"), 0) ;
            A143Regi_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z143Regi_FechaModifica"), 0) ;
            A698Regi_Conse_Tran = (int)(localUtil.ctol( httpContext.cgiGet( "Z698Regi_Conse_Tran"), ",", ".")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "N5Ciud_Codigo"), ",", ".")) ;
            AV8Regi_Id = localUtil.ctol( httpContext.cgiGet( "vREGI_ID"), ",", ".") ;
            AV7Insert_Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CIUD_CODIGO"), ",", ".")) ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A140Regi_UsuarioCrea = httpContext.cgiGet( "REGI_USUARIOCREA") ;
            A142Regi_UsuarioModifica = httpContext.cgiGet( "REGI_USUARIOMODIFICA") ;
            A141Regi_FechaCrea = localUtil.ctot( httpContext.cgiGet( "REGI_FECHACREA"), 0) ;
            A143Regi_FechaModifica = localUtil.ctot( httpContext.cgiGet( "REGI_FECHAMODIFICA"), 0) ;
            A698Regi_Conse_Tran = (int)(localUtil.ctol( httpContext.cgiGet( "REGI_CONSE_TRAN"), ",", ".")) ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "GEN_REGIONAL" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9") ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2Regi_Id != Z2Regi_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("gen_regional:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
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
                  sMode18 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode18 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound18 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0F0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "REGI_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRegi_Id_Internalname ;
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
                        e110F2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120F2 ();
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
         e120F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0F18( ) ;
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
         disableAttributes0F18( ) ;
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

   public void confirm_0F0( )
   {
      beforeValidate0F18( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0F18( ) ;
         }
         else
         {
            checkExtendedTable0F18( ) ;
            closeExtendedTableCursors0F18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0F0( )
   {
   }

   public void e110F2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV7Insert_Ciud_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Insert_Ciud_Codigo", GXutil.ltrim( GXutil.str( AV7Insert_Ciud_Codigo, 4, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV15Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV16GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         while ( AV16GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV16GXV1));
            if ( GXutil.strcmp(AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Ciud_Codigo") == 0 )
            {
               AV7Insert_Ciud_Codigo = (short)(GXutil.lval( AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Insert_Ciud_Codigo", GXutil.ltrim( GXutil.str( AV7Insert_Ciud_Codigo, 4, 0)));
            }
            AV16GXV1 = (int)(AV16GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         }
      }
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e120F2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwgen_regional") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0F18( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z140Regi_UsuarioCrea = T000F3_A140Regi_UsuarioCrea[0] ;
            Z142Regi_UsuarioModifica = T000F3_A142Regi_UsuarioModifica[0] ;
            Z141Regi_FechaCrea = T000F3_A141Regi_FechaCrea[0] ;
            Z143Regi_FechaModifica = T000F3_A143Regi_FechaModifica[0] ;
            Z12Regi_Cod = T000F3_A12Regi_Cod[0] ;
            Z144Regi_EtCt = T000F3_A144Regi_EtCt[0] ;
            Z145Regi_EtCo = T000F3_A145Regi_EtCo[0] ;
            Z146Regi_EtCf = T000F3_A146Regi_EtCf[0] ;
            Z147Regi_MesArr = T000F3_A147Regi_MesArr[0] ;
            Z148Regi_AnoArr = T000F3_A148Regi_AnoArr[0] ;
            Z149Regi_PerAct = T000F3_A149Regi_PerAct[0] ;
            Z150Regi_AnoAct = T000F3_A150Regi_AnoAct[0] ;
            Z151Regi_AnoCal = T000F3_A151Regi_AnoCal[0] ;
            Z152Regi_NroPer = T000F3_A152Regi_NroPer[0] ;
            Z13Regi_Descripcion = T000F3_A13Regi_Descripcion[0] ;
            Z153Regi_DirCia = T000F3_A153Regi_DirCia[0] ;
            Z165Regi_NroRif = T000F3_A165Regi_NroRif[0] ;
            Z154Regi_Abrev = T000F3_A154Regi_Abrev[0] ;
            Z155Regi_TpMvo = T000F3_A155Regi_TpMvo[0] ;
            Z156Regi_CndPre = T000F3_A156Regi_CndPre[0] ;
            Z157Regi_CndPTes = T000F3_A157Regi_CndPTes[0] ;
            Z158Regi_CndMon = T000F3_A158Regi_CndMon[0] ;
            Z159Regi_Graba = T000F3_A159Regi_Graba[0] ;
            Z160Regi_MesUlt = T000F3_A160Regi_MesUlt[0] ;
            Z161Regi_AnoUlt = T000F3_A161Regi_AnoUlt[0] ;
            Z162Regi_Padre = T000F3_A162Regi_Padre[0] ;
            Z163Regi_Importar = T000F3_A163Regi_Importar[0] ;
            Z164Regi_Estado = T000F3_A164Regi_Estado[0] ;
            Z698Regi_Conse_Tran = T000F3_A698Regi_Conse_Tran[0] ;
            Z5Ciud_Codigo = T000F3_A5Ciud_Codigo[0] ;
         }
         else
         {
            Z140Regi_UsuarioCrea = A140Regi_UsuarioCrea ;
            Z142Regi_UsuarioModifica = A142Regi_UsuarioModifica ;
            Z141Regi_FechaCrea = A141Regi_FechaCrea ;
            Z143Regi_FechaModifica = A143Regi_FechaModifica ;
            Z12Regi_Cod = A12Regi_Cod ;
            Z144Regi_EtCt = A144Regi_EtCt ;
            Z145Regi_EtCo = A145Regi_EtCo ;
            Z146Regi_EtCf = A146Regi_EtCf ;
            Z147Regi_MesArr = A147Regi_MesArr ;
            Z148Regi_AnoArr = A148Regi_AnoArr ;
            Z149Regi_PerAct = A149Regi_PerAct ;
            Z150Regi_AnoAct = A150Regi_AnoAct ;
            Z151Regi_AnoCal = A151Regi_AnoCal ;
            Z152Regi_NroPer = A152Regi_NroPer ;
            Z13Regi_Descripcion = A13Regi_Descripcion ;
            Z153Regi_DirCia = A153Regi_DirCia ;
            Z165Regi_NroRif = A165Regi_NroRif ;
            Z154Regi_Abrev = A154Regi_Abrev ;
            Z155Regi_TpMvo = A155Regi_TpMvo ;
            Z156Regi_CndPre = A156Regi_CndPre ;
            Z157Regi_CndPTes = A157Regi_CndPTes ;
            Z158Regi_CndMon = A158Regi_CndMon ;
            Z159Regi_Graba = A159Regi_Graba ;
            Z160Regi_MesUlt = A160Regi_MesUlt ;
            Z161Regi_AnoUlt = A161Regi_AnoUlt ;
            Z162Regi_Padre = A162Regi_Padre ;
            Z163Regi_Importar = A163Regi_Importar ;
            Z164Regi_Estado = A164Regi_Estado ;
            Z698Regi_Conse_Tran = A698Regi_Conse_Tran ;
            Z5Ciud_Codigo = A5Ciud_Codigo ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z2Regi_Id = A2Regi_Id ;
         Z140Regi_UsuarioCrea = A140Regi_UsuarioCrea ;
         Z142Regi_UsuarioModifica = A142Regi_UsuarioModifica ;
         Z141Regi_FechaCrea = A141Regi_FechaCrea ;
         Z143Regi_FechaModifica = A143Regi_FechaModifica ;
         Z12Regi_Cod = A12Regi_Cod ;
         Z144Regi_EtCt = A144Regi_EtCt ;
         Z145Regi_EtCo = A145Regi_EtCo ;
         Z146Regi_EtCf = A146Regi_EtCf ;
         Z147Regi_MesArr = A147Regi_MesArr ;
         Z148Regi_AnoArr = A148Regi_AnoArr ;
         Z149Regi_PerAct = A149Regi_PerAct ;
         Z150Regi_AnoAct = A150Regi_AnoAct ;
         Z151Regi_AnoCal = A151Regi_AnoCal ;
         Z152Regi_NroPer = A152Regi_NroPer ;
         Z13Regi_Descripcion = A13Regi_Descripcion ;
         Z153Regi_DirCia = A153Regi_DirCia ;
         Z165Regi_NroRif = A165Regi_NroRif ;
         Z154Regi_Abrev = A154Regi_Abrev ;
         Z155Regi_TpMvo = A155Regi_TpMvo ;
         Z156Regi_CndPre = A156Regi_CndPre ;
         Z157Regi_CndPTes = A157Regi_CndPTes ;
         Z158Regi_CndMon = A158Regi_CndMon ;
         Z159Regi_Graba = A159Regi_Graba ;
         Z160Regi_MesUlt = A160Regi_MesUlt ;
         Z161Regi_AnoUlt = A161Regi_AnoUlt ;
         Z162Regi_Padre = A162Regi_Padre ;
         Z163Regi_Importar = A163Regi_Importar ;
         Z164Regi_Estado = A164Regi_Estado ;
         Z698Regi_Conse_Tran = A698Regi_Conse_Tran ;
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
      edtRegi_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Id_Enabled, 5, 0)), true);
      imgprompt_5_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00h0"+"',["+"{Ctrl:gx.dom.el('"+"CIUD_CODIGO"+"'), id:'"+"CIUD_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtRegi_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV8Regi_Id) )
      {
         A2Regi_Id = AV8Regi_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV7Insert_Ciud_Codigo) )
      {
         edtCiud_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCiud_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtCiud_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCiud_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV7Insert_Ciud_Codigo) )
      {
         A5Ciud_Codigo = AV7Insert_Ciud_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
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
         AV15Pgmname = "GEN_REGIONAL" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000F4 */
         pr_default.execute(2, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000F4_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T000F4_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(2);
         /* Using cursor T000F5 */
         pr_default.execute(3, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000F5_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = T000F5_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         pr_default.close(3);
         /* Using cursor T000F6 */
         pr_default.execute(4, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T000F6_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(4);
      }
   }

   public void load0F18( )
   {
      /* Using cursor T000F7 */
      pr_default.execute(5, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A140Regi_UsuarioCrea = T000F7_A140Regi_UsuarioCrea[0] ;
         A142Regi_UsuarioModifica = T000F7_A142Regi_UsuarioModifica[0] ;
         A141Regi_FechaCrea = T000F7_A141Regi_FechaCrea[0] ;
         A143Regi_FechaModifica = T000F7_A143Regi_FechaModifica[0] ;
         A12Regi_Cod = T000F7_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A144Regi_EtCt = T000F7_A144Regi_EtCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
         A145Regi_EtCo = T000F7_A145Regi_EtCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
         A146Regi_EtCf = T000F7_A146Regi_EtCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
         A147Regi_MesArr = T000F7_A147Regi_MesArr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
         A148Regi_AnoArr = T000F7_A148Regi_AnoArr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
         A149Regi_PerAct = T000F7_A149Regi_PerAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
         A150Regi_AnoAct = T000F7_A150Regi_AnoAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
         A151Regi_AnoCal = T000F7_A151Regi_AnoCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
         A152Regi_NroPer = T000F7_A152Regi_NroPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
         A13Regi_Descripcion = T000F7_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A153Regi_DirCia = T000F7_A153Regi_DirCia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153Regi_DirCia", A153Regi_DirCia);
         A165Regi_NroRif = T000F7_A165Regi_NroRif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165Regi_NroRif", A165Regi_NroRif);
         A154Regi_Abrev = T000F7_A154Regi_Abrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154Regi_Abrev", A154Regi_Abrev);
         A155Regi_TpMvo = T000F7_A155Regi_TpMvo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
         A156Regi_CndPre = T000F7_A156Regi_CndPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156Regi_CndPre", A156Regi_CndPre);
         A157Regi_CndPTes = T000F7_A157Regi_CndPTes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157Regi_CndPTes", A157Regi_CndPTes);
         A158Regi_CndMon = T000F7_A158Regi_CndMon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158Regi_CndMon", A158Regi_CndMon);
         A159Regi_Graba = T000F7_A159Regi_Graba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159Regi_Graba", A159Regi_Graba);
         A160Regi_MesUlt = T000F7_A160Regi_MesUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
         A161Regi_AnoUlt = T000F7_A161Regi_AnoUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
         A11Pais_Descripcion = T000F7_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A10Dept_Descripcion = T000F7_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A7Ciud_Descripcion = T000F7_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A162Regi_Padre = T000F7_A162Regi_Padre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
         A163Regi_Importar = T000F7_A163Regi_Importar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163Regi_Importar", A163Regi_Importar);
         A164Regi_Estado = T000F7_A164Regi_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
         A698Regi_Conse_Tran = T000F7_A698Regi_Conse_Tran[0] ;
         A5Ciud_Codigo = T000F7_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         A6Dept_Codigo = T000F7_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A9Pais_Codigo = T000F7_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         zm0F18( -16) ;
      }
      pr_default.close(5);
      onLoadActions0F18( ) ;
   }

   public void onLoadActions0F18( )
   {
      AV15Pgmname = "GEN_REGIONAL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void checkExtendedTable0F18( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV15Pgmname = "GEN_REGIONAL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      /* Using cursor T000F8 */
      pr_default.execute(6, new Object[] {new Short(A12Regi_Cod), new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código de la Regional"}), 1, "REGI_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegi_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T000F4 */
      pr_default.execute(2, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "CIUD_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCiud_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7Ciud_Descripcion = T000F4_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T000F4_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      pr_default.close(2);
      /* Using cursor T000F5 */
      pr_default.execute(3, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000F5_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A9Pais_Codigo = T000F5_A9Pais_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      pr_default.close(3);
      /* Using cursor T000F6 */
      pr_default.execute(4, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T000F6_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0F18( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( short A5Ciud_Codigo )
   {
      /* Using cursor T000F9 */
      pr_default.execute(7, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "CIUD_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCiud_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7Ciud_Descripcion = T000F9_A7Ciud_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A6Dept_Codigo = T000F9_A6Dept_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A7Ciud_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_19( short A6Dept_Codigo )
   {
      /* Using cursor T000F10 */
      pr_default.execute(8, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000F10_A10Dept_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A9Pais_Codigo = T000F10_A9Pais_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A10Dept_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A9Pais_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_20( String A9Pais_Codigo )
   {
      /* Using cursor T000F11 */
      pr_default.execute(9, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T000F11_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A11Pais_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void getKey0F18( )
   {
      /* Using cursor T000F12 */
      pr_default.execute(10, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000F3 */
      pr_default.execute(1, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F18( 16) ;
         RcdFound18 = (short)(1) ;
         A2Regi_Id = T000F3_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         A140Regi_UsuarioCrea = T000F3_A140Regi_UsuarioCrea[0] ;
         A142Regi_UsuarioModifica = T000F3_A142Regi_UsuarioModifica[0] ;
         A141Regi_FechaCrea = T000F3_A141Regi_FechaCrea[0] ;
         A143Regi_FechaModifica = T000F3_A143Regi_FechaModifica[0] ;
         A12Regi_Cod = T000F3_A12Regi_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
         A144Regi_EtCt = T000F3_A144Regi_EtCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
         A145Regi_EtCo = T000F3_A145Regi_EtCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
         A146Regi_EtCf = T000F3_A146Regi_EtCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
         A147Regi_MesArr = T000F3_A147Regi_MesArr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
         A148Regi_AnoArr = T000F3_A148Regi_AnoArr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
         A149Regi_PerAct = T000F3_A149Regi_PerAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
         A150Regi_AnoAct = T000F3_A150Regi_AnoAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
         A151Regi_AnoCal = T000F3_A151Regi_AnoCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
         A152Regi_NroPer = T000F3_A152Regi_NroPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
         A13Regi_Descripcion = T000F3_A13Regi_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
         A153Regi_DirCia = T000F3_A153Regi_DirCia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A153Regi_DirCia", A153Regi_DirCia);
         A165Regi_NroRif = T000F3_A165Regi_NroRif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165Regi_NroRif", A165Regi_NroRif);
         A154Regi_Abrev = T000F3_A154Regi_Abrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154Regi_Abrev", A154Regi_Abrev);
         A155Regi_TpMvo = T000F3_A155Regi_TpMvo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
         A156Regi_CndPre = T000F3_A156Regi_CndPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156Regi_CndPre", A156Regi_CndPre);
         A157Regi_CndPTes = T000F3_A157Regi_CndPTes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A157Regi_CndPTes", A157Regi_CndPTes);
         A158Regi_CndMon = T000F3_A158Regi_CndMon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158Regi_CndMon", A158Regi_CndMon);
         A159Regi_Graba = T000F3_A159Regi_Graba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159Regi_Graba", A159Regi_Graba);
         A160Regi_MesUlt = T000F3_A160Regi_MesUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
         A161Regi_AnoUlt = T000F3_A161Regi_AnoUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
         A162Regi_Padre = T000F3_A162Regi_Padre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
         A163Regi_Importar = T000F3_A163Regi_Importar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163Regi_Importar", A163Regi_Importar);
         A164Regi_Estado = T000F3_A164Regi_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
         A698Regi_Conse_Tran = T000F3_A698Regi_Conse_Tran[0] ;
         A5Ciud_Codigo = T000F3_A5Ciud_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
         Z2Regi_Id = A2Regi_Id ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0F18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey0F18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey0F18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0F18( ) ;
      if ( RcdFound18 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T000F13 */
      pr_default.execute(11, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T000F13_A2Regi_Id[0] < A2Regi_Id ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T000F13_A2Regi_Id[0] > A2Regi_Id ) ) )
         {
            A2Regi_Id = T000F13_A2Regi_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T000F14 */
      pr_default.execute(12, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T000F14_A2Regi_Id[0] > A2Regi_Id ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T000F14_A2Regi_Id[0] < A2Regi_Id ) ) )
         {
            A2Regi_Id = T000F14_A2Regi_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0F18( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRegi_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0F18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( A2Regi_Id != Z2Regi_Id )
            {
               A2Regi_Id = Z2Regi_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "REGI_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRegi_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRegi_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0F18( ) ;
               GX_FocusControl = edtRegi_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A2Regi_Id != Z2Regi_Id )
            {
               /* Insert record */
               GX_FocusControl = edtRegi_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0F18( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "REGI_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRegi_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRegi_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0F18( ) ;
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
      if ( A2Regi_Id != Z2Regi_Id )
      {
         A2Regi_Id = Z2Regi_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "REGI_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegi_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRegi_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0F18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000F2 */
         pr_default.execute(0, new Object[] {new Long(A2Regi_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_REGIONAL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z140Regi_UsuarioCrea, T000F2_A140Regi_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z142Regi_UsuarioModifica, T000F2_A142Regi_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z141Regi_FechaCrea, T000F2_A141Regi_FechaCrea[0]) ) || !( GXutil.dateCompare(Z143Regi_FechaModifica, T000F2_A143Regi_FechaModifica[0]) ) || ( Z12Regi_Cod != T000F2_A12Regi_Cod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z144Regi_EtCt != T000F2_A144Regi_EtCt[0] ) || ( Z145Regi_EtCo != T000F2_A145Regi_EtCo[0] ) || ( Z146Regi_EtCf != T000F2_A146Regi_EtCf[0] ) || ( Z147Regi_MesArr != T000F2_A147Regi_MesArr[0] ) || ( Z148Regi_AnoArr != T000F2_A148Regi_AnoArr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z149Regi_PerAct != T000F2_A149Regi_PerAct[0] ) || ( Z150Regi_AnoAct != T000F2_A150Regi_AnoAct[0] ) || ( Z151Regi_AnoCal != T000F2_A151Regi_AnoCal[0] ) || ( Z152Regi_NroPer != T000F2_A152Regi_NroPer[0] ) || ( GXutil.strcmp(Z13Regi_Descripcion, T000F2_A13Regi_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z153Regi_DirCia, T000F2_A153Regi_DirCia[0]) != 0 ) || ( GXutil.strcmp(Z165Regi_NroRif, T000F2_A165Regi_NroRif[0]) != 0 ) || ( GXutil.strcmp(Z154Regi_Abrev, T000F2_A154Regi_Abrev[0]) != 0 ) || ( Z155Regi_TpMvo != T000F2_A155Regi_TpMvo[0] ) || ( GXutil.strcmp(Z156Regi_CndPre, T000F2_A156Regi_CndPre[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z157Regi_CndPTes, T000F2_A157Regi_CndPTes[0]) != 0 ) || ( GXutil.strcmp(Z158Regi_CndMon, T000F2_A158Regi_CndMon[0]) != 0 ) || ( GXutil.strcmp(Z159Regi_Graba, T000F2_A159Regi_Graba[0]) != 0 ) || ( Z160Regi_MesUlt != T000F2_A160Regi_MesUlt[0] ) || ( Z161Regi_AnoUlt != T000F2_A161Regi_AnoUlt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z162Regi_Padre != T000F2_A162Regi_Padre[0] ) || ( GXutil.strcmp(Z163Regi_Importar, T000F2_A163Regi_Importar[0]) != 0 ) || ( GXutil.strcmp(Z164Regi_Estado, T000F2_A164Regi_Estado[0]) != 0 ) || ( Z698Regi_Conse_Tran != T000F2_A698Regi_Conse_Tran[0] ) || ( Z5Ciud_Codigo != T000F2_A5Ciud_Codigo[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"GEN_REGIONAL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F18( )
   {
      beforeValidate0F18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F18( 0) ;
         checkOptimisticConcurrency0F18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F15 */
                  pr_default.execute(13, new Object[] {A140Regi_UsuarioCrea, A142Regi_UsuarioModifica, A141Regi_FechaCrea, A143Regi_FechaModifica, new Short(A12Regi_Cod), new Byte(A144Regi_EtCt), new Byte(A145Regi_EtCo), new Byte(A146Regi_EtCf), new Byte(A147Regi_MesArr), new Short(A148Regi_AnoArr), new Byte(A149Regi_PerAct), new Short(A150Regi_AnoAct), new Short(A151Regi_AnoCal), new Byte(A152Regi_NroPer), A13Regi_Descripcion, A153Regi_DirCia, A165Regi_NroRif, A154Regi_Abrev, new Byte(A155Regi_TpMvo), A156Regi_CndPre, A157Regi_CndPTes, A158Regi_CndMon, A159Regi_Graba, new Byte(A160Regi_MesUlt), new Short(A161Regi_AnoUlt), new Short(A162Regi_Padre), A163Regi_Importar, A164Regi_Estado, new Integer(A698Regi_Conse_Tran), new Short(A5Ciud_Codigo)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000F16 */
                  pr_default.execute(14);
                  A2Regi_Id = T000F16_A2Regi_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
                  pr_default.close(14);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_REGIONAL") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0F0( ) ;
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
            load0F18( ) ;
         }
         endLevel0F18( ) ;
      }
      closeExtendedTableCursors0F18( ) ;
   }

   public void update0F18( )
   {
      beforeValidate0F18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F17 */
                  pr_default.execute(15, new Object[] {A140Regi_UsuarioCrea, A142Regi_UsuarioModifica, A141Regi_FechaCrea, A143Regi_FechaModifica, new Short(A12Regi_Cod), new Byte(A144Regi_EtCt), new Byte(A145Regi_EtCo), new Byte(A146Regi_EtCf), new Byte(A147Regi_MesArr), new Short(A148Regi_AnoArr), new Byte(A149Regi_PerAct), new Short(A150Regi_AnoAct), new Short(A151Regi_AnoCal), new Byte(A152Regi_NroPer), A13Regi_Descripcion, A153Regi_DirCia, A165Regi_NroRif, A154Regi_Abrev, new Byte(A155Regi_TpMvo), A156Regi_CndPre, A157Regi_CndPTes, A158Regi_CndMon, A159Regi_Graba, new Byte(A160Regi_MesUlt), new Short(A161Regi_AnoUlt), new Short(A162Regi_Padre), A163Regi_Importar, A164Regi_Estado, new Integer(A698Regi_Conse_Tran), new Short(A5Ciud_Codigo), new Long(A2Regi_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_REGIONAL") ;
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_REGIONAL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F18( ) ;
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
         endLevel0F18( ) ;
      }
      closeExtendedTableCursors0F18( ) ;
   }

   public void deferredUpdate0F18( )
   {
   }

   public void delete( )
   {
      beforeValidate0F18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F18( ) ;
         afterConfirm0F18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000F18 */
               pr_default.execute(16, new Object[] {new Long(A2Regi_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_REGIONAL") ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0F18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0F18( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "GEN_REGIONAL" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000F19 */
         pr_default.execute(17, new Object[] {new Short(A5Ciud_Codigo)});
         A7Ciud_Descripcion = T000F19_A7Ciud_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
         A6Dept_Codigo = T000F19_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         pr_default.close(17);
         /* Using cursor T000F20 */
         pr_default.execute(18, new Object[] {new Short(A6Dept_Codigo)});
         A10Dept_Descripcion = T000F20_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = T000F20_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         pr_default.close(18);
         /* Using cursor T000F21 */
         pr_default.execute(19, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T000F21_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000F22 */
         pr_default.execute(20, new Object[] {new Long(A2Regi_Id)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALM_RESTRICCIONES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000F23 */
         pr_default.execute(21, new Object[] {new Long(A2Regi_Id)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CENTRO DE COSTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel0F18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0F18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "gen_regional");
         if ( AnyError == 0 )
         {
            confirmValues0F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "gen_regional");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0F18( )
   {
      /* Scan By routine */
      /* Using cursor T000F24 */
      pr_default.execute(22);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A2Regi_Id = T000F24_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0F18( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A2Regi_Id = T000F24_A2Regi_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      }
   }

   public void scanEnd0F18( )
   {
      pr_default.close(22);
   }

   public void afterConfirm0F18( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A141Regi_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A141Regi_FechaCrea", localUtil.ttoc( A141Regi_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A143Regi_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A143Regi_FechaModifica", localUtil.ttoc( A143Regi_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A140Regi_UsuarioCrea = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A140Regi_UsuarioCrea", A140Regi_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A142Regi_UsuarioModifica = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A142Regi_UsuarioModifica", A142Regi_UsuarioModifica);
      }
      if ( ( A5Ciud_Codigo == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la ciudad de la Regional", 1, "CIUD_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCiud_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(A13Regi_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción de la Regional", 1, "REGI_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegi_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(A9Pais_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe seleccionar el país de la Regional", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ( A6Dept_Codigo == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el departamento de la Regional", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert0F18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0F18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0F18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F18( )
   {
      edtRegi_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Id_Enabled, 5, 0)), true);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), true);
      edtRegi_EtCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_EtCt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_EtCt_Enabled, 5, 0)), true);
      edtRegi_EtCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_EtCo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_EtCo_Enabled, 5, 0)), true);
      edtRegi_EtCf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_EtCf_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_EtCf_Enabled, 5, 0)), true);
      edtRegi_MesArr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_MesArr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_MesArr_Enabled, 5, 0)), true);
      edtRegi_AnoArr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_AnoArr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_AnoArr_Enabled, 5, 0)), true);
      edtRegi_PerAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_PerAct_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_PerAct_Enabled, 5, 0)), true);
      edtRegi_AnoAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_AnoAct_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_AnoAct_Enabled, 5, 0)), true);
      edtRegi_AnoCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_AnoCal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_AnoCal_Enabled, 5, 0)), true);
      edtRegi_NroPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_NroPer_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_NroPer_Enabled, 5, 0)), true);
      edtRegi_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Descripcion_Enabled, 5, 0)), true);
      edtRegi_DirCia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_DirCia_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_DirCia_Enabled, 5, 0)), true);
      edtRegi_NroRif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_NroRif_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_NroRif_Enabled, 5, 0)), true);
      edtRegi_Abrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Abrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Abrev_Enabled, 5, 0)), true);
      edtRegi_TpMvo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_TpMvo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_TpMvo_Enabled, 5, 0)), true);
      edtRegi_CndPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_CndPre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_CndPre_Enabled, 5, 0)), true);
      edtRegi_CndPTes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_CndPTes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_CndPTes_Enabled, 5, 0)), true);
      edtRegi_CndMon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_CndMon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_CndMon_Enabled, 5, 0)), true);
      edtRegi_Graba_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Graba_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Graba_Enabled, 5, 0)), true);
      edtRegi_MesUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_MesUlt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_MesUlt_Enabled, 5, 0)), true);
      edtRegi_AnoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_AnoUlt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_AnoUlt_Enabled, 5, 0)), true);
      edtPais_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Codigo_Enabled, 5, 0)), true);
      edtPais_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Descripcion_Enabled, 5, 0)), true);
      edtDept_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      edtDept_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Descripcion_Enabled, 5, 0)), true);
      edtCiud_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Codigo_Enabled, 5, 0)), true);
      edtCiud_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCiud_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCiud_Descripcion_Enabled, 5, 0)), true);
      edtRegi_Padre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Padre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Padre_Enabled, 5, 0)), true);
      edtRegi_Importar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Importar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Importar_Enabled, 5, 0)), true);
      cmbRegi_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRegi_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRegi_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0F0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414155155");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_regional") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Regi_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z2Regi_Id", GXutil.ltrim( localUtil.ntoc( Z2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z140Regi_UsuarioCrea", Z140Regi_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z142Regi_UsuarioModifica", Z142Regi_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z141Regi_FechaCrea", localUtil.ttoc( Z141Regi_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z143Regi_FechaModifica", localUtil.ttoc( Z143Regi_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z12Regi_Cod", GXutil.ltrim( localUtil.ntoc( Z12Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z144Regi_EtCt", GXutil.ltrim( localUtil.ntoc( Z144Regi_EtCt, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z145Regi_EtCo", GXutil.ltrim( localUtil.ntoc( Z145Regi_EtCo, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z146Regi_EtCf", GXutil.ltrim( localUtil.ntoc( Z146Regi_EtCf, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z147Regi_MesArr", GXutil.ltrim( localUtil.ntoc( Z147Regi_MesArr, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z148Regi_AnoArr", GXutil.ltrim( localUtil.ntoc( Z148Regi_AnoArr, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z149Regi_PerAct", GXutil.ltrim( localUtil.ntoc( Z149Regi_PerAct, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z150Regi_AnoAct", GXutil.ltrim( localUtil.ntoc( Z150Regi_AnoAct, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z151Regi_AnoCal", GXutil.ltrim( localUtil.ntoc( Z151Regi_AnoCal, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z152Regi_NroPer", GXutil.ltrim( localUtil.ntoc( Z152Regi_NroPer, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z13Regi_Descripcion", Z13Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z153Regi_DirCia", Z153Regi_DirCia);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z165Regi_NroRif", Z165Regi_NroRif);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z154Regi_Abrev", Z154Regi_Abrev);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z155Regi_TpMvo", GXutil.ltrim( localUtil.ntoc( Z155Regi_TpMvo, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z156Regi_CndPre", Z156Regi_CndPre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z157Regi_CndPTes", Z157Regi_CndPTes);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z158Regi_CndMon", Z158Regi_CndMon);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z159Regi_Graba", Z159Regi_Graba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z160Regi_MesUlt", GXutil.ltrim( localUtil.ntoc( Z160Regi_MesUlt, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z161Regi_AnoUlt", GXutil.ltrim( localUtil.ntoc( Z161Regi_AnoUlt, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z162Regi_Padre", GXutil.ltrim( localUtil.ntoc( Z162Regi_Padre, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z163Regi_Importar", Z163Regi_Importar);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z164Regi_Estado", GXutil.rtrim( Z164Regi_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z698Regi_Conse_Tran", GXutil.ltrim( localUtil.ntoc( Z698Regi_Conse_Tran, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z5Ciud_Codigo", GXutil.ltrim( localUtil.ntoc( Z5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N5Ciud_Codigo", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV8Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CIUD_CODIGO", GXutil.ltrim( localUtil.ntoc( AV7Insert_Ciud_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_USUARIOCREA", A140Regi_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_USUARIOMODIFICA", A142Regi_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_FECHACREA", localUtil.ttoc( A141Regi_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_FECHAMODIFICA", localUtil.ttoc( A143Regi_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_CONSE_TRAN", GXutil.ltrim( localUtil.ntoc( A698Regi_Conse_Tran, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Regi_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "GEN_REGIONAL" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A698Regi_Conse_Tran), "ZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_regional:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.gen_regional") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Regi_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "GEN_REGIONAL" ;
   }

   public String getPgmdesc( )
   {
      return "Regional" ;
   }

   public void initializeNonKey0F18( )
   {
      A5Ciud_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5Ciud_Codigo", GXutil.ltrim( GXutil.str( A5Ciud_Codigo, 4, 0)));
      A140Regi_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A140Regi_UsuarioCrea", A140Regi_UsuarioCrea);
      A142Regi_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A142Regi_UsuarioModifica", A142Regi_UsuarioModifica);
      A141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A141Regi_FechaCrea", localUtil.ttoc( A141Regi_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A143Regi_FechaModifica", localUtil.ttoc( A143Regi_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A12Regi_Cod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12Regi_Cod", GXutil.ltrim( GXutil.str( A12Regi_Cod, 4, 0)));
      A144Regi_EtCt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A144Regi_EtCt", GXutil.ltrim( GXutil.str( A144Regi_EtCt, 2, 0)));
      A145Regi_EtCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A145Regi_EtCo", GXutil.ltrim( GXutil.str( A145Regi_EtCo, 2, 0)));
      A146Regi_EtCf = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A146Regi_EtCf", GXutil.ltrim( GXutil.str( A146Regi_EtCf, 2, 0)));
      A147Regi_MesArr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A147Regi_MesArr", GXutil.ltrim( GXutil.str( A147Regi_MesArr, 2, 0)));
      A148Regi_AnoArr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A148Regi_AnoArr", GXutil.ltrim( GXutil.str( A148Regi_AnoArr, 4, 0)));
      A149Regi_PerAct = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A149Regi_PerAct", GXutil.ltrim( GXutil.str( A149Regi_PerAct, 2, 0)));
      A150Regi_AnoAct = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A150Regi_AnoAct", GXutil.ltrim( GXutil.str( A150Regi_AnoAct, 4, 0)));
      A151Regi_AnoCal = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A151Regi_AnoCal", GXutil.ltrim( GXutil.str( A151Regi_AnoCal, 4, 0)));
      A152Regi_NroPer = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A152Regi_NroPer", GXutil.ltrim( GXutil.str( A152Regi_NroPer, 2, 0)));
      A13Regi_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13Regi_Descripcion", A13Regi_Descripcion);
      A153Regi_DirCia = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A153Regi_DirCia", A153Regi_DirCia);
      A165Regi_NroRif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A165Regi_NroRif", A165Regi_NroRif);
      A154Regi_Abrev = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A154Regi_Abrev", A154Regi_Abrev);
      A155Regi_TpMvo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A155Regi_TpMvo", GXutil.ltrim( GXutil.str( A155Regi_TpMvo, 2, 0)));
      A156Regi_CndPre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A156Regi_CndPre", A156Regi_CndPre);
      A157Regi_CndPTes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A157Regi_CndPTes", A157Regi_CndPTes);
      A158Regi_CndMon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A158Regi_CndMon", A158Regi_CndMon);
      A159Regi_Graba = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A159Regi_Graba", A159Regi_Graba);
      A160Regi_MesUlt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A160Regi_MesUlt", GXutil.ltrim( GXutil.str( A160Regi_MesUlt, 2, 0)));
      A161Regi_AnoUlt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A161Regi_AnoUlt", GXutil.ltrim( GXutil.str( A161Regi_AnoUlt, 4, 0)));
      A9Pais_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      A11Pais_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      A6Dept_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      A10Dept_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A7Ciud_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7Ciud_Descripcion", A7Ciud_Descripcion);
      A162Regi_Padre = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A162Regi_Padre", GXutil.ltrim( GXutil.str( A162Regi_Padre, 4, 0)));
      A163Regi_Importar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A163Regi_Importar", A163Regi_Importar);
      A164Regi_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A164Regi_Estado", A164Regi_Estado);
      A698Regi_Conse_Tran = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A698Regi_Conse_Tran", GXutil.ltrim( GXutil.str( A698Regi_Conse_Tran, 6, 0)));
      Z140Regi_UsuarioCrea = "" ;
      Z142Regi_UsuarioModifica = "" ;
      Z141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z12Regi_Cod = (short)(0) ;
      Z144Regi_EtCt = (byte)(0) ;
      Z145Regi_EtCo = (byte)(0) ;
      Z146Regi_EtCf = (byte)(0) ;
      Z147Regi_MesArr = (byte)(0) ;
      Z148Regi_AnoArr = (short)(0) ;
      Z149Regi_PerAct = (byte)(0) ;
      Z150Regi_AnoAct = (short)(0) ;
      Z151Regi_AnoCal = (short)(0) ;
      Z152Regi_NroPer = (byte)(0) ;
      Z13Regi_Descripcion = "" ;
      Z153Regi_DirCia = "" ;
      Z165Regi_NroRif = "" ;
      Z154Regi_Abrev = "" ;
      Z155Regi_TpMvo = (byte)(0) ;
      Z156Regi_CndPre = "" ;
      Z157Regi_CndPTes = "" ;
      Z158Regi_CndMon = "" ;
      Z159Regi_Graba = "" ;
      Z160Regi_MesUlt = (byte)(0) ;
      Z161Regi_AnoUlt = (short)(0) ;
      Z162Regi_Padre = (short)(0) ;
      Z163Regi_Importar = "" ;
      Z164Regi_Estado = "" ;
      Z698Regi_Conse_Tran = 0 ;
      Z5Ciud_Codigo = (short)(0) ;
   }

   public void initAll0F18( )
   {
      A2Regi_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      initializeNonKey0F18( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414155177");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gen_regional.js", "?201861414155177");
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
      edtRegi_Id_Internalname = "REGI_ID" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_EtCt_Internalname = "REGI_ETCT" ;
      edtRegi_EtCo_Internalname = "REGI_ETCO" ;
      edtRegi_EtCf_Internalname = "REGI_ETCF" ;
      edtRegi_MesArr_Internalname = "REGI_MESARR" ;
      edtRegi_AnoArr_Internalname = "REGI_ANOARR" ;
      edtRegi_PerAct_Internalname = "REGI_PERACT" ;
      edtRegi_AnoAct_Internalname = "REGI_ANOACT" ;
      edtRegi_AnoCal_Internalname = "REGI_ANOCAL" ;
      edtRegi_NroPer_Internalname = "REGI_NROPER" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      edtRegi_DirCia_Internalname = "REGI_DIRCIA" ;
      edtRegi_NroRif_Internalname = "REGI_NRORIF" ;
      edtRegi_Abrev_Internalname = "REGI_ABREV" ;
      edtRegi_TpMvo_Internalname = "REGI_TPMVO" ;
      edtRegi_CndPre_Internalname = "REGI_CNDPRE" ;
      edtRegi_CndPTes_Internalname = "REGI_CNDPTES" ;
      edtRegi_CndMon_Internalname = "REGI_CNDMON" ;
      edtRegi_Graba_Internalname = "REGI_GRABA" ;
      edtRegi_MesUlt_Internalname = "REGI_MESULT" ;
      edtRegi_AnoUlt_Internalname = "REGI_ANOULT" ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtRegi_Padre_Internalname = "REGI_PADRE" ;
      edtRegi_Importar_Internalname = "REGI_IMPORTAR" ;
      cmbRegi_Estado.setInternalname( "REGI_ESTADO" );
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_5_Internalname = "PROMPT_5" ;
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
      Form.setCaption( "Regional" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbRegi_Estado.setJsonclick( "" );
      cmbRegi_Estado.setEnabled( 1 );
      edtRegi_Importar_Jsonclick = "" ;
      edtRegi_Importar_Enabled = 1 ;
      edtRegi_Padre_Jsonclick = "" ;
      edtRegi_Padre_Enabled = 1 ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Descripcion_Enabled = 0 ;
      imgprompt_5_Visible = 1 ;
      imgprompt_5_Link = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCiud_Codigo_Enabled = 1 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Enabled = 0 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 0 ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Descripcion_Enabled = 0 ;
      edtPais_Codigo_Jsonclick = "" ;
      edtPais_Codigo_Enabled = 0 ;
      edtRegi_AnoUlt_Jsonclick = "" ;
      edtRegi_AnoUlt_Enabled = 1 ;
      edtRegi_MesUlt_Jsonclick = "" ;
      edtRegi_MesUlt_Enabled = 1 ;
      edtRegi_Graba_Jsonclick = "" ;
      edtRegi_Graba_Enabled = 1 ;
      edtRegi_CndMon_Jsonclick = "" ;
      edtRegi_CndMon_Enabled = 1 ;
      edtRegi_CndPTes_Jsonclick = "" ;
      edtRegi_CndPTes_Enabled = 1 ;
      edtRegi_CndPre_Jsonclick = "" ;
      edtRegi_CndPre_Enabled = 1 ;
      edtRegi_TpMvo_Jsonclick = "" ;
      edtRegi_TpMvo_Enabled = 1 ;
      edtRegi_Abrev_Jsonclick = "" ;
      edtRegi_Abrev_Enabled = 1 ;
      edtRegi_NroRif_Jsonclick = "" ;
      edtRegi_NroRif_Enabled = 1 ;
      edtRegi_DirCia_Enabled = 1 ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Descripcion_Enabled = 1 ;
      edtRegi_NroPer_Jsonclick = "" ;
      edtRegi_NroPer_Enabled = 1 ;
      edtRegi_AnoCal_Jsonclick = "" ;
      edtRegi_AnoCal_Enabled = 1 ;
      edtRegi_AnoAct_Jsonclick = "" ;
      edtRegi_AnoAct_Enabled = 1 ;
      edtRegi_PerAct_Jsonclick = "" ;
      edtRegi_PerAct_Enabled = 1 ;
      edtRegi_AnoArr_Jsonclick = "" ;
      edtRegi_AnoArr_Enabled = 1 ;
      edtRegi_MesArr_Jsonclick = "" ;
      edtRegi_MesArr_Enabled = 1 ;
      edtRegi_EtCf_Jsonclick = "" ;
      edtRegi_EtCf_Enabled = 1 ;
      edtRegi_EtCo_Jsonclick = "" ;
      edtRegi_EtCo_Enabled = 1 ;
      edtRegi_EtCt_Jsonclick = "" ;
      edtRegi_EtCt_Enabled = 1 ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Cod_Enabled = 1 ;
      edtRegi_Id_Jsonclick = "" ;
      edtRegi_Id_Enabled = 0 ;
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

   public void valid_Regi_cod( short GX_Parm1 ,
                               long GX_Parm2 )
   {
      A12Regi_Cod = GX_Parm1 ;
      A2Regi_Id = GX_Parm2 ;
      /* Using cursor T000F25 */
      pr_default.execute(23, new Object[] {new Short(A12Regi_Cod), new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código de la Regional"}), 1, "REGI_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegi_Cod_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Pais_codigo( String GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A9Pais_Codigo = GX_Parm1 ;
      A11Pais_Descripcion = GX_Parm2 ;
      /* Using cursor T000F21 */
      pr_default.execute(19, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A11Pais_Descripcion = T000F21_A11Pais_Descripcion[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A11Pais_Descripcion = "" ;
      }
      isValidOutput.add(A11Pais_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Dept_codigo( short GX_Parm1 ,
                                  String GX_Parm2 ,
                                  String GX_Parm3 )
   {
      A6Dept_Codigo = GX_Parm1 ;
      A10Dept_Descripcion = GX_Parm2 ;
      A9Pais_Codigo = GX_Parm3 ;
      /* Using cursor T000F20 */
      pr_default.execute(18, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'DEPARTAMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A10Dept_Descripcion = T000F20_A10Dept_Descripcion[0] ;
      A9Pais_Codigo = T000F20_A9Pais_Codigo[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A10Dept_Descripcion = "" ;
         A9Pais_Codigo = "" ;
      }
      isValidOutput.add(A10Dept_Descripcion);
      isValidOutput.add(A9Pais_Codigo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Ciud_codigo( short GX_Parm1 ,
                                  String GX_Parm2 ,
                                  short GX_Parm3 )
   {
      A5Ciud_Codigo = GX_Parm1 ;
      A7Ciud_Descripcion = GX_Parm2 ;
      A6Dept_Codigo = GX_Parm3 ;
      /* Using cursor T000F19 */
      pr_default.execute(17, new Object[] {new Short(A5Ciud_Codigo)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CIUDAD'.", "ForeignKeyNotFound", 1, "CIUD_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCiud_Codigo_Internalname ;
      }
      A7Ciud_Descripcion = T000F19_A7Ciud_Descripcion[0] ;
      A6Dept_Codigo = T000F19_A6Dept_Codigo[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A7Ciud_Descripcion = "" ;
         A6Dept_Codigo = (short)(0) ;
      }
      isValidOutput.add(A7Ciud_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV8Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120F2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z140Regi_UsuarioCrea = "" ;
      Z142Regi_UsuarioModifica = "" ;
      Z141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z13Regi_Descripcion = "" ;
      Z153Regi_DirCia = "" ;
      Z165Regi_NroRif = "" ;
      Z154Regi_Abrev = "" ;
      Z156Regi_CndPre = "" ;
      Z157Regi_CndPTes = "" ;
      Z158Regi_CndMon = "" ;
      Z159Regi_Graba = "" ;
      Z163Regi_Importar = "" ;
      Z164Regi_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A9Pais_Codigo = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A164Regi_Estado = "" ;
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
      A13Regi_Descripcion = "" ;
      A153Regi_DirCia = "" ;
      A165Regi_NroRif = "" ;
      A154Regi_Abrev = "" ;
      A156Regi_CndPre = "" ;
      A157Regi_CndPTes = "" ;
      A158Regi_CndMon = "" ;
      A159Regi_Graba = "" ;
      A11Pais_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      sImgUrl = "" ;
      A7Ciud_Descripcion = "" ;
      A163Regi_Importar = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A140Regi_UsuarioCrea = "" ;
      A142Regi_UsuarioModifica = "" ;
      A141Regi_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A143Regi_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV15Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode18 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z7Ciud_Descripcion = "" ;
      Z10Dept_Descripcion = "" ;
      Z9Pais_Codigo = "" ;
      Z11Pais_Descripcion = "" ;
      T000F4_A7Ciud_Descripcion = new String[] {""} ;
      T000F4_A6Dept_Codigo = new short[1] ;
      T000F5_A10Dept_Descripcion = new String[] {""} ;
      T000F5_A9Pais_Codigo = new String[] {""} ;
      T000F6_A11Pais_Descripcion = new String[] {""} ;
      T000F7_A2Regi_Id = new long[1] ;
      T000F7_A140Regi_UsuarioCrea = new String[] {""} ;
      T000F7_A142Regi_UsuarioModifica = new String[] {""} ;
      T000F7_A141Regi_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000F7_A143Regi_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000F7_A12Regi_Cod = new short[1] ;
      T000F7_A144Regi_EtCt = new byte[1] ;
      T000F7_A145Regi_EtCo = new byte[1] ;
      T000F7_A146Regi_EtCf = new byte[1] ;
      T000F7_A147Regi_MesArr = new byte[1] ;
      T000F7_A148Regi_AnoArr = new short[1] ;
      T000F7_A149Regi_PerAct = new byte[1] ;
      T000F7_A150Regi_AnoAct = new short[1] ;
      T000F7_A151Regi_AnoCal = new short[1] ;
      T000F7_A152Regi_NroPer = new byte[1] ;
      T000F7_A13Regi_Descripcion = new String[] {""} ;
      T000F7_A153Regi_DirCia = new String[] {""} ;
      T000F7_A165Regi_NroRif = new String[] {""} ;
      T000F7_A154Regi_Abrev = new String[] {""} ;
      T000F7_A155Regi_TpMvo = new byte[1] ;
      T000F7_A156Regi_CndPre = new String[] {""} ;
      T000F7_A157Regi_CndPTes = new String[] {""} ;
      T000F7_A158Regi_CndMon = new String[] {""} ;
      T000F7_A159Regi_Graba = new String[] {""} ;
      T000F7_A160Regi_MesUlt = new byte[1] ;
      T000F7_A161Regi_AnoUlt = new short[1] ;
      T000F7_A11Pais_Descripcion = new String[] {""} ;
      T000F7_A10Dept_Descripcion = new String[] {""} ;
      T000F7_A7Ciud_Descripcion = new String[] {""} ;
      T000F7_A162Regi_Padre = new short[1] ;
      T000F7_A163Regi_Importar = new String[] {""} ;
      T000F7_A164Regi_Estado = new String[] {""} ;
      T000F7_A698Regi_Conse_Tran = new int[1] ;
      T000F7_A5Ciud_Codigo = new short[1] ;
      T000F7_A6Dept_Codigo = new short[1] ;
      T000F7_A9Pais_Codigo = new String[] {""} ;
      T000F8_A12Regi_Cod = new short[1] ;
      T000F9_A7Ciud_Descripcion = new String[] {""} ;
      T000F9_A6Dept_Codigo = new short[1] ;
      T000F10_A10Dept_Descripcion = new String[] {""} ;
      T000F10_A9Pais_Codigo = new String[] {""} ;
      T000F11_A11Pais_Descripcion = new String[] {""} ;
      T000F12_A2Regi_Id = new long[1] ;
      T000F3_A2Regi_Id = new long[1] ;
      T000F3_A140Regi_UsuarioCrea = new String[] {""} ;
      T000F3_A142Regi_UsuarioModifica = new String[] {""} ;
      T000F3_A141Regi_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_A143Regi_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_A12Regi_Cod = new short[1] ;
      T000F3_A144Regi_EtCt = new byte[1] ;
      T000F3_A145Regi_EtCo = new byte[1] ;
      T000F3_A146Regi_EtCf = new byte[1] ;
      T000F3_A147Regi_MesArr = new byte[1] ;
      T000F3_A148Regi_AnoArr = new short[1] ;
      T000F3_A149Regi_PerAct = new byte[1] ;
      T000F3_A150Regi_AnoAct = new short[1] ;
      T000F3_A151Regi_AnoCal = new short[1] ;
      T000F3_A152Regi_NroPer = new byte[1] ;
      T000F3_A13Regi_Descripcion = new String[] {""} ;
      T000F3_A153Regi_DirCia = new String[] {""} ;
      T000F3_A165Regi_NroRif = new String[] {""} ;
      T000F3_A154Regi_Abrev = new String[] {""} ;
      T000F3_A155Regi_TpMvo = new byte[1] ;
      T000F3_A156Regi_CndPre = new String[] {""} ;
      T000F3_A157Regi_CndPTes = new String[] {""} ;
      T000F3_A158Regi_CndMon = new String[] {""} ;
      T000F3_A159Regi_Graba = new String[] {""} ;
      T000F3_A160Regi_MesUlt = new byte[1] ;
      T000F3_A161Regi_AnoUlt = new short[1] ;
      T000F3_A162Regi_Padre = new short[1] ;
      T000F3_A163Regi_Importar = new String[] {""} ;
      T000F3_A164Regi_Estado = new String[] {""} ;
      T000F3_A698Regi_Conse_Tran = new int[1] ;
      T000F3_A5Ciud_Codigo = new short[1] ;
      T000F13_A2Regi_Id = new long[1] ;
      T000F14_A2Regi_Id = new long[1] ;
      T000F2_A2Regi_Id = new long[1] ;
      T000F2_A140Regi_UsuarioCrea = new String[] {""} ;
      T000F2_A142Regi_UsuarioModifica = new String[] {""} ;
      T000F2_A141Regi_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_A143Regi_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_A12Regi_Cod = new short[1] ;
      T000F2_A144Regi_EtCt = new byte[1] ;
      T000F2_A145Regi_EtCo = new byte[1] ;
      T000F2_A146Regi_EtCf = new byte[1] ;
      T000F2_A147Regi_MesArr = new byte[1] ;
      T000F2_A148Regi_AnoArr = new short[1] ;
      T000F2_A149Regi_PerAct = new byte[1] ;
      T000F2_A150Regi_AnoAct = new short[1] ;
      T000F2_A151Regi_AnoCal = new short[1] ;
      T000F2_A152Regi_NroPer = new byte[1] ;
      T000F2_A13Regi_Descripcion = new String[] {""} ;
      T000F2_A153Regi_DirCia = new String[] {""} ;
      T000F2_A165Regi_NroRif = new String[] {""} ;
      T000F2_A154Regi_Abrev = new String[] {""} ;
      T000F2_A155Regi_TpMvo = new byte[1] ;
      T000F2_A156Regi_CndPre = new String[] {""} ;
      T000F2_A157Regi_CndPTes = new String[] {""} ;
      T000F2_A158Regi_CndMon = new String[] {""} ;
      T000F2_A159Regi_Graba = new String[] {""} ;
      T000F2_A160Regi_MesUlt = new byte[1] ;
      T000F2_A161Regi_AnoUlt = new short[1] ;
      T000F2_A162Regi_Padre = new short[1] ;
      T000F2_A163Regi_Importar = new String[] {""} ;
      T000F2_A164Regi_Estado = new String[] {""} ;
      T000F2_A698Regi_Conse_Tran = new int[1] ;
      T000F2_A5Ciud_Codigo = new short[1] ;
      T000F16_A2Regi_Id = new long[1] ;
      T000F19_A7Ciud_Descripcion = new String[] {""} ;
      T000F19_A6Dept_Codigo = new short[1] ;
      T000F20_A10Dept_Descripcion = new String[] {""} ;
      T000F20_A9Pais_Codigo = new String[] {""} ;
      T000F21_A11Pais_Descripcion = new String[] {""} ;
      T000F22_A60Mbod_Id = new long[1] ;
      T000F23_A1Cent_Id = new long[1] ;
      T000F24_A2Regi_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000F25_A12Regi_Cod = new short[1] ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_regional__default(),
         new Object[] {
             new Object[] {
            T000F2_A2Regi_Id, T000F2_A140Regi_UsuarioCrea, T000F2_A142Regi_UsuarioModifica, T000F2_A141Regi_FechaCrea, T000F2_A143Regi_FechaModifica, T000F2_A12Regi_Cod, T000F2_A144Regi_EtCt, T000F2_A145Regi_EtCo, T000F2_A146Regi_EtCf, T000F2_A147Regi_MesArr,
            T000F2_A148Regi_AnoArr, T000F2_A149Regi_PerAct, T000F2_A150Regi_AnoAct, T000F2_A151Regi_AnoCal, T000F2_A152Regi_NroPer, T000F2_A13Regi_Descripcion, T000F2_A153Regi_DirCia, T000F2_A165Regi_NroRif, T000F2_A154Regi_Abrev, T000F2_A155Regi_TpMvo,
            T000F2_A156Regi_CndPre, T000F2_A157Regi_CndPTes, T000F2_A158Regi_CndMon, T000F2_A159Regi_Graba, T000F2_A160Regi_MesUlt, T000F2_A161Regi_AnoUlt, T000F2_A162Regi_Padre, T000F2_A163Regi_Importar, T000F2_A164Regi_Estado, T000F2_A698Regi_Conse_Tran,
            T000F2_A5Ciud_Codigo
            }
            , new Object[] {
            T000F3_A2Regi_Id, T000F3_A140Regi_UsuarioCrea, T000F3_A142Regi_UsuarioModifica, T000F3_A141Regi_FechaCrea, T000F3_A143Regi_FechaModifica, T000F3_A12Regi_Cod, T000F3_A144Regi_EtCt, T000F3_A145Regi_EtCo, T000F3_A146Regi_EtCf, T000F3_A147Regi_MesArr,
            T000F3_A148Regi_AnoArr, T000F3_A149Regi_PerAct, T000F3_A150Regi_AnoAct, T000F3_A151Regi_AnoCal, T000F3_A152Regi_NroPer, T000F3_A13Regi_Descripcion, T000F3_A153Regi_DirCia, T000F3_A165Regi_NroRif, T000F3_A154Regi_Abrev, T000F3_A155Regi_TpMvo,
            T000F3_A156Regi_CndPre, T000F3_A157Regi_CndPTes, T000F3_A158Regi_CndMon, T000F3_A159Regi_Graba, T000F3_A160Regi_MesUlt, T000F3_A161Regi_AnoUlt, T000F3_A162Regi_Padre, T000F3_A163Regi_Importar, T000F3_A164Regi_Estado, T000F3_A698Regi_Conse_Tran,
            T000F3_A5Ciud_Codigo
            }
            , new Object[] {
            T000F4_A7Ciud_Descripcion, T000F4_A6Dept_Codigo
            }
            , new Object[] {
            T000F5_A10Dept_Descripcion, T000F5_A9Pais_Codigo
            }
            , new Object[] {
            T000F6_A11Pais_Descripcion
            }
            , new Object[] {
            T000F7_A2Regi_Id, T000F7_A140Regi_UsuarioCrea, T000F7_A142Regi_UsuarioModifica, T000F7_A141Regi_FechaCrea, T000F7_A143Regi_FechaModifica, T000F7_A12Regi_Cod, T000F7_A144Regi_EtCt, T000F7_A145Regi_EtCo, T000F7_A146Regi_EtCf, T000F7_A147Regi_MesArr,
            T000F7_A148Regi_AnoArr, T000F7_A149Regi_PerAct, T000F7_A150Regi_AnoAct, T000F7_A151Regi_AnoCal, T000F7_A152Regi_NroPer, T000F7_A13Regi_Descripcion, T000F7_A153Regi_DirCia, T000F7_A165Regi_NroRif, T000F7_A154Regi_Abrev, T000F7_A155Regi_TpMvo,
            T000F7_A156Regi_CndPre, T000F7_A157Regi_CndPTes, T000F7_A158Regi_CndMon, T000F7_A159Regi_Graba, T000F7_A160Regi_MesUlt, T000F7_A161Regi_AnoUlt, T000F7_A11Pais_Descripcion, T000F7_A10Dept_Descripcion, T000F7_A7Ciud_Descripcion, T000F7_A162Regi_Padre,
            T000F7_A163Regi_Importar, T000F7_A164Regi_Estado, T000F7_A698Regi_Conse_Tran, T000F7_A5Ciud_Codigo, T000F7_A6Dept_Codigo, T000F7_A9Pais_Codigo
            }
            , new Object[] {
            T000F8_A12Regi_Cod
            }
            , new Object[] {
            T000F9_A7Ciud_Descripcion, T000F9_A6Dept_Codigo
            }
            , new Object[] {
            T000F10_A10Dept_Descripcion, T000F10_A9Pais_Codigo
            }
            , new Object[] {
            T000F11_A11Pais_Descripcion
            }
            , new Object[] {
            T000F12_A2Regi_Id
            }
            , new Object[] {
            T000F13_A2Regi_Id
            }
            , new Object[] {
            T000F14_A2Regi_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000F16_A2Regi_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000F19_A7Ciud_Descripcion, T000F19_A6Dept_Codigo
            }
            , new Object[] {
            T000F20_A10Dept_Descripcion, T000F20_A9Pais_Codigo
            }
            , new Object[] {
            T000F21_A11Pais_Descripcion
            }
            , new Object[] {
            T000F22_A60Mbod_Id
            }
            , new Object[] {
            T000F23_A1Cent_Id
            }
            , new Object[] {
            T000F24_A2Regi_Id
            }
            , new Object[] {
            T000F25_A12Regi_Cod
            }
         }
      );
      AV15Pgmname = "GEN_REGIONAL" ;
   }

   private byte Z144Regi_EtCt ;
   private byte Z145Regi_EtCo ;
   private byte Z146Regi_EtCf ;
   private byte Z147Regi_MesArr ;
   private byte Z149Regi_PerAct ;
   private byte Z152Regi_NroPer ;
   private byte Z155Regi_TpMvo ;
   private byte Z160Regi_MesUlt ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A144Regi_EtCt ;
   private byte A145Regi_EtCo ;
   private byte A146Regi_EtCf ;
   private byte A147Regi_MesArr ;
   private byte A149Regi_PerAct ;
   private byte A152Regi_NroPer ;
   private byte A155Regi_TpMvo ;
   private byte A160Regi_MesUlt ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z12Regi_Cod ;
   private short Z148Regi_AnoArr ;
   private short Z150Regi_AnoAct ;
   private short Z151Regi_AnoCal ;
   private short Z161Regi_AnoUlt ;
   private short Z162Regi_Padre ;
   private short Z5Ciud_Codigo ;
   private short N5Ciud_Codigo ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12Regi_Cod ;
   private short A148Regi_AnoArr ;
   private short A150Regi_AnoAct ;
   private short A151Regi_AnoCal ;
   private short A161Regi_AnoUlt ;
   private short A162Regi_Padre ;
   private short AV7Insert_Ciud_Codigo ;
   private short RcdFound18 ;
   private short Z6Dept_Codigo ;
   private int Z698Regi_Conse_Tran ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRegi_Id_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_EtCt_Enabled ;
   private int edtRegi_EtCo_Enabled ;
   private int edtRegi_EtCf_Enabled ;
   private int edtRegi_MesArr_Enabled ;
   private int edtRegi_AnoArr_Enabled ;
   private int edtRegi_PerAct_Enabled ;
   private int edtRegi_AnoAct_Enabled ;
   private int edtRegi_AnoCal_Enabled ;
   private int edtRegi_NroPer_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int edtRegi_DirCia_Enabled ;
   private int edtRegi_NroRif_Enabled ;
   private int edtRegi_Abrev_Enabled ;
   private int edtRegi_TpMvo_Enabled ;
   private int edtRegi_CndPre_Enabled ;
   private int edtRegi_CndPTes_Enabled ;
   private int edtRegi_CndMon_Enabled ;
   private int edtRegi_Graba_Enabled ;
   private int edtRegi_MesUlt_Enabled ;
   private int edtRegi_AnoUlt_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int edtPais_Descripcion_Enabled ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtCiud_Codigo_Enabled ;
   private int imgprompt_5_Visible ;
   private int edtCiud_Descripcion_Enabled ;
   private int edtRegi_Padre_Enabled ;
   private int edtRegi_Importar_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A698Regi_Conse_Tran ;
   private int AV16GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV8Regi_Id ;
   private long Z2Regi_Id ;
   private long AV8Regi_Id ;
   private long A2Regi_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z164Regi_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A164Regi_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRegi_Cod_Internalname ;
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
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_EtCt_Internalname ;
   private String edtRegi_EtCt_Jsonclick ;
   private String edtRegi_EtCo_Internalname ;
   private String edtRegi_EtCo_Jsonclick ;
   private String edtRegi_EtCf_Internalname ;
   private String edtRegi_EtCf_Jsonclick ;
   private String edtRegi_MesArr_Internalname ;
   private String edtRegi_MesArr_Jsonclick ;
   private String edtRegi_AnoArr_Internalname ;
   private String edtRegi_AnoArr_Jsonclick ;
   private String edtRegi_PerAct_Internalname ;
   private String edtRegi_PerAct_Jsonclick ;
   private String edtRegi_AnoAct_Internalname ;
   private String edtRegi_AnoAct_Jsonclick ;
   private String edtRegi_AnoCal_Internalname ;
   private String edtRegi_AnoCal_Jsonclick ;
   private String edtRegi_NroPer_Internalname ;
   private String edtRegi_NroPer_Jsonclick ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtRegi_DirCia_Internalname ;
   private String edtRegi_NroRif_Internalname ;
   private String edtRegi_NroRif_Jsonclick ;
   private String edtRegi_Abrev_Internalname ;
   private String edtRegi_Abrev_Jsonclick ;
   private String edtRegi_TpMvo_Internalname ;
   private String edtRegi_TpMvo_Jsonclick ;
   private String edtRegi_CndPre_Internalname ;
   private String edtRegi_CndPre_Jsonclick ;
   private String edtRegi_CndPTes_Internalname ;
   private String edtRegi_CndPTes_Jsonclick ;
   private String edtRegi_CndMon_Internalname ;
   private String edtRegi_CndMon_Jsonclick ;
   private String edtRegi_Graba_Internalname ;
   private String edtRegi_Graba_Jsonclick ;
   private String edtRegi_MesUlt_Internalname ;
   private String edtRegi_MesUlt_Jsonclick ;
   private String edtRegi_AnoUlt_Internalname ;
   private String edtRegi_AnoUlt_Jsonclick ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_5_Internalname ;
   private String imgprompt_5_Link ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtRegi_Padre_Internalname ;
   private String edtRegi_Padre_Jsonclick ;
   private String edtRegi_Importar_Internalname ;
   private String edtRegi_Importar_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV15Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode18 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z141Regi_FechaCrea ;
   private java.util.Date Z143Regi_FechaModifica ;
   private java.util.Date A141Regi_FechaCrea ;
   private java.util.Date A143Regi_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z140Regi_UsuarioCrea ;
   private String Z142Regi_UsuarioModifica ;
   private String Z13Regi_Descripcion ;
   private String Z153Regi_DirCia ;
   private String Z165Regi_NroRif ;
   private String Z154Regi_Abrev ;
   private String Z156Regi_CndPre ;
   private String Z157Regi_CndPTes ;
   private String Z158Regi_CndMon ;
   private String Z159Regi_Graba ;
   private String Z163Regi_Importar ;
   private String A9Pais_Codigo ;
   private String A13Regi_Descripcion ;
   private String A153Regi_DirCia ;
   private String A165Regi_NroRif ;
   private String A154Regi_Abrev ;
   private String A156Regi_CndPre ;
   private String A157Regi_CndPTes ;
   private String A158Regi_CndMon ;
   private String A159Regi_Graba ;
   private String A11Pais_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A163Regi_Importar ;
   private String A140Regi_UsuarioCrea ;
   private String A142Regi_UsuarioModifica ;
   private String AV12Usuario ;
   private String Z7Ciud_Descripcion ;
   private String Z10Dept_Descripcion ;
   private String Z9Pais_Codigo ;
   private String Z11Pais_Descripcion ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbRegi_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T000F4_A7Ciud_Descripcion ;
   private short[] T000F4_A6Dept_Codigo ;
   private String[] T000F5_A10Dept_Descripcion ;
   private String[] T000F5_A9Pais_Codigo ;
   private String[] T000F6_A11Pais_Descripcion ;
   private long[] T000F7_A2Regi_Id ;
   private String[] T000F7_A140Regi_UsuarioCrea ;
   private String[] T000F7_A142Regi_UsuarioModifica ;
   private java.util.Date[] T000F7_A141Regi_FechaCrea ;
   private java.util.Date[] T000F7_A143Regi_FechaModifica ;
   private short[] T000F7_A12Regi_Cod ;
   private byte[] T000F7_A144Regi_EtCt ;
   private byte[] T000F7_A145Regi_EtCo ;
   private byte[] T000F7_A146Regi_EtCf ;
   private byte[] T000F7_A147Regi_MesArr ;
   private short[] T000F7_A148Regi_AnoArr ;
   private byte[] T000F7_A149Regi_PerAct ;
   private short[] T000F7_A150Regi_AnoAct ;
   private short[] T000F7_A151Regi_AnoCal ;
   private byte[] T000F7_A152Regi_NroPer ;
   private String[] T000F7_A13Regi_Descripcion ;
   private String[] T000F7_A153Regi_DirCia ;
   private String[] T000F7_A165Regi_NroRif ;
   private String[] T000F7_A154Regi_Abrev ;
   private byte[] T000F7_A155Regi_TpMvo ;
   private String[] T000F7_A156Regi_CndPre ;
   private String[] T000F7_A157Regi_CndPTes ;
   private String[] T000F7_A158Regi_CndMon ;
   private String[] T000F7_A159Regi_Graba ;
   private byte[] T000F7_A160Regi_MesUlt ;
   private short[] T000F7_A161Regi_AnoUlt ;
   private String[] T000F7_A11Pais_Descripcion ;
   private String[] T000F7_A10Dept_Descripcion ;
   private String[] T000F7_A7Ciud_Descripcion ;
   private short[] T000F7_A162Regi_Padre ;
   private String[] T000F7_A163Regi_Importar ;
   private String[] T000F7_A164Regi_Estado ;
   private int[] T000F7_A698Regi_Conse_Tran ;
   private short[] T000F7_A5Ciud_Codigo ;
   private short[] T000F7_A6Dept_Codigo ;
   private String[] T000F7_A9Pais_Codigo ;
   private short[] T000F8_A12Regi_Cod ;
   private String[] T000F9_A7Ciud_Descripcion ;
   private short[] T000F9_A6Dept_Codigo ;
   private String[] T000F10_A10Dept_Descripcion ;
   private String[] T000F10_A9Pais_Codigo ;
   private String[] T000F11_A11Pais_Descripcion ;
   private long[] T000F12_A2Regi_Id ;
   private long[] T000F3_A2Regi_Id ;
   private String[] T000F3_A140Regi_UsuarioCrea ;
   private String[] T000F3_A142Regi_UsuarioModifica ;
   private java.util.Date[] T000F3_A141Regi_FechaCrea ;
   private java.util.Date[] T000F3_A143Regi_FechaModifica ;
   private short[] T000F3_A12Regi_Cod ;
   private byte[] T000F3_A144Regi_EtCt ;
   private byte[] T000F3_A145Regi_EtCo ;
   private byte[] T000F3_A146Regi_EtCf ;
   private byte[] T000F3_A147Regi_MesArr ;
   private short[] T000F3_A148Regi_AnoArr ;
   private byte[] T000F3_A149Regi_PerAct ;
   private short[] T000F3_A150Regi_AnoAct ;
   private short[] T000F3_A151Regi_AnoCal ;
   private byte[] T000F3_A152Regi_NroPer ;
   private String[] T000F3_A13Regi_Descripcion ;
   private String[] T000F3_A153Regi_DirCia ;
   private String[] T000F3_A165Regi_NroRif ;
   private String[] T000F3_A154Regi_Abrev ;
   private byte[] T000F3_A155Regi_TpMvo ;
   private String[] T000F3_A156Regi_CndPre ;
   private String[] T000F3_A157Regi_CndPTes ;
   private String[] T000F3_A158Regi_CndMon ;
   private String[] T000F3_A159Regi_Graba ;
   private byte[] T000F3_A160Regi_MesUlt ;
   private short[] T000F3_A161Regi_AnoUlt ;
   private short[] T000F3_A162Regi_Padre ;
   private String[] T000F3_A163Regi_Importar ;
   private String[] T000F3_A164Regi_Estado ;
   private int[] T000F3_A698Regi_Conse_Tran ;
   private short[] T000F3_A5Ciud_Codigo ;
   private long[] T000F13_A2Regi_Id ;
   private long[] T000F14_A2Regi_Id ;
   private long[] T000F2_A2Regi_Id ;
   private String[] T000F2_A140Regi_UsuarioCrea ;
   private String[] T000F2_A142Regi_UsuarioModifica ;
   private java.util.Date[] T000F2_A141Regi_FechaCrea ;
   private java.util.Date[] T000F2_A143Regi_FechaModifica ;
   private short[] T000F2_A12Regi_Cod ;
   private byte[] T000F2_A144Regi_EtCt ;
   private byte[] T000F2_A145Regi_EtCo ;
   private byte[] T000F2_A146Regi_EtCf ;
   private byte[] T000F2_A147Regi_MesArr ;
   private short[] T000F2_A148Regi_AnoArr ;
   private byte[] T000F2_A149Regi_PerAct ;
   private short[] T000F2_A150Regi_AnoAct ;
   private short[] T000F2_A151Regi_AnoCal ;
   private byte[] T000F2_A152Regi_NroPer ;
   private String[] T000F2_A13Regi_Descripcion ;
   private String[] T000F2_A153Regi_DirCia ;
   private String[] T000F2_A165Regi_NroRif ;
   private String[] T000F2_A154Regi_Abrev ;
   private byte[] T000F2_A155Regi_TpMvo ;
   private String[] T000F2_A156Regi_CndPre ;
   private String[] T000F2_A157Regi_CndPTes ;
   private String[] T000F2_A158Regi_CndMon ;
   private String[] T000F2_A159Regi_Graba ;
   private byte[] T000F2_A160Regi_MesUlt ;
   private short[] T000F2_A161Regi_AnoUlt ;
   private short[] T000F2_A162Regi_Padre ;
   private String[] T000F2_A163Regi_Importar ;
   private String[] T000F2_A164Regi_Estado ;
   private int[] T000F2_A698Regi_Conse_Tran ;
   private short[] T000F2_A5Ciud_Codigo ;
   private long[] T000F16_A2Regi_Id ;
   private String[] T000F19_A7Ciud_Descripcion ;
   private short[] T000F19_A6Dept_Codigo ;
   private String[] T000F20_A10Dept_Descripcion ;
   private String[] T000F20_A9Pais_Codigo ;
   private String[] T000F21_A11Pais_Descripcion ;
   private long[] T000F22_A60Mbod_Id ;
   private long[] T000F23_A1Cent_Id ;
   private long[] T000F24_A2Regi_Id ;
   private short[] T000F25_A12Regi_Cod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class gen_regional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000F2", "SELECT Regi_Id, Regi_UsuarioCrea, Regi_UsuarioModifica, Regi_FechaCrea, Regi_FechaModifica, Regi_Cod, Regi_EtCt, Regi_EtCo, Regi_EtCf, Regi_MesArr, Regi_AnoArr, Regi_PerAct, Regi_AnoAct, Regi_AnoCal, Regi_NroPer, Regi_Descripcion, Regi_DirCia, Regi_NroRif, Regi_Abrev, Regi_TpMvo, Regi_CndPre, Regi_CndPTes, Regi_CndMon, Regi_Graba, Regi_MesUlt, Regi_AnoUlt, Regi_Padre, Regi_Importar, Regi_Estado, Regi_Conse_Tran, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ?  FOR UPDATE OF Regi_UsuarioCrea, Regi_UsuarioModifica, Regi_FechaCrea, Regi_FechaModifica, Regi_Cod, Regi_EtCt, Regi_EtCo, Regi_EtCf, Regi_MesArr, Regi_AnoArr, Regi_PerAct, Regi_AnoAct, Regi_AnoCal, Regi_NroPer, Regi_Descripcion, Regi_DirCia, Regi_NroRif, Regi_Abrev, Regi_TpMvo, Regi_CndPre, Regi_CndPTes, Regi_CndMon, Regi_Graba, Regi_MesUlt, Regi_AnoUlt, Regi_Padre, Regi_Importar, Regi_Estado, Regi_Conse_Tran, Ciud_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F3", "SELECT Regi_Id, Regi_UsuarioCrea, Regi_UsuarioModifica, Regi_FechaCrea, Regi_FechaModifica, Regi_Cod, Regi_EtCt, Regi_EtCo, Regi_EtCf, Regi_MesArr, Regi_AnoArr, Regi_PerAct, Regi_AnoAct, Regi_AnoCal, Regi_NroPer, Regi_Descripcion, Regi_DirCia, Regi_NroRif, Regi_Abrev, Regi_TpMvo, Regi_CndPre, Regi_CndPTes, Regi_CndMon, Regi_Graba, Regi_MesUlt, Regi_AnoUlt, Regi_Padre, Regi_Importar, Regi_Estado, Regi_Conse_Tran, Ciud_Codigo FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F4", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F5", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F6", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Regi_Id, TM1.Regi_UsuarioCrea, TM1.Regi_UsuarioModifica, TM1.Regi_FechaCrea, TM1.Regi_FechaModifica, TM1.Regi_Cod, TM1.Regi_EtCt, TM1.Regi_EtCo, TM1.Regi_EtCf, TM1.Regi_MesArr, TM1.Regi_AnoArr, TM1.Regi_PerAct, TM1.Regi_AnoAct, TM1.Regi_AnoCal, TM1.Regi_NroPer, TM1.Regi_Descripcion, TM1.Regi_DirCia, TM1.Regi_NroRif, TM1.Regi_Abrev, TM1.Regi_TpMvo, TM1.Regi_CndPre, TM1.Regi_CndPTes, TM1.Regi_CndMon, TM1.Regi_Graba, TM1.Regi_MesUlt, TM1.Regi_AnoUlt, T4.Pais_Descripcion, T3.Dept_Descripcion, T2.Ciud_Descripcion, TM1.Regi_Padre, TM1.Regi_Importar, TM1.Regi_Estado, TM1.Regi_Conse_Tran, TM1.Ciud_Codigo, T2.Dept_Codigo, T3.Pais_Codigo FROM (((GEN_REGIONAL TM1 INNER JOIN GEN_CIUDAD T2 ON T2.Ciud_Codigo = TM1.Ciud_Codigo) INNER JOIN GEN_DEPARTAMENTO T3 ON T3.Dept_Codigo = T2.Dept_Codigo) INNER JOIN GEN_PAIS T4 ON T4.Pais_Codigo = T3.Pais_Codigo) WHERE TM1.Regi_Id = ? ORDER BY TM1.Regi_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F8", "SELECT Regi_Cod FROM GEN_REGIONAL WHERE (Regi_Cod = ?) AND (Not ( Regi_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F9", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F10", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F11", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F12", "SELECT /*+ FIRST_ROWS(1) */ Regi_Id FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Regi_Id FROM GEN_REGIONAL WHERE ( Regi_Id > ?) ORDER BY Regi_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Regi_Id FROM GEN_REGIONAL WHERE ( Regi_Id < ?) ORDER BY Regi_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000F15", "INSERT INTO GEN_REGIONAL(Regi_UsuarioCrea, Regi_UsuarioModifica, Regi_FechaCrea, Regi_FechaModifica, Regi_Cod, Regi_EtCt, Regi_EtCo, Regi_EtCf, Regi_MesArr, Regi_AnoArr, Regi_PerAct, Regi_AnoAct, Regi_AnoCal, Regi_NroPer, Regi_Descripcion, Regi_DirCia, Regi_NroRif, Regi_Abrev, Regi_TpMvo, Regi_CndPre, Regi_CndPTes, Regi_CndMon, Regi_Graba, Regi_MesUlt, Regi_AnoUlt, Regi_Padre, Regi_Importar, Regi_Estado, Regi_Conse_Tran, Ciud_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "GEN_REGIONAL")
         ,new ForEachCursor("T000F16", "SELECT Regi_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000F17", "UPDATE GEN_REGIONAL SET Regi_UsuarioCrea=?, Regi_UsuarioModifica=?, Regi_FechaCrea=?, Regi_FechaModifica=?, Regi_Cod=?, Regi_EtCt=?, Regi_EtCo=?, Regi_EtCf=?, Regi_MesArr=?, Regi_AnoArr=?, Regi_PerAct=?, Regi_AnoAct=?, Regi_AnoCal=?, Regi_NroPer=?, Regi_Descripcion=?, Regi_DirCia=?, Regi_NroRif=?, Regi_Abrev=?, Regi_TpMvo=?, Regi_CndPre=?, Regi_CndPTes=?, Regi_CndMon=?, Regi_Graba=?, Regi_MesUlt=?, Regi_AnoUlt=?, Regi_Padre=?, Regi_Importar=?, Regi_Estado=?, Regi_Conse_Tran=?, Ciud_Codigo=?  WHERE Regi_Id = ?", GX_NOMASK, "GEN_REGIONAL")
         ,new UpdateCursor("T000F18", "DELETE FROM GEN_REGIONAL  WHERE Regi_Id = ?", GX_NOMASK, "GEN_REGIONAL")
         ,new ForEachCursor("T000F19", "SELECT Ciud_Descripcion, Dept_Codigo FROM GEN_CIUDAD WHERE Ciud_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F20", "SELECT Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F21", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F22", "SELECT * FROM (SELECT Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_RegionId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F23", "SELECT * FROM (SELECT Cent_Id FROM GEN_CENTROCOSTO WHERE Regi_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F24", "SELECT /*+ FIRST_ROWS(100) */ Regi_Id FROM GEN_REGIONAL ORDER BY Regi_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F25", "SELECT Regi_Cod FROM GEN_REGIONAL WHERE (Regi_Cod = ?) AND (Not ( Regi_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((byte[]) buf[6])[0] = rslt.getByte(7) ;
               ((byte[]) buf[7])[0] = rslt.getByte(8) ;
               ((byte[]) buf[8])[0] = rslt.getByte(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((byte[]) buf[14])[0] = rslt.getByte(15) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((byte[]) buf[19])[0] = rslt.getByte(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(24) ;
               ((byte[]) buf[24])[0] = rslt.getByte(25) ;
               ((short[]) buf[25])[0] = rslt.getShort(26) ;
               ((short[]) buf[26])[0] = rslt.getShort(27) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[28])[0] = rslt.getString(29, 1) ;
               ((int[]) buf[29])[0] = rslt.getInt(30) ;
               ((short[]) buf[30])[0] = rslt.getShort(31) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((byte[]) buf[6])[0] = rslt.getByte(7) ;
               ((byte[]) buf[7])[0] = rslt.getByte(8) ;
               ((byte[]) buf[8])[0] = rslt.getByte(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((byte[]) buf[14])[0] = rslt.getByte(15) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((byte[]) buf[19])[0] = rslt.getByte(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(24) ;
               ((byte[]) buf[24])[0] = rslt.getByte(25) ;
               ((short[]) buf[25])[0] = rslt.getShort(26) ;
               ((short[]) buf[26])[0] = rslt.getShort(27) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[28])[0] = rslt.getString(29, 1) ;
               ((int[]) buf[29])[0] = rslt.getInt(30) ;
               ((short[]) buf[30])[0] = rslt.getShort(31) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((byte[]) buf[6])[0] = rslt.getByte(7) ;
               ((byte[]) buf[7])[0] = rslt.getByte(8) ;
               ((byte[]) buf[8])[0] = rslt.getByte(9) ;
               ((byte[]) buf[9])[0] = rslt.getByte(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((short[]) buf[12])[0] = rslt.getShort(13) ;
               ((short[]) buf[13])[0] = rslt.getShort(14) ;
               ((byte[]) buf[14])[0] = rslt.getByte(15) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(19) ;
               ((byte[]) buf[19])[0] = rslt.getByte(20) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(24) ;
               ((byte[]) buf[24])[0] = rslt.getByte(25) ;
               ((short[]) buf[25])[0] = rslt.getShort(26) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(27) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(28) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(29) ;
               ((short[]) buf[29])[0] = rslt.getShort(30) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(31) ;
               ((String[]) buf[31])[0] = rslt.getString(32, 1) ;
               ((int[]) buf[32])[0] = rslt.getInt(33) ;
               ((short[]) buf[33])[0] = rslt.getShort(34) ;
               ((short[]) buf[34])[0] = rslt.getShort(35) ;
               ((String[]) buf[35])[0] = rslt.getVarchar(36) ;
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 23 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setVarchar(15, (String)parms[14], 50, false);
               stmt.setVarchar(16, (String)parms[15], 1024, false);
               stmt.setVarchar(17, (String)parms[16], 15, false);
               stmt.setVarchar(18, (String)parms[17], 15, false);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setVarchar(20, (String)parms[19], 1, false);
               stmt.setVarchar(21, (String)parms[20], 1, false);
               stmt.setVarchar(22, (String)parms[21], 1, false);
               stmt.setVarchar(23, (String)parms[22], 1, false);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setVarchar(27, (String)parms[26], 1, false);
               stmt.setString(28, (String)parms[27], 1);
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setVarchar(15, (String)parms[14], 50, false);
               stmt.setVarchar(16, (String)parms[15], 1024, false);
               stmt.setVarchar(17, (String)parms[16], 15, false);
               stmt.setVarchar(18, (String)parms[17], 15, false);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setVarchar(20, (String)parms[19], 1, false);
               stmt.setVarchar(21, (String)parms[20], 1, false);
               stmt.setVarchar(22, (String)parms[21], 1, false);
               stmt.setVarchar(23, (String)parms[22], 1, false);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setVarchar(27, (String)parms[26], 1, false);
               stmt.setString(28, (String)parms[27], 1);
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setLong(31, ((Number) parms[30]).longValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 18 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 23 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

