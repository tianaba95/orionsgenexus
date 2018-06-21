/*
               File: seg_parametros_impl
        Description: Parámetros
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:9.66
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

public final  class seg_parametros_impl extends GXDataArea
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
            AV7Para_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Para_Id", GXutil.ltrim( GXutil.str( AV7Para_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPARA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Para_Id), "ZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Parámetros", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtPara_Nombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_parametros_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_parametros_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_parametros_impl.class ));
   }

   public seg_parametros_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Parámetros", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPara_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPara_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A20Para_Id, (byte)(11), (byte)(0), ",", "")), ((edtPara_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20Para_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A20Para_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPara_Id_Jsonclick, 0, "Attribute", "", "", "", edtPara_Id_Visible, edtPara_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPara_Nombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPara_Nombre_Internalname, A208Para_Nombre, GXutil.rtrim( localUtil.format( A208Para_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPara_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtPara_Nombre_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPara_Valor_Internalname, "Valor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPara_Valor_Internalname, A209Para_Valor, GXutil.rtrim( localUtil.format( A209Para_Valor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPara_Valor_Jsonclick, 0, "Attribute", "", "", "", 1, edtPara_Valor_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPara_Ambiente_Internalname, "Ambiente", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPara_Ambiente_Internalname, A210Para_Ambiente, GXutil.rtrim( localUtil.format( A210Para_Ambiente, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPara_Ambiente_Jsonclick, 0, "Attribute", "", "", "", 1, edtPara_Ambiente_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PARAMETROS.htm");
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
      e110Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A20Para_Id = localUtil.ctol( httpContext.cgiGet( edtPara_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
            A208Para_Nombre = GXutil.upper( httpContext.cgiGet( edtPara_Nombre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A208Para_Nombre", A208Para_Nombre);
            A209Para_Valor = httpContext.cgiGet( edtPara_Valor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A209Para_Valor", A209Para_Valor);
            A210Para_Ambiente = httpContext.cgiGet( edtPara_Ambiente_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A210Para_Ambiente", A210Para_Ambiente);
            /* Read saved values. */
            Z20Para_Id = localUtil.ctol( httpContext.cgiGet( "Z20Para_Id"), ",", ".") ;
            Z204Para_UsuarioCreacion = httpContext.cgiGet( "Z204Para_UsuarioCreacion") ;
            Z206Para_UsuarioModificacion = httpContext.cgiGet( "Z206Para_UsuarioModificacion") ;
            Z205Para_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z205Para_FechaCreacion"), 0) ;
            Z207Para_FechaModificacion = localUtil.ctot( httpContext.cgiGet( "Z207Para_FechaModificacion"), 0) ;
            Z208Para_Nombre = httpContext.cgiGet( "Z208Para_Nombre") ;
            Z209Para_Valor = httpContext.cgiGet( "Z209Para_Valor") ;
            Z210Para_Ambiente = httpContext.cgiGet( "Z210Para_Ambiente") ;
            A204Para_UsuarioCreacion = httpContext.cgiGet( "Z204Para_UsuarioCreacion") ;
            A206Para_UsuarioModificacion = httpContext.cgiGet( "Z206Para_UsuarioModificacion") ;
            A205Para_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z205Para_FechaCreacion"), 0) ;
            A207Para_FechaModificacion = localUtil.ctot( httpContext.cgiGet( "Z207Para_FechaModificacion"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7Para_Id = localUtil.ctol( httpContext.cgiGet( "vPARA_ID"), ",", ".") ;
            AV8Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A204Para_UsuarioCreacion = httpContext.cgiGet( "PARA_USUARIOCREACION") ;
            A206Para_UsuarioModificacion = httpContext.cgiGet( "PARA_USUARIOMODIFICACION") ;
            A205Para_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "PARA_FECHACREACION"), 0) ;
            A207Para_FechaModificacion = localUtil.ctot( httpContext.cgiGet( "PARA_FECHAMODIFICACION"), 0) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_PARAMETROS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A20Para_Id != Z20Para_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_parametros:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A20Para_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
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
                  sMode28 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode28 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound28 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0Q0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PARA_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPara_Id_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e110Q2 ();
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
         e120Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Q28( ) ;
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
         disableAttributes0Q28( ) ;
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

   public void confirm_0Q0( )
   {
      beforeValidate0Q28( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Q28( ) ;
         }
         else
         {
            checkExtendedTable0Q28( ) ;
            closeExtendedTableCursors0Q28( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0Q0( )
   {
   }

   public void e120Q2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_parametros") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e110Q2( )
   {
      /* Start Routine */
      AV8Usuario = AV9WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usuario", AV8Usuario);
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV9WebSession.getValue("TrnContext"), null, null);
      edtPara_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtPara_Id_Visible, 5, 0)), true);
   }

   public void zm0Q28( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z204Para_UsuarioCreacion = T000Q3_A204Para_UsuarioCreacion[0] ;
            Z206Para_UsuarioModificacion = T000Q3_A206Para_UsuarioModificacion[0] ;
            Z205Para_FechaCreacion = T000Q3_A205Para_FechaCreacion[0] ;
            Z207Para_FechaModificacion = T000Q3_A207Para_FechaModificacion[0] ;
            Z208Para_Nombre = T000Q3_A208Para_Nombre[0] ;
            Z209Para_Valor = T000Q3_A209Para_Valor[0] ;
            Z210Para_Ambiente = T000Q3_A210Para_Ambiente[0] ;
         }
         else
         {
            Z204Para_UsuarioCreacion = A204Para_UsuarioCreacion ;
            Z206Para_UsuarioModificacion = A206Para_UsuarioModificacion ;
            Z205Para_FechaCreacion = A205Para_FechaCreacion ;
            Z207Para_FechaModificacion = A207Para_FechaModificacion ;
            Z208Para_Nombre = A208Para_Nombre ;
            Z209Para_Valor = A209Para_Valor ;
            Z210Para_Ambiente = A210Para_Ambiente ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z20Para_Id = A20Para_Id ;
         Z204Para_UsuarioCreacion = A204Para_UsuarioCreacion ;
         Z206Para_UsuarioModificacion = A206Para_UsuarioModificacion ;
         Z205Para_FechaCreacion = A205Para_FechaCreacion ;
         Z207Para_FechaModificacion = A207Para_FechaModificacion ;
         Z208Para_Nombre = A208Para_Nombre ;
         Z209Para_Valor = A209Para_Valor ;
         Z210Para_Ambiente = A210Para_Ambiente ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPara_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Id_Enabled, 5, 0)), true);
      edtPara_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Para_Id) )
      {
         A20Para_Id = AV7Para_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
      }
      else
      {
         A20Para_Id = AV7Para_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
      }
   }

   public void standaloneModal( )
   {
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
   }

   public void load0Q28( )
   {
      /* Using cursor T000Q4 */
      pr_default.execute(2, new Object[] {new Long(A20Para_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A204Para_UsuarioCreacion = T000Q4_A204Para_UsuarioCreacion[0] ;
         A206Para_UsuarioModificacion = T000Q4_A206Para_UsuarioModificacion[0] ;
         A205Para_FechaCreacion = T000Q4_A205Para_FechaCreacion[0] ;
         A207Para_FechaModificacion = T000Q4_A207Para_FechaModificacion[0] ;
         A208Para_Nombre = T000Q4_A208Para_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208Para_Nombre", A208Para_Nombre);
         A209Para_Valor = T000Q4_A209Para_Valor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209Para_Valor", A209Para_Valor);
         A210Para_Ambiente = T000Q4_A210Para_Ambiente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210Para_Ambiente", A210Para_Ambiente);
         zm0Q28( -7) ;
      }
      pr_default.close(2);
      onLoadActions0Q28( ) ;
   }

   public void onLoadActions0Q28( )
   {
      AV13Pgmname = "SEG_PARAMETROS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0Q28( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "SEG_PARAMETROS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0Q28( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Q28( )
   {
      /* Using cursor T000Q5 */
      pr_default.execute(3, new Object[] {new Long(A20Para_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound28 = (short)(1) ;
      }
      else
      {
         RcdFound28 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Q3 */
      pr_default.execute(1, new Object[] {new Long(A20Para_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Q28( 7) ;
         RcdFound28 = (short)(1) ;
         A20Para_Id = T000Q3_A20Para_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
         A204Para_UsuarioCreacion = T000Q3_A204Para_UsuarioCreacion[0] ;
         A206Para_UsuarioModificacion = T000Q3_A206Para_UsuarioModificacion[0] ;
         A205Para_FechaCreacion = T000Q3_A205Para_FechaCreacion[0] ;
         A207Para_FechaModificacion = T000Q3_A207Para_FechaModificacion[0] ;
         A208Para_Nombre = T000Q3_A208Para_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208Para_Nombre", A208Para_Nombre);
         A209Para_Valor = T000Q3_A209Para_Valor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209Para_Valor", A209Para_Valor);
         A210Para_Ambiente = T000Q3_A210Para_Ambiente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210Para_Ambiente", A210Para_Ambiente);
         Z20Para_Id = A20Para_Id ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0Q28( ) ;
         if ( AnyError == 1 )
         {
            RcdFound28 = (short)(0) ;
            initializeNonKey0Q28( ) ;
         }
         Gx_mode = sMode28 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound28 = (short)(0) ;
         initializeNonKey0Q28( ) ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode28 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Q28( ) ;
      if ( RcdFound28 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound28 = (short)(0) ;
      /* Using cursor T000Q6 */
      pr_default.execute(4, new Object[] {new Long(A20Para_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A20Para_Id[0] < A20Para_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A20Para_Id[0] > A20Para_Id ) ) )
         {
            A20Para_Id = T000Q6_A20Para_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
            RcdFound28 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound28 = (short)(0) ;
      /* Using cursor T000Q7 */
      pr_default.execute(5, new Object[] {new Long(A20Para_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A20Para_Id[0] > A20Para_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A20Para_Id[0] < A20Para_Id ) ) )
         {
            A20Para_Id = T000Q7_A20Para_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
            RcdFound28 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Q28( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtPara_Nombre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0Q28( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound28 == 1 )
         {
            if ( A20Para_Id != Z20Para_Id )
            {
               A20Para_Id = Z20Para_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PARA_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPara_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPara_Nombre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0Q28( ) ;
               GX_FocusControl = edtPara_Nombre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A20Para_Id != Z20Para_Id )
            {
               /* Insert record */
               GX_FocusControl = edtPara_Nombre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Q28( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARA_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPara_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPara_Nombre_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0Q28( ) ;
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
      if ( A20Para_Id != Z20Para_Id )
      {
         A20Para_Id = Z20Para_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PARA_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPara_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPara_Nombre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0Q28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Q2 */
         pr_default.execute(0, new Object[] {new Long(A20Para_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_PARAMETROS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z204Para_UsuarioCreacion, T000Q2_A204Para_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z206Para_UsuarioModificacion, T000Q2_A206Para_UsuarioModificacion[0]) != 0 ) || !( GXutil.dateCompare(Z205Para_FechaCreacion, T000Q2_A205Para_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z207Para_FechaModificacion, T000Q2_A207Para_FechaModificacion[0]) ) || ( GXutil.strcmp(Z208Para_Nombre, T000Q2_A208Para_Nombre[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z209Para_Valor, T000Q2_A209Para_Valor[0]) != 0 ) || ( GXutil.strcmp(Z210Para_Ambiente, T000Q2_A210Para_Ambiente[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_PARAMETROS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q28( )
   {
      beforeValidate0Q28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q28( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q28( 0) ;
         checkOptimisticConcurrency0Q28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q28( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q8 */
                  pr_default.execute(6, new Object[] {A204Para_UsuarioCreacion, A206Para_UsuarioModificacion, A205Para_FechaCreacion, A207Para_FechaModificacion, A208Para_Nombre, A209Para_Valor, A210Para_Ambiente});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000Q9 */
                  pr_default.execute(7);
                  A20Para_Id = T000Q9_A20Para_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PARAMETROS") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0Q0( ) ;
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
            load0Q28( ) ;
         }
         endLevel0Q28( ) ;
      }
      closeExtendedTableCursors0Q28( ) ;
   }

   public void update0Q28( )
   {
      beforeValidate0Q28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q28( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q28( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q10 */
                  pr_default.execute(8, new Object[] {A204Para_UsuarioCreacion, A206Para_UsuarioModificacion, A205Para_FechaCreacion, A207Para_FechaModificacion, A208Para_Nombre, A209Para_Valor, A210Para_Ambiente, new Long(A20Para_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PARAMETROS") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_PARAMETROS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q28( ) ;
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
         endLevel0Q28( ) ;
      }
      closeExtendedTableCursors0Q28( ) ;
   }

   public void deferredUpdate0Q28( )
   {
   }

   public void delete( )
   {
      beforeValidate0Q28( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q28( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q28( ) ;
         afterConfirm0Q28( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q28( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Q11 */
               pr_default.execute(9, new Object[] {new Long(A20Para_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PARAMETROS") ;
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
      sMode28 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0Q28( ) ;
      Gx_mode = sMode28 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0Q28( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "SEG_PARAMETROS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
   }

   public void endLevel0Q28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Q28( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_parametros");
         if ( AnyError == 0 )
         {
            confirmValues0Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_parametros");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Q28( )
   {
      /* Scan By routine */
      /* Using cursor T000Q12 */
      pr_default.execute(10);
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A20Para_Id = T000Q12_A20Para_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Q28( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A20Para_Id = T000Q12_A20Para_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
      }
   }

   public void scanEnd0Q28( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0Q28( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A205Para_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A205Para_FechaCreacion", localUtil.ttoc( A205Para_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A207Para_FechaModificacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A207Para_FechaModificacion", localUtil.ttoc( A207Para_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A204Para_UsuarioCreacion = AV8Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A204Para_UsuarioCreacion", A204Para_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A206Para_UsuarioModificacion = AV8Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A206Para_UsuarioModificacion", A206Para_UsuarioModificacion);
      }
   }

   public void beforeInsert0Q28( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Q28( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Q28( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q28( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q28( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q28( )
   {
      edtPara_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Id_Enabled, 5, 0)), true);
      edtPara_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Nombre_Enabled, 5, 0)), true);
      edtPara_Valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Valor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Valor_Enabled, 5, 0)), true);
      edtPara_Ambiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPara_Ambiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPara_Ambiente_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Q0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161044");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_parametros") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Para_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z20Para_Id", GXutil.ltrim( localUtil.ntoc( Z20Para_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z204Para_UsuarioCreacion", Z204Para_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z206Para_UsuarioModificacion", Z206Para_UsuarioModificacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z205Para_FechaCreacion", localUtil.ttoc( Z205Para_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z207Para_FechaModificacion", localUtil.ttoc( Z207Para_FechaModificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z208Para_Nombre", Z208Para_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z209Para_Valor", Z209Para_Valor);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z210Para_Ambiente", Z210Para_Ambiente);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPARA_ID", GXutil.ltrim( localUtil.ntoc( AV7Para_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV8Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PARA_USUARIOCREACION", A204Para_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PARA_USUARIOMODIFICACION", A206Para_UsuarioModificacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PARA_FECHACREACION", localUtil.ttoc( A205Para_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PARA_FECHAMODIFICACION", localUtil.ttoc( A207Para_FechaModificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Para_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_PARAMETROS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_parametros:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_parametros") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Para_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_PARAMETROS" ;
   }

   public String getPgmdesc( )
   {
      return "Parámetros" ;
   }

   public void initializeNonKey0Q28( )
   {
      A204Para_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A204Para_UsuarioCreacion", A204Para_UsuarioCreacion);
      A206Para_UsuarioModificacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A206Para_UsuarioModificacion", A206Para_UsuarioModificacion);
      A205Para_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A205Para_FechaCreacion", localUtil.ttoc( A205Para_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A207Para_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A207Para_FechaModificacion", localUtil.ttoc( A207Para_FechaModificacion, 8, 5, 0, 3, "/", ":", " "));
      A208Para_Nombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A208Para_Nombre", A208Para_Nombre);
      A209Para_Valor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A209Para_Valor", A209Para_Valor);
      A210Para_Ambiente = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A210Para_Ambiente", A210Para_Ambiente);
      Z204Para_UsuarioCreacion = "" ;
      Z206Para_UsuarioModificacion = "" ;
      Z205Para_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z207Para_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      Z208Para_Nombre = "" ;
      Z209Para_Valor = "" ;
      Z210Para_Ambiente = "" ;
   }

   public void initAll0Q28( )
   {
      A20Para_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A20Para_Id", GXutil.ltrim( GXutil.str( A20Para_Id, 11, 0)));
      initializeNonKey0Q28( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161051");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_parametros.js", "?201861414161051");
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
      edtPara_Id_Internalname = "PARA_ID" ;
      edtPara_Nombre_Internalname = "PARA_NOMBRE" ;
      edtPara_Valor_Internalname = "PARA_VALOR" ;
      edtPara_Ambiente_Internalname = "PARA_AMBIENTE" ;
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
      Form.setCaption( "Parámetros" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPara_Ambiente_Jsonclick = "" ;
      edtPara_Ambiente_Enabled = 1 ;
      edtPara_Valor_Jsonclick = "" ;
      edtPara_Valor_Enabled = 1 ;
      edtPara_Nombre_Jsonclick = "" ;
      edtPara_Nombre_Enabled = 1 ;
      edtPara_Id_Jsonclick = "" ;
      edtPara_Id_Enabled = 0 ;
      edtPara_Id_Visible = 1 ;
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

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Para_Id',fld:'vPARA_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120Q2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z204Para_UsuarioCreacion = "" ;
      Z206Para_UsuarioModificacion = "" ;
      Z205Para_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z207Para_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      Z208Para_Nombre = "" ;
      Z209Para_Valor = "" ;
      Z210Para_Ambiente = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      A210Para_Ambiente = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A204Para_UsuarioCreacion = "" ;
      A206Para_UsuarioModificacion = "" ;
      A205Para_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A207Para_FechaModificacion = GXutil.resetTime( GXutil.nullDate() );
      AV8Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode28 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV9WebSession = httpContext.getWebSession();
      T000Q4_A20Para_Id = new long[1] ;
      T000Q4_A204Para_UsuarioCreacion = new String[] {""} ;
      T000Q4_A206Para_UsuarioModificacion = new String[] {""} ;
      T000Q4_A205Para_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_A207Para_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_A208Para_Nombre = new String[] {""} ;
      T000Q4_A209Para_Valor = new String[] {""} ;
      T000Q4_A210Para_Ambiente = new String[] {""} ;
      T000Q5_A20Para_Id = new long[1] ;
      T000Q3_A20Para_Id = new long[1] ;
      T000Q3_A204Para_UsuarioCreacion = new String[] {""} ;
      T000Q3_A206Para_UsuarioModificacion = new String[] {""} ;
      T000Q3_A205Para_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_A207Para_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_A208Para_Nombre = new String[] {""} ;
      T000Q3_A209Para_Valor = new String[] {""} ;
      T000Q3_A210Para_Ambiente = new String[] {""} ;
      T000Q6_A20Para_Id = new long[1] ;
      T000Q7_A20Para_Id = new long[1] ;
      T000Q2_A20Para_Id = new long[1] ;
      T000Q2_A204Para_UsuarioCreacion = new String[] {""} ;
      T000Q2_A206Para_UsuarioModificacion = new String[] {""} ;
      T000Q2_A205Para_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_A207Para_FechaModificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_A208Para_Nombre = new String[] {""} ;
      T000Q2_A209Para_Valor = new String[] {""} ;
      T000Q2_A210Para_Ambiente = new String[] {""} ;
      T000Q9_A20Para_Id = new long[1] ;
      T000Q12_A20Para_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_parametros__default(),
         new Object[] {
             new Object[] {
            T000Q2_A20Para_Id, T000Q2_A204Para_UsuarioCreacion, T000Q2_A206Para_UsuarioModificacion, T000Q2_A205Para_FechaCreacion, T000Q2_A207Para_FechaModificacion, T000Q2_A208Para_Nombre, T000Q2_A209Para_Valor, T000Q2_A210Para_Ambiente
            }
            , new Object[] {
            T000Q3_A20Para_Id, T000Q3_A204Para_UsuarioCreacion, T000Q3_A206Para_UsuarioModificacion, T000Q3_A205Para_FechaCreacion, T000Q3_A207Para_FechaModificacion, T000Q3_A208Para_Nombre, T000Q3_A209Para_Valor, T000Q3_A210Para_Ambiente
            }
            , new Object[] {
            T000Q4_A20Para_Id, T000Q4_A204Para_UsuarioCreacion, T000Q4_A206Para_UsuarioModificacion, T000Q4_A205Para_FechaCreacion, T000Q4_A207Para_FechaModificacion, T000Q4_A208Para_Nombre, T000Q4_A209Para_Valor, T000Q4_A210Para_Ambiente
            }
            , new Object[] {
            T000Q5_A20Para_Id
            }
            , new Object[] {
            T000Q6_A20Para_Id
            }
            , new Object[] {
            T000Q7_A20Para_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q9_A20Para_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q12_A20Para_Id
            }
         }
      );
      AV13Pgmname = "SEG_PARAMETROS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound28 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtPara_Id_Enabled ;
   private int edtPara_Id_Visible ;
   private int edtPara_Nombre_Enabled ;
   private int edtPara_Valor_Enabled ;
   private int edtPara_Ambiente_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7Para_Id ;
   private long Z20Para_Id ;
   private long AV7Para_Id ;
   private long A20Para_Id ;
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
   private String edtPara_Nombre_Internalname ;
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
   private String edtPara_Id_Internalname ;
   private String edtPara_Id_Jsonclick ;
   private String edtPara_Nombre_Jsonclick ;
   private String edtPara_Valor_Internalname ;
   private String edtPara_Valor_Jsonclick ;
   private String edtPara_Ambiente_Internalname ;
   private String edtPara_Ambiente_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode28 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z205Para_FechaCreacion ;
   private java.util.Date Z207Para_FechaModificacion ;
   private java.util.Date A205Para_FechaCreacion ;
   private java.util.Date A207Para_FechaModificacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z204Para_UsuarioCreacion ;
   private String Z206Para_UsuarioModificacion ;
   private String Z208Para_Nombre ;
   private String Z209Para_Valor ;
   private String Z210Para_Ambiente ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private String A210Para_Ambiente ;
   private String A204Para_UsuarioCreacion ;
   private String A206Para_UsuarioModificacion ;
   private String AV8Usuario ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private IDataStoreProvider pr_default ;
   private long[] T000Q4_A20Para_Id ;
   private String[] T000Q4_A204Para_UsuarioCreacion ;
   private String[] T000Q4_A206Para_UsuarioModificacion ;
   private java.util.Date[] T000Q4_A205Para_FechaCreacion ;
   private java.util.Date[] T000Q4_A207Para_FechaModificacion ;
   private String[] T000Q4_A208Para_Nombre ;
   private String[] T000Q4_A209Para_Valor ;
   private String[] T000Q4_A210Para_Ambiente ;
   private long[] T000Q5_A20Para_Id ;
   private long[] T000Q3_A20Para_Id ;
   private String[] T000Q3_A204Para_UsuarioCreacion ;
   private String[] T000Q3_A206Para_UsuarioModificacion ;
   private java.util.Date[] T000Q3_A205Para_FechaCreacion ;
   private java.util.Date[] T000Q3_A207Para_FechaModificacion ;
   private String[] T000Q3_A208Para_Nombre ;
   private String[] T000Q3_A209Para_Valor ;
   private String[] T000Q3_A210Para_Ambiente ;
   private long[] T000Q6_A20Para_Id ;
   private long[] T000Q7_A20Para_Id ;
   private long[] T000Q2_A20Para_Id ;
   private String[] T000Q2_A204Para_UsuarioCreacion ;
   private String[] T000Q2_A206Para_UsuarioModificacion ;
   private java.util.Date[] T000Q2_A205Para_FechaCreacion ;
   private java.util.Date[] T000Q2_A207Para_FechaModificacion ;
   private String[] T000Q2_A208Para_Nombre ;
   private String[] T000Q2_A209Para_Valor ;
   private String[] T000Q2_A210Para_Ambiente ;
   private long[] T000Q9_A20Para_Id ;
   private long[] T000Q12_A20Para_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class seg_parametros__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Q2", "SELECT Para_Id, Para_UsuarioCreacion, Para_UsuarioModificacion, Para_FechaCreacion, Para_FechaModificacion, Para_Nombre, Para_Valor, Para_Ambiente FROM SEG_PARAMETROS WHERE Para_Id = ?  FOR UPDATE OF Para_UsuarioCreacion, Para_UsuarioModificacion, Para_FechaCreacion, Para_FechaModificacion, Para_Nombre, Para_Valor, Para_Ambiente NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q3", "SELECT Para_Id, Para_UsuarioCreacion, Para_UsuarioModificacion, Para_FechaCreacion, Para_FechaModificacion, Para_Nombre, Para_Valor, Para_Ambiente FROM SEG_PARAMETROS WHERE Para_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Para_Id, TM1.Para_UsuarioCreacion, TM1.Para_UsuarioModificacion, TM1.Para_FechaCreacion, TM1.Para_FechaModificacion, TM1.Para_Nombre, TM1.Para_Valor, TM1.Para_Ambiente FROM SEG_PARAMETROS TM1 WHERE TM1.Para_Id = ? ORDER BY TM1.Para_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000Q5", "SELECT /*+ FIRST_ROWS(1) */ Para_Id FROM SEG_PARAMETROS WHERE Para_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Para_Id FROM SEG_PARAMETROS WHERE ( Para_Id > ?) ORDER BY Para_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Q7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Para_Id FROM SEG_PARAMETROS WHERE ( Para_Id < ?) ORDER BY Para_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Q8", "INSERT INTO SEG_PARAMETROS(Para_UsuarioCreacion, Para_UsuarioModificacion, Para_FechaCreacion, Para_FechaModificacion, Para_Nombre, Para_Valor, Para_Ambiente) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_PARAMETROS")
         ,new ForEachCursor("T000Q9", "SELECT Para_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000Q10", "UPDATE SEG_PARAMETROS SET Para_UsuarioCreacion=?, Para_UsuarioModificacion=?, Para_FechaCreacion=?, Para_FechaModificacion=?, Para_Nombre=?, Para_Valor=?, Para_Ambiente=?  WHERE Para_Id = ?", GX_NOMASK, "SEG_PARAMETROS")
         ,new UpdateCursor("T000Q11", "DELETE FROM SEG_PARAMETROS  WHERE Para_Id = ?", GX_NOMASK, "SEG_PARAMETROS")
         ,new ForEachCursor("T000Q12", "SELECT /*+ FIRST_ROWS(100) */ Para_Id FROM SEG_PARAMETROS ORDER BY Para_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

