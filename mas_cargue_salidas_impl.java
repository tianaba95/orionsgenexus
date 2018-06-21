/*
               File: mas_cargue_salidas_impl
        Description: MAS_CARGUE_SALIDAS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:24.35
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

public final  class mas_cargue_salidas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action1") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_1_1A47( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_1A47( ) ;
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
         Form.getMeta().addItem("description", "MAS_CARGUE_SALIDAS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtNUMTRN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mas_cargue_salidas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mas_cargue_salidas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mas_cargue_salidas_impl.class ));
   }

   public mas_cargue_salidas_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "MAS_CARGUE_SALIDAS", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx01b0"+"',["+"{Ctrl:gx.dom.el('"+"NUMTRN"+"'), id:'"+"NUMTRN"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"ID_SALIDA"+"'), id:'"+"ID_SALIDA"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNUMTRN_Internalname, "NUMTRN", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNUMTRN_Internalname, GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ",", "")), ((edtNUMTRN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A78NUMTRN), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A78NUMTRN), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNUMTRN_Jsonclick, 0, "Attribute", "", "", "", 1, edtNUMTRN_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtID_SALIDA_Internalname, "ID_SALIDA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtID_SALIDA_Internalname, GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ",", "")), ((edtID_SALIDA_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A79ID_SALIDA), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A79ID_SALIDA), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_SALIDA_Jsonclick, 0, "Attribute", "", "", "", 1, edtID_SALIDA_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtPLACASENA_Internalname, "PLACASENA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtPLACASENA_Internalname, A530PLACASENA, GXutil.rtrim( localUtil.format( A530PLACASENA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLACASENA_Jsonclick, 0, "Attribute", "", "", "", 1, edtPLACASENA_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCONSECUTIVO_Internalname, "CONSECUTIVO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCONSECUTIVO_Internalname, A553CONSECUTIVO, GXutil.rtrim( localUtil.format( A553CONSECUTIVO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCONSECUTIVO_Jsonclick, 0, "Attribute", "", "", "", 1, edtCONSECUTIVO_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCANTIDAD_Internalname, "CANTIDAD", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCANTIDAD_Internalname, GXutil.ltrim( localUtil.ntoc( A554CANTIDAD, (byte)(4), (byte)(0), ",", "")), ((edtCANTIDAD_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A554CANTIDAD), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A554CANTIDAD), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCANTIDAD_Jsonclick, 0, "Attribute", "", "", "", 1, edtCANTIDAD_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOBSERVACIONES_Internalname, "OBSERVACIONES", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtOBSERVACIONES_Internalname, A602OBSERVACIONES, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", (short)(0), 1, edtOBSERVACIONES_Enabled, 0, 80, "chr", 7, "row", StyleString, ClassString, "", "500", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MAS_CARGUE_SALIDAS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_SALIDAS.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNUMTRN_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNUMTRN_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NUMTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNUMTRN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A78NUMTRN = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
            }
            else
            {
               A78NUMTRN = localUtil.ctol( httpContext.cgiGet( edtNUMTRN_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_SALIDA_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_SALIDA_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_SALIDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtID_SALIDA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A79ID_SALIDA = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
            }
            else
            {
               A79ID_SALIDA = (short)(localUtil.ctol( httpContext.cgiGet( edtID_SALIDA_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
            }
            A530PLACASENA = httpContext.cgiGet( edtPLACASENA_Internalname) ;
            n530PLACASENA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A530PLACASENA", A530PLACASENA);
            n530PLACASENA = ((GXutil.strcmp("", A530PLACASENA)==0) ? true : false) ;
            A553CONSECUTIVO = httpContext.cgiGet( edtCONSECUTIVO_Internalname) ;
            n553CONSECUTIVO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A553CONSECUTIVO", A553CONSECUTIVO);
            n553CONSECUTIVO = ((GXutil.strcmp("", A553CONSECUTIVO)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCANTIDAD_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCANTIDAD_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CANTIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCANTIDAD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A554CANTIDAD = (short)(0) ;
               n554CANTIDAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A554CANTIDAD", GXutil.ltrim( GXutil.str( A554CANTIDAD, 4, 0)));
            }
            else
            {
               A554CANTIDAD = (short)(localUtil.ctol( httpContext.cgiGet( edtCANTIDAD_Internalname), ",", ".")) ;
               n554CANTIDAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A554CANTIDAD", GXutil.ltrim( GXutil.str( A554CANTIDAD, 4, 0)));
            }
            n554CANTIDAD = ((0==A554CANTIDAD) ? true : false) ;
            A602OBSERVACIONES = httpContext.cgiGet( edtOBSERVACIONES_Internalname) ;
            n602OBSERVACIONES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602OBSERVACIONES", A602OBSERVACIONES);
            n602OBSERVACIONES = ((GXutil.strcmp("", A602OBSERVACIONES)==0) ? true : false) ;
            /* Read saved values. */
            Z78NUMTRN = localUtil.ctol( httpContext.cgiGet( "Z78NUMTRN"), ",", ".") ;
            Z79ID_SALIDA = (short)(localUtil.ctol( httpContext.cgiGet( "Z79ID_SALIDA"), ",", ".")) ;
            Z530PLACASENA = httpContext.cgiGet( "Z530PLACASENA") ;
            n530PLACASENA = ((GXutil.strcmp("", A530PLACASENA)==0) ? true : false) ;
            Z553CONSECUTIVO = httpContext.cgiGet( "Z553CONSECUTIVO") ;
            n553CONSECUTIVO = ((GXutil.strcmp("", A553CONSECUTIVO)==0) ? true : false) ;
            Z554CANTIDAD = (short)(localUtil.ctol( httpContext.cgiGet( "Z554CANTIDAD"), ",", ".")) ;
            n554CANTIDAD = ((0==A554CANTIDAD) ? true : false) ;
            Z602OBSERVACIONES = httpContext.cgiGet( "Z602OBSERVACIONES") ;
            n602OBSERVACIONES = ((GXutil.strcmp("", A602OBSERVACIONES)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11Ind6 = httpContext.cgiGet( "vIND6") ;
            AV8Ind2 = httpContext.cgiGet( "vIND2") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A78NUMTRN = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
               A79ID_SALIDA = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1A47( ) ;
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
   }

   public void disable_std_buttons_dsp( )
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
      }
      disableAttributes1A47( ) ;
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

   public void resetCaption1A0( )
   {
   }

   public void zm1A47( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z530PLACASENA = T001A3_A530PLACASENA[0] ;
            Z553CONSECUTIVO = T001A3_A553CONSECUTIVO[0] ;
            Z554CANTIDAD = T001A3_A554CANTIDAD[0] ;
            Z602OBSERVACIONES = T001A3_A602OBSERVACIONES[0] ;
         }
         else
         {
            Z530PLACASENA = A530PLACASENA ;
            Z553CONSECUTIVO = A553CONSECUTIVO ;
            Z554CANTIDAD = A554CANTIDAD ;
            Z602OBSERVACIONES = A602OBSERVACIONES ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
         Z530PLACASENA = A530PLACASENA ;
         Z553CONSECUTIVO = A553CONSECUTIVO ;
         Z554CANTIDAD = A554CANTIDAD ;
         Z602OBSERVACIONES = A602OBSERVACIONES ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
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
   }

   public void load1A47( )
   {
      /* Using cursor T001A4 */
      pr_default.execute(2, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A530PLACASENA = T001A4_A530PLACASENA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530PLACASENA", A530PLACASENA);
         n530PLACASENA = T001A4_n530PLACASENA[0] ;
         A553CONSECUTIVO = T001A4_A553CONSECUTIVO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A553CONSECUTIVO", A553CONSECUTIVO);
         n553CONSECUTIVO = T001A4_n553CONSECUTIVO[0] ;
         A554CANTIDAD = T001A4_A554CANTIDAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554CANTIDAD", GXutil.ltrim( GXutil.str( A554CANTIDAD, 4, 0)));
         n554CANTIDAD = T001A4_n554CANTIDAD[0] ;
         A602OBSERVACIONES = T001A4_A602OBSERVACIONES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602OBSERVACIONES", A602OBSERVACIONES);
         n602OBSERVACIONES = T001A4_n602OBSERVACIONES[0] ;
         zm1A47( -8) ;
      }
      pr_default.close(2);
      onLoadActions1A47( ) ;
   }

   public void onLoadActions1A47( )
   {
   }

   public void checkExtendedTable1A47( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! (GXutil.strcmp("", A530PLACASENA)==0) )
      {
         GXv_char1[0] = AV11Ind6 ;
         new com.orions2.validaplaca(remoteHandle, context).execute( GXutil.trim( A530PLACASENA), GXv_char1) ;
         mas_cargue_salidas_impl.this.AV11Ind6 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Ind6", AV11Ind6);
      }
      if ( GXutil.strcmp(AV11Ind6, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("PLACASENA: No existe en el invetario", "c01", 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (GXutil.strcmp("", A553CONSECUTIVO)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: El dato no es válido o se encuentra vacio", "c01", 1, "PLACASENA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLACASENA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: El dato no es válido o se encuentra vacio", "c01", 1, "PLACASENA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLACASENA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A530PLACASENA)==0) && (GXutil.strcmp("", A553CONSECUTIVO)==0) && (0==A554CANTIDAD) )
      {
         httpContext.GX_msglist.addItem("CANTIDAD: El dato no es válido o se encuentra vacio", "c02", 1, "PLACASENA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLACASENA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", A553CONSECUTIVO)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A553CONSECUTIVO), GXv_char1) ;
         mas_cargue_salidas_impl.this.AV8Ind2 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Ind2", AV8Ind2);
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("ELEMENTO: No existe resgitro", "c01", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1A47( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1A47( )
   {
      /* Using cursor T001A5 */
      pr_default.execute(3, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001A3 */
      pr_default.execute(1, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1A47( 8) ;
         RcdFound47 = (short)(1) ;
         A78NUMTRN = T001A3_A78NUMTRN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
         A79ID_SALIDA = T001A3_A79ID_SALIDA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
         A530PLACASENA = T001A3_A530PLACASENA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530PLACASENA", A530PLACASENA);
         n530PLACASENA = T001A3_n530PLACASENA[0] ;
         A553CONSECUTIVO = T001A3_A553CONSECUTIVO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A553CONSECUTIVO", A553CONSECUTIVO);
         n553CONSECUTIVO = T001A3_n553CONSECUTIVO[0] ;
         A554CANTIDAD = T001A3_A554CANTIDAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554CANTIDAD", GXutil.ltrim( GXutil.str( A554CANTIDAD, 4, 0)));
         n554CANTIDAD = T001A3_n554CANTIDAD[0] ;
         A602OBSERVACIONES = T001A3_A602OBSERVACIONES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602OBSERVACIONES", A602OBSERVACIONES);
         n602OBSERVACIONES = T001A3_n602OBSERVACIONES[0] ;
         Z78NUMTRN = A78NUMTRN ;
         Z79ID_SALIDA = A79ID_SALIDA ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1A47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1A47( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1A47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T001A6 */
      pr_default.execute(4, new Object[] {new Long(A78NUMTRN), new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001A6_A78NUMTRN[0] < A78NUMTRN ) || ( T001A6_A78NUMTRN[0] == A78NUMTRN ) && ( T001A6_A79ID_SALIDA[0] < A79ID_SALIDA ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001A6_A78NUMTRN[0] > A78NUMTRN ) || ( T001A6_A78NUMTRN[0] == A78NUMTRN ) && ( T001A6_A79ID_SALIDA[0] > A79ID_SALIDA ) ) )
         {
            A78NUMTRN = T001A6_A78NUMTRN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
            A79ID_SALIDA = T001A6_A79ID_SALIDA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T001A7 */
      pr_default.execute(5, new Object[] {new Long(A78NUMTRN), new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001A7_A78NUMTRN[0] > A78NUMTRN ) || ( T001A7_A78NUMTRN[0] == A78NUMTRN ) && ( T001A7_A79ID_SALIDA[0] > A79ID_SALIDA ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001A7_A78NUMTRN[0] < A78NUMTRN ) || ( T001A7_A78NUMTRN[0] == A78NUMTRN ) && ( T001A7_A79ID_SALIDA[0] < A79ID_SALIDA ) ) )
         {
            A78NUMTRN = T001A7_A78NUMTRN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
            A79ID_SALIDA = T001A7_A79ID_SALIDA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A47( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtNUMTRN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1A47( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
            {
               A78NUMTRN = Z78NUMTRN ;
               httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
               A79ID_SALIDA = Z79ID_SALIDA ;
               httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NUMTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNUMTRN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNUMTRN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1A47( ) ;
               GX_FocusControl = edtNUMTRN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtNUMTRN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1A47( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NUMTRN");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNUMTRN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtNUMTRN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1A47( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( A78NUMTRN != Z78NUMTRN ) || ( A79ID_SALIDA != Z79ID_SALIDA ) )
      {
         A78NUMTRN = Z78NUMTRN ;
         httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
         A79ID_SALIDA = Z79ID_SALIDA ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NUMTRN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNUMTRN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNUMTRN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "NUMTRN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNUMTRN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1A47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1A47( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1A47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001A2 */
         pr_default.execute(0, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z530PLACASENA, T001A2_A530PLACASENA[0]) != 0 ) || ( GXutil.strcmp(Z553CONSECUTIVO, T001A2_A553CONSECUTIVO[0]) != 0 ) || ( Z554CANTIDAD != T001A2_A554CANTIDAD[0] ) || ( GXutil.strcmp(Z602OBSERVACIONES, T001A2_A602OBSERVACIONES[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A47( )
   {
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A47( 0) ;
         checkOptimisticConcurrency1A47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A8 */
                  pr_default.execute(6, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA), new Boolean(n530PLACASENA), A530PLACASENA, new Boolean(n553CONSECUTIVO), A553CONSECUTIVO, new Boolean(n554CANTIDAD), new Short(A554CANTIDAD), new Boolean(n602OBSERVACIONES), A602OBSERVACIONES});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption1A0( ) ;
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
            load1A47( ) ;
         }
         endLevel1A47( ) ;
      }
      closeExtendedTableCursors1A47( ) ;
   }

   public void update1A47( )
   {
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A9 */
                  pr_default.execute(7, new Object[] {new Boolean(n530PLACASENA), A530PLACASENA, new Boolean(n553CONSECUTIVO), A553CONSECUTIVO, new Boolean(n554CANTIDAD), new Short(A554CANTIDAD), new Boolean(n602OBSERVACIONES), A602OBSERVACIONES, new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_SALIDAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption1A0( ) ;
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
         endLevel1A47( ) ;
      }
      closeExtendedTableCursors1A47( ) ;
   }

   public void deferredUpdate1A47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A47( ) ;
         afterConfirm1A47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A47( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001A10 */
               pr_default.execute(8, new Object[] {new Long(A78NUMTRN), new Short(A79ID_SALIDA)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_SALIDAS") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound47 == 0 )
                     {
                        initAll1A47( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), "SuccessfullyDeleted", 0, "", true);
                     resetCaption1A0( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A47( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1A47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_salidas");
         if ( AnyError == 0 )
         {
            confirmValues1A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_salidas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1A47( )
   {
      /* Using cursor T001A11 */
      pr_default.execute(9);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A78NUMTRN = T001A11_A78NUMTRN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
         A79ID_SALIDA = T001A11_A79ID_SALIDA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A47( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A78NUMTRN = T001A11_A78NUMTRN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
         A79ID_SALIDA = T001A11_A79ID_SALIDA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
      }
   }

   public void scanEnd1A47( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1A47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A47( )
   {
      edtNUMTRN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNUMTRN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNUMTRN_Enabled, 5, 0)), true);
      edtID_SALIDA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_SALIDA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtID_SALIDA_Enabled, 5, 0)), true);
      edtPLACASENA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLACASENA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtPLACASENA_Enabled, 5, 0)), true);
      edtCONSECUTIVO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCONSECUTIVO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCONSECUTIVO_Enabled, 5, 0)), true);
      edtCANTIDAD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCANTIDAD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCANTIDAD_Enabled, 5, 0)), true);
      edtOBSERVACIONES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOBSERVACIONES_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOBSERVACIONES_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1A0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414172525");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.mas_cargue_salidas") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z78NUMTRN", GXutil.ltrim( localUtil.ntoc( Z78NUMTRN, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z79ID_SALIDA", GXutil.ltrim( localUtil.ntoc( Z79ID_SALIDA, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z530PLACASENA", Z530PLACASENA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z553CONSECUTIVO", Z553CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z554CANTIDAD", GXutil.ltrim( localUtil.ntoc( Z554CANTIDAD, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z602OBSERVACIONES", Z602OBSERVACIONES);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND6", AV11Ind6);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND2", AV8Ind2);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      return formatLink("com.orions2.mas_cargue_salidas")  ;
   }

   public String getPgmname( )
   {
      return "MAS_CARGUE_SALIDAS" ;
   }

   public String getPgmdesc( )
   {
      return "MAS_CARGUE_SALIDAS" ;
   }

   public void initializeNonKey1A47( )
   {
      AV11Ind6 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Ind6", AV11Ind6);
      AV8Ind2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Ind2", AV8Ind2);
      A530PLACASENA = "" ;
      n530PLACASENA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A530PLACASENA", A530PLACASENA);
      n530PLACASENA = ((GXutil.strcmp("", A530PLACASENA)==0) ? true : false) ;
      A553CONSECUTIVO = "" ;
      n553CONSECUTIVO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A553CONSECUTIVO", A553CONSECUTIVO);
      n553CONSECUTIVO = ((GXutil.strcmp("", A553CONSECUTIVO)==0) ? true : false) ;
      A554CANTIDAD = (short)(0) ;
      n554CANTIDAD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A554CANTIDAD", GXutil.ltrim( GXutil.str( A554CANTIDAD, 4, 0)));
      n554CANTIDAD = ((0==A554CANTIDAD) ? true : false) ;
      A602OBSERVACIONES = "" ;
      n602OBSERVACIONES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602OBSERVACIONES", A602OBSERVACIONES);
      n602OBSERVACIONES = ((GXutil.strcmp("", A602OBSERVACIONES)==0) ? true : false) ;
      Z530PLACASENA = "" ;
      Z553CONSECUTIVO = "" ;
      Z554CANTIDAD = (short)(0) ;
      Z602OBSERVACIONES = "" ;
   }

   public void initAll1A47( )
   {
      A78NUMTRN = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A78NUMTRN", GXutil.ltrim( GXutil.str( A78NUMTRN, 11, 0)));
      A79ID_SALIDA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A79ID_SALIDA", GXutil.ltrim( GXutil.str( A79ID_SALIDA, 4, 0)));
      initializeNonKey1A47( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414172531");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("mas_cargue_salidas.js", "?201861414172531");
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
      edtNUMTRN_Internalname = "NUMTRN" ;
      edtID_SALIDA_Internalname = "ID_SALIDA" ;
      edtPLACASENA_Internalname = "PLACASENA" ;
      edtCONSECUTIVO_Internalname = "CONSECUTIVO" ;
      edtCANTIDAD_Internalname = "CANTIDAD" ;
      edtOBSERVACIONES_Internalname = "OBSERVACIONES" ;
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
      Form.setCaption( "MAS_CARGUE_SALIDAS" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtOBSERVACIONES_Enabled = 1 ;
      edtCANTIDAD_Jsonclick = "" ;
      edtCANTIDAD_Enabled = 1 ;
      edtCONSECUTIVO_Jsonclick = "" ;
      edtCONSECUTIVO_Enabled = 1 ;
      edtPLACASENA_Jsonclick = "" ;
      edtPLACASENA_Enabled = 1 ;
      edtID_SALIDA_Jsonclick = "" ;
      edtID_SALIDA_Enabled = 1 ;
      edtNUMTRN_Jsonclick = "" ;
      edtNUMTRN_Enabled = 1 ;
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

   public void xc_1_1A47( )
   {
      if ( ! (GXutil.strcmp("", A530PLACASENA)==0) )
      {
         GXv_char1[0] = AV11Ind6 ;
         new com.orions2.validaplaca(remoteHandle, context).execute( GXutil.trim( A530PLACASENA), GXv_char1) ;
         AV11Ind6 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Ind6", AV11Ind6);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_5_1A47( )
   {
      if ( ! (GXutil.strcmp("", A553CONSECUTIVO)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A553CONSECUTIVO), GXv_char1) ;
         AV8Ind2 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Ind2", AV8Ind2);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtPLACASENA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Id_salida( long GX_Parm1 ,
                                short GX_Parm2 ,
                                String GX_Parm3 ,
                                String GX_Parm4 ,
                                short GX_Parm5 ,
                                String GX_Parm6 )
   {
      A78NUMTRN = GX_Parm1 ;
      A79ID_SALIDA = GX_Parm2 ;
      A530PLACASENA = GX_Parm3 ;
      n530PLACASENA = false ;
      A553CONSECUTIVO = GX_Parm4 ;
      n553CONSECUTIVO = false ;
      A554CANTIDAD = GX_Parm5 ;
      n554CANTIDAD = false ;
      A602OBSERVACIONES = GX_Parm6 ;
      n602OBSERVACIONES = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A530PLACASENA);
      isValidOutput.add(A553CONSECUTIVO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A554CANTIDAD, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A602OBSERVACIONES);
      isValidOutput.add(AV11Ind6);
      isValidOutput.add(AV8Ind2);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z78NUMTRN, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z79ID_SALIDA, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Z530PLACASENA);
      isValidOutput.add(Z553CONSECUTIVO);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z554CANTIDAD, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Z602OBSERVACIONES);
      isValidOutput.add(ZV11Ind6);
      isValidOutput.add(ZV8Ind2);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Placasena( String GX_Parm1 ,
                                String GX_Parm2 )
   {
      A530PLACASENA = GX_Parm1 ;
      n530PLACASENA = false ;
      AV11Ind6 = GX_Parm2 ;
      if ( ! (GXutil.strcmp("", A530PLACASENA)==0) )
      {
         GXv_char1[0] = AV11Ind6 ;
         new com.orions2.validaplaca(remoteHandle, context).execute( GXutil.trim( A530PLACASENA), GXv_char1) ;
         mas_cargue_salidas_impl.this.AV11Ind6 = GXv_char1[0] ;
         AV11Ind6 = this.AV11Ind6 ;
      }
      if ( GXutil.strcmp(AV11Ind6, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("PLACASENA: No existe en el invetario", "c01", 1, "PLACASENA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPLACASENA_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV11Ind6);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Consecutivo( String GX_Parm1 ,
                                  String GX_Parm2 )
   {
      A553CONSECUTIVO = GX_Parm1 ;
      n553CONSECUTIVO = false ;
      AV8Ind2 = GX_Parm2 ;
      if ( ! (GXutil.strcmp("", A553CONSECUTIVO)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A553CONSECUTIVO), GXv_char1) ;
         mas_cargue_salidas_impl.this.AV8Ind2 = GXv_char1[0] ;
         AV8Ind2 = this.AV8Ind2 ;
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("ELEMENTO: No existe resgitro", "c01", 1, "CONSECUTIVO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCONSECUTIVO_Internalname ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(AV8Ind2);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
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
      Z530PLACASENA = "" ;
      Z553CONSECUTIVO = "" ;
      Z602OBSERVACIONES = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A530PLACASENA = "" ;
      A553CONSECUTIVO = "" ;
      A602OBSERVACIONES = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      AV11Ind6 = "" ;
      AV8Ind2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001A4_A78NUMTRN = new long[1] ;
      T001A4_A79ID_SALIDA = new short[1] ;
      T001A4_A530PLACASENA = new String[] {""} ;
      T001A4_n530PLACASENA = new boolean[] {false} ;
      T001A4_A553CONSECUTIVO = new String[] {""} ;
      T001A4_n553CONSECUTIVO = new boolean[] {false} ;
      T001A4_A554CANTIDAD = new short[1] ;
      T001A4_n554CANTIDAD = new boolean[] {false} ;
      T001A4_A602OBSERVACIONES = new String[] {""} ;
      T001A4_n602OBSERVACIONES = new boolean[] {false} ;
      T001A5_A78NUMTRN = new long[1] ;
      T001A5_A79ID_SALIDA = new short[1] ;
      T001A3_A78NUMTRN = new long[1] ;
      T001A3_A79ID_SALIDA = new short[1] ;
      T001A3_A530PLACASENA = new String[] {""} ;
      T001A3_n530PLACASENA = new boolean[] {false} ;
      T001A3_A553CONSECUTIVO = new String[] {""} ;
      T001A3_n553CONSECUTIVO = new boolean[] {false} ;
      T001A3_A554CANTIDAD = new short[1] ;
      T001A3_n554CANTIDAD = new boolean[] {false} ;
      T001A3_A602OBSERVACIONES = new String[] {""} ;
      T001A3_n602OBSERVACIONES = new boolean[] {false} ;
      sMode47 = "" ;
      T001A6_A78NUMTRN = new long[1] ;
      T001A6_A79ID_SALIDA = new short[1] ;
      T001A7_A78NUMTRN = new long[1] ;
      T001A7_A79ID_SALIDA = new short[1] ;
      T001A2_A78NUMTRN = new long[1] ;
      T001A2_A79ID_SALIDA = new short[1] ;
      T001A2_A530PLACASENA = new String[] {""} ;
      T001A2_n530PLACASENA = new boolean[] {false} ;
      T001A2_A553CONSECUTIVO = new String[] {""} ;
      T001A2_n553CONSECUTIVO = new boolean[] {false} ;
      T001A2_A554CANTIDAD = new short[1] ;
      T001A2_n554CANTIDAD = new boolean[] {false} ;
      T001A2_A602OBSERVACIONES = new String[] {""} ;
      T001A2_n602OBSERVACIONES = new boolean[] {false} ;
      T001A11_A78NUMTRN = new long[1] ;
      T001A11_A79ID_SALIDA = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV11Ind6 = "" ;
      ZV8Ind2 = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      GXv_char1 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.mas_cargue_salidas__default(),
         new Object[] {
             new Object[] {
            T001A2_A78NUMTRN, T001A2_A79ID_SALIDA, T001A2_A530PLACASENA, T001A2_n530PLACASENA, T001A2_A553CONSECUTIVO, T001A2_n553CONSECUTIVO, T001A2_A554CANTIDAD, T001A2_n554CANTIDAD, T001A2_A602OBSERVACIONES, T001A2_n602OBSERVACIONES
            }
            , new Object[] {
            T001A3_A78NUMTRN, T001A3_A79ID_SALIDA, T001A3_A530PLACASENA, T001A3_n530PLACASENA, T001A3_A553CONSECUTIVO, T001A3_n553CONSECUTIVO, T001A3_A554CANTIDAD, T001A3_n554CANTIDAD, T001A3_A602OBSERVACIONES, T001A3_n602OBSERVACIONES
            }
            , new Object[] {
            T001A4_A78NUMTRN, T001A4_A79ID_SALIDA, T001A4_A530PLACASENA, T001A4_n530PLACASENA, T001A4_A553CONSECUTIVO, T001A4_n553CONSECUTIVO, T001A4_A554CANTIDAD, T001A4_n554CANTIDAD, T001A4_A602OBSERVACIONES, T001A4_n602OBSERVACIONES
            }
            , new Object[] {
            T001A5_A78NUMTRN, T001A5_A79ID_SALIDA
            }
            , new Object[] {
            T001A6_A78NUMTRN, T001A6_A79ID_SALIDA
            }
            , new Object[] {
            T001A7_A78NUMTRN, T001A7_A79ID_SALIDA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001A11_A78NUMTRN, T001A11_A79ID_SALIDA
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z79ID_SALIDA ;
   private short Z554CANTIDAD ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A79ID_SALIDA ;
   private short A554CANTIDAD ;
   private short RcdFound47 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtNUMTRN_Enabled ;
   private int edtID_SALIDA_Enabled ;
   private int edtPLACASENA_Enabled ;
   private int edtCONSECUTIVO_Enabled ;
   private int edtCANTIDAD_Enabled ;
   private int edtOBSERVACIONES_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z78NUMTRN ;
   private long A78NUMTRN ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtNUMTRN_Internalname ;
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
   private String edtNUMTRN_Jsonclick ;
   private String edtID_SALIDA_Internalname ;
   private String edtID_SALIDA_Jsonclick ;
   private String edtPLACASENA_Internalname ;
   private String edtPLACASENA_Jsonclick ;
   private String edtCONSECUTIVO_Internalname ;
   private String edtCONSECUTIVO_Jsonclick ;
   private String edtCANTIDAD_Internalname ;
   private String edtCANTIDAD_Jsonclick ;
   private String edtOBSERVACIONES_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode47 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char1[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n530PLACASENA ;
   private boolean n553CONSECUTIVO ;
   private boolean n554CANTIDAD ;
   private boolean n602OBSERVACIONES ;
   private String Z530PLACASENA ;
   private String Z553CONSECUTIVO ;
   private String Z602OBSERVACIONES ;
   private String A530PLACASENA ;
   private String A553CONSECUTIVO ;
   private String A602OBSERVACIONES ;
   private String AV11Ind6 ;
   private String AV8Ind2 ;
   private String ZV11Ind6 ;
   private String ZV8Ind2 ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001A4_A78NUMTRN ;
   private short[] T001A4_A79ID_SALIDA ;
   private String[] T001A4_A530PLACASENA ;
   private boolean[] T001A4_n530PLACASENA ;
   private String[] T001A4_A553CONSECUTIVO ;
   private boolean[] T001A4_n553CONSECUTIVO ;
   private short[] T001A4_A554CANTIDAD ;
   private boolean[] T001A4_n554CANTIDAD ;
   private String[] T001A4_A602OBSERVACIONES ;
   private boolean[] T001A4_n602OBSERVACIONES ;
   private long[] T001A5_A78NUMTRN ;
   private short[] T001A5_A79ID_SALIDA ;
   private long[] T001A3_A78NUMTRN ;
   private short[] T001A3_A79ID_SALIDA ;
   private String[] T001A3_A530PLACASENA ;
   private boolean[] T001A3_n530PLACASENA ;
   private String[] T001A3_A553CONSECUTIVO ;
   private boolean[] T001A3_n553CONSECUTIVO ;
   private short[] T001A3_A554CANTIDAD ;
   private boolean[] T001A3_n554CANTIDAD ;
   private String[] T001A3_A602OBSERVACIONES ;
   private boolean[] T001A3_n602OBSERVACIONES ;
   private long[] T001A6_A78NUMTRN ;
   private short[] T001A6_A79ID_SALIDA ;
   private long[] T001A7_A78NUMTRN ;
   private short[] T001A7_A79ID_SALIDA ;
   private long[] T001A2_A78NUMTRN ;
   private short[] T001A2_A79ID_SALIDA ;
   private String[] T001A2_A530PLACASENA ;
   private boolean[] T001A2_n530PLACASENA ;
   private String[] T001A2_A553CONSECUTIVO ;
   private boolean[] T001A2_n553CONSECUTIVO ;
   private short[] T001A2_A554CANTIDAD ;
   private boolean[] T001A2_n554CANTIDAD ;
   private String[] T001A2_A602OBSERVACIONES ;
   private boolean[] T001A2_n602OBSERVACIONES ;
   private long[] T001A11_A78NUMTRN ;
   private short[] T001A11_A79ID_SALIDA ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mas_cargue_salidas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001A2", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ?  FOR UPDATE OF PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A3", "SELECT NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A4", "SELECT /*+ FIRST_ROWS(100) */ TM1.NUMTRN, TM1.ID_SALIDA, TM1.PLACASENA, TM1.CONSECUTIVO, TM1.CANTIDAD, TM1.OBSERVACIONES FROM MAS_CARGUE_SALIDAS TM1 WHERE TM1.NUMTRN = ? and TM1.ID_SALIDA = ? ORDER BY TM1.NUMTRN, TM1.ID_SALIDA ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001A5", "SELECT /*+ FIRST_ROWS(1) */ NUMTRN, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE NUMTRN = ? AND ID_SALIDA = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NUMTRN, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE ( NUMTRN > ? or NUMTRN = ? and ID_SALIDA > ?) ORDER BY NUMTRN, ID_SALIDA) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001A7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NUMTRN, ID_SALIDA FROM MAS_CARGUE_SALIDAS WHERE ( NUMTRN < ? or NUMTRN = ? and ID_SALIDA < ?) ORDER BY NUMTRN DESC, ID_SALIDA DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001A8", "INSERT INTO MAS_CARGUE_SALIDAS(NUMTRN, ID_SALIDA, PLACASENA, CONSECUTIVO, CANTIDAD, OBSERVACIONES) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new UpdateCursor("T001A9", "UPDATE MAS_CARGUE_SALIDAS SET PLACASENA=?, CONSECUTIVO=?, CANTIDAD=?, OBSERVACIONES=?  WHERE NUMTRN = ? AND ID_SALIDA = ?", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new UpdateCursor("T001A10", "DELETE FROM MAS_CARGUE_SALIDAS  WHERE NUMTRN = ? AND ID_SALIDA = ?", GX_NOMASK, "MAS_CARGUE_SALIDAS")
         ,new ForEachCursor("T001A11", "SELECT /*+ FIRST_ROWS(100) */ NUMTRN, ID_SALIDA FROM MAS_CARGUE_SALIDAS ORDER BY NUMTRN, ID_SALIDA ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 9);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 500);
               }
               return;
            case 7 :
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
                  stmt.setVarchar(2, (String)parms[3], 9);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 500);
               }
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setShort(6, ((Number) parms[9]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

