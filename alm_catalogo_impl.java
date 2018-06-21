/*
               File: alm_catalogo_impl
        Description: Catálogo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:5.77
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

public final  class alm_catalogo_impl extends GXDataArea
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
         A34Clas_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A34Clas_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A35FAM_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A35FAM_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A75SEG_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A75SEG_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A74TIP_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A74TIP_Codigo) ;
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
            AV7Cata_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Cata_Codigo", AV7Cata_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCATA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Cata_Codigo, ""))));
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
         Form.getMeta().addItem("description", "Catálogo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtCata_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_catalogo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_catalogo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_catalogo_impl.class ));
   }

   public alm_catalogo_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Catálogo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Codigo_Internalname, "del Bien", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_Codigo_Internalname, A37Cata_Codigo, GXutil.rtrim( localUtil.format( A37Cata_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_Codigo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Descripcion_Internalname, "del bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Codigo_Internalname, "Código Clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Codigo_Enabled, 1, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_34_Internalname, sImgUrl, imgprompt_34_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_34_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Descripcion_Internalname, "Descripción Clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Codigo_Internalname, "Familia Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Codigo_Internalname, A35FAM_Codigo, GXutil.rtrim( localUtil.format( A35FAM_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Codigo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Descripcion_Internalname, "Familia Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Descripcion_Internalname, A447FAM_Descripcion, GXutil.rtrim( localUtil.format( A447FAM_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_UsuarioCreacion_Internalname, "Creación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_UsuarioCreacion_Internalname, A303Cata_UsuarioCreacion, GXutil.rtrim( localUtil.format( A303Cata_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_FechaCreacion_Internalname, "Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtCata_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_FechaCreacion_Internalname, localUtil.ttoc( A304Cata_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A304Cata_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCata_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCata_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_UsuarioModificacion_Internalname, "Modificacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_UsuarioModificacion_Internalname, A305Cata_UsuarioModificacion, GXutil.rtrim( localUtil.format( A305Cata_UsuarioModificacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_UsuarioModificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_UsuarioModificacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_CATALOGO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_FechaModificacion_Internalname, "Modificacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtCata_FechaModificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_FechaModificacion_Internalname, localUtil.ttoc( A306Cata_FechaModificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A306Cata_FechaModificacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_FechaModificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_FechaModificacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtCata_FechaModificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCata_FechaModificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_CATALOGO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CATALOGO.htm");
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
      e110Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
            A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
            A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
            A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
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
            A303Cata_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtCata_UsuarioCreacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A303Cata_UsuarioCreacion", A303Cata_UsuarioCreacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCata_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CATA_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCata_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A304Cata_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A304Cata_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtCata_FechaCreacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            A305Cata_UsuarioModificacion = GXutil.upper( httpContext.cgiGet( edtCata_UsuarioModificacion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A305Cata_UsuarioModificacion", A305Cata_UsuarioModificacion);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtCata_FechaModificacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CATA_FECHAMODIFICACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCata_FechaModificacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A306Cata_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A306Cata_FechaModificacion = localUtil.ctot( httpContext.cgiGet( edtCata_FechaModificacion_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
            }
            /* Read saved values. */
            Z37Cata_Codigo = httpContext.cgiGet( "Z37Cata_Codigo") ;
            Z303Cata_UsuarioCreacion = httpContext.cgiGet( "Z303Cata_UsuarioCreacion") ;
            Z305Cata_UsuarioModificacion = httpContext.cgiGet( "Z305Cata_UsuarioModificacion") ;
            Z304Cata_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z304Cata_FechaCreacion"), 0) ;
            Z306Cata_FechaModificacion = localUtil.ctot( httpContext.cgiGet( "Z306Cata_FechaModificacion"), 0) ;
            Z298Cata_Descripcion = httpContext.cgiGet( "Z298Cata_Descripcion") ;
            Z34Clas_Codigo = httpContext.cgiGet( "Z34Clas_Codigo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N34Clas_Codigo = httpContext.cgiGet( "N34Clas_Codigo") ;
            AV7Cata_Codigo = httpContext.cgiGet( "vCATA_CODIGO") ;
            AV12Insert_Clas_Codigo = httpContext.cgiGet( "vINSERT_CLAS_CODIGO") ;
            AV21Usuario = httpContext.cgiGet( "vUSUARIO") ;
            AV23Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CATALOGO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A37Cata_Codigo, Z37Cata_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_catalogo:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A37Cata_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
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
                  sMode36 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode36 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound36 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0Z0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CATA_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCata_Codigo_Internalname ;
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
                        e110Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120Z2 ();
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
         e120Z2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Z36( ) ;
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
         disableAttributes0Z36( ) ;
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

   public void confirm_0Z0( )
   {
      beforeValidate0Z36( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Z36( ) ;
         }
         else
         {
            checkExtendedTable0Z36( ) ;
            closeExtendedTableCursors0Z36( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0Z0( )
   {
   }

   public void e110Z2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV23Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV23Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Insert_Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Clas_Codigo", AV12Insert_Clas_Codigo);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV23Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV24GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrim( GXutil.str( AV24GXV1, 8, 0)));
         while ( AV24GXV1 <= AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV24GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Clas_Codigo") == 0 )
            {
               AV12Insert_Clas_Codigo = AV13TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Clas_Codigo", AV12Insert_Clas_Codigo);
            }
            AV24GXV1 = (int)(AV24GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrim( GXutil.str( AV24GXV1, 8, 0)));
         }
      }
      AV21Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usuario", AV21Usuario);
   }

   public void e120Z2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_catalogo") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0Z36( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z303Cata_UsuarioCreacion = T000Z3_A303Cata_UsuarioCreacion[0] ;
            Z305Cata_UsuarioModificacion = T000Z3_A305Cata_UsuarioModificacion[0] ;
            Z304Cata_FechaCreacion = T000Z3_A304Cata_FechaCreacion[0] ;
            Z306Cata_FechaModificacion = T000Z3_A306Cata_FechaModificacion[0] ;
            Z298Cata_Descripcion = T000Z3_A298Cata_Descripcion[0] ;
            Z34Clas_Codigo = T000Z3_A34Clas_Codigo[0] ;
         }
         else
         {
            Z303Cata_UsuarioCreacion = A303Cata_UsuarioCreacion ;
            Z305Cata_UsuarioModificacion = A305Cata_UsuarioModificacion ;
            Z304Cata_FechaCreacion = A304Cata_FechaCreacion ;
            Z306Cata_FechaModificacion = A306Cata_FechaModificacion ;
            Z298Cata_Descripcion = A298Cata_Descripcion ;
            Z34Clas_Codigo = A34Clas_Codigo ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z37Cata_Codigo = A37Cata_Codigo ;
         Z303Cata_UsuarioCreacion = A303Cata_UsuarioCreacion ;
         Z305Cata_UsuarioModificacion = A305Cata_UsuarioModificacion ;
         Z304Cata_FechaCreacion = A304Cata_FechaCreacion ;
         Z306Cata_FechaModificacion = A306Cata_FechaModificacion ;
         Z298Cata_Descripcion = A298Cata_Descripcion ;
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z291Clas_Descripcion = A291Clas_Descripcion ;
         Z35FAM_Codigo = A35FAM_Codigo ;
         Z447FAM_Descripcion = A447FAM_Descripcion ;
         Z75SEG_Codigo = A75SEG_Codigo ;
         Z442SEG_Descripcion = A442SEG_Descripcion ;
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_34_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00y0"+"',["+"{Ctrl:gx.dom.el('"+"CLAS_CODIGO"+"'), id:'"+"CLAS_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV7Cata_Codigo)==0) )
      {
         A37Cata_Codigo = AV7Cata_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV7Cata_Codigo)==0) )
      {
         edtCata_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtCata_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV7Cata_Codigo)==0) )
      {
         edtCata_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV12Insert_Clas_Codigo)==0) )
      {
         edtClas_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtClas_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV12Insert_Clas_Codigo)==0) )
      {
         A34Clas_Codigo = AV12Insert_Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
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
         AV23Pgmname = "ALM_CATALOGO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
         /* Using cursor T000Z4 */
         pr_default.execute(2, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000Z4_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A35FAM_Codigo = T000Z4_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         pr_default.close(2);
         /* Using cursor T000Z5 */
         pr_default.execute(3, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000Z5_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000Z5_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(3);
         /* Using cursor T000Z6 */
         pr_default.execute(4, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000Z6_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000Z6_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(4);
         /* Using cursor T000Z7 */
         pr_default.execute(5, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000Z7_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(5);
      }
   }

   public void load0Z36( )
   {
      /* Using cursor T000Z8 */
      pr_default.execute(6, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A303Cata_UsuarioCreacion = T000Z8_A303Cata_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303Cata_UsuarioCreacion", A303Cata_UsuarioCreacion);
         A305Cata_UsuarioModificacion = T000Z8_A305Cata_UsuarioModificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305Cata_UsuarioModificacion", A305Cata_UsuarioModificacion);
         A304Cata_FechaCreacion = T000Z8_A304Cata_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A306Cata_FechaModificacion = T000Z8_A306Cata_FechaModificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
         A298Cata_Descripcion = T000Z8_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A291Clas_Descripcion = T000Z8_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A447FAM_Descripcion = T000Z8_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A442SEG_Descripcion = T000Z8_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A435TIP_Descripcion = T000Z8_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         A34Clas_Codigo = T000Z8_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         A35FAM_Codigo = T000Z8_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         A75SEG_Codigo = T000Z8_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         A74TIP_Codigo = T000Z8_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         zm0Z36( -13) ;
      }
      pr_default.close(6);
      onLoadActions0Z36( ) ;
   }

   public void onLoadActions0Z36( )
   {
      AV23Pgmname = "ALM_CATALOGO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
   }

   public void checkExtendedTable0Z36( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV23Pgmname = "ALM_CATALOGO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
      /* Using cursor T000Z4 */
      pr_default.execute(2, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "CLAS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClas_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A291Clas_Descripcion = T000Z4_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A35FAM_Codigo = T000Z4_A35FAM_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      pr_default.close(2);
      /* Using cursor T000Z5 */
      pr_default.execute(3, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Z5_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000Z5_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      pr_default.close(3);
      /* Using cursor T000Z6 */
      pr_default.execute(4, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Z6_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000Z6_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      pr_default.close(4);
      /* Using cursor T000Z7 */
      pr_default.execute(5, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Z7_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0Z36( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A34Clas_Codigo )
   {
      /* Using cursor T000Z9 */
      pr_default.execute(7, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "CLAS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClas_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A291Clas_Descripcion = T000Z9_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A35FAM_Codigo = T000Z9_A35FAM_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A291Clas_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A35FAM_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(7);
   }

   public void gxload_15( String A35FAM_Codigo )
   {
      /* Using cursor T000Z10 */
      pr_default.execute(8, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Z10_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000Z10_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A447FAM_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(8);
   }

   public void gxload_16( String A75SEG_Codigo )
   {
      /* Using cursor T000Z11 */
      pr_default.execute(9, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Z11_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000Z11_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A442SEG_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A74TIP_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_17( String A74TIP_Codigo )
   {
      /* Using cursor T000Z12 */
      pr_default.execute(10, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Z12_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A435TIP_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void getKey0Z36( )
   {
      /* Using cursor T000Z13 */
      pr_default.execute(11, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound36 = (short)(1) ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Z3 */
      pr_default.execute(1, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Z36( 13) ;
         RcdFound36 = (short)(1) ;
         A37Cata_Codigo = T000Z3_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         A303Cata_UsuarioCreacion = T000Z3_A303Cata_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303Cata_UsuarioCreacion", A303Cata_UsuarioCreacion);
         A305Cata_UsuarioModificacion = T000Z3_A305Cata_UsuarioModificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305Cata_UsuarioModificacion", A305Cata_UsuarioModificacion);
         A304Cata_FechaCreacion = T000Z3_A304Cata_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         A306Cata_FechaModificacion = T000Z3_A306Cata_FechaModificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
         A298Cata_Descripcion = T000Z3_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = T000Z3_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         Z37Cata_Codigo = A37Cata_Codigo ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0Z36( ) ;
         if ( AnyError == 1 )
         {
            RcdFound36 = (short)(0) ;
            initializeNonKey0Z36( ) ;
         }
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound36 = (short)(0) ;
         initializeNonKey0Z36( ) ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Z36( ) ;
      if ( RcdFound36 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound36 = (short)(0) ;
      /* Using cursor T000Z14 */
      pr_default.execute(12, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T000Z14_A37Cata_Codigo[0], A37Cata_Codigo) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T000Z14_A37Cata_Codigo[0], A37Cata_Codigo) > 0 ) ) )
         {
            A37Cata_Codigo = T000Z14_A37Cata_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
            RcdFound36 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound36 = (short)(0) ;
      /* Using cursor T000Z15 */
      pr_default.execute(13, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000Z15_A37Cata_Codigo[0], A37Cata_Codigo) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000Z15_A37Cata_Codigo[0], A37Cata_Codigo) < 0 ) ) )
         {
            A37Cata_Codigo = T000Z15_A37Cata_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
            RcdFound36 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Z36( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtCata_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0Z36( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound36 == 1 )
         {
            if ( GXutil.strcmp(A37Cata_Codigo, Z37Cata_Codigo) != 0 )
            {
               A37Cata_Codigo = Z37Cata_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CATA_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCata_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCata_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0Z36( ) ;
               GX_FocusControl = edtCata_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A37Cata_Codigo, Z37Cata_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtCata_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Z36( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CATA_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCata_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCata_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0Z36( ) ;
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
      if ( GXutil.strcmp(A37Cata_Codigo, Z37Cata_Codigo) != 0 )
      {
         A37Cata_Codigo = Z37Cata_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CATA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCata_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCata_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0Z36( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Z2 */
         pr_default.execute(0, new Object[] {A37Cata_Codigo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CATALOGO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z303Cata_UsuarioCreacion, T000Z2_A303Cata_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z305Cata_UsuarioModificacion, T000Z2_A305Cata_UsuarioModificacion[0]) != 0 ) || !( GXutil.dateCompare(Z304Cata_FechaCreacion, T000Z2_A304Cata_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z306Cata_FechaModificacion, T000Z2_A306Cata_FechaModificacion[0]) ) || ( GXutil.strcmp(Z298Cata_Descripcion, T000Z2_A298Cata_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z34Clas_Codigo, T000Z2_A34Clas_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CATALOGO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Z36( )
   {
      beforeValidate0Z36( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Z36( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Z36( 0) ;
         checkOptimisticConcurrency0Z36( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Z36( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Z36( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Z16 */
                  pr_default.execute(14, new Object[] {A37Cata_Codigo, A303Cata_UsuarioCreacion, A305Cata_UsuarioModificacion, A304Cata_FechaCreacion, A306Cata_FechaModificacion, A298Cata_Descripcion, A34Clas_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CATALOGO") ;
                  if ( (pr_default.getStatus(14) == 1) )
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
                        resetCaption0Z0( ) ;
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
            load0Z36( ) ;
         }
         endLevel0Z36( ) ;
      }
      closeExtendedTableCursors0Z36( ) ;
   }

   public void update0Z36( )
   {
      beforeValidate0Z36( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Z36( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Z36( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Z36( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Z36( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Z17 */
                  pr_default.execute(15, new Object[] {A303Cata_UsuarioCreacion, A305Cata_UsuarioModificacion, A304Cata_FechaCreacion, A306Cata_FechaModificacion, A298Cata_Descripcion, A34Clas_Codigo, A37Cata_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CATALOGO") ;
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CATALOGO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Z36( ) ;
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
         endLevel0Z36( ) ;
      }
      closeExtendedTableCursors0Z36( ) ;
   }

   public void deferredUpdate0Z36( )
   {
   }

   public void delete( )
   {
      beforeValidate0Z36( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Z36( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Z36( ) ;
         afterConfirm0Z36( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Z36( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Z18 */
               pr_default.execute(16, new Object[] {A37Cata_Codigo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CATALOGO") ;
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
      sMode36 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0Z36( ) ;
      Gx_mode = sMode36 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0Z36( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV23Pgmname = "ALM_CATALOGO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
         /* Using cursor T000Z19 */
         pr_default.execute(17, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000Z19_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A35FAM_Codigo = T000Z19_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         pr_default.close(17);
         /* Using cursor T000Z20 */
         pr_default.execute(18, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000Z20_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000Z20_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(18);
         /* Using cursor T000Z21 */
         pr_default.execute(19, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000Z21_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000Z21_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(19);
         /* Using cursor T000Z22 */
         pr_default.execute(20, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000Z22_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000Z23 */
         pr_default.execute(21, new Object[] {A37Cata_Codigo});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Elemento"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel0Z36( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Z36( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_catalogo");
         if ( AnyError == 0 )
         {
            confirmValues0Z0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_catalogo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Z36( )
   {
      /* Scan By routine */
      /* Using cursor T000Z24 */
      pr_default.execute(22);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A37Cata_Codigo = T000Z24_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Z36( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A37Cata_Codigo = T000Z24_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      }
   }

   public void scanEnd0Z36( )
   {
      pr_default.close(22);
   }

   public void afterConfirm0Z36( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A304Cata_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A306Cata_FechaModificacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A303Cata_UsuarioCreacion = AV21Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A303Cata_UsuarioCreacion", A303Cata_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A305Cata_UsuarioModificacion = AV21Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A305Cata_UsuarioModificacion", A305Cata_UsuarioModificacion);
      }
   }

   public void beforeInsert0Z36( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Z36( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Z36( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Z36( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Z36( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Z36( )
   {
      edtCata_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      edtCata_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Descripcion_Enabled, 5, 0)), true);
      edtClas_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      edtClas_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Descripcion_Enabled, 5, 0)), true);
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
      edtCata_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_UsuarioCreacion_Enabled, 5, 0)), true);
      edtCata_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_FechaCreacion_Enabled, 5, 0)), true);
      edtCata_UsuarioModificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_UsuarioModificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_UsuarioModificacion_Enabled, 5, 0)), true);
      edtCata_FechaModificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCata_FechaModificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_FechaModificacion_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Z0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141417763");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Cata_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z37Cata_Codigo", Z37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z303Cata_UsuarioCreacion", Z303Cata_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z305Cata_UsuarioModificacion", Z305Cata_UsuarioModificacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z304Cata_FechaCreacion", localUtil.ttoc( Z304Cata_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z306Cata_FechaModificacion", localUtil.ttoc( Z306Cata_FechaModificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z298Cata_Descripcion", Z298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z34Clas_Codigo", Z34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N34Clas_Codigo", A34Clas_Codigo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_CODIGO", AV7Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLAS_CODIGO", AV12Insert_Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV21Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV23Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCATA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Cata_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CATALOGO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_catalogo:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_catalogo") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Cata_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_CATALOGO" ;
   }

   public String getPgmdesc( )
   {
      return "Catálogo" ;
   }

   public void initializeNonKey0Z36( )
   {
      A34Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      A303Cata_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A303Cata_UsuarioCreacion", A303Cata_UsuarioCreacion);
      A305Cata_UsuarioModificacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A305Cata_UsuarioModificacion", A305Cata_UsuarioModificacion);
      A304Cata_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A304Cata_FechaCreacion", localUtil.ttoc( A304Cata_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A306Cata_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A306Cata_FechaModificacion", localUtil.ttoc( A306Cata_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
      A298Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A291Clas_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A35FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      A447FAM_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      A442SEG_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      A435TIP_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      Z303Cata_UsuarioCreacion = "" ;
      Z305Cata_UsuarioModificacion = "" ;
      Z304Cata_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z306Cata_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      Z298Cata_Descripcion = "" ;
      Z34Clas_Codigo = "" ;
   }

   public void initAll0Z36( )
   {
      A37Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      initializeNonKey0Z36( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141417772");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_catalogo.js", "?20186141417772");
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
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtCata_UsuarioCreacion_Internalname = "CATA_USUARIOCREACION" ;
      edtCata_FechaCreacion_Internalname = "CATA_FECHACREACION" ;
      edtCata_UsuarioModificacion_Internalname = "CATA_USUARIOMODIFICACION" ;
      edtCata_FechaModificacion_Internalname = "CATA_FECHAMODIFICACION" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_34_Internalname = "PROMPT_34" ;
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
      Form.setCaption( "Catálogo" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCata_FechaModificacion_Jsonclick = "" ;
      edtCata_FechaModificacion_Enabled = 1 ;
      edtCata_UsuarioModificacion_Jsonclick = "" ;
      edtCata_UsuarioModificacion_Enabled = 1 ;
      edtCata_FechaCreacion_Jsonclick = "" ;
      edtCata_FechaCreacion_Enabled = 1 ;
      edtCata_UsuarioCreacion_Jsonclick = "" ;
      edtCata_UsuarioCreacion_Enabled = 1 ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Enabled = 0 ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 0 ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Descripcion_Enabled = 0 ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 0 ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Descripcion_Enabled = 0 ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtFAM_Codigo_Enabled = 0 ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Enabled = 0 ;
      imgprompt_34_Visible = 1 ;
      imgprompt_34_Link = "" ;
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 1 ;
      edtCata_Descripcion_Enabled = 1 ;
      edtCata_Codigo_Jsonclick = "" ;
      edtCata_Codigo_Enabled = 1 ;
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

   public void valid_Clas_codigo( String GX_Parm1 ,
                                  String GX_Parm2 ,
                                  String GX_Parm3 ,
                                  String GX_Parm4 ,
                                  String GX_Parm5 ,
                                  String GX_Parm6 ,
                                  String GX_Parm7 ,
                                  String GX_Parm8 )
   {
      A34Clas_Codigo = GX_Parm1 ;
      A35FAM_Codigo = GX_Parm2 ;
      A75SEG_Codigo = GX_Parm3 ;
      A74TIP_Codigo = GX_Parm4 ;
      A291Clas_Descripcion = GX_Parm5 ;
      A447FAM_Descripcion = GX_Parm6 ;
      A442SEG_Descripcion = GX_Parm7 ;
      A435TIP_Descripcion = GX_Parm8 ;
      /* Using cursor T000Z19 */
      pr_default.execute(17, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "CLAS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClas_Codigo_Internalname ;
      }
      A291Clas_Descripcion = T000Z19_A291Clas_Descripcion[0] ;
      A35FAM_Codigo = T000Z19_A35FAM_Codigo[0] ;
      pr_default.close(17);
      /* Using cursor T000Z20 */
      pr_default.execute(18, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Z20_A447FAM_Descripcion[0] ;
      A75SEG_Codigo = T000Z20_A75SEG_Codigo[0] ;
      pr_default.close(18);
      /* Using cursor T000Z21 */
      pr_default.execute(19, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Z21_A442SEG_Descripcion[0] ;
      A74TIP_Codigo = T000Z21_A74TIP_Codigo[0] ;
      pr_default.close(19);
      /* Using cursor T000Z22 */
      pr_default.execute(20, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Z22_A435TIP_Descripcion[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A291Clas_Descripcion = "" ;
         A35FAM_Codigo = "" ;
         A447FAM_Descripcion = "" ;
         A75SEG_Codigo = "" ;
         A442SEG_Descripcion = "" ;
         A74TIP_Codigo = "" ;
         A435TIP_Descripcion = "" ;
      }
      isValidOutput.add(A291Clas_Descripcion);
      isValidOutput.add(A35FAM_Codigo);
      isValidOutput.add(A447FAM_Descripcion);
      isValidOutput.add(A75SEG_Codigo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Cata_Codigo',fld:'vCATA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120Z2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7Cata_Codigo = "" ;
      Z37Cata_Codigo = "" ;
      Z303Cata_UsuarioCreacion = "" ;
      Z305Cata_UsuarioModificacion = "" ;
      Z304Cata_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z306Cata_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      Z298Cata_Descripcion = "" ;
      Z34Clas_Codigo = "" ;
      N34Clas_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A74TIP_Codigo = "" ;
      Gx_mode = "" ;
      AV7Cata_Codigo = "" ;
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
      A37Cata_Codigo = "" ;
      A298Cata_Descripcion = "" ;
      sImgUrl = "" ;
      A291Clas_Descripcion = "" ;
      A447FAM_Descripcion = "" ;
      A442SEG_Descripcion = "" ;
      A435TIP_Descripcion = "" ;
      A303Cata_UsuarioCreacion = "" ;
      A304Cata_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A305Cata_UsuarioModificacion = "" ;
      A306Cata_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV12Insert_Clas_Codigo = "" ;
      AV21Usuario = "" ;
      AV23Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode36 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z291Clas_Descripcion = "" ;
      Z35FAM_Codigo = "" ;
      Z447FAM_Descripcion = "" ;
      Z75SEG_Codigo = "" ;
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
      Z435TIP_Descripcion = "" ;
      T000Z4_A291Clas_Descripcion = new String[] {""} ;
      T000Z4_A35FAM_Codigo = new String[] {""} ;
      T000Z5_A447FAM_Descripcion = new String[] {""} ;
      T000Z5_A75SEG_Codigo = new String[] {""} ;
      T000Z6_A442SEG_Descripcion = new String[] {""} ;
      T000Z6_A74TIP_Codigo = new String[] {""} ;
      T000Z7_A435TIP_Descripcion = new String[] {""} ;
      T000Z8_A37Cata_Codigo = new String[] {""} ;
      T000Z8_A303Cata_UsuarioCreacion = new String[] {""} ;
      T000Z8_A305Cata_UsuarioModificacion = new String[] {""} ;
      T000Z8_A304Cata_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z8_A306Cata_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z8_A298Cata_Descripcion = new String[] {""} ;
      T000Z8_A291Clas_Descripcion = new String[] {""} ;
      T000Z8_A447FAM_Descripcion = new String[] {""} ;
      T000Z8_A442SEG_Descripcion = new String[] {""} ;
      T000Z8_A435TIP_Descripcion = new String[] {""} ;
      T000Z8_A34Clas_Codigo = new String[] {""} ;
      T000Z8_A35FAM_Codigo = new String[] {""} ;
      T000Z8_A75SEG_Codigo = new String[] {""} ;
      T000Z8_A74TIP_Codigo = new String[] {""} ;
      T000Z9_A291Clas_Descripcion = new String[] {""} ;
      T000Z9_A35FAM_Codigo = new String[] {""} ;
      T000Z10_A447FAM_Descripcion = new String[] {""} ;
      T000Z10_A75SEG_Codigo = new String[] {""} ;
      T000Z11_A442SEG_Descripcion = new String[] {""} ;
      T000Z11_A74TIP_Codigo = new String[] {""} ;
      T000Z12_A435TIP_Descripcion = new String[] {""} ;
      T000Z13_A37Cata_Codigo = new String[] {""} ;
      T000Z3_A37Cata_Codigo = new String[] {""} ;
      T000Z3_A303Cata_UsuarioCreacion = new String[] {""} ;
      T000Z3_A305Cata_UsuarioModificacion = new String[] {""} ;
      T000Z3_A304Cata_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z3_A306Cata_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z3_A298Cata_Descripcion = new String[] {""} ;
      T000Z3_A34Clas_Codigo = new String[] {""} ;
      T000Z14_A37Cata_Codigo = new String[] {""} ;
      T000Z15_A37Cata_Codigo = new String[] {""} ;
      T000Z2_A37Cata_Codigo = new String[] {""} ;
      T000Z2_A303Cata_UsuarioCreacion = new String[] {""} ;
      T000Z2_A305Cata_UsuarioModificacion = new String[] {""} ;
      T000Z2_A304Cata_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z2_A306Cata_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Z2_A298Cata_Descripcion = new String[] {""} ;
      T000Z2_A34Clas_Codigo = new String[] {""} ;
      T000Z19_A291Clas_Descripcion = new String[] {""} ;
      T000Z19_A35FAM_Codigo = new String[] {""} ;
      T000Z20_A447FAM_Descripcion = new String[] {""} ;
      T000Z20_A75SEG_Codigo = new String[] {""} ;
      T000Z21_A442SEG_Descripcion = new String[] {""} ;
      T000Z21_A74TIP_Codigo = new String[] {""} ;
      T000Z22_A435TIP_Descripcion = new String[] {""} ;
      T000Z23_A66Elem_Consecutivo = new String[] {""} ;
      T000Z24_A37Cata_Codigo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_catalogo__default(),
         new Object[] {
             new Object[] {
            T000Z2_A37Cata_Codigo, T000Z2_A303Cata_UsuarioCreacion, T000Z2_A305Cata_UsuarioModificacion, T000Z2_A304Cata_FechaCreacion, T000Z2_A306Cata_FechaModificacion, T000Z2_A298Cata_Descripcion, T000Z2_A34Clas_Codigo
            }
            , new Object[] {
            T000Z3_A37Cata_Codigo, T000Z3_A303Cata_UsuarioCreacion, T000Z3_A305Cata_UsuarioModificacion, T000Z3_A304Cata_FechaCreacion, T000Z3_A306Cata_FechaModificacion, T000Z3_A298Cata_Descripcion, T000Z3_A34Clas_Codigo
            }
            , new Object[] {
            T000Z4_A291Clas_Descripcion, T000Z4_A35FAM_Codigo
            }
            , new Object[] {
            T000Z5_A447FAM_Descripcion, T000Z5_A75SEG_Codigo
            }
            , new Object[] {
            T000Z6_A442SEG_Descripcion, T000Z6_A74TIP_Codigo
            }
            , new Object[] {
            T000Z7_A435TIP_Descripcion
            }
            , new Object[] {
            T000Z8_A37Cata_Codigo, T000Z8_A303Cata_UsuarioCreacion, T000Z8_A305Cata_UsuarioModificacion, T000Z8_A304Cata_FechaCreacion, T000Z8_A306Cata_FechaModificacion, T000Z8_A298Cata_Descripcion, T000Z8_A291Clas_Descripcion, T000Z8_A447FAM_Descripcion, T000Z8_A442SEG_Descripcion, T000Z8_A435TIP_Descripcion,
            T000Z8_A34Clas_Codigo, T000Z8_A35FAM_Codigo, T000Z8_A75SEG_Codigo, T000Z8_A74TIP_Codigo
            }
            , new Object[] {
            T000Z9_A291Clas_Descripcion, T000Z9_A35FAM_Codigo
            }
            , new Object[] {
            T000Z10_A447FAM_Descripcion, T000Z10_A75SEG_Codigo
            }
            , new Object[] {
            T000Z11_A442SEG_Descripcion, T000Z11_A74TIP_Codigo
            }
            , new Object[] {
            T000Z12_A435TIP_Descripcion
            }
            , new Object[] {
            T000Z13_A37Cata_Codigo
            }
            , new Object[] {
            T000Z14_A37Cata_Codigo
            }
            , new Object[] {
            T000Z15_A37Cata_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Z19_A291Clas_Descripcion, T000Z19_A35FAM_Codigo
            }
            , new Object[] {
            T000Z20_A447FAM_Descripcion, T000Z20_A75SEG_Codigo
            }
            , new Object[] {
            T000Z21_A442SEG_Descripcion, T000Z21_A74TIP_Codigo
            }
            , new Object[] {
            T000Z22_A435TIP_Descripcion
            }
            , new Object[] {
            T000Z23_A66Elem_Consecutivo
            }
            , new Object[] {
            T000Z24_A37Cata_Codigo
            }
         }
      );
      AV23Pgmname = "ALM_CATALOGO" ;
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
   private short RcdFound36 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtCata_Codigo_Enabled ;
   private int edtCata_Descripcion_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int imgprompt_34_Visible ;
   private int edtClas_Descripcion_Enabled ;
   private int edtFAM_Codigo_Enabled ;
   private int edtFAM_Descripcion_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtCata_UsuarioCreacion_Enabled ;
   private int edtCata_FechaCreacion_Enabled ;
   private int edtCata_UsuarioModificacion_Enabled ;
   private int edtCata_FechaModificacion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV24GXV1 ;
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
   private String edtCata_Codigo_Internalname ;
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
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_34_Internalname ;
   private String imgprompt_34_Link ;
   private String edtClas_Descripcion_Internalname ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtCata_UsuarioCreacion_Internalname ;
   private String edtCata_UsuarioCreacion_Jsonclick ;
   private String edtCata_FechaCreacion_Internalname ;
   private String edtCata_FechaCreacion_Jsonclick ;
   private String edtCata_UsuarioModificacion_Internalname ;
   private String edtCata_UsuarioModificacion_Jsonclick ;
   private String edtCata_FechaModificacion_Internalname ;
   private String edtCata_FechaModificacion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV23Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode36 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z304Cata_FechaCreacion ;
   private java.util.Date Z306Cata_FechaModificacion ;
   private java.util.Date A304Cata_FechaCreacion ;
   private java.util.Date A306Cata_FechaModificacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV7Cata_Codigo ;
   private String Z37Cata_Codigo ;
   private String Z303Cata_UsuarioCreacion ;
   private String Z305Cata_UsuarioModificacion ;
   private String Z298Cata_Descripcion ;
   private String Z34Clas_Codigo ;
   private String N34Clas_Codigo ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
   private String A75SEG_Codigo ;
   private String A74TIP_Codigo ;
   private String AV7Cata_Codigo ;
   private String A37Cata_Codigo ;
   private String A298Cata_Descripcion ;
   private String A291Clas_Descripcion ;
   private String A447FAM_Descripcion ;
   private String A442SEG_Descripcion ;
   private String A435TIP_Descripcion ;
   private String A303Cata_UsuarioCreacion ;
   private String A305Cata_UsuarioModificacion ;
   private String AV12Insert_Clas_Codigo ;
   private String AV21Usuario ;
   private String Z291Clas_Descripcion ;
   private String Z35FAM_Codigo ;
   private String Z447FAM_Descripcion ;
   private String Z75SEG_Codigo ;
   private String Z442SEG_Descripcion ;
   private String Z74TIP_Codigo ;
   private String Z435TIP_Descripcion ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000Z4_A291Clas_Descripcion ;
   private String[] T000Z4_A35FAM_Codigo ;
   private String[] T000Z5_A447FAM_Descripcion ;
   private String[] T000Z5_A75SEG_Codigo ;
   private String[] T000Z6_A442SEG_Descripcion ;
   private String[] T000Z6_A74TIP_Codigo ;
   private String[] T000Z7_A435TIP_Descripcion ;
   private String[] T000Z8_A37Cata_Codigo ;
   private String[] T000Z8_A303Cata_UsuarioCreacion ;
   private String[] T000Z8_A305Cata_UsuarioModificacion ;
   private java.util.Date[] T000Z8_A304Cata_FechaCreacion ;
   private java.util.Date[] T000Z8_A306Cata_FechaModificacion ;
   private String[] T000Z8_A298Cata_Descripcion ;
   private String[] T000Z8_A291Clas_Descripcion ;
   private String[] T000Z8_A447FAM_Descripcion ;
   private String[] T000Z8_A442SEG_Descripcion ;
   private String[] T000Z8_A435TIP_Descripcion ;
   private String[] T000Z8_A34Clas_Codigo ;
   private String[] T000Z8_A35FAM_Codigo ;
   private String[] T000Z8_A75SEG_Codigo ;
   private String[] T000Z8_A74TIP_Codigo ;
   private String[] T000Z9_A291Clas_Descripcion ;
   private String[] T000Z9_A35FAM_Codigo ;
   private String[] T000Z10_A447FAM_Descripcion ;
   private String[] T000Z10_A75SEG_Codigo ;
   private String[] T000Z11_A442SEG_Descripcion ;
   private String[] T000Z11_A74TIP_Codigo ;
   private String[] T000Z12_A435TIP_Descripcion ;
   private String[] T000Z13_A37Cata_Codigo ;
   private String[] T000Z3_A37Cata_Codigo ;
   private String[] T000Z3_A303Cata_UsuarioCreacion ;
   private String[] T000Z3_A305Cata_UsuarioModificacion ;
   private java.util.Date[] T000Z3_A304Cata_FechaCreacion ;
   private java.util.Date[] T000Z3_A306Cata_FechaModificacion ;
   private String[] T000Z3_A298Cata_Descripcion ;
   private String[] T000Z3_A34Clas_Codigo ;
   private String[] T000Z14_A37Cata_Codigo ;
   private String[] T000Z15_A37Cata_Codigo ;
   private String[] T000Z2_A37Cata_Codigo ;
   private String[] T000Z2_A303Cata_UsuarioCreacion ;
   private String[] T000Z2_A305Cata_UsuarioModificacion ;
   private java.util.Date[] T000Z2_A304Cata_FechaCreacion ;
   private java.util.Date[] T000Z2_A306Cata_FechaModificacion ;
   private String[] T000Z2_A298Cata_Descripcion ;
   private String[] T000Z2_A34Clas_Codigo ;
   private String[] T000Z19_A291Clas_Descripcion ;
   private String[] T000Z19_A35FAM_Codigo ;
   private String[] T000Z20_A447FAM_Descripcion ;
   private String[] T000Z20_A75SEG_Codigo ;
   private String[] T000Z21_A442SEG_Descripcion ;
   private String[] T000Z21_A74TIP_Codigo ;
   private String[] T000Z22_A435TIP_Descripcion ;
   private String[] T000Z23_A66Elem_Consecutivo ;
   private String[] T000Z24_A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class alm_catalogo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Z2", "SELECT Cata_Codigo, Cata_UsuarioCreacion, Cata_UsuarioModificacion, Cata_FechaCreacion, Cata_FechaModificacion, Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ?  FOR UPDATE OF Cata_UsuarioCreacion, Cata_UsuarioModificacion, Cata_FechaCreacion, Cata_FechaModificacion, Cata_Descripcion, Clas_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z3", "SELECT Cata_Codigo, Cata_UsuarioCreacion, Cata_UsuarioModificacion, Cata_FechaCreacion, Cata_FechaModificacion, Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z4", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z5", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z6", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z7", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Cata_Codigo, TM1.Cata_UsuarioCreacion, TM1.Cata_UsuarioModificacion, TM1.Cata_FechaCreacion, TM1.Cata_FechaModificacion, TM1.Cata_Descripcion, T2.Clas_Descripcion, T3.FAM_Descripcion, T4.SEG_Descripcion, T5.TIP_Descripcion, TM1.Clas_Codigo, T2.FAM_Codigo, T3.SEG_Codigo, T4.TIP_Codigo FROM ((((ALM_CATALOGO TM1 INNER JOIN ALM_CLASE T2 ON T2.Clas_Codigo = TM1.Clas_Codigo) INNER JOIN ALM_CAT_FAM T3 ON T3.FAM_Codigo = T2.FAM_Codigo) INNER JOIN ALM_CAT_SEG T4 ON T4.SEG_Codigo = T3.SEG_Codigo) INNER JOIN ALM_CAT_TIP T5 ON T5.TIP_Codigo = T4.TIP_Codigo) WHERE TM1.Cata_Codigo = ? ORDER BY TM1.Cata_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000Z9", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z10", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z11", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z12", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z13", "SELECT /*+ FIRST_ROWS(1) */ Cata_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cata_Codigo FROM ALM_CATALOGO WHERE ( Cata_Codigo > ?) ORDER BY Cata_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Z15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Cata_Codigo FROM ALM_CATALOGO WHERE ( Cata_Codigo < ?) ORDER BY Cata_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Z16", "INSERT INTO ALM_CATALOGO(Cata_Codigo, Cata_UsuarioCreacion, Cata_UsuarioModificacion, Cata_FechaCreacion, Cata_FechaModificacion, Cata_Descripcion, Clas_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CATALOGO")
         ,new UpdateCursor("T000Z17", "UPDATE ALM_CATALOGO SET Cata_UsuarioCreacion=?, Cata_UsuarioModificacion=?, Cata_FechaCreacion=?, Cata_FechaModificacion=?, Cata_Descripcion=?, Clas_Codigo=?  WHERE Cata_Codigo = ?", GX_NOMASK, "ALM_CATALOGO")
         ,new UpdateCursor("T000Z18", "DELETE FROM ALM_CATALOGO  WHERE Cata_Codigo = ?", GX_NOMASK, "ALM_CATALOGO")
         ,new ForEachCursor("T000Z19", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z20", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z21", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z22", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Z23", "SELECT * FROM (SELECT Elem_Consecutivo FROM ALM_ELEMENTO WHERE Cata_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Z24", "SELECT /*+ FIRST_ROWS(100) */ Cata_Codigo FROM ALM_CATALOGO ORDER BY Cata_Codigo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
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
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(14) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               return;
            case 22 :
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
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 200, false);
               stmt.setVarchar(7, (String)parms[6], 7, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               stmt.setVarchar(6, (String)parms[5], 7, false);
               stmt.setVarchar(7, (String)parms[6], 9, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
      }
   }

}

