/*
               File: alm_cat_fam_impl
        Description: Familia del catálogo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:17.81
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

public final  class alm_cat_fam_impl extends GXDataArea
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
         A75SEG_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A75SEG_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A74TIP_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A74TIP_Codigo) ;
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
            AV9FAM_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9FAM_Codigo", AV9FAM_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vFAM_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9FAM_Codigo, ""))));
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
         Form.getMeta().addItem("description", "Familia del catálogo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtFAM_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_cat_fam_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cat_fam_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cat_fam_impl.class ));
   }

   public alm_cat_fam_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Familia del catálogo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Codigo_Internalname, "Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Codigo_Internalname, A35FAM_Codigo, GXutil.rtrim( localUtil.format( A35FAM_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Codigo_Enabled, 1, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Descripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Descripcion_Internalname, A447FAM_Descripcion, GXutil.rtrim( localUtil.format( A447FAM_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Codigo_Internalname, "Segmento Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_FAM.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_75_Internalname, sImgUrl, imgprompt_75_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_75_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Descripcion_Internalname, "Segmento Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Codigo_Internalname, "Tipo Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Descripcion_Internalname, "Tipo Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_UsuarioCreacion_Internalname, A448FAM_UsuarioCreacion, GXutil.rtrim( localUtil.format( A448FAM_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtFAM_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_FechaCreacion_Internalname, localUtil.ttoc( A449FAM_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A449FAM_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtFAM_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFAM_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_UsuarioModifica_Internalname, A450FAM_UsuarioModifica, GXutil.rtrim( localUtil.format( A450FAM_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_FAM.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_FechaModifica_Internalname, "Fecha Moficia", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtFAM_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_FechaModifica_Internalname, localUtil.ttoc( A451FAM_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A451FAM_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtFAM_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFAM_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_FAM.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_FAM.htm");
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
      e11172 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
            A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
            A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
            A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
            A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
            A448FAM_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtFAM_UsuarioCreacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A448FAM_UsuarioCreacion", A448FAM_UsuarioCreacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtFAM_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FAM_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFAM_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A449FAM_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtFAM_FechaCreacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            A450FAM_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtFAM_UsuarioModifica_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A450FAM_UsuarioModifica", A450FAM_UsuarioModifica);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtFAM_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FAM_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFAM_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A451FAM_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtFAM_FechaModifica_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            /* Read saved values. */
            Z35FAM_Codigo = httpContext.cgiGet( "Z35FAM_Codigo") ;
            Z448FAM_UsuarioCreacion = httpContext.cgiGet( "Z448FAM_UsuarioCreacion") ;
            Z450FAM_UsuarioModifica = httpContext.cgiGet( "Z450FAM_UsuarioModifica") ;
            Z449FAM_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z449FAM_FechaCreacion"), 0) ;
            Z451FAM_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z451FAM_FechaModifica"), 0) ;
            Z447FAM_Descripcion = httpContext.cgiGet( "Z447FAM_Descripcion") ;
            Z75SEG_Codigo = httpContext.cgiGet( "Z75SEG_Codigo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N75SEG_Codigo = httpContext.cgiGet( "N75SEG_Codigo") ;
            AV9FAM_Codigo = httpContext.cgiGet( "vFAM_CODIGO") ;
            AV15Insert_SEG_Codigo = httpContext.cgiGet( "vINSERT_SEG_CODIGO") ;
            AV14Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV17Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CAT_FAM" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A35FAM_Codigo, Z35FAM_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_cat_fam:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A35FAM_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
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
                  sMode44 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode44 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound44 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_170( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FAM_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFAM_Codigo_Internalname ;
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
                        e11172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12172 ();
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
         e12172 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1744( ) ;
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
         disableAttributes1744( ) ;
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

   public void confirm_170( )
   {
      beforeValidate1744( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1744( ) ;
         }
         else
         {
            checkExtendedTable1744( ) ;
            closeExtendedTableCursors1744( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption170( )
   {
   }

   public void e11172( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV17Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV17Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      AV15Insert_SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_SEG_Codigo", AV15Insert_SEG_Codigo);
      if ( ( GXutil.strcmp(AV12TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV17Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV18GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18GXV1", GXutil.ltrim( GXutil.str( AV18GXV1, 8, 0)));
         while ( AV18GXV1 <= AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV12TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV18GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "SEG_Codigo") == 0 )
            {
               AV15Insert_SEG_Codigo = AV16TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_SEG_Codigo", AV15Insert_SEG_Codigo);
            }
            AV18GXV1 = (int)(AV18GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18GXV1", GXutil.ltrim( GXutil.str( AV18GXV1, 8, 0)));
         }
      }
      AV14Usuario = AV13WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Usuario", AV14Usuario);
   }

   public void e12172( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV12TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_cat_fam") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1744( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z448FAM_UsuarioCreacion = T00173_A448FAM_UsuarioCreacion[0] ;
            Z450FAM_UsuarioModifica = T00173_A450FAM_UsuarioModifica[0] ;
            Z449FAM_FechaCreacion = T00173_A449FAM_FechaCreacion[0] ;
            Z451FAM_FechaModifica = T00173_A451FAM_FechaModifica[0] ;
            Z447FAM_Descripcion = T00173_A447FAM_Descripcion[0] ;
            Z75SEG_Codigo = T00173_A75SEG_Codigo[0] ;
         }
         else
         {
            Z448FAM_UsuarioCreacion = A448FAM_UsuarioCreacion ;
            Z450FAM_UsuarioModifica = A450FAM_UsuarioModifica ;
            Z449FAM_FechaCreacion = A449FAM_FechaCreacion ;
            Z451FAM_FechaModifica = A451FAM_FechaModifica ;
            Z447FAM_Descripcion = A447FAM_Descripcion ;
            Z75SEG_Codigo = A75SEG_Codigo ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z35FAM_Codigo = A35FAM_Codigo ;
         Z448FAM_UsuarioCreacion = A448FAM_UsuarioCreacion ;
         Z450FAM_UsuarioModifica = A450FAM_UsuarioModifica ;
         Z449FAM_FechaCreacion = A449FAM_FechaCreacion ;
         Z451FAM_FechaModifica = A451FAM_FechaModifica ;
         Z447FAM_Descripcion = A447FAM_Descripcion ;
         Z75SEG_Codigo = A75SEG_Codigo ;
         Z442SEG_Descripcion = A442SEG_Descripcion ;
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_75_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0170"+"',["+"{Ctrl:gx.dom.el('"+"SEG_CODIGO"+"'), id:'"+"SEG_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV9FAM_Codigo)==0) )
      {
         A35FAM_Codigo = AV9FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV9FAM_Codigo)==0) )
      {
         edtFAM_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtFAM_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV9FAM_Codigo)==0) )
      {
         edtFAM_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_SEG_Codigo)==0) )
      {
         edtSEG_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtSEG_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_SEG_Codigo)==0) )
      {
         A75SEG_Codigo = AV15Insert_SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
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
         AV17Pgmname = "ALM_CAT_FAM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T00174 */
         pr_default.execute(2, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T00174_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T00174_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(2);
         /* Using cursor T00175 */
         pr_default.execute(3, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T00175_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(3);
      }
   }

   public void load1744( )
   {
      /* Using cursor T00176 */
      pr_default.execute(4, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A448FAM_UsuarioCreacion = T00176_A448FAM_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A448FAM_UsuarioCreacion", A448FAM_UsuarioCreacion);
         A450FAM_UsuarioModifica = T00176_A450FAM_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FAM_UsuarioModifica", A450FAM_UsuarioModifica);
         A449FAM_FechaCreacion = T00176_A449FAM_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A451FAM_FechaModifica = T00176_A451FAM_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A447FAM_Descripcion = T00176_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A442SEG_Descripcion = T00176_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A435TIP_Descripcion = T00176_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         A75SEG_Codigo = T00176_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         A74TIP_Codigo = T00176_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         zm1744( -13) ;
      }
      pr_default.close(4);
      onLoadActions1744( ) ;
   }

   public void onLoadActions1744( )
   {
      AV17Pgmname = "ALM_CAT_FAM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
   }

   public void checkExtendedTable1744( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV17Pgmname = "ALM_CAT_FAM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      /* Using cursor T00174 */
      pr_default.execute(2, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "SEG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSEG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A442SEG_Descripcion = T00174_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T00174_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      pr_default.close(2);
      /* Using cursor T00175 */
      pr_default.execute(3, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T00175_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1744( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A75SEG_Codigo )
   {
      /* Using cursor T00177 */
      pr_default.execute(5, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "SEG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSEG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A442SEG_Descripcion = T00177_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T00177_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A442SEG_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A74TIP_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(5);
   }

   public void gxload_15( String A74TIP_Codigo )
   {
      /* Using cursor T00178 */
      pr_default.execute(6, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T00178_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A435TIP_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void getKey1744( )
   {
      /* Using cursor T00179 */
      pr_default.execute(7, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00173 */
      pr_default.execute(1, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1744( 13) ;
         RcdFound44 = (short)(1) ;
         A35FAM_Codigo = T00173_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         A448FAM_UsuarioCreacion = T00173_A448FAM_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A448FAM_UsuarioCreacion", A448FAM_UsuarioCreacion);
         A450FAM_UsuarioModifica = T00173_A450FAM_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FAM_UsuarioModifica", A450FAM_UsuarioModifica);
         A449FAM_FechaCreacion = T00173_A449FAM_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A451FAM_FechaModifica = T00173_A451FAM_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A447FAM_Descripcion = T00173_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T00173_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         Z35FAM_Codigo = A35FAM_Codigo ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1744( ) ;
         if ( AnyError == 1 )
         {
            RcdFound44 = (short)(0) ;
            initializeNonKey1744( ) ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey1744( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1744( ) ;
      if ( RcdFound44 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound44 = (short)(0) ;
      /* Using cursor T001710 */
      pr_default.execute(8, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001710_A35FAM_Codigo[0], A35FAM_Codigo) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001710_A35FAM_Codigo[0], A35FAM_Codigo) > 0 ) ) )
         {
            A35FAM_Codigo = T001710_A35FAM_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound44 = (short)(0) ;
      /* Using cursor T001711 */
      pr_default.execute(9, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001711_A35FAM_Codigo[0], A35FAM_Codigo) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001711_A35FAM_Codigo[0], A35FAM_Codigo) < 0 ) ) )
         {
            A35FAM_Codigo = T001711_A35FAM_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1744( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtFAM_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1744( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound44 == 1 )
         {
            if ( GXutil.strcmp(A35FAM_Codigo, Z35FAM_Codigo) != 0 )
            {
               A35FAM_Codigo = Z35FAM_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FAM_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFAM_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFAM_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1744( ) ;
               GX_FocusControl = edtFAM_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A35FAM_Codigo, Z35FAM_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtFAM_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1744( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FAM_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFAM_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFAM_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1744( ) ;
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
      if ( GXutil.strcmp(A35FAM_Codigo, Z35FAM_Codigo) != 0 )
      {
         A35FAM_Codigo = Z35FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FAM_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFAM_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFAM_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1744( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00172 */
         pr_default.execute(0, new Object[] {A35FAM_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_FAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z448FAM_UsuarioCreacion, T00172_A448FAM_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z450FAM_UsuarioModifica, T00172_A450FAM_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z449FAM_FechaCreacion, T00172_A449FAM_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z451FAM_FechaModifica, T00172_A451FAM_FechaModifica[0]) ) || ( GXutil.strcmp(Z447FAM_Descripcion, T00172_A447FAM_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z75SEG_Codigo, T00172_A75SEG_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CAT_FAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1744( )
   {
      beforeValidate1744( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1744( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1744( 0) ;
         checkOptimisticConcurrency1744( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1744( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1744( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001712 */
                  pr_default.execute(10, new Object[] {A35FAM_Codigo, A448FAM_UsuarioCreacion, A450FAM_UsuarioModifica, A449FAM_FechaCreacion, A451FAM_FechaModifica, A447FAM_Descripcion, A75SEG_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_FAM") ;
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption170( ) ;
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
            load1744( ) ;
         }
         endLevel1744( ) ;
      }
      closeExtendedTableCursors1744( ) ;
   }

   public void update1744( )
   {
      beforeValidate1744( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1744( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1744( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1744( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1744( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001713 */
                  pr_default.execute(11, new Object[] {A448FAM_UsuarioCreacion, A450FAM_UsuarioModifica, A449FAM_FechaCreacion, A451FAM_FechaModifica, A447FAM_Descripcion, A75SEG_Codigo, A35FAM_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_FAM") ;
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_FAM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1744( ) ;
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
         endLevel1744( ) ;
      }
      closeExtendedTableCursors1744( ) ;
   }

   public void deferredUpdate1744( )
   {
   }

   public void delete( )
   {
      beforeValidate1744( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1744( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1744( ) ;
         afterConfirm1744( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1744( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001714 */
               pr_default.execute(12, new Object[] {A35FAM_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_FAM") ;
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1744( ) ;
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1744( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV17Pgmname = "ALM_CAT_FAM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
         /* Using cursor T001715 */
         pr_default.execute(13, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T001715_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T001715_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(13);
         /* Using cursor T001716 */
         pr_default.execute(14, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T001716_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001717 */
         pr_default.execute(15, new Object[] {A35FAM_Codigo});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CLASE"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1744( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1744( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_fam");
         if ( AnyError == 0 )
         {
            confirmValues170( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_fam");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1744( )
   {
      /* Scan By routine */
      /* Using cursor T001718 */
      pr_default.execute(16);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A35FAM_Codigo = T001718_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1744( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A35FAM_Codigo = T001718_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      }
   }

   public void scanEnd1744( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1744( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A449FAM_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A451FAM_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A448FAM_UsuarioCreacion = AV14Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A448FAM_UsuarioCreacion", A448FAM_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A450FAM_UsuarioModifica = AV14Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FAM_UsuarioModifica", A450FAM_UsuarioModifica);
      }
   }

   public void beforeInsert1744( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1744( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1744( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1744( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1744( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1744( )
   {
      edtFAM_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      edtFAM_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Descripcion_Enabled, 5, 0)), true);
      edtSEG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      edtSEG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Descripcion_Enabled, 5, 0)), true);
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtFAM_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_UsuarioCreacion_Enabled, 5, 0)), true);
      edtFAM_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_FechaCreacion_Enabled, 5, 0)), true);
      edtFAM_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_UsuarioModifica_Enabled, 5, 0)), true);
      edtFAM_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_FechaModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues170( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414171917");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9FAM_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z35FAM_Codigo", Z35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z448FAM_UsuarioCreacion", Z448FAM_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z450FAM_UsuarioModifica", Z450FAM_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z449FAM_FechaCreacion", localUtil.ttoc( Z449FAM_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z451FAM_FechaModifica", localUtil.ttoc( Z451FAM_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z447FAM_Descripcion", Z447FAM_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z75SEG_Codigo", Z75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N75SEG_Codigo", A75SEG_Codigo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV12TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV12TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFAM_CODIGO", AV9FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SEG_CODIGO", AV15Insert_SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV14Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV17Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFAM_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9FAM_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CAT_FAM" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cat_fam:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_cat_fam") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV9FAM_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_CAT_FAM" ;
   }

   public String getPgmdesc( )
   {
      return "Familia del catálogo" ;
   }

   public void initializeNonKey1744( )
   {
      A75SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      A448FAM_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A448FAM_UsuarioCreacion", A448FAM_UsuarioCreacion);
      A450FAM_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A450FAM_UsuarioModifica", A450FAM_UsuarioModifica);
      A449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A449FAM_FechaCreacion", localUtil.ttoc( A449FAM_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A451FAM_FechaModifica", localUtil.ttoc( A451FAM_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A447FAM_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A442SEG_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      A435TIP_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      Z448FAM_UsuarioCreacion = "" ;
      Z450FAM_UsuarioModifica = "" ;
      Z449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z447FAM_Descripcion = "" ;
      Z75SEG_Codigo = "" ;
   }

   public void initAll1744( )
   {
      A35FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      initializeNonKey1744( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414171925");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_cat_fam.js", "?201861414171925");
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
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtFAM_UsuarioCreacion_Internalname = "FAM_USUARIOCREACION" ;
      edtFAM_FechaCreacion_Internalname = "FAM_FECHACREACION" ;
      edtFAM_UsuarioModifica_Internalname = "FAM_USUARIOMODIFICA" ;
      edtFAM_FechaModifica_Internalname = "FAM_FECHAMODIFICA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_75_Internalname = "PROMPT_75" ;
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
      Form.setCaption( "Familia del catálogo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFAM_FechaModifica_Jsonclick = "" ;
      edtFAM_FechaModifica_Enabled = 1 ;
      edtFAM_UsuarioModifica_Jsonclick = "" ;
      edtFAM_UsuarioModifica_Enabled = 1 ;
      edtFAM_FechaCreacion_Jsonclick = "" ;
      edtFAM_FechaCreacion_Enabled = 1 ;
      edtFAM_UsuarioCreacion_Jsonclick = "" ;
      edtFAM_UsuarioCreacion_Enabled = 1 ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Enabled = 0 ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 0 ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Descripcion_Enabled = 0 ;
      imgprompt_75_Visible = 1 ;
      imgprompt_75_Link = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 1 ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Descripcion_Enabled = 1 ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtFAM_Codigo_Enabled = 1 ;
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

   public void valid_Seg_codigo( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 ,
                                 String GX_Parm4 )
   {
      A75SEG_Codigo = GX_Parm1 ;
      A74TIP_Codigo = GX_Parm2 ;
      A442SEG_Descripcion = GX_Parm3 ;
      A435TIP_Descripcion = GX_Parm4 ;
      /* Using cursor T001715 */
      pr_default.execute(13, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "SEG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSEG_Codigo_Internalname ;
      }
      A442SEG_Descripcion = T001715_A442SEG_Descripcion[0] ;
      A74TIP_Codigo = T001715_A74TIP_Codigo[0] ;
      pr_default.close(13);
      /* Using cursor T001716 */
      pr_default.execute(14, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T001716_A435TIP_Descripcion[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A442SEG_Descripcion = "" ;
         A74TIP_Codigo = "" ;
         A435TIP_Descripcion = "" ;
      }
      isValidOutput.add(A442SEG_Descripcion);
      isValidOutput.add(A74TIP_Codigo);
      isValidOutput.add(A435TIP_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9FAM_Codigo',fld:'vFAM_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12172',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV12TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV9FAM_Codigo = "" ;
      Z35FAM_Codigo = "" ;
      Z448FAM_UsuarioCreacion = "" ;
      Z450FAM_UsuarioModifica = "" ;
      Z449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z447FAM_Descripcion = "" ;
      Z75SEG_Codigo = "" ;
      N75SEG_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A75SEG_Codigo = "" ;
      A74TIP_Codigo = "" ;
      Gx_mode = "" ;
      AV9FAM_Codigo = "" ;
      GXKey = "" ;
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
      A35FAM_Codigo = "" ;
      A447FAM_Descripcion = "" ;
      sImgUrl = "" ;
      A442SEG_Descripcion = "" ;
      A435TIP_Descripcion = "" ;
      A448FAM_UsuarioCreacion = "" ;
      A449FAM_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A450FAM_UsuarioModifica = "" ;
      A451FAM_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV15Insert_SEG_Codigo = "" ;
      AV14Usuario = "" ;
      AV17Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode44 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      AV16TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
      Z435TIP_Descripcion = "" ;
      T00174_A442SEG_Descripcion = new String[] {""} ;
      T00174_A74TIP_Codigo = new String[] {""} ;
      T00175_A435TIP_Descripcion = new String[] {""} ;
      T00176_A35FAM_Codigo = new String[] {""} ;
      T00176_A448FAM_UsuarioCreacion = new String[] {""} ;
      T00176_A450FAM_UsuarioModifica = new String[] {""} ;
      T00176_A449FAM_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00176_A451FAM_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00176_A447FAM_Descripcion = new String[] {""} ;
      T00176_A442SEG_Descripcion = new String[] {""} ;
      T00176_A435TIP_Descripcion = new String[] {""} ;
      T00176_A75SEG_Codigo = new String[] {""} ;
      T00176_A74TIP_Codigo = new String[] {""} ;
      T00177_A442SEG_Descripcion = new String[] {""} ;
      T00177_A74TIP_Codigo = new String[] {""} ;
      T00178_A435TIP_Descripcion = new String[] {""} ;
      T00179_A35FAM_Codigo = new String[] {""} ;
      T00173_A35FAM_Codigo = new String[] {""} ;
      T00173_A448FAM_UsuarioCreacion = new String[] {""} ;
      T00173_A450FAM_UsuarioModifica = new String[] {""} ;
      T00173_A449FAM_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_A451FAM_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_A447FAM_Descripcion = new String[] {""} ;
      T00173_A75SEG_Codigo = new String[] {""} ;
      T001710_A35FAM_Codigo = new String[] {""} ;
      T001711_A35FAM_Codigo = new String[] {""} ;
      T00172_A35FAM_Codigo = new String[] {""} ;
      T00172_A448FAM_UsuarioCreacion = new String[] {""} ;
      T00172_A450FAM_UsuarioModifica = new String[] {""} ;
      T00172_A449FAM_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_A451FAM_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_A447FAM_Descripcion = new String[] {""} ;
      T00172_A75SEG_Codigo = new String[] {""} ;
      T001715_A442SEG_Descripcion = new String[] {""} ;
      T001715_A74TIP_Codigo = new String[] {""} ;
      T001716_A435TIP_Descripcion = new String[] {""} ;
      T001717_A34Clas_Codigo = new String[] {""} ;
      T001718_A35FAM_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cat_fam__default(),
         new Object[] {
             new Object[] {
            T00172_A35FAM_Codigo, T00172_A448FAM_UsuarioCreacion, T00172_A450FAM_UsuarioModifica, T00172_A449FAM_FechaCreacion, T00172_A451FAM_FechaModifica, T00172_A447FAM_Descripcion, T00172_A75SEG_Codigo
            }
            , new Object[] {
            T00173_A35FAM_Codigo, T00173_A448FAM_UsuarioCreacion, T00173_A450FAM_UsuarioModifica, T00173_A449FAM_FechaCreacion, T00173_A451FAM_FechaModifica, T00173_A447FAM_Descripcion, T00173_A75SEG_Codigo
            }
            , new Object[] {
            T00174_A442SEG_Descripcion, T00174_A74TIP_Codigo
            }
            , new Object[] {
            T00175_A435TIP_Descripcion
            }
            , new Object[] {
            T00176_A35FAM_Codigo, T00176_A448FAM_UsuarioCreacion, T00176_A450FAM_UsuarioModifica, T00176_A449FAM_FechaCreacion, T00176_A451FAM_FechaModifica, T00176_A447FAM_Descripcion, T00176_A442SEG_Descripcion, T00176_A435TIP_Descripcion, T00176_A75SEG_Codigo, T00176_A74TIP_Codigo
            }
            , new Object[] {
            T00177_A442SEG_Descripcion, T00177_A74TIP_Codigo
            }
            , new Object[] {
            T00178_A435TIP_Descripcion
            }
            , new Object[] {
            T00179_A35FAM_Codigo
            }
            , new Object[] {
            T001710_A35FAM_Codigo
            }
            , new Object[] {
            T001711_A35FAM_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001715_A442SEG_Descripcion, T001715_A74TIP_Codigo
            }
            , new Object[] {
            T001716_A435TIP_Descripcion
            }
            , new Object[] {
            T001717_A34Clas_Codigo
            }
            , new Object[] {
            T001718_A35FAM_Codigo
            }
         }
      );
      AV17Pgmname = "ALM_CAT_FAM" ;
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
   private short RcdFound44 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtFAM_Codigo_Enabled ;
   private int edtFAM_Descripcion_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int imgprompt_75_Visible ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtFAM_UsuarioCreacion_Enabled ;
   private int edtFAM_FechaCreacion_Enabled ;
   private int edtFAM_UsuarioModifica_Enabled ;
   private int edtFAM_FechaModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV18GXV1 ;
   private int GX_JID ;
   private int idxLst ;
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
   private String edtFAM_Codigo_Internalname ;
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
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_75_Internalname ;
   private String imgprompt_75_Link ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtFAM_UsuarioCreacion_Internalname ;
   private String edtFAM_UsuarioCreacion_Jsonclick ;
   private String edtFAM_FechaCreacion_Internalname ;
   private String edtFAM_FechaCreacion_Jsonclick ;
   private String edtFAM_UsuarioModifica_Internalname ;
   private String edtFAM_UsuarioModifica_Jsonclick ;
   private String edtFAM_FechaModifica_Internalname ;
   private String edtFAM_FechaModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV17Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode44 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z449FAM_FechaCreacion ;
   private java.util.Date Z451FAM_FechaModifica ;
   private java.util.Date A449FAM_FechaCreacion ;
   private java.util.Date A451FAM_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV9FAM_Codigo ;
   private String Z35FAM_Codigo ;
   private String Z448FAM_UsuarioCreacion ;
   private String Z450FAM_UsuarioModifica ;
   private String Z447FAM_Descripcion ;
   private String Z75SEG_Codigo ;
   private String N75SEG_Codigo ;
   private String A75SEG_Codigo ;
   private String A74TIP_Codigo ;
   private String AV9FAM_Codigo ;
   private String A35FAM_Codigo ;
   private String A447FAM_Descripcion ;
   private String A442SEG_Descripcion ;
   private String A435TIP_Descripcion ;
   private String A448FAM_UsuarioCreacion ;
   private String A450FAM_UsuarioModifica ;
   private String AV15Insert_SEG_Codigo ;
   private String AV14Usuario ;
   private String Z442SEG_Descripcion ;
   private String Z74TIP_Codigo ;
   private String Z435TIP_Descripcion ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00174_A442SEG_Descripcion ;
   private String[] T00174_A74TIP_Codigo ;
   private String[] T00175_A435TIP_Descripcion ;
   private String[] T00176_A35FAM_Codigo ;
   private String[] T00176_A448FAM_UsuarioCreacion ;
   private String[] T00176_A450FAM_UsuarioModifica ;
   private java.util.Date[] T00176_A449FAM_FechaCreacion ;
   private java.util.Date[] T00176_A451FAM_FechaModifica ;
   private String[] T00176_A447FAM_Descripcion ;
   private String[] T00176_A442SEG_Descripcion ;
   private String[] T00176_A435TIP_Descripcion ;
   private String[] T00176_A75SEG_Codigo ;
   private String[] T00176_A74TIP_Codigo ;
   private String[] T00177_A442SEG_Descripcion ;
   private String[] T00177_A74TIP_Codigo ;
   private String[] T00178_A435TIP_Descripcion ;
   private String[] T00179_A35FAM_Codigo ;
   private String[] T00173_A35FAM_Codigo ;
   private String[] T00173_A448FAM_UsuarioCreacion ;
   private String[] T00173_A450FAM_UsuarioModifica ;
   private java.util.Date[] T00173_A449FAM_FechaCreacion ;
   private java.util.Date[] T00173_A451FAM_FechaModifica ;
   private String[] T00173_A447FAM_Descripcion ;
   private String[] T00173_A75SEG_Codigo ;
   private String[] T001710_A35FAM_Codigo ;
   private String[] T001711_A35FAM_Codigo ;
   private String[] T00172_A35FAM_Codigo ;
   private String[] T00172_A448FAM_UsuarioCreacion ;
   private String[] T00172_A450FAM_UsuarioModifica ;
   private java.util.Date[] T00172_A449FAM_FechaCreacion ;
   private java.util.Date[] T00172_A451FAM_FechaModifica ;
   private String[] T00172_A447FAM_Descripcion ;
   private String[] T00172_A75SEG_Codigo ;
   private String[] T001715_A442SEG_Descripcion ;
   private String[] T001715_A74TIP_Codigo ;
   private String[] T001716_A435TIP_Descripcion ;
   private String[] T001717_A34Clas_Codigo ;
   private String[] T001718_A35FAM_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class alm_cat_fam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00172", "SELECT FAM_Codigo, FAM_UsuarioCreacion, FAM_UsuarioModifica, FAM_FechaCreacion, FAM_FechaModifica, FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ?  FOR UPDATE OF FAM_UsuarioCreacion, FAM_UsuarioModifica, FAM_FechaCreacion, FAM_FechaModifica, FAM_Descripcion, SEG_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00173", "SELECT FAM_Codigo, FAM_UsuarioCreacion, FAM_UsuarioModifica, FAM_FechaCreacion, FAM_FechaModifica, FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00174", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00175", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00176", "SELECT /*+ FIRST_ROWS(100) */ TM1.FAM_Codigo, TM1.FAM_UsuarioCreacion, TM1.FAM_UsuarioModifica, TM1.FAM_FechaCreacion, TM1.FAM_FechaModifica, TM1.FAM_Descripcion, T2.SEG_Descripcion, T3.TIP_Descripcion, TM1.SEG_Codigo, T2.TIP_Codigo FROM ((ALM_CAT_FAM TM1 INNER JOIN ALM_CAT_SEG T2 ON T2.SEG_Codigo = TM1.SEG_Codigo) INNER JOIN ALM_CAT_TIP T3 ON T3.TIP_Codigo = T2.TIP_Codigo) WHERE TM1.FAM_Codigo = ? ORDER BY TM1.FAM_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00177", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00178", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00179", "SELECT /*+ FIRST_ROWS(1) */ FAM_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001710", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FAM_Codigo FROM ALM_CAT_FAM WHERE ( FAM_Codigo > ?) ORDER BY FAM_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001711", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FAM_Codigo FROM ALM_CAT_FAM WHERE ( FAM_Codigo < ?) ORDER BY FAM_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001712", "INSERT INTO ALM_CAT_FAM(FAM_Codigo, FAM_UsuarioCreacion, FAM_UsuarioModifica, FAM_FechaCreacion, FAM_FechaModifica, FAM_Descripcion, SEG_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CAT_FAM")
         ,new UpdateCursor("T001713", "UPDATE ALM_CAT_FAM SET FAM_UsuarioCreacion=?, FAM_UsuarioModifica=?, FAM_FechaCreacion=?, FAM_FechaModifica=?, FAM_Descripcion=?, SEG_Codigo=?  WHERE FAM_Codigo = ?", GX_NOMASK, "ALM_CAT_FAM")
         ,new UpdateCursor("T001714", "DELETE FROM ALM_CAT_FAM  WHERE FAM_Codigo = ?", GX_NOMASK, "ALM_CAT_FAM")
         ,new ForEachCursor("T001715", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001716", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001717", "SELECT * FROM (SELECT Clas_Codigo FROM ALM_CLASE WHERE FAM_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001718", "SELECT /*+ FIRST_ROWS(100) */ FAM_Codigo FROM ALM_CAT_FAM ORDER BY FAM_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 16 :
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
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 70, false);
               stmt.setVarchar(7, (String)parms[6], 3, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 70, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setVarchar(7, (String)parms[6], 5, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
      }
   }

}

