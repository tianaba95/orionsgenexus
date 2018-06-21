/*
               File: mas_cargue_entrada_impl
        Description: MAS_CARGUE_ENTRADA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:26.44
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

public final  class mas_cargue_entrada_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action2") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_2_1C49( ) ;
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
         Form.getMeta().addItem("description", "MAS_CARGUE_ENTRADA", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtNROTRANSACCION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mas_cargue_entrada_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mas_cargue_entrada_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mas_cargue_entrada_impl.class ));
   }

   public mas_cargue_entrada_impl( int remoteHandle ,
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "MAS_CARGUE_ENTRADA", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx01d0"+"',["+"{Ctrl:gx.dom.el('"+"NROTRANSACCION"+"'), id:'"+"NROTRANSACCION"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"IDCARMAS"+"'), id:'"+"IDCARMAS"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNROTRANSACCION_Internalname, "NROTRANSACCION", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNROTRANSACCION_Internalname, GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")), ((edtNROTRANSACCION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A83NROTRANSACCION), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A83NROTRANSACCION), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNROTRANSACCION_Jsonclick, 0, "Attribute", "", "", "", 1, edtNROTRANSACCION_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtIDCARMAS_Internalname, "IDCARMAS", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtIDCARMAS_Internalname, GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ",", "")), ((edtIDCARMAS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A84IDCARMAS), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A84IDCARMAS), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIDCARMAS_Jsonclick, 0, "Attribute", "", "", "", 1, edtIDCARMAS_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCONSECUTIVOENTRADA_Internalname, "CONSECUTIVOENTRADA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCONSECUTIVOENTRADA_Internalname, A537CONSECUTIVOENTRADA, GXutil.rtrim( localUtil.format( A537CONSECUTIVOENTRADA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCONSECUTIVOENTRADA_Jsonclick, 0, "Attribute", "", "", "", 1, edtCONSECUTIVOENTRADA_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCOSTOADQUISICION_Internalname, "COSTOADQUISICION", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCOSTOADQUISICION_Internalname, GXutil.ltrim( localUtil.ntoc( A538COSTOADQUISICION, (byte)(24), (byte)(2), ",", "")), ((edtCOSTOADQUISICION_Enabled!=0) ? GXutil.ltrim( localUtil.format( A538COSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A538COSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCOSTOADQUISICION_Jsonclick, 0, "Attribute", "", "", "", 1, edtCOSTOADQUISICION_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtDESCRIPCIONENTRADA_Internalname, "DESCRIPCIONENTRADA", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtDESCRIPCIONENTRADA_Internalname, A540DESCRIPCIONENTRADA, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", (short)(0), 1, edtDESCRIPCIONENTRADA_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtCANTIDADENTRADA_Internalname, "CANTIDADENTRADA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtCANTIDADENTRADA_Internalname, GXutil.ltrim( localUtil.ntoc( A601CANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")), ((edtCANTIDADENTRADA_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A601CANTIDADENTRADA), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A601CANTIDADENTRADA), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCANTIDADENTRADA_Jsonclick, 0, "Attribute", "", "", "", 1, edtCANTIDADENTRADA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtINDICADORPHI_Internalname, "INDICADORPHI", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtINDICADORPHI_Internalname, GXutil.ltrim( localUtil.ntoc( A686INDICADORPHI, (byte)(4), (byte)(0), ",", "")), ((edtINDICADORPHI_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A686INDICADORPHI), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A686INDICADORPHI), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtINDICADORPHI_Jsonclick, 0, "Attribute", "", "", "", 1, edtINDICADORPHI_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVALORFUTURO_Internalname, "VALORFUTURO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVALORFUTURO_Internalname, GXutil.ltrim( localUtil.ntoc( A645VALORFUTURO, (byte)(24), (byte)(2), ",", "")), ((edtVALORFUTURO_Enabled!=0) ? GXutil.ltrim( localUtil.format( A645VALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A645VALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVALORFUTURO_Jsonclick, 0, "Attribute", "", "", "", 1, edtVALORFUTURO_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIEMPO_Internalname, "TIEMPO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIEMPO_Internalname, GXutil.ltrim( localUtil.ntoc( A647TIEMPO, (byte)(4), (byte)(0), ",", "")), ((edtTIEMPO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A647TIEMPO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A647TIEMPO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIEMPO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIEMPO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtINTERES_Internalname, "INTERES", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtINTERES_Internalname, GXutil.ltrim( localUtil.ntoc( A646INTERES, (byte)(6), (byte)(2), ",", "")), ((edtINTERES_Enabled!=0) ? GXutil.ltrim( localUtil.format( A646INTERES, "ZZ9.99")) : localUtil.format( A646INTERES, "ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtINTERES_Jsonclick, 0, "Attribute", "", "", "", 1, edtINTERES_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtVIDAUTIL_Internalname, "VIDAUTIL", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtVIDAUTIL_Internalname, GXutil.ltrim( localUtil.ntoc( A648VIDAUTIL, (byte)(4), (byte)(0), ",", "")), ((edtVIDAUTIL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A648VIDAUTIL), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A648VIDAUTIL), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVIDAUTIL_Jsonclick, 0, "Attribute", "", "", "", 1, edtVIDAUTIL_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtOTROSCOSTOS_Internalname, "OTROSCOSTOS", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtOTROSCOSTOS_Internalname, GXutil.ltrim( localUtil.ntoc( A644OTROSCOSTOS, (byte)(24), (byte)(2), ",", "")), ((edtOTROSCOSTOS_Enabled!=0) ? GXutil.ltrim( localUtil.format( A644OTROSCOSTOS, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A644OTROSCOSTOS, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOTROSCOSTOS_Jsonclick, 0, "Attribute", "", "", "", 1, edtOTROSCOSTOS_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMARCA_Internalname, "MARCA", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMARCA_Internalname, A605MARCA, GXutil.rtrim( localUtil.format( A605MARCA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMARCA_Jsonclick, 0, "Attribute", "", "", "", 1, edtMARCA_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtMODELO_Internalname, "MODELO", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtMODELO_Internalname, A607MODELO, GXutil.rtrim( localUtil.format( A607MODELO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMODELO_Jsonclick, 0, "Attribute", "", "", "", 1, edtMODELO_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSERIAL_Internalname, "SERIAL", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSERIAL_Internalname, A606SERIAL, GXutil.rtrim( localUtil.format( A606SERIAL, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSERIAL_Jsonclick, 0, "Attribute", "", "", "", 1, edtSERIAL_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_MAS_CARGUE_ENTRADA.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MAS_CARGUE_ENTRADA.htm");
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
      e111C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNROTRANSACCION_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNROTRANSACCION_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NROTRANSACCION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNROTRANSACCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A83NROTRANSACCION = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
            }
            else
            {
               A83NROTRANSACCION = localUtil.ctol( httpContext.cgiGet( edtNROTRANSACCION_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIDCARMAS_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIDCARMAS_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IDCARMAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIDCARMAS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A84IDCARMAS = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
            }
            else
            {
               A84IDCARMAS = (short)(localUtil.ctol( httpContext.cgiGet( edtIDCARMAS_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
            }
            A537CONSECUTIVOENTRADA = httpContext.cgiGet( edtCONSECUTIVOENTRADA_Internalname) ;
            n537CONSECUTIVOENTRADA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A537CONSECUTIVOENTRADA", A537CONSECUTIVOENTRADA);
            n537CONSECUTIVOENTRADA = ((GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCOSTOADQUISICION_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCOSTOADQUISICION_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTOADQUISICION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCOSTOADQUISICION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A538COSTOADQUISICION = DecimalUtil.ZERO ;
               n538COSTOADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A538COSTOADQUISICION", GXutil.ltrim( GXutil.str( A538COSTOADQUISICION, 18, 2)));
            }
            else
            {
               A538COSTOADQUISICION = localUtil.ctond( httpContext.cgiGet( edtCOSTOADQUISICION_Internalname)) ;
               n538COSTOADQUISICION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A538COSTOADQUISICION", GXutil.ltrim( GXutil.str( A538COSTOADQUISICION, 18, 2)));
            }
            n538COSTOADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A538COSTOADQUISICION)==0) ? true : false) ;
            A540DESCRIPCIONENTRADA = httpContext.cgiGet( edtDESCRIPCIONENTRADA_Internalname) ;
            n540DESCRIPCIONENTRADA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A540DESCRIPCIONENTRADA", A540DESCRIPCIONENTRADA);
            n540DESCRIPCIONENTRADA = ((GXutil.strcmp("", A540DESCRIPCIONENTRADA)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCANTIDADENTRADA_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCANTIDADENTRADA_Internalname), ",", ".") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CANTIDADENTRADA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCANTIDADENTRADA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A601CANTIDADENTRADA = 0 ;
               n601CANTIDADENTRADA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A601CANTIDADENTRADA", GXutil.ltrim( GXutil.str( A601CANTIDADENTRADA, 6, 0)));
            }
            else
            {
               A601CANTIDADENTRADA = (int)(localUtil.ctol( httpContext.cgiGet( edtCANTIDADENTRADA_Internalname), ",", ".")) ;
               n601CANTIDADENTRADA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A601CANTIDADENTRADA", GXutil.ltrim( GXutil.str( A601CANTIDADENTRADA, 6, 0)));
            }
            n601CANTIDADENTRADA = ((0==A601CANTIDADENTRADA) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtINDICADORPHI_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtINDICADORPHI_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INDICADORPHI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtINDICADORPHI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A686INDICADORPHI = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A686INDICADORPHI", GXutil.ltrim( GXutil.str( A686INDICADORPHI, 4, 0)));
            }
            else
            {
               A686INDICADORPHI = (short)(localUtil.ctol( httpContext.cgiGet( edtINDICADORPHI_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A686INDICADORPHI", GXutil.ltrim( GXutil.str( A686INDICADORPHI, 4, 0)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVALORFUTURO_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVALORFUTURO_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALORFUTURO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVALORFUTURO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A645VALORFUTURO = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A645VALORFUTURO", GXutil.ltrim( GXutil.str( A645VALORFUTURO, 18, 2)));
            }
            else
            {
               A645VALORFUTURO = localUtil.ctond( httpContext.cgiGet( edtVALORFUTURO_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A645VALORFUTURO", GXutil.ltrim( GXutil.str( A645VALORFUTURO, 18, 2)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTIEMPO_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTIEMPO_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIEMPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTIEMPO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A647TIEMPO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A647TIEMPO", GXutil.ltrim( GXutil.str( A647TIEMPO, 4, 0)));
            }
            else
            {
               A647TIEMPO = (short)(localUtil.ctol( httpContext.cgiGet( edtTIEMPO_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A647TIEMPO", GXutil.ltrim( GXutil.str( A647TIEMPO, 4, 0)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtINTERES_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtINTERES_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTERES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtINTERES_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A646INTERES = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A646INTERES", GXutil.ltrim( GXutil.str( A646INTERES, 6, 2)));
            }
            else
            {
               A646INTERES = localUtil.ctond( httpContext.cgiGet( edtINTERES_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A646INTERES", GXutil.ltrim( GXutil.str( A646INTERES, 6, 2)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVIDAUTIL_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVIDAUTIL_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VIDAUTIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVIDAUTIL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A648VIDAUTIL = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A648VIDAUTIL", GXutil.ltrim( GXutil.str( A648VIDAUTIL, 4, 0)));
            }
            else
            {
               A648VIDAUTIL = (short)(localUtil.ctol( httpContext.cgiGet( edtVIDAUTIL_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A648VIDAUTIL", GXutil.ltrim( GXutil.str( A648VIDAUTIL, 4, 0)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOTROSCOSTOS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOTROSCOSTOS_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OTROSCOSTOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOTROSCOSTOS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A644OTROSCOSTOS = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A644OTROSCOSTOS", GXutil.ltrim( GXutil.str( A644OTROSCOSTOS, 18, 2)));
            }
            else
            {
               A644OTROSCOSTOS = localUtil.ctond( httpContext.cgiGet( edtOTROSCOSTOS_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A644OTROSCOSTOS", GXutil.ltrim( GXutil.str( A644OTROSCOSTOS, 18, 2)));
            }
            A605MARCA = httpContext.cgiGet( edtMARCA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A605MARCA", A605MARCA);
            A607MODELO = httpContext.cgiGet( edtMODELO_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A607MODELO", A607MODELO);
            A606SERIAL = httpContext.cgiGet( edtSERIAL_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A606SERIAL", A606SERIAL);
            /* Read saved values. */
            Z83NROTRANSACCION = localUtil.ctol( httpContext.cgiGet( "Z83NROTRANSACCION"), ",", ".") ;
            Z84IDCARMAS = (short)(localUtil.ctol( httpContext.cgiGet( "Z84IDCARMAS"), ",", ".")) ;
            Z537CONSECUTIVOENTRADA = httpContext.cgiGet( "Z537CONSECUTIVOENTRADA") ;
            n537CONSECUTIVOENTRADA = ((GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) ? true : false) ;
            Z538COSTOADQUISICION = localUtil.ctond( httpContext.cgiGet( "Z538COSTOADQUISICION")) ;
            n538COSTOADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A538COSTOADQUISICION)==0) ? true : false) ;
            Z540DESCRIPCIONENTRADA = httpContext.cgiGet( "Z540DESCRIPCIONENTRADA") ;
            n540DESCRIPCIONENTRADA = ((GXutil.strcmp("", A540DESCRIPCIONENTRADA)==0) ? true : false) ;
            Z601CANTIDADENTRADA = (int)(localUtil.ctol( httpContext.cgiGet( "Z601CANTIDADENTRADA"), ",", ".")) ;
            n601CANTIDADENTRADA = ((0==A601CANTIDADENTRADA) ? true : false) ;
            Z686INDICADORPHI = (short)(localUtil.ctol( httpContext.cgiGet( "Z686INDICADORPHI"), ",", ".")) ;
            Z645VALORFUTURO = localUtil.ctond( httpContext.cgiGet( "Z645VALORFUTURO")) ;
            Z647TIEMPO = (short)(localUtil.ctol( httpContext.cgiGet( "Z647TIEMPO"), ",", ".")) ;
            Z646INTERES = localUtil.ctond( httpContext.cgiGet( "Z646INTERES")) ;
            Z648VIDAUTIL = (short)(localUtil.ctol( httpContext.cgiGet( "Z648VIDAUTIL"), ",", ".")) ;
            Z644OTROSCOSTOS = localUtil.ctond( httpContext.cgiGet( "Z644OTROSCOSTOS")) ;
            Z605MARCA = httpContext.cgiGet( "Z605MARCA") ;
            Z607MODELO = httpContext.cgiGet( "Z607MODELO") ;
            Z606SERIAL = httpContext.cgiGet( "Z606SERIAL") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A83NROTRANSACCION = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
               A84IDCARMAS = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
         /* Execute user event: After Trn */
         e121C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1C49( ) ;
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
      disableAttributes1C49( ) ;
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

   public void resetCaption1C0( )
   {
   }

   public void e111C2( )
   {
      /* Start Routine */
   }

   public void e121C2( )
   {
      /* After Trn Routine */
   }

   public void zm1C49( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z537CONSECUTIVOENTRADA = T001C3_A537CONSECUTIVOENTRADA[0] ;
            Z538COSTOADQUISICION = T001C3_A538COSTOADQUISICION[0] ;
            Z540DESCRIPCIONENTRADA = T001C3_A540DESCRIPCIONENTRADA[0] ;
            Z601CANTIDADENTRADA = T001C3_A601CANTIDADENTRADA[0] ;
            Z686INDICADORPHI = T001C3_A686INDICADORPHI[0] ;
            Z645VALORFUTURO = T001C3_A645VALORFUTURO[0] ;
            Z647TIEMPO = T001C3_A647TIEMPO[0] ;
            Z646INTERES = T001C3_A646INTERES[0] ;
            Z648VIDAUTIL = T001C3_A648VIDAUTIL[0] ;
            Z644OTROSCOSTOS = T001C3_A644OTROSCOSTOS[0] ;
            Z605MARCA = T001C3_A605MARCA[0] ;
            Z607MODELO = T001C3_A607MODELO[0] ;
            Z606SERIAL = T001C3_A606SERIAL[0] ;
         }
         else
         {
            Z537CONSECUTIVOENTRADA = A537CONSECUTIVOENTRADA ;
            Z538COSTOADQUISICION = A538COSTOADQUISICION ;
            Z540DESCRIPCIONENTRADA = A540DESCRIPCIONENTRADA ;
            Z601CANTIDADENTRADA = A601CANTIDADENTRADA ;
            Z686INDICADORPHI = A686INDICADORPHI ;
            Z645VALORFUTURO = A645VALORFUTURO ;
            Z647TIEMPO = A647TIEMPO ;
            Z646INTERES = A646INTERES ;
            Z648VIDAUTIL = A648VIDAUTIL ;
            Z644OTROSCOSTOS = A644OTROSCOSTOS ;
            Z605MARCA = A605MARCA ;
            Z607MODELO = A607MODELO ;
            Z606SERIAL = A606SERIAL ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
         Z537CONSECUTIVOENTRADA = A537CONSECUTIVOENTRADA ;
         Z538COSTOADQUISICION = A538COSTOADQUISICION ;
         Z540DESCRIPCIONENTRADA = A540DESCRIPCIONENTRADA ;
         Z601CANTIDADENTRADA = A601CANTIDADENTRADA ;
         Z686INDICADORPHI = A686INDICADORPHI ;
         Z645VALORFUTURO = A645VALORFUTURO ;
         Z647TIEMPO = A647TIEMPO ;
         Z646INTERES = A646INTERES ;
         Z648VIDAUTIL = A648VIDAUTIL ;
         Z644OTROSCOSTOS = A644OTROSCOSTOS ;
         Z605MARCA = A605MARCA ;
         Z607MODELO = A607MODELO ;
         Z606SERIAL = A606SERIAL ;
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

   public void load1C49( )
   {
      /* Using cursor T001C4 */
      pr_default.execute(2, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A537CONSECUTIVOENTRADA = T001C4_A537CONSECUTIVOENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537CONSECUTIVOENTRADA", A537CONSECUTIVOENTRADA);
         n537CONSECUTIVOENTRADA = T001C4_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = T001C4_A538COSTOADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538COSTOADQUISICION", GXutil.ltrim( GXutil.str( A538COSTOADQUISICION, 18, 2)));
         n538COSTOADQUISICION = T001C4_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = T001C4_A540DESCRIPCIONENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540DESCRIPCIONENTRADA", A540DESCRIPCIONENTRADA);
         n540DESCRIPCIONENTRADA = T001C4_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = T001C4_A601CANTIDADENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601CANTIDADENTRADA", GXutil.ltrim( GXutil.str( A601CANTIDADENTRADA, 6, 0)));
         n601CANTIDADENTRADA = T001C4_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = T001C4_A686INDICADORPHI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686INDICADORPHI", GXutil.ltrim( GXutil.str( A686INDICADORPHI, 4, 0)));
         A645VALORFUTURO = T001C4_A645VALORFUTURO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645VALORFUTURO", GXutil.ltrim( GXutil.str( A645VALORFUTURO, 18, 2)));
         A647TIEMPO = T001C4_A647TIEMPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TIEMPO", GXutil.ltrim( GXutil.str( A647TIEMPO, 4, 0)));
         A646INTERES = T001C4_A646INTERES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A646INTERES", GXutil.ltrim( GXutil.str( A646INTERES, 6, 2)));
         A648VIDAUTIL = T001C4_A648VIDAUTIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648VIDAUTIL", GXutil.ltrim( GXutil.str( A648VIDAUTIL, 4, 0)));
         A644OTROSCOSTOS = T001C4_A644OTROSCOSTOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644OTROSCOSTOS", GXutil.ltrim( GXutil.str( A644OTROSCOSTOS, 18, 2)));
         A605MARCA = T001C4_A605MARCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605MARCA", A605MARCA);
         A607MODELO = T001C4_A607MODELO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MODELO", A607MODELO);
         A606SERIAL = T001C4_A606SERIAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606SERIAL", A606SERIAL);
         zm1C49( -4) ;
      }
      pr_default.close(2);
      onLoadActions1C49( ) ;
   }

   public void onLoadActions1C49( )
   {
   }

   public void checkExtendedTable1C49( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO : El campo se encuentra vacio", "c01", 1, "CONSECUTIVOENTRADA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A537CONSECUTIVOENTRADA), GXv_char1) ;
         mas_cargue_entrada_impl.this.AV8Ind2 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Ind2", AV8Ind2);
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: No existe ", "c01", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1C49( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1C49( )
   {
      /* Using cursor T001C5 */
      pr_default.execute(3, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound49 = (short)(1) ;
      }
      else
      {
         RcdFound49 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001C3 */
      pr_default.execute(1, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1C49( 4) ;
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = T001C3_A83NROTRANSACCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
         A84IDCARMAS = T001C3_A84IDCARMAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
         A537CONSECUTIVOENTRADA = T001C3_A537CONSECUTIVOENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537CONSECUTIVOENTRADA", A537CONSECUTIVOENTRADA);
         n537CONSECUTIVOENTRADA = T001C3_n537CONSECUTIVOENTRADA[0] ;
         A538COSTOADQUISICION = T001C3_A538COSTOADQUISICION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538COSTOADQUISICION", GXutil.ltrim( GXutil.str( A538COSTOADQUISICION, 18, 2)));
         n538COSTOADQUISICION = T001C3_n538COSTOADQUISICION[0] ;
         A540DESCRIPCIONENTRADA = T001C3_A540DESCRIPCIONENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540DESCRIPCIONENTRADA", A540DESCRIPCIONENTRADA);
         n540DESCRIPCIONENTRADA = T001C3_n540DESCRIPCIONENTRADA[0] ;
         A601CANTIDADENTRADA = T001C3_A601CANTIDADENTRADA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601CANTIDADENTRADA", GXutil.ltrim( GXutil.str( A601CANTIDADENTRADA, 6, 0)));
         n601CANTIDADENTRADA = T001C3_n601CANTIDADENTRADA[0] ;
         A686INDICADORPHI = T001C3_A686INDICADORPHI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686INDICADORPHI", GXutil.ltrim( GXutil.str( A686INDICADORPHI, 4, 0)));
         A645VALORFUTURO = T001C3_A645VALORFUTURO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645VALORFUTURO", GXutil.ltrim( GXutil.str( A645VALORFUTURO, 18, 2)));
         A647TIEMPO = T001C3_A647TIEMPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A647TIEMPO", GXutil.ltrim( GXutil.str( A647TIEMPO, 4, 0)));
         A646INTERES = T001C3_A646INTERES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A646INTERES", GXutil.ltrim( GXutil.str( A646INTERES, 6, 2)));
         A648VIDAUTIL = T001C3_A648VIDAUTIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648VIDAUTIL", GXutil.ltrim( GXutil.str( A648VIDAUTIL, 4, 0)));
         A644OTROSCOSTOS = T001C3_A644OTROSCOSTOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644OTROSCOSTOS", GXutil.ltrim( GXutil.str( A644OTROSCOSTOS, 18, 2)));
         A605MARCA = T001C3_A605MARCA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605MARCA", A605MARCA);
         A607MODELO = T001C3_A607MODELO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607MODELO", A607MODELO);
         A606SERIAL = T001C3_A606SERIAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606SERIAL", A606SERIAL);
         Z83NROTRANSACCION = A83NROTRANSACCION ;
         Z84IDCARMAS = A84IDCARMAS ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1C49( ) ;
         if ( AnyError == 1 )
         {
            RcdFound49 = (short)(0) ;
            initializeNonKey1C49( ) ;
         }
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound49 = (short)(0) ;
         initializeNonKey1C49( ) ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1C49( ) ;
      if ( RcdFound49 == 0 )
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
      RcdFound49 = (short)(0) ;
      /* Using cursor T001C6 */
      pr_default.execute(4, new Object[] {new Long(A83NROTRANSACCION), new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001C6_A83NROTRANSACCION[0] < A83NROTRANSACCION ) || ( T001C6_A83NROTRANSACCION[0] == A83NROTRANSACCION ) && ( T001C6_A84IDCARMAS[0] < A84IDCARMAS ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001C6_A83NROTRANSACCION[0] > A83NROTRANSACCION ) || ( T001C6_A83NROTRANSACCION[0] == A83NROTRANSACCION ) && ( T001C6_A84IDCARMAS[0] > A84IDCARMAS ) ) )
         {
            A83NROTRANSACCION = T001C6_A83NROTRANSACCION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
            A84IDCARMAS = T001C6_A84IDCARMAS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound49 = (short)(0) ;
      /* Using cursor T001C7 */
      pr_default.execute(5, new Object[] {new Long(A83NROTRANSACCION), new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001C7_A83NROTRANSACCION[0] > A83NROTRANSACCION ) || ( T001C7_A83NROTRANSACCION[0] == A83NROTRANSACCION ) && ( T001C7_A84IDCARMAS[0] > A84IDCARMAS ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001C7_A83NROTRANSACCION[0] < A83NROTRANSACCION ) || ( T001C7_A83NROTRANSACCION[0] == A83NROTRANSACCION ) && ( T001C7_A84IDCARMAS[0] < A84IDCARMAS ) ) )
         {
            A83NROTRANSACCION = T001C7_A83NROTRANSACCION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
            A84IDCARMAS = T001C7_A84IDCARMAS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1C49( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtNROTRANSACCION_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1C49( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound49 == 1 )
         {
            if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
            {
               A83NROTRANSACCION = Z83NROTRANSACCION ;
               httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
               A84IDCARMAS = Z84IDCARMAS ;
               httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NROTRANSACCION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNROTRANSACCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNROTRANSACCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1C49( ) ;
               GX_FocusControl = edtNROTRANSACCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtNROTRANSACCION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1C49( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NROTRANSACCION");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNROTRANSACCION_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtNROTRANSACCION_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1C49( ) ;
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
      if ( ( A83NROTRANSACCION != Z83NROTRANSACCION ) || ( A84IDCARMAS != Z84IDCARMAS ) )
      {
         A83NROTRANSACCION = Z83NROTRANSACCION ;
         httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
         A84IDCARMAS = Z84IDCARMAS ;
         httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NROTRANSACCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNROTRANSACCION_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNROTRANSACCION_Internalname ;
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
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "NROTRANSACCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNROTRANSACCION_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1C49( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C49( ) ;
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
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
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
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
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
      scanStart1C49( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound49 != 0 )
         {
            scanNext1C49( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C49( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1C49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001C2 */
         pr_default.execute(0, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z537CONSECUTIVOENTRADA, T001C2_A537CONSECUTIVOENTRADA[0]) != 0 ) || ( DecimalUtil.compareTo(Z538COSTOADQUISICION, T001C2_A538COSTOADQUISICION[0]) != 0 ) || ( GXutil.strcmp(Z540DESCRIPCIONENTRADA, T001C2_A540DESCRIPCIONENTRADA[0]) != 0 ) || ( Z601CANTIDADENTRADA != T001C2_A601CANTIDADENTRADA[0] ) || ( Z686INDICADORPHI != T001C2_A686INDICADORPHI[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z645VALORFUTURO, T001C2_A645VALORFUTURO[0]) != 0 ) || ( Z647TIEMPO != T001C2_A647TIEMPO[0] ) || ( DecimalUtil.compareTo(Z646INTERES, T001C2_A646INTERES[0]) != 0 ) || ( Z648VIDAUTIL != T001C2_A648VIDAUTIL[0] ) || ( DecimalUtil.compareTo(Z644OTROSCOSTOS, T001C2_A644OTROSCOSTOS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z605MARCA, T001C2_A605MARCA[0]) != 0 ) || ( GXutil.strcmp(Z607MODELO, T001C2_A607MODELO[0]) != 0 ) || ( GXutil.strcmp(Z606SERIAL, T001C2_A606SERIAL[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1C49( )
   {
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1C49( 0) ;
         checkOptimisticConcurrency1C49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C49( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1C49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001C8 */
                  pr_default.execute(6, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS), new Boolean(n537CONSECUTIVOENTRADA), A537CONSECUTIVOENTRADA, new Boolean(n538COSTOADQUISICION), A538COSTOADQUISICION, new Boolean(n540DESCRIPCIONENTRADA), A540DESCRIPCIONENTRADA, new Boolean(n601CANTIDADENTRADA), new Integer(A601CANTIDADENTRADA), new Short(A686INDICADORPHI), A645VALORFUTURO, new Short(A647TIEMPO), A646INTERES, new Short(A648VIDAUTIL), A644OTROSCOSTOS, A605MARCA, A607MODELO, A606SERIAL});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
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
                        resetCaption1C0( ) ;
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
            load1C49( ) ;
         }
         endLevel1C49( ) ;
      }
      closeExtendedTableCursors1C49( ) ;
   }

   public void update1C49( )
   {
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C49( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1C49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001C9 */
                  pr_default.execute(7, new Object[] {new Boolean(n537CONSECUTIVOENTRADA), A537CONSECUTIVOENTRADA, new Boolean(n538COSTOADQUISICION), A538COSTOADQUISICION, new Boolean(n540DESCRIPCIONENTRADA), A540DESCRIPCIONENTRADA, new Boolean(n601CANTIDADENTRADA), new Integer(A601CANTIDADENTRADA), new Short(A686INDICADORPHI), A645VALORFUTURO, new Short(A647TIEMPO), A646INTERES, new Short(A648VIDAUTIL), A644OTROSCOSTOS, A605MARCA, A607MODELO, A606SERIAL, new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAS_CARGUE_ENTRADA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1C49( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption1C0( ) ;
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
         endLevel1C49( ) ;
      }
      closeExtendedTableCursors1C49( ) ;
   }

   public void deferredUpdate1C49( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1C49( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1C49( ) ;
         afterConfirm1C49( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1C49( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001C10 */
               pr_default.execute(8, new Object[] {new Long(A83NROTRANSACCION), new Short(A84IDCARMAS)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound49 == 0 )
                     {
                        initAll1C49( ) ;
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
                     resetCaption1C0( ) ;
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
      sMode49 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1C49( ) ;
      Gx_mode = sMode49 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1C49( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1C49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1C49( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_entrada");
         if ( AnyError == 0 )
         {
            confirmValues1C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "mas_cargue_entrada");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1C49( )
   {
      /* Scan By routine */
      /* Using cursor T001C11 */
      pr_default.execute(9);
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = T001C11_A83NROTRANSACCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
         A84IDCARMAS = T001C11_A84IDCARMAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1C49( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A83NROTRANSACCION = T001C11_A83NROTRANSACCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
         A84IDCARMAS = T001C11_A84IDCARMAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
      }
   }

   public void scanEnd1C49( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1C49( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1C49( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1C49( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1C49( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1C49( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1C49( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1C49( )
   {
      edtNROTRANSACCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNROTRANSACCION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNROTRANSACCION_Enabled, 5, 0)), true);
      edtIDCARMAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIDCARMAS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtIDCARMAS_Enabled, 5, 0)), true);
      edtCONSECUTIVOENTRADA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCONSECUTIVOENTRADA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCONSECUTIVOENTRADA_Enabled, 5, 0)), true);
      edtCOSTOADQUISICION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCOSTOADQUISICION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCOSTOADQUISICION_Enabled, 5, 0)), true);
      edtDESCRIPCIONENTRADA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDESCRIPCIONENTRADA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDESCRIPCIONENTRADA_Enabled, 5, 0)), true);
      edtCANTIDADENTRADA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCANTIDADENTRADA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtCANTIDADENTRADA_Enabled, 5, 0)), true);
      edtINDICADORPHI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtINDICADORPHI_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtINDICADORPHI_Enabled, 5, 0)), true);
      edtVALORFUTURO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVALORFUTURO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVALORFUTURO_Enabled, 5, 0)), true);
      edtTIEMPO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIEMPO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIEMPO_Enabled, 5, 0)), true);
      edtINTERES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtINTERES_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtINTERES_Enabled, 5, 0)), true);
      edtVIDAUTIL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVIDAUTIL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtVIDAUTIL_Enabled, 5, 0)), true);
      edtOTROSCOSTOS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOTROSCOSTOS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOTROSCOSTOS_Enabled, 5, 0)), true);
      edtMARCA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMARCA_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMARCA_Enabled, 5, 0)), true);
      edtMODELO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMODELO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtMODELO_Enabled, 5, 0)), true);
      edtSERIAL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSERIAL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSERIAL_Enabled, 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1C0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141417286");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.mas_cargue_entrada") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z83NROTRANSACCION", GXutil.ltrim( localUtil.ntoc( Z83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z84IDCARMAS", GXutil.ltrim( localUtil.ntoc( Z84IDCARMAS, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z537CONSECUTIVOENTRADA", Z537CONSECUTIVOENTRADA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z538COSTOADQUISICION", GXutil.ltrim( localUtil.ntoc( Z538COSTOADQUISICION, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z540DESCRIPCIONENTRADA", Z540DESCRIPCIONENTRADA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z601CANTIDADENTRADA", GXutil.ltrim( localUtil.ntoc( Z601CANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z686INDICADORPHI", GXutil.ltrim( localUtil.ntoc( Z686INDICADORPHI, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z645VALORFUTURO", GXutil.ltrim( localUtil.ntoc( Z645VALORFUTURO, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z647TIEMPO", GXutil.ltrim( localUtil.ntoc( Z647TIEMPO, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z646INTERES", GXutil.ltrim( localUtil.ntoc( Z646INTERES, (byte)(6), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z648VIDAUTIL", GXutil.ltrim( localUtil.ntoc( Z648VIDAUTIL, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z644OTROSCOSTOS", GXutil.ltrim( localUtil.ntoc( Z644OTROSCOSTOS, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z605MARCA", Z605MARCA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z607MODELO", Z607MODELO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z606SERIAL", Z606SERIAL);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("com.orions2.mas_cargue_entrada")  ;
   }

   public String getPgmname( )
   {
      return "MAS_CARGUE_ENTRADA" ;
   }

   public String getPgmdesc( )
   {
      return "MAS_CARGUE_ENTRADA" ;
   }

   public void initializeNonKey1C49( )
   {
      AV8Ind2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Ind2", AV8Ind2);
      A537CONSECUTIVOENTRADA = "" ;
      n537CONSECUTIVOENTRADA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A537CONSECUTIVOENTRADA", A537CONSECUTIVOENTRADA);
      n537CONSECUTIVOENTRADA = ((GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) ? true : false) ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      n538COSTOADQUISICION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A538COSTOADQUISICION", GXutil.ltrim( GXutil.str( A538COSTOADQUISICION, 18, 2)));
      n538COSTOADQUISICION = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A538COSTOADQUISICION)==0) ? true : false) ;
      A540DESCRIPCIONENTRADA = "" ;
      n540DESCRIPCIONENTRADA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540DESCRIPCIONENTRADA", A540DESCRIPCIONENTRADA);
      n540DESCRIPCIONENTRADA = ((GXutil.strcmp("", A540DESCRIPCIONENTRADA)==0) ? true : false) ;
      A601CANTIDADENTRADA = 0 ;
      n601CANTIDADENTRADA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A601CANTIDADENTRADA", GXutil.ltrim( GXutil.str( A601CANTIDADENTRADA, 6, 0)));
      n601CANTIDADENTRADA = ((0==A601CANTIDADENTRADA) ? true : false) ;
      A686INDICADORPHI = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A686INDICADORPHI", GXutil.ltrim( GXutil.str( A686INDICADORPHI, 4, 0)));
      A645VALORFUTURO = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A645VALORFUTURO", GXutil.ltrim( GXutil.str( A645VALORFUTURO, 18, 2)));
      A647TIEMPO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A647TIEMPO", GXutil.ltrim( GXutil.str( A647TIEMPO, 4, 0)));
      A646INTERES = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A646INTERES", GXutil.ltrim( GXutil.str( A646INTERES, 6, 2)));
      A648VIDAUTIL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A648VIDAUTIL", GXutil.ltrim( GXutil.str( A648VIDAUTIL, 4, 0)));
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A644OTROSCOSTOS", GXutil.ltrim( GXutil.str( A644OTROSCOSTOS, 18, 2)));
      A605MARCA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A605MARCA", A605MARCA);
      A607MODELO = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A607MODELO", A607MODELO);
      A606SERIAL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A606SERIAL", A606SERIAL);
      Z537CONSECUTIVOENTRADA = "" ;
      Z538COSTOADQUISICION = DecimalUtil.ZERO ;
      Z540DESCRIPCIONENTRADA = "" ;
      Z601CANTIDADENTRADA = 0 ;
      Z686INDICADORPHI = (short)(0) ;
      Z645VALORFUTURO = DecimalUtil.ZERO ;
      Z647TIEMPO = (short)(0) ;
      Z646INTERES = DecimalUtil.ZERO ;
      Z648VIDAUTIL = (short)(0) ;
      Z644OTROSCOSTOS = DecimalUtil.ZERO ;
      Z605MARCA = "" ;
      Z607MODELO = "" ;
      Z606SERIAL = "" ;
   }

   public void initAll1C49( )
   {
      A83NROTRANSACCION = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A83NROTRANSACCION", GXutil.ltrim( GXutil.str( A83NROTRANSACCION, 11, 0)));
      A84IDCARMAS = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A84IDCARMAS", GXutil.ltrim( GXutil.str( A84IDCARMAS, 4, 0)));
      initializeNonKey1C49( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414172813");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("mas_cargue_entrada.js", "?201861414172813");
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
      edtNROTRANSACCION_Internalname = "NROTRANSACCION" ;
      edtIDCARMAS_Internalname = "IDCARMAS" ;
      edtCONSECUTIVOENTRADA_Internalname = "CONSECUTIVOENTRADA" ;
      edtCOSTOADQUISICION_Internalname = "COSTOADQUISICION" ;
      edtDESCRIPCIONENTRADA_Internalname = "DESCRIPCIONENTRADA" ;
      edtCANTIDADENTRADA_Internalname = "CANTIDADENTRADA" ;
      edtINDICADORPHI_Internalname = "INDICADORPHI" ;
      edtVALORFUTURO_Internalname = "VALORFUTURO" ;
      edtTIEMPO_Internalname = "TIEMPO" ;
      edtINTERES_Internalname = "INTERES" ;
      edtVIDAUTIL_Internalname = "VIDAUTIL" ;
      edtOTROSCOSTOS_Internalname = "OTROSCOSTOS" ;
      edtMARCA_Internalname = "MARCA" ;
      edtMODELO_Internalname = "MODELO" ;
      edtSERIAL_Internalname = "SERIAL" ;
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
      Form.setCaption( "MAS_CARGUE_ENTRADA" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtSERIAL_Jsonclick = "" ;
      edtSERIAL_Enabled = 1 ;
      edtMODELO_Jsonclick = "" ;
      edtMODELO_Enabled = 1 ;
      edtMARCA_Jsonclick = "" ;
      edtMARCA_Enabled = 1 ;
      edtOTROSCOSTOS_Jsonclick = "" ;
      edtOTROSCOSTOS_Enabled = 1 ;
      edtVIDAUTIL_Jsonclick = "" ;
      edtVIDAUTIL_Enabled = 1 ;
      edtINTERES_Jsonclick = "" ;
      edtINTERES_Enabled = 1 ;
      edtTIEMPO_Jsonclick = "" ;
      edtTIEMPO_Enabled = 1 ;
      edtVALORFUTURO_Jsonclick = "" ;
      edtVALORFUTURO_Enabled = 1 ;
      edtINDICADORPHI_Jsonclick = "" ;
      edtINDICADORPHI_Enabled = 1 ;
      edtCANTIDADENTRADA_Jsonclick = "" ;
      edtCANTIDADENTRADA_Enabled = 1 ;
      edtDESCRIPCIONENTRADA_Enabled = 1 ;
      edtCOSTOADQUISICION_Jsonclick = "" ;
      edtCOSTOADQUISICION_Enabled = 1 ;
      edtCONSECUTIVOENTRADA_Jsonclick = "" ;
      edtCONSECUTIVOENTRADA_Enabled = 1 ;
      edtIDCARMAS_Jsonclick = "" ;
      edtIDCARMAS_Enabled = 1 ;
      edtNROTRANSACCION_Jsonclick = "" ;
      edtNROTRANSACCION_Enabled = 1 ;
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

   public void xc_2_1C49( )
   {
      if ( ! (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A537CONSECUTIVOENTRADA), GXv_char1) ;
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
      GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Idcarmas( long GX_Parm1 ,
                               short GX_Parm2 ,
                               String GX_Parm3 ,
                               java.math.BigDecimal GX_Parm4 ,
                               String GX_Parm5 ,
                               int GX_Parm6 ,
                               short GX_Parm7 ,
                               java.math.BigDecimal GX_Parm8 ,
                               short GX_Parm9 ,
                               java.math.BigDecimal GX_Parm10 ,
                               short GX_Parm11 ,
                               java.math.BigDecimal GX_Parm12 ,
                               String GX_Parm13 ,
                               String GX_Parm14 ,
                               String GX_Parm15 )
   {
      A83NROTRANSACCION = GX_Parm1 ;
      A84IDCARMAS = GX_Parm2 ;
      A537CONSECUTIVOENTRADA = GX_Parm3 ;
      n537CONSECUTIVOENTRADA = false ;
      A538COSTOADQUISICION = GX_Parm4 ;
      n538COSTOADQUISICION = false ;
      A540DESCRIPCIONENTRADA = GX_Parm5 ;
      n540DESCRIPCIONENTRADA = false ;
      A601CANTIDADENTRADA = GX_Parm6 ;
      n601CANTIDADENTRADA = false ;
      A686INDICADORPHI = GX_Parm7 ;
      A645VALORFUTURO = GX_Parm8 ;
      A647TIEMPO = GX_Parm9 ;
      A646INTERES = GX_Parm10 ;
      A648VIDAUTIL = GX_Parm11 ;
      A644OTROSCOSTOS = GX_Parm12 ;
      A605MARCA = GX_Parm13 ;
      A607MODELO = GX_Parm14 ;
      A606SERIAL = GX_Parm15 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A537CONSECUTIVOENTRADA);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A538COSTOADQUISICION, (byte)(18), (byte)(2), ".", "")));
      isValidOutput.add(A540DESCRIPCIONENTRADA);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A601CANTIDADENTRADA, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A686INDICADORPHI, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A645VALORFUTURO, (byte)(18), (byte)(2), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A647TIEMPO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A646INTERES, (byte)(6), (byte)(2), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A648VIDAUTIL, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A644OTROSCOSTOS, (byte)(18), (byte)(2), ".", "")));
      isValidOutput.add(A605MARCA);
      isValidOutput.add(A607MODELO);
      isValidOutput.add(A606SERIAL);
      isValidOutput.add(AV8Ind2);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z84IDCARMAS, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(Z537CONSECUTIVOENTRADA);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z538COSTOADQUISICION, (byte)(18), (byte)(2), ",", "")));
      isValidOutput.add(Z540DESCRIPCIONENTRADA);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z601CANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z686INDICADORPHI, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z645VALORFUTURO, (byte)(18), (byte)(2), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z647TIEMPO, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z646INTERES, (byte)(6), (byte)(2), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z648VIDAUTIL, (byte)(4), (byte)(0), ",", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z644OTROSCOSTOS, (byte)(18), (byte)(2), ",", "")));
      isValidOutput.add(Z605MARCA);
      isValidOutput.add(Z607MODELO);
      isValidOutput.add(Z606SERIAL);
      isValidOutput.add(ZV8Ind2);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Consecutivoentrada( String GX_Parm1 ,
                                         String GX_Parm2 )
   {
      A537CONSECUTIVOENTRADA = GX_Parm1 ;
      n537CONSECUTIVOENTRADA = false ;
      AV8Ind2 = GX_Parm2 ;
      if ( (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO : El campo se encuentra vacio", "c01", 1, "CONSECUTIVOENTRADA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
      }
      if ( ! (GXutil.strcmp("", A537CONSECUTIVOENTRADA)==0) )
      {
         GXv_char1[0] = AV8Ind2 ;
         new com.orions2.validaelemento(remoteHandle, context).execute( GXutil.trim( A537CONSECUTIVOENTRADA), GXv_char1) ;
         mas_cargue_entrada_impl.this.AV8Ind2 = GXv_char1[0] ;
         AV8Ind2 = this.AV8Ind2 ;
      }
      if ( GXutil.strcmp(AV8Ind2, "N") == 0 )
      {
         httpContext.GX_msglist.addItem("CONSECUTIVO: No existe ", "c01", 1, "CONSECUTIVOENTRADA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCONSECUTIVOENTRADA_Internalname ;
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
      setEventMetadata("AFTER TRN","{handler:'e121C2',iparms:[],oparms:[]}");
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
      Z537CONSECUTIVOENTRADA = "" ;
      Z538COSTOADQUISICION = DecimalUtil.ZERO ;
      Z540DESCRIPCIONENTRADA = "" ;
      Z645VALORFUTURO = DecimalUtil.ZERO ;
      Z646INTERES = DecimalUtil.ZERO ;
      Z644OTROSCOSTOS = DecimalUtil.ZERO ;
      Z605MARCA = "" ;
      Z607MODELO = "" ;
      Z606SERIAL = "" ;
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
      A537CONSECUTIVOENTRADA = "" ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      A540DESCRIPCIONENTRADA = "" ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      A646INTERES = DecimalUtil.ZERO ;
      A644OTROSCOSTOS = DecimalUtil.ZERO ;
      A605MARCA = "" ;
      A607MODELO = "" ;
      A606SERIAL = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      AV8Ind2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001C4_A83NROTRANSACCION = new long[1] ;
      T001C4_A84IDCARMAS = new short[1] ;
      T001C4_A537CONSECUTIVOENTRADA = new String[] {""} ;
      T001C4_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      T001C4_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C4_n538COSTOADQUISICION = new boolean[] {false} ;
      T001C4_A540DESCRIPCIONENTRADA = new String[] {""} ;
      T001C4_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      T001C4_A601CANTIDADENTRADA = new int[1] ;
      T001C4_n601CANTIDADENTRADA = new boolean[] {false} ;
      T001C4_A686INDICADORPHI = new short[1] ;
      T001C4_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C4_A647TIEMPO = new short[1] ;
      T001C4_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C4_A648VIDAUTIL = new short[1] ;
      T001C4_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C4_A605MARCA = new String[] {""} ;
      T001C4_A607MODELO = new String[] {""} ;
      T001C4_A606SERIAL = new String[] {""} ;
      T001C5_A83NROTRANSACCION = new long[1] ;
      T001C5_A84IDCARMAS = new short[1] ;
      T001C3_A83NROTRANSACCION = new long[1] ;
      T001C3_A84IDCARMAS = new short[1] ;
      T001C3_A537CONSECUTIVOENTRADA = new String[] {""} ;
      T001C3_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      T001C3_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C3_n538COSTOADQUISICION = new boolean[] {false} ;
      T001C3_A540DESCRIPCIONENTRADA = new String[] {""} ;
      T001C3_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      T001C3_A601CANTIDADENTRADA = new int[1] ;
      T001C3_n601CANTIDADENTRADA = new boolean[] {false} ;
      T001C3_A686INDICADORPHI = new short[1] ;
      T001C3_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C3_A647TIEMPO = new short[1] ;
      T001C3_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C3_A648VIDAUTIL = new short[1] ;
      T001C3_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C3_A605MARCA = new String[] {""} ;
      T001C3_A607MODELO = new String[] {""} ;
      T001C3_A606SERIAL = new String[] {""} ;
      sMode49 = "" ;
      T001C6_A83NROTRANSACCION = new long[1] ;
      T001C6_A84IDCARMAS = new short[1] ;
      T001C7_A83NROTRANSACCION = new long[1] ;
      T001C7_A84IDCARMAS = new short[1] ;
      T001C2_A83NROTRANSACCION = new long[1] ;
      T001C2_A84IDCARMAS = new short[1] ;
      T001C2_A537CONSECUTIVOENTRADA = new String[] {""} ;
      T001C2_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      T001C2_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C2_n538COSTOADQUISICION = new boolean[] {false} ;
      T001C2_A540DESCRIPCIONENTRADA = new String[] {""} ;
      T001C2_n540DESCRIPCIONENTRADA = new boolean[] {false} ;
      T001C2_A601CANTIDADENTRADA = new int[1] ;
      T001C2_n601CANTIDADENTRADA = new boolean[] {false} ;
      T001C2_A686INDICADORPHI = new short[1] ;
      T001C2_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C2_A647TIEMPO = new short[1] ;
      T001C2_A646INTERES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C2_A648VIDAUTIL = new short[1] ;
      T001C2_A644OTROSCOSTOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001C2_A605MARCA = new String[] {""} ;
      T001C2_A607MODELO = new String[] {""} ;
      T001C2_A606SERIAL = new String[] {""} ;
      T001C11_A83NROTRANSACCION = new long[1] ;
      T001C11_A84IDCARMAS = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Ind2 = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      GXv_char1 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.mas_cargue_entrada__default(),
         new Object[] {
             new Object[] {
            T001C2_A83NROTRANSACCION, T001C2_A84IDCARMAS, T001C2_A537CONSECUTIVOENTRADA, T001C2_n537CONSECUTIVOENTRADA, T001C2_A538COSTOADQUISICION, T001C2_n538COSTOADQUISICION, T001C2_A540DESCRIPCIONENTRADA, T001C2_n540DESCRIPCIONENTRADA, T001C2_A601CANTIDADENTRADA, T001C2_n601CANTIDADENTRADA,
            T001C2_A686INDICADORPHI, T001C2_A645VALORFUTURO, T001C2_A647TIEMPO, T001C2_A646INTERES, T001C2_A648VIDAUTIL, T001C2_A644OTROSCOSTOS, T001C2_A605MARCA, T001C2_A607MODELO, T001C2_A606SERIAL
            }
            , new Object[] {
            T001C3_A83NROTRANSACCION, T001C3_A84IDCARMAS, T001C3_A537CONSECUTIVOENTRADA, T001C3_n537CONSECUTIVOENTRADA, T001C3_A538COSTOADQUISICION, T001C3_n538COSTOADQUISICION, T001C3_A540DESCRIPCIONENTRADA, T001C3_n540DESCRIPCIONENTRADA, T001C3_A601CANTIDADENTRADA, T001C3_n601CANTIDADENTRADA,
            T001C3_A686INDICADORPHI, T001C3_A645VALORFUTURO, T001C3_A647TIEMPO, T001C3_A646INTERES, T001C3_A648VIDAUTIL, T001C3_A644OTROSCOSTOS, T001C3_A605MARCA, T001C3_A607MODELO, T001C3_A606SERIAL
            }
            , new Object[] {
            T001C4_A83NROTRANSACCION, T001C4_A84IDCARMAS, T001C4_A537CONSECUTIVOENTRADA, T001C4_n537CONSECUTIVOENTRADA, T001C4_A538COSTOADQUISICION, T001C4_n538COSTOADQUISICION, T001C4_A540DESCRIPCIONENTRADA, T001C4_n540DESCRIPCIONENTRADA, T001C4_A601CANTIDADENTRADA, T001C4_n601CANTIDADENTRADA,
            T001C4_A686INDICADORPHI, T001C4_A645VALORFUTURO, T001C4_A647TIEMPO, T001C4_A646INTERES, T001C4_A648VIDAUTIL, T001C4_A644OTROSCOSTOS, T001C4_A605MARCA, T001C4_A607MODELO, T001C4_A606SERIAL
            }
            , new Object[] {
            T001C5_A83NROTRANSACCION, T001C5_A84IDCARMAS
            }
            , new Object[] {
            T001C6_A83NROTRANSACCION, T001C6_A84IDCARMAS
            }
            , new Object[] {
            T001C7_A83NROTRANSACCION, T001C7_A84IDCARMAS
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001C11_A83NROTRANSACCION, T001C11_A84IDCARMAS
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short Z84IDCARMAS ;
   private short Z686INDICADORPHI ;
   private short Z647TIEMPO ;
   private short Z648VIDAUTIL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A84IDCARMAS ;
   private short A686INDICADORPHI ;
   private short A647TIEMPO ;
   private short A648VIDAUTIL ;
   private short RcdFound49 ;
   private int Z601CANTIDADENTRADA ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtNROTRANSACCION_Enabled ;
   private int edtIDCARMAS_Enabled ;
   private int edtCONSECUTIVOENTRADA_Enabled ;
   private int edtCOSTOADQUISICION_Enabled ;
   private int edtDESCRIPCIONENTRADA_Enabled ;
   private int A601CANTIDADENTRADA ;
   private int edtCANTIDADENTRADA_Enabled ;
   private int edtINDICADORPHI_Enabled ;
   private int edtVALORFUTURO_Enabled ;
   private int edtTIEMPO_Enabled ;
   private int edtINTERES_Enabled ;
   private int edtVIDAUTIL_Enabled ;
   private int edtOTROSCOSTOS_Enabled ;
   private int edtMARCA_Enabled ;
   private int edtMODELO_Enabled ;
   private int edtSERIAL_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z83NROTRANSACCION ;
   private long A83NROTRANSACCION ;
   private java.math.BigDecimal Z538COSTOADQUISICION ;
   private java.math.BigDecimal Z645VALORFUTURO ;
   private java.math.BigDecimal Z646INTERES ;
   private java.math.BigDecimal Z644OTROSCOSTOS ;
   private java.math.BigDecimal A538COSTOADQUISICION ;
   private java.math.BigDecimal A645VALORFUTURO ;
   private java.math.BigDecimal A646INTERES ;
   private java.math.BigDecimal A644OTROSCOSTOS ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtNROTRANSACCION_Internalname ;
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
   private String edtNROTRANSACCION_Jsonclick ;
   private String edtIDCARMAS_Internalname ;
   private String edtIDCARMAS_Jsonclick ;
   private String edtCONSECUTIVOENTRADA_Internalname ;
   private String edtCONSECUTIVOENTRADA_Jsonclick ;
   private String edtCOSTOADQUISICION_Internalname ;
   private String edtCOSTOADQUISICION_Jsonclick ;
   private String edtDESCRIPCIONENTRADA_Internalname ;
   private String edtCANTIDADENTRADA_Internalname ;
   private String edtCANTIDADENTRADA_Jsonclick ;
   private String edtINDICADORPHI_Internalname ;
   private String edtINDICADORPHI_Jsonclick ;
   private String edtVALORFUTURO_Internalname ;
   private String edtVALORFUTURO_Jsonclick ;
   private String edtTIEMPO_Internalname ;
   private String edtTIEMPO_Jsonclick ;
   private String edtINTERES_Internalname ;
   private String edtINTERES_Jsonclick ;
   private String edtVIDAUTIL_Internalname ;
   private String edtVIDAUTIL_Jsonclick ;
   private String edtOTROSCOSTOS_Internalname ;
   private String edtOTROSCOSTOS_Jsonclick ;
   private String edtMARCA_Internalname ;
   private String edtMARCA_Jsonclick ;
   private String edtMODELO_Internalname ;
   private String edtMODELO_Jsonclick ;
   private String edtSERIAL_Internalname ;
   private String edtSERIAL_Jsonclick ;
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
   private String sMode49 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char1[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n537CONSECUTIVOENTRADA ;
   private boolean n538COSTOADQUISICION ;
   private boolean n540DESCRIPCIONENTRADA ;
   private boolean n601CANTIDADENTRADA ;
   private boolean Gx_longc ;
   private String Z537CONSECUTIVOENTRADA ;
   private String Z540DESCRIPCIONENTRADA ;
   private String Z605MARCA ;
   private String Z607MODELO ;
   private String Z606SERIAL ;
   private String A537CONSECUTIVOENTRADA ;
   private String A540DESCRIPCIONENTRADA ;
   private String A605MARCA ;
   private String A607MODELO ;
   private String A606SERIAL ;
   private String AV8Ind2 ;
   private String ZV8Ind2 ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001C4_A83NROTRANSACCION ;
   private short[] T001C4_A84IDCARMAS ;
   private String[] T001C4_A537CONSECUTIVOENTRADA ;
   private boolean[] T001C4_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] T001C4_A538COSTOADQUISICION ;
   private boolean[] T001C4_n538COSTOADQUISICION ;
   private String[] T001C4_A540DESCRIPCIONENTRADA ;
   private boolean[] T001C4_n540DESCRIPCIONENTRADA ;
   private int[] T001C4_A601CANTIDADENTRADA ;
   private boolean[] T001C4_n601CANTIDADENTRADA ;
   private short[] T001C4_A686INDICADORPHI ;
   private java.math.BigDecimal[] T001C4_A645VALORFUTURO ;
   private short[] T001C4_A647TIEMPO ;
   private java.math.BigDecimal[] T001C4_A646INTERES ;
   private short[] T001C4_A648VIDAUTIL ;
   private java.math.BigDecimal[] T001C4_A644OTROSCOSTOS ;
   private String[] T001C4_A605MARCA ;
   private String[] T001C4_A607MODELO ;
   private String[] T001C4_A606SERIAL ;
   private long[] T001C5_A83NROTRANSACCION ;
   private short[] T001C5_A84IDCARMAS ;
   private long[] T001C3_A83NROTRANSACCION ;
   private short[] T001C3_A84IDCARMAS ;
   private String[] T001C3_A537CONSECUTIVOENTRADA ;
   private boolean[] T001C3_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] T001C3_A538COSTOADQUISICION ;
   private boolean[] T001C3_n538COSTOADQUISICION ;
   private String[] T001C3_A540DESCRIPCIONENTRADA ;
   private boolean[] T001C3_n540DESCRIPCIONENTRADA ;
   private int[] T001C3_A601CANTIDADENTRADA ;
   private boolean[] T001C3_n601CANTIDADENTRADA ;
   private short[] T001C3_A686INDICADORPHI ;
   private java.math.BigDecimal[] T001C3_A645VALORFUTURO ;
   private short[] T001C3_A647TIEMPO ;
   private java.math.BigDecimal[] T001C3_A646INTERES ;
   private short[] T001C3_A648VIDAUTIL ;
   private java.math.BigDecimal[] T001C3_A644OTROSCOSTOS ;
   private String[] T001C3_A605MARCA ;
   private String[] T001C3_A607MODELO ;
   private String[] T001C3_A606SERIAL ;
   private long[] T001C6_A83NROTRANSACCION ;
   private short[] T001C6_A84IDCARMAS ;
   private long[] T001C7_A83NROTRANSACCION ;
   private short[] T001C7_A84IDCARMAS ;
   private long[] T001C2_A83NROTRANSACCION ;
   private short[] T001C2_A84IDCARMAS ;
   private String[] T001C2_A537CONSECUTIVOENTRADA ;
   private boolean[] T001C2_n537CONSECUTIVOENTRADA ;
   private java.math.BigDecimal[] T001C2_A538COSTOADQUISICION ;
   private boolean[] T001C2_n538COSTOADQUISICION ;
   private String[] T001C2_A540DESCRIPCIONENTRADA ;
   private boolean[] T001C2_n540DESCRIPCIONENTRADA ;
   private int[] T001C2_A601CANTIDADENTRADA ;
   private boolean[] T001C2_n601CANTIDADENTRADA ;
   private short[] T001C2_A686INDICADORPHI ;
   private java.math.BigDecimal[] T001C2_A645VALORFUTURO ;
   private short[] T001C2_A647TIEMPO ;
   private java.math.BigDecimal[] T001C2_A646INTERES ;
   private short[] T001C2_A648VIDAUTIL ;
   private java.math.BigDecimal[] T001C2_A644OTROSCOSTOS ;
   private String[] T001C2_A605MARCA ;
   private String[] T001C2_A607MODELO ;
   private String[] T001C2_A606SERIAL ;
   private long[] T001C11_A83NROTRANSACCION ;
   private short[] T001C11_A84IDCARMAS ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mas_cargue_entrada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001C2", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ?  FOR UPDATE OF CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C3", "SELECT NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C4", "SELECT /*+ FIRST_ROWS(100) */ TM1.NROTRANSACCION, TM1.IDCARMAS, TM1.CONSECUTIVOENTRADA, TM1.COSTOADQUISICION, TM1.DESCRIPCIONENTRADA, TM1.CANTIDADENTRADA, TM1.INDICADORPHI, TM1.VALORFUTURO, TM1.TIEMPO, TM1.INTERES, TM1.VIDAUTIL, TM1.OTROSCOSTOS, TM1.MARCA, TM1.MODELO, TM1.SERIAL FROM MAS_CARGUE_ENTRADA TM1 WHERE TM1.NROTRANSACCION = ? and TM1.IDCARMAS = ? ORDER BY TM1.NROTRANSACCION, TM1.IDCARMAS ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001C5", "SELECT /*+ FIRST_ROWS(1) */ NROTRANSACCION, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE NROTRANSACCION = ? AND IDCARMAS = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NROTRANSACCION, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE ( NROTRANSACCION > ? or NROTRANSACCION = ? and IDCARMAS > ?) ORDER BY NROTRANSACCION, IDCARMAS) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001C7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NROTRANSACCION, IDCARMAS FROM MAS_CARGUE_ENTRADA WHERE ( NROTRANSACCION < ? or NROTRANSACCION = ? and IDCARMAS < ?) ORDER BY NROTRANSACCION DESC, IDCARMAS DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001C8", "INSERT INTO MAS_CARGUE_ENTRADA(NROTRANSACCION, IDCARMAS, CONSECUTIVOENTRADA, COSTOADQUISICION, DESCRIPCIONENTRADA, CANTIDADENTRADA, INDICADORPHI, VALORFUTURO, TIEMPO, INTERES, VIDAUTIL, OTROSCOSTOS, MARCA, MODELO, SERIAL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new UpdateCursor("T001C9", "UPDATE MAS_CARGUE_ENTRADA SET CONSECUTIVOENTRADA=?, COSTOADQUISICION=?, DESCRIPCIONENTRADA=?, CANTIDADENTRADA=?, INDICADORPHI=?, VALORFUTURO=?, TIEMPO=?, INTERES=?, VIDAUTIL=?, OTROSCOSTOS=?, MARCA=?, MODELO=?, SERIAL=?  WHERE NROTRANSACCION = ? AND IDCARMAS = ?", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new UpdateCursor("T001C10", "DELETE FROM MAS_CARGUE_ENTRADA  WHERE NROTRANSACCION = ? AND IDCARMAS = ?", GX_NOMASK, "MAS_CARGUE_ENTRADA")
         ,new ForEachCursor("T001C11", "SELECT /*+ FIRST_ROWS(100) */ NROTRANSACCION, IDCARMAS FROM MAS_CARGUE_ENTRADA ORDER BY NROTRANSACCION, IDCARMAS ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2) ;
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
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
                  stmt.setVarchar(3, (String)parms[3], 9);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 200);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               stmt.setVarchar(13, (String)parms[16], 50, false);
               stmt.setVarchar(14, (String)parms[17], 50, false);
               stmt.setVarchar(15, (String)parms[18], 50, false);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 9);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 200);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setVarchar(11, (String)parms[14], 50, false);
               stmt.setVarchar(12, (String)parms[15], 50, false);
               stmt.setVarchar(13, (String)parms[16], 50, false);
               stmt.setLong(14, ((Number) parms[17]).longValue());
               stmt.setShort(15, ((Number) parms[18]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

