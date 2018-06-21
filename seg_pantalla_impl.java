/*
               File: seg_pantalla_impl
        Description: Pantalla
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:58.24
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

public final  class seg_pantalla_impl extends GXDataArea
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
         A16Modu_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A16Modu_Id) ;
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
            AV8Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Pant_Id", GXutil.ltrim( GXutil.str( AV8Pant_Id, 6, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPANT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Pant_Id), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", "Pantalla", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtPant_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public seg_pantalla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seg_pantalla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seg_pantalla_impl.class ));
   }

   public seg_pantalla_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Pantalla", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Id_Internalname, "Identificador Pantalla", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A18Pant_Id, (byte)(6), (byte)(0), ",", "")), ((edtPant_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A18Pant_Id), "ZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_Id_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Codigo", "right", false, "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Descripcion_Internalname, "Descripción Pantalla", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Descripcion_Internalname, A19Pant_Descripcion, GXutil.rtrim( localUtil.format( A19Pant_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_NombreInterno_Internalname, "Nombre Interno", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_NombreInterno_Internalname, GXutil.rtrim( A203Pant_NombreInterno), GXutil.rtrim( localUtil.format( A203Pant_NombreInterno, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_NombreInterno_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_NombreInterno_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Id_Internalname, "Identificador Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16Modu_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtModu_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_SEG_PANTALLA.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_16_Internalname, sImgUrl, imgprompt_16_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_16_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtModu_Descripcion_Internalname, "Descripción Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtModu_Descripcion_Internalname, A17Modu_Descripcion, GXutil.rtrim( localUtil.format( A17Modu_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtModu_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtModu_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_SEG_PANTALLA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPant_Orden_Internalname, "Orden en el Menú", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPant_Orden_Internalname, GXutil.ltrim( localUtil.ntoc( A697Pant_Orden, (byte)(4), (byte)(0), ",", "")), ((edtPant_Orden_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A697Pant_Orden), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPant_Orden_Jsonclick, 0, "Attribute", "", "", "", 1, edtPant_Orden_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEG_PANTALLA.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEG_PANTALLA.htm");
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
      e110M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtPant_Id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            A19Pant_Descripcion = httpContext.cgiGet( edtPant_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
            A203Pant_NombreInterno = httpContext.cgiGet( edtPant_NombreInterno_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MODU_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtModu_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A16Modu_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            }
            else
            {
               A16Modu_Id = localUtil.ctol( httpContext.cgiGet( edtModu_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
            }
            A17Modu_Descripcion = httpContext.cgiGet( edtModu_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Orden_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPant_Orden_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PANT_ORDEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPant_Orden_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A697Pant_Orden = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
            }
            else
            {
               A697Pant_Orden = (short)(localUtil.ctol( httpContext.cgiGet( edtPant_Orden_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
            }
            /* Read saved values. */
            Z18Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( "Z18Pant_Id"), ",", ".")) ;
            Z199Pant_UsuarioCrea = httpContext.cgiGet( "Z199Pant_UsuarioCrea") ;
            Z201Pant_UsuarioModifica = httpContext.cgiGet( "Z201Pant_UsuarioModifica") ;
            n201Pant_UsuarioModifica = ((GXutil.strcmp("", A201Pant_UsuarioModifica)==0) ? true : false) ;
            Z200Pant_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z200Pant_FechaCrea"), 0) ;
            Z202Pant_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z202Pant_FechaModifica"), 0) ;
            n202Pant_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A202Pant_FechaModifica) ? true : false) ;
            Z19Pant_Descripcion = httpContext.cgiGet( "Z19Pant_Descripcion") ;
            Z203Pant_NombreInterno = httpContext.cgiGet( "Z203Pant_NombreInterno") ;
            Z697Pant_Orden = (short)(localUtil.ctol( httpContext.cgiGet( "Z697Pant_Orden"), ",", ".")) ;
            Z16Modu_Id = localUtil.ctol( httpContext.cgiGet( "Z16Modu_Id"), ",", ".") ;
            A199Pant_UsuarioCrea = httpContext.cgiGet( "Z199Pant_UsuarioCrea") ;
            A201Pant_UsuarioModifica = httpContext.cgiGet( "Z201Pant_UsuarioModifica") ;
            n201Pant_UsuarioModifica = false ;
            n201Pant_UsuarioModifica = ((GXutil.strcmp("", A201Pant_UsuarioModifica)==0) ? true : false) ;
            A200Pant_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z200Pant_FechaCrea"), 0) ;
            A202Pant_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z202Pant_FechaModifica"), 0) ;
            n202Pant_FechaModifica = false ;
            n202Pant_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A202Pant_FechaModifica) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N16Modu_Id = localUtil.ctol( httpContext.cgiGet( "N16Modu_Id"), ",", ".") ;
            AV8Pant_Id = (int)(localUtil.ctol( httpContext.cgiGet( "vPANT_ID"), ",", ".")) ;
            AV7Insert_Modu_Id = localUtil.ctol( httpContext.cgiGet( "vINSERT_MODU_ID"), ",", ".") ;
            AV12Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A199Pant_UsuarioCrea = httpContext.cgiGet( "PANT_USUARIOCREA") ;
            A201Pant_UsuarioModifica = httpContext.cgiGet( "PANT_USUARIOMODIFICA") ;
            n201Pant_UsuarioModifica = ((GXutil.strcmp("", A201Pant_UsuarioModifica)==0) ? true : false) ;
            A200Pant_FechaCrea = localUtil.ctot( httpContext.cgiGet( "PANT_FECHACREA"), 0) ;
            A202Pant_FechaModifica = localUtil.ctot( httpContext.cgiGet( "PANT_FECHAMODIFICA"), 0) ;
            n202Pant_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A202Pant_FechaModifica) ? true : false) ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "SEG_PANTALLA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A18Pant_Id != Z18Pant_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("seg_pantalla:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A18Pant_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
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
                  sMode25 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode25 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound25 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0M0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PANT_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPant_Id_Internalname ;
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
                        e110M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120M2 ();
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
         e120M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0M25( ) ;
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
         disableAttributes0M25( ) ;
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

   public void confirm_0M0( )
   {
      beforeValidate0M25( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0M25( ) ;
         }
         else
         {
            checkExtendedTable0M25( ) ;
            closeExtendedTableCursors0M25( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption0M0( )
   {
   }

   public void e110M2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV15Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV15Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV7Insert_Modu_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Insert_Modu_Id", GXutil.ltrim( GXutil.str( AV7Insert_Modu_Id, 11, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV15Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV16GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         while ( AV16GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV10TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV16GXV1));
            if ( GXutil.strcmp(AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Modu_Id") == 0 )
            {
               AV7Insert_Modu_Id = GXutil.lval( AV10TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Insert_Modu_Id", GXutil.ltrim( GXutil.str( AV7Insert_Modu_Id, 11, 0)));
            }
            AV16GXV1 = (int)(AV16GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16GXV1", GXutil.ltrim( GXutil.str( AV16GXV1, 8, 0)));
         }
      }
      AV12Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Usuario", AV12Usuario);
   }

   public void e120M2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwseg_pantalla") );
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

   public void zm0M25( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z199Pant_UsuarioCrea = T000M3_A199Pant_UsuarioCrea[0] ;
            Z201Pant_UsuarioModifica = T000M3_A201Pant_UsuarioModifica[0] ;
            Z200Pant_FechaCrea = T000M3_A200Pant_FechaCrea[0] ;
            Z202Pant_FechaModifica = T000M3_A202Pant_FechaModifica[0] ;
            Z19Pant_Descripcion = T000M3_A19Pant_Descripcion[0] ;
            Z203Pant_NombreInterno = T000M3_A203Pant_NombreInterno[0] ;
            Z697Pant_Orden = T000M3_A697Pant_Orden[0] ;
            Z16Modu_Id = T000M3_A16Modu_Id[0] ;
         }
         else
         {
            Z199Pant_UsuarioCrea = A199Pant_UsuarioCrea ;
            Z201Pant_UsuarioModifica = A201Pant_UsuarioModifica ;
            Z200Pant_FechaCrea = A200Pant_FechaCrea ;
            Z202Pant_FechaModifica = A202Pant_FechaModifica ;
            Z19Pant_Descripcion = A19Pant_Descripcion ;
            Z203Pant_NombreInterno = A203Pant_NombreInterno ;
            Z697Pant_Orden = A697Pant_Orden ;
            Z16Modu_Id = A16Modu_Id ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z18Pant_Id = A18Pant_Id ;
         Z199Pant_UsuarioCrea = A199Pant_UsuarioCrea ;
         Z201Pant_UsuarioModifica = A201Pant_UsuarioModifica ;
         Z200Pant_FechaCrea = A200Pant_FechaCrea ;
         Z202Pant_FechaModifica = A202Pant_FechaModifica ;
         Z19Pant_Descripcion = A19Pant_Descripcion ;
         Z203Pant_NombreInterno = A203Pant_NombreInterno ;
         Z697Pant_Orden = A697Pant_Orden ;
         Z16Modu_Id = A16Modu_Id ;
         Z17Modu_Descripcion = A17Modu_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPant_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      imgprompt_16_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00o0"+"',["+"{Ctrl:gx.dom.el('"+"MODU_ID"+"'), id:'"+"MODU_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtPant_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV8Pant_Id) )
      {
         A18Pant_Id = AV8Pant_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV7Insert_Modu_Id) )
      {
         edtModu_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtModu_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV7Insert_Modu_Id) )
      {
         A16Modu_Id = AV7Insert_Modu_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
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
         AV15Pgmname = "SEG_PANTALLA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000M4 */
         pr_default.execute(2, new Object[] {new Long(A16Modu_Id)});
         A17Modu_Descripcion = T000M4_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         pr_default.close(2);
      }
   }

   public void load0M25( )
   {
      /* Using cursor T000M5 */
      pr_default.execute(3, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A199Pant_UsuarioCrea = T000M5_A199Pant_UsuarioCrea[0] ;
         A201Pant_UsuarioModifica = T000M5_A201Pant_UsuarioModifica[0] ;
         n201Pant_UsuarioModifica = T000M5_n201Pant_UsuarioModifica[0] ;
         A200Pant_FechaCrea = T000M5_A200Pant_FechaCrea[0] ;
         A202Pant_FechaModifica = T000M5_A202Pant_FechaModifica[0] ;
         n202Pant_FechaModifica = T000M5_n202Pant_FechaModifica[0] ;
         A19Pant_Descripcion = T000M5_A19Pant_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A203Pant_NombreInterno = T000M5_A203Pant_NombreInterno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
         A17Modu_Descripcion = T000M5_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         A697Pant_Orden = T000M5_A697Pant_Orden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
         A16Modu_Id = T000M5_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         zm0M25( -14) ;
      }
      pr_default.close(3);
      onLoadActions0M25( ) ;
   }

   public void onLoadActions0M25( )
   {
      AV15Pgmname = "SEG_PANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void checkExtendedTable0M25( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV15Pgmname = "SEG_PANTALLA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      if ( ( GXutil.strcmp(A19Pant_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción de la pantalla", 1, "PANT_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000M4 */
      pr_default.execute(2, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "MODU_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A17Modu_Descripcion = T000M4_A17Modu_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0M25( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( long A16Modu_Id )
   {
      /* Using cursor T000M6 */
      pr_default.execute(4, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "MODU_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A17Modu_Descripcion = T000M6_A17Modu_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A17Modu_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey0M25( )
   {
      /* Using cursor T000M7 */
      pr_default.execute(5, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound25 = (short)(1) ;
      }
      else
      {
         RcdFound25 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000M3 */
      pr_default.execute(1, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0M25( 14) ;
         RcdFound25 = (short)(1) ;
         A18Pant_Id = T000M3_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
         A199Pant_UsuarioCrea = T000M3_A199Pant_UsuarioCrea[0] ;
         A201Pant_UsuarioModifica = T000M3_A201Pant_UsuarioModifica[0] ;
         n201Pant_UsuarioModifica = T000M3_n201Pant_UsuarioModifica[0] ;
         A200Pant_FechaCrea = T000M3_A200Pant_FechaCrea[0] ;
         A202Pant_FechaModifica = T000M3_A202Pant_FechaModifica[0] ;
         n202Pant_FechaModifica = T000M3_n202Pant_FechaModifica[0] ;
         A19Pant_Descripcion = T000M3_A19Pant_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
         A203Pant_NombreInterno = T000M3_A203Pant_NombreInterno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
         A697Pant_Orden = T000M3_A697Pant_Orden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
         A16Modu_Id = T000M3_A16Modu_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
         Z18Pant_Id = A18Pant_Id ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0M25( ) ;
         if ( AnyError == 1 )
         {
            RcdFound25 = (short)(0) ;
            initializeNonKey0M25( ) ;
         }
         Gx_mode = sMode25 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound25 = (short)(0) ;
         initializeNonKey0M25( ) ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode25 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0M25( ) ;
      if ( RcdFound25 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound25 = (short)(0) ;
      /* Using cursor T000M8 */
      pr_default.execute(6, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000M8_A18Pant_Id[0] < A18Pant_Id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000M8_A18Pant_Id[0] > A18Pant_Id ) ) )
         {
            A18Pant_Id = T000M8_A18Pant_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            RcdFound25 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound25 = (short)(0) ;
      /* Using cursor T000M9 */
      pr_default.execute(7, new Object[] {new Integer(A18Pant_Id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000M9_A18Pant_Id[0] > A18Pant_Id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000M9_A18Pant_Id[0] < A18Pant_Id ) ) )
         {
            A18Pant_Id = T000M9_A18Pant_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
            RcdFound25 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0M25( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtPant_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0M25( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound25 == 1 )
         {
            if ( A18Pant_Id != Z18Pant_Id )
            {
               A18Pant_Id = Z18Pant_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PANT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPant_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPant_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0M25( ) ;
               GX_FocusControl = edtPant_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A18Pant_Id != Z18Pant_Id )
            {
               /* Insert record */
               GX_FocusControl = edtPant_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0M25( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PANT_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPant_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPant_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0M25( ) ;
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
      if ( A18Pant_Id != Z18Pant_Id )
      {
         A18Pant_Id = Z18Pant_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PANT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPant_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPant_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0M25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000M2 */
         pr_default.execute(0, new Object[] {new Integer(A18Pant_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_PANTALLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z199Pant_UsuarioCrea, T000M2_A199Pant_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z201Pant_UsuarioModifica, T000M2_A201Pant_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z200Pant_FechaCrea, T000M2_A200Pant_FechaCrea[0]) ) || !( GXutil.dateCompare(Z202Pant_FechaModifica, T000M2_A202Pant_FechaModifica[0]) ) || ( GXutil.strcmp(Z19Pant_Descripcion, T000M2_A19Pant_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z203Pant_NombreInterno, T000M2_A203Pant_NombreInterno[0]) != 0 ) || ( Z697Pant_Orden != T000M2_A697Pant_Orden[0] ) || ( Z16Modu_Id != T000M2_A16Modu_Id[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"SEG_PANTALLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0M25( )
   {
      beforeValidate0M25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M25( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0M25( 0) ;
         checkOptimisticConcurrency0M25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M25( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0M25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M10 */
                  pr_default.execute(8, new Object[] {A199Pant_UsuarioCrea, new Boolean(n201Pant_UsuarioModifica), A201Pant_UsuarioModifica, A200Pant_FechaCrea, new Boolean(n202Pant_FechaModifica), A202Pant_FechaModifica, A19Pant_Descripcion, A203Pant_NombreInterno, new Short(A697Pant_Orden), new Long(A16Modu_Id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000M11 */
                  pr_default.execute(9);
                  A18Pant_Id = T000M11_A18Pant_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PANTALLA") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption0M0( ) ;
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
            load0M25( ) ;
         }
         endLevel0M25( ) ;
      }
      closeExtendedTableCursors0M25( ) ;
   }

   public void update0M25( )
   {
      beforeValidate0M25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M25( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M25( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0M25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M12 */
                  pr_default.execute(10, new Object[] {A199Pant_UsuarioCrea, new Boolean(n201Pant_UsuarioModifica), A201Pant_UsuarioModifica, A200Pant_FechaCrea, new Boolean(n202Pant_FechaModifica), A202Pant_FechaModifica, A19Pant_Descripcion, A203Pant_NombreInterno, new Short(A697Pant_Orden), new Long(A16Modu_Id), new Integer(A18Pant_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PANTALLA") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"SEG_PANTALLA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0M25( ) ;
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
         endLevel0M25( ) ;
      }
      closeExtendedTableCursors0M25( ) ;
   }

   public void deferredUpdate0M25( )
   {
   }

   public void delete( )
   {
      beforeValidate0M25( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M25( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0M25( ) ;
         afterConfirm0M25( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0M25( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000M13 */
               pr_default.execute(11, new Object[] {new Integer(A18Pant_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_PANTALLA") ;
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
      sMode25 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0M25( ) ;
      Gx_mode = sMode25 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0M25( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "SEG_PANTALLA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         /* Using cursor T000M14 */
         pr_default.execute(12, new Object[] {new Long(A16Modu_Id)});
         A17Modu_Descripcion = T000M14_A17Modu_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000M15 */
         pr_default.execute(13, new Object[] {new Integer(A18Pant_Id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ROL Y PANTALLAS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel0M25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0M25( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "seg_pantalla");
         if ( AnyError == 0 )
         {
            confirmValues0M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "seg_pantalla");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0M25( )
   {
      /* Scan By routine */
      /* Using cursor T000M16 */
      pr_default.execute(14);
      RcdFound25 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A18Pant_Id = T000M16_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0M25( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound25 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A18Pant_Id = T000M16_A18Pant_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      }
   }

   public void scanEnd0M25( )
   {
      pr_default.close(14);
   }

   public void afterConfirm0M25( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A200Pant_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A200Pant_FechaCrea", localUtil.ttoc( A200Pant_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A202Pant_FechaModifica = GXutil.now( ) ;
         n202Pant_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A202Pant_FechaModifica", localUtil.ttoc( A202Pant_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A199Pant_UsuarioCrea = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A199Pant_UsuarioCrea", A199Pant_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A201Pant_UsuarioModifica = AV12Usuario ;
         n201Pant_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A201Pant_UsuarioModifica", A201Pant_UsuarioModifica);
      }
      if ( ( A16Modu_Id == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe seleccionar el módulo al que pertenece la pantalla", 1, "MODU_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert0M25( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0M25( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0M25( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0M25( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0M25( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0M25( )
   {
      edtPant_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Id_Enabled, 5, 0)), true);
      edtPant_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Descripcion_Enabled, 5, 0)), true);
      edtPant_NombreInterno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_NombreInterno_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_NombreInterno_Enabled, 5, 0)), true);
      edtModu_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Id_Enabled, 5, 0)), true);
      edtModu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtModu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtModu_Descripcion_Enabled, 5, 0)), true);
      edtPant_Orden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPant_Orden_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPant_Orden_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0M0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414155932");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.seg_pantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Pant_Id,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z18Pant_Id", GXutil.ltrim( localUtil.ntoc( Z18Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z199Pant_UsuarioCrea", Z199Pant_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z201Pant_UsuarioModifica", Z201Pant_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z200Pant_FechaCrea", localUtil.ttoc( Z200Pant_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z202Pant_FechaModifica", localUtil.ttoc( Z202Pant_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z19Pant_Descripcion", Z19Pant_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z203Pant_NombreInterno", GXutil.rtrim( Z203Pant_NombreInterno));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z697Pant_Orden", GXutil.ltrim( localUtil.ntoc( Z697Pant_Orden, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z16Modu_Id", GXutil.ltrim( localUtil.ntoc( Z16Modu_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N16Modu_Id", GXutil.ltrim( localUtil.ntoc( A16Modu_Id, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPANT_ID", GXutil.ltrim( localUtil.ntoc( AV8Pant_Id, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MODU_ID", GXutil.ltrim( localUtil.ntoc( AV7Insert_Modu_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV12Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_USUARIOCREA", A199Pant_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_USUARIOMODIFICA", A201Pant_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_FECHACREA", localUtil.ttoc( A200Pant_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PANT_FECHAMODIFICA", localUtil.ttoc( A202Pant_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPANT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Pant_Id), "ZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "SEG_PANTALLA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("seg_pantalla:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.seg_pantalla") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Pant_Id,6,0))) ;
   }

   public String getPgmname( )
   {
      return "SEG_PANTALLA" ;
   }

   public String getPgmdesc( )
   {
      return "Pantalla" ;
   }

   public void initializeNonKey0M25( )
   {
      A16Modu_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A16Modu_Id", GXutil.ltrim( GXutil.str( A16Modu_Id, 11, 0)));
      A199Pant_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A199Pant_UsuarioCrea", A199Pant_UsuarioCrea);
      A201Pant_UsuarioModifica = "" ;
      n201Pant_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A201Pant_UsuarioModifica", A201Pant_UsuarioModifica);
      A200Pant_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A200Pant_FechaCrea", localUtil.ttoc( A200Pant_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A202Pant_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n202Pant_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A202Pant_FechaModifica", localUtil.ttoc( A202Pant_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A19Pant_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A19Pant_Descripcion", A19Pant_Descripcion);
      A203Pant_NombreInterno = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A203Pant_NombreInterno", A203Pant_NombreInterno);
      A17Modu_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A17Modu_Descripcion", A17Modu_Descripcion);
      A697Pant_Orden = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A697Pant_Orden", GXutil.ltrim( GXutil.str( A697Pant_Orden, 4, 0)));
      Z199Pant_UsuarioCrea = "" ;
      Z201Pant_UsuarioModifica = "" ;
      Z200Pant_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z202Pant_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z19Pant_Descripcion = "" ;
      Z203Pant_NombreInterno = "" ;
      Z697Pant_Orden = (short)(0) ;
      Z16Modu_Id = 0 ;
   }

   public void initAll0M25( )
   {
      A18Pant_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A18Pant_Id", GXutil.ltrim( GXutil.str( A18Pant_Id, 6, 0)));
      initializeNonKey0M25( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414155940");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("seg_pantalla.js", "?201861414155940");
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
      edtPant_Id_Internalname = "PANT_ID" ;
      edtPant_Descripcion_Internalname = "PANT_DESCRIPCION" ;
      edtPant_NombreInterno_Internalname = "PANT_NOMBREINTERNO" ;
      edtModu_Id_Internalname = "MODU_ID" ;
      edtModu_Descripcion_Internalname = "MODU_DESCRIPCION" ;
      edtPant_Orden_Internalname = "PANT_ORDEN" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_16_Internalname = "PROMPT_16" ;
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
      Form.setCaption( "Pantalla" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPant_Orden_Jsonclick = "" ;
      edtPant_Orden_Enabled = 1 ;
      edtModu_Descripcion_Jsonclick = "" ;
      edtModu_Descripcion_Enabled = 0 ;
      imgprompt_16_Visible = 1 ;
      imgprompt_16_Link = "" ;
      edtModu_Id_Jsonclick = "" ;
      edtModu_Id_Enabled = 1 ;
      edtPant_NombreInterno_Jsonclick = "" ;
      edtPant_NombreInterno_Enabled = 1 ;
      edtPant_Descripcion_Jsonclick = "" ;
      edtPant_Descripcion_Enabled = 1 ;
      edtPant_Id_Jsonclick = "" ;
      edtPant_Id_Enabled = 0 ;
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

   public void valid_Modu_id( long GX_Parm1 ,
                              String GX_Parm2 )
   {
      A16Modu_Id = GX_Parm1 ;
      A17Modu_Descripcion = GX_Parm2 ;
      /* Using cursor T000M14 */
      pr_default.execute(12, new Object[] {new Long(A16Modu_Id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'MODULO'.", "ForeignKeyNotFound", 1, "MODU_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtModu_Id_Internalname ;
      }
      A17Modu_Descripcion = T000M14_A17Modu_Descripcion[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A17Modu_Descripcion = "" ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV8Pant_Id',fld:'vPANT_ID',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120M2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z199Pant_UsuarioCrea = "" ;
      Z201Pant_UsuarioModifica = "" ;
      Z200Pant_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z202Pant_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z19Pant_Descripcion = "" ;
      Z203Pant_NombreInterno = "" ;
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
      A19Pant_Descripcion = "" ;
      A203Pant_NombreInterno = "" ;
      sImgUrl = "" ;
      A17Modu_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A201Pant_UsuarioModifica = "" ;
      A202Pant_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A199Pant_UsuarioCrea = "" ;
      A200Pant_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV12Usuario = "" ;
      AV15Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode25 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV10TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z17Modu_Descripcion = "" ;
      T000M4_A17Modu_Descripcion = new String[] {""} ;
      T000M5_A18Pant_Id = new int[1] ;
      T000M5_A199Pant_UsuarioCrea = new String[] {""} ;
      T000M5_A201Pant_UsuarioModifica = new String[] {""} ;
      T000M5_n201Pant_UsuarioModifica = new boolean[] {false} ;
      T000M5_A200Pant_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000M5_A202Pant_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000M5_n202Pant_FechaModifica = new boolean[] {false} ;
      T000M5_A19Pant_Descripcion = new String[] {""} ;
      T000M5_A203Pant_NombreInterno = new String[] {""} ;
      T000M5_A17Modu_Descripcion = new String[] {""} ;
      T000M5_A697Pant_Orden = new short[1] ;
      T000M5_A16Modu_Id = new long[1] ;
      T000M6_A17Modu_Descripcion = new String[] {""} ;
      T000M7_A18Pant_Id = new int[1] ;
      T000M3_A18Pant_Id = new int[1] ;
      T000M3_A199Pant_UsuarioCrea = new String[] {""} ;
      T000M3_A201Pant_UsuarioModifica = new String[] {""} ;
      T000M3_n201Pant_UsuarioModifica = new boolean[] {false} ;
      T000M3_A200Pant_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000M3_A202Pant_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000M3_n202Pant_FechaModifica = new boolean[] {false} ;
      T000M3_A19Pant_Descripcion = new String[] {""} ;
      T000M3_A203Pant_NombreInterno = new String[] {""} ;
      T000M3_A697Pant_Orden = new short[1] ;
      T000M3_A16Modu_Id = new long[1] ;
      T000M8_A18Pant_Id = new int[1] ;
      T000M9_A18Pant_Id = new int[1] ;
      T000M2_A18Pant_Id = new int[1] ;
      T000M2_A199Pant_UsuarioCrea = new String[] {""} ;
      T000M2_A201Pant_UsuarioModifica = new String[] {""} ;
      T000M2_n201Pant_UsuarioModifica = new boolean[] {false} ;
      T000M2_A200Pant_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000M2_A202Pant_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000M2_n202Pant_FechaModifica = new boolean[] {false} ;
      T000M2_A19Pant_Descripcion = new String[] {""} ;
      T000M2_A203Pant_NombreInterno = new String[] {""} ;
      T000M2_A697Pant_Orden = new short[1] ;
      T000M2_A16Modu_Id = new long[1] ;
      T000M11_A18Pant_Id = new int[1] ;
      T000M14_A17Modu_Descripcion = new String[] {""} ;
      T000M15_A21Rol_Id = new long[1] ;
      T000M15_A18Pant_Id = new int[1] ;
      T000M16_A18Pant_Id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.seg_pantalla__default(),
         new Object[] {
             new Object[] {
            T000M2_A18Pant_Id, T000M2_A199Pant_UsuarioCrea, T000M2_A201Pant_UsuarioModifica, T000M2_n201Pant_UsuarioModifica, T000M2_A200Pant_FechaCrea, T000M2_A202Pant_FechaModifica, T000M2_n202Pant_FechaModifica, T000M2_A19Pant_Descripcion, T000M2_A203Pant_NombreInterno, T000M2_A697Pant_Orden,
            T000M2_A16Modu_Id
            }
            , new Object[] {
            T000M3_A18Pant_Id, T000M3_A199Pant_UsuarioCrea, T000M3_A201Pant_UsuarioModifica, T000M3_n201Pant_UsuarioModifica, T000M3_A200Pant_FechaCrea, T000M3_A202Pant_FechaModifica, T000M3_n202Pant_FechaModifica, T000M3_A19Pant_Descripcion, T000M3_A203Pant_NombreInterno, T000M3_A697Pant_Orden,
            T000M3_A16Modu_Id
            }
            , new Object[] {
            T000M4_A17Modu_Descripcion
            }
            , new Object[] {
            T000M5_A18Pant_Id, T000M5_A199Pant_UsuarioCrea, T000M5_A201Pant_UsuarioModifica, T000M5_n201Pant_UsuarioModifica, T000M5_A200Pant_FechaCrea, T000M5_A202Pant_FechaModifica, T000M5_n202Pant_FechaModifica, T000M5_A19Pant_Descripcion, T000M5_A203Pant_NombreInterno, T000M5_A17Modu_Descripcion,
            T000M5_A697Pant_Orden, T000M5_A16Modu_Id
            }
            , new Object[] {
            T000M6_A17Modu_Descripcion
            }
            , new Object[] {
            T000M7_A18Pant_Id
            }
            , new Object[] {
            T000M8_A18Pant_Id
            }
            , new Object[] {
            T000M9_A18Pant_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000M11_A18Pant_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000M14_A17Modu_Descripcion
            }
            , new Object[] {
            T000M15_A21Rol_Id, T000M15_A18Pant_Id
            }
            , new Object[] {
            T000M16_A18Pant_Id
            }
         }
      );
      AV15Pgmname = "SEG_PANTALLA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z697Pant_Orden ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A697Pant_Orden ;
   private short RcdFound25 ;
   private int wcpOAV8Pant_Id ;
   private int Z18Pant_Id ;
   private int AV8Pant_Id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A18Pant_Id ;
   private int edtPant_Id_Enabled ;
   private int edtPant_Descripcion_Enabled ;
   private int edtPant_NombreInterno_Enabled ;
   private int edtModu_Id_Enabled ;
   private int imgprompt_16_Visible ;
   private int edtModu_Descripcion_Enabled ;
   private int edtPant_Orden_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int AV16GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private long Z16Modu_Id ;
   private long N16Modu_Id ;
   private long A16Modu_Id ;
   private long AV7Insert_Modu_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z203Pant_NombreInterno ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPant_Descripcion_Internalname ;
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
   private String edtPant_Id_Internalname ;
   private String edtPant_Id_Jsonclick ;
   private String edtPant_Descripcion_Jsonclick ;
   private String edtPant_NombreInterno_Internalname ;
   private String A203Pant_NombreInterno ;
   private String edtPant_NombreInterno_Jsonclick ;
   private String edtModu_Id_Internalname ;
   private String edtModu_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_16_Internalname ;
   private String imgprompt_16_Link ;
   private String edtModu_Descripcion_Internalname ;
   private String edtModu_Descripcion_Jsonclick ;
   private String edtPant_Orden_Internalname ;
   private String edtPant_Orden_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV15Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode25 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z200Pant_FechaCrea ;
   private java.util.Date Z202Pant_FechaModifica ;
   private java.util.Date A202Pant_FechaModifica ;
   private java.util.Date A200Pant_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n201Pant_UsuarioModifica ;
   private boolean n202Pant_FechaModifica ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z199Pant_UsuarioCrea ;
   private String Z201Pant_UsuarioModifica ;
   private String Z19Pant_Descripcion ;
   private String A19Pant_Descripcion ;
   private String A17Modu_Descripcion ;
   private String A201Pant_UsuarioModifica ;
   private String A199Pant_UsuarioCrea ;
   private String AV12Usuario ;
   private String Z17Modu_Descripcion ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000M4_A17Modu_Descripcion ;
   private int[] T000M5_A18Pant_Id ;
   private String[] T000M5_A199Pant_UsuarioCrea ;
   private String[] T000M5_A201Pant_UsuarioModifica ;
   private boolean[] T000M5_n201Pant_UsuarioModifica ;
   private java.util.Date[] T000M5_A200Pant_FechaCrea ;
   private java.util.Date[] T000M5_A202Pant_FechaModifica ;
   private boolean[] T000M5_n202Pant_FechaModifica ;
   private String[] T000M5_A19Pant_Descripcion ;
   private String[] T000M5_A203Pant_NombreInterno ;
   private String[] T000M5_A17Modu_Descripcion ;
   private short[] T000M5_A697Pant_Orden ;
   private long[] T000M5_A16Modu_Id ;
   private String[] T000M6_A17Modu_Descripcion ;
   private int[] T000M7_A18Pant_Id ;
   private int[] T000M3_A18Pant_Id ;
   private String[] T000M3_A199Pant_UsuarioCrea ;
   private String[] T000M3_A201Pant_UsuarioModifica ;
   private boolean[] T000M3_n201Pant_UsuarioModifica ;
   private java.util.Date[] T000M3_A200Pant_FechaCrea ;
   private java.util.Date[] T000M3_A202Pant_FechaModifica ;
   private boolean[] T000M3_n202Pant_FechaModifica ;
   private String[] T000M3_A19Pant_Descripcion ;
   private String[] T000M3_A203Pant_NombreInterno ;
   private short[] T000M3_A697Pant_Orden ;
   private long[] T000M3_A16Modu_Id ;
   private int[] T000M8_A18Pant_Id ;
   private int[] T000M9_A18Pant_Id ;
   private int[] T000M2_A18Pant_Id ;
   private String[] T000M2_A199Pant_UsuarioCrea ;
   private String[] T000M2_A201Pant_UsuarioModifica ;
   private boolean[] T000M2_n201Pant_UsuarioModifica ;
   private java.util.Date[] T000M2_A200Pant_FechaCrea ;
   private java.util.Date[] T000M2_A202Pant_FechaModifica ;
   private boolean[] T000M2_n202Pant_FechaModifica ;
   private String[] T000M2_A19Pant_Descripcion ;
   private String[] T000M2_A203Pant_NombreInterno ;
   private short[] T000M2_A697Pant_Orden ;
   private long[] T000M2_A16Modu_Id ;
   private int[] T000M11_A18Pant_Id ;
   private String[] T000M14_A17Modu_Descripcion ;
   private long[] T000M15_A21Rol_Id ;
   private int[] T000M15_A18Pant_Id ;
   private int[] T000M16_A18Pant_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV10TrnContextAtt ;
}

final  class seg_pantalla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000M2", "SELECT Pant_Id, Pant_UsuarioCrea, Pant_UsuarioModifica, Pant_FechaCrea, Pant_FechaModifica, Pant_Descripcion, Pant_NombreInterno, Pant_Orden, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ?  FOR UPDATE OF Pant_UsuarioCrea, Pant_UsuarioModifica, Pant_FechaCrea, Pant_FechaModifica, Pant_Descripcion, Pant_NombreInterno, Pant_Orden, Modu_Id NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M3", "SELECT Pant_Id, Pant_UsuarioCrea, Pant_UsuarioModifica, Pant_FechaCrea, Pant_FechaModifica, Pant_Descripcion, Pant_NombreInterno, Pant_Orden, Modu_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M4", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pant_Id, TM1.Pant_UsuarioCrea, TM1.Pant_UsuarioModifica, TM1.Pant_FechaCrea, TM1.Pant_FechaModifica, TM1.Pant_Descripcion, TM1.Pant_NombreInterno, T2.Modu_Descripcion, TM1.Pant_Orden, TM1.Modu_Id FROM (SEG_PANTALLA TM1 INNER JOIN SEG_MODULO_MENU T2 ON T2.Modu_Id = TM1.Modu_Id) WHERE TM1.Pant_Id = ? ORDER BY TM1.Pant_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000M6", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M7", "SELECT /*+ FIRST_ROWS(1) */ Pant_Id FROM SEG_PANTALLA WHERE Pant_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Pant_Id FROM SEG_PANTALLA WHERE ( Pant_Id > ?) ORDER BY Pant_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000M9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Pant_Id FROM SEG_PANTALLA WHERE ( Pant_Id < ?) ORDER BY Pant_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000M10", "INSERT INTO SEG_PANTALLA(Pant_UsuarioCrea, Pant_UsuarioModifica, Pant_FechaCrea, Pant_FechaModifica, Pant_Descripcion, Pant_NombreInterno, Pant_Orden, Modu_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "SEG_PANTALLA")
         ,new ForEachCursor("T000M11", "SELECT Pant_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000M12", "UPDATE SEG_PANTALLA SET Pant_UsuarioCrea=?, Pant_UsuarioModifica=?, Pant_FechaCrea=?, Pant_FechaModifica=?, Pant_Descripcion=?, Pant_NombreInterno=?, Pant_Orden=?, Modu_Id=?  WHERE Pant_Id = ?", GX_NOMASK, "SEG_PANTALLA")
         ,new UpdateCursor("T000M13", "DELETE FROM SEG_PANTALLA  WHERE Pant_Id = ?", GX_NOMASK, "SEG_PANTALLA")
         ,new ForEachCursor("T000M14", "SELECT Modu_Descripcion FROM SEG_MODULO_MENU WHERE Modu_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M15", "SELECT * FROM (SELECT Rol_Id, Pant_Id FROM SEG_ROL_PANTALLA WHERE Pant_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000M16", "SELECT /*+ FIRST_ROWS(100) */ Pant_Id FROM SEG_PANTALLA ORDER BY Pant_Id ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 50) ;
               ((short[]) buf[9])[0] = rslt.getShort(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 50) ;
               ((short[]) buf[9])[0] = rslt.getShort(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 50) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[10])[0] = rslt.getShort(9) ;
               ((long[]) buf[11])[0] = rslt.getLong(10) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 30);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               stmt.setVarchar(5, (String)parms[6], 50, false);
               stmt.setString(6, (String)parms[7], 50);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               stmt.setLong(8, ((Number) parms[9]).longValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 30);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               stmt.setVarchar(5, (String)parms[6], 50, false);
               stmt.setString(6, (String)parms[7], 50);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               stmt.setLong(8, ((Number) parms[9]).longValue());
               stmt.setInt(9, ((Number) parms[10]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

