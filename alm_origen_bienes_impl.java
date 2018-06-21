/*
               File: alm_origen_bienes_impl
        Description: Orígen de los bienes y destinaciones de las bajas
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:31.29
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

public final  class alm_origen_bienes_impl extends GXDataArea
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
            AV7Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Orig_Identificador", GXutil.ltrim( GXutil.str( AV7Orig_Identificador, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Orig_Identificador), "ZZZZZZZZZZ9")));
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
      cmbOrig_Tipo.setName( "ORIG_TIPO" );
      cmbOrig_Tipo.setWebtags( "" );
      cmbOrig_Tipo.addItem("ORIGE", "Orígen de los bienes", (short)(0));
      cmbOrig_Tipo.addItem("BAJAS", "Destinaciones de las bajas", (short)(0));
      if ( cmbOrig_Tipo.getItemCount() > 0 )
      {
         A640Orig_Tipo = cmbOrig_Tipo.getValidValue(A640Orig_Tipo) ;
         n640Orig_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
      }
      cmbOrig_TipoE_S.setName( "ORIG_TIPOE_S" );
      cmbOrig_TipoE_S.setWebtags( "" );
      cmbOrig_TipoE_S.addItem("E", "ENTRADA", (short)(0));
      cmbOrig_TipoE_S.addItem("S", "SALIDA", (short)(0));
      cmbOrig_TipoE_S.addItem("T", "TRASPASO", (short)(0));
      cmbOrig_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
      if ( cmbOrig_TipoE_S.getItemCount() > 0 )
      {
         A700Orig_TipoE_S = cmbOrig_TipoE_S.getValidValue(A700Orig_TipoE_S) ;
         n700Orig_TipoE_S = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
      }
      cmbOrig_Estado.setName( "ORIG_ESTADO" );
      cmbOrig_Estado.setWebtags( "" );
      cmbOrig_Estado.addItem("", "", (short)(0));
      cmbOrig_Estado.addItem("A", "Activo", (short)(0));
      cmbOrig_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbOrig_Estado.getItemCount() > 0 )
      {
         A676Orig_Estado = cmbOrig_Estado.getValidValue(A676Orig_Estado) ;
         n676Orig_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
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
         Form.getMeta().addItem("description", "Orígen de los bienes y destinaciones de las bajas", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtOrig_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_origen_bienes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_origen_bienes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_origen_bienes_impl.class ));
   }

   public alm_origen_bienes_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOrig_Tipo = new HTMLChoice();
      cmbOrig_TipoE_S = new HTMLChoice();
      cmbOrig_Estado = new HTMLChoice();
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
      if ( cmbOrig_Tipo.getItemCount() > 0 )
      {
         A640Orig_Tipo = cmbOrig_Tipo.getValidValue(A640Orig_Tipo) ;
         n640Orig_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
      }
      if ( cmbOrig_TipoE_S.getItemCount() > 0 )
      {
         A700Orig_TipoE_S = cmbOrig_TipoE_S.getValidValue(A700Orig_TipoE_S) ;
         n700Orig_TipoE_S = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
      }
      if ( cmbOrig_Estado.getItemCount() > 0 )
      {
         A676Orig_Estado = cmbOrig_Estado.getValidValue(A676Orig_Estado) ;
         n676Orig_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Orígen de los bienes y destinaciones de las bajas", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_ORIGEN_BIENES.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_ORIGEN_BIENES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Identificador_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtOrig_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Identificador_Jsonclick, 0, "Attribute", "", "", "", edtOrig_Identificador_Visible, edtOrig_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_ORIGEN_BIENES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOrig_Descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOrig_Descripcion_Internalname, A635Orig_Descripcion, GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrig_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtOrig_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_ORIGEN_BIENES.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_Tipo.getInternalname(), "Tipo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_Tipo, cmbOrig_Tipo.getInternalname(), GXutil.rtrim( A640Orig_Tipo), 1, cmbOrig_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOrig_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_ORIGEN_BIENES.htm");
         cmbOrig_Tipo.setValue( GXutil.rtrim( A640Orig_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOrig_Tipo.getInternalname(), "Values", cmbOrig_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_TipoE_S.getInternalname(), "Tipo Entrada o Salida", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_TipoE_S, cmbOrig_TipoE_S.getInternalname(), GXutil.rtrim( A700Orig_TipoE_S), 1, cmbOrig_TipoE_S.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbOrig_TipoE_S.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_ALM_ORIGEN_BIENES.htm");
         cmbOrig_TipoE_S.setValue( GXutil.rtrim( A700Orig_TipoE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOrig_TipoE_S.getInternalname(), "Values", cmbOrig_TipoE_S.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbOrig_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrig_Estado, cmbOrig_Estado.getInternalname(), GXutil.rtrim( A676Orig_Estado), 1, cmbOrig_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOrig_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", true, "HLP_ALM_ORIGEN_BIENES.htm");
         cmbOrig_Estado.setValue( GXutil.rtrim( A676Orig_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOrig_Estado.getInternalname(), "Values", cmbOrig_Estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_ORIGEN_BIENES.htm");
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
      e111E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
            A635Orig_Descripcion = GXutil.upper( httpContext.cgiGet( edtOrig_Descripcion_Internalname)) ;
            n635Orig_Descripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A635Orig_Descripcion", A635Orig_Descripcion);
            n635Orig_Descripcion = ((GXutil.strcmp("", A635Orig_Descripcion)==0) ? true : false) ;
            cmbOrig_Tipo.setValue( httpContext.cgiGet( cmbOrig_Tipo.getInternalname()) );
            A640Orig_Tipo = httpContext.cgiGet( cmbOrig_Tipo.getInternalname()) ;
            n640Orig_Tipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
            n640Orig_Tipo = ((GXutil.strcmp("", A640Orig_Tipo)==0) ? true : false) ;
            cmbOrig_TipoE_S.setValue( httpContext.cgiGet( cmbOrig_TipoE_S.getInternalname()) );
            A700Orig_TipoE_S = httpContext.cgiGet( cmbOrig_TipoE_S.getInternalname()) ;
            n700Orig_TipoE_S = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
            n700Orig_TipoE_S = ((GXutil.strcmp("", A700Orig_TipoE_S)==0) ? true : false) ;
            cmbOrig_Estado.setValue( httpContext.cgiGet( cmbOrig_Estado.getInternalname()) );
            A676Orig_Estado = httpContext.cgiGet( cmbOrig_Estado.getInternalname()) ;
            n676Orig_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
            n676Orig_Estado = ((GXutil.strcmp("", A676Orig_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( "Z41Orig_Identificador"), ",", ".") ;
            Z636Orig_UsuarioCrea = httpContext.cgiGet( "Z636Orig_UsuarioCrea") ;
            n636Orig_UsuarioCrea = ((GXutil.strcmp("", A636Orig_UsuarioCrea)==0) ? true : false) ;
            Z638Orig_UsuarioModifica = httpContext.cgiGet( "Z638Orig_UsuarioModifica") ;
            n638Orig_UsuarioModifica = ((GXutil.strcmp("", A638Orig_UsuarioModifica)==0) ? true : false) ;
            Z637Orig_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z637Orig_FechaCrea"), 0) ;
            n637Orig_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A637Orig_FechaCrea) ? true : false) ;
            Z639Orig_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z639Orig_FechaModifica"), 0) ;
            n639Orig_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A639Orig_FechaModifica) ? true : false) ;
            Z635Orig_Descripcion = httpContext.cgiGet( "Z635Orig_Descripcion") ;
            n635Orig_Descripcion = ((GXutil.strcmp("", A635Orig_Descripcion)==0) ? true : false) ;
            Z755Orig_Descripcion_Abreviado = httpContext.cgiGet( "Z755Orig_Descripcion_Abreviado") ;
            n755Orig_Descripcion_Abreviado = ((GXutil.strcmp("", A755Orig_Descripcion_Abreviado)==0) ? true : false) ;
            Z640Orig_Tipo = httpContext.cgiGet( "Z640Orig_Tipo") ;
            n640Orig_Tipo = ((GXutil.strcmp("", A640Orig_Tipo)==0) ? true : false) ;
            Z676Orig_Estado = httpContext.cgiGet( "Z676Orig_Estado") ;
            n676Orig_Estado = ((GXutil.strcmp("", A676Orig_Estado)==0) ? true : false) ;
            Z700Orig_TipoE_S = httpContext.cgiGet( "Z700Orig_TipoE_S") ;
            n700Orig_TipoE_S = ((GXutil.strcmp("", A700Orig_TipoE_S)==0) ? true : false) ;
            A636Orig_UsuarioCrea = httpContext.cgiGet( "Z636Orig_UsuarioCrea") ;
            n636Orig_UsuarioCrea = false ;
            n636Orig_UsuarioCrea = ((GXutil.strcmp("", A636Orig_UsuarioCrea)==0) ? true : false) ;
            A638Orig_UsuarioModifica = httpContext.cgiGet( "Z638Orig_UsuarioModifica") ;
            n638Orig_UsuarioModifica = false ;
            n638Orig_UsuarioModifica = ((GXutil.strcmp("", A638Orig_UsuarioModifica)==0) ? true : false) ;
            A637Orig_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z637Orig_FechaCrea"), 0) ;
            n637Orig_FechaCrea = false ;
            n637Orig_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A637Orig_FechaCrea) ? true : false) ;
            A639Orig_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z639Orig_FechaModifica"), 0) ;
            n639Orig_FechaModifica = false ;
            n639Orig_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A639Orig_FechaModifica) ? true : false) ;
            A755Orig_Descripcion_Abreviado = httpContext.cgiGet( "Z755Orig_Descripcion_Abreviado") ;
            n755Orig_Descripcion_Abreviado = false ;
            n755Orig_Descripcion_Abreviado = ((GXutil.strcmp("", A755Orig_Descripcion_Abreviado)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7Orig_Identificador = localUtil.ctol( httpContext.cgiGet( "vORIG_IDENTIFICADOR"), ",", ".") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A636Orig_UsuarioCrea = httpContext.cgiGet( "ORIG_USUARIOCREA") ;
            n636Orig_UsuarioCrea = ((GXutil.strcmp("", A636Orig_UsuarioCrea)==0) ? true : false) ;
            A638Orig_UsuarioModifica = httpContext.cgiGet( "ORIG_USUARIOMODIFICA") ;
            n638Orig_UsuarioModifica = ((GXutil.strcmp("", A638Orig_UsuarioModifica)==0) ? true : false) ;
            A637Orig_FechaCrea = localUtil.ctot( httpContext.cgiGet( "ORIG_FECHACREA"), 0) ;
            n637Orig_FechaCrea = (GXutil.dateCompare(GXutil.nullDate(), A637Orig_FechaCrea) ? true : false) ;
            A639Orig_FechaModifica = localUtil.ctot( httpContext.cgiGet( "ORIG_FECHAMODIFICA"), 0) ;
            n639Orig_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A639Orig_FechaModifica) ? true : false) ;
            A755Orig_Descripcion_Abreviado = httpContext.cgiGet( "ORIG_DESCRIPCION_ABREVIADO") ;
            n755Orig_Descripcion_Abreviado = ((GXutil.strcmp("", A755Orig_Descripcion_Abreviado)==0) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_ORIGEN_BIENES" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A41Orig_Identificador != Z41Orig_Identificador ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_origen_bienes:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A41Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
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
                  sMode52 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode52 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound52 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_1E0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ORIG_IDENTIFICADOR");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOrig_Identificador_Internalname ;
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
                        e111E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121E2 ();
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
         e121E2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1E52( ) ;
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
         disableAttributes1E52( ) ;
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

   public void confirm_1E0( )
   {
      beforeValidate1E52( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1E52( ) ;
         }
         else
         {
            checkExtendedTable1E52( ) ;
            closeExtendedTableCursors1E52( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption1E0( )
   {
   }

   public void e111E2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV13Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      edtOrig_Identificador_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Visible, 5, 0)), true);
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e121E2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_origen_bienes") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1E52( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z636Orig_UsuarioCrea = T001E3_A636Orig_UsuarioCrea[0] ;
            Z638Orig_UsuarioModifica = T001E3_A638Orig_UsuarioModifica[0] ;
            Z637Orig_FechaCrea = T001E3_A637Orig_FechaCrea[0] ;
            Z639Orig_FechaModifica = T001E3_A639Orig_FechaModifica[0] ;
            Z635Orig_Descripcion = T001E3_A635Orig_Descripcion[0] ;
            Z755Orig_Descripcion_Abreviado = T001E3_A755Orig_Descripcion_Abreviado[0] ;
            Z640Orig_Tipo = T001E3_A640Orig_Tipo[0] ;
            Z676Orig_Estado = T001E3_A676Orig_Estado[0] ;
            Z700Orig_TipoE_S = T001E3_A700Orig_TipoE_S[0] ;
         }
         else
         {
            Z636Orig_UsuarioCrea = A636Orig_UsuarioCrea ;
            Z638Orig_UsuarioModifica = A638Orig_UsuarioModifica ;
            Z637Orig_FechaCrea = A637Orig_FechaCrea ;
            Z639Orig_FechaModifica = A639Orig_FechaModifica ;
            Z635Orig_Descripcion = A635Orig_Descripcion ;
            Z755Orig_Descripcion_Abreviado = A755Orig_Descripcion_Abreviado ;
            Z640Orig_Tipo = A640Orig_Tipo ;
            Z676Orig_Estado = A676Orig_Estado ;
            Z700Orig_TipoE_S = A700Orig_TipoE_S ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z41Orig_Identificador = A41Orig_Identificador ;
         Z636Orig_UsuarioCrea = A636Orig_UsuarioCrea ;
         Z638Orig_UsuarioModifica = A638Orig_UsuarioModifica ;
         Z637Orig_FechaCrea = A637Orig_FechaCrea ;
         Z639Orig_FechaModifica = A639Orig_FechaModifica ;
         Z635Orig_Descripcion = A635Orig_Descripcion ;
         Z755Orig_Descripcion_Abreviado = A755Orig_Descripcion_Abreviado ;
         Z640Orig_Tipo = A640Orig_Tipo ;
         Z676Orig_Estado = A676Orig_Estado ;
         Z700Orig_TipoE_S = A700Orig_TipoE_S ;
      }
   }

   public void standaloneNotModal( )
   {
      edtOrig_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), true);
      edtOrig_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Orig_Identificador) )
      {
         A41Orig_Identificador = AV7Orig_Identificador ;
         httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
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

   public void load1E52( )
   {
      /* Using cursor T001E4 */
      pr_default.execute(2, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound52 = (short)(1) ;
         A636Orig_UsuarioCrea = T001E4_A636Orig_UsuarioCrea[0] ;
         n636Orig_UsuarioCrea = T001E4_n636Orig_UsuarioCrea[0] ;
         A638Orig_UsuarioModifica = T001E4_A638Orig_UsuarioModifica[0] ;
         n638Orig_UsuarioModifica = T001E4_n638Orig_UsuarioModifica[0] ;
         A637Orig_FechaCrea = T001E4_A637Orig_FechaCrea[0] ;
         n637Orig_FechaCrea = T001E4_n637Orig_FechaCrea[0] ;
         A639Orig_FechaModifica = T001E4_A639Orig_FechaModifica[0] ;
         n639Orig_FechaModifica = T001E4_n639Orig_FechaModifica[0] ;
         A635Orig_Descripcion = T001E4_A635Orig_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635Orig_Descripcion", A635Orig_Descripcion);
         n635Orig_Descripcion = T001E4_n635Orig_Descripcion[0] ;
         A755Orig_Descripcion_Abreviado = T001E4_A755Orig_Descripcion_Abreviado[0] ;
         n755Orig_Descripcion_Abreviado = T001E4_n755Orig_Descripcion_Abreviado[0] ;
         A640Orig_Tipo = T001E4_A640Orig_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
         n640Orig_Tipo = T001E4_n640Orig_Tipo[0] ;
         A676Orig_Estado = T001E4_A676Orig_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
         n676Orig_Estado = T001E4_n676Orig_Estado[0] ;
         A700Orig_TipoE_S = T001E4_A700Orig_TipoE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
         n700Orig_TipoE_S = T001E4_n700Orig_TipoE_S[0] ;
         zm1E52( -7) ;
      }
      pr_default.close(2);
      onLoadActions1E52( ) ;
   }

   public void onLoadActions1E52( )
   {
      AV13Pgmname = "ALM_ORIGEN_BIENES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1E52( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_ORIGEN_BIENES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1E52( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1E52( )
   {
      /* Using cursor T001E5 */
      pr_default.execute(3, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound52 = (short)(1) ;
      }
      else
      {
         RcdFound52 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001E3 */
      pr_default.execute(1, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1E52( 7) ;
         RcdFound52 = (short)(1) ;
         A41Orig_Identificador = T001E3_A41Orig_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
         A636Orig_UsuarioCrea = T001E3_A636Orig_UsuarioCrea[0] ;
         n636Orig_UsuarioCrea = T001E3_n636Orig_UsuarioCrea[0] ;
         A638Orig_UsuarioModifica = T001E3_A638Orig_UsuarioModifica[0] ;
         n638Orig_UsuarioModifica = T001E3_n638Orig_UsuarioModifica[0] ;
         A637Orig_FechaCrea = T001E3_A637Orig_FechaCrea[0] ;
         n637Orig_FechaCrea = T001E3_n637Orig_FechaCrea[0] ;
         A639Orig_FechaModifica = T001E3_A639Orig_FechaModifica[0] ;
         n639Orig_FechaModifica = T001E3_n639Orig_FechaModifica[0] ;
         A635Orig_Descripcion = T001E3_A635Orig_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635Orig_Descripcion", A635Orig_Descripcion);
         n635Orig_Descripcion = T001E3_n635Orig_Descripcion[0] ;
         A755Orig_Descripcion_Abreviado = T001E3_A755Orig_Descripcion_Abreviado[0] ;
         n755Orig_Descripcion_Abreviado = T001E3_n755Orig_Descripcion_Abreviado[0] ;
         A640Orig_Tipo = T001E3_A640Orig_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
         n640Orig_Tipo = T001E3_n640Orig_Tipo[0] ;
         A676Orig_Estado = T001E3_A676Orig_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
         n676Orig_Estado = T001E3_n676Orig_Estado[0] ;
         A700Orig_TipoE_S = T001E3_A700Orig_TipoE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
         n700Orig_TipoE_S = T001E3_n700Orig_TipoE_S[0] ;
         Z41Orig_Identificador = A41Orig_Identificador ;
         sMode52 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1E52( ) ;
         if ( AnyError == 1 )
         {
            RcdFound52 = (short)(0) ;
            initializeNonKey1E52( ) ;
         }
         Gx_mode = sMode52 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound52 = (short)(0) ;
         initializeNonKey1E52( ) ;
         sMode52 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode52 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1E52( ) ;
      if ( RcdFound52 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound52 = (short)(0) ;
      /* Using cursor T001E6 */
      pr_default.execute(4, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001E6_A41Orig_Identificador[0] < A41Orig_Identificador ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001E6_A41Orig_Identificador[0] > A41Orig_Identificador ) ) )
         {
            A41Orig_Identificador = T001E6_A41Orig_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
            RcdFound52 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound52 = (short)(0) ;
      /* Using cursor T001E7 */
      pr_default.execute(5, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001E7_A41Orig_Identificador[0] > A41Orig_Identificador ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001E7_A41Orig_Identificador[0] < A41Orig_Identificador ) ) )
         {
            A41Orig_Identificador = T001E7_A41Orig_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
            RcdFound52 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1E52( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtOrig_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1E52( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound52 == 1 )
         {
            if ( A41Orig_Identificador != Z41Orig_Identificador )
            {
               A41Orig_Identificador = Z41Orig_Identificador ;
               httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ORIG_IDENTIFICADOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOrig_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOrig_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1E52( ) ;
               GX_FocusControl = edtOrig_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A41Orig_Identificador != Z41Orig_Identificador )
            {
               /* Insert record */
               GX_FocusControl = edtOrig_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1E52( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ORIG_IDENTIFICADOR");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOrig_Identificador_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtOrig_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1E52( ) ;
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
      if ( A41Orig_Identificador != Z41Orig_Identificador )
      {
         A41Orig_Identificador = Z41Orig_Identificador ;
         httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ORIG_IDENTIFICADOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrig_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOrig_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1E52( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001E2 */
         pr_default.execute(0, new Object[] {new Long(A41Orig_Identificador)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ORIGEN_BIENES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z636Orig_UsuarioCrea, T001E2_A636Orig_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z638Orig_UsuarioModifica, T001E2_A638Orig_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z637Orig_FechaCrea, T001E2_A637Orig_FechaCrea[0]) ) || !( GXutil.dateCompare(Z639Orig_FechaModifica, T001E2_A639Orig_FechaModifica[0]) ) || ( GXutil.strcmp(Z635Orig_Descripcion, T001E2_A635Orig_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z755Orig_Descripcion_Abreviado, T001E2_A755Orig_Descripcion_Abreviado[0]) != 0 ) || ( GXutil.strcmp(Z640Orig_Tipo, T001E2_A640Orig_Tipo[0]) != 0 ) || ( GXutil.strcmp(Z676Orig_Estado, T001E2_A676Orig_Estado[0]) != 0 ) || ( GXutil.strcmp(Z700Orig_TipoE_S, T001E2_A700Orig_TipoE_S[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_ORIGEN_BIENES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1E52( )
   {
      beforeValidate1E52( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E52( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1E52( 0) ;
         checkOptimisticConcurrency1E52( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E52( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1E52( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E8 */
                  pr_default.execute(6, new Object[] {new Boolean(n636Orig_UsuarioCrea), A636Orig_UsuarioCrea, new Boolean(n638Orig_UsuarioModifica), A638Orig_UsuarioModifica, new Boolean(n637Orig_FechaCrea), A637Orig_FechaCrea, new Boolean(n639Orig_FechaModifica), A639Orig_FechaModifica, new Boolean(n635Orig_Descripcion), A635Orig_Descripcion, new Boolean(n755Orig_Descripcion_Abreviado), A755Orig_Descripcion_Abreviado, new Boolean(n640Orig_Tipo), A640Orig_Tipo, new Boolean(n676Orig_Estado), A676Orig_Estado, new Boolean(n700Orig_TipoE_S), A700Orig_TipoE_S});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001E9 */
                  pr_default.execute(7);
                  A41Orig_Identificador = T001E9_A41Orig_Identificador[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ORIGEN_BIENES") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption1E0( ) ;
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
            load1E52( ) ;
         }
         endLevel1E52( ) ;
      }
      closeExtendedTableCursors1E52( ) ;
   }

   public void update1E52( )
   {
      beforeValidate1E52( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E52( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E52( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E52( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1E52( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E10 */
                  pr_default.execute(8, new Object[] {new Boolean(n636Orig_UsuarioCrea), A636Orig_UsuarioCrea, new Boolean(n638Orig_UsuarioModifica), A638Orig_UsuarioModifica, new Boolean(n637Orig_FechaCrea), A637Orig_FechaCrea, new Boolean(n639Orig_FechaModifica), A639Orig_FechaModifica, new Boolean(n635Orig_Descripcion), A635Orig_Descripcion, new Boolean(n755Orig_Descripcion_Abreviado), A755Orig_Descripcion_Abreviado, new Boolean(n640Orig_Tipo), A640Orig_Tipo, new Boolean(n676Orig_Estado), A676Orig_Estado, new Boolean(n700Orig_TipoE_S), A700Orig_TipoE_S, new Long(A41Orig_Identificador)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ORIGEN_BIENES") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_ORIGEN_BIENES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1E52( ) ;
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
         endLevel1E52( ) ;
      }
      closeExtendedTableCursors1E52( ) ;
   }

   public void deferredUpdate1E52( )
   {
   }

   public void delete( )
   {
      beforeValidate1E52( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E52( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1E52( ) ;
         afterConfirm1E52( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1E52( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001E11 */
               pr_default.execute(9, new Object[] {new Long(A41Orig_Identificador)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_ORIGEN_BIENES") ;
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
      sMode52 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1E52( ) ;
      Gx_mode = sMode52 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1E52( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_ORIGEN_BIENES" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001E12 */
         pr_default.execute(10, new Object[] {new Long(A41Orig_Identificador)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001E13 */
         pr_default.execute(11, new Object[] {new Long(A41Orig_Identificador)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Movimiento orígen de los bienes"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel1E52( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1E52( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_origen_bienes");
         if ( AnyError == 0 )
         {
            confirmValues1E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_origen_bienes");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1E52( )
   {
      /* Scan By routine */
      /* Using cursor T001E14 */
      pr_default.execute(12);
      RcdFound52 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound52 = (short)(1) ;
         A41Orig_Identificador = T001E14_A41Orig_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1E52( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound52 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound52 = (short)(1) ;
         A41Orig_Identificador = T001E14_A41Orig_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
      }
   }

   public void scanEnd1E52( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1E52( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A637Orig_FechaCrea = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n637Orig_FechaCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A637Orig_FechaCrea", localUtil.ttoc( A637Orig_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A639Orig_FechaModifica = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n639Orig_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A639Orig_FechaModifica", localUtil.ttoc( A639Orig_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A636Orig_UsuarioCrea = AV12Usuario ;
         n636Orig_UsuarioCrea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A636Orig_UsuarioCrea", A636Orig_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A638Orig_UsuarioModifica = AV12Usuario ;
         n638Orig_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A638Orig_UsuarioModifica", A638Orig_UsuarioModifica);
      }
   }

   public void beforeInsert1E52( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1E52( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1E52( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1E52( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1E52( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1E52( )
   {
      edtOrig_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), true);
      edtOrig_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Descripcion_Enabled, 5, 0)), true);
      cmbOrig_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrig_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbOrig_Tipo.getEnabled(), 5, 0)), true);
      cmbOrig_TipoE_S.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrig_TipoE_S.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbOrig_TipoE_S.getEnabled(), 5, 0)), true);
      cmbOrig_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrig_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbOrig_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1E0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414173223");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_origen_bienes") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Orig_Identificador,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z41Orig_Identificador", GXutil.ltrim( localUtil.ntoc( Z41Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z636Orig_UsuarioCrea", Z636Orig_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z638Orig_UsuarioModifica", Z638Orig_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z637Orig_FechaCrea", localUtil.ttoc( Z637Orig_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z639Orig_FechaModifica", localUtil.ttoc( Z639Orig_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z635Orig_Descripcion", Z635Orig_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z755Orig_Descripcion_Abreviado", Z755Orig_Descripcion_Abreviado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z640Orig_Tipo", GXutil.rtrim( Z640Orig_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z676Orig_Estado", GXutil.rtrim( Z676Orig_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z700Orig_TipoE_S", Z700Orig_TipoE_S);
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV7Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_USUARIOCREA", A636Orig_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_USUARIOMODIFICA", A638Orig_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_FECHACREA", localUtil.ttoc( A637Orig_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_FECHAMODIFICA", localUtil.ttoc( A639Orig_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_DESCRIPCION_ABREVIADO", A755Orig_Descripcion_Abreviado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Orig_Identificador), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_ORIGEN_BIENES" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A755Orig_Descripcion_Abreviado, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_origen_bienes:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_origen_bienes") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Orig_Identificador,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_ORIGEN_BIENES" ;
   }

   public String getPgmdesc( )
   {
      return "Orígen de los bienes y destinaciones de las bajas" ;
   }

   public void initializeNonKey1E52( )
   {
      A636Orig_UsuarioCrea = "" ;
      n636Orig_UsuarioCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A636Orig_UsuarioCrea", A636Orig_UsuarioCrea);
      A638Orig_UsuarioModifica = "" ;
      n638Orig_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A638Orig_UsuarioModifica", A638Orig_UsuarioModifica);
      A637Orig_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      n637Orig_FechaCrea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A637Orig_FechaCrea", localUtil.ttoc( A637Orig_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A639Orig_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n639Orig_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A639Orig_FechaModifica", localUtil.ttoc( A639Orig_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A635Orig_Descripcion = "" ;
      n635Orig_Descripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A635Orig_Descripcion", A635Orig_Descripcion);
      n635Orig_Descripcion = ((GXutil.strcmp("", A635Orig_Descripcion)==0) ? true : false) ;
      A755Orig_Descripcion_Abreviado = "" ;
      n755Orig_Descripcion_Abreviado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A755Orig_Descripcion_Abreviado", A755Orig_Descripcion_Abreviado);
      A640Orig_Tipo = "" ;
      n640Orig_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A640Orig_Tipo", A640Orig_Tipo);
      n640Orig_Tipo = ((GXutil.strcmp("", A640Orig_Tipo)==0) ? true : false) ;
      A676Orig_Estado = "" ;
      n676Orig_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A676Orig_Estado", A676Orig_Estado);
      n676Orig_Estado = ((GXutil.strcmp("", A676Orig_Estado)==0) ? true : false) ;
      A700Orig_TipoE_S = "" ;
      n700Orig_TipoE_S = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A700Orig_TipoE_S", A700Orig_TipoE_S);
      n700Orig_TipoE_S = ((GXutil.strcmp("", A700Orig_TipoE_S)==0) ? true : false) ;
      Z636Orig_UsuarioCrea = "" ;
      Z638Orig_UsuarioModifica = "" ;
      Z637Orig_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z639Orig_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z635Orig_Descripcion = "" ;
      Z755Orig_Descripcion_Abreviado = "" ;
      Z640Orig_Tipo = "" ;
      Z676Orig_Estado = "" ;
      Z700Orig_TipoE_S = "" ;
   }

   public void initAll1E52( )
   {
      A41Orig_Identificador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A41Orig_Identificador", GXutil.ltrim( GXutil.str( A41Orig_Identificador, 11, 0)));
      initializeNonKey1E52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414173231");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_origen_bienes.js", "?201861414173231");
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
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR" ;
      edtOrig_Descripcion_Internalname = "ORIG_DESCRIPCION" ;
      cmbOrig_Tipo.setInternalname( "ORIG_TIPO" );
      cmbOrig_TipoE_S.setInternalname( "ORIG_TIPOE_S" );
      cmbOrig_Estado.setInternalname( "ORIG_ESTADO" );
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
      Form.setCaption( "Orígen de los bienes y destinaciones de las bajas" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbOrig_Estado.setJsonclick( "" );
      cmbOrig_Estado.setEnabled( 1 );
      cmbOrig_TipoE_S.setJsonclick( "" );
      cmbOrig_TipoE_S.setEnabled( 1 );
      cmbOrig_Tipo.setJsonclick( "" );
      cmbOrig_Tipo.setEnabled( 1 );
      edtOrig_Descripcion_Jsonclick = "" ;
      edtOrig_Descripcion_Enabled = 1 ;
      edtOrig_Identificador_Jsonclick = "" ;
      edtOrig_Identificador_Enabled = 0 ;
      edtOrig_Identificador_Visible = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121E2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z636Orig_UsuarioCrea = "" ;
      Z638Orig_UsuarioModifica = "" ;
      Z637Orig_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z639Orig_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z635Orig_Descripcion = "" ;
      Z755Orig_Descripcion_Abreviado = "" ;
      Z640Orig_Tipo = "" ;
      Z676Orig_Estado = "" ;
      Z700Orig_TipoE_S = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A640Orig_Tipo = "" ;
      A700Orig_TipoE_S = "" ;
      A676Orig_Estado = "" ;
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
      A635Orig_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A636Orig_UsuarioCrea = "" ;
      A638Orig_UsuarioModifica = "" ;
      A637Orig_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A639Orig_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A755Orig_Descripcion_Abreviado = "" ;
      AV12Usuario = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode52 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      T001E4_A41Orig_Identificador = new long[1] ;
      T001E4_A636Orig_UsuarioCrea = new String[] {""} ;
      T001E4_n636Orig_UsuarioCrea = new boolean[] {false} ;
      T001E4_A638Orig_UsuarioModifica = new String[] {""} ;
      T001E4_n638Orig_UsuarioModifica = new boolean[] {false} ;
      T001E4_A637Orig_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001E4_n637Orig_FechaCrea = new boolean[] {false} ;
      T001E4_A639Orig_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001E4_n639Orig_FechaModifica = new boolean[] {false} ;
      T001E4_A635Orig_Descripcion = new String[] {""} ;
      T001E4_n635Orig_Descripcion = new boolean[] {false} ;
      T001E4_A755Orig_Descripcion_Abreviado = new String[] {""} ;
      T001E4_n755Orig_Descripcion_Abreviado = new boolean[] {false} ;
      T001E4_A640Orig_Tipo = new String[] {""} ;
      T001E4_n640Orig_Tipo = new boolean[] {false} ;
      T001E4_A676Orig_Estado = new String[] {""} ;
      T001E4_n676Orig_Estado = new boolean[] {false} ;
      T001E4_A700Orig_TipoE_S = new String[] {""} ;
      T001E4_n700Orig_TipoE_S = new boolean[] {false} ;
      T001E5_A41Orig_Identificador = new long[1] ;
      T001E3_A41Orig_Identificador = new long[1] ;
      T001E3_A636Orig_UsuarioCrea = new String[] {""} ;
      T001E3_n636Orig_UsuarioCrea = new boolean[] {false} ;
      T001E3_A638Orig_UsuarioModifica = new String[] {""} ;
      T001E3_n638Orig_UsuarioModifica = new boolean[] {false} ;
      T001E3_A637Orig_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001E3_n637Orig_FechaCrea = new boolean[] {false} ;
      T001E3_A639Orig_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001E3_n639Orig_FechaModifica = new boolean[] {false} ;
      T001E3_A635Orig_Descripcion = new String[] {""} ;
      T001E3_n635Orig_Descripcion = new boolean[] {false} ;
      T001E3_A755Orig_Descripcion_Abreviado = new String[] {""} ;
      T001E3_n755Orig_Descripcion_Abreviado = new boolean[] {false} ;
      T001E3_A640Orig_Tipo = new String[] {""} ;
      T001E3_n640Orig_Tipo = new boolean[] {false} ;
      T001E3_A676Orig_Estado = new String[] {""} ;
      T001E3_n676Orig_Estado = new boolean[] {false} ;
      T001E3_A700Orig_TipoE_S = new String[] {""} ;
      T001E3_n700Orig_TipoE_S = new boolean[] {false} ;
      T001E6_A41Orig_Identificador = new long[1] ;
      T001E7_A41Orig_Identificador = new long[1] ;
      T001E2_A41Orig_Identificador = new long[1] ;
      T001E2_A636Orig_UsuarioCrea = new String[] {""} ;
      T001E2_n636Orig_UsuarioCrea = new boolean[] {false} ;
      T001E2_A638Orig_UsuarioModifica = new String[] {""} ;
      T001E2_n638Orig_UsuarioModifica = new boolean[] {false} ;
      T001E2_A637Orig_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T001E2_n637Orig_FechaCrea = new boolean[] {false} ;
      T001E2_A639Orig_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T001E2_n639Orig_FechaModifica = new boolean[] {false} ;
      T001E2_A635Orig_Descripcion = new String[] {""} ;
      T001E2_n635Orig_Descripcion = new boolean[] {false} ;
      T001E2_A755Orig_Descripcion_Abreviado = new String[] {""} ;
      T001E2_n755Orig_Descripcion_Abreviado = new boolean[] {false} ;
      T001E2_A640Orig_Tipo = new String[] {""} ;
      T001E2_n640Orig_Tipo = new boolean[] {false} ;
      T001E2_A676Orig_Estado = new String[] {""} ;
      T001E2_n676Orig_Estado = new boolean[] {false} ;
      T001E2_A700Orig_TipoE_S = new String[] {""} ;
      T001E2_n700Orig_TipoE_S = new boolean[] {false} ;
      T001E9_A41Orig_Identificador = new long[1] ;
      T001E12_A46Tran_Id = new long[1] ;
      T001E13_A38Tpmo_Codigo = new String[] {""} ;
      T001E13_A41Orig_Identificador = new long[1] ;
      T001E14_A41Orig_Identificador = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_origen_bienes__default(),
         new Object[] {
             new Object[] {
            T001E2_A41Orig_Identificador, T001E2_A636Orig_UsuarioCrea, T001E2_n636Orig_UsuarioCrea, T001E2_A638Orig_UsuarioModifica, T001E2_n638Orig_UsuarioModifica, T001E2_A637Orig_FechaCrea, T001E2_n637Orig_FechaCrea, T001E2_A639Orig_FechaModifica, T001E2_n639Orig_FechaModifica, T001E2_A635Orig_Descripcion,
            T001E2_n635Orig_Descripcion, T001E2_A755Orig_Descripcion_Abreviado, T001E2_n755Orig_Descripcion_Abreviado, T001E2_A640Orig_Tipo, T001E2_n640Orig_Tipo, T001E2_A676Orig_Estado, T001E2_n676Orig_Estado, T001E2_A700Orig_TipoE_S, T001E2_n700Orig_TipoE_S
            }
            , new Object[] {
            T001E3_A41Orig_Identificador, T001E3_A636Orig_UsuarioCrea, T001E3_n636Orig_UsuarioCrea, T001E3_A638Orig_UsuarioModifica, T001E3_n638Orig_UsuarioModifica, T001E3_A637Orig_FechaCrea, T001E3_n637Orig_FechaCrea, T001E3_A639Orig_FechaModifica, T001E3_n639Orig_FechaModifica, T001E3_A635Orig_Descripcion,
            T001E3_n635Orig_Descripcion, T001E3_A755Orig_Descripcion_Abreviado, T001E3_n755Orig_Descripcion_Abreviado, T001E3_A640Orig_Tipo, T001E3_n640Orig_Tipo, T001E3_A676Orig_Estado, T001E3_n676Orig_Estado, T001E3_A700Orig_TipoE_S, T001E3_n700Orig_TipoE_S
            }
            , new Object[] {
            T001E4_A41Orig_Identificador, T001E4_A636Orig_UsuarioCrea, T001E4_n636Orig_UsuarioCrea, T001E4_A638Orig_UsuarioModifica, T001E4_n638Orig_UsuarioModifica, T001E4_A637Orig_FechaCrea, T001E4_n637Orig_FechaCrea, T001E4_A639Orig_FechaModifica, T001E4_n639Orig_FechaModifica, T001E4_A635Orig_Descripcion,
            T001E4_n635Orig_Descripcion, T001E4_A755Orig_Descripcion_Abreviado, T001E4_n755Orig_Descripcion_Abreviado, T001E4_A640Orig_Tipo, T001E4_n640Orig_Tipo, T001E4_A676Orig_Estado, T001E4_n676Orig_Estado, T001E4_A700Orig_TipoE_S, T001E4_n700Orig_TipoE_S
            }
            , new Object[] {
            T001E5_A41Orig_Identificador
            }
            , new Object[] {
            T001E6_A41Orig_Identificador
            }
            , new Object[] {
            T001E7_A41Orig_Identificador
            }
            , new Object[] {
            }
            , new Object[] {
            T001E9_A41Orig_Identificador
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001E12_A46Tran_Id
            }
            , new Object[] {
            T001E13_A38Tpmo_Codigo, T001E13_A41Orig_Identificador
            }
            , new Object[] {
            T001E14_A41Orig_Identificador
            }
         }
      );
      AV13Pgmname = "ALM_ORIGEN_BIENES" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound52 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtOrig_Identificador_Enabled ;
   private int edtOrig_Identificador_Visible ;
   private int edtOrig_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7Orig_Identificador ;
   private long Z41Orig_Identificador ;
   private long AV7Orig_Identificador ;
   private long A41Orig_Identificador ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z640Orig_Tipo ;
   private String Z676Orig_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A640Orig_Tipo ;
   private String A676Orig_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOrig_Descripcion_Internalname ;
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
   private String edtOrig_Identificador_Internalname ;
   private String edtOrig_Identificador_Jsonclick ;
   private String edtOrig_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode52 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z637Orig_FechaCrea ;
   private java.util.Date Z639Orig_FechaModifica ;
   private java.util.Date A637Orig_FechaCrea ;
   private java.util.Date A639Orig_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n640Orig_Tipo ;
   private boolean n700Orig_TipoE_S ;
   private boolean n676Orig_Estado ;
   private boolean wbErr ;
   private boolean n635Orig_Descripcion ;
   private boolean n636Orig_UsuarioCrea ;
   private boolean n638Orig_UsuarioModifica ;
   private boolean n637Orig_FechaCrea ;
   private boolean n639Orig_FechaModifica ;
   private boolean n755Orig_Descripcion_Abreviado ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z636Orig_UsuarioCrea ;
   private String Z638Orig_UsuarioModifica ;
   private String Z635Orig_Descripcion ;
   private String Z755Orig_Descripcion_Abreviado ;
   private String Z700Orig_TipoE_S ;
   private String A700Orig_TipoE_S ;
   private String A635Orig_Descripcion ;
   private String A636Orig_UsuarioCrea ;
   private String A638Orig_UsuarioModifica ;
   private String A755Orig_Descripcion_Abreviado ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbOrig_Tipo ;
   private HTMLChoice cmbOrig_TipoE_S ;
   private HTMLChoice cmbOrig_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] T001E4_A41Orig_Identificador ;
   private String[] T001E4_A636Orig_UsuarioCrea ;
   private boolean[] T001E4_n636Orig_UsuarioCrea ;
   private String[] T001E4_A638Orig_UsuarioModifica ;
   private boolean[] T001E4_n638Orig_UsuarioModifica ;
   private java.util.Date[] T001E4_A637Orig_FechaCrea ;
   private boolean[] T001E4_n637Orig_FechaCrea ;
   private java.util.Date[] T001E4_A639Orig_FechaModifica ;
   private boolean[] T001E4_n639Orig_FechaModifica ;
   private String[] T001E4_A635Orig_Descripcion ;
   private boolean[] T001E4_n635Orig_Descripcion ;
   private String[] T001E4_A755Orig_Descripcion_Abreviado ;
   private boolean[] T001E4_n755Orig_Descripcion_Abreviado ;
   private String[] T001E4_A640Orig_Tipo ;
   private boolean[] T001E4_n640Orig_Tipo ;
   private String[] T001E4_A676Orig_Estado ;
   private boolean[] T001E4_n676Orig_Estado ;
   private String[] T001E4_A700Orig_TipoE_S ;
   private boolean[] T001E4_n700Orig_TipoE_S ;
   private long[] T001E5_A41Orig_Identificador ;
   private long[] T001E3_A41Orig_Identificador ;
   private String[] T001E3_A636Orig_UsuarioCrea ;
   private boolean[] T001E3_n636Orig_UsuarioCrea ;
   private String[] T001E3_A638Orig_UsuarioModifica ;
   private boolean[] T001E3_n638Orig_UsuarioModifica ;
   private java.util.Date[] T001E3_A637Orig_FechaCrea ;
   private boolean[] T001E3_n637Orig_FechaCrea ;
   private java.util.Date[] T001E3_A639Orig_FechaModifica ;
   private boolean[] T001E3_n639Orig_FechaModifica ;
   private String[] T001E3_A635Orig_Descripcion ;
   private boolean[] T001E3_n635Orig_Descripcion ;
   private String[] T001E3_A755Orig_Descripcion_Abreviado ;
   private boolean[] T001E3_n755Orig_Descripcion_Abreviado ;
   private String[] T001E3_A640Orig_Tipo ;
   private boolean[] T001E3_n640Orig_Tipo ;
   private String[] T001E3_A676Orig_Estado ;
   private boolean[] T001E3_n676Orig_Estado ;
   private String[] T001E3_A700Orig_TipoE_S ;
   private boolean[] T001E3_n700Orig_TipoE_S ;
   private long[] T001E6_A41Orig_Identificador ;
   private long[] T001E7_A41Orig_Identificador ;
   private long[] T001E2_A41Orig_Identificador ;
   private String[] T001E2_A636Orig_UsuarioCrea ;
   private boolean[] T001E2_n636Orig_UsuarioCrea ;
   private String[] T001E2_A638Orig_UsuarioModifica ;
   private boolean[] T001E2_n638Orig_UsuarioModifica ;
   private java.util.Date[] T001E2_A637Orig_FechaCrea ;
   private boolean[] T001E2_n637Orig_FechaCrea ;
   private java.util.Date[] T001E2_A639Orig_FechaModifica ;
   private boolean[] T001E2_n639Orig_FechaModifica ;
   private String[] T001E2_A635Orig_Descripcion ;
   private boolean[] T001E2_n635Orig_Descripcion ;
   private String[] T001E2_A755Orig_Descripcion_Abreviado ;
   private boolean[] T001E2_n755Orig_Descripcion_Abreviado ;
   private String[] T001E2_A640Orig_Tipo ;
   private boolean[] T001E2_n640Orig_Tipo ;
   private String[] T001E2_A676Orig_Estado ;
   private boolean[] T001E2_n676Orig_Estado ;
   private String[] T001E2_A700Orig_TipoE_S ;
   private boolean[] T001E2_n700Orig_TipoE_S ;
   private long[] T001E9_A41Orig_Identificador ;
   private long[] T001E12_A46Tran_Id ;
   private String[] T001E13_A38Tpmo_Codigo ;
   private long[] T001E13_A41Orig_Identificador ;
   private long[] T001E14_A41Orig_Identificador ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_origen_bienes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001E2", "SELECT Orig_Identificador, Orig_UsuarioCrea, Orig_UsuarioModifica, Orig_FechaCrea, Orig_FechaModifica, Orig_Descripcion, Orig_Descripcion_Abreviado, Orig_Tipo, Orig_Estado, Orig_TipoE_S FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ?  FOR UPDATE OF Orig_UsuarioCrea, Orig_UsuarioModifica, Orig_FechaCrea, Orig_FechaModifica, Orig_Descripcion, Orig_Descripcion_Abreviado, Orig_Tipo, Orig_Estado, Orig_TipoE_S NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E3", "SELECT Orig_Identificador, Orig_UsuarioCrea, Orig_UsuarioModifica, Orig_FechaCrea, Orig_FechaModifica, Orig_Descripcion, Orig_Descripcion_Abreviado, Orig_Tipo, Orig_Estado, Orig_TipoE_S FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Orig_Identificador, TM1.Orig_UsuarioCrea, TM1.Orig_UsuarioModifica, TM1.Orig_FechaCrea, TM1.Orig_FechaModifica, TM1.Orig_Descripcion, TM1.Orig_Descripcion_Abreviado, TM1.Orig_Tipo, TM1.Orig_Estado, TM1.Orig_TipoE_S FROM ALM_ORIGEN_BIENES TM1 WHERE TM1.Orig_Identificador = ? ORDER BY TM1.Orig_Identificador ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001E5", "SELECT /*+ FIRST_ROWS(1) */ Orig_Identificador FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Orig_Identificador FROM ALM_ORIGEN_BIENES WHERE ( Orig_Identificador > ?) ORDER BY Orig_Identificador) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001E7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Orig_Identificador FROM ALM_ORIGEN_BIENES WHERE ( Orig_Identificador < ?) ORDER BY Orig_Identificador DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001E8", "INSERT INTO ALM_ORIGEN_BIENES(Orig_UsuarioCrea, Orig_UsuarioModifica, Orig_FechaCrea, Orig_FechaModifica, Orig_Descripcion, Orig_Descripcion_Abreviado, Orig_Tipo, Orig_Estado, Orig_TipoE_S) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_ORIGEN_BIENES")
         ,new ForEachCursor("T001E9", "SELECT Orig_Identificador.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001E10", "UPDATE ALM_ORIGEN_BIENES SET Orig_UsuarioCrea=?, Orig_UsuarioModifica=?, Orig_FechaCrea=?, Orig_FechaModifica=?, Orig_Descripcion=?, Orig_Descripcion_Abreviado=?, Orig_Tipo=?, Orig_Estado=?, Orig_TipoE_S=?  WHERE Orig_Identificador = ?", GX_NOMASK, "ALM_ORIGEN_BIENES")
         ,new UpdateCursor("T001E11", "DELETE FROM ALM_ORIGEN_BIENES  WHERE Orig_Identificador = ?", GX_NOMASK, "ALM_ORIGEN_BIENES")
         ,new ForEachCursor("T001E12", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_TipoIngreso = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001E13", "SELECT * FROM (SELECT Tpmo_Codigo, Orig_Identificador FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Orig_Identificador = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001E14", "SELECT /*+ FIRST_ROWS(100) */ Orig_Identificador FROM ALM_ORIGEN_BIENES ORDER BY Orig_Identificador ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[13])[0] = rslt.getString(8, 5) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[13])[0] = rslt.getString(8, 5) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[13])[0] = rslt.getString(8, 5) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 12 :
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
                  stmt.setVarchar(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
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
                  stmt.setVarchar(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               stmt.setLong(10, ((Number) parms[18]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

