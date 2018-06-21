/*
               File: selecinventariodevolutivo_impl
        Description: Seleccionar Inventario Devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:11.51
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

public final  class selecinventariodevolutivo_impl extends GXDataArea
{
   public selecinventariodevolutivo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selecinventariodevolutivo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecinventariodevolutivo_impl.class ));
   }

   public selecinventariodevolutivo_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavTodos = UIFactory.getCheckbox(this);
      chkavCtlinvd_seleccion = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_114 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_114_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_114_idx = httpContext.GetNextPar( ) ;
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
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows) ;
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
            AV52Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_Id", GXutil.ltrim( GXutil.str( AV52Tran_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Regi_Id", GXutil.ltrim( GXutil.str( AV9Regi_Id, 11, 0)));
               AV8Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
               AV6Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
               AV5Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
               AV7Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
               AV42Tran_IdCuentadanteOrigen = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV42Tran_IdCuentadanteOrigen, 18, 0)));
               AV41Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Tipo_Codigo", GXutil.ltrim( GXutil.str( AV41Tipo_Codigo, 18, 0)));
            }
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
         MasterPageObj = new com.orions2.rwdpromptmasterpage_impl (remoteHandle, context.copy());
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
      pa6J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141421121");
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selecinventariodevolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV52Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV6Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV5Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV42Tran_IdCuentadanteOrigen,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tipo_Codigo,18,0)))+"\">") ;
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtinvdevosel", AV43SDTInvDevoSel);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtinvdevosel", AV43SDTInvDevoSel);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_114", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_114, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTINVDEVOSEL", AV43SDTInvDevoSel);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTINVDEVOSEL", AV43SDTInvDevoSel);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV52Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV41Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( AV42Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV7Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV5Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV6Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV9Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVERCONSECUTIVO", AV60VerConsecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVERPLACA", AV59VerPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAADQUISICION", localUtil.dtoc( A466Invd_FechaAdquisicion, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMARCA", AV28Marca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODELO", AV29Modelo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSERIAL", AV35Serial);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV30Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV38Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV39Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( AV62Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_NUMEROPLACA", AV45Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV47Elem_consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDESCRIPCION", AV48Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_PLACAPADRE", AV49Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_FECHAADQUISICION", localUtil.dtoc( AV50Invd_FechaAdquisicion, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCOSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( AV51Costo_Total_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_numeroplacafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_DESCRIPCIONIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_descripcionidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADREFILTERCONTAINER_Class", GXutil.rtrim( divInvd_placapadrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_TRANFILTERCONTAINER_Class", GXutil.rtrim( divInvd_tranfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_fechafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MARCAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_marcafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODELOFILTERCONTAINER_Class", GXutil.rtrim( divInvd_modelofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_SERIALFILTERCONTAINER_Class", GXutil.rtrim( divInvd_serialfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we6J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6J2( ) ;
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
      return formatLink("com.orions2.selecinventariodevolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV52Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV6Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV5Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV42Tran_IdCuentadanteOrigen,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tipo_Codigo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "SelecInventarioDevolutivo" ;
   }

   public String getPgmdesc( )
   {
      return "Seleccionar Inventario Devolutivo" ;
   }

   public void wb6J0( )
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
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-1 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_numeroplacafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_numeroplacafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_numeroplacafilter_Internalname, "Número de placa", "", "", lblLblinvd_numeroplacafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_numeroplaca_Internalname, "Numero de Placa", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_numeroplaca_Internalname, AV19cInvd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV19cInvd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_numeroplaca_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_numeroplaca_Visible, edtavCinvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_descripcionidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_descripcionidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_descripcionidfilter_Internalname, "Descripción", "", "", lblLblinvd_descripcionidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_descripciondevolutivo_Internalname, "Descripcion Devolutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCinvd_descripciondevolutivo_Internalname, AV16cInvd_DescripcionDevolutivo, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), edtavCinvd_descripciondevolutivo_Visible, edtavCinvd_descripciondevolutivo_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e136j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV12cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV12cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_tranfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_tranfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltranfilter_Internalname, "Transacción", "", "", lblLbltranfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e146j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV61cTran_Id, (byte)(11), (byte)(0), ",", "")), ((edtavCtran_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61cTran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV61cTran_Id), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_id_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_id_Visible, edtavCtran_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_placapadrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_placapadrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_placapadrefilter_Internalname, "Placa Padre", "", "", lblLblinvd_placapadrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e156j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_placapadre_Internalname, "Placa Padre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_placapadre_Internalname, AV20cInvd_PlacaPadre, GXutil.rtrim( localUtil.format( AV20cInvd_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_placapadre_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_placapadre_Visible, edtavCinvd_placapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_fechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_fechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfechafilter_Internalname, "Fecha de Adquisición", "", "", lblLblfechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e166j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_fechaadquisicion_Internalname, "Fecha Adquisicion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCinvd_fechaadquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_fechaadquisicion_Internalname, localUtil.format(AV17cInvd_FechaAdquisicion, "99/99/99"), localUtil.format( AV17cInvd_FechaAdquisicion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_fechaadquisicion_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_fechaadquisicion_Visible, edtavCinvd_fechaadquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCinvd_fechaadquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCinvd_fechaadquisicion_Visible==0)||(edtavCinvd_fechaadquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SelecInventarioDevolutivo.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_marcafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_marcafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcafilter_Internalname, "Marca", "", "", lblLblmarcafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e176j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCmarca_Internalname, "Marca", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmarca_Internalname, AV23cMarca, GXutil.rtrim( localUtil.format( AV23cMarca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarca_Jsonclick, 0, "Attribute", "", "", "", edtavCmarca_Visible, edtavCmarca_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_modelofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_modelofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmodelofilter_Internalname, "Modelo", "", "", lblLblmodelofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e186j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCmodelo_Internalname, "Modelo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmodelo_Internalname, AV24cModelo, GXutil.rtrim( localUtil.format( AV24cModelo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmodelo_Jsonclick, 0, "Attribute", "", "", "", edtavCmodelo_Visible, edtavCmodelo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_serialfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_serialfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblserialfilter_Internalname, "Serial", "", "", lblLblserialfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e196j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCserial_Internalname, "Serial", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCserial_Internalname, AV25cSerial, GXutil.rtrim( localUtil.format( AV25cSerial, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserial_Jsonclick, 0, "Attribute", "", "", "", edtavCserial_Visible, edtavCserial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-10 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e206j1_client"+"'", TempTags, "", 2, "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodos.getInternalname(), "Seleccionar Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodos.getInternalname(), GXutil.booltostr( AV56Todos), "", "Seleccionar Todos", 1, chkavTodos.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(108, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"114\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+""+"\" "+" width="+GXutil.ltrim( GXutil.str( 30, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"ActionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Trans.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Serial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 120, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Total") ;
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
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlinvd_numeroplaca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltran_consecutivocc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlelem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlinvd_placapadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlmodelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlserial_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlobservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlinvd_fechaadquisicion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcosto_total_dev_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 114 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_114 = (short)(nGXsfl_114_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            AV65GXV1 = nGXsfl_114_idx ;
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregarbienes_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", "Agregar bienes", bttAgregarbienes_Jsonclick, 5, "Agregar bienes", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR BIENES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelecInventarioDevolutivo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Seleccionar Inventario Devolutivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6J0( ) ;
   }

   public void ws6J2( )
   {
      start6J2( ) ;
      evt6J2( ) ;
   }

   public void evt6J2( )
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
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR BIENES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar bienes' */
                           e216J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCINVD_NUMEROPLACA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e226J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCINVD_DESCRIPCIONDEVOLUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e236J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCELEM_CONSECUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e246J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCINVD_PLACAPADRE.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e256J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCINVD_FECHAADQUISICION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e266J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCMARCA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e276J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCMODELO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e286J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCSERIAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e296J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTODOS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e306J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCTRAN_ID.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e316J2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_114_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1142( ) ;
                           AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
                           if ( ( AV43SDTInvDevoSel.size() >= AV65GXV1 ) && ( AV65GXV1 > 0 ) )
                           {
                              AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e326J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e336J2 ();
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

   public void we6J2( )
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

   public void pa6J2( )
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
         chkavTodos.setName( "vTODOS" );
         chkavTodos.setWebtags( "" );
         chkavTodos.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodos.getInternalname(), "TitleCaption", chkavTodos.getCaption(), true);
         chkavTodos.setCheckedValue( "false" );
         GXCCtl = "CTLINVD_SELECCION_" + sGXsfl_114_idx ;
         chkavCtlinvd_seleccion.setName( GXCCtl );
         chkavCtlinvd_seleccion.setWebtags( "" );
         chkavCtlinvd_seleccion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavCtlinvd_seleccion.getInternalname(), "TitleCaption", chkavCtlinvd_seleccion.getCaption(), !bGXsfl_114_Refreshing);
         chkavCtlinvd_seleccion.setCheckedValue( "0" );
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
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
      subsflControlProps_1142( ) ;
      while ( nGXsfl_114_idx <= nRC_GXsfl_114 )
      {
         sendrow_1142( ) ;
         nGXsfl_114_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_114_idx+1)) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf6J2( ) ;
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
      rf6J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlinvd_numeroplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_numeroplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_numeroplaca_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtltran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_consecutivocc_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlinvd_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_placapadre_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmarca_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmodelo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlserial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlserial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlserial_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlobservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlobservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlobservaciones_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlinvd_fechaadquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_fechaadquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_fechaadquisicion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlcosto_total_dev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcosto_total_dev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcosto_total_dev_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
   }

   public void rf6J2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(114) ;
      nGXsfl_114_idx = (short)(1) ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
      bGXsfl_114_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1142( ) ;
         e336J2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_114_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e336J2 ();
         }
         wbEnd = (short)(114) ;
         wb6J0( ) ;
      }
      bGXsfl_114_Refreshing = true ;
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
      return AV43SDTInvDevoSel.size() ;
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
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6J0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtlinvd_numeroplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_numeroplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_numeroplaca_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtltran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_consecutivocc_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlinvd_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_placapadre_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmarca_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmodelo_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlserial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlserial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlserial_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlobservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlobservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlobservaciones_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlinvd_fechaadquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlinvd_fechaadquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlinvd_fechaadquisicion_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      edtavCtlcosto_total_dev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcosto_total_dev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcosto_total_dev_Enabled, 5, 0)), !bGXsfl_114_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e326J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtinvdevosel"), AV43SDTInvDevoSel);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTINVDEVOSEL"), AV43SDTInvDevoSel);
         /* Read variables values. */
         AV19cInvd_NumeroPlaca = httpContext.cgiGet( edtavCinvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cInvd_NumeroPlaca", AV19cInvd_NumeroPlaca);
         AV16cInvd_DescripcionDevolutivo = httpContext.cgiGet( edtavCinvd_descripciondevolutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16cInvd_DescripcionDevolutivo", AV16cInvd_DescripcionDevolutivo);
         AV12cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cElem_Consecutivo", AV12cElem_Consecutivo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_ID");
            GX_FocusControl = edtavCtran_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61cTran_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61cTran_Id", GXutil.ltrim( GXutil.str( AV61cTran_Id, 11, 0)));
         }
         else
         {
            AV61cTran_Id = localUtil.ctol( httpContext.cgiGet( edtavCtran_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61cTran_Id", GXutil.ltrim( GXutil.str( AV61cTran_Id, 11, 0)));
         }
         AV20cInvd_PlacaPadre = httpContext.cgiGet( edtavCinvd_placapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cInvd_PlacaPadre", AV20cInvd_PlacaPadre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCINVD_FECHAADQUISICION");
            GX_FocusControl = edtavCinvd_fechaadquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17cInvd_FechaAdquisicion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_FechaAdquisicion", localUtil.format(AV17cInvd_FechaAdquisicion, "99/99/99"));
         }
         else
         {
            AV17cInvd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_FechaAdquisicion", localUtil.format(AV17cInvd_FechaAdquisicion, "99/99/99"));
         }
         AV23cMarca = httpContext.cgiGet( edtavCmarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23cMarca", AV23cMarca);
         AV24cModelo = httpContext.cgiGet( edtavCmodelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24cModelo", AV24cModelo);
         AV25cSerial = httpContext.cgiGet( edtavCserial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25cSerial", AV25cSerial);
         AV56Todos = GXutil.strtobool( httpContext.cgiGet( chkavTodos.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Todos", AV56Todos);
         /* Read saved values. */
         nRC_GXsfl_114 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_114"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         nRC_GXsfl_114 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_114"), ",", ".")) ;
         nGXsfl_114_fel_idx = (short)(0) ;
         while ( nGXsfl_114_fel_idx < nRC_GXsfl_114 )
         {
            nGXsfl_114_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_114_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_114_fel_idx+1)) ;
            sGXsfl_114_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1142( ) ;
            AV65GXV1 = (short)(nGXsfl_114_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV43SDTInvDevoSel.size() >= AV65GXV1 ) && ( AV65GXV1 > 0 ) )
            {
               AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
            }
         }
         if ( nGXsfl_114_fel_idx == 0 )
         {
            nGXsfl_114_idx = (short)(1) ;
            sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1142( ) ;
         }
         nGXsfl_114_fel_idx = (short)(1) ;
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

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e326J2 ();
      if (returnInSub) return;
   }

   public void e326J2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Inventario Devolutivo", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV10ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      subGrid1_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOAD' Routine */
      AV43SDTInvDevoSel.clear();
      gx_BV114 = true ;
      /* Using cursor H006J2 */
      pr_default.execute(0, new Object[] {new Long(AV9Regi_Id), new Long(AV8Cent_Id), AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, new Long(AV42Tran_IdCuentadanteOrigen), new Long(AV41Tipo_Codigo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H006J2_A37Cata_Codigo[0] ;
         A463Invd_Estado = H006J2_A463Invd_Estado[0] ;
         n463Invd_Estado = H006J2_n463Invd_Estado[0] ;
         A33Tipo_Codigo = H006J2_A33Tipo_Codigo[0] ;
         A43Cuen_Identificacion = H006J2_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = H006J2_n43Cuen_Identificacion[0] ;
         A414Invd_BodegaCodigo = H006J2_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = H006J2_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = H006J2_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = H006J2_A411Invd_CentroCostoId[0] ;
         A410Invd_RegionalId = H006J2_A410Invd_RegionalId[0] ;
         A66Elem_Consecutivo = H006J2_A66Elem_Consecutivo[0] ;
         A298Cata_Descripcion = H006J2_A298Cata_Descripcion[0] ;
         A68Invd_PlacaPadre = H006J2_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H006J2_n68Invd_PlacaPadre[0] ;
         A466Invd_FechaAdquisicion = H006J2_A466Invd_FechaAdquisicion[0] ;
         n466Invd_FechaAdquisicion = H006J2_n466Invd_FechaAdquisicion[0] ;
         A629Costo_Total_Dev = H006J2_A629Costo_Total_Dev[0] ;
         A67Invd_NumeroPlaca = H006J2_A67Invd_NumeroPlaca[0] ;
         A37Cata_Codigo = H006J2_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = H006J2_A33Tipo_Codigo[0] ;
         A298Cata_Descripcion = H006J2_A298Cata_Descripcion[0] ;
         AV45Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Invd_NumeroPlaca", AV45Invd_NumeroPlaca);
         AV47Elem_consecutivo = A66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Elem_consecutivo", AV47Elem_consecutivo);
         AV48Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Descripcion", AV48Descripcion);
         AV49Invd_PlacaPadre = A68Invd_PlacaPadre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Invd_PlacaPadre", AV49Invd_PlacaPadre);
         AV50Invd_FechaAdquisicion = A466Invd_FechaAdquisicion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Invd_FechaAdquisicion", localUtil.format(AV50Invd_FechaAdquisicion, "99/99/99"));
         AV51Costo_Total_Dev = A629Costo_Total_Dev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Costo_Total_Dev", GXutil.ltrim( GXutil.str( AV51Costo_Total_Dev, 18, 2)));
         GXv_char1[0] = AV45Invd_NumeroPlaca ;
         GXv_char2[0] = AV28Marca ;
         GXv_char3[0] = AV29Modelo ;
         GXv_char4[0] = AV35Serial ;
         GXv_char5[0] = AV30Observaciones ;
         GXv_int6[0] = AV38Tran_IdEntrada ;
         GXv_int7[0] = AV39Nro_Linea ;
         new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
         selecinventariodevolutivo_impl.this.AV45Invd_NumeroPlaca = GXv_char1[0] ;
         selecinventariodevolutivo_impl.this.AV28Marca = GXv_char2[0] ;
         selecinventariodevolutivo_impl.this.AV29Modelo = GXv_char3[0] ;
         selecinventariodevolutivo_impl.this.AV35Serial = GXv_char4[0] ;
         selecinventariodevolutivo_impl.this.AV30Observaciones = GXv_char5[0] ;
         selecinventariodevolutivo_impl.this.AV38Tran_IdEntrada = GXv_int6[0] ;
         selecinventariodevolutivo_impl.this.AV39Nro_Linea = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Invd_NumeroPlaca", AV45Invd_NumeroPlaca);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Marca", AV28Marca);
         httpContext.ajax_rsp_assign_attri("", false, "AV29Modelo", AV29Modelo);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Serial", AV35Serial);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Observaciones", AV30Observaciones);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV38Tran_IdEntrada, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Nro_Linea", GXutil.ltrim( GXutil.str( AV39Nro_Linea, 8, 0)));
         /* Execute user subroutine: 'TRANSACCION' */
         S133 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            /* Execute user subroutine: 'CARGA SDT' */
            S143 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( AV62Tran_ConsecutivoCC == AV61cTran_Id )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV19cInvd_NumeroPlaca, "") != 0 ) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV45Invd_NumeroPlaca, AV19cInvd_NumeroPlaca) == 0 ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && ( GXutil.strcmp(AV20cInvd_PlacaPadre, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV49Invd_PlacaPadre, AV20cInvd_PlacaPadre) == 0 ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && ( AV61cTran_Id != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) && ( AV62Tran_ConsecutivoCC == AV61cTran_Id ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && ( GXutil.strcmp(AV16cInvd_DescripcionDevolutivo, "") != 0 ) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.like( GXutil.upper( AV48Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && (GXutil.strcmp("", AV25cSerial)==0) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && (GXutil.strcmp("", AV24cModelo)==0) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && (GXutil.strcmp("", AV23cMarca)==0) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && ( GXutil.strcmp(AV12cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && GXutil.dateCompare(GXutil.nullDate(), AV17cInvd_FechaAdquisicion) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( ( GXutil.strcmp(AV47Elem_consecutivo, AV12cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV19cInvd_NumeroPlaca)==0) && (GXutil.strcmp("", AV16cInvd_DescripcionDevolutivo)==0) && (GXutil.strcmp("", AV12cElem_Consecutivo)==0) && (GXutil.strcmp("", AV20cInvd_PlacaPadre)==0) && !( GXutil.dateCompare(AV17cInvd_FechaAdquisicion, GXutil.nullDate()) ) && ( GXutil.strcmp(AV23cMarca, "") != 0 ) && ( GXutil.strcmp(AV24cModelo, "") != 0 ) && ( GXutil.strcmp(AV25cSerial, "") != 0 ) && (0==AV61cTran_Id) )
         {
            if ( GXutil.dateCompare(AV50Invd_FechaAdquisicion, AV17cInvd_FechaAdquisicion) && GXutil.like( GXutil.upper( AV28Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cSerial), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S143( )
   {
      /* 'CARGA SDT' Routine */
      AV44SDTInvDevoSelItem = (com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)new com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem(remoteHandle, context);
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca( AV45Invd_NumeroPlaca );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo( AV47Elem_consecutivo );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion( AV48Descripcion );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre( AV49Invd_PlacaPadre );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion( AV50Invd_FechaAdquisicion );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca( AV28Marca );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo( AV29Modelo );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial( AV35Serial );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones( AV30Observaciones );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada( AV38Tran_IdEntrada );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea( AV39Nro_Linea );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev( AV51Costo_Total_Dev );
      AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc( AV62Tran_ConsecutivoCC );
      if ( AV56Todos )
      {
         AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion( "1" );
      }
      else
      {
         AV44SDTInvDevoSelItem.setgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion( "0" );
      }
      AV43SDTInvDevoSel.add(AV44SDTInvDevoSelItem, 0);
      gx_BV114 = true ;
   }

   public void e216J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* 'Agregar bienes' Routine */
      AV57Error = "N" ;
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV43SDTInvDevoSel.size() )
      {
         AV44SDTInvDevoSelItem = (com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV79GXV2));
         if ( GXutil.strcmp(AV44SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion(), "1") == 0 )
         {
            AV59VerPlaca = AV44SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59VerPlaca", AV59VerPlaca);
            AV60VerConsecutivo = AV44SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60VerConsecutivo", AV60VerConsecutivo);
            /* Execute user subroutine: 'VALIDA PLACA' */
            S122 ();
            if (returnInSub) return;
            if ( GXutil.strcmp(AV57Error, "N") == 0 )
            {
               GXv_int6[0] = AV52Tran_Id ;
               GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem8[0] = AV43SDTInvDevoSel ;
               new com.orions2.psalidadevmultiple(remoteHandle, context).execute( GXv_int6, GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem8) ;
               selecinventariodevolutivo_impl.this.AV52Tran_Id = GXv_int6[0] ;
               AV43SDTInvDevoSel = GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem8[0] ;
               gx_BV114 = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_Id", GXutil.ltrim( GXutil.str( AV52Tran_Id, 11, 0)));
               httpContext.setWebReturnParms(new Object[] {new Long(AV52Tran_Id),new Long(AV9Regi_Id),new Long(AV8Cent_Id),AV6Alma_Modulo,AV5Alma_Codigo,AV7Bode_Codigo,new Long(AV42Tran_IdCuentadanteOrigen),new Long(AV41Tipo_Codigo)});
               httpContext.wjLocDisableFrm = (byte)(1) ;
               httpContext.nUserReturn = (byte)(1) ;
               returnInSub = true;
               if (true) return;
            }
         }
         AV79GXV2 = (int)(AV79GXV2+1) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e226J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cinvd_numeroplaca_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e236J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cinvd_descripciondevolutivo_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e246J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Celem_consecutivo_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e256J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cinvd_placapadre_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e266J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cinvd_fechaadquisicion_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e276J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cmarca_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e286J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cmodelo_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e296J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Cserial_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e306J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Todos_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void e316J2( )
   {
      AV65GXV1 = (short)(nGXsfl_114_idx+GRID1_nFirstRecordOnPage) ;
      if ( AV43SDTInvDevoSel.size() >= AV65GXV1 )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
      }
      /* Ctran_id_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43SDTInvDevoSel", AV43SDTInvDevoSel);
      nGXsfl_114_bak_idx = nGXsfl_114_idx ;
      gxgrgrid1_refresh( subGrid1_Rows) ;
      nGXsfl_114_idx = nGXsfl_114_bak_idx ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
   }

   public void S122( )
   {
      /* 'VALIDA PLACA' Routine */
      /* Using cursor H006J3 */
      pr_default.execute(1, new Object[] {AV60VerConsecutivo, AV59VerPlaca});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A67Invd_NumeroPlaca = H006J3_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = H006J3_A66Elem_Consecutivo[0] ;
         A463Invd_Estado = H006J3_A463Invd_Estado[0] ;
         n463Invd_Estado = H006J3_n463Invd_Estado[0] ;
         if ( GXutil.strcmp(A463Invd_Estado, "P") == 0 )
         {
            AV57Error = "S" ;
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Una de las placas seleccionadas se encuentra en otro movimiento" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            /* Execute user subroutine: 'LOAD' */
            S112 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S133( )
   {
      /* 'TRANSACCION' Routine */
      AV62Tran_ConsecutivoCC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV62Tran_ConsecutivoCC, 18, 0)));
      /* Using cursor H006J4 */
      pr_default.execute(2, new Object[] {new Long(AV38Tran_IdEntrada)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A46Tran_Id = H006J4_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = H006J4_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H006J4_n513Tran_ConsecutivoCC[0] ;
         AV62Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV62Tran_ConsecutivoCC, 18, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   private void e336J2( )
   {
      /* Grid1_Load Routine */
      AV65GXV1 = (short)(1) ;
      while ( AV65GXV1 <= AV43SDTInvDevoSel.size() )
      {
         AV43SDTInvDevoSel.currentItem( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(114) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1142( ) ;
            GRID1_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_114_Refreshing )
         {
            httpContext.doAjaxLoad(114, Grid1Row);
         }
         AV65GXV1 = (short)(AV65GXV1+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV52Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Tran_Id", GXutil.ltrim( GXutil.str( AV52Tran_Id, 11, 0)));
      AV9Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Regi_Id", GXutil.ltrim( GXutil.str( AV9Regi_Id, 11, 0)));
      AV8Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      AV6Alma_Modulo = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      AV5Alma_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      AV7Bode_Codigo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
      AV42Tran_IdCuentadanteOrigen = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV42Tran_IdCuentadanteOrigen, 18, 0)));
      AV41Tipo_Codigo = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipo_Codigo", GXutil.ltrim( GXutil.str( AV41Tipo_Codigo, 18, 0)));
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
      pa6J2( ) ;
      ws6J2( ) ;
      we6J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414211691");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selecinventariodevolutivo.js", "?201861414211691");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1142( )
   {
      chkavCtlinvd_seleccion.setInternalname( "CTLINVD_SELECCION_"+sGXsfl_114_idx );
      edtavCtlinvd_numeroplaca_Internalname = "CTLINVD_NUMEROPLACA_"+sGXsfl_114_idx ;
      edtavCtltran_consecutivocc_Internalname = "CTLTRAN_CONSECUTIVOCC_"+sGXsfl_114_idx ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_114_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_114_idx ;
      edtavCtlinvd_placapadre_Internalname = "CTLINVD_PLACAPADRE_"+sGXsfl_114_idx ;
      edtavCtlmarca_Internalname = "CTLMARCA_"+sGXsfl_114_idx ;
      edtavCtlmodelo_Internalname = "CTLMODELO_"+sGXsfl_114_idx ;
      edtavCtlserial_Internalname = "CTLSERIAL_"+sGXsfl_114_idx ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES_"+sGXsfl_114_idx ;
      edtavCtlinvd_fechaadquisicion_Internalname = "CTLINVD_FECHAADQUISICION_"+sGXsfl_114_idx ;
      edtavCtlcosto_total_dev_Internalname = "CTLCOSTO_TOTAL_DEV_"+sGXsfl_114_idx ;
   }

   public void subsflControlProps_fel_1142( )
   {
      chkavCtlinvd_seleccion.setInternalname( "CTLINVD_SELECCION_"+sGXsfl_114_fel_idx );
      edtavCtlinvd_numeroplaca_Internalname = "CTLINVD_NUMEROPLACA_"+sGXsfl_114_fel_idx ;
      edtavCtltran_consecutivocc_Internalname = "CTLTRAN_CONSECUTIVOCC_"+sGXsfl_114_fel_idx ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_114_fel_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_114_fel_idx ;
      edtavCtlinvd_placapadre_Internalname = "CTLINVD_PLACAPADRE_"+sGXsfl_114_fel_idx ;
      edtavCtlmarca_Internalname = "CTLMARCA_"+sGXsfl_114_fel_idx ;
      edtavCtlmodelo_Internalname = "CTLMODELO_"+sGXsfl_114_fel_idx ;
      edtavCtlserial_Internalname = "CTLSERIAL_"+sGXsfl_114_fel_idx ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES_"+sGXsfl_114_fel_idx ;
      edtavCtlinvd_fechaadquisicion_Internalname = "CTLINVD_FECHAADQUISICION_"+sGXsfl_114_fel_idx ;
      edtavCtlcosto_total_dev_Internalname = "CTLCOSTO_TOTAL_DEV_"+sGXsfl_114_fel_idx ;
   }

   public void sendrow_1142( )
   {
      subsflControlProps_1142( ) ;
      wb6J0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_114_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_114_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_114_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavCtlinvd_seleccion.getEnabled()!=0)&&(chkavCtlinvd_seleccion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_114_idx+"',114)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlinvd_seleccion.getInternalname(),((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion(),"","",new Integer(-1),new Integer(1),"1","",StyleString,ClassString,"WWColumn",TempTags+((chkavCtlinvd_seleccion.getEnabled()!=0)&&(chkavCtlinvd_seleccion.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(115, this, '1', '0');gx.evt.onchange(this);\" " : " ")+((chkavCtlinvd_seleccion.getEnabled()!=0)&&(chkavCtlinvd_seleccion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " ")});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "ActionAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlinvd_numeroplaca_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlinvd_numeroplaca_Jsonclick,new Integer(0),"ActionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlinvd_numeroplaca_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltran_consecutivocc_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc(), (byte)(18), (byte)(0), ",", "")),((edtavCtltran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltran_consecutivocc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtltran_consecutivocc_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlelem_consecutivo_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlelem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlelem_consecutivo_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcata_descripcion_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcata_descripcion_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlinvd_placapadre_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlinvd_placapadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlinvd_placapadre_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlmarca_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlmarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlmarca_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlmodelo_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlmodelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlmodelo_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlserial_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlserial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlserial_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlobservaciones_Internalname,((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlobservaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlobservaciones_Enabled),new Integer(0),"text","",new Integer(120),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlinvd_fechaadquisicion_Internalname,localUtil.format(((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion(), "99/99/99"),localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlinvd_fechaadquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlinvd_fechaadquisicion_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcosto_total_dev_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev(), (byte)(24), (byte)(2), ",", "")),((edtavCtlcosto_total_dev_Enabled!=0) ? GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcosto_total_dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcosto_total_dev_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(114),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLINVD_NUMEROPLACA"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTRAN_CONSECUTIVOCC"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_consecutivocc()), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLELEM_CONSECUTIVO"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCATA_DESCRIPCION"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Cata_descripcion(), "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLINVD_PLACAPADRE"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_placapadre(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLMARCA"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Marca(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLMODELO"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Modelo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLSERIAL"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Serial(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLOBSERVACIONES"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLINVD_FECHAADQUISICION"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_fechaadquisicion()));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCOSTO_TOTAL_DEV"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, localUtil.format( ((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV43SDTInvDevoSel.elementAt(-1+AV65GXV1)).getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_114_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_114_idx+1)) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_114_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      /* End function sendrow_1142 */
   }

   public void init_default_properties( )
   {
      lblLblinvd_numeroplacafilter_Internalname = "LBLINVD_NUMEROPLACAFILTER" ;
      edtavCinvd_numeroplaca_Internalname = "vCINVD_NUMEROPLACA" ;
      divInvd_numeroplacafiltercontainer_Internalname = "INVD_NUMEROPLACAFILTERCONTAINER" ;
      lblLblinvd_descripcionidfilter_Internalname = "LBLINVD_DESCRIPCIONIDFILTER" ;
      edtavCinvd_descripciondevolutivo_Internalname = "vCINVD_DESCRIPCIONDEVOLUTIVO" ;
      divInvd_descripcionidfiltercontainer_Internalname = "INVD_DESCRIPCIONIDFILTERCONTAINER" ;
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      lblLbltranfilter_Internalname = "LBLTRANFILTER" ;
      edtavCtran_id_Internalname = "vCTRAN_ID" ;
      divInvd_tranfiltercontainer_Internalname = "INVD_TRANFILTERCONTAINER" ;
      lblLblinvd_placapadrefilter_Internalname = "LBLINVD_PLACAPADREFILTER" ;
      edtavCinvd_placapadre_Internalname = "vCINVD_PLACAPADRE" ;
      divInvd_placapadrefiltercontainer_Internalname = "INVD_PLACAPADREFILTERCONTAINER" ;
      lblLblfechafilter_Internalname = "LBLFECHAFILTER" ;
      edtavCinvd_fechaadquisicion_Internalname = "vCINVD_FECHAADQUISICION" ;
      divInvd_fechafiltercontainer_Internalname = "INVD_FECHAFILTERCONTAINER" ;
      lblLblmarcafilter_Internalname = "LBLMARCAFILTER" ;
      edtavCmarca_Internalname = "vCMARCA" ;
      divInvd_marcafiltercontainer_Internalname = "INVD_MARCAFILTERCONTAINER" ;
      lblLblmodelofilter_Internalname = "LBLMODELOFILTER" ;
      edtavCmodelo_Internalname = "vCMODELO" ;
      divInvd_modelofiltercontainer_Internalname = "INVD_MODELOFILTERCONTAINER" ;
      lblLblserialfilter_Internalname = "LBLSERIALFILTER" ;
      edtavCserial_Internalname = "vCSERIAL" ;
      divInvd_serialfiltercontainer_Internalname = "INVD_SERIALFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      chkavTodos.setInternalname( "vTODOS" );
      divTable1_Internalname = "TABLE1" ;
      chkavCtlinvd_seleccion.setInternalname( "CTLINVD_SELECCION" );
      edtavCtlinvd_numeroplaca_Internalname = "CTLINVD_NUMEROPLACA" ;
      edtavCtltran_consecutivocc_Internalname = "CTLTRAN_CONSECUTIVOCC" ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO" ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION" ;
      edtavCtlinvd_placapadre_Internalname = "CTLINVD_PLACAPADRE" ;
      edtavCtlmarca_Internalname = "CTLMARCA" ;
      edtavCtlmodelo_Internalname = "CTLMODELO" ;
      edtavCtlserial_Internalname = "CTLSERIAL" ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES" ;
      edtavCtlinvd_fechaadquisicion_Internalname = "CTLINVD_FECHAADQUISICION" ;
      edtavCtlcosto_total_dev_Internalname = "CTLCOSTO_TOTAL_DEV" ;
      divTable2_Internalname = "TABLE2" ;
      bttAgregarbienes_Internalname = "AGREGARBIENES" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      divMain_Internalname = "MAIN" ;
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
      edtavCtlcosto_total_dev_Jsonclick = "" ;
      edtavCtlinvd_fechaadquisicion_Jsonclick = "" ;
      edtavCtlobservaciones_Jsonclick = "" ;
      edtavCtlserial_Jsonclick = "" ;
      edtavCtlmodelo_Jsonclick = "" ;
      edtavCtlmarca_Jsonclick = "" ;
      edtavCtlinvd_placapadre_Jsonclick = "" ;
      edtavCtlcata_descripcion_Jsonclick = "" ;
      edtavCtlelem_consecutivo_Jsonclick = "" ;
      edtavCtltran_consecutivocc_Jsonclick = "" ;
      edtavCtlinvd_numeroplaca_Jsonclick = "" ;
      chkavCtlinvd_seleccion.setVisible( -1 );
      chkavCtlinvd_seleccion.setEnabled( 1 );
      edtavCtlcosto_total_dev_Enabled = -1 ;
      edtavCtlinvd_fechaadquisicion_Enabled = -1 ;
      edtavCtlobservaciones_Enabled = -1 ;
      edtavCtlserial_Enabled = -1 ;
      edtavCtlmodelo_Enabled = -1 ;
      edtavCtlmarca_Enabled = -1 ;
      edtavCtlinvd_placapadre_Enabled = -1 ;
      edtavCtlcata_descripcion_Enabled = -1 ;
      edtavCtlelem_consecutivo_Enabled = -1 ;
      edtavCtltran_consecutivocc_Enabled = -1 ;
      edtavCtlinvd_numeroplaca_Enabled = -1 ;
      chkavCtlinvd_seleccion.setCaption( "" );
      chkavTodos.setCaption( "Seleccionar Todos" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlcosto_total_dev_Enabled = 0 ;
      edtavCtlinvd_fechaadquisicion_Enabled = 0 ;
      edtavCtlobservaciones_Enabled = 0 ;
      edtavCtlserial_Enabled = 0 ;
      edtavCtlmodelo_Enabled = 0 ;
      edtavCtlmarca_Enabled = 0 ;
      edtavCtlinvd_placapadre_Enabled = 0 ;
      edtavCtlcata_descripcion_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      edtavCtltran_consecutivocc_Enabled = 0 ;
      edtavCtlinvd_numeroplaca_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavTodos.setEnabled( 1 );
      edtavCserial_Jsonclick = "" ;
      edtavCserial_Enabled = 1 ;
      edtavCserial_Visible = 1 ;
      edtavCmodelo_Jsonclick = "" ;
      edtavCmodelo_Enabled = 1 ;
      edtavCmodelo_Visible = 1 ;
      edtavCmarca_Jsonclick = "" ;
      edtavCmarca_Enabled = 1 ;
      edtavCmarca_Visible = 1 ;
      edtavCinvd_fechaadquisicion_Jsonclick = "" ;
      edtavCinvd_fechaadquisicion_Enabled = 1 ;
      edtavCinvd_fechaadquisicion_Visible = 1 ;
      edtavCinvd_placapadre_Jsonclick = "" ;
      edtavCinvd_placapadre_Enabled = 1 ;
      edtavCinvd_placapadre_Visible = 1 ;
      edtavCtran_id_Jsonclick = "" ;
      edtavCtran_id_Enabled = 1 ;
      edtavCtran_id_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      edtavCinvd_descripciondevolutivo_Enabled = 1 ;
      edtavCinvd_descripciondevolutivo_Visible = 1 ;
      edtavCinvd_numeroplaca_Jsonclick = "" ;
      edtavCinvd_numeroplaca_Enabled = 1 ;
      edtavCinvd_numeroplaca_Visible = 1 ;
      divInvd_serialfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_modelofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_marcafiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_fechafiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_tranfiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_placapadrefiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_descripcionidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_numeroplacafiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "error" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Seleccionar Inventario Devolutivo" );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'subGrid1_Rows',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e206J1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLINVD_NUMEROPLACAFILTER.CLICK","{handler:'e116J1',iparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_numeroplaca_Visible',ctrl:'vCINVD_NUMEROPLACA',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_DESCRIPCIONIDFILTER.CLICK","{handler:'e126J1',iparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_descripciondevolutivo_Visible',ctrl:'vCINVD_DESCRIPCIONDEVOLUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_PLACAPADREFILTER.CLICK","{handler:'e156J1',iparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_placapadre_Visible',ctrl:'vCINVD_PLACAPADRE',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e136J1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLTRANFILTER.CLICK","{handler:'e146J1',iparms:[{av:'divInvd_tranfiltercontainer_Class',ctrl:'INVD_TRANFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_tranfiltercontainer_Class',ctrl:'INVD_TRANFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_id_Visible',ctrl:'vCTRAN_ID',prop:'Visible'}]}");
      setEventMetadata("LBLFECHAFILTER.CLICK","{handler:'e166J1',iparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_fechaadquisicion_Visible',ctrl:'vCINVD_FECHAADQUISICION',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAFILTER.CLICK","{handler:'e176J1',iparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'},{av:'edtavCmarca_Visible',ctrl:'vCMARCA',prop:'Visible'}]}");
      setEventMetadata("LBLMODELOFILTER.CLICK","{handler:'e186J1',iparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'},{av:'edtavCmodelo_Visible',ctrl:'vCMODELO',prop:'Visible'}]}");
      setEventMetadata("LBLSERIALFILTER.CLICK","{handler:'e196J1',iparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'},{av:'edtavCserial_Visible',ctrl:'vCSERIAL',prop:'Visible'}]}");
      setEventMetadata("'AGREGAR BIENES'","{handler:'e216J2',iparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV52Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV60VerConsecutivo',fld:'vVERCONSECUTIVO',pic:'',nv:''},{av:'AV59VerPlaca',fld:'vVERPLACA',pic:'',nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV59VerPlaca',fld:'vVERPLACA',pic:'',nv:''},{av:'AV60VerConsecutivo',fld:'vVERCONSECUTIVO',pic:'',nv:''},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV52Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCINVD_NUMEROPLACA.ISVALID","{handler:'e226J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCINVD_DESCRIPCIONDEVOLUTIVO.ISVALID","{handler:'e236J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCELEM_CONSECUTIVO.ISVALID","{handler:'e246J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCINVD_PLACAPADRE.ISVALID","{handler:'e256J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCINVD_FECHAADQUISICION.ISVALID","{handler:'e266J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCMARCA.ISVALID","{handler:'e276J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCMODELO.ISVALID","{handler:'e286J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCSERIAL.ISVALID","{handler:'e296J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VTODOS.ISVALID","{handler:'e306J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VCTRAN_ID.ISVALID","{handler:'e316J2',iparms:[{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV42Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A466Invd_FechaAdquisicion',fld:'INVD_FECHAADQUISICION',pic:'',nv:''},{av:'A629Costo_Total_Dev',fld:'COSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61cTran_Id',fld:'vCTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV24cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV17cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV20cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV12cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV16cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV19cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV56Todos',fld:'vTODOS',pic:'',nv:false},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0}],oparms:[{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null},{av:'AV45Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV47Elem_consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV48Descripcion',fld:'vDESCRIPCION',pic:'@!',nv:''},{av:'AV49Invd_PlacaPadre',fld:'vINVD_PLACAPADRE',pic:'',nv:''},{av:'AV50Invd_FechaAdquisicion',fld:'vINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV51Costo_Total_Dev',fld:'vCOSTO_TOTAL_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV30Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV35Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV28Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV62Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV43SDTInvDevoSel',fld:'vSDTINVDEVOSEL',grid:114,pic:'',nv:null}],oparms:[]}");
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
      wcpOAV6Alma_Modulo = "" ;
      wcpOAV5Alma_Codigo = "" ;
      wcpOAV7Bode_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      AV6Alma_Modulo = "" ;
      AV5Alma_Codigo = "" ;
      AV7Bode_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV43SDTInvDevoSel = new GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>(com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem.class, "SDTInvDevoSel.SDTInvDevoSelItem", "ACBSENA", remoteHandle);
      A66Elem_Consecutivo = "" ;
      A67Invd_NumeroPlaca = "" ;
      AV60VerConsecutivo = "" ;
      AV59VerPlaca = "" ;
      A463Invd_Estado = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A298Cata_Descripcion = "" ;
      A68Invd_PlacaPadre = "" ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      AV28Marca = "" ;
      AV29Modelo = "" ;
      AV35Serial = "" ;
      AV30Observaciones = "" ;
      AV45Invd_NumeroPlaca = "" ;
      AV47Elem_consecutivo = "" ;
      AV48Descripcion = "" ;
      AV49Invd_PlacaPadre = "" ;
      AV50Invd_FechaAdquisicion = GXutil.nullDate() ;
      AV51Costo_Total_Dev = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblinvd_numeroplacafilter_Jsonclick = "" ;
      TempTags = "" ;
      AV19cInvd_NumeroPlaca = "" ;
      lblLblinvd_descripcionidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV16cInvd_DescripcionDevolutivo = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      AV12cElem_Consecutivo = "" ;
      lblLbltranfilter_Jsonclick = "" ;
      lblLblinvd_placapadrefilter_Jsonclick = "" ;
      AV20cInvd_PlacaPadre = "" ;
      lblLblfechafilter_Jsonclick = "" ;
      AV17cInvd_FechaAdquisicion = GXutil.nullDate() ;
      lblLblmarcafilter_Jsonclick = "" ;
      AV23cMarca = "" ;
      lblLblmodelofilter_Jsonclick = "" ;
      AV24cModelo = "" ;
      lblLblserialfilter_Jsonclick = "" ;
      AV25cSerial = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      bttAgregarbienes_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV10ADVANCED_LABEL_TEMPLATE = "" ;
      scmdbuf = "" ;
      H006J2_A37Cata_Codigo = new String[] {""} ;
      H006J2_A463Invd_Estado = new String[] {""} ;
      H006J2_n463Invd_Estado = new boolean[] {false} ;
      H006J2_A33Tipo_Codigo = new long[1] ;
      H006J2_A43Cuen_Identificacion = new long[1] ;
      H006J2_n43Cuen_Identificacion = new boolean[] {false} ;
      H006J2_A414Invd_BodegaCodigo = new String[] {""} ;
      H006J2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H006J2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H006J2_A411Invd_CentroCostoId = new long[1] ;
      H006J2_A410Invd_RegionalId = new long[1] ;
      H006J2_A66Elem_Consecutivo = new String[] {""} ;
      H006J2_A298Cata_Descripcion = new String[] {""} ;
      H006J2_A68Invd_PlacaPadre = new String[] {""} ;
      H006J2_n68Invd_PlacaPadre = new boolean[] {false} ;
      H006J2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H006J2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H006J2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006J2_A67Invd_NumeroPlaca = new String[] {""} ;
      A37Cata_Codigo = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int7 = new int [1] ;
      AV44SDTInvDevoSelItem = new com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem(remoteHandle, context);
      AV57Error = "" ;
      GXv_int6 = new long [1] ;
      GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem8 = new GXBaseCollection [1] ;
      H006J3_A67Invd_NumeroPlaca = new String[] {""} ;
      H006J3_A66Elem_Consecutivo = new String[] {""} ;
      H006J3_A463Invd_Estado = new String[] {""} ;
      H006J3_n463Invd_Estado = new boolean[] {false} ;
      H006J4_A46Tran_Id = new long[1] ;
      H006J4_A513Tran_ConsecutivoCC = new long[1] ;
      H006J4_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selecinventariodevolutivo__default(),
         new Object[] {
             new Object[] {
            H006J2_A37Cata_Codigo, H006J2_A463Invd_Estado, H006J2_n463Invd_Estado, H006J2_A33Tipo_Codigo, H006J2_A43Cuen_Identificacion, H006J2_n43Cuen_Identificacion, H006J2_A414Invd_BodegaCodigo, H006J2_A413Invd_AlmacenCodigo, H006J2_A412Invd_ModuloAlmacen, H006J2_A411Invd_CentroCostoId,
            H006J2_A410Invd_RegionalId, H006J2_A66Elem_Consecutivo, H006J2_A298Cata_Descripcion, H006J2_A68Invd_PlacaPadre, H006J2_n68Invd_PlacaPadre, H006J2_A466Invd_FechaAdquisicion, H006J2_n466Invd_FechaAdquisicion, H006J2_A629Costo_Total_Dev, H006J2_A67Invd_NumeroPlaca
            }
            , new Object[] {
            H006J3_A67Invd_NumeroPlaca, H006J3_A66Elem_Consecutivo, H006J3_A463Invd_Estado, H006J3_n463Invd_Estado
            }
            , new Object[] {
            H006J4_A46Tran_Id, H006J4_A513Tran_ConsecutivoCC, H006J4_n513Tran_ConsecutivoCC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtlinvd_numeroplaca_Enabled = 0 ;
      edtavCtltran_consecutivocc_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      edtavCtlcata_descripcion_Enabled = 0 ;
      edtavCtlinvd_placapadre_Enabled = 0 ;
      edtavCtlmarca_Enabled = 0 ;
      edtavCtlmodelo_Enabled = 0 ;
      edtavCtlserial_Enabled = 0 ;
      edtavCtlobservaciones_Enabled = 0 ;
      edtavCtlinvd_fechaadquisicion_Enabled = 0 ;
      edtavCtlcosto_total_dev_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_114 ;
   private short nGXsfl_114_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV65GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_114_fel_idx=1 ;
   private short nGXsfl_114_bak_idx=1 ;
   private int subGrid1_Rows ;
   private int AV39Nro_Linea ;
   private int edtavCinvd_numeroplaca_Visible ;
   private int edtavCinvd_numeroplaca_Enabled ;
   private int edtavCinvd_descripciondevolutivo_Visible ;
   private int edtavCinvd_descripciondevolutivo_Enabled ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCtran_id_Enabled ;
   private int edtavCtran_id_Visible ;
   private int edtavCinvd_placapadre_Visible ;
   private int edtavCinvd_placapadre_Enabled ;
   private int edtavCinvd_fechaadquisicion_Visible ;
   private int edtavCinvd_fechaadquisicion_Enabled ;
   private int edtavCmarca_Visible ;
   private int edtavCmarca_Enabled ;
   private int edtavCmodelo_Visible ;
   private int edtavCmodelo_Enabled ;
   private int edtavCserial_Visible ;
   private int edtavCserial_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlinvd_numeroplaca_Enabled ;
   private int edtavCtltran_consecutivocc_Enabled ;
   private int edtavCtlelem_consecutivo_Enabled ;
   private int edtavCtlcata_descripcion_Enabled ;
   private int edtavCtlinvd_placapadre_Enabled ;
   private int edtavCtlmarca_Enabled ;
   private int edtavCtlmodelo_Enabled ;
   private int edtavCtlserial_Enabled ;
   private int edtavCtlobservaciones_Enabled ;
   private int edtavCtlinvd_fechaadquisicion_Enabled ;
   private int edtavCtlcosto_total_dev_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int GXv_int7[] ;
   private int AV79GXV2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV52Tran_Id ;
   private long wcpOAV9Regi_Id ;
   private long wcpOAV8Cent_Id ;
   private long wcpOAV42Tran_IdCuentadanteOrigen ;
   private long wcpOAV41Tipo_Codigo ;
   private long AV52Tran_Id ;
   private long AV9Regi_Id ;
   private long AV8Cent_Id ;
   private long AV42Tran_IdCuentadanteOrigen ;
   private long AV41Tipo_Codigo ;
   private long GRID1_nFirstRecordOnPage ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long A33Tipo_Codigo ;
   private long AV38Tran_IdEntrada ;
   private long AV62Tran_ConsecutivoCC ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long AV61cTran_Id ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal AV51Costo_Total_Dev ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divInvd_numeroplacafiltercontainer_Class ;
   private String divInvd_descripcionidfiltercontainer_Class ;
   private String divInvd_placapadrefiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divInvd_tranfiltercontainer_Class ;
   private String divInvd_fechafiltercontainer_Class ;
   private String divInvd_marcafiltercontainer_Class ;
   private String divInvd_modelofiltercontainer_Class ;
   private String divInvd_serialfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_114_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divInvd_numeroplacafiltercontainer_Internalname ;
   private String lblLblinvd_numeroplacafilter_Internalname ;
   private String lblLblinvd_numeroplacafilter_Jsonclick ;
   private String edtavCinvd_numeroplaca_Internalname ;
   private String TempTags ;
   private String edtavCinvd_numeroplaca_Jsonclick ;
   private String divInvd_descripcionidfiltercontainer_Internalname ;
   private String lblLblinvd_descripcionidfilter_Internalname ;
   private String lblLblinvd_descripcionidfilter_Jsonclick ;
   private String edtavCinvd_descripciondevolutivo_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divInvd_tranfiltercontainer_Internalname ;
   private String lblLbltranfilter_Internalname ;
   private String lblLbltranfilter_Jsonclick ;
   private String edtavCtran_id_Internalname ;
   private String edtavCtran_id_Jsonclick ;
   private String divInvd_placapadrefiltercontainer_Internalname ;
   private String lblLblinvd_placapadrefilter_Internalname ;
   private String lblLblinvd_placapadrefilter_Jsonclick ;
   private String edtavCinvd_placapadre_Internalname ;
   private String edtavCinvd_placapadre_Jsonclick ;
   private String divInvd_fechafiltercontainer_Internalname ;
   private String lblLblfechafilter_Internalname ;
   private String lblLblfechafilter_Jsonclick ;
   private String edtavCinvd_fechaadquisicion_Internalname ;
   private String edtavCinvd_fechaadquisicion_Jsonclick ;
   private String divInvd_marcafiltercontainer_Internalname ;
   private String lblLblmarcafilter_Internalname ;
   private String lblLblmarcafilter_Jsonclick ;
   private String edtavCmarca_Internalname ;
   private String edtavCmarca_Jsonclick ;
   private String divInvd_modelofiltercontainer_Internalname ;
   private String lblLblmodelofilter_Internalname ;
   private String lblLblmodelofilter_Jsonclick ;
   private String edtavCmodelo_Internalname ;
   private String edtavCmodelo_Jsonclick ;
   private String divInvd_serialfiltercontainer_Internalname ;
   private String lblLblserialfilter_Internalname ;
   private String lblLblserialfilter_Jsonclick ;
   private String edtavCserial_Internalname ;
   private String edtavCserial_Jsonclick ;
   private String divGridtable_Internalname ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String divTable1_Internalname ;
   private String divTable2_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String bttAgregarbienes_Internalname ;
   private String bttAgregarbienes_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavCtlinvd_numeroplaca_Internalname ;
   private String edtavCtltran_consecutivocc_Internalname ;
   private String edtavCtlelem_consecutivo_Internalname ;
   private String edtavCtlcata_descripcion_Internalname ;
   private String edtavCtlinvd_placapadre_Internalname ;
   private String edtavCtlmarca_Internalname ;
   private String edtavCtlmodelo_Internalname ;
   private String edtavCtlserial_Internalname ;
   private String edtavCtlobservaciones_Internalname ;
   private String edtavCtlinvd_fechaadquisicion_Internalname ;
   private String edtavCtlcosto_total_dev_Internalname ;
   private String sGXsfl_114_fel_idx="0001" ;
   private String AV10ADVANCED_LABEL_TEMPLATE ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV57Error ;
   private String Alertify1_Internalname ;
   private String ROClassString ;
   private String edtavCtlinvd_numeroplaca_Jsonclick ;
   private String edtavCtltran_consecutivocc_Jsonclick ;
   private String edtavCtlelem_consecutivo_Jsonclick ;
   private String edtavCtlcata_descripcion_Jsonclick ;
   private String edtavCtlinvd_placapadre_Jsonclick ;
   private String edtavCtlmarca_Jsonclick ;
   private String edtavCtlmodelo_Jsonclick ;
   private String edtavCtlserial_Jsonclick ;
   private String edtavCtlobservaciones_Jsonclick ;
   private String edtavCtlinvd_fechaadquisicion_Jsonclick ;
   private String edtavCtlcosto_total_dev_Jsonclick ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date AV50Invd_FechaAdquisicion ;
   private java.util.Date AV17cInvd_FechaAdquisicion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean AV56Todos ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_114_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV114 ;
   private boolean n463Invd_Estado ;
   private boolean n43Cuen_Identificacion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n513Tran_ConsecutivoCC ;
   private String AV16cInvd_DescripcionDevolutivo ;
   private String wcpOAV6Alma_Modulo ;
   private String wcpOAV5Alma_Codigo ;
   private String wcpOAV7Bode_Codigo ;
   private String AV6Alma_Modulo ;
   private String AV5Alma_Codigo ;
   private String AV7Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String AV60VerConsecutivo ;
   private String AV59VerPlaca ;
   private String A463Invd_Estado ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A298Cata_Descripcion ;
   private String A68Invd_PlacaPadre ;
   private String AV28Marca ;
   private String AV29Modelo ;
   private String AV35Serial ;
   private String AV30Observaciones ;
   private String AV45Invd_NumeroPlaca ;
   private String AV47Elem_consecutivo ;
   private String AV48Descripcion ;
   private String AV49Invd_PlacaPadre ;
   private String AV19cInvd_NumeroPlaca ;
   private String AV12cElem_Consecutivo ;
   private String AV20cInvd_PlacaPadre ;
   private String AV23cMarca ;
   private String AV24cModelo ;
   private String AV25cSerial ;
   private String A37Cata_Codigo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkavTodos ;
   private ICheckbox chkavCtlinvd_seleccion ;
   private IDataStoreProvider pr_default ;
   private String[] H006J2_A37Cata_Codigo ;
   private String[] H006J2_A463Invd_Estado ;
   private boolean[] H006J2_n463Invd_Estado ;
   private long[] H006J2_A33Tipo_Codigo ;
   private long[] H006J2_A43Cuen_Identificacion ;
   private boolean[] H006J2_n43Cuen_Identificacion ;
   private String[] H006J2_A414Invd_BodegaCodigo ;
   private String[] H006J2_A413Invd_AlmacenCodigo ;
   private String[] H006J2_A412Invd_ModuloAlmacen ;
   private long[] H006J2_A411Invd_CentroCostoId ;
   private long[] H006J2_A410Invd_RegionalId ;
   private String[] H006J2_A66Elem_Consecutivo ;
   private String[] H006J2_A298Cata_Descripcion ;
   private String[] H006J2_A68Invd_PlacaPadre ;
   private boolean[] H006J2_n68Invd_PlacaPadre ;
   private java.util.Date[] H006J2_A466Invd_FechaAdquisicion ;
   private boolean[] H006J2_n466Invd_FechaAdquisicion ;
   private java.math.BigDecimal[] H006J2_A629Costo_Total_Dev ;
   private String[] H006J2_A67Invd_NumeroPlaca ;
   private String[] H006J3_A67Invd_NumeroPlaca ;
   private String[] H006J3_A66Elem_Consecutivo ;
   private String[] H006J3_A463Invd_Estado ;
   private boolean[] H006J3_n463Invd_Estado ;
   private long[] H006J4_A46Tran_Id ;
   private long[] H006J4_A513Tran_ConsecutivoCC ;
   private boolean[] H006J4_n513Tran_ConsecutivoCC ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> AV43SDTInvDevoSel ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> GXv_objcol_SdtSDTInvDevoSel_SDTInvDevoSelItem8[] ;
   private com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem AV44SDTInvDevoSelItem ;
}

final  class selecinventariodevolutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006J2", "SELECT T2.Cata_Codigo, T1.Invd_Estado, T2.Tipo_Codigo, T1.Cuen_Identificacion, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Invd_RegionalId, T1.Elem_Consecutivo, T3.Cata_Descripcion, T1.Invd_PlacaPadre, T1.Invd_FechaAdquisicion, T1.Costo_Total_Dev, T1.Invd_NumeroPlaca FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE (T1.Invd_RegionalId = ? and T1.Invd_CentroCostoId = ? and T1.Invd_ModuloAlmacen = ? and T1.Invd_AlmacenCodigo = ? and T1.Invd_BodegaCodigo = ? and T1.Cuen_Identificacion = ? and T1.Invd_Estado = 'R') AND (T2.Tipo_Codigo = ?) ORDER BY T1.Invd_RegionalId, T1.Invd_CentroCostoId, T1.Invd_ModuloAlmacen, T1.Invd_AlmacenCodigo, T1.Invd_BodegaCodigo, T1.Cuen_Identificacion, T1.Invd_Estado, T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006J3", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006J4", "SELECT Tran_Id, Tran_ConsecutivoCC FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,2) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(15) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setBigDecimal(7, ((Number) parms[6]).longValue(), 0);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

