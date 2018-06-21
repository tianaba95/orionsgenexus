/*
               File: alm_elemento_impl
        Description: Elemento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:43.60
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

public final  class alm_elemento_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A37Cata_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A37Cata_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A34Clas_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A34Clas_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A35FAM_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A35FAM_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A75SEG_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A75SEG_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A74TIP_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A74TIP_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A77UNIMED_COD = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A77UNIMED_COD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A33Tipo_Codigo) ;
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
            AV15Elem_Consecutivo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Elem_Consecutivo", AV15Elem_Consecutivo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Elem_Consecutivo, ""))));
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
      cmbElem_Estado.setName( "ELEM_ESTADO" );
      cmbElem_Estado.setWebtags( "" );
      cmbElem_Estado.addItem("A", "Activo", (short)(0));
      cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbElem_Estado.getItemCount() > 0 )
      {
         A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
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
         Form.getMeta().addItem("description", "Elemento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtElem_Consecutivo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_elemento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_elemento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_elemento_impl.class ));
   }

   public alm_elemento_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbElem_Estado = new HTMLChoice();
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
      if ( cmbElem_Estado.getItemCount() > 0 )
      {
         A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Elemento", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_Consecutivo_Internalname, A66Elem_Consecutivo, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_Consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_Consecutivo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtElem_Descripcion_Internalname, A557Elem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtElem_Descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Codigo_Internalname, "Código del Bien", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCata_Codigo_Internalname, A37Cata_Codigo, GXutil.rtrim( localUtil.format( A37Cata_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCata_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCata_Codigo_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_37_Internalname, sImgUrl, imgprompt_37_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_37_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCata_Descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtCata_Descripcion_Internalname, A298Cata_Descripcion, "", "", (short)(0), 1, edtCata_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Codigo_Internalname, A35FAM_Codigo, GXutil.rtrim( localUtil.format( A35FAM_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Codigo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Descripcion_Internalname, A447FAM_Descripcion, GXutil.rtrim( localUtil.format( A447FAM_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUNIMED_COD_Internalname, "UNIDAD MEDIDA CODIGO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUNIMED_COD_Internalname, GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUNIMED_COD_Jsonclick, 0, "Attribute", "", "", "", 1, edtUNIMED_COD_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_77_Internalname, sImgUrl, imgprompt_77_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_77_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUNIMED_DES_Internalname, "UNIDAD MEDIDA DESCRIPCION", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtUNIMED_DES_Internalname, A496UNIMED_DES, "", "", (short)(0), 1, edtUNIMED_DES_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbElem_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbElem_Estado, cmbElem_Estado.getInternalname(), GXutil.rtrim( A558Elem_Estado), 1, cmbElem_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbElem_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "", true, "HLP_ALM_ELEMENTO.htm");
         cmbElem_Estado.setValue( GXutil.rtrim( A558Elem_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbElem_Estado.getInternalname(), "Values", cmbElem_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Codigo_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_33_Internalname, sImgUrl, imgprompt_33_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_33_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Descripcion_Internalname, "Tipo de Elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVida_Util_Internalname, "Vida_Util", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVida_Util_Internalname, GXutil.ltrim( localUtil.ntoc( A632Vida_Util, (byte)(4), (byte)(0), ",", "")), ((edtVida_Util_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVida_Util_Jsonclick, 0, "Attribute", "", "", "", 1, edtVida_Util_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_UsuarioCreacion_Internalname, "Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_UsuarioCreacion_Internalname, A570Elem_UsuarioCreacion, GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_UsuarioCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_UsuarioCreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_FechaCreacion_Internalname, "Creacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtElem_FechaCreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_FechaCreacion_Internalname, localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_FechaCreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_FechaCreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtElem_FechaCreacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtElem_FechaCreacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_UsuarioModifica_Internalname, "Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_UsuarioModifica_Internalname, A572Elem_UsuarioModifica, GXutil.rtrim( localUtil.format( A572Elem_UsuarioModifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_UsuarioModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_UsuarioModifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtElem_FechaModifica_Internalname, "Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtElem_FechaModifica_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtElem_FechaModifica_Internalname, localUtil.ttoc( A573Elem_FechaModifica, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A573Elem_FechaModifica, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtElem_FechaModifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtElem_FechaModifica_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtElem_FechaModifica_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtElem_FechaModifica_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_ELEMENTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ELEMENTO.htm");
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
      e110W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNIMED_COD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUNIMED_COD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A77UNIMED_COD = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
            }
            else
            {
               A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
            }
            A496UNIMED_DES = httpContext.cgiGet( edtUNIMED_DES_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
            cmbElem_Estado.setValue( httpContext.cgiGet( cmbElem_Estado.getInternalname()) );
            A558Elem_Estado = httpContext.cgiGet( cmbElem_Estado.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPO_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A33Tipo_Codigo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            else
            {
               A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVida_Util_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VIDA_UTIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVida_Util_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A632Vida_Util = (short)(0) ;
               n632Vida_Util = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
            }
            else
            {
               A632Vida_Util = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Internalname), ",", ".")) ;
               n632Vida_Util = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
            }
            n632Vida_Util = ((0==A632Vida_Util) ? true : false) ;
            A570Elem_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioCreacion_Internalname)) ;
            n570Elem_UsuarioCreacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
            n570Elem_UsuarioCreacion = ((GXutil.strcmp("", A570Elem_UsuarioCreacion)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtElem_FechaCreacion_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ELEM_FECHACREACION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtElem_FechaCreacion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
               n571Elem_FechaCreacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A571Elem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtElem_FechaCreacion_Internalname)) ;
               n571Elem_FechaCreacion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
            }
            n571Elem_FechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A571Elem_FechaCreacion) ? true : false) ;
            A572Elem_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioModifica_Internalname)) ;
            n572Elem_UsuarioModifica = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
            n572Elem_UsuarioModifica = ((GXutil.strcmp("", A572Elem_UsuarioModifica)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtElem_FechaModifica_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ELEM_FECHAMODIFICA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtElem_FechaModifica_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
               n573Elem_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A573Elem_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtElem_FechaModifica_Internalname)) ;
               n573Elem_FechaModifica = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
            }
            n573Elem_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A573Elem_FechaModifica) ? true : false) ;
            /* Read saved values. */
            Z66Elem_Consecutivo = httpContext.cgiGet( "Z66Elem_Consecutivo") ;
            Z557Elem_Descripcion = httpContext.cgiGet( "Z557Elem_Descripcion") ;
            Z558Elem_Estado = httpContext.cgiGet( "Z558Elem_Estado") ;
            Z632Vida_Util = (short)(localUtil.ctol( httpContext.cgiGet( "Z632Vida_Util"), ",", ".")) ;
            n632Vida_Util = ((0==A632Vida_Util) ? true : false) ;
            Z570Elem_UsuarioCreacion = httpContext.cgiGet( "Z570Elem_UsuarioCreacion") ;
            n570Elem_UsuarioCreacion = ((GXutil.strcmp("", A570Elem_UsuarioCreacion)==0) ? true : false) ;
            Z571Elem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z571Elem_FechaCreacion"), 0) ;
            n571Elem_FechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A571Elem_FechaCreacion) ? true : false) ;
            Z572Elem_UsuarioModifica = httpContext.cgiGet( "Z572Elem_UsuarioModifica") ;
            n572Elem_UsuarioModifica = ((GXutil.strcmp("", A572Elem_UsuarioModifica)==0) ? true : false) ;
            Z573Elem_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z573Elem_FechaModifica"), 0) ;
            n573Elem_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A573Elem_FechaModifica) ? true : false) ;
            Z37Cata_Codigo = httpContext.cgiGet( "Z37Cata_Codigo") ;
            Z77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( "Z77UNIMED_COD"), ",", ".")) ;
            Z33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "Z33Tipo_Codigo"), ",", ".") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N37Cata_Codigo = httpContext.cgiGet( "N37Cata_Codigo") ;
            N77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( "N77UNIMED_COD"), ",", ".")) ;
            N33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "N33Tipo_Codigo"), ",", ".") ;
            AV15Elem_Consecutivo = httpContext.cgiGet( "vELEM_CONSECUTIVO") ;
            AV11Insert_Cata_Codigo = httpContext.cgiGet( "vINSERT_CATA_CODIGO") ;
            AV12Insert_UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_UNIMED_COD"), ",", ".")) ;
            AV13Insert_Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPO_CODIGO"), ",", ".") ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_ELEMENTO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_elemento:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
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
                  sMode33 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode33 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound33 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0W0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ELEM_CONSECUTIVO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtElem_Consecutivo_Internalname ;
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
                        e110W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120W2 ();
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
         e120W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0W33( ) ;
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
         disableAttributes0W33( ) ;
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

   public void confirm_0W0( )
   {
      beforeValidate0W33( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0W33( ) ;
         }
         else
         {
            checkExtendedTable0W33( ) ;
            closeExtendedTableCursors0W33( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0W0( )
   {
   }

   public void e110W2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      AV11Insert_Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Cata_Codigo", AV11Insert_Cata_Codigo);
      AV12Insert_UNIMED_COD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_UNIMED_COD", GXutil.ltrim( GXutil.str( AV12Insert_UNIMED_COD, 6, 0)));
      AV13Insert_Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Tipo_Codigo", GXutil.ltrim( GXutil.str( AV13Insert_Tipo_Codigo, 18, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV16Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV17GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         while ( AV17GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV17GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Cata_Codigo") == 0 )
            {
               AV11Insert_Cata_Codigo = AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Cata_Codigo", AV11Insert_Cata_Codigo);
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "UNIMED_COD") == 0 )
            {
               AV12Insert_UNIMED_COD = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_UNIMED_COD", GXutil.ltrim( GXutil.str( AV12Insert_UNIMED_COD, 6, 0)));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tipo_Codigo") == 0 )
            {
               AV13Insert_Tipo_Codigo = GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Tipo_Codigo", GXutil.ltrim( GXutil.str( AV13Insert_Tipo_Codigo, 18, 0)));
            }
            AV17GXV1 = (int)(AV17GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17GXV1", GXutil.ltrim( GXutil.str( AV17GXV1, 8, 0)));
         }
      }
   }

   public void e120W2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_elemento") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0W33( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z557Elem_Descripcion = T000W3_A557Elem_Descripcion[0] ;
            Z558Elem_Estado = T000W3_A558Elem_Estado[0] ;
            Z632Vida_Util = T000W3_A632Vida_Util[0] ;
            Z570Elem_UsuarioCreacion = T000W3_A570Elem_UsuarioCreacion[0] ;
            Z571Elem_FechaCreacion = T000W3_A571Elem_FechaCreacion[0] ;
            Z572Elem_UsuarioModifica = T000W3_A572Elem_UsuarioModifica[0] ;
            Z573Elem_FechaModifica = T000W3_A573Elem_FechaModifica[0] ;
            Z37Cata_Codigo = T000W3_A37Cata_Codigo[0] ;
            Z77UNIMED_COD = T000W3_A77UNIMED_COD[0] ;
            Z33Tipo_Codigo = T000W3_A33Tipo_Codigo[0] ;
         }
         else
         {
            Z557Elem_Descripcion = A557Elem_Descripcion ;
            Z558Elem_Estado = A558Elem_Estado ;
            Z632Vida_Util = A632Vida_Util ;
            Z570Elem_UsuarioCreacion = A570Elem_UsuarioCreacion ;
            Z571Elem_FechaCreacion = A571Elem_FechaCreacion ;
            Z572Elem_UsuarioModifica = A572Elem_UsuarioModifica ;
            Z573Elem_FechaModifica = A573Elem_FechaModifica ;
            Z37Cata_Codigo = A37Cata_Codigo ;
            Z77UNIMED_COD = A77UNIMED_COD ;
            Z33Tipo_Codigo = A33Tipo_Codigo ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         Z557Elem_Descripcion = A557Elem_Descripcion ;
         Z558Elem_Estado = A558Elem_Estado ;
         Z632Vida_Util = A632Vida_Util ;
         Z570Elem_UsuarioCreacion = A570Elem_UsuarioCreacion ;
         Z571Elem_FechaCreacion = A571Elem_FechaCreacion ;
         Z572Elem_UsuarioModifica = A572Elem_UsuarioModifica ;
         Z573Elem_FechaModifica = A573Elem_FechaModifica ;
         Z37Cata_Codigo = A37Cata_Codigo ;
         Z77UNIMED_COD = A77UNIMED_COD ;
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         Z298Cata_Descripcion = A298Cata_Descripcion ;
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z291Clas_Descripcion = A291Clas_Descripcion ;
         Z35FAM_Codigo = A35FAM_Codigo ;
         Z447FAM_Descripcion = A447FAM_Descripcion ;
         Z75SEG_Codigo = A75SEG_Codigo ;
         Z442SEG_Descripcion = A442SEG_Descripcion ;
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
         Z496UNIMED_DES = A496UNIMED_DES ;
         Z253Tipo_Descripcion = A253Tipo_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_37_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0100"+"',["+"{Ctrl:gx.dom.el('"+"CATA_CODIGO"+"'), id:'"+"CATA_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_77_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx01a0"+"',["+"{Ctrl:gx.dom.el('"+"UNIMED_COD"+"'), id:'"+"UNIMED_COD"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_33_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00u0"+"',["+"{Ctrl:gx.dom.el('"+"TIPO_CODIGO"+"'), id:'"+"TIPO_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV15Elem_Consecutivo)==0) )
      {
         A66Elem_Consecutivo = AV15Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      if ( ! (GXutil.strcmp("", AV15Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      else
      {
         edtElem_Consecutivo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV15Elem_Consecutivo)==0) )
      {
         edtElem_Consecutivo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_Cata_Codigo)==0) )
      {
         edtCata_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtCata_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCata_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCata_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_UNIMED_COD) )
      {
         edtUNIMED_COD_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUNIMED_COD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUNIMED_COD_Enabled, 5, 0)), true);
      }
      else
      {
         edtUNIMED_COD_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUNIMED_COD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUNIMED_COD_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Tipo_Codigo) )
      {
         edtTipo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTipo_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Tipo_Codigo) )
      {
         A33Tipo_Codigo = AV13Insert_Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_UNIMED_COD) )
      {
         A77UNIMED_COD = AV12Insert_UNIMED_COD ;
         httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV11Insert_Cata_Codigo)==0) )
      {
         A37Cata_Codigo = AV11Insert_Cata_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
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
         AV16Pgmname = "ALM_ELEMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000W6 */
         pr_default.execute(4, new Object[] {new Long(A33Tipo_Codigo)});
         A253Tipo_Descripcion = T000W6_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         pr_default.close(4);
         /* Using cursor T000W5 */
         pr_default.execute(3, new Object[] {new Integer(A77UNIMED_COD)});
         A496UNIMED_DES = T000W5_A496UNIMED_DES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
         pr_default.close(3);
         /* Using cursor T000W4 */
         pr_default.execute(2, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000W4_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = T000W4_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         pr_default.close(2);
         /* Using cursor T000W7 */
         pr_default.execute(5, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000W7_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A35FAM_Codigo = T000W7_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         pr_default.close(5);
         /* Using cursor T000W8 */
         pr_default.execute(6, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000W8_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000W8_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(6);
         /* Using cursor T000W9 */
         pr_default.execute(7, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000W9_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000W9_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(7);
         /* Using cursor T000W10 */
         pr_default.execute(8, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000W10_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(8);
      }
   }

   public void load0W33( )
   {
      /* Using cursor T000W11 */
      pr_default.execute(9, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A557Elem_Descripcion = T000W11_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A298Cata_Descripcion = T000W11_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A291Clas_Descripcion = T000W11_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A447FAM_Descripcion = T000W11_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A442SEG_Descripcion = T000W11_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A435TIP_Descripcion = T000W11_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         A496UNIMED_DES = T000W11_A496UNIMED_DES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
         A558Elem_Estado = T000W11_A558Elem_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
         A253Tipo_Descripcion = T000W11_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A632Vida_Util = T000W11_A632Vida_Util[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
         n632Vida_Util = T000W11_n632Vida_Util[0] ;
         A570Elem_UsuarioCreacion = T000W11_A570Elem_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
         n570Elem_UsuarioCreacion = T000W11_n570Elem_UsuarioCreacion[0] ;
         A571Elem_FechaCreacion = T000W11_A571Elem_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         n571Elem_FechaCreacion = T000W11_n571Elem_FechaCreacion[0] ;
         A572Elem_UsuarioModifica = T000W11_A572Elem_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
         n572Elem_UsuarioModifica = T000W11_n572Elem_UsuarioModifica[0] ;
         A573Elem_FechaModifica = T000W11_A573Elem_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n573Elem_FechaModifica = T000W11_n573Elem_FechaModifica[0] ;
         A37Cata_Codigo = T000W11_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         A77UNIMED_COD = T000W11_A77UNIMED_COD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
         A33Tipo_Codigo = T000W11_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A34Clas_Codigo = T000W11_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         A35FAM_Codigo = T000W11_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         A75SEG_Codigo = T000W11_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         A74TIP_Codigo = T000W11_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         zm0W33( -15) ;
      }
      pr_default.close(9);
      onLoadActions0W33( ) ;
   }

   public void onLoadActions0W33( )
   {
      AV16Pgmname = "ALM_ELEMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable0W33( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV16Pgmname = "ALM_ELEMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      /* Using cursor T000W4 */
      pr_default.execute(2, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "CATA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCata_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A298Cata_Descripcion = T000W4_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = T000W4_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      pr_default.close(2);
      /* Using cursor T000W7 */
      pr_default.execute(5, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000W7_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A35FAM_Codigo = T000W7_A35FAM_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      pr_default.close(5);
      /* Using cursor T000W8 */
      pr_default.execute(6, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000W8_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000W8_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      pr_default.close(6);
      /* Using cursor T000W9 */
      pr_default.execute(7, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000W9_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000W9_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      pr_default.close(7);
      /* Using cursor T000W10 */
      pr_default.execute(8, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000W10_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(8);
      /* Using cursor T000W5 */
      pr_default.execute(3, new Object[] {new Integer(A77UNIMED_COD)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'UNIDAD DE MEDIDA'.", "ForeignKeyNotFound", 1, "UNIMED_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUNIMED_COD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A496UNIMED_DES = T000W5_A496UNIMED_DES[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
      pr_default.close(3);
      /* Using cursor T000W6 */
      pr_default.execute(4, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A253Tipo_Descripcion = T000W6_A253Tipo_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0W33( )
   {
      pr_default.close(2);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A37Cata_Codigo )
   {
      /* Using cursor T000W12 */
      pr_default.execute(10, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "CATA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCata_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A298Cata_Descripcion = T000W12_A298Cata_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = T000W12_A34Clas_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A298Cata_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A34Clas_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_19( String A34Clas_Codigo )
   {
      /* Using cursor T000W13 */
      pr_default.execute(11, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000W13_A291Clas_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      A35FAM_Codigo = T000W13_A35FAM_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A291Clas_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A35FAM_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void gxload_20( String A35FAM_Codigo )
   {
      /* Using cursor T000W14 */
      pr_default.execute(12, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000W14_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000W14_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A447FAM_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_21( String A75SEG_Codigo )
   {
      /* Using cursor T000W15 */
      pr_default.execute(13, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000W15_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000W15_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A442SEG_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A74TIP_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_22( String A74TIP_Codigo )
   {
      /* Using cursor T000W16 */
      pr_default.execute(14, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000W16_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A435TIP_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_17( int A77UNIMED_COD )
   {
      /* Using cursor T000W17 */
      pr_default.execute(15, new Object[] {new Integer(A77UNIMED_COD)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'UNIDAD DE MEDIDA'.", "ForeignKeyNotFound", 1, "UNIMED_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUNIMED_COD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A496UNIMED_DES = T000W17_A496UNIMED_DES[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A496UNIMED_DES)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void gxload_18( long A33Tipo_Codigo )
   {
      /* Using cursor T000W18 */
      pr_default.execute(16, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A253Tipo_Descripcion = T000W18_A253Tipo_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A253Tipo_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(16);
   }

   public void getKey0W33( )
   {
      /* Using cursor T000W19 */
      pr_default.execute(17, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000W3 */
      pr_default.execute(1, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0W33( 15) ;
         RcdFound33 = (short)(1) ;
         A66Elem_Consecutivo = T000W3_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         A557Elem_Descripcion = T000W3_A557Elem_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
         A558Elem_Estado = T000W3_A558Elem_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
         A632Vida_Util = T000W3_A632Vida_Util[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
         n632Vida_Util = T000W3_n632Vida_Util[0] ;
         A570Elem_UsuarioCreacion = T000W3_A570Elem_UsuarioCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
         n570Elem_UsuarioCreacion = T000W3_n570Elem_UsuarioCreacion[0] ;
         A571Elem_FechaCreacion = T000W3_A571Elem_FechaCreacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         n571Elem_FechaCreacion = T000W3_n571Elem_FechaCreacion[0] ;
         A572Elem_UsuarioModifica = T000W3_A572Elem_UsuarioModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
         n572Elem_UsuarioModifica = T000W3_n572Elem_UsuarioModifica[0] ;
         A573Elem_FechaModifica = T000W3_A573Elem_FechaModifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
         n573Elem_FechaModifica = T000W3_n573Elem_FechaModifica[0] ;
         A37Cata_Codigo = T000W3_A37Cata_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
         A77UNIMED_COD = T000W3_A77UNIMED_COD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
         A33Tipo_Codigo = T000W3_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         Z66Elem_Consecutivo = A66Elem_Consecutivo ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0W33( ) ;
         if ( AnyError == 1 )
         {
            RcdFound33 = (short)(0) ;
            initializeNonKey0W33( ) ;
         }
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey0W33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0W33( ) ;
      if ( RcdFound33 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound33 = (short)(0) ;
      /* Using cursor T000W20 */
      pr_default.execute(18, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T000W20_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T000W20_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) ) )
         {
            A66Elem_Consecutivo = T000W20_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound33 = (short)(0) ;
      /* Using cursor T000W21 */
      pr_default.execute(19, new Object[] {A66Elem_Consecutivo});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T000W21_A66Elem_Consecutivo[0], A66Elem_Consecutivo) > 0 ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T000W21_A66Elem_Consecutivo[0], A66Elem_Consecutivo) < 0 ) ) )
         {
            A66Elem_Consecutivo = T000W21_A66Elem_Consecutivo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0W33( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0W33( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound33 == 1 )
         {
            if ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 )
            {
               A66Elem_Consecutivo = Z66Elem_Consecutivo ;
               httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ELEM_CONSECUTIVO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0W33( ) ;
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtElem_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0W33( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ELEM_CONSECUTIVO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtElem_Consecutivo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtElem_Consecutivo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0W33( ) ;
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
      if ( GXutil.strcmp(A66Elem_Consecutivo, Z66Elem_Consecutivo) != 0 )
      {
         A66Elem_Consecutivo = Z66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ELEM_CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtElem_Consecutivo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0W33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000W2 */
         pr_default.execute(0, new Object[] {A66Elem_Consecutivo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ELEMENTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z557Elem_Descripcion, T000W2_A557Elem_Descripcion[0]) != 0 ) || ( GXutil.strcmp(Z558Elem_Estado, T000W2_A558Elem_Estado[0]) != 0 ) || ( Z632Vida_Util != T000W2_A632Vida_Util[0] ) || ( GXutil.strcmp(Z570Elem_UsuarioCreacion, T000W2_A570Elem_UsuarioCreacion[0]) != 0 ) || !( GXutil.dateCompare(Z571Elem_FechaCreacion, T000W2_A571Elem_FechaCreacion[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z572Elem_UsuarioModifica, T000W2_A572Elem_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z573Elem_FechaModifica, T000W2_A573Elem_FechaModifica[0]) ) || ( GXutil.strcmp(Z37Cata_Codigo, T000W2_A37Cata_Codigo[0]) != 0 ) || ( Z77UNIMED_COD != T000W2_A77UNIMED_COD[0] ) || ( Z33Tipo_Codigo != T000W2_A33Tipo_Codigo[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_ELEMENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0W33( )
   {
      beforeValidate0W33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0W33( 0) ;
         checkOptimisticConcurrency0W33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0W33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000W22 */
                  pr_default.execute(20, new Object[] {A66Elem_Consecutivo, A557Elem_Descripcion, A558Elem_Estado, new Boolean(n632Vida_Util), new Short(A632Vida_Util), new Boolean(n570Elem_UsuarioCreacion), A570Elem_UsuarioCreacion, new Boolean(n571Elem_FechaCreacion), A571Elem_FechaCreacion, new Boolean(n572Elem_UsuarioModifica), A572Elem_UsuarioModifica, new Boolean(n573Elem_FechaModifica), A573Elem_FechaModifica, A37Cata_Codigo, new Integer(A77UNIMED_COD), new Long(A33Tipo_Codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ELEMENTO") ;
                  if ( (pr_default.getStatus(20) == 1) )
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
                        resetCaption0W0( ) ;
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
            load0W33( ) ;
         }
         endLevel0W33( ) ;
      }
      closeExtendedTableCursors0W33( ) ;
   }

   public void update0W33( )
   {
      beforeValidate0W33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W33( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W33( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0W33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000W23 */
                  pr_default.execute(21, new Object[] {A557Elem_Descripcion, A558Elem_Estado, new Boolean(n632Vida_Util), new Short(A632Vida_Util), new Boolean(n570Elem_UsuarioCreacion), A570Elem_UsuarioCreacion, new Boolean(n571Elem_FechaCreacion), A571Elem_FechaCreacion, new Boolean(n572Elem_UsuarioModifica), A572Elem_UsuarioModifica, new Boolean(n573Elem_FechaModifica), A573Elem_FechaModifica, A37Cata_Codigo, new Integer(A77UNIMED_COD), new Long(A33Tipo_Codigo), A66Elem_Consecutivo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ELEMENTO") ;
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ELEMENTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0W33( ) ;
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
         endLevel0W33( ) ;
      }
      closeExtendedTableCursors0W33( ) ;
   }

   public void deferredUpdate0W33( )
   {
   }

   public void delete( )
   {
      beforeValidate0W33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0W33( ) ;
         afterConfirm0W33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0W33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000W24 */
               pr_default.execute(22, new Object[] {A66Elem_Consecutivo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ELEMENTO") ;
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
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0W33( ) ;
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0W33( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "ALM_ELEMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000W25 */
         pr_default.execute(23, new Object[] {A37Cata_Codigo});
         A298Cata_Descripcion = T000W25_A298Cata_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
         A34Clas_Codigo = T000W25_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         pr_default.close(23);
         /* Using cursor T000W26 */
         pr_default.execute(24, new Object[] {A34Clas_Codigo});
         A291Clas_Descripcion = T000W26_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         A35FAM_Codigo = T000W26_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         pr_default.close(24);
         /* Using cursor T000W27 */
         pr_default.execute(25, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000W27_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000W27_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(25);
         /* Using cursor T000W28 */
         pr_default.execute(26, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000W28_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000W28_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(26);
         /* Using cursor T000W29 */
         pr_default.execute(27, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000W29_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(27);
         /* Using cursor T000W30 */
         pr_default.execute(28, new Object[] {new Integer(A77UNIMED_COD)});
         A496UNIMED_DES = T000W30_A496UNIMED_DES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
         pr_default.close(28);
         /* Using cursor T000W31 */
         pr_default.execute(29, new Object[] {new Long(A33Tipo_Codigo)});
         A253Tipo_Descripcion = T000W31_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000W32 */
         pr_default.execute(30, new Object[] {A66Elem_Consecutivo});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"HISTORIAL DEVOLUTIVOS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000W33 */
         pr_default.execute(31, new Object[] {A66Elem_Consecutivo});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"DETALLE TRANSACCIÓN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000W34 */
         pr_default.execute(32, new Object[] {A66Elem_Consecutivo});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"INVENTARIO DEVOLUTIVO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000W35 */
         pr_default.execute(33, new Object[] {A66Elem_Consecutivo});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACEN INVENTARIO CONSUMO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevel0W33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0W33( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_elemento");
         if ( AnyError == 0 )
         {
            confirmValues0W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_elemento");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0W33( )
   {
      /* Scan By routine */
      /* Using cursor T000W36 */
      pr_default.execute(34);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A66Elem_Consecutivo = T000W36_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0W33( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A66Elem_Consecutivo = T000W36_A66Elem_Consecutivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      }
   }

   public void scanEnd0W33( )
   {
      pr_default.close(34);
   }

   public void afterConfirm0W33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0W33( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0W33( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0W33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0W33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0W33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0W33( )
   {
      edtElem_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Consecutivo_Enabled, 5, 0)), true);
      edtElem_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_Descripcion_Enabled, 5, 0)), true);
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
      edtUNIMED_COD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUNIMED_COD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUNIMED_COD_Enabled, 5, 0)), true);
      edtUNIMED_DES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUNIMED_DES_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUNIMED_DES_Enabled, 5, 0)), true);
      cmbElem_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbElem_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbElem_Estado.getEnabled(), 5, 0)), true);
      edtTipo_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      edtTipo_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Descripcion_Enabled, 5, 0)), true);
      edtVida_Util_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVida_Util_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVida_Util_Enabled, 5, 0)), true);
      edtElem_UsuarioCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_UsuarioCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_UsuarioCreacion_Enabled, 5, 0)), true);
      edtElem_FechaCreacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_FechaCreacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_FechaCreacion_Enabled, 5, 0)), true);
      edtElem_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_UsuarioModifica_Enabled, 5, 0)), true);
      edtElem_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtElem_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtElem_FechaModifica_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0W0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414164671");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Elem_Consecutivo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z66Elem_Consecutivo", Z66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z557Elem_Descripcion", Z557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z558Elem_Estado", GXutil.rtrim( Z558Elem_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z632Vida_Util", GXutil.ltrim( localUtil.ntoc( Z632Vida_Util, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z570Elem_UsuarioCreacion", Z570Elem_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z571Elem_FechaCreacion", localUtil.ttoc( Z571Elem_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z572Elem_UsuarioModifica", Z572Elem_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z573Elem_FechaModifica", localUtil.ttoc( Z573Elem_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z37Cata_Codigo", Z37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z77UNIMED_COD", GXutil.ltrim( localUtil.ntoc( Z77UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( Z33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N37Cata_Codigo", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N77UNIMED_COD", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV15Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CATA_CODIGO", AV11Insert_Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_UNIMED_COD", GXutil.ltrim( localUtil.ntoc( AV12Insert_UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV13Insert_Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Elem_Consecutivo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_ELEMENTO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_elemento:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Elem_Consecutivo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_ELEMENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Elemento" ;
   }

   public void initializeNonKey0W33( )
   {
      A37Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A37Cata_Codigo", A37Cata_Codigo);
      A77UNIMED_COD = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A77UNIMED_COD", GXutil.ltrim( GXutil.str( A77UNIMED_COD, 6, 0)));
      A33Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      A557Elem_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A557Elem_Descripcion", A557Elem_Descripcion);
      A298Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A298Cata_Descripcion", A298Cata_Descripcion);
      A34Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
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
      A496UNIMED_DES = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A496UNIMED_DES", A496UNIMED_DES);
      A558Elem_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A558Elem_Estado", A558Elem_Estado);
      A253Tipo_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      A632Vida_Util = (short)(0) ;
      n632Vida_Util = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A632Vida_Util", GXutil.ltrim( GXutil.str( A632Vida_Util, 4, 0)));
      n632Vida_Util = ((0==A632Vida_Util) ? true : false) ;
      A570Elem_UsuarioCreacion = "" ;
      n570Elem_UsuarioCreacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A570Elem_UsuarioCreacion", A570Elem_UsuarioCreacion);
      n570Elem_UsuarioCreacion = ((GXutil.strcmp("", A570Elem_UsuarioCreacion)==0) ? true : false) ;
      A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      n571Elem_FechaCreacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A571Elem_FechaCreacion", localUtil.ttoc( A571Elem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      n571Elem_FechaCreacion = (GXutil.dateCompare(GXutil.nullDate(), A571Elem_FechaCreacion) ? true : false) ;
      A572Elem_UsuarioModifica = "" ;
      n572Elem_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A572Elem_UsuarioModifica", A572Elem_UsuarioModifica);
      n572Elem_UsuarioModifica = ((GXutil.strcmp("", A572Elem_UsuarioModifica)==0) ? true : false) ;
      A573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n573Elem_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A573Elem_FechaModifica", localUtil.ttoc( A573Elem_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      n573Elem_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A573Elem_FechaModifica) ? true : false) ;
      Z557Elem_Descripcion = "" ;
      Z558Elem_Estado = "" ;
      Z632Vida_Util = (short)(0) ;
      Z570Elem_UsuarioCreacion = "" ;
      Z571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z572Elem_UsuarioModifica = "" ;
      Z573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z37Cata_Codigo = "" ;
      Z77UNIMED_COD = 0 ;
      Z33Tipo_Codigo = 0 ;
   }

   public void initAll0W33( )
   {
      A66Elem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66Elem_Consecutivo", A66Elem_Consecutivo);
      initializeNonKey0W33( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414164685");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_elemento.js", "?201861414164685");
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
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
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
      edtUNIMED_COD_Internalname = "UNIMED_COD" ;
      edtUNIMED_DES_Internalname = "UNIMED_DES" ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO" );
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION" ;
      edtVida_Util_Internalname = "VIDA_UTIL" ;
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION" ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION" ;
      edtElem_UsuarioModifica_Internalname = "ELEM_USUARIOMODIFICA" ;
      edtElem_FechaModifica_Internalname = "ELEM_FECHAMODIFICA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_37_Internalname = "PROMPT_37" ;
      imgprompt_77_Internalname = "PROMPT_77" ;
      imgprompt_33_Internalname = "PROMPT_33" ;
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
      Form.setCaption( "Elemento" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtElem_FechaModifica_Jsonclick = "" ;
      edtElem_FechaModifica_Enabled = 1 ;
      edtElem_UsuarioModifica_Jsonclick = "" ;
      edtElem_UsuarioModifica_Enabled = 1 ;
      edtElem_FechaCreacion_Jsonclick = "" ;
      edtElem_FechaCreacion_Enabled = 1 ;
      edtElem_UsuarioCreacion_Jsonclick = "" ;
      edtElem_UsuarioCreacion_Enabled = 1 ;
      edtVida_Util_Jsonclick = "" ;
      edtVida_Util_Enabled = 1 ;
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Enabled = 0 ;
      imgprompt_33_Visible = 1 ;
      imgprompt_33_Link = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 1 ;
      cmbElem_Estado.setJsonclick( "" );
      cmbElem_Estado.setEnabled( 1 );
      edtUNIMED_DES_Enabled = 0 ;
      imgprompt_77_Visible = 1 ;
      imgprompt_77_Link = "" ;
      edtUNIMED_COD_Jsonclick = "" ;
      edtUNIMED_COD_Enabled = 1 ;
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
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 0 ;
      edtCata_Descripcion_Enabled = 0 ;
      imgprompt_37_Visible = 1 ;
      imgprompt_37_Link = "" ;
      edtCata_Codigo_Jsonclick = "" ;
      edtCata_Codigo_Enabled = 1 ;
      edtElem_Descripcion_Enabled = 1 ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtElem_Consecutivo_Enabled = 1 ;
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

   public void valid_Cata_codigo( String GX_Parm1 ,
                                  String GX_Parm2 ,
                                  String GX_Parm3 ,
                                  String GX_Parm4 ,
                                  String GX_Parm5 ,
                                  String GX_Parm6 ,
                                  String GX_Parm7 ,
                                  String GX_Parm8 ,
                                  String GX_Parm9 ,
                                  String GX_Parm10 )
   {
      A37Cata_Codigo = GX_Parm1 ;
      A34Clas_Codigo = GX_Parm2 ;
      A35FAM_Codigo = GX_Parm3 ;
      A75SEG_Codigo = GX_Parm4 ;
      A74TIP_Codigo = GX_Parm5 ;
      A298Cata_Descripcion = GX_Parm6 ;
      A291Clas_Descripcion = GX_Parm7 ;
      A447FAM_Descripcion = GX_Parm8 ;
      A442SEG_Descripcion = GX_Parm9 ;
      A435TIP_Descripcion = GX_Parm10 ;
      /* Using cursor T000W25 */
      pr_default.execute(23, new Object[] {A37Cata_Codigo});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Catálogo'.", "ForeignKeyNotFound", 1, "CATA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCata_Codigo_Internalname ;
      }
      A298Cata_Descripcion = T000W25_A298Cata_Descripcion[0] ;
      A34Clas_Codigo = T000W25_A34Clas_Codigo[0] ;
      pr_default.close(23);
      /* Using cursor T000W26 */
      pr_default.execute(24, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CLASE'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A291Clas_Descripcion = T000W26_A291Clas_Descripcion[0] ;
      A35FAM_Codigo = T000W26_A35FAM_Codigo[0] ;
      pr_default.close(24);
      /* Using cursor T000W27 */
      pr_default.execute(25, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000W27_A447FAM_Descripcion[0] ;
      A75SEG_Codigo = T000W27_A75SEG_Codigo[0] ;
      pr_default.close(25);
      /* Using cursor T000W28 */
      pr_default.execute(26, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000W28_A442SEG_Descripcion[0] ;
      A74TIP_Codigo = T000W28_A74TIP_Codigo[0] ;
      pr_default.close(26);
      /* Using cursor T000W29 */
      pr_default.execute(27, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000W29_A435TIP_Descripcion[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A298Cata_Descripcion = "" ;
         A34Clas_Codigo = "" ;
         A291Clas_Descripcion = "" ;
         A35FAM_Codigo = "" ;
         A447FAM_Descripcion = "" ;
         A75SEG_Codigo = "" ;
         A442SEG_Descripcion = "" ;
         A74TIP_Codigo = "" ;
         A435TIP_Descripcion = "" ;
      }
      isValidOutput.add(A298Cata_Descripcion);
      isValidOutput.add(A34Clas_Codigo);
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

   public void valid_Unimed_cod( int GX_Parm1 ,
                                 String GX_Parm2 )
   {
      A77UNIMED_COD = GX_Parm1 ;
      A496UNIMED_DES = GX_Parm2 ;
      /* Using cursor T000W30 */
      pr_default.execute(28, new Object[] {new Integer(A77UNIMED_COD)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'UNIDAD DE MEDIDA'.", "ForeignKeyNotFound", 1, "UNIMED_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUNIMED_COD_Internalname ;
      }
      A496UNIMED_DES = T000W30_A496UNIMED_DES[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A496UNIMED_DES = "" ;
      }
      isValidOutput.add(A496UNIMED_DES);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tipo_codigo( long GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A33Tipo_Codigo = GX_Parm1 ;
      A253Tipo_Descripcion = GX_Parm2 ;
      /* Using cursor T000W31 */
      pr_default.execute(29, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
      }
      A253Tipo_Descripcion = T000W31_A253Tipo_Descripcion[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A253Tipo_Descripcion = "" ;
      }
      isValidOutput.add(A253Tipo_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV15Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120W2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(23);
      pr_default.close(28);
      pr_default.close(29);
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
      wcpOAV15Elem_Consecutivo = "" ;
      Z66Elem_Consecutivo = "" ;
      Z557Elem_Descripcion = "" ;
      Z558Elem_Estado = "" ;
      Z570Elem_UsuarioCreacion = "" ;
      Z571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z572Elem_UsuarioModifica = "" ;
      Z573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z37Cata_Codigo = "" ;
      N37Cata_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A37Cata_Codigo = "" ;
      A34Clas_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A74TIP_Codigo = "" ;
      Gx_mode = "" ;
      AV15Elem_Consecutivo = "" ;
      GXKey = "" ;
      A558Elem_Estado = "" ;
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
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      sImgUrl = "" ;
      A298Cata_Descripcion = "" ;
      A291Clas_Descripcion = "" ;
      A447FAM_Descripcion = "" ;
      A442SEG_Descripcion = "" ;
      A435TIP_Descripcion = "" ;
      A496UNIMED_DES = "" ;
      A253Tipo_Descripcion = "" ;
      A570Elem_UsuarioCreacion = "" ;
      A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A572Elem_UsuarioModifica = "" ;
      A573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV11Insert_Cata_Codigo = "" ;
      AV16Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode33 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z298Cata_Descripcion = "" ;
      Z34Clas_Codigo = "" ;
      Z291Clas_Descripcion = "" ;
      Z35FAM_Codigo = "" ;
      Z447FAM_Descripcion = "" ;
      Z75SEG_Codigo = "" ;
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
      Z435TIP_Descripcion = "" ;
      Z496UNIMED_DES = "" ;
      Z253Tipo_Descripcion = "" ;
      T000W6_A253Tipo_Descripcion = new String[] {""} ;
      T000W5_A496UNIMED_DES = new String[] {""} ;
      T000W4_A298Cata_Descripcion = new String[] {""} ;
      T000W4_A34Clas_Codigo = new String[] {""} ;
      T000W7_A291Clas_Descripcion = new String[] {""} ;
      T000W7_A35FAM_Codigo = new String[] {""} ;
      T000W8_A447FAM_Descripcion = new String[] {""} ;
      T000W8_A75SEG_Codigo = new String[] {""} ;
      T000W9_A442SEG_Descripcion = new String[] {""} ;
      T000W9_A74TIP_Codigo = new String[] {""} ;
      T000W10_A435TIP_Descripcion = new String[] {""} ;
      T000W11_A66Elem_Consecutivo = new String[] {""} ;
      T000W11_A557Elem_Descripcion = new String[] {""} ;
      T000W11_A298Cata_Descripcion = new String[] {""} ;
      T000W11_A291Clas_Descripcion = new String[] {""} ;
      T000W11_A447FAM_Descripcion = new String[] {""} ;
      T000W11_A442SEG_Descripcion = new String[] {""} ;
      T000W11_A435TIP_Descripcion = new String[] {""} ;
      T000W11_A496UNIMED_DES = new String[] {""} ;
      T000W11_A558Elem_Estado = new String[] {""} ;
      T000W11_A253Tipo_Descripcion = new String[] {""} ;
      T000W11_A632Vida_Util = new short[1] ;
      T000W11_n632Vida_Util = new boolean[] {false} ;
      T000W11_A570Elem_UsuarioCreacion = new String[] {""} ;
      T000W11_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      T000W11_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000W11_n571Elem_FechaCreacion = new boolean[] {false} ;
      T000W11_A572Elem_UsuarioModifica = new String[] {""} ;
      T000W11_n572Elem_UsuarioModifica = new boolean[] {false} ;
      T000W11_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000W11_n573Elem_FechaModifica = new boolean[] {false} ;
      T000W11_A37Cata_Codigo = new String[] {""} ;
      T000W11_A77UNIMED_COD = new int[1] ;
      T000W11_A33Tipo_Codigo = new long[1] ;
      T000W11_A34Clas_Codigo = new String[] {""} ;
      T000W11_A35FAM_Codigo = new String[] {""} ;
      T000W11_A75SEG_Codigo = new String[] {""} ;
      T000W11_A74TIP_Codigo = new String[] {""} ;
      T000W12_A298Cata_Descripcion = new String[] {""} ;
      T000W12_A34Clas_Codigo = new String[] {""} ;
      T000W13_A291Clas_Descripcion = new String[] {""} ;
      T000W13_A35FAM_Codigo = new String[] {""} ;
      T000W14_A447FAM_Descripcion = new String[] {""} ;
      T000W14_A75SEG_Codigo = new String[] {""} ;
      T000W15_A442SEG_Descripcion = new String[] {""} ;
      T000W15_A74TIP_Codigo = new String[] {""} ;
      T000W16_A435TIP_Descripcion = new String[] {""} ;
      T000W17_A496UNIMED_DES = new String[] {""} ;
      T000W18_A253Tipo_Descripcion = new String[] {""} ;
      T000W19_A66Elem_Consecutivo = new String[] {""} ;
      T000W3_A66Elem_Consecutivo = new String[] {""} ;
      T000W3_A557Elem_Descripcion = new String[] {""} ;
      T000W3_A558Elem_Estado = new String[] {""} ;
      T000W3_A632Vida_Util = new short[1] ;
      T000W3_n632Vida_Util = new boolean[] {false} ;
      T000W3_A570Elem_UsuarioCreacion = new String[] {""} ;
      T000W3_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      T000W3_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n571Elem_FechaCreacion = new boolean[] {false} ;
      T000W3_A572Elem_UsuarioModifica = new String[] {""} ;
      T000W3_n572Elem_UsuarioModifica = new boolean[] {false} ;
      T000W3_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n573Elem_FechaModifica = new boolean[] {false} ;
      T000W3_A37Cata_Codigo = new String[] {""} ;
      T000W3_A77UNIMED_COD = new int[1] ;
      T000W3_A33Tipo_Codigo = new long[1] ;
      T000W20_A66Elem_Consecutivo = new String[] {""} ;
      T000W21_A66Elem_Consecutivo = new String[] {""} ;
      T000W2_A66Elem_Consecutivo = new String[] {""} ;
      T000W2_A557Elem_Descripcion = new String[] {""} ;
      T000W2_A558Elem_Estado = new String[] {""} ;
      T000W2_A632Vida_Util = new short[1] ;
      T000W2_n632Vida_Util = new boolean[] {false} ;
      T000W2_A570Elem_UsuarioCreacion = new String[] {""} ;
      T000W2_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      T000W2_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n571Elem_FechaCreacion = new boolean[] {false} ;
      T000W2_A572Elem_UsuarioModifica = new String[] {""} ;
      T000W2_n572Elem_UsuarioModifica = new boolean[] {false} ;
      T000W2_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n573Elem_FechaModifica = new boolean[] {false} ;
      T000W2_A37Cata_Codigo = new String[] {""} ;
      T000W2_A77UNIMED_COD = new int[1] ;
      T000W2_A33Tipo_Codigo = new long[1] ;
      T000W25_A298Cata_Descripcion = new String[] {""} ;
      T000W25_A34Clas_Codigo = new String[] {""} ;
      T000W26_A291Clas_Descripcion = new String[] {""} ;
      T000W26_A35FAM_Codigo = new String[] {""} ;
      T000W27_A447FAM_Descripcion = new String[] {""} ;
      T000W27_A75SEG_Codigo = new String[] {""} ;
      T000W28_A442SEG_Descripcion = new String[] {""} ;
      T000W28_A74TIP_Codigo = new String[] {""} ;
      T000W29_A435TIP_Descripcion = new String[] {""} ;
      T000W30_A496UNIMED_DES = new String[] {""} ;
      T000W31_A253Tipo_Descripcion = new String[] {""} ;
      T000W32_A95DEVOC_ID = new long[1] ;
      T000W33_A46Tran_Id = new long[1] ;
      T000W33_A69TDet_Consecutivo = new long[1] ;
      T000W34_A66Elem_Consecutivo = new String[] {""} ;
      T000W34_A67Invd_NumeroPlaca = new String[] {""} ;
      T000W35_A91Regional = new long[1] ;
      T000W35_A92Centro_Id = new long[1] ;
      T000W35_A27Alma_Modulo = new String[] {""} ;
      T000W35_A28Alma_Codigo = new String[] {""} ;
      T000W35_A31Bode_Codigo = new String[] {""} ;
      T000W35_A93Trans_Id = new long[1] ;
      T000W35_A66Elem_Consecutivo = new String[] {""} ;
      T000W35_A94Num_Linea = new int[1] ;
      T000W36_A66Elem_Consecutivo = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_elemento__default(),
         new Object[] {
             new Object[] {
            T000W2_A66Elem_Consecutivo, T000W2_A557Elem_Descripcion, T000W2_A558Elem_Estado, T000W2_A632Vida_Util, T000W2_n632Vida_Util, T000W2_A570Elem_UsuarioCreacion, T000W2_n570Elem_UsuarioCreacion, T000W2_A571Elem_FechaCreacion, T000W2_n571Elem_FechaCreacion, T000W2_A572Elem_UsuarioModifica,
            T000W2_n572Elem_UsuarioModifica, T000W2_A573Elem_FechaModifica, T000W2_n573Elem_FechaModifica, T000W2_A37Cata_Codigo, T000W2_A77UNIMED_COD, T000W2_A33Tipo_Codigo
            }
            , new Object[] {
            T000W3_A66Elem_Consecutivo, T000W3_A557Elem_Descripcion, T000W3_A558Elem_Estado, T000W3_A632Vida_Util, T000W3_n632Vida_Util, T000W3_A570Elem_UsuarioCreacion, T000W3_n570Elem_UsuarioCreacion, T000W3_A571Elem_FechaCreacion, T000W3_n571Elem_FechaCreacion, T000W3_A572Elem_UsuarioModifica,
            T000W3_n572Elem_UsuarioModifica, T000W3_A573Elem_FechaModifica, T000W3_n573Elem_FechaModifica, T000W3_A37Cata_Codigo, T000W3_A77UNIMED_COD, T000W3_A33Tipo_Codigo
            }
            , new Object[] {
            T000W4_A298Cata_Descripcion, T000W4_A34Clas_Codigo
            }
            , new Object[] {
            T000W5_A496UNIMED_DES
            }
            , new Object[] {
            T000W6_A253Tipo_Descripcion
            }
            , new Object[] {
            T000W7_A291Clas_Descripcion, T000W7_A35FAM_Codigo
            }
            , new Object[] {
            T000W8_A447FAM_Descripcion, T000W8_A75SEG_Codigo
            }
            , new Object[] {
            T000W9_A442SEG_Descripcion, T000W9_A74TIP_Codigo
            }
            , new Object[] {
            T000W10_A435TIP_Descripcion
            }
            , new Object[] {
            T000W11_A66Elem_Consecutivo, T000W11_A557Elem_Descripcion, T000W11_A298Cata_Descripcion, T000W11_A291Clas_Descripcion, T000W11_A447FAM_Descripcion, T000W11_A442SEG_Descripcion, T000W11_A435TIP_Descripcion, T000W11_A496UNIMED_DES, T000W11_A558Elem_Estado, T000W11_A253Tipo_Descripcion,
            T000W11_A632Vida_Util, T000W11_n632Vida_Util, T000W11_A570Elem_UsuarioCreacion, T000W11_n570Elem_UsuarioCreacion, T000W11_A571Elem_FechaCreacion, T000W11_n571Elem_FechaCreacion, T000W11_A572Elem_UsuarioModifica, T000W11_n572Elem_UsuarioModifica, T000W11_A573Elem_FechaModifica, T000W11_n573Elem_FechaModifica,
            T000W11_A37Cata_Codigo, T000W11_A77UNIMED_COD, T000W11_A33Tipo_Codigo, T000W11_A34Clas_Codigo, T000W11_A35FAM_Codigo, T000W11_A75SEG_Codigo, T000W11_A74TIP_Codigo
            }
            , new Object[] {
            T000W12_A298Cata_Descripcion, T000W12_A34Clas_Codigo
            }
            , new Object[] {
            T000W13_A291Clas_Descripcion, T000W13_A35FAM_Codigo
            }
            , new Object[] {
            T000W14_A447FAM_Descripcion, T000W14_A75SEG_Codigo
            }
            , new Object[] {
            T000W15_A442SEG_Descripcion, T000W15_A74TIP_Codigo
            }
            , new Object[] {
            T000W16_A435TIP_Descripcion
            }
            , new Object[] {
            T000W17_A496UNIMED_DES
            }
            , new Object[] {
            T000W18_A253Tipo_Descripcion
            }
            , new Object[] {
            T000W19_A66Elem_Consecutivo
            }
            , new Object[] {
            T000W20_A66Elem_Consecutivo
            }
            , new Object[] {
            T000W21_A66Elem_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000W25_A298Cata_Descripcion, T000W25_A34Clas_Codigo
            }
            , new Object[] {
            T000W26_A291Clas_Descripcion, T000W26_A35FAM_Codigo
            }
            , new Object[] {
            T000W27_A447FAM_Descripcion, T000W27_A75SEG_Codigo
            }
            , new Object[] {
            T000W28_A442SEG_Descripcion, T000W28_A74TIP_Codigo
            }
            , new Object[] {
            T000W29_A435TIP_Descripcion
            }
            , new Object[] {
            T000W30_A496UNIMED_DES
            }
            , new Object[] {
            T000W31_A253Tipo_Descripcion
            }
            , new Object[] {
            T000W32_A95DEVOC_ID
            }
            , new Object[] {
            T000W33_A46Tran_Id, T000W33_A69TDet_Consecutivo
            }
            , new Object[] {
            T000W34_A66Elem_Consecutivo, T000W34_A67Invd_NumeroPlaca
            }
            , new Object[] {
            T000W35_A91Regional, T000W35_A92Centro_Id, T000W35_A27Alma_Modulo, T000W35_A28Alma_Codigo, T000W35_A31Bode_Codigo, T000W35_A93Trans_Id, T000W35_A66Elem_Consecutivo, T000W35_A94Num_Linea
            }
            , new Object[] {
            T000W36_A66Elem_Consecutivo
            }
         }
      );
      AV16Pgmname = "ALM_ELEMENTO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z632Vida_Util ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A632Vida_Util ;
   private short RcdFound33 ;
   private int Z77UNIMED_COD ;
   private int N77UNIMED_COD ;
   private int A77UNIMED_COD ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtElem_Consecutivo_Enabled ;
   private int edtElem_Descripcion_Enabled ;
   private int edtCata_Codigo_Enabled ;
   private int imgprompt_37_Visible ;
   private int edtCata_Descripcion_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int edtClas_Descripcion_Enabled ;
   private int edtFAM_Codigo_Enabled ;
   private int edtFAM_Descripcion_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtUNIMED_COD_Enabled ;
   private int imgprompt_77_Visible ;
   private int edtUNIMED_DES_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int imgprompt_33_Visible ;
   private int edtTipo_Descripcion_Enabled ;
   private int edtVida_Util_Enabled ;
   private int edtElem_UsuarioCreacion_Enabled ;
   private int edtElem_FechaCreacion_Enabled ;
   private int edtElem_UsuarioModifica_Enabled ;
   private int edtElem_FechaModifica_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV12Insert_UNIMED_COD ;
   private int AV17GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private long Z33Tipo_Codigo ;
   private long N33Tipo_Codigo ;
   private long A33Tipo_Codigo ;
   private long AV13Insert_Tipo_Codigo ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z558Elem_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A558Elem_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtElem_Consecutivo_Internalname ;
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
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_37_Internalname ;
   private String imgprompt_37_Link ;
   private String edtCata_Descripcion_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
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
   private String edtUNIMED_COD_Internalname ;
   private String edtUNIMED_COD_Jsonclick ;
   private String imgprompt_77_Internalname ;
   private String imgprompt_77_Link ;
   private String edtUNIMED_DES_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String imgprompt_33_Internalname ;
   private String imgprompt_33_Link ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtVida_Util_Internalname ;
   private String edtVida_Util_Jsonclick ;
   private String edtElem_UsuarioCreacion_Internalname ;
   private String edtElem_UsuarioCreacion_Jsonclick ;
   private String edtElem_FechaCreacion_Internalname ;
   private String edtElem_FechaCreacion_Jsonclick ;
   private String edtElem_UsuarioModifica_Internalname ;
   private String edtElem_UsuarioModifica_Jsonclick ;
   private String edtElem_FechaModifica_Internalname ;
   private String edtElem_FechaModifica_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV16Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode33 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z571Elem_FechaCreacion ;
   private java.util.Date Z573Elem_FechaModifica ;
   private java.util.Date A571Elem_FechaCreacion ;
   private java.util.Date A573Elem_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n632Vida_Util ;
   private boolean n570Elem_UsuarioCreacion ;
   private boolean n571Elem_FechaCreacion ;
   private boolean n572Elem_UsuarioModifica ;
   private boolean n573Elem_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV15Elem_Consecutivo ;
   private String Z66Elem_Consecutivo ;
   private String Z557Elem_Descripcion ;
   private String Z570Elem_UsuarioCreacion ;
   private String Z572Elem_UsuarioModifica ;
   private String Z37Cata_Codigo ;
   private String N37Cata_Codigo ;
   private String A37Cata_Codigo ;
   private String A34Clas_Codigo ;
   private String A35FAM_Codigo ;
   private String A75SEG_Codigo ;
   private String A74TIP_Codigo ;
   private String AV15Elem_Consecutivo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A298Cata_Descripcion ;
   private String A291Clas_Descripcion ;
   private String A447FAM_Descripcion ;
   private String A442SEG_Descripcion ;
   private String A435TIP_Descripcion ;
   private String A496UNIMED_DES ;
   private String A253Tipo_Descripcion ;
   private String A570Elem_UsuarioCreacion ;
   private String A572Elem_UsuarioModifica ;
   private String AV11Insert_Cata_Codigo ;
   private String Z298Cata_Descripcion ;
   private String Z34Clas_Codigo ;
   private String Z291Clas_Descripcion ;
   private String Z35FAM_Codigo ;
   private String Z447FAM_Descripcion ;
   private String Z75SEG_Codigo ;
   private String Z442SEG_Descripcion ;
   private String Z74TIP_Codigo ;
   private String Z435TIP_Descripcion ;
   private String Z496UNIMED_DES ;
   private String Z253Tipo_Descripcion ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbElem_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T000W6_A253Tipo_Descripcion ;
   private String[] T000W5_A496UNIMED_DES ;
   private String[] T000W4_A298Cata_Descripcion ;
   private String[] T000W4_A34Clas_Codigo ;
   private String[] T000W7_A291Clas_Descripcion ;
   private String[] T000W7_A35FAM_Codigo ;
   private String[] T000W8_A447FAM_Descripcion ;
   private String[] T000W8_A75SEG_Codigo ;
   private String[] T000W9_A442SEG_Descripcion ;
   private String[] T000W9_A74TIP_Codigo ;
   private String[] T000W10_A435TIP_Descripcion ;
   private String[] T000W11_A66Elem_Consecutivo ;
   private String[] T000W11_A557Elem_Descripcion ;
   private String[] T000W11_A298Cata_Descripcion ;
   private String[] T000W11_A291Clas_Descripcion ;
   private String[] T000W11_A447FAM_Descripcion ;
   private String[] T000W11_A442SEG_Descripcion ;
   private String[] T000W11_A435TIP_Descripcion ;
   private String[] T000W11_A496UNIMED_DES ;
   private String[] T000W11_A558Elem_Estado ;
   private String[] T000W11_A253Tipo_Descripcion ;
   private short[] T000W11_A632Vida_Util ;
   private boolean[] T000W11_n632Vida_Util ;
   private String[] T000W11_A570Elem_UsuarioCreacion ;
   private boolean[] T000W11_n570Elem_UsuarioCreacion ;
   private java.util.Date[] T000W11_A571Elem_FechaCreacion ;
   private boolean[] T000W11_n571Elem_FechaCreacion ;
   private String[] T000W11_A572Elem_UsuarioModifica ;
   private boolean[] T000W11_n572Elem_UsuarioModifica ;
   private java.util.Date[] T000W11_A573Elem_FechaModifica ;
   private boolean[] T000W11_n573Elem_FechaModifica ;
   private String[] T000W11_A37Cata_Codigo ;
   private int[] T000W11_A77UNIMED_COD ;
   private long[] T000W11_A33Tipo_Codigo ;
   private String[] T000W11_A34Clas_Codigo ;
   private String[] T000W11_A35FAM_Codigo ;
   private String[] T000W11_A75SEG_Codigo ;
   private String[] T000W11_A74TIP_Codigo ;
   private String[] T000W12_A298Cata_Descripcion ;
   private String[] T000W12_A34Clas_Codigo ;
   private String[] T000W13_A291Clas_Descripcion ;
   private String[] T000W13_A35FAM_Codigo ;
   private String[] T000W14_A447FAM_Descripcion ;
   private String[] T000W14_A75SEG_Codigo ;
   private String[] T000W15_A442SEG_Descripcion ;
   private String[] T000W15_A74TIP_Codigo ;
   private String[] T000W16_A435TIP_Descripcion ;
   private String[] T000W17_A496UNIMED_DES ;
   private String[] T000W18_A253Tipo_Descripcion ;
   private String[] T000W19_A66Elem_Consecutivo ;
   private String[] T000W3_A66Elem_Consecutivo ;
   private String[] T000W3_A557Elem_Descripcion ;
   private String[] T000W3_A558Elem_Estado ;
   private short[] T000W3_A632Vida_Util ;
   private boolean[] T000W3_n632Vida_Util ;
   private String[] T000W3_A570Elem_UsuarioCreacion ;
   private boolean[] T000W3_n570Elem_UsuarioCreacion ;
   private java.util.Date[] T000W3_A571Elem_FechaCreacion ;
   private boolean[] T000W3_n571Elem_FechaCreacion ;
   private String[] T000W3_A572Elem_UsuarioModifica ;
   private boolean[] T000W3_n572Elem_UsuarioModifica ;
   private java.util.Date[] T000W3_A573Elem_FechaModifica ;
   private boolean[] T000W3_n573Elem_FechaModifica ;
   private String[] T000W3_A37Cata_Codigo ;
   private int[] T000W3_A77UNIMED_COD ;
   private long[] T000W3_A33Tipo_Codigo ;
   private String[] T000W20_A66Elem_Consecutivo ;
   private String[] T000W21_A66Elem_Consecutivo ;
   private String[] T000W2_A66Elem_Consecutivo ;
   private String[] T000W2_A557Elem_Descripcion ;
   private String[] T000W2_A558Elem_Estado ;
   private short[] T000W2_A632Vida_Util ;
   private boolean[] T000W2_n632Vida_Util ;
   private String[] T000W2_A570Elem_UsuarioCreacion ;
   private boolean[] T000W2_n570Elem_UsuarioCreacion ;
   private java.util.Date[] T000W2_A571Elem_FechaCreacion ;
   private boolean[] T000W2_n571Elem_FechaCreacion ;
   private String[] T000W2_A572Elem_UsuarioModifica ;
   private boolean[] T000W2_n572Elem_UsuarioModifica ;
   private java.util.Date[] T000W2_A573Elem_FechaModifica ;
   private boolean[] T000W2_n573Elem_FechaModifica ;
   private String[] T000W2_A37Cata_Codigo ;
   private int[] T000W2_A77UNIMED_COD ;
   private long[] T000W2_A33Tipo_Codigo ;
   private String[] T000W25_A298Cata_Descripcion ;
   private String[] T000W25_A34Clas_Codigo ;
   private String[] T000W26_A291Clas_Descripcion ;
   private String[] T000W26_A35FAM_Codigo ;
   private String[] T000W27_A447FAM_Descripcion ;
   private String[] T000W27_A75SEG_Codigo ;
   private String[] T000W28_A442SEG_Descripcion ;
   private String[] T000W28_A74TIP_Codigo ;
   private String[] T000W29_A435TIP_Descripcion ;
   private String[] T000W30_A496UNIMED_DES ;
   private String[] T000W31_A253Tipo_Descripcion ;
   private long[] T000W32_A95DEVOC_ID ;
   private long[] T000W33_A46Tran_Id ;
   private long[] T000W33_A69TDet_Consecutivo ;
   private String[] T000W34_A66Elem_Consecutivo ;
   private String[] T000W34_A67Invd_NumeroPlaca ;
   private long[] T000W35_A91Regional ;
   private long[] T000W35_A92Centro_Id ;
   private String[] T000W35_A27Alma_Modulo ;
   private String[] T000W35_A28Alma_Codigo ;
   private String[] T000W35_A31Bode_Codigo ;
   private long[] T000W35_A93Trans_Id ;
   private String[] T000W35_A66Elem_Consecutivo ;
   private int[] T000W35_A94Num_Linea ;
   private String[] T000W36_A66Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class alm_elemento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000W2", "SELECT Elem_Consecutivo, Elem_Descripcion, Elem_Estado, Vida_Util, Elem_UsuarioCreacion, Elem_FechaCreacion, Elem_UsuarioModifica, Elem_FechaModifica, Cata_Codigo, UNIMED_COD, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ?  FOR UPDATE OF Elem_Descripcion, Elem_Estado, Vida_Util, Elem_UsuarioCreacion, Elem_FechaCreacion, Elem_UsuarioModifica, Elem_FechaModifica, Cata_Codigo, UNIMED_COD, Tipo_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W3", "SELECT Elem_Consecutivo, Elem_Descripcion, Elem_Estado, Vida_Util, Elem_UsuarioCreacion, Elem_FechaCreacion, Elem_UsuarioModifica, Elem_FechaModifica, Cata_Codigo, UNIMED_COD, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W4", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W5", "SELECT UNIMED_DES FROM ALM_UNIDAD_MEDIDA WHERE UNIMED_COD = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W6", "SELECT Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W7", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W8", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W9", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W10", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W11", "SELECT /*+ FIRST_ROWS(100) */ TM1.Elem_Consecutivo, TM1.Elem_Descripcion, T2.Cata_Descripcion, T3.Clas_Descripcion, T4.FAM_Descripcion, T5.SEG_Descripcion, T6.TIP_Descripcion, T7.UNIMED_DES, TM1.Elem_Estado, T8.Tipo_Descripcion, TM1.Vida_Util, TM1.Elem_UsuarioCreacion, TM1.Elem_FechaCreacion, TM1.Elem_UsuarioModifica, TM1.Elem_FechaModifica, TM1.Cata_Codigo, TM1.UNIMED_COD, TM1.Tipo_Codigo, T2.Clas_Codigo, T3.FAM_Codigo, T4.SEG_Codigo, T5.TIP_Codigo FROM (((((((ALM_ELEMENTO TM1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = TM1.Cata_Codigo) INNER JOIN ALM_CLASE T3 ON T3.Clas_Codigo = T2.Clas_Codigo) INNER JOIN ALM_CAT_FAM T4 ON T4.FAM_Codigo = T3.FAM_Codigo) INNER JOIN ALM_CAT_SEG T5 ON T5.SEG_Codigo = T4.SEG_Codigo) INNER JOIN ALM_CAT_TIP T6 ON T6.TIP_Codigo = T5.TIP_Codigo) INNER JOIN ALM_UNIDAD_MEDIDA T7 ON T7.UNIMED_COD = TM1.UNIMED_COD) INNER JOIN ALM_TIPO_ELEMENTO T8 ON T8.Tipo_Codigo = TM1.Tipo_Codigo) WHERE TM1.Elem_Consecutivo = ? ORDER BY TM1.Elem_Consecutivo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000W12", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W13", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W14", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W15", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W16", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W17", "SELECT UNIMED_DES FROM ALM_UNIDAD_MEDIDA WHERE UNIMED_COD = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W18", "SELECT Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W19", "SELECT /*+ FIRST_ROWS(1) */ Elem_Consecutivo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Elem_Consecutivo FROM ALM_ELEMENTO WHERE ( Elem_Consecutivo > ?) ORDER BY Elem_Consecutivo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Elem_Consecutivo FROM ALM_ELEMENTO WHERE ( Elem_Consecutivo < ?) ORDER BY Elem_Consecutivo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000W22", "INSERT INTO ALM_ELEMENTO(Elem_Consecutivo, Elem_Descripcion, Elem_Estado, Vida_Util, Elem_UsuarioCreacion, Elem_FechaCreacion, Elem_UsuarioModifica, Elem_FechaModifica, Cata_Codigo, UNIMED_COD, Tipo_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_ELEMENTO")
         ,new UpdateCursor("T000W23", "UPDATE ALM_ELEMENTO SET Elem_Descripcion=?, Elem_Estado=?, Vida_Util=?, Elem_UsuarioCreacion=?, Elem_FechaCreacion=?, Elem_UsuarioModifica=?, Elem_FechaModifica=?, Cata_Codigo=?, UNIMED_COD=?, Tipo_Codigo=?  WHERE Elem_Consecutivo = ?", GX_NOMASK, "ALM_ELEMENTO")
         ,new UpdateCursor("T000W24", "DELETE FROM ALM_ELEMENTO  WHERE Elem_Consecutivo = ?", GX_NOMASK, "ALM_ELEMENTO")
         ,new ForEachCursor("T000W25", "SELECT Cata_Descripcion, Clas_Codigo FROM ALM_CATALOGO WHERE Cata_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W26", "SELECT Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W27", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W28", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W29", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W30", "SELECT UNIMED_DES FROM ALM_UNIDAD_MEDIDA WHERE UNIMED_COD = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W31", "SELECT Tipo_Descripcion FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W32", "SELECT * FROM (SELECT DEVOC_ID FROM ALM_DEVO_HIST WHERE DEVOC_CONSECUTIVO = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W33", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Elem_Consecutivo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W34", "SELECT * FROM (SELECT Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W35", "SELECT * FROM (SELECT Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE Elem_Consecutivo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W36", "SELECT /*+ FIRST_ROWS(100) */ Elem_Consecutivo FROM ALM_ELEMENTO ORDER BY Elem_Consecutivo ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((long[]) buf[15])[0] = rslt.getLong(11) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((long[]) buf[15])[0] = rslt.getLong(11) ;
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
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(16) ;
               ((int[]) buf[21])[0] = rslt.getInt(17) ;
               ((long[]) buf[22])[0] = rslt.getLong(18) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(22) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 33 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 34 :
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
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 16 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 2000, false);
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[12], false);
               }
               stmt.setVarchar(9, (String)parms[13], 9, false);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(11, ((Number) parms[15]).longValue(), 0);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 2000, false);
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[11], false);
               }
               stmt.setVarchar(8, (String)parms[12], 9, false);
               stmt.setInt(9, ((Number) parms[13]).intValue());
               stmt.setBigDecimal(10, ((Number) parms[14]).longValue(), 0);
               stmt.setVarchar(11, (String)parms[15], 9, false);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 29 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
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
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
            case 33 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               return;
      }
   }

}

