/*
               File: alm_lista_atributos_impl
        Description: Lista de atributos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:11.35
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

public final  class alm_lista_atributos_impl extends GXDataArea
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
            AV7List_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7List_Id", GXutil.ltrim( GXutil.str( AV7List_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vLIST_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7List_Id), "ZZZZZZZZZZ9")));
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
      cmbList_Tipo.setName( "LIST_TIPO" );
      cmbList_Tipo.setWebtags( "" );
      cmbList_Tipo.addItem("O", "Otro", (short)(0));
      cmbList_Tipo.addItem("F", "Fecha", (short)(0));
      if ( cmbList_Tipo.getItemCount() > 0 )
      {
         A423List_Tipo = cmbList_Tipo.getValidValue(A423List_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
      }
      cmbList_Estado.setName( "LIST_ESTADO" );
      cmbList_Estado.setWebtags( "" );
      cmbList_Estado.addItem("", "", (short)(0));
      cmbList_Estado.addItem("A", "Activo", (short)(0));
      cmbList_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbList_Estado.getItemCount() > 0 )
      {
         A675List_Estado = cmbList_Estado.getValidValue(A675List_Estado) ;
         n675List_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
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
         Form.getMeta().addItem("description", "Lista de atributos", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtList_Descripcion_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_lista_atributos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_lista_atributos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_lista_atributos_impl.class ));
   }

   public alm_lista_atributos_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbList_Tipo = new HTMLChoice();
      cmbList_Estado = new HTMLChoice();
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
      if ( cmbList_Tipo.getItemCount() > 0 )
      {
         A423List_Tipo = cmbList_Tipo.getValidValue(A423List_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
      }
      if ( cmbList_Estado.getItemCount() > 0 )
      {
         A675List_Estado = cmbList_Estado.getValidValue(A675List_Estado) ;
         n675List_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Lista de atributos", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_LISTA_ATRIBUTOS.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_LISTA_ATRIBUTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtList_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtList_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A36List_Id, (byte)(11), (byte)(0), ",", "")), ((edtList_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A36List_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A36List_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtList_Id_Jsonclick, 0, "Attribute", "", "", "", 1, edtList_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_LISTA_ATRIBUTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtList_Descripcion_Internalname, "Atributo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtList_Descripcion_Internalname, A393List_Descripcion, GXutil.rtrim( localUtil.format( A393List_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtList_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtList_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_LISTA_ATRIBUTOS.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbList_Tipo.getInternalname(), "Tipo ", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbList_Tipo, cmbList_Tipo.getInternalname(), GXutil.rtrim( A423List_Tipo), 1, cmbList_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbList_Tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_ALM_LISTA_ATRIBUTOS.htm");
         cmbList_Tipo.setValue( GXutil.rtrim( A423List_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Values", cmbList_Tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbList_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbList_Estado, cmbList_Estado.getInternalname(), GXutil.rtrim( A675List_Estado), 1, cmbList_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbList_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, "HLP_ALM_LISTA_ATRIBUTOS.htm");
         cmbList_Estado.setValue( GXutil.rtrim( A675List_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbList_Estado.getInternalname(), "Values", cmbList_Estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_LISTA_ATRIBUTOS.htm");
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
      e11122 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A36List_Id = localUtil.ctol( httpContext.cgiGet( edtList_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
            A393List_Descripcion = GXutil.upper( httpContext.cgiGet( edtList_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A393List_Descripcion", A393List_Descripcion);
            cmbList_Tipo.setValue( httpContext.cgiGet( cmbList_Tipo.getInternalname()) );
            A423List_Tipo = httpContext.cgiGet( cmbList_Tipo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
            cmbList_Estado.setValue( httpContext.cgiGet( cmbList_Estado.getInternalname()) );
            A675List_Estado = httpContext.cgiGet( cmbList_Estado.getInternalname()) ;
            n675List_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
            n675List_Estado = ((GXutil.strcmp("", A675List_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z36List_Id = localUtil.ctol( httpContext.cgiGet( "Z36List_Id"), ",", ".") ;
            Z395List_UsuarioCrea = httpContext.cgiGet( "Z395List_UsuarioCrea") ;
            Z397List_UsuarioModifica = httpContext.cgiGet( "Z397List_UsuarioModifica") ;
            n397List_UsuarioModifica = ((GXutil.strcmp("", A397List_UsuarioModifica)==0) ? true : false) ;
            Z396List_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z396List_FechaCrea"), 0) ;
            Z398List_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z398List_FechaModifica"), 0) ;
            n398List_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A398List_FechaModifica) ? true : false) ;
            Z393List_Descripcion = httpContext.cgiGet( "Z393List_Descripcion") ;
            Z423List_Tipo = httpContext.cgiGet( "Z423List_Tipo") ;
            Z685List_tipo_elemento = httpContext.cgiGet( "Z685List_tipo_elemento") ;
            n685List_tipo_elemento = ((GXutil.strcmp("", A685List_tipo_elemento)==0) ? true : false) ;
            Z675List_Estado = httpContext.cgiGet( "Z675List_Estado") ;
            n675List_Estado = ((GXutil.strcmp("", A675List_Estado)==0) ? true : false) ;
            A395List_UsuarioCrea = httpContext.cgiGet( "Z395List_UsuarioCrea") ;
            A397List_UsuarioModifica = httpContext.cgiGet( "Z397List_UsuarioModifica") ;
            n397List_UsuarioModifica = false ;
            n397List_UsuarioModifica = ((GXutil.strcmp("", A397List_UsuarioModifica)==0) ? true : false) ;
            A396List_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z396List_FechaCrea"), 0) ;
            A398List_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z398List_FechaModifica"), 0) ;
            n398List_FechaModifica = false ;
            n398List_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A398List_FechaModifica) ? true : false) ;
            A685List_tipo_elemento = httpContext.cgiGet( "Z685List_tipo_elemento") ;
            n685List_tipo_elemento = false ;
            n685List_tipo_elemento = ((GXutil.strcmp("", A685List_tipo_elemento)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7List_Id = localUtil.ctol( httpContext.cgiGet( "vLIST_ID"), ",", ".") ;
            A395List_UsuarioCrea = httpContext.cgiGet( "LIST_USUARIOCREA") ;
            A397List_UsuarioModifica = httpContext.cgiGet( "LIST_USUARIOMODIFICA") ;
            n397List_UsuarioModifica = ((GXutil.strcmp("", A397List_UsuarioModifica)==0) ? true : false) ;
            A396List_FechaCrea = localUtil.ctot( httpContext.cgiGet( "LIST_FECHACREA"), 0) ;
            A398List_FechaModifica = localUtil.ctot( httpContext.cgiGet( "LIST_FECHAMODIFICA"), 0) ;
            n398List_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A398List_FechaModifica) ? true : false) ;
            A685List_tipo_elemento = httpContext.cgiGet( "LIST_TIPO_ELEMENTO") ;
            n685List_tipo_elemento = ((GXutil.strcmp("", A685List_tipo_elemento)==0) ? true : false) ;
            AV13Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_LISTA_ATRIBUTOS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A685List_tipo_elemento, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A36List_Id != Z36List_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_lista_atributos:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A36List_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
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
                  sMode39 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode39 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound39 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_120( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LIST_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtList_Id_Internalname ;
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
                        e11122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12122 ();
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
         e12122 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1239( ) ;
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
         disableAttributes1239( ) ;
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

   public void confirm_120( )
   {
      beforeValidate1239( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1239( ) ;
         }
         else
         {
            checkExtendedTable1239( ) ;
            closeExtendedTableCursors1239( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
   }

   public void resetCaption120( )
   {
   }

   public void e11122( )
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

   public void e12122( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_lista_atributos") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1239( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z395List_UsuarioCrea = T00123_A395List_UsuarioCrea[0] ;
            Z397List_UsuarioModifica = T00123_A397List_UsuarioModifica[0] ;
            Z396List_FechaCrea = T00123_A396List_FechaCrea[0] ;
            Z398List_FechaModifica = T00123_A398List_FechaModifica[0] ;
            Z393List_Descripcion = T00123_A393List_Descripcion[0] ;
            Z423List_Tipo = T00123_A423List_Tipo[0] ;
            Z685List_tipo_elemento = T00123_A685List_tipo_elemento[0] ;
            Z675List_Estado = T00123_A675List_Estado[0] ;
         }
         else
         {
            Z395List_UsuarioCrea = A395List_UsuarioCrea ;
            Z397List_UsuarioModifica = A397List_UsuarioModifica ;
            Z396List_FechaCrea = A396List_FechaCrea ;
            Z398List_FechaModifica = A398List_FechaModifica ;
            Z393List_Descripcion = A393List_Descripcion ;
            Z423List_Tipo = A423List_Tipo ;
            Z685List_tipo_elemento = A685List_tipo_elemento ;
            Z675List_Estado = A675List_Estado ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z36List_Id = A36List_Id ;
         Z395List_UsuarioCrea = A395List_UsuarioCrea ;
         Z397List_UsuarioModifica = A397List_UsuarioModifica ;
         Z396List_FechaCrea = A396List_FechaCrea ;
         Z398List_FechaModifica = A398List_FechaModifica ;
         Z393List_Descripcion = A393List_Descripcion ;
         Z423List_Tipo = A423List_Tipo ;
         Z685List_tipo_elemento = A685List_tipo_elemento ;
         Z675List_Estado = A675List_Estado ;
      }
   }

   public void standaloneNotModal( )
   {
      edtList_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), true);
      edtList_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7List_Id) )
      {
         A36List_Id = AV7List_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
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

   public void load1239( )
   {
      /* Using cursor T00124 */
      pr_default.execute(2, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A395List_UsuarioCrea = T00124_A395List_UsuarioCrea[0] ;
         A397List_UsuarioModifica = T00124_A397List_UsuarioModifica[0] ;
         n397List_UsuarioModifica = T00124_n397List_UsuarioModifica[0] ;
         A396List_FechaCrea = T00124_A396List_FechaCrea[0] ;
         A398List_FechaModifica = T00124_A398List_FechaModifica[0] ;
         n398List_FechaModifica = T00124_n398List_FechaModifica[0] ;
         A393List_Descripcion = T00124_A393List_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393List_Descripcion", A393List_Descripcion);
         A423List_Tipo = T00124_A423List_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
         A685List_tipo_elemento = T00124_A685List_tipo_elemento[0] ;
         n685List_tipo_elemento = T00124_n685List_tipo_elemento[0] ;
         A675List_Estado = T00124_A675List_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
         n675List_Estado = T00124_n675List_Estado[0] ;
         zm1239( -9) ;
      }
      pr_default.close(2);
      onLoadActions1239( ) ;
   }

   public void onLoadActions1239( )
   {
      AV13Pgmname = "ALM_LISTA_ATRIBUTOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void checkExtendedTable1239( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV13Pgmname = "ALM_LISTA_ATRIBUTOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
   }

   public void closeExtendedTableCursors1239( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1239( )
   {
      /* Using cursor T00125 */
      pr_default.execute(3, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00123 */
      pr_default.execute(1, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1239( 9) ;
         RcdFound39 = (short)(1) ;
         A36List_Id = T00123_A36List_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
         A395List_UsuarioCrea = T00123_A395List_UsuarioCrea[0] ;
         A397List_UsuarioModifica = T00123_A397List_UsuarioModifica[0] ;
         n397List_UsuarioModifica = T00123_n397List_UsuarioModifica[0] ;
         A396List_FechaCrea = T00123_A396List_FechaCrea[0] ;
         A398List_FechaModifica = T00123_A398List_FechaModifica[0] ;
         n398List_FechaModifica = T00123_n398List_FechaModifica[0] ;
         A393List_Descripcion = T00123_A393List_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393List_Descripcion", A393List_Descripcion);
         A423List_Tipo = T00123_A423List_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
         A685List_tipo_elemento = T00123_A685List_tipo_elemento[0] ;
         n685List_tipo_elemento = T00123_n685List_tipo_elemento[0] ;
         A675List_Estado = T00123_A675List_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
         n675List_Estado = T00123_n675List_Estado[0] ;
         Z36List_Id = A36List_Id ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load1239( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey1239( ) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1239( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1239( ) ;
      if ( RcdFound39 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T00126 */
      pr_default.execute(4, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00126_A36List_Id[0] < A36List_Id ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00126_A36List_Id[0] > A36List_Id ) ) )
         {
            A36List_Id = T00126_A36List_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T00127 */
      pr_default.execute(5, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00127_A36List_Id[0] > A36List_Id ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00127_A36List_Id[0] < A36List_Id ) ) )
         {
            A36List_Id = T00127_A36List_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1239( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtList_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1239( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( A36List_Id != Z36List_Id )
            {
               A36List_Id = Z36List_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LIST_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtList_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtList_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1239( ) ;
               GX_FocusControl = edtList_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A36List_Id != Z36List_Id )
            {
               /* Insert record */
               GX_FocusControl = edtList_Descripcion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1239( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LIST_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtList_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtList_Descripcion_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1239( ) ;
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
      if ( A36List_Id != Z36List_Id )
      {
         A36List_Id = Z36List_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LIST_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtList_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1239( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00122 */
         pr_default.execute(0, new Object[] {new Long(A36List_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_LISTA_ATRIBUTOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z395List_UsuarioCrea, T00122_A395List_UsuarioCrea[0]) != 0 ) || ( GXutil.strcmp(Z397List_UsuarioModifica, T00122_A397List_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z396List_FechaCrea, T00122_A396List_FechaCrea[0]) ) || !( GXutil.dateCompare(Z398List_FechaModifica, T00122_A398List_FechaModifica[0]) ) || ( GXutil.strcmp(Z393List_Descripcion, T00122_A393List_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z423List_Tipo, T00122_A423List_Tipo[0]) != 0 ) || ( GXutil.strcmp(Z685List_tipo_elemento, T00122_A685List_tipo_elemento[0]) != 0 ) || ( GXutil.strcmp(Z675List_Estado, T00122_A675List_Estado[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_LISTA_ATRIBUTOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1239( )
   {
      beforeValidate1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1239( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1239( 0) ;
         checkOptimisticConcurrency1239( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1239( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00128 */
                  pr_default.execute(6, new Object[] {A395List_UsuarioCrea, new Boolean(n397List_UsuarioModifica), A397List_UsuarioModifica, A396List_FechaCrea, new Boolean(n398List_FechaModifica), A398List_FechaModifica, A393List_Descripcion, A423List_Tipo, new Boolean(n685List_tipo_elemento), A685List_tipo_elemento, new Boolean(n675List_Estado), A675List_Estado});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00129 */
                  pr_default.execute(7);
                  A36List_Id = T00129_A36List_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_LISTA_ATRIBUTOS") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                        resetCaption120( ) ;
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
            load1239( ) ;
         }
         endLevel1239( ) ;
      }
      closeExtendedTableCursors1239( ) ;
   }

   public void update1239( )
   {
      beforeValidate1239( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1239( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1239( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1239( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1239( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001210 */
                  pr_default.execute(8, new Object[] {A395List_UsuarioCrea, new Boolean(n397List_UsuarioModifica), A397List_UsuarioModifica, A396List_FechaCrea, new Boolean(n398List_FechaModifica), A398List_FechaModifica, A393List_Descripcion, A423List_Tipo, new Boolean(n685List_tipo_elemento), A685List_tipo_elemento, new Boolean(n675List_Estado), A675List_Estado, new Long(A36List_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_LISTA_ATRIBUTOS") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_LISTA_ATRIBUTOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1239( ) ;
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
         endLevel1239( ) ;
      }
      closeExtendedTableCursors1239( ) ;
   }

   public void deferredUpdate1239( )
   {
   }

   public void delete( )
   {
      beforeValidate1239( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1239( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1239( ) ;
         afterConfirm1239( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1239( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001211 */
               pr_default.execute(9, new Object[] {new Long(A36List_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_LISTA_ATRIBUTOS") ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel1239( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls1239( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV13Pgmname = "ALM_LISTA_ATRIBUTOS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001212 */
         pr_default.execute(10, new Object[] {new Long(A36List_Id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ATRIBUTOS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001213 */
         pr_default.execute(11, new Object[] {new Long(A36List_Id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ATRIBUTOS"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel1239( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1239( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_lista_atributos");
         if ( AnyError == 0 )
         {
            confirmValues120( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_lista_atributos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1239( )
   {
      /* Scan By routine */
      /* Using cursor T001214 */
      pr_default.execute(12);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A36List_Id = T001214_A36List_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1239( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A36List_Id = T001214_A36List_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
      }
   }

   public void scanEnd1239( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1239( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A393List_Descripcion, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la descripción del Atributo", 1, "LIST_DESCRIPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Descripcion_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A395List_UsuarioCrea = AV12Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A395List_UsuarioCrea", A395List_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A397List_UsuarioModifica = AV12Usuario ;
         n397List_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A397List_UsuarioModifica", A397List_UsuarioModifica);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ && true /* After */ )
      {
         A396List_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396List_FechaCrea", localUtil.ttoc( A396List_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ && true /* After */ )
      {
         A398List_FechaModifica = GXutil.now( ) ;
         n398List_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A398List_FechaModifica", localUtil.ttoc( A398List_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(A423List_Tipo, "") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Debe seleccionar el tipo del Atributo", 1, "LIST_TIPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbList_Tipo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1239( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1239( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1239( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1239( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1239( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1239( )
   {
      edtList_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), true);
      edtList_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Descripcion_Enabled, 5, 0)), true);
      cmbList_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Tipo.getEnabled(), 5, 0)), true);
      cmbList_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Estado.getEnabled(), 5, 0)), true);
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues120( )
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414171221");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_lista_atributos") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7List_Id,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z36List_Id", GXutil.ltrim( localUtil.ntoc( Z36List_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z395List_UsuarioCrea", Z395List_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z397List_UsuarioModifica", Z397List_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z396List_FechaCrea", localUtil.ttoc( Z396List_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z398List_FechaModifica", localUtil.ttoc( Z398List_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z393List_Descripcion", Z393List_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z423List_Tipo", GXutil.rtrim( Z423List_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z685List_tipo_elemento", Z685List_tipo_elemento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z675List_Estado", GXutil.rtrim( Z675List_Estado));
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vLIST_ID", GXutil.ltrim( localUtil.ntoc( AV7List_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_USUARIOCREA", A395List_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_USUARIOMODIFICA", A397List_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_FECHACREA", localUtil.ttoc( A396List_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_FECHAMODIFICA", localUtil.ttoc( A398List_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_TIPO_ELEMENTO", A685List_tipo_elemento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV13Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLIST_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7List_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_LISTA_ATRIBUTOS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A685List_tipo_elemento, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_lista_atributos:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_lista_atributos") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7List_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_LISTA_ATRIBUTOS" ;
   }

   public String getPgmdesc( )
   {
      return "Lista de atributos" ;
   }

   public void initializeNonKey1239( )
   {
      A395List_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A395List_UsuarioCrea", A395List_UsuarioCrea);
      A397List_UsuarioModifica = "" ;
      n397List_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A397List_UsuarioModifica", A397List_UsuarioModifica);
      A396List_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A396List_FechaCrea", localUtil.ttoc( A396List_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A398List_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n398List_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A398List_FechaModifica", localUtil.ttoc( A398List_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A393List_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A393List_Descripcion", A393List_Descripcion);
      A423List_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A423List_Tipo", A423List_Tipo);
      A685List_tipo_elemento = "" ;
      n685List_tipo_elemento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A685List_tipo_elemento", A685List_tipo_elemento);
      A675List_Estado = "" ;
      n675List_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A675List_Estado", A675List_Estado);
      n675List_Estado = ((GXutil.strcmp("", A675List_Estado)==0) ? true : false) ;
      Z395List_UsuarioCrea = "" ;
      Z397List_UsuarioModifica = "" ;
      Z396List_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z398List_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z393List_Descripcion = "" ;
      Z423List_Tipo = "" ;
      Z685List_tipo_elemento = "" ;
      Z675List_Estado = "" ;
   }

   public void initAll1239( )
   {
      A36List_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A36List_Id", GXutil.ltrim( GXutil.str( A36List_Id, 11, 0)));
      initializeNonKey1239( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414171229");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_lista_atributos.js", "?201861414171229");
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
      edtList_Id_Internalname = "LIST_ID" ;
      edtList_Descripcion_Internalname = "LIST_DESCRIPCION" ;
      cmbList_Tipo.setInternalname( "LIST_TIPO" );
      cmbList_Estado.setInternalname( "LIST_ESTADO" );
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
      Form.setCaption( "Lista de atributos" );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbList_Estado.setJsonclick( "" );
      cmbList_Estado.setEnabled( 1 );
      cmbList_Tipo.setJsonclick( "" );
      cmbList_Tipo.setEnabled( 1 );
      edtList_Descripcion_Jsonclick = "" ;
      edtList_Descripcion_Enabled = 1 ;
      edtList_Id_Jsonclick = "" ;
      edtList_Id_Enabled = 0 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7List_Id',fld:'vLIST_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12122',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      Z395List_UsuarioCrea = "" ;
      Z397List_UsuarioModifica = "" ;
      Z396List_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z398List_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z393List_Descripcion = "" ;
      Z423List_Tipo = "" ;
      Z685List_tipo_elemento = "" ;
      Z675List_Estado = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A423List_Tipo = "" ;
      A675List_Estado = "" ;
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
      A393List_Descripcion = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A397List_UsuarioModifica = "" ;
      A398List_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A685List_tipo_elemento = "" ;
      A395List_UsuarioCrea = "" ;
      A396List_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV13Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode39 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV12Usuario = "" ;
      T00124_A36List_Id = new long[1] ;
      T00124_A395List_UsuarioCrea = new String[] {""} ;
      T00124_A397List_UsuarioModifica = new String[] {""} ;
      T00124_n397List_UsuarioModifica = new boolean[] {false} ;
      T00124_A396List_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00124_A398List_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00124_n398List_FechaModifica = new boolean[] {false} ;
      T00124_A393List_Descripcion = new String[] {""} ;
      T00124_A423List_Tipo = new String[] {""} ;
      T00124_A685List_tipo_elemento = new String[] {""} ;
      T00124_n685List_tipo_elemento = new boolean[] {false} ;
      T00124_A675List_Estado = new String[] {""} ;
      T00124_n675List_Estado = new boolean[] {false} ;
      T00125_A36List_Id = new long[1] ;
      T00123_A36List_Id = new long[1] ;
      T00123_A395List_UsuarioCrea = new String[] {""} ;
      T00123_A397List_UsuarioModifica = new String[] {""} ;
      T00123_n397List_UsuarioModifica = new boolean[] {false} ;
      T00123_A396List_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00123_A398List_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00123_n398List_FechaModifica = new boolean[] {false} ;
      T00123_A393List_Descripcion = new String[] {""} ;
      T00123_A423List_Tipo = new String[] {""} ;
      T00123_A685List_tipo_elemento = new String[] {""} ;
      T00123_n685List_tipo_elemento = new boolean[] {false} ;
      T00123_A675List_Estado = new String[] {""} ;
      T00123_n675List_Estado = new boolean[] {false} ;
      T00126_A36List_Id = new long[1] ;
      T00127_A36List_Id = new long[1] ;
      T00122_A36List_Id = new long[1] ;
      T00122_A395List_UsuarioCrea = new String[] {""} ;
      T00122_A397List_UsuarioModifica = new String[] {""} ;
      T00122_n397List_UsuarioModifica = new boolean[] {false} ;
      T00122_A396List_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T00122_A398List_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T00122_n398List_FechaModifica = new boolean[] {false} ;
      T00122_A393List_Descripcion = new String[] {""} ;
      T00122_A423List_Tipo = new String[] {""} ;
      T00122_A685List_tipo_elemento = new String[] {""} ;
      T00122_n685List_tipo_elemento = new boolean[] {false} ;
      T00122_A675List_Estado = new String[] {""} ;
      T00122_n675List_Estado = new boolean[] {false} ;
      T00129_A36List_Id = new long[1] ;
      T001212_A46Tran_Id = new long[1] ;
      T001212_A69TDet_Consecutivo = new long[1] ;
      T001212_A70TDet_ListId = new long[1] ;
      T001213_A34Clas_Codigo = new String[] {""} ;
      T001213_A36List_Id = new long[1] ;
      T001214_A36List_Id = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_lista_atributos__default(),
         new Object[] {
             new Object[] {
            T00122_A36List_Id, T00122_A395List_UsuarioCrea, T00122_A397List_UsuarioModifica, T00122_n397List_UsuarioModifica, T00122_A396List_FechaCrea, T00122_A398List_FechaModifica, T00122_n398List_FechaModifica, T00122_A393List_Descripcion, T00122_A423List_Tipo, T00122_A685List_tipo_elemento,
            T00122_n685List_tipo_elemento, T00122_A675List_Estado, T00122_n675List_Estado
            }
            , new Object[] {
            T00123_A36List_Id, T00123_A395List_UsuarioCrea, T00123_A397List_UsuarioModifica, T00123_n397List_UsuarioModifica, T00123_A396List_FechaCrea, T00123_A398List_FechaModifica, T00123_n398List_FechaModifica, T00123_A393List_Descripcion, T00123_A423List_Tipo, T00123_A685List_tipo_elemento,
            T00123_n685List_tipo_elemento, T00123_A675List_Estado, T00123_n675List_Estado
            }
            , new Object[] {
            T00124_A36List_Id, T00124_A395List_UsuarioCrea, T00124_A397List_UsuarioModifica, T00124_n397List_UsuarioModifica, T00124_A396List_FechaCrea, T00124_A398List_FechaModifica, T00124_n398List_FechaModifica, T00124_A393List_Descripcion, T00124_A423List_Tipo, T00124_A685List_tipo_elemento,
            T00124_n685List_tipo_elemento, T00124_A675List_Estado, T00124_n675List_Estado
            }
            , new Object[] {
            T00125_A36List_Id
            }
            , new Object[] {
            T00126_A36List_Id
            }
            , new Object[] {
            T00127_A36List_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T00129_A36List_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001212_A46Tran_Id, T001212_A69TDet_Consecutivo, T001212_A70TDet_ListId
            }
            , new Object[] {
            T001213_A34Clas_Codigo, T001213_A36List_Id
            }
            , new Object[] {
            T001214_A36List_Id
            }
         }
      );
      AV13Pgmname = "ALM_LISTA_ATRIBUTOS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound39 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtList_Id_Enabled ;
   private int edtList_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7List_Id ;
   private long Z36List_Id ;
   private long AV7List_Id ;
   private long A36List_Id ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z423List_Tipo ;
   private String Z675List_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A423List_Tipo ;
   private String A675List_Estado ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtList_Descripcion_Internalname ;
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
   private String edtList_Id_Internalname ;
   private String edtList_Id_Jsonclick ;
   private String edtList_Descripcion_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV13Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode39 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z396List_FechaCrea ;
   private java.util.Date Z398List_FechaModifica ;
   private java.util.Date A398List_FechaModifica ;
   private java.util.Date A396List_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n675List_Estado ;
   private boolean wbErr ;
   private boolean n397List_UsuarioModifica ;
   private boolean n398List_FechaModifica ;
   private boolean n685List_tipo_elemento ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z395List_UsuarioCrea ;
   private String Z397List_UsuarioModifica ;
   private String Z393List_Descripcion ;
   private String Z685List_tipo_elemento ;
   private String A393List_Descripcion ;
   private String A397List_UsuarioModifica ;
   private String A685List_tipo_elemento ;
   private String A395List_UsuarioCrea ;
   private String AV12Usuario ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private HTMLChoice cmbList_Tipo ;
   private HTMLChoice cmbList_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] T00124_A36List_Id ;
   private String[] T00124_A395List_UsuarioCrea ;
   private String[] T00124_A397List_UsuarioModifica ;
   private boolean[] T00124_n397List_UsuarioModifica ;
   private java.util.Date[] T00124_A396List_FechaCrea ;
   private java.util.Date[] T00124_A398List_FechaModifica ;
   private boolean[] T00124_n398List_FechaModifica ;
   private String[] T00124_A393List_Descripcion ;
   private String[] T00124_A423List_Tipo ;
   private String[] T00124_A685List_tipo_elemento ;
   private boolean[] T00124_n685List_tipo_elemento ;
   private String[] T00124_A675List_Estado ;
   private boolean[] T00124_n675List_Estado ;
   private long[] T00125_A36List_Id ;
   private long[] T00123_A36List_Id ;
   private String[] T00123_A395List_UsuarioCrea ;
   private String[] T00123_A397List_UsuarioModifica ;
   private boolean[] T00123_n397List_UsuarioModifica ;
   private java.util.Date[] T00123_A396List_FechaCrea ;
   private java.util.Date[] T00123_A398List_FechaModifica ;
   private boolean[] T00123_n398List_FechaModifica ;
   private String[] T00123_A393List_Descripcion ;
   private String[] T00123_A423List_Tipo ;
   private String[] T00123_A685List_tipo_elemento ;
   private boolean[] T00123_n685List_tipo_elemento ;
   private String[] T00123_A675List_Estado ;
   private boolean[] T00123_n675List_Estado ;
   private long[] T00126_A36List_Id ;
   private long[] T00127_A36List_Id ;
   private long[] T00122_A36List_Id ;
   private String[] T00122_A395List_UsuarioCrea ;
   private String[] T00122_A397List_UsuarioModifica ;
   private boolean[] T00122_n397List_UsuarioModifica ;
   private java.util.Date[] T00122_A396List_FechaCrea ;
   private java.util.Date[] T00122_A398List_FechaModifica ;
   private boolean[] T00122_n398List_FechaModifica ;
   private String[] T00122_A393List_Descripcion ;
   private String[] T00122_A423List_Tipo ;
   private String[] T00122_A685List_tipo_elemento ;
   private boolean[] T00122_n685List_tipo_elemento ;
   private String[] T00122_A675List_Estado ;
   private boolean[] T00122_n675List_Estado ;
   private long[] T00129_A36List_Id ;
   private long[] T001212_A46Tran_Id ;
   private long[] T001212_A69TDet_Consecutivo ;
   private long[] T001212_A70TDet_ListId ;
   private String[] T001213_A34Clas_Codigo ;
   private long[] T001213_A36List_Id ;
   private long[] T001214_A36List_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
}

final  class alm_lista_atributos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00122", "SELECT List_Id, List_UsuarioCrea, List_UsuarioModifica, List_FechaCrea, List_FechaModifica, List_Descripcion, List_Tipo, List_tipo_elemento, List_Estado FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ?  FOR UPDATE OF List_UsuarioCrea, List_UsuarioModifica, List_FechaCrea, List_FechaModifica, List_Descripcion, List_Tipo, List_tipo_elemento, List_Estado NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00123", "SELECT List_Id, List_UsuarioCrea, List_UsuarioModifica, List_FechaCrea, List_FechaModifica, List_Descripcion, List_Tipo, List_tipo_elemento, List_Estado FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00124", "SELECT /*+ FIRST_ROWS(100) */ TM1.List_Id, TM1.List_UsuarioCrea, TM1.List_UsuarioModifica, TM1.List_FechaCrea, TM1.List_FechaModifica, TM1.List_Descripcion, TM1.List_Tipo, TM1.List_tipo_elemento, TM1.List_Estado FROM ALM_LISTA_ATRIBUTOS TM1 WHERE TM1.List_Id = ? ORDER BY TM1.List_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00125", "SELECT /*+ FIRST_ROWS(1) */ List_Id FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00126", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ List_Id FROM ALM_LISTA_ATRIBUTOS WHERE ( List_Id > ?) ORDER BY List_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00127", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ List_Id FROM ALM_LISTA_ATRIBUTOS WHERE ( List_Id < ?) ORDER BY List_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00128", "INSERT INTO ALM_LISTA_ATRIBUTOS(List_UsuarioCrea, List_UsuarioModifica, List_FechaCrea, List_FechaModifica, List_Descripcion, List_Tipo, List_tipo_elemento, List_Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_LISTA_ATRIBUTOS")
         ,new ForEachCursor("T00129", "SELECT List_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001210", "UPDATE ALM_LISTA_ATRIBUTOS SET List_UsuarioCrea=?, List_UsuarioModifica=?, List_FechaCrea=?, List_FechaModifica=?, List_Descripcion=?, List_Tipo=?, List_tipo_elemento=?, List_Estado=?  WHERE List_Id = ?", GX_NOMASK, "ALM_LISTA_ATRIBUTOS")
         ,new UpdateCursor("T001211", "DELETE FROM ALM_LISTA_ATRIBUTOS  WHERE List_Id = ?", GX_NOMASK, "ALM_LISTA_ATRIBUTOS")
         ,new ForEachCursor("T001212", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo, TDet_ListId FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE TDet_ListId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001213", "SELECT * FROM (SELECT Clas_Codigo, List_Id FROM ALM_CLASEATRIBUTOS WHERE List_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001214", "SELECT /*+ FIRST_ROWS(100) */ List_Id FROM ALM_LISTA_ATRIBUTOS ORDER BY List_Id ",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getString(7, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
               stmt.setString(6, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
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
               stmt.setString(6, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               stmt.setLong(9, ((Number) parms[12]).longValue());
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

