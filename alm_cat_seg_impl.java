/*
               File: alm_cat_seg_impl
        Description: Segmento del catálogo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:15.44
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

public final  class alm_cat_seg_impl extends GXDataArea
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
         A74TIP_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A74TIP_Codigo) ;
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
            AV8SEG_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8SEG_Codigo", AV8SEG_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSEG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8SEG_Codigo, ""))));
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
         Form.getMeta().addItem("description", "Segmento del catálogo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtSEG_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_cat_seg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_cat_seg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_cat_seg_impl.class ));
   }

   public alm_cat_seg_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Segmento del catálogo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Codigo_Internalname, "Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Descripcion_Internalname, "Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_SEG.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CAT_SEG.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_74_Internalname, sImgUrl, imgprompt_74_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_74_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_UsuarioCreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_UsuarioCreacion_Internalname, A443SEG_UsuarioCreacion, GXutil.rtrim( localUtil.format( A443SEG_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_FechaCreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtSEG_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_FechaCreacion_Internalname, localUtil.ttoc( A444SEG_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A444SEG_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtSEG_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSEG_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_UsuarioModifica_Internalname, "Usuario Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_UsuarioModifica_Internalname, A445SEG_UsuarioModifica, GXutil.rtrim( localUtil.format( A445SEG_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CAT_SEG.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_FechaModifica_Internalname, "Fecha Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtSEG_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_FechaModifica_Internalname, localUtil.ttoc( A446SEG_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A446SEG_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtSEG_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSEG_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CAT_SEG.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CAT_SEG.htm");
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
      e11162 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
            A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
            A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
            A443SEG_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtSEG_UsuarioCreacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A443SEG_UsuarioCreacion", A443SEG_UsuarioCreacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtSEG_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "SEG_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSEG_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A444SEG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtSEG_FechaCreacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            A445SEG_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtSEG_UsuarioModifica_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A445SEG_UsuarioModifica", A445SEG_UsuarioModifica);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtSEG_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "SEG_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSEG_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A446SEG_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtSEG_FechaModifica_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            /* Read saved values. */
            Z75SEG_Codigo = httpContext.cgiGet( "Z75SEG_Codigo") ;
            Z443SEG_UsuarioCreacion = httpContext.cgiGet( "Z443SEG_UsuarioCreacion") ;
            Z445SEG_UsuarioModifica = httpContext.cgiGet( "Z445SEG_UsuarioModifica") ;
            Z444SEG_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z444SEG_FechaCreacion"), 0) ;
            Z446SEG_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z446SEG_FechaModifica"), 0) ;
            Z442SEG_Descripcion = httpContext.cgiGet( "Z442SEG_Descripcion") ;
            Z74TIP_Codigo = httpContext.cgiGet( "Z74TIP_Codigo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N74TIP_Codigo = httpContext.cgiGet( "N74TIP_Codigo") ;
            AV8SEG_Codigo = httpContext.cgiGet( "vSEG_CODIGO") ;
            AV14Insert_TIP_Codigo = httpContext.cgiGet( "vINSERT_TIP_CODIGO") ;
            AV13Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CAT_SEG" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A75SEG_Codigo, Z75SEG_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_cat_seg:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A75SEG_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
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
                  sMode43 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode43 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound43 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_160( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "SEG_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSEG_Codigo_Internalname ;
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
                        e11162 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12162 ();
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
         e12162 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1643( ) ;
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
         disableAttributes1643( ) ;
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

   public void confirm_160( )
   {
      beforeValidate1643( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1643( ) ;
         }
         else
         {
            checkExtendedTable1643( ) ;
            closeExtendedTableCursors1643( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption160( )
   {
   }

   public void e11162( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      AV14Insert_TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_TIP_Codigo", AV14Insert_TIP_Codigo);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV16Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV17GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         while ( AV17GXV1 <= AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV17GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "TIP_Codigo") == 0 )
            {
               AV14Insert_TIP_Codigo = AV15TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_TIP_Codigo", AV14Insert_TIP_Codigo);
            }
            AV17GXV1 = (int)(AV17GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         }
      }
      AV13Usuario = AV12WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Usuario", AV13Usuario);
   }

   public void e12162( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_cat_seg") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1643( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z443SEG_UsuarioCreacion = T00163_A443SEG_UsuarioCreacion[0] ;
            Z445SEG_UsuarioModifica = T00163_A445SEG_UsuarioModifica[0] ;
            Z444SEG_FechaCreacion = T00163_A444SEG_FechaCreacion[0] ;
            Z446SEG_FechaModifica = T00163_A446SEG_FechaModifica[0] ;
            Z442SEG_Descripcion = T00163_A442SEG_Descripcion[0] ;
            Z74TIP_Codigo = T00163_A74TIP_Codigo[0] ;
         }
         else
         {
            Z443SEG_UsuarioCreacion = A443SEG_UsuarioCreacion ;
            Z445SEG_UsuarioModifica = A445SEG_UsuarioModifica ;
            Z444SEG_FechaCreacion = A444SEG_FechaCreacion ;
            Z446SEG_FechaModifica = A446SEG_FechaModifica ;
            Z442SEG_Descripcion = A442SEG_Descripcion ;
            Z74TIP_Codigo = A74TIP_Codigo ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z75SEG_Codigo = A75SEG_Codigo ;
         Z443SEG_UsuarioCreacion = A443SEG_UsuarioCreacion ;
         Z445SEG_UsuarioModifica = A445SEG_UsuarioModifica ;
         Z444SEG_FechaCreacion = A444SEG_FechaCreacion ;
         Z446SEG_FechaModifica = A446SEG_FechaModifica ;
         Z442SEG_Descripcion = A442SEG_Descripcion ;
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_74_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0160"+"',["+"{Ctrl:gx.dom.el('"+"TIP_CODIGO"+"'), id:'"+"TIP_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV8SEG_Codigo)==0) )
      {
         A75SEG_Codigo = AV8SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV8SEG_Codigo)==0) )
      {
         edtSEG_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtSEG_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV8SEG_Codigo)==0) )
      {
         edtSEG_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_TIP_Codigo)==0) )
      {
         edtTIP_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTIP_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_TIP_Codigo)==0) )
      {
         A74TIP_Codigo = AV14Insert_TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
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
         AV16Pgmname = "ALM_CAT_SEG" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T00164 */
         pr_default.execute(2, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T00164_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(2);
      }
   }

   public void load1643( )
   {
      /* Using cursor T00165 */
      pr_default.execute(3, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A443SEG_UsuarioCreacion = T00165_A443SEG_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443SEG_UsuarioCreacion", A443SEG_UsuarioCreacion);
         A445SEG_UsuarioModifica = T00165_A445SEG_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A445SEG_UsuarioModifica", A445SEG_UsuarioModifica);
         A444SEG_FechaCreacion = T00165_A444SEG_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A446SEG_FechaModifica = T00165_A446SEG_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A442SEG_Descripcion = T00165_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A435TIP_Descripcion = T00165_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         A74TIP_Codigo = T00165_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         zm1643( -13) ;
      }
      pr_default.close(3);
      onLoadActions1643( ) ;
   }

   public void onLoadActions1643( )
   {
      AV16Pgmname = "ALM_CAT_SEG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable1643( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV16Pgmname = "ALM_CAT_SEG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      /* Using cursor T00164 */
      pr_default.execute(2, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "TIP_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTIP_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A435TIP_Descripcion = T00164_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1643( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A74TIP_Codigo )
   {
      /* Using cursor T00166 */
      pr_default.execute(4, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "TIP_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTIP_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A435TIP_Descripcion = T00166_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A435TIP_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey1643( )
   {
      /* Using cursor T00167 */
      pr_default.execute(5, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00163 */
      pr_default.execute(1, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1643( 13) ;
         RcdFound43 = (short)(1) ;
         A75SEG_Codigo = T00163_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         A443SEG_UsuarioCreacion = T00163_A443SEG_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443SEG_UsuarioCreacion", A443SEG_UsuarioCreacion);
         A445SEG_UsuarioModifica = T00163_A445SEG_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A445SEG_UsuarioModifica", A445SEG_UsuarioModifica);
         A444SEG_FechaCreacion = T00163_A444SEG_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A446SEG_FechaModifica = T00163_A446SEG_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         A442SEG_Descripcion = T00163_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T00163_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         Z75SEG_Codigo = A75SEG_Codigo ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1643( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKey1643( ) ;
         }
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey1643( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1643( ) ;
      if ( RcdFound43 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00168 */
      pr_default.execute(6, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00168_A75SEG_Codigo[0], A75SEG_Codigo) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00168_A75SEG_Codigo[0], A75SEG_Codigo) > 0 ) ) )
         {
            A75SEG_Codigo = T00168_A75SEG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00169 */
      pr_default.execute(7, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00169_A75SEG_Codigo[0], A75SEG_Codigo) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00169_A75SEG_Codigo[0], A75SEG_Codigo) < 0 ) ) )
         {
            A75SEG_Codigo = T00169_A75SEG_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1643( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtSEG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1643( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( GXutil.strcmp(A75SEG_Codigo, Z75SEG_Codigo) != 0 )
            {
               A75SEG_Codigo = Z75SEG_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SEG_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSEG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSEG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1643( ) ;
               GX_FocusControl = edtSEG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A75SEG_Codigo, Z75SEG_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtSEG_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1643( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SEG_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSEG_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtSEG_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1643( ) ;
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
      if ( GXutil.strcmp(A75SEG_Codigo, Z75SEG_Codigo) != 0 )
      {
         A75SEG_Codigo = Z75SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SEG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSEG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSEG_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1643( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00162 */
         pr_default.execute(0, new Object[] {A75SEG_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_SEG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z443SEG_UsuarioCreacion, T00162_A443SEG_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z445SEG_UsuarioModifica, T00162_A445SEG_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z444SEG_FechaCreacion, T00162_A444SEG_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z446SEG_FechaModifica, T00162_A446SEG_FechaModifica[0]) ) || ( GXutil.strcmp(Z442SEG_Descripcion, T00162_A442SEG_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z74TIP_Codigo, T00162_A74TIP_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CAT_SEG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1643( )
   {
      beforeValidate1643( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1643( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1643( 0) ;
         checkOptimisticConcurrency1643( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1643( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1643( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001610 */
                  pr_default.execute(8, new Object[] {A75SEG_Codigo, A443SEG_UsuarioCreacion, A445SEG_UsuarioModifica, A444SEG_FechaCreacion, A446SEG_FechaModifica, A442SEG_Descripcion, A74TIP_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_SEG") ;
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption160( ) ;
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
            load1643( ) ;
         }
         endLevel1643( ) ;
      }
      closeExtendedTableCursors1643( ) ;
   }

   public void update1643( )
   {
      beforeValidate1643( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1643( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1643( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1643( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1643( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001611 */
                  pr_default.execute(9, new Object[] {A443SEG_UsuarioCreacion, A445SEG_UsuarioModifica, A444SEG_FechaCreacion, A446SEG_FechaModifica, A442SEG_Descripcion, A74TIP_Codigo, A75SEG_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_SEG") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CAT_SEG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1643( ) ;
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
         endLevel1643( ) ;
      }
      closeExtendedTableCursors1643( ) ;
   }

   public void deferredUpdate1643( )
   {
   }

   public void delete( )
   {
      beforeValidate1643( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1643( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1643( ) ;
         afterConfirm1643( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1643( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001612 */
               pr_default.execute(10, new Object[] {A75SEG_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CAT_SEG") ;
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1643( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1643( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "ALM_CAT_SEG" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T001613 */
         pr_default.execute(11, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T001613_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001614 */
         pr_default.execute(12, new Object[] {A75SEG_Codigo});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACEN CATAGOLO FAMILIA"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1643( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1643( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_seg");
         if ( AnyError == 0 )
         {
            confirmValues160( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_cat_seg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1643( )
   {
      /* Scan By routine */
      /* Using cursor T001615 */
      pr_default.execute(13);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A75SEG_Codigo = T001615_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1643( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A75SEG_Codigo = T001615_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      }
   }

   public void scanEnd1643( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1643( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A444SEG_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A446SEG_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A443SEG_UsuarioCreacion = AV13Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A443SEG_UsuarioCreacion", A443SEG_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A445SEG_UsuarioModifica = AV13Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A445SEG_UsuarioModifica", A445SEG_UsuarioModifica);
      }
   }

   public void beforeInsert1643( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1643( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1643( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1643( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1643( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1643( )
   {
      edtSEG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      edtSEG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Descripcion_Enabled, 5, 0)), true);
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtSEG_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_UsuarioCreacion_Enabled, 5, 0)), true);
      edtSEG_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_FechaCreacion_Enabled, 5, 0)), true);
      edtSEG_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_UsuarioModifica_Enabled, 5, 0)), true);
      edtSEG_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_FechaModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues160( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414171659");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_cat_seg") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV8SEG_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z75SEG_Codigo", Z75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z443SEG_UsuarioCreacion", Z443SEG_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z445SEG_UsuarioModifica", Z445SEG_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z444SEG_FechaCreacion", localUtil.ttoc( Z444SEG_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z446SEG_FechaModifica", localUtil.ttoc( Z446SEG_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z442SEG_Descripcion", Z442SEG_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z74TIP_Codigo", Z74TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N74TIP_Codigo", A74TIP_Codigo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSEG_CODIGO", AV8SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIP_CODIGO", AV14Insert_TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV13Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEG_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8SEG_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CAT_SEG" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_cat_seg:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_cat_seg") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV8SEG_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_CAT_SEG" ;
   }

   public String getPgmdesc( )
   {
      return "Segmento del catálogo" ;
   }

   public void initializeNonKey1643( )
   {
      A74TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      A443SEG_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A443SEG_UsuarioCreacion", A443SEG_UsuarioCreacion);
      A445SEG_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A445SEG_UsuarioModifica", A445SEG_UsuarioModifica);
      A444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A444SEG_FechaCreacion", localUtil.ttoc( A444SEG_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A446SEG_FechaModifica", localUtil.ttoc( A446SEG_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A442SEG_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A435TIP_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      Z443SEG_UsuarioCreacion = "" ;
      Z445SEG_UsuarioModifica = "" ;
      Z444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
   }

   public void initAll1643( )
   {
      A75SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      initializeNonKey1643( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414171666");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_cat_seg.js", "?201861414171666");
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
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtSEG_UsuarioCreacion_Internalname = "SEG_USUARIOCREACION" ;
      edtSEG_FechaCreacion_Internalname = "SEG_FECHACREACION" ;
      edtSEG_UsuarioModifica_Internalname = "SEG_USUARIOMODIFICA" ;
      edtSEG_FechaModifica_Internalname = "SEG_FECHAMODIFICA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_74_Internalname = "PROMPT_74" ;
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
      Form.setCaption( "Segmento del catálogo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtSEG_FechaModifica_Jsonclick = "" ;
      edtSEG_FechaModifica_Enabled = 1 ;
      edtSEG_UsuarioModifica_Jsonclick = "" ;
      edtSEG_UsuarioModifica_Enabled = 1 ;
      edtSEG_FechaCreacion_Jsonclick = "" ;
      edtSEG_FechaCreacion_Enabled = 1 ;
      edtSEG_UsuarioCreacion_Jsonclick = "" ;
      edtSEG_UsuarioCreacion_Enabled = 1 ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Enabled = 0 ;
      imgprompt_74_Visible = 1 ;
      imgprompt_74_Link = "" ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 1 ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Descripcion_Enabled = 1 ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 1 ;
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

   public void valid_Tip_codigo( String GX_Parm1 ,
                                 String GX_Parm2 )
   {
      A74TIP_Codigo = GX_Parm1 ;
      A435TIP_Descripcion = GX_Parm2 ;
      /* Using cursor T001613 */
      pr_default.execute(11, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "TIP_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTIP_Codigo_Internalname ;
      }
      A435TIP_Descripcion = T001613_A435TIP_Descripcion[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A435TIP_Descripcion = "" ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV8SEG_Codigo',fld:'vSEG_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12162',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV8SEG_Codigo = "" ;
      Z75SEG_Codigo = "" ;
      Z443SEG_UsuarioCreacion = "" ;
      Z445SEG_UsuarioModifica = "" ;
      Z444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
      N74TIP_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A74TIP_Codigo = "" ;
      Gx_mode = "" ;
      AV8SEG_Codigo = "" ;
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
      A75SEG_Codigo = "" ;
      A442SEG_Descripcion = "" ;
      sImgUrl = "" ;
      A435TIP_Descripcion = "" ;
      A443SEG_UsuarioCreacion = "" ;
      A444SEG_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A445SEG_UsuarioModifica = "" ;
      A446SEG_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV14Insert_TIP_Codigo = "" ;
      AV13Usuario = "" ;
      AV16Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode43 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z435TIP_Descripcion = "" ;
      T00164_A435TIP_Descripcion = new String[] {""} ;
      T00165_A75SEG_Codigo = new String[] {""} ;
      T00165_A443SEG_UsuarioCreacion = new String[] {""} ;
      T00165_A445SEG_UsuarioModifica = new String[] {""} ;
      T00165_A444SEG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00165_A446SEG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00165_A442SEG_Descripcion = new String[] {""} ;
      T00165_A435TIP_Descripcion = new String[] {""} ;
      T00165_A74TIP_Codigo = new String[] {""} ;
      T00166_A435TIP_Descripcion = new String[] {""} ;
      T00167_A75SEG_Codigo = new String[] {""} ;
      T00163_A75SEG_Codigo = new String[] {""} ;
      T00163_A443SEG_UsuarioCreacion = new String[] {""} ;
      T00163_A445SEG_UsuarioModifica = new String[] {""} ;
      T00163_A444SEG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_A446SEG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00163_A442SEG_Descripcion = new String[] {""} ;
      T00163_A74TIP_Codigo = new String[] {""} ;
      T00168_A75SEG_Codigo = new String[] {""} ;
      T00169_A75SEG_Codigo = new String[] {""} ;
      T00162_A75SEG_Codigo = new String[] {""} ;
      T00162_A443SEG_UsuarioCreacion = new String[] {""} ;
      T00162_A445SEG_UsuarioModifica = new String[] {""} ;
      T00162_A444SEG_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_A446SEG_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00162_A442SEG_Descripcion = new String[] {""} ;
      T00162_A74TIP_Codigo = new String[] {""} ;
      T001613_A435TIP_Descripcion = new String[] {""} ;
      T001614_A35FAM_Codigo = new String[] {""} ;
      T001615_A75SEG_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_cat_seg__default(),
         new Object[] {
             new Object[] {
            T00162_A75SEG_Codigo, T00162_A443SEG_UsuarioCreacion, T00162_A445SEG_UsuarioModifica, T00162_A444SEG_FechaCreacion, T00162_A446SEG_FechaModifica, T00162_A442SEG_Descripcion, T00162_A74TIP_Codigo
            }
            , new Object[] {
            T00163_A75SEG_Codigo, T00163_A443SEG_UsuarioCreacion, T00163_A445SEG_UsuarioModifica, T00163_A444SEG_FechaCreacion, T00163_A446SEG_FechaModifica, T00163_A442SEG_Descripcion, T00163_A74TIP_Codigo
            }
            , new Object[] {
            T00164_A435TIP_Descripcion
            }
            , new Object[] {
            T00165_A75SEG_Codigo, T00165_A443SEG_UsuarioCreacion, T00165_A445SEG_UsuarioModifica, T00165_A444SEG_FechaCreacion, T00165_A446SEG_FechaModifica, T00165_A442SEG_Descripcion, T00165_A435TIP_Descripcion, T00165_A74TIP_Codigo
            }
            , new Object[] {
            T00166_A435TIP_Descripcion
            }
            , new Object[] {
            T00167_A75SEG_Codigo
            }
            , new Object[] {
            T00168_A75SEG_Codigo
            }
            , new Object[] {
            T00169_A75SEG_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001613_A435TIP_Descripcion
            }
            , new Object[] {
            T001614_A35FAM_Codigo
            }
            , new Object[] {
            T001615_A75SEG_Codigo
            }
         }
      );
      AV16Pgmname = "ALM_CAT_SEG" ;
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
   private short RcdFound43 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtSEG_Codigo_Enabled ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtTIP_Codigo_Enabled ;
   private int imgprompt_74_Visible ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtSEG_UsuarioCreacion_Enabled ;
   private int edtSEG_FechaCreacion_Enabled ;
   private int edtSEG_UsuarioModifica_Enabled ;
   private int edtSEG_FechaModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV17GXV1 ;
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
   private String edtSEG_Codigo_Internalname ;
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
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_74_Internalname ;
   private String imgprompt_74_Link ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtSEG_UsuarioCreacion_Internalname ;
   private String edtSEG_UsuarioCreacion_Jsonclick ;
   private String edtSEG_FechaCreacion_Internalname ;
   private String edtSEG_FechaCreacion_Jsonclick ;
   private String edtSEG_UsuarioModifica_Internalname ;
   private String edtSEG_UsuarioModifica_Jsonclick ;
   private String edtSEG_FechaModifica_Internalname ;
   private String edtSEG_FechaModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV16Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode43 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z444SEG_FechaCreacion ;
   private java.util.Date Z446SEG_FechaModifica ;
   private java.util.Date A444SEG_FechaCreacion ;
   private java.util.Date A446SEG_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV8SEG_Codigo ;
   private String Z75SEG_Codigo ;
   private String Z443SEG_UsuarioCreacion ;
   private String Z445SEG_UsuarioModifica ;
   private String Z442SEG_Descripcion ;
   private String Z74TIP_Codigo ;
   private String N74TIP_Codigo ;
   private String A74TIP_Codigo ;
   private String AV8SEG_Codigo ;
   private String A75SEG_Codigo ;
   private String A442SEG_Descripcion ;
   private String A435TIP_Descripcion ;
   private String A443SEG_UsuarioCreacion ;
   private String A445SEG_UsuarioModifica ;
   private String AV14Insert_TIP_Codigo ;
   private String AV13Usuario ;
   private String Z435TIP_Descripcion ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00164_A435TIP_Descripcion ;
   private String[] T00165_A75SEG_Codigo ;
   private String[] T00165_A443SEG_UsuarioCreacion ;
   private String[] T00165_A445SEG_UsuarioModifica ;
   private java.util.Date[] T00165_A444SEG_FechaCreacion ;
   private java.util.Date[] T00165_A446SEG_FechaModifica ;
   private String[] T00165_A442SEG_Descripcion ;
   private String[] T00165_A435TIP_Descripcion ;
   private String[] T00165_A74TIP_Codigo ;
   private String[] T00166_A435TIP_Descripcion ;
   private String[] T00167_A75SEG_Codigo ;
   private String[] T00163_A75SEG_Codigo ;
   private String[] T00163_A443SEG_UsuarioCreacion ;
   private String[] T00163_A445SEG_UsuarioModifica ;
   private java.util.Date[] T00163_A444SEG_FechaCreacion ;
   private java.util.Date[] T00163_A446SEG_FechaModifica ;
   private String[] T00163_A442SEG_Descripcion ;
   private String[] T00163_A74TIP_Codigo ;
   private String[] T00168_A75SEG_Codigo ;
   private String[] T00169_A75SEG_Codigo ;
   private String[] T00162_A75SEG_Codigo ;
   private String[] T00162_A443SEG_UsuarioCreacion ;
   private String[] T00162_A445SEG_UsuarioModifica ;
   private java.util.Date[] T00162_A444SEG_FechaCreacion ;
   private java.util.Date[] T00162_A446SEG_FechaModifica ;
   private String[] T00162_A442SEG_Descripcion ;
   private String[] T00162_A74TIP_Codigo ;
   private String[] T001613_A435TIP_Descripcion ;
   private String[] T001614_A35FAM_Codigo ;
   private String[] T001615_A75SEG_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV11TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV15TrnContextAtt ;
}

final  class alm_cat_seg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00162", "SELECT SEG_Codigo, SEG_UsuarioCreacion, SEG_UsuarioModifica, SEG_FechaCreacion, SEG_FechaModifica, SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ?  FOR UPDATE OF SEG_UsuarioCreacion, SEG_UsuarioModifica, SEG_FechaCreacion, SEG_FechaModifica, SEG_Descripcion, TIP_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00163", "SELECT SEG_Codigo, SEG_UsuarioCreacion, SEG_UsuarioModifica, SEG_FechaCreacion, SEG_FechaModifica, SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00164", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00165", "SELECT /*+ FIRST_ROWS(100) */ TM1.SEG_Codigo, TM1.SEG_UsuarioCreacion, TM1.SEG_UsuarioModifica, TM1.SEG_FechaCreacion, TM1.SEG_FechaModifica, TM1.SEG_Descripcion, T2.TIP_Descripcion, TM1.TIP_Codigo FROM (ALM_CAT_SEG TM1 INNER JOIN ALM_CAT_TIP T2 ON T2.TIP_Codigo = TM1.TIP_Codigo) WHERE TM1.SEG_Codigo = ? ORDER BY TM1.SEG_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00166", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00167", "SELECT /*+ FIRST_ROWS(1) */ SEG_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00168", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SEG_Codigo FROM ALM_CAT_SEG WHERE ( SEG_Codigo > ?) ORDER BY SEG_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00169", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SEG_Codigo FROM ALM_CAT_SEG WHERE ( SEG_Codigo < ?) ORDER BY SEG_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001610", "INSERT INTO ALM_CAT_SEG(SEG_Codigo, SEG_UsuarioCreacion, SEG_UsuarioModifica, SEG_FechaCreacion, SEG_FechaModifica, SEG_Descripcion, TIP_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CAT_SEG")
         ,new UpdateCursor("T001611", "UPDATE ALM_CAT_SEG SET SEG_UsuarioCreacion=?, SEG_UsuarioModifica=?, SEG_FechaCreacion=?, SEG_FechaModifica=?, SEG_Descripcion=?, TIP_Codigo=?  WHERE SEG_Codigo = ?", GX_NOMASK, "ALM_CAT_SEG")
         ,new UpdateCursor("T001612", "DELETE FROM ALM_CAT_SEG  WHERE SEG_Codigo = ?", GX_NOMASK, "ALM_CAT_SEG")
         ,new ForEachCursor("T001613", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001614", "SELECT * FROM (SELECT FAM_Codigo FROM ALM_CAT_FAM WHERE SEG_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001615", "SELECT /*+ FIRST_ROWS(100) */ SEG_Codigo FROM ALM_CAT_SEG ORDER BY SEG_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setVarchar(7, (String)parms[6], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 100, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 3, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

