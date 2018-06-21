/*
               File: gen_departamento_impl
        Description: Departamento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:52.67
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

public final  class gen_departamento_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A9Pais_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A9Pais_Codigo) ;
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
            AV7Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Dept_Codigo", GXutil.ltrim( GXutil.str( AV7Dept_Codigo, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vDEPT_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Dept_Codigo), "ZZZ9")));
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
         Form.getMeta().addItem("description", "Departamento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtDept_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public gen_departamento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gen_departamento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gen_departamento_impl.class ));
   }

   public gen_departamento_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Departamento", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_GEN_DEPARTAMENTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_GEN_DEPARTAMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDept_Codigo_Internalname, "Código Departamento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Codigo_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_GEN_DEPARTAMENTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDept_Descripcion_Internalname, A10Dept_Descripcion, GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDept_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtDept_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_DEPARTAMENTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Codigo_Internalname, A9Pais_Codigo, GXutil.rtrim( localUtil.format( A9Pais_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GEN_DEPARTAMENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_9_Internalname, sImgUrl, imgprompt_9_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_9_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GEN_DEPARTAMENTO.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPais_Descripcion_Internalname, A11Pais_Descripcion, GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPais_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPais_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_GEN_DEPARTAMENTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GEN_DEPARTAMENTO.htm");
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
      e110H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEPT_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDept_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6Dept_Codigo = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            }
            else
            {
               A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            }
            A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
            A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
            A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
            /* Read saved values. */
            Z6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "Z6Dept_Codigo"), ",", ".")) ;
            Z132Dept_UsuarioCrea = httpContext.cgiGet( "Z132Dept_UsuarioCrea") ;
            Z134Dept_UsuarioModifica = httpContext.cgiGet( "Z134Dept_UsuarioModifica") ;
            Z133Dept_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z133Dept_FechaCrea"), 0) ;
            Z135Dept_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z135Dept_FechaModifica"), 0) ;
            Z10Dept_Descripcion = httpContext.cgiGet( "Z10Dept_Descripcion") ;
            Z9Pais_Codigo = httpContext.cgiGet( "Z9Pais_Codigo") ;
            A132Dept_UsuarioCrea = httpContext.cgiGet( "Z132Dept_UsuarioCrea") ;
            A134Dept_UsuarioModifica = httpContext.cgiGet( "Z134Dept_UsuarioModifica") ;
            A133Dept_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z133Dept_FechaCrea"), 0) ;
            A135Dept_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z135Dept_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N9Pais_Codigo = httpContext.cgiGet( "N9Pais_Codigo") ;
            AV7Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( "vDEPT_CODIGO"), ",", ".")) ;
            AV8Insert_Pais_Codigo = httpContext.cgiGet( "vINSERT_PAIS_CODIGO") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A132Dept_UsuarioCrea = httpContext.cgiGet( "DEPT_USUARIOCREA") ;
            A134Dept_UsuarioModifica = httpContext.cgiGet( "DEPT_USUARIOMODIFICA") ;
            A133Dept_FechaCrea = localUtil.ctot( httpContext.cgiGet( "DEPT_FECHACREA"), 0) ;
            A135Dept_FechaModifica = localUtil.ctot( httpContext.cgiGet( "DEPT_FECHAMODIFICA"), 0) ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "GEN_DEPARTAMENTO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A6Dept_Codigo != Z6Dept_Codigo ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("gen_departamento:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A6Dept_Codigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
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
                  sMode20 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode20 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound20 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0H0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEPT_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDept_Codigo_Internalname ;
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
                        e110H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120H2 ();
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
         e120H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0H20( ) ;
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
         disableAttributes0H20( ) ;
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

   public void confirm_0H0( )
   {
      beforeValidate0H20( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0H20( ) ;
         }
         else
         {
            checkExtendedTable0H20( ) ;
            closeExtendedTableCursors0H20( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0H0( )
   {
   }

   public void e110H2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV8Insert_Pais_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Insert_Pais_Codigo", AV8Insert_Pais_Codigo);
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV15Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV16GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         while ( AV16GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV16GXV1));
            if ( GXutil.strcmp(AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Pais_Codigo") == 0 )
            {
               AV8Insert_Pais_Codigo = AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Insert_Pais_Codigo", AV8Insert_Pais_Codigo);
            }
            AV16GXV1 = (int)(AV16GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         }
      }
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e120H2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwgen_departamento") );
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

   public void zm0H20( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z132Dept_UsuarioCrea = T000H3_A132Dept_UsuarioCrea[0] ;
            Z134Dept_UsuarioModifica = T000H3_A134Dept_UsuarioModifica[0] ;
            Z133Dept_FechaCrea = T000H3_A133Dept_FechaCrea[0] ;
            Z135Dept_FechaModifica = T000H3_A135Dept_FechaModifica[0] ;
            Z10Dept_Descripcion = T000H3_A10Dept_Descripcion[0] ;
            Z9Pais_Codigo = T000H3_A9Pais_Codigo[0] ;
         }
         else
         {
            Z132Dept_UsuarioCrea = A132Dept_UsuarioCrea ;
            Z134Dept_UsuarioModifica = A134Dept_UsuarioModifica ;
            Z133Dept_FechaCrea = A133Dept_FechaCrea ;
            Z135Dept_FechaModifica = A135Dept_FechaModifica ;
            Z10Dept_Descripcion = A10Dept_Descripcion ;
            Z9Pais_Codigo = A9Pais_Codigo ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z6Dept_Codigo = A6Dept_Codigo ;
         Z132Dept_UsuarioCrea = A132Dept_UsuarioCrea ;
         Z134Dept_UsuarioModifica = A134Dept_UsuarioModifica ;
         Z133Dept_FechaCrea = A133Dept_FechaCrea ;
         Z135Dept_FechaModifica = A135Dept_FechaModifica ;
         Z10Dept_Descripcion = A10Dept_Descripcion ;
         Z9Pais_Codigo = A9Pais_Codigo ;
         Z11Pais_Descripcion = A11Pais_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_9_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00l0"+"',["+"{Ctrl:gx.dom.el('"+"PAIS_CODIGO"+"'), id:'"+"PAIS_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Dept_Codigo) )
      {
         A6Dept_Codigo = AV7Dept_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      }
      if ( ! (0==AV7Dept_Codigo) )
      {
         edtDept_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtDept_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV7Dept_Codigo) )
      {
         edtDept_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV8Insert_Pais_Codigo)==0) )
      {
         edtPais_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPais_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtPais_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPais_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Codigo_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV8Insert_Pais_Codigo)==0) )
      {
         A9Pais_Codigo = AV8Insert_Pais_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
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
         AV15Pgmname = "GEN_DEPARTAMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000H4 */
         pr_default.execute(2, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T000H4_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(2);
      }
   }

   public void load0H20( )
   {
      /* Using cursor T000H5 */
      pr_default.execute(3, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A132Dept_UsuarioCrea = T000H5_A132Dept_UsuarioCrea[0] ;
         A134Dept_UsuarioModifica = T000H5_A134Dept_UsuarioModifica[0] ;
         A133Dept_FechaCrea = T000H5_A133Dept_FechaCrea[0] ;
         A135Dept_FechaModifica = T000H5_A135Dept_FechaModifica[0] ;
         A10Dept_Descripcion = T000H5_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A11Pais_Descripcion = T000H5_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         A9Pais_Codigo = T000H5_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         zm0H20( -16) ;
      }
      pr_default.close(3);
      onLoadActions0H20( ) ;
   }

   public void onLoadActions0H20( )
   {
      AV15Pgmname = "GEN_DEPARTAMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void checkExtendedTable0H20( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV15Pgmname = "GEN_DEPARTAMENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      if ( ( A6Dept_Codigo == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el código del Departamento", 1, "DEPT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDept_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A10Dept_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del Departamento", 1, "DEPT_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDept_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000H4 */
      pr_default.execute(2, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "PAIS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPais_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11Pais_Descripcion = T000H4_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      pr_default.close(2);
      if ( ( GXutil.strcmp(A9Pais_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe seleccionar el País", 1, "PAIS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPais_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0H20( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A9Pais_Codigo )
   {
      /* Using cursor T000H6 */
      pr_default.execute(4, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "PAIS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPais_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11Pais_Descripcion = T000H6_A11Pais_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A11Pais_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey0H20( )
   {
      /* Using cursor T000H7 */
      pr_default.execute(5, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound20 = (short)(1) ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000H3 */
      pr_default.execute(1, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0H20( 16) ;
         RcdFound20 = (short)(1) ;
         A6Dept_Codigo = T000H3_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         A132Dept_UsuarioCrea = T000H3_A132Dept_UsuarioCrea[0] ;
         A134Dept_UsuarioModifica = T000H3_A134Dept_UsuarioModifica[0] ;
         A133Dept_FechaCrea = T000H3_A133Dept_FechaCrea[0] ;
         A135Dept_FechaModifica = T000H3_A135Dept_FechaModifica[0] ;
         A10Dept_Descripcion = T000H3_A10Dept_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
         A9Pais_Codigo = T000H3_A9Pais_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
         Z6Dept_Codigo = A6Dept_Codigo ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0H20( ) ;
         if ( AnyError == 1 )
         {
            RcdFound20 = (short)(0) ;
            initializeNonKey0H20( ) ;
         }
         Gx_mode = sMode20 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound20 = (short)(0) ;
         initializeNonKey0H20( ) ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode20 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0H20( ) ;
      if ( RcdFound20 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound20 = (short)(0) ;
      /* Using cursor T000H8 */
      pr_default.execute(6, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000H8_A6Dept_Codigo[0] < A6Dept_Codigo ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000H8_A6Dept_Codigo[0] > A6Dept_Codigo ) ) )
         {
            A6Dept_Codigo = T000H8_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            RcdFound20 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound20 = (short)(0) ;
      /* Using cursor T000H9 */
      pr_default.execute(7, new Object[] {new Short(A6Dept_Codigo)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000H9_A6Dept_Codigo[0] > A6Dept_Codigo ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000H9_A6Dept_Codigo[0] < A6Dept_Codigo ) ) )
         {
            A6Dept_Codigo = T000H9_A6Dept_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
            RcdFound20 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0H20( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtDept_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0H20( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound20 == 1 )
         {
            if ( A6Dept_Codigo != Z6Dept_Codigo )
            {
               A6Dept_Codigo = Z6Dept_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEPT_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDept_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDept_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0H20( ) ;
               GX_FocusControl = edtDept_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A6Dept_Codigo != Z6Dept_Codigo )
            {
               /* Insert record */
               GX_FocusControl = edtDept_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0H20( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEPT_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDept_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDept_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0H20( ) ;
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
      if ( A6Dept_Codigo != Z6Dept_Codigo )
      {
         A6Dept_Codigo = Z6Dept_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEPT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDept_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDept_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0H20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000H2 */
         pr_default.execute(0, new Object[] {new Short(A6Dept_Codigo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_DEPARTAMENTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z132Dept_UsuarioCrea, T000H2_A132Dept_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z134Dept_UsuarioModifica, T000H2_A134Dept_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z133Dept_FechaCrea, T000H2_A133Dept_FechaCrea[0]) ) || !( GXutil.dateCompare(Z135Dept_FechaModifica, T000H2_A135Dept_FechaModifica[0]) ) || ( GXutil.strcmp(Z10Dept_Descripcion, T000H2_A10Dept_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9Pais_Codigo, T000H2_A9Pais_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"GEN_DEPARTAMENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0H20( )
   {
      beforeValidate0H20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H20( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0H20( 0) ;
         checkOptimisticConcurrency0H20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H20( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0H20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000H10 */
                  pr_default.execute(8, new Object[] {new Short(A6Dept_Codigo), A132Dept_UsuarioCrea, A134Dept_UsuarioModifica, A133Dept_FechaCrea, A135Dept_FechaModifica, A10Dept_Descripcion, A9Pais_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_DEPARTAMENTO") ;
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
                        resetCaption0H0( ) ;
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
            load0H20( ) ;
         }
         endLevel0H20( ) ;
      }
      closeExtendedTableCursors0H20( ) ;
   }

   public void update0H20( )
   {
      beforeValidate0H20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H20( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H20( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0H20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000H11 */
                  pr_default.execute(9, new Object[] {A132Dept_UsuarioCrea, A134Dept_UsuarioModifica, A133Dept_FechaCrea, A135Dept_FechaModifica, A10Dept_Descripcion, A9Pais_Codigo, new Short(A6Dept_Codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_DEPARTAMENTO") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"GEN_DEPARTAMENTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0H20( ) ;
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
         endLevel0H20( ) ;
      }
      closeExtendedTableCursors0H20( ) ;
   }

   public void deferredUpdate0H20( )
   {
   }

   public void delete( )
   {
      beforeValidate0H20( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H20( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0H20( ) ;
         afterConfirm0H20( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0H20( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000H12 */
               pr_default.execute(10, new Object[] {new Short(A6Dept_Codigo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_DEPARTAMENTO") ;
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
      sMode20 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0H20( ) ;
      Gx_mode = sMode20 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0H20( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "GEN_DEPARTAMENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000H13 */
         pr_default.execute(11, new Object[] {A9Pais_Codigo});
         A11Pais_Descripcion = T000H13_A11Pais_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000H14 */
         pr_default.execute(12, new Object[] {new Short(A6Dept_Codigo)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CIUDAD"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel0H20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0H20( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "gen_departamento");
         if ( AnyError == 0 )
         {
            confirmValues0H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "gen_departamento");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0H20( )
   {
      /* Scan By routine */
      /* Using cursor T000H15 */
      pr_default.execute(13);
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A6Dept_Codigo = T000H15_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0H20( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A6Dept_Codigo = T000H15_A6Dept_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      }
   }

   public void scanEnd0H20( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0H20( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A133Dept_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A133Dept_FechaCrea", localUtil.ttoc( A133Dept_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A135Dept_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135Dept_FechaModifica", localUtil.ttoc( A135Dept_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A132Dept_UsuarioCrea = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A132Dept_UsuarioCrea", A132Dept_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A134Dept_UsuarioModifica = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A134Dept_UsuarioModifica", A134Dept_UsuarioModifica);
      }
   }

   public void beforeInsert0H20( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0H20( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0H20( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0H20( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0H20( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0H20( )
   {
      edtDept_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Codigo_Enabled, 5, 0)), true);
      edtDept_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDept_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDept_Descripcion_Enabled, 5, 0)), true);
      edtPais_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Codigo_Enabled, 5, 0)), true);
      edtPais_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPais_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPais_Descripcion_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0H0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414155359");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gen_departamento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Dept_Codigo,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z6Dept_Codigo", GXutil.ltrim( localUtil.ntoc( Z6Dept_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z132Dept_UsuarioCrea", Z132Dept_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z134Dept_UsuarioModifica", Z134Dept_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z133Dept_FechaCrea", localUtil.ttoc( Z133Dept_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z135Dept_FechaModifica", localUtil.ttoc( Z135Dept_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z10Dept_Descripcion", Z10Dept_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z9Pais_Codigo", Z9Pais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N9Pais_Codigo", A9Pais_Codigo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDEPT_CODIGO", GXutil.ltrim( localUtil.ntoc( AV7Dept_Codigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PAIS_CODIGO", AV8Insert_Pais_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_USUARIOCREA", A132Dept_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_USUARIOMODIFICA", A134Dept_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_FECHACREA", localUtil.ttoc( A133Dept_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEPT_FECHAMODIFICA", localUtil.ttoc( A135Dept_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEPT_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Dept_Codigo), "ZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "GEN_DEPARTAMENTO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("gen_departamento:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.gen_departamento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Dept_Codigo,4,0))) ;
   }

   public String getPgmname( )
   {
      return "GEN_DEPARTAMENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Departamento" ;
   }

   public void initializeNonKey0H20( )
   {
      A9Pais_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9Pais_Codigo", A9Pais_Codigo);
      A132Dept_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A132Dept_UsuarioCrea", A132Dept_UsuarioCrea);
      A134Dept_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A134Dept_UsuarioModifica", A134Dept_UsuarioModifica);
      A133Dept_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A133Dept_FechaCrea", localUtil.ttoc( A133Dept_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A135Dept_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A135Dept_FechaModifica", localUtil.ttoc( A135Dept_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A10Dept_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10Dept_Descripcion", A10Dept_Descripcion);
      A11Pais_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Pais_Descripcion", A11Pais_Descripcion);
      Z132Dept_UsuarioCrea = "" ;
      Z134Dept_UsuarioModifica = "" ;
      Z133Dept_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z135Dept_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z10Dept_Descripcion = "" ;
      Z9Pais_Codigo = "" ;
   }

   public void initAll0H20( )
   {
      A6Dept_Codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6Dept_Codigo", GXutil.ltrim( GXutil.str( A6Dept_Codigo, 4, 0)));
      initializeNonKey0H20( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414155367");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gen_departamento.js", "?201861414155367");
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
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_9_Internalname = "PROMPT_9" ;
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
      Form.setCaption( "Departamento" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Descripcion_Enabled = 0 ;
      imgprompt_9_Visible = 1 ;
      imgprompt_9_Link = "" ;
      edtPais_Codigo_Jsonclick = "" ;
      edtPais_Codigo_Enabled = 1 ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Descripcion_Enabled = 1 ;
      edtDept_Codigo_Jsonclick = "" ;
      edtDept_Codigo_Enabled = 1 ;
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

   public void valid_Pais_codigo( String GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A9Pais_Codigo = GX_Parm1 ;
      A11Pais_Descripcion = GX_Parm2 ;
      /* Using cursor T000H13 */
      pr_default.execute(11, new Object[] {A9Pais_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PAIS'.", "ForeignKeyNotFound", 1, "PAIS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPais_Codigo_Internalname ;
      }
      A11Pais_Descripcion = T000H13_A11Pais_Descripcion[0] ;
      pr_default.close(11);
      if ( ( GXutil.strcmp(A9Pais_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe seleccionar el País", 1, "PAIS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPais_Codigo_Internalname ;
      }
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

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Dept_Codigo',fld:'vDEPT_CODIGO',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120H2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z132Dept_UsuarioCrea = "" ;
      Z134Dept_UsuarioModifica = "" ;
      Z133Dept_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z135Dept_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z10Dept_Descripcion = "" ;
      Z9Pais_Codigo = "" ;
      N9Pais_Codigo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A9Pais_Codigo = "" ;
      Gx_mode = "" ;
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
      A10Dept_Descripcion = "" ;
      sImgUrl = "" ;
      A11Pais_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A132Dept_UsuarioCrea = "" ;
      A134Dept_UsuarioModifica = "" ;
      A133Dept_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A135Dept_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV8Insert_Pais_Codigo = "" ;
      AV12Usuario = "" ;
      AV15Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode20 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z11Pais_Descripcion = "" ;
      T000H4_A11Pais_Descripcion = new String[] {""} ;
      T000H5_A6Dept_Codigo = new short[1] ;
      T000H5_A132Dept_UsuarioCrea = new String[] {""} ;
      T000H5_A134Dept_UsuarioModifica = new String[] {""} ;
      T000H5_A133Dept_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000H5_A135Dept_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000H5_A10Dept_Descripcion = new String[] {""} ;
      T000H5_A11Pais_Descripcion = new String[] {""} ;
      T000H5_A9Pais_Codigo = new String[] {""} ;
      T000H6_A11Pais_Descripcion = new String[] {""} ;
      T000H7_A6Dept_Codigo = new short[1] ;
      T000H3_A6Dept_Codigo = new short[1] ;
      T000H3_A132Dept_UsuarioCrea = new String[] {""} ;
      T000H3_A134Dept_UsuarioModifica = new String[] {""} ;
      T000H3_A133Dept_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000H3_A135Dept_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000H3_A10Dept_Descripcion = new String[] {""} ;
      T000H3_A9Pais_Codigo = new String[] {""} ;
      T000H8_A6Dept_Codigo = new short[1] ;
      T000H9_A6Dept_Codigo = new short[1] ;
      T000H2_A6Dept_Codigo = new short[1] ;
      T000H2_A132Dept_UsuarioCrea = new String[] {""} ;
      T000H2_A134Dept_UsuarioModifica = new String[] {""} ;
      T000H2_A133Dept_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000H2_A135Dept_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000H2_A10Dept_Descripcion = new String[] {""} ;
      T000H2_A9Pais_Codigo = new String[] {""} ;
      T000H13_A11Pais_Descripcion = new String[] {""} ;
      T000H14_A5Ciud_Codigo = new short[1] ;
      T000H15_A6Dept_Codigo = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gen_departamento__default(),
         new Object[] {
             new Object[] {
            T000H2_A6Dept_Codigo, T000H2_A132Dept_UsuarioCrea, T000H2_A134Dept_UsuarioModifica, T000H2_A133Dept_FechaCrea, T000H2_A135Dept_FechaModifica, T000H2_A10Dept_Descripcion, T000H2_A9Pais_Codigo
            }
            , new Object[] {
            T000H3_A6Dept_Codigo, T000H3_A132Dept_UsuarioCrea, T000H3_A134Dept_UsuarioModifica, T000H3_A133Dept_FechaCrea, T000H3_A135Dept_FechaModifica, T000H3_A10Dept_Descripcion, T000H3_A9Pais_Codigo
            }
            , new Object[] {
            T000H4_A11Pais_Descripcion
            }
            , new Object[] {
            T000H5_A6Dept_Codigo, T000H5_A132Dept_UsuarioCrea, T000H5_A134Dept_UsuarioModifica, T000H5_A133Dept_FechaCrea, T000H5_A135Dept_FechaModifica, T000H5_A10Dept_Descripcion, T000H5_A11Pais_Descripcion, T000H5_A9Pais_Codigo
            }
            , new Object[] {
            T000H6_A11Pais_Descripcion
            }
            , new Object[] {
            T000H7_A6Dept_Codigo
            }
            , new Object[] {
            T000H8_A6Dept_Codigo
            }
            , new Object[] {
            T000H9_A6Dept_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000H13_A11Pais_Descripcion
            }
            , new Object[] {
            T000H14_A5Ciud_Codigo
            }
            , new Object[] {
            T000H15_A6Dept_Codigo
            }
         }
      );
      AV15Pgmname = "GEN_DEPARTAMENTO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short wcpOAV7Dept_Codigo ;
   private short Z6Dept_Codigo ;
   private short AV7Dept_Codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6Dept_Codigo ;
   private short RcdFound20 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDept_Codigo_Enabled ;
   private int edtDept_Descripcion_Enabled ;
   private int edtPais_Codigo_Enabled ;
   private int imgprompt_9_Visible ;
   private int edtPais_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV16GXV1 ;
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
   private String edtDept_Codigo_Internalname ;
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
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Internalname ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_9_Internalname ;
   private String imgprompt_9_Link ;
   private String edtPais_Descripcion_Internalname ;
   private String edtPais_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV15Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode20 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z133Dept_FechaCrea ;
   private java.util.Date Z135Dept_FechaModifica ;
   private java.util.Date A133Dept_FechaCrea ;
   private java.util.Date A135Dept_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z132Dept_UsuarioCrea ;
   private String Z134Dept_UsuarioModifica ;
   private String Z10Dept_Descripcion ;
   private String Z9Pais_Codigo ;
   private String N9Pais_Codigo ;
   private String A9Pais_Codigo ;
   private String A10Dept_Descripcion ;
   private String A11Pais_Descripcion ;
   private String A132Dept_UsuarioCrea ;
   private String A134Dept_UsuarioModifica ;
   private String AV8Insert_Pais_Codigo ;
   private String AV12Usuario ;
   private String Z11Pais_Descripcion ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000H4_A11Pais_Descripcion ;
   private short[] T000H5_A6Dept_Codigo ;
   private String[] T000H5_A132Dept_UsuarioCrea ;
   private String[] T000H5_A134Dept_UsuarioModifica ;
   private java.util.Date[] T000H5_A133Dept_FechaCrea ;
   private java.util.Date[] T000H5_A135Dept_FechaModifica ;
   private String[] T000H5_A10Dept_Descripcion ;
   private String[] T000H5_A11Pais_Descripcion ;
   private String[] T000H5_A9Pais_Codigo ;
   private String[] T000H6_A11Pais_Descripcion ;
   private short[] T000H7_A6Dept_Codigo ;
   private short[] T000H3_A6Dept_Codigo ;
   private String[] T000H3_A132Dept_UsuarioCrea ;
   private String[] T000H3_A134Dept_UsuarioModifica ;
   private java.util.Date[] T000H3_A133Dept_FechaCrea ;
   private java.util.Date[] T000H3_A135Dept_FechaModifica ;
   private String[] T000H3_A10Dept_Descripcion ;
   private String[] T000H3_A9Pais_Codigo ;
   private short[] T000H8_A6Dept_Codigo ;
   private short[] T000H9_A6Dept_Codigo ;
   private short[] T000H2_A6Dept_Codigo ;
   private String[] T000H2_A132Dept_UsuarioCrea ;
   private String[] T000H2_A134Dept_UsuarioModifica ;
   private java.util.Date[] T000H2_A133Dept_FechaCrea ;
   private java.util.Date[] T000H2_A135Dept_FechaModifica ;
   private String[] T000H2_A10Dept_Descripcion ;
   private String[] T000H2_A9Pais_Codigo ;
   private String[] T000H13_A11Pais_Descripcion ;
   private short[] T000H14_A5Ciud_Codigo ;
   private short[] T000H15_A6Dept_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class gen_departamento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000H2", "SELECT Dept_Codigo, Dept_UsuarioCrea, Dept_UsuarioModifica, Dept_FechaCrea, Dept_FechaModifica, Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ?  FOR UPDATE OF Dept_UsuarioCrea, Dept_UsuarioModifica, Dept_FechaCrea, Dept_FechaModifica, Dept_Descripcion, Pais_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H3", "SELECT Dept_Codigo, Dept_UsuarioCrea, Dept_UsuarioModifica, Dept_FechaCrea, Dept_FechaModifica, Dept_Descripcion, Pais_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H4", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Dept_Codigo, TM1.Dept_UsuarioCrea, TM1.Dept_UsuarioModifica, TM1.Dept_FechaCrea, TM1.Dept_FechaModifica, TM1.Dept_Descripcion, T2.Pais_Descripcion, TM1.Pais_Codigo FROM (GEN_DEPARTAMENTO TM1 INNER JOIN GEN_PAIS T2 ON T2.Pais_Codigo = TM1.Pais_Codigo) WHERE TM1.Dept_Codigo = ? ORDER BY TM1.Dept_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000H6", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H7", "SELECT /*+ FIRST_ROWS(1) */ Dept_Codigo FROM GEN_DEPARTAMENTO WHERE Dept_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dept_Codigo FROM GEN_DEPARTAMENTO WHERE ( Dept_Codigo > ?) ORDER BY Dept_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000H9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dept_Codigo FROM GEN_DEPARTAMENTO WHERE ( Dept_Codigo < ?) ORDER BY Dept_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000H10", "INSERT INTO GEN_DEPARTAMENTO(Dept_Codigo, Dept_UsuarioCrea, Dept_UsuarioModifica, Dept_FechaCrea, Dept_FechaModifica, Dept_Descripcion, Pais_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "GEN_DEPARTAMENTO")
         ,new UpdateCursor("T000H11", "UPDATE GEN_DEPARTAMENTO SET Dept_UsuarioCrea=?, Dept_UsuarioModifica=?, Dept_FechaCrea=?, Dept_FechaModifica=?, Dept_Descripcion=?, Pais_Codigo=?  WHERE Dept_Codigo = ?", GX_NOMASK, "GEN_DEPARTAMENTO")
         ,new UpdateCursor("T000H12", "DELETE FROM GEN_DEPARTAMENTO  WHERE Dept_Codigo = ?", GX_NOMASK, "GEN_DEPARTAMENTO")
         ,new ForEachCursor("T000H13", "SELECT Pais_Descripcion FROM GEN_PAIS WHERE Pais_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H14", "SELECT * FROM (SELECT Ciud_Codigo FROM GEN_CIUDAD WHERE Dept_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000H15", "SELECT /*+ FIRST_ROWS(100) */ Dept_Codigo FROM GEN_DEPARTAMENTO ORDER BY Dept_Codigo ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 13 :
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 3, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

