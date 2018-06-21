/*
               File: wpcon_ent_impl
        Description: Entrada elementos de consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:30.18
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

public final  class wpcon_ent_impl extends GXDataArea
{
   public wpcon_ent_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpcon_ent_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpcon_ent_impl.class ));
   }

   public wpcon_ent_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_74_idx = httpContext.GetNextPar( ) ;
            AV19Eliminar = httpContext.GetNextPar( ) ;
            AV9Atributos = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV19Eliminar = httpContext.GetNextPar( ) ;
            AV9Atributos = httpContext.GetNextPar( ) ;
            AV23OPC = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV52Tran_ValorTransaccion = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV49Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A483Tran_ValorTransaccion = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n483Tran_ValorTransaccion = false ;
            A487TDet_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            A489TDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A488TDet_ValorUnitario = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            A525TDet_Atributos = httpContext.GetNextPar( ) ;
            A657TDet_Otros_Costos = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n657TDet_Otros_Costos = false ;
            AV59Tran_Estado = httpContext.GetNextPar( ) ;
            AV25Respuesta = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
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
            AV49Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      pa1T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1T2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414183033");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tran_Id,11,0)))+"\">") ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOPC", GXutil.ltrim( localUtil.ntoc( AV23OPC, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV49Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_VALORTRANSACCION", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ATRIBUTOS", A525TDet_Atributos);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ESTADO", GXutil.rtrim( AV59Tran_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vRESPUESTA", GXutil.rtrim( AV25Respuesta));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR", GXutil.ltrim( localUtil.ntoc( AV33SWError, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDETALLETRN", AV29SDTDetalleTrn);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDETALLETRN", AV29SDTDetalleTrn);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV22Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIP_CODIGO", AV43TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSEG_CODIGO", AV31SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFAM_CODIGO", AV20FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCLAS_CODIGO", AV15Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_CODIGO", AV11Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTDET_PLACARECUPERADA", AV58TDet_PlacaRecuperada);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTDET_AGRUPADO", GXutil.ltrim( localUtil.ntoc( AV6TDet_Agrupado, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOENTRA", GXutil.rtrim( AV51Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV54Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( AV46Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIP_CODIGO", A74TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGO", A75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_CODIGO", A35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_CODIGO", A34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1T2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPCON_ENT" ;
   }

   public String getPgmdesc( )
   {
      return "Entrada elementos de consumo" ;
   }

   public void wb1T0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 col-lg-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Entrada elementos de consumo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPCON_ENT.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 col-lg-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "min-height:10px;", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Numero Transacción", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV47Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV47Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_fecharegistro_Internalname, "Fecha de Registro", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTran_fecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_fecharegistro_Internalname, localUtil.ttoc( AV48Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV48Tran_FechaRegistro, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_fecharegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_fecharegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavTran_fecharegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavTran_fecharegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPCON_ENT.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "*Consecutivo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV14cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV14cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARELEMENTO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_descripcion_Internalname, "Bien", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcata_descripcion_Internalname, AV13cCata_Descripcion, GXutil.rtrim( localUtil.format( AV13cCata_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcata_descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCcata_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-10 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavElem_descripcion_Internalname, "Descripción", "col-sm-3 col-lg-2 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavElem_descripcion_Internalname, AV18Elem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", (short)(0), 1, edtavElem_descripcion_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "2000", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCantidad_Internalname, "*Cantidad", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV10Cantidad, (byte)(10), (byte)(0), ",", "")), ((edtavCantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10Cantidad), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavValorunitario_Internalname, "*Valor Unitario", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavValorunitario_Internalname, GXutil.ltrim( localUtil.ntoc( AV56ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtavValorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV56ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV56ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValorunitario_Jsonclick, 0, "Attribute", "", "", "", 1, edtavValorunitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCosto_adquisicion_Internalname, "Costo de Adquisición", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCosto_adquisicion_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Costo_Adquisicion, (byte)(24), (byte)(2), ",", "")), ((edtavCosto_adquisicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV16Costo_Adquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV16Costo_Adquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCosto_adquisicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCosto_adquisicion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavOtros_costos_Internalname, "Otros Costos", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavOtros_costos_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtavOtros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV24Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV24Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOtros_costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavOtros_costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTotal_costos_Internalname, "Total Costo Unitario", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_costos_Internalname, GXutil.ltrim( localUtil.ntoc( AV45Total_Costos, (byte)(24), (byte)(2), ",", "")), ((edtavTotal_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV45Total_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV45Total_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTotal_costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-2", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Agregar Bien", bttButton1_Jsonclick, 5, "Agregar Bien", "", StyleString, ClassString, bttButton1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_valortransaccion_Internalname, "Valor Transaccion", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_valortransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( AV52Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtavTran_valortransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV52Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV52Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_valortransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_valortransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-10 col-lg-offset-1 LevelTable", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleatributos_Internalname, "Lista de Bienes", "", "", lblTitleatributos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "0", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Otros Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "WorkWith");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Tooltiptext", GXutil.rtrim( subGrid1_Tooltiptext));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV17Elem_Consecutivo);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV12Cata_Descripcion);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39TDet_Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV9Atributos));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAtributos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV19Eliminar));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminar_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (short)(nGXsfl_74_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "RATIFICAR", bttButton2_Jsonclick, 5, "RATIFICAR", "", StyleString, ClassString, bttButton2_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'RATIFICAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton3_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", bttButton3_Caption, bttButton3_Jsonclick, 7, "CANCELAR", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111t1_client"+"'", TempTags, "", 2, "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblUrl_Visible, 1, (short)(1), "HLP_WPCON_ENT.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Entrada elementos de consumo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1T0( ) ;
   }

   public void ws1T2( )
   {
      start1T2( ) ;
      evt1T2( ) ;
   }

   public void evt1T2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "ALERTIFY1.OK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar' */
                           e131T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'RATIFICAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RATIFICAR' */
                           e141T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCELEM_CONSECUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARELEMENTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarElemento' */
                           e161T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'ELIMINAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'ELIMINAR'") == 0 ) )
                        {
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CONSECUTIVO");
                              GX_FocusControl = edtavTdet_consecutivo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV37TDet_Consecutivo = 0 ;
                           }
                           else
                           {
                              AV37TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") ;
                           }
                           AV17Elem_Consecutivo = httpContext.cgiGet( edtavElem_consecutivo_Internalname) ;
                           AV12Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CANTIDAD");
                              GX_FocusControl = edtavTdet_cantidad_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35TDet_Cantidad = 0 ;
                           }
                           else
                           {
                              AV35TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORUNITARIO");
                              GX_FocusControl = edtavTdet_valorunitario_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42TDet_ValorUnitario = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV42TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_OTROS_COSTOS");
                              GX_FocusControl = edtavTdet_otros_costos_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV39TDet_Otros_Costos = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV39TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORTOTAL");
                              GX_FocusControl = edtavTdet_valortotal_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41TDet_ValorTotal = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV41TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)) ;
                           }
                           AV9Atributos = httpContext.cgiGet( edtavAtributos_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV9Atributos)==0) ? AV63Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV9Atributos))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV9Atributos), true);
                           AV19Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Eliminar)==0) ? AV62Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Eliminar))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Eliminar), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e181T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ATRIBUTOS'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Atributos' */
                                 e191T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ELIMINAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Eliminar' */
                                 e201T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1T2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1T2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV19Eliminar ,
                                  String AV9Atributos ,
                                  byte AV23OPC ,
                                  java.math.BigDecimal AV52Tran_ValorTransaccion ,
                                  long A46Tran_Id ,
                                  long AV49Tran_Id ,
                                  java.math.BigDecimal A483Tran_ValorTransaccion ,
                                  long A487TDet_Cantidad ,
                                  String A66Elem_Consecutivo ,
                                  long A69TDet_Consecutivo ,
                                  java.math.BigDecimal A489TDet_ValorTotal ,
                                  java.math.BigDecimal A488TDet_ValorUnitario ,
                                  String A298Cata_Descripcion ,
                                  String A525TDet_Atributos ,
                                  java.math.BigDecimal A657TDet_Otros_Costos ,
                                  String AV59Tran_Estado ,
                                  String AV25Respuesta )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf1T2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1T2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavTran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharegistro_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavElem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_descripcion_Enabled, 5, 0)), true);
      edtavCosto_adquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_adquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_adquisicion_Enabled, 5, 0)), true);
      edtavTotal_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_costos_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_cantidad_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
   }

   public void rf1T2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      /* Execute user event: Refresh */
      e211T2 ();
      nGXsfl_74_idx = (short)(1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Tooltiptext", GXutil.rtrim( subGrid1_Tooltiptext));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_742( ) ;
         e171T2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_74_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e171T2 ();
         }
         wbEnd = (short)(74) ;
         wb1T0( ) ;
      }
      bGXsfl_74_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
      }
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV19Eliminar, AV9Atributos, AV23OPC, AV52Tran_ValorTransaccion, A46Tran_Id, AV49Tran_Id, A483Tran_ValorTransaccion, A487TDet_Cantidad, A66Elem_Consecutivo, A69TDet_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A298Cata_Descripcion, A525TDet_Atributos, A657TDet_Otros_Costos, AV59Tran_Estado, AV25Respuesta) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup1T0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavTran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharegistro_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavElem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_descripcion_Enabled, 5, 0)), true);
      edtavCosto_adquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_adquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_adquisicion_Enabled, 5, 0)), true);
      edtavTotal_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_costos_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_cantidad_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47Tran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV47Tran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV47Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV47Tran_ConsecutivoCC, 18, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vTRAN_FECHAREGISTRO");
            GX_FocusControl = edtavTran_fecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV48Tran_FechaRegistro", localUtil.ttoc( AV48Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV48Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Tran_FechaRegistro", localUtil.ttoc( AV48Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         AV14cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14cElem_Consecutivo", AV14cElem_Consecutivo);
         AV13cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cCata_Descripcion", AV13cCata_Descripcion);
         AV18Elem_Descripcion = httpContext.cgiGet( edtavElem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10Cantidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Cantidad", GXutil.ltrim( GXutil.str( AV10Cantidad, 10, 0)));
         }
         else
         {
            AV10Cantidad = localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Cantidad", GXutil.ltrim( GXutil.str( AV10Cantidad, 10, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALORUNITARIO");
            GX_FocusControl = edtavValorunitario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56ValorUnitario = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56ValorUnitario", GXutil.ltrim( GXutil.str( AV56ValorUnitario, 18, 2)));
         }
         else
         {
            AV56ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56ValorUnitario", GXutil.ltrim( GXutil.str( AV56ValorUnitario, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTO_ADQUISICION");
            GX_FocusControl = edtavCosto_adquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Costo_Adquisicion = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV16Costo_Adquisicion, 18, 2)));
         }
         else
         {
            AV16Costo_Adquisicion = localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV16Costo_Adquisicion, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOTROS_COSTOS");
            GX_FocusControl = edtavOtros_costos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24Otros_Costos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Otros_Costos", GXutil.ltrim( GXutil.str( AV24Otros_Costos, 18, 2)));
         }
         else
         {
            AV24Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Otros_Costos", GXutil.ltrim( GXutil.str( AV24Otros_Costos, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_COSTOS");
            GX_FocusControl = edtavTotal_costos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45Total_Costos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Total_Costos", GXutil.ltrim( GXutil.str( AV45Total_Costos, 18, 2)));
         }
         else
         {
            AV45Total_Costos = localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Total_Costos", GXutil.ltrim( GXutil.str( AV45Total_Costos, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_VALORTRANSACCION");
            GX_FocusControl = edtavTran_valortransaccion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52Tran_ValorTransaccion = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV52Tran_ValorTransaccion, 18, 2)));
         }
         else
         {
            AV52Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV52Tran_ValorTransaccion, 18, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   private void e171T2( )
   {
      /* Grid1_Load Routine */
      AV23OPC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      AV19Eliminar = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      AV62Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV9Atributos = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      AV63Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV52Tran_ValorTransaccion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV52Tran_ValorTransaccion, 18, 2)));
      /* Using cursor H001T2 */
      pr_default.execute(0, new Object[] {new Long(AV49Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = H001T2_A46Tran_Id[0] ;
         A483Tran_ValorTransaccion = H001T2_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H001T2_n483Tran_ValorTransaccion[0] ;
         AV52Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV52Tran_ValorTransaccion, 18, 2)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H001T3 */
      pr_default.execute(1, new Object[] {new Long(AV49Tran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A37Cata_Codigo = H001T3_A37Cata_Codigo[0] ;
         A46Tran_Id = H001T3_A46Tran_Id[0] ;
         A487TDet_Cantidad = H001T3_A487TDet_Cantidad[0] ;
         A66Elem_Consecutivo = H001T3_A66Elem_Consecutivo[0] ;
         A69TDet_Consecutivo = H001T3_A69TDet_Consecutivo[0] ;
         A489TDet_ValorTotal = H001T3_A489TDet_ValorTotal[0] ;
         A488TDet_ValorUnitario = H001T3_A488TDet_ValorUnitario[0] ;
         A298Cata_Descripcion = H001T3_A298Cata_Descripcion[0] ;
         A525TDet_Atributos = H001T3_A525TDet_Atributos[0] ;
         A657TDet_Otros_Costos = H001T3_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = H001T3_n657TDet_Otros_Costos[0] ;
         A37Cata_Codigo = H001T3_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H001T3_A298Cata_Descripcion[0] ;
         AV35TDet_Cantidad = A487TDet_Cantidad ;
         AV17Elem_Consecutivo = A66Elem_Consecutivo ;
         AV37TDet_Consecutivo = A69TDet_Consecutivo ;
         AV41TDet_ValorTotal = A489TDet_ValorTotal ;
         AV42TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV12Cata_Descripcion = A298Cata_Descripcion ;
         AV7TDet_Atributos = A525TDet_Atributos ;
         AV39TDet_Otros_Costos = A657TDet_Otros_Costos ;
         edtavTdet_cantidad_Fontbold = (byte)(1) ;
         edtavElem_consecutivo_Fontbold = (byte)(1) ;
         edtavTdet_valortotal_Fontbold = (byte)(1) ;
         edtavTdet_valorunitario_Fontbold = (byte)(1) ;
         edtavCata_descripcion_Fontbold = (byte)(1) ;
         edtavTdet_otros_costos_Fontbold = (byte)(1) ;
         if ( GXutil.strcmp(AV7TDet_Atributos, "SI") == 0 )
         {
            edtavTdet_cantidad_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavElem_consecutivo_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_valortotal_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_valorunitario_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavCata_descripcion_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_otros_costos_Forecolor = GXutil.getColor( 0, 128, 0) ;
         }
         else
         {
            edtavTdet_cantidad_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavElem_consecutivo_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_valortotal_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_valorunitario_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavCata_descripcion_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_otros_costos_Forecolor = GXutil.getColor( 204, 0, 0) ;
         }
         if ( ( GXutil.strcmp(AV59Tran_Estado, "I") != 0 ) || ( GXutil.strcmp(AV25Respuesta, "0") == 0 ) )
         {
            edtavEliminar_Enabled = 0 ;
            edtavAtributos_Enabled = 0 ;
         }
         else
         {
            edtavEliminar_Enabled = 1 ;
            edtavAtributos_Enabled = 1 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(74) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_742( ) ;
            GRID1_nEOF = (byte)(1) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
         {
            httpContext.doAjaxLoad(74, Grid1Row);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e181T2 ();
      if (returnInSub) return;
   }

   public void e181T2( )
   {
      /* Start Routine */
      AV23OPC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      lblUrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblUrl_Visible, 5, 0)), true);
      subGrid1_Rows = 8 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV19Eliminar = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Eliminar)==0) ? AV62Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Eliminar))), !bGXsfl_74_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Eliminar), true);
      AV62Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Eliminar)==0) ? AV62Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Eliminar))), !bGXsfl_74_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Eliminar), true);
      AV9Atributos = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV9Atributos)==0) ? AV63Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV9Atributos))), !bGXsfl_74_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV9Atributos), true);
      AV63Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV9Atributos)==0) ? AV63Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV9Atributos))), !bGXsfl_74_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV9Atributos), true);
      AV54Usuario = AV8websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Usuario", AV54Usuario);
      /* Execute user subroutine: 'DATOSTRANSACCION' */
      S112 ();
      if (returnInSub) return;
      Form.setCaption( "Entrada elementos de consumo" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( GXutil.strcmp(AV59Tran_Estado, "I") != 0 )
      {
         bttButton1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
         bttButton2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
         bttButton3_Caption = "Salir" ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Caption", bttButton3_Caption, true);
      }
   }

   public void S112( )
   {
      /* 'DATOSTRANSACCION' Routine */
      /* Using cursor H001T4 */
      pr_default.execute(2, new Object[] {new Long(AV49Tran_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A49Tran_CodigoMovimiento = H001T4_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = H001T4_A46Tran_Id[0] ;
         A499Tran_CodTipoElemento = H001T4_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001T4_n499Tran_CodTipoElemento[0] ;
         A513Tran_ConsecutivoCC = H001T4_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H001T4_n513Tran_ConsecutivoCC[0] ;
         A55Tran_FechaRegistro = H001T4_A55Tran_FechaRegistro[0] ;
         A58Tran_Estado = H001T4_A58Tran_Estado[0] ;
         n58Tran_Estado = H001T4_n58Tran_Estado[0] ;
         A499Tran_CodTipoElemento = H001T4_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001T4_n499Tran_CodTipoElemento[0] ;
         AV46Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV46Tran_CodTipoElemento, 18, 0)));
         AV47Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV47Tran_ConsecutivoCC, 18, 0)));
         AV48Tran_FechaRegistro = A55Tran_FechaRegistro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Tran_FechaRegistro", localUtil.ttoc( AV48Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         AV59Tran_Estado = A58Tran_Estado ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_Estado", AV59Tran_Estado);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void e131T2( )
   {
      /* 'Agregar' Routine */
      /* Execute user subroutine: 'VALIDAR' */
      S122 ();
      if (returnInSub) return;
      if ( AV33SWError == 0 )
      {
         AV45Total_Costos = AV16Costo_Adquisicion.add((AV24Otros_Costos.divide(DecimalUtil.doubleToDec(AV10Cantidad), 18, java.math.BigDecimal.ROUND_DOWN))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Total_Costos", GXutil.ltrim( GXutil.str( AV45Total_Costos, 18, 2)));
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( AV10Cantidad );
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV14cElem_Consecutivo );
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_observaciones( AV22Observaciones );
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV56ValorUnitario );
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV45Total_Costos.multiply(DecimalUtil.doubleToDec(AV10Cantidad)) );
         AV29SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV24Otros_Costos.divide(DecimalUtil.doubleToDec(AV10Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         GXv_SdtSDTDetalleTrn1[0] = AV29SDTDetalleTrn;
         GXv_char2[0] = "INS" ;
         GXv_int3[0] = AV49Tran_Id ;
         GXv_int4[0] = AV33SWError ;
         GXv_int5[0] = AV37TDet_Consecutivo ;
         new com.orions2.pentraconsu(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn1, GXv_char2, GXv_int3, GXv_int4, GXv_int5) ;
         AV29SDTDetalleTrn = GXv_SdtSDTDetalleTrn1[0] ;
         wpcon_ent_impl.this.AV49Tran_Id = GXv_int3[0] ;
         wpcon_ent_impl.this.AV33SWError = GXv_int4[0] ;
         wpcon_ent_impl.this.AV37TDet_Consecutivo = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV33SWError", GXutil.ltrim( GXutil.str( AV33SWError, 4, 0)));
         AV23OPC = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
         httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV37TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV49Tran_Id",});
         /* Execute user subroutine: 'BORRARDATOS' */
         S132 ();
         if (returnInSub) return;
         httpContext.doAjaxRefresh();
      }
      else if ( AV33SWError == 5 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. Todos los campos con * son obligatorios" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29SDTDetalleTrn", AV29SDTDetalleTrn);
   }

   public void e191T2( )
   {
      /* 'Atributos' Routine */
      AV23OPC = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV37TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("UDP")), new Object[] {"AV49Tran_Id",});
      httpContext.doAjaxRefresh();
   }

   public void e201T2( )
   {
      /* 'Eliminar' Routine */
      AV23OPC = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      AV32SWEliminar = (short)(5) ;
      AV58TDet_PlacaRecuperada = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TDet_PlacaRecuperada", AV58TDet_PlacaRecuperada);
      GXv_int5[0] = AV49Tran_Id ;
      GXv_int3[0] = AV37TDet_Consecutivo ;
      GXv_int4[0] = (short)(0) ;
      GXv_char2[0] = AV58TDet_PlacaRecuperada ;
      new com.orions2.entradevoelimi(remoteHandle, context).execute( AV32SWEliminar, GXv_int5, AV17Elem_Consecutivo, GXv_int3, GXv_int4, GXv_char2) ;
      wpcon_ent_impl.this.AV49Tran_Id = GXv_int5[0] ;
      wpcon_ent_impl.this.AV37TDet_Consecutivo = GXv_int3[0] ;
      wpcon_ent_impl.this.AV58TDet_PlacaRecuperada = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV58TDet_PlacaRecuperada", AV58TDet_PlacaRecuperada);
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'VALIDAR' Routine */
      AV33SWError = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33SWError", GXutil.ltrim( GXutil.str( AV33SWError, 4, 0)));
      if ( ( GXutil.strcmp(AV43TIP_Codigo, "") == 0 ) || ( GXutil.strcmp(AV31SEG_Codigo, "") == 0 ) || ( GXutil.strcmp(AV20FAM_Codigo, "") == 0 ) || ( GXutil.strcmp(AV15Clas_Codigo, "") == 0 ) || ( GXutil.strcmp(AV11Cata_Codigo, "") == 0 ) || ( AV10Cantidad == 0 ) || ( AV10Cantidad <= 0 ) || ( DecimalUtil.compareTo(AV56ValorUnitario, DecimalUtil.ZERO) == 0 ) )
      {
         AV33SWError = (short)(5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33SWError", GXutil.ltrim( GXutil.str( AV33SWError, 4, 0)));
      }
   }

   public void S132( )
   {
      /* 'BORRARDATOS' Routine */
      AV10Cantidad = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Cantidad", GXutil.ltrim( GXutil.str( AV10Cantidad, 10, 0)));
      AV56ValorUnitario = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56ValorUnitario", GXutil.ltrim( GXutil.str( AV56ValorUnitario, 18, 2)));
      AV22Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Observaciones", AV22Observaciones);
      AV18Elem_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
      AV14cElem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14cElem_Consecutivo", AV14cElem_Consecutivo);
      AV43TIP_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TIP_Codigo", AV43TIP_Codigo);
      AV31SEG_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31SEG_Codigo", AV31SEG_Codigo);
      AV20FAM_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FAM_Codigo", AV20FAM_Codigo);
      AV15Clas_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Codigo", AV15Clas_Codigo);
      AV11Cata_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Cata_Codigo", AV11Cata_Codigo);
      AV13cCata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13cCata_Descripcion", AV13cCata_Descripcion);
      AV16Costo_Adquisicion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV16Costo_Adquisicion, 18, 2)));
      AV24Otros_Costos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Otros_Costos", GXutil.ltrim( GXutil.str( AV24Otros_Costos, 18, 2)));
      AV45Total_Costos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Total_Costos", GXutil.ltrim( GXutil.str( AV45Total_Costos, 18, 2)));
   }

   public void e141T2( )
   {
      /* 'RATIFICAR' Routine */
      AV55valor = DecimalUtil.doubleToDec(0) ;
      AV34SWErrorRati = (short)(0) ;
      AV67GXLvl152 = (byte)(0) ;
      /* Using cursor H001T5 */
      pr_default.execute(3, new Object[] {new Long(AV49Tran_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A46Tran_Id = H001T5_A46Tran_Id[0] ;
         A489TDet_ValorTotal = H001T5_A489TDet_ValorTotal[0] ;
         A525TDet_Atributos = H001T5_A525TDet_Atributos[0] ;
         AV67GXLvl152 = (byte)(1) ;
         AV55valor = AV55valor.add(A489TDet_ValorTotal) ;
         if ( GXutil.strcmp(A525TDet_Atributos, "NO") == 0 )
         {
            AV34SWErrorRati = (short)(1) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV67GXLvl152 == 0 )
      {
         AV34SWErrorRati = (short)(2) ;
      }
      if ( AV34SWErrorRati == 1 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. Existen elementos con atributos sin confirmar" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV34SWErrorRati == 0 )
      {
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Esta seguro de ratificar esta transaccion por valor total de $"+localUtil.format( AV55valor, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")+" " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV34SWErrorRati == 2 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. No se han registrado elementos" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e121T2( )
   {
      /* Alertify1_Ok Routine */
      AV25Respuesta = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Respuesta", AV25Respuesta);
      GXv_int5[0] = AV49Tran_Id ;
      GXv_char2[0] = "RAT" ;
      GXv_char6[0] = "" ;
      GXv_char7[0] = AV54Usuario ;
      new com.orions2.pratifientcon(remoteHandle, context).execute( GXv_int5, GXv_char2, GXv_char6, GXv_char7) ;
      wpcon_ent_impl.this.AV49Tran_Id = GXv_int5[0] ;
      wpcon_ent_impl.this.AV54Usuario = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Usuario", AV54Usuario);
      GXv_int5[0] = AV49Tran_Id ;
      new com.orions2.wscorreotraspaso(remoteHandle, context).execute( GXv_int5) ;
      wpcon_ent_impl.this.AV49Tran_Id = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
      AV53URL = formatLink("com.orions2.aptrascuen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tran_Id,11,0))) ;
      AV57WindowsId = (short)(GXutil.random( )*100000) ;
      lblUrl_Caption = "<script language=\"JavaScript\">window.open(\""+GXutil.trim( AV53URL)+"\",\""+GXutil.trim( GXutil.str( AV57WindowsId, 10, 0))+"\",\"target=_top,top=10,left=10,width=600,height=500,scrollbars=yes,menubar=no,toolbar=no,resizable=yes,directories=no\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Caption", lblUrl_Caption, true);
      bttButton1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
      bttButton2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
      bttButton3_Caption = "Salir" ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Caption", bttButton3_Caption, true);
      AV23OPC = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      httpContext.doAjaxRefresh();
   }

   public void e151T2( )
   {
      /* Celem_consecutivo_Isvalid Routine */
      if ( GXutil.strcmp(AV14cElem_Consecutivo, "") != 0 )
      {
         /* Execute user subroutine: 'BUSCAELEMENTO' */
         S142 ();
         if (returnInSub) return;
      }
   }

   public void e161T2( )
   {
      /* 'BuscarElemento' Routine */
      httpContext.popup(formatLink("com.orions2.gxelemconsu") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV46Tran_CodTipoElemento,18,0))), new Object[] {"AV14cElem_Consecutivo","AV5cElem_Descripcion","AV13cCata_Descripcion","AV43TIP_Codigo","AV31SEG_Codigo","AV20FAM_Codigo","AV15Clas_Codigo","AV11Cata_Codigo",});
   }

   public void S142( )
   {
      /* 'BUSCAELEMENTO' Routine */
      /* Using cursor H001T6 */
      pr_default.execute(4, new Object[] {AV14cElem_Consecutivo, new Long(AV46Tran_CodTipoElemento)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A33Tipo_Codigo = H001T6_A33Tipo_Codigo[0] ;
         A66Elem_Consecutivo = H001T6_A66Elem_Consecutivo[0] ;
         A557Elem_Descripcion = H001T6_A557Elem_Descripcion[0] ;
         A74TIP_Codigo = H001T6_A74TIP_Codigo[0] ;
         A75SEG_Codigo = H001T6_A75SEG_Codigo[0] ;
         A298Cata_Descripcion = H001T6_A298Cata_Descripcion[0] ;
         A35FAM_Codigo = H001T6_A35FAM_Codigo[0] ;
         A34Clas_Codigo = H001T6_A34Clas_Codigo[0] ;
         A37Cata_Codigo = H001T6_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H001T6_A298Cata_Descripcion[0] ;
         A34Clas_Codigo = H001T6_A34Clas_Codigo[0] ;
         A35FAM_Codigo = H001T6_A35FAM_Codigo[0] ;
         A75SEG_Codigo = H001T6_A75SEG_Codigo[0] ;
         A74TIP_Codigo = H001T6_A74TIP_Codigo[0] ;
         AV18Elem_Descripcion = A557Elem_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Elem_Descripcion", AV18Elem_Descripcion);
         AV43TIP_Codigo = A74TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43TIP_Codigo", AV43TIP_Codigo);
         AV31SEG_Codigo = A75SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31SEG_Codigo", AV31SEG_Codigo);
         AV13cCata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cCata_Descripcion", AV13cCata_Descripcion);
         AV20FAM_Codigo = A35FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FAM_Codigo", AV20FAM_Codigo);
         AV15Clas_Codigo = A34Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Codigo", AV15Clas_Codigo);
         AV11Cata_Codigo = A37Cata_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Cata_Codigo", AV11Cata_Codigo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void e211T2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      if ( AV23OPC == 1 )
      {
         httpContext.doAjaxRefresh();
         AV23OPC = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OPC", GXutil.str( AV23OPC, 1, 0));
      }
   }

   public void setparameters( Object[] obj )
   {
      AV49Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_Id", GXutil.ltrim( GXutil.str( AV49Tran_Id, 11, 0)));
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1T2( ) ;
      ws1T2( ) ;
      we1T2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("Alertify/css/alertify.core.css", "?1126220");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.default.css", "?11295124");
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414183275");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("wpcon_ent.js", "?201861414183275");
         httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
         httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
         httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
         httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_74_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_74_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_74_idx ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD_"+sGXsfl_74_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_74_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_74_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_74_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_74_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_74_fel_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_74_fel_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_74_fel_idx ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD_"+sGXsfl_74_fel_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_74_fel_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_74_fel_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_74_fel_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_74_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb1T0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( AV37TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),((edtavTdet_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV37TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,75);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavElem_consecutivo_Internalname,AV17Elem_Consecutivo,"",TempTags+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavElem_consecutivo_Jsonclick,new Integer(0),"Attribute",((edtavElem_consecutivo_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavElem_consecutivo_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavElem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCata_descripcion_Internalname,AV12Cata_Descripcion,GXutil.rtrim( localUtil.format( AV12Cata_Descripcion, "@!")),TempTags+((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,77);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCata_descripcion_Jsonclick,new Integer(0),"Attribute",((edtavCata_descripcion_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavCata_descripcion_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavCata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( AV35TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),((edtavTdet_cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TDet_Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV35TDet_Cantidad), "ZZZZZZZZZ9")),TempTags+((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_cantidad_Jsonclick,new Integer(0),"Attribute",((edtavTdet_cantidad_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_cantidad_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavTdet_cantidad_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valorunitario_Internalname,GXutil.ltrim( localUtil.ntoc( AV42TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV42TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV42TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valorunitario_Jsonclick,new Integer(0),"Attribute",((edtavTdet_valorunitario_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_valorunitario_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valorunitario_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_otros_costos_Internalname,GXutil.ltrim( localUtil.ntoc( AV39TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")),((edtavTdet_otros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV39TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV39TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_otros_costos_Jsonclick,new Integer(0),"Attribute",((edtavTdet_otros_costos_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_otros_costos_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavTdet_otros_costos_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valortotal_Internalname,GXutil.ltrim( localUtil.ntoc( AV41TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valortotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV41TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV41TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,81);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valortotal_Jsonclick,new Integer(0),"Attribute",((edtavTdet_valortotal_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_valortotal_Forecolor)+";",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valortotal_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavAtributos_Enabled!=0)&&(edtavAtributos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'',74)\"" : " ") ;
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV9Atributos_IsBlob = (boolean)(((GXutil.strcmp("", AV9Atributos)==0)&&(GXutil.strcmp("", AV63Atributos_GXI)==0))||!(GXutil.strcmp("", AV9Atributos)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV9Atributos)==0) ? AV63Atributos_GXI : httpContext.getResourceRelative(AV9Atributos)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavAtributos_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavAtributos_Enabled),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavAtributos_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ATRIBUTOS\\'."+sGXsfl_74_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV9Atributos_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'',74)\"" : " ") ;
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV19Eliminar_IsBlob = (boolean)(((GXutil.strcmp("", AV19Eliminar)==0)&&(GXutil.strcmp("", AV62Eliminar_GXI)==0))||!(GXutil.strcmp("", AV19Eliminar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV19Eliminar)==0) ? AV62Eliminar_GXI : httpContext.getResourceRelative(AV19Eliminar)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavEliminar_Enabled),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavEliminar_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ELIMINAR\\'."+sGXsfl_74_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV19Eliminar_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      edtavTran_fecharegistro_Internalname = "vTRAN_FECHAREGISTRO" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      edtavElem_descripcion_Internalname = "vELEM_DESCRIPCION" ;
      edtavCantidad_Internalname = "vCANTIDAD" ;
      edtavValorunitario_Internalname = "vVALORUNITARIO" ;
      edtavCosto_adquisicion_Internalname = "vCOSTO_ADQUISICION" ;
      edtavOtros_costos_Internalname = "vOTROS_COSTOS" ;
      edtavTotal_costos_Internalname = "vTOTAL_COSTOS" ;
      bttButton1_Internalname = "BUTTON1" ;
      edtavTran_valortransaccion_Internalname = "vTRAN_VALORTRANSACCION" ;
      lblTitleatributos_Internalname = "TITLEATRIBUTOS" ;
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO" ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD" ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO" ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS" ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL" ;
      edtavAtributos_Internalname = "vATRIBUTOS" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      divTable2_Internalname = "TABLE2" ;
      bttButton2_Internalname = "BUTTON2" ;
      bttButton3_Internalname = "BUTTON3" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      lblUrl_Internalname = "URL" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_Visible = -1 ;
      edtavAtributos_Jsonclick = "" ;
      edtavAtributos_Visible = -1 ;
      edtavTdet_valortotal_Jsonclick = "" ;
      edtavTdet_valortotal_Visible = -1 ;
      edtavTdet_otros_costos_Jsonclick = "" ;
      edtavTdet_otros_costos_Visible = -1 ;
      edtavTdet_valorunitario_Jsonclick = "" ;
      edtavTdet_valorunitario_Visible = -1 ;
      edtavTdet_cantidad_Jsonclick = "" ;
      edtavTdet_cantidad_Visible = -1 ;
      edtavCata_descripcion_Jsonclick = "" ;
      edtavCata_descripcion_Visible = -1 ;
      edtavElem_consecutivo_Jsonclick = "" ;
      edtavElem_consecutivo_Visible = -1 ;
      edtavTdet_consecutivo_Jsonclick = "" ;
      edtavTdet_consecutivo_Visible = 0 ;
      lblUrl_Caption = "" ;
      lblUrl_Visible = 1 ;
      bttButton3_Caption = "CANCELAR" ;
      bttButton2_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavTdet_valortotal_Fontbold = (byte)(0) ;
      edtavTdet_valortotal_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_otros_costos_Fontbold = (byte)(0) ;
      edtavTdet_otros_costos_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_valorunitario_Fontbold = (byte)(0) ;
      edtavTdet_valorunitario_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_cantidad_Fontbold = (byte)(0) ;
      edtavTdet_cantidad_Forecolor = (int)(0xFFFFFF) ;
      edtavCata_descripcion_Fontbold = (byte)(0) ;
      edtavCata_descripcion_Forecolor = (int)(0xFFFFFF) ;
      edtavElem_consecutivo_Fontbold = (byte)(0) ;
      edtavElem_consecutivo_Forecolor = (int)(0xFFFFFF) ;
      subGrid1_Tooltiptext = "0" ;
      edtavEliminar_Enabled = 1 ;
      edtavAtributos_Enabled = 1 ;
      edtavTdet_valortotal_Enabled = 1 ;
      edtavTdet_otros_costos_Enabled = 1 ;
      edtavTdet_valorunitario_Enabled = 1 ;
      edtavTdet_cantidad_Enabled = 1 ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavElem_consecutivo_Enabled = 1 ;
      edtavTdet_consecutivo_Enabled = 1 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavTran_valortransaccion_Jsonclick = "" ;
      edtavTran_valortransaccion_Enabled = 1 ;
      bttButton1_Visible = 1 ;
      edtavTotal_costos_Jsonclick = "" ;
      edtavTotal_costos_Enabled = 1 ;
      edtavOtros_costos_Jsonclick = "" ;
      edtavOtros_costos_Enabled = 1 ;
      edtavCosto_adquisicion_Jsonclick = "" ;
      edtavCosto_adquisicion_Enabled = 1 ;
      edtavValorunitario_Jsonclick = "" ;
      edtavValorunitario_Enabled = 1 ;
      edtavCantidad_Jsonclick = "" ;
      edtavCantidad_Enabled = 1 ;
      edtavElem_descripcion_Enabled = 1 ;
      edtavCcata_descripcion_Jsonclick = "" ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavTran_fecharegistro_Jsonclick = "" ;
      edtavTran_fecharegistro_Enabled = 1 ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Entrada elementos de consumo" );
      subGrid1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e171T2',iparms:[{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35TDet_Cantidad',fld:'vTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV17Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41TDet_ValorTotal',fld:'vTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV42TDet_ValorUnitario',fld:'vTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV12Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV39TDet_Otros_Costos',fld:'vTDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'edtavTdet_cantidad_Fontbold',ctrl:'vTDET_CANTIDAD',prop:'Fontbold'},{av:'edtavElem_consecutivo_Fontbold',ctrl:'vELEM_CONSECUTIVO',prop:'Fontbold'},{av:'edtavTdet_valortotal_Fontbold',ctrl:'vTDET_VALORTOTAL',prop:'Fontbold'},{av:'edtavTdet_valorunitario_Fontbold',ctrl:'vTDET_VALORUNITARIO',prop:'Fontbold'},{av:'edtavCata_descripcion_Fontbold',ctrl:'vCATA_DESCRIPCION',prop:'Fontbold'},{av:'edtavTdet_otros_costos_Fontbold',ctrl:'vTDET_OTROS_COSTOS',prop:'Fontbold'},{av:'edtavTdet_cantidad_Forecolor',ctrl:'vTDET_CANTIDAD',prop:'Forecolor'},{av:'edtavElem_consecutivo_Forecolor',ctrl:'vELEM_CONSECUTIVO',prop:'Forecolor'},{av:'edtavTdet_valortotal_Forecolor',ctrl:'vTDET_VALORTOTAL',prop:'Forecolor'},{av:'edtavTdet_valorunitario_Forecolor',ctrl:'vTDET_VALORUNITARIO',prop:'Forecolor'},{av:'edtavCata_descripcion_Forecolor',ctrl:'vCATA_DESCRIPCION',prop:'Forecolor'},{av:'edtavTdet_otros_costos_Forecolor',ctrl:'vTDET_OTROS_COSTOS',prop:'Forecolor'},{av:'edtavEliminar_Enabled',ctrl:'vELIMINAR',prop:'Enabled'},{av:'edtavAtributos_Enabled',ctrl:'vATRIBUTOS',prop:'Enabled'}]}");
      setEventMetadata("'AGREGAR'","{handler:'e131T2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV33SWError',fld:'vSWERROR',pic:'ZZZ9',nv:0},{av:'AV16Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV24Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV29SDTDetalleTrn',fld:'vSDTDETALLETRN',pic:'',nv:null},{av:'AV14cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV22Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV56ValorUnitario',fld:'vVALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV43TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV31SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV20FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV15Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV11Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''},{av:'AV18Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''},{av:'AV12Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[{av:'AV45Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV29SDTDetalleTrn',fld:'vSDTDETALLETRN',pic:'',nv:null},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV33SWError',fld:'vSWERROR',pic:'ZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV10Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV56ValorUnitario',fld:'vVALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV22Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV18Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''},{av:'AV14cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV43TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV31SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV20FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV15Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV11Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''},{av:'AV13cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV16Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV24Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}]}");
      setEventMetadata("'ATRIBUTOS'","{handler:'e191T2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV17Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'ELIMINAR'","{handler:'e201T2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV58TDet_PlacaRecuperada',fld:'vTDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV17Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6TDet_Agrupado',fld:'vTDET_AGRUPADO',pic:'ZZZ9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV58TDet_PlacaRecuperada',fld:'vTDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV6TDet_Agrupado',fld:'vTDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'RATIFICAR'","{handler:'e141T2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e121T2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV51Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV54Usuario',fld:'vUSUARIO',pic:'@!',nv:''}],oparms:[{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV54Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'AV51Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'},{ctrl:'BUTTON1',prop:'Visible'},{ctrl:'BUTTON2',prop:'Visible'},{ctrl:'BUTTON3',prop:'Caption'},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
      setEventMetadata("VCELEM_CONSECUTIVO.ISVALID","{handler:'e151T2',iparms:[{av:'AV14cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV46Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A557Elem_Descripcion',fld:'ELEM_DESCRIPCION',pic:'',nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',nv:''},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',nv:''},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''}],oparms:[{av:'AV18Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''},{av:'AV43TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV31SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV13cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV20FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV15Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV11Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARELEMENTO'","{handler:'e161T2',iparms:[{av:'AV46Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV11Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''},{av:'AV15Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV20FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV31SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV43TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV13cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV14cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}]}");
      setEventMetadata("'CANCELAR'","{handler:'e111T1',iparms:[],oparms:[]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV19Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV9Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV52Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV49Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV59Tran_Estado',fld:'vTRAN_ESTADO',pic:'',nv:''},{av:'AV25Respuesta',fld:'vRESPUESTA',pic:'',nv:''},{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}],oparms:[{av:'AV23OPC',fld:'vOPC',pic:'9',nv:0}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV19Eliminar = "" ;
      AV9Atributos = "" ;
      AV52Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A66Elem_Consecutivo = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A298Cata_Descripcion = "" ;
      A525TDet_Atributos = "" ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV59Tran_Estado = "" ;
      AV25Respuesta = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV29SDTDetalleTrn = new com.orions2.SdtSDTDetalleTrn(remoteHandle, context);
      AV22Observaciones = "" ;
      AV43TIP_Codigo = "" ;
      AV31SEG_Codigo = "" ;
      AV20FAM_Codigo = "" ;
      AV15Clas_Codigo = "" ;
      AV11Cata_Codigo = "" ;
      AV58TDet_PlacaRecuperada = "" ;
      AV51Tran_TipoEntra = "" ;
      AV54Usuario = "" ;
      A557Elem_Descripcion = "" ;
      A74TIP_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A34Clas_Codigo = "" ;
      A37Cata_Codigo = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV48Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV14cElem_Consecutivo = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV13cCata_Descripcion = "" ;
      AV18Elem_Descripcion = "" ;
      AV56ValorUnitario = DecimalUtil.ZERO ;
      AV16Costo_Adquisicion = DecimalUtil.ZERO ;
      AV24Otros_Costos = DecimalUtil.ZERO ;
      AV45Total_Costos = DecimalUtil.ZERO ;
      bttButton1_Jsonclick = "" ;
      lblTitleatributos_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV17Elem_Consecutivo = "" ;
      AV12Cata_Descripcion = "" ;
      AV42TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV39TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV41TDet_ValorTotal = DecimalUtil.ZERO ;
      bttButton2_Jsonclick = "" ;
      bttButton3_Jsonclick = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV63Atributos_GXI = "" ;
      AV62Eliminar_GXI = "" ;
      scmdbuf = "" ;
      H001T2_A46Tran_Id = new long[1] ;
      H001T2_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001T2_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H001T3_A37Cata_Codigo = new String[] {""} ;
      H001T3_A46Tran_Id = new long[1] ;
      H001T3_A487TDet_Cantidad = new long[1] ;
      H001T3_A66Elem_Consecutivo = new String[] {""} ;
      H001T3_A69TDet_Consecutivo = new long[1] ;
      H001T3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001T3_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001T3_A298Cata_Descripcion = new String[] {""} ;
      H001T3_A525TDet_Atributos = new String[] {""} ;
      H001T3_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001T3_n657TDet_Otros_Costos = new boolean[] {false} ;
      AV7TDet_Atributos = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV8websession = httpContext.getWebSession();
      H001T4_A49Tran_CodigoMovimiento = new String[] {""} ;
      H001T4_A46Tran_Id = new long[1] ;
      H001T4_A499Tran_CodTipoElemento = new long[1] ;
      H001T4_n499Tran_CodTipoElemento = new boolean[] {false} ;
      H001T4_A513Tran_ConsecutivoCC = new long[1] ;
      H001T4_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H001T4_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H001T4_A58Tran_Estado = new String[] {""} ;
      H001T4_n58Tran_Estado = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A58Tran_Estado = "" ;
      GXv_SdtSDTDetalleTrn1 = new com.orions2.SdtSDTDetalleTrn [1] ;
      GXv_int3 = new long [1] ;
      GXv_int4 = new short [1] ;
      AV55valor = DecimalUtil.ZERO ;
      H001T5_A69TDet_Consecutivo = new long[1] ;
      H001T5_A46Tran_Id = new long[1] ;
      H001T5_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001T5_A525TDet_Atributos = new String[] {""} ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_int5 = new long [1] ;
      AV53URL = "" ;
      H001T6_A33Tipo_Codigo = new long[1] ;
      H001T6_A66Elem_Consecutivo = new String[] {""} ;
      H001T6_A557Elem_Descripcion = new String[] {""} ;
      H001T6_A74TIP_Codigo = new String[] {""} ;
      H001T6_A75SEG_Codigo = new String[] {""} ;
      H001T6_A298Cata_Descripcion = new String[] {""} ;
      H001T6_A35FAM_Codigo = new String[] {""} ;
      H001T6_A34Clas_Codigo = new String[] {""} ;
      H001T6_A37Cata_Codigo = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpcon_ent__default(),
         new Object[] {
             new Object[] {
            H001T2_A46Tran_Id, H001T2_A483Tran_ValorTransaccion, H001T2_n483Tran_ValorTransaccion
            }
            , new Object[] {
            H001T3_A37Cata_Codigo, H001T3_A46Tran_Id, H001T3_A487TDet_Cantidad, H001T3_A66Elem_Consecutivo, H001T3_A69TDet_Consecutivo, H001T3_A489TDet_ValorTotal, H001T3_A488TDet_ValorUnitario, H001T3_A298Cata_Descripcion, H001T3_A525TDet_Atributos, H001T3_A657TDet_Otros_Costos,
            H001T3_n657TDet_Otros_Costos
            }
            , new Object[] {
            H001T4_A49Tran_CodigoMovimiento, H001T4_A46Tran_Id, H001T4_A499Tran_CodTipoElemento, H001T4_n499Tran_CodTipoElemento, H001T4_A513Tran_ConsecutivoCC, H001T4_n513Tran_ConsecutivoCC, H001T4_A55Tran_FechaRegistro, H001T4_A58Tran_Estado, H001T4_n58Tran_Estado
            }
            , new Object[] {
            H001T5_A69TDet_Consecutivo, H001T5_A46Tran_Id, H001T5_A489TDet_ValorTotal, H001T5_A525TDet_Atributos
            }
            , new Object[] {
            H001T6_A33Tipo_Codigo, H001T6_A66Elem_Consecutivo, H001T6_A557Elem_Descripcion, H001T6_A74TIP_Codigo, H001T6_A75SEG_Codigo, H001T6_A298Cata_Descripcion, H001T6_A35FAM_Codigo, H001T6_A34Clas_Codigo, H001T6_A37Cata_Codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      edtavTran_fecharegistro_Enabled = 0 ;
      edtavCcata_descripcion_Enabled = 0 ;
      edtavElem_descripcion_Enabled = 0 ;
      edtavCosto_adquisicion_Enabled = 0 ;
      edtavTotal_costos_Enabled = 0 ;
      edtavTran_valortransaccion_Enabled = 0 ;
      edtavTdet_consecutivo_Enabled = 0 ;
      edtavElem_consecutivo_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavTdet_cantidad_Enabled = 0 ;
      edtavTdet_valorunitario_Enabled = 0 ;
      edtavTdet_otros_costos_Enabled = 0 ;
      edtavTdet_valortotal_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV23OPC ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte edtavElem_consecutivo_Fontbold ;
   private byte edtavCata_descripcion_Fontbold ;
   private byte edtavTdet_cantidad_Fontbold ;
   private byte edtavTdet_valorunitario_Fontbold ;
   private byte edtavTdet_otros_costos_Fontbold ;
   private byte edtavTdet_valortotal_Fontbold ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte AV67GXLvl152 ;
   private byte subGrid1_Backstyle ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short AV33SWError ;
   private short AV6TDet_Agrupado ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV32SWEliminar ;
   private short GXv_int4[] ;
   private short AV34SWErrorRati ;
   private short AV57WindowsId ;
   private int subGrid1_Rows ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavTran_fecharegistro_Enabled ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavElem_descripcion_Enabled ;
   private int edtavCantidad_Enabled ;
   private int edtavValorunitario_Enabled ;
   private int edtavCosto_adquisicion_Enabled ;
   private int edtavOtros_costos_Enabled ;
   private int edtavTotal_costos_Enabled ;
   private int bttButton1_Visible ;
   private int edtavTran_valortransaccion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavTdet_consecutivo_Enabled ;
   private int edtavElem_consecutivo_Forecolor ;
   private int edtavElem_consecutivo_Enabled ;
   private int edtavCata_descripcion_Forecolor ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavTdet_cantidad_Forecolor ;
   private int edtavTdet_cantidad_Enabled ;
   private int edtavTdet_valorunitario_Forecolor ;
   private int edtavTdet_valorunitario_Enabled ;
   private int edtavTdet_otros_costos_Forecolor ;
   private int edtavTdet_otros_costos_Enabled ;
   private int edtavTdet_valortotal_Forecolor ;
   private int edtavTdet_valortotal_Enabled ;
   private int edtavAtributos_Enabled ;
   private int edtavEliminar_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int bttButton2_Visible ;
   private int lblUrl_Visible ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavTdet_consecutivo_Visible ;
   private int edtavElem_consecutivo_Visible ;
   private int edtavCata_descripcion_Visible ;
   private int edtavTdet_cantidad_Visible ;
   private int edtavTdet_valorunitario_Visible ;
   private int edtavTdet_otros_costos_Visible ;
   private int edtavTdet_valortotal_Visible ;
   private int edtavAtributos_Visible ;
   private int edtavEliminar_Visible ;
   private long wcpOAV49Tran_Id ;
   private long A46Tran_Id ;
   private long AV49Tran_Id ;
   private long A487TDet_Cantidad ;
   private long A69TDet_Consecutivo ;
   private long GRID1_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long AV46Tran_CodTipoElemento ;
   private long AV47Tran_ConsecutivoCC ;
   private long AV10Cantidad ;
   private long AV37TDet_Consecutivo ;
   private long AV35TDet_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A499Tran_CodTipoElemento ;
   private long A513Tran_ConsecutivoCC ;
   private long GXv_int3[] ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV52Tran_ValorTransaccion ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal AV56ValorUnitario ;
   private java.math.BigDecimal AV16Costo_Adquisicion ;
   private java.math.BigDecimal AV24Otros_Costos ;
   private java.math.BigDecimal AV45Total_Costos ;
   private java.math.BigDecimal AV42TDet_ValorUnitario ;
   private java.math.BigDecimal AV39TDet_Otros_Costos ;
   private java.math.BigDecimal AV41TDet_ValorTotal ;
   private java.math.BigDecimal AV55valor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String AV59Tran_Estado ;
   private String AV25Respuesta ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV51Tran_TipoEntra ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String TempTags ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String edtavTran_fecharegistro_Internalname ;
   private String edtavTran_fecharegistro_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavCcata_descripcion_Internalname ;
   private String edtavCcata_descripcion_Jsonclick ;
   private String edtavElem_descripcion_Internalname ;
   private String edtavCantidad_Internalname ;
   private String edtavCantidad_Jsonclick ;
   private String edtavValorunitario_Internalname ;
   private String edtavValorunitario_Jsonclick ;
   private String edtavCosto_adquisicion_Internalname ;
   private String edtavCosto_adquisicion_Jsonclick ;
   private String edtavOtros_costos_Internalname ;
   private String edtavOtros_costos_Jsonclick ;
   private String edtavTotal_costos_Internalname ;
   private String edtavTotal_costos_Jsonclick ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String edtavTran_valortransaccion_Internalname ;
   private String edtavTran_valortransaccion_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTitleatributos_Internalname ;
   private String lblTitleatributos_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Tooltiptext ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String bttButton3_Internalname ;
   private String bttButton3_Caption ;
   private String bttButton3_Jsonclick ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTdet_consecutivo_Internalname ;
   private String edtavElem_consecutivo_Internalname ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavTdet_cantidad_Internalname ;
   private String edtavTdet_valorunitario_Internalname ;
   private String edtavTdet_otros_costos_Internalname ;
   private String edtavTdet_valortotal_Internalname ;
   private String edtavAtributos_Internalname ;
   private String edtavEliminar_Internalname ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String Alertify1_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavTdet_consecutivo_Jsonclick ;
   private String edtavElem_consecutivo_Jsonclick ;
   private String edtavCata_descripcion_Jsonclick ;
   private String edtavTdet_cantidad_Jsonclick ;
   private String edtavTdet_valorunitario_Jsonclick ;
   private String edtavTdet_otros_costos_Jsonclick ;
   private String edtavTdet_valortotal_Jsonclick ;
   private String edtavAtributos_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private java.util.Date AV48Tran_FechaRegistro ;
   private java.util.Date A55Tran_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n657TDet_Otros_Costos ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n58Tran_Estado ;
   private boolean gx_refresh_fired ;
   private boolean AV9Atributos_IsBlob ;
   private boolean AV19Eliminar_IsBlob ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A525TDet_Atributos ;
   private String AV22Observaciones ;
   private String AV43TIP_Codigo ;
   private String AV31SEG_Codigo ;
   private String AV20FAM_Codigo ;
   private String AV15Clas_Codigo ;
   private String AV11Cata_Codigo ;
   private String AV58TDet_PlacaRecuperada ;
   private String AV54Usuario ;
   private String A557Elem_Descripcion ;
   private String A74TIP_Codigo ;
   private String A75SEG_Codigo ;
   private String A35FAM_Codigo ;
   private String A34Clas_Codigo ;
   private String A37Cata_Codigo ;
   private String AV14cElem_Consecutivo ;
   private String AV13cCata_Descripcion ;
   private String AV18Elem_Descripcion ;
   private String AV17Elem_Consecutivo ;
   private String AV12Cata_Descripcion ;
   private String AV63Atributos_GXI ;
   private String AV62Eliminar_GXI ;
   private String AV7TDet_Atributos ;
   private String A49Tran_CodigoMovimiento ;
   private String AV53URL ;
   private String AV19Eliminar ;
   private String AV9Atributos ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV8websession ;
   private IDataStoreProvider pr_default ;
   private long[] H001T2_A46Tran_Id ;
   private java.math.BigDecimal[] H001T2_A483Tran_ValorTransaccion ;
   private boolean[] H001T2_n483Tran_ValorTransaccion ;
   private String[] H001T3_A37Cata_Codigo ;
   private long[] H001T3_A46Tran_Id ;
   private long[] H001T3_A487TDet_Cantidad ;
   private String[] H001T3_A66Elem_Consecutivo ;
   private long[] H001T3_A69TDet_Consecutivo ;
   private java.math.BigDecimal[] H001T3_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H001T3_A488TDet_ValorUnitario ;
   private String[] H001T3_A298Cata_Descripcion ;
   private String[] H001T3_A525TDet_Atributos ;
   private java.math.BigDecimal[] H001T3_A657TDet_Otros_Costos ;
   private boolean[] H001T3_n657TDet_Otros_Costos ;
   private String[] H001T4_A49Tran_CodigoMovimiento ;
   private long[] H001T4_A46Tran_Id ;
   private long[] H001T4_A499Tran_CodTipoElemento ;
   private boolean[] H001T4_n499Tran_CodTipoElemento ;
   private long[] H001T4_A513Tran_ConsecutivoCC ;
   private boolean[] H001T4_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H001T4_A55Tran_FechaRegistro ;
   private String[] H001T4_A58Tran_Estado ;
   private boolean[] H001T4_n58Tran_Estado ;
   private long[] H001T5_A69TDet_Consecutivo ;
   private long[] H001T5_A46Tran_Id ;
   private java.math.BigDecimal[] H001T5_A489TDet_ValorTotal ;
   private String[] H001T5_A525TDet_Atributos ;
   private long[] H001T6_A33Tipo_Codigo ;
   private String[] H001T6_A66Elem_Consecutivo ;
   private String[] H001T6_A557Elem_Descripcion ;
   private String[] H001T6_A74TIP_Codigo ;
   private String[] H001T6_A75SEG_Codigo ;
   private String[] H001T6_A298Cata_Descripcion ;
   private String[] H001T6_A35FAM_Codigo ;
   private String[] H001T6_A34Clas_Codigo ;
   private String[] H001T6_A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtSDTDetalleTrn AV29SDTDetalleTrn ;
   private com.orions2.SdtSDTDetalleTrn GXv_SdtSDTDetalleTrn1[] ;
}

final  class wpcon_ent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001T2", "SELECT Tran_Id, Tran_ValorTransaccion FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001T3", "SELECT T2.Cata_Codigo, T1.Tran_Id, T1.TDet_Cantidad, T1.Elem_Consecutivo, T1.TDet_Consecutivo, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T3.Cata_Descripcion, T1.TDet_Atributos, T1.TDet_Otros_Costos FROM ((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001T4", "SELECT T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T2.Tipo_Codigo AS Tran_CodTipoElemento, T1.Tran_ConsecutivoCC, T1.Tran_FechaRegistro, T1.Tran_Estado FROM (ALM_TRANSACCION T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001T5", "SELECT TDet_Consecutivo, Tran_Id, TDet_ValorTotal, TDet_Atributos FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001T6", "SELECT T1.Tipo_Codigo, T1.Elem_Consecutivo, T1.Elem_Descripcion, T5.TIP_Codigo, T4.SEG_Codigo, T2.Cata_Descripcion, T3.FAM_Codigo, T2.Clas_Codigo, T1.Cata_Codigo FROM ((((ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) INNER JOIN ALM_CLASE T3 ON T3.Clas_Codigo = T2.Clas_Codigo) INNER JOIN ALM_CAT_FAM T4 ON T4.FAM_Codigo = T3.FAM_Codigo) INNER JOIN ALM_CAT_SEG T5 ON T5.SEG_Codigo = T4.SEG_Codigo) WHERE (T1.Elem_Consecutivo = ?) AND (T1.Tipo_Codigo = ?) ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((String[]) buf[7])[0] = rslt.getString(6, 1) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
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
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

