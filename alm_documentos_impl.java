/*
               File: alm_documentos_impl
        Description: ALM_DOCUMENTOS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:34.91
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

public final  class alm_documentos_impl extends GXDataArea
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
            AV7Docu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Docu_Nro", GXutil.ltrim( GXutil.str( AV7Docu_Nro, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vDOCU_NRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Docu_Nro), "ZZZ9")));
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
      cmbDocu_Estado.setName( "DOCU_ESTADO" );
      cmbDocu_Estado.setWebtags( "" );
      cmbDocu_Estado.addItem("A", "Activo", (short)(0));
      cmbDocu_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbDocu_Estado.getItemCount() > 0 )
      {
         A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
         n822Docu_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
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
         Form.getMeta().addItem("description", "ALM_DOCUMENTOS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtDocu_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_documentos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_documentos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_documentos_impl.class ));
   }

   public alm_documentos_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbDocu_Estado = new HTMLChoice();
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
      if ( cmbDocu_Estado.getItemCount() > 0 )
      {
         A822Docu_Estado = cmbDocu_Estado.getValidValue(A822Docu_Estado) ;
         n822Docu_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Documentos", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_DOCUMENTOS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_DOCUMENTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Nro_Internalname, "Nro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Nro_Internalname, GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")), ((edtDocu_Nro_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Nro_Jsonclick, 0, "Attribute", "", "", "", 1, edtDocu_Nro_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_DOCUMENTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Descripcion_Internalname, A820Docu_Descripcion, GXutil.rtrim( localUtil.format( A820Docu_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtDocu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_DOCUMENTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDocu_Prefijo_Internalname, "Prefijo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtDocu_Prefijo_Internalname, A821Docu_Prefijo, GXutil.rtrim( localUtil.format( A821Docu_Prefijo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocu_Prefijo_Jsonclick, 0, "Attribute", "", "", "", 1, edtDocu_Prefijo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_DOCUMENTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbDocu_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDocu_Estado, cmbDocu_Estado.getInternalname(), GXutil.rtrim( A822Docu_Estado), 1, cmbDocu_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDocu_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_ALM_DOCUMENTOS.htm");
         cmbDocu_Estado.setValue( GXutil.rtrim( A822Docu_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDocu_Estado.getInternalname(), "Values", cmbDocu_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_DOCUMENTOS.htm");
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
      e111F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( edtDocu_Nro_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
            A820Docu_Descripcion = httpContext.cgiGet( edtDocu_Descripcion_Internalname) ;
            n820Docu_Descripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A820Docu_Descripcion", A820Docu_Descripcion);
            n820Docu_Descripcion = ((GXutil.strcmp("", A820Docu_Descripcion)==0) ? true : false) ;
            A821Docu_Prefijo = httpContext.cgiGet( edtDocu_Prefijo_Internalname) ;
            n821Docu_Prefijo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A821Docu_Prefijo", A821Docu_Prefijo);
            n821Docu_Prefijo = ((GXutil.strcmp("", A821Docu_Prefijo)==0) ? true : false) ;
            cmbDocu_Estado.setValue( httpContext.cgiGet( cmbDocu_Estado.getInternalname()) );
            A822Docu_Estado = httpContext.cgiGet( cmbDocu_Estado.getInternalname()) ;
            n822Docu_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
            n822Docu_Estado = ((GXutil.strcmp("", A822Docu_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( "Z819Docu_Nro"), ",", ".")) ;
            Z823Docu_UsuarioCrea = httpContext.cgiGet( "Z823Docu_UsuarioCrea") ;
            n823Docu_UsuarioCrea = ((GXutil.strcmp("", A823Docu_UsuarioCrea)==0) ? true : false) ;
            Z825Docu_UsuarioModifica = httpContext.cgiGet( "Z825Docu_UsuarioModifica") ;
            n825Docu_UsuarioModifica = ((GXutil.strcmp("", A825Docu_UsuarioModifica)==0) ? true : false) ;
            Z824Docu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z824Docu_FechaCrea"), 0) ;
            n824Docu_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A824Docu_FechaCrea) ? true : false) ;
            Z826Docu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z826Docu_FechaModifica"), 0) ;
            n826Docu_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A826Docu_FechaModifica) ? true : false) ;
            Z820Docu_Descripcion = httpContext.cgiGet( "Z820Docu_Descripcion") ;
            n820Docu_Descripcion = ((GXutil.strcmp("", A820Docu_Descripcion)==0) ? true : false) ;
            Z821Docu_Prefijo = httpContext.cgiGet( "Z821Docu_Prefijo") ;
            n821Docu_Prefijo = ((GXutil.strcmp("", A821Docu_Prefijo)==0) ? true : false) ;
            Z822Docu_Estado = httpContext.cgiGet( "Z822Docu_Estado") ;
            n822Docu_Estado = ((GXutil.strcmp("", A822Docu_Estado)==0) ? true : false) ;
            A823Docu_UsuarioCrea = httpContext.cgiGet( "Z823Docu_UsuarioCrea") ;
            n823Docu_UsuarioCrea = false ;
            n823Docu_UsuarioCrea = ((GXutil.strcmp("", A823Docu_UsuarioCrea)==0) ? true : false) ;
            A825Docu_UsuarioModifica = httpContext.cgiGet( "Z825Docu_UsuarioModifica") ;
            n825Docu_UsuarioModifica = false ;
            n825Docu_UsuarioModifica = ((GXutil.strcmp("", A825Docu_UsuarioModifica)==0) ? true : false) ;
            A824Docu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z824Docu_FechaCrea"), 0) ;
            n824Docu_FechaCrea = false ;
            n824Docu_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A824Docu_FechaCrea) ? true : false) ;
            A826Docu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z826Docu_FechaModifica"), 0) ;
            n826Docu_FechaModifica = false ;
            n826Docu_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A826Docu_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( "vDOCU_NRO"), ",", ".")) ;
            A823Docu_UsuarioCrea = httpContext.cgiGet( "DOCU_USUARIOCREA") ;
            n823Docu_UsuarioCrea = ((GXutil.strcmp("", A823Docu_UsuarioCrea)==0) ? true : false) ;
            A825Docu_UsuarioModifica = httpContext.cgiGet( "DOCU_USUARIOMODIFICA") ;
            n825Docu_UsuarioModifica = ((GXutil.strcmp("", A825Docu_UsuarioModifica)==0) ? true : false) ;
            A824Docu_FechaCrea = localUtil.ctot( httpContext.cgiGet( "DOCU_FECHACREA"), 0) ;
            n824Docu_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A824Docu_FechaCrea) ? true : false) ;
            A826Docu_FechaModifica = localUtil.ctot( httpContext.cgiGet( "DOCU_FECHAMODIFICA"), 0) ;
            n826Docu_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A826Docu_FechaModifica) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_DOCUMENTOS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A819Docu_Nro != Z819Docu_Nro ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_documentos:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A819Docu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
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
                  sMode59 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode59 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound59 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_1F0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DOCU_NRO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDocu_Nro_Internalname ;
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
                        e111F2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121F2 ();
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
         e121F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1F59( ) ;
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
         disableAttributes1F59( ) ;
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

   public void confirm_1F0( )
   {
      beforeValidate1F59( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1F59( ) ;
         }
         else
         {
            checkExtendedTable1F59( ) ;
            closeExtendedTableCursors1F59( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption1F0( )
   {
   }

   public void e111F2( )
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

   public void e121F2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_documentos") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1F59( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z823Docu_UsuarioCrea = T001F3_A823Docu_UsuarioCrea[0] ;
            Z825Docu_UsuarioModifica = T001F3_A825Docu_UsuarioModifica[0] ;
            Z824Docu_FechaCrea = T001F3_A824Docu_FechaCrea[0] ;
            Z826Docu_FechaModifica = T001F3_A826Docu_FechaModifica[0] ;
            Z820Docu_Descripcion = T001F3_A820Docu_Descripcion[0] ;
            Z821Docu_Prefijo = T001F3_A821Docu_Prefijo[0] ;
            Z822Docu_Estado = T001F3_A822Docu_Estado[0] ;
         }
         else
         {
            Z823Docu_UsuarioCrea = A823Docu_UsuarioCrea ;
            Z825Docu_UsuarioModifica = A825Docu_UsuarioModifica ;
            Z824Docu_FechaCrea = A824Docu_FechaCrea ;
            Z826Docu_FechaModifica = A826Docu_FechaModifica ;
            Z820Docu_Descripcion = A820Docu_Descripcion ;
            Z821Docu_Prefijo = A821Docu_Prefijo ;
            Z822Docu_Estado = A822Docu_Estado ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z819Docu_Nro = A819Docu_Nro ;
         Z823Docu_UsuarioCrea = A823Docu_UsuarioCrea ;
         Z825Docu_UsuarioModifica = A825Docu_UsuarioModifica ;
         Z824Docu_FechaCrea = A824Docu_FechaCrea ;
         Z826Docu_FechaModifica = A826Docu_FechaModifica ;
         Z820Docu_Descripcion = A820Docu_Descripcion ;
         Z821Docu_Prefijo = A821Docu_Prefijo ;
         Z822Docu_Estado = A822Docu_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDocu_Nro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), true);
      edtDocu_Nro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Docu_Nro) )
      {
         A819Docu_Nro = AV7Docu_Nro ;
         httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
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

   public void load1F59( )
   {
      /* Using cursor T001F4 */
      pr_default.execute(2, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A823Docu_UsuarioCrea = T001F4_A823Docu_UsuarioCrea[0] ;
         n823Docu_UsuarioCrea = T001F4_n823Docu_UsuarioCrea[0] ;
         A825Docu_UsuarioModifica = T001F4_A825Docu_UsuarioModifica[0] ;
         n825Docu_UsuarioModifica = T001F4_n825Docu_UsuarioModifica[0] ;
         A824Docu_FechaCrea = T001F4_A824Docu_FechaCrea[0] ;
         n824Docu_FechaCrea = T001F4_n824Docu_FechaCrea[0] ;
         A826Docu_FechaModifica = T001F4_A826Docu_FechaModifica[0] ;
         n826Docu_FechaModifica = T001F4_n826Docu_FechaModifica[0] ;
         A820Docu_Descripcion = T001F4_A820Docu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820Docu_Descripcion", A820Docu_Descripcion);
         n820Docu_Descripcion = T001F4_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = T001F4_A821Docu_Prefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821Docu_Prefijo", A821Docu_Prefijo);
         n821Docu_Prefijo = T001F4_n821Docu_Prefijo[0] ;
         A822Docu_Estado = T001F4_A822Docu_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
         n822Docu_Estado = T001F4_n822Docu_Estado[0] ;
         zm1F59( -9) ;
      }
      pr_default.close(2);
      onLoadActions1F59( ) ;
   }

   public void onLoadActions1F59( )
   {
      AV13Pgmname = "ALM_DOCUMENTOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1F59( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_DOCUMENTOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1F59( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F59( )
   {
      /* Using cursor T001F5 */
      pr_default.execute(3, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound59 = (short)(1) ;
      }
      else
      {
         RcdFound59 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001F3 */
      pr_default.execute(1, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F59( 9) ;
         RcdFound59 = (short)(1) ;
         A819Docu_Nro = T001F3_A819Docu_Nro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
         A823Docu_UsuarioCrea = T001F3_A823Docu_UsuarioCrea[0] ;
         n823Docu_UsuarioCrea = T001F3_n823Docu_UsuarioCrea[0] ;
         A825Docu_UsuarioModifica = T001F3_A825Docu_UsuarioModifica[0] ;
         n825Docu_UsuarioModifica = T001F3_n825Docu_UsuarioModifica[0] ;
         A824Docu_FechaCrea = T001F3_A824Docu_FechaCrea[0] ;
         n824Docu_FechaCrea = T001F3_n824Docu_FechaCrea[0] ;
         A826Docu_FechaModifica = T001F3_A826Docu_FechaModifica[0] ;
         n826Docu_FechaModifica = T001F3_n826Docu_FechaModifica[0] ;
         A820Docu_Descripcion = T001F3_A820Docu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820Docu_Descripcion", A820Docu_Descripcion);
         n820Docu_Descripcion = T001F3_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = T001F3_A821Docu_Prefijo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821Docu_Prefijo", A821Docu_Prefijo);
         n821Docu_Prefijo = T001F3_n821Docu_Prefijo[0] ;
         A822Docu_Estado = T001F3_A822Docu_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
         n822Docu_Estado = T001F3_n822Docu_Estado[0] ;
         Z819Docu_Nro = A819Docu_Nro ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1F59( ) ;
         if ( AnyError == 1 )
         {
            RcdFound59 = (short)(0) ;
            initializeNonKey1F59( ) ;
         }
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound59 = (short)(0) ;
         initializeNonKey1F59( ) ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1F59( ) ;
      if ( RcdFound59 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound59 = (short)(0) ;
      /* Using cursor T001F6 */
      pr_default.execute(4, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A819Docu_Nro[0] < A819Docu_Nro ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A819Docu_Nro[0] > A819Docu_Nro ) ) )
         {
            A819Docu_Nro = T001F6_A819Docu_Nro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound59 = (short)(0) ;
      /* Using cursor T001F7 */
      pr_default.execute(5, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A819Docu_Nro[0] > A819Docu_Nro ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A819Docu_Nro[0] < A819Docu_Nro ) ) )
         {
            A819Docu_Nro = T001F7_A819Docu_Nro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F59( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtDocu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F59( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound59 == 1 )
         {
            if ( A819Docu_Nro != Z819Docu_Nro )
            {
               A819Docu_Nro = Z819Docu_Nro ;
               httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DOCU_NRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDocu_Nro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDocu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1F59( ) ;
               GX_FocusControl = edtDocu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A819Docu_Nro != Z819Docu_Nro )
            {
               /* Insert record */
               GX_FocusControl = edtDocu_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F59( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DOCU_NRO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDocu_Nro_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDocu_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F59( ) ;
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
      if ( A819Docu_Nro != Z819Docu_Nro )
      {
         A819Docu_Nro = Z819Docu_Nro ;
         httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DOCU_NRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Nro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDocu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1F59( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001F2 */
         pr_default.execute(0, new Object[] {new Short(A819Docu_Nro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DOCUMENTOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z823Docu_UsuarioCrea, T001F2_A823Docu_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z825Docu_UsuarioModifica, T001F2_A825Docu_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z824Docu_FechaCrea, T001F2_A824Docu_FechaCrea[0]) ) || !( GXutil.dateCompare(Z826Docu_FechaModifica, T001F2_A826Docu_FechaModifica[0]) ) || ( GXutil.strcmp(Z820Docu_Descripcion, T001F2_A820Docu_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z821Docu_Prefijo, T001F2_A821Docu_Prefijo[0]) != 0 ) || ( GXutil.strcmp(Z822Docu_Estado, T001F2_A822Docu_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_DOCUMENTOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F59( )
   {
      beforeValidate1F59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F59( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F59( 0) ;
         checkOptimisticConcurrency1F59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F59( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001F8 */
                  pr_default.execute(6, new Object[] {new Boolean(n823Docu_UsuarioCrea), A823Docu_UsuarioCrea, new Boolean(n825Docu_UsuarioModifica), A825Docu_UsuarioModifica, new Boolean(n824Docu_FechaCrea), A824Docu_FechaCrea, new Boolean(n826Docu_FechaModifica), A826Docu_FechaModifica, new Boolean(n820Docu_Descripcion), A820Docu_Descripcion, new Boolean(n821Docu_Prefijo), A821Docu_Prefijo, new Boolean(n822Docu_Estado), A822Docu_Estado});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001F9 */
                  pr_default.execute(7);
                  A819Docu_Nro = T001F9_A819Docu_Nro[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DOCUMENTOS") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption1F0( ) ;
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
            load1F59( ) ;
         }
         endLevel1F59( ) ;
      }
      closeExtendedTableCursors1F59( ) ;
   }

   public void update1F59( )
   {
      beforeValidate1F59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F59( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F59( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001F10 */
                  pr_default.execute(8, new Object[] {new Boolean(n823Docu_UsuarioCrea), A823Docu_UsuarioCrea, new Boolean(n825Docu_UsuarioModifica), A825Docu_UsuarioModifica, new Boolean(n824Docu_FechaCrea), A824Docu_FechaCrea, new Boolean(n826Docu_FechaModifica), A826Docu_FechaModifica, new Boolean(n820Docu_Descripcion), A820Docu_Descripcion, new Boolean(n821Docu_Prefijo), A821Docu_Prefijo, new Boolean(n822Docu_Estado), A822Docu_Estado, new Short(A819Docu_Nro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DOCUMENTOS") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_DOCUMENTOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F59( ) ;
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
         endLevel1F59( ) ;
      }
      closeExtendedTableCursors1F59( ) ;
   }

   public void deferredUpdate1F59( )
   {
   }

   public void delete( )
   {
      beforeValidate1F59( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F59( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F59( ) ;
         afterConfirm1F59( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F59( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001F11 */
               pr_default.execute(9, new Object[] {new Short(A819Docu_Nro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DOCUMENTOS") ;
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
      sMode59 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1F59( ) ;
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1F59( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_DOCUMENTOS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001F12 */
         pr_default.execute(10, new Object[] {new Short(A819Docu_Nro)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Documentos de la Transacción"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001F13 */
         pr_default.execute(11, new Object[] {new Short(A819Docu_Nro)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"DOCUMENTOS DEL MOVIMIENTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel1F59( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F59( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_documentos");
         if ( AnyError == 0 )
         {
            confirmValues1F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_documentos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F59( )
   {
      /* Scan By routine */
      /* Using cursor T001F14 */
      pr_default.execute(12);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A819Docu_Nro = T001F14_A819Docu_Nro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F59( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A819Docu_Nro = T001F14_A819Docu_Nro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
      }
   }

   public void scanEnd1F59( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1F59( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A820Docu_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del documento", 1, "DOCU_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A823Docu_UsuarioCrea = AV12Usuario ;
         n823Docu_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A823Docu_UsuarioCrea", A823Docu_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A825Docu_UsuarioModifica = AV12Usuario ;
         n825Docu_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A825Docu_UsuarioModifica", A825Docu_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A824Docu_FechaCrea = GXutil.now( ) ;
         n824Docu_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A824Docu_FechaCrea", localUtil.ttoc( A824Docu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A826Docu_FechaModifica = GXutil.now( ) ;
         n826Docu_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A826Docu_FechaModifica", localUtil.ttoc( A826Docu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(A821Docu_Prefijo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el preijo del documento", 1, "DOCU_PREFIJO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Prefijo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1F59( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F59( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F59( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F59( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F59( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F59( )
   {
      edtDocu_Nro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), true);
      edtDocu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Descripcion_Enabled, 5, 0)), true);
      edtDocu_Prefijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Prefijo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Prefijo_Enabled, 5, 0)), true);
      cmbDocu_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDocu_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbDocu_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1F0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173576");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_documentos") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Docu_Nro,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z819Docu_Nro", GXutil.ltrim( localUtil.ntoc( Z819Docu_Nro, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z823Docu_UsuarioCrea", Z823Docu_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z825Docu_UsuarioModifica", Z825Docu_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z824Docu_FechaCrea", localUtil.ttoc( Z824Docu_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z826Docu_FechaModifica", localUtil.ttoc( Z826Docu_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z820Docu_Descripcion", Z820Docu_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z821Docu_Prefijo", Z821Docu_Prefijo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z822Docu_Estado", GXutil.rtrim( Z822Docu_Estado));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDOCU_NRO", GXutil.ltrim( localUtil.ntoc( AV7Docu_Nro, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_USUARIOCREA", A823Docu_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_USUARIOMODIFICA", A825Docu_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_FECHACREA", localUtil.ttoc( A824Docu_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_FECHAMODIFICA", localUtil.ttoc( A826Docu_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOCU_NRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Docu_Nro), "ZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_DOCUMENTOS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_documentos:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_documentos") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Docu_Nro,4,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_DOCUMENTOS" ;
   }

   public String getPgmdesc( )
   {
      return "ALM_DOCUMENTOS" ;
   }

   public void initializeNonKey1F59( )
   {
      A823Docu_UsuarioCrea = "" ;
      n823Docu_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A823Docu_UsuarioCrea", A823Docu_UsuarioCrea);
      A825Docu_UsuarioModifica = "" ;
      n825Docu_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A825Docu_UsuarioModifica", A825Docu_UsuarioModifica);
      A824Docu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n824Docu_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A824Docu_FechaCrea", localUtil.ttoc( A824Docu_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A826Docu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n826Docu_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A826Docu_FechaModifica", localUtil.ttoc( A826Docu_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A820Docu_Descripcion = "" ;
      n820Docu_Descripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A820Docu_Descripcion", A820Docu_Descripcion);
      n820Docu_Descripcion = ((GXutil.strcmp("", A820Docu_Descripcion)==0) ? true : false) ;
      A821Docu_Prefijo = "" ;
      n821Docu_Prefijo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A821Docu_Prefijo", A821Docu_Prefijo);
      n821Docu_Prefijo = ((GXutil.strcmp("", A821Docu_Prefijo)==0) ? true : false) ;
      A822Docu_Estado = "" ;
      n822Docu_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A822Docu_Estado", A822Docu_Estado);
      n822Docu_Estado = ((GXutil.strcmp("", A822Docu_Estado)==0) ? true : false) ;
      Z823Docu_UsuarioCrea = "" ;
      Z825Docu_UsuarioModifica = "" ;
      Z824Docu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z826Docu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z820Docu_Descripcion = "" ;
      Z821Docu_Prefijo = "" ;
      Z822Docu_Estado = "" ;
   }

   public void initAll1F59( )
   {
      A819Docu_Nro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A819Docu_Nro", GXutil.ltrim( GXutil.str( A819Docu_Nro, 4, 0)));
      initializeNonKey1F59( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173581");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_documentos.js", "?201861414173581");
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
      edtDocu_Nro_Internalname = "DOCU_NRO" ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION" ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO" ;
      cmbDocu_Estado.setInternalname( "DOCU_ESTADO" );
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
      Form.setCaption( "ALM_DOCUMENTOS" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbDocu_Estado.setJsonclick( "" );
      cmbDocu_Estado.setEnabled( 1 );
      edtDocu_Prefijo_Jsonclick = "" ;
      edtDocu_Prefijo_Enabled = 1 ;
      edtDocu_Descripcion_Jsonclick = "" ;
      edtDocu_Descripcion_Enabled = 1 ;
      edtDocu_Nro_Jsonclick = "" ;
      edtDocu_Nro_Enabled = 0 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Docu_Nro',fld:'vDOCU_NRO',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121F2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z823Docu_UsuarioCrea = "" ;
      Z825Docu_UsuarioModifica = "" ;
      Z824Docu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z826Docu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z820Docu_Descripcion = "" ;
      Z821Docu_Prefijo = "" ;
      Z822Docu_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A822Docu_Estado = "" ;
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
      A820Docu_Descripcion = "" ;
      A821Docu_Prefijo = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A823Docu_UsuarioCrea = "" ;
      A825Docu_UsuarioModifica = "" ;
      A824Docu_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A826Docu_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode59 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV12Usuario = "" ;
      T001F4_A819Docu_Nro = new short[1] ;
      T001F4_A823Docu_UsuarioCrea = new String[] {""} ;
      T001F4_n823Docu_UsuarioCrea = new boolean[] {false} ;
      T001F4_A825Docu_UsuarioModifica = new String[] {""} ;
      T001F4_n825Docu_UsuarioModifica = new boolean[] {false} ;
      T001F4_A824Docu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n824Docu_FechaCrea = new boolean[] {false} ;
      T001F4_A826Docu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n826Docu_FechaModifica = new boolean[] {false} ;
      T001F4_A820Docu_Descripcion = new String[] {""} ;
      T001F4_n820Docu_Descripcion = new boolean[] {false} ;
      T001F4_A821Docu_Prefijo = new String[] {""} ;
      T001F4_n821Docu_Prefijo = new boolean[] {false} ;
      T001F4_A822Docu_Estado = new String[] {""} ;
      T001F4_n822Docu_Estado = new boolean[] {false} ;
      T001F5_A819Docu_Nro = new short[1] ;
      T001F3_A819Docu_Nro = new short[1] ;
      T001F3_A823Docu_UsuarioCrea = new String[] {""} ;
      T001F3_n823Docu_UsuarioCrea = new boolean[] {false} ;
      T001F3_A825Docu_UsuarioModifica = new String[] {""} ;
      T001F3_n825Docu_UsuarioModifica = new boolean[] {false} ;
      T001F3_A824Docu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n824Docu_FechaCrea = new boolean[] {false} ;
      T001F3_A826Docu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n826Docu_FechaModifica = new boolean[] {false} ;
      T001F3_A820Docu_Descripcion = new String[] {""} ;
      T001F3_n820Docu_Descripcion = new boolean[] {false} ;
      T001F3_A821Docu_Prefijo = new String[] {""} ;
      T001F3_n821Docu_Prefijo = new boolean[] {false} ;
      T001F3_A822Docu_Estado = new String[] {""} ;
      T001F3_n822Docu_Estado = new boolean[] {false} ;
      T001F6_A819Docu_Nro = new short[1] ;
      T001F7_A819Docu_Nro = new short[1] ;
      T001F2_A819Docu_Nro = new short[1] ;
      T001F2_A823Docu_UsuarioCrea = new String[] {""} ;
      T001F2_n823Docu_UsuarioCrea = new boolean[] {false} ;
      T001F2_A825Docu_UsuarioModifica = new String[] {""} ;
      T001F2_n825Docu_UsuarioModifica = new boolean[] {false} ;
      T001F2_A824Docu_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n824Docu_FechaCrea = new boolean[] {false} ;
      T001F2_A826Docu_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n826Docu_FechaModifica = new boolean[] {false} ;
      T001F2_A820Docu_Descripcion = new String[] {""} ;
      T001F2_n820Docu_Descripcion = new boolean[] {false} ;
      T001F2_A821Docu_Prefijo = new String[] {""} ;
      T001F2_n821Docu_Prefijo = new boolean[] {false} ;
      T001F2_A822Docu_Estado = new String[] {""} ;
      T001F2_n822Docu_Estado = new boolean[] {false} ;
      T001F9_A819Docu_Nro = new short[1] ;
      T001F12_A46Tran_Id = new long[1] ;
      T001F12_A827Tran_Nro_Documento = new short[1] ;
      T001F13_A38Tpmo_Codigo = new String[] {""} ;
      T001F13_A819Docu_Nro = new short[1] ;
      T001F14_A819Docu_Nro = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_documentos__default(),
         new Object[] {
             new Object[] {
            T001F2_A819Docu_Nro, T001F2_A823Docu_UsuarioCrea, T001F2_n823Docu_UsuarioCrea, T001F2_A825Docu_UsuarioModifica, T001F2_n825Docu_UsuarioModifica, T001F2_A824Docu_FechaCrea, T001F2_n824Docu_FechaCrea, T001F2_A826Docu_FechaModifica, T001F2_n826Docu_FechaModifica, T001F2_A820Docu_Descripcion,
            T001F2_n820Docu_Descripcion, T001F2_A821Docu_Prefijo, T001F2_n821Docu_Prefijo, T001F2_A822Docu_Estado, T001F2_n822Docu_Estado
            }
            , new Object[] {
            T001F3_A819Docu_Nro, T001F3_A823Docu_UsuarioCrea, T001F3_n823Docu_UsuarioCrea, T001F3_A825Docu_UsuarioModifica, T001F3_n825Docu_UsuarioModifica, T001F3_A824Docu_FechaCrea, T001F3_n824Docu_FechaCrea, T001F3_A826Docu_FechaModifica, T001F3_n826Docu_FechaModifica, T001F3_A820Docu_Descripcion,
            T001F3_n820Docu_Descripcion, T001F3_A821Docu_Prefijo, T001F3_n821Docu_Prefijo, T001F3_A822Docu_Estado, T001F3_n822Docu_Estado
            }
            , new Object[] {
            T001F4_A819Docu_Nro, T001F4_A823Docu_UsuarioCrea, T001F4_n823Docu_UsuarioCrea, T001F4_A825Docu_UsuarioModifica, T001F4_n825Docu_UsuarioModifica, T001F4_A824Docu_FechaCrea, T001F4_n824Docu_FechaCrea, T001F4_A826Docu_FechaModifica, T001F4_n826Docu_FechaModifica, T001F4_A820Docu_Descripcion,
            T001F4_n820Docu_Descripcion, T001F4_A821Docu_Prefijo, T001F4_n821Docu_Prefijo, T001F4_A822Docu_Estado, T001F4_n822Docu_Estado
            }
            , new Object[] {
            T001F5_A819Docu_Nro
            }
            , new Object[] {
            T001F6_A819Docu_Nro
            }
            , new Object[] {
            T001F7_A819Docu_Nro
            }
            , new Object[] {
            }
            , new Object[] {
            T001F9_A819Docu_Nro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001F12_A46Tran_Id, T001F12_A827Tran_Nro_Documento
            }
            , new Object[] {
            T001F13_A38Tpmo_Codigo, T001F13_A819Docu_Nro
            }
            , new Object[] {
            T001F14_A819Docu_Nro
            }
         }
      );
      AV13Pgmname = "ALM_DOCUMENTOS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV7Docu_Nro ;
   private short Z819Docu_Nro ;
   private short AV7Docu_Nro ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A819Docu_Nro ;
   private short RcdFound59 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDocu_Nro_Enabled ;
   private int edtDocu_Descripcion_Enabled ;
   private int edtDocu_Prefijo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z822Docu_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A822Docu_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDocu_Descripcion_Internalname ;
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
   private String edtDocu_Nro_Internalname ;
   private String edtDocu_Nro_Jsonclick ;
   private String edtDocu_Descripcion_Jsonclick ;
   private String edtDocu_Prefijo_Internalname ;
   private String edtDocu_Prefijo_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode59 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z824Docu_FechaCrea ;
   private java.util.Date Z826Docu_FechaModifica ;
   private java.util.Date A824Docu_FechaCrea ;
   private java.util.Date A826Docu_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n822Docu_Estado ;
   private boolean wbErr ;
   private boolean n820Docu_Descripcion ;
   private boolean n821Docu_Prefijo ;
   private boolean n823Docu_UsuarioCrea ;
   private boolean n825Docu_UsuarioModifica ;
   private boolean n824Docu_FechaCrea ;
   private boolean n826Docu_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z823Docu_UsuarioCrea ;
   private String Z825Docu_UsuarioModifica ;
   private String Z820Docu_Descripcion ;
   private String Z821Docu_Prefijo ;
   private String A820Docu_Descripcion ;
   private String A821Docu_Prefijo ;
   private String A823Docu_UsuarioCrea ;
   private String A825Docu_UsuarioModifica ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbDocu_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] T001F4_A819Docu_Nro ;
   private String[] T001F4_A823Docu_UsuarioCrea ;
   private boolean[] T001F4_n823Docu_UsuarioCrea ;
   private String[] T001F4_A825Docu_UsuarioModifica ;
   private boolean[] T001F4_n825Docu_UsuarioModifica ;
   private java.util.Date[] T001F4_A824Docu_FechaCrea ;
   private boolean[] T001F4_n824Docu_FechaCrea ;
   private java.util.Date[] T001F4_A826Docu_FechaModifica ;
   private boolean[] T001F4_n826Docu_FechaModifica ;
   private String[] T001F4_A820Docu_Descripcion ;
   private boolean[] T001F4_n820Docu_Descripcion ;
   private String[] T001F4_A821Docu_Prefijo ;
   private boolean[] T001F4_n821Docu_Prefijo ;
   private String[] T001F4_A822Docu_Estado ;
   private boolean[] T001F4_n822Docu_Estado ;
   private short[] T001F5_A819Docu_Nro ;
   private short[] T001F3_A819Docu_Nro ;
   private String[] T001F3_A823Docu_UsuarioCrea ;
   private boolean[] T001F3_n823Docu_UsuarioCrea ;
   private String[] T001F3_A825Docu_UsuarioModifica ;
   private boolean[] T001F3_n825Docu_UsuarioModifica ;
   private java.util.Date[] T001F3_A824Docu_FechaCrea ;
   private boolean[] T001F3_n824Docu_FechaCrea ;
   private java.util.Date[] T001F3_A826Docu_FechaModifica ;
   private boolean[] T001F3_n826Docu_FechaModifica ;
   private String[] T001F3_A820Docu_Descripcion ;
   private boolean[] T001F3_n820Docu_Descripcion ;
   private String[] T001F3_A821Docu_Prefijo ;
   private boolean[] T001F3_n821Docu_Prefijo ;
   private String[] T001F3_A822Docu_Estado ;
   private boolean[] T001F3_n822Docu_Estado ;
   private short[] T001F6_A819Docu_Nro ;
   private short[] T001F7_A819Docu_Nro ;
   private short[] T001F2_A819Docu_Nro ;
   private String[] T001F2_A823Docu_UsuarioCrea ;
   private boolean[] T001F2_n823Docu_UsuarioCrea ;
   private String[] T001F2_A825Docu_UsuarioModifica ;
   private boolean[] T001F2_n825Docu_UsuarioModifica ;
   private java.util.Date[] T001F2_A824Docu_FechaCrea ;
   private boolean[] T001F2_n824Docu_FechaCrea ;
   private java.util.Date[] T001F2_A826Docu_FechaModifica ;
   private boolean[] T001F2_n826Docu_FechaModifica ;
   private String[] T001F2_A820Docu_Descripcion ;
   private boolean[] T001F2_n820Docu_Descripcion ;
   private String[] T001F2_A821Docu_Prefijo ;
   private boolean[] T001F2_n821Docu_Prefijo ;
   private String[] T001F2_A822Docu_Estado ;
   private boolean[] T001F2_n822Docu_Estado ;
   private short[] T001F9_A819Docu_Nro ;
   private long[] T001F12_A46Tran_Id ;
   private short[] T001F12_A827Tran_Nro_Documento ;
   private String[] T001F13_A38Tpmo_Codigo ;
   private short[] T001F13_A819Docu_Nro ;
   private short[] T001F14_A819Docu_Nro ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_documentos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001F2", "SELECT Docu_Nro, Docu_UsuarioCrea, Docu_UsuarioModifica, Docu_FechaCrea, Docu_FechaModifica, Docu_Descripcion, Docu_Prefijo, Docu_Estado FROM ALM_DOCUMENTOS WHERE Docu_Nro = ?  FOR UPDATE OF Docu_UsuarioCrea, Docu_UsuarioModifica, Docu_FechaCrea, Docu_FechaModifica, Docu_Descripcion, Docu_Prefijo, Docu_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F3", "SELECT Docu_Nro, Docu_UsuarioCrea, Docu_UsuarioModifica, Docu_FechaCrea, Docu_FechaModifica, Docu_Descripcion, Docu_Prefijo, Docu_Estado FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Docu_Nro, TM1.Docu_UsuarioCrea, TM1.Docu_UsuarioModifica, TM1.Docu_FechaCrea, TM1.Docu_FechaModifica, TM1.Docu_Descripcion, TM1.Docu_Prefijo, TM1.Docu_Estado FROM ALM_DOCUMENTOS TM1 WHERE TM1.Docu_Nro = ? ORDER BY TM1.Docu_Nro ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001F5", "SELECT /*+ FIRST_ROWS(1) */ Docu_Nro FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Docu_Nro FROM ALM_DOCUMENTOS WHERE ( Docu_Nro > ?) ORDER BY Docu_Nro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001F7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Docu_Nro FROM ALM_DOCUMENTOS WHERE ( Docu_Nro < ?) ORDER BY Docu_Nro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001F8", "INSERT INTO ALM_DOCUMENTOS(Docu_UsuarioCrea, Docu_UsuarioModifica, Docu_FechaCrea, Docu_FechaModifica, Docu_Descripcion, Docu_Prefijo, Docu_Estado) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_DOCUMENTOS")
         ,new ForEachCursor("T001F9", "SELECT Docu_Nro.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001F10", "UPDATE ALM_DOCUMENTOS SET Docu_UsuarioCrea=?, Docu_UsuarioModifica=?, Docu_FechaCrea=?, Docu_FechaModifica=?, Docu_Descripcion=?, Docu_Prefijo=?, Docu_Estado=?  WHERE Docu_Nro = ?", GX_NOMASK, "ALM_DOCUMENTOS")
         ,new UpdateCursor("T001F11", "DELETE FROM ALM_DOCUMENTOS  WHERE Docu_Nro = ?", GX_NOMASK, "ALM_DOCUMENTOS")
         ,new ForEachCursor("T001F12", "SELECT * FROM (SELECT Tran_Id, Tran_Nro_Documento FROM ALM_TRANSACCION_DOCUM WHERE Tran_Nro_Documento = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001F13", "SELECT * FROM (SELECT Tpmo_Codigo, Docu_Nro FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO WHERE Docu_Nro = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001F14", "SELECT /*+ FIRST_ROWS(100) */ Docu_Nro FROM ALM_DOCUMENTOS ORDER BY Docu_Nro ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
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
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 12 :
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               stmt.setShort(8, ((Number) parms[14]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

