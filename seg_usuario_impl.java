/*
               File: seg_usuario_impl
        Description: Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:18.17
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

public final  class seg_usuario_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_0S5( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         AV22Usuario = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         AV26Integra = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Integra", AV26Integra);
         A221Usua_Estado = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
         AV19usua_EstadoOld = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_0S5( AV22Usuario, A23Usua_Id, AV26Integra, A221Usua_Estado, AV19usua_EstadoOld) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         AV22Usuario = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         AV26Integra = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Integra", AV26Integra);
         A221Usua_Estado = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
         AV19usua_EstadoOld = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_0S5( AV22Usuario, A23Usua_Id, AV26Integra, A221Usua_Estado, AV19usua_EstadoOld) ;
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
            AV25Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Usua_Id", GXutil.ltrim( GXutil.str( AV25Usua_Id, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
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
      cmbUsua_Estado.setName( "USUA_ESTADO" );
      cmbUsua_Estado.setWebtags( "" );
      cmbUsua_Estado.addItem("A", "Activo", (short)(0));
      cmbUsua_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbUsua_Estado.getItemCount() > 0 )
      {
         A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
      }
      cmbUsua_TipoContrato.setName( "USUA_TIPOCONTRATO" );
      cmbUsua_TipoContrato.setWebtags( "" );
      cmbUsua_TipoContrato.addItem("P", "Planta", (short)(0));
      cmbUsua_TipoContrato.addItem("C", "Contratista", (short)(0));
      if ( cmbUsua_TipoContrato.getItemCount() > 0 )
      {
         A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
         httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
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
         Form.getMeta().addItem("description", "Usuario", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtUsua_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_usuario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_usuario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_usuario_impl.class ));
   }

   public seg_usuario_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbUsua_Estado = new HTMLChoice();
      cmbUsua_TipoContrato = new HTMLChoice();
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
      if ( cmbUsua_Estado.getItemCount() > 0 )
      {
         A221Usua_Estado = cmbUsua_Estado.getValidValue(A221Usua_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
      }
      if ( cmbUsua_TipoContrato.getItemCount() > 0 )
      {
         A226Usua_TipoContrato = cmbUsua_TipoContrato.getValidValue(A226Usua_TipoContrato) ;
         httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Usuario", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Id_Internalname, "Id Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Id_Jsonclick, 0, "Attribute", "", "", "", edtUsua_Id_Visible, edtUsua_Id_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Codigo_Internalname, "Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Codigo_Internalname, A24Usua_Codigo, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Codigo_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Nombre_Internalname, "Nombre del Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Nombre_Internalname, A25Usua_Nombre, GXutil.rtrim( localUtil.format( A25Usua_Nombre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Email_Internalname, "Correo Electrónico", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Email_Internalname, A219Usua_Email, GXutil.rtrim( localUtil.format( A219Usua_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A219Usua_Email, "", "", "", edtUsua_Email_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Cedula_Internalname, "Cédula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Clave_Internalname, "Clave", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Clave_Internalname, A220Usua_Clave, GXutil.rtrim( localUtil.format( A220Usua_Clave, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Clave_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Clave_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "Clave", "left", true, "HLP_SEG_USUARIO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbUsua_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbUsua_Estado, cmbUsua_Estado.getInternalname(), GXutil.rtrim( A221Usua_Estado), 1, cmbUsua_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbUsua_Estado.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, "HLP_SEG_USUARIO.htm");
         cmbUsua_Estado.setValue( GXutil.rtrim( A221Usua_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Values", cmbUsua_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbUsua_TipoContrato.getInternalname(), "Tipo de Contrato", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbUsua_TipoContrato, cmbUsua_TipoContrato.getInternalname(), GXutil.rtrim( A226Usua_TipoContrato), 1, cmbUsua_TipoContrato.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbUsua_TipoContrato.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, "HLP_SEG_USUARIO.htm");
         cmbUsua_TipoContrato.setValue( GXutil.rtrim( A226Usua_TipoContrato) );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_TipoContrato.getInternalname(), "Values", cmbUsua_TipoContrato.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_UsuAprueba_Internalname, "Usuario que Aprueba", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_UsuAprueba_Internalname, A222Usua_UsuAprueba, GXutil.rtrim( localUtil.format( A222Usua_UsuAprueba, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_UsuAprueba_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_UsuAprueba_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_SEG_USUARIO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIO.htm");
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
      e110S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A23Usua_Id = localUtil.ctol( httpContext.cgiGet( edtUsua_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
            A24Usua_Codigo = GXutil.upper( httpContext.cgiGet( edtUsua_Codigo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
            A25Usua_Nombre = httpContext.cgiGet( edtUsua_Nombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
            A219Usua_Email = httpContext.cgiGet( edtUsua_Email_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "USUA_CEDULA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsua_Cedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A26Usua_Cedula = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
            }
            else
            {
               A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
            }
            A220Usua_Clave = httpContext.cgiGet( edtUsua_Clave_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
            cmbUsua_Estado.setValue( httpContext.cgiGet( cmbUsua_Estado.getInternalname()) );
            A221Usua_Estado = httpContext.cgiGet( cmbUsua_Estado.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
            cmbUsua_TipoContrato.setValue( httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) );
            A226Usua_TipoContrato = httpContext.cgiGet( cmbUsua_TipoContrato.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
            A222Usua_UsuAprueba = httpContext.cgiGet( edtUsua_UsuAprueba_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
            /* Read saved values. */
            Z23Usua_Id = localUtil.ctol( httpContext.cgiGet( "Z23Usua_Id"), ",", ".") ;
            Z223Usua_UsuarioCrea = httpContext.cgiGet( "Z223Usua_UsuarioCrea") ;
            Z225Usua_UsuarioModifica = httpContext.cgiGet( "Z225Usua_UsuarioModifica") ;
            Z229Usua_Administrador = httpContext.cgiGet( "Z229Usua_Administrador") ;
            Z224Usua_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z224Usua_FechaCrea"), 0) ;
            Z227usua_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z227usua_FechaModifica"), 0) ;
            Z221Usua_Estado = httpContext.cgiGet( "Z221Usua_Estado") ;
            Z220Usua_Clave = httpContext.cgiGet( "Z220Usua_Clave") ;
            Z24Usua_Codigo = httpContext.cgiGet( "Z24Usua_Codigo") ;
            Z25Usua_Nombre = httpContext.cgiGet( "Z25Usua_Nombre") ;
            Z219Usua_Email = httpContext.cgiGet( "Z219Usua_Email") ;
            Z26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( "Z26Usua_Cedula"), ",", ".") ;
            Z222Usua_UsuAprueba = httpContext.cgiGet( "Z222Usua_UsuAprueba") ;
            Z226Usua_TipoContrato = httpContext.cgiGet( "Z226Usua_TipoContrato") ;
            Z228Usua_IndCambioClave = httpContext.cgiGet( "Z228Usua_IndCambioClave") ;
            A223Usua_UsuarioCrea = httpContext.cgiGet( "Z223Usua_UsuarioCrea") ;
            A225Usua_UsuarioModifica = httpContext.cgiGet( "Z225Usua_UsuarioModifica") ;
            A229Usua_Administrador = httpContext.cgiGet( "Z229Usua_Administrador") ;
            A224Usua_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z224Usua_FechaCrea"), 0) ;
            A227usua_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z227usua_FechaModifica"), 0) ;
            A228Usua_IndCambioClave = httpContext.cgiGet( "Z228Usua_IndCambioClave") ;
            O226Usua_TipoContrato = httpContext.cgiGet( "O226Usua_TipoContrato") ;
            O222Usua_UsuAprueba = httpContext.cgiGet( "O222Usua_UsuAprueba") ;
            O221Usua_Estado = httpContext.cgiGet( "O221Usua_Estado") ;
            O220Usua_Clave = httpContext.cgiGet( "O220Usua_Clave") ;
            O26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( "O26Usua_Cedula"), ",", ".") ;
            O219Usua_Email = httpContext.cgiGet( "O219Usua_Email") ;
            O25Usua_Nombre = httpContext.cgiGet( "O25Usua_Nombre") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV25Usua_Id = localUtil.ctol( httpContext.cgiGet( "vUSUA_ID"), ",", ".") ;
            AV22Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A223Usua_UsuarioCrea = httpContext.cgiGet( "USUA_USUARIOCREA") ;
            A225Usua_UsuarioModifica = httpContext.cgiGet( "USUA_USUARIOMODIFICA") ;
            A229Usua_Administrador = httpContext.cgiGet( "USUA_ADMINISTRADOR") ;
            A224Usua_FechaCrea = localUtil.ctot( httpContext.cgiGet( "USUA_FECHACREA"), 0) ;
            A227usua_FechaModifica = localUtil.ctot( httpContext.cgiGet( "USUA_FECHAMODIFICA"), 0) ;
            AV20Usua_NomOld = httpContext.cgiGet( "vUSUA_NOMOLD") ;
            AV18Usua_EmailOld = httpContext.cgiGet( "vUSUA_EMAILOLD") ;
            AV16Usua_CedulaOld = localUtil.ctol( httpContext.cgiGet( "vUSUA_CEDULAOLD"), ",", ".") ;
            AV17usua_claveOld = httpContext.cgiGet( "vUSUA_CLAVEOLD") ;
            AV19usua_EstadoOld = httpContext.cgiGet( "vUSUA_ESTADOOLD") ;
            AV15usua_ApruebaOld = httpContext.cgiGet( "vUSUA_APRUEBAOLD") ;
            AV21Usua_TipConOld = httpContext.cgiGet( "vUSUA_TIPCONOLD") ;
            A228Usua_IndCambioClave = httpContext.cgiGet( "USUA_INDCAMBIOCLAVE") ;
            AV26Integra = httpContext.cgiGet( "vINTEGRA") ;
            AV27Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_USUARIO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A23Usua_Id != Z23Usua_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_usuario:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            forbiddenHiddens2 = "" ;
            if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
            {
               A24Usua_Codigo = httpContext.cgiGet( edtUsua_Codigo_Internalname) ;
               httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
               forbiddenHiddens2 = forbiddenHiddens2 + GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")) ;
            }
            hsh2 = httpContext.cgiGet( "hsh2") ;
            if ( ( ! ( ( A23Usua_Id != Z23Usua_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens2, hsh2, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_usuario:[CondSecurityCheckFailed]"+forbiddenHiddens2);
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
               A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
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
                  sMode5 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode5 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound5 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0S0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "USUA_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtUsua_Id_Internalname ;
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
                        e110S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120S2 ();
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
         e120S2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0S5( ) ;
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
         disableAttributes0S5( ) ;
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

   public void confirm_0S0( )
   {
      beforeValidate0S5( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0S5( ) ;
         }
         else
         {
            checkExtendedTable0S5( ) ;
            closeExtendedTableCursors0S5( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0S0( )
   {
   }

   public void e110S2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV27Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV27Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV14TrnContext.fromxml(AV23WebSession.getValue("TrnContext"), null, null);
      edtUsua_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtUsua_Id_Visible, 5, 0)), true);
      AV22Usuario = AV23WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
   }

   public void e120S2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV14TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_usuario") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0S5( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z223Usua_UsuarioCrea = T000S3_A223Usua_UsuarioCrea[0] ;
            Z225Usua_UsuarioModifica = T000S3_A225Usua_UsuarioModifica[0] ;
            Z229Usua_Administrador = T000S3_A229Usua_Administrador[0] ;
            Z224Usua_FechaCrea = T000S3_A224Usua_FechaCrea[0] ;
            Z227usua_FechaModifica = T000S3_A227usua_FechaModifica[0] ;
            Z221Usua_Estado = T000S3_A221Usua_Estado[0] ;
            Z220Usua_Clave = T000S3_A220Usua_Clave[0] ;
            Z24Usua_Codigo = T000S3_A24Usua_Codigo[0] ;
            Z25Usua_Nombre = T000S3_A25Usua_Nombre[0] ;
            Z219Usua_Email = T000S3_A219Usua_Email[0] ;
            Z26Usua_Cedula = T000S3_A26Usua_Cedula[0] ;
            Z222Usua_UsuAprueba = T000S3_A222Usua_UsuAprueba[0] ;
            Z226Usua_TipoContrato = T000S3_A226Usua_TipoContrato[0] ;
            Z228Usua_IndCambioClave = T000S3_A228Usua_IndCambioClave[0] ;
         }
         else
         {
            Z223Usua_UsuarioCrea = A223Usua_UsuarioCrea ;
            Z225Usua_UsuarioModifica = A225Usua_UsuarioModifica ;
            Z229Usua_Administrador = A229Usua_Administrador ;
            Z224Usua_FechaCrea = A224Usua_FechaCrea ;
            Z227usua_FechaModifica = A227usua_FechaModifica ;
            Z221Usua_Estado = A221Usua_Estado ;
            Z220Usua_Clave = A220Usua_Clave ;
            Z24Usua_Codigo = A24Usua_Codigo ;
            Z25Usua_Nombre = A25Usua_Nombre ;
            Z219Usua_Email = A219Usua_Email ;
            Z26Usua_Cedula = A26Usua_Cedula ;
            Z222Usua_UsuAprueba = A222Usua_UsuAprueba ;
            Z226Usua_TipoContrato = A226Usua_TipoContrato ;
            Z228Usua_IndCambioClave = A228Usua_IndCambioClave ;
         }
      }
      if ( GX_JID == -34 )
      {
         Z23Usua_Id = A23Usua_Id ;
         Z223Usua_UsuarioCrea = A223Usua_UsuarioCrea ;
         Z225Usua_UsuarioModifica = A225Usua_UsuarioModifica ;
         Z229Usua_Administrador = A229Usua_Administrador ;
         Z224Usua_FechaCrea = A224Usua_FechaCrea ;
         Z227usua_FechaModifica = A227usua_FechaModifica ;
         Z221Usua_Estado = A221Usua_Estado ;
         Z220Usua_Clave = A220Usua_Clave ;
         Z24Usua_Codigo = A24Usua_Codigo ;
         Z25Usua_Nombre = A25Usua_Nombre ;
         Z219Usua_Email = A219Usua_Email ;
         Z26Usua_Cedula = A26Usua_Cedula ;
         Z222Usua_UsuAprueba = A222Usua_UsuAprueba ;
         Z226Usua_TipoContrato = A226Usua_TipoContrato ;
         Z228Usua_IndCambioClave = A228Usua_IndCambioClave ;
      }
   }

   public void standaloneNotModal( )
   {
      edtUsua_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Id_Enabled, 5, 0)), true);
      AV8CryptoHash.setAlgorithm( "SHA512" );
      edtUsua_Clave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Clave_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Clave_Enabled, 5, 0)), true);
      GXv_char1[0] = AV26Integra ;
      new com.orions2.parametrosintegracion(remoteHandle, context).execute( GXv_char1) ;
      seg_usuario_impl.this.AV26Integra = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Integra", AV26Integra);
      edtUsua_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Id_Enabled, 5, 0)), true);
      edtUsua_Clave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Clave_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Clave_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV25Usua_Id) )
      {
         A23Usua_Id = AV25Usua_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         cmbUsua_Estado.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbUsua_Estado.getEnabled(), 5, 0)), true);
      }
      else
      {
         cmbUsua_Estado.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbUsua_Estado.getEnabled(), 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtUsua_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUsua_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtUsua_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUsua_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         cmbUsua_Estado.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbUsua_Estado.getEnabled(), 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtUsua_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtUsua_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Codigo_Enabled, 5, 0)), true);
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
         AV27Pgmname = "SEG_USUARIO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      }
   }

   public void load0S5( )
   {
      /* Using cursor T000S4 */
      pr_default.execute(2, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A223Usua_UsuarioCrea = T000S4_A223Usua_UsuarioCrea[0] ;
         A225Usua_UsuarioModifica = T000S4_A225Usua_UsuarioModifica[0] ;
         A229Usua_Administrador = T000S4_A229Usua_Administrador[0] ;
         A224Usua_FechaCrea = T000S4_A224Usua_FechaCrea[0] ;
         A227usua_FechaModifica = T000S4_A227usua_FechaModifica[0] ;
         A221Usua_Estado = T000S4_A221Usua_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
         A220Usua_Clave = T000S4_A220Usua_Clave[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         A24Usua_Codigo = T000S4_A24Usua_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         A25Usua_Nombre = T000S4_A25Usua_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
         A219Usua_Email = T000S4_A219Usua_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
         A26Usua_Cedula = T000S4_A26Usua_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         A222Usua_UsuAprueba = T000S4_A222Usua_UsuAprueba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
         A226Usua_TipoContrato = T000S4_A226Usua_TipoContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
         A228Usua_IndCambioClave = T000S4_A228Usua_IndCambioClave[0] ;
         zm0S5( -34) ;
      }
      pr_default.close(2);
      onLoadActions0S5( ) ;
   }

   public void onLoadActions0S5( )
   {
      AV27Pgmname = "SEG_USUARIO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      AV20Usua_NomOld = O25Usua_Nombre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Usua_NomOld", AV20Usua_NomOld);
      AV18Usua_EmailOld = O219Usua_Email ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_EmailOld", AV18Usua_EmailOld);
      AV16Usua_CedulaOld = O26Usua_Cedula ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_CedulaOld", GXutil.ltrim( GXutil.str( AV16Usua_CedulaOld, 18, 0)));
      AV19usua_EstadoOld = O221Usua_Estado ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
      AV15usua_ApruebaOld = O222Usua_UsuAprueba ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15usua_ApruebaOld", AV15usua_ApruebaOld);
      AV21Usua_TipConOld = O226Usua_TipoContrato ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usua_TipConOld", AV21Usua_TipConOld);
      AV17usua_claveOld = O220Usua_Clave ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17usua_claveOld", AV17usua_claveOld);
   }

   public void checkExtendedTable0S5( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV27Pgmname = "SEG_USUARIO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      /* Using cursor T000S5 */
      pr_default.execute(3, new Object[] {A24Usua_Codigo, new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Usuario"}), 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T000S6 */
      pr_default.execute(4, new Object[] {new Long(A26Usua_Cedula), new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Cedula del Usuario"}), 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( ( GXutil.strcmp(A24Usua_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el código del usuario", 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV20Usua_NomOld = O25Usua_Nombre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Usua_NomOld", AV20Usua_NomOld);
      if ( ( GXutil.strcmp(A25Usua_Nombre, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el nombre del usuario", 1, "USUA_NOMBRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Nombre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GxRegex.IsMatch(A219Usua_Email,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") ) )
      {
         httpContext.GX_msglist.addItem("El valor de Email del Usuario no coincide con el patrón especificado", "OutOfRange", 1, "USUA_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Email_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV18Usua_EmailOld = O219Usua_Email ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_EmailOld", AV18Usua_EmailOld);
      if ( ( GXutil.strcmp(A219Usua_Email, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el Email del usuario", 1, "USUA_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Email_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV16Usua_CedulaOld = O26Usua_Cedula ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_CedulaOld", GXutil.ltrim( GXutil.str( AV16Usua_CedulaOld, 18, 0)));
      if ( ( A26Usua_Cedula == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la cédula del Usuario", 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV19usua_EstadoOld = O221Usua_Estado ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
      AV15usua_ApruebaOld = O222Usua_UsuAprueba ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15usua_ApruebaOld", AV15usua_ApruebaOld);
      if ( ( GXutil.strcmp(A222Usua_UsuAprueba, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el usuario que aprueba", 1, "USUA_USUAPRUEBA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_UsuAprueba_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV21Usua_TipConOld = O226Usua_TipoContrato ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usua_TipConOld", AV21Usua_TipConOld);
      if ( ( GXutil.strcmp(A226Usua_TipoContrato, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el tipo del Contrato", 1, "USUA_TIPOCONTRATO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbUsua_TipoContrato.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV17usua_claveOld = O220Usua_Clave ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17usua_claveOld", AV17usua_claveOld);
   }

   public void closeExtendedTableCursors0S5( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0S5( )
   {
      /* Using cursor T000S7 */
      pr_default.execute(5, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000S3 */
      pr_default.execute(1, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0S5( 34) ;
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000S3_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         A223Usua_UsuarioCrea = T000S3_A223Usua_UsuarioCrea[0] ;
         A225Usua_UsuarioModifica = T000S3_A225Usua_UsuarioModifica[0] ;
         A229Usua_Administrador = T000S3_A229Usua_Administrador[0] ;
         A224Usua_FechaCrea = T000S3_A224Usua_FechaCrea[0] ;
         A227usua_FechaModifica = T000S3_A227usua_FechaModifica[0] ;
         A221Usua_Estado = T000S3_A221Usua_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
         A220Usua_Clave = T000S3_A220Usua_Clave[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         A24Usua_Codigo = T000S3_A24Usua_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         A25Usua_Nombre = T000S3_A25Usua_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
         A219Usua_Email = T000S3_A219Usua_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
         A26Usua_Cedula = T000S3_A26Usua_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         A222Usua_UsuAprueba = T000S3_A222Usua_UsuAprueba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
         A226Usua_TipoContrato = T000S3_A226Usua_TipoContrato[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
         A228Usua_IndCambioClave = T000S3_A228Usua_IndCambioClave[0] ;
         O226Usua_TipoContrato = A226Usua_TipoContrato ;
         httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
         O222Usua_UsuAprueba = A222Usua_UsuAprueba ;
         httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
         O221Usua_Estado = A221Usua_Estado ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
         O220Usua_Clave = A220Usua_Clave ;
         httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
         O26Usua_Cedula = A26Usua_Cedula ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         O219Usua_Email = A219Usua_Email ;
         httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
         O25Usua_Nombre = A25Usua_Nombre ;
         httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
         Z23Usua_Id = A23Usua_Id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0S5( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey0S5( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey0S5( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0S5( ) ;
      if ( RcdFound5 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T000S8 */
      pr_default.execute(6, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A23Usua_Id[0] < A23Usua_Id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A23Usua_Id[0] > A23Usua_Id ) ) )
         {
            A23Usua_Id = T000S8_A23Usua_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T000S9 */
      pr_default.execute(7, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000S9_A23Usua_Id[0] > A23Usua_Id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000S9_A23Usua_Id[0] < A23Usua_Id ) ) )
         {
            A23Usua_Id = T000S9_A23Usua_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0S5( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtUsua_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0S5( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound5 == 1 )
         {
            if ( A23Usua_Id != Z23Usua_Id )
            {
               A23Usua_Id = Z23Usua_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "USUA_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsua_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUsua_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0S5( ) ;
               GX_FocusControl = edtUsua_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A23Usua_Id != Z23Usua_Id )
            {
               /* Insert record */
               GX_FocusControl = edtUsua_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0S5( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "USUA_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUsua_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtUsua_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0S5( ) ;
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
      if ( A23Usua_Id != Z23Usua_Id )
      {
         A23Usua_Id = Z23Usua_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "USUA_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0S5( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000S2 */
         pr_default.execute(0, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z223Usua_UsuarioCrea, T000S2_A223Usua_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z225Usua_UsuarioModifica, T000S2_A225Usua_UsuarioModifica[0]) != 0 ) || ( GXutil.strcmp(Z229Usua_Administrador, T000S2_A229Usua_Administrador[0]) != 0 ) || !( GXutil.dateCompare(Z224Usua_FechaCrea, T000S2_A224Usua_FechaCrea[0]) ) || !( GXutil.dateCompare(Z227usua_FechaModifica, T000S2_A227usua_FechaModifica[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z221Usua_Estado, T000S2_A221Usua_Estado[0]) != 0 ) || ( GXutil.strcmp(Z220Usua_Clave, T000S2_A220Usua_Clave[0]) != 0 ) || ( GXutil.strcmp(Z24Usua_Codigo, T000S2_A24Usua_Codigo[0]) != 0 ) || ( GXutil.strcmp(Z25Usua_Nombre, T000S2_A25Usua_Nombre[0]) != 0 ) || ( GXutil.strcmp(Z219Usua_Email, T000S2_A219Usua_Email[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z26Usua_Cedula != T000S2_A26Usua_Cedula[0] ) || ( GXutil.strcmp(Z222Usua_UsuAprueba, T000S2_A222Usua_UsuAprueba[0]) != 0 ) || ( GXutil.strcmp(Z226Usua_TipoContrato, T000S2_A226Usua_TipoContrato[0]) != 0 ) || ( GXutil.strcmp(Z228Usua_IndCambioClave, T000S2_A228Usua_IndCambioClave[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_USUARIO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0S5( )
   {
      beforeValidate0S5( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S5( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0S5( 0) ;
         checkOptimisticConcurrency0S5( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S5( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0S5( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000S10 */
                  pr_default.execute(8, new Object[] {A223Usua_UsuarioCrea, A225Usua_UsuarioModifica, A229Usua_Administrador, A224Usua_FechaCrea, A227usua_FechaModifica, A221Usua_Estado, A220Usua_Clave, A24Usua_Codigo, A25Usua_Nombre, A219Usua_Email, new Long(A26Usua_Cedula), A222Usua_UsuAprueba, A226Usua_TipoContrato, A228Usua_IndCambioClave});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000S11 */
                  pr_default.execute(9);
                  A23Usua_Id = T000S11_A23Usua_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0S0( ) ;
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
            load0S5( ) ;
         }
         endLevel0S5( ) ;
      }
      closeExtendedTableCursors0S5( ) ;
   }

   public void update0S5( )
   {
      beforeValidate0S5( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S5( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S5( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S5( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0S5( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000S12 */
                  pr_default.execute(10, new Object[] {A223Usua_UsuarioCrea, A225Usua_UsuarioModifica, A229Usua_Administrador, A224Usua_FechaCrea, A227usua_FechaModifica, A221Usua_Estado, A220Usua_Clave, A24Usua_Codigo, A25Usua_Nombre, A219Usua_Email, new Long(A26Usua_Cedula), A222Usua_UsuAprueba, A226Usua_TipoContrato, A228Usua_IndCambioClave, new Long(A23Usua_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0S5( ) ;
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
         endLevel0S5( ) ;
      }
      closeExtendedTableCursors0S5( ) ;
   }

   public void deferredUpdate0S5( )
   {
   }

   public void delete( )
   {
      beforeValidate0S5( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S5( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0S5( ) ;
         afterConfirm0S5( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0S5( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000S13 */
               pr_default.execute(11, new Object[] {new Long(A23Usua_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
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
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0S5( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0S5( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV27Pgmname = "SEG_USUARIO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         AV20Usua_NomOld = O25Usua_Nombre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Usua_NomOld", AV20Usua_NomOld);
         AV18Usua_EmailOld = O219Usua_Email ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_EmailOld", AV18Usua_EmailOld);
         AV16Usua_CedulaOld = O26Usua_Cedula ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_CedulaOld", GXutil.ltrim( GXutil.str( AV16Usua_CedulaOld, 18, 0)));
         AV19usua_EstadoOld = O221Usua_Estado ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
         AV15usua_ApruebaOld = O222Usua_UsuAprueba ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15usua_ApruebaOld", AV15usua_ApruebaOld);
         AV21Usua_TipConOld = O226Usua_TipoContrato ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Usua_TipConOld", AV21Usua_TipConOld);
         AV17usua_claveOld = O220Usua_Clave ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17usua_claveOld", AV17usua_claveOld);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000S14 */
         pr_default.execute(12, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000S15 */
         pr_default.execute(13, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"USUARIO Y ROLES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000S16 */
         pr_default.execute(14, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"USUARIO Y CENTROS DE COSTO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel0S5( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0S5( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_usuario");
         if ( AnyError == 0 )
         {
            confirmValues0S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_usuario");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0S5( )
   {
      /* Scan By routine */
      /* Using cursor T000S17 */
      pr_default.execute(15);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000S17_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0S5( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000S17_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
   }

   public void scanEnd0S5( )
   {
      pr_default.close(15);
   }

   public void afterConfirm0S5( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A224Usua_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A224Usua_FechaCrea", localUtil.ttoc( A224Usua_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A227usua_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A227usua_FechaModifica", localUtil.ttoc( A227usua_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && true /* After */ )
      {
         A221Usua_Estado = "A" ;
         httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
      }
      if ( ( GXutil.strcmp(A24Usua_Codigo, "ADMINSENA") == 0 ) && true /* After */ )
      {
         A229Usua_Administrador = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "A229Usua_Administrador", A229Usua_Administrador);
      }
      else
      {
         if ( ( GXutil.strcmp(A24Usua_Codigo, "ADMINSENA") != 0 ) && true /* After */ )
         {
            A229Usua_Administrador = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, "A229Usua_Administrador", A229Usua_Administrador);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A220Usua_Clave = AV8CryptoHash.compute(GXutil.trim( GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0))), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(A220Usua_Clave, AV17usua_claveOld) != 0 ) ) && true /* After */ )
      {
         A228Usua_IndCambioClave = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "A228Usua_IndCambioClave", A228Usua_IndCambioClave);
      }
      if ( ( GXutil.strcmp(AV26Integra, "SI") == 0 ) && ( GXutil.strcmp(A221Usua_Estado, "I") == 0 ) && ( GXutil.strcmp(AV19usua_EstadoOld, "A") == 0 ) && true /* After */ )
      {
         GXv_char1[0] = AV22Usuario ;
         GXv_int2[0] = A23Usua_Id ;
         GXv_int3[0] = (byte)(0) ;
         new com.orions2.wsinactivarusuario(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         seg_usuario_impl.this.AV22Usuario = GXv_char1[0] ;
         seg_usuario_impl.this.A23Usua_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A223Usua_UsuarioCrea = AV22Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A223Usua_UsuarioCrea", A223Usua_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A225Usua_UsuarioModifica = AV22Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A225Usua_UsuarioModifica", A225Usua_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(AV26Integra, "SI") == 0 ) && ( GXutil.strcmp(A221Usua_Estado, "A") == 0 ) && ( GXutil.strcmp(AV19usua_EstadoOld, "I") == 0 ) && true /* After */ )
      {
         GXv_char1[0] = AV22Usuario ;
         GXv_int2[0] = A23Usua_Id ;
         GXv_int3[0] = (byte)(1) ;
         new com.orions2.wsinactivarusuario(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         seg_usuario_impl.this.AV22Usuario = GXv_char1[0] ;
         seg_usuario_impl.this.A23Usua_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
   }

   public void beforeInsert0S5( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0S5( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0S5( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0S5( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0S5( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0S5( )
   {
      edtUsua_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Id_Enabled, 5, 0)), true);
      edtUsua_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Codigo_Enabled, 5, 0)), true);
      edtUsua_Nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Nombre_Enabled, 5, 0)), true);
      edtUsua_Email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Email_Enabled, 5, 0)), true);
      edtUsua_Cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Cedula_Enabled, 5, 0)), true);
      edtUsua_Clave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_Clave_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_Clave_Enabled, 5, 0)), true);
      cmbUsua_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbUsua_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbUsua_Estado.getEnabled(), 5, 0)), true);
      cmbUsua_TipoContrato.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbUsua_TipoContrato.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbUsua_TipoContrato.getEnabled(), 5, 0)), true);
      edtUsua_UsuAprueba_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsua_UsuAprueba_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtUsua_UsuAprueba_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0S0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414161969");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_usuario") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Usua_Id,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z23Usua_Id", GXutil.ltrim( localUtil.ntoc( Z23Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z223Usua_UsuarioCrea", Z223Usua_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z225Usua_UsuarioModifica", Z225Usua_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z229Usua_Administrador", GXutil.rtrim( Z229Usua_Administrador));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z224Usua_FechaCrea", localUtil.ttoc( Z224Usua_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z227usua_FechaModifica", localUtil.ttoc( Z227usua_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z221Usua_Estado", GXutil.rtrim( Z221Usua_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z220Usua_Clave", Z220Usua_Clave);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z24Usua_Codigo", Z24Usua_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z25Usua_Nombre", Z25Usua_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z219Usua_Email", Z219Usua_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z26Usua_Cedula", GXutil.ltrim( localUtil.ntoc( Z26Usua_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z222Usua_UsuAprueba", Z222Usua_UsuAprueba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z226Usua_TipoContrato", GXutil.rtrim( Z226Usua_TipoContrato));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z228Usua_IndCambioClave", GXutil.rtrim( Z228Usua_IndCambioClave));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O226Usua_TipoContrato", GXutil.rtrim( O226Usua_TipoContrato));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O222Usua_UsuAprueba", O222Usua_UsuAprueba);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O221Usua_Estado", GXutil.rtrim( O221Usua_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O220Usua_Clave", O220Usua_Clave);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O26Usua_Cedula", GXutil.ltrim( localUtil.ntoc( O26Usua_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O219Usua_Email", O219Usua_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "O25Usua_Nombre", O25Usua_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV14TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV14TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV25Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV22Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_USUARIOCREA", A223Usua_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_USUARIOMODIFICA", A225Usua_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ADMINISTRADOR", GXutil.rtrim( A229Usua_Administrador));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_FECHACREA", localUtil.ttoc( A224Usua_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_FECHAMODIFICA", localUtil.ttoc( A227usua_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_NOMOLD", AV20Usua_NomOld);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_EMAILOLD", AV18Usua_EmailOld);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_CEDULAOLD", GXutil.ltrim( localUtil.ntoc( AV16Usua_CedulaOld, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_CLAVEOLD", AV17usua_claveOld);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_ESTADOOLD", GXutil.rtrim( AV19usua_EstadoOld));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_APRUEBAOLD", AV15usua_ApruebaOld);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_TIPCONOLD", GXutil.rtrim( AV21Usua_TipConOld));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_INDCAMBIOCLAVE", GXutil.rtrim( A228Usua_IndCambioClave));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINTEGRA", GXutil.rtrim( AV26Integra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV27Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_USUARIO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_usuario:[SendSecurityCheck]"+forbiddenHiddens);
      forbiddenHiddens2 = "" ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         forbiddenHiddens2 = forbiddenHiddens2 + GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh2", GXutil.getEncryptedSignature( forbiddenHiddens2, GXKey));
      GXutil.writeLogln("seg_usuario:[SendCondSecurityCheck]"+forbiddenHiddens2);
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
      return formatLink("com.orions2.seg_usuario") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25Usua_Id,18,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_USUARIO" ;
   }

   public String getPgmdesc( )
   {
      return "Usuario" ;
   }

   public void initializeNonKey0S5( )
   {
      A223Usua_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A223Usua_UsuarioCrea", A223Usua_UsuarioCrea);
      A225Usua_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A225Usua_UsuarioModifica", A225Usua_UsuarioModifica);
      A229Usua_Administrador = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A229Usua_Administrador", A229Usua_Administrador);
      A224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A224Usua_FechaCrea", localUtil.ttoc( A224Usua_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A227usua_FechaModifica", localUtil.ttoc( A227usua_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A221Usua_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
      AV20Usua_NomOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Usua_NomOld", AV20Usua_NomOld);
      AV18Usua_EmailOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usua_EmailOld", AV18Usua_EmailOld);
      AV16Usua_CedulaOld = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usua_CedulaOld", GXutil.ltrim( GXutil.str( AV16Usua_CedulaOld, 18, 0)));
      AV17usua_claveOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17usua_claveOld", AV17usua_claveOld);
      AV19usua_EstadoOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19usua_EstadoOld", AV19usua_EstadoOld);
      AV15usua_ApruebaOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15usua_ApruebaOld", AV15usua_ApruebaOld);
      AV21Usua_TipConOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usua_TipConOld", AV21Usua_TipConOld);
      A220Usua_Clave = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      A24Usua_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      A25Usua_Nombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
      A219Usua_Email = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
      A26Usua_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
      A222Usua_UsuAprueba = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
      A226Usua_TipoContrato = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
      A228Usua_IndCambioClave = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A228Usua_IndCambioClave", A228Usua_IndCambioClave);
      O226Usua_TipoContrato = A226Usua_TipoContrato ;
      httpContext.ajax_rsp_assign_attri("", false, "A226Usua_TipoContrato", A226Usua_TipoContrato);
      O222Usua_UsuAprueba = A222Usua_UsuAprueba ;
      httpContext.ajax_rsp_assign_attri("", false, "A222Usua_UsuAprueba", A222Usua_UsuAprueba);
      O221Usua_Estado = A221Usua_Estado ;
      httpContext.ajax_rsp_assign_attri("", false, "A221Usua_Estado", A221Usua_Estado);
      O220Usua_Clave = A220Usua_Clave ;
      httpContext.ajax_rsp_assign_attri("", false, "A220Usua_Clave", A220Usua_Clave);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CLAVE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A220Usua_Clave, ""))));
      O26Usua_Cedula = A26Usua_Cedula ;
      httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
      O219Usua_Email = A219Usua_Email ;
      httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
      O25Usua_Nombre = A25Usua_Nombre ;
      httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
      Z223Usua_UsuarioCrea = "" ;
      Z225Usua_UsuarioModifica = "" ;
      Z229Usua_Administrador = "" ;
      Z224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z221Usua_Estado = "" ;
      Z220Usua_Clave = "" ;
      Z24Usua_Codigo = "" ;
      Z25Usua_Nombre = "" ;
      Z219Usua_Email = "" ;
      Z26Usua_Cedula = 0 ;
      Z222Usua_UsuAprueba = "" ;
      Z226Usua_TipoContrato = "" ;
      Z228Usua_IndCambioClave = "" ;
   }

   public void initAll0S5( )
   {
      A23Usua_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      initializeNonKey0S5( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414161985");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_usuario.js", "?201861414161985");
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
      edtUsua_Id_Internalname = "USUA_ID" ;
      edtUsua_Codigo_Internalname = "USUA_CODIGO" ;
      edtUsua_Nombre_Internalname = "USUA_NOMBRE" ;
      edtUsua_Email_Internalname = "USUA_EMAIL" ;
      edtUsua_Cedula_Internalname = "USUA_CEDULA" ;
      edtUsua_Clave_Internalname = "USUA_CLAVE" ;
      cmbUsua_Estado.setInternalname( "USUA_ESTADO" );
      cmbUsua_TipoContrato.setInternalname( "USUA_TIPOCONTRATO" );
      edtUsua_UsuAprueba_Internalname = "USUA_USUAPRUEBA" ;
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
      Form.setCaption( "Usuario" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUsua_UsuAprueba_Jsonclick = "" ;
      edtUsua_UsuAprueba_Enabled = 1 ;
      cmbUsua_TipoContrato.setJsonclick( "" );
      cmbUsua_TipoContrato.setEnabled( 1 );
      cmbUsua_Estado.setJsonclick( "" );
      cmbUsua_Estado.setEnabled( 1 );
      edtUsua_Clave_Jsonclick = "" ;
      edtUsua_Clave_Enabled = 0 ;
      edtUsua_Cedula_Jsonclick = "" ;
      edtUsua_Cedula_Enabled = 1 ;
      edtUsua_Email_Jsonclick = "" ;
      edtUsua_Email_Enabled = 1 ;
      edtUsua_Nombre_Jsonclick = "" ;
      edtUsua_Nombre_Enabled = 1 ;
      edtUsua_Codigo_Jsonclick = "" ;
      edtUsua_Codigo_Enabled = 1 ;
      edtUsua_Id_Jsonclick = "" ;
      edtUsua_Id_Enabled = 0 ;
      edtUsua_Id_Visible = 1 ;
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

   public void xc_31_0S5( )
   {
      GXv_char1[0] = AV26Integra ;
      new com.orions2.parametrosintegracion(remoteHandle, context).execute( GXv_char1) ;
      AV26Integra = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Integra", AV26Integra);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV26Integra))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_32_0S5( String AV22Usuario ,
                          long A23Usua_Id ,
                          String AV26Integra ,
                          String A221Usua_Estado ,
                          String AV19usua_EstadoOld )
   {
      if ( ( GXutil.strcmp(AV26Integra, "SI") == 0 ) && ( GXutil.strcmp(A221Usua_Estado, "I") == 0 ) && ( GXutil.strcmp(AV19usua_EstadoOld, "A") == 0 ) && true /* After */ )
      {
         GXv_char1[0] = AV22Usuario ;
         GXv_int2[0] = A23Usua_Id ;
         GXv_int3[0] = (byte)(0) ;
         new com.orions2.wsinactivarusuario(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         AV22Usuario = GXv_char1[0] ;
         A23Usua_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( AV22Usuario)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_33_0S5( String AV22Usuario ,
                          long A23Usua_Id ,
                          String AV26Integra ,
                          String A221Usua_Estado ,
                          String AV19usua_EstadoOld )
   {
      if ( ( GXutil.strcmp(AV26Integra, "SI") == 0 ) && ( GXutil.strcmp(A221Usua_Estado, "A") == 0 ) && ( GXutil.strcmp(AV19usua_EstadoOld, "I") == 0 ) && true /* After */ )
      {
         GXv_char1[0] = AV22Usuario ;
         GXv_int2[0] = A23Usua_Id ;
         GXv_int3[0] = (byte)(1) ;
         new com.orions2.wsinactivarusuario(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         AV22Usuario = GXv_char1[0] ;
         A23Usua_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Usuario", AV22Usuario);
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( AV22Usuario)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void valid_Usua_codigo( String GX_Parm1 ,
                                  long GX_Parm2 )
   {
      A24Usua_Codigo = GX_Parm1 ;
      A23Usua_Id = GX_Parm2 ;
      /* Using cursor T000S18 */
      pr_default.execute(16, new Object[] {A24Usua_Codigo, new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Usuario"}), 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
      }
      pr_default.close(16);
      if ( ( GXutil.strcmp(A24Usua_Codigo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el código del usuario", 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
      }
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_nombre( String GX_Parm1 ,
                                  String GX_Parm2 ,
                                  String GX_Parm3 )
   {
      O25Usua_Nombre = GX_Parm1 ;
      A25Usua_Nombre = GX_Parm2 ;
      AV20Usua_NomOld = GX_Parm3 ;
      AV20Usua_NomOld = O25Usua_Nombre ;
      if ( ( GXutil.strcmp(A25Usua_Nombre, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el nombre del usuario", 1, "USUA_NOMBRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Nombre_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV20Usua_NomOld);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_email( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      O219Usua_Email = GX_Parm1 ;
      A219Usua_Email = GX_Parm2 ;
      AV18Usua_EmailOld = GX_Parm3 ;
      if ( ! ( GxRegex.IsMatch(A219Usua_Email,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") ) )
      {
         httpContext.GX_msglist.addItem("El valor de Email del Usuario no coincide con el patrón especificado", "OutOfRange", 1, "USUA_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Email_Internalname ;
      }
      AV18Usua_EmailOld = O219Usua_Email ;
      if ( ( GXutil.strcmp(A219Usua_Email, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el Email del usuario", 1, "USUA_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Email_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV18Usua_EmailOld);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_cedula( long GX_Parm1 ,
                                  long GX_Parm2 ,
                                  long GX_Parm3 ,
                                  long GX_Parm4 )
   {
      O26Usua_Cedula = GX_Parm1 ;
      A26Usua_Cedula = GX_Parm2 ;
      A23Usua_Id = GX_Parm3 ;
      AV16Usua_CedulaOld = GX_Parm4 ;
      /* Using cursor T000S19 */
      pr_default.execute(17, new Object[] {new Long(A26Usua_Cedula), new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Cedula del Usuario"}), 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
      }
      pr_default.close(17);
      AV16Usua_CedulaOld = O26Usua_Cedula ;
      if ( ( A26Usua_Cedula == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la cédula del Usuario", 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( AV16Usua_CedulaOld, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_clave( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      O220Usua_Clave = GX_Parm1 ;
      A220Usua_Clave = GX_Parm2 ;
      AV17usua_claveOld = GX_Parm3 ;
      AV17usua_claveOld = O220Usua_Clave ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV17usua_claveOld);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_estado( String GX_Parm1 ,
                                  com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                  String GX_Parm3 )
   {
      O221Usua_Estado = GX_Parm1 ;
      cmbUsua_Estado = GX_Parm2 ;
      A221Usua_Estado = cmbUsua_Estado.getValue() ;
      AV19usua_EstadoOld = GX_Parm3 ;
      AV19usua_EstadoOld = O221Usua_Estado ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( AV19usua_EstadoOld));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_tipocontrato( String GX_Parm1 ,
                                        com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                        String GX_Parm3 )
   {
      O226Usua_TipoContrato = GX_Parm1 ;
      cmbUsua_TipoContrato = GX_Parm2 ;
      A226Usua_TipoContrato = cmbUsua_TipoContrato.getValue() ;
      AV21Usua_TipConOld = GX_Parm3 ;
      AV21Usua_TipConOld = O226Usua_TipoContrato ;
      if ( ( GXutil.strcmp(A226Usua_TipoContrato, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el tipo del Contrato", 1, "USUA_TIPOCONTRATO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbUsua_TipoContrato.getInternalname() ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( AV21Usua_TipConOld));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_usuaprueba( String GX_Parm1 ,
                                      String GX_Parm2 ,
                                      long GX_Parm3 ,
                                      String GX_Parm4 ,
                                      com.genexus.webpanels.HTMLChoice GX_Parm5 ,
                                      com.genexus.webpanels.HTMLChoice GX_Parm6 ,
                                      String GX_Parm7 ,
                                      String GX_Parm8 ,
                                      String GX_Parm9 )
   {
      A25Usua_Nombre = GX_Parm1 ;
      A219Usua_Email = GX_Parm2 ;
      A26Usua_Cedula = GX_Parm3 ;
      A220Usua_Clave = GX_Parm4 ;
      cmbUsua_Estado = GX_Parm5 ;
      A221Usua_Estado = cmbUsua_Estado.getValue() ;
      cmbUsua_TipoContrato = GX_Parm6 ;
      A226Usua_TipoContrato = cmbUsua_TipoContrato.getValue() ;
      O222Usua_UsuAprueba = GX_Parm7 ;
      A222Usua_UsuAprueba = GX_Parm8 ;
      AV15usua_ApruebaOld = GX_Parm9 ;
      AV15usua_ApruebaOld = O222Usua_UsuAprueba ;
      if ( ( GXutil.strcmp(A222Usua_UsuAprueba, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar el usuario que aprueba", 1, "USUA_USUAPRUEBA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_UsuAprueba_Internalname ;
      }
      O226Usua_TipoContrato = A226Usua_TipoContrato ;
      O222Usua_UsuAprueba = A222Usua_UsuAprueba ;
      O221Usua_Estado = A221Usua_Estado ;
      O220Usua_Clave = A220Usua_Clave ;
      O26Usua_Cedula = A26Usua_Cedula ;
      O219Usua_Email = A219Usua_Email ;
      O25Usua_Nombre = A25Usua_Nombre ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV15usua_ApruebaOld);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV25Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120S2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV14TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z223Usua_UsuarioCrea = "" ;
      Z225Usua_UsuarioModifica = "" ;
      Z229Usua_Administrador = "" ;
      Z224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z221Usua_Estado = "" ;
      Z220Usua_Clave = "" ;
      Z24Usua_Codigo = "" ;
      Z25Usua_Nombre = "" ;
      Z219Usua_Email = "" ;
      Z222Usua_UsuAprueba = "" ;
      Z226Usua_TipoContrato = "" ;
      Z228Usua_IndCambioClave = "" ;
      O226Usua_TipoContrato = "" ;
      O222Usua_UsuAprueba = "" ;
      O221Usua_Estado = "" ;
      O220Usua_Clave = "" ;
      O219Usua_Email = "" ;
      O25Usua_Nombre = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22Usuario = "" ;
      AV26Integra = "" ;
      A221Usua_Estado = "" ;
      AV19usua_EstadoOld = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A226Usua_TipoContrato = "" ;
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
      A24Usua_Codigo = "" ;
      A25Usua_Nombre = "" ;
      A219Usua_Email = "" ;
      A220Usua_Clave = "" ;
      A222Usua_UsuAprueba = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A223Usua_UsuarioCrea = "" ;
      A225Usua_UsuarioModifica = "" ;
      A229Usua_Administrador = "" ;
      A224Usua_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A227usua_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A228Usua_IndCambioClave = "" ;
      AV20Usua_NomOld = "" ;
      AV18Usua_EmailOld = "" ;
      AV17usua_claveOld = "" ;
      AV15usua_ApruebaOld = "" ;
      AV21Usua_TipConOld = "" ;
      AV27Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      forbiddenHiddens2 = "" ;
      hsh2 = "" ;
      sMode5 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV23WebSession = httpContext.getWebSession();
      AV8CryptoHash = new com.genexus.cryptography.GXHashing();
      T000S4_A23Usua_Id = new long[1] ;
      T000S4_A223Usua_UsuarioCrea = new String[] {""} ;
      T000S4_A225Usua_UsuarioModifica = new String[] {""} ;
      T000S4_A229Usua_Administrador = new String[] {""} ;
      T000S4_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000S4_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000S4_A221Usua_Estado = new String[] {""} ;
      T000S4_A220Usua_Clave = new String[] {""} ;
      T000S4_A24Usua_Codigo = new String[] {""} ;
      T000S4_A25Usua_Nombre = new String[] {""} ;
      T000S4_A219Usua_Email = new String[] {""} ;
      T000S4_A26Usua_Cedula = new long[1] ;
      T000S4_A222Usua_UsuAprueba = new String[] {""} ;
      T000S4_A226Usua_TipoContrato = new String[] {""} ;
      T000S4_A228Usua_IndCambioClave = new String[] {""} ;
      T000S5_A24Usua_Codigo = new String[] {""} ;
      T000S6_A26Usua_Cedula = new long[1] ;
      T000S7_A23Usua_Id = new long[1] ;
      T000S3_A23Usua_Id = new long[1] ;
      T000S3_A223Usua_UsuarioCrea = new String[] {""} ;
      T000S3_A225Usua_UsuarioModifica = new String[] {""} ;
      T000S3_A229Usua_Administrador = new String[] {""} ;
      T000S3_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_A221Usua_Estado = new String[] {""} ;
      T000S3_A220Usua_Clave = new String[] {""} ;
      T000S3_A24Usua_Codigo = new String[] {""} ;
      T000S3_A25Usua_Nombre = new String[] {""} ;
      T000S3_A219Usua_Email = new String[] {""} ;
      T000S3_A26Usua_Cedula = new long[1] ;
      T000S3_A222Usua_UsuAprueba = new String[] {""} ;
      T000S3_A226Usua_TipoContrato = new String[] {""} ;
      T000S3_A228Usua_IndCambioClave = new String[] {""} ;
      T000S8_A23Usua_Id = new long[1] ;
      T000S9_A23Usua_Id = new long[1] ;
      T000S2_A23Usua_Id = new long[1] ;
      T000S2_A223Usua_UsuarioCrea = new String[] {""} ;
      T000S2_A225Usua_UsuarioModifica = new String[] {""} ;
      T000S2_A229Usua_Administrador = new String[] {""} ;
      T000S2_A224Usua_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_A227usua_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_A221Usua_Estado = new String[] {""} ;
      T000S2_A220Usua_Clave = new String[] {""} ;
      T000S2_A24Usua_Codigo = new String[] {""} ;
      T000S2_A25Usua_Nombre = new String[] {""} ;
      T000S2_A219Usua_Email = new String[] {""} ;
      T000S2_A26Usua_Cedula = new long[1] ;
      T000S2_A222Usua_UsuAprueba = new String[] {""} ;
      T000S2_A226Usua_TipoContrato = new String[] {""} ;
      T000S2_A228Usua_IndCambioClave = new String[] {""} ;
      T000S11_A23Usua_Id = new long[1] ;
      T000S14_A46Tran_Id = new long[1] ;
      T000S15_A23Usua_Id = new long[1] ;
      T000S15_A21Rol_Id = new long[1] ;
      T000S16_A23Usua_Id = new long[1] ;
      T000S16_A1Cent_Id = new long[1] ;
      T000S17_A23Usua_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char1 = new String [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new byte [1] ;
      T000S18_A24Usua_Codigo = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000S19_A26Usua_Cedula = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_usuario__default(),
         new Object[] {
             new Object[] {
            T000S2_A23Usua_Id, T000S2_A223Usua_UsuarioCrea, T000S2_A225Usua_UsuarioModifica, T000S2_A229Usua_Administrador, T000S2_A224Usua_FechaCrea, T000S2_A227usua_FechaModifica, T000S2_A221Usua_Estado, T000S2_A220Usua_Clave, T000S2_A24Usua_Codigo, T000S2_A25Usua_Nombre,
            T000S2_A219Usua_Email, T000S2_A26Usua_Cedula, T000S2_A222Usua_UsuAprueba, T000S2_A226Usua_TipoContrato, T000S2_A228Usua_IndCambioClave
            }
            , new Object[] {
            T000S3_A23Usua_Id, T000S3_A223Usua_UsuarioCrea, T000S3_A225Usua_UsuarioModifica, T000S3_A229Usua_Administrador, T000S3_A224Usua_FechaCrea, T000S3_A227usua_FechaModifica, T000S3_A221Usua_Estado, T000S3_A220Usua_Clave, T000S3_A24Usua_Codigo, T000S3_A25Usua_Nombre,
            T000S3_A219Usua_Email, T000S3_A26Usua_Cedula, T000S3_A222Usua_UsuAprueba, T000S3_A226Usua_TipoContrato, T000S3_A228Usua_IndCambioClave
            }
            , new Object[] {
            T000S4_A23Usua_Id, T000S4_A223Usua_UsuarioCrea, T000S4_A225Usua_UsuarioModifica, T000S4_A229Usua_Administrador, T000S4_A224Usua_FechaCrea, T000S4_A227usua_FechaModifica, T000S4_A221Usua_Estado, T000S4_A220Usua_Clave, T000S4_A24Usua_Codigo, T000S4_A25Usua_Nombre,
            T000S4_A219Usua_Email, T000S4_A26Usua_Cedula, T000S4_A222Usua_UsuAprueba, T000S4_A226Usua_TipoContrato, T000S4_A228Usua_IndCambioClave
            }
            , new Object[] {
            T000S5_A24Usua_Codigo
            }
            , new Object[] {
            T000S6_A26Usua_Cedula
            }
            , new Object[] {
            T000S7_A23Usua_Id
            }
            , new Object[] {
            T000S8_A23Usua_Id
            }
            , new Object[] {
            T000S9_A23Usua_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000S11_A23Usua_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000S14_A46Tran_Id
            }
            , new Object[] {
            T000S15_A23Usua_Id, T000S15_A21Rol_Id
            }
            , new Object[] {
            T000S16_A23Usua_Id, T000S16_A1Cent_Id
            }
            , new Object[] {
            T000S17_A23Usua_Id
            }
            , new Object[] {
            T000S18_A24Usua_Codigo
            }
            , new Object[] {
            T000S19_A26Usua_Cedula
            }
         }
      );
      AV27Pgmname = "SEG_USUARIO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int3[] ;
   private byte wbTemp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound5 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtUsua_Id_Enabled ;
   private int edtUsua_Id_Visible ;
   private int edtUsua_Codigo_Enabled ;
   private int edtUsua_Nombre_Enabled ;
   private int edtUsua_Email_Enabled ;
   private int edtUsua_Cedula_Enabled ;
   private int edtUsua_Clave_Enabled ;
   private int edtUsua_UsuAprueba_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV25Usua_Id ;
   private long Z23Usua_Id ;
   private long Z26Usua_Cedula ;
   private long O26Usua_Cedula ;
   private long A23Usua_Id ;
   private long AV25Usua_Id ;
   private long A26Usua_Cedula ;
   private long AV16Usua_CedulaOld ;
   private long GXv_int2[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z229Usua_Administrador ;
   private String Z221Usua_Estado ;
   private String Z226Usua_TipoContrato ;
   private String Z228Usua_IndCambioClave ;
   private String O226Usua_TipoContrato ;
   private String O221Usua_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV26Integra ;
   private String A221Usua_Estado ;
   private String AV19usua_EstadoOld ;
   private String Gx_mode ;
   private String GXKey ;
   private String A226Usua_TipoContrato ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUsua_Codigo_Internalname ;
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
   private String edtUsua_Id_Internalname ;
   private String edtUsua_Id_Jsonclick ;
   private String edtUsua_Codigo_Jsonclick ;
   private String edtUsua_Nombre_Internalname ;
   private String edtUsua_Nombre_Jsonclick ;
   private String edtUsua_Email_Internalname ;
   private String edtUsua_Email_Jsonclick ;
   private String edtUsua_Cedula_Internalname ;
   private String edtUsua_Cedula_Jsonclick ;
   private String edtUsua_Clave_Internalname ;
   private String edtUsua_Clave_Jsonclick ;
   private String edtUsua_UsuAprueba_Internalname ;
   private String edtUsua_UsuAprueba_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A229Usua_Administrador ;
   private String A228Usua_IndCambioClave ;
   private String AV21Usua_TipConOld ;
   private String AV27Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String forbiddenHiddens2 ;
   private String hsh2 ;
   private String sMode5 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char1[] ;
   private java.util.Date Z224Usua_FechaCrea ;
   private java.util.Date Z227usua_FechaModifica ;
   private java.util.Date A224Usua_FechaCrea ;
   private java.util.Date A227usua_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z223Usua_UsuarioCrea ;
   private String Z225Usua_UsuarioModifica ;
   private String Z220Usua_Clave ;
   private String Z24Usua_Codigo ;
   private String Z25Usua_Nombre ;
   private String Z219Usua_Email ;
   private String Z222Usua_UsuAprueba ;
   private String O222Usua_UsuAprueba ;
   private String O220Usua_Clave ;
   private String O219Usua_Email ;
   private String O25Usua_Nombre ;
   private String AV22Usuario ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A220Usua_Clave ;
   private String A222Usua_UsuAprueba ;
   private String A223Usua_UsuarioCrea ;
   private String A225Usua_UsuarioModifica ;
   private String AV20Usua_NomOld ;
   private String AV18Usua_EmailOld ;
   private String AV17usua_claveOld ;
   private String AV15usua_ApruebaOld ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.cryptography.GXHashing AV8CryptoHash ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbUsua_Estado ;
   private HTMLChoice cmbUsua_TipoContrato ;
   private IDataStoreProvider pr_default ;
   private long[] T000S4_A23Usua_Id ;
   private String[] T000S4_A223Usua_UsuarioCrea ;
   private String[] T000S4_A225Usua_UsuarioModifica ;
   private String[] T000S4_A229Usua_Administrador ;
   private java.util.Date[] T000S4_A224Usua_FechaCrea ;
   private java.util.Date[] T000S4_A227usua_FechaModifica ;
   private String[] T000S4_A221Usua_Estado ;
   private String[] T000S4_A220Usua_Clave ;
   private String[] T000S4_A24Usua_Codigo ;
   private String[] T000S4_A25Usua_Nombre ;
   private String[] T000S4_A219Usua_Email ;
   private long[] T000S4_A26Usua_Cedula ;
   private String[] T000S4_A222Usua_UsuAprueba ;
   private String[] T000S4_A226Usua_TipoContrato ;
   private String[] T000S4_A228Usua_IndCambioClave ;
   private String[] T000S5_A24Usua_Codigo ;
   private long[] T000S6_A26Usua_Cedula ;
   private long[] T000S7_A23Usua_Id ;
   private long[] T000S3_A23Usua_Id ;
   private String[] T000S3_A223Usua_UsuarioCrea ;
   private String[] T000S3_A225Usua_UsuarioModifica ;
   private String[] T000S3_A229Usua_Administrador ;
   private java.util.Date[] T000S3_A224Usua_FechaCrea ;
   private java.util.Date[] T000S3_A227usua_FechaModifica ;
   private String[] T000S3_A221Usua_Estado ;
   private String[] T000S3_A220Usua_Clave ;
   private String[] T000S3_A24Usua_Codigo ;
   private String[] T000S3_A25Usua_Nombre ;
   private String[] T000S3_A219Usua_Email ;
   private long[] T000S3_A26Usua_Cedula ;
   private String[] T000S3_A222Usua_UsuAprueba ;
   private String[] T000S3_A226Usua_TipoContrato ;
   private String[] T000S3_A228Usua_IndCambioClave ;
   private long[] T000S8_A23Usua_Id ;
   private long[] T000S9_A23Usua_Id ;
   private long[] T000S2_A23Usua_Id ;
   private String[] T000S2_A223Usua_UsuarioCrea ;
   private String[] T000S2_A225Usua_UsuarioModifica ;
   private String[] T000S2_A229Usua_Administrador ;
   private java.util.Date[] T000S2_A224Usua_FechaCrea ;
   private java.util.Date[] T000S2_A227usua_FechaModifica ;
   private String[] T000S2_A221Usua_Estado ;
   private String[] T000S2_A220Usua_Clave ;
   private String[] T000S2_A24Usua_Codigo ;
   private String[] T000S2_A25Usua_Nombre ;
   private String[] T000S2_A219Usua_Email ;
   private long[] T000S2_A26Usua_Cedula ;
   private String[] T000S2_A222Usua_UsuAprueba ;
   private String[] T000S2_A226Usua_TipoContrato ;
   private String[] T000S2_A228Usua_IndCambioClave ;
   private long[] T000S11_A23Usua_Id ;
   private long[] T000S14_A46Tran_Id ;
   private long[] T000S15_A23Usua_Id ;
   private long[] T000S15_A21Rol_Id ;
   private long[] T000S16_A23Usua_Id ;
   private long[] T000S16_A1Cent_Id ;
   private long[] T000S17_A23Usua_Id ;
   private String[] T000S18_A24Usua_Codigo ;
   private long[] T000S19_A26Usua_Cedula ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV14TrnContext ;
}

final  class seg_usuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000S2", "SELECT Usua_Id, Usua_UsuarioCrea, Usua_UsuarioModifica, Usua_Administrador, Usua_FechaCrea, usua_FechaModifica, Usua_Estado, Usua_Clave, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_UsuAprueba, Usua_TipoContrato, Usua_IndCambioClave FROM SEG_USUARIO WHERE Usua_Id = ?  FOR UPDATE OF Usua_UsuarioCrea, Usua_UsuarioModifica, Usua_Administrador, Usua_FechaCrea, usua_FechaModifica, Usua_Estado, Usua_Clave, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_UsuAprueba, Usua_TipoContrato, Usua_IndCambioClave NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S3", "SELECT Usua_Id, Usua_UsuarioCrea, Usua_UsuarioModifica, Usua_Administrador, Usua_FechaCrea, usua_FechaModifica, Usua_Estado, Usua_Clave, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_UsuAprueba, Usua_TipoContrato, Usua_IndCambioClave FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Usua_Id, TM1.Usua_UsuarioCrea, TM1.Usua_UsuarioModifica, TM1.Usua_Administrador, TM1.Usua_FechaCrea, TM1.usua_FechaModifica, TM1.Usua_Estado, TM1.Usua_Clave, TM1.Usua_Codigo, TM1.Usua_Nombre, TM1.Usua_Email, TM1.Usua_Cedula, TM1.Usua_UsuAprueba, TM1.Usua_TipoContrato, TM1.Usua_IndCambioClave FROM SEG_USUARIO TM1 WHERE TM1.Usua_Id = ? ORDER BY TM1.Usua_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000S5", "SELECT Usua_Codigo FROM SEG_USUARIO WHERE (Usua_Codigo = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S6", "SELECT Usua_Cedula FROM SEG_USUARIO WHERE (Usua_Cedula = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S7", "SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE ( Usua_Id > ?) ORDER BY Usua_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE ( Usua_Id < ?) ORDER BY Usua_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000S10", "INSERT INTO SEG_USUARIO(Usua_UsuarioCrea, Usua_UsuarioModifica, Usua_Administrador, Usua_FechaCrea, usua_FechaModifica, Usua_Estado, Usua_Clave, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_UsuAprueba, Usua_TipoContrato, Usua_IndCambioClave) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_USUARIO")
         ,new ForEachCursor("T000S11", "SELECT Usua_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000S12", "UPDATE SEG_USUARIO SET Usua_UsuarioCrea=?, Usua_UsuarioModifica=?, Usua_Administrador=?, Usua_FechaCrea=?, usua_FechaModifica=?, Usua_Estado=?, Usua_Clave=?, Usua_Codigo=?, Usua_Nombre=?, Usua_Email=?, Usua_Cedula=?, Usua_UsuAprueba=?, Usua_TipoContrato=?, Usua_IndCambioClave=?  WHERE Usua_Id = ?", GX_NOMASK, "SEG_USUARIO")
         ,new UpdateCursor("T000S13", "DELETE FROM SEG_USUARIO  WHERE Usua_Id = ?", GX_NOMASK, "SEG_USUARIO")
         ,new ForEachCursor("T000S14", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_UsuarioId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S15", "SELECT * FROM (SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S16", "SELECT * FROM (SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S17", "SELECT /*+ FIRST_ROWS(100) */ Usua_Id FROM SEG_USUARIO ORDER BY Usua_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000S18", "SELECT Usua_Codigo FROM SEG_USUARIO WHERE (Usua_Codigo = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S19", "SELECT Usua_Cedula FROM SEG_USUARIO WHERE (Usua_Cedula = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getString(14, 1) ;
               ((String[]) buf[14])[0] = rslt.getString(15, 1) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getString(14, 1) ;
               ((String[]) buf[14])[0] = rslt.getString(15, 1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[6])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[11])[0] = rslt.getLong(12) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[13])[0] = rslt.getString(14, 1) ;
               ((String[]) buf[14])[0] = rslt.getString(15, 1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 17 :
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 5 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 6 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 7 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setVarchar(7, (String)parms[6], 20, false);
               stmt.setVarchar(8, (String)parms[7], 30, false);
               stmt.setVarchar(9, (String)parms[8], 100, false);
               stmt.setVarchar(10, (String)parms[9], 100, false);
               stmt.setBigDecimal(11, ((Number) parms[10]).longValue(), 0);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setVarchar(7, (String)parms[6], 20, false);
               stmt.setVarchar(8, (String)parms[7], 30, false);
               stmt.setVarchar(9, (String)parms[8], 100, false);
               stmt.setVarchar(10, (String)parms[9], 100, false);
               stmt.setBigDecimal(11, ((Number) parms[10]).longValue(), 0);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setBigDecimal(15, ((Number) parms[14]).longValue(), 0);
               return;
            case 11 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 12 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 13 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 14 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 17 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

