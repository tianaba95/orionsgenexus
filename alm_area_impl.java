/*
               File: alm_area_impl
        Description: ALAMCEN AREA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:14:21.88
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

public final  class alm_area_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A1Cent_Id) ;
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
            AV12BArea_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BArea_Codigo", AV12BArea_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BArea_Codigo, ""))));
            AV15Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Id", GXutil.ltrim( GXutil.str( AV15Cent_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
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
      cmbBArea_Estado.setName( "BAREA_ESTADO" );
      cmbBArea_Estado.setWebtags( "" );
      cmbBArea_Estado.addItem("A", "Activo", (short)(0));
      cmbBArea_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbBArea_Estado.getItemCount() > 0 )
      {
         A611BArea_Estado = cmbBArea_Estado.getValidValue(A611BArea_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
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
         Form.getMeta().addItem("description", "ALAMCEN AREA", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtBArea_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_area_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_area_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_area_impl.class ));
   }

   public alm_area_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBArea_Estado = new HTMLChoice();
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
      if ( cmbBArea_Estado.getItemCount() > 0 )
      {
         A611BArea_Estado = cmbBArea_Estado.getValidValue(A611BArea_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "ALAMCEN AREA", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx0090"+"',["+"{Ctrl:gx.dom.el('"+"BAREA_CODIGO"+"'), id:'"+"BAREA_CODIGO"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Codigo_Internalname, "BArea_Codigo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Codigo_Internalname, A32BArea_Codigo, GXutil.rtrim( localUtil.format( A32BArea_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Codigo_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Descripcion_Internalname, "BArea_Descripcion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Descripcion_Internalname, A610BArea_Descripcion, GXutil.rtrim( localUtil.format( A610BArea_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Descripcion_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Id_Internalname, "Identificador Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Id_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_AREA.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Codigo_Internalname, "Código del Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Codigo_Internalname, A3Cent_Codigo, GXutil.rtrim( localUtil.format( A3Cent_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCent_Descripcion_Internalname, "Descripción Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCent_Descripcion_Internalname, A4Cent_Descripcion, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCent_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtCent_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbBArea_Estado.getInternalname(), "BArea_Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBArea_Estado, cmbBArea_Estado.getInternalname(), GXutil.rtrim( A611BArea_Estado), 1, cmbBArea_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbBArea_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, "HLP_ALM_AREA.htm");
         cmbBArea_Estado.setValue( GXutil.rtrim( A611BArea_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBArea_Estado.getInternalname(), "Values", cmbBArea_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Usuario_Crea_Internalname, "BArea_Usuario_Crea", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Usuario_Crea_Internalname, A612BArea_Usuario_Crea, GXutil.rtrim( localUtil.format( A612BArea_Usuario_Crea, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Usuario_Crea_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Usuario_Crea_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Fecha_Crea_Internalname, "BArea_Fecha_Crea", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtBArea_Fecha_Crea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Fecha_Crea_Internalname, localUtil.ttoc( A613BArea_Fecha_Crea, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A613BArea_Fecha_Crea, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Fecha_Crea_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Fecha_Crea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBArea_Fecha_Crea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBArea_Fecha_Crea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_AREA.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Usuario_Modifica_Internalname, "BArea_Usuario_Modifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Usuario_Modifica_Internalname, A614BArea_Usuario_Modifica, GXutil.rtrim( localUtil.format( A614BArea_Usuario_Modifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Usuario_Modifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Usuario_Modifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_AREA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtBArea_Fecha_Internalname, "BArea_Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtBArea_Fecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtBArea_Fecha_Internalname, localUtil.format(A615BArea_Fecha, "99/99/99"), localUtil.format( A615BArea_Fecha, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBArea_Fecha_Jsonclick, 0, "Attribute", "", "", "", 1, edtBArea_Fecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtBArea_Fecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBArea_Fecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_AREA.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_AREA.htm");
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
      e11072 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A32BArea_Codigo = httpContext.cgiGet( edtBArea_Codigo_Internalname) ;
            n32BArea_Codigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
            A610BArea_Descripcion = httpContext.cgiGet( edtBArea_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A610BArea_Descripcion", A610BArea_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CENT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCent_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1Cent_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            }
            else
            {
               A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            }
            A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
            A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
            cmbBArea_Estado.setValue( httpContext.cgiGet( cmbBArea_Estado.getInternalname()) );
            A611BArea_Estado = httpContext.cgiGet( cmbBArea_Estado.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
            A612BArea_Usuario_Crea = GXutil.upper( httpContext.cgiGet( edtBArea_Usuario_Crea_Internalname)) ;
            n612BArea_Usuario_Crea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
            n612BArea_Usuario_Crea = ((GXutil.strcmp("", A612BArea_Usuario_Crea)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBArea_Fecha_Crea_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BAREA_FECHA_CREA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBArea_Fecha_Crea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
               n613BArea_Fecha_Crea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A613BArea_Fecha_Crea = localUtil.ctot( httpContext.cgiGet( edtBArea_Fecha_Crea_Internalname)) ;
               n613BArea_Fecha_Crea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
            }
            n613BArea_Fecha_Crea = (GXutil.dateCompare(GXutil.nullDate(), A613BArea_Fecha_Crea) ? true : false) ;
            A614BArea_Usuario_Modifica = GXutil.upper( httpContext.cgiGet( edtBArea_Usuario_Modifica_Internalname)) ;
            n614BArea_Usuario_Modifica = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
            n614BArea_Usuario_Modifica = ((GXutil.strcmp("", A614BArea_Usuario_Modifica)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtBArea_Fecha_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BAREA_FECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBArea_Fecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A615BArea_Fecha = GXutil.nullDate() ;
               n615BArea_Fecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
            }
            else
            {
               A615BArea_Fecha = localUtil.ctod( httpContext.cgiGet( edtBArea_Fecha_Internalname), 3) ;
               n615BArea_Fecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
            }
            n615BArea_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A615BArea_Fecha) ? true : false) ;
            /* Read saved values. */
            Z32BArea_Codigo = httpContext.cgiGet( "Z32BArea_Codigo") ;
            Z1Cent_Id = localUtil.ctol( httpContext.cgiGet( "Z1Cent_Id"), ",", ".") ;
            Z610BArea_Descripcion = httpContext.cgiGet( "Z610BArea_Descripcion") ;
            Z611BArea_Estado = httpContext.cgiGet( "Z611BArea_Estado") ;
            Z612BArea_Usuario_Crea = httpContext.cgiGet( "Z612BArea_Usuario_Crea") ;
            n612BArea_Usuario_Crea = ((GXutil.strcmp("", A612BArea_Usuario_Crea)==0) ? true : false) ;
            Z613BArea_Fecha_Crea = localUtil.ctot( httpContext.cgiGet( "Z613BArea_Fecha_Crea"), 0) ;
            n613BArea_Fecha_Crea = (GXutil.dateCompare(GXutil.nullDate(), A613BArea_Fecha_Crea) ? true : false) ;
            Z614BArea_Usuario_Modifica = httpContext.cgiGet( "Z614BArea_Usuario_Modifica") ;
            n614BArea_Usuario_Modifica = ((GXutil.strcmp("", A614BArea_Usuario_Modifica)==0) ? true : false) ;
            Z615BArea_Fecha = localUtil.ctod( httpContext.cgiGet( "Z615BArea_Fecha"), 0) ;
            n615BArea_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A615BArea_Fecha) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV12BArea_Codigo = httpContext.cgiGet( "vBAREA_CODIGO") ;
            AV15Cent_Id = localUtil.ctol( httpContext.cgiGet( "vCENT_ID"), ",", ".") ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_AREA" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A32BArea_Codigo, Z32BArea_Codigo) != 0 ) || ( A1Cent_Id != Z1Cent_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_area:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A32BArea_Codigo = httpContext.GetNextPar( ) ;
               n32BArea_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
               A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
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
                  sMode9 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode9 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound9 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_070( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BAREA_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBArea_Codigo_Internalname ;
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
                        e11072 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12072 ();
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
         e12072 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll079( ) ;
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
         disableAttributes079( ) ;
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

   public void confirm_070( )
   {
      beforeValidate079( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls079( ) ;
         }
         else
         {
            checkExtendedTable079( ) ;
            closeExtendedTableCursors079( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption070( )
   {
   }

   public void e11072( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV16Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV16Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
   }

   public void e12072( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_area") );
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

   public void zm079( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z610BArea_Descripcion = T00073_A610BArea_Descripcion[0] ;
            Z611BArea_Estado = T00073_A611BArea_Estado[0] ;
            Z612BArea_Usuario_Crea = T00073_A612BArea_Usuario_Crea[0] ;
            Z613BArea_Fecha_Crea = T00073_A613BArea_Fecha_Crea[0] ;
            Z614BArea_Usuario_Modifica = T00073_A614BArea_Usuario_Modifica[0] ;
            Z615BArea_Fecha = T00073_A615BArea_Fecha[0] ;
         }
         else
         {
            Z610BArea_Descripcion = A610BArea_Descripcion ;
            Z611BArea_Estado = A611BArea_Estado ;
            Z612BArea_Usuario_Crea = A612BArea_Usuario_Crea ;
            Z613BArea_Fecha_Crea = A613BArea_Fecha_Crea ;
            Z614BArea_Usuario_Modifica = A614BArea_Usuario_Modifica ;
            Z615BArea_Fecha = A615BArea_Fecha ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z32BArea_Codigo = A32BArea_Codigo ;
         Z610BArea_Descripcion = A610BArea_Descripcion ;
         Z611BArea_Estado = A611BArea_Estado ;
         Z612BArea_Usuario_Crea = A612BArea_Usuario_Crea ;
         Z613BArea_Fecha_Crea = A613BArea_Fecha_Crea ;
         Z614BArea_Usuario_Modifica = A614BArea_Usuario_Modifica ;
         Z615BArea_Fecha = A615BArea_Fecha ;
         Z1Cent_Id = A1Cent_Id ;
         Z3Cent_Codigo = A3Cent_Codigo ;
         Z4Cent_Descripcion = A4Cent_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CENT_ID"+"'), id:'"+"CENT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV12BArea_Codigo)==0) )
      {
         A32BArea_Codigo = AV12BArea_Codigo ;
         n32BArea_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV12BArea_Codigo)==0) )
      {
         edtBArea_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtBArea_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV12BArea_Codigo)==0) )
      {
         edtBArea_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV15Cent_Id) )
      {
         A1Cent_Id = AV15Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      if ( ! (0==AV15Cent_Id) )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      else
      {
         edtCent_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      }
      if ( ! (0==AV15Cent_Id) )
      {
         edtCent_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV16Pgmname = "ALM_AREA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T00074 */
         pr_default.execute(2, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T00074_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T00074_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         pr_default.close(2);
      }
   }

   public void load079( )
   {
      /* Using cursor T00075 */
      pr_default.execute(3, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A610BArea_Descripcion = T00075_A610BArea_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610BArea_Descripcion", A610BArea_Descripcion);
         A3Cent_Codigo = T00075_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T00075_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         A611BArea_Estado = T00075_A611BArea_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
         A612BArea_Usuario_Crea = T00075_A612BArea_Usuario_Crea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
         n612BArea_Usuario_Crea = T00075_n612BArea_Usuario_Crea[0] ;
         A613BArea_Fecha_Crea = T00075_A613BArea_Fecha_Crea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
         n613BArea_Fecha_Crea = T00075_n613BArea_Fecha_Crea[0] ;
         A614BArea_Usuario_Modifica = T00075_A614BArea_Usuario_Modifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
         n614BArea_Usuario_Modifica = T00075_n614BArea_Usuario_Modifica[0] ;
         A615BArea_Fecha = T00075_A615BArea_Fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
         n615BArea_Fecha = T00075_n615BArea_Fecha[0] ;
         zm079( -7) ;
      }
      pr_default.close(3);
      onLoadActions079( ) ;
   }

   public void onLoadActions079( )
   {
      AV16Pgmname = "ALM_AREA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable079( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV16Pgmname = "ALM_AREA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      /* Using cursor T00074 */
      pr_default.execute(2, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T00074_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T00074_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors079( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( long A1Cent_Id )
   {
      /* Using cursor T00076 */
      pr_default.execute(4, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3Cent_Codigo = T00076_A3Cent_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = T00076_A4Cent_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A3Cent_Codigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A4Cent_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey079( )
   {
      /* Using cursor T00077 */
      pr_default.execute(5, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00073 */
      pr_default.execute(1, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm079( 7) ;
         RcdFound9 = (short)(1) ;
         A32BArea_Codigo = T00073_A32BArea_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
         n32BArea_Codigo = T00073_n32BArea_Codigo[0] ;
         A610BArea_Descripcion = T00073_A610BArea_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610BArea_Descripcion", A610BArea_Descripcion);
         A611BArea_Estado = T00073_A611BArea_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
         A612BArea_Usuario_Crea = T00073_A612BArea_Usuario_Crea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
         n612BArea_Usuario_Crea = T00073_n612BArea_Usuario_Crea[0] ;
         A613BArea_Fecha_Crea = T00073_A613BArea_Fecha_Crea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
         n613BArea_Fecha_Crea = T00073_n613BArea_Fecha_Crea[0] ;
         A614BArea_Usuario_Modifica = T00073_A614BArea_Usuario_Modifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
         n614BArea_Usuario_Modifica = T00073_n614BArea_Usuario_Modifica[0] ;
         A615BArea_Fecha = T00073_A615BArea_Fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
         n615BArea_Fecha = T00073_n615BArea_Fecha[0] ;
         A1Cent_Id = T00073_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         Z32BArea_Codigo = A32BArea_Codigo ;
         Z1Cent_Id = A1Cent_Id ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load079( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey079( ) ;
         }
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey079( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey079( ) ;
      if ( RcdFound9 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00078 */
      pr_default.execute(6, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00078_A32BArea_Codigo[0], A32BArea_Codigo) < 0 ) || ( GXutil.strcmp(T00078_A32BArea_Codigo[0], A32BArea_Codigo) == 0 ) && ( T00078_A1Cent_Id[0] < A1Cent_Id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00078_A32BArea_Codigo[0], A32BArea_Codigo) > 0 ) || ( GXutil.strcmp(T00078_A32BArea_Codigo[0], A32BArea_Codigo) == 0 ) && ( T00078_A1Cent_Id[0] > A1Cent_Id ) ) )
         {
            A32BArea_Codigo = T00078_A32BArea_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
            n32BArea_Codigo = T00078_n32BArea_Codigo[0] ;
            A1Cent_Id = T00078_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00079 */
      pr_default.execute(7, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00079_A32BArea_Codigo[0], A32BArea_Codigo) > 0 ) || ( GXutil.strcmp(T00079_A32BArea_Codigo[0], A32BArea_Codigo) == 0 ) && ( T00079_A1Cent_Id[0] > A1Cent_Id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00079_A32BArea_Codigo[0], A32BArea_Codigo) < 0 ) || ( GXutil.strcmp(T00079_A32BArea_Codigo[0], A32BArea_Codigo) == 0 ) && ( T00079_A1Cent_Id[0] < A1Cent_Id ) ) )
         {
            A32BArea_Codigo = T00079_A32BArea_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
            n32BArea_Codigo = T00079_n32BArea_Codigo[0] ;
            A1Cent_Id = T00079_A1Cent_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey079( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtBArea_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert079( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( ( GXutil.strcmp(A32BArea_Codigo, Z32BArea_Codigo) != 0 ) || ( A1Cent_Id != Z1Cent_Id ) )
            {
               A32BArea_Codigo = Z32BArea_Codigo ;
               n32BArea_Codigo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
               A1Cent_Id = Z1Cent_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BAREA_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBArea_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBArea_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update079( ) ;
               GX_FocusControl = edtBArea_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A32BArea_Codigo, Z32BArea_Codigo) != 0 ) || ( A1Cent_Id != Z1Cent_Id ) )
            {
               /* Insert record */
               GX_FocusControl = edtBArea_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert079( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BAREA_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBArea_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtBArea_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert079( ) ;
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
      if ( ( GXutil.strcmp(A32BArea_Codigo, Z32BArea_Codigo) != 0 ) || ( A1Cent_Id != Z1Cent_Id ) )
      {
         A32BArea_Codigo = Z32BArea_Codigo ;
         n32BArea_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
         A1Cent_Id = Z1Cent_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BAREA_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBArea_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBArea_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency079( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00072 */
         pr_default.execute(0, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_AREA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z610BArea_Descripcion, T00072_A610BArea_Descripcion[0]) != 0 ) || ( GXutil.strcmp(Z611BArea_Estado, T00072_A611BArea_Estado[0]) != 0 ) || ( GXutil.strcmp(Z612BArea_Usuario_Crea, T00072_A612BArea_Usuario_Crea[0]) != 0 ) || !( GXutil.dateCompare(Z613BArea_Fecha_Crea, T00072_A613BArea_Fecha_Crea[0]) ) || ( GXutil.strcmp(Z614BArea_Usuario_Modifica, T00072_A614BArea_Usuario_Modifica[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z615BArea_Fecha, T00072_A615BArea_Fecha[0]) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_AREA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert079( )
   {
      beforeValidate079( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable079( ) ;
      }
      if ( AnyError == 0 )
      {
         zm079( 0) ;
         checkOptimisticConcurrency079( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm079( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert079( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000710 */
                  pr_default.execute(8, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, A610BArea_Descripcion, A611BArea_Estado, new Boolean(n612BArea_Usuario_Crea), A612BArea_Usuario_Crea, new Boolean(n613BArea_Fecha_Crea), A613BArea_Fecha_Crea, new Boolean(n614BArea_Usuario_Modifica), A614BArea_Usuario_Modifica, new Boolean(n615BArea_Fecha), A615BArea_Fecha, new Long(A1Cent_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_AREA") ;
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
                        resetCaption070( ) ;
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
            load079( ) ;
         }
         endLevel079( ) ;
      }
      closeExtendedTableCursors079( ) ;
   }

   public void update079( )
   {
      beforeValidate079( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable079( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency079( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm079( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate079( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000711 */
                  pr_default.execute(9, new Object[] {A610BArea_Descripcion, A611BArea_Estado, new Boolean(n612BArea_Usuario_Crea), A612BArea_Usuario_Crea, new Boolean(n613BArea_Fecha_Crea), A613BArea_Fecha_Crea, new Boolean(n614BArea_Usuario_Modifica), A614BArea_Usuario_Modifica, new Boolean(n615BArea_Fecha), A615BArea_Fecha, new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_AREA") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_AREA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate079( ) ;
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
         endLevel079( ) ;
      }
      closeExtendedTableCursors079( ) ;
   }

   public void deferredUpdate079( )
   {
   }

   public void delete( )
   {
      beforeValidate079( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency079( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls079( ) ;
         afterConfirm079( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete079( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000712 */
               pr_default.execute(10, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_AREA") ;
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel079( ) ;
      Gx_mode = sMode9 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls079( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "ALM_AREA" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         /* Using cursor T000713 */
         pr_default.execute(11, new Object[] {new Long(A1Cent_Id)});
         A3Cent_Codigo = T000713_A3Cent_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
         A4Cent_Descripcion = T000713_A4Cent_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000714 */
         pr_default.execute(12, new Object[] {new Boolean(n32BArea_Codigo), A32BArea_Codigo, new Long(A1Cent_Id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"BODEGAS DEL ALMACEN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel079( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete079( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_area");
         if ( AnyError == 0 )
         {
            confirmValues070( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_area");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart079( )
   {
      /* Scan By routine */
      /* Using cursor T000715 */
      pr_default.execute(13);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A32BArea_Codigo = T000715_A32BArea_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
         n32BArea_Codigo = T000715_n32BArea_Codigo[0] ;
         A1Cent_Id = T000715_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext079( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A32BArea_Codigo = T000715_A32BArea_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
         n32BArea_Codigo = T000715_n32BArea_Codigo[0] ;
         A1Cent_Id = T000715_A1Cent_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      }
   }

   public void scanEnd079( )
   {
      pr_default.close(13);
   }

   public void afterConfirm079( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert079( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate079( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete079( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete079( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate079( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes079( )
   {
      edtBArea_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Codigo_Enabled, 5, 0)), true);
      edtBArea_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Descripcion_Enabled, 5, 0)), true);
      edtCent_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Id_Enabled, 5, 0)), true);
      edtCent_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Codigo_Enabled, 5, 0)), true);
      edtCent_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCent_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCent_Descripcion_Enabled, 5, 0)), true);
      cmbBArea_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBArea_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbBArea_Estado.getEnabled(), 5, 0)), true);
      edtBArea_Usuario_Crea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Usuario_Crea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Usuario_Crea_Enabled, 5, 0)), true);
      edtBArea_Fecha_Crea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Fecha_Crea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Fecha_Crea_Enabled, 5, 0)), true);
      edtBArea_Usuario_Modifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Usuario_Modifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Usuario_Modifica_Enabled, 5, 0)), true);
      edtBArea_Fecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBArea_Fecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtBArea_Fecha_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues070( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414142322");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_area") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12BArea_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cent_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z32BArea_Codigo", Z32BArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z1Cent_Id", GXutil.ltrim( localUtil.ntoc( Z1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z610BArea_Descripcion", Z610BArea_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z611BArea_Estado", GXutil.rtrim( Z611BArea_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z612BArea_Usuario_Crea", Z612BArea_Usuario_Crea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z613BArea_Fecha_Crea", localUtil.ttoc( Z613BArea_Fecha_Crea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z614BArea_Usuario_Modifica", Z614BArea_Usuario_Modifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z615BArea_Fecha", localUtil.dtoc( Z615BArea_Fecha, 0, "/"));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBAREA_CODIGO", AV12BArea_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV15Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBAREA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12BArea_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Cent_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_AREA" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_area:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_area") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12BArea_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15Cent_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_AREA" ;
   }

   public String getPgmdesc( )
   {
      return "ALAMCEN AREA" ;
   }

   public void initializeNonKey079( )
   {
      A610BArea_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A610BArea_Descripcion", A610BArea_Descripcion);
      A3Cent_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3Cent_Codigo", A3Cent_Codigo);
      A4Cent_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4Cent_Descripcion", A4Cent_Descripcion);
      A611BArea_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A611BArea_Estado", A611BArea_Estado);
      A612BArea_Usuario_Crea = "" ;
      n612BArea_Usuario_Crea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A612BArea_Usuario_Crea", A612BArea_Usuario_Crea);
      n612BArea_Usuario_Crea = ((GXutil.strcmp("", A612BArea_Usuario_Crea)==0) ? true : false) ;
      A613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
      n613BArea_Fecha_Crea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A613BArea_Fecha_Crea", localUtil.ttoc( A613BArea_Fecha_Crea, 8, 5, 0, 3, "/", ":", " "));
      n613BArea_Fecha_Crea = (GXutil.dateCompare(GXutil.nullDate(), A613BArea_Fecha_Crea) ? true : false) ;
      A614BArea_Usuario_Modifica = "" ;
      n614BArea_Usuario_Modifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A614BArea_Usuario_Modifica", A614BArea_Usuario_Modifica);
      n614BArea_Usuario_Modifica = ((GXutil.strcmp("", A614BArea_Usuario_Modifica)==0) ? true : false) ;
      A615BArea_Fecha = GXutil.nullDate() ;
      n615BArea_Fecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A615BArea_Fecha", localUtil.format(A615BArea_Fecha, "99/99/99"));
      n615BArea_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A615BArea_Fecha) ? true : false) ;
      Z610BArea_Descripcion = "" ;
      Z611BArea_Estado = "" ;
      Z612BArea_Usuario_Crea = "" ;
      Z613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
      Z614BArea_Usuario_Modifica = "" ;
      Z615BArea_Fecha = GXutil.nullDate() ;
   }

   public void initAll079( )
   {
      A32BArea_Codigo = "" ;
      n32BArea_Codigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A32BArea_Codigo", A32BArea_Codigo);
      A1Cent_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1Cent_Id", GXutil.ltrim( GXutil.str( A1Cent_Id, 11, 0)));
      initializeNonKey079( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414142329");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_area.js", "?201861414142330");
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
      edtBArea_Codigo_Internalname = "BAREA_CODIGO" ;
      edtBArea_Descripcion_Internalname = "BAREA_DESCRIPCION" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      cmbBArea_Estado.setInternalname( "BAREA_ESTADO" );
      edtBArea_Usuario_Crea_Internalname = "BAREA_USUARIO_CREA" ;
      edtBArea_Fecha_Crea_Internalname = "BAREA_FECHA_CREA" ;
      edtBArea_Usuario_Modifica_Internalname = "BAREA_USUARIO_MODIFICA" ;
      edtBArea_Fecha_Internalname = "BAREA_FECHA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1_Internalname = "PROMPT_1" ;
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
      Form.setCaption( "ALAMCEN AREA" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBArea_Fecha_Jsonclick = "" ;
      edtBArea_Fecha_Enabled = 1 ;
      edtBArea_Usuario_Modifica_Jsonclick = "" ;
      edtBArea_Usuario_Modifica_Enabled = 1 ;
      edtBArea_Fecha_Crea_Jsonclick = "" ;
      edtBArea_Fecha_Crea_Enabled = 1 ;
      edtBArea_Usuario_Crea_Jsonclick = "" ;
      edtBArea_Usuario_Crea_Enabled = 1 ;
      cmbBArea_Estado.setJsonclick( "" );
      cmbBArea_Estado.setEnabled( 1 );
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Descripcion_Enabled = 0 ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Codigo_Enabled = 0 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtCent_Id_Enabled = 1 ;
      edtBArea_Descripcion_Jsonclick = "" ;
      edtBArea_Descripcion_Enabled = 1 ;
      edtBArea_Codigo_Jsonclick = "" ;
      edtBArea_Codigo_Enabled = 1 ;
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

   public void valid_Cent_id( long GX_Parm1 ,
                              String GX_Parm2 ,
                              String GX_Parm3 )
   {
      A1Cent_Id = GX_Parm1 ;
      A3Cent_Codigo = GX_Parm2 ;
      A4Cent_Descripcion = GX_Parm3 ;
      /* Using cursor T000713 */
      pr_default.execute(11, new Object[] {new Long(A1Cent_Id)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "CENT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCent_Id_Internalname ;
      }
      A3Cent_Codigo = T000713_A3Cent_Codigo[0] ;
      A4Cent_Descripcion = T000713_A4Cent_Descripcion[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A3Cent_Codigo = "" ;
         A4Cent_Descripcion = "" ;
      }
      isValidOutput.add(A3Cent_Codigo);
      isValidOutput.add(A4Cent_Descripcion);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV12BArea_Codigo',fld:'vBAREA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12072',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      wcpOAV12BArea_Codigo = "" ;
      Z32BArea_Codigo = "" ;
      Z610BArea_Descripcion = "" ;
      Z611BArea_Estado = "" ;
      Z612BArea_Usuario_Crea = "" ;
      Z613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
      Z614BArea_Usuario_Modifica = "" ;
      Z615BArea_Fecha = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV12BArea_Codigo = "" ;
      GXKey = "" ;
      A611BArea_Estado = "" ;
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
      A32BArea_Codigo = "" ;
      A610BArea_Descripcion = "" ;
      sImgUrl = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A612BArea_Usuario_Crea = "" ;
      A613BArea_Fecha_Crea = GXutil.resetTime( GXutil.nullDate() );
      A614BArea_Usuario_Modifica = "" ;
      A615BArea_Fecha = GXutil.nullDate() ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV16Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode9 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      Z3Cent_Codigo = "" ;
      Z4Cent_Descripcion = "" ;
      T00074_A3Cent_Codigo = new String[] {""} ;
      T00074_A4Cent_Descripcion = new String[] {""} ;
      T00075_A32BArea_Codigo = new String[] {""} ;
      T00075_n32BArea_Codigo = new boolean[] {false} ;
      T00075_A610BArea_Descripcion = new String[] {""} ;
      T00075_A3Cent_Codigo = new String[] {""} ;
      T00075_A4Cent_Descripcion = new String[] {""} ;
      T00075_A611BArea_Estado = new String[] {""} ;
      T00075_A612BArea_Usuario_Crea = new String[] {""} ;
      T00075_n612BArea_Usuario_Crea = new boolean[] {false} ;
      T00075_A613BArea_Fecha_Crea = new java.util.Date[] {GXutil.nullDate()} ;
      T00075_n613BArea_Fecha_Crea = new boolean[] {false} ;
      T00075_A614BArea_Usuario_Modifica = new String[] {""} ;
      T00075_n614BArea_Usuario_Modifica = new boolean[] {false} ;
      T00075_A615BArea_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00075_n615BArea_Fecha = new boolean[] {false} ;
      T00075_A1Cent_Id = new long[1] ;
      T00076_A3Cent_Codigo = new String[] {""} ;
      T00076_A4Cent_Descripcion = new String[] {""} ;
      T00077_A32BArea_Codigo = new String[] {""} ;
      T00077_n32BArea_Codigo = new boolean[] {false} ;
      T00077_A1Cent_Id = new long[1] ;
      T00073_A32BArea_Codigo = new String[] {""} ;
      T00073_n32BArea_Codigo = new boolean[] {false} ;
      T00073_A610BArea_Descripcion = new String[] {""} ;
      T00073_A611BArea_Estado = new String[] {""} ;
      T00073_A612BArea_Usuario_Crea = new String[] {""} ;
      T00073_n612BArea_Usuario_Crea = new boolean[] {false} ;
      T00073_A613BArea_Fecha_Crea = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n613BArea_Fecha_Crea = new boolean[] {false} ;
      T00073_A614BArea_Usuario_Modifica = new String[] {""} ;
      T00073_n614BArea_Usuario_Modifica = new boolean[] {false} ;
      T00073_A615BArea_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n615BArea_Fecha = new boolean[] {false} ;
      T00073_A1Cent_Id = new long[1] ;
      T00078_A32BArea_Codigo = new String[] {""} ;
      T00078_n32BArea_Codigo = new boolean[] {false} ;
      T00078_A1Cent_Id = new long[1] ;
      T00079_A32BArea_Codigo = new String[] {""} ;
      T00079_n32BArea_Codigo = new boolean[] {false} ;
      T00079_A1Cent_Id = new long[1] ;
      T00072_A32BArea_Codigo = new String[] {""} ;
      T00072_n32BArea_Codigo = new boolean[] {false} ;
      T00072_A610BArea_Descripcion = new String[] {""} ;
      T00072_A611BArea_Estado = new String[] {""} ;
      T00072_A612BArea_Usuario_Crea = new String[] {""} ;
      T00072_n612BArea_Usuario_Crea = new boolean[] {false} ;
      T00072_A613BArea_Fecha_Crea = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n613BArea_Fecha_Crea = new boolean[] {false} ;
      T00072_A614BArea_Usuario_Modifica = new String[] {""} ;
      T00072_n614BArea_Usuario_Modifica = new boolean[] {false} ;
      T00072_A615BArea_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n615BArea_Fecha = new boolean[] {false} ;
      T00072_A1Cent_Id = new long[1] ;
      T000713_A3Cent_Codigo = new String[] {""} ;
      T000713_A4Cent_Descripcion = new String[] {""} ;
      T000714_A1Cent_Id = new long[1] ;
      T000714_A27Alma_Modulo = new String[] {""} ;
      T000714_A28Alma_Codigo = new String[] {""} ;
      T000714_A31Bode_Codigo = new String[] {""} ;
      T000715_A32BArea_Codigo = new String[] {""} ;
      T000715_n32BArea_Codigo = new boolean[] {false} ;
      T000715_A1Cent_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_area__default(),
         new Object[] {
             new Object[] {
            T00072_A32BArea_Codigo, T00072_A610BArea_Descripcion, T00072_A611BArea_Estado, T00072_A612BArea_Usuario_Crea, T00072_n612BArea_Usuario_Crea, T00072_A613BArea_Fecha_Crea, T00072_n613BArea_Fecha_Crea, T00072_A614BArea_Usuario_Modifica, T00072_n614BArea_Usuario_Modifica, T00072_A615BArea_Fecha,
            T00072_n615BArea_Fecha, T00072_A1Cent_Id
            }
            , new Object[] {
            T00073_A32BArea_Codigo, T00073_A610BArea_Descripcion, T00073_A611BArea_Estado, T00073_A612BArea_Usuario_Crea, T00073_n612BArea_Usuario_Crea, T00073_A613BArea_Fecha_Crea, T00073_n613BArea_Fecha_Crea, T00073_A614BArea_Usuario_Modifica, T00073_n614BArea_Usuario_Modifica, T00073_A615BArea_Fecha,
            T00073_n615BArea_Fecha, T00073_A1Cent_Id
            }
            , new Object[] {
            T00074_A3Cent_Codigo, T00074_A4Cent_Descripcion
            }
            , new Object[] {
            T00075_A32BArea_Codigo, T00075_A610BArea_Descripcion, T00075_A3Cent_Codigo, T00075_A4Cent_Descripcion, T00075_A611BArea_Estado, T00075_A612BArea_Usuario_Crea, T00075_n612BArea_Usuario_Crea, T00075_A613BArea_Fecha_Crea, T00075_n613BArea_Fecha_Crea, T00075_A614BArea_Usuario_Modifica,
            T00075_n614BArea_Usuario_Modifica, T00075_A615BArea_Fecha, T00075_n615BArea_Fecha, T00075_A1Cent_Id
            }
            , new Object[] {
            T00076_A3Cent_Codigo, T00076_A4Cent_Descripcion
            }
            , new Object[] {
            T00077_A32BArea_Codigo, T00077_A1Cent_Id
            }
            , new Object[] {
            T00078_A32BArea_Codigo, T00078_A1Cent_Id
            }
            , new Object[] {
            T00079_A32BArea_Codigo, T00079_A1Cent_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000713_A3Cent_Codigo, T000713_A4Cent_Descripcion
            }
            , new Object[] {
            T000714_A1Cent_Id, T000714_A27Alma_Modulo, T000714_A28Alma_Codigo, T000714_A31Bode_Codigo
            }
            , new Object[] {
            T000715_A32BArea_Codigo, T000715_A1Cent_Id
            }
         }
      );
      AV16Pgmname = "ALM_AREA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtBArea_Codigo_Enabled ;
   private int edtBArea_Descripcion_Enabled ;
   private int edtCent_Id_Enabled ;
   private int imgprompt_1_Visible ;
   private int edtCent_Codigo_Enabled ;
   private int edtCent_Descripcion_Enabled ;
   private int edtBArea_Usuario_Crea_Enabled ;
   private int edtBArea_Fecha_Crea_Enabled ;
   private int edtBArea_Usuario_Modifica_Enabled ;
   private int edtBArea_Fecha_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV15Cent_Id ;
   private long Z1Cent_Id ;
   private long A1Cent_Id ;
   private long AV15Cent_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z611BArea_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A611BArea_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBArea_Codigo_Internalname ;
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
   private String edtBArea_Codigo_Jsonclick ;
   private String edtBArea_Descripcion_Internalname ;
   private String edtBArea_Descripcion_Jsonclick ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Id_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtBArea_Usuario_Crea_Internalname ;
   private String edtBArea_Usuario_Crea_Jsonclick ;
   private String edtBArea_Fecha_Crea_Internalname ;
   private String edtBArea_Fecha_Crea_Jsonclick ;
   private String edtBArea_Usuario_Modifica_Internalname ;
   private String edtBArea_Usuario_Modifica_Jsonclick ;
   private String edtBArea_Fecha_Internalname ;
   private String edtBArea_Fecha_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV16Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode9 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z613BArea_Fecha_Crea ;
   private java.util.Date A613BArea_Fecha_Crea ;
   private java.util.Date Z615BArea_Fecha ;
   private java.util.Date A615BArea_Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n32BArea_Codigo ;
   private boolean n612BArea_Usuario_Crea ;
   private boolean n613BArea_Fecha_Crea ;
   private boolean n614BArea_Usuario_Modifica ;
   private boolean n615BArea_Fecha ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV12BArea_Codigo ;
   private String Z32BArea_Codigo ;
   private String Z610BArea_Descripcion ;
   private String Z612BArea_Usuario_Crea ;
   private String Z614BArea_Usuario_Modifica ;
   private String AV12BArea_Codigo ;
   private String A32BArea_Codigo ;
   private String A610BArea_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A612BArea_Usuario_Crea ;
   private String A614BArea_Usuario_Modifica ;
   private String Z3Cent_Codigo ;
   private String Z4Cent_Descripcion ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbBArea_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] T00074_A3Cent_Codigo ;
   private String[] T00074_A4Cent_Descripcion ;
   private String[] T00075_A32BArea_Codigo ;
   private boolean[] T00075_n32BArea_Codigo ;
   private String[] T00075_A610BArea_Descripcion ;
   private String[] T00075_A3Cent_Codigo ;
   private String[] T00075_A4Cent_Descripcion ;
   private String[] T00075_A611BArea_Estado ;
   private String[] T00075_A612BArea_Usuario_Crea ;
   private boolean[] T00075_n612BArea_Usuario_Crea ;
   private java.util.Date[] T00075_A613BArea_Fecha_Crea ;
   private boolean[] T00075_n613BArea_Fecha_Crea ;
   private String[] T00075_A614BArea_Usuario_Modifica ;
   private boolean[] T00075_n614BArea_Usuario_Modifica ;
   private java.util.Date[] T00075_A615BArea_Fecha ;
   private boolean[] T00075_n615BArea_Fecha ;
   private long[] T00075_A1Cent_Id ;
   private String[] T00076_A3Cent_Codigo ;
   private String[] T00076_A4Cent_Descripcion ;
   private String[] T00077_A32BArea_Codigo ;
   private boolean[] T00077_n32BArea_Codigo ;
   private long[] T00077_A1Cent_Id ;
   private String[] T00073_A32BArea_Codigo ;
   private boolean[] T00073_n32BArea_Codigo ;
   private String[] T00073_A610BArea_Descripcion ;
   private String[] T00073_A611BArea_Estado ;
   private String[] T00073_A612BArea_Usuario_Crea ;
   private boolean[] T00073_n612BArea_Usuario_Crea ;
   private java.util.Date[] T00073_A613BArea_Fecha_Crea ;
   private boolean[] T00073_n613BArea_Fecha_Crea ;
   private String[] T00073_A614BArea_Usuario_Modifica ;
   private boolean[] T00073_n614BArea_Usuario_Modifica ;
   private java.util.Date[] T00073_A615BArea_Fecha ;
   private boolean[] T00073_n615BArea_Fecha ;
   private long[] T00073_A1Cent_Id ;
   private String[] T00078_A32BArea_Codigo ;
   private boolean[] T00078_n32BArea_Codigo ;
   private long[] T00078_A1Cent_Id ;
   private String[] T00079_A32BArea_Codigo ;
   private boolean[] T00079_n32BArea_Codigo ;
   private long[] T00079_A1Cent_Id ;
   private String[] T00072_A32BArea_Codigo ;
   private boolean[] T00072_n32BArea_Codigo ;
   private String[] T00072_A610BArea_Descripcion ;
   private String[] T00072_A611BArea_Estado ;
   private String[] T00072_A612BArea_Usuario_Crea ;
   private boolean[] T00072_n612BArea_Usuario_Crea ;
   private java.util.Date[] T00072_A613BArea_Fecha_Crea ;
   private boolean[] T00072_n613BArea_Fecha_Crea ;
   private String[] T00072_A614BArea_Usuario_Modifica ;
   private boolean[] T00072_n614BArea_Usuario_Modifica ;
   private java.util.Date[] T00072_A615BArea_Fecha ;
   private boolean[] T00072_n615BArea_Fecha ;
   private long[] T00072_A1Cent_Id ;
   private String[] T000713_A3Cent_Codigo ;
   private String[] T000713_A4Cent_Descripcion ;
   private long[] T000714_A1Cent_Id ;
   private String[] T000714_A27Alma_Modulo ;
   private String[] T000714_A28Alma_Codigo ;
   private String[] T000714_A31Bode_Codigo ;
   private String[] T000715_A32BArea_Codigo ;
   private boolean[] T000715_n32BArea_Codigo ;
   private long[] T000715_A1Cent_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_area__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00072", "SELECT BArea_Codigo, BArea_Descripcion, BArea_Estado, BArea_Usuario_Crea, BArea_Fecha_Crea, BArea_Usuario_Modifica, BArea_Fecha, Cent_Id FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ?  FOR UPDATE OF BArea_Descripcion, BArea_Estado, BArea_Usuario_Crea, BArea_Fecha_Crea, BArea_Usuario_Modifica, BArea_Fecha NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00073", "SELECT BArea_Codigo, BArea_Descripcion, BArea_Estado, BArea_Usuario_Crea, BArea_Fecha_Crea, BArea_Usuario_Modifica, BArea_Fecha, Cent_Id FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00074", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00075", "SELECT /*+ FIRST_ROWS(100) */ TM1.BArea_Codigo, TM1.BArea_Descripcion, T2.Cent_Codigo, T2.Cent_Descripcion, TM1.BArea_Estado, TM1.BArea_Usuario_Crea, TM1.BArea_Fecha_Crea, TM1.BArea_Usuario_Modifica, TM1.BArea_Fecha, TM1.Cent_Id FROM (ALM_AREA TM1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = TM1.Cent_Id) WHERE TM1.BArea_Codigo = ? and TM1.Cent_Id = ? ORDER BY TM1.BArea_Codigo, TM1.Cent_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00076", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00077", "SELECT /*+ FIRST_ROWS(1) */ BArea_Codigo, Cent_Id FROM ALM_AREA WHERE BArea_Codigo = ? AND Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00078", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BArea_Codigo, Cent_Id FROM ALM_AREA WHERE ( BArea_Codigo > ? or BArea_Codigo = ? and Cent_Id > ?) ORDER BY BArea_Codigo, Cent_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00079", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BArea_Codigo, Cent_Id FROM ALM_AREA WHERE ( BArea_Codigo < ? or BArea_Codigo = ? and Cent_Id < ?) ORDER BY BArea_Codigo DESC, Cent_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000710", "INSERT INTO ALM_AREA(BArea_Codigo, BArea_Descripcion, BArea_Estado, BArea_Usuario_Crea, BArea_Fecha_Crea, BArea_Usuario_Modifica, BArea_Fecha, Cent_Id) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_AREA")
         ,new UpdateCursor("T000711", "UPDATE ALM_AREA SET BArea_Descripcion=?, BArea_Estado=?, BArea_Usuario_Crea=?, BArea_Fecha_Crea=?, BArea_Usuario_Modifica=?, BArea_Fecha=?  WHERE BArea_Codigo = ? AND Cent_Id = ?", GX_NOMASK, "ALM_AREA")
         ,new UpdateCursor("T000712", "DELETE FROM ALM_AREA  WHERE BArea_Codigo = ? AND Cent_Id = ?", GX_NOMASK, "ALM_AREA")
         ,new ForEachCursor("T000713", "SELECT Cent_Codigo, Cent_Descripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000714", "SELECT * FROM (SELECT Cent_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo FROM ALM_ALMACEN_BODEGAS WHERE BArea_Codigo = ? AND Cent_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000715", "SELECT /*+ FIRST_ROWS(100) */ BArea_Codigo, Cent_Id FROM ALM_AREA ORDER BY BArea_Codigo, Cent_Id ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 16, false);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 16, false);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setVarchar(2, (String)parms[2], 40, false);
               stmt.setString(3, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[11]);
               }
               stmt.setLong(8, ((Number) parms[12]).longValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 16, false);
               }
               stmt.setLong(8, ((Number) parms[12]).longValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16, false);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 16);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

