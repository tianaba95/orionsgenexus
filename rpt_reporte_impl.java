/*
               File: rpt_reporte_impl
        Description: REPORTES
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:37.81
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

public final  class rpt_reporte_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A840RPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A840RPT_PAR_ID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridrpt_reporte_rpt_rep_parm") == 0 )
      {
         nRC_GXsfl_58 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_58_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_58_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridrpt_reporte_rpt_rep_parm_newrow( ) ;
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
            AV7RPT_REP_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7RPT_REP_ID", GXutil.ltrim( GXutil.str( AV7RPT_REP_ID, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RPT_REP_ID), "ZZZ9")));
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
      cmbRPT_REP_FORMATO.setName( "RPT_REP_FORMATO" );
      cmbRPT_REP_FORMATO.setWebtags( "" );
      cmbRPT_REP_FORMATO.addItem("EXC", "EXCEL", (short)(0));
      cmbRPT_REP_FORMATO.addItem("PDF", "PDF", (short)(0));
      if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
      {
         A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
         n846RPT_REP_FORMATO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
      }
      cmbRPT_REP_ESTADO.setName( "RPT_REP_ESTADO" );
      cmbRPT_REP_ESTADO.setWebtags( "" );
      cmbRPT_REP_ESTADO.addItem("", "SELECCIONAR", (short)(0));
      cmbRPT_REP_ESTADO.addItem("A", "Activo", (short)(0));
      cmbRPT_REP_ESTADO.addItem("I", "Inactivo", (short)(0));
      if ( cmbRPT_REP_ESTADO.getItemCount() > 0 )
      {
         A851RPT_REP_ESTADO = cmbRPT_REP_ESTADO.getValidValue(A851RPT_REP_ESTADO) ;
         n851RPT_REP_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
      }
      GXCCtl = "RPT_REP_PARM_ESTADO_" + sGXsfl_58_idx ;
      cmbRPT_REP_PARM_ESTADO.setName( GXCCtl );
      cmbRPT_REP_PARM_ESTADO.setWebtags( "" );
      cmbRPT_REP_PARM_ESTADO.addItem("A", "Activo", (short)(0));
      cmbRPT_REP_PARM_ESTADO.addItem("I", "Inactivo", (short)(0));
      if ( cmbRPT_REP_PARM_ESTADO.getItemCount() > 0 )
      {
         A853RPT_REP_PARM_ESTADO = cmbRPT_REP_PARM_ESTADO.getValidValue(A853RPT_REP_PARM_ESTADO) ;
         n853RPT_REP_PARM_ESTADO = false ;
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
         Form.getMeta().addItem("description", "REPORTES", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public rpt_reporte_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rpt_reporte_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_reporte_impl.class ));
   }

   public rpt_reporte_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbRPT_REP_FORMATO = new HTMLChoice();
      cmbRPT_REP_ESTADO = new HTMLChoice();
      cmbRPT_REP_PARM_ESTADO = new HTMLChoice();
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
      if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
      {
         A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
         n846RPT_REP_FORMATO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
      }
      if ( cmbRPT_REP_ESTADO.getItemCount() > 0 )
      {
         A851RPT_REP_ESTADO = cmbRPT_REP_ESTADO.getValidValue(A851RPT_REP_ESTADO) ;
         n851RPT_REP_ESTADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Reportes", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RPT_REPORTE.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_RPT_REPORTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_ID_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")), ((edtRPT_REP_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_REP_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_REPORTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_NOMBRE_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_NOMBRE_Internalname, A844RPT_REP_NOMBRE, GXutil.rtrim( localUtil.format( A844RPT_REP_NOMBRE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_NOMBRE_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_REP_NOMBRE_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_RPT_REPORTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRPT_REP_DESCRIPCION_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRPT_REP_DESCRIPCION_Internalname, A845RPT_REP_DESCRIPCION, GXutil.rtrim( localUtil.format( A845RPT_REP_DESCRIPCION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRPT_REP_DESCRIPCION_Jsonclick, 0, "Attribute", "", "", "", 1, edtRPT_REP_DESCRIPCION_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_RPT_REPORTE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_REP_FORMATO.getInternalname(), "Formato", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_REP_FORMATO, cmbRPT_REP_FORMATO.getInternalname(), GXutil.rtrim( A846RPT_REP_FORMATO), 1, cmbRPT_REP_FORMATO.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbRPT_REP_FORMATO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_RPT_REPORTE.htm");
         cmbRPT_REP_FORMATO.setValue( GXutil.rtrim( A846RPT_REP_FORMATO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_FORMATO.getInternalname(), "Values", cmbRPT_REP_FORMATO.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRPT_REP_ESTADO.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRPT_REP_ESTADO, cmbRPT_REP_ESTADO.getInternalname(), GXutil.rtrim( A851RPT_REP_ESTADO), 1, cmbRPT_REP_ESTADO.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbRPT_REP_ESTADO.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", true, "HLP_RPT_REPORTE.htm");
         cmbRPT_REP_ESTADO.setValue( GXutil.rtrim( A851RPT_REP_ESTADO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_ESTADO.getInternalname(), "Values", cmbRPT_REP_ESTADO.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_parmtable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitlerpt_rep_parm_Internalname, "Parámetros", "", "", lblTitlerpt_rep_parm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridrpt_reporte_rpt_rep_parm( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_REPORTE.htm");
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

   public void gxdraw_gridrpt_reporte_rpt_rep_parm( )
   {
      /*  Grid Control  */
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("GridName", "Gridrpt_reporte_rpt_rep_parm");
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Class", "WorkWith");
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("CmpContext", "");
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("InMasterPage", "false");
      Gridrpt_reporte_rpt_rep_parmColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddColumnProperties(Gridrpt_reporte_rpt_rep_parmColumn);
      Gridrpt_reporte_rpt_rep_parmColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridrpt_reporte_rpt_rep_parmContainer.AddColumnProperties(Gridrpt_reporte_rpt_rep_parmColumn);
      Gridrpt_reporte_rpt_rep_parmColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Value", A841RPT_PAR_DESCRIPCION);
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_DESCRIPCION_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddColumnProperties(Gridrpt_reporte_rpt_rep_parmColumn);
      Gridrpt_reporte_rpt_rep_parmColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Value", GXutil.rtrim( A853RPT_REP_PARM_ESTADO));
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbRPT_REP_PARM_ESTADO.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddColumnProperties(Gridrpt_reporte_rpt_rep_parmColumn);
      Gridrpt_reporte_rpt_rep_parmColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_REP_PARM_ORDEN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddColumnProperties(Gridrpt_reporte_rpt_rep_parmColumn);
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridrpt_reporte_rpt_rep_parmContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridrpt_reporte_rpt_rep_parm_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_58_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount66 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_66 = (short)(1) ;
            scanStart1I66( ) ;
            while ( RcdFound66 != 0 )
            {
               init_level_properties66( ) ;
               getByPrimaryKey1I66( ) ;
               addRow1I66( ) ;
               scanNext1I66( ) ;
            }
            scanEnd1I66( ) ;
            nBlankRcdCount66 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1I66( ) ;
         standaloneModal1I66( ) ;
         sMode66 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRow1I66( ) ;
            edtRPT_PAR_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_PAR_ID_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
            edtRPT_PAR_DESCRIPCION_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_DESCRIPCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_DESCRIPCION_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
            cmbRPT_REP_PARM_ESTADO.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_PARM_ESTADO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRPT_REP_PARM_ESTADO.getEnabled(), 5, 0)), !bGXsfl_58_Refreshing);
            edtRPT_REP_PARM_ORDEN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_PARM_ORDEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_PARM_ORDEN_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
            imgprompt_840_Link = httpContext.cgiGet( "PROMPT_840_"+sGXsfl_58_idx+"Link") ;
            if ( ( nRcdExists_66 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal1I66( ) ;
            }
            sendRow1I66( ) ;
            bGXsfl_58_Refreshing = false ;
         }
         Gx_mode = sMode66 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount66 = (short)(5) ;
         nRcdExists_66 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart1I66( ) ;
            while ( RcdFound66 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_5866( ) ;
               init_level_properties66( ) ;
               standaloneNotModal1I66( ) ;
               getByPrimaryKey1I66( ) ;
               standaloneModal1I66( ) ;
               addRow1I66( ) ;
               scanNext1I66( ) ;
            }
            scanEnd1I66( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode66 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5866( ) ;
         initAll1I66( ) ;
         init_level_properties66( ) ;
         standaloneNotModal1I66( ) ;
         standaloneModal1I66( ) ;
         nRcdExists_66 = (short)(0) ;
         nIsMod_66 = (short)(0) ;
         nRcdDeleted_66 = (short)(0) ;
         nBlankRcdCount66 = (short)(nBlankRcdUsr66+nBlankRcdCount66) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount66 > 0 )
         {
            addRow1I66( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtRPT_PAR_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount66 = (short)(nBlankRcdCount66-1) ;
         }
         Gx_mode = sMode66 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridrpt_reporte_rpt_rep_parmContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridrpt_reporte_rpt_rep_parm", Gridrpt_reporte_rpt_rep_parmContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridrpt_reporte_rpt_rep_parmContainerData", Gridrpt_reporte_rpt_rep_parmContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridrpt_reporte_rpt_rep_parmContainerData"+"V", Gridrpt_reporte_rpt_rep_parmContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridrpt_reporte_rpt_rep_parmContainerData"+"V"+"\" value='"+Gridrpt_reporte_rpt_rep_parmContainer.GridValuesHidden()+"'/>") ;
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
      e111I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_REP_ID_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
            A844RPT_REP_NOMBRE = httpContext.cgiGet( edtRPT_REP_NOMBRE_Internalname) ;
            n844RPT_REP_NOMBRE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
            n844RPT_REP_NOMBRE = ((GXutil.strcmp("", A844RPT_REP_NOMBRE)==0) ? true : false) ;
            A845RPT_REP_DESCRIPCION = httpContext.cgiGet( edtRPT_REP_DESCRIPCION_Internalname) ;
            n845RPT_REP_DESCRIPCION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
            n845RPT_REP_DESCRIPCION = ((GXutil.strcmp("", A845RPT_REP_DESCRIPCION)==0) ? true : false) ;
            cmbRPT_REP_FORMATO.setName( cmbRPT_REP_FORMATO.getInternalname() );
            cmbRPT_REP_FORMATO.setValue( httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) );
            A846RPT_REP_FORMATO = httpContext.cgiGet( cmbRPT_REP_FORMATO.getInternalname()) ;
            n846RPT_REP_FORMATO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
            n846RPT_REP_FORMATO = ((GXutil.strcmp("", A846RPT_REP_FORMATO)==0) ? true : false) ;
            cmbRPT_REP_ESTADO.setName( cmbRPT_REP_ESTADO.getInternalname() );
            cmbRPT_REP_ESTADO.setValue( httpContext.cgiGet( cmbRPT_REP_ESTADO.getInternalname()) );
            A851RPT_REP_ESTADO = httpContext.cgiGet( cmbRPT_REP_ESTADO.getInternalname()) ;
            n851RPT_REP_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
            n851RPT_REP_ESTADO = ((GXutil.strcmp("", A851RPT_REP_ESTADO)==0) ? true : false) ;
            /* Read saved values. */
            Z843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z843RPT_REP_ID"), ",", ".")) ;
            Z848RPT_REP_USUARIO_CREACION = httpContext.cgiGet( "Z848RPT_REP_USUARIO_CREACION") ;
            n848RPT_REP_USUARIO_CREACION = ((GXutil.strcmp("", A848RPT_REP_USUARIO_CREACION)==0) ? true : false) ;
            Z850RPT_REP_USUARIO_MODIFICA = httpContext.cgiGet( "Z850RPT_REP_USUARIO_MODIFICA") ;
            n850RPT_REP_USUARIO_MODIFICA = ((GXutil.strcmp("", A850RPT_REP_USUARIO_MODIFICA)==0) ? true : false) ;
            Z847RPT_REP_FECHA_CREACION = localUtil.ctot( httpContext.cgiGet( "Z847RPT_REP_FECHA_CREACION"), 0) ;
            n847RPT_REP_FECHA_CREACION = (GXutil.dateCompare(GXutil.nullDate(), A847RPT_REP_FECHA_CREACION) ? true : false) ;
            Z849RPT_REP_FECHA_MODIFICA = localUtil.ctot( httpContext.cgiGet( "Z849RPT_REP_FECHA_MODIFICA"), 0) ;
            n849RPT_REP_FECHA_MODIFICA = (GXutil.dateCompare(GXutil.nullDate(), A849RPT_REP_FECHA_MODIFICA) ? true : false) ;
            Z844RPT_REP_NOMBRE = httpContext.cgiGet( "Z844RPT_REP_NOMBRE") ;
            n844RPT_REP_NOMBRE = ((GXutil.strcmp("", A844RPT_REP_NOMBRE)==0) ? true : false) ;
            Z845RPT_REP_DESCRIPCION = httpContext.cgiGet( "Z845RPT_REP_DESCRIPCION") ;
            n845RPT_REP_DESCRIPCION = ((GXutil.strcmp("", A845RPT_REP_DESCRIPCION)==0) ? true : false) ;
            Z846RPT_REP_FORMATO = httpContext.cgiGet( "Z846RPT_REP_FORMATO") ;
            n846RPT_REP_FORMATO = ((GXutil.strcmp("", A846RPT_REP_FORMATO)==0) ? true : false) ;
            Z851RPT_REP_ESTADO = httpContext.cgiGet( "Z851RPT_REP_ESTADO") ;
            n851RPT_REP_ESTADO = ((GXutil.strcmp("", A851RPT_REP_ESTADO)==0) ? true : false) ;
            A848RPT_REP_USUARIO_CREACION = httpContext.cgiGet( "Z848RPT_REP_USUARIO_CREACION") ;
            n848RPT_REP_USUARIO_CREACION = false ;
            n848RPT_REP_USUARIO_CREACION = ((GXutil.strcmp("", A848RPT_REP_USUARIO_CREACION)==0) ? true : false) ;
            A850RPT_REP_USUARIO_MODIFICA = httpContext.cgiGet( "Z850RPT_REP_USUARIO_MODIFICA") ;
            n850RPT_REP_USUARIO_MODIFICA = false ;
            n850RPT_REP_USUARIO_MODIFICA = ((GXutil.strcmp("", A850RPT_REP_USUARIO_MODIFICA)==0) ? true : false) ;
            A847RPT_REP_FECHA_CREACION = localUtil.ctot( httpContext.cgiGet( "Z847RPT_REP_FECHA_CREACION"), 0) ;
            n847RPT_REP_FECHA_CREACION = false ;
            n847RPT_REP_FECHA_CREACION = (GXutil.dateCompare(GXutil.nullDate(), A847RPT_REP_FECHA_CREACION) ? true : false) ;
            A849RPT_REP_FECHA_MODIFICA = localUtil.ctot( httpContext.cgiGet( "Z849RPT_REP_FECHA_MODIFICA"), 0) ;
            n849RPT_REP_FECHA_MODIFICA = false ;
            n849RPT_REP_FECHA_MODIFICA = (GXutil.dateCompare(GXutil.nullDate(), A849RPT_REP_FECHA_MODIFICA) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_58 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), ",", ".")) ;
            AV7RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vRPT_REP_ID"), ",", ".")) ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A848RPT_REP_USUARIO_CREACION = httpContext.cgiGet( "RPT_REP_USUARIO_CREACION") ;
            n848RPT_REP_USUARIO_CREACION = ((GXutil.strcmp("", A848RPT_REP_USUARIO_CREACION)==0) ? true : false) ;
            A850RPT_REP_USUARIO_MODIFICA = httpContext.cgiGet( "RPT_REP_USUARIO_MODIFICA") ;
            n850RPT_REP_USUARIO_MODIFICA = ((GXutil.strcmp("", A850RPT_REP_USUARIO_MODIFICA)==0) ? true : false) ;
            A847RPT_REP_FECHA_CREACION = localUtil.ctot( httpContext.cgiGet( "RPT_REP_FECHA_CREACION"), 0) ;
            n847RPT_REP_FECHA_CREACION = (GXutil.dateCompare(GXutil.nullDate(), A847RPT_REP_FECHA_CREACION) ? true : false) ;
            A849RPT_REP_FECHA_MODIFICA = localUtil.ctot( httpContext.cgiGet( "RPT_REP_FECHA_MODIFICA"), 0) ;
            n849RPT_REP_FECHA_MODIFICA = (GXutil.dateCompare(GXutil.nullDate(), A849RPT_REP_FECHA_MODIFICA) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A860RPT_PAR_NOMBREINTERNO = httpContext.cgiGet( "RPT_PAR_NOMBREINTERNO") ;
            n860RPT_PAR_NOMBREINTERNO = false ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "RPT_REPORTE" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A843RPT_REP_ID != Z843RPT_REP_ID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("rpt_reporte:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A843RPT_REP_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
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
                  sMode65 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode65 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound65 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_1I0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "RPT_REP_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRPT_REP_ID_Internalname ;
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
                        e111I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121I2 ();
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
         e121I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1I65( ) ;
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
         disableAttributes1I65( ) ;
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

   public void confirm_1I0( )
   {
      beforeValidate1I65( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1I65( ) ;
         }
         else
         {
            checkExtendedTable1I65( ) ;
            closeExtendedTableCursors1I65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_1I66( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_1I66( )
   {
      nGXsfl_58_idx = (short)(0) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow1I66( ) ;
         if ( ( nRcdExists_66 != 0 ) || ( nIsMod_66 != 0 ) )
         {
            getKey1I66( ) ;
            if ( ( nRcdExists_66 == 0 ) && ( nRcdDeleted_66 == 0 ) )
            {
               if ( RcdFound66 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate1I66( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1I66( ) ;
                     closeExtendedTableCursors1I66( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRPT_PAR_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound66 != 0 )
               {
                  if ( nRcdDeleted_66 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey1I66( ) ;
                     load1I66( ) ;
                     beforeValidate1I66( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1I66( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_66 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate1I66( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1I66( ) ;
                           closeExtendedTableCursors1I66( ) ;
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
                  if ( nRcdDeleted_66 == 0 )
                  {
                     GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRPT_PAR_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRPT_PAR_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRPT_PAR_DESCRIPCION_Internalname, A841RPT_PAR_DESCRIPCION) ;
         httpContext.changePostValue( cmbRPT_REP_PARM_ESTADO.getInternalname(), GXutil.rtrim( A853RPT_REP_PARM_ESTADO)) ;
         httpContext.changePostValue( edtRPT_REP_PARM_ORDEN_Internalname, GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z840RPT_PAR_ID_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z840RPT_PAR_ID, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z852RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z853RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx, GXutil.rtrim( Z853RPT_REP_PARM_ESTADO)) ;
         httpContext.changePostValue( "nRcdDeleted_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_66, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_66, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_66, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_66 != 0 )
         {
            httpContext.changePostValue( "RPT_PAR_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_DESCRIPCION_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbRPT_REP_PARM_ESTADO.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_REP_PARM_ORDEN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1I0( )
   {
   }

   public void e111I2( )
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

   public void e121I2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwrpt_reporte") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1I65( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z848RPT_REP_USUARIO_CREACION = T001I6_A848RPT_REP_USUARIO_CREACION[0] ;
            Z850RPT_REP_USUARIO_MODIFICA = T001I6_A850RPT_REP_USUARIO_MODIFICA[0] ;
            Z847RPT_REP_FECHA_CREACION = T001I6_A847RPT_REP_FECHA_CREACION[0] ;
            Z849RPT_REP_FECHA_MODIFICA = T001I6_A849RPT_REP_FECHA_MODIFICA[0] ;
            Z844RPT_REP_NOMBRE = T001I6_A844RPT_REP_NOMBRE[0] ;
            Z845RPT_REP_DESCRIPCION = T001I6_A845RPT_REP_DESCRIPCION[0] ;
            Z846RPT_REP_FORMATO = T001I6_A846RPT_REP_FORMATO[0] ;
            Z851RPT_REP_ESTADO = T001I6_A851RPT_REP_ESTADO[0] ;
         }
         else
         {
            Z848RPT_REP_USUARIO_CREACION = A848RPT_REP_USUARIO_CREACION ;
            Z850RPT_REP_USUARIO_MODIFICA = A850RPT_REP_USUARIO_MODIFICA ;
            Z847RPT_REP_FECHA_CREACION = A847RPT_REP_FECHA_CREACION ;
            Z849RPT_REP_FECHA_MODIFICA = A849RPT_REP_FECHA_MODIFICA ;
            Z844RPT_REP_NOMBRE = A844RPT_REP_NOMBRE ;
            Z845RPT_REP_DESCRIPCION = A845RPT_REP_DESCRIPCION ;
            Z846RPT_REP_FORMATO = A846RPT_REP_FORMATO ;
            Z851RPT_REP_ESTADO = A851RPT_REP_ESTADO ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z843RPT_REP_ID = A843RPT_REP_ID ;
         Z848RPT_REP_USUARIO_CREACION = A848RPT_REP_USUARIO_CREACION ;
         Z850RPT_REP_USUARIO_MODIFICA = A850RPT_REP_USUARIO_MODIFICA ;
         Z847RPT_REP_FECHA_CREACION = A847RPT_REP_FECHA_CREACION ;
         Z849RPT_REP_FECHA_MODIFICA = A849RPT_REP_FECHA_MODIFICA ;
         Z844RPT_REP_NOMBRE = A844RPT_REP_NOMBRE ;
         Z845RPT_REP_DESCRIPCION = A845RPT_REP_DESCRIPCION ;
         Z846RPT_REP_FORMATO = A846RPT_REP_FORMATO ;
         Z851RPT_REP_ESTADO = A851RPT_REP_ESTADO ;
      }
   }

   public void standaloneNotModal( )
   {
      edtRPT_REP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_ID_Enabled, 5, 0)), true);
      edtRPT_REP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_ID_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7RPT_REP_ID) )
      {
         A843RPT_REP_ID = AV7RPT_REP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
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

   public void load1I65( )
   {
      /* Using cursor T001I7 */
      pr_default.execute(5, new Object[] {new Short(A843RPT_REP_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A848RPT_REP_USUARIO_CREACION = T001I7_A848RPT_REP_USUARIO_CREACION[0] ;
         n848RPT_REP_USUARIO_CREACION = T001I7_n848RPT_REP_USUARIO_CREACION[0] ;
         A850RPT_REP_USUARIO_MODIFICA = T001I7_A850RPT_REP_USUARIO_MODIFICA[0] ;
         n850RPT_REP_USUARIO_MODIFICA = T001I7_n850RPT_REP_USUARIO_MODIFICA[0] ;
         A847RPT_REP_FECHA_CREACION = T001I7_A847RPT_REP_FECHA_CREACION[0] ;
         n847RPT_REP_FECHA_CREACION = T001I7_n847RPT_REP_FECHA_CREACION[0] ;
         A849RPT_REP_FECHA_MODIFICA = T001I7_A849RPT_REP_FECHA_MODIFICA[0] ;
         n849RPT_REP_FECHA_MODIFICA = T001I7_n849RPT_REP_FECHA_MODIFICA[0] ;
         A844RPT_REP_NOMBRE = T001I7_A844RPT_REP_NOMBRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
         n844RPT_REP_NOMBRE = T001I7_n844RPT_REP_NOMBRE[0] ;
         A845RPT_REP_DESCRIPCION = T001I7_A845RPT_REP_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
         n845RPT_REP_DESCRIPCION = T001I7_n845RPT_REP_DESCRIPCION[0] ;
         A846RPT_REP_FORMATO = T001I7_A846RPT_REP_FORMATO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
         n846RPT_REP_FORMATO = T001I7_n846RPT_REP_FORMATO[0] ;
         A851RPT_REP_ESTADO = T001I7_A851RPT_REP_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
         n851RPT_REP_ESTADO = T001I7_n851RPT_REP_ESTADO[0] ;
         zm1I65( -7) ;
      }
      pr_default.close(5);
      onLoadActions1I65( ) ;
   }

   public void onLoadActions1I65( )
   {
      AV13Pgmname = "RPT_REPORTE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1I65( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "RPT_REPORTE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1I65( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1I65( )
   {
      /* Using cursor T001I8 */
      pr_default.execute(6, new Object[] {new Short(A843RPT_REP_ID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001I6 */
      pr_default.execute(4, new Object[] {new Short(A843RPT_REP_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1I65( 7) ;
         RcdFound65 = (short)(1) ;
         A843RPT_REP_ID = T001I6_A843RPT_REP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
         A848RPT_REP_USUARIO_CREACION = T001I6_A848RPT_REP_USUARIO_CREACION[0] ;
         n848RPT_REP_USUARIO_CREACION = T001I6_n848RPT_REP_USUARIO_CREACION[0] ;
         A850RPT_REP_USUARIO_MODIFICA = T001I6_A850RPT_REP_USUARIO_MODIFICA[0] ;
         n850RPT_REP_USUARIO_MODIFICA = T001I6_n850RPT_REP_USUARIO_MODIFICA[0] ;
         A847RPT_REP_FECHA_CREACION = T001I6_A847RPT_REP_FECHA_CREACION[0] ;
         n847RPT_REP_FECHA_CREACION = T001I6_n847RPT_REP_FECHA_CREACION[0] ;
         A849RPT_REP_FECHA_MODIFICA = T001I6_A849RPT_REP_FECHA_MODIFICA[0] ;
         n849RPT_REP_FECHA_MODIFICA = T001I6_n849RPT_REP_FECHA_MODIFICA[0] ;
         A844RPT_REP_NOMBRE = T001I6_A844RPT_REP_NOMBRE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
         n844RPT_REP_NOMBRE = T001I6_n844RPT_REP_NOMBRE[0] ;
         A845RPT_REP_DESCRIPCION = T001I6_A845RPT_REP_DESCRIPCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
         n845RPT_REP_DESCRIPCION = T001I6_n845RPT_REP_DESCRIPCION[0] ;
         A846RPT_REP_FORMATO = T001I6_A846RPT_REP_FORMATO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
         n846RPT_REP_FORMATO = T001I6_n846RPT_REP_FORMATO[0] ;
         A851RPT_REP_ESTADO = T001I6_A851RPT_REP_ESTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
         n851RPT_REP_ESTADO = T001I6_n851RPT_REP_ESTADO[0] ;
         Z843RPT_REP_ID = A843RPT_REP_ID ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1I65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1I65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1I65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1I65( ) ;
      if ( RcdFound65 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T001I9 */
      pr_default.execute(7, new Object[] {new Short(A843RPT_REP_ID)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T001I9_A843RPT_REP_ID[0] < A843RPT_REP_ID ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T001I9_A843RPT_REP_ID[0] > A843RPT_REP_ID ) ) )
         {
            A843RPT_REP_ID = T001I9_A843RPT_REP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T001I10 */
      pr_default.execute(8, new Object[] {new Short(A843RPT_REP_ID)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T001I10_A843RPT_REP_ID[0] > A843RPT_REP_ID ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T001I10_A843RPT_REP_ID[0] < A843RPT_REP_ID ) ) )
         {
            A843RPT_REP_ID = T001I10_A843RPT_REP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1I65( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1I65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( A843RPT_REP_ID != Z843RPT_REP_ID )
            {
               A843RPT_REP_ID = Z843RPT_REP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RPT_REP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRPT_REP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1I65( ) ;
               GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A843RPT_REP_ID != Z843RPT_REP_ID )
            {
               /* Insert record */
               GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1I65( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RPT_REP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRPT_REP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1I65( ) ;
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
      if ( A843RPT_REP_ID != Z843RPT_REP_ID )
      {
         A843RPT_REP_ID = Z843RPT_REP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RPT_REP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_REP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRPT_REP_NOMBRE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1I65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001I5 */
         pr_default.execute(3, new Object[] {new Short(A843RPT_REP_ID)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_REPORTE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z848RPT_REP_USUARIO_CREACION, T001I5_A848RPT_REP_USUARIO_CREACION[0]) != 0 ) || ( GXutil.strcmp(Z850RPT_REP_USUARIO_MODIFICA, T001I5_A850RPT_REP_USUARIO_MODIFICA[0]) != 0 ) || !( GXutil.dateCompare(Z847RPT_REP_FECHA_CREACION, T001I5_A847RPT_REP_FECHA_CREACION[0]) ) || !( GXutil.dateCompare(Z849RPT_REP_FECHA_MODIFICA, T001I5_A849RPT_REP_FECHA_MODIFICA[0]) ) || ( GXutil.strcmp(Z844RPT_REP_NOMBRE, T001I5_A844RPT_REP_NOMBRE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z845RPT_REP_DESCRIPCION, T001I5_A845RPT_REP_DESCRIPCION[0]) != 0 ) || ( GXutil.strcmp(Z846RPT_REP_FORMATO, T001I5_A846RPT_REP_FORMATO[0]) != 0 ) || ( GXutil.strcmp(Z851RPT_REP_ESTADO, T001I5_A851RPT_REP_ESTADO[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"RPT_REPORTE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I65( )
   {
      beforeValidate1I65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I65( 0) ;
         checkOptimisticConcurrency1I65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I11 */
                  pr_default.execute(9, new Object[] {new Boolean(n848RPT_REP_USUARIO_CREACION), A848RPT_REP_USUARIO_CREACION, new Boolean(n850RPT_REP_USUARIO_MODIFICA), A850RPT_REP_USUARIO_MODIFICA, new Boolean(n847RPT_REP_FECHA_CREACION), A847RPT_REP_FECHA_CREACION, new Boolean(n849RPT_REP_FECHA_MODIFICA), A849RPT_REP_FECHA_MODIFICA, new Boolean(n844RPT_REP_NOMBRE), A844RPT_REP_NOMBRE, new Boolean(n845RPT_REP_DESCRIPCION), A845RPT_REP_DESCRIPCION, new Boolean(n846RPT_REP_FORMATO), A846RPT_REP_FORMATO, new Boolean(n851RPT_REP_ESTADO), A851RPT_REP_ESTADO});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001I12 */
                  pr_default.execute(10);
                  A843RPT_REP_ID = T001I12_A843RPT_REP_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
                  pr_default.close(10);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REPORTE") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1I65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption1I0( ) ;
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
            load1I65( ) ;
         }
         endLevel1I65( ) ;
      }
      closeExtendedTableCursors1I65( ) ;
   }

   public void update1I65( )
   {
      beforeValidate1I65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1I65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I13 */
                  pr_default.execute(11, new Object[] {new Boolean(n848RPT_REP_USUARIO_CREACION), A848RPT_REP_USUARIO_CREACION, new Boolean(n850RPT_REP_USUARIO_MODIFICA), A850RPT_REP_USUARIO_MODIFICA, new Boolean(n847RPT_REP_FECHA_CREACION), A847RPT_REP_FECHA_CREACION, new Boolean(n849RPT_REP_FECHA_MODIFICA), A849RPT_REP_FECHA_MODIFICA, new Boolean(n844RPT_REP_NOMBRE), A844RPT_REP_NOMBRE, new Boolean(n845RPT_REP_DESCRIPCION), A845RPT_REP_DESCRIPCION, new Boolean(n846RPT_REP_FORMATO), A846RPT_REP_FORMATO, new Boolean(n851RPT_REP_ESTADO), A851RPT_REP_ESTADO, new Short(A843RPT_REP_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REPORTE") ;
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_REPORTE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1I65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1I65( ) ;
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
         endLevel1I65( ) ;
      }
      closeExtendedTableCursors1I65( ) ;
   }

   public void deferredUpdate1I65( )
   {
   }

   public void delete( )
   {
      beforeValidate1I65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I65( ) ;
         afterConfirm1I65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I65( ) ;
            if ( AnyError == 0 )
            {
               scanStart1I66( ) ;
               while ( RcdFound66 != 0 )
               {
                  getByPrimaryKey1I66( ) ;
                  delete1I66( ) ;
                  scanNext1I66( ) ;
               }
               scanEnd1I66( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I14 */
                  pr_default.execute(12, new Object[] {new Short(A843RPT_REP_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REPORTE") ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1I65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1I65( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "RPT_REPORTE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
   }

   public void processNestedLevel1I66( )
   {
      nGXsfl_58_idx = (short)(0) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow1I66( ) ;
         if ( ( nRcdExists_66 != 0 ) || ( nIsMod_66 != 0 ) )
         {
            standaloneNotModal1I66( ) ;
            getKey1I66( ) ;
            if ( ( nRcdExists_66 == 0 ) && ( nRcdDeleted_66 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert1I66( ) ;
            }
            else
            {
               if ( RcdFound66 != 0 )
               {
                  if ( ( nRcdDeleted_66 != 0 ) && ( nRcdExists_66 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete1I66( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_66 != 0 ) && ( nRcdExists_66 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update1I66( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_66 == 0 )
                  {
                     GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRPT_PAR_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRPT_PAR_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRPT_PAR_DESCRIPCION_Internalname, A841RPT_PAR_DESCRIPCION) ;
         httpContext.changePostValue( cmbRPT_REP_PARM_ESTADO.getInternalname(), GXutil.rtrim( A853RPT_REP_PARM_ESTADO)) ;
         httpContext.changePostValue( edtRPT_REP_PARM_ORDEN_Internalname, GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z840RPT_PAR_ID_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z840RPT_PAR_ID, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z852RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z853RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx, GXutil.rtrim( Z853RPT_REP_PARM_ESTADO)) ;
         httpContext.changePostValue( "nRcdDeleted_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_66, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_66, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_66_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_66, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_66 != 0 )
         {
            httpContext.changePostValue( "RPT_PAR_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_DESCRIPCION_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbRPT_REP_PARM_ESTADO.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_REP_PARM_ORDEN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1I66( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_66 = (short)(0) ;
      nIsMod_66 = (short)(0) ;
      nRcdDeleted_66 = (short)(0) ;
   }

   public void processLevel1I65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel1I66( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel1I65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1I65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "rpt_reporte");
         if ( AnyError == 0 )
         {
            confirmValues1I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "rpt_reporte");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1I65( )
   {
      /* Scan By routine */
      /* Using cursor T001I15 */
      pr_default.execute(13);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A843RPT_REP_ID = T001I15_A843RPT_REP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1I65( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A843RPT_REP_ID = T001I15_A843RPT_REP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
      }
   }

   public void scanEnd1I65( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1I65( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A847RPT_REP_FECHA_CREACION = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n847RPT_REP_FECHA_CREACION = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A847RPT_REP_FECHA_CREACION", localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A849RPT_REP_FECHA_MODIFICA = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n849RPT_REP_FECHA_MODIFICA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A849RPT_REP_FECHA_MODIFICA", localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A848RPT_REP_USUARIO_CREACION = AV12Usuario ;
         n848RPT_REP_USUARIO_CREACION = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A848RPT_REP_USUARIO_CREACION", A848RPT_REP_USUARIO_CREACION);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A850RPT_REP_USUARIO_MODIFICA = AV12Usuario ;
         n850RPT_REP_USUARIO_MODIFICA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A850RPT_REP_USUARIO_MODIFICA", A850RPT_REP_USUARIO_MODIFICA);
      }
   }

   public void beforeInsert1I65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1I65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1I65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I65( )
   {
      edtRPT_REP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_ID_Enabled, 5, 0)), true);
      edtRPT_REP_NOMBRE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_NOMBRE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_NOMBRE_Enabled, 5, 0)), true);
      edtRPT_REP_DESCRIPCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_DESCRIPCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_DESCRIPCION_Enabled, 5, 0)), true);
      cmbRPT_REP_FORMATO.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_FORMATO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRPT_REP_FORMATO.getEnabled(), 5, 0)), true);
      cmbRPT_REP_ESTADO.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_ESTADO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRPT_REP_ESTADO.getEnabled(), 5, 0)), true);
   }

   public void zm1I66( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z852RPT_REP_PARM_ORDEN = T001I3_A852RPT_REP_PARM_ORDEN[0] ;
            Z853RPT_REP_PARM_ESTADO = T001I3_A853RPT_REP_PARM_ESTADO[0] ;
         }
         else
         {
            Z852RPT_REP_PARM_ORDEN = A852RPT_REP_PARM_ORDEN ;
            Z853RPT_REP_PARM_ESTADO = A853RPT_REP_PARM_ESTADO ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z843RPT_REP_ID = A843RPT_REP_ID ;
         Z852RPT_REP_PARM_ORDEN = A852RPT_REP_PARM_ORDEN ;
         Z853RPT_REP_PARM_ESTADO = A853RPT_REP_PARM_ESTADO ;
         Z840RPT_PAR_ID = A840RPT_PAR_ID ;
         Z841RPT_PAR_DESCRIPCION = A841RPT_PAR_DESCRIPCION ;
         Z860RPT_PAR_NOMBREINTERNO = A860RPT_PAR_NOMBREINTERNO ;
      }
   }

   public void standaloneNotModal1I66( )
   {
   }

   public void standaloneModal1I66( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRPT_PAR_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      }
      else
      {
         edtRPT_PAR_ID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      }
   }

   public void load1I66( )
   {
      /* Using cursor T001I16 */
      pr_default.execute(14, new Object[] {new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound66 = (short)(1) ;
         A841RPT_PAR_DESCRIPCION = T001I16_A841RPT_PAR_DESCRIPCION[0] ;
         n841RPT_PAR_DESCRIPCION = T001I16_n841RPT_PAR_DESCRIPCION[0] ;
         A860RPT_PAR_NOMBREINTERNO = T001I16_A860RPT_PAR_NOMBREINTERNO[0] ;
         n860RPT_PAR_NOMBREINTERNO = T001I16_n860RPT_PAR_NOMBREINTERNO[0] ;
         A852RPT_REP_PARM_ORDEN = T001I16_A852RPT_REP_PARM_ORDEN[0] ;
         n852RPT_REP_PARM_ORDEN = T001I16_n852RPT_REP_PARM_ORDEN[0] ;
         A853RPT_REP_PARM_ESTADO = T001I16_A853RPT_REP_PARM_ESTADO[0] ;
         n853RPT_REP_PARM_ESTADO = T001I16_n853RPT_REP_PARM_ESTADO[0] ;
         zm1I66( -8) ;
      }
      pr_default.close(14);
      onLoadActions1I66( ) ;
   }

   public void onLoadActions1I66( )
   {
   }

   public void checkExtendedTable1I66( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal1I66( ) ;
      /* Using cursor T001I4 */
      pr_default.execute(2, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem("No existe 'PARAMETROS DE REPORTES'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_PAR_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841RPT_PAR_DESCRIPCION = T001I4_A841RPT_PAR_DESCRIPCION[0] ;
      n841RPT_PAR_DESCRIPCION = T001I4_n841RPT_PAR_DESCRIPCION[0] ;
      A860RPT_PAR_NOMBREINTERNO = T001I4_A860RPT_PAR_NOMBREINTERNO[0] ;
      n860RPT_PAR_NOMBREINTERNO = T001I4_n860RPT_PAR_NOMBREINTERNO[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1I66( )
   {
      pr_default.close(2);
   }

   public void enableDisable1I66( )
   {
   }

   public void gxload_9( short A840RPT_PAR_ID )
   {
      /* Using cursor T001I17 */
      pr_default.execute(15, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem("No existe 'PARAMETROS DE REPORTES'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_PAR_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841RPT_PAR_DESCRIPCION = T001I17_A841RPT_PAR_DESCRIPCION[0] ;
      n841RPT_PAR_DESCRIPCION = T001I17_n841RPT_PAR_DESCRIPCION[0] ;
      A860RPT_PAR_NOMBREINTERNO = T001I17_A860RPT_PAR_NOMBREINTERNO[0] ;
      n860RPT_PAR_NOMBREINTERNO = T001I17_n860RPT_PAR_NOMBREINTERNO[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A841RPT_PAR_DESCRIPCION)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A860RPT_PAR_NOMBREINTERNO)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void getKey1I66( )
   {
      /* Using cursor T001I18 */
      pr_default.execute(16, new Object[] {new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound66 = (short)(1) ;
      }
      else
      {
         RcdFound66 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1I66( )
   {
      /* Using cursor T001I3 */
      pr_default.execute(1, new Object[] {new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1I66( 8) ;
         RcdFound66 = (short)(1) ;
         initializeNonKey1I66( ) ;
         A852RPT_REP_PARM_ORDEN = T001I3_A852RPT_REP_PARM_ORDEN[0] ;
         n852RPT_REP_PARM_ORDEN = T001I3_n852RPT_REP_PARM_ORDEN[0] ;
         A853RPT_REP_PARM_ESTADO = T001I3_A853RPT_REP_PARM_ESTADO[0] ;
         n853RPT_REP_PARM_ESTADO = T001I3_n853RPT_REP_PARM_ESTADO[0] ;
         A840RPT_PAR_ID = T001I3_A840RPT_PAR_ID[0] ;
         Z843RPT_REP_ID = A843RPT_REP_ID ;
         Z840RPT_PAR_ID = A840RPT_PAR_ID ;
         sMode66 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1I66( ) ;
         Gx_mode = sMode66 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound66 = (short)(0) ;
         initializeNonKey1I66( ) ;
         sMode66 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal1I66( ) ;
         Gx_mode = sMode66 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes1I66( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1I66( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001I2 */
         pr_default.execute(0, new Object[] {new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_REP_PARM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z852RPT_REP_PARM_ORDEN != T001I2_A852RPT_REP_PARM_ORDEN[0] ) || ( GXutil.strcmp(Z853RPT_REP_PARM_ESTADO, T001I2_A853RPT_REP_PARM_ESTADO[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"RPT_REP_PARM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I66( )
   {
      beforeValidate1I66( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I66( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I66( 0) ;
         checkOptimisticConcurrency1I66( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I66( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I66( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I19 */
                  pr_default.execute(17, new Object[] {new Short(A843RPT_REP_ID), new Boolean(n852RPT_REP_PARM_ORDEN), new Short(A852RPT_REP_PARM_ORDEN), new Boolean(n853RPT_REP_PARM_ESTADO), A853RPT_REP_PARM_ESTADO, new Short(A840RPT_PAR_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REP_PARM") ;
                  if ( (pr_default.getStatus(17) == 1) )
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
            load1I66( ) ;
         }
         endLevel1I66( ) ;
      }
      closeExtendedTableCursors1I66( ) ;
   }

   public void update1I66( )
   {
      beforeValidate1I66( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I66( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I66( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I66( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1I66( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I20 */
                  pr_default.execute(18, new Object[] {new Boolean(n852RPT_REP_PARM_ORDEN), new Short(A852RPT_REP_PARM_ORDEN), new Boolean(n853RPT_REP_PARM_ESTADO), A853RPT_REP_PARM_ESTADO, new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REP_PARM") ;
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_REP_PARM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1I66( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1I66( ) ;
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
         endLevel1I66( ) ;
      }
      closeExtendedTableCursors1I66( ) ;
   }

   public void deferredUpdate1I66( )
   {
   }

   public void delete1I66( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate1I66( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I66( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I66( ) ;
         afterConfirm1I66( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I66( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001I21 */
               pr_default.execute(19, new Object[] {new Short(A843RPT_REP_ID), new Short(A840RPT_PAR_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_REP_PARM") ;
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
      sMode66 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1I66( ) ;
      Gx_mode = sMode66 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1I66( )
   {
      standaloneModal1I66( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001I22 */
         pr_default.execute(20, new Object[] {new Short(A840RPT_PAR_ID)});
         A841RPT_PAR_DESCRIPCION = T001I22_A841RPT_PAR_DESCRIPCION[0] ;
         n841RPT_PAR_DESCRIPCION = T001I22_n841RPT_PAR_DESCRIPCION[0] ;
         A860RPT_PAR_NOMBREINTERNO = T001I22_A860RPT_PAR_NOMBREINTERNO[0] ;
         n860RPT_PAR_NOMBREINTERNO = T001I22_n860RPT_PAR_NOMBREINTERNO[0] ;
         pr_default.close(20);
      }
   }

   public void endLevel1I66( )
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

   public void scanStart1I66( )
   {
      /* Scan By routine */
      /* Using cursor T001I23 */
      pr_default.execute(21, new Object[] {new Short(A843RPT_REP_ID)});
      RcdFound66 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound66 = (short)(1) ;
         A840RPT_PAR_ID = T001I23_A840RPT_PAR_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1I66( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound66 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound66 = (short)(1) ;
         A840RPT_PAR_ID = T001I23_A840RPT_PAR_ID[0] ;
      }
   }

   public void scanEnd1I66( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1I66( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1I66( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1I66( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1I66( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I66( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I66( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I66( )
   {
      edtRPT_PAR_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      edtRPT_PAR_DESCRIPCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_DESCRIPCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_DESCRIPCION_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      cmbRPT_REP_PARM_ESTADO.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_PARM_ESTADO.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRPT_REP_PARM_ESTADO.getEnabled(), 5, 0)), !bGXsfl_58_Refreshing);
      edtRPT_REP_PARM_ORDEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_PARM_ORDEN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_REP_PARM_ORDEN_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
   }

   public void subsflControlProps_5866( )
   {
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID_"+sGXsfl_58_idx ;
      imgprompt_840_Internalname = "PROMPT_840_"+sGXsfl_58_idx ;
      edtRPT_PAR_DESCRIPCION_Internalname = "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx );
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_5866( )
   {
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID_"+sGXsfl_58_fel_idx ;
      imgprompt_840_Internalname = "PROMPT_840_"+sGXsfl_58_fel_idx ;
      edtRPT_PAR_DESCRIPCION_Internalname = "RPT_PAR_DESCRIPCION_"+sGXsfl_58_fel_idx ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_fel_idx );
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN_"+sGXsfl_58_fel_idx ;
   }

   public void addRow1I66( )
   {
      nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5866( ) ;
      sendRow1I66( ) ;
   }

   public void sendRow1I66( )
   {
      Gridrpt_reporte_rpt_rep_parmRow = GXWebRow.GetNew(context) ;
      if ( subGridrpt_reporte_rpt_rep_parm_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridrpt_reporte_rpt_rep_parm_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridrpt_reporte_rpt_rep_parm_Class, "") != 0 )
         {
            subGridrpt_reporte_rpt_rep_parm_Linesclass = subGridrpt_reporte_rpt_rep_parm_Class+"Odd" ;
         }
      }
      else if ( subGridrpt_reporte_rpt_rep_parm_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridrpt_reporte_rpt_rep_parm_Backstyle = (byte)(0) ;
         subGridrpt_reporte_rpt_rep_parm_Backcolor = subGridrpt_reporte_rpt_rep_parm_Allbackcolor ;
         if ( GXutil.strcmp(subGridrpt_reporte_rpt_rep_parm_Class, "") != 0 )
         {
            subGridrpt_reporte_rpt_rep_parm_Linesclass = subGridrpt_reporte_rpt_rep_parm_Class+"Uniform" ;
         }
      }
      else if ( subGridrpt_reporte_rpt_rep_parm_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridrpt_reporte_rpt_rep_parm_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridrpt_reporte_rpt_rep_parm_Class, "") != 0 )
         {
            subGridrpt_reporte_rpt_rep_parm_Linesclass = subGridrpt_reporte_rpt_rep_parm_Class+"Odd" ;
         }
         subGridrpt_reporte_rpt_rep_parm_Backcolor = (int)(0x0) ;
      }
      else if ( subGridrpt_reporte_rpt_rep_parm_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridrpt_reporte_rpt_rep_parm_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGridrpt_reporte_rpt_rep_parm_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridrpt_reporte_rpt_rep_parm_Class, "") != 0 )
            {
               subGridrpt_reporte_rpt_rep_parm_Linesclass = subGridrpt_reporte_rpt_rep_parm_Class+"Even" ;
            }
         }
         else
         {
            subGridrpt_reporte_rpt_rep_parm_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridrpt_reporte_rpt_rep_parm_Class, "") != 0 )
            {
               subGridrpt_reporte_rpt_rep_parm_Linesclass = subGridrpt_reporte_rpt_rep_parm_Class+"Odd" ;
            }
         }
      }
      imgprompt_840_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx01s0"+"',["+"{Ctrl:gx.dom.el('"+"RPT_PAR_ID_"+sGXsfl_58_idx+"'), id:'"+"RPT_PAR_ID_"+sGXsfl_58_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_66_"+sGXsfl_58_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx01u1"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(843,2),t(',',7),t(4,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"RPT_PAR_ID_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"RPT_PAR_ID_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_66_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_843,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_66_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridrpt_reporte_rpt_rep_parmRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_PAR_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_PAR_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtRPT_PAR_ID_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(58),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridrpt_reporte_rpt_rep_parmRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_840_Internalname,sImgUrl,imgprompt_840_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_840_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridrpt_reporte_rpt_rep_parmRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_PAR_DESCRIPCION_Internalname,A841RPT_PAR_DESCRIPCION,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_PAR_DESCRIPCION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtRPT_PAR_DESCRIPCION_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(58),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_66_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      if ( ( nGXsfl_58_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "RPT_REP_PARM_ESTADO_" + sGXsfl_58_idx ;
         cmbRPT_REP_PARM_ESTADO.setName( GXCCtl );
         cmbRPT_REP_PARM_ESTADO.setWebtags( "" );
         cmbRPT_REP_PARM_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_REP_PARM_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_REP_PARM_ESTADO.getItemCount() > 0 )
         {
            A853RPT_REP_PARM_ESTADO = cmbRPT_REP_PARM_ESTADO.getValidValue(A853RPT_REP_PARM_ESTADO) ;
            n853RPT_REP_PARM_ESTADO = false ;
         }
      }
      /* ComboBox */
      Gridrpt_reporte_rpt_rep_parmRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRPT_REP_PARM_ESTADO,cmbRPT_REP_PARM_ESTADO.getInternalname(),GXutil.rtrim( A853RPT_REP_PARM_ESTADO),new Integer(1),cmbRPT_REP_PARM_ESTADO.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbRPT_REP_PARM_ESTADO.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","",new Boolean(true)});
      cmbRPT_REP_PARM_ESTADO.setValue( GXutil.rtrim( A853RPT_REP_PARM_ESTADO) );
      httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_PARM_ESTADO.getInternalname(), "Values", cmbRPT_REP_PARM_ESTADO.ToJavascriptSource(), !bGXsfl_58_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_66_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridrpt_reporte_rpt_rep_parmRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_PARM_ORDEN_Internalname,GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", "")),((edtRPT_REP_PARM_ORDEN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A852RPT_REP_PARM_ORDEN), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A852RPT_REP_PARM_ORDEN), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_REP_PARM_ORDEN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtRPT_REP_PARM_ORDEN_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(58),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      httpContext.ajax_sending_grid_row(Gridrpt_reporte_rpt_rep_parmRow);
      GXCCtl = "Z840RPT_PAR_ID_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "Z852RPT_REP_PARM_ORDEN_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "Z853RPT_REP_PARM_ESTADO_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z853RPT_REP_PARM_ESTADO));
      GXCCtl = "nRcdDeleted_66_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_66, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_66_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_66, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_66_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_66, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_58_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vRPT_REP_ID_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_PAR_DESCRIPCION_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbRPT_REP_PARM_ESTADO.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRPT_REP_PARM_ORDEN_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_840_"+sGXsfl_58_idx+"Link", GXutil.rtrim( imgprompt_840_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridrpt_reporte_rpt_rep_parmContainer.AddRow(Gridrpt_reporte_rpt_rep_parmRow);
   }

   public void readRow1I66( )
   {
      nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5866( ) ;
      edtRPT_PAR_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_PAR_ID_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
      edtRPT_PAR_DESCRIPCION_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_PAR_DESCRIPCION_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
      cmbRPT_REP_PARM_ESTADO.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx+"Enabled"), ",", ".")) );
      edtRPT_REP_PARM_ORDEN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
      imgprompt_840_Link = httpContext.cgiGet( "PROMPT_840_"+sGXsfl_58_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRPT_PAR_ID_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRPT_PAR_ID_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "RPT_PAR_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_PAR_ID_Internalname ;
         wbErr = true ;
         A840RPT_PAR_ID = (short)(0) ;
      }
      else
      {
         A840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_PAR_ID_Internalname), ",", ".")) ;
      }
      A841RPT_PAR_DESCRIPCION = httpContext.cgiGet( edtRPT_PAR_DESCRIPCION_Internalname) ;
      n841RPT_PAR_DESCRIPCION = false ;
      cmbRPT_REP_PARM_ESTADO.setName( cmbRPT_REP_PARM_ESTADO.getInternalname() );
      cmbRPT_REP_PARM_ESTADO.setValue( httpContext.cgiGet( cmbRPT_REP_PARM_ESTADO.getInternalname()) );
      A853RPT_REP_PARM_ESTADO = httpContext.cgiGet( cmbRPT_REP_PARM_ESTADO.getInternalname()) ;
      n853RPT_REP_PARM_ESTADO = false ;
      n853RPT_REP_PARM_ESTADO = ((GXutil.strcmp("", A853RPT_REP_PARM_ESTADO)==0) ? true : false) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRPT_REP_PARM_ORDEN_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRPT_REP_PARM_ORDEN_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "RPT_REP_PARM_ORDEN_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_REP_PARM_ORDEN_Internalname ;
         wbErr = true ;
         A852RPT_REP_PARM_ORDEN = (short)(0) ;
         n852RPT_REP_PARM_ORDEN = false ;
      }
      else
      {
         A852RPT_REP_PARM_ORDEN = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_REP_PARM_ORDEN_Internalname), ",", ".")) ;
         n852RPT_REP_PARM_ORDEN = false ;
      }
      n852RPT_REP_PARM_ORDEN = ((0==A852RPT_REP_PARM_ORDEN) ? true : false) ;
      GXCCtl = "Z840RPT_PAR_ID_" + sGXsfl_58_idx ;
      Z840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z852RPT_REP_PARM_ORDEN_" + sGXsfl_58_idx ;
      Z852RPT_REP_PARM_ORDEN = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      n852RPT_REP_PARM_ORDEN = ((0==A852RPT_REP_PARM_ORDEN) ? true : false) ;
      GXCCtl = "Z853RPT_REP_PARM_ESTADO_" + sGXsfl_58_idx ;
      Z853RPT_REP_PARM_ESTADO = httpContext.cgiGet( GXCCtl) ;
      n853RPT_REP_PARM_ESTADO = ((GXutil.strcmp("", A853RPT_REP_PARM_ESTADO)==0) ? true : false) ;
      GXCCtl = "nRcdDeleted_66_" + sGXsfl_58_idx ;
      nRcdDeleted_66 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_66_" + sGXsfl_58_idx ;
      nRcdExists_66 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_66_" + sGXsfl_58_idx ;
      nIsMod_66 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtRPT_PAR_ID_Enabled = edtRPT_PAR_ID_Enabled ;
   }

   public void confirmValues1I0( )
   {
      nGXsfl_58_idx = (short)(0) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_5866( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5866( ) ;
         httpContext.changePostValue( "Z840RPT_PAR_ID_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z840RPT_PAR_ID_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z840RPT_PAR_ID_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z852RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z852RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z852RPT_REP_PARM_ORDEN_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z853RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z853RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z853RPT_REP_PARM_ESTADO_"+sGXsfl_58_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173962");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.rpt_reporte") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7RPT_REP_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z843RPT_REP_ID", GXutil.ltrim( localUtil.ntoc( Z843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z848RPT_REP_USUARIO_CREACION", Z848RPT_REP_USUARIO_CREACION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z850RPT_REP_USUARIO_MODIFICA", Z850RPT_REP_USUARIO_MODIFICA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z847RPT_REP_FECHA_CREACION", localUtil.ttoc( Z847RPT_REP_FECHA_CREACION, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z849RPT_REP_FECHA_MODIFICA", localUtil.ttoc( Z849RPT_REP_FECHA_MODIFICA, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z844RPT_REP_NOMBRE", Z844RPT_REP_NOMBRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z845RPT_REP_DESCRIPCION", Z845RPT_REP_DESCRIPCION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z846RPT_REP_FORMATO", Z846RPT_REP_FORMATO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z851RPT_REP_ESTADO", GXutil.rtrim( Z851RPT_REP_ESTADO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nGXsfl_58_idx, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vRPT_REP_ID", GXutil.ltrim( localUtil.ntoc( AV7RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_USUARIO_CREACION", A848RPT_REP_USUARIO_CREACION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_USUARIO_MODIFICA", A850RPT_REP_USUARIO_MODIFICA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FECHA_CREACION", localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_FECHA_MODIFICA", localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RPT_REP_ID), "ZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "RPT_REPORTE" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("rpt_reporte:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.rpt_reporte") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7RPT_REP_ID,4,0))) ;
   }

   public String getPgmname( )
   {
      return "RPT_REPORTE" ;
   }

   public String getPgmdesc( )
   {
      return "REPORTES" ;
   }

   public void initializeNonKey1I65( )
   {
      A848RPT_REP_USUARIO_CREACION = "" ;
      n848RPT_REP_USUARIO_CREACION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A848RPT_REP_USUARIO_CREACION", A848RPT_REP_USUARIO_CREACION);
      A850RPT_REP_USUARIO_MODIFICA = "" ;
      n850RPT_REP_USUARIO_MODIFICA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A850RPT_REP_USUARIO_MODIFICA", A850RPT_REP_USUARIO_MODIFICA);
      A847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      n847RPT_REP_FECHA_CREACION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A847RPT_REP_FECHA_CREACION", localUtil.ttoc( A847RPT_REP_FECHA_CREACION, 8, 5, 0, 3, "/", ":", " "));
      A849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      n849RPT_REP_FECHA_MODIFICA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A849RPT_REP_FECHA_MODIFICA", localUtil.ttoc( A849RPT_REP_FECHA_MODIFICA, 8, 5, 0, 3, "/", ":", " "));
      A844RPT_REP_NOMBRE = "" ;
      n844RPT_REP_NOMBRE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A844RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
      n844RPT_REP_NOMBRE = ((GXutil.strcmp("", A844RPT_REP_NOMBRE)==0) ? true : false) ;
      A845RPT_REP_DESCRIPCION = "" ;
      n845RPT_REP_DESCRIPCION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A845RPT_REP_DESCRIPCION", A845RPT_REP_DESCRIPCION);
      n845RPT_REP_DESCRIPCION = ((GXutil.strcmp("", A845RPT_REP_DESCRIPCION)==0) ? true : false) ;
      A846RPT_REP_FORMATO = "" ;
      n846RPT_REP_FORMATO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
      n846RPT_REP_FORMATO = ((GXutil.strcmp("", A846RPT_REP_FORMATO)==0) ? true : false) ;
      A851RPT_REP_ESTADO = "" ;
      n851RPT_REP_ESTADO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
      n851RPT_REP_ESTADO = ((GXutil.strcmp("", A851RPT_REP_ESTADO)==0) ? true : false) ;
      Z848RPT_REP_USUARIO_CREACION = "" ;
      Z850RPT_REP_USUARIO_MODIFICA = "" ;
      Z847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      Z849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      Z844RPT_REP_NOMBRE = "" ;
      Z845RPT_REP_DESCRIPCION = "" ;
      Z846RPT_REP_FORMATO = "" ;
      Z851RPT_REP_ESTADO = "" ;
   }

   public void initAll1I65( )
   {
      A843RPT_REP_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A843RPT_REP_ID", GXutil.ltrim( GXutil.str( A843RPT_REP_ID, 4, 0)));
      initializeNonKey1I65( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1I66( )
   {
      A841RPT_PAR_DESCRIPCION = "" ;
      n841RPT_PAR_DESCRIPCION = false ;
      A860RPT_PAR_NOMBREINTERNO = "" ;
      n860RPT_PAR_NOMBREINTERNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A860RPT_PAR_NOMBREINTERNO", A860RPT_PAR_NOMBREINTERNO);
      A852RPT_REP_PARM_ORDEN = (short)(0) ;
      n852RPT_REP_PARM_ORDEN = false ;
      A853RPT_REP_PARM_ESTADO = "" ;
      n853RPT_REP_PARM_ESTADO = false ;
      Z852RPT_REP_PARM_ORDEN = (short)(0) ;
      Z853RPT_REP_PARM_ESTADO = "" ;
   }

   public void initAll1I66( )
   {
      A840RPT_PAR_ID = (short)(0) ;
      initializeNonKey1I66( ) ;
   }

   public void standaloneModalInsert1I66( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173971");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("rpt_reporte.js", "?201861414173971");
      /* End function include_jscripts */
   }

   public void init_level_properties66( )
   {
      edtRPT_PAR_ID_Enabled = defedtRPT_PAR_ID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRPT_PAR_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRPT_PAR_ID_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
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
      edtRPT_REP_ID_Internalname = "RPT_REP_ID" ;
      edtRPT_REP_NOMBRE_Internalname = "RPT_REP_NOMBRE" ;
      edtRPT_REP_DESCRIPCION_Internalname = "RPT_REP_DESCRIPCION" ;
      cmbRPT_REP_FORMATO.setInternalname( "RPT_REP_FORMATO" );
      cmbRPT_REP_ESTADO.setInternalname( "RPT_REP_ESTADO" );
      lblTitlerpt_rep_parm_Internalname = "TITLERPT_REP_PARM" ;
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID" ;
      edtRPT_PAR_DESCRIPCION_Internalname = "RPT_PAR_DESCRIPCION" ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO" );
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN" ;
      divRpt_rep_parmtable_Internalname = "RPT_REP_PARMTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_840_Internalname = "PROMPT_840" ;
      subGridrpt_reporte_rpt_rep_parm_Internalname = "GRIDRPT_REPORTE_RPT_REP_PARM" ;
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
      Form.setCaption( "REPORTES" );
      edtRPT_REP_PARM_ORDEN_Jsonclick = "" ;
      cmbRPT_REP_PARM_ESTADO.setJsonclick( "" );
      edtRPT_PAR_DESCRIPCION_Jsonclick = "" ;
      imgprompt_840_Visible = 1 ;
      imgprompt_840_Link = "" ;
      imgprompt_840_Visible = 1 ;
      edtRPT_PAR_ID_Jsonclick = "" ;
      subGridrpt_reporte_rpt_rep_parm_Class = "WorkWith" ;
      subGridrpt_reporte_rpt_rep_parm_Backcolorstyle = (byte)(0) ;
      subGridrpt_reporte_rpt_rep_parm_Allowcollapsing = (byte)(0) ;
      subGridrpt_reporte_rpt_rep_parm_Allowselection = (byte)(0) ;
      edtRPT_REP_PARM_ORDEN_Enabled = 1 ;
      cmbRPT_REP_PARM_ESTADO.setEnabled( 1 );
      edtRPT_PAR_DESCRIPCION_Enabled = 0 ;
      edtRPT_PAR_ID_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbRPT_REP_ESTADO.setJsonclick( "" );
      cmbRPT_REP_ESTADO.setEnabled( 1 );
      cmbRPT_REP_FORMATO.setJsonclick( "" );
      cmbRPT_REP_FORMATO.setEnabled( 1 );
      edtRPT_REP_DESCRIPCION_Jsonclick = "" ;
      edtRPT_REP_DESCRIPCION_Enabled = 1 ;
      edtRPT_REP_NOMBRE_Jsonclick = "" ;
      edtRPT_REP_NOMBRE_Enabled = 1 ;
      edtRPT_REP_ID_Jsonclick = "" ;
      edtRPT_REP_ID_Enabled = 0 ;
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

   public void gxnrgridrpt_reporte_rpt_rep_parm_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_5866( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1I66( ) ;
         standaloneModal1I66( ) ;
         cmbRPT_REP_FORMATO.setName( "RPT_REP_FORMATO" );
         cmbRPT_REP_FORMATO.setWebtags( "" );
         cmbRPT_REP_FORMATO.addItem("EXC", "EXCEL", (short)(0));
         cmbRPT_REP_FORMATO.addItem("PDF", "PDF", (short)(0));
         if ( cmbRPT_REP_FORMATO.getItemCount() > 0 )
         {
            A846RPT_REP_FORMATO = cmbRPT_REP_FORMATO.getValidValue(A846RPT_REP_FORMATO) ;
            n846RPT_REP_FORMATO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A846RPT_REP_FORMATO", A846RPT_REP_FORMATO);
         }
         cmbRPT_REP_ESTADO.setName( "RPT_REP_ESTADO" );
         cmbRPT_REP_ESTADO.setWebtags( "" );
         cmbRPT_REP_ESTADO.addItem("", "SELECCIONAR", (short)(0));
         cmbRPT_REP_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_REP_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_REP_ESTADO.getItemCount() > 0 )
         {
            A851RPT_REP_ESTADO = cmbRPT_REP_ESTADO.getValidValue(A851RPT_REP_ESTADO) ;
            n851RPT_REP_ESTADO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A851RPT_REP_ESTADO", A851RPT_REP_ESTADO);
         }
         GXCCtl = "RPT_REP_PARM_ESTADO_" + sGXsfl_58_idx ;
         cmbRPT_REP_PARM_ESTADO.setName( GXCCtl );
         cmbRPT_REP_PARM_ESTADO.setWebtags( "" );
         cmbRPT_REP_PARM_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_REP_PARM_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_REP_PARM_ESTADO.getItemCount() > 0 )
         {
            A853RPT_REP_PARM_ESTADO = cmbRPT_REP_PARM_ESTADO.getValidValue(A853RPT_REP_PARM_ESTADO) ;
            n853RPT_REP_PARM_ESTADO = false ;
         }
         dynload_actions( ) ;
         sendRow1I66( ) ;
         nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_5866( ) ;
      }
      httpContext.GX_webresponse.addString(Gridrpt_reporte_rpt_rep_parmContainer.ToJavascriptSource());
      /* End function gxnrGridrpt_reporte_rpt_rep_parm_newrow */
   }

   public void valid_Rpt_par_id( short GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      A840RPT_PAR_ID = GX_Parm1 ;
      A841RPT_PAR_DESCRIPCION = GX_Parm2 ;
      n841RPT_PAR_DESCRIPCION = false ;
      A860RPT_PAR_NOMBREINTERNO = GX_Parm3 ;
      n860RPT_PAR_NOMBREINTERNO = false ;
      /* Using cursor T001I22 */
      pr_default.execute(20, new Object[] {new Short(A840RPT_PAR_ID)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PARAMETROS DE REPORTES'.", "ForeignKeyNotFound", 1, "RPT_PAR_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRPT_PAR_ID_Internalname ;
      }
      A841RPT_PAR_DESCRIPCION = T001I22_A841RPT_PAR_DESCRIPCION[0] ;
      n841RPT_PAR_DESCRIPCION = T001I22_n841RPT_PAR_DESCRIPCION[0] ;
      A860RPT_PAR_NOMBREINTERNO = T001I22_A860RPT_PAR_NOMBREINTERNO[0] ;
      n860RPT_PAR_NOMBREINTERNO = T001I22_n860RPT_PAR_NOMBREINTERNO[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A841RPT_PAR_DESCRIPCION = "" ;
         n841RPT_PAR_DESCRIPCION = false ;
         A860RPT_PAR_NOMBREINTERNO = "" ;
         n860RPT_PAR_NOMBREINTERNO = false ;
      }
      isValidOutput.add(A841RPT_PAR_DESCRIPCION);
      isValidOutput.add(A860RPT_PAR_NOMBREINTERNO);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7RPT_REP_ID',fld:'vRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121I2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z848RPT_REP_USUARIO_CREACION = "" ;
      Z850RPT_REP_USUARIO_MODIFICA = "" ;
      Z847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      Z849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      Z844RPT_REP_NOMBRE = "" ;
      Z845RPT_REP_DESCRIPCION = "" ;
      Z846RPT_REP_FORMATO = "" ;
      Z851RPT_REP_ESTADO = "" ;
      Z853RPT_REP_PARM_ESTADO = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A846RPT_REP_FORMATO = "" ;
      A851RPT_REP_ESTADO = "" ;
      GXCCtl = "" ;
      A853RPT_REP_PARM_ESTADO = "" ;
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
      A844RPT_REP_NOMBRE = "" ;
      A845RPT_REP_DESCRIPCION = "" ;
      lblTitlerpt_rep_parm_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridrpt_reporte_rpt_rep_parmContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridrpt_reporte_rpt_rep_parmColumn = new com.genexus.webpanels.GXWebColumn();
      A841RPT_PAR_DESCRIPCION = "" ;
      sMode66 = "" ;
      sStyleString = "" ;
      A848RPT_REP_USUARIO_CREACION = "" ;
      A850RPT_REP_USUARIO_MODIFICA = "" ;
      A847RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      A849RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      A860RPT_PAR_NOMBREINTERNO = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode65 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T001I7_A843RPT_REP_ID = new short[1] ;
      T001I7_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      T001I7_n848RPT_REP_USUARIO_CREACION = new boolean[] {false} ;
      T001I7_A850RPT_REP_USUARIO_MODIFICA = new String[] {""} ;
      T001I7_n850RPT_REP_USUARIO_MODIFICA = new boolean[] {false} ;
      T001I7_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      T001I7_n847RPT_REP_FECHA_CREACION = new boolean[] {false} ;
      T001I7_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      T001I7_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      T001I7_A844RPT_REP_NOMBRE = new String[] {""} ;
      T001I7_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      T001I7_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      T001I7_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      T001I7_A846RPT_REP_FORMATO = new String[] {""} ;
      T001I7_n846RPT_REP_FORMATO = new boolean[] {false} ;
      T001I7_A851RPT_REP_ESTADO = new String[] {""} ;
      T001I7_n851RPT_REP_ESTADO = new boolean[] {false} ;
      T001I8_A843RPT_REP_ID = new short[1] ;
      T001I6_A843RPT_REP_ID = new short[1] ;
      T001I6_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      T001I6_n848RPT_REP_USUARIO_CREACION = new boolean[] {false} ;
      T001I6_A850RPT_REP_USUARIO_MODIFICA = new String[] {""} ;
      T001I6_n850RPT_REP_USUARIO_MODIFICA = new boolean[] {false} ;
      T001I6_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      T001I6_n847RPT_REP_FECHA_CREACION = new boolean[] {false} ;
      T001I6_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      T001I6_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      T001I6_A844RPT_REP_NOMBRE = new String[] {""} ;
      T001I6_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      T001I6_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      T001I6_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      T001I6_A846RPT_REP_FORMATO = new String[] {""} ;
      T001I6_n846RPT_REP_FORMATO = new boolean[] {false} ;
      T001I6_A851RPT_REP_ESTADO = new String[] {""} ;
      T001I6_n851RPT_REP_ESTADO = new boolean[] {false} ;
      T001I9_A843RPT_REP_ID = new short[1] ;
      T001I10_A843RPT_REP_ID = new short[1] ;
      T001I5_A843RPT_REP_ID = new short[1] ;
      T001I5_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      T001I5_n848RPT_REP_USUARIO_CREACION = new boolean[] {false} ;
      T001I5_A850RPT_REP_USUARIO_MODIFICA = new String[] {""} ;
      T001I5_n850RPT_REP_USUARIO_MODIFICA = new boolean[] {false} ;
      T001I5_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      T001I5_n847RPT_REP_FECHA_CREACION = new boolean[] {false} ;
      T001I5_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      T001I5_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      T001I5_A844RPT_REP_NOMBRE = new String[] {""} ;
      T001I5_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      T001I5_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      T001I5_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      T001I5_A846RPT_REP_FORMATO = new String[] {""} ;
      T001I5_n846RPT_REP_FORMATO = new boolean[] {false} ;
      T001I5_A851RPT_REP_ESTADO = new String[] {""} ;
      T001I5_n851RPT_REP_ESTADO = new boolean[] {false} ;
      T001I12_A843RPT_REP_ID = new short[1] ;
      T001I15_A843RPT_REP_ID = new short[1] ;
      Z841RPT_PAR_DESCRIPCION = "" ;
      Z860RPT_PAR_NOMBREINTERNO = "" ;
      T001I16_A843RPT_REP_ID = new short[1] ;
      T001I16_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001I16_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001I16_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001I16_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001I16_A852RPT_REP_PARM_ORDEN = new short[1] ;
      T001I16_n852RPT_REP_PARM_ORDEN = new boolean[] {false} ;
      T001I16_A853RPT_REP_PARM_ESTADO = new String[] {""} ;
      T001I16_n853RPT_REP_PARM_ESTADO = new boolean[] {false} ;
      T001I16_A840RPT_PAR_ID = new short[1] ;
      T001I4_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001I4_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001I4_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001I4_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001I17_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001I17_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001I17_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001I17_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001I18_A843RPT_REP_ID = new short[1] ;
      T001I18_A840RPT_PAR_ID = new short[1] ;
      T001I3_A843RPT_REP_ID = new short[1] ;
      T001I3_A852RPT_REP_PARM_ORDEN = new short[1] ;
      T001I3_n852RPT_REP_PARM_ORDEN = new boolean[] {false} ;
      T001I3_A853RPT_REP_PARM_ESTADO = new String[] {""} ;
      T001I3_n853RPT_REP_PARM_ESTADO = new boolean[] {false} ;
      T001I3_A840RPT_PAR_ID = new short[1] ;
      T001I2_A843RPT_REP_ID = new short[1] ;
      T001I2_A852RPT_REP_PARM_ORDEN = new short[1] ;
      T001I2_n852RPT_REP_PARM_ORDEN = new boolean[] {false} ;
      T001I2_A853RPT_REP_PARM_ESTADO = new String[] {""} ;
      T001I2_n853RPT_REP_PARM_ESTADO = new boolean[] {false} ;
      T001I2_A840RPT_PAR_ID = new short[1] ;
      T001I22_A841RPT_PAR_DESCRIPCION = new String[] {""} ;
      T001I22_n841RPT_PAR_DESCRIPCION = new boolean[] {false} ;
      T001I22_A860RPT_PAR_NOMBREINTERNO = new String[] {""} ;
      T001I22_n860RPT_PAR_NOMBREINTERNO = new boolean[] {false} ;
      T001I23_A843RPT_REP_ID = new short[1] ;
      T001I23_A840RPT_PAR_ID = new short[1] ;
      Gridrpt_reporte_rpt_rep_parmRow = new com.genexus.webpanels.GXWebRow();
      subGridrpt_reporte_rpt_rep_parm_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_reporte__default(),
         new Object[] {
             new Object[] {
            T001I2_A843RPT_REP_ID, T001I2_A852RPT_REP_PARM_ORDEN, T001I2_n852RPT_REP_PARM_ORDEN, T001I2_A853RPT_REP_PARM_ESTADO, T001I2_n853RPT_REP_PARM_ESTADO, T001I2_A840RPT_PAR_ID
            }
            , new Object[] {
            T001I3_A843RPT_REP_ID, T001I3_A852RPT_REP_PARM_ORDEN, T001I3_n852RPT_REP_PARM_ORDEN, T001I3_A853RPT_REP_PARM_ESTADO, T001I3_n853RPT_REP_PARM_ESTADO, T001I3_A840RPT_PAR_ID
            }
            , new Object[] {
            T001I4_A841RPT_PAR_DESCRIPCION, T001I4_n841RPT_PAR_DESCRIPCION, T001I4_A860RPT_PAR_NOMBREINTERNO, T001I4_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001I5_A843RPT_REP_ID, T001I5_A848RPT_REP_USUARIO_CREACION, T001I5_n848RPT_REP_USUARIO_CREACION, T001I5_A850RPT_REP_USUARIO_MODIFICA, T001I5_n850RPT_REP_USUARIO_MODIFICA, T001I5_A847RPT_REP_FECHA_CREACION, T001I5_n847RPT_REP_FECHA_CREACION, T001I5_A849RPT_REP_FECHA_MODIFICA, T001I5_n849RPT_REP_FECHA_MODIFICA, T001I5_A844RPT_REP_NOMBRE,
            T001I5_n844RPT_REP_NOMBRE, T001I5_A845RPT_REP_DESCRIPCION, T001I5_n845RPT_REP_DESCRIPCION, T001I5_A846RPT_REP_FORMATO, T001I5_n846RPT_REP_FORMATO, T001I5_A851RPT_REP_ESTADO, T001I5_n851RPT_REP_ESTADO
            }
            , new Object[] {
            T001I6_A843RPT_REP_ID, T001I6_A848RPT_REP_USUARIO_CREACION, T001I6_n848RPT_REP_USUARIO_CREACION, T001I6_A850RPT_REP_USUARIO_MODIFICA, T001I6_n850RPT_REP_USUARIO_MODIFICA, T001I6_A847RPT_REP_FECHA_CREACION, T001I6_n847RPT_REP_FECHA_CREACION, T001I6_A849RPT_REP_FECHA_MODIFICA, T001I6_n849RPT_REP_FECHA_MODIFICA, T001I6_A844RPT_REP_NOMBRE,
            T001I6_n844RPT_REP_NOMBRE, T001I6_A845RPT_REP_DESCRIPCION, T001I6_n845RPT_REP_DESCRIPCION, T001I6_A846RPT_REP_FORMATO, T001I6_n846RPT_REP_FORMATO, T001I6_A851RPT_REP_ESTADO, T001I6_n851RPT_REP_ESTADO
            }
            , new Object[] {
            T001I7_A843RPT_REP_ID, T001I7_A848RPT_REP_USUARIO_CREACION, T001I7_n848RPT_REP_USUARIO_CREACION, T001I7_A850RPT_REP_USUARIO_MODIFICA, T001I7_n850RPT_REP_USUARIO_MODIFICA, T001I7_A847RPT_REP_FECHA_CREACION, T001I7_n847RPT_REP_FECHA_CREACION, T001I7_A849RPT_REP_FECHA_MODIFICA, T001I7_n849RPT_REP_FECHA_MODIFICA, T001I7_A844RPT_REP_NOMBRE,
            T001I7_n844RPT_REP_NOMBRE, T001I7_A845RPT_REP_DESCRIPCION, T001I7_n845RPT_REP_DESCRIPCION, T001I7_A846RPT_REP_FORMATO, T001I7_n846RPT_REP_FORMATO, T001I7_A851RPT_REP_ESTADO, T001I7_n851RPT_REP_ESTADO
            }
            , new Object[] {
            T001I8_A843RPT_REP_ID
            }
            , new Object[] {
            T001I9_A843RPT_REP_ID
            }
            , new Object[] {
            T001I10_A843RPT_REP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            T001I12_A843RPT_REP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001I15_A843RPT_REP_ID
            }
            , new Object[] {
            T001I16_A843RPT_REP_ID, T001I16_A841RPT_PAR_DESCRIPCION, T001I16_n841RPT_PAR_DESCRIPCION, T001I16_A860RPT_PAR_NOMBREINTERNO, T001I16_n860RPT_PAR_NOMBREINTERNO, T001I16_A852RPT_REP_PARM_ORDEN, T001I16_n852RPT_REP_PARM_ORDEN, T001I16_A853RPT_REP_PARM_ESTADO, T001I16_n853RPT_REP_PARM_ESTADO, T001I16_A840RPT_PAR_ID
            }
            , new Object[] {
            T001I17_A841RPT_PAR_DESCRIPCION, T001I17_n841RPT_PAR_DESCRIPCION, T001I17_A860RPT_PAR_NOMBREINTERNO, T001I17_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001I18_A843RPT_REP_ID, T001I18_A840RPT_PAR_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001I22_A841RPT_PAR_DESCRIPCION, T001I22_n841RPT_PAR_DESCRIPCION, T001I22_A860RPT_PAR_NOMBREINTERNO, T001I22_n860RPT_PAR_NOMBREINTERNO
            }
            , new Object[] {
            T001I23_A843RPT_REP_ID, T001I23_A840RPT_PAR_ID
            }
         }
      );
      AV13Pgmname = "RPT_REPORTE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridrpt_reporte_rpt_rep_parm_Backcolorstyle ;
   private byte subGridrpt_reporte_rpt_rep_parm_Allowselection ;
   private byte subGridrpt_reporte_rpt_rep_parm_Allowhovering ;
   private byte subGridrpt_reporte_rpt_rep_parm_Allowcollapsing ;
   private byte subGridrpt_reporte_rpt_rep_parm_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridrpt_reporte_rpt_rep_parm_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_66 ;
   private short wcpOAV7RPT_REP_ID ;
   private short Z843RPT_REP_ID ;
   private short nRC_GXsfl_58 ;
   private short nGXsfl_58_idx=1 ;
   private short Z840RPT_PAR_ID ;
   private short Z852RPT_REP_PARM_ORDEN ;
   private short nRcdDeleted_66 ;
   private short nRcdExists_66 ;
   private short A840RPT_PAR_ID ;
   private short AV7RPT_REP_ID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A843RPT_REP_ID ;
   private short A852RPT_REP_PARM_ORDEN ;
   private short nBlankRcdCount66 ;
   private short RcdFound66 ;
   private short nBlankRcdUsr66 ;
   private short RcdFound65 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRPT_REP_ID_Enabled ;
   private int edtRPT_REP_NOMBRE_Enabled ;
   private int edtRPT_REP_DESCRIPCION_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtRPT_PAR_ID_Enabled ;
   private int edtRPT_PAR_DESCRIPCION_Enabled ;
   private int edtRPT_REP_PARM_ORDEN_Enabled ;
   private int subGridrpt_reporte_rpt_rep_parm_Selectioncolor ;
   private int subGridrpt_reporte_rpt_rep_parm_Hoveringcolor ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridrpt_reporte_rpt_rep_parm_Backcolor ;
   private int subGridrpt_reporte_rpt_rep_parm_Allbackcolor ;
   private int imgprompt_840_Visible ;
   private int defedtRPT_PAR_ID_Enabled ;
   private int idxLst ;
   private long GRIDRPT_REPORTE_RPT_REP_PARM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String sGXsfl_58_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z851RPT_REP_ESTADO ;
   private String Z853RPT_REP_PARM_ESTADO ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A851RPT_REP_ESTADO ;
   private String GXCCtl ;
   private String A853RPT_REP_PARM_ESTADO ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRPT_REP_NOMBRE_Internalname ;
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
   private String edtRPT_REP_ID_Internalname ;
   private String edtRPT_REP_ID_Jsonclick ;
   private String edtRPT_REP_NOMBRE_Jsonclick ;
   private String edtRPT_REP_DESCRIPCION_Internalname ;
   private String edtRPT_REP_DESCRIPCION_Jsonclick ;
   private String divRpt_rep_parmtable_Internalname ;
   private String lblTitlerpt_rep_parm_Internalname ;
   private String lblTitlerpt_rep_parm_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode66 ;
   private String edtRPT_PAR_ID_Internalname ;
   private String edtRPT_PAR_DESCRIPCION_Internalname ;
   private String edtRPT_REP_PARM_ORDEN_Internalname ;
   private String imgprompt_840_Link ;
   private String sStyleString ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode65 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgprompt_840_Internalname ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGridrpt_reporte_rpt_rep_parm_Class ;
   private String subGridrpt_reporte_rpt_rep_parm_Linesclass ;
   private String ROClassString ;
   private String edtRPT_PAR_ID_Jsonclick ;
   private String sImgUrl ;
   private String edtRPT_PAR_DESCRIPCION_Jsonclick ;
   private String edtRPT_REP_PARM_ORDEN_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridrpt_reporte_rpt_rep_parm_Internalname ;
   private java.util.Date Z847RPT_REP_FECHA_CREACION ;
   private java.util.Date Z849RPT_REP_FECHA_MODIFICA ;
   private java.util.Date A847RPT_REP_FECHA_CREACION ;
   private java.util.Date A849RPT_REP_FECHA_MODIFICA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n846RPT_REP_FORMATO ;
   private boolean n851RPT_REP_ESTADO ;
   private boolean n853RPT_REP_PARM_ESTADO ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean n844RPT_REP_NOMBRE ;
   private boolean n845RPT_REP_DESCRIPCION ;
   private boolean n848RPT_REP_USUARIO_CREACION ;
   private boolean n850RPT_REP_USUARIO_MODIFICA ;
   private boolean n847RPT_REP_FECHA_CREACION ;
   private boolean n849RPT_REP_FECHA_MODIFICA ;
   private boolean n860RPT_PAR_NOMBREINTERNO ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n841RPT_PAR_DESCRIPCION ;
   private boolean n852RPT_REP_PARM_ORDEN ;
   private String Z848RPT_REP_USUARIO_CREACION ;
   private String Z850RPT_REP_USUARIO_MODIFICA ;
   private String Z844RPT_REP_NOMBRE ;
   private String Z845RPT_REP_DESCRIPCION ;
   private String Z846RPT_REP_FORMATO ;
   private String A846RPT_REP_FORMATO ;
   private String A844RPT_REP_NOMBRE ;
   private String A845RPT_REP_DESCRIPCION ;
   private String A841RPT_PAR_DESCRIPCION ;
   private String A848RPT_REP_USUARIO_CREACION ;
   private String A850RPT_REP_USUARIO_MODIFICA ;
   private String AV12Usuario ;
   private String A860RPT_PAR_NOMBREINTERNO ;
   private String Z841RPT_PAR_DESCRIPCION ;
   private String Z860RPT_PAR_NOMBREINTERNO ;
   private com.genexus.webpanels.GXWebGrid Gridrpt_reporte_rpt_rep_parmContainer ;
   private com.genexus.webpanels.GXWebRow Gridrpt_reporte_rpt_rep_parmRow ;
   private com.genexus.webpanels.GXWebColumn Gridrpt_reporte_rpt_rep_parmColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbRPT_REP_FORMATO ;
   private HTMLChoice cmbRPT_REP_ESTADO ;
   private HTMLChoice cmbRPT_REP_PARM_ESTADO ;
   private IDataStoreProvider pr_default ;
   private short[] T001I7_A843RPT_REP_ID ;
   private String[] T001I7_A848RPT_REP_USUARIO_CREACION ;
   private boolean[] T001I7_n848RPT_REP_USUARIO_CREACION ;
   private String[] T001I7_A850RPT_REP_USUARIO_MODIFICA ;
   private boolean[] T001I7_n850RPT_REP_USUARIO_MODIFICA ;
   private java.util.Date[] T001I7_A847RPT_REP_FECHA_CREACION ;
   private boolean[] T001I7_n847RPT_REP_FECHA_CREACION ;
   private java.util.Date[] T001I7_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] T001I7_n849RPT_REP_FECHA_MODIFICA ;
   private String[] T001I7_A844RPT_REP_NOMBRE ;
   private boolean[] T001I7_n844RPT_REP_NOMBRE ;
   private String[] T001I7_A845RPT_REP_DESCRIPCION ;
   private boolean[] T001I7_n845RPT_REP_DESCRIPCION ;
   private String[] T001I7_A846RPT_REP_FORMATO ;
   private boolean[] T001I7_n846RPT_REP_FORMATO ;
   private String[] T001I7_A851RPT_REP_ESTADO ;
   private boolean[] T001I7_n851RPT_REP_ESTADO ;
   private short[] T001I8_A843RPT_REP_ID ;
   private short[] T001I6_A843RPT_REP_ID ;
   private String[] T001I6_A848RPT_REP_USUARIO_CREACION ;
   private boolean[] T001I6_n848RPT_REP_USUARIO_CREACION ;
   private String[] T001I6_A850RPT_REP_USUARIO_MODIFICA ;
   private boolean[] T001I6_n850RPT_REP_USUARIO_MODIFICA ;
   private java.util.Date[] T001I6_A847RPT_REP_FECHA_CREACION ;
   private boolean[] T001I6_n847RPT_REP_FECHA_CREACION ;
   private java.util.Date[] T001I6_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] T001I6_n849RPT_REP_FECHA_MODIFICA ;
   private String[] T001I6_A844RPT_REP_NOMBRE ;
   private boolean[] T001I6_n844RPT_REP_NOMBRE ;
   private String[] T001I6_A845RPT_REP_DESCRIPCION ;
   private boolean[] T001I6_n845RPT_REP_DESCRIPCION ;
   private String[] T001I6_A846RPT_REP_FORMATO ;
   private boolean[] T001I6_n846RPT_REP_FORMATO ;
   private String[] T001I6_A851RPT_REP_ESTADO ;
   private boolean[] T001I6_n851RPT_REP_ESTADO ;
   private short[] T001I9_A843RPT_REP_ID ;
   private short[] T001I10_A843RPT_REP_ID ;
   private short[] T001I5_A843RPT_REP_ID ;
   private String[] T001I5_A848RPT_REP_USUARIO_CREACION ;
   private boolean[] T001I5_n848RPT_REP_USUARIO_CREACION ;
   private String[] T001I5_A850RPT_REP_USUARIO_MODIFICA ;
   private boolean[] T001I5_n850RPT_REP_USUARIO_MODIFICA ;
   private java.util.Date[] T001I5_A847RPT_REP_FECHA_CREACION ;
   private boolean[] T001I5_n847RPT_REP_FECHA_CREACION ;
   private java.util.Date[] T001I5_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] T001I5_n849RPT_REP_FECHA_MODIFICA ;
   private String[] T001I5_A844RPT_REP_NOMBRE ;
   private boolean[] T001I5_n844RPT_REP_NOMBRE ;
   private String[] T001I5_A845RPT_REP_DESCRIPCION ;
   private boolean[] T001I5_n845RPT_REP_DESCRIPCION ;
   private String[] T001I5_A846RPT_REP_FORMATO ;
   private boolean[] T001I5_n846RPT_REP_FORMATO ;
   private String[] T001I5_A851RPT_REP_ESTADO ;
   private boolean[] T001I5_n851RPT_REP_ESTADO ;
   private short[] T001I12_A843RPT_REP_ID ;
   private short[] T001I15_A843RPT_REP_ID ;
   private short[] T001I16_A843RPT_REP_ID ;
   private String[] T001I16_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001I16_n841RPT_PAR_DESCRIPCION ;
   private String[] T001I16_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001I16_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001I16_A852RPT_REP_PARM_ORDEN ;
   private boolean[] T001I16_n852RPT_REP_PARM_ORDEN ;
   private String[] T001I16_A853RPT_REP_PARM_ESTADO ;
   private boolean[] T001I16_n853RPT_REP_PARM_ESTADO ;
   private short[] T001I16_A840RPT_PAR_ID ;
   private String[] T001I4_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001I4_n841RPT_PAR_DESCRIPCION ;
   private String[] T001I4_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001I4_n860RPT_PAR_NOMBREINTERNO ;
   private String[] T001I17_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001I17_n841RPT_PAR_DESCRIPCION ;
   private String[] T001I17_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001I17_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001I18_A843RPT_REP_ID ;
   private short[] T001I18_A840RPT_PAR_ID ;
   private short[] T001I3_A843RPT_REP_ID ;
   private short[] T001I3_A852RPT_REP_PARM_ORDEN ;
   private boolean[] T001I3_n852RPT_REP_PARM_ORDEN ;
   private String[] T001I3_A853RPT_REP_PARM_ESTADO ;
   private boolean[] T001I3_n853RPT_REP_PARM_ESTADO ;
   private short[] T001I3_A840RPT_PAR_ID ;
   private short[] T001I2_A843RPT_REP_ID ;
   private short[] T001I2_A852RPT_REP_PARM_ORDEN ;
   private boolean[] T001I2_n852RPT_REP_PARM_ORDEN ;
   private String[] T001I2_A853RPT_REP_PARM_ESTADO ;
   private boolean[] T001I2_n853RPT_REP_PARM_ESTADO ;
   private short[] T001I2_A840RPT_PAR_ID ;
   private String[] T001I22_A841RPT_PAR_DESCRIPCION ;
   private boolean[] T001I22_n841RPT_PAR_DESCRIPCION ;
   private String[] T001I22_A860RPT_PAR_NOMBREINTERNO ;
   private boolean[] T001I22_n860RPT_PAR_NOMBREINTERNO ;
   private short[] T001I23_A843RPT_REP_ID ;
   private short[] T001I23_A840RPT_PAR_ID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class rpt_reporte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001I2", "SELECT RPT_REP_ID, RPT_REP_PARM_ORDEN, RPT_REP_PARM_ESTADO, RPT_PAR_ID FROM RPT_REP_PARM WHERE RPT_REP_ID = ? AND RPT_PAR_ID = ?  FOR UPDATE OF RPT_REP_PARM_ORDEN, RPT_REP_PARM_ESTADO NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I3", "SELECT RPT_REP_ID, RPT_REP_PARM_ORDEN, RPT_REP_PARM_ESTADO, RPT_PAR_ID FROM RPT_REP_PARM WHERE RPT_REP_ID = ? AND RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I4", "SELECT RPT_PAR_DESCRIPCION, RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I5", "SELECT RPT_REP_ID, RPT_REP_USUARIO_CREACION, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_CREACION, RPT_REP_FECHA_MODIFICA, RPT_REP_NOMBRE, RPT_REP_DESCRIPCION, RPT_REP_FORMATO, RPT_REP_ESTADO FROM RPT_REPORTE WHERE RPT_REP_ID = ?  FOR UPDATE OF RPT_REP_USUARIO_CREACION, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_CREACION, RPT_REP_FECHA_MODIFICA, RPT_REP_NOMBRE, RPT_REP_DESCRIPCION, RPT_REP_FORMATO, RPT_REP_ESTADO NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I6", "SELECT RPT_REP_ID, RPT_REP_USUARIO_CREACION, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_CREACION, RPT_REP_FECHA_MODIFICA, RPT_REP_NOMBRE, RPT_REP_DESCRIPCION, RPT_REP_FORMATO, RPT_REP_ESTADO FROM RPT_REPORTE WHERE RPT_REP_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I7", "SELECT /*+ FIRST_ROWS(100) */ TM1.RPT_REP_ID, TM1.RPT_REP_USUARIO_CREACION, TM1.RPT_REP_USUARIO_MODIFICA, TM1.RPT_REP_FECHA_CREACION, TM1.RPT_REP_FECHA_MODIFICA, TM1.RPT_REP_NOMBRE, TM1.RPT_REP_DESCRIPCION, TM1.RPT_REP_FORMATO, TM1.RPT_REP_ESTADO FROM RPT_REPORTE TM1 WHERE TM1.RPT_REP_ID = ? ORDER BY TM1.RPT_REP_ID ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001I8", "SELECT /*+ FIRST_ROWS(1) */ RPT_REP_ID FROM RPT_REPORTE WHERE RPT_REP_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RPT_REP_ID FROM RPT_REPORTE WHERE ( RPT_REP_ID > ?) ORDER BY RPT_REP_ID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001I10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RPT_REP_ID FROM RPT_REPORTE WHERE ( RPT_REP_ID < ?) ORDER BY RPT_REP_ID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001I11", "INSERT INTO RPT_REPORTE(RPT_REP_USUARIO_CREACION, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_CREACION, RPT_REP_FECHA_MODIFICA, RPT_REP_NOMBRE, RPT_REP_DESCRIPCION, RPT_REP_FORMATO, RPT_REP_ESTADO) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "RPT_REPORTE")
         ,new ForEachCursor("T001I12", "SELECT RPT_REP_ID.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001I13", "UPDATE RPT_REPORTE SET RPT_REP_USUARIO_CREACION=?, RPT_REP_USUARIO_MODIFICA=?, RPT_REP_FECHA_CREACION=?, RPT_REP_FECHA_MODIFICA=?, RPT_REP_NOMBRE=?, RPT_REP_DESCRIPCION=?, RPT_REP_FORMATO=?, RPT_REP_ESTADO=?  WHERE RPT_REP_ID = ?", GX_NOMASK, "RPT_REPORTE")
         ,new UpdateCursor("T001I14", "DELETE FROM RPT_REPORTE  WHERE RPT_REP_ID = ?", GX_NOMASK, "RPT_REPORTE")
         ,new ForEachCursor("T001I15", "SELECT /*+ FIRST_ROWS(100) */ RPT_REP_ID FROM RPT_REPORTE ORDER BY RPT_REP_ID ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001I16", "SELECT T1.RPT_REP_ID, T2.RPT_PAR_DESCRIPCION, T2.RPT_PAR_NOMBREINTERNO, T1.RPT_REP_PARM_ORDEN, T1.RPT_REP_PARM_ESTADO, T1.RPT_PAR_ID FROM (RPT_REP_PARM T1 INNER JOIN RPT_PARAMETROS T2 ON T2.RPT_PAR_ID = T1.RPT_PAR_ID) WHERE T1.RPT_REP_ID = ? and T1.RPT_PAR_ID = ? ORDER BY T1.RPT_REP_ID, T1.RPT_PAR_ID ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T001I17", "SELECT RPT_PAR_DESCRIPCION, RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I18", "SELECT RPT_REP_ID, RPT_PAR_ID FROM RPT_REP_PARM WHERE RPT_REP_ID = ? AND RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001I19", "INSERT INTO RPT_REP_PARM(RPT_REP_ID, RPT_REP_PARM_ORDEN, RPT_REP_PARM_ESTADO, RPT_PAR_ID) VALUES(?, ?, ?, ?)", GX_NOMASK, "RPT_REP_PARM")
         ,new UpdateCursor("T001I20", "UPDATE RPT_REP_PARM SET RPT_REP_PARM_ORDEN=?, RPT_REP_PARM_ESTADO=?  WHERE RPT_REP_ID = ? AND RPT_PAR_ID = ?", GX_NOMASK, "RPT_REP_PARM")
         ,new UpdateCursor("T001I21", "DELETE FROM RPT_REP_PARM  WHERE RPT_REP_ID = ? AND RPT_PAR_ID = ?", GX_NOMASK, "RPT_REP_PARM")
         ,new ForEachCursor("T001I22", "SELECT RPT_PAR_DESCRIPCION, RPT_PAR_NOMBREINTERNO FROM RPT_PARAMETROS WHERE RPT_PAR_ID = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I23", "SELECT RPT_REP_ID, RPT_PAR_ID FROM RPT_REP_PARM WHERE RPT_REP_ID = ? ORDER BY RPT_REP_ID, RPT_PAR_ID ",true, GX_NOMASK, false, this,11,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 4 :
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 5 :
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               return;
            case 11 :
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               stmt.setShort(9, ((Number) parms[16]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setShort(3, ((Number) parms[4]).shortValue());
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

