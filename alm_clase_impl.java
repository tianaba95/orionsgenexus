/*
               File: alm_clase_impl
        Description: Clase
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:49.74
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

public final  class alm_clase_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A35FAM_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A35FAM_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A75SEG_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A75SEG_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A74TIP_Codigo = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A74TIP_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A36List_Id = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A36List_Id) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_clase_atributos") == 0 )
      {
         nRC_GXsfl_70 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_70_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_70_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_clase_atributos_newrow( ) ;
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
            AV7Clas_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Clas_Codigo", AV7Clas_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCLAS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Clas_Codigo, ""))));
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
      GXCCtl = "LIST_TIPO_" + sGXsfl_70_idx ;
      cmbList_Tipo.setName( GXCCtl );
      cmbList_Tipo.setWebtags( "" );
      cmbList_Tipo.addItem("O", "Otro", (short)(0));
      cmbList_Tipo.addItem("F", "Fecha", (short)(0));
      if ( cmbList_Tipo.getItemCount() > 0 )
      {
         A423List_Tipo = cmbList_Tipo.getValidValue(A423List_Tipo) ;
      }
      GXCCtl = "CLAS_ATRIBUTOOBLIGATORIO_" + sGXsfl_70_idx ;
      cmbClas_AtributoObligatorio.setName( GXCCtl );
      cmbClas_AtributoObligatorio.setWebtags( "" );
      cmbClas_AtributoObligatorio.addItem("SI", "SI", (short)(0));
      cmbClas_AtributoObligatorio.addItem("NO", "NO", (short)(0));
      if ( cmbClas_AtributoObligatorio.getItemCount() > 0 )
      {
         A555Clas_AtributoObligatorio = cmbClas_AtributoObligatorio.getValidValue(A555Clas_AtributoObligatorio) ;
      }
      GXCCtl = "CLAS_ESTADOATRIBUTO_" + sGXsfl_70_idx ;
      cmbClas_EstadoAtributo.setName( GXCCtl );
      cmbClas_EstadoAtributo.setWebtags( "" );
      cmbClas_EstadoAtributo.addItem("A", "Activo", (short)(0));
      cmbClas_EstadoAtributo.addItem("I", "Inactivo", (short)(0));
      if ( cmbClas_EstadoAtributo.getItemCount() > 0 )
      {
         A495Clas_EstadoAtributo = cmbClas_EstadoAtributo.getValidValue(A495Clas_EstadoAtributo) ;
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
         Form.getMeta().addItem("description", "Clase", (short)(0)) ;
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

   public alm_clase_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_clase_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_clase_impl.class ));
   }

   public alm_clase_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbList_Tipo = new HTMLChoice();
      cmbClas_AtributoObligatorio = new HTMLChoice();
      cmbClas_EstadoAtributo = new HTMLChoice();
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Clase", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Codigo_Internalname, "Código del tipo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Codigo_Internalname, A74TIP_Codigo, GXutil.rtrim( localUtil.format( A74TIP_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTIP_Descripcion_Internalname, "Descripción del tipo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTIP_Descripcion_Internalname, A435TIP_Descripcion, GXutil.rtrim( localUtil.format( A435TIP_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIP_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTIP_Descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Codigo_Internalname, "Código del segmento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Codigo_Internalname, A75SEG_Codigo, GXutil.rtrim( localUtil.format( A75SEG_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtSEG_Descripcion_Internalname, "Descripción del segmento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtSEG_Descripcion_Internalname, A442SEG_Descripcion, GXutil.rtrim( localUtil.format( A442SEG_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSEG_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtSEG_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Codigo_Internalname, "Código de la familia", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Codigo_Internalname, A35FAM_Codigo, GXutil.rtrim( localUtil.format( A35FAM_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Codigo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtFAM_Descripcion_Internalname, "Descripción de la familia", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtFAM_Descripcion_Internalname, A447FAM_Descripcion, GXutil.rtrim( localUtil.format( A447FAM_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFAM_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtFAM_Descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Codigo_Internalname, "Código de la clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Codigo_Internalname, A34Clas_Codigo, GXutil.rtrim( localUtil.format( A34Clas_Codigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtClas_Descripcion_Internalname, "Descripción de la clase", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtClas_Descripcion_Internalname, A291Clas_Descripcion, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClas_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtClas_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAtributostable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleatributos_Internalname, "Atributos", "", "", lblTitleatributos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_clase_atributos( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_CLASE.htm");
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

   public void gxdraw_gridalm_clase_atributos( )
   {
      /*  Grid Control  */
      Gridalm_clase_atributosContainer.AddObjectProperty("GridName", "Gridalm_clase_atributos");
      Gridalm_clase_atributosContainer.AddObjectProperty("Class", "WorkWith");
      Gridalm_clase_atributosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("CmpContext", "");
      Gridalm_clase_atributosContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A36List_Id, (byte)(11), (byte)(0), ".", "")));
      Gridalm_clase_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosColumn.AddObjectProperty("Value", A393List_Descripcion);
      Gridalm_clase_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosColumn.AddObjectProperty("Value", GXutil.rtrim( A423List_Tipo));
      Gridalm_clase_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbList_Tipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosColumn.AddObjectProperty("Value", GXutil.rtrim( A555Clas_AtributoObligatorio));
      Gridalm_clase_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_AtributoObligatorio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_clase_atributosColumn.AddObjectProperty("Value", GXutil.rtrim( A495Clas_EstadoAtributo));
      Gridalm_clase_atributosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_EstadoAtributo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddColumnProperties(Gridalm_clase_atributosColumn);
      Gridalm_clase_atributosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_clase_atributosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_clase_atributos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_70_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount35 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_35 = (short)(1) ;
            scanStart0Y35( ) ;
            while ( RcdFound35 != 0 )
            {
               init_level_properties35( ) ;
               getByPrimaryKey0Y35( ) ;
               addRow0Y35( ) ;
               scanNext0Y35( ) ;
            }
            scanEnd0Y35( ) ;
            nBlankRcdCount35 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0Y35( ) ;
         standaloneModal0Y35( ) ;
         sMode35 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow0Y35( ) ;
            edtList_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIST_ID_"+sGXsfl_70_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
            edtList_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIST_DESCRIPCION_"+sGXsfl_70_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtList_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Descripcion_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
            cmbList_Tipo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LIST_TIPO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Tipo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
            cmbClas_AtributoObligatorio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbClas_AtributoObligatorio.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbClas_AtributoObligatorio.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
            cmbClas_EstadoAtributo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbClas_EstadoAtributo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbClas_EstadoAtributo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
            imgprompt_36_Link = httpContext.cgiGet( "PROMPT_36_"+sGXsfl_70_idx+"Link") ;
            if ( ( nRcdExists_35 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0Y35( ) ;
            }
            sendRow0Y35( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount35 = (short)(5) ;
         nRcdExists_35 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0Y35( ) ;
            while ( RcdFound35 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_7035( ) ;
               init_level_properties35( ) ;
               standaloneNotModal0Y35( ) ;
               getByPrimaryKey0Y35( ) ;
               standaloneModal0Y35( ) ;
               addRow0Y35( ) ;
               scanNext0Y35( ) ;
            }
            scanEnd0Y35( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode35 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7035( ) ;
         initAll0Y35( ) ;
         init_level_properties35( ) ;
         standaloneNotModal0Y35( ) ;
         standaloneModal0Y35( ) ;
         nRcdExists_35 = (short)(0) ;
         nIsMod_35 = (short)(0) ;
         nRcdDeleted_35 = (short)(0) ;
         nBlankRcdCount35 = (short)(nBlankRcdUsr35+nBlankRcdCount35) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount35 > 0 )
         {
            addRow0Y35( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtList_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount35 = (short)(nBlankRcdCount35-1) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_clase_atributosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_clase_atributos", Gridalm_clase_atributosContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_clase_atributosContainerData", Gridalm_clase_atributosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_clase_atributosContainerData"+"V", Gridalm_clase_atributosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_clase_atributosContainerData"+"V"+"\" value='"+Gridalm_clase_atributosContainer.GridValuesHidden()+"'/>") ;
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
      e110Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
            A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
            A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
            A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
            A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
            A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
            A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
            A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
            /* Read saved values. */
            Z34Clas_Codigo = httpContext.cgiGet( "Z34Clas_Codigo") ;
            Z299Clas_UsuarioCreacion = httpContext.cgiGet( "Z299Clas_UsuarioCreacion") ;
            Z301Clas_UsuarioModifica = httpContext.cgiGet( "Z301Clas_UsuarioModifica") ;
            Z300Clas_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z300Clas_FechaCreacion"), 0) ;
            Z302Clas_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z302Clas_FechaModifica"), 0) ;
            Z291Clas_Descripcion = httpContext.cgiGet( "Z291Clas_Descripcion") ;
            Z35FAM_Codigo = httpContext.cgiGet( "Z35FAM_Codigo") ;
            A299Clas_UsuarioCreacion = httpContext.cgiGet( "Z299Clas_UsuarioCreacion") ;
            A301Clas_UsuarioModifica = httpContext.cgiGet( "Z301Clas_UsuarioModifica") ;
            A300Clas_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "Z300Clas_FechaCreacion"), 0) ;
            A302Clas_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z302Clas_FechaModifica"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), ",", ".")) ;
            AV7Clas_Codigo = httpContext.cgiGet( "vCLAS_CODIGO") ;
            AV18Insert_FAM_Codigo = httpContext.cgiGet( "vINSERT_FAM_CODIGO") ;
            AV15Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A299Clas_UsuarioCreacion = httpContext.cgiGet( "CLAS_USUARIOCREACION") ;
            A301Clas_UsuarioModifica = httpContext.cgiGet( "CLAS_USUARIOMODIFICA") ;
            A300Clas_FechaCreacion = localUtil.ctot( httpContext.cgiGet( "CLAS_FECHACREACION"), 0) ;
            A302Clas_FechaModifica = localUtil.ctot( httpContext.cgiGet( "CLAS_FECHAMODIFICA"), 0) ;
            AV19Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_CLASE" ;
            A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A34Clas_Codigo, Z34Clas_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_clase:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A34Clas_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
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
                  sMode34 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode34 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound34 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0Y0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLAS_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClas_Codigo_Internalname ;
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
                        e110Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120Y2 ();
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
         e120Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Y34( ) ;
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
         disableAttributes0Y34( ) ;
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

   public void confirm_0Y0( )
   {
      beforeValidate0Y34( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Y34( ) ;
         }
         else
         {
            checkExtendedTable0Y34( ) ;
            closeExtendedTableCursors0Y34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_0Y35( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0Y35( )
   {
      nGXsfl_70_idx = (short)(0) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow0Y35( ) ;
         if ( ( nRcdExists_35 != 0 ) || ( nIsMod_35 != 0 ) )
         {
            getKey0Y35( ) ;
            if ( ( nRcdExists_35 == 0 ) && ( nRcdDeleted_35 == 0 ) )
            {
               if ( RcdFound35 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0Y35( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0Y35( ) ;
                     closeExtendedTableCursors0Y35( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtList_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound35 != 0 )
               {
                  if ( nRcdDeleted_35 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0Y35( ) ;
                     load0Y35( ) ;
                     beforeValidate0Y35( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0Y35( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_35 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0Y35( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0Y35( ) ;
                           closeExtendedTableCursors0Y35( ) ;
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
                  if ( nRcdDeleted_35 == 0 )
                  {
                     GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtList_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtList_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A36List_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtList_Descripcion_Internalname, A393List_Descripcion) ;
         httpContext.changePostValue( cmbList_Tipo.getInternalname(), GXutil.rtrim( A423List_Tipo)) ;
         httpContext.changePostValue( cmbClas_AtributoObligatorio.getInternalname(), GXutil.rtrim( A555Clas_AtributoObligatorio)) ;
         httpContext.changePostValue( cmbClas_EstadoAtributo.getInternalname(), GXutil.rtrim( A495Clas_EstadoAtributo)) ;
         httpContext.changePostValue( "ZT_"+"Z36List_Id_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z36List_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z495Clas_EstadoAtributo_"+sGXsfl_70_idx, GXutil.rtrim( Z495Clas_EstadoAtributo)) ;
         httpContext.changePostValue( "ZT_"+"Z555Clas_AtributoObligatorio_"+sGXsfl_70_idx, GXutil.rtrim( Z555Clas_AtributoObligatorio)) ;
         httpContext.changePostValue( "nRcdDeleted_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_35 != 0 )
         {
            httpContext.changePostValue( "LIST_ID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIST_DESCRIPCION_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIST_TIPO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbList_Tipo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_AtributoObligatorio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_EstadoAtributo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0Y0( )
   {
   }

   public void e110Y2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV19Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV19Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV18Insert_FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_FAM_Codigo", AV18Insert_FAM_Codigo);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV19Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV20GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20GXV1", GXutil.ltrim( GXutil.str( AV20GXV1, 8, 0)));
         while ( AV20GXV1 <= AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV20GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "FAM_Codigo") == 0 )
            {
               AV18Insert_FAM_Codigo = AV17TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_FAM_Codigo", AV18Insert_FAM_Codigo);
            }
            AV20GXV1 = (int)(AV20GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20GXV1", GXutil.ltrim( GXutil.str( AV20GXV1, 8, 0)));
         }
      }
      AV15Usuario = AV11WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Usuario", AV15Usuario);
   }

   public void e120Y2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_clase") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0Y34( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z299Clas_UsuarioCreacion = T000Y6_A299Clas_UsuarioCreacion[0] ;
            Z301Clas_UsuarioModifica = T000Y6_A301Clas_UsuarioModifica[0] ;
            Z300Clas_FechaCreacion = T000Y6_A300Clas_FechaCreacion[0] ;
            Z302Clas_FechaModifica = T000Y6_A302Clas_FechaModifica[0] ;
            Z291Clas_Descripcion = T000Y6_A291Clas_Descripcion[0] ;
            Z35FAM_Codigo = T000Y6_A35FAM_Codigo[0] ;
         }
         else
         {
            Z299Clas_UsuarioCreacion = A299Clas_UsuarioCreacion ;
            Z301Clas_UsuarioModifica = A301Clas_UsuarioModifica ;
            Z300Clas_FechaCreacion = A300Clas_FechaCreacion ;
            Z302Clas_FechaModifica = A302Clas_FechaModifica ;
            Z291Clas_Descripcion = A291Clas_Descripcion ;
            Z35FAM_Codigo = A35FAM_Codigo ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z299Clas_UsuarioCreacion = A299Clas_UsuarioCreacion ;
         Z301Clas_UsuarioModifica = A301Clas_UsuarioModifica ;
         Z300Clas_FechaCreacion = A300Clas_FechaCreacion ;
         Z302Clas_FechaModifica = A302Clas_FechaModifica ;
         Z291Clas_Descripcion = A291Clas_Descripcion ;
         Z35FAM_Codigo = A35FAM_Codigo ;
         Z447FAM_Descripcion = A447FAM_Descripcion ;
         Z75SEG_Codigo = A75SEG_Codigo ;
         Z442SEG_Descripcion = A442SEG_Descripcion ;
         Z74TIP_Codigo = A74TIP_Codigo ;
         Z435TIP_Descripcion = A435TIP_Descripcion ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtSEG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      edtSEG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Descripcion_Enabled, 5, 0)), true);
      edtFAM_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      edtFAM_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Descripcion_Enabled, 5, 0)), true);
      edtClas_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      edtClas_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Descripcion_Enabled, 5, 0)), true);
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtSEG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      edtSEG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Descripcion_Enabled, 5, 0)), true);
      edtFAM_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      edtFAM_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Descripcion_Enabled, 5, 0)), true);
      edtClas_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      edtClas_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Descripcion_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV7Clas_Codigo)==0) )
      {
         A34Clas_Codigo = AV7Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_FAM_Codigo)==0) )
      {
         A35FAM_Codigo = AV18Insert_FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
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
         /* Using cursor T000Y7 */
         pr_default.execute(5, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000Y7_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000Y7_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(5);
         /* Using cursor T000Y8 */
         pr_default.execute(6, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000Y8_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000Y8_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(6);
         /* Using cursor T000Y9 */
         pr_default.execute(7, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000Y9_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(7);
      }
   }

   public void load0Y34( )
   {
      /* Using cursor T000Y10 */
      pr_default.execute(8, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A299Clas_UsuarioCreacion = T000Y10_A299Clas_UsuarioCreacion[0] ;
         A301Clas_UsuarioModifica = T000Y10_A301Clas_UsuarioModifica[0] ;
         A300Clas_FechaCreacion = T000Y10_A300Clas_FechaCreacion[0] ;
         A302Clas_FechaModifica = T000Y10_A302Clas_FechaModifica[0] ;
         A291Clas_Descripcion = T000Y10_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
         A447FAM_Descripcion = T000Y10_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A442SEG_Descripcion = T000Y10_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A435TIP_Descripcion = T000Y10_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         A35FAM_Codigo = T000Y10_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         A75SEG_Codigo = T000Y10_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         A74TIP_Codigo = T000Y10_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         zm0Y34( -18) ;
      }
      pr_default.close(8);
      onLoadActions0Y34( ) ;
   }

   public void onLoadActions0Y34( )
   {
      AV19Pgmname = "ALM_CLASE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
   }

   public void checkExtendedTable0Y34( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV19Pgmname = "ALM_CLASE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
      /* Using cursor T000Y7 */
      pr_default.execute(5, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Y7_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000Y7_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      pr_default.close(5);
      /* Using cursor T000Y8 */
      pr_default.execute(6, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Y8_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000Y8_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      pr_default.close(6);
      /* Using cursor T000Y9 */
      pr_default.execute(7, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Y9_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      pr_default.close(7);
   }

   public void closeExtendedTableCursors0Y34( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A35FAM_Codigo )
   {
      /* Using cursor T000Y11 */
      pr_default.execute(9, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Y11_A447FAM_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = T000Y11_A75SEG_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A447FAM_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A75SEG_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(9);
   }

   public void gxload_20( String A75SEG_Codigo )
   {
      /* Using cursor T000Y12 */
      pr_default.execute(10, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Y12_A442SEG_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = T000Y12_A74TIP_Codigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A442SEG_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A74TIP_Codigo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(10);
   }

   public void gxload_21( String A74TIP_Codigo )
   {
      /* Using cursor T000Y13 */
      pr_default.execute(11, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Y13_A435TIP_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A435TIP_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(11);
   }

   public void getKey0Y34( )
   {
      /* Using cursor T000Y14 */
      pr_default.execute(12, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Y6 */
      pr_default.execute(4, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0Y34( 18) ;
         RcdFound34 = (short)(1) ;
         A34Clas_Codigo = T000Y6_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         A299Clas_UsuarioCreacion = T000Y6_A299Clas_UsuarioCreacion[0] ;
         A301Clas_UsuarioModifica = T000Y6_A301Clas_UsuarioModifica[0] ;
         A300Clas_FechaCreacion = T000Y6_A300Clas_FechaCreacion[0] ;
         A302Clas_FechaModifica = T000Y6_A302Clas_FechaModifica[0] ;
         A291Clas_Descripcion = T000Y6_A291Clas_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
         A35FAM_Codigo = T000Y6_A35FAM_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
         Z34Clas_Codigo = A34Clas_Codigo ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0Y34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey0Y34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey0Y34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0Y34( ) ;
      if ( RcdFound34 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000Y15 */
      pr_default.execute(13, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000Y15_A34Clas_Codigo[0], A34Clas_Codigo) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T000Y15_A34Clas_Codigo[0], A34Clas_Codigo) > 0 ) ) )
         {
            A34Clas_Codigo = T000Y15_A34Clas_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000Y16 */
      pr_default.execute(14, new Object[] {A34Clas_Codigo});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T000Y16_A34Clas_Codigo[0], A34Clas_Codigo) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T000Y16_A34Clas_Codigo[0], A34Clas_Codigo) < 0 ) ) )
         {
            A34Clas_Codigo = T000Y16_A34Clas_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Y34( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0Y34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( GXutil.strcmp(A34Clas_Codigo, Z34Clas_Codigo) != 0 )
            {
               A34Clas_Codigo = Z34Clas_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLAS_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtClas_Codigo_Internalname ;
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
               update0Y34( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(A34Clas_Codigo, Z34Clas_Codigo) != 0 )
            {
               /* Insert record */
               insert0Y34( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLAS_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtClas_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert0Y34( ) ;
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
      if ( GXutil.strcmp(A34Clas_Codigo, Z34Clas_Codigo) != 0 )
      {
         A34Clas_Codigo = Z34Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLAS_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClas_Codigo_Internalname ;
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

   public void checkOptimisticConcurrency0Y34( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Y5 */
         pr_default.execute(3, new Object[] {A34Clas_Codigo});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CLASE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z299Clas_UsuarioCreacion, T000Y5_A299Clas_UsuarioCreacion[0]) != 0 ) || ( GXutil.strcmp(Z301Clas_UsuarioModifica, T000Y5_A301Clas_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z300Clas_FechaCreacion, T000Y5_A300Clas_FechaCreacion[0]) ) || !( GXutil.dateCompare(Z302Clas_FechaModifica, T000Y5_A302Clas_FechaModifica[0]) ) || ( GXutil.strcmp(Z291Clas_Descripcion, T000Y5_A291Clas_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z35FAM_Codigo, T000Y5_A35FAM_Codigo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CLASE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Y34( )
   {
      beforeValidate0Y34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Y34( 0) ;
         checkOptimisticConcurrency0Y34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Y34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y17 */
                  pr_default.execute(15, new Object[] {A34Clas_Codigo, A299Clas_UsuarioCreacion, A301Clas_UsuarioModifica, A300Clas_FechaCreacion, A302Clas_FechaModifica, A291Clas_Descripcion, A35FAM_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASE") ;
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel0Y34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0Y0( ) ;
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
            load0Y34( ) ;
         }
         endLevel0Y34( ) ;
      }
      closeExtendedTableCursors0Y34( ) ;
   }

   public void update0Y34( )
   {
      beforeValidate0Y34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Y34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y18 */
                  pr_default.execute(16, new Object[] {A299Clas_UsuarioCreacion, A301Clas_UsuarioModifica, A300Clas_FechaCreacion, A302Clas_FechaModifica, A291Clas_Descripcion, A35FAM_Codigo, A34Clas_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASE") ;
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CLASE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Y34( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0Y34( ) ;
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
         endLevel0Y34( ) ;
      }
      closeExtendedTableCursors0Y34( ) ;
   }

   public void deferredUpdate0Y34( )
   {
   }

   public void delete( )
   {
      beforeValidate0Y34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Y34( ) ;
         afterConfirm0Y34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Y34( ) ;
            if ( AnyError == 0 )
            {
               scanStart0Y35( ) ;
               while ( RcdFound35 != 0 )
               {
                  getByPrimaryKey0Y35( ) ;
                  delete0Y35( ) ;
                  scanNext0Y35( ) ;
               }
               scanEnd0Y35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y19 */
                  pr_default.execute(17, new Object[] {A34Clas_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASE") ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0Y34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0Y34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV19Pgmname = "ALM_CLASE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
         /* Using cursor T000Y20 */
         pr_default.execute(18, new Object[] {A35FAM_Codigo});
         A447FAM_Descripcion = T000Y20_A447FAM_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
         A75SEG_Codigo = T000Y20_A75SEG_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
         pr_default.close(18);
         /* Using cursor T000Y21 */
         pr_default.execute(19, new Object[] {A75SEG_Codigo});
         A442SEG_Descripcion = T000Y21_A442SEG_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
         A74TIP_Codigo = T000Y21_A74TIP_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
         pr_default.close(19);
         /* Using cursor T000Y22 */
         pr_default.execute(20, new Object[] {A74TIP_Codigo});
         A435TIP_Descripcion = T000Y22_A435TIP_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000Y23 */
         pr_default.execute(21, new Object[] {A34Clas_Codigo});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Catálogo"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel0Y35( )
   {
      nGXsfl_70_idx = (short)(0) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow0Y35( ) ;
         if ( ( nRcdExists_35 != 0 ) || ( nIsMod_35 != 0 ) )
         {
            standaloneNotModal0Y35( ) ;
            getKey0Y35( ) ;
            if ( ( nRcdExists_35 == 0 ) && ( nRcdDeleted_35 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0Y35( ) ;
            }
            else
            {
               if ( RcdFound35 != 0 )
               {
                  if ( ( nRcdDeleted_35 != 0 ) && ( nRcdExists_35 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0Y35( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_35 != 0 ) && ( nRcdExists_35 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0Y35( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_35 == 0 )
                  {
                     GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtList_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtList_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A36List_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtList_Descripcion_Internalname, A393List_Descripcion) ;
         httpContext.changePostValue( cmbList_Tipo.getInternalname(), GXutil.rtrim( A423List_Tipo)) ;
         httpContext.changePostValue( cmbClas_AtributoObligatorio.getInternalname(), GXutil.rtrim( A555Clas_AtributoObligatorio)) ;
         httpContext.changePostValue( cmbClas_EstadoAtributo.getInternalname(), GXutil.rtrim( A495Clas_EstadoAtributo)) ;
         httpContext.changePostValue( "ZT_"+"Z36List_Id_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z36List_Id, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z495Clas_EstadoAtributo_"+sGXsfl_70_idx, GXutil.rtrim( Z495Clas_EstadoAtributo)) ;
         httpContext.changePostValue( "ZT_"+"Z555Clas_AtributoObligatorio_"+sGXsfl_70_idx, GXutil.rtrim( Z555Clas_AtributoObligatorio)) ;
         httpContext.changePostValue( "nRcdDeleted_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_35_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_35 != 0 )
         {
            httpContext.changePostValue( "LIST_ID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Id_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIST_DESCRIPCION_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LIST_TIPO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbList_Tipo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_AtributoObligatorio.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_EstadoAtributo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0Y35( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_35 = (short)(0) ;
      nIsMod_35 = (short)(0) ;
      nRcdDeleted_35 = (short)(0) ;
   }

   public void processLevel0Y34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel0Y35( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0Y34( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Y34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_clase");
         if ( AnyError == 0 )
         {
            confirmValues0Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_clase");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Y34( )
   {
      /* Scan By routine */
      /* Using cursor T000Y24 */
      pr_default.execute(22);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A34Clas_Codigo = T000Y24_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Y34( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A34Clas_Codigo = T000Y24_A34Clas_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      }
   }

   public void scanEnd0Y34( )
   {
      pr_default.close(22);
   }

   public void afterConfirm0Y34( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A300Clas_FechaCreacion = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A300Clas_FechaCreacion", localUtil.ttoc( A300Clas_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A302Clas_FechaModifica = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A302Clas_FechaModifica", localUtil.ttoc( A302Clas_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A299Clas_UsuarioCreacion = AV15Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A299Clas_UsuarioCreacion", A299Clas_UsuarioCreacion);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && true /* After */ )
      {
         A301Clas_UsuarioModifica = AV15Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A301Clas_UsuarioModifica", A301Clas_UsuarioModifica);
      }
   }

   public void beforeInsert0Y34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Y34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Y34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Y34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Y34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Y34( )
   {
      edtTIP_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Codigo_Enabled, 5, 0)), true);
      edtTIP_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIP_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTIP_Descripcion_Enabled, 5, 0)), true);
      edtSEG_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Codigo_Enabled, 5, 0)), true);
      edtSEG_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSEG_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtSEG_Descripcion_Enabled, 5, 0)), true);
      edtFAM_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Codigo_Enabled, 5, 0)), true);
      edtFAM_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFAM_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtFAM_Descripcion_Enabled, 5, 0)), true);
      edtClas_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Codigo_Enabled, 5, 0)), true);
      edtClas_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClas_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtClas_Descripcion_Enabled, 5, 0)), true);
   }

   public void zm0Y35( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z495Clas_EstadoAtributo = T000Y3_A495Clas_EstadoAtributo[0] ;
            Z555Clas_AtributoObligatorio = T000Y3_A555Clas_AtributoObligatorio[0] ;
         }
         else
         {
            Z495Clas_EstadoAtributo = A495Clas_EstadoAtributo ;
            Z555Clas_AtributoObligatorio = A555Clas_AtributoObligatorio ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z495Clas_EstadoAtributo = A495Clas_EstadoAtributo ;
         Z555Clas_AtributoObligatorio = A555Clas_AtributoObligatorio ;
         Z36List_Id = A36List_Id ;
         Z393List_Descripcion = A393List_Descripcion ;
         Z423List_Tipo = A423List_Tipo ;
      }
   }

   public void standaloneNotModal0Y35( )
   {
      cmbList_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Tipo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
   }

   public void standaloneModal0Y35( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtList_Id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtList_Id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
      }
   }

   public void load0Y35( )
   {
      /* Using cursor T000Y25 */
      pr_default.execute(23, new Object[] {A34Clas_Codigo, new Long(A36List_Id)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A393List_Descripcion = T000Y25_A393List_Descripcion[0] ;
         A423List_Tipo = T000Y25_A423List_Tipo[0] ;
         A495Clas_EstadoAtributo = T000Y25_A495Clas_EstadoAtributo[0] ;
         A555Clas_AtributoObligatorio = T000Y25_A555Clas_AtributoObligatorio[0] ;
         zm0Y35( -22) ;
      }
      pr_default.close(23);
      onLoadActions0Y35( ) ;
   }

   public void onLoadActions0Y35( )
   {
   }

   public void checkExtendedTable0Y35( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0Y35( ) ;
      /* Using cursor T000Y4 */
      pr_default.execute(2, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem("No existe 'LISTA DE ATRIBUTOS'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A393List_Descripcion = T000Y4_A393List_Descripcion[0] ;
      A423List_Tipo = T000Y4_A423List_Tipo[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0Y35( )
   {
      pr_default.close(2);
   }

   public void enableDisable0Y35( )
   {
   }

   public void gxload_23( long A36List_Id )
   {
      /* Using cursor T000Y26 */
      pr_default.execute(24, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem("No existe 'LISTA DE ATRIBUTOS'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A393List_Descripcion = T000Y26_A393List_Descripcion[0] ;
      A423List_Tipo = T000Y26_A423List_Tipo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A393List_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A423List_Tipo))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(24);
   }

   public void getKey0Y35( )
   {
      /* Using cursor T000Y27 */
      pr_default.execute(25, new Object[] {A34Clas_Codigo, new Long(A36List_Id)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey0Y35( )
   {
      /* Using cursor T000Y3 */
      pr_default.execute(1, new Object[] {A34Clas_Codigo, new Long(A36List_Id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Y35( 22) ;
         RcdFound35 = (short)(1) ;
         initializeNonKey0Y35( ) ;
         A495Clas_EstadoAtributo = T000Y3_A495Clas_EstadoAtributo[0] ;
         A555Clas_AtributoObligatorio = T000Y3_A555Clas_AtributoObligatorio[0] ;
         A36List_Id = T000Y3_A36List_Id[0] ;
         Z34Clas_Codigo = A34Clas_Codigo ;
         Z36List_Id = A36List_Id ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0Y35( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey0Y35( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0Y35( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0Y35( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0Y35( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Y2 */
         pr_default.execute(0, new Object[] {A34Clas_Codigo, new Long(A36List_Id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CLASEATRIBUTOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z495Clas_EstadoAtributo, T000Y2_A495Clas_EstadoAtributo[0]) != 0 ) || ( GXutil.strcmp(Z555Clas_AtributoObligatorio, T000Y2_A555Clas_AtributoObligatorio[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_CLASEATRIBUTOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Y35( )
   {
      beforeValidate0Y35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y35( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Y35( 0) ;
         checkOptimisticConcurrency0Y35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y35( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Y35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y28 */
                  pr_default.execute(26, new Object[] {A34Clas_Codigo, A495Clas_EstadoAtributo, A555Clas_AtributoObligatorio, new Long(A36List_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASEATRIBUTOS") ;
                  if ( (pr_default.getStatus(26) == 1) )
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
            load0Y35( ) ;
         }
         endLevel0Y35( ) ;
      }
      closeExtendedTableCursors0Y35( ) ;
   }

   public void update0Y35( )
   {
      beforeValidate0Y35( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y35( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y35( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y35( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Y35( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y29 */
                  pr_default.execute(27, new Object[] {A495Clas_EstadoAtributo, A555Clas_AtributoObligatorio, A34Clas_Codigo, new Long(A36List_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASEATRIBUTOS") ;
                  if ( (pr_default.getStatus(27) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_CLASEATRIBUTOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Y35( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0Y35( ) ;
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
         endLevel0Y35( ) ;
      }
      closeExtendedTableCursors0Y35( ) ;
   }

   public void deferredUpdate0Y35( )
   {
   }

   public void delete0Y35( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0Y35( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y35( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Y35( ) ;
         afterConfirm0Y35( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Y35( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Y30 */
               pr_default.execute(28, new Object[] {A34Clas_Codigo, new Long(A36List_Id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_CLASEATRIBUTOS") ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0Y35( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0Y35( )
   {
      standaloneModal0Y35( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000Y31 */
         pr_default.execute(29, new Object[] {new Long(A36List_Id)});
         A393List_Descripcion = T000Y31_A393List_Descripcion[0] ;
         A423List_Tipo = T000Y31_A423List_Tipo[0] ;
         pr_default.close(29);
      }
   }

   public void endLevel0Y35( )
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

   public void scanStart0Y35( )
   {
      /* Scan By routine */
      /* Using cursor T000Y32 */
      pr_default.execute(30, new Object[] {A34Clas_Codigo});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A36List_Id = T000Y32_A36List_Id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Y35( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A36List_Id = T000Y32_A36List_Id[0] ;
      }
   }

   public void scanEnd0Y35( )
   {
      pr_default.close(30);
   }

   public void afterConfirm0Y35( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Y35( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Y35( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Y35( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Y35( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Y35( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Y35( )
   {
      edtList_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
      edtList_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Descripcion_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
      cmbList_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Tipo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
      cmbClas_AtributoObligatorio.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbClas_AtributoObligatorio.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbClas_AtributoObligatorio.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
      cmbClas_EstadoAtributo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbClas_EstadoAtributo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbClas_EstadoAtributo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
   }

   public void subsflControlProps_7035( )
   {
      edtList_Id_Internalname = "LIST_ID_"+sGXsfl_70_idx ;
      imgprompt_36_Internalname = "PROMPT_36_"+sGXsfl_70_idx ;
      edtList_Descripcion_Internalname = "LIST_DESCRIPCION_"+sGXsfl_70_idx ;
      cmbList_Tipo.setInternalname( "LIST_TIPO_"+sGXsfl_70_idx );
      cmbClas_AtributoObligatorio.setInternalname( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx );
      cmbClas_EstadoAtributo.setInternalname( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx );
   }

   public void subsflControlProps_fel_7035( )
   {
      edtList_Id_Internalname = "LIST_ID_"+sGXsfl_70_fel_idx ;
      imgprompt_36_Internalname = "PROMPT_36_"+sGXsfl_70_fel_idx ;
      edtList_Descripcion_Internalname = "LIST_DESCRIPCION_"+sGXsfl_70_fel_idx ;
      cmbList_Tipo.setInternalname( "LIST_TIPO_"+sGXsfl_70_fel_idx );
      cmbClas_AtributoObligatorio.setInternalname( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_fel_idx );
      cmbClas_EstadoAtributo.setInternalname( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_fel_idx );
   }

   public void addRow0Y35( )
   {
      nGXsfl_70_idx = (short)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7035( ) ;
      sendRow0Y35( ) ;
   }

   public void sendRow0Y35( )
   {
      Gridalm_clase_atributosRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_clase_atributos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_clase_atributos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_clase_atributos_Class, "") != 0 )
         {
            subGridalm_clase_atributos_Linesclass = subGridalm_clase_atributos_Class+"Odd" ;
         }
      }
      else if ( subGridalm_clase_atributos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_clase_atributos_Backstyle = (byte)(0) ;
         subGridalm_clase_atributos_Backcolor = subGridalm_clase_atributos_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_clase_atributos_Class, "") != 0 )
         {
            subGridalm_clase_atributos_Linesclass = subGridalm_clase_atributos_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_clase_atributos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_clase_atributos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_clase_atributos_Class, "") != 0 )
         {
            subGridalm_clase_atributos_Linesclass = subGridalm_clase_atributos_Class+"Odd" ;
         }
         subGridalm_clase_atributos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_clase_atributos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_clase_atributos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
         {
            subGridalm_clase_atributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_clase_atributos_Class, "") != 0 )
            {
               subGridalm_clase_atributos_Linesclass = subGridalm_clase_atributos_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_clase_atributos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_clase_atributos_Class, "") != 0 )
            {
               subGridalm_clase_atributos_Linesclass = subGridalm_clase_atributos_Class+"Odd" ;
            }
         }
      }
      imgprompt_36_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0130"+"',["+"{Ctrl:gx.dom.el('"+"LIST_ID_"+sGXsfl_70_idx+"'), id:'"+"LIST_ID_"+sGXsfl_70_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_35_"+sGXsfl_70_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00z1"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t(34,2),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"LIST_ID_"',3),t(+,5),t(sGXsfl_70_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"LIST_ID_"',3),t(+,5),t(sGXsfl_70_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_35_"',3),t(+,5),t(sGXsfl_70_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_34,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_clase_atributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtList_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A36List_Id, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A36List_Id), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtList_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtList_Id_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(70),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_clase_atributosRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_36_Internalname,sImgUrl,imgprompt_36_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_36_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_clase_atributosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtList_Descripcion_Internalname,A393List_Descripcion,GXutil.rtrim( localUtil.format( A393List_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtList_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtList_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(70),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      GXCCtl = "LIST_TIPO_" + sGXsfl_70_idx ;
      cmbList_Tipo.setName( GXCCtl );
      cmbList_Tipo.setWebtags( "" );
      cmbList_Tipo.addItem("O", "Otro", (short)(0));
      cmbList_Tipo.addItem("F", "Fecha", (short)(0));
      if ( cmbList_Tipo.getItemCount() > 0 )
      {
         A423List_Tipo = cmbList_Tipo.getValidValue(A423List_Tipo) ;
      }
      /* ComboBox */
      Gridalm_clase_atributosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbList_Tipo,cmbList_Tipo.getInternalname(),GXutil.rtrim( A423List_Tipo),new Integer(1),cmbList_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(cmbList_Tipo.getEnabled()),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","","",new Boolean(true)});
      cmbList_Tipo.setValue( GXutil.rtrim( A423List_Tipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Values", cmbList_Tipo.ToJavascriptSource(), !bGXsfl_70_Refreshing);
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      if ( ( nGXsfl_70_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CLAS_ATRIBUTOOBLIGATORIO_" + sGXsfl_70_idx ;
         cmbClas_AtributoObligatorio.setName( GXCCtl );
         cmbClas_AtributoObligatorio.setWebtags( "" );
         cmbClas_AtributoObligatorio.addItem("SI", "SI", (short)(0));
         cmbClas_AtributoObligatorio.addItem("NO", "NO", (short)(0));
         if ( cmbClas_AtributoObligatorio.getItemCount() > 0 )
         {
            A555Clas_AtributoObligatorio = cmbClas_AtributoObligatorio.getValidValue(A555Clas_AtributoObligatorio) ;
         }
      }
      /* ComboBox */
      Gridalm_clase_atributosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbClas_AtributoObligatorio,cmbClas_AtributoObligatorio.getInternalname(),GXutil.rtrim( A555Clas_AtributoObligatorio),new Integer(1),cmbClas_AtributoObligatorio.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbClas_AtributoObligatorio.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","",new Boolean(true)});
      cmbClas_AtributoObligatorio.setValue( GXutil.rtrim( A555Clas_AtributoObligatorio) );
      httpContext.ajax_rsp_assign_prop("", false, cmbClas_AtributoObligatorio.getInternalname(), "Values", cmbClas_AtributoObligatorio.ToJavascriptSource(), !bGXsfl_70_Refreshing);
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      if ( ( nGXsfl_70_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CLAS_ESTADOATRIBUTO_" + sGXsfl_70_idx ;
         cmbClas_EstadoAtributo.setName( GXCCtl );
         cmbClas_EstadoAtributo.setWebtags( "" );
         cmbClas_EstadoAtributo.addItem("A", "Activo", (short)(0));
         cmbClas_EstadoAtributo.addItem("I", "Inactivo", (short)(0));
         if ( cmbClas_EstadoAtributo.getItemCount() > 0 )
         {
            A495Clas_EstadoAtributo = cmbClas_EstadoAtributo.getValidValue(A495Clas_EstadoAtributo) ;
         }
      }
      /* ComboBox */
      Gridalm_clase_atributosRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbClas_EstadoAtributo,cmbClas_EstadoAtributo.getInternalname(),GXutil.rtrim( A495Clas_EstadoAtributo),new Integer(1),cmbClas_EstadoAtributo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbClas_EstadoAtributo.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","",new Boolean(true)});
      cmbClas_EstadoAtributo.setValue( GXutil.rtrim( A495Clas_EstadoAtributo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbClas_EstadoAtributo.getInternalname(), "Values", cmbClas_EstadoAtributo.ToJavascriptSource(), !bGXsfl_70_Refreshing);
      httpContext.ajax_sending_grid_row(Gridalm_clase_atributosRow);
      GXCCtl = "Z36List_Id_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z36List_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "Z495Clas_EstadoAtributo_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z495Clas_EstadoAtributo));
      GXCCtl = "Z555Clas_AtributoObligatorio_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z555Clas_AtributoObligatorio));
      GXCCtl = "nRcdDeleted_35_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_35_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_35_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_70_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vCLAS_CODIGO_" + sGXsfl_70_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV7Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_ID_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Id_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_DESCRIPCION_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtList_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "LIST_TIPO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbList_Tipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_AtributoObligatorio.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbClas_EstadoAtributo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_36_"+sGXsfl_70_idx+"Link", GXutil.rtrim( imgprompt_36_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_clase_atributosContainer.AddRow(Gridalm_clase_atributosRow);
   }

   public void readRow0Y35( )
   {
      nGXsfl_70_idx = (short)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7035( ) ;
      edtList_Id_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIST_ID_"+sGXsfl_70_idx+"Enabled"), ",", ".")) ;
      edtList_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LIST_DESCRIPCION_"+sGXsfl_70_idx+"Enabled"), ",", ".")) ;
      cmbList_Tipo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LIST_TIPO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
      cmbClas_AtributoObligatorio.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLAS_ATRIBUTOOBLIGATORIO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
      cmbClas_EstadoAtributo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLAS_ESTADOATRIBUTO_"+sGXsfl_70_idx+"Enabled"), ",", ".")) );
      imgprompt_36_Link = httpContext.cgiGet( "PROMPT_36_"+sGXsfl_70_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtList_Id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtList_Id_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "LIST_ID_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Id_Internalname ;
         wbErr = true ;
         A36List_Id = 0 ;
      }
      else
      {
         A36List_Id = localUtil.ctol( httpContext.cgiGet( edtList_Id_Internalname), ",", ".") ;
      }
      A393List_Descripcion = GXutil.upper( httpContext.cgiGet( edtList_Descripcion_Internalname)) ;
      cmbList_Tipo.setName( cmbList_Tipo.getInternalname() );
      cmbList_Tipo.setValue( httpContext.cgiGet( cmbList_Tipo.getInternalname()) );
      A423List_Tipo = httpContext.cgiGet( cmbList_Tipo.getInternalname()) ;
      cmbClas_AtributoObligatorio.setName( cmbClas_AtributoObligatorio.getInternalname() );
      cmbClas_AtributoObligatorio.setValue( httpContext.cgiGet( cmbClas_AtributoObligatorio.getInternalname()) );
      A555Clas_AtributoObligatorio = httpContext.cgiGet( cmbClas_AtributoObligatorio.getInternalname()) ;
      cmbClas_EstadoAtributo.setName( cmbClas_EstadoAtributo.getInternalname() );
      cmbClas_EstadoAtributo.setValue( httpContext.cgiGet( cmbClas_EstadoAtributo.getInternalname()) );
      A495Clas_EstadoAtributo = httpContext.cgiGet( cmbClas_EstadoAtributo.getInternalname()) ;
      GXCCtl = "Z36List_Id_" + sGXsfl_70_idx ;
      Z36List_Id = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z495Clas_EstadoAtributo_" + sGXsfl_70_idx ;
      Z495Clas_EstadoAtributo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z555Clas_AtributoObligatorio_" + sGXsfl_70_idx ;
      Z555Clas_AtributoObligatorio = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_35_" + sGXsfl_70_idx ;
      nRcdDeleted_35 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_35_" + sGXsfl_70_idx ;
      nRcdExists_35 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_35_" + sGXsfl_70_idx ;
      nIsMod_35 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defcmbList_Tipo_Enabled = cmbList_Tipo.getEnabled() ;
      defedtList_Id_Enabled = edtList_Id_Enabled ;
   }

   public void confirmValues0Y0( )
   {
      nGXsfl_70_idx = (short)(0) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_7035( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (short)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7035( ) ;
         httpContext.changePostValue( "Z36List_Id_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z36List_Id_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z36List_Id_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z495Clas_EstadoAtributo_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z495Clas_EstadoAtributo_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z495Clas_EstadoAtributo_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z555Clas_AtributoObligatorio_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z555Clas_AtributoObligatorio_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z555Clas_AtributoObligatorio_"+sGXsfl_70_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414165227");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_clase") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Clas_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z34Clas_Codigo", Z34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z299Clas_UsuarioCreacion", Z299Clas_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z301Clas_UsuarioModifica", Z301Clas_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z300Clas_FechaCreacion", localUtil.ttoc( Z300Clas_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z302Clas_FechaModifica", localUtil.ttoc( Z302Clas_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z291Clas_Descripcion", Z291Clas_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z35FAM_Codigo", Z35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCLAS_CODIGO", AV7Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FAM_CODIGO", AV18Insert_FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV15Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_USUARIOCREACION", A299Clas_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_USUARIOMODIFICA", A301Clas_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_FECHACREACION", localUtil.ttoc( A300Clas_FechaCreacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_FECHAMODIFICA", localUtil.ttoc( A302Clas_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV19Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLAS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Clas_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_CLASE" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A291Clas_Descripcion, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_clase:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_clase") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Clas_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_CLASE" ;
   }

   public String getPgmdesc( )
   {
      return "Clase" ;
   }

   public void initializeNonKey0Y34( )
   {
      A35FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A35FAM_Codigo", A35FAM_Codigo);
      A299Clas_UsuarioCreacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A299Clas_UsuarioCreacion", A299Clas_UsuarioCreacion);
      A301Clas_UsuarioModifica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A301Clas_UsuarioModifica", A301Clas_UsuarioModifica);
      A300Clas_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A300Clas_FechaCreacion", localUtil.ttoc( A300Clas_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
      A302Clas_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A302Clas_FechaModifica", localUtil.ttoc( A302Clas_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A291Clas_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A291Clas_Descripcion", A291Clas_Descripcion);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
      A447FAM_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A447FAM_Descripcion", A447FAM_Descripcion);
      A75SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A75SEG_Codigo", A75SEG_Codigo);
      A442SEG_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A442SEG_Descripcion", A442SEG_Descripcion);
      A74TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TIP_Codigo", A74TIP_Codigo);
      A435TIP_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TIP_Descripcion", A435TIP_Descripcion);
      Z299Clas_UsuarioCreacion = "" ;
      Z301Clas_UsuarioModifica = "" ;
      Z300Clas_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z302Clas_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z291Clas_Descripcion = "" ;
      Z35FAM_Codigo = "" ;
   }

   public void initAll0Y34( )
   {
      A34Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34Clas_Codigo", A34Clas_Codigo);
      initializeNonKey0Y34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0Y35( )
   {
      A393List_Descripcion = "" ;
      A423List_Tipo = "" ;
      A495Clas_EstadoAtributo = "" ;
      A555Clas_AtributoObligatorio = "" ;
      Z495Clas_EstadoAtributo = "" ;
      Z555Clas_AtributoObligatorio = "" ;
   }

   public void initAll0Y35( )
   {
      A36List_Id = 0 ;
      initializeNonKey0Y35( ) ;
   }

   public void standaloneModalInsert0Y35( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414165239");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_clase.js", "?201861414165239");
      /* End function include_jscripts */
   }

   public void init_level_properties35( )
   {
      cmbList_Tipo.setEnabled( defcmbList_Tipo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbList_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbList_Tipo.getEnabled(), 5, 0)), !bGXsfl_70_Refreshing);
      edtList_Id_Enabled = defedtList_Id_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtList_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtList_Id_Enabled, 5, 0)), !bGXsfl_70_Refreshing);
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
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      lblTitleatributos_Internalname = "TITLEATRIBUTOS" ;
      edtList_Id_Internalname = "LIST_ID" ;
      edtList_Descripcion_Internalname = "LIST_DESCRIPCION" ;
      cmbList_Tipo.setInternalname( "LIST_TIPO" );
      cmbClas_AtributoObligatorio.setInternalname( "CLAS_ATRIBUTOOBLIGATORIO" );
      cmbClas_EstadoAtributo.setInternalname( "CLAS_ESTADOATRIBUTO" );
      divAtributostable_Internalname = "ATRIBUTOSTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_36_Internalname = "PROMPT_36" ;
      subGridalm_clase_atributos_Internalname = "GRIDALM_CLASE_ATRIBUTOS" ;
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
      Form.setCaption( "Clase" );
      cmbClas_EstadoAtributo.setJsonclick( "" );
      cmbClas_AtributoObligatorio.setJsonclick( "" );
      cmbList_Tipo.setJsonclick( "" );
      edtList_Descripcion_Jsonclick = "" ;
      imgprompt_36_Visible = 1 ;
      imgprompt_36_Link = "" ;
      imgprompt_36_Visible = 1 ;
      edtList_Id_Jsonclick = "" ;
      subGridalm_clase_atributos_Class = "WorkWith" ;
      subGridalm_clase_atributos_Backcolorstyle = (byte)(0) ;
      subGridalm_clase_atributos_Allowcollapsing = (byte)(0) ;
      subGridalm_clase_atributos_Allowselection = (byte)(0) ;
      cmbClas_EstadoAtributo.setEnabled( 1 );
      cmbClas_AtributoObligatorio.setEnabled( 1 );
      cmbList_Tipo.setEnabled( 0 );
      edtList_Descripcion_Enabled = 0 ;
      edtList_Id_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Descripcion_Enabled = 0 ;
      edtClas_Codigo_Jsonclick = "" ;
      edtClas_Codigo_Enabled = 0 ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Descripcion_Enabled = 0 ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtFAM_Codigo_Enabled = 0 ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Descripcion_Enabled = 0 ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtSEG_Codigo_Enabled = 0 ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Descripcion_Enabled = 0 ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtTIP_Codigo_Enabled = 0 ;
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

   public void gxnrgridalm_clase_atributos_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_7035( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0Y35( ) ;
         standaloneModal0Y35( ) ;
         GXCCtl = "LIST_TIPO_" + sGXsfl_70_idx ;
         cmbList_Tipo.setName( GXCCtl );
         cmbList_Tipo.setWebtags( "" );
         cmbList_Tipo.addItem("O", "Otro", (short)(0));
         cmbList_Tipo.addItem("F", "Fecha", (short)(0));
         if ( cmbList_Tipo.getItemCount() > 0 )
         {
            A423List_Tipo = cmbList_Tipo.getValidValue(A423List_Tipo) ;
         }
         GXCCtl = "CLAS_ATRIBUTOOBLIGATORIO_" + sGXsfl_70_idx ;
         cmbClas_AtributoObligatorio.setName( GXCCtl );
         cmbClas_AtributoObligatorio.setWebtags( "" );
         cmbClas_AtributoObligatorio.addItem("SI", "SI", (short)(0));
         cmbClas_AtributoObligatorio.addItem("NO", "NO", (short)(0));
         if ( cmbClas_AtributoObligatorio.getItemCount() > 0 )
         {
            A555Clas_AtributoObligatorio = cmbClas_AtributoObligatorio.getValidValue(A555Clas_AtributoObligatorio) ;
         }
         GXCCtl = "CLAS_ESTADOATRIBUTO_" + sGXsfl_70_idx ;
         cmbClas_EstadoAtributo.setName( GXCCtl );
         cmbClas_EstadoAtributo.setWebtags( "" );
         cmbClas_EstadoAtributo.addItem("A", "Activo", (short)(0));
         cmbClas_EstadoAtributo.addItem("I", "Inactivo", (short)(0));
         if ( cmbClas_EstadoAtributo.getItemCount() > 0 )
         {
            A495Clas_EstadoAtributo = cmbClas_EstadoAtributo.getValidValue(A495Clas_EstadoAtributo) ;
         }
         dynload_actions( ) ;
         sendRow0Y35( ) ;
         nGXsfl_70_idx = (short)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_70_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_7035( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_clase_atributosContainer.ToJavascriptSource());
      /* End function gxnrGridalm_clase_atributos_newrow */
   }

   public void valid_Tip_codigo( String GX_Parm1 ,
                                 String GX_Parm2 )
   {
      A74TIP_Codigo = GX_Parm1 ;
      A435TIP_Descripcion = GX_Parm2 ;
      /* Using cursor T000Y22 */
      pr_default.execute(20, new Object[] {A74TIP_Codigo});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO TIPO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A435TIP_Descripcion = T000Y22_A435TIP_Descripcion[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A435TIP_Descripcion = "" ;
      }
      isValidOutput.add(A435TIP_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Seg_codigo( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      A75SEG_Codigo = GX_Parm1 ;
      A442SEG_Descripcion = GX_Parm2 ;
      A74TIP_Codigo = GX_Parm3 ;
      /* Using cursor T000Y21 */
      pr_default.execute(19, new Object[] {A75SEG_Codigo});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATALOGO SEGMENTO'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A442SEG_Descripcion = T000Y21_A442SEG_Descripcion[0] ;
      A74TIP_Codigo = T000Y21_A74TIP_Codigo[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A442SEG_Descripcion = "" ;
         A74TIP_Codigo = "" ;
      }
      isValidOutput.add(A442SEG_Descripcion);
      isValidOutput.add(A74TIP_Codigo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Fam_codigo( String GX_Parm1 ,
                                 String GX_Parm2 ,
                                 String GX_Parm3 )
   {
      A35FAM_Codigo = GX_Parm1 ;
      A447FAM_Descripcion = GX_Parm2 ;
      A75SEG_Codigo = GX_Parm3 ;
      /* Using cursor T000Y20 */
      pr_default.execute(18, new Object[] {A35FAM_Codigo});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALMACEN CATAGOLO FAMILIA'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A447FAM_Descripcion = T000Y20_A447FAM_Descripcion[0] ;
      A75SEG_Codigo = T000Y20_A75SEG_Codigo[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A447FAM_Descripcion = "" ;
         A75SEG_Codigo = "" ;
      }
      isValidOutput.add(A447FAM_Descripcion);
      isValidOutput.add(A75SEG_Codigo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_List_id( long GX_Parm1 ,
                              String GX_Parm2 ,
                              com.genexus.webpanels.HTMLChoice GX_Parm3 )
   {
      A36List_Id = GX_Parm1 ;
      A393List_Descripcion = GX_Parm2 ;
      cmbList_Tipo = GX_Parm3 ;
      A423List_Tipo = cmbList_Tipo.getValue() ;
      cmbList_Tipo.setValue( A423List_Tipo );
      /* Using cursor T000Y31 */
      pr_default.execute(29, new Object[] {new Long(A36List_Id)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'LISTA DE ATRIBUTOS'.", "ForeignKeyNotFound", 1, "LIST_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtList_Id_Internalname ;
      }
      A393List_Descripcion = T000Y31_A393List_Descripcion[0] ;
      A423List_Tipo = T000Y31_A423List_Tipo[0] ;
      cmbList_Tipo.setValue( A423List_Tipo );
      pr_default.close(29);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A393List_Descripcion = "" ;
         A423List_Tipo = "" ;
         cmbList_Tipo.setValue( A423List_Tipo );
      }
      isValidOutput.add(A393List_Descripcion);
      cmbList_Tipo.setValue( A423List_Tipo );
      isValidOutput.add(cmbList_Tipo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120Y2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(29);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7Clas_Codigo = "" ;
      Z34Clas_Codigo = "" ;
      Z299Clas_UsuarioCreacion = "" ;
      Z301Clas_UsuarioModifica = "" ;
      Z300Clas_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      Z302Clas_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z291Clas_Descripcion = "" ;
      Z35FAM_Codigo = "" ;
      Z495Clas_EstadoAtributo = "" ;
      Z555Clas_AtributoObligatorio = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A35FAM_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A74TIP_Codigo = "" ;
      Gx_mode = "" ;
      AV7Clas_Codigo = "" ;
      GXKey = "" ;
      GXCCtl = "" ;
      A423List_Tipo = "" ;
      A555Clas_AtributoObligatorio = "" ;
      A495Clas_EstadoAtributo = "" ;
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
      A435TIP_Descripcion = "" ;
      A442SEG_Descripcion = "" ;
      A447FAM_Descripcion = "" ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      lblTitleatributos_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_clase_atributosContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_clase_atributosColumn = new com.genexus.webpanels.GXWebColumn();
      A393List_Descripcion = "" ;
      sMode35 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A299Clas_UsuarioCreacion = "" ;
      A301Clas_UsuarioModifica = "" ;
      A300Clas_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A302Clas_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      AV18Insert_FAM_Codigo = "" ;
      AV15Usuario = "" ;
      AV19Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode34 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z447FAM_Descripcion = "" ;
      Z75SEG_Codigo = "" ;
      Z442SEG_Descripcion = "" ;
      Z74TIP_Codigo = "" ;
      Z435TIP_Descripcion = "" ;
      T000Y7_A447FAM_Descripcion = new String[] {""} ;
      T000Y7_A75SEG_Codigo = new String[] {""} ;
      T000Y8_A442SEG_Descripcion = new String[] {""} ;
      T000Y8_A74TIP_Codigo = new String[] {""} ;
      T000Y9_A435TIP_Descripcion = new String[] {""} ;
      T000Y10_A34Clas_Codigo = new String[] {""} ;
      T000Y10_A299Clas_UsuarioCreacion = new String[] {""} ;
      T000Y10_A301Clas_UsuarioModifica = new String[] {""} ;
      T000Y10_A300Clas_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y10_A302Clas_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y10_A291Clas_Descripcion = new String[] {""} ;
      T000Y10_A447FAM_Descripcion = new String[] {""} ;
      T000Y10_A442SEG_Descripcion = new String[] {""} ;
      T000Y10_A435TIP_Descripcion = new String[] {""} ;
      T000Y10_A35FAM_Codigo = new String[] {""} ;
      T000Y10_A75SEG_Codigo = new String[] {""} ;
      T000Y10_A74TIP_Codigo = new String[] {""} ;
      T000Y11_A447FAM_Descripcion = new String[] {""} ;
      T000Y11_A75SEG_Codigo = new String[] {""} ;
      T000Y12_A442SEG_Descripcion = new String[] {""} ;
      T000Y12_A74TIP_Codigo = new String[] {""} ;
      T000Y13_A435TIP_Descripcion = new String[] {""} ;
      T000Y14_A34Clas_Codigo = new String[] {""} ;
      T000Y6_A34Clas_Codigo = new String[] {""} ;
      T000Y6_A299Clas_UsuarioCreacion = new String[] {""} ;
      T000Y6_A301Clas_UsuarioModifica = new String[] {""} ;
      T000Y6_A300Clas_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y6_A302Clas_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y6_A291Clas_Descripcion = new String[] {""} ;
      T000Y6_A35FAM_Codigo = new String[] {""} ;
      T000Y15_A34Clas_Codigo = new String[] {""} ;
      T000Y16_A34Clas_Codigo = new String[] {""} ;
      T000Y5_A34Clas_Codigo = new String[] {""} ;
      T000Y5_A299Clas_UsuarioCreacion = new String[] {""} ;
      T000Y5_A301Clas_UsuarioModifica = new String[] {""} ;
      T000Y5_A300Clas_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y5_A302Clas_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y5_A291Clas_Descripcion = new String[] {""} ;
      T000Y5_A35FAM_Codigo = new String[] {""} ;
      T000Y20_A447FAM_Descripcion = new String[] {""} ;
      T000Y20_A75SEG_Codigo = new String[] {""} ;
      T000Y21_A442SEG_Descripcion = new String[] {""} ;
      T000Y21_A74TIP_Codigo = new String[] {""} ;
      T000Y22_A435TIP_Descripcion = new String[] {""} ;
      T000Y23_A37Cata_Codigo = new String[] {""} ;
      T000Y24_A34Clas_Codigo = new String[] {""} ;
      Z393List_Descripcion = "" ;
      Z423List_Tipo = "" ;
      T000Y25_A34Clas_Codigo = new String[] {""} ;
      T000Y25_A393List_Descripcion = new String[] {""} ;
      T000Y25_A423List_Tipo = new String[] {""} ;
      T000Y25_A495Clas_EstadoAtributo = new String[] {""} ;
      T000Y25_A555Clas_AtributoObligatorio = new String[] {""} ;
      T000Y25_A36List_Id = new long[1] ;
      T000Y4_A393List_Descripcion = new String[] {""} ;
      T000Y4_A423List_Tipo = new String[] {""} ;
      T000Y26_A393List_Descripcion = new String[] {""} ;
      T000Y26_A423List_Tipo = new String[] {""} ;
      T000Y27_A34Clas_Codigo = new String[] {""} ;
      T000Y27_A36List_Id = new long[1] ;
      T000Y3_A34Clas_Codigo = new String[] {""} ;
      T000Y3_A495Clas_EstadoAtributo = new String[] {""} ;
      T000Y3_A555Clas_AtributoObligatorio = new String[] {""} ;
      T000Y3_A36List_Id = new long[1] ;
      T000Y2_A34Clas_Codigo = new String[] {""} ;
      T000Y2_A495Clas_EstadoAtributo = new String[] {""} ;
      T000Y2_A555Clas_AtributoObligatorio = new String[] {""} ;
      T000Y2_A36List_Id = new long[1] ;
      T000Y31_A393List_Descripcion = new String[] {""} ;
      T000Y31_A423List_Tipo = new String[] {""} ;
      T000Y32_A34Clas_Codigo = new String[] {""} ;
      T000Y32_A36List_Id = new long[1] ;
      Gridalm_clase_atributosRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_clase_atributos_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_clase__default(),
         new Object[] {
             new Object[] {
            T000Y2_A34Clas_Codigo, T000Y2_A495Clas_EstadoAtributo, T000Y2_A555Clas_AtributoObligatorio, T000Y2_A36List_Id
            }
            , new Object[] {
            T000Y3_A34Clas_Codigo, T000Y3_A495Clas_EstadoAtributo, T000Y3_A555Clas_AtributoObligatorio, T000Y3_A36List_Id
            }
            , new Object[] {
            T000Y4_A393List_Descripcion, T000Y4_A423List_Tipo
            }
            , new Object[] {
            T000Y5_A34Clas_Codigo, T000Y5_A299Clas_UsuarioCreacion, T000Y5_A301Clas_UsuarioModifica, T000Y5_A300Clas_FechaCreacion, T000Y5_A302Clas_FechaModifica, T000Y5_A291Clas_Descripcion, T000Y5_A35FAM_Codigo
            }
            , new Object[] {
            T000Y6_A34Clas_Codigo, T000Y6_A299Clas_UsuarioCreacion, T000Y6_A301Clas_UsuarioModifica, T000Y6_A300Clas_FechaCreacion, T000Y6_A302Clas_FechaModifica, T000Y6_A291Clas_Descripcion, T000Y6_A35FAM_Codigo
            }
            , new Object[] {
            T000Y7_A447FAM_Descripcion, T000Y7_A75SEG_Codigo
            }
            , new Object[] {
            T000Y8_A442SEG_Descripcion, T000Y8_A74TIP_Codigo
            }
            , new Object[] {
            T000Y9_A435TIP_Descripcion
            }
            , new Object[] {
            T000Y10_A34Clas_Codigo, T000Y10_A299Clas_UsuarioCreacion, T000Y10_A301Clas_UsuarioModifica, T000Y10_A300Clas_FechaCreacion, T000Y10_A302Clas_FechaModifica, T000Y10_A291Clas_Descripcion, T000Y10_A447FAM_Descripcion, T000Y10_A442SEG_Descripcion, T000Y10_A435TIP_Descripcion, T000Y10_A35FAM_Codigo,
            T000Y10_A75SEG_Codigo, T000Y10_A74TIP_Codigo
            }
            , new Object[] {
            T000Y11_A447FAM_Descripcion, T000Y11_A75SEG_Codigo
            }
            , new Object[] {
            T000Y12_A442SEG_Descripcion, T000Y12_A74TIP_Codigo
            }
            , new Object[] {
            T000Y13_A435TIP_Descripcion
            }
            , new Object[] {
            T000Y14_A34Clas_Codigo
            }
            , new Object[] {
            T000Y15_A34Clas_Codigo
            }
            , new Object[] {
            T000Y16_A34Clas_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Y20_A447FAM_Descripcion, T000Y20_A75SEG_Codigo
            }
            , new Object[] {
            T000Y21_A442SEG_Descripcion, T000Y21_A74TIP_Codigo
            }
            , new Object[] {
            T000Y22_A435TIP_Descripcion
            }
            , new Object[] {
            T000Y23_A37Cata_Codigo
            }
            , new Object[] {
            T000Y24_A34Clas_Codigo
            }
            , new Object[] {
            T000Y25_A34Clas_Codigo, T000Y25_A393List_Descripcion, T000Y25_A423List_Tipo, T000Y25_A495Clas_EstadoAtributo, T000Y25_A555Clas_AtributoObligatorio, T000Y25_A36List_Id
            }
            , new Object[] {
            T000Y26_A393List_Descripcion, T000Y26_A423List_Tipo
            }
            , new Object[] {
            T000Y27_A34Clas_Codigo, T000Y27_A36List_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Y31_A393List_Descripcion, T000Y31_A423List_Tipo
            }
            , new Object[] {
            T000Y32_A34Clas_Codigo, T000Y32_A36List_Id
            }
         }
      );
      AV19Pgmname = "ALM_CLASE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_clase_atributos_Backcolorstyle ;
   private byte subGridalm_clase_atributos_Allowselection ;
   private byte subGridalm_clase_atributos_Allowhovering ;
   private byte subGridalm_clase_atributos_Allowcollapsing ;
   private byte subGridalm_clase_atributos_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_clase_atributos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_35 ;
   private short nRC_GXsfl_70 ;
   private short nGXsfl_70_idx=1 ;
   private short nRcdDeleted_35 ;
   private short nRcdExists_35 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount35 ;
   private short RcdFound35 ;
   private short nBlankRcdUsr35 ;
   private short RcdFound34 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTIP_Codigo_Enabled ;
   private int edtTIP_Descripcion_Enabled ;
   private int edtSEG_Codigo_Enabled ;
   private int edtSEG_Descripcion_Enabled ;
   private int edtFAM_Codigo_Enabled ;
   private int edtFAM_Descripcion_Enabled ;
   private int edtClas_Codigo_Enabled ;
   private int edtClas_Descripcion_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtList_Id_Enabled ;
   private int edtList_Descripcion_Enabled ;
   private int subGridalm_clase_atributos_Selectioncolor ;
   private int subGridalm_clase_atributos_Hoveringcolor ;
   private int fRowAdded ;
   private int AV20GXV1 ;
   private int GX_JID ;
   private int subGridalm_clase_atributos_Backcolor ;
   private int subGridalm_clase_atributos_Allbackcolor ;
   private int imgprompt_36_Visible ;
   private int defcmbList_Tipo_Enabled ;
   private int defedtList_Id_Enabled ;
   private int idxLst ;
   private long Z36List_Id ;
   private long A36List_Id ;
   private long GRIDALM_CLASE_ATRIBUTOS_nFirstRecordOnPage ;
   private String sPrefix ;
   private String sGXsfl_70_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z495Clas_EstadoAtributo ;
   private String Z555Clas_AtributoObligatorio ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String GXCCtl ;
   private String A423List_Tipo ;
   private String A555Clas_AtributoObligatorio ;
   private String A495Clas_EstadoAtributo ;
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
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Internalname ;
   private String edtClas_Descripcion_Jsonclick ;
   private String divAtributostable_Internalname ;
   private String lblTitleatributos_Internalname ;
   private String lblTitleatributos_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode35 ;
   private String edtList_Id_Internalname ;
   private String edtList_Descripcion_Internalname ;
   private String imgprompt_36_Link ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String AV19Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String Z423List_Tipo ;
   private String imgprompt_36_Internalname ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGridalm_clase_atributos_Class ;
   private String subGridalm_clase_atributos_Linesclass ;
   private String ROClassString ;
   private String edtList_Id_Jsonclick ;
   private String sImgUrl ;
   private String edtList_Descripcion_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_clase_atributos_Internalname ;
   private java.util.Date Z300Clas_FechaCreacion ;
   private java.util.Date Z302Clas_FechaModifica ;
   private java.util.Date A300Clas_FechaCreacion ;
   private java.util.Date A302Clas_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String wcpOAV7Clas_Codigo ;
   private String Z34Clas_Codigo ;
   private String Z299Clas_UsuarioCreacion ;
   private String Z301Clas_UsuarioModifica ;
   private String Z291Clas_Descripcion ;
   private String Z35FAM_Codigo ;
   private String A35FAM_Codigo ;
   private String A75SEG_Codigo ;
   private String A74TIP_Codigo ;
   private String AV7Clas_Codigo ;
   private String A435TIP_Descripcion ;
   private String A442SEG_Descripcion ;
   private String A447FAM_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A393List_Descripcion ;
   private String A299Clas_UsuarioCreacion ;
   private String A301Clas_UsuarioModifica ;
   private String AV18Insert_FAM_Codigo ;
   private String AV15Usuario ;
   private String Z447FAM_Descripcion ;
   private String Z75SEG_Codigo ;
   private String Z442SEG_Descripcion ;
   private String Z74TIP_Codigo ;
   private String Z435TIP_Descripcion ;
   private String Z393List_Descripcion ;
   private com.genexus.webpanels.GXWebGrid Gridalm_clase_atributosContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_clase_atributosRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_clase_atributosColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbList_Tipo ;
   private HTMLChoice cmbClas_AtributoObligatorio ;
   private HTMLChoice cmbClas_EstadoAtributo ;
   private IDataStoreProvider pr_default ;
   private String[] T000Y7_A447FAM_Descripcion ;
   private String[] T000Y7_A75SEG_Codigo ;
   private String[] T000Y8_A442SEG_Descripcion ;
   private String[] T000Y8_A74TIP_Codigo ;
   private String[] T000Y9_A435TIP_Descripcion ;
   private String[] T000Y10_A34Clas_Codigo ;
   private String[] T000Y10_A299Clas_UsuarioCreacion ;
   private String[] T000Y10_A301Clas_UsuarioModifica ;
   private java.util.Date[] T000Y10_A300Clas_FechaCreacion ;
   private java.util.Date[] T000Y10_A302Clas_FechaModifica ;
   private String[] T000Y10_A291Clas_Descripcion ;
   private String[] T000Y10_A447FAM_Descripcion ;
   private String[] T000Y10_A442SEG_Descripcion ;
   private String[] T000Y10_A435TIP_Descripcion ;
   private String[] T000Y10_A35FAM_Codigo ;
   private String[] T000Y10_A75SEG_Codigo ;
   private String[] T000Y10_A74TIP_Codigo ;
   private String[] T000Y11_A447FAM_Descripcion ;
   private String[] T000Y11_A75SEG_Codigo ;
   private String[] T000Y12_A442SEG_Descripcion ;
   private String[] T000Y12_A74TIP_Codigo ;
   private String[] T000Y13_A435TIP_Descripcion ;
   private String[] T000Y14_A34Clas_Codigo ;
   private String[] T000Y6_A34Clas_Codigo ;
   private String[] T000Y6_A299Clas_UsuarioCreacion ;
   private String[] T000Y6_A301Clas_UsuarioModifica ;
   private java.util.Date[] T000Y6_A300Clas_FechaCreacion ;
   private java.util.Date[] T000Y6_A302Clas_FechaModifica ;
   private String[] T000Y6_A291Clas_Descripcion ;
   private String[] T000Y6_A35FAM_Codigo ;
   private String[] T000Y15_A34Clas_Codigo ;
   private String[] T000Y16_A34Clas_Codigo ;
   private String[] T000Y5_A34Clas_Codigo ;
   private String[] T000Y5_A299Clas_UsuarioCreacion ;
   private String[] T000Y5_A301Clas_UsuarioModifica ;
   private java.util.Date[] T000Y5_A300Clas_FechaCreacion ;
   private java.util.Date[] T000Y5_A302Clas_FechaModifica ;
   private String[] T000Y5_A291Clas_Descripcion ;
   private String[] T000Y5_A35FAM_Codigo ;
   private String[] T000Y20_A447FAM_Descripcion ;
   private String[] T000Y20_A75SEG_Codigo ;
   private String[] T000Y21_A442SEG_Descripcion ;
   private String[] T000Y21_A74TIP_Codigo ;
   private String[] T000Y22_A435TIP_Descripcion ;
   private String[] T000Y23_A37Cata_Codigo ;
   private String[] T000Y24_A34Clas_Codigo ;
   private String[] T000Y25_A34Clas_Codigo ;
   private String[] T000Y25_A393List_Descripcion ;
   private String[] T000Y25_A423List_Tipo ;
   private String[] T000Y25_A495Clas_EstadoAtributo ;
   private String[] T000Y25_A555Clas_AtributoObligatorio ;
   private long[] T000Y25_A36List_Id ;
   private String[] T000Y4_A393List_Descripcion ;
   private String[] T000Y4_A423List_Tipo ;
   private String[] T000Y26_A393List_Descripcion ;
   private String[] T000Y26_A423List_Tipo ;
   private String[] T000Y27_A34Clas_Codigo ;
   private long[] T000Y27_A36List_Id ;
   private String[] T000Y3_A34Clas_Codigo ;
   private String[] T000Y3_A495Clas_EstadoAtributo ;
   private String[] T000Y3_A555Clas_AtributoObligatorio ;
   private long[] T000Y3_A36List_Id ;
   private String[] T000Y2_A34Clas_Codigo ;
   private String[] T000Y2_A495Clas_EstadoAtributo ;
   private String[] T000Y2_A555Clas_AtributoObligatorio ;
   private long[] T000Y2_A36List_Id ;
   private String[] T000Y31_A393List_Descripcion ;
   private String[] T000Y31_A423List_Tipo ;
   private String[] T000Y32_A34Clas_Codigo ;
   private long[] T000Y32_A36List_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV17TrnContextAtt ;
}

final  class alm_clase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Y2", "SELECT Clas_Codigo, Clas_EstadoAtributo, Clas_AtributoObligatorio, List_Id FROM ALM_CLASEATRIBUTOS WHERE Clas_Codigo = ? AND List_Id = ?  FOR UPDATE OF Clas_EstadoAtributo, Clas_AtributoObligatorio NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y3", "SELECT Clas_Codigo, Clas_EstadoAtributo, Clas_AtributoObligatorio, List_Id FROM ALM_CLASEATRIBUTOS WHERE Clas_Codigo = ? AND List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y4", "SELECT List_Descripcion, List_Tipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y5", "SELECT Clas_Codigo, Clas_UsuarioCreacion, Clas_UsuarioModifica, Clas_FechaCreacion, Clas_FechaModifica, Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ?  FOR UPDATE OF Clas_UsuarioCreacion, Clas_UsuarioModifica, Clas_FechaCreacion, Clas_FechaModifica, Clas_Descripcion, FAM_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y6", "SELECT Clas_Codigo, Clas_UsuarioCreacion, Clas_UsuarioModifica, Clas_FechaCreacion, Clas_FechaModifica, Clas_Descripcion, FAM_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y7", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y8", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y9", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Clas_Codigo, TM1.Clas_UsuarioCreacion, TM1.Clas_UsuarioModifica, TM1.Clas_FechaCreacion, TM1.Clas_FechaModifica, TM1.Clas_Descripcion, T2.FAM_Descripcion, T3.SEG_Descripcion, T4.TIP_Descripcion, TM1.FAM_Codigo, T2.SEG_Codigo, T3.TIP_Codigo FROM (((ALM_CLASE TM1 INNER JOIN ALM_CAT_FAM T2 ON T2.FAM_Codigo = TM1.FAM_Codigo) INNER JOIN ALM_CAT_SEG T3 ON T3.SEG_Codigo = T2.SEG_Codigo) INNER JOIN ALM_CAT_TIP T4 ON T4.TIP_Codigo = T3.TIP_Codigo) WHERE TM1.Clas_Codigo = ? ORDER BY TM1.Clas_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000Y11", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y12", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y13", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y14", "SELECT /*+ FIRST_ROWS(1) */ Clas_Codigo FROM ALM_CLASE WHERE Clas_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Clas_Codigo FROM ALM_CLASE WHERE ( Clas_Codigo > ?) ORDER BY Clas_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Y16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Clas_Codigo FROM ALM_CLASE WHERE ( Clas_Codigo < ?) ORDER BY Clas_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Y17", "INSERT INTO ALM_CLASE(Clas_Codigo, Clas_UsuarioCreacion, Clas_UsuarioModifica, Clas_FechaCreacion, Clas_FechaModifica, Clas_Descripcion, FAM_Codigo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_CLASE")
         ,new UpdateCursor("T000Y18", "UPDATE ALM_CLASE SET Clas_UsuarioCreacion=?, Clas_UsuarioModifica=?, Clas_FechaCreacion=?, Clas_FechaModifica=?, Clas_Descripcion=?, FAM_Codigo=?  WHERE Clas_Codigo = ?", GX_NOMASK, "ALM_CLASE")
         ,new UpdateCursor("T000Y19", "DELETE FROM ALM_CLASE  WHERE Clas_Codigo = ?", GX_NOMASK, "ALM_CLASE")
         ,new ForEachCursor("T000Y20", "SELECT FAM_Descripcion, SEG_Codigo FROM ALM_CAT_FAM WHERE FAM_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y21", "SELECT SEG_Descripcion, TIP_Codigo FROM ALM_CAT_SEG WHERE SEG_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y22", "SELECT TIP_Descripcion FROM ALM_CAT_TIP WHERE TIP_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y23", "SELECT * FROM (SELECT Cata_Codigo FROM ALM_CATALOGO WHERE Clas_Codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Y24", "SELECT /*+ FIRST_ROWS(100) */ Clas_Codigo FROM ALM_CLASE ORDER BY Clas_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000Y25", "SELECT T1.Clas_Codigo, T2.List_Descripcion, T2.List_Tipo, T1.Clas_EstadoAtributo, T1.Clas_AtributoObligatorio, T1.List_Id FROM (ALM_CLASEATRIBUTOS T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.List_Id) WHERE T1.Clas_Codigo = ? and T1.List_Id = ? ORDER BY T1.Clas_Codigo, T1.List_Id ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000Y26", "SELECT List_Descripcion, List_Tipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y27", "SELECT Clas_Codigo, List_Id FROM ALM_CLASEATRIBUTOS WHERE Clas_Codigo = ? AND List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000Y28", "INSERT INTO ALM_CLASEATRIBUTOS(Clas_Codigo, Clas_EstadoAtributo, Clas_AtributoObligatorio, List_Id) VALUES(?, ?, ?, ?)", GX_NOMASK, "ALM_CLASEATRIBUTOS")
         ,new UpdateCursor("T000Y29", "UPDATE ALM_CLASEATRIBUTOS SET Clas_EstadoAtributo=?, Clas_AtributoObligatorio=?  WHERE Clas_Codigo = ? AND List_Id = ?", GX_NOMASK, "ALM_CLASEATRIBUTOS")
         ,new UpdateCursor("T000Y30", "DELETE FROM ALM_CLASEATRIBUTOS  WHERE Clas_Codigo = ? AND List_Id = ?", GX_NOMASK, "ALM_CLASEATRIBUTOS")
         ,new ForEachCursor("T000Y31", "SELECT List_Descripcion, List_Tipo FROM ALM_LISTA_ATRIBUTOS WHERE List_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y32", "SELECT Clas_Codigo, List_Id FROM ALM_CLASEATRIBUTOS WHERE Clas_Codigo = ? ORDER BY Clas_Codigo, List_Id ",true, GX_NOMASK, false, this,11,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 2) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 2) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(12) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 2) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
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
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 150, false);
               stmt.setVarchar(7, (String)parms[6], 5, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 150, false);
               stmt.setVarchar(6, (String)parms[5], 5, false);
               stmt.setVarchar(7, (String)parms[6], 7, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 5, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
      }
   }

}

