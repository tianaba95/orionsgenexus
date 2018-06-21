/*
               File: seg_usuariorol_impl
        Description: Usuario y Roles
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:44.59
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

public final  class seg_usuariorol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_045( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         AV28Integra = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Integra", AV28Integra);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_045( A23Usua_Id, AV28Integra) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A21Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A21Rol_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A1Cent_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A2Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A2Regi_Id) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridseg_usuariorol_seg_usuario_rol") == 0 )
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
         gxnrgridseg_usuariorol_seg_usuario_rol_newrow( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridseg_usuariorol_seg_usuario_centro") == 0 )
      {
         nRC_GXsfl_69 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_69_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_69_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridseg_usuariorol_seg_usuario_centro_newrow( ) ;
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
            AV22Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Usua_Id", GXutil.ltrim( GXutil.str( AV22Usua_Id, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Usuario y Roles", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_usuariorol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_usuariorol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_usuariorol_impl.class ));
   }

   public seg_usuariorol_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Usuario y Roles", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A23Usua_Id), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Id_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Codigo_Internalname, A24Usua_Codigo, GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Codigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Nombre_Internalname, A25Usua_Nombre, GXutil.rtrim( localUtil.format( A25Usua_Nombre, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Nombre_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Email_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Email_Internalname, A219Usua_Email, GXutil.rtrim( localUtil.format( A219Usua_Email, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A219Usua_Email, "", "", "", edtUsua_Email_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_SEG_USUARIOROL.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtUsua_Cedula_Internalname, "Cedula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtUsua_Cedula_Internalname, GXutil.ltrim( localUtil.ntoc( A26Usua_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtUsua_Cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsua_Cedula_Jsonclick, 0, "Attribute", "", "", "", 1, edtUsua_Cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_usuario_roltable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleseg_usuario_rol_Internalname, "USUARIO Y ROLES", "", "", lblTitleseg_usuario_rol_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridseg_usuariorol_seg_usuario_rol( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_usuario_centrotable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleseg_usuario_centro_Internalname, "CENTRO DE COSTO", "", "", lblTitleseg_usuario_centro_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridseg_usuariorol_seg_usuario_centro( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_USUARIOROL.htm");
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

   public void gxdraw_gridseg_usuariorol_seg_usuario_rol( )
   {
      /*  Grid Control  */
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("GridName", "Gridseg_usuariorol_seg_usuario_rol");
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Class", "Grid");
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("CmpContext", "");
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("InMasterPage", "false");
      Gridseg_usuariorol_seg_usuario_rolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_rolColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_rolColumn);
      Gridseg_usuariorol_seg_usuario_rolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_rolContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_rolColumn);
      Gridseg_usuariorol_seg_usuario_rolColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_rolColumn.AddObjectProperty("Value", A22Rol_Descripcion);
      Gridseg_usuariorol_seg_usuario_rolColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_rolColumn);
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_rolContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_rol_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_58_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount6 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_6 = (short)(1) ;
            scanStart046( ) ;
            while ( RcdFound6 != 0 )
            {
               init_level_properties6( ) ;
               getByPrimaryKey046( ) ;
               addRow046( ) ;
               scanNext046( ) ;
            }
            scanEnd046( ) ;
            nBlankRcdCount6 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal046( ) ;
         standaloneModal046( ) ;
         sMode6 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRow046( ) ;
            edtRol_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROL_ID_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
            edtRol_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROL_DESCRIPCION_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
            imgprompt_21_Link = httpContext.cgiGet( "PROMPT_21_"+sGXsfl_58_idx+"Link") ;
            if ( ( nRcdExists_6 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal046( ) ;
            }
            sendRow046( ) ;
            bGXsfl_58_Refreshing = false ;
         }
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount6 = (short)(5) ;
         nRcdExists_6 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart046( ) ;
            while ( RcdFound6 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_586( ) ;
               init_level_properties6( ) ;
               standaloneNotModal046( ) ;
               getByPrimaryKey046( ) ;
               standaloneModal046( ) ;
               addRow046( ) ;
               scanNext046( ) ;
            }
            scanEnd046( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode6 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_586( ) ;
         initAll046( ) ;
         init_level_properties6( ) ;
         standaloneNotModal046( ) ;
         standaloneModal046( ) ;
         nRcdExists_6 = (short)(0) ;
         nIsMod_6 = (short)(0) ;
         nRcdDeleted_6 = (short)(0) ;
         nBlankRcdCount6 = (short)(nBlankRcdUsr6+nBlankRcdCount6) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount6 > 0 )
         {
            addRow046( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtRol_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount6 = (short)(nBlankRcdCount6-1) ;
         }
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridseg_usuariorol_seg_usuario_rolContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridseg_usuariorol_seg_usuario_rol", Gridseg_usuariorol_seg_usuario_rolContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_usuariorol_seg_usuario_rolContainerData", Gridseg_usuariorol_seg_usuario_rolContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_usuariorol_seg_usuario_rolContainerData"+"V", Gridseg_usuariorol_seg_usuario_rolContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridseg_usuariorol_seg_usuario_rolContainerData"+"V"+"\" value='"+Gridseg_usuariorol_seg_usuario_rolContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridseg_usuariorol_seg_usuario_centro( )
   {
      /*  Grid Control  */
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("GridName", "Gridseg_usuariorol_seg_usuario_centro");
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Class", "Grid");
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("CmpContext", "");
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("InMasterPage", "false");
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Value", A3Cent_Codigo);
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Value", A4Cent_Descripcion);
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Value", A13Regi_Descripcion);
      Gridseg_usuariorol_seg_usuario_centroColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddColumnProperties(Gridseg_usuariorol_seg_usuario_centroColumn);
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridseg_usuariorol_seg_usuario_centroContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridseg_usuariorol_seg_usuario_centro_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_69_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount4 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_4 = (short)(1) ;
            scanStart044( ) ;
            while ( RcdFound4 != 0 )
            {
               init_level_properties4( ) ;
               getByPrimaryKey044( ) ;
               addRow044( ) ;
               scanNext044( ) ;
            }
            scanEnd044( ) ;
            nBlankRcdCount4 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal044( ) ;
         standaloneModal044( ) ;
         sMode4 = Gx_mode ;
         while ( nGXsfl_69_idx < nRC_GXsfl_69 )
         {
            bGXsfl_69_Refreshing = true ;
            readRow044( ) ;
            edtCent_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_ID_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
            edtCent_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_CODIGO_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
            edtCent_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_DESCRIPCION_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
            edtRegi_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGI_COD_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
            edtRegi_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGI_DESCRIPCION_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRegi_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Descripcion_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
            imgprompt_21_Link = httpContext.cgiGet( "PROMPT_1_"+sGXsfl_69_idx+"Link") ;
            if ( ( nRcdExists_4 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal044( ) ;
            }
            sendRow044( ) ;
            bGXsfl_69_Refreshing = false ;
         }
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount4 = (short)(5) ;
         nRcdExists_4 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart044( ) ;
            while ( RcdFound4 != 0 )
            {
               sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_694( ) ;
               init_level_properties4( ) ;
               standaloneNotModal044( ) ;
               getByPrimaryKey044( ) ;
               standaloneModal044( ) ;
               addRow044( ) ;
               scanNext044( ) ;
            }
            scanEnd044( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode4 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_694( ) ;
         initAll044( ) ;
         init_level_properties4( ) ;
         standaloneNotModal044( ) ;
         standaloneModal044( ) ;
         nRcdExists_4 = (short)(0) ;
         nIsMod_4 = (short)(0) ;
         nRcdDeleted_4 = (short)(0) ;
         nBlankRcdCount4 = (short)(nBlankRcdUsr4+nBlankRcdCount4) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount4 > 0 )
         {
            addRow044( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount4 = (short)(nBlankRcdCount4-1) ;
         }
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridseg_usuariorol_seg_usuario_centroContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridseg_usuariorol_seg_usuario_centro", Gridseg_usuariorol_seg_usuario_centroContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_usuariorol_seg_usuario_centroContainerData", Gridseg_usuariorol_seg_usuario_centroContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_usuariorol_seg_usuario_centroContainerData"+"V", Gridseg_usuariorol_seg_usuario_centroContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridseg_usuariorol_seg_usuario_centroContainerData"+"V"+"\" value='"+Gridseg_usuariorol_seg_usuario_centroContainer.GridValuesHidden()+"'/>") ;
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
      e11042 ();
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
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
            A219Usua_Email = httpContext.cgiGet( edtUsua_Email_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
            A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
            /* Read saved values. */
            Z23Usua_Id = localUtil.ctol( httpContext.cgiGet( "Z23Usua_Id"), ",", ".") ;
            Z24Usua_Codigo = httpContext.cgiGet( "Z24Usua_Codigo") ;
            Z25Usua_Nombre = httpContext.cgiGet( "Z25Usua_Nombre") ;
            Z219Usua_Email = httpContext.cgiGet( "Z219Usua_Email") ;
            Z26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( "Z26Usua_Cedula"), ",", ".") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_58 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), ",", ".")) ;
            nRC_GXsfl_69 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), ",", ".")) ;
            AV22Usua_Id = localUtil.ctol( httpContext.cgiGet( "vUSUA_ID"), ",", ".") ;
            AV28Integra = httpContext.cgiGet( "vINTEGRA") ;
            AV29Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A402Rol_Tipo = httpContext.cgiGet( "ROL_TIPO") ;
            A2Regi_Id = localUtil.ctol( httpContext.cgiGet( "REGI_ID"), ",", ".") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_USUARIOROL" ;
            A24Usua_Codigo = httpContext.cgiGet( edtUsua_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")) ;
            A25Usua_Nombre = httpContext.cgiGet( edtUsua_Nombre_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A25Usua_Nombre, "")) ;
            A219Usua_Email = httpContext.cgiGet( edtUsua_Email_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A219Usua_Email, "")) ;
            A26Usua_Cedula = localUtil.ctol( httpContext.cgiGet( edtUsua_Cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A23Usua_Id != Z23Usua_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_usuariorol:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
                        confirm_040( ) ;
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
                        e11042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12042 ();
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
         e12042 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll045( ) ;
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
         disableAttributes045( ) ;
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

   public void confirm_040( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls045( ) ;
         }
         else
         {
            checkExtendedTable045( ) ;
            closeExtendedTableCursors045( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode5 = Gx_mode ;
         confirm_046( ) ;
         if ( AnyError == 0 )
         {
            confirm_044( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode5 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_044( )
   {
      nGXsfl_69_idx = (short)(0) ;
      while ( nGXsfl_69_idx < nRC_GXsfl_69 )
      {
         readRow044( ) ;
         if ( ( nRcdExists_4 != 0 ) || ( nIsMod_4 != 0 ) )
         {
            getKey044( ) ;
            if ( ( nRcdExists_4 == 0 ) && ( nRcdDeleted_4 == 0 ) )
            {
               if ( RcdFound4 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate044( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable044( ) ;
                     closeExtendedTableCursors044( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCent_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound4 != 0 )
               {
                  if ( nRcdDeleted_4 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey044( ) ;
                     load044( ) ;
                     beforeValidate044( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls044( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_4 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate044( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable044( ) ;
                           closeExtendedTableCursors044( ) ;
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
                  if ( nRcdDeleted_4 == 0 )
                  {
                     GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCent_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCent_Codigo_Internalname, A3Cent_Codigo) ;
         httpContext.changePostValue( edtCent_Descripcion_Internalname, A4Cent_Descripcion) ;
         httpContext.changePostValue( edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRegi_Descripcion_Internalname, A13Regi_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z1Cent_Id_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_4, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_4, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_4, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_4 != 0 )
         {
            httpContext.changePostValue( "CENT_ID_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CENT_CODIGO_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CENT_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGI_COD_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGI_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_046( )
   {
      nGXsfl_58_idx = (short)(0) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow046( ) ;
         if ( ( nRcdExists_6 != 0 ) || ( nIsMod_6 != 0 ) )
         {
            getKey046( ) ;
            if ( ( nRcdExists_6 == 0 ) && ( nRcdDeleted_6 == 0 ) )
            {
               if ( RcdFound6 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate046( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable046( ) ;
                     closeExtendedTableCursors046( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRol_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound6 != 0 )
               {
                  if ( nRcdDeleted_6 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey046( ) ;
                     load046( ) ;
                     beforeValidate046( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls046( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_6 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate046( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable046( ) ;
                           closeExtendedTableCursors046( ) ;
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
                  if ( nRcdDeleted_6 == 0 )
                  {
                     GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRol_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRol_Descripcion_Internalname, A22Rol_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z21Rol_Id_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z21Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_6, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_6, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_6, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_6 != 0 )
         {
            httpContext.changePostValue( "ROL_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROL_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption040( )
   {
   }

   public void e11042( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV29Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV29Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV16TrnContext.fromxml(AV26WebSession.getValue("TrnContext"), null, null);
      AV25Usuario = AV26WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Usuario", AV25Usuario);
      AV27UsuarioID = GXutil.lval( AV26WebSession.getValue("UsuarioId")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27UsuarioID", GXutil.ltrim( GXutil.str( AV27UsuarioID, 18, 0)));
   }

   public void e12042( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV16TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_usuariorol") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm045( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z24Usua_Codigo = T000410_A24Usua_Codigo[0] ;
            Z25Usua_Nombre = T000410_A25Usua_Nombre[0] ;
            Z219Usua_Email = T000410_A219Usua_Email[0] ;
            Z26Usua_Cedula = T000410_A26Usua_Cedula[0] ;
         }
         else
         {
            Z24Usua_Codigo = A24Usua_Codigo ;
            Z25Usua_Nombre = A25Usua_Nombre ;
            Z219Usua_Email = A219Usua_Email ;
            Z26Usua_Cedula = A26Usua_Cedula ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z23Usua_Id = A23Usua_Id ;
         Z24Usua_Codigo = A24Usua_Codigo ;
         Z25Usua_Nombre = A25Usua_Nombre ;
         Z219Usua_Email = A219Usua_Email ;
         Z26Usua_Cedula = A26Usua_Cedula ;
      }
   }

   public void standaloneNotModal( )
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
      GXv_char1[0] = AV28Integra ;
      new com.orions2.parametrosintegracion(remoteHandle, context).execute( GXv_char1) ;
      seg_usuariorol_impl.this.AV28Integra = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Integra", AV28Integra);
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
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV22Usua_Id) )
      {
         A23Usua_Id = AV22Usua_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
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

   public void load045( )
   {
      /* Using cursor T000411 */
      pr_default.execute(9, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A24Usua_Codigo = T000411_A24Usua_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         A25Usua_Nombre = T000411_A25Usua_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
         A219Usua_Email = T000411_A219Usua_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
         A26Usua_Cedula = T000411_A26Usua_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         zm045( -10) ;
      }
      pr_default.close(9);
      onLoadActions045( ) ;
   }

   public void onLoadActions045( )
   {
      AV29Pgmname = "SEG_USUARIOROL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
   }

   public void checkExtendedTable045( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV29Pgmname = "SEG_USUARIOROL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      /* Using cursor T000412 */
      pr_default.execute(10, new Object[] {A24Usua_Codigo, new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Usuario"}), 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(10);
      /* Using cursor T000413 */
      pr_default.execute(11, new Object[] {new Long(A26Usua_Cedula), new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Cedula del Usuario"}), 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
   }

   public void closeExtendedTableCursors045( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey045( )
   {
      /* Using cursor T000414 */
      pr_default.execute(12, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound5 = (short)(1) ;
      }
      else
      {
         RcdFound5 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000410 */
      pr_default.execute(8, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm045( 10) ;
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000410_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         A24Usua_Codigo = T000410_A24Usua_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
         A25Usua_Nombre = T000410_A25Usua_Nombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
         A219Usua_Email = T000410_A219Usua_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
         A26Usua_Cedula = T000410_A26Usua_Cedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         Z23Usua_Id = A23Usua_Id ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load045( ) ;
         if ( AnyError == 1 )
         {
            RcdFound5 = (short)(0) ;
            initializeNonKey045( ) ;
         }
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound5 = (short)(0) ;
         initializeNonKey045( ) ;
         sMode5 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode5 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey045( ) ;
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
      /* Using cursor T000415 */
      pr_default.execute(13, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T000415_A23Usua_Id[0] < A23Usua_Id ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T000415_A23Usua_Id[0] > A23Usua_Id ) ) )
         {
            A23Usua_Id = T000415_A23Usua_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound5 = (short)(0) ;
      /* Using cursor T000416 */
      pr_default.execute(14, new Object[] {new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T000416_A23Usua_Id[0] > A23Usua_Id ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T000416_A23Usua_Id[0] < A23Usua_Id ) ) )
         {
            A23Usua_Id = T000416_A23Usua_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
            RcdFound5 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey045( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert045( ) ;
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
            }
            else
            {
               /* Update record */
               update045( ) ;
            }
         }
         else
         {
            if ( A23Usua_Id != Z23Usua_Id )
            {
               /* Insert record */
               insert045( ) ;
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
                  insert045( ) ;
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
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency045( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00049 */
         pr_default.execute(7, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z24Usua_Codigo, T00049_A24Usua_Codigo[0]) != 0 ) || ( GXutil.strcmp(Z25Usua_Nombre, T00049_A25Usua_Nombre[0]) != 0 ) || ( GXutil.strcmp(Z219Usua_Email, T00049_A219Usua_Email[0]) != 0 ) || ( Z26Usua_Cedula != T00049_A26Usua_Cedula[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_USUARIO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert045( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable045( ) ;
      }
      if ( AnyError == 0 )
      {
         zm045( 0) ;
         checkOptimisticConcurrency045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm045( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000417 */
                  pr_default.execute(15, new Object[] {A24Usua_Codigo, A25Usua_Nombre, A219Usua_Email, new Long(A26Usua_Cedula)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000418 */
                  pr_default.execute(16);
                  A23Usua_Id = T000418_A23Usua_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
                  pr_default.close(16);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel045( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption040( ) ;
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
            load045( ) ;
         }
         endLevel045( ) ;
      }
      closeExtendedTableCursors045( ) ;
   }

   public void update045( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable045( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm045( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000419 */
                  pr_default.execute(17, new Object[] {A24Usua_Codigo, A25Usua_Nombre, A219Usua_Email, new Long(A26Usua_Cedula), new Long(A23Usua_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO") ;
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate045( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel045( ) ;
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
         endLevel045( ) ;
      }
      closeExtendedTableCursors045( ) ;
   }

   public void deferredUpdate045( )
   {
   }

   public void delete( )
   {
      beforeValidate045( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency045( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls045( ) ;
         afterConfirm045( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete045( ) ;
            if ( AnyError == 0 )
            {
               scanStart046( ) ;
               while ( RcdFound6 != 0 )
               {
                  getByPrimaryKey046( ) ;
                  delete046( ) ;
                  scanNext046( ) ;
               }
               scanEnd046( ) ;
               scanStart044( ) ;
               while ( RcdFound4 != 0 )
               {
                  getByPrimaryKey044( ) ;
                  delete044( ) ;
                  scanNext044( ) ;
               }
               scanEnd044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000420 */
                  pr_default.execute(18, new Object[] {new Long(A23Usua_Id)});
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
      }
      sMode5 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel045( ) ;
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls045( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV29Pgmname = "SEG_USUARIOROL" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000421 */
         pr_default.execute(19, new Object[] {new Long(A23Usua_Id)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel046( )
   {
      nGXsfl_58_idx = (short)(0) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow046( ) ;
         if ( ( nRcdExists_6 != 0 ) || ( nIsMod_6 != 0 ) )
         {
            standaloneNotModal046( ) ;
            getKey046( ) ;
            if ( ( nRcdExists_6 == 0 ) && ( nRcdDeleted_6 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert046( ) ;
            }
            else
            {
               if ( RcdFound6 != 0 )
               {
                  if ( ( nRcdDeleted_6 != 0 ) && ( nRcdExists_6 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete046( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_6 != 0 ) && ( nRcdExists_6 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update046( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_6 == 0 )
                  {
                     GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRol_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRol_Descripcion_Internalname, A22Rol_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z21Rol_Id_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z21Rol_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_6, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_6, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_6_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_6, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_6 != 0 )
         {
            httpContext.changePostValue( "ROL_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROL_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll046( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_6 = (short)(0) ;
      nIsMod_6 = (short)(0) ;
      nRcdDeleted_6 = (short)(0) ;
   }

   public void processNestedLevel044( )
   {
      nGXsfl_69_idx = (short)(0) ;
      while ( nGXsfl_69_idx < nRC_GXsfl_69 )
      {
         readRow044( ) ;
         if ( ( nRcdExists_4 != 0 ) || ( nIsMod_4 != 0 ) )
         {
            standaloneNotModal044( ) ;
            getKey044( ) ;
            if ( ( nRcdExists_4 == 0 ) && ( nRcdDeleted_4 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert044( ) ;
            }
            else
            {
               if ( RcdFound4 != 0 )
               {
                  if ( ( nRcdDeleted_4 != 0 ) && ( nRcdExists_4 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete044( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_4 != 0 ) && ( nRcdExists_4 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update044( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_4 == 0 )
                  {
                     GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCent_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtCent_Codigo_Internalname, A3Cent_Codigo) ;
         httpContext.changePostValue( edtCent_Descripcion_Internalname, A4Cent_Descripcion) ;
         httpContext.changePostValue( edtRegi_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtRegi_Descripcion_Internalname, A13Regi_Descripcion) ;
         httpContext.changePostValue( "ZT_"+"Z1Cent_Id_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_4, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_4, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_4_"+sGXsfl_69_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_4, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_4 != 0 )
         {
            httpContext.changePostValue( "CENT_ID_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CENT_CODIGO_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CENT_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGI_COD_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGI_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll044( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_4 = (short)(0) ;
      nIsMod_4 = (short)(0) ;
      nRcdDeleted_4 = (short)(0) ;
   }

   public void processLevel045( )
   {
      /* Save parent mode. */
      sMode5 = Gx_mode ;
      processNestedLevel046( ) ;
      processNestedLevel044( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode5 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel045( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete045( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_usuariorol");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         if ( GXutil.strcmp(AV28Integra, "SI") == 0 )
         {
            GXv_int2[0] = A23Usua_Id ;
            GXv_char1[0] = "INS" ;
            new com.orions2.wscreausuario(remoteHandle, context).execute( GXv_int2, GXv_char1) ;
            seg_usuariorol_impl.this.A23Usua_Id = GXv_int2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_usuariorol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart045( )
   {
      /* Scan By routine */
      /* Using cursor T000422 */
      pr_default.execute(20);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000422_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext045( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound5 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound5 = (short)(1) ;
         A23Usua_Id = T000422_A23Usua_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
   }

   public void scanEnd045( )
   {
      pr_default.close(20);
   }

   public void afterConfirm045( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert045( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate045( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete045( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete045( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate045( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes045( )
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
   }

   public void zm046( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -13 )
      {
         Z23Usua_Id = A23Usua_Id ;
         Z21Rol_Id = A21Rol_Id ;
         Z22Rol_Descripcion = A22Rol_Descripcion ;
         Z402Rol_Tipo = A402Rol_Tipo ;
      }
   }

   public void standaloneNotModal046( )
   {
   }

   public void standaloneModal046( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRol_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      }
      else
      {
         edtRol_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      }
   }

   public void load046( )
   {
      /* Using cursor T000423 */
      pr_default.execute(21, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A22Rol_Descripcion = T000423_A22Rol_Descripcion[0] ;
         A402Rol_Tipo = T000423_A402Rol_Tipo[0] ;
         zm046( -13) ;
      }
      pr_default.close(21);
      onLoadActions046( ) ;
   }

   public void onLoadActions046( )
   {
   }

   public void checkExtendedTable046( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal046( ) ;
      /* Using cursor T00048 */
      pr_default.execute(6, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A22Rol_Descripcion = T00048_A22Rol_Descripcion[0] ;
      A402Rol_Tipo = T00048_A402Rol_Tipo[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursors046( )
   {
      pr_default.close(6);
   }

   public void enableDisable046( )
   {
   }

   public void gxload_14( long A21Rol_Id )
   {
      /* Using cursor T000424 */
      pr_default.execute(22, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A22Rol_Descripcion = T000424_A22Rol_Descripcion[0] ;
      A402Rol_Tipo = T000424_A402Rol_Tipo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A22Rol_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A402Rol_Tipo))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(22);
   }

   public void getKey046( )
   {
      /* Using cursor T000425 */
      pr_default.execute(23, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey046( )
   {
      /* Using cursor T00047 */
      pr_default.execute(5, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm046( 13) ;
         RcdFound6 = (short)(1) ;
         initializeNonKey046( ) ;
         A21Rol_Id = T00047_A21Rol_Id[0] ;
         Z23Usua_Id = A23Usua_Id ;
         Z21Rol_Id = A21Rol_Id ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load046( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey046( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal046( ) ;
         Gx_mode = sMode6 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes046( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrency046( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00046 */
         pr_default.execute(4, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO_ROL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_USUARIO_ROL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert046( )
   {
      beforeValidate046( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable046( ) ;
      }
      if ( AnyError == 0 )
      {
         zm046( 0) ;
         checkOptimisticConcurrency046( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm046( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert046( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000426 */
                  pr_default.execute(24, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_ROL") ;
                  if ( (pr_default.getStatus(24) == 1) )
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
            load046( ) ;
         }
         endLevel046( ) ;
      }
      closeExtendedTableCursors046( ) ;
   }

   public void update046( )
   {
      beforeValidate046( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable046( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency046( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm046( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate046( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table SEG_USUARIO_ROL */
                  deferredUpdate046( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey046( ) ;
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
         endLevel046( ) ;
      }
      closeExtendedTableCursors046( ) ;
   }

   public void deferredUpdate046( )
   {
   }

   public void delete046( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate046( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency046( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls046( ) ;
         afterConfirm046( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete046( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000427 */
               pr_default.execute(25, new Object[] {new Long(A23Usua_Id), new Long(A21Rol_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_ROL") ;
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel046( ) ;
      Gx_mode = sMode6 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls046( )
   {
      standaloneModal046( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000428 */
         pr_default.execute(26, new Object[] {new Long(A21Rol_Id)});
         A22Rol_Descripcion = T000428_A22Rol_Descripcion[0] ;
         A402Rol_Tipo = T000428_A402Rol_Tipo[0] ;
         pr_default.close(26);
      }
   }

   public void endLevel046( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart046( )
   {
      /* Scan By routine */
      /* Using cursor T000429 */
      pr_default.execute(27, new Object[] {new Long(A23Usua_Id)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A21Rol_Id = T000429_A21Rol_Id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext046( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A21Rol_Id = T000429_A21Rol_Id[0] ;
      }
   }

   public void scanEnd046( )
   {
      pr_default.close(27);
   }

   public void afterConfirm046( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert046( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate046( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete046( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete046( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate046( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes046( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -15 )
      {
         Z23Usua_Id = A23Usua_Id ;
         Z1Cent_Id = A1Cent_Id ;
         Z2Regi_Id = A2Regi_Id ;
         Z3Cent_Codigo = A3Cent_Codigo ;
         Z4Cent_Descripcion = A4Cent_Descripcion ;
         Z12Regi_Cod = A12Regi_Cod ;
         Z13Regi_Descripcion = A13Regi_Descripcion ;
      }
   }

   public void standaloneNotModal044( )
   {
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
   }

   public void standaloneModal044( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      }
      else
      {
         edtCent_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      }
   }

   public void load044( )
   {
      /* Using cursor T000430 */
      pr_default.execute(28, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A2Regi_Id = T000430_A2Regi_Id[0] ;
         A3Cent_Codigo = T000430_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = T000430_A4Cent_Descripcion[0] ;
         A12Regi_Cod = T000430_A12Regi_Cod[0] ;
         A13Regi_Descripcion = T000430_A13Regi_Descripcion[0] ;
         zm044( -15) ;
      }
      pr_default.close(28);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal044( ) ;
      /* Using cursor T00044 */
      pr_default.execute(2, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2Regi_Id = T00044_A2Regi_Id[0] ;
      A3Cent_Codigo = T00044_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T00044_A4Cent_Descripcion[0] ;
      pr_default.close(2);
      /* Using cursor T00045 */
      pr_default.execute(3, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T00045_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T00045_A13Regi_Descripcion[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors044( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable044( )
   {
   }

   public void gxload_16( long A1Cent_Id )
   {
      /* Using cursor T000431 */
      pr_default.execute(29, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2Regi_Id = T000431_A2Regi_Id[0] ;
      A3Cent_Codigo = T000431_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000431_A4Cent_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A3Cent_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A4Cent_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(29);
   }

   public void gxload_17( long A2Regi_Id )
   {
      /* Using cursor T000432 */
      pr_default.execute(30, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000432_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T000432_A13Regi_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A13Regi_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(30);
   }

   public void getKey044( )
   {
      /* Using cursor T000433 */
      pr_default.execute(31, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey044( )
   {
      /* Using cursor T00043 */
      pr_default.execute(1, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm044( 15) ;
         RcdFound4 = (short)(1) ;
         initializeNonKey044( ) ;
         A1Cent_Id = T00043_A1Cent_Id[0] ;
         Z23Usua_Id = A23Usua_Id ;
         Z1Cent_Id = A1Cent_Id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load044( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal044( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes044( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00042 */
         pr_default.execute(0, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_USUARIO_CENTRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_USUARIO_CENTRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000434 */
                  pr_default.execute(32, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_CENTRO") ;
                  if ( (pr_default.getStatus(32) == 1) )
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
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table SEG_USUARIO_CENTRO */
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey044( ) ;
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
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete044( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000435 */
               pr_default.execute(33, new Object[] {new Long(A23Usua_Id), new Long(A1Cent_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_USUARIO_CENTRO") ;
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
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel044( ) ;
      Gx_mode = sMode4 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls044( )
   {
      standaloneModal044( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000436 */
         pr_default.execute(34, new Object[] {new Long(A1Cent_Id)});
         A2Regi_Id = T000436_A2Regi_Id[0] ;
         A3Cent_Codigo = T000436_A3Cent_Codigo[0] ;
         A4Cent_Descripcion = T000436_A4Cent_Descripcion[0] ;
         pr_default.close(34);
         /* Using cursor T000437 */
         pr_default.execute(35, new Object[] {new Long(A2Regi_Id)});
         A12Regi_Cod = T000437_A12Regi_Cod[0] ;
         A13Regi_Descripcion = T000437_A13Regi_Descripcion[0] ;
         pr_default.close(35);
      }
   }

   public void endLevel044( )
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

   public void scanStart044( )
   {
      /* Scan By routine */
      /* Using cursor T000438 */
      pr_default.execute(36, new Object[] {new Long(A23Usua_Id)});
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A1Cent_Id = T000438_A1Cent_Id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A1Cent_Id = T000438_A1Cent_Id[0] ;
      }
   }

   public void scanEnd044( )
   {
      pr_default.close(36);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      edtRegi_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      edtRegi_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Descripcion_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
   }

   public void subsflControlProps_586( )
   {
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_58_idx ;
      imgprompt_21_Internalname = "PROMPT_21_"+sGXsfl_58_idx ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_586( )
   {
      edtRol_Id_Internalname = "ROL_ID_"+sGXsfl_58_fel_idx ;
      imgprompt_21_Internalname = "PROMPT_21_"+sGXsfl_58_fel_idx ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION_"+sGXsfl_58_fel_idx ;
   }

   public void addRow046( )
   {
      nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_586( ) ;
      sendRow046( ) ;
   }

   public void sendRow046( )
   {
      Gridseg_usuariorol_seg_usuario_rolRow = GXWebRow.GetNew(context) ;
      if ( subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_rol_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_rol_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_rol_Linesclass = subGridseg_usuariorol_seg_usuario_rol_Class+"Odd" ;
         }
      }
      else if ( subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_rol_Backstyle = (byte)(0) ;
         subGridseg_usuariorol_seg_usuario_rol_Backcolor = subGridseg_usuariorol_seg_usuario_rol_Allbackcolor ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_rol_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_rol_Linesclass = subGridseg_usuariorol_seg_usuario_rol_Class+"Uniform" ;
         }
      }
      else if ( subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_rol_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_rol_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_rol_Linesclass = subGridseg_usuariorol_seg_usuario_rol_Class+"Odd" ;
         }
         subGridseg_usuariorol_seg_usuario_rol_Backcolor = (int)(0x0) ;
      }
      else if ( subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_rol_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGridseg_usuariorol_seg_usuario_rol_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_rol_Class, "") != 0 )
            {
               subGridseg_usuariorol_seg_usuario_rol_Linesclass = subGridseg_usuariorol_seg_usuario_rol_Class+"Even" ;
            }
         }
         else
         {
            subGridseg_usuariorol_seg_usuario_rol_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_rol_Class, "") != 0 )
            {
               subGridseg_usuariorol_seg_usuario_rol_Linesclass = subGridseg_usuariorol_seg_usuario_rol_Class+"Odd" ;
            }
         }
      }
      imgprompt_21_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00r0"+"',["+"{Ctrl:gx.dom.el('"+"ROL_ID_"+sGXsfl_58_idx+"'), id:'"+"ROL_ID_"+sGXsfl_58_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_6_"+sGXsfl_58_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx0061"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(23,2),t(',',7),t(18,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ROL_ID_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"ROL_ID_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_6_"',3),t(+,5),t(sGXsfl_58_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_23,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_6_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_rolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRol_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtRol_Id_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(58),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridseg_usuariorol_seg_usuario_rolRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_21_Internalname,sImgUrl,imgprompt_21_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_21_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_rolRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRol_Descripcion_Internalname,A22Rol_Descripcion,GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRol_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtRol_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(58),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridseg_usuariorol_seg_usuario_rolRow);
      GXCCtl = "Z21Rol_Id_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z21Rol_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_6_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_6, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_6_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_6, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_6_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_6, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_58_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vUSUA_ID_" + sGXsfl_58_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV22Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_ID_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_DESCRIPCION_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRol_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_21_"+sGXsfl_58_idx+"Link", GXutil.rtrim( imgprompt_21_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridseg_usuariorol_seg_usuario_rolContainer.AddRow(Gridseg_usuariorol_seg_usuario_rolRow);
   }

   public void readRow046( )
   {
      nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_586( ) ;
      edtRol_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROL_ID_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
      edtRol_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROL_DESCRIPCION_"+sGXsfl_58_idx+"Enabled"), ",", ".")) ;
      imgprompt_21_Link = httpContext.cgiGet( "PROMPT_21_"+sGXsfl_58_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "ROL_ID_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
         wbErr = true ;
         A21Rol_Id = 0 ;
      }
      else
      {
         A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
      }
      A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
      GXCCtl = "Z21Rol_Id_" + sGXsfl_58_idx ;
      Z21Rol_Id = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "nRcdDeleted_6_" + sGXsfl_58_idx ;
      nRcdDeleted_6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_6_" + sGXsfl_58_idx ;
      nRcdExists_6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_6_" + sGXsfl_58_idx ;
      nIsMod_6 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void subsflControlProps_694( )
   {
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_69_idx ;
      imgprompt_1_Internalname = "PROMPT_1_"+sGXsfl_69_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_69_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_69_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_69_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_694( )
   {
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_69_fel_idx ;
      imgprompt_1_Internalname = "PROMPT_1_"+sGXsfl_69_fel_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_69_fel_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_69_fel_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_69_fel_idx ;
   }

   public void addRow044( )
   {
      nGXsfl_69_idx = (short)(nGXsfl_69_idx+1) ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_694( ) ;
      sendRow044( ) ;
   }

   public void sendRow044( )
   {
      Gridseg_usuariorol_seg_usuario_centroRow = GXWebRow.GetNew(context) ;
      if ( subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_centro_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_centro_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_centro_Linesclass = subGridseg_usuariorol_seg_usuario_centro_Class+"Odd" ;
         }
      }
      else if ( subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_centro_Backstyle = (byte)(0) ;
         subGridseg_usuariorol_seg_usuario_centro_Backcolor = subGridseg_usuariorol_seg_usuario_centro_Allbackcolor ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_centro_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_centro_Linesclass = subGridseg_usuariorol_seg_usuario_centro_Class+"Uniform" ;
         }
      }
      else if ( subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_centro_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_centro_Class, "") != 0 )
         {
            subGridseg_usuariorol_seg_usuario_centro_Linesclass = subGridseg_usuariorol_seg_usuario_centro_Class+"Odd" ;
         }
         subGridseg_usuariorol_seg_usuario_centro_Backcolor = (int)(0x0) ;
      }
      else if ( subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridseg_usuariorol_seg_usuario_centro_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
         {
            subGridseg_usuariorol_seg_usuario_centro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_centro_Class, "") != 0 )
            {
               subGridseg_usuariorol_seg_usuario_centro_Linesclass = subGridseg_usuariorol_seg_usuario_centro_Class+"Even" ;
            }
         }
         else
         {
            subGridseg_usuariorol_seg_usuario_centro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_usuariorol_seg_usuario_centro_Class, "") != 0 )
            {
               subGridseg_usuariorol_seg_usuario_centro_Linesclass = subGridseg_usuariorol_seg_usuario_centro_Class+"Odd" ;
            }
         }
      }
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID_"+sGXsfl_69_idx+"'), id:'"+"CENT_ID_"+sGXsfl_69_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_4_"+sGXsfl_69_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx0041"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(23,2),t(',',7),t(18,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"CENT_ID_"',3),t(+,5),t(sGXsfl_69_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"CENT_ID_"',3),t(+,5),t(sGXsfl_69_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_4_"',3),t(+,5),t(sGXsfl_69_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_23,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_4_" + sGXsfl_69_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_69_idx + "',69)\"" ;
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCent_Id_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_1_Internalname,sImgUrl,imgprompt_1_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_1_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Codigo_Internalname,A3Cent_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCent_Codigo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion_Internalname,A4Cent_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtCent_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")),((edtRegi_Cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtRegi_Cod_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_usuariorol_seg_usuario_centroRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Descripcion_Internalname,A13Regi_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtRegi_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridseg_usuariorol_seg_usuario_centroRow);
      GXCCtl = "Z1Cent_Id_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_4_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_4, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_4_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_4, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_4_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_4, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_69_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV16TrnContext);
      }
      GXCCtl = "vUSUA_ID_" + sGXsfl_69_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV22Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCent_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_COD_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCION_"+sGXsfl_69_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegi_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_1_"+sGXsfl_69_idx+"Link", GXutil.rtrim( imgprompt_1_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridseg_usuariorol_seg_usuario_centroContainer.AddRow(Gridseg_usuariorol_seg_usuario_centroRow);
   }

   public void readRow044( )
   {
      nGXsfl_69_idx = (short)(nGXsfl_69_idx+1) ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_694( ) ;
      edtCent_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_ID_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
      edtCent_Codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_CODIGO_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
      edtCent_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CENT_DESCRIPCION_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
      edtRegi_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGI_COD_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
      edtRegi_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGI_DESCRIPCION_"+sGXsfl_69_idx+"Enabled"), ",", ".")) ;
      imgprompt_21_Link = httpContext.cgiGet( "PROMPT_1_"+sGXsfl_69_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "CENT_ID_" + sGXsfl_69_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         wbErr = true ;
         A1Cent_Id = 0 ;
      }
      else
      {
         A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
      }
      A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
      A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
      A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
      A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
      GXCCtl = "Z1Cent_Id_" + sGXsfl_69_idx ;
      Z1Cent_Id = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "nRcdDeleted_4_" + sGXsfl_69_idx ;
      nRcdDeleted_4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_4_" + sGXsfl_69_idx ;
      nRcdExists_4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_4_" + sGXsfl_69_idx ;
      nIsMod_4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtRegi_Cod_Enabled = edtRegi_Cod_Enabled ;
      defedtCent_Id_Enabled = edtCent_Id_Enabled ;
      defedtRol_Id_Enabled = edtRol_Id_Enabled ;
   }

   public void confirmValues040( )
   {
      nGXsfl_58_idx = (short)(0) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_586( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_586( ) ;
         httpContext.changePostValue( "Z21Rol_Id_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z21Rol_Id_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z21Rol_Id_"+sGXsfl_58_idx) ;
      }
      nGXsfl_69_idx = (short)(0) ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_694( ) ;
      while ( nGXsfl_69_idx < nRC_GXsfl_69 )
      {
         nGXsfl_69_idx = (short)(nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_694( ) ;
         httpContext.changePostValue( "Z1Cent_Id_"+sGXsfl_69_idx, httpContext.cgiGet( "ZT_"+"Z1Cent_Id_"+sGXsfl_69_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1Cent_Id_"+sGXsfl_69_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414114758");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_usuariorol") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22Usua_Id,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z24Usua_Codigo", Z24Usua_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z25Usua_Nombre", Z25Usua_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z219Usua_Email", Z219Usua_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z26Usua_Cedula", GXutil.ltrim( localUtil.ntoc( Z26Usua_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nGXsfl_58_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nGXsfl_69_idx, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV16TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV16TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV22Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINTEGRA", GXutil.rtrim( AV28Integra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV29Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROL_TIPO", GXutil.rtrim( A402Rol_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUA_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22Usua_Id), "ZZZZZZZZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_USUARIOROL" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A25Usua_Nombre, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A219Usua_Email, "")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9") ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_usuariorol:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_usuariorol") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV22Usua_Id,18,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_USUARIOROL" ;
   }

   public String getPgmdesc( )
   {
      return "Usuario y Roles" ;
   }

   public void initializeNonKey045( )
   {
      A24Usua_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A24Usua_Codigo", A24Usua_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A24Usua_Codigo, "@!"))));
      A25Usua_Nombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A25Usua_Nombre", A25Usua_Nombre);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A25Usua_Nombre, ""))));
      A219Usua_Email = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A219Usua_Email", A219Usua_Email);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A219Usua_Email, ""))));
      A26Usua_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A26Usua_Cedula", GXutil.ltrim( GXutil.str( A26Usua_Cedula, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_USUA_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A26Usua_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      Z24Usua_Codigo = "" ;
      Z25Usua_Nombre = "" ;
      Z219Usua_Email = "" ;
      Z26Usua_Cedula = 0 ;
   }

   public void initAll045( )
   {
      A23Usua_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      initializeNonKey045( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey046( )
   {
      A22Rol_Descripcion = "" ;
      A402Rol_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A402Rol_Tipo", A402Rol_Tipo);
   }

   public void initAll046( )
   {
      A21Rol_Id = 0 ;
      initializeNonKey046( ) ;
   }

   public void standaloneModalInsert046( )
   {
   }

   public void initializeNonKey044( )
   {
      A2Regi_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2Regi_Id", GXutil.ltrim( GXutil.str( A2Regi_Id, 11, 0)));
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A12Regi_Cod = (short)(0) ;
      A13Regi_Descripcion = "" ;
   }

   public void initAll044( )
   {
      A1Cent_Id = 0 ;
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert044( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414114768");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_usuariorol.js", "?201861414114768");
      /* End function include_jscripts */
   }

   public void init_level_properties6( )
   {
      edtRol_Id_Enabled = defedtRol_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), !bGXsfl_58_Refreshing);
   }

   public void init_level_properties4( )
   {
      edtRegi_Cod_Enabled = defedtRegi_Cod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegi_Cod_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRegi_Cod_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
      edtCent_Id_Enabled = defedtCent_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), !bGXsfl_69_Refreshing);
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
      lblTitleseg_usuario_rol_Internalname = "TITLESEG_USUARIO_ROL" ;
      edtRol_Id_Internalname = "ROL_ID" ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION" ;
      lblTitleseg_usuario_centro_Internalname = "TITLESEG_USUARIO_CENTRO" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      divSeg_usuario_centrotable_Internalname = "SEG_USUARIO_CENTROTABLE" ;
      divSeg_usuario_roltable_Internalname = "SEG_USUARIO_ROLTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_21_Internalname = "PROMPT_21" ;
      imgprompt_1_Internalname = "PROMPT_1" ;
      subGridseg_usuariorol_seg_usuario_rol_Internalname = "GRIDSEG_USUARIOROL_SEG_USUARIO_ROL" ;
      subGridseg_usuariorol_seg_usuario_centro_Internalname = "GRIDSEG_USUARIOROL_SEG_USUARIO_CENTRO" ;
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
      Form.setCaption( "Usuario y Roles" );
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Cod_Jsonclick = "" ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtCent_Id_Jsonclick = "" ;
      subGridseg_usuariorol_seg_usuario_centro_Class = "Grid" ;
      subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle = (byte)(0) ;
      edtRol_Descripcion_Jsonclick = "" ;
      imgprompt_21_Visible = 1 ;
      imgprompt_21_Link = "" ;
      imgprompt_21_Visible = 1 ;
      edtRol_Id_Jsonclick = "" ;
      subGridseg_usuariorol_seg_usuario_rol_Class = "Grid" ;
      subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle = (byte)(0) ;
      subGridseg_usuariorol_seg_usuario_centro_Allowcollapsing = (byte)(0) ;
      subGridseg_usuariorol_seg_usuario_centro_Allowselection = (byte)(0) ;
      edtRegi_Descripcion_Enabled = 0 ;
      edtRegi_Cod_Enabled = 0 ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Enabled = 0 ;
      edtCent_Id_Enabled = 1 ;
      subGridseg_usuariorol_seg_usuario_rol_Allowcollapsing = (byte)(0) ;
      subGridseg_usuariorol_seg_usuario_rol_Allowselection = (byte)(0) ;
      edtRol_Descripcion_Enabled = 0 ;
      edtRol_Id_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtUsua_Cedula_Jsonclick = "" ;
      edtUsua_Cedula_Enabled = 0 ;
      edtUsua_Email_Jsonclick = "" ;
      edtUsua_Email_Enabled = 0 ;
      edtUsua_Nombre_Jsonclick = "" ;
      edtUsua_Nombre_Enabled = 0 ;
      edtUsua_Codigo_Jsonclick = "" ;
      edtUsua_Codigo_Enabled = 0 ;
      edtUsua_Id_Jsonclick = "" ;
      edtUsua_Id_Enabled = 0 ;
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

   public void xc_7_045( )
   {
      GXv_char1[0] = AV28Integra ;
      new com.orions2.parametrosintegracion(remoteHandle, context).execute( GXv_char1) ;
      AV28Integra = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Integra", AV28Integra);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV28Integra))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_8_045( long A23Usua_Id ,
                         String AV28Integra )
   {
      if ( GXutil.strcmp(AV28Integra, "SI") == 0 )
      {
         GXv_int2[0] = A23Usua_Id ;
         GXv_char1[0] = "INS" ;
         new com.orions2.wscreausuario(remoteHandle, context).execute( GXv_int2, GXv_char1) ;
         A23Usua_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A23Usua_Id", GXutil.ltrim( GXutil.str( A23Usua_Id, 18, 0)));
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridseg_usuariorol_seg_usuario_rol_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_586( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal046( ) ;
         standaloneModal046( ) ;
         dynload_actions( ) ;
         sendRow046( ) ;
         nGXsfl_58_idx = (short)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_58_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_586( ) ;
      }
      httpContext.GX_webresponse.addString(Gridseg_usuariorol_seg_usuario_rolContainer.ToJavascriptSource());
      /* End function gxnrGridseg_usuariorol_seg_usuario_rol_newrow */
   }

   public void gxnrgridseg_usuariorol_seg_usuario_centro_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_694( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal044( ) ;
         standaloneModal044( ) ;
         dynload_actions( ) ;
         sendRow044( ) ;
         nGXsfl_69_idx = (short)(nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_694( ) ;
      }
      httpContext.GX_webresponse.addString(Gridseg_usuariorol_seg_usuario_centroContainer.ToJavascriptSource());
      /* End function gxnrGridseg_usuariorol_seg_usuario_centro_newrow */
   }

   public void valid_Usua_codigo( String GX_Parm1 ,
                                  long GX_Parm2 )
   {
      A24Usua_Codigo = GX_Parm1 ;
      A23Usua_Id = GX_Parm2 ;
      /* Using cursor T000439 */
      pr_default.execute(37, new Object[] {A24Usua_Codigo, new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Código del Usuario"}), 1, "USUA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Codigo_Internalname ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Usua_cedula( long GX_Parm1 ,
                                  long GX_Parm2 )
   {
      A26Usua_Cedula = GX_Parm1 ;
      A23Usua_Id = GX_Parm2 ;
      /* Using cursor T000440 */
      pr_default.execute(38, new Object[] {new Long(A26Usua_Cedula), new Long(A23Usua_Id)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {"Cedula del Usuario"}), 1, "USUA_CEDULA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsua_Cedula_Internalname ;
      }
      pr_default.close(38);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Rol_id( long GX_Parm1 ,
                             String GX_Parm2 ,
                             String GX_Parm3 )
   {
      A21Rol_Id = GX_Parm1 ;
      A22Rol_Descripcion = GX_Parm2 ;
      A402Rol_Tipo = GX_Parm3 ;
      /* Using cursor T000428 */
      pr_default.execute(26, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ROL'.", "ForeignKeyNotFound", 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
      }
      A22Rol_Descripcion = T000428_A22Rol_Descripcion[0] ;
      A402Rol_Tipo = T000428_A402Rol_Tipo[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A22Rol_Descripcion = "" ;
         A402Rol_Tipo = "" ;
      }
      isValidOutput.add(A22Rol_Descripcion);
      isValidOutput.add(GXutil.rtrim( A402Rol_Tipo));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Cent_id( long GX_Parm1 ,
                              long GX_Parm2 ,
                              String GX_Parm3 ,
                              String GX_Parm4 ,
                              short GX_Parm5 ,
                              String GX_Parm6 )
   {
      A1Cent_Id = GX_Parm1 ;
      A2Regi_Id = GX_Parm2 ;
      A3Cent_Codigo = GX_Parm3 ;
      A4Cent_Descripcion = GX_Parm4 ;
      A12Regi_Cod = GX_Parm5 ;
      A13Regi_Descripcion = GX_Parm6 ;
      /* Using cursor T000436 */
      pr_default.execute(34, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
      }
      A2Regi_Id = T000436_A2Regi_Id[0] ;
      A3Cent_Codigo = T000436_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000436_A4Cent_Descripcion[0] ;
      pr_default.close(34);
      /* Using cursor T000437 */
      pr_default.execute(35, new Object[] {new Long(A2Regi_Id)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A12Regi_Cod = T000437_A12Regi_Cod[0] ;
      A13Regi_Descripcion = T000437_A13Regi_Descripcion[0] ;
      pr_default.close(35);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A2Regi_Id = 0 ;
         A3Cent_Codigo = "" ;
         A4Cent_Descripcion = "" ;
         A12Regi_Cod = (short)(0) ;
         A13Regi_Descripcion = "" ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A3Cent_Codigo);
      isValidOutput.add(A4Cent_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A13Regi_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV22Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12042',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV16TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(34);
      pr_default.close(35);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z24Usua_Codigo = "" ;
      Z25Usua_Nombre = "" ;
      Z219Usua_Email = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV28Integra = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTitleseg_usuario_rol_Jsonclick = "" ;
      lblTitleseg_usuario_centro_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridseg_usuariorol_seg_usuario_rolContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridseg_usuariorol_seg_usuario_rolColumn = new com.genexus.webpanels.GXWebColumn();
      A22Rol_Descripcion = "" ;
      sMode6 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      Gridseg_usuariorol_seg_usuario_centroContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridseg_usuariorol_seg_usuario_centroColumn = new com.genexus.webpanels.GXWebColumn();
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      sMode4 = "" ;
      AV29Pgmname = "" ;
      A402Rol_Tipo = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode5 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV16TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV26WebSession = httpContext.getWebSession();
      AV25Usuario = "" ;
      T000411_A23Usua_Id = new long[1] ;
      T000411_A24Usua_Codigo = new String[] {""} ;
      T000411_A25Usua_Nombre = new String[] {""} ;
      T000411_A219Usua_Email = new String[] {""} ;
      T000411_A26Usua_Cedula = new long[1] ;
      T000412_A24Usua_Codigo = new String[] {""} ;
      T000413_A26Usua_Cedula = new long[1] ;
      T000414_A23Usua_Id = new long[1] ;
      T000410_A23Usua_Id = new long[1] ;
      T000410_A24Usua_Codigo = new String[] {""} ;
      T000410_A25Usua_Nombre = new String[] {""} ;
      T000410_A219Usua_Email = new String[] {""} ;
      T000410_A26Usua_Cedula = new long[1] ;
      T000415_A23Usua_Id = new long[1] ;
      T000416_A23Usua_Id = new long[1] ;
      T00049_A23Usua_Id = new long[1] ;
      T00049_A24Usua_Codigo = new String[] {""} ;
      T00049_A25Usua_Nombre = new String[] {""} ;
      T00049_A219Usua_Email = new String[] {""} ;
      T00049_A26Usua_Cedula = new long[1] ;
      T000418_A23Usua_Id = new long[1] ;
      T000421_A46Tran_Id = new long[1] ;
      T000422_A23Usua_Id = new long[1] ;
      Z22Rol_Descripcion = "" ;
      Z402Rol_Tipo = "" ;
      T000423_A23Usua_Id = new long[1] ;
      T000423_A22Rol_Descripcion = new String[] {""} ;
      T000423_A402Rol_Tipo = new String[] {""} ;
      T000423_A21Rol_Id = new long[1] ;
      T00048_A22Rol_Descripcion = new String[] {""} ;
      T00048_A402Rol_Tipo = new String[] {""} ;
      T000424_A22Rol_Descripcion = new String[] {""} ;
      T000424_A402Rol_Tipo = new String[] {""} ;
      T000425_A23Usua_Id = new long[1] ;
      T000425_A21Rol_Id = new long[1] ;
      T00047_A23Usua_Id = new long[1] ;
      T00047_A21Rol_Id = new long[1] ;
      T00046_A23Usua_Id = new long[1] ;
      T00046_A21Rol_Id = new long[1] ;
      T000428_A22Rol_Descripcion = new String[] {""} ;
      T000428_A402Rol_Tipo = new String[] {""} ;
      T000429_A23Usua_Id = new long[1] ;
      T000429_A21Rol_Id = new long[1] ;
      Z3Cent_Codigo = "" ;
      Z4Cent_Descripcion = "" ;
      Z13Regi_Descripcion = "" ;
      T000430_A2Regi_Id = new long[1] ;
      T000430_A23Usua_Id = new long[1] ;
      T000430_A3Cent_Codigo = new String[] {""} ;
      T000430_A4Cent_Descripcion = new String[] {""} ;
      T000430_A12Regi_Cod = new short[1] ;
      T000430_A13Regi_Descripcion = new String[] {""} ;
      T000430_A1Cent_Id = new long[1] ;
      T00044_A2Regi_Id = new long[1] ;
      T00044_A3Cent_Codigo = new String[] {""} ;
      T00044_A4Cent_Descripcion = new String[] {""} ;
      T00045_A12Regi_Cod = new short[1] ;
      T00045_A13Regi_Descripcion = new String[] {""} ;
      T000431_A2Regi_Id = new long[1] ;
      T000431_A3Cent_Codigo = new String[] {""} ;
      T000431_A4Cent_Descripcion = new String[] {""} ;
      T000432_A12Regi_Cod = new short[1] ;
      T000432_A13Regi_Descripcion = new String[] {""} ;
      T000433_A23Usua_Id = new long[1] ;
      T000433_A1Cent_Id = new long[1] ;
      T00043_A23Usua_Id = new long[1] ;
      T00043_A1Cent_Id = new long[1] ;
      T00042_A23Usua_Id = new long[1] ;
      T00042_A1Cent_Id = new long[1] ;
      T000436_A2Regi_Id = new long[1] ;
      T000436_A3Cent_Codigo = new String[] {""} ;
      T000436_A4Cent_Descripcion = new String[] {""} ;
      T000437_A12Regi_Cod = new short[1] ;
      T000437_A13Regi_Descripcion = new String[] {""} ;
      T000438_A23Usua_Id = new long[1] ;
      T000438_A1Cent_Id = new long[1] ;
      Gridseg_usuariorol_seg_usuario_rolRow = new com.genexus.webpanels.GXWebRow();
      subGridseg_usuariorol_seg_usuario_rol_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      Gridseg_usuariorol_seg_usuario_centroRow = new com.genexus.webpanels.GXWebRow();
      subGridseg_usuariorol_seg_usuario_centro_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int2 = new long [1] ;
      GXv_char1 = new String [1] ;
      T000439_A24Usua_Codigo = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000440_A26Usua_Cedula = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_usuariorol__default(),
         new Object[] {
             new Object[] {
            T00042_A23Usua_Id, T00042_A1Cent_Id
            }
            , new Object[] {
            T00043_A23Usua_Id, T00043_A1Cent_Id
            }
            , new Object[] {
            T00044_A2Regi_Id, T00044_A3Cent_Codigo, T00044_A4Cent_Descripcion
            }
            , new Object[] {
            T00045_A12Regi_Cod, T00045_A13Regi_Descripcion
            }
            , new Object[] {
            T00046_A23Usua_Id, T00046_A21Rol_Id
            }
            , new Object[] {
            T00047_A23Usua_Id, T00047_A21Rol_Id
            }
            , new Object[] {
            T00048_A22Rol_Descripcion, T00048_A402Rol_Tipo
            }
            , new Object[] {
            T00049_A23Usua_Id, T00049_A24Usua_Codigo, T00049_A25Usua_Nombre, T00049_A219Usua_Email, T00049_A26Usua_Cedula
            }
            , new Object[] {
            T000410_A23Usua_Id, T000410_A24Usua_Codigo, T000410_A25Usua_Nombre, T000410_A219Usua_Email, T000410_A26Usua_Cedula
            }
            , new Object[] {
            T000411_A23Usua_Id, T000411_A24Usua_Codigo, T000411_A25Usua_Nombre, T000411_A219Usua_Email, T000411_A26Usua_Cedula
            }
            , new Object[] {
            T000412_A24Usua_Codigo
            }
            , new Object[] {
            T000413_A26Usua_Cedula
            }
            , new Object[] {
            T000414_A23Usua_Id
            }
            , new Object[] {
            T000415_A23Usua_Id
            }
            , new Object[] {
            T000416_A23Usua_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000418_A23Usua_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000421_A46Tran_Id
            }
            , new Object[] {
            T000422_A23Usua_Id
            }
            , new Object[] {
            T000423_A23Usua_Id, T000423_A22Rol_Descripcion, T000423_A402Rol_Tipo, T000423_A21Rol_Id
            }
            , new Object[] {
            T000424_A22Rol_Descripcion, T000424_A402Rol_Tipo
            }
            , new Object[] {
            T000425_A23Usua_Id, T000425_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000428_A22Rol_Descripcion, T000428_A402Rol_Tipo
            }
            , new Object[] {
            T000429_A23Usua_Id, T000429_A21Rol_Id
            }
            , new Object[] {
            T000430_A2Regi_Id, T000430_A23Usua_Id, T000430_A3Cent_Codigo, T000430_A4Cent_Descripcion, T000430_A12Regi_Cod, T000430_A13Regi_Descripcion, T000430_A1Cent_Id
            }
            , new Object[] {
            T000431_A2Regi_Id, T000431_A3Cent_Codigo, T000431_A4Cent_Descripcion
            }
            , new Object[] {
            T000432_A12Regi_Cod, T000432_A13Regi_Descripcion
            }
            , new Object[] {
            T000433_A23Usua_Id, T000433_A1Cent_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000436_A2Regi_Id, T000436_A3Cent_Codigo, T000436_A4Cent_Descripcion
            }
            , new Object[] {
            T000437_A12Regi_Cod, T000437_A13Regi_Descripcion
            }
            , new Object[] {
            T000438_A23Usua_Id, T000438_A1Cent_Id
            }
            , new Object[] {
            T000439_A24Usua_Codigo
            }
            , new Object[] {
            T000440_A26Usua_Cedula
            }
         }
      );
      AV29Pgmname = "SEG_USUARIOROL" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Backcolorstyle ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Allowselection ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Allowhovering ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Allowcollapsing ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Collapsed ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Backcolorstyle ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Allowselection ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Allowhovering ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Allowcollapsing ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridseg_usuariorol_seg_usuario_rol_Backstyle ;
   private byte subGridseg_usuariorol_seg_usuario_centro_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_6 ;
   private short nIsMod_4 ;
   private short nRC_GXsfl_58 ;
   private short nGXsfl_58_idx=1 ;
   private short nRC_GXsfl_69 ;
   private short nGXsfl_69_idx=1 ;
   private short nRcdDeleted_6 ;
   private short nRcdExists_6 ;
   private short nRcdDeleted_4 ;
   private short nRcdExists_4 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount6 ;
   private short RcdFound6 ;
   private short nBlankRcdUsr6 ;
   private short A12Regi_Cod ;
   private short nBlankRcdCount4 ;
   private short RcdFound4 ;
   private short nBlankRcdUsr4 ;
   private short RcdFound5 ;
   private short Z12Regi_Cod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtUsua_Id_Enabled ;
   private int edtUsua_Codigo_Enabled ;
   private int edtUsua_Nombre_Enabled ;
   private int edtUsua_Email_Enabled ;
   private int edtUsua_Cedula_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtRol_Id_Enabled ;
   private int edtRol_Descripcion_Enabled ;
   private int subGridseg_usuariorol_seg_usuario_rol_Selectioncolor ;
   private int subGridseg_usuariorol_seg_usuario_rol_Hoveringcolor ;
   private int fRowAdded ;
   private int edtCent_Id_Enabled ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtRegi_Cod_Enabled ;
   private int edtRegi_Descripcion_Enabled ;
   private int subGridseg_usuariorol_seg_usuario_centro_Selectioncolor ;
   private int subGridseg_usuariorol_seg_usuario_centro_Hoveringcolor ;
   private int GX_JID ;
   private int subGridseg_usuariorol_seg_usuario_rol_Backcolor ;
   private int subGridseg_usuariorol_seg_usuario_rol_Allbackcolor ;
   private int imgprompt_21_Visible ;
   private int subGridseg_usuariorol_seg_usuario_centro_Backcolor ;
   private int subGridseg_usuariorol_seg_usuario_centro_Allbackcolor ;
   private int imgprompt_1_Visible ;
   private int defedtRegi_Cod_Enabled ;
   private int defedtCent_Id_Enabled ;
   private int defedtRol_Id_Enabled ;
   private int idxLst ;
   private long wcpOAV22Usua_Id ;
   private long Z23Usua_Id ;
   private long Z26Usua_Cedula ;
   private long Z21Rol_Id ;
   private long Z1Cent_Id ;
   private long A23Usua_Id ;
   private long A21Rol_Id ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long AV22Usua_Id ;
   private long A26Usua_Cedula ;
   private long GRIDSEG_USUARIOROL_SEG_USUARIO_ROL_nFirstRecordOnPage ;
   private long GRIDSEG_USUARIOROL_SEG_USUARIO_CENTRO_nFirstRecordOnPage ;
   private long AV27UsuarioID ;
   private long Z2Regi_Id ;
   private long GXv_int2[] ;
   private String sPrefix ;
   private String sGXsfl_58_idx="0001" ;
   private String sGXsfl_69_idx="0001" ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV28Integra ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtUsua_Codigo_Internalname ;
   private String edtUsua_Codigo_Jsonclick ;
   private String edtUsua_Nombre_Internalname ;
   private String edtUsua_Nombre_Jsonclick ;
   private String edtUsua_Email_Internalname ;
   private String edtUsua_Email_Jsonclick ;
   private String edtUsua_Cedula_Internalname ;
   private String edtUsua_Cedula_Jsonclick ;
   private String divSeg_usuario_roltable_Internalname ;
   private String lblTitleseg_usuario_rol_Internalname ;
   private String lblTitleseg_usuario_rol_Jsonclick ;
   private String divSeg_usuario_centrotable_Internalname ;
   private String lblTitleseg_usuario_centro_Internalname ;
   private String lblTitleseg_usuario_centro_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode6 ;
   private String edtRol_Id_Internalname ;
   private String edtRol_Descripcion_Internalname ;
   private String imgprompt_21_Link ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String sMode4 ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Descripcion_Internalname ;
   private String AV29Pgmname ;
   private String A402Rol_Tipo ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode5 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String Z402Rol_Tipo ;
   private String imgprompt_21_Internalname ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGridseg_usuariorol_seg_usuario_rol_Class ;
   private String subGridseg_usuariorol_seg_usuario_rol_Linesclass ;
   private String ROClassString ;
   private String edtRol_Id_Jsonclick ;
   private String sImgUrl ;
   private String edtRol_Descripcion_Jsonclick ;
   private String imgprompt_1_Internalname ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String subGridseg_usuariorol_seg_usuario_centro_Class ;
   private String subGridseg_usuariorol_seg_usuario_centro_Linesclass ;
   private String imgprompt_1_Link ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridseg_usuariorol_seg_usuario_rol_Internalname ;
   private String subGridseg_usuariorol_seg_usuario_centro_Internalname ;
   private String GXv_char1[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean returnInSub ;
   private String Z24Usua_Codigo ;
   private String Z25Usua_Nombre ;
   private String Z219Usua_Email ;
   private String A24Usua_Codigo ;
   private String A25Usua_Nombre ;
   private String A219Usua_Email ;
   private String A22Rol_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String AV25Usuario ;
   private String Z22Rol_Descripcion ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private String Z13Regi_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Gridseg_usuariorol_seg_usuario_rolContainer ;
   private com.genexus.webpanels.GXWebGrid Gridseg_usuariorol_seg_usuario_centroContainer ;
   private com.genexus.webpanels.GXWebRow Gridseg_usuariorol_seg_usuario_rolRow ;
   private com.genexus.webpanels.GXWebRow Gridseg_usuariorol_seg_usuario_centroRow ;
   private com.genexus.webpanels.GXWebColumn Gridseg_usuariorol_seg_usuario_rolColumn ;
   private com.genexus.webpanels.GXWebColumn Gridseg_usuariorol_seg_usuario_centroColumn ;
   private com.genexus.webpanels.WebSession AV26WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000411_A23Usua_Id ;
   private String[] T000411_A24Usua_Codigo ;
   private String[] T000411_A25Usua_Nombre ;
   private String[] T000411_A219Usua_Email ;
   private long[] T000411_A26Usua_Cedula ;
   private String[] T000412_A24Usua_Codigo ;
   private long[] T000413_A26Usua_Cedula ;
   private long[] T000414_A23Usua_Id ;
   private long[] T000410_A23Usua_Id ;
   private String[] T000410_A24Usua_Codigo ;
   private String[] T000410_A25Usua_Nombre ;
   private String[] T000410_A219Usua_Email ;
   private long[] T000410_A26Usua_Cedula ;
   private long[] T000415_A23Usua_Id ;
   private long[] T000416_A23Usua_Id ;
   private long[] T00049_A23Usua_Id ;
   private String[] T00049_A24Usua_Codigo ;
   private String[] T00049_A25Usua_Nombre ;
   private String[] T00049_A219Usua_Email ;
   private long[] T00049_A26Usua_Cedula ;
   private long[] T000418_A23Usua_Id ;
   private long[] T000421_A46Tran_Id ;
   private long[] T000422_A23Usua_Id ;
   private long[] T000423_A23Usua_Id ;
   private String[] T000423_A22Rol_Descripcion ;
   private String[] T000423_A402Rol_Tipo ;
   private long[] T000423_A21Rol_Id ;
   private String[] T00048_A22Rol_Descripcion ;
   private String[] T00048_A402Rol_Tipo ;
   private String[] T000424_A22Rol_Descripcion ;
   private String[] T000424_A402Rol_Tipo ;
   private long[] T000425_A23Usua_Id ;
   private long[] T000425_A21Rol_Id ;
   private long[] T00047_A23Usua_Id ;
   private long[] T00047_A21Rol_Id ;
   private long[] T00046_A23Usua_Id ;
   private long[] T00046_A21Rol_Id ;
   private String[] T000428_A22Rol_Descripcion ;
   private String[] T000428_A402Rol_Tipo ;
   private long[] T000429_A23Usua_Id ;
   private long[] T000429_A21Rol_Id ;
   private long[] T000430_A2Regi_Id ;
   private long[] T000430_A23Usua_Id ;
   private String[] T000430_A3Cent_Codigo ;
   private String[] T000430_A4Cent_Descripcion ;
   private short[] T000430_A12Regi_Cod ;
   private String[] T000430_A13Regi_Descripcion ;
   private long[] T000430_A1Cent_Id ;
   private long[] T00044_A2Regi_Id ;
   private String[] T00044_A3Cent_Codigo ;
   private String[] T00044_A4Cent_Descripcion ;
   private short[] T00045_A12Regi_Cod ;
   private String[] T00045_A13Regi_Descripcion ;
   private long[] T000431_A2Regi_Id ;
   private String[] T000431_A3Cent_Codigo ;
   private String[] T000431_A4Cent_Descripcion ;
   private short[] T000432_A12Regi_Cod ;
   private String[] T000432_A13Regi_Descripcion ;
   private long[] T000433_A23Usua_Id ;
   private long[] T000433_A1Cent_Id ;
   private long[] T00043_A23Usua_Id ;
   private long[] T00043_A1Cent_Id ;
   private long[] T00042_A23Usua_Id ;
   private long[] T00042_A1Cent_Id ;
   private long[] T000436_A2Regi_Id ;
   private String[] T000436_A3Cent_Codigo ;
   private String[] T000436_A4Cent_Descripcion ;
   private short[] T000437_A12Regi_Cod ;
   private String[] T000437_A13Regi_Descripcion ;
   private long[] T000438_A23Usua_Id ;
   private long[] T000438_A1Cent_Id ;
   private String[] T000439_A24Usua_Codigo ;
   private long[] T000440_A26Usua_Cedula ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV16TrnContext ;
}

final  class seg_usuariorol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? AND Cent_Id = ?  FOR UPDATE OF Usua_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00043", "SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00044", "SELECT Regi_Id, Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00045", "SELECT Regi_Cod, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00046", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? AND Rol_Id = ?  FOR UPDATE OF Usua_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00047", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? AND Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00048", "SELECT Rol_Descripcion, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00049", "SELECT Usua_Id, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula FROM SEG_USUARIO WHERE Usua_Id = ?  FOR UPDATE OF Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000410", "SELECT Usua_Id, Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000411", "SELECT /*+ FIRST_ROWS(100) */ TM1.Usua_Id, TM1.Usua_Codigo, TM1.Usua_Nombre, TM1.Usua_Email, TM1.Usua_Cedula FROM SEG_USUARIO TM1 WHERE TM1.Usua_Id = ? ORDER BY TM1.Usua_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000412", "SELECT Usua_Codigo FROM SEG_USUARIO WHERE (Usua_Codigo = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000413", "SELECT Usua_Cedula FROM SEG_USUARIO WHERE (Usua_Cedula = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000414", "SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000415", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE ( Usua_Id > ?) ORDER BY Usua_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000416", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Usua_Id FROM SEG_USUARIO WHERE ( Usua_Id < ?) ORDER BY Usua_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000417", "INSERT INTO SEG_USUARIO(Usua_Codigo, Usua_Nombre, Usua_Email, Usua_Cedula, Usua_Clave, Usua_Estado, Usua_UsuAprueba, Usua_TipoContrato, Usua_UsuarioCrea, Usua_FechaCrea, Usua_UsuarioModifica, usua_FechaModifica, Usua_IndCambioClave, Usua_Administrador) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "SEG_USUARIO")
         ,new ForEachCursor("T000418", "SELECT Usua_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000419", "UPDATE SEG_USUARIO SET Usua_Codigo=?, Usua_Nombre=?, Usua_Email=?, Usua_Cedula=?  WHERE Usua_Id = ?", GX_NOMASK, "SEG_USUARIO")
         ,new UpdateCursor("T000420", "DELETE FROM SEG_USUARIO  WHERE Usua_Id = ?", GX_NOMASK, "SEG_USUARIO")
         ,new ForEachCursor("T000421", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_UsuarioId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000422", "SELECT /*+ FIRST_ROWS(100) */ Usua_Id FROM SEG_USUARIO ORDER BY Usua_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000423", "SELECT T1.Usua_Id, T2.Rol_Descripcion, T2.Rol_Tipo, T1.Rol_Id FROM (SEG_USUARIO_ROL T1 INNER JOIN SEG_ROL T2 ON T2.Rol_Id = T1.Rol_Id) WHERE T1.Usua_Id = ? and T1.Rol_Id = ? ORDER BY T1.Usua_Id, T1.Rol_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000424", "SELECT Rol_Descripcion, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000425", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? AND Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000426", "INSERT INTO SEG_USUARIO_ROL(Usua_Id, Rol_Id) VALUES(?, ?)", GX_NOMASK, "SEG_USUARIO_ROL")
         ,new UpdateCursor("T000427", "DELETE FROM SEG_USUARIO_ROL  WHERE Usua_Id = ? AND Rol_Id = ?", GX_NOMASK, "SEG_USUARIO_ROL")
         ,new ForEachCursor("T000428", "SELECT Rol_Descripcion, Rol_Tipo FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000429", "SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? ORDER BY Usua_Id, Rol_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000430", "SELECT T2.Regi_Id, T1.Usua_Id, T2.Cent_Codigo, T2.Cent_Descripcion, T3.Regi_Cod, T3.Regi_Descripcion, T1.Cent_Id FROM ((SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T2.Regi_Id) WHERE T1.Usua_Id = ? and T1.Cent_Id = ? ORDER BY T1.Usua_Id, T1.Cent_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000431", "SELECT Regi_Id, Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000432", "SELECT Regi_Cod, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000433", "SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000434", "INSERT INTO SEG_USUARIO_CENTRO(Usua_Id, Cent_Id) VALUES(?, ?)", GX_NOMASK, "SEG_USUARIO_CENTRO")
         ,new UpdateCursor("T000435", "DELETE FROM SEG_USUARIO_CENTRO  WHERE Usua_Id = ? AND Cent_Id = ?", GX_NOMASK, "SEG_USUARIO_CENTRO")
         ,new ForEachCursor("T000436", "SELECT Regi_Id, Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000437", "SELECT Regi_Cod, Regi_Descripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000438", "SELECT Usua_Id, Cent_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? ORDER BY Usua_Id, Cent_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000439", "SELECT Usua_Codigo FROM SEG_USUARIO WHERE (Usua_Codigo = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000440", "SELECT Usua_Cedula FROM SEG_USUARIO WHERE (Usua_Cedula = ?) AND (Not ( Usua_Id = ?)) ",true, GX_NOMASK, false, this,1,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 23 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 27 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 28 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 31 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 34 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 35 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 36 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 38 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 8 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 9 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 11 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
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
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setBigDecimal(4, ((Number) parms[3]).longValue(), 0);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setBigDecimal(4, ((Number) parms[3]).longValue(), 0);
               stmt.setBigDecimal(5, ((Number) parms[4]).longValue(), 0);
               return;
            case 18 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 19 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 21 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 23 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 25 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 27 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 28 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 31 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 32 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 33 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 34 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 36 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 37 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 38 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

