/*
               File: rpt_ejecucion_impl
        Description: RPT_EJECUCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:41.56
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

public final  class rpt_ejecucion_impl extends GXDataArea
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
      cmbRpt_Eje_Estado.setName( "RPT_EJE_ESTADO" );
      cmbRpt_Eje_Estado.setWebtags( "" );
      if ( cmbRpt_Eje_Estado.getItemCount() > 0 )
      {
         A867Rpt_Eje_Estado = cmbRpt_Eje_Estado.getValidValue(A867Rpt_Eje_Estado) ;
         n867Rpt_Eje_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
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
         Form.getMeta().addItem("description", "RPT_EJECUCION", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtRpt_Eje_Id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public rpt_ejecucion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rpt_ejecucion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_ejecucion_impl.class ));
   }

   public rpt_ejecucion_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbRpt_Eje_Estado = new HTMLChoice();
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
      if ( cmbRpt_Eje_Estado.getItemCount() > 0 )
      {
         A867Rpt_Eje_Estado = cmbRpt_Eje_Estado.getValidValue(A867Rpt_Eje_Estado) ;
         n867Rpt_Eje_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "RPT_EJECUCION", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 4, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.orions2.gx01v0"+"',["+"{Ctrl:gx.dom.el('"+"RPT_EJE_ID"+"'), id:'"+"RPT_EJE_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")), ((edtRpt_Eje_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A861Rpt_Eje_Id), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A861Rpt_Eje_Id), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpt_Eje_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_Id_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_Fecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtRpt_Eje_Fecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_Fecha_Internalname, localUtil.ttoc( A862Rpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A862Rpt_Eje_Fecha, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpt_Eje_Fecha_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_Fecha_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtRpt_Eje_Fecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRpt_Eje_Fecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_Usuario_Internalname, "Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_Usuario_Internalname, A863Rpt_Eje_Usuario, GXutil.rtrim( localUtil.format( A863Rpt_Eje_Usuario, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpt_Eje_Usuario_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_Usuario_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_Email_Internalname, "Email", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_Email_Internalname, A864Rpt_Eje_Email, GXutil.rtrim( localUtil.format( A864Rpt_Eje_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A864Rpt_Eje_Email, "", "", "", edtRpt_Eje_Email_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_Email_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_ReporteId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_ReporteId_Internalname, A865Rpt_Eje_ReporteId, GXutil.rtrim( localUtil.format( A865Rpt_Eje_ReporteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpt_Eje_ReporteId_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_ReporteId_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtRpt_Eje_RequestId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtRpt_Eje_RequestId_Internalname, A866Rpt_Eje_RequestId, GXutil.rtrim( localUtil.format( A866Rpt_Eje_RequestId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpt_Eje_RequestId_Jsonclick, 0, "Attribute", "", "", "", 1, edtRpt_Eje_RequestId_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_RPT_EJECUCION.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbRpt_Eje_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbRpt_Eje_Estado, cmbRpt_Eje_Estado.getInternalname(), GXutil.rtrim( A867Rpt_Eje_Estado), 1, cmbRpt_Eje_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbRpt_Eje_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, "HLP_RPT_EJECUCION.htm");
         cmbRpt_Eje_Estado.setValue( GXutil.rtrim( A867Rpt_Eje_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRpt_Eje_Estado.getInternalname(), "Values", cmbRpt_Eje_Estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RPT_EJECUCION.htm");
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpt_Eje_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpt_Eje_Id_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPT_EJE_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRpt_Eje_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A861Rpt_Eje_Id = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
            }
            else
            {
               A861Rpt_Eje_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtRpt_Eje_Id_Internalname), ",", ".")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtRpt_Eje_Fecha_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RPT_EJE_FECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
               n862Rpt_Eje_Fecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A862Rpt_Eje_Fecha", localUtil.ttoc( A862Rpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A862Rpt_Eje_Fecha = localUtil.ctot( httpContext.cgiGet( edtRpt_Eje_Fecha_Internalname)) ;
               n862Rpt_Eje_Fecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A862Rpt_Eje_Fecha", localUtil.ttoc( A862Rpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
            }
            n862Rpt_Eje_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A862Rpt_Eje_Fecha) ? true : false) ;
            A863Rpt_Eje_Usuario = GXutil.upper( httpContext.cgiGet( edtRpt_Eje_Usuario_Internalname)) ;
            n863Rpt_Eje_Usuario = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A863Rpt_Eje_Usuario", A863Rpt_Eje_Usuario);
            n863Rpt_Eje_Usuario = ((GXutil.strcmp("", A863Rpt_Eje_Usuario)==0) ? true : false) ;
            A864Rpt_Eje_Email = httpContext.cgiGet( edtRpt_Eje_Email_Internalname) ;
            n864Rpt_Eje_Email = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A864Rpt_Eje_Email", A864Rpt_Eje_Email);
            n864Rpt_Eje_Email = ((GXutil.strcmp("", A864Rpt_Eje_Email)==0) ? true : false) ;
            A865Rpt_Eje_ReporteId = httpContext.cgiGet( edtRpt_Eje_ReporteId_Internalname) ;
            n865Rpt_Eje_ReporteId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A865Rpt_Eje_ReporteId", A865Rpt_Eje_ReporteId);
            n865Rpt_Eje_ReporteId = ((GXutil.strcmp("", A865Rpt_Eje_ReporteId)==0) ? true : false) ;
            A866Rpt_Eje_RequestId = httpContext.cgiGet( edtRpt_Eje_RequestId_Internalname) ;
            n866Rpt_Eje_RequestId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A866Rpt_Eje_RequestId", A866Rpt_Eje_RequestId);
            n866Rpt_Eje_RequestId = ((GXutil.strcmp("", A866Rpt_Eje_RequestId)==0) ? true : false) ;
            cmbRpt_Eje_Estado.setValue( httpContext.cgiGet( cmbRpt_Eje_Estado.getInternalname()) );
            A867Rpt_Eje_Estado = httpContext.cgiGet( cmbRpt_Eje_Estado.getInternalname()) ;
            n867Rpt_Eje_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
            n867Rpt_Eje_Estado = ((GXutil.strcmp("", A867Rpt_Eje_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z861Rpt_Eje_Id = (int)(localUtil.ctol( httpContext.cgiGet( "Z861Rpt_Eje_Id"), ",", ".")) ;
            Z862Rpt_Eje_Fecha = localUtil.ctot( httpContext.cgiGet( "Z862Rpt_Eje_Fecha"), 0) ;
            n862Rpt_Eje_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A862Rpt_Eje_Fecha) ? true : false) ;
            Z863Rpt_Eje_Usuario = httpContext.cgiGet( "Z863Rpt_Eje_Usuario") ;
            n863Rpt_Eje_Usuario = ((GXutil.strcmp("", A863Rpt_Eje_Usuario)==0) ? true : false) ;
            Z864Rpt_Eje_Email = httpContext.cgiGet( "Z864Rpt_Eje_Email") ;
            n864Rpt_Eje_Email = ((GXutil.strcmp("", A864Rpt_Eje_Email)==0) ? true : false) ;
            Z865Rpt_Eje_ReporteId = httpContext.cgiGet( "Z865Rpt_Eje_ReporteId") ;
            n865Rpt_Eje_ReporteId = ((GXutil.strcmp("", A865Rpt_Eje_ReporteId)==0) ? true : false) ;
            Z866Rpt_Eje_RequestId = httpContext.cgiGet( "Z866Rpt_Eje_RequestId") ;
            n866Rpt_Eje_RequestId = ((GXutil.strcmp("", A866Rpt_Eje_RequestId)==0) ? true : false) ;
            Z867Rpt_Eje_Estado = httpContext.cgiGet( "Z867Rpt_Eje_Estado") ;
            n867Rpt_Eje_Estado = ((GXutil.strcmp("", A867Rpt_Eje_Estado)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A861Rpt_Eje_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
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
            initAll1J67( ) ;
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
      disableAttributes1J67( ) ;
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

   public void resetCaption1J0( )
   {
   }

   public void zm1J67( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z862Rpt_Eje_Fecha = T001J3_A862Rpt_Eje_Fecha[0] ;
            Z863Rpt_Eje_Usuario = T001J3_A863Rpt_Eje_Usuario[0] ;
            Z864Rpt_Eje_Email = T001J3_A864Rpt_Eje_Email[0] ;
            Z865Rpt_Eje_ReporteId = T001J3_A865Rpt_Eje_ReporteId[0] ;
            Z866Rpt_Eje_RequestId = T001J3_A866Rpt_Eje_RequestId[0] ;
            Z867Rpt_Eje_Estado = T001J3_A867Rpt_Eje_Estado[0] ;
         }
         else
         {
            Z862Rpt_Eje_Fecha = A862Rpt_Eje_Fecha ;
            Z863Rpt_Eje_Usuario = A863Rpt_Eje_Usuario ;
            Z864Rpt_Eje_Email = A864Rpt_Eje_Email ;
            Z865Rpt_Eje_ReporteId = A865Rpt_Eje_ReporteId ;
            Z866Rpt_Eje_RequestId = A866Rpt_Eje_RequestId ;
            Z867Rpt_Eje_Estado = A867Rpt_Eje_Estado ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z861Rpt_Eje_Id = A861Rpt_Eje_Id ;
         Z862Rpt_Eje_Fecha = A862Rpt_Eje_Fecha ;
         Z863Rpt_Eje_Usuario = A863Rpt_Eje_Usuario ;
         Z864Rpt_Eje_Email = A864Rpt_Eje_Email ;
         Z865Rpt_Eje_ReporteId = A865Rpt_Eje_ReporteId ;
         Z866Rpt_Eje_RequestId = A866Rpt_Eje_RequestId ;
         Z867Rpt_Eje_Estado = A867Rpt_Eje_Estado ;
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

   public void load1J67( )
   {
      /* Using cursor T001J4 */
      pr_default.execute(2, new Object[] {new Integer(A861Rpt_Eje_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A862Rpt_Eje_Fecha = T001J4_A862Rpt_Eje_Fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862Rpt_Eje_Fecha", localUtil.ttoc( A862Rpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
         n862Rpt_Eje_Fecha = T001J4_n862Rpt_Eje_Fecha[0] ;
         A863Rpt_Eje_Usuario = T001J4_A863Rpt_Eje_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863Rpt_Eje_Usuario", A863Rpt_Eje_Usuario);
         n863Rpt_Eje_Usuario = T001J4_n863Rpt_Eje_Usuario[0] ;
         A864Rpt_Eje_Email = T001J4_A864Rpt_Eje_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864Rpt_Eje_Email", A864Rpt_Eje_Email);
         n864Rpt_Eje_Email = T001J4_n864Rpt_Eje_Email[0] ;
         A865Rpt_Eje_ReporteId = T001J4_A865Rpt_Eje_ReporteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865Rpt_Eje_ReporteId", A865Rpt_Eje_ReporteId);
         n865Rpt_Eje_ReporteId = T001J4_n865Rpt_Eje_ReporteId[0] ;
         A866Rpt_Eje_RequestId = T001J4_A866Rpt_Eje_RequestId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866Rpt_Eje_RequestId", A866Rpt_Eje_RequestId);
         n866Rpt_Eje_RequestId = T001J4_n866Rpt_Eje_RequestId[0] ;
         A867Rpt_Eje_Estado = T001J4_A867Rpt_Eje_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
         n867Rpt_Eje_Estado = T001J4_n867Rpt_Eje_Estado[0] ;
         zm1J67( -2) ;
      }
      pr_default.close(2);
      onLoadActions1J67( ) ;
   }

   public void onLoadActions1J67( )
   {
   }

   public void checkExtendedTable1J67( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GxRegex.IsMatch(A864Rpt_Eje_Email,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") || (GXutil.strcmp("", A864Rpt_Eje_Email)==0) ) )
      {
         httpContext.GX_msglist.addItem("El valor de Email no coincide con el patrón especificado", "OutOfRange", 1, "RPT_EJE_EMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpt_Eje_Email_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1J67( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J67( )
   {
      /* Using cursor T001J5 */
      pr_default.execute(3, new Object[] {new Integer(A861Rpt_Eje_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound67 = (short)(1) ;
      }
      else
      {
         RcdFound67 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001J3 */
      pr_default.execute(1, new Object[] {new Integer(A861Rpt_Eje_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1J67( 2) ;
         RcdFound67 = (short)(1) ;
         A861Rpt_Eje_Id = T001J3_A861Rpt_Eje_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
         A862Rpt_Eje_Fecha = T001J3_A862Rpt_Eje_Fecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862Rpt_Eje_Fecha", localUtil.ttoc( A862Rpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
         n862Rpt_Eje_Fecha = T001J3_n862Rpt_Eje_Fecha[0] ;
         A863Rpt_Eje_Usuario = T001J3_A863Rpt_Eje_Usuario[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863Rpt_Eje_Usuario", A863Rpt_Eje_Usuario);
         n863Rpt_Eje_Usuario = T001J3_n863Rpt_Eje_Usuario[0] ;
         A864Rpt_Eje_Email = T001J3_A864Rpt_Eje_Email[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864Rpt_Eje_Email", A864Rpt_Eje_Email);
         n864Rpt_Eje_Email = T001J3_n864Rpt_Eje_Email[0] ;
         A865Rpt_Eje_ReporteId = T001J3_A865Rpt_Eje_ReporteId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865Rpt_Eje_ReporteId", A865Rpt_Eje_ReporteId);
         n865Rpt_Eje_ReporteId = T001J3_n865Rpt_Eje_ReporteId[0] ;
         A866Rpt_Eje_RequestId = T001J3_A866Rpt_Eje_RequestId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866Rpt_Eje_RequestId", A866Rpt_Eje_RequestId);
         n866Rpt_Eje_RequestId = T001J3_n866Rpt_Eje_RequestId[0] ;
         A867Rpt_Eje_Estado = T001J3_A867Rpt_Eje_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
         n867Rpt_Eje_Estado = T001J3_n867Rpt_Eje_Estado[0] ;
         Z861Rpt_Eje_Id = A861Rpt_Eje_Id ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J67( ) ;
         if ( AnyError == 1 )
         {
            RcdFound67 = (short)(0) ;
            initializeNonKey1J67( ) ;
         }
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound67 = (short)(0) ;
         initializeNonKey1J67( ) ;
         sMode67 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode67 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1J67( ) ;
      if ( RcdFound67 == 0 )
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
      RcdFound67 = (short)(0) ;
      /* Using cursor T001J6 */
      pr_default.execute(4, new Object[] {new Integer(A861Rpt_Eje_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001J6_A861Rpt_Eje_Id[0] < A861Rpt_Eje_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001J6_A861Rpt_Eje_Id[0] > A861Rpt_Eje_Id ) ) )
         {
            A861Rpt_Eje_Id = T001J6_A861Rpt_Eje_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound67 = (short)(0) ;
      /* Using cursor T001J7 */
      pr_default.execute(5, new Object[] {new Integer(A861Rpt_Eje_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001J7_A861Rpt_Eje_Id[0] > A861Rpt_Eje_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001J7_A861Rpt_Eje_Id[0] < A861Rpt_Eje_Id ) ) )
         {
            A861Rpt_Eje_Id = T001J7_A861Rpt_Eje_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
            RcdFound67 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J67( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtRpt_Eje_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J67( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound67 == 1 )
         {
            if ( A861Rpt_Eje_Id != Z861Rpt_Eje_Id )
            {
               A861Rpt_Eje_Id = Z861Rpt_Eje_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RPT_EJE_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRpt_Eje_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRpt_Eje_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1J67( ) ;
               GX_FocusControl = edtRpt_Eje_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A861Rpt_Eje_Id != Z861Rpt_Eje_Id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRpt_Eje_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J67( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RPT_EJE_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRpt_Eje_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtRpt_Eje_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J67( ) ;
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
      if ( A861Rpt_Eje_Id != Z861Rpt_Eje_Id )
      {
         A861Rpt_Eje_Id = Z861Rpt_Eje_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RPT_EJE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpt_Eje_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRpt_Eje_Id_Internalname ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "RPT_EJE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpt_Eje_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1J67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J67( ) ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
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
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
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
      scanStart1J67( ) ;
      if ( RcdFound67 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound67 != 0 )
         {
            scanNext1J67( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J67( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J67( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001J2 */
         pr_default.execute(0, new Object[] {new Integer(A861Rpt_Eje_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_EJECUCION"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z862Rpt_Eje_Fecha, T001J2_A862Rpt_Eje_Fecha[0]) ) || ( GXutil.strcmp(Z863Rpt_Eje_Usuario, T001J2_A863Rpt_Eje_Usuario[0]) != 0 ) || ( GXutil.strcmp(Z864Rpt_Eje_Email, T001J2_A864Rpt_Eje_Email[0]) != 0 ) || ( GXutil.strcmp(Z865Rpt_Eje_ReporteId, T001J2_A865Rpt_Eje_ReporteId[0]) != 0 ) || ( GXutil.strcmp(Z866Rpt_Eje_RequestId, T001J2_A866Rpt_Eje_RequestId[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z867Rpt_Eje_Estado, T001J2_A867Rpt_Eje_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"RPT_EJECUCION"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J67( )
   {
      beforeValidate1J67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J67( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J67( 0) ;
         checkOptimisticConcurrency1J67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J67( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001J8 */
                  pr_default.execute(6, new Object[] {new Boolean(n862Rpt_Eje_Fecha), A862Rpt_Eje_Fecha, new Boolean(n863Rpt_Eje_Usuario), A863Rpt_Eje_Usuario, new Boolean(n864Rpt_Eje_Email), A864Rpt_Eje_Email, new Boolean(n865Rpt_Eje_ReporteId), A865Rpt_Eje_ReporteId, new Boolean(n866Rpt_Eje_RequestId), A866Rpt_Eje_RequestId, new Boolean(n867Rpt_Eje_Estado), A867Rpt_Eje_Estado});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001J9 */
                  pr_default.execute(7);
                  A861Rpt_Eje_Id = T001J9_A861Rpt_Eje_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_EJECUCION") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption1J0( ) ;
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
            load1J67( ) ;
         }
         endLevel1J67( ) ;
      }
      closeExtendedTableCursors1J67( ) ;
   }

   public void update1J67( )
   {
      beforeValidate1J67( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J67( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J67( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J67( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J67( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001J10 */
                  pr_default.execute(8, new Object[] {new Boolean(n862Rpt_Eje_Fecha), A862Rpt_Eje_Fecha, new Boolean(n863Rpt_Eje_Usuario), A863Rpt_Eje_Usuario, new Boolean(n864Rpt_Eje_Email), A864Rpt_Eje_Email, new Boolean(n865Rpt_Eje_ReporteId), A865Rpt_Eje_ReporteId, new Boolean(n866Rpt_Eje_RequestId), A866Rpt_Eje_RequestId, new Boolean(n867Rpt_Eje_Estado), A867Rpt_Eje_Estado, new Integer(A861Rpt_Eje_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_EJECUCION") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"RPT_EJECUCION"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J67( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), "SuccessfullyUpdated", 0, "", true);
                        resetCaption1J0( ) ;
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
         endLevel1J67( ) ;
      }
      closeExtendedTableCursors1J67( ) ;
   }

   public void deferredUpdate1J67( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J67( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J67( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J67( ) ;
         afterConfirm1J67( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J67( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001J11 */
               pr_default.execute(9, new Object[] {new Integer(A861Rpt_Eje_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("RPT_EJECUCION") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound67 == 0 )
                     {
                        initAll1J67( ) ;
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
                     resetCaption1J0( ) ;
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
      sMode67 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J67( ) ;
      Gx_mode = sMode67 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J67( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1J67( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J67( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "rpt_ejecucion");
         if ( AnyError == 0 )
         {
            confirmValues1J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "rpt_ejecucion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J67( )
   {
      /* Using cursor T001J12 */
      pr_default.execute(10);
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A861Rpt_Eje_Id = T001J12_A861Rpt_Eje_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J67( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound67 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound67 = (short)(1) ;
         A861Rpt_Eje_Id = T001J12_A861Rpt_Eje_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
      }
   }

   public void scanEnd1J67( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1J67( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J67( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J67( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J67( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J67( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J67( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J67( )
   {
      edtRpt_Eje_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_Id_Enabled, 5, 0)), true);
      edtRpt_Eje_Fecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_Fecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_Fecha_Enabled, 5, 0)), true);
      edtRpt_Eje_Usuario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_Usuario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_Usuario_Enabled, 5, 0)), true);
      edtRpt_Eje_Email_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_Email_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_Email_Enabled, 5, 0)), true);
      edtRpt_Eje_ReporteId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_ReporteId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_ReporteId_Enabled, 5, 0)), true);
      edtRpt_Eje_RequestId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_RequestId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtRpt_Eje_RequestId_Enabled, 5, 0)), true);
      cmbRpt_Eje_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbRpt_Eje_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbRpt_Eje_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1J0( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414174245");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.rpt_ejecucion") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z861Rpt_Eje_Id", GXutil.ltrim( localUtil.ntoc( Z861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z862Rpt_Eje_Fecha", localUtil.ttoc( Z862Rpt_Eje_Fecha, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z863Rpt_Eje_Usuario", Z863Rpt_Eje_Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z864Rpt_Eje_Email", Z864Rpt_Eje_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z865Rpt_Eje_ReporteId", Z865Rpt_Eje_ReporteId);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z866Rpt_Eje_RequestId", Z866Rpt_Eje_RequestId);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z867Rpt_Eje_Estado", Z867Rpt_Eje_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("com.orions2.rpt_ejecucion")  ;
   }

   public String getPgmname( )
   {
      return "RPT_EJECUCION" ;
   }

   public String getPgmdesc( )
   {
      return "RPT_EJECUCION" ;
   }

   public void initializeNonKey1J67( )
   {
      A862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      n862Rpt_Eje_Fecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A862Rpt_Eje_Fecha", localUtil.ttoc( A862Rpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
      n862Rpt_Eje_Fecha = (GXutil.dateCompare(GXutil.nullDate(), A862Rpt_Eje_Fecha) ? true : false) ;
      A863Rpt_Eje_Usuario = "" ;
      n863Rpt_Eje_Usuario = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A863Rpt_Eje_Usuario", A863Rpt_Eje_Usuario);
      n863Rpt_Eje_Usuario = ((GXutil.strcmp("", A863Rpt_Eje_Usuario)==0) ? true : false) ;
      A864Rpt_Eje_Email = "" ;
      n864Rpt_Eje_Email = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A864Rpt_Eje_Email", A864Rpt_Eje_Email);
      n864Rpt_Eje_Email = ((GXutil.strcmp("", A864Rpt_Eje_Email)==0) ? true : false) ;
      A865Rpt_Eje_ReporteId = "" ;
      n865Rpt_Eje_ReporteId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A865Rpt_Eje_ReporteId", A865Rpt_Eje_ReporteId);
      n865Rpt_Eje_ReporteId = ((GXutil.strcmp("", A865Rpt_Eje_ReporteId)==0) ? true : false) ;
      A866Rpt_Eje_RequestId = "" ;
      n866Rpt_Eje_RequestId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A866Rpt_Eje_RequestId", A866Rpt_Eje_RequestId);
      n866Rpt_Eje_RequestId = ((GXutil.strcmp("", A866Rpt_Eje_RequestId)==0) ? true : false) ;
      A867Rpt_Eje_Estado = "" ;
      n867Rpt_Eje_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A867Rpt_Eje_Estado", A867Rpt_Eje_Estado);
      n867Rpt_Eje_Estado = ((GXutil.strcmp("", A867Rpt_Eje_Estado)==0) ? true : false) ;
      Z862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      Z863Rpt_Eje_Usuario = "" ;
      Z864Rpt_Eje_Email = "" ;
      Z865Rpt_Eje_ReporteId = "" ;
      Z866Rpt_Eje_RequestId = "" ;
      Z867Rpt_Eje_Estado = "" ;
   }

   public void initAll1J67( )
   {
      A861Rpt_Eje_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A861Rpt_Eje_Id", GXutil.ltrim( GXutil.str( A861Rpt_Eje_Id, 8, 0)));
      initializeNonKey1J67( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414174249");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("rpt_ejecucion.js", "?201861414174249");
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
      edtRpt_Eje_Id_Internalname = "RPT_EJE_ID" ;
      edtRpt_Eje_Fecha_Internalname = "RPT_EJE_FECHA" ;
      edtRpt_Eje_Usuario_Internalname = "RPT_EJE_USUARIO" ;
      edtRpt_Eje_Email_Internalname = "RPT_EJE_EMAIL" ;
      edtRpt_Eje_ReporteId_Internalname = "RPT_EJE_REPORTEID" ;
      edtRpt_Eje_RequestId_Internalname = "RPT_EJE_REQUESTID" ;
      cmbRpt_Eje_Estado.setInternalname( "RPT_EJE_ESTADO" );
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
      Form.setCaption( "RPT_EJECUCION" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbRpt_Eje_Estado.setJsonclick( "" );
      cmbRpt_Eje_Estado.setEnabled( 1 );
      edtRpt_Eje_RequestId_Jsonclick = "" ;
      edtRpt_Eje_RequestId_Enabled = 1 ;
      edtRpt_Eje_ReporteId_Jsonclick = "" ;
      edtRpt_Eje_ReporteId_Enabled = 1 ;
      edtRpt_Eje_Email_Jsonclick = "" ;
      edtRpt_Eje_Email_Enabled = 1 ;
      edtRpt_Eje_Usuario_Jsonclick = "" ;
      edtRpt_Eje_Usuario_Enabled = 1 ;
      edtRpt_Eje_Fecha_Jsonclick = "" ;
      edtRpt_Eje_Fecha_Enabled = 1 ;
      edtRpt_Eje_Id_Jsonclick = "" ;
      edtRpt_Eje_Id_Enabled = 1 ;
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

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtRpt_Eje_Fecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Rpt_eje_id( int GX_Parm1 ,
                                 java.util.Date GX_Parm2 ,
                                 String GX_Parm3 ,
                                 String GX_Parm4 ,
                                 String GX_Parm5 ,
                                 String GX_Parm6 ,
                                 com.genexus.webpanels.HTMLChoice GX_Parm7 )
   {
      A861Rpt_Eje_Id = GX_Parm1 ;
      A862Rpt_Eje_Fecha = GX_Parm2 ;
      n862Rpt_Eje_Fecha = false ;
      A863Rpt_Eje_Usuario = GX_Parm3 ;
      n863Rpt_Eje_Usuario = false ;
      A864Rpt_Eje_Email = GX_Parm4 ;
      n864Rpt_Eje_Email = false ;
      A865Rpt_Eje_ReporteId = GX_Parm5 ;
      n865Rpt_Eje_ReporteId = false ;
      A866Rpt_Eje_RequestId = GX_Parm6 ;
      n866Rpt_Eje_RequestId = false ;
      cmbRpt_Eje_Estado = GX_Parm7 ;
      A867Rpt_Eje_Estado = cmbRpt_Eje_Estado.getValue() ;
      n867Rpt_Eje_Estado = false ;
      cmbRpt_Eje_Estado.setValue( A867Rpt_Eje_Estado );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.ttoc( A862Rpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "));
      isValidOutput.add(A863Rpt_Eje_Usuario);
      isValidOutput.add(A864Rpt_Eje_Email);
      isValidOutput.add(A865Rpt_Eje_ReporteId);
      isValidOutput.add(A866Rpt_Eje_RequestId);
      cmbRpt_Eje_Estado.setValue( A867Rpt_Eje_Estado );
      isValidOutput.add(cmbRpt_Eje_Estado);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")));
      isValidOutput.add(localUtil.ttoc( Z862Rpt_Eje_Fecha, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(Z863Rpt_Eje_Usuario);
      isValidOutput.add(Z864Rpt_Eje_Email);
      isValidOutput.add(Z865Rpt_Eje_ReporteId);
      isValidOutput.add(Z866Rpt_Eje_RequestId);
      isValidOutput.add(Z867Rpt_Eje_Estado);
      isValidOutput.add(bttBtn_delete_Enabled);
      isValidOutput.add(bttBtn_enter_Enabled);
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
      Z862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      Z863Rpt_Eje_Usuario = "" ;
      Z864Rpt_Eje_Email = "" ;
      Z865Rpt_Eje_ReporteId = "" ;
      Z866Rpt_Eje_RequestId = "" ;
      Z867Rpt_Eje_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      A867Rpt_Eje_Estado = "" ;
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
      A862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      A863Rpt_Eje_Usuario = "" ;
      A864Rpt_Eje_Email = "" ;
      A865Rpt_Eje_ReporteId = "" ;
      A866Rpt_Eje_RequestId = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001J4_A861Rpt_Eje_Id = new int[1] ;
      T001J4_A862Rpt_Eje_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T001J4_n862Rpt_Eje_Fecha = new boolean[] {false} ;
      T001J4_A863Rpt_Eje_Usuario = new String[] {""} ;
      T001J4_n863Rpt_Eje_Usuario = new boolean[] {false} ;
      T001J4_A864Rpt_Eje_Email = new String[] {""} ;
      T001J4_n864Rpt_Eje_Email = new boolean[] {false} ;
      T001J4_A865Rpt_Eje_ReporteId = new String[] {""} ;
      T001J4_n865Rpt_Eje_ReporteId = new boolean[] {false} ;
      T001J4_A866Rpt_Eje_RequestId = new String[] {""} ;
      T001J4_n866Rpt_Eje_RequestId = new boolean[] {false} ;
      T001J4_A867Rpt_Eje_Estado = new String[] {""} ;
      T001J4_n867Rpt_Eje_Estado = new boolean[] {false} ;
      T001J5_A861Rpt_Eje_Id = new int[1] ;
      T001J3_A861Rpt_Eje_Id = new int[1] ;
      T001J3_A862Rpt_Eje_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T001J3_n862Rpt_Eje_Fecha = new boolean[] {false} ;
      T001J3_A863Rpt_Eje_Usuario = new String[] {""} ;
      T001J3_n863Rpt_Eje_Usuario = new boolean[] {false} ;
      T001J3_A864Rpt_Eje_Email = new String[] {""} ;
      T001J3_n864Rpt_Eje_Email = new boolean[] {false} ;
      T001J3_A865Rpt_Eje_ReporteId = new String[] {""} ;
      T001J3_n865Rpt_Eje_ReporteId = new boolean[] {false} ;
      T001J3_A866Rpt_Eje_RequestId = new String[] {""} ;
      T001J3_n866Rpt_Eje_RequestId = new boolean[] {false} ;
      T001J3_A867Rpt_Eje_Estado = new String[] {""} ;
      T001J3_n867Rpt_Eje_Estado = new boolean[] {false} ;
      sMode67 = "" ;
      T001J6_A861Rpt_Eje_Id = new int[1] ;
      T001J7_A861Rpt_Eje_Id = new int[1] ;
      T001J2_A861Rpt_Eje_Id = new int[1] ;
      T001J2_A862Rpt_Eje_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      T001J2_n862Rpt_Eje_Fecha = new boolean[] {false} ;
      T001J2_A863Rpt_Eje_Usuario = new String[] {""} ;
      T001J2_n863Rpt_Eje_Usuario = new boolean[] {false} ;
      T001J2_A864Rpt_Eje_Email = new String[] {""} ;
      T001J2_n864Rpt_Eje_Email = new boolean[] {false} ;
      T001J2_A865Rpt_Eje_ReporteId = new String[] {""} ;
      T001J2_n865Rpt_Eje_ReporteId = new boolean[] {false} ;
      T001J2_A866Rpt_Eje_RequestId = new String[] {""} ;
      T001J2_n866Rpt_Eje_RequestId = new boolean[] {false} ;
      T001J2_A867Rpt_Eje_Estado = new String[] {""} ;
      T001J2_n867Rpt_Eje_Estado = new boolean[] {false} ;
      T001J9_A861Rpt_Eje_Id = new int[1] ;
      T001J12_A861Rpt_Eje_Id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_ejecucion__default(),
         new Object[] {
             new Object[] {
            T001J2_A861Rpt_Eje_Id, T001J2_A862Rpt_Eje_Fecha, T001J2_n862Rpt_Eje_Fecha, T001J2_A863Rpt_Eje_Usuario, T001J2_n863Rpt_Eje_Usuario, T001J2_A864Rpt_Eje_Email, T001J2_n864Rpt_Eje_Email, T001J2_A865Rpt_Eje_ReporteId, T001J2_n865Rpt_Eje_ReporteId, T001J2_A866Rpt_Eje_RequestId,
            T001J2_n866Rpt_Eje_RequestId, T001J2_A867Rpt_Eje_Estado, T001J2_n867Rpt_Eje_Estado
            }
            , new Object[] {
            T001J3_A861Rpt_Eje_Id, T001J3_A862Rpt_Eje_Fecha, T001J3_n862Rpt_Eje_Fecha, T001J3_A863Rpt_Eje_Usuario, T001J3_n863Rpt_Eje_Usuario, T001J3_A864Rpt_Eje_Email, T001J3_n864Rpt_Eje_Email, T001J3_A865Rpt_Eje_ReporteId, T001J3_n865Rpt_Eje_ReporteId, T001J3_A866Rpt_Eje_RequestId,
            T001J3_n866Rpt_Eje_RequestId, T001J3_A867Rpt_Eje_Estado, T001J3_n867Rpt_Eje_Estado
            }
            , new Object[] {
            T001J4_A861Rpt_Eje_Id, T001J4_A862Rpt_Eje_Fecha, T001J4_n862Rpt_Eje_Fecha, T001J4_A863Rpt_Eje_Usuario, T001J4_n863Rpt_Eje_Usuario, T001J4_A864Rpt_Eje_Email, T001J4_n864Rpt_Eje_Email, T001J4_A865Rpt_Eje_ReporteId, T001J4_n865Rpt_Eje_ReporteId, T001J4_A866Rpt_Eje_RequestId,
            T001J4_n866Rpt_Eje_RequestId, T001J4_A867Rpt_Eje_Estado, T001J4_n867Rpt_Eje_Estado
            }
            , new Object[] {
            T001J5_A861Rpt_Eje_Id
            }
            , new Object[] {
            T001J6_A861Rpt_Eje_Id
            }
            , new Object[] {
            T001J7_A861Rpt_Eje_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T001J9_A861Rpt_Eje_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001J12_A861Rpt_Eje_Id
            }
         }
      );
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
   private short RcdFound67 ;
   private int Z861Rpt_Eje_Id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A861Rpt_Eje_Id ;
   private int edtRpt_Eje_Id_Enabled ;
   private int edtRpt_Eje_Fecha_Enabled ;
   private int edtRpt_Eje_Usuario_Enabled ;
   private int edtRpt_Eje_Email_Enabled ;
   private int edtRpt_Eje_ReporteId_Enabled ;
   private int edtRpt_Eje_RequestId_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRpt_Eje_Id_Internalname ;
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
   private String edtRpt_Eje_Id_Jsonclick ;
   private String edtRpt_Eje_Fecha_Internalname ;
   private String edtRpt_Eje_Fecha_Jsonclick ;
   private String edtRpt_Eje_Usuario_Internalname ;
   private String edtRpt_Eje_Usuario_Jsonclick ;
   private String edtRpt_Eje_Email_Internalname ;
   private String edtRpt_Eje_Email_Jsonclick ;
   private String edtRpt_Eje_ReporteId_Internalname ;
   private String edtRpt_Eje_ReporteId_Jsonclick ;
   private String edtRpt_Eje_RequestId_Internalname ;
   private String edtRpt_Eje_RequestId_Jsonclick ;
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
   private String sMode67 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z862Rpt_Eje_Fecha ;
   private java.util.Date A862Rpt_Eje_Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n867Rpt_Eje_Estado ;
   private boolean wbErr ;
   private boolean n862Rpt_Eje_Fecha ;
   private boolean n863Rpt_Eje_Usuario ;
   private boolean n864Rpt_Eje_Email ;
   private boolean n865Rpt_Eje_ReporteId ;
   private boolean n866Rpt_Eje_RequestId ;
   private boolean Gx_longc ;
   private String Z863Rpt_Eje_Usuario ;
   private String Z864Rpt_Eje_Email ;
   private String Z865Rpt_Eje_ReporteId ;
   private String Z866Rpt_Eje_RequestId ;
   private String Z867Rpt_Eje_Estado ;
   private String A867Rpt_Eje_Estado ;
   private String A863Rpt_Eje_Usuario ;
   private String A864Rpt_Eje_Email ;
   private String A865Rpt_Eje_ReporteId ;
   private String A866Rpt_Eje_RequestId ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbRpt_Eje_Estado ;
   private IDataStoreProvider pr_default ;
   private int[] T001J4_A861Rpt_Eje_Id ;
   private java.util.Date[] T001J4_A862Rpt_Eje_Fecha ;
   private boolean[] T001J4_n862Rpt_Eje_Fecha ;
   private String[] T001J4_A863Rpt_Eje_Usuario ;
   private boolean[] T001J4_n863Rpt_Eje_Usuario ;
   private String[] T001J4_A864Rpt_Eje_Email ;
   private boolean[] T001J4_n864Rpt_Eje_Email ;
   private String[] T001J4_A865Rpt_Eje_ReporteId ;
   private boolean[] T001J4_n865Rpt_Eje_ReporteId ;
   private String[] T001J4_A866Rpt_Eje_RequestId ;
   private boolean[] T001J4_n866Rpt_Eje_RequestId ;
   private String[] T001J4_A867Rpt_Eje_Estado ;
   private boolean[] T001J4_n867Rpt_Eje_Estado ;
   private int[] T001J5_A861Rpt_Eje_Id ;
   private int[] T001J3_A861Rpt_Eje_Id ;
   private java.util.Date[] T001J3_A862Rpt_Eje_Fecha ;
   private boolean[] T001J3_n862Rpt_Eje_Fecha ;
   private String[] T001J3_A863Rpt_Eje_Usuario ;
   private boolean[] T001J3_n863Rpt_Eje_Usuario ;
   private String[] T001J3_A864Rpt_Eje_Email ;
   private boolean[] T001J3_n864Rpt_Eje_Email ;
   private String[] T001J3_A865Rpt_Eje_ReporteId ;
   private boolean[] T001J3_n865Rpt_Eje_ReporteId ;
   private String[] T001J3_A866Rpt_Eje_RequestId ;
   private boolean[] T001J3_n866Rpt_Eje_RequestId ;
   private String[] T001J3_A867Rpt_Eje_Estado ;
   private boolean[] T001J3_n867Rpt_Eje_Estado ;
   private int[] T001J6_A861Rpt_Eje_Id ;
   private int[] T001J7_A861Rpt_Eje_Id ;
   private int[] T001J2_A861Rpt_Eje_Id ;
   private java.util.Date[] T001J2_A862Rpt_Eje_Fecha ;
   private boolean[] T001J2_n862Rpt_Eje_Fecha ;
   private String[] T001J2_A863Rpt_Eje_Usuario ;
   private boolean[] T001J2_n863Rpt_Eje_Usuario ;
   private String[] T001J2_A864Rpt_Eje_Email ;
   private boolean[] T001J2_n864Rpt_Eje_Email ;
   private String[] T001J2_A865Rpt_Eje_ReporteId ;
   private boolean[] T001J2_n865Rpt_Eje_ReporteId ;
   private String[] T001J2_A866Rpt_Eje_RequestId ;
   private boolean[] T001J2_n866Rpt_Eje_RequestId ;
   private String[] T001J2_A867Rpt_Eje_Estado ;
   private boolean[] T001J2_n867Rpt_Eje_Estado ;
   private int[] T001J9_A861Rpt_Eje_Id ;
   private int[] T001J12_A861Rpt_Eje_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class rpt_ejecucion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001J2", "SELECT Rpt_Eje_Id, Rpt_Eje_Fecha, Rpt_Eje_Usuario, Rpt_Eje_Email, Rpt_Eje_ReporteId, Rpt_Eje_RequestId, Rpt_Eje_Estado FROM RPT_EJECUCION WHERE Rpt_Eje_Id = ?  FOR UPDATE OF Rpt_Eje_Fecha, Rpt_Eje_Usuario, Rpt_Eje_Email, Rpt_Eje_ReporteId, Rpt_Eje_RequestId, Rpt_Eje_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J3", "SELECT Rpt_Eje_Id, Rpt_Eje_Fecha, Rpt_Eje_Usuario, Rpt_Eje_Email, Rpt_Eje_ReporteId, Rpt_Eje_RequestId, Rpt_Eje_Estado FROM RPT_EJECUCION WHERE Rpt_Eje_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J4", "SELECT /*+ FIRST_ROWS(100) */ TM1.Rpt_Eje_Id, TM1.Rpt_Eje_Fecha, TM1.Rpt_Eje_Usuario, TM1.Rpt_Eje_Email, TM1.Rpt_Eje_ReporteId, TM1.Rpt_Eje_RequestId, TM1.Rpt_Eje_Estado FROM RPT_EJECUCION TM1 WHERE TM1.Rpt_Eje_Id = ? ORDER BY TM1.Rpt_Eje_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001J5", "SELECT /*+ FIRST_ROWS(1) */ Rpt_Eje_Id FROM RPT_EJECUCION WHERE Rpt_Eje_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rpt_Eje_Id FROM RPT_EJECUCION WHERE ( Rpt_Eje_Id > ?) ORDER BY Rpt_Eje_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001J7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Rpt_Eje_Id FROM RPT_EJECUCION WHERE ( Rpt_Eje_Id < ?) ORDER BY Rpt_Eje_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001J8", "INSERT INTO RPT_EJECUCION(Rpt_Eje_Fecha, Rpt_Eje_Usuario, Rpt_Eje_Email, Rpt_Eje_ReporteId, Rpt_Eje_RequestId, Rpt_Eje_Estado) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "RPT_EJECUCION")
         ,new ForEachCursor("T001J9", "SELECT Rpt_Eje_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001J10", "UPDATE RPT_EJECUCION SET Rpt_Eje_Fecha=?, Rpt_Eje_Usuario=?, Rpt_Eje_Email=?, Rpt_Eje_ReporteId=?, Rpt_Eje_RequestId=?, Rpt_Eje_Estado=?  WHERE Rpt_Eje_Id = ?", GX_NOMASK, "RPT_EJECUCION")
         ,new UpdateCursor("T001J11", "DELETE FROM RPT_EJECUCION  WHERE Rpt_Eje_Id = ?", GX_NOMASK, "RPT_EJECUCION")
         ,new ForEachCursor("T001J12", "SELECT /*+ FIRST_ROWS(100) */ Rpt_Eje_Id FROM RPT_EJECUCION ORDER BY Rpt_Eje_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 10 :
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 50);
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
                  stmt.setVarchar(6, (String)parms[11], 10);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 50);
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
                  stmt.setVarchar(6, (String)parms[11], 10);
               }
               stmt.setInt(7, ((Number) parms[12]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

