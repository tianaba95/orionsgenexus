/*
               File: seg_rolypantalla_impl
        Description: Rol y pantall
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:6.44
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

public final  class seg_rolypantalla_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A18Pant_Id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A16Modu_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A16Modu_Id) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridseg_rolypantalla_pant") == 0 )
      {
         nRC_GXsfl_46 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_46_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_46_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridseg_rolypantalla_pant_newrow( ) ;
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
            AV9Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Rol_Id", GXutil.ltrim( GXutil.str( AV9Rol_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Rol_Id), "ZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", "Rol y pantall", (short)(0)) ;
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

   public seg_rolypantalla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_rolypantalla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_rolypantalla_impl.class ));
   }

   public seg_rolypantalla_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Asignar pantallas a un rol", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_ROLYPANTALLA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_ROLYPANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Id_Internalname, "Identificador del Rol", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A21Rol_Id, (byte)(11), (byte)(0), ",", "")), ((edtRol_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A21Rol_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Id_Jsonclick, 0, "Attribute", "", "", "", edtRol_Id_Visible, edtRol_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_ROLYPANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRol_Descripcion_Internalname, "Descripción del rol", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRol_Descripcion_Internalname, A22Rol_Descripcion, GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRol_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtRol_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 col-xs-offset-2 col-sm-12 col-sm-offset-0 col-lg-8 col-lg-offset-2 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divPanttable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitlepant_Internalname, "Pantallas", "", "", lblTitlepant_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridseg_rolypantalla_pant( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_ROLYPANTALLA.htm");
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

   public void gxdraw_gridseg_rolypantalla_pant( )
   {
      /*  Grid Control  */
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("GridName", "Gridseg_rolypantalla_pant");
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Class", "Grid");
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("CmpContext", "");
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("InMasterPage", "false");
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", A19Pant_Descripcion);
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", A17Modu_Descripcion);
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", A215RolP_UsuarioCrea);
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioCrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", A217RolP_UsuarioModifica);
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioModifica_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaCrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Value", localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      Gridseg_rolypantalla_pantColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaModifica_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddColumnProperties(Gridseg_rolypantalla_pantColumn);
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridseg_rolypantalla_pantContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridseg_rolypantalla_pant_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_46_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount26 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_26 = (short)(1) ;
            scanStart0O26( ) ;
            while ( RcdFound26 != 0 )
            {
               init_level_properties26( ) ;
               getByPrimaryKey0O26( ) ;
               addRow0O26( ) ;
               scanNext0O26( ) ;
            }
            scanEnd0O26( ) ;
            nBlankRcdCount26 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0O26( ) ;
         standaloneModal0O26( ) ;
         sMode26 = Gx_mode ;
         while ( nGXsfl_46_idx < nRC_GXsfl_46 )
         {
            bGXsfl_46_Refreshing = true ;
            readRow0O26( ) ;
            edtPant_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PANT_ID_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtPant_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PANT_DESCRIPCION_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPant_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Descripcion_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtModu_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MODU_ID_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtModu_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MODU_DESCRIPCION_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtModu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Descripcion_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtRolP_UsuarioCrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_USUARIOCREA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtRolP_UsuarioModifica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtRolP_FechaCrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_FECHACREA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            edtRolP_FechaModifica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
            imgprompt_18_Link = httpContext.cgiGet( "PROMPT_18_"+sGXsfl_46_idx+"Link") ;
            if ( ( nRcdExists_26 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0O26( ) ;
            }
            sendRow0O26( ) ;
            bGXsfl_46_Refreshing = false ;
         }
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount26 = (short)(5) ;
         nRcdExists_26 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0O26( ) ;
            while ( RcdFound26 != 0 )
            {
               sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_4626( ) ;
               init_level_properties26( ) ;
               standaloneNotModal0O26( ) ;
               getByPrimaryKey0O26( ) ;
               standaloneModal0O26( ) ;
               addRow0O26( ) ;
               scanNext0O26( ) ;
            }
            scanEnd0O26( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode26 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_4626( ) ;
         initAll0O26( ) ;
         init_level_properties26( ) ;
         standaloneNotModal0O26( ) ;
         standaloneModal0O26( ) ;
         nRcdExists_26 = (short)(0) ;
         nIsMod_26 = (short)(0) ;
         nRcdDeleted_26 = (short)(0) ;
         nBlankRcdCount26 = (short)(nBlankRcdUsr26+nBlankRcdCount26) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount26 > 0 )
         {
            addRow0O26( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPant_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount26 = (short)(nBlankRcdCount26-1) ;
         }
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridseg_rolypantalla_pantContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridseg_rolypantalla_pant", Gridseg_rolypantalla_pantContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_rolypantalla_pantContainerData", Gridseg_rolypantalla_pantContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridseg_rolypantalla_pantContainerData"+"V", Gridseg_rolypantalla_pantContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridseg_rolypantalla_pantContainerData"+"V"+"\" value='"+Gridseg_rolypantalla_pantContainer.GridValuesHidden()+"'/>") ;
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
      e110O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A21Rol_Id = localUtil.ctol( httpContext.cgiGet( edtRol_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            A22Rol_Descripcion = GXutil.upper( httpContext.cgiGet( edtRol_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
            /* Read saved values. */
            Z21Rol_Id = localUtil.ctol( httpContext.cgiGet( "Z21Rol_Id"), ",", ".") ;
            Z22Rol_Descripcion = httpContext.cgiGet( "Z22Rol_Descripcion") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_46 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), ",", ".")) ;
            AV9Rol_Id = localUtil.ctol( httpContext.cgiGet( "vROL_ID"), ",", ".") ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_ROLYPANTALLA" ;
            A22Rol_Descripcion = httpContext.cgiGet( edtRol_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A21Rol_Id != Z21Rol_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_rolypantalla:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A21Rol_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
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
                  sMode27 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode27 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound27 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0O0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ROL_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRol_Id_Internalname ;
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
                        e110O2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120O2 ();
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
         e120O2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0O27( ) ;
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
         disableAttributes0O27( ) ;
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

   public void confirm_0O0( )
   {
      beforeValidate0O27( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0O27( ) ;
         }
         else
         {
            checkExtendedTable0O27( ) ;
            closeExtendedTableCursors0O27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode27 = Gx_mode ;
         confirm_0O26( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode27 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0O26( )
   {
      nGXsfl_46_idx = (short)(0) ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         readRow0O26( ) ;
         if ( ( nRcdExists_26 != 0 ) || ( nIsMod_26 != 0 ) )
         {
            getKey0O26( ) ;
            if ( ( nRcdExists_26 == 0 ) && ( nRcdDeleted_26 == 0 ) )
            {
               if ( RcdFound26 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0O26( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0O26( ) ;
                     closeExtendedTableCursors0O26( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPant_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound26 != 0 )
               {
                  if ( nRcdDeleted_26 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0O26( ) ;
                     load0O26( ) ;
                     beforeValidate0O26( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0O26( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_26 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0O26( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0O26( ) ;
                           closeExtendedTableCursors0O26( ) ;
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
                  if ( nRcdDeleted_26 == 0 )
                  {
                     GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPant_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtPant_Descripcion_Internalname, A19Pant_Descripcion) ;
         httpContext.changePostValue( edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtModu_Descripcion_Internalname, A17Modu_Descripcion) ;
         httpContext.changePostValue( edtRolP_UsuarioCrea_Internalname, A215RolP_UsuarioCrea) ;
         httpContext.changePostValue( edtRolP_UsuarioModifica_Internalname, A217RolP_UsuarioModifica) ;
         httpContext.changePostValue( edtRolP_FechaCrea_Internalname, localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 3, "/", ":", " ")) ;
         httpContext.changePostValue( edtRolP_FechaModifica_Internalname, localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 3, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z18Pant_Id_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z18Pant_Id, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215RolP_UsuarioCrea_"+sGXsfl_46_idx, Z215RolP_UsuarioCrea) ;
         httpContext.changePostValue( "ZT_"+"Z217RolP_UsuarioModifica_"+sGXsfl_46_idx, Z217RolP_UsuarioModifica) ;
         httpContext.changePostValue( "ZT_"+"Z216RolP_FechaCrea_"+sGXsfl_46_idx, localUtil.ttoc( Z216RolP_FechaCrea, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z218RolP_FechaModifica_"+sGXsfl_46_idx, localUtil.ttoc( Z218RolP_FechaModifica, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_26 != 0 )
         {
            httpContext.changePostValue( "PANT_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PANT_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MODU_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MODU_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_USUARIOCREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioCrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioModifica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_FECHACREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaCrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaModifica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0O0( )
   {
   }

   public void e110O2( )
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
      edtRol_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtRol_Id_Visible, 5, 0)), true);
   }

   public void e120O2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_rolypantalla") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0O27( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z22Rol_Descripcion = T000O7_A22Rol_Descripcion[0] ;
         }
         else
         {
            Z22Rol_Descripcion = A22Rol_Descripcion ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z21Rol_Id = A21Rol_Id ;
         Z22Rol_Descripcion = A22Rol_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), true);
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV9Rol_Id) )
      {
         A21Rol_Id = AV9Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
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

   public void load0O27( )
   {
      /* Using cursor T000O8 */
      pr_default.execute(6, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A22Rol_Descripcion = T000O8_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
         zm0O27( -13) ;
      }
      pr_default.close(6);
      onLoadActions0O27( ) ;
   }

   public void onLoadActions0O27( )
   {
      AV13Pgmname = "SEG_ROLYPANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable0O27( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "SEG_ROLYPANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors0O27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0O27( )
   {
      /* Using cursor T000O9 */
      pr_default.execute(7, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000O7 */
      pr_default.execute(5, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm0O27( 13) ;
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000O7_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         A22Rol_Descripcion = T000O7_A22Rol_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
         Z21Rol_Id = A21Rol_Id ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0O27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey0O27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey0O27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey0O27( ) ;
      if ( RcdFound27 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000O10 */
      pr_default.execute(8, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000O10_A21Rol_Id[0] < A21Rol_Id ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000O10_A21Rol_Id[0] > A21Rol_Id ) ) )
         {
            A21Rol_Id = T000O10_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000O11 */
      pr_default.execute(9, new Object[] {new Long(A21Rol_Id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000O11_A21Rol_Id[0] > A21Rol_Id ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000O11_A21Rol_Id[0] < A21Rol_Id ) ) )
         {
            A21Rol_Id = T000O11_A21Rol_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0O27( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0O27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( A21Rol_Id != Z21Rol_Id )
            {
               A21Rol_Id = Z21Rol_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ROL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRol_Id_Internalname ;
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
               update0O27( ) ;
            }
         }
         else
         {
            if ( A21Rol_Id != Z21Rol_Id )
            {
               /* Insert record */
               insert0O27( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ROL_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRol_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert0O27( ) ;
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
      if ( A21Rol_Id != Z21Rol_Id )
      {
         A21Rol_Id = Z21Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ROL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRol_Id_Internalname ;
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

   public void checkOptimisticConcurrency0O27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000O6 */
         pr_default.execute(4, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z22Rol_Descripcion, T000O6_A22Rol_Descripcion[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_ROL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0O27( )
   {
      beforeValidate0O27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0O27( 0) ;
         checkOptimisticConcurrency0O27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0O27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O12 */
                  pr_default.execute(10, new Object[] {A22Rol_Descripcion});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000O13 */
                  pr_default.execute(11);
                  A21Rol_Id = T000O13_A21Rol_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
                  pr_default.close(11);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0O27( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0O0( ) ;
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
            load0O27( ) ;
         }
         endLevel0O27( ) ;
      }
      closeExtendedTableCursors0O27( ) ;
   }

   public void update0O27( )
   {
      beforeValidate0O27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0O27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O14 */
                  pr_default.execute(12, new Object[] {A22Rol_Descripcion, new Long(A21Rol_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0O27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0O27( ) ;
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
         endLevel0O27( ) ;
      }
      closeExtendedTableCursors0O27( ) ;
   }

   public void deferredUpdate0O27( )
   {
   }

   public void delete( )
   {
      beforeValidate0O27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0O27( ) ;
         afterConfirm0O27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0O27( ) ;
            if ( AnyError == 0 )
            {
               scanStart0O26( ) ;
               while ( RcdFound26 != 0 )
               {
                  getByPrimaryKey0O26( ) ;
                  delete0O26( ) ;
                  scanNext0O26( ) ;
               }
               scanEnd0O26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O15 */
                  pr_default.execute(13, new Object[] {new Long(A21Rol_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL") ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0O27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0O27( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "SEG_ROLYPANTALLA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000O16 */
         pr_default.execute(14, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ROLES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000O17 */
         pr_default.execute(15, new Object[] {new Long(A21Rol_Id)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"USUARIO Y ROLES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel0O26( )
   {
      nGXsfl_46_idx = (short)(0) ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         readRow0O26( ) ;
         if ( ( nRcdExists_26 != 0 ) || ( nIsMod_26 != 0 ) )
         {
            standaloneNotModal0O26( ) ;
            getKey0O26( ) ;
            if ( ( nRcdExists_26 == 0 ) && ( nRcdDeleted_26 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0O26( ) ;
            }
            else
            {
               if ( RcdFound26 != 0 )
               {
                  if ( ( nRcdDeleted_26 != 0 ) && ( nRcdExists_26 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0O26( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_26 != 0 ) && ( nRcdExists_26 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0O26( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_26 == 0 )
                  {
                     GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPant_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtPant_Descripcion_Internalname, A19Pant_Descripcion) ;
         httpContext.changePostValue( edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtModu_Descripcion_Internalname, A17Modu_Descripcion) ;
         httpContext.changePostValue( edtRolP_UsuarioCrea_Internalname, A215RolP_UsuarioCrea) ;
         httpContext.changePostValue( edtRolP_UsuarioModifica_Internalname, A217RolP_UsuarioModifica) ;
         httpContext.changePostValue( edtRolP_FechaCrea_Internalname, localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 3, "/", ":", " ")) ;
         httpContext.changePostValue( edtRolP_FechaModifica_Internalname, localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 3, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z18Pant_Id_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z18Pant_Id, (byte)(6), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z215RolP_UsuarioCrea_"+sGXsfl_46_idx, Z215RolP_UsuarioCrea) ;
         httpContext.changePostValue( "ZT_"+"Z217RolP_UsuarioModifica_"+sGXsfl_46_idx, Z217RolP_UsuarioModifica) ;
         httpContext.changePostValue( "ZT_"+"Z216RolP_FechaCrea_"+sGXsfl_46_idx, localUtil.ttoc( Z216RolP_FechaCrea, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z218RolP_FechaModifica_"+sGXsfl_46_idx, localUtil.ttoc( Z218RolP_FechaModifica, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_26_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_26 != 0 )
         {
            httpContext.changePostValue( "PANT_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PANT_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MODU_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MODU_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_USUARIOCREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioCrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioModifica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_FECHACREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaCrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaModifica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0O26( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_26 = (short)(0) ;
      nIsMod_26 = (short)(0) ;
      nRcdDeleted_26 = (short)(0) ;
   }

   public void processLevel0O27( )
   {
      /* Save parent mode. */
      sMode27 = Gx_mode ;
      processNestedLevel0O26( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0O27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0O27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_rolypantalla");
         if ( AnyError == 0 )
         {
            confirmValues0O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_rolypantalla");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0O27( )
   {
      /* Scan By routine */
      /* Using cursor T000O18 */
      pr_default.execute(16);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000O18_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0O27( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A21Rol_Id = T000O18_A21Rol_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      }
   }

   public void scanEnd0O27( )
   {
      pr_default.close(16);
   }

   public void afterConfirm0O27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0O27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0O27( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0O27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0O27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0O27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0O27( )
   {
      edtRol_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Id_Enabled, 5, 0)), true);
      edtRol_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRol_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRol_Descripcion_Enabled, 5, 0)), true);
   }

   public void zm0O26( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z215RolP_UsuarioCrea = T000O3_A215RolP_UsuarioCrea[0] ;
            Z217RolP_UsuarioModifica = T000O3_A217RolP_UsuarioModifica[0] ;
            Z216RolP_FechaCrea = T000O3_A216RolP_FechaCrea[0] ;
            Z218RolP_FechaModifica = T000O3_A218RolP_FechaModifica[0] ;
         }
         else
         {
            Z215RolP_UsuarioCrea = A215RolP_UsuarioCrea ;
            Z217RolP_UsuarioModifica = A217RolP_UsuarioModifica ;
            Z216RolP_FechaCrea = A216RolP_FechaCrea ;
            Z218RolP_FechaModifica = A218RolP_FechaModifica ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z21Rol_Id = A21Rol_Id ;
         Z215RolP_UsuarioCrea = A215RolP_UsuarioCrea ;
         Z217RolP_UsuarioModifica = A217RolP_UsuarioModifica ;
         Z216RolP_FechaCrea = A216RolP_FechaCrea ;
         Z218RolP_FechaModifica = A218RolP_FechaModifica ;
         Z18Pant_Id = A18Pant_Id ;
         Z19Pant_Descripcion = A19Pant_Descripcion ;
         Z16Modu_Id = A16Modu_Id ;
         Z17Modu_Descripcion = A17Modu_Descripcion ;
      }
   }

   public void standaloneNotModal0O26( )
   {
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_FechaCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
   }

   public void standaloneModal0O26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPant_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      }
      else
      {
         edtPant_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      }
   }

   public void load0O26( )
   {
      /* Using cursor T000O19 */
      pr_default.execute(17, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A215RolP_UsuarioCrea = T000O19_A215RolP_UsuarioCrea[0] ;
         A217RolP_UsuarioModifica = T000O19_A217RolP_UsuarioModifica[0] ;
         A216RolP_FechaCrea = T000O19_A216RolP_FechaCrea[0] ;
         A218RolP_FechaModifica = T000O19_A218RolP_FechaModifica[0] ;
         A19Pant_Descripcion = T000O19_A19Pant_Descripcion[0] ;
         A17Modu_Descripcion = T000O19_A17Modu_Descripcion[0] ;
         A16Modu_Id = T000O19_A16Modu_Id[0] ;
         zm0O26( -14) ;
      }
      pr_default.close(17);
      onLoadActions0O26( ) ;
   }

   public void onLoadActions0O26( )
   {
   }

   public void checkExtendedTable0O26( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0O26( ) ;
      /* Using cursor T000O4 */
      pr_default.execute(2, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A19Pant_Descripcion = T000O4_A19Pant_Descripcion[0] ;
      A16Modu_Id = T000O4_A16Modu_Id[0] ;
      pr_default.close(2);
      /* Using cursor T000O5 */
      pr_default.execute(3, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000O5_A17Modu_Descripcion[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors0O26( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable0O26( )
   {
   }

   public void gxload_15( int A18Pant_Id )
   {
      /* Using cursor T000O20 */
      pr_default.execute(18, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A19Pant_Descripcion = T000O20_A19Pant_Descripcion[0] ;
      A16Modu_Id = T000O20_A16Modu_Id[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A19Pant_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void gxload_16( long A16Modu_Id )
   {
      /* Using cursor T000O21 */
      pr_default.execute(19, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000O21_A17Modu_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A17Modu_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(19);
   }

   public void getKey0O26( )
   {
      /* Using cursor T000O22 */
      pr_default.execute(20, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound26 = (short)(1) ;
      }
      else
      {
         RcdFound26 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey0O26( )
   {
      /* Using cursor T000O3 */
      pr_default.execute(1, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0O26( 14) ;
         RcdFound26 = (short)(1) ;
         initializeNonKey0O26( ) ;
         A215RolP_UsuarioCrea = T000O3_A215RolP_UsuarioCrea[0] ;
         A217RolP_UsuarioModifica = T000O3_A217RolP_UsuarioModifica[0] ;
         A216RolP_FechaCrea = T000O3_A216RolP_FechaCrea[0] ;
         A218RolP_FechaModifica = T000O3_A218RolP_FechaModifica[0] ;
         A18Pant_Id = T000O3_A18Pant_Id[0] ;
         Z21Rol_Id = A21Rol_Id ;
         Z18Pant_Id = A18Pant_Id ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0O26( ) ;
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound26 = (short)(0) ;
         initializeNonKey0O26( ) ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0O26( ) ;
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0O26( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0O26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000O2 */
         pr_default.execute(0, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL_PANTALLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z215RolP_UsuarioCrea, T000O2_A215RolP_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z217RolP_UsuarioModifica, T000O2_A217RolP_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z216RolP_FechaCrea, T000O2_A216RolP_FechaCrea[0]) ) || !( GXutil.dateCompare(Z218RolP_FechaModifica, T000O2_A218RolP_FechaModifica[0]) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_ROL_PANTALLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0O26( )
   {
      beforeValidate0O26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O26( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0O26( 0) ;
         checkOptimisticConcurrency0O26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O26( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0O26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O23 */
                  pr_default.execute(21, new Object[] {new Long(A21Rol_Id), A215RolP_UsuarioCrea, A217RolP_UsuarioModifica, A216RolP_FechaCrea, A218RolP_FechaModifica, new Integer(A18Pant_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
                  if ( (pr_default.getStatus(21) == 1) )
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
            load0O26( ) ;
         }
         endLevel0O26( ) ;
      }
      closeExtendedTableCursors0O26( ) ;
   }

   public void update0O26( )
   {
      beforeValidate0O26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O26( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O26( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0O26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O24 */
                  pr_default.execute(22, new Object[] {A215RolP_UsuarioCrea, A217RolP_UsuarioModifica, A216RolP_FechaCrea, A218RolP_FechaModifica, new Long(A21Rol_Id), new Integer(A18Pant_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_ROL_PANTALLA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0O26( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0O26( ) ;
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
         endLevel0O26( ) ;
      }
      closeExtendedTableCursors0O26( ) ;
   }

   public void deferredUpdate0O26( )
   {
   }

   public void delete0O26( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0O26( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O26( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0O26( ) ;
         afterConfirm0O26( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0O26( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000O25 */
               pr_default.execute(23, new Object[] {new Long(A21Rol_Id), new Integer(A18Pant_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_ROL_PANTALLA") ;
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
      sMode26 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0O26( ) ;
      Gx_mode = sMode26 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0O26( )
   {
      standaloneModal0O26( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000O26 */
         pr_default.execute(24, new Object[] {new Integer(A18Pant_Id)});
         A19Pant_Descripcion = T000O26_A19Pant_Descripcion[0] ;
         A16Modu_Id = T000O26_A16Modu_Id[0] ;
         pr_default.close(24);
         /* Using cursor T000O27 */
         pr_default.execute(25, new Object[] {new Long(A16Modu_Id)});
         A17Modu_Descripcion = T000O27_A17Modu_Descripcion[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel0O26( )
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

   public void scanStart0O26( )
   {
      /* Scan By routine */
      /* Using cursor T000O28 */
      pr_default.execute(26, new Object[] {new Long(A21Rol_Id)});
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A18Pant_Id = T000O28_A18Pant_Id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0O26( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A18Pant_Id = T000O28_A18Pant_Id[0] ;
      }
   }

   public void scanEnd0O26( )
   {
      pr_default.close(26);
   }

   public void afterConfirm0O26( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A215RolP_UsuarioCrea = AV12Usuario ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A217RolP_UsuarioModifica = AV12Usuario ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A216RolP_FechaCrea = GXutil.now( ) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A218RolP_FechaModifica = GXutil.now( ) ;
      }
   }

   public void beforeInsert0O26( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0O26( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0O26( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0O26( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0O26( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0O26( )
   {
      edtPant_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtPant_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Descripcion_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtModu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Descripcion_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_FechaCrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_FechaModifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
   }

   public void subsflControlProps_4626( )
   {
      edtPant_Id_Internalname = "PANT_ID_"+sGXsfl_46_idx ;
      imgprompt_18_Internalname = "PROMPT_18_"+sGXsfl_46_idx ;
      edtPant_Descripcion_Internalname = "PANT_DESCRIPCION_"+sGXsfl_46_idx ;
      edtModu_Id_Internalname = "MODU_ID_"+sGXsfl_46_idx ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION_"+sGXsfl_46_idx ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA_"+sGXsfl_46_idx ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx ;
      edtRolP_FechaCrea_Internalname = "ROLP_FECHACREA_"+sGXsfl_46_idx ;
      edtRolP_FechaModifica_Internalname = "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_4626( )
   {
      edtPant_Id_Internalname = "PANT_ID_"+sGXsfl_46_fel_idx ;
      imgprompt_18_Internalname = "PROMPT_18_"+sGXsfl_46_fel_idx ;
      edtPant_Descripcion_Internalname = "PANT_DESCRIPCION_"+sGXsfl_46_fel_idx ;
      edtModu_Id_Internalname = "MODU_ID_"+sGXsfl_46_fel_idx ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION_"+sGXsfl_46_fel_idx ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA_"+sGXsfl_46_fel_idx ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA_"+sGXsfl_46_fel_idx ;
      edtRolP_FechaCrea_Internalname = "ROLP_FECHACREA_"+sGXsfl_46_fel_idx ;
      edtRolP_FechaModifica_Internalname = "ROLP_FECHAMODIFICA_"+sGXsfl_46_fel_idx ;
   }

   public void addRow0O26( )
   {
      nGXsfl_46_idx = (short)(nGXsfl_46_idx+1) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_4626( ) ;
      sendRow0O26( ) ;
   }

   public void sendRow0O26( )
   {
      Gridseg_rolypantalla_pantRow = GXWebRow.GetNew(context) ;
      if ( subGridseg_rolypantalla_pant_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridseg_rolypantalla_pant_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridseg_rolypantalla_pant_Class, "") != 0 )
         {
            subGridseg_rolypantalla_pant_Linesclass = subGridseg_rolypantalla_pant_Class+"Odd" ;
         }
      }
      else if ( subGridseg_rolypantalla_pant_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridseg_rolypantalla_pant_Backstyle = (byte)(0) ;
         subGridseg_rolypantalla_pant_Backcolor = subGridseg_rolypantalla_pant_Allbackcolor ;
         if ( GXutil.strcmp(subGridseg_rolypantalla_pant_Class, "") != 0 )
         {
            subGridseg_rolypantalla_pant_Linesclass = subGridseg_rolypantalla_pant_Class+"Uniform" ;
         }
      }
      else if ( subGridseg_rolypantalla_pant_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridseg_rolypantalla_pant_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridseg_rolypantalla_pant_Class, "") != 0 )
         {
            subGridseg_rolypantalla_pant_Linesclass = subGridseg_rolypantalla_pant_Class+"Odd" ;
         }
         subGridseg_rolypantalla_pant_Backcolor = (int)(0x0) ;
      }
      else if ( subGridseg_rolypantalla_pant_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridseg_rolypantalla_pant_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
         {
            subGridseg_rolypantalla_pant_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_rolypantalla_pant_Class, "") != 0 )
            {
               subGridseg_rolypantalla_pant_Linesclass = subGridseg_rolypantalla_pant_Class+"Even" ;
            }
         }
         else
         {
            subGridseg_rolypantalla_pant_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridseg_rolypantalla_pant_Class, "") != 0 )
            {
               subGridseg_rolypantalla_pant_Linesclass = subGridseg_rolypantalla_pant_Class+"Odd" ;
            }
         }
      }
      imgprompt_18_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00p0"+"',["+"{Ctrl:gx.dom.el('"+"PANT_ID_"+sGXsfl_46_idx+"'), id:'"+"PANT_ID_"+sGXsfl_46_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_26_"+sGXsfl_46_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00q1"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(21,2),t(',',7),t(11,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"PANT_ID_"',3),t(+,5),t(sGXsfl_46_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"PANT_ID_"',3),t(+,5),t(sGXsfl_46_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_26_"',3),t(+,5),t(sGXsfl_46_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_21,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_46_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_46_idx + "',46)\"" ;
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPant_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPant_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtPant_Id_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Codigo","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_18_Internalname,sImgUrl,imgprompt_18_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_18_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPant_Descripcion_Internalname,A19Pant_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPant_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtPant_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtModu_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")),((edtModu_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtModu_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtModu_Id_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtModu_Descripcion_Internalname,A17Modu_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtModu_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtModu_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_UsuarioCrea_Internalname,A215RolP_UsuarioCrea,GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRolP_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtRolP_UsuarioCrea_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_UsuarioModifica_Internalname,A217RolP_UsuarioModifica,GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRolP_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtRolP_UsuarioModifica_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_FechaCrea_Internalname,localUtil.ttoc( A216RolP_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRolP_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtRolP_FechaCrea_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridseg_rolypantalla_pantRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRolP_FechaModifica_Internalname,localUtil.ttoc( A218RolP_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRolP_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtRolP_FechaModifica_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
      httpContext.ajax_sending_grid_row(Gridseg_rolypantalla_pantRow);
      GXCCtl = "Z18Pant_Id_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      GXCCtl = "Z215RolP_UsuarioCrea_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z215RolP_UsuarioCrea);
      GXCCtl = "Z217RolP_UsuarioModifica_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z217RolP_UsuarioModifica);
      GXCCtl = "Z216RolP_FechaCrea_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z216RolP_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z218RolP_FechaModifica_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z218RolP_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_26_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_26_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_26_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_46_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vROL_ID_" + sGXsfl_46_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOCREA"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, GXutil.rtrim( localUtil.format( A215RolP_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_USUARIOMODIFICA"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, GXutil.rtrim( localUtil.format( A217RolP_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_FECHACREA"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, localUtil.format( A216RolP_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROLP_FECHAMODIFICA"+"_"+sGXsfl_46_idx, getSecureSignedToken( sGXsfl_46_idx, localUtil.format( A218RolP_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPant_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_ID_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MODU_DESCRIPCION_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtModu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOCREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioCrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_UsuarioModifica_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHACREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaCrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRolP_FechaModifica_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_18_"+sGXsfl_46_idx+"Link", GXutil.rtrim( imgprompt_18_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridseg_rolypantalla_pantContainer.AddRow(Gridseg_rolypantalla_pantRow);
   }

   public void readRow0O26( )
   {
      nGXsfl_46_idx = (short)(nGXsfl_46_idx+1) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_4626( ) ;
      edtPant_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PANT_ID_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtPant_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PANT_DESCRIPCION_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtModu_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MODU_ID_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtModu_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MODU_DESCRIPCION_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtRolP_UsuarioCrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_USUARIOCREA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtRolP_UsuarioModifica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_USUARIOMODIFICA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtRolP_FechaCrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_FECHACREA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      edtRolP_FechaModifica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ROLP_FECHAMODIFICA_"+sGXsfl_46_idx+"Enabled"), ",", ".")) ;
      imgprompt_18_Link = httpContext.cgiGet( "PROMPT_18_"+sGXsfl_46_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".") > 999999 ) ) )
      {
         GXCCtl = "PANT_ID_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         wbErr = true ;
         A18Pant_Id = 0 ;
      }
      else
      {
         A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".")) ;
      }
      A19Pant_Descripcion = httpContext.cgiGet( edtPant_Descripcion_Internalname) ;
      A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
      A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
      A215RolP_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioCrea_Internalname)) ;
      A217RolP_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtRolP_UsuarioModifica_Internalname)) ;
      A216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtRolP_FechaCrea_Internalname)) ;
      A218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtRolP_FechaModifica_Internalname)) ;
      GXCCtl = "Z18Pant_Id_" + sGXsfl_46_idx ;
      Z18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z215RolP_UsuarioCrea_" + sGXsfl_46_idx ;
      Z215RolP_UsuarioCrea = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z217RolP_UsuarioModifica_" + sGXsfl_46_idx ;
      Z217RolP_UsuarioModifica = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z216RolP_FechaCrea_" + sGXsfl_46_idx ;
      Z216RolP_FechaCrea = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z218RolP_FechaModifica_" + sGXsfl_46_idx ;
      Z218RolP_FechaModifica = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_26_" + sGXsfl_46_idx ;
      nRcdDeleted_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_26_" + sGXsfl_46_idx ;
      nRcdExists_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_26_" + sGXsfl_46_idx ;
      nIsMod_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtRolP_FechaModifica_Enabled = edtRolP_FechaModifica_Enabled ;
      defedtRolP_FechaCrea_Enabled = edtRolP_FechaCrea_Enabled ;
      defedtRolP_UsuarioModifica_Enabled = edtRolP_UsuarioModifica_Enabled ;
      defedtRolP_UsuarioCrea_Enabled = edtRolP_UsuarioCrea_Enabled ;
      defedtModu_Id_Enabled = edtModu_Id_Enabled ;
      defedtPant_Id_Enabled = edtPant_Id_Enabled ;
   }

   public void confirmValues0O0( )
   {
      nGXsfl_46_idx = (short)(0) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_4626( ) ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         nGXsfl_46_idx = (short)(nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_4626( ) ;
         httpContext.changePostValue( "Z18Pant_Id_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z18Pant_Id_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z18Pant_Id_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z215RolP_UsuarioCrea_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z215RolP_UsuarioCrea_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z215RolP_UsuarioCrea_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z217RolP_UsuarioModifica_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z217RolP_UsuarioModifica_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z217RolP_UsuarioModifica_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z216RolP_FechaCrea_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z216RolP_FechaCrea_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z216RolP_FechaCrea_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z218RolP_FechaModifica_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z218RolP_FechaModifica_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z218RolP_FechaModifica_"+sGXsfl_46_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141416840");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_rolypantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Rol_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z21Rol_Id", GXutil.ltrim( localUtil.ntoc( Z21Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z22Rol_Descripcion", Z22Rol_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nGXsfl_46_idx, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vROL_ID", GXutil.ltrim( localUtil.ntoc( AV9Rol_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vROL_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Rol_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_ROLYPANTALLA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_rolypantalla:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_rolypantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Rol_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_ROLYPANTALLA" ;
   }

   public String getPgmdesc( )
   {
      return "Rol y pantall" ;
   }

   public void initializeNonKey0O27( )
   {
      A22Rol_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A22Rol_Descripcion", A22Rol_Descripcion);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_ROL_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A22Rol_Descripcion, "@!"))));
      Z22Rol_Descripcion = "" ;
   }

   public void initAll0O27( )
   {
      A21Rol_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A21Rol_Id", GXutil.ltrim( GXutil.str( A21Rol_Id, 11, 0)));
      initializeNonKey0O27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0O26( )
   {
      A215RolP_UsuarioCrea = "" ;
      A217RolP_UsuarioModifica = "" ;
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A19Pant_Descripcion = "" ;
      A16Modu_Id = 0 ;
      A17Modu_Descripcion = "" ;
      Z215RolP_UsuarioCrea = "" ;
      Z217RolP_UsuarioModifica = "" ;
      Z216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll0O26( )
   {
      A18Pant_Id = 0 ;
      initializeNonKey0O26( ) ;
   }

   public void standaloneModalInsert0O26( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416845");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_rolypantalla.js", "?20186141416845");
      /* End function include_jscripts */
   }

   public void init_level_properties26( )
   {
      edtRolP_FechaModifica_Enabled = defedtRolP_FechaModifica_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_FechaCrea_Enabled = defedtRolP_FechaCrea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_FechaCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_FechaCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioModifica_Enabled = defedtRolP_UsuarioModifica_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioModifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioModifica_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtRolP_UsuarioCrea_Enabled = defedtRolP_UsuarioCrea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRolP_UsuarioCrea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRolP_UsuarioCrea_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtModu_Id_Enabled = defedtModu_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
      edtPant_Id_Enabled = defedtPant_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), !bGXsfl_46_Refreshing);
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
      edtRol_Id_Internalname = "ROL_ID" ;
      edtRol_Descripcion_Internalname = "ROL_DESCRIPCION" ;
      lblTitlepant_Internalname = "TITLEPANT" ;
      edtPant_Id_Internalname = "PANT_ID" ;
      edtPant_Descripcion_Internalname = "PANT_DESCRIPCION" ;
      edtModu_Id_Internalname = "MODU_ID" ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION" ;
      edtRolP_UsuarioCrea_Internalname = "ROLP_USUARIOCREA" ;
      edtRolP_UsuarioModifica_Internalname = "ROLP_USUARIOMODIFICA" ;
      edtRolP_FechaCrea_Internalname = "ROLP_FECHACREA" ;
      edtRolP_FechaModifica_Internalname = "ROLP_FECHAMODIFICA" ;
      divPanttable_Internalname = "PANTTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_18_Internalname = "PROMPT_18" ;
      subGridseg_rolypantalla_pant_Internalname = "GRIDSEG_ROLYPANTALLA_PANT" ;
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
      Form.setCaption( "Rol y pantall" );
      edtRolP_FechaModifica_Jsonclick = "" ;
      edtRolP_FechaCrea_Jsonclick = "" ;
      edtRolP_UsuarioModifica_Jsonclick = "" ;
      edtRolP_UsuarioCrea_Jsonclick = "" ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Id_Jsonclick = "" ;
      edtPant_Descripcion_Jsonclick = "" ;
      imgprompt_18_Visible = 1 ;
      imgprompt_18_Link = "" ;
      imgprompt_18_Visible = 1 ;
      edtPant_Id_Jsonclick = "" ;
      subGridseg_rolypantalla_pant_Class = "Grid" ;
      subGridseg_rolypantalla_pant_Backcolorstyle = (byte)(0) ;
      subGridseg_rolypantalla_pant_Allowcollapsing = (byte)(0) ;
      subGridseg_rolypantalla_pant_Allowselection = (byte)(0) ;
      edtRolP_FechaModifica_Enabled = 0 ;
      edtRolP_FechaCrea_Enabled = 0 ;
      edtRolP_UsuarioModifica_Enabled = 0 ;
      edtRolP_UsuarioCrea_Enabled = 0 ;
      edtModu_Descripcion_Enabled = 0 ;
      edtModu_Id_Enabled = 0 ;
      edtPant_Descripcion_Enabled = 0 ;
      edtPant_Id_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRol_Descripcion_Jsonclick = "" ;
      edtRol_Descripcion_Enabled = 0 ;
      edtRol_Id_Jsonclick = "" ;
      edtRol_Id_Enabled = 0 ;
      edtRol_Id_Visible = 1 ;
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

   public void gxnrgridseg_rolypantalla_pant_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_4626( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0O26( ) ;
         standaloneModal0O26( ) ;
         dynload_actions( ) ;
         sendRow0O26( ) ;
         nGXsfl_46_idx = (short)(nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_4626( ) ;
      }
      httpContext.GX_webresponse.addString(Gridseg_rolypantalla_pantContainer.ToJavascriptSource());
      /* End function gxnrGridseg_rolypantalla_pant_newrow */
   }

   public void valid_Pant_id( int GX_Parm1 ,
                              long GX_Parm2 ,
                              String GX_Parm3 ,
                              String GX_Parm4 )
   {
      A18Pant_Id = GX_Parm1 ;
      A16Modu_Id = GX_Parm2 ;
      A19Pant_Descripcion = GX_Parm3 ;
      A17Modu_Descripcion = GX_Parm4 ;
      /* Using cursor T000O26 */
      pr_default.execute(24, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'PANTALLA'.", "ForeignKeyNotFound", 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
      }
      A19Pant_Descripcion = T000O26_A19Pant_Descripcion[0] ;
      A16Modu_Id = T000O26_A16Modu_Id[0] ;
      pr_default.close(24);
      /* Using cursor T000O27 */
      pr_default.execute(25, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A17Modu_Descripcion = T000O27_A17Modu_Descripcion[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A19Pant_Descripcion = "" ;
         A16Modu_Id = 0 ;
         A17Modu_Descripcion = "" ;
      }
      isValidOutput.add(A19Pant_Descripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A17Modu_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9Rol_Id',fld:'vROL_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120O2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(24);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z22Rol_Descripcion = "" ;
      Z215RolP_UsuarioCrea = "" ;
      Z217RolP_UsuarioModifica = "" ;
      Z216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A22Rol_Descripcion = "" ;
      lblTitlepant_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridseg_rolypantalla_pantContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridseg_rolypantalla_pantColumn = new com.genexus.webpanels.GXWebColumn();
      A19Pant_Descripcion = "" ;
      A17Modu_Descripcion = "" ;
      A215RolP_UsuarioCrea = "" ;
      A217RolP_UsuarioModifica = "" ;
      A216RolP_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A218RolP_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      sMode26 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode27 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV12Usuario = "" ;
      T000O8_A21Rol_Id = new long[1] ;
      T000O8_A22Rol_Descripcion = new String[] {""} ;
      T000O9_A21Rol_Id = new long[1] ;
      T000O7_A21Rol_Id = new long[1] ;
      T000O7_A22Rol_Descripcion = new String[] {""} ;
      T000O10_A21Rol_Id = new long[1] ;
      T000O11_A21Rol_Id = new long[1] ;
      T000O6_A21Rol_Id = new long[1] ;
      T000O6_A22Rol_Descripcion = new String[] {""} ;
      T000O13_A21Rol_Id = new long[1] ;
      T000O16_A104TNov_Codigo = new int[1] ;
      T000O16_A105TNov_Rol_Id = new long[1] ;
      T000O17_A23Usua_Id = new long[1] ;
      T000O17_A21Rol_Id = new long[1] ;
      T000O18_A21Rol_Id = new long[1] ;
      Z19Pant_Descripcion = "" ;
      Z17Modu_Descripcion = "" ;
      T000O19_A21Rol_Id = new long[1] ;
      T000O19_A215RolP_UsuarioCrea = new String[] {""} ;
      T000O19_A217RolP_UsuarioModifica = new String[] {""} ;
      T000O19_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000O19_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000O19_A19Pant_Descripcion = new String[] {""} ;
      T000O19_A17Modu_Descripcion = new String[] {""} ;
      T000O19_A18Pant_Id = new int[1] ;
      T000O19_A16Modu_Id = new long[1] ;
      T000O4_A19Pant_Descripcion = new String[] {""} ;
      T000O4_A16Modu_Id = new long[1] ;
      T000O5_A17Modu_Descripcion = new String[] {""} ;
      T000O20_A19Pant_Descripcion = new String[] {""} ;
      T000O20_A16Modu_Id = new long[1] ;
      T000O21_A17Modu_Descripcion = new String[] {""} ;
      T000O22_A21Rol_Id = new long[1] ;
      T000O22_A18Pant_Id = new int[1] ;
      T000O3_A21Rol_Id = new long[1] ;
      T000O3_A215RolP_UsuarioCrea = new String[] {""} ;
      T000O3_A217RolP_UsuarioModifica = new String[] {""} ;
      T000O3_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000O3_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000O3_A18Pant_Id = new int[1] ;
      T000O2_A21Rol_Id = new long[1] ;
      T000O2_A215RolP_UsuarioCrea = new String[] {""} ;
      T000O2_A217RolP_UsuarioModifica = new String[] {""} ;
      T000O2_A216RolP_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000O2_A218RolP_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000O2_A18Pant_Id = new int[1] ;
      T000O26_A19Pant_Descripcion = new String[] {""} ;
      T000O26_A16Modu_Id = new long[1] ;
      T000O27_A17Modu_Descripcion = new String[] {""} ;
      T000O28_A21Rol_Id = new long[1] ;
      T000O28_A18Pant_Id = new int[1] ;
      Gridseg_rolypantalla_pantRow = new com.genexus.webpanels.GXWebRow();
      subGridseg_rolypantalla_pant_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_rolypantalla__default(),
         new Object[] {
             new Object[] {
            T000O2_A21Rol_Id, T000O2_A215RolP_UsuarioCrea, T000O2_A217RolP_UsuarioModifica, T000O2_A216RolP_FechaCrea, T000O2_A218RolP_FechaModifica, T000O2_A18Pant_Id
            }
            , new Object[] {
            T000O3_A21Rol_Id, T000O3_A215RolP_UsuarioCrea, T000O3_A217RolP_UsuarioModifica, T000O3_A216RolP_FechaCrea, T000O3_A218RolP_FechaModifica, T000O3_A18Pant_Id
            }
            , new Object[] {
            T000O4_A19Pant_Descripcion, T000O4_A16Modu_Id
            }
            , new Object[] {
            T000O5_A17Modu_Descripcion
            }
            , new Object[] {
            T000O6_A21Rol_Id, T000O6_A22Rol_Descripcion
            }
            , new Object[] {
            T000O7_A21Rol_Id, T000O7_A22Rol_Descripcion
            }
            , new Object[] {
            T000O8_A21Rol_Id, T000O8_A22Rol_Descripcion
            }
            , new Object[] {
            T000O9_A21Rol_Id
            }
            , new Object[] {
            T000O10_A21Rol_Id
            }
            , new Object[] {
            T000O11_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000O13_A21Rol_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000O16_A104TNov_Codigo, T000O16_A105TNov_Rol_Id
            }
            , new Object[] {
            T000O17_A23Usua_Id, T000O17_A21Rol_Id
            }
            , new Object[] {
            T000O18_A21Rol_Id
            }
            , new Object[] {
            T000O19_A21Rol_Id, T000O19_A215RolP_UsuarioCrea, T000O19_A217RolP_UsuarioModifica, T000O19_A216RolP_FechaCrea, T000O19_A218RolP_FechaModifica, T000O19_A19Pant_Descripcion, T000O19_A17Modu_Descripcion, T000O19_A18Pant_Id, T000O19_A16Modu_Id
            }
            , new Object[] {
            T000O20_A19Pant_Descripcion, T000O20_A16Modu_Id
            }
            , new Object[] {
            T000O21_A17Modu_Descripcion
            }
            , new Object[] {
            T000O22_A21Rol_Id, T000O22_A18Pant_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000O26_A19Pant_Descripcion, T000O26_A16Modu_Id
            }
            , new Object[] {
            T000O27_A17Modu_Descripcion
            }
            , new Object[] {
            T000O28_A21Rol_Id, T000O28_A18Pant_Id
            }
         }
      );
      AV13Pgmname = "SEG_ROLYPANTALLA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridseg_rolypantalla_pant_Backcolorstyle ;
   private byte subGridseg_rolypantalla_pant_Allowselection ;
   private byte subGridseg_rolypantalla_pant_Allowhovering ;
   private byte subGridseg_rolypantalla_pant_Allowcollapsing ;
   private byte subGridseg_rolypantalla_pant_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridseg_rolypantalla_pant_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_26 ;
   private short nRC_GXsfl_46 ;
   private short nGXsfl_46_idx=1 ;
   private short nRcdDeleted_26 ;
   private short nRcdExists_26 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount26 ;
   private short RcdFound26 ;
   private short nBlankRcdUsr26 ;
   private short RcdFound27 ;
   private int Z18Pant_Id ;
   private int A18Pant_Id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRol_Id_Enabled ;
   private int edtRol_Id_Visible ;
   private int edtRol_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtPant_Id_Enabled ;
   private int edtPant_Descripcion_Enabled ;
   private int edtModu_Id_Enabled ;
   private int edtModu_Descripcion_Enabled ;
   private int edtRolP_UsuarioCrea_Enabled ;
   private int edtRolP_UsuarioModifica_Enabled ;
   private int edtRolP_FechaCrea_Enabled ;
   private int edtRolP_FechaModifica_Enabled ;
   private int subGridseg_rolypantalla_pant_Selectioncolor ;
   private int subGridseg_rolypantalla_pant_Hoveringcolor ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridseg_rolypantalla_pant_Backcolor ;
   private int subGridseg_rolypantalla_pant_Allbackcolor ;
   private int imgprompt_18_Visible ;
   private int defedtRolP_FechaModifica_Enabled ;
   private int defedtRolP_FechaCrea_Enabled ;
   private int defedtRolP_UsuarioModifica_Enabled ;
   private int defedtRolP_UsuarioCrea_Enabled ;
   private int defedtModu_Id_Enabled ;
   private int defedtPant_Id_Enabled ;
   private int idxLst ;
   private long wcpOAV9Rol_Id ;
   private long Z21Rol_Id ;
   private long A16Modu_Id ;
   private long AV9Rol_Id ;
   private long A21Rol_Id ;
   private long GRIDSEG_ROLYPANTALLA_PANT_nFirstRecordOnPage ;
   private long Z16Modu_Id ;
   private String sPrefix ;
   private String sGXsfl_46_idx="0001" ;
   private String wcpOGx_mode ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
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
   private String edtRol_Id_Internalname ;
   private String edtRol_Id_Jsonclick ;
   private String edtRol_Descripcion_Internalname ;
   private String edtRol_Descripcion_Jsonclick ;
   private String divPanttable_Internalname ;
   private String lblTitlepant_Internalname ;
   private String lblTitlepant_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode26 ;
   private String edtPant_Id_Internalname ;
   private String edtPant_Descripcion_Internalname ;
   private String edtModu_Id_Internalname ;
   private String edtModu_Descripcion_Internalname ;
   private String edtRolP_UsuarioCrea_Internalname ;
   private String edtRolP_UsuarioModifica_Internalname ;
   private String edtRolP_FechaCrea_Internalname ;
   private String edtRolP_FechaModifica_Internalname ;
   private String imgprompt_18_Link ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode27 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String imgprompt_18_Internalname ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGridseg_rolypantalla_pant_Class ;
   private String subGridseg_rolypantalla_pant_Linesclass ;
   private String ROClassString ;
   private String edtPant_Id_Jsonclick ;
   private String sImgUrl ;
   private String edtPant_Descripcion_Jsonclick ;
   private String edtModu_Id_Jsonclick ;
   private String edtModu_Descripcion_Jsonclick ;
   private String edtRolP_UsuarioCrea_Jsonclick ;
   private String edtRolP_UsuarioModifica_Jsonclick ;
   private String edtRolP_FechaCrea_Jsonclick ;
   private String edtRolP_FechaModifica_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridseg_rolypantalla_pant_Internalname ;
   private java.util.Date Z216RolP_FechaCrea ;
   private java.util.Date Z218RolP_FechaModifica ;
   private java.util.Date A216RolP_FechaCrea ;
   private java.util.Date A218RolP_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean returnInSub ;
   private String Z22Rol_Descripcion ;
   private String Z215RolP_UsuarioCrea ;
   private String Z217RolP_UsuarioModifica ;
   private String A22Rol_Descripcion ;
   private String A19Pant_Descripcion ;
   private String A17Modu_Descripcion ;
   private String A215RolP_UsuarioCrea ;
   private String A217RolP_UsuarioModifica ;
   private String AV12Usuario ;
   private String Z19Pant_Descripcion ;
   private String Z17Modu_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Gridseg_rolypantalla_pantContainer ;
   private com.genexus.webpanels.GXWebRow Gridseg_rolypantalla_pantRow ;
   private com.genexus.webpanels.GXWebColumn Gridseg_rolypantalla_pantColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000O8_A21Rol_Id ;
   private String[] T000O8_A22Rol_Descripcion ;
   private long[] T000O9_A21Rol_Id ;
   private long[] T000O7_A21Rol_Id ;
   private String[] T000O7_A22Rol_Descripcion ;
   private long[] T000O10_A21Rol_Id ;
   private long[] T000O11_A21Rol_Id ;
   private long[] T000O6_A21Rol_Id ;
   private String[] T000O6_A22Rol_Descripcion ;
   private long[] T000O13_A21Rol_Id ;
   private int[] T000O16_A104TNov_Codigo ;
   private long[] T000O16_A105TNov_Rol_Id ;
   private long[] T000O17_A23Usua_Id ;
   private long[] T000O17_A21Rol_Id ;
   private long[] T000O18_A21Rol_Id ;
   private long[] T000O19_A21Rol_Id ;
   private String[] T000O19_A215RolP_UsuarioCrea ;
   private String[] T000O19_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000O19_A216RolP_FechaCrea ;
   private java.util.Date[] T000O19_A218RolP_FechaModifica ;
   private String[] T000O19_A19Pant_Descripcion ;
   private String[] T000O19_A17Modu_Descripcion ;
   private int[] T000O19_A18Pant_Id ;
   private long[] T000O19_A16Modu_Id ;
   private String[] T000O4_A19Pant_Descripcion ;
   private long[] T000O4_A16Modu_Id ;
   private String[] T000O5_A17Modu_Descripcion ;
   private String[] T000O20_A19Pant_Descripcion ;
   private long[] T000O20_A16Modu_Id ;
   private String[] T000O21_A17Modu_Descripcion ;
   private long[] T000O22_A21Rol_Id ;
   private int[] T000O22_A18Pant_Id ;
   private long[] T000O3_A21Rol_Id ;
   private String[] T000O3_A215RolP_UsuarioCrea ;
   private String[] T000O3_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000O3_A216RolP_FechaCrea ;
   private java.util.Date[] T000O3_A218RolP_FechaModifica ;
   private int[] T000O3_A18Pant_Id ;
   private long[] T000O2_A21Rol_Id ;
   private String[] T000O2_A215RolP_UsuarioCrea ;
   private String[] T000O2_A217RolP_UsuarioModifica ;
   private java.util.Date[] T000O2_A216RolP_FechaCrea ;
   private java.util.Date[] T000O2_A218RolP_FechaModifica ;
   private int[] T000O2_A18Pant_Id ;
   private String[] T000O26_A19Pant_Descripcion ;
   private long[] T000O26_A16Modu_Id ;
   private String[] T000O27_A17Modu_Descripcion ;
   private long[] T000O28_A21Rol_Id ;
   private int[] T000O28_A18Pant_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class seg_rolypantalla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000O2", "SELECT Rol_Id, RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ?  FOR UPDATE OF RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O3", "SELECT Rol_Id, RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O4", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O5", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O6", "SELECT Rol_Id, Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ?  FOR UPDATE OF Rol_Descripcion NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O7", "SELECT Rol_Id, Rol_Descripcion FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Rol_Id, TM1.Rol_Descripcion FROM SEG_ROL TM1 WHERE TM1.Rol_Id = ? ORDER BY TM1.Rol_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000O9", "SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE Rol_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE ( Rol_Id > ?) ORDER BY Rol_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rol_Id FROM SEG_ROL WHERE ( Rol_Id < ?) ORDER BY Rol_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000O12", "INSERT INTO SEG_ROL(Rol_Descripcion, Rol_Tipo, Rol_UsuarioCrea, Rol_FechaCrea, Rol_UsuarioModifica, Rol_FechaModifica) VALUES(?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "SEG_ROL")
         ,new ForEachCursor("T000O13", "SELECT Rol_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000O14", "UPDATE SEG_ROL SET Rol_Descripcion=?  WHERE Rol_Id = ?", GX_NOMASK, "SEG_ROL")
         ,new UpdateCursor("T000O15", "DELETE FROM SEG_ROL  WHERE Rol_Id = ?", GX_NOMASK, "SEG_ROL")
         ,new ForEachCursor("T000O16", "SELECT * FROM (SELECT TNov_Codigo, TNov_Rol_Id FROM ALM_TIPO_NOVEDADROLES WHERE TNov_Rol_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O17", "SELECT * FROM (SELECT Usua_Id, Rol_Id FROM SEG_USUARIO_ROL WHERE Rol_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O18", "SELECT /*+ FIRST_ROWS(100) */ Rol_Id FROM SEG_ROL ORDER BY Rol_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000O19", "SELECT T1.Rol_Id, T1.RolP_UsuarioCrea, T1.RolP_UsuarioModifica, T1.RolP_FechaCrea, T1.RolP_FechaModifica, T2.Pant_Descripcion, T3.Modu_Descripcion, T1.Pant_Id, T2.Modu_Id FROM ((SEG_ROL_PANTALLA T1 INNER JOIN SEG_PANTALLA T2 ON T2.Pant_Id = T1.Pant_Id) INNER JOIN SEG_MODULO_MENU T3 ON T3.Modu_Id = T2.Modu_Id) WHERE T1.Rol_Id = ? and T1.Pant_Id = ? ORDER BY T1.Rol_Id, T1.Pant_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000O20", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O21", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O22", "SELECT Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? AND Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000O23", "INSERT INTO SEG_ROL_PANTALLA(Rol_Id, RolP_UsuarioCrea, RolP_UsuarioModifica, RolP_FechaCrea, RolP_FechaModifica, Pant_Id) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new UpdateCursor("T000O24", "UPDATE SEG_ROL_PANTALLA SET RolP_UsuarioCrea=?, RolP_UsuarioModifica=?, RolP_FechaCrea=?, RolP_FechaModifica=?  WHERE Rol_Id = ? AND Pant_Id = ?", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new UpdateCursor("T000O25", "DELETE FROM SEG_ROL_PANTALLA  WHERE Rol_Id = ? AND Pant_Id = ?", GX_NOMASK, "SEG_ROL_PANTALLA")
         ,new ForEachCursor("T000O26", "SELECT Pant_Descripcion, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O27", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O28", "SELECT Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Rol_Id = ? ORDER BY Rol_Id, Pant_Id ",true, GX_NOMASK, false, this,11,0,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((long[]) buf[8])[0] = rslt.getLong(9) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 26 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

