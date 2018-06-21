/*
               File: rpt_parametros_impl
        Description: PARAMETROS DE REPORTES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:36.7
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

public final  class rpt_parametros_impl extends GXDataArea
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
            AV7RPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7RPT_PAR_ID", GXutil.ltrim( GXutil.str( AV7RPT_PAR_ID, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vRPT_PAR_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RPT_PAR_ID), "ZZZ9")));
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
      cmbRPT_PAR_ESTADO.setName( "RPT_PAR_ESTADO" );
      cmbRPT_PAR_ESTADO.setWebtags( "" );
      cmbRPT_PAR_ESTADO.addItem("A", "Activo", (short)(0));
      cmbRPT_PAR_ESTADO.addItem("I", "Inactivo", (short)(0));
      if ( cmbRPT_PAR_ESTADO.getItemCount() > 0 )
      {
         A842RPT_PAR_ESTADO = cmbRPT_PAR_ESTADO.getValidValue(A842RPT_PAR_ESTADO) ;
         n842RPT_PAR_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
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
         Form.getMeta().addItem("description", "PARAMETROS DE REPORTES", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public rpt_parametros_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rpt_parametros_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_parametros_impl.class ));
   }

   public rpt_parametros_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbRPT_PAR_ESTADO = new HTMLChoice();
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
      if ( cmbRPT_PAR_ESTADO.getItemCount() > 0 )
      {
         A842RPT_PAR_ESTADO = cmbRPT_PAR_ESTADO.getValidValue(A842RPT_PAR_ESTADO) ;
         n842RPT_PAR_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Parámetros para Reportes", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RPT_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_RPT_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_ID_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")), ((edtRPT_PAR_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_PAR_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_DESCRIPCION_Internalname, "Parámetro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_DESCRIPCION_Internalname, A841RPT_PAR_DESCRIPCION, GXutil.rtrim( localUtil.format( A841RPT_PAR_DESCRIPCION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_DESCRIPCION_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_PAR_DESCRIPCION_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_PAR_NOMBREINTERNO_Internalname, "Nombre Interno", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_PAR_NOMBREINTERNO_Internalname, A860RPT_PAR_NOMBREINTERNO, GXutil.rtrim( localUtil.format( A860RPT_PAR_NOMBREINTERNO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_PAR_NOMBREINTERNO_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_PAR_NOMBREINTERNO_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_PARAMETROS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_PAR_ESTADO.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_PAR_ESTADO, cmbRPT_PAR_ESTADO.getInternalname(), GXutil.rtrim( A842RPT_PAR_ESTADO), 1, cmbRPT_PAR_ESTADO.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRPT_PAR_ESTADO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_RPT_PARAMETROS.htm");
         cmbRPT_PAR_ESTADO.setValue( GXutil.rtrim( A842RPT_PAR_ESTADO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRPT_PAR_ESTADO.getInternalname(), "Values", cmbRPT_PAR_ESTADO.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_PARAMETROS.htm");
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
      e111H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_PAR_ID_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
            A841RPT_PAR_DESCRIPCION = httpContext.cgiGet( edtRPT_PAR_DESCRIPCION_Internalname) ;
            n841RPT_PAR_DESCRIPCION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
            n841RPT_PAR_DESCRIPCION = ((GXutil.strcmp("", A841RPT_PAR_DESCRIPCION)==0) ? true : false) ;
            A860RPT_PAR_NOMBREINTERNO = httpContext.cgiGet( edtRPT_PAR_NOMBREINTERNO_Internalname) ;
            n860RPT_PAR_NOMBREINTERNO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
            n860RPT_PAR_NOMBREINTERNO = ((GXutil.strcmp("", A860RPT_PAR_NOMBREINTERNO)==0) ? true : false) ;
            cmbRPT_PAR_ESTADO.setValue( httpContext.cgiGet( cmbRPT_PAR_ESTADO.getInternalname()) );
            A842RPT_PAR_ESTADO = httpContext.cgiGet( cmbRPT_PAR_ESTADO.getInternalname()) ;
            n842RPT_PAR_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
            n842RPT_PAR_ESTADO = ((GXutil.strcmp("", A842RPT_PAR_ESTADO)==0) ? true : false) ;
            /* Read saved values. */
            Z840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z840RPT_PAR_ID"), ",", ".")) ;
            Z854RPT_PAR_USUARIOCREA = httpContext.cgiGet( "Z854RPT_PAR_USUARIOCREA") ;
            n854RPT_PAR_USUARIOCREA = ((GXutil.strcmp("", A854RPT_PAR_USUARIOCREA)==0) ? true : false) ;
            Z856RPT_PAR_USUARIOMODIF = httpContext.cgiGet( "Z856RPT_PAR_USUARIOMODIF") ;
            n856RPT_PAR_USUARIOMODIF = ((GXutil.strcmp("", A856RPT_PAR_USUARIOMODIF)==0) ? true : false) ;
            Z855RPT_PAR_FECHACREA = localUtil.ctot( httpContext.cgiGet( "Z855RPT_PAR_FECHACREA"), 0) ;
            n855RPT_PAR_FECHACREA = (GXutil.dateCompare(GXutil.nullDate(), A855RPT_PAR_FECHACREA) ? true : false) ;
            Z857RPT_PAR_FECHAMODIF = localUtil.ctot( httpContext.cgiGet( "Z857RPT_PAR_FECHAMODIF"), 0) ;
            n857RPT_PAR_FECHAMODIF = (GXutil.dateCompare(GXutil.nullDate(), A857RPT_PAR_FECHAMODIF) ? true : false) ;
            Z841RPT_PAR_DESCRIPCION = httpContext.cgiGet( "Z841RPT_PAR_DESCRIPCION") ;
            n841RPT_PAR_DESCRIPCION = ((GXutil.strcmp("", A841RPT_PAR_DESCRIPCION)==0) ? true : false) ;
            Z842RPT_PAR_ESTADO = httpContext.cgiGet( "Z842RPT_PAR_ESTADO") ;
            n842RPT_PAR_ESTADO = ((GXutil.strcmp("", A842RPT_PAR_ESTADO)==0) ? true : false) ;
            Z860RPT_PAR_NOMBREINTERNO = httpContext.cgiGet( "Z860RPT_PAR_NOMBREINTERNO") ;
            n860RPT_PAR_NOMBREINTERNO = ((GXutil.strcmp("", A860RPT_PAR_NOMBREINTERNO)==0) ? true : false) ;
            A854RPT_PAR_USUARIOCREA = httpContext.cgiGet( "Z854RPT_PAR_USUARIOCREA") ;
            n854RPT_PAR_USUARIOCREA = false ;
            n854RPT_PAR_USUARIOCREA = ((GXutil.strcmp("", A854RPT_PAR_USUARIOCREA)==0) ? true : false) ;
            A856RPT_PAR_USUARIOMODIF = httpContext.cgiGet( "Z856RPT_PAR_USUARIOMODIF") ;
            n856RPT_PAR_USUARIOMODIF = false ;
            n856RPT_PAR_USUARIOMODIF = ((GXutil.strcmp("", A856RPT_PAR_USUARIOMODIF)==0) ? true : false) ;
            A855RPT_PAR_FECHACREA = localUtil.ctot( httpContext.cgiGet( "Z855RPT_PAR_FECHACREA"), 0) ;
            n855RPT_PAR_FECHACREA = false ;
            n855RPT_PAR_FECHACREA = (GXutil.dateCompare(GXutil.nullDate(), A855RPT_PAR_FECHACREA) ? true : false) ;
            A857RPT_PAR_FECHAMODIF = localUtil.ctot( httpContext.cgiGet( "Z857RPT_PAR_FECHAMODIF"), 0) ;
            n857RPT_PAR_FECHAMODIF = false ;
            n857RPT_PAR_FECHAMODIF = (GXutil.dateCompare(GXutil.nullDate(), A857RPT_PAR_FECHAMODIF) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vRPT_PAR_ID"), ",", ".")) ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A854RPT_PAR_USUARIOCREA = httpContext.cgiGet( "RPT_PAR_USUARIOCREA") ;
            n854RPT_PAR_USUARIOCREA = ((GXutil.strcmp("", A854RPT_PAR_USUARIOCREA)==0) ? true : false) ;
            A856RPT_PAR_USUARIOMODIF = httpContext.cgiGet( "RPT_PAR_USUARIOMODIF") ;
            n856RPT_PAR_USUARIOMODIF = ((GXutil.strcmp("", A856RPT_PAR_USUARIOMODIF)==0) ? true : false) ;
            A855RPT_PAR_FECHACREA = localUtil.ctot( httpContext.cgiGet( "RPT_PAR_FECHACREA"), 0) ;
            n855RPT_PAR_FECHACREA = (GXutil.dateCompare(GXutil.nullDate(), A855RPT_PAR_FECHACREA) ? true : false) ;
            A857RPT_PAR_FECHAMODIF = localUtil.ctot( httpContext.cgiGet( "RPT_PAR_FECHAMODIF"), 0) ;
            n857RPT_PAR_FECHAMODIF = (GXutil.dateCompare(GXutil.nullDate(), A857RPT_PAR_FECHAMODIF) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "RPT_PARAMETROS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A840RPT_PAR_ID != Z840RPT_PAR_ID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("rpt_parametros:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A840RPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
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
                  sMode64 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode64 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound64 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_1H0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "RPT_PAR_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRPT_PAR_ID_Internalname ;
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
                        e111H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121H2 ();
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
         e121H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1H64( ) ;
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
         disableAttributes1H64( ) ;
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

   public void confirm_1H0( )
   {
      beforeValidate1H64( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1H64( ) ;
         }
         else
         {
            checkExtendedTable1H64( ) ;
            closeExtendedTableCursors1H64( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption1H0( )
   {
   }

   public void e111H2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e121H2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwrpt_parametros") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1H64( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z854RPT_PAR_USUARIOCREA = T001H3_A854RPT_PAR_USUARIOCREA[0] ;
            Z856RPT_PAR_USUARIOMODIF = T001H3_A856RPT_PAR_USUARIOMODIF[0] ;
            Z855RPT_PAR_FECHACREA = T001H3_A855RPT_PAR_FECHACREA[0] ;
            Z857RPT_PAR_FECHAMODIF = T001H3_A857RPT_PAR_FECHAMODIF[0] ;
            Z841RPT_PAR_DESCRIPCION = T001H3_A841RPT_PAR_DESCRIPCION[0] ;
            Z842RPT_PAR_ESTADO = T001H3_A842RPT_PAR_ESTADO[0] ;
            Z860RPT_PAR_NOMBREINTERNO = T001H3_A860RPT_PAR_NOMBREINTERNO[0] ;
         }
         else
         {
            Z854RPT_PAR_USUARIOCREA = A854RPT_PAR_USUARIOCREA ;
            Z856RPT_PAR_USUARIOMODIF = A856RPT_PAR_USUARIOMODIF ;
            Z855RPT_PAR_FECHACREA = A855RPT_PAR_FECHACREA ;
            Z857RPT_PAR_FECHAMODIF = A857RPT_PAR_FECHAMODIF ;
            Z841RPT_PAR_DESCRIPCION = A841RPT_PAR_DESCRIPCION ;
            Z842RPT_PAR_ESTADO = A842RPT_PAR_ESTADO ;
            Z860RPT_PAR_NOMBREINTERNO = A860RPT_PAR_NOMBREINTERNO ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z840RPT_PAR_ID = A840RPT_PAR_ID ;
         Z854RPT_PAR_USUARIOCREA = A854RPT_PAR_USUARIOCREA ;
         Z856RPT_PAR_USUARIOMODIF = A856RPT_PAR_USUARIOMODIF ;
         Z855RPT_PAR_FECHACREA = A855RPT_PAR_FECHACREA ;
         Z857RPT_PAR_FECHAMODIF = A857RPT_PAR_FECHAMODIF ;
         Z841RPT_PAR_DESCRIPCION = A841RPT_PAR_DESCRIPCION ;
         Z842RPT_PAR_ESTADO = A842RPT_PAR_ESTADO ;
         Z860RPT_PAR_NOMBREINTERNO = A860RPT_PAR_NOMBREINTERNO ;
      }
   }

   public void standaloneNotModal( )
   {
      edtRPT_PAR_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), true);
      edtRPT_PAR_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7RPT_PAR_ID) )
      {
         A840RPT_PAR_ID = AV7RPT_PAR_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
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

   public void load1H64( )
   {
      /* Using cursor T001H4 */
      pr_default.execute(2, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A854RPT_PAR_USUARIOCREA = T001H4_A854RPT_PAR_USUARIOCREA[0] ;
         n854RPT_PAR_USUARIOCREA = T001H4_n854RPT_PAR_USUARIOCREA[0] ;
         A856RPT_PAR_USUARIOMODIF = T001H4_A856RPT_PAR_USUARIOMODIF[0] ;
         n856RPT_PAR_USUARIOMODIF = T001H4_n856RPT_PAR_USUARIOMODIF[0] ;
         A855RPT_PAR_FECHACREA = T001H4_A855RPT_PAR_FECHACREA[0] ;
         n855RPT_PAR_FECHACREA = T001H4_n855RPT_PAR_FECHACREA[0] ;
         A857RPT_PAR_FECHAMODIF = T001H4_A857RPT_PAR_FECHAMODIF[0] ;
         n857RPT_PAR_FECHAMODIF = T001H4_n857RPT_PAR_FECHAMODIF[0] ;
         A841RPT_PAR_DESCRIPCION = T001H4_A841RPT_PAR_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
         n841RPT_PAR_DESCRIPCION = T001H4_n841RPT_PAR_DESCRIPCION[0] ;
         A842RPT_PAR_ESTADO = T001H4_A842RPT_PAR_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
         n842RPT_PAR_ESTADO = T001H4_n842RPT_PAR_ESTADO[0] ;
         A860RPT_PAR_NOMBREINTERNO = T001H4_A860RPT_PAR_NOMBREINTERNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
         n860RPT_PAR_NOMBREINTERNO = T001H4_n860RPT_PAR_NOMBREINTERNO[0] ;
         zm1H64( -7) ;
      }
      pr_default.close(2);
      onLoadActions1H64( ) ;
   }

   public void onLoadActions1H64( )
   {
      AV13Pgmname = "RPT_PARAMETROS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1H64( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "RPT_PARAMETROS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1H64( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1H64( )
   {
      /* Using cursor T001H5 */
      pr_default.execute(3, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      else
      {
         RcdFound64 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001H3 */
      pr_default.execute(1, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1H64( 7) ;
         RcdFound64 = (short)(1) ;
         A840RPT_PAR_ID = T001H3_A840RPT_PAR_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
         A854RPT_PAR_USUARIOCREA = T001H3_A854RPT_PAR_USUARIOCREA[0] ;
         n854RPT_PAR_USUARIOCREA = T001H3_n854RPT_PAR_USUARIOCREA[0] ;
         A856RPT_PAR_USUARIOMODIF = T001H3_A856RPT_PAR_USUARIOMODIF[0] ;
         n856RPT_PAR_USUARIOMODIF = T001H3_n856RPT_PAR_USUARIOMODIF[0] ;
         A855RPT_PAR_FECHACREA = T001H3_A855RPT_PAR_FECHACREA[0] ;
         n855RPT_PAR_FECHACREA = T001H3_n855RPT_PAR_FECHACREA[0] ;
         A857RPT_PAR_FECHAMODIF = T001H3_A857RPT_PAR_FECHAMODIF[0] ;
         n857RPT_PAR_FECHAMODIF = T001H3_n857RPT_PAR_FECHAMODIF[0] ;
         A841RPT_PAR_DESCRIPCION = T001H3_A841RPT_PAR_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
         n841RPT_PAR_DESCRIPCION = T001H3_n841RPT_PAR_DESCRIPCION[0] ;
         A842RPT_PAR_ESTADO = T001H3_A842RPT_PAR_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
         n842RPT_PAR_ESTADO = T001H3_n842RPT_PAR_ESTADO[0] ;
         A860RPT_PAR_NOMBREINTERNO = T001H3_A860RPT_PAR_NOMBREINTERNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
         n860RPT_PAR_NOMBREINTERNO = T001H3_n860RPT_PAR_NOMBREINTERNO[0] ;
         Z840RPT_PAR_ID = A840RPT_PAR_ID ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1H64( ) ;
         if ( AnyError == 1 )
         {
            RcdFound64 = (short)(0) ;
            initializeNonKey1H64( ) ;
         }
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound64 = (short)(0) ;
         initializeNonKey1H64( ) ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1H64( ) ;
      if ( RcdFound64 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001H6 */
      pr_default.execute(4, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001H6_A840RPT_PAR_ID[0] < A840RPT_PAR_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001H6_A840RPT_PAR_ID[0] > A840RPT_PAR_ID ) ) )
         {
            A840RPT_PAR_ID = T001H6_A840RPT_PAR_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001H7 */
      pr_default.execute(5, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001H7_A840RPT_PAR_ID[0] > A840RPT_PAR_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001H7_A840RPT_PAR_ID[0] < A840RPT_PAR_ID ) ) )
         {
            A840RPT_PAR_ID = T001H7_A840RPT_PAR_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H64( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H64( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound64 == 1 )
         {
            if ( A840RPT_PAR_ID != Z840RPT_PAR_ID )
            {
               A840RPT_PAR_ID = Z840RPT_PAR_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RPT_PAR_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRPT_PAR_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1H64( ) ;
               GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A840RPT_PAR_ID != Z840RPT_PAR_ID )
            {
               /* Insert record */
               GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H64( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RPT_PAR_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRPT_PAR_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1H64( ) ;
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
      if ( A840RPT_PAR_ID != Z840RPT_PAR_ID )
      {
         A840RPT_PAR_ID = Z840RPT_PAR_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RPT_PAR_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_PAR_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRPT_PAR_DESCRIPCION_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1H64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001H2 */
         pr_default.execute(0, new Object[] {new Short(A840RPT_PAR_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_PARAMETROS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z854RPT_PAR_USUARIOCREA, T001H2_A854RPT_PAR_USUARIOCREA[0]) != 0 ) || ( GXutil.strcmp(Z856RPT_PAR_USUARIOMODIF, T001H2_A856RPT_PAR_USUARIOMODIF[0]) != 0 ) || !( GXutil.dateCompare(Z855RPT_PAR_FECHACREA, T001H2_A855RPT_PAR_FECHACREA[0]) ) || !( GXutil.dateCompare(Z857RPT_PAR_FECHAMODIF, T001H2_A857RPT_PAR_FECHAMODIF[0]) ) || ( GXutil.strcmp(Z841RPT_PAR_DESCRIPCION, T001H2_A841RPT_PAR_DESCRIPCION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z842RPT_PAR_ESTADO, T001H2_A842RPT_PAR_ESTADO[0]) != 0 ) || ( GXutil.strcmp(Z860RPT_PAR_NOMBREINTERNO, T001H2_A860RPT_PAR_NOMBREINTERNO[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"RPT_PARAMETROS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H64( )
   {
      beforeValidate1H64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H64( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H64( 0) ;
         checkOptimisticConcurrency1H64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H64( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H8 */
                  pr_default.execute(6, new Object[] {new Boolean(n854RPT_PAR_USUARIOCREA), A854RPT_PAR_USUARIOCREA, new Boolean(n856RPT_PAR_USUARIOMODIF), A856RPT_PAR_USUARIOMODIF, new Boolean(n855RPT_PAR_FECHACREA), A855RPT_PAR_FECHACREA, new Boolean(n857RPT_PAR_FECHAMODIF), A857RPT_PAR_FECHAMODIF, new Boolean(n841RPT_PAR_DESCRIPCION), A841RPT_PAR_DESCRIPCION, new Boolean(n842RPT_PAR_ESTADO), A842RPT_PAR_ESTADO, new Boolean(n860RPT_PAR_NOMBREINTERNO), A860RPT_PAR_NOMBREINTERNO});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001H9 */
                  pr_default.execute(7);
                  A840RPT_PAR_ID = T001H9_A840RPT_PAR_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_PARAMETROS") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption1H0( ) ;
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
            load1H64( ) ;
         }
         endLevel1H64( ) ;
      }
      closeExtendedTableCursors1H64( ) ;
   }

   public void update1H64( )
   {
      beforeValidate1H64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H64( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H64( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H10 */
                  pr_default.execute(8, new Object[] {new Boolean(n854RPT_PAR_USUARIOCREA), A854RPT_PAR_USUARIOCREA, new Boolean(n856RPT_PAR_USUARIOMODIF), A856RPT_PAR_USUARIOMODIF, new Boolean(n855RPT_PAR_FECHACREA), A855RPT_PAR_FECHACREA, new Boolean(n857RPT_PAR_FECHAMODIF), A857RPT_PAR_FECHAMODIF, new Boolean(n841RPT_PAR_DESCRIPCION), A841RPT_PAR_DESCRIPCION, new Boolean(n842RPT_PAR_ESTADO), A842RPT_PAR_ESTADO, new Boolean(n860RPT_PAR_NOMBREINTERNO), A860RPT_PAR_NOMBREINTERNO, new Short(A840RPT_PAR_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_PARAMETROS") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_PARAMETROS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H64( ) ;
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
         endLevel1H64( ) ;
      }
      closeExtendedTableCursors1H64( ) ;
   }

   public void deferredUpdate1H64( )
   {
   }

   public void delete( )
   {
      beforeValidate1H64( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H64( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H64( ) ;
         afterConfirm1H64( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H64( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001H11 */
               pr_default.execute(9, new Object[] {new Short(A840RPT_PAR_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_PARAMETROS") ;
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
      sMode64 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1H64( ) ;
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1H64( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "RPT_PARAMETROS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001H12 */
         pr_default.execute(10, new Object[] {new Short(A840RPT_PAR_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"REPORTE PARAMETROS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel1H64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H64( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "rpt_parametros");
         if ( AnyError == 0 )
         {
            confirmValues1H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "rpt_parametros");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H64( )
   {
      /* Scan By routine */
      /* Using cursor T001H13 */
      pr_default.execute(11);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A840RPT_PAR_ID = T001H13_A840RPT_PAR_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H64( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A840RPT_PAR_ID = T001H13_A840RPT_PAR_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
      }
   }

   public void scanEnd1H64( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1H64( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A855RPT_PAR_FECHACREA = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n855RPT_PAR_FECHACREA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A855RPT_PAR_FECHACREA", localUtil.ttoc( A855RPT_PAR_FECHACREA, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A857RPT_PAR_FECHAMODIF = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n857RPT_PAR_FECHAMODIF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A857RPT_PAR_FECHAMODIF", localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A854RPT_PAR_USUARIOCREA = AV12Usuario ;
         n854RPT_PAR_USUARIOCREA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A854RPT_PAR_USUARIOCREA", A854RPT_PAR_USUARIOCREA);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A856RPT_PAR_USUARIOMODIF = AV12Usuario ;
         n856RPT_PAR_USUARIOMODIF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A856RPT_PAR_USUARIOMODIF", A856RPT_PAR_USUARIOMODIF);
      }
   }

   public void beforeInsert1H64( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H64( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H64( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H64( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H64( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H64( )
   {
      edtRPT_PAR_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), true);
      edtRPT_PAR_DESCRIPCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_DESCRIPCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_DESCRIPCION_Enabled, 5, 0)), true);
      edtRPT_PAR_NOMBREINTERNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_NOMBREINTERNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_NOMBREINTERNO_Enabled, 5, 0)), true);
      cmbRPT_PAR_ESTADO.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRPT_PAR_ESTADO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRPT_PAR_ESTADO.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1H0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173689");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.rpt_parametros") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7RPT_PAR_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z840RPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( Z840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z854RPT_PAR_USUARIOCREA", Z854RPT_PAR_USUARIOCREA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z856RPT_PAR_USUARIOMODIF", Z856RPT_PAR_USUARIOMODIF);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z855RPT_PAR_FECHACREA", localUtil.ttoc( Z855RPT_PAR_FECHACREA, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z857RPT_PAR_FECHAMODIF", localUtil.ttoc( Z857RPT_PAR_FECHAMODIF, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z841RPT_PAR_DESCRIPCION", Z841RPT_PAR_DESCRIPCION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z842RPT_PAR_ESTADO", GXutil.rtrim( Z842RPT_PAR_ESTADO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z860RPT_PAR_NOMBREINTERNO", Z860RPT_PAR_NOMBREINTERNO);
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vRPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( AV7RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_USUARIOCREA", A854RPT_PAR_USUARIOCREA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_USUARIOMODIF", A856RPT_PAR_USUARIOMODIF);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_FECHACREA", localUtil.ttoc( A855RPT_PAR_FECHACREA, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_FECHAMODIF", localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRPT_PAR_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RPT_PAR_ID), "ZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "RPT_PARAMETROS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("rpt_parametros:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.rpt_parametros") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7RPT_PAR_ID,4,0))) ;
   }

   public String getPgmname( )
   {
      return "RPT_PARAMETROS" ;
   }

   public String getPgmdesc( )
   {
      return "PARAMETROS DE REPORTES" ;
   }

   public void initializeNonKey1H64( )
   {
      A854RPT_PAR_USUARIOCREA = "" ;
      n854RPT_PAR_USUARIOCREA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A854RPT_PAR_USUARIOCREA", A854RPT_PAR_USUARIOCREA);
      A856RPT_PAR_USUARIOMODIF = "" ;
      n856RPT_PAR_USUARIOMODIF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A856RPT_PAR_USUARIOMODIF", A856RPT_PAR_USUARIOMODIF);
      A855RPT_PAR_FECHACREA = GXutil.resetTime( GXutil.nullDate() );
      n855RPT_PAR_FECHACREA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A855RPT_PAR_FECHACREA", localUtil.ttoc( A855RPT_PAR_FECHACREA, 8, 5, 0, 3, "/", ":", " "));
      A857RPT_PAR_FECHAMODIF = GXutil.resetTime( GXutil.nullDate() );
      n857RPT_PAR_FECHAMODIF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A857RPT_PAR_FECHAMODIF", localUtil.ttoc( A857RPT_PAR_FECHAMODIF, 8, 5, 0, 3, "/", ":", " "));
      A841RPT_PAR_DESCRIPCION = "" ;
      n841RPT_PAR_DESCRIPCION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841RPT_PAR_DESCRIPCION", A841RPT_PAR_DESCRIPCION);
      n841RPT_PAR_DESCRIPCION = ((GXutil.strcmp("", A841RPT_PAR_DESCRIPCION)==0) ? true : false) ;
      A842RPT_PAR_ESTADO = "" ;
      n842RPT_PAR_ESTADO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A842RPT_PAR_ESTADO", A842RPT_PAR_ESTADO);
      n842RPT_PAR_ESTADO = ((GXutil.strcmp("", A842RPT_PAR_ESTADO)==0) ? true : false) ;
      A860RPT_PAR_NOMBREINTERNO = "" ;
      n860RPT_PAR_NOMBREINTERNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
      n860RPT_PAR_NOMBREINTERNO = ((GXutil.strcmp("", A860RPT_PAR_NOMBREINTERNO)==0) ? true : false) ;
      Z854RPT_PAR_USUARIOCREA = "" ;
      Z856RPT_PAR_USUARIOMODIF = "" ;
      Z855RPT_PAR_FECHACREA = GXutil.resetTime( GXutil.nullDate() );
      Z857RPT_PAR_FECHAMODIF = GXutil.resetTime( GXutil.nullDate() );
      Z841RPT_PAR_DESCRIPCION = "" ;
      Z842RPT_PAR_ESTADO = "" ;
      Z860RPT_PAR_NOMBREINTERNO = "" ;
   }

   public void initAll1H64( )
   {
      A840RPT_PAR_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A840RPT_PAR_ID", GXutil.ltrim( GXutil.str( A840RPT_PAR_ID, 4, 0)));
      initializeNonKey1H64( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173697");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("rpt_parametros.js", "?201861414173697");
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
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID" ;
      edtRPT_PAR_DESCRIPCION_Internalname = "RPT_PAR_DESCRIPCION" ;
      edtRPT_PAR_NOMBREINTERNO_Internalname = "RPT_PAR_NOMBREINTERNO" ;
      cmbRPT_PAR_ESTADO.setInternalname( "RPT_PAR_ESTADO" );
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
      Form.setCaption( "PARAMETROS DE REPORTES" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbRPT_PAR_ESTADO.setJsonclick( "" );
      cmbRPT_PAR_ESTADO.setEnabled( 1 );
      edtRPT_PAR_NOMBREINTERNO_Jsonclick = "" ;
      edtRPT_PAR_NOMBREINTERNO_Enabled = 1 ;
      edtRPT_PAR_DESCRIPCION_Jsonclick = "" ;
      edtRPT_PAR_DESCRIPCION_Enabled = 1 ;
      edtRPT_PAR_ID_Jsonclick = "" ;
      edtRPT_PAR_ID_Enabled = 0 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7RPT_PAR_ID',fld:'vRPT_PAR_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121H2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z854RPT_PAR_USUARIOCREA = "" ;
      Z856RPT_PAR_USUARIOMODIF = "" ;
      Z855RPT_PAR_FECHACREA = GXutil.resetTime( GXutil.nullDate() );
      Z857RPT_PAR_FECHAMODIF = GXutil.resetTime( GXutil.nullDate() );
      Z841RPT_PAR_DESCRIPCION = "" ;
      Z842RPT_PAR_ESTADO = "" ;
      Z860RPT_PAR_NOMBREINTERNO = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A842RPT_PAR_ESTADO = "" ;
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
      A841RPT_PAR_DESCRIPCION = "" ;
      A860RPT_PAR_NOMBREINTERNO = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A854RPT_PAR_USUARIOCREA = "" ;
      A856RPT_PAR_USUARIOMODIF = "" ;
      A855RPT_PAR_FECHACREA = GXutil.resetTime( GXutil.nullDate() );
      A857RPT_PAR_FECHAMODIF = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode64 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T001H4_A840RPT_PAR_ID = new short[1] ;
      T001H4_A854RPT_PAR_USUARIOCREA = new String[] {""} ;
      T001H4_n854RPT_PAR_USUARIOCREA = new boolean[] {false} ;
      T001H4_A856RPT_PAR_USUARIOMODIF = new String[] {""} ;
      T001H4_n856RPT_PAR_USUARIOMODIF = new boolean[] {false} ;
      T001H4_A855RPT_PAR_FECHACREA = new java.util.Date[] {GXutil.nullDate()} ;
      T001H4_n855RPT_PAR_FECHACREA = new boolean[] {false} ;
      T001H4_A857RPT_PAR_FECHAMODIF = new java.util.Date[] {GXutil.nullDate()} ;
      T001H4_n857RPT_PAR_FECHAMODIF = new boolean[] {false} ;
      T001H4_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001H4_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001H4_A842RPT_PAR_ESTADO = new String[] {""} ;
      T001H4_n842RPT_PAR_ESTADO = new boolean[] {false} ;
      T001H4_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001H4_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001H5_A840RPT_PAR_ID = new short[1] ;
      T001H3_A840RPT_PAR_ID = new short[1] ;
      T001H3_A854RPT_PAR_USUARIOCREA = new String[] {""} ;
      T001H3_n854RPT_PAR_USUARIOCREA = new boolean[] {false} ;
      T001H3_A856RPT_PAR_USUARIOMODIF = new String[] {""} ;
      T001H3_n856RPT_PAR_USUARIOMODIF = new boolean[] {false} ;
      T001H3_A855RPT_PAR_FECHACREA = new java.util.Date[] {GXutil.nullDate()} ;
      T001H3_n855RPT_PAR_FECHACREA = new boolean[] {false} ;
      T001H3_A857RPT_PAR_FECHAMODIF = new java.util.Date[] {GXutil.nullDate()} ;
      T001H3_n857RPT_PAR_FECHAMODIF = new boolean[] {false} ;
      T001H3_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001H3_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001H3_A842RPT_PAR_ESTADO = new String[] {""} ;
      T001H3_n842RPT_PAR_ESTADO = new boolean[] {false} ;
      T001H3_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001H3_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001H6_A840RPT_PAR_ID = new short[1] ;
      T001H7_A840RPT_PAR_ID = new short[1] ;
      T001H2_A840RPT_PAR_ID = new short[1] ;
      T001H2_A854RPT_PAR_USUARIOCREA = new String[] {""} ;
      T001H2_n854RPT_PAR_USUARIOCREA = new boolean[] {false} ;
      T001H2_A856RPT_PAR_USUARIOMODIF = new String[] {""} ;
      T001H2_n856RPT_PAR_USUARIOMODIF = new boolean[] {false} ;
      T001H2_A855RPT_PAR_FECHACREA = new java.util.Date[] {GXutil.nullDate()} ;
      T001H2_n855RPT_PAR_FECHACREA = new boolean[] {false} ;
      T001H2_A857RPT_PAR_FECHAMODIF = new java.util.Date[] {GXutil.nullDate()} ;
      T001H2_n857RPT_PAR_FECHAMODIF = new boolean[] {false} ;
      T001H2_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001H2_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001H2_A842RPT_PAR_ESTADO = new String[] {""} ;
      T001H2_n842RPT_PAR_ESTADO = new boolean[] {false} ;
      T001H2_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001H2_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001H9_A840RPT_PAR_ID = new short[1] ;
      T001H12_A843RPT_REP_ID = new short[1] ;
      T001H12_A840RPT_PAR_ID = new short[1] ;
      T001H13_A840RPT_PAR_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_parametros__default(),
         new Object[] {
             new Object[] {
            T001H2_A840RPT_PAR_ID, T001H2_A854RPT_PAR_USUARIOCREA, T001H2_n854RPT_PAR_USUARIOCREA, T001H2_A856RPT_PAR_USUARIOMODIF, T001H2_n856RPT_PAR_USUARIOMODIF, T001H2_A855RPT_PAR_FECHACREA, T001H2_n855RPT_PAR_FECHACREA, T001H2_A857RPT_PAR_FECHAMODIF, T001H2_n857RPT_PAR_FECHAMODIF, T001H2_A841RPT_PAR_DESCRIPCION,
            T001H2_n841RPT_PAR_DESCRIPCION, T001H2_A842RPT_PAR_ESTADO, T001H2_n842RPT_PAR_ESTADO, T001H2_A860RPT_PAR_NOMBREINTERNO, T001H2_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001H3_A840RPT_PAR_ID, T001H3_A854RPT_PAR_USUARIOCREA, T001H3_n854RPT_PAR_USUARIOCREA, T001H3_A856RPT_PAR_USUARIOMODIF, T001H3_n856RPT_PAR_USUARIOMODIF, T001H3_A855RPT_PAR_FECHACREA, T001H3_n855RPT_PAR_FECHACREA, T001H3_A857RPT_PAR_FECHAMODIF, T001H3_n857RPT_PAR_FECHAMODIF, T001H3_A841RPT_PAR_DESCRIPCION,
            T001H3_n841RPT_PAR_DESCRIPCION, T001H3_A842RPT_PAR_ESTADO, T001H3_n842RPT_PAR_ESTADO, T001H3_A860RPT_PAR_NOMBREINTERNO, T001H3_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001H4_A840RPT_PAR_ID, T001H4_A854RPT_PAR_USUARIOCREA, T001H4_n854RPT_PAR_USUARIOCREA, T001H4_A856RPT_PAR_USUARIOMODIF, T001H4_n856RPT_PAR_USUARIOMODIF, T001H4_A855RPT_PAR_FECHACREA, T001H4_n855RPT_PAR_FECHACREA, T001H4_A857RPT_PAR_FECHAMODIF, T001H4_n857RPT_PAR_FECHAMODIF, T001H4_A841RPT_PAR_DESCRIPCION,
            T001H4_n841RPT_PAR_DESCRIPCION, T001H4_A842RPT_PAR_ESTADO, T001H4_n842RPT_PAR_ESTADO, T001H4_A860RPT_PAR_NOMBREINTERNO, T001H4_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001H5_A840RPT_PAR_ID
            }
            , new Object[] {
            T001H6_A840RPT_PAR_ID
            }
            , new Object[] {
            T001H7_A840RPT_PAR_ID
            }
            , new Object[] {
            }
            , new Object[] {
            T001H9_A840RPT_PAR_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001H12_A843RPT_REP_ID, T001H12_A840RPT_PAR_ID
            }
            , new Object[] {
            T001H13_A840RPT_PAR_ID
            }
         }
      );
      AV13Pgmname = "RPT_PARAMETROS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV7RPT_PAR_ID ;
   private short Z840RPT_PAR_ID ;
   private short AV7RPT_PAR_ID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A840RPT_PAR_ID ;
   private short RcdFound64 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRPT_PAR_ID_Enabled ;
   private int edtRPT_PAR_DESCRIPCION_Enabled ;
   private int edtRPT_PAR_NOMBREINTERNO_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z842RPT_PAR_ESTADO ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A842RPT_PAR_ESTADO ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRPT_PAR_DESCRIPCION_Internalname ;
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
   private String edtRPT_PAR_ID_Internalname ;
   private String edtRPT_PAR_ID_Jsonclick ;
   private String edtRPT_PAR_DESCRIPCION_Jsonclick ;
   private String edtRPT_PAR_NOMBREINTERNO_Internalname ;
   private String edtRPT_PAR_NOMBREINTERNO_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode64 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z855RPT_PAR_FECHACREA ;
   private java.util.Date Z857RPT_PAR_FECHAMODIF ;
   private java.util.Date A855RPT_PAR_FECHACREA ;
   private java.util.Date A857RPT_PAR_FECHAMODIF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n842RPT_PAR_ESTADO ;
   private boolean wbErr ;
   private boolean n841RPT_PAR_DESCRIPCION ;
   private boolean n860RPT_PAR_NOMBREINTERNO ;
   private boolean n854RPT_PAR_USUARIOCREA ;
   private boolean n856RPT_PAR_USUARIOMODIF ;
   private boolean n855RPT_PAR_FECHACREA ;
   private boolean n857RPT_PAR_FECHAMODIF ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z854RPT_PAR_USUARIOCREA ;
   private String Z856RPT_PAR_USUARIOMODIF ;
   private String Z841RPT_PAR_DESCRIPCION ;
   private String Z860RPT_PAR_NOMBREINTERNO ;
   private String A841RPT_PAR_DESCRIPCION ;
   private String A860RPT_PAR_NOMBREINTERNO ;
   private String A854RPT_PAR_USUARIOCREA ;
   private String A856RPT_PAR_USUARIOMODIF ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbRPT_PAR_ESTADO ;
   private IDataStoreProvider pr_default ;
   private short[] T001H4_A840RPT_PAR_ID ;
   private String[] T001H4_A854RPT_PAR_USUARIOCREA ;
   private boolean[] T001H4_n854RPT_PAR_USUARIOCREA ;
   private String[] T001H4_A856RPT_PAR_USUARIOMODIF ;
   private boolean[] T001H4_n856RPT_PAR_USUARIOMODIF ;
   private java.util.Date[] T001H4_A855RPT_PAR_FECHACREA ;
   private boolean[] T001H4_n855RPT_PAR_FECHACREA ;
   private java.util.Date[] T001H4_A857RPT_PAR_FECHAMODIF ;
   private boolean[] T001H4_n857RPT_PAR_FECHAMODIF ;
   private String[] T001H4_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001H4_n841RPT_PAR_DESCRIPCION ;
   private String[] T001H4_A842RPT_PAR_ESTADO ;
   private boolean[] T001H4_n842RPT_PAR_ESTADO ;
   private String[] T001H4_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001H4_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001H5_A840RPT_PAR_ID ;
   private short[] T001H3_A840RPT_PAR_ID ;
   private String[] T001H3_A854RPT_PAR_USUARIOCREA ;
   private boolean[] T001H3_n854RPT_PAR_USUARIOCREA ;
   private String[] T001H3_A856RPT_PAR_USUARIOMODIF ;
   private boolean[] T001H3_n856RPT_PAR_USUARIOMODIF ;
   private java.util.Date[] T001H3_A855RPT_PAR_FECHACREA ;
   private boolean[] T001H3_n855RPT_PAR_FECHACREA ;
   private java.util.Date[] T001H3_A857RPT_PAR_FECHAMODIF ;
   private boolean[] T001H3_n857RPT_PAR_FECHAMODIF ;
   private String[] T001H3_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001H3_n841RPT_PAR_DESCRIPCION ;
   private String[] T001H3_A842RPT_PAR_ESTADO ;
   private boolean[] T001H3_n842RPT_PAR_ESTADO ;
   private String[] T001H3_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001H3_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001H6_A840RPT_PAR_ID ;
   private short[] T001H7_A840RPT_PAR_ID ;
   private short[] T001H2_A840RPT_PAR_ID ;
   private String[] T001H2_A854RPT_PAR_USUARIOCREA ;
   private boolean[] T001H2_n854RPT_PAR_USUARIOCREA ;
   private String[] T001H2_A856RPT_PAR_USUARIOMODIF ;
   private boolean[] T001H2_n856RPT_PAR_USUARIOMODIF ;
   private java.util.Date[] T001H2_A855RPT_PAR_FECHACREA ;
   private boolean[] T001H2_n855RPT_PAR_FECHACREA ;
   private java.util.Date[] T001H2_A857RPT_PAR_FECHAMODIF ;
   private boolean[] T001H2_n857RPT_PAR_FECHAMODIF ;
   private String[] T001H2_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001H2_n841RPT_PAR_DESCRIPCION ;
   private String[] T001H2_A842RPT_PAR_ESTADO ;
   private boolean[] T001H2_n842RPT_PAR_ESTADO ;
   private String[] T001H2_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001H2_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001H9_A840RPT_PAR_ID ;
   private short[] T001H12_A843RPT_REP_ID ;
   private short[] T001H12_A840RPT_PAR_ID ;
   private short[] T001H13_A840RPT_PAR_ID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class rpt_parametros__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001H2", "SELECT RPT_PAR_ID, RPT_PAR_USUARIOCREA, RPT_PAR_USUARIOMODIF, RPT_PAR_FECHACREA, RPT_PAR_FECHAMODIF, RPT_PAR_DESCRIPCION, RPT_PAR_ESTADO, RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ?  FOR UPDATE OF RPT_PAR_USUARIOCREA, RPT_PAR_USUARIOMODIF, RPT_PAR_FECHACREA, RPT_PAR_FECHAMODIF, RPT_PAR_DESCRIPCION, RPT_PAR_ESTADO, RPT_PAR_NOMBREINTERNO NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H3", "SELECT RPT_PAR_ID, RPT_PAR_USUARIOCREA, RPT_PAR_USUARIOMODIF, RPT_PAR_FECHACREA, RPT_PAR_FECHAMODIF, RPT_PAR_DESCRIPCION, RPT_PAR_ESTADO, RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H4", "SELECT /*+ FIRST_ROWS(100) */ TM1.RPT_PAR_ID, TM1.RPT_PAR_USUARIOCREA, TM1.RPT_PAR_USUARIOMODIF, TM1.RPT_PAR_FECHACREA, TM1.RPT_PAR_FECHAMODIF, TM1.RPT_PAR_DESCRIPCION, TM1.RPT_PAR_ESTADO, TM1.RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS TM1 WHERE TM1.RPT_PAR_ID = ? ORDER BY TM1.RPT_PAR_ID ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001H5", "SELECT /*+ FIRST_ROWS(1) */ RPT_PAR_ID FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RPT_PAR_ID FROM RPT_PARAMETROS WHERE ( RPT_PAR_ID > ?) ORDER BY RPT_PAR_ID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001H7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RPT_PAR_ID FROM RPT_PARAMETROS WHERE ( RPT_PAR_ID < ?) ORDER BY RPT_PAR_ID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001H8", "INSERT INTO RPT_PARAMETROS(RPT_PAR_USUARIOCREA, RPT_PAR_USUARIOMODIF, RPT_PAR_FECHACREA, RPT_PAR_FECHAMODIF, RPT_PAR_DESCRIPCION, RPT_PAR_ESTADO, RPT_PAR_NOMBREINTERNO) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "RPT_PARAMETROS")
         ,new ForEachCursor("T001H9", "SELECT RPT_PAR_ID.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001H10", "UPDATE RPT_PARAMETROS SET RPT_PAR_USUARIOCREA=?, RPT_PAR_USUARIOMODIF=?, RPT_PAR_FECHACREA=?, RPT_PAR_FECHAMODIF=?, RPT_PAR_DESCRIPCION=?, RPT_PAR_ESTADO=?, RPT_PAR_NOMBREINTERNO=?  WHERE RPT_PAR_ID = ?", GX_NOMASK, "RPT_PARAMETROS")
         ,new UpdateCursor("T001H11", "DELETE FROM RPT_PARAMETROS  WHERE RPT_PAR_ID = ?", GX_NOMASK, "RPT_PARAMETROS")
         ,new ForEachCursor("T001H12", "SELECT * FROM (SELECT RPT_REP_ID, RPT_PAR_ID FROM RPT_REP_PARM WHERE RPT_PAR_ID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001H13", "SELECT /*+ FIRST_ROWS(100) */ RPT_PAR_ID FROM RPT_PARAMETROS ORDER BY RPT_PAR_ID ",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 11 :
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 50);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 50);
               }
               stmt.setShort(8, ((Number) parms[14]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

